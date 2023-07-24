.class public Lc/b/q/v;
.super Landroid/widget/ImageButton;
.source "SourceFile"

# interfaces
.implements Lc/h/n/z;
.implements Lc/h/o/s;


# instance fields
.field public final b:Lc/b/q/m;

.field public final c:Lc/b/q/w;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 1
    sget v0, Lc/b/a;->imageButtonStyle:I

    invoke-direct {p0, p1, p2, v0}, Lc/b/q/v;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 2
    invoke-static {p1}, Lc/b/q/h2;->b(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ImageButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 3
    new-instance p1, Lc/b/q/m;

    invoke-direct {p1, p0}, Lc/b/q/m;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Lc/b/q/v;->b:Lc/b/q/m;

    .line 4
    invoke-virtual {p1, p2, p3}, Lc/b/q/m;->a(Landroid/util/AttributeSet;I)V

    .line 5
    new-instance p1, Lc/b/q/w;

    invoke-direct {p1, p0}, Lc/b/q/w;-><init>(Landroid/widget/ImageView;)V

    iput-object p1, p0, Lc/b/q/v;->c:Lc/b/q/w;

    .line 6
    invoke-virtual {p1, p2, p3}, Lc/b/q/w;->a(Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method public drawableStateChanged()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/widget/ImageButton;->drawableStateChanged()V

    .line 2
    iget-object v0, p0, Lc/b/q/v;->b:Lc/b/q/m;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Lc/b/q/m;->a()V

    .line 4
    :cond_0
    iget-object v0, p0, Lc/b/q/v;->c:Lc/b/q/w;

    if-eqz v0, :cond_1

    .line 5
    invoke-virtual {v0}, Lc/b/q/w;->a()V

    :cond_1
    return-void
.end method

.method public getSupportBackgroundTintList()Landroid/content/res/ColorStateList;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/b/q/v;->b:Lc/b/q/m;

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
    iget-object v0, p0, Lc/b/q/v;->b:Lc/b/q/m;

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

.method public getSupportImageTintList()Landroid/content/res/ColorStateList;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/b/q/v;->c:Lc/b/q/w;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lc/b/q/w;->b()Landroid/content/res/ColorStateList;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getSupportImageTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/b/q/v;->c:Lc/b/q/w;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lc/b/q/w;->c()Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public hasOverlappingRendering()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lc/b/q/v;->c:Lc/b/q/w;

    invoke-virtual {v0}, Lc/b/q/w;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-super {p0}, Landroid/widget/ImageButton;->hasOverlappingRendering()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/widget/ImageButton;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 2
    iget-object v0, p0, Lc/b/q/v;->b:Lc/b/q/m;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0, p1}, Lc/b/q/m;->b(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    return-void
.end method

.method public setBackgroundResource(I)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/widget/ImageButton;->setBackgroundResource(I)V

    .line 2
    iget-object v0, p0, Lc/b/q/v;->b:Lc/b/q/m;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0, p1}, Lc/b/q/m;->a(I)V

    :cond_0
    return-void
.end method

.method public setImageBitmap(Landroid/graphics/Bitmap;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/widget/ImageButton;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 2
    iget-object p1, p0, Lc/b/q/v;->c:Lc/b/q/w;

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p1}, Lc/b/q/w;->a()V

    :cond_0
    return-void
.end method

.method public setImageDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/widget/ImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 2
    iget-object p1, p0, Lc/b/q/v;->c:Lc/b/q/w;

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p1}, Lc/b/q/w;->a()V

    :cond_0
    return-void
.end method

.method public setImageResource(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/b/q/v;->c:Lc/b/q/w;

    invoke-virtual {v0, p1}, Lc/b/q/w;->a(I)V

    return-void
.end method

.method public setImageURI(Landroid/net/Uri;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/widget/ImageButton;->setImageURI(Landroid/net/Uri;)V

    .line 2
    iget-object p1, p0, Lc/b/q/v;->c:Lc/b/q/w;

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p1}, Lc/b/q/w;->a()V

    :cond_0
    return-void
.end method

.method public setSupportBackgroundTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/b/q/v;->b:Lc/b/q/m;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Lc/b/q/m;->b(Landroid/content/res/ColorStateList;)V

    :cond_0
    return-void
.end method

.method public setSupportBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/b/q/v;->b:Lc/b/q/m;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Lc/b/q/m;->a(Landroid/graphics/PorterDuff$Mode;)V

    :cond_0
    return-void
.end method

.method public setSupportImageTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/b/q/v;->c:Lc/b/q/w;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Lc/b/q/w;->a(Landroid/content/res/ColorStateList;)V

    :cond_0
    return-void
.end method

.method public setSupportImageTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/b/q/v;->c:Lc/b/q/w;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Lc/b/q/w;->a(Landroid/graphics/PorterDuff$Mode;)V

    :cond_0
    return-void
.end method
