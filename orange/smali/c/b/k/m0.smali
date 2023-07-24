.class public final Lc/b/k/m0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc/b/p/o/z$a;


# instance fields
.field public final synthetic b:Lc/b/k/n0;


# direct methods
.method public constructor <init>(Lc/b/k/n0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/b/k/m0;->b:Lc/b/k/n0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lc/b/p/o/m;Z)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Lc/b/p/o/m;->m()Lc/b/p/o/m;

    move-result-object v0

    const/4 v1, 0x1

    if-eq v0, p1, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 2
    :goto_0
    iget-object v3, p0, Lc/b/k/m0;->b:Lc/b/k/n0;

    if-eqz v2, :cond_1

    move-object p1, v0

    :cond_1
    invoke-virtual {v3, p1}, Lc/b/k/n0;->a(Landroid/view/Menu;)Lc/b/k/l0;

    move-result-object p1

    if-eqz p1, :cond_3

    if-eqz v2, :cond_2

    .line 3
    iget-object p2, p0, Lc/b/k/m0;->b:Lc/b/k/n0;

    iget v2, p1, Lc/b/k/l0;->a:I

    invoke-virtual {p2, v2, p1, v0}, Lc/b/k/n0;->a(ILc/b/k/l0;Landroid/view/Menu;)V

    .line 4
    iget-object p2, p0, Lc/b/k/m0;->b:Lc/b/k/n0;

    invoke-virtual {p2, p1, v1}, Lc/b/k/n0;->a(Lc/b/k/l0;Z)V

    goto :goto_1

    .line 5
    :cond_2
    iget-object v0, p0, Lc/b/k/m0;->b:Lc/b/k/n0;

    invoke-virtual {v0, p1, p2}, Lc/b/k/n0;->a(Lc/b/k/l0;Z)V

    :cond_3
    :goto_1
    return-void
.end method

.method public a(Lc/b/p/o/m;)Z
    .locals 2

    if-nez p1, :cond_0

    .line 6
    iget-object v0, p0, Lc/b/k/m0;->b:Lc/b/k/n0;

    iget-boolean v1, v0, Lc/b/k/n0;->B:Z

    if-eqz v1, :cond_0

    .line 7
    invoke-virtual {v0}, Lc/b/k/n0;->x()Landroid/view/Window$Callback;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 8
    iget-object v1, p0, Lc/b/k/m0;->b:Lc/b/k/n0;

    iget-boolean v1, v1, Lc/b/k/n0;->N:Z

    if-nez v1, :cond_0

    const/16 v1, 0x6c

    .line 9
    invoke-interface {v0, v1, p1}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    :cond_0
    const/4 p1, 0x1

    return p1
.end method
