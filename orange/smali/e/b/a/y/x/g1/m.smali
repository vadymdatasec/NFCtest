.class public Le/b/a/y/x/g1/m;
.super Le/b/a/e0/o;
.source "SourceFile"

# interfaces
.implements Le/b/a/y/x/g1/o;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Le/b/a/e0/o<",
        "Le/b/a/y/n;",
        "Le/b/a/y/x/y0<",
        "*>;>;",
        "Le/b/a/y/x/g1/o;"
    }
.end annotation


# instance fields
.field public d:Le/b/a/y/x/g1/n;


# direct methods
.method public constructor <init>(J)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Le/b/a/e0/o;-><init>(J)V

    return-void
.end method


# virtual methods
.method public a(Le/b/a/y/x/y0;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/y/x/y0<",
            "*>;)I"
        }
    .end annotation

    if-nez p1, :cond_0

    const/4 p1, 0x0

    .line 5
    invoke-super {p0, p1}, Le/b/a/e0/o;->b(Ljava/lang/Object;)I

    move-result p1

    return p1

    .line 6
    :cond_0
    invoke-interface {p1}, Le/b/a/y/x/y0;->b()I

    move-result p1

    return p1
.end method

.method public bridge synthetic a(Le/b/a/y/n;)Le/b/a/y/x/y0;
    .locals 0

    .line 3
    invoke-super {p0, p1}, Le/b/a/e0/o;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Le/b/a/y/x/y0;

    return-object p1
.end method

.method public bridge synthetic a(Le/b/a/y/n;Le/b/a/y/x/y0;)Le/b/a/y/x/y0;
    .locals 0

    .line 2
    invoke-super {p0, p1, p2}, Le/b/a/e0/o;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Le/b/a/y/x/y0;

    return-object p1
.end method

.method public a(I)V
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InlinedApi"
        }
    .end annotation

    const/16 v0, 0x28

    if-lt p1, v0, :cond_0

    .line 7
    invoke-virtual {p0}, Le/b/a/e0/o;->a()V

    goto :goto_0

    :cond_0
    const/16 v0, 0x14

    if-ge p1, v0, :cond_1

    const/16 v0, 0xf

    if-ne p1, v0, :cond_2

    .line 8
    :cond_1
    invoke-virtual {p0}, Le/b/a/e0/o;->c()J

    move-result-wide v0

    const-wide/16 v2, 0x2

    div-long/2addr v0, v2

    invoke-virtual {p0, v0, v1}, Le/b/a/e0/o;->a(J)V

    :cond_2
    :goto_0
    return-void
.end method

.method public a(Le/b/a/y/x/g1/n;)V
    .locals 0

    .line 4
    iput-object p1, p0, Le/b/a/y/x/g1/m;->d:Le/b/a/y/x/g1/n;

    return-void
.end method

.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Le/b/a/y/n;

    check-cast p2, Le/b/a/y/x/y0;

    invoke-virtual {p0, p1, p2}, Le/b/a/y/x/g1/m;->b(Le/b/a/y/n;Le/b/a/y/x/y0;)V

    return-void
.end method

.method public bridge synthetic b(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Le/b/a/y/x/y0;

    invoke-virtual {p0, p1}, Le/b/a/y/x/g1/m;->a(Le/b/a/y/x/y0;)I

    move-result p1

    return p1
.end method

.method public b(Le/b/a/y/n;Le/b/a/y/x/y0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/y/n;",
            "Le/b/a/y/x/y0<",
            "*>;)V"
        }
    .end annotation

    .line 2
    iget-object p1, p0, Le/b/a/y/x/g1/m;->d:Le/b/a/y/x/g1/n;

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    .line 3
    invoke-interface {p1, p2}, Le/b/a/y/x/g1/n;->a(Le/b/a/y/x/y0;)V

    :cond_0
    return-void
.end method
