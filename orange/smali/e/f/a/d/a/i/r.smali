.class public final Le/f/a/d/a/i/r;
.super Le/f/a/d/a/i/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<ResultT:",
        "Ljava/lang/Object;",
        ">",
        "Le/f/a/d/a/i/d<",
        "TResultT;>;"
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Le/f/a/d/a/i/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/a/d/a/i/n<",
            "TResultT;>;"
        }
    .end annotation
.end field

.field public c:Z

.field public d:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TResultT;"
        }
    .end annotation
.end field

.field public e:Ljava/lang/Exception;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Le/f/a/d/a/i/d;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Le/f/a/d/a/i/r;->a:Ljava/lang/Object;

    new-instance v0, Le/f/a/d/a/i/n;

    invoke-direct {v0}, Le/f/a/d/a/i/n;-><init>()V

    iput-object v0, p0, Le/f/a/d/a/i/r;->b:Le/f/a/d/a/i/n;

    return-void
.end method


# virtual methods
.method public final a(Le/f/a/d/a/i/a;)Le/f/a/d/a/i/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/a/d/a/i/a<",
            "TResultT;>;)",
            "Le/f/a/d/a/i/d<",
            "TResultT;>;"
        }
    .end annotation

    sget-object v0, Le/f/a/d/a/i/e;->a:Ljava/util/concurrent/Executor;

    iget-object v1, p0, Le/f/a/d/a/i/r;->b:Le/f/a/d/a/i/n;

    new-instance v2, Le/f/a/d/a/i/h;

    invoke-direct {v2, v0, p1}, Le/f/a/d/a/i/h;-><init>(Ljava/util/concurrent/Executor;Le/f/a/d/a/i/a;)V

    invoke-virtual {v1, v2}, Le/f/a/d/a/i/n;->a(Le/f/a/d/a/i/m;)V

    invoke-virtual {p0}, Le/f/a/d/a/i/r;->g()V

    return-object p0
.end method

.method public final a(Le/f/a/d/a/i/c;)Le/f/a/d/a/i/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/a/d/a/i/c<",
            "-TResultT;>;)",
            "Le/f/a/d/a/i/d<",
            "TResultT;>;"
        }
    .end annotation

    sget-object v0, Le/f/a/d/a/i/e;->a:Ljava/util/concurrent/Executor;

    invoke-virtual {p0, v0, p1}, Le/f/a/d/a/i/r;->a(Ljava/util/concurrent/Executor;Le/f/a/d/a/i/c;)Le/f/a/d/a/i/d;

    return-object p0
.end method

.method public final a(Ljava/util/concurrent/Executor;Le/f/a/d/a/i/b;)Le/f/a/d/a/i/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Le/f/a/d/a/i/b;",
            ")",
            "Le/f/a/d/a/i/d<",
            "TResultT;>;"
        }
    .end annotation

    iget-object v0, p0, Le/f/a/d/a/i/r;->b:Le/f/a/d/a/i/n;

    new-instance v1, Le/f/a/d/a/i/j;

    invoke-direct {v1, p1, p2}, Le/f/a/d/a/i/j;-><init>(Ljava/util/concurrent/Executor;Le/f/a/d/a/i/b;)V

    invoke-virtual {v0, v1}, Le/f/a/d/a/i/n;->a(Le/f/a/d/a/i/m;)V

    invoke-virtual {p0}, Le/f/a/d/a/i/r;->g()V

    return-object p0
.end method

.method public final a(Ljava/util/concurrent/Executor;Le/f/a/d/a/i/c;)Le/f/a/d/a/i/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Le/f/a/d/a/i/c<",
            "-TResultT;>;)",
            "Le/f/a/d/a/i/d<",
            "TResultT;>;"
        }
    .end annotation

    iget-object v0, p0, Le/f/a/d/a/i/r;->b:Le/f/a/d/a/i/n;

    new-instance v1, Le/f/a/d/a/i/l;

    invoke-direct {v1, p1, p2}, Le/f/a/d/a/i/l;-><init>(Ljava/util/concurrent/Executor;Le/f/a/d/a/i/c;)V

    invoke-virtual {v0, v1}, Le/f/a/d/a/i/n;->a(Le/f/a/d/a/i/m;)V

    invoke-virtual {p0}, Le/f/a/d/a/i/r;->g()V

    return-object p0
.end method

