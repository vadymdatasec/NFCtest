.class public Le/b/a/c0/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/b/a/c0/c;
.implements Le/b/a/c0/i;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Le/b/a/c0/c<",
        "TR;>;",
        "Le/b/a/c0/i<",
        "TR;>;"
    }
.end annotation


# static fields
.field public static final l:Le/b/a/c0/g;


# instance fields
.field public final b:I

.field public final c:I

.field public final d:Z

.field public final e:Le/b/a/c0/g;

.field public f:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TR;"
        }
    .end annotation
.end field

.field public g:Le/b/a/c0/d;

.field public h:Z

.field public i:Z

.field public j:Z

.field public k:Lcom/bumptech/glide/load/engine/GlideException;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Le/b/a/c0/g;

    invoke-direct {v0}, Le/b/a/c0/g;-><init>()V

    sput-object v0, Le/b/a/c0/h;->l:Le/b/a/c0/g;

    return-void
.end method

.method public constructor <init>(II)V
    .locals 2

    .line 1
    sget-object v0, Le/b/a/c0/h;->l:Le/b/a/c0/g;

    const/4 v1, 0x1

    invoke-direct {p0, p1, p2, v1, v0}, Le/b/a/c0/h;-><init>(IIZLe/b/a/c0/g;)V

    return-void
.end method

