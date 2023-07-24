.class public final Le/e/a/f;
.super Landroidx/constraintlayout/widget/ConstraintLayout;
.source "SourceFile"


# instance fields
.field public A:Landroid/graphics/Paint;

.field public final r:I

.field public s:Landroid/view/View;

.field public t:Landroid/widget/ImageView;

.field public u:Landroid/widget/TextView;

.field public v:Landroid/widget/TextView;

.field public w:Landroid/widget/ImageView;

.field public x:Landroid/graphics/RectF;

.field public y:I

.field public z:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Le/e/a/g;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Le/e/a/b;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Li/h/c/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "builder"

    invoke-static {p2, v0}, Li/h/c/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p1}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;)V

    const/16 p1, 0x14

    .line 2
    iput p1, p0, Le/e/a/f;->r:I

    .line 3
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p1

    sget v0, Le/e/a/w;->blue_default:I

    invoke-static {p1, v0}, Lc/h/f/f;->a(Landroid/content/Context;I)I

    move-result p1

    iput p1, p0, Le/e/a/f;->y:I

    .line 4
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Le/e/a/f;->z:Ljava/util/ArrayList;

    .line 5
    invoke-virtual {p0}, Le/e/a/f;->f()V

    .line 6
    invoke-direct {p0, p2}, Le/e/a/f;->setAttributes(Le/e/a/b;)V

    .line 7
    invoke-direct {p0, p2}, Le/e/a/f;->setBubbleListener(Le/e/a/b;)V

    return-void
.end method

.method private final getMargin()I
    .locals 2

    .line 1
    sget-object v0, Le/e/a/z;->a:Le/e/a/z;

    const/16 v1, 0x14

    invoke-virtual {v0, v1}, Le/e/a/z;->a(I)I

    move-result v0

    return v0
.end method

