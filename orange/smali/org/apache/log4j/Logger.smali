.class public Lorg/apache/log4j/Logger;
.super Lorg/apache/log4j/Category;
.source "SourceFile"


# static fields
.field public static final j:Ljava/lang/String;

.field public static synthetic k:Ljava/lang/Class;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lorg/apache/log4j/Logger;->k:Ljava/lang/Class;

    if-nez v0, :cond_0

    const-string v0, "org.apache.log4j.Logger"

    invoke-static {v0}, Lorg/apache/log4j/Logger;->b(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    sput-object v0, Lorg/apache/log4j/Logger;->k:Ljava/lang/Class;

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lorg/apache/log4j/Logger;->j:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lorg/apache/log4j/Category;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic b(Ljava/lang/String;)Ljava/lang/Class;
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

.method public static getLogger(Ljava/lang/Class;)Lorg/apache/log4j/Logger;
    .locals 0

    .line 2
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lorg/apache/log4j/LogManager;->getLogger(Ljava/lang/String;)Lorg/apache/log4j/Logger;

    move-result-object p0

    return-object p0
.end method

.method public static getLogger(Ljava/lang/String;)Lorg/apache/log4j/Logger;
    .locals 0

    .line 1
    invoke-static {p0}, Lorg/apache/log4j/LogManager;->getLogger(Ljava/lang/String;)Lorg/apache/log4j/Logger;

    move-result-object p0

    return-object p0
.end method

.method public static getLogger(Ljava/lang/String;Lorg/apache/log4j/spi/LoggerFactory;)Lorg/apache/log4j/Logger;
    .locals 0

    .line 3
    invoke-static {p0, p1}, Lorg/apache/log4j/LogManager;->getLogger(Ljava/lang/String;Lorg/apache/log4j/spi/LoggerFactory;)Lorg/apache/log4j/Logger;

    move-result-object p0

    return-object p0
.end method

.method public static getRootLogger()Lorg/apache/log4j/Logger;
    .locals 1

    .line 1
    invoke-static {}, Lorg/apache/log4j/LogManager;->getRootLogger()Lorg/apache/log4j/Logger;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public isTraceEnabled()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/Category;->e:Lorg/apache/log4j/spi/LoggerRepository;

    const/16 v1, 0x1388

    invoke-interface {v0, v1}, Lorg/apache/log4j/spi/LoggerRepository;->isDisabled(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 2
    :cond_0
    sget-object v0, Lorg/apache/log4j/Level;->TRACE:Lorg/apache/log4j/Level;

    invoke-virtual {p0}, Lorg/apache/log4j/Category;->getEffectiveLevel()Lorg/apache/log4j/Level;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/apache/log4j/Priority;->isGreaterOrEqual(Lorg/apache/log4j/Priority;)Z

    move-result v0

    return v0
.end method

.method public trace(Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/Category;->e:Lorg/apache/log4j/spi/LoggerRepository;

    const/16 v1, 0x1388

    invoke-interface {v0, v1}, Lorg/apache/log4j/spi/LoggerRepository;->isDisabled(I)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    sget-object v0, Lorg/apache/log4j/Level;->TRACE:Lorg/apache/log4j/Level;

    invoke-virtual {p0}, Lorg/apache/log4j/Category;->getEffectiveLevel()Lorg/apache/log4j/Level;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/apache/log4j/Priority;->isGreaterOrEqual(Lorg/apache/log4j/Priority;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3
    sget-object v0, Lorg/apache/log4j/Logger;->j:Ljava/lang/String;

    sget-object v1, Lorg/apache/log4j/Level;->TRACE:Lorg/apache/log4j/Level;

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v1, p1, v2}, Lorg/apache/log4j/Category;->a(Ljava/lang/String;Lorg/apache/log4j/Priority;Ljava/lang/Object;Ljava/lang/Throwable;)V

    :cond_1
    return-void
.end method

.method public trace(Ljava/lang/Object;Ljava/lang/Throwable;)V
    .locals 2

    .line 4
    iget-object v0, p0, Lorg/apache/log4j/Category;->e:Lorg/apache/log4j/spi/LoggerRepository;

    const/16 v1, 0x1388

    invoke-interface {v0, v1}, Lorg/apache/log4j/spi/LoggerRepository;->isDisabled(I)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 5
    :cond_0
    sget-object v0, Lorg/apache/log4j/Level;->TRACE:Lorg/apache/log4j/Level;

    invoke-virtual {p0}, Lorg/apache/log4j/Category;->getEffectiveLevel()Lorg/apache/log4j/Level;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/apache/log4j/Priority;->isGreaterOrEqual(Lorg/apache/log4j/Priority;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 6
    sget-object v0, Lorg/apache/log4j/Logger;->j:Ljava/lang/String;

    sget-object v1, Lorg/apache/log4j/Level;->TRACE:Lorg/apache/log4j/Level;

    invoke-virtual {p0, v0, v1, p1, p2}, Lorg/apache/log4j/Category;->a(Ljava/lang/String;Lorg/apache/log4j/Priority;Ljava/lang/Object;Ljava/lang/Throwable;)V

    :cond_1
    return-void
.end method
