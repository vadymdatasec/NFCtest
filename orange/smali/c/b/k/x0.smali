.class public Lc/b/k/x0;
.super Lc/b/k/a;
.source "SourceFile"


# instance fields
.field public a:Lc/b/q/z0;

.field public b:Z

.field public c:Landroid/view/Window$Callback;

.field public d:Z

.field public e:Z

.field public f:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lc/b/k/b;",
            ">;"
        }
    .end annotation
.end field

.field public final g:Ljava/lang/Runnable;

.field public final h:Landroidx/appcompat/widget/Toolbar$f;


# direct methods
.method public constructor <init>(Landroidx/appcompat/widget/Toolbar;Ljava/lang/CharSequence;Landroid/view/Window$Callback;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lc/b/k/a;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lc/b/k/x0;->f:Ljava/util/ArrayList;

    .line 3
    new-instance v0, Lc/b/k/s0;

    invoke-direct {v0, p0}, Lc/b/k/s0;-><init>(Lc/b/k/x0;)V

    iput-object v0, p0, Lc/b/k/x0;->g:Ljava/lang/Runnable;

    .line 4
    new-instance v0, Lc/b/k/t0;

    invoke-direct {v0, p0}, Lc/b/k/t0;-><init>(Lc/b/k/x0;)V

    iput-object v0, p0, Lc/b/k/x0;->h:Landroidx/appcompat/widget/Toolbar$f;

    .line 5
    new-instance v0, Lc/b/q/o2;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lc/b/q/o2;-><init>(Landroidx/appcompat/widget/Toolbar;Z)V

    iput-object v0, p0, Lc/b/k/x0;->a:Lc/b/q/z0;

    .line 6
    new-instance v0, Lc/b/k/w0;

    invoke-direct {v0, p0, p3}, Lc/b/k/w0;-><init>(Lc/b/k/x0;Landroid/view/Window$Callback;)V

    iput-object v0, p0, Lc/b/k/x0;->c:Landroid/view/Window$Callback;

    .line 7
    iget-object p3, p0, Lc/b/k/x0;->a:Lc/b/q/z0;

    invoke-interface {p3, v0}, Lc/b/q/z0;->setWindowCallback(Landroid/view/Window$Callback;)V

    .line 8
    iget-object p3, p0, Lc/b/k/x0;->h:Landroidx/appcompat/widget/Toolbar$f;

    invoke-virtual {p1, p3}, Landroidx/appcompat/widget/Toolbar;->setOnMenuItemClickListener(Landroidx/appcompat/widget/Toolbar$f;)V

    .line 9
    iget-object p1, p0, Lc/b/k/x0;->a:Lc/b/q/z0;

    invoke-interface {p1, p2}, Lc/b/q/z0;->setWindowTitle(Ljava/lang/CharSequence;)V

    return-void
.end method


# virtual methods
.method public a(II)V
    .locals 2

    .line 3
    iget-object v0, p0, Lc/b/k/x0;->a:Lc/b/q/z0;

    invoke-interface {v0}, Lc/b/q/z0;->h()I

    move-result v0

    .line 4
    iget-object v1, p0, Lc/b/k/x0;->a:Lc/b/q/z0;

    and-int/2addr p1, p2

    not-int p2, p2

    and-int/2addr p2, v0

    or-int/2addr p1, p2

    invoke-interface {v1, p1}, Lc/b/q/z0;->c(I)V

    return-void
.end method

.method public a(Landroid/content/res/Configuration;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lc/b/k/a;->a(Landroid/content/res/Configuration;)V

    return-void
.end method

.method public a(Ljava/lang/CharSequence;)V
    .locals 1

    .line 2
    iget-object v0, p0, Lc/b/k/x0;->a:Lc/b/q/z0;

    invoke-interface {v0, p1}, Lc/b/q/z0;->setTitle(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public a(ILandroid/view/KeyEvent;)Z
    .locals 4

    .line 7
    invoke-virtual {p0}, Lc/b/k/x0;->l()Landroid/view/Menu;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    if-eqz p2, :cond_0

    .line 8
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getDeviceId()I

    move-result v2

    goto :goto_0

    :cond_0
    const/4 v2, -0x1

    .line 9
    :goto_0
    invoke-static {v2}, Landroid/view/KeyCharacterMap;->load(I)Landroid/view/KeyCharacterMap;

    move-result-object v2

    .line 10
    invoke-virtual {v2}, Landroid/view/KeyCharacterMap;->getKeyboardType()I

    move-result v2

    const/4 v3, 0x1

    if-eq v2, v3, :cond_1

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    invoke-interface {v0, v3}, Landroid/view/Menu;->setQwertyMode(Z)V

    .line 11
    invoke-interface {v0, p1, p2, v1}, Landroid/view/Menu;->performShortcut(ILandroid/view/KeyEvent;I)Z

    move-result p1

    return p1

    :cond_2
    return v1
.end method

.method public a(Landroid/view/KeyEvent;)Z
    .locals 1

    .line 5
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 6
    invoke-virtual {p0}, Lc/b/k/x0;->k()Z

    :cond_0
    return v0
.end method

.method public b(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/b/k/x0;->a:Lc/b/q/z0;

    invoke-interface {v0, p1}, Lc/b/q/z0;->setWindowTitle(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public b(Z)V
    .locals 3

    .line 2
    iget-boolean v0, p0, Lc/b/k/x0;->e:Z

    if-ne p1, v0, :cond_0

    return-void

    .line 3
    :cond_0
    iput-boolean p1, p0, Lc/b/k/x0;->e:Z

    .line 4
    iget-object v0, p0, Lc/b/k/x0;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 5
    iget-object v2, p0, Lc/b/k/x0;->f:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc/b/k/b;

    invoke-interface {v2, p1}, Lc/b/k/b;->a(Z)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public c(Z)V
    .locals 0

    return-void
.end method

.method public d(Z)V
    .locals 1

    const/4 v0, 0x4

    if-eqz p1, :cond_0

    const/4 p1, 0x4

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 1
    :goto_0
    invoke-virtual {p0, p1, v0}, Lc/b/k/x0;->a(II)V

    return-void
.end method

.method public e(Z)V
    .locals 0

    return-void
.end method

.method public e()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lc/b/k/x0;->a:Lc/b/q/z0;

    invoke-interface {v0}, Lc/b/q/z0;->c()Z

    move-result v0

    return v0
.end method

.method public f()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lc/b/k/x0;->a:Lc/b/q/z0;

    invoke-interface {v0}, Lc/b/q/z0;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lc/b/k/x0;->a:Lc/b/q/z0;

    invoke-interface {v0}, Lc/b/q/z0;->collapseActionView()V

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public g()I
    .locals 1

    .line 1
    iget-object v0, p0, Lc/b/k/x0;->a:Lc/b/q/z0;

    invoke-interface {v0}, Lc/b/q/z0;->h()I

    move-result v0

    return v0
.end method

.method public h()Landroid/content/Context;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/b/k/x0;->a:Lc/b/q/z0;

    invoke-interface {v0}, Lc/b/q/z0;->k()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method public i()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lc/b/k/x0;->a:Lc/b/q/z0;

    invoke-interface {v0}, Lc/b/q/z0;->j()Landroid/view/ViewGroup;

    move-result-object v0

    iget-object v1, p0, Lc/b/k/x0;->g:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 2
    iget-object v0, p0, Lc/b/k/x0;->a:Lc/b/q/z0;

    invoke-interface {v0}, Lc/b/q/z0;->j()Landroid/view/ViewGroup;

    move-result-object v0

    iget-object v1, p0, Lc/b/k/x0;->g:Ljava/lang/Runnable;

    invoke-static {v0, v1}, Lc/h/n/v0;->a(Landroid/view/View;Ljava/lang/Runnable;)V

    const/4 v0, 0x1

    return v0
.end method

.method public j()V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/b/k/x0;->a:Lc/b/q/z0;

    invoke-interface {v0}, Lc/b/q/z0;->j()Landroid/view/ViewGroup;

    move-result-object v0

    iget-object v1, p0, Lc/b/k/x0;->g:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeCallbacks(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public k()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lc/b/k/x0;->a:Lc/b/q/z0;

    invoke-interface {v0}, Lc/b/q/z0;->d()Z

    move-result v0

    return v0
.end method

.method public final l()Landroid/view/Menu;
    .locals 3

    .line 1
    iget-boolean v0, p0, Lc/b/k/x0;->d:Z

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lc/b/k/x0;->a:Lc/b/q/z0;

    new-instance v1, Lc/b/k/u0;

    invoke-direct {v1, p0}, Lc/b/k/u0;-><init>(Lc/b/k/x0;)V

    new-instance v2, Lc/b/k/v0;

    invoke-direct {v2, p0}, Lc/b/k/v0;-><init>(Lc/b/k/x0;)V

    invoke-interface {v0, v1, v2}, Lc/b/q/z0;->a(Lc/b/p/o/z$a;Lc/b/p/o/m$a;)V

    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Lc/b/k/x0;->d:Z

    .line 4
    :cond_0
    iget-object v0, p0, Lc/b/k/x0;->a:Lc/b/q/z0;

    invoke-interface {v0}, Lc/b/q/z0;->i()Landroid/view/Menu;

    move-result-object v0

    return-object v0
.end method

.method public m()Landroid/view/Window$Callback;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/b/k/x0;->c:Landroid/view/Window$Callback;

    return-object v0
.end method

.method public n()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lc/b/k/x0;->l()Landroid/view/Menu;

    move-result-object v0

    .line 2
    instance-of v1, v0, Lc/b/p/o/m;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lc/b/p/o/m;

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    if-eqz v1, :cond_1

    .line 3
    invoke-virtual {v1}, Lc/b/p/o/m;->s()V

    .line 4
    :cond_1
    :try_start_0
    invoke-interface {v0}, Landroid/view/Menu;->clear()V

    .line 5
    iget-object v3, p0, Lc/b/k/x0;->c:Landroid/view/Window$Callback;

    const/4 v4, 0x0

    invoke-interface {v3, v4, v0}, Landroid/view/Window$Callback;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object v3, p0, Lc/b/k/x0;->c:Landroid/view/Window$Callback;

    .line 6
    invoke-interface {v3, v4, v2, v0}, Landroid/view/Window$Callback;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    move-result v2

    if-nez v2, :cond_3

    .line 7
    :cond_2
    invoke-interface {v0}, Landroid/view/Menu;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_3
    if-eqz v1, :cond_4

    .line 8
    invoke-virtual {v1}, Lc/b/p/o/m;->r()V

    :cond_4
    return-void

    :catchall_0
    move-exception v0

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Lc/b/p/o/m;->r()V

    .line 9
    :cond_5
    throw v0
.end method
