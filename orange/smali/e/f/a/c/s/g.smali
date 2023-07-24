.class public Le/f/a/c/s/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/material/behavior/SwipeDismissBehavior$b;


# instance fields
.field public final synthetic a:Lcom/google/android/material/snackbar/BaseTransientBottomBar;


# direct methods
.method public constructor <init>(Lcom/google/android/material/snackbar/BaseTransientBottomBar;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le/f/a/c/s/g;->a:Lcom/google/android/material/snackbar/BaseTransientBottomBar;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 1

    if-eqz p1, :cond_1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-static {}, Le/f/a/c/s/v;->b()Le/f/a/c/s/v;

    move-result-object p1

    iget-object v0, p0, Le/f/a/c/s/g;->a:Lcom/google/android/material/snackbar/BaseTransientBottomBar;

    iget-object v0, v0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->i:Le/f/a/c/s/t;

    invoke-virtual {p1, v0}, Le/f/a/c/s/v;->f(Le/f/a/c/s/t;)V

    goto :goto_0

    .line 4
    :cond_1
    invoke-static {}, Le/f/a/c/s/v;->b()Le/f/a/c/s/v;

    move-result-object p1

    iget-object v0, p0, Le/f/a/c/s/g;->a:Lcom/google/android/material/snackbar/BaseTransientBottomBar;

    iget-object v0, v0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->i:Le/f/a/c/s/t;

    invoke-virtual {p1, v0}, Le/f/a/c/s/v;->g(Le/f/a/c/s/t;)V

    :goto_0
    return-void
.end method

.method public a(Landroid/view/View;)V
    .locals 1

    const/16 v0, 0x8

    .line 1
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 2
    iget-object p1, p0, Le/f/a/c/s/g;->a:Lcom/google/android/material/snackbar/BaseTransientBottomBar;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->b(I)V

    return-void
.end method
