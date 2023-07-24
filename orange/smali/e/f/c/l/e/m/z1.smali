.class public Le/f/c/l/e/m/z1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Le/f/c/l/e/m/d1;

.field public final b:Le/f/c/l/e/r/g;

.field public final c:Le/f/c/l/e/u/c;

.field public final d:Le/f/c/l/e/n/e;

.field public final e:Le/f/c/l/e/m/b2;


# direct methods
.method public constructor <init>(Le/f/c/l/e/m/d1;Le/f/c/l/e/r/g;Le/f/c/l/e/u/c;Le/f/c/l/e/n/e;Le/f/c/l/e/m/b2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/f/c/l/e/m/z1;->a:Le/f/c/l/e/m/d1;

    .line 3
    iput-object p2, p0, Le/f/c/l/e/m/z1;->b:Le/f/c/l/e/r/g;

    .line 4
    iput-object p3, p0, Le/f/c/l/e/m/z1;->c:Le/f/c/l/e/u/c;

    .line 5
    iput-object p4, p0, Le/f/c/l/e/m/z1;->d:Le/f/c/l/e/n/e;

    .line 6
    iput-object p5, p0, Le/f/c/l/e/m/z1;->e:Le/f/c/l/e/m/b2;

    return-void
.end method

.method public static synthetic a(Le/f/c/l/e/o/d2;Le/f/c/l/e/o/d2;)I
    .locals 0

    .line 66
    invoke-virtual {p0}, Le/f/c/l/e/o/d2;->a()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1}, Le/f/c/l/e/o/d2;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method public static a(Landroid/content/Context;Le/f/c/l/e/m/q1;Le/f/c/l/e/r/h;Le/f/c/l/e/m/b;Le/f/c/l/e/n/e;Le/f/c/l/e/m/b2;Le/f/c/l/e/w/d;Le/f/c/l/e/v/f;)Le/f/c/l/e/m/z1;
    .locals 7

    .line 1
    new-instance v0, Ljava/io/File;

    invoke-interface {p2}, Le/f/c/l/e/r/h;->b()Ljava/lang/String;

    move-result-object p2

    invoke-direct {v0, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 2
    new-instance v2, Le/f/c/l/e/m/d1;

    invoke-direct {v2, p0, p1, p3, p6}, Le/f/c/l/e/m/d1;-><init>(Landroid/content/Context;Le/f/c/l/e/m/q1;Le/f/c/l/e/m/b;Le/f/c/l/e/w/d;)V

    .line 3
    new-instance v3, Le/f/c/l/e/r/g;

    invoke-direct {v3, v0, p7}, Le/f/c/l/e/r/g;-><init>(Ljava/io/File;Le/f/c/l/e/v/f;)V

    .line 4
    invoke-static {p0}, Le/f/c/l/e/u/c;->a(Landroid/content/Context;)Le/f/c/l/e/u/c;

    move-result-object v4

    .line 5
    new-instance p0, Le/f/c/l/e/m/z1;

    move-object v1, p0

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Le/f/c/l/e/m/z1;-><init>(Le/f/c/l/e/m/d1;Le/f/c/l/e/r/g;Le/f/c/l/e/u/c;Le/f/c/l/e/n/e;Le/f/c/l/e/m/b2;)V

    return-object p0
.end method

.method public static a(Ljava/util/Map;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/List<",
            "Le/f/c/l/e/o/d2;",
            ">;"
        }
    .end annotation

    .line 60
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 61
    invoke-interface {p0}, Ljava/util/Map;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->ensureCapacity(I)V

    .line 62
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 63
    invoke-static {}, Le/f/c/l/e/o/d2;->c()Le/f/c/l/e/o/c2;

    move-result-object v2

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v2, v3}, Le/f/c/l/e/o/c2;->a(Ljava/lang/String;)Le/f/c/l/e/o/c2;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v2, v1}, Le/f/c/l/e/o/c2;->b(Ljava/lang/String;)Le/f/c/l/e/o/c2;

    invoke-virtual {v2}, Le/f/c/l/e/o/c2;->a()Le/f/c/l/e/o/d2;

    move-result-object v1

    .line 64
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 65
    :cond_0
    invoke-static {}, Le/f/c/l/e/m/y1;->a()Ljava/util/Comparator;

    move-result-object p0

    invoke-static {v0, p0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    return-object v0
.end method

.method public static synthetic a(Le/f/c/l/e/m/z1;Le/f/a/b/h/g;)Z
    .locals 0

    invoke-virtual {p0, p1}, Le/f/c/l/e/m/z1;->a(Le/f/a/b/h/g;)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public a(Ljava/util/concurrent/Executor;Le/f/c/l/e/m/j1;)Le/f/a/b/h/g;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Le/f/c/l/e/m/j1;",
            ")",
            "Le/f/a/b/h/g<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .line 19
    sget-object v0, Le/f/c/l/e/m/j1;->b:Le/f/c/l/e/m/j1;

    if-ne p2, v0, :cond_0

    .line 20
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object p1

    const-string p2, "Send via DataTransport disabled. Removing DataTransport reports."

    invoke-virtual {p1, p2}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V

    .line 21
    iget-object p1, p0, Le/f/c/l/e/m/z1;->b:Le/f/c/l/e/r/g;

    invoke-virtual {p1}, Le/f/c/l/e/r/g;->b()V

    const/4 p1, 0x0

    .line 22
    invoke-static {p1}, Le/f/a/b/h/n;->a(Ljava/lang/Object;)Le/f/a/b/h/g;

    move-result-object p1

    return-object p1

    .line 23
    :cond_0
    iget-object v0, p0, Le/f/c/l/e/m/z1;->b:Le/f/c/l/e/r/g;

    .line 24
    invoke-virtual {v0}, Le/f/c/l/e/r/g;->d()Ljava/util/List;

    move-result-object v0

    .line 25
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 26
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le/f/c/l/e/m/e1;

    .line 27
    invoke-virtual {v2}, Le/f/c/l/e/m/e1;->a()Le/f/c/l/e/o/o3;

    move-result-object v3

    invoke-virtual {v3}, Le/f/c/l/e/o/o3;->i()Le/f/c/l/e/o/n3;

    move-result-object v3

    sget-object v4, Le/f/c/l/e/o/n3;->d:Le/f/c/l/e/o/n3;

    if-ne v3, v4, :cond_1

    sget-object v3, Le/f/c/l/e/m/j1;->d:Le/f/c/l/e/m/j1;

    if-eq p2, v3, :cond_1

    .line 28
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object v3

    const-string v4, "Send native reports via DataTransport disabled. Removing DataTransport reports."

    .line 29
    invoke-virtual {v3, v4}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V

    .line 30
    iget-object v3, p0, Le/f/c/l/e/m/z1;->b:Le/f/c/l/e/r/g;

    invoke-virtual {v2}, Le/f/c/l/e/m/e1;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Le/f/c/l/e/r/g;->b(Ljava/lang/String;)V

    goto :goto_0

    .line 31
    :cond_1
    iget-object v3, p0, Le/f/c/l/e/m/z1;->c:Le/f/c/l/e/u/c;

    .line 32
    invoke-virtual {v3, v2}, Le/f/c/l/e/u/c;->a(Le/f/c/l/e/m/e1;)Le/f/a/b/h/g;

    move-result-object v2

    invoke-static {p0}, Le/f/c/l/e/m/x1;->a(Le/f/c/l/e/m/z1;)Le/f/a/b/h/a;

    move-result-object v3

    .line 33
    invoke-virtual {v2, p1, v3}, Le/f/a/b/h/g;->a(Ljava/util/concurrent/Executor;Le/f/a/b/h/a;)Le/f/a/b/h/g;

    move-result-object v2

    .line 34
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 35
    :cond_2
    invoke-static {v1}, Le/f/a/b/h/n;->a(Ljava/util/Collection;)Le/f/a/b/h/g;

    move-result-object p1

    return-object p1
.end method

.method public a()V
    .locals 1

    .line 18
    iget-object v0, p0, Le/f/c/l/e/m/z1;->b:Le/f/c/l/e/r/g;

    invoke-virtual {v0}, Le/f/c/l/e/r/g;->b()V

    return-void
.end method

.method public a(JLjava/lang/String;)V
    .locals 1

    .line 17
    iget-object v0, p0, Le/f/c/l/e/m/z1;->b:Le/f/c/l/e/r/g;

    invoke-virtual {v0, p3, p1, p2}, Le/f/c/l/e/r/g;->a(Ljava/lang/String;J)V

    return-void
.end method

.method public a(Ljava/lang/String;J)V
    .locals 1

    .line 6
    iget-object v0, p0, Le/f/c/l/e/m/z1;->a:Le/f/c/l/e/m/d1;

    invoke-virtual {v0, p1, p2, p3}, Le/f/c/l/e/m/d1;->a(Ljava/lang/String;J)Le/f/c/l/e/o/o3;

    move-result-object p1

    .line 7
    iget-object p2, p0, Le/f/c/l/e/m/z1;->b:Le/f/c/l/e/r/g;

    invoke-virtual {p2, p1}, Le/f/c/l/e/r/g;->a(Le/f/c/l/e/o/o3;)V

    return-void
.end method

.method public a(Ljava/lang/String;Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Le/f/c/l/e/m/u1;",
            ">;)V"
        }
    .end annotation

    .line 10
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 11
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le/f/c/l/e/m/u1;

    .line 12
    invoke-interface {v1}, Le/f/c/l/e/m/u1;->b()Le/f/c/l/e/o/g2;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 13
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 14
    :cond_1
    iget-object p2, p0, Le/f/c/l/e/m/z1;->b:Le/f/c/l/e/r/g;

    .line 15
    invoke-static {}, Le/f/c/l/e/o/h2;->c()Le/f/c/l/e/o/e2;

    move-result-object v1

    invoke-static {v0}, Le/f/c/l/e/o/p3;->a(Ljava/util/List;)Le/f/c/l/e/o/p3;

    move-result-object v0

    invoke-virtual {v1, v0}, Le/f/c/l/e/o/e2;->a(Le/f/c/l/e/o/p3;)Le/f/c/l/e/o/e2;

    invoke-virtual {v1}, Le/f/c/l/e/o/e2;->a()Le/f/c/l/e/o/h2;

    move-result-object v0

    .line 16
    invoke-virtual {p2, p1, v0}, Le/f/c/l/e/r/g;->a(Ljava/lang/String;Le/f/c/l/e/o/h2;)V

    return-void
.end method

.method public a(Ljava/lang/Throwable;Ljava/lang/Thread;Ljava/lang/String;J)V
    .locals 10

    .line 8
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Persisting fatal event for session "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V

    const-string v6, "crash"

    const/4 v9, 0x1

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-wide v7, p4

    .line 9
    invoke-virtual/range {v2 .. v9}, Le/f/c/l/e/m/z1;->a(Ljava/lang/Throwable;Ljava/lang/Thread;Ljava/lang/String;Ljava/lang/String;JZ)V

    return-void
.end method

.method public final a(Ljava/lang/Throwable;Ljava/lang/Thread;Ljava/lang/String;Ljava/lang/String;JZ)V
    .locals 11

    move-object v0, p0

    const-string v1, "crash"

    move-object v5, p4

    .line 36
    invoke-virtual {p4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    .line 37
    iget-object v2, v0, Le/f/c/l/e/m/z1;->a:Le/f/c/l/e/m/d1;

    const/4 v8, 0x4

    const/16 v9, 0x8

    move-object v3, p1

    move-object v4, p2

    move-wide/from16 v6, p5

    move/from16 v10, p7

    .line 38
    invoke-virtual/range {v2 .. v10}, Le/f/c/l/e/m/d1;->a(Ljava/lang/Throwable;Ljava/lang/Thread;Ljava/lang/String;JIIZ)Le/f/c/l/e/o/h3;

    move-result-object v2

    .line 39
    invoke-virtual {v2}, Le/f/c/l/e/o/h3;->f()Le/f/c/l/e/o/c3;

    move-result-object v3

    .line 40
    iget-object v4, v0, Le/f/c/l/e/m/z1;->d:Le/f/c/l/e/n/e;

    invoke-virtual {v4}, Le/f/c/l/e/n/e;->c()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_0

    .line 41
    invoke-static {}, Le/f/c/l/e/o/g3;->b()Le/f/c/l/e/o/f3;

    move-result-object v5

    invoke-virtual {v5, v4}, Le/f/c/l/e/o/f3;->a(Ljava/lang/String;)Le/f/c/l/e/o/f3;

    invoke-virtual {v5}, Le/f/c/l/e/o/f3;->a()Le/f/c/l/e/o/g3;

    move-result-object v4

    .line 42
    invoke-virtual {v3, v4}, Le/f/c/l/e/o/c3;->a(Le/f/c/l/e/o/g3;)Le/f/c/l/e/o/c3;

    goto :goto_0

    .line 43
    :cond_0
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object v4

    const-string v5, "No log data to include with this event."

    invoke-virtual {v4, v5}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V

    .line 44
    :goto_0
    iget-object v4, v0, Le/f/c/l/e/m/z1;->e:Le/f/c/l/e/m/b2;

    .line 45
    invoke-virtual {v4}, Le/f/c/l/e/m/b2;->a()Ljava/util/Map;

    move-result-object v4

    invoke-static {v4}, Le/f/c/l/e/m/z1;->a(Ljava/util/Map;)Ljava/util/List;

    move-result-object v4

    .line 46
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_1

    .line 47
    invoke-virtual {v2}, Le/f/c/l/e/o/h3;->a()Le/f/c/l/e/o/b3;

    move-result-object v2

    .line 48
    invoke-virtual {v2}, Le/f/c/l/e/o/b3;->e()Le/f/c/l/e/o/o2;

    move-result-object v2

    .line 49
    invoke-static {v4}, Le/f/c/l/e/o/p3;->a(Ljava/util/List;)Le/f/c/l/e/o/p3;

    move-result-object v4

    invoke-virtual {v2, v4}, Le/f/c/l/e/o/o2;->a(Le/f/c/l/e/o/p3;)Le/f/c/l/e/o/o2;

    .line 50
    invoke-virtual {v2}, Le/f/c/l/e/o/o2;->a()Le/f/c/l/e/o/b3;

    move-result-object v2

    .line 51
    invoke-virtual {v3, v2}, Le/f/c/l/e/o/c3;->a(Le/f/c/l/e/o/b3;)Le/f/c/l/e/o/c3;

    .line 52
    :cond_1
    iget-object v2, v0, Le/f/c/l/e/m/z1;->b:Le/f/c/l/e/r/g;

    invoke-virtual {v3}, Le/f/c/l/e/o/c3;->a()Le/f/c/l/e/o/h3;

    move-result-object v3

    move-object v4, p3

    invoke-virtual {v2, v3, p3, v1}, Le/f/c/l/e/r/g;->a(Le/f/c/l/e/o/h3;Ljava/lang/String;Z)V

    return-void
.end method

.method public final a(Le/f/a/b/h/g;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/a/b/h/g<",
            "Le/f/c/l/e/m/e1;",
            ">;)Z"
        }
    .end annotation

    .line 53
    invoke-virtual {p1}, Le/f/a/b/h/g;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 54
    invoke-virtual {p1}, Le/f/a/b/h/g;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Le/f/c/l/e/m/e1;

    .line 55
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Crashlytics report successfully enqueued to DataTransport: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    invoke-virtual {p1}, Le/f/c/l/e/m/e1;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V

    .line 57
    iget-object v0, p0, Le/f/c/l/e/m/z1;->b:Le/f/c/l/e/r/g;

    invoke-virtual {p1}, Le/f/c/l/e/m/e1;->b()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Le/f/c/l/e/r/g;->b(Ljava/lang/String;)V

    const/4 p1, 0x1

    return p1

    .line 58
    :cond_0
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object v0

    .line 59
    invoke-virtual {p1}, Le/f/a/b/h/g;->a()Ljava/lang/Exception;

    move-result-object p1

    const-string v1, "Crashlytics report could not be enqueued to DataTransport"

    invoke-virtual {v0, v1, p1}, Le/f/c/l/e/b;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    return p1
.end method
