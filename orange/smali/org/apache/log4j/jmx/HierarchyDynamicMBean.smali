.class public Lorg/apache/log4j/jmx/HierarchyDynamicMBean;
.super Lorg/apache/log4j/jmx/AbstractDynamicMBean;
.source "SourceFile"

# interfaces
.implements Lorg/apache/log4j/spi/HierarchyEventListener;
.implements Ljavax/management/NotificationBroadcaster;


# static fields
.field public static k:Lorg/apache/log4j/Logger;

.field public static synthetic l:Ljava/lang/Class;


# instance fields
.field public d:[Ljavax/management/MBeanConstructorInfo;

.field public e:[Ljavax/management/MBeanOperationInfo;

.field public f:Ljava/util/Vector;

.field public g:Ljava/lang/String;

.field public h:Ljava/lang/String;

.field public i:Ljavax/management/NotificationBroadcasterSupport;

.field public j:Lorg/apache/log4j/spi/LoggerRepository;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lorg/apache/log4j/jmx/HierarchyDynamicMBean;->l:Ljava/lang/Class;

    if-nez v0, :cond_0

    const-string v0, "org.apache.log4j.jmx.HierarchyDynamicMBean"

    invoke-static {v0}, Lorg/apache/log4j/jmx/HierarchyDynamicMBean;->a(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    sput-object v0, Lorg/apache/log4j/jmx/HierarchyDynamicMBean;->l:Ljava/lang/Class;

    :cond_0
    invoke-static {v0}, Lorg/apache/log4j/Logger;->getLogger(Ljava/lang/Class;)Lorg/apache/log4j/Logger;

    move-result-object v0

    sput-object v0, Lorg/apache/log4j/jmx/HierarchyDynamicMBean;->k:Lorg/apache/log4j/Logger;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lorg/apache/log4j/jmx/AbstractDynamicMBean;-><init>()V

    const/4 v0, 0x1

    new-array v1, v0, [Ljavax/management/MBeanConstructorInfo;

    .line 2
    iput-object v1, p0, Lorg/apache/log4j/jmx/HierarchyDynamicMBean;->d:[Ljavax/management/MBeanConstructorInfo;

    new-array v0, v0, [Ljavax/management/MBeanOperationInfo;

    .line 3
    iput-object v0, p0, Lorg/apache/log4j/jmx/HierarchyDynamicMBean;->e:[Ljavax/management/MBeanOperationInfo;

    .line 4
    new-instance v0, Ljava/util/Vector;

    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    iput-object v0, p0, Lorg/apache/log4j/jmx/HierarchyDynamicMBean;->f:Ljava/util/Vector;

    .line 5
    const-class v0, Lorg/apache/log4j/jmx/HierarchyDynamicMBean;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/apache/log4j/jmx/HierarchyDynamicMBean;->g:Ljava/lang/String;

    const-string v0, "This MBean acts as a management facade for org.apache.log4j.Hierarchy."

    .line 6
    iput-object v0, p0, Lorg/apache/log4j/jmx/HierarchyDynamicMBean;->h:Ljava/lang/String;

    .line 7
    new-instance v0, Ljavax/management/NotificationBroadcasterSupport;

    invoke-direct {v0}, Ljavax/management/NotificationBroadcasterSupport;-><init>()V

    iput-object v0, p0, Lorg/apache/log4j/jmx/HierarchyDynamicMBean;->i:Ljavax/management/NotificationBroadcasterSupport;

    .line 8
    invoke-static {}, Lorg/apache/log4j/LogManager;->getLoggerRepository()Lorg/apache/log4j/spi/LoggerRepository;

    move-result-object v0

    iput-object v0, p0, Lorg/apache/log4j/jmx/HierarchyDynamicMBean;->j:Lorg/apache/log4j/spi/LoggerRepository;

    .line 9
    invoke-virtual {p0}, Lorg/apache/log4j/jmx/HierarchyDynamicMBean;->b()V

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
.method public a(Lorg/apache/log4j/Logger;)Ljavax/management/ObjectName;
    .locals 13

    const-string v0, "]."

    const-string v1, "Could not add loggerMBean for ["

    .line 2
    invoke-virtual {p1}, Lorg/apache/log4j/Category;->getName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    .line 3
    :try_start_0
    new-instance v4, Lorg/apache/log4j/jmx/LoggerDynamicMBean;

    invoke-direct {v4, p1}, Lorg/apache/log4j/jmx/LoggerDynamicMBean;-><init>(Lorg/apache/log4j/Logger;)V

    .line 4
    new-instance v5, Ljavax/management/ObjectName;

    const-string v6, "log4j"

    const-string v7, "logger"

    invoke-direct {v5, v6, v7, v2}, Ljavax/management/ObjectName;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljavax/management/JMException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_2

    .line 5
    :try_start_1
    iget-object v6, p0, Lorg/apache/log4j/jmx/AbstractDynamicMBean;->b:Ljavax/management/MBeanServer;

    invoke-interface {v6, v5}, Ljavax/management/MBeanServer;->isRegistered(Ljavax/management/ObjectName;)Z

    move-result v6

    if-nez v6, :cond_0

    .line 6
    invoke-virtual {p0, v4, v5}, Lorg/apache/log4j/jmx/AbstractDynamicMBean;->a(Ljava/lang/Object;Ljavax/management/ObjectName;)V

    .line 7
    new-instance v6, Ljavax/management/NotificationFilterSupport;

    invoke-direct {v6}, Ljavax/management/NotificationFilterSupport;-><init>()V

    .line 8
    new-instance v7, Ljava/lang/StringBuffer;

    invoke-direct {v7}, Ljava/lang/StringBuffer;-><init>()V

    const-string v8, "addAppender."

    invoke-virtual {v7, v8}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p1}, Lorg/apache/log4j/Category;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v7, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v7}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v6, p1}, Ljavax/management/NotificationFilterSupport;->enableType(Ljava/lang/String;)V

    .line 9
    sget-object p1, Lorg/apache/log4j/jmx/HierarchyDynamicMBean;->k:Lorg/apache/log4j/Logger;

    new-instance v7, Ljava/lang/StringBuffer;

    invoke-direct {v7}, Ljava/lang/StringBuffer;-><init>()V

    const-string v8, "---Adding logger ["

    invoke-virtual {v7, v8}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v8, "] as listener."

    invoke-virtual {v7, v8}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v7}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1, v7}, Lorg/apache/log4j/Category;->debug(Ljava/lang/Object;)V

    .line 10
    iget-object p1, p0, Lorg/apache/log4j/jmx/HierarchyDynamicMBean;->i:Ljavax/management/NotificationBroadcasterSupport;

    invoke-virtual {p1, v4, v6, v3}, Ljavax/management/NotificationBroadcasterSupport;->addNotificationListener(Ljavax/management/NotificationListener;Ljavax/management/NotificationFilter;Ljava/lang/Object;)V

    .line 11
    iget-object p1, p0, Lorg/apache/log4j/jmx/HierarchyDynamicMBean;->f:Ljava/util/Vector;

    new-instance v3, Ljavax/management/MBeanAttributeInfo;

    new-instance v4, Ljava/lang/StringBuffer;

    invoke-direct {v4}, Ljava/lang/StringBuffer;-><init>()V

    const-string v6, "logger="

    invoke-virtual {v4, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v4}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v7

    const-string v8, "javax.management.ObjectName"

    new-instance v4, Ljava/lang/StringBuffer;

    invoke-direct {v4}, Ljava/lang/StringBuffer;-><init>()V

    const-string v6, "The "

    invoke-virtual {v4, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v6, " logger."

    invoke-virtual {v4, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v4}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v9

    const/4 v10, 0x1

    const/4 v11, 0x1

    const/4 v12, 0x0

    move-object v6, v3

    invoke-direct/range {v6 .. v12}, Ljavax/management/MBeanAttributeInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)V

    invoke-virtual {p1, v3}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljavax/management/JMException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_3

    :catch_0
    move-exception p1

    move-object v3, v5

    goto :goto_0

    :catch_1
    move-exception p1

    move-object v3, v5

    goto :goto_1

    :catch_2
    move-exception p1

    .line 12
    :goto_0
    sget-object v4, Lorg/apache/log4j/jmx/HierarchyDynamicMBean;->k:Lorg/apache/log4j/Logger;

    new-instance v5, Ljava/lang/StringBuffer;

    invoke-direct {v5}, Ljava/lang/StringBuffer;-><init>()V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v5}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0, p1}, Lorg/apache/log4j/Category;->error(Ljava/lang/Object;Ljava/lang/Throwable;)V

    goto :goto_2

    :catch_3
    move-exception p1

    .line 13
    :goto_1
    sget-object v4, Lorg/apache/log4j/jmx/HierarchyDynamicMBean;->k:Lorg/apache/log4j/Logger;

    new-instance v5, Ljava/lang/StringBuffer;

    invoke-direct {v5}, Ljava/lang/StringBuffer;-><init>()V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v5}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0, p1}, Lorg/apache/log4j/Category;->error(Ljava/lang/Object;Ljava/lang/Throwable;)V

    :goto_2
    move-object v5, v3

    :cond_0
    :goto_3
    return-object v5
