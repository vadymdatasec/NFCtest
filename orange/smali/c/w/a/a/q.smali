.class public Lc/w/a/a/q;
.super Lc/w/a/a/r;
.source "SourceFile"


# instance fields
.field public final a:Landroid/graphics/Matrix;

.field public final b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lc/w/a/a/r;",
            ">;"
        }
    .end annotation
.end field

.field public c:F

.field public d:F

.field public e:F

.field public f:F

.field public g:F

.field public h:F

.field public i:F

.field public final j:Landroid/graphics/Matrix;

.field public k:I

.field public l:[I

.field public m:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 3

    const/4 v0, 0x0

    .line 39
    invoke-direct {p0, v0}, Lc/w/a/a/r;-><init>(Lc/w/a/a/n;)V

    .line 40
    new-instance v1, Landroid/graphics/Matrix;

    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    iput-object v1, p0, Lc/w/a/a/q;->a:Landroid/graphics/Matrix;

    .line 41
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lc/w/a/a/q;->b:Ljava/util/ArrayList;

    const/4 v1, 0x0

    .line 42
    iput v1, p0, Lc/w/a/a/q;->c:F

    .line 43
    iput v1, p0, Lc/w/a/a/q;->d:F

    .line 44
    iput v1, p0, Lc/w/a/a/q;->e:F

    const/high16 v2, 0x3f800000    # 1.0f

    .line 45
    iput v2, p0, Lc/w/a/a/q;->f:F

    .line 46
    iput v2, p0, Lc/w/a/a/q;->g:F

    .line 47
    iput v1, p0, Lc/w/a/a/q;->h:F

    .line 48
    iput v1, p0, Lc/w/a/a/q;->i:F

    .line 49
    new-instance v1, Landroid/graphics/Matrix;

    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    iput-object v1, p0, Lc/w/a/a/q;->j:Landroid/graphics/Matrix;

    .line 50
    iput-object v0, p0, Lc/w/a/a/q;->m:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lc/w/a/a/q;Lc/e/b;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/w/a/a/q;",
            "Lc/e/b<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lc/w/a/a/r;-><init>(Lc/w/a/a/n;)V

    .line 2
    new-instance v1, Landroid/graphics/Matrix;

    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    iput-object v1, p0, Lc/w/a/a/q;->a:Landroid/graphics/Matrix;

    .line 3
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lc/w/a/a/q;->b:Ljava/util/ArrayList;

    const/4 v1, 0x0

    .line 4
    iput v1, p0, Lc/w/a/a/q;->c:F

    .line 5
    iput v1, p0, Lc/w/a/a/q;->d:F

    .line 6
    iput v1, p0, Lc/w/a/a/q;->e:F

    const/high16 v2, 0x3f800000    # 1.0f

    .line 7
    iput v2, p0, Lc/w/a/a/q;->f:F

    .line 8
    iput v2, p0, Lc/w/a/a/q;->g:F

    .line 9
    iput v1, p0, Lc/w/a/a/q;->h:F

    .line 10
    iput v1, p0, Lc/w/a/a/q;->i:F

    .line 11
    new-instance v1, Landroid/graphics/Matrix;

    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    iput-object v1, p0, Lc/w/a/a/q;->j:Landroid/graphics/Matrix;

    .line 12
    iput-object v0, p0, Lc/w/a/a/q;->m:Ljava/lang/String;

    .line 13
    iget v0, p1, Lc/w/a/a/q;->c:F

    iput v0, p0, Lc/w/a/a/q;->c:F

    .line 14
    iget v0, p1, Lc/w/a/a/q;->d:F

    iput v0, p0, Lc/w/a/a/q;->d:F

    .line 15
    iget v0, p1, Lc/w/a/a/q;->e:F

    iput v0, p0, Lc/w/a/a/q;->e:F

    .line 16
    iget v0, p1, Lc/w/a/a/q;->f:F

    iput v0, p0, Lc/w/a/a/q;->f:F

    .line 17
    iget v0, p1, Lc/w/a/a/q;->g:F

    iput v0, p0, Lc/w/a/a/q;->g:F

    .line 18
    iget v0, p1, Lc/w/a/a/q;->h:F

    iput v0, p0, Lc/w/a/a/q;->h:F

    .line 19
    iget v0, p1, Lc/w/a/a/q;->i:F

    iput v0, p0, Lc/w/a/a/q;->i:F

    .line 20
    iget-object v0, p1, Lc/w/a/a/q;->l:[I

    iput-object v0, p0, Lc/w/a/a/q;->l:[I

    .line 21
    iget-object v0, p1, Lc/w/a/a/q;->m:Ljava/lang/String;

    iput-object v0, p0, Lc/w/a/a/q;->m:Ljava/lang/String;

    .line 22
    iget v1, p1, Lc/w/a/a/q;->k:I

    iput v1, p0, Lc/w/a/a/q;->k:I

    if-eqz v0, :cond_0

    .line 23
    invoke-virtual {p2, v0, p0}, Lc/e/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    :cond_0
    iget-object v0, p0, Lc/w/a/a/q;->j:Landroid/graphics/Matrix;

    iget-object v1, p1, Lc/w/a/a/q;->j:Landroid/graphics/Matrix;

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 25
    iget-object p1, p1, Lc/w/a/a/q;->b:Ljava/util/ArrayList;

    const/4 v0, 0x0

    .line 26
    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_5

    .line 27
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    .line 28
    instance-of v2, v1, Lc/w/a/a/q;

    if-eqz v2, :cond_1

    .line 29
    check-cast v1, Lc/w/a/a/q;

    .line 30
    iget-object v2, p0, Lc/w/a/a/q;->b:Ljava/util/ArrayList;

    new-instance v3, Lc/w/a/a/q;

    invoke-direct {v3, v1, p2}, Lc/w/a/a/q;-><init>(Lc/w/a/a/q;Lc/e/b;)V

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 31
    :cond_1
    instance-of v2, v1, Lc/w/a/a/p;

    if-eqz v2, :cond_2

    .line 32
    new-instance v2, Lc/w/a/a/p;

    check-cast v1, Lc/w/a/a/p;

    invoke-direct {v2, v1}, Lc/w/a/a/p;-><init>(Lc/w/a/a/p;)V

    goto :goto_1

    .line 33
    :cond_2
    instance-of v2, v1, Lc/w/a/a/o;

    if-eqz v2, :cond_4

    .line 34
    new-instance v2, Lc/w/a/a/o;

    check-cast v1, Lc/w/a/a/o;

    invoke-direct {v2, v1}, Lc/w/a/a/o;-><init>(Lc/w/a/a/o;)V

    .line 35
    :goto_1
    iget-object v1, p0, Lc/w/a/a/q;->b:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 36
    iget-object v1, v2, Lc/w/a/a/s;->b:Ljava/lang/String;

    if-eqz v1, :cond_3

    .line 37
    invoke-virtual {p2, v1, v2}, Lc/e/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    :goto_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 38
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Unknown object in the tree!"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    return-void
.end method


# virtual methods
.method public a(Landroid/content/res/Resources;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;Lorg/xmlpull/v1/XmlPullParser;)V
    .locals 1

    .line 1
    sget-object v0, Lc/w/a/a/a;->b:[I

    invoke-static {p1, p3, p2, v0}, Lc/h/f/i/t;->a(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 2
    invoke-virtual {p0, p1, p4}, Lc/w/a/a/q;->a(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;)V

    .line 3
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method public final a(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;)V
    .locals 3

    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, Lc/w/a/a/q;->l:[I

    .line 5
    iget v0, p0, Lc/w/a/a/q;->c:F

    const-string v1, "rotation"

    const/4 v2, 0x5

    invoke-static {p1, p2, v1, v2, v0}, Lc/h/f/i/t;->a(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;IF)F

    move-result v0

    iput v0, p0, Lc/w/a/a/q;->c:F

    .line 6
    iget v0, p0, Lc/w/a/a/q;->d:F

    const/4 v1, 0x1

    invoke-virtual {p1, v1, v0}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    iput v0, p0, Lc/w/a/a/q;->d:F

    .line 7
    iget v0, p0, Lc/w/a/a/q;->e:F

    const/4 v1, 0x2

    invoke-virtual {p1, v1, v0}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    iput v0, p0, Lc/w/a/a/q;->e:F

    .line 8
    iget v0, p0, Lc/w/a/a/q;->f:F

    const-string v1, "scaleX"

    const/4 v2, 0x3

    invoke-static {p1, p2, v1, v2, v0}, Lc/h/f/i/t;->a(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;IF)F

    move-result v0

    iput v0, p0, Lc/w/a/a/q;->f:F

    .line 9
    iget v0, p0, Lc/w/a/a/q;->g:F

    const-string v1, "scaleY"

    const/4 v2, 0x4

    invoke-static {p1, p2, v1, v2, v0}, Lc/h/f/i/t;->a(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;IF)F

    move-result v0

    iput v0, p0, Lc/w/a/a/q;->g:F

    .line 10
    iget v0, p0, Lc/w/a/a/q;->h:F

    const-string v1, "translateX"

    const/4 v2, 0x6

    invoke-static {p1, p2, v1, v2, v0}, Lc/h/f/i/t;->a(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;IF)F

    move-result v0

    iput v0, p0, Lc/w/a/a/q;->h:F

    .line 11
    iget v0, p0, Lc/w/a/a/q;->i:F

    const-string v1, "translateY"

    const/4 v2, 0x7

    invoke-static {p1, p2, v1, v2, v0}, Lc/h/f/i/t;->a(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;IF)F

    move-result p2

    iput p2, p0, Lc/w/a/a/q;->i:F

    const/4 p2, 0x0

    .line 12
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 13
    iput-object p1, p0, Lc/w/a/a/q;->m:Ljava/lang/String;

    .line 14
    :cond_0
    invoke-virtual {p0}, Lc/w/a/a/q;->b()V

    return-void
.end method

.method public a()Z
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 15
    :goto_0
    iget-object v2, p0, Lc/w/a/a/q;->b:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 16
    iget-object v2, p0, Lc/w/a/a/q;->b:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc/w/a/a/r;

    invoke-virtual {v2}, Lc/w/a/a/r;->a()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v0
.end method

.method public a([I)Z
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 17
    :goto_0
    iget-object v2, p0, Lc/w/a/a/q;->b:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v0, v2, :cond_0

    .line 18
    iget-object v2, p0, Lc/w/a/a/q;->b:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc/w/a/a/r;

    invoke-virtual {v2, p1}, Lc/w/a/a/r;->a([I)Z

    move-result v2

    or-int/2addr v1, v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return v1
.end method

.method public final b()V
    .locals 4

    .line 1
    iget-object v0, p0, Lc/w/a/a/q;->j:Landroid/graphics/Matrix;

    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    .line 2
    iget-object v0, p0, Lc/w/a/a/q;->j:Landroid/graphics/Matrix;

    iget v1, p0, Lc/w/a/a/q;->d:F

    neg-float v1, v1

    iget v2, p0, Lc/w/a/a/q;->e:F

    neg-float v2, v2

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 3
    iget-object v0, p0, Lc/w/a/a/q;->j:Landroid/graphics/Matrix;

    iget v1, p0, Lc/w/a/a/q;->f:F

    iget v2, p0, Lc/w/a/a/q;->g:F

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 4
    iget-object v0, p0, Lc/w/a/a/q;->j:Landroid/graphics/Matrix;

    iget v1, p0, Lc/w/a/a/q;->c:F

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v2}, Landroid/graphics/Matrix;->postRotate(FFF)Z

    .line 5
    iget-object v0, p0, Lc/w/a/a/q;->j:Landroid/graphics/Matrix;

    iget v1, p0, Lc/w/a/a/q;->h:F

    iget v2, p0, Lc/w/a/a/q;->d:F

    add-float/2addr v1, v2

    iget v2, p0, Lc/w/a/a/q;->i:F

    iget v3, p0, Lc/w/a/a/q;->e:F

    add-float/2addr v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    return-void
.end method

.method public getGroupName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/w/a/a/q;->m:Ljava/lang/String;

    return-object v0
.end method

.method public getLocalMatrix()Landroid/graphics/Matrix;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/w/a/a/q;->j:Landroid/graphics/Matrix;

    return-object v0
.end method

.method public getPivotX()F
    .locals 1

    .line 1
    iget v0, p0, Lc/w/a/a/q;->d:F

    return v0
.end method

.method public getPivotY()F
    .locals 1

    .line 1
    iget v0, p0, Lc/w/a/a/q;->e:F

    return v0
.end method

.method public getRotation()F
    .locals 1

    .line 1
    iget v0, p0, Lc/w/a/a/q;->c:F

    return v0
.end method

.method public getScaleX()F
    .locals 1

    .line 1
    iget v0, p0, Lc/w/a/a/q;->f:F

    return v0
.end method

.method public getScaleY()F
    .locals 1

    .line 1
    iget v0, p0, Lc/w/a/a/q;->g:F

    return v0
.end method

.method public getTranslateX()F
    .locals 1

    .line 1
    iget v0, p0, Lc/w/a/a/q;->h:F

    return v0
.end method

.method public getTranslateY()F
    .locals 1

    .line 1
    iget v0, p0, Lc/w/a/a/q;->i:F

    return v0
.end method

.method public setPivotX(F)V
    .locals 1

    .line 1
    iget v0, p0, Lc/w/a/a/q;->d:F

    cmpl-float v0, p1, v0

    if-eqz v0, :cond_0

    .line 2
    iput p1, p0, Lc/w/a/a/q;->d:F

    .line 3
    invoke-virtual {p0}, Lc/w/a/a/q;->b()V

    :cond_0
    return-void
.end method

.method public setPivotY(F)V
    .locals 1

    .line 1
    iget v0, p0, Lc/w/a/a/q;->e:F

    cmpl-float v0, p1, v0

    if-eqz v0, :cond_0

    .line 2
    iput p1, p0, Lc/w/a/a/q;->e:F

    .line 3
    invoke-virtual {p0}, Lc/w/a/a/q;->b()V

    :cond_0
    return-void
.end method

.method public setRotation(F)V
    .locals 1

    .line 1
    iget v0, p0, Lc/w/a/a/q;->c:F

    cmpl-float v0, p1, v0

    if-eqz v0, :cond_0

    .line 2
    iput p1, p0, Lc/w/a/a/q;->c:F

    .line 3
    invoke-virtual {p0}, Lc/w/a/a/q;->b()V

    :cond_0
    return-void
.end method

.method public setScaleX(F)V
    .locals 1

    .line 1
    iget v0, p0, Lc/w/a/a/q;->f:F

    cmpl-float v0, p1, v0

    if-eqz v0, :cond_0

    .line 2
    iput p1, p0, Lc/w/a/a/q;->f:F

    .line 3
    invoke-virtual {p0}, Lc/w/a/a/q;->b()V

    :cond_0
    return-void
.end method

.method public setScaleY(F)V
    .locals 1

    .line 1
    iget v0, p0, Lc/w/a/a/q;->g:F

    cmpl-float v0, p1, v0

    if-eqz v0, :cond_0

    .line 2
    iput p1, p0, Lc/w/a/a/q;->g:F

    .line 3
    invoke-virtual {p0}, Lc/w/a/a/q;->b()V

    :cond_0
    return-void
.end method

.method public setTranslateX(F)V
    .locals 1

    .line 1
    iget v0, p0, Lc/w/a/a/q;->h:F

    cmpl-float v0, p1, v0

    if-eqz v0, :cond_0

    .line 2
    iput p1, p0, Lc/w/a/a/q;->h:F

    .line 3
    invoke-virtual {p0}, Lc/w/a/a/q;->b()V

    :cond_0
    return-void
.end method

.method public setTranslateY(F)V
    .locals 1

    .line 1
    iget v0, p0, Lc/w/a/a/q;->i:F

    cmpl-float v0, p1, v0

    if-eqz v0, :cond_0

    .line 2
    iput p1, p0, Lc/w/a/a/q;->i:F

    .line 3
    invoke-virtual {p0}, Lc/w/a/a/q;->b()V

    :cond_0
    return-void
.end method
