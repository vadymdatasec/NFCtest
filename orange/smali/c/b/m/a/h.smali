.class public Lc/b/m/a/h;
.super Lc/b/m/a/o;
.source "SourceFile"

# interfaces
.implements Lc/h/g/r/b;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "RestrictedAPI"
    }
.end annotation


# instance fields
.field public p:Lc/b/m/a/c;

.field public q:Lc/b/m/a/g;

.field public r:I

.field public s:I

.field public t:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Lc/b/m/a/h;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0, v0}, Lc/b/m/a/h;-><init>(Lc/b/m/a/c;Landroid/content/res/Resources;)V

    return-void
.end method

.method public constructor <init>(Lc/b/m/a/c;Landroid/content/res/Resources;)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lc/b/m/a/o;-><init>(Lc/b/m/a/n;)V

    const/4 v0, -0x1

    .line 3
    iput v0, p0, Lc/b/m/a/h;->r:I

    .line 4
    iput v0, p0, Lc/b/m/a/h;->s:I

    .line 5
    new-instance v0, Lc/b/m/a/c;

    invoke-direct {v0, p1, p0, p2}, Lc/b/m/a/c;-><init>(Lc/b/m/a/c;Lc/b/m/a/h;Landroid/content/res/Resources;)V

    .line 6
    invoke-virtual {p0, v0}, Lc/b/m/a/h;->a(Lc/b/m/a/k;)V

    .line 7
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    move-result-object p1

    invoke-virtual {p0, p1}, Lc/b/m/a/h;->onStateChange([I)Z

    .line 8
    invoke-virtual {p0}, Lc/b/m/a/h;->jumpToCurrentState()V

    return-void
.end method

.method public static e(Landroid/content/Context;Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)Lc/b/m/a/h;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/xmlpull/v1/XmlPullParserException;
        }
    .end annotation

    .line 1
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "animated-selector"

    .line 2
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 3
    new-instance v0, Lc/b/m/a/h;

    invoke-direct {v0}, Lc/b/m/a/h;-><init>()V

    move-object v2, v0

    move-object v3, p0

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    move-object v7, p4

    .line 4
    invoke-virtual/range {v2 .. v7}, Lc/b/m/a/h;->a(Landroid/content/Context;Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V

    return-object v0

    .line 5
    :cond_0
    new-instance p0, Lorg/xmlpull/v1/XmlPullParserException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getPositionDescription()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, ": invalid animated-selector tag "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public a()Lc/b/m/a/c;
    .locals 3

    .line 25
    new-instance v0, Lc/b/m/a/c;

    iget-object v1, p0, Lc/b/m/a/h;->p:Lc/b/m/a/c;

    const/4 v2, 0x0

    invoke-direct {v0, v1, p0, v2}, Lc/b/m/a/c;-><init>(Lc/b/m/a/c;Lc/b/m/a/h;Landroid/content/res/Resources;)V

    return-object v0
.end method

.method public bridge synthetic a()Lc/b/m/a/k;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lc/b/m/a/h;->a()Lc/b/m/a/c;

    move-result-object v0

    return-object v0
.end method

.method public a(Landroid/content/Context;Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 2
    sget-object v0, Lc/b/n/b;->AnimatedStateListDrawableCompat:[I

    invoke-static {p2, p5, p4, v0}, Lc/h/f/i/t;->a(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 3
    sget v1, Lc/b/n/b;->AnimatedStateListDrawableCompat_android_visible:I

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    invoke-virtual {p0, v1, v2}, Lc/b/m/a/h;->setVisible(ZZ)Z

    .line 4
    invoke-virtual {p0, v0}, Lc/b/m/a/h;->a(Landroid/content/res/TypedArray;)V

    .line 5
    invoke-virtual {p0, p2}, Lc/b/m/a/l;->a(Landroid/content/res/Resources;)V

    .line 6
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 7
    invoke-virtual/range {p0 .. p5}, Lc/b/m/a/h;->b(Landroid/content/Context;Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V

    .line 8
    invoke-virtual {p0}, Lc/b/m/a/h;->d()V

    return-void
.end method

.method public final a(Landroid/content/res/TypedArray;)V
    .locals 3

    .line 9
    iget-object v0, p0, Lc/b/m/a/h;->p:Lc/b/m/a/c;

    .line 10
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x15

    if-lt v1, v2, :cond_0

    .line 11
    iget v1, v0, Lc/b/m/a/k;->d:I

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    move-result v2

    or-int/2addr v1, v2

    iput v1, v0, Lc/b/m/a/k;->d:I

    .line 12
    :cond_0
    sget v1, Lc/b/n/b;->AnimatedStateListDrawableCompat_android_variablePadding:I

    iget-boolean v2, v0, Lc/b/m/a/k;->i:Z

    .line 13
    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    .line 14
    invoke-virtual {v0, v1}, Lc/b/m/a/k;->b(Z)V

    .line 15
    sget v1, Lc/b/n/b;->AnimatedStateListDrawableCompat_android_constantSize:I

    iget-boolean v2, v0, Lc/b/m/a/k;->l:Z

    .line 16
    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    .line 17
    invoke-virtual {v0, v1}, Lc/b/m/a/k;->a(Z)V

    .line 18
    sget v1, Lc/b/n/b;->AnimatedStateListDrawableCompat_android_enterFadeDuration:I

    iget v2, v0, Lc/b/m/a/k;->A:I

    .line 19
    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v1

    .line 20
    invoke-virtual {v0, v1}, Lc/b/m/a/k;->b(I)V

    .line 21
    sget v1, Lc/b/n/b;->AnimatedStateListDrawableCompat_android_exitFadeDuration:I

    iget v2, v0, Lc/b/m/a/k;->B:I

    .line 22
    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v1

    .line 23
    invoke-virtual {v0, v1}, Lc/b/m/a/k;->c(I)V

    .line 24
    sget v1, Lc/b/n/b;->AnimatedStateListDrawableCompat_android_dither:I

    iget-boolean v0, v0, Lc/b/m/a/k;->x:Z

    invoke-virtual {p1, v1, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p1

    invoke-virtual {p0, p1}, Lc/b/m/a/l;->setDither(Z)V

    return-void
.end method

.method public a(Lc/b/m/a/k;)V
    .locals 1

    .line 26
    invoke-super {p0, p1}, Lc/b/m/a/o;->a(Lc/b/m/a/k;)V

    .line 27
    instance-of v0, p1, Lc/b/m/a/c;

    if-eqz v0, :cond_0

    .line 28
    check-cast p1, Lc/b/m/a/c;

    iput-object p1, p0, Lc/b/m/a/h;->p:Lc/b/m/a/c;

    :cond_0
    return-void
.end method

.method public final b(Landroid/content/Context;Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 31
    invoke-interface {p3}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v0

    const/4 v1, 0x1

    add-int/2addr v0, v1

    .line 32
    :cond_0
    :goto_0
    invoke-interface {p3}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v2

    if-eq v2, v1, :cond_5

    .line 33
    invoke-interface {p3}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v3

    if-ge v3, v0, :cond_1

    const/4 v4, 0x3

    if-eq v2, v4, :cond_5

    :cond_1
    const/4 v4, 0x2

    if-eq v2, v4, :cond_2

    goto :goto_0

    :cond_2
    if-le v3, v0, :cond_3

    goto :goto_0

    .line 34
    :cond_3
    invoke-interface {p3}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "item"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 35
    invoke-virtual/range {p0 .. p5}, Lc/b/m/a/h;->c(Landroid/content/Context;Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)I

    goto :goto_0

    .line 36
    :cond_4
    invoke-interface {p3}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "transition"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 37
    invoke-virtual/range {p0 .. p5}, Lc/b/m/a/h;->d(Landroid/content/Context;Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)I

    goto :goto_0

    :cond_5
    return-void
.end method

.method public final b(I)Z
    .locals 9

    .line 1
    iget-object v0, p0, Lc/b/m/a/h;->q:Lc/b/m/a/g;

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    .line 2
    iget v2, p0, Lc/b/m/a/h;->r:I

    if-ne p1, v2, :cond_0

    return v1

    .line 3
    :cond_0
    iget v2, p0, Lc/b/m/a/h;->s:I

    if-ne p1, v2, :cond_1

    invoke-virtual {v0}, Lc/b/m/a/g;->a()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 4
    invoke-virtual {v0}, Lc/b/m/a/g;->b()V

    .line 5
    iget v0, p0, Lc/b/m/a/h;->s:I

    iput v0, p0, Lc/b/m/a/h;->r:I

    .line 6
    iput p1, p0, Lc/b/m/a/h;->s:I

    return v1

    .line 7
    :cond_1
    iget v2, p0, Lc/b/m/a/h;->r:I

    .line 8
    invoke-virtual {v0}, Lc/b/m/a/g;->d()V

    goto :goto_0

    .line 9
    :cond_2
    invoke-virtual {p0}, Lc/b/m/a/l;->b()I

    move-result v2

    :goto_0
    const/4 v0, 0x0

    .line 10
    iput-object v0, p0, Lc/b/m/a/h;->q:Lc/b/m/a/g;

    const/4 v0, -0x1

    .line 11
    iput v0, p0, Lc/b/m/a/h;->s:I

    .line 12
    iput v0, p0, Lc/b/m/a/h;->r:I

    .line 13
    iget-object v0, p0, Lc/b/m/a/h;->p:Lc/b/m/a/c;

    .line 14
    invoke-virtual {v0, v2}, Lc/b/m/a/c;->d(I)I

    move-result v3

    .line 15
    invoke-virtual {v0, p1}, Lc/b/m/a/c;->d(I)I

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_7

    if-nez v3, :cond_3

    goto :goto_2

    .line 16
    :cond_3
    invoke-virtual {v0, v3, v4}, Lc/b/m/a/c;->c(II)I

    move-result v6

    if-gez v6, :cond_4

    return v5

    .line 17
    :cond_4
    invoke-virtual {v0, v3, v4}, Lc/b/m/a/c;->e(II)Z

    move-result v7

    .line 18
    invoke-virtual {p0, v6}, Lc/b/m/a/l;->a(I)Z

    .line 19
    invoke-virtual {p0}, Lc/b/m/a/l;->getCurrent()Landroid/graphics/drawable/Drawable;

    move-result-object v6

    .line 20
    instance-of v8, v6, Landroid/graphics/drawable/AnimationDrawable;

    if-eqz v8, :cond_5

    .line 21
    invoke-virtual {v0, v3, v4}, Lc/b/m/a/c;->d(II)Z

    move-result v0

    .line 22
    new-instance v3, Lc/b/m/a/e;

    check-cast v6, Landroid/graphics/drawable/AnimationDrawable;

    invoke-direct {v3, v6, v0, v7}, Lc/b/m/a/e;-><init>(Landroid/graphics/drawable/AnimationDrawable;ZZ)V

    goto :goto_1

    .line 23
    :cond_5
    instance-of v0, v6, Lc/w/a/a/g;

    if-eqz v0, :cond_6

    .line 24
    new-instance v3, Lc/b/m/a/d;

    check-cast v6, Lc/w/a/a/g;

    invoke-direct {v3, v6}, Lc/b/m/a/d;-><init>(Lc/w/a/a/g;)V

    goto :goto_1

    .line 25
    :cond_6
    instance-of v0, v6, Landroid/graphics/drawable/Animatable;

    if-eqz v0, :cond_7

    .line 26
    new-instance v3, Lc/b/m/a/b;

    check-cast v6, Landroid/graphics/drawable/Animatable;

    invoke-direct {v3, v6}, Lc/b/m/a/b;-><init>(Landroid/graphics/drawable/Animatable;)V

    .line 27
    :goto_1
    invoke-virtual {v3}, Lc/b/m/a/g;->c()V

    .line 28
    iput-object v3, p0, Lc/b/m/a/h;->q:Lc/b/m/a/g;

    .line 29
    iput v2, p0, Lc/b/m/a/h;->s:I

    .line 30
    iput p1, p0, Lc/b/m/a/h;->r:I

    return v1

    :cond_7
    :goto_2
    return v5
.end method

.method public final c(Landroid/content/Context;Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)I
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    sget-object v0, Lc/b/n/b;->AnimatedStateListDrawableItem:[I

    invoke-static {p2, p5, p4, v0}, Lc/h/f/i/t;->a(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 2
    sget v1, Lc/b/n/b;->AnimatedStateListDrawableItem_android_id:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    .line 3
    sget v2, Lc/b/n/b;->AnimatedStateListDrawableItem_android_drawable:I

    const/4 v3, -0x1

    .line 4
    invoke-virtual {v0, v2, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v2

    if-lez v2, :cond_0

    .line 5
    invoke-static {}, Lc/b/q/z1;->a()Lc/b/q/z1;

    move-result-object v3

    invoke-virtual {v3, p1, v2}, Lc/b/q/z1;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 6
    :goto_0
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 7
    invoke-virtual {p0, p4}, Lc/b/m/a/o;->a(Landroid/util/AttributeSet;)[I

    move-result-object v0

    const-string v2, ": <item> tag requires a \'drawable\' attribute or child tag defining a drawable"

    if-nez p1, :cond_5

    .line 8
    :goto_1
    invoke-interface {p3}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result p1

    const/4 v3, 0x4

    if-ne p1, v3, :cond_1

    goto :goto_1

    :cond_1
    const/4 v3, 0x2

    if-ne p1, v3, :cond_4

    .line 9
    invoke-interface {p3}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object p1

    const-string v3, "vector"

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 10
    invoke-static {p2, p3, p4, p5}, Lc/w/a/a/w;->createFromXmlInner(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)Lc/w/a/a/w;

    move-result-object p1

    goto :goto_2

    .line 11
    :cond_2
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x15

    if-lt p1, v3, :cond_3

    .line 12
    invoke-static {p2, p3, p4, p5}, Landroid/graphics/drawable/Drawable;->createFromXmlInner(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    goto :goto_2

    .line 13
    :cond_3
    invoke-static {p2, p3, p4}, Landroid/graphics/drawable/Drawable;->createFromXmlInner(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    goto :goto_2

    .line 14
    :cond_4
    new-instance p1, Lorg/xmlpull/v1/XmlPullParserException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 15
    invoke-interface {p3}, Lorg/xmlpull/v1/XmlPullParser;->getPositionDescription()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    :goto_2
    if-eqz p1, :cond_6

    .line 16
    iget-object p2, p0, Lc/b/m/a/h;->p:Lc/b/m/a/c;

    invoke-virtual {p2, v0, p1, v1}, Lc/b/m/a/c;->a([ILandroid/graphics/drawable/Drawable;I)I

    move-result p1

    return p1

    .line 17
    :cond_6
    new-instance p1, Lorg/xmlpull/v1/XmlPullParserException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 18
    invoke-interface {p3}, Lorg/xmlpull/v1/XmlPullParser;->getPositionDescription()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final d(Landroid/content/Context;Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xmlpull/v1/XmlPullParserException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 2
    sget-object v0, Lc/b/n/b;->AnimatedStateListDrawableTransition:[I

    invoke-static {p2, p5, p4, v0}, Lc/h/f/i/t;->a(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 3
    sget v1, Lc/b/n/b;->AnimatedStateListDrawableTransition_android_fromId:I

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    .line 4
    sget v3, Lc/b/n/b;->AnimatedStateListDrawableTransition_android_toId:I

    invoke-virtual {v0, v3, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    .line 5
    sget v4, Lc/b/n/b;->AnimatedStateListDrawableTransition_android_drawable:I

    invoke-virtual {v0, v4, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v4

    if-lez v4, :cond_0

    .line 6
    invoke-static {}, Lc/b/q/z1;->a()Lc/b/q/z1;

    move-result-object v5

    invoke-virtual {v5, p1, v4}, Lc/b/q/z1;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    .line 7
    :goto_0
    sget v5, Lc/b/n/b;->AnimatedStateListDrawableTransition_android_reversible:I

    const/4 v6, 0x0

    invoke-virtual {v0, v5, v6}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v5

    .line 8
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    const-string v0, ": <transition> tag requires a \'drawable\' attribute or child tag defining a drawable"

    if-nez v4, :cond_5

    .line 9
    :goto_1
    invoke-interface {p3}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v4

    const/4 v6, 0x4

    if-ne v4, v6, :cond_1

    goto :goto_1

    :cond_1
    const/4 v6, 0x2

    if-ne v4, v6, :cond_4

    .line 10
    invoke-interface {p3}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v4

    const-string v6, "animated-vector"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 11
    invoke-static {p1, p2, p3, p4, p5}, Lc/w/a/a/g;->a(Landroid/content/Context;Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)Lc/w/a/a/g;

    move-result-object v4

    goto :goto_2

    .line 12
    :cond_2
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x15

    if-lt p1, v4, :cond_3

    .line 13
    invoke-static {p2, p3, p4, p5}, Landroid/graphics/drawable/Drawable;->createFromXmlInner(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    goto :goto_2

    .line 14
    :cond_3
    invoke-static {p2, p3, p4}, Landroid/graphics/drawable/Drawable;->createFromXmlInner(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    goto :goto_2

    .line 15
    :cond_4
    new-instance p1, Lorg/xmlpull/v1/XmlPullParserException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    invoke-interface {p3}, Lorg/xmlpull/v1/XmlPullParser;->getPositionDescription()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    :goto_2
    if-eqz v4, :cond_7

    if-eq v1, v2, :cond_6

    if-eq v3, v2, :cond_6

    .line 17
    iget-object p1, p0, Lc/b/m/a/h;->p:Lc/b/m/a/c;

    invoke-virtual {p1, v1, v3, v4, v5}, Lc/b/m/a/c;->a(IILandroid/graphics/drawable/Drawable;Z)I

    move-result p1

    return p1

    .line 18
    :cond_6
    new-instance p1, Lorg/xmlpull/v1/XmlPullParserException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    invoke-interface {p3}, Lorg/xmlpull/v1/XmlPullParser;->getPositionDescription()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, ": <transition> tag requires \'fromId\' & \'toId\' attributes"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 20
    :cond_7
    new-instance p1, Lorg/xmlpull/v1/XmlPullParserException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    invoke-interface {p3}, Lorg/xmlpull/v1/XmlPullParser;->getPositionDescription()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final d()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    move-result-object v0

    invoke-virtual {p0, v0}, Lc/b/m/a/h;->onStateChange([I)Z

    return-void
.end method

.method public isStateful()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public jumpToCurrentState()V
    .locals 1

    .line 1
    invoke-super {p0}, Lc/b/m/a/l;->jumpToCurrentState()V

    .line 2
    iget-object v0, p0, Lc/b/m/a/h;->q:Lc/b/m/a/g;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Lc/b/m/a/g;->d()V

    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, Lc/b/m/a/h;->q:Lc/b/m/a/g;

    .line 5
    iget v0, p0, Lc/b/m/a/h;->r:I

    invoke-virtual {p0, v0}, Lc/b/m/a/l;->a(I)Z

    const/4 v0, -0x1

    .line 6
    iput v0, p0, Lc/b/m/a/h;->r:I

    .line 7
    iput v0, p0, Lc/b/m/a/h;->s:I

    :cond_0
    return-void
.end method

.method public mutate()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lc/b/m/a/h;->t:Z

    if-nez v0, :cond_0

    invoke-super {p0}, Lc/b/m/a/o;->mutate()Landroid/graphics/drawable/Drawable;

    if-ne p0, p0, :cond_0

    .line 2
    iget-object v0, p0, Lc/b/m/a/h;->p:Lc/b/m/a/c;

    invoke-virtual {v0}, Lc/b/m/a/c;->n()V

    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Lc/b/m/a/h;->t:Z

    :cond_0
    return-object p0
.end method

.method public onStateChange([I)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lc/b/m/a/h;->p:Lc/b/m/a/c;

    invoke-virtual {v0, p1}, Lc/b/m/a/c;->b([I)I

    move-result v0

    .line 2
    invoke-virtual {p0}, Lc/b/m/a/l;->b()I

    move-result v1

    if-eq v0, v1, :cond_1

    .line 3
    invoke-virtual {p0, v0}, Lc/b/m/a/h;->b(I)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p0, v0}, Lc/b/m/a/l;->a(I)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 4
    :goto_0
    invoke-virtual {p0}, Lc/b/m/a/l;->getCurrent()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 5
    invoke-virtual {v1, p1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    move-result p1

    or-int/2addr v0, p1

    :cond_2
    return v0
.end method

.method public setVisible(ZZ)Z
    .locals 2

    .line 1
    invoke-super {p0, p1, p2}, Lc/b/m/a/l;->setVisible(ZZ)Z

    move-result v0

    .line 2
    iget-object v1, p0, Lc/b/m/a/h;->q:Lc/b/m/a/g;

    if-eqz v1, :cond_2

    if-nez v0, :cond_0

    if-eqz p2, :cond_2

    :cond_0
    if-eqz p1, :cond_1

    .line 3
    iget-object p1, p0, Lc/b/m/a/h;->q:Lc/b/m/a/g;

    invoke-virtual {p1}, Lc/b/m/a/g;->c()V

    goto :goto_0

    .line 4
    :cond_1
    invoke-virtual {p0}, Lc/b/m/a/h;->jumpToCurrentState()V

    :cond_2
    :goto_0
    return v0
.end method
