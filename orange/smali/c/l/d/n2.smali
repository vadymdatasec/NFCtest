.class public abstract Lc/l/d/n2;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:[I

.field public static final b:Lc/l/d/x2;

.field public static final c:Lc/l/d/x2;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const/16 v0, 0xb

    new-array v0, v0, [I

    .line 1
    fill-array-data v0, :array_0

    sput-object v0, Lc/l/d/n2;->a:[I

    .line 2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    .line 3
    new-instance v0, Lc/l/d/t2;

    invoke-direct {v0}, Lc/l/d/t2;-><init>()V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 4
    :goto_0
    sput-object v0, Lc/l/d/n2;->b:Lc/l/d/x2;

    .line 5
    invoke-static {}, Lc/l/d/n2;->a()Lc/l/d/x2;

    move-result-object v0

    sput-object v0, Lc/l/d/n2;->c:Lc/l/d/x2;

    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x3
        0x0
        0x1
        0x5
        0x4
        0x7
        0x6
        0x9
        0x8
        0xa
    .end array-data
.end method

.method public static a(Lc/e/b;Lc/l/d/m2;Ljava/lang/Object;Z)Landroid/view/View;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/e/b<",
            "Ljava/lang/String;",
            "Landroid/view/View;",
            ">;",
            "Lc/l/d/m2;",
            "Ljava/lang/Object;",
            "Z)",
            "Landroid/view/View;"
        }
    .end annotation

    .line 140
    iget-object p1, p1, Lc/l/d/m2;->c:Lc/l/d/a;

    if-eqz p2, :cond_1

    if-eqz p0, :cond_1

    .line 141
    iget-object p2, p1, Lc/l/d/e2;->m:Ljava/util/ArrayList;

    if-eqz p2, :cond_1

    .line 142
    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_1

    const/4 p2, 0x0

    if-eqz p3, :cond_0

    .line 143
    iget-object p1, p1, Lc/l/d/e2;->m:Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    goto :goto_0

    .line 144
    :cond_0
    iget-object p1, p1, Lc/l/d/e2;->n:Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 145
    :goto_0
    invoke-virtual {p0, p1}, Lc/e/i;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/view/View;

    return-object p0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static a(ILjava/util/ArrayList;Ljava/util/ArrayList;II)Lc/e/b;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/ArrayList<",
            "Lc/l/d/a;",
            ">;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Boolean;",
            ">;II)",
            "Lc/e/b<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 18
    new-instance v0, Lc/e/b;

    invoke-direct {v0}, Lc/e/b;-><init>()V

    add-int/lit8 p4, p4, -0x1

    :goto_0
    if-lt p4, p3, :cond_4

    .line 19
    invoke-virtual {p1, p4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/l/d/a;

    .line 20
    invoke-virtual {v1, p0}, Lc/l/d/a;->b(I)Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_4

    .line 21
    :cond_0
    invoke-virtual {p2, p4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    .line 22
    iget-object v3, v1, Lc/l/d/e2;->m:Ljava/util/ArrayList;

    if-eqz v3, :cond_3

    .line 23
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-eqz v2, :cond_1

    .line 24
    iget-object v2, v1, Lc/l/d/e2;->m:Ljava/util/ArrayList;

    .line 25
    iget-object v1, v1, Lc/l/d/e2;->n:Ljava/util/ArrayList;

    goto :goto_1

    .line 26
    :cond_1
    iget-object v2, v1, Lc/l/d/e2;->m:Ljava/util/ArrayList;

    .line 27
    iget-object v1, v1, Lc/l/d/e2;->n:Ljava/util/ArrayList;

    move-object v8, v2

    move-object v2, v1

    move-object v1, v8

    :goto_1
    const/4 v4, 0x0

    :goto_2
    if-ge v4, v3, :cond_3

    .line 28
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    .line 29
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    .line 30
    invoke-virtual {v0, v6}, Lc/e/i;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    if-eqz v7, :cond_2

    .line 31
    invoke-virtual {v0, v5, v7}, Lc/e/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    .line 32
    :cond_2
    invoke-virtual {v0, v5, v6}, Lc/e/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_3
    :goto_4
    add-int/lit8 p4, p4, -0x1

    goto :goto_0

    :cond_4
    return-object v0
.end method

.method public static a(Lc/l/d/x2;Lc/e/b;Ljava/lang/Object;Lc/l/d/m2;)Lc/e/b;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/l/d/x2;",
            "Lc/e/b<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/Object;",
            "Lc/l/d/m2;",
            ")",
            "Lc/e/b<",
            "Ljava/lang/String;",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation

    .line 113
    iget-object v0, p3, Lc/l/d/m2;->a:Landroidx/fragment/app/Fragment;

    .line 114
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->M()Landroid/view/View;

    move-result-object v1

    .line 115
    invoke-virtual {p1}, Lc/e/i;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_7

    if-eqz p2, :cond_7

    if-nez v1, :cond_0

    goto :goto_3

    .line 116
    :cond_0
    new-instance p2, Lc/e/b;

    invoke-direct {p2}, Lc/e/b;-><init>()V

    .line 117
    invoke-virtual {p0, p2, v1}, Lc/l/d/x2;->a(Ljava/util/Map;Landroid/view/View;)V

    .line 118
    iget-object p0, p3, Lc/l/d/m2;->c:Lc/l/d/a;

    .line 119
    iget-boolean p3, p3, Lc/l/d/m2;->b:Z

    if-eqz p3, :cond_1

    .line 120
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->s()Lc/h/e/i0;

    move-result-object p3

    .line 121
    iget-object p0, p0, Lc/l/d/e2;->m:Ljava/util/ArrayList;

    goto :goto_0

    .line 122
    :cond_1
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->p()Lc/h/e/i0;

    move-result-object p3

    .line 123
    iget-object p0, p0, Lc/l/d/e2;->n:Ljava/util/ArrayList;

    :goto_0
    if-eqz p0, :cond_2

    .line 124
    invoke-virtual {p2, p0}, Lc/e/b;->a(Ljava/util/Collection;)Z

    .line 125
    invoke-virtual {p1}, Lc/e/b;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-virtual {p2, v0}, Lc/e/b;->a(Ljava/util/Collection;)Z

    :cond_2
    if-eqz p3, :cond_5

    .line 126
    invoke-virtual {p3, p0, p2}, Lc/h/e/i0;->a(Ljava/util/List;Ljava/util/Map;)V

    .line 127
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result p3

    add-int/lit8 p3, p3, -0x1

    :goto_1
    if-ltz p3, :cond_6

    .line 128
    invoke-virtual {p0, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 129
    invoke-virtual {p2, v0}, Lc/e/i;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    if-nez v1, :cond_3

    .line 130
    invoke-static {p1, v0}, Lc/l/d/n2;->a(Lc/e/b;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 131
    invoke-virtual {p1, v0}, Lc/e/i;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 132
    :cond_3
    invoke-static {v1}, Lc/h/n/v0;->v(Landroid/view/View;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    .line 133
    invoke-static {p1, v0}, Lc/l/d/n2;->a(Lc/e/b;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 134
    invoke-static {v1}, Lc/h/n/v0;->v(Landroid/view/View;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lc/e/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    :goto_2
    add-int/lit8 p3, p3, -0x1

    goto :goto_1

    .line 135
    :cond_5
    invoke-static {p1, p2}, Lc/l/d/n2;->a(Lc/e/b;Lc/e/b;)V

    :cond_6
    return-object p2

    .line 136
    :cond_7
    :goto_3
    invoke-virtual {p1}, Lc/e/i;->clear()V

    const/4 p0, 0x0

    return-object p0
.end method

.method public static a(Lc/l/d/m2;Landroid/util/SparseArray;I)Lc/l/d/m2;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/l/d/m2;",
            "Landroid/util/SparseArray<",
            "Lc/l/d/m2;",
            ">;I)",
            "Lc/l/d/m2;"
        }
    .end annotation

    if-nez p0, :cond_0

    .line 214
    new-instance p0, Lc/l/d/m2;

    invoke-direct {p0}, Lc/l/d/m2;-><init>()V

    .line 215
    invoke-virtual {p1, p2, p0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    :cond_0
    return-object p0
.end method

.method public static a()Lc/l/d/x2;
    .locals 3

    :try_start_0
    const-string v0, "c.v.w"

    .line 1
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Class;

    .line 2
    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/l/d/x2;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public static a(Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;)Lc/l/d/x2;
    .locals 2

    .line 64
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    if-eqz p0, :cond_2

    .line 65
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->r()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 66
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 67
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->G()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 68
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 69
    :cond_1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->I()Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_2

    .line 70
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    if-eqz p1, :cond_5

    .line 71
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->o()Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_3

    .line 72
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 73
    :cond_3
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->E()Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_4

    .line 74
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 75
    :cond_4
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->H()Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_5

    .line 76
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 77
    :cond_5
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p0

    const/4 p1, 0x0

    if-eqz p0, :cond_6

    return-object p1

    .line 78
    :cond_6
    sget-object p0, Lc/l/d/n2;->b:Lc/l/d/x2;

    if-eqz p0, :cond_7

    invoke-static {p0, v0}, Lc/l/d/n2;->a(Lc/l/d/x2;Ljava/util/List;)Z

    move-result p0

    if-eqz p0, :cond_7

    .line 79
    sget-object p0, Lc/l/d/n2;->b:Lc/l/d/x2;

    return-object p0

    .line 80
    :cond_7
    sget-object p0, Lc/l/d/n2;->c:Lc/l/d/x2;

    if-eqz p0, :cond_8

    invoke-static {p0, v0}, Lc/l/d/n2;->a(Lc/l/d/x2;Ljava/util/List;)Z

    move-result p0

    if-eqz p0, :cond_8

    .line 81
    sget-object p0, Lc/l/d/n2;->c:Lc/l/d/x2;

    return-object p0

    .line 82
    :cond_8
    sget-object p0, Lc/l/d/n2;->b:Lc/l/d/x2;

    if-nez p0, :cond_9

    sget-object p0, Lc/l/d/n2;->c:Lc/l/d/x2;

    if-nez p0, :cond_9

    return-object p1

    .line 83
    :cond_9
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Invalid Transition types"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static a(Lc/l/d/x2;Landroid/view/ViewGroup;Landroid/view/View;Lc/e/b;Lc/l/d/m2;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/l/d/x2;",
            "Landroid/view/ViewGroup;",
            "Landroid/view/View;",
            "Lc/e/b<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lc/l/d/m2;",
            "Ljava/util/ArrayList<",
            "Landroid/view/View;",
            ">;",
            "Ljava/util/ArrayList<",
            "Landroid/view/View;",
            ">;",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v6, p0

    move-object/from16 v7, p4

    move-object/from16 v10, p5

    move-object/from16 v11, p7

    .line 97
    iget-object v8, v7, Lc/l/d/m2;->a:Landroidx/fragment/app/Fragment;

    .line 98
    iget-object v9, v7, Lc/l/d/m2;->d:Landroidx/fragment/app/Fragment;

    const/4 v0, 0x0

    if-eqz v8, :cond_6

    if-nez v9, :cond_0

    goto/16 :goto_3

    .line 99
    :cond_0
    iget-boolean v12, v7, Lc/l/d/m2;->b:Z

    .line 100
    invoke-virtual/range {p3 .. p3}, Lc/e/i;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    move-object/from16 v13, p3

    move-object v1, v0

    goto :goto_0

    .line 101
    :cond_1
    invoke-static {v6, v8, v9, v12}, Lc/l/d/n2;->a(Lc/l/d/x2;Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;Z)Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v13, p3

    .line 102
    :goto_0
    invoke-static {v6, v13, v1, v7}, Lc/l/d/n2;->b(Lc/l/d/x2;Lc/e/b;Ljava/lang/Object;Lc/l/d/m2;)Lc/e/b;

    move-result-object v3

    .line 103
    invoke-virtual/range {p3 .. p3}, Lc/e/i;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_2

    move-object v14, v0

    goto :goto_1

    .line 104
    :cond_2
    invoke-virtual {v3}, Lc/e/b;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-virtual {v10, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    move-object v14, v1

    :goto_1
    if-nez v11, :cond_3

    if-nez p8, :cond_3

    if-nez v14, :cond_3

    return-object v0

    :cond_3
    const/4 v1, 0x1

    .line 105
    invoke-static {v8, v9, v12, v3, v1}, Lc/l/d/n2;->a(Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;ZLc/e/b;Z)V

    if-eqz v14, :cond_4

    .line 106
    new-instance v15, Landroid/graphics/Rect;

    invoke-direct {v15}, Landroid/graphics/Rect;-><init>()V

    move-object/from16 v5, p2

    .line 107
    invoke-virtual {v6, v14, v5, v10}, Lc/l/d/x2;->b(Ljava/lang/Object;Landroid/view/View;Ljava/util/ArrayList;)V

    .line 108
    iget-boolean v4, v7, Lc/l/d/m2;->e:Z

    .line 109
    iget-object v2, v7, Lc/l/d/m2;->f:Lc/l/d/a;

    move-object/from16 v0, p0

    move-object v1, v14

    move-object/from16 v16, v2

    move-object/from16 v2, p8

    move-object/from16 v5, v16

    .line 110
    invoke-static/range {v0 .. v5}, Lc/l/d/n2;->a(Lc/l/d/x2;Ljava/lang/Object;Ljava/lang/Object;Lc/e/b;ZLc/l/d/a;)V

    if-eqz v11, :cond_5

    .line 111
    invoke-virtual {v6, v11, v15}, Lc/l/d/x2;->a(Ljava/lang/Object;Landroid/graphics/Rect;)V

    goto :goto_2

    :cond_4
    move-object v15, v0

    .line 112
    :cond_5
    :goto_2
    new-instance v5, Lc/l/d/k2;

    move-object v0, v5

    move-object/from16 v1, p0

    move-object/from16 v2, p3

    move-object v3, v14

    move-object/from16 v4, p4

    move-object v13, v5

    move-object/from16 v5, p6

    move-object/from16 v6, p2

    move-object v7, v8

    move-object v8, v9

    move v9, v12

    move-object/from16 v10, p5

    move-object/from16 v11, p7

    move-object v12, v15

    invoke-direct/range {v0 .. v12}, Lc/l/d/k2;-><init>(Lc/l/d/x2;Lc/e/b;Ljava/lang/Object;Lc/l/d/m2;Ljava/util/ArrayList;Landroid/view/View;Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;ZLjava/util/ArrayList;Ljava/lang/Object;Landroid/graphics/Rect;)V

    move-object/from16 v0, p1

    invoke-static {v0, v13}, Lc/h/n/y;->a(Landroid/view/View;Ljava/lang/Runnable;)Lc/h/n/y;

    return-object v14

    :cond_6
    :goto_3
    return-object v0
.end method

.method public static a(Lc/l/d/x2;Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;Z)Ljava/lang/Object;
    .locals 0

    if-eqz p1, :cond_2

    if-nez p2, :cond_0

    goto :goto_1

    :cond_0
    if-eqz p3, :cond_1

    .line 86
    invoke-virtual {p2}, Landroidx/fragment/app/Fragment;->I()Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    .line 87
    :cond_1
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->H()Ljava/lang/Object;

    move-result-object p1

    .line 88
    :goto_0
    invoke-virtual {p0, p1}, Lc/l/d/x2;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 89
    invoke-virtual {p0, p1}, Lc/l/d/x2;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_2
    :goto_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static a(Lc/l/d/x2;Landroidx/fragment/app/Fragment;Z)Ljava/lang/Object;
    .locals 0

    if-nez p1, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    if-eqz p2, :cond_1

    .line 90
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->E()Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    .line 91
    :cond_1
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->o()Ljava/lang/Object;

    move-result-object p1

    .line 92
    :goto_0
    invoke-virtual {p0, p1}, Lc/l/d/x2;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static a(Lc/l/d/x2;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/fragment/app/Fragment;Z)Ljava/lang/Object;
    .locals 0

    if-eqz p1, :cond_1

    if-eqz p2, :cond_1

    if-eqz p4, :cond_1

    if-eqz p5, :cond_0

    .line 176
    invoke-virtual {p4}, Landroidx/fragment/app/Fragment;->i()Z

    move-result p4

    goto :goto_0

    .line 177
    :cond_0
    invoke-virtual {p4}, Landroidx/fragment/app/Fragment;->h()Z

    move-result p4

    goto :goto_0

    :cond_1
    const/4 p4, 0x1

    :goto_0
    if-eqz p4, :cond_2

    .line 178
    invoke-virtual {p0, p2, p1, p3}, Lc/l/d/x2;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    goto :goto_1

    .line 179
    :cond_2
    invoke-virtual {p0, p2, p1, p3}, Lc/l/d/x2;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    :goto_1
    return-object p0
.end method

.method public static a(Lc/e/b;Ljava/lang/String;)Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/e/b<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 137
    invoke-virtual {p0}, Lc/e/i;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 138
    invoke-virtual {p0, v1}, Lc/e/i;->e(I)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 139
    invoke-virtual {p0, v1}, Lc/e/i;->c(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static a(Lc/l/d/x2;Ljava/lang/Object;Landroidx/fragment/app/Fragment;Ljava/util/ArrayList;Landroid/view/View;)Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/l/d/x2;",
            "Ljava/lang/Object;",
            "Landroidx/fragment/app/Fragment;",
            "Ljava/util/ArrayList<",
            "Landroid/view/View;",
            ">;",
            "Landroid/view/View;",
            ")",
            "Ljava/util/ArrayList<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation

    if-eqz p1, :cond_2

    .line 166
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 167
    invoke-virtual {p2}, Landroidx/fragment/app/Fragment;->M()Landroid/view/View;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 168
    invoke-virtual {p0, v0, p2}, Lc/l/d/x2;->a(Ljava/util/ArrayList;Landroid/view/View;)V

    :cond_0
    if-eqz p3, :cond_1

    .line 169
    invoke-virtual {v0, p3}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z

    .line 170
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_3

    .line 171
    invoke-virtual {v0, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 172
    invoke-virtual {p0, p1, v0}, Lc/l/d/x2;->a(Ljava/lang/Object;Ljava/util/ArrayList;)V

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :cond_3
    :goto_0
    return-object v0
.end method

.method public static a(Landroid/content/Context;Lc/l/d/n0;Ljava/util/ArrayList;Ljava/util/ArrayList;IIZLc/l/d/l2;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lc/l/d/n0;",
            "Ljava/util/ArrayList<",
            "Lc/l/d/a;",
            ">;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Boolean;",
            ">;IIZ",
            "Lc/l/d/l2;",
            ")V"
        }
    .end annotation

    .line 3
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    move v1, p4

    :goto_0
    if-ge v1, p5, :cond_1

    .line 4
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc/l/d/a;

    .line 5
    invoke-virtual {p3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 6
    invoke-static {v2, v0, p6}, Lc/l/d/n2;->b(Lc/l/d/a;Landroid/util/SparseArray;Z)V

    goto :goto_1

    .line 7
    :cond_0
    invoke-static {v2, v0, p6}, Lc/l/d/n2;->a(Lc/l/d/a;Landroid/util/SparseArray;Z)V

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 8
    :cond_1
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v1

    if-eqz v1, :cond_5

    .line 9
    new-instance v1, Landroid/view/View;

    invoke-direct {v1, p0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 10
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result p0

    const/4 v2, 0x0

    :goto_2
    if-ge v2, p0, :cond_5

    .line 11
    invoke-virtual {v0, v2}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v3

    .line 12
    invoke-static {v3, p2, p3, p4, p5}, Lc/l/d/n2;->a(ILjava/util/ArrayList;Ljava/util/ArrayList;II)Lc/e/b;

    move-result-object v4

    .line 13
    invoke-virtual {v0, v2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lc/l/d/m2;

    .line 14
    invoke-virtual {p1}, Lc/l/d/n0;->a()Z

    move-result v6

    if-eqz v6, :cond_4

    .line 15
    invoke-virtual {p1, v3}, Lc/l/d/n0;->a(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/view/ViewGroup;

    if-nez v3, :cond_2

    goto :goto_3

    :cond_2
    if-eqz p6, :cond_3

    .line 16
    invoke-static {v3, v5, v1, v4, p7}, Lc/l/d/n2;->b(Landroid/view/ViewGroup;Lc/l/d/m2;Landroid/view/View;Lc/e/b;Lc/l/d/l2;)V

    goto :goto_3

    .line 17
    :cond_3
    invoke-static {v3, v5, v1, v4, p7}, Lc/l/d/n2;->a(Landroid/view/ViewGroup;Lc/l/d/m2;Landroid/view/View;Lc/e/b;Lc/l/d/l2;)V

    :cond_4
    :goto_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_5
    return-void
.end method

.method public static a(Landroid/view/ViewGroup;Lc/l/d/m2;Landroid/view/View;Lc/e/b;Lc/l/d/l2;)V
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/ViewGroup;",
            "Lc/l/d/m2;",
            "Landroid/view/View;",
            "Lc/e/b<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lc/l/d/l2;",
            ")V"
        }
    .end annotation

    move-object/from16 v9, p0

    move-object/from16 v10, p1

    move-object/from16 v11, p2

    move-object/from16 v12, p3

    move-object/from16 v13, p4

    .line 39
    iget-object v14, v10, Lc/l/d/m2;->a:Landroidx/fragment/app/Fragment;

    .line 40
    iget-object v15, v10, Lc/l/d/m2;->d:Landroidx/fragment/app/Fragment;

    .line 41
    invoke-static {v15, v14}, Lc/l/d/n2;->a(Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;)Lc/l/d/x2;

    move-result-object v8

    if-nez v8, :cond_0

    return-void

    .line 42
    :cond_0
    iget-boolean v0, v10, Lc/l/d/m2;->b:Z

    .line 43
    iget-boolean v1, v10, Lc/l/d/m2;->e:Z

    .line 44
    invoke-static {v8, v14, v0}, Lc/l/d/n2;->a(Lc/l/d/x2;Landroidx/fragment/app/Fragment;Z)Ljava/lang/Object;

    move-result-object v7

    .line 45
    invoke-static {v8, v15, v1}, Lc/l/d/n2;->b(Lc/l/d/x2;Landroidx/fragment/app/Fragment;Z)Ljava/lang/Object;

    move-result-object v6

    .line 46
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 47
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    move-object v0, v8

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v16, v4

    move-object/from16 v4, p1

    move-object/from16 v17, v5

    move-object/from16 v18, v6

    move-object/from16 v6, v16

    move-object/from16 v19, v7

    move-object v9, v8

    move-object/from16 v8, v18

    .line 48
    invoke-static/range {v0 .. v8}, Lc/l/d/n2;->a(Lc/l/d/x2;Landroid/view/ViewGroup;Landroid/view/View;Lc/e/b;Lc/l/d/m2;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    move-object/from16 v8, v19

    if-nez v8, :cond_1

    if-nez v6, :cond_1

    move-object/from16 v0, v18

    if-nez v0, :cond_2

    return-void

    :cond_1
    move-object/from16 v0, v18

    :cond_2
    move-object/from16 v7, v17

    .line 49
    invoke-static {v9, v0, v15, v7, v11}, Lc/l/d/n2;->a(Lc/l/d/x2;Ljava/lang/Object;Landroidx/fragment/app/Fragment;Ljava/util/ArrayList;Landroid/view/View;)Ljava/util/ArrayList;

    move-result-object v17

    if-eqz v17, :cond_3

    .line 50
    invoke-virtual/range {v17 .. v17}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_4

    :cond_3
    const/4 v0, 0x0

    :cond_4
    move-object/from16 v18, v0

    .line 51
    invoke-virtual {v9, v8, v11}, Lc/l/d/x2;->a(Ljava/lang/Object;Landroid/view/View;)V

    .line 52
    iget-boolean v5, v10, Lc/l/d/m2;->b:Z

    move-object v0, v9

    move-object v1, v8

    move-object/from16 v2, v18

    move-object v3, v6

    move-object v4, v14

    invoke-static/range {v0 .. v5}, Lc/l/d/n2;->a(Lc/l/d/x2;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/fragment/app/Fragment;Z)Ljava/lang/Object;

    move-result-object v10

    if-eqz v15, :cond_6

    if-eqz v17, :cond_6

    .line 53
    invoke-virtual/range {v17 .. v17}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gtz v0, :cond_5

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_6

    .line 54
    :cond_5
    new-instance v0, Lc/h/j/c;

    invoke-direct {v0}, Lc/h/j/c;-><init>()V

    .line 55
    invoke-interface {v13, v15, v0}, Lc/l/d/l2;->b(Landroidx/fragment/app/Fragment;Lc/h/j/c;)V

    .line 56
    new-instance v1, Lc/l/d/h2;

    invoke-direct {v1, v13, v15, v0}, Lc/l/d/h2;-><init>(Lc/l/d/l2;Landroidx/fragment/app/Fragment;Lc/h/j/c;)V

    invoke-virtual {v9, v15, v10, v0, v1}, Lc/l/d/x2;->a(Landroidx/fragment/app/Fragment;Ljava/lang/Object;Lc/h/j/c;Ljava/lang/Runnable;)V

    :cond_6
    if-eqz v10, :cond_7

    .line 57
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    move-object v0, v9

    move-object v1, v10

    move-object v2, v8

    move-object v3, v13

    move-object/from16 v4, v18

    move-object/from16 v5, v17

    move-object/from16 v7, v16

    .line 58
    invoke-virtual/range {v0 .. v7}, Lc/l/d/x2;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;)V

    move-object/from16 v1, p0

    move-object v2, v14

    move-object/from16 v3, p2

    move-object/from16 v4, v16

    move-object v5, v8

    move-object v6, v13

    move-object/from16 v7, v18

    move-object/from16 v8, v17

    .line 59
    invoke-static/range {v0 .. v8}, Lc/l/d/n2;->a(Lc/l/d/x2;Landroid/view/ViewGroup;Landroidx/fragment/app/Fragment;Landroid/view/View;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;)V

    move-object/from16 v0, p0

    move-object v1, v9

    move-object/from16 v2, v16

    .line 60
    invoke-virtual {v1, v0, v2, v12}, Lc/l/d/x2;->a(Landroid/view/View;Ljava/util/ArrayList;Ljava/util/Map;)V

    .line 61
    invoke-virtual {v1, v0, v10}, Lc/l/d/x2;->a(Landroid/view/ViewGroup;Ljava/lang/Object;)V

    .line 62
    invoke-virtual {v1, v0, v2, v12}, Lc/l/d/x2;->a(Landroid/view/ViewGroup;Ljava/util/ArrayList;Ljava/util/Map;)V

    :cond_7
    return-void
.end method

.method public static a(Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;ZLc/e/b;Z)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/fragment/app/Fragment;",
            "Landroidx/fragment/app/Fragment;",
            "Z",
            "Lc/e/b<",
            "Ljava/lang/String;",
            "Landroid/view/View;",
            ">;Z)V"
        }
    .end annotation

    if-eqz p2, :cond_0

    .line 157
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->p()Lc/h/e/i0;

    move-result-object p0

    goto :goto_0

    .line 158
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->p()Lc/h/e/i0;

    move-result-object p0

    :goto_0
    if-eqz p0, :cond_4

    .line 159
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 160
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    const/4 v0, 0x0

    if-nez p3, :cond_1

    const/4 v1, 0x0

    goto :goto_1

    .line 161
    :cond_1
    invoke-virtual {p3}, Lc/e/i;->size()I

    move-result v1

    :goto_1
    if-ge v0, v1, :cond_2

    .line 162
    invoke-virtual {p3, v0}, Lc/e/i;->c(I)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 163
    invoke-virtual {p3, v0}, Lc/e/i;->e(I)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_2
    const/4 p3, 0x0

    if-eqz p4, :cond_3

    .line 164
    invoke-virtual {p0, p2, p1, p3}, Lc/h/e/i0;->b(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    goto :goto_2

    .line 165
    :cond_3
    invoke-virtual {p0, p2, p1, p3}, Lc/h/e/i0;->a(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    :cond_4
    :goto_2
    return-void
.end method

.method public static a(Lc/e/b;Lc/e/b;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/e/b<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lc/e/b<",
            "Ljava/lang/String;",
            "Landroid/view/View;",
            ">;)V"
        }
    .end annotation

    .line 153
    invoke-virtual {p0}, Lc/e/i;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_1

    .line 154
    invoke-virtual {p0, v0}, Lc/e/i;->e(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 155
    invoke-virtual {p1, v1}, Lc/e/i;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 156
    invoke-virtual {p0, v0}, Lc/e/i;->d(I)Ljava/lang/Object;

    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static a(Lc/l/d/a;Landroid/util/SparseArray;Z)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/l/d/a;",
            "Landroid/util/SparseArray<",
            "Lc/l/d/m2;",
            ">;Z)V"
        }
    .end annotation

    .line 180
    iget-object v0, p0, Lc/l/d/e2;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    .line 181
    iget-object v3, p0, Lc/l/d/e2;->a:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lc/l/d/d2;

    .line 182
    invoke-static {p0, v3, p1, v1, p2}, Lc/l/d/n2;->a(Lc/l/d/a;Lc/l/d/d2;Landroid/util/SparseArray;ZZ)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static a(Lc/l/d/a;Lc/l/d/d2;Landroid/util/SparseArray;ZZ)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/l/d/a;",
            "Lc/l/d/d2;",
            "Landroid/util/SparseArray<",
            "Lc/l/d/m2;",
            ">;ZZ)V"
        }
    .end annotation

    .line 183
    iget-object v0, p1, Lc/l/d/d2;->b:Landroidx/fragment/app/Fragment;

    if-nez v0, :cond_0

    return-void

    .line 184
    :cond_0
    iget v1, v0, Landroidx/fragment/app/Fragment;->y:I

    if-nez v1, :cond_1

    return-void

    :cond_1
    if-eqz p3, :cond_2

    .line 185
    sget-object v2, Lc/l/d/n2;->a:[I

    iget p1, p1, Lc/l/d/d2;->a:I

    aget p1, v2, p1

    goto :goto_0

    :cond_2
    iget p1, p1, Lc/l/d/d2;->a:I

    :goto_0
    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq p1, v3, :cond_a

    const/4 v4, 0x3

    if-eq p1, v4, :cond_7

    const/4 v4, 0x4

    if-eq p1, v4, :cond_5

    const/4 v4, 0x5

    if-eq p1, v4, :cond_3

    const/4 v4, 0x6

    if-eq p1, v4, :cond_7

    const/4 v4, 0x7

    if-eq p1, v4, :cond_a

    const/4 p1, 0x0

    const/4 v3, 0x0

    :goto_1
    const/4 v4, 0x0

    goto/16 :goto_7

    :cond_3
    if-eqz p4, :cond_4

    .line 186
    iget-boolean p1, v0, Landroidx/fragment/app/Fragment;->N:Z

    if-eqz p1, :cond_c

    iget-boolean p1, v0, Landroidx/fragment/app/Fragment;->A:Z

    if-nez p1, :cond_c

    iget-boolean p1, v0, Landroidx/fragment/app/Fragment;->m:Z

    if-eqz p1, :cond_c

    goto :goto_5

    .line 187
    :cond_4
    iget-boolean p1, v0, Landroidx/fragment/app/Fragment;->A:Z

    goto :goto_6

    :cond_5
    if-eqz p4, :cond_6

    .line 188
    iget-boolean p1, v0, Landroidx/fragment/app/Fragment;->N:Z

    if-eqz p1, :cond_8

    iget-boolean p1, v0, Landroidx/fragment/app/Fragment;->m:Z

    if-eqz p1, :cond_8

    iget-boolean p1, v0, Landroidx/fragment/app/Fragment;->A:Z

    if-eqz p1, :cond_8

    :goto_2
    goto :goto_3

    .line 189
    :cond_6
    iget-boolean p1, v0, Landroidx/fragment/app/Fragment;->m:Z

    if-eqz p1, :cond_8

    iget-boolean p1, v0, Landroidx/fragment/app/Fragment;->A:Z

    if-nez p1, :cond_8

    goto :goto_2

    :cond_7
    if-eqz p4, :cond_9

    .line 190
    iget-boolean p1, v0, Landroidx/fragment/app/Fragment;->m:Z

    if-nez p1, :cond_8

    iget-object p1, v0, Landroidx/fragment/app/Fragment;->I:Landroid/view/View;

    if-eqz p1, :cond_8

    .line 191
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    move-result p1

    if-nez p1, :cond_8

    iget p1, v0, Landroidx/fragment/app/Fragment;->O:F

    const/4 v4, 0x0

    cmpl-float p1, p1, v4

    if-ltz p1, :cond_8

    :goto_3
    const/4 p1, 0x1

    goto :goto_4

    :cond_8
    const/4 p1, 0x0

    goto :goto_4

    .line 192
    :cond_9
    iget-boolean p1, v0, Landroidx/fragment/app/Fragment;->m:Z

    if-eqz p1, :cond_8

    iget-boolean p1, v0, Landroidx/fragment/app/Fragment;->A:Z

    if-nez p1, :cond_8

    goto :goto_3

    :goto_4
    move v4, p1

    const/4 p1, 0x1

    const/4 v3, 0x0

    goto :goto_7

    :cond_a
    if-eqz p4, :cond_b

    .line 193
    iget-boolean p1, v0, Landroidx/fragment/app/Fragment;->M:Z

    goto :goto_6

    .line 194
    :cond_b
    iget-boolean p1, v0, Landroidx/fragment/app/Fragment;->m:Z

    if-nez p1, :cond_c

    iget-boolean p1, v0, Landroidx/fragment/app/Fragment;->A:Z

    if-nez p1, :cond_c

    :goto_5
    const/4 p1, 0x1

    goto :goto_6

    :cond_c
    const/4 p1, 0x0

    :goto_6
    move v2, p1

    const/4 p1, 0x0

    goto :goto_1

    .line 195
    :goto_7
    invoke-virtual {p2, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lc/l/d/m2;

    if-eqz v2, :cond_d

    .line 196
    invoke-static {v5, p2, v1}, Lc/l/d/n2;->a(Lc/l/d/m2;Landroid/util/SparseArray;I)Lc/l/d/m2;

    move-result-object v5

    .line 197
    iput-object v0, v5, Lc/l/d/m2;->a:Landroidx/fragment/app/Fragment;

    .line 198
    iput-boolean p3, v5, Lc/l/d/m2;->b:Z

    .line 199
    iput-object p0, v5, Lc/l/d/m2;->c:Lc/l/d/a;

    :cond_d
    const/4 v2, 0x0

    if-nez p4, :cond_f

    if-eqz v3, :cond_f

    if-eqz v5, :cond_e

    .line 200
    iget-object v3, v5, Lc/l/d/m2;->d:Landroidx/fragment/app/Fragment;

    if-ne v3, v0, :cond_e

    .line 201
    iput-object v2, v5, Lc/l/d/m2;->d:Landroidx/fragment/app/Fragment;

    .line 202
    :cond_e
    iget-boolean v3, p0, Lc/l/d/e2;->o:Z

    if-nez v3, :cond_f

    .line 203
    iget-object v3, p0, Lc/l/d/a;->q:Lc/l/d/o1;

    .line 204
    invoke-virtual {v3, v0}, Lc/l/d/o1;->e(Landroidx/fragment/app/Fragment;)Lc/l/d/a2;

    move-result-object v6

    .line 205
    invoke-virtual {v3}, Lc/l/d/o1;->y()Lc/l/d/c2;

    move-result-object v7

    invoke-virtual {v7, v6}, Lc/l/d/c2;->a(Lc/l/d/a2;)V

    .line 206
    invoke-virtual {v3, v0}, Lc/l/d/o1;->s(Landroidx/fragment/app/Fragment;)V

    :cond_f
    if-eqz v4, :cond_11

    if-eqz v5, :cond_10

    .line 207
    iget-object v3, v5, Lc/l/d/m2;->d:Landroidx/fragment/app/Fragment;

    if-nez v3, :cond_11

    .line 208
    :cond_10
    invoke-static {v5, p2, v1}, Lc/l/d/n2;->a(Lc/l/d/m2;Landroid/util/SparseArray;I)Lc/l/d/m2;

    move-result-object v5

    .line 209
    iput-object v0, v5, Lc/l/d/m2;->d:Landroidx/fragment/app/Fragment;

    .line 210
    iput-boolean p3, v5, Lc/l/d/m2;->e:Z

    .line 211
    iput-object p0, v5, Lc/l/d/m2;->f:Lc/l/d/a;

    :cond_11
    if-nez p4, :cond_12

    if-eqz p1, :cond_12

    if-eqz v5, :cond_12

    .line 212
    iget-object p0, v5, Lc/l/d/m2;->a:Landroidx/fragment/app/Fragment;

    if-ne p0, v0, :cond_12

    .line 213
    iput-object v2, v5, Lc/l/d/m2;->a:Landroidx/fragment/app/Fragment;

    :cond_12
    return-void
.end method

.method public static a(Lc/l/d/x2;Landroid/view/ViewGroup;Landroidx/fragment/app/Fragment;Landroid/view/View;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/l/d/x2;",
            "Landroid/view/ViewGroup;",
            "Landroidx/fragment/app/Fragment;",
            "Landroid/view/View;",
            "Ljava/util/ArrayList<",
            "Landroid/view/View;",
            ">;",
            "Ljava/lang/Object;",
            "Ljava/util/ArrayList<",
            "Landroid/view/View;",
            ">;",
            "Ljava/lang/Object;",
            "Ljava/util/ArrayList<",
            "Landroid/view/View;",
            ">;)V"
        }
    .end annotation

    .line 63
    new-instance v9, Lc/l/d/i2;

    move-object v0, v9

    move-object v1, p5

    move-object v2, p0

    move-object v3, p3

    move-object v4, p2

    move-object v5, p4

    move-object/from16 v6, p6

    move-object/from16 v7, p8

    move-object/from16 v8, p7

    invoke-direct/range {v0 .. v8}, Lc/l/d/i2;-><init>(Ljava/lang/Object;Lc/l/d/x2;Landroid/view/View;Landroidx/fragment/app/Fragment;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/Object;)V

    move-object v0, p1

    invoke-static {p1, v9}, Lc/h/n/y;->a(Landroid/view/View;Ljava/lang/Runnable;)Lc/h/n/y;

    return-void
.end method

.method public static a(Lc/l/d/x2;Ljava/lang/Object;Landroidx/fragment/app/Fragment;Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/l/d/x2;",
            "Ljava/lang/Object;",
            "Landroidx/fragment/app/Fragment;",
            "Ljava/util/ArrayList<",
            "Landroid/view/View;",
            ">;)V"
        }
    .end annotation

    if-eqz p2, :cond_0

    if-eqz p1, :cond_0

    .line 33
    iget-boolean v0, p2, Landroidx/fragment/app/Fragment;->m:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p2, Landroidx/fragment/app/Fragment;->A:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p2, Landroidx/fragment/app/Fragment;->N:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    .line 34
    invoke-virtual {p2, v0}, Landroidx/fragment/app/Fragment;->h(Z)V

    .line 35
    invoke-virtual {p2}, Landroidx/fragment/app/Fragment;->M()Landroid/view/View;

    move-result-object v0

    .line 36
    invoke-virtual {p0, p1, v0, p3}, Lc/l/d/x2;->a(Ljava/lang/Object;Landroid/view/View;Ljava/util/ArrayList;)V

    .line 37
    iget-object p0, p2, Landroidx/fragment/app/Fragment;->H:Landroid/view/ViewGroup;

    .line 38
    new-instance p1, Lc/l/d/g2;

    invoke-direct {p1, p3}, Lc/l/d/g2;-><init>(Ljava/util/ArrayList;)V

    invoke-static {p0, p1}, Lc/h/n/y;->a(Landroid/view/View;Ljava/lang/Runnable;)Lc/h/n/y;

    :cond_0
    return-void
.end method

.method public static a(Lc/l/d/x2;Ljava/lang/Object;Ljava/lang/Object;Lc/e/b;ZLc/l/d/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/l/d/x2;",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            "Lc/e/b<",
            "Ljava/lang/String;",
            "Landroid/view/View;",
            ">;Z",
            "Lc/l/d/a;",
            ")V"
        }
    .end annotation

    .line 146
    iget-object v0, p5, Lc/l/d/e2;->m:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    .line 147
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    if-eqz p4, :cond_0

    .line 148
    iget-object p4, p5, Lc/l/d/e2;->n:Ljava/util/ArrayList;

    invoke-virtual {p4, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ljava/lang/String;

    goto :goto_0

    .line 149
    :cond_0
    iget-object p4, p5, Lc/l/d/e2;->m:Ljava/util/ArrayList;

    invoke-virtual {p4, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ljava/lang/String;

    .line 150
    :goto_0
    invoke-virtual {p3, p4}, Lc/e/i;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Landroid/view/View;

    .line 151
    invoke-virtual {p0, p1, p3}, Lc/l/d/x2;->c(Ljava/lang/Object;Landroid/view/View;)V

    if-eqz p2, :cond_1

    .line 152
    invoke-virtual {p0, p2, p3}, Lc/l/d/x2;->c(Ljava/lang/Object;Landroid/view/View;)V

    :cond_1
    return-void
.end method

.method public static a(Ljava/util/ArrayList;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Landroid/view/View;",
            ">;I)V"
        }
    .end annotation

    if-nez p0, :cond_0

    return-void

    .line 173
    :cond_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_1

    .line 174
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    .line 175
    invoke-virtual {v1, p1}, Landroid/view/View;->setVisibility(I)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static a(Ljava/util/ArrayList;Lc/e/b;Ljava/util/Collection;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Landroid/view/View;",
            ">;",
            "Lc/e/b<",
            "Ljava/lang/String;",
            "Landroid/view/View;",
            ">;",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 93
    invoke-virtual {p1}, Lc/e/i;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_1

    .line 94
    invoke-virtual {p1, v0}, Lc/e/i;->e(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    .line 95
    invoke-static {v1}, Lc/h/n/v0;->v(Landroid/view/View;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {p2, v2}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 96
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static a(Lc/l/d/x2;Ljava/util/List;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/l/d/x2;",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    .line 84
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    .line 85
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p0, v3}, Lc/l/d/x2;->a(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    return v1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method public static b(Lc/l/d/x2;Lc/e/b;Ljava/lang/Object;Lc/l/d/m2;)Lc/e/b;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/l/d/x2;",
            "Lc/e/b<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/Object;",
            "Lc/l/d/m2;",
            ")",
            "Lc/e/b<",
            "Ljava/lang/String;",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation

    .line 54
    invoke-virtual {p1}, Lc/e/i;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_7

    if-nez p2, :cond_0

    goto :goto_3

    .line 55
    :cond_0
    iget-object p2, p3, Lc/l/d/m2;->d:Landroidx/fragment/app/Fragment;

    .line 56
    new-instance v0, Lc/e/b;

    invoke-direct {v0}, Lc/e/b;-><init>()V

    .line 57
    invoke-virtual {p2}, Landroidx/fragment/app/Fragment;->w0()Landroid/view/View;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lc/l/d/x2;->a(Ljava/util/Map;Landroid/view/View;)V

    .line 58
    iget-object p0, p3, Lc/l/d/m2;->f:Lc/l/d/a;

    .line 59
    iget-boolean p3, p3, Lc/l/d/m2;->e:Z

    if-eqz p3, :cond_1

    .line 60
    invoke-virtual {p2}, Landroidx/fragment/app/Fragment;->p()Lc/h/e/i0;

    move-result-object p2

    .line 61
    iget-object p0, p0, Lc/l/d/e2;->n:Ljava/util/ArrayList;

    goto :goto_0

    .line 62
    :cond_1
    invoke-virtual {p2}, Landroidx/fragment/app/Fragment;->s()Lc/h/e/i0;

    move-result-object p2

    .line 63
    iget-object p0, p0, Lc/l/d/e2;->m:Ljava/util/ArrayList;

    :goto_0
    if-eqz p0, :cond_2

    .line 64
    invoke-virtual {v0, p0}, Lc/e/b;->a(Ljava/util/Collection;)Z

    :cond_2
    if-eqz p2, :cond_5

    .line 65
    invoke-virtual {p2, p0, v0}, Lc/h/e/i0;->a(Ljava/util/List;Ljava/util/Map;)V

    .line 66
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result p2

    add-int/lit8 p2, p2, -0x1

    :goto_1
    if-ltz p2, :cond_6

    .line 67
    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/String;

    .line 68
    invoke-virtual {v0, p3}, Lc/e/i;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    if-nez v1, :cond_3

    .line 69
    invoke-virtual {p1, p3}, Lc/e/i;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 70
    :cond_3
    invoke-static {v1}, Lc/h/n/v0;->v(Landroid/view/View;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    .line 71
    invoke-virtual {p1, p3}, Lc/e/i;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/String;

    .line 72
    invoke-static {v1}, Lc/h/n/v0;->v(Landroid/view/View;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1, p3}, Lc/e/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    :goto_2
    add-int/lit8 p2, p2, -0x1

    goto :goto_1

    .line 73
    :cond_5
    invoke-virtual {v0}, Lc/e/b;->keySet()Ljava/util/Set;

    move-result-object p0

    invoke-virtual {p1, p0}, Lc/e/b;->a(Ljava/util/Collection;)Z

    :cond_6
    return-object v0

    .line 74
    :cond_7
    :goto_3
    invoke-virtual {p1}, Lc/e/i;->clear()V

    const/4 p0, 0x0

    return-object p0
.end method

.method public static b(Lc/l/d/x2;Landroid/view/ViewGroup;Landroid/view/View;Lc/e/b;Lc/l/d/m2;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/l/d/x2;",
            "Landroid/view/ViewGroup;",
            "Landroid/view/View;",
            "Lc/e/b<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lc/l/d/m2;",
            "Ljava/util/ArrayList<",
            "Landroid/view/View;",
            ">;",
            "Ljava/util/ArrayList<",
            "Landroid/view/View;",
            ">;",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object v6, p0

    move-object/from16 v0, p2

    move-object/from16 v1, p3

    move-object/from16 v7, p4

    move-object/from16 v2, p5

    move-object/from16 v3, p6

    move-object/from16 v8, p7

    .line 29
    iget-object v9, v7, Lc/l/d/m2;->a:Landroidx/fragment/app/Fragment;

    .line 30
    iget-object v10, v7, Lc/l/d/m2;->d:Landroidx/fragment/app/Fragment;

    if-eqz v9, :cond_0

    .line 31
    invoke-virtual {v9}, Landroidx/fragment/app/Fragment;->w0()Landroid/view/View;

    move-result-object v4

    const/4 v5, 0x0

    invoke-virtual {v4, v5}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    const/4 v4, 0x0

    if-eqz v9, :cond_9

    if-nez v10, :cond_1

    goto/16 :goto_3

    .line 32
    :cond_1
    iget-boolean v11, v7, Lc/l/d/m2;->b:Z

    .line 33
    invoke-virtual/range {p3 .. p3}, Lc/e/i;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_2

    move-object v5, v4

    goto :goto_0

    .line 34
    :cond_2
    invoke-static {p0, v9, v10, v11}, Lc/l/d/n2;->a(Lc/l/d/x2;Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;Z)Ljava/lang/Object;

    move-result-object v5

    .line 35
    :goto_0
    invoke-static {p0, v1, v5, v7}, Lc/l/d/n2;->b(Lc/l/d/x2;Lc/e/b;Ljava/lang/Object;Lc/l/d/m2;)Lc/e/b;

    move-result-object v12

    .line 36
    invoke-static {p0, v1, v5, v7}, Lc/l/d/n2;->a(Lc/l/d/x2;Lc/e/b;Ljava/lang/Object;Lc/l/d/m2;)Lc/e/b;

    move-result-object v13

    .line 37
    invoke-virtual/range {p3 .. p3}, Lc/e/i;->isEmpty()Z

    move-result v14

    if-eqz v14, :cond_5

    if-eqz v12, :cond_3

    .line 38
    invoke-virtual {v12}, Lc/e/i;->clear()V

    :cond_3
    if-eqz v13, :cond_4

    .line 39
    invoke-virtual {v13}, Lc/e/i;->clear()V

    :cond_4
    move-object v14, v4

    goto :goto_1

    .line 40
    :cond_5
    invoke-virtual/range {p3 .. p3}, Lc/e/b;->keySet()Ljava/util/Set;

    move-result-object v14

    .line 41
    invoke-static {v2, v12, v14}, Lc/l/d/n2;->a(Ljava/util/ArrayList;Lc/e/b;Ljava/util/Collection;)V

    .line 42
    invoke-virtual/range {p3 .. p3}, Lc/e/b;->values()Ljava/util/Collection;

    move-result-object v1

    .line 43
    invoke-static {v3, v13, v1}, Lc/l/d/n2;->a(Ljava/util/ArrayList;Lc/e/b;Ljava/util/Collection;)V

    move-object v14, v5

    :goto_1
    if-nez v8, :cond_6

    if-nez p8, :cond_6

    if-nez v14, :cond_6

    return-object v4

    :cond_6
    const/4 v1, 0x1

    .line 44
    invoke-static {v9, v10, v11, v12, v1}, Lc/l/d/n2;->a(Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;ZLc/e/b;Z)V

    if-eqz v14, :cond_8

    .line 45
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 46
    invoke-virtual {p0, v14, v0, v2}, Lc/l/d/x2;->b(Ljava/lang/Object;Landroid/view/View;Ljava/util/ArrayList;)V

    .line 47
    iget-boolean v4, v7, Lc/l/d/m2;->e:Z

    .line 48
    iget-object v5, v7, Lc/l/d/m2;->f:Lc/l/d/a;

    move-object v0, p0

    move-object v1, v14

    move-object/from16 v2, p8

    move-object v3, v12

    .line 49
    invoke-static/range {v0 .. v5}, Lc/l/d/n2;->a(Lc/l/d/x2;Ljava/lang/Object;Ljava/lang/Object;Lc/e/b;ZLc/l/d/a;)V

    .line 50
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 51
    invoke-static {v13, v7, v8, v11}, Lc/l/d/n2;->a(Lc/e/b;Lc/l/d/m2;Ljava/lang/Object;Z)Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_7

    .line 52
    invoke-virtual {p0, v8, v0}, Lc/l/d/x2;->a(Ljava/lang/Object;Landroid/graphics/Rect;)V

    :cond_7
    move-object v7, v0

    move-object v5, v1

    goto :goto_2

    :cond_8
    move-object v5, v4

    move-object v7, v5

    .line 53
    :goto_2
    new-instance v8, Lc/l/d/j2;

    move-object v0, v8

    move-object v1, v9

    move-object v2, v10

    move v3, v11

    move-object v4, v13

    move-object v6, p0

    invoke-direct/range {v0 .. v7}, Lc/l/d/j2;-><init>(Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;ZLc/e/b;Landroid/view/View;Lc/l/d/x2;Landroid/graphics/Rect;)V

    move-object/from16 v0, p1

    invoke-static {v0, v8}, Lc/h/n/y;->a(Landroid/view/View;Ljava/lang/Runnable;)Lc/h/n/y;

    return-object v14

    :cond_9
    :goto_3
    return-object v4
.end method

.method public static b(Lc/l/d/x2;Landroidx/fragment/app/Fragment;Z)Ljava/lang/Object;
    .locals 0

    if-nez p1, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    if-eqz p2, :cond_1

    .line 26
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->G()Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    .line 27
    :cond_1
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->r()Ljava/lang/Object;

    move-result-object p1

    .line 28
    :goto_0
    invoke-virtual {p0, p1}, Lc/l/d/x2;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static b(Landroid/view/ViewGroup;Lc/l/d/m2;Landroid/view/View;Lc/e/b;Lc/l/d/l2;)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/ViewGroup;",
            "Lc/l/d/m2;",
            "Landroid/view/View;",
            "Lc/e/b<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lc/l/d/l2;",
            ")V"
        }
    .end annotation

    move-object/from16 v4, p1

    move-object/from16 v9, p2

    move-object/from16 v10, p4

    .line 1
    iget-object v11, v4, Lc/l/d/m2;->a:Landroidx/fragment/app/Fragment;

    .line 2
    iget-object v12, v4, Lc/l/d/m2;->d:Landroidx/fragment/app/Fragment;

    .line 3
    invoke-static {v12, v11}, Lc/l/d/n2;->a(Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;)Lc/l/d/x2;

    move-result-object v13

    if-nez v13, :cond_0

    return-void

    .line 4
    :cond_0
    iget-boolean v14, v4, Lc/l/d/m2;->b:Z

    .line 5
    iget-boolean v0, v4, Lc/l/d/m2;->e:Z

    .line 6
    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 7
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 8
    invoke-static {v13, v11, v14}, Lc/l/d/n2;->a(Lc/l/d/x2;Landroidx/fragment/app/Fragment;Z)Ljava/lang/Object;

    move-result-object v7

    .line 9
    invoke-static {v13, v12, v0}, Lc/l/d/n2;->b(Lc/l/d/x2;Landroidx/fragment/app/Fragment;Z)Ljava/lang/Object;

    move-result-object v6

    move-object v0, v13

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p1

    move-object v5, v8

    move-object/from16 p1, v6

    move-object v6, v15

    move-object/from16 v16, v7

    move-object v10, v8

    move-object/from16 v8, p1

    .line 10
    invoke-static/range {v0 .. v8}, Lc/l/d/n2;->b(Lc/l/d/x2;Landroid/view/ViewGroup;Landroid/view/View;Lc/e/b;Lc/l/d/m2;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    move-object/from16 v6, v16

    if-nez v6, :cond_1

    if-nez v8, :cond_1

    move-object/from16 v7, p1

    if-nez v7, :cond_2

    return-void

    :cond_1
    move-object/from16 v7, p1

    .line 11
    :cond_2
    invoke-static {v13, v7, v12, v10, v9}, Lc/l/d/n2;->a(Lc/l/d/x2;Ljava/lang/Object;Landroidx/fragment/app/Fragment;Ljava/util/ArrayList;Landroid/view/View;)Ljava/util/ArrayList;

    move-result-object v5

    .line 12
    invoke-static {v13, v6, v11, v15, v9}, Lc/l/d/n2;->a(Lc/l/d/x2;Ljava/lang/Object;Landroidx/fragment/app/Fragment;Ljava/util/ArrayList;Landroid/view/View;)Ljava/util/ArrayList;

    move-result-object v9

    const/4 v0, 0x4

    .line 13
    invoke-static {v9, v0}, Lc/l/d/n2;->a(Ljava/util/ArrayList;I)V

    move-object v0, v13

    move-object v1, v6

    move-object v2, v7

    move-object v3, v8

    move-object v4, v11

    move-object v11, v5

    move v5, v14

    .line 14
    invoke-static/range {v0 .. v5}, Lc/l/d/n2;->a(Lc/l/d/x2;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/fragment/app/Fragment;Z)Ljava/lang/Object;

    move-result-object v14

    if-eqz v12, :cond_4

    if-eqz v11, :cond_4

    .line 15
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gtz v0, :cond_3

    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_4

    .line 16
    :cond_3
    new-instance v0, Lc/h/j/c;

    invoke-direct {v0}, Lc/h/j/c;-><init>()V

    move-object/from16 v1, p4

    .line 17
    invoke-interface {v1, v12, v0}, Lc/l/d/l2;->b(Landroidx/fragment/app/Fragment;Lc/h/j/c;)V

    .line 18
    new-instance v2, Lc/l/d/f2;

    invoke-direct {v2, v1, v12, v0}, Lc/l/d/f2;-><init>(Lc/l/d/l2;Landroidx/fragment/app/Fragment;Lc/h/j/c;)V

    invoke-virtual {v13, v12, v14, v0, v2}, Lc/l/d/x2;->a(Landroidx/fragment/app/Fragment;Ljava/lang/Object;Lc/h/j/c;Ljava/lang/Runnable;)V

    :cond_4
    if-eqz v14, :cond_5

    .line 19
    invoke-static {v13, v7, v12, v11}, Lc/l/d/n2;->a(Lc/l/d/x2;Ljava/lang/Object;Landroidx/fragment/app/Fragment;Ljava/util/ArrayList;)V

    .line 20
    invoke-virtual {v13, v15}, Lc/l/d/x2;->a(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    move-result-object v12

    move-object v0, v13

    move-object v1, v14

    move-object v2, v6

    move-object v3, v9

    move-object v4, v7

    move-object v5, v11

    move-object v6, v8

    move-object v7, v15

    .line 21
    invoke-virtual/range {v0 .. v7}, Lc/l/d/x2;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;)V

    move-object/from16 v1, p0

    .line 22
    invoke-virtual {v13, v1, v14}, Lc/l/d/x2;->a(Landroid/view/ViewGroup;Ljava/lang/Object;)V

    move-object v2, v10

    move-object v3, v15

    move-object v4, v12

    move-object/from16 v5, p3

    .line 23
    invoke-virtual/range {v0 .. v5}, Lc/l/d/x2;->a(Landroid/view/View;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/Map;)V

    const/4 v0, 0x0

    .line 24
    invoke-static {v9, v0}, Lc/l/d/n2;->a(Ljava/util/ArrayList;I)V

    .line 25
    invoke-virtual {v13, v8, v10, v15}, Lc/l/d/x2;->b(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    :cond_5
    return-void
.end method

.method public static b(Lc/l/d/a;Landroid/util/SparseArray;Z)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/l/d/a;",
            "Landroid/util/SparseArray<",
            "Lc/l/d/m2;",
            ">;Z)V"
        }
    .end annotation

    .line 75
    iget-object v0, p0, Lc/l/d/a;->q:Lc/l/d/o1;

    invoke-virtual {v0}, Lc/l/d/o1;->w()Lc/l/d/n0;

    move-result-object v0

    invoke-virtual {v0}, Lc/l/d/n0;->a()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 76
    :cond_0
    iget-object v0, p0, Lc/l/d/e2;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    :goto_0
    if-ltz v0, :cond_1

    .line 77
    iget-object v2, p0, Lc/l/d/e2;->a:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc/l/d/d2;

    .line 78
    invoke-static {p0, v2, p1, v1, p2}, Lc/l/d/n2;->a(Lc/l/d/a;Lc/l/d/d2;Landroid/util/SparseArray;ZZ)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    return-void
.end method
