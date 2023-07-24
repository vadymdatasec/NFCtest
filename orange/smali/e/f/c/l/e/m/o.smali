.class public Le/f/c/l/e/m/o;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/concurrent/ExecutorService;

.field public b:Le/f/a/b/h/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/a/b/h/g<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Ljava/lang/Object;

.field public d:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/concurrent/ExecutorService;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Le/f/a/b/h/n;->a(Ljava/lang/Object;)Le/f/a/b/h/g;

    move-result-object v0

    iput-object v0, p0, Le/f/c/l/e/m/o;->b:Le/f/a/b/h/g;

    .line 3
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Le/f/c/l/e/m/o;->c:Ljava/lang/Object;

    .line 4
    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    iput-object v0, p0, Le/f/c/l/e/m/o;->d:Ljava/lang/ThreadLocal;

    .line 5
    iput-object p1, p0, Le/f/c/l/e/m/o;->a:Ljava/util/concurrent/ExecutorService;

    .line 6
    new-instance v0, Le/f/c/l/e/m/k;

    invoke-direct {v0, p0}, Le/f/c/l/e/m/k;-><init>(Le/f/c/l/e/m/o;)V

    invoke-interface {p1, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    return-void
.end method

.method public static synthetic a(Le/f/c/l/e/m/o;)Ljava/lang/ThreadLocal;
    .locals 0

    .line 1
    iget-object p0, p0, Le/f/c/l/e/m/o;->d:Ljava/lang/ThreadLocal;

    return-object p0
.end method


# virtual methods
.method public final a(Ljava/util/concurrent/Callable;)Le/f/a/b/h/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Callable<",
            "TT;>;)",
            "Le/f/a/b/h/a<",
            "Ljava/lang/Void;",
            "TT;>;"
        }
    .end annotation

    .line 5
    new-instance v0, Le/f/c/l/e/m/m;

    invoke-direct {v0, p0, p1}, Le/f/c/l/e/m/m;-><init>(Le/f/c/l/e/m/o;Ljava/util/concurrent/Callable;)V

    return-object v0
.end method

.method public final a(Le/f/a/b/h/g;)Le/f/a/b/h/g;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Le/f/a/b/h/g<",
            "TT;>;)",
            "Le/f/a/b/h/g<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .line 6
    iget-object v0, p0, Le/f/c/l/e/m/o;->a:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Le/f/c/l/e/m/n;

    invoke-direct {v1, p0}, Le/f/c/l/e/m/n;-><init>(Le/f/c/l/e/m/o;)V

    invoke-virtual {p1, v0, v1}, Le/f/a/b/h/g;->a(Ljava/util/concurrent/Executor;Le/f/a/b/h/a;)Le/f/a/b/h/g;

    move-result-object p1

    return-object p1
.end method

.method public a(Ljava/lang/Runnable;)Le/f/a/b/h/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Runnable;",
            ")",
            "Le/f/a/b/h/g<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .line 4
    new-instance v0, Le/f/c/l/e/m/l;

    invoke-direct {v0, p0, p1}, Le/f/c/l/e/m/l;-><init>(Le/f/c/l/e/m/o;Ljava/lang/Runnable;)V

    invoke-virtual {p0, v0}, Le/f/c/l/e/m/o;->b(Ljava/util/concurrent/Callable;)Le/f/a/b/h/g;

    move-result-object p1

    return-object p1
.end method

.method public a()V
    .locals 2

    .line 2
    invoke-virtual {p0}, Le/f/c/l/e/m/o;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 3
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Not running on background worker thread as intended."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public b(Ljava/util/concurrent/Callable;)Le/f/a/b/h/g;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Callable<",
            "TT;>;)",
            "Le/f/a/b/h/g<",
            "TT;>;"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Le/f/c/l/e/m/o;->c:Ljava/lang/Object;

    monitor-enter v0

    .line 3
    :try_start_0
    iget-object v1, p0, Le/f/c/l/e/m/o;->b:Le/f/a/b/h/g;

    iget-object v2, p0, Le/f/c/l/e/m/o;->a:Ljava/util/concurrent/ExecutorService;

    invoke-virtual {p0, p1}, Le/f/c/l/e/m/o;->a(Ljava/util/concurrent/Callable;)Le/f/a/b/h/a;

    move-result-object p1

    invoke-virtual {v1, v2, p1}, Le/f/a/b/h/g;->a(Ljava/util/concurrent/Executor;Le/f/a/b/h/a;)Le/f/a/b/h/g;

    move-result-object p1

    .line 4
    invoke-virtual {p0, p1}, Le/f/c/l/e/m/o;->a(Le/f/a/b/h/g;)Le/f/a/b/h/g;

    move-result-object v1

    iput-object v1, p0, Le/f/c/l/e/m/o;->b:Le/f/a/b/h/g;

    .line 5
    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    .line 6
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public b()Ljava/util/concurrent/Executor;
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/c/l/e/m/o;->a:Ljava/util/concurrent/ExecutorService;

    return-object v0
.end method

.method public c(Ljava/util/concurrent/Callable;)Le/f/a/b/h/g;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Callable<",
            "Le/f/a/b/h/g<",
            "TT;>;>;)",
            "Le/f/a/b/h/g<",
            "TT;>;"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Le/f/c/l/e/m/o;->c:Ljava/lang/Object;

    monitor-enter v0

    .line 3
    :try_start_0
    iget-object v1, p0, Le/f/c/l/e/m/o;->b:Le/f/a/b/h/g;

    iget-object v2, p0, Le/f/c/l/e/m/o;->a:Ljava/util/concurrent/ExecutorService;

    invoke-virtual {p0, p1}, Le/f/c/l/e/m/o;->a(Ljava/util/concurrent/Callable;)Le/f/a/b/h/a;

    move-result-object p1

    invoke-virtual {v1, v2, p1}, Le/f/a/b/h/g;->b(Ljava/util/concurrent/Executor;Le/f/a/b/h/a;)Le/f/a/b/h/g;

    move-result-object p1

    .line 4
    invoke-virtual {p0, p1}, Le/f/c/l/e/m/o;->a(Le/f/a/b/h/g;)Le/f/a/b/h/g;

    move-result-object v1

    iput-object v1, p0, Le/f/c/l/e/m/o;->b:Le/f/a/b/h/g;

    .line 5
    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    .line 6
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final c()Z
    .locals 2

    .line 1
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iget-object v1, p0, Le/f/c/l/e/m/o;->d:Ljava/lang/ThreadLocal;

    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method
