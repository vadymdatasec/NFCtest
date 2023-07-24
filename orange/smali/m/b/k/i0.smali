.class public Lm/b/k/i0;
.super Lm/b/k/u;
.source "SourceFile"


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lm/b/k/u;-><init>(II)V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    const-string v0, "nth-of-type"

    return-object v0
.end method

.method public b(Lm/b/i/l;Lm/b/i/l;)I
    .locals 4

    .line 1
    invoke-virtual {p2}, Lm/b/i/l;->l()Lm/b/i/l;

    move-result-object p1

    invoke-virtual {p1}, Lm/b/i/l;->r()Lm/b/k/f;

    move-result-object p1

    .line 2
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm/b/i/l;

    .line 3
    invoke-virtual {v1}, Lm/b/i/l;->B()Lm/b/j/g0;

    move-result-object v2

    invoke-virtual {p2}, Lm/b/i/l;->B()Lm/b/j/g0;

    move-result-object v3

    invoke-virtual {v2, v3}, Lm/b/j/g0;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    add-int/lit8 v0, v0, 0x1

    :cond_1
    if-ne v1, p2, :cond_0

    :cond_2
    return v0
.end method
