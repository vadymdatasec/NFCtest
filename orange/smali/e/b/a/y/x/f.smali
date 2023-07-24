.class public final Le/b/a/y/x/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Z

.field public final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Le/b/a/y/n;",
            "Le/b/a/y/x/e;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Ljava/lang/ref/ReferenceQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/ReferenceQueue<",
            "Le/b/a/y/x/s0<",
            "*>;>;"
        }
    .end annotation
.end field

.field public d:Le/b/a/y/x/r0;

.field public volatile e:Z

.field public volatile f:Le/b/a/y/x/d;


# direct methods
.method public constructor <init>(Z)V
    .locals 1

    .line 1
    new-instance v0, Le/b/a/y/x/b;

    invoke-direct {v0}, Le/b/a/y/x/b;-><init>()V

    .line 2
    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    .line 3
    invoke-direct {p0, p1, v0}, Le/b/a/y/x/f;-><init>(ZLjava/util/concurrent/Executor;)V

    return-void
.end method

.method public constructor <init>(ZLjava/util/concurrent/Executor;)V
    .locals 1

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Le/b/a/y/x/f;->b:Ljava/util/Map;

    .line 6
    new-instance v0, Ljava/lang/ref/ReferenceQueue;

    invoke-direct {v0}, Ljava/lang/ref/ReferenceQueue;-><init>()V

    iput-object v0, p0, Le/b/a/y/x/f;->c:Ljava/lang/ref/ReferenceQueue;

    .line 7
    iput-boolean p1, p0, Le/b/a/y/x/f;->a:Z

    .line 8
    new-instance p1, Le/b/a/y/x/c;

    invoke-direct {p1, p0}, Le/b/a/y/x/c;-><init>(Le/b/a/y/x/f;)V

    invoke-interface {p2, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 23
    :cond_0
    :goto_0
    iget-boolean v0, p0, Le/b/a/y/x/f;->e:Z

    if-nez v0, :cond_1

    .line 24
    :try_start_0
    iget-object v0, p0, Le/b/a/y/x/f;->c:Ljava/lang/ref/ReferenceQueue;

    invoke-virtual {v0}, Ljava/lang/ref/ReferenceQueue;->remove()Ljava/lang/ref/Reference;

    move-result-object v0

    check-cast v0, Le/b/a/y/x/e;

    .line 25
    invoke-virtual {p0, v0}, Le/b/a/y/x/f;->a(Le/b/a/y/x/e;)V

    .line 26
    iget-object v0, p0, Le/b/a/y/x/f;->f:Le/b/a/y/x/d;

    if-eqz v0, :cond_0

    .line 27
    invoke-interface {v0}, Le/b/a/y/x/d;->a()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 28
    :catch_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public declared-synchronized a(Le/b/a/y/n;)V
    .locals 1

    monitor-enter p0

    .line 12
    :try_start_0
    iget-object v0, p0, Le/b/a/y/x/f;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Le/b/a/y/x/e;

    if-eqz p1, :cond_0

    .line 13
    invoke-virtual {p1}, Le/b/a/y/x/e;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized a(Le/b/a/y/n;Le/b/a/y/x/s0;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/y/n;",
            "Le/b/a/y/x/s0<",
            "*>;)V"
        }
    .end annotation

    monitor-enter p0

    .line 8
    :try_start_0
    new-instance v0, Le/b/a/y/x/e;

    iget-object v1, p0, Le/b/a/y/x/f;->c:Ljava/lang/ref/ReferenceQueue;

    iget-boolean v2, p0, Le/b/a/y/x/f;->a:Z

    invoke-direct {v0, p1, p2, v1, v2}, Le/b/a/y/x/e;-><init>(Le/b/a/y/n;Le/b/a/y/x/s0;Ljava/lang/ref/ReferenceQueue;Z)V

    .line 9
    iget-object p2, p0, Le/b/a/y/x/f;->b:Ljava/util/Map;

    invoke-interface {p2, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Le/b/a/y/x/e;

    if-eqz p1, :cond_0

    .line 10
    invoke-virtual {p1}, Le/b/a/y/x/e;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public a(Le/b/a/y/x/e;)V
    .locals 7

    .line 15
    monitor-enter p0

    .line 16
    :try_start_0
    iget-object v0, p0, Le/b/a/y/x/f;->b:Ljava/util/Map;

    iget-object v1, p1, Le/b/a/y/x/e;->a:Le/b/a/y/n;

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    iget-boolean v0, p1, Le/b/a/y/x/e;->b:Z

    if-eqz v0, :cond_1

    iget-object v0, p1, Le/b/a/y/x/e;->c:Le/b/a/y/x/y0;

    if-nez v0, :cond_0

    goto :goto_0

    .line 18
    :cond_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    new-instance v0, Le/b/a/y/x/s0;

    iget-object v2, p1, Le/b/a/y/x/e;->c:Le/b/a/y/x/y0;

    const/4 v3, 0x1

    const/4 v4, 0x0

    iget-object v5, p1, Le/b/a/y/x/e;->a:Le/b/a/y/n;

    iget-object v6, p0, Le/b/a/y/x/f;->d:Le/b/a/y/x/r0;

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Le/b/a/y/x/s0;-><init>(Le/b/a/y/x/y0;ZZLe/b/a/y/n;Le/b/a/y/x/r0;)V

    .line 20
    iget-object v1, p0, Le/b/a/y/x/f;->d:Le/b/a/y/x/r0;

    iget-object p1, p1, Le/b/a/y/x/e;->a:Le/b/a/y/n;

    invoke-interface {v1, p1, v0}, Le/b/a/y/x/r0;->a(Le/b/a/y/n;Le/b/a/y/x/s0;)V

    return-void

    .line 21
    :cond_1
    :goto_0
    :try_start_1
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    .line 22
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public a(Le/b/a/y/x/r0;)V
    .locals 1

    .line 1
    monitor-enter p1

    .line 2
    :try_start_0
    monitor-enter p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 3
    :try_start_1
    iput-object p1, p0, Le/b/a/y/x/f;->d:Le/b/a/y/x/r0;

    .line 4
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 5
    :try_start_2
    monitor-exit p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    return-void

    :catchall_0
    move-exception v0

    .line 6
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw v0

    :catchall_1
    move-exception v0

    .line 7
    monitor-exit p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw v0
.end method

.method public declared-synchronized b(Le/b/a/y/n;)Le/b/a/y/x/s0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/y/n;",
            ")",
            "Le/b/a/y/x/s0<",
            "*>;"
        }
    .end annotation

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Le/b/a/y/x/f;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Le/b/a/y/x/e;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    .line 2
    monitor-exit p0

    return-object p1

    .line 3
    :cond_0
    :try_start_1
    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/b/a/y/x/s0;

    if-nez v0, :cond_1

    .line 4
    invoke-virtual {p0, p1}, Le/b/a/y/x/f;->a(Le/b/a/y/x/e;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 5
    :cond_1
    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
