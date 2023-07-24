.class public abstract Le/f/a/d/a/i/f;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Ljava/lang/Exception;)Le/f/a/d/a/i/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ResultT:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Exception;",
            ")",
            "Le/f/a/d/a/i/d<",
            "TResultT;>;"
        }
    .end annotation

    new-instance v0, Le/f/a/d/a/i/r;

    invoke-direct {v0}, Le/f/a/d/a/i/r;-><init>()V

    invoke-virtual {v0, p0}, Le/f/a/d/a/i/r;->a(Ljava/lang/Exception;)V

    return-object v0
.end method

.method public static a(Ljava/lang/Object;)Le/f/a/d/a/i/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ResultT:",
            "Ljava/lang/Object;",
            ">(TResultT;)",
            "Le/f/a/d/a/i/d<",
            "TResultT;>;"
        }
    .end annotation

    new-instance v0, Le/f/a/d/a/i/r;

    invoke-direct {v0}, Le/f/a/d/a/i/r;-><init>()V

    invoke-virtual {v0, p0}, Le/f/a/d/a/i/r;->a(Ljava/lang/Object;)V

    return-object v0
.end method

.method public static a(Le/f/a/d/a/i/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ResultT:",
            "Ljava/lang/Object;",
            ">(",
            "Le/f/a/d/a/i/d<",
            "TResultT;>;)TResultT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/util/concurrent/ExecutionException;,
            Ljava/lang/InterruptedException;
        }
    .end annotation

    const-string v0, "Task must not be null"

    invoke-static {p0, v0}, Le/f/a/d/a/e/l;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0}, Le/f/a/d/a/i/d;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Le/f/a/d/a/i/f;->b(Le/f/a/d/a/i/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, Le/f/a/d/a/i/s;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Le/f/a/d/a/i/s;-><init>([B)V

    invoke-static {p0, v0}, Le/f/a/d/a/i/f;->a(Le/f/a/d/a/i/d;Le/f/a/d/a/i/s;)V

    invoke-virtual {v0}, Le/f/a/d/a/i/s;->a()V

    invoke-static {p0}, Le/f/a/d/a/i/f;->b(Le/f/a/d/a/i/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static a(Le/f/a/d/a/i/d;Le/f/a/d/a/i/s;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/a/d/a/i/d<",
            "*>;",
            "Le/f/a/d/a/i/s;",
            ")V"
        }
    .end annotation

    sget-object v0, Le/f/a/d/a/i/e;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {p0, v0, p1}, Le/f/a/d/a/i/d;->a(Ljava/util/concurrent/Executor;Le/f/a/d/a/i/c;)Le/f/a/d/a/i/d;

    sget-object v0, Le/f/a/d/a/i/e;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {p0, v0, p1}, Le/f/a/d/a/i/d;->a(Ljava/util/concurrent/Executor;Le/f/a/d/a/i/b;)Le/f/a/d/a/i/d;

    return-void
.end method

.method public static b(Le/f/a/d/a/i/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ResultT:",
            "Ljava/lang/Object;",
            ">(",
            "Le/f/a/d/a/i/d<",
            "TResultT;>;)TResultT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/util/concurrent/ExecutionException;
        }
    .end annotation

    invoke-virtual {p0}, Le/f/a/d/a/i/d;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Le/f/a/d/a/i/d;->b()Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, Ljava/util/concurrent/ExecutionException;

    invoke-virtual {p0}, Le/f/a/d/a/i/d;->a()Ljava/lang/Exception;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/util/concurrent/ExecutionException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method
