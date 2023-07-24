.class public Lorg/apache/log4j/net/JMSAppender;
.super Lorg/apache/log4j/AppenderSkeleton;
.source "SourceFile"


# instance fields
.field public h:Ljava/lang/String;

.field public i:Ljava/lang/String;

.field public j:Ljava/lang/String;

.field public k:Ljava/lang/String;

.field public l:Ljava/lang/String;

.field public m:Ljava/lang/String;

.field public n:Ljava/lang/String;

.field public o:Ljava/lang/String;

.field public p:Ljava/lang/String;

.field public q:Z

.field public r:Ljavax/jms/TopicConnection;

.field public s:Ljavax/jms/TopicSession;

.field public t:Ljavax/jms/TopicPublisher;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/apache/log4j/AppenderSkeleton;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljavax/naming/Context;Ljava/lang/String;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljavax/naming/NamingException;
        }
    .end annotation

    .line 1
    :try_start_0
    invoke-interface {p1, p2}, Ljavax/naming/Context;->lookup(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljavax/naming/NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 2
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    const-string v1, "Could not find name ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string p2, "]."

    invoke-virtual {v0, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lorg/apache/log4j/helpers/LogLog;->error(Ljava/lang/String;)V

    .line 3
    throw p1
.end method

.method public a()Z
    .locals 3

    .line 4
    iget-object v0, p0, Lorg/apache/log4j/net/JMSAppender;->r:Ljavax/jms/TopicConnection;

    if-nez v0, :cond_0

    const-string v0, "No TopicConnection"

    goto :goto_0

    .line 5
    :cond_0
    iget-object v0, p0, Lorg/apache/log4j/net/JMSAppender;->s:Ljavax/jms/TopicSession;

    if-nez v0, :cond_1

    const-string v0, "No TopicSession"

    goto :goto_0

    .line 6
    :cond_1
    iget-object v0, p0, Lorg/apache/log4j/net/JMSAppender;->t:Ljavax/jms/TopicPublisher;

    if-nez v0, :cond_2

    const-string v0, "No TopicPublisher"

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_3

    .line 7
    iget-object v1, p0, Lorg/apache/log4j/AppenderSkeleton;->d:Lorg/apache/log4j/spi/ErrorHandler;

    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v0, " for JMSAppender named ["

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v0, p0, Lorg/apache/log4j/AppenderSkeleton;->b:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v0, "]."

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Lorg/apache/log4j/spi/ErrorHandler;->error(Ljava/lang/String;)V

    const/4 v0, 0x0

    return v0

    :cond_3
    const/4 v0, 0x1

    return v0
.end method

.method public activateOptions()V
    .locals 7

    const-string v0, "Error while activating options for appender named ["

    const-string v1, "]."

    const/4 v2, 0x0

    :try_start_0
    const-string v3, "Getting initial context."

    .line 1
    invoke-static {v3}, Lorg/apache/log4j/helpers/LogLog;->debug(Ljava/lang/String;)V

    .line 2
    iget-object v3, p0, Lorg/apache/log4j/net/JMSAppender;->j:Ljava/lang/String;

    if-eqz v3, :cond_4

    .line 3
    new-instance v3, Ljava/util/Properties;

    invoke-direct {v3}, Ljava/util/Properties;-><init>()V

    const-string v4, "java.naming.factory.initial"

    .line 4
    iget-object v5, p0, Lorg/apache/log4j/net/JMSAppender;->j:Ljava/lang/String;

    invoke-virtual {v3, v4, v5}, Ljava/util/Properties;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    iget-object v4, p0, Lorg/apache/log4j/net/JMSAppender;->l:Ljava/lang/String;

    if-eqz v4, :cond_0

    const-string v4, "java.naming.provider.url"

    .line 6
    iget-object v5, p0, Lorg/apache/log4j/net/JMSAppender;->l:Ljava/lang/String;

    invoke-virtual {v3, v4, v5}, Ljava/util/Properties;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    const-string v4, "You have set InitialContextFactoryName option but not the ProviderURL. This is likely to cause problems."

    .line 7
    invoke-static {v4}, Lorg/apache/log4j/helpers/LogLog;->warn(Ljava/lang/String;)V

    .line 8
    :goto_0
    iget-object v4, p0, Lorg/apache/log4j/net/JMSAppender;->k:Ljava/lang/String;

    if-eqz v4, :cond_1

    const-string v4, "java.naming.factory.url.pkgs"

    .line 9
    iget-object v5, p0, Lorg/apache/log4j/net/JMSAppender;->k:Ljava/lang/String;

    invoke-virtual {v3, v4, v5}, Ljava/util/Properties;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    :cond_1
    iget-object v4, p0, Lorg/apache/log4j/net/JMSAppender;->h:Ljava/lang/String;

    if-eqz v4, :cond_3

    const-string v4, "java.naming.security.principal"

    .line 11
    iget-object v5, p0, Lorg/apache/log4j/net/JMSAppender;->h:Ljava/lang/String;

    invoke-virtual {v3, v4, v5}, Ljava/util/Properties;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    iget-object v4, p0, Lorg/apache/log4j/net/JMSAppender;->i:Ljava/lang/String;

    if-eqz v4, :cond_2

    const-string v4, "java.naming.security.credentials"

    .line 13
    iget-object v5, p0, Lorg/apache/log4j/net/JMSAppender;->i:Ljava/lang/String;

    invoke-virtual {v3, v4, v5}, Ljava/util/Properties;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_2
    const-string v4, "You have set SecurityPrincipalName option but not the SecurityCredentials. This is likely to cause problems."

    .line 14
    invoke-static {v4}, Lorg/apache/log4j/helpers/LogLog;->warn(Ljava/lang/String;)V

    .line 15
    :cond_3
    :goto_1
    new-instance v4, Ljavax/naming/InitialContext;

    invoke-direct {v4, v3}, Ljavax/naming/InitialContext;-><init>(Ljava/util/Hashtable;)V

    goto :goto_2

    .line 16
    :cond_4
    new-instance v4, Ljavax/naming/InitialContext;

    invoke-direct {v4}, Ljavax/naming/InitialContext;-><init>()V

    .line 17
    :goto_2
    new-instance v3, Ljava/lang/StringBuffer;

    invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V

    const-string v5, "Looking up ["

    invoke-virtual {v3, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v5, p0, Lorg/apache/log4j/net/JMSAppender;->n:Ljava/lang/String;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v5, "]"

    invoke-virtual {v3, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lorg/apache/log4j/helpers/LogLog;->debug(Ljava/lang/String;)V

    .line 18
    iget-object v3, p0, Lorg/apache/log4j/net/JMSAppender;->n:Ljava/lang/String;

    invoke-virtual {p0, v4, v3}, Lorg/apache/log4j/net/JMSAppender;->a(Ljavax/naming/Context;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljavax/jms/TopicConnectionFactory;

    const-string v5, "About to create TopicConnection."

    .line 19
    invoke-static {v5}, Lorg/apache/log4j/helpers/LogLog;->debug(Ljava/lang/String;)V

    .line 20
    iget-object v5, p0, Lorg/apache/log4j/net/JMSAppender;->o:Ljava/lang/String;

    if-eqz v5, :cond_5

    .line 21
    iget-object v5, p0, Lorg/apache/log4j/net/JMSAppender;->o:Ljava/lang/String;

    iget-object v6, p0, Lorg/apache/log4j/net/JMSAppender;->p:Ljava/lang/String;

    invoke-interface {v3, v5, v6}, Ljavax/jms/TopicConnectionFactory;->createTopicConnection(Ljava/lang/String;Ljava/lang/String;)Ljavax/jms/TopicConnection;

    move-result-object v3

    iput-object v3, p0, Lorg/apache/log4j/net/JMSAppender;->r:Ljavax/jms/TopicConnection;

    goto :goto_3

    .line 22
    :cond_5
    invoke-interface {v3}, Ljavax/jms/TopicConnectionFactory;->createTopicConnection()Ljavax/jms/TopicConnection;

    move-result-object v3

    iput-object v3, p0, Lorg/apache/log4j/net/JMSAppender;->r:Ljavax/jms/TopicConnection;

    :goto_3
    const-string v3, "Creating TopicSession, non-transactional, in AUTO_ACKNOWLEDGE mode."

    .line 23
    invoke-static {v3}, Lorg/apache/log4j/helpers/LogLog;->debug(Ljava/lang/String;)V

    .line 24
    iget-object v3, p0, Lorg/apache/log4j/net/JMSAppender;->r:Ljavax/jms/TopicConnection;

    const/4 v5, 0x1

    invoke-interface {v3, v2, v5}, Ljavax/jms/TopicConnection;->createTopicSession(ZI)Ljavax/jms/TopicSession;

    move-result-object v3

    iput-object v3, p0, Lorg/apache/log4j/net/JMSAppender;->s:Ljavax/jms/TopicSession;

    .line 25
    new-instance v3, Ljava/lang/StringBuffer;

    invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V

    const-string v5, "Looking up topic name ["

    invoke-virtual {v3, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v5, p0, Lorg/apache/log4j/net/JMSAppender;->m:Ljava/lang/String;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lorg/apache/log4j/helpers/LogLog;->debug(Ljava/lang/String;)V

    .line 26
    iget-object v3, p0, Lorg/apache/log4j/net/JMSAppender;->m:Ljava/lang/String;

    invoke-virtual {p0, v4, v3}, Lorg/apache/log4j/net/JMSAppender;->a(Ljavax/naming/Context;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljavax/jms/Topic;

    const-string v5, "Creating TopicPublisher."

    .line 27
    invoke-static {v5}, Lorg/apache/log4j/helpers/LogLog;->debug(Ljava/lang/String;)V

    .line 28
    iget-object v5, p0, Lorg/apache/log4j/net/JMSAppender;->s:Ljavax/jms/TopicSession;

    invoke-interface {v5, v3}, Ljavax/jms/TopicSession;->createPublisher(Ljavax/jms/Topic;)Ljavax/jms/TopicPublisher;

    move-result-object v3

    iput-object v3, p0, Lorg/apache/log4j/net/JMSAppender;->t:Ljavax/jms/TopicPublisher;

    const-string v3, "Starting TopicConnection."

    .line 29
    invoke-static {v3}, Lorg/apache/log4j/helpers/LogLog;->debug(Ljava/lang/String;)V

    .line 30
    iget-object v3, p0, Lorg/apache/log4j/net/JMSAppender;->r:Ljavax/jms/TopicConnection;

    invoke-interface {v3}, Ljavax/jms/TopicConnection;->start()V

    .line 31
    invoke-interface {v4}, Ljavax/naming/Context;->close()V
    :try_end_0
    .catch Ljavax/jms/JMSException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljavax/naming/NamingException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    :catch_0
    move-exception v3

    .line 32
    iget-object v4, p0, Lorg/apache/log4j/AppenderSkeleton;->d:Lorg/apache/log4j/spi/ErrorHandler;

    new-instance v5, Ljava/lang/StringBuffer;

    invoke-direct {v5}, Ljava/lang/StringBuffer;-><init>()V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v0, p0, Lorg/apache/log4j/AppenderSkeleton;->b:Ljava/lang/String;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v5}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v4, v0, v3, v2}, Lorg/apache/log4j/spi/ErrorHandler;->error(Ljava/lang/String;Ljava/lang/Exception;I)V

    goto :goto_4

    :catch_1
    move-exception v3

    .line 33
    iget-object v4, p0, Lorg/apache/log4j/AppenderSkeleton;->d:Lorg/apache/log4j/spi/ErrorHandler;

    new-instance v5, Ljava/lang/StringBuffer;

    invoke-direct {v5}, Ljava/lang/StringBuffer;-><init>()V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v0, p0, Lorg/apache/log4j/AppenderSkeleton;->b:Ljava/lang/String;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v5}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v4, v0, v3, v2}, Lorg/apache/log4j/spi/ErrorHandler;->error(Ljava/lang/String;Ljava/lang/Exception;I)V

    goto :goto_4

    :catch_2
    move-exception v3

    .line 34
    iget-object v4, p0, Lorg/apache/log4j/AppenderSkeleton;->d:Lorg/apache/log4j/spi/ErrorHandler;

    new-instance v5, Ljava/lang/StringBuffer;

    invoke-direct {v5}, Ljava/lang/StringBuffer;-><init>()V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v0, p0, Lorg/apache/log4j/AppenderSkeleton;->b:Ljava/lang/String;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v5}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v4, v0, v3, v2}, Lorg/apache/log4j/spi/ErrorHandler;->error(Ljava/lang/String;Ljava/lang/Exception;I)V

    :goto_4
    return-void
