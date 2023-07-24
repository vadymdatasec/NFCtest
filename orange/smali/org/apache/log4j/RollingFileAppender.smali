.class public Lorg/apache/log4j/RollingFileAppender;
.super Lorg/apache/log4j/FileAppender;
.source "SourceFile"


# instance fields
.field public o:J

.field public p:I

.field public q:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lorg/apache/log4j/FileAppender;-><init>()V

    const-wide/32 v0, 0xa00000

    .line 2
    iput-wide v0, p0, Lorg/apache/log4j/RollingFileAppender;->o:J

    const/4 v0, 0x1

    .line 3
    iput v0, p0, Lorg/apache/log4j/RollingFileAppender;->p:I

    const-wide/16 v0, 0x0

    .line 4
    iput-wide v0, p0, Lorg/apache/log4j/RollingFileAppender;->q:J

    return-void
.end method

.method public constructor <init>(Lorg/apache/log4j/Layout;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 9
    invoke-direct {p0, p1, p2}, Lorg/apache/log4j/FileAppender;-><init>(Lorg/apache/log4j/Layout;Ljava/lang/String;)V

    const-wide/32 p1, 0xa00000

    .line 10
    iput-wide p1, p0, Lorg/apache/log4j/RollingFileAppender;->o:J

    const/4 p1, 0x1

    .line 11
    iput p1, p0, Lorg/apache/log4j/RollingFileAppender;->p:I

    const-wide/16 p1, 0x0

    .line 12
    iput-wide p1, p0, Lorg/apache/log4j/RollingFileAppender;->q:J

    return-void
.end method

.method public constructor <init>(Lorg/apache/log4j/Layout;Ljava/lang/String;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 5
    invoke-direct {p0, p1, p2, p3}, Lorg/apache/log4j/FileAppender;-><init>(Lorg/apache/log4j/Layout;Ljava/lang/String;Z)V

    const-wide/32 p1, 0xa00000

    .line 6
    iput-wide p1, p0, Lorg/apache/log4j/RollingFileAppender;->o:J

    const/4 p1, 0x1

    .line 7
    iput p1, p0, Lorg/apache/log4j/RollingFileAppender;->p:I

    const-wide/16 p1, 0x0

    .line 8
    iput-wide p1, p0, Lorg/apache/log4j/RollingFileAppender;->q:J

    return-void
.end method


# virtual methods
.method public a(Ljava/io/Writer;)V
    .locals 2

    .line 1
    new-instance v0, Lorg/apache/log4j/helpers/CountingQuietWriter;

    iget-object v1, p0, Lorg/apache/log4j/AppenderSkeleton;->d:Lorg/apache/log4j/spi/ErrorHandler;

    invoke-direct {v0, p1, v1}, Lorg/apache/log4j/helpers/CountingQuietWriter;-><init>(Ljava/io/Writer;Lorg/apache/log4j/spi/ErrorHandler;)V

    iput-object v0, p0, Lorg/apache/log4j/WriterAppender;->j:Lorg/apache/log4j/helpers/QuietWriter;

    return-void
.end method

.method public b(Lorg/apache/log4j/spi/LoggingEvent;)V
    .locals 4

    .line 1
    invoke-super {p0, p1}, Lorg/apache/log4j/WriterAppender;->b(Lorg/apache/log4j/spi/LoggingEvent;)V

    .line 2
    iget-object p1, p0, Lorg/apache/log4j/FileAppender;->l:Ljava/lang/String;

    if-eqz p1, :cond_0

    iget-object p1, p0, Lorg/apache/log4j/WriterAppender;->j:Lorg/apache/log4j/helpers/QuietWriter;

    if-eqz p1, :cond_0

    .line 3
    check-cast p1, Lorg/apache/log4j/helpers/CountingQuietWriter;

    invoke-virtual {p1}, Lorg/apache/log4j/helpers/CountingQuietWriter;->getCount()J

    move-result-wide v0

    .line 4
    iget-wide v2, p0, Lorg/apache/log4j/RollingFileAppender;->o:J

    cmp-long p1, v0, v2

    if-ltz p1, :cond_0

    iget-wide v2, p0, Lorg/apache/log4j/RollingFileAppender;->q:J

    cmp-long p1, v0, v2

    if-ltz p1, :cond_0

    .line 5
    invoke-virtual {p0}, Lorg/apache/log4j/RollingFileAppender;->rollOver()V

    :cond_0
    return-void
.end method

.method public getMaxBackupIndex()I
    .locals 1

    .line 1
    iget v0, p0, Lorg/apache/log4j/RollingFileAppender;->p:I

    return v0
.end method

.method public getMaximumFileSize()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lorg/apache/log4j/RollingFileAppender;->o:J

    return-wide v0
.end method

.method public rollOver()V
    .locals 11

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/WriterAppender;->j:Lorg/apache/log4j/helpers/QuietWriter;

    if-eqz v0, :cond_0

    .line 2
    check-cast v0, Lorg/apache/log4j/helpers/CountingQuietWriter;

    invoke-virtual {v0}, Lorg/apache/log4j/helpers/CountingQuietWriter;->getCount()J

    move-result-wide v0

    .line 3
    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    const-string v3, "rolling over count="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lorg/apache/log4j/helpers/LogLog;->debug(Ljava/lang/String;)V

    .line 4
    iget-wide v2, p0, Lorg/apache/log4j/RollingFileAppender;->o:J

    add-long/2addr v0, v2

    iput-wide v0, p0, Lorg/apache/log4j/RollingFileAppender;->q:J

    .line 5
    :cond_0
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    const-string v1, "maxBackupIndex="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget v1, p0, Lorg/apache/log4j/RollingFileAppender;->p:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lorg/apache/log4j/helpers/LogLog;->debug(Ljava/lang/String;)V

    .line 6
    iget v0, p0, Lorg/apache/log4j/RollingFileAppender;->p:I

    const-string v1, "setFile("

    const/4 v2, 0x1

    if-lez v0, :cond_6

    .line 7
    new-instance v0, Ljava/io/File;

    new-instance v3, Ljava/lang/StringBuffer;

    invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V

    iget-object v4, p0, Lorg/apache/log4j/FileAppender;->l:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const/16 v4, 0x2e

    invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    iget v5, p0, Lorg/apache/log4j/RollingFileAppender;->p:I

    invoke-virtual {v3, v5}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 8
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 9
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    move-result v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    .line 10
    :goto_0
    iget v3, p0, Lorg/apache/log4j/RollingFileAppender;->p:I

    sub-int/2addr v3, v2

    :goto_1
    const-string v5, " to "

    const-string v6, "Renaming file "

    const-string v7, "."

    if-lt v3, v2, :cond_3

    if-eqz v0, :cond_3

    .line 11
    new-instance v8, Ljava/io/File;

    new-instance v9, Ljava/lang/StringBuffer;

    invoke-direct {v9}, Ljava/lang/StringBuffer;-><init>()V

    iget-object v10, p0, Lorg/apache/log4j/FileAppender;->l:Ljava/lang/String;

    invoke-virtual {v9, v10}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v9, v3}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    invoke-virtual {v9}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v8, v7}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 12
    invoke-virtual {v8}, Ljava/io/File;->exists()Z

    move-result v7

    if-eqz v7, :cond_2

    .line 13
    new-instance v0, Ljava/io/File;

    new-instance v7, Ljava/lang/StringBuffer;

    invoke-direct {v7}, Ljava/lang/StringBuffer;-><init>()V

    iget-object v9, p0, Lorg/apache/log4j/FileAppender;->l:Ljava/lang/String;

    invoke-virtual {v7, v9}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    add-int/lit8 v9, v3, 0x1

    invoke-virtual {v7, v9}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    invoke-virtual {v7}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v0, v7}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 14
    new-instance v7, Ljava/lang/StringBuffer;

    invoke-direct {v7}, Ljava/lang/StringBuffer;-><init>()V

    invoke-virtual {v7, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v7, v8}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v7, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    invoke-virtual {v7}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lorg/apache/log4j/helpers/LogLog;->debug(Ljava/lang/String;)V

    .line 15
    invoke-virtual {v8, v0}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result v0

    :cond_2
    add-int/lit8 v3, v3, -0x1

    goto :goto_1

    :cond_3
    if-eqz v0, :cond_5

    .line 16
    new-instance v0, Ljava/io/File;

    new-instance v3, Ljava/lang/StringBuffer;

    invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V

    iget-object v4, p0, Lorg/apache/log4j/FileAppender;->l:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v3, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 17
    invoke-virtual {p0}, Lorg/apache/log4j/FileAppender;->f()V

    .line 18
    new-instance v3, Ljava/io/File;

    iget-object v4, p0, Lorg/apache/log4j/FileAppender;->l:Ljava/lang/String;

    invoke-direct {v3, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 19
    new-instance v4, Ljava/lang/StringBuffer;

    invoke-direct {v4}, Ljava/lang/StringBuffer;-><init>()V

    invoke-virtual {v4, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    invoke-virtual {v4}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lorg/apache/log4j/helpers/LogLog;->debug(Ljava/lang/String;)V

    .line 20
    invoke-virtual {v3, v0}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 21
    :try_start_0
    iget-object v3, p0, Lorg/apache/log4j/FileAppender;->l:Ljava/lang/String;

    iget-boolean v4, p0, Lorg/apache/log4j/FileAppender;->m:Z

    iget v5, p0, Lorg/apache/log4j/FileAppender;->n:I

    invoke-virtual {p0, v3, v2, v4, v5}, Lorg/apache/log4j/RollingFileAppender;->setFile(Ljava/lang/String;ZZI)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v2

    .line 22
    instance-of v3, v2, Ljava/io/InterruptedIOException;

    if-eqz v3, :cond_4

    .line 23
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Thread;->interrupt()V

    .line 24
    :cond_4
    new-instance v3, Ljava/lang/StringBuffer;

    invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v4, p0, Lorg/apache/log4j/FileAppender;->l:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v4, ", true) call failed."

    invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v2}, Lorg/apache/log4j/helpers/LogLog;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_5
    :goto_2
    move v2, v0

    :cond_6
    if-eqz v2, :cond_8

    .line 25
    :try_start_1
    iget-object v0, p0, Lorg/apache/log4j/FileAppender;->l:Ljava/lang/String;

    const/4 v2, 0x0

    iget-boolean v3, p0, Lorg/apache/log4j/FileAppender;->m:Z

    iget v4, p0, Lorg/apache/log4j/FileAppender;->n:I

    invoke-virtual {p0, v0, v2, v3, v4}, Lorg/apache/log4j/RollingFileAppender;->setFile(Ljava/lang/String;ZZI)V

    const-wide/16 v2, 0x0

    .line 26
    iput-wide v2, p0, Lorg/apache/log4j/RollingFileAppender;->q:J
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_3

    :catch_1
    move-exception v0

    .line 27
    instance-of v2, v0, Ljava/io/InterruptedIOException;

    if-eqz v2, :cond_7

    .line 28
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Thread;->interrupt()V

    .line 29
    :cond_7
    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v1, p0, Lorg/apache/log4j/FileAppender;->l:Ljava/lang/String;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v1, ", false) call failed."

    invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lorg/apache/log4j/helpers/LogLog;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_8
    :goto_3
    return-void
.end method

.method public declared-synchronized setFile(Ljava/lang/String;ZZI)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    monitor-enter p0

    .line 1
    :try_start_0
    iget-boolean p3, p0, Lorg/apache/log4j/FileAppender;->m:Z

    iget p4, p0, Lorg/apache/log4j/FileAppender;->n:I

    invoke-super {p0, p1, p2, p3, p4}, Lorg/apache/log4j/FileAppender;->setFile(Ljava/lang/String;ZZI)V

    if-eqz p2, :cond_0

    .line 2
    new-instance p2, Ljava/io/File;

    invoke-direct {p2, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 3
    iget-object p1, p0, Lorg/apache/log4j/WriterAppender;->j:Lorg/apache/log4j/helpers/QuietWriter;

    check-cast p1, Lorg/apache/log4j/helpers/CountingQuietWriter;

    invoke-virtual {p2}, Ljava/io/File;->length()J

    move-result-wide p2

    invoke-virtual {p1, p2, p3}, Lorg/apache/log4j/helpers/CountingQuietWriter;->setCount(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public setMaxBackupIndex(I)V
    .locals 0

    .line 1
    iput p1, p0, Lorg/apache/log4j/RollingFileAppender;->p:I

    return-void
.end method

.method public setMaxFileSize(Ljava/lang/String;)V
    .locals 4

    .line 1
    iget-wide v0, p0, Lorg/apache/log4j/RollingFileAppender;->o:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    invoke-static {p1, v0, v1}, Lorg/apache/log4j/helpers/OptionConverter;->toFileSize(Ljava/lang/String;J)J

    move-result-wide v0

    iput-wide v0, p0, Lorg/apache/log4j/RollingFileAppender;->o:J

    return-void
.end method

.method public setMaximumFileSize(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lorg/apache/log4j/RollingFileAppender;->o:J

    return-void
.end method
