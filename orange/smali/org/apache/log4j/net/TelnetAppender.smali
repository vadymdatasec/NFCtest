.class public Lorg/apache/log4j/net/TelnetAppender;
.super Lorg/apache/log4j/AppenderSkeleton;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/apache/log4j/net/TelnetAppender$SocketHandler;
    }
.end annotation


# instance fields
.field public h:Lorg/apache/log4j/net/TelnetAppender$SocketHandler;

.field public i:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lorg/apache/log4j/AppenderSkeleton;-><init>()V

    const/16 v0, 0x17

    .line 2
    iput v0, p0, Lorg/apache/log4j/net/TelnetAppender;->i:I

    return-void
.end method


# virtual methods
.method public activateOptions()V
    .locals 2

    .line 1
    :try_start_0
    new-instance v0, Lorg/apache/log4j/net/TelnetAppender$SocketHandler;

    iget v1, p0, Lorg/apache/log4j/net/TelnetAppender;->i:I

    invoke-direct {v0, p0, v1}, Lorg/apache/log4j/net/TelnetAppender$SocketHandler;-><init>(Lorg/apache/log4j/net/TelnetAppender;I)V

    iput-object v0, p0, Lorg/apache/log4j/net/TelnetAppender;->h:Lorg/apache/log4j/net/TelnetAppender$SocketHandler;

    .line 2
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V
    :try_end_0
    .catch Ljava/io/InterruptedIOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 3
    invoke-virtual {v0}, Ljava/lang/RuntimeException;->printStackTrace()V

    goto :goto_0

    :catch_1
    move-exception v0

    .line 4
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_0

    :catch_2
    move-exception v0

    .line 5
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    .line 6
    invoke-virtual {v0}, Ljava/io/InterruptedIOException;->printStackTrace()V

    .line 7
    :goto_0
    invoke-super {p0}, Lorg/apache/log4j/AppenderSkeleton;->activateOptions()V

    return-void
.end method

.method public append(Lorg/apache/log4j/spi/LoggingEvent;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/net/TelnetAppender;->h:Lorg/apache/log4j/net/TelnetAppender$SocketHandler;

    if-eqz v0, :cond_1

    .line 2
    iget-object v1, p0, Lorg/apache/log4j/AppenderSkeleton;->a:Lorg/apache/log4j/Layout;

    invoke-virtual {v1, p1}, Lorg/apache/log4j/Layout;->format(Lorg/apache/log4j/spi/LoggingEvent;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/apache/log4j/net/TelnetAppender$SocketHandler;->send(Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lorg/apache/log4j/AppenderSkeleton;->a:Lorg/apache/log4j/Layout;

    invoke-virtual {v0}, Lorg/apache/log4j/Layout;->ignoresThrowable()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getThrowableStrRep()[Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 5
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    const/4 v1, 0x0

    .line 6
    :goto_0
    array-length v2, p1

    if-ge v1, v2, :cond_0

    .line 7
    aget-object v2, p1, v1

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v2, "\r\n"

    .line 8
    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 9
    :cond_0
    iget-object p1, p0, Lorg/apache/log4j/net/TelnetAppender;->h:Lorg/apache/log4j/net/TelnetAppender$SocketHandler;

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lorg/apache/log4j/net/TelnetAppender$SocketHandler;->send(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public close()V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/net/TelnetAppender;->h:Lorg/apache/log4j/net/TelnetAppender$SocketHandler;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lorg/apache/log4j/net/TelnetAppender$SocketHandler;->close()V

    .line 3
    :try_start_0
    iget-object v0, p0, Lorg/apache/log4j/net/TelnetAppender;->h:Lorg/apache/log4j/net/TelnetAppender$SocketHandler;

    invoke-virtual {v0}, Ljava/lang/Thread;->join()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 4
    :catch_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    :cond_0
    :goto_0
    return-void
.end method

.method public getPort()I
    .locals 1

    .line 1
    iget v0, p0, Lorg/apache/log4j/net/TelnetAppender;->i:I

    return v0
.end method

.method public requiresLayout()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public setPort(I)V
    .locals 0

    .line 1
    iput p1, p0, Lorg/apache/log4j/net/TelnetAppender;->i:I

    return-void
.end method
