.class public Lc/d/f/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc/d/f/g;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lc/d/f/f;)F
    .locals 0

    .line 7
    invoke-virtual {p0, p1}, Lc/d/f/c;->j(Lc/d/f/f;)Lc/d/f/h;

    move-result-object p1

    invoke-virtual {p1}, Lc/d/f/h;->b()F

    move-result p1

    return p1
.end method

.method public a()V
    .locals 0

    return-void
.end method

.method public a(Lc/d/f/f;F)V
    .locals 0

    .line 8
    invoke-interface {p1}, Lc/d/f/f;->a()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/view/View;->setElevation(F)V

    return-void
.end method

.method public a(Lc/d/f/f;Landroid/content/Context;Landroid/content/res/ColorStateList;FFF)V
    .locals 0

    .line 1
    new-instance p2, Lc/d/f/h;

    invoke-direct {p2, p3, p4}, Lc/d/f/h;-><init>(Landroid/content/res/ColorStateList;F)V

    .line 2
    invoke-interface {p1, p2}, Lc/d/f/f;->a(Landroid/graphics/drawable/Drawable;)V

    .line 3
    invoke-interface {p1}, Lc/d/f/f;->a()Landroid/view/View;

    move-result-object p2

    const/4 p3, 0x1

    .line 4
    invoke-virtual {p2, p3}, Landroid/view/View;->setClipToOutline(Z)V

    .line 5
    invoke-virtual {p2, p5}, Landroid/view/View;->setElevation(F)V

    .line 6
    invoke-virtual {p0, p1, p6}, Lc/d/f/c;->c(Lc/d/f/f;F)V

    return-void
.end method

.method public a(Lc/d/f/f;Landroid/content/res/ColorStateList;)V
    .locals 0

    .line 9
    invoke-virtual {p0, p1}, Lc/d/f/c;->j(Lc/d/f/f;)Lc/d/f/h;

    move-result-object p1

    invoke-virtual {p1, p2}, Lc/d/f/h;->b(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public b(Lc/d/f/f;)F
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lc/d/f/c;->j(Lc/d/f/f;)Lc/d/f/h;

    move-result-object p1

    invoke-virtual {p1}, Lc/d/f/h;->c()F

    move-result p1

    return p1
.end method

.method public b(Lc/d/f/f;F)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lc/d/f/c;->j(Lc/d/f/f;)Lc/d/f/h;

    move-result-object p1

    invoke-virtual {p1, p2}, Lc/d/f/h;->a(F)V

    return-void
.end method

.method public c(Lc/d/f/f;)F
    .locals 1

    .line 5
    invoke-virtual {p0, p1}, Lc/d/f/c;->b(Lc/d/f/f;)F

    move-result p1

    const/high16 v0, 0x40000000    # 2.0f

    mul-float p1, p1, v0

    return p1
.end method

.method public c(Lc/d/f/f;F)V
    .locals 3

    .line 1
    invoke-virtual {p0, p1}, Lc/d/f/c;->j(Lc/d/f/f;)Lc/d/f/h;

    move-result-object v0

    .line 2
    invoke-interface {p1}, Lc/d/f/f;->b()Z

    move-result v1

    invoke-interface {p1}, Lc/d/f/f;->d()Z

    move-result v2

    .line 3
    invoke-virtual {v0, p2, v1, v2}, Lc/d/f/h;->a(FZZ)V

    .line 4
    invoke-virtual {p0, p1}, Lc/d/f/c;->i(Lc/d/f/f;)V

    return-void
.end method

.method public d(Lc/d/f/f;)F
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lc/d/f/c;->b(Lc/d/f/f;)F

    move-result p1

    const/high16 v0, 0x40000000    # 2.0f

    mul-float p1, p1, v0

    return p1
.end method

.method public e(Lc/d/f/f;)V
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lc/d/f/c;->a(Lc/d/f/f;)F

    move-result v0

    invoke-virtual {p0, p1, v0}, Lc/d/f/c;->c(Lc/d/f/f;F)V

    return-void
.end method

.method public f(Lc/d/f/f;)Landroid/content/res/ColorStateList;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lc/d/f/c;->j(Lc/d/f/f;)Lc/d/f/h;

    move-result-object p1

    invoke-virtual {p1}, Lc/d/f/h;->a()Landroid/content/res/ColorStateList;

    move-result-object p1

    return-object p1
.end method

.method public g(Lc/d/f/f;)V
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lc/d/f/c;->a(Lc/d/f/f;)F

    move-result v0

    invoke-virtual {p0, p1, v0}, Lc/d/f/c;->c(Lc/d/f/f;F)V

    return-void
.end method

.method public h(Lc/d/f/f;)F
    .locals 0

    .line 1
    invoke-interface {p1}, Lc/d/f/f;->a()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getElevation()F

    move-result p1

    return p1
.end method

.method public i(Lc/d/f/f;)V
    .locals 4

    .line 1
    invoke-interface {p1}, Lc/d/f/f;->b()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 2
    invoke-interface {p1, v0, v0, v0, v0}, Lc/d/f/f;->a(IIII)V

    return-void

    .line 3
    :cond_0
    invoke-virtual {p0, p1}, Lc/d/f/c;->a(Lc/d/f/f;)F

    move-result v0

    .line 4
    invoke-virtual {p0, p1}, Lc/d/f/c;->b(Lc/d/f/f;)F

    move-result v1

    .line 5
    invoke-interface {p1}, Lc/d/f/f;->d()Z

    move-result v2

    invoke-static {v0, v1, v2}, Lc/d/f/j;->a(FFZ)F

    move-result v2

    float-to-double v2, v2

    .line 6
    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-int v2, v2

    .line 7
    invoke-interface {p1}, Lc/d/f/f;->d()Z

    move-result v3

    invoke-static {v0, v1, v3}, Lc/d/f/j;->b(FFZ)F

    move-result v0

    float-to-double v0, v0

    .line 8
    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v0, v0

    .line 9
    invoke-interface {p1, v2, v0, v2, v0}, Lc/d/f/f;->a(IIII)V

    return-void
.end method

.method public final j(Lc/d/f/f;)Lc/d/f/h;
    .locals 0

    .line 1
    invoke-interface {p1}, Lc/d/f/f;->c()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    check-cast p1, Lc/d/f/h;

    return-object p1
.end method
