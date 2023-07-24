.class public Lc/l/d/f;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# instance fields
.field public final synthetic a:Landroid/view/ViewGroup;

.field public final synthetic b:Landroid/view/View;

.field public final synthetic c:Z

.field public final synthetic d:Lc/l/d/h3;

.field public final synthetic e:Lc/l/d/o;


# direct methods
.method public constructor <init>(Lc/l/d/r;Landroid/view/ViewGroup;Landroid/view/View;ZLc/l/d/h3;Lc/l/d/o;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lc/l/d/f;->a:Landroid/view/ViewGroup;

    iput-object p3, p0, Lc/l/d/f;->b:Landroid/view/View;

    iput-boolean p4, p0, Lc/l/d/f;->c:Z

    iput-object p5, p0, Lc/l/d/f;->d:Lc/l/d/h3;

    iput-object p6, p0, Lc/l/d/f;->e:Lc/l/d/o;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lc/l/d/f;->a:Landroid/view/ViewGroup;

    iget-object v0, p0, Lc/l/d/f;->b:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->endViewTransition(Landroid/view/View;)V

    .line 2
    iget-boolean p1, p0, Lc/l/d/f;->c:Z

    if-eqz p1, :cond_0

    .line 3
    iget-object p1, p0, Lc/l/d/f;->d:Lc/l/d/h3;

    invoke-virtual {p1}, Lc/l/d/h3;->c()Lc/l/d/g3;

    move-result-object p1

    iget-object v0, p0, Lc/l/d/f;->b:Landroid/view/View;

    invoke-virtual {p1, v0}, Lc/l/d/g3;->a(Landroid/view/View;)V

    .line 4
    :cond_0
    iget-object p1, p0, Lc/l/d/f;->e:Lc/l/d/o;

    invoke-virtual {p1}, Lc/l/d/p;->a()V

    return-void
.end method
