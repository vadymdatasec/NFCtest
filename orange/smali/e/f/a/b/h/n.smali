.class public abstract Le/f/a/b/h/n;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Ljava/lang/Exception;)Le/f/a/b/h/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResult:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Exception;",
            ")",
            "Le/f/a/b/h/g<",
            "TTResult;>;"
        }
    .end annotation

    .line 3
    new-instance v0, Le/f/a/b/h/f0;

    invoke-direct {v0}, Le/f/a/b/h/f0;-><init>()V

    .line 4
    invoke-virtual {v0, p0}, Le/f/a/b/h/f0;->a(Ljava/lang/Exception;)V

    return-object v0
.end method

.method public static a(Ljava/lang/Object;)Le/f/a/b/h/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResult:",
            "Ljava/lang/Object;",
            ">(TTResult;)",
            "Le/f/a/b/h/g<",
            "TTResult;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Le/f/a/b/h/f0;

    invoke-direct {v0}, Le/f/a/b/h/f0;-><init>()V

    .line 2
    invoke-virtual {v0, p0}, Le/f/a/b/h/f0;->a(Ljava/lang/Object;)V

    return-object v0
.end method

.method public static a(Ljava/util/Collection;)Le/f/a/b/h/g;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Le/f/a/b/h/g<",
            "*>;>;)",
            "Le/f/a/b/h/g<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .line 27
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    .line 28
    invoke-static {p0}, Le/f/a/b/h/n;->a(Ljava/lang/Object;)Le/f/a/b/h/g;

    move-result-object p0

    return-object p0

    .line 29
    :cond_0
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le/f/a/b/h/g;

    if-eqz v1, :cond_1

    goto :goto_0

    .line 30
    :cond_1
    new-instance p0, Ljava/lang/NullPointerException;

    const-string v0, "null tasks are not accepted"

    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 31
    :cond_2
    new-instance v0, Le/f/a/b/h/f0;

    invoke-direct {v0}, Le/f/a/b/h/f0;-><init>()V

    .line 32
    new-instance v1, Le/f/a/b/h/m;

    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result v2

    invoke-direct {v1, v2, v0}, Le/f/a/b/h/m;-><init>(ILe/f/a/b/h/f0;)V

    .line 33
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le/f/a/b/h/g;

    .line 34
    invoke-static {v2, v1}, Le/f/a/b/h/n;->a(Le/f/a/b/h/g;Le/f/a/b/h/l;)V

    goto :goto_1

    :cond_3
    return-object v0
.end method

