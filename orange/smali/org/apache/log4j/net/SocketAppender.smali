.class public Lorg/apache/log4j/net/SocketAppender;
.super Lorg/apache/log4j/AppenderSkeleton;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/apache/log4j/net/SocketAppender$a;
    }
.end annotation


# static fields
.field public static final DEFAULT_PORT:I = 0x11d0

.field public static final ZONE:Ljava/lang/String; = "_log4j_obj_tcpconnect_appender.local."


# instance fields
.field public h:Ljava/lang/String;

.field public i:Ljava/net/InetAddress;

.field public j:I

.field public k:Ljava/io/ObjectOutputStream;

.field public l:I

.field public m:Z

.field public n:Ljava/lang/String;

.field public o:Lorg/apache/log4j/net/SocketAppender$a;

.field public p:I

.field public q:Z

.field public r:Lorg/apache/log4j/net/ZeroConfSupport;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lorg/apache/log4j/AppenderSkeleton;-><init>()V

    const/16 v0, 0x11d0

    .line 2
    iput v0, p0, Lorg/apache/log4j/net/SocketAppender;->j:I

    const/16 v0, 0x7530

    .line 3
    iput v0, p0, Lorg/apache/log4j/net/SocketAppender;->l:I

    const/4 v0, 0x0

    .line 4
    iput-boolean v0, p0, Lorg/apache/log4j/net/SocketAppender;->m:Z

    .line 5
    iput v0, p0, Lorg/apache/log4j/net/SocketAppender;->p:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    .line 15
    invoke-direct {p0}, Lorg/apache/log4j/AppenderSkeleton;-><init>()V

    const/16 v0, 0x11d0

    .line 16
    iput v0, p0, Lorg/apache/log4j/net/SocketAppender;->j:I

    const/16 v0, 0x7530

    .line 17
    iput v0, p0, Lorg/apache/log4j/net/SocketAppender;->l:I

    const/4 v0, 0x0

    .line 18
    iput-boolean v0, p0, Lorg/apache/log4j/net/SocketAppender;->m:Z

    .line 19
    iput v0, p0, Lorg/apache/log4j/net/SocketAppender;->p:I

    .line 20
    iput p2, p0, Lorg/apache/log4j/net/SocketAppender;->j:I

    .line 21
    invoke-static {p1}, Lorg/apache/log4j/net/SocketAppender;->a(Ljava/lang/String;)Ljava/net/InetAddress;

    move-result-object v0

    iput-object v0, p0, Lorg/apache/log4j/net/SocketAppender;->i:Ljava/net/InetAddress;

    .line 22
    iput-object p1, p0, Lorg/apache/log4j/net/SocketAppender;->h:Ljava/lang/String;

    .line 23
    invoke-virtual {p0, v0, p2}, Lorg/apache/log4j/net/SocketAppender;->a(Ljava/net/InetAddress;I)V

    return-void
.end method

.method public constructor <init>(Ljava/net/InetAddress;I)V
    .locals 1

    .line 6
    invoke-direct {p0}, Lorg/apache/log4j/AppenderSkeleton;-><init>()V

    const/16 v0, 0x11d0

    .line 7
    iput v0, p0, Lorg/apache/log4j/net/SocketAppender;->j:I

    const/16 v0, 0x7530

    .line 8
    iput v0, p0, Lorg/apache/log4j/net/SocketAppender;->l:I

    const/4 v0, 0x0

    .line 9
    iput-boolean v0, p0, Lorg/apache/log4j/net/SocketAppender;->m:Z

    .line 10
    iput v0, p0, Lorg/apache/log4j/net/SocketAppender;->p:I

    .line 11
    iput-object p1, p0, Lorg/apache/log4j/net/SocketAppender;->i:Ljava/net/InetAddress;

    .line 12
    invoke-virtual {p1}, Ljava/net/InetAddress;->getHostName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/apache/log4j/net/SocketAppender;->h:Ljava/lang/String;

    .line 13
    iput p2, p0, Lorg/apache/log4j/net/SocketAppender;->j:I

    .line 14
    invoke-virtual {p0, p1, p2}, Lorg/apache/log4j/net/SocketAppender;->a(Ljava/net/InetAddress;I)V

    return-void
.end method

