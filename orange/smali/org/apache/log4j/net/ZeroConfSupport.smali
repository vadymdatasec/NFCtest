.class public Lorg/apache/log4j/net/ZeroConfSupport;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static b:Ljava/lang/Object;

.field public static c:Ljava/lang/Class;

.field public static d:Ljava/lang/Class;

.field public static synthetic e:Ljava/lang/Class;

.field public static synthetic f:Ljava/lang/Class;

.field public static synthetic g:Ljava/lang/Class;


# instance fields
.field public a:Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    invoke-static {}, Lorg/apache/log4j/net/ZeroConfSupport;->c()Ljava/lang/Object;

    move-result-object v0

    sput-object v0, Lorg/apache/log4j/net/ZeroConfSupport;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 1

    .line 7
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-direct {p0, p1, p2, p3, v0}, Lorg/apache/log4j/net/ZeroConfSupport;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/util/Map;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    :try_start_0
    sget-object v0, Lorg/apache/log4j/net/ZeroConfSupport;->c:Ljava/lang/Class;

    const-string v1, "create"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_0

    const-string v0, "using JmDNS version 3 to construct serviceInfo instance"

    .line 3
    invoke-static {v0}, Lorg/apache/log4j/helpers/LogLog;->debug(Ljava/lang/String;)V

    .line 4
    invoke-virtual {p0, p1, p2, p3, p4}, Lorg/apache/log4j/net/ZeroConfSupport;->b(Ljava/lang/String;ILjava/lang/String;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lorg/apache/log4j/net/ZeroConfSupport;->a:Ljava/lang/Object;

    goto :goto_1

    :cond_0
    const-string v0, "using JmDNS version 1.0 to construct serviceInfo instance"

    .line 5
    invoke-static {v0}, Lorg/apache/log4j/helpers/LogLog;->debug(Ljava/lang/String;)V

    .line 6
    invoke-virtual {p0, p1, p2, p3, p4}, Lorg/apache/log4j/net/ZeroConfSupport;->a(Ljava/lang/String;ILjava/lang/String;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lorg/apache/log4j/net/ZeroConfSupport;->a:Ljava/lang/Object;

    :goto_1
    return-void
.end method

.method public static synthetic a(Ljava/lang/String;)Ljava/lang/Class;
    .locals 1

    .line 21
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

    const-string v0, "Unable to instantiate JMDNS"

    .line 1
    :try_start_0
    sget-object v1, Lorg/apache/log4j/net/ZeroConfSupport;->c:Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v1

    .line 2
    invoke-static {v0, v1}, Lorg/apache/log4j/helpers/LogLog;->warn(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :catch_1
    move-exception v1

    .line 3
    invoke-static {v0, v1}, Lorg/apache/log4j/helpers/LogLog;->warn(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public static b()Ljava/lang/Object;
    .locals 3

    const/4 v0, 0x0

    .line 1
    :try_start_0
    sget-object v1, Lorg/apache/log4j/net/ZeroConfSupport;->c:Ljava/lang/Class;

    const-string v2, "create"

    invoke-virtual {v1, v2, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    .line 2
    invoke-virtual {v1, v0, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v1

    const-string v2, "Unable to call constructor"

    .line 3
    invoke-static {v2, v1}, Lorg/apache/log4j/helpers/LogLog;->warn(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :catch_1
    move-exception v1

    const-string v2, "Unable to access constructor"

    .line 4
    invoke-static {v2, v1}, Lorg/apache/log4j/helpers/LogLog;->warn(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :catch_2
    move-exception v1

    const-string v2, "Unable to instantiate jmdns class"

    .line 5
    invoke-static {v2, v1}, Lorg/apache/log4j/helpers/LogLog;->warn(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-object v0
.end method

.method public static c()Ljava/lang/Object;
    .locals 4

    :try_start_0
    const-string v0, "javax.jmdns.JmDNS"

    .line 1
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    sput-object v0, Lorg/apache/log4j/net/ZeroConfSupport;->c:Ljava/lang/Class;

    const-string v0, "javax.jmdns.ServiceInfo"

    .line 2
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    sput-object v0, Lorg/apache/log4j/net/ZeroConfSupport;->d:Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "JmDNS or serviceInfo class not found"

    .line 3
    invoke-static {v1, v0}, Lorg/apache/log4j/helpers/LogLog;->warn(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    const/4 v0, 0x0

    .line 4
    :try_start_1
    sget-object v1, Lorg/apache/log4j/net/ZeroConfSupport;->c:Ljava/lang/Class;

    const-string v2, "create"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_1

    const/4 v0, 0x1

    goto :goto_1

    :catch_1
    nop

    :goto_1
    if-eqz v0, :cond_0

    .line 5
    invoke-static {}, Lorg/apache/log4j/net/ZeroConfSupport;->b()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 6
    :cond_0
    invoke-static {}, Lorg/apache/log4j/net/ZeroConfSupport;->a()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public static getJMDNSInstance()Ljava/lang/Object;
    .locals 1

    .line 1
    sget-object v0, Lorg/apache/log4j/net/ZeroConfSupport;->b:Ljava/lang/Object;

    return-object v0
.end method


# virtual methods
.method public final a(Ljava/lang/String;ILjava/lang/String;Ljava/util/Map;)Ljava/lang/Object;
    .locals 10

    const-string v0, "Unable to construct ServiceInfo instance"

    .line 4
    new-instance v1, Ljava/util/Hashtable;

    invoke-direct {v1, p4}, Ljava/util/Hashtable;-><init>(Ljava/util/Map;)V

    const/4 p4, 0x6

    :try_start_0
    new-array v2, p4, [Ljava/lang/Class;

    .line 5
    sget-object v3, Lorg/apache/log4j/net/ZeroConfSupport;->e:Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    const-string v4, "java.lang.String"

    if-nez v3, :cond_0

    :try_start_1
    invoke-static {v4}, Lorg/apache/log4j/net/ZeroConfSupport;->a(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    sput-object v3, Lorg/apache/log4j/net/ZeroConfSupport;->e:Ljava/lang/Class;

    goto :goto_0

    :cond_0
    sget-object v3, Lorg/apache/log4j/net/ZeroConfSupport;->e:Ljava/lang/Class;

    :goto_0
    const/4 v5, 0x0

    aput-object v3, v2, v5

    .line 6
    sget-object v3, Lorg/apache/log4j/net/ZeroConfSupport;->e:Ljava/lang/Class;

    if-nez v3, :cond_1

    invoke-static {v4}, Lorg/apache/log4j/net/ZeroConfSupport;->a(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    sput-object v3, Lorg/apache/log4j/net/ZeroConfSupport;->e:Ljava/lang/Class;

    goto :goto_1

    :cond_1
    sget-object v3, Lorg/apache/log4j/net/ZeroConfSupport;->e:Ljava/lang/Class;

    :goto_1
    const/4 v4, 0x1

    aput-object v3, v2, v4

    .line 7
    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const/4 v6, 0x2

    aput-object v3, v2, v6

    .line 8
    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const/4 v7, 0x3

    aput-object v3, v2, v7

    .line 9
    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const/4 v8, 0x4

    aput-object v3, v2, v8

    .line 10
    sget-object v3, Lorg/apache/log4j/net/ZeroConfSupport;->f:Ljava/lang/Class;

    if-nez v3, :cond_2

    const-string v3, "java.util.Hashtable"

    invoke-static {v3}, Lorg/apache/log4j/net/ZeroConfSupport;->a(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    sput-object v3, Lorg/apache/log4j/net/ZeroConfSupport;->f:Ljava/lang/Class;

    goto :goto_2

    :cond_2
    sget-object v3, Lorg/apache/log4j/net/ZeroConfSupport;->f:Ljava/lang/Class;

    :goto_2
    const/4 v9, 0x5

    aput-object v3, v2, v9

    .line 11
    sget-object v3, Lorg/apache/log4j/net/ZeroConfSupport;->d:Ljava/lang/Class;

    invoke-virtual {v3, v2}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v2

    new-array p4, p4, [Ljava/lang/Object;

    aput-object p1, p4, v5

    aput-object p3, p4, v4

    .line 12
    new-instance p1, Ljava/lang/Integer;

    invoke-direct {p1, p2}, Ljava/lang/Integer;-><init>(I)V

    aput-object p1, p4, v6

    .line 13
    new-instance p1, Ljava/lang/Integer;

    invoke-direct {p1, v5}, Ljava/lang/Integer;-><init>(I)V

    aput-object p1, p4, v7

    .line 14
    new-instance p1, Ljava/lang/Integer;

    invoke-direct {p1, v5}, Ljava/lang/Integer;-><init>(I)V

    aput-object p1, p4, v8

    aput-object v1, p4, v9

    .line 15
    invoke-virtual {v2, p4}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 16
    new-instance p2, Ljava/lang/StringBuffer;

    invoke-direct {p2}, Ljava/lang/StringBuffer;-><init>()V

    const-string p3, "created serviceinfo: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    invoke-virtual {p2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lorg/apache/log4j/helpers/LogLog;->debug(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/InstantiationException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 17
    invoke-static {v0, p1}, Lorg/apache/log4j/helpers/LogLog;->warn(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_3

    :catch_1
    move-exception p1

    .line 18
    invoke-static {v0, p1}, Lorg/apache/log4j/helpers/LogLog;->warn(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_3

    :catch_2
    move-exception p1

    const-string p2, "Unable to get ServiceInfo constructor"

    .line 19
    invoke-static {p2, p1}, Lorg/apache/log4j/helpers/LogLog;->warn(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_3

    :catch_3
    move-exception p1

    .line 20
    invoke-static {v0, p1}, Lorg/apache/log4j/helpers/LogLog;->warn(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_3
    const/4 p1, 0x0

    return-object p1
.end method

.method public advertise()V
    .locals 7

    const-string v0, "Unable to invoke registerService method"

    .line 1
    :try_start_0
    sget-object v1, Lorg/apache/log4j/net/ZeroConfSupport;->c:Ljava/lang/Class;

    const-string v2, "registerService"

    const/4 v3, 0x1

    new-array v4, v3, [Ljava/lang/Class;

    sget-object v5, Lorg/apache/log4j/net/ZeroConfSupport;->d:Ljava/lang/Class;

    const/4 v6, 0x0

    aput-object v5, v4, v6

    invoke-virtual {v1, v2, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    .line 2
    sget-object v2, Lorg/apache/log4j/net/ZeroConfSupport;->b:Ljava/lang/Object;

    new-array v3, v3, [Ljava/lang/Object;

    iget-object v4, p0, Lorg/apache/log4j/net/ZeroConfSupport;->a:Ljava/lang/Object;

    aput-object v4, v3, v6

    invoke-virtual {v1, v2, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    const-string v2, "registered serviceInfo: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v2, p0, Lorg/apache/log4j/net/ZeroConfSupport;->a:Ljava/lang/Object;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lorg/apache/log4j/helpers/LogLog;->debug(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    .line 4
    invoke-static {v0, v1}, Lorg/apache/log4j/helpers/LogLog;->warn(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :catch_1
    move-exception v0

    const-string v1, "No registerService method"

    .line 5
    invoke-static {v1, v0}, Lorg/apache/log4j/helpers/LogLog;->warn(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :catch_2
    move-exception v1

    .line 6
    invoke-static {v0, v1}, Lorg/apache/log4j/helpers/LogLog;->warn(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public final b(Ljava/lang/String;ILjava/lang/String;Ljava/util/Map;)Ljava/lang/Object;
    .locals 12

    const-string v1, "Unable to invoke create method"

    const/4 v2, 0x0

    const/4 v0, 0x6

    :try_start_0
    new-array v3, v0, [Ljava/lang/Class;

    .line 6
    sget-object v4, Lorg/apache/log4j/net/ZeroConfSupport;->e:Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    const-string v5, "java.lang.String"

    if-nez v4, :cond_0

    :try_start_1
    invoke-static {v5}, Lorg/apache/log4j/net/ZeroConfSupport;->a(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    sput-object v4, Lorg/apache/log4j/net/ZeroConfSupport;->e:Ljava/lang/Class;

    goto :goto_0

    :cond_0
    sget-object v4, Lorg/apache/log4j/net/ZeroConfSupport;->e:Ljava/lang/Class;

    :goto_0
    const/4 v6, 0x0

    aput-object v4, v3, v6

    .line 7
    sget-object v4, Lorg/apache/log4j/net/ZeroConfSupport;->e:Ljava/lang/Class;

    if-nez v4, :cond_1

    invoke-static {v5}, Lorg/apache/log4j/net/ZeroConfSupport;->a(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    sput-object v4, Lorg/apache/log4j/net/ZeroConfSupport;->e:Ljava/lang/Class;

    goto :goto_1

    :cond_1
    sget-object v4, Lorg/apache/log4j/net/ZeroConfSupport;->e:Ljava/lang/Class;

    :goto_1
    const/4 v5, 0x1

    aput-object v4, v3, v5

    .line 8
    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const/4 v7, 0x2

    aput-object v4, v3, v7

    .line 9
    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const/4 v8, 0x3

    aput-object v4, v3, v8

    .line 10
    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const/4 v9, 0x4

    aput-object v4, v3, v9

    .line 11
    sget-object v4, Lorg/apache/log4j/net/ZeroConfSupport;->g:Ljava/lang/Class;

    if-nez v4, :cond_2

    const-string v4, "java.util.Map"

    invoke-static {v4}, Lorg/apache/log4j/net/ZeroConfSupport;->a(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    sput-object v4, Lorg/apache/log4j/net/ZeroConfSupport;->g:Ljava/lang/Class;

    goto :goto_2

    :cond_2
    sget-object v4, Lorg/apache/log4j/net/ZeroConfSupport;->g:Ljava/lang/Class;

    :goto_2
    const/4 v10, 0x5

    aput-object v4, v3, v10

    .line 12
    sget-object v4, Lorg/apache/log4j/net/ZeroConfSupport;->d:Ljava/lang/Class;

    const-string v11, "create"

    invoke-virtual {v4, v11, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    new-array v0, v0, [Ljava/lang/Object;

    aput-object p1, v0, v6

    aput-object p3, v0, v5

    .line 13
    new-instance v4, Ljava/lang/Integer;

    move v5, p2

    invoke-direct {v4, p2}, Ljava/lang/Integer;-><init>(I)V

    aput-object v4, v0, v7

    .line 14
    new-instance v4, Ljava/lang/Integer;

    invoke-direct {v4, v6}, Ljava/lang/Integer;-><init>(I)V

    aput-object v4, v0, v8

    .line 15
    new-instance v4, Ljava/lang/Integer;

    invoke-direct {v4, v6}, Ljava/lang/Integer;-><init>(I)V

    aput-object v4, v0, v9

    aput-object p4, v0, v10

    .line 16
    invoke-virtual {v3, v2, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 17
    new-instance v3, Ljava/lang/StringBuffer;

    invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V

    const-string v4, "created serviceinfo: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lorg/apache/log4j/helpers/LogLog;->debug(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 18
    invoke-static {v1, v0}, Lorg/apache/log4j/helpers/LogLog;->warn(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_3

    :catch_1
    move-exception v0

    const-string v1, "Unable to find create method"

    .line 19
    invoke-static {v1, v0}, Lorg/apache/log4j/helpers/LogLog;->warn(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_3

    :catch_2
    move-exception v0

    .line 20
    invoke-static {v1, v0}, Lorg/apache/log4j/helpers/LogLog;->warn(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_3
    return-object v2
.end method

.method public unadvertise()V
    .locals 7

    const-string v0, "Unable to invoke unregisterService method"

    .line 1
    :try_start_0
    sget-object v1, Lorg/apache/log4j/net/ZeroConfSupport;->c:Ljava/lang/Class;

    const-string v2, "unregisterService"

    const/4 v3, 0x1

    new-array v4, v3, [Ljava/lang/Class;

    sget-object v5, Lorg/apache/log4j/net/ZeroConfSupport;->d:Ljava/lang/Class;

    const/4 v6, 0x0

    aput-object v5, v4, v6

    invoke-virtual {v1, v2, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    .line 2
    sget-object v2, Lorg/apache/log4j/net/ZeroConfSupport;->b:Ljava/lang/Object;

    new-array v3, v3, [Ljava/lang/Object;

    iget-object v4, p0, Lorg/apache/log4j/net/ZeroConfSupport;->a:Ljava/lang/Object;

    aput-object v4, v3, v6

    invoke-virtual {v1, v2, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    const-string v2, "unregistered serviceInfo: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v2, p0, Lorg/apache/log4j/net/ZeroConfSupport;->a:Ljava/lang/Object;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lorg/apache/log4j/helpers/LogLog;->debug(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    .line 4
    invoke-static {v0, v1}, Lorg/apache/log4j/helpers/LogLog;->warn(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :catch_1
    move-exception v0

    const-string v1, "No unregisterService method"

    .line 5
    invoke-static {v1, v0}, Lorg/apache/log4j/helpers/LogLog;->warn(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :catch_2
    move-exception v1

    .line 6
    invoke-static {v0, v1}, Lorg/apache/log4j/helpers/LogLog;->warn(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
