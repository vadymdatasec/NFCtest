.class public abstract Lc/h/n/o0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/view/View;)Lc/h/n/u1;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getRootWindowInsets()Landroid/view/WindowInsets;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 2
    :cond_0
    invoke-static {v0}, Lc/h/n/u1;->a(Landroid/view/WindowInsets;)Lc/h/n/u1;

    move-result-object v0

    .line 3
    invoke-virtual {v0, v0}, Lc/h/n/u1;->a(Lc/h/n/u1;)V

    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object p0

    invoke-virtual {v0, p0}, Lc/h/n/u1;->a(Landroid/view/View;)V

    return-object v0
.end method

.method public static a(Landroid/view/View;I)V
    .locals 0

    .line 5
    invoke-virtual {p0, p1}, Landroid/view/View;->setScrollIndicators(I)V

    return-void
.end method

.method public static a(Landroid/view/View;II)V
    .locals 0

    .line 6
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setScrollIndicators(II)V

    return-void
.end method

.method public static b(Landroid/view/View;)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getScrollIndicators()I

    move-result p0

    return p0
.end method
