.class public Lc/b/p/o/y;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lc/b/p/o/m;

.field public final c:Z

.field public final d:I

.field public final e:I

.field public f:Landroid/view/View;

.field public g:I

.field public h:Z

.field public i:Lc/b/p/o/z$a;

.field public j:Lc/b/p/o/w;

.field public k:Landroid/widget/PopupWindow$OnDismissListener;

.field public final l:Landroid/widget/PopupWindow$OnDismissListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lc/b/p/o/m;Landroid/view/View;ZI)V
    .locals 7

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move v5, p5

    .line 1
    invoke-direct/range {v0 .. v6}, Lc/b/p/o/y;-><init>(Landroid/content/Context;Lc/b/p/o/m;Landroid/view/View;ZII)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lc/b/p/o/m;Landroid/view/View;ZII)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, 0x800003

    .line 3
    iput v0, p0, Lc/b/p/o/y;->g:I

    .line 4
    new-instance v0, Lc/b/p/o/x;

    invoke-direct {v0, p0}, Lc/b/p/o/x;-><init>(Lc/b/p/o/y;)V

    iput-object v0, p0, Lc/b/p/o/y;->l:Landroid/widget/PopupWindow$OnDismissListener;

    .line 5
    iput-object p1, p0, Lc/b/p/o/y;->a:Landroid/content/Context;

    .line 6
    iput-object p2, p0, Lc/b/p/o/y;->b:Lc/b/p/o/m;

    .line 7
    iput-object p3, p0, Lc/b/p/o/y;->f:Landroid/view/View;

    .line 8
    iput-boolean p4, p0, Lc/b/p/o/y;->c:Z

    .line 9
    iput p5, p0, Lc/b/p/o/y;->d:I

    .line 10
    iput p6, p0, Lc/b/p/o/y;->e:I

    return-void
.end method


# virtual methods
.method public final a()Lc/b/p/o/w;
    .locals 14

    .line 10
    iget-object v0, p0, Lc/b/p/o/y;->a:Landroid/content/Context;

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    .line 11
    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    .line 12
    new-instance v1, Landroid/graphics/Point;

    invoke-direct {v1}, Landroid/graphics/Point;-><init>()V

    .line 13
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x11

    if-lt v2, v3, :cond_0

    .line 14
    invoke-virtual {v0, v1}, Landroid/view/Display;->getRealSize(Landroid/graphics/Point;)V

    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {v0, v1}, Landroid/view/Display;->getSize(Landroid/graphics/Point;)V

    .line 16
    :goto_0
    iget v0, v1, Landroid/graphics/Point;->x:I

    iget v1, v1, Landroid/graphics/Point;->y:I

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 17
    iget-object v1, p0, Lc/b/p/o/y;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lc/b/d;->abc_cascading_menus_min_smallest_width:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    if-lt v0, v1, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    if-eqz v0, :cond_2

    .line 18
    new-instance v0, Lc/b/p/o/i;

    iget-object v2, p0, Lc/b/p/o/y;->a:Landroid/content/Context;

    iget-object v3, p0, Lc/b/p/o/y;->f:Landroid/view/View;

    iget v4, p0, Lc/b/p/o/y;->d:I

    iget v5, p0, Lc/b/p/o/y;->e:I

    iget-boolean v6, p0, Lc/b/p/o/y;->c:Z

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lc/b/p/o/i;-><init>(Landroid/content/Context;Landroid/view/View;IIZ)V

    goto :goto_2

    .line 19
    :cond_2
    new-instance v0, Lc/b/p/o/f0;

    iget-object v8, p0, Lc/b/p/o/y;->a:Landroid/content/Context;

    iget-object v9, p0, Lc/b/p/o/y;->b:Lc/b/p/o/m;

    iget-object v10, p0, Lc/b/p/o/y;->f:Landroid/view/View;

    iget v11, p0, Lc/b/p/o/y;->d:I

    iget v12, p0, Lc/b/p/o/y;->e:I

    iget-boolean v13, p0, Lc/b/p/o/y;->c:Z

    move-object v7, v0

    invoke-direct/range {v7 .. v13}, Lc/b/p/o/f0;-><init>(Landroid/content/Context;Lc/b/p/o/m;Landroid/view/View;IIZ)V

    .line 20
    :goto_2
    iget-object v1, p0, Lc/b/p/o/y;->b:Lc/b/p/o/m;

    invoke-virtual {v0, v1}, Lc/b/p/o/w;->a(Lc/b/p/o/m;)V

    .line 21
    iget-object v1, p0, Lc/b/p/o/y;->l:Landroid/widget/PopupWindow$OnDismissListener;

    invoke-virtual {v0, v1}, Lc/b/p/o/w;->a(Landroid/widget/PopupWindow$OnDismissListener;)V

    .line 22
    iget-object v1, p0, Lc/b/p/o/y;->f:Landroid/view/View;

    invoke-virtual {v0, v1}, Lc/b/p/o/w;->a(Landroid/view/View;)V

    .line 23
    iget-object v1, p0, Lc/b/p/o/y;->i:Lc/b/p/o/z$a;

    invoke-interface {v0, v1}, Lc/b/p/o/z;->a(Lc/b/p/o/z$a;)V

    .line 24
    iget-boolean v1, p0, Lc/b/p/o/y;->h:Z

    invoke-virtual {v0, v1}, Lc/b/p/o/w;->b(Z)V

    .line 25
    iget v1, p0, Lc/b/p/o/y;->g:I

    invoke-virtual {v0, v1}, Lc/b/p/o/w;->a(I)V

    return-object v0
.end method

.method public a(I)V
    .locals 0

    .line 6
    iput p1, p0, Lc/b/p/o/y;->g:I

    return-void
.end method

