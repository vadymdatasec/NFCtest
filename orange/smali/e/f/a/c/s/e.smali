.class public Le/f/a/c/s/e;
.super Lc/h/n/d;
.source "SourceFile"


# instance fields
.field public final synthetic d:Lcom/google/android/material/snackbar/BaseTransientBottomBar;


# direct methods
.method public constructor <init>(Lcom/google/android/material/snackbar/BaseTransientBottomBar;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le/f/a/c/s/e;->d:Lcom/google/android/material/snackbar/BaseTransientBottomBar;

    invoke-direct {p0}, Lc/h/n/d;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;Lc/h/n/v1/h;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lc/h/n/d;->a(Landroid/view/View;Lc/h/n/v1/h;)V

    const/high16 p1, 0x100000

    .line 2
    invoke-virtual {p2, p1}, Lc/h/n/v1/h;->a(I)V

    const/4 p1, 0x1

    .line 3
    invoke-virtual {p2, p1}, Lc/h/n/v1/h;->c(Z)V

    return-void
.end method

.method public a(Landroid/view/View;ILandroid/os/Bundle;)Z
    .locals 1

    const/high16 v0, 0x100000

    if-ne p2, v0, :cond_0

    .line 4
    iget-object p1, p0, Le/f/a/c/s/e;->d:Lcom/google/android/material/snackbar/BaseTransientBottomBar;

    invoke-virtual {p1}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->b()V

    const/4 p1, 0x1

    return p1

    .line 5
    :cond_0
    invoke-super {p0, p1, p2, p3}, Lc/h/n/d;->a(Landroid/view/View;ILandroid/os/Bundle;)Z

    move-result p1

    return p1
.end method
