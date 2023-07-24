.class public Lc/t/a/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


# instance fields
.field public final synthetic a:Lc/t/a/e;

.field public final synthetic b:Lc/t/a/f;


# direct methods
.method public constructor <init>(Lc/t/a/f;Lc/t/a/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/t/a/d;->b:Lc/t/a/f;

    iput-object p2, p0, Lc/t/a/d;->a:Lc/t/a/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lc/t/a/d;->b:Lc/t/a/f;

    iget-object v1, p0, Lc/t/a/d;->a:Lc/t/a/e;

    const/high16 v2, 0x3f800000    # 1.0f

    const/4 v3, 0x1

    invoke-virtual {v0, v2, v1, v3}, Lc/t/a/f;->a(FLc/t/a/e;Z)V

    .line 2
    iget-object v0, p0, Lc/t/a/d;->a:Lc/t/a/e;

    invoke-virtual {v0}, Lc/t/a/e;->l()V

    .line 3
    iget-object v0, p0, Lc/t/a/d;->a:Lc/t/a/e;

    invoke-virtual {v0}, Lc/t/a/e;->j()V

    .line 4
    iget-object v0, p0, Lc/t/a/d;->b:Lc/t/a/f;

    iget-boolean v1, v0, Lc/t/a/f;->g:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    .line 5
    iput-boolean v1, v0, Lc/t/a/f;->g:Z

    .line 6
    invoke-virtual {p1}, Landroid/animation/Animator;->cancel()V

    const-wide/16 v2, 0x534

    .line 7
    invoke-virtual {p1, v2, v3}, Landroid/animation/Animator;->setDuration(J)Landroid/animation/Animator;

    .line 8
    invoke-virtual {p1}, Landroid/animation/Animator;->start()V

    .line 9
    iget-object p1, p0, Lc/t/a/d;->a:Lc/t/a/e;

    invoke-virtual {p1, v1}, Lc/t/a/e;->a(Z)V

    goto :goto_0

    .line 10
    :cond_0
    iget p1, v0, Lc/t/a/f;->f:F

    add-float/2addr p1, v2

    iput p1, v0, Lc/t/a/f;->f:F

    :goto_0
    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lc/t/a/d;->b:Lc/t/a/f;

    const/4 v0, 0x0

    iput v0, p1, Lc/t/a/f;->f:F

    return-void
.end method