.end method

.method public append(Lorg/apache/log4j/spi/LoggingEvent;)V
    .locals 5

    const-string v0, "]."

    const-string v1, "Could not publish message in JMSAppender ["

    .line 1
    invoke-virtual {p0}, Lorg/apache/log4j/net/JMSAppender;->a()Z

    move-result v2

    if-nez v2, :cond_0

    return-void

    :cond_0
    const/4 v2, 0x0

    .line 2
    :try_start_0
    iget-object v3, p0, Lorg/apache/log4j/net/JMSAppender;->s:Ljavax/jms/TopicSession;

    invoke-interface {v3}, Ljavax/jms/TopicSession;->createObjectMessage()Ljavax/jms/ObjectMessage;

    move-result-object v3

    .line 3
    iget-boolean v4, p0, Lorg/apache/log4j/net/JMSAppender;->q:Z

    if-eqz v4, :cond_1

    .line 4
    invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getLocationInformation()Lorg/apache/log4j/spi/LocationInfo;

    .line 5
    :cond_1
    invoke-interface {v3, p1}, Ljavax/jms/ObjectMessage;->setObject(Ljava/io/Serializable;)V

    .line 6
    iget-object p1, p0, Lorg/apache/log4j/net/JMSAppender;->t:Ljavax/jms/TopicPublisher;

    invoke-interface {p1, v3}, Ljavax/jms/TopicPublisher;->publish(Ljavax/jms/Message;)V
    :try_end_0
    .catch Ljavax/jms/JMSException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 7
    iget-object v3, p0, Lorg/apache/log4j/AppenderSkeleton;->d:Lorg/apache/log4j/spi/ErrorHandler;

    new-instance v4, Ljava/lang/StringBuffer;

    invoke-direct {v4}, Ljava/lang/StringBuffer;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v1, p0, Lorg/apache/log4j/AppenderSkeleton;->b:Ljava/lang/String;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v4}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v0, p1, v2}, Lorg/apache/log4j/spi/ErrorHandler;->error(Ljava/lang/String;Ljava/lang/Exception;I)V

    goto :goto_0

    :catch_1
    move-exception p1

    .line 8
    iget-object v3, p0, Lorg/apache/log4j/AppenderSkeleton;->d:Lorg/apache/log4j/spi/ErrorHandler;

    new-instance v4, Ljava/lang/StringBuffer;

    invoke-direct {v4}, Ljava/lang/StringBuffer;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v1, p0, Lorg/apache/log4j/AppenderSkeleton;->b:Ljava/lang/String;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v4}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v0, p1, v2}, Lorg/apache/log4j/spi/ErrorHandler;->error(Ljava/lang/String;Ljava/lang/Exception;I)V

    :goto_0
    return-void
