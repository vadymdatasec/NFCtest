.class public abstract Le/f/e/s/e/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:[I

.field public static final b:[I

.field public static final c:[I

.field public static final d:[I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x4

    new-array v1, v0, [I

    .line 1
    fill-array-data v1, :array_0

    sput-object v1, Le/f/e/s/e/a;->a:[I

    new-array v0, v0, [I

    .line 2
    fill-array-data v0, :array_1

    sput-object v0, Le/f/e/s/e/a;->b:[I

    const/16 v0, 0x8

    new-array v0, v0, [I

    .line 3
    fill-array-data v0, :array_2

    sput-object v0, Le/f/e/s/e/a;->c:[I

    const/16 v0, 0x9

    new-array v0, v0, [I

    .line 4
    fill-array-data v0, :array_3

    sput-object v0, Le/f/e/s/e/a;->d:[I

    return-void

    :array_0
    .array-data 4
        0x0
        0x4
        0x1
        0x5
    .end array-data

    :array_1
    .array-data 4
        0x6
        0x2
        0x7
        0x3
    .end array-data

    :array_2
    .array-data 4
        0x8
        0x1
        0x1
        0x1
        0x1
        0x1
        0x1
        0x3
    .end array-data

    :array_3
    .array-data 4
        0x7
        0x1
        0x1
        0x3
        0x1
        0x1
        0x1
        0x2
        0x1
    .end array-data
.end method

.method public static a([I[IF)F
    .locals 9

    .line 57
    array-length v0, p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    .line 58
    aget v5, p0, v2

    add-int/2addr v3, v5

    .line 59
    aget v5, p1, v2

    add-int/2addr v4, v5

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    const/high16 v2, 0x7f800000    # Float.POSITIVE_INFINITY

    if-ge v3, v4, :cond_1

    return v2

    :cond_1
    int-to-float v3, v3

    int-to-float v4, v4

    div-float v4, v3, v4

    mul-float p2, p2, v4

    const/4 v5, 0x0

    :goto_1
    if-ge v1, v0, :cond_4

    .line 60
    aget v6, p0, v1

    .line 61
    aget v7, p1, v1

    int-to-float v7, v7

    mul-float v7, v7, v4

    int-to-float v6, v6

    cmpl-float v8, v6, v7

    if-lez v8, :cond_2

    sub-float/2addr v6, v7

    goto :goto_2

    :cond_2
    sub-float v6, v7, v6

    :goto_2
    cmpl-float v7, v6, p2

    if-lez v7, :cond_3

    return v2

    :cond_3
    add-float/2addr v5, v6

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_4
    div-float/2addr v5, v3

    return v5
.end method

.method public static a(Le/f/e/c;Ljava/util/Map;Z)Le/f/e/s/e/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/e/c;",
            "Ljava/util/Map<",
            "Le/f/e/d;",
            "*>;Z)",
            "Le/f/e/s/e/b;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/NotFoundException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Le/f/e/c;->a()Le/f/e/o/b;

    move-result-object p0

    .line 2
    invoke-static {p2, p0}, Le/f/e/s/e/a;->a(ZLe/f/e/o/b;)Ljava/util/List;

    move-result-object p1

    .line 3
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {p0}, Le/f/e/o/b;->clone()Le/f/e/o/b;

    move-result-object p0

    .line 5
    invoke-virtual {p0}, Le/f/e/o/b;->g()V

    .line 6
    invoke-static {p2, p0}, Le/f/e/s/e/a;->a(ZLe/f/e/o/b;)Ljava/util/List;

    move-result-object p1

    .line 7
    :cond_0
    new-instance p2, Le/f/e/s/e/b;

    invoke-direct {p2, p0, p1}, Le/f/e/s/e/b;-><init>(Le/f/e/o/b;Ljava/util/List;)V

    return-object p2
.end method

.method public static a(ZLe/f/e/o/b;)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Le/f/e/o/b;",
            ")",
            "Ljava/util/List<",
            "[",
            "Le/f/e/l;",
            ">;"
        }
    .end annotation

    .line 8
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    const/4 v4, 0x0

    const/4 v5, 0x0

    .line 9
    :goto_1
    invoke-virtual {p1}, Le/f/e/o/b;->d()I

    move-result v6

    if-ge v3, v6, :cond_5

    .line 10
    invoke-static {p1, v3, v4}, Le/f/e/s/e/a;->a(Le/f/e/o/b;II)[Le/f/e/l;

    move-result-object v4

    .line 11
    aget-object v6, v4, v2

    if-nez v6, :cond_3

    const/4 v6, 0x3

    aget-object v7, v4, v6

    if-nez v7, :cond_3

    if-eqz v5, :cond_5

    .line 12
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, [Le/f/e/l;

    .line 13
    aget-object v7, v5, v1

    if-eqz v7, :cond_1

    int-to-float v3, v3

    .line 14
    aget-object v7, v5, v1

    invoke-virtual {v7}, Le/f/e/l;->b()F

    move-result v7

    invoke-static {v3, v7}, Ljava/lang/Math;->max(FF)F

    move-result v3

    float-to-int v3, v3

    .line 15
    :cond_1
    aget-object v7, v5, v6

    if-eqz v7, :cond_0

    .line 16
    aget-object v5, v5, v6

    invoke-virtual {v5}, Le/f/e/l;->b()F

    move-result v5

    float-to-int v5, v5

    invoke-static {v3, v5}, Ljava/lang/Math;->max(II)I

    move-result v3

    goto :goto_2

    :cond_2
    add-int/lit8 v3, v3, 0x5

    goto :goto_0

    .line 17
    :cond_3
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-eqz p0, :cond_5

    const/4 v3, 0x2

    .line 18
    aget-object v5, v4, v3

    if-eqz v5, :cond_4

    .line 19
    aget-object v5, v4, v3

    invoke-virtual {v5}, Le/f/e/l;->a()F

    move-result v5

    float-to-int v5, v5

    .line 20
    aget-object v3, v4, v3

    invoke-virtual {v3}, Le/f/e/l;->b()F

    move-result v3

    goto :goto_3

    :cond_4
    const/4 v3, 0x4

    .line 21
    aget-object v5, v4, v3

    invoke-virtual {v5}, Le/f/e/l;->a()F

    move-result v5

    float-to-int v5, v5

    .line 22
    aget-object v3, v4, v3

    invoke-virtual {v3}, Le/f/e/l;->b()F

    move-result v3

    :goto_3
    float-to-int v3, v3

    move v4, v5

    const/4 v5, 0x1

    goto :goto_1

    :cond_5
    return-object v0
.end method

.method public static a([Le/f/e/l;[Le/f/e/l;[I)V
    .locals 3

    const/4 v0, 0x0

    .line 30
    :goto_0
    array-length v1, p2

    if-ge v0, v1, :cond_0

    .line 31
    aget v1, p2, v0

    aget-object v2, p1, v0

    aput-object v2, p0, v1

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static a(Le/f/e/o/b;IIIZ[I[I)[I
    .locals 9

    .line 45
    array-length v0, p6

    const/4 v1, 0x0

    invoke-static {p6, v1, v0, v1}, Ljava/util/Arrays;->fill([IIII)V

    const/4 v0, 0x0

    .line 46
    :goto_0
    invoke-virtual {p0, p1, p2}, Le/f/e/o/b;->b(II)Z

    move-result v2

    if-eqz v2, :cond_0

    if-lez p1, :cond_0

    add-int/lit8 v2, v0, 0x1

    const/4 v3, 0x3

    if-ge v0, v3, :cond_0

    add-int/lit8 p1, p1, -0x1

    move v0, v2

    goto :goto_0

    .line 47
    :cond_0
    array-length v0, p5

    move v2, p4

    const/4 v3, 0x0

    move p4, p1

    :goto_1
    const v4, 0x3ed70a3d    # 0.42f

    const v5, 0x3f4ccccd    # 0.8f

    const/4 v6, 0x2

    const/4 v7, 0x1

    if-ge p1, p3, :cond_4

    .line 48
    invoke-virtual {p0, p1, p2}, Le/f/e/o/b;->b(II)Z

    move-result v8

    xor-int/2addr v8, v2

    if-eqz v8, :cond_1

    .line 49
    aget v4, p6, v3

    add-int/2addr v4, v7

    aput v4, p6, v3

    goto :goto_3

    :cond_1
    add-int/lit8 v8, v0, -0x1

    if-ne v3, v8, :cond_3

    .line 50
    invoke-static {p6, p5, v5}, Le/f/e/s/e/a;->a([I[IF)F

    move-result v5

    cmpg-float v4, v5, v4

    if-gez v4, :cond_2

    new-array p0, v6, [I

    aput p4, p0, v1

    aput p1, p0, v7

    return-object p0

    .line 51
    :cond_2
    aget v4, p6, v1

    aget v5, p6, v7

    add-int/2addr v4, v5

    add-int/2addr p4, v4

    add-int/lit8 v4, v0, -0x2

    .line 52
    invoke-static {p6, v6, p6, v1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 53
    aput v1, p6, v4

    .line 54
    aput v1, p6, v8

    add-int/lit8 v3, v3, -0x1

    goto :goto_2

    :cond_3
    add-int/lit8 v3, v3, 0x1

    .line 55
    :goto_2
    aput v7, p6, v3

    xor-int/lit8 v2, v2, 0x1

    :goto_3
    add-int/lit8 p1, p1, 0x1

    goto :goto_1

    :cond_4
    sub-int/2addr v0, v7

    if-ne v3, v0, :cond_5

    .line 56
    invoke-static {p6, p5, v5}, Le/f/e/s/e/a;->a([I[IF)F

    move-result p0

    cmpg-float p0, p0, v4

    if-gez p0, :cond_5

    new-array p0, v6, [I

    aput p4, p0, v1

    sub-int/2addr p1, v7

    aput p1, p0, v7

    return-object p0

    :cond_5
    const/4 p0, 0x0

    return-object p0
.end method

.method public static a(Le/f/e/o/b;II)[Le/f/e/l;
    .locals 9

    .line 23
    invoke-virtual {p0}, Le/f/e/o/b;->d()I

    move-result v6

    .line 24
    invoke-virtual {p0}, Le/f/e/o/b;->f()I

    move-result v7

    const/16 v0, 0x8

    new-array v8, v0, [Le/f/e/l;

    .line 25
    sget-object v5, Le/f/e/s/e/a;->c:[I

    move-object v0, p0

    move v1, v6

    move v2, v7

    move v3, p1

    move v4, p2

    invoke-static/range {v0 .. v5}, Le/f/e/s/e/a;->a(Le/f/e/o/b;IIII[I)[Le/f/e/l;

    move-result-object v0

    sget-object v1, Le/f/e/s/e/a;->a:[I

    invoke-static {v8, v0, v1}, Le/f/e/s/e/a;->a([Le/f/e/l;[Le/f/e/l;[I)V

    const/4 v0, 0x4

    .line 26
    aget-object v1, v8, v0

    if-eqz v1, :cond_0

    .line 27
    aget-object p1, v8, v0

    invoke-virtual {p1}, Le/f/e/l;->a()F

    move-result p1

    float-to-int p2, p1

    .line 28
    aget-object p1, v8, v0

    invoke-virtual {p1}, Le/f/e/l;->b()F

    move-result p1

    float-to-int p1, p1

    :cond_0
    move v3, p1

    move v4, p2

    .line 29
    sget-object v5, Le/f/e/s/e/a;->d:[I

    move-object v0, p0

    move v1, v6

    move v2, v7

    invoke-static/range {v0 .. v5}, Le/f/e/s/e/a;->a(Le/f/e/o/b;IIII[I)[Le/f/e/l;

    move-result-object p0

    sget-object p1, Le/f/e/s/e/a;->b:[I

    invoke-static {v8, p0, p1}, Le/f/e/s/e/a;->a([Le/f/e/l;[Le/f/e/l;[I)V

    return-object v8
.end method

.method public static a(Le/f/e/o/b;IIII[I)[Le/f/e/l;
    .locals 19

    move/from16 v0, p1

    const/4 v1, 0x4

    new-array v2, v1, [Le/f/e/l;

    move-object/from16 v10, p5

    .line 32
    array-length v3, v10

    new-array v11, v3, [I

    move/from16 v12, p3

    :goto_0
    const/4 v13, 0x0

    const/4 v14, 0x1

    if-ge v12, v0, :cond_3

    const/4 v7, 0x0

    move-object/from16 v3, p0

    move/from16 v4, p4

    move v5, v12

    move/from16 v6, p2

    move-object/from16 v8, p5

    move-object v9, v11

    .line 33
    invoke-static/range {v3 .. v9}, Le/f/e/s/e/a;->a(Le/f/e/o/b;IIIZ[I[I)[I

    move-result-object v3

    if-eqz v3, :cond_2

    move/from16 v18, v12

    move-object v12, v3

    move/from16 v3, v18

    :goto_1
    if-lez v3, :cond_1

    add-int/lit8 v15, v3, -0x1

    const/4 v7, 0x0

    move-object/from16 v3, p0

    move/from16 v4, p4

    move v5, v15

    move/from16 v6, p2

    move-object/from16 v8, p5

    move-object v9, v11

    .line 34
    invoke-static/range {v3 .. v9}, Le/f/e/s/e/a;->a(Le/f/e/o/b;IIIZ[I[I)[I

    move-result-object v3

    if-eqz v3, :cond_0

    move-object v12, v3

    move v3, v15

    goto :goto_1

    :cond_0
    add-int/2addr v15, v14

    goto :goto_2

    :cond_1
    move v15, v3

    .line 35
    :goto_2
    new-instance v3, Le/f/e/l;

    aget v4, v12, v13

    int-to-float v4, v4

    int-to-float v5, v15

    invoke-direct {v3, v4, v5}, Le/f/e/l;-><init>(FF)V

    aput-object v3, v2, v13

    .line 36
    new-instance v3, Le/f/e/l;

    aget v4, v12, v14

    int-to-float v4, v4

    invoke-direct {v3, v4, v5}, Le/f/e/l;-><init>(FF)V

    aput-object v3, v2, v14

    move v12, v15

    const/4 v3, 0x1

    goto :goto_3

    :cond_2
    add-int/lit8 v12, v12, 0x5

    goto :goto_0

    :cond_3
    const/4 v3, 0x0

    :goto_3
    add-int/lit8 v4, v12, 0x1

    if-eqz v3, :cond_7

    const/4 v15, 0x2

    new-array v3, v15, [I

    .line 37
    aget-object v5, v2, v13

    invoke-virtual {v5}, Le/f/e/l;->a()F

    move-result v5

    float-to-int v5, v5

    aput v5, v3, v13

    aget-object v5, v2, v14

    invoke-virtual {v5}, Le/f/e/l;->a()F

    move-result v5

    float-to-int v5, v5

    aput v5, v3, v14

    move-object/from16 v16, v3

    move v9, v4

    const/4 v8, 0x0

    :goto_4
    if-ge v9, v0, :cond_5

    .line 38
    aget v4, v16, v13

    const/4 v7, 0x0

    move-object/from16 v3, p0

    move v5, v9

    move/from16 v6, p2

    move v1, v8

    move-object/from16 v8, p5

    move/from16 v17, v9

    move-object v9, v11

    invoke-static/range {v3 .. v9}, Le/f/e/s/e/a;->a(Le/f/e/o/b;IIIZ[I[I)[I

    move-result-object v3

    if-eqz v3, :cond_4

    .line 39
    aget v4, v16, v13

    aget v5, v3, v13

    sub-int/2addr v4, v5

    .line 40
    invoke-static {v4}, Ljava/lang/Math;->abs(I)I

    move-result v4

    const/4 v5, 0x5

    if-ge v4, v5, :cond_4

    aget v4, v16, v14

    aget v6, v3, v14

    sub-int/2addr v4, v6

    .line 41
    invoke-static {v4}, Ljava/lang/Math;->abs(I)I

    move-result v4

    if-ge v4, v5, :cond_4

    move-object/from16 v16, v3

    const/4 v8, 0x0

    goto :goto_5

    :cond_4
    const/16 v3, 0x19

    if-gt v1, v3, :cond_6

    add-int/lit8 v8, v1, 0x1

    :goto_5
    add-int/lit8 v9, v17, 0x1

    const/4 v1, 0x4

    goto :goto_4

    :cond_5
    move v1, v8

    move/from16 v17, v9

    :cond_6
    add-int/lit8 v8, v1, 0x1

    sub-int v4, v17, v8

    .line 42
    new-instance v0, Le/f/e/l;

    aget v1, v16, v13

    int-to-float v1, v1

    int-to-float v3, v4

    invoke-direct {v0, v1, v3}, Le/f/e/l;-><init>(FF)V

    aput-object v0, v2, v15

    const/4 v0, 0x3

    .line 43
    new-instance v1, Le/f/e/l;

    aget v5, v16, v14

    int-to-float v5, v5

    invoke-direct {v1, v5, v3}, Le/f/e/l;-><init>(FF)V

    aput-object v1, v2, v0

    :cond_7
    sub-int/2addr v4, v12

    const/16 v0, 0xa

    if-ge v4, v0, :cond_8

    const/4 v0, 0x4

    :goto_6
    if-ge v13, v0, :cond_8

    const/4 v1, 0x0

    .line 44
    aput-object v1, v2, v13

    add-int/lit8 v13, v13, 0x1

    goto :goto_6

    :cond_8
    return-object v2
.end method