.method public final a()Ljava/lang/Exception;
    .locals 2

    iget-object v0, p0, Le/f/a/d/a/i/r;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Le/f/a/d/a/i/r;->e:Ljava/lang/Exception;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final a(Ljava/lang/Exception;)V
    .locals 2

    iget-object v0, p0, Le/f/a/d/a/i/r;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, Le/f/a/d/a/i/r;->f()V

    const/4 v1, 0x1

    iput-boolean v1, p0, Le/f/a/d/a/i/r;->c:Z

    iput-object p1, p0, Le/f/a/d/a/i/r;->e:Ljava/lang/Exception;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Le/f/a/d/a/i/r;->b:Le/f/a/d/a/i/n;

    invoke-virtual {p1, p0}, Le/f/a/d/a/i/n;->a(Le/f/a/d/a/i/d;)V

    return-void

    :catchall_0
    move-exception p1

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
            "(TResultT;)V"
        }
    .end annotation

    iget-object v0, p0, Le/f/a/d/a/i/r;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, Le/f/a/d/a/i/r;->f()V

    const/4 v1, 0x1

    iput-boolean v1, p0, Le/f/a/d/a/i/r;->c:Z

    iput-object p1, p0, Le/f/a/d/a/i/r;->d:Ljava/lang/Object;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Le/f/a/d/a/i/r;->b:Le/f/a/d/a/i/n;

    invoke-virtual {p1, p0}, Le/f/a/d/a/i/n;->a(Le/f/a/d/a/i/d;)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final b()Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TResultT;"
        }
    .end annotation

    iget-object v0, p0, Le/f/a/d/a/i/r;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, Le/f/a/d/a/i/r;->e()V

    iget-object v1, p0, Le/f/a/d/a/i/r;->e:Ljava/lang/Exception;

    if-nez v1, :cond_0

    iget-object v1, p0, Le/f/a/d/a/i/r;->d:Ljava/lang/Object;

    monitor-exit v0

    return-object v1

    :cond_0
    new-instance v2, Lcom/google/android/play/core/tasks/RuntimeExecutionException;

    invoke-direct {v2, v1}, Lcom/google/android/play/core/tasks/RuntimeExecutionException;-><init>(Ljava/lang/Throwable;)V

    throw v2

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final b(Ljava/lang/Exception;)Z
    .locals 2

    iget-object v0, p0, Le/f/a/d/a/i/r;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Le/f/a/d/a/i/r;->c:Z

    if-eqz v1, :cond_0

    monitor-exit v0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 v1, 0x1

    iput-boolean v1, p0, Le/f/a/d/a/i/r;->c:Z

    iput-object p1, p0, Le/f/a/d/a/i/r;->e:Ljava/lang/Exception;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Le/f/a/d/a/i/r;->b:Le/f/a/d/a/i/n;

    invoke-virtual {p1, p0}, Le/f/a/d/a/i/n;->a(Le/f/a/d/a/i/d;)V

    return v1

    :catchall_0
    move-exception p1

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
            "(TResultT;)Z"
        }
    .end annotation

    iget-object v0, p0, Le/f/a/d/a/i/r;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Le/f/a/d/a/i/r;->c:Z

    if-eqz v1, :cond_0

    monitor-exit v0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 v1, 0x1

    iput-boolean v1, p0, Le/f/a/d/a/i/r;->c:Z

    iput-object p1, p0, Le/f/a/d/a/i/r;->d:Ljava/lang/Object;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Le/f/a/d/a/i/r;->b:Le/f/a/d/a/i/n;

    invoke-virtual {p1, p0}, Le/f/a/d/a/i/n;->a(Le/f/a/d/a/i/d;)V

    return v1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final c()Z
    .locals 2

    iget-object v0, p0, Le/f/a/d/a/i/r;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Le/f/a/d/a/i/r;->c:Z

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final d()Z
    .locals 3

    iget-object v0, p0, Le/f/a/d/a/i/r;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Le/f/a/d/a/i/r;->c:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    iget-object v1, p0, Le/f/a/d/a/i/r;->e:Ljava/lang/Exception;

    if-nez v1, :cond_0

    const/4 v2, 0x1

    :cond_0
    monitor-exit v0

    return v2

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final e()V
    .locals 2

    iget-boolean v0, p0, Le/f/a/d/a/i/r;->c:Z

    const-string v1, "Task is not yet complete"

    invoke-static {v0, v1}, Le/f/a/d/a/e/l;->a(ZLjava/lang/Object;)V

    return-void
.end method

.method public final f()V
    .locals 2

    iget-boolean v0, p0, Le/f/a/d/a/i/r;->c:Z

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "Task is already complete"

    invoke-static {v0, v1}, Le/f/a/d/a/e/l;->a(ZLjava/lang/Object;)V

    return-void
.end method

.method public final g()V
    .locals 2

    iget-object v0, p0, Le/f/a/d/a/i/r;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Le/f/a/d/a/i/r;->c:Z

    if-nez v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Le/f/a/d/a/i/r;->b:Le/f/a/d/a/i/n;

    invoke-virtual {v0, p0}, Le/f/a/d/a/i/n;->a(Le/f/a/d/a/i/d;)V

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
