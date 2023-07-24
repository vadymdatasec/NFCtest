.class public final Le/f/d/q;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Ljava/util/Map<",
            "Le/f/d/e0/a<",
            "*>;",
            "Le/f/d/p<",
            "*>;>;>;"
        }
    .end annotation
.end field

.field public final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Le/f/d/e0/a<",
            "*>;",
            "Le/f/d/a0<",
            "*>;>;"
        }
    .end annotation
.end field

.field public final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Le/f/d/b0;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Le/f/d/d0/n;

.field public final e:Z


# direct methods
.method public constructor <init>()V
    .locals 12

    .line 1
    sget-object v1, Le/f/d/d0/p;->h:Le/f/d/d0/p;

    sget-object v2, Le/f/d/h;->b:Le/f/d/h;

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v3

    sget-object v10, Le/f/d/z;->b:Le/f/d/z;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v11

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v11}, Le/f/d/q;-><init>(Le/f/d/d0/p;Le/f/d/i;Ljava/util/Map;ZZZZZZLe/f/d/z;Ljava/util/List;)V

    return-void
.end method

.method public constructor <init>(Le/f/d/d0/p;Le/f/d/i;Ljava/util/Map;ZZZZZZLe/f/d/z;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/d/d0/p;",
            "Le/f/d/i;",
            "Ljava/util/Map<",
            "Ljava/lang/reflect/Type;",
            "Le/f/d/r<",
            "*>;>;ZZZZZZ",
            "Le/f/d/z;",
            "Ljava/util/List<",
            "Le/f/d/b0;",
            ">;)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance p6, Le/f/d/j;

    invoke-direct {p6, p0}, Le/f/d/j;-><init>(Le/f/d/q;)V

    iput-object p6, p0, Le/f/d/q;->a:Ljava/lang/ThreadLocal;

    .line 4
    new-instance p6, Ljava/util/HashMap;

    invoke-direct {p6}, Ljava/util/HashMap;-><init>()V

    invoke-static {p6}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p6

    iput-object p6, p0, Le/f/d/q;->b:Ljava/util/Map;

    .line 5
    new-instance p6, Le/f/d/k;

    invoke-direct {p6, p0}, Le/f/d/k;-><init>(Le/f/d/q;)V

    .line 6
    new-instance p6, Le/f/d/l;

    invoke-direct {p6, p0}, Le/f/d/l;-><init>(Le/f/d/q;)V

    .line 7
    new-instance p6, Le/f/d/d0/n;

    invoke-direct {p6, p3}, Le/f/d/d0/n;-><init>(Ljava/util/Map;)V

    iput-object p6, p0, Le/f/d/q;->d:Le/f/d/d0/n;

    .line 8
    iput-boolean p4, p0, Le/f/d/q;->e:Z

    .line 9
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    .line 10
    sget-object p4, Le/f/d/d0/g0/d1;->Q:Le/f/d/b0;

    invoke-interface {p3, p4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 11
    sget-object p4, Le/f/d/d0/g0/m;->b:Le/f/d/b0;

    invoke-interface {p3, p4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 12
    invoke-interface {p3, p11}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 13
    sget-object p4, Le/f/d/d0/g0/d1;->x:Le/f/d/b0;

    invoke-interface {p3, p4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 14
    sget-object p4, Le/f/d/d0/g0/d1;->m:Le/f/d/b0;

    invoke-interface {p3, p4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 15
    sget-object p4, Le/f/d/d0/g0/d1;->g:Le/f/d/b0;

    invoke-interface {p3, p4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 16
    sget-object p4, Le/f/d/d0/g0/d1;->i:Le/f/d/b0;

    invoke-interface {p3, p4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 17
    sget-object p4, Le/f/d/d0/g0/d1;->k:Le/f/d/b0;

    invoke-interface {p3, p4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 18
    sget-object p4, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    const-class p6, Ljava/lang/Long;

    invoke-virtual {p0, p10}, Le/f/d/q;->a(Le/f/d/z;)Le/f/d/a0;

    move-result-object p7

    invoke-static {p4, p6, p7}, Le/f/d/d0/g0/d1;->a(Ljava/lang/Class;Ljava/lang/Class;Le/f/d/a0;)Le/f/d/b0;

    move-result-object p4

    invoke-interface {p3, p4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 19
    sget-object p4, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    const-class p6, Ljava/lang/Double;

    invoke-virtual {p0, p9}, Le/f/d/q;->a(Z)Le/f/d/a0;

    move-result-object p7

    invoke-static {p4, p6, p7}, Le/f/d/d0/g0/d1;->a(Ljava/lang/Class;Ljava/lang/Class;Le/f/d/a0;)Le/f/d/b0;

    move-result-object p4

    invoke-interface {p3, p4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 20
    sget-object p4, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    const-class p6, Ljava/lang/Float;

    invoke-virtual {p0, p9}, Le/f/d/q;->b(Z)Le/f/d/a0;

    move-result-object p7

    invoke-static {p4, p6, p7}, Le/f/d/d0/g0/d1;->a(Ljava/lang/Class;Ljava/lang/Class;Le/f/d/a0;)Le/f/d/b0;

    move-result-object p4

    invoke-interface {p3, p4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 21
    sget-object p4, Le/f/d/d0/g0/d1;->r:Le/f/d/b0;

    invoke-interface {p3, p4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 22
    sget-object p4, Le/f/d/d0/g0/d1;->t:Le/f/d/b0;

    invoke-interface {p3, p4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 23
    sget-object p4, Le/f/d/d0/g0/d1;->z:Le/f/d/b0;

    invoke-interface {p3, p4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 24
    sget-object p4, Le/f/d/d0/g0/d1;->B:Le/f/d/b0;

    invoke-interface {p3, p4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 25
    const-class p4, Ljava/math/BigDecimal;

    sget-object p6, Le/f/d/d0/g0/d1;->v:Le/f/d/a0;

    invoke-static {p4, p6}, Le/f/d/d0/g0/d1;->a(Ljava/lang/Class;Le/f/d/a0;)Le/f/d/b0;

    move-result-object p4

    invoke-interface {p3, p4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 26
    const-class p4, Ljava/math/BigInteger;

    sget-object p6, Le/f/d/d0/g0/d1;->w:Le/f/d/a0;

    invoke-static {p4, p6}, Le/f/d/d0/g0/d1;->a(Ljava/lang/Class;Le/f/d/a0;)Le/f/d/b0;

    move-result-object p4

    invoke-interface {p3, p4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 27
    sget-object p4, Le/f/d/d0/g0/d1;->D:Le/f/d/b0;

    invoke-interface {p3, p4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 28
    sget-object p4, Le/f/d/d0/g0/d1;->F:Le/f/d/b0;

    invoke-interface {p3, p4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 29
    sget-object p4, Le/f/d/d0/g0/d1;->J:Le/f/d/b0;

    invoke-interface {p3, p4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 30
    sget-object p4, Le/f/d/d0/g0/d1;->O:Le/f/d/b0;

    invoke-interface {p3, p4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 31
    sget-object p4, Le/f/d/d0/g0/d1;->H:Le/f/d/b0;

    invoke-interface {p3, p4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 32
    sget-object p4, Le/f/d/d0/g0/d1;->d:Le/f/d/b0;

    invoke-interface {p3, p4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 33
    sget-object p4, Le/f/d/d0/g0/f;->d:Le/f/d/b0;

    invoke-interface {p3, p4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 34
    sget-object p4, Le/f/d/d0/g0/d1;->M:Le/f/d/b0;

    invoke-interface {p3, p4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 35
    sget-object p4, Le/f/d/d0/g0/u;->b:Le/f/d/b0;

    invoke-interface {p3, p4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 36
    sget-object p4, Le/f/d/d0/g0/s;->b:Le/f/d/b0;

    invoke-interface {p3, p4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 37
    sget-object p4, Le/f/d/d0/g0/d1;->K:Le/f/d/b0;

    invoke-interface {p3, p4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 38
    sget-object p4, Le/f/d/d0/g0/b;->c:Le/f/d/b0;

    invoke-interface {p3, p4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 39
    sget-object p4, Le/f/d/d0/g0/d1;->R:Le/f/d/b0;

    invoke-interface {p3, p4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 40
    sget-object p4, Le/f/d/d0/g0/d1;->b:Le/f/d/b0;

    invoke-interface {p3, p4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 41
    invoke-interface {p3, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 42
    new-instance p4, Le/f/d/d0/g0/d;

    iget-object p6, p0, Le/f/d/q;->d:Le/f/d/d0/n;

    invoke-direct {p4, p6}, Le/f/d/d0/g0/d;-><init>(Le/f/d/d0/n;)V

    invoke-interface {p3, p4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 43
    new-instance p4, Le/f/d/d0/g0/j;

    iget-object p6, p0, Le/f/d/q;->d:Le/f/d/d0/n;

    invoke-direct {p4, p6, p5}, Le/f/d/d0/g0/j;-><init>(Le/f/d/d0/n;Z)V

    invoke-interface {p3, p4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 44
    new-instance p4, Le/f/d/d0/g0/q;

    iget-object p5, p0, Le/f/d/q;->d:Le/f/d/d0/n;

    invoke-direct {p4, p5, p2, p1}, Le/f/d/d0/g0/q;-><init>(Le/f/d/d0/n;Le/f/d/i;Le/f/d/d0/p;)V

    invoke-interface {p3, p4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 45
    invoke-static {p3}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Le/f/d/q;->c:Ljava/util/List;

    return-void
.end method

.method public static synthetic a(Le/f/d/q;D)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Le/f/d/q;->a(D)V

    return-void
.end method

.method public static a(Ljava/lang/Object;Le/f/d/f0/c;)V
    .locals 0

    if-eqz p0, :cond_1

    .line 32
    :try_start_0
    invoke-virtual {p1}, Le/f/d/f0/c;->F()Le/f/d/f0/e;

    move-result-object p0

    sget-object p1, Le/f/d/f0/e;->k:Le/f/d/f0/e;

    if-ne p0, p1, :cond_0

    goto :goto_0

    .line 33
    :cond_0
    new-instance p0, Lcom/google/gson/JsonIOException;

    const-string p1, "JSON document was not fully consumed."

    invoke-direct {p0, p1}, Lcom/google/gson/JsonIOException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catch Lcom/google/gson/stream/MalformedJsonException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p0

    .line 34
    new-instance p1, Lcom/google/gson/JsonIOException;

    invoke-direct {p1, p0}, Lcom/google/gson/JsonIOException;-><init>(Ljava/lang/Throwable;)V

    throw p1

    :catch_1
    move-exception p0

    .line 35
    new-instance p1, Lcom/google/gson/JsonSyntaxException;

    invoke-direct {p1, p0}, Lcom/google/gson/JsonSyntaxException;-><init>(Ljava/lang/Throwable;)V

    throw p1

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public a(Le/f/d/b0;Le/f/d/e0/a;)Le/f/d/a0;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Le/f/d/b0;",
            "Le/f/d/e0/a<",
            "TT;>;)",
            "Le/f/d/a0<",
            "TT;>;"
        }
    .end annotation

    .line 21
    iget-object v0, p0, Le/f/d/q;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le/f/d/b0;

    if-nez v1, :cond_1

    if-ne v2, p1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    .line 22
    :cond_1
    invoke-interface {v2, p0, p2}, Le/f/d/b0;->a(Le/f/d/q;Le/f/d/e0/a;)Le/f/d/a0;

    move-result-object v2

    if-eqz v2, :cond_0

    return-object v2

    .line 23
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "GSON cannot serialize "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public a(Le/f/d/e0/a;)Le/f/d/a0;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Le/f/d/e0/a<",
            "TT;>;)",
            "Le/f/d/a0<",
            "TT;>;"
        }
    .end annotation

    .line 9
    iget-object v0, p0, Le/f/d/q;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/f/d/a0;

    if-eqz v0, :cond_0

    return-object v0

    .line 10
    :cond_0
    iget-object v0, p0, Le/f/d/q;->a:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    .line 11
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le/f/d/p;

    if-eqz v1, :cond_1

    return-object v1

    .line 12
    :cond_1
    new-instance v1, Le/f/d/p;

    invoke-direct {v1}, Le/f/d/p;-><init>()V

    .line 13
    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    :try_start_0
    iget-object v2, p0, Le/f/d/q;->c:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Le/f/d/b0;

    .line 15
    invoke-interface {v3, p0, p1}, Le/f/d/b0;->a(Le/f/d/q;Le/f/d/e0/a;)Le/f/d/a0;

    move-result-object v3

    if-eqz v3, :cond_2

    .line 16
    invoke-virtual {v1, v3}, Le/f/d/p;->a(Le/f/d/a0;)V

    .line 17
    iget-object v1, p0, Le/f/d/q;->b:Ljava/util/Map;

    invoke-interface {v1, p1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v3

    .line 19
    :cond_3
    :try_start_1
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "GSON cannot handle "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v1

    .line 20
    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    throw v1
.end method

.method public final a(Le/f/d/z;)Le/f/d/a0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/d/z;",
            ")",
            "Le/f/d/a0<",
            "Ljava/lang/Number;",
            ">;"
        }
    .end annotation

    .line 6
    sget-object v0, Le/f/d/z;->b:Le/f/d/z;

    if-ne p1, v0, :cond_0

    .line 7
    sget-object p1, Le/f/d/d0/g0/d1;->n:Le/f/d/a0;

    return-object p1

    .line 8
    :cond_0
    new-instance p1, Le/f/d/o;

    invoke-direct {p1, p0}, Le/f/d/o;-><init>(Le/f/d/q;)V

    return-object p1
.end method

.method public a(Ljava/lang/Class;)Le/f/d/a0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Le/f/d/a0<",
            "TT;>;"
        }
    .end annotation

    .line 24
    invoke-static {p1}, Le/f/d/e0/a;->a(Ljava/lang/Class;)Le/f/d/e0/a;

    move-result-object p1

    invoke-virtual {p0, p1}, Le/f/d/q;->a(Le/f/d/e0/a;)Le/f/d/a0;

    move-result-object p1

    return-object p1
.end method

.method public final a(Z)Le/f/d/a0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Le/f/d/a0<",
            "Ljava/lang/Number;",
            ">;"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 2
    sget-object p1, Le/f/d/d0/g0/d1;->p:Le/f/d/a0;

    return-object p1

    .line 3
    :cond_0
    new-instance p1, Le/f/d/m;

    invoke-direct {p1, p0}, Le/f/d/m;-><init>(Le/f/d/q;)V

    return-object p1
.end method

.method public a(Le/f/d/f0/c;Ljava/lang/reflect/Type;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Le/f/d/f0/c;",
            "Ljava/lang/reflect/Type;",
            ")TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/gson/JsonIOException;,
            Lcom/google/gson/JsonSyntaxException;
        }
    .end annotation

    .line 36
    invoke-virtual {p1}, Le/f/d/f0/c;->v()Z

    move-result v0

    const/4 v1, 0x1

    .line 37
    invoke-virtual {p1, v1}, Le/f/d/f0/c;->e(Z)V

    .line 38
    :try_start_0
    invoke-virtual {p1}, Le/f/d/f0/c;->F()Le/f/d/f0/e;

    const/4 v1, 0x0

    .line 39
    invoke-static {p2}, Le/f/d/e0/a;->a(Ljava/lang/reflect/Type;)Le/f/d/e0/a;

    move-result-object p2

    invoke-virtual {p0, p2}, Le/f/d/q;->a(Le/f/d/e0/a;)Le/f/d/a0;

    move-result-object p2

    .line 40
    invoke-virtual {p2, p1}, Le/f/d/a0;->a(Le/f/d/f0/c;)Ljava/lang/Object;

    move-result-object p2
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    invoke-virtual {p1, v0}, Le/f/d/f0/c;->e(Z)V

    return-object p2

    :catchall_0
    move-exception p2

    goto :goto_0

    :catch_0
    move-exception p2

    .line 42
    :try_start_1
    new-instance v1, Lcom/google/gson/JsonSyntaxException;

    invoke-direct {v1, p2}, Lcom/google/gson/JsonSyntaxException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :catch_1
    move-exception p2

    .line 43
    new-instance v1, Lcom/google/gson/JsonSyntaxException;

    invoke-direct {v1, p2}, Lcom/google/gson/JsonSyntaxException;-><init>(Ljava/lang/Throwable;)V

    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catch_2
    move-exception p2

    if-eqz v1, :cond_0

    const/4 p2, 0x0

    .line 44
    invoke-virtual {p1, v0}, Le/f/d/f0/c;->e(Z)V

    return-object p2

    .line 45
    :cond_0
    :try_start_2
    new-instance v1, Lcom/google/gson/JsonSyntaxException;

    invoke-direct {v1, p2}, Lcom/google/gson/JsonSyntaxException;-><init>(Ljava/lang/Throwable;)V

    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 46
    :goto_0
    invoke-virtual {p1, v0}, Le/f/d/f0/c;->e(Z)V

    throw p2
.end method

.method public a(Ljava/io/Reader;Ljava/lang/reflect/Type;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/io/Reader;",
            "Ljava/lang/reflect/Type;",
            ")TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/gson/JsonIOException;,
            Lcom/google/gson/JsonSyntaxException;
        }
    .end annotation

    .line 29
    new-instance v0, Le/f/d/f0/c;

    invoke-direct {v0, p1}, Le/f/d/f0/c;-><init>(Ljava/io/Reader;)V

    .line 30
    invoke-virtual {p0, v0, p2}, Le/f/d/q;->a(Le/f/d/f0/c;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object p1

    .line 31
    invoke-static {p1, v0}, Le/f/d/q;->a(Ljava/lang/Object;Le/f/d/f0/c;)V

    return-object p1
.end method

.method public a(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/gson/JsonSyntaxException;
        }
    .end annotation

    .line 25
    invoke-virtual {p0, p1, p2}, Le/f/d/q;->a(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object p1

    .line 26
    invoke-static {p2}, Le/f/d/d0/t;->a(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p2, p1}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public a(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Type;",
            ")TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/gson/JsonSyntaxException;
        }
    .end annotation

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 27
    :cond_0
    new-instance v0, Ljava/io/StringReader;

    invoke-direct {v0, p1}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    .line 28
    invoke-virtual {p0, v0, p2}, Le/f/d/q;->a(Ljava/io/Reader;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final a(D)V
    .locals 2

    .line 4
    invoke-static {p1, p2}, Ljava/lang/Double;->isNaN(D)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p1, p2}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 5
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string p1, " is not a valid double value as per JSON specification. To override this"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " behavior, use GsonBuilder.serializeSpecialDoubleValues() method."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final b(Z)Le/f/d/a0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Le/f/d/a0<",
            "Ljava/lang/Number;",
            ">;"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 1
    sget-object p1, Le/f/d/d0/g0/d1;->o:Le/f/d/a0;

    return-object p1

    .line 2
    :cond_0
    new-instance p1, Le/f/d/n;

    invoke-direct {p1, p0}, Le/f/d/n;-><init>(Le/f/d/q;)V

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "{"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v1, "serializeNulls:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Le/f/d/q;->e:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, "factories:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/f/d/q;->c:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",instanceCreators:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/f/d/q;->d:Le/f/d/d0/n;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
