.class public Lc/b/p/o/r;
.super Lc/b/p/o/q;
.source "SourceFile"

# interfaces
.implements Landroid/view/ActionProvider$VisibilityListener;


# instance fields
.field public d:Lc/h/n/f;


# direct methods
.method public constructor <init>(Lc/b/p/o/v;Landroid/content/Context;Landroid/view/ActionProvider;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lc/b/p/o/q;-><init>(Lc/b/p/o/v;Landroid/content/Context;Landroid/view/ActionProvider;)V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/MenuItem;)Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/b/p/o/q;->b:Landroid/view/ActionProvider;

    invoke-virtual {v0, p1}, Landroid/view/ActionProvider;->onCreateActionView(Landroid/view/MenuItem;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public a(Lc/h/n/f;)V
    .locals 1

    .line 2
    iput-object p1, p0, Lc/b/p/o/r;->d:Lc/h/n/f;

    .line 3
    iget-object v0, p0, Lc/b/p/o/q;->b:Landroid/view/ActionProvider;

    if-eqz p1, :cond_0

    move-object p1, p0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {v0, p1}, Landroid/view/ActionProvider;->setVisibilityListener(Landroid/view/ActionProvider$VisibilityListener;)V

    return-void
.end method

.method public b()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lc/b/p/o/q;->b:Landroid/view/ActionProvider;

    invoke-virtual {v0}, Landroid/view/ActionProvider;->isVisible()Z

    move-result v0

    return v0
.end method

.method public e()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lc/b/p/o/q;->b:Landroid/view/ActionProvider;

    invoke-virtual {v0}, Landroid/view/ActionProvider;->overridesItemVisibility()Z

    move-result v0

    return v0
.end method

.method public onActionProviderVisibilityChanged(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/b/p/o/r;->d:Lc/h/n/f;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0, p1}, Lc/h/n/f;->onActionProviderVisibilityChanged(Z)V

    :cond_0
    return-void
.end method