.end method

.method public a()Lorg/apache/log4j/Logger;
    .locals 1

    .line 14
    sget-object v0, Lorg/apache/log4j/jmx/HierarchyDynamicMBean;->k:Lorg/apache/log4j/Logger;

    return-object v0
.end method

.method public addAppenderEvent(Lorg/apache/log4j/Category;Lorg/apache/log4j/Appender;)V
    .locals 3

    .line 1
    sget-object v0, Lorg/apache/log4j/jmx/HierarchyDynamicMBean;->k:Lorg/apache/log4j/Logger;

    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    const-string v2, "addAppenderEvent called: logger="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p1}, Lorg/apache/log4j/Category;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v2, ", appender="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-interface {p2}, Lorg/apache/log4j/Appender;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/apache/log4j/Category;->debug(Ljava/lang/Object;)V

    .line 2
    new-instance v0, Ljavax/management/Notification;

    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    const-string v2, "addAppender."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p1}, Lorg/apache/log4j/Category;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    const-wide/16 v1, 0x0

    invoke-direct {v0, p1, p0, v1, v2}, Ljavax/management/Notification;-><init>(Ljava/lang/String;Ljava/lang/Object;J)V

    .line 3
    invoke-virtual {v0, p2}, Ljavax/management/Notification;->setUserData(Ljava/lang/Object;)V

    .line 4
    sget-object p1, Lorg/apache/log4j/jmx/HierarchyDynamicMBean;->k:Lorg/apache/log4j/Logger;

    const-string p2, "sending notification."

    invoke-virtual {p1, p2}, Lorg/apache/log4j/Category;->debug(Ljava/lang/Object;)V

    .line 5
    iget-object p1, p0, Lorg/apache/log4j/jmx/HierarchyDynamicMBean;->i:Ljavax/management/NotificationBroadcasterSupport;

    invoke-virtual {p1, v0}, Ljavax/management/NotificationBroadcasterSupport;->sendNotification(Ljavax/management/Notification;)V

    return-void
