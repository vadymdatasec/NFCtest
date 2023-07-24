.class public Le/a/a/d;
.super Ljava/lang/Thread;
.source "SourceFile"


# static fields
.field public static final h:Z


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

.field public final c:Ljava/util/concurrent/BlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/BlockingQueue<",
            "Le/a/a/p<",
            "*>;>;"
        }
    .end annotation
.end field

.field public final d:Le/a/a/b;

.field public final e:Le/a/a/w;

.field public volatile f:Z

.field public final g:Le/a/a/b0;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    sget-boolean v0, Le/a/a/a0;->a:Z

    sput-boolean v0, Le/a/a/d;->h:Z

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/BlockingQueue;Le/a/a/b;Le/a/a/w;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/BlockingQueue<",
            "Le/a/a/p<",
            "*>;>;",
            "Ljava/util/concurrent/BlockingQueue<",
            "Le/a/a/p<",
            "*>;>;",
            "Le/a/a/b;",
            "Le/a/a/w;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Le/a/a/d;->f:Z

    .line 3
    iput-object p1, p0, Le/a/a/d;->b:Ljava/util/concurrent/BlockingQueue;

    .line 4
    iput-object p2, p0, Le/a/a/d;->c:Ljava/util/concurrent/BlockingQueue;

    .line 5
    iput-object p3, p0, Le/a/a/d;->d:Le/a/a/b;

    .line 6
    iput-object p4, p0, Le/a/a/d;->e:Le/a/a/w;

    .line 7
    new-instance p1, Le/a/a/b0;

    invoke-direct {p1, p0, p2, p4}, Le/a/a/b0;-><init>(Le/a/a/d;Ljava/util/concurrent/BlockingQueue;Le/a/a/w;)V

    iput-object p1, p0, Le/a/a/d;->g:Le/a/a/b0;

    return-void
.end method

.method public static synthetic a(Le/a/a/d;)Ljava/util/concurrent/BlockingQueue;
    .locals 0

    .line 1
    iget-object p0, p0, Le/a/a/d;->c:Ljava/util/concurrent/BlockingQueue;

    return-object p0
.end method


# virtual methods
.method public final a()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .line 2
    iget-object v0, p0, Le/a/a/d;->b:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0}, Ljava/util/concurrent/BlockingQueue;->take()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/a/a/p;

    .line 3
    invoke-virtual {p0, v0}, Le/a/a/d;->a(Le/a/a/p;)V

    return-void
.end method

