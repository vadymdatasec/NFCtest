.class public Lorg/apache/log4j/helpers/OnlyOnceErrorHandler;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/apache/log4j/spi/ErrorHandler;


# instance fields
.field public a:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lorg/apache/log4j/helpers/OnlyOnceErrorHandler;->a:Z

    return-void
.end method


# virtual methods
.method public activateOptions()V
    .locals 0

    return-void
.end method

.method public error(Ljava/lang/String;)V
    .locals 1

    .line 7
    iget-boolean v0, p0, Lorg/apache/log4j/helpers/OnlyOnceErrorHandler;->a:Z

    if-eqz v0, :cond_0

    .line 8
    invoke-static {p1}, Lorg/apache/log4j/helpers/LogLog;->error(Ljava/lang/String;)V

    const/4 p1, 0x0

    .line 9
    iput-boolean p1, p0, Lorg/apache/log4j/helpers/OnlyOnceErrorHandler;->a:Z

    :cond_0
    return-void
.end method

.method public error(Ljava/lang/String;Ljava/lang/Exception;I)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, p2, p3, v0}, Lorg/apache/log4j/helpers/OnlyOnceErrorHandler;->error(Ljava/lang/String;Ljava/lang/Exception;ILorg/apache/log4j/spi/LoggingEvent;)V

    return-void
.end method

.method public error(Ljava/lang/String;Ljava/lang/Exception;ILorg/apache/log4j/spi/LoggingEvent;)V
    .locals 0

    .line 2
    instance-of p3, p2, Ljava/io/InterruptedIOException;

    if-nez p3, :cond_0

    instance-of p3, p2, Ljava/lang/InterruptedException;

    if-eqz p3, :cond_1

    .line 3
    :cond_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/Thread;->interrupt()V

    .line 4
    :cond_1
    iget-boolean p3, p0, Lorg/apache/log4j/helpers/OnlyOnceErrorHandler;->a:Z

    if-eqz p3, :cond_2

    .line 5
    invoke-static {p1, p2}, Lorg/apache/log4j/helpers/LogLog;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    .line 6
    iput-boolean p1, p0, Lorg/apache/log4j/helpers/OnlyOnceErrorHandler;->a:Z

    :cond_2
    return-void
.end method

.method public setAppender(Lorg/apache/log4j/Appender;)V
    .locals 0

    return-void
.end method

.method public setBackupAppender(Lorg/apache/log4j/Appender;)V
    .locals 0

    return-void
.end method

.method public setLogger(Lorg/apache/log4j/Logger;)V
    .locals 0

    return-void
.end method