.end method

.method public addLoggerMBean(Ljava/lang/String;)Ljavax/management/ObjectName;
    .locals 0

    .line 1
    invoke-static {p1}, Lorg/apache/log4j/LogManager;->exists(Ljava/lang/String;)Lorg/apache/log4j/Logger;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p0, p1}, Lorg/apache/log4j/jmx/HierarchyDynamicMBean;->a(Lorg/apache/log4j/Logger;)Ljavax/management/ObjectName;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public addNotificationListener(Ljavax/management/NotificationListener;Ljavax/management/NotificationFilter;Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/jmx/HierarchyDynamicMBean;->i:Ljavax/management/NotificationBroadcasterSupport;

    invoke-virtual {v0, p1, p2, p3}, Ljavax/management/NotificationBroadcasterSupport;->addNotificationListener(Ljavax/management/NotificationListener;Ljavax/management/NotificationFilter;Ljava/lang/Object;)V

    return-void
.end method

.method public final b()V
    .locals 11

    .line 1
    const-class v0, Lorg/apache/log4j/jmx/HierarchyDynamicMBean;

    invoke-virtual {v0}, Ljava/lang/Class;->getConstructors()[Ljava/lang/reflect/Constructor;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lorg/apache/log4j/jmx/HierarchyDynamicMBean;->d:[Ljavax/management/MBeanConstructorInfo;

    new-instance v2, Ljavax/management/MBeanConstructorInfo;

    const/4 v3, 0x0

    aget-object v0, v0, v3

    const-string v4, "HierarchyDynamicMBean(): Constructs a HierarchyDynamicMBean instance"

    invoke-direct {v2, v4, v0}, Ljavax/management/MBeanConstructorInfo;-><init>(Ljava/lang/String;Ljava/lang/reflect/Constructor;)V

    aput-object v2, v1, v3

    .line 3
    iget-object v0, p0, Lorg/apache/log4j/jmx/HierarchyDynamicMBean;->f:Ljava/util/Vector;

    new-instance v1, Ljavax/management/MBeanAttributeInfo;

    const-string v5, "threshold"

    const-string v6, "java.lang.String"

    const-string v7, "The \"threshold\" state of the hiearchy."

    const/4 v8, 0x1

    const/4 v9, 0x1

    const/4 v10, 0x0

    move-object v4, v1

    invoke-direct/range {v4 .. v10}, Ljavax/management/MBeanAttributeInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)V

    invoke-virtual {v0, v1}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    const/4 v0, 0x1

    new-array v7, v0, [Ljavax/management/MBeanParameterInfo;

    .line 4
    new-instance v0, Ljavax/management/MBeanParameterInfo;

    const-string v1, "name"

    const-string v2, "java.lang.String"

    const-string v4, "Create a logger MBean"

    invoke-direct {v0, v1, v2, v4}, Ljavax/management/MBeanParameterInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    aput-object v0, v7, v3

    .line 5
    iget-object v0, p0, Lorg/apache/log4j/jmx/HierarchyDynamicMBean;->e:[Ljavax/management/MBeanOperationInfo;

    new-instance v1, Ljavax/management/MBeanOperationInfo;

    const-string v5, "addLoggerMBean"

    const-string v6, "addLoggerMBean(): add a loggerMBean"

    const-string v8, "javax.management.ObjectName"

    move-object v4, v1

    invoke-direct/range {v4 .. v9}, Ljavax/management/MBeanOperationInfo;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljavax/management/MBeanParameterInfo;Ljava/lang/String;I)V

    aput-object v1, v0, v3

    return-void
.end method

.method public getAttribute(Ljava/lang/String;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljavax/management/AttributeNotFoundException;,
            Ljavax/management/MBeanException;,
            Ljavax/management/ReflectionException;
        }
    .end annotation

    const-string v0, "Could not create ObjectName"

    if-eqz p1, :cond_3

    .line 1
    sget-object v1, Lorg/apache/log4j/jmx/HierarchyDynamicMBean;->k:Lorg/apache/log4j/Logger;

    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    const-string v3, "Called getAttribute with ["

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v3, "]."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lorg/apache/log4j/Category;->debug(Ljava/lang/Object;)V

    const-string v1, "threshold"

    .line 2
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 3
    iget-object p1, p0, Lorg/apache/log4j/jmx/HierarchyDynamicMBean;->j:Lorg/apache/log4j/spi/LoggerRepository;

    invoke-interface {p1}, Lorg/apache/log4j/spi/LoggerRepository;->getThreshold()Lorg/apache/log4j/Level;

    move-result-object p1

    return-object p1

    :cond_0
    const-string v1, "logger"

    .line 4
    invoke-virtual {p1, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    const-string v1, "%3D"

    .line 5
    invoke-virtual {p1, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v1

    if-lez v1, :cond_1

    .line 6
    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    const/4 v3, 0x0

    invoke-virtual {p1, v3, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const/16 v3, 0x3d

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    add-int/lit8 v1, v1, 0x3

    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_1
    move-object v1, p1

    .line 7
    :goto_0
    :try_start_0
    new-instance v2, Ljavax/management/ObjectName;

    new-instance v3, Ljava/lang/StringBuffer;

    invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V

    const-string v4, "log4j:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljavax/management/ObjectName;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljavax/management/JMException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v2

    .line 8
    :catch_0
    sget-object v2, Lorg/apache/log4j/jmx/HierarchyDynamicMBean;->k:Lorg/apache/log4j/Logger;

    new-instance v3, Ljava/lang/StringBuffer;

    invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lorg/apache/log4j/Category;->error(Ljava/lang/Object;)V

    goto :goto_1

    .line 9
    :catch_1
    sget-object v2, Lorg/apache/log4j/jmx/HierarchyDynamicMBean;->k:Lorg/apache/log4j/Logger;

    new-instance v3, Ljava/lang/StringBuffer;

    invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lorg/apache/log4j/Category;->error(Ljava/lang/Object;)V

    .line 10
    :cond_2
    :goto_1
    new-instance v0, Ljavax/management/AttributeNotFoundException;

    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    const-string v2, "Cannot find "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string p1, " attribute in "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object p1, p0, Lorg/apache/log4j/jmx/HierarchyDynamicMBean;->g:Ljava/lang/String;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljavax/management/AttributeNotFoundException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 11
    :cond_3
    new-instance p1, Ljavax/management/RuntimeOperationsException;

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Attribute name cannot be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    const-string v2, "Cannot invoke a getter of "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v2, p0, Lorg/apache/log4j/jmx/HierarchyDynamicMBean;->g:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v2, " with null attribute name"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Ljavax/management/RuntimeOperationsException;-><init>(Ljava/lang/RuntimeException;Ljava/lang/String;)V

    throw p1
.end method

.method public getMBeanInfo()Ljavax/management/MBeanInfo;
    .locals 8

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/jmx/HierarchyDynamicMBean;->f:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v0

    new-array v4, v0, [Ljavax/management/MBeanAttributeInfo;

    .line 2
    iget-object v0, p0, Lorg/apache/log4j/jmx/HierarchyDynamicMBean;->f:Ljava/util/Vector;

    invoke-virtual {v0, v4}, Ljava/util/Vector;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 3
    new-instance v0, Ljavax/management/MBeanInfo;

    iget-object v2, p0, Lorg/apache/log4j/jmx/HierarchyDynamicMBean;->g:Ljava/lang/String;

    iget-object v3, p0, Lorg/apache/log4j/jmx/HierarchyDynamicMBean;->h:Ljava/lang/String;

    iget-object v5, p0, Lorg/apache/log4j/jmx/HierarchyDynamicMBean;->d:[Ljavax/management/MBeanConstructorInfo;

    iget-object v6, p0, Lorg/apache/log4j/jmx/HierarchyDynamicMBean;->e:[Ljavax/management/MBeanOperationInfo;

    const/4 v1, 0x0

    new-array v7, v1, [Ljavax/management/MBeanNotificationInfo;

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, Ljavax/management/MBeanInfo;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljavax/management/MBeanAttributeInfo;[Ljavax/management/MBeanConstructorInfo;[Ljavax/management/MBeanOperationInfo;[Ljavax/management/MBeanNotificationInfo;)V

    return-object v0
.end method

.method public getNotificationInfo()[Ljavax/management/MBeanNotificationInfo;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/jmx/HierarchyDynamicMBean;->i:Ljavax/management/NotificationBroadcasterSupport;

    invoke-virtual {v0}, Ljavax/management/NotificationBroadcasterSupport;->getNotificationInfo()[Ljavax/management/MBeanNotificationInfo;

    move-result-object v0

    return-object v0
.end method

.method public invoke(Ljava/lang/String;[Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljavax/management/MBeanException;,
            Ljavax/management/ReflectionException;
        }
    .end annotation

    if-eqz p1, :cond_1

    const-string p3, "addLoggerMBean"

    .line 1
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_0

    const/4 p1, 0x0

    .line 2
    aget-object p1, p2, p1

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lorg/apache/log4j/jmx/HierarchyDynamicMBean;->addLoggerMBean(Ljava/lang/String;)Ljavax/management/ObjectName;

    move-result-object p1

    return-object p1

    .line 3
    :cond_0
    new-instance p2, Ljavax/management/ReflectionException;

    new-instance p3, Ljava/lang/NoSuchMethodException;

    invoke-direct {p3, p1}, Ljava/lang/NoSuchMethodException;-><init>(Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    const-string v1, "Cannot find the operation "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string p1, " in "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object p1, p0, Lorg/apache/log4j/jmx/HierarchyDynamicMBean;->g:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p3, p1}, Ljavax/management/ReflectionException;-><init>(Ljava/lang/Exception;Ljava/lang/String;)V

    throw p2

    .line 4
    :cond_1
    new-instance p1, Ljavax/management/RuntimeOperationsException;

    new-instance p2, Ljava/lang/IllegalArgumentException;

    const-string p3, "Operation name cannot be null"

    invoke-direct {p2, p3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    new-instance p3, Ljava/lang/StringBuffer;

    invoke-direct {p3}, Ljava/lang/StringBuffer;-><init>()V

    const-string v0, "Cannot invoke a null operation in "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v0, p0, Lorg/apache/log4j/jmx/HierarchyDynamicMBean;->g:Ljava/lang/String;

    invoke-virtual {p3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p1, p2, p3}, Ljavax/management/RuntimeOperationsException;-><init>(Ljava/lang/RuntimeException;Ljava/lang/String;)V

    throw p1
.end method

.method public postRegister(Ljava/lang/Boolean;)V
    .locals 1

    .line 1
    sget-object p1, Lorg/apache/log4j/jmx/HierarchyDynamicMBean;->k:Lorg/apache/log4j/Logger;

    const-string v0, "postRegister is called."

    invoke-virtual {p1, v0}, Lorg/apache/log4j/Category;->debug(Ljava/lang/Object;)V

    .line 2
    iget-object p1, p0, Lorg/apache/log4j/jmx/HierarchyDynamicMBean;->j:Lorg/apache/log4j/spi/LoggerRepository;

    invoke-interface {p1, p0}, Lorg/apache/log4j/spi/LoggerRepository;->addHierarchyEventListener(Lorg/apache/log4j/spi/HierarchyEventListener;)V

    .line 3
    iget-object p1, p0, Lorg/apache/log4j/jmx/HierarchyDynamicMBean;->j:Lorg/apache/log4j/spi/LoggerRepository;

    invoke-interface {p1}, Lorg/apache/log4j/spi/LoggerRepository;->getRootLogger()Lorg/apache/log4j/Logger;

    move-result-object p1

    .line 4
    invoke-virtual {p0, p1}, Lorg/apache/log4j/jmx/HierarchyDynamicMBean;->a(Lorg/apache/log4j/Logger;)Ljavax/management/ObjectName;

    return-void
.end method

.method public removeAppenderEvent(Lorg/apache/log4j/Category;Lorg/apache/log4j/Appender;)V
    .locals 3

    .line 1
    sget-object v0, Lorg/apache/log4j/jmx/HierarchyDynamicMBean;->k:Lorg/apache/log4j/Logger;

    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    const-string v2, "removeAppenderCalled: logger="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p1}, Lorg/apache/log4j/Category;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string p1, ", appender="

    invoke-virtual {v1, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-interface {p2}, Lorg/apache/log4j/Appender;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lorg/apache/log4j/Category;->debug(Ljava/lang/Object;)V

    return-void
.end method

.method public removeNotificationListener(Ljavax/management/NotificationListener;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljavax/management/ListenerNotFoundException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/jmx/HierarchyDynamicMBean;->i:Ljavax/management/NotificationBroadcasterSupport;

    invoke-virtual {v0, p1}, Ljavax/management/NotificationBroadcasterSupport;->removeNotificationListener(Ljavax/management/NotificationListener;)V

    return-void
.end method

.method public setAttribute(Ljavax/management/Attribute;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljavax/management/AttributeNotFoundException;,
            Ljavax/management/InvalidAttributeValueException;,
            Ljavax/management/MBeanException;,
            Ljavax/management/ReflectionException;
        }
    .end annotation

    if-eqz p1, :cond_2

    .line 1
    invoke-virtual {p1}, Ljavax/management/Attribute;->getName()Ljava/lang/String;

    move-result-object v0

    .line 2
    invoke-virtual {p1}, Ljavax/management/Attribute;->getValue()Ljava/lang/Object;

    move-result-object p1

    if-eqz v0, :cond_1

    const-string v1, "threshold"

    .line 3
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    check-cast p1, Ljava/lang/String;

    iget-object v0, p0, Lorg/apache/log4j/jmx/HierarchyDynamicMBean;->j:Lorg/apache/log4j/spi/LoggerRepository;

    invoke-interface {v0}, Lorg/apache/log4j/spi/LoggerRepository;->getThreshold()Lorg/apache/log4j/Level;

    move-result-object v0

    invoke-static {p1, v0}, Lorg/apache/log4j/helpers/OptionConverter;->toLevel(Ljava/lang/String;Lorg/apache/log4j/Level;)Lorg/apache/log4j/Level;

    move-result-object p1

    .line 5
    iget-object v0, p0, Lorg/apache/log4j/jmx/HierarchyDynamicMBean;->j:Lorg/apache/log4j/spi/LoggerRepository;

    invoke-interface {v0, p1}, Lorg/apache/log4j/spi/LoggerRepository;->setThreshold(Lorg/apache/log4j/Level;)V

    :cond_0
    return-void

    .line 6
    :cond_1
    new-instance p1, Ljavax/management/RuntimeOperationsException;

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Attribute name cannot be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    const-string v2, "Cannot invoke the setter of "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v2, p0, Lorg/apache/log4j/jmx/HierarchyDynamicMBean;->g:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v2, " with null attribute name"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Ljavax/management/RuntimeOperationsException;-><init>(Ljava/lang/RuntimeException;Ljava/lang/String;)V

    throw p1

    .line 7
    :cond_2
    new-instance p1, Ljavax/management/RuntimeOperationsException;

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Attribute cannot be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    const-string v2, "Cannot invoke a setter of "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v2, p0, Lorg/apache/log4j/jmx/HierarchyDynamicMBean;->g:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v2, " with null attribute"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Ljavax/management/RuntimeOperationsException;-><init>(Ljava/lang/RuntimeException;Ljava/lang/String;)V

    throw p1
.end method
