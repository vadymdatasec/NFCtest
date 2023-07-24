.class public Lc/b/q/k;
.super Lc/b/p/o/b;
.source "SourceFile"

# interfaces
.implements Lc/h/n/e;


# instance fields
.field public A:Lc/b/q/e;

.field public final B:Lc/b/q/j;

.field public C:I

.field public j:Lc/b/q/h;

.field public k:Landroid/graphics/drawable/Drawable;

.field public l:Z

.field public m:Z

.field public n:Z

.field public o:I

.field public p:I

.field public q:I

.field public r:Z

.field public s:Z

.field public t:Z

.field public u:Z

.field public v:I

.field public final w:Landroid/util/SparseBooleanArray;

.field public x:Lc/b/q/i;

.field public y:Lc/b/q/d;

.field public z:Lc/b/q/f;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    sget v0, Lc/b/g;->abc_action_menu_layout:I

    sget v1, Lc/b/g;->abc_action_menu_item_layout:I

    invoke-direct {p0, p1, v0, v1}, Lc/b/p/o/b;-><init>(Landroid/content/Context;II)V

    .line 2
    new-instance p1, Landroid/util/SparseBooleanArray;

    invoke-direct {p1}, Landroid/util/SparseBooleanArray;-><init>()V

    iput-object p1, p0, Lc/b/q/k;->w:Landroid/util/SparseBooleanArray;

    .line 3
    new-instance p1, Lc/b/q/j;

    invoke-direct {p1, p0}, Lc/b/q/j;-><init>(Lc/b/q/k;)V

    iput-object p1, p0, Lc/b/q/k;->B:Lc/b/q/j;

    return-void
.end method

.method public static synthetic a(Lc/b/q/k;)Lc/b/p/o/m;
    .locals 0

    .line 1
    iget-object p0, p0, Lc/b/p/o/b;->d:Lc/b/p/o/m;

    return-object p0
.end method

.method public static synthetic b(Lc/b/q/k;)Lc/b/p/o/m;
    .locals 0

    .line 1
    iget-object p0, p0, Lc/b/p/o/b;->d:Lc/b/p/o/m;

    return-object p0
.end method

.method public static synthetic c(Lc/b/q/k;)Lc/b/p/o/a0;
    .locals 0

    .line 1
    iget-object p0, p0, Lc/b/p/o/b;->i:Lc/b/p/o/a0;

    return-object p0
.end method

.method public static synthetic d(Lc/b/q/k;)Lc/b/p/o/m;
    .locals 0

    .line 1
    iget-object p0, p0, Lc/b/p/o/b;->d:Lc/b/p/o/m;

    return-object p0
.end method

.method public static synthetic e(Lc/b/q/k;)Lc/b/p/o/m;
    .locals 0

    .line 1
    iget-object p0, p0, Lc/b/p/o/b;->d:Lc/b/p/o/m;

    return-object p0
.end method

.method public static synthetic f(Lc/b/q/k;)Lc/b/p/o/a0;
    .locals 0

    .line 1
    iget-object p0, p0, Lc/b/p/o/b;->i:Lc/b/p/o/a0;

    return-object p0
.end method


# virtual methods
.method public final a(Landroid/view/MenuItem;)Landroid/view/View;
    .locals 6

    .line 85
    iget-object v0, p0, Lc/b/p/o/b;->i:Lc/b/p/o/a0;

    check-cast v0, Landroid/view/ViewGroup;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 86
    :cond_0
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_2

    .line 87
    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    .line 88
    instance-of v5, v4, Lc/b/p/o/a0$a;

    if-eqz v5, :cond_1

    move-object v5, v4

    check-cast v5, Lc/b/p/o/a0$a;

    .line 89
    invoke-interface {v5}, Lc/b/p/o/a0$a;->getItemData()Lc/b/p/o/p;

    move-result-object v5

    if-ne v5, p1, :cond_1

    return-object v4

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    return-object v1
.end method

