.class public Lorg/apache/log4j/rewrite/RewriteAppender;
.super Lorg/apache/log4j/AppenderSkeleton;
.source "SourceFile"

# interfaces
.implements Lorg/apache/log4j/spi/AppenderAttachable;
.implements Lorg/apache/log4j/xml/UnrecognizedElementHandler;


# static fields
.field public static synthetic j:Ljava/lang/Class;


# instance fields
.field public h:Lorg/apache/log4j/rewrite/RewritePolicy;

.field public final i:Lorg/apache/log4j/helpers/AppenderAttachableImpl;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lorg/apache/log4j/AppenderSkeleton;-><init>()V

    .line 2
    new-instance v0, Lorg/apache/log4j/helpers/AppenderAttachableImpl;

    invoke-direct {v0}, Lorg/apache/log4j/helpers/AppenderAttachableImpl;-><init>()V

    iput-object v0, p0, Lorg/apache/log4j/rewrite/RewriteAppender;->i:Lorg/apache/log4j/helpers/AppenderAttachableImpl;

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
.method public addAppender(Lorg/apache/log4j/Appender;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/rewrite/RewriteAppender;->i:Lorg/apache/log4j/helpers/AppenderAttachableImpl;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Lorg/apache/log4j/rewrite/RewriteAppender;->i:Lorg/apache/log4j/helpers/AppenderAttachableImpl;

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
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/rewrite/RewriteAppender;->h:Lorg/apache/log4j/rewrite/RewritePolicy;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0, p1}, Lorg/apache/log4j/rewrite/RewritePolicy;->rewrite(Lorg/apache/log4j/spi/LoggingEvent;)Lorg/apache/log4j/spi/LoggingEvent;

    move-result-object p1

    :cond_0
    if-eqz p1, :cond_1

    .line 3
    iget-object v0, p0, Lorg/apache/log4j/rewrite/RewriteAppender;->i:Lorg/apache/log4j/helpers/AppenderAttachableImpl;

    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lorg/apache/log4j/rewrite/RewriteAppender;->i:Lorg/apache/log4j/helpers/AppenderAttachableImpl;

    invoke-virtual {v1, p1}, Lorg/apache/log4j/helpers/AppenderAttachableImpl;->appendLoopOnAppenders(Lorg/apache/log4j/spi/LoggingEvent;)I

    .line 5
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_1
    :goto_0
    return-void
.end method

.method public close()V
    .locals 4

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lorg/apache/log4j/AppenderSkeleton;->g:Z

    .line 2
    iget-object v0, p0, Lorg/apache/log4j/rewrite/RewriteAppender;->i:Lorg/apache/log4j/helpers/AppenderAttachableImpl;

    monitor-enter v0

    .line 3
    :try_start_0
    iget-object v1, p0, Lorg/apache/log4j/rewrite/RewriteAppender;->i:Lorg/apache/log4j/helpers/AppenderAttachableImpl;

    invoke-virtual {v1}, Lorg/apache/log4j/helpers/AppenderAttachableImpl;->getAllAppenders()Ljava/util/Enumeration;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 4
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 5
    invoke-interface {v1}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v2

    .line 6
    instance-of v3, v2, Lorg/apache/log4j/Appender;

    if-eqz v3, :cond_0

    .line 7
    check-cast v2, Lorg/apache/log4j/Appender;

    invoke-interface {v2}, Lorg/apache/log4j/Appender;->close()V

    goto :goto_0

    .line 8
    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public getAllAppenders()Ljava/util/Enumeration;
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/rewrite/RewriteAppender;->i:Lorg/apache/log4j/helpers/AppenderAttachableImpl;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Lorg/apache/log4j/rewrite/RewriteAppender;->i:Lorg/apache/log4j/helpers/AppenderAttachableImpl;

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
    iget-object v0, p0, Lorg/apache/log4j/rewrite/RewriteAppender;->i:Lorg/apache/log4j/helpers/AppenderAttachableImpl;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Lorg/apache/log4j/rewrite/RewriteAppender;->i:Lorg/apache/log4j/helpers/AppenderAttachableImpl;

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

.method public isAttached(Lorg/apache/log4j/Appender;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/rewrite/RewriteAppender;->i:Lorg/apache/log4j/helpers/AppenderAttachableImpl;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Lorg/apache/log4j/rewrite/RewriteAppender;->i:Lorg/apache/log4j/helpers/AppenderAttachableImpl;

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

.method public parseUnrecognizedElement(Lorg/w3c/dom/Element;Ljava/util/Properties;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Lorg/w3c/dom/Element;->getNodeName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rewritePolicy"

    .line 2
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 3
    sget-object v0, Lorg/apache/log4j/rewrite/RewriteAppender;->j:Ljava/lang/Class;

    if-nez v0, :cond_0

    const-string v0, "org.apache.log4j.rewrite.RewritePolicy"

    invoke-static {v0}, Lorg/apache/log4j/rewrite/RewriteAppender;->a(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    sput-object v0, Lorg/apache/log4j/rewrite/RewriteAppender;->j:Ljava/lang/Class;

    :cond_0
    invoke-static {p1, p2, v0}, Lorg/apache/log4j/xml/DOMConfigurator;->parseElement(Lorg/w3c/dom/Element;Ljava/util/Properties;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 4
    instance-of p2, p1, Lorg/apache/log4j/spi/OptionHandler;

    if-eqz p2, :cond_1

    .line 5
    move-object p2, p1

    check-cast p2, Lorg/apache/log4j/spi/OptionHandler;

    invoke-interface {p2}, Lorg/apache/log4j/spi/OptionHandler;->activateOptions()V

    .line 6
    :cond_1
    check-cast p1, Lorg/apache/log4j/rewrite/RewritePolicy;

    invoke-virtual {p0, p1}, Lorg/apache/log4j/rewrite/RewriteAppender;->setRewritePolicy(Lorg/apache/log4j/rewrite/RewritePolicy;)V

    :cond_2
    const/4 p1, 0x1

    return p1

    :cond_3
    const/4 p1, 0x0

    return p1
.end method

.method public removeAllAppenders()V
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/rewrite/RewriteAppender;->i:Lorg/apache/log4j/helpers/AppenderAttachableImpl;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Lorg/apache/log4j/rewrite/RewriteAppender;->i:Lorg/apache/log4j/helpers/AppenderAttachableImpl;

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
    iget-object v0, p0, Lorg/apache/log4j/rewrite/RewriteAppender;->i:Lorg/apache/log4j/helpers/AppenderAttachableImpl;

    monitor-enter v0

    .line 5
    :try_start_0
    iget-object v1, p0, Lorg/apache/log4j/rewrite/RewriteAppender;->i:Lorg/apache/log4j/helpers/AppenderAttachableImpl;

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
    iget-object v0, p0, Lorg/apache/log4j/rewrite/RewriteAppender;->i:Lorg/apache/log4j/helpers/AppenderAttachableImpl;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Lorg/apache/log4j/rewrite/RewriteAppender;->i:Lorg/apache/log4j/helpers/AppenderAttachableImpl;

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

.method public setRewritePolicy(Lorg/apache/log4j/rewrite/RewritePolicy;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/apache/log4j/rewrite/RewriteAppender;->h:Lorg/apache/log4j/rewrite/RewritePolicy;

    return-void
.end method
