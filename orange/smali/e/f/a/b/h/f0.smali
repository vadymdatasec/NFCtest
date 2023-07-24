.class public final Le/f/a/b/h/f0;
.super Le/f/a/b/h/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<TResult:",
        "Ljava/lang/Object;",
        ">",
        "Le/f/a/b/h/g<",
        "TTResult;>;"
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Le/f/a/b/h/d0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/a/b/h/d0<",
            "TTResult;>;"
        }
    .end annotation
.end field

.field public c:Z

.field public volatile d:Z

.field public e:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TTResult;"
        }
    .end annotation
.end field

.field public f:Ljava/lang/Exception;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Le/f/a/b/h/g;-><init>()V

    .line 2
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Le/f/a/b/h/f0;->a:Ljava/lang/Object;

    .line 3
    new-instance v0, Le/f/a/b/h/d0;

    invoke-direct {v0}, Le/f/a/b/h/d0;-><init>()V

    iput-object v0, p0, Le/f/a/b/h/f0;->b:Le/f/a/b/h/d0;

    return-void
.end method


# virtual methods
.method public final a(Le/f/a/b/h/a;)Le/f/a/b/h/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TContinuationResult:",
            "Ljava/lang/Object;",
            ">(",
            "Le/f/a/b/h/a<",
            "TTResult;TTContinuationResult;>;)",
            "Le/f/a/b/h/g<",
            "TTContinuationResult;>;"
        }
    .end annotation

    .line 20
    sget-object v0, Le/f/a/b/h/j;->a:Ljava/util/concurrent/Executor;

    invoke-virtual {p0, v0, p1}, Le/f/a/b/h/f0;->a(Ljava/util/concurrent/Executor;Le/f/a/b/h/a;)Le/f/a/b/h/g;

    move-result-object p1

    return-object p1
.end method

.method public final a(Le/f/a/b/h/e;)Le/f/a/b/h/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/a/b/h/e<",
            "-TTResult;>;)",
            "Le/f/a/b/h/g<",
            "TTResult;>;"
        }
    .end annotation

    .line 13
    sget-object v0, Le/f/a/b/h/j;->a:Ljava/util/concurrent/Executor;

    invoke-virtual {p0, v0, p1}, Le/f/a/b/h/f0;->a(Ljava/util/concurrent/Executor;Le/f/a/b/h/e;)Le/f/a/b/h/g;

    return-object p0
.end method

.method public final a(Le/f/a/b/h/f;)Le/f/a/b/h/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TContinuationResult:",
            "Ljava/lang/Object;",
            ">(",
            "Le/f/a/b/h/f<",
            "TTResult;TTContinuationResult;>;)",
            "Le/f/a/b/h/g<",
            "TTContinuationResult;>;"
        }
    .end annotation

    .line 29
    sget-object v0, Le/f/a/b/h/j;->a:Ljava/util/concurrent/Executor;

    invoke-virtual {p0, v0, p1}, Le/f/a/b/h/f0;->a(Ljava/util/concurrent/Executor;Le/f/a/b/h/f;)Le/f/a/b/h/g;

    move-result-object p1

    return-object p1
.end method

.method public final a(Ljava/util/concurrent/Executor;Le/f/a/b/h/a;)Le/f/a/b/h/g;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TContinuationResult:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Executor;",
            "Le/f/a/b/h/a<",
            "TTResult;TTContinuationResult;>;)",
            "Le/f/a/b/h/g<",
            "TTContinuationResult;>;"
        }
    .end annotation

    .line 21
    new-instance v0, Le/f/a/b/h/f0;

    invoke-direct {v0}, Le/f/a/b/h/f0;-><init>()V

    .line 22
    iget-object v1, p0, Le/f/a/b/h/f0;->b:Le/f/a/b/h/d0;

    new-instance v2, Le/f/a/b/h/o;

    invoke-direct {v2, p1, p2, v0}, Le/f/a/b/h/o;-><init>(Ljava/util/concurrent/Executor;Le/f/a/b/h/a;Le/f/a/b/h/f0;)V

    invoke-virtual {v1, v2}, Le/f/a/b/h/d0;->a(Le/f/a/b/h/c0;)V

    .line 23
    invoke-virtual {p0}, Le/f/a/b/h/f0;->j()V

    return-object v0
