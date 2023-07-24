.class public Lc/b/q/g;
.super Lc/b/q/h1;
.source "SourceFile"


# instance fields
.field public final synthetic k:Lc/b/q/h;


# direct methods
.method public constructor <init>(Lc/b/q/h;Landroid/view/View;Lc/b/q/k;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/b/q/g;->k:Lc/b/q/h;

    invoke-direct {p0, p2}, Lc/b/q/h1;-><init>(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public b()Lc/b/p/o/c0;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/b/q/g;->k:Lc/b/q/h;

    iget-object v0, v0, Lc/b/q/h;->d:Lc/b/q/k;

    iget-object v0, v0, Lc/b/q/k;->x:Lc/b/q/i;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 2
    :cond_0
    invoke-virtual {v0}, Lc/b/p/o/y;->c()Lc/b/p/o/w;

    move-result-object v0

    return-object v0
.end method

.method public c()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lc/b/q/g;->k:Lc/b/q/h;

    iget-object v0, v0, Lc/b/q/h;->d:Lc/b/q/k;

    invoke-virtual {v0}, Lc/b/q/k;->i()Z

    const/4 v0, 0x1

    return v0
.end method

.method public d()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lc/b/q/g;->k:Lc/b/q/h;

    iget-object v0, v0, Lc/b/q/h;->d:Lc/b/q/k;

    iget-object v1, v0, Lc/b/q/k;->z:Lc/b/q/f;

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    return v0

    .line 2
    :cond_0
    invoke-virtual {v0}, Lc/b/q/k;->e()Z

    const/4 v0, 0x1

    return v0
.end method
