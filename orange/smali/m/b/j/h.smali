.class public final enum Lm/b/j/h;
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
.method public final a(Lm/b/j/b;)V
    .locals 2

    const-string v0, "td"

    .line 29
    invoke-virtual {p1, v0}, Lm/b/j/b;->j(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 30
    invoke-virtual {p1, v0}, Lm/b/j/j3;->a(Ljava/lang/String;)Z

    goto :goto_0

    :cond_0
    const-string v0, "th"

    .line 31
    invoke-virtual {p1, v0}, Lm/b/j/j3;->a(Ljava/lang/String;)Z

    :goto_0
    return-void
.end method

.method public a(Lm/b/j/q0;Lm/b/j/b;)Z
    .locals 13

    .line 1
    invoke-virtual {p1}, Lm/b/j/q0;->j()Z

    move-result v0

    const-string v1, "th"

    const-string v2, "td"

    const/4 v3, 0x0

    if-eqz v0, :cond_6

    .line 2
    invoke-virtual {p1}, Lm/b/j/q0;->d()Lm/b/j/m0;

    move-result-object v0

    .line 3
    invoke-virtual {v0}, Lm/b/j/o0;->t()Ljava/lang/String;

    move-result-object v0

    .line 4
    filled-new-array {v2, v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lm/b/h/i;->a(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 5
    invoke-virtual {p2, v0}, Lm/b/j/b;->j(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 6
    invoke-virtual {p2, p0}, Lm/b/j/b;->a(Lm/b/j/b0;)V

    .line 7
    sget-object p1, Lm/b/j/b0;->o:Lm/b/j/b0;

    invoke-virtual {p2, p1}, Lm/b/j/b;->b(Lm/b/j/b0;)V

    return v3

    .line 8
    :cond_0
    invoke-virtual {p2}, Lm/b/j/b;->i()V

    .line 9
    invoke-virtual {p2}, Lm/b/j/j3;->a()Lm/b/i/l;

    move-result-object p1

    invoke-virtual {p1}, Lm/b/i/l;->i()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    .line 10
    invoke-virtual {p2, p0}, Lm/b/j/b;->a(Lm/b/j/b0;)V

    .line 11
    :cond_1
    invoke-virtual {p2, v0}, Lm/b/j/b;->m(Ljava/lang/String;)V

    .line 12
    invoke-virtual {p2}, Lm/b/j/b;->d()V

    .line 13
    sget-object p1, Lm/b/j/b0;->o:Lm/b/j/b0;

    invoke-virtual {p2, p1}, Lm/b/j/b;->b(Lm/b/j/b0;)V

    const/4 p1, 0x1

    return p1

    :cond_2
    const-string v1, "body"

    const-string v2, "caption"

    const-string v4, "col"

    const-string v5, "colgroup"

    const-string v6, "html"

    .line 14
    filled-new-array {v1, v2, v4, v5, v6}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lm/b/h/i;->a(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 15
    invoke-virtual {p2, p0}, Lm/b/j/b;->a(Lm/b/j/b0;)V

    return v3

    :cond_3
    const-string v1, "table"

    const-string v2, "tbody"

    const-string v4, "tfoot"

    const-string v5, "thead"

    const-string v6, "tr"

    .line 16
    filled-new-array {v1, v2, v4, v5, v6}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lm/b/h/i;->a(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 17
    invoke-virtual {p2, v0}, Lm/b/j/b;->j(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 18
    invoke-virtual {p2, p0}, Lm/b/j/b;->a(Lm/b/j/b0;)V

    return v3

    .line 19
    :cond_4
    invoke-virtual {p0, p2}, Lm/b/j/h;->a(Lm/b/j/b;)V

    .line 20
    invoke-virtual {p2, p1}, Lm/b/j/b;->a(Lm/b/j/q0;)Z

    move-result p1

    return p1

    .line 21
    :cond_5
    invoke-virtual {p0, p1, p2}, Lm/b/j/h;->b(Lm/b/j/q0;Lm/b/j/b;)Z

    move-result p1

    return p1

    .line 22
    :cond_6
    invoke-virtual {p1}, Lm/b/j/q0;->k()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 23
    invoke-virtual {p1}, Lm/b/j/q0;->e()Lm/b/j/n0;

    move-result-object v0

    invoke-virtual {v0}, Lm/b/j/o0;->t()Ljava/lang/String;

    move-result-object v0

    const-string v4, "caption"

    const-string v5, "col"

    const-string v6, "colgroup"

    const-string v7, "tbody"

    const-string v8, "td"

    const-string v9, "tfoot"

    const-string v10, "th"

    const-string v11, "thead"

    const-string v12, "tr"

    filled-new-array/range {v4 .. v12}, [Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v4}, Lm/b/h/i;->a(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 24
    invoke-virtual {p2, v2}, Lm/b/j/b;->j(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_7

    invoke-virtual {p2, v1}, Lm/b/j/b;->j(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 25
    invoke-virtual {p2, p0}, Lm/b/j/b;->a(Lm/b/j/b0;)V

    return v3

    .line 26
    :cond_7
    invoke-virtual {p0, p2}, Lm/b/j/h;->a(Lm/b/j/b;)V

    .line 27
    invoke-virtual {p2, p1}, Lm/b/j/b;->a(Lm/b/j/q0;)Z

    move-result p1

    return p1

    .line 28
    :cond_8
    invoke-virtual {p0, p1, p2}, Lm/b/j/h;->b(Lm/b/j/q0;Lm/b/j/b;)Z

    move-result p1

    return p1
.end method

.method public final b(Lm/b/j/q0;Lm/b/j/b;)Z
    .locals 1

    .line 1
    sget-object v0, Lm/b/j/b0;->h:Lm/b/j/b0;

    invoke-virtual {p2, p1, v0}, Lm/b/j/b;->a(Lm/b/j/q0;Lm/b/j/b0;)Z

    move-result p1

    return p1
.end method
