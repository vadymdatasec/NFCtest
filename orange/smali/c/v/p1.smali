.class public Lc/v/p1;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"

# interfaces
.implements Lc/v/j0;
.implements Lc/v/a;


# instance fields
.field public final a:Landroid/view/View;

.field public final b:I

.field public final c:Landroid/view/ViewGroup;

.field public final d:Z

.field public e:Z

.field public f:Z


# direct methods
.method public constructor <init>(Landroid/view/View;IZ)V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lc/v/p1;->f:Z

    .line 3
    iput-object p1, p0, Lc/v/p1;->a:Landroid/view/View;

    .line 4
    iput p2, p0, Lc/v/p1;->b:I

    .line 5
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    iput-object p1, p0, Lc/v/p1;->c:Landroid/view/ViewGroup;

    .line 6
    iput-boolean p3, p0, Lc/v/p1;->d:Z

    const/4 p1, 0x1

    .line 7
    invoke-virtual {p0, p1}, Lc/v/p1;->a(Z)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 2
    iget-boolean v0, p0, Lc/v/p1;->f:Z

    if-nez v0, :cond_0

    .line 3
    iget-object v0, p0, Lc/v/p1;->a:Landroid/view/View;

    iget v1, p0, Lc/v/p1;->b:I

    invoke-static {v0, v1}, Lc/v/j1;->a(Landroid/view/View;I)V

    .line 4
    iget-object v0, p0, Lc/v/p1;->c:Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    .line 5
    invoke-virtual {v0}, Landroid/view/ViewGroup;->invalidate()V

    :cond_0
    const/4 v0, 0x0

    .line 6
    invoke-virtual {p0, v0}, Lc/v/p1;->a(Z)V

    return-void
.end method

.method public a(Lc/v/k0;)V
    .locals 0

    const/4 p1, 0x0

    .line 1
    invoke-virtual {p0, p1}, Lc/v/p1;->a(Z)V

    return-void
.end method

.method public final a(Z)V
    .locals 1

    .line 7
    iget-boolean v0, p0, Lc/v/p1;->d:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lc/v/p1;->e:Z

    if-eq v0, p1, :cond_0

    iget-object v0, p0, Lc/v/p1;->c:Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    .line 8
    iput-boolean p1, p0, Lc/v/p1;->e:Z

    .line 9
    invoke-static {v0, p1}, Lc/v/z0;->a(Landroid/view/ViewGroup;Z)V

    :cond_0
    return-void
.end method

.method public b(Lc/v/k0;)V
    .locals 0

    const/4 p1, 0x1

    .line 1
    invoke-virtual {p0, p1}, Lc/v/p1;->a(Z)V

    return-void
.end method

.method public c(Lc/v/k0;)V
    .locals 0

    return-void
.end method

.method public d(Lc/v/k0;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lc/v/p1;->a()V

    .line 2
    invoke-virtual {p1, p0}, Lc/v/k0;->b(Lc/v/j0;)Lc/v/k0;

    return-void
.end method

.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 0

    const/4 p1, 0x1

    .line 1
    iput-boolean p1, p0, Lc/v/p1;->f:Z

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lc/v/p1;->a()V

    return-void
.end method

.method public onAnimationPause(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    iget-boolean p1, p0, Lc/v/p1;->f:Z

    if-nez p1, :cond_0

    .line 2
    iget-object p1, p0, Lc/v/p1;->a:Landroid/view/View;

    iget v0, p0, Lc/v/p1;->b:I

    invoke-static {p1, v0}, Lc/v/j1;->a(Landroid/view/View;I)V

    :cond_0
    return-void
.end method

.method public onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public onAnimationResume(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    iget-boolean p1, p0, Lc/v/p1;->f:Z

    if-nez p1, :cond_0

    .line 2
    iget-object p1, p0, Lc/v/p1;->a:Landroid/view/View;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lc/v/j1;->a(Landroid/view/View;I)V

    :cond_0
    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method
