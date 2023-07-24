.class public Lc/d/f/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc/d/f/g;


# instance fields
.field public final a:Landroid/graphics/RectF;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lc/d/f/e;->a:Landroid/graphics/RectF;

    return-void
.end method


# virtual methods
.method public a(Lc/d/f/f;)F
    .locals 0

    .line 9
    invoke-virtual {p0, p1}, Lc/d/f/e;->j(Lc/d/f/f;)Lc/d/f/j;

    move-result-object p1

    invoke-virtual {p1}, Lc/d/f/j;->d()F

    move-result p1

    return p1
.end method

.method public final a(Landroid/content/Context;Landroid/content/res/ColorStateList;FFF)Lc/d/f/j;
    .locals 7

    .line 6
    new-instance v6, Lc/d/f/j;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    move-object v0, v6

    move-object v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    invoke-direct/range {v0 .. v5}, Lc/d/f/j;-><init>(Landroid/content/res/Resources;Landroid/content/res/ColorStateList;FFF)V

    return-object v6
.end method

.method public a()V
    .locals 1

    .line 1
    new-instance v0, Lc/d/f/d;

    invoke-direct {v0, p0}, Lc/d/f/d;-><init>(Lc/d/f/e;)V

    sput-object v0, Lc/d/f/j;->r:Lc/d/f/i;

    return-void
.end method

.method public a(Lc/d/f/f;F)V
    .locals 0

    .line 8
    invoke-virtual {p0, p1}, Lc/d/f/e;->j(Lc/d/f/f;)Lc/d/f/j;

    move-result-object p1

    invoke-virtual {p1, p2}, Lc/d/f/j;->c(F)V

    return-void
.end method

.method public a(Lc/d/f/f;Landroid/content/Context;Landroid/content/res/ColorStateList;FFF)V
    .locals 6

    move-object v0, p0

    move-object v1, p2

    move-object v2, p3

    move v3, p4

    move v4, p5

    move v5, p6

    .line 2
    invoke-virtual/range {v0 .. v5}, Lc/d/f/e;->a(Landroid/content/Context;Landroid/content/res/ColorStateList;FFF)Lc/d/f/j;

    move-result-object p2

    .line 3
    invoke-interface {p1}, Lc/d/f/f;->d()Z

    move-result p3

    invoke-virtual {p2, p3}, Lc/d/f/j;->a(Z)V

    .line 4
    invoke-interface {p1, p2}, Lc/d/f/f;->a(Landroid/graphics/drawable/Drawable;)V

    .line 5
    invoke-virtual {p0, p1}, Lc/d/f/e;->i(Lc/d/f/f;)V

    return-void
.end method

.method public a(Lc/d/f/f;Landroid/content/res/ColorStateList;)V
    .locals 0

    .line 7
    invoke-virtual {p0, p1}, Lc/d/f/e;->j(Lc/d/f/f;)Lc/d/f/j;

    move-result-object p1

    invoke-virtual {p1, p2}, Lc/d/f/j;->b(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public b(Lc/d/f/f;)F
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Lc/d/f/e;->j(Lc/d/f/f;)Lc/d/f/j;

    move-result-object p1

    invoke-virtual {p1}, Lc/d/f/j;->c()F

    move-result p1

    return p1
.end method

.method public b(Lc/d/f/f;F)V
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lc/d/f/e;->j(Lc/d/f/f;)Lc/d/f/j;

    move-result-object v0

    invoke-virtual {v0, p2}, Lc/d/f/j;->a(F)V

    .line 2
    invoke-virtual {p0, p1}, Lc/d/f/e;->i(Lc/d/f/f;)V

    return-void
.end method

.method public c(Lc/d/f/f;)F
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Lc/d/f/e;->j(Lc/d/f/f;)Lc/d/f/j;

    move-result-object p1

    invoke-virtual {p1}, Lc/d/f/j;->e()F

    move-result p1

    return p1
.end method

.method public c(Lc/d/f/f;F)V
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lc/d/f/e;->j(Lc/d/f/f;)Lc/d/f/j;

    move-result-object v0

    invoke-virtual {v0, p2}, Lc/d/f/j;->b(F)V

    .line 2
    invoke-virtual {p0, p1}, Lc/d/f/e;->i(Lc/d/f/f;)V

    return-void
.end method

.method public d(Lc/d/f/f;)F
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lc/d/f/e;->j(Lc/d/f/f;)Lc/d/f/j;

    move-result-object p1

    invoke-virtual {p1}, Lc/d/f/j;->f()F

    move-result p1

    return p1
.end method

.method public e(Lc/d/f/f;)V
    .locals 0

    return-void
.end method

.method public f(Lc/d/f/f;)Landroid/content/res/ColorStateList;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lc/d/f/e;->j(Lc/d/f/f;)Lc/d/f/j;

    move-result-object p1

    invoke-virtual {p1}, Lc/d/f/j;->b()Landroid/content/res/ColorStateList;

    move-result-object p1

    return-object p1
.end method

.method public g(Lc/d/f/f;)V
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Lc/d/f/e;->j(Lc/d/f/f;)Lc/d/f/j;

    move-result-object v0

    invoke-interface {p1}, Lc/d/f/f;->d()Z

    move-result v1

    invoke-virtual {v0, v1}, Lc/d/f/j;->a(Z)V

    .line 2
    invoke-virtual {p0, p1}, Lc/d/f/e;->i(Lc/d/f/f;)V

    return-void
.end method

.method public h(Lc/d/f/f;)F
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lc/d/f/e;->j(Lc/d/f/f;)Lc/d/f/j;

    move-result-object p1

    invoke-virtual {p1}, Lc/d/f/j;->g()F

    move-result p1

    return p1
.end method

.method public i(Lc/d/f/f;)V
    .locals 4

    .line 1
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 2
    invoke-virtual {p0, p1}, Lc/d/f/e;->j(Lc/d/f/f;)Lc/d/f/j;

    move-result-object v1

    invoke-virtual {v1, v0}, Lc/d/f/j;->b(Landroid/graphics/Rect;)V

    .line 3
    invoke-virtual {p0, p1}, Lc/d/f/e;->d(Lc/d/f/f;)F

    move-result v1

    float-to-double v1, v1

    invoke-static {v1, v2}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v1

    double-to-int v1, v1

    .line 4
    invoke-virtual {p0, p1}, Lc/d/f/e;->c(Lc/d/f/f;)F

    move-result v2

    float-to-double v2, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-int v2, v2

    .line 5
    invoke-interface {p1, v1, v2}, Lc/d/f/f;->a(II)V

    .line 6
    iget v1, v0, Landroid/graphics/Rect;->left:I

    iget v2, v0, Landroid/graphics/Rect;->top:I

    iget v3, v0, Landroid/graphics/Rect;->right:I

    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    invoke-interface {p1, v1, v2, v3, v0}, Lc/d/f/f;->a(IIII)V

    return-void
.end method

.method public final j(Lc/d/f/f;)Lc/d/f/j;
    .locals 0

    .line 1
    invoke-interface {p1}, Lc/d/f/f;->c()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    check-cast p1, Lc/d/f/j;

    return-object p1
.end method
