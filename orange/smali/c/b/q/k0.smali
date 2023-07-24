.class public Lc/b/q/k0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# instance fields
.field public final synthetic b:Lc/b/q/m0;


# direct methods
.method public constructor <init>(Lc/b/q/m0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/b/q/k0;->b:Lc/b/q/m0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/b/q/k0;->b:Lc/b/q/m0;

    iget-object v1, v0, Lc/b/q/m0;->N:Lc/b/q/q0;

    invoke-virtual {v0, v1}, Lc/b/q/m0;->b(Landroid/view/View;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lc/b/q/k0;->b:Lc/b/q/m0;

    invoke-virtual {v0}, Lc/b/q/p1;->dismiss()V

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lc/b/q/k0;->b:Lc/b/q/m0;

    invoke-virtual {v0}, Lc/b/q/m0;->o()V

    .line 4
    iget-object v0, p0, Lc/b/q/k0;->b:Lc/b/q/m0;

    invoke-static {v0}, Lc/b/q/m0;->a(Lc/b/q/m0;)V

    :goto_0
    return-void
.end method
