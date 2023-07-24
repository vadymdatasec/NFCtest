.class public Lc/r/d/i;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# instance fields
.field public final synthetic a:Landroidx/recyclerview/widget/RecyclerView$d0;

.field public final synthetic b:I

.field public final synthetic c:Landroid/view/View;

.field public final synthetic d:I

.field public final synthetic e:Landroid/view/ViewPropertyAnimator;

.field public final synthetic f:Lc/r/d/n;


# direct methods
.method public constructor <init>(Lc/r/d/n;Landroidx/recyclerview/widget/RecyclerView$d0;ILandroid/view/View;ILandroid/view/ViewPropertyAnimator;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/r/d/i;->f:Lc/r/d/n;

    iput-object p2, p0, Lc/r/d/i;->a:Landroidx/recyclerview/widget/RecyclerView$d0;

    iput p3, p0, Lc/r/d/i;->b:I

    iput-object p4, p0, Lc/r/d/i;->c:Landroid/view/View;

    iput p5, p0, Lc/r/d/i;->d:I

    iput-object p6, p0, Lc/r/d/i;->e:Landroid/view/ViewPropertyAnimator;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    iget p1, p0, Lc/r/d/i;->b:I

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lc/r/d/i;->c:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationX(F)V

    .line 3
    :cond_0
    iget p1, p0, Lc/r/d/i;->d:I

    if-eqz p1, :cond_1

    .line 4
    iget-object p1, p0, Lc/r/d/i;->c:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationY(F)V

    :cond_1
    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lc/r/d/i;->e:Landroid/view/ViewPropertyAnimator;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    .line 2
    iget-object p1, p0, Lc/r/d/i;->f:Lc/r/d/n;

    iget-object v0, p0, Lc/r/d/i;->a:Landroidx/recyclerview/widget/RecyclerView$d0;

    invoke-virtual {p1, v0}, Lc/r/d/l0;->j(Landroidx/recyclerview/widget/RecyclerView$d0;)V

    .line 3
    iget-object p1, p0, Lc/r/d/i;->f:Lc/r/d/n;

    iget-object p1, p1, Lc/r/d/n;->p:Ljava/util/ArrayList;

    iget-object v0, p0, Lc/r/d/i;->a:Landroidx/recyclerview/widget/RecyclerView$d0;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 4
    iget-object p1, p0, Lc/r/d/i;->f:Lc/r/d/n;

    invoke-virtual {p1}, Lc/r/d/n;->j()V

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lc/r/d/i;->f:Lc/r/d/n;

    iget-object v0, p0, Lc/r/d/i;->a:Landroidx/recyclerview/widget/RecyclerView$d0;

    invoke-virtual {p1, v0}, Lc/r/d/l0;->k(Landroidx/recyclerview/widget/RecyclerView$d0;)V

    return-void
.end method
