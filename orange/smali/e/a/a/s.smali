.class public Le/a/a/s;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final b:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Le/a/a/p<",
            "*>;>;"
        }
    .end annotation
.end field

.field public final c:Ljava/util/concurrent/PriorityBlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/PriorityBlockingQueue<",
            "Le/a/a/p<",
            "*>;>;"
        }
    .end annotation
.end field

.field public final d:Ljava/util/concurrent/PriorityBlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/PriorityBlockingQueue<",
            "Le/a/a/p<",
            "*>;>;"
        }
    .end annotation
.end field

.field public final e:Le/a/a/b;

.field public final f:Le/a/a/j;

.field public final g:Le/a/a/w;

.field public final h:[Le/a/a/k;

.field public i:Le/a/a/d;

.field public final j:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Le/a/a/r;",
            ">;"
        }
    .end annotation
.end field

.field public final k:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Le/a/a/q;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Le/a/a/b;Le/a/a/j;I)V
    .locals 3

    .line 12
    new-instance v0, Le/a/a/h;

    new-instance v1, Landroid/os/Handler;

    .line 13
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    invoke-direct {v0, v1}, Le/a/a/h;-><init>(Landroid/os/Handler;)V

    .line 14
    invoke-direct {p0, p1, p2, p3, v0}, Le/a/a/s;-><init>(Le/a/a/b;Le/a/a/j;ILe/a/a/w;)V

    return-void
.end method

