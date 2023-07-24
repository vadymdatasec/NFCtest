.class public Lc/l/d/s0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field public final synthetic b:Lc/l/d/a2;

.field public final synthetic c:Lc/l/d/t0;


# direct methods
.method public constructor <init>(Lc/l/d/t0;Lc/l/d/a2;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/l/d/s0;->c:Lc/l/d/t0;

    iput-object p2, p0, Lc/l/d/s0;->b:Lc/l/d/a2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onViewAttachedToWindow(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lc/l/d/s0;->b:Lc/l/d/a2;

    invoke-virtual {p1}, Lc/l/d/a2;->k()Landroidx/fragment/app/Fragment;

    move-result-object p1

    .line 2
    iget-object v0, p0, Lc/l/d/s0;->b:Lc/l/d/a2;

    invoke-virtual {v0}, Lc/l/d/a2;->l()V

    .line 3
    iget-object p1, p1, Landroidx/fragment/app/Fragment;->I:Landroid/view/View;

    .line 4
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    iget-object v0, p0, Lc/l/d/s0;->c:Lc/l/d/t0;

    iget-object v0, v0, Lc/l/d/t0;->b:Lc/l/d/o1;

    invoke-static {p1, v0}, Lc/l/d/i3;->a(Landroid/view/ViewGroup;Lc/l/d/o1;)Lc/l/d/i3;

    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lc/l/d/i3;->b()V

    return-void
.end method

.method public onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 0

    return-void
.end method
