.class public Le/f/c/l/e/m/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/a/b/h/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Le/f/a/b/h/f<",
        "Le/f/c/l/e/v/j/b;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Ljava/util/List;

.field public final synthetic b:Z

.field public final synthetic c:Ljava/util/concurrent/Executor;

.field public final synthetic d:Le/f/c/l/e/m/j0;


# direct methods
.method public constructor <init>(Le/f/c/l/e/m/j0;Ljava/util/List;ZLjava/util/concurrent/Executor;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le/f/c/l/e/m/i0;->d:Le/f/c/l/e/m/j0;

    iput-object p2, p0, Le/f/c/l/e/m/i0;->a:Ljava/util/List;

    iput-boolean p3, p0, Le/f/c/l/e/m/i0;->b:Z

    iput-object p4, p0, Le/f/c/l/e/m/i0;->c:Ljava/util/concurrent/Executor;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Le/f/c/l/e/v/j/b;)Le/f/a/b/h/g;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/c/l/e/v/j/b;",
            ")",
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

    const/4 v0, 0x0

    if-nez p1, :cond_0

    .line 2
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object p1

    const-string v1, "Received null app settings, cannot send reports during app startup."

    .line 3
    invoke-virtual {p1, v1}, Le/f/c/l/e/b;->d(Ljava/lang/String;)V

    .line 4
    invoke-static {v0}, Le/f/a/b/h/n;->a(Ljava/lang/Object;)Le/f/a/b/h/g;

    move-result-object p1

    return-object p1

    .line 5
    :cond_0
    iget-object v1, p0, Le/f/c/l/e/m/i0;->a:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le/f/c/l/e/t/g/d;

    .line 6
    invoke-interface {v2}, Le/f/c/l/e/t/g/d;->e()Le/f/c/l/e/t/g/c;

    move-result-object v3

    sget-object v4, Le/f/c/l/e/t/g/c;->b:Le/f/c/l/e/t/g/c;

    if-ne v3, v4, :cond_1

    .line 7
    iget-object v3, p1, Le/f/c/l/e/v/j/b;->e:Ljava/lang/String;

    .line 8
    invoke-interface {v2}, Le/f/c/l/e/t/g/d;->f()Ljava/io/File;

    move-result-object v2

    .line 9
    invoke-static {v3, v2}, Le/f/c/l/e/m/v0;->a(Ljava/lang/String;Ljava/io/File;)V

    goto :goto_0

    .line 10
    :cond_2
    iget-object v1, p0, Le/f/c/l/e/m/i0;->d:Le/f/c/l/e/m/j0;

    iget-object v1, v1, Le/f/c/l/e/m/j0;->b:Le/f/c/l/e/m/k0;

    iget-object v1, v1, Le/f/c/l/e/m/k0;->c:Le/f/c/l/e/m/v0;

    invoke-static {v1}, Le/f/c/l/e/m/v0;->d(Le/f/c/l/e/m/v0;)Le/f/a/b/h/g;

    .line 11
    iget-object v1, p0, Le/f/c/l/e/m/i0;->d:Le/f/c/l/e/m/j0;

    iget-object v1, v1, Le/f/c/l/e/m/j0;->b:Le/f/c/l/e/m/k0;

    iget-object v1, v1, Le/f/c/l/e/m/k0;->c:Le/f/c/l/e/m/v0;

    .line 12
    invoke-static {v1}, Le/f/c/l/e/m/v0;->f(Le/f/c/l/e/m/v0;)Le/f/c/l/e/t/c;

    move-result-object v1

    invoke-interface {v1, p1}, Le/f/c/l/e/t/c;->a(Le/f/c/l/e/v/j/b;)Le/f/c/l/e/t/f;

    move-result-object v1

    .line 13
    iget-object v2, p0, Le/f/c/l/e/m/i0;->a:Ljava/util/List;

    iget-boolean v3, p0, Le/f/c/l/e/m/i0;->b:Z

    iget-object v4, p0, Le/f/c/l/e/m/i0;->d:Le/f/c/l/e/m/j0;

    iget-object v4, v4, Le/f/c/l/e/m/j0;->b:Le/f/c/l/e/m/k0;

    iget v4, v4, Le/f/c/l/e/m/k0;->b:F

    invoke-virtual {v1, v2, v3, v4}, Le/f/c/l/e/t/f;->a(Ljava/util/List;ZF)V

    .line 14
    iget-object v1, p0, Le/f/c/l/e/m/i0;->d:Le/f/c/l/e/m/j0;

    iget-object v1, v1, Le/f/c/l/e/m/j0;->b:Le/f/c/l/e/m/k0;

    iget-object v1, v1, Le/f/c/l/e/m/k0;->c:Le/f/c/l/e/m/v0;

    invoke-static {v1}, Le/f/c/l/e/m/v0;->m(Le/f/c/l/e/m/v0;)Le/f/c/l/e/m/z1;

    move-result-object v1

    iget-object v2, p0, Le/f/c/l/e/m/i0;->c:Ljava/util/concurrent/Executor;

    .line 15
    invoke-static {p1}, Le/f/c/l/e/m/j1;->a(Le/f/c/l/e/v/j/b;)Le/f/c/l/e/m/j1;

    move-result-object p1

    .line 16
    invoke-virtual {v1, v2, p1}, Le/f/c/l/e/m/z1;->a(Ljava/util/concurrent/Executor;Le/f/c/l/e/m/j1;)Le/f/a/b/h/g;

    .line 17
    iget-object p1, p0, Le/f/c/l/e/m/i0;->d:Le/f/c/l/e/m/j0;

    iget-object p1, p1, Le/f/c/l/e/m/j0;->b:Le/f/c/l/e/m/k0;

    iget-object p1, p1, Le/f/c/l/e/m/k0;->c:Le/f/c/l/e/m/v0;

    iget-object p1, p1, Le/f/c/l/e/m/v0;->w:Le/f/a/b/h/h;

    invoke-virtual {p1, v0}, Le/f/a/b/h/h;->b(Ljava/lang/Object;)Z

    .line 18
    invoke-static {v0}, Le/f/a/b/h/n;->a(Ljava/lang/Object;)Le/f/a/b/h/g;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic a(Ljava/lang/Object;)Le/f/a/b/h/g;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    check-cast p1, Le/f/c/l/e/v/j/b;

    invoke-virtual {p0, p1}, Le/f/c/l/e/m/i0;->a(Le/f/c/l/e/v/j/b;)Le/f/a/b/h/g;

    move-result-object p1

    return-object p1
.end method
