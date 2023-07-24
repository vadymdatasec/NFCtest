.class public Lc/h/n/a1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:Lc/h/n/f1;

.field public final synthetic b:Landroid/view/View;


# direct methods
.method public constructor <init>(Lc/h/n/c1;Lc/h/n/f1;Landroid/view/View;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lc/h/n/a1;->a:Lc/h/n/f1;

    iput-object p3, p0, Lc/h/n/a1;->b:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lc/h/n/a1;->a:Lc/h/n/f1;

    iget-object v0, p0, Lc/h/n/a1;->b:Landroid/view/View;

    invoke-interface {p1, v0}, Lc/h/n/f1;->a(Landroid/view/View;)V

    return-void
.end method
