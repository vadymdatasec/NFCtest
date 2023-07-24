.class public Lc/v/g0;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lc/v/k0;


# direct methods
.method public constructor <init>(Lc/v/k0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/v/g0;->a:Lc/v/k0;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/v/g0;->a:Lc/v/k0;

    invoke-virtual {v0}, Lc/v/k0;->a()V

    .line 2
    invoke-virtual {p1, p0}, Landroid/animation/Animator;->removeListener(Landroid/animation/Animator$AnimatorListener;)V

    return-void
.end method
