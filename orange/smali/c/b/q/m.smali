.class public Lc/b/q/m;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/view/View;

.field public final b:Lc/b/q/s;

.field public c:I

.field public d:Lc/b/q/i2;

.field public e:Lc/b/q/i2;

.field public f:Lc/b/q/i2;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 2
    iput v0, p0, Lc/b/q/m;->c:I

    .line 3
    iput-object p1, p0, Lc/b/q/m;->a:Landroid/view/View;

    .line 4
    invoke-static {}, Lc/b/q/s;->b()Lc/b/q/s;

    move-result-object p1

    iput-object p1, p0, Lc/b/q/m;->b:Lc/b/q/s;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .line 28
    iget-object v0, p0, Lc/b/q/m;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 29
    invoke-virtual {p0}, Lc/b/q/m;->d()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 30
    invoke-virtual {p0, v0}, Lc/b/q/m;->a(Landroid/graphics/drawable/Drawable;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    .line 31
    :cond_0
    iget-object v1, p0, Lc/b/q/m;->e:Lc/b/q/i2;

    if-eqz v1, :cond_1

    .line 32
    iget-object v2, p0, Lc/b/q/m;->a:Landroid/view/View;

    .line 33
    invoke-virtual {v2}, Landroid/view/View;->getDrawableState()[I

    move-result-object v2

    .line 34
    invoke-static {v0, v1, v2}, Lc/b/q/s;->a(Landroid/graphics/drawable/Drawable;Lc/b/q/i2;[I)V

    goto :goto_0

    .line 35
    :cond_1
    iget-object v1, p0, Lc/b/q/m;->d:Lc/b/q/i2;

    if-eqz v1, :cond_2

    .line 36
    iget-object v2, p0, Lc/b/q/m;->a:Landroid/view/View;

    .line 37
    invoke-virtual {v2}, Landroid/view/View;->getDrawableState()[I

    move-result-object v2

    .line 38
    invoke-static {v0, v1, v2}, Lc/b/q/s;->a(Landroid/graphics/drawable/Drawable;Lc/b/q/i2;[I)V

    :cond_2
    :goto_0
    return-void
.end method

.method public a(I)V
    .locals 2

    .line 18
    iput p1, p0, Lc/b/q/m;->c:I

    .line 19
    iget-object v0, p0, Lc/b/q/m;->b:Lc/b/q/s;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lc/b/q/m;->a:Landroid/view/View;

    .line 20
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lc/b/q/s;->b(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 21
    :goto_0
    invoke-virtual {p0, p1}, Lc/b/q/m;->a(Landroid/content/res/ColorStateList;)V

    .line 22
    invoke-virtual {p0}, Lc/b/q/m;->a()V

    return-void
.end method

.method public a(Landroid/content/res/ColorStateList;)V
    .locals 1

    if-eqz p1, :cond_1

    .line 39
    iget-object v0, p0, Lc/b/q/m;->d:Lc/b/q/i2;

    if-nez v0, :cond_0

    .line 40
    new-instance v0, Lc/b/q/i2;

    invoke-direct {v0}, Lc/b/q/i2;-><init>()V

    iput-object v0, p0, Lc/b/q/m;->d:Lc/b/q/i2;

    .line 41
    :cond_0
    iget-object v0, p0, Lc/b/q/m;->d:Lc/b/q/i2;

    iput-object p1, v0, Lc/b/q/i2;->a:Landroid/content/res/ColorStateList;

    const/4 p1, 0x1

    .line 42
    iput-boolean p1, v0, Lc/b/q/i2;->d:Z

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    .line 43
    iput-object p1, p0, Lc/b/q/m;->d:Lc/b/q/i2;

    .line 44
    :goto_0
    invoke-virtual {p0}, Lc/b/q/m;->a()V

    return-void
.end method

.method public a(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    .line 23
    iget-object v0, p0, Lc/b/q/m;->e:Lc/b/q/i2;

    if-nez v0, :cond_0

    .line 24
    new-instance v0, Lc/b/q/i2;

    invoke-direct {v0}, Lc/b/q/i2;-><init>()V

    iput-object v0, p0, Lc/b/q/m;->e:Lc/b/q/i2;

    .line 25
    :cond_0
    iget-object v0, p0, Lc/b/q/m;->e:Lc/b/q/i2;

    iput-object p1, v0, Lc/b/q/i2;->b:Landroid/graphics/PorterDuff$Mode;

    const/4 p1, 0x1

    .line 26
    iput-boolean p1, v0, Lc/b/q/i2;->c:Z

    .line 27
    invoke-virtual {p0}, Lc/b/q/m;->a()V

    return-void
.end method

.method public a(Landroid/util/AttributeSet;I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lc/b/q/m;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lc/b/j;->ViewBackgroundHelper:[I

    const/4 v2, 0x0

    invoke-static {v0, p1, v1, p2, v2}, Lc/b/q/k2;->a(Landroid/content/Context;Landroid/util/AttributeSet;[III)Lc/b/q/k2;

    move-result-object p1

    .line 2
    :try_start_0
    sget p2, Lc/b/j;->ViewBackgroundHelper_android_background:I

    invoke-virtual {p1, p2}, Lc/b/q/k2;->g(I)Z

    move-result p2

    const/4 v0, -0x1

    if-eqz p2, :cond_0

    .line 3
    sget p2, Lc/b/j;->ViewBackgroundHelper_android_background:I

    invoke-virtual {p1, p2, v0}, Lc/b/q/k2;->g(II)I

    move-result p2

    iput p2, p0, Lc/b/q/m;->c:I

    .line 4
    iget-object p2, p0, Lc/b/q/m;->b:Lc/b/q/s;

    iget-object v1, p0, Lc/b/q/m;->a:Landroid/view/View;

    .line 5
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    iget v2, p0, Lc/b/q/m;->c:I

    invoke-virtual {p2, v1, v2}, Lc/b/q/s;->b(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 6
    invoke-virtual {p0, p2}, Lc/b/q/m;->a(Landroid/content/res/ColorStateList;)V

    .line 7
    :cond_0
    sget p2, Lc/b/j;->ViewBackgroundHelper_backgroundTint:I

    invoke-virtual {p1, p2}, Lc/b/q/k2;->g(I)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 8
    iget-object p2, p0, Lc/b/q/m;->a:Landroid/view/View;

    sget v1, Lc/b/j;->ViewBackgroundHelper_backgroundTint:I

    .line 9
    invoke-virtual {p1, v1}, Lc/b/q/k2;->a(I)Landroid/content/res/ColorStateList;

    move-result-object v1

    .line 10
    invoke-static {p2, v1}, Lc/h/n/v0;->a(Landroid/view/View;Landroid/content/res/ColorStateList;)V

    .line 11
    :cond_1
    sget p2, Lc/b/j;->ViewBackgroundHelper_backgroundTintMode:I

    invoke-virtual {p1, p2}, Lc/b/q/k2;->g(I)Z

    move-result p2

    if-eqz p2, :cond_2

    .line 12
    iget-object p2, p0, Lc/b/q/m;->a:Landroid/view/View;

    sget v1, Lc/b/j;->ViewBackgroundHelper_backgroundTintMode:I

    .line 13
    invoke-virtual {p1, v1, v0}, Lc/b/q/k2;->d(II)I

    move-result v0

    const/4 v1, 0x0

    .line 14
    invoke-static {v0, v1}, Lc/b/q/a1;->a(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    .line 15
    invoke-static {p2, v0}, Lc/h/n/v0;->a(Landroid/view/View;Landroid/graphics/PorterDuff$Mode;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    :cond_2
    invoke-virtual {p1}, Lc/b/q/k2;->a()V

    return-void

    :catchall_0
    move-exception p2

    invoke-virtual {p1}, Lc/b/q/k2;->a()V

    .line 17
    throw p2
.end method

.method public final a(Landroid/graphics/drawable/Drawable;)Z
    .locals 3

    .line 45
    iget-object v0, p0, Lc/b/q/m;->f:Lc/b/q/i2;

    if-nez v0, :cond_0

    .line 46
    new-instance v0, Lc/b/q/i2;

    invoke-direct {v0}, Lc/b/q/i2;-><init>()V

    iput-object v0, p0, Lc/b/q/m;->f:Lc/b/q/i2;

    .line 47
    :cond_0
    iget-object v0, p0, Lc/b/q/m;->f:Lc/b/q/i2;

    .line 48
    invoke-virtual {v0}, Lc/b/q/i2;->a()V

    .line 49
    iget-object v1, p0, Lc/b/q/m;->a:Landroid/view/View;

    invoke-static {v1}, Lc/h/n/v0;->g(Landroid/view/View;)Landroid/content/res/ColorStateList;

    move-result-object v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    .line 50
    iput-boolean v2, v0, Lc/b/q/i2;->d:Z

    .line 51
    iput-object v1, v0, Lc/b/q/i2;->a:Landroid/content/res/ColorStateList;

    .line 52
    :cond_1
    iget-object v1, p0, Lc/b/q/m;->a:Landroid/view/View;

    invoke-static {v1}, Lc/h/n/v0;->h(Landroid/view/View;)Landroid/graphics/PorterDuff$Mode;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 53
    iput-boolean v2, v0, Lc/b/q/i2;->c:Z

    .line 54
    iput-object v1, v0, Lc/b/q/i2;->b:Landroid/graphics/PorterDuff$Mode;

    .line 55
    :cond_2
    iget-boolean v1, v0, Lc/b/q/i2;->d:Z

    if-nez v1, :cond_4

    iget-boolean v1, v0, Lc/b/q/i2;->c:Z

    if-eqz v1, :cond_3

    goto :goto_0

    :cond_3
    const/4 p1, 0x0

    return p1

    .line 56
    :cond_4
    :goto_0
    iget-object v1, p0, Lc/b/q/m;->a:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getDrawableState()[I

    move-result-object v1

    invoke-static {p1, v0, v1}, Lc/b/q/s;->a(Landroid/graphics/drawable/Drawable;Lc/b/q/i2;[I)V

    return v2
.end method

.method public b()Landroid/content/res/ColorStateList;
    .locals 1

    .line 9
    iget-object v0, p0, Lc/b/q/m;->e:Lc/b/q/i2;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lc/b/q/i2;->a:Landroid/content/res/ColorStateList;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public b(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 4
    iget-object v0, p0, Lc/b/q/m;->e:Lc/b/q/i2;

    if-nez v0, :cond_0

    .line 5
    new-instance v0, Lc/b/q/i2;

    invoke-direct {v0}, Lc/b/q/i2;-><init>()V

    iput-object v0, p0, Lc/b/q/m;->e:Lc/b/q/i2;

    .line 6
    :cond_0
    iget-object v0, p0, Lc/b/q/m;->e:Lc/b/q/i2;

    iput-object p1, v0, Lc/b/q/i2;->a:Landroid/content/res/ColorStateList;

    const/4 p1, 0x1

    .line 7
    iput-boolean p1, v0, Lc/b/q/i2;->d:Z

    .line 8
    invoke-virtual {p0}, Lc/b/q/m;->a()V

    return-void
.end method

.method public b(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    const/4 p1, -0x1

    .line 1
    iput p1, p0, Lc/b/q/m;->c:I

    const/4 p1, 0x0

    .line 2
    invoke-virtual {p0, p1}, Lc/b/q/m;->a(Landroid/content/res/ColorStateList;)V

    .line 3
    invoke-virtual {p0}, Lc/b/q/m;->a()V

    return-void
.end method

.method public c()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/b/q/m;->e:Lc/b/q/i2;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lc/b/q/i2;->b:Landroid/graphics/PorterDuff$Mode;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final d()Z
    .locals 4

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/16 v3, 0x15

    if-le v0, v3, :cond_1

    .line 2
    iget-object v0, p0, Lc/b/q/m;->d:Lc/b/q/i2;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1

    :cond_1
    if-ne v0, v3, :cond_2

    return v1

    :cond_2
    return v2
.end method