.method public a(Lc/b/p/o/p;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 2

    .line 33
    invoke-virtual {p1}, Lc/b/p/o/p;->getActionView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 34
    invoke-virtual {p1}, Lc/b/p/o/p;->f()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 35
    :cond_0
    invoke-super {p0, p1, p2, p3}, Lc/b/p/o/b;->a(Lc/b/p/o/p;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    .line 36
    :cond_1
    invoke-virtual {p1}, Lc/b/p/o/p;->isActionViewExpanded()Z

    move-result p1

    if-eqz p1, :cond_2

    const/16 p1, 0x8

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 37
    check-cast p3, Landroidx/appcompat/widget/ActionMenuView;

    .line 38
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    .line 39
    invoke-virtual {p3, p1}, Landroidx/appcompat/widget/ActionMenuView;->checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z

    move-result p2

    if-nez p2, :cond_3

    .line 40
    invoke-virtual {p3, p1}, Landroidx/appcompat/widget/ActionMenuView;->generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroidx/appcompat/widget/ActionMenuView$c;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_3
    return-object v0
.end method

.method public a(Landroid/content/Context;Lc/b/p/o/m;)V
    .locals 4

    .line 2
    invoke-super {p0, p1, p2}, Lc/b/p/o/b;->a(Landroid/content/Context;Lc/b/p/o/m;)V

    .line 3
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    .line 4
    invoke-static {p1}, Lc/b/p/a;->a(Landroid/content/Context;)Lc/b/p/a;

    move-result-object p1

    .line 5
    iget-boolean v0, p0, Lc/b/q/k;->n:Z

    if-nez v0, :cond_0

    .line 6
    invoke-virtual {p1}, Lc/b/p/a;->e()Z

    move-result v0

    iput-boolean v0, p0, Lc/b/q/k;->m:Z

    .line 7
    :cond_0
    iget-boolean v0, p0, Lc/b/q/k;->t:Z

    if-nez v0, :cond_1

    .line 8
    invoke-virtual {p1}, Lc/b/p/a;->b()I

    move-result v0

    iput v0, p0, Lc/b/q/k;->o:I

    .line 9
    :cond_1
    iget-boolean v0, p0, Lc/b/q/k;->r:Z

    if-nez v0, :cond_2

    .line 10
    invoke-virtual {p1}, Lc/b/p/a;->c()I

    move-result p1

    iput p1, p0, Lc/b/q/k;->q:I

    .line 11
    :cond_2
    iget p1, p0, Lc/b/q/k;->o:I

    .line 12
    iget-boolean v0, p0, Lc/b/q/k;->m:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_5

    .line 13
    iget-object v0, p0, Lc/b/q/k;->j:Lc/b/q/h;

    if-nez v0, :cond_4

    .line 14
    new-instance v0, Lc/b/q/h;

    iget-object v2, p0, Lc/b/p/o/b;->b:Landroid/content/Context;

    invoke-direct {v0, p0, v2}, Lc/b/q/h;-><init>(Lc/b/q/k;Landroid/content/Context;)V

    iput-object v0, p0, Lc/b/q/k;->j:Lc/b/q/h;

    .line 15
    iget-boolean v2, p0, Lc/b/q/k;->l:Z

    const/4 v3, 0x0

    if-eqz v2, :cond_3

    .line 16
    iget-object v2, p0, Lc/b/q/k;->k:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v2}, Lc/b/q/x;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 17
    iput-object v1, p0, Lc/b/q/k;->k:Landroid/graphics/drawable/Drawable;

    .line 18
    iput-boolean v3, p0, Lc/b/q/k;->l:Z

    .line 19
    :cond_3
    invoke-static {v3, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    .line 20
    iget-object v1, p0, Lc/b/q/k;->j:Lc/b/q/h;

    invoke-virtual {v1, v0, v0}, Landroid/widget/ImageView;->measure(II)V

    .line 21
    :cond_4
    iget-object v0, p0, Lc/b/q/k;->j:Lc/b/q/h;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getMeasuredWidth()I

    move-result v0

    sub-int/2addr p1, v0

    goto :goto_0

    .line 22
    :cond_5
    iput-object v1, p0, Lc/b/q/k;->j:Lc/b/q/h;

    .line 23
    :goto_0
    iput p1, p0, Lc/b/q/k;->p:I

    const/high16 p1, 0x42600000    # 56.0f

    .line 24
    invoke-virtual {p2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p2

    iget p2, p2, Landroid/util/DisplayMetrics;->density:F

    mul-float p2, p2, p1

    float-to-int p1, p2

    iput p1, p0, Lc/b/q/k;->v:I

    return-void
.end method

.method public a(Landroid/content/res/Configuration;)V
    .locals 1

    .line 25
    iget-boolean p1, p0, Lc/b/q/k;->r:Z

    if-nez p1, :cond_0

    .line 26
    iget-object p1, p0, Lc/b/p/o/b;->c:Landroid/content/Context;

    invoke-static {p1}, Lc/b/p/a;->a(Landroid/content/Context;)Lc/b/p/a;

    move-result-object p1

    invoke-virtual {p1}, Lc/b/p/a;->c()I

    move-result p1

    iput p1, p0, Lc/b/q/k;->q:I

    .line 27
    :cond_0
    iget-object p1, p0, Lc/b/p/o/b;->d:Lc/b/p/o/m;

    if-eqz p1, :cond_1

    const/4 v0, 0x1

    .line 28
    invoke-virtual {p1, v0}, Lc/b/p/o/m;->c(Z)V

    :cond_1
    return-void
.end method

.method public a(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 29
    iget-object v0, p0, Lc/b/q/k;->j:Lc/b/q/h;

    if-eqz v0, :cond_0

    .line 30
    invoke-virtual {v0, p1}, Lc/b/q/x;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    .line 31
    iput-boolean v0, p0, Lc/b/q/k;->l:Z

    .line 32
    iput-object p1, p0, Lc/b/q/k;->k:Landroid/graphics/drawable/Drawable;

    :goto_0
    return-void
.end method

.method public a(Landroidx/appcompat/widget/ActionMenuView;)V
    .locals 1

    .line 92
    iput-object p1, p0, Lc/b/p/o/b;->i:Lc/b/p/o/a0;

    .line 93
    iget-object v0, p0, Lc/b/p/o/b;->d:Lc/b/p/o/m;

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionMenuView;->a(Lc/b/p/o/m;)V

    return-void
.end method

.method public a(Lc/b/p/o/m;Z)V
    .locals 0

    .line 90
    invoke-virtual {p0}, Lc/b/q/k;->b()Z

    .line 91
    invoke-super {p0, p1, p2}, Lc/b/p/o/b;->a(Lc/b/p/o/m;Z)V

    return-void
.end method

.method public a(Lc/b/p/o/p;Lc/b/p/o/a0$a;)V
    .locals 1

    const/4 v0, 0x0

    .line 41
    invoke-interface {p2, p1, v0}, Lc/b/p/o/a0$a;->a(Lc/b/p/o/p;I)V

    .line 42
    iget-object p1, p0, Lc/b/p/o/b;->i:Lc/b/p/o/a0;

    check-cast p1, Landroidx/appcompat/widget/ActionMenuView;

    .line 43
    check-cast p2, Landroidx/appcompat/view/menu/ActionMenuItemView;

    .line 44
    invoke-virtual {p2, p1}, Landroidx/appcompat/view/menu/ActionMenuItemView;->setItemInvoker(Lc/b/p/o/m$b;)V

    .line 45
    iget-object p1, p0, Lc/b/q/k;->A:Lc/b/q/e;

    if-nez p1, :cond_0

    .line 46
    new-instance p1, Lc/b/q/e;

    invoke-direct {p1, p0}, Lc/b/q/e;-><init>(Lc/b/q/k;)V

    iput-object p1, p0, Lc/b/q/k;->A:Lc/b/q/e;

    .line 47
    :cond_0
    iget-object p1, p0, Lc/b/q/k;->A:Lc/b/q/e;

    invoke-virtual {p2, p1}, Landroidx/appcompat/view/menu/ActionMenuItemView;->setPopupCallback(Landroidx/appcompat/view/menu/ActionMenuItemView$b;)V

    return-void
.end method

.method public a(Z)V
    .locals 4

    .line 49
    invoke-super {p0, p1}, Lc/b/p/o/b;->a(Z)V

    .line 50
    iget-object p1, p0, Lc/b/p/o/b;->i:Lc/b/p/o/a0;

    check-cast p1, Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->requestLayout()V

    .line 51
    iget-object p1, p0, Lc/b/p/o/b;->d:Lc/b/p/o/m;

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    .line 52
    invoke-virtual {p1}, Lc/b/p/o/m;->c()Ljava/util/ArrayList;

    move-result-object p1

    .line 53
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    .line 54
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lc/b/p/o/p;

    invoke-virtual {v3}, Lc/b/p/o/p;->a()Lc/h/n/g;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 55
    invoke-virtual {v3, p0}, Lc/h/n/g;->a(Lc/h/n/e;)V

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 56
    :cond_1
    iget-object p1, p0, Lc/b/p/o/b;->d:Lc/b/p/o/m;

    if-eqz p1, :cond_2

    .line 57
    invoke-virtual {p1}, Lc/b/p/o/m;->j()Ljava/util/ArrayList;

    move-result-object p1

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    .line 58
    :goto_1
    iget-boolean v1, p0, Lc/b/q/k;->m:Z

    if-eqz v1, :cond_4

    if-eqz p1, :cond_4

    .line 59
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_3

    .line 60
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc/b/p/o/p;

    invoke-virtual {p1}, Lc/b/p/o/p;->isActionViewExpanded()Z

    move-result p1

    xor-int/lit8 v0, p1, 0x1

    goto :goto_2

    :cond_3
    if-lez v1, :cond_4

    const/4 v0, 0x1

    :cond_4
    :goto_2
    if-eqz v0, :cond_7

    .line 61
    iget-object p1, p0, Lc/b/q/k;->j:Lc/b/q/h;

    if-nez p1, :cond_5

    .line 62
    new-instance p1, Lc/b/q/h;

    iget-object v0, p0, Lc/b/p/o/b;->b:Landroid/content/Context;

    invoke-direct {p1, p0, v0}, Lc/b/q/h;-><init>(Lc/b/q/k;Landroid/content/Context;)V

    iput-object p1, p0, Lc/b/q/k;->j:Lc/b/q/h;

    .line 63
    :cond_5
    iget-object p1, p0, Lc/b/q/k;->j:Lc/b/q/h;

    invoke-virtual {p1}, Landroid/widget/ImageView;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    .line 64
    iget-object v0, p0, Lc/b/p/o/b;->i:Lc/b/p/o/a0;

    if-eq p1, v0, :cond_8

    if-eqz p1, :cond_6

    .line 65
    iget-object v0, p0, Lc/b/q/k;->j:Lc/b/q/h;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 66
    :cond_6
    iget-object p1, p0, Lc/b/p/o/b;->i:Lc/b/p/o/a0;

    check-cast p1, Landroidx/appcompat/widget/ActionMenuView;

    .line 67
    iget-object v0, p0, Lc/b/q/k;->j:Lc/b/q/h;

    invoke-virtual {p1}, Landroidx/appcompat/widget/ActionMenuView;->e()Landroidx/appcompat/widget/ActionMenuView$c;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_3

    .line 68
    :cond_7
    iget-object p1, p0, Lc/b/q/k;->j:Lc/b/q/h;

    if-eqz p1, :cond_8

    invoke-virtual {p1}, Landroid/widget/ImageView;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    iget-object v0, p0, Lc/b/p/o/b;->i:Lc/b/p/o/a0;

    if-ne p1, v0, :cond_8

    .line 69
    check-cast v0, Landroid/view/ViewGroup;

    iget-object p1, p0, Lc/b/q/k;->j:Lc/b/q/h;

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 70
    :cond_8
    :goto_3
    iget-object p1, p0, Lc/b/p/o/b;->i:Lc/b/p/o/a0;

    check-cast p1, Landroidx/appcompat/widget/ActionMenuView;

    iget-boolean v0, p0, Lc/b/q/k;->m:Z

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionMenuView;->setOverflowReserved(Z)V

    return-void
.end method

.method public a(ILc/b/p/o/p;)Z
    .locals 0

    .line 48
    invoke-virtual {p2}, Lc/b/p/o/p;->h()Z

    move-result p1

    return p1
.end method

.method public a(Landroid/view/ViewGroup;I)Z
    .locals 2

    .line 71
    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lc/b/q/k;->j:Lc/b/q/h;

    if-ne v0, v1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 72
    :cond_0
    invoke-super {p0, p1, p2}, Lc/b/p/o/b;->a(Landroid/view/ViewGroup;I)Z

    move-result p1

    return p1
.end method

.method public a(Lc/b/p/o/g0;)Z
    .locals 7

    .line 73
    invoke-virtual {p1}, Lc/b/p/o/m;->hasVisibleItems()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    move-object v0, p1

    .line 74
    :goto_0
    invoke-virtual {v0}, Lc/b/p/o/g0;->t()Landroid/view/Menu;

    move-result-object v2

    iget-object v3, p0, Lc/b/p/o/b;->d:Lc/b/p/o/m;

    if-eq v2, v3, :cond_1

    .line 75
    invoke-virtual {v0}, Lc/b/p/o/g0;->t()Landroid/view/Menu;

    move-result-object v0

    check-cast v0, Lc/b/p/o/g0;

    goto :goto_0

    .line 76
    :cond_1
    invoke-virtual {v0}, Lc/b/p/o/g0;->getItem()Landroid/view/MenuItem;

    move-result-object v0

    invoke-virtual {p0, v0}, Lc/b/q/k;->a(Landroid/view/MenuItem;)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_2

    return v1

    .line 77
    :cond_2
    invoke-virtual {p1}, Lc/b/p/o/g0;->getItem()Landroid/view/MenuItem;

    move-result-object v2

    invoke-interface {v2}, Landroid/view/MenuItem;->getItemId()I

    .line 78
    invoke-virtual {p1}, Lc/b/p/o/m;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_1
    const/4 v4, 0x1

    if-ge v3, v2, :cond_4

    .line 79
    invoke-virtual {p1, v3}, Lc/b/p/o/m;->getItem(I)Landroid/view/MenuItem;

    move-result-object v5

    .line 80
    invoke-interface {v5}, Landroid/view/MenuItem;->isVisible()Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-interface {v5}, Landroid/view/MenuItem;->getIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v5

    if-eqz v5, :cond_3

    const/4 v1, 0x1

    goto :goto_2

    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 81
    :cond_4
    :goto_2
    new-instance v2, Lc/b/q/d;

    iget-object v3, p0, Lc/b/p/o/b;->c:Landroid/content/Context;

    invoke-direct {v2, p0, v3, p1, v0}, Lc/b/q/d;-><init>(Lc/b/q/k;Landroid/content/Context;Lc/b/p/o/g0;Landroid/view/View;)V

    iput-object v2, p0, Lc/b/q/k;->y:Lc/b/q/d;

    .line 82
    invoke-virtual {v2, v1}, Lc/b/p/o/y;->a(Z)V

    .line 83
    iget-object v0, p0, Lc/b/q/k;->y:Lc/b/q/d;

    invoke-virtual {v0}, Lc/b/p/o/y;->f()V

    .line 84
    invoke-super {p0, p1}, Lc/b/p/o/b;->a(Lc/b/p/o/g0;)Z

    return v4
.end method

.method public b(Landroid/view/ViewGroup;)Lc/b/p/o/a0;
    .locals 1

    .line 3
    iget-object v0, p0, Lc/b/p/o/b;->i:Lc/b/p/o/a0;

    .line 4
    invoke-super {p0, p1}, Lc/b/p/o/b;->b(Landroid/view/ViewGroup;)Lc/b/p/o/a0;

    move-result-object p1

    if-eq v0, p1, :cond_0

    .line 5
    move-object v0, p1

    check-cast v0, Landroidx/appcompat/widget/ActionMenuView;

    invoke-virtual {v0, p0}, Landroidx/appcompat/widget/ActionMenuView;->setPresenter(Lc/b/q/k;)V

    :cond_0
    return-object p1
.end method

.method public b(Z)V
    .locals 0

    .line 2
    iput-boolean p1, p0, Lc/b/q/k;->u:Z

    return-void
.end method

.method public b()Z
    .locals 2

    .line 6
    invoke-virtual {p0}, Lc/b/q/k;->e()Z

    move-result v0

    .line 7
    invoke-virtual {p0}, Lc/b/q/k;->f()Z

    move-result v1

    or-int/2addr v0, v1

    return v0
.end method

.method public c(Z)V
    .locals 0

    .line 2
    iput-boolean p1, p0, Lc/b/q/k;->m:Z

    const/4 p1, 0x1

    .line 3
    iput-boolean p1, p0, Lc/b/q/k;->n:Z

    return-void
.end method

.method public c()Z
    .locals 20

    move-object/from16 v0, p0

    .line 4
    iget-object v1, v0, Lc/b/p/o/b;->d:Lc/b/p/o/m;

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    .line 5
    invoke-virtual {v1}, Lc/b/p/o/m;->n()Ljava/util/ArrayList;

    move-result-object v1

    .line 6
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v4

    goto :goto_0

    :cond_0
    move-object v1, v2

    const/4 v4, 0x0

    .line 7
    :goto_0
    iget v5, v0, Lc/b/q/k;->q:I

    .line 8
    iget v6, v0, Lc/b/q/k;->p:I

    .line 9
    invoke-static {v3, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v7

    .line 10
    iget-object v8, v0, Lc/b/p/o/b;->i:Lc/b/p/o/a0;

    check-cast v8, Landroid/view/ViewGroup;

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    :goto_1
    if-ge v9, v4, :cond_4

    .line 11
    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lc/b/p/o/p;

    .line 12
    invoke-virtual {v14}, Lc/b/p/o/p;->k()Z

    move-result v15

    if-eqz v15, :cond_1

    add-int/lit8 v11, v11, 0x1

    goto :goto_2

    .line 13
    :cond_1
    invoke-virtual {v14}, Lc/b/p/o/p;->j()Z

    move-result v15

    if-eqz v15, :cond_2

    add-int/lit8 v12, v12, 0x1

    goto :goto_2

    :cond_2
    const/4 v10, 0x1

    .line 14
    :goto_2
    iget-boolean v13, v0, Lc/b/q/k;->u:Z

    if-eqz v13, :cond_3

    invoke-virtual {v14}, Lc/b/p/o/p;->isActionViewExpanded()Z

    move-result v13

    if-eqz v13, :cond_3

    const/4 v5, 0x0

    :cond_3
    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    .line 15
    :cond_4
    iget-boolean v9, v0, Lc/b/q/k;->m:Z

    if-eqz v9, :cond_6

    if-nez v10, :cond_5

    add-int/2addr v12, v11

    if-le v12, v5, :cond_6

    :cond_5
    add-int/lit8 v5, v5, -0x1

    :cond_6
    sub-int/2addr v5, v11

    .line 16
    iget-object v9, v0, Lc/b/q/k;->w:Landroid/util/SparseBooleanArray;

    .line 17
    invoke-virtual {v9}, Landroid/util/SparseBooleanArray;->clear()V

    .line 18
    iget-boolean v10, v0, Lc/b/q/k;->s:Z

    if-eqz v10, :cond_7

    .line 19
    iget v10, v0, Lc/b/q/k;->v:I

    div-int v11, v6, v10

    .line 20
    rem-int v12, v6, v10

    .line 21
    div-int/2addr v12, v11

    add-int/2addr v10, v12

    goto :goto_3

    :cond_7
    const/4 v10, 0x0

    const/4 v11, 0x0

    :goto_3
    const/4 v12, 0x0

    const/4 v14, 0x0

    :goto_4
    if-ge v12, v4, :cond_1b

    .line 22
    invoke-virtual {v1, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lc/b/p/o/p;

    .line 23
    invoke-virtual {v15}, Lc/b/p/o/p;->k()Z

    move-result v16

    if-eqz v16, :cond_b

    .line 24
    invoke-virtual {v0, v15, v2, v8}, Lc/b/q/k;->a(Lc/b/p/o/p;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v13

    .line 25
    iget-boolean v2, v0, Lc/b/q/k;->s:Z

    if-eqz v2, :cond_8

    .line 26
    invoke-static {v13, v10, v11, v7, v3}, Landroidx/appcompat/widget/ActionMenuView;->b(Landroid/view/View;IIII)I

    move-result v2

    sub-int/2addr v11, v2

    goto :goto_5

    .line 27
    :cond_8
    invoke-virtual {v13, v7, v7}, Landroid/view/View;->measure(II)V

    .line 28
    :goto_5
    invoke-virtual {v13}, Landroid/view/View;->getMeasuredWidth()I

    move-result v2

    sub-int/2addr v6, v2

    if-nez v14, :cond_9

    move v14, v2

    .line 29
    :cond_9
    invoke-virtual {v15}, Lc/b/p/o/p;->getGroupId()I

    move-result v2

    const/4 v13, 0x1

    if-eqz v2, :cond_a

    .line 30
    invoke-virtual {v9, v2, v13}, Landroid/util/SparseBooleanArray;->put(IZ)V

    .line 31
    :cond_a
    invoke-virtual {v15, v13}, Lc/b/p/o/p;->d(Z)V

    move/from16 v17, v4

    :goto_6
    const/4 v0, 0x0

    goto/16 :goto_d

    .line 32
    :cond_b
    invoke-virtual {v15}, Lc/b/p/o/p;->j()Z

    move-result v2

    if-eqz v2, :cond_1a

    .line 33
    invoke-virtual {v15}, Lc/b/p/o/p;->getGroupId()I

    move-result v2

    .line 34
    invoke-virtual {v9, v2}, Landroid/util/SparseBooleanArray;->get(I)Z

    move-result v13

    if-gtz v5, :cond_c

    if-eqz v13, :cond_e

    :cond_c
    if-lez v6, :cond_e

    .line 35
    iget-boolean v3, v0, Lc/b/q/k;->s:Z

    if-eqz v3, :cond_d

    if-lez v11, :cond_e

    :cond_d
    const/4 v3, 0x1

    goto :goto_7

    :cond_e
    const/4 v3, 0x0

    :goto_7
    move/from16 v18, v3

    move/from16 v17, v4

    if-eqz v3, :cond_14

    const/4 v3, 0x0

    .line 36
    invoke-virtual {v0, v15, v3, v8}, Lc/b/q/k;->a(Lc/b/p/o/p;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v4

    .line 37
    iget-boolean v3, v0, Lc/b/q/k;->s:Z

    if-eqz v3, :cond_f

    const/4 v3, 0x0

    .line 38
    invoke-static {v4, v10, v11, v7, v3}, Landroidx/appcompat/widget/ActionMenuView;->b(Landroid/view/View;IIII)I

    move-result v19

    sub-int v11, v11, v19

    if-nez v19, :cond_10

    const/16 v18, 0x0

    goto :goto_8

    .line 39
    :cond_f
    invoke-virtual {v4, v7, v7}, Landroid/view/View;->measure(II)V

    :cond_10
    :goto_8
    move/from16 v3, v18

    .line 40
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I

    move-result v4

    sub-int/2addr v6, v4

    if-nez v14, :cond_11

    move v14, v4

    .line 41
    :cond_11
    iget-boolean v4, v0, Lc/b/q/k;->s:Z

    if-eqz v4, :cond_12

    if-ltz v6, :cond_13

    goto :goto_9

    :cond_12
    add-int v4, v6, v14

    if-lez v4, :cond_13

    :goto_9
    const/4 v4, 0x1

    goto :goto_a

    :cond_13
    const/4 v4, 0x0

    :goto_a
    and-int/2addr v3, v4

    :cond_14
    if-eqz v3, :cond_15

    if-eqz v2, :cond_15

    const/4 v4, 0x1

    .line 42
    invoke-virtual {v9, v2, v4}, Landroid/util/SparseBooleanArray;->put(IZ)V

    goto :goto_c

    :cond_15
    if-eqz v13, :cond_18

    const/4 v4, 0x0

    .line 43
    invoke-virtual {v9, v2, v4}, Landroid/util/SparseBooleanArray;->put(IZ)V

    const/4 v4, 0x0

    :goto_b
    if-ge v4, v12, :cond_18

    .line 44
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lc/b/p/o/p;

    .line 45
    invoke-virtual {v13}, Lc/b/p/o/p;->getGroupId()I

    move-result v0

    if-ne v0, v2, :cond_17

    .line 46
    invoke-virtual {v13}, Lc/b/p/o/p;->h()Z

    move-result v0

    if-eqz v0, :cond_16

    add-int/lit8 v5, v5, 0x1

    :cond_16
    const/4 v0, 0x0

    .line 47
    invoke-virtual {v13, v0}, Lc/b/p/o/p;->d(Z)V

    :cond_17
    add-int/lit8 v4, v4, 0x1

    move-object/from16 v0, p0

    goto :goto_b

    :cond_18
    :goto_c
    if-eqz v3, :cond_19

    add-int/lit8 v5, v5, -0x1

    .line 48
    :cond_19
    invoke-virtual {v15, v3}, Lc/b/p/o/p;->d(Z)V

    goto/16 :goto_6

    :cond_1a
    move/from16 v17, v4

    const/4 v0, 0x0

    .line 49
    invoke-virtual {v15, v0}, Lc/b/p/o/p;->d(Z)V

    :goto_d
    add-int/lit8 v12, v12, 0x1

    move/from16 v4, v17

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object/from16 v0, p0

    goto/16 :goto_4

    :cond_1b
    const/4 v2, 0x1

    return v2
.end method

.method public d()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 2
    iget-object v0, p0, Lc/b/q/k;->j:Lc/b/q/h;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0

    .line 4
    :cond_0
    iget-boolean v0, p0, Lc/b/q/k;->l:Z

    if-eqz v0, :cond_1

    .line 5
    iget-object v0, p0, Lc/b/q/k;->k:Landroid/graphics/drawable/Drawable;

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public e()Z
    .locals 3

    .line 2
    iget-object v0, p0, Lc/b/q/k;->z:Lc/b/q/f;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iget-object v2, p0, Lc/b/p/o/b;->i:Lc/b/p/o/a0;

    if-eqz v2, :cond_0

    .line 3
    check-cast v2, Landroid/view/View;

    invoke-virtual {v2, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, Lc/b/q/k;->z:Lc/b/q/f;

    return v1

    .line 5
    :cond_0
    iget-object v0, p0, Lc/b/q/k;->x:Lc/b/q/i;

    if-eqz v0, :cond_1

    .line 6
    invoke-virtual {v0}, Lc/b/p/o/y;->b()V

    return v1

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public f()Z
    .locals 1

    .line 2
    iget-object v0, p0, Lc/b/q/k;->y:Lc/b/q/d;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Lc/b/p/o/y;->b()V

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public g()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lc/b/q/k;->z:Lc/b/q/f;

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lc/b/q/k;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public h()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lc/b/q/k;->x:Lc/b/q/i;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lc/b/p/o/y;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public i()Z
    .locals 7

    .line 1
    iget-boolean v0, p0, Lc/b/q/k;->m:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lc/b/q/k;->h()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lc/b/p/o/b;->d:Lc/b/p/o/m;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lc/b/p/o/b;->i:Lc/b/p/o/a0;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lc/b/q/k;->z:Lc/b/q/f;

    if-nez v1, :cond_0

    .line 2
    invoke-virtual {v0}, Lc/b/p/o/m;->j()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    new-instance v0, Lc/b/q/i;

    iget-object v3, p0, Lc/b/p/o/b;->c:Landroid/content/Context;

    iget-object v4, p0, Lc/b/p/o/b;->d:Lc/b/p/o/m;

    iget-object v5, p0, Lc/b/q/k;->j:Lc/b/q/h;

    const/4 v6, 0x1

    move-object v1, v0

    move-object v2, p0

    invoke-direct/range {v1 .. v6}, Lc/b/q/i;-><init>(Lc/b/q/k;Landroid/content/Context;Lc/b/p/o/m;Landroid/view/View;Z)V

    .line 4
    new-instance v1, Lc/b/q/f;

    invoke-direct {v1, p0, v0}, Lc/b/q/f;-><init>(Lc/b/q/k;Lc/b/q/i;)V

    iput-object v1, p0, Lc/b/q/k;->z:Lc/b/q/f;

    .line 5
    iget-object v0, p0, Lc/b/p/o/b;->i:Lc/b/p/o/a0;

    check-cast v0, Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    const/4 v0, 0x0

    .line 6
    invoke-super {p0, v0}, Lc/b/p/o/b;->a(Lc/b/p/o/g0;)Z

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
