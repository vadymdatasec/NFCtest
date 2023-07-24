.class public Lc/b/q/q0;
.super Landroid/widget/Spinner;
.source "SourceFile"

# interfaces
.implements Lc/h/n/z;


# static fields
.field public static final j:[I


# instance fields
.field public final b:Lc/b/q/m;

.field public final c:Landroid/content/Context;

.field public d:Lc/b/q/h1;

.field public e:Landroid/widget/SpinnerAdapter;

.field public final f:Z

.field public g:Lc/b/q/p0;

.field public h:I

.field public final i:Landroid/graphics/Rect;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [I

    const/4 v1, 0x0

    const v2, 0x10102f1

    aput v2, v0, v1

    .line 1
    sput-object v0, Lc/b/q/q0;->j:[I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 1
    sget v0, Lc/b/a;->spinnerStyle:I

    invoke-direct {p0, p1, p2, v0}, Lc/b/q/q0;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    const/4 v0, -0x1

    .line 2
    invoke-direct {p0, p1, p2, p3, v0}, Lc/b/q/q0;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 6

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move v4, p4

    .line 3
    invoke-direct/range {v0 .. v5}, Lc/b/q/q0;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILandroid/content/res/Resources$Theme;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILandroid/content/res/Resources$Theme;)V
    .locals 6

    .line 4
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/Spinner;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 5
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lc/b/q/q0;->i:Landroid/graphics/Rect;

    .line 6
    sget-object v0, Lc/b/j;->Spinner:[I

    const/4 v1, 0x0

    invoke-static {p1, p2, v0, p3, v1}, Lc/b/q/k2;->a(Landroid/content/Context;Landroid/util/AttributeSet;[III)Lc/b/q/k2;

    move-result-object v0

    .line 7
    new-instance v2, Lc/b/q/m;

    invoke-direct {v2, p0}, Lc/b/q/m;-><init>(Landroid/view/View;)V

    iput-object v2, p0, Lc/b/q/q0;->b:Lc/b/q/m;

    if-eqz p5, :cond_0

    .line 8
    new-instance v2, Lc/b/p/e;

    invoke-direct {v2, p1, p5}, Lc/b/p/e;-><init>(Landroid/content/Context;Landroid/content/res/Resources$Theme;)V

    iput-object v2, p0, Lc/b/q/q0;->c:Landroid/content/Context;

    goto :goto_0

    .line 9
    :cond_0
    sget p5, Lc/b/j;->Spinner_popupTheme:I

    invoke-virtual {v0, p5, v1}, Lc/b/q/k2;->g(II)I

    move-result p5

    if-eqz p5, :cond_1

    .line 10
    new-instance v2, Lc/b/p/e;

    invoke-direct {v2, p1, p5}, Lc/b/p/e;-><init>(Landroid/content/Context;I)V

    iput-object v2, p0, Lc/b/q/q0;->c:Landroid/content/Context;

    goto :goto_0

    .line 11
    :cond_1
    iput-object p1, p0, Lc/b/q/q0;->c:Landroid/content/Context;

    :goto_0
    const/4 p5, -0x1

    const/4 v2, 0x0

    if-ne p4, p5, :cond_4

    .line 12
    :try_start_0
    sget-object p5, Lc/b/q/q0;->j:[I

    invoke-virtual {p1, p2, p5, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p5
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    :try_start_1
    invoke-virtual {p5, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 14
    invoke-virtual {p5, v1, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p4
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :cond_2
    if-eqz p5, :cond_4

    .line 15
    :goto_1
    invoke-virtual {p5}, Landroid/content/res/TypedArray;->recycle()V

    goto :goto_4

    :catch_0
    move-exception v3

    goto :goto_2

    :catchall_0
    move-exception p1

    goto :goto_3

    :catch_1
    move-exception v3

    move-object p5, v2

    :goto_2
    :try_start_2
    const-string v4, "AppCompatSpinner"

    const-string v5, "Could not read android:spinnerMode"

    .line 16
    invoke-static {v4, v5, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-eqz p5, :cond_4

    goto :goto_1

    :catchall_1
    move-exception p1

    move-object v2, p5

    :goto_3
    if-eqz v2, :cond_3

    .line 17
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    .line 18
    :cond_3
    throw p1

    :cond_4
    :goto_4
    const/4 p5, 0x1

    if-eqz p4, :cond_6

    if-eq p4, p5, :cond_5

    goto :goto_5

    .line 19
    :cond_5
    new-instance p4, Lc/b/q/m0;

    iget-object v3, p0, Lc/b/q/q0;->c:Landroid/content/Context;

    invoke-direct {p4, p0, v3, p2, p3}, Lc/b/q/m0;-><init>(Lc/b/q/q0;Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 20
    iget-object v3, p0, Lc/b/q/q0;->c:Landroid/content/Context;

    sget-object v4, Lc/b/j;->Spinner:[I

    invoke-static {v3, p2, v4, p3, v1}, Lc/b/q/k2;->a(Landroid/content/Context;Landroid/util/AttributeSet;[III)Lc/b/q/k2;

    move-result-object v1

    .line 21
    sget v3, Lc/b/j;->Spinner_android_dropDownWidth:I

    const/4 v4, -0x2

    invoke-virtual {v1, v3, v4}, Lc/b/q/k2;->f(II)I

    move-result v3

    iput v3, p0, Lc/b/q/q0;->h:I

    .line 22
    sget v3, Lc/b/j;->Spinner_android_popupBackground:I

    .line 23
    invoke-virtual {v1, v3}, Lc/b/q/k2;->b(I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    .line 24
    invoke-virtual {p4, v3}, Lc/b/q/p1;->a(Landroid/graphics/drawable/Drawable;)V

    .line 25
    sget v3, Lc/b/j;->Spinner_android_prompt:I

    invoke-virtual {v0, v3}, Lc/b/q/k2;->d(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p4, v3}, Lc/b/q/m0;->a(Ljava/lang/CharSequence;)V

    .line 26
    invoke-virtual {v1}, Lc/b/q/k2;->a()V

    .line 27
    iput-object p4, p0, Lc/b/q/q0;->g:Lc/b/q/p0;

    .line 28
    new-instance v1, Lc/b/q/f0;

    invoke-direct {v1, p0, p0, p4}, Lc/b/q/f0;-><init>(Lc/b/q/q0;Landroid/view/View;Lc/b/q/m0;)V

    iput-object v1, p0, Lc/b/q/q0;->d:Lc/b/q/h1;

    goto :goto_5

    .line 29
    :cond_6
    new-instance p4, Lc/b/q/h0;

    invoke-direct {p4, p0}, Lc/b/q/h0;-><init>(Lc/b/q/q0;)V

    iput-object p4, p0, Lc/b/q/q0;->g:Lc/b/q/p0;

    .line 30
    sget v1, Lc/b/j;->Spinner_android_prompt:I

    invoke-virtual {v0, v1}, Lc/b/q/k2;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p4, v1}, Lc/b/q/p0;->a(Ljava/lang/CharSequence;)V

    .line 31
    :goto_5
    sget p4, Lc/b/j;->Spinner_android_entries:I

    invoke-virtual {v0, p4}, Lc/b/q/k2;->f(I)[Ljava/lang/CharSequence;

    move-result-object p4

    if-eqz p4, :cond_7

    .line 32
    new-instance v1, Landroid/widget/ArrayAdapter;

    const v3, 0x1090008

    invoke-direct {v1, p1, v3, p4}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;I[Ljava/lang/Object;)V

    .line 33
    sget p1, Lc/b/g;->support_simple_spinner_dropdown_item:I

    invoke-virtual {v1, p1}, Landroid/widget/ArrayAdapter;->setDropDownViewResource(I)V

    .line 34
    invoke-virtual {p0, v1}, Lc/b/q/q0;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 35
    :cond_7
    invoke-virtual {v0}, Lc/b/q/k2;->a()V

    .line 36
    iput-boolean p5, p0, Lc/b/q/q0;->f:Z

    .line 37
    iget-object p1, p0, Lc/b/q/q0;->e:Landroid/widget/SpinnerAdapter;

    if-eqz p1, :cond_8

    .line 38
    invoke-virtual {p0, p1}, Lc/b/q/q0;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 39
    iput-object v2, p0, Lc/b/q/q0;->e:Landroid/widget/SpinnerAdapter;

    .line 40
    :cond_8
    iget-object p1, p0, Lc/b/q/q0;->b:Lc/b/q/m;

    invoke-virtual {p1, p2, p3}, Lc/b/q/m;->a(Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method public a(Landroid/widget/SpinnerAdapter;Landroid/graphics/drawable/Drawable;)I
    .locals 10

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    .line 1
    :cond_0
    invoke-virtual {p0}, Landroid/widget/Spinner;->getMeasuredWidth()I

    move-result v1

    invoke-static {v1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    .line 2
    invoke-virtual {p0}, Landroid/widget/Spinner;->getMeasuredHeight()I

    move-result v2

    invoke-static {v2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v2

    .line 3
    invoke-virtual {p0}, Landroid/widget/Spinner;->getSelectedItemPosition()I

    move-result v3

    invoke-static {v0, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    .line 4
    invoke-interface {p1}, Landroid/widget/SpinnerAdapter;->getCount()I

    move-result v4

    add-int/lit8 v5, v3, 0xf

    invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I

    move-result v4

    sub-int v5, v4, v3

    rsub-int/lit8 v5, v5, 0xf

    sub-int/2addr v3, v5

    .line 5
    invoke-static {v0, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    const/4 v5, 0x0

    move v6, v3

    move-object v7, v5

    const/4 v3, 0x0

    :goto_0
    if-ge v6, v4, :cond_3

    .line 6
    invoke-interface {p1, v6}, Landroid/widget/SpinnerAdapter;->getItemViewType(I)I

    move-result v8

    if-eq v8, v0, :cond_1

    move-object v7, v5

    move v0, v8

    .line 7
    :cond_1
    invoke-interface {p1, v6, v7, p0}, Landroid/widget/SpinnerAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v7

    .line 8
    invoke-virtual {v7}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v8

    if-nez v8, :cond_2

    .line 9
    new-instance v8, Landroid/view/ViewGroup$LayoutParams;

    const/4 v9, -0x2

    invoke-direct {v8, v9, v9}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v7, v8}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 10
    :cond_2
    invoke-virtual {v7, v1, v2}, Landroid/view/View;->measure(II)V

    .line 11
    invoke-virtual {v7}, Landroid/view/View;->getMeasuredWidth()I

    move-result v8

    invoke-static {v3, v8}, Ljava/lang/Math;->max(II)I

    move-result v3

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_3
    if-eqz p2, :cond_4

    .line 12
    iget-object p1, p0, Lc/b/q/q0;->i:Landroid/graphics/Rect;

    invoke-virtual {p2, p1}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 13
    iget-object p1, p0, Lc/b/q/q0;->i:Landroid/graphics/Rect;

    iget p2, p1, Landroid/graphics/Rect;->left:I

    iget p1, p1, Landroid/graphics/Rect;->right:I

    add-int/2addr p2, p1

    add-int/2addr v3, p2

    :cond_4
    return v3
.end method

.method public a()V
    .locals 3

    .line 14
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x11

    if-lt v0, v1, :cond_0

    .line 15
    iget-object v0, p0, Lc/b/q/q0;->g:Lc/b/q/p0;

    invoke-virtual {p0}, Landroid/widget/Spinner;->getTextDirection()I

    move-result v1

    invoke-virtual {p0}, Landroid/widget/Spinner;->getTextAlignment()I

    move-result v2

    invoke-interface {v0, v1, v2}, Lc/b/q/p0;->a(II)V

    goto :goto_0

    .line 16
    :cond_0
    iget-object v0, p0, Lc/b/q/q0;->g:Lc/b/q/p0;

    const/4 v1, -0x1

    invoke-interface {v0, v1, v1}, Lc/b/q/p0;->a(II)V

    :goto_0
    return-void
.end method

.method public drawableStateChanged()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/widget/Spinner;->drawableStateChanged()V

    .line 2
    iget-object v0, p0, Lc/b/q/q0;->b:Lc/b/q/m;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Lc/b/q/m;->a()V

    :cond_0
    return-void
.end method

.method public getDropDownHorizontalOffset()I
    .locals 2

    .line 1
    iget-object v0, p0, Lc/b/q/q0;->g:Lc/b/q/p0;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lc/b/q/p0;->c()I

    move-result v0

    return v0

    .line 3
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_1

    .line 4
    invoke-super {p0}, Landroid/widget/Spinner;->getDropDownHorizontalOffset()I

    move-result v0

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public getDropDownVerticalOffset()I
    .locals 2

    .line 1
    iget-object v0, p0, Lc/b/q/q0;->g:Lc/b/q/p0;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lc/b/q/p0;->d()I

    move-result v0

    return v0

    .line 3
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_1

    .line 4
    invoke-super {p0}, Landroid/widget/Spinner;->getDropDownVerticalOffset()I

    move-result v0

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public getDropDownWidth()I
    .locals 2

    .line 1
    iget-object v0, p0, Lc/b/q/q0;->g:Lc/b/q/p0;

    if-eqz v0, :cond_0

    .line 2
    iget v0, p0, Lc/b/q/q0;->h:I

    return v0

    .line 3
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_1

    .line 4
    invoke-super {p0}, Landroid/widget/Spinner;->getDropDownWidth()I

    move-result v0

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final getInternalPopup()Lc/b/q/p0;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/b/q/q0;->g:Lc/b/q/p0;

    return-object v0
.end method

.method public getPopupBackground()Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 1
    iget-object v0, p0, Lc/b/q/q0;->g:Lc/b/q/p0;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lc/b/q/p0;->e()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0

    .line 3
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_1

    .line 4
    invoke-super {p0}, Landroid/widget/Spinner;->getPopupBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public getPopupContext()Landroid/content/Context;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/b/q/q0;->c:Landroid/content/Context;

    return-object v0
.end method

.method public getPrompt()Ljava/lang/CharSequence;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/b/q/q0;->g:Lc/b/q/p0;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lc/b/q/p0;->f()Ljava/lang/CharSequence;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-super {p0}, Landroid/widget/Spinner;->getPrompt()Ljava/lang/CharSequence;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public getSupportBackgroundTintList()Landroid/content/res/ColorStateList;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/b/q/q0;->b:Lc/b/q/m;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lc/b/q/m;->b()Landroid/content/res/ColorStateList;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getSupportBackgroundTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/b/q/q0;->b:Lc/b/q/m;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lc/b/q/m;->c()Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public onDetachedFromWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/widget/Spinner;->onDetachedFromWindow()V

    .line 2
    iget-object v0, p0, Lc/b/q/q0;->g:Lc/b/q/p0;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lc/b/q/p0;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lc/b/q/q0;->g:Lc/b/q/p0;

    invoke-interface {v0}, Lc/b/q/p0;->dismiss()V

    :cond_0
    return-void
.end method

.method public onMeasure(II)V
    .locals 2

    .line 1
    invoke-super {p0, p1, p2}, Landroid/widget/Spinner;->onMeasure(II)V

    .line 2
    iget-object p2, p0, Lc/b/q/q0;->g:Lc/b/q/p0;

    if-eqz p2, :cond_0

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result p2

    const/high16 v0, -0x80000000

    if-ne p2, v0, :cond_0

    .line 3
    invoke-virtual {p0}, Landroid/widget/Spinner;->getMeasuredWidth()I

    move-result p2

    .line 4
    invoke-virtual {p0}, Landroid/widget/Spinner;->getAdapter()Landroid/widget/SpinnerAdapter;

    move-result-object v0

    invoke-virtual {p0}, Landroid/widget/Spinner;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lc/b/q/q0;->a(Landroid/widget/SpinnerAdapter;Landroid/graphics/drawable/Drawable;)I

    move-result v0

    .line 5
    invoke-static {p2, v0}, Ljava/lang/Math;->max(II)I

    move-result p2

    .line 6
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    .line 7
    invoke-static {p2, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    .line 8
    invoke-virtual {p0}, Landroid/widget/Spinner;->getMeasuredHeight()I

    move-result p2

    .line 9
    invoke-virtual {p0, p1, p2}, Landroid/widget/Spinner;->setMeasuredDimension(II)V

    :cond_0
    return-void
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    .line 1
    check-cast p1, Lc/b/q/o0;

    .line 2
    invoke-virtual {p1}, Landroid/view/View$BaseSavedState;->getSuperState()Landroid/os/Parcelable;

    move-result-object v0

    invoke-super {p0, v0}, Landroid/widget/Spinner;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 3
    iget-boolean p1, p1, Lc/b/q/o0;->b:Z

    if-eqz p1, :cond_0

    .line 4
    invoke-virtual {p0}, Landroid/widget/Spinner;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 5
    new-instance v0, Lc/b/q/g0;

    invoke-direct {v0, p0}, Lc/b/q/g0;-><init>(Lc/b/q/q0;)V

    .line 6
    invoke-virtual {p1, v0}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    :cond_0
    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .locals 2

    .line 1
    new-instance v0, Lc/b/q/o0;

    .line 2
    invoke-super {p0}, Landroid/widget/Spinner;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v1

    invoke-direct {v0, v1}, Lc/b/q/o0;-><init>(Landroid/os/Parcelable;)V

    .line 3
    iget-object v1, p0, Lc/b/q/q0;->g:Lc/b/q/p0;

    if-eqz v1, :cond_0

    invoke-interface {v1}, Lc/b/q/p0;->b()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iput-boolean v1, v0, Lc/b/q/o0;->b:Z

    return-object v0
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lc/b/q/q0;->d:Lc/b/q/h1;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p0, p1}, Lc/b/q/h1;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    .line 2
    :cond_0
    invoke-super {p0, p1}, Landroid/widget/Spinner;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public performClick()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lc/b/q/q0;->g:Lc/b/q/p0;

    if-eqz v0, :cond_1

    .line 2
    invoke-interface {v0}, Lc/b/q/p0;->b()Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    invoke-virtual {p0}, Lc/b/q/q0;->a()V

    :cond_0
    const/4 v0, 0x1

    return v0

    .line 4
    :cond_1
    invoke-super {p0}, Landroid/widget/Spinner;->performClick()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic setAdapter(Landroid/widget/Adapter;)V
    .locals 0

    .line 1
    check-cast p1, Landroid/widget/SpinnerAdapter;

    invoke-virtual {p0, p1}, Lc/b/q/q0;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    return-void
.end method

.method public setAdapter(Landroid/widget/SpinnerAdapter;)V
    .locals 3

    .line 2
    iget-boolean v0, p0, Lc/b/q/q0;->f:Z

    if-nez v0, :cond_0

    .line 3
    iput-object p1, p0, Lc/b/q/q0;->e:Landroid/widget/SpinnerAdapter;

    return-void

    .line 4
    :cond_0
    invoke-super {p0, p1}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 5
    iget-object v0, p0, Lc/b/q/q0;->g:Lc/b/q/p0;

    if-eqz v0, :cond_2

    .line 6
    iget-object v0, p0, Lc/b/q/q0;->c:Landroid/content/Context;

    if-nez v0, :cond_1

    invoke-virtual {p0}, Landroid/widget/Spinner;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 7
    :cond_1
    iget-object v1, p0, Lc/b/q/q0;->g:Lc/b/q/p0;

    new-instance v2, Lc/b/q/i0;

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    invoke-direct {v2, p1, v0}, Lc/b/q/i0;-><init>(Landroid/widget/SpinnerAdapter;Landroid/content/res/Resources$Theme;)V

    invoke-interface {v1, v2}, Lc/b/q/p0;->a(Landroid/widget/ListAdapter;)V

    :cond_2
    return-void
.end method

.method public setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/widget/Spinner;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 2
    iget-object v0, p0, Lc/b/q/q0;->b:Lc/b/q/m;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0, p1}, Lc/b/q/m;->b(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    return-void
.end method

.method public setBackgroundResource(I)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/widget/Spinner;->setBackgroundResource(I)V

    .line 2
    iget-object v0, p0, Lc/b/q/q0;->b:Lc/b/q/m;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0, p1}, Lc/b/q/m;->a(I)V

    :cond_0
    return-void
.end method

.method public setDropDownHorizontalOffset(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/b/q/q0;->g:Lc/b/q/p0;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0, p1}, Lc/b/q/p0;->c(I)V

    .line 3
    iget-object v0, p0, Lc/b/q/q0;->g:Lc/b/q/p0;

    invoke-interface {v0, p1}, Lc/b/q/p0;->a(I)V

    goto :goto_0

    .line 4
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_1

    .line 5
    invoke-super {p0, p1}, Landroid/widget/Spinner;->setDropDownHorizontalOffset(I)V

    :cond_1
    :goto_0
    return-void
.end method

.method public setDropDownVerticalOffset(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/b/q/q0;->g:Lc/b/q/p0;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0, p1}, Lc/b/q/p0;->b(I)V

    goto :goto_0

    .line 3
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_1

    .line 4
    invoke-super {p0, p1}, Landroid/widget/Spinner;->setDropDownVerticalOffset(I)V

    :cond_1
    :goto_0
    return-void
.end method

.method public setDropDownWidth(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/b/q/q0;->g:Lc/b/q/p0;

    if-eqz v0, :cond_0

    .line 2
    iput p1, p0, Lc/b/q/q0;->h:I

    goto :goto_0

    .line 3
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_1

    .line 4
    invoke-super {p0, p1}, Landroid/widget/Spinner;->setDropDownWidth(I)V

    :cond_1
    :goto_0
    return-void
.end method

.method public setPopupBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/b/q/q0;->g:Lc/b/q/p0;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0, p1}, Lc/b/q/p0;->a(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 3
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_1

    .line 4
    invoke-super {p0, p1}, Landroid/widget/Spinner;->setPopupBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public setPopupBackgroundResource(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lc/b/q/q0;->getPopupContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lc/b/l/a/b;->c(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Lc/b/q/q0;->setPopupBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setPrompt(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/b/q/q0;->g:Lc/b/q/p0;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0, p1}, Lc/b/q/p0;->a(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 3
    :cond_0
    invoke-super {p0, p1}, Landroid/widget/Spinner;->setPrompt(Ljava/lang/CharSequence;)V

    :goto_0
    return-void
.end method

.method public setSupportBackgroundTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/b/q/q0;->b:Lc/b/q/m;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Lc/b/q/m;->b(Landroid/content/res/ColorStateList;)V

    :cond_0
    return-void
.end method

.method public setSupportBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/b/q/q0;->b:Lc/b/q/m;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Lc/b/q/m;->a(Landroid/graphics/PorterDuff$Mode;)V

    :cond_0
    return-void
.end method