.method public static a(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Le/f/a/b/h/g;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResult:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Executor;",
            "Ljava/util/concurrent/Callable<",
            "TTResult;>;)",
            "Le/f/a/b/h/g<",
            "TTResult;>;"
        }
    .end annotation

    const-string v0, "Executor must not be null"

    .line 5
    invoke-static {p0, v0}, Le/f/a/b/c/m/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Callback must not be null"

    .line 6
    invoke-static {p1, v0}, Le/f/a/b/c/m/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    new-instance v0, Le/f/a/b/h/f0;

    invoke-direct {v0}, Le/f/a/b/h/f0;-><init>()V

    .line 8
    new-instance v1, Le/f/a/b/h/g0;

    invoke-direct {v1, v0, p1}, Le/f/a/b/h/g0;-><init>(Le/f/a/b/h/f0;Ljava/util/concurrent/Callable;)V

    invoke-interface {p0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-object v0
.end method

.method public static varargs a([Le/f/a/b/h/g;)Le/f/a/b/h/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Le/f/a/b/h/g<",
            "*>;)",
            "Le/f/a/b/h/g<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .line 35
    array-length v0, p0

    if-nez v0, :cond_0

    const/4 p0, 0x0

    .line 36
    invoke-static {p0}, Le/f/a/b/h/n;->a(Ljava/lang/Object;)Le/f/a/b/h/g;

    move-result-object p0

    return-object p0

    .line 37
    :cond_0
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-static {p0}, Le/f/a/b/h/n;->a(Ljava/util/Collection;)Le/f/a/b/h/g;

    move-result-object p0

    return-object p0
.end method

.method public static a(Le/f/a/b/h/g;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResult:",
            "Ljava/lang/Object;",
            ">(",
            "Le/f/a/b/h/g<",
            "TTResult;>;)TTResult;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/util/concurrent/ExecutionException;,
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .line 9
    invoke-static {}, Le/f/a/b/c/m/h;->a()V

    const-string v0, "Task must not be null"

    .line 10
    invoke-static {p0, v0}, Le/f/a/b/c/m/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    invoke-virtual {p0}, Le/f/a/b/h/g;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 12
    invoke-static {p0}, Le/f/a/b/h/n;->b(Le/f/a/b/h/g;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 13
    :cond_0
    new-instance v0, Le/f/a/b/h/k;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Le/f/a/b/h/k;-><init>(Le/f/a/b/h/g0;)V

    .line 14
    invoke-static {p0, v0}, Le/f/a/b/h/n;->a(Le/f/a/b/h/g;Le/f/a/b/h/l;)V

    .line 15
    invoke-virtual {v0}, Le/f/a/b/h/k;->b()V

    .line 16
    invoke-static {p0}, Le/f/a/b/h/n;->b(Le/f/a/b/h/g;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static a(Le/f/a/b/h/g;JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResult:",
            "Ljava/lang/Object;",
            ">(",
            "Le/f/a/b/h/g<",
            "TTResult;>;J",
            "Ljava/util/concurrent/TimeUnit;",
            ")TTResult;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/util/concurrent/ExecutionException;,
            Ljava/lang/InterruptedException;,
            Ljava/util/concurrent/TimeoutException;
        }
    .end annotation

    .line 17
    invoke-static {}, Le/f/a/b/c/m/h;->a()V

    const-string v0, "Task must not be null"

    .line 18
    invoke-static {p0, v0}, Le/f/a/b/c/m/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "TimeUnit must not be null"

    .line 19
    invoke-static {p3, v0}, Le/f/a/b/c/m/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    invoke-virtual {p0}, Le/f/a/b/h/g;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 21
    invoke-static {p0}, Le/f/a/b/h/n;->b(Le/f/a/b/h/g;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 22
    :cond_0
    new-instance v0, Le/f/a/b/h/k;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Le/f/a/b/h/k;-><init>(Le/f/a/b/h/g0;)V

    .line 23
    invoke-static {p0, v0}, Le/f/a/b/h/n;->a(Le/f/a/b/h/g;Le/f/a/b/h/l;)V

    .line 24
    invoke-virtual {v0, p1, p2, p3}, Le/f/a/b/h/k;->a(JLjava/util/concurrent/TimeUnit;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 25
    invoke-static {p0}, Le/f/a/b/h/n;->b(Le/f/a/b/h/g;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 26
    :cond_1
    new-instance p0, Ljava/util/concurrent/TimeoutException;

    const-string p1, "Timed out waiting for Task"

    invoke-direct {p0, p1}, Ljava/util/concurrent/TimeoutException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static a(Le/f/a/b/h/g;Le/f/a/b/h/l;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/a/b/h/g<",
            "*>;",
            "Le/f/a/b/h/l;",
            ")V"
        }
    .end annotation

    .line 38
    sget-object v0, Le/f/a/b/h/j;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {p0, v0, p1}, Le/f/a/b/h/g;->a(Ljava/util/concurrent/Executor;Le/f/a/b/h/e;)Le/f/a/b/h/g;

    .line 39
    sget-object v0, Le/f/a/b/h/j;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {p0, v0, p1}, Le/f/a/b/h/g;->a(Ljava/util/concurrent/Executor;Le/f/a/b/h/d;)Le/f/a/b/h/g;

    .line 40
    sget-object v0, Le/f/a/b/h/j;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {p0, v0, p1}, Le/f/a/b/h/g;->a(Ljava/util/concurrent/Executor;Le/f/a/b/h/b;)Le/f/a/b/h/g;

    return-void
.end method

.method public static b(Le/f/a/b/h/g;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResult:",
            "Ljava/lang/Object;",
            ">(",
            "Le/f/a/b/h/g<",
            "TTResult;>;)TTResult;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/util/concurrent/ExecutionException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Le/f/a/b/h/g;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Le/f/a/b/h/g;->b()Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 3
    :cond_0
    invoke-virtual {p0}, Le/f/a/b/h/g;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4
    new-instance p0, Ljava/util/concurrent/CancellationException;

    const-string v0, "Task is already canceled"

    invoke-direct {p0, v0}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 5
    :cond_1
    new-instance v0, Ljava/util/concurrent/ExecutionException;

    invoke-virtual {p0}, Le/f/a/b/h/g;->a()Ljava/lang/Exception;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/util/concurrent/ExecutionException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method
