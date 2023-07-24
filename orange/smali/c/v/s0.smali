.class public Lc/v/s0;
.super Lc/v/k0;
.source "SourceFile"


# instance fields
.field public K:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lc/v/k0;",
            ">;"
        }
    .end annotation
.end field

.field public L:Z

.field public M:I

.field public N:Z

.field public O:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lc/v/k0;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lc/v/s0;->K:Ljava/util/ArrayList;

    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Lc/v/s0;->L:Z

    const/4 v0, 0x0

    .line 4
    iput-boolean v0, p0, Lc/v/s0;->N:Z

    .line 5
    iput v0, p0, Lc/v/s0;->O:I

    return-void
.end method


# virtual methods
.method public a(I)Lc/v/k0;
    .locals 1

    if-ltz p1, :cond_1

    .line 17
    iget-object v0, p0, Lc/v/s0;->K:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lt p1, v0, :cond_0

    goto :goto_0

    .line 18
    :cond_0
    iget-object v0, p0, Lc/v/s0;->K:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc/v/k0;

    return-object p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public bridge synthetic a(J)Lc/v/k0;
    .locals 0

    .line 3
    invoke-virtual {p0, p1, p2}, Lc/v/s0;->a(J)Lc/v/s0;

    return-object p0
.end method

.method public bridge synthetic a(Landroid/animation/TimeInterpolator;)Lc/v/k0;
    .locals 0

    .line 4
    invoke-virtual {p0, p1}, Lc/v/s0;->a(Landroid/animation/TimeInterpolator;)Lc/v/s0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic a(Landroid/view/View;)Lc/v/k0;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lc/v/s0;->a(Landroid/view/View;)Lc/v/s0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic a(Lc/v/j0;)Lc/v/k0;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lc/v/s0;->a(Lc/v/j0;)Lc/v/s0;

    move-result-object p1

    return-object p1
.end method

.method public a(J)Lc/v/s0;
    .locals 5

    .line 19
    invoke-super {p0, p1, p2}, Lc/v/k0;->a(J)Lc/v/k0;

    .line 20
    iget-wide v0, p0, Lc/v/k0;->d:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-ltz v4, :cond_0

    .line 21
    iget-object v0, p0, Lc/v/s0;->K:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 22
    iget-object v2, p0, Lc/v/s0;->K:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc/v/k0;

    invoke-virtual {v2, p1, p2}, Lc/v/k0;->a(J)Lc/v/k0;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object p0
.end method

.method public a(Landroid/animation/TimeInterpolator;)Lc/v/s0;
    .locals 3

    .line 23
    iget v0, p0, Lc/v/s0;->O:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lc/v/s0;->O:I

    .line 24
    iget-object v0, p0, Lc/v/s0;->K:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 25
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 26
    iget-object v2, p0, Lc/v/s0;->K:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc/v/k0;

    invoke-virtual {v2, p1}, Lc/v/k0;->a(Landroid/animation/TimeInterpolator;)Lc/v/k0;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 27
    :cond_0
    invoke-super {p0, p1}, Lc/v/k0;->a(Landroid/animation/TimeInterpolator;)Lc/v/k0;

    move-object p1, p0

    check-cast p1, Lc/v/s0;

    return-object p1
.end method

.method public a(Landroid/view/View;)Lc/v/s0;
    .locals 2

    const/4 v0, 0x0

    .line 28
    :goto_0
    iget-object v1, p0, Lc/v/s0;->K:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 29
    iget-object v1, p0, Lc/v/s0;->K:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/v/k0;

    invoke-virtual {v1, p1}, Lc/v/k0;->a(Landroid/view/View;)Lc/v/k0;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 30
    :cond_0
    invoke-super {p0, p1}, Lc/v/k0;->a(Landroid/view/View;)Lc/v/k0;

    move-object p1, p0

    check-cast p1, Lc/v/s0;

    return-object p1
.end method

.method public a(Lc/v/j0;)Lc/v/s0;
    .locals 0

    .line 31
    invoke-super {p0, p1}, Lc/v/k0;->a(Lc/v/j0;)Lc/v/k0;

    move-object p1, p0

    check-cast p1, Lc/v/s0;

    return-object p1
.end method

