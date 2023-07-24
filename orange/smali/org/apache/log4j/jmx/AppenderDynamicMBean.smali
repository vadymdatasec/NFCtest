.class public Lorg/apache/log4j/jmx/AppenderDynamicMBean;
.super Lorg/apache/log4j/jmx/AbstractDynamicMBean;
.source "SourceFile"


# static fields
.field public static k:Lorg/apache/log4j/Logger;

.field public static synthetic l:Ljava/lang/Class;

.field public static synthetic m:Ljava/lang/Class;

.field public static synthetic n:Ljava/lang/Class;

.field public static synthetic o:Ljava/lang/Class;


# instance fields
.field public d:[Ljavax/management/MBeanConstructorInfo;

.field public e:Ljava/util/Vector;

.field public f:Ljava/lang/String;

.field public g:Ljava/util/Hashtable;

.field public h:[Ljavax/management/MBeanOperationInfo;

.field public i:Ljava/lang/String;

.field public j:Lorg/apache/log4j/Appender;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lorg/apache/log4j/jmx/AppenderDynamicMBean;->l:Ljava/lang/Class;

    if-nez v0, :cond_0

    const-string v0, "org.apache.log4j.jmx.AppenderDynamicMBean"

    invoke-static {v0}, Lorg/apache/log4j/jmx/AppenderDynamicMBean;->a(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    sput-object v0, Lorg/apache/log4j/jmx/AppenderDynamicMBean;->l:Ljava/lang/Class;

    :cond_0
    invoke-static {v0}, Lorg/apache/log4j/Logger;->getLogger(Ljava/lang/Class;)Lorg/apache/log4j/Logger;

    move-result-object v0

    sput-object v0, Lorg/apache/log4j/jmx/AppenderDynamicMBean;->k:Lorg/apache/log4j/Logger;

    return-void
.end method

.method public constructor <init>(Lorg/apache/log4j/Appender;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/beans/IntrospectionException;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lorg/apache/log4j/jmx/AbstractDynamicMBean;-><init>()V

    const/4 v0, 0x1

    new-array v0, v0, [Ljavax/management/MBeanConstructorInfo;

    .line 2
    iput-object v0, p0, Lorg/apache/log4j/jmx/AppenderDynamicMBean;->d:[Ljavax/management/MBeanConstructorInfo;

    .line 3
    new-instance v0, Ljava/util/Vector;

    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    iput-object v0, p0, Lorg/apache/log4j/jmx/AppenderDynamicMBean;->e:Ljava/util/Vector;

    .line 4
    const-class v0, Lorg/apache/log4j/jmx/AppenderDynamicMBean;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/apache/log4j/jmx/AppenderDynamicMBean;->f:Ljava/lang/String;

    .line 5
    new-instance v0, Ljava/util/Hashtable;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Ljava/util/Hashtable;-><init>(I)V

    iput-object v0, p0, Lorg/apache/log4j/jmx/AppenderDynamicMBean;->g:Ljava/util/Hashtable;

    const/4 v0, 0x2

    new-array v0, v0, [Ljavax/management/MBeanOperationInfo;

    .line 6
    iput-object v0, p0, Lorg/apache/log4j/jmx/AppenderDynamicMBean;->h:[Ljavax/management/MBeanOperationInfo;

    const-string v0, "This MBean acts as a management facade for log4j appenders."

    .line 7
    iput-object v0, p0, Lorg/apache/log4j/jmx/AppenderDynamicMBean;->i:Ljava/lang/String;

    .line 8
    iput-object p1, p0, Lorg/apache/log4j/jmx/AppenderDynamicMBean;->j:Lorg/apache/log4j/Appender;

    .line 9
    invoke-virtual {p0}, Lorg/apache/log4j/jmx/AppenderDynamicMBean;->b()V

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

    .line 15
    sget-object v0, Lorg/apache/log4j/jmx/AppenderDynamicMBean;->k:Lorg/apache/log4j/Logger;

    return-object v0
.end method

.method public a(Lorg/apache/log4j/Layout;)V
    .locals 11

    const-string v0, "]."

    const-string v1, "Could not add DynamicLayoutMBean for ["

    if-nez p1, :cond_0

    return-void

    .line 5
    :cond_0
    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    iget-object v3, p0, Lorg/apache/log4j/jmx/AppenderDynamicMBean;->j:Lorg/apache/log4j/Appender;

    invoke-static {v3}, Lorg/apache/log4j/jmx/AbstractDynamicMBean;->a(Lorg/apache/log4j/Appender;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v3, ",layout="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v2

    .line 6
    sget-object v3, Lorg/apache/log4j/jmx/AppenderDynamicMBean;->k:Lorg/apache/log4j/Logger;

    new-instance v4, Ljava/lang/StringBuffer;

    invoke-direct {v4}, Ljava/lang/StringBuffer;-><init>()V

    const-string v5, "Adding LayoutMBean:"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v4}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lorg/apache/log4j/Category;->debug(Ljava/lang/Object;)V

    .line 7
    :try_start_0
    new-instance v3, Lorg/apache/log4j/jmx/LayoutDynamicMBean;

    invoke-direct {v3, p1}, Lorg/apache/log4j/jmx/LayoutDynamicMBean;-><init>(Lorg/apache/log4j/Layout;)V

    .line 8
    new-instance p1, Ljavax/management/ObjectName;

    new-instance v4, Ljava/lang/StringBuffer;

    invoke-direct {v4}, Ljava/lang/StringBuffer;-><init>()V

    const-string v5, "log4j:appender="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v4}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {p1, v4}, Ljavax/management/ObjectName;-><init>(Ljava/lang/String;)V

    .line 9
    iget-object v4, p0, Lorg/apache/log4j/jmx/AbstractDynamicMBean;->b:Ljavax/management/MBeanServer;

    invoke-interface {v4, p1}, Ljavax/management/MBeanServer;->isRegistered(Ljavax/management/ObjectName;)Z

    move-result v4

    if-nez v4, :cond_1

    .line 10
    invoke-virtual {p0, v3, p1}, Lorg/apache/log4j/jmx/AbstractDynamicMBean;->a(Ljava/lang/Object;Ljavax/management/ObjectName;)V

    .line 11
    iget-object p1, p0, Lorg/apache/log4j/jmx/AppenderDynamicMBean;->e:Ljava/util/Vector;

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

    const-string v6, " layout."

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
    sget-object v3, Lorg/apache/log4j/jmx/AppenderDynamicMBean;->k:Lorg/apache/log4j/Logger;

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
    sget-object v3, Lorg/apache/log4j/jmx/AppenderDynamicMBean;->k:Lorg/apache/log4j/Logger;

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
    sget-object v3, Lorg/apache/log4j/jmx/AppenderDynamicMBean;->k:Lorg/apache/log4j/Logger;

    new-instance v4, Ljava/lang/StringBuffer;

    invoke-direct {v4}, Ljava/lang/StringBuffer;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v4}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0, p1}, Lorg/apache/log4j/Category;->error(Ljava/lang/Object;Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final a(Ljava/lang/Class;)Z
    .locals 2

    .line 2
    invoke-virtual {p1}, Ljava/lang/Class;->isPrimitive()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    .line 3
    :cond_0
    sget-object v0, Lorg/apache/log4j/jmx/AppenderDynamicMBean;->n:Ljava/lang/Class;

    if-nez v0, :cond_1

    const-string v0, "java.lang.String"

    invoke-static {v0}, Lorg/apache/log4j/jmx/AppenderDynamicMBean;->a(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    sput-object v0, Lorg/apache/log4j/jmx/AppenderDynamicMBean;->n:Ljava/lang/Class;

    :cond_1
    if-ne p1, v0, :cond_2

    return v1

    .line 4
    :cond_2
    sget-object v0, Lorg/apache/log4j/jmx/AppenderDynamicMBean;->m:Ljava/lang/Class;

    if-nez v0, :cond_3

    const-string v0, "org.apache.log4j.Priority"

    invoke-static {v0}, Lorg/apache/log4j/jmx/AppenderDynamicMBean;->a(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    sput-object v0, Lorg/apache/log4j/jmx/AppenderDynamicMBean;->m:Ljava/lang/Class;

    :cond_3
    invoke-virtual {p1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_4

    return v1

    :cond_4
    const/4 p1, 0x0

    return p1
.end method

.method public final b()V
    .locals 17
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/beans/IntrospectionException;
        }
    .end annotation

    move-object/from16 v0, p0

    .line 1
    const-class v1, Lorg/apache/log4j/jmx/AppenderDynamicMBean;

    invoke-virtual {v1}, Ljava/lang/Class;->getConstructors()[Ljava/lang/reflect/Constructor;

    move-result-object v1

    .line 2
    iget-object v2, v0, Lorg/apache/log4j/jmx/AppenderDynamicMBean;->d:[Ljavax/management/MBeanConstructorInfo;

    new-instance v3, Ljavax/management/MBeanConstructorInfo;

    const/4 v4, 0x0

    aget-object v1, v1, v4

    const-string v5, "AppenderDynamicMBean(): Constructs a AppenderDynamicMBean instance"

    invoke-direct {v3, v5, v1}, Ljavax/management/MBeanConstructorInfo;-><init>(Ljava/lang/String;Ljava/lang/reflect/Constructor;)V

    aput-object v3, v2, v4

    .line 3
    iget-object v1, v0, Lorg/apache/log4j/jmx/AppenderDynamicMBean;->j:Lorg/apache/log4j/Appender;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-static {v1}, Ljava/beans/Introspector;->getBeanInfo(Ljava/lang/Class;)Ljava/beans/BeanInfo;

    move-result-object v1

    .line 4
    invoke-interface {v1}, Ljava/beans/BeanInfo;->getPropertyDescriptors()[Ljava/beans/PropertyDescriptor;

    move-result-object v1

    .line 5
    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    const-string v5, "java.lang.String"

    const/4 v6, 0x1

    if-ge v3, v2, :cond_4

    .line 6
    aget-object v7, v1, v3

    invoke-virtual {v7}, Ljava/beans/PropertyDescriptor;->getName()Ljava/lang/String;

    move-result-object v7

    .line 7
    aget-object v8, v1, v3

    invoke-virtual {v8}, Ljava/beans/PropertyDescriptor;->getReadMethod()Ljava/lang/reflect/Method;

    move-result-object v15

    .line 8
    aget-object v8, v1, v3

    invoke-virtual {v8}, Ljava/beans/PropertyDescriptor;->getWriteMethod()Ljava/lang/reflect/Method;

    move-result-object v14

    if-eqz v15, :cond_3

    .line 9
    invoke-virtual {v15}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v8

    .line 10
    invoke-virtual {v0, v8}, Lorg/apache/log4j/jmx/AppenderDynamicMBean;->a(Ljava/lang/Class;)Z

    move-result v9

    if-eqz v9, :cond_3

    .line 11
    sget-object v9, Lorg/apache/log4j/jmx/AppenderDynamicMBean;->m:Ljava/lang/Class;

    if-nez v9, :cond_0

    const-string v9, "org.apache.log4j.Priority"

    invoke-static {v9}, Lorg/apache/log4j/jmx/AppenderDynamicMBean;->a(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v9

    sput-object v9, Lorg/apache/log4j/jmx/AppenderDynamicMBean;->m:Ljava/lang/Class;

    :cond_0
    invoke-virtual {v8, v9}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v9

    if-eqz v9, :cond_1

    goto :goto_1

    .line 12
    :cond_1
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    :goto_1
    move-object v10, v5

    .line 13
    iget-object v5, v0, Lorg/apache/log4j/jmx/AppenderDynamicMBean;->e:Ljava/util/Vector;

    new-instance v13, Ljavax/management/MBeanAttributeInfo;

    const/4 v12, 0x1

    if-eqz v14, :cond_2

    goto :goto_2

    :cond_2
    const/4 v6, 0x0

    :goto_2
    const/16 v16, 0x0

    const-string v11, "Dynamic"

    move-object v8, v13

    move-object v9, v7

    move-object v4, v13

    move v13, v6

    move-object v6, v14

    move/from16 v14, v16

    invoke-direct/range {v8 .. v14}, Ljavax/management/MBeanAttributeInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)V

    invoke-virtual {v5, v4}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    .line 14
    iget-object v4, v0, Lorg/apache/log4j/jmx/AppenderDynamicMBean;->g:Ljava/util/Hashtable;

    new-instance v5, Lm/a/b/i/a;

    invoke-direct {v5, v15, v6}, Lm/a/b/i/a;-><init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V

    invoke-virtual {v4, v7, v5}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    add-int/lit8 v3, v3, 0x1

    const/4 v4, 0x0

    goto :goto_0

    :cond_4
    const/4 v3, 0x0

    new-array v10, v3, [Ljavax/management/MBeanParameterInfo;

    .line 15
    iget-object v1, v0, Lorg/apache/log4j/jmx/AppenderDynamicMBean;->h:[Ljavax/management/MBeanOperationInfo;

    new-instance v2, Ljavax/management/MBeanOperationInfo;

    const/4 v12, 0x1

    const-string v8, "activateOptions"

    const-string v9, "activateOptions(): add an appender"

    const-string v11, "void"

    move-object v7, v2

    invoke-direct/range {v7 .. v12}, Ljavax/management/MBeanOperationInfo;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljavax/management/MBeanParameterInfo;Ljava/lang/String;I)V

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-array v10, v6, [Ljavax/management/MBeanParameterInfo;

    .line 16
    new-instance v1, Ljavax/management/MBeanParameterInfo;

    const-string v2, "layout class"

    invoke-direct {v1, v2, v5, v2}, Ljavax/management/MBeanParameterInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    aput-object v1, v10, v3

    .line 17
    iget-object v1, v0, Lorg/apache/log4j/jmx/AppenderDynamicMBean;->h:[Ljavax/management/MBeanOperationInfo;

    new-instance v2, Ljavax/management/MBeanOperationInfo;

    const-string v8, "setLayout"

    const-string v9, "setLayout(): add a layout"

    const-string v11, "void"

    move-object v7, v2

    invoke-direct/range {v7 .. v12}, Ljavax/management/MBeanOperationInfo;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljavax/management/MBeanParameterInfo;Ljava/lang/String;I)V

    aput-object v2, v1, v6

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

    const-string v0, "attributeName"

    if-eqz p1, :cond_4

    .line 1
    sget-object v1, Lorg/apache/log4j/jmx/AppenderDynamicMBean;->k:Lorg/apache/log4j/Logger;

    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    const-string v3, "getAttribute called with ["

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v3, "]."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lorg/apache/log4j/Category;->debug(Ljava/lang/Object;)V

    .line 2
    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    const-string v2, "appender="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v2, p0, Lorg/apache/log4j/jmx/AppenderDynamicMBean;->j:Lorg/apache/log4j/Appender;

    invoke-interface {v2}, Lorg/apache/log4j/Appender;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v2, ",layout"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 3
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

    :catch_0
    move-exception v1

    .line 4
    sget-object v2, Lorg/apache/log4j/jmx/AppenderDynamicMBean;->k:Lorg/apache/log4j/Logger;

    invoke-virtual {v2, v0, v1}, Lorg/apache/log4j/Category;->error(Ljava/lang/Object;Ljava/lang/Throwable;)V

    goto :goto_0

    :catch_1
    move-exception v1

    .line 5
    sget-object v2, Lorg/apache/log4j/jmx/AppenderDynamicMBean;->k:Lorg/apache/log4j/Logger;

    invoke-virtual {v2, v0, v1}, Lorg/apache/log4j/Category;->error(Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 6
    :cond_0
    :goto_0
    iget-object v0, p0, Lorg/apache/log4j/jmx/AppenderDynamicMBean;->g:Ljava/util/Hashtable;

    invoke-virtual {v0, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm/a/b/i/a;

    if-eqz v0, :cond_3

    .line 7
    iget-object v0, v0, Lm/a/b/i/a;->a:Ljava/lang/reflect/Method;

    if-eqz v0, :cond_3

    const/4 p1, 0x0

    .line 8
    :try_start_1
    iget-object v1, p0, Lorg/apache/log4j/jmx/AppenderDynamicMBean;->j:Lorg/apache/log4j/Appender;

    invoke-virtual {v0, v1, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_2

    :catch_2
    return-object p1

    :catch_3
    move-exception v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;

    move-result-object v1

    instance-of v1, v1, Ljava/lang/InterruptedException;

    if-nez v1, :cond_1

    invoke-virtual {v0}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;

    move-result-object v0

    instance-of v0, v0, Ljava/io/InterruptedIOException;

    if-eqz v0, :cond_2

    .line 10
    :cond_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    :catch_4
    :cond_2
    return-object p1

    .line 11
    :cond_3
    new-instance v0, Ljavax/management/AttributeNotFoundException;

    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    const-string v2, "Cannot find "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string p1, " attribute in "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object p1, p0, Lorg/apache/log4j/jmx/AppenderDynamicMBean;->f:Ljava/lang/String;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljavax/management/AttributeNotFoundException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 12
    :cond_4
    new-instance p1, Ljavax/management/RuntimeOperationsException;

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Attribute name cannot be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    const-string v2, "Cannot invoke a getter of "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v2, p0, Lorg/apache/log4j/jmx/AppenderDynamicMBean;->f:Ljava/lang/String;

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
    sget-object v0, Lorg/apache/log4j/jmx/AppenderDynamicMBean;->k:Lorg/apache/log4j/Logger;

    const-string v1, "getMBeanInfo called."

    invoke-virtual {v0, v1}, Lorg/apache/log4j/Category;->debug(Ljava/lang/Object;)V

    .line 2
    iget-object v0, p0, Lorg/apache/log4j/jmx/AppenderDynamicMBean;->e:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v0

    new-array v4, v0, [Ljavax/management/MBeanAttributeInfo;

    .line 3
    iget-object v0, p0, Lorg/apache/log4j/jmx/AppenderDynamicMBean;->e:Ljava/util/Vector;

    invoke-virtual {v0, v4}, Ljava/util/Vector;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 4
    new-instance v0, Ljavax/management/MBeanInfo;

    iget-object v2, p0, Lorg/apache/log4j/jmx/AppenderDynamicMBean;->f:Ljava/lang/String;

    iget-object v3, p0, Lorg/apache/log4j/jmx/AppenderDynamicMBean;->i:Ljava/lang/String;

    iget-object v5, p0, Lorg/apache/log4j/jmx/AppenderDynamicMBean;->d:[Ljavax/management/MBeanConstructorInfo;

    iget-object v6, p0, Lorg/apache/log4j/jmx/AppenderDynamicMBean;->h:[Ljavax/management/MBeanOperationInfo;

    const/4 v1, 0x0

    new-array v7, v1, [Ljavax/management/MBeanNotificationInfo;

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, Ljavax/management/MBeanInfo;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljavax/management/MBeanAttributeInfo;[Ljavax/management/MBeanConstructorInfo;[Ljavax/management/MBeanOperationInfo;[Ljavax/management/MBeanNotificationInfo;)V

    return-object v0
.end method

.method public invoke(Ljava/lang/String;[Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljavax/management/MBeanException;,
            Ljavax/management/ReflectionException;
        }
    .end annotation

    const-string p3, "activateOptions"

    .line 1
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_0

    iget-object p3, p0, Lorg/apache/log4j/jmx/AppenderDynamicMBean;->j:Lorg/apache/log4j/Appender;

    instance-of v0, p3, Lorg/apache/log4j/spi/OptionHandler;

    if-eqz v0, :cond_0

    .line 2
    check-cast p3, Lorg/apache/log4j/spi/OptionHandler;

    .line 3
    invoke-interface {p3}, Lorg/apache/log4j/spi/OptionHandler;->activateOptions()V

    const-string p1, "Options activated."

    return-object p1

    :cond_0
    const-string p3, "setLayout"

    .line 4
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    const/4 p3, 0x0

    if-eqz p1, :cond_2

    const/4 p1, 0x0

    .line 5
    aget-object p1, p2, p1

    check-cast p1, Ljava/lang/String;

    sget-object p2, Lorg/apache/log4j/jmx/AppenderDynamicMBean;->o:Ljava/lang/Class;

    if-nez p2, :cond_1

    const-string p2, "org.apache.log4j.Layout"

    invoke-static {p2}, Lorg/apache/log4j/jmx/AppenderDynamicMBean;->a(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p2

    sput-object p2, Lorg/apache/log4j/jmx/AppenderDynamicMBean;->o:Ljava/lang/Class;

    :cond_1
    invoke-static {p1, p2, p3}, Lorg/apache/log4j/helpers/OptionConverter;->instantiateByClassName(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/apache/log4j/Layout;

    .line 6
    iget-object p2, p0, Lorg/apache/log4j/jmx/AppenderDynamicMBean;->j:Lorg/apache/log4j/Appender;

    invoke-interface {p2, p1}, Lorg/apache/log4j/Appender;->setLayout(Lorg/apache/log4j/Layout;)V

    .line 7
    invoke-virtual {p0, p1}, Lorg/apache/log4j/jmx/AppenderDynamicMBean;->a(Lorg/apache/log4j/Layout;)V

    :cond_2
    return-object p3
.end method

.method public preRegister(Ljavax/management/MBeanServer;Ljavax/management/ObjectName;)Ljavax/management/ObjectName;
    .locals 3

    .line 1
    sget-object v0, Lorg/apache/log4j/jmx/AppenderDynamicMBean;->k:Lorg/apache/log4j/Logger;

    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    const-string v2, "preRegister called. Server="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    const-string v2, ", name="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/apache/log4j/Category;->debug(Ljava/lang/Object;)V

    .line 2
    iput-object p1, p0, Lorg/apache/log4j/jmx/AbstractDynamicMBean;->b:Ljavax/management/MBeanServer;

    .line 3
    iget-object p1, p0, Lorg/apache/log4j/jmx/AppenderDynamicMBean;->j:Lorg/apache/log4j/Appender;

    invoke-interface {p1}, Lorg/apache/log4j/Appender;->getLayout()Lorg/apache/log4j/Layout;

    move-result-object p1

    invoke-virtual {p0, p1}, Lorg/apache/log4j/jmx/AppenderDynamicMBean;->a(Lorg/apache/log4j/Layout;)V

    return-object p2
.end method

.method public setAttribute(Ljavax/management/Attribute;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljavax/management/AttributeNotFoundException;,
            Ljavax/management/InvalidAttributeValueException;,
            Ljavax/management/MBeanException;,
            Ljavax/management/ReflectionException;
        }
    .end annotation

    const-string v0, "FIXME"

    if-eqz p1, :cond_7

    .line 1
    invoke-virtual {p1}, Ljavax/management/Attribute;->getName()Ljava/lang/String;

    move-result-object v1

    .line 2
    invoke-virtual {p1}, Ljavax/management/Attribute;->getValue()Ljava/lang/Object;

    move-result-object p1

    if-eqz v1, :cond_6

    .line 3
    iget-object v2, p0, Lorg/apache/log4j/jmx/AppenderDynamicMBean;->g:Ljava/util/Hashtable;

    invoke-virtual {v2, v1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm/a/b/i/a;

    if-eqz v2, :cond_4

    .line 4
    iget-object v3, v2, Lm/a/b/i/a;->b:Ljava/lang/reflect/Method;

    if-eqz v3, :cond_4

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    .line 5
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v3

    const/4 v5, 0x0

    .line 6
    aget-object v3, v3, v5

    sget-object v6, Lorg/apache/log4j/jmx/AppenderDynamicMBean;->m:Ljava/lang/Class;

    if-nez v6, :cond_0

    const-string v6, "org.apache.log4j.Priority"

    invoke-static {v6}, Lorg/apache/log4j/jmx/AppenderDynamicMBean;->a(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    sput-object v6, Lorg/apache/log4j/jmx/AppenderDynamicMBean;->m:Ljava/lang/Class;

    :cond_0
    if-ne v3, v6, :cond_1

    .line 7
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, v1}, Lorg/apache/log4j/jmx/AppenderDynamicMBean;->getAttribute(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/apache/log4j/Level;

    invoke-static {p1, v1}, Lorg/apache/log4j/helpers/OptionConverter;->toLevel(Ljava/lang/String;Lorg/apache/log4j/Level;)Lorg/apache/log4j/Level;

    move-result-object p1

    :cond_1
    aput-object p1, v4, v5

    .line 8
    :try_start_0
    iget-object p1, v2, Lm/a/b/i/a;->b:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lorg/apache/log4j/jmx/AppenderDynamicMBean;->j:Lorg/apache/log4j/Appender;

    invoke-virtual {p1, v1, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 9
    sget-object v1, Lorg/apache/log4j/jmx/AppenderDynamicMBean;->k:Lorg/apache/log4j/Logger;

    invoke-virtual {v1, v0, p1}, Lorg/apache/log4j/Category;->error(Ljava/lang/Object;Ljava/lang/Throwable;)V

    goto :goto_0

    :catch_1
    move-exception p1

    .line 10
    sget-object v1, Lorg/apache/log4j/jmx/AppenderDynamicMBean;->k:Lorg/apache/log4j/Logger;

    invoke-virtual {v1, v0, p1}, Lorg/apache/log4j/Category;->error(Ljava/lang/Object;Ljava/lang/Throwable;)V

    goto :goto_0

    :catch_2
    move-exception p1

    .line 11
    invoke-virtual {p1}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;

    move-result-object v1

    instance-of v1, v1, Ljava/lang/InterruptedException;

    if-nez v1, :cond_2

    invoke-virtual {p1}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;

    move-result-object v1

    instance-of v1, v1, Ljava/io/InterruptedIOException;

    if-eqz v1, :cond_3

    .line 12
    :cond_2
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    .line 13
    :cond_3
    sget-object v1, Lorg/apache/log4j/jmx/AppenderDynamicMBean;->k:Lorg/apache/log4j/Logger;

    invoke-virtual {v1, v0, p1}, Lorg/apache/log4j/Category;->error(Ljava/lang/Object;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_4
    const-string p1, ".layout"

    .line 14
    invoke-virtual {v1, p1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_5

    :goto_0
    return-void

    .line 15
    :cond_5
    new-instance p1, Ljavax/management/AttributeNotFoundException;

    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    const-string v2, "Attribute "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v1, " not found in "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-class v1, Lorg/apache/log4j/jmx/AppenderDynamicMBean;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljavax/management/AttributeNotFoundException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 16
    :cond_6
    new-instance p1, Ljavax/management/RuntimeOperationsException;

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Attribute name cannot be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    const-string v2, "Cannot invoke the setter of "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v2, p0, Lorg/apache/log4j/jmx/AppenderDynamicMBean;->f:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v2, " with null attribute name"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Ljavax/management/RuntimeOperationsException;-><init>(Ljava/lang/RuntimeException;Ljava/lang/String;)V

    throw p1

    .line 17
    :cond_7
    new-instance p1, Ljavax/management/RuntimeOperationsException;

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Attribute cannot be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    const-string v2, "Cannot invoke a setter of "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v2, p0, Lorg/apache/log4j/jmx/AppenderDynamicMBean;->f:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v2, " with null attribute"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Ljavax/management/RuntimeOperationsException;-><init>(Ljava/lang/RuntimeException;Ljava/lang/String;)V

    throw p1
.end method
