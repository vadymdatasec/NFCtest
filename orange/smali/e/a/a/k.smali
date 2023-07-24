.class public Le/a/a/k;
.super Ljava/lang/Thread;
.source "SourceFile"


# instance fields
.field public final b:Ljava/util/concurrent/BlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/BlockingQueue<",
            "Le/a/a/p<",
            "*>;>;"
        }
    .end annotation
.end field

.field public final c:Le/a/a/j;

.field public final d:Le/a/a/b;

.field public final e:Le/a/a/w;

.field public volatile f:Z


# direct methods
.method public constructor <init>(Ljava/util/concurrent/BlockingQueue;Le/a/a/j;Le/a/a/b;Le/a/a/w;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/BlockingQueue<",
            "Le/a/a/p<",
            "*>;>;",
            "Le/a/a/j;",
            "Le/a/a/b;",
            "Le/a/a/w;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Le/a/a/k;->f:Z

    .line 3
    iput-object p1, p0, Le/a/a/k;->b:Ljava/util/concurrent/BlockingQueue;

    .line 4
    iput-object p2, p0, Le/a/a/k;->c:Le/a/a/j;

    .line 5
    iput-object p3, p0, Le/a/a/k;->d:Le/a/a/b;

    .line 6
    iput-object p4, p0, Le/a/a/k;->e:Le/a/a/w;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .line 3
    iget-object v0, p0, Le/a/a/k;->b:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0}, Ljava/util/concurrent/BlockingQueue;->take()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/a/a/p;

    .line 4
    invoke-virtual {p0, v0}, Le/a/a/k;->b(Le/a/a/p;)V

    return-void
.end method

.method public final a(Le/a/a/p;)V
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0xe
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/a/a/p<",
            "*>;)V"
        }
    .end annotation

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xe

    if-lt v0, v1, :cond_0

    .line 2
    invoke-virtual {p1}, Le/a/a/p;->o()I

    move-result p1

    invoke-static {p1}, Landroid/net/TrafficStats;->setThreadStatsTag(I)V

    :cond_0
    return-void
.end method

.method public final a(Le/a/a/p;Lcom/android/volley/VolleyError;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/a/a/p<",
            "*>;",
            "Lcom/android/volley/VolleyError;",
            ")V"
        }
    .end annotation

    .line 5
    invoke-virtual {p1, p2}, Le/a/a/p;->b(Lcom/android/volley/VolleyError;)Lcom/android/volley/VolleyError;

    .line 6
    iget-object v0, p0, Le/a/a/k;->e:Le/a/a/w;

    invoke-interface {v0, p1, p2}, Le/a/a/w;->a(Le/a/a/p;Lcom/android/volley/VolleyError;)V

    return-void
.end method

.method public b()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Le/a/a/k;->f:Z

    .line 2
    invoke-virtual {p0}, Ljava/lang/Thread;->interrupt()V

    return-void
.end method

