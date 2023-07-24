.class public final enum Lm/b/j/g;
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
    .locals 11

    .line 1
    invoke-virtual {p1}, Lm/b/j/q0;->k()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2
    invoke-virtual {p1}, Lm/b/j/q0;->e()Lm/b/j/n0;

    move-result-object v0

    .line 3
    invoke-virtual {v0}, Lm/b/j/o0;->t()Ljava/lang/String;

    move-result-object v1

    const-string v2, "th"

    const-string v3, "td"

    .line 4
    filled-new-array {v2, v3}, [Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lm/b/h/i;->a(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 5
    invoke-virtual {p2}, Lm/b/j/b;->g()V

    .line 6
    invoke-virtual {p2, v0}, Lm/b/j/b;->a(Lm/b/j/n0;)Lm/b/i/l;

    .line 7
    sget-object p1, Lm/b/j/b0;->p:Lm/b/j/b0;

    invoke-virtual {p2, p1}, Lm/b/j/b;->b(Lm/b/j/b0;)V

    .line 8
    invoke-virtual {p2}, Lm/b/j/b;->p()V

    goto :goto_0

    :cond_0
    const-string v2, "caption"

    const-string v3, "col"

    const-string v4, "colgroup"

    const-string v5, "tbody"

    const-string v6, "tfoot"

    const-string v7, "thead"

    const-string v8, "tr"

    .line 9
    filled-new-array/range {v2 .. v8}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lm/b/h/i;->a(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 10
    invoke-virtual {p0, p1, p2}, Lm/b/j/g;->a(Lm/b/j/q0;Lm/b/j/j3;)Z

    move-result p1

    return p1

    .line 11
    :cond_1
    invoke-virtual {p0, p1, p2}, Lm/b/j/g;->b(Lm/b/j/q0;Lm/b/j/b;)Z

    move-result p1

    return p1

    .line 12
    :cond_2
    invoke-virtual {p1}, Lm/b/j/q0;->j()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 13
    invoke-virtual {p1}, Lm/b/j/q0;->d()Lm/b/j/m0;

    move-result-object v0

    .line 14
    invoke-virtual {v0}, Lm/b/j/o0;->t()Ljava/lang/String;

    move-result-object v0

    const-string v1, "tr"

    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_4

    .line 16
    invoke-virtual {p2, v0}, Lm/b/j/b;->j(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_3

    .line 17
    invoke-virtual {p2, p0}, Lm/b/j/b;->a(Lm/b/j/b0;)V

    return v3

    .line 18
    :cond_3
    invoke-virtual {p2}, Lm/b/j/b;->g()V

    .line 19
    invoke-virtual {p2}, Lm/b/j/b;->w()Lm/b/i/l;

    .line 20
    sget-object p1, Lm/b/j/b0;->n:Lm/b/j/b0;

    invoke-virtual {p2, p1}, Lm/b/j/b;->b(Lm/b/j/b0;)V

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_4
    const-string v2, "table"

    .line 21
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 22
    invoke-virtual {p0, p1, p2}, Lm/b/j/g;->a(Lm/b/j/q0;Lm/b/j/j3;)Z

    move-result p1

    return p1

    :cond_5
    const-string v2, "tbody"

    const-string v4, "tfoot"

    const-string v5, "thead"

    .line 23
    filled-new-array {v2, v4, v5}, [Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lm/b/h/i;->a(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_7

    .line 24
    invoke-virtual {p2, v0}, Lm/b/j/b;->j(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 25
    invoke-virtual {p2, p0}, Lm/b/j/b;->a(Lm/b/j/b0;)V

    return v3

    .line 26
    :cond_6
    invoke-virtual {p2, v1}, Lm/b/j/j3;->a(Ljava/lang/String;)Z

    .line 27
    invoke-virtual {p2, p1}, Lm/b/j/b;->a(Lm/b/j/q0;)Z

    move-result p1

    return p1

    :cond_7
    const-string v4, "body"

    const-string v5, "caption"

    const-string v6, "col"

    const-string v7, "colgroup"

    const-string v8, "html"

    const-string v9, "td"

    const-string v10, "th"

    .line 28
    filled-new-array/range {v4 .. v10}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lm/b/h/i;->a(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 29
    invoke-virtual {p2, p0}, Lm/b/j/b;->a(Lm/b/j/b0;)V

    return v3

    .line 30
    :cond_8
    invoke-virtual {p0, p1, p2}, Lm/b/j/g;->b(Lm/b/j/q0;Lm/b/j/b;)Z

    move-result p1

    return p1

    .line 31
    :cond_9
    invoke-virtual {p0, p1, p2}, Lm/b/j/g;->b(Lm/b/j/q0;Lm/b/j/b;)Z

    move-result p1

    return p1
.end method

.method public final a(Lm/b/j/q0;Lm/b/j/j3;)Z
    .locals 1

    const-string v0, "tr"

    .line 32
    invoke-virtual {p2, v0}, Lm/b/j/j3;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 33
    invoke-virtual {p2, p1}, Lm/b/j/j3;->a(Lm/b/j/q0;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final b(Lm/b/j/q0;Lm/b/j/b;)Z
    .locals 1

    .line 1
    sget-object v0, Lm/b/j/b0;->j:Lm/b/j/b0;

    invoke-virtual {p2, p1, v0}, Lm/b/j/b;->a(Lm/b/j/q0;Lm/b/j/b0;)Z

    move-result p1

    return p1
.end method
