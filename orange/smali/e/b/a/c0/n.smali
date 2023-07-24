.class public Le/b/a/c0/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/b/a/c0/f;
.implements Le/b/a/c0/d;


# instance fields
.field public final a:Le/b/a/c0/f;

.field public final b:Ljava/lang/Object;

.field public volatile c:Le/b/a/c0/d;

.field public volatile d:Le/b/a/c0/d;

.field public e:Le/b/a/c0/e;

.field public f:Le/b/a/c0/e;

.field public g:Z


# direct methods
.method public constructor <init>(Ljava/lang/Object;Le/b/a/c0/f;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget-object v0, Le/b/a/c0/e;->e:Le/b/a/c0/e;

    iput-object v0, p0, Le/b/a/c0/n;->e:Le/b/a/c0/e;

    .line 3
    iput-object v0, p0, Le/b/a/c0/n;->f:Le/b/a/c0/e;

    .line 4
    iput-object p1, p0, Le/b/a/c0/n;->b:Ljava/lang/Object;

    .line 5
    iput-object p2, p0, Le/b/a/c0/n;->a:Le/b/a/c0/f;

    return-void
.end method


# virtual methods
.method public a(Le/b/a/c0/d;Le/b/a/c0/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le/b/a/c0/n;->c:Le/b/a/c0/d;

    .line 2
    iput-object p2, p0, Le/b/a/c0/n;->d:Le/b/a/c0/d;

    return-void
.end method

.method public a()Z
    .locals 2

    .line 6
    iget-object v0, p0, Le/b/a/c0/n;->b:Ljava/lang/Object;

    monitor-enter v0

    .line 7
    :try_start_0
    iget-object v1, p0, Le/b/a/c0/n;->d:Le/b/a/c0/d;

    invoke-interface {v1}, Le/b/a/c0/d;->a()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Le/b/a/c0/n;->c:Le/b/a/c0/d;

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
    .locals 2

    .line 3
    iget-object v0, p0, Le/b/a/c0/n;->b:Ljava/lang/Object;

    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {p0}, Le/b/a/c0/n;->i()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Le/b/a/c0/n;->c:Le/b/a/c0/d;

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Le/b/a/c0/n;->e:Le/b/a/c0/e;

    sget-object v1, Le/b/a/c0/e;->f:Le/b/a/c0/e;

    if-eq p1, v1, :cond_1

    :cond_0
    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    .line 5
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public b()Le/b/a/c0/f;
    .locals 2

    .line 9
    iget-object v0, p0, Le/b/a/c0/n;->b:Ljava/lang/Object;

    monitor-enter v0

    .line 10
    :try_start_0
    iget-object v1, p0, Le/b/a/c0/n;->a:Le/b/a/c0/f;

    if-eqz v1, :cond_0

    iget-object v1, p0, Le/b/a/c0/n;->a:Le/b/a/c0/f;

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

    .line 11
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public b(Le/b/a/c0/d;)V
    .locals 2

    .line 1
    iget-object v0, p0, Le/b/a/c0/n;->b:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Le/b/a/c0/n;->c:Le/b/a/c0/d;

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 3
    sget-object p1, Le/b/a/c0/e;->g:Le/b/a/c0/e;

    iput-object p1, p0, Le/b/a/c0/n;->f:Le/b/a/c0/e;

    .line 4
    monitor-exit v0

    return-void

    .line 5
    :cond_0
    sget-object p1, Le/b/a/c0/e;->g:Le/b/a/c0/e;

    iput-object p1, p0, Le/b/a/c0/n;->e:Le/b/a/c0/e;

    .line 6
    iget-object p1, p0, Le/b/a/c0/n;->a:Le/b/a/c0/f;

    if-eqz p1, :cond_1

    .line 7
    iget-object p1, p0, Le/b/a/c0/n;->a:Le/b/a/c0/f;

    invoke-interface {p1, p0}, Le/b/a/c0/f;->b(Le/b/a/c0/d;)V

    .line 8
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

.method public c()V
    .locals 2

    .line 11
    iget-object v0, p0, Le/b/a/c0/n;->b:Ljava/lang/Object;

    monitor-enter v0

    .line 12
    :try_start_0
    iget-object v1, p0, Le/b/a/c0/n;->f:Le/b/a/c0/e;

    invoke-virtual {v1}, Le/b/a/c0/e;->a()Z

    move-result v1

    if-nez v1, :cond_0

    .line 13
    sget-object v1, Le/b/a/c0/e;->d:Le/b/a/c0/e;

    iput-object v1, p0, Le/b/a/c0/n;->f:Le/b/a/c0/e;

    .line 14
    iget-object v1, p0, Le/b/a/c0/n;->d:Le/b/a/c0/d;

    invoke-interface {v1}, Le/b/a/c0/d;->c()V

    .line 15
    :cond_0
    iget-object v1, p0, Le/b/a/c0/n;->e:Le/b/a/c0/e;

    invoke-virtual {v1}, Le/b/a/c0/e;->a()Z

    move-result v1

    if-nez v1, :cond_1

    .line 16
    sget-object v1, Le/b/a/c0/e;->d:Le/b/a/c0/e;

    iput-object v1, p0, Le/b/a/c0/n;->e:Le/b/a/c0/e;

    .line 17
    iget-object v1, p0, Le/b/a/c0/n;->c:Le/b/a/c0/d;

    invoke-interface {v1}, Le/b/a/c0/d;->c()V

    .line 18
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

    .line 1
    iget-object v0, p0, Le/b/a/c0/n;->b:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Le/b/a/c0/n;->d:Le/b/a/c0/d;

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    sget-object p1, Le/b/a/c0/e;->f:Le/b/a/c0/e;

    iput-object p1, p0, Le/b/a/c0/n;->f:Le/b/a/c0/e;

    .line 4
    monitor-exit v0

    return-void

    .line 5
    :cond_0
    sget-object p1, Le/b/a/c0/e;->f:Le/b/a/c0/e;

    iput-object p1, p0, Le/b/a/c0/n;->e:Le/b/a/c0/e;

    .line 6
    iget-object p1, p0, Le/b/a/c0/n;->a:Le/b/a/c0/f;

    if-eqz p1, :cond_1

    .line 7
    iget-object p1, p0, Le/b/a/c0/n;->a:Le/b/a/c0/f;

    invoke-interface {p1, p0}, Le/b/a/c0/f;->c(Le/b/a/c0/d;)V

    .line 8
    :cond_1
    iget-object p1, p0, Le/b/a/c0/n;->f:Le/b/a/c0/e;

    invoke-virtual {p1}, Le/b/a/c0/e;->a()Z

    move-result p1

    if-nez p1, :cond_2

    .line 9
    iget-object p1, p0, Le/b/a/c0/n;->d:Le/b/a/c0/d;

    invoke-interface {p1}, Le/b/a/c0/d;->clear()V

    .line 10
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
    .locals 2

    .line 1
    iget-object v0, p0, Le/b/a/c0/n;->b:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x0

    .line 2
    :try_start_0
    iput-boolean v1, p0, Le/b/a/c0/n;->g:Z

    .line 3
    sget-object v1, Le/b/a/c0/e;->e:Le/b/a/c0/e;

    iput-object v1, p0, Le/b/a/c0/n;->e:Le/b/a/c0/e;

    .line 4
    sget-object v1, Le/b/a/c0/e;->e:Le/b/a/c0/e;

    iput-object v1, p0, Le/b/a/c0/n;->f:Le/b/a/c0/e;

    .line 5
    iget-object v1, p0, Le/b/a/c0/n;->d:Le/b/a/c0/d;

    invoke-interface {v1}, Le/b/a/c0/d;->clear()V

    .line 6
    iget-object v1, p0, Le/b/a/c0/n;->c:Le/b/a/c0/d;

    invoke-interface {v1}, Le/b/a/c0/d;->clear()V

    .line 7
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
    .locals 4

    .line 1
    iget-object v0, p0, Le/b/a/c0/n;->b:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x1

    .line 2
    :try_start_0
    iput-boolean v1, p0, Le/b/a/c0/n;->g:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 v1, 0x0

    .line 3
    :try_start_1
    iget-object v2, p0, Le/b/a/c0/n;->e:Le/b/a/c0/e;

    sget-object v3, Le/b/a/c0/e;->f:Le/b/a/c0/e;

    if-eq v2, v3, :cond_0

    iget-object v2, p0, Le/b/a/c0/n;->f:Le/b/a/c0/e;

    sget-object v3, Le/b/a/c0/e;->c:Le/b/a/c0/e;

    if-eq v2, v3, :cond_0

    .line 4
    sget-object v2, Le/b/a/c0/e;->c:Le/b/a/c0/e;

    iput-object v2, p0, Le/b/a/c0/n;->f:Le/b/a/c0/e;

    .line 5
    iget-object v2, p0, Le/b/a/c0/n;->d:Le/b/a/c0/d;

    invoke-interface {v2}, Le/b/a/c0/d;->d()V

    .line 6
    :cond_0
    iget-boolean v2, p0, Le/b/a/c0/n;->g:Z

    if-eqz v2, :cond_1

    iget-object v2, p0, Le/b/a/c0/n;->e:Le/b/a/c0/e;

    sget-object v3, Le/b/a/c0/e;->c:Le/b/a/c0/e;

    if-eq v2, v3, :cond_1

    .line 7
    sget-object v2, Le/b/a/c0/e;->c:Le/b/a/c0/e;

    iput-object v2, p0, Le/b/a/c0/n;->e:Le/b/a/c0/e;

    .line 8
    iget-object v2, p0, Le/b/a/c0/n;->c:Le/b/a/c0/d;

    invoke-interface {v2}, Le/b/a/c0/d;->d()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 9
    :cond_1
    :try_start_2
    iput-boolean v1, p0, Le/b/a/c0/n;->g:Z

    .line 10
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v2

    .line 11
    iput-boolean v1, p0, Le/b/a/c0/n;->g:Z

    .line 12
    throw v2

    :catchall_1
    move-exception v1

    .line 13
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v1
.end method

.method public d(Le/b/a/c0/d;)Z
    .locals 3

    .line 14
    instance-of v0, p1, Le/b/a/c0/n;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    .line 15
    check-cast p1, Le/b/a/c0/n;

    .line 16
    iget-object v0, p0, Le/b/a/c0/n;->c:Le/b/a/c0/d;

    if-nez v0, :cond_0

    iget-object v0, p1, Le/b/a/c0/n;->c:Le/b/a/c0/d;

    if-nez v0, :cond_2

    goto :goto_0

    :cond_0
    iget-object v0, p0, Le/b/a/c0/n;->c:Le/b/a/c0/d;

    iget-object v2, p1, Le/b/a/c0/n;->c:Le/b/a/c0/d;

    invoke-interface {v0, v2}, Le/b/a/c0/d;->d(Le/b/a/c0/d;)Z

    move-result v0

    if-eqz v0, :cond_2

    :goto_0
    iget-object v0, p0, Le/b/a/c0/n;->d:Le/b/a/c0/d;

    if-nez v0, :cond_1

    iget-object p1, p1, Le/b/a/c0/n;->d:Le/b/a/c0/d;

    if-nez p1, :cond_2

    goto :goto_1

    :cond_1
    iget-object v0, p0, Le/b/a/c0/n;->d:Le/b/a/c0/d;

    iget-object p1, p1, Le/b/a/c0/n;->d:Le/b/a/c0/d;

    .line 17
    invoke-interface {v0, p1}, Le/b/a/c0/d;->d(Le/b/a/c0/d;)Z

    move-result p1

    if-eqz p1, :cond_2

    :goto_1
    const/4 v1, 0x1

    :cond_2
    return v1
.end method

.method public e()Z
    .locals 3

    .line 4
    iget-object v0, p0, Le/b/a/c0/n;->b:Ljava/lang/Object;

    monitor-enter v0

    .line 5
    :try_start_0
    iget-object v1, p0, Le/b/a/c0/n;->e:Le/b/a/c0/e;

    sget-object v2, Le/b/a/c0/e;->f:Le/b/a/c0/e;

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

    .line 6
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public e(Le/b/a/c0/d;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Le/b/a/c0/n;->b:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Le/b/a/c0/n;->h()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Le/b/a/c0/n;->c:Le/b/a/c0/d;

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Le/b/a/c0/n;->a()Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    .line 3
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public f()Z
    .locals 3

    .line 4
    iget-object v0, p0, Le/b/a/c0/n;->b:Ljava/lang/Object;

    monitor-enter v0

    .line 5
    :try_start_0
    iget-object v1, p0, Le/b/a/c0/n;->e:Le/b/a/c0/e;

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

    .line 6
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public f(Le/b/a/c0/d;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Le/b/a/c0/n;->b:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Le/b/a/c0/n;->g()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Le/b/a/c0/n;->c:Le/b/a/c0/d;

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Le/b/a/c0/n;->e:Le/b/a/c0/e;

    sget-object v1, Le/b/a/c0/e;->d:Le/b/a/c0/e;

    if-eq p1, v1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    .line 3
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final g()Z
    .locals 1

    .line 1
    iget-object v0, p0, Le/b/a/c0/n;->a:Le/b/a/c0/f;

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

.method public final h()Z
    .locals 1

    .line 1
    iget-object v0, p0, Le/b/a/c0/n;->a:Le/b/a/c0/f;

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
    iget-object v0, p0, Le/b/a/c0/n;->a:Le/b/a/c0/f;

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
    iget-object v0, p0, Le/b/a/c0/n;->b:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v1, p0, Le/b/a/c0/n;->e:Le/b/a/c0/e;

    sget-object v2, Le/b/a/c0/e;->c:Le/b/a/c0/e;

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