.method public b(Le/a/a/p;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/a/a/p<",
            "*>;)V"
        }
    .end annotation

    .line 3
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    const/4 v2, 0x3

    .line 4
    invoke-virtual {p1, v2}, Le/a/a/p;->a(I)V

    const/4 v2, 0x4

    :try_start_0
    const-string v3, "network-queue-take"

    .line 5
    invoke-virtual {p1, v3}, Le/a/a/p;->a(Ljava/lang/String;)V

    .line 6
    invoke-virtual {p1}, Le/a/a/p;->r()Z

    move-result v3

    if-eqz v3, :cond_0

    const-string v3, "network-discard-cancelled"

    .line 7
    invoke-virtual {p1, v3}, Le/a/a/p;->b(Ljava/lang/String;)V

    .line 8
    invoke-virtual {p1}, Le/a/a/p;->t()V
    :try_end_0
    .catch Lcom/android/volley/VolleyError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    invoke-virtual {p1, v2}, Le/a/a/p;->a(I)V

    return-void

    .line 10
    :cond_0
    :try_start_1
    invoke-virtual {p0, p1}, Le/a/a/k;->a(Le/a/a/p;)V

    .line 11
    iget-object v3, p0, Le/a/a/k;->c:Le/a/a/j;

    invoke-interface {v3, p1}, Le/a/a/j;->a(Le/a/a/p;)Le/a/a/l;

    move-result-object v3

    const-string v4, "network-http-complete"

    .line 12
    invoke-virtual {p1, v4}, Le/a/a/p;->a(Ljava/lang/String;)V

    .line 13
    iget-boolean v4, v3, Le/a/a/l;->e:Z

    if-eqz v4, :cond_1

    invoke-virtual {p1}, Le/a/a/p;->q()Z

    move-result v4

    if-eqz v4, :cond_1

    const-string v3, "not-modified"

    .line 14
    invoke-virtual {p1, v3}, Le/a/a/p;->b(Ljava/lang/String;)V

    .line 15
    invoke-virtual {p1}, Le/a/a/p;->t()V
    :try_end_1
    .catch Lcom/android/volley/VolleyError; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 16
    invoke-virtual {p1, v2}, Le/a/a/p;->a(I)V

    return-void

    .line 17
    :cond_1
    :try_start_2
    invoke-virtual {p1, v3}, Le/a/a/p;->a(Le/a/a/l;)Le/a/a/v;

    move-result-object v3

    const-string v4, "network-parse-complete"

    .line 18
    invoke-virtual {p1, v4}, Le/a/a/p;->a(Ljava/lang/String;)V

    .line 19
    invoke-virtual {p1}, Le/a/a/p;->u()Z

    move-result v4

    if-eqz v4, :cond_2

    iget-object v4, v3, Le/a/a/v;->b:Le/a/a/a;

    if-eqz v4, :cond_2

    .line 20
    iget-object v4, p0, Le/a/a/k;->d:Le/a/a/b;

    invoke-virtual {p1}, Le/a/a/p;->d()Ljava/lang/String;

    move-result-object v5

    iget-object v6, v3, Le/a/a/v;->b:Le/a/a/a;

    invoke-interface {v4, v5, v6}, Le/a/a/b;->a(Ljava/lang/String;Le/a/a/a;)V

    const-string v4, "network-cache-written"

    .line 21
    invoke-virtual {p1, v4}, Le/a/a/p;->a(Ljava/lang/String;)V

    .line 22
    :cond_2
    invoke-virtual {p1}, Le/a/a/p;->s()V

    .line 23
    iget-object v4, p0, Le/a/a/k;->e:Le/a/a/w;

    invoke-interface {v4, p1, v3}, Le/a/a/w;->a(Le/a/a/p;Le/a/a/v;)V

    .line 24
    invoke-virtual {p1, v3}, Le/a/a/p;->a(Le/a/a/v;)V
    :try_end_2
    .catch Lcom/android/volley/VolleyError; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :catch_0
    move-exception v3

    .line 25
    :try_start_3
    invoke-virtual {v3}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    .line 26
    new-instance v4, Lcom/android/volley/VolleyError;

    invoke-direct {v4, v3}, Lcom/android/volley/VolleyError;-><init>(Ljava/lang/Throwable;)V

    .line 27
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v5

    sub-long/2addr v5, v0

    invoke-virtual {v4, v5, v6}, Lcom/android/volley/VolleyError;->a(J)V

    .line 28
    iget-object v0, p0, Le/a/a/k;->e:Le/a/a/w;

    invoke-interface {v0, p1, v4}, Le/a/a/w;->a(Le/a/a/p;Lcom/android/volley/VolleyError;)V

    .line 29
    invoke-virtual {p1}, Le/a/a/p;->t()V

    goto :goto_0

    :catch_1
    move-exception v3

    .line 30
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v4

    sub-long/2addr v4, v0

    invoke-virtual {v3, v4, v5}, Lcom/android/volley/VolleyError;->a(J)V

    .line 31
    invoke-virtual {p0, p1, v3}, Le/a/a/k;->a(Le/a/a/p;Lcom/android/volley/VolleyError;)V

    .line 32
    invoke-virtual {p1}, Le/a/a/p;->t()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 33
    :goto_0
    invoke-virtual {p1, v2}, Le/a/a/p;->a(I)V

    return-void

    :goto_1
    invoke-virtual {p1, v2}, Le/a/a/p;->a(I)V

    throw v0
.end method

.method public run()V
    .locals 1

    const/16 v0, 0xa

    .line 1
    invoke-static {v0}, Landroid/os/Process;->setThreadPriority(I)V

    .line 2
    :cond_0
    :goto_0
    :try_start_0
    invoke-virtual {p0}, Le/a/a/k;->a()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 3
    :catch_0
    iget-boolean v0, p0, Le/a/a/k;->f:Z

    if-eqz v0, :cond_0

    .line 4
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    return-void
.end method
