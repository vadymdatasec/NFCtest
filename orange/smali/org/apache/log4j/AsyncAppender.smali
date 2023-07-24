.class public Lorg/apache/log4j/AsyncAppender;
.super Lorg/apache/log4j/AppenderSkeleton;
.source "SourceFile"

# interfaces
.implements Lorg/apache/log4j/spi/AppenderAttachable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/apache/log4j/AsyncAppender$b;,
        Lorg/apache/log4j/AsyncAppender$a;
    }
.end annotation


# static fields
.field public static final DEFAULT_BUFFER_SIZE:I = 0x80


# instance fields
.field public final h:Ljava/util/List;

.field public final i:Ljava/util/Map;

.field public j:I

.field public final k:Lorg/apache/log4j/helpers/AppenderAttachableImpl;

.field public final l:Ljava/lang/Thread;

.field public m:Z

.field public n:Z


# direct methods
.method public constructor <init>()V
    .locals 6

    .line 1
    invoke-direct {p0}, Lorg/apache/log4j/AppenderSkeleton;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lorg/apache/log4j/AsyncAppender;->h:Ljava/util/List;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lorg/apache/log4j/AsyncAppender;->i:Ljava/util/Map;

    const/16 v0, 0x80

    .line 4
    iput v0, p0, Lorg/apache/log4j/AsyncAppender;->j:I

    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lorg/apache/log4j/AsyncAppender;->m:Z

    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lorg/apache/log4j/AsyncAppender;->n:Z

    .line 7
    new-instance v1, Lorg/apache/log4j/helpers/AppenderAttachableImpl;

    invoke-direct {v1}, Lorg/apache/log4j/helpers/AppenderAttachableImpl;-><init>()V

    iput-object v1, p0, Lorg/apache/log4j/AsyncAppender;->k:Lorg/apache/log4j/helpers/AppenderAttachableImpl;

    .line 8
    new-instance v1, Ljava/lang/Thread;

    new-instance v2, Lorg/apache/log4j/AsyncAppender$b;

    iget-object v3, p0, Lorg/apache/log4j/AsyncAppender;->h:Ljava/util/List;

    iget-object v4, p0, Lorg/apache/log4j/AsyncAppender;->i:Ljava/util/Map;

    iget-object v5, p0, Lorg/apache/log4j/AsyncAppender;->k:Lorg/apache/log4j/helpers/AppenderAttachableImpl;

    invoke-direct {v2, p0, v3, v4, v5}, Lorg/apache/log4j/AsyncAppender$b;-><init>(Lorg/apache/log4j/AsyncAppender;Ljava/util/List;Ljava/util/Map;Lorg/apache/log4j/helpers/AppenderAttachableImpl;)V

    invoke-direct {v1, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    iput-object v1, p0, Lorg/apache/log4j/AsyncAppender;->l:Ljava/lang/Thread;

    .line 9
    invoke-virtual {v1, v0}, Ljava/lang/Thread;->setDaemon(Z)V

    .line 10
    iget-object v0, p0, Lorg/apache/log4j/AsyncAppender;->l:Ljava/lang/Thread;

    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    const-string v2, "AsyncAppender-Dispatcher-"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v2, p0, Lorg/apache/log4j/AsyncAppender;->l:Ljava/lang/Thread;

    invoke-virtual {v2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 11
    iget-object v0, p0, Lorg/apache/log4j/AsyncAppender;->l:Ljava/lang/Thread;

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void
.end method


# virtual methods
.method public addAppender(Lorg/apache/log4j/Appender;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/AsyncAppender;->k:Lorg/apache/log4j/helpers/AppenderAttachableImpl;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Lorg/apache/log4j/AsyncAppender;->k:Lorg/apache/log4j/helpers/AppenderAttachableImpl;

    invoke-virtual {v1, p1}, Lorg/apache/log4j/helpers/AppenderAttachableImpl;->addAppender(Lorg/apache/log4j/Appender;)V

    .line 3
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public append(Lorg/apache/log4j/spi/LoggingEvent;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/AsyncAppender;->l:Ljava/lang/Thread;

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Ljava/lang/Thread;->isAlive()Z

    move-result v0

    if-eqz v0, :cond_7

    iget v0, p0, Lorg/apache/log4j/AsyncAppender;->j:I

    if-gtz v0, :cond_0

    goto/16 :goto_2

    .line 2
    :cond_0
    invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getNDC()Ljava/lang/String;

    .line 3
    invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getThreadName()Ljava/lang/String;

    .line 4
    invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getMDCCopy()V

    .line 5
    iget-boolean v0, p0, Lorg/apache/log4j/AsyncAppender;->m:Z

    if-eqz v0, :cond_1

    .line 6
    invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getLocationInformation()Lorg/apache/log4j/spi/LocationInfo;

    .line 7
    :cond_1
    invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getRenderedMessage()Ljava/lang/String;

    .line 8
    invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getThrowableStrRep()[Ljava/lang/String;

    .line 9
    iget-object v0, p0, Lorg/apache/log4j/AsyncAppender;->h:Ljava/util/List;

    monitor-enter v0

    .line 10
    :cond_2
    :try_start_0
    iget-object v1, p0, Lorg/apache/log4j/AsyncAppender;->h:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    .line 11
    iget v2, p0, Lorg/apache/log4j/AsyncAppender;->j:I

    if-ge v1, v2, :cond_3

    .line 12
    iget-object v2, p0, Lorg/apache/log4j/AsyncAppender;->h:Ljava/util/List;

    invoke-interface {v2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-nez v1, :cond_6

    .line 13
    iget-object p1, p0, Lorg/apache/log4j/AsyncAppender;->h:Ljava/util/List;

    invoke-virtual {p1}, Ljava/lang/Object;->notifyAll()V

    goto :goto_1

    :cond_3
    const/4 v1, 0x1

    .line 14
    iget-boolean v2, p0, Lorg/apache/log4j/AsyncAppender;->n:Z

    if-eqz v2, :cond_4

    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    move-result v2

    if-nez v2, :cond_4

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    iget-object v3, p0, Lorg/apache/log4j/AsyncAppender;->l:Ljava/lang/Thread;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eq v2, v3, :cond_4

    .line 15
    :try_start_1
    iget-object v2, p0, Lorg/apache/log4j/AsyncAppender;->h:Ljava/util/List;

    invoke-virtual {v2}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v1, 0x0

    goto :goto_0

    .line 16
    :catch_0
    :try_start_2
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Thread;->interrupt()V

    :cond_4
    :goto_0
    if-eqz v1, :cond_2

    .line 17
    invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getLoggerName()Ljava/lang/String;

    move-result-object v1

    .line 18
    iget-object v2, p0, Lorg/apache/log4j/AsyncAppender;->i:Ljava/util/Map;

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/apache/log4j/AsyncAppender$a;

    if-nez v2, :cond_5

    .line 19
    new-instance v2, Lorg/apache/log4j/AsyncAppender$a;

    invoke-direct {v2, p1}, Lorg/apache/log4j/AsyncAppender$a;-><init>(Lorg/apache/log4j/spi/LoggingEvent;)V

    .line 20
    iget-object p1, p0, Lorg/apache/log4j/AsyncAppender;->i:Ljava/util/Map;

    invoke-interface {p1, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 21
    :cond_5
    invoke-virtual {v2, p1}, Lorg/apache/log4j/AsyncAppender$a;->a(Lorg/apache/log4j/spi/LoggingEvent;)V

    .line 22
    :cond_6
    :goto_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1

    .line 23
    :cond_7
    :goto_2
    iget-object v0, p0, Lorg/apache/log4j/AsyncAppender;->k:Lorg/apache/log4j/helpers/AppenderAttachableImpl;

    monitor-enter v0

    .line 24
    :try_start_3
    iget-object v1, p0, Lorg/apache/log4j/AsyncAppender;->k:Lorg/apache/log4j/helpers/AppenderAttachableImpl;

    invoke-virtual {v1, p1}, Lorg/apache/log4j/helpers/AppenderAttachableImpl;->appendLoopOnAppenders(Lorg/apache/log4j/spi/LoggingEvent;)I

    .line 25
    monitor-exit v0

    return-void

    :catchall_1
    move-exception p1

    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw p1
.end method

.method public close()V
    .locals 4

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/AsyncAppender;->h:Ljava/util/List;

    monitor-enter v0

    const/4 v1, 0x1

    .line 2
    :try_start_0
    iput-boolean v1, p0, Lorg/apache/log4j/AppenderSkeleton;->g:Z

    .line 3
    iget-object v1, p0, Lorg/apache/log4j/AsyncAppender;->h:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    .line 4
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 5
    :try_start_1
    iget-object v0, p0, Lorg/apache/log4j/AsyncAppender;->l:Ljava/lang/Thread;

    invoke-virtual {v0}, Ljava/lang/Thread;->join()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 6
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    const-string v1, "Got an InterruptedException while waiting for the dispatcher to finish."

    .line 7
    invoke-static {v1, v0}, Lorg/apache/log4j/helpers/LogLog;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 8
    :goto_0
    iget-object v1, p0, Lorg/apache/log4j/AsyncAppender;->k:Lorg/apache/log4j/helpers/AppenderAttachableImpl;

    monitor-enter v1

    .line 9
    :try_start_2
    iget-object v0, p0, Lorg/apache/log4j/AsyncAppender;->k:Lorg/apache/log4j/helpers/AppenderAttachableImpl;

    invoke-virtual {v0}, Lorg/apache/log4j/helpers/AppenderAttachableImpl;->getAllAppenders()Ljava/util/Enumeration;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 10
    :cond_0
    :goto_1
    invoke-interface {v0}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 11
    invoke-interface {v0}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v2

    .line 12
    instance-of v3, v2, Lorg/apache/log4j/Appender;

    if-eqz v3, :cond_0

    .line 13
    check-cast v2, Lorg/apache/log4j/Appender;

    invoke-interface {v2}, Lorg/apache/log4j/Appender;->close()V

    goto :goto_1

    .line 14
    :cond_1
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    :catchall_1
    move-exception v1

    .line 15
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v1
.end method

.method public getAllAppenders()Ljava/util/Enumeration;
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/AsyncAppender;->k:Lorg/apache/log4j/helpers/AppenderAttachableImpl;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Lorg/apache/log4j/AsyncAppender;->k:Lorg/apache/log4j/helpers/AppenderAttachableImpl;

    invoke-virtual {v1}, Lorg/apache/log4j/helpers/AppenderAttachableImpl;->getAllAppenders()Ljava/util/Enumeration;

    move-result-object v1

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 3
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public getAppender(Ljava/lang/String;)Lorg/apache/log4j/Appender;
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/AsyncAppender;->k:Lorg/apache/log4j/helpers/AppenderAttachableImpl;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Lorg/apache/log4j/AsyncAppender;->k:Lorg/apache/log4j/helpers/AppenderAttachableImpl;

    invoke-virtual {v1, p1}, Lorg/apache/log4j/helpers/AppenderAttachableImpl;->getAppender(Ljava/lang/String;)Lorg/apache/log4j/Appender;

    move-result-object p1

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    .line 3
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public getBlocking()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lorg/apache/log4j/AsyncAppender;->n:Z

    return v0
.end method

.method public getBufferSize()I
    .locals 1

    .line 1
    iget v0, p0, Lorg/apache/log4j/AsyncAppender;->j:I

    return v0
.end method

.method public getLocationInfo()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lorg/apache/log4j/AsyncAppender;->m:Z

    return v0
.end method

.method public isAttached(Lorg/apache/log4j/Appender;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/AsyncAppender;->k:Lorg/apache/log4j/helpers/AppenderAttachableImpl;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Lorg/apache/log4j/AsyncAppender;->k:Lorg/apache/log4j/helpers/AppenderAttachableImpl;

    invoke-virtual {v1, p1}, Lorg/apache/log4j/helpers/AppenderAttachableImpl;->isAttached(Lorg/apache/log4j/Appender;)Z

    move-result p1

    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    .line 3
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public removeAllAppenders()V
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/AsyncAppender;->k:Lorg/apache/log4j/helpers/AppenderAttachableImpl;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Lorg/apache/log4j/AsyncAppender;->k:Lorg/apache/log4j/helpers/AppenderAttachableImpl;

    invoke-virtual {v1}, Lorg/apache/log4j/helpers/AppenderAttachableImpl;->removeAllAppenders()V

    .line 3
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public removeAppender(Ljava/lang/String;)V
    .locals 2

    .line 4
    iget-object v0, p0, Lorg/apache/log4j/AsyncAppender;->k:Lorg/apache/log4j/helpers/AppenderAttachableImpl;

    monitor-enter v0

    .line 5
    :try_start_0
    iget-object v1, p0, Lorg/apache/log4j/AsyncAppender;->k:Lorg/apache/log4j/helpers/AppenderAttachableImpl;

    invoke-virtual {v1, p1}, Lorg/apache/log4j/helpers/AppenderAttachableImpl;->removeAppender(Ljava/lang/String;)V

    .line 6
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public removeAppender(Lorg/apache/log4j/Appender;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/AsyncAppender;->k:Lorg/apache/log4j/helpers/AppenderAttachableImpl;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Lorg/apache/log4j/AsyncAppender;->k:Lorg/apache/log4j/helpers/AppenderAttachableImpl;

    invoke-virtual {v1, p1}, Lorg/apache/log4j/helpers/AppenderAttachableImpl;->removeAppender(Lorg/apache/log4j/Appender;)V

    .line 3
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public requiresLayout()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public setBlocking(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/AsyncAppender;->h:Ljava/util/List;

    monitor-enter v0

    .line 2
    :try_start_0
    iput-boolean p1, p0, Lorg/apache/log4j/AsyncAppender;->n:Z

    .line 3
    iget-object p1, p0, Lorg/apache/log4j/AsyncAppender;->h:Ljava/util/List;

    invoke-virtual {p1}, Ljava/lang/Object;->notifyAll()V

    .line 4
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public setBufferSize(I)V
    .locals 2

    if-ltz p1, :cond_1

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/AsyncAppender;->h:Ljava/util/List;

    monitor-enter v0

    const/4 v1, 0x1

    if-ge p1, v1, :cond_0

    const/4 p1, 0x1

    .line 2
    :cond_0
    :try_start_0
    iput p1, p0, Lorg/apache/log4j/AsyncAppender;->j:I

    .line 3
    iget-object p1, p0, Lorg/apache/log4j/AsyncAppender;->h:Ljava/util/List;

    invoke-virtual {p1}, Ljava/lang/Object;->notifyAll()V

    .line 4
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    .line 5
    :cond_1
    new-instance p1, Ljava/lang/NegativeArraySizeException;

    const-string v0, "size"

    invoke-direct {p1, v0}, Ljava/lang/NegativeArraySizeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setLocationInfo(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lorg/apache/log4j/AsyncAppender;->m:Z

    return-void
.end method
