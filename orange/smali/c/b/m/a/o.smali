.class public abstract Lc/b/m/a/o;
.super Lc/b/m/a/l;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "RestrictedAPI"
    }
.end annotation


# instance fields
.field public n:Lc/b/m/a/n;

.field public o:Z


# direct methods
.method public constructor <init>(Lc/b/m/a/n;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lc/b/m/a/l;-><init>()V

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p0, p1}, Lc/b/m/a/o;->a(Lc/b/m/a/k;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public a(Lc/b/m/a/k;)V
    .locals 1

    .line 6
    invoke-super {p0, p1}, Lc/b/m/a/l;->a(Lc/b/m/a/k;)V

    .line 7
    instance-of v0, p1, Lc/b/m/a/n;

    if-eqz v0, :cond_0

    .line 8
    check-cast p1, Lc/b/m/a/n;

    iput-object p1, p0, Lc/b/m/a/o;->n:Lc/b/m/a/n;

    :cond_0
    return-void
.end method

.method public a(Landroid/util/AttributeSet;)[I
    .locals 8

    .line 1
    invoke-interface {p1}, Landroid/util/AttributeSet;->getAttributeCount()I

    move-result v0

    .line 2
    new-array v1, v0, [I

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v3, v0, :cond_2

    .line 3
    invoke-interface {p1, v3}, Landroid/util/AttributeSet;->getAttributeNameResource(I)I

    move-result v5

    if-eqz v5, :cond_1

    const v6, 0x10100d0

    if-eq v5, v6, :cond_1

    const v6, 0x1010199

    if-eq v5, v6, :cond_1

    add-int/lit8 v6, v4, 0x1

    .line 4
    invoke-interface {p1, v3, v2}, Landroid/util/AttributeSet;->getAttributeBooleanValue(IZ)Z

    move-result v7

    if-eqz v7, :cond_0

    goto :goto_1

    :cond_0
    neg-int v5, v5

    :goto_1
    aput v5, v1, v4

    move v4, v6

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 5
    :cond_2
    invoke-static {v1, v4}, Landroid/util/StateSet;->trimStateSet([II)[I

    move-result-object p1

    return-object p1
.end method

.method public applyTheme(Landroid/content/res/Resources$Theme;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lc/b/m/a/l;->applyTheme(Landroid/content/res/Resources$Theme;)V

    .line 2
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    move-result-object p1

    invoke-virtual {p0, p1}, Lc/b/m/a/o;->onStateChange([I)Z

    return-void
.end method

.method public mutate()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lc/b/m/a/o;->o:Z

    if-nez v0, :cond_0

    invoke-super {p0}, Lc/b/m/a/l;->mutate()Landroid/graphics/drawable/Drawable;

    if-ne p0, p0, :cond_0

    .line 2
    iget-object v0, p0, Lc/b/m/a/o;->n:Lc/b/m/a/n;

    invoke-virtual {v0}, Lc/b/m/a/k;->n()V

    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Lc/b/m/a/o;->o:Z

    :cond_0
    return-object p0
.end method

.method public abstract onStateChange([I)Z
.end method
