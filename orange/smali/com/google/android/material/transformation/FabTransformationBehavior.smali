.class public abstract Lcom/google/android/material/transformation/FabTransformationBehavior;
.super Lcom/google/android/material/transformation/ExpandableTransformationBehavior;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/material/transformation/FabTransformationBehavior$b;
    }
.end annotation


# instance fields
.field public final c:Landroid/graphics/Rect;

.field public final d:Landroid/graphics/RectF;

.field public final e:Landroid/graphics/RectF;

.field public final f:[I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/android/material/transformation/ExpandableTransformationBehavior;-><init>()V

    .line 2
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/google/android/material/transformation/FabTransformationBehavior;->c:Landroid/graphics/Rect;

    .line 3
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/google/android/material/transformation/FabTransformationBehavior;->d:Landroid/graphics/RectF;

    .line 4
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/google/android/material/transformation/FabTransformationBehavior;->e:Landroid/graphics/RectF;

    const/4 v0, 0x2

    new-array v0, v0, [I

    .line 5
    iput-object v0, p0, Lcom/google/android/material/transformation/FabTransformationBehavior;->f:[I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 6
    invoke-direct {p0, p1, p2}, Lcom/google/android/material/transformation/ExpandableTransformationBehavior;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 7
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Lcom/google/android/material/transformation/FabTransformationBehavior;->c:Landroid/graphics/Rect;

    .line 8
    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, p0, Lcom/google/android/material/transformation/FabTransformationBehavior;->d:Landroid/graphics/RectF;

    .line 9
    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, p0, Lcom/google/android/material/transformation/FabTransformationBehavior;->e:Landroid/graphics/RectF;

    const/4 p1, 0x2

    new-array p1, p1, [I

    .line 10
    iput-object p1, p0, Lcom/google/android/material/transformation/FabTransformationBehavior;->f:[I

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;Landroid/view/View;Le/f/a/c/j/f;)F
    .locals 2

    .line 34
    iget-object v0, p0, Lcom/google/android/material/transformation/FabTransformationBehavior;->d:Landroid/graphics/RectF;

    .line 35
    iget-object v1, p0, Lcom/google/android/material/transformation/FabTransformationBehavior;->e:Landroid/graphics/RectF;

    .line 36
    invoke-virtual {p0, p1, v0}, Lcom/google/android/material/transformation/FabTransformationBehavior;->a(Landroid/view/View;Landroid/graphics/RectF;)V

    .line 37
    invoke-virtual {p0, p2, v1}, Lcom/google/android/material/transformation/FabTransformationBehavior;->a(Landroid/view/View;Landroid/graphics/RectF;)V

    .line 38
    iget p1, p3, Le/f/a/c/j/f;->a:I

    and-int/lit8 p1, p1, 0x7

    const/4 p2, 0x1

    if-eq p1, p2, :cond_2

    const/4 p2, 0x3

    if-eq p1, p2, :cond_1

    const/4 p2, 0x5

    if-eq p1, p2, :cond_0

    const/4 p1, 0x0

    goto :goto_1

    .line 39
    :cond_0
    iget p1, v1, Landroid/graphics/RectF;->right:F

    iget p2, v0, Landroid/graphics/RectF;->right:F

    goto :goto_0

    .line 40
    :cond_1
    iget p1, v1, Landroid/graphics/RectF;->left:F

    iget p2, v0, Landroid/graphics/RectF;->left:F

    goto :goto_0

    .line 41
    :cond_2
    invoke-virtual {v1}, Landroid/graphics/RectF;->centerX()F

    move-result p1

    invoke-virtual {v0}, Landroid/graphics/RectF;->centerX()F

    move-result p2

    :goto_0
    sub-float/2addr p1, p2

    .line 42
    :goto_1
    iget p2, p3, Le/f/a/c/j/f;->b:F

    add-float/2addr p1, p2

    return p1
.end method

.method public final a(Lcom/google/android/material/transformation/FabTransformationBehavior$b;Le/f/a/c/j/e;FF)F
    .locals 8

    .line 59
    invoke-virtual {p2}, Le/f/a/c/j/e;->a()J

    move-result-wide v0

    .line 60
    invoke-virtual {p2}, Le/f/a/c/j/e;->b()J

    move-result-wide v2

    .line 61
    iget-object p1, p1, Lcom/google/android/material/transformation/FabTransformationBehavior$b;->a:Le/f/a/c/j/d;

    const-string v4, "expansion"

    invoke-virtual {p1, v4}, Le/f/a/c/j/d;->a(Ljava/lang/String;)Le/f/a/c/j/e;

    move-result-object p1

    .line 62
    invoke-virtual {p1}, Le/f/a/c/j/e;->a()J

    move-result-wide v4

    invoke-virtual {p1}, Le/f/a/c/j/e;->b()J

    move-result-wide v6

    add-long/2addr v4, v6

    const-wide/16 v6, 0x11

    add-long/2addr v4, v6

    sub-long/2addr v4, v0

    long-to-float p1, v4

    long-to-float v0, v2

    div-float/2addr p1, v0

    .line 63
    invoke-virtual {p2}, Le/f/a/c/j/e;->c()Landroid/animation/TimeInterpolator;

    move-result-object p2

    invoke-interface {p2, p1}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    move-result p1

    .line 64
    invoke-static {p3, p4, p1}, Le/f/a/c/j/a;->a(FFF)F

    move-result p1

    return p1
.end method

.method public final a(Landroid/view/View;)Landroid/view/ViewGroup;
    .locals 1

    .line 65
    sget v0, Le/f/a/c/e;->mtrl_child_content_container:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 66
    invoke-virtual {p0, v0}, Lcom/google/android/material/transformation/FabTransformationBehavior;->b(Landroid/view/View;)Landroid/view/ViewGroup;

    move-result-object p1

    return-object p1

    .line 67
    :cond_0
    invoke-virtual {p0, p1}, Lcom/google/android/material/transformation/FabTransformationBehavior;->b(Landroid/view/View;)Landroid/view/ViewGroup;

    move-result-object p1

    return-object p1
.end method

.method public abstract a(Landroid/content/Context;Z)Lcom/google/android/material/transformation/FabTransformationBehavior$b;
.end method

.method public final a(Landroid/view/View;Landroid/graphics/RectF;)V
    .locals 3

    .line 43
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v1

    int-to-float v1, v1

    const/4 v2, 0x0

    invoke-virtual {p2, v2, v2, v0, v1}, Landroid/graphics/RectF;->set(FFFF)V

    .line 44
    iget-object v0, p0, Lcom/google/android/material/transformation/FabTransformationBehavior;->f:[I

    .line 45
    invoke-virtual {p1, v0}, Landroid/view/View;->getLocationInWindow([I)V

    const/4 v1, 0x0

    .line 46
    aget v1, v0, v1

    int-to-float v1, v1

    const/4 v2, 0x1

    aget v0, v0, v2

    int-to-float v0, v0

    invoke-virtual {p2, v1, v0}, Landroid/graphics/RectF;->offsetTo(FF)V

    .line 47
    invoke-virtual {p1}, Landroid/view/View;->getTranslationX()F

    move-result v0

    neg-float v0, v0

    float-to-int v0, v0

    int-to-float v0, v0

    invoke-virtual {p1}, Landroid/view/View;->getTranslationY()F

    move-result p1

    neg-float p1, p1

    float-to-int p1, p1

    int-to-float p1, p1

    invoke-virtual {p2, v0, p1}, Landroid/graphics/RectF;->offset(FF)V

    return-void
.end method

.method public final a(Landroid/view/View;Landroid/view/View;ZZLcom/google/android/material/transformation/FabTransformationBehavior$b;FFLjava/util/List;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Landroid/view/View;",
            "ZZ",
            "Lcom/google/android/material/transformation/FabTransformationBehavior$b;",
            "FF",
            "Ljava/util/List<",
            "Landroid/animation/Animator;",
            ">;",
            "Ljava/util/List<",
            "Landroid/animation/Animator$AnimatorListener;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method public final a(Landroid/view/View;Landroid/view/View;ZZLcom/google/android/material/transformation/FabTransformationBehavior$b;Ljava/util/List;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Landroid/view/View;",
            "ZZ",
            "Lcom/google/android/material/transformation/FabTransformationBehavior$b;",
            "Ljava/util/List<",
            "Landroid/animation/Animator;",
            ">;",
            "Ljava/util/List<",
            "Landroid/animation/Animator$AnimatorListener;",
            ">;)V"
        }
    .end annotation

    .line 24
    instance-of p1, p2, Landroid/view/ViewGroup;

    if-nez p1, :cond_0

    return-void

    .line 25
    :cond_0
    invoke-virtual {p0, p2}, Lcom/google/android/material/transformation/FabTransformationBehavior;->a(Landroid/view/View;)Landroid/view/ViewGroup;

    move-result-object p1

    if-nez p1, :cond_1

    return-void

    :cond_1
    const/4 p2, 0x0

    const/4 p7, 0x0

    const/4 v0, 0x1

    if-eqz p3, :cond_3

    if-nez p4, :cond_2

    .line 26
    sget-object p3, Le/f/a/c/j/c;->a:Landroid/util/Property;

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    invoke-virtual {p3, p1, p2}, Landroid/util/Property;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 27
    :cond_2
    sget-object p2, Le/f/a/c/j/c;->a:Landroid/util/Property;

    new-array p3, v0, [F

    const/high16 p4, 0x3f800000    # 1.0f

    aput p4, p3, p7

    .line 28
    invoke-static {p1, p2, p3}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object p1

    goto :goto_0

    .line 29
    :cond_3
    sget-object p3, Le/f/a/c/j/c;->a:Landroid/util/Property;

    new-array p4, v0, [F

    aput p2, p4, p7

    .line 30
    invoke-static {p1, p3, p4}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object p1

    .line 31
    :goto_0
    iget-object p2, p5, Lcom/google/android/material/transformation/FabTransformationBehavior$b;->a:Le/f/a/c/j/d;

    const-string p3, "contentFade"

    invoke-virtual {p2, p3}, Le/f/a/c/j/d;->a(Ljava/lang/String;)Le/f/a/c/j/e;

    move-result-object p2

    .line 32
    invoke-virtual {p2, p1}, Le/f/a/c/j/e;->a(Landroid/animation/Animator;)V

    .line 33
    invoke-interface {p6, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final a(Landroid/view/View;Landroid/view/View;ZZLcom/google/android/material/transformation/FabTransformationBehavior$b;Ljava/util/List;Ljava/util/List;Landroid/graphics/RectF;)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Landroid/view/View;",
            "ZZ",
            "Lcom/google/android/material/transformation/FabTransformationBehavior$b;",
            "Ljava/util/List<",
            "Landroid/animation/Animator;",
            ">;",
            "Ljava/util/List<",
            "Landroid/animation/Animator$AnimatorListener;",
            ">;",
            "Landroid/graphics/RectF;",
            ")V"
        }
    .end annotation

    move-object/from16 v10, p0

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v2, p5

    move-object/from16 v11, p6

    .line 5
    iget-object v3, v2, Lcom/google/android/material/transformation/FabTransformationBehavior$b;->b:Le/f/a/c/j/f;

    invoke-virtual {v10, v0, v1, v3}, Lcom/google/android/material/transformation/FabTransformationBehavior;->a(Landroid/view/View;Landroid/view/View;Le/f/a/c/j/f;)F

    move-result v3

    .line 6
    iget-object v4, v2, Lcom/google/android/material/transformation/FabTransformationBehavior$b;->b:Le/f/a/c/j/f;

    invoke-virtual {v10, v0, v1, v4}, Lcom/google/android/material/transformation/FabTransformationBehavior;->b(Landroid/view/View;Landroid/view/View;Le/f/a/c/j/f;)F

    move-result v0

    const/4 v4, 0x0

    cmpl-float v5, v3, v4

    if-eqz v5, :cond_4

    cmpl-float v5, v0, v4

    if-nez v5, :cond_0

    goto :goto_0

    :cond_0
    if-eqz p3, :cond_1

    cmpg-float v6, v0, v4

    if-ltz v6, :cond_2

    :cond_1
    if-nez p3, :cond_3

    if-lez v5, :cond_3

    .line 7
    :cond_2
    iget-object v5, v2, Lcom/google/android/material/transformation/FabTransformationBehavior$b;->a:Le/f/a/c/j/d;

    const-string v6, "translationXCurveUpwards"

    invoke-virtual {v5, v6}, Le/f/a/c/j/d;->a(Ljava/lang/String;)Le/f/a/c/j/e;

    move-result-object v5

    .line 8
    iget-object v6, v2, Lcom/google/android/material/transformation/FabTransformationBehavior$b;->a:Le/f/a/c/j/d;

    const-string v7, "translationYCurveUpwards"

    invoke-virtual {v6, v7}, Le/f/a/c/j/d;->a(Ljava/lang/String;)Le/f/a/c/j/e;

    move-result-object v6

    goto :goto_1

    .line 9
    :cond_3
    iget-object v5, v2, Lcom/google/android/material/transformation/FabTransformationBehavior$b;->a:Le/f/a/c/j/d;

    const-string v6, "translationXCurveDownwards"

    invoke-virtual {v5, v6}, Le/f/a/c/j/d;->a(Ljava/lang/String;)Le/f/a/c/j/e;

    move-result-object v5

    .line 10
    iget-object v6, v2, Lcom/google/android/material/transformation/FabTransformationBehavior$b;->a:Le/f/a/c/j/d;

    const-string v7, "translationYCurveDownwards"

    invoke-virtual {v6, v7}, Le/f/a/c/j/d;->a(Ljava/lang/String;)Le/f/a/c/j/e;

    move-result-object v6

    goto :goto_1

    .line 11
    :cond_4
    :goto_0
    iget-object v5, v2, Lcom/google/android/material/transformation/FabTransformationBehavior$b;->a:Le/f/a/c/j/d;

    const-string v6, "translationXLinear"

    invoke-virtual {v5, v6}, Le/f/a/c/j/d;->a(Ljava/lang/String;)Le/f/a/c/j/e;

    move-result-object v5

    .line 12
    iget-object v6, v2, Lcom/google/android/material/transformation/FabTransformationBehavior$b;->a:Le/f/a/c/j/d;

    const-string v7, "translationYLinear"

    invoke-virtual {v6, v7}, Le/f/a/c/j/d;->a(Ljava/lang/String;)Le/f/a/c/j/e;

    move-result-object v6

    :goto_1
    move-object v12, v5

    move-object v13, v6

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eqz p3, :cond_6

    if-nez p4, :cond_5

    neg-float v7, v3

    .line 13
    invoke-virtual {v1, v7}, Landroid/view/View;->setTranslationX(F)V

    neg-float v7, v0

    .line 14
    invoke-virtual {v1, v7}, Landroid/view/View;->setTranslationY(F)V

    .line 15
    :cond_5
    sget-object v7, Landroid/view/View;->TRANSLATION_X:Landroid/util/Property;

    new-array v8, v6, [F

    aput v4, v8, v5

    invoke-static {v1, v7, v8}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object v14

    .line 16
    sget-object v7, Landroid/view/View;->TRANSLATION_Y:Landroid/util/Property;

    new-array v6, v6, [F

    aput v4, v6, v5

    invoke-static {v1, v7, v6}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object v15

    neg-float v5, v3

    neg-float v6, v0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p5

    move-object v3, v12

    move-object v4, v13

    move-object/from16 v9, p8

    .line 17
    invoke-virtual/range {v0 .. v9}, Lcom/google/android/material/transformation/FabTransformationBehavior;->a(Landroid/view/View;Lcom/google/android/material/transformation/FabTransformationBehavior$b;Le/f/a/c/j/e;Le/f/a/c/j/e;FFFFLandroid/graphics/RectF;)V

    goto :goto_2

    .line 18
    :cond_6
    sget-object v2, Landroid/view/View;->TRANSLATION_X:Landroid/util/Property;

    new-array v4, v6, [F

    neg-float v3, v3

    aput v3, v4, v5

    invoke-static {v1, v2, v4}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object v14

    .line 19
    sget-object v2, Landroid/view/View;->TRANSLATION_Y:Landroid/util/Property;

    new-array v3, v6, [F

    neg-float v0, v0

    aput v0, v3, v5

    invoke-static {v1, v2, v3}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object v15

    .line 20
    :goto_2
    invoke-virtual {v12, v14}, Le/f/a/c/j/e;->a(Landroid/animation/Animator;)V

    .line 21
    invoke-virtual {v13, v15}, Le/f/a/c/j/e;->a(Landroid/animation/Animator;)V

    .line 22
    invoke-interface {v11, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 23
    invoke-interface {v11, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final a(Landroid/view/View;Lcom/google/android/material/transformation/FabTransformationBehavior$b;Le/f/a/c/j/e;Le/f/a/c/j/e;FFFFLandroid/graphics/RectF;)V
    .locals 0

    .line 48
    invoke-virtual {p0, p2, p3, p5, p7}, Lcom/google/android/material/transformation/FabTransformationBehavior;->a(Lcom/google/android/material/transformation/FabTransformationBehavior$b;Le/f/a/c/j/e;FF)F

    move-result p3

    .line 49
    invoke-virtual {p0, p2, p4, p6, p8}, Lcom/google/android/material/transformation/FabTransformationBehavior;->a(Lcom/google/android/material/transformation/FabTransformationBehavior$b;Le/f/a/c/j/e;FF)F

    move-result p2

    .line 50
    iget-object p4, p0, Lcom/google/android/material/transformation/FabTransformationBehavior;->c:Landroid/graphics/Rect;

    .line 51
    invoke-virtual {p1, p4}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    .line 52
    iget-object p5, p0, Lcom/google/android/material/transformation/FabTransformationBehavior;->d:Landroid/graphics/RectF;

    .line 53
    invoke-virtual {p5, p4}, Landroid/graphics/RectF;->set(Landroid/graphics/Rect;)V

    .line 54
    iget-object p4, p0, Lcom/google/android/material/transformation/FabTransformationBehavior;->e:Landroid/graphics/RectF;

    .line 55
    invoke-virtual {p0, p1, p4}, Lcom/google/android/material/transformation/FabTransformationBehavior;->a(Landroid/view/View;Landroid/graphics/RectF;)V

    .line 56
    invoke-virtual {p4, p3, p2}, Landroid/graphics/RectF;->offset(FF)V

    .line 57
    invoke-virtual {p4, p5}, Landroid/graphics/RectF;->intersect(Landroid/graphics/RectF;)Z

    .line 58
    invoke-virtual {p9, p4}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    return-void
.end method

.method public a(Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;)V
    .locals 1

    .line 3
    iget v0, p1, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;->h:I

    if-nez v0, :cond_0

    const/16 v0, 0x50

    .line 4
    iput v0, p1, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;->h:I

    :cond_0
    return-void
.end method

.method public a(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;)Z
    .locals 0

    .line 1
    invoke-virtual {p2}, Landroid/view/View;->getVisibility()I

    move-result p1

    const/16 p2, 0x8

    if-eq p1, p2, :cond_0

    const/4 p1, 0x0

    return p1

    .line 2
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final b(Landroid/view/View;Landroid/view/View;Le/f/a/c/j/f;)F
    .locals 2

    .line 19
    iget-object v0, p0, Lcom/google/android/material/transformation/FabTransformationBehavior;->d:Landroid/graphics/RectF;

    .line 20
    iget-object v1, p0, Lcom/google/android/material/transformation/FabTransformationBehavior;->e:Landroid/graphics/RectF;

    .line 21
    invoke-virtual {p0, p1, v0}, Lcom/google/android/material/transformation/FabTransformationBehavior;->a(Landroid/view/View;Landroid/graphics/RectF;)V

    .line 22
    invoke-virtual {p0, p2, v1}, Lcom/google/android/material/transformation/FabTransformationBehavior;->a(Landroid/view/View;Landroid/graphics/RectF;)V

    .line 23
    iget p1, p3, Le/f/a/c/j/f;->a:I

    and-int/lit8 p1, p1, 0x70

    const/16 p2, 0x10

    if-eq p1, p2, :cond_2

    const/16 p2, 0x30

    if-eq p1, p2, :cond_1

    const/16 p2, 0x50

    if-eq p1, p2, :cond_0

    const/4 p1, 0x0

    goto :goto_1

    .line 24
    :cond_0
    iget p1, v1, Landroid/graphics/RectF;->bottom:F

    iget p2, v0, Landroid/graphics/RectF;->bottom:F

    goto :goto_0

    .line 25
    :cond_1
    iget p1, v1, Landroid/graphics/RectF;->top:F

    iget p2, v0, Landroid/graphics/RectF;->top:F

    goto :goto_0

    .line 26
    :cond_2
    invoke-virtual {v1}, Landroid/graphics/RectF;->centerY()F

    move-result p1

    invoke-virtual {v0}, Landroid/graphics/RectF;->centerY()F

    move-result p2

    :goto_0
    sub-float/2addr p1, p2

    .line 27
    :goto_1
    iget p2, p3, Le/f/a/c/j/f;->c:F

    add-float/2addr p1, p2

    return p1
.end method

.method public b(Landroid/view/View;Landroid/view/View;ZZ)Landroid/animation/AnimatorSet;
    .locals 15

    move-object v10, p0

    move/from16 v11, p3

    .line 1
    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p0, v0, v11}, Lcom/google/android/material/transformation/FabTransformationBehavior;->a(Landroid/content/Context;Z)Lcom/google/android/material/transformation/FabTransformationBehavior$b;

    move-result-object v12

    .line 2
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 3
    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 4
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    move-object v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p3

    move/from16 v4, p4

    move-object v5, v12

    move-object v6, v13

    move-object v7, v14

    .line 5
    invoke-virtual/range {v0 .. v7}, Lcom/google/android/material/transformation/FabTransformationBehavior;->c(Landroid/view/View;Landroid/view/View;ZZLcom/google/android/material/transformation/FabTransformationBehavior$b;Ljava/util/List;Ljava/util/List;)V

    .line 6
    :cond_0
    iget-object v9, v10, Lcom/google/android/material/transformation/FabTransformationBehavior;->d:Landroid/graphics/RectF;

    move-object v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p3

    move/from16 v4, p4

    move-object v5, v12

    move-object v6, v13

    move-object v7, v14

    move-object v8, v9

    .line 7
    invoke-virtual/range {v0 .. v8}, Lcom/google/android/material/transformation/FabTransformationBehavior;->a(Landroid/view/View;Landroid/view/View;ZZLcom/google/android/material/transformation/FabTransformationBehavior$b;Ljava/util/List;Ljava/util/List;Landroid/graphics/RectF;)V

    .line 8
    invoke-virtual {v9}, Landroid/graphics/RectF;->width()F

    move-result v8

    .line 9
    invoke-virtual {v9}, Landroid/graphics/RectF;->height()F

    move-result v9

    .line 10
    invoke-virtual/range {v0 .. v7}, Lcom/google/android/material/transformation/FabTransformationBehavior;->d(Landroid/view/View;Landroid/view/View;ZZLcom/google/android/material/transformation/FabTransformationBehavior$b;Ljava/util/List;Ljava/util/List;)V

    move v6, v8

    move v7, v9

    move-object v8, v13

    move-object v9, v14

    .line 11
    invoke-virtual/range {v0 .. v9}, Lcom/google/android/material/transformation/FabTransformationBehavior;->a(Landroid/view/View;Landroid/view/View;ZZLcom/google/android/material/transformation/FabTransformationBehavior$b;FFLjava/util/List;Ljava/util/List;)V

    move-object v6, v13

    move-object v7, v14

    .line 12
    invoke-virtual/range {v0 .. v7}, Lcom/google/android/material/transformation/FabTransformationBehavior;->b(Landroid/view/View;Landroid/view/View;ZZLcom/google/android/material/transformation/FabTransformationBehavior$b;Ljava/util/List;Ljava/util/List;)V

    .line 13
    invoke-virtual/range {v0 .. v7}, Lcom/google/android/material/transformation/FabTransformationBehavior;->a(Landroid/view/View;Landroid/view/View;ZZLcom/google/android/material/transformation/FabTransformationBehavior$b;Ljava/util/List;Ljava/util/List;)V

    .line 14
    new-instance v0, Landroid/animation/AnimatorSet;

    invoke-direct {v0}, Landroid/animation/AnimatorSet;-><init>()V

    .line 15
    invoke-static {v0, v13}, Le/f/a/c/j/b;->a(Landroid/animation/AnimatorSet;Ljava/util/List;)V

    .line 16
    new-instance v1, Lcom/google/android/material/transformation/FabTransformationBehavior$a;

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    invoke-direct {v1, p0, v11, v3, v2}, Lcom/google/android/material/transformation/FabTransformationBehavior$a;-><init>(Lcom/google/android/material/transformation/FabTransformationBehavior;ZLandroid/view/View;Landroid/view/View;)V

    invoke-virtual {v0, v1}, Landroid/animation/AnimatorSet;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    const/4 v1, 0x0

    .line 17
    invoke-interface {v14}, Ljava/util/List;->size()I

    move-result v2

    :goto_0
    if-ge v1, v2, :cond_1

    .line 18
    invoke-interface {v14, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/animation/Animator$AnimatorListener;

    invoke-virtual {v0, v3}, Landroid/animation/AnimatorSet;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public final b(Landroid/view/View;)Landroid/view/ViewGroup;
    .locals 1

    .line 28
    instance-of v0, p1, Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    .line 29
    check-cast p1, Landroid/view/ViewGroup;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final b(Landroid/view/View;Landroid/view/View;ZZLcom/google/android/material/transformation/FabTransformationBehavior$b;Ljava/util/List;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Landroid/view/View;",
            "ZZ",
            "Lcom/google/android/material/transformation/FabTransformationBehavior$b;",
            "Ljava/util/List<",
            "Landroid/animation/Animator;",
            ">;",
            "Ljava/util/List<",
            "Landroid/animation/Animator$AnimatorListener;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method public final c(Landroid/view/View;Landroid/view/View;ZZLcom/google/android/material/transformation/FabTransformationBehavior$b;Ljava/util/List;Ljava/util/List;)V
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Landroid/view/View;",
            "ZZ",
            "Lcom/google/android/material/transformation/FabTransformationBehavior$b;",
            "Ljava/util/List<",
            "Landroid/animation/Animator;",
            ">;",
            "Ljava/util/List<",
            "Landroid/animation/Animator$AnimatorListener;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-static {p2}, Lc/h/n/v0;->k(Landroid/view/View;)F

    move-result p7

    invoke-static {p1}, Lc/h/n/v0;->k(Landroid/view/View;)F

    move-result p1

    sub-float/2addr p7, p1

    const/4 p1, 0x0

    const/4 v0, 0x1

    if-eqz p3, :cond_1

    if-nez p4, :cond_0

    neg-float p3, p7

    .line 2
    invoke-virtual {p2, p3}, Landroid/view/View;->setTranslationZ(F)V

    .line 3
    :cond_0
    sget-object p3, Landroid/view/View;->TRANSLATION_Z:Landroid/util/Property;

    new-array p4, v0, [F

    const/4 p7, 0x0

    aput p7, p4, p1

    invoke-static {p2, p3, p4}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object p1

    goto :goto_0

    .line 4
    :cond_1
    sget-object p3, Landroid/view/View;->TRANSLATION_Z:Landroid/util/Property;

    new-array p4, v0, [F

    neg-float p7, p7

    aput p7, p4, p1

    invoke-static {p2, p3, p4}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object p1

    .line 5
    :goto_0
    iget-object p2, p5, Lcom/google/android/material/transformation/FabTransformationBehavior$b;->a:Le/f/a/c/j/d;

    const-string p3, "elevation"

    invoke-virtual {p2, p3}, Le/f/a/c/j/d;->a(Ljava/lang/String;)Le/f/a/c/j/e;

    move-result-object p2

    .line 6
    invoke-virtual {p2, p1}, Le/f/a/c/j/e;->a(Landroid/animation/Animator;)V

    .line 7
    invoke-interface {p6, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final d(Landroid/view/View;Landroid/view/View;ZZLcom/google/android/material/transformation/FabTransformationBehavior$b;Ljava/util/List;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Landroid/view/View;",
            "ZZ",
            "Lcom/google/android/material/transformation/FabTransformationBehavior$b;",
            "Ljava/util/List<",
            "Landroid/animation/Animator;",
            ">;",
            "Ljava/util/List<",
            "Landroid/animation/Animator$AnimatorListener;",
            ">;)V"
        }
    .end annotation

    return-void
.end method
