.class public Lc/l/d/r;
.super Lc/l/d/i3;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lc/l/d/i3;-><init>(Landroid/view/ViewGroup;)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;Ljava/util/List;ZLc/l/d/h3;Lc/l/d/h3;)Ljava/util/Map;
    .locals 31
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lc/l/d/q;",
            ">;",
            "Ljava/util/List<",
            "Lc/l/d/h3;",
            ">;Z",
            "Lc/l/d/h3;",
            "Lc/l/d/h3;",
            ")",
            "Ljava/util/Map<",
            "Lc/l/d/h3;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    move-object/from16 v6, p0

    move/from16 v7, p3

    move-object/from16 v8, p4

    move-object/from16 v9, p5

    .line 72
    new-instance v10, Ljava/util/HashMap;

    invoke-direct {v10}, Ljava/util/HashMap;-><init>()V

    .line 73
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v15, 0x0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/l/d/q;

    .line 74
    invoke-virtual {v1}, Lc/l/d/p;->d()Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    .line 75
    :cond_1
    invoke-virtual {v1}, Lc/l/d/q;->e()Lc/l/d/x2;

    move-result-object v2

    if-nez v15, :cond_2

    move-object v15, v2

    goto :goto_0

    :cond_2
    if-eqz v2, :cond_0

    if-ne v15, v2, :cond_3

    goto :goto_0

    .line 76
    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Mixing framework transitions and AndroidX transitions is not allowed. Fragment "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    invoke-virtual {v1}, Lc/l/d/p;->b()Lc/l/d/h3;

    move-result-object v3

    invoke-virtual {v3}, Lc/l/d/h3;->d()Landroidx/fragment/app/Fragment;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " returned Transition "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    invoke-virtual {v1}, Lc/l/d/q;->g()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " which uses a different Transition  type than other Fragments."

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    const/4 v14, 0x0

    if-nez v15, :cond_6

    .line 79
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/l/d/q;

    .line 80
    invoke-virtual {v1}, Lc/l/d/p;->b()Lc/l/d/h3;

    move-result-object v2

    invoke-static {v14}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-interface {v10, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    invoke-virtual {v1}, Lc/l/d/p;->a()V

    goto :goto_1

    :cond_5
    return-object v10

    .line 82
    :cond_6
    new-instance v13, Landroid/view/View;

    invoke-virtual/range {p0 .. p0}, Lc/l/d/i3;->d()Landroid/view/ViewGroup;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v13, v0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 83
    new-instance v12, Landroid/graphics/Rect;

    invoke-direct {v12}, Landroid/graphics/Rect;-><init>()V

    .line 84
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 85
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 86
    new-instance v3, Lc/e/b;

    invoke-direct {v3}, Lc/e/b;-><init>()V

    .line 87
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v20

    const/4 v0, 0x0

    const/4 v2, 0x0

    const/16 v21, 0x0

    :goto_2
    invoke-interface/range {v20 .. v20}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_17

    invoke-interface/range {v20 .. v20}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/l/d/q;

    .line 88
    invoke-virtual {v1}, Lc/l/d/q;->h()Z

    move-result v16

    if-eqz v16, :cond_16

    if-eqz v8, :cond_16

    if-eqz v9, :cond_16

    .line 89
    invoke-virtual {v1}, Lc/l/d/q;->f()Ljava/lang/Object;

    move-result-object v0

    .line 90
    invoke-virtual {v15, v0}, Lc/l/d/x2;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 91
    invoke-virtual {v15, v0}, Lc/l/d/x2;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 92
    invoke-virtual/range {p5 .. p5}, Lc/l/d/h3;->d()Landroidx/fragment/app/Fragment;

    move-result-object v0

    .line 93
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->J()Ljava/util/ArrayList;

    move-result-object v0

    .line 94
    invoke-virtual/range {p4 .. p4}, Lc/l/d/h3;->d()Landroidx/fragment/app/Fragment;

    move-result-object v16

    .line 95
    invoke-virtual/range {v16 .. v16}, Landroidx/fragment/app/Fragment;->J()Ljava/util/ArrayList;

    move-result-object v14

    .line 96
    invoke-virtual/range {p4 .. p4}, Lc/l/d/h3;->d()Landroidx/fragment/app/Fragment;

    move-result-object v16

    .line 97
    invoke-virtual/range {v16 .. v16}, Landroidx/fragment/app/Fragment;->K()Ljava/util/ArrayList;

    move-result-object v11

    move-object/from16 v16, v1

    move-object/from16 v18, v2

    const/4 v1, 0x0

    .line 98
    :goto_3
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_8

    .line 99
    invoke-virtual {v11, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v2

    move-object/from16 v19, v11

    const/4 v11, -0x1

    if-eq v2, v11, :cond_7

    .line 100
    invoke-virtual {v14, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    invoke-virtual {v0, v2, v11}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_7
    add-int/lit8 v1, v1, 0x1

    move-object/from16 v11, v19

    goto :goto_3

    .line 101
    :cond_8
    invoke-virtual/range {p5 .. p5}, Lc/l/d/h3;->d()Landroidx/fragment/app/Fragment;

    move-result-object v1

    .line 102
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->K()Ljava/util/ArrayList;

    move-result-object v11

    if-nez v7, :cond_9

    .line 103
    invoke-virtual/range {p4 .. p4}, Lc/l/d/h3;->d()Landroidx/fragment/app/Fragment;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->s()Lc/h/e/i0;

    move-result-object v1

    .line 104
    invoke-virtual/range {p5 .. p5}, Lc/l/d/h3;->d()Landroidx/fragment/app/Fragment;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->p()Lc/h/e/i0;

    move-result-object v2

    goto :goto_4

    .line 105
    :cond_9
    invoke-virtual/range {p4 .. p4}, Lc/l/d/h3;->d()Landroidx/fragment/app/Fragment;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->p()Lc/h/e/i0;

    move-result-object v1

    .line 106
    invoke-virtual/range {p5 .. p5}, Lc/l/d/h3;->d()Landroidx/fragment/app/Fragment;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->s()Lc/h/e/i0;

    move-result-object v2

    .line 107
    :goto_4
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v14

    const/4 v9, 0x0

    :goto_5
    if-ge v9, v14, :cond_a

    .line 108
    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v19

    move/from16 v22, v14

    move-object/from16 v14, v19

    check-cast v14, Ljava/lang/String;

    .line 109
    invoke-virtual {v11, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v19

    move-object/from16 v8, v19

    check-cast v8, Ljava/lang/String;

    .line 110
    invoke-virtual {v3, v14, v8}, Lc/e/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v9, v9, 0x1

    move-object/from16 v8, p4

    move/from16 v14, v22

    goto :goto_5

    .line 111
    :cond_a
    new-instance v8, Lc/e/b;

    invoke-direct {v8}, Lc/e/b;-><init>()V

    .line 112
    invoke-virtual/range {p4 .. p4}, Lc/l/d/h3;->d()Landroidx/fragment/app/Fragment;

    move-result-object v9

    iget-object v9, v9, Landroidx/fragment/app/Fragment;->I:Landroid/view/View;

    invoke-virtual {v6, v8, v9}, Lc/l/d/r;->a(Ljava/util/Map;Landroid/view/View;)V

    .line 113
    invoke-virtual {v8, v0}, Lc/e/b;->a(Ljava/util/Collection;)Z

    if-eqz v1, :cond_e

    .line 114
    invoke-virtual {v1, v0, v8}, Lc/h/e/i0;->a(Ljava/util/List;Ljava/util/Map;)V

    .line 115
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v9, 0x1

    sub-int/2addr v1, v9

    :goto_6
    if-ltz v1, :cond_d

    .line 116
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    .line 117
    invoke-virtual {v8, v9}, Lc/e/i;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Landroid/view/View;

    if-nez v14, :cond_b

    .line 118
    invoke-virtual {v3, v9}, Lc/e/i;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v19, v0

    goto :goto_7

    :cond_b
    move-object/from16 v19, v0

    .line 119
    invoke-static {v14}, Lc/h/n/v0;->v(Landroid/view/View;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    .line 120
    invoke-virtual {v3, v9}, Lc/e/i;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 121
    invoke-static {v14}, Lc/h/n/v0;->v(Landroid/view/View;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v3, v9, v0}, Lc/e/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_c
    :goto_7
    add-int/lit8 v1, v1, -0x1

    move-object/from16 v0, v19

    goto :goto_6

    :cond_d
    move-object/from16 v19, v0

    goto :goto_8

    :cond_e
    move-object/from16 v19, v0

    .line 122
    invoke-virtual {v8}, Lc/e/b;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-virtual {v3, v0}, Lc/e/b;->a(Ljava/util/Collection;)Z

    .line 123
    :goto_8
    new-instance v9, Lc/e/b;

    invoke-direct {v9}, Lc/e/b;-><init>()V

    .line 124
    invoke-virtual/range {p5 .. p5}, Lc/l/d/h3;->d()Landroidx/fragment/app/Fragment;

    move-result-object v0

    iget-object v0, v0, Landroidx/fragment/app/Fragment;->I:Landroid/view/View;

    invoke-virtual {v6, v9, v0}, Lc/l/d/r;->a(Ljava/util/Map;Landroid/view/View;)V

    .line 125
    invoke-virtual {v9, v11}, Lc/e/b;->a(Ljava/util/Collection;)Z

    .line 126
    invoke-virtual {v3}, Lc/e/b;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-virtual {v9, v0}, Lc/e/b;->a(Ljava/util/Collection;)Z

    if-eqz v2, :cond_11

    .line 127
    invoke-virtual {v2, v11, v9}, Lc/h/e/i0;->a(Ljava/util/List;Ljava/util/Map;)V

    .line 128
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    :goto_9
    if-ltz v0, :cond_12

    .line 129
    invoke-virtual {v11, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 130
    invoke-virtual {v9, v1}, Lc/e/i;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    if-nez v2, :cond_f

    .line 131
    invoke-static {v3, v1}, Lc/l/d/n2;->a(Lc/e/b;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_10

    .line 132
    invoke-virtual {v3, v1}, Lc/e/i;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_a

    .line 133
    :cond_f
    invoke-static {v2}, Lc/h/n/v0;->v(Landroid/view/View;)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v1, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_10

    .line 134
    invoke-static {v3, v1}, Lc/l/d/n2;->a(Lc/e/b;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_10

    .line 135
    invoke-static {v2}, Lc/h/n/v0;->v(Landroid/view/View;)Ljava/lang/String;

    move-result-object v2

    .line 136
    invoke-virtual {v3, v1, v2}, Lc/e/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_10
    :goto_a
    add-int/lit8 v0, v0, -0x1

    goto :goto_9

    .line 137
    :cond_11
    invoke-static {v3, v9}, Lc/l/d/n2;->a(Lc/e/b;Lc/e/b;)V

    .line 138
    :cond_12
    invoke-virtual {v3}, Lc/e/b;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-virtual {v6, v8, v0}, Lc/l/d/r;->a(Lc/e/b;Ljava/util/Collection;)V

    .line 139
    invoke-virtual {v3}, Lc/e/b;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-virtual {v6, v9, v0}, Lc/l/d/r;->a(Lc/e/b;Ljava/util/Collection;)V

    .line 140
    invoke-virtual {v3}, Lc/e/i;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_13

    .line 141
    invoke-virtual {v5}, Ljava/util/ArrayList;->clear()V

    .line 142
    invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V

    move-object/from16 v24, v3

    move-object v9, v4

    move-object v4, v12

    move-object v8, v13

    move-object v11, v15

    move-object/from16 v2, v18

    const/4 v0, 0x0

    const/4 v1, 0x0

    move-object/from16 v3, p5

    move-object v15, v10

    move-object/from16 v10, p4

    move-object/from16 v30, v6

    move-object v6, v5

    move-object/from16 v5, v30

    goto/16 :goto_d

    .line 143
    :cond_13
    invoke-virtual/range {p5 .. p5}, Lc/l/d/h3;->d()Landroidx/fragment/app/Fragment;

    move-result-object v0

    invoke-virtual/range {p4 .. p4}, Lc/l/d/h3;->d()Landroidx/fragment/app/Fragment;

    move-result-object v1

    const/4 v2, 0x1

    .line 144
    invoke-static {v0, v1, v7, v8, v2}, Lc/l/d/n2;->a(Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;ZLc/e/b;Z)V

    .line 145
    invoke-virtual/range {p0 .. p0}, Lc/l/d/i3;->d()Landroid/view/ViewGroup;

    move-result-object v14

    new-instance v2, Lc/l/d/k;

    move-object/from16 v1, v19

    move-object v0, v2

    move-object/from16 v7, v16

    move-object/from16 v1, p0

    move-object/from16 v22, v10

    move-object/from16 v23, v18

    move-object v10, v2

    move-object/from16 v2, p5

    move-object/from16 v24, v3

    move-object/from16 v3, p4

    move-object/from16 v16, v13

    move-object v13, v4

    move/from16 v4, p3

    move-object v6, v5

    move-object v5, v9

    invoke-direct/range {v0 .. v5}, Lc/l/d/k;-><init>(Lc/l/d/r;Lc/l/d/h3;Lc/l/d/h3;ZLc/e/b;)V

    invoke-static {v14, v10}, Lc/h/n/y;->a(Landroid/view/View;Ljava/lang/Runnable;)Lc/h/n/y;

    .line 146
    invoke-virtual {v8}, Lc/e/b;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 147
    invoke-virtual/range {v19 .. v19}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_14

    move-object/from16 v0, v19

    const/4 v1, 0x0

    .line 148
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 149
    invoke-virtual {v8, v0}, Lc/e/i;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 150
    invoke-virtual {v15, v7, v0}, Lc/l/d/x2;->c(Ljava/lang/Object;Landroid/view/View;)V

    move-object v2, v0

    goto :goto_b

    :cond_14
    const/4 v1, 0x0

    move-object/from16 v2, v23

    .line 151
    :goto_b
    invoke-virtual {v9}, Lc/e/b;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-virtual {v13, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 152
    invoke-virtual {v11}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_15

    .line 153
    invoke-virtual {v11, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 154
    invoke-virtual {v9, v0}, Lc/e/i;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-eqz v0, :cond_15

    .line 155
    invoke-virtual/range {p0 .. p0}, Lc/l/d/i3;->d()Landroid/view/ViewGroup;

    move-result-object v3

    new-instance v4, Lc/l/d/l;

    move-object/from16 v5, p0

    invoke-direct {v4, v5, v15, v0, v12}, Lc/l/d/l;-><init>(Lc/l/d/r;Lc/l/d/x2;Landroid/view/View;Landroid/graphics/Rect;)V

    invoke-static {v3, v4}, Lc/h/n/y;->a(Landroid/view/View;Ljava/lang/Runnable;)Lc/h/n/y;

    move-object/from16 v0, v16

    const/16 v21, 0x1

    goto :goto_c

    :cond_15
    move-object/from16 v5, p0

    move-object/from16 v0, v16

    .line 156
    :goto_c
    invoke-virtual {v15, v7, v0, v6}, Lc/l/d/x2;->b(Ljava/lang/Object;Landroid/view/View;Ljava/util/ArrayList;)V

    const/4 v14, 0x0

    const/4 v3, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object v4, v12

    move-object v12, v15

    move-object v8, v0

    move-object v9, v13

    move-object v13, v7

    move-object v11, v15

    move-object v15, v3

    move-object/from16 v18, v7

    move-object/from16 v19, v9

    .line 157
    invoke-virtual/range {v12 .. v19}, Lc/l/d/x2;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;)V

    const/4 v0, 0x1

    .line 158
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    move-object/from16 v10, p4

    move-object/from16 v15, v22

    invoke-interface {v15, v10, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 159
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    move-object/from16 v3, p5

    invoke-interface {v15, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v0, v7

    goto :goto_d

    :cond_16
    move-object/from16 v23, v2

    move-object/from16 v24, v3

    move-object v3, v9

    move-object v11, v15

    const/4 v1, 0x0

    move-object v9, v4

    move-object v15, v10

    move-object v4, v12

    move-object v10, v8

    move-object v8, v13

    move-object/from16 v30, v6

    move-object v6, v5

    move-object/from16 v5, v30

    move-object/from16 v2, v23

    :goto_d
    move/from16 v7, p3

    move-object v12, v4

    move-object v13, v8

    move-object v4, v9

    move-object v8, v10

    move-object v10, v15

    const/4 v14, 0x0

    move-object v9, v3

    move-object v15, v11

    move-object/from16 v3, v24

    move-object/from16 v30, v6

    move-object v6, v5

    move-object/from16 v5, v30

    goto/16 :goto_2

    :cond_17
    move-object/from16 v23, v2

    move-object/from16 v24, v3

    move-object v3, v9

    move-object v11, v15

    const/4 v1, 0x0

    move-object v9, v4

    move-object v15, v10

    move-object v4, v12

    move-object v10, v8

    move-object v8, v13

    move-object/from16 v30, v6

    move-object v6, v5

    move-object/from16 v5, v30

    .line 160
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 161
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    const/4 v13, 0x0

    const/4 v14, 0x0

    :goto_e
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_24

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    move-object/from16 v20, v12

    check-cast v20, Lc/l/d/q;

    .line 162
    invoke-virtual/range {v20 .. v20}, Lc/l/d/p;->d()Z

    move-result v12

    if-eqz v12, :cond_18

    .line 163
    invoke-virtual/range {v20 .. v20}, Lc/l/d/p;->b()Lc/l/d/h3;

    move-result-object v12

    move-object/from16 p3, v7

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    invoke-interface {v15, v12, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    invoke-virtual/range {v20 .. v20}, Lc/l/d/p;->a()V

    :goto_f
    move-object/from16 v7, p3

    goto :goto_e

    :cond_18
    move-object/from16 p3, v7

    .line 165
    invoke-virtual/range {v20 .. v20}, Lc/l/d/q;->g()Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v11, v7}, Lc/l/d/x2;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    .line 166
    invoke-virtual/range {v20 .. v20}, Lc/l/d/p;->b()Lc/l/d/h3;

    move-result-object v12

    if-eqz v0, :cond_1a

    if-eq v12, v10, :cond_19

    if-ne v12, v3, :cond_1a

    :cond_19
    const/16 v16, 0x1

    goto :goto_10

    :cond_1a
    const/16 v16, 0x0

    :goto_10
    if-nez v7, :cond_1c

    if-nez v16, :cond_1b

    .line 167
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    invoke-interface {v15, v12, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 168
    invoke-virtual/range {v20 .. v20}, Lc/l/d/p;->a()V

    :cond_1b
    move-object/from16 v12, p2

    move-object/from16 v28, v6

    move-object/from16 v26, v8

    move-object/from16 v29, v9

    move-object v7, v13

    move-object v6, v14

    move-object v9, v15

    move-object/from16 v1, v23

    const/4 v13, 0x0

    const/4 v14, 0x1

    goto/16 :goto_14

    .line 169
    :cond_1c
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v17, v13

    .line 170
    invoke-virtual {v12}, Lc/l/d/h3;->d()Landroidx/fragment/app/Fragment;

    move-result-object v13

    iget-object v13, v13, Landroidx/fragment/app/Fragment;->I:Landroid/view/View;

    .line 171
    invoke-virtual {v5, v1, v13}, Lc/l/d/r;->a(Ljava/util/ArrayList;Landroid/view/View;)V

    if-eqz v16, :cond_1e

    if-ne v12, v10, :cond_1d

    .line 172
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z

    goto :goto_11

    .line 173
    :cond_1d
    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z

    .line 174
    :cond_1e
    :goto_11
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v13

    if-eqz v13, :cond_1f

    .line 175
    invoke-virtual {v11, v7, v8}, Lc/l/d/x2;->a(Ljava/lang/Object;Landroid/view/View;)V

    move-object/from16 v28, v6

    move-object/from16 v26, v8

    move-object/from16 v29, v9

    move-object v13, v12

    move-object v6, v14

    move-object v9, v15

    move-object/from16 v8, v17

    move-object/from16 v12, p2

    goto :goto_12

    .line 176
    :cond_1f
    invoke-virtual {v11, v7, v1}, Lc/l/d/x2;->a(Ljava/lang/Object;Ljava/util/ArrayList;)V

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v25, 0x0

    move-object v13, v12

    move-object v12, v11

    move-object/from16 v26, v8

    move-object/from16 v27, v13

    move-object/from16 v8, v17

    move-object v13, v7

    move-object/from16 v28, v6

    move-object v6, v14

    move-object v14, v7

    move-object/from16 v29, v9

    move-object v9, v15

    move-object v15, v1

    move-object/from16 v17, v18

    move-object/from16 v18, v19

    move-object/from16 v19, v25

    .line 177
    invoke-virtual/range {v12 .. v19}, Lc/l/d/x2;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;)V

    .line 178
    invoke-virtual/range {v27 .. v27}, Lc/l/d/h3;->c()Lc/l/d/g3;

    move-result-object v12

    sget-object v13, Lc/l/d/g3;->d:Lc/l/d/g3;

    if-ne v12, v13, :cond_20

    move-object/from16 v12, p2

    move-object/from16 v13, v27

    .line 179
    invoke-interface {v12, v13}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 180
    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 181
    invoke-virtual {v13}, Lc/l/d/h3;->d()Landroidx/fragment/app/Fragment;

    move-result-object v15

    iget-object v15, v15, Landroidx/fragment/app/Fragment;->I:Landroid/view/View;

    invoke-virtual {v14, v15}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 182
    invoke-virtual {v13}, Lc/l/d/h3;->d()Landroidx/fragment/app/Fragment;

    move-result-object v15

    iget-object v15, v15, Landroidx/fragment/app/Fragment;->I:Landroid/view/View;

    .line 183
    invoke-virtual {v11, v7, v15, v14}, Lc/l/d/x2;->a(Ljava/lang/Object;Landroid/view/View;Ljava/util/ArrayList;)V

    .line 184
    invoke-virtual/range {p0 .. p0}, Lc/l/d/i3;->d()Landroid/view/ViewGroup;

    move-result-object v14

    new-instance v15, Lc/l/d/m;

    invoke-direct {v15, v5, v1}, Lc/l/d/m;-><init>(Lc/l/d/r;Ljava/util/ArrayList;)V

    invoke-static {v14, v15}, Lc/h/n/y;->a(Landroid/view/View;Ljava/lang/Runnable;)Lc/h/n/y;

    goto :goto_12

    :cond_20
    move-object/from16 v12, p2

    move-object/from16 v13, v27

    .line 185
    :goto_12
    invoke-virtual {v13}, Lc/l/d/h3;->c()Lc/l/d/g3;

    move-result-object v14

    sget-object v15, Lc/l/d/g3;->c:Lc/l/d/g3;

    if-ne v14, v15, :cond_22

    .line 186
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    if-eqz v21, :cond_21

    .line 187
    invoke-virtual {v11, v7, v4}, Lc/l/d/x2;->a(Ljava/lang/Object;Landroid/graphics/Rect;)V

    :cond_21
    move-object/from16 v1, v23

    goto :goto_13

    :cond_22
    move-object/from16 v1, v23

    .line 188
    invoke-virtual {v11, v7, v1}, Lc/l/d/x2;->c(Ljava/lang/Object;Landroid/view/View;)V

    :goto_13
    const/4 v14, 0x1

    .line 189
    invoke-static {v14}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v15

    invoke-interface {v9, v13, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 190
    invoke-virtual/range {v20 .. v20}, Lc/l/d/q;->i()Z

    move-result v13

    if-eqz v13, :cond_23

    const/4 v13, 0x0

    .line 191
    invoke-virtual {v11, v6, v7, v13}, Lc/l/d/x2;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    move-object v7, v8

    goto :goto_14

    :cond_23
    const/4 v13, 0x0

    .line 192
    invoke-virtual {v11, v8, v7, v13}, Lc/l/d/x2;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    :goto_14
    move-object/from16 v23, v1

    move-object v14, v6

    move-object v13, v7

    move-object v15, v9

    move-object/from16 v8, v26

    move-object/from16 v6, v28

    move-object/from16 v9, v29

    const/4 v1, 0x0

    goto/16 :goto_f

    :cond_24
    move-object/from16 v28, v6

    move-object/from16 v29, v9

    move-object v8, v13

    move-object v6, v14

    move-object v9, v15

    const/4 v14, 0x1

    .line 193
    invoke-virtual {v11, v6, v8, v0}, Lc/l/d/x2;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 194
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_25
    :goto_15
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2c

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lc/l/d/q;

    .line 195
    invoke-virtual {v6}, Lc/l/d/p;->d()Z

    move-result v7

    if-eqz v7, :cond_26

    goto :goto_15

    .line 196
    :cond_26
    invoke-virtual {v6}, Lc/l/d/q;->g()Ljava/lang/Object;

    move-result-object v7

    .line 197
    invoke-virtual {v6}, Lc/l/d/p;->b()Lc/l/d/h3;

    move-result-object v8

    if-eqz v0, :cond_28

    if-eq v8, v10, :cond_27

    if-ne v8, v3, :cond_28

    :cond_27
    const/4 v12, 0x1

    goto :goto_16

    :cond_28
    const/4 v12, 0x0

    :goto_16
    if-nez v7, :cond_29

    if-eqz v12, :cond_25

    .line 198
    :cond_29
    invoke-virtual/range {p0 .. p0}, Lc/l/d/i3;->d()Landroid/view/ViewGroup;

    move-result-object v7

    invoke-static {v7}, Lc/h/n/v0;->D(Landroid/view/View;)Z

    move-result v7

    if-nez v7, :cond_2b

    const/4 v7, 0x2

    .line 199
    invoke-static {v7}, Lc/l/d/o1;->d(I)Z

    move-result v7

    if-eqz v7, :cond_2a

    .line 200
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "SpecialEffectsController: Container "

    invoke-virtual {v7, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 201
    invoke-virtual/range {p0 .. p0}, Lc/l/d/i3;->d()Landroid/view/ViewGroup;

    move-result-object v12

    invoke-virtual {v7, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v12, " has not been laid out. Completing operation "

    invoke-virtual {v7, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    const-string v8, "FragmentManager"

    .line 202
    invoke-static {v8, v7}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 203
    :cond_2a
    invoke-virtual {v6}, Lc/l/d/p;->a()V

    goto :goto_15

    .line 204
    :cond_2b
    invoke-virtual {v6}, Lc/l/d/p;->b()Lc/l/d/h3;

    move-result-object v7

    invoke-virtual {v7}, Lc/l/d/h3;->d()Landroidx/fragment/app/Fragment;

    move-result-object v7

    .line 205
    invoke-virtual {v6}, Lc/l/d/p;->c()Lc/h/j/c;

    move-result-object v8

    new-instance v12, Lc/l/d/n;

    invoke-direct {v12, v5, v6}, Lc/l/d/n;-><init>(Lc/l/d/r;Lc/l/d/q;)V

    .line 206
    invoke-virtual {v11, v7, v1, v8, v12}, Lc/l/d/x2;->a(Landroidx/fragment/app/Fragment;Ljava/lang/Object;Lc/h/j/c;Ljava/lang/Runnable;)V

    goto :goto_15

    .line 207
    :cond_2c
    invoke-virtual/range {p0 .. p0}, Lc/l/d/i3;->d()Landroid/view/ViewGroup;

    move-result-object v3

    invoke-static {v3}, Lc/h/n/v0;->D(Landroid/view/View;)Z

    move-result v3

    if-nez v3, :cond_2d

    return-object v9

    :cond_2d
    const/4 v3, 0x4

    .line 208
    invoke-static {v2, v3}, Lc/l/d/n2;->a(Ljava/util/ArrayList;I)V

    move-object/from16 v3, v29

    .line 209
    invoke-virtual {v11, v3}, Lc/l/d/x2;->a(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    move-result-object v16

    .line 210
    invoke-virtual/range {p0 .. p0}, Lc/l/d/i3;->d()Landroid/view/ViewGroup;

    move-result-object v4

    invoke-virtual {v11, v4, v1}, Lc/l/d/x2;->a(Landroid/view/ViewGroup;Ljava/lang/Object;)V

    .line 211
    invoke-virtual/range {p0 .. p0}, Lc/l/d/i3;->d()Landroid/view/ViewGroup;

    move-result-object v13

    move-object v12, v11

    move-object/from16 v14, v28

    move-object v15, v3

    move-object/from16 v17, v24

    invoke-virtual/range {v12 .. v17}, Lc/l/d/x2;->a(Landroid/view/View;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/Map;)V

    const/4 v1, 0x0

    .line 212
    invoke-static {v2, v1}, Lc/l/d/n2;->a(Ljava/util/ArrayList;I)V

    move-object/from16 v1, v28

    .line 213
    invoke-virtual {v11, v0, v1, v3}, Lc/l/d/x2;->b(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    return-object v9
.end method

.method public a(Lc/e/b;Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/e/b<",
            "Ljava/lang/String;",
            "Landroid/view/View;",
            ">;",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 214
    invoke-virtual {p1}, Lc/e/b;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    .line 215
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 216
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 217
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-static {v0}, Lc/h/n/v0;->v(Landroid/view/View;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 218
    invoke-interface {p1}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public a(Lc/l/d/h3;)V
    .locals 1

    .line 238
    invoke-virtual {p1}, Lc/l/d/h3;->d()Landroidx/fragment/app/Fragment;

    move-result-object v0

    iget-object v0, v0, Landroidx/fragment/app/Fragment;->I:Landroid/view/View;

    .line 239
    invoke-virtual {p1}, Lc/l/d/h3;->c()Lc/l/d/g3;

    move-result-object p1

    invoke-virtual {p1, v0}, Lc/l/d/g3;->a(Landroid/view/View;)V

    return-void
.end method

.method public a(Ljava/util/ArrayList;Landroid/view/View;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Landroid/view/View;",
            ">;",
            "Landroid/view/View;",
            ")V"
        }
    .end annotation

    .line 219
    instance-of v0, p2, Landroid/view/ViewGroup;

    if-eqz v0, :cond_2

    .line 220
    move-object v0, p2

    check-cast v0, Landroid/view/ViewGroup;

    .line 221
    invoke-static {v0}, Lc/h/n/x0;->a(Landroid/view/ViewGroup;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 222
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_3

    .line 223
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 224
    :cond_0
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p2

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p2, :cond_3

    .line 225
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 226
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    move-result v3

    if-nez v3, :cond_1

    .line 227
    invoke-virtual {p0, p1, v2}, Lc/l/d/r;->a(Ljava/util/ArrayList;Landroid/view/View;)V

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 228
    :cond_2
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 229
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    :goto_1
    return-void
.end method

.method public final a(Ljava/util/List;Ljava/util/List;ZLjava/util/Map;)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lc/l/d/o;",
            ">;",
            "Ljava/util/List<",
            "Lc/l/d/h3;",
            ">;Z",
            "Ljava/util/Map<",
            "Lc/l/d/h3;",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v7, p0

    .line 25
    invoke-virtual/range {p0 .. p0}, Lc/l/d/i3;->d()Landroid/view/ViewGroup;

    move-result-object v8

    .line 26
    invoke-virtual {v8}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v9

    .line 27
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 28
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v11

    const/4 v0, 0x0

    :goto_0
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const-string v2, "FragmentManager"

    const/4 v3, 0x2

    if-eqz v1, :cond_7

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v14, v1

    check-cast v14, Lc/l/d/o;

    .line 29
    invoke-virtual {v14}, Lc/l/d/p;->d()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 30
    invoke-virtual {v14}, Lc/l/d/p;->a()V

    :goto_1
    move-object/from16 v6, p4

    goto :goto_0

    .line 31
    :cond_0
    invoke-virtual {v14, v9}, Lc/l/d/o;->a(Landroid/content/Context;)Lc/l/d/k0;

    move-result-object v1

    if-nez v1, :cond_1

    .line 32
    invoke-virtual {v14}, Lc/l/d/p;->a()V

    goto :goto_1

    .line 33
    :cond_1
    iget-object v15, v1, Lc/l/d/k0;->b:Landroid/animation/Animator;

    if-nez v15, :cond_2

    .line 34
    invoke-virtual {v10, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 35
    :cond_2
    invoke-virtual {v14}, Lc/l/d/p;->b()Lc/l/d/h3;

    move-result-object v5

    .line 36
    invoke-virtual {v5}, Lc/l/d/h3;->d()Landroidx/fragment/app/Fragment;

    move-result-object v1

    .line 37
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    move-object/from16 v6, p4

    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    invoke-virtual {v4, v12}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    .line 38
    invoke-static {v3}, Lc/l/d/o1;->d(I)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 39
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Ignoring Animator set on "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " as this Fragment was involved in a Transition."

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 40
    :cond_3
    invoke-virtual {v14}, Lc/l/d/p;->a()V

    goto :goto_0

    .line 41
    :cond_4
    invoke-virtual {v5}, Lc/l/d/h3;->c()Lc/l/d/g3;

    move-result-object v0

    sget-object v2, Lc/l/d/g3;->d:Lc/l/d/g3;

    if-ne v0, v2, :cond_5

    const/4 v4, 0x1

    goto :goto_2

    :cond_5
    const/4 v4, 0x0

    :goto_2
    move-object/from16 v12, p2

    if-eqz v4, :cond_6

    .line 42
    invoke-interface {v12, v5}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 43
    :cond_6
    iget-object v3, v1, Landroidx/fragment/app/Fragment;->I:Landroid/view/View;

    .line 44
    invoke-virtual {v8, v3}, Landroid/view/ViewGroup;->startViewTransition(Landroid/view/View;)V

    .line 45
    new-instance v2, Lc/l/d/f;

    move-object v0, v2

    move-object/from16 v1, p0

    move-object v13, v2

    move-object v2, v8

    move-object/from16 v16, v3

    move-object v6, v14

    invoke-direct/range {v0 .. v6}, Lc/l/d/f;-><init>(Lc/l/d/r;Landroid/view/ViewGroup;Landroid/view/View;ZLc/l/d/h3;Lc/l/d/o;)V

    invoke-virtual {v15, v13}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    move-object/from16 v0, v16

    .line 46
    invoke-virtual {v15, v0}, Landroid/animation/Animator;->setTarget(Ljava/lang/Object;)V

    .line 47
    invoke-virtual {v15}, Landroid/animation/Animator;->start()V

    .line 48
    invoke-virtual {v14}, Lc/l/d/p;->c()Lc/h/j/c;

    move-result-object v0

    .line 49
    new-instance v1, Lc/l/d/g;

    invoke-direct {v1, v7, v15}, Lc/l/d/g;-><init>(Lc/l/d/r;Landroid/animation/Animator;)V

    invoke-virtual {v0, v1}, Lc/h/j/c;->a(Lc/h/j/b;)V

    const/4 v0, 0x1

    goto/16 :goto_0

    .line 50
    :cond_7
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_d

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lc/l/d/o;

    .line 51
    invoke-virtual {v4}, Lc/l/d/p;->b()Lc/l/d/h3;

    move-result-object v5

    .line 52
    invoke-virtual {v5}, Lc/l/d/h3;->d()Landroidx/fragment/app/Fragment;

    move-result-object v6

    const-string v10, "Ignoring Animation set on "

    if-eqz p3, :cond_9

    .line 53
    invoke-static {v3}, Lc/l/d/o1;->d(I)Z

    move-result v5

    if-eqz v5, :cond_8

    .line 54
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v6, " as Animations cannot run alongside Transitions."

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 55
    :cond_8
    invoke-virtual {v4}, Lc/l/d/p;->a()V

    goto :goto_3

    :cond_9
    if-eqz v0, :cond_b

    .line 56
    invoke-static {v3}, Lc/l/d/o1;->d(I)Z

    move-result v5

    if-eqz v5, :cond_a

    .line 57
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v6, " as Animations cannot run alongside Animators."

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 58
    :cond_a
    invoke-virtual {v4}, Lc/l/d/p;->a()V

    goto :goto_3

    .line 59
    :cond_b
    iget-object v6, v6, Landroidx/fragment/app/Fragment;->I:Landroid/view/View;

    .line 60
    invoke-virtual {v4, v9}, Lc/l/d/o;->a(Landroid/content/Context;)Lc/l/d/k0;

    move-result-object v10

    invoke-static {v10}, Lc/h/m/g;->a(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v10, Lc/l/d/k0;

    iget-object v10, v10, Lc/l/d/k0;->a:Landroid/view/animation/Animation;

    .line 61
    invoke-static {v10}, Lc/h/m/g;->a(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v10, Landroid/view/animation/Animation;

    .line 62
    invoke-virtual {v5}, Lc/l/d/h3;->c()Lc/l/d/g3;

    move-result-object v5

    .line 63
    sget-object v11, Lc/l/d/g3;->b:Lc/l/d/g3;

    if-eq v5, v11, :cond_c

    .line 64
    invoke-virtual {v6, v10}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 65
    invoke-virtual {v4}, Lc/l/d/p;->a()V

    goto :goto_4

    .line 66
    :cond_c
    invoke-virtual {v8, v6}, Landroid/view/ViewGroup;->startViewTransition(Landroid/view/View;)V

    .line 67
    new-instance v5, Lc/l/d/l0;

    invoke-direct {v5, v10, v8, v6}, Lc/l/d/l0;-><init>(Landroid/view/animation/Animation;Landroid/view/ViewGroup;Landroid/view/View;)V

    .line 68
    new-instance v10, Lc/l/d/i;

    invoke-direct {v10, v7, v8, v6, v4}, Lc/l/d/i;-><init>(Lc/l/d/r;Landroid/view/ViewGroup;Landroid/view/View;Lc/l/d/o;)V

    invoke-virtual {v5, v10}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 69
    invoke-virtual {v6, v5}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 70
    :goto_4
    invoke-virtual {v4}, Lc/l/d/p;->c()Lc/h/j/c;

    move-result-object v5

    .line 71
    new-instance v10, Lc/l/d/j;

    invoke-direct {v10, v7, v6, v8, v4}, Lc/l/d/j;-><init>(Lc/l/d/r;Landroid/view/View;Landroid/view/ViewGroup;Lc/l/d/o;)V

    invoke-virtual {v5, v10}, Lc/h/j/c;->a(Lc/h/j/b;)V

    goto/16 :goto_3

    :cond_d
    return-void
.end method

.method public a(Ljava/util/List;Z)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lc/l/d/h3;",
            ">;Z)V"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    move-object v6, v1

    move-object v7, v6

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v8, 0x1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/l/d/h3;

    .line 2
    invoke-virtual {v1}, Lc/l/d/h3;->d()Landroidx/fragment/app/Fragment;

    move-result-object v2

    iget-object v2, v2, Landroidx/fragment/app/Fragment;->I:Landroid/view/View;

    invoke-static {v2}, Lc/l/d/g3;->b(Landroid/view/View;)Lc/l/d/g3;

    move-result-object v2

    .line 3
    sget-object v3, Lc/l/d/d;->a:[I

    invoke-virtual {v1}, Lc/l/d/h3;->c()Lc/l/d/g3;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aget v3, v3, v4

    if-eq v3, v8, :cond_2

    const/4 v4, 0x2

    if-eq v3, v4, :cond_2

    const/4 v4, 0x3

    if-eq v3, v4, :cond_2

    const/4 v4, 0x4

    if-eq v3, v4, :cond_1

    goto :goto_0

    .line 4
    :cond_1
    sget-object v3, Lc/l/d/g3;->c:Lc/l/d/g3;

    if-eq v2, v3, :cond_0

    move-object v7, v1

    goto :goto_0

    .line 5
    :cond_2
    sget-object v3, Lc/l/d/g3;->c:Lc/l/d/g3;

    if-ne v2, v3, :cond_0

    if-nez v6, :cond_0

    move-object v6, v1

    goto :goto_0

    .line 6
    :cond_3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 8
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 9
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc/l/d/h3;

    .line 10
    new-instance v4, Lc/h/j/c;

    invoke-direct {v4}, Lc/h/j/c;-><init>()V

    .line 11
    invoke-virtual {v2, v4}, Lc/l/d/h3;->b(Lc/h/j/c;)V

    .line 12
    new-instance v5, Lc/l/d/o;

    invoke-direct {v5, v2, v4, p2}, Lc/l/d/o;-><init>(Lc/l/d/h3;Lc/h/j/c;Z)V

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 13
    new-instance v4, Lc/h/j/c;

    invoke-direct {v4}, Lc/h/j/c;-><init>()V

    .line 14
    invoke-virtual {v2, v4}, Lc/l/d/h3;->b(Lc/h/j/c;)V

    .line 15
    new-instance v5, Lc/l/d/q;

    const/4 v9, 0x0

    if-eqz p2, :cond_4

    if-ne v2, v6, :cond_5

    goto :goto_2

    :cond_4
    if-ne v2, v7, :cond_5

    :goto_2
    const/4 v9, 0x1

    .line 16
    :cond_5
    invoke-direct {v5, v2, v4, p2, v9}, Lc/l/d/q;-><init>(Lc/l/d/h3;Lc/h/j/c;ZZ)V

    .line 17
    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 18
    new-instance v4, Lc/l/d/e;

    invoke-direct {v4, p0, v1, v2}, Lc/l/d/e;-><init>(Lc/l/d/r;Ljava/util/List;Lc/l/d/h3;)V

    invoke-virtual {v2, v4}, Lc/l/d/h3;->a(Ljava/lang/Runnable;)V

    goto :goto_1

    :cond_6
    move-object v2, p0

    move-object v4, v1

    move v5, p2

    .line 19
    invoke-virtual/range {v2 .. v7}, Lc/l/d/r;->a(Ljava/util/List;Ljava/util/List;ZLc/l/d/h3;Lc/l/d/h3;)Ljava/util/Map;

    move-result-object p1

    .line 20
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/util/Map;->containsValue(Ljava/lang/Object;)Z

    move-result p2

    .line 21
    invoke-virtual {p0, v0, v1, p2, p1}, Lc/l/d/r;->a(Ljava/util/List;Ljava/util/List;ZLjava/util/Map;)V

    .line 22
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lc/l/d/h3;

    .line 23
    invoke-virtual {p0, p2}, Lc/l/d/r;->a(Lc/l/d/h3;)V

    goto :goto_3

    .line 24
    :cond_7
    invoke-interface {v1}, Ljava/util/List;->clear()V

    return-void
.end method

.method public a(Ljava/util/Map;Landroid/view/View;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Landroid/view/View;",
            ">;",
            "Landroid/view/View;",
            ")V"
        }
    .end annotation

    .line 230
    invoke-static {p2}, Lc/h/n/v0;->v(Landroid/view/View;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 231
    invoke-interface {p1, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 232
    :cond_0
    instance-of v0, p2, Landroid/view/ViewGroup;

    if-eqz v0, :cond_2

    .line 233
    check-cast p2, Landroid/view/ViewGroup;

    .line 234
    invoke-virtual {p2}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    .line 235
    invoke-virtual {p2, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 236
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    move-result v3

    if-nez v3, :cond_1

    .line 237
    invoke-virtual {p0, p1, v2}, Lc/l/d/r;->a(Ljava/util/Map;Landroid/view/View;)V

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method
