.class public Lc/l/d/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# instance fields
.field public final synthetic a:Landroid/view/ViewGroup;

.field public final synthetic b:Landroid/view/View;

.field public final synthetic c:Lc/l/d/o;


# direct methods
.method public constructor <init>(Lc/l/d/r;Landroid/view/ViewGroup;Landroid/view/View;Lc/l/d/o;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lc/l/d/i;->a:Landroid/view/ViewGroup;

    iput-object p3, p0, Lc/l/d/i;->b:Landroid/view/View;

    iput-object p4, p0, Lc/l/d/i;->c:Lc/l/d/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lc/l/d/i;->a:Landroid/view/ViewGroup;

    new-instance v0, Lc/l/d/h;

    invoke-direct {v0, p0}, Lc/l/d/h;-><init>(Lc/l/d/i;)V

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
