.class public Lc/w/a/a/g;
.super Lc/w/a/a/m;
.source "SourceFile"

# interfaces
.implements Lc/w/a/a/c;


# instance fields
.field public c:Lc/w/a/a/e;

.field public d:Landroid/content/Context;

.field public e:Landroid/animation/ArgbEvaluator;

.field public final f:Landroid/graphics/drawable/Drawable$Callback;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0, v0, v0}, Lc/w/a/a/g;-><init>(Landroid/content/Context;Lc/w/a/a/e;Landroid/content/res/Resources;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, v0, v0}, Lc/w/a/a/g;-><init>(Landroid/content/Context;Lc/w/a/a/e;Landroid/content/res/Resources;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lc/w/a/a/e;Landroid/content/res/Resources;)V
    .locals 2

    .line 3
    invoke-direct {p0}, Lc/w/a/a/m;-><init>()V

    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, Lc/w/a/a/g;->e:Landroid/animation/ArgbEvaluator;

    .line 5
    new-instance v0, Lc/w/a/a/d;

    invoke-direct {v0, p0}, Lc/w/a/a/d;-><init>(Lc/w/a/a/g;)V

    iput-object v0, p0, Lc/w/a/a/g;->f:Landroid/graphics/drawable/Drawable$Callback;

    .line 6
    iput-object p1, p0, Lc/w/a/a/g;->d:Landroid/content/Context;

    if-eqz p2, :cond_0

    .line 7
    iput-object p2, p0, Lc/w/a/a/g;->c:Lc/w/a/a/e;

    goto :goto_0

    .line 8
    :cond_0
    new-instance v0, Lc/w/a/a/e;

    iget-object v1, p0, Lc/w/a/a/g;->f:Landroid/graphics/drawable/Drawable$Callback;

    invoke-direct {v0, p1, p2, v1, p3}, Lc/w/a/a/e;-><init>(Landroid/content/Context;Lc/w/a/a/e;Landroid/graphics/drawable/Drawable$Callback;Landroid/content/res/Resources;)V

    iput-object v0, p0, Lc/w/a/a/g;->c:Lc/w/a/a/e;

    :goto_0
    return-void
.end method

