.class public Lc/b/k/b1;
.super Lc/h/n/e1;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lc/b/k/f1;


# direct methods
.method public constructor <init>(Lc/b/k/f1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/b/k/b1;->a:Lc/b/k/f1;

    invoke-direct {p0}, Lc/h/n/e1;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lc/b/k/b1;->a:Lc/b/k/f1;

    iget-boolean v0, p1, Lc/b/k/f1;->q:Z

    if-eqz v0, :cond_0

    iget-object p1, p1, Lc/b/k/f1;->g:Landroid/view/View;

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationY(F)V

    .line 3
    iget-object p1, p0, Lc/b/k/b1;->a:Lc/b/k/f1;

    iget-object p1, p1, Lc/b/k/f1;->d:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {p1, v0}, Landroid/widget/FrameLayout;->setTranslationY(F)V

    .line 4
    :cond_0
    iget-object p1, p0, Lc/b/k/b1;->a:Lc/b/k/f1;

    iget-object p1, p1, Lc/b/k/f1;->d:Landroidx/appcompat/widget/ActionBarContainer;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContainer;->setVisibility(I)V

    .line 5
    iget-object p1, p0, Lc/b/k/b1;->a:Lc/b/k/f1;

    iget-object p1, p1, Lc/b/k/f1;->d:Landroidx/appcompat/widget/ActionBarContainer;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContainer;->setTransitioning(Z)V

    .line 6
    iget-object p1, p0, Lc/b/k/b1;->a:Lc/b/k/f1;

    const/4 v0, 0x0

    iput-object v0, p1, Lc/b/k/f1;->v:Lc/b/p/m;

    .line 7
    invoke-virtual {p1}, Lc/b/k/f1;->l()V

    .line 8
    iget-object p1, p0, Lc/b/k/b1;->a:Lc/b/k/f1;

    iget-object p1, p1, Lc/b/k/f1;->c:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    if-eqz p1, :cond_1

    .line 9
    invoke-static {p1}, Lc/h/n/v0;->I(Landroid/view/View;)V

    :cond_1
    return-void
.end method
