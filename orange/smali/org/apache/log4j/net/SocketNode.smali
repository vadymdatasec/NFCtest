.class public Lorg/apache/log4j/net/SocketNode;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field public static e:Lorg/apache/log4j/Logger;

.field public static synthetic f:Ljava/lang/Class;


# instance fields
.field public b:Ljava/net/Socket;

.field public c:Lorg/apache/log4j/spi/LoggerRepository;

.field public d:Ljava/io/ObjectInputStream;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lorg/apache/log4j/net/SocketNode;->f:Ljava/lang/Class;

    if-nez v0, :cond_0

    const-string v0, "org.apache.log4j.net.SocketNode"

    invoke-static {v0}, Lorg/apache/log4j/net/SocketNode;->a(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    sput-object v0, Lorg/apache/log4j/net/SocketNode;->f:Ljava/lang/Class;

    :cond_0
    invoke-static {v0}, Lorg/apache/log4j/Logger;->getLogger(Ljava/lang/Class;)Lorg/apache/log4j/Logger;

    move-result-object v0

    sput-object v0, Lorg/apache/log4j/net/SocketNode;->e:Lorg/apache/log4j/Logger;

    return-void
.end method

.method public constructor <init>(Ljava/net/Socket;Lorg/apache/log4j/spi/LoggerRepository;)V
    .locals 3

    const-string v0, "Could not open ObjectInputStream to "

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lorg/apache/log4j/net/SocketNode;->b:Ljava/net/Socket;

    .line 3
    iput-object p2, p0, Lorg/apache/log4j/net/SocketNode;->c:Lorg/apache/log4j/spi/LoggerRepository;

    .line 4
    :try_start_0
    new-instance p2, Ljava/io/ObjectInputStream;

    new-instance v1, Ljava/io/BufferedInputStream;

    invoke-virtual {p1}, Ljava/net/Socket;->getInputStream()Ljava/io/InputStream;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    invoke-direct {p2, v1}, Ljava/io/ObjectInputStream;-><init>(Ljava/io/InputStream;)V

    iput-object p2, p0, Lorg/apache/log4j/net/SocketNode;->d:Ljava/io/ObjectInputStream;
    :try_end_0
    .catch Ljava/io/InterruptedIOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p2

    .line 5
    sget-object v1, Lorg/apache/log4j/net/SocketNode;->e:Lorg/apache/log4j/Logger;

    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1, p2}, Lorg/apache/log4j/Category;->error(Ljava/lang/Object;Ljava/lang/Throwable;)V

    goto :goto_0

    :catch_1
    move-exception p2

    .line 6
    sget-object v1, Lorg/apache/log4j/net/SocketNode;->e:Lorg/apache/log4j/Logger;

    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1, p2}, Lorg/apache/log4j/Category;->error(Ljava/lang/Object;Ljava/lang/Throwable;)V

    goto :goto_0

    :catch_2
    move-exception p2

    .line 7
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    .line 8
    sget-object v1, Lorg/apache/log4j/net/SocketNode;->e:Lorg/apache/log4j/Logger;

    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1, p2}, Lorg/apache/log4j/Category;->error(Ljava/lang/Object;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public static synthetic a(Ljava/lang/String;)Ljava/lang/Class;
    .locals 1

    .line 1
    :try_start_0
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    new-instance v0, Ljava/lang/NoClassDefFoundError;

    invoke-direct {v0}, Ljava/lang/NoClassDefFoundError;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/NoClassDefFoundError;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object p0

    throw p0
.end method


# virtual methods
.method public run()V
    .locals 6

    const-string v0, "Closing connection."

    const-string v1, "Could not close connection."

    .line 1
    :try_start_0
    iget-object v2, p0, Lorg/apache/log4j/net/SocketNode;->d:Ljava/io/ObjectInputStream;

    if-eqz v2, :cond_1

    .line 2
    :cond_0
    :goto_0
    iget-object v2, p0, Lorg/apache/log4j/net/SocketNode;->d:Ljava/io/ObjectInputStream;

    invoke-virtual {v2}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/apache/log4j/spi/LoggingEvent;

    .line 3
    iget-object v3, p0, Lorg/apache/log4j/net/SocketNode;->c:Lorg/apache/log4j/spi/LoggerRepository;

    invoke-virtual {v2}, Lorg/apache/log4j/spi/LoggingEvent;->getLoggerName()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4}, Lorg/apache/log4j/spi/LoggerRepository;->getLogger(Ljava/lang/String;)Lorg/apache/log4j/Logger;

    move-result-object v3

    .line 4
    invoke-virtual {v2}, Lorg/apache/log4j/spi/LoggingEvent;->getLevel()Lorg/apache/log4j/Level;

    move-result-object v4

    invoke-virtual {v3}, Lorg/apache/log4j/Category;->getEffectiveLevel()Lorg/apache/log4j/Level;

    move-result-object v5

    invoke-virtual {v4, v5}, Lorg/apache/log4j/Priority;->isGreaterOrEqual(Lorg/apache/log4j/Priority;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 5
    invoke-virtual {v3, v2}, Lorg/apache/log4j/Category;->callAppenders(Lorg/apache/log4j/spi/LoggingEvent;)V
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_a
    .catch Ljava/net/SocketException; {:try_start_0 .. :try_end_0} :catch_8
    .catch Ljava/io/InterruptedIOException; {:try_start_0 .. :try_end_0} :catch_6
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 6
    :cond_1
    iget-object v0, p0, Lorg/apache/log4j/net/SocketNode;->d:Ljava/io/ObjectInputStream;

    if-eqz v0, :cond_2

    .line 7
    :try_start_1
    invoke-virtual {v0}, Ljava/io/ObjectInputStream;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    .line 8
    sget-object v2, Lorg/apache/log4j/net/SocketNode;->e:Lorg/apache/log4j/Logger;

    invoke-virtual {v2, v1, v0}, Lorg/apache/log4j/Category;->info(Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 9
    :cond_2
    :goto_1
    iget-object v0, p0, Lorg/apache/log4j/net/SocketNode;->b:Ljava/net/Socket;

    if-eqz v0, :cond_8

    .line 10
    :goto_2
    :try_start_2
    invoke-virtual {v0}, Ljava/net/Socket;->close()V
    :try_end_2
    .catch Ljava/io/InterruptedIOException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_c

    goto/16 :goto_8

    .line 11
    :catch_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    goto/16 :goto_8

    :catchall_0
    move-exception v0

    goto/16 :goto_9

    :catch_2
    move-exception v0

    .line 12
    :try_start_3
    sget-object v2, Lorg/apache/log4j/net/SocketNode;->e:Lorg/apache/log4j/Logger;

    const-string v3, "Unexpected exception. Closing conneciton."

    invoke-virtual {v2, v3, v0}, Lorg/apache/log4j/Category;->error(Ljava/lang/Object;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 13
    iget-object v0, p0, Lorg/apache/log4j/net/SocketNode;->d:Ljava/io/ObjectInputStream;

    if-eqz v0, :cond_3

    .line 14
    :try_start_4
    invoke-virtual {v0}, Ljava/io/ObjectInputStream;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    goto :goto_3

    :catch_3
    move-exception v0

    .line 15
    sget-object v2, Lorg/apache/log4j/net/SocketNode;->e:Lorg/apache/log4j/Logger;

    invoke-virtual {v2, v1, v0}, Lorg/apache/log4j/Category;->info(Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 16
    :cond_3
    :goto_3
    iget-object v0, p0, Lorg/apache/log4j/net/SocketNode;->b:Ljava/net/Socket;

    if-eqz v0, :cond_8

    goto :goto_2

    :catch_4
    move-exception v2

    .line 17
    :try_start_5
    sget-object v3, Lorg/apache/log4j/net/SocketNode;->e:Lorg/apache/log4j/Logger;

    new-instance v4, Ljava/lang/StringBuffer;

    invoke-direct {v4}, Ljava/lang/StringBuffer;-><init>()V

    const-string v5, "Caught java.io.IOException: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    invoke-virtual {v4}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Lorg/apache/log4j/Category;->info(Ljava/lang/Object;)V

    .line 18
    sget-object v2, Lorg/apache/log4j/net/SocketNode;->e:Lorg/apache/log4j/Logger;

    invoke-virtual {v2, v0}, Lorg/apache/log4j/Category;->info(Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 19
    iget-object v0, p0, Lorg/apache/log4j/net/SocketNode;->d:Ljava/io/ObjectInputStream;

    if-eqz v0, :cond_4

    .line 20
    :try_start_6
    invoke-virtual {v0}, Ljava/io/ObjectInputStream;->close()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_5

    goto :goto_4

    :catch_5
    move-exception v0

    .line 21
    sget-object v2, Lorg/apache/log4j/net/SocketNode;->e:Lorg/apache/log4j/Logger;

    invoke-virtual {v2, v1, v0}, Lorg/apache/log4j/Category;->info(Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 22
    :cond_4
    :goto_4
    iget-object v0, p0, Lorg/apache/log4j/net/SocketNode;->b:Ljava/net/Socket;

    if-eqz v0, :cond_8

    goto :goto_2

    :catch_6
    move-exception v2

    .line 23
    :try_start_7
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Thread;->interrupt()V

    .line 24
    sget-object v3, Lorg/apache/log4j/net/SocketNode;->e:Lorg/apache/log4j/Logger;

    new-instance v4, Ljava/lang/StringBuffer;

    invoke-direct {v4}, Ljava/lang/StringBuffer;-><init>()V

    const-string v5, "Caught java.io.InterruptedIOException: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    invoke-virtual {v4}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Lorg/apache/log4j/Category;->info(Ljava/lang/Object;)V

    .line 25
    sget-object v2, Lorg/apache/log4j/net/SocketNode;->e:Lorg/apache/log4j/Logger;

    invoke-virtual {v2, v0}, Lorg/apache/log4j/Category;->info(Ljava/lang/Object;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 26
    iget-object v0, p0, Lorg/apache/log4j/net/SocketNode;->d:Ljava/io/ObjectInputStream;

    if-eqz v0, :cond_5

    .line 27
    :try_start_8
    invoke-virtual {v0}, Ljava/io/ObjectInputStream;->close()V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_7

    goto :goto_5

    :catch_7
    move-exception v0

    .line 28
    sget-object v2, Lorg/apache/log4j/net/SocketNode;->e:Lorg/apache/log4j/Logger;

    invoke-virtual {v2, v1, v0}, Lorg/apache/log4j/Category;->info(Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 29
    :cond_5
    :goto_5
    iget-object v0, p0, Lorg/apache/log4j/net/SocketNode;->b:Ljava/net/Socket;

    if-eqz v0, :cond_8

    goto/16 :goto_2

    .line 30
    :catch_8
    :try_start_9
    sget-object v0, Lorg/apache/log4j/net/SocketNode;->e:Lorg/apache/log4j/Logger;

    const-string v2, "Caught java.net.SocketException closing conneciton."

    invoke-virtual {v0, v2}, Lorg/apache/log4j/Category;->info(Ljava/lang/Object;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 31
    iget-object v0, p0, Lorg/apache/log4j/net/SocketNode;->d:Ljava/io/ObjectInputStream;

    if-eqz v0, :cond_6

    .line 32
    :try_start_a
    invoke-virtual {v0}, Ljava/io/ObjectInputStream;->close()V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_9

    goto :goto_6

    :catch_9
    move-exception v0

    .line 33
    sget-object v2, Lorg/apache/log4j/net/SocketNode;->e:Lorg/apache/log4j/Logger;

    invoke-virtual {v2, v1, v0}, Lorg/apache/log4j/Category;->info(Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 34
    :cond_6
    :goto_6
    iget-object v0, p0, Lorg/apache/log4j/net/SocketNode;->b:Ljava/net/Socket;

    if-eqz v0, :cond_8

    goto/16 :goto_2

    .line 35
    :catch_a
    :try_start_b
    sget-object v0, Lorg/apache/log4j/net/SocketNode;->e:Lorg/apache/log4j/Logger;

    const-string v2, "Caught java.io.EOFException closing conneciton."

    invoke-virtual {v0, v2}, Lorg/apache/log4j/Category;->info(Ljava/lang/Object;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    .line 36
    iget-object v0, p0, Lorg/apache/log4j/net/SocketNode;->d:Ljava/io/ObjectInputStream;

    if-eqz v0, :cond_7

    .line 37
    :try_start_c
    invoke-virtual {v0}, Ljava/io/ObjectInputStream;->close()V
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_b

    goto :goto_7

    :catch_b
    move-exception v0

    .line 38
    sget-object v2, Lorg/apache/log4j/net/SocketNode;->e:Lorg/apache/log4j/Logger;

    invoke-virtual {v2, v1, v0}, Lorg/apache/log4j/Category;->info(Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 39
    :cond_7
    :goto_7
    iget-object v0, p0, Lorg/apache/log4j/net/SocketNode;->b:Ljava/net/Socket;

    if-eqz v0, :cond_8

    goto/16 :goto_2

    :catch_c
    :cond_8
    :goto_8
    return-void

    .line 40
    :goto_9
    iget-object v2, p0, Lorg/apache/log4j/net/SocketNode;->d:Ljava/io/ObjectInputStream;

    if-eqz v2, :cond_9

    .line 41
    :try_start_d
    invoke-virtual {v2}, Ljava/io/ObjectInputStream;->close()V
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_d

    goto :goto_a

    :catch_d
    move-exception v2

    .line 42
    sget-object v3, Lorg/apache/log4j/net/SocketNode;->e:Lorg/apache/log4j/Logger;

    invoke-virtual {v3, v1, v2}, Lorg/apache/log4j/Category;->info(Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 43
    :cond_9
    :goto_a
    iget-object v1, p0, Lorg/apache/log4j/net/SocketNode;->b:Ljava/net/Socket;

    if-eqz v1, :cond_a

    .line 44
    :try_start_e
    invoke-virtual {v1}, Ljava/net/Socket;->close()V
    :try_end_e
    .catch Ljava/io/InterruptedIOException; {:try_start_e .. :try_end_e} :catch_e
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_f

    goto :goto_b

    .line 45
    :catch_e
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    .line 46
    :catch_f
    :cond_a
    :goto_b
    throw v0
.end method
