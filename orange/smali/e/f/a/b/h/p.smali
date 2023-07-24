.class public final Le/f/a/b/h/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Le/f/a/b/h/g;

.field public final synthetic c:Le/f/a/b/h/o;


# direct methods
.method public constructor <init>(Le/f/a/b/h/o;Le/f/a/b/h/g;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le/f/a/b/h/p;->c:Le/f/a/b/h/o;

    iput-object p2, p0, Le/f/a/b/h/p;->b:Le/f/a/b/h/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Le/f/a/b/h/p;->b:Le/f/a/b/h/g;

    invoke-virtual {v0}, Le/f/a/b/h/g;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Le/f/a/b/h/p;->c:Le/f/a/b/h/o;

    invoke-static {v0}, Le/f/a/b/h/o;->a(Le/f/a/b/h/o;)Le/f/a/b/h/f0;

    move-result-object v0

    invoke-virtual {v0}, Le/f/a/b/h/f0;->f()Z

    return-void

    .line 3
    :cond_0
    :try_start_0
    iget-object v0, p0, Le/f/a/b/h/p;->c:Le/f/a/b/h/o;

    invoke-static {v0}, Le/f/a/b/h/o;->b(Le/f/a/b/h/o;)Le/f/a/b/h/a;

    move-result-object v0

    iget-object v1, p0, Le/f/a/b/h/p;->b:Le/f/a/b/h/g;

    invoke-interface {v0, v1}, Le/f/a/b/h/a;->a(Le/f/a/b/h/g;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Lcom/google/android/gms/tasks/RuntimeExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    iget-object v1, p0, Le/f/a/b/h/p;->c:Le/f/a/b/h/o;

    invoke-static {v1}, Le/f/a/b/h/o;->a(Le/f/a/b/h/o;)Le/f/a/b/h/f0;

    move-result-object v1

    invoke-virtual {v1, v0}, Le/f/a/b/h/f0;->a(Ljava/lang/Object;)V

    return-void

    :catch_0
    move-exception v0

    .line 5
    iget-object v1, p0, Le/f/a/b/h/p;->c:Le/f/a/b/h/o;

    invoke-static {v1}, Le/f/a/b/h/o;->a(Le/f/a/b/h/o;)Le/f/a/b/h/f0;

    move-result-object v1

    invoke-virtual {v1, v0}, Le/f/a/b/h/f0;->a(Ljava/lang/Exception;)V

    return-void

    :catch_1
    move-exception v0

    .line 6
    invoke-virtual {v0}, Ljava/lang/RuntimeException;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    instance-of v1, v1, Ljava/lang/Exception;

    if-eqz v1, :cond_1

    .line 7
    iget-object v1, p0, Le/f/a/b/h/p;->c:Le/f/a/b/h/o;

    invoke-static {v1}, Le/f/a/b/h/o;->a(Le/f/a/b/h/o;)Le/f/a/b/h/f0;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/RuntimeException;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    check-cast v0, Ljava/lang/Exception;

    invoke-virtual {v1, v0}, Le/f/a/b/h/f0;->a(Ljava/lang/Exception;)V

    return-void

    .line 8
    :cond_1
    iget-object v1, p0, Le/f/a/b/h/p;->c:Le/f/a/b/h/o;

    invoke-static {v1}, Le/f/a/b/h/o;->a(Le/f/a/b/h/o;)Le/f/a/b/h/f0;

    move-result-object v1

    invoke-virtual {v1, v0}, Le/f/a/b/h/f0;->a(Ljava/lang/Exception;)V

    return-void
.end method
