.class public abstract Lc/b/m/a/n;
.super Lc/b/m/a/k;
.source "SourceFile"


# instance fields
.field public J:[[I


# direct methods
.method public constructor <init>(Lc/b/m/a/n;Lc/b/m/a/o;Landroid/content/res/Resources;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lc/b/m/a/k;-><init>(Lc/b/m/a/k;Lc/b/m/a/l;Landroid/content/res/Resources;)V

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p1, Lc/b/m/a/n;->J:[[I

    iput-object p1, p0, Lc/b/m/a/n;->J:[[I

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {p0}, Lc/b/m/a/k;->d()I

    move-result p1

    new-array p1, p1, [[I

    iput-object p1, p0, Lc/b/m/a/n;->J:[[I

    :goto_0
    return-void
.end method


# virtual methods
.method public a([I)I
    .locals 4

    .line 3
    iget-object v0, p0, Lc/b/m/a/n;->J:[[I

    .line 4
    invoke-virtual {p0}, Lc/b/m/a/k;->e()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    .line 5
    aget-object v3, v0, v2

    invoke-static {v3, p1}, Landroid/util/StateSet;->stateSetMatches([I[I)Z

    move-result v3

    if-eqz v3, :cond_0

    return v2

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, -0x1

    return p1
.end method

.method public a([ILandroid/graphics/drawable/Drawable;)I
    .locals 1

    .line 1
    invoke-virtual {p0, p2}, Lc/b/m/a/k;->a(Landroid/graphics/drawable/Drawable;)I

    move-result p2

    .line 2
    iget-object v0, p0, Lc/b/m/a/n;->J:[[I

    aput-object p1, v0, p2

    return p2
.end method

.method public a(II)V
    .locals 2

    .line 6
    invoke-super {p0, p1, p2}, Lc/b/m/a/k;->a(II)V

    .line 7
    new-array p2, p2, [[I

    .line 8
    iget-object v0, p0, Lc/b/m/a/n;->J:[[I

    const/4 v1, 0x0

    invoke-static {v0, v1, p2, v1, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 9
    iput-object p2, p0, Lc/b/m/a/n;->J:[[I

    return-void
.end method
