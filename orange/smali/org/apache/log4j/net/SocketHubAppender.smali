.class public Lorg/apache/log4j/net/SocketHubAppender;
.super Lorg/apache/log4j/AppenderSkeleton;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/apache/log4j/net/SocketHubAppender$a;
    }
.end annotation


# static fields
.field public static final ZONE:Ljava/lang/String; = "_log4j_obj_tcpaccept_appender.local."


# instance fields
.field public h:I

.field public i:Ljava/util/Vector;

.field public j:Lorg/apache/log4j/net/SocketHubAppender$a;

.field public k:Z

.field public l:Lorg/apache/log4j/helpers/CyclicBuffer;

.field public m:Ljava/lang/String;

.field public n:Z

.field public o:Lorg/apache/log4j/net/ZeroConfSupport;

.field public p:Ljava/net/ServerSocket;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lorg/apache/log4j/AppenderSkeleton;-><init>()V

    const/16 v0, 0x11d0

    .line 2
    iput v0, p0, Lorg/apache/log4j/net/SocketHubAppender;->h:I

    .line 3
    new-instance v0, Ljava/util/Vector;

    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    iput-object v0, p0, Lorg/apache/log4j/net/SocketHubAppender;->i:Ljava/util/Vector;

    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, Lorg/apache/log4j/net/SocketHubAppender;->j:Lorg/apache/log4j/net/SocketHubAppender$a;

    const/4 v1, 0x0

    .line 5
    iput-boolean v1, p0, Lorg/apache/log4j/net/SocketHubAppender;->k:Z

    .line 6
    iput-object v0, p0, Lorg/apache/log4j/net/SocketHubAppender;->l:Lorg/apache/log4j/helpers/CyclicBuffer;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    .line 7
    invoke-direct {p0}, Lorg/apache/log4j/AppenderSkeleton;-><init>()V

    const/16 v0, 0x11d0

    .line 8
    iput v0, p0, Lorg/apache/log4j/net/SocketHubAppender;->h:I

    .line 9
    new-instance v0, Ljava/util/Vector;

    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    iput-object v0, p0, Lorg/apache/log4j/net/SocketHubAppender;->i:Ljava/util/Vector;

    const/4 v0, 0x0

    .line 10
    iput-object v0, p0, Lorg/apache/log4j/net/SocketHubAppender;->j:Lorg/apache/log4j/net/SocketHubAppender$a;

    const/4 v1, 0x0

    .line 11
    iput-boolean v1, p0, Lorg/apache/log4j/net/SocketHubAppender;->k:Z

    .line 12
    iput-object v0, p0, Lorg/apache/log4j/net/SocketHubAppender;->l:Lorg/apache/log4j/helpers/CyclicBuffer;

    .line 13
    iput p1, p0, Lorg/apache/log4j/net/SocketHubAppender;->h:I

    .line 14
    invoke-virtual {p0}, Lorg/apache/log4j/net/SocketHubAppender;->a()V

    return-void
.end method

.method public static synthetic a(Lorg/apache/log4j/net/SocketHubAppender;)Ljava/net/ServerSocket;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/apache/log4j/net/SocketHubAppender;->p:Ljava/net/ServerSocket;

    return-object p0
.end method

.method public static synthetic a(Lorg/apache/log4j/net/SocketHubAppender;Ljava/net/ServerSocket;)Ljava/net/ServerSocket;
    .locals 0

    .line 2
    iput-object p1, p0, Lorg/apache/log4j/net/SocketHubAppender;->p:Ljava/net/ServerSocket;

    return-object p1
.end method

.method public static synthetic b(Lorg/apache/log4j/net/SocketHubAppender;)Lorg/apache/log4j/helpers/CyclicBuffer;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/apache/log4j/net/SocketHubAppender;->l:Lorg/apache/log4j/helpers/CyclicBuffer;

    return-object p0
.end method


# virtual methods
.method public a(I)Ljava/net/ServerSocket;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 4
    new-instance v0, Ljava/net/ServerSocket;

    invoke-direct {v0, p1}, Ljava/net/ServerSocket;-><init>(I)V

    return-object v0
.end method

.method public final a()V
    .locals 3

    .line 3
    new-instance v0, Lorg/apache/log4j/net/SocketHubAppender$a;

    iget v1, p0, Lorg/apache/log4j/net/SocketHubAppender;->h:I

    iget-object v2, p0, Lorg/apache/log4j/net/SocketHubAppender;->i:Ljava/util/Vector;

    invoke-direct {v0, p0, v1, v2}, Lorg/apache/log4j/net/SocketHubAppender$a;-><init>(Lorg/apache/log4j/net/SocketHubAppender;ILjava/util/Vector;)V

    iput-object v0, p0, Lorg/apache/log4j/net/SocketHubAppender;->j:Lorg/apache/log4j/net/SocketHubAppender$a;

    return-void
.end method

