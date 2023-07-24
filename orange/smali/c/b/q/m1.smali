.class public Lc/b/q/m1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AbsListView$OnScrollListener;


# instance fields
.field public final synthetic a:Lc/b/q/p1;


# direct methods
.method public constructor <init>(Lc/b/q/p1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/b/q/m1;->a:Lc/b/q/p1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onScroll(Landroid/widget/AbsListView;III)V
    .locals 0

    return-void
.end method

.method public onScrollStateChanged(Landroid/widget/AbsListView;I)V
    .locals 0

    const/4 p1, 0x1

    if-ne p2, p1, :cond_0

    .line 1
    iget-object p1, p0, Lc/b/q/m1;->a:Lc/b/q/p1;

    .line 2
    invoke-virtual {p1}, Lc/b/q/p1;->l()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lc/b/q/m1;->a:Lc/b/q/p1;

    iget-object p1, p1, Lc/b/q/p1;->F:Landroid/widget/PopupWindow;

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 3
    iget-object p1, p0, Lc/b/q/m1;->a:Lc/b/q/p1;

    iget-object p2, p1, Lc/b/q/p1;->B:Landroid/os/Handler;

    iget-object p1, p1, Lc/b/q/p1;->x:Lc/b/q/o1;

    invoke-virtual {p2, p1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 4
    iget-object p1, p0, Lc/b/q/m1;->a:Lc/b/q/p1;

    iget-object p1, p1, Lc/b/q/p1;->x:Lc/b/q/o1;

    invoke-virtual {p1}, Lc/b/q/o1;->run()V

    :cond_0
    return-void
.end method