.method public a(Lc/v/k0;)Lc/v/s0;
    .locals 5

    .line 5
    iget-object v0, p0, Lc/v/s0;->K:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 6
    iput-object p0, p1, Lc/v/k0;->s:Lc/v/s0;

    .line 7
    iget-wide v0, p0, Lc/v/k0;->d:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-ltz v4, :cond_0

    .line 8
    invoke-virtual {p1, v0, v1}, Lc/v/k0;->a(J)Lc/v/k0;

    .line 9
    :cond_0
    iget v0, p0, Lc/v/s0;->O:I

    and-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_1

    .line 10
    invoke-virtual {p0}, Lc/v/k0;->e()Landroid/animation/TimeInterpolator;

    move-result-object v0

    invoke-virtual {p1, v0}, Lc/v/k0;->a(Landroid/animation/TimeInterpolator;)Lc/v/k0;

    .line 11
    :cond_1
    iget v0, p0, Lc/v/s0;->O:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_2

    .line 12
    invoke-virtual {p0}, Lc/v/k0;->h()Lc/v/p0;

    move-result-object v0

    invoke-virtual {p1, v0}, Lc/v/k0;->a(Lc/v/p0;)V

    .line 13
    :cond_2
    iget v0, p0, Lc/v/s0;->O:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_3

    .line 14
    invoke-virtual {p0}, Lc/v/k0;->g()Lc/v/y;

    move-result-object v0

    invoke-virtual {p1, v0}, Lc/v/k0;->a(Lc/v/y;)V

    .line 15
    :cond_3
    iget v0, p0, Lc/v/s0;->O:I

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_4

    .line 16
    invoke-virtual {p0}, Lc/v/k0;->d()Lc/v/i0;

    move-result-object v0

    invoke-virtual {p1, v0}, Lc/v/k0;->a(Lc/v/i0;)V

    :cond_4
    return-object p0
.end method

