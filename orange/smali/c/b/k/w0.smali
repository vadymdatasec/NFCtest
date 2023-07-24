.class public Lc/b/k/w0;
.super Lc/b/p/n;
.source "SourceFile"


# instance fields
.field public final synthetic c:Lc/b/k/x0;


# direct methods
.method public constructor <init>(Lc/b/k/x0;Landroid/view/Window$Callback;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/b/k/w0;->c:Lc/b/k/x0;

    .line 2
    invoke-direct {p0, p2}, Lc/b/p/n;-><init>(Landroid/view/Window$Callback;)V

    return-void
.end method


# virtual methods
.method public onCreatePanelView(I)Landroid/view/View;
    .locals 1

    if-nez p1, :cond_0

    .line 1
    new-instance p1, Landroid/view/View;

    iget-object v0, p0, Lc/b/k/w0;->c:Lc/b/k/x0;

    iget-object v0, v0, Lc/b/k/x0;->a:Lc/b/q/z0;

    invoke-interface {v0}, Lc/b/q/z0;->k()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    return-object p1

    .line 2
    :cond_0
    invoke-super {p0, p1}, Lc/b/p/n;->onCreatePanelView(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Lc/b/p/n;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    iget-object p2, p0, Lc/b/k/w0;->c:Lc/b/k/x0;

    iget-boolean p3, p2, Lc/b/k/x0;->b:Z

    if-nez p3, :cond_0

    .line 3
    iget-object p2, p2, Lc/b/k/x0;->a:Lc/b/q/z0;

    invoke-interface {p2}, Lc/b/q/z0;->e()V

    .line 4
    iget-object p2, p0, Lc/b/k/w0;->c:Lc/b/k/x0;

    const/4 p3, 0x1

    iput-boolean p3, p2, Lc/b/k/x0;->b:Z

    :cond_0
    return p1
.end method
