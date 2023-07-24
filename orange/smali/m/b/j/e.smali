.class public final enum Lm/b/j/e;
.super Lm/b/j/b0;
.source "SourceFile"


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, p2, v0}, Lm/b/j/b0;-><init>(Ljava/lang/String;ILm/b/j/m;)V

    return-void
.end method


# virtual methods
.method public a(Lm/b/j/q0;Lm/b/j/b;)Z
    .locals 4

    .line 1
    invoke-static {p1}, Lm/b/j/b0;->a(Lm/b/j/q0;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p1}, Lm/b/j/q0;->a()Lm/b/j/i0;

    move-result-object p1

    invoke-virtual {p2, p1}, Lm/b/j/b;->a(Lm/b/j/i0;)V

    return v1

    .line 3
    :cond_0
    sget-object v0, Lm/b/j/r;->a:[I

    iget-object v2, p1, Lm/b/j/q0;->a:Lm/b/j/p0;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v0, v0, v2

    if-eq v0, v1, :cond_a

    const/4 v2, 0x2

    if-eq v0, v2, :cond_9

    const/4 v2, 0x3

    const-string v3, "html"

    if-eq v0, v2, :cond_6

    const/4 v2, 0x4

    if-eq v0, v2, :cond_3

    const/4 v2, 0x6

    if-eq v0, v2, :cond_1

    .line 4
    invoke-virtual {p0, p1, p2}, Lm/b/j/e;->a(Lm/b/j/q0;Lm/b/j/j3;)Z

    move-result p1

    return p1

    .line 5
    :cond_1
    invoke-virtual {p2}, Lm/b/j/j3;->a()Lm/b/i/l;

    move-result-object v0

    invoke-virtual {v0}, Lm/b/i/l;->i()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    return v1

    .line 6
    :cond_2
    invoke-virtual {p0, p1, p2}, Lm/b/j/e;->a(Lm/b/j/q0;Lm/b/j/j3;)Z

    move-result p1

    return p1

    .line 7
    :cond_3
    invoke-virtual {p1}, Lm/b/j/q0;->d()Lm/b/j/m0;

    move-result-object v0

    .line 8
    invoke-virtual {v0}, Lm/b/j/o0;->t()Ljava/lang/String;

    move-result-object v0

    const-string v2, "colgroup"

    .line 9
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 10
    invoke-virtual {p2}, Lm/b/j/j3;->a()Lm/b/i/l;

    move-result-object p1

    invoke-virtual {p1}, Lm/b/i/l;->i()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 11
    invoke-virtual {p2, p0}, Lm/b/j/b;->a(Lm/b/j/b0;)V

    const/4 p1, 0x0

    return p1

    .line 12
    :cond_4
    invoke-virtual {p2}, Lm/b/j/b;->w()Lm/b/i/l;

    .line 13
    sget-object p1, Lm/b/j/b0;->j:Lm/b/j/b0;

    invoke-virtual {p2, p1}, Lm/b/j/b;->b(Lm/b/j/b0;)V

    goto :goto_0

    .line 14
    :cond_5
    invoke-virtual {p0, p1, p2}, Lm/b/j/e;->a(Lm/b/j/q0;Lm/b/j/j3;)Z

    move-result p1

    return p1

    .line 15
    :cond_6
    invoke-virtual {p1}, Lm/b/j/q0;->e()Lm/b/j/n0;

    move-result-object v0

    .line 16
    invoke-virtual {v0}, Lm/b/j/o0;->t()Ljava/lang/String;

    move-result-object v2

    .line 17
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    .line 18
    sget-object v0, Lm/b/j/b0;->h:Lm/b/j/b0;

    invoke-virtual {p2, p1, v0}, Lm/b/j/b;->a(Lm/b/j/q0;Lm/b/j/b0;)Z

    move-result p1

    return p1

    :cond_7
    const-string v3, "col"

    .line 19
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_8

    .line 20
    invoke-virtual {p2, v0}, Lm/b/j/b;->b(Lm/b/j/n0;)Lm/b/i/l;

    goto :goto_0

    .line 21
    :cond_8
    invoke-virtual {p0, p1, p2}, Lm/b/j/e;->a(Lm/b/j/q0;Lm/b/j/j3;)Z

    move-result p1

    return p1

    .line 22
    :cond_9
    invoke-virtual {p2, p0}, Lm/b/j/b;->a(Lm/b/j/b0;)V

    goto :goto_0

    .line 23
    :cond_a
    invoke-virtual {p1}, Lm/b/j/q0;->b()Lm/b/j/j0;

    move-result-object p1

    invoke-virtual {p2, p1}, Lm/b/j/b;->a(Lm/b/j/j0;)V

    :goto_0
    return v1
.end method

.method public final a(Lm/b/j/q0;Lm/b/j/j3;)Z
    .locals 1

    const-string v0, "colgroup"

    .line 24
    invoke-virtual {p2, v0}, Lm/b/j/j3;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 25
    invoke-virtual {p2, p1}, Lm/b/j/j3;->a(Lm/b/j/q0;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x1

    return p1
.end method
