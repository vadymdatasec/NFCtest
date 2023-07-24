.class public Lorg/apache/log4j/spi/LoggingEvent;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static l:J


# instance fields
.field public transient b:Lorg/apache/log4j/Category;

.field public c:Ljava/lang/String;

.field public final categoryName:Ljava/lang/String;

.field public d:Ljava/util/Hashtable;

.field public e:Z

.field public f:Z

.field public final transient fqnOfCategoryClass:Ljava/lang/String;

.field public transient g:Ljava/lang/Object;

.field public h:Ljava/lang/String;

.field public i:Ljava/lang/String;

.field public j:Lorg/apache/log4j/spi/ThrowableInformation;

.field public k:Lorg/apache/log4j/spi/LocationInfo;

.field public transient level:Lorg/apache/log4j/Priority;

.field public final timeStamp:J


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sput-wide v0, Lorg/apache/log4j/spi/LoggingEvent;->l:J

    .line 2
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 3
    new-instance v0, Ljava/util/Hashtable;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Ljava/util/Hashtable;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lorg/apache/log4j/Category;JLorg/apache/log4j/Level;Ljava/lang/Object;Ljava/lang/String;Lorg/apache/log4j/spi/ThrowableInformation;Ljava/lang/String;Lorg/apache/log4j/spi/LocationInfo;Ljava/util/Map;)V
    .locals 1

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 22
    iput-boolean v0, p0, Lorg/apache/log4j/spi/LoggingEvent;->e:Z

    .line 23
    iput-boolean v0, p0, Lorg/apache/log4j/spi/LoggingEvent;->f:Z

    .line 24
    iput-object p1, p0, Lorg/apache/log4j/spi/LoggingEvent;->fqnOfCategoryClass:Ljava/lang/String;

    .line 25
    iput-object p2, p0, Lorg/apache/log4j/spi/LoggingEvent;->b:Lorg/apache/log4j/Category;

    if-eqz p2, :cond_0

    .line 26
    invoke-virtual {p2}, Lorg/apache/log4j/Category;->getName()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lorg/apache/log4j/spi/LoggingEvent;->categoryName:Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 27
    iput-object p1, p0, Lorg/apache/log4j/spi/LoggingEvent;->categoryName:Ljava/lang/String;

    .line 28
    :goto_0
    iput-object p5, p0, Lorg/apache/log4j/spi/LoggingEvent;->level:Lorg/apache/log4j/Priority;

    .line 29
    iput-object p6, p0, Lorg/apache/log4j/spi/LoggingEvent;->g:Ljava/lang/Object;

    if-eqz p8, :cond_1

    .line 30
    iput-object p8, p0, Lorg/apache/log4j/spi/LoggingEvent;->j:Lorg/apache/log4j/spi/ThrowableInformation;

    .line 31
    :cond_1
    iput-wide p3, p0, Lorg/apache/log4j/spi/LoggingEvent;->timeStamp:J

    .line 32
    iput-object p7, p0, Lorg/apache/log4j/spi/LoggingEvent;->i:Ljava/lang/String;

    const/4 p1, 0x0

    .line 33
    iput-boolean p1, p0, Lorg/apache/log4j/spi/LoggingEvent;->e:Z

    .line 34
    iput-object p9, p0, Lorg/apache/log4j/spi/LoggingEvent;->c:Ljava/lang/String;

    .line 35
    iput-object p10, p0, Lorg/apache/log4j/spi/LoggingEvent;->k:Lorg/apache/log4j/spi/LocationInfo;

    .line 36
    iput-boolean p1, p0, Lorg/apache/log4j/spi/LoggingEvent;->f:Z

    if-eqz p11, :cond_2

    .line 37
    new-instance p1, Ljava/util/Hashtable;

    invoke-direct {p1, p11}, Ljava/util/Hashtable;-><init>(Ljava/util/Map;)V

    iput-object p1, p0, Lorg/apache/log4j/spi/LoggingEvent;->d:Ljava/util/Hashtable;

    :cond_2
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lorg/apache/log4j/Category;JLorg/apache/log4j/Priority;Ljava/lang/Object;Ljava/lang/Throwable;)V
    .locals 1

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 12
    iput-boolean v0, p0, Lorg/apache/log4j/spi/LoggingEvent;->e:Z

    .line 13
    iput-boolean v0, p0, Lorg/apache/log4j/spi/LoggingEvent;->f:Z

    .line 14
    iput-object p1, p0, Lorg/apache/log4j/spi/LoggingEvent;->fqnOfCategoryClass:Ljava/lang/String;

    .line 15
    iput-object p2, p0, Lorg/apache/log4j/spi/LoggingEvent;->b:Lorg/apache/log4j/Category;

    .line 16
    invoke-virtual {p2}, Lorg/apache/log4j/Category;->getName()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lorg/apache/log4j/spi/LoggingEvent;->categoryName:Ljava/lang/String;

    .line 17
    iput-object p5, p0, Lorg/apache/log4j/spi/LoggingEvent;->level:Lorg/apache/log4j/Priority;

    .line 18
    iput-object p6, p0, Lorg/apache/log4j/spi/LoggingEvent;->g:Ljava/lang/Object;

    if-eqz p7, :cond_0

    .line 19
    new-instance p1, Lorg/apache/log4j/spi/ThrowableInformation;

    invoke-direct {p1, p7, p2}, Lorg/apache/log4j/spi/ThrowableInformation;-><init>(Ljava/lang/Throwable;Lorg/apache/log4j/Category;)V

    iput-object p1, p0, Lorg/apache/log4j/spi/LoggingEvent;->j:Lorg/apache/log4j/spi/ThrowableInformation;

    .line 20
    :cond_0
    iput-wide p3, p0, Lorg/apache/log4j/spi/LoggingEvent;->timeStamp:J

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lorg/apache/log4j/Category;Lorg/apache/log4j/Priority;Ljava/lang/Object;Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lorg/apache/log4j/spi/LoggingEvent;->e:Z

    .line 3
    iput-boolean v0, p0, Lorg/apache/log4j/spi/LoggingEvent;->f:Z

    .line 4
    iput-object p1, p0, Lorg/apache/log4j/spi/LoggingEvent;->fqnOfCategoryClass:Ljava/lang/String;

    .line 5
    iput-object p2, p0, Lorg/apache/log4j/spi/LoggingEvent;->b:Lorg/apache/log4j/Category;

    .line 6
    invoke-virtual {p2}, Lorg/apache/log4j/Category;->getName()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lorg/apache/log4j/spi/LoggingEvent;->categoryName:Ljava/lang/String;

    .line 7
    iput-object p3, p0, Lorg/apache/log4j/spi/LoggingEvent;->level:Lorg/apache/log4j/Priority;

    .line 8
    iput-object p4, p0, Lorg/apache/log4j/spi/LoggingEvent;->g:Ljava/lang/Object;

    if-eqz p5, :cond_0

    .line 9
    new-instance p1, Lorg/apache/log4j/spi/ThrowableInformation;

    invoke-direct {p1, p5, p2}, Lorg/apache/log4j/spi/ThrowableInformation;-><init>(Ljava/lang/Throwable;Lorg/apache/log4j/Category;)V

    iput-object p1, p0, Lorg/apache/log4j/spi/LoggingEvent;->j:Lorg/apache/log4j/spi/ThrowableInformation;

    .line 10
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    iput-wide p1, p0, Lorg/apache/log4j/spi/LoggingEvent;->timeStamp:J

    return-void
