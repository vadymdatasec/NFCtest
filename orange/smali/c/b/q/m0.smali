.class public Lc/b/q/m0;
.super Lc/b/q/p1;
.source "SourceFile"

# interfaces
.implements Lc/b/q/p0;


# instance fields
.field public J:Ljava/lang/CharSequence;

.field public K:Landroid/widget/ListAdapter;

.field public final L:Landroid/graphics/Rect;

.field public M:I

.field public final synthetic N:Lc/b/q/q0;


# direct methods
.method public constructor <init>(Lc/b/q/q0;Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/b/q/m0;->N:Lc/b/q/q0;

    .line 2
    invoke-direct {p0, p2, p3, p4}, Lc/b/q/p1;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 3
    new-instance p2, Landroid/graphics/Rect;

    invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V

    iput-object p2, p0, Lc/b/q/m0;->L:Landroid/graphics/Rect;

    .line 4
    invoke-virtual {p0, p1}, Lc/b/q/p1;->a(Landroid/view/View;)V

    const/4 p2, 0x1

    .line 5
    invoke-virtual {p0, p2}, Lc/b/q/p1;->a(Z)V

    const/4 p2, 0x0

    .line 6
    invoke-virtual {p0, p2}, Lc/b/q/p1;->h(I)V

    .line 7
    new-instance p2, Lc/b/q/j0;

    invoke-direct {p2, p0, p1}, Lc/b/q/j0;-><init>(Lc/b/q/m0;Lc/b/q/q0;)V

    invoke-virtual {p0, p2}, Lc/b/q/p1;->a(Landroid/widget/AdapterView$OnItemClickListener;)V

    return-void
.end method

.method public static synthetic a(Lc/b/q/m0;)V
    .locals 0

    .line 1
    invoke-super {p0}, Lc/b/q/p1;->a()V

    return-void
.end method


# virtual methods
.method public a(II)V
    .locals 4

    .line 5
    invoke-virtual {p0}, Lc/b/q/p1;->b()Z

    move-result v0

    .line 6
    invoke-virtual {p0}, Lc/b/q/m0;->o()V

    const/4 v1, 0x2

    .line 7
    invoke-virtual {p0, v1}, Lc/b/q/p1;->g(I)V

    .line 8
    invoke-super {p0}, Lc/b/q/p1;->a()V

    .line 9
    invoke-virtual {p0}, Lc/b/q/p1;->g()Landroid/widget/ListView;

    move-result-object v1

    const/4 v2, 0x1

    .line 10
    invoke-virtual {v1, v2}, Landroid/widget/ListView;->setChoiceMode(I)V

    .line 11
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x11

    if-lt v2, v3, :cond_0

    .line 12
    invoke-virtual {v1, p1}, Landroid/widget/ListView;->setTextDirection(I)V

    .line 13
    invoke-virtual {v1, p2}, Landroid/widget/ListView;->setTextAlignment(I)V

    .line 14
    :cond_0
    iget-object p1, p0, Lc/b/q/m0;->N:Lc/b/q/q0;

    invoke-virtual {p1}, Landroid/widget/Spinner;->getSelectedItemPosition()I

    move-result p1

    invoke-virtual {p0, p1}, Lc/b/q/p1;->i(I)V

    if-eqz v0, :cond_1

    return-void

    .line 15
    :cond_1
    iget-object p1, p0, Lc/b/q/m0;->N:Lc/b/q/q0;

    invoke-virtual {p1}, Landroid/widget/Spinner;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 16
    new-instance p2, Lc/b/q/k0;

    invoke-direct {p2, p0}, Lc/b/q/k0;-><init>(Lc/b/q/m0;)V

    .line 17
    invoke-virtual {p1, p2}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 18
    new-instance p1, Lc/b/q/l0;

    invoke-direct {p1, p0, p2}, Lc/b/q/l0;-><init>(Lc/b/q/m0;Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    invoke-virtual {p0, p1}, Lc/b/q/p1;->a(Landroid/widget/PopupWindow$OnDismissListener;)V

    :cond_2
    return-void
.end method

.method public a(Landroid/widget/ListAdapter;)V
    .locals 0

    .line 2
    invoke-super {p0, p1}, Lc/b/q/p1;->a(Landroid/widget/ListAdapter;)V

    .line 3
    iput-object p1, p0, Lc/b/q/m0;->K:Landroid/widget/ListAdapter;

    return-void
.end method

.method public a(Ljava/lang/CharSequence;)V
    .locals 0

    .line 4
    iput-object p1, p0, Lc/b/q/m0;->J:Ljava/lang/CharSequence;

    return-void
.end method

.method public b(Landroid/view/View;)Z
    .locals 1

    .line 1
    invoke-static {p1}, Lc/h/n/v0;->C(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lc/b/q/m0;->L:Landroid/graphics/Rect;

    invoke-virtual {p1, v0}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public c(I)V
    .locals 0

    .line 1
    iput p1, p0, Lc/b/q/m0;->M:I

    return-void
.end method

.method public f()Ljava/lang/CharSequence;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/b/q/m0;->J:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public o()V
    .locals 8

    .line 1
    invoke-virtual {p0}, Lc/b/q/p1;->e()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 2
    iget-object v1, p0, Lc/b/q/m0;->N:Lc/b/q/q0;

    iget-object v1, v1, Lc/b/q/q0;->i:Landroid/graphics/Rect;

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 3
    iget-object v0, p0, Lc/b/q/m0;->N:Lc/b/q/q0;

    invoke-static {v0}, Lc/b/q/v2;->a(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lc/b/q/m0;->N:Lc/b/q/q0;

    iget-object v0, v0, Lc/b/q/q0;->i:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->right:I

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lc/b/q/m0;->N:Lc/b/q/q0;

    iget-object v0, v0, Lc/b/q/q0;->i:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->left:I

    neg-int v0, v0

    :goto_0
    move v1, v0

    goto :goto_1

    .line 4
    :cond_1
    iget-object v0, p0, Lc/b/q/m0;->N:Lc/b/q/q0;

    iget-object v0, v0, Lc/b/q/q0;->i:Landroid/graphics/Rect;

    iput v1, v0, Landroid/graphics/Rect;->right:I

    iput v1, v0, Landroid/graphics/Rect;->left:I

    .line 5
    :goto_1
    iget-object v0, p0, Lc/b/q/m0;->N:Lc/b/q/q0;

    invoke-virtual {v0}, Landroid/widget/Spinner;->getPaddingLeft()I

    move-result v0

    .line 6
    iget-object v2, p0, Lc/b/q/m0;->N:Lc/b/q/q0;

    invoke-virtual {v2}, Landroid/widget/Spinner;->getPaddingRight()I

    move-result v2

    .line 7
    iget-object v3, p0, Lc/b/q/m0;->N:Lc/b/q/q0;

    invoke-virtual {v3}, Landroid/widget/Spinner;->getWidth()I

    move-result v3

    .line 8
    iget-object v4, p0, Lc/b/q/m0;->N:Lc/b/q/q0;

    iget v5, v4, Lc/b/q/q0;->h:I

    const/4 v6, -0x2

    if-ne v5, v6, :cond_3

    .line 9
    iget-object v5, p0, Lc/b/q/m0;->K:Landroid/widget/ListAdapter;

    check-cast v5, Landroid/widget/SpinnerAdapter;

    .line 10
    invoke-virtual {p0}, Lc/b/q/p1;->e()Landroid/graphics/drawable/Drawable;

    move-result-object v6

    .line 11
    invoke-virtual {v4, v5, v6}, Lc/b/q/q0;->a(Landroid/widget/SpinnerAdapter;Landroid/graphics/drawable/Drawable;)I

    move-result v4

    .line 12
    iget-object v5, p0, Lc/b/q/m0;->N:Lc/b/q/q0;

    invoke-virtual {v5}, Landroid/widget/Spinner;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    .line 13
    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v5

    iget v5, v5, Landroid/util/DisplayMetrics;->widthPixels:I

    iget-object v6, p0, Lc/b/q/m0;->N:Lc/b/q/q0;

    iget-object v6, v6, Lc/b/q/q0;->i:Landroid/graphics/Rect;

    iget v7, v6, Landroid/graphics/Rect;->left:I

    sub-int/2addr v5, v7

    iget v6, v6, Landroid/graphics/Rect;->right:I

    sub-int/2addr v5, v6

    if-le v4, v5, :cond_2

    move v4, v5

    :cond_2
    sub-int v5, v3, v0

    sub-int/2addr v5, v2

    .line 14
    invoke-static {v4, v5}, Ljava/lang/Math;->max(II)I

    move-result v4

    invoke-virtual {p0, v4}, Lc/b/q/p1;->e(I)V

    goto :goto_2

    :cond_3
    const/4 v4, -0x1

    if-ne v5, v4, :cond_4

    sub-int v4, v3, v0

    sub-int/2addr v4, v2

    .line 15
    invoke-virtual {p0, v4}, Lc/b/q/p1;->e(I)V

    goto :goto_2

    .line 16
    :cond_4
    invoke-virtual {p0, v5}, Lc/b/q/p1;->e(I)V

    .line 17
    :goto_2
    iget-object v4, p0, Lc/b/q/m0;->N:Lc/b/q/q0;

    invoke-static {v4}, Lc/b/q/v2;->a(Landroid/view/View;)Z

    move-result v4

    if-eqz v4, :cond_5

    sub-int/2addr v3, v2

    .line 18
    invoke-virtual {p0}, Lc/b/q/p1;->k()I

    move-result v0

    sub-int/2addr v3, v0

    .line 19
    invoke-virtual {p0}, Lc/b/q/m0;->p()I

    move-result v0

    sub-int/2addr v3, v0

    add-int/2addr v1, v3

    goto :goto_3

    .line 20
    :cond_5
    invoke-virtual {p0}, Lc/b/q/m0;->p()I

    move-result v2

    add-int/2addr v0, v2

    add-int/2addr v1, v0

    .line 21
    :goto_3
    invoke-virtual {p0, v1}, Lc/b/q/p1;->a(I)V

    return-void
.end method

.method public p()I
    .locals 1

    .line 1
    iget v0, p0, Lc/b/q/m0;->M:I

    return v0
.end method
