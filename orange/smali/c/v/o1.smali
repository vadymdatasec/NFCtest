.class public Lc/v/o1;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lc/v/y0;

.field public final synthetic b:Landroid/view/View;


# direct methods
.method public constructor <init>(Lc/v/r1;Lc/v/y0;Landroid/view/View;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lc/v/o1;->a:Lc/v/y0;

    iput-object p3, p0, Lc/v/o1;->b:Landroid/view/View;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lc/v/o1;->a:Lc/v/y0;

    iget-object v0, p0, Lc/v/o1;->b:Landroid/view/View;

    invoke-interface {p1, v0}, Lc/v/y0;->b(Landroid/view/View;)V

    return-void
.end method
