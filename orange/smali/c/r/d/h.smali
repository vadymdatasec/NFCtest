.class public Lc/r/d/h;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# instance fields
.field public final synthetic a:Landroidx/recyclerview/widget/RecyclerView$d0;

.field public final synthetic b:Landroid/view/View;

.field public final synthetic c:Landroid/view/ViewPropertyAnimator;

.field public final synthetic d:Lc/r/d/n;


# direct methods
.method public constructor <init>(Lc/r/d/n;Landroidx/recyclerview/widget/RecyclerView$d0;Landroid/view/View;Landroid/view/ViewPropertyAnimator;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/r/d/h;->d:Lc/r/d/n;

    iput-object p2, p0, Lc/r/d/h;->a:Landroidx/recyclerview/widget/RecyclerView$d0;

    iput-object p3, p0, Lc/r/d/h;->b:Landroid/view/View;

    iput-object p4, p0, Lc/r/d/h;->c:Landroid/view/ViewPropertyAnimator;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lc/r/d/h;->b:Landroid/view/View;

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lc/r/d/h;->c:Landroid/view/ViewPropertyAnimator;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    .line 2
    iget-object p1, p0, Lc/r/d/h;->d:Lc/r/d/n;

    iget-object v0, p0, Lc/r/d/h;->a:Landroidx/recyclerview/widget/RecyclerView$d0;

    invoke-virtual {p1, v0}, Lc/r/d/l0;->h(Landroidx/recyclerview/widget/RecyclerView$d0;)V

    .line 3
    iget-object p1, p0, Lc/r/d/h;->d:Lc/r/d/n;

    iget-object p1, p1, Lc/r/d/n;->o:Ljava/util/ArrayList;

    iget-object v0, p0, Lc/r/d/h;->a:Landroidx/recyclerview/widget/RecyclerView$d0;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 4
    iget-object p1, p0, Lc/r/d/h;->d:Lc/r/d/n;

    invoke-virtual {p1}, Lc/r/d/n;->j()V

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lc/r/d/h;->d:Lc/r/d/n;

    iget-object v0, p0, Lc/r/d/h;->a:Landroidx/recyclerview/widget/RecyclerView$d0;

    invoke-virtual {p1, v0}, Lc/r/d/l0;->i(Landroidx/recyclerview/widget/RecyclerView$d0;)V

    return-void
.end method
