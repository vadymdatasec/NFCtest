.class public final Le/f/a/b/h/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Le/f/a/b/h/g;

.field public final synthetic c:Le/f/a/b/h/a0;


# direct methods
.method public constructor <init>(Le/f/a/b/h/a0;Le/f/a/b/h/g;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le/f/a/b/h/b0;->c:Le/f/a/b/h/a0;

    iput-object p2, p0, Le/f/a/b/h/b0;->b:Le/f/a/b/h/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Le/f/a/b/h/b0;->c:Le/f/a/b/h/a0;

    invoke-static {v0}, Le/f/a/b/h/a0;->a(Le/f/a/b/h/a0;)Le/f/a/b/h/f;

    move-result-object v0

    iget-object v1, p0, Le/f/a/b/h/b0;->b:Le/f/a/b/h/g;

    invoke-virtual {v1}, Le/f/a/b/h/g;->b()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Le/f/a/b/h/f;->a(Ljava/lang/Object;)Le/f/a/b/h/g;

    move-result-object v0
    :try_end_0
    .catch Lcom/google/android/gms/tasks/RuntimeExecutionException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Le/f/a/b/h/b0;->c:Le/f/a/b/h/a0;

    new-instance v1, Ljava/lang/NullPointerException;

    const-string v2, "Continuation returned null"

    invoke-direct {v1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Le/f/a/b/h/a0;->a(Ljava/lang/Exception;)V

    return-void

    .line 3
    :cond_0
    sget-object v1, Le/f/a/b/h/j;->b:Ljava/util/concurrent/Executor;

    iget-object v2, p0, Le/f/a/b/h/b0;->c:Le/f/a/b/h/a0;

    invoke-virtual {v0, v1, v2}, Le/f/a/b/h/g;->a(Ljava/util/concurrent/Executor;Le/f/a/b/h/e;)Le/f/a/b/h/g;

    .line 4
    sget-object v1, Le/f/a/b/h/j;->b:Ljava/util/concurrent/Executor;

    iget-object v2, p0, Le/f/a/b/h/b0;->c:Le/f/a/b/h/a0;

    invoke-virtual {v0, v1, v2}, Le/f/a/b/h/g;->a(Ljava/util/concurrent/Executor;Le/f/a/b/h/d;)Le/f/a/b/h/g;

    .line 5
    sget-object v1, Le/f/a/b/h/j;->b:Ljava/util/concurrent/Executor;

    iget-object v2, p0, Le/f/a/b/h/b0;->c:Le/f/a/b/h/a0;

    invoke-virtual {v0, v1, v2}, Le/f/a/b/h/g;->a(Ljava/util/concurrent/Executor;Le/f/a/b/h/b;)Le/f/a/b/h/g;

    return-void

    :catch_0
    move-exception v0

    .line 6
    iget-object v1, p0, Le/f/a/b/h/b0;->c:Le/f/a/b/h/a0;

    invoke-virtual {v1, v0}, Le/f/a/b/h/a0;->a(Ljava/lang/Exception;)V

    return-void

    .line 7
    :catch_1
    iget-object v0, p0, Le/f/a/b/h/b0;->c:Le/f/a/b/h/a0;

    invoke-virtual {v0}, Le/f/a/b/h/a0;->a()V

    return-void

    :catch_2
    move-exception v0

    .line 8
    invoke-virtual {v0}, Ljava/lang/RuntimeException;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    instance-of v1, v1, Ljava/lang/Exception;

    if-eqz v1, :cond_1

    .line 9
    iget-object v1, p0, Le/f/a/b/h/b0;->c:Le/f/a/b/h/a0;

    invoke-virtual {v0}, Ljava/lang/RuntimeException;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    check-cast v0, Ljava/lang/Exception;

    invoke-virtual {v1, v0}, Le/f/a/b/h/a0;->a(Ljava/lang/Exception;)V

    return-void

    .line 10
    :cond_1
    iget-object v1, p0, Le/f/a/b/h/b0;->c:Le/f/a/b/h/a0;

    invoke-virtual {v1, v0}, Le/f/a/b/h/a0;->a(Ljava/lang/Exception;)V

    return-void
.end method
