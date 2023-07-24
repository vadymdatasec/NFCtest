.class public abstract Le/f/a/a/j/r;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a()Ljava/util/concurrent/Executor;
    .locals 2

    .line 1
    new-instance v0, Le/f/a/a/j/u;

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v1

    invoke-direct {v0, v1}, Le/f/a/a/j/u;-><init>(Ljava/util/concurrent/Executor;)V

    return-object v0
.end method
