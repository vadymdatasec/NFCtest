.class public final Lc/b/k/u0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc/b/p/o/z$a;


# instance fields
.field public b:Z

.field public final synthetic c:Lc/b/k/x0;


# direct methods
.method public constructor <init>(Lc/b/k/x0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/b/k/u0;->c:Lc/b/k/x0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lc/b/p/o/m;Z)V
    .locals 1

    .line 3
    iget-boolean p2, p0, Lc/b/k/u0;->b:Z

    if-eqz p2, :cond_0

    return-void

    :cond_0
    const/4 p2, 0x1

    .line 4
    iput-boolean p2, p0, Lc/b/k/u0;->b:Z

    .line 5
    iget-object p2, p0, Lc/b/k/u0;->c:Lc/b/k/x0;

    iget-object p2, p2, Lc/b/k/x0;->a:Lc/b/q/z0;

    invoke-interface {p2}, Lc/b/q/z0;->g()V

    .line 6
    iget-object p2, p0, Lc/b/k/u0;->c:Lc/b/k/x0;

    iget-object p2, p2, Lc/b/k/x0;->c:Landroid/view/Window$Callback;

    if-eqz p2, :cond_1

    const/16 v0, 0x6c

    .line 7
    invoke-interface {p2, v0, p1}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V

    :cond_1
    const/4 p1, 0x0

    .line 8
    iput-boolean p1, p0, Lc/b/k/u0;->b:Z

    return-void
.end method

.method public a(Lc/b/p/o/m;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lc/b/k/u0;->c:Lc/b/k/x0;

    iget-object v0, v0, Lc/b/k/x0;->c:Landroid/view/Window$Callback;

    if-eqz v0, :cond_0

    const/16 v1, 0x6c

    .line 2
    invoke-interface {v0, v1, p1}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
