.class public Le/h/b/a/g;
.super Le/b/a/u;
.source "SourceFile"


# direct methods
.method public constructor <init>(Le/b/a/d;Le/b/a/z/m;Le/b/a/z/w;Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Le/b/a/u;-><init>(Le/b/a/d;Le/b/a/z/m;Le/b/a/z/w;Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Class;)Le/b/a/s;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Le/h/b/a/g;->a(Ljava/lang/Class;)Le/h/b/a/f;

    move-result-object p1

    return-object p1
.end method

.method public a(Landroid/net/Uri;)Le/h/b/a/f;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            ")",
            "Le/h/b/a/f<",
            "Landroid/graphics/drawable/Drawable;",
            ">;"
        }
    .end annotation

    .line 4
    invoke-super {p0, p1}, Le/b/a/u;->a(Landroid/net/Uri;)Le/b/a/s;

    move-result-object p1

    check-cast p1, Le/h/b/a/f;

    return-object p1
.end method

.method public a(Ljava/lang/Class;)Le/h/b/a/f;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ResourceType:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TResourceType;>;)",
            "Le/h/b/a/f<",
            "TResourceType;>;"
        }
    .end annotation

    .line 2
    new-instance v0, Le/h/b/a/f;

    iget-object v1, p0, Le/b/a/u;->b:Le/b/a/d;

    iget-object v2, p0, Le/b/a/u;->c:Landroid/content/Context;

    invoke-direct {v0, v1, p0, p1, v2}, Le/h/b/a/f;-><init>(Le/b/a/d;Le/b/a/u;Ljava/lang/Class;Landroid/content/Context;)V

    return-object v0
.end method

.method public a(Ljava/lang/Integer;)Le/h/b/a/f;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Integer;",
            ")",
            "Le/h/b/a/f<",
            "Landroid/graphics/drawable/Drawable;",
            ">;"
        }
    .end annotation

    .line 5
    invoke-super {p0, p1}, Le/b/a/u;->a(Ljava/lang/Integer;)Le/b/a/s;

    move-result-object p1

    check-cast p1, Le/h/b/a/f;

    return-object p1
.end method

.method public a(Ljava/lang/String;)Le/h/b/a/f;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Le/h/b/a/f<",
            "Landroid/graphics/drawable/Drawable;",
            ">;"
        }
    .end annotation

    .line 3
    invoke-super {p0, p1}, Le/b/a/u;->a(Ljava/lang/String;)Le/b/a/s;

    move-result-object p1

    check-cast p1, Le/h/b/a/f;

    return-object p1
.end method

.method public a(Le/b/a/c0/j;)V
    .locals 1

    .line 6
    instance-of v0, p1, Le/h/b/a/e;

    if-eqz v0, :cond_0

    .line 7
    invoke-super {p0, p1}, Le/b/a/u;->a(Le/b/a/c0/j;)V

    goto :goto_0

    .line 8
    :cond_0
    new-instance v0, Le/h/b/a/e;

    invoke-direct {v0}, Le/h/b/a/e;-><init>()V

    invoke-virtual {v0, p1}, Le/h/b/a/e;->a(Le/b/a/c0/a;)Le/h/b/a/e;

    move-result-object p1

    invoke-super {p0, p1}, Le/b/a/u;->a(Le/b/a/c0/j;)V

    :goto_0
    return-void
.end method

.method public bridge synthetic d()Le/b/a/s;
    .locals 1

    .line 1
    invoke-virtual {p0}, Le/h/b/a/g;->d()Le/h/b/a/f;

    move-result-object v0

    return-object v0
.end method

.method public d()Le/h/b/a/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Le/h/b/a/f<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    .line 2
    invoke-super {p0}, Le/b/a/u;->d()Le/b/a/s;

    move-result-object v0

    check-cast v0, Le/h/b/a/f;

    return-object v0
.end method

.method public bridge synthetic e()Le/b/a/s;
    .locals 1

    .line 1
    invoke-virtual {p0}, Le/h/b/a/g;->e()Le/h/b/a/f;

    move-result-object v0

    return-object v0
.end method

.method public e()Le/h/b/a/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Le/h/b/a/f<",
            "Landroid/graphics/drawable/Drawable;",
            ">;"
        }
    .end annotation

    .line 2
    invoke-super {p0}, Le/b/a/u;->e()Le/b/a/s;

    move-result-object v0

    check-cast v0, Le/h/b/a/f;

    return-object v0
.end method
