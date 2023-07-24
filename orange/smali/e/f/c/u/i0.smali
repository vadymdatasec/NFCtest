.class public Le/f/c/u/i0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final i:J


# instance fields
.field public final a:Lcom/google/firebase/iid/FirebaseInstanceId;

.field public final b:Landroid/content/Context;

.field public final c:Le/f/c/q/r;

.field public final d:Le/f/c/q/o;

.field public final e:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/ArrayDeque<",
            "Le/f/a/b/h/h<",
            "Ljava/lang/Void;",
            ">;>;>;"
        }
    .end annotation
.end field

.field public final f:Ljava/util/concurrent/ScheduledExecutorService;

.field public g:Z

.field public final h:Le/f/c/u/g0;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 1
    sget-object v0, Ljava/util/concurrent/TimeUnit;->HOURS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x8

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J

    move-result-wide v0

    sput-wide v0, Le/f/c/u/i0;->i:J

    return-void
.end method

.method public constructor <init>(Lcom/google/firebase/iid/FirebaseInstanceId;Le/f/c/q/r;Le/f/c/u/g0;Le/f/c/q/o;Landroid/content/Context;Ljava/util/concurrent/ScheduledExecutorService;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lc/e/b;

    invoke-direct {v0}, Lc/e/b;-><init>()V

    iput-object v0, p0, Le/f/c/u/i0;->e:Ljava/util/Map;

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Le/f/c/u/i0;->g:Z

    .line 4
    iput-object p1, p0, Le/f/c/u/i0;->a:Lcom/google/firebase/iid/FirebaseInstanceId;

    .line 5
    iput-object p2, p0, Le/f/c/u/i0;->c:Le/f/c/q/r;

    .line 6
    iput-object p3, p0, Le/f/c/u/i0;->h:Le/f/c/u/g0;

    .line 7
    iput-object p4, p0, Le/f/c/u/i0;->d:Le/f/c/q/o;

    .line 8
    iput-object p5, p0, Le/f/c/u/i0;->b:Landroid/content/Context;

    .line 9
    iput-object p6, p0, Le/f/c/u/i0;->f:Ljava/util/concurrent/ScheduledExecutorService;

    return-void
.end method

.method public static a(Lcom/google/firebase/iid/FirebaseInstanceId;Le/f/c/q/r;Le/f/c/q/o;Landroid/content/Context;Ljava/util/concurrent/ScheduledExecutorService;)Le/f/a/b/h/g;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/iid/FirebaseInstanceId;",
            "Le/f/c/q/r;",
            "Le/f/c/q/o;",
            "Landroid/content/Context;",
            "Ljava/util/concurrent/ScheduledExecutorService;",
            ")",
            "Le/f/a/b/h/g<",
            "Le/f/c/u/i0;",
            ">;"
        }
    .end annotation

    .line 2
    new-instance v6, Le/f/c/u/h0;

    move-object v0, v6

    move-object v1, p3

    move-object v2, p4

    move-object v3, p0

    move-object v4, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Le/f/c/u/h0;-><init>(Landroid/content/Context;Ljava/util/concurrent/ScheduledExecutorService;Lcom/google/firebase/iid/FirebaseInstanceId;Le/f/c/q/r;Le/f/c/q/o;)V

    invoke-static {p4, v6}, Le/f/a/b/h/n;->a(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Le/f/a/b/h/g;

    move-result-object p0

    return-object p0
.end method

.method public static a(Le/f/c/h;Lcom/google/firebase/iid/FirebaseInstanceId;Le/f/c/q/r;Le/f/c/r/a;Le/f/c/r/a;Le/f/c/s/k;Landroid/content/Context;Ljava/util/concurrent/ScheduledExecutorService;)Le/f/a/b/h/g;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/c/h;",
            "Lcom/google/firebase/iid/FirebaseInstanceId;",
            "Le/f/c/q/r;",
            "Le/f/c/r/a<",
            "Le/f/c/v/h;",
            ">;",
            "Le/f/c/r/a<",
            "Le/f/c/p/d;",
            ">;",
            "Le/f/c/s/k;",
            "Landroid/content/Context;",
            "Ljava/util/concurrent/ScheduledExecutorService;",
            ")",
            "Le/f/a/b/h/g<",
            "Le/f/c/u/i0;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v6, Le/f/c/q/o;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Le/f/c/q/o;-><init>(Le/f/c/h;Le/f/c/q/r;Le/f/c/r/a;Le/f/c/r/a;Le/f/c/s/k;)V

    invoke-static {p1, p2, v6, p6, p7}, Le/f/c/u/i0;->a(Lcom/google/firebase/iid/FirebaseInstanceId;Le/f/c/q/r;Le/f/c/q/o;Landroid/content/Context;Ljava/util/concurrent/ScheduledExecutorService;)Le/f/a/b/h/g;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic a(Landroid/content/Context;Ljava/util/concurrent/ScheduledExecutorService;Lcom/google/firebase/iid/FirebaseInstanceId;Le/f/c/q/r;Le/f/c/q/o;)Le/f/c/u/i0;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 39
    invoke-static {p0, p1}, Le/f/c/u/g0;->a(Landroid/content/Context;Ljava/util/concurrent/Executor;)Le/f/c/u/g0;

    move-result-object v3

    .line 40
    new-instance v7, Le/f/c/u/i0;

    move-object v0, v7

    move-object v1, p2

    move-object v2, p3

    move-object v4, p4

    move-object v5, p0

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Le/f/c/u/i0;-><init>(Lcom/google/firebase/iid/FirebaseInstanceId;Le/f/c/q/r;Le/f/c/u/g0;Le/f/c/q/o;Landroid/content/Context;Ljava/util/concurrent/ScheduledExecutorService;)V

    return-object v7
.end method

.method public static a(Le/f/a/b/h/g;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Le/f/a/b/h/g<",
            "TT;>;)TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-wide/16 v0, 0x1e

    .line 29
    :try_start_0
    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {p0, v0, v1, v2}, Le/f/a/b/h/n;->a(Le/f/a/b/h/g;JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    goto :goto_0

    :catch_1
    move-exception p0

    .line 30
    :goto_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "SERVICE_NOT_AVAILABLE"

    invoke-direct {v0, v1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :catch_2
    move-exception p0

    .line 31
    invoke-virtual {p0}, Ljava/util/concurrent/ExecutionException;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    .line 32
    instance-of v1, v0, Ljava/io/IOException;

    if-nez v1, :cond_1

    .line 33
    instance-of v1, v0, Ljava/lang/RuntimeException;

    if-eqz v1, :cond_0

    .line 34
    check-cast v0, Ljava/lang/RuntimeException;

    throw v0

    .line 35
    :cond_0
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    .line 36
    :cond_1
    check-cast v0, Ljava/io/IOException;

    throw v0
.end method

.method public static f()Z
    .locals 4

    const/4 v0, 0x3

    const-string v1, "FirebaseMessaging"

    .line 1
    invoke-static {v1, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v2

    if-nez v2, :cond_1

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x17

    if-ne v2, v3, :cond_0

    .line 2
    invoke-static {v1, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method


# virtual methods
.method public a(J)V
    .locals 11

    const/4 v0, 0x1

    shl-long v1, p1, v0

    const-wide/16 v3, 0x1e

    .line 12
    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    sget-wide v3, Le/f/c/u/i0;->i:J

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v9

    .line 13
    new-instance v1, Le/f/c/u/k0;

    iget-object v7, p0, Le/f/c/u/i0;->b:Landroid/content/Context;

    iget-object v8, p0, Le/f/c/u/i0;->c:Le/f/c/q/r;

    move-object v5, v1

    move-object v6, p0

    invoke-direct/range {v5 .. v10}, Le/f/c/u/k0;-><init>(Le/f/c/u/i0;Landroid/content/Context;Le/f/c/q/r;J)V

    .line 14
    invoke-virtual {p0, v1, p1, p2}, Le/f/c/u/i0;->a(Ljava/lang/Runnable;J)V

    .line 15
    invoke-virtual {p0, v0}, Le/f/c/u/i0;->a(Z)V

    return-void
.end method

.method public final a(Le/f/c/u/f0;)V
    .locals 4

    .line 17
    iget-object v0, p0, Le/f/c/u/i0;->e:Ljava/util/Map;

    monitor-enter v0

    .line 18
    :try_start_0
    invoke-virtual {p1}, Le/f/c/u/f0;->c()Ljava/lang/String;

    move-result-object p1

    .line 19
    iget-object v1, p0, Le/f/c/u/i0;->e:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 20
    monitor-exit v0

    return-void

    .line 21
    :cond_0
    iget-object v1, p0, Le/f/c/u/i0;->e:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/ArrayDeque;

    .line 22
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le/f/a/b/h/h;

    if-eqz v2, :cond_1

    const/4 v3, 0x0

    .line 23
    invoke-virtual {v2, v3}, Le/f/a/b/h/h;->a(Ljava/lang/Object;)V

    .line 24
    :cond_1
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 25
    iget-object v1, p0, Le/f/c/u/i0;->e:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
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

.method public final a(Le/f/c/u/f0;Le/f/a/b/h/h;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/c/u/f0;",
            "Le/f/a/b/h/h<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    .line 3
    iget-object v0, p0, Le/f/c/u/i0;->e:Ljava/util/Map;

    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {p1}, Le/f/c/u/f0;->c()Ljava/lang/String;

    move-result-object p1

    .line 5
    iget-object v1, p0, Le/f/c/u/i0;->e:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 6
    iget-object v1, p0, Le/f/c/u/i0;->e:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayDeque;

    goto :goto_0

    .line 7
    :cond_0
    new-instance v1, Ljava/util/ArrayDeque;

    invoke-direct {v1}, Ljava/util/ArrayDeque;-><init>()V

    .line 8
    iget-object v2, p0, Le/f/c/u/i0;->e:Ljava/util/Map;

    invoke-interface {v2, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object p1, v1

    .line 9
    :goto_0
    invoke-virtual {p1, p2}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 10
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public a(Ljava/lang/Runnable;J)V
    .locals 2

    .line 16
    iget-object v0, p0, Le/f/c/u/i0;->f:Ljava/util/concurrent/ScheduledExecutorService;

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, p1, p2, p3, v1}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 27
    iget-object v0, p0, Le/f/c/u/i0;->a:Lcom/google/firebase/iid/FirebaseInstanceId;

    invoke-virtual {v0}, Lcom/google/firebase/iid/FirebaseInstanceId;->e()Le/f/a/b/h/g;

    move-result-object v0

    invoke-static {v0}, Le/f/c/u/i0;->a(Le/f/a/b/h/g;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/f/c/q/p;

    .line 28
    iget-object v1, p0, Le/f/c/u/i0;->d:Le/f/c/q/o;

    invoke-interface {v0}, Le/f/c/q/p;->a()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0}, Le/f/c/q/p;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v2, v0, p1}, Le/f/c/q/o;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Le/f/a/b/h/g;

    move-result-object p1

    invoke-static {p1}, Le/f/c/u/i0;->a(Le/f/a/b/h/g;)Ljava/lang/Object;

    return-void
.end method

.method public declared-synchronized a(Z)V
    .locals 0

    monitor-enter p0

    .line 37
    :try_start_0
    iput-boolean p1, p0, Le/f/c/u/i0;->g:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public a()Z
    .locals 1

    .line 11
    iget-object v0, p0, Le/f/c/u/i0;->h:Le/f/c/u/g0;

    invoke-virtual {v0}, Le/f/c/u/g0;->a()Le/f/c/u/f0;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final b(Ljava/lang/String;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 16
    iget-object v0, p0, Le/f/c/u/i0;->a:Lcom/google/firebase/iid/FirebaseInstanceId;

    invoke-virtual {v0}, Lcom/google/firebase/iid/FirebaseInstanceId;->e()Le/f/a/b/h/g;

    move-result-object v0

    invoke-static {v0}, Le/f/c/u/i0;->a(Le/f/a/b/h/g;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/f/c/q/p;

    .line 17
    iget-object v1, p0, Le/f/c/u/i0;->d:Le/f/c/q/o;

    .line 18
    invoke-interface {v0}, Le/f/c/q/p;->a()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0}, Le/f/c/q/p;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v2, v0, p1}, Le/f/c/q/o;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Le/f/a/b/h/g;

    move-result-object p1

    .line 19
    invoke-static {p1}, Le/f/c/u/i0;->a(Le/f/a/b/h/g;)Ljava/lang/Object;

    return-void
.end method

.method public declared-synchronized b()Z
    .locals 1

    monitor-enter p0

    .line 20
    :try_start_0
    iget-boolean v0, p0, Le/f/c/u/i0;->g:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public b(Le/f/c/u/f0;)Z
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "FirebaseMessaging"

    const/4 v1, 0x0

    .line 1
    :try_start_0
    invoke-virtual {p1}, Le/f/c/u/f0;->a()Ljava/lang/String;

    move-result-object v2

    const/4 v3, -0x1

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v4

    const/16 v5, 0x53

    const/4 v6, 0x1

    if-eq v4, v5, :cond_1

    const/16 v5, 0x55

    if-eq v4, v5, :cond_0

    goto :goto_0

    :cond_0
    const-string v4, "U"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v3, 0x1

    goto :goto_0

    :cond_1
    const-string v4, "S"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v2, :cond_2

    const/4 v3, 0x0

    :cond_2
    :goto_0
    const-string v2, " succeeded."

    if-eqz v3, :cond_4

    if-eq v3, v6, :cond_3

    .line 2
    :try_start_1
    invoke-static {}, Le/f/c/u/i0;->f()Z

    move-result v2

    if-eqz v2, :cond_5

    .line 3
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, 0x18

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "Unknown topic operation"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "."

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    .line 4
    :cond_3
    invoke-virtual {p1}, Le/f/c/u/f0;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v3}, Le/f/c/u/i0;->b(Ljava/lang/String;)V

    .line 5
    invoke-static {}, Le/f/c/u/i0;->f()Z

    move-result v3

    if-eqz v3, :cond_5

    .line 6
    invoke-virtual {p1}, Le/f/c/u/f0;->b()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x23

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "Unsubscribe from topic: "

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    .line 7
    :cond_4
    invoke-virtual {p1}, Le/f/c/u/f0;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v3}, Le/f/c/u/i0;->a(Ljava/lang/String;)V

    .line 8
    invoke-static {}, Le/f/c/u/i0;->f()Z

    move-result v3

    if-eqz v3, :cond_5

    .line 9
    invoke-virtual {p1}, Le/f/c/u/f0;->b()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x1f

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "Subscribe to topic: "

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    :cond_5
    :goto_1
    return v6

    :catch_0
    move-exception p1

    .line 10
    invoke-virtual {p1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const-string v3, "SERVICE_NOT_AVAILABLE"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    .line 11
    invoke-virtual {p1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const-string v3, "INTERNAL_SERVER_ERROR"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_2

    .line 12
    :cond_6
    invoke-virtual {p1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_7

    const-string p1, "Topic operation failed without exception message. Will retry Topic operation."

    .line 13
    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return v1

    .line 14
    :cond_7
    throw p1

    .line 15
    :cond_8
    :goto_2
    invoke-virtual {p1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, 0x35

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "Topic operation failed: "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ". Will retry Topic operation."

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return v1
.end method

.method public c(Le/f/c/u/f0;)Le/f/a/b/h/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/c/u/f0;",
            ")",
            "Le/f/a/b/h/g<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .line 3
    iget-object v0, p0, Le/f/c/u/i0;->h:Le/f/c/u/g0;

    invoke-virtual {v0, p1}, Le/f/c/u/g0;->a(Le/f/c/u/f0;)Z

    .line 4
    new-instance v0, Le/f/a/b/h/h;

    invoke-direct {v0}, Le/f/a/b/h/h;-><init>()V

    .line 5
    invoke-virtual {p0, p1, v0}, Le/f/c/u/i0;->a(Le/f/c/u/f0;Le/f/a/b/h/h;)V

    .line 6
    invoke-virtual {v0}, Le/f/a/b/h/h;->a()Le/f/a/b/h/g;

    move-result-object p1

    return-object p1
.end method

.method public c(Ljava/lang/String;)Le/f/a/b/h/g;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Le/f/a/b/h/g<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Le/f/c/u/f0;->b(Ljava/lang/String;)Le/f/c/u/f0;

    move-result-object p1

    invoke-virtual {p0, p1}, Le/f/c/u/i0;->c(Le/f/c/u/f0;)Le/f/a/b/h/g;

    move-result-object p1

    .line 2
    invoke-virtual {p0}, Le/f/c/u/i0;->d()V

    return-object p1
.end method

.method public final c()V
    .locals 2

    .line 7
    invoke-virtual {p0}, Le/f/c/u/i0;->b()Z

    move-result v0

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    .line 8
    invoke-virtual {p0, v0, v1}, Le/f/c/u/i0;->a(J)V

    :cond_0
    return-void
.end method

.method public d(Ljava/lang/String;)Le/f/a/b/h/g;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Le/f/a/b/h/g<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Le/f/c/u/f0;->c(Ljava/lang/String;)Le/f/c/u/f0;

    move-result-object p1

    invoke-virtual {p0, p1}, Le/f/c/u/i0;->c(Le/f/c/u/f0;)Le/f/a/b/h/g;

    move-result-object p1

    .line 2
    invoke-virtual {p0}, Le/f/c/u/i0;->d()V

    return-object p1
.end method

.method public d()V
    .locals 1

    .line 3
    invoke-virtual {p0}, Le/f/c/u/i0;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {p0}, Le/f/c/u/i0;->c()V

    :cond_0
    return-void
.end method

.method public e()Z
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    :goto_0
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Le/f/c/u/i0;->h:Le/f/c/u/g0;

    invoke-virtual {v0}, Le/f/c/u/g0;->a()Le/f/c/u/f0;

    move-result-object v0

    if-nez v0, :cond_1

    .line 3
    invoke-static {}, Le/f/c/u/i0;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "FirebaseMessaging"

    const-string v1, "topic sync succeeded"

    .line 4
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    const/4 v0, 0x1

    .line 5
    monitor-exit p0

    return v0

    .line 6
    :cond_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    invoke-virtual {p0, v0}, Le/f/c/u/i0;->b(Le/f/c/u/f0;)Z

    move-result v1

    if-nez v1, :cond_2

    const/4 v0, 0x0

    return v0

    .line 8
    :cond_2
    iget-object v1, p0, Le/f/c/u/i0;->h:Le/f/c/u/g0;

    invoke-virtual {v1, v0}, Le/f/c/u/g0;->b(Le/f/c/u/f0;)Z

    .line 9
    invoke-virtual {p0, v0}, Le/f/c/u/i0;->a(Le/f/c/u/f0;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 10
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method
