.class public Le/f/c/l/e/m/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Le/f/a/b/h/g<",
        "Ljava/lang/Void;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:Ljava/lang/Boolean;

.field public final synthetic b:Le/f/c/l/e/m/k0;


# direct methods
.method public constructor <init>(Le/f/c/l/e/m/k0;Ljava/lang/Boolean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le/f/c/l/e/m/j0;->b:Le/f/c/l/e/m/k0;

    iput-object p2, p0, Le/f/c/l/e/m/j0;->a:Ljava/lang/Boolean;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public call()Le/f/a/b/h/g;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Le/f/a/b/h/g<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 2
    iget-object v0, p0, Le/f/c/l/e/m/j0;->b:Le/f/c/l/e/m/k0;

    iget-object v0, v0, Le/f/c/l/e/m/k0;->c:Le/f/c/l/e/m/v0;

    invoke-static {v0}, Le/f/c/l/e/m/v0;->e(Le/f/c/l/e/m/v0;)Le/f/c/l/e/t/a;

    move-result-object v0

    invoke-virtual {v0}, Le/f/c/l/e/t/a;->b()Ljava/util/List;

    move-result-object v0

    .line 3
    iget-object v1, p0, Le/f/c/l/e/m/j0;->a:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_0

    .line 4
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object v1

    const-string v2, "Reports are being deleted."

    invoke-virtual {v1, v2}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V

    .line 5
    iget-object v1, p0, Le/f/c/l/e/m/j0;->b:Le/f/c/l/e/m/k0;

    iget-object v1, v1, Le/f/c/l/e/m/k0;->c:Le/f/c/l/e/m/v0;

    invoke-virtual {v1}, Le/f/c/l/e/m/v0;->l()[Ljava/io/File;

    move-result-object v1

    invoke-static {v1}, Le/f/c/l/e/m/v0;->b([Ljava/io/File;)V

    .line 6
    iget-object v1, p0, Le/f/c/l/e/m/j0;->b:Le/f/c/l/e/m/k0;

    iget-object v1, v1, Le/f/c/l/e/m/k0;->c:Le/f/c/l/e/m/v0;

    invoke-static {v1}, Le/f/c/l/e/m/v0;->e(Le/f/c/l/e/m/v0;)Le/f/c/l/e/t/a;

    move-result-object v1

    invoke-virtual {v1, v0}, Le/f/c/l/e/t/a;->a(Ljava/util/List;)V

    .line 7
    iget-object v0, p0, Le/f/c/l/e/m/j0;->b:Le/f/c/l/e/m/k0;

    iget-object v0, v0, Le/f/c/l/e/m/k0;->c:Le/f/c/l/e/m/v0;

    invoke-static {v0}, Le/f/c/l/e/m/v0;->m(Le/f/c/l/e/m/v0;)Le/f/c/l/e/m/z1;

    move-result-object v0

    invoke-virtual {v0}, Le/f/c/l/e/m/z1;->a()V

    .line 8
    iget-object v0, p0, Le/f/c/l/e/m/j0;->b:Le/f/c/l/e/m/k0;

    iget-object v0, v0, Le/f/c/l/e/m/k0;->c:Le/f/c/l/e/m/v0;

    iget-object v0, v0, Le/f/c/l/e/m/v0;->w:Le/f/a/b/h/h;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Le/f/a/b/h/h;->b(Ljava/lang/Object;)Z

    .line 9
    invoke-static {v1}, Le/f/a/b/h/n;->a(Ljava/lang/Object;)Le/f/a/b/h/g;

    move-result-object v0

    return-object v0

    .line 10
    :cond_0
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object v1

    const-string v2, "Reports are being sent."

    invoke-virtual {v1, v2}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V

    .line 11
    iget-object v1, p0, Le/f/c/l/e/m/j0;->a:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    .line 12
    iget-object v2, p0, Le/f/c/l/e/m/j0;->b:Le/f/c/l/e/m/k0;

    iget-object v2, v2, Le/f/c/l/e/m/k0;->c:Le/f/c/l/e/m/v0;

    invoke-static {v2}, Le/f/c/l/e/m/v0;->b(Le/f/c/l/e/m/v0;)Le/f/c/l/e/m/i1;

    move-result-object v2

    invoke-virtual {v2, v1}, Le/f/c/l/e/m/i1;->a(Z)V

    .line 13
    iget-object v2, p0, Le/f/c/l/e/m/j0;->b:Le/f/c/l/e/m/k0;

    iget-object v2, v2, Le/f/c/l/e/m/k0;->c:Le/f/c/l/e/m/v0;

    invoke-static {v2}, Le/f/c/l/e/m/v0;->c(Le/f/c/l/e/m/v0;)Le/f/c/l/e/m/o;

    move-result-object v2

    invoke-virtual {v2}, Le/f/c/l/e/m/o;->b()Ljava/util/concurrent/Executor;

    move-result-object v2

    .line 14
    iget-object v3, p0, Le/f/c/l/e/m/j0;->b:Le/f/c/l/e/m/k0;

    iget-object v3, v3, Le/f/c/l/e/m/k0;->a:Le/f/a/b/h/g;

    new-instance v4, Le/f/c/l/e/m/i0;

    invoke-direct {v4, p0, v0, v1, v2}, Le/f/c/l/e/m/i0;-><init>(Le/f/c/l/e/m/j0;Ljava/util/List;ZLjava/util/concurrent/Executor;)V

    invoke-virtual {v3, v2, v4}, Le/f/a/b/h/g;->a(Ljava/util/concurrent/Executor;Le/f/a/b/h/f;)Le/f/a/b/h/g;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Le/f/c/l/e/m/j0;->call()Le/f/a/b/h/g;

    move-result-object v0

    return-object v0
.end method
