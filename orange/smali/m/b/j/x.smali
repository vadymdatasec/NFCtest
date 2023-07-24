.class public final enum Lm/b/j/x;
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
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    .line 1
    sget-object v3, Lm/b/j/r;->a:[I

    iget-object v4, v1, Lm/b/j/q0;->a:Lm/b/j/p0;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aget v3, v3, v4

    const/4 v4, 0x1

    if-eq v3, v4, :cond_7f

    const/4 v5, 0x2

    const/4 v6, 0x0

    if-eq v3, v5, :cond_7e

    const-string v7, "name"

    const-string v8, "html"

    const-string v9, "span"

    const/4 v10, 0x3

    const-string v11, "form"

    const-string v12, "li"

    const-string v13, "body"

    const-string v14, "p"

    if-eq v3, v10, :cond_33

    const/4 v5, 0x4

    if-eq v3, v5, :cond_4

    const/4 v5, 0x5

    if-eq v3, v5, :cond_1

    :cond_0
    :goto_0
    const/4 v1, 0x1

    goto/16 :goto_17

    .line 2
    :cond_1
    invoke-virtual/range {p1 .. p1}, Lm/b/j/q0;->a()Lm/b/j/i0;

    move-result-object v1

    .line 3
    invoke-virtual {v1}, Lm/b/j/i0;->n()Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Lm/b/j/b0;->a()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 4
    invoke-virtual {v2, v0}, Lm/b/j/b;->a(Lm/b/j/b0;)V

    return v6

    .line 5
    :cond_2
    invoke-virtual/range {p2 .. p2}, Lm/b/j/b;->h()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-static {v1}, Lm/b/j/b0;->a(Lm/b/j/q0;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 6
    invoke-virtual/range {p2 .. p2}, Lm/b/j/b;->x()V

    .line 7
    invoke-virtual {v2, v1}, Lm/b/j/b;->a(Lm/b/j/i0;)V

    goto :goto_0

    .line 8
    :cond_3
    invoke-virtual/range {p2 .. p2}, Lm/b/j/b;->x()V

    .line 9
    invoke-virtual {v2, v1}, Lm/b/j/b;->a(Lm/b/j/i0;)V

    .line 10
    invoke-virtual {v2, v6}, Lm/b/j/b;->a(Z)V

    goto :goto_0

    .line 11
    :cond_4
    invoke-virtual/range {p1 .. p1}, Lm/b/j/q0;->d()Lm/b/j/m0;

    move-result-object v3

    .line 12
    invoke-virtual {v3}, Lm/b/j/o0;->t()Ljava/lang/String;

    move-result-object v5

    .line 13
    invoke-static {}, Lm/b/j/a0;->j()[Ljava/lang/String;

    move-result-object v15

    invoke-static {v5, v15}, Lm/b/h/i;->b(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v15

    const/4 v10, 0x0

    if-eqz v15, :cond_16

    const/4 v3, 0x0

    :goto_1
    const/16 v7, 0x8

    if-ge v3, v7, :cond_0

    .line 14
    invoke-virtual {v2, v5}, Lm/b/j/b;->d(Ljava/lang/String;)Lm/b/i/l;

    move-result-object v7

    if-nez v7, :cond_5

    .line 15
    invoke-virtual/range {p0 .. p2}, Lm/b/j/x;->b(Lm/b/j/q0;Lm/b/j/b;)Z

    move-result v1

    return v1

    .line 16
    :cond_5
    invoke-virtual {v2, v7}, Lm/b/j/b;->f(Lm/b/i/l;)Z

    move-result v8

    if-nez v8, :cond_6

    .line 17
    invoke-virtual {v2, v0}, Lm/b/j/b;->a(Lm/b/j/b0;)V

    .line 18
    invoke-virtual {v2, v7}, Lm/b/j/b;->i(Lm/b/i/l;)V

    return v4

    .line 19
    :cond_6
    invoke-virtual {v7}, Lm/b/i/l;->i()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2, v8}, Lm/b/j/b;->h(Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_7

    .line 20
    invoke-virtual {v2, v0}, Lm/b/j/b;->a(Lm/b/j/b0;)V

    return v6

    .line 21
    :cond_7
    invoke-virtual/range {p2 .. p2}, Lm/b/j/j3;->a()Lm/b/i/l;

    move-result-object v8

    if-eq v8, v7, :cond_8

    .line 22
    invoke-virtual {v2, v0}, Lm/b/j/b;->a(Lm/b/j/b0;)V

    .line 23
    :cond_8
    invoke-virtual/range {p2 .. p2}, Lm/b/j/b;->o()Ljava/util/ArrayList;

    move-result-object v8

    .line 24
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v9

    move-object v13, v10

    const/4 v11, 0x0

    const/4 v12, 0x0

    :goto_2
    if-ge v11, v9, :cond_b

    const/16 v14, 0x40

    if-ge v11, v14, :cond_b

    .line 25
    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lm/b/i/l;

    if-ne v14, v7, :cond_9

    add-int/lit8 v12, v11, -0x1

    .line 26
    invoke-virtual {v8, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    move-object v13, v12

    check-cast v13, Lm/b/i/l;

    const/4 v12, 0x1

    goto :goto_3

    :cond_9
    if-eqz v12, :cond_a

    .line 27
    invoke-virtual {v2, v14}, Lm/b/j/b;->d(Lm/b/i/l;)Z

    move-result v15

    if-eqz v15, :cond_a

    goto :goto_4

    :cond_a
    :goto_3
    add-int/lit8 v11, v11, 0x1

    goto :goto_2

    :cond_b
    move-object v14, v10

    :goto_4
    if-nez v14, :cond_c

    .line 28
    invoke-virtual {v7}, Lm/b/i/l;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lm/b/j/b;->m(Ljava/lang/String;)V

    .line 29
    invoke-virtual {v2, v7}, Lm/b/j/b;->i(Lm/b/i/l;)V

    return v4

    :cond_c
    move-object v9, v14

    move-object v11, v9

    const/4 v8, 0x0

    :goto_5
    const/4 v12, 0x3

    if-ge v8, v12, :cond_11

    .line 30
    invoke-virtual {v2, v9}, Lm/b/j/b;->f(Lm/b/i/l;)Z

    move-result v15

    if-eqz v15, :cond_d

    .line 31
    invoke-virtual {v2, v9}, Lm/b/j/b;->a(Lm/b/i/l;)Lm/b/i/l;

    move-result-object v9

    .line 32
    :cond_d
    invoke-virtual {v2, v9}, Lm/b/j/b;->c(Lm/b/i/l;)Z

    move-result v15

    if-nez v15, :cond_e

    .line 33
    invoke-virtual {v2, v9}, Lm/b/j/b;->j(Lm/b/i/l;)Z

    goto :goto_6

    :cond_e
    if-ne v9, v7, :cond_f

    goto :goto_7

    .line 34
    :cond_f
    new-instance v15, Lm/b/i/l;

    invoke-virtual {v9}, Lm/b/i/l;->i()Ljava/lang/String;

    move-result-object v12

    sget-object v4, Lm/b/j/e0;->d:Lm/b/j/e0;

    invoke-static {v12, v4}, Lm/b/j/g0;->a(Ljava/lang/String;Lm/b/j/e0;)Lm/b/j/g0;

    move-result-object v4

    invoke-virtual/range {p2 .. p2}, Lm/b/j/b;->j()Ljava/lang/String;

    move-result-object v12

    invoke-direct {v15, v4, v12}, Lm/b/i/l;-><init>(Lm/b/j/g0;Ljava/lang/String;)V

    .line 35
    invoke-virtual {v2, v9, v15}, Lm/b/j/b;->c(Lm/b/i/l;Lm/b/i/l;)V

    .line 36
    invoke-virtual {v2, v9, v15}, Lm/b/j/b;->d(Lm/b/i/l;Lm/b/i/l;)V

    .line 37
    invoke-virtual {v11}, Lm/b/i/l;->l()Lm/b/i/l;

    move-result-object v4

    if-eqz v4, :cond_10

    .line 38
    invoke-virtual {v11}, Lm/b/i/t;->n()V

    .line 39
    :cond_10
    invoke-virtual {v15, v11}, Lm/b/i/l;->f(Lm/b/i/t;)Lm/b/i/l;

    move-object v9, v15

    move-object v11, v9

    :goto_6
    add-int/lit8 v8, v8, 0x1

    const/4 v4, 0x1

    goto :goto_5

    .line 40
    :cond_11
    :goto_7
    invoke-virtual {v13}, Lm/b/i/l;->i()Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lm/b/j/a0;->k()[Ljava/lang/String;

    move-result-object v8

    invoke-static {v4, v8}, Lm/b/h/i;->b(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_13

    .line 41
    invoke-virtual {v11}, Lm/b/i/l;->l()Lm/b/i/l;

    move-result-object v4

    if-eqz v4, :cond_12

    .line 42
    invoke-virtual {v11}, Lm/b/i/t;->n()V

    .line 43
    :cond_12
    invoke-virtual {v2, v11}, Lm/b/j/b;->a(Lm/b/i/t;)V

    goto :goto_8

    .line 44
    :cond_13
    invoke-virtual {v11}, Lm/b/i/l;->l()Lm/b/i/l;

    move-result-object v4

    if-eqz v4, :cond_14

    .line 45
    invoke-virtual {v11}, Lm/b/i/t;->n()V

    .line 46
    :cond_14
    invoke-virtual {v13, v11}, Lm/b/i/l;->f(Lm/b/i/t;)Lm/b/i/l;

    .line 47
    :goto_8
    new-instance v4, Lm/b/i/l;

    invoke-virtual {v7}, Lm/b/i/l;->B()Lm/b/j/g0;

    move-result-object v8

    invoke-virtual/range {p2 .. p2}, Lm/b/j/b;->j()Ljava/lang/String;

    move-result-object v9

    invoke-direct {v4, v8, v9}, Lm/b/i/l;-><init>(Lm/b/j/g0;Ljava/lang/String;)V

    .line 48
    invoke-virtual {v4}, Lm/b/i/t;->a()Lm/b/i/b;

    move-result-object v8

    invoke-virtual {v7}, Lm/b/i/t;->a()Lm/b/i/b;

    move-result-object v9

    invoke-virtual {v8, v9}, Lm/b/i/b;->a(Lm/b/i/b;)V

    .line 49
    invoke-virtual {v14}, Lm/b/i/t;->e()Ljava/util/List;

    move-result-object v8

    invoke-virtual {v14}, Lm/b/i/t;->d()I

    move-result v9

    new-array v9, v9, [Lm/b/i/t;

    invoke-interface {v8, v9}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v8

    check-cast v8, [Lm/b/i/t;

    .line 50
    array-length v9, v8

    const/4 v11, 0x0

    :goto_9
    if-ge v11, v9, :cond_15

    aget-object v12, v8, v11

    .line 51
    invoke-virtual {v4, v12}, Lm/b/i/l;->f(Lm/b/i/t;)Lm/b/i/l;

    add-int/lit8 v11, v11, 0x1

    goto :goto_9

    .line 52
    :cond_15
    invoke-virtual {v14, v4}, Lm/b/i/l;->f(Lm/b/i/t;)Lm/b/i/l;

    .line 53
    invoke-virtual {v2, v7}, Lm/b/j/b;->i(Lm/b/i/l;)V

    .line 54
    invoke-virtual {v2, v7}, Lm/b/j/b;->j(Lm/b/i/l;)Z

    .line 55
    invoke-virtual {v2, v14, v4}, Lm/b/j/b;->a(Lm/b/i/l;Lm/b/i/l;)V

    add-int/lit8 v3, v3, 0x1

    const/4 v4, 0x1

    goto/16 :goto_1

    .line 56
    :cond_16
    invoke-static {}, Lm/b/j/a0;->l()[Ljava/lang/String;

    move-result-object v4

    invoke-static {v5, v4}, Lm/b/h/i;->b(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_19

    .line 57
    invoke-virtual {v2, v5}, Lm/b/j/b;->h(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_17

    .line 58
    invoke-virtual {v2, v0}, Lm/b/j/b;->a(Lm/b/j/b0;)V

    return v6

    .line 59
    :cond_17
    invoke-virtual/range {p2 .. p2}, Lm/b/j/b;->i()V

    .line 60
    invoke-virtual/range {p2 .. p2}, Lm/b/j/j3;->a()Lm/b/i/l;

    move-result-object v1

    invoke-virtual {v1}, Lm/b/i/l;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_18

    .line 61
    invoke-virtual {v2, v0}, Lm/b/j/b;->a(Lm/b/j/b0;)V

    .line 62
    :cond_18
    invoke-virtual {v2, v5}, Lm/b/j/b;->m(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 63
    :cond_19
    invoke-virtual {v5, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1a

    .line 64
    invoke-virtual/range {p0 .. p2}, Lm/b/j/x;->b(Lm/b/j/q0;Lm/b/j/b;)Z

    move-result v1

    return v1

    .line 65
    :cond_1a
    invoke-virtual {v5, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1d

    .line 66
    invoke-virtual {v2, v5}, Lm/b/j/b;->g(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1b

    .line 67
    invoke-virtual {v2, v0}, Lm/b/j/b;->a(Lm/b/j/b0;)V

    return v6

    .line 68
    :cond_1b
    invoke-virtual {v2, v5}, Lm/b/j/b;->c(Ljava/lang/String;)V

    .line 69
    invoke-virtual/range {p2 .. p2}, Lm/b/j/j3;->a()Lm/b/i/l;

    move-result-object v1

    invoke-virtual {v1}, Lm/b/i/l;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1c

    .line 70
    invoke-virtual {v2, v0}, Lm/b/j/b;->a(Lm/b/j/b0;)V

    .line 71
    :cond_1c
    invoke-virtual {v2, v5}, Lm/b/j/b;->m(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 72
    :cond_1d
    invoke-virtual {v5, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1f

    .line 73
    invoke-virtual {v2, v13}, Lm/b/j/b;->h(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1e

    .line 74
    invoke-virtual {v2, v0}, Lm/b/j/b;->a(Lm/b/j/b0;)V

    return v6

    .line 75
    :cond_1e
    sget-object v1, Lm/b/j/b0;->s:Lm/b/j/b0;

    invoke-virtual {v2, v1}, Lm/b/j/b;->b(Lm/b/j/b0;)V

    goto/16 :goto_0

    .line 76
    :cond_1f
    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_20

    .line 77
    invoke-virtual {v2, v13}, Lm/b/j/j3;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 78
    invoke-virtual {v2, v3}, Lm/b/j/b;->a(Lm/b/j/q0;)Z

    move-result v1

    return v1

    .line 79
    :cond_20
    invoke-virtual {v5, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_24

    .line 80
    invoke-virtual/range {p2 .. p2}, Lm/b/j/b;->l()Lm/b/i/q;

    move-result-object v1

    .line 81
    invoke-virtual {v2, v10}, Lm/b/j/b;->a(Lm/b/i/q;)V

    if-eqz v1, :cond_23

    .line 82
    invoke-virtual {v2, v5}, Lm/b/j/b;->h(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_21

    goto :goto_a

    .line 83
    :cond_21
    invoke-virtual/range {p2 .. p2}, Lm/b/j/b;->i()V

    .line 84
    invoke-virtual/range {p2 .. p2}, Lm/b/j/j3;->a()Lm/b/i/l;

    move-result-object v3

    invoke-virtual {v3}, Lm/b/i/l;->i()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_22

    .line 85
    invoke-virtual {v2, v0}, Lm/b/j/b;->a(Lm/b/j/b0;)V

    .line 86
    :cond_22
    invoke-virtual {v2, v1}, Lm/b/j/b;->j(Lm/b/i/l;)Z

    goto/16 :goto_0

    .line 87
    :cond_23
    :goto_a
    invoke-virtual {v2, v0}, Lm/b/j/b;->a(Lm/b/j/b0;)V

    return v6

    .line 88
    :cond_24
    invoke-virtual {v5, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_27

    .line 89
    invoke-virtual {v2, v5}, Lm/b/j/b;->f(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_25

    .line 90
    invoke-virtual {v2, v0}, Lm/b/j/b;->a(Lm/b/j/b0;)V

    .line 91
    invoke-virtual {v2, v5}, Lm/b/j/j3;->b(Ljava/lang/String;)Z

    .line 92
    invoke-virtual {v2, v3}, Lm/b/j/b;->a(Lm/b/j/q0;)Z

    move-result v1

    return v1

    .line 93
    :cond_25
    invoke-virtual {v2, v5}, Lm/b/j/b;->c(Ljava/lang/String;)V

    .line 94
    invoke-virtual/range {p2 .. p2}, Lm/b/j/j3;->a()Lm/b/i/l;

    move-result-object v1

    invoke-virtual {v1}, Lm/b/i/l;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_26

    .line 95
    invoke-virtual {v2, v0}, Lm/b/j/b;->a(Lm/b/j/b0;)V

    .line 96
    :cond_26
    invoke-virtual {v2, v5}, Lm/b/j/b;->m(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 97
    :cond_27
    invoke-static {}, Lm/b/j/a0;->b()[Ljava/lang/String;

    move-result-object v3

    invoke-static {v5, v3}, Lm/b/h/i;->b(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2a

    .line 98
    invoke-virtual {v2, v5}, Lm/b/j/b;->h(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_28

    .line 99
    invoke-virtual {v2, v0}, Lm/b/j/b;->a(Lm/b/j/b0;)V

    return v6

    .line 100
    :cond_28
    invoke-virtual {v2, v5}, Lm/b/j/b;->c(Ljava/lang/String;)V

    .line 101
    invoke-virtual/range {p2 .. p2}, Lm/b/j/j3;->a()Lm/b/i/l;

    move-result-object v1

    invoke-virtual {v1}, Lm/b/i/l;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_29

    .line 102
    invoke-virtual {v2, v0}, Lm/b/j/b;->a(Lm/b/j/b0;)V

    .line 103
    :cond_29
    invoke-virtual {v2, v5}, Lm/b/j/b;->m(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 104
    :cond_2a
    invoke-static {}, Lm/b/j/a0;->q()[Ljava/lang/String;

    move-result-object v3

    invoke-static {v5, v3}, Lm/b/h/i;->b(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2d

    .line 105
    invoke-static {}, Lm/b/j/a0;->q()[Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lm/b/j/b;->b([Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2b

    .line 106
    invoke-virtual {v2, v0}, Lm/b/j/b;->a(Lm/b/j/b0;)V

    return v6

    .line 107
    :cond_2b
    invoke-virtual {v2, v5}, Lm/b/j/b;->c(Ljava/lang/String;)V

    .line 108
    invoke-virtual/range {p2 .. p2}, Lm/b/j/j3;->a()Lm/b/i/l;

    move-result-object v1

    invoke-virtual {v1}, Lm/b/i/l;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2c

    .line 109
    invoke-virtual {v2, v0}, Lm/b/j/b;->a(Lm/b/j/b0;)V

    .line 110
    :cond_2c
    invoke-static {}, Lm/b/j/a0;->q()[Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lm/b/j/b;->c([Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_2d
    const-string v3, "sarcasm"

    .line 111
    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2e

    .line 112
    invoke-virtual/range {p0 .. p2}, Lm/b/j/x;->b(Lm/b/j/q0;Lm/b/j/b;)Z

    move-result v1

    return v1

    .line 113
    :cond_2e
    invoke-static {}, Lm/b/j/a0;->d()[Ljava/lang/String;

    move-result-object v3

    invoke-static {v5, v3}, Lm/b/h/i;->b(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_31

    .line 114
    invoke-virtual {v2, v7}, Lm/b/j/b;->h(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 115
    invoke-virtual {v2, v5}, Lm/b/j/b;->h(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2f

    .line 116
    invoke-virtual {v2, v0}, Lm/b/j/b;->a(Lm/b/j/b0;)V

    return v6

    .line 117
    :cond_2f
    invoke-virtual/range {p2 .. p2}, Lm/b/j/b;->i()V

    .line 118
    invoke-virtual/range {p2 .. p2}, Lm/b/j/j3;->a()Lm/b/i/l;

    move-result-object v1

    invoke-virtual {v1}, Lm/b/i/l;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_30

    .line 119
    invoke-virtual {v2, v0}, Lm/b/j/b;->a(Lm/b/j/b0;)V

    .line 120
    :cond_30
    invoke-virtual {v2, v5}, Lm/b/j/b;->m(Ljava/lang/String;)V

    .line 121
    invoke-virtual/range {p2 .. p2}, Lm/b/j/b;->d()V

    goto/16 :goto_0

    :cond_31
    const-string v3, "br"

    .line 122
    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_32

    .line 123
    invoke-virtual {v2, v0}, Lm/b/j/b;->a(Lm/b/j/b0;)V

    .line 124
    invoke-virtual {v2, v3}, Lm/b/j/j3;->b(Ljava/lang/String;)Z

    return v6

    .line 125
    :cond_32
    invoke-virtual/range {p0 .. p2}, Lm/b/j/x;->b(Lm/b/j/q0;Lm/b/j/b;)Z

    move-result v1

    return v1

    .line 126
    :cond_33
    invoke-virtual/range {p1 .. p1}, Lm/b/j/q0;->e()Lm/b/j/n0;

    move-result-object v3

    .line 127
    invoke-virtual {v3}, Lm/b/j/o0;->t()Ljava/lang/String;

    move-result-object v4

    const-string v10, "a"

    .line 128
    invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_35

    .line 129
    invoke-virtual {v2, v10}, Lm/b/j/b;->d(Ljava/lang/String;)Lm/b/i/l;

    move-result-object v1

    if-eqz v1, :cond_34

    .line 130
    invoke-virtual {v2, v0}, Lm/b/j/b;->a(Lm/b/j/b0;)V

    .line 131
    invoke-virtual {v2, v10}, Lm/b/j/j3;->a(Ljava/lang/String;)Z

    .line 132
    invoke-virtual {v2, v10}, Lm/b/j/b;->e(Ljava/lang/String;)Lm/b/i/l;

    move-result-object v1

    if-eqz v1, :cond_34

    .line 133
    invoke-virtual {v2, v1}, Lm/b/j/b;->i(Lm/b/i/l;)V

    .line 134
    invoke-virtual {v2, v1}, Lm/b/j/b;->j(Lm/b/i/l;)Z

    .line 135
    :cond_34
    invoke-virtual/range {p2 .. p2}, Lm/b/j/b;->x()V

    .line 136
    invoke-virtual {v2, v3}, Lm/b/j/b;->a(Lm/b/j/n0;)Lm/b/i/l;

    move-result-object v1

    .line 137
    invoke-virtual {v2, v1}, Lm/b/j/b;->h(Lm/b/i/l;)V

    goto/16 :goto_0

    .line 138
    :cond_35
    invoke-static {}, Lm/b/j/a0;->m()[Ljava/lang/String;

    move-result-object v10

    invoke-static {v4, v10}, Lm/b/h/i;->b(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_36

    .line 139
    invoke-virtual/range {p2 .. p2}, Lm/b/j/b;->x()V

    .line 140
    invoke-virtual {v2, v3}, Lm/b/j/b;->b(Lm/b/j/n0;)Lm/b/i/l;

    .line 141
    invoke-virtual {v2, v6}, Lm/b/j/b;->a(Z)V

    goto/16 :goto_0

    .line 142
    :cond_36
    invoke-static {}, Lm/b/j/a0;->n()[Ljava/lang/String;

    move-result-object v10

    invoke-static {v4, v10}, Lm/b/h/i;->b(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_38

    .line 143
    invoke-virtual {v2, v14}, Lm/b/j/b;->f(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_37

    .line 144
    invoke-virtual {v2, v14}, Lm/b/j/j3;->a(Ljava/lang/String;)Z

    .line 145
    :cond_37
    invoke-virtual {v2, v3}, Lm/b/j/b;->a(Lm/b/j/n0;)Lm/b/i/l;

    goto/16 :goto_0

    .line 146
    :cond_38
    invoke-virtual {v4, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_39

    .line 147
    invoke-virtual/range {p2 .. p2}, Lm/b/j/b;->x()V

    .line 148
    invoke-virtual {v2, v3}, Lm/b/j/b;->a(Lm/b/j/n0;)Lm/b/i/l;

    goto/16 :goto_0

    .line 149
    :cond_39
    invoke-virtual {v4, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_3e

    .line 150
    invoke-virtual {v2, v6}, Lm/b/j/b;->a(Z)V

    .line 151
    invoke-virtual/range {p2 .. p2}, Lm/b/j/b;->o()Ljava/util/ArrayList;

    move-result-object v1

    .line 152
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v4

    const/4 v5, 0x1

    sub-int/2addr v4, v5

    :goto_b
    if-lez v4, :cond_3c

    .line 153
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lm/b/i/l;

    .line 154
    invoke-virtual {v5}, Lm/b/i/l;->i()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3a

    .line 155
    invoke-virtual {v2, v12}, Lm/b/j/j3;->a(Ljava/lang/String;)Z

    goto :goto_c

    .line 156
    :cond_3a
    invoke-virtual {v2, v5}, Lm/b/j/b;->d(Lm/b/i/l;)Z

    move-result v6

    if-eqz v6, :cond_3b

    invoke-virtual {v5}, Lm/b/i/l;->i()Ljava/lang/String;

    move-result-object v5

    invoke-static {}, Lm/b/j/a0;->o()[Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lm/b/h/i;->b(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_3b

    goto :goto_c

    :cond_3b
    add-int/lit8 v4, v4, -0x1

    goto :goto_b

    .line 157
    :cond_3c
    :goto_c
    invoke-virtual {v2, v14}, Lm/b/j/b;->f(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3d

    .line 158
    invoke-virtual {v2, v14}, Lm/b/j/j3;->a(Ljava/lang/String;)Z

    .line 159
    :cond_3d
    invoke-virtual {v2, v3}, Lm/b/j/b;->a(Lm/b/j/n0;)Lm/b/i/l;

    goto/16 :goto_0

    .line 160
    :cond_3e
    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_40

    .line 161
    invoke-virtual {v2, v0}, Lm/b/j/b;->a(Lm/b/j/b0;)V

    .line 162
    invoke-virtual/range {p2 .. p2}, Lm/b/j/b;->o()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm/b/i/l;

    .line 163
    invoke-virtual {v3}, Lm/b/j/o0;->p()Lm/b/i/b;

    move-result-object v2

    invoke-virtual {v2}, Lm/b/i/b;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_3f
    :goto_d
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lm/b/i/a;

    .line 164
    invoke-virtual {v3}, Lm/b/i/a;->getKey()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lm/b/i/t;->c(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_3f

    .line 165
    invoke-virtual {v1}, Lm/b/i/t;->a()Lm/b/i/b;

    move-result-object v4

    invoke-virtual {v4, v3}, Lm/b/i/b;->a(Lm/b/i/a;)V

    goto :goto_d

    .line 166
    :cond_40
    invoke-static {}, Lm/b/j/a0;->p()[Ljava/lang/String;

    move-result-object v8

    invoke-static {v4, v8}, Lm/b/h/i;->b(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_41

    .line 167
    sget-object v3, Lm/b/j/b0;->e:Lm/b/j/b0;

    invoke-virtual {v2, v1, v3}, Lm/b/j/b;->a(Lm/b/j/q0;Lm/b/j/b0;)Z

    move-result v1

    return v1

    .line 168
    :cond_41
    invoke-virtual {v4, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_45

    .line 169
    invoke-virtual {v2, v0}, Lm/b/j/b;->a(Lm/b/j/b0;)V

    .line 170
    invoke-virtual/range {p2 .. p2}, Lm/b/j/b;->o()Ljava/util/ArrayList;

    move-result-object v1

    .line 171
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v4

    const/4 v7, 0x1

    if-eq v4, v7, :cond_44

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-le v4, v5, :cond_42

    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lm/b/i/l;

    invoke-virtual {v4}, Lm/b/i/l;->i()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_42

    goto :goto_f

    .line 172
    :cond_42
    invoke-virtual {v2, v6}, Lm/b/j/b;->a(Z)V

    .line 173
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm/b/i/l;

    .line 174
    invoke-virtual {v3}, Lm/b/j/o0;->p()Lm/b/i/b;

    move-result-object v2

    invoke-virtual {v2}, Lm/b/i/b;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_43
    :goto_e
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lm/b/i/a;

    .line 175
    invoke-virtual {v3}, Lm/b/i/a;->getKey()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lm/b/i/t;->c(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_43

    .line 176
    invoke-virtual {v1}, Lm/b/i/t;->a()Lm/b/i/b;

    move-result-object v4

    invoke-virtual {v4, v3}, Lm/b/i/b;->a(Lm/b/i/a;)V

    goto :goto_e

    :cond_44
    :goto_f
    return v6

    :cond_45
    const-string v1, "frameset"

    .line 177
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4b

    .line 178
    invoke-virtual {v2, v0}, Lm/b/j/b;->a(Lm/b/j/b0;)V

    .line 179
    invoke-virtual/range {p2 .. p2}, Lm/b/j/b;->o()Ljava/util/ArrayList;

    move-result-object v1

    .line 180
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v4

    const/4 v7, 0x1

    if-eq v4, v7, :cond_4a

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-le v4, v5, :cond_46

    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lm/b/i/l;

    invoke-virtual {v4}, Lm/b/i/l;->i()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_46

    goto :goto_11

    .line 181
    :cond_46
    invoke-virtual/range {p2 .. p2}, Lm/b/j/b;->h()Z

    move-result v4

    if-nez v4, :cond_47

    return v6

    .line 182
    :cond_47
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lm/b/i/l;

    .line 183
    invoke-virtual {v4}, Lm/b/i/l;->l()Lm/b/i/l;

    move-result-object v5

    if-eqz v5, :cond_48

    .line 184
    invoke-virtual {v4}, Lm/b/i/t;->n()V

    .line 185
    :cond_48
    :goto_10
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-le v4, v7, :cond_49

    .line 186
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v4

    sub-int/2addr v4, v7

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    const/4 v7, 0x1

    goto :goto_10

    .line 187
    :cond_49
    invoke-virtual {v2, v3}, Lm/b/j/b;->a(Lm/b/j/n0;)Lm/b/i/l;

    .line 188
    sget-object v1, Lm/b/j/b0;->t:Lm/b/j/b0;

    invoke-virtual {v2, v1}, Lm/b/j/b;->b(Lm/b/j/b0;)V

    goto/16 :goto_0

    :cond_4a
    :goto_11
    return v6

    .line 189
    :cond_4b
    invoke-static {}, Lm/b/j/a0;->q()[Ljava/lang/String;

    move-result-object v1

    invoke-static {v4, v1}, Lm/b/h/i;->b(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4e

    .line 190
    invoke-virtual {v2, v14}, Lm/b/j/b;->f(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4c

    .line 191
    invoke-virtual {v2, v14}, Lm/b/j/j3;->a(Ljava/lang/String;)Z

    .line 192
    :cond_4c
    invoke-virtual/range {p2 .. p2}, Lm/b/j/j3;->a()Lm/b/i/l;

    move-result-object v1

    invoke-virtual {v1}, Lm/b/i/l;->i()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lm/b/j/a0;->q()[Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Lm/b/h/i;->b(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4d

    .line 193
    invoke-virtual {v2, v0}, Lm/b/j/b;->a(Lm/b/j/b0;)V

    .line 194
    invoke-virtual/range {p2 .. p2}, Lm/b/j/b;->w()Lm/b/i/l;

    .line 195
    :cond_4d
    invoke-virtual {v2, v3}, Lm/b/j/b;->a(Lm/b/j/n0;)Lm/b/i/l;

    goto/16 :goto_0

    .line 196
    :cond_4e
    invoke-static {}, Lm/b/j/a0;->a()[Ljava/lang/String;

    move-result-object v1

    invoke-static {v4, v1}, Lm/b/h/i;->b(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_50

    .line 197
    invoke-virtual {v2, v14}, Lm/b/j/b;->f(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4f

    .line 198
    invoke-virtual {v2, v14}, Lm/b/j/j3;->a(Ljava/lang/String;)Z

    .line 199
    :cond_4f
    invoke-virtual {v2, v3}, Lm/b/j/b;->a(Lm/b/j/n0;)Lm/b/i/l;

    .line 200
    invoke-virtual {v2, v6}, Lm/b/j/b;->a(Z)V

    goto/16 :goto_0

    .line 201
    :cond_50
    invoke-virtual {v4, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_53

    .line 202
    invoke-virtual/range {p2 .. p2}, Lm/b/j/b;->l()Lm/b/i/q;

    move-result-object v1

    if-eqz v1, :cond_51

    .line 203
    invoke-virtual {v2, v0}, Lm/b/j/b;->a(Lm/b/j/b0;)V

    return v6

    .line 204
    :cond_51
    invoke-virtual {v2, v14}, Lm/b/j/b;->f(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_52

    .line 205
    invoke-virtual {v2, v14}, Lm/b/j/j3;->a(Ljava/lang/String;)Z

    :cond_52
    const/4 v1, 0x1

    .line 206
    invoke-virtual {v2, v3, v1}, Lm/b/j/b;->a(Lm/b/j/n0;Z)Lm/b/i/q;

    goto/16 :goto_17

    :cond_53
    const/4 v1, 0x1

    .line 207
    invoke-static {}, Lm/b/j/a0;->b()[Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lm/b/h/i;->b(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_58

    .line 208
    invoke-virtual {v2, v6}, Lm/b/j/b;->a(Z)V

    .line 209
    invoke-virtual/range {p2 .. p2}, Lm/b/j/b;->o()Ljava/util/ArrayList;

    move-result-object v4

    .line 210
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v5

    sub-int/2addr v5, v1

    :goto_12
    if-lez v5, :cond_56

    .line 211
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm/b/i/l;

    .line 212
    invoke-virtual {v1}, Lm/b/i/l;->i()Ljava/lang/String;

    move-result-object v6

    invoke-static {}, Lm/b/j/a0;->b()[Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lm/b/h/i;->b(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_54

    .line 213
    invoke-virtual {v1}, Lm/b/i/l;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lm/b/j/j3;->a(Ljava/lang/String;)Z

    goto :goto_13

    .line 214
    :cond_54
    invoke-virtual {v2, v1}, Lm/b/j/b;->d(Lm/b/i/l;)Z

    move-result v6

    if-eqz v6, :cond_55

    invoke-virtual {v1}, Lm/b/i/l;->i()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lm/b/j/a0;->o()[Ljava/lang/String;

    move-result-object v6

    invoke-static {v1, v6}, Lm/b/h/i;->b(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_55

    goto :goto_13

    :cond_55
    add-int/lit8 v5, v5, -0x1

    goto :goto_12

    .line 215
    :cond_56
    :goto_13
    invoke-virtual {v2, v14}, Lm/b/j/b;->f(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_57

    .line 216
    invoke-virtual {v2, v14}, Lm/b/j/j3;->a(Ljava/lang/String;)Z

    .line 217
    :cond_57
    invoke-virtual {v2, v3}, Lm/b/j/b;->a(Lm/b/j/n0;)Lm/b/i/l;

    goto/16 :goto_0

    :cond_58
    const-string v1, "plaintext"

    .line 218
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5a

    .line 219
    invoke-virtual {v2, v14}, Lm/b/j/b;->f(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_59

    .line 220
    invoke-virtual {v2, v14}, Lm/b/j/j3;->a(Ljava/lang/String;)Z

    .line 221
    :cond_59
    invoke-virtual {v2, v3}, Lm/b/j/b;->a(Lm/b/j/n0;)Lm/b/i/l;

    .line 222
    iget-object v1, v2, Lm/b/j/j3;->b:Lm/b/j/s0;

    sget-object v2, Lm/b/j/i3;->h:Lm/b/j/i3;

    invoke-virtual {v1, v2}, Lm/b/j/s0;->d(Lm/b/j/i3;)V

    goto/16 :goto_0

    :cond_5a
    const-string v1, "button"

    .line 223
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5c

    .line 224
    invoke-virtual {v2, v1}, Lm/b/j/b;->f(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_5b

    .line 225
    invoke-virtual {v2, v0}, Lm/b/j/b;->a(Lm/b/j/b0;)V

    .line 226
    invoke-virtual {v2, v1}, Lm/b/j/j3;->a(Ljava/lang/String;)Z

    .line 227
    invoke-virtual {v2, v3}, Lm/b/j/b;->a(Lm/b/j/q0;)Z

    goto/16 :goto_0

    .line 228
    :cond_5b
    invoke-virtual/range {p2 .. p2}, Lm/b/j/b;->x()V

    .line 229
    invoke-virtual {v2, v3}, Lm/b/j/b;->a(Lm/b/j/n0;)Lm/b/i/l;

    .line 230
    invoke-virtual {v2, v6}, Lm/b/j/b;->a(Z)V

    goto/16 :goto_0

    .line 231
    :cond_5c
    invoke-static {}, Lm/b/j/a0;->c()[Ljava/lang/String;

    move-result-object v1

    invoke-static {v4, v1}, Lm/b/h/i;->b(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5d

    .line 232
    invoke-virtual/range {p2 .. p2}, Lm/b/j/b;->x()V

    .line 233
    invoke-virtual {v2, v3}, Lm/b/j/b;->a(Lm/b/j/n0;)Lm/b/i/l;

    move-result-object v1

    .line 234
    invoke-virtual {v2, v1}, Lm/b/j/b;->h(Lm/b/i/l;)V

    goto/16 :goto_0

    :cond_5d
    const-string v1, "nobr"

    .line 235
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5f

    .line 236
    invoke-virtual/range {p2 .. p2}, Lm/b/j/b;->x()V

    .line 237
    invoke-virtual {v2, v1}, Lm/b/j/b;->h(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_5e

    .line 238
    invoke-virtual {v2, v0}, Lm/b/j/b;->a(Lm/b/j/b0;)V

    .line 239
    invoke-virtual {v2, v1}, Lm/b/j/j3;->a(Ljava/lang/String;)Z

    .line 240
    invoke-virtual/range {p2 .. p2}, Lm/b/j/b;->x()V

    .line 241
    :cond_5e
    invoke-virtual {v2, v3}, Lm/b/j/b;->a(Lm/b/j/n0;)Lm/b/i/l;

    move-result-object v1

    .line 242
    invoke-virtual {v2, v1}, Lm/b/j/b;->h(Lm/b/i/l;)V

    goto/16 :goto_0

    .line 243
    :cond_5f
    invoke-static {}, Lm/b/j/a0;->d()[Ljava/lang/String;

    move-result-object v1

    invoke-static {v4, v1}, Lm/b/h/i;->b(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_60

    .line 244
    invoke-virtual/range {p2 .. p2}, Lm/b/j/b;->x()V

    .line 245
    invoke-virtual {v2, v3}, Lm/b/j/b;->a(Lm/b/j/n0;)Lm/b/i/l;

    .line 246
    invoke-virtual/range {p2 .. p2}, Lm/b/j/b;->p()V

    .line 247
    invoke-virtual {v2, v6}, Lm/b/j/b;->a(Z)V

    goto/16 :goto_0

    :cond_60
    const-string v1, "table"

    .line 248
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_62

    .line 249
    invoke-virtual/range {p2 .. p2}, Lm/b/j/b;->k()Lm/b/i/i;

    move-result-object v1

    invoke-virtual {v1}, Lm/b/i/i;->F()Lm/b/i/h;

    move-result-object v1

    sget-object v4, Lm/b/i/h;->c:Lm/b/i/h;

    if-eq v1, v4, :cond_61

    invoke-virtual {v2, v14}, Lm/b/j/b;->f(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_61

    .line 250
    invoke-virtual {v2, v14}, Lm/b/j/j3;->a(Ljava/lang/String;)Z

    .line 251
    :cond_61
    invoke-virtual {v2, v3}, Lm/b/j/b;->a(Lm/b/j/n0;)Lm/b/i/l;

    .line 252
    invoke-virtual {v2, v6}, Lm/b/j/b;->a(Z)V

    .line 253
    sget-object v1, Lm/b/j/b0;->j:Lm/b/j/b0;

    invoke-virtual {v2, v1}, Lm/b/j/b;->b(Lm/b/j/b0;)V

    goto/16 :goto_0

    :cond_62
    const-string v1, "input"

    .line 254
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_63

    .line 255
    invoke-virtual/range {p2 .. p2}, Lm/b/j/b;->x()V

    .line 256
    invoke-virtual {v2, v3}, Lm/b/j/b;->b(Lm/b/j/n0;)Lm/b/i/l;

    move-result-object v1

    const-string v3, "type"

    .line 257
    invoke-virtual {v1, v3}, Lm/b/i/t;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v3, "hidden"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 258
    invoke-virtual {v2, v6}, Lm/b/j/b;->a(Z)V

    goto/16 :goto_0

    .line 259
    :cond_63
    invoke-static {}, Lm/b/j/a0;->e()[Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lm/b/h/i;->b(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_64

    .line 260
    invoke-virtual {v2, v3}, Lm/b/j/b;->b(Lm/b/j/n0;)Lm/b/i/l;

    goto/16 :goto_0

    :cond_64
    const-string v5, "hr"

    .line 261
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_66

    .line 262
    invoke-virtual {v2, v14}, Lm/b/j/b;->f(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_65

    .line 263
    invoke-virtual {v2, v14}, Lm/b/j/j3;->a(Ljava/lang/String;)Z

    .line 264
    :cond_65
    invoke-virtual {v2, v3}, Lm/b/j/b;->b(Lm/b/j/n0;)Lm/b/i/l;

    .line 265
    invoke-virtual {v2, v6}, Lm/b/j/b;->a(Z)V

    goto/16 :goto_0

    :cond_66
    const-string v8, "image"

    .line 266
    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_68

    const-string v1, "svg"

    .line 267
    invoke-virtual {v2, v1}, Lm/b/j/b;->e(Ljava/lang/String;)Lm/b/i/l;

    move-result-object v1

    if-nez v1, :cond_67

    const-string v1, "img"

    .line 268
    invoke-virtual {v3, v1}, Lm/b/j/o0;->d(Ljava/lang/String;)Lm/b/j/o0;

    invoke-virtual {v2, v3}, Lm/b/j/b;->a(Lm/b/j/q0;)Z

    move-result v1

    return v1

    .line 269
    :cond_67
    invoke-virtual {v2, v3}, Lm/b/j/b;->a(Lm/b/j/n0;)Lm/b/i/l;

    goto/16 :goto_0

    :cond_68
    const-string v8, "isindex"

    .line 270
    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_6e

    .line 271
    invoke-virtual {v2, v0}, Lm/b/j/b;->a(Lm/b/j/b0;)V

    .line 272
    invoke-virtual/range {p2 .. p2}, Lm/b/j/b;->l()Lm/b/i/q;

    move-result-object v4

    if-eqz v4, :cond_69

    return v6

    .line 273
    :cond_69
    iget-object v4, v2, Lm/b/j/j3;->b:Lm/b/j/s0;

    invoke-virtual {v4}, Lm/b/j/s0;->a()V

    .line 274
    invoke-virtual {v2, v11}, Lm/b/j/j3;->b(Ljava/lang/String;)Z

    .line 275
    iget-object v4, v3, Lm/b/j/o0;->j:Lm/b/i/b;

    const-string v6, "action"

    invoke-virtual {v4, v6}, Lm/b/i/b;->c(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_6a

    .line 276
    invoke-virtual/range {p2 .. p2}, Lm/b/j/b;->l()Lm/b/i/q;

    move-result-object v4

    .line 277
    iget-object v9, v3, Lm/b/j/o0;->j:Lm/b/i/b;

    invoke-virtual {v9, v6}, Lm/b/i/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v4, v6, v9}, Lm/b/i/l;->a(Ljava/lang/String;Ljava/lang/String;)Lm/b/i/l;

    .line 278
    :cond_6a
    invoke-virtual {v2, v5}, Lm/b/j/j3;->b(Ljava/lang/String;)Z

    const-string v4, "label"

    .line 279
    invoke-virtual {v2, v4}, Lm/b/j/j3;->b(Ljava/lang/String;)Z

    .line 280
    iget-object v4, v3, Lm/b/j/o0;->j:Lm/b/i/b;

    const-string v6, "prompt"

    invoke-virtual {v4, v6}, Lm/b/i/b;->c(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_6b

    iget-object v4, v3, Lm/b/j/o0;->j:Lm/b/i/b;

    const-string v6, "prompt"

    .line 281
    invoke-virtual {v4, v6}, Lm/b/i/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    goto :goto_14

    :cond_6b
    const-string v4, "This is a searchable index. Enter search keywords: "

    .line 282
    :goto_14
    new-instance v6, Lm/b/j/i0;

    invoke-direct {v6}, Lm/b/j/i0;-><init>()V

    invoke-virtual {v6, v4}, Lm/b/j/i0;->a(Ljava/lang/String;)Lm/b/j/i0;

    invoke-virtual {v2, v6}, Lm/b/j/b;->a(Lm/b/j/q0;)Z

    .line 283
    new-instance v4, Lm/b/i/b;

    invoke-direct {v4}, Lm/b/i/b;-><init>()V

    .line 284
    iget-object v3, v3, Lm/b/j/o0;->j:Lm/b/i/b;

    invoke-virtual {v3}, Lm/b/i/b;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_6c
    :goto_15
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_6d

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lm/b/i/a;

    .line 285
    invoke-virtual {v6}, Lm/b/i/a;->getKey()Ljava/lang/String;

    move-result-object v9

    invoke-static {}, Lm/b/j/a0;->f()[Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Lm/b/h/i;->b(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v9

    if-nez v9, :cond_6c

    .line 286
    invoke-virtual {v4, v6}, Lm/b/i/b;->a(Lm/b/i/a;)V

    goto :goto_15

    .line 287
    :cond_6d
    invoke-virtual {v4, v7, v8}, Lm/b/i/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 288
    invoke-virtual {v2, v1, v4}, Lm/b/j/j3;->a(Ljava/lang/String;Lm/b/i/b;)Z

    const-string v1, "label"

    .line 289
    invoke-virtual {v2, v1}, Lm/b/j/j3;->a(Ljava/lang/String;)Z

    .line 290
    invoke-virtual {v2, v5}, Lm/b/j/j3;->b(Ljava/lang/String;)Z

    .line 291
    invoke-virtual {v2, v11}, Lm/b/j/j3;->a(Ljava/lang/String;)Z

    goto/16 :goto_0

    :cond_6e
    const-string v1, "textarea"

    .line 292
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6f

    .line 293
    invoke-virtual {v2, v3}, Lm/b/j/b;->a(Lm/b/j/n0;)Lm/b/i/l;

    .line 294
    iget-object v1, v2, Lm/b/j/j3;->b:Lm/b/j/s0;

    sget-object v3, Lm/b/j/i3;->d:Lm/b/j/i3;

    invoke-virtual {v1, v3}, Lm/b/j/s0;->d(Lm/b/j/i3;)V

    .line 295
    invoke-virtual/range {p2 .. p2}, Lm/b/j/b;->t()V

    .line 296
    invoke-virtual {v2, v6}, Lm/b/j/b;->a(Z)V

    .line 297
    sget-object v1, Lm/b/j/b0;->i:Lm/b/j/b0;

    invoke-virtual {v2, v1}, Lm/b/j/b;->b(Lm/b/j/b0;)V

    goto/16 :goto_0

    :cond_6f
    const-string v1, "xmp"

    .line 298
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_71

    .line 299
    invoke-virtual {v2, v14}, Lm/b/j/b;->f(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_70

    .line 300
    invoke-virtual {v2, v14}, Lm/b/j/j3;->a(Ljava/lang/String;)Z

    .line 301
    :cond_70
    invoke-virtual/range {p2 .. p2}, Lm/b/j/b;->x()V

    .line 302
    invoke-virtual {v2, v6}, Lm/b/j/b;->a(Z)V

    .line 303
    invoke-static {v3, v2}, Lm/b/j/b0;->b(Lm/b/j/n0;Lm/b/j/b;)V

    goto/16 :goto_0

    :cond_71
    const-string v1, "iframe"

    .line 304
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_72

    .line 305
    invoke-virtual {v2, v6}, Lm/b/j/b;->a(Z)V

    .line 306
    invoke-static {v3, v2}, Lm/b/j/b0;->b(Lm/b/j/n0;Lm/b/j/b;)V

    goto/16 :goto_0

    :cond_72
    const-string v1, "noembed"

    .line 307
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_73

    .line 308
    invoke-static {v3, v2}, Lm/b/j/b0;->b(Lm/b/j/n0;Lm/b/j/b;)V

    goto/16 :goto_0

    :cond_73
    const-string v1, "select"

    .line 309
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_76

    .line 310
    invoke-virtual/range {p2 .. p2}, Lm/b/j/b;->x()V

    .line 311
    invoke-virtual {v2, v3}, Lm/b/j/b;->a(Lm/b/j/n0;)Lm/b/i/l;

    .line 312
    invoke-virtual {v2, v6}, Lm/b/j/b;->a(Z)V

    .line 313
    invoke-virtual/range {p2 .. p2}, Lm/b/j/b;->A()Lm/b/j/b0;

    move-result-object v1

    .line 314
    sget-object v3, Lm/b/j/b0;->j:Lm/b/j/b0;

    invoke-virtual {v1, v3}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_75

    sget-object v3, Lm/b/j/b0;->l:Lm/b/j/b0;

    invoke-virtual {v1, v3}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_75

    sget-object v3, Lm/b/j/b0;->n:Lm/b/j/b0;

    invoke-virtual {v1, v3}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_75

    sget-object v3, Lm/b/j/b0;->o:Lm/b/j/b0;

    invoke-virtual {v1, v3}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_75

    sget-object v3, Lm/b/j/b0;->p:Lm/b/j/b0;

    invoke-virtual {v1, v3}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_74

    goto :goto_16

    .line 315
    :cond_74
    sget-object v1, Lm/b/j/b0;->q:Lm/b/j/b0;

    invoke-virtual {v2, v1}, Lm/b/j/b;->b(Lm/b/j/b0;)V

    goto/16 :goto_0

    .line 316
    :cond_75
    :goto_16
    sget-object v1, Lm/b/j/b0;->r:Lm/b/j/b0;

    invoke-virtual {v2, v1}, Lm/b/j/b;->b(Lm/b/j/b0;)V

    goto/16 :goto_0

    .line 317
    :cond_76
    invoke-static {}, Lm/b/j/a0;->g()[Ljava/lang/String;

    move-result-object v1

    invoke-static {v4, v1}, Lm/b/h/i;->b(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_78

    .line 318
    invoke-virtual/range {p2 .. p2}, Lm/b/j/j3;->a()Lm/b/i/l;

    move-result-object v1

    invoke-virtual {v1}, Lm/b/i/l;->i()Ljava/lang/String;

    move-result-object v1

    const-string v4, "option"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_77

    const-string v1, "option"

    .line 319
    invoke-virtual {v2, v1}, Lm/b/j/j3;->a(Ljava/lang/String;)Z

    .line 320
    :cond_77
    invoke-virtual/range {p2 .. p2}, Lm/b/j/b;->x()V

    .line 321
    invoke-virtual {v2, v3}, Lm/b/j/b;->a(Lm/b/j/n0;)Lm/b/i/l;

    goto/16 :goto_0

    .line 322
    :cond_78
    invoke-static {}, Lm/b/j/a0;->h()[Ljava/lang/String;

    move-result-object v1

    invoke-static {v4, v1}, Lm/b/h/i;->b(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_7a

    const-string v1, "ruby"

    .line 323
    invoke-virtual {v2, v1}, Lm/b/j/b;->h(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 324
    invoke-virtual/range {p2 .. p2}, Lm/b/j/b;->i()V

    .line 325
    invoke-virtual/range {p2 .. p2}, Lm/b/j/j3;->a()Lm/b/i/l;

    move-result-object v4

    invoke-virtual {v4}, Lm/b/i/l;->i()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_79

    .line 326
    invoke-virtual {v2, v0}, Lm/b/j/b;->a(Lm/b/j/b0;)V

    .line 327
    invoke-virtual {v2, v1}, Lm/b/j/b;->l(Ljava/lang/String;)V

    .line 328
    :cond_79
    invoke-virtual {v2, v3}, Lm/b/j/b;->a(Lm/b/j/n0;)Lm/b/i/l;

    goto/16 :goto_0

    :cond_7a
    const-string v1, "math"

    .line 329
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7b

    .line 330
    invoke-virtual/range {p2 .. p2}, Lm/b/j/b;->x()V

    .line 331
    invoke-virtual {v2, v3}, Lm/b/j/b;->a(Lm/b/j/n0;)Lm/b/i/l;

    .line 332
    iget-object v1, v2, Lm/b/j/j3;->b:Lm/b/j/s0;

    invoke-virtual {v1}, Lm/b/j/s0;->a()V

    goto/16 :goto_0

    :cond_7b
    const-string v1, "svg"

    .line 333
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7c

    .line 334
    invoke-virtual/range {p2 .. p2}, Lm/b/j/b;->x()V

    .line 335
    invoke-virtual {v2, v3}, Lm/b/j/b;->a(Lm/b/j/n0;)Lm/b/i/l;

    .line 336
    iget-object v1, v2, Lm/b/j/j3;->b:Lm/b/j/s0;

    invoke-virtual {v1}, Lm/b/j/s0;->a()V

    goto/16 :goto_0

    .line 337
    :cond_7c
    invoke-static {}, Lm/b/j/a0;->i()[Ljava/lang/String;

    move-result-object v1

    invoke-static {v4, v1}, Lm/b/h/i;->b(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_7d

    .line 338
    invoke-virtual {v2, v0}, Lm/b/j/b;->a(Lm/b/j/b0;)V

    return v6

    .line 339
    :cond_7d
    invoke-virtual/range {p2 .. p2}, Lm/b/j/b;->x()V

    .line 340
    invoke-virtual {v2, v3}, Lm/b/j/b;->a(Lm/b/j/n0;)Lm/b/i/l;

    goto/16 :goto_0

    .line 341
    :cond_7e
    invoke-virtual {v2, v0}, Lm/b/j/b;->a(Lm/b/j/b0;)V

    return v6

    .line 342
    :cond_7f
    invoke-virtual/range {p1 .. p1}, Lm/b/j/q0;->b()Lm/b/j/j0;

    move-result-object v1

    invoke-virtual {v2, v1}, Lm/b/j/b;->a(Lm/b/j/j0;)V

    goto/16 :goto_0

    :goto_17
    return v1
.end method

.method public b(Lm/b/j/q0;Lm/b/j/b;)Z
    .locals 5

    .line 1
    invoke-virtual {p1}, Lm/b/j/q0;->d()Lm/b/j/m0;

    move-result-object p1

    invoke-virtual {p1}, Lm/b/j/o0;->t()Ljava/lang/String;

    move-result-object p1

    .line 2
    invoke-virtual {p2}, Lm/b/j/b;->o()Ljava/util/ArrayList;

    move-result-object v0

    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    :goto_0
    if-ltz v1, :cond_3

    .line 4
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lm/b/i/l;

    .line 5
    invoke-virtual {v3}, Lm/b/i/l;->i()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 6
    invoke-virtual {p2, p1}, Lm/b/j/b;->c(Ljava/lang/String;)V

    .line 7
    invoke-virtual {p2}, Lm/b/j/j3;->a()Lm/b/i/l;

    move-result-object v0

    invoke-virtual {v0}, Lm/b/i/l;->i()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 8
    invoke-virtual {p2, p0}, Lm/b/j/b;->a(Lm/b/j/b0;)V

    .line 9
    :cond_0
    invoke-virtual {p2, p1}, Lm/b/j/b;->m(Ljava/lang/String;)V

    goto :goto_1

    .line 10
    :cond_1
    invoke-virtual {p2, v3}, Lm/b/j/b;->d(Lm/b/i/l;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 11
    invoke-virtual {p2, p0}, Lm/b/j/b;->a(Lm/b/j/b0;)V

    const/4 p1, 0x0

    return p1

    :cond_2
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_3
    :goto_1
    return v2
.end method
