.class public Le/f/a/c/m/a;
.super Lc/b/q/n;
.source "SourceFile"


# instance fields
.field public final d:Le/f/a/c/m/c;

.field public e:I

.field public f:Landroid/graphics/PorterDuff$Mode;

.field public g:Landroid/content/res/ColorStateList;

.field public h:Landroid/graphics/drawable/Drawable;

.field public i:I

.field public j:I

.field public k:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 1
    sget v0, Le/f/a/c/b;->materialButtonStyle:I

    invoke-direct {p0, p1, p2, v0}, Le/f/a/c/m/a;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 7

    .line 2
    invoke-direct {p0, p1, p2, p3}, Lc/b/q/n;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 3
    sget-object v2, Le/f/a/c/i;->MaterialButton:[I

    sget v4, Le/f/a/c/h;->Widget_MaterialComponents_Button:I

    const/4 v6, 0x0

    new-array v5, v6, [I

    move-object v0, p1

    move-object v1, p2

    move v3, p3

    .line 4
    invoke-static/range {v0 .. v5}, Le/f/a/c/p/c;->c(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 5
    sget p2, Le/f/a/c/i;->MaterialButton_iconPadding:I

    invoke-virtual {p1, p2, v6}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Le/f/a/c/m/a;->e:I

    .line 6
    sget p2, Le/f/a/c/i;->MaterialButton_iconTintMode:I

    const/4 p3, -0x1

    .line 7
    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    sget-object p3, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    .line 8
    invoke-static {p2, p3}, Le/f/a/c/p/d;->a(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    move-result-object p2

    iput-object p2, p0, Le/f/a/c/m/a;->f:Landroid/graphics/PorterDuff$Mode;

    .line 9
    invoke-virtual {p0}, Landroid/widget/Button;->getContext()Landroid/content/Context;

    move-result-object p2

    sget p3, Le/f/a/c/i;->MaterialButton_iconTint:I

    .line 10
    invoke-static {p2, p1, p3}, Le/f/a/c/q/a;->a(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    move-result-object p2

    iput-object p2, p0, Le/f/a/c/m/a;->g:Landroid/content/res/ColorStateList;

    .line 11
    invoke-virtual {p0}, Landroid/widget/Button;->getContext()Landroid/content/Context;

    move-result-object p2

    sget p3, Le/f/a/c/i;->MaterialButton_icon:I

    invoke-static {p2, p1, p3}, Le/f/a/c/q/a;->b(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    iput-object p2, p0, Le/f/a/c/m/a;->h:Landroid/graphics/drawable/Drawable;

    .line 12
    sget p2, Le/f/a/c/i;->MaterialButton_iconGravity:I

    const/4 p3, 0x1

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result p2

    iput p2, p0, Le/f/a/c/m/a;->k:I

    .line 13
    sget p2, Le/f/a/c/i;->MaterialButton_iconSize:I

    invoke-virtual {p1, p2, v6}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Le/f/a/c/m/a;->i:I

    .line 14
    new-instance p2, Le/f/a/c/m/c;

    invoke-direct {p2, p0}, Le/f/a/c/m/c;-><init>(Le/f/a/c/m/a;)V

    iput-object p2, p0, Le/f/a/c/m/a;->d:Le/f/a/c/m/c;

    .line 15
    invoke-virtual {p2, p1}, Le/f/a/c/m/c;->a(Landroid/content/res/TypedArray;)V

    .line 16
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 17
    iget p1, p0, Le/f/a/c/m/a;->e:I

    invoke-virtual {p0, p1}, Landroid/widget/Button;->setCompoundDrawablePadding(I)V

    .line 18
    invoke-virtual {p0}, Le/f/a/c/m/a;->c()V

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 2

    .line 1
    invoke-static {p0}, Lc/h/n/v0;->o(Landroid/view/View;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public final b()Z
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/a/c/m/a;->d:Le/f/a/c/m/c;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Le/f/a/c/m/c;->i()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final c()V
    .locals 5

    .line 1
    iget-object v0, p0, Le/f/a/c/m/a;->h:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_3

    .line 2
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Le/f/a/c/m/a;->h:Landroid/graphics/drawable/Drawable;

    .line 3
    iget-object v1, p0, Le/f/a/c/m/a;->g:Landroid/content/res/ColorStateList;

    invoke-static {v0, v1}, Lc/h/g/r/a;->a(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    .line 4
    iget-object v0, p0, Le/f/a/c/m/a;->f:Landroid/graphics/PorterDuff$Mode;

    if-eqz v0, :cond_0

    .line 5
    iget-object v1, p0, Le/f/a/c/m/a;->h:Landroid/graphics/drawable/Drawable;

    invoke-static {v1, v0}, Lc/h/g/r/a;->a(Landroid/graphics/drawable/Drawable;Landroid/graphics/PorterDuff$Mode;)V

    .line 6
    :cond_0
    iget v0, p0, Le/f/a/c/m/a;->i:I

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Le/f/a/c/m/a;->h:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    .line 7
    :goto_0
    iget v1, p0, Le/f/a/c/m/a;->i:I

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    iget-object v1, p0, Le/f/a/c/m/a;->h:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v1

    .line 8
    :goto_1
    iget-object v2, p0, Le/f/a/c/m/a;->h:Landroid/graphics/drawable/Drawable;

    iget v3, p0, Le/f/a/c/m/a;->j:I

    const/4 v4, 0x0

    add-int/2addr v0, v3

    invoke-virtual {v2, v3, v4, v0, v1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 9
    :cond_3
    iget-object v0, p0, Le/f/a/c/m/a;->h:Landroid/graphics/drawable/Drawable;

    const/4 v1, 0x0

    invoke-static {p0, v0, v1, v1, v1}, Lc/h/o/p;->a(Landroid/widget/TextView;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public getBackgroundTintList()Landroid/content/res/ColorStateList;
    .locals 1

    .line 1
    invoke-virtual {p0}, Le/f/a/c/m/a;->getSupportBackgroundTintList()Landroid/content/res/ColorStateList;

    move-result-object v0

    return-object v0
.end method

.method public getBackgroundTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    .line 1
    invoke-virtual {p0}, Le/f/a/c/m/a;->getSupportBackgroundTintMode()Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    return-object v0
.end method

.method public getCornerRadius()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Le/f/a/c/m/a;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Le/f/a/c/m/a;->d:Le/f/a/c/m/c;

    invoke-virtual {v0}, Le/f/a/c/m/c;->c()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public getIcon()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/a/c/m/a;->h:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public getIconGravity()I
    .locals 1

    .line 1
    iget v0, p0, Le/f/a/c/m/a;->k:I

    return v0
.end method

.method public getIconPadding()I
    .locals 1

    .line 1
    iget v0, p0, Le/f/a/c/m/a;->e:I

    return v0
.end method

.method public getIconSize()I
    .locals 1

    .line 1
    iget v0, p0, Le/f/a/c/m/a;->i:I

    return v0
.end method

.method public getIconTint()Landroid/content/res/ColorStateList;
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/a/c/m/a;->g:Landroid/content/res/ColorStateList;

    return-object v0
.end method

.method public getIconTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/a/c/m/a;->f:Landroid/graphics/PorterDuff$Mode;

    return-object v0
.end method

.method public getRippleColor()Landroid/content/res/ColorStateList;
    .locals 1

    .line 1
    invoke-virtual {p0}, Le/f/a/c/m/a;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Le/f/a/c/m/a;->d:Le/f/a/c/m/c;

    invoke-virtual {v0}, Le/f/a/c/m/c;->d()Landroid/content/res/ColorStateList;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getStrokeColor()Landroid/content/res/ColorStateList;
    .locals 1

    .line 1
    invoke-virtual {p0}, Le/f/a/c/m/a;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Le/f/a/c/m/a;->d:Le/f/a/c/m/c;

    invoke-virtual {v0}, Le/f/a/c/m/c;->e()Landroid/content/res/ColorStateList;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getStrokeWidth()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Le/f/a/c/m/a;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Le/f/a/c/m/a;->d:Le/f/a/c/m/c;

    invoke-virtual {v0}, Le/f/a/c/m/c;->f()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public getSupportBackgroundTintList()Landroid/content/res/ColorStateList;
    .locals 1

    .line 1
    invoke-virtual {p0}, Le/f/a/c/m/a;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Le/f/a/c/m/a;->d:Le/f/a/c/m/c;

    invoke-virtual {v0}, Le/f/a/c/m/c;->g()Landroid/content/res/ColorStateList;

    move-result-object v0

    return-object v0

    .line 3
    :cond_0
    invoke-super {p0}, Lc/b/q/n;->getSupportBackgroundTintList()Landroid/content/res/ColorStateList;

    move-result-object v0

    return-object v0
.end method

.method public getSupportBackgroundTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    .line 1
    invoke-virtual {p0}, Le/f/a/c/m/a;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Le/f/a/c/m/a;->d:Le/f/a/c/m/c;

    invoke-virtual {v0}, Le/f/a/c/m/c;->h()Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    return-object v0

    .line 3
    :cond_0
    invoke-super {p0}, Lc/b/q/n;->getSupportBackgroundTintMode()Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    return-object v0
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroid/widget/Button;->onDraw(Landroid/graphics/Canvas;)V

    .line 2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-ge v0, v1, :cond_0

    invoke-virtual {p0}, Le/f/a/c/m/a;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Le/f/a/c/m/a;->d:Le/f/a/c/m/c;

    invoke-virtual {v0, p1}, Le/f/a/c/m/c;->a(Landroid/graphics/Canvas;)V

    :cond_0
    return-void
.end method

.method public onLayout(ZIIII)V
    .locals 1

    .line 1
    invoke-super/range {p0 .. p5}, Lc/b/q/n;->onLayout(ZIIII)V

    .line 2
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x15

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Le/f/a/c/m/a;->d:Le/f/a/c/m/c;

    if-eqz p1, :cond_0

    sub-int/2addr p5, p3

    sub-int/2addr p4, p2

    .line 3
    invoke-virtual {p1, p5, p4}, Le/f/a/c/m/c;->a(II)V

    :cond_0
    return-void
.end method

.method public onMeasure(II)V
    .locals 2

    .line 1
    invoke-super {p0, p1, p2}, Landroid/widget/Button;->onMeasure(II)V

    .line 2
    iget-object p1, p0, Le/f/a/c/m/a;->h:Landroid/graphics/drawable/Drawable;

    if-eqz p1, :cond_3

    iget p1, p0, Le/f/a/c/m/a;->k:I

    const/4 p2, 0x2

    if-eq p1, p2, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {p0}, Landroid/widget/Button;->getPaint()Landroid/text/TextPaint;

    move-result-object p1

    .line 4
    invoke-virtual {p0}, Landroid/widget/Button;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result p1

    float-to-int p1, p1

    .line 5
    iget v0, p0, Le/f/a/c/m/a;->i:I

    if-nez v0, :cond_1

    iget-object v0, p0, Le/f/a/c/m/a;->h:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    .line 6
    :cond_1
    invoke-virtual {p0}, Landroid/widget/Button;->getMeasuredWidth()I

    move-result v1

    sub-int/2addr v1, p1

    .line 7
    invoke-static {p0}, Lc/h/n/v0;->r(Landroid/view/View;)I

    move-result p1

    sub-int/2addr v1, p1

    sub-int/2addr v1, v0

    iget p1, p0, Le/f/a/c/m/a;->e:I

    sub-int/2addr v1, p1

    .line 8
    invoke-static {p0}, Lc/h/n/v0;->s(Landroid/view/View;)I

    move-result p1

    sub-int/2addr v1, p1

    div-int/2addr v1, p2

    .line 9
    invoke-virtual {p0}, Le/f/a/c/m/a;->a()Z

    move-result p1

    if-eqz p1, :cond_2

    neg-int v1, v1

    .line 10
    :cond_2
    iget p1, p0, Le/f/a/c/m/a;->j:I

    if-eq p1, v1, :cond_3

    .line 11
    iput v1, p0, Le/f/a/c/m/a;->j:I

    .line 12
    invoke-virtual {p0}, Le/f/a/c/m/a;->c()V

    :cond_3
    :goto_0
    return-void
.end method

.method public setBackground(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Le/f/a/c/m/a;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setBackgroundColor(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Le/f/a/c/m/a;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Le/f/a/c/m/a;->d:Le/f/a/c/m/c;

    invoke-virtual {v0, p1}, Le/f/a/c/m/c;->a(I)V

    goto :goto_0

    .line 3
    :cond_0
    invoke-super {p0, p1}, Landroid/widget/Button;->setBackgroundColor(I)V

    :goto_0
    return-void
.end method

.method public setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Le/f/a/c/m/a;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2
    invoke-virtual {p0}, Landroid/widget/Button;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eq p1, v0, :cond_0

    const-string v0, "MaterialButton"

    const-string v1, "Setting a custom background is not supported."

    .line 3
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 4
    iget-object v0, p0, Le/f/a/c/m/a;->d:Le/f/a/c/m/c;

    invoke-virtual {v0}, Le/f/a/c/m/c;->j()V

    .line 5
    invoke-super {p0, p1}, Lc/b/q/n;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {p0}, Landroid/widget/Button;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getState()[I

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    goto :goto_0

    .line 7
    :cond_1
    invoke-super {p0, p1}, Lc/b/q/n;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    :goto_0
    return-void
.end method

.method public setBackgroundResource(I)V
    .locals 1

    if-eqz p1, :cond_0

    .line 1
    invoke-virtual {p0}, Landroid/widget/Button;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lc/b/l/a/b;->c(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 2
    :goto_0
    invoke-virtual {p0, p1}, Le/f/a/c/m/a;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setBackgroundTintList(Landroid/content/res/ColorStateList;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Le/f/a/c/m/a;->setSupportBackgroundTintList(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public setBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Le/f/a/c/m/a;->setSupportBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V

    return-void
.end method

.method public setCornerRadius(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Le/f/a/c/m/a;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Le/f/a/c/m/a;->d:Le/f/a/c/m/c;

    invoke-virtual {v0, p1}, Le/f/a/c/m/c;->b(I)V

    :cond_0
    return-void
.end method

.method public setCornerRadiusResource(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Le/f/a/c/m/a;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Landroid/widget/Button;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    invoke-virtual {p0, p1}, Le/f/a/c/m/a;->setCornerRadius(I)V

    :cond_0
    return-void
.end method

.method public setIcon(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/a/c/m/a;->h:Landroid/graphics/drawable/Drawable;

    if-eq v0, p1, :cond_0

    .line 2
    iput-object p1, p0, Le/f/a/c/m/a;->h:Landroid/graphics/drawable/Drawable;

    .line 3
    invoke-virtual {p0}, Le/f/a/c/m/a;->c()V

    :cond_0
    return-void
.end method

.method public setIconGravity(I)V
    .locals 0

    .line 1
    iput p1, p0, Le/f/a/c/m/a;->k:I

    return-void
.end method

.method public setIconPadding(I)V
    .locals 1

    .line 1
    iget v0, p0, Le/f/a/c/m/a;->e:I

    if-eq v0, p1, :cond_0

    .line 2
    iput p1, p0, Le/f/a/c/m/a;->e:I

    .line 3
    invoke-virtual {p0, p1}, Landroid/widget/Button;->setCompoundDrawablePadding(I)V

    :cond_0
    return-void
.end method

.method public setIconResource(I)V
    .locals 1

    if-eqz p1, :cond_0

    .line 1
    invoke-virtual {p0}, Landroid/widget/Button;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lc/b/l/a/b;->c(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 2
    :goto_0
    invoke-virtual {p0, p1}, Le/f/a/c/m/a;->setIcon(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setIconSize(I)V
    .locals 1

    if-ltz p1, :cond_1

    .line 1
    iget v0, p0, Le/f/a/c/m/a;->i:I

    if-eq v0, p1, :cond_0

    .line 2
    iput p1, p0, Le/f/a/c/m/a;->i:I

    .line 3
    invoke-virtual {p0}, Le/f/a/c/m/a;->c()V

    :cond_0
    return-void

    .line 4
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "iconSize cannot be less than 0"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setIconTint(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/a/c/m/a;->g:Landroid/content/res/ColorStateList;

    if-eq v0, p1, :cond_0

    .line 2
    iput-object p1, p0, Le/f/a/c/m/a;->g:Landroid/content/res/ColorStateList;

    .line 3
    invoke-virtual {p0}, Le/f/a/c/m/a;->c()V

    :cond_0
    return-void
.end method

.method public setIconTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/a/c/m/a;->f:Landroid/graphics/PorterDuff$Mode;

    if-eq v0, p1, :cond_0

    .line 2
    iput-object p1, p0, Le/f/a/c/m/a;->f:Landroid/graphics/PorterDuff$Mode;

    .line 3
    invoke-virtual {p0}, Le/f/a/c/m/a;->c()V

    :cond_0
    return-void
.end method

.method public setIconTintResource(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/widget/Button;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lc/b/l/a/b;->b(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {p0, p1}, Le/f/a/c/m/a;->setIconTint(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public setInternalBackground(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lc/b/q/n;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setRippleColor(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Le/f/a/c/m/a;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Le/f/a/c/m/a;->d:Le/f/a/c/m/c;

    invoke-virtual {v0, p1}, Le/f/a/c/m/c;->a(Landroid/content/res/ColorStateList;)V

    :cond_0
    return-void
.end method

.method public setRippleColorResource(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Le/f/a/c/m/a;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Landroid/widget/Button;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lc/b/l/a/b;->b(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {p0, p1}, Le/f/a/c/m/a;->setRippleColor(Landroid/content/res/ColorStateList;)V

    :cond_0
    return-void
.end method

.method public setStrokeColor(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Le/f/a/c/m/a;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Le/f/a/c/m/a;->d:Le/f/a/c/m/c;

    invoke-virtual {v0, p1}, Le/f/a/c/m/c;->b(Landroid/content/res/ColorStateList;)V

    :cond_0
    return-void
.end method

.method public setStrokeColorResource(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Le/f/a/c/m/a;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Landroid/widget/Button;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lc/b/l/a/b;->b(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {p0, p1}, Le/f/a/c/m/a;->setStrokeColor(Landroid/content/res/ColorStateList;)V

    :cond_0
    return-void
.end method

.method public setStrokeWidth(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Le/f/a/c/m/a;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Le/f/a/c/m/a;->d:Le/f/a/c/m/c;

    invoke-virtual {v0, p1}, Le/f/a/c/m/c;->c(I)V

    :cond_0
    return-void
.end method

.method public setStrokeWidthResource(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Le/f/a/c/m/a;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Landroid/widget/Button;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    invoke-virtual {p0, p1}, Le/f/a/c/m/a;->setStrokeWidth(I)V

    :cond_0
    return-void
.end method

.method public setSupportBackgroundTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Le/f/a/c/m/a;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Le/f/a/c/m/a;->d:Le/f/a/c/m/c;

    invoke-virtual {v0, p1}, Le/f/a/c/m/c;->c(Landroid/content/res/ColorStateList;)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Le/f/a/c/m/a;->d:Le/f/a/c/m/c;

    if-eqz v0, :cond_1

    .line 4
    invoke-super {p0, p1}, Lc/b/q/n;->setSupportBackgroundTintList(Landroid/content/res/ColorStateList;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public setSupportBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Le/f/a/c/m/a;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Le/f/a/c/m/a;->d:Le/f/a/c/m/c;

    invoke-virtual {v0, p1}, Le/f/a/c/m/c;->a(Landroid/graphics/PorterDuff$Mode;)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Le/f/a/c/m/a;->d:Le/f/a/c/m/c;

    if-eqz v0, :cond_1

    .line 4
    invoke-super {p0, p1}, Lc/b/q/n;->setSupportBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V

    :cond_1
    :goto_0
    return-void
.end method
