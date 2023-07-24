.class public Lc/l/d/d3;
.super Lc/l/d/h3;
.source "SourceFile"


# instance fields
.field public final h:Lc/l/d/a2;


# direct methods
.method public constructor <init>(Lc/l/d/g3;Lc/l/d/f3;Lc/l/d/a2;Lc/h/j/c;)V
    .locals 1

    .line 1
    invoke-virtual {p3}, Lc/l/d/a2;->k()Landroidx/fragment/app/Fragment;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0, p4}, Lc/l/d/h3;-><init>(Lc/l/d/g3;Lc/l/d/f3;Landroidx/fragment/app/Fragment;Lc/h/j/c;)V

    .line 2
    iput-object p3, p0, Lc/l/d/d3;->h:Lc/l/d/a2;

    return-void
.end method


# virtual methods
.method public b()V
    .locals 1

    .line 1
    invoke-super {p0}, Lc/l/d/h3;->b()V

    .line 2
    iget-object v0, p0, Lc/l/d/d3;->h:Lc/l/d/a2;

    invoke-virtual {v0}, Lc/l/d/a2;->l()V

    return-void
.end method

.method public h()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lc/l/d/h3;->e()Lc/l/d/f3;

    move-result-object v0

    sget-object v1, Lc/l/d/f3;->c:Lc/l/d/f3;

    if-ne v0, v1, :cond_3

    .line 2
    iget-object v0, p0, Lc/l/d/d3;->h:Lc/l/d/a2;

    invoke-virtual {v0}, Lc/l/d/a2;->k()Landroidx/fragment/app/Fragment;

    move-result-object v0

    .line 3
    iget-object v1, v0, Landroidx/fragment/app/Fragment;->I:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->findFocus()Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 4
    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->b(Landroid/view/View;)V

    const/4 v2, 0x2

    .line 5
    invoke-static {v2}, Lc/l/d/o1;->d(I)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 6
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "requestFocus: Saved focused view "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " for Fragment "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "FragmentManager"

    invoke-static {v2, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 7
    :cond_0
    invoke-virtual {p0}, Lc/l/d/h3;->d()Landroidx/fragment/app/Fragment;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->w0()Landroid/view/View;

    move-result-object v1

    .line 8
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    const/4 v3, 0x0

    if-nez v2, :cond_1

    .line 9
    iget-object v2, p0, Lc/l/d/d3;->h:Lc/l/d/a2;

    invoke-virtual {v2}, Lc/l/d/a2;->b()V

    .line 10
    invoke-virtual {v1, v3}, Landroid/view/View;->setAlpha(F)V

    .line 11
    :cond_1
    invoke-virtual {v1}, Landroid/view/View;->getAlpha()F

    move-result v2

    cmpl-float v2, v2, v3

    if-nez v2, :cond_2

    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result v2

    if-nez v2, :cond_2

    const/4 v2, 0x4

    .line 12
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 13
    :cond_2
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->D()F

    move-result v0

    invoke-virtual {v1, v0}, Landroid/view/View;->setAlpha(F)V

    :cond_3
    return-void
.end method
