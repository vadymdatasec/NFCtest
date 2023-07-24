.class public Lc/r/d/j;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lc/r/d/l;

.field public final synthetic b:Landroid/view/ViewPropertyAnimator;

.field public final synthetic c:Landroid/view/View;

.field public final synthetic d:Lc/r/d/n;


# direct methods
.method public constructor <init>(Lc/r/d/n;Lc/r/d/l;Landroid/view/ViewPropertyAnimator;Landroid/view/View;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/r/d/j;->d:Lc/r/d/n;

    iput-object p2, p0, Lc/r/d/j;->a:Lc/r/d/l;

    iput-object p3, p0, Lc/r/d/j;->b:Landroid/view/ViewPropertyAnimator;

    iput-object p4, p0, Lc/r/d/j;->c:Landroid/view/View;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lc/r/d/j;->b:Landroid/view/ViewPropertyAnimator;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    .line 2
    iget-object p1, p0, Lc/r/d/j;->c:Landroid/view/View;

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    .line 3
    iget-object p1, p0, Lc/r/d/j;->c:Landroid/view/View;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationX(F)V

    .line 4
    iget-object p1, p0, Lc/r/d/j;->c:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationY(F)V

    .line 5
    iget-object p1, p0, Lc/r/d/j;->d:Lc/r/d/n;

    iget-object v0, p0, Lc/r/d/j;->a:Lc/r/d/l;

    iget-object v0, v0, Lc/r/d/l;->a:Landroidx/recyclerview/widget/RecyclerView$d0;

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Lc/r/d/l0;->a(Landroidx/recyclerview/widget/RecyclerView$d0;Z)V

    .line 6
    iget-object p1, p0, Lc/r/d/j;->d:Lc/r/d/n;

    iget-object p1, p1, Lc/r/d/n;->r:Ljava/util/ArrayList;

    iget-object v0, p0, Lc/r/d/j;->a:Lc/r/d/l;

    iget-object v0, v0, Lc/r/d/l;->a:Landroidx/recyclerview/widget/RecyclerView$d0;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 7
    iget-object p1, p0, Lc/r/d/j;->d:Lc/r/d/n;

    invoke-virtual {p1}, Lc/r/d/n;->j()V

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lc/r/d/j;->d:Lc/r/d/n;

    iget-object v0, p0, Lc/r/d/j;->a:Lc/r/d/l;

    iget-object v0, v0, Lc/r/d/l;->a:Landroidx/recyclerview/widget/RecyclerView$d0;

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Lc/r/d/l0;->b(Landroidx/recyclerview/widget/RecyclerView$d0;Z)V

    return-void
.end method
