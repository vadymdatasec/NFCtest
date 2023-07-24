.class public Lc/l/d/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# instance fields
.field public final synthetic a:Landroid/view/ViewGroup;

.field public final synthetic b:Landroidx/fragment/app/Fragment;

.field public final synthetic c:Lc/l/d/l2;

.field public final synthetic d:Lc/h/j/c;


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;Landroidx/fragment/app/Fragment;Lc/l/d/l2;Lc/h/j/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/l/d/i0;->a:Landroid/view/ViewGroup;

    iput-object p2, p0, Lc/l/d/i0;->b:Landroidx/fragment/app/Fragment;

    iput-object p3, p0, Lc/l/d/i0;->c:Lc/l/d/l2;

    iput-object p4, p0, Lc/l/d/i0;->d:Lc/h/j/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lc/l/d/i0;->a:Landroid/view/ViewGroup;

    new-instance v0, Lc/l/d/h0;

    invoke-direct {v0, p0}, Lc/l/d/h0;-><init>(Lc/l/d/i0;)V

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method
