.class public abstract Lc/f/a/l/v;
.super Lc/f/a/l/i;
.source "SourceFile"


# instance fields
.field public k0:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lc/f/a/l/i;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lc/f/a/l/i;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lc/f/a/l/v;->k0:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public E()V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/f/a/l/v;->k0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 2
    invoke-super {p0}, Lc/f/a/l/i;->E()V

    return-void
.end method

.method public I()V
    .locals 5

    .line 1
    invoke-super {p0}, Lc/f/a/l/i;->I()V

    .line 2
    iget-object v0, p0, Lc/f/a/l/v;->k0:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    return-void

    .line 3
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    .line 4
    iget-object v2, p0, Lc/f/a/l/v;->k0:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc/f/a/l/i;

    .line 5
    invoke-virtual {p0}, Lc/f/a/l/i;->h()I

    move-result v3

    invoke-virtual {p0}, Lc/f/a/l/i;->i()I

    move-result v4

    invoke-virtual {v2, v3, v4}, Lc/f/a/l/i;->b(II)V

    .line 6
    instance-of v3, v2, Lc/f/a/l/j;

    if-nez v3, :cond_1

    .line 7
    invoke-virtual {v2}, Lc/f/a/l/i;->I()V

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public K()Lc/f/a/l/j;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lc/f/a/l/i;->l()Lc/f/a/l/i;

    move-result-object v0

    .line 2
    instance-of v1, p0, Lc/f/a/l/j;

    if-eqz v1, :cond_0

    .line 3
    move-object v1, p0

    check-cast v1, Lc/f/a/l/j;

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v0, :cond_2

    .line 4
    invoke-virtual {v0}, Lc/f/a/l/i;->l()Lc/f/a/l/i;

    move-result-object v2

    .line 5
    instance-of v3, v0, Lc/f/a/l/j;

    if-eqz v3, :cond_1

    .line 6
    move-object v1, v0

    check-cast v1, Lc/f/a/l/j;

    :cond_1
    move-object v0, v2

    goto :goto_0

    :cond_2
    return-object v1
.end method

.method public abstract L()V
.end method

.method public M()V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/f/a/l/v;->k0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

.method public a(Lc/f/a/c;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Lc/f/a/l/i;->a(Lc/f/a/c;)V

    .line 2
    iget-object v0, p0, Lc/f/a/l/v;->k0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 3
    iget-object v2, p0, Lc/f/a/l/v;->k0:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc/f/a/l/i;

    .line 4
    invoke-virtual {v2, p1}, Lc/f/a/l/i;->a(Lc/f/a/c;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public b(II)V
    .locals 3

    .line 6
    invoke-super {p0, p1, p2}, Lc/f/a/l/i;->b(II)V

    .line 7
    iget-object p1, p0, Lc/f/a/l/v;->k0:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    const/4 p2, 0x0

    :goto_0
    if-ge p2, p1, :cond_0

    .line 8
    iget-object v0, p0, Lc/f/a/l/v;->k0:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/f/a/l/i;

    .line 9
    invoke-virtual {p0}, Lc/f/a/l/i;->p()I

    move-result v1

    invoke-virtual {p0}, Lc/f/a/l/i;->q()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lc/f/a/l/i;->b(II)V

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public b(Lc/f/a/l/i;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/f/a/l/v;->k0:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2
    invoke-virtual {p1}, Lc/f/a/l/i;->l()Lc/f/a/l/i;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {p1}, Lc/f/a/l/i;->l()Lc/f/a/l/i;

    move-result-object v0

    check-cast v0, Lc/f/a/l/v;

    .line 4
    invoke-virtual {v0, p1}, Lc/f/a/l/v;->c(Lc/f/a/l/i;)V

    .line 5
    :cond_0
    invoke-virtual {p1, p0}, Lc/f/a/l/i;->a(Lc/f/a/l/i;)V

    return-void
.end method

.method public c(Lc/f/a/l/i;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/f/a/l/v;->k0:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, v0}, Lc/f/a/l/i;->a(Lc/f/a/l/i;)V

    return-void
.end method
