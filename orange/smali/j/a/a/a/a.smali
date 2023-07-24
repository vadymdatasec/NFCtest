.class public abstract Lj/a/a/a/a;
.super Landroid/widget/FrameLayout;
.source "SourceFile"

# interfaces
.implements Landroid/hardware/Camera$PreviewCallback;


# instance fields
.field public b:Lj/a/a/a/i;

.field public c:Lj/a/a/a/g;

.field public d:Lj/a/a/a/k;

.field public e:Landroid/graphics/Rect;

.field public f:Lj/a/a/a/d;

.field public g:Ljava/lang/Boolean;

.field public h:Z

.field public i:Z

.field public j:Z

.field public k:I

.field public l:I

.field public m:I

.field public n:I

.field public o:I

.field public p:Z

.field public q:I

.field public r:Z

.field public s:F

.field public t:I

.field public u:F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Lj/a/a/a/a;->h:Z

    .line 3
    iput-boolean p1, p0, Lj/a/a/a/a;->i:Z

    .line 4
    iput-boolean p1, p0, Lj/a/a/a/a;->j:Z

    .line 5
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget v0, Lj/a/a/a/l;->viewfinder_laser:I

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getColor(I)I

    move-result p1

    iput p1, p0, Lj/a/a/a/a;->k:I

    .line 6
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget v0, Lj/a/a/a/l;->viewfinder_border:I

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getColor(I)I

    move-result p1

    iput p1, p0, Lj/a/a/a/a;->l:I

    .line 7
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget v0, Lj/a/a/a/l;->viewfinder_mask:I

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getColor(I)I

    move-result p1

    iput p1, p0, Lj/a/a/a/a;->m:I

    .line 8
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget v0, Lj/a/a/a/m;->viewfinder_border_width:I

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getInteger(I)I

    move-result p1

    iput p1, p0, Lj/a/a/a/a;->n:I

    .line 9
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget v0, Lj/a/a/a/m;->viewfinder_border_length:I

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getInteger(I)I

    move-result p1

    iput p1, p0, Lj/a/a/a/a;->o:I

    const/4 p1, 0x0

    .line 10
    iput-boolean p1, p0, Lj/a/a/a/a;->p:Z

    .line 11
    iput p1, p0, Lj/a/a/a/a;->q:I

    .line 12
    iput-boolean p1, p0, Lj/a/a/a/a;->r:Z

    const/high16 v0, 0x3f800000    # 1.0f

    .line 13
    iput v0, p0, Lj/a/a/a/a;->s:F

    .line 14
    iput p1, p0, Lj/a/a/a/a;->t:I

    const p1, 0x3dcccccd    # 0.1f

    .line 15
    iput p1, p0, Lj/a/a/a/a;->u:F

    .line 16
    invoke-virtual {p0}, Lj/a/a/a/a;->a()V

    return-void
.end method


