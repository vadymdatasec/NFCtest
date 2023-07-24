.class public Lc/l/d/p0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lc/l/d/r0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/l/d/r0<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lc/l/d/r0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/l/d/r0<",
            "*>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lc/l/d/p0;->a:Lc/l/d/r0;

    return-void
.end method

.method public static a(Lc/l/d/r0;)Lc/l/d/p0;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/l/d/r0<",
            "*>;)",
            "Lc/l/d/p0;"
        }
    .end annotation

    .line 1
    new-instance v0, Lc/l/d/p0;

    const-string v1, "callbacks == null"

    invoke-static {p0, v1}, Lc/h/m/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p0, Lc/l/d/r0;

    invoke-direct {v0, p0}, Lc/l/d/p0;-><init>(Lc/l/d/r0;)V

    return-object v0
.end method


# virtual methods
.method public a(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    .line 3
    iget-object v0, p0, Lc/l/d/p0;->a:Lc/l/d/r0;

    iget-object v0, v0, Lc/l/d/r0;->e:Lc/l/d/o1;

    invoke-virtual {v0}, Lc/l/d/o1;->B()Landroid/view/LayoutInflater$Factory2;

    move-result-object v0

    .line 4
    invoke-interface {v0, p1, p2, p3, p4}, Landroid/view/LayoutInflater$Factory2;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public a()V
    .locals 1

    .line 8
    iget-object v0, p0, Lc/l/d/p0;->a:Lc/l/d/r0;

    iget-object v0, v0, Lc/l/d/r0;->e:Lc/l/d/o1;

    invoke-virtual {v0}, Lc/l/d/o1;->g()V

    return-void
.end method

.method public a(Landroid/content/res/Configuration;)V
    .locals 1

    .line 10
    iget-object v0, p0, Lc/l/d/p0;->a:Lc/l/d/r0;

    iget-object v0, v0, Lc/l/d/r0;->e:Lc/l/d/o1;

    invoke-virtual {v0, p1}, Lc/l/d/o1;->a(Landroid/content/res/Configuration;)V

    return-void
.end method

.method public a(Landroid/os/Parcelable;)V
    .locals 2

    .line 5
    iget-object v0, p0, Lc/l/d/p0;->a:Lc/l/d/r0;

    instance-of v1, v0, Lc/n/y;

    if-eqz v1, :cond_0

    .line 6
    iget-object v0, v0, Lc/l/d/r0;->e:Lc/l/d/o1;

    invoke-virtual {v0, p1}, Lc/l/d/o1;->a(Landroid/os/Parcelable;)V

    return-void

    .line 7
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you\'re still using retainNestedNonConfig()."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public a(Landroid/view/Menu;)V
    .locals 1

    .line 13
    iget-object v0, p0, Lc/l/d/p0;->a:Lc/l/d/r0;

    iget-object v0, v0, Lc/l/d/r0;->e:Lc/l/d/o1;

    invoke-virtual {v0, p1}, Lc/l/d/o1;->a(Landroid/view/Menu;)V

    return-void
.end method

.method public a(Landroidx/fragment/app/Fragment;)V
    .locals 2

    .line 2
    iget-object v0, p0, Lc/l/d/p0;->a:Lc/l/d/r0;

    iget-object v1, v0, Lc/l/d/r0;->e:Lc/l/d/o1;

    invoke-virtual {v1, v0, v0, p1}, Lc/l/d/o1;->a(Lc/l/d/r0;Lc/l/d/n0;Landroidx/fragment/app/Fragment;)V

    return-void
.end method

.method public a(Z)V
    .locals 1

    .line 9
    iget-object v0, p0, Lc/l/d/p0;->a:Lc/l/d/r0;

    iget-object v0, v0, Lc/l/d/r0;->e:Lc/l/d/o1;

    invoke-virtual {v0, p1}, Lc/l/d/o1;->a(Z)V

    return-void
.end method

.method public a(Landroid/view/Menu;Landroid/view/MenuInflater;)Z
    .locals 1

    .line 11
    iget-object v0, p0, Lc/l/d/p0;->a:Lc/l/d/r0;

    iget-object v0, v0, Lc/l/d/r0;->e:Lc/l/d/o1;

    invoke-virtual {v0, p1, p2}, Lc/l/d/o1;->a(Landroid/view/Menu;Landroid/view/MenuInflater;)Z

    move-result p1

    return p1
.end method

.method public a(Landroid/view/MenuItem;)Z
    .locals 1

    .line 12
    iget-object v0, p0, Lc/l/d/p0;->a:Lc/l/d/r0;

    iget-object v0, v0, Lc/l/d/r0;->e:Lc/l/d/o1;

    invoke-virtual {v0, p1}, Lc/l/d/o1;->a(Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method public b()V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/l/d/p0;->a:Lc/l/d/r0;

    iget-object v0, v0, Lc/l/d/r0;->e:Lc/l/d/o1;

    invoke-virtual {v0}, Lc/l/d/o1;->i()V

    return-void
.end method

.method public b(Z)V
    .locals 1

    .line 2
    iget-object v0, p0, Lc/l/d/p0;->a:Lc/l/d/r0;

    iget-object v0, v0, Lc/l/d/r0;->e:Lc/l/d/o1;

    invoke-virtual {v0, p1}, Lc/l/d/o1;->b(Z)V

    return-void
.end method

.method public b(Landroid/view/Menu;)Z
    .locals 1

    .line 3
    iget-object v0, p0, Lc/l/d/p0;->a:Lc/l/d/r0;

    iget-object v0, v0, Lc/l/d/r0;->e:Lc/l/d/o1;

    invoke-virtual {v0, p1}, Lc/l/d/o1;->b(Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public b(Landroid/view/MenuItem;)Z
    .locals 1

    .line 4
    iget-object v0, p0, Lc/l/d/p0;->a:Lc/l/d/r0;

    iget-object v0, v0, Lc/l/d/r0;->e:Lc/l/d/o1;

    invoke-virtual {v0, p1}, Lc/l/d/o1;->b(Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method public c()V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/l/d/p0;->a:Lc/l/d/r0;

    iget-object v0, v0, Lc/l/d/r0;->e:Lc/l/d/o1;

    invoke-virtual {v0}, Lc/l/d/o1;->j()V

    return-void
.end method

.method public d()V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/l/d/p0;->a:Lc/l/d/r0;

    iget-object v0, v0, Lc/l/d/r0;->e:Lc/l/d/o1;

    invoke-virtual {v0}, Lc/l/d/o1;->l()V

    return-void
.end method

.method public e()V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/l/d/p0;->a:Lc/l/d/r0;

    iget-object v0, v0, Lc/l/d/r0;->e:Lc/l/d/o1;

    invoke-virtual {v0}, Lc/l/d/o1;->m()V

    return-void
.end method

.method public f()V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/l/d/p0;->a:Lc/l/d/r0;

    iget-object v0, v0, Lc/l/d/r0;->e:Lc/l/d/o1;

    invoke-virtual {v0}, Lc/l/d/o1;->o()V

    return-void
.end method

.method public g()V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/l/d/p0;->a:Lc/l/d/r0;

    iget-object v0, v0, Lc/l/d/r0;->e:Lc/l/d/o1;

    invoke-virtual {v0}, Lc/l/d/o1;->p()V

    return-void
.end method

.method public h()V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/l/d/p0;->a:Lc/l/d/r0;

    iget-object v0, v0, Lc/l/d/r0;->e:Lc/l/d/o1;

    invoke-virtual {v0}, Lc/l/d/o1;->q()V

    return-void
.end method

.method public i()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lc/l/d/p0;->a:Lc/l/d/r0;

    iget-object v0, v0, Lc/l/d/r0;->e:Lc/l/d/o1;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lc/l/d/o1;->d(Z)Z

    move-result v0

    return v0
.end method

.method public j()Lc/l/d/o1;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/l/d/p0;->a:Lc/l/d/r0;

    iget-object v0, v0, Lc/l/d/r0;->e:Lc/l/d/o1;

    return-object v0
.end method

.method public k()V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/l/d/p0;->a:Lc/l/d/r0;

    iget-object v0, v0, Lc/l/d/r0;->e:Lc/l/d/o1;

    invoke-virtual {v0}, Lc/l/d/o1;->J()V

    return-void
.end method

.method public l()Landroid/os/Parcelable;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/l/d/p0;->a:Lc/l/d/r0;

    iget-object v0, v0, Lc/l/d/r0;->e:Lc/l/d/o1;

    invoke-virtual {v0}, Lc/l/d/o1;->M()Landroid/os/Parcelable;

    move-result-object v0

    return-object v0
.end method
