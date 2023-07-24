.class public Le/f/a/c/s/v;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static e:Le/f/a/c/s/v;


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Landroid/os/Handler;

.field public c:Le/f/a/c/s/u;

.field public d:Le/f/a/c/s/u;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Le/f/a/c/s/v;->a:Ljava/lang/Object;

    .line 3
    new-instance v0, Landroid/os/Handler;

    .line 4
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    new-instance v2, Le/f/a/c/s/s;

    invoke-direct {v2, p0}, Le/f/a/c/s/s;-><init>(Le/f/a/c/s/v;)V

    invoke-direct {v0, v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    iput-object v0, p0, Le/f/a/c/s/v;->b:Landroid/os/Handler;

    return-void
.end method

.method public static b()Le/f/a/c/s/v;
    .locals 1

    .line 1
    sget-object v0, Le/f/a/c/s/v;->e:Le/f/a/c/s/v;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Le/f/a/c/s/v;

    invoke-direct {v0}, Le/f/a/c/s/v;-><init>()V

    sput-object v0, Le/f/a/c/s/v;->e:Le/f/a/c/s/v;

    .line 3
    :cond_0
    sget-object v0, Le/f/a/c/s/v;->e:Le/f/a/c/s/v;

    return-object v0
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 25
    iget-object v0, p0, Le/f/a/c/s/v;->d:Le/f/a/c/s/u;

    if-eqz v0, :cond_1

    .line 26
    iput-object v0, p0, Le/f/a/c/s/v;->c:Le/f/a/c/s/u;

    const/4 v1, 0x0

    .line 27
    iput-object v1, p0, Le/f/a/c/s/v;->d:Le/f/a/c/s/u;

    .line 28
    iget-object v0, v0, Le/f/a/c/s/u;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/f/a/c/s/t;

    if-eqz v0, :cond_0

    .line 29
    invoke-interface {v0}, Le/f/a/c/s/t;->a()V

    goto :goto_0

    .line 30
    :cond_0
    iput-object v1, p0, Le/f/a/c/s/v;->c:Le/f/a/c/s/u;

    :cond_1
    :goto_0
    return-void
.end method

.method public a(ILe/f/a/c/s/t;)V
    .locals 2

    .line 1
    iget-object v0, p0, Le/f/a/c/s/v;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    invoke-virtual {p0, p2}, Le/f/a/c/s/v;->b(Le/f/a/c/s/t;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 3
    iget-object p2, p0, Le/f/a/c/s/v;->c:Le/f/a/c/s/u;

    iput p1, p2, Le/f/a/c/s/u;->b:I

    .line 4
    iget-object p1, p0, Le/f/a/c/s/v;->b:Landroid/os/Handler;

    iget-object p2, p0, Le/f/a/c/s/v;->c:Le/f/a/c/s/u;

    invoke-virtual {p1, p2}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 5
    iget-object p1, p0, Le/f/a/c/s/v;->c:Le/f/a/c/s/u;

    invoke-virtual {p0, p1}, Le/f/a/c/s/v;->b(Le/f/a/c/s/u;)V

    .line 6
    monitor-exit v0

    return-void

    .line 7
    :cond_0
    invoke-virtual {p0, p2}, Le/f/a/c/s/v;->c(Le/f/a/c/s/t;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 8
    iget-object p2, p0, Le/f/a/c/s/v;->d:Le/f/a/c/s/u;

    iput p1, p2, Le/f/a/c/s/u;->b:I

    goto :goto_0

    .line 9
    :cond_1
    new-instance v1, Le/f/a/c/s/u;

    invoke-direct {v1, p1, p2}, Le/f/a/c/s/u;-><init>(ILe/f/a/c/s/t;)V

    iput-object v1, p0, Le/f/a/c/s/v;->d:Le/f/a/c/s/u;

    .line 10
    :goto_0
    iget-object p1, p0, Le/f/a/c/s/v;->c:Le/f/a/c/s/u;

    if-eqz p1, :cond_2

    iget-object p1, p0, Le/f/a/c/s/v;->c:Le/f/a/c/s/u;

    const/4 p2, 0x4

    .line 11
    invoke-virtual {p0, p1, p2}, Le/f/a/c/s/v;->a(Le/f/a/c/s/u;I)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 12
    monitor-exit v0

    return-void

    :cond_2
    const/4 p1, 0x0

    .line 13
    iput-object p1, p0, Le/f/a/c/s/v;->c:Le/f/a/c/s/u;

    .line 14
    invoke-virtual {p0}, Le/f/a/c/s/v;->a()V

    .line 15
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public a(Le/f/a/c/s/t;I)V
    .locals 2

    .line 16
    iget-object v0, p0, Le/f/a/c/s/v;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 17
    :try_start_0
    invoke-virtual {p0, p1}, Le/f/a/c/s/v;->b(Le/f/a/c/s/t;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 18
    iget-object p1, p0, Le/f/a/c/s/v;->c:Le/f/a/c/s/u;

    invoke-virtual {p0, p1, p2}, Le/f/a/c/s/v;->a(Le/f/a/c/s/u;I)Z

    goto :goto_0

    .line 19
    :cond_0
    invoke-virtual {p0, p1}, Le/f/a/c/s/v;->c(Le/f/a/c/s/t;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 20
    iget-object p1, p0, Le/f/a/c/s/v;->d:Le/f/a/c/s/u;

    invoke-virtual {p0, p1, p2}, Le/f/a/c/s/v;->a(Le/f/a/c/s/u;I)Z

    .line 21
    :cond_1
    :goto_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public a(Le/f/a/c/s/u;)V
    .locals 2

    .line 34
    iget-object v0, p0, Le/f/a/c/s/v;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 35
    :try_start_0
    iget-object v1, p0, Le/f/a/c/s/v;->c:Le/f/a/c/s/u;

    if-eq v1, p1, :cond_0

    iget-object v1, p0, Le/f/a/c/s/v;->d:Le/f/a/c/s/u;

    if-ne v1, p1, :cond_1

    :cond_0
    const/4 v1, 0x2

    .line 36
    invoke-virtual {p0, p1, v1}, Le/f/a/c/s/v;->a(Le/f/a/c/s/u;I)Z

    .line 37
    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public a(Le/f/a/c/s/t;)Z
    .locals 2

    .line 22
    iget-object v0, p0, Le/f/a/c/s/v;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 23
    :try_start_0
    invoke-virtual {p0, p1}, Le/f/a/c/s/v;->b(Le/f/a/c/s/t;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {p0, p1}, Le/f/a/c/s/v;->c(Le/f/a/c/s/t;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    .line 24
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final a(Le/f/a/c/s/u;I)Z
    .locals 2

    .line 31
    iget-object v0, p1, Le/f/a/c/s/u;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/f/a/c/s/t;

    if-eqz v0, :cond_0

    .line 32
    iget-object v1, p0, Le/f/a/c/s/v;->b:Landroid/os/Handler;

    invoke-virtual {v1, p1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 33
    invoke-interface {v0, p2}, Le/f/a/c/s/t;->a(I)V

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final b(Le/f/a/c/s/u;)V
    .locals 4

    .line 5
    iget v0, p1, Le/f/a/c/s/u;->b:I

    const/4 v1, -0x2

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    const/16 v1, 0xabe

    if-lez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, -0x1

    if-ne v0, v2, :cond_2

    const/16 v0, 0x5dc

    goto :goto_0

    :cond_2
    const/16 v0, 0xabe

    .line 6
    :goto_0
    iget-object v1, p0, Le/f/a/c/s/v;->b:Landroid/os/Handler;

    invoke-virtual {v1, p1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 7
    iget-object v1, p0, Le/f/a/c/s/v;->b:Landroid/os/Handler;

    const/4 v2, 0x0

    invoke-static {v1, v2, p1}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    int-to-long v2, v0

    invoke-virtual {v1, p1, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    return-void
.end method

.method public final b(Le/f/a/c/s/t;)Z
    .locals 1

    .line 4
    iget-object v0, p0, Le/f/a/c/s/v;->c:Le/f/a/c/s/u;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Le/f/a/c/s/u;->a(Le/f/a/c/s/t;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final c(Le/f/a/c/s/t;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/a/c/s/v;->d:Le/f/a/c/s/u;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Le/f/a/c/s/u;->a(Le/f/a/c/s/t;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public d(Le/f/a/c/s/t;)V
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/a/c/s/v;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    invoke-virtual {p0, p1}, Le/f/a/c/s/v;->b(Le/f/a/c/s/t;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    .line 3
    iput-object p1, p0, Le/f/a/c/s/v;->c:Le/f/a/c/s/u;

    .line 4
    iget-object p1, p0, Le/f/a/c/s/v;->d:Le/f/a/c/s/u;

    if-eqz p1, :cond_0

    .line 5
    invoke-virtual {p0}, Le/f/a/c/s/v;->a()V

    .line 6
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

.method public e(Le/f/a/c/s/t;)V
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/a/c/s/v;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    invoke-virtual {p0, p1}, Le/f/a/c/s/v;->b(Le/f/a/c/s/t;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    iget-object p1, p0, Le/f/a/c/s/v;->c:Le/f/a/c/s/u;

    invoke-virtual {p0, p1}, Le/f/a/c/s/v;->b(Le/f/a/c/s/u;)V

    .line 4
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

.method public f(Le/f/a/c/s/t;)V
    .locals 2

    .line 1
    iget-object v0, p0, Le/f/a/c/s/v;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    invoke-virtual {p0, p1}, Le/f/a/c/s/v;->b(Le/f/a/c/s/t;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Le/f/a/c/s/v;->c:Le/f/a/c/s/u;

    iget-boolean p1, p1, Le/f/a/c/s/u;->c:Z

    if-nez p1, :cond_0

    .line 3
    iget-object p1, p0, Le/f/a/c/s/v;->c:Le/f/a/c/s/u;

    const/4 v1, 0x1

    iput-boolean v1, p1, Le/f/a/c/s/u;->c:Z

    .line 4
    iget-object p1, p0, Le/f/a/c/s/v;->b:Landroid/os/Handler;

    iget-object v1, p0, Le/f/a/c/s/v;->c:Le/f/a/c/s/u;

    invoke-virtual {p1, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 5
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

.method public g(Le/f/a/c/s/t;)V
    .locals 2

    .line 1
    iget-object v0, p0, Le/f/a/c/s/v;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    invoke-virtual {p0, p1}, Le/f/a/c/s/v;->b(Le/f/a/c/s/t;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Le/f/a/c/s/v;->c:Le/f/a/c/s/u;

    iget-boolean p1, p1, Le/f/a/c/s/u;->c:Z

    if-eqz p1, :cond_0

    .line 3
    iget-object p1, p0, Le/f/a/c/s/v;->c:Le/f/a/c/s/u;

    const/4 v1, 0x0

    iput-boolean v1, p1, Le/f/a/c/s/u;->c:Z

    .line 4
    iget-object p1, p0, Le/f/a/c/s/v;->c:Le/f/a/c/s/u;

    invoke-virtual {p0, p1}, Le/f/a/c/s/v;->b(Le/f/a/c/s/u;)V

    .line 5
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
