.class public Lc/b/k/d0;
.super Lc/h/n/e1;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lc/b/k/e0;


# direct methods
.method public constructor <init>(Lc/b/k/e0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/b/k/d0;->a:Lc/b/k/e0;

    invoke-direct {p0}, Lc/h/n/e1;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lc/b/k/d0;->a:Lc/b/k/e0;

    iget-object p1, p1, Lc/b/k/e0;->b:Lc/b/k/n0;

    iget-object p1, p1, Lc/b/k/n0;->q:Landroidx/appcompat/widget/ActionBarContextView;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContextView;->setVisibility(I)V

    .line 2
    iget-object p1, p0, Lc/b/k/d0;->a:Lc/b/k/e0;

    iget-object p1, p1, Lc/b/k/e0;->b:Lc/b/k/n0;

    iget-object v0, p1, Lc/b/k/n0;->r:Landroid/widget/PopupWindow;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    goto :goto_0

    .line 4
    :cond_0
    iget-object p1, p1, Lc/b/k/n0;->q:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    instance-of p1, p1, Landroid/view/View;

    if-eqz p1, :cond_1

    .line 5
    iget-object p1, p0, Lc/b/k/d0;->a:Lc/b/k/e0;

    iget-object p1, p1, Lc/b/k/e0;->b:Lc/b/k/n0;

    iget-object p1, p1, Lc/b/k/n0;->q:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    invoke-static {p1}, Lc/h/n/v0;->I(Landroid/view/View;)V

    .line 6
    :cond_1
    :goto_0
    iget-object p1, p0, Lc/b/k/d0;->a:Lc/b/k/e0;

    iget-object p1, p1, Lc/b/k/e0;->b:Lc/b/k/n0;

    iget-object p1, p1, Lc/b/k/n0;->q:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 7
    iget-object p1, p0, Lc/b/k/d0;->a:Lc/b/k/e0;

    iget-object p1, p1, Lc/b/k/e0;->b:Lc/b/k/n0;

    iget-object p1, p1, Lc/b/k/n0;->t:Lc/h/n/c1;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lc/h/n/c1;->a(Lc/h/n/d1;)Lc/h/n/c1;

    .line 8
    iget-object p1, p0, Lc/b/k/d0;->a:Lc/b/k/e0;

    iget-object p1, p1, Lc/b/k/e0;->b:Lc/b/k/n0;

    iput-object v0, p1, Lc/b/k/n0;->t:Lc/h/n/c1;

    return-void
.end method