# virtual methods
.method public declared-synchronized a(II)Landroid/graphics/Rect;
    .locals 4

    monitor-enter p0

    .line 16
    :try_start_0
    iget-object v0, p0, Lj/a/a/a/a;->e:Landroid/graphics/Rect;

    if-nez v0, :cond_4

    .line 17
    iget-object v0, p0, Lj/a/a/a/a;->d:Lj/a/a/a/k;

    invoke-interface {v0}, Lj/a/a/a/k;->getFramingRect()Landroid/graphics/Rect;

    move-result-object v0

    .line 18
    iget-object v1, p0, Lj/a/a/a/a;->d:Lj/a/a/a/k;

    invoke-interface {v1}, Lj/a/a/a/k;->getWidth()I

    move-result v1

    .line 19
    iget-object v2, p0, Lj/a/a/a/a;->d:Lj/a/a/a/k;

    invoke-interface {v2}, Lj/a/a/a/k;->getHeight()I

    move-result v2

    if-eqz v0, :cond_3

    if-eqz v1, :cond_3

    if-nez v2, :cond_0

    goto :goto_0

    .line 20
    :cond_0
    new-instance v3, Landroid/graphics/Rect;

    invoke-direct {v3, v0}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    if-ge p1, v1, :cond_1

    .line 21
    iget v0, v3, Landroid/graphics/Rect;->left:I

    mul-int v0, v0, p1

    div-int/2addr v0, v1

    iput v0, v3, Landroid/graphics/Rect;->left:I

    .line 22
    iget v0, v3, Landroid/graphics/Rect;->right:I

    mul-int v0, v0, p1

    div-int/2addr v0, v1

    iput v0, v3, Landroid/graphics/Rect;->right:I

    :cond_1
    if-ge p2, v2, :cond_2

    .line 23
    iget p1, v3, Landroid/graphics/Rect;->top:I

    mul-int p1, p1, p2

    div-int/2addr p1, v2

    iput p1, v3, Landroid/graphics/Rect;->top:I

    .line 24
    iget p1, v3, Landroid/graphics/Rect;->bottom:I

    mul-int p1, p1, p2

    div-int/2addr p1, v2

    iput p1, v3, Landroid/graphics/Rect;->bottom:I

    .line 25
    :cond_2
    iput-object v3, p0, Lj/a/a/a/a;->e:Landroid/graphics/Rect;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :cond_3
    :goto_0
    const/4 p1, 0x0

    .line 26
    monitor-exit p0

    return-object p1

    .line 27
    :cond_4
    :goto_1
    :try_start_1
    iget-object p1, p0, Lj/a/a/a/a;->e:Landroid/graphics/Rect;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public a(Landroid/content/Context;)Lj/a/a/a/k;
    .locals 1

    .line 2
    new-instance v0, Lj/a/a/a/n;

    invoke-direct {v0, p1}, Lj/a/a/a/n;-><init>(Landroid/content/Context;)V

    .line 3
    iget p1, p0, Lj/a/a/a/a;->l:I

    invoke-virtual {v0, p1}, Lj/a/a/a/n;->setBorderColor(I)V

    .line 4
    iget p1, p0, Lj/a/a/a/a;->k:I

    invoke-virtual {v0, p1}, Lj/a/a/a/n;->setLaserColor(I)V

    .line 5
    iget-boolean p1, p0, Lj/a/a/a/a;->j:Z

    invoke-virtual {v0, p1}, Lj/a/a/a/n;->setLaserEnabled(Z)V

    .line 6
    iget p1, p0, Lj/a/a/a/a;->n:I

    invoke-virtual {v0, p1}, Lj/a/a/a/n;->setBorderStrokeWidth(I)V

    .line 7
    iget p1, p0, Lj/a/a/a/a;->o:I

    invoke-virtual {v0, p1}, Lj/a/a/a/n;->setBorderLineLength(I)V

    .line 8
    iget p1, p0, Lj/a/a/a/a;->m:I

    invoke-virtual {v0, p1}, Lj/a/a/a/n;->setMaskColor(I)V

    .line 9
    iget-boolean p1, p0, Lj/a/a/a/a;->p:Z

    invoke-virtual {v0, p1}, Lj/a/a/a/n;->setBorderCornerRounded(Z)V

    .line 10
    iget p1, p0, Lj/a/a/a/a;->q:I

    invoke-virtual {v0, p1}, Lj/a/a/a/n;->setBorderCornerRadius(I)V

    .line 11
    iget-boolean p1, p0, Lj/a/a/a/a;->r:Z

    invoke-virtual {v0, p1}, Lj/a/a/a/n;->setSquareViewFinder(Z)V

    .line 12
    iget p1, p0, Lj/a/a/a/a;->t:I

    invoke-virtual {v0, p1}, Lj/a/a/a/n;->setViewFinderOffset(I)V

    return-object v0
.end method

.method public final a()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p0, v0}, Lj/a/a/a/a;->a(Landroid/content/Context;)Lj/a/a/a/k;

    move-result-object v0

    iput-object v0, p0, Lj/a/a/a/a;->d:Lj/a/a/a/k;

    return-void
.end method