.method private final getSecurityArrowMargin()I
    .locals 3

    .line 1
    invoke-direct {p0}, Le/e/a/f;->getMargin()I

    move-result v0

    sget-object v1, Le/e/a/z;->a:Le/e/a/z;

    iget v2, p0, Le/e/a/f;->r:I

    mul-int/lit8 v2, v2, 0x2

    div-int/lit8 v2, v2, 0x3

    invoke-virtual {v1, v2}, Le/e/a/z;->a(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method private final getViewWidth()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getWidth()I

    move-result v0

    return v0
.end method

.method private final setAttributes(Le/e/a/b;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Le/e/a/b;->f()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    .line 2
    iget-object v0, p0, Le/e/a/f;->t:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 3
    :cond_0
    iget-object v0, p0, Le/e/a/f;->t:Landroid/widget/ImageView;

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Le/e/a/b;->f()Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    :cond_1
    invoke-static {}, Li/h/c/k;->b()V

    throw v2

    .line 4
    :cond_2
    :goto_0
    invoke-virtual {p1}, Le/e/a/b;->d()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 5
    iget-object v0, p0, Le/e/a/f;->w:Landroid/widget/ImageView;

    if-eqz v0, :cond_3

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 6
    :cond_3
    iget-object v0, p0, Le/e/a/f;->w:Landroid/widget/ImageView;

    if-eqz v0, :cond_5

    invoke-virtual {p1}, Le/e/a/b;->d()Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-eqz v3, :cond_4

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_1

    :cond_4
    invoke-static {}, Li/h/c/k;->b()V

    throw v2

    .line 7
    :cond_5
    :goto_1
    invoke-virtual {p1}, Le/e/a/b;->e()Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-virtual {p1}, Le/e/a/b;->e()Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 8
    iget-object v0, p0, Le/e/a/f;->w:Landroid/widget/ImageView;

    if-eqz v0, :cond_7

    const/4 v3, 0x4

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_2

    .line 9
    :cond_6
    invoke-static {}, Li/h/c/k;->b()V

    throw v2

    .line 10
    :cond_7
    :goto_2
    invoke-virtual {p1}, Le/e/a/b;->l()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_9

    .line 11
    iget-object v0, p0, Le/e/a/f;->u:Landroid/widget/TextView;

    if-eqz v0, :cond_8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 12
    :cond_8
    iget-object v0, p0, Le/e/a/f;->u:Landroid/widget/TextView;

    if-eqz v0, :cond_9

    invoke-virtual {p1}, Le/e/a/b;->l()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 13
    :cond_9
    invoke-virtual {p1}, Le/e/a/b;->h()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_b

    .line 14
    iget-object v0, p0, Le/e/a/f;->v:Landroid/widget/TextView;

    if-eqz v0, :cond_a

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 15
    :cond_a
    iget-object v0, p0, Le/e/a/f;->v:Landroid/widget/TextView;

    if-eqz v0, :cond_b

    invoke-virtual {p1}, Le/e/a/b;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 16
    :cond_b
    invoke-virtual {p1}, Le/e/a/b;->k()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_f

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 17
    iget-object v0, p0, Le/e/a/f;->u:Landroid/widget/TextView;

    if-eqz v0, :cond_d

    invoke-virtual {p1}, Le/e/a/b;->k()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_c

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_3

    :cond_c
    invoke-static {}, Li/h/c/k;->b()V

    throw v2

    .line 18
    :cond_d
    :goto_3
    iget-object v0, p0, Le/e/a/f;->v:Landroid/widget/TextView;

    if-eqz v0, :cond_f

    invoke-virtual {p1}, Le/e/a/b;->k()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_e

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_4

    :cond_e
    invoke-static {}, Li/h/c/k;->b()V

    throw v2

    .line 19
    :cond_f
    :goto_4
    invoke-virtual {p1}, Le/e/a/b;->m()Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x2

    if-eqz v0, :cond_11

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 20
    iget-object v0, p0, Le/e/a/f;->u:Landroid/widget/TextView;

    if-eqz v0, :cond_11

    invoke-virtual {p1}, Le/e/a/b;->m()Ljava/lang/Integer;

    move-result-object v3

    if-eqz v3, :cond_10

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {v0, v1, v3}, Landroid/widget/TextView;->setTextSize(IF)V

    goto :goto_5

    :cond_10
    invoke-static {}, Li/h/c/k;->b()V

    throw v2

    .line 21
    :cond_11
    :goto_5
    invoke-virtual {p1}, Le/e/a/b;->i()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_13

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 22
    iget-object v0, p0, Le/e/a/f;->v:Landroid/widget/TextView;

    if-eqz v0, :cond_13

    invoke-virtual {p1}, Le/e/a/b;->i()Ljava/lang/Integer;

    move-result-object v3

    if-eqz v3, :cond_12

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {v0, v1, v3}, Landroid/widget/TextView;->setTextSize(IF)V

    goto :goto_6

    :cond_12
    invoke-static {}, Li/h/c/k;->b()V

    throw v2

    .line 23
    :cond_13
    :goto_6
    invoke-virtual {p1}, Le/e/a/b;->c()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_15

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    invoke-virtual {p1}, Le/e/a/b;->c()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_14

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Le/e/a/f;->y:I

    goto :goto_7

    :cond_14
    invoke-static {}, Li/h/c/k;->b()V

    throw v2

    .line 24
    :cond_15
    :goto_7
    invoke-virtual {p1}, Le/e/a/b;->b()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Le/e/a/f;->z:Ljava/util/ArrayList;

    .line 25
    invoke-virtual {p1}, Le/e/a/b;->j()Landroid/graphics/RectF;

    move-result-object p1

    iput-object p1, p0, Le/e/a/f;->x:Landroid/graphics/RectF;

    return-void
.end method

.method private final setBubbleListener(Le/e/a/b;)V
    .locals 2

    .line 1
    iget-object v0, p0, Le/e/a/f;->w:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    new-instance v1, Le/e/a/d;

    invoke-direct {v1, p1}, Le/e/a/d;-><init>(Le/e/a/b;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 2
    :cond_0
    iget-object v0, p0, Le/e/a/f;->s:Landroid/view/View;

    if-eqz v0, :cond_1

    new-instance v1, Le/e/a/e;

    invoke-direct {v1, p1}, Le/e/a/e;-><init>(Le/e/a/b;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final a(Landroid/graphics/RectF;)I
    .locals 1

    .line 17
    invoke-virtual {p0, p1}, Le/e/a/f;->e(Landroid/graphics/RectF;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getWidth()I

    move-result p1

    invoke-direct {p0}, Le/e/a/f;->getSecurityArrowMargin()I

    move-result v0

    sub-int/2addr p1, v0

    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {p0, p1}, Le/e/a/f;->d(Landroid/graphics/RectF;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Le/e/a/f;->getSecurityArrowMargin()I

    move-result p1

    goto :goto_0

    :cond_1
    if-eqz p1, :cond_2

    .line 19
    invoke-virtual {p1}, Landroid/graphics/RectF;->centerX()F

    move-result p1

    sget-object v0, Le/e/a/z;->a:Le/e/a/z;

    invoke-virtual {v0, p0}, Le/e/a/z;->a(Landroid/view/View;)I

    move-result v0

    int-to-float v0, v0

    sub-float/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    :goto_0
    return p1

    :cond_2
    invoke-static {}, Li/h/c/k;->b()V

    const/4 p1, 0x0

    throw p1
.end method

.method public final a(Landroid/graphics/Canvas;)V
    .locals 6

    .line 1
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {p0}, Le/e/a/f;->getMargin()I

    move-result v1

    int-to-float v1, v1

    .line 2
    invoke-direct {p0}, Le/e/a/f;->getMargin()I

    move-result v2

    int-to-float v2, v2

    .line 3
    invoke-direct {p0}, Le/e/a/f;->getViewWidth()I

    move-result v3

    int-to-float v3, v3

    invoke-direct {p0}, Le/e/a/f;->getMargin()I

    move-result v4

    int-to-float v4, v4

    sub-float/2addr v3, v4

    .line 4
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getHeight()I

    move-result v4

    int-to-float v4, v4

    invoke-direct {p0}, Le/e/a/f;->getMargin()I

    move-result v5

    int-to-float v5, v5

    sub-float/2addr v4, v5

    .line 5
    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 6
    iget-object v1, p0, Le/e/a/f;->A:Landroid/graphics/Paint;

    if-eqz v1, :cond_0

    const/high16 v2, 0x41200000    # 10.0f

    invoke-virtual {p1, v0, v2, v2, v1}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    return-void

    :cond_0
    invoke-static {}, Li/h/c/k;->b()V

    const/4 p1, 0x0

    throw p1
.end method

.method public final a(Landroid/graphics/Canvas;Landroid/graphics/Paint;III)V
    .locals 5

    .line 20
    div-int/lit8 p5, p5, 0x2

    .line 21
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    int-to-float v1, p3

    add-int v2, p4, p5

    int-to-float v2, v2

    .line 22
    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->moveTo(FF)V

    sub-int v3, p3, p5

    int-to-float v3, v3

    int-to-float v4, p4

    .line 23
    invoke-virtual {v0, v3, v4}, Landroid/graphics/Path;->lineTo(FF)V

    sub-int/2addr p4, p5

    int-to-float p4, p4

    .line 24
    invoke-virtual {v0, v1, p4}, Landroid/graphics/Path;->lineTo(FF)V

    add-int/2addr p3, p5

    int-to-float p3, p3

    .line 25
    invoke-virtual {v0, p3, v4}, Landroid/graphics/Path;->lineTo(FF)V

    .line 26
    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 27
    invoke-virtual {v0}, Landroid/graphics/Path;->close()V

    if-eqz p2, :cond_0

    .line 28
    invoke-virtual {p1, v0, p2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    return-void

    :cond_0
    invoke-static {}, Li/h/c/k;->b()V

    const/4 p1, 0x0

    throw p1
.end method

.method public final a(Landroid/graphics/Canvas;Le/e/a/g;Landroid/graphics/RectF;)V
    .locals 6

    .line 7
    sget-object v0, Le/e/a/c;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p2, v0, p2

    const/4 v0, 0x1

    const/4 v1, 0x2

    if-eq p2, v0, :cond_6

    if-eq p2, v1, :cond_4

    const/4 v0, 0x3

    if-eq p2, v0, :cond_2

    const/4 v0, 0x4

    if-ne p2, v0, :cond_1

    if-eqz p3, :cond_0

    .line 8
    invoke-virtual {p0, p3}, Le/e/a/f;->a(Landroid/graphics/RectF;)I

    move-result p2

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getWidth()I

    move-result p2

    div-int/2addr p2, v1

    .line 9
    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getHeight()I

    move-result p3

    invoke-direct {p0}, Le/e/a/f;->getMargin()I

    move-result v0

    sub-int/2addr p3, v0

    goto :goto_2

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    if-eqz p3, :cond_3

    .line 10
    invoke-virtual {p0, p3}, Le/e/a/f;->a(Landroid/graphics/RectF;)I

    move-result p2

    goto :goto_1

    :cond_3
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getWidth()I

    move-result p2

    div-int/2addr p2, v1

    .line 11
    :goto_1
    invoke-direct {p0}, Le/e/a/f;->getMargin()I

    move-result p3

    goto :goto_2

    .line 12
    :cond_4
    invoke-direct {p0}, Le/e/a/f;->getViewWidth()I

    move-result p2

    invoke-direct {p0}, Le/e/a/f;->getMargin()I

    move-result v0

    sub-int/2addr p2, v0

    if-eqz p3, :cond_5

    .line 13
    invoke-virtual {p0, p3}, Le/e/a/f;->b(Landroid/graphics/RectF;)I

    move-result p3

    goto :goto_2

    :cond_5
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getHeight()I

    move-result p3

    div-int/2addr p3, v1

    goto :goto_2

    .line 14
    :cond_6
    invoke-direct {p0}, Le/e/a/f;->getMargin()I

    move-result p2

    if-eqz p3, :cond_7

    .line 15
    invoke-virtual {p0, p3}, Le/e/a/f;->b(Landroid/graphics/RectF;)I

    move-result p3

    goto :goto_2

    :cond_7
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getHeight()I

    move-result p3

    div-int/2addr p3, v1

    :goto_2
    move v3, p2

    move v4, p3

    .line 16
    iget-object v2, p0, Le/e/a/f;->A:Landroid/graphics/Paint;

    sget-object p2, Le/e/a/z;->a:Le/e/a/z;

    iget p3, p0, Le/e/a/f;->r:I

    invoke-virtual {p2, p3}, Le/e/a/z;->a(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    invoke-virtual/range {v0 .. v5}, Le/e/a/f;->a(Landroid/graphics/Canvas;Landroid/graphics/Paint;III)V

    return-void
.end method

.method public final b(Landroid/graphics/RectF;)I
    .locals 3

    .line 1
    invoke-virtual {p0, p1}, Le/e/a/f;->c(Landroid/graphics/RectF;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getHeight()I

    move-result p1

    invoke-direct {p0}, Le/e/a/f;->getSecurityArrowMargin()I

    move-result v0

    sub-int/2addr p1, v0

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {p0, p1}, Le/e/a/f;->f(Landroid/graphics/RectF;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Le/e/a/f;->getSecurityArrowMargin()I

    move-result p1

    goto :goto_0

    :cond_1
    if-eqz p1, :cond_2

    .line 3
    invoke-virtual {p1}, Landroid/graphics/RectF;->centerY()F

    move-result p1

    sget-object v0, Le/e/a/z;->a:Le/e/a/z;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "context"

    invoke-static {v1, v2}, Li/h/c/k;->a(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Le/e/a/z;->c(Landroid/content/Context;)I

    move-result v0

    int-to-float v0, v0

    add-float/2addr p1, v0

    sget-object v0, Le/e/a/z;->a:Le/e/a/z;

    invoke-virtual {v0, p0}, Le/e/a/z;->b(Landroid/view/View;)I

    move-result v0

    int-to-float v0, v0

    sub-float/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    :goto_0
    return p1

    :cond_2
    invoke-static {}, Li/h/c/k;->b()V

    const/4 p1, 0x0

    throw p1
.end method

.method public final c(Landroid/graphics/RectF;)Z
    .locals 4

    if-eqz p1, :cond_1

    .line 1
    invoke-virtual {p1}, Landroid/graphics/RectF;->centerY()F

    move-result p1

    sget-object v0, Le/e/a/z;->a:Le/e/a/z;

    invoke-virtual {v0, p0}, Le/e/a/z;->b(Landroid/view/View;)I

    move-result v0

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getHeight()I

    move-result v1

    add-int/2addr v0, v1

    invoke-direct {p0}, Le/e/a/f;->getSecurityArrowMargin()I

    move-result v1

    sub-int/2addr v0, v1

    sget-object v1, Le/e/a/z;->a:Le/e/a/z;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "context"

    invoke-static {v2, v3}, Li/h/c/k;->a(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Le/e/a/z;->c(Landroid/content/Context;)I

    move-result v1

    sub-int/2addr v0, v1

    int-to-float v0, v0

    cmpl-float p1, p1, v0

    if-lez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1

    :cond_1
    invoke-static {}, Li/h/c/k;->b()V

    const/4 p1, 0x0

    throw p1
.end method

.method public final d()V
    .locals 1

    .line 1
    sget v0, Le/e/a/x;->imageViewShowCase:I

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Le/e/a/f;->t:Landroid/widget/ImageView;

    .line 2
    sget v0, Le/e/a/x;->imageViewShowCaseClose:I

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Le/e/a/f;->w:Landroid/widget/ImageView;

    .line 3
    sget v0, Le/e/a/x;->textViewShowCaseTitle:I

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Le/e/a/f;->u:Landroid/widget/TextView;

    .line 4
    sget v0, Le/e/a/x;->textViewShowCaseText:I

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Le/e/a/f;->v:Landroid/widget/TextView;

    .line 5
    sget v0, Le/e/a/x;->showCaseMessageViewLayout:I

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout;

    return-void
.end method

.method public final d(Landroid/graphics/RectF;)Z
    .locals 2

    if-eqz p1, :cond_1

    .line 6
    invoke-virtual {p1}, Landroid/graphics/RectF;->centerX()F

    move-result p1

    sget-object v0, Le/e/a/z;->a:Le/e/a/z;

    invoke-virtual {v0, p0}, Le/e/a/z;->a(Landroid/view/View;)I

    move-result v0

    invoke-direct {p0}, Le/e/a/f;->getSecurityArrowMargin()I

    move-result v1

    add-int/2addr v0, v1

    int-to-float v0, v0

    cmpg-float p1, p1, v0

    if-gez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1

    :cond_1
    invoke-static {}, Li/h/c/k;->b()V

    const/4 p1, 0x0

    throw p1
.end method

.method public final e()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Le/e/a/y;->view_bubble_message:I

    invoke-static {v0, v1, p0}, Landroid/view/ViewGroup;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Le/e/a/f;->s:Landroid/view/View;

    return-void
.end method

.method public final e(Landroid/graphics/RectF;)Z
    .locals 2

    if-eqz p1, :cond_1

    .line 2
    invoke-virtual {p1}, Landroid/graphics/RectF;->centerX()F

    move-result p1

    sget-object v0, Le/e/a/z;->a:Le/e/a/z;

    invoke-virtual {v0, p0}, Le/e/a/z;->a(Landroid/view/View;)I

    move-result v0

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getWidth()I

    move-result v1

    add-int/2addr v0, v1

    invoke-direct {p0}, Le/e/a/f;->getSecurityArrowMargin()I

    move-result v1

    sub-int/2addr v0, v1

    int-to-float v0, v0

    cmpl-float p1, p1, v0

    if-lez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1

    :cond_1
    invoke-static {}, Li/h/c/k;->b()V

    const/4 p1, 0x0

    throw p1
.end method

.method public final f()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->setWillNotDraw(Z)V

    .line 2
    invoke-virtual {p0}, Le/e/a/f;->e()V

    .line 3
    invoke-virtual {p0}, Le/e/a/f;->d()V

    return-void
.end method

.method public final f(Landroid/graphics/RectF;)Z
    .locals 4

    if-eqz p1, :cond_1

    .line 4
    invoke-virtual {p1}, Landroid/graphics/RectF;->centerY()F

    move-result p1

    sget-object v0, Le/e/a/z;->a:Le/e/a/z;

    invoke-virtual {v0, p0}, Le/e/a/z;->b(Landroid/view/View;)I

    move-result v0

    invoke-direct {p0}, Le/e/a/f;->getSecurityArrowMargin()I

    move-result v1

    add-int/2addr v0, v1

    sget-object v1, Le/e/a/z;->a:Le/e/a/z;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "context"

    invoke-static {v2, v3}, Li/h/c/k;->a(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Le/e/a/z;->c(Landroid/content/Context;)I

    move-result v1

    sub-int/2addr v0, v1

    int-to-float v0, v0

    cmpg-float p1, p1, v0

    if-gez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1

    :cond_1
    invoke-static {}, Li/h/c/k;->b()V

    const/4 p1, 0x0

    throw p1
.end method

.method public final g()V
    .locals 3

    .line 1
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Le/e/a/f;->A:Landroid/graphics/Paint;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    .line 2
    iget v2, p0, Le/e/a/f;->y:I

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 3
    iget-object v0, p0, Le/e/a/f;->A:Landroid/graphics/Paint;

    if-eqz v0, :cond_1

    sget-object v2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 4
    iget-object v0, p0, Le/e/a/f;->A:Landroid/graphics/Paint;

    if-eqz v0, :cond_0

    const/high16 v1, 0x40800000    # 4.0f

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    return-void

    :cond_0
    invoke-static {}, Li/h/c/k;->b()V

    throw v1

    .line 5
    :cond_1
    invoke-static {}, Li/h/c/k;->b()V

    throw v1

    .line 6
    :cond_2
    invoke-static {}, Li/h/c/k;->b()V

    throw v1
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 3

    const-string v0, "canvas"

    invoke-static {p1, v0}, Li/h/c/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onDraw(Landroid/graphics/Canvas;)V

    .line 2
    invoke-virtual {p0}, Le/e/a/f;->g()V

    .line 3
    invoke-virtual {p0, p1}, Le/e/a/f;->a(Landroid/graphics/Canvas;)V

    .line 4
    iget-object v0, p0, Le/e/a/f;->z:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le/e/a/g;

    const-string v2, "arrowPosition"

    .line 5
    invoke-static {v1, v2}, Li/h/c/k;->a(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Le/e/a/f;->x:Landroid/graphics/RectF;

    invoke-virtual {p0, p1, v1, v2}, Le/e/a/f;->a(Landroid/graphics/Canvas;Le/e/a/g;Landroid/graphics/RectF;)V

    goto :goto_0

    :cond_0
    return-void
.end method
