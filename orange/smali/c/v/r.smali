.class public Lc/v/r;
.super Lc/v/r1;
.source "SourceFile"


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lc/v/r1;-><init>()V

    .line 2
    invoke-virtual {p0, p1}, Lc/v/r1;->a(I)V

    return-void
.end method

.method public static a(Lc/v/u0;F)F
    .locals 1

    if-eqz p0, :cond_0

    .line 8
    iget-object p0, p0, Lc/v/u0;->a:Ljava/util/Map;

    const-string v0, "android:fade:transitionAlpha"

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Float;

    if-eqz p0, :cond_0

    .line 9
    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    move-result p1

    :cond_0
    return p1
.end method


# virtual methods
.method public final a(Landroid/view/View;FF)Landroid/animation/Animator;
    .locals 2

    cmpl-float v0, p2, p3

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 1
    :cond_0
    invoke-static {p1, p2}, Lc/v/j1;->a(Landroid/view/View;F)V

    .line 2
    sget-object p2, Lc/v/j1;->d:Landroid/util/Property;

    const/4 v0, 0x1

    new-array v0, v0, [F

    const/4 v1, 0x0

    aput p3, v0, v1

    invoke-static {p1, p2, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object p2

    .line 3
    new-instance p3, Lc/v/q;

    invoke-direct {p3, p1}, Lc/v/q;-><init>(Landroid/view/View;)V

    .line 4
    invoke-virtual {p2, p3}, Landroid/animation/ObjectAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 5
    new-instance p3, Lc/v/p;

    invoke-direct {p3, p0, p1}, Lc/v/p;-><init>(Lc/v/r;Landroid/view/View;)V

    invoke-virtual {p0, p3}, Lc/v/k0;->a(Lc/v/j0;)Lc/v/k0;

    return-object p2
.end method

.method public a(Landroid/view/ViewGroup;Landroid/view/View;Lc/v/u0;Lc/v/u0;)Landroid/animation/Animator;
    .locals 1

    const/4 p1, 0x0

    .line 6
    invoke-static {p3, p1}, Lc/v/r;->a(Lc/v/u0;F)F

    move-result p3

    const/high16 p4, 0x3f800000    # 1.0f

    cmpl-float v0, p3, p4

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    move p1, p3

    .line 7
    :goto_0
    invoke-virtual {p0, p2, p1, p4}, Lc/v/r;->a(Landroid/view/View;FF)Landroid/animation/Animator;

    move-result-object p1

    return-object p1
.end method

.method public b(Landroid/view/ViewGroup;Landroid/view/View;Lc/v/u0;Lc/v/u0;)Landroid/animation/Animator;
    .locals 0

    .line 1
    invoke-static {p2}, Lc/v/j1;->e(Landroid/view/View;)V

    const/high16 p1, 0x3f800000    # 1.0f

    .line 2
    invoke-static {p3, p1}, Lc/v/r;->a(Lc/v/u0;F)F

    move-result p1

    const/4 p3, 0x0

    .line 3
    invoke-virtual {p0, p2, p1, p3}, Lc/v/r;->a(Landroid/view/View;FF)Landroid/animation/Animator;

    move-result-object p1

    return-object p1
.end method

.method public c(Lc/v/u0;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Lc/v/r1;->c(Lc/v/u0;)V

    .line 2
    iget-object v0, p1, Lc/v/u0;->a:Ljava/util/Map;

    iget-object p1, p1, Lc/v/u0;->b:Landroid/view/View;

    .line 3
    invoke-static {p1}, Lc/v/j1;->c(Landroid/view/View;)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    const-string v1, "android:fade:transitionAlpha"

    .line 4
    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
