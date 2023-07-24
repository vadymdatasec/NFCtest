.class public Lorg/apache/log4j/NDC;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/apache/log4j/NDC$a;
    }
.end annotation


# static fields
.field public static a:Ljava/util/Hashtable;

.field public static b:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    sput-object v0, Lorg/apache/log4j/NDC;->a:Ljava/util/Hashtable;

    const/4 v0, 0x0

    .line 2
    sput v0, Lorg/apache/log4j/NDC;->b:I

    return-void
.end method

.method public static a()Ljava/util/Stack;
    .locals 2

    .line 1
    sget-object v0, Lorg/apache/log4j/NDC;->a:Ljava/util/Hashtable;

    if-eqz v0, :cond_0

    .line 2
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Stack;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public static b()V
    .locals 7

    .line 1
    sget-object v0, Lorg/apache/log4j/NDC;->a:Ljava/util/Hashtable;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    monitor-enter v0

    .line 3
    :try_start_0
    sget v1, Lorg/apache/log4j/NDC;->b:I

    add-int/lit8 v1, v1, 0x1

    sput v1, Lorg/apache/log4j/NDC;->b:I

    const/4 v2, 0x5

    if-gt v1, v2, :cond_1

    .line 4
    monitor-exit v0

    return-void

    :cond_1
    const/4 v1, 0x0

    .line 5
    sput v1, Lorg/apache/log4j/NDC;->b:I

    .line 6
    new-instance v2, Ljava/util/Vector;

    invoke-direct {v2}, Ljava/util/Vector;-><init>()V

    .line 7
    sget-object v3, Lorg/apache/log4j/NDC;->a:Ljava/util/Hashtable;

    invoke-virtual {v3}, Ljava/util/Hashtable;->keys()Ljava/util/Enumeration;

    move-result-object v3

    :goto_0
    const/4 v4, 0x0

    .line 8
    :goto_1
    invoke-interface {v3}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v5

    if-eqz v5, :cond_3

    const/4 v5, 0x4

    if-gt v4, v5, :cond_3

    .line 9
    invoke-interface {v3}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Thread;

    .line 10
    invoke-virtual {v5}, Ljava/lang/Thread;->isAlive()Z

    move-result v6

    if-eqz v6, :cond_2

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 11
    :cond_2
    invoke-virtual {v2, v5}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    goto :goto_0

    .line 12
    :cond_3
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    invoke-virtual {v2}, Ljava/util/Vector;->size()I

    move-result v0

    :goto_2
    if-ge v1, v0, :cond_4

    .line 14
    invoke-virtual {v2, v1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Thread;

    .line 15
    new-instance v4, Ljava/lang/StringBuffer;

    invoke-direct {v4}, Ljava/lang/StringBuffer;-><init>()V

    const-string v5, "Lazy NDC removal for thread ["

    invoke-virtual {v4, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v3}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v5, "] ("

    invoke-virtual {v4, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    sget-object v5, Lorg/apache/log4j/NDC;->a:Ljava/util/Hashtable;

    invoke-virtual {v5}, Ljava/util/Hashtable;->size()I

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    const-string v5, ")."

    invoke-virtual {v4, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v4}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lorg/apache/log4j/helpers/LogLog;->debug(Ljava/lang/String;)V

    .line 16
    sget-object v4, Lorg/apache/log4j/NDC;->a:Ljava/util/Hashtable;

    invoke-virtual {v4, v3}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_4
    return-void

    :catchall_0
    move-exception v1

    .line 17
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public static clear()V
    .locals 2

    .line 1
    invoke-static {}, Lorg/apache/log4j/NDC;->a()Ljava/util/Stack;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 2
    invoke-virtual {v0, v1}, Ljava/util/Stack;->setSize(I)V

    :cond_0
    return-void
.end method

.method public static cloneStack()Ljava/util/Stack;
    .locals 1

    .line 1
    invoke-static {}, Lorg/apache/log4j/NDC;->a()Ljava/util/Stack;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 2
    :cond_0
    invoke-virtual {v0}, Ljava/util/Stack;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Stack;

    return-object v0
.end method

.method public static get()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-static {}, Lorg/apache/log4j/NDC;->a()Ljava/util/Stack;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Ljava/util/Stack;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 3
    invoke-virtual {v0}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/apache/log4j/NDC$a;

    iget-object v0, v0, Lorg/apache/log4j/NDC$a;->a:Ljava/lang/String;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public static getDepth()I
    .locals 1

    .line 1
    invoke-static {}, Lorg/apache/log4j/NDC;->a()Ljava/util/Stack;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 2
    :cond_0
    invoke-virtual {v0}, Ljava/util/Stack;->size()I

    move-result v0

    return v0
.end method

.method public static inherit(Ljava/util/Stack;)V
    .locals 2

    if-eqz p0, :cond_0

    .line 1
    sget-object v0, Lorg/apache/log4j/NDC;->a:Ljava/util/Hashtable;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v0, v1, p0}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public static peek()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-static {}, Lorg/apache/log4j/NDC;->a()Ljava/util/Stack;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Ljava/util/Stack;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 3
    invoke-virtual {v0}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/apache/log4j/NDC$a;

    iget-object v0, v0, Lorg/apache/log4j/NDC$a;->b:Ljava/lang/String;

    return-object v0

    :cond_0
    const-string v0, ""

    return-object v0
.end method

.method public static pop()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-static {}, Lorg/apache/log4j/NDC;->a()Ljava/util/Stack;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Ljava/util/Stack;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 3
    invoke-virtual {v0}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/apache/log4j/NDC$a;

    iget-object v0, v0, Lorg/apache/log4j/NDC$a;->b:Ljava/lang/String;

    return-object v0

    :cond_0
    const-string v0, ""

    return-object v0
.end method

.method public static push(Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-static {}, Lorg/apache/log4j/NDC;->a()Ljava/util/Stack;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lorg/apache/log4j/NDC$a;

    invoke-direct {v0, p0, v1}, Lorg/apache/log4j/NDC$a;-><init>(Ljava/lang/String;Lorg/apache/log4j/NDC$a;)V

    .line 3
    new-instance p0, Ljava/util/Stack;

    invoke-direct {p0}, Ljava/util/Stack;-><init>()V

    .line 4
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    .line 5
    sget-object v2, Lorg/apache/log4j/NDC;->a:Ljava/util/Hashtable;

    invoke-virtual {v2, v1, p0}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    invoke-virtual {p0, v0}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 7
    :cond_0
    invoke-virtual {v0}, Ljava/util/Stack;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 8
    new-instance v2, Lorg/apache/log4j/NDC$a;

    invoke-direct {v2, p0, v1}, Lorg/apache/log4j/NDC$a;-><init>(Ljava/lang/String;Lorg/apache/log4j/NDC$a;)V

    .line 9
    invoke-virtual {v0, v2}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 10
    :cond_1
    invoke-virtual {v0}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/apache/log4j/NDC$a;

    .line 11
    new-instance v2, Lorg/apache/log4j/NDC$a;

    invoke-direct {v2, p0, v1}, Lorg/apache/log4j/NDC$a;-><init>(Ljava/lang/String;Lorg/apache/log4j/NDC$a;)V

    invoke-virtual {v0, v2}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    return-void
.end method

.method public static remove()V
    .locals 2

    .line 1
    sget-object v0, Lorg/apache/log4j/NDC;->a:Ljava/util/Hashtable;

    if-eqz v0, :cond_0

    .line 2
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    invoke-static {}, Lorg/apache/log4j/NDC;->b()V

    :cond_0
    return-void
.end method

.method public static setMaxDepth(I)V
    .locals 2

    .line 1
    invoke-static {}, Lorg/apache/log4j/NDC;->a()Ljava/util/Stack;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Ljava/util/Stack;->size()I

    move-result v1

    if-ge p0, v1, :cond_0

    .line 3
    invoke-virtual {v0, p0}, Ljava/util/Stack;->setSize(I)V

    :cond_0
    return-void
.end method
