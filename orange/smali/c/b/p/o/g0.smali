.class public Lc/b/p/o/g0;
.super Lc/b/p/o/m;
.source "SourceFile"

# interfaces
.implements Landroid/view/SubMenu;


# instance fields
.field public B:Lc/b/p/o/m;

.field public C:Lc/b/p/o/p;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lc/b/p/o/m;Lc/b/p/o/p;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lc/b/p/o/m;-><init>(Landroid/content/Context;)V

    .line 2
    iput-object p2, p0, Lc/b/p/o/g0;->B:Lc/b/p/o/m;

    .line 3
    iput-object p3, p0, Lc/b/p/o/g0;->C:Lc/b/p/o/p;

    return-void
.end method


# virtual methods
.method public a(Lc/b/p/o/m$a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/b/p/o/g0;->B:Lc/b/p/o/m;

    invoke-virtual {v0, p1}, Lc/b/p/o/m;->a(Lc/b/p/o/m$a;)V

    return-void
.end method

.method public a(Lc/b/p/o/m;Landroid/view/MenuItem;)Z
    .locals 1

    .line 2
    invoke-super {p0, p1, p2}, Lc/b/p/o/m;->a(Lc/b/p/o/m;Landroid/view/MenuItem;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lc/b/p/o/g0;->B:Lc/b/p/o/m;

    .line 3
    invoke-virtual {v0, p1, p2}, Lc/b/p/o/m;->a(Lc/b/p/o/m;Landroid/view/MenuItem;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public a(Lc/b/p/o/p;)Z
    .locals 1

    .line 4
    iget-object v0, p0, Lc/b/p/o/g0;->B:Lc/b/p/o/m;

    invoke-virtual {v0, p1}, Lc/b/p/o/m;->a(Lc/b/p/o/p;)Z

    move-result p1

    return p1
.end method

.method public b(Lc/b/p/o/p;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lc/b/p/o/g0;->B:Lc/b/p/o/m;

    invoke-virtual {v0, p1}, Lc/b/p/o/m;->b(Lc/b/p/o/p;)Z

    move-result p1

    return p1
.end method

.method public d()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lc/b/p/o/g0;->C:Lc/b/p/o/p;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lc/b/p/o/p;->getItemId()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    const/4 v0, 0x0

    return-object v0

    .line 2
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-super {p0}, Lc/b/p/o/m;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ":"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getItem()Landroid/view/MenuItem;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/b/p/o/g0;->C:Lc/b/p/o/p;

    return-object v0
.end method

.method public m()Lc/b/p/o/m;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/b/p/o/g0;->B:Lc/b/p/o/m;

    invoke-virtual {v0}, Lc/b/p/o/m;->m()Lc/b/p/o/m;

    move-result-object v0

    return-object v0
.end method

.method public o()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lc/b/p/o/g0;->B:Lc/b/p/o/m;

    invoke-virtual {v0}, Lc/b/p/o/m;->o()Z

    move-result v0

    return v0
.end method

.method public p()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lc/b/p/o/g0;->B:Lc/b/p/o/m;

    invoke-virtual {v0}, Lc/b/p/o/m;->p()Z

    move-result v0

    return v0
.end method

.method public q()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lc/b/p/o/g0;->B:Lc/b/p/o/m;

    invoke-virtual {v0}, Lc/b/p/o/m;->q()Z

    move-result v0

    return v0
.end method

.method public setGroupDividerEnabled(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/b/p/o/g0;->B:Lc/b/p/o/m;

    invoke-virtual {v0, p1}, Lc/b/p/o/m;->setGroupDividerEnabled(Z)V

    return-void
.end method

.method public setHeaderIcon(I)Landroid/view/SubMenu;
    .locals 0

    .line 2
    invoke-super {p0, p1}, Lc/b/p/o/m;->d(I)Lc/b/p/o/m;

    move-object p1, p0

    check-cast p1, Landroid/view/SubMenu;

    return-object p1
.end method

.method public setHeaderIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/SubMenu;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lc/b/p/o/m;->a(Landroid/graphics/drawable/Drawable;)Lc/b/p/o/m;

    move-object p1, p0

    check-cast p1, Landroid/view/SubMenu;

    return-object p1
.end method

.method public setHeaderTitle(I)Landroid/view/SubMenu;
    .locals 0

    .line 2
    invoke-super {p0, p1}, Lc/b/p/o/m;->e(I)Lc/b/p/o/m;

    move-object p1, p0

    check-cast p1, Landroid/view/SubMenu;

    return-object p1
.end method

.method public setHeaderTitle(Ljava/lang/CharSequence;)Landroid/view/SubMenu;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lc/b/p/o/m;->a(Ljava/lang/CharSequence;)Lc/b/p/o/m;

    move-object p1, p0

    check-cast p1, Landroid/view/SubMenu;

    return-object p1
.end method

.method public setHeaderView(Landroid/view/View;)Landroid/view/SubMenu;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lc/b/p/o/m;->a(Landroid/view/View;)Lc/b/p/o/m;

    move-object p1, p0

    check-cast p1, Landroid/view/SubMenu;

    return-object p1
.end method

.method public setIcon(I)Landroid/view/SubMenu;
    .locals 1

    .line 2
    iget-object v0, p0, Lc/b/p/o/g0;->C:Lc/b/p/o/p;

    invoke-virtual {v0, p1}, Lc/b/p/o/p;->setIcon(I)Landroid/view/MenuItem;

    return-object p0
.end method

.method public setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/SubMenu;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/b/p/o/g0;->C:Lc/b/p/o/p;

    invoke-virtual {v0, p1}, Lc/b/p/o/p;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;

    return-object p0
.end method

.method public setQwertyMode(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/b/p/o/g0;->B:Lc/b/p/o/m;

    invoke-virtual {v0, p1}, Lc/b/p/o/m;->setQwertyMode(Z)V

    return-void
.end method

.method public t()Landroid/view/Menu;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/b/p/o/g0;->B:Lc/b/p/o/m;

    return-object v0
.end method