.end method

.method public static getStartTime()J
    .locals 2

    .line 1
    sget-wide v0, Lorg/apache/log4j/spi/LoggingEvent;->l:J

    return-wide v0
.end method


# virtual methods
.method public getFQNOfLoggerClass()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/spi/LoggingEvent;->fqnOfCategoryClass:Ljava/lang/String;

    return-object v0
.end method

.method public getLevel()Lorg/apache/log4j/Level;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/spi/LoggingEvent;->level:Lorg/apache/log4j/Priority;

    check-cast v0, Lorg/apache/log4j/Level;

    return-object v0
.end method

.method public getLocationInformation()Lorg/apache/log4j/spi/LocationInfo;
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/spi/LoggingEvent;->k:Lorg/apache/log4j/spi/LocationInfo;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lorg/apache/log4j/spi/LocationInfo;

    new-instance v1, Ljava/lang/Throwable;

    invoke-direct {v1}, Ljava/lang/Throwable;-><init>()V

    iget-object v2, p0, Lorg/apache/log4j/spi/LoggingEvent;->fqnOfCategoryClass:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Lorg/apache/log4j/spi/LocationInfo;-><init>(Ljava/lang/Throwable;Ljava/lang/String;)V

    iput-object v0, p0, Lorg/apache/log4j/spi/LoggingEvent;->k:Lorg/apache/log4j/spi/LocationInfo;

    .line 3
    :cond_0
    iget-object v0, p0, Lorg/apache/log4j/spi/LoggingEvent;->k:Lorg/apache/log4j/spi/LocationInfo;

    return-object v0
