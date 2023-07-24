.class public Lm/a/b/h/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final b:Ljava/net/Socket;

.field public final synthetic c:Lm/a/b/h/n;


# direct methods
.method public constructor <init>(Lm/a/b/h/n;Ljava/net/Socket;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lm/a/b/h/m;->c:Lm/a/b/h/n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p2, p0, Lm/a/b/h/m;->b:Ljava/net/Socket;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    invoke-static {}, Lm/a/b/h/n;->a()Lorg/apache/log4j/Logger;

    move-result-object v0

    const-string v1, "Starting to get data"

    invoke-virtual {v0, v1}, Lorg/apache/log4j/Category;->debug(Ljava/lang/Object;)V

    .line 2
    :try_start_0
    new-instance v0, Ljava/io/ObjectInputStream;

    iget-object v1, p0, Lm/a/b/h/m;->b:Ljava/net/Socket;

    invoke-virtual {v1}, Ljava/net/Socket;->getInputStream()Ljava/io/InputStream;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/ObjectInputStream;-><init>(Ljava/io/InputStream;)V

    .line 3
    :goto_0
    invoke-virtual {v0}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/apache/log4j/spi/LoggingEvent;

    .line 4
    iget-object v2, p0, Lm/a/b/h/m;->c:Lm/a/b/h/n;

    invoke-static {v2}, Lm/a/b/h/n;->a(Lm/a/b/h/n;)Lm/a/b/h/r;

    move-result-object v2

    new-instance v3, Lm/a/b/h/j;

    invoke-direct {v3, v1}, Lm/a/b/h/j;-><init>(Lorg/apache/log4j/spi/LoggingEvent;)V

    invoke-virtual {v2, v3}, Lm/a/b/h/r;->a(Lm/a/b/h/j;)V
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/net/SocketException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 5
    invoke-static {}, Lm/a/b/h/n;->a()Lorg/apache/log4j/Logger;

    move-result-object v1

    const-string v2, "Got ClassNotFoundException, closing connection"

    invoke-virtual {v1, v2, v0}, Lorg/apache/log4j/Category;->warn(Ljava/lang/Object;Ljava/lang/Throwable;)V

    goto :goto_1

    :catch_1
    move-exception v0

    .line 6
    invoke-static {}, Lm/a/b/h/n;->a()Lorg/apache/log4j/Logger;

    move-result-object v1

    const-string v2, "Got IOException, closing connection"

    invoke-virtual {v1, v2, v0}, Lorg/apache/log4j/Category;->warn(Ljava/lang/Object;Ljava/lang/Throwable;)V

    goto :goto_1

    .line 7
    :catch_2
    invoke-static {}, Lm/a/b/h/n;->a()Lorg/apache/log4j/Logger;

    move-result-object v0

    const-string v1, "Caught SocketException, closing connection"

    invoke-virtual {v0, v1}, Lorg/apache/log4j/Category;->info(Ljava/lang/Object;)V

    goto :goto_1

    .line 8
    :catch_3
    invoke-static {}, Lm/a/b/h/n;->a()Lorg/apache/log4j/Logger;

    move-result-object v0

    const-string v1, "Reached EOF, closing connection"

    invoke-virtual {v0, v1}, Lorg/apache/log4j/Category;->info(Ljava/lang/Object;)V

    .line 9
    :goto_1
    :try_start_1
    iget-object v0, p0, Lm/a/b/h/m;->b:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_4

    goto :goto_2

    :catch_4
    move-exception v0

    .line 10
    invoke-static {}, Lm/a/b/h/n;->a()Lorg/apache/log4j/Logger;

    move-result-object v1

    const-string v2, "Error closing connection"

    invoke-virtual {v1, v2, v0}, Lorg/apache/log4j/Category;->warn(Ljava/lang/Object;Ljava/lang/Throwable;)V

    :goto_2
    return-void
.end method
