.class public abstract Lcom/google/android/material/snackbar/BaseTransientBottomBar$b;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/material/snackbar/BaseTransientBottomBar;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public final b:Landroid/view/accessibility/AccessibilityManager;

.field public final c:Lc/h/n/v1/c;

.field public d:Le/f/a/c/s/o;

.field public e:Le/f/a/c/s/n;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar$b;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 2
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 3
    sget-object v0, Le/f/a/c/i;->SnackbarLayout:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p2

    .line 4
    sget v0, Le/f/a/c/i;->SnackbarLayout_elevation:I

    invoke-virtual {p2, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 5
    sget v0, Le/f/a/c/i;->SnackbarLayout_elevation:I

    const/4 v1, 0x0

    .line 6
    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    int-to-float v0, v0

    .line 7
    invoke-static {p0, v0}, Lc/h/n/v0;->a(Landroid/view/View;F)V

    .line 8
    :cond_0
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    const-string p2, "accessibility"

    .line 9
    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/accessibility/AccessibilityManager;

    iput-object p1, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar$b;->b:Landroid/view/accessibility/AccessibilityManager;

    .line 10
    new-instance p1, Le/f/a/c/s/p;

    invoke-direct {p1, p0}, Le/f/a/c/s/p;-><init>(Lcom/google/android/material/snackbar/BaseTransientBottomBar$b;)V

    iput-object p1, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar$b;->c:Lc/h/n/v1/c;

    .line 11
    iget-object p2, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar$b;->b:Landroid/view/accessibility/AccessibilityManager;

    invoke-static {p2, p1}, Lc/h/n/v1/e;->a(Landroid/view/accessibility/AccessibilityManager;Lc/h/n/v1/c;)Z

    .line 12
    iget-object p1, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar$b;->b:Landroid/view/accessibility/AccessibilityManager;

    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityManager;->isTouchExplorationEnabled()Z

    move-result p1

    invoke-direct {p0, p1}, Lcom/google/android/material/snackbar/BaseTransientBottomBar$b;->setClickableOrFocusableBasedOnAccessibility(Z)V

    return-void
.end method

.method public static synthetic a(Lcom/google/android/material/snackbar/BaseTransientBottomBar$b;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/google/android/material/snackbar/BaseTransientBottomBar$b;->setClickableOrFocusableBasedOnAccessibility(Z)V

    return-void
.end method

.method private setClickableOrFocusableBasedOnAccessibility(Z)V
    .locals 1

    xor-int/lit8 v0, p1, 0x1

    .line 1
    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->setClickable(Z)V

    .line 2
    invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->setFocusable(Z)V

    return-void
.end method


# virtual methods
.method public onAttachedToWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/widget/FrameLayout;->onAttachedToWindow()V

    .line 2
    iget-object v0, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar$b;->e:Le/f/a/c/s/n;

    if-eqz v0, :cond_0

    .line 3
    invoke-interface {v0, p0}, Le/f/a/c/s/n;->onViewAttachedToWindow(Landroid/view/View;)V

    .line 4
    :cond_0
    invoke-static {p0}, Lc/h/n/v0;->I(Landroid/view/View;)V

    return-void
.end method

.method public onDetachedFromWindow()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/widget/FrameLayout;->onDetachedFromWindow()V

    .line 2
    iget-object v0, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar$b;->e:Le/f/a/c/s/n;

    if-eqz v0, :cond_0

    .line 3
    invoke-interface {v0, p0}, Le/f/a/c/s/n;->onViewDetachedFromWindow(Landroid/view/View;)V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar$b;->b:Landroid/view/accessibility/AccessibilityManager;

    iget-object v1, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar$b;->c:Lc/h/n/v1/c;

    invoke-static {v0, v1}, Lc/h/n/v1/e;->b(Landroid/view/accessibility/AccessibilityManager;Lc/h/n/v1/c;)Z

    return-void
.end method

.method public onLayout(ZIIII)V
    .locals 6

    .line 1
    invoke-super/range {p0 .. p5}, Landroid/widget/FrameLayout;->onLayout(ZIIII)V

    .line 2
    iget-object v0, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar$b;->d:Le/f/a/c/s/o;

    if-eqz v0, :cond_0

    move-object v1, p0

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    .line 3
    invoke-interface/range {v0 .. v5}, Le/f/a/c/s/o;->a(Landroid/view/View;IIII)V

    :cond_0
    return-void
.end method

.method public setOnAttachStateChangeListener(Le/f/a/c/s/n;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar$b;->e:Le/f/a/c/s/n;

    return-void
.end method

.method public setOnLayoutChangeListener(Le/f/a/c/s/o;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar$b;->d:Le/f/a/c/s/o;

    return-void
.end method