.end method

.method public getLogger()Lorg/apache/log4j/Category;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/spi/LoggingEvent;->b:Lorg/apache/log4j/Category;

    return-object v0
.end method

.method public getLoggerName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/spi/LoggingEvent;->categoryName:Ljava/lang/String;

    return-object v0
.end method

.method public getMDC(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/spi/LoggingEvent;->d:Ljava/util/Hashtable;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    .line 3
    :cond_0
    invoke-static {p1}, Lorg/apache/log4j/MDC;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public getMDCCopy()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lorg/apache/log4j/spi/LoggingEvent;->f:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lorg/apache/log4j/spi/LoggingEvent;->f:Z

    .line 3
    invoke-static {}, Lorg/apache/log4j/MDC;->getContext()Ljava/util/Hashtable;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v0}, Ljava/util/Hashtable;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Hashtable;

    iput-object v0, p0, Lorg/apache/log4j/spi/LoggingEvent;->d:Ljava/util/Hashtable;

    :cond_0
    return-void
.end method

.method public getMessage()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/spi/LoggingEvent;->g:Ljava/lang/Object;

    if-eqz v0, :cond_0

    return-object v0

    .line 2
    :cond_0
    invoke-virtual {p0}, Lorg/apache/log4j/spi/LoggingEvent;->getRenderedMessage()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getNDC()Ljava/lang/String;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lorg/apache/log4j/spi/LoggingEvent;->e:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lorg/apache/log4j/spi/LoggingEvent;->e:Z

    .line 3
    invoke-static {}, Lorg/apache/log4j/NDC;->get()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/apache/log4j/spi/LoggingEvent;->c:Ljava/lang/String;

    .line 4
    :cond_0
    iget-object v0, p0, Lorg/apache/log4j/spi/LoggingEvent;->c:Ljava/lang/String;

    return-object v0
.end method

