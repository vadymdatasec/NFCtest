.class public final Le/b/a/y/x/h1/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/ExecutorService;


# static fields
.field public static final b:J

.field public static volatile c:I


# instance fields
.field public final a:Ljava/util/concurrent/ExecutorService;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 1
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0xa

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Le/b/a/y/x/h1/k;->b:J

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/ExecutorService;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/b/a/y/x/h1/k;->a:Ljava/util/concurrent/ExecutorService;

    return-void
.end method

.method public static a()I
    .locals 2

    .line 1
    invoke-static {}, Le/b/a/y/x/h1/k;->b()I

    move-result v0

    const/4 v1, 0x4

    if-lt v0, v1, :cond_0

    const/4 v0, 0x2

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0
.end method

.method public static b()I
    .locals 2

    .line 1
    sget v0, Le/b/a/y/x/h1/k;->c:I

    if-nez v0, :cond_0

    const/4 v0, 0x4

    .line 2
    invoke-static {}, Le/b/a/y/x/h1/m;->a()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    sput v0, Le/b/a/y/x/h1/k;->c:I

    .line 3
    :cond_0
    sget v0, Le/b/a/y/x/h1/k;->c:I

    return v0
.end method

.method public static c()Le/b/a/y/x/h1/b;
    .locals 3

    .line 1
    invoke-static {}, Le/b/a/y/x/h1/k;->a()I

    move-result v0

    .line 2
    new-instance v1, Le/b/a/y/x/h1/b;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Le/b/a/y/x/h1/b;-><init>(Z)V

    .line 3
    invoke-virtual {v1, v0}, Le/b/a/y/x/h1/b;->a(I)Le/b/a/y/x/h1/b;

    const-string v0, "animation"

    .line 4
    invoke-virtual {v1, v0}, Le/b/a/y/x/h1/b;->a(Ljava/lang/String;)Le/b/a/y/x/h1/b;

    return-object v1
.end method

.method public static d()Le/b/a/y/x/h1/k;
    .locals 1

    .line 1
    invoke-static {}, Le/b/a/y/x/h1/k;->c()Le/b/a/y/x/h1/b;

    move-result-object v0

    invoke-virtual {v0}, Le/b/a/y/x/h1/b;->a()Le/b/a/y/x/h1/k;

    move-result-object v0

    return-object v0
.end method

.method public static e()Le/b/a/y/x/h1/b;
    .locals 2

    .line 1
    new-instance v0, Le/b/a/y/x/h1/b;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Le/b/a/y/x/h1/b;-><init>(Z)V

    .line 2
    invoke-virtual {v0, v1}, Le/b/a/y/x/h1/b;->a(I)Le/b/a/y/x/h1/b;

    const-string v1, "disk-cache"

    .line 3
    invoke-virtual {v0, v1}, Le/b/a/y/x/h1/b;->a(Ljava/lang/String;)Le/b/a/y/x/h1/b;

    return-object v0
.end method

.method public static f()Le/b/a/y/x/h1/k;
    .locals 1

    .line 1
    invoke-static {}, Le/b/a/y/x/h1/k;->e()Le/b/a/y/x/h1/b;

    move-result-object v0

    invoke-virtual {v0}, Le/b/a/y/x/h1/b;->a()Le/b/a/y/x/h1/k;

    move-result-object v0

    return-object v0
.end method

.method public static g()Le/b/a/y/x/h1/b;
    .locals 2

    .line 1
    new-instance v0, Le/b/a/y/x/h1/b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Le/b/a/y/x/h1/b;-><init>(Z)V

    .line 2
    invoke-static {}, Le/b/a/y/x/h1/k;->b()I

    move-result v1

    invoke-virtual {v0, v1}, Le/b/a/y/x/h1/b;->a(I)Le/b/a/y/x/h1/b;

    const-string v1, "source"

    .line 3
    invoke-virtual {v0, v1}, Le/b/a/y/x/h1/b;->a(Ljava/lang/String;)Le/b/a/y/x/h1/b;

    return-object v0
.end method

.method public static h()Le/b/a/y/x/h1/k;
    .locals 1

    .line 1
    invoke-static {}, Le/b/a/y/x/h1/k;->g()Le/b/a/y/x/h1/b;

    move-result-object v0

    invoke-virtual {v0}, Le/b/a/y/x/h1/b;->a()Le/b/a/y/x/h1/k;

    move-result-object v0

    return-object v0
.end method