.end method

.method public final a(Ljava/util/concurrent/Executor;Le/f/a/b/h/b;)Le/f/a/b/h/g;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Le/f/a/b/h/b;",
            ")",
            "Le/f/a/b/h/g<",
            "TTResult;>;"
        }
    .end annotation

    .line 24
    iget-object v0, p0, Le/f/a/b/h/f0;->b:Le/f/a/b/h/d0;

    new-instance v1, Le/f/a/b/h/s;

    invoke-direct {v1, p1, p2}, Le/f/a/b/h/s;-><init>(Ljava/util/concurrent/Executor;Le/f/a/b/h/b;)V

    invoke-virtual {v0, v1}, Le/f/a/b/h/d0;->a(Le/f/a/b/h/c0;)V

    .line 25
    invoke-virtual {p0}, Le/f/a/b/h/f0;->j()V

    return-object p0
.end method

.method public final a(Ljava/util/concurrent/Executor;Le/f/a/b/h/c;)Le/f/a/b/h/g;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Le/f/a/b/h/c<",
            "TTResult;>;)",
            "Le/f/a/b/h/g<",
            "TTResult;>;"
        }
    .end annotation

    .line 18
    iget-object v0, p0, Le/f/a/b/h/f0;->b:Le/f/a/b/h/d0;

    new-instance v1, Le/f/a/b/h/u;

    invoke-direct {v1, p1, p2}, Le/f/a/b/h/u;-><init>(Ljava/util/concurrent/Executor;Le/f/a/b/h/c;)V

    invoke-virtual {v0, v1}, Le/f/a/b/h/d0;->a(Le/f/a/b/h/c0;)V

    .line 19
    invoke-virtual {p0}, Le/f/a/b/h/f0;->j()V

    return-object p0
.end method

.method public final a(Ljava/util/concurrent/Executor;Le/f/a/b/h/d;)Le/f/a/b/h/g;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Le/f/a/b/h/d;",
            ")",
            "Le/f/a/b/h/g<",
            "TTResult;>;"
        }
    .end annotation

    .line 16
    iget-object v0, p0, Le/f/a/b/h/f0;->b:Le/f/a/b/h/d0;

    new-instance v1, Le/f/a/b/h/w;

    invoke-direct {v1, p1, p2}, Le/f/a/b/h/w;-><init>(Ljava/util/concurrent/Executor;Le/f/a/b/h/d;)V

    invoke-virtual {v0, v1}, Le/f/a/b/h/d0;->a(Le/f/a/b/h/c0;)V

    .line 17
    invoke-virtual {p0}, Le/f/a/b/h/f0;->j()V

    return-object p0
.end method

.method public final a(Ljava/util/concurrent/Executor;Le/f/a/b/h/e;)Le/f/a/b/h/g;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Le/f/a/b/h/e<",
            "-TTResult;>;)",
            "Le/f/a/b/h/g<",
            "TTResult;>;"
        }
    .end annotation

    .line 14
    iget-object v0, p0, Le/f/a/b/h/f0;->b:Le/f/a/b/h/d0;

    new-instance v1, Le/f/a/b/h/y;

    invoke-direct {v1, p1, p2}, Le/f/a/b/h/y;-><init>(Ljava/util/concurrent/Executor;Le/f/a/b/h/e;)V

    invoke-virtual {v0, v1}, Le/f/a/b/h/d0;->a(Le/f/a/b/h/c0;)V

    .line 15
    invoke-virtual {p0}, Le/f/a/b/h/f0;->j()V

    return-object p0
.end method

