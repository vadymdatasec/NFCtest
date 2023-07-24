.class public final Le/f/a/b/h/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Le/f/a/b/h/g;

.field public final synthetic c:Le/f/a/b/h/q;


# direct methods
.method public constructor <init>(Le/f/a/b/h/q;Le/f/a/b/h/g;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le/f/a/b/h/r;->c:Le/f/a/b/h/q;

    iput-object p2, p0, Le/f/a/b/h/r;->b:Le/f/a/b/h/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Le/f/a/b/h/r;->c:Le/f/a/b/h/q;

    invoke-static {v0}, Le/f/a/b/h/q;->a(Le/f/a/b/h/q;)Le/f/a/b/h/a;

    move-result-object v0

    iget-object v1, p0, Le/f/a/b/h/r;->b:Le/f/a/b/h/g;

    invoke-interface {v0, v1}, Le/f/a/b/h/a;->a(Le/f/a/b/h/g;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/f/a/b/h/g;
    :try_end_0
    .catch Lcom/google/android/gms/tasks/RuntimeExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Le/f/a/b/h/r;->c:Le/f/a/b/h/q;

    new-instance v1, Ljava/lang/NullPointerException;

    const-string v2, "Continuation returned null"

    invoke-direct {v1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Le/f/a/b/h/q;->a(Ljava/lang/Exception;)V

    return-void

    .line 3
    :cond_0
    sget-object v1, Le/f/a/b/h/j;->b:Ljava/util/concurrent/Executor;

    iget-object v2, p0, Le/f/a/b/h/r;->c:Le/f/a/b/h/q;

    invoke-virtual {v0, v1, v2}, Le/f/a/b/h/g;->a(Ljava/util/concurrent/Executor;Le/f/a/b/h/e;)Le/f/a/b/h/g;

    .line 4
    sget-object v1, Le/f/a/b/h/j;->b:Ljava/util/concurrent/Executor;

    iget-object v2, p0, Le/f/a/b/h/r;->c:Le/f/a/b/h/q;

    invoke-virtual {v0, v1, v2}, Le/f/a/b/h/g;->a(Ljava/util/concurrent/Executor;Le/f/a/b/h/d;)Le/f/a/b/h/g;

    .line 5
    sget-object v1, Le/f/a/b/h/j;->b:Ljava/util/concurrent/Executor;

    iget-object v2, p0, Le/f/a/b/h/r;->c:Le/f/a/b/h/q;

    invoke-virtual {v0, v1, v2}, Le/f/a/b/h/g;->a(Ljava/util/concurrent/Executor;Le/f/a/b/h/b;)Le/f/a/b/h/g;

    return-void

    :catch_0
    move-exception v0

    .line 6
    iget-object v1, p0, Le/f/a/b/h/r;->c:Le/f/a/b/h/q;

    invoke-static {v1}, Le/f/a/b/h/q;->b(Le/f/a/b/h/q;)Le/f/a/b/h/f0;

    move-result-object v1

    invoke-virtual {v1, v0}, Le/f/a/b/h/f0;->a(Ljava/lang/Exception;)V

    return-void

    :catch_1
    move-exception v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/RuntimeException;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    instance-of v1, v1, Ljava/lang/Exception;

    if-eqz v1, :cond_1

    .line 8
    iget-object v1, p0, Le/f/a/b/h/r;->c:Le/f/a/b/h/q;

    invoke-static {v1}, Le/f/a/b/h/q;->b(Le/f/a/b/h/q;)Le/f/a/b/h/f0;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/RuntimeException;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    check-cast v0, Ljava/lang/Exception;

    invoke-virtual {v1, v0}, Le/f/a/b/h/f0;->a(Ljava/lang/Exception;)V

    return-void

    .line 9
    :cond_1
    iget-object v1, p0, Le/f/a/b/h/r;->c:Le/f/a/b/h/q;

    invoke-static {v1}, Le/f/a/b/h/q;->b(Le/f/a/b/h/q;)Le/f/a/b/h/f0;

    move-result-object v1

    invoke-virtual {v1, v0}, Le/f/a/b/h/f0;->a(Ljava/lang/Exception;)V

    return-void
.end method
