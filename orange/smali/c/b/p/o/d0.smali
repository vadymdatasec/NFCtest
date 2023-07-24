.class public Lc/b/p/o/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# instance fields
.field public final synthetic b:Lc/b/p/o/f0;


# direct methods
.method public constructor <init>(Lc/b/p/o/f0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/b/p/o/d0;->b:Lc/b/p/o/f0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/b/p/o/d0;->b:Lc/b/p/o/f0;

    invoke-virtual {v0}, Lc/b/p/o/f0;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lc/b/p/o/d0;->b:Lc/b/p/o/f0;

    iget-object v0, v0, Lc/b/p/o/f0;->j:Lc/b/q/s1;

    invoke-virtual {v0}, Lc/b/q/p1;->m()Z

    move-result v0

    if-nez v0, :cond_2

    .line 2
    iget-object v0, p0, Lc/b/p/o/d0;->b:Lc/b/p/o/f0;

    iget-object v0, v0, Lc/b/p/o/f0;->o:Landroid/view/View;

    if-eqz v0, :cond_1

    .line 3
    invoke-virtual {v0}, Landroid/view/View;->isShown()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lc/b/p/o/d0;->b:Lc/b/p/o/f0;

    iget-object v0, v0, Lc/b/p/o/f0;->j:Lc/b/q/s1;

    invoke-virtual {v0}, Lc/b/q/p1;->a()V

    goto :goto_1

    .line 5
    :cond_1
    :goto_0
    iget-object v0, p0, Lc/b/p/o/d0;->b:Lc/b/p/o/f0;

    invoke-virtual {v0}, Lc/b/p/o/f0;->dismiss()V

    :cond_2
    :goto_1
    return-void
.end method