.method public final a(Ljava/util/concurrent/Executor;Le/f/a/b/h/f;)Le/f/a/b/h/g;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TContinuationResult:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Executor;",
            "Le/f/a/b/h/f<",
            "TTResult;TTContinuationResult;>;)",
            "Le/f/a/b/h/g<",
            "TTContinuationResult;>;"
        }
    .end annotation

    .line 26
    new-instance v0, Le/f/a/b/h/f0;

    invoke-direct {v0}, Le/f/a/b/h/f0;-><init>()V

    .line 27
    iget-object v1, p0, Le/f/a/b/h/f0;->b:Le/f/a/b/h/d0;

    new-instance v2, Le/f/a/b/h/a0;

    invoke-direct {v2, p1, p2, v0}, Le/f/a/b/h/a0;-><init>(Ljava/util/concurrent/Executor;Le/f/a/b/h/f;Le/f/a/b/h/f0;)V

    invoke-virtual {v1, v2}, Le/f/a/b/h/d0;->a(Le/f/a/b/h/c0;)V

    .line 28
    invoke-virtual {p0}, Le/f/a/b/h/f0;->j()V

    return-object v0
.end method

.method public final a()Ljava/lang/Exception;
    .locals 2

    .line 10
    iget-object v0, p0, Le/f/a/b/h/f0;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 11
    :try_start_0
    iget-object v1, p0, Le/f/a/b/h/f0;->f:Ljava/lang/Exception;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 12
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final a(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<X:",
            "Ljava/lang/Throwable;",
            ">(",
            "Ljava/lang/Class<",
            "TX;>;)TTResult;^TX;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/f/a/b/h/f0;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Le/f/a/b/h/f0;->g()V

    .line 3
    invoke-virtual {p0}, Le/f/a/b/h/f0;->i()V

    .line 4
    iget-object v1, p0, Le/f/a/b/h/f0;->f:Ljava/lang/Exception;

    invoke-virtual {p1, v1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 5
    iget-object p1, p0, Le/f/a/b/h/f0;->f:Ljava/lang/Exception;

    if-nez p1, :cond_0

    .line 6
    iget-object p1, p0, Le/f/a/b/h/f0;->e:Ljava/lang/Object;

    monitor-exit v0

    return-object p1

    .line 7
    :cond_0
    new-instance p1, Lcom/google/android/gms/tasks/RuntimeExecutionException;

    iget-object v1, p0, Le/f/a/b/h/f0;->f:Ljava/lang/Exception;

    invoke-direct {p1, v1}, Lcom/google/android/gms/tasks/RuntimeExecutionException;-><init>(Ljava/lang/Throwable;)V

    throw p1

    .line 8
    :cond_1
    iget-object v1, p0, Le/f/a/b/h/f0;->f:Ljava/lang/Exception;

    invoke-virtual {p1, v1}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Throwable;

    throw p1

    :catchall_0
    move-exception p1

    .line 9
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final a(Ljava/lang/Exception;)V
    .locals 2

    const-string v0, "Exception must not be null"

    .line 37
    invoke-static {p1, v0}, Le/f/a/b/c/m/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    iget-object v0, p0, Le/f/a/b/h/f0;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 39
    :try_start_0
    invoke-virtual {p0}, Le/f/a/b/h/f0;->h()V

    const/4 v1, 0x1

    .line 40
    iput-boolean v1, p0, Le/f/a/b/h/f0;->c:Z

    .line 41
    iput-object p1, p0, Le/f/a/b/h/f0;->f:Ljava/lang/Exception;

    .line 42
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    iget-object p1, p0, Le/f/a/b/h/f0;->b:Le/f/a/b/h/d0;

    invoke-virtual {p1, p0}, Le/f/a/b/h/d0;->a(Le/f/a/b/h/g;)V

    return-void

    :catchall_0
    move-exception p1

    .line 44
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final a(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TTResult;)V"
        }
    .end annotation

    .line 30
    iget-object v0, p0, Le/f/a/b/h/f0;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 31
    :try_start_0
    invoke-virtual {p0}, Le/f/a/b/h/f0;->h()V

    const/4 v1, 0x1

    .line 32
    iput-boolean v1, p0, Le/f/a/b/h/f0;->c:Z

    .line 33
    iput-object p1, p0, Le/f/a/b/h/f0;->e:Ljava/lang/Object;

    .line 34
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    iget-object p1, p0, Le/f/a/b/h/f0;->b:Le/f/a/b/h/d0;

    invoke-virtual {p1, p0}, Le/f/a/b/h/d0;->a(Le/f/a/b/h/g;)V

    return-void

    :catchall_0
    move-exception p1

    .line 36
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final b(Ljava/util/concurrent/Executor;Le/f/a/b/h/a;)Le/f/a/b/h/g;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TContinuationResult:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Executor;",
            "Le/f/a/b/h/a<",
            "TTResult;",
            "Le/f/a/b/h/g<",
            "TTContinuationResult;>;>;)",
            "Le/f/a/b/h/g<",
            "TTContinuationResult;>;"
        }
    .end annotation

    .line 8
    new-instance v0, Le/f/a/b/h/f0;

    invoke-direct {v0}, Le/f/a/b/h/f0;-><init>()V

    .line 9
    iget-object v1, p0, Le/f/a/b/h/f0;->b:Le/f/a/b/h/d0;

    new-instance v2, Le/f/a/b/h/q;

    invoke-direct {v2, p1, p2, v0}, Le/f/a/b/h/q;-><init>(Ljava/util/concurrent/Executor;Le/f/a/b/h/a;Le/f/a/b/h/f0;)V

    invoke-virtual {v1, v2}, Le/f/a/b/h/d0;->a(Le/f/a/b/h/c0;)V

    .line 10
    invoke-virtual {p0}, Le/f/a/b/h/f0;->j()V

    return-object v0