.method public static a(Ljava/lang/String;)Ljava/net/InetAddress;
    .locals 3

    .line 20
    :try_start_0
    invoke-static {p0}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception v0

    .line 21
    instance-of v1, v0, Ljava/io/InterruptedIOException;

    if-nez v1, :cond_0

    instance-of v1, v0, Ljava/lang/InterruptedException;

    if-eqz v1, :cond_1

    .line 22
    :cond_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    .line 23
    :cond_1
    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    const-string v2, "Could not find address of ["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string p0, "]."

    invoke-virtual {v1, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v0}, Lorg/apache/log4j/helpers/LogLog;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method public static synthetic a(Lorg/apache/log4j/net/SocketAppender;Lorg/apache/log4j/net/SocketAppender$a;)Lorg/apache/log4j/net/SocketAppender$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/apache/log4j/net/SocketAppender;->o:Lorg/apache/log4j/net/SocketAppender$a;

    return-object p1
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 14
    iget-object v0, p0, Lorg/apache/log4j/net/SocketAppender;->o:Lorg/apache/log4j/net/SocketAppender$a;

    if-nez v0, :cond_0

    const-string v0, "Starting a new connector thread."

    .line 15
    invoke-static {v0}, Lorg/apache/log4j/helpers/LogLog;->debug(Ljava/lang/String;)V

    .line 16
    new-instance v0, Lorg/apache/log4j/net/SocketAppender$a;

    invoke-direct {v0, p0}, Lorg/apache/log4j/net/SocketAppender$a;-><init>(Lorg/apache/log4j/net/SocketAppender;)V

    iput-object v0, p0, Lorg/apache/log4j/net/SocketAppender;->o:Lorg/apache/log4j/net/SocketAppender$a;

    const/4 v1, 0x1

    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/Thread;->setDaemon(Z)V

    .line 18
    iget-object v0, p0, Lorg/apache/log4j/net/SocketAppender;->o:Lorg/apache/log4j/net/SocketAppender$a;

    invoke-virtual {v0, v1}, Ljava/lang/Thread;->setPriority(I)V

    .line 19
    iget-object v0, p0, Lorg/apache/log4j/net/SocketAppender;->o:Lorg/apache/log4j/net/SocketAppender$a;

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    :cond_0
    return-void
.end method

