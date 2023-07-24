.class public Lm/a/b/h/n;
.super Ljava/lang/Thread;
.source "SourceFile"


# static fields
.field public static final d:Lorg/apache/log4j/Logger;

.field public static synthetic e:Ljava/lang/Class;


# instance fields
.field public b:Lm/a/b/h/r;

.field public c:Ljava/net/ServerSocket;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lm/a/b/h/n;->e:Ljava/lang/Class;

    if-nez v0, :cond_0

    const-string v0, "org.apache.log4j.chainsaw.LoggingReceiver"

    invoke-static {v0}, Lm/a/b/h/n;->a(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    sput-object v0, Lm/a/b/h/n;->e:Ljava/lang/Class;

    :cond_0
    invoke-static {v0}, Lorg/apache/log4j/Logger;->getLogger(Ljava/lang/Class;)Lorg/apache/log4j/Logger;

    move-result-object v0

    sput-object v0, Lm/a/b/h/n;->d:Lorg/apache/log4j/Logger;

    return-void
.end method

.method public constructor <init>(Lm/a/b/h/r;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Ljava/lang/Thread;->setDaemon(Z)V

    .line 3
    iput-object p1, p0, Lm/a/b/h/n;->b:Lm/a/b/h/r;

    .line 4
    new-instance p1, Ljava/net/ServerSocket;

    invoke-direct {p1, p2}, Ljava/net/ServerSocket;-><init>(I)V

    iput-object p1, p0, Lm/a/b/h/n;->c:Ljava/net/ServerSocket;

    return-void
.end method

.method public static synthetic a(Ljava/lang/String;)Ljava/lang/Class;
    .locals 1

    .line 3
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

.method public static synthetic a(Lm/a/b/h/n;)Lm/a/b/h/r;
    .locals 0

    .line 2
    iget-object p0, p0, Lm/a/b/h/n;->b:Lm/a/b/h/r;

    return-object p0
.end method

.method public static synthetic a()Lorg/apache/log4j/Logger;
    .locals 1

    .line 1
    sget-object v0, Lm/a/b/h/n;->d:Lorg/apache/log4j/Logger;

    return-object v0
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    sget-object v0, Lm/a/b/h/n;->d:Lorg/apache/log4j/Logger;

    const-string v1, "Thread started"

    invoke-virtual {v0, v1}, Lorg/apache/log4j/Category;->info(Ljava/lang/Object;)V

    .line 2
    :goto_0
    :try_start_0
    sget-object v0, Lm/a/b/h/n;->d:Lorg/apache/log4j/Logger;

    const-string v1, "Waiting for a connection"

    invoke-virtual {v0, v1}, Lorg/apache/log4j/Category;->debug(Ljava/lang/Object;)V

    .line 3
    iget-object v0, p0, Lm/a/b/h/n;->c:Ljava/net/ServerSocket;

    invoke-virtual {v0}, Ljava/net/ServerSocket;->accept()Ljava/net/Socket;

    move-result-object v0

    .line 4
    sget-object v1, Lm/a/b/h/n;->d:Lorg/apache/log4j/Logger;

    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    const-string v3, "Got a connection from "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0}, Ljava/net/Socket;->getInetAddress()Ljava/net/InetAddress;

    move-result-object v3

    invoke-virtual {v3}, Ljava/net/InetAddress;->getHostName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lorg/apache/log4j/Category;->debug(Ljava/lang/Object;)V

    .line 5
    new-instance v1, Ljava/lang/Thread;

    new-instance v2, Lm/a/b/h/m;

    invoke-direct {v2, p0, v0}, Lm/a/b/h/m;-><init>(Lm/a/b/h/n;Ljava/net/Socket;)V

    invoke-direct {v1, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    const/4 v0, 0x1

    .line 6
    invoke-virtual {v1, v0}, Ljava/lang/Thread;->setDaemon(Z)V

    .line 7
    invoke-virtual {v1}, Ljava/lang/Thread;->start()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 8
    sget-object v1, Lm/a/b/h/n;->d:Lorg/apache/log4j/Logger;

    const-string v2, "Error in accepting connections, stopping."

    invoke-virtual {v1, v2, v0}, Lorg/apache/log4j/Category;->error(Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-void
.end method
