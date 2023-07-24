.class public final Le/f/a/d/a/b/l1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final f:Le/f/a/d/a/e/a;


# instance fields
.field public final a:Le/f/a/d/a/b/b0;

.field public final b:Le/f/a/d/a/e/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/a/d/a/e/x<",
            "Le/f/a/d/a/b/j3;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Le/f/a/d/a/b/x0;

.field public final d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Le/f/a/d/a/b/i1;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Ljava/util/concurrent/locks/ReentrantLock;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Le/f/a/d/a/e/a;

    const-string v1, "ExtractorSessionStoreView"

    invoke-direct {v0, v1}, Le/f/a/d/a/e/a;-><init>(Ljava/lang/String;)V

    sput-object v0, Le/f/a/d/a/b/l1;->f:Le/f/a/d/a/e/a;

    return-void
.end method

.method public constructor <init>(Le/f/a/d/a/b/b0;Le/f/a/d/a/e/x;Le/f/a/d/a/b/x0;Le/f/a/d/a/e/x;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/a/d/a/b/b0;",
            "Le/f/a/d/a/e/x<",
            "Le/f/a/d/a/b/j3;",
            ">;",
            "Le/f/a/d/a/b/x0;",
            "Le/f/a/d/a/e/x<",
            "Ljava/util/concurrent/Executor;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/f/a/d/a/b/l1;->a:Le/f/a/d/a/b/b0;

    iput-object p2, p0, Le/f/a/d/a/b/l1;->b:Le/f/a/d/a/e/x;

    iput-object p3, p0, Le/f/a/d/a/b/l1;->c:Le/f/a/d/a/b/x0;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Le/f/a/d/a/b/l1;->d:Ljava/util/Map;

    new-instance p1, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {p1}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object p1, p0, Le/f/a/d/a/b/l1;->e:Ljava/util/concurrent/locks/ReentrantLock;

    return-void
.end method

.method public static c(Ljava/util/List;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "TT;>;)",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    if-nez p0, :cond_0

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p0

    :cond_0
    return-object p0
.end method

.method public static e(Landroid/os/Bundle;)Ljava/lang/String;
    .locals 1

    const-string v0, "pack_names"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0

    :cond_0
    new-instance p0, Le/f/a/d/a/b/t0;

    const-string v0, "Session without pack received."

    invoke-direct {p0, v0}, Le/f/a/d/a/b/t0;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final a(Le/f/a/d/a/b/k1;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Le/f/a/d/a/b/k1<",
            "TT;>;)TT;"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0}, Le/f/a/d/a/b/l1;->a()V

    invoke-interface {p1}, Le/f/a/d/a/b/k1;->a()Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Le/f/a/d/a/b/l1;->b()V

    return-object p1

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, Le/f/a/d/a/b/l1;->b()V

    throw p1
.end method

.method public final synthetic a(Ljava/util/List;)Ljava/util/Map;
    .locals 6

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iget-object v1, p0, Le/f/a/d/a/b/l1;->d:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le/f/a/d/a/b/i1;

    iget-object v3, v2, Le/f/a/d/a/b/i1;->c:Le/f/a/d/a/b/h1;

    iget-object v3, v3, Le/f/a/d/a/b/h1;->a:Ljava/lang/String;

    invoke-interface {p1, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Le/f/a/d/a/b/i1;

    if-nez v4, :cond_1

    const/4 v4, -0x1

    goto :goto_1

    :cond_1
    iget v4, v4, Le/f/a/d/a/b/i1;->a:I

    :goto_1
    iget v5, v2, Le/f/a/d/a/b/i1;->a:I

    if-ge v4, v5, :cond_0

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public final a()V
    .locals 1

    iget-object v0, p0, Le/f/a/d/a/b/l1;->e:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    return-void
.end method

.method public final a(I)V
    .locals 1

    new-instance v0, Le/f/a/d/a/b/f1;

    invoke-direct {v0, p0, p1}, Le/f/a/d/a/b/f1;-><init>(Le/f/a/d/a/b/l1;I)V

    invoke-virtual {p0, v0}, Le/f/a/d/a/b/l1;->a(Le/f/a/d/a/b/k1;)Ljava/lang/Object;

    return-void
.end method

.method public final a(Ljava/lang/String;IJ)V
    .locals 7

    new-instance v6, Le/f/a/d/a/b/c1;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move-wide v4, p3

    invoke-direct/range {v0 .. v5}, Le/f/a/d/a/b/c1;-><init>(Le/f/a/d/a/b/l1;Ljava/lang/String;IJ)V

    invoke-virtual {p0, v6}, Le/f/a/d/a/b/l1;->a(Le/f/a/d/a/b/k1;)Ljava/lang/Object;

    return-void
.end method

.method public final a(Landroid/os/Bundle;)Z
    .locals 1

    new-instance v0, Le/f/a/d/a/b/a1;

    invoke-direct {v0, p0, p1}, Le/f/a/d/a/b/a1;-><init>(Le/f/a/d/a/b/l1;Landroid/os/Bundle;)V

    invoke-virtual {p0, v0}, Le/f/a/d/a/b/l1;->a(Le/f/a/d/a/b/k1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method

.method public final b(Ljava/util/List;)Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Le/f/a/d/a/b/i1;",
            ">;"
        }
    .end annotation

    new-instance v0, Le/f/a/d/a/b/d1;

    invoke-direct {v0, p0, p1}, Le/f/a/d/a/b/d1;-><init>(Le/f/a/d/a/b/l1;Ljava/util/List;)V

    invoke-virtual {p0, v0}, Le/f/a/d/a/b/l1;->a(Le/f/a/d/a/b/k1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    return-object p1
.end method

.method public final b()V
    .locals 1

    iget-object v0, p0, Le/f/a/d/a/b/l1;->e:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return-void
.end method

.method public final synthetic b(I)V
    .locals 1

    invoke-virtual {p0, p1}, Le/f/a/d/a/b/l1;->e(I)Le/f/a/d/a/b/i1;

    move-result-object p1

    iget-object p1, p1, Le/f/a/d/a/b/i1;->c:Le/f/a/d/a/b/h1;

    const/4 v0, 0x5

    iput v0, p1, Le/f/a/d/a/b/h1;->c:I

    return-void
.end method

.method public final synthetic b(Ljava/lang/String;IJ)V
    .locals 5

    const/4 v0, 0x1

    new-array v1, v0, [Ljava/lang/String;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {p0, v1}, Le/f/a/d/a/b/l1;->b(Ljava/util/List;)Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le/f/a/d/a/b/i1;

    if-eqz v1, :cond_0

    iget-object v3, v1, Le/f/a/d/a/b/i1;->c:Le/f/a/d/a/b/h1;

    iget v3, v3, Le/f/a/d/a/b/h1;->c:I

    invoke-static {v3}, Le/f/a/d/a/b/v1;->b(I)Z

    move-result v3

    if-eqz v3, :cond_1

    :cond_0
    sget-object v3, Le/f/a/d/a/b/l1;->f:Le/f/a/d/a/e/a;

    new-array v0, v0, [Ljava/lang/Object;

    aput-object p1, v0, v2

    const-string v4, "Could not find pack %s while trying to complete it"

    invoke-static {v4, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v3, v0, v2}, Le/f/a/d/a/e/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    iget-object v0, p0, Le/f/a/d/a/b/l1;->a:Le/f/a/d/a/b/b0;

    invoke-virtual {v0, p1, p2, p3, p4}, Le/f/a/d/a/b/b0;->a(Ljava/lang/String;IJ)V

    iget-object p1, v1, Le/f/a/d/a/b/i1;->c:Le/f/a/d/a/b/h1;

    const/4 p2, 0x4

    iput p2, p1, Le/f/a/d/a/b/h1;->c:I

    return-void
.end method

.method public final b(Landroid/os/Bundle;)Z
    .locals 1

    new-instance v0, Le/f/a/d/a/b/b1;

    invoke-direct {v0, p0, p1}, Le/f/a/d/a/b/b1;-><init>(Le/f/a/d/a/b/l1;Landroid/os/Bundle;)V

    invoke-virtual {p0, v0}, Le/f/a/d/a/b/l1;->a(Le/f/a/d/a/b/k1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method

.method public final synthetic c(Landroid/os/Bundle;)Ljava/lang/Boolean;
    .locals 4

    const-string v0, "session_id"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    if-nez v0, :cond_0

    return-object v2

    :cond_0
    iget-object v3, p0, Le/f/a/d/a/b/l1;->d:Ljava/util/Map;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    return-object v2

    :cond_1
    iget-object v2, p0, Le/f/a/d/a/b/l1;->d:Ljava/util/Map;

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/f/a/d/a/b/i1;

    iget-object v2, v0, Le/f/a/d/a/b/i1;->c:Le/f/a/d/a/b/h1;

    iget v2, v2, Le/f/a/d/a/b/h1;->c:I

    const/4 v3, 0x6

    if-ne v2, v3, :cond_2

    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-static {p1}, Le/f/a/d/a/b/l1;->e(Landroid/os/Bundle;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "status"

    invoke-static {v3, v2}, Le/f/a/d/a/e/b0;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result p1

    iget-object v0, v0, Le/f/a/d/a/b/i1;->c:Le/f/a/d/a/b/h1;

    iget v0, v0, Le/f/a/d/a/b/h1;->c:I

    invoke-static {v0, p1}, Le/f/a/d/a/b/v1;->a(II)Z

    move-result p1

    xor-int/2addr p1, v1

    goto :goto_0
.end method

.method public final c()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Le/f/a/d/a/b/i1;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Le/f/a/d/a/b/l1;->d:Ljava/util/Map;

    return-object v0
.end method

.method public final synthetic c(I)V
    .locals 6

    invoke-virtual {p0, p1}, Le/f/a/d/a/b/l1;->e(I)Le/f/a/d/a/b/i1;

    move-result-object v0

    iget-object v1, v0, Le/f/a/d/a/b/i1;->c:Le/f/a/d/a/b/h1;

    iget v1, v1, Le/f/a/d/a/b/h1;->c:I

    invoke-static {v1}, Le/f/a/d/a/b/v1;->b(I)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object p1, p0, Le/f/a/d/a/b/l1;->a:Le/f/a/d/a/b/b0;

    iget-object v1, v0, Le/f/a/d/a/b/i1;->c:Le/f/a/d/a/b/h1;

    iget-object v2, v1, Le/f/a/d/a/b/h1;->a:Ljava/lang/String;

    iget v3, v0, Le/f/a/d/a/b/i1;->b:I

    iget-wide v4, v1, Le/f/a/d/a/b/h1;->b:J

    invoke-virtual {p1, v2, v3, v4, v5}, Le/f/a/d/a/b/b0;->a(Ljava/lang/String;IJ)V

    iget-object p1, v0, Le/f/a/d/a/b/i1;->c:Le/f/a/d/a/b/h1;

    iget v0, p1, Le/f/a/d/a/b/h1;->c:I

    const/4 v1, 0x5

    if-eq v0, v1, :cond_1

    const/4 v1, 0x6

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    iget-object v0, p0, Le/f/a/d/a/b/l1;->a:Le/f/a/d/a/b/b0;

    iget-object p1, p1, Le/f/a/d/a/b/h1;->a:Ljava/lang/String;

    invoke-virtual {v0, p1}, Le/f/a/d/a/b/b0;->d(Ljava/lang/String;)Z

    return-void

    :cond_2
    new-instance v0, Le/f/a/d/a/b/t0;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    const-string v2, "Could not safely delete session %d because it is not in a terminal state."

    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Le/f/a/d/a/b/t0;-><init>(Ljava/lang/String;I)V

    throw v0
.end method

.method public final synthetic d(Landroid/os/Bundle;)Ljava/lang/Boolean;
    .locals 25

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "session_id"

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_0

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    return-object v1

    :cond_0
    iget-object v4, v0, Le/f/a/d/a/b/l1;->d:Ljava/util/Map;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    const-string v6, "chunk_intents"

    const-string v7, "status"

    const/4 v8, 0x1

    if-eqz v4, :cond_7

    invoke-virtual {v0, v2}, Le/f/a/d/a/b/l1;->e(I)Le/f/a/d/a/b/i1;

    move-result-object v4

    iget-object v9, v4, Le/f/a/d/a/b/i1;->c:Le/f/a/d/a/b/h1;

    iget-object v9, v9, Le/f/a/d/a/b/h1;->a:Ljava/lang/String;

    invoke-static {v7, v9}, Le/f/a/d/a/e/b0;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v7}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v7

    iget-object v9, v4, Le/f/a/d/a/b/i1;->c:Le/f/a/d/a/b/h1;

    iget v9, v9, Le/f/a/d/a/b/h1;->c:I

    invoke-static {v9, v7}, Le/f/a/d/a/b/v1;->a(II)Z

    move-result v9

    if-eqz v9, :cond_3

    sget-object v1, Le/f/a/d/a/b/l1;->f:Le/f/a/d/a/e/a;

    const/4 v6, 0x2

    new-array v6, v6, [Ljava/lang/Object;

    aput-object v5, v6, v3

    iget-object v5, v4, Le/f/a/d/a/b/i1;->c:Le/f/a/d/a/b/h1;

    iget v5, v5, Le/f/a/d/a/b/h1;->c:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v6, v8

    const-string v5, "Found stale update for session %s with status %d."

    invoke-virtual {v1, v5, v6}, Le/f/a/d/a/e/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v1, v4, Le/f/a/d/a/b/i1;->c:Le/f/a/d/a/b/h1;

    iget-object v4, v1, Le/f/a/d/a/b/h1;->a:Ljava/lang/String;

    iget v1, v1, Le/f/a/d/a/b/h1;->c:I

    const/4 v5, 0x4

    if-ne v1, v5, :cond_1

    iget-object v1, v0, Le/f/a/d/a/b/l1;->b:Le/f/a/d/a/e/x;

    invoke-interface {v1}, Le/f/a/d/a/e/x;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le/f/a/d/a/b/j3;

    invoke-interface {v1, v2, v4}, Le/f/a/d/a/b/j3;->a(ILjava/lang/String;)V

    goto/16 :goto_5

    :cond_1
    const/4 v5, 0x5

    if-ne v1, v5, :cond_2

    iget-object v1, v0, Le/f/a/d/a/b/l1;->b:Le/f/a/d/a/e/x;

    invoke-interface {v1}, Le/f/a/d/a/e/x;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le/f/a/d/a/b/j3;

    invoke-interface {v1, v2}, Le/f/a/d/a/b/j3;->a(I)V

    goto/16 :goto_5

    :cond_2
    const/4 v2, 0x6

    if-ne v1, v2, :cond_c

    iget-object v1, v0, Le/f/a/d/a/b/l1;->b:Le/f/a/d/a/e/x;

    invoke-interface {v1}, Le/f/a/d/a/e/x;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le/f/a/d/a/b/j3;

    new-array v2, v8, [Ljava/lang/String;

    aput-object v4, v2, v3

    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v1, v2}, Le/f/a/d/a/b/j3;->a(Ljava/util/List;)V

    goto/16 :goto_5

    :cond_3
    iget-object v5, v4, Le/f/a/d/a/b/i1;->c:Le/f/a/d/a/b/h1;

    iput v7, v5, Le/f/a/d/a/b/h1;->c:I

    invoke-static {v7}, Le/f/a/d/a/b/v1;->b(I)Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-virtual {v0, v2}, Le/f/a/d/a/b/l1;->a(I)V

    iget-object v1, v0, Le/f/a/d/a/b/l1;->c:Le/f/a/d/a/b/x0;

    iget-object v2, v4, Le/f/a/d/a/b/i1;->c:Le/f/a/d/a/b/h1;

    iget-object v2, v2, Le/f/a/d/a/b/h1;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Le/f/a/d/a/b/x0;->a(Ljava/lang/String;)V

    goto/16 :goto_5

    :cond_4
    iget-object v2, v4, Le/f/a/d/a/b/i1;->c:Le/f/a/d/a/b/h1;

    iget-object v2, v2, Le/f/a/d/a/b/h1;->e:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_c

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Le/f/a/d/a/b/j1;

    iget-object v7, v4, Le/f/a/d/a/b/i1;->c:Le/f/a/d/a/b/h1;

    iget-object v7, v7, Le/f/a/d/a/b/h1;->a:Ljava/lang/String;

    iget-object v9, v5, Le/f/a/d/a/b/j1;->a:Ljava/lang/String;

    invoke-static {v6, v7, v9}, Le/f/a/d/a/e/b0;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v7}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v7

    if-eqz v7, :cond_5

    const/4 v9, 0x0

    :goto_0
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v10

    if-ge v9, v10, :cond_5

    invoke-interface {v7, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    if-eqz v10, :cond_6

    invoke-interface {v7, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroid/content/Intent;

    invoke-virtual {v10}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v10

    if-eqz v10, :cond_6

    iget-object v10, v5, Le/f/a/d/a/b/j1;->d:Ljava/util/List;

    invoke-interface {v10, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Le/f/a/d/a/b/g1;

    iput-boolean v8, v10, Le/f/a/d/a/b/g1;->a:Z

    :cond_6
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    :cond_7
    invoke-static/range {p1 .. p1}, Le/f/a/d/a/b/l1;->e(Landroid/os/Bundle;)Ljava/lang/String;

    move-result-object v11

    const-string v4, "pack_version"

    invoke-static {v4, v11}, Le/f/a/d/a/e/b0;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v12

    invoke-static {v7, v11}, Le/f/a/d/a/e/b0;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v14

    const-string v4, "total_bytes_to_download"

    invoke-static {v4, v11}, Le/f/a/d/a/e/b0;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v15

    const-string v4, "slice_ids"

    invoke-static {v4, v11}, Le/f/a/d/a/e/b0;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v4

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v4}, Le/f/a/d/a/b/l1;->c(Ljava/util/List;)Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_b

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-static {v6, v11, v7}, Le/f/a/d/a/e/b0;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1, v9}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v9

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v9}, Le/f/a/d/a/b/l1;->c(Ljava/util/List;)Ljava/util/List;

    move-result-object v9

    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_2
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v17

    if-eqz v17, :cond_9

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v17

    check-cast v17, Landroid/content/Intent;

    if-eqz v17, :cond_8

    goto :goto_3

    :cond_8
    const/4 v8, 0x0

    :goto_3
    new-instance v3, Le/f/a/d/a/b/g1;

    invoke-direct {v3, v8}, Le/f/a/d/a/b/g1;-><init>(Z)V

    invoke-interface {v10, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 v3, 0x0

    const/4 v8, 0x1

    goto :goto_2

    :cond_9
    const-string v3, "uncompressed_hash_sha256"

    invoke-static {v3, v11, v7}, Le/f/a/d/a/e/b0;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v19

    const-string v3, "uncompressed_size"

    invoke-static {v3, v11, v7}, Le/f/a/d/a/e/b0;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v20

    const-string v3, "patch_format"

    invoke-static {v3, v11, v7}, Le/f/a/d/a/e/b0;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v8, 0x0

    invoke-virtual {v1, v3, v8}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v24

    if-eqz v24, :cond_a

    new-instance v3, Le/f/a/d/a/b/j1;

    const/16 v23, 0x0

    move-object/from16 v17, v3

    move-object/from16 v18, v7

    move-object/from16 v22, v10

    invoke-direct/range {v17 .. v24}, Le/f/a/d/a/b/j1;-><init>(Ljava/lang/String;Ljava/lang/String;JLjava/util/List;II)V

    const/4 v8, 0x0

    goto :goto_4

    :cond_a
    const-string v3, "compression_format"

    invoke-static {v3, v11, v7}, Le/f/a/d/a/e/b0;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v8, 0x0

    invoke-virtual {v1, v3, v8}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v23

    new-instance v3, Le/f/a/d/a/b/j1;

    const/16 v24, 0x0

    move-object/from16 v17, v3

    move-object/from16 v18, v7

    move-object/from16 v22, v10

    invoke-direct/range {v17 .. v24}, Le/f/a/d/a/b/j1;-><init>(Ljava/lang/String;Ljava/lang/String;JLjava/util/List;II)V

    :goto_4
    invoke-interface {v5, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 v3, 0x0

    const/4 v8, 0x1

    goto/16 :goto_1

    :cond_b
    new-instance v3, Le/f/a/d/a/b/h1;

    move-object v10, v3

    move-object/from16 v17, v5

    invoke-direct/range {v10 .. v17}, Le/f/a/d/a/b/h1;-><init>(Ljava/lang/String;JIJLjava/util/List;)V

    new-instance v4, Le/f/a/d/a/b/i1;

    const-string v5, "app_version_code"

    invoke-virtual {v1, v5}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-direct {v4, v2, v1, v3}, Le/f/a/d/a/b/i1;-><init>(IILe/f/a/d/a/b/h1;)V

    iget-object v1, v0, Le/f/a/d/a/b/l1;->d:Ljava/util/Map;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_c
    :goto_5
    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    return-object v1
.end method

.method public final d(I)V
    .locals 1

    new-instance v0, Le/f/a/d/a/b/e1;

    invoke-direct {v0, p0, p1}, Le/f/a/d/a/b/e1;-><init>(Le/f/a/d/a/b/l1;I)V

    invoke-virtual {p0, v0}, Le/f/a/d/a/b/l1;->a(Le/f/a/d/a/b/k1;)Ljava/lang/Object;

    return-void
.end method

.method public final e(I)Le/f/a/d/a/b/i1;
    .locals 4

    iget-object v0, p0, Le/f/a/d/a/b/l1;->d:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/f/a/d/a/b/i1;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Le/f/a/d/a/b/t0;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const-string v1, "Could not find session %d while trying to get it"

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Le/f/a/d/a/b/t0;-><init>(Ljava/lang/String;I)V

    throw v0
.end method