.method public a(Le/a/a/p;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/a/a/p<",
            "*>;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;
        }
    .end annotation

    const-string v0, "cache-queue-take"

    .line 4
    invoke-virtual {p1, v0}, Le/a/a/p;->a(Ljava/lang/String;)V

    const/4 v0, 0x1

    .line 5
    invoke-virtual {p1, v0}, Le/a/a/p;->a(I)V

    const/4 v1, 0x2

    .line 6
    :try_start_0
    invoke-virtual {p1}, Le/a/a/p;->r()Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v0, "cache-discard-canceled"

    .line 7
    invoke-virtual {p1, v0}, Le/a/a/p;->b(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    invoke-virtual {p1, v1}, Le/a/a/p;->a(I)V

    return-void

    .line 9
    :cond_0
    :try_start_1
    iget-object v2, p0, Le/a/a/d;->d:Le/a/a/b;

    invoke-virtual {p1}, Le/a/a/p;->d()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Le/a/a/b;->a(Ljava/lang/String;)Le/a/a/a;

    move-result-object v2

    if-nez v2, :cond_2

    const-string v0, "cache-miss"

    .line 10
    invoke-virtual {p1, v0}, Le/a/a/p;->a(Ljava/lang/String;)V

    .line 11
    iget-object v0, p0, Le/a/a/d;->g:Le/a/a/b0;

    invoke-virtual {v0, p1}, Le/a/a/b0;->b(Le/a/a/p;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 12
    iget-object v0, p0, Le/a/a/d;->c:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0, p1}, Ljava/util/concurrent/BlockingQueue;->put(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 13
    :cond_1
    invoke-virtual {p1, v1}, Le/a/a/p;->a(I)V

    return-void

    .line 14
    :cond_2
    :try_start_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    .line 15
    invoke-virtual {v2, v3, v4}, Le/a/a/a;->a(J)Z

    move-result v5

    if-eqz v5, :cond_4

    const-string v0, "cache-hit-expired"

    .line 16
    invoke-virtual {p1, v0}, Le/a/a/p;->a(Ljava/lang/String;)V

    .line 17
    invoke-virtual {p1, v2}, Le/a/a/p;->a(Le/a/a/a;)Le/a/a/p;

    .line 18
    iget-object v0, p0, Le/a/a/d;->g:Le/a/a/b0;

    invoke-virtual {v0, p1}, Le/a/a/b0;->b(Le/a/a/p;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 19
    iget-object v0, p0, Le/a/a/d;->c:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0, p1}, Ljava/util/concurrent/BlockingQueue;->put(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 20
    :cond_3
    invoke-virtual {p1, v1}, Le/a/a/p;->a(I)V

    return-void

    :cond_4
    :try_start_3
    const-string v5, "cache-hit"

    .line 21
    invoke-virtual {p1, v5}, Le/a/a/p;->a(Ljava/lang/String;)V

    .line 22
    new-instance v5, Le/a/a/l;

    iget-object v6, v2, Le/a/a/a;->a:[B

    iget-object v7, v2, Le/a/a/a;->g:Ljava/util/Map;

    invoke-direct {v5, v6, v7}, Le/a/a/l;-><init>([BLjava/util/Map;)V

    .line 23
    invoke-virtual {p1, v5}, Le/a/a/p;->a(Le/a/a/l;)Le/a/a/v;

    move-result-object v5

    const-string v6, "cache-hit-parsed"

    .line 24
    invoke-virtual {p1, v6}, Le/a/a/p;->a(Ljava/lang/String;)V

    .line 25
    invoke-virtual {v5}, Le/a/a/v;->a()Z

    move-result v6

    if-nez v6, :cond_6

    const-string v2, "cache-parsing-failed"

    .line 26
    invoke-virtual {p1, v2}, Le/a/a/p;->a(Ljava/lang/String;)V

    .line 27
    iget-object v2, p0, Le/a/a/d;->d:Le/a/a/b;

    invoke-virtual {p1}, Le/a/a/p;->d()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3, v0}, Le/a/a/b;->a(Ljava/lang/String;Z)V

    const/4 v0, 0x0

    .line 28
    invoke-virtual {p1, v0}, Le/a/a/p;->a(Le/a/a/a;)Le/a/a/p;

    .line 29
    iget-object v0, p0, Le/a/a/d;->g:Le/a/a/b0;

    invoke-virtual {v0, p1}, Le/a/a/b0;->b(Le/a/a/p;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 30
    iget-object v0, p0, Le/a/a/d;->c:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0, p1}, Ljava/util/concurrent/BlockingQueue;->put(Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 31
    :cond_5
    invoke-virtual {p1, v1}, Le/a/a/p;->a(I)V

    return-void

    .line 32
    :cond_6
    :try_start_4
    invoke-virtual {v2, v3, v4}, Le/a/a/a;->b(J)Z

    move-result v3

    if-nez v3, :cond_7

    .line 33
    iget-object v0, p0, Le/a/a/d;->e:Le/a/a/w;

    invoke-interface {v0, p1, v5}, Le/a/a/w;->a(Le/a/a/p;Le/a/a/v;)V

    goto :goto_0

    :cond_7
    const-string v3, "cache-hit-refresh-needed"

    .line 34
    invoke-virtual {p1, v3}, Le/a/a/p;->a(Ljava/lang/String;)V

    .line 35
    invoke-virtual {p1, v2}, Le/a/a/p;->a(Le/a/a/a;)Le/a/a/p;

    .line 36
    iput-boolean v0, v5, Le/a/a/v;->d:Z

    .line 37
    iget-object v0, p0, Le/a/a/d;->g:Le/a/a/b0;

    invoke-virtual {v0, p1}, Le/a/a/b0;->b(Le/a/a/p;)Z

    move-result v0

    if-nez v0, :cond_8

    .line 38
    iget-object v0, p0, Le/a/a/d;->e:Le/a/a/w;

    new-instance v2, Le/a/a/c;

    invoke-direct {v2, p0, p1}, Le/a/a/c;-><init>(Le/a/a/d;Le/a/a/p;)V

    invoke-interface {v0, p1, v5, v2}, Le/a/a/w;->a(Le/a/a/p;Le/a/a/v;Ljava/lang/Runnable;)V

    goto :goto_0

    .line 39
    :cond_8
    iget-object v0, p0, Le/a/a/d;->e:Le/a/a/w;

    invoke-interface {v0, p1, v5}, Le/a/a/w;->a(Le/a/a/p;Le/a/a/v;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 40
    :goto_0
    invoke-virtual {p1, v1}, Le/a/a/p;->a(I)V

    return-void

    :catchall_0
    move-exception v0

    invoke-virtual {p1, v1}, Le/a/a/p;->a(I)V

    throw v0
.end method

.method public b()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Le/a/a/d;->f:Z

    .line 2
    invoke-virtual {p0}, Ljava/lang/Thread;->interrupt()V

    return-void
.end method

.method public run()V
    .locals 1

    .line 1
    sget-boolean v0, Le/a/a/d;->h:Z

    const/16 v0, 0xa

    .line 2
    invoke-static {v0}, Landroid/os/Process;->setThreadPriority(I)V

    .line 3
    iget-object v0, p0, Le/a/a/d;->d:Le/a/a/b;

    invoke-interface {v0}, Le/a/a/b;->a()V

    .line 4
    :cond_0
    :goto_0
    :try_start_0
    invoke-virtual {p0}, Le/a/a/d;->a()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 5
    :catch_0
    iget-boolean v0, p0, Le/a/a/d;->f:Z

    if-eqz v0, :cond_0

    .line 6
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    return-void
.end method