.method public a(I)V
    .locals 1

    .line 13
    iget-object v0, p0, Lj/a/a/a/a;->f:Lj/a/a/a/d;

    if-nez v0, :cond_0

    .line 14
    new-instance v0, Lj/a/a/a/d;

    invoke-direct {v0, p0}, Lj/a/a/a/d;-><init>(Lj/a/a/a/a;)V

    iput-object v0, p0, Lj/a/a/a/a;->f:Lj/a/a/a/d;

    .line 15
    :cond_0
    iget-object v0, p0, Lj/a/a/a/a;->f:Lj/a/a/a/d;

    invoke-virtual {v0, p1}, Lj/a/a/a/d;->a(I)V

    return-void
.end method

.method public a([BLandroid/hardware/Camera;)[B
    .locals 11

    .line 28
    invoke-virtual {p2}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object p2

    .line 29
    invoke-virtual {p2}, Landroid/hardware/Camera$Parameters;->getPreviewSize()Landroid/hardware/Camera$Size;

    move-result-object p2

    .line 30
    iget v0, p2, Landroid/hardware/Camera$Size;->width:I

    .line 31
    iget p2, p2, Landroid/hardware/Camera$Size;->height:I

    .line 32
    invoke-virtual {p0}, Lj/a/a/a/a;->getRotationCount()I

    move-result v1

    const/4 v2, 0x1

    if-eq v1, v2, :cond_0

    const/4 v3, 0x3

    if-ne v1, v3, :cond_3

    :cond_0
    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v1, :cond_3

    .line 33
    array-length v5, p1

    new-array v5, v5, [B

    const/4 v6, 0x0

    :goto_1
    if-ge v6, p2, :cond_2

    const/4 v7, 0x0

    :goto_2
    if-ge v7, v0, :cond_1

    mul-int v8, v7, p2

    add-int/2addr v8, p2

    sub-int/2addr v8, v6

    sub-int/2addr v8, v2

    mul-int v9, v6, v0

    add-int/2addr v9, v7

    .line 34
    aget-byte v9, p1, v9

    aput-byte v9, v5, v8

    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    :cond_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_2
    add-int/lit8 v4, v4, 0x1

    move-object p1, v5

    move v10, v0

    move v0, p2

    move p2, v10

    goto :goto_0

    :cond_3
    return-object p1
.end method

.method public b()V
    .locals 1

    .line 1
    iget-object v0, p0, Lj/a/a/a/a;->c:Lj/a/a/a/g;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lj/a/a/a/g;->d()V

    :cond_0
    return-void
.end method

.method public c()V
    .locals 1

    .line 1
    invoke-static {}, Lj/a/a/a/h;->a()I

    move-result v0

    invoke-virtual {p0, v0}, Lj/a/a/a/a;->a(I)V

    return-void
.end method

.method public d()V
    .locals 2

    .line 1
    iget-object v0, p0, Lj/a/a/a/a;->b:Lj/a/a/a/i;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lj/a/a/a/a;->c:Lj/a/a/a/g;

    invoke-virtual {v0}, Lj/a/a/a/g;->e()V

    .line 3
    iget-object v0, p0, Lj/a/a/a/a;->c:Lj/a/a/a/g;

    invoke-virtual {v0, v1, v1}, Lj/a/a/a/g;->b(Lj/a/a/a/i;Landroid/hardware/Camera$PreviewCallback;)V

    .line 4
    iget-object v0, p0, Lj/a/a/a/a;->b:Lj/a/a/a/i;

    iget-object v0, v0, Lj/a/a/a/i;->a:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->release()V

    .line 5
    iput-object v1, p0, Lj/a/a/a/a;->b:Lj/a/a/a/i;

    .line 6
    :cond_0
    iget-object v0, p0, Lj/a/a/a/a;->f:Lj/a/a/a/d;

    if-eqz v0, :cond_1

    .line 7
    invoke-virtual {v0}, Landroid/os/HandlerThread;->quit()Z

    .line 8
    iput-object v1, p0, Lj/a/a/a/a;->f:Lj/a/a/a/d;

    :cond_1
    return-void
.end method

.method public e()V
    .locals 1

    .line 1
    iget-object v0, p0, Lj/a/a/a/a;->c:Lj/a/a/a/g;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lj/a/a/a/g;->e()V

    :cond_0
    return-void
.end method

.method public getFlash()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lj/a/a/a/a;->b:Lj/a/a/a/i;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, v0, Lj/a/a/a/i;->a:Landroid/hardware/Camera;

    invoke-static {v0}, Lj/a/a/a/h;->a(Landroid/hardware/Camera;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lj/a/a/a/a;->b:Lj/a/a/a/i;

    iget-object v0, v0, Lj/a/a/a/i;->a:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object v0

    .line 3
    invoke-virtual {v0}, Landroid/hardware/Camera$Parameters;->getFlashMode()Ljava/lang/String;

    move-result-object v0

    const-string v2, "torch"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    return v1
.end method

.method public getRotationCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lj/a/a/a/a;->c:Lj/a/a/a/g;

    invoke-virtual {v0}, Lj/a/a/a/g;->getDisplayOrientation()I

    move-result v0

    .line 2
    div-int/lit8 v0, v0, 0x5a

    return v0
.end method

.method public setAspectTolerance(F)V
    .locals 0

    .line 1
    iput p1, p0, Lj/a/a/a/a;->u:F

    return-void
.end method

.method public setAutoFocus(Z)V
    .locals 1

    .line 1
    iput-boolean p1, p0, Lj/a/a/a/a;->h:Z

    .line 2
    iget-object v0, p0, Lj/a/a/a/a;->c:Lj/a/a/a/g;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0, p1}, Lj/a/a/a/g;->setAutoFocus(Z)V

    :cond_0
    return-void
.end method

.method public setBorderAlpha(F)V
    .locals 1

    .line 1
    iput p1, p0, Lj/a/a/a/a;->s:F

    .line 2
    iget-object v0, p0, Lj/a/a/a/a;->d:Lj/a/a/a/k;

    invoke-interface {v0, p1}, Lj/a/a/a/k;->setBorderAlpha(F)V

    .line 3
    iget-object p1, p0, Lj/a/a/a/a;->d:Lj/a/a/a/k;

    invoke-interface {p1}, Lj/a/a/a/k;->a()V

    return-void
.end method

.method public setBorderColor(I)V
    .locals 1

    .line 1
    iput p1, p0, Lj/a/a/a/a;->l:I

    .line 2
    iget-object v0, p0, Lj/a/a/a/a;->d:Lj/a/a/a/k;

    invoke-interface {v0, p1}, Lj/a/a/a/k;->setBorderColor(I)V

    .line 3
    iget-object p1, p0, Lj/a/a/a/a;->d:Lj/a/a/a/k;

    invoke-interface {p1}, Lj/a/a/a/k;->a()V

    return-void
.end method

.method public setBorderCornerRadius(I)V
    .locals 1

    .line 1
    iput p1, p0, Lj/a/a/a/a;->q:I

    .line 2
    iget-object v0, p0, Lj/a/a/a/a;->d:Lj/a/a/a/k;

    invoke-interface {v0, p1}, Lj/a/a/a/k;->setBorderCornerRadius(I)V

    .line 3
    iget-object p1, p0, Lj/a/a/a/a;->d:Lj/a/a/a/k;

    invoke-interface {p1}, Lj/a/a/a/k;->a()V

    return-void
.end method

.method public setBorderLineLength(I)V
    .locals 1

    .line 1
    iput p1, p0, Lj/a/a/a/a;->o:I

    .line 2
    iget-object v0, p0, Lj/a/a/a/a;->d:Lj/a/a/a/k;

    invoke-interface {v0, p1}, Lj/a/a/a/k;->setBorderLineLength(I)V

    .line 3
    iget-object p1, p0, Lj/a/a/a/a;->d:Lj/a/a/a/k;

    invoke-interface {p1}, Lj/a/a/a/k;->a()V

    return-void
.end method

.method public setBorderStrokeWidth(I)V
    .locals 1

    .line 1
    iput p1, p0, Lj/a/a/a/a;->n:I

    .line 2
    iget-object v0, p0, Lj/a/a/a/a;->d:Lj/a/a/a/k;

    invoke-interface {v0, p1}, Lj/a/a/a/k;->setBorderStrokeWidth(I)V

    .line 3
    iget-object p1, p0, Lj/a/a/a/a;->d:Lj/a/a/a/k;

    invoke-interface {p1}, Lj/a/a/a/k;->a()V

    return-void
.end method

.method public setFlash(Z)V
    .locals 2

    .line 1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lj/a/a/a/a;->g:Ljava/lang/Boolean;

    .line 2
    iget-object v0, p0, Lj/a/a/a/a;->b:Lj/a/a/a/i;

    if-eqz v0, :cond_3

    iget-object v0, v0, Lj/a/a/a/i;->a:Landroid/hardware/Camera;

    invoke-static {v0}, Lj/a/a/a/h;->a(Landroid/hardware/Camera;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 3
    iget-object v0, p0, Lj/a/a/a/a;->b:Lj/a/a/a/i;

    iget-object v0, v0, Lj/a/a/a/i;->a:Landroid/hardware/Camera;

    invoke-virtual {v0}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object v0

    if-eqz p1, :cond_1

    .line 4
    invoke-virtual {v0}, Landroid/hardware/Camera$Parameters;->getFlashMode()Ljava/lang/String;

    move-result-object p1

    const-string v1, "torch"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    .line 5
    :cond_0
    invoke-virtual {v0, v1}, Landroid/hardware/Camera$Parameters;->setFlashMode(Ljava/lang/String;)V

    goto :goto_0

    .line 6
    :cond_1
    invoke-virtual {v0}, Landroid/hardware/Camera$Parameters;->getFlashMode()Ljava/lang/String;

    move-result-object p1

    const-string v1, "off"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return-void

    .line 7
    :cond_2
    invoke-virtual {v0, v1}, Landroid/hardware/Camera$Parameters;->setFlashMode(Ljava/lang/String;)V

    .line 8
    :goto_0
    iget-object p1, p0, Lj/a/a/a/a;->b:Lj/a/a/a/i;

    iget-object p1, p1, Lj/a/a/a/i;->a:Landroid/hardware/Camera;

    invoke-virtual {p1, v0}, Landroid/hardware/Camera;->setParameters(Landroid/hardware/Camera$Parameters;)V

    :cond_3
    return-void
.end method

.method public setIsBorderCornerRounded(Z)V
    .locals 1

    .line 1
    iput-boolean p1, p0, Lj/a/a/a/a;->p:Z

    .line 2
    iget-object v0, p0, Lj/a/a/a/a;->d:Lj/a/a/a/k;

    invoke-interface {v0, p1}, Lj/a/a/a/k;->setBorderCornerRounded(Z)V

    .line 3
    iget-object p1, p0, Lj/a/a/a/a;->d:Lj/a/a/a/k;

    invoke-interface {p1}, Lj/a/a/a/k;->a()V

    return-void
.end method

.method public setLaserColor(I)V
    .locals 1

    .line 1
    iput p1, p0, Lj/a/a/a/a;->k:I

    .line 2
    iget-object v0, p0, Lj/a/a/a/a;->d:Lj/a/a/a/k;

    invoke-interface {v0, p1}, Lj/a/a/a/k;->setLaserColor(I)V

    .line 3
    iget-object p1, p0, Lj/a/a/a/a;->d:Lj/a/a/a/k;

    invoke-interface {p1}, Lj/a/a/a/k;->a()V

    return-void
.end method

.method public setLaserEnabled(Z)V
    .locals 1

    .line 1
    iput-boolean p1, p0, Lj/a/a/a/a;->j:Z

    .line 2
    iget-object v0, p0, Lj/a/a/a/a;->d:Lj/a/a/a/k;

    invoke-interface {v0, p1}, Lj/a/a/a/k;->setLaserEnabled(Z)V

    .line 3
    iget-object p1, p0, Lj/a/a/a/a;->d:Lj/a/a/a/k;

    invoke-interface {p1}, Lj/a/a/a/k;->a()V

    return-void
.end method

.method public setMaskColor(I)V
    .locals 1

    .line 1
    iput p1, p0, Lj/a/a/a/a;->m:I

    .line 2
    iget-object v0, p0, Lj/a/a/a/a;->d:Lj/a/a/a/k;

    invoke-interface {v0, p1}, Lj/a/a/a/k;->setMaskColor(I)V

    .line 3
    iget-object p1, p0, Lj/a/a/a/a;->d:Lj/a/a/a/k;

    invoke-interface {p1}, Lj/a/a/a/k;->a()V

    return-void
.end method

.method public setShouldScaleToFill(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lj/a/a/a/a;->i:Z

    return-void
.end method

.method public setSquareViewFinder(Z)V
    .locals 1

    .line 1
    iput-boolean p1, p0, Lj/a/a/a/a;->r:Z

    .line 2
    iget-object v0, p0, Lj/a/a/a/a;->d:Lj/a/a/a/k;

    invoke-interface {v0, p1}, Lj/a/a/a/k;->setSquareViewFinder(Z)V

    .line 3
    iget-object p1, p0, Lj/a/a/a/a;->d:Lj/a/a/a/k;

    invoke-interface {p1}, Lj/a/a/a/k;->a()V

    return-void
.end method

.method public setupCameraPreview(Lj/a/a/a/i;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lj/a/a/a/a;->b:Lj/a/a/a/i;

    if-eqz p1, :cond_1

    .line 2
    invoke-virtual {p0, p1}, Lj/a/a/a/a;->setupLayout(Lj/a/a/a/i;)V

    .line 3
    iget-object p1, p0, Lj/a/a/a/a;->d:Lj/a/a/a/k;

    invoke-interface {p1}, Lj/a/a/a/k;->a()V

    .line 4
    iget-object p1, p0, Lj/a/a/a/a;->g:Ljava/lang/Boolean;

    if-eqz p1, :cond_0

    .line 5
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {p0, p1}, Lj/a/a/a/a;->setFlash(Z)V

    .line 6
    :cond_0
    iget-boolean p1, p0, Lj/a/a/a/a;->h:Z

    invoke-virtual {p0, p1}, Lj/a/a/a/a;->setAutoFocus(Z)V

    :cond_1
    return-void
.end method

.method public final setupLayout(Lj/a/a/a/i;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->removeAllViews()V

    .line 2
    new-instance v0, Lj/a/a/a/g;

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p1, p0}, Lj/a/a/a/g;-><init>(Landroid/content/Context;Lj/a/a/a/i;Landroid/hardware/Camera$PreviewCallback;)V

    iput-object v0, p0, Lj/a/a/a/a;->c:Lj/a/a/a/g;

    .line 3
    iget p1, p0, Lj/a/a/a/a;->u:F

    invoke-virtual {v0, p1}, Lj/a/a/a/g;->setAspectTolerance(F)V

    .line 4
    iget-object p1, p0, Lj/a/a/a/a;->c:Lj/a/a/a/g;

    iget-boolean v0, p0, Lj/a/a/a/a;->i:Z

    invoke-virtual {p1, v0}, Lj/a/a/a/g;->setShouldScaleToFill(Z)V

    .line 5
    iget-boolean p1, p0, Lj/a/a/a/a;->i:Z

    if-nez p1, :cond_0

    .line 6
    new-instance p1, Landroid/widget/RelativeLayout;

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    const/16 v0, 0x11

    .line 7
    invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout;->setGravity(I)V

    const/high16 v0, -0x1000000

    .line 8
    invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V

    .line 9
    iget-object v0, p0, Lj/a/a/a/a;->c:Lj/a/a/a/g;

    invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    .line 10
    invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    goto :goto_0

    .line 11
    :cond_0
    iget-object p1, p0, Lj/a/a/a/a;->c:Lj/a/a/a/g;

    invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 12
    :goto_0
    iget-object p1, p0, Lj/a/a/a/a;->d:Lj/a/a/a/k;

    instance-of v0, p1, Landroid/view/View;

    if-eqz v0, :cond_1

    .line 13
    check-cast p1, Landroid/view/View;

    invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    return-void

    .line 14
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "IViewFinder object returned by \'createViewFinderView()\' should be instance of android.view.View"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
