.class public Lorg/apache/log4j/net/SocketHubAppender$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/apache/log4j/net/SocketHubAppender;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field public b:I

.field public c:Ljava/util/Vector;

.field public d:Z

.field public e:Ljava/lang/Thread;

.field public final synthetic f:Lorg/apache/log4j/net/SocketHubAppender;


# direct methods
.method public constructor <init>(Lorg/apache/log4j/net/SocketHubAppender;ILjava/util/Vector;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/apache/log4j/net/SocketHubAppender$a;->f:Lorg/apache/log4j/net/SocketHubAppender;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p2, p0, Lorg/apache/log4j/net/SocketHubAppender$a;->b:I

    .line 3
    iput-object p3, p0, Lorg/apache/log4j/net/SocketHubAppender$a;->c:Ljava/util/Vector;

    const/4 p1, 0x1

    .line 4
    iput-boolean p1, p0, Lorg/apache/log4j/net/SocketHubAppender$a;->d:Z

    .line 5
    new-instance p2, Ljava/lang/Thread;

    invoke-direct {p2, p0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    iput-object p2, p0, Lorg/apache/log4j/net/SocketHubAppender$a;->e:Ljava/lang/Thread;

    .line 6
    invoke-virtual {p2, p1}, Ljava/lang/Thread;->setDaemon(Z)V

    .line 7
    iget-object p1, p0, Lorg/apache/log4j/net/SocketHubAppender$a;->e:Ljava/lang/Thread;

    new-instance p2, Ljava/lang/StringBuffer;

    invoke-direct {p2}, Ljava/lang/StringBuffer;-><init>()V

    const-string p3, "SocketHubAppender-Monitor-"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget p3, p0, Lorg/apache/log4j/net/SocketHubAppender$a;->b:I

    invoke-virtual {p2, p3}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    invoke-virtual {p2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 8
    iget-object p1, p0, Lorg/apache/log4j/net/SocketHubAppender$a;->e:Ljava/lang/Thread;

    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    return-void
.end method


# virtual methods
.method public declared-synchronized a()V
    .locals 2

    monitor-enter p0

    .line 1
    :try_start_0
    iget-boolean v0, p0, Lorg/apache/log4j/net/SocketHubAppender$a;->d:Z

    if-eqz v0, :cond_1

    const-string v0, "server monitor thread shutting down"

    .line 2
    invoke-static {v0}, Lorg/apache/log4j/helpers/LogLog;->debug(Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lorg/apache/log4j/net/SocketHubAppender$a;->d:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, 0x0

    .line 4
    :try_start_1
    iget-object v1, p0, Lorg/apache/log4j/net/SocketHubAppender$a;->f:Lorg/apache/log4j/net/SocketHubAppender;

    invoke-static {v1}, Lorg/apache/log4j/net/SocketHubAppender;->a(Lorg/apache/log4j/net/SocketHubAppender;)Ljava/net/ServerSocket;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 5
    iget-object v1, p0, Lorg/apache/log4j/net/SocketHubAppender$a;->f:Lorg/apache/log4j/net/SocketHubAppender;

    invoke-static {v1}, Lorg/apache/log4j/net/SocketHubAppender;->a(Lorg/apache/log4j/net/SocketHubAppender;)Ljava/net/ServerSocket;

    move-result-object v1

    invoke-virtual {v1}, Ljava/net/ServerSocket;->close()V

    .line 6
    iget-object v1, p0, Lorg/apache/log4j/net/SocketHubAppender$a;->f:Lorg/apache/log4j/net/SocketHubAppender;

    invoke-static {v1, v0}, Lorg/apache/log4j/net/SocketHubAppender;->a(Lorg/apache/log4j/net/SocketHubAppender;Ljava/net/ServerSocket;)Ljava/net/ServerSocket;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 7
    :catch_0
    :cond_0
    :try_start_2
    iget-object v1, p0, Lorg/apache/log4j/net/SocketHubAppender$a;->e:Ljava/lang/Thread;

    invoke-virtual {v1}, Ljava/lang/Thread;->join()V
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    .line 8
    :catch_1
    :try_start_3
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    .line 9
    :goto_0
    iput-object v0, p0, Lorg/apache/log4j/net/SocketHubAppender$a;->e:Ljava/lang/Thread;

    const-string v0, "server monitor thread shut down"

    .line 10
    invoke-static {v0}, Lorg/apache/log4j/helpers/LogLog;->debug(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 11
    :cond_1
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final a(Ljava/io/ObjectOutputStream;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 12
    iget-object v0, p0, Lorg/apache/log4j/net/SocketHubAppender$a;->f:Lorg/apache/log4j/net/SocketHubAppender;

    invoke-static {v0}, Lorg/apache/log4j/net/SocketHubAppender;->b(Lorg/apache/log4j/net/SocketHubAppender;)Lorg/apache/log4j/helpers/CyclicBuffer;

    move-result-object v0

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    .line 13
    :goto_0
    iget-object v1, p0, Lorg/apache/log4j/net/SocketHubAppender$a;->f:Lorg/apache/log4j/net/SocketHubAppender;

    invoke-static {v1}, Lorg/apache/log4j/net/SocketHubAppender;->b(Lorg/apache/log4j/net/SocketHubAppender;)Lorg/apache/log4j/helpers/CyclicBuffer;

    move-result-object v1

    invoke-virtual {v1}, Lorg/apache/log4j/helpers/CyclicBuffer;->length()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 14
    iget-object v1, p0, Lorg/apache/log4j/net/SocketHubAppender$a;->f:Lorg/apache/log4j/net/SocketHubAppender;

    invoke-static {v1}, Lorg/apache/log4j/net/SocketHubAppender;->b(Lorg/apache/log4j/net/SocketHubAppender;)Lorg/apache/log4j/helpers/CyclicBuffer;

    move-result-object v1

    invoke-virtual {v1, v0}, Lorg/apache/log4j/helpers/CyclicBuffer;->get(I)Lorg/apache/log4j/spi/LoggingEvent;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {p1}, Ljava/io/ObjectOutputStream;->flush()V

    .line 16
    invoke-virtual {p1}, Ljava/io/ObjectOutputStream;->reset()V

    :cond_1
    return-void
.end method

.method public run()V
    .locals 6

    const-string v0, "exception setting timeout, shutting down server socket."

    .line 1
    iget-object v1, p0, Lorg/apache/log4j/net/SocketHubAppender$a;->f:Lorg/apache/log4j/net/SocketHubAppender;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lorg/apache/log4j/net/SocketHubAppender;->a(Lorg/apache/log4j/net/SocketHubAppender;Ljava/net/ServerSocket;)Ljava/net/ServerSocket;

    const/4 v1, 0x0

    .line 2
    :try_start_0
    iget-object v3, p0, Lorg/apache/log4j/net/SocketHubAppender$a;->f:Lorg/apache/log4j/net/SocketHubAppender;

    iget-object v4, p0, Lorg/apache/log4j/net/SocketHubAppender$a;->f:Lorg/apache/log4j/net/SocketHubAppender;

    iget v5, p0, Lorg/apache/log4j/net/SocketHubAppender$a;->b:I

    invoke-virtual {v4, v5}, Lorg/apache/log4j/net/SocketHubAppender;->a(I)Ljava/net/ServerSocket;

    move-result-object v4

    invoke-static {v3, v4}, Lorg/apache/log4j/net/SocketHubAppender;->a(Lorg/apache/log4j/net/SocketHubAppender;Ljava/net/ServerSocket;)Ljava/net/ServerSocket;

    .line 3
    iget-object v3, p0, Lorg/apache/log4j/net/SocketHubAppender$a;->f:Lorg/apache/log4j/net/SocketHubAppender;

    invoke-static {v3}, Lorg/apache/log4j/net/SocketHubAppender;->a(Lorg/apache/log4j/net/SocketHubAppender;)Ljava/net/ServerSocket;

    move-result-object v3

    const/16 v4, 0x3e8

    invoke-virtual {v3, v4}, Ljava/net/ServerSocket;->setSoTimeout(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_b

    .line 4
    :try_start_1
    iget-object v3, p0, Lorg/apache/log4j/net/SocketHubAppender$a;->f:Lorg/apache/log4j/net/SocketHubAppender;

    invoke-static {v3}, Lorg/apache/log4j/net/SocketHubAppender;->a(Lorg/apache/log4j/net/SocketHubAppender;)Ljava/net/ServerSocket;

    move-result-object v3

    invoke-virtual {v3, v4}, Ljava/net/ServerSocket;->setSoTimeout(I)V
    :try_end_1
    .catch Ljava/net/SocketException; {:try_start_1 .. :try_end_1} :catch_6
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 5
    :cond_0
    :goto_0
    :try_start_2
    iget-boolean v0, p0, Lorg/apache/log4j/net/SocketHubAppender$a;->d:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v0, :cond_3

    .line 6
    :try_start_3
    iget-object v0, p0, Lorg/apache/log4j/net/SocketHubAppender$a;->f:Lorg/apache/log4j/net/SocketHubAppender;

    invoke-static {v0}, Lorg/apache/log4j/net/SocketHubAppender;->a(Lorg/apache/log4j/net/SocketHubAppender;)Ljava/net/ServerSocket;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/ServerSocket;->accept()Ljava/net/Socket;

    move-result-object v0
    :try_end_3
    .catch Ljava/io/InterruptedIOException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/net/SocketException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_2

    :catch_0
    move-exception v0

    :try_start_4
    const-string v3, "exception accepting socket."

    .line 7
    invoke-static {v3, v0}, Lorg/apache/log4j/helpers/LogLog;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    :catch_1
    move-exception v0

    const-string v3, "exception accepting socket, shutting down server socket."

    .line 8
    invoke-static {v3, v0}, Lorg/apache/log4j/helpers/LogLog;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 9
    iput-boolean v1, p0, Lorg/apache/log4j/net/SocketHubAppender$a;->d:Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :catch_2
    :goto_1
    move-object v0, v2

    :goto_2
    if-eqz v0, :cond_0

    .line 10
    :try_start_5
    invoke-virtual {v0}, Ljava/net/Socket;->getInetAddress()Ljava/net/InetAddress;

    move-result-object v3

    .line 11
    new-instance v4, Ljava/lang/StringBuffer;

    invoke-direct {v4}, Ljava/lang/StringBuffer;-><init>()V

    const-string v5, "accepting connection from "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v3}, Ljava/net/InetAddress;->getHostName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v5, " ("

    invoke-virtual {v4, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v3}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v3, ")"

    invoke-virtual {v4, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v4}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lorg/apache/log4j/helpers/LogLog;->debug(Ljava/lang/String;)V

    .line 12
    new-instance v3, Ljava/io/ObjectOutputStream;

    invoke-virtual {v0}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v0

    invoke-direct {v3, v0}, Ljava/io/ObjectOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 13
    iget-object v0, p0, Lorg/apache/log4j/net/SocketHubAppender$a;->f:Lorg/apache/log4j/net/SocketHubAppender;

    invoke-static {v0}, Lorg/apache/log4j/net/SocketHubAppender;->b(Lorg/apache/log4j/net/SocketHubAppender;)Lorg/apache/log4j/helpers/CyclicBuffer;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lorg/apache/log4j/net/SocketHubAppender$a;->f:Lorg/apache/log4j/net/SocketHubAppender;

    invoke-static {v0}, Lorg/apache/log4j/net/SocketHubAppender;->b(Lorg/apache/log4j/net/SocketHubAppender;)Lorg/apache/log4j/helpers/CyclicBuffer;

    move-result-object v0

    invoke-virtual {v0}, Lorg/apache/log4j/helpers/CyclicBuffer;->length()I

    move-result v0

    if-lez v0, :cond_1

    .line 14
    invoke-virtual {p0, v3}, Lorg/apache/log4j/net/SocketHubAppender$a;->a(Ljava/io/ObjectOutputStream;)V

    .line 15
    :cond_1
    iget-object v0, p0, Lorg/apache/log4j/net/SocketHubAppender$a;->c:Ljava/util/Vector;

    invoke-virtual {v0, v3}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_0

    :catch_3
    move-exception v0

    .line 16
    :try_start_6
    instance-of v3, v0, Ljava/io/InterruptedIOException;

    if-eqz v3, :cond_2

    .line 17
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Thread;->interrupt()V

    :cond_2
    const-string v3, "exception creating output stream on socket."

    .line 18
    invoke-static {v3, v0}, Lorg/apache/log4j/helpers/LogLog;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    goto/16 :goto_0

    .line 19
    :cond_3
    :try_start_7
    iget-object v0, p0, Lorg/apache/log4j/net/SocketHubAppender$a;->f:Lorg/apache/log4j/net/SocketHubAppender;

    invoke-static {v0}, Lorg/apache/log4j/net/SocketHubAppender;->a(Lorg/apache/log4j/net/SocketHubAppender;)Ljava/net/ServerSocket;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/ServerSocket;->close()V
    :try_end_7
    .catch Ljava/io/InterruptedIOException; {:try_start_7 .. :try_end_7} :catch_4
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_5

    goto :goto_3

    .line 20
    :catch_4
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    :catch_5
    :goto_3
    return-void

    :catchall_0
    move-exception v0

    goto :goto_5

    :catch_6
    move-exception v1

    .line 21
    :try_start_8
    invoke-static {v0, v1}, Lorg/apache/log4j/helpers/LogLog;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 22
    :try_start_9
    iget-object v0, p0, Lorg/apache/log4j/net/SocketHubAppender$a;->f:Lorg/apache/log4j/net/SocketHubAppender;

    invoke-static {v0}, Lorg/apache/log4j/net/SocketHubAppender;->a(Lorg/apache/log4j/net/SocketHubAppender;)Ljava/net/ServerSocket;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/ServerSocket;->close()V
    :try_end_9
    .catch Ljava/io/InterruptedIOException; {:try_start_9 .. :try_end_9} :catch_7
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_8

    goto :goto_4

    .line 23
    :catch_7
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    :catch_8
    :goto_4
    return-void

    .line 24
    :goto_5
    :try_start_a
    iget-object v1, p0, Lorg/apache/log4j/net/SocketHubAppender$a;->f:Lorg/apache/log4j/net/SocketHubAppender;

    invoke-static {v1}, Lorg/apache/log4j/net/SocketHubAppender;->a(Lorg/apache/log4j/net/SocketHubAppender;)Ljava/net/ServerSocket;

    move-result-object v1

    invoke-virtual {v1}, Ljava/net/ServerSocket;->close()V
    :try_end_a
    .catch Ljava/io/InterruptedIOException; {:try_start_a .. :try_end_a} :catch_9
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_a

    goto :goto_6

    .line 25
    :catch_9
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    .line 26
    :catch_a
    :goto_6
    throw v0

    :catch_b
    move-exception v2

    .line 27
    instance-of v3, v2, Ljava/io/InterruptedIOException;

    if-nez v3, :cond_4

    instance-of v3, v2, Ljava/lang/InterruptedException;

    if-eqz v3, :cond_5

    .line 28
    :cond_4
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Thread;->interrupt()V

    .line 29
    :cond_5
    invoke-static {v0, v2}, Lorg/apache/log4j/helpers/LogLog;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 30
    iput-boolean v1, p0, Lorg/apache/log4j/net/SocketHubAppender$a;->d:Z

    return-void
.end method
