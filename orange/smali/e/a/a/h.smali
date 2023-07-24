.class public Le/a/a/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/a/a/w;


# instance fields
.field public final a:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>(Landroid/os/Handler;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Le/a/a/f;

    invoke-direct {v0, p0, p1}, Le/a/a/f;-><init>(Le/a/a/h;Landroid/os/Handler;)V

    iput-object v0, p0, Le/a/a/h;->a:Ljava/util/concurrent/Executor;

    return-void
.end method


# virtual methods
.method public a(Le/a/a/p;Lcom/android/volley/VolleyError;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/a/a/p<",
            "*>;",
            "Lcom/android/volley/VolleyError;",
            ")V"
        }
    .end annotation

    const-string v0, "post-error"

    .line 5
    invoke-virtual {p1, v0}, Le/a/a/p;->a(Ljava/lang/String;)V

    .line 6
    invoke-static {p2}, Le/a/a/v;->a(Lcom/android/volley/VolleyError;)Le/a/a/v;

    move-result-object p2

    .line 7
    iget-object v0, p0, Le/a/a/h;->a:Ljava/util/concurrent/Executor;

    new-instance v1, Le/a/a/g;

    const/4 v2, 0x0

    invoke-direct {v1, p1, p2, v2}, Le/a/a/g;-><init>(Le/a/a/p;Le/a/a/v;Ljava/lang/Runnable;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public a(Le/a/a/p;Le/a/a/v;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/a/a/p<",
            "*>;",
            "Le/a/a/v<",
            "*>;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, p2, v0}, Le/a/a/h;->a(Le/a/a/p;Le/a/a/v;Ljava/lang/Runnable;)V

    return-void
.end method

.method public a(Le/a/a/p;Le/a/a/v;Ljava/lang/Runnable;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/a/a/p<",
            "*>;",
            "Le/a/a/v<",
            "*>;",
            "Ljava/lang/Runnable;",
            ")V"
        }
    .end annotation

    .line 2
    invoke-virtual {p1}, Le/a/a/p;->s()V

    const-string v0, "post-response"

    .line 3
    invoke-virtual {p1, v0}, Le/a/a/p;->a(Ljava/lang/String;)V

    .line 4
    iget-object v0, p0, Le/a/a/h;->a:Ljava/util/concurrent/Executor;

    new-instance v1, Le/a/a/g;

    invoke-direct {v1, p1, p2, p3}, Le/a/a/g;-><init>(Le/a/a/p;Le/a/a/v;Ljava/lang/Runnable;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
