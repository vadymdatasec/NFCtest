.class public Lorg/apache/log4j/jmx/Agent;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Lorg/apache/log4j/Logger;

.field public static synthetic b:Ljava/lang/Class;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lorg/apache/log4j/jmx/Agent;->b:Ljava/lang/Class;

    if-nez v0, :cond_0

    const-string v0, "org.apache.log4j.jmx.Agent"

    invoke-static {v0}, Lorg/apache/log4j/jmx/Agent;->a(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    sput-object v0, Lorg/apache/log4j/jmx/Agent;->b:Ljava/lang/Class;

    :cond_0
    invoke-static {v0}, Lorg/apache/log4j/Logger;->getLogger(Ljava/lang/Class;)Lorg/apache/log4j/Logger;

    move-result-object v0

    sput-object v0, Lorg/apache/log4j/jmx/Agent;->a:Lorg/apache/log4j/Logger;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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

.method public static a()Ljava/lang/Object;
    .locals 2

    :try_start_0
    const-string v0, "com.sun.jdmk.comm.HtmlAdapterServer"

    .line 2
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 3
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-virtual {v0}, Ljava/lang/IllegalAccessException;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1

    :catch_1
    move-exception v0

    .line 4
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-virtual {v0}, Ljava/lang/InstantiationException;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1

    :catch_2
    move-exception v0

    .line 5
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-virtual {v0}, Ljava/lang/ClassNotFoundException;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public static a(Ljava/lang/Object;)V
    .locals 4

    .line 6
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "start"

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Class;

    invoke-virtual {v0, v1, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    new-array v1, v2, [Ljava/lang/Object;

    invoke-virtual {v0, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    .line 7
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-virtual {p0}, Ljava/lang/IllegalAccessException;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :catch_1
    move-exception p0

    .line 8
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-virtual {p0}, Ljava/lang/NoSuchMethodException;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :catch_2
    move-exception p0

    .line 9
    invoke-virtual {p0}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;

    move-result-object p0

    .line 10
    instance-of v0, p0, Ljava/lang/RuntimeException;

    if-nez v0, :cond_3

    if-eqz p0, :cond_2

    .line 11
    instance-of v0, p0, Ljava/lang/InterruptedException;

    if-nez v0, :cond_0

    instance-of v0, p0, Ljava/io/InterruptedIOException;

    if-eqz v0, :cond_1

    .line 12
    :cond_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 13
    :cond_1
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-virtual {p0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 14
    :cond_2
    new-instance p0, Ljava/lang/RuntimeException;

    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    throw p0

    .line 15
    :cond_3
    check-cast p0, Ljava/lang/RuntimeException;

    throw p0
.end method


# virtual methods
.method public start()V
    .locals 6

    const-string v0, "Problem while registering MBeans instances."

    .line 1
    invoke-static {}, Ljavax/management/MBeanServerFactory;->createMBeanServer()Ljavax/management/MBeanServer;

    move-result-object v1

    .line 2
    invoke-static {}, Lorg/apache/log4j/jmx/Agent;->a()Ljava/lang/Object;

    move-result-object v2

    .line 3
    :try_start_0
    sget-object v3, Lorg/apache/log4j/jmx/Agent;->a:Lorg/apache/log4j/Logger;

    const-string v4, "Registering HtmlAdaptorServer instance."

    invoke-virtual {v3, v4}, Lorg/apache/log4j/Category;->info(Ljava/lang/Object;)V

    .line 4
    new-instance v3, Ljavax/management/ObjectName;

    const-string v4, "Adaptor:name=html,port=8082"

    invoke-direct {v3, v4}, Ljavax/management/ObjectName;-><init>(Ljava/lang/String;)V

    invoke-interface {v1, v2, v3}, Ljavax/management/MBeanServer;->registerMBean(Ljava/lang/Object;Ljavax/management/ObjectName;)Ljavax/management/ObjectInstance;

    .line 5
    sget-object v3, Lorg/apache/log4j/jmx/Agent;->a:Lorg/apache/log4j/Logger;

    const-string v4, "Registering HierarchyDynamicMBean instance."

    invoke-virtual {v3, v4}, Lorg/apache/log4j/Category;->info(Ljava/lang/Object;)V

    .line 6
    new-instance v3, Lorg/apache/log4j/jmx/HierarchyDynamicMBean;

    invoke-direct {v3}, Lorg/apache/log4j/jmx/HierarchyDynamicMBean;-><init>()V

    .line 7
    new-instance v4, Ljavax/management/ObjectName;

    const-string v5, "log4j:hiearchy=default"

    invoke-direct {v4, v5}, Ljavax/management/ObjectName;-><init>(Ljava/lang/String;)V

    invoke-interface {v1, v3, v4}, Ljavax/management/MBeanServer;->registerMBean(Ljava/lang/Object;Ljavax/management/ObjectName;)Ljavax/management/ObjectInstance;
    :try_end_0
    .catch Ljavax/management/JMException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    invoke-static {v2}, Lorg/apache/log4j/jmx/Agent;->a(Ljava/lang/Object;)V

    return-void

    :catch_0
    move-exception v1

    .line 9
    sget-object v2, Lorg/apache/log4j/jmx/Agent;->a:Lorg/apache/log4j/Logger;

    invoke-virtual {v2, v0, v1}, Lorg/apache/log4j/Category;->error(Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-void

    :catch_1
    move-exception v1

    .line 10
    sget-object v2, Lorg/apache/log4j/jmx/Agent;->a:Lorg/apache/log4j/Logger;

    invoke-virtual {v2, v0, v1}, Lorg/apache/log4j/Category;->error(Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-void
.end method
