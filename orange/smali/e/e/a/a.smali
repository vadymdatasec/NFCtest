.class public final Le/e/a/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Le/e/a/a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Le/e/a/a;

    invoke-direct {v0}, Le/e/a/a;-><init>()V

    sput-object v0, Le/e/a/a;->a:Le/e/a/a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;II)Landroid/view/View;
    .locals 7

    const-string v0, "view"

    invoke-static {p1, v0}, Li/h/c/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    new-array v1, v0, [Landroid/animation/PropertyValuesHolder;

    const/4 v2, 0x1

    new-array v3, v2, [F

    const v4, 0x3f866666    # 1.05f

    const/4 v5, 0x0

    aput v4, v3, v5

    const-string v6, "scaleX"

    .line 5
    invoke-static {v6, v3}, Landroid/animation/PropertyValuesHolder;->ofFloat(Ljava/lang/String;[F)Landroid/animation/PropertyValuesHolder;

    move-result-object v3

    aput-object v3, v1, v5

    new-array v3, v2, [F

    aput v4, v3, v5

    const-string v4, "scaleY"

    .line 6
    invoke-static {v4, v3}, Landroid/animation/PropertyValuesHolder;->ofFloat(Ljava/lang/String;[F)Landroid/animation/PropertyValuesHolder;

    move-result-object v3

    aput-object v3, v1, v2

    .line 7
    invoke-static {p1, v1}, Landroid/animation/ObjectAnimator;->ofPropertyValuesHolder(Ljava/lang/Object;[Landroid/animation/PropertyValuesHolder;)Landroid/animation/ObjectAnimator;

    move-result-object v1

    const-string v2, "objAnim"

    .line 8
    invoke-static {v1, v2}, Li/h/c/k;->a(Ljava/lang/Object;Ljava/lang/String;)V

    int-to-long v2, p3

    invoke-virtual {v1, v2, v3}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    int-to-long p2, p2

    .line 9
    invoke-virtual {v1, p2, p3}, Landroid/animation/ObjectAnimator;->setStartDelay(J)V

    const/4 p2, -0x1

    .line 10
    invoke-virtual {v1, p2}, Landroid/animation/ObjectAnimator;->setRepeatCount(I)V

    .line 11
    invoke-virtual {v1, v0}, Landroid/animation/ObjectAnimator;->setRepeatMode(I)V

    .line 12
    invoke-virtual {v1}, Landroid/animation/ObjectAnimator;->start()V

    return-object p1
.end method

.method public final a(Landroid/view/View;Landroid/view/animation/Animation;)Landroid/view/View;
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Li/h/c/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "animation"

    invoke-static {p2, v0}, Li/h/c/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    invoke-virtual {p1, p2}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    return-object p1
.end method

.method public final a(II)Landroid/view/animation/Animation;
    .locals 3

    .line 1
    new-instance v0, Landroid/view/animation/AlphaAnimation;

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-direct {v0, v1, v2}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    int-to-long v1, p1

    .line 2
    invoke-virtual {v0, v1, v2}, Landroid/view/animation/AlphaAnimation;->setStartOffset(J)V

    .line 3
    new-instance p1, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {p1}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-virtual {v0, p1}, Landroid/view/animation/AlphaAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    int-to-long p1, p2

    .line 4
    invoke-virtual {v0, p1, p2}, Landroid/view/animation/AlphaAnimation;->setDuration(J)V

    return-object v0
.end method

.method public final b(II)Landroid/view/animation/Animation;
    .locals 10

    .line 1
    new-instance v9, Landroid/view/animation/ScaleAnimation;

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    const/4 v3, 0x0

    const/high16 v4, 0x3f800000    # 1.0f

    const/4 v5, 0x1

    const/high16 v6, 0x3f000000    # 0.5f

    const/4 v7, 0x1

    const/high16 v8, 0x3f000000    # 0.5f

    move-object v0, v9

    invoke-direct/range {v0 .. v8}, Landroid/view/animation/ScaleAnimation;-><init>(FFFFIFIF)V

    const/4 v0, 0x1

    .line 2
    invoke-virtual {v9, v0}, Landroid/view/animation/ScaleAnimation;->setFillAfter(Z)V

    int-to-long v0, p1

    .line 3
    invoke-virtual {v9, v0, v1}, Landroid/view/animation/ScaleAnimation;->setStartOffset(J)V

    int-to-long p1, p2

    .line 4
    invoke-virtual {v9, p1, p2}, Landroid/view/animation/ScaleAnimation;->setDuration(J)V

    return-object v9
.end method
