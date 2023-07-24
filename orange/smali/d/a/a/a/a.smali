.class public final Ld/a/a/a/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/b/a/y/z/j/e;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Le/b/a/y/z/j/e<",
        "Le/c/a/a2;",
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Le/b/a/y/x/y0;Le/b/a/y/r;)Le/b/a/y/x/y0;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/b/a/y/x/y0<",
            "Le/c/a/a2;",
            ">;",
            "Le/b/a/y/r;",
            ")",
            "Le/b/a/y/x/y0<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    const-string v0, "toTranscode"

    invoke-static {p1, v0}, Li/h/c/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "options"

    invoke-static {p2, v0}, Li/h/c/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-interface {p1}, Le/b/a/y/x/y0;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Le/c/a/a2;

    const-string p2, "svg"

    .line 2
    invoke-static {p1, p2}, Li/h/c/k;->a(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Le/c/a/a2;->d()F

    move-result p2

    float-to-int p2, p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const/4 v3, 0x0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    move-object p2, v3

    :goto_1
    if-eqz p2, :cond_2

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    goto :goto_2

    .line 3
    :cond_2
    invoke-virtual {p1}, Le/c/a/a2;->c()Landroid/graphics/RectF;

    move-result-object p2

    iget p2, p2, Landroid/graphics/RectF;->right:F

    invoke-virtual {p1}, Le/c/a/a2;->c()Landroid/graphics/RectF;

    move-result-object v0

    iget v0, v0, Landroid/graphics/RectF;->left:F

    sub-float/2addr p2, v0

    float-to-int p2, p2

    .line 4
    :goto_2
    invoke-virtual {p1}, Le/c/a/a2;->b()F

    move-result v0

    float-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v4

    if-lez v4, :cond_3

    goto :goto_3

    :cond_3
    const/4 v1, 0x0

    :goto_3
    if-eqz v1, :cond_4

    move-object v3, v0

    :cond_4
    if-eqz v3, :cond_5

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_4

    .line 5
    :cond_5
    invoke-virtual {p1}, Le/c/a/a2;->c()Landroid/graphics/RectF;

    move-result-object v0

    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    invoke-virtual {p1}, Le/c/a/a2;->c()Landroid/graphics/RectF;

    move-result-object v1

    iget v1, v1, Landroid/graphics/RectF;->top:F

    sub-float/2addr v0, v1

    float-to-int v0, v0

    .line 6
    :goto_4
    invoke-virtual {p1, p2, v0}, Le/c/a/a2;->a(II)Landroid/graphics/Picture;

    move-result-object p1

    .line 7
    new-instance v1, Landroid/graphics/drawable/PictureDrawable;

    invoke-direct {v1, p1}, Landroid/graphics/drawable/PictureDrawable;-><init>(Landroid/graphics/Picture;)V

    .line 8
    sget-object p1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {p2, v0, p1}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object p1

    .line 9
    new-instance p2, Landroid/graphics/Canvas;

    invoke-direct {p2, p1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 10
    invoke-virtual {v1}, Landroid/graphics/drawable/PictureDrawable;->getPicture()Landroid/graphics/Picture;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/graphics/Canvas;->drawPicture(Landroid/graphics/Picture;)V

    .line 11
    new-instance p2, Le/b/a/y/z/c;

    invoke-direct {p2, p1}, Le/b/a/y/z/c;-><init>(Ljava/lang/Object;)V

    return-object p2
.end method
