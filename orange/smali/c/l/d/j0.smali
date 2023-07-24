.class public Lc/l/d/j0;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# instance fields
.field public final synthetic a:Landroid/view/ViewGroup;

.field public final synthetic b:Landroid/view/View;

.field public final synthetic c:Landroidx/fragment/app/Fragment;

.field public final synthetic d:Lc/l/d/l2;

.field public final synthetic e:Lc/h/j/c;


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;Landroid/view/View;Landroidx/fragment/app/Fragment;Lc/l/d/l2;Lc/h/j/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/l/d/j0;->a:Landroid/view/ViewGroup;

    iput-object p2, p0, Lc/l/d/j0;->b:Landroid/view/View;

    iput-object p3, p0, Lc/l/d/j0;->c:Landroidx/fragment/app/Fragment;

    iput-object p4, p0, Lc/l/d/j0;->d:Lc/l/d/l2;

    iput-object p5, p0, Lc/l/d/j0;->e:Lc/h/j/c;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lc/l/d/j0;->a:Landroid/view/ViewGroup;

    iget-object v0, p0, Lc/l/d/j0;->b:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->endViewTransition(Landroid/view/View;)V

    .line 2
    iget-object p1, p0, Lc/l/d/j0;->c:Landroidx/fragment/app/Fragment;

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->k()Landroid/animation/Animator;

    move-result-object p1

    .line 3
    iget-object v0, p0, Lc/l/d/j0;->c:Landroidx/fragment/app/Fragment;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->a(Landroid/animation/Animator;)V

    if-eqz p1, :cond_0

    .line 4
    iget-object p1, p0, Lc/l/d/j0;->a:Landroid/view/ViewGroup;

    iget-object v0, p0, Lc/l/d/j0;->b:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result p1

    if-gez p1, :cond_0

    .line 5
    iget-object p1, p0, Lc/l/d/j0;->d:Lc/l/d/l2;

    iget-object v0, p0, Lc/l/d/j0;->c:Landroidx/fragment/app/Fragment;

    iget-object v1, p0, Lc/l/d/j0;->e:Lc/h/j/c;

    invoke-interface {p1, v0, v1}, Lc/l/d/l2;->a(Landroidx/fragment/app/Fragment;Lc/h/j/c;)V

    :cond_0
    return-void
.end method