.method public a(Ljava/net/InetAddress;I)V
    .locals 2

    .line 2
    iget-object v0, p0, Lorg/apache/log4j/net/SocketAppender;->i:Ljava/net/InetAddress;

    if-nez v0, :cond_0

    return-void

    .line 3
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Lorg/apache/log4j/net/SocketAppender;->cleanUp()V

    .line 4
    new-instance v0, Ljava/io/ObjectOutputStream;

    new-instance v1, Ljava/net/Socket;

    invoke-direct {v1, p1, p2}, Ljava/net/Socket;-><init>(Ljava/net/InetAddress;I)V

    invoke-virtual {v1}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;

    move-result-object p2

    invoke-direct {v0, p2}, Ljava/io/ObjectOutputStream;-><init>(Ljava/io/OutputStream;)V

    iput-object v0, p0, Lorg/apache/log4j/net/SocketAppender;->k:Ljava/io/ObjectOutputStream;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p2

    .line 5
    instance-of v0, p2, Ljava/io/InterruptedIOException;

    if-eqz v0, :cond_1

    .line 6
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 7
    :cond_1
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    const-string v1, "Could not connect to remote log4j server at ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p1}, Ljava/net/InetAddress;->getHostName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string p1, "]."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    .line 8
    iget v0, p0, Lorg/apache/log4j/net/SocketAppender;->l:I

    if-lez v0, :cond_2

    .line 9
    new-instance p2, Ljava/lang/StringBuffer;

    invoke-direct {p2}, Ljava/lang/StringBuffer;-><init>()V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string p1, " We will try again later."

    invoke-virtual {p2, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    .line 10
    invoke-virtual {p0}, Lorg/apache/log4j/net/SocketAppender;->a()V

    goto :goto_0

    .line 11
    :cond_2
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string p1, " We are not retrying."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    .line 12
    iget-object v0, p0, Lorg/apache/log4j/AppenderSkeleton;->d:Lorg/apache/log4j/spi/ErrorHandler;

    const/4 v1, 0x0

    invoke-interface {v0, p1, p2, v1}, Lorg/apache/log4j/spi/ErrorHandler;->error(Ljava/lang/String;Ljava/lang/Exception;I)V

    .line 13
    :goto_0
    invoke-static {p1}, Lorg/apache/log4j/helpers/LogLog;->error(Ljava/lang/String;)V

    :goto_1
    return-void
.end method

.method public activateOptions()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lorg/apache/log4j/net/SocketAppender;->q:Z

    if-eqz v0, :cond_0

    .line 2
    new-instance v0, Lorg/apache/log4j/net/ZeroConfSupport;

    iget v1, p0, Lorg/apache/log4j/net/SocketAppender;->j:I

    invoke-virtual {p0}, Lorg/apache/log4j/AppenderSkeleton;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "_log4j_obj_tcpconnect_appender.local."

    invoke-direct {v0, v3, v1, v2}, Lorg/apache/log4j/net/ZeroConfSupport;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    iput-object v0, p0, Lorg/apache/log4j/net/SocketAppender;->r:Lorg/apache/log4j/net/ZeroConfSupport;

    .line 3
    invoke-virtual {v0}, Lorg/apache/log4j/net/ZeroConfSupport;->advertise()V

    .line 4
    :cond_0
    iget-object v0, p0, Lorg/apache/log4j/net/SocketAppender;->i:Ljava/net/InetAddress;

    iget v1, p0, Lorg/apache/log4j/net/SocketAppender;->j:I

    invoke-virtual {p0, v0, v1}, Lorg/apache/log4j/net/SocketAppender;->a(Ljava/net/InetAddress;I)V

    return-void
.end method

.method public append(Lorg/apache/log4j/spi/LoggingEvent;)V
    .locals 3

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    iget-object v0, p0, Lorg/apache/log4j/net/SocketAppender;->i:Ljava/net/InetAddress;

    if-nez v0, :cond_1

    .line 2
    iget-object p1, p0, Lorg/apache/log4j/AppenderSkeleton;->d:Lorg/apache/log4j/spi/ErrorHandler;

    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    const-string v1, "No remote host is set for SocketAppender named \""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v1, p0, Lorg/apache/log4j/AppenderSkeleton;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v1, "\"."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lorg/apache/log4j/spi/ErrorHandler;->error(Ljava/lang/String;)V

    return-void

    .line 3
    :cond_1
    iget-object v0, p0, Lorg/apache/log4j/net/SocketAppender;->k:Ljava/io/ObjectOutputStream;

    if-eqz v0, :cond_6

    const/4 v0, 0x0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Lorg/apache/log4j/net/SocketAppender;->m:Z

    if-eqz v1, :cond_2

    .line 5
    invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getLocationInformation()Lorg/apache/log4j/spi/LocationInfo;

    .line 6
    :cond_2
    iget-object v1, p0, Lorg/apache/log4j/net/SocketAppender;->n:Ljava/lang/String;

    if-eqz v1, :cond_3

    const-string v1, "application"

    .line 7
    iget-object v2, p0, Lorg/apache/log4j/net/SocketAppender;->n:Ljava/lang/String;

    invoke-virtual {p1, v1, v2}, Lorg/apache/log4j/spi/LoggingEvent;->setProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    :cond_3
    invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getNDC()Ljava/lang/String;

    .line 9
    invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getThreadName()Ljava/lang/String;

    .line 10
    invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getMDCCopy()V

    .line 11
    invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getRenderedMessage()Ljava/lang/String;

    .line 12
    invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getThrowableStrRep()[Ljava/lang/String;

    .line 13
    iget-object v1, p0, Lorg/apache/log4j/net/SocketAppender;->k:Ljava/io/ObjectOutputStream;

    invoke-virtual {v1, p1}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    .line 14
    iget-object p1, p0, Lorg/apache/log4j/net/SocketAppender;->k:Ljava/io/ObjectOutputStream;

    invoke-virtual {p1}, Ljava/io/ObjectOutputStream;->flush()V

    .line 15
    iget p1, p0, Lorg/apache/log4j/net/SocketAppender;->p:I

    const/4 v1, 0x1

    add-int/2addr p1, v1

    iput p1, p0, Lorg/apache/log4j/net/SocketAppender;->p:I

    if-lt p1, v1, :cond_6

    .line 16
    iput v0, p0, Lorg/apache/log4j/net/SocketAppender;->p:I

    .line 17
    iget-object p1, p0, Lorg/apache/log4j/net/SocketAppender;->k:Ljava/io/ObjectOutputStream;

    invoke-virtual {p1}, Ljava/io/ObjectOutputStream;->reset()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 18
    instance-of v1, p1, Ljava/io/InterruptedIOException;

    if-eqz v1, :cond_4

    .line 19
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    :cond_4
    const/4 v1, 0x0

    .line 20
    iput-object v1, p0, Lorg/apache/log4j/net/SocketAppender;->k:Ljava/io/ObjectOutputStream;

    .line 21
    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    const-string v2, "Detected problem with connection: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lorg/apache/log4j/helpers/LogLog;->warn(Ljava/lang/String;)V

    .line 22
    iget v1, p0, Lorg/apache/log4j/net/SocketAppender;->l:I

    if-lez v1, :cond_5

    .line 23
    invoke-virtual {p0}, Lorg/apache/log4j/net/SocketAppender;->a()V

    goto :goto_0

    .line 24
    :cond_5
    iget-object v1, p0, Lorg/apache/log4j/AppenderSkeleton;->d:Lorg/apache/log4j/spi/ErrorHandler;

    const-string v2, "Detected problem with connection, not reconnecting."

    invoke-interface {v1, v2, p1, v0}, Lorg/apache/log4j/spi/ErrorHandler;->error(Ljava/lang/String;Ljava/lang/Exception;I)V

    :cond_6
    :goto_0
    return-void
.end method

.method public cleanUp()V
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/net/SocketAppender;->k:Ljava/io/ObjectOutputStream;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 2
    :try_start_0
    invoke-virtual {v0}, Ljava/io/ObjectOutputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 3
    instance-of v2, v0, Ljava/io/InterruptedIOException;

    if-eqz v2, :cond_0

    .line 4
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Thread;->interrupt()V

    :cond_0
    const-string v2, "Could not close oos."

    .line 5
    invoke-static {v2, v0}, Lorg/apache/log4j/helpers/LogLog;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 6
    :goto_0
    iput-object v1, p0, Lorg/apache/log4j/net/SocketAppender;->k:Ljava/io/ObjectOutputStream;

    .line 7
    :cond_1
    iget-object v0, p0, Lorg/apache/log4j/net/SocketAppender;->o:Lorg/apache/log4j/net/SocketAppender$a;

    if-eqz v0, :cond_2

    const/4 v2, 0x1

    .line 8
    iput-boolean v2, v0, Lorg/apache/log4j/net/SocketAppender$a;->b:Z

    .line 9
    iput-object v1, p0, Lorg/apache/log4j/net/SocketAppender;->o:Lorg/apache/log4j/net/SocketAppender$a;

    :cond_2
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
    iget-boolean v0, p0, Lorg/apache/log4j/net/SocketAppender;->q:Z

    if-eqz v0, :cond_1

    .line 5
    iget-object v0, p0, Lorg/apache/log4j/net/SocketAppender;->r:Lorg/apache/log4j/net/ZeroConfSupport;

    invoke-virtual {v0}, Lorg/apache/log4j/net/ZeroConfSupport;->unadvertise()V

    .line 6
    :cond_1
    invoke-virtual {p0}, Lorg/apache/log4j/net/SocketAppender;->cleanUp()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 7
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public getApplication()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/net/SocketAppender;->n:Ljava/lang/String;

    return-object v0
.end method

.method public getLocationInfo()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lorg/apache/log4j/net/SocketAppender;->m:Z

    return v0
.end method

.method public getPort()I
    .locals 1

    .line 1
    iget v0, p0, Lorg/apache/log4j/net/SocketAppender;->j:I

    return v0
.end method

.method public getReconnectionDelay()I
    .locals 1

    .line 1
    iget v0, p0, Lorg/apache/log4j/net/SocketAppender;->l:I

    return v0
.end method

.method public getRemoteHost()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/net/SocketAppender;->h:Ljava/lang/String;

    return-object v0
.end method

.method public isAdvertiseViaMulticastDNS()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lorg/apache/log4j/net/SocketAppender;->q:Z

    return v0
.end method

.method public requiresLayout()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public setAdvertiseViaMulticastDNS(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lorg/apache/log4j/net/SocketAppender;->q:Z

    return-void
.end method

.method public setApplication(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/apache/log4j/net/SocketAppender;->n:Ljava/lang/String;

    return-void
.end method

.method public setLocationInfo(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lorg/apache/log4j/net/SocketAppender;->m:Z

    return-void
.end method

.method public setPort(I)V
    .locals 0

    .line 1
    iput p1, p0, Lorg/apache/log4j/net/SocketAppender;->j:I

    return-void
.end method

.method public setReconnectionDelay(I)V
    .locals 0

    .line 1
    iput p1, p0, Lorg/apache/log4j/net/SocketAppender;->l:I

    return-void
.end method

.method public setRemoteHost(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-static {p1}, Lorg/apache/log4j/net/SocketAppender;->a(Ljava/lang/String;)Ljava/net/InetAddress;

    move-result-object v0

    iput-object v0, p0, Lorg/apache/log4j/net/SocketAppender;->i:Ljava/net/InetAddress;

    .line 2
    iput-object p1, p0, Lorg/apache/log4j/net/SocketAppender;->h:Ljava/lang/String;

    return-void
.end method