.method public final a(IIZZ)V
    .locals 3

    .line 26
    invoke-virtual {p0}, Lc/b/p/o/y;->c()Lc/b/p/o/w;

    move-result-object v0

    .line 27
    invoke-virtual {v0, p4}, Lc/b/p/o/w;->c(Z)V

    if-eqz p3, :cond_1

    .line 28
    iget p3, p0, Lc/b/p/o/y;->g:I

    iget-object p4, p0, Lc/b/p/o/y;->f:Landroid/view/View;

    .line 29
    invoke-static {p4}, Lc/h/n/v0;->o(Landroid/view/View;)I

    move-result p4

    .line 30
    invoke-static {p3, p4}, Lc/h/n/i;->a(II)I

    move-result p3

    and-int/lit8 p3, p3, 0x7

    const/4 p4, 0x5

    if-ne p3, p4, :cond_0

    .line 31
    iget-object p3, p0, Lc/b/p/o/y;->f:Landroid/view/View;

    invoke-virtual {p3}, Landroid/view/View;->getWidth()I

    move-result p3

    sub-int/2addr p1, p3

    .line 32
    :cond_0
    invoke-virtual {v0, p1}, Lc/b/p/o/w;->b(I)V

    .line 33
    invoke-virtual {v0, p2}, Lc/b/p/o/w;->c(I)V

    .line 34
    iget-object p3, p0, Lc/b/p/o/y;->a:Landroid/content/Context;

    invoke-virtual {p3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    invoke-virtual {p3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p3

    iget p3, p3, Landroid/util/DisplayMetrics;->density:F

    const/high16 p4, 0x42400000    # 48.0f

    mul-float p3, p3, p4

    const/high16 p4, 0x40000000    # 2.0f

    div-float/2addr p3, p4

    float-to-int p3, p3

    .line 35
    new-instance p4, Landroid/graphics/Rect;

    sub-int v1, p1, p3

    sub-int v2, p2, p3

    add-int/2addr p1, p3

    add-int/2addr p2, p3

    invoke-direct {p4, v1, v2, p1, p2}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 36
    invoke-virtual {v0, p4}, Lc/b/p/o/w;->a(Landroid/graphics/Rect;)V

    .line 37
    :cond_1
    invoke-interface {v0}, Lc/b/p/o/c0;->a()V

    return-void
.end method

.method public a(Landroid/view/View;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lc/b/p/o/y;->f:Landroid/view/View;

    return-void
.end method

.method public a(Landroid/widget/PopupWindow$OnDismissListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/b/p/o/y;->k:Landroid/widget/PopupWindow$OnDismissListener;

    return-void
.end method

.method public a(Lc/b/p/o/z$a;)V
    .locals 1

    .line 38
    iput-object p1, p0, Lc/b/p/o/y;->i:Lc/b/p/o/z$a;

    .line 39
    iget-object v0, p0, Lc/b/p/o/y;->j:Lc/b/p/o/w;

    if-eqz v0, :cond_0

    .line 40
    invoke-interface {v0, p1}, Lc/b/p/o/z;->a(Lc/b/p/o/z$a;)V

    :cond_0
    return-void
.end method

.method public a(Z)V
    .locals 1

    .line 3
    iput-boolean p1, p0, Lc/b/p/o/y;->h:Z

    .line 4
    iget-object v0, p0, Lc/b/p/o/y;->j:Lc/b/p/o/w;

    if-eqz v0, :cond_0

    .line 5
    invoke-virtual {v0, p1}, Lc/b/p/o/w;->b(Z)V

    :cond_0
    return-void
.end method

.method public a(II)Z
    .locals 2

    .line 7
    invoke-virtual {p0}, Lc/b/p/o/y;->d()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    .line 8
    :cond_0
    iget-object v0, p0, Lc/b/p/o/y;->f:Landroid/view/View;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    .line 9
    :cond_1
    invoke-virtual {p0, p1, p2, v1, v1}, Lc/b/p/o/y;->a(IIZZ)V

    return v1
.end method

.method public b()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lc/b/p/o/y;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lc/b/p/o/y;->j:Lc/b/p/o/w;

    invoke-interface {v0}, Lc/b/p/o/c0;->dismiss()V

    :cond_0
    return-void
.end method

.method public c()Lc/b/p/o/w;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/b/p/o/y;->j:Lc/b/p/o/w;

    if-nez v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lc/b/p/o/y;->a()Lc/b/p/o/w;

    move-result-object v0

    iput-object v0, p0, Lc/b/p/o/y;->j:Lc/b/p/o/w;

    .line 3
    :cond_0
    iget-object v0, p0, Lc/b/p/o/y;->j:Lc/b/p/o/w;

    return-object v0
.end method

.method public d()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lc/b/p/o/y;->j:Lc/b/p/o/w;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lc/b/p/o/c0;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public e()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput-object v0, p0, Lc/b/p/o/y;->j:Lc/b/p/o/w;

    .line 2
    iget-object v0, p0, Lc/b/p/o/y;->k:Landroid/widget/PopupWindow$OnDismissListener;

    if-eqz v0, :cond_0

    .line 3
    invoke-interface {v0}, Landroid/widget/PopupWindow$OnDismissListener;->onDismiss()V

    :cond_0
    return-void
.end method

.method public f()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lc/b/p/o/y;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "MenuPopupHelper cannot be used without an anchor"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public g()Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Lc/b/p/o/y;->d()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    .line 2
    :cond_0
    iget-object v0, p0, Lc/b/p/o/y;->f:Landroid/view/View;

    const/4 v2, 0x0

    if-nez v0, :cond_1

    return v2

    .line 3
    :cond_1
    invoke-virtual {p0, v2, v2, v2, v2}, Lc/b/p/o/y;->a(IIZZ)V

    return v1
.end method
