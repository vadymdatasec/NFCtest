.class public Lorg/apache/log4j/WriterAppender;
.super Lorg/apache/log4j/AppenderSkeleton;
.source "SourceFile"


# instance fields
.field public h:Z

.field public i:Ljava/lang/String;

.field public j:Lorg/apache/log4j/helpers/QuietWriter;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lorg/apache/log4j/AppenderSkeleton;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lorg/apache/log4j/WriterAppender;->h:Z

    return-void
.end method

.method public constructor <init>(Lorg/apache/log4j/Layout;Ljava/io/OutputStream;)V
    .locals 1

    .line 3
    new-instance v0, Ljava/io/OutputStreamWriter;

    invoke-direct {v0, p2}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;)V

    invoke-direct {p0, p1, v0}, Lorg/apache/log4j/WriterAppender;-><init>(Lorg/apache/log4j/Layout;Ljava/io/Writer;)V

    return-void
.end method

.method public constructor <init>(Lorg/apache/log4j/Layout;Ljava/io/Writer;)V
    .locals 1

    .line 4
    invoke-direct {p0}, Lorg/apache/log4j/AppenderSkeleton;-><init>()V

    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lorg/apache/log4j/WriterAppender;->h:Z

    .line 6
    iput-object p1, p0, Lorg/apache/log4j/AppenderSkeleton;->a:Lorg/apache/log4j/Layout;

    .line 7
    invoke-virtual {p0, p2}, Lorg/apache/log4j/WriterAppender;->setWriter(Ljava/io/Writer;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/io/OutputStream;)Ljava/io/OutputStreamWriter;
    .locals 2

    .line 7
    invoke-virtual {p0}, Lorg/apache/log4j/WriterAppender;->getEncoding()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 8
    :try_start_0
    new-instance v1, Ljava/io/OutputStreamWriter;

    invoke-direct {v1, p1, v0}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 9
    instance-of v0, v0, Ljava/io/InterruptedIOException;

    if-eqz v0, :cond_0

    .line 10
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    :cond_0
    const-string v0, "Error initializing output writer."

    .line 11
    invoke-static {v0}, Lorg/apache/log4j/helpers/LogLog;->warn(Ljava/lang/String;)V

    const-string v0, "Unsupported encoding?"

    .line 12
    invoke-static {v0}, Lorg/apache/log4j/helpers/LogLog;->warn(Ljava/lang/String;)V

    :cond_1
    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_2

    .line 13
    new-instance v1, Ljava/io/OutputStreamWriter;

    invoke-direct {v1, p1}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;)V

    :cond_2
    return-object v1
.end method

.method public a()Z
    .locals 5

    .line 1
    iget-boolean v0, p0, Lorg/apache/log4j/AppenderSkeleton;->g:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const-string v0, "Not allowed to write to a closed appender."

    .line 2
    invoke-static {v0}, Lorg/apache/log4j/helpers/LogLog;->warn(Ljava/lang/String;)V

    return v1

    .line 3
    :cond_0
    iget-object v0, p0, Lorg/apache/log4j/WriterAppender;->j:Lorg/apache/log4j/helpers/QuietWriter;

    const-string v2, "]."

    if-nez v0, :cond_1

    .line 4
    iget-object v0, p0, Lorg/apache/log4j/AppenderSkeleton;->d:Lorg/apache/log4j/spi/ErrorHandler;

    new-instance v3, Ljava/lang/StringBuffer;

    invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V

    const-string v4, "No output stream or file set for the appender named ["

    invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v4, p0, Lorg/apache/log4j/AppenderSkeleton;->b:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Lorg/apache/log4j/spi/ErrorHandler;->error(Ljava/lang/String;)V

    return v1

    .line 5
    :cond_1
    iget-object v0, p0, Lorg/apache/log4j/AppenderSkeleton;->a:Lorg/apache/log4j/Layout;

    if-nez v0, :cond_2

    .line 6
    iget-object v0, p0, Lorg/apache/log4j/AppenderSkeleton;->d:Lorg/apache/log4j/spi/ErrorHandler;

    new-instance v3, Ljava/lang/StringBuffer;

    invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V

    const-string v4, "No layout set for the appender named ["

    invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v4, p0, Lorg/apache/log4j/AppenderSkeleton;->b:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Lorg/apache/log4j/spi/ErrorHandler;->error(Ljava/lang/String;)V

    return v1

    :cond_2
    const/4 v0, 0x1

    return v0
