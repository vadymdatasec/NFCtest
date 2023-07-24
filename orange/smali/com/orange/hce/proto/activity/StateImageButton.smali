.class public Lcom/orange/hce/proto/activity/StateImageButton;
.super Lc/b/q/v;
.source "SourceFile"


# instance fields
.field public d:Ljava/lang/Boolean;

.field public e:Landroid/graphics/drawable/Drawable;

.field public f:Landroid/graphics/drawable/Drawable;

.field public g:Landroid/graphics/drawable/Drawable;

.field public h:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/orange/hce/proto/activity/StateImageButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 2
    invoke-direct {p0, p1, p2}, Lc/b/q/v;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, 0x0

    .line 3
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/orange/hce/proto/activity/StateImageButton;->d:Ljava/lang/Boolean;

    const/4 v0, 0x1

    .line 4
    iput-boolean v0, p0, Lcom/orange/hce/proto/activity/StateImageButton;->h:Z

    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/orange/hce/proto/activity/StateImageButton;->a(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 6
    invoke-virtual {p0, v0}, Lcom/orange/hce/proto/activity/StateImageButton;->setActivated(Z)V

    .line 7
    iget-boolean p1, p0, Lcom/orange/hce/proto/activity/StateImageButton;->h:Z

    if-eqz p1, :cond_0

    .line 8
    new-instance p1, Le/h/b/a/l/s0;

    invoke-direct {p1, p0}, Le/h/b/a/l/s0;-><init>(Lcom/orange/hce/proto/activity/StateImageButton;)V

    invoke-super {p0, p1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 9
    invoke-direct {p0, p1, p2, p3}, Lc/b/q/v;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p1, 0x0

    .line 10
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Lcom/orange/hce/proto/activity/StateImageButton;->d:Ljava/lang/Boolean;

    const/4 p1, 0x1

    .line 11
    iput-boolean p1, p0, Lcom/orange/hce/proto/activity/StateImageButton;->h:Z

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 6
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iget-object v1, p0, Lcom/orange/hce/proto/activity/StateImageButton;->d:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 7
    iget-object v0, p0, Lcom/orange/hce/proto/activity/StateImageButton;->e:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0, v0}, Lc/b/q/v;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/orange/hce/proto/activity/StateImageButton;->f:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0, v0}, Lc/b/q/v;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :goto_0
    return-void
.end method

.method public final a(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 9
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p1

    sget-object v0, Le/h/b/a/i;->StateImageButton:[I

    const/4 v1, 0x0

    invoke-virtual {p1, p2, v0, v1, v1}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 10
    :try_start_0
    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    iput-object p2, p0, Lcom/orange/hce/proto/activity/StateImageButton;->e:Landroid/graphics/drawable/Drawable;

    const/4 p2, 0x2

    const/4 v0, 0x1

    .line 11
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/orange/hce/proto/activity/StateImageButton;->h:Z

    const/4 p2, 0x3

    .line 12
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    iput-object p2, p0, Lcom/orange/hce/proto/activity/StateImageButton;->f:Landroid/graphics/drawable/Drawable;

    .line 13
    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    iput-object p2, p0, Lcom/orange/hce/proto/activity/StateImageButton;->g:Landroid/graphics/drawable/Drawable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void

    :catchall_0
    move-exception p2

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 15
    throw p2
.end method

.method public synthetic a(Landroid/view/View$OnClickListener;Landroid/view/View;)V
    .locals 1

    .line 3
    invoke-virtual {p0}, Landroid/widget/ImageButton;->isActivated()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    move-object v0, p2

    check-cast v0, Lcom/orange/hce/proto/activity/StateImageButton;

    invoke-virtual {v0}, Lcom/orange/hce/proto/activity/StateImageButton;->b()V

    .line 5
    invoke-interface {p1, p2}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method public synthetic a(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/widget/ImageButton;->isActivated()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/orange/hce/proto/activity/StateImageButton;->b()V

    :cond_0
    return-void
.end method

.method public final b()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/orange/hce/proto/activity/StateImageButton;->d:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/orange/hce/proto/activity/StateImageButton;->d:Ljava/lang/Boolean;

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "active "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/orange/hce/proto/activity/StateImageButton;->d:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "StateButton"

    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    invoke-virtual {p0}, Lcom/orange/hce/proto/activity/StateImageButton;->a()V

    return-void
.end method

.method public getActive()Ljava/lang/Boolean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/orange/hce/proto/activity/StateImageButton;->d:Ljava/lang/Boolean;

    return-object v0
.end method

.method public setActivated(Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/widget/ImageButton;->setActivated(Z)V

    if-nez p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/orange/hce/proto/activity/StateImageButton;->g:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0, p1}, Lc/b/q/v;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    return-void
.end method

.method public setActive(Ljava/lang/Boolean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/orange/hce/proto/activity/StateImageButton;->d:Ljava/lang/Boolean;

    .line 2
    invoke-virtual {p0}, Lcom/orange/hce/proto/activity/StateImageButton;->a()V

    return-void
.end method

.method public setOnClickListener(Landroid/view/View$OnClickListener;)V
    .locals 1

    .line 1
    new-instance v0, Le/h/b/a/l/r0;

    invoke-direct {v0, p0, p1}, Le/h/b/a/l/r0;-><init>(Lcom/orange/hce/proto/activity/StateImageButton;Landroid/view/View$OnClickListener;)V

    invoke-super {p0, v0}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public setOnClickListenerWitoutChangingState(Landroid/view/View$OnClickListener;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method