.method public constructor <init>(Le/a/a/b;Le/a/a/j;ILe/a/a/w;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v0, p0, Le/a/a/s;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 3
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Le/a/a/s;->b:Ljava/util/Set;

    .line 4
    new-instance v0, Ljava/util/concurrent/PriorityBlockingQueue;

    invoke-direct {v0}, Ljava/util/concurrent/PriorityBlockingQueue;-><init>()V

    iput-object v0, p0, Le/a/a/s;->c:Ljava/util/concurrent/PriorityBlockingQueue;

    .line 5
    new-instance v0, Ljava/util/concurrent/PriorityBlockingQueue;

    invoke-direct {v0}, Ljava/util/concurrent/PriorityBlockingQueue;-><init>()V

    iput-object v0, p0, Le/a/a/s;->d:Ljava/util/concurrent/PriorityBlockingQueue;

    .line 6
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Le/a/a/s;->j:Ljava/util/List;

    .line 7
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Le/a/a/s;->k:Ljava/util/List;

    .line 8
    iput-object p1, p0, Le/a/a/s;->e:Le/a/a/b;

    .line 9
    iput-object p2, p0, Le/a/a/s;->f:Le/a/a/j;

    .line 10
    new-array p1, p3, [Le/a/a/k;

    iput-object p1, p0, Le/a/a/s;->h:[Le/a/a/k;

    .line 11
    iput-object p4, p0, Le/a/a/s;->g:Le/a/a/w;

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 1
    iget-object v0, p0, Le/a/a/s;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result v0

    return v0
.end method

.method public a(Le/a/a/p;)Le/a/a/p;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Le/a/a/p<",
            "TT;>;)",
            "Le/a/a/p<",
            "TT;>;"
        }
    .end annotation

    .line 2
    invoke-virtual {p1, p0}, Le/a/a/p;->a(Le/a/a/s;)Le/a/a/p;

    .line 3
    iget-object v0, p0, Le/a/a/s;->b:Ljava/util/Set;

    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Le/a/a/s;->b:Ljava/util/Set;

    invoke-interface {v1, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 5
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    invoke-virtual {p0}, Le/a/a/s;->a()I

    move-result v0

    invoke-virtual {p1, v0}, Le/a/a/p;->b(I)Le/a/a/p;

    const-string v0, "add-to-queue"

    .line 7
    invoke-virtual {p1, v0}, Le/a/a/p;->a(Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 8
    invoke-virtual {p0, p1, v0}, Le/a/a/s;->a(Le/a/a/p;I)V

    .line 9
    invoke-virtual {p0, p1}, Le/a/a/s;->b(Le/a/a/p;)V

    return-object p1

    :catchall_0
    move-exception p1

    .line 10
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public a(Le/a/a/p;I)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/a/a/p<",
            "*>;I)V"
        }
    .end annotation

    .line 11
    iget-object v0, p0, Le/a/a/s;->k:Ljava/util/List;

    monitor-enter v0

    .line 12
    :try_start_0
    iget-object v1, p0, Le/a/a/s;->k:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le/a/a/q;

    .line 13
    invoke-interface {v2, p1, p2}, Le/a/a/q;->a(Le/a/a/p;I)V

    goto :goto_0

    .line 14
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public b()V
    .locals 6

    .line 1
    invoke-virtual {p0}, Le/a/a/s;->c()V

    .line 2
    new-instance v0, Le/a/a/d;

    iget-object v1, p0, Le/a/a/s;->c:Ljava/util/concurrent/PriorityBlockingQueue;

    iget-object v2, p0, Le/a/a/s;->d:Ljava/util/concurrent/PriorityBlockingQueue;

    iget-object v3, p0, Le/a/a/s;->e:Le/a/a/b;

    iget-object v4, p0, Le/a/a/s;->g:Le/a/a/w;

    invoke-direct {v0, v1, v2, v3, v4}, Le/a/a/d;-><init>(Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/BlockingQueue;Le/a/a/b;Le/a/a/w;)V

    iput-object v0, p0, Le/a/a/s;->i:Le/a/a/d;

    .line 3
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    const/4 v0, 0x0

    .line 4
    :goto_0
    iget-object v1, p0, Le/a/a/s;->h:[Le/a/a/k;

    array-length v1, v1

    if-ge v0, v1, :cond_0

    .line 5
    new-instance v1, Le/a/a/k;

    iget-object v2, p0, Le/a/a/s;->d:Ljava/util/concurrent/PriorityBlockingQueue;

    iget-object v3, p0, Le/a/a/s;->f:Le/a/a/j;

    iget-object v4, p0, Le/a/a/s;->e:Le/a/a/b;

    iget-object v5, p0, Le/a/a/s;->g:Le/a/a/w;

    invoke-direct {v1, v2, v3, v4, v5}, Le/a/a/k;-><init>(Ljava/util/concurrent/BlockingQueue;Le/a/a/j;Le/a/a/b;Le/a/a/w;)V

    .line 6
    iget-object v2, p0, Le/a/a/s;->h:[Le/a/a/k;

    aput-object v1, v2, v0

    .line 7
    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public b(Le/a/a/p;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Le/a/a/p<",
            "TT;>;)V"
        }
    .end annotation

    .line 8
    invoke-virtual {p1}, Le/a/a/p;->u()Z

    move-result v0

    if-nez v0, :cond_0

    .line 9
    invoke-virtual {p0, p1}, Le/a/a/s;->d(Le/a/a/p;)V

    goto :goto_0

    .line 10
    :cond_0
    iget-object v0, p0, Le/a/a/s;->c:Ljava/util/concurrent/PriorityBlockingQueue;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/PriorityBlockingQueue;->add(Ljava/lang/Object;)Z

    :goto_0
    return-void
.end method

.method public c()V
    .locals 4

    .line 1
    iget-object v0, p0, Le/a/a/s;->i:Le/a/a/d;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Le/a/a/d;->b()V

    .line 3
    :cond_0
    iget-object v0, p0, Le/a/a/s;->h:[Le/a/a/k;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-object v3, v0, v2

    if-eqz v3, :cond_1

    .line 4
    invoke-virtual {v3}, Le/a/a/k;->b()V

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public c(Le/a/a/p;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Le/a/a/p<",
            "TT;>;)V"
        }
    .end annotation

    .line 5
    iget-object v0, p0, Le/a/a/s;->b:Ljava/util/Set;

    monitor-enter v0

    .line 6
    :try_start_0
    iget-object v1, p0, Le/a/a/s;->b:Ljava/util/Set;

    invoke-interface {v1, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 7
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 8
    iget-object v1, p0, Le/a/a/s;->j:Ljava/util/List;

    monitor-enter v1

    .line 9
    :try_start_1
    iget-object v0, p0, Le/a/a/s;->j:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le/a/a/r;

    .line 10
    invoke-interface {v2, p1}, Le/a/a/r;->a(Le/a/a/p;)V

    goto :goto_0

    .line 11
    :cond_0
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v0, 0x5

    .line 12
    invoke-virtual {p0, p1, v0}, Le/a/a/s;->a(Le/a/a/p;I)V

    return-void

    :catchall_0
    move-exception p1

    .line 13
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1

    :catchall_1
    move-exception p1

    .line 14
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw p1
.end method

.method public d(Le/a/a/p;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Le/a/a/p<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/a/a/s;->d:Ljava/util/concurrent/PriorityBlockingQueue;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/PriorityBlockingQueue;->add(Ljava/lang/Object;)Z

    return-void
.end method
