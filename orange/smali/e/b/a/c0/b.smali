.class public final Le/b/a/c0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/b/a/c0/f;
.implements Le/b/a/c0/d;


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Le/b/a/c0/f;

.field public volatile c:Le/b/a/c0/d;

.field public volatile d:Le/b/a/c0/d;

.field public e:Le/b/a/c0/e;

.field public f:Le/b/a/c0/e;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Le/b/a/c0/f;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget-object v0, Le/b/a/c0/e;->e:Le/b/a/c0/e;

    iput-object v0, p0, Le/b/a/c0/b;->e:Le/b/a/c0/e;

    .line 3
    iput-object v0, p0, Le/b/a/c0/b;->f:Le/b/a/c0/e;

    .line 4
    iput-object p1, p0, Le/b/a/c0/b;->a:Ljava/lang/Object;

    .line 5
    iput-object p2, p0, Le/b/a/c0/b;->b:Le/b/a/c0/f;

    return-void
.end method


# virtual methods
.method public a(Le/b/a/c0/d;Le/b/a/c0/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le/b/a/c0/b;->c:Le/b/a/c0/d;

    .line 2
    iput-object p2, p0, Le/b/a/c0/b;->d:Le/b/a/c0/d;

    return-void
.end method

.method public a()Z
    .locals 2

    .line 6
    iget-object v0, p0, Le/b/a/c0/b;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 7
    :try_start_0
    iget-object v1, p0, Le/b/a/c0/b;->c:Le/b/a/c0/d;

    invoke-interface {v1}, Le/b/a/c0/d;->a()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Le/b/a/c0/b;->d:Le/b/a/c0/d;

    invoke-interface {v1}, Le/b/a/c0/d;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    .line 8
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public a(Le/b/a/c0/d;)Z
    .locals 1

    .line 3
    iget-object p1, p0, Le/b/a/c0/b;->a:Ljava/lang/Object;

    monitor-enter p1

    .line 4
    :try_start_0
    invoke-virtual {p0}, Le/b/a/c0/b;->i()Z

    move-result v0

    monitor-exit p1

    return v0

    :catchall_0
    move-exception v0

    .line 5
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public b()Le/b/a/c0/f;
    .locals 2

    .line 12
    iget-object v0, p0, Le/b/a/c0/b;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 13
    :try_start_0
    iget-object v1, p0, Le/b/a/c0/b;->b:Le/b/a/c0/f;

    if-eqz v1, :cond_0

    iget-object v1, p0, Le/b/a/c0/b;->b:Le/b/a/c0/f;

    invoke-interface {v1}, Le/b/a/c0/f;->b()Le/b/a/c0/f;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, p0

    :goto_0
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 14
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public b(Le/b/a/c0/d;)V
    .locals 2

    .line 1
    iget-object v0, p0, Le/b/a/c0/b;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Le/b/a/c0/b;->d:Le/b/a/c0/d;

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    .line 3
    sget-object p1, Le/b/a/c0/e;->g:Le/b/a/c0/e;

    iput-object p1, p0, Le/b/a/c0/b;->e:Le/b/a/c0/e;

    .line 4
    iget-object p1, p0, Le/b/a/c0/b;->f:Le/b/a/c0/e;

    sget-object v1, Le/b/a/c0/e;->c:Le/b/a/c0/e;

    if-eq p1, v1, :cond_0

    .line 5
    sget-object p1, Le/b/a/c0/e;->c:Le/b/a/c0/e;

    iput-object p1, p0, Le/b/a/c0/b;->f:Le/b/a/c0/e;

    .line 6
    iget-object p1, p0, Le/b/a/c0/b;->d:Le/b/a/c0/d;

    invoke-interface {p1}, Le/b/a/c0/d;->d()V

    .line 7
    :cond_0
    monitor-exit v0

    return-void

    .line 8
    :cond_1
    sget-object p1, Le/b/a/c0/e;->g:Le/b/a/c0/e;

    iput-object p1, p0, Le/b/a/c0/b;->f:Le/b/a/c0/e;

    .line 9
    iget-object p1, p0, Le/b/a/c0/b;->b:Le/b/a/c0/f;

    if-eqz p1, :cond_2

    .line 10
    iget-object p1, p0, Le/b/a/c0/b;->b:Le/b/a/c0/f;

    invoke-interface {p1, p0}, Le/b/a/c0/f;->b(Le/b/a/c0/d;)V

    .line 11
    :cond_2
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public c()V
    .locals 3

    .line 1
    iget-object v0, p0, Le/b/a/c0/b;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Le/b/a/c0/b;->e:Le/b/a/c0/e;

    sget-object v2, Le/b/a/c0/e;->c:Le/b/a/c0/e;

    if-ne v1, v2, :cond_0

    .line 3
    sget-object v1, Le/b/a/c0/e;->d:Le/b/a/c0/e;

    iput-object v1, p0, Le/b/a/c0/b;->e:Le/b/a/c0/e;

    .line 4
    iget-object v1, p0, Le/b/a/c0/b;->c:Le/b/a/c0/d;

    invoke-interface {v1}, Le/b/a/c0/d;->c()V

    .line 5
    :cond_0
    iget-object v1, p0, Le/b/a/c0/b;->f:Le/b/a/c0/e;

    sget-object v2, Le/b/a/c0/e;->c:Le/b/a/c0/e;

    if-ne v1, v2, :cond_1

    .line 6
    sget-object v1, Le/b/a/c0/e;->d:Le/b/a/c0/e;

    iput-object v1, p0, Le/b/a/c0/b;->f:Le/b/a/c0/e;

    .line 7
    iget-object v1, p0, Le/b/a/c0/b;->d:Le/b/a/c0/d;

    invoke-interface {v1}, Le/b/a/c0/d;->c()V

    .line 8
    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public c(Le/b/a/c0/d;)V
    .locals 2

    .line 9
    iget-object v0, p0, Le/b/a/c0/b;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 10
    :try_start_0
    iget-object v1, p0, Le/b/a/c0/b;->c:Le/b/a/c0/d;

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 11
    sget-object p1, Le/b/a/c0/e;->f:Le/b/a/c0/e;

    iput-object p1, p0, Le/b/a/c0/b;->e:Le/b/a/c0/e;

    goto :goto_0

    .line 12
    :cond_0
    iget-object v1, p0, Le/b/a/c0/b;->d:Le/b/a/c0/d;

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 13
    sget-object p1, Le/b/a/c0/e;->f:Le/b/a/c0/e;

    iput-object p1, p0, Le/b/a/c0/b;->f:Le/b/a/c0/e;

    .line 14
    :cond_1
    :goto_0
    iget-object p1, p0, Le/b/a/c0/b;->b:Le/b/a/c0/f;

    if-eqz p1, :cond_2

    .line 15
    iget-object p1, p0, Le/b/a/c0/b;->b:Le/b/a/c0/f;

    invoke-interface {p1, p0}, Le/b/a/c0/f;->c(Le/b/a/c0/d;)V

    .line 16
    :cond_2
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public clear()V
    .locals 3

    .line 1
    iget-object v0, p0, Le/b/a/c0/b;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    sget-object v1, Le/b/a/c0/e;->e:Le/b/a/c0/e;

    iput-object v1, p0, Le/b/a/c0/b;->e:Le/b/a/c0/e;

    .line 3
    iget-object v1, p0, Le/b/a/c0/b;->c:Le/b/a/c0/d;

    invoke-interface {v1}, Le/b/a/c0/d;->clear()V

    .line 4
    iget-object v1, p0, Le/b/a/c0/b;->f:Le/b/a/c0/e;

    sget-object v2, Le/b/a/c0/e;->e:Le/b/a/c0/e;

    if-eq v1, v2, :cond_0

    .line 5
    sget-object v1, Le/b/a/c0/e;->e:Le/b/a/c0/e;

    iput-object v1, p0, Le/b/a/c0/b;->f:Le/b/a/c0/e;

    .line 6
    iget-object v1, p0, Le/b/a/c0/b;->d:Le/b/a/c0/d;

    invoke-interface {v1}, Le/b/a/c0/d;->clear()V

    .line 7
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public d()V
    .locals 3

    .line 1
    iget-object v0, p0, Le/b/a/c0/b;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Le/b/a/c0/b;->e:Le/b/a/c0/e;

    sget-object v2, Le/b/a/c0/e;->c:Le/b/a/c0/e;

    if-eq v1, v2, :cond_0

    .line 3
    sget-object v1, Le/b/a/c0/e;->c:Le/b/a/c0/e;

    iput-object v1, p0, Le/b/a/c0/b;->e:Le/b/a/c0/e;

    .line 4
    iget-object v1, p0, Le/b/a/c0/b;->c:Le/b/a/c0/d;

    invoke-interface {v1}, Le/b/a/c0/d;->d()V

    .line 5
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public d(Le/b/a/c0/d;)Z
    .locals 3

    .line 6
    instance-of v0, p1, Le/b/a/c0/b;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 7
    check-cast p1, Le/b/a/c0/b;

    .line 8
    iget-object v0, p0, Le/b/a/c0/b;->c:Le/b/a/c0/d;

    iget-object v2, p1, Le/b/a/c0/b;->c:Le/b/a/c0/d;

    invoke-interface {v0, v2}, Le/b/a/c0/d;->d(Le/b/a/c0/d;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Le/b/a/c0/b;->d:Le/b/a/c0/d;

    iget-object p1, p1, Le/b/a/c0/b;->d:Le/b/a/c0/d;

    invoke-interface {v0, p1}, Le/b/a/c0/d;->d(Le/b/a/c0/d;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public e()Z
    .locals 3

    .line 1
    iget-object v0, p0, Le/b/a/c0/b;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Le/b/a/c0/b;->e:Le/b/a/c0/e;

    sget-object v2, Le/b/a/c0/e;->f:Le/b/a/c0/e;

    if-eq v1, v2, :cond_1

    iget-object v1, p0, Le/b/a/c0/b;->f:Le/b/a/c0/e;

    sget-object v2, Le/b/a/c0/e;->f:Le/b/a/c0/e;

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
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

.method public e(Le/b/a/c0/d;)Z
    .locals 2

    .line 4
    iget-object v0, p0, Le/b/a/c0/b;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 5
    :try_start_0
    invoke-virtual {p0}, Le/b/a/c0/b;->h()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0, p1}, Le/b/a/c0/b;->g(Le/b/a/c0/d;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    .line 6
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public f()Z
    .locals 3

    .line 1
    iget-object v0, p0, Le/b/a/c0/b;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Le/b/a/c0/b;->e:Le/b/a/c0/e;

    sget-object v2, Le/b/a/c0/e;->e:Le/b/a/c0/e;

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Le/b/a/c0/b;->f:Le/b/a/c0/e;

    sget-object v2, Le/b/a/c0/e;->e:Le/b/a/c0/e;

    if-ne v1, v2, :cond_0

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

.method public f(Le/b/a/c0/d;)Z
    .locals 2

    .line 4
    iget-object v0, p0, Le/b/a/c0/b;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 5
    :try_start_0
    invoke-virtual {p0}, Le/b/a/c0/b;->g()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Le/b/a/c0/b;->c:Le/b/a/c0/d;

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    .line 6
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final g()Z
    .locals 1

    .line 1
    iget-object v0, p0, Le/b/a/c0/b;->b:Le/b/a/c0/f;

    if-eqz v0, :cond_1

    invoke-interface {v0, p0}, Le/b/a/c0/f;->f(Le/b/a/c0/d;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public final g(Le/b/a/c0/d;)Z
    .locals 2

    .line 2
    iget-object v0, p0, Le/b/a/c0/b;->e:Le/b/a/c0/e;

    sget-object v1, Le/b/a/c0/e;->g:Le/b/a/c0/e;

    if-eq v0, v1, :cond_0

    .line 3
    iget-object v0, p0, Le/b/a/c0/b;->c:Le/b/a/c0/d;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    .line 4
    :cond_0
    iget-object v0, p0, Le/b/a/c0/b;->d:Le/b/a/c0/d;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Le/b/a/c0/b;->f:Le/b/a/c0/e;

    sget-object v0, Le/b/a/c0/e;->f:Le/b/a/c0/e;

    if-eq p1, v0, :cond_1

    sget-object v0, Le/b/a/c0/e;->g:Le/b/a/c0/e;

    if-ne p1, v0, :cond_2

    :cond_1
    const/4 p1, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final h()Z
    .locals 1

    .line 1
    iget-object v0, p0, Le/b/a/c0/b;->b:Le/b/a/c0/f;

    if-eqz v0, :cond_1

    invoke-interface {v0, p0}, Le/b/a/c0/f;->e(Le/b/a/c0/d;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public final i()Z
    .locals 1

    .line 1
    iget-object v0, p0, Le/b/a/c0/b;->b:Le/b/a/c0/f;

    if-eqz v0, :cond_1

    invoke-interface {v0, p0}, Le/b/a/c0/f;->a(Le/b/a/c0/d;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public isRunning()Z
    .locals 3

    .line 1
    iget-object v0, p0, Le/b/a/c0/b;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Le/b/a/c0/b;->e:Le/b/a/c0/e;

    sget-object v2, Le/b/a/c0/e;->c:Le/b/a/c0/e;

    if-eq v1, v2, :cond_1

    iget-object v1, p0, Le/b/a/c0/b;->f:Le/b/a/c0/e;

    sget-object v2, Le/b/a/c0/e;->c:Le/b/a/c0/e;

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
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