.end method

.method public final b()Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TTResult;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/f/a/b/h/f0;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Le/f/a/b/h/f0;->g()V

    .line 3
    invoke-virtual {p0}, Le/f/a/b/h/f0;->i()V

    .line 4
    iget-object v1, p0, Le/f/a/b/h/f0;->f:Ljava/lang/Exception;

    if-nez v1, :cond_0

    .line 5
    iget-object v1, p0, Le/f/a/b/h/f0;->e:Ljava/lang/Object;

    monitor-exit v0

    return-object v1

    .line 6
    :cond_0
    new-instance v1, Lcom/google/android/gms/tasks/RuntimeExecutionException;

    iget-object v2, p0, Le/f/a/b/h/f0;->f:Ljava/lang/Exception;

    invoke-direct {v1, v2}, Lcom/google/android/gms/tasks/RuntimeExecutionException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :catchall_0
    move-exception v1

    .line 7
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final b(Ljava/lang/Exception;)Z
    .locals 2

    const-string v0, "Exception must not be null"

    .line 19
    invoke-static {p1, v0}, Le/f/a/b/c/m/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    iget-object v0, p0, Le/f/a/b/h/f0;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 21
    :try_start_0
    iget-boolean v1, p0, Le/f/a/b/h/f0;->c:Z

    if-eqz v1, :cond_0

    const/4 p1, 0x0

    .line 22
    monitor-exit v0

    return p1

    :cond_0
    const/4 v1, 0x1

    .line 23
    iput-boolean v1, p0, Le/f/a/b/h/f0;->c:Z

    .line 24
    iput-object p1, p0, Le/f/a/b/h/f0;->f:Ljava/lang/Exception;

    .line 25
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    iget-object p1, p0, Le/f/a/b/h/f0;->b:Le/f/a/b/h/d0;

    invoke-virtual {p1, p0}, Le/f/a/b/h/d0;->a(Le/f/a/b/h/g;)V

    return v1

    :catchall_0
    move-exception p1

    .line 27
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final b(Ljava/lang/Object;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TTResult;)Z"
        }
    .end annotation

    .line 11
    iget-object v0, p0, Le/f/a/b/h/f0;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 12
    :try_start_0
    iget-boolean v1, p0, Le/f/a/b/h/f0;->c:Z

    if-eqz v1, :cond_0

    const/4 p1, 0x0

    .line 13
    monitor-exit v0

    return p1

    :cond_0
    const/4 v1, 0x1

    .line 14
    iput-boolean v1, p0, Le/f/a/b/h/f0;->c:Z

    .line 15
    iput-object p1, p0, Le/f/a/b/h/f0;->e:Ljava/lang/Object;

    .line 16
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    iget-object p1, p0, Le/f/a/b/h/f0;->b:Le/f/a/b/h/d0;

    invoke-virtual {p1, p0}, Le/f/a/b/h/d0;->a(Le/f/a/b/h/g;)V

    return v1

    :catchall_0
    move-exception p1

    .line 18
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final c()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Le/f/a/b/h/f0;->d:Z

    return v0