.method public activateOptions()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lorg/apache/log4j/net/SocketHubAppender;->n:Z

    if-eqz v0, :cond_0

    .line 2
    new-instance v0, Lorg/apache/log4j/net/ZeroConfSupport;

    iget v1, p0, Lorg/apache/log4j/net/SocketHubAppender;->h:I

    invoke-virtual {p0}, Lorg/apache/log4j/AppenderSkeleton;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "_log4j_obj_tcpaccept_appender.local."

    invoke-direct {v0, v3, v1, v2}, Lorg/apache/log4j/net/ZeroConfSupport;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    iput-object v0, p0, Lorg/apache/log4j/net/SocketHubAppender;->o:Lorg/apache/log4j/net/ZeroConfSupport;

    .line 3
    invoke-virtual {v0}, Lorg/apache/log4j/net/ZeroConfSupport;->advertise()V

    .line 4
    :cond_0
    invoke-virtual {p0}, Lorg/apache/log4j/net/SocketHubAppender;->a()V

    return-void
.end method

.method public append(Lorg/apache/log4j/spi/LoggingEvent;)V
    .locals 3

    if-eqz p1, :cond_2

    .line 1
    iget-boolean v0, p0, Lorg/apache/log4j/net/SocketHubAppender;->k:Z

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getLocationInformation()Lorg/apache/log4j/spi/LocationInfo;

    .line 3
    :cond_0
    iget-object v0, p0, Lorg/apache/log4j/net/SocketHubAppender;->m:Ljava/lang/String;

    if-eqz v0, :cond_1

    const-string v1, "application"

    .line 4
    invoke-virtual {p1, v1, v0}, Lorg/apache/log4j/spi/LoggingEvent;->setProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    :cond_1
    invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getNDC()Ljava/lang/String;

    .line 6
    invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getThreadName()Ljava/lang/String;

    .line 7
    invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getMDCCopy()V

    .line 8
    invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getRenderedMessage()Ljava/lang/String;

    .line 9
    invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getThrowableStrRep()[Ljava/lang/String;

    .line 10
    iget-object v0, p0, Lorg/apache/log4j/net/SocketHubAppender;->l:Lorg/apache/log4j/helpers/CyclicBuffer;

    if-eqz v0, :cond_2

    .line 11
    invoke-virtual {v0, p1}, Lorg/apache/log4j/helpers/CyclicBuffer;->add(Lorg/apache/log4j/spi/LoggingEvent;)V

    :cond_2
    if-eqz p1, :cond_6

    .line 12
    iget-object v0, p0, Lorg/apache/log4j/net/SocketHubAppender;->i:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v0

    if-nez v0, :cond_3

    goto :goto_3

    :cond_3
    const/4 v0, 0x0

    .line 13
    :goto_0
    iget-object v1, p0, Lorg/apache/log4j/net/SocketHubAppender;->i:Ljava/util/Vector;

    invoke-virtual {v1}, Ljava/util/Vector;->size()I

    move-result v1

    if-ge v0, v1, :cond_6

    const/4 v1, 0x0

    .line 14
    :try_start_0
    iget-object v2, p0, Lorg/apache/log4j/net/SocketHubAppender;->i:Ljava/util/Vector;

    invoke-virtual {v2, v0}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/io/ObjectOutputStream;
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v1, v2

    goto :goto_1

    :catch_0
    nop

    :goto_1
    if-nez v1, :cond_4

    goto :goto_3

    .line 15
    :cond_4
    :try_start_1
    invoke-virtual {v1, p1}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    .line 16
    invoke-virtual {v1}, Ljava/io/ObjectOutputStream;->flush()V

    .line 17
    invoke-virtual {v1}, Ljava/io/ObjectOutputStream;->reset()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_2

    :catch_1
    move-exception v1

    .line 18
    instance-of v1, v1, Ljava/io/InterruptedIOException;

    if-eqz v1, :cond_5

    .line 19
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    .line 20
    :cond_5
    iget-object v1, p0, Lorg/apache/log4j/net/SocketHubAppender;->i:Ljava/util/Vector;

    invoke-virtual {v1, v0}, Ljava/util/Vector;->removeElementAt(I)V

    const-string v1, "dropped connection"

    .line 21
    invoke-static {v1}, Lorg/apache/log4j/helpers/LogLog;->debug(Ljava/lang/String;)V

    add-int/lit8 v0, v0, -0x1

    :goto_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_6
    :goto_3
    return-void
.end method

.method public cleanUp()V
    .locals 4

    const-string v0, "could not close oos."

    const-string v1, "stopping ServerSocket"

    .line 1
    invoke-static {v1}, Lorg/apache/log4j/helpers/LogLog;->debug(Ljava/lang/String;)V

    .line 2
    iget-object v1, p0, Lorg/apache/log4j/net/SocketHubAppender;->j:Lorg/apache/log4j/net/SocketHubAppender$a;

    invoke-virtual {v1}, Lorg/apache/log4j/net/SocketHubAppender$a;->a()V

    const/4 v1, 0x0

    .line 3
    iput-object v1, p0, Lorg/apache/log4j/net/SocketHubAppender;->j:Lorg/apache/log4j/net/SocketHubAppender$a;

    const-string v1, "closing client connections"

    .line 4
    invoke-static {v1}, Lorg/apache/log4j/helpers/LogLog;->debug(Ljava/lang/String;)V

    .line 5
    :cond_0
    :goto_0
    iget-object v1, p0, Lorg/apache/log4j/net/SocketHubAppender;->i:Ljava/util/Vector;

    invoke-virtual {v1}, Ljava/util/Vector;->size()I

    move-result v1

    if-eqz v1, :cond_1

    .line 6
    iget-object v1, p0, Lorg/apache/log4j/net/SocketHubAppender;->i:Ljava/util/Vector;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/io/ObjectOutputStream;

    if-eqz v1, :cond_0

    .line 7
    :try_start_0
    invoke-virtual {v1}, Ljava/io/ObjectOutputStream;->close()V
    :try_end_0
    .catch Ljava/io/InterruptedIOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v1

    .line 8
    invoke-static {v0, v1}, Lorg/apache/log4j/helpers/LogLog;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    :catch_1
    move-exception v1

    .line 9
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Thread;->interrupt()V

    .line 10
    invoke-static {v0, v1}, Lorg/apache/log4j/helpers/LogLog;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 11
    :goto_1
    iget-object v1, p0, Lorg/apache/log4j/net/SocketHubAppender;->i:Ljava/util/Vector;

    invoke-virtual {v1, v2}, Ljava/util/Vector;->removeElementAt(I)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public declared-synchronized close()V
    .locals 2

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

    .line 3
    :cond_0
    :try_start_1
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    const-string v1, "closing SocketHubAppender "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p0}, Lorg/apache/log4j/AppenderSkeleton;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lorg/apache/log4j/helpers/LogLog;->debug(Ljava/lang/String;)V

    const/4 v0, 0x1

    .line 4
    iput-boolean v0, p0, Lorg/apache/log4j/AppenderSkeleton;->g:Z

    .line 5
    iget-boolean v0, p0, Lorg/apache/log4j/net/SocketHubAppender;->n:Z

    if-eqz v0, :cond_1

    .line 6
    iget-object v0, p0, Lorg/apache/log4j/net/SocketHubAppender;->o:Lorg/apache/log4j/net/ZeroConfSupport;

    invoke-virtual {v0}, Lorg/apache/log4j/net/ZeroConfSupport;->unadvertise()V

    .line 7
    :cond_1
    invoke-virtual {p0}, Lorg/apache/log4j/net/SocketHubAppender;->cleanUp()V

    .line 8
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    const-string v1, "SocketHubAppender "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p0}, Lorg/apache/log4j/AppenderSkeleton;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v1, " closed"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lorg/apache/log4j/helpers/LogLog;->debug(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 9
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
    iget-object v0, p0, Lorg/apache/log4j/net/SocketHubAppender;->m:Ljava/lang/String;

    return-object v0
.end method

.method public getBufferSize()I
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/net/SocketHubAppender;->l:Lorg/apache/log4j/helpers/CyclicBuffer;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 2
    :cond_0
    invoke-virtual {v0}, Lorg/apache/log4j/helpers/CyclicBuffer;->getMaxSize()I

    move-result v0

    return v0
.end method

.method public getLocationInfo()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lorg/apache/log4j/net/SocketHubAppender;->k:Z

    return v0
.end method

.method public getPort()I
    .locals 1

    .line 1
    iget v0, p0, Lorg/apache/log4j/net/SocketHubAppender;->h:I

    return v0
.end method

.method public isAdvertiseViaMulticastDNS()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lorg/apache/log4j/net/SocketHubAppender;->n:Z

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
    iput-boolean p1, p0, Lorg/apache/log4j/net/SocketHubAppender;->n:Z

    return-void
.end method

.method public setApplication(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/apache/log4j/net/SocketHubAppender;->m:Ljava/lang/String;

    return-void
.end method

.method public setBufferSize(I)V
    .locals 1

    .line 1
    new-instance v0, Lorg/apache/log4j/helpers/CyclicBuffer;

    invoke-direct {v0, p1}, Lorg/apache/log4j/helpers/CyclicBuffer;-><init>(I)V

    iput-object v0, p0, Lorg/apache/log4j/net/SocketHubAppender;->l:Lorg/apache/log4j/helpers/CyclicBuffer;

    return-void
.end method

.method public setLocationInfo(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lorg/apache/log4j/net/SocketHubAppender;->k:Z

    return-void
.end method

.method public setPort(I)V
    .locals 0

    .line 1
    iput p1, p0, Lorg/apache/log4j/net/SocketHubAppender;->h:I

    return-void
.end method
