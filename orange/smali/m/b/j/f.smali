.class public final enum Lm/b/j/f;
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
    sget-object v0, Lm/b/j/r;->a:[I

    iget-object v1, p1, Lm/b/j/q0;->a:Lm/b/j/p0;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x3

    if-eq v0, v1, :cond_5

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    .line 2
    invoke-virtual {p0, p1, p2}, Lm/b/j/f;->b(Lm/b/j/q0;Lm/b/j/b;)Z

    move-result p1

    return p1

    .line 3
    :cond_0
    invoke-virtual {p1}, Lm/b/j/q0;->d()Lm/b/j/m0;

    move-result-object v0

    .line 4
    invoke-virtual {v0}, Lm/b/j/o0;->t()Ljava/lang/String;

    move-result-object v0

    const-string v1, "tbody"

    const-string v2, "tfoot"

    const-string v3, "thead"

    .line 5
    filled-new-array {v1, v2, v3}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lm/b/h/i;->a(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    .line 6
    invoke-virtual {p2, v0}, Lm/b/j/b;->j(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_1

    .line 7
    invoke-virtual {p2, p0}, Lm/b/j/b;->a(Lm/b/j/b0;)V

    return v2

    .line 8
    :cond_1
    invoke-virtual {p2}, Lm/b/j/b;->e()V

    .line 9
    invoke-virtual {p2}, Lm/b/j/b;->w()Lm/b/i/l;

    .line 10
    sget-object p1, Lm/b/j/b0;->j:Lm/b/j/b0;

    invoke-virtual {p2, p1}, Lm/b/j/b;->b(Lm/b/j/b0;)V

    goto :goto_0

    :cond_2
    const-string v1, "table"

    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 12
    invoke-virtual {p0, p1, p2}, Lm/b/j/f;->c(Lm/b/j/q0;Lm/b/j/b;)Z

    move-result p1

    return p1

    :cond_3
    const-string v3, "body"

    const-string v4, "caption"

    const-string v5, "col"

    const-string v6, "colgroup"

    const-string v7, "html"

    const-string v8, "td"

    const-string v9, "th"

    const-string v10, "tr"

    .line 13
    filled-new-array/range {v3 .. v10}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lm/b/h/i;->a(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 14
    invoke-virtual {p2, p0}, Lm/b/j/b;->a(Lm/b/j/b0;)V

    return v2

    .line 15
    :cond_4
    invoke-virtual {p0, p1, p2}, Lm/b/j/f;->b(Lm/b/j/q0;Lm/b/j/b;)Z

    move-result p1

    return p1

    .line 16
    :cond_5
    invoke-virtual {p1}, Lm/b/j/q0;->e()Lm/b/j/n0;

    move-result-object v0

    .line 17
    invoke-virtual {v0}, Lm/b/j/o0;->t()Ljava/lang/String;

    move-result-object v1

    const-string v2, "tr"

    .line 18
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    .line 19
    invoke-virtual {p2}, Lm/b/j/b;->e()V

    .line 20
    invoke-virtual {p2, v0}, Lm/b/j/b;->a(Lm/b/j/n0;)Lm/b/i/l;

    .line 21
    sget-object p1, Lm/b/j/b0;->o:Lm/b/j/b0;

    invoke-virtual {p2, p1}, Lm/b/j/b;->b(Lm/b/j/b0;)V

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_6
    const-string v3, "th"

    const-string v4, "td"

    .line 22
    filled-new-array {v3, v4}, [Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lm/b/h/i;->a(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_7

    .line 23
    invoke-virtual {p2, p0}, Lm/b/j/b;->a(Lm/b/j/b0;)V

    .line 24
    invoke-virtual {p2, v2}, Lm/b/j/j3;->b(Ljava/lang/String;)Z

    .line 25
    invoke-virtual {p2, v0}, Lm/b/j/b;->a(Lm/b/j/q0;)Z

    move-result p1

    return p1

    :cond_7
    const-string v2, "caption"

    const-string v3, "col"

    const-string v4, "colgroup"

    const-string v5, "tbody"

    const-string v6, "tfoot"

    const-string v7, "thead"

    .line 26
    filled-new-array/range {v2 .. v7}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lm/b/h/i;->a(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 27
    invoke-virtual {p0, p1, p2}, Lm/b/j/f;->c(Lm/b/j/q0;Lm/b/j/b;)Z

    move-result p1

    return p1

    .line 28
    :cond_8
    invoke-virtual {p0, p1, p2}, Lm/b/j/f;->b(Lm/b/j/q0;Lm/b/j/b;)Z

    move-result p1

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

.method public final c(Lm/b/j/q0;Lm/b/j/b;)Z
    .locals 1

    const-string v0, "tbody"

    .line 1
    invoke-virtual {p2, v0}, Lm/b/j/b;->j(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "thead"

    invoke-virtual {p2, v0}, Lm/b/j/b;->j(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "tfoot"

    invoke-virtual {p2, v0}, Lm/b/j/b;->h(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    invoke-virtual {p2, p0}, Lm/b/j/b;->a(Lm/b/j/b0;)V

    const/4 p1, 0x0

    return p1

    .line 3
    :cond_0
    invoke-virtual {p2}, Lm/b/j/b;->e()V

    .line 4
    invoke-virtual {p2}, Lm/b/j/j3;->a()Lm/b/i/l;

    move-result-object v0

    invoke-virtual {v0}, Lm/b/i/l;->i()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lm/b/j/j3;->a(Ljava/lang/String;)Z

    .line 5
    invoke-virtual {p2, p1}, Lm/b/j/b;->a(Lm/b/j/q0;)Z

    move-result p1

    return p1
.end method