.end method

.method public declared-synchronized close()V
    .locals 3

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

    const-string v1, "Closing appender ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v1, p0, Lorg/apache/log4j/AppenderSkeleton;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v1, "]."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lorg/apache/log4j/helpers/LogLog;->debug(Ljava/lang/String;)V

    const/4 v0, 0x1

    .line 4
    iput-boolean v0, p0, Lorg/apache/log4j/AppenderSkeleton;->g:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 5
    :try_start_2
    iget-object v0, p0, Lorg/apache/log4j/net/JMSAppender;->s:Ljavax/jms/TopicSession;

    if-eqz v0, :cond_1

    .line 6
    iget-object v0, p0, Lorg/apache/log4j/net/JMSAppender;->s:Ljavax/jms/TopicSession;

    invoke-interface {v0}, Ljavax/jms/TopicSession;->close()V

    .line 7
    :cond_1
    iget-object v0, p0, Lorg/apache/log4j/net/JMSAppender;->r:Ljavax/jms/TopicConnection;

    if-eqz v0, :cond_2

    .line 8
    iget-object v0, p0, Lorg/apache/log4j/net/JMSAppender;->r:Ljavax/jms/TopicConnection;

    invoke-interface {v0}, Ljavax/jms/TopicConnection;->close()V
    :try_end_2
    .catch Ljavax/jms/JMSException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 9
    :try_start_3
    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    const-string v2, "Error while closing JMSAppender ["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v2, p0, Lorg/apache/log4j/AppenderSkeleton;->b:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v2, "]."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lorg/apache/log4j/helpers/LogLog;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :catch_1
    move-exception v0

    .line 10
    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    const-string v2, "Error while closing JMSAppender ["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v2, p0, Lorg/apache/log4j/AppenderSkeleton;->b:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v2, "]."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lorg/apache/log4j/helpers/LogLog;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    :goto_0
    const/4 v0, 0x0

    .line 11
    iput-object v0, p0, Lorg/apache/log4j/net/JMSAppender;->t:Ljavax/jms/TopicPublisher;

    .line 12
    iput-object v0, p0, Lorg/apache/log4j/net/JMSAppender;->s:Ljavax/jms/TopicSession;

    .line 13
    iput-object v0, p0, Lorg/apache/log4j/net/JMSAppender;->r:Ljavax/jms/TopicConnection;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 14
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public getInitialContextFactoryName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/net/JMSAppender;->j:Ljava/lang/String;

    return-object v0
