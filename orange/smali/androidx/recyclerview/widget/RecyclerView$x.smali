.class public Landroidx/recyclerview/widget/RecyclerView$x;
.super Landroidx/recyclerview/widget/RecyclerView$i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/RecyclerView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "x"
.end annotation


# instance fields
.field public final synthetic a:Landroidx/recyclerview/widget/RecyclerView;


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$x;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$i;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$x;->a:Landroidx/recyclerview/widget/RecyclerView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->a(Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$x;->a:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->i0:Landroidx/recyclerview/widget/RecyclerView$a0;

    const/4 v2, 0x1

    iput-boolean v2, v1, Landroidx/recyclerview/widget/RecyclerView$a0;->g:Z

    .line 3
    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->b(Z)V

    .line 4
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$x;->a:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->e:Lc/r/d/a;

    invoke-virtual {v0}, Lc/r/d/a;->c()Z

    move-result v0

    if-nez v0, :cond_0

    .line 5
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$x;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->requestLayout()V

    :cond_0
    return-void
.end method

.method public a(IILjava/lang/Object;)V
    .locals 2

    .line 6
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$x;->a:Landroidx/recyclerview/widget/RecyclerView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->a(Ljava/lang/String;)V

    .line 7
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$x;->a:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->e:Lc/r/d/a;

    invoke-virtual {v0, p1, p2, p3}, Lc/r/d/a;->a(IILjava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 8
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$x;->b()V

    :cond_0
    return-void
.end method

.method public b()V
    .locals 2

    .line 1
    sget-boolean v0, Landroidx/recyclerview/widget/RecyclerView;->C0:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$x;->a:Landroidx/recyclerview/widget/RecyclerView;

    iget-boolean v1, v0, Landroidx/recyclerview/widget/RecyclerView;->t:Z

    if-eqz v1, :cond_0

    iget-boolean v1, v0, Landroidx/recyclerview/widget/RecyclerView;->s:Z

    if-eqz v1, :cond_0

    .line 2
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->i:Ljava/lang/Runnable;

    invoke-static {v0, v1}, Lc/h/n/v0;->a(Landroid/view/View;Ljava/lang/Runnable;)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$x;->a:Landroidx/recyclerview/widget/RecyclerView;

    const/4 v1, 0x1

    iput-boolean v1, v0, Landroidx/recyclerview/widget/RecyclerView;->B:Z

    .line 4
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->requestLayout()V

    :goto_0
    return-void
.end method
