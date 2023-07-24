.class public Lm/b/k/h0;
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

    const-string v0, "nth-last-of-type"

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
    invoke-virtual {p2}, Lm/b/i/l;->t()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v0, v2, :cond_1

    .line 3
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm/b/i/l;

    invoke-virtual {v2}, Lm/b/i/l;->B()Lm/b/j/g0;

    move-result-object v2

    invoke-virtual {p2}, Lm/b/i/l;->B()Lm/b/j/g0;

    move-result-object v3

    invoke-virtual {v2, v3}, Lm/b/j/g0;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    add-int/lit8 v1, v1, 0x1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method
