.class public Lk/e1/k/w;
.super Lk/e1/b;
.source "SourceFile"

# interfaces
.implements Lk/e1/k/z;


# instance fields
.field public final c:Lk/e1/k/a0;

.field public final synthetic d:Lk/e1/k/x;


# direct methods
.method public constructor <init>(Lk/e1/k/x;Lk/e1/k/a0;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lk/e1/k/w;->d:Lk/e1/k/x;

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    .line 2
    iget-object p1, p1, Lk/e1/k/x;->e:Ljava/lang/String;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const-string p1, "OkHttp %s"

    invoke-direct {p0, p1, v0}, Lk/e1/b;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3
    iput-object p2, p0, Lk/e1/k/w;->c:Lk/e1/k/a0;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public a(IIIZ)V
    .locals 0

    return-void
.end method

.method public a(IILjava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/util/List<",
            "Lk/e1/k/c;",
            ">;)V"
        }
    .end annotation

    .line 71
    iget-object p1, p0, Lk/e1/k/w;->d:Lk/e1/k/x;

    invoke-virtual {p1, p2, p3}, Lk/e1/k/x;->a(ILjava/util/List;)V

    return-void
.end method

.method public a(IJ)V
    .locals 3

    if-nez p1, :cond_0

    .line 63
    iget-object v0, p0, Lk/e1/k/w;->d:Lk/e1/k/x;

    monitor-enter v0

    .line 64
    :try_start_0
    iget-object p1, p0, Lk/e1/k/w;->d:Lk/e1/k/x;

    iget-wide v1, p1, Lk/e1/k/x;->n:J

    add-long/2addr v1, p2

    iput-wide v1, p1, Lk/e1/k/x;->n:J

    .line 65
    iget-object p1, p0, Lk/e1/k/w;->d:Lk/e1/k/x;

    invoke-virtual {p1}, Ljava/lang/Object;->notifyAll()V

    .line 66
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    .line 67
    :cond_0
    iget-object v0, p0, Lk/e1/k/w;->d:Lk/e1/k/x;

    invoke-virtual {v0, p1}, Lk/e1/k/x;->a(I)Lk/e1/k/e0;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 68
    monitor-enter p1

    .line 69
    :try_start_1
    invoke-virtual {p1, p2, p3}, Lk/e1/k/e0;->a(J)V

    .line 70
    monitor-exit p1

    goto :goto_0

    :catchall_1
    move-exception p2

    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    throw p2

    :cond_1
    :goto_0
    return-void
.end method

.method public a(ILk/e1/k/a;)V
    .locals 1

    .line 26
    iget-object v0, p0, Lk/e1/k/w;->d:Lk/e1/k/x;

    invoke-virtual {v0, p1}, Lk/e1/k/x;->b(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 27
    iget-object v0, p0, Lk/e1/k/w;->d:Lk/e1/k/x;

    invoke-virtual {v0, p1, p2}, Lk/e1/k/x;->a(ILk/e1/k/a;)V

    return-void

    .line 28
    :cond_0
    iget-object v0, p0, Lk/e1/k/w;->d:Lk/e1/k/x;

    invoke-virtual {v0, p1}, Lk/e1/k/x;->c(I)Lk/e1/k/e0;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 29
    invoke-virtual {p1, p2}, Lk/e1/k/e0;->d(Lk/e1/k/a;)V

    :cond_1
    return-void
.end method

.method public a(ILk/e1/k/a;Ll/i;)V
    .locals 3

    .line 53
    invoke-virtual {p3}, Ll/i;->e()I

    .line 54
    iget-object p2, p0, Lk/e1/k/w;->d:Lk/e1/k/x;

    monitor-enter p2

    .line 55
    :try_start_0
    iget-object p3, p0, Lk/e1/k/w;->d:Lk/e1/k/x;

    iget-object p3, p3, Lk/e1/k/x;->d:Ljava/util/Map;

    invoke-interface {p3}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p3

    iget-object v0, p0, Lk/e1/k/w;->d:Lk/e1/k/x;

    iget-object v0, v0, Lk/e1/k/x;->d:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    new-array v0, v0, [Lk/e1/k/e0;

    invoke-interface {p3, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p3

    check-cast p3, [Lk/e1/k/e0;

    .line 56
    iget-object v0, p0, Lk/e1/k/w;->d:Lk/e1/k/x;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lk/e1/k/x;->h:Z

    .line 57
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    array-length p2, p3

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p2, :cond_1

    aget-object v1, p3, v0

    .line 59
    invoke-virtual {v1}, Lk/e1/k/e0;->c()I

    move-result v2

    if-le v2, p1, :cond_0

    invoke-virtual {v1}, Lk/e1/k/e0;->f()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 60
    sget-object v2, Lk/e1/k/a;->g:Lk/e1/k/a;

    invoke-virtual {v1, v2}, Lk/e1/k/e0;->d(Lk/e1/k/a;)V

    .line 61
    iget-object v2, p0, Lk/e1/k/w;->d:Lk/e1/k/x;

    invoke-virtual {v1}, Lk/e1/k/e0;->c()I

    move-result v1

    invoke-virtual {v2, v1}, Lk/e1/k/x;->c(I)Lk/e1/k/e0;

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void

    :catchall_0
    move-exception p1

    .line 62
    :try_start_1
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final a(Lk/e1/k/k0;)V
    .locals 6

    .line 47
    :try_start_0
    iget-object v0, p0, Lk/e1/k/w;->d:Lk/e1/k/x;

    invoke-static {v0}, Lk/e1/k/x;->b(Lk/e1/k/x;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    new-instance v1, Lk/e1/k/v;

    const-string v2, "OkHttp %s ACK Settings"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    iget-object v5, p0, Lk/e1/k/w;->d:Lk/e1/k/x;

    iget-object v5, v5, Lk/e1/k/x;->e:Ljava/lang/String;

    aput-object v5, v3, v4

    invoke-direct {v1, p0, v2, v3, p1}, Lk/e1/k/v;-><init>(Lk/e1/k/w;Ljava/lang/String;[Ljava/lang/Object;Lk/e1/k/k0;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ScheduledExecutorService;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public a(ZII)V
    .locals 3

    if-eqz p1, :cond_0

    .line 48
    iget-object p1, p0, Lk/e1/k/w;->d:Lk/e1/k/x;

    monitor-enter p1

    .line 49
    :try_start_0
    iget-object p2, p0, Lk/e1/k/w;->d:Lk/e1/k/x;

    const/4 p3, 0x0

    invoke-static {p2, p3}, Lk/e1/k/x;->a(Lk/e1/k/x;Z)Z

    .line 50
    iget-object p2, p0, Lk/e1/k/w;->d:Lk/e1/k/x;

    invoke-virtual {p2}, Ljava/lang/Object;->notifyAll()V

    .line 51
    monitor-exit p1

    goto :goto_0

    :catchall_0
    move-exception p2

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2

    .line 52
    :cond_0
    :try_start_1
    iget-object p1, p0, Lk/e1/k/w;->d:Lk/e1/k/x;

    invoke-static {p1}, Lk/e1/k/x;->b(Lk/e1/k/x;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object p1

    new-instance v0, Lk/e1/k/s;

    iget-object v1, p0, Lk/e1/k/w;->d:Lk/e1/k/x;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, p2, p3}, Lk/e1/k/s;-><init>(Lk/e1/k/x;ZII)V

    invoke-interface {p1, v0}, Ljava/util/concurrent/ScheduledExecutorService;->execute(Ljava/lang/Runnable;)V
    :try_end_1
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    :goto_0
    return-void
.end method

.method public a(ZIILjava/util/List;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZII",
            "Ljava/util/List<",
            "Lk/e1/k/c;",
            ">;)V"
        }
    .end annotation

    .line 9
    iget-object p3, p0, Lk/e1/k/w;->d:Lk/e1/k/x;

    invoke-virtual {p3, p2}, Lk/e1/k/x;->b(I)Z

    move-result p3

    if-eqz p3, :cond_0

    .line 10
    iget-object p3, p0, Lk/e1/k/w;->d:Lk/e1/k/x;

    invoke-virtual {p3, p2, p4, p1}, Lk/e1/k/x;->b(ILjava/util/List;Z)V

    return-void

    .line 11
    :cond_0
    iget-object p3, p0, Lk/e1/k/w;->d:Lk/e1/k/x;

    monitor-enter p3

    .line 12
    :try_start_0
    iget-object v0, p0, Lk/e1/k/w;->d:Lk/e1/k/x;

    invoke-virtual {v0, p2}, Lk/e1/k/x;->a(I)Lk/e1/k/e0;

    move-result-object v0

    if-nez v0, :cond_4

    .line 13
    iget-object v0, p0, Lk/e1/k/w;->d:Lk/e1/k/x;

    iget-boolean v0, v0, Lk/e1/k/x;->h:Z

    if-eqz v0, :cond_1

    monitor-exit p3

    return-void

    .line 14
    :cond_1
    iget-object v0, p0, Lk/e1/k/w;->d:Lk/e1/k/x;

    iget v0, v0, Lk/e1/k/x;->f:I

    if-gt p2, v0, :cond_2

    monitor-exit p3

    return-void

    .line 15
    :cond_2
    rem-int/lit8 v0, p2, 0x2

    iget-object v1, p0, Lk/e1/k/w;->d:Lk/e1/k/x;

    iget v1, v1, Lk/e1/k/x;->g:I

    const/4 v2, 0x2

    rem-int/2addr v1, v2

    if-ne v0, v1, :cond_3

    monitor-exit p3

    return-void

    .line 16
    :cond_3
    invoke-static {p4}, Lk/e1/e;->b(Ljava/util/List;)Lk/d0;

    move-result-object v8

    .line 17
    new-instance p4, Lk/e1/k/e0;

    iget-object v5, p0, Lk/e1/k/w;->d:Lk/e1/k/x;

    const/4 v6, 0x0

    move-object v3, p4

    move v4, p2

    move v7, p1

    invoke-direct/range {v3 .. v8}, Lk/e1/k/e0;-><init>(ILk/e1/k/x;ZZLk/d0;)V

    .line 18
    iget-object p1, p0, Lk/e1/k/w;->d:Lk/e1/k/x;

    iput p2, p1, Lk/e1/k/x;->f:I

    .line 19
    iget-object p1, p0, Lk/e1/k/w;->d:Lk/e1/k/x;

    iget-object p1, p1, Lk/e1/k/x;->d:Ljava/util/Map;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0, p4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    invoke-static {}, Lk/e1/k/x;->o()Ljava/util/concurrent/ExecutorService;

    move-result-object p1

    new-instance v0, Lk/e1/k/t;

    const-string v1, "OkHttp %s stream %d"

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-object v4, p0, Lk/e1/k/w;->d:Lk/e1/k/x;

    iget-object v4, v4, Lk/e1/k/x;->e:Ljava/lang/String;

    aput-object v4, v2, v3

    const/4 v3, 0x1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, v2, v3

    invoke-direct {v0, p0, v1, v2, p4}, Lk/e1/k/t;-><init>(Lk/e1/k/w;Ljava/lang/String;[Ljava/lang/Object;Lk/e1/k/e0;)V

    invoke-interface {p1, v0}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 21
    monitor-exit p3

    return-void

    .line 22
    :cond_4
    monitor-exit p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    invoke-virtual {v0, p4}, Lk/e1/k/e0;->a(Ljava/util/List;)V

    if-eqz p1, :cond_5

    .line 24
    invoke-virtual {v0}, Lk/e1/k/e0;->i()V

    :cond_5
    return-void

    :catchall_0
    move-exception p1

    .line 25
    :try_start_1
    monitor-exit p3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public a(ZILl/h;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lk/e1/k/w;->d:Lk/e1/k/x;

    invoke-virtual {v0, p2}, Lk/e1/k/x;->b(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lk/e1/k/w;->d:Lk/e1/k/x;

    invoke-virtual {v0, p2, p3, p4, p1}, Lk/e1/k/x;->a(ILl/h;IZ)V

    return-void

    .line 3
    :cond_0
    iget-object v0, p0, Lk/e1/k/w;->d:Lk/e1/k/x;

    invoke-virtual {v0, p2}, Lk/e1/k/x;->a(I)Lk/e1/k/e0;

    move-result-object v0

    if-nez v0, :cond_1

    .line 4
    iget-object p1, p0, Lk/e1/k/w;->d:Lk/e1/k/x;

    sget-object v0, Lk/e1/k/a;->d:Lk/e1/k/a;

    invoke-virtual {p1, p2, v0}, Lk/e1/k/x;->c(ILk/e1/k/a;)V

    .line 5
    iget-object p1, p0, Lk/e1/k/w;->d:Lk/e1/k/x;

    int-to-long v0, p4

    invoke-virtual {p1, v0, v1}, Lk/e1/k/x;->g(J)V

    .line 6
    invoke-interface {p3, v0, v1}, Ll/h;->skip(J)V

    return-void

    .line 7
    :cond_1
    invoke-virtual {v0, p3, p4}, Lk/e1/k/e0;->a(Ll/h;I)V

    if-eqz p1, :cond_2

    .line 8
    invoke-virtual {v0}, Lk/e1/k/e0;->i()V

    :cond_2
    return-void
.end method

.method public a(ZLk/e1/k/k0;)V
    .locals 10

    .line 30
    iget-object v0, p0, Lk/e1/k/w;->d:Lk/e1/k/x;

    monitor-enter v0

    .line 31
    :try_start_0
    iget-object v1, p0, Lk/e1/k/w;->d:Lk/e1/k/x;

    iget-object v1, v1, Lk/e1/k/x;->p:Lk/e1/k/k0;

    invoke-virtual {v1}, Lk/e1/k/k0;->c()I

    move-result v1

    if-eqz p1, :cond_0

    .line 32
    iget-object p1, p0, Lk/e1/k/w;->d:Lk/e1/k/x;

    iget-object p1, p1, Lk/e1/k/x;->p:Lk/e1/k/k0;

    invoke-virtual {p1}, Lk/e1/k/k0;->a()V

    .line 33
    :cond_0
    iget-object p1, p0, Lk/e1/k/w;->d:Lk/e1/k/x;

    iget-object p1, p1, Lk/e1/k/x;->p:Lk/e1/k/k0;

    invoke-virtual {p1, p2}, Lk/e1/k/k0;->a(Lk/e1/k/k0;)V

    .line 34
    invoke-virtual {p0, p2}, Lk/e1/k/w;->a(Lk/e1/k/k0;)V

    .line 35
    iget-object p1, p0, Lk/e1/k/w;->d:Lk/e1/k/x;

    iget-object p1, p1, Lk/e1/k/x;->p:Lk/e1/k/k0;

    invoke-virtual {p1}, Lk/e1/k/k0;->c()I

    move-result p1

    const/4 p2, -0x1

    const-wide/16 v2, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eq p1, p2, :cond_2

    if-eq p1, v1, :cond_2

    sub-int/2addr p1, v1

    int-to-long p1, p1

    .line 36
    iget-object v1, p0, Lk/e1/k/w;->d:Lk/e1/k/x;

    iget-boolean v1, v1, Lk/e1/k/x;->q:Z

    if-nez v1, :cond_1

    .line 37
    iget-object v1, p0, Lk/e1/k/w;->d:Lk/e1/k/x;

    iput-boolean v4, v1, Lk/e1/k/x;->q:Z

    .line 38
    :cond_1
    iget-object v1, p0, Lk/e1/k/w;->d:Lk/e1/k/x;

    iget-object v1, v1, Lk/e1/k/x;->d:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_3

    .line 39
    iget-object v1, p0, Lk/e1/k/w;->d:Lk/e1/k/x;

    iget-object v1, v1, Lk/e1/k/x;->d:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    iget-object v5, p0, Lk/e1/k/w;->d:Lk/e1/k/x;

    iget-object v5, v5, Lk/e1/k/x;->d:Ljava/util/Map;

    invoke-interface {v5}, Ljava/util/Map;->size()I

    move-result v5

    new-array v5, v5, [Lk/e1/k/e0;

    invoke-interface {v1, v5}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, [Lk/e1/k/e0;

    goto :goto_0

    :cond_2
    move-wide p1, v2

    .line 40
    :cond_3
    :goto_0
    invoke-static {}, Lk/e1/k/x;->o()Ljava/util/concurrent/ExecutorService;

    move-result-object v1

    new-instance v6, Lk/e1/k/u;

    const-string v7, "OkHttp %s settings"

    new-array v4, v4, [Ljava/lang/Object;

    iget-object v8, p0, Lk/e1/k/w;->d:Lk/e1/k/x;

    iget-object v8, v8, Lk/e1/k/x;->e:Ljava/lang/String;

    const/4 v9, 0x0

    aput-object v8, v4, v9

    invoke-direct {v6, p0, v7, v4}, Lk/e1/k/u;-><init>(Lk/e1/k/w;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-interface {v1, v6}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 41
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v5, :cond_4

    cmp-long v0, p1, v2

    if-eqz v0, :cond_4

    .line 42
    array-length v0, v5

    :goto_1
    if-ge v9, v0, :cond_4

    aget-object v1, v5, v9

    .line 43
    monitor-enter v1

    .line 44
    :try_start_1
    invoke-virtual {v1, p1, p2}, Lk/e1/k/e0;->a(J)V

    .line 45
    monitor-exit v1

    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    :catchall_0
    move-exception p1

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_4
    return-void

    :catchall_1
    move-exception p1

    .line 46
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p1
.end method

.method public b()V
    .locals 4

    .line 1
    sget-object v0, Lk/e1/k/a;->e:Lk/e1/k/a;

    .line 2
    :try_start_0
    iget-object v1, p0, Lk/e1/k/w;->c:Lk/e1/k/a0;

    invoke-virtual {v1, p0}, Lk/e1/k/a0;->a(Lk/e1/k/z;)V

    .line 3
    :goto_0
    iget-object v1, p0, Lk/e1/k/w;->c:Lk/e1/k/a0;

    const/4 v2, 0x0

    invoke-virtual {v1, v2, p0}, Lk/e1/k/a0;->a(ZLk/e1/k/z;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    sget-object v1, Lk/e1/k/a;->c:Lk/e1/k/a;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    :try_start_1
    sget-object v0, Lk/e1/k/a;->h:Lk/e1/k/a;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 6
    :try_start_2
    iget-object v2, p0, Lk/e1/k/w;->d:Lk/e1/k/x;
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_1

    :catchall_0
    move-exception v2

    move-object v1, v0

    goto :goto_2

    :catch_0
    move-object v1, v0

    .line 7
    :catch_1
    :try_start_3
    sget-object v1, Lk/e1/k/a;->d:Lk/e1/k/a;

    .line 8
    sget-object v0, Lk/e1/k/a;->d:Lk/e1/k/a;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 9
    :try_start_4
    iget-object v2, p0, Lk/e1/k/w;->d:Lk/e1/k/x;

    :goto_1
    invoke-virtual {v2, v1, v0}, Lk/e1/k/x;->a(Lk/e1/k/a;Lk/e1/k/a;)V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2

    .line 10
    :catch_2
    iget-object v0, p0, Lk/e1/k/w;->c:Lk/e1/k/a0;

    invoke-static {v0}, Lk/e1/e;->a(Ljava/io/Closeable;)V

    return-void

    :catchall_1
    move-exception v2

    .line 11
    :goto_2
    :try_start_5
    iget-object v3, p0, Lk/e1/k/w;->d:Lk/e1/k/x;

    invoke-virtual {v3, v1, v0}, Lk/e1/k/x;->a(Lk/e1/k/a;Lk/e1/k/a;)V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3

    .line 12
    :catch_3
    iget-object v0, p0, Lk/e1/k/w;->c:Lk/e1/k/a0;

    invoke-static {v0}, Lk/e1/e;->a(Ljava/io/Closeable;)V

    throw v2
.end method
