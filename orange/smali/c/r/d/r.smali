.class public Lc/r/d/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:Lc/r/d/s;


# direct methods
.method public constructor <init>(Lc/r/d/s;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/r/d/r;->a:Lc/r/d/s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    const/high16 v0, 0x437f0000    # 255.0f

    mul-float p1, p1, v0

    float-to-int p1, p1

    .line 2
    iget-object v0, p0, Lc/r/d/r;->a:Lc/r/d/s;

    iget-object v0, v0, Lc/r/d/s;->c:Landroid/graphics/drawable/StateListDrawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/StateListDrawable;->setAlpha(I)V

    .line 3
    iget-object v0, p0, Lc/r/d/r;->a:Lc/r/d/s;

    iget-object v0, v0, Lc/r/d/s;->d:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 4
    iget-object p1, p0, Lc/r/d/r;->a:Lc/r/d/s;

    invoke-virtual {p1}, Lc/r/d/s;->f()V

    return-void
.end method
