.class public Lc/h/n/z0;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lc/h/n/d1;

.field public final synthetic b:Landroid/view/View;


# direct methods
.method public constructor <init>(Lc/h/n/c1;Lc/h/n/d1;Landroid/view/View;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lc/h/n/z0;->a:Lc/h/n/d1;

    iput-object p3, p0, Lc/h/n/z0;->b:Landroid/view/View;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lc/h/n/z0;->a:Lc/h/n/d1;

    iget-object v0, p0, Lc/h/n/z0;->b:Landroid/view/View;

    invoke-interface {p1, v0}, Lc/h/n/d1;->c(Landroid/view/View;)V

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lc/h/n/z0;->a:Lc/h/n/d1;

    iget-object v0, p0, Lc/h/n/z0;->b:Landroid/view/View;

    invoke-interface {p1, v0}, Lc/h/n/d1;->a(Landroid/view/View;)V

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lc/h/n/z0;->a:Lc/h/n/d1;

    iget-object v0, p0, Lc/h/n/z0;->b:Landroid/view/View;

    invoke-interface {p1, v0}, Lc/h/n/d1;->b(Landroid/view/View;)V

    return-void
.end method
