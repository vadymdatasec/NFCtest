.class public Lc/b/q/f0;
.super Lc/b/q/h1;
.source "SourceFile"


# instance fields
.field public final synthetic k:Lc/b/q/m0;

.field public final synthetic l:Lc/b/q/q0;


# direct methods
.method public constructor <init>(Lc/b/q/q0;Landroid/view/View;Lc/b/q/m0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/b/q/f0;->l:Lc/b/q/q0;

    iput-object p3, p0, Lc/b/q/f0;->k:Lc/b/q/m0;

    invoke-direct {p0, p2}, Lc/b/q/h1;-><init>(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public b()Lc/b/p/o/c0;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/b/q/f0;->k:Lc/b/q/m0;

    return-object v0
.end method

.method public c()Z
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SyntheticAccessor"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/b/q/f0;->l:Lc/b/q/q0;

    invoke-virtual {v0}, Lc/b/q/q0;->getInternalPopup()Lc/b/q/p0;

    move-result-object v0

    invoke-interface {v0}, Lc/b/q/p0;->b()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lc/b/q/f0;->l:Lc/b/q/q0;

    invoke-virtual {v0}, Lc/b/q/q0;->a()V

    :cond_0
    const/4 v0, 0x1

    return v0
.end method