.end method

.method public a(Lorg/apache/log4j/spi/LoggingEvent;)Z
    .locals 0

    .line 14
    iget-boolean p1, p0, Lorg/apache/log4j/WriterAppender;->h:Z

    return p1
.end method

.method public activateOptions()V
    .locals 0

    return-void
.end method

.method public append(Lorg/apache/log4j/spi/LoggingEvent;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lorg/apache/log4j/WriterAppender;->a()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {p0, p1}, Lorg/apache/log4j/WriterAppender;->b(Lorg/apache/log4j/spi/LoggingEvent;)V

    return-void
.end method

.method public b()V
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/WriterAppender;->j:Lorg/apache/log4j/helpers/QuietWriter;

    if-eqz v0, :cond_1

    .line 2
    :try_start_0
    invoke-virtual {v0}, Ljava/io/FilterWriter;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 3
    instance-of v1, v0, Ljava/io/InterruptedIOException;

    if-eqz v1, :cond_0

    .line 4
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    .line 5
    :cond_0
    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    const-string v2, "Could not close "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v2, p0, Lorg/apache/log4j/WriterAppender;->j:Lorg/apache/log4j/helpers/QuietWriter;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lorg/apache/log4j/helpers/LogLog;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public b(Lorg/apache/log4j/spi/LoggingEvent;)V
    .locals 5

    .line 6
    iget-object v0, p0, Lorg/apache/log4j/WriterAppender;->j:Lorg/apache/log4j/helpers/QuietWriter;

    iget-object v1, p0, Lorg/apache/log4j/AppenderSkeleton;->a:Lorg/apache/log4j/Layout;

    invoke-virtual {v1, p1}, Lorg/apache/log4j/Layout;->format(Lorg/apache/log4j/spi/LoggingEvent;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/apache/log4j/helpers/QuietWriter;->write(Ljava/lang/String;)V

    .line 7
    iget-object v0, p0, Lorg/apache/log4j/AppenderSkeleton;->a:Lorg/apache/log4j/Layout;

    invoke-virtual {v0}, Lorg/apache/log4j/Layout;->ignoresThrowable()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 8
    invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getThrowableStrRep()[Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 9
    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    .line 10
    iget-object v3, p0, Lorg/apache/log4j/WriterAppender;->j:Lorg/apache/log4j/helpers/QuietWriter;

    aget-object v4, v0, v2

    invoke-virtual {v3, v4}, Lorg/apache/log4j/helpers/QuietWriter;->write(Ljava/lang/String;)V

    .line 11
    iget-object v3, p0, Lorg/apache/log4j/WriterAppender;->j:Lorg/apache/log4j/helpers/QuietWriter;

    sget-object v4, Lorg/apache/log4j/Layout;->LINE_SEP:Ljava/lang/String;

    invoke-virtual {v3, v4}, Lorg/apache/log4j/helpers/QuietWriter;->write(Ljava/lang/String;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {p0, p1}, Lorg/apache/log4j/WriterAppender;->a(Lorg/apache/log4j/spi/LoggingEvent;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 13
    iget-object p1, p0, Lorg/apache/log4j/WriterAppender;->j:Lorg/apache/log4j/helpers/QuietWriter;

    invoke-virtual {p1}, Lorg/apache/log4j/helpers/QuietWriter;->flush()V

    :cond_1
    return-void
.end method

.method public c()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lorg/apache/log4j/WriterAppender;->b()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lorg/apache/log4j/WriterAppender;->j:Lorg/apache/log4j/helpers/QuietWriter;

    return-void
.end method

.method public declared-synchronized close()V
    .locals 1

    monitor-enter p0

    .line 1
    :try_start_0
    iget-boolean v0, p0, Lorg/apache/log4j/AppenderSkeleton;->g:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    .line 2
    monitor-exit p0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 3
    :try_start_1
    iput-boolean v0, p0, Lorg/apache/log4j/AppenderSkeleton;->g:Z

    .line 4
    invoke-virtual {p0}, Lorg/apache/log4j/WriterAppender;->d()V

    .line 5
    invoke-virtual {p0}, Lorg/apache/log4j/WriterAppender;->c()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 6
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public d()V
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/AppenderSkeleton;->a:Lorg/apache/log4j/Layout;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lorg/apache/log4j/Layout;->getFooter()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v1, p0, Lorg/apache/log4j/WriterAppender;->j:Lorg/apache/log4j/helpers/QuietWriter;

    if-eqz v1, :cond_0

    .line 4
    invoke-virtual {v1, v0}, Lorg/apache/log4j/helpers/QuietWriter;->write(Ljava/lang/String;)V

    .line 5
    iget-object v0, p0, Lorg/apache/log4j/WriterAppender;->j:Lorg/apache/log4j/helpers/QuietWriter;

    invoke-virtual {v0}, Lorg/apache/log4j/helpers/QuietWriter;->flush()V

    :cond_0
    return-void
.end method

.method public e()V
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/AppenderSkeleton;->a:Lorg/apache/log4j/Layout;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lorg/apache/log4j/Layout;->getHeader()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v1, p0, Lorg/apache/log4j/WriterAppender;->j:Lorg/apache/log4j/helpers/QuietWriter;

    if-eqz v1, :cond_0

    .line 4
    invoke-virtual {v1, v0}, Lorg/apache/log4j/helpers/QuietWriter;->write(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public getEncoding()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/WriterAppender;->i:Ljava/lang/String;

    return-object v0
.end method

.method public getImmediateFlush()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lorg/apache/log4j/WriterAppender;->h:Z

    return v0
.end method

.method public requiresLayout()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public setEncoding(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/apache/log4j/WriterAppender;->i:Ljava/lang/String;

    return-void
.end method

.method public declared-synchronized setErrorHandler(Lorg/apache/log4j/spi/ErrorHandler;)V
    .locals 1

    monitor-enter p0

    if-nez p1, :cond_0

    :try_start_0
    const-string p1, "You have tried to set a null error-handler."

    .line 1
    invoke-static {p1}, Lorg/apache/log4j/helpers/LogLog;->warn(Ljava/lang/String;)V

    goto :goto_0

    .line 2
    :cond_0
    iput-object p1, p0, Lorg/apache/log4j/AppenderSkeleton;->d:Lorg/apache/log4j/spi/ErrorHandler;

    .line 3
    iget-object v0, p0, Lorg/apache/log4j/WriterAppender;->j:Lorg/apache/log4j/helpers/QuietWriter;

    if-eqz v0, :cond_1

    .line 4
    iget-object v0, p0, Lorg/apache/log4j/WriterAppender;->j:Lorg/apache/log4j/helpers/QuietWriter;

    invoke-virtual {v0, p1}, Lorg/apache/log4j/helpers/QuietWriter;->setErrorHandler(Lorg/apache/log4j/spi/ErrorHandler;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    :cond_1
    :goto_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public setImmediateFlush(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lorg/apache/log4j/WriterAppender;->h:Z

    return-void
.end method

.method public declared-synchronized setWriter(Ljava/io/Writer;)V
    .locals 2

    monitor-enter p0

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lorg/apache/log4j/WriterAppender;->c()V

    .line 2
    new-instance v0, Lorg/apache/log4j/helpers/QuietWriter;

    iget-object v1, p0, Lorg/apache/log4j/AppenderSkeleton;->d:Lorg/apache/log4j/spi/ErrorHandler;

    invoke-direct {v0, p1, v1}, Lorg/apache/log4j/helpers/QuietWriter;-><init>(Ljava/io/Writer;Lorg/apache/log4j/spi/ErrorHandler;)V

    iput-object v0, p0, Lorg/apache/log4j/WriterAppender;->j:Lorg/apache/log4j/helpers/QuietWriter;

    .line 3
    invoke-virtual {p0}, Lorg/apache/log4j/WriterAppender;->e()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
