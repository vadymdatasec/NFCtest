.class public Le/f/e/t/c/h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Le/f/e/o/b;

.field public final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Le/f/e/t/c/d;",
            ">;"
        }
    .end annotation
.end field

.field public c:Z

.field public final d:[I

.field public final e:Le/f/e/m;


# direct methods
.method public constructor <init>(Le/f/e/o/b;Le/f/e/m;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/f/e/t/c/h;->a:Le/f/e/o/b;

    .line 3
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Le/f/e/t/c/h;->b:Ljava/util/List;

    const/4 p1, 0x5

    new-array p1, p1, [I

    .line 4
    iput-object p1, p0, Le/f/e/t/c/h;->d:[I

    .line 5
    iput-object p2, p0, Le/f/e/t/c/h;->e:Le/f/e/m;

    return-void
.end method

.method public static a([II)F
    .locals 1

    const/4 v0, 0x4

    .line 31
    aget v0, p0, v0

    sub-int/2addr p1, v0

    const/4 v0, 0x3

    aget v0, p0, v0

    sub-int/2addr p1, v0

    int-to-float p1, p1

    const/4 v0, 0x2

    aget p0, p0, v0

    int-to-float p0, p0

    const/high16 v0, 0x40000000    # 2.0f

    div-float/2addr p0, v0

    sub-float/2addr p1, p0

    return p1
.end method

.method public static a([I)Z
    .locals 7

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    const/4 v3, 0x5

    if-ge v1, v3, :cond_1

    .line 32
    aget v3, p0, v1

    if-nez v3, :cond_0

    return v0

    :cond_0
    add-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x7

    if-ge v2, v1, :cond_2

    return v0

    :cond_2
    int-to-float v1, v2

    const/high16 v2, 0x40e00000    # 7.0f

    div-float/2addr v1, v2

    const/high16 v2, 0x40000000    # 2.0f

    div-float v2, v1, v2

    .line 33
    aget v3, p0, v0

    int-to-float v3, v3

    sub-float v3, v1, v3

    .line 34
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v3

    cmpg-float v3, v3, v2

    if-gez v3, :cond_3

    const/4 v3, 0x1

    aget v4, p0, v3

    int-to-float v4, v4

    sub-float v4, v1, v4

    .line 35
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    move-result v4

    cmpg-float v4, v4, v2

    if-gez v4, :cond_3

    const/high16 v4, 0x40400000    # 3.0f

    mul-float v5, v1, v4

    const/4 v6, 0x2

    aget v6, p0, v6

    int-to-float v6, v6

    sub-float/2addr v5, v6

    .line 36
    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    move-result v5

    mul-float v4, v4, v2

    cmpg-float v4, v5, v4

    if-gez v4, :cond_3

    const/4 v4, 0x3

    aget v4, p0, v4

    int-to-float v4, v4

    sub-float v4, v1, v4

    .line 37
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    move-result v4

    cmpg-float v4, v4, v2

    if-gez v4, :cond_3

    const/4 v4, 0x4

    aget p0, p0, v4

    int-to-float p0, p0

    sub-float/2addr v1, p0

    .line 38
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result p0

    cmpg-float p0, p0, v2

    if-gez p0, :cond_3

    return v3

    :cond_3
    return v0
.end method


# virtual methods
.method public final a()I
    .locals 7

    .line 76
    iget-object v0, p0, Le/f/e/t/c/h;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-gt v0, v2, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    .line 77
    iget-object v3, p0, Le/f/e/t/c/h;->b:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Le/f/e/t/c/d;

    .line 78
    invoke-virtual {v4}, Le/f/e/t/c/d;->c()I

    move-result v5

    const/4 v6, 0x2

    if-lt v5, v6, :cond_1

    if-nez v0, :cond_2

    move-object v0, v4

    goto :goto_0

    .line 79
    :cond_2
    iput-boolean v2, p0, Le/f/e/t/c/h;->c:Z

    .line 80
    invoke-virtual {v0}, Le/f/e/l;->a()F

    move-result v1

    invoke-virtual {v4}, Le/f/e/l;->a()F

    move-result v2

    sub-float/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    .line 81
    invoke-virtual {v0}, Le/f/e/l;->b()F

    move-result v0

    invoke-virtual {v4}, Le/f/e/l;->b()F

    move-result v2

    sub-float/2addr v0, v2

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    sub-float/2addr v1, v0

    float-to-int v0, v1

    div-int/2addr v0, v6

    return v0

    :cond_3
    return v1
.end method

.method public final a(Ljava/util/Map;)Le/f/e/t/c/i;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Le/f/e/d;",
            "*>;)",
            "Le/f/e/t/c/i;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/NotFoundException;
        }
    .end annotation

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    .line 1
    sget-object v2, Le/f/e/d;->e:Le/f/e/d;

    invoke-interface {p1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-eqz p1, :cond_1

    .line 2
    sget-object v3, Le/f/e/d;->c:Le/f/e/d;

    invoke-interface {p1, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    .line 3
    :goto_1
    iget-object v3, p0, Le/f/e/t/c/h;->a:Le/f/e/o/b;

    invoke-virtual {v3}, Le/f/e/o/b;->d()I

    move-result v3

    .line 4
    iget-object v4, p0, Le/f/e/t/c/h;->a:Le/f/e/o/b;

    invoke-virtual {v4}, Le/f/e/o/b;->f()I

    move-result v4

    mul-int/lit8 v5, v3, 0x3

    .line 5
    div-int/lit16 v5, v5, 0xe4

    const/4 v6, 0x3

    if-lt v5, v6, :cond_2

    if-eqz v2, :cond_3

    :cond_2
    const/4 v5, 0x3

    :cond_3
    const/4 v2, 0x5

    new-array v2, v2, [I

    add-int/lit8 v7, v5, -0x1

    const/4 v8, 0x0

    :goto_2
    if-ge v7, v3, :cond_e

    if-nez v8, :cond_e

    aput v1, v2, v1

    aput v1, v2, v0

    const/4 v9, 0x2

    aput v1, v2, v9

    aput v1, v2, v6

    const/4 v10, 0x4

    aput v1, v2, v10

    const/4 v11, 0x0

    const/4 v12, 0x0

    :goto_3
    if-ge v11, v4, :cond_c

    .line 6
    iget-object v13, p0, Le/f/e/t/c/h;->a:Le/f/e/o/b;

    invoke-virtual {v13, v11, v7}, Le/f/e/o/b;->b(II)Z

    move-result v13

    if-eqz v13, :cond_5

    and-int/lit8 v13, v12, 0x1

    if-ne v13, v0, :cond_4

    add-int/lit8 v12, v12, 0x1

    .line 7
    :cond_4
    aget v13, v2, v12

    add-int/2addr v13, v0

    aput v13, v2, v12

    goto :goto_6

    :cond_5
    and-int/lit8 v13, v12, 0x1

    if-nez v13, :cond_b

    if-ne v12, v10, :cond_a

    .line 8
    invoke-static {v2}, Le/f/e/t/c/h;->a([I)Z

    move-result v12

    if-eqz v12, :cond_9

    .line 9
    invoke-virtual {p0, v2, v7, v11, p1}, Le/f/e/t/c/h;->a([IIIZ)Z

    move-result v12

    if-eqz v12, :cond_8

    .line 10
    iget-boolean v5, p0, Le/f/e/t/c/h;->c:Z

    if-eqz v5, :cond_6

    .line 11
    invoke-virtual {p0}, Le/f/e/t/c/h;->c()Z

    move-result v8

    goto :goto_4

    .line 12
    :cond_6
    invoke-virtual {p0}, Le/f/e/t/c/h;->a()I

    move-result v5

    .line 13
    aget v12, v2, v9

    if-le v5, v12, :cond_7

    .line 14
    aget v11, v2, v9

    sub-int/2addr v5, v11

    sub-int/2addr v5, v9

    add-int/2addr v7, v5

    add-int/lit8 v11, v4, -0x1

    :cond_7
    :goto_4
    aput v1, v2, v1

    aput v1, v2, v0

    aput v1, v2, v9

    aput v1, v2, v6

    aput v1, v2, v10

    const/4 v5, 0x2

    const/4 v12, 0x0

    goto :goto_6

    .line 15
    :cond_8
    aget v12, v2, v9

    aput v12, v2, v1

    .line 16
    aget v12, v2, v6

    aput v12, v2, v0

    .line 17
    aget v12, v2, v10

    aput v12, v2, v9

    aput v0, v2, v6

    aput v1, v2, v10

    goto :goto_5

    .line 18
    :cond_9
    aget v12, v2, v9

    aput v12, v2, v1

    .line 19
    aget v12, v2, v6

    aput v12, v2, v0

    .line 20
    aget v12, v2, v10

    aput v12, v2, v9

    aput v0, v2, v6

    aput v1, v2, v10

    :goto_5
    const/4 v12, 0x3

    goto :goto_6

    :cond_a
    add-int/lit8 v12, v12, 0x1

    .line 21
    aget v13, v2, v12

    add-int/2addr v13, v0

    aput v13, v2, v12

    goto :goto_6

    .line 22
    :cond_b
    aget v13, v2, v12

    add-int/2addr v13, v0

    aput v13, v2, v12

    :goto_6
    add-int/2addr v11, v0

    goto :goto_3

    .line 23
    :cond_c
    invoke-static {v2}, Le/f/e/t/c/h;->a([I)Z

    move-result v9

    if-eqz v9, :cond_d

    .line 24
    invoke-virtual {p0, v2, v7, v4, p1}, Le/f/e/t/c/h;->a([IIIZ)Z

    move-result v9

    if-eqz v9, :cond_d

    .line 25
    aget v5, v2, v1

    .line 26
    iget-boolean v9, p0, Le/f/e/t/c/h;->c:Z

    if-eqz v9, :cond_d

    .line 27
    invoke-virtual {p0}, Le/f/e/t/c/h;->c()Z

    move-result v8

    :cond_d
    add-int/2addr v7, v5

    goto/16 :goto_2

    .line 28
    :cond_e
    invoke-virtual {p0}, Le/f/e/t/c/h;->d()[Le/f/e/t/c/d;

    move-result-object p1

    .line 29
    invoke-static {p1}, Le/f/e/l;->a([Le/f/e/l;)V

    .line 30
    new-instance v0, Le/f/e/t/c/i;

    invoke-direct {v0, p1}, Le/f/e/t/c/i;-><init>([Le/f/e/t/c/d;)V

    return-object v0
.end method

.method public final a(IIII)Z
    .locals 16

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p3

    .line 39
    invoke-virtual/range {p0 .. p0}, Le/f/e/t/c/h;->b()[I

    move-result-object v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    :goto_0
    const/4 v7, 0x2

    const/4 v8, 0x1

    if-lt v1, v6, :cond_0

    if-lt v2, v6, :cond_0

    .line 40
    iget-object v9, v0, Le/f/e/t/c/h;->a:Le/f/e/o/b;

    sub-int v10, v2, v6

    sub-int v11, v1, v6

    invoke-virtual {v9, v10, v11}, Le/f/e/o/b;->b(II)Z

    move-result v9

    if-eqz v9, :cond_0

    .line 41
    aget v9, v4, v7

    add-int/2addr v9, v8

    aput v9, v4, v7

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_0
    if-lt v1, v6, :cond_c

    if-ge v2, v6, :cond_1

    goto/16 :goto_6

    :cond_1
    :goto_1
    if-lt v1, v6, :cond_2

    if-lt v2, v6, :cond_2

    .line 42
    iget-object v9, v0, Le/f/e/t/c/h;->a:Le/f/e/o/b;

    sub-int v10, v2, v6

    sub-int v11, v1, v6

    invoke-virtual {v9, v10, v11}, Le/f/e/o/b;->b(II)Z

    move-result v9

    if-nez v9, :cond_2

    aget v9, v4, v8

    if-gt v9, v3, :cond_2

    .line 43
    aget v9, v4, v8

    add-int/2addr v9, v8

    aput v9, v4, v8

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_2
    if-lt v1, v6, :cond_c

    if-lt v2, v6, :cond_c

    .line 44
    aget v9, v4, v8

    if-le v9, v3, :cond_3

    goto/16 :goto_6

    :cond_3
    :goto_2
    if-lt v1, v6, :cond_4

    if-lt v2, v6, :cond_4

    .line 45
    iget-object v9, v0, Le/f/e/t/c/h;->a:Le/f/e/o/b;

    sub-int v10, v2, v6

    sub-int v11, v1, v6

    invoke-virtual {v9, v10, v11}, Le/f/e/o/b;->b(II)Z

    move-result v9

    if-eqz v9, :cond_4

    aget v9, v4, v5

    if-gt v9, v3, :cond_4

    .line 46
    aget v9, v4, v5

    add-int/2addr v9, v8

    aput v9, v4, v5

    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    .line 47
    :cond_4
    aget v6, v4, v5

    if-le v6, v3, :cond_5

    return v5

    .line 48
    :cond_5
    iget-object v6, v0, Le/f/e/t/c/h;->a:Le/f/e/o/b;

    invoke-virtual {v6}, Le/f/e/o/b;->d()I

    move-result v6

    .line 49
    iget-object v9, v0, Le/f/e/t/c/h;->a:Le/f/e/o/b;

    invoke-virtual {v9}, Le/f/e/o/b;->f()I

    move-result v9

    const/4 v10, 0x1

    :goto_3
    add-int v11, v1, v10

    if-ge v11, v6, :cond_6

    add-int v12, v2, v10

    if-ge v12, v9, :cond_6

    .line 50
    iget-object v13, v0, Le/f/e/t/c/h;->a:Le/f/e/o/b;

    invoke-virtual {v13, v12, v11}, Le/f/e/o/b;->b(II)Z

    move-result v12

    if-eqz v12, :cond_6

    .line 51
    aget v11, v4, v7

    add-int/2addr v11, v8

    aput v11, v4, v7

    add-int/lit8 v10, v10, 0x1

    goto :goto_3

    :cond_6
    if-ge v11, v6, :cond_c

    add-int v11, v2, v10

    if-lt v11, v9, :cond_7

    goto/16 :goto_6

    :cond_7
    :goto_4
    add-int v11, v1, v10

    const/4 v12, 0x3

    if-ge v11, v6, :cond_8

    add-int v13, v2, v10

    if-ge v13, v9, :cond_8

    .line 52
    iget-object v14, v0, Le/f/e/t/c/h;->a:Le/f/e/o/b;

    invoke-virtual {v14, v13, v11}, Le/f/e/o/b;->b(II)Z

    move-result v13

    if-nez v13, :cond_8

    aget v13, v4, v12

    if-ge v13, v3, :cond_8

    .line 53
    aget v11, v4, v12

    add-int/2addr v11, v8

    aput v11, v4, v12

    add-int/lit8 v10, v10, 0x1

    goto :goto_4

    :cond_8
    if-ge v11, v6, :cond_c

    add-int v11, v2, v10

    if-ge v11, v9, :cond_c

    .line 54
    aget v11, v4, v12

    if-lt v11, v3, :cond_9

    goto :goto_6

    :cond_9
    :goto_5
    add-int v11, v1, v10

    const/4 v13, 0x4

    if-ge v11, v6, :cond_a

    add-int v14, v2, v10

    if-ge v14, v9, :cond_a

    .line 55
    iget-object v15, v0, Le/f/e/t/c/h;->a:Le/f/e/o/b;

    invoke-virtual {v15, v14, v11}, Le/f/e/o/b;->b(II)Z

    move-result v11

    if-eqz v11, :cond_a

    aget v11, v4, v13

    if-ge v11, v3, :cond_a

    .line 56
    aget v11, v4, v13

    add-int/2addr v11, v8

    aput v11, v4, v13

    add-int/lit8 v10, v10, 0x1

    goto :goto_5

    .line 57
    :cond_a
    aget v1, v4, v13

    if-lt v1, v3, :cond_b

    return v5

    .line 58
    :cond_b
    aget v1, v4, v5

    aget v2, v4, v8

    add-int/2addr v1, v2

    aget v2, v4, v7

    add-int/2addr v1, v2

    aget v2, v4, v12

    add-int/2addr v1, v2

    aget v2, v4, v13

    add-int/2addr v1, v2

    sub-int v1, v1, p4

    .line 59
    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v1

    mul-int/lit8 v2, p4, 0x2

    if-ge v1, v2, :cond_c

    .line 60
    invoke-static {v4}, Le/f/e/t/c/h;->a([I)Z

    move-result v1

    if-eqz v1, :cond_c

    return v8

    :cond_c
    :goto_6
    return v5
.end method

.method public final a([IIIZ)Z
    .locals 6

    const/4 v0, 0x0

    .line 61
    aget v1, p1, v0

    const/4 v2, 0x1

    aget v3, p1, v2

    add-int/2addr v1, v3

    const/4 v3, 0x2

    aget v4, p1, v3

    add-int/2addr v1, v4

    const/4 v4, 0x3

    aget v4, p1, v4

    add-int/2addr v1, v4

    const/4 v4, 0x4

    aget v4, p1, v4

    add-int/2addr v1, v4

    .line 62
    invoke-static {p1, p3}, Le/f/e/t/c/h;->a([II)F

    move-result p3

    float-to-int p3, p3

    .line 63
    aget v4, p1, v3

    invoke-virtual {p0, p2, p3, v4, v1}, Le/f/e/t/c/h;->c(IIII)F

    move-result p2

    .line 64
    invoke-static {p2}, Ljava/lang/Float;->isNaN(F)Z

    move-result v4

    if-nez v4, :cond_4

    float-to-int v4, p2

    .line 65
    aget v5, p1, v3

    invoke-virtual {p0, p3, v4, v5, v1}, Le/f/e/t/c/h;->b(IIII)F

    move-result p3

    .line 66
    invoke-static {p3}, Ljava/lang/Float;->isNaN(F)Z

    move-result v5

    if-nez v5, :cond_4

    if-eqz p4, :cond_0

    float-to-int p4, p3

    aget p1, p1, v3

    .line 67
    invoke-virtual {p0, v4, p4, p1, v1}, Le/f/e/t/c/h;->a(IIII)Z

    move-result p1

    if-eqz p1, :cond_4

    :cond_0
    int-to-float p1, v1

    const/high16 p4, 0x40e00000    # 7.0f

    div-float/2addr p1, p4

    const/4 p4, 0x0

    .line 68
    :goto_0
    iget-object v1, p0, Le/f/e/t/c/h;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge p4, v1, :cond_2

    .line 69
    iget-object v1, p0, Le/f/e/t/c/h;->b:Ljava/util/List;

    invoke-interface {v1, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le/f/e/t/c/d;

    .line 70
    invoke-virtual {v1, p1, p2, p3}, Le/f/e/t/c/d;->a(FFF)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 71
    iget-object v0, p0, Le/f/e/t/c/h;->b:Ljava/util/List;

    invoke-virtual {v1, p2, p3, p1}, Le/f/e/t/c/d;->b(FFF)Le/f/e/t/c/d;

    move-result-object v1

    invoke-interface {v0, p4, v1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    add-int/lit8 p4, p4, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    if-nez v0, :cond_3

    .line 72
    new-instance p4, Le/f/e/t/c/d;

    invoke-direct {p4, p3, p2, p1}, Le/f/e/t/c/d;-><init>(FFF)V

    .line 73
    iget-object p1, p0, Le/f/e/t/c/h;->b:Ljava/util/List;

    invoke-interface {p1, p4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 74
    iget-object p1, p0, Le/f/e/t/c/h;->e:Le/f/e/m;

    if-eqz p1, :cond_3

    .line 75
    invoke-interface {p1, p4}, Le/f/e/m;->a(Le/f/e/l;)V

    :cond_3
    return v2

    :cond_4
    return v0
.end method

.method public final b(IIII)F
    .locals 10

    .line 6
    iget-object v0, p0, Le/f/e/t/c/h;->a:Le/f/e/o/b;

    .line 7
    invoke-virtual {v0}, Le/f/e/o/b;->f()I

    move-result v1

    .line 8
    invoke-virtual {p0}, Le/f/e/t/c/h;->b()[I

    move-result-object v2

    move v3, p1

    :goto_0
    const/4 v4, 0x2

    const/4 v5, 0x1

    if-ltz v3, :cond_0

    .line 9
    invoke-virtual {v0, v3, p2}, Le/f/e/o/b;->b(II)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 10
    aget v6, v2, v4

    add-int/2addr v6, v5

    aput v6, v2, v4

    add-int/lit8 v3, v3, -0x1

    goto :goto_0

    :cond_0
    const/high16 v6, 0x7fc00000    # Float.NaN

    if-gez v3, :cond_1

    return v6

    :cond_1
    :goto_1
    if-ltz v3, :cond_2

    .line 11
    invoke-virtual {v0, v3, p2}, Le/f/e/o/b;->b(II)Z

    move-result v7

    if-nez v7, :cond_2

    aget v7, v2, v5

    if-gt v7, p3, :cond_2

    .line 12
    aget v7, v2, v5

    add-int/2addr v7, v5

    aput v7, v2, v5

    add-int/lit8 v3, v3, -0x1

    goto :goto_1

    :cond_2
    if-ltz v3, :cond_d

    .line 13
    aget v7, v2, v5

    if-le v7, p3, :cond_3

    goto/16 :goto_6

    :cond_3
    :goto_2
    const/4 v7, 0x0

    if-ltz v3, :cond_4

    .line 14
    invoke-virtual {v0, v3, p2}, Le/f/e/o/b;->b(II)Z

    move-result v8

    if-eqz v8, :cond_4

    aget v8, v2, v7

    if-gt v8, p3, :cond_4

    .line 15
    aget v8, v2, v7

    add-int/2addr v8, v5

    aput v8, v2, v7

    add-int/lit8 v3, v3, -0x1

    goto :goto_2

    .line 16
    :cond_4
    aget v3, v2, v7

    if-le v3, p3, :cond_5

    return v6

    :cond_5
    add-int/2addr p1, v5

    :goto_3
    if-ge p1, v1, :cond_6

    .line 17
    invoke-virtual {v0, p1, p2}, Le/f/e/o/b;->b(II)Z

    move-result v3

    if-eqz v3, :cond_6

    .line 18
    aget v3, v2, v4

    add-int/2addr v3, v5

    aput v3, v2, v4

    add-int/lit8 p1, p1, 0x1

    goto :goto_3

    :cond_6
    if-ne p1, v1, :cond_7

    return v6

    :cond_7
    :goto_4
    const/4 v3, 0x3

    if-ge p1, v1, :cond_8

    .line 19
    invoke-virtual {v0, p1, p2}, Le/f/e/o/b;->b(II)Z

    move-result v8

    if-nez v8, :cond_8

    aget v8, v2, v3

    if-ge v8, p3, :cond_8

    .line 20
    aget v8, v2, v3

    add-int/2addr v8, v5

    aput v8, v2, v3

    add-int/lit8 p1, p1, 0x1

    goto :goto_4

    :cond_8
    if-eq p1, v1, :cond_d

    .line 21
    aget v8, v2, v3

    if-lt v8, p3, :cond_9

    goto :goto_6

    :cond_9
    :goto_5
    const/4 v8, 0x4

    if-ge p1, v1, :cond_a

    .line 22
    invoke-virtual {v0, p1, p2}, Le/f/e/o/b;->b(II)Z

    move-result v9

    if-eqz v9, :cond_a

    aget v9, v2, v8

    if-ge v9, p3, :cond_a

    .line 23
    aget v9, v2, v8

    add-int/2addr v9, v5

    aput v9, v2, v8

    add-int/lit8 p1, p1, 0x1

    goto :goto_5

    .line 24
    :cond_a
    aget p2, v2, v8

    if-lt p2, p3, :cond_b

    return v6

    .line 25
    :cond_b
    aget p2, v2, v7

    aget p3, v2, v5

    add-int/2addr p2, p3

    aget p3, v2, v4

    add-int/2addr p2, p3

    aget p3, v2, v3

    add-int/2addr p2, p3

    aget p3, v2, v8

    add-int/2addr p2, p3

    sub-int/2addr p2, p4

    .line 26
    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    move-result p2

    mul-int/lit8 p2, p2, 0x5

    if-lt p2, p4, :cond_c

    return v6

    .line 27
    :cond_c
    invoke-static {v2}, Le/f/e/t/c/h;->a([I)Z

    move-result p2

    if-eqz p2, :cond_d

    invoke-static {v2, p1}, Le/f/e/t/c/h;->a([II)F

    move-result p1

    return p1

    :cond_d
    :goto_6
    return v6
.end method

.method public final b()[I
    .locals 3

    .line 1
    iget-object v0, p0, Le/f/e/t/c/h;->d:[I

    const/4 v1, 0x0

    aput v1, v0, v1

    const/4 v2, 0x1

    .line 2
    aput v1, v0, v2

    const/4 v2, 0x2

    .line 3
    aput v1, v0, v2

    const/4 v2, 0x3

    .line 4
    aput v1, v0, v2

    const/4 v2, 0x4

    .line 5
    aput v1, v0, v2

    return-object v0
.end method

.method public final c(IIII)F
    .locals 10

    .line 1
    iget-object v0, p0, Le/f/e/t/c/h;->a:Le/f/e/o/b;

    .line 2
    invoke-virtual {v0}, Le/f/e/o/b;->d()I

    move-result v1

    .line 3
    invoke-virtual {p0}, Le/f/e/t/c/h;->b()[I

    move-result-object v2

    move v3, p1

    :goto_0
    const/4 v4, 0x2

    const/4 v5, 0x1

    if-ltz v3, :cond_0

    .line 4
    invoke-virtual {v0, p2, v3}, Le/f/e/o/b;->b(II)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 5
    aget v6, v2, v4

    add-int/2addr v6, v5

    aput v6, v2, v4

    add-int/lit8 v3, v3, -0x1

    goto :goto_0

    :cond_0
    const/high16 v6, 0x7fc00000    # Float.NaN

    if-gez v3, :cond_1

    return v6

    :cond_1
    :goto_1
    if-ltz v3, :cond_2

    .line 6
    invoke-virtual {v0, p2, v3}, Le/f/e/o/b;->b(II)Z

    move-result v7

    if-nez v7, :cond_2

    aget v7, v2, v5

    if-gt v7, p3, :cond_2

    .line 7
    aget v7, v2, v5

    add-int/2addr v7, v5

    aput v7, v2, v5

    add-int/lit8 v3, v3, -0x1

    goto :goto_1

    :cond_2
    if-ltz v3, :cond_d

    .line 8
    aget v7, v2, v5

    if-le v7, p3, :cond_3

    goto/16 :goto_6

    :cond_3
    :goto_2
    const/4 v7, 0x0

    if-ltz v3, :cond_4

    .line 9
    invoke-virtual {v0, p2, v3}, Le/f/e/o/b;->b(II)Z

    move-result v8

    if-eqz v8, :cond_4

    aget v8, v2, v7

    if-gt v8, p3, :cond_4

    .line 10
    aget v8, v2, v7

    add-int/2addr v8, v5

    aput v8, v2, v7

    add-int/lit8 v3, v3, -0x1

    goto :goto_2

    .line 11
    :cond_4
    aget v3, v2, v7

    if-le v3, p3, :cond_5

    return v6

    :cond_5
    add-int/2addr p1, v5

    :goto_3
    if-ge p1, v1, :cond_6

    .line 12
    invoke-virtual {v0, p2, p1}, Le/f/e/o/b;->b(II)Z

    move-result v3

    if-eqz v3, :cond_6

    .line 13
    aget v3, v2, v4

    add-int/2addr v3, v5

    aput v3, v2, v4

    add-int/lit8 p1, p1, 0x1

    goto :goto_3

    :cond_6
    if-ne p1, v1, :cond_7

    return v6

    :cond_7
    :goto_4
    const/4 v3, 0x3

    if-ge p1, v1, :cond_8

    .line 14
    invoke-virtual {v0, p2, p1}, Le/f/e/o/b;->b(II)Z

    move-result v8

    if-nez v8, :cond_8

    aget v8, v2, v3

    if-ge v8, p3, :cond_8

    .line 15
    aget v8, v2, v3

    add-int/2addr v8, v5

    aput v8, v2, v3

    add-int/lit8 p1, p1, 0x1

    goto :goto_4

    :cond_8
    if-eq p1, v1, :cond_d

    .line 16
    aget v8, v2, v3

    if-lt v8, p3, :cond_9

    goto :goto_6

    :cond_9
    :goto_5
    const/4 v8, 0x4

    if-ge p1, v1, :cond_a

    .line 17
    invoke-virtual {v0, p2, p1}, Le/f/e/o/b;->b(II)Z

    move-result v9

    if-eqz v9, :cond_a

    aget v9, v2, v8

    if-ge v9, p3, :cond_a

    .line 18
    aget v9, v2, v8

    add-int/2addr v9, v5

    aput v9, v2, v8

    add-int/lit8 p1, p1, 0x1

    goto :goto_5

    .line 19
    :cond_a
    aget p2, v2, v8

    if-lt p2, p3, :cond_b

    return v6

    .line 20
    :cond_b
    aget p2, v2, v7

    aget p3, v2, v5

    add-int/2addr p2, p3

    aget p3, v2, v4

    add-int/2addr p2, p3

    aget p3, v2, v3

    add-int/2addr p2, p3

    aget p3, v2, v8

    add-int/2addr p2, p3

    sub-int/2addr p2, p4

    .line 21
    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    move-result p2

    mul-int/lit8 p2, p2, 0x5

    mul-int/lit8 p4, p4, 0x2

    if-lt p2, p4, :cond_c

    return v6

    .line 22
    :cond_c
    invoke-static {v2}, Le/f/e/t/c/h;->a([I)Z

    move-result p2

    if-eqz p2, :cond_d

    invoke-static {v2, p1}, Le/f/e/t/c/h;->a([II)F

    move-result p1

    return p1

    :cond_d
    :goto_6
    return v6
.end method

.method public final c()Z
    .locals 9

    .line 23
    iget-object v0, p0, Le/f/e/t/c/h;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    .line 24
    iget-object v1, p0, Le/f/e/t/c/h;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Le/f/e/t/c/d;

    .line 25
    invoke-virtual {v6}, Le/f/e/t/c/d;->c()I

    move-result v7

    const/4 v8, 0x2

    if-lt v7, v8, :cond_0

    add-int/lit8 v4, v4, 0x1

    .line 26
    invoke-virtual {v6}, Le/f/e/t/c/d;->d()F

    move-result v6

    add-float/2addr v5, v6

    goto :goto_0

    :cond_1
    const/4 v1, 0x3

    if-ge v4, v1, :cond_2

    return v3

    :cond_2
    int-to-float v0, v0

    div-float v0, v5, v0

    .line 27
    iget-object v1, p0, Le/f/e/t/c/h;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Le/f/e/t/c/d;

    .line 28
    invoke-virtual {v4}, Le/f/e/t/c/d;->d()F

    move-result v4

    sub-float/2addr v4, v0

    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    move-result v4

    add-float/2addr v2, v4

    goto :goto_1

    :cond_3
    const v0, 0x3d4ccccd    # 0.05f

    mul-float v5, v5, v0

    cmpg-float v0, v2, v5

    if-gtz v0, :cond_4

    const/4 v0, 0x1

    return v0

    :cond_4
    return v3
.end method

.method public final d()[Le/f/e/t/c/d;
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/NotFoundException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/f/e/t/c/h;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x3

    if-lt v0, v1, :cond_5

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    if-le v0, v1, :cond_2

    .line 2
    iget-object v6, p0, Le/f/e/t/c/h;->b:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    const/4 v7, 0x0

    const/4 v8, 0x0

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_0

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Le/f/e/t/c/d;

    .line 3
    invoke-virtual {v9}, Le/f/e/t/c/d;->d()F

    move-result v9

    add-float/2addr v7, v9

    mul-float v9, v9, v9

    add-float/2addr v8, v9

    goto :goto_0

    :cond_0
    int-to-float v0, v0

    div-float/2addr v7, v0

    div-float/2addr v8, v0

    mul-float v0, v7, v7

    sub-float/2addr v8, v0

    float-to-double v8, v8

    .line 4
    invoke-static {v8, v9}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v8

    double-to-float v0, v8

    .line 5
    iget-object v6, p0, Le/f/e/t/c/h;->b:Ljava/util/List;

    new-instance v8, Le/f/e/t/c/g;

    invoke-direct {v8, v7, v2}, Le/f/e/t/c/g;-><init>(FLe/f/e/t/c/e;)V

    invoke-static {v6, v8}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    const v6, 0x3e4ccccd    # 0.2f

    mul-float v6, v6, v7

    .line 6
    invoke-static {v6, v0}, Ljava/lang/Math;->max(FF)F

    move-result v0

    const/4 v6, 0x0

    .line 7
    :goto_1
    iget-object v8, p0, Le/f/e/t/c/h;->b:Ljava/util/List;

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v8

    if-ge v6, v8, :cond_2

    iget-object v8, p0, Le/f/e/t/c/h;->b:Ljava/util/List;

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v8

    if-le v8, v1, :cond_2

    .line 8
    iget-object v8, p0, Le/f/e/t/c/h;->b:Ljava/util/List;

    invoke-interface {v8, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Le/f/e/t/c/d;

    .line 9
    invoke-virtual {v8}, Le/f/e/t/c/d;->d()F

    move-result v8

    sub-float/2addr v8, v7

    invoke-static {v8}, Ljava/lang/Math;->abs(F)F

    move-result v8

    cmpl-float v8, v8, v0

    if-lez v8, :cond_1

    .line 10
    iget-object v8, p0, Le/f/e/t/c/h;->b:Ljava/util/List;

    invoke-interface {v8, v6}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    add-int/lit8 v6, v6, -0x1

    :cond_1
    add-int/2addr v6, v3

    goto :goto_1

    .line 11
    :cond_2
    iget-object v0, p0, Le/f/e/t/c/h;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-le v0, v1, :cond_4

    .line 12
    iget-object v0, p0, Le/f/e/t/c/h;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Le/f/e/t/c/d;

    .line 13
    invoke-virtual {v6}, Le/f/e/t/c/d;->d()F

    move-result v6

    add-float/2addr v5, v6

    goto :goto_2

    .line 14
    :cond_3
    iget-object v0, p0, Le/f/e/t/c/h;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    int-to-float v0, v0

    div-float/2addr v5, v0

    .line 15
    iget-object v0, p0, Le/f/e/t/c/h;->b:Ljava/util/List;

    new-instance v6, Le/f/e/t/c/f;

    invoke-direct {v6, v5, v2}, Le/f/e/t/c/f;-><init>(FLe/f/e/t/c/e;)V

    invoke-static {v0, v6}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 16
    iget-object v0, p0, Le/f/e/t/c/h;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    invoke-interface {v0, v1, v2}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    :cond_4
    new-array v0, v1, [Le/f/e/t/c/d;

    .line 17
    iget-object v1, p0, Le/f/e/t/c/h;->b:Ljava/util/List;

    .line 18
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le/f/e/t/c/d;

    aput-object v1, v0, v4

    iget-object v1, p0, Le/f/e/t/c/h;->b:Ljava/util/List;

    .line 19
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le/f/e/t/c/d;

    aput-object v1, v0, v3

    iget-object v1, p0, Le/f/e/t/c/h;->b:Ljava/util/List;

    const/4 v2, 0x2

    .line 20
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le/f/e/t/c/d;

    aput-object v1, v0, v2

    return-object v0

    .line 21
    :cond_5
    invoke-static {}, Lcom/google/zxing/NotFoundException;->a()Lcom/google/zxing/NotFoundException;

    move-result-object v0

    throw v0
.end method
