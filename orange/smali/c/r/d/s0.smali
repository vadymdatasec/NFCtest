.class public Lc/r/d/s0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc/r/d/s0$a;
    }
.end annotation


# instance fields
.field public final a:Lc/e/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/e/i<",
            "Landroidx/recyclerview/widget/RecyclerView$d0;",
            "Lc/r/d/r0;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lc/e/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/e/f<",
            "Landroidx/recyclerview/widget/RecyclerView$d0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lc/e/i;

    invoke-direct {v0}, Lc/e/i;-><init>()V

    iput-object v0, p0, Lc/r/d/s0;->a:Lc/e/i;

    .line 3
    new-instance v0, Lc/e/f;

    invoke-direct {v0}, Lc/e/f;-><init>()V

    iput-object v0, p0, Lc/r/d/s0;->b:Lc/e/f;

    return-void
.end method


# virtual methods
.method public a(J)Landroidx/recyclerview/widget/RecyclerView$d0;
    .locals 1

    .line 19
    iget-object v0, p0, Lc/r/d/s0;->b:Lc/e/f;

    invoke-virtual {v0, p1, p2}, Lc/e/f;->b(J)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/recyclerview/widget/RecyclerView$d0;

    return-object p1
.end method

.method public final a(Landroidx/recyclerview/widget/RecyclerView$d0;I)Landroidx/recyclerview/widget/RecyclerView$l$b;
    .locals 4

    .line 3
    iget-object v0, p0, Lc/r/d/s0;->a:Lc/e/i;

    invoke-virtual {v0, p1}, Lc/e/i;->a(Ljava/lang/Object;)I

    move-result p1

    const/4 v0, 0x0

    if-gez p1, :cond_0

    return-object v0

    .line 4
    :cond_0
    iget-object v1, p0, Lc/r/d/s0;->a:Lc/e/i;

    invoke-virtual {v1, p1}, Lc/e/i;->e(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/r/d/r0;

    if-eqz v1, :cond_4

    .line 5
    iget v2, v1, Lc/r/d/r0;->a:I

    and-int v3, v2, p2

    if-eqz v3, :cond_4

    not-int v0, p2

    and-int/2addr v0, v2

    .line 6
    iput v0, v1, Lc/r/d/r0;->a:I

    const/4 v0, 0x4

    if-ne p2, v0, :cond_1

    .line 7
    iget-object p2, v1, Lc/r/d/r0;->b:Landroidx/recyclerview/widget/RecyclerView$l$b;

    goto :goto_0

    :cond_1
    const/16 v0, 0x8

    if-ne p2, v0, :cond_3

    .line 8
    iget-object p2, v1, Lc/r/d/r0;->c:Landroidx/recyclerview/widget/RecyclerView$l$b;

    .line 9
    :goto_0
    iget v0, v1, Lc/r/d/r0;->a:I

    and-int/lit8 v0, v0, 0xc

    if-nez v0, :cond_2

    .line 10
    iget-object v0, p0, Lc/r/d/s0;->a:Lc/e/i;

    invoke-virtual {v0, p1}, Lc/e/i;->d(I)Ljava/lang/Object;

    .line 11
    invoke-static {v1}, Lc/r/d/r0;->a(Lc/r/d/r0;)V

    :cond_2
    return-object p2

    .line 12
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Must provide flag PRE or POST"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    return-object v0
.end method

.method public a()V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/r/d/s0;->a:Lc/e/i;

    invoke-virtual {v0}, Lc/e/i;->clear()V

    .line 2
    iget-object v0, p0, Lc/r/d/s0;->b:Lc/e/f;

    invoke-virtual {v0}, Lc/e/f;->a()V

    return-void
.end method

.method public a(JLandroidx/recyclerview/widget/RecyclerView$d0;)V
    .locals 1

    .line 13
    iget-object v0, p0, Lc/r/d/s0;->b:Lc/e/f;

    invoke-virtual {v0, p1, p2, p3}, Lc/e/f;->c(JLjava/lang/Object;)V

    return-void
.end method

.method public a(Landroidx/recyclerview/widget/RecyclerView$d0;)V
    .locals 2

    .line 20
    iget-object v0, p0, Lc/r/d/s0;->a:Lc/e/i;

    invoke-virtual {v0, p1}, Lc/e/i;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/r/d/r0;

    if-nez v0, :cond_0

    .line 21
    invoke-static {}, Lc/r/d/r0;->b()Lc/r/d/r0;

    move-result-object v0

    .line 22
    iget-object v1, p0, Lc/r/d/s0;->a:Lc/e/i;

    invoke-virtual {v1, p1, v0}, Lc/e/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    :cond_0
    iget p1, v0, Lc/r/d/r0;->a:I

    or-int/lit8 p1, p1, 0x1

    iput p1, v0, Lc/r/d/r0;->a:I

    return-void
.end method

.method public a(Landroidx/recyclerview/widget/RecyclerView$d0;Landroidx/recyclerview/widget/RecyclerView$l$b;)V
    .locals 2

    .line 14
    iget-object v0, p0, Lc/r/d/s0;->a:Lc/e/i;

    invoke-virtual {v0, p1}, Lc/e/i;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/r/d/r0;

    if-nez v0, :cond_0

    .line 15
    invoke-static {}, Lc/r/d/r0;->b()Lc/r/d/r0;

    move-result-object v0

    .line 16
    iget-object v1, p0, Lc/r/d/s0;->a:Lc/e/i;

    invoke-virtual {v1, p1, v0}, Lc/e/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    :cond_0
    iget p1, v0, Lc/r/d/r0;->a:I

    or-int/lit8 p1, p1, 0x2

    iput p1, v0, Lc/r/d/r0;->a:I

    .line 18
    iput-object p2, v0, Lc/r/d/r0;->b:Landroidx/recyclerview/widget/RecyclerView$l$b;

    return-void
.end method

.method public a(Lc/r/d/s0$a;)V
    .locals 6

    .line 24
    iget-object v0, p0, Lc/r/d/s0;->a:Lc/e/i;

    invoke-virtual {v0}, Lc/e/i;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_7

    .line 25
    iget-object v1, p0, Lc/r/d/s0;->a:Lc/e/i;

    invoke-virtual {v1, v0}, Lc/e/i;->c(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/recyclerview/widget/RecyclerView$d0;

    .line 26
    iget-object v2, p0, Lc/r/d/s0;->a:Lc/e/i;

    invoke-virtual {v2, v0}, Lc/e/i;->d(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc/r/d/r0;

    .line 27
    iget v3, v2, Lc/r/d/r0;->a:I

    and-int/lit8 v4, v3, 0x3

    const/4 v5, 0x3

    if-ne v4, v5, :cond_0

    .line 28
    invoke-interface {p1, v1}, Lc/r/d/s0$a;->a(Landroidx/recyclerview/widget/RecyclerView$d0;)V

    goto :goto_1

    :cond_0
    and-int/lit8 v4, v3, 0x1

    if-eqz v4, :cond_2

    .line 29
    iget-object v3, v2, Lc/r/d/r0;->b:Landroidx/recyclerview/widget/RecyclerView$l$b;

    if-nez v3, :cond_1

    .line 30
    invoke-interface {p1, v1}, Lc/r/d/s0$a;->a(Landroidx/recyclerview/widget/RecyclerView$d0;)V

    goto :goto_1

    .line 31
    :cond_1
    iget-object v4, v2, Lc/r/d/r0;->c:Landroidx/recyclerview/widget/RecyclerView$l$b;

    invoke-interface {p1, v1, v3, v4}, Lc/r/d/s0$a;->b(Landroidx/recyclerview/widget/RecyclerView$d0;Landroidx/recyclerview/widget/RecyclerView$l$b;Landroidx/recyclerview/widget/RecyclerView$l$b;)V

    goto :goto_1

    :cond_2
    and-int/lit8 v4, v3, 0xe

    const/16 v5, 0xe

    if-ne v4, v5, :cond_3

    .line 32
    iget-object v3, v2, Lc/r/d/r0;->b:Landroidx/recyclerview/widget/RecyclerView$l$b;

    iget-object v4, v2, Lc/r/d/r0;->c:Landroidx/recyclerview/widget/RecyclerView$l$b;

    invoke-interface {p1, v1, v3, v4}, Lc/r/d/s0$a;->a(Landroidx/recyclerview/widget/RecyclerView$d0;Landroidx/recyclerview/widget/RecyclerView$l$b;Landroidx/recyclerview/widget/RecyclerView$l$b;)V

    goto :goto_1

    :cond_3
    and-int/lit8 v4, v3, 0xc

    const/16 v5, 0xc

    if-ne v4, v5, :cond_4

    .line 33
    iget-object v3, v2, Lc/r/d/r0;->b:Landroidx/recyclerview/widget/RecyclerView$l$b;

    iget-object v4, v2, Lc/r/d/r0;->c:Landroidx/recyclerview/widget/RecyclerView$l$b;

    invoke-interface {p1, v1, v3, v4}, Lc/r/d/s0$a;->c(Landroidx/recyclerview/widget/RecyclerView$d0;Landroidx/recyclerview/widget/RecyclerView$l$b;Landroidx/recyclerview/widget/RecyclerView$l$b;)V

    goto :goto_1

    :cond_4
    and-int/lit8 v4, v3, 0x4

    if-eqz v4, :cond_5

    .line 34
    iget-object v3, v2, Lc/r/d/r0;->b:Landroidx/recyclerview/widget/RecyclerView$l$b;

    const/4 v4, 0x0

    invoke-interface {p1, v1, v3, v4}, Lc/r/d/s0$a;->b(Landroidx/recyclerview/widget/RecyclerView$d0;Landroidx/recyclerview/widget/RecyclerView$l$b;Landroidx/recyclerview/widget/RecyclerView$l$b;)V

    goto :goto_1

    :cond_5
    and-int/lit8 v3, v3, 0x8

    if-eqz v3, :cond_6

    .line 35
    iget-object v3, v2, Lc/r/d/r0;->b:Landroidx/recyclerview/widget/RecyclerView$l$b;

    iget-object v4, v2, Lc/r/d/r0;->c:Landroidx/recyclerview/widget/RecyclerView$l$b;

    invoke-interface {p1, v1, v3, v4}, Lc/r/d/s0$a;->a(Landroidx/recyclerview/widget/RecyclerView$d0;Landroidx/recyclerview/widget/RecyclerView$l$b;Landroidx/recyclerview/widget/RecyclerView$l$b;)V

    .line 36
    :cond_6
    :goto_1
    invoke-static {v2}, Lc/r/d/r0;->a(Lc/r/d/r0;)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_7
    return-void
.end method

.method public b()V
    .locals 0

    .line 8
    invoke-static {}, Lc/r/d/r0;->a()V

    return-void
.end method

.method public b(Landroidx/recyclerview/widget/RecyclerView$d0;Landroidx/recyclerview/widget/RecyclerView$l$b;)V
    .locals 2

    .line 3
    iget-object v0, p0, Lc/r/d/s0;->a:Lc/e/i;

    invoke-virtual {v0, p1}, Lc/e/i;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/r/d/r0;

    if-nez v0, :cond_0

    .line 4
    invoke-static {}, Lc/r/d/r0;->b()Lc/r/d/r0;

    move-result-object v0

    .line 5
    iget-object v1, p0, Lc/r/d/s0;->a:Lc/e/i;

    invoke-virtual {v1, p1, v0}, Lc/e/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    :cond_0
    iput-object p2, v0, Lc/r/d/r0;->c:Landroidx/recyclerview/widget/RecyclerView$l$b;

    .line 7
    iget p1, v0, Lc/r/d/r0;->a:I

    or-int/lit8 p1, p1, 0x8

    iput p1, v0, Lc/r/d/r0;->a:I

    return-void
.end method

.method public b(Landroidx/recyclerview/widget/RecyclerView$d0;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lc/r/d/s0;->a:Lc/e/i;

    invoke-virtual {v0, p1}, Lc/e/i;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc/r/d/r0;

    const/4 v0, 0x1

    if-eqz p1, :cond_0

    .line 2
    iget p1, p1, Lc/r/d/r0;->a:I

    and-int/2addr p1, v0

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public c(Landroidx/recyclerview/widget/RecyclerView$d0;Landroidx/recyclerview/widget/RecyclerView$l$b;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/r/d/s0;->a:Lc/e/i;

    invoke-virtual {v0, p1}, Lc/e/i;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/r/d/r0;

    if-nez v0, :cond_0

    .line 2
    invoke-static {}, Lc/r/d/r0;->b()Lc/r/d/r0;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lc/r/d/s0;->a:Lc/e/i;

    invoke-virtual {v1, p1, v0}, Lc/e/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    :cond_0
    iput-object p2, v0, Lc/r/d/r0;->b:Landroidx/recyclerview/widget/RecyclerView$l$b;

    .line 5
    iget p1, v0, Lc/r/d/r0;->a:I

    or-int/lit8 p1, p1, 0x4

    iput p1, v0, Lc/r/d/r0;->a:I

    return-void
.end method

.method public c(Landroidx/recyclerview/widget/RecyclerView$d0;)Z
    .locals 1

    .line 6
    iget-object v0, p0, Lc/r/d/s0;->a:Lc/e/i;

    invoke-virtual {v0, p1}, Lc/e/i;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc/r/d/r0;

    if-eqz p1, :cond_0

    .line 7
    iget p1, p1, Lc/r/d/r0;->a:I

    and-int/lit8 p1, p1, 0x4

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public d(Landroidx/recyclerview/widget/RecyclerView$d0;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lc/r/d/s0;->g(Landroidx/recyclerview/widget/RecyclerView$d0;)V

    return-void
.end method

.method public e(Landroidx/recyclerview/widget/RecyclerView$d0;)Landroidx/recyclerview/widget/RecyclerView$l$b;
    .locals 1

    const/16 v0, 0x8

    .line 1
    invoke-virtual {p0, p1, v0}, Lc/r/d/s0;->a(Landroidx/recyclerview/widget/RecyclerView$d0;I)Landroidx/recyclerview/widget/RecyclerView$l$b;

    move-result-object p1

    return-object p1
.end method

.method public f(Landroidx/recyclerview/widget/RecyclerView$d0;)Landroidx/recyclerview/widget/RecyclerView$l$b;
    .locals 1

    const/4 v0, 0x4

    .line 1
    invoke-virtual {p0, p1, v0}, Lc/r/d/s0;->a(Landroidx/recyclerview/widget/RecyclerView$d0;I)Landroidx/recyclerview/widget/RecyclerView$l$b;

    move-result-object p1

    return-object p1
.end method

.method public g(Landroidx/recyclerview/widget/RecyclerView$d0;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/r/d/s0;->a:Lc/e/i;

    invoke-virtual {v0, p1}, Lc/e/i;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc/r/d/r0;

    if-nez p1, :cond_0

    return-void

    .line 2
    :cond_0
    iget v0, p1, Lc/r/d/r0;->a:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p1, Lc/r/d/r0;->a:I

    return-void
.end method

.method public h(Landroidx/recyclerview/widget/RecyclerView$d0;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/r/d/s0;->b:Lc/e/f;

    invoke-virtual {v0}, Lc/e/f;->d()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_1

    .line 2
    iget-object v1, p0, Lc/r/d/s0;->b:Lc/e/f;

    invoke-virtual {v1, v0}, Lc/e/f;->c(I)Ljava/lang/Object;

    move-result-object v1

    if-ne p1, v1, :cond_0

    .line 3
    iget-object v1, p0, Lc/r/d/s0;->b:Lc/e/f;

    invoke-virtual {v1, v0}, Lc/e/f;->b(I)V

    goto :goto_1

    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 4
    :cond_1
    :goto_1
    iget-object v0, p0, Lc/r/d/s0;->a:Lc/e/i;

    invoke-virtual {v0, p1}, Lc/e/i;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc/r/d/r0;

    if-eqz p1, :cond_2

    .line 5
    invoke-static {p1}, Lc/r/d/r0;->a(Lc/r/d/r0;)V

    :cond_2
    return-void
.end method
