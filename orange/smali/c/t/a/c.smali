.class public Lc/t/a/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:Lc/t/a/e;

.field public final synthetic b:Lc/t/a/f;


# direct methods
.method public constructor <init>(Lc/t/a/f;Lc/t/a/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/t/a/c;->b:Lc/t/a/f;

    iput-object p2, p0, Lc/t/a/c;->a:Lc/t/a/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    .line 2
    iget-object v0, p0, Lc/t/a/c;->b:Lc/t/a/f;

    iget-object v1, p0, Lc/t/a/c;->a:Lc/t/a/e;

    invoke-virtual {v0, p1, v1}, Lc/t/a/f;->b(FLc/t/a/e;)V

    .line 3
    iget-object v0, p0, Lc/t/a/c;->b:Lc/t/a/f;

    iget-object v1, p0, Lc/t/a/c;->a:Lc/t/a/e;

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v1, v2}, Lc/t/a/f;->a(FLc/t/a/e;Z)V

    .line 4
    iget-object p1, p0, Lc/t/a/c;->b:Lc/t/a/f;

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method