.method public static i()Le/b/a/y/x/h1/k;
    .locals 11

    .line 1
    new-instance v0, Le/b/a/y/x/h1/k;

    new-instance v9, Ljava/util/concurrent/ThreadPoolExecutor;

    sget-wide v4, Le/b/a/y/x/h1/k;->b:J

    sget-object v6, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v7, Ljava/util/concurrent/SynchronousQueue;

    invoke-direct {v7}, Ljava/util/concurrent/SynchronousQueue;-><init>()V

    new-instance v8, Le/b/a/y/x/h1/f;

    new-instance v1, Le/b/a/y/x/h1/d;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Le/b/a/y/x/h1/d;-><init>(Le/b/a/y/x/h1/a;)V

    sget-object v2, Le/b/a/y/x/h1/j;->b:Le/b/a/y/x/h1/j;

    const-string v3, "source-unlimited"

    const/4 v10, 0x0

    invoke-direct {v8, v1, v3, v2, v10}, Le/b/a/y/x/h1/f;-><init>(Ljava/util/concurrent/ThreadFactory;Ljava/lang/String;Le/b/a/y/x/h1/j;Z)V

    const/4 v2, 0x0

    const v3, 0x7fffffff

    move-object v1, v9

    invoke-direct/range {v1 .. v8}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    invoke-direct {v0, v9}, Le/b/a/y/x/h1/k;-><init>(Ljava/util/concurrent/ExecutorService;)V

    return-object v0
.end method


# virtual methods
.method public awaitTermination(JLjava/util/concurrent/TimeUnit;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/b/a/y/x/h1/k;->a:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, p1, p2, p3}, Ljava/util/concurrent/ExecutorService;->awaitTermination(JLjava/util/concurrent/TimeUnit;)Z

    move-result p1

    return p1
.end method

.method public execute(Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Le/b/a/y/x/h1/k;->a:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public invokeAll(Ljava/util/Collection;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Collection<",
            "+",
            "Ljava/util/concurrent/Callable<",
            "TT;>;>;)",
            "Ljava/util/List<",
            "Ljava/util/concurrent/Future<",
            "TT;>;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/b/a/y/x/h1/k;->a:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ExecutorService;->invokeAll(Ljava/util/Collection;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public invokeAll(Ljava/util/Collection;JLjava/util/concurrent/TimeUnit;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Collection<",
            "+",
            "Ljava/util/concurrent/Callable<",
            "TT;>;>;J",
            "Ljava/util/concurrent/TimeUnit;",
            ")",
            "Ljava/util/List<",
            "Ljava/util/concurrent/Future<",
            "TT;>;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .line 2
    iget-object v0, p0, Le/b/a/y/x/h1/k;->a:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, p1, p2, p3, p4}, Ljava/util/concurrent/ExecutorService;->invokeAll(Ljava/util/Collection;JLjava/util/concurrent/TimeUnit;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public invokeAny(Ljava/util/Collection;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Collection<",
            "+",
            "Ljava/util/concurrent/Callable<",
            "TT;>;>;)TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;,
            Ljava/util/concurrent/ExecutionException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/b/a/y/x/h1/k;->a:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ExecutorService;->invokeAny(Ljava/util/Collection;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public invokeAny(Ljava/util/Collection;JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Collection<",
            "+",
            "Ljava/util/concurrent/Callable<",
            "TT;>;>;J",
            "Ljava/util/concurrent/TimeUnit;",
            ")TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;,
            Ljava/util/concurrent/ExecutionException;,
            Ljava/util/concurrent/TimeoutException;
        }
    .end annotation

    .line 2
    iget-object v0, p0, Le/b/a/y/x/h1/k;->a:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, p1, p2, p3, p4}, Ljava/util/concurrent/ExecutorService;->invokeAny(Ljava/util/Collection;JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public isShutdown()Z
    .locals 1

    .line 1
    iget-object v0, p0, Le/b/a/y/x/h1/k;->a:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    return v0
.end method

.method public isTerminated()Z
    .locals 1

    .line 1
    iget-object v0, p0, Le/b/a/y/x/h1/k;->a:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isTerminated()Z

    move-result v0

    return v0
.end method

.method public shutdown()V
    .locals 1

    .line 1
    iget-object v0, p0, Le/b/a/y/x/h1/k;->a:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    return-void
.end method

.method public shutdownNow()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/b/a/y/x/h1/k;->a:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Runnable;",
            ")",
            "Ljava/util/concurrent/Future<",
            "*>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/b/a/y/x/h1/k;->a:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object p1

    return-object p1
.end method

.method public submit(Ljava/lang/Runnable;Ljava/lang/Object;)Ljava/util/concurrent/Future;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Runnable;",
            "TT;)",
            "Ljava/util/concurrent/Future<",
            "TT;>;"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Le/b/a/y/x/h1/k;->a:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, p1, p2}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;Ljava/lang/Object;)Ljava/util/concurrent/Future;

    move-result-object p1

    return-object p1
.end method

.method public submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Callable<",
            "TT;>;)",
            "Ljava/util/concurrent/Future<",
            "TT;>;"
        }
    .end annotation

    .line 3
    iget-object v0, p0, Le/b/a/y/x/h1/k;->a:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Le/b/a/y/x/h1/k;->a:Ljava/util/concurrent/ExecutorService;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
