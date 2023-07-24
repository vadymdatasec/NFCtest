.class public Le/f/c/l/e/m/f0;
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
.field public final synthetic a:Ljava/util/concurrent/Executor;

.field public final synthetic b:Le/f/c/l/e/m/g0;


# direct methods
.method public constructor <init>(Le/f/c/l/e/m/g0;Ljava/util/concurrent/Executor;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le/f/c/l/e/m/f0;->b:Le/f/c/l/e/m/g0;

    iput-object p2, p0, Le/f/c/l/e/m/f0;->a:Ljava/util/concurrent/Executor;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Le/f/c/l/e/v/j/b;)Le/f/a/b/h/g;
    .locals 4
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

    if-nez p1, :cond_0

    .line 2
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object p1

    const-string v0, "Received null app settings, cannot send reports at crash time."

    .line 3
    invoke-virtual {p1, v0}, Le/f/c/l/e/b;->d(Ljava/lang/String;)V

    const/4 p1, 0x0

    .line 4
    invoke-static {p1}, Le/f/a/b/h/n;->a(Ljava/lang/Object;)Le/f/a/b/h/g;

    move-result-object p1

    return-object p1

    .line 5
    :cond_0
    iget-object v0, p0, Le/f/c/l/e/m/f0;->b:Le/f/c/l/e/m/g0;

    iget-object v0, v0, Le/f/c/l/e/m/g0;->e:Le/f/c/l/e/m/v0;

    const/4 v1, 0x1

    invoke-static {v0, p1, v1}, Le/f/c/l/e/m/v0;->a(Le/f/c/l/e/m/v0;Le/f/c/l/e/v/j/b;Z)V

    const/4 v0, 0x2

    new-array v0, v0, [Le/f/a/b/h/g;

    const/4 v2, 0x0

    .line 6
    iget-object v3, p0, Le/f/c/l/e/m/f0;->b:Le/f/c/l/e/m/g0;

    iget-object v3, v3, Le/f/c/l/e/m/g0;->e:Le/f/c/l/e/m/v0;

    .line 7
    invoke-static {v3}, Le/f/c/l/e/m/v0;->d(Le/f/c/l/e/m/v0;)Le/f/a/b/h/g;

    move-result-object v3

    aput-object v3, v0, v2

    iget-object v2, p0, Le/f/c/l/e/m/f0;->b:Le/f/c/l/e/m/g0;

    iget-object v2, v2, Le/f/c/l/e/m/g0;->e:Le/f/c/l/e/m/v0;

    .line 8
    invoke-static {v2}, Le/f/c/l/e/m/v0;->m(Le/f/c/l/e/m/v0;)Le/f/c/l/e/m/z1;

    move-result-object v2

    iget-object v3, p0, Le/f/c/l/e/m/f0;->a:Ljava/util/concurrent/Executor;

    .line 9
    invoke-static {p1}, Le/f/c/l/e/m/j1;->a(Le/f/c/l/e/v/j/b;)Le/f/c/l/e/m/j1;

    move-result-object p1

    .line 10
    invoke-virtual {v2, v3, p1}, Le/f/c/l/e/m/z1;->a(Ljava/util/concurrent/Executor;Le/f/c/l/e/m/j1;)Le/f/a/b/h/g;

    move-result-object p1

    aput-object p1, v0, v1

    .line 11
    invoke-static {v0}, Le/f/a/b/h/n;->a([Le/f/a/b/h/g;)Le/f/a/b/h/g;

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

    invoke-virtual {p0, p1}, Le/f/c/l/e/m/f0;->a(Le/f/c/l/e/v/j/b;)Le/f/a/b/h/g;

    move-result-object p1

    return-object p1
.end method
