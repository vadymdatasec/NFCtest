.class public Le/f/c/l/e/m/g0;
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
.field public final synthetic a:Ljava/util/Date;

.field public final synthetic b:Ljava/lang/Throwable;

.field public final synthetic c:Ljava/lang/Thread;

.field public final synthetic d:Le/f/c/l/e/v/f;

.field public final synthetic e:Le/f/c/l/e/m/v0;


# direct methods
.method public constructor <init>(Le/f/c/l/e/m/v0;Ljava/util/Date;Ljava/lang/Throwable;Ljava/lang/Thread;Le/f/c/l/e/v/f;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le/f/c/l/e/m/g0;->e:Le/f/c/l/e/m/v0;

    iput-object p2, p0, Le/f/c/l/e/m/g0;->a:Ljava/util/Date;

    iput-object p3, p0, Le/f/c/l/e/m/g0;->b:Ljava/lang/Throwable;

    iput-object p4, p0, Le/f/c/l/e/m/g0;->c:Ljava/lang/Thread;

    iput-object p5, p0, Le/f/c/l/e/m/g0;->d:Le/f/c/l/e/v/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public call()Le/f/a/b/h/g;
    .locals 10
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
    iget-object v0, p0, Le/f/c/l/e/m/g0;->a:Ljava/util/Date;

    invoke-static {v0}, Le/f/c/l/e/m/v0;->a(Ljava/util/Date;)J

    move-result-wide v7

    .line 3
    iget-object v0, p0, Le/f/c/l/e/m/g0;->e:Le/f/c/l/e/m/v0;

    invoke-static {v0}, Le/f/c/l/e/m/v0;->k(Le/f/c/l/e/m/v0;)Ljava/lang/String;

    move-result-object v0

    const/4 v9, 0x0

    if-nez v0, :cond_0

    .line 4
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object v0

    const-string v1, "Tried to write a fatal exception while no session was open."

    .line 5
    invoke-virtual {v0, v1}, Le/f/c/l/e/b;->b(Ljava/lang/String;)V

    .line 6
    invoke-static {v9}, Le/f/a/b/h/n;->a(Ljava/lang/Object;)Le/f/a/b/h/g;

    move-result-object v0

    return-object v0

    .line 7
    :cond_0
    iget-object v1, p0, Le/f/c/l/e/m/g0;->e:Le/f/c/l/e/m/v0;

    invoke-static {v1}, Le/f/c/l/e/m/v0;->l(Le/f/c/l/e/m/v0;)Le/f/c/l/e/m/c1;

    move-result-object v1

    invoke-virtual {v1}, Le/f/c/l/e/m/c1;->a()Z

    .line 8
    iget-object v1, p0, Le/f/c/l/e/m/g0;->e:Le/f/c/l/e/m/v0;

    invoke-static {v1}, Le/f/c/l/e/m/v0;->m(Le/f/c/l/e/m/v0;)Le/f/c/l/e/m/z1;

    move-result-object v1

    iget-object v2, p0, Le/f/c/l/e/m/g0;->b:Ljava/lang/Throwable;

    iget-object v3, p0, Le/f/c/l/e/m/g0;->c:Ljava/lang/Thread;

    .line 9
    invoke-static {v0}, Le/f/c/l/e/m/v0;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    move-wide v5, v7

    .line 10
    invoke-virtual/range {v1 .. v6}, Le/f/c/l/e/m/z1;->a(Ljava/lang/Throwable;Ljava/lang/Thread;Ljava/lang/String;J)V

    .line 11
    iget-object v1, p0, Le/f/c/l/e/m/g0;->e:Le/f/c/l/e/m/v0;

    iget-object v2, p0, Le/f/c/l/e/m/g0;->c:Ljava/lang/Thread;

    iget-object v3, p0, Le/f/c/l/e/m/g0;->b:Ljava/lang/Throwable;

    move-object v4, v0

    invoke-static/range {v1 .. v6}, Le/f/c/l/e/m/v0;->a(Le/f/c/l/e/m/v0;Ljava/lang/Thread;Ljava/lang/Throwable;Ljava/lang/String;J)V

    .line 12
    iget-object v0, p0, Le/f/c/l/e/m/g0;->e:Le/f/c/l/e/m/v0;

    iget-object v1, p0, Le/f/c/l/e/m/g0;->a:Ljava/util/Date;

    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Le/f/c/l/e/m/v0;->a(Le/f/c/l/e/m/v0;J)V

    .line 13
    iget-object v0, p0, Le/f/c/l/e/m/g0;->d:Le/f/c/l/e/v/f;

    invoke-interface {v0}, Le/f/c/l/e/v/f;->b()Le/f/c/l/e/v/j/e;

    move-result-object v0

    .line 14
    invoke-interface {v0}, Le/f/c/l/e/v/j/e;->a()Le/f/c/l/e/v/j/d;

    move-result-object v1

    iget v1, v1, Le/f/c/l/e/v/j/d;->a:I

    .line 15
    invoke-interface {v0}, Le/f/c/l/e/v/j/e;->a()Le/f/c/l/e/v/j/d;

    move-result-object v0

    iget v0, v0, Le/f/c/l/e/v/j/d;->b:I

    .line 16
    iget-object v2, p0, Le/f/c/l/e/m/g0;->e:Le/f/c/l/e/m/v0;

    invoke-virtual {v2, v1}, Le/f/c/l/e/m/v0;->a(I)V

    .line 17
    iget-object v1, p0, Le/f/c/l/e/m/g0;->e:Le/f/c/l/e/m/v0;

    invoke-static {v1}, Le/f/c/l/e/m/v0;->a(Le/f/c/l/e/m/v0;)V

    .line 18
    iget-object v1, p0, Le/f/c/l/e/m/g0;->e:Le/f/c/l/e/m/v0;

    invoke-virtual {v1, v0}, Le/f/c/l/e/m/v0;->d(I)V

    .line 19
    iget-object v0, p0, Le/f/c/l/e/m/g0;->e:Le/f/c/l/e/m/v0;

    invoke-static {v0}, Le/f/c/l/e/m/v0;->b(Le/f/c/l/e/m/v0;)Le/f/c/l/e/m/i1;

    move-result-object v0

    invoke-virtual {v0}, Le/f/c/l/e/m/i1;->b()Z

    move-result v0

    if-nez v0, :cond_1

    .line 20
    invoke-static {v9}, Le/f/a/b/h/n;->a(Ljava/lang/Object;)Le/f/a/b/h/g;

    move-result-object v0

    return-object v0

    .line 21
    :cond_1
    iget-object v0, p0, Le/f/c/l/e/m/g0;->e:Le/f/c/l/e/m/v0;

    invoke-static {v0}, Le/f/c/l/e/m/v0;->c(Le/f/c/l/e/m/v0;)Le/f/c/l/e/m/o;

    move-result-object v0

    invoke-virtual {v0}, Le/f/c/l/e/m/o;->b()Ljava/util/concurrent/Executor;

    move-result-object v0

    .line 22
    iget-object v1, p0, Le/f/c/l/e/m/g0;->d:Le/f/c/l/e/v/f;

    .line 23
    invoke-interface {v1}, Le/f/c/l/e/v/f;->a()Le/f/a/b/h/g;

    move-result-object v1

    new-instance v2, Le/f/c/l/e/m/f0;

    invoke-direct {v2, p0, v0}, Le/f/c/l/e/m/f0;-><init>(Le/f/c/l/e/m/g0;Ljava/util/concurrent/Executor;)V

    .line 24
    invoke-virtual {v1, v0, v2}, Le/f/a/b/h/g;->a(Ljava/util/concurrent/Executor;Le/f/a/b/h/f;)Le/f/a/b/h/g;

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
    invoke-virtual {p0}, Le/f/c/l/e/m/g0;->call()Le/f/a/b/h/g;

    move-result-object v0

    return-object v0
.end method
