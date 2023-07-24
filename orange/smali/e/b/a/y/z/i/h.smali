.class public Le/b/a/y/z/i/h;
.super Le/b/a/y/z/g/f;
.source "SourceFile"

# interfaces
.implements Le/b/a/y/x/t0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Le/b/a/y/z/g/f<",
        "Le/b/a/y/z/i/f;",
        ">;",
        "Le/b/a/y/x/t0;"
    }
.end annotation


# direct methods
.method public constructor <init>(Le/b/a/y/z/i/f;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Le/b/a/y/z/g/f;-><init>(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 1
    iget-object v0, p0, Le/b/a/y/z/g/f;->b:Landroid/graphics/drawable/Drawable;

    check-cast v0, Le/b/a/y/z/i/f;

    invoke-virtual {v0}, Le/b/a/y/z/i/f;->e()Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->prepareToDraw()V

    return-void
.end method

.method public b()I
    .locals 1

    .line 1
    iget-object v0, p0, Le/b/a/y/z/g/f;->b:Landroid/graphics/drawable/Drawable;

    check-cast v0, Le/b/a/y/z/i/f;

    invoke-virtual {v0}, Le/b/a/y/z/i/f;->i()I

    move-result v0

    return v0
.end method

.method public c()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Le/b/a/y/z/i/f;",
            ">;"
        }
    .end annotation

    .line 1
    const-class v0, Le/b/a/y/z/i/f;

    return-object v0
.end method

.method public d()V
    .locals 1

    .line 1
    iget-object v0, p0, Le/b/a/y/z/g/f;->b:Landroid/graphics/drawable/Drawable;

    check-cast v0, Le/b/a/y/z/i/f;

    invoke-virtual {v0}, Le/b/a/y/z/i/f;->stop()V

    .line 2
    iget-object v0, p0, Le/b/a/y/z/g/f;->b:Landroid/graphics/drawable/Drawable;

    check-cast v0, Le/b/a/y/z/i/f;

    invoke-virtual {v0}, Le/b/a/y/z/i/f;->k()V

    return-void
.end method
