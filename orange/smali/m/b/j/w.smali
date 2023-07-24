.class public final enum Lm/b/j/w;
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
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    .line 1
    invoke-static/range {p1 .. p1}, Lm/b/j/b0;->a(Lm/b/j/q0;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 2
    invoke-virtual/range {p1 .. p1}, Lm/b/j/q0;->a()Lm/b/j/i0;

    move-result-object v1

    invoke-virtual {v2, v1}, Lm/b/j/b;->a(Lm/b/j/i0;)V

    goto/16 :goto_0

    .line 3
    :cond_0
    invoke-virtual/range {p1 .. p1}, Lm/b/j/q0;->g()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 4
    invoke-virtual/range {p1 .. p1}, Lm/b/j/q0;->b()Lm/b/j/j0;

    move-result-object v1

    invoke-virtual {v2, v1}, Lm/b/j/b;->a(Lm/b/j/j0;)V

    goto/16 :goto_0

    .line 5
    :cond_1
    invoke-virtual/range {p1 .. p1}, Lm/b/j/q0;->h()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 6
    invoke-virtual {v2, v0}, Lm/b/j/b;->a(Lm/b/j/b0;)V

    goto/16 :goto_0

    .line 7
    :cond_2
    invoke-virtual/range {p1 .. p1}, Lm/b/j/q0;->k()Z

    move-result v3

    const-string v4, "body"

    const-string v5, "html"

    const/4 v6, 0x0

    if-eqz v3, :cond_8

    .line 8
    invoke-virtual/range {p1 .. p1}, Lm/b/j/q0;->e()Lm/b/j/n0;

    move-result-object v3

    .line 9
    invoke-virtual {v3}, Lm/b/j/o0;->t()Ljava/lang/String;

    move-result-object v7

    .line 10
    invoke-virtual {v7, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 11
    sget-object v3, Lm/b/j/b0;->h:Lm/b/j/b0;

    invoke-virtual {v2, v1, v3}, Lm/b/j/b;->a(Lm/b/j/q0;Lm/b/j/b0;)Z

    move-result v1

    return v1

    .line 12
    :cond_3
    invoke-virtual {v7, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    .line 13
    invoke-virtual {v2, v3}, Lm/b/j/b;->a(Lm/b/j/n0;)Lm/b/i/l;

    .line 14
    invoke-virtual {v2, v6}, Lm/b/j/b;->a(Z)V

    .line 15
    sget-object v1, Lm/b/j/b0;->h:Lm/b/j/b0;

    invoke-virtual {v2, v1}, Lm/b/j/b;->b(Lm/b/j/b0;)V

    goto/16 :goto_0

    :cond_4
    const-string v4, "frameset"

    .line 16
    invoke-virtual {v7, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    .line 17
    invoke-virtual {v2, v3}, Lm/b/j/b;->a(Lm/b/j/n0;)Lm/b/i/l;

    .line 18
    sget-object v1, Lm/b/j/b0;->t:Lm/b/j/b0;

    invoke-virtual {v2, v1}, Lm/b/j/b;->b(Lm/b/j/b0;)V

    goto :goto_0

    :cond_5
    const-string v8, "base"

    const-string v9, "basefont"

    const-string v10, "bgsound"

    const-string v11, "link"

    const-string v12, "meta"

    const-string v13, "noframes"

    const-string v14, "script"

    const-string v15, "style"

    const-string v16, "title"

    .line 19
    filled-new-array/range {v8 .. v16}, [Ljava/lang/String;

    move-result-object v3

    invoke-static {v7, v3}, Lm/b/h/i;->a(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_6

    .line 20
    invoke-virtual {v2, v0}, Lm/b/j/b;->a(Lm/b/j/b0;)V

    .line 21
    invoke-virtual/range {p2 .. p2}, Lm/b/j/b;->m()Lm/b/i/l;

    move-result-object v3

    .line 22
    invoke-virtual {v2, v3}, Lm/b/j/b;->g(Lm/b/i/l;)V

    .line 23
    sget-object v4, Lm/b/j/b0;->e:Lm/b/j/b0;

    invoke-virtual {v2, v1, v4}, Lm/b/j/b;->a(Lm/b/j/q0;Lm/b/j/b0;)Z

    .line 24
    invoke-virtual {v2, v3}, Lm/b/j/b;->j(Lm/b/i/l;)Z

    goto :goto_0

    :cond_6
    const-string v3, "head"

    .line 25
    invoke-virtual {v7, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    .line 26
    invoke-virtual {v2, v0}, Lm/b/j/b;->a(Lm/b/j/b0;)V

    return v6

    .line 27
    :cond_7
    invoke-virtual/range {p0 .. p2}, Lm/b/j/w;->b(Lm/b/j/q0;Lm/b/j/b;)Z

    goto :goto_0

    .line 28
    :cond_8
    invoke-virtual/range {p1 .. p1}, Lm/b/j/q0;->j()Z

    move-result v3

    if-eqz v3, :cond_a

    .line 29
    invoke-virtual/range {p1 .. p1}, Lm/b/j/q0;->d()Lm/b/j/m0;

    move-result-object v3

    invoke-virtual {v3}, Lm/b/j/o0;->t()Ljava/lang/String;

    move-result-object v3

    filled-new-array {v4, v5}, [Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lm/b/h/i;->a(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_9

    .line 30
    invoke-virtual/range {p0 .. p2}, Lm/b/j/w;->b(Lm/b/j/q0;Lm/b/j/b;)Z

    goto :goto_0

    .line 31
    :cond_9
    invoke-virtual {v2, v0}, Lm/b/j/b;->a(Lm/b/j/b0;)V

    return v6

    .line 32
    :cond_a
    invoke-virtual/range {p0 .. p2}, Lm/b/j/w;->b(Lm/b/j/q0;Lm/b/j/b;)Z

    :goto_0
    const/4 v1, 0x1

    return v1
.end method

.method public final b(Lm/b/j/q0;Lm/b/j/b;)Z
    .locals 1

    const-string v0, "body"

    .line 1
    invoke-virtual {p2, v0}, Lm/b/j/j3;->b(Ljava/lang/String;)Z

    const/4 v0, 0x1

    .line 2
    invoke-virtual {p2, v0}, Lm/b/j/b;->a(Z)V

    .line 3
    invoke-virtual {p2, p1}, Lm/b/j/b;->a(Lm/b/j/q0;)Z

    move-result p1

    return p1
.end method