.method public a(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 57
    invoke-super {p0, p1}, Lc/v/k0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    .line 58
    :goto_0
    iget-object v2, p0, Lc/v/s0;->K:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    .line 59
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\n"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lc/v/s0;->K:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/v/k0;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "  "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lc/v/k0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public a(Landroid/view/ViewGroup;Lc/v/v0;Lc/v/v0;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/ViewGroup;",
            "Lc/v/v0;",
            "Lc/v/v0;",
            "Ljava/util/ArrayList<",
            "Lc/v/u0;",
            ">;",
            "Ljava/util/ArrayList<",
            "Lc/v/u0;",
            ">;)V"
        }
    .end annotation

    move-object v0, p0

    .line 36
    invoke-virtual {p0}, Lc/v/k0;->i()J

    move-result-wide v1

    .line 37
    iget-object v3, v0, Lc/v/s0;->K:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_3

    .line 38
    iget-object v5, v0, Lc/v/s0;->K:Ljava/util/ArrayList;

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lc/v/k0;

    const-wide/16 v7, 0x0

    cmp-long v5, v1, v7

    if-lez v5, :cond_2

    .line 39
    iget-boolean v5, v0, Lc/v/s0;->L:Z

    if-nez v5, :cond_0

    if-nez v4, :cond_2

    .line 40
    :cond_0
    invoke-virtual {v6}, Lc/v/k0;->i()J

    move-result-wide v9

    cmp-long v5, v9, v7

    if-lez v5, :cond_1

    add-long/2addr v9, v1

    .line 41
    invoke-virtual {v6, v9, v10}, Lc/v/k0;->b(J)Lc/v/k0;

    goto :goto_1

    .line 42
    :cond_1
    invoke-virtual {v6, v1, v2}, Lc/v/k0;->b(J)Lc/v/k0;

    :cond_2
    :goto_1
    move-object v7, p1

    move-object v8, p2

    move-object v9, p3

    move-object/from16 v10, p4

    move-object/from16 v11, p5

    .line 43
    invoke-virtual/range {v6 .. v11}, Lc/v/k0;->a(Landroid/view/ViewGroup;Lc/v/v0;Lc/v/v0;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method

.method public a(Lc/v/i0;)V
    .locals 3

    .line 53
    invoke-super {p0, p1}, Lc/v/k0;->a(Lc/v/i0;)V

    .line 54
    iget v0, p0, Lc/v/s0;->O:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Lc/v/s0;->O:I

    .line 55
    iget-object v0, p0, Lc/v/s0;->K:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 56
    iget-object v2, p0, Lc/v/s0;->K:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc/v/k0;

    invoke-virtual {v2, p1}, Lc/v/k0;->a(Lc/v/i0;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public a(Lc/v/p0;)V
    .locals 3

    .line 49
    invoke-super {p0, p1}, Lc/v/k0;->a(Lc/v/p0;)V

    .line 50
    iget v0, p0, Lc/v/s0;->O:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lc/v/s0;->O:I

    .line 51
    iget-object v0, p0, Lc/v/s0;->K:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 52
    iget-object v2, p0, Lc/v/s0;->K:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc/v/k0;

    invoke-virtual {v2, p1}, Lc/v/k0;->a(Lc/v/p0;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public a(Lc/v/u0;)V
    .locals 3

    .line 44
    iget-object v0, p1, Lc/v/u0;->b:Landroid/view/View;

    invoke-virtual {p0, v0}, Lc/v/k0;->b(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 45
    iget-object v0, p0, Lc/v/s0;->K:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/v/k0;

    .line 46
    iget-object v2, p1, Lc/v/u0;->b:Landroid/view/View;

    invoke-virtual {v1, v2}, Lc/v/k0;->b(Landroid/view/View;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 47
    invoke-virtual {v1, p1}, Lc/v/k0;->a(Lc/v/u0;)V

    .line 48
    iget-object v2, p1, Lc/v/u0;->c:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-void
.end method

.method public a(Lc/v/y;)V
    .locals 2

    .line 32
    invoke-super {p0, p1}, Lc/v/k0;->a(Lc/v/y;)V

    .line 33
    iget v0, p0, Lc/v/s0;->O:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Lc/v/s0;->O:I

    const/4 v0, 0x0

    .line 34
    :goto_0
    iget-object v1, p0, Lc/v/s0;->K:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 35
    iget-object v1, p0, Lc/v/s0;->K:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/v/k0;

    invoke-virtual {v1, p1}, Lc/v/k0;->a(Lc/v/y;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public bridge synthetic b(J)Lc/v/k0;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lc/v/s0;->b(J)Lc/v/s0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic b(Lc/v/j0;)Lc/v/k0;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lc/v/s0;->b(Lc/v/j0;)Lc/v/s0;

    move-result-object p1

    return-object p1
.end method

.method public b(I)Lc/v/s0;
    .locals 3

    const/4 v0, 0x1

    if-eqz p1, :cond_1

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    .line 3
    iput-boolean p1, p0, Lc/v/s0;->L:Z

    goto :goto_0

    .line 4
    :cond_0
    new-instance v0, Landroid/util/AndroidRuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid parameter for TransitionSet ordering: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 5
    :cond_1
    iput-boolean v0, p0, Lc/v/s0;->L:Z

    :goto_0
    return-object p0
.end method

.method public b(J)Lc/v/s0;
    .locals 0

    .line 6
    invoke-super {p0, p1, p2}, Lc/v/k0;->b(J)Lc/v/k0;

    move-object p1, p0

    check-cast p1, Lc/v/s0;

    return-object p1
.end method

.method public b(Lc/v/j0;)Lc/v/s0;
    .locals 0

    .line 7
    invoke-super {p0, p1}, Lc/v/k0;->b(Lc/v/j0;)Lc/v/k0;

    move-object p1, p0

    check-cast p1, Lc/v/s0;

    return-object p1
.end method

.method public b(Lc/v/u0;)V
    .locals 3

    .line 8
    invoke-super {p0, p1}, Lc/v/k0;->b(Lc/v/u0;)V

    .line 9
    iget-object v0, p0, Lc/v/s0;->K:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 10
    iget-object v2, p0, Lc/v/s0;->K:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc/v/k0;

    invoke-virtual {v2, p1}, Lc/v/k0;->b(Lc/v/u0;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public c(Landroid/view/View;)V
    .locals 3

    .line 6
    invoke-super {p0, p1}, Lc/v/k0;->c(Landroid/view/View;)V

    .line 7
    iget-object v0, p0, Lc/v/s0;->K:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 8
    iget-object v2, p0, Lc/v/s0;->K:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc/v/k0;

    invoke-virtual {v2, p1}, Lc/v/k0;->c(Landroid/view/View;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public c(Lc/v/u0;)V
    .locals 3

    .line 1
    iget-object v0, p1, Lc/v/u0;->b:Landroid/view/View;

    invoke-virtual {p0, v0}, Lc/v/k0;->b(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2
    iget-object v0, p0, Lc/v/s0;->K:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/v/k0;

    .line 3
    iget-object v2, p1, Lc/v/u0;->b:Landroid/view/View;

    invoke-virtual {v1, v2}, Lc/v/k0;->b(Landroid/view/View;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 4
    invoke-virtual {v1, p1}, Lc/v/k0;->c(Lc/v/u0;)V

    .line 5
    iget-object v2, p1, Lc/v/u0;->c:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-void
.end method

.method public clone()Lc/v/k0;
    .locals 4

    .line 2
    invoke-super {p0}, Lc/v/k0;->clone()Lc/v/k0;

    move-result-object v0

    check-cast v0, Lc/v/s0;

    .line 3
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, Lc/v/s0;->K:Ljava/util/ArrayList;

    .line 4
    iget-object v1, p0, Lc/v/s0;->K:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    .line 5
    iget-object v3, p0, Lc/v/s0;->K:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lc/v/k0;

    invoke-virtual {v3}, Lc/v/k0;->clone()Lc/v/k0;

    move-result-object v3

    invoke-virtual {v0, v3}, Lc/v/s0;->a(Lc/v/k0;)Lc/v/s0;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lc/v/s0;->clone()Lc/v/k0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic d(Landroid/view/View;)Lc/v/k0;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lc/v/s0;->d(Landroid/view/View;)Lc/v/s0;

    move-result-object p1

    return-object p1
.end method

.method public d(Landroid/view/View;)Lc/v/s0;
    .locals 2

    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Lc/v/s0;->K:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 3
    iget-object v1, p0, Lc/v/s0;->K:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/v/k0;

    invoke-virtual {v1, p1}, Lc/v/k0;->d(Landroid/view/View;)Lc/v/k0;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 4
    :cond_0
    invoke-super {p0, p1}, Lc/v/k0;->d(Landroid/view/View;)Lc/v/k0;

    move-object p1, p0

    check-cast p1, Lc/v/s0;

    return-object p1
.end method

.method public e(Landroid/view/View;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Lc/v/k0;->e(Landroid/view/View;)V

    .line 2
    iget-object v0, p0, Lc/v/s0;->K:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 3
    iget-object v2, p0, Lc/v/s0;->K:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc/v/k0;

    invoke-virtual {v2, p1}, Lc/v/k0;->e(Landroid/view/View;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public o()V
    .locals 4

    .line 1
    iget-object v0, p0, Lc/v/s0;->K:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lc/v/k0;->p()V

    .line 3
    invoke-virtual {p0}, Lc/v/k0;->a()V

    return-void

    .line 4
    :cond_0
    invoke-virtual {p0}, Lc/v/s0;->s()V

    .line 5
    iget-boolean v0, p0, Lc/v/s0;->L:Z

    if-nez v0, :cond_2

    const/4 v0, 0x1

    .line 6
    :goto_0
    iget-object v1, p0, Lc/v/s0;->K:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 7
    iget-object v1, p0, Lc/v/s0;->K:Ljava/util/ArrayList;

    add-int/lit8 v2, v0, -0x1

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/v/k0;

    .line 8
    iget-object v2, p0, Lc/v/s0;->K:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc/v/k0;

    .line 9
    new-instance v3, Lc/v/q0;

    invoke-direct {v3, p0, v2}, Lc/v/q0;-><init>(Lc/v/s0;Lc/v/k0;)V

    invoke-virtual {v1, v3}, Lc/v/k0;->a(Lc/v/j0;)Lc/v/k0;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 10
    :cond_1
    iget-object v0, p0, Lc/v/s0;->K:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/v/k0;

    if-eqz v0, :cond_3

    .line 11
    invoke-virtual {v0}, Lc/v/k0;->o()V

    goto :goto_2

    .line 12
    :cond_2
    iget-object v0, p0, Lc/v/s0;->K:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/v/k0;

    .line 13
    invoke-virtual {v1}, Lc/v/k0;->o()V

    goto :goto_1

    :cond_3
    :goto_2
    return-void
.end method

.method public r()I
    .locals 1

    .line 1
    iget-object v0, p0, Lc/v/s0;->K:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final s()V
    .locals 3

    .line 1
    new-instance v0, Lc/v/r0;

    invoke-direct {v0, p0}, Lc/v/r0;-><init>(Lc/v/s0;)V

    .line 2
    iget-object v1, p0, Lc/v/s0;->K:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc/v/k0;

    .line 3
    invoke-virtual {v2, v0}, Lc/v/k0;->a(Lc/v/j0;)Lc/v/k0;

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lc/v/s0;->K:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iput v0, p0, Lc/v/s0;->M:I

    return-void
.end method