.end method

.method public getLocationInfo()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lorg/apache/log4j/net/JMSAppender;->q:Z

    return v0
.end method

.method public getPassword()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/net/JMSAppender;->p:Ljava/lang/String;

    return-object v0
.end method

.method public getProviderURL()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/net/JMSAppender;->l:Ljava/lang/String;

    return-object v0
.end method

.method public getSecurityCredentials()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/net/JMSAppender;->i:Ljava/lang/String;

    return-object v0
.end method

.method public getSecurityPrincipalName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/net/JMSAppender;->h:Ljava/lang/String;

    return-object v0
.end method

.method public getTopicBindingName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/net/JMSAppender;->m:Ljava/lang/String;

    return-object v0
.end method

.method public getTopicConnectionFactoryBindingName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/net/JMSAppender;->n:Ljava/lang/String;

    return-object v0
.end method

.method public getUserName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/net/JMSAppender;->o:Ljava/lang/String;

    return-object v0
.end method

.method public requiresLayout()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public setInitialContextFactoryName(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/apache/log4j/net/JMSAppender;->j:Ljava/lang/String;

    return-void
.end method

.method public setLocationInfo(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lorg/apache/log4j/net/JMSAppender;->q:Z

    return-void
.end method

.method public setPassword(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/apache/log4j/net/JMSAppender;->p:Ljava/lang/String;

    return-void
.end method

.method public setProviderURL(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/apache/log4j/net/JMSAppender;->l:Ljava/lang/String;

    return-void
.end method

.method public setSecurityCredentials(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/apache/log4j/net/JMSAppender;->i:Ljava/lang/String;

    return-void
.end method

.method public setSecurityPrincipalName(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/apache/log4j/net/JMSAppender;->h:Ljava/lang/String;

    return-void
.end method

.method public setTopicBindingName(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/apache/log4j/net/JMSAppender;->m:Ljava/lang/String;

    return-void
.end method

.method public setTopicConnectionFactoryBindingName(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/apache/log4j/net/JMSAppender;->n:Ljava/lang/String;

    return-void
.end method

.method public setURLPkgPrefixes(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/apache/log4j/net/JMSAppender;->k:Ljava/lang/String;

    return-void
.end method

.method public setUserName(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/apache/log4j/net/JMSAppender;->o:Ljava/lang/String;

    return-void
.end method
