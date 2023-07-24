.class public Le/f/c/l/e/g;
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
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Le/f/c/l/e/v/e;

.field public final synthetic c:Ljava/util/concurrent/Executor;

.field public final synthetic d:Le/f/c/l/e/j;


# direct methods
.method public constructor <init>(Le/f/c/l/e/j;Ljava/lang/String;Le/f/c/l/e/v/e;Ljava/util/concurrent/Executor;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le/f/c/l/e/g;->d:Le/f/c/l/e/j;

    iput-object p2, p0, Le/f/c/l/e/g;->a:Ljava/lang/String;

    iput-object p3, p0, Le/f/c/l/e/g;->b:Le/f/c/l/e/v/e;

    iput-object p4, p0, Le/f/c/l/e/g;->c:Ljava/util/concurrent/Executor;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Le/f/c/l/e/v/j/b;)Le/f/a/b/h/g;
    .locals 6
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

    .line 2
    :try_start_0
    iget-object v0, p0, Le/f/c/l/e/g;->d:Le/f/c/l/e/j;

    iget-object v2, p0, Le/f/c/l/e/g;->a:Ljava/lang/String;

    iget-object v3, p0, Le/f/c/l/e/g;->b:Le/f/c/l/e/v/e;

    iget-object v4, p0, Le/f/c/l/e/g;->c:Ljava/util/concurrent/Executor;

    const/4 v5, 0x1

    move-object v1, p1

    invoke-static/range {v0 .. v5}, Le/f/c/l/e/j;->a(Le/f/c/l/e/j;Le/f/c/l/e/v/j/b;Ljava/lang/String;Le/f/c/l/e/v/e;Ljava/util/concurrent/Executor;Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p1, 0x0

    return-object p1

    :catch_0
    move-exception p1

    .line 3
    invoke-static {}, Le/f/c/l/e/b;->a()Le/f/c/l/e/b;

    move-result-object v0

    const-string v1, "Error performing auto configuration."

    invoke-virtual {v0, v1, p1}, Le/f/c/l/e/b;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 4
    throw p1
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

    invoke-virtual {p0, p1}, Le/f/c/l/e/g;->a(Le/f/c/l/e/v/j/b;)Le/f/a/b/h/g;

    move-result-object p1

    return-object p1
.end method
