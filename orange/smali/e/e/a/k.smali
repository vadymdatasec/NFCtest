.class public final Le/e/a/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/e/a/u;


# instance fields
.field public final synthetic a:Le/e/a/o;


# direct methods
.method public constructor <init>(Le/e/a/o;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Le/e/a/k;->a:Le/e/a/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    iget-object v0, p0, Le/e/a/k;->a:Le/e/a/o;

    invoke-static {v0}, Le/e/a/o;->f(Le/e/a/o;)Le/e/a/r;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Le/e/a/k;->a:Le/e/a/o;

    invoke-interface {v0, v1}, Le/e/a/r;->a(Le/e/a/o;)V

    :cond_0
    return-void
.end method

.method public b()V
    .locals 2

    .line 1
    iget-object v0, p0, Le/e/a/k;->a:Le/e/a/o;

    invoke-virtual {v0}, Le/e/a/o;->b()V

    .line 2
    iget-object v0, p0, Le/e/a/k;->a:Le/e/a/o;

    invoke-static {v0}, Le/e/a/o;->f(Le/e/a/o;)Le/e/a/r;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Le/e/a/k;->a:Le/e/a/o;

    invoke-interface {v0, v1}, Le/e/a/r;->b(Le/e/a/o;)V

    :cond_0
    return-void
.end method
