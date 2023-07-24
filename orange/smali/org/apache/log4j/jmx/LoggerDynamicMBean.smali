.class public Lorg/apache/log4j/jmx/LoggerDynamicMBean;
.super Lorg/apache/log4j/jmx/AbstractDynamicMBean;
.source "SourceFile"

# interfaces
.implements Ljavax/management/NotificationListener;


# static fields
.field public static j:Lorg/apache/log4j/Logger;

.field public static synthetic k:Ljava/lang/Class;

.field public static synthetic l:Ljava/lang/Class;


# instance fields
.field public d:[Ljavax/management/MBeanConstructorInfo;

.field public e:[Ljavax/management/MBeanOperationInfo;

.field public f:Ljava/util/Vector;

.field public g:Ljava/lang/String;

.field public h:Ljava/lang/String;

.field public i:Lorg/apache/log4j/Logger;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lorg/apache/log4j/jmx/LoggerDynamicMBean;->k:Ljava/lang/Class;

    if-nez v0, :cond_0

    const-string v0, "org.apache.log4j.jmx.LoggerDynamicMBean"

    invoke-static {v0}, Lorg/apache/log4j/jmx/LoggerDynamicMBean;->a(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    sput-object v0, Lorg/apache/log4j/jmx/LoggerDynamicMBean;->k:Ljava/lang/Class;

    :cond_0
    invoke-static {v0}, Lorg/apache/log4j/Logger;->getLogger(Ljava/lang/Class;)Lorg/apache/log4j/Logger;

    move-result-object v0

    sput-object v0, Lorg/apache/log4j/jmx/LoggerDynamicMBean;->j:Lorg/apache/log4j/Logger;

    return-void
.end method

.method public constructor <init>(Lorg/apache/log4j/Logger;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lorg/apache/log4j/jmx/AbstractDynamicMBean;-><init>()V

    const/4 v0, 0x1

    new-array v1, v0, [Ljavax/management/MBeanConstructorInfo;

    .line 2
    iput-object v1, p0, Lorg/apache/log4j/jmx/LoggerDynamicMBean;->d:[Ljavax/management/MBeanConstructorInfo;

    new-array v0, v0, [Ljavax/management/MBeanOperationInfo;

    .line 3
    iput-object v0, p0, Lorg/apache/log4j/jmx/LoggerDynamicMBean;->e:[Ljavax/management/MBeanOperationInfo;

    .line 4
    new-instance v0, Ljava/util/Vector;

    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    iput-object v0, p0, Lorg/apache/log4j/jmx/LoggerDynamicMBean;->f:Ljava/util/Vector;

    .line 5
    const-class v0, Lorg/apache/log4j/jmx/LoggerDynamicMBean;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/apache/log4j/jmx/LoggerDynamicMBean;->g:Ljava/lang/String;

    const-string v0, "This MBean acts as a management facade for a org.apache.log4j.Logger instance."

    .line 6
    iput-object v0, p0, Lorg/apache/log4j/jmx/LoggerDynamicMBean;->h:Ljava/lang/String;

    .line 7
    iput-object p1, p0, Lorg/apache/log4j/jmx/LoggerDynamicMBean;->i:Lorg/apache/log4j/Logger;

    .line 8
    invoke-virtual {p0}, Lorg/apache/log4j/jmx/LoggerDynamicMBean;->c()V

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
.method public a()Lorg/apache/log4j/Logger;
    .locals 1

    .line 2
    iget-object v0, p0, Lorg/apache/log4j/jmx/LoggerDynamicMBean;->i:Lorg/apache/log4j/Logger;

    return-object v0
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 3
    sget-object v0, Lorg/apache/log4j/jmx/LoggerDynamicMBean;->j:Lorg/apache/log4j/Logger;

    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    const-string v2, "addAppender called with "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v2, ", "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/apache/log4j/Category;->debug(Ljava/lang/Object;)V

    .line 4
    sget-object v0, Lorg/apache/log4j/jmx/LoggerDynamicMBean;->l:Ljava/lang/Class;

    if-nez v0, :cond_0

    const-string v0, "org.apache.log4j.Appender"

    invoke-static {v0}, Lorg/apache/log4j/jmx/LoggerDynamicMBean;->a(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    sput-object v0, Lorg/apache/log4j/jmx/LoggerDynamicMBean;->l:Ljava/lang/Class;

    :cond_0
    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Lorg/apache/log4j/helpers/OptionConverter;->instantiateByClassName(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/apache/log4j/Appender;

    .line 5
    invoke-interface {p1, p2}, Lorg/apache/log4j/Appender;->setName(Ljava/lang/String;)V

    .line 6
    iget-object p2, p0, Lorg/apache/log4j/jmx/LoggerDynamicMBean;->i:Lorg/apache/log4j/Logger;

    invoke-virtual {p2, p1}, Lorg/apache/log4j/Category;->addAppender(Lorg/apache/log4j/Appender;)V

    return-void
.end method

.method public b()V
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/jmx/LoggerDynamicMBean;->i:Lorg/apache/log4j/Logger;

    invoke-virtual {v0}, Lorg/apache/log4j/Category;->getAllAppenders()Ljava/util/Enumeration;

    move-result-object v0

    .line 2
    :goto_0
    invoke-interface {v0}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 3
    invoke-interface {v0}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/apache/log4j/Appender;

    .line 4
    invoke-virtual {p0, v1}, Lorg/apache/log4j/jmx/LoggerDynamicMBean;->b(Lorg/apache/log4j/Appender;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public b(Lorg/apache/log4j/Appender;)V
    .locals 11

    const-string v0, "]."

    const-string v1, "Could not add appenderMBean for ["

    .line 5
    invoke-static {p1}, Lorg/apache/log4j/jmx/AbstractDynamicMBean;->a(Lorg/apache/log4j/Appender;)Ljava/lang/String;

    move-result-object v2

    .line 6
    sget-object v3, Lorg/apache/log4j/jmx/LoggerDynamicMBean;->j:Lorg/apache/log4j/Logger;

    new-instance v4, Ljava/lang/StringBuffer;

    invoke-direct {v4}, Ljava/lang/StringBuffer;-><init>()V

    const-string v5, "Adding AppenderMBean for appender named "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v4}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lorg/apache/log4j/Category;->debug(Ljava/lang/Object;)V

    .line 7
    :try_start_0
    new-instance v3, Lorg/apache/log4j/jmx/AppenderDynamicMBean;

    invoke-direct {v3, p1}, Lorg/apache/log4j/jmx/AppenderDynamicMBean;-><init>(Lorg/apache/log4j/Appender;)V

    .line 8
    new-instance p1, Ljavax/management/ObjectName;

    const-string v4, "log4j"

    const-string v5, "appender"

    invoke-direct {p1, v4, v5, v2}, Ljavax/management/ObjectName;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    iget-object v4, p0, Lorg/apache/log4j/jmx/AbstractDynamicMBean;->b:Ljavax/management/MBeanServer;

    invoke-interface {v4, p1}, Ljavax/management/MBeanServer;->isRegistered(Ljavax/management/ObjectName;)Z

    move-result v4

    if-nez v4, :cond_0

    .line 10
    invoke-virtual {p0, v3, p1}, Lorg/apache/log4j/jmx/AbstractDynamicMBean;->a(Ljava/lang/Object;Ljavax/management/ObjectName;)V

    .line 11
    iget-object p1, p0, Lorg/apache/log4j/jmx/LoggerDynamicMBean;->f:Ljava/util/Vector;

    new-instance v10, Ljavax/management/MBeanAttributeInfo;

    new-instance v3, Ljava/lang/StringBuffer;

    invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V

    const-string v4, "appender="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v4

    const-string v5, "javax.management.ObjectName"

    new-instance v3, Ljava/lang/StringBuffer;

    invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V

    const-string v6, "The "

    invoke-virtual {v3, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v6, " appender."

    invoke-virtual {v3, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x1

    const/4 v8, 0x1

    const/4 v9, 0x0

    move-object v3, v10

    invoke-direct/range {v3 .. v9}, Ljavax/management/MBeanAttributeInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)V

    invoke-virtual {p1, v10}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljavax/management/JMException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/beans/IntrospectionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 12
    sget-object v3, Lorg/apache/log4j/jmx/LoggerDynamicMBean;->j:Lorg/apache/log4j/Logger;

    new-instance v4, Ljava/lang/StringBuffer;

    invoke-direct {v4}, Ljava/lang/StringBuffer;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v4}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0, p1}, Lorg/apache/log4j/Category;->error(Ljava/lang/Object;Ljava/lang/Throwable;)V

    goto :goto_0

    :catch_1
    move-exception p1

    .line 13
    sget-object v3, Lorg/apache/log4j/jmx/LoggerDynamicMBean;->j:Lorg/apache/log4j/Logger;

    new-instance v4, Ljava/lang/StringBuffer;

    invoke-direct {v4}, Ljava/lang/StringBuffer;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v4}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0, p1}, Lorg/apache/log4j/Category;->error(Ljava/lang/Object;Ljava/lang/Throwable;)V

    goto :goto_0

    :catch_2
    move-exception p1

    .line 14
    sget-object v3, Lorg/apache/log4j/jmx/LoggerDynamicMBean;->j:Lorg/apache/log4j/Logger;

    new-instance v4, Ljava/lang/StringBuffer;

    invoke-direct {v4}, Ljava/lang/StringBuffer;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v4}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0, p1}, Lorg/apache/log4j/Category;->error(Ljava/lang/Object;Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    return-void
.end method

.method public final c()V
    .locals 11

    .line 1
    const-class v0, Lorg/apache/log4j/jmx/LoggerDynamicMBean;

    invoke-virtual {v0}, Ljava/lang/Class;->getConstructors()[Ljava/lang/reflect/Constructor;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lorg/apache/log4j/jmx/LoggerDynamicMBean;->d:[Ljavax/management/MBeanConstructorInfo;

    new-instance v2, Ljavax/management/MBeanConstructorInfo;

    const/4 v3, 0x0

    aget-object v0, v0, v3

    const-string v4, "HierarchyDynamicMBean(): Constructs a HierarchyDynamicMBean instance"

    invoke-direct {v2, v4, v0}, Ljavax/management/MBeanConstructorInfo;-><init>(Ljava/lang/String;Ljava/lang/reflect/Constructor;)V

    aput-object v2, v1, v3

    .line 3
    iget-object v0, p0, Lorg/apache/log4j/jmx/LoggerDynamicMBean;->f:Ljava/util/Vector;

    new-instance v1, Ljavax/management/MBeanAttributeInfo;

    const-string v5, "name"

    const-string v6, "java.lang.String"

    const-string v7, "The name of this Logger."

    const/4 v8, 0x1

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v4, v1

    invoke-direct/range {v4 .. v10}, Ljavax/management/MBeanAttributeInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)V

    invoke-virtual {v0, v1}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    .line 4
    iget-object v0, p0, Lorg/apache/log4j/jmx/LoggerDynamicMBean;->f:Ljava/util/Vector;

    new-instance v1, Ljavax/management/MBeanAttributeInfo;

    const-string v5, "priority"

    const-string v6, "java.lang.String"

    const-string v7, "The priority of this logger."

    const/4 v9, 0x1

    move-object v4, v1

    invoke-direct/range {v4 .. v10}, Ljavax/management/MBeanAttributeInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)V

    invoke-virtual {v0, v1}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    const/4 v0, 0x2

    new-array v7, v0, [Ljavax/management/MBeanParameterInfo;

    .line 5
    new-instance v0, Ljavax/management/MBeanParameterInfo;

    const-string v1, "java.lang.String"

    const-string v2, "class name"

    const-string v4, "add an appender to this logger"

    invoke-direct {v0, v2, v1, v4}, Ljavax/management/MBeanParameterInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    aput-object v0, v7, v3

    .line 6
    new-instance v0, Ljavax/management/MBeanParameterInfo;

    const-string v2, "appender name"

    const-string v4, "name of the appender"

    invoke-direct {v0, v2, v1, v4}, Ljavax/management/MBeanParameterInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v1, 0x1

    aput-object v0, v7, v1

    .line 7
    iget-object v0, p0, Lorg/apache/log4j/jmx/LoggerDynamicMBean;->e:[Ljavax/management/MBeanOperationInfo;

    new-instance v1, Ljavax/management/MBeanOperationInfo;

    const-string v5, "addAppender"

    const-string v6, "addAppender(): add an appender"

    const-string v8, "void"

    move-object v4, v1

    invoke-direct/range {v4 .. v9}, Ljavax/management/MBeanOperationInfo;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljavax/management/MBeanParameterInfo;Ljava/lang/String;I)V

    aput-object v1, v0, v3

    return-void
.end method

.method public getAttribute(Ljava/lang/String;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljavax/management/AttributeNotFoundException;,
            Ljavax/management/MBeanException;,
            Ljavax/management/ReflectionException;
        }
    .end annotation

    const-string v0, "Could not create ObjectName"

    if-eqz p1, :cond_4

    const-string v1, "name"

    .line 1
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 2
    iget-object p1, p0, Lorg/apache/log4j/jmx/LoggerDynamicMBean;->i:Lorg/apache/log4j/Logger;

    invoke-virtual {p1}, Lorg/apache/log4j/Category;->getName()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const-string v1, "priority"

    .line 3
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 4
    iget-object p1, p0, Lorg/apache/log4j/jmx/LoggerDynamicMBean;->i:Lorg/apache/log4j/Logger;

    invoke-virtual {p1}, Lorg/apache/log4j/Category;->getLevel()Lorg/apache/log4j/Level;

    move-result-object p1

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return-object p1

    .line 5
    :cond_1
    invoke-virtual {p1}, Lorg/apache/log4j/Priority;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_2
    const-string v1, "appender="

    .line 6
    invoke-virtual {p1, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 7
    :try_start_0
    new-instance v1, Ljavax/management/ObjectName;

    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    const-string v3, "log4j:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljavax/management/ObjectName;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljavax/management/MalformedObjectNameException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    .line 8
    :catch_0
    sget-object v1, Lorg/apache/log4j/jmx/LoggerDynamicMBean;->j:Lorg/apache/log4j/Logger;

    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lorg/apache/log4j/Category;->error(Ljava/lang/Object;)V

    goto :goto_0

    .line 9
    :catch_1
    sget-object v1, Lorg/apache/log4j/jmx/LoggerDynamicMBean;->j:Lorg/apache/log4j/Logger;

    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lorg/apache/log4j/Category;->error(Ljava/lang/Object;)V

    .line 10
    :cond_3
    :goto_0
    new-instance v0, Ljavax/management/AttributeNotFoundException;

    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    const-string v2, "Cannot find "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string p1, " attribute in "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object p1, p0, Lorg/apache/log4j/jmx/LoggerDynamicMBean;->g:Ljava/lang/String;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljavax/management/AttributeNotFoundException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 11
    :cond_4
    new-instance p1, Ljavax/management/RuntimeOperationsException;

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Attribute name cannot be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    const-string v2, "Cannot invoke a getter of "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v2, p0, Lorg/apache/log4j/jmx/LoggerDynamicMBean;->g:Ljava/lang/String;

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
    iget-object v0, p0, Lorg/apache/log4j/jmx/LoggerDynamicMBean;->f:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v0

    new-array v4, v0, [Ljavax/management/MBeanAttributeInfo;

    .line 2
    iget-object v0, p0, Lorg/apache/log4j/jmx/LoggerDynamicMBean;->f:Ljava/util/Vector;

    invoke-virtual {v0, v4}, Ljava/util/Vector;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 3
    new-instance v0, Ljavax/management/MBeanInfo;

    iget-object v2, p0, Lorg/apache/log4j/jmx/LoggerDynamicMBean;->g:Ljava/lang/String;

    iget-object v3, p0, Lorg/apache/log4j/jmx/LoggerDynamicMBean;->h:Ljava/lang/String;

    iget-object v5, p0, Lorg/apache/log4j/jmx/LoggerDynamicMBean;->d:[Ljavax/management/MBeanConstructorInfo;

    iget-object v6, p0, Lorg/apache/log4j/jmx/LoggerDynamicMBean;->e:[Ljavax/management/MBeanOperationInfo;

    const/4 v1, 0x0

    new-array v7, v1, [Ljavax/management/MBeanNotificationInfo;

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, Ljavax/management/MBeanInfo;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljavax/management/MBeanAttributeInfo;[Ljavax/management/MBeanConstructorInfo;[Ljavax/management/MBeanOperationInfo;[Ljavax/management/MBeanNotificationInfo;)V

    return-object v0
.end method

.method public handleNotification(Ljavax/management/Notification;Ljava/lang/Object;)V
    .locals 2

    .line 1
    sget-object p2, Lorg/apache/log4j/jmx/LoggerDynamicMBean;->j:Lorg/apache/log4j/Logger;

    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    const-string v1, "Received notification: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p1}, Ljavax/management/Notification;->getType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lorg/apache/log4j/Category;->debug(Ljava/lang/Object;)V

    .line 2
    invoke-virtual {p1}, Ljavax/management/Notification;->getUserData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/apache/log4j/Appender;

    invoke-virtual {p0, p1}, Lorg/apache/log4j/jmx/LoggerDynamicMBean;->b(Lorg/apache/log4j/Appender;)V

    return-void
.end method

.method public invoke(Ljava/lang/String;[Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljavax/management/MBeanException;,
            Ljavax/management/ReflectionException;
        }
    .end annotation

    const-string p3, "addAppender"

    .line 1
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    .line 2
    aget-object p1, p2, p1

    check-cast p1, Ljava/lang/String;

    const/4 p3, 0x1

    aget-object p2, p2, p3

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lorg/apache/log4j/jmx/LoggerDynamicMBean;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "Hello world."

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public postRegister(Ljava/lang/Boolean;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lorg/apache/log4j/jmx/LoggerDynamicMBean;->b()V

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

    if-eqz p1, :cond_4

    .line 1
    invoke-virtual {p1}, Ljavax/management/Attribute;->getName()Ljava/lang/String;

    move-result-object v0

    .line 2
    invoke-virtual {p1}, Ljavax/management/Attribute;->getValue()Ljava/lang/Object;

    move-result-object p1

    if-eqz v0, :cond_3

    const-string v1, "priority"

    .line 3
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 4
    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 5
    check-cast p1, Ljava/lang/String;

    .line 6
    iget-object v0, p0, Lorg/apache/log4j/jmx/LoggerDynamicMBean;->i:Lorg/apache/log4j/Logger;

    invoke-virtual {v0}, Lorg/apache/log4j/Category;->getLevel()Lorg/apache/log4j/Level;

    move-result-object v0

    const-string v1, "NULL"

    .line 7
    invoke-virtual {p1, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 8
    :cond_0
    invoke-static {p1, v0}, Lorg/apache/log4j/helpers/OptionConverter;->toLevel(Ljava/lang/String;Lorg/apache/log4j/Level;)Lorg/apache/log4j/Level;

    move-result-object p1

    .line 9
    :goto_0
    iget-object v0, p0, Lorg/apache/log4j/jmx/LoggerDynamicMBean;->i:Lorg/apache/log4j/Logger;

    invoke-virtual {v0, p1}, Lorg/apache/log4j/Category;->setLevel(Lorg/apache/log4j/Level;)V

    :cond_1
    return-void

    .line 10
    :cond_2
    new-instance p1, Ljavax/management/AttributeNotFoundException;

    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    const-string v2, "Attribute "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v0, " not found in "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-class v0, Lorg/apache/log4j/jmx/LoggerDynamicMBean;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljavax/management/AttributeNotFoundException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 11
    :cond_3
    new-instance p1, Ljavax/management/RuntimeOperationsException;

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Attribute name cannot be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    const-string v2, "Cannot invoke the setter of "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v2, p0, Lorg/apache/log4j/jmx/LoggerDynamicMBean;->g:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v2, " with null attribute name"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Ljavax/management/RuntimeOperationsException;-><init>(Ljava/lang/RuntimeException;Ljava/lang/String;)V

    throw p1

    .line 12
    :cond_4
    new-instance p1, Ljavax/management/RuntimeOperationsException;

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Attribute cannot be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    const-string v2, "Cannot invoke a setter of "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v2, p0, Lorg/apache/log4j/jmx/LoggerDynamicMBean;->g:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v2, " with null attribute"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Ljavax/management/RuntimeOperationsException;-><init>(Ljava/lang/RuntimeException;Ljava/lang/String;)V

    throw p1
.end method