.method public constructor <init>(IIZLe/b/a/c0/g;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Le/b/a/c0/h;->b:I

    .line 4
    iput p2, p0, Le/b/a/c0/h;->c:I

    .line 5
    iput-boolean p3, p0, Le/b/a/c0/h;->d:Z

    .line 6
    iput-object p4, p0, Le/b/a/c0/h;->e:Le/b/a/c0/g;

    return-void
.end method


# virtual methods
.method public final declared-synchronized a(Ljava/lang/Long;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Long;",
            ")TR;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/util/concurrent/ExecutionException;,
            Ljava/lang/InterruptedException;,
            Ljava/util/concurrent/TimeoutException;
        }
    .end annotation

    monitor-enter p0

    .line 4
    :try_start_0
    iget-boolean v0, p0, Le/b/a/c0/h;->d:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Le/b/a/c0/h;->isDone()Z

    move-result v0

    if-nez v0, :cond_0

    .line 5
    invoke-static {}, Le/b/a/e0/t;->a()V

    .line 6
    :cond_0
    iget-boolean v0, p0, Le/b/a/c0/h;->h:Z

    if-nez v0, :cond_9

    .line 7
    iget-boolean v0, p0, Le/b/a/c0/h;->j:Z

    if-nez v0, :cond_8

    .line 8
    iget-boolean v0, p0, Le/b/a/c0/h;->i:Z

    if-eqz v0, :cond_1

    .line 9
    iget-object p1, p0, Le/b/a/c0/h;->f:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :cond_1
    const-wide/16 v0, 0x0

    if-nez p1, :cond_2

    .line 10
    :try_start_1
    iget-object p1, p0, Le/b/a/c0/h;->e:Le/b/a/c0/g;

    invoke-virtual {p1, p0, v0, v1}, Le/b/a/c0/g;->a(Ljava/lang/Object;J)V

    goto :goto_1

    .line 11
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    cmp-long v4, v2, v0

    if-lez v4, :cond_3

    .line 12
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 13
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    add-long/2addr v2, v0

    .line 14
    :goto_0
    invoke-virtual {p0}, Le/b/a/c0/h;->isDone()Z

    move-result p1

    if-nez p1, :cond_3

    cmp-long p1, v0, v2

    if-gez p1, :cond_3

    .line 15
    iget-object p1, p0, Le/b/a/c0/h;->e:Le/b/a/c0/g;

    sub-long v0, v2, v0

    invoke-virtual {p1, p0, v0, v1}, Le/b/a/c0/g;->a(Ljava/lang/Object;J)V

    .line 16
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    goto :goto_0

    .line 17
    :cond_3
    :goto_1
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    move-result p1

    if-nez p1, :cond_7

    .line 18
    iget-boolean p1, p0, Le/b/a/c0/h;->j:Z

    if-nez p1, :cond_6

    .line 19
    iget-boolean p1, p0, Le/b/a/c0/h;->h:Z

    if-nez p1, :cond_5

    .line 20
    iget-boolean p1, p0, Le/b/a/c0/h;->i:Z

    if-eqz p1, :cond_4

    .line 21
    iget-object p1, p0, Le/b/a/c0/h;->f:Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object p1

    .line 22
    :cond_4
    :try_start_2
    new-instance p1, Ljava/util/concurrent/TimeoutException;

    invoke-direct {p1}, Ljava/util/concurrent/TimeoutException;-><init>()V

    throw p1

    .line 23
    :cond_5
    new-instance p1, Ljava/util/concurrent/CancellationException;

    invoke-direct {p1}, Ljava/util/concurrent/CancellationException;-><init>()V

    throw p1

    .line 24
    :cond_6
    new-instance p1, Ljava/util/concurrent/ExecutionException;

    iget-object v0, p0, Le/b/a/c0/h;->k:Lcom/bumptech/glide/load/engine/GlideException;

    invoke-direct {p1, v0}, Ljava/util/concurrent/ExecutionException;-><init>(Ljava/lang/Throwable;)V

    throw p1

    .line 25
    :cond_7
    new-instance p1, Ljava/lang/InterruptedException;

    invoke-direct {p1}, Ljava/lang/InterruptedException;-><init>()V

    throw p1

    .line 26
    :cond_8
    new-instance p1, Ljava/util/concurrent/ExecutionException;

    iget-object v0, p0, Le/b/a/c0/h;->k:Lcom/bumptech/glide/load/engine/GlideException;

    invoke-direct {p1, v0}, Ljava/util/concurrent/ExecutionException;-><init>(Ljava/lang/Throwable;)V

    throw p1

    .line 27
    :cond_9
    new-instance p1, Ljava/util/concurrent/CancellationException;

    invoke-direct {p1}, Ljava/util/concurrent/CancellationException;-><init>()V

    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public a()V
    .locals 0

    return-void
.end method

.method public a(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    return-void
.end method

.method public declared-synchronized a(Le/b/a/c0/d;)V
    .locals 0

    monitor-enter p0

    .line 1
    :try_start_0
    iput-object p1, p0, Le/b/a/c0/h;->g:Le/b/a/c0/d;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public a(Le/b/a/c0/o/g;)V
    .locals 0

    return-void
.end method

.method public declared-synchronized a(Ljava/lang/Object;Le/b/a/c0/p/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TR;",
            "Le/b/a/c0/p/d<",
            "-TR;>;)V"
        }
    .end annotation

    monitor-enter p0

    .line 3
    monitor-exit p0

    return-void
.end method

.method public declared-synchronized a(Lcom/bumptech/glide/load/engine/GlideException;Ljava/lang/Object;Le/b/a/c0/o/h;Z)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/load/engine/GlideException;",
            "Ljava/lang/Object;",
            "Le/b/a/c0/o/h<",
            "TR;>;Z)Z"
        }
    .end annotation

    monitor-enter p0

    const/4 p2, 0x1

    .line 28
    :try_start_0
    iput-boolean p2, p0, Le/b/a/c0/h;->j:Z

    .line 29
    iput-object p1, p0, Le/b/a/c0/h;->k:Lcom/bumptech/glide/load/engine/GlideException;

    .line 30
    iget-object p1, p0, Le/b/a/c0/h;->e:Le/b/a/c0/g;

    invoke-virtual {p1, p0}, Le/b/a/c0/g;->a(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p1, 0x0

    .line 31
    monitor-exit p0

    return p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized a(Ljava/lang/Object;Ljava/lang/Object;Le/b/a/c0/o/h;Le/b/a/y/a;Z)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TR;",
            "Ljava/lang/Object;",
            "Le/b/a/c0/o/h<",
            "TR;>;",
            "Le/b/a/y/a;",
            "Z)Z"
        }
    .end annotation

    monitor-enter p0

    const/4 p2, 0x1

    .line 32
    :try_start_0
    iput-boolean p2, p0, Le/b/a/c0/h;->i:Z

    .line 33
    iput-object p1, p0, Le/b/a/c0/h;->f:Ljava/lang/Object;

    .line 34
    iget-object p1, p0, Le/b/a/c0/h;->e:Le/b/a/c0/g;

    invoke-virtual {p1, p0}, Le/b/a/c0/g;->a(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p1, 0x0

    .line 35
    monitor-exit p0

    return p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public b()V
    .locals 0

    return-void
.end method

.method public declared-synchronized b(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    monitor-enter p0

    .line 2
    monitor-exit p0

    return-void
.end method

.method public b(Le/b/a/c0/o/g;)V
    .locals 2

    .line 1
    iget v0, p0, Le/b/a/c0/h;->b:I

    iget v1, p0, Le/b/a/c0/h;->c:I

    invoke-interface {p1, v0, v1}, Le/b/a/c0/o/g;->a(II)V

    return-void
.end method

.method public declared-synchronized c()Le/b/a/c0/d;
    .locals 1

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Le/b/a/c0/h;->g:Le/b/a/c0/d;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public c(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    return-void
.end method

.method public cancel(Z)Z
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Le/b/a/c0/h;->isDone()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    .line 3
    monitor-exit p0

    return p1

    :cond_0
    const/4 v0, 0x1

    .line 4
    iput-boolean v0, p0, Le/b/a/c0/h;->h:Z

    .line 5
    iget-object v1, p0, Le/b/a/c0/h;->e:Le/b/a/c0/g;

    invoke-virtual {v1, p0}, Le/b/a/c0/g;->a(Ljava/lang/Object;)V

    const/4 v1, 0x0

    if-eqz p1, :cond_1

    .line 6
    iget-object p1, p0, Le/b/a/c0/h;->g:Le/b/a/c0/d;

    .line 7
    iput-object v1, p0, Le/b/a/c0/h;->g:Le/b/a/c0/d;

    move-object v1, p1

    .line 8
    :cond_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_2

    .line 9
    invoke-interface {v1}, Le/b/a/c0/d;->clear()V

    :cond_2
    return v0

    :catchall_0
    move-exception p1

    .line 10
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public get()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TR;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;,
            Ljava/util/concurrent/ExecutionException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    :try_start_0
    invoke-virtual {p0, v0}, Le/b/a/c0/h;->a(Ljava/lang/Long;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 2
    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v1
.end method

.method public get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/concurrent/TimeUnit;",
            ")TR;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;,
            Ljava/util/concurrent/ExecutionException;,
            Ljava/util/concurrent/TimeoutException;
        }
    .end annotation

    .line 3
    invoke-virtual {p3, p1, p2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {p0, p1}, Le/b/a/c0/h;->a(Ljava/lang/Long;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public declared-synchronized isCancelled()Z
    .locals 1

    monitor-enter p0

    .line 1
    :try_start_0
    iget-boolean v0, p0, Le/b/a/c0/h;->h:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized isDone()Z
    .locals 1

    monitor-enter p0

    .line 1
    :try_start_0
    iget-boolean v0, p0, Le/b/a/c0/h;->h:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Le/b/a/c0/h;->i:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Le/b/a/c0/h;->j:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public onDestroy()V
    .locals 0

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "[status="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 2
    monitor-enter p0

    .line 3
    :try_start_0
    iget-boolean v1, p0, Le/b/a/c0/h;->h:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    const-string v1, "CANCELLED"

    goto :goto_0

    .line 4
    :cond_0
    iget-boolean v1, p0, Le/b/a/c0/h;->j:Z

    if-eqz v1, :cond_1

    const-string v1, "FAILURE"

    goto :goto_0

    .line 5
    :cond_1
    iget-boolean v1, p0, Le/b/a/c0/h;->i:Z

    if-eqz v1, :cond_2

    const-string v1, "SUCCESS"

    goto :goto_0

    :cond_2
    const-string v1, "PENDING"

    .line 6
    iget-object v2, p0, Le/b/a/c0/h;->g:Le/b/a/c0/d;

    .line 7
    :goto_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_3

    .line 8
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", request=["

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "]]"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 9
    :cond_3
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "]"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :catchall_0
    move-exception v0

    .line 10
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method
