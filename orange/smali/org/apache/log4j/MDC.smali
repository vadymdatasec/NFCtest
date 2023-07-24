.class public Lorg/apache/log4j/MDC;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final d:Lorg/apache/log4j/MDC;

.field public static synthetic e:Ljava/lang/Class;


# instance fields
.field public a:Z

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/reflect/Method;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lorg/apache/log4j/MDC;

    invoke-direct {v0}, Lorg/apache/log4j/MDC;-><init>()V

    sput-object v0, Lorg/apache/log4j/MDC;->d:Lorg/apache/log4j/MDC;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {}, Lorg/apache/log4j/helpers/Loader;->isJava1()Z

    move-result v0

    iput-boolean v0, p0, Lorg/apache/log4j/MDC;->a:Z

    if-nez v0, :cond_0

    .line 3
    new-instance v0, Lorg/apache/log4j/helpers/ThreadLocalMap;

    invoke-direct {v0}, Lorg/apache/log4j/helpers/ThreadLocalMap;-><init>()V

    iput-object v0, p0, Lorg/apache/log4j/MDC;->b:Ljava/lang/Object;

    .line 4
    :cond_0
    :try_start_0
    sget-object v0, Lorg/apache/log4j/MDC;->e:Ljava/lang/Class;

    if-nez v0, :cond_1

    const-string v0, "java.lang.ThreadLocal"

    invoke-static {v0}, Lorg/apache/log4j/MDC;->c(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    sput-object v0, Lorg/apache/log4j/MDC;->e:Ljava/lang/Class;

    goto :goto_0

    :cond_1
    sget-object v0, Lorg/apache/log4j/MDC;->e:Ljava/lang/Class;

    :goto_0
    const-string v1, "remove"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iput-object v0, p0, Lorg/apache/log4j/MDC;->c:Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public static synthetic c(Ljava/lang/String;)Ljava/lang/Class;
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

.method public static clear()V
    .locals 1

    .line 1
    sget-object v0, Lorg/apache/log4j/MDC;->d:Lorg/apache/log4j/MDC;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lorg/apache/log4j/MDC;->a()V

    :cond_0
    return-void
.end method

.method public static get(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .line 1
    sget-object v0, Lorg/apache/log4j/MDC;->d:Lorg/apache/log4j/MDC;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p0}, Lorg/apache/log4j/MDC;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static getContext()Ljava/util/Hashtable;
    .locals 1

    .line 1
    sget-object v0, Lorg/apache/log4j/MDC;->d:Lorg/apache/log4j/MDC;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lorg/apache/log4j/MDC;->b()Ljava/util/Hashtable;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public static put(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    .line 1
    sget-object v0, Lorg/apache/log4j/MDC;->d:Lorg/apache/log4j/MDC;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p0, p1}, Lorg/apache/log4j/MDC;->a(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public static remove(Ljava/lang/String;)V
    .locals 1

    .line 1
    sget-object v0, Lorg/apache/log4j/MDC;->d:Lorg/apache/log4j/MDC;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p0}, Lorg/apache/log4j/MDC;->b(Ljava/lang/String;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Ljava/lang/Object;
    .locals 2

    .line 6
    iget-boolean v0, p0, Lorg/apache/log4j/MDC;->a:Z

    const/4 v1, 0x0

    if-nez v0, :cond_1

    iget-object v0, p0, Lorg/apache/log4j/MDC;->b:Ljava/lang/Object;

    if-nez v0, :cond_0

    goto :goto_0

    .line 7
    :cond_0
    check-cast v0, Lorg/apache/log4j/helpers/ThreadLocalMap;

    invoke-virtual {v0}, Ljava/lang/InheritableThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Hashtable;

    if-eqz v0, :cond_1

    if-eqz p1, :cond_1

    .line 8
    invoke-virtual {v0, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    :goto_0
    return-object v1
.end method

.method public final a()V
    .locals 3

    .line 9
    iget-boolean v0, p0, Lorg/apache/log4j/MDC;->a:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lorg/apache/log4j/MDC;->b:Ljava/lang/Object;

    if-eqz v0, :cond_1

    .line 10
    check-cast v0, Lorg/apache/log4j/helpers/ThreadLocalMap;

    invoke-virtual {v0}, Ljava/lang/InheritableThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Hashtable;

    if-eqz v0, :cond_0

    .line 11
    invoke-virtual {v0}, Ljava/util/Hashtable;->clear()V

    .line 12
    :cond_0
    iget-object v0, p0, Lorg/apache/log4j/MDC;->c:Ljava/lang/reflect/Method;

    if-eqz v0, :cond_1

    .line 13
    :try_start_0
    iget-object v1, p0, Lorg/apache/log4j/MDC;->b:Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_1
    return-void
.end method

.method public final a(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lorg/apache/log4j/MDC;->a:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Lorg/apache/log4j/MDC;->b:Ljava/lang/Object;

    if-nez v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    check-cast v0, Lorg/apache/log4j/helpers/ThreadLocalMap;

    invoke-virtual {v0}, Ljava/lang/InheritableThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Hashtable;

    if-nez v0, :cond_1

    .line 3
    new-instance v0, Ljava/util/Hashtable;

    const/4 v1, 0x7

    invoke-direct {v0, v1}, Ljava/util/Hashtable;-><init>(I)V

    .line 4
    iget-object v1, p0, Lorg/apache/log4j/MDC;->b:Ljava/lang/Object;

    check-cast v1, Lorg/apache/log4j/helpers/ThreadLocalMap;

    invoke-virtual {v1, v0}, Ljava/lang/InheritableThreadLocal;->set(Ljava/lang/Object;)V

    .line 5
    :cond_1
    invoke-virtual {v0, p1, p2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    :goto_0
    return-void
.end method

.method public final b()Ljava/util/Hashtable;
    .locals 1

    .line 6
    iget-boolean v0, p0, Lorg/apache/log4j/MDC;->a:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lorg/apache/log4j/MDC;->b:Ljava/lang/Object;

    if-nez v0, :cond_0

    goto :goto_0

    .line 7
    :cond_0
    check-cast v0, Lorg/apache/log4j/helpers/ThreadLocalMap;

    invoke-virtual {v0}, Ljava/lang/InheritableThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Hashtable;

    return-object v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final b(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lorg/apache/log4j/MDC;->a:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lorg/apache/log4j/MDC;->b:Ljava/lang/Object;

    if-eqz v0, :cond_0

    .line 2
    check-cast v0, Lorg/apache/log4j/helpers/ThreadLocalMap;

    invoke-virtual {v0}, Ljava/lang/InheritableThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Hashtable;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0, p1}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    invoke-virtual {v0}, Ljava/util/Hashtable;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 5
    invoke-virtual {p0}, Lorg/apache/log4j/MDC;->a()V

    :cond_0
    return-void
.end method