.end method

.method public final d()Z
    .locals 2

    .line 1
    iget-object v0, p0, Le/f/a/b/h/f0;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-boolean v1, p0, Le/f/a/b/h/f0;->c:Z

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    .line 3
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final e()Z
    .locals 2

    .line 1
    iget-object v0, p0, Le/f/a/b/h/f0;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-boolean v1, p0, Le/f/a/b/h/f0;->c:Z

    if-eqz v1, :cond_0

    iget-boolean v1, p0, Le/f/a/b/h/f0;->d:Z

    if-nez v1, :cond_0

    iget-object v1, p0, Le/f/a/b/h/f0;->f:Ljava/lang/Exception;

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    .line 3
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final f()Z
    .locals 2

    .line 1
    iget-object v0, p0, Le/f/a/b/h/f0;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-boolean v1, p0, Le/f/a/b/h/f0;->c:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    .line 3
    monitor-exit v0

    return v1

    :cond_0
    const/4 v1, 0x1

    .line 4
    iput-boolean v1, p0, Le/f/a/b/h/f0;->c:Z

    .line 5
    iput-boolean v1, p0, Le/f/a/b/h/f0;->d:Z

    .line 6
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    iget-object v0, p0, Le/f/a/b/h/f0;->b:Le/f/a/b/h/d0;

    invoke-virtual {v0, p0}, Le/f/a/b/h/d0;->a(Le/f/a/b/h/g;)V

    return v1

    :catchall_0
    move-exception v1

    .line 8
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final g()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Le/f/a/b/h/f0;->c:Z

    const-string v1, "Task is not yet complete"

    invoke-static {v0, v1}, Le/f/a/b/c/m/h;->b(ZLjava/lang/Object;)V

    return-void
.end method

.method public final h()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Le/f/a/b/h/f0;->c:Z

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "Task is already complete"

    invoke-static {v0, v1}, Le/f/a/b/c/m/h;->b(ZLjava/lang/Object;)V

    return-void
.end method

.method public final i()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Le/f/a/b/h/f0;->d:Z

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    new-instance v0, Ljava/util/concurrent/CancellationException;

    const-string v1, "Task is already canceled."

    invoke-direct {v0, v1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final j()V
    .locals 2

    .line 1
    iget-object v0, p0, Le/f/a/b/h/f0;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-boolean v1, p0, Le/f/a/b/h/f0;->c:Z

    if-nez v1, :cond_0

    .line 3
    monitor-exit v0

    return-void

    .line 4
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    iget-object v0, p0, Le/f/a/b/h/f0;->b:Le/f/a/b/h/d0;

    invoke-virtual {v0, p0}, Le/f/a/b/h/d0;->a(Le/f/a/b/h/g;)V

    return-void

    :catchall_0
    move-exception v1

    .line 6
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
