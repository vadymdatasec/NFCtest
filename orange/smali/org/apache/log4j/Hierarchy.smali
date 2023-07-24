.class public Lorg/apache/log4j/Hierarchy;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/apache/log4j/spi/LoggerRepository;
.implements Lorg/apache/log4j/spi/RendererSupport;
.implements Lorg/apache/log4j/spi/ThrowableRendererSupport;


# instance fields
.field public a:Lorg/apache/log4j/spi/LoggerFactory;

.field public b:Ljava/util/Vector;

.field public c:Ljava/util/Hashtable;

.field public d:Lorg/apache/log4j/Logger;

.field public e:Lorg/apache/log4j/or/RendererMap;

.field public f:I

.field public g:Lorg/apache/log4j/Level;

.field public h:Z

.field public i:Lorg/apache/log4j/spi/ThrowableRenderer;


# direct methods
.method public constructor <init>(Lorg/apache/log4j/Logger;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lorg/apache/log4j/Hierarchy;->h:Z

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lorg/apache/log4j/Hierarchy;->i:Lorg/apache/log4j/spi/ThrowableRenderer;

    .line 4
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    iput-object v0, p0, Lorg/apache/log4j/Hierarchy;->c:Ljava/util/Hashtable;

    .line 5
    new-instance v0, Ljava/util/Vector;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/Vector;-><init>(I)V

    iput-object v0, p0, Lorg/apache/log4j/Hierarchy;->b:Ljava/util/Vector;

    .line 6
    iput-object p1, p0, Lorg/apache/log4j/Hierarchy;->d:Lorg/apache/log4j/Logger;

    .line 7
    sget-object p1, Lorg/apache/log4j/Level;->ALL:Lorg/apache/log4j/Level;

    invoke-virtual {p0, p1}, Lorg/apache/log4j/Hierarchy;->setThreshold(Lorg/apache/log4j/Level;)V

    .line 8
    iget-object p1, p0, Lorg/apache/log4j/Hierarchy;->d:Lorg/apache/log4j/Logger;

    invoke-virtual {p1, p0}, Lorg/apache/log4j/Category;->a(Lorg/apache/log4j/spi/LoggerRepository;)V

    .line 9
    new-instance p1, Lorg/apache/log4j/or/RendererMap;

    invoke-direct {p1}, Lorg/apache/log4j/or/RendererMap;-><init>()V

    iput-object p1, p0, Lorg/apache/log4j/Hierarchy;->e:Lorg/apache/log4j/or/RendererMap;

    .line 10
    new-instance p1, Lm/a/b/b;

    invoke-direct {p1}, Lm/a/b/b;-><init>()V

    iput-object p1, p0, Lorg/apache/log4j/Hierarchy;->a:Lorg/apache/log4j/spi/LoggerFactory;

    return-void
.end method


# virtual methods
.method public final a(Lm/a/b/e;Lorg/apache/log4j/Logger;)V
    .locals 5

    .line 21
    invoke-virtual {p1}, Ljava/util/Vector;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 22
    invoke-virtual {p1, v1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/apache/log4j/Logger;

    .line 23
    iget-object v3, v2, Lorg/apache/log4j/Category;->c:Lorg/apache/log4j/Category;

    iget-object v3, v3, Lorg/apache/log4j/Category;->a:Ljava/lang/String;

    iget-object v4, p2, Lorg/apache/log4j/Category;->a:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 24
    iget-object v3, v2, Lorg/apache/log4j/Category;->c:Lorg/apache/log4j/Category;

    iput-object v3, p2, Lorg/apache/log4j/Category;->c:Lorg/apache/log4j/Category;

    .line 25
    iput-object p2, v2, Lorg/apache/log4j/Category;->c:Lorg/apache/log4j/Category;

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public a(Lorg/apache/log4j/Category;Lorg/apache/log4j/Appender;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/Hierarchy;->b:Ljava/util/Vector;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 3
    iget-object v2, p0, Lorg/apache/log4j/Hierarchy;->b:Ljava/util/Vector;

    invoke-virtual {v2, v1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/apache/log4j/spi/HierarchyEventListener;

    .line 4
    invoke-interface {v2, p1, p2}, Lorg/apache/log4j/spi/HierarchyEventListener;->removeAppenderEvent(Lorg/apache/log4j/Category;Lorg/apache/log4j/Appender;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final a(Lorg/apache/log4j/Logger;)V
    .locals 8

    .line 5
    iget-object v0, p1, Lorg/apache/log4j/Category;->a:Ljava/lang/String;

    .line 6
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    const/16 v3, 0x2e

    .line 7
    invoke-virtual {v0, v3, v1}, Ljava/lang/String;->lastIndexOf(II)I

    move-result v1

    :goto_0
    const/4 v4, 0x0

    if-ltz v1, :cond_3

    .line 8
    invoke-virtual {v0, v4, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    .line 9
    new-instance v5, Lm/a/b/a;

    invoke-direct {v5, v4}, Lm/a/b/a;-><init>(Ljava/lang/String;)V

    .line 10
    iget-object v4, p0, Lorg/apache/log4j/Hierarchy;->c:Ljava/util/Hashtable;

    invoke-virtual {v4, v5}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_0

    .line 11
    new-instance v4, Lm/a/b/e;

    invoke-direct {v4, p1}, Lm/a/b/e;-><init>(Lorg/apache/log4j/Logger;)V

    .line 12
    iget-object v6, p0, Lorg/apache/log4j/Hierarchy;->c:Ljava/util/Hashtable;

    invoke-virtual {v6, v5, v4}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 13
    :cond_0
    instance-of v5, v4, Lorg/apache/log4j/Category;

    if-eqz v5, :cond_1

    .line 14
    check-cast v4, Lorg/apache/log4j/Category;

    iput-object v4, p1, Lorg/apache/log4j/Category;->c:Lorg/apache/log4j/Category;

    goto :goto_2

    .line 15
    :cond_1
    instance-of v5, v4, Lm/a/b/e;

    if-eqz v5, :cond_2

    .line 16
    check-cast v4, Lm/a/b/e;

    invoke-virtual {v4, p1}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    goto :goto_1

    .line 17
    :cond_2
    new-instance v5, Ljava/lang/IllegalStateException;

    new-instance v6, Ljava/lang/StringBuffer;

    invoke-direct {v6}, Ljava/lang/StringBuffer;-><init>()V

    const-string v7, "unexpected object type "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v6, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    const-string v4, " in ht."

    invoke-virtual {v6, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v6}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v5, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 18
    invoke-virtual {v5}, Ljava/lang/Exception;->printStackTrace()V

    :goto_1
    add-int/lit8 v1, v1, -0x1

    .line 19
    invoke-virtual {v0, v3, v1}, Ljava/lang/String;->lastIndexOf(II)I

    move-result v1

    goto :goto_0

    :cond_3
    const/4 v2, 0x0

    :goto_2
    if-nez v2, :cond_4

    .line 20
    iget-object v0, p0, Lorg/apache/log4j/Hierarchy;->d:Lorg/apache/log4j/Logger;

    iput-object v0, p1, Lorg/apache/log4j/Category;->c:Lorg/apache/log4j/Category;

    :cond_4
    return-void
.end method

.method public addHierarchyEventListener(Lorg/apache/log4j/spi/HierarchyEventListener;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/Hierarchy;->b:Ljava/util/Vector;

    invoke-virtual {v0, p1}, Ljava/util/Vector;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, "Ignoring attempt to add an existent listener."

    .line 2
    invoke-static {p1}, Lorg/apache/log4j/helpers/LogLog;->warn(Ljava/lang/String;)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lorg/apache/log4j/Hierarchy;->b:Ljava/util/Vector;

    invoke-virtual {v0, p1}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public addRenderer(Ljava/lang/Class;Lorg/apache/log4j/or/ObjectRenderer;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/Hierarchy;->e:Lorg/apache/log4j/or/RendererMap;

    invoke-virtual {v0, p1, p2}, Lorg/apache/log4j/or/RendererMap;->put(Ljava/lang/Class;Lorg/apache/log4j/or/ObjectRenderer;)V

    return-void
.end method

.method public clear()V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/Hierarchy;->c:Ljava/util/Hashtable;

    invoke-virtual {v0}, Ljava/util/Hashtable;->clear()V

    return-void
.end method

.method public emitNoAppenderWarning(Lorg/apache/log4j/Category;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lorg/apache/log4j/Hierarchy;->h:Z

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    const-string v1, "No appenders could be found for logger ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p1}, Lorg/apache/log4j/Category;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string p1, ")."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lorg/apache/log4j/helpers/LogLog;->warn(Ljava/lang/String;)V

    const-string p1, "Please initialize the log4j system properly."

    .line 3
    invoke-static {p1}, Lorg/apache/log4j/helpers/LogLog;->warn(Ljava/lang/String;)V

    const-string p1, "See http://logging.apache.org/log4j/1.2/faq.html#noconfig for more info."

    .line 4
    invoke-static {p1}, Lorg/apache/log4j/helpers/LogLog;->warn(Ljava/lang/String;)V

    const/4 p1, 0x1

    .line 5
    iput-boolean p1, p0, Lorg/apache/log4j/Hierarchy;->h:Z

    :cond_0
    return-void
.end method

.method public exists(Ljava/lang/String;)Lorg/apache/log4j/Logger;
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/Hierarchy;->c:Ljava/util/Hashtable;

    new-instance v1, Lm/a/b/a;

    invoke-direct {v1, p1}, Lm/a/b/a;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 2
    instance-of v0, p1, Lorg/apache/log4j/Logger;

    if-eqz v0, :cond_0

    .line 3
    check-cast p1, Lorg/apache/log4j/Logger;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public fireAddAppenderEvent(Lorg/apache/log4j/Category;Lorg/apache/log4j/Appender;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/Hierarchy;->b:Ljava/util/Vector;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 3
    iget-object v2, p0, Lorg/apache/log4j/Hierarchy;->b:Ljava/util/Vector;

    invoke-virtual {v2, v1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/apache/log4j/spi/HierarchyEventListener;

    .line 4
    invoke-interface {v2, p1, p2}, Lorg/apache/log4j/spi/HierarchyEventListener;->addAppenderEvent(Lorg/apache/log4j/Category;Lorg/apache/log4j/Appender;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public getCurrentCategories()Ljava/util/Enumeration;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lorg/apache/log4j/Hierarchy;->getCurrentLoggers()Ljava/util/Enumeration;

    move-result-object v0

    return-object v0
.end method

.method public getCurrentLoggers()Ljava/util/Enumeration;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/Vector;

    iget-object v1, p0, Lorg/apache/log4j/Hierarchy;->c:Ljava/util/Hashtable;

    invoke-virtual {v1}, Ljava/util/Hashtable;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/Vector;-><init>(I)V

    .line 2
    iget-object v1, p0, Lorg/apache/log4j/Hierarchy;->c:Ljava/util/Hashtable;

    invoke-virtual {v1}, Ljava/util/Hashtable;->elements()Ljava/util/Enumeration;

    move-result-object v1

    .line 3
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 4
    invoke-interface {v1}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v2

    .line 5
    instance-of v3, v2, Lorg/apache/log4j/Logger;

    if-eqz v3, :cond_0

    .line 6
    invoke-virtual {v0, v2}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    goto :goto_0

    .line 7
    :cond_1
    invoke-virtual {v0}, Ljava/util/Vector;->elements()Ljava/util/Enumeration;

    move-result-object v0

    return-object v0
.end method

.method public getLogger(Ljava/lang/String;)Lorg/apache/log4j/Logger;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/Hierarchy;->a:Lorg/apache/log4j/spi/LoggerFactory;

    invoke-virtual {p0, p1, v0}, Lorg/apache/log4j/Hierarchy;->getLogger(Ljava/lang/String;Lorg/apache/log4j/spi/LoggerFactory;)Lorg/apache/log4j/Logger;

    move-result-object p1

    return-object p1
.end method

.method public getLogger(Ljava/lang/String;Lorg/apache/log4j/spi/LoggerFactory;)Lorg/apache/log4j/Logger;
    .locals 4

    .line 2
    new-instance v0, Lm/a/b/a;

    invoke-direct {v0, p1}, Lm/a/b/a;-><init>(Ljava/lang/String;)V

    .line 3
    iget-object v1, p0, Lorg/apache/log4j/Hierarchy;->c:Ljava/util/Hashtable;

    monitor-enter v1

    .line 4
    :try_start_0
    iget-object v2, p0, Lorg/apache/log4j/Hierarchy;->c:Ljava/util/Hashtable;

    invoke-virtual {v2, v0}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_0

    .line 5
    invoke-interface {p2, p1}, Lorg/apache/log4j/spi/LoggerFactory;->makeNewLoggerInstance(Ljava/lang/String;)Lorg/apache/log4j/Logger;

    move-result-object p1

    .line 6
    invoke-virtual {p1, p0}, Lorg/apache/log4j/Category;->a(Lorg/apache/log4j/spi/LoggerRepository;)V

    .line 7
    iget-object p2, p0, Lorg/apache/log4j/Hierarchy;->c:Ljava/util/Hashtable;

    invoke-virtual {p2, v0, p1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    invoke-virtual {p0, p1}, Lorg/apache/log4j/Hierarchy;->a(Lorg/apache/log4j/Logger;)V

    .line 9
    monitor-exit v1

    return-object p1

    .line 10
    :cond_0
    instance-of v3, v2, Lorg/apache/log4j/Logger;

    if-eqz v3, :cond_1

    .line 11
    check-cast v2, Lorg/apache/log4j/Logger;

    monitor-exit v1

    return-object v2

    .line 12
    :cond_1
    instance-of v3, v2, Lm/a/b/e;

    if-eqz v3, :cond_2

    .line 13
    invoke-interface {p2, p1}, Lorg/apache/log4j/spi/LoggerFactory;->makeNewLoggerInstance(Ljava/lang/String;)Lorg/apache/log4j/Logger;

    move-result-object p1

    .line 14
    invoke-virtual {p1, p0}, Lorg/apache/log4j/Category;->a(Lorg/apache/log4j/spi/LoggerRepository;)V

    .line 15
    iget-object p2, p0, Lorg/apache/log4j/Hierarchy;->c:Ljava/util/Hashtable;

    invoke-virtual {p2, v0, p1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    check-cast v2, Lm/a/b/e;

    invoke-virtual {p0, v2, p1}, Lorg/apache/log4j/Hierarchy;->a(Lm/a/b/e;Lorg/apache/log4j/Logger;)V

    .line 17
    invoke-virtual {p0, p1}, Lorg/apache/log4j/Hierarchy;->a(Lorg/apache/log4j/Logger;)V

    .line 18
    monitor-exit v1

    return-object p1

    :cond_2
    const/4 p1, 0x0

    .line 19
    monitor-exit v1

    return-object p1

    :catchall_0
    move-exception p1

    .line 20
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public getRendererMap()Lorg/apache/log4j/or/RendererMap;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/Hierarchy;->e:Lorg/apache/log4j/or/RendererMap;

    return-object v0
.end method

.method public getRootLogger()Lorg/apache/log4j/Logger;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/Hierarchy;->d:Lorg/apache/log4j/Logger;

    return-object v0
.end method

.method public getThreshold()Lorg/apache/log4j/Level;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/Hierarchy;->g:Lorg/apache/log4j/Level;

    return-object v0
.end method

.method public getThrowableRenderer()Lorg/apache/log4j/spi/ThrowableRenderer;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/Hierarchy;->i:Lorg/apache/log4j/spi/ThrowableRenderer;

    return-object v0
.end method

.method public isDisabled(I)Z
    .locals 1

    .line 1
    iget v0, p0, Lorg/apache/log4j/Hierarchy;->f:I

    if-le v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public overrideAsNeeded(Ljava/lang/String;)V
    .locals 0

    const-string p1, "The Hiearchy.overrideAsNeeded method has been deprecated."

    .line 1
    invoke-static {p1}, Lorg/apache/log4j/helpers/LogLog;->warn(Ljava/lang/String;)V

    return-void
.end method

.method public resetConfiguration()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lorg/apache/log4j/Hierarchy;->getRootLogger()Lorg/apache/log4j/Logger;

    move-result-object v0

    sget-object v1, Lorg/apache/log4j/Level;->DEBUG:Lorg/apache/log4j/Level;

    invoke-virtual {v0, v1}, Lorg/apache/log4j/Category;->setLevel(Lorg/apache/log4j/Level;)V

    .line 2
    iget-object v0, p0, Lorg/apache/log4j/Hierarchy;->d:Lorg/apache/log4j/Logger;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lorg/apache/log4j/Category;->setResourceBundle(Ljava/util/ResourceBundle;)V

    .line 3
    sget-object v0, Lorg/apache/log4j/Level;->ALL:Lorg/apache/log4j/Level;

    invoke-virtual {p0, v0}, Lorg/apache/log4j/Hierarchy;->setThreshold(Lorg/apache/log4j/Level;)V

    .line 4
    iget-object v0, p0, Lorg/apache/log4j/Hierarchy;->c:Ljava/util/Hashtable;

    monitor-enter v0

    .line 5
    :try_start_0
    invoke-virtual {p0}, Lorg/apache/log4j/Hierarchy;->shutdown()V

    .line 6
    invoke-virtual {p0}, Lorg/apache/log4j/Hierarchy;->getCurrentLoggers()Ljava/util/Enumeration;

    move-result-object v2

    .line 7
    :goto_0
    invoke-interface {v2}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 8
    invoke-interface {v2}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lorg/apache/log4j/Logger;

    .line 9
    invoke-virtual {v3, v1}, Lorg/apache/log4j/Category;->setLevel(Lorg/apache/log4j/Level;)V

    const/4 v4, 0x1

    .line 10
    invoke-virtual {v3, v4}, Lorg/apache/log4j/Category;->setAdditivity(Z)V

    .line 11
    invoke-virtual {v3, v1}, Lorg/apache/log4j/Category;->setResourceBundle(Ljava/util/ResourceBundle;)V

    goto :goto_0

    .line 12
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    iget-object v0, p0, Lorg/apache/log4j/Hierarchy;->e:Lorg/apache/log4j/or/RendererMap;

    invoke-virtual {v0}, Lorg/apache/log4j/or/RendererMap;->clear()V

    .line 14
    iput-object v1, p0, Lorg/apache/log4j/Hierarchy;->i:Lorg/apache/log4j/spi/ThrowableRenderer;

    return-void

    :catchall_0
    move-exception v1

    .line 15
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public setDisableOverride(Ljava/lang/String;)V
    .locals 0

    const-string p1, "The Hiearchy.setDisableOverride method has been deprecated."

    .line 1
    invoke-static {p1}, Lorg/apache/log4j/helpers/LogLog;->warn(Ljava/lang/String;)V

    return-void
.end method

.method public setRenderer(Ljava/lang/Class;Lorg/apache/log4j/or/ObjectRenderer;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/log4j/Hierarchy;->e:Lorg/apache/log4j/or/RendererMap;

    invoke-virtual {v0, p1, p2}, Lorg/apache/log4j/or/RendererMap;->put(Ljava/lang/Class;Lorg/apache/log4j/or/ObjectRenderer;)V

    return-void
.end method

.method public setThreshold(Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x0

    .line 1
    invoke-static {p1, v0}, Lorg/apache/log4j/Level;->toLevel(Ljava/lang/String;Lorg/apache/log4j/Level;)Lorg/apache/log4j/Level;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0, v0}, Lorg/apache/log4j/Hierarchy;->setThreshold(Lorg/apache/log4j/Level;)V

    goto :goto_0

    .line 3
    :cond_0
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    const-string v1, "Could not convert ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string p1, "] to Level."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lorg/apache/log4j/helpers/LogLog;->warn(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public setThreshold(Lorg/apache/log4j/Level;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 4
    iget v0, p1, Lorg/apache/log4j/Priority;->b:I

    iput v0, p0, Lorg/apache/log4j/Hierarchy;->f:I

    .line 5
    iput-object p1, p0, Lorg/apache/log4j/Hierarchy;->g:Lorg/apache/log4j/Level;

    :cond_0
    return-void
.end method

.method public setThrowableRenderer(Lorg/apache/log4j/spi/ThrowableRenderer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/apache/log4j/Hierarchy;->i:Lorg/apache/log4j/spi/ThrowableRenderer;

    return-void
.end method

.method public shutdown()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lorg/apache/log4j/Hierarchy;->getRootLogger()Lorg/apache/log4j/Logger;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Lorg/apache/log4j/Category;->a()V

    .line 3
    iget-object v1, p0, Lorg/apache/log4j/Hierarchy;->c:Ljava/util/Hashtable;

    monitor-enter v1

    .line 4
    :try_start_0
    invoke-virtual {p0}, Lorg/apache/log4j/Hierarchy;->getCurrentLoggers()Ljava/util/Enumeration;

    move-result-object v2

    .line 5
    :goto_0
    invoke-interface {v2}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 6
    invoke-interface {v2}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lorg/apache/log4j/Logger;

    .line 7
    invoke-virtual {v3}, Lorg/apache/log4j/Category;->a()V

    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {v0}, Lorg/apache/log4j/Category;->removeAllAppenders()V

    .line 9
    invoke-virtual {p0}, Lorg/apache/log4j/Hierarchy;->getCurrentLoggers()Ljava/util/Enumeration;

    move-result-object v0

    .line 10
    :goto_1
    invoke-interface {v0}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 11
    invoke-interface {v0}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/apache/log4j/Logger;

    .line 12
    invoke-virtual {v2}, Lorg/apache/log4j/Category;->removeAllAppenders()V

    goto :goto_1

    .line 13
    :cond_1
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