.method public static a(Landroid/content/Context;Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)Lc/w/a/a/g;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    new-instance v0, Lc/w/a/a/g;

    invoke-direct {v0, p0}, Lc/w/a/a/g;-><init>(Landroid/content/Context;)V

    .line 2
    invoke-virtual {v0, p1, p2, p3, p4}, Lc/w/a/a/g;->inflate(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V

    return-object v0
.end method


# virtual methods
.method public final a(Landroid/animation/Animator;)V
    .locals 3

    .line 3
    instance-of v0, p1, Landroid/animation/AnimatorSet;

    if-eqz v0, :cond_0

    .line 4
    move-object v0, p1

    check-cast v0, Landroid/animation/AnimatorSet;

    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->getChildAnimations()Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 5
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    .line 6
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/animation/Animator;

    invoke-virtual {p0, v2}, Lc/w/a/a/g;->a(Landroid/animation/Animator;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 7
    :cond_0
    instance-of v0, p1, Landroid/animation/ObjectAnimator;

    if-eqz v0, :cond_3

    .line 8
    check-cast p1, Landroid/animation/ObjectAnimator;

    .line 9
    invoke-virtual {p1}, Landroid/animation/ObjectAnimator;->getPropertyName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "fillColor"

    .line 10
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "strokeColor"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 11
    :cond_1
    iget-object v0, p0, Lc/w/a/a/g;->e:Landroid/animation/ArgbEvaluator;

    if-nez v0, :cond_2

    .line 12
    new-instance v0, Landroid/animation/ArgbEvaluator;

    invoke-direct {v0}, Landroid/animation/ArgbEvaluator;-><init>()V

    iput-object v0, p0, Lc/w/a/a/g;->e:Landroid/animation/ArgbEvaluator;

    .line 13
    :cond_2
    iget-object v0, p0, Lc/w/a/a/g;->e:Landroid/animation/ArgbEvaluator;

    invoke-virtual {p1, v0}, Landroid/animation/ObjectAnimator;->setEvaluator(Landroid/animation/TypeEvaluator;)V

    :cond_3
    return-void
.end method

.method public final a(Ljava/lang/String;Landroid/animation/Animator;)V
    .locals 2

    .line 14
    iget-object v0, p0, Lc/w/a/a/g;->c:Lc/w/a/a/e;

    iget-object v0, v0, Lc/w/a/a/e;->b:Lc/w/a/a/w;

    invoke-virtual {v0, p1}, Lc/w/a/a/w;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    .line 15
    invoke-virtual {p2, v0}, Landroid/animation/Animator;->setTarget(Ljava/lang/Object;)V

    .line 16
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-ge v0, v1, :cond_0

    .line 17
    invoke-virtual {p0, p2}, Lc/w/a/a/g;->a(Landroid/animation/Animator;)V

    .line 18
    :cond_0
    iget-object v0, p0, Lc/w/a/a/g;->c:Lc/w/a/a/e;

    iget-object v1, v0, Lc/w/a/a/e;->d:Ljava/util/ArrayList;

    if-nez v1, :cond_1

    .line 19
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, Lc/w/a/a/e;->d:Ljava/util/ArrayList;

    .line 20
    iget-object v0, p0, Lc/w/a/a/g;->c:Lc/w/a/a/e;

    new-instance v1, Lc/e/b;

    invoke-direct {v1}, Lc/e/b;-><init>()V

    iput-object v1, v0, Lc/w/a/a/e;->e:Lc/e/b;

    .line 21
    :cond_1
    iget-object v0, p0, Lc/w/a/a/g;->c:Lc/w/a/a/e;

    iget-object v0, v0, Lc/w/a/a/e;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 22
    iget-object v0, p0, Lc/w/a/a/g;->c:Lc/w/a/a/e;

    iget-object v0, v0, Lc/w/a/a/e;->e:Lc/e/b;

    invoke-virtual {v0, p2, p1}, Lc/e/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public applyTheme(Landroid/content/res/Resources$Theme;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/w/a/a/m;->b:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 2
    invoke-static {v0, p1}, Lc/h/g/r/a;->a(Landroid/graphics/drawable/Drawable;Landroid/content/res/Resources$Theme;)V

    :cond_0
    return-void
.end method

.method public canApplyTheme()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lc/w/a/a/m;->b:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 2
    invoke-static {v0}, Lc/h/g/r/a;->a(Landroid/graphics/drawable/Drawable;)Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/w/a/a/m;->b:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    return-void

    .line 3
    :cond_0
    iget-object v0, p0, Lc/w/a/a/g;->c:Lc/w/a/a/e;

    iget-object v0, v0, Lc/w/a/a/e;->b:Lc/w/a/a/w;

    invoke-virtual {v0, p1}, Lc/w/a/a/w;->draw(Landroid/graphics/Canvas;)V

    .line 4
    iget-object p1, p0, Lc/w/a/a/g;->c:Lc/w/a/a/e;

    iget-object p1, p1, Lc/w/a/a/e;->c:Landroid/animation/AnimatorSet;

    invoke-virtual {p1}, Landroid/animation/AnimatorSet;->isStarted()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 5
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    :cond_1
    return-void
.end method

.method public getAlpha()I
    .locals 1

    .line 1
    iget-object v0, p0, Lc/w/a/a/m;->b:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 2
    invoke-static {v0}, Lc/h/g/r/a;->b(Landroid/graphics/drawable/Drawable;)I

    move-result v0

    return v0

    .line 3
    :cond_0
    iget-object v0, p0, Lc/w/a/a/g;->c:Lc/w/a/a/e;

    iget-object v0, v0, Lc/w/a/a/e;->b:Lc/w/a/a/w;

    invoke-virtual {v0}, Lc/w/a/a/w;->getAlpha()I

    move-result v0

    return v0
.end method

.method public getChangingConfigurations()I
    .locals 2

    .line 1
    iget-object v0, p0, Lc/w/a/a/m;->b:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getChangingConfigurations()I

    move-result v0

    return v0

    .line 3
    :cond_0
    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->getChangingConfigurations()I

    move-result v0

    iget-object v1, p0, Lc/w/a/a/g;->c:Lc/w/a/a/e;

    iget v1, v1, Lc/w/a/a/e;->a:I

    or-int/2addr v0, v1

    return v0
.end method

.method public getColorFilter()Landroid/graphics/ColorFilter;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/w/a/a/m;->b:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 2
    invoke-static {v0}, Lc/h/g/r/a;->c(Landroid/graphics/drawable/Drawable;)Landroid/graphics/ColorFilter;

    move-result-object v0

    return-object v0

    .line 3
    :cond_0
    iget-object v0, p0, Lc/w/a/a/g;->c:Lc/w/a/a/e;

    iget-object v0, v0, Lc/w/a/a/e;->b:Lc/w/a/a/w;

    invoke-virtual {v0}, Lc/w/a/a/w;->getColorFilter()Landroid/graphics/ColorFilter;

    move-result-object v0

    return-object v0
.end method

.method public getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;
    .locals 2

    .line 1
    iget-object v0, p0, Lc/w/a/a/m;->b:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_0

    .line 2
    new-instance v0, Lc/w/a/a/f;

    iget-object v1, p0, Lc/w/a/a/m;->b:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    move-result-object v1

    invoke-direct {v0, v1}, Lc/w/a/a/f;-><init>(Landroid/graphics/drawable/Drawable$ConstantState;)V

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getIntrinsicHeight()I
    .locals 1

    .line 1
    iget-object v0, p0, Lc/w/a/a/m;->b:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v0

    return v0

    .line 3
    :cond_0
    iget-object v0, p0, Lc/w/a/a/g;->c:Lc/w/a/a/e;

    iget-object v0, v0, Lc/w/a/a/e;->b:Lc/w/a/a/w;

    invoke-virtual {v0}, Lc/w/a/a/w;->getIntrinsicHeight()I

    move-result v0

    return v0
.end method

.method public getIntrinsicWidth()I
    .locals 1

    .line 1
    iget-object v0, p0, Lc/w/a/a/m;->b:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    return v0

    .line 3
    :cond_0
    iget-object v0, p0, Lc/w/a/a/g;->c:Lc/w/a/a/e;

    iget-object v0, v0, Lc/w/a/a/e;->b:Lc/w/a/a/w;

    invoke-virtual {v0}, Lc/w/a/a/w;->getIntrinsicWidth()I

    move-result v0

    return v0
.end method

.method public getOpacity()I
    .locals 1

    .line 1
    iget-object v0, p0, Lc/w/a/a/m;->b:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getOpacity()I

    move-result v0

    return v0

    .line 3
    :cond_0
    iget-object v0, p0, Lc/w/a/a/g;->c:Lc/w/a/a/e;

    iget-object v0, v0, Lc/w/a/a/e;->b:Lc/w/a/a/w;

    invoke-virtual {v0}, Lc/w/a/a/w;->getOpacity()I

    move-result v0

    return v0
.end method

.method public inflate(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 31
    invoke-virtual {p0, p1, p2, p3, v0}, Lc/w/a/a/g;->inflate(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V

    return-void
.end method

.method public inflate(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lc/w/a/a/m;->b:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 2
    invoke-static {v0, p1, p2, p3, p4}, Lc/h/g/r/a;->a(Landroid/graphics/drawable/Drawable;Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V

    return-void

    .line 3
    :cond_0
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v0

    .line 4
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v1

    const/4 v2, 0x1

    add-int/2addr v1, v2

    :goto_0
    if-eq v0, v2, :cond_8

    .line 5
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v3

    if-ge v3, v1, :cond_1

    const/4 v3, 0x3

    if-eq v0, v3, :cond_8

    :cond_1
    const/4 v3, 0x2

    if-ne v0, v3, :cond_7

    .line 6
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v3, "animated-vector"

    .line 7
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_4

    .line 8
    sget-object v0, Lc/w/a/a/a;->e:[I

    .line 9
    invoke-static {p1, p4, p3, v0}, Lc/h/f/i/t;->a(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 10
    invoke-virtual {v0, v4, v4}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    if-eqz v3, :cond_3

    .line 11
    invoke-static {p1, v3, p4}, Lc/w/a/a/w;->a(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)Lc/w/a/a/w;

    move-result-object v3

    .line 12
    invoke-virtual {v3, v4}, Lc/w/a/a/w;->a(Z)V

    .line 13
    iget-object v4, p0, Lc/w/a/a/g;->f:Landroid/graphics/drawable/Drawable$Callback;

    invoke-virtual {v3, v4}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 14
    iget-object v4, p0, Lc/w/a/a/g;->c:Lc/w/a/a/e;

    iget-object v4, v4, Lc/w/a/a/e;->b:Lc/w/a/a/w;

    if-eqz v4, :cond_2

    const/4 v5, 0x0

    .line 15
    invoke-virtual {v4, v5}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 16
    :cond_2
    iget-object v4, p0, Lc/w/a/a/g;->c:Lc/w/a/a/e;

    iput-object v3, v4, Lc/w/a/a/e;->b:Lc/w/a/a/w;

    .line 17
    :cond_3
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    goto :goto_2

    :cond_4
    const-string v3, "target"

    .line 18
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 19
    sget-object v0, Lc/w/a/a/a;->f:[I

    .line 20
    invoke-virtual {p1, p3, v0}, Landroid/content/res/Resources;->obtainAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 21
    invoke-virtual {v0, v4}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 22
    invoke-virtual {v0, v2, v4}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v4

    if-eqz v4, :cond_6

    .line 23
    iget-object v5, p0, Lc/w/a/a/g;->d:Landroid/content/Context;

    if-eqz v5, :cond_5

    .line 24
    invoke-static {v5, v4}, Lc/w/a/a/j;->a(Landroid/content/Context;I)Landroid/animation/Animator;

    move-result-object v4

    .line 25
    invoke-virtual {p0, v3, v4}, Lc/w/a/a/g;->a(Ljava/lang/String;Landroid/animation/Animator;)V

    goto :goto_1

    .line 26
    :cond_5
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 27
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Context can\'t be null when inflating animators"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 28
    :cond_6
    :goto_1
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 29
    :cond_7
    :goto_2
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v0

    goto :goto_0

    .line 30
    :cond_8
    iget-object p1, p0, Lc/w/a/a/g;->c:Lc/w/a/a/e;

    invoke-virtual {p1}, Lc/w/a/a/e;->a()V

    return-void
.end method

.method public isAutoMirrored()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lc/w/a/a/m;->b:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 2
    invoke-static {v0}, Lc/h/g/r/a;->e(Landroid/graphics/drawable/Drawable;)Z

    move-result v0

    return v0

    .line 3
    :cond_0
    iget-object v0, p0, Lc/w/a/a/g;->c:Lc/w/a/a/e;

    iget-object v0, v0, Lc/w/a/a/e;->b:Lc/w/a/a/w;

    invoke-virtual {v0}, Lc/w/a/a/w;->isAutoMirrored()Z

    move-result v0

    return v0
.end method

.method public isRunning()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lc/w/a/a/m;->b:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 2
    check-cast v0, Landroid/graphics/drawable/AnimatedVectorDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimatedVectorDrawable;->isRunning()Z

    move-result v0

    return v0

    .line 3
    :cond_0
    iget-object v0, p0, Lc/w/a/a/g;->c:Lc/w/a/a/e;

    iget-object v0, v0, Lc/w/a/a/e;->c:Landroid/animation/AnimatorSet;

    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->isRunning()Z

    move-result v0

    return v0
.end method

.method public isStateful()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lc/w/a/a/m;->b:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    move-result v0

    return v0

    .line 3
    :cond_0
    iget-object v0, p0, Lc/w/a/a/g;->c:Lc/w/a/a/e;

    iget-object v0, v0, Lc/w/a/a/e;->b:Lc/w/a/a/w;

    invoke-virtual {v0}, Lc/w/a/a/w;->isStateful()Z

    move-result v0

    return v0
.end method

.method public mutate()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/w/a/a/m;->b:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    :cond_0
    return-object p0
.end method

.method public onBoundsChange(Landroid/graphics/Rect;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/w/a/a/m;->b:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    return-void

    .line 3
    :cond_0
    iget-object v0, p0, Lc/w/a/a/g;->c:Lc/w/a/a/e;

    iget-object v0, v0, Lc/w/a/a/e;->b:Lc/w/a/a/w;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    return-void
.end method

.method public onLevelChange(I)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lc/w/a/a/m;->b:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setLevel(I)Z

    move-result p1

    return p1

    .line 3
    :cond_0
    iget-object v0, p0, Lc/w/a/a/g;->c:Lc/w/a/a/e;

    iget-object v0, v0, Lc/w/a/a/e;->b:Lc/w/a/a/w;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setLevel(I)Z

    move-result p1

    return p1
.end method

.method public onStateChange([I)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lc/w/a/a/m;->b:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    move-result p1

    return p1

    .line 3
    :cond_0
    iget-object v0, p0, Lc/w/a/a/g;->c:Lc/w/a/a/e;

    iget-object v0, v0, Lc/w/a/a/e;->b:Lc/w/a/a/w;

    invoke-virtual {v0, p1}, Lc/w/a/a/m;->setState([I)Z

    move-result p1

    return p1
.end method

.method public setAlpha(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/w/a/a/m;->b:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    return-void

    .line 3
    :cond_0
    iget-object v0, p0, Lc/w/a/a/g;->c:Lc/w/a/a/e;

    iget-object v0, v0, Lc/w/a/a/e;->b:Lc/w/a/a/w;

    invoke-virtual {v0, p1}, Lc/w/a/a/w;->setAlpha(I)V

    return-void
.end method

.method public setAutoMirrored(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/w/a/a/m;->b:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 2
    invoke-static {v0, p1}, Lc/h/g/r/a;->a(Landroid/graphics/drawable/Drawable;Z)V

    return-void

    .line 3
    :cond_0
    iget-object v0, p0, Lc/w/a/a/g;->c:Lc/w/a/a/e;

    iget-object v0, v0, Lc/w/a/a/e;->b:Lc/w/a/a/w;

    invoke-virtual {v0, p1}, Lc/w/a/a/w;->setAutoMirrored(Z)V

    return-void
.end method

.method public setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/w/a/a/m;->b:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    return-void

    .line 3
    :cond_0
    iget-object v0, p0, Lc/w/a/a/g;->c:Lc/w/a/a/e;

    iget-object v0, v0, Lc/w/a/a/e;->b:Lc/w/a/a/w;

    invoke-virtual {v0, p1}, Lc/w/a/a/w;->setColorFilter(Landroid/graphics/ColorFilter;)V

    return-void
.end method

.method public setTint(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/w/a/a/m;->b:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 2
    invoke-static {v0, p1}, Lc/h/g/r/a;->b(Landroid/graphics/drawable/Drawable;I)V

    return-void

    .line 3
    :cond_0
    iget-object v0, p0, Lc/w/a/a/g;->c:Lc/w/a/a/e;

    iget-object v0, v0, Lc/w/a/a/e;->b:Lc/w/a/a/w;

    invoke-virtual {v0, p1}, Lc/w/a/a/w;->setTint(I)V

    return-void
.end method

.method public setTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/w/a/a/m;->b:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 2
    invoke-static {v0, p1}, Lc/h/g/r/a;->a(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    return-void

    .line 3
    :cond_0
    iget-object v0, p0, Lc/w/a/a/g;->c:Lc/w/a/a/e;

    iget-object v0, v0, Lc/w/a/a/e;->b:Lc/w/a/a/w;

    invoke-virtual {v0, p1}, Lc/w/a/a/w;->setTintList(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public setTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/w/a/a/m;->b:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 2
    invoke-static {v0, p1}, Lc/h/g/r/a;->a(Landroid/graphics/drawable/Drawable;Landroid/graphics/PorterDuff$Mode;)V

    return-void

    .line 3
    :cond_0
    iget-object v0, p0, Lc/w/a/a/g;->c:Lc/w/a/a/e;

    iget-object v0, v0, Lc/w/a/a/e;->b:Lc/w/a/a/w;

    invoke-virtual {v0, p1}, Lc/w/a/a/w;->setTintMode(Landroid/graphics/PorterDuff$Mode;)V

    return-void
.end method

.method public setVisible(ZZ)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lc/w/a/a/m;->b:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1, p2}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    move-result p1

    return p1

    .line 3
    :cond_0
    iget-object v0, p0, Lc/w/a/a/g;->c:Lc/w/a/a/e;

    iget-object v0, v0, Lc/w/a/a/e;->b:Lc/w/a/a/w;

    invoke-virtual {v0, p1, p2}, Lc/w/a/a/w;->setVisible(ZZ)Z

    .line 4
    invoke-super {p0, p1, p2}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    move-result p1

    return p1
.end method

.method public start()V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/w/a/a/m;->b:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 2
    check-cast v0, Landroid/graphics/drawable/AnimatedVectorDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimatedVectorDrawable;->start()V

    return-void

    .line 3
    :cond_0
    iget-object v0, p0, Lc/w/a/a/g;->c:Lc/w/a/a/e;

    iget-object v0, v0, Lc/w/a/a/e;->c:Landroid/animation/AnimatorSet;

    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->isStarted()Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    .line 4
    :cond_1
    iget-object v0, p0, Lc/w/a/a/g;->c:Lc/w/a/a/e;

    iget-object v0, v0, Lc/w/a/a/e;->c:Landroid/animation/AnimatorSet;

    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->start()V

    .line 5
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method

.method public stop()V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/w/a/a/m;->b:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 2
    check-cast v0, Landroid/graphics/drawable/AnimatedVectorDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimatedVectorDrawable;->stop()V

    return-void

    .line 3
    :cond_0
    iget-object v0, p0, Lc/w/a/a/g;->c:Lc/w/a/a/e;

    iget-object v0, v0, Lc/w/a/a/e;->c:Landroid/animation/AnimatorSet;

    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->end()V

    return-void
.end method
