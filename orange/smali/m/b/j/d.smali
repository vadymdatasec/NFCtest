.class public final enum Lm/b/j/d;
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
    .locals 12

    .line 1
    invoke-virtual {p1}, Lm/b/j/q0;->j()Z

    move-result v0

    const/4 v1, 0x0

    const-string v2, "caption"

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lm/b/j/q0;->d()Lm/b/j/m0;

    move-result-object v0

    invoke-virtual {v0}, Lm/b/j/o0;->t()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2
    invoke-virtual {p1}, Lm/b/j/q0;->d()Lm/b/j/m0;

    move-result-object p1

    .line 3
    invoke-virtual {p1}, Lm/b/j/o0;->t()Ljava/lang/String;

    move-result-object p1

    .line 4
    invoke-virtual {p2, p1}, Lm/b/j/b;->j(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 5
    invoke-virtual {p2, p0}, Lm/b/j/b;->a(Lm/b/j/b0;)V

    return v1

    .line 6
    :cond_0
    invoke-virtual {p2}, Lm/b/j/b;->i()V

    .line 7
    invoke-virtual {p2}, Lm/b/j/j3;->a()Lm/b/i/l;

    move-result-object p1

    invoke-virtual {p1}, Lm/b/i/l;->i()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    .line 8
    invoke-virtual {p2, p0}, Lm/b/j/b;->a(Lm/b/j/b0;)V

    .line 9
    :cond_1
    invoke-virtual {p2, v2}, Lm/b/j/b;->m(Ljava/lang/String;)V

    .line 10
    invoke-virtual {p2}, Lm/b/j/b;->d()V

    .line 11
    sget-object p1, Lm/b/j/b0;->j:Lm/b/j/b0;

    invoke-virtual {p2, p1}, Lm/b/j/b;->b(Lm/b/j/b0;)V

    goto :goto_0

    .line 12
    :cond_2
    invoke-virtual {p1}, Lm/b/j/q0;->k()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Lm/b/j/q0;->e()Lm/b/j/n0;

    move-result-object v0

    invoke-virtual {v0}, Lm/b/j/o0;->t()Ljava/lang/String;

    move-result-object v0

    const-string v3, "caption"

    const-string v4, "col"

    const-string v5, "colgroup"

    const-string v6, "tbody"

    const-string v7, "td"

    const-string v8, "tfoot"

    const-string v9, "th"

    const-string v10, "thead"

    const-string v11, "tr"

    filled-new-array/range {v3 .. v11}, [Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Lm/b/h/i;->a(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 13
    :cond_3
    invoke-virtual {p1}, Lm/b/j/q0;->j()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {p1}, Lm/b/j/q0;->d()Lm/b/j/m0;

    move-result-object v0

    invoke-virtual {v0}, Lm/b/j/o0;->t()Ljava/lang/String;

    move-result-object v0

    const-string v3, "table"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 14
    :cond_4
    invoke-virtual {p2, p0}, Lm/b/j/b;->a(Lm/b/j/b0;)V

    .line 15
    invoke-virtual {p2, v2}, Lm/b/j/j3;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 16
    invoke-virtual {p2, p1}, Lm/b/j/b;->a(Lm/b/j/q0;)Z

    move-result p1

    return p1

    :cond_5
    :goto_0
    const/4 p1, 0x1

    return p1

    .line 17
    :cond_6
    invoke-virtual {p1}, Lm/b/j/q0;->j()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {p1}, Lm/b/j/q0;->d()Lm/b/j/m0;

    move-result-object v0

    invoke-virtual {v0}, Lm/b/j/o0;->t()Ljava/lang/String;

    move-result-object v0

    const-string v2, "body"

    const-string v3, "col"

    const-string v4, "colgroup"

    const-string v5, "html"

    const-string v6, "tbody"

    const-string v7, "td"

    const-string v8, "tfoot"

    const-string v9, "th"

    const-string v10, "thead"

    const-string v11, "tr"

    filled-new-array/range {v2 .. v11}, [Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lm/b/h/i;->a(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 18
    invoke-virtual {p2, p0}, Lm/b/j/b;->a(Lm/b/j/b0;)V

    return v1

    .line 19
    :cond_7
    sget-object v0, Lm/b/j/b0;->h:Lm/b/j/b0;

    invoke-virtual {p2, p1, v0}, Lm/b/j/b;->a(Lm/b/j/q0;Lm/b/j/b0;)Z

    move-result p1

    return p1
.end method