.method public getProperties()Ljava/util/Map;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lorg/apache/log4j/spi/LoggingEvent;->getMDCCopy()V

    .line 2
    iget-object v0, p0, Lorg/apache/log4j/spi/LoggingEvent;->d:Ljava/util/Hashtable;

    if-nez v0, :cond_0

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    :cond_0
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final getProperty(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lorg/apache/log4j/spi/LoggingEvent;->getMDC(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public getPropertyKeySet()Ljava/util/Set;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lorg/apache/log4j/spi/LoggingEvent;->getProperties()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public getRenderedMessage()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/spi/LoggingEvent;->h:Ljava/lang/String;

    if-nez v0, :cond_2

    iget-object v0, p0, Lorg/apache/log4j/spi/LoggingEvent;->g:Ljava/lang/Object;

    if-eqz v0, :cond_2

    .line 2
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 3
    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lorg/apache/log4j/spi/LoggingEvent;->h:Ljava/lang/String;

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lorg/apache/log4j/spi/LoggingEvent;->b:Lorg/apache/log4j/Category;

    invoke-virtual {v0}, Lorg/apache/log4j/Category;->getLoggerRepository()Lorg/apache/log4j/spi/LoggerRepository;

    move-result-object v0

    .line 5
    instance-of v1, v0, Lorg/apache/log4j/spi/RendererSupport;

    if-eqz v1, :cond_1

    .line 6
    check-cast v0, Lorg/apache/log4j/spi/RendererSupport;

    .line 7
    invoke-interface {v0}, Lorg/apache/log4j/spi/RendererSupport;->getRendererMap()Lorg/apache/log4j/or/RendererMap;

    move-result-object v0

    iget-object v1, p0, Lorg/apache/log4j/spi/LoggingEvent;->g:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Lorg/apache/log4j/or/RendererMap;->findAndRender(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/apache/log4j/spi/LoggingEvent;->h:Ljava/lang/String;

    goto :goto_0

    .line 8
    :cond_1
    iget-object v0, p0, Lorg/apache/log4j/spi/LoggingEvent;->g:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/apache/log4j/spi/LoggingEvent;->h:Ljava/lang/String;

    .line 9
    :cond_2
    :goto_0
    iget-object v0, p0, Lorg/apache/log4j/spi/LoggingEvent;->h:Ljava/lang/String;

    return-object v0
.end method

.method public getThreadName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/spi/LoggingEvent;->i:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 2
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/apache/log4j/spi/LoggingEvent;->i:Ljava/lang/String;

    .line 3
    :cond_0
    iget-object v0, p0, Lorg/apache/log4j/spi/LoggingEvent;->i:Ljava/lang/String;

    return-object v0
.end method

.method public getThrowableInformation()Lorg/apache/log4j/spi/ThrowableInformation;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/spi/LoggingEvent;->j:Lorg/apache/log4j/spi/ThrowableInformation;

    return-object v0
.end method

.method public getThrowableStrRep()[Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/spi/LoggingEvent;->j:Lorg/apache/log4j/spi/ThrowableInformation;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 2
    :cond_0
    invoke-virtual {v0}, Lorg/apache/log4j/spi/ThrowableInformation;->getThrowableStrRep()[Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getTimeStamp()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lorg/apache/log4j/spi/LoggingEvent;->timeStamp:J

    return-wide v0
.end method

.method public final locationInformationExists()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/spi/LoggingEvent;->k:Lorg/apache/log4j/spi/LocationInfo;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public removeProperty(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/spi/LoggingEvent;->d:Ljava/util/Hashtable;

    if-nez v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lorg/apache/log4j/spi/LoggingEvent;->getMDCCopy()V

    .line 3
    :cond_0
    iget-object v0, p0, Lorg/apache/log4j/spi/LoggingEvent;->d:Ljava/util/Hashtable;

    if-nez v0, :cond_1

    .line 4
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    iput-object v0, p0, Lorg/apache/log4j/spi/LoggingEvent;->d:Ljava/util/Hashtable;

    .line 5
    :cond_1
    iget-object v0, p0, Lorg/apache/log4j/spi/LoggingEvent;->d:Ljava/util/Hashtable;

    invoke-virtual {v0, p1}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final setProperty(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/spi/LoggingEvent;->d:Ljava/util/Hashtable;

    if-nez v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lorg/apache/log4j/spi/LoggingEvent;->getMDCCopy()V

    .line 3
    :cond_0
    iget-object v0, p0, Lorg/apache/log4j/spi/LoggingEvent;->d:Ljava/util/Hashtable;

    if-nez v0, :cond_1

    .line 4
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    iput-object v0, p0, Lorg/apache/log4j/spi/LoggingEvent;->d:Ljava/util/Hashtable;

    .line 5
    :cond_1
    iget-object v0, p0, Lorg/apache/log4j/spi/LoggingEvent;->d:Ljava/util/Hashtable;

    invoke-virtual {v0, p1, p2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
