.class public Lm/a/b/h/r;
.super Ljavax/swing/table/AbstractTableModel;
.source "SourceFile"


# static fields
.field public static final k:Lorg/apache/log4j/Logger;

.field public static final l:Ljava/util/Comparator;

.field public static final m:[Lm/a/b/h/j;

.field public static synthetic n:Ljava/lang/Class;


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Ljava/util/SortedSet;

.field public c:[Lm/a/b/h/j;

.field public final d:Ljava/util/List;

.field public e:Z

.field public f:Ljava/lang/String;

.field public g:Ljava/lang/String;

.field public h:Ljava/lang/String;

.field public i:Ljava/lang/String;

.field public j:Lorg/apache/log4j/Priority;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Lm/a/b/h/r;->n:Ljava/lang/Class;

    if-nez v0, :cond_0

    const-string v0, "org.apache.log4j.chainsaw.MyTableModel"

    invoke-static {v0}, Lm/a/b/h/r;->a(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    sput-object v0, Lm/a/b/h/r;->n:Ljava/lang/Class;

    :cond_0
    invoke-static {v0}, Lorg/apache/log4j/Logger;->getLogger(Ljava/lang/Class;)Lorg/apache/log4j/Logger;

    move-result-object v0

    sput-object v0, Lm/a/b/h/r;->k:Lorg/apache/log4j/Logger;

    .line 2
    new-instance v0, Lm/a/b/h/p;

    invoke-direct {v0}, Lm/a/b/h/p;-><init>()V

    sput-object v0, Lm/a/b/h/r;->l:Ljava/util/Comparator;

    const/4 v0, 0x0

    new-array v0, v0, [Lm/a/b/h/j;

    .line 3
    sput-object v0, Lm/a/b/h/r;->m:[Lm/a/b/h/j;

    const/4 v0, 0x3

    const/4 v1, 0x2

    .line 4
    invoke-static {v0, v1}, Ljava/text/DateFormat;->getDateTimeInstance(II)Ljava/text/DateFormat;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljavax/swing/table/AbstractTableModel;-><init>()V

    .line 2
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lm/a/b/h/r;->a:Ljava/lang/Object;

    .line 3
    new-instance v0, Ljava/util/TreeSet;

    sget-object v1, Lm/a/b/h/r;->l:Ljava/util/Comparator;

    invoke-direct {v0, v1}, Ljava/util/TreeSet;-><init>(Ljava/util/Comparator;)V

    iput-object v0, p0, Lm/a/b/h/r;->b:Ljava/util/SortedSet;

    .line 4
    sget-object v0, Lm/a/b/h/r;->m:[Lm/a/b/h/j;

    iput-object v0, p0, Lm/a/b/h/r;->c:[Lm/a/b/h/j;

    .line 5
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lm/a/b/h/r;->d:Ljava/util/List;

    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, Lm/a/b/h/r;->e:Z

    const-string v0, ""

    .line 7
    iput-object v0, p0, Lm/a/b/h/r;->f:Ljava/lang/String;

    .line 8
    iput-object v0, p0, Lm/a/b/h/r;->g:Ljava/lang/String;

    .line 9
    iput-object v0, p0, Lm/a/b/h/r;->h:Ljava/lang/String;

    .line 10
    iput-object v0, p0, Lm/a/b/h/r;->i:Ljava/lang/String;

    .line 11
    sget-object v0, Lorg/apache/log4j/Priority;->DEBUG:Lorg/apache/log4j/Priority;

    iput-object v0, p0, Lm/a/b/h/r;->j:Lorg/apache/log4j/Priority;

    .line 12
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lm/a/b/h/q;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lm/a/b/h/q;-><init>(Lm/a/b/h/r;Lm/a/b/h/p;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    const/4 v1, 0x1

    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/Thread;->setDaemon(Z)V

    .line 14
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void
.end method

.method public static synthetic a(Ljava/lang/String;)Ljava/lang/Class;
    .locals 1

    .line 4
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

.method public static synthetic a(Lm/a/b/h/r;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lm/a/b/h/r;->a:Ljava/lang/Object;

    return-object p0
.end method

.method public static synthetic a(Lm/a/b/h/r;Z)V
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Lm/a/b/h/r;->a(Z)V

    return-void
.end method

.method public static synthetic a(Lm/a/b/h/r;Lm/a/b/h/j;)Z
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lm/a/b/h/r;->b(Lm/a/b/h/j;)Z

    move-result p0

    return p0
.end method

.method public static synthetic b(Lm/a/b/h/r;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lm/a/b/h/r;->e:Z

    return p0
.end method

.method public static synthetic c(Lm/a/b/h/r;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lm/a/b/h/r;->d:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic d(Lm/a/b/h/r;)Ljava/util/SortedSet;
    .locals 0

    .line 1
    iget-object p0, p0, Lm/a/b/h/r;->b:Ljava/util/SortedSet;

    return-object p0
.end method


# virtual methods
.method public a(Lm/a/b/h/j;)V
    .locals 2

    .line 9
    iget-object v0, p0, Lm/a/b/h/r;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 10
    :try_start_0
    iget-object v1, p0, Lm/a/b/h/r;->d:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 11
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public a(Lorg/apache/log4j/Priority;)V
    .locals 1

    .line 5
    iget-object v0, p0, Lm/a/b/h/r;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 6
    :try_start_0
    iput-object p1, p0, Lm/a/b/h/r;->j:Lorg/apache/log4j/Priority;

    const/4 p1, 0x0

    .line 7
    invoke-virtual {p0, p1}, Lm/a/b/h/r;->a(Z)V

    .line 8
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final a(Z)V
    .locals 7

    .line 12
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 13
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 14
    iget-object v3, p0, Lm/a/b/h/r;->b:Ljava/util/SortedSet;

    invoke-interface {v3}, Ljava/util/SortedSet;->size()I

    move-result v3

    .line 15
    iget-object v4, p0, Lm/a/b/h/r;->b:Ljava/util/SortedSet;

    invoke-interface {v4}, Ljava/util/SortedSet;->iterator()Ljava/util/Iterator;

    move-result-object v4

    .line 16
    :cond_0
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    .line 17
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lm/a/b/h/j;

    .line 18
    invoke-virtual {p0, v5}, Lm/a/b/h/r;->b(Lm/a/b/h/j;)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 19
    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 20
    :cond_1
    iget-object v4, p0, Lm/a/b/h/r;->c:[Lm/a/b/h/j;

    array-length v5, v4

    const/4 v6, 0x0

    if-nez v5, :cond_2

    const/4 v4, 0x0

    goto :goto_1

    :cond_2
    aget-object v4, v4, v6

    .line 21
    :goto_1
    sget-object v5, Lm/a/b/h/r;->m:[Lm/a/b/h/j;

    invoke-interface {v2, v5}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v5

    check-cast v5, [Lm/a/b/h/j;

    iput-object v5, p0, Lm/a/b/h/r;->c:[Lm/a/b/h/j;

    if-eqz p1, :cond_4

    if-eqz v4, :cond_4

    .line 22
    invoke-interface {v2, v4}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result p1

    const/4 v2, 0x1

    if-ge p1, v2, :cond_3

    .line 23
    sget-object p1, Lm/a/b/h/r;->k:Lorg/apache/log4j/Logger;

    const-string v2, "In strange state"

    invoke-virtual {p1, v2}, Lorg/apache/log4j/Category;->warn(Ljava/lang/Object;)V

    .line 24
    invoke-virtual {p0}, Lm/a/b/h/r;->fireTableDataChanged()V

    goto :goto_2

    :cond_3
    sub-int/2addr p1, v2

    .line 25
    invoke-virtual {p0, v6, p1}, Lm/a/b/h/r;->fireTableRowsInserted(II)V

    goto :goto_2

    .line 26
    :cond_4
    invoke-virtual {p0}, Lm/a/b/h/r;->fireTableDataChanged()V

    .line 27
    :goto_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 28
    sget-object p1, Lm/a/b/h/r;->k:Lorg/apache/log4j/Logger;

    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    const-string v6, "Total time [ms]: "

    invoke-virtual {v2, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    sub-long/2addr v4, v0

    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    const-string v0, " in update, size: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lorg/apache/log4j/Category;->debug(Ljava/lang/Object;)V

    return-void
.end method

.method public final b(Lm/a/b/h/j;)Z
    .locals 3

    .line 2
    invoke-virtual {p1}, Lm/a/b/h/j;->d()Lorg/apache/log4j/Priority;

    move-result-object v0

    iget-object v1, p0, Lm/a/b/h/r;->j:Lorg/apache/log4j/Priority;

    invoke-virtual {v0, v1}, Lorg/apache/log4j/Priority;->isGreaterOrEqual(Lorg/apache/log4j/Priority;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Lm/a/b/h/j;->e()Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lm/a/b/h/r;->f:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    if-ltz v0, :cond_3

    invoke-virtual {p1}, Lm/a/b/h/j;->a()Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lm/a/b/h/r;->i:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    if-ltz v0, :cond_3

    iget-object v0, p0, Lm/a/b/h/r;->h:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lm/a/b/h/j;->c()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Lm/a/b/h/j;->c()Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lm/a/b/h/r;->h:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    if-ltz v0, :cond_3

    .line 3
    :cond_0
    invoke-virtual {p1}, Lm/a/b/h/j;->b()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x1

    if-nez p1, :cond_2

    .line 4
    iget-object p1, p0, Lm/a/b/h/r;->g:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-nez p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1

    .line 5
    :cond_2
    iget-object v2, p0, Lm/a/b/h/r;->g:Ljava/lang/String;

    invoke-virtual {p1, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result p1

    if-ltz p1, :cond_3

    const/4 v1, 0x1

    :cond_3
    return v1
.end method
