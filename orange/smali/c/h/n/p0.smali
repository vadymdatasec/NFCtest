.class public abstract Lc/h/n/p0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/view/View;)I
    .locals 0

    .line 6
    invoke-virtual {p0}, Landroid/view/View;->getImportantForAutofill()I

    move-result p0

    return p0
.end method

.method public static a(Landroid/view/View;Landroid/view/View;I)Landroid/view/View;
    .locals 0

    .line 4
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->keyboardNavigationClusterSearch(Landroid/view/View;I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static a(Landroid/view/View;I)V
    .locals 0

    .line 7
    invoke-virtual {p0, p1}, Landroid/view/View;->setImportantForAutofill(I)V

    return-void
.end method

.method public static a(Landroid/view/View;Ljava/lang/CharSequence;)V
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Landroid/view/View;->setTooltipText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public static a(Landroid/view/View;Ljava/util/Collection;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Ljava/util/Collection<",
            "Landroid/view/View;",
            ">;I)V"
        }
    .end annotation

    .line 5
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->addKeyboardNavigationClusters(Ljava/util/Collection;I)V

    return-void
.end method

.method public static a(Landroid/view/View;Z)V
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Landroid/view/View;->setFocusedByDefault(Z)V

    return-void
.end method

.method public static varargs a(Landroid/view/View;[Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroid/view/View;->setAutofillHints([Ljava/lang/String;)V

    return-void
.end method

.method public static b(Landroid/view/View;)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getNextClusterForwardId()I

    move-result p0

    return p0
.end method

.method public static b(Landroid/view/View;I)V
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Landroid/view/View;->setNextClusterForwardId(I)V

    return-void
.end method

.method public static b(Landroid/view/View;Z)V
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Landroid/view/View;->setKeyboardNavigationCluster(Z)V

    return-void
.end method

.method public static c(Landroid/view/View;)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->hasExplicitFocusable()Z

    move-result p0

    return p0
.end method

.method public static d(Landroid/view/View;)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isFocusedByDefault()Z

    move-result p0

    return p0
.end method

.method public static e(Landroid/view/View;)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isImportantForAutofill()Z

    move-result p0

    return p0
.end method

.method public static f(Landroid/view/View;)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isKeyboardNavigationCluster()Z

    move-result p0

    return p0
.end method

.method public static g(Landroid/view/View;)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->restoreDefaultFocus()Z

    move-result p0

    return p0
.end method
