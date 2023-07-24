.class public Lc/v/f0;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lc/e/b;

.field public final synthetic b:Lc/v/k0;


# direct methods
.method public constructor <init>(Lc/v/k0;Lc/e/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/v/f0;->b:Lc/v/k0;

    iput-object p2, p0, Lc/v/f0;->a:Lc/e/b;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/v/f0;->a:Lc/e/b;

    invoke-virtual {v0, p1}, Lc/e/i;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    iget-object v0, p0, Lc/v/f0;->b:Lc/v/k0;

    iget-object v0, v0, Lc/v/k0;->x:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/v/f0;->b:Lc/v/k0;

    iget-object v0, v0, Lc/v/k0;->x:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method
