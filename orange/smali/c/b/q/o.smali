.class public Lc/b/q/o;
.super Landroid/widget/CheckBox;
.source "SourceFile"

# interfaces
.implements Lc/h/o/q;
.implements Lc/h/n/z;


# instance fields
.field public final b:Lc/b/q/q;

.field public final c:Lc/b/q/m;

.field public final d:Lc/b/q/u0;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 1
    sget v0, Lc/b/a;->checkboxStyle:I

    invoke-direct {p0, p1, p2, v0}, Lc/b/q/o;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 2
    invoke-static {p1}, Lc/b/q/h2;->b(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/CheckBox;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 3
    new-instance p1, Lc/b/q/q;

    invoke-direct {p1, p0}, Lc/b/q/q;-><init>(Landroid/widget/CompoundButton;)V

    iput-object p1, p0, Lc/b/q/o;->b:Lc/b/q/q;

    .line 4
    invoke-virtual {p1, p2, p3}, Lc/b/q/q;->a(Landroid/util/AttributeSet;I)V

    .line 5
    new-instance p1, Lc/b/q/m;

    invoke-direct {p1, p0}, Lc/b/q/m;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Lc/b/q/o;->c:Lc/b/q/m;

    .line 6
    invoke-virtual {p1, p2, p3}, Lc/b/q/m;->a(Landroid/util/AttributeSet;I)V

    .line 7
    new-instance p1, Lc/b/q/u0;

    invoke-direct {p1, p0}, Lc/b/q/u0;-><init>(Landroid/widget/TextView;)V

    iput-object p1, p0, Lc/b/q/o;->d:Lc/b/q/u0;

    .line 8
    invoke-virtual {p1, p2, p3}, Lc/b/q/u0;->a(Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method public drawableStateChanged()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/widget/CheckBox;->drawableStateChanged()V

    .line 2
    iget-object v0, p0, Lc/b/q/o;->c:Lc/b/q/m;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Lc/b/q/m;->a()V

    .line 4
    :cond_0
    iget-object v0, p0, Lc/b/q/o;->d:Lc/b/q/u0;

    if-eqz v0, :cond_1

    .line 5
    invoke-virtual {v0}, Lc/b/q/u0;->a()V

    :cond_1
    return-void
.end method

.method public getCompoundPaddingLeft()I
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/widget/CheckBox;->getCompoundPaddingLeft()I

    move-result v0

    .line 2
    iget-object v1, p0, Lc/b/q/o;->b:Lc/b/q/q;

    if-eqz v1, :cond_0

    .line 3
    invoke-virtual {v1, v0}, Lc/b/q/q;->a(I)I

    move-result v0

    :cond_0
    return v0
.end method

.method public getSupportBackgroundTintList()Landroid/content/res/ColorStateList;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/b/q/o;->c:Lc/b/q/m;

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
    iget-object v0, p0, Lc/b/q/o;->c:Lc/b/q/m;

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

.method public getSupportButtonTintList()Landroid/content/res/ColorStateList;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/b/q/o;->b:Lc/b/q/q;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lc/b/q/q;->b()Landroid/content/res/ColorStateList;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getSupportButtonTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/b/q/o;->b:Lc/b/q/q;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lc/b/q/q;->c()Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/widget/CheckBox;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 2
    iget-object v0, p0, Lc/b/q/o;->c:Lc/b/q/m;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0, p1}, Lc/b/q/m;->b(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    return-void
.end method

.method public setBackgroundResource(I)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/widget/CheckBox;->setBackgroundResource(I)V

    .line 2
    iget-object v0, p0, Lc/b/q/o;->c:Lc/b/q/m;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0, p1}, Lc/b/q/m;->a(I)V

    :cond_0
    return-void
.end method

.method public setButtonDrawable(I)V
    .locals 1

    .line 4
    invoke-virtual {p0}, Landroid/widget/CheckBox;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lc/b/l/a/b;->c(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Lc/b/q/o;->setButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setButtonDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/widget/CheckBox;->setButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 2
    iget-object p1, p0, Lc/b/q/o;->b:Lc/b/q/q;

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p1}, Lc/b/q/q;->d()V

    :cond_0
    return-void
.end method

.method public setSupportBackgroundTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/b/q/o;->c:Lc/b/q/m;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Lc/b/q/m;->b(Landroid/content/res/ColorStateList;)V

    :cond_0
    return-void
.end method

.method public setSupportBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/b/q/o;->c:Lc/b/q/m;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Lc/b/q/m;->a(Landroid/graphics/PorterDuff$Mode;)V

    :cond_0
    return-void
.end method

.method public setSupportButtonTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/b/q/o;->b:Lc/b/q/q;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Lc/b/q/q;->a(Landroid/content/res/ColorStateList;)V

    :cond_0
    return-void
.end method

.method public setSupportButtonTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/b/q/o;->b:Lc/b/q/q;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Lc/b/q/q;->a(Landroid/graphics/PorterDuff$Mode;)V

    :cond_0
    return-void
.end method
