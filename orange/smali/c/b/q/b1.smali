.class public Lc/b/q/b1;
.super Lc/b/m/a/m;
.source "SourceFile"


# instance fields
.field public c:Z


# direct methods
.method public constructor <init>(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lc/b/m/a/m;-><init>(Landroid/graphics/drawable/Drawable;)V

    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Lc/b/q/b1;->c:Z

    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lc/b/q/b1;->c:Z

    return-void
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lc/b/q/b1;->c:Z

    if-eqz v0, :cond_0

    .line 2
    invoke-super {p0, p1}, Lc/b/m/a/m;->draw(Landroid/graphics/Canvas;)V

    :cond_0
    return-void
.end method

.method public setHotspot(FF)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lc/b/q/b1;->c:Z

    if-eqz v0, :cond_0

    .line 2
    invoke-super {p0, p1, p2}, Lc/b/m/a/m;->setHotspot(FF)V

    :cond_0
    return-void
.end method

.method public setHotspotBounds(IIII)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lc/b/q/b1;->c:Z

    if-eqz v0, :cond_0

    .line 2
    invoke-super {p0, p1, p2, p3, p4}, Lc/b/m/a/m;->setHotspotBounds(IIII)V

    :cond_0
    return-void
.end method

.method public setState([I)Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lc/b/q/b1;->c:Z

    if-eqz v0, :cond_0

    .line 2
    invoke-super {p0, p1}, Lc/b/m/a/m;->setState([I)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public setVisible(ZZ)Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lc/b/q/b1;->c:Z

    if-eqz v0, :cond_0

    .line 2
    invoke-super {p0, p1, p2}, Lc/b/m/a/m;->setVisible(ZZ)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
