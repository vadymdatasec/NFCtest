.class public Le/a/a/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/a/a/n;


# instance fields
.field public final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Le/a/a/p<",
            "*>;>;>;"
        }
    .end annotation
.end field

.field public final b:Le/a/a/w;

.field public final c:Le/a/a/s;

.field public final d:Le/a/a/d;

.field public final e:Ljava/util/concurrent/BlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/BlockingQueue<",
            "Le/a/a/p<",
            "*>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Le/a/a/d;Ljava/util/concurrent/BlockingQueue;Le/a/a/w;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/a/a/d;",
            "Ljava/util/concurrent/BlockingQueue<",
            "Le/a/a/p<",
            "*>;>;",
            "Le/a/a/w;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Le/a/a/b0;->a:Ljava/util/Map;

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Le/a/a/b0;->c:Le/a/a/s;

    .line 4
    iput-object p3, p0, Le/a/a/b0;->b:Le/a/a/w;

    .line 5
    iput-object p1, p0, Le/a/a/b0;->d:Le/a/a/d;

    .line 6
    iput-object p2, p0, Le/a/a/b0;->e:Ljava/util/concurrent/BlockingQueue;

    return-void
.end method


# virtual methods
.method public declared-synchronized a(Le/a/a/p;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/a/a/p<",
            "*>;)V"
        }
    .end annotation

    monitor-enter p0

    .line 12
    :try_start_0
    invoke-virtual {p1}, Le/a/a/p;->d()Ljava/lang/String;

    move-result-object p1

    .line 13
    iget-object v0, p0, Le/a/a/b0;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-eqz v0, :cond_2

    .line 14
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    .line 15
    sget-boolean v1, Le/a/a/a0;->a:Z

    if-eqz v1, :cond_0

    .line 16
    invoke-interface {v0}, Ljava/util/List;->size()I

    :cond_0
    const/4 v1, 0x0

    .line 17
    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le/a/a/p;

    .line 18
    iget-object v2, p0, Le/a/a/b0;->a:Ljava/util/Map;

    invoke-interface {v2, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    invoke-virtual {v1, p0}, Le/a/a/p;->a(Le/a/a/n;)V

    .line 20
    iget-object p1, p0, Le/a/a/b0;->c:Le/a/a/s;

    if-eqz p1, :cond_1

    .line 21
    iget-object p1, p0, Le/a/a/b0;->c:Le/a/a/s;

    invoke-virtual {p1, v1}, Le/a/a/s;->d(Le/a/a/p;)V

    goto :goto_0

    .line 22
    :cond_1
    iget-object p1, p0, Le/a/a/b0;->d:Le/a/a/d;

    if-eqz p1, :cond_2

    iget-object p1, p0, Le/a/a/b0;->e:Ljava/util/concurrent/BlockingQueue;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_2

    .line 23
    :try_start_1
    iget-object p1, p0, Le/a/a/b0;->e:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {p1, v1}, Ljava/util/concurrent/BlockingQueue;->put(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 24
    :try_start_2
    invoke-virtual {p1}, Ljava/lang/InterruptedException;->toString()Ljava/lang/String;

    .line 25
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    .line 26
    iget-object p1, p0, Le/a/a/b0;->d:Le/a/a/d;

    invoke-virtual {p1}, Le/a/a/d;->b()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 27
    :cond_2
    :goto_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public a(Le/a/a/p;Le/a/a/v;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/a/a/p<",
            "*>;",
            "Le/a/a/v<",
            "*>;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p2, Le/a/a/v;->b:Le/a/a/a;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Le/a/a/a;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 2
    :cond_0
    invoke-virtual {p1}, Le/a/a/p;->d()Ljava/lang/String;

    move-result-object p1

    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-object v0, p0, Le/a/a/b0;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    .line 5
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_2

    .line 6
    sget-boolean v0, Le/a/a/a0;->a:Z

    if-eqz v0, :cond_1

    .line 7
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 8
    :cond_1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/a/a/p;

    .line 9
    iget-object v1, p0, Le/a/a/b0;->b:Le/a/a/w;

    invoke-interface {v1, v0, p2}, Le/a/a/w;->a(Le/a/a/p;Le/a/a/v;)V

    goto :goto_0

    :cond_2
    return-void

    :catchall_0
    move-exception p1

    .line 10
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    .line 11
    :cond_3
    :goto_1
    invoke-virtual {p0, p1}, Le/a/a/b0;->a(Le/a/a/p;)V

    return-void
.end method

.method public declared-synchronized b(Le/a/a/p;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/a/a/p<",
            "*>;)Z"
        }
    .end annotation

    monitor-enter p0

    .line 1
    :try_start_0
    invoke-virtual {p1}, Le/a/a/p;->d()Ljava/lang/String;

    move-result-object v0

    .line 2
    iget-object v1, p0, Le/a/a/b0;->a:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 3
    iget-object v1, p0, Le/a/a/b0;->a:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    :cond_0
    const-string v2, "waiting-for-response"

    .line 5
    invoke-virtual {p1, v2}, Le/a/a/p;->a(Ljava/lang/String;)V

    .line 6
    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 7
    iget-object p1, p0, Le/a/a/b0;->a:Ljava/util/Map;

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    sget-boolean p1, Le/a/a/a0;->a:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p1, 0x1

    .line 9
    monitor-exit p0

    return p1

    .line 10
    :cond_1
    :try_start_1
    iget-object v1, p0, Le/a/a/b0;->a:Ljava/util/Map;

    const/4 v2, 0x0

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    invoke-virtual {p1, p0}, Le/a/a/p;->a(Le/a/a/n;)V

    .line 12
    sget-boolean p1, Le/a/a/a0;->a:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 p1, 0x0

    .line 13
    monitor-exit p0

    return p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
