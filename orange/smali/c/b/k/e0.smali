.class public Lc/b/k/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc/b/p/b;


# instance fields
.field public a:Lc/b/p/b;

.field public final synthetic b:Lc/b/k/n0;


# direct methods
.method public constructor <init>(Lc/b/k/n0;Lc/b/p/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/b/k/e0;->b:Lc/b/k/n0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p2, p0, Lc/b/k/e0;->a:Lc/b/p/b;

    return-void
.end method


# virtual methods
.method public a(Lc/b/p/c;)V
    .locals 2

    .line 3
    iget-object v0, p0, Lc/b/k/e0;->a:Lc/b/p/b;

    invoke-interface {v0, p1}, Lc/b/p/b;->a(Lc/b/p/c;)V

    .line 4
    iget-object p1, p0, Lc/b/k/e0;->b:Lc/b/k/n0;

    iget-object v0, p1, Lc/b/k/n0;->r:Landroid/widget/PopupWindow;

    if-eqz v0, :cond_0

    .line 5
    iget-object p1, p1, Lc/b/k/n0;->g:Landroid/view/Window;

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    iget-object v0, p0, Lc/b/k/e0;->b:Lc/b/k/n0;

    iget-object v0, v0, Lc/b/k/n0;->s:Ljava/lang/Runnable;

    invoke-virtual {p1, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 6
    :cond_0
    iget-object p1, p0, Lc/b/k/e0;->b:Lc/b/k/n0;

    iget-object v0, p1, Lc/b/k/n0;->q:Landroidx/appcompat/widget/ActionBarContextView;

    if-eqz v0, :cond_1

    .line 7
    invoke-virtual {p1}, Lc/b/k/n0;->q()V

    .line 8
    iget-object p1, p0, Lc/b/k/e0;->b:Lc/b/k/n0;

    iget-object v0, p1, Lc/b/k/n0;->q:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-static {v0}, Lc/h/n/v0;->a(Landroid/view/View;)Lc/h/n/c1;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lc/h/n/c1;->a(F)Lc/h/n/c1;

    iput-object v0, p1, Lc/b/k/n0;->t:Lc/h/n/c1;

    .line 9
    iget-object p1, p0, Lc/b/k/e0;->b:Lc/b/k/n0;

    iget-object p1, p1, Lc/b/k/n0;->t:Lc/h/n/c1;

    new-instance v0, Lc/b/k/d0;

    invoke-direct {v0, p0}, Lc/b/k/d0;-><init>(Lc/b/k/e0;)V

    invoke-virtual {p1, v0}, Lc/h/n/c1;->a(Lc/h/n/d1;)Lc/h/n/c1;

    .line 10
    :cond_1
    iget-object p1, p0, Lc/b/k/e0;->b:Lc/b/k/n0;

    iget-object v0, p1, Lc/b/k/n0;->i:Lc/b/k/s;

    if-eqz v0, :cond_2

    .line 11
    iget-object p1, p1, Lc/b/k/n0;->p:Lc/b/p/c;

    invoke-interface {v0, p1}, Lc/b/k/s;->b(Lc/b/p/c;)V

    .line 12
    :cond_2
    iget-object p1, p0, Lc/b/k/e0;->b:Lc/b/k/n0;

    const/4 v0, 0x0

    iput-object v0, p1, Lc/b/k/n0;->p:Lc/b/p/c;

    return-void
.end method

.method public a(Lc/b/p/c;Landroid/view/Menu;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lc/b/k/e0;->a:Lc/b/p/b;

    invoke-interface {v0, p1, p2}, Lc/b/p/b;->a(Lc/b/p/c;Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public a(Lc/b/p/c;Landroid/view/MenuItem;)Z
    .locals 1

    .line 2
    iget-object v0, p0, Lc/b/k/e0;->a:Lc/b/p/b;

    invoke-interface {v0, p1, p2}, Lc/b/p/b;->a(Lc/b/p/c;Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method public b(Lc/b/p/c;Landroid/view/Menu;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lc/b/k/e0;->a:Lc/b/p/b;

    invoke-interface {v0, p1, p2}, Lc/b/p/b;->b(Lc/b/p/c;Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method
