.class public Lc/b/k/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lc/b/k/n0;


# direct methods
.method public constructor <init>(Lc/b/k/n0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/b/k/a0;->b:Lc/b/k/n0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lc/b/k/a0;->b:Lc/b/k/n0;

    iget-object v1, v0, Lc/b/k/n0;->r:Landroid/widget/PopupWindow;

    iget-object v0, v0, Lc/b/k/n0;->q:Landroidx/appcompat/widget/ActionBarContextView;

    const/4 v2, 0x0

    const/16 v3, 0x37

    invoke-virtual {v1, v0, v3, v2, v2}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V

    .line 2
    iget-object v0, p0, Lc/b/k/a0;->b:Lc/b/k/n0;

    invoke-virtual {v0}, Lc/b/k/n0;->q()V

    .line 3
    iget-object v0, p0, Lc/b/k/a0;->b:Lc/b/k/n0;

    invoke-virtual {v0}, Lc/b/k/n0;->D()Z

    move-result v0

    const/high16 v1, 0x3f800000    # 1.0f

    if-eqz v0, :cond_0

    .line 4
    iget-object v0, p0, Lc/b/k/a0;->b:Lc/b/k/n0;

    iget-object v0, v0, Lc/b/k/n0;->q:Landroidx/appcompat/widget/ActionBarContextView;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->setAlpha(F)V

    .line 5
    iget-object v0, p0, Lc/b/k/a0;->b:Lc/b/k/n0;

    iget-object v2, v0, Lc/b/k/n0;->q:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-static {v2}, Lc/h/n/v0;->a(Landroid/view/View;)Lc/h/n/c1;

    move-result-object v2

    invoke-virtual {v2, v1}, Lc/h/n/c1;->a(F)Lc/h/n/c1;

    iput-object v2, v0, Lc/b/k/n0;->t:Lc/h/n/c1;

    .line 6
    iget-object v0, p0, Lc/b/k/a0;->b:Lc/b/k/n0;

    iget-object v0, v0, Lc/b/k/n0;->t:Lc/h/n/c1;

    new-instance v1, Lc/b/k/z;

    invoke-direct {v1, p0}, Lc/b/k/z;-><init>(Lc/b/k/a0;)V

    invoke-virtual {v0, v1}, Lc/h/n/c1;->a(Lc/h/n/d1;)Lc/h/n/c1;

    goto :goto_0

    .line 7
    :cond_0
    iget-object v0, p0, Lc/b/k/a0;->b:Lc/b/k/n0;

    iget-object v0, v0, Lc/b/k/n0;->q:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setAlpha(F)V

    .line 8
    iget-object v0, p0, Lc/b/k/a0;->b:Lc/b/k/n0;

    iget-object v0, v0, Lc/b/k/n0;->q:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0, v2}, Landroidx/appcompat/widget/ActionBarContextView;->setVisibility(I)V

    :goto_0
    return-void
.end method
