.class public abstract Le/f/c/u/i;
.super Landroid/app/Service;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "UnwrappedWakefulBroadcastReceiver"
    }
.end annotation


# instance fields
.field public final b:Ljava/util/concurrent/ExecutorService;

.field public c:Landroid/os/Binder;

.field public final d:Ljava/lang/Object;

.field public e:I

.field public f:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 2
    invoke-static {}, Le/f/c/u/j;->b()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Le/f/c/u/i;->b:Ljava/util/concurrent/ExecutorService;

    .line 3
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Le/f/c/u/i;->d:Ljava/lang/Object;

    const/4 v0, 0x0

    .line 4
    iput v0, p0, Le/f/c/u/i;->f:I

    return-void
.end method

.method public static synthetic a(Le/f/c/u/i;Landroid/content/Intent;)Le/f/a/b/h/g;
    .locals 0

    .line 12
    invoke-virtual {p0, p1}, Le/f/c/u/i;->e(Landroid/content/Intent;)Le/f/a/b/h/g;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Landroid/content/Intent;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 1
    invoke-static {p1}, Le/f/c/q/a0;->a(Landroid/content/Intent;)V

    .line 2
    :cond_0
    iget-object p1, p0, Le/f/c/u/i;->d:Ljava/lang/Object;

    monitor-enter p1

    .line 3
    :try_start_0
    iget v0, p0, Le/f/c/u/i;->f:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Le/f/c/u/i;->f:I

    if-nez v0, :cond_1

    .line 4
    iget v0, p0, Le/f/c/u/i;->e:I

    invoke-virtual {p0, v0}, Le/f/c/u/i;->a(I)Z

    .line 5
    :cond_1
    monitor-exit p1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final synthetic a(Landroid/content/Intent;Le/f/a/b/h/g;)V
    .locals 0

    .line 7
    invoke-virtual {p0, p1}, Le/f/c/u/i;->a(Landroid/content/Intent;)V

    return-void
.end method

.method public final synthetic a(Landroid/content/Intent;Le/f/a/b/h/h;)V
    .locals 1

    const/4 v0, 0x0

    .line 8
    :try_start_0
    invoke-virtual {p0, p1}, Le/f/c/u/i;->c(Landroid/content/Intent;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    invoke-virtual {p2, v0}, Le/f/a/b/h/h;->a(Ljava/lang/Object;)V

    return-void

    :catchall_0
    move-exception p1

    .line 10
    invoke-virtual {p2, v0}, Le/f/a/b/h/h;->a(Ljava/lang/Object;)V

    .line 11
    throw p1
.end method

.method public a(I)Z
    .locals 0

    .line 6
    invoke-virtual {p0, p1}, Landroid/app/Service;->stopSelfResult(I)Z

    move-result p1

    return p1
.end method

.method public abstract b(Landroid/content/Intent;)Landroid/content/Intent;
.end method

.method public abstract c(Landroid/content/Intent;)V
.end method

.method public abstract d(Landroid/content/Intent;)Z
.end method

.method public final e(Landroid/content/Intent;)Le/f/a/b/h/g;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Intent;",
            ")",
            "Le/f/a/b/h/g<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Le/f/c/u/i;->d(Landroid/content/Intent;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    .line 2
    invoke-static {p1}, Le/f/a/b/h/n;->a(Ljava/lang/Object;)Le/f/a/b/h/g;

    move-result-object p1

    return-object p1

    .line 3
    :cond_0
    new-instance v0, Le/f/a/b/h/h;

    invoke-direct {v0}, Le/f/a/b/h/h;-><init>()V

    .line 4
    iget-object v1, p0, Le/f/c/u/i;->b:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Le/f/c/u/e;

    invoke-direct {v2, p0, p1, v0}, Le/f/c/u/e;-><init>(Le/f/c/u/i;Landroid/content/Intent;Le/f/a/b/h/h;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 5
    invoke-virtual {v0}, Le/f/a/b/h/h;->a()Le/f/a/b/h/g;

    move-result-object p1

    return-object p1
.end method

.method public final declared-synchronized onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1

    monitor-enter p0

    :try_start_0
    const-string p1, "EnhancedIntentService"

    const/4 v0, 0x3

    .line 1
    invoke-static {p1, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "EnhancedIntentService"

    const-string v0, "Service received bind request"

    .line 2
    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    :cond_0
    iget-object p1, p0, Le/f/c/u/i;->c:Landroid/os/Binder;

    if-nez p1, :cond_1

    .line 4
    new-instance p1, Le/f/c/q/d0;

    new-instance v0, Le/f/c/u/h;

    invoke-direct {v0, p0}, Le/f/c/u/h;-><init>(Le/f/c/u/i;)V

    invoke-direct {p1, v0}, Le/f/c/q/d0;-><init>(Le/f/c/q/c0;)V

    iput-object p1, p0, Le/f/c/u/i;->c:Landroid/os/Binder;

    .line 5
    :cond_1
    iget-object p1, p0, Le/f/c/u/i;->c:Landroid/os/Binder;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public onDestroy()V
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/c/u/i;->b:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 2
    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    return-void
.end method

.method public final onStartCommand(Landroid/content/Intent;II)I
    .locals 1

    .line 1
    iget-object p2, p0, Le/f/c/u/i;->d:Ljava/lang/Object;

    monitor-enter p2

    .line 2
    :try_start_0
    iput p3, p0, Le/f/c/u/i;->e:I

    .line 3
    iget p3, p0, Le/f/c/u/i;->f:I

    add-int/lit8 p3, p3, 0x1

    iput p3, p0, Le/f/c/u/i;->f:I

    .line 4
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    invoke-virtual {p0, p1}, Le/f/c/u/i;->b(Landroid/content/Intent;)Landroid/content/Intent;

    move-result-object p2

    const/4 p3, 0x2

    if-nez p2, :cond_0

    .line 6
    invoke-virtual {p0, p1}, Le/f/c/u/i;->a(Landroid/content/Intent;)V

    return p3

    .line 7
    :cond_0
    invoke-virtual {p0, p2}, Le/f/c/u/i;->e(Landroid/content/Intent;)Le/f/a/b/h/g;

    move-result-object p2

    .line 8
    invoke-virtual {p2}, Le/f/a/b/h/g;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 9
    invoke-virtual {p0, p1}, Le/f/c/u/i;->a(Landroid/content/Intent;)V

    return p3

    .line 10
    :cond_1
    sget-object p3, Le/f/c/u/f;->a:Ljava/util/concurrent/Executor;

    new-instance v0, Le/f/c/u/g;

    invoke-direct {v0, p0, p1}, Le/f/c/u/g;-><init>(Le/f/c/u/i;Landroid/content/Intent;)V

    invoke-virtual {p2, p3, v0}, Le/f/a/b/h/g;->a(Ljava/util/concurrent/Executor;Le/f/a/b/h/c;)Le/f/a/b/h/g;

    const/4 p1, 0x3

    return p1

    :catchall_0
    move-exception p1

    .line 11
    :try_start_1
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
