.class public Le/c/a/l2;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static synthetic l:[I

.field public static synthetic m:[I

.field public static synthetic n:[I

.field public static synthetic o:[I


# instance fields
.field public a:Landroid/graphics/Canvas;

.field public b:Le/c/a/n;

.field public c:F

.field public d:Z

.field public e:Le/c/a/a2;

.field public f:Le/c/a/h2;

.field public g:Ljava/util/Stack;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Stack<",
            "Le/c/a/h2;",
            ">;"
        }
    .end annotation
.end field

.field public h:Ljava/util/Stack;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Stack<",
            "Le/c/a/d1;",
            ">;"
        }
    .end annotation
.end field

.field public i:Ljava/util/Stack;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Stack<",
            "Landroid/graphics/Matrix;",
            ">;"
        }
    .end annotation
.end field

.field public j:Ljava/util/Stack;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Stack<",
            "Landroid/graphics/Canvas;",
            ">;"
        }
    .end annotation
.end field

.field public k:Ljava/util/Stack;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Stack<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/graphics/Canvas;Le/c/a/n;F)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/c/a/l2;->a:Landroid/graphics/Canvas;

    .line 3
    iput p3, p0, Le/c/a/l2;->c:F

    .line 4
    iput-object p2, p0, Le/c/a/l2;->b:Le/c/a/n;

    return-void
.end method

.method public static synthetic a(FFFFFZZFFLe/c/a/j0;)V
    .locals 0

    .line 513
    invoke-static/range {p0 .. p9}, Le/c/a/l2;->b(FFFFFZZFFLe/c/a/j0;)V

    return-void
.end method

.method public static synthetic a(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    .line 38
    invoke-static {p0, p1}, Le/c/a/l2;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic a(Le/c/a/l2;)Z
    .locals 0

    .line 344
    invoke-virtual {p0}, Le/c/a/l2;->t()Z

    move-result p0

    return p0
.end method

.method public static a(DD)[F
    .locals 21

    .line 514
    invoke-static/range {p2 .. p3}, Ljava/lang/Math;->abs(D)D

    move-result-wide v0

    const-wide v2, 0x4056800000000000L    # 90.0

    div-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v0, v0

    .line 515
    invoke-static/range {p0 .. p1}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v1

    .line 516
    invoke-static/range {p2 .. p3}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v3

    int-to-double v5, v0

    div-double/2addr v3, v5

    double-to-float v3, v3

    float-to-double v4, v3

    const-wide/high16 v6, 0x4000000000000000L    # 2.0

    div-double v6, v4, v6

    .line 517
    invoke-static {v6, v7}, Ljava/lang/Math;->sin(D)D

    move-result-wide v8

    const-wide v10, 0x3ff5555555555555L    # 1.3333333333333333

    mul-double v8, v8, v10

    invoke-static {v6, v7}, Ljava/lang/Math;->cos(D)D

    move-result-wide v6

    const-wide/high16 v10, 0x3ff0000000000000L    # 1.0

    add-double/2addr v6, v10

    div-double/2addr v8, v6

    mul-int/lit8 v6, v0, 0x6

    .line 518
    new-array v6, v6, [F

    const/4 v7, 0x0

    const/4 v10, 0x0

    :goto_0
    if-lt v7, v0, :cond_0

    return-object v6

    :cond_0
    int-to-float v11, v7

    mul-float v11, v11, v3

    float-to-double v11, v11

    add-double/2addr v11, v1

    .line 519
    invoke-static {v11, v12}, Ljava/lang/Math;->cos(D)D

    move-result-wide v13

    .line 520
    invoke-static {v11, v12}, Ljava/lang/Math;->sin(D)D

    move-result-wide v15

    add-int/lit8 v17, v10, 0x1

    mul-double v18, v8, v15

    move/from16 v20, v0

    move-wide/from16 p0, v1

    sub-double v0, v13, v18

    double-to-float v0, v0

    .line 521
    aput v0, v6, v10

    add-int/lit8 v0, v17, 0x1

    mul-double v13, v13, v8

    add-double v1, v15, v13

    double-to-float v1, v1

    .line 522
    aput v1, v6, v17

    add-double/2addr v11, v4

    .line 523
    invoke-static {v11, v12}, Ljava/lang/Math;->cos(D)D

    move-result-wide v1

    .line 524
    invoke-static {v11, v12}, Ljava/lang/Math;->sin(D)D

    move-result-wide v10

    add-int/lit8 v12, v0, 0x1

    mul-double v13, v8, v10

    add-double/2addr v13, v1

    double-to-float v13, v13

    .line 525
    aput v13, v6, v0

    add-int/lit8 v0, v12, 0x1

    mul-double v13, v8, v1

    sub-double v13, v10, v13

    double-to-float v13, v13

    .line 526
    aput v13, v6, v12

    add-int/lit8 v12, v0, 0x1

    double-to-float v1, v1

    .line 527
    aput v1, v6, v0

    add-int/lit8 v0, v12, 0x1

    double-to-float v1, v10

    .line 528
    aput v1, v6, v12

    add-int/lit8 v7, v7, 0x1

    move-wide/from16 v1, p0

    move v10, v0

    move/from16 v0, v20

    goto :goto_0
.end method

.method public static synthetic b(Le/c/a/l2;)Le/c/a/h2;
    .locals 0

    .line 1
    iget-object p0, p0, Le/c/a/l2;->f:Le/c/a/h2;

    return-object p0
.end method

.method public static b(FFFFFZZFFLe/c/a/j0;)V
    .locals 31

    move/from16 v0, p4

    move/from16 v1, p6

    move/from16 v2, p7

    move/from16 v3, p8

    cmpl-float v4, p0, v2

    if-nez v4, :cond_0

    cmpl-float v4, p1, v3

    if-nez v4, :cond_0

    return-void

    :cond_0
    const/4 v4, 0x0

    cmpl-float v5, p2, v4

    if-eqz v5, :cond_a

    cmpl-float v4, p3, v4

    if-nez v4, :cond_1

    goto/16 :goto_4

    .line 88
    :cond_1
    invoke-static/range {p2 .. p2}, Ljava/lang/Math;->abs(F)F

    move-result v4

    .line 89
    invoke-static/range {p3 .. p3}, Ljava/lang/Math;->abs(F)F

    move-result v5

    float-to-double v6, v0

    const-wide v8, 0x4076800000000000L    # 360.0

    rem-double/2addr v6, v8

    .line 90
    invoke-static {v6, v7}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v6

    double-to-float v6, v6

    float-to-double v6, v6

    .line 91
    invoke-static {v6, v7}, Ljava/lang/Math;->cos(D)D

    move-result-wide v10

    .line 92
    invoke-static {v6, v7}, Ljava/lang/Math;->sin(D)D

    move-result-wide v6

    sub-float v12, p0, v2

    float-to-double v12, v12

    const-wide/high16 v14, 0x4000000000000000L    # 2.0

    div-double/2addr v12, v14

    sub-float v8, p1, v3

    float-to-double v8, v8

    div-double/2addr v8, v14

    mul-double v16, v10, v12

    mul-double v18, v6, v8

    add-double v14, v16, v18

    neg-double v2, v6

    mul-double v2, v2, v12

    mul-double v8, v8, v10

    add-double/2addr v2, v8

    mul-float v8, v4, v4

    float-to-double v8, v8

    mul-float v12, v5, v5

    float-to-double v12, v12

    mul-double v16, v14, v14

    mul-double v18, v2, v2

    div-double v22, v16, v8

    div-double v24, v18, v12

    add-double v22, v22, v24

    const-wide/high16 v24, 0x3ff0000000000000L    # 1.0

    cmpl-double v26, v22, v24

    if-lez v26, :cond_2

    .line 93
    invoke-static/range {v22 .. v23}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v8

    double-to-float v8, v8

    mul-float v4, v4, v8

    .line 94
    invoke-static/range {v22 .. v23}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v8

    double-to-float v8, v8

    mul-float v5, v5, v8

    mul-float v8, v4, v4

    float-to-double v8, v8

    mul-float v12, v5, v5

    float-to-double v12, v12

    :cond_2
    const/16 v22, 0x1

    move/from16 v0, p5

    if-ne v0, v1, :cond_3

    const/4 v0, -0x1

    goto :goto_0

    :cond_3
    const/4 v0, 0x1

    :goto_0
    int-to-double v0, v0

    mul-double v26, v8, v12

    mul-double v8, v8, v18

    sub-double v26, v26, v8

    mul-double v12, v12, v16

    sub-double v26, v26, v12

    add-double/2addr v8, v12

    div-double v26, v26, v8

    const-wide/16 v8, 0x0

    cmpg-double v12, v26, v8

    if-gez v12, :cond_4

    move-wide/from16 v26, v8

    .line 95
    :cond_4
    invoke-static/range {v26 .. v27}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v12

    mul-double v0, v0, v12

    float-to-double v12, v4

    mul-double v16, v12, v2

    float-to-double v8, v5

    div-double v16, v16, v8

    mul-double v16, v16, v0

    mul-double v26, v8, v14

    move/from16 v23, v4

    move/from16 v28, v5

    div-double v4, v26, v12

    neg-double v4, v4

    mul-double v0, v0, v4

    move/from16 v4, p7

    add-float v5, p0, v4

    float-to-double v4, v5

    const-wide/high16 v20, 0x4000000000000000L    # 2.0

    div-double v4, v4, v20

    move-wide/from16 v26, v8

    move/from16 v8, p8

    add-float v9, p1, v8

    float-to-double v8, v9

    div-double v8, v8, v20

    mul-double v20, v10, v16

    mul-double v29, v6, v0

    sub-double v20, v20, v29

    add-double v4, v4, v20

    mul-double v6, v6, v16

    mul-double v10, v10, v0

    add-double/2addr v6, v10

    add-double/2addr v8, v6

    sub-double v6, v14, v16

    div-double/2addr v6, v12

    sub-double v10, v2, v0

    div-double v10, v10, v26

    neg-double v14, v14

    sub-double v14, v14, v16

    div-double/2addr v14, v12

    neg-double v2, v2

    sub-double/2addr v2, v0

    div-double v2, v2, v26

    mul-double v0, v6, v6

    mul-double v12, v10, v10

    add-double/2addr v0, v12

    .line 96
    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v12

    const-wide/high16 v16, -0x4010000000000000L    # -1.0

    const-wide/16 v18, 0x0

    cmpg-double v20, v10, v18

    if-gez v20, :cond_5

    move-wide/from16 v20, v16

    goto :goto_1

    :cond_5
    move-wide/from16 v20, v24

    :goto_1
    div-double v12, v6, v12

    .line 97
    invoke-static {v12, v13}, Ljava/lang/Math;->acos(D)D

    move-result-wide v12

    mul-double v20, v20, v12

    invoke-static/range {v20 .. v21}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v12

    mul-double v20, v14, v14

    mul-double v26, v2, v2

    add-double v20, v20, v26

    mul-double v0, v0, v20

    .line 98
    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    mul-double v20, v6, v14

    mul-double v26, v10, v2

    add-double v20, v20, v26

    mul-double v6, v6, v2

    mul-double v10, v10, v14

    sub-double/2addr v6, v10

    const-wide/16 v2, 0x0

    cmpg-double v10, v6, v2

    if-gez v10, :cond_6

    move-wide/from16 v24, v16

    :cond_6
    div-double v20, v20, v0

    .line 99
    invoke-static/range {v20 .. v21}, Ljava/lang/Math;->acos(D)D

    move-result-wide v0

    mul-double v24, v24, v0

    invoke-static/range {v24 .. v25}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v0

    if-nez p6, :cond_7

    cmpl-double v6, v0, v2

    if-lez v6, :cond_7

    const-wide v6, 0x4076800000000000L    # 360.0

    sub-double/2addr v0, v6

    goto :goto_2

    :cond_7
    const-wide v6, 0x4076800000000000L    # 360.0

    if-eqz p6, :cond_8

    cmpg-double v10, v0, v2

    if-gez v10, :cond_8

    add-double/2addr v0, v6

    :cond_8
    :goto_2
    rem-double/2addr v0, v6

    rem-double/2addr v12, v6

    .line 100
    invoke-static {v12, v13, v0, v1}, Le/c/a/l2;->a(DD)[F

    move-result-object v0

    .line 101
    new-instance v1, Landroid/graphics/Matrix;

    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    move/from16 v2, v23

    move/from16 v3, v28

    .line 102
    invoke-virtual {v1, v2, v3}, Landroid/graphics/Matrix;->postScale(FF)Z

    move/from16 v2, p4

    .line 103
    invoke-virtual {v1, v2}, Landroid/graphics/Matrix;->postRotate(F)Z

    double-to-float v2, v4

    double-to-float v3, v8

    .line 104
    invoke-virtual {v1, v2, v3}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 105
    invoke-virtual {v1, v0}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 106
    array-length v1, v0

    add-int/lit8 v1, v1, -0x2

    move/from16 v2, p7

    aput v2, v0, v1

    .line 107
    array-length v1, v0

    add-int/lit8 v1, v1, -0x1

    move/from16 v3, p8

    aput v3, v0, v1

    const/4 v1, 0x0

    .line 108
    :goto_3
    array-length v2, v0

    if-lt v1, v2, :cond_9

    return-void

    .line 109
    :cond_9
    aget v2, v0, v1

    add-int/lit8 v3, v1, 0x1

    aget v3, v0, v3

    add-int/lit8 v4, v1, 0x2

    aget v4, v0, v4

    add-int/lit8 v5, v1, 0x3

    aget v5, v0, v5

    add-int/lit8 v6, v1, 0x4

    aget v6, v0, v6

    add-int/lit8 v7, v1, 0x5

    aget v7, v0, v7

    move-object/from16 p0, p9

    move/from16 p1, v2

    move/from16 p2, v3

    move/from16 p3, v4

    move/from16 p4, v5

    move/from16 p5, v6

    move/from16 p6, v7

    invoke-interface/range {p0 .. p6}, Le/c/a/j0;->a(FFFFFF)V

    add-int/lit8 v1, v1, 0x6

    goto :goto_3

    :cond_a
    :goto_4
    move-object/from16 v0, p9

    .line 110
    invoke-interface {v0, v2, v3}, Le/c/a/j0;->b(FF)V

    return-void
.end method

.method public static synthetic b(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    .line 17
    invoke-static {p0, p1}, Le/c/a/l2;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic c(Le/c/a/l2;)Landroid/graphics/Canvas;
    .locals 0

    .line 1
    iget-object p0, p0, Le/c/a/l2;->a:Landroid/graphics/Canvas;

    return-object p0
.end method

.method public static synthetic c(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    .line 32
    invoke-static {p0, p1}, Le/c/a/l2;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public static varargs d(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public static varargs e(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const-string p1, "SVGAndroidRenderer"

    invoke-static {p1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public static varargs f(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const-string p1, "SVGAndroidRenderer"

    invoke-static {p1, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public static synthetic u()[I
    .locals 3

    .line 1
    sget-object v0, Le/c/a/l2;->l:[I

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    invoke-static {}, Le/c/a/k;->values()[Le/c/a/k;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_0
    sget-object v1, Le/c/a/k;->b:Le/c/a/k;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :try_start_1
    sget-object v1, Le/c/a/k;->k:Le/c/a/k;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0xa

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :try_start_2
    sget-object v1, Le/c/a/k;->h:Le/c/a/k;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x7

    aput v2, v0, v1
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    :try_start_3
    sget-object v1, Le/c/a/k;->e:Le/c/a/k;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x4

    aput v2, v0, v1
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_3

    :catch_3
    :try_start_4
    sget-object v1, Le/c/a/k;->j:Le/c/a/k;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0x9

    aput v2, v0, v1
    :try_end_4
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4 .. :try_end_4} :catch_4

    :catch_4
    :try_start_5
    sget-object v1, Le/c/a/k;->g:Le/c/a/k;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x6

    aput v2, v0, v1
    :try_end_5
    .catch Ljava/lang/NoSuchFieldError; {:try_start_5 .. :try_end_5} :catch_5

    :catch_5
    :try_start_6
    sget-object v1, Le/c/a/k;->d:Le/c/a/k;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1
    :try_end_6
    .catch Ljava/lang/NoSuchFieldError; {:try_start_6 .. :try_end_6} :catch_6

    :catch_6
    :try_start_7
    sget-object v1, Le/c/a/k;->i:Le/c/a/k;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/16 v2, 0x8

    aput v2, v0, v1
    :try_end_7
    .catch Ljava/lang/NoSuchFieldError; {:try_start_7 .. :try_end_7} :catch_7

    :catch_7
    :try_start_8
    sget-object v1, Le/c/a/k;->f:Le/c/a/k;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x5

    aput v2, v0, v1
    :try_end_8
    .catch Ljava/lang/NoSuchFieldError; {:try_start_8 .. :try_end_8} :catch_8

    :catch_8
    :try_start_9
    sget-object v1, Le/c/a/k;->c:Le/c/a/k;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_9
    .catch Ljava/lang/NoSuchFieldError; {:try_start_9 .. :try_end_9} :catch_9

    :catch_9
    sput-object v0, Le/c/a/l2;->l:[I

    return-object v0
.end method

.method public static synthetic v()[I
    .locals 3

    .line 1
    sget-object v0, Le/c/a/l2;->o:[I

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    invoke-static {}, Le/c/a/q0;->values()[Le/c/a/q0;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_0
    sget-object v1, Le/c/a/q0;->c:Le/c/a/q0;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :try_start_1
    sget-object v1, Le/c/a/q0;->b:Le/c/a/q0;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    sput-object v0, Le/c/a/l2;->o:[I

    return-object v0
.end method

.method public static synthetic w()[I
    .locals 3

    .line 1
    sget-object v0, Le/c/a/l2;->m:[I

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    invoke-static {}, Le/c/a/s0;->values()[Le/c/a/s0;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_0
    sget-object v1, Le/c/a/s0;->b:Le/c/a/s0;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :try_start_1
    sget-object v1, Le/c/a/s0;->c:Le/c/a/s0;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :try_start_2
    sget-object v1, Le/c/a/s0;->d:Le/c/a/s0;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    sput-object v0, Le/c/a/l2;->m:[I

    return-object v0
.end method

.method public static synthetic x()[I
    .locals 3

    .line 1
    sget-object v0, Le/c/a/l2;->n:[I

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    invoke-static {}, Le/c/a/t0;->values()[Le/c/a/t0;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_0
    sget-object v1, Le/c/a/t0;->d:Le/c/a/t0;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :try_start_1
    sget-object v1, Le/c/a/t0;->b:Le/c/a/t0;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :try_start_2
    sget-object v1, Le/c/a/t0;->c:Le/c/a/t0;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    sput-object v0, Le/c/a/l2;->n:[I

    return-object v0
.end method


# virtual methods
.method public final a(Le/c/a/s1;)F
    .locals 2

    .line 275
    new-instance v0, Le/c/a/k2;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Le/c/a/k2;-><init>(Le/c/a/l2;Le/c/a/k2;)V

    .line 276
    invoke-virtual {p0, p1, v0}, Le/c/a/l2;->a(Le/c/a/s1;Le/c/a/j2;)V

    .line 277
    iget p1, v0, Le/c/a/k2;->a:F

    return p1
.end method

.method public final a(F)I
    .locals 1

    const/high16 v0, 0x43800000    # 256.0f

    mul-float p1, p1, v0

    float-to-int p1, p1

    const/16 v0, 0xff

    if-gez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    if-le p1, v0, :cond_1

    const/16 p1, 0xff

    :cond_1
    :goto_0
    return p1
.end method

.method public final a(Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 4

    const-string v0, "data:"

    .line 338
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 339
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v2, 0xe

    if-ge v0, v2, :cond_1

    return-object v1

    :cond_1
    const/16 v0, 0x2c

    .line 340
    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    const/4 v2, -0x1

    if-eq v0, v2, :cond_4

    const/16 v2, 0xc

    if-ge v0, v2, :cond_2

    goto :goto_0

    :cond_2
    add-int/lit8 v2, v0, -0x7

    .line 341
    invoke-virtual {p1, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    const-string v3, ";base64"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    return-object v1

    :cond_3
    add-int/lit8 v0, v0, 0x1

    .line 342
    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    invoke-static {p1, v0}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object p1

    .line 343
    array-length v1, p1

    invoke-static {p1, v0, v1}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1

    :cond_4
    :goto_0
    return-object v1
.end method

.method public final a(Le/c/a/n;Le/c/a/n;Le/c/a/m;)Landroid/graphics/Matrix;
    .locals 9

    .line 345
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    if-eqz p3, :cond_5

    .line 346
    invoke-virtual {p3}, Le/c/a/m;->a()Le/c/a/k;

    move-result-object v1

    if-nez v1, :cond_0

    goto/16 :goto_5

    .line 347
    :cond_0
    iget v1, p1, Le/c/a/n;->d:F

    iget v2, p2, Le/c/a/n;->d:F

    div-float/2addr v1, v2

    .line 348
    iget v2, p1, Le/c/a/n;->e:F

    iget v3, p2, Le/c/a/n;->e:F

    div-float/2addr v2, v3

    .line 349
    iget v3, p2, Le/c/a/n;->b:F

    neg-float v3, v3

    .line 350
    iget v4, p2, Le/c/a/n;->c:F

    neg-float v4, v4

    .line 351
    sget-object v5, Le/c/a/m;->c:Le/c/a/m;

    invoke-virtual {p3, v5}, Le/c/a/m;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 352
    iget p2, p1, Le/c/a/n;->b:F

    iget p1, p1, Le/c/a/n;->c:F

    invoke-virtual {v0, p2, p1}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    .line 353
    invoke-virtual {v0, v1, v2}, Landroid/graphics/Matrix;->preScale(FF)Z

    .line 354
    invoke-virtual {v0, v3, v4}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    return-object v0

    .line 355
    :cond_1
    invoke-virtual {p3}, Le/c/a/m;->b()Le/c/a/l;

    move-result-object v5

    sget-object v6, Le/c/a/l;->c:Le/c/a/l;

    if-ne v5, v6, :cond_2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(FF)F

    move-result v1

    goto :goto_0

    :cond_2
    invoke-static {v1, v2}, Ljava/lang/Math;->min(FF)F

    move-result v1

    .line 356
    :goto_0
    iget v2, p1, Le/c/a/n;->d:F

    div-float/2addr v2, v1

    .line 357
    iget v5, p1, Le/c/a/n;->e:F

    div-float/2addr v5, v1

    .line 358
    invoke-static {}, Le/c/a/l2;->u()[I

    move-result-object v6

    invoke-virtual {p3}, Le/c/a/m;->a()Le/c/a/k;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    aget v6, v6, v7

    const/4 v7, 0x3

    const/high16 v8, 0x40000000    # 2.0f

    if-eq v6, v7, :cond_4

    const/4 v7, 0x4

    if-eq v6, v7, :cond_3

    const/4 v7, 0x6

    if-eq v6, v7, :cond_4

    const/4 v7, 0x7

    if-eq v6, v7, :cond_3

    const/16 v7, 0x9

    if-eq v6, v7, :cond_4

    const/16 v7, 0xa

    if-eq v6, v7, :cond_3

    goto :goto_2

    .line 359
    :cond_3
    iget v6, p2, Le/c/a/n;->d:F

    sub-float/2addr v6, v2

    goto :goto_1

    .line 360
    :cond_4
    iget v6, p2, Le/c/a/n;->d:F

    sub-float/2addr v6, v2

    div-float/2addr v6, v8

    :goto_1
    sub-float/2addr v3, v6

    .line 361
    :goto_2
    invoke-static {}, Le/c/a/l2;->u()[I

    move-result-object v2

    .line 362
    invoke-virtual {p3}, Le/c/a/m;->a()Le/c/a/k;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    move-result p3

    aget p3, v2, p3

    packed-switch p3, :pswitch_data_0

    goto :goto_4

    .line 363
    :pswitch_0
    iget p2, p2, Le/c/a/n;->e:F

    sub-float/2addr p2, v5

    goto :goto_3

    .line 364
    :pswitch_1
    iget p2, p2, Le/c/a/n;->e:F

    sub-float/2addr p2, v5

    div-float/2addr p2, v8

    :goto_3
    sub-float/2addr v4, p2

    .line 365
    :goto_4
    iget p2, p1, Le/c/a/n;->b:F

    iget p1, p1, Le/c/a/n;->c:F

    invoke-virtual {v0, p2, p1}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    .line 366
    invoke-virtual {v0, v1, v1}, Landroid/graphics/Matrix;->preScale(FF)Z

    .line 367
    invoke-virtual {v0, v3, v4}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    :cond_5
    :goto_5
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final a(Le/c/a/n0;)Landroid/graphics/Path;
    .locals 23

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 865
    iget-object v2, v1, Le/c/a/n0;->s:Le/c/a/b0;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    iget-object v2, v1, Le/c/a/n0;->t:Le/c/a/b0;

    if-nez v2, :cond_0

    const/4 v2, 0x0

    const/4 v4, 0x0

    goto :goto_1

    .line 866
    :cond_0
    iget-object v2, v1, Le/c/a/n0;->s:Le/c/a/b0;

    if-nez v2, :cond_1

    .line 867
    iget-object v2, v1, Le/c/a/n0;->t:Le/c/a/b0;

    invoke-virtual {v2, v0}, Le/c/a/b0;->c(Le/c/a/l2;)F

    move-result v2

    :goto_0
    move v4, v2

    goto :goto_1

    .line 868
    :cond_1
    iget-object v4, v1, Le/c/a/n0;->t:Le/c/a/b0;

    if-nez v4, :cond_2

    .line 869
    invoke-virtual {v2, v0}, Le/c/a/b0;->b(Le/c/a/l2;)F

    move-result v2

    goto :goto_0

    .line 870
    :cond_2
    invoke-virtual {v2, v0}, Le/c/a/b0;->b(Le/c/a/l2;)F

    move-result v2

    .line 871
    iget-object v4, v1, Le/c/a/n0;->t:Le/c/a/b0;

    invoke-virtual {v4, v0}, Le/c/a/b0;->c(Le/c/a/l2;)F

    move-result v4

    .line 872
    :goto_1
    iget-object v5, v1, Le/c/a/n0;->q:Le/c/a/b0;

    invoke-virtual {v5, v0}, Le/c/a/b0;->b(Le/c/a/l2;)F

    move-result v5

    const/high16 v6, 0x40000000    # 2.0f

    div-float/2addr v5, v6

    invoke-static {v2, v5}, Ljava/lang/Math;->min(FF)F

    move-result v2

    .line 873
    iget-object v5, v1, Le/c/a/n0;->r:Le/c/a/b0;

    invoke-virtual {v5, v0}, Le/c/a/b0;->c(Le/c/a/l2;)F

    move-result v5

    div-float/2addr v5, v6

    invoke-static {v4, v5}, Ljava/lang/Math;->min(FF)F

    move-result v4

    .line 874
    iget-object v5, v1, Le/c/a/n0;->o:Le/c/a/b0;

    if-eqz v5, :cond_3

    invoke-virtual {v5, v0}, Le/c/a/b0;->b(Le/c/a/l2;)F

    move-result v5

    goto :goto_2

    :cond_3
    const/4 v5, 0x0

    .line 875
    :goto_2
    iget-object v6, v1, Le/c/a/n0;->p:Le/c/a/b0;

    if-eqz v6, :cond_4

    invoke-virtual {v6, v0}, Le/c/a/b0;->c(Le/c/a/l2;)F

    move-result v6

    move v13, v6

    goto :goto_3

    :cond_4
    const/4 v13, 0x0

    .line 876
    :goto_3
    iget-object v6, v1, Le/c/a/n0;->q:Le/c/a/b0;

    invoke-virtual {v6, v0}, Le/c/a/b0;->b(Le/c/a/l2;)F

    move-result v6

    .line 877
    iget-object v7, v1, Le/c/a/n0;->r:Le/c/a/b0;

    invoke-virtual {v7, v0}, Le/c/a/b0;->c(Le/c/a/l2;)F

    move-result v7

    .line 878
    iget-object v8, v1, Le/c/a/e1;->h:Le/c/a/n;

    if-nez v8, :cond_5

    .line 879
    new-instance v8, Le/c/a/n;

    invoke-direct {v8, v5, v13, v6, v7}, Le/c/a/n;-><init>(FFFF)V

    iput-object v8, v1, Le/c/a/e1;->h:Le/c/a/n;

    :cond_5
    add-float v15, v5, v6

    add-float v1, v13, v7

    .line 880
    new-instance v14, Landroid/graphics/Path;

    invoke-direct {v14}, Landroid/graphics/Path;-><init>()V

    cmpl-float v6, v2, v3

    if-eqz v6, :cond_7

    cmpl-float v3, v4, v3

    if-nez v3, :cond_6

    goto/16 :goto_4

    :cond_6
    const v3, 0x3f0d6289

    mul-float v16, v2, v3

    mul-float v3, v3, v4

    add-float v12, v13, v4

    .line 881
    invoke-virtual {v14, v5, v12}, Landroid/graphics/Path;->moveTo(FF)V

    sub-float v17, v12, v3

    add-float v11, v5, v2

    sub-float v21, v11, v16

    move-object v6, v14

    move v7, v5

    move/from16 v8, v17

    move/from16 v9, v21

    move v10, v13

    move/from16 p1, v11

    move/from16 v22, v12

    move v12, v13

    .line 882
    invoke-virtual/range {v6 .. v12}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    sub-float v2, v15, v2

    .line 883
    invoke-virtual {v14, v2, v13}, Landroid/graphics/Path;->lineTo(FF)V

    add-float v6, v2, v16

    move-object v7, v14

    move v8, v6

    move v9, v13

    move v10, v15

    move/from16 v11, v17

    move v12, v15

    move/from16 v13, v22

    .line 884
    invoke-virtual/range {v7 .. v13}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    sub-float v12, v1, v4

    .line 885
    invoke-virtual {v14, v15, v12}, Landroid/graphics/Path;->lineTo(FF)V

    add-float v10, v12, v3

    move-object v3, v14

    move/from16 v16, v10

    move/from16 v17, v6

    move/from16 v18, v1

    move/from16 v19, v2

    move/from16 v20, v1

    .line 886
    invoke-virtual/range {v14 .. v20}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    move/from16 v2, p1

    .line 887
    invoke-virtual {v3, v2, v1}, Landroid/graphics/Path;->lineTo(FF)V

    move-object v6, v3

    move/from16 v7, v21

    move v8, v1

    move v9, v5

    move v11, v5

    .line 888
    invoke-virtual/range {v6 .. v12}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 889
    invoke-virtual {v3, v5, v13}, Landroid/graphics/Path;->lineTo(FF)V

    goto :goto_5

    :cond_7
    :goto_4
    move-object v3, v14

    .line 890
    invoke-virtual {v3, v5, v13}, Landroid/graphics/Path;->moveTo(FF)V

    .line 891
    invoke-virtual {v3, v15, v13}, Landroid/graphics/Path;->lineTo(FF)V

    .line 892
    invoke-virtual {v3, v15, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 893
    invoke-virtual {v3, v5, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 894
    invoke-virtual {v3, v5, v13}, Landroid/graphics/Path;->lineTo(FF)V

    .line 895
    :goto_5
    invoke-virtual {v3}, Landroid/graphics/Path;->close()V

    return-object v3
.end method

.method public final a(Le/c/a/p;)Landroid/graphics/Path;
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 896
    iget-object v2, v1, Le/c/a/p;->o:Le/c/a/b0;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    invoke-virtual {v2, v0}, Le/c/a/b0;->b(Le/c/a/l2;)F

    move-result v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 897
    :goto_0
    iget-object v4, v1, Le/c/a/p;->p:Le/c/a/b0;

    if-eqz v4, :cond_1

    invoke-virtual {v4, v0}, Le/c/a/b0;->c(Le/c/a/l2;)F

    move-result v3

    .line 898
    :cond_1
    iget-object v4, v1, Le/c/a/p;->q:Le/c/a/b0;

    invoke-virtual {v4, v0}, Le/c/a/b0;->a(Le/c/a/l2;)F

    move-result v4

    sub-float v11, v2, v4

    sub-float v12, v3, v4

    add-float v13, v2, v4

    add-float v14, v3, v4

    .line 899
    iget-object v5, v1, Le/c/a/e1;->h:Le/c/a/n;

    if-nez v5, :cond_2

    .line 900
    new-instance v5, Le/c/a/n;

    const/high16 v6, 0x40000000    # 2.0f

    mul-float v6, v6, v4

    invoke-direct {v5, v11, v12, v6, v6}, Le/c/a/n;-><init>(FFFF)V

    iput-object v5, v1, Le/c/a/e1;->h:Le/c/a/n;

    :cond_2
    const v1, 0x3f0d6289

    mul-float v1, v1, v4

    .line 901
    new-instance v15, Landroid/graphics/Path;

    invoke-direct {v15}, Landroid/graphics/Path;-><init>()V

    .line 902
    invoke-virtual {v15, v2, v12}, Landroid/graphics/Path;->moveTo(FF)V

    add-float v16, v2, v1

    sub-float v17, v3, v1

    move-object v4, v15

    move/from16 v5, v16

    move v6, v12

    move v7, v13

    move/from16 v8, v17

    move v9, v13

    move v10, v3

    .line 903
    invoke-virtual/range {v4 .. v10}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    add-float v18, v3, v1

    move v5, v13

    move/from16 v6, v18

    move/from16 v7, v16

    move v8, v14

    move v9, v2

    move v10, v14

    .line 904
    invoke-virtual/range {v4 .. v10}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    sub-float v1, v2, v1

    move v5, v1

    move v6, v14

    move v7, v11

    move/from16 v8, v18

    move v9, v11

    move v10, v3

    .line 905
    invoke-virtual/range {v4 .. v10}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    move v5, v11

    move/from16 v6, v17

    move v7, v1

    move v8, v12

    move v9, v2

    move v10, v12

    .line 906
    invoke-virtual/range {v4 .. v10}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 907
    invoke-virtual {v15}, Landroid/graphics/Path;->close()V

    return-object v15
.end method

.method public final a(Le/c/a/u;)Landroid/graphics/Path;
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 908
    iget-object v2, v1, Le/c/a/u;->o:Le/c/a/b0;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    invoke-virtual {v2, v0}, Le/c/a/b0;->b(Le/c/a/l2;)F

    move-result v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 909
    :goto_0
    iget-object v4, v1, Le/c/a/u;->p:Le/c/a/b0;

    if-eqz v4, :cond_1

    invoke-virtual {v4, v0}, Le/c/a/b0;->c(Le/c/a/l2;)F

    move-result v3

    .line 910
    :cond_1
    iget-object v4, v1, Le/c/a/u;->q:Le/c/a/b0;

    invoke-virtual {v4, v0}, Le/c/a/b0;->b(Le/c/a/l2;)F

    move-result v4

    .line 911
    iget-object v5, v1, Le/c/a/u;->r:Le/c/a/b0;

    invoke-virtual {v5, v0}, Le/c/a/b0;->c(Le/c/a/l2;)F

    move-result v5

    sub-float v11, v2, v4

    sub-float v12, v3, v5

    add-float v13, v2, v4

    add-float v14, v3, v5

    .line 912
    iget-object v6, v1, Le/c/a/e1;->h:Le/c/a/n;

    if-nez v6, :cond_2

    .line 913
    new-instance v6, Le/c/a/n;

    const/high16 v7, 0x40000000    # 2.0f

    mul-float v8, v4, v7

    mul-float v7, v7, v5

    invoke-direct {v6, v11, v12, v8, v7}, Le/c/a/n;-><init>(FFFF)V

    iput-object v6, v1, Le/c/a/e1;->h:Le/c/a/n;

    :cond_2
    const v1, 0x3f0d6289

    mul-float v15, v4, v1

    mul-float v1, v1, v5

    .line 914
    new-instance v10, Landroid/graphics/Path;

    invoke-direct {v10}, Landroid/graphics/Path;-><init>()V

    .line 915
    invoke-virtual {v10, v2, v12}, Landroid/graphics/Path;->moveTo(FF)V

    add-float v16, v2, v15

    sub-float v17, v3, v1

    move-object v4, v10

    move/from16 v5, v16

    move v6, v12

    move v7, v13

    move/from16 v8, v17

    move v9, v13

    move-object/from16 v18, v10

    move v10, v3

    .line 916
    invoke-virtual/range {v4 .. v10}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    add-float/2addr v1, v3

    move-object/from16 v4, v18

    move v5, v13

    move v6, v1

    move/from16 v7, v16

    move v8, v14

    move v9, v2

    move v10, v14

    .line 917
    invoke-virtual/range {v4 .. v10}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    sub-float v13, v2, v15

    move v5, v13

    move v6, v14

    move v7, v11

    move v8, v1

    move v9, v11

    move v10, v3

    .line 918
    invoke-virtual/range {v4 .. v10}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    move v5, v11

    move/from16 v6, v17

    move v7, v13

    move v8, v12

    move v9, v2

    move v10, v12

    .line 919
    invoke-virtual/range {v4 .. v10}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 920
    invoke-virtual/range {v18 .. v18}, Landroid/graphics/Path;->close()V

    return-object v18
.end method

.method public final a(Ljava/lang/String;Ljava/lang/Integer;Le/c/a/r0;)Landroid/graphics/Typeface;
    .locals 3

    .line 495
    sget-object v0, Le/c/a/r0;->c:Le/c/a/r0;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-ne p3, v0, :cond_0

    const/4 p3, 0x1

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    .line 496
    :goto_0
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    const/16 v0, 0x1f4

    if-le p2, v0, :cond_1

    if-eqz p3, :cond_3

    const/4 v1, 0x3

    goto :goto_1

    :cond_1
    if-eqz p3, :cond_2

    const/4 v1, 0x2

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    :cond_3
    :goto_1
    const-string p2, "serif"

    .line 497
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_4

    .line 498
    sget-object p1, Landroid/graphics/Typeface;->SERIF:Landroid/graphics/Typeface;

    invoke-static {p1, v1}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object p1

    goto :goto_2

    :cond_4
    const-string p2, "sans-serif"

    .line 499
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_5

    .line 500
    sget-object p1, Landroid/graphics/Typeface;->SANS_SERIF:Landroid/graphics/Typeface;

    invoke-static {p1, v1}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object p1

    goto :goto_2

    :cond_5
    const-string p2, "monospace"

    .line 501
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_6

    .line 502
    sget-object p1, Landroid/graphics/Typeface;->MONOSPACE:Landroid/graphics/Typeface;

    invoke-static {p1, v1}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object p1

    goto :goto_2

    :cond_6
    const-string p2, "cursive"

    .line 503
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_7

    .line 504
    sget-object p1, Landroid/graphics/Typeface;->SANS_SERIF:Landroid/graphics/Typeface;

    invoke-static {p1, v1}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object p1

    goto :goto_2

    :cond_7
    const-string p2, "fantasy"

    .line 505
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_8

    .line 506
    sget-object p1, Landroid/graphics/Typeface;->SANS_SERIF:Landroid/graphics/Typeface;

    invoke-static {p1, v1}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object p1

    goto :goto_2

    :cond_8
    const/4 p1, 0x0

    :goto_2
    return-object p1
.end method

.method public final a(Le/c/a/h1;Le/c/a/h2;)Le/c/a/h2;
    .locals 3

    .line 594
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 595
    :goto_0
    instance-of v1, p1, Le/c/a/f1;

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    .line 596
    move-object v2, p1

    check-cast v2, Le/c/a/f1;

    invoke-interface {v0, v1, v2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 597
    :cond_0
    iget-object p1, p1, Le/c/a/h1;->b:Le/c/a/d1;

    if-nez p1, :cond_3

    .line 598
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-nez p1, :cond_2

    .line 599
    iget-object p1, p0, Le/c/a/l2;->e:Le/c/a/a2;

    invoke-virtual {p1}, Le/c/a/a2;->f()Le/c/a/z0;

    move-result-object p1

    iget-object p1, p1, Le/c/a/l1;->o:Le/c/a/n;

    iput-object p1, p2, Le/c/a/h2;->h:Le/c/a/n;

    if-nez p1, :cond_1

    .line 600
    iget-object p1, p0, Le/c/a/l2;->b:Le/c/a/n;

    iput-object p1, p2, Le/c/a/h2;->h:Le/c/a/n;

    .line 601
    :cond_1
    iget-object p1, p0, Le/c/a/l2;->b:Le/c/a/n;

    iput-object p1, p2, Le/c/a/h2;->g:Le/c/a/n;

    .line 602
    iget-object p1, p0, Le/c/a/l2;->f:Le/c/a/h2;

    iget-boolean p1, p1, Le/c/a/h2;->j:Z

    iput-boolean p1, p2, Le/c/a/h2;->j:Z

    return-object p2

    .line 603
    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Le/c/a/f1;

    .line 604
    invoke-virtual {p0, p2, p1}, Le/c/a/l2;->a(Le/c/a/h2;Le/c/a/f1;)V

    goto :goto_1

    .line 605
    :cond_3
    check-cast p1, Le/c/a/h1;

    goto :goto_0
.end method

.method public final a(Landroid/graphics/Path;)Le/c/a/n;
    .locals 4

    .line 140
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    const/4 v1, 0x1

    .line 141
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    .line 142
    new-instance p1, Le/c/a/n;

    iget v1, v0, Landroid/graphics/RectF;->left:F

    iget v2, v0, Landroid/graphics/RectF;->top:F

    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    move-result v3

    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    move-result v0

    invoke-direct {p1, v1, v2, v3, v0}, Le/c/a/n;-><init>(FFFF)V

    return-object p1
.end method

.method public final a(Ljava/lang/String;ZZ)Ljava/lang/String;
    .locals 3

    .line 285
    iget-object v0, p0, Le/c/a/l2;->f:Le/c/a/h2;

    iget-boolean v0, v0, Le/c/a/h2;->i:Z

    const-string v1, " "

    if-eqz v0, :cond_0

    const-string p2, "[\\n\\t]"

    .line 286
    invoke-virtual {p1, p2, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const-string v0, ""

    const-string v2, "\\n"

    .line 287
    invoke-virtual {p1, v2, v0}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v2, "\\t"

    .line 288
    invoke-virtual {p1, v2, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p2, :cond_1

    const-string p2, "^\\s+"

    .line 289
    invoke-virtual {p1, p2, v0}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :cond_1
    if-eqz p3, :cond_2

    const-string p2, "\\s+$"

    .line 290
    invoke-virtual {p1, p2, v0}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :cond_2
    const-string p2, "\\s{2,}"

    .line 291
    invoke-virtual {p1, p2, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final a(Le/c/a/c0;)Ljava/util/List;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/c/a/c0;",
            ")",
            "Ljava/util/List<",
            "Le/c/a/c2;",
            ">;"
        }
    .end annotation

    .line 143
    iget-object v0, p1, Le/c/a/c0;->o:Le/c/a/b0;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p0}, Le/c/a/b0;->b(Le/c/a/l2;)F

    move-result v0

    move v4, v0

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    .line 144
    :goto_0
    iget-object v0, p1, Le/c/a/c0;->p:Le/c/a/b0;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p0}, Le/c/a/b0;->c(Le/c/a/l2;)F

    move-result v0

    move v5, v0

    goto :goto_1

    :cond_1
    const/4 v5, 0x0

    .line 145
    :goto_1
    iget-object v0, p1, Le/c/a/c0;->q:Le/c/a/b0;

    if-eqz v0, :cond_2

    invoke-virtual {v0, p0}, Le/c/a/b0;->b(Le/c/a/l2;)F

    move-result v0

    move v8, v0

    goto :goto_2

    :cond_2
    const/4 v8, 0x0

    .line 146
    :goto_2
    iget-object p1, p1, Le/c/a/c0;->r:Le/c/a/b0;

    if-eqz p1, :cond_3

    invoke-virtual {p1, p0}, Le/c/a/b0;->c(Le/c/a/l2;)F

    move-result v1

    move v9, v1

    goto :goto_3

    :cond_3
    const/4 v9, 0x0

    .line 147
    :goto_3
    new-instance p1, Ljava/util/ArrayList;

    const/4 v0, 0x2

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 148
    new-instance v0, Le/c/a/c2;

    sub-float v10, v8, v4

    sub-float v11, v9, v5

    move-object v2, v0

    move-object v3, p0

    move v6, v10

    move v7, v11

    invoke-direct/range {v2 .. v7}, Le/c/a/c2;-><init>(Le/c/a/l2;FFFF)V

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 149
    new-instance v0, Le/c/a/c2;

    move-object v6, v0

    move-object v7, p0

    invoke-direct/range {v6 .. v11}, Le/c/a/c2;-><init>(Le/c/a/l2;FFFF)V

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p1
.end method

.method public final a(Le/c/a/l0;)Ljava/util/List;
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/c/a/l0;",
            ")",
            "Ljava/util/List<",
            "Le/c/a/c2;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p1

    .line 150
    iget-object v1, v0, Le/c/a/l0;->o:[F

    array-length v1, v1

    const/4 v2, 0x2

    if-ge v1, v2, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 151
    :cond_0
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 152
    new-instance v10, Le/c/a/c2;

    iget-object v4, v0, Le/c/a/l0;->o:[F

    const/4 v11, 0x0

    aget v6, v4, v11

    const/4 v12, 0x1

    aget v7, v4, v12

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v4, v10

    move-object/from16 v5, p0

    invoke-direct/range {v4 .. v9}, Le/c/a/c2;-><init>(Le/c/a/l2;FFFF)V

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    if-lt v2, v1, :cond_3

    .line 153
    instance-of v1, v0, Le/c/a/m0;

    if-eqz v1, :cond_1

    .line 154
    iget-object v0, v0, Le/c/a/l0;->o:[F

    aget v1, v0, v11

    cmpl-float v1, v4, v1

    if-eqz v1, :cond_2

    aget v1, v0, v12

    cmpl-float v1, v5, v1

    if-eqz v1, :cond_2

    .line 155
    aget v6, v0, v11

    .line 156
    aget v7, v0, v12

    .line 157
    invoke-virtual {v10, v6, v7}, Le/c/a/c2;->a(FF)V

    .line 158
    invoke-interface {v3, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 159
    new-instance v0, Le/c/a/c2;

    iget v1, v10, Le/c/a/c2;->a:F

    sub-float v8, v6, v1

    iget v1, v10, Le/c/a/c2;->b:F

    sub-float v9, v7, v1

    move-object v4, v0

    move-object/from16 v5, p0

    invoke-direct/range {v4 .. v9}, Le/c/a/c2;-><init>(Le/c/a/l2;FFFF)V

    .line 160
    invoke-interface {v3, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le/c/a/c2;

    invoke-virtual {v0, v1}, Le/c/a/c2;->a(Le/c/a/c2;)V

    .line 161
    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 162
    invoke-interface {v3, v11, v0}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 163
    :cond_1
    invoke-interface {v3, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    :goto_1
    return-object v3

    .line 164
    :cond_3
    iget-object v4, v0, Le/c/a/l0;->o:[F

    aget v5, v4, v2

    add-int/lit8 v6, v2, 0x1

    .line 165
    aget v4, v4, v6

    .line 166
    invoke-virtual {v10, v5, v4}, Le/c/a/c2;->a(FF)V

    .line 167
    invoke-interface {v3, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 168
    new-instance v6, Le/c/a/c2;

    iget v7, v10, Le/c/a/c2;->a:F

    sub-float v17, v5, v7

    iget v7, v10, Le/c/a/c2;->b:F

    sub-float v18, v4, v7

    move-object v13, v6

    move-object/from16 v14, p0

    move v15, v5

    move/from16 v16, v4

    invoke-direct/range {v13 .. v18}, Le/c/a/c2;-><init>(Le/c/a/l2;FFFF)V

    add-int/lit8 v2, v2, 0x2

    move-object v10, v6

    move/from16 v19, v5

    move v5, v4

    move/from16 v4, v19

    goto :goto_0
.end method

.method public final a()V
    .locals 1

    .line 807
    iget-object v0, p0, Le/c/a/l2;->a:Landroid/graphics/Canvas;

    invoke-virtual {v0}, Landroid/graphics/Canvas;->restore()V

    .line 808
    iget-object v0, p0, Le/c/a/l2;->g:Ljava/util/Stack;

    invoke-virtual {v0}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/c/a/h2;

    iput-object v0, p0, Le/c/a/l2;->f:Le/c/a/h2;

    return-void
.end method

.method public final a(FFFF)V
    .locals 1

    add-float/2addr p3, p1

    add-float/2addr p4, p2

    .line 507
    iget-object v0, p0, Le/c/a/l2;->f:Le/c/a/h2;

    iget-object v0, v0, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v0, v0, Le/c/a/y0;->x:Le/c/a/o;

    if-eqz v0, :cond_0

    .line 508
    iget-object v0, v0, Le/c/a/o;->d:Le/c/a/b0;

    invoke-virtual {v0, p0}, Le/c/a/b0;->b(Le/c/a/l2;)F

    move-result v0

    add-float/2addr p1, v0

    .line 509
    iget-object v0, p0, Le/c/a/l2;->f:Le/c/a/h2;

    iget-object v0, v0, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v0, v0, Le/c/a/y0;->x:Le/c/a/o;

    iget-object v0, v0, Le/c/a/o;->a:Le/c/a/b0;

    invoke-virtual {v0, p0}, Le/c/a/b0;->c(Le/c/a/l2;)F

    move-result v0

    add-float/2addr p2, v0

    .line 510
    iget-object v0, p0, Le/c/a/l2;->f:Le/c/a/h2;

    iget-object v0, v0, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v0, v0, Le/c/a/y0;->x:Le/c/a/o;

    iget-object v0, v0, Le/c/a/o;->b:Le/c/a/b0;

    invoke-virtual {v0, p0}, Le/c/a/b0;->b(Le/c/a/l2;)F

    move-result v0

    sub-float/2addr p3, v0

    .line 511
    iget-object v0, p0, Le/c/a/l2;->f:Le/c/a/h2;

    iget-object v0, v0, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v0, v0, Le/c/a/y0;->x:Le/c/a/o;

    iget-object v0, v0, Le/c/a/o;->c:Le/c/a/b0;

    invoke-virtual {v0, p0}, Le/c/a/b0;->c(Le/c/a/l2;)F

    move-result v0

    sub-float/2addr p4, v0

    .line 512
    :cond_0
    iget-object v0, p0, Le/c/a/l2;->a:Landroid/graphics/Canvas;

    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/graphics/Canvas;->clipRect(FFFF)Z

    return-void
.end method

.method public final a(Le/c/a/a0;)V
    .locals 9

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/lang/Object;

    const-string v2, "Image render"

    .line 309
    invoke-static {v2, v1}, Le/c/a/l2;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 310
    iget-object v1, p1, Le/c/a/a0;->r:Le/c/a/b0;

    if-eqz v1, :cond_c

    invoke-virtual {v1}, Le/c/a/b0;->d()Z

    move-result v1

    if-nez v1, :cond_c

    .line 311
    iget-object v1, p1, Le/c/a/a0;->s:Le/c/a/b0;

    if-eqz v1, :cond_c

    invoke-virtual {v1}, Le/c/a/b0;->d()Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_3

    .line 312
    :cond_0
    iget-object v1, p1, Le/c/a/a0;->o:Ljava/lang/String;

    if-nez v1, :cond_1

    return-void

    .line 313
    :cond_1
    iget-object v1, p1, Le/c/a/j1;->n:Le/c/a/m;

    if-eqz v1, :cond_2

    goto :goto_0

    :cond_2
    sget-object v1, Le/c/a/m;->d:Le/c/a/m;

    .line 314
    :goto_0
    iget-object v2, p1, Le/c/a/a0;->o:Ljava/lang/String;

    invoke-virtual {p0, v2}, Le/c/a/l2;->a(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v2

    if-nez v2, :cond_4

    .line 315
    iget-object v2, p0, Le/c/a/l2;->e:Le/c/a/a2;

    invoke-virtual {v2}, Le/c/a/a2;->e()Le/c/a/m2;

    move-result-object v2

    if-nez v2, :cond_3

    return-void

    .line 316
    :cond_3
    iget-object v3, p1, Le/c/a/a0;->o:Ljava/lang/String;

    invoke-virtual {v2, v3}, Le/c/a/m2;->b(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v2

    :cond_4
    if-nez v2, :cond_5

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    .line 317
    iget-object p1, p1, Le/c/a/a0;->o:Ljava/lang/String;

    aput-object p1, v1, v0

    const-string p1, "Could not locate image \'%s\'"

    invoke-static {p1, v1}, Le/c/a/l2;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 318
    :cond_5
    iget-object v0, p0, Le/c/a/l2;->f:Le/c/a/h2;

    invoke-virtual {p0, v0, p1}, Le/c/a/l2;->a(Le/c/a/h2;Le/c/a/f1;)V

    .line 319
    invoke-virtual {p0}, Le/c/a/l2;->c()Z

    move-result v0

    if-nez v0, :cond_6

    return-void

    .line 320
    :cond_6
    invoke-virtual {p0}, Le/c/a/l2;->t()Z

    move-result v0

    if-nez v0, :cond_7

    return-void

    .line 321
    :cond_7
    iget-object v0, p1, Le/c/a/a0;->t:Landroid/graphics/Matrix;

    if-eqz v0, :cond_8

    .line 322
    iget-object v3, p0, Le/c/a/l2;->a:Landroid/graphics/Canvas;

    invoke-virtual {v3, v0}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 323
    :cond_8
    iget-object v0, p1, Le/c/a/a0;->p:Le/c/a/b0;

    const/4 v3, 0x0

    if-eqz v0, :cond_9

    invoke-virtual {v0, p0}, Le/c/a/b0;->b(Le/c/a/l2;)F

    move-result v0

    goto :goto_1

    :cond_9
    const/4 v0, 0x0

    .line 324
    :goto_1
    iget-object v4, p1, Le/c/a/a0;->q:Le/c/a/b0;

    if-eqz v4, :cond_a

    invoke-virtual {v4, p0}, Le/c/a/b0;->c(Le/c/a/l2;)F

    move-result v4

    goto :goto_2

    :cond_a
    const/4 v4, 0x0

    .line 325
    :goto_2
    iget-object v5, p1, Le/c/a/a0;->r:Le/c/a/b0;

    invoke-virtual {v5, p0}, Le/c/a/b0;->b(Le/c/a/l2;)F

    move-result v5

    .line 326
    iget-object v6, p1, Le/c/a/a0;->s:Le/c/a/b0;

    invoke-virtual {v6, p0}, Le/c/a/b0;->b(Le/c/a/l2;)F

    move-result v6

    .line 327
    iget-object v7, p0, Le/c/a/l2;->f:Le/c/a/h2;

    new-instance v8, Le/c/a/n;

    invoke-direct {v8, v0, v4, v5, v6}, Le/c/a/n;-><init>(FFFF)V

    iput-object v8, v7, Le/c/a/h2;->g:Le/c/a/n;

    .line 328
    iget-object v0, p0, Le/c/a/l2;->f:Le/c/a/h2;

    iget-object v0, v0, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v0, v0, Le/c/a/y0;->w:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_b

    .line 329
    iget-object v0, p0, Le/c/a/l2;->f:Le/c/a/h2;

    iget-object v0, v0, Le/c/a/h2;->g:Le/c/a/n;

    iget v4, v0, Le/c/a/n;->b:F

    iget v5, v0, Le/c/a/n;->c:F

    iget v6, v0, Le/c/a/n;->d:F

    iget v0, v0, Le/c/a/n;->e:F

    invoke-virtual {p0, v4, v5, v6, v0}, Le/c/a/l2;->a(FFFF)V

    .line 330
    :cond_b
    new-instance v0, Le/c/a/n;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v4

    int-to-float v4, v4

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v5

    int-to-float v5, v5

    invoke-direct {v0, v3, v3, v4, v5}, Le/c/a/n;-><init>(FFFF)V

    iput-object v0, p1, Le/c/a/e1;->h:Le/c/a/n;

    .line 331
    iget-object v4, p0, Le/c/a/l2;->a:Landroid/graphics/Canvas;

    iget-object v5, p0, Le/c/a/l2;->f:Le/c/a/h2;

    iget-object v5, v5, Le/c/a/h2;->g:Le/c/a/n;

    invoke-virtual {p0, v5, v0, v1}, Le/c/a/l2;->a(Le/c/a/n;Le/c/a/n;Le/c/a/m;)Landroid/graphics/Matrix;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 332
    invoke-virtual {p0, p1}, Le/c/a/l2;->d(Le/c/a/e1;)V

    .line 333
    invoke-virtual {p0, p1}, Le/c/a/l2;->a(Le/c/a/e1;)V

    .line 334
    invoke-virtual {p0}, Le/c/a/l2;->n()Z

    move-result v0

    .line 335
    invoke-virtual {p0}, Le/c/a/l2;->s()V

    .line 336
    iget-object v1, p0, Le/c/a/l2;->a:Landroid/graphics/Canvas;

    iget-object v4, p0, Le/c/a/l2;->f:Le/c/a/h2;

    iget-object v4, v4, Le/c/a/h2;->e:Landroid/graphics/Paint;

    invoke-virtual {v1, v2, v3, v3, v4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    if-eqz v0, :cond_c

    .line 337
    invoke-virtual {p0, p1}, Le/c/a/l2;->c(Le/c/a/e1;)V

    :cond_c
    :goto_3
    return-void
.end method

.method public a(Le/c/a/a2;Le/c/a/n;Le/c/a/m;Z)V
    .locals 6

    .line 1
    iput-object p1, p0, Le/c/a/l2;->e:Le/c/a/a2;

    .line 2
    iput-boolean p4, p0, Le/c/a/l2;->d:Z

    .line 3
    invoke-virtual {p1}, Le/c/a/a2;->f()Le/c/a/z0;

    move-result-object v1

    if-nez v1, :cond_0

    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Object;

    const-string p2, "Nothing to render. Document is empty."

    .line 4
    invoke-static {p2, p1}, Le/c/a/l2;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 5
    :cond_0
    invoke-virtual {p0}, Le/c/a/l2;->p()V

    .line 6
    invoke-virtual {p0, v1}, Le/c/a/l2;->a(Le/c/a/h1;)V

    .line 7
    iget-object v2, v1, Le/c/a/z0;->r:Le/c/a/b0;

    iget-object v3, v1, Le/c/a/z0;->s:Le/c/a/b0;

    if-eqz p2, :cond_1

    goto :goto_0

    .line 8
    :cond_1
    iget-object p2, v1, Le/c/a/l1;->o:Le/c/a/n;

    :goto_0
    move-object v4, p2

    if-eqz p3, :cond_2

    goto :goto_1

    .line 9
    :cond_2
    iget-object p3, v1, Le/c/a/j1;->n:Le/c/a/m;

    :goto_1
    move-object v5, p3

    move-object v0, p0

    .line 10
    invoke-virtual/range {v0 .. v5}, Le/c/a/l2;->a(Le/c/a/z0;Le/c/a/b0;Le/c/a/b0;Le/c/a/n;Le/c/a/m;)V

    return-void
.end method

.method public final a(Le/c/a/d0;Le/c/a/c2;)V
    .locals 11

    .line 552
    invoke-virtual {p0}, Le/c/a/l2;->r()V

    .line 553
    iget-object v0, p1, Le/c/a/d0;->u:Ljava/lang/Float;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    .line 554
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 555
    iget v0, p2, Le/c/a/c2;->c:F

    cmpl-float v0, v0, v1

    if-nez v0, :cond_0

    iget v0, p2, Le/c/a/c2;->d:F

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_2

    .line 556
    :cond_0
    iget v0, p2, Le/c/a/c2;->d:F

    float-to-double v2, v0

    iget v0, p2, Le/c/a/c2;->c:F

    float-to-double v4, v0

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v2

    double-to-float v0, v2

    goto :goto_0

    .line 557
    :cond_1
    iget-object v0, p1, Le/c/a/d0;->u:Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    .line 558
    :goto_0
    iget-boolean v2, p1, Le/c/a/d0;->p:Z

    if-eqz v2, :cond_3

    const/high16 v2, 0x3f800000    # 1.0f

    goto :goto_1

    :cond_3
    iget-object v2, p0, Le/c/a/l2;->f:Le/c/a/h2;

    iget-object v2, v2, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v2, v2, Le/c/a/y0;->h:Le/c/a/b0;

    iget v3, p0, Le/c/a/l2;->c:F

    invoke-virtual {v2, v3}, Le/c/a/b0;->a(F)F

    move-result v2

    .line 559
    :goto_1
    invoke-virtual {p0, p1}, Le/c/a/l2;->b(Le/c/a/h1;)Le/c/a/h2;

    move-result-object v3

    iput-object v3, p0, Le/c/a/l2;->f:Le/c/a/h2;

    .line 560
    new-instance v3, Landroid/graphics/Matrix;

    invoke-direct {v3}, Landroid/graphics/Matrix;-><init>()V

    .line 561
    iget v4, p2, Le/c/a/c2;->a:F

    iget p2, p2, Le/c/a/c2;->b:F

    invoke-virtual {v3, v4, p2}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    .line 562
    invoke-virtual {v3, v0}, Landroid/graphics/Matrix;->preRotate(F)Z

    .line 563
    invoke-virtual {v3, v2, v2}, Landroid/graphics/Matrix;->preScale(FF)Z

    .line 564
    iget-object p2, p1, Le/c/a/d0;->q:Le/c/a/b0;

    if-eqz p2, :cond_4

    invoke-virtual {p2, p0}, Le/c/a/b0;->b(Le/c/a/l2;)F

    move-result p2

    goto :goto_2

    :cond_4
    const/4 p2, 0x0

    .line 565
    :goto_2
    iget-object v0, p1, Le/c/a/d0;->r:Le/c/a/b0;

    if-eqz v0, :cond_5

    invoke-virtual {v0, p0}, Le/c/a/b0;->c(Le/c/a/l2;)F

    move-result v0

    goto :goto_3

    :cond_5
    const/4 v0, 0x0

    .line 566
    :goto_3
    iget-object v2, p1, Le/c/a/d0;->s:Le/c/a/b0;

    const/high16 v4, 0x40400000    # 3.0f

    if-eqz v2, :cond_6

    invoke-virtual {v2, p0}, Le/c/a/b0;->b(Le/c/a/l2;)F

    move-result v2

    goto :goto_4

    :cond_6
    const/high16 v2, 0x40400000    # 3.0f

    .line 567
    :goto_4
    iget-object v5, p1, Le/c/a/d0;->t:Le/c/a/b0;

    if-eqz v5, :cond_7

    invoke-virtual {v5, p0}, Le/c/a/b0;->c(Le/c/a/l2;)F

    move-result v4

    .line 568
    :cond_7
    iget-object v5, p1, Le/c/a/l1;->o:Le/c/a/n;

    if-eqz v5, :cond_e

    .line 569
    iget v6, v5, Le/c/a/n;->d:F

    div-float v6, v2, v6

    .line 570
    iget v5, v5, Le/c/a/n;->e:F

    div-float v5, v4, v5

    .line 571
    iget-object v7, p1, Le/c/a/j1;->n:Le/c/a/m;

    if-eqz v7, :cond_8

    goto :goto_5

    :cond_8
    sget-object v7, Le/c/a/m;->d:Le/c/a/m;

    .line 572
    :goto_5
    sget-object v8, Le/c/a/m;->c:Le/c/a/m;

    invoke-virtual {v7, v8}, Le/c/a/m;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_a

    .line 573
    invoke-virtual {v7}, Le/c/a/m;->b()Le/c/a/l;

    move-result-object v8

    sget-object v9, Le/c/a/l;->c:Le/c/a/l;

    if-ne v8, v9, :cond_9

    invoke-static {v6, v5}, Ljava/lang/Math;->max(FF)F

    move-result v5

    goto :goto_6

    :cond_9
    invoke-static {v6, v5}, Ljava/lang/Math;->min(FF)F

    move-result v5

    :goto_6
    move v6, v5

    move v5, v6

    :cond_a
    neg-float p2, p2

    mul-float p2, p2, v6

    neg-float v0, v0

    mul-float v0, v0, v5

    .line 574
    invoke-virtual {v3, p2, v0}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    .line 575
    iget-object p2, p0, Le/c/a/l2;->a:Landroid/graphics/Canvas;

    invoke-virtual {p2, v3}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 576
    iget-object p2, p1, Le/c/a/l1;->o:Le/c/a/n;

    iget v0, p2, Le/c/a/n;->d:F

    mul-float v0, v0, v6

    .line 577
    iget p2, p2, Le/c/a/n;->e:F

    mul-float p2, p2, v5

    .line 578
    invoke-static {}, Le/c/a/l2;->u()[I

    move-result-object v8

    invoke-virtual {v7}, Le/c/a/m;->a()Le/c/a/k;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    move-result v9

    aget v8, v8, v9

    const/4 v9, 0x3

    const/high16 v10, 0x40000000    # 2.0f

    if-eq v8, v9, :cond_c

    const/4 v9, 0x4

    if-eq v8, v9, :cond_b

    const/4 v9, 0x6

    if-eq v8, v9, :cond_c

    const/4 v9, 0x7

    if-eq v8, v9, :cond_b

    const/16 v9, 0x9

    if-eq v8, v9, :cond_c

    const/16 v9, 0xa

    if-eq v8, v9, :cond_b

    const/4 v0, 0x0

    goto :goto_8

    :cond_b
    sub-float v0, v2, v0

    goto :goto_7

    :cond_c
    sub-float v0, v2, v0

    div-float/2addr v0, v10

    :goto_7
    sub-float v0, v1, v0

    .line 579
    :goto_8
    invoke-static {}, Le/c/a/l2;->u()[I

    move-result-object v8

    .line 580
    invoke-virtual {v7}, Le/c/a/m;->a()Le/c/a/k;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    aget v7, v8, v7

    packed-switch v7, :pswitch_data_0

    goto :goto_a

    :pswitch_0
    sub-float p2, v4, p2

    goto :goto_9

    :pswitch_1
    sub-float p2, v4, p2

    div-float/2addr p2, v10

    :goto_9
    sub-float/2addr v1, p2

    .line 581
    :goto_a
    iget-object p2, p0, Le/c/a/l2;->f:Le/c/a/h2;

    iget-object p2, p2, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object p2, p2, Le/c/a/y0;->w:Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-nez p2, :cond_d

    .line 582
    invoke-virtual {p0, v0, v1, v2, v4}, Le/c/a/l2;->a(FFFF)V

    .line 583
    :cond_d
    invoke-virtual {v3}, Landroid/graphics/Matrix;->reset()V

    .line 584
    invoke-virtual {v3, v6, v5}, Landroid/graphics/Matrix;->preScale(FF)Z

    .line 585
    iget-object p2, p0, Le/c/a/l2;->a:Landroid/graphics/Canvas;

    invoke-virtual {p2, v3}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    goto :goto_b

    :cond_e
    neg-float p2, p2

    neg-float v0, v0

    .line 586
    invoke-virtual {v3, p2, v0}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    .line 587
    iget-object p2, p0, Le/c/a/l2;->a:Landroid/graphics/Canvas;

    invoke-virtual {p2, v3}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 588
    iget-object p2, p0, Le/c/a/l2;->f:Le/c/a/h2;

    iget-object p2, p2, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object p2, p2, Le/c/a/y0;->w:Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-nez p2, :cond_f

    .line 589
    invoke-virtual {p0, v1, v1, v2, v4}, Le/c/a/l2;->a(FFFF)V

    .line 590
    :cond_f
    :goto_b
    invoke-virtual {p0}, Le/c/a/l2;->n()Z

    move-result p2

    const/4 v0, 0x0

    .line 591
    invoke-virtual {p0, p1, v0}, Le/c/a/l2;->a(Le/c/a/d1;Z)V

    if-eqz p2, :cond_10

    .line 592
    invoke-virtual {p0, p1}, Le/c/a/l2;->c(Le/c/a/e1;)V

    .line 593
    :cond_10
    invoke-virtual {p0}, Le/c/a/l2;->q()V

    return-void

    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final a(Le/c/a/d1;)V
    .locals 1

    .line 16
    iget-object v0, p0, Le/c/a/l2;->h:Ljava/util/Stack;

    invoke-virtual {v0, p1}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    iget-object p1, p0, Le/c/a/l2;->i:Ljava/util/Stack;

    iget-object v0, p0, Le/c/a/l2;->a:Landroid/graphics/Canvas;

    invoke-virtual {v0}, Landroid/graphics/Canvas;->getMatrix()Landroid/graphics/Matrix;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final a(Le/c/a/d1;Z)V
    .locals 1

    if-eqz p2, :cond_0

    .line 11
    invoke-virtual {p0, p1}, Le/c/a/l2;->a(Le/c/a/d1;)V

    .line 12
    :cond_0
    invoke-interface {p1}, Le/c/a/d1;->e()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_2

    if-eqz p2, :cond_1

    .line 13
    invoke-virtual {p0}, Le/c/a/l2;->l()V

    :cond_1
    return-void

    .line 14
    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/c/a/h1;

    .line 15
    invoke-virtual {p0, v0}, Le/c/a/l2;->c(Le/c/a/h1;)V

    goto :goto_0
.end method

.method public final a(Le/c/a/e0;Le/c/a/e1;)V
    .locals 8

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/lang/Object;

    const-string v2, "Mask render"

    .line 1007
    invoke-static {v2, v1}, Le/c/a/l2;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1008
    iget-object v1, p1, Le/c/a/e0;->n:Ljava/lang/Boolean;

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const/high16 v3, 0x3f800000    # 1.0f

    if-eqz v1, :cond_5

    .line 1009
    iget-object v1, p1, Le/c/a/e0;->r:Le/c/a/b0;

    if-eqz v1, :cond_1

    invoke-virtual {v1, p0}, Le/c/a/b0;->b(Le/c/a/l2;)F

    move-result v1

    goto :goto_1

    :cond_1
    iget-object v1, p2, Le/c/a/e1;->h:Le/c/a/n;

    iget v1, v1, Le/c/a/n;->d:F

    .line 1010
    :goto_1
    iget-object v4, p1, Le/c/a/e0;->s:Le/c/a/b0;

    if-eqz v4, :cond_2

    invoke-virtual {v4, p0}, Le/c/a/b0;->c(Le/c/a/l2;)F

    move-result v4

    goto :goto_2

    :cond_2
    iget-object v4, p2, Le/c/a/e1;->h:Le/c/a/n;

    iget v4, v4, Le/c/a/n;->e:F

    .line 1011
    :goto_2
    iget-object v5, p1, Le/c/a/e0;->p:Le/c/a/b0;

    if-eqz v5, :cond_3

    invoke-virtual {v5, p0}, Le/c/a/b0;->b(Le/c/a/l2;)F

    goto :goto_3

    :cond_3
    iget-object v5, p2, Le/c/a/e1;->h:Le/c/a/n;

    iget v6, v5, Le/c/a/n;->b:F

    iget v5, v5, Le/c/a/n;->d:F

    .line 1012
    :goto_3
    iget-object v5, p1, Le/c/a/e0;->q:Le/c/a/b0;

    if-eqz v5, :cond_4

    invoke-virtual {v5, p0}, Le/c/a/b0;->c(Le/c/a/l2;)F

    goto :goto_5

    :cond_4
    iget-object v5, p2, Le/c/a/e1;->h:Le/c/a/n;

    iget v6, v5, Le/c/a/n;->c:F

    iget v5, v5, Le/c/a/n;->e:F

    goto :goto_5

    .line 1013
    :cond_5
    iget-object v1, p1, Le/c/a/e0;->p:Le/c/a/b0;

    if-eqz v1, :cond_6

    invoke-virtual {v1, p0, v3}, Le/c/a/b0;->a(Le/c/a/l2;F)F

    .line 1014
    :cond_6
    iget-object v1, p1, Le/c/a/e0;->q:Le/c/a/b0;

    if-eqz v1, :cond_7

    invoke-virtual {v1, p0, v3}, Le/c/a/b0;->a(Le/c/a/l2;F)F

    .line 1015
    :cond_7
    iget-object v1, p1, Le/c/a/e0;->r:Le/c/a/b0;

    const v4, 0x3f99999a    # 1.2f

    if-eqz v1, :cond_8

    invoke-virtual {v1, p0, v3}, Le/c/a/b0;->a(Le/c/a/l2;F)F

    move-result v1

    goto :goto_4

    :cond_8
    const v1, 0x3f99999a    # 1.2f

    .line 1016
    :goto_4
    iget-object v5, p1, Le/c/a/e0;->s:Le/c/a/b0;

    if-eqz v5, :cond_9

    invoke-virtual {v5, p0, v3}, Le/c/a/b0;->a(Le/c/a/l2;F)F

    move-result v4

    .line 1017
    :cond_9
    iget-object v5, p2, Le/c/a/e1;->h:Le/c/a/n;

    iget v6, v5, Le/c/a/n;->b:F

    iget v6, v5, Le/c/a/n;->d:F

    .line 1018
    iget v7, v5, Le/c/a/n;->c:F

    iget v5, v5, Le/c/a/n;->e:F

    mul-float v1, v1, v6

    mul-float v4, v4, v5

    :goto_5
    const/4 v5, 0x0

    cmpl-float v1, v1, v5

    if-eqz v1, :cond_d

    cmpl-float v1, v4, v5

    if-nez v1, :cond_a

    goto :goto_6

    .line 1019
    :cond_a
    invoke-virtual {p0}, Le/c/a/l2;->r()V

    .line 1020
    invoke-virtual {p0, p1}, Le/c/a/l2;->b(Le/c/a/h1;)Le/c/a/h2;

    move-result-object v1

    iput-object v1, p0, Le/c/a/l2;->f:Le/c/a/h2;

    .line 1021
    iget-object v1, v1, Le/c/a/h2;->b:Le/c/a/y0;

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    iput-object v3, v1, Le/c/a/y0;->n:Ljava/lang/Float;

    .line 1022
    iget-object v1, p1, Le/c/a/e0;->o:Ljava/lang/Boolean;

    if-eqz v1, :cond_b

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_b

    const/4 v2, 0x0

    :cond_b
    if-nez v2, :cond_c

    .line 1023
    iget-object v1, p0, Le/c/a/l2;->a:Landroid/graphics/Canvas;

    iget-object v2, p2, Le/c/a/e1;->h:Le/c/a/n;

    iget v3, v2, Le/c/a/n;->b:F

    iget v2, v2, Le/c/a/n;->c:F

    invoke-virtual {v1, v3, v2}, Landroid/graphics/Canvas;->translate(FF)V

    .line 1024
    iget-object v1, p0, Le/c/a/l2;->a:Landroid/graphics/Canvas;

    iget-object p2, p2, Le/c/a/e1;->h:Le/c/a/n;

    iget v2, p2, Le/c/a/n;->d:F

    iget p2, p2, Le/c/a/n;->e:F

    invoke-virtual {v1, v2, p2}, Landroid/graphics/Canvas;->scale(FF)V

    .line 1025
    :cond_c
    invoke-virtual {p0, p1, v0}, Le/c/a/l2;->a(Le/c/a/d1;Z)V

    .line 1026
    invoke-virtual {p0}, Le/c/a/l2;->q()V

    :cond_d
    :goto_6
    return-void
.end method

.method public final a(Le/c/a/e1;)V
    .locals 1

    .line 769
    iget-object v0, p1, Le/c/a/e1;->h:Le/c/a/n;

    invoke-virtual {p0, p1, v0}, Le/c/a/l2;->a(Le/c/a/e1;Le/c/a/n;)V

    return-void
.end method

.method public final a(Le/c/a/e1;Landroid/graphics/Path;)V
    .locals 2

    .line 32
    iget-object v0, p0, Le/c/a/l2;->f:Le/c/a/h2;

    iget-object v0, v0, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v0, v0, Le/c/a/y0;->c:Le/c/a/i1;

    instance-of v1, v0, Le/c/a/g0;

    if-eqz v1, :cond_0

    .line 33
    iget-object v1, p0, Le/c/a/l2;->e:Le/c/a/a2;

    check-cast v0, Le/c/a/g0;

    iget-object v0, v0, Le/c/a/g0;->b:Ljava/lang/String;

    invoke-virtual {v1, v0}, Le/c/a/a2;->b(Ljava/lang/String;)Le/c/a/h1;

    move-result-object v0

    .line 34
    instance-of v1, v0, Le/c/a/k0;

    if-eqz v1, :cond_0

    .line 35
    check-cast v0, Le/c/a/k0;

    .line 36
    invoke-virtual {p0, p1, p2, v0}, Le/c/a/l2;->a(Le/c/a/e1;Landroid/graphics/Path;Le/c/a/k0;)V

    return-void

    .line 37
    :cond_0
    iget-object p1, p0, Le/c/a/l2;->a:Landroid/graphics/Canvas;

    iget-object v0, p0, Le/c/a/l2;->f:Le/c/a/h2;

    iget-object v0, v0, Le/c/a/h2;->e:Landroid/graphics/Paint;

    invoke-virtual {p1, p2, v0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    return-void
.end method

.method public final a(Le/c/a/e1;Landroid/graphics/Path;Le/c/a/k0;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    .line 921
    iget-object v3, v2, Le/c/a/k0;->p:Ljava/lang/Boolean;

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    .line 922
    :goto_0
    iget-object v6, v2, Le/c/a/k0;->w:Ljava/lang/String;

    if-eqz v6, :cond_1

    .line 923
    invoke-virtual {v0, v2, v6}, Le/c/a/l2;->a(Le/c/a/k0;Ljava/lang/String;)V

    :cond_1
    const/4 v6, 0x0

    if-eqz v3, :cond_6

    .line 924
    iget-object v3, v2, Le/c/a/k0;->s:Le/c/a/b0;

    if-eqz v3, :cond_2

    invoke-virtual {v3, v0}, Le/c/a/b0;->b(Le/c/a/l2;)F

    move-result v3

    goto :goto_1

    :cond_2
    const/4 v3, 0x0

    .line 925
    :goto_1
    iget-object v7, v2, Le/c/a/k0;->t:Le/c/a/b0;

    if-eqz v7, :cond_3

    invoke-virtual {v7, v0}, Le/c/a/b0;->c(Le/c/a/l2;)F

    move-result v7

    goto :goto_2

    :cond_3
    const/4 v7, 0x0

    .line 926
    :goto_2
    iget-object v8, v2, Le/c/a/k0;->u:Le/c/a/b0;

    if-eqz v8, :cond_4

    invoke-virtual {v8, v0}, Le/c/a/b0;->b(Le/c/a/l2;)F

    move-result v8

    goto :goto_3

    :cond_4
    const/4 v8, 0x0

    .line 927
    :goto_3
    iget-object v9, v2, Le/c/a/k0;->v:Le/c/a/b0;

    if-eqz v9, :cond_5

    invoke-virtual {v9, v0}, Le/c/a/b0;->c(Le/c/a/l2;)F

    move-result v9

    goto :goto_8

    :cond_5
    const/4 v9, 0x0

    goto :goto_8

    .line 928
    :cond_6
    iget-object v3, v2, Le/c/a/k0;->s:Le/c/a/b0;

    const/high16 v7, 0x3f800000    # 1.0f

    if-eqz v3, :cond_7

    invoke-virtual {v3, v0, v7}, Le/c/a/b0;->a(Le/c/a/l2;F)F

    move-result v3

    goto :goto_4

    :cond_7
    const/4 v3, 0x0

    .line 929
    :goto_4
    iget-object v8, v2, Le/c/a/k0;->t:Le/c/a/b0;

    if-eqz v8, :cond_8

    invoke-virtual {v8, v0, v7}, Le/c/a/b0;->a(Le/c/a/l2;F)F

    move-result v8

    goto :goto_5

    :cond_8
    const/4 v8, 0x0

    .line 930
    :goto_5
    iget-object v9, v2, Le/c/a/k0;->u:Le/c/a/b0;

    if-eqz v9, :cond_9

    invoke-virtual {v9, v0, v7}, Le/c/a/b0;->a(Le/c/a/l2;F)F

    move-result v9

    goto :goto_6

    :cond_9
    const/4 v9, 0x0

    .line 931
    :goto_6
    iget-object v10, v2, Le/c/a/k0;->v:Le/c/a/b0;

    if-eqz v10, :cond_a

    invoke-virtual {v10, v0, v7}, Le/c/a/b0;->a(Le/c/a/l2;F)F

    move-result v7

    goto :goto_7

    :cond_a
    const/4 v7, 0x0

    .line 932
    :goto_7
    iget-object v10, v1, Le/c/a/e1;->h:Le/c/a/n;

    iget v11, v10, Le/c/a/n;->b:F

    iget v12, v10, Le/c/a/n;->d:F

    mul-float v3, v3, v12

    add-float/2addr v3, v11

    .line 933
    iget v11, v10, Le/c/a/n;->c:F

    iget v10, v10, Le/c/a/n;->e:F

    mul-float v8, v8, v10

    add-float/2addr v8, v11

    mul-float v9, v9, v12

    mul-float v7, v7, v10

    move/from16 v16, v9

    move v9, v7

    move v7, v8

    move/from16 v8, v16

    :goto_8
    cmpl-float v10, v8, v6

    if-eqz v10, :cond_1b

    cmpl-float v10, v9, v6

    if-nez v10, :cond_b

    goto/16 :goto_11

    .line 934
    :cond_b
    iget-object v10, v2, Le/c/a/j1;->n:Le/c/a/m;

    if-eqz v10, :cond_c

    goto :goto_9

    :cond_c
    sget-object v10, Le/c/a/m;->d:Le/c/a/m;

    .line 935
    :goto_9
    invoke-virtual/range {p0 .. p0}, Le/c/a/l2;->r()V

    .line 936
    iget-object v11, v0, Le/c/a/l2;->a:Landroid/graphics/Canvas;

    move-object/from16 v12, p2

    invoke-virtual {v11, v12}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z

    .line 937
    new-instance v11, Le/c/a/h2;

    invoke-direct {v11, v0}, Le/c/a/h2;-><init>(Le/c/a/l2;)V

    .line 938
    invoke-static {}, Le/c/a/y0;->a()Le/c/a/y0;

    move-result-object v12

    invoke-virtual {v0, v11, v12}, Le/c/a/l2;->a(Le/c/a/h2;Le/c/a/y0;)V

    .line 939
    iget-object v12, v11, Le/c/a/h2;->b:Le/c/a/y0;

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v13

    iput-object v13, v12, Le/c/a/y0;->w:Ljava/lang/Boolean;

    .line 940
    invoke-virtual {v0, v2, v11}, Le/c/a/l2;->a(Le/c/a/h1;Le/c/a/h2;)Le/c/a/h2;

    iput-object v11, v0, Le/c/a/l2;->f:Le/c/a/h2;

    .line 941
    iget-object v11, v1, Le/c/a/e1;->h:Le/c/a/n;

    .line 942
    iget-object v12, v2, Le/c/a/k0;->r:Landroid/graphics/Matrix;

    if-eqz v12, :cond_12

    .line 943
    iget-object v13, v0, Le/c/a/l2;->a:Landroid/graphics/Canvas;

    invoke-virtual {v13, v12}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 944
    new-instance v12, Landroid/graphics/Matrix;

    invoke-direct {v12}, Landroid/graphics/Matrix;-><init>()V

    .line 945
    iget-object v13, v2, Le/c/a/k0;->r:Landroid/graphics/Matrix;

    invoke-virtual {v13, v12}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    move-result v13

    if-eqz v13, :cond_12

    const/16 v11, 0x8

    new-array v13, v11, [F

    .line 946
    iget-object v11, v1, Le/c/a/e1;->h:Le/c/a/n;

    iget v14, v11, Le/c/a/n;->b:F

    aput v14, v13, v5

    iget v14, v11, Le/c/a/n;->c:F

    aput v14, v13, v4

    .line 947
    invoke-virtual {v11}, Le/c/a/n;->a()F

    move-result v11

    const/4 v14, 0x2

    aput v11, v13, v14

    const/4 v11, 0x3

    iget-object v15, v1, Le/c/a/e1;->h:Le/c/a/n;

    iget v14, v15, Le/c/a/n;->c:F

    aput v14, v13, v11

    const/4 v11, 0x4

    .line 948
    invoke-virtual {v15}, Le/c/a/n;->a()F

    move-result v14

    aput v14, v13, v11

    const/4 v11, 0x5

    iget-object v14, v1, Le/c/a/e1;->h:Le/c/a/n;

    invoke-virtual {v14}, Le/c/a/n;->b()F

    move-result v14

    aput v14, v13, v11

    .line 949
    iget-object v11, v1, Le/c/a/e1;->h:Le/c/a/n;

    iget v14, v11, Le/c/a/n;->b:F

    const/4 v15, 0x6

    aput v14, v13, v15

    const/4 v14, 0x7

    invoke-virtual {v11}, Le/c/a/n;->b()F

    move-result v11

    aput v11, v13, v14

    .line 950
    invoke-virtual {v12, v13}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 951
    new-instance v12, Landroid/graphics/RectF;

    aget v11, v13, v5

    aget v14, v13, v4

    aget v6, v13, v5

    aget v5, v13, v4

    invoke-direct {v12, v11, v14, v6, v5}, Landroid/graphics/RectF;-><init>(FFFF)V

    const/4 v14, 0x2

    :goto_a
    if-le v14, v15, :cond_d

    .line 952
    new-instance v11, Le/c/a/n;

    iget v5, v12, Landroid/graphics/RectF;->left:F

    iget v6, v12, Landroid/graphics/RectF;->top:F

    iget v13, v12, Landroid/graphics/RectF;->right:F

    sub-float/2addr v13, v5

    iget v12, v12, Landroid/graphics/RectF;->bottom:F

    sub-float/2addr v12, v6

    invoke-direct {v11, v5, v6, v13, v12}, Le/c/a/n;-><init>(FFFF)V

    goto :goto_b

    .line 953
    :cond_d
    aget v5, v13, v14

    iget v6, v12, Landroid/graphics/RectF;->left:F

    cmpg-float v5, v5, v6

    if-gez v5, :cond_e

    aget v5, v13, v14

    iput v5, v12, Landroid/graphics/RectF;->left:F

    .line 954
    :cond_e
    aget v5, v13, v14

    iget v6, v12, Landroid/graphics/RectF;->right:F

    cmpl-float v5, v5, v6

    if-lez v5, :cond_f

    aget v5, v13, v14

    iput v5, v12, Landroid/graphics/RectF;->right:F

    :cond_f
    add-int/lit8 v5, v14, 0x1

    .line 955
    aget v6, v13, v5

    iget v11, v12, Landroid/graphics/RectF;->top:F

    cmpg-float v6, v6, v11

    if-gez v6, :cond_10

    aget v6, v13, v5

    iput v6, v12, Landroid/graphics/RectF;->top:F

    .line 956
    :cond_10
    aget v6, v13, v5

    iget v11, v12, Landroid/graphics/RectF;->bottom:F

    cmpl-float v6, v6, v11

    if-lez v6, :cond_11

    aget v5, v13, v5

    iput v5, v12, Landroid/graphics/RectF;->bottom:F

    :cond_11
    add-int/lit8 v14, v14, 0x2

    goto :goto_a

    .line 957
    :cond_12
    :goto_b
    iget v5, v11, Le/c/a/n;->b:F

    sub-float/2addr v5, v3

    div-float/2addr v5, v8

    float-to-double v5, v5

    invoke-static {v5, v6}, Ljava/lang/Math;->floor(D)D

    move-result-wide v5

    double-to-float v5, v5

    mul-float v5, v5, v8

    add-float/2addr v3, v5

    .line 958
    iget v5, v11, Le/c/a/n;->c:F

    sub-float/2addr v5, v7

    div-float/2addr v5, v9

    float-to-double v5, v5

    invoke-static {v5, v6}, Ljava/lang/Math;->floor(D)D

    move-result-wide v5

    double-to-float v5, v5

    mul-float v5, v5, v9

    add-float/2addr v7, v5

    .line 959
    invoke-virtual {v11}, Le/c/a/n;->a()F

    move-result v5

    .line 960
    invoke-virtual {v11}, Le/c/a/n;->b()F

    move-result v6

    .line 961
    new-instance v11, Le/c/a/n;

    const/4 v12, 0x0

    invoke-direct {v11, v12, v12, v8, v9}, Le/c/a/n;-><init>(FFFF)V

    :goto_c
    cmpg-float v12, v7, v6

    if-ltz v12, :cond_13

    .line 962
    invoke-virtual/range {p0 .. p0}, Le/c/a/l2;->q()V

    return-void

    :cond_13
    move v12, v3

    :goto_d
    cmpg-float v13, v12, v5

    if-ltz v13, :cond_14

    add-float/2addr v7, v9

    goto :goto_c

    .line 963
    :cond_14
    iput v12, v11, Le/c/a/n;->b:F

    .line 964
    iput v7, v11, Le/c/a/n;->c:F

    .line 965
    invoke-virtual/range {p0 .. p0}, Le/c/a/l2;->r()V

    .line 966
    iget-object v13, v0, Le/c/a/l2;->f:Le/c/a/h2;

    iget-object v13, v13, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v13, v13, Le/c/a/y0;->w:Ljava/lang/Boolean;

    invoke-virtual {v13}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v13

    if-nez v13, :cond_15

    .line 967
    iget v13, v11, Le/c/a/n;->b:F

    iget v14, v11, Le/c/a/n;->c:F

    iget v15, v11, Le/c/a/n;->d:F

    iget v4, v11, Le/c/a/n;->e:F

    invoke-virtual {v0, v13, v14, v15, v4}, Le/c/a/l2;->a(FFFF)V

    .line 968
    :cond_15
    iget-object v4, v2, Le/c/a/l1;->o:Le/c/a/n;

    if-eqz v4, :cond_16

    .line 969
    iget-object v13, v0, Le/c/a/l2;->a:Landroid/graphics/Canvas;

    invoke-virtual {v0, v11, v4, v10}, Le/c/a/l2;->a(Le/c/a/n;Le/c/a/n;Le/c/a/m;)Landroid/graphics/Matrix;

    move-result-object v4

    invoke-virtual {v13, v4}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    goto :goto_f

    .line 970
    :cond_16
    iget-object v4, v2, Le/c/a/k0;->q:Ljava/lang/Boolean;

    if-eqz v4, :cond_17

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-nez v4, :cond_17

    const/4 v4, 0x0

    goto :goto_e

    :cond_17
    const/4 v4, 0x1

    .line 971
    :goto_e
    iget-object v13, v0, Le/c/a/l2;->a:Landroid/graphics/Canvas;

    invoke-virtual {v13, v12, v7}, Landroid/graphics/Canvas;->translate(FF)V

    if-nez v4, :cond_18

    .line 972
    iget-object v4, v0, Le/c/a/l2;->a:Landroid/graphics/Canvas;

    iget-object v13, v1, Le/c/a/e1;->h:Le/c/a/n;

    iget v14, v13, Le/c/a/n;->d:F

    iget v13, v13, Le/c/a/n;->e:F

    invoke-virtual {v4, v14, v13}, Landroid/graphics/Canvas;->scale(FF)V

    .line 973
    :cond_18
    :goto_f
    invoke-virtual/range {p0 .. p0}, Le/c/a/l2;->n()Z

    move-result v4

    .line 974
    iget-object v13, v2, Le/c/a/b1;->i:Ljava/util/List;

    invoke-interface {v13}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_10
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-nez v14, :cond_1a

    if-eqz v4, :cond_19

    .line 975
    invoke-virtual {v0, v2}, Le/c/a/l2;->c(Le/c/a/e1;)V

    .line 976
    :cond_19
    invoke-virtual/range {p0 .. p0}, Le/c/a/l2;->q()V

    add-float/2addr v12, v8

    const/4 v4, 0x1

    goto :goto_d

    .line 977
    :cond_1a
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Le/c/a/h1;

    .line 978
    invoke-virtual {v0, v14}, Le/c/a/l2;->c(Le/c/a/h1;)V

    goto :goto_10

    :cond_1b
    :goto_11
    return-void
.end method

.method public final a(Le/c/a/e1;Le/c/a/n;)V
    .locals 5

    .line 770
    iget-object v0, p0, Le/c/a/l2;->f:Le/c/a/h2;

    iget-object v0, v0, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v0, v0, Le/c/a/y0;->F:Ljava/lang/String;

    if-nez v0, :cond_0

    return-void

    .line 771
    :cond_0
    iget-object v1, p1, Le/c/a/h1;->a:Le/c/a/a2;

    invoke-virtual {v1, v0}, Le/c/a/a2;->b(Ljava/lang/String;)Le/c/a/h1;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_1

    new-array p1, v1, [Ljava/lang/Object;

    .line 772
    iget-object p2, p0, Le/c/a/l2;->f:Le/c/a/h2;

    iget-object p2, p2, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object p2, p2, Le/c/a/y0;->F:Ljava/lang/String;

    aput-object p2, p1, v2

    const-string p2, "ClipPath reference \'%s\' not found"

    invoke-static {p2, p1}, Le/c/a/l2;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 773
    :cond_1
    check-cast v0, Le/c/a/q;

    .line 774
    iget-object v3, v0, Le/c/a/b1;->i:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 775
    iget-object p1, p0, Le/c/a/l2;->a:Landroid/graphics/Canvas;

    invoke-virtual {p1, v2, v2, v2, v2}, Landroid/graphics/Canvas;->clipRect(IIII)Z

    return-void

    .line 776
    :cond_2
    iget-object v3, v0, Le/c/a/q;->o:Ljava/lang/Boolean;

    if-eqz v3, :cond_3

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-nez v3, :cond_3

    const/4 v3, 0x0

    goto :goto_0

    :cond_3
    const/4 v3, 0x1

    .line 777
    :goto_0
    instance-of v4, p1, Le/c/a/y;

    if-eqz v4, :cond_4

    if-nez v3, :cond_4

    new-array p2, v1, [Ljava/lang/Object;

    .line 778
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    aput-object p1, p2, v2

    const-string p1, "<clipPath clipPathUnits=\"objectBoundingBox\"> is not supported when referenced from container elements (like %s)"

    invoke-static {p1, p2}, Le/c/a/l2;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 779
    :cond_4
    invoke-virtual {p0}, Le/c/a/l2;->b()V

    if-nez v3, :cond_5

    .line 780
    new-instance p1, Landroid/graphics/Matrix;

    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    .line 781
    iget v2, p2, Le/c/a/n;->b:F

    iget v3, p2, Le/c/a/n;->c:F

    invoke-virtual {p1, v2, v3}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    .line 782
    iget v2, p2, Le/c/a/n;->d:F

    iget p2, p2, Le/c/a/n;->e:F

    invoke-virtual {p1, v2, p2}, Landroid/graphics/Matrix;->preScale(FF)Z

    .line 783
    iget-object p2, p0, Le/c/a/l2;->a:Landroid/graphics/Canvas;

    invoke-virtual {p2, p1}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 784
    :cond_5
    iget-object p1, v0, Le/c/a/y;->n:Landroid/graphics/Matrix;

    if-eqz p1, :cond_6

    .line 785
    iget-object p2, p0, Le/c/a/l2;->a:Landroid/graphics/Canvas;

    invoke-virtual {p2, p1}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 786
    :cond_6
    invoke-virtual {p0, v0}, Le/c/a/l2;->b(Le/c/a/h1;)Le/c/a/h2;

    move-result-object p1

    iput-object p1, p0, Le/c/a/l2;->f:Le/c/a/h2;

    .line 787
    invoke-virtual {p0, v0}, Le/c/a/l2;->a(Le/c/a/e1;)V

    .line 788
    new-instance p1, Landroid/graphics/Path;

    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    .line 789
    iget-object p2, v0, Le/c/a/b1;->i:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_7

    .line 790
    iget-object p2, p0, Le/c/a/l2;->a:Landroid/graphics/Canvas;

    invoke-virtual {p2, p1}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z

    .line 791
    invoke-virtual {p0}, Le/c/a/l2;->a()V

    return-void

    .line 792
    :cond_7
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/c/a/h1;

    .line 793
    new-instance v2, Landroid/graphics/Matrix;

    invoke-direct {v2}, Landroid/graphics/Matrix;-><init>()V

    invoke-virtual {p0, v0, v1, p1, v2}, Le/c/a/l2;->a(Le/c/a/h1;ZLandroid/graphics/Path;Landroid/graphics/Matrix;)V

    goto :goto_1
.end method

.method public final a(Le/c/a/g1;Le/c/a/g1;)V
    .locals 1

    .line 737
    iget-object v0, p1, Le/c/a/g1;->m:Le/c/a/b0;

    if-nez v0, :cond_0

    .line 738
    iget-object v0, p2, Le/c/a/g1;->m:Le/c/a/b0;

    iput-object v0, p1, Le/c/a/g1;->m:Le/c/a/b0;

    .line 739
    :cond_0
    iget-object v0, p1, Le/c/a/g1;->n:Le/c/a/b0;

    if-nez v0, :cond_1

    .line 740
    iget-object v0, p2, Le/c/a/g1;->n:Le/c/a/b0;

    iput-object v0, p1, Le/c/a/g1;->n:Le/c/a/b0;

    .line 741
    :cond_1
    iget-object v0, p1, Le/c/a/g1;->o:Le/c/a/b0;

    if-nez v0, :cond_2

    .line 742
    iget-object v0, p2, Le/c/a/g1;->o:Le/c/a/b0;

    iput-object v0, p1, Le/c/a/g1;->o:Le/c/a/b0;

    .line 743
    :cond_2
    iget-object v0, p1, Le/c/a/g1;->p:Le/c/a/b0;

    if-nez v0, :cond_3

    .line 744
    iget-object p2, p2, Le/c/a/g1;->p:Le/c/a/b0;

    iput-object p2, p1, Le/c/a/g1;->p:Le/c/a/b0;

    :cond_3
    return-void
.end method

.method public final a(Le/c/a/h0;)V
    .locals 3

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "Path render"

    .line 119
    invoke-static {v1, v0}, Le/c/a/l2;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 120
    iget-object v0, p0, Le/c/a/l2;->f:Le/c/a/h2;

    invoke-virtual {p0, v0, p1}, Le/c/a/l2;->a(Le/c/a/h2;Le/c/a/f1;)V

    .line 121
    invoke-virtual {p0}, Le/c/a/l2;->c()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 122
    :cond_0
    invoke-virtual {p0}, Le/c/a/l2;->t()Z

    move-result v0

    if-nez v0, :cond_1

    return-void

    .line 123
    :cond_1
    iget-object v0, p0, Le/c/a/l2;->f:Le/c/a/h2;

    iget-boolean v1, v0, Le/c/a/h2;->d:Z

    if-nez v1, :cond_2

    iget-boolean v0, v0, Le/c/a/h2;->c:Z

    if-nez v0, :cond_2

    return-void

    .line 124
    :cond_2
    iget-object v0, p1, Le/c/a/x;->n:Landroid/graphics/Matrix;

    if-eqz v0, :cond_3

    .line 125
    iget-object v1, p0, Le/c/a/l2;->a:Landroid/graphics/Canvas;

    invoke-virtual {v1, v0}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 126
    :cond_3
    new-instance v0, Le/c/a/d2;

    iget-object v1, p1, Le/c/a/h0;->o:Le/c/a/i0;

    invoke-direct {v0, p0, v1}, Le/c/a/d2;-><init>(Le/c/a/l2;Le/c/a/i0;)V

    invoke-virtual {v0}, Le/c/a/d2;->a()Landroid/graphics/Path;

    move-result-object v0

    .line 127
    iget-object v1, p1, Le/c/a/e1;->h:Le/c/a/n;

    if-nez v1, :cond_4

    .line 128
    invoke-virtual {p0, v0}, Le/c/a/l2;->a(Landroid/graphics/Path;)Le/c/a/n;

    move-result-object v1

    iput-object v1, p1, Le/c/a/e1;->h:Le/c/a/n;

    .line 129
    :cond_4
    invoke-virtual {p0, p1}, Le/c/a/l2;->d(Le/c/a/e1;)V

    .line 130
    invoke-virtual {p0, p1}, Le/c/a/l2;->b(Le/c/a/e1;)V

    .line 131
    invoke-virtual {p0, p1}, Le/c/a/l2;->a(Le/c/a/e1;)V

    .line 132
    invoke-virtual {p0}, Le/c/a/l2;->n()Z

    move-result v1

    .line 133
    iget-object v2, p0, Le/c/a/l2;->f:Le/c/a/h2;

    iget-boolean v2, v2, Le/c/a/h2;->c:Z

    if-eqz v2, :cond_5

    .line 134
    invoke-virtual {p0}, Le/c/a/l2;->k()Landroid/graphics/Path$FillType;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/graphics/Path;->setFillType(Landroid/graphics/Path$FillType;)V

    .line 135
    invoke-virtual {p0, p1, v0}, Le/c/a/l2;->a(Le/c/a/e1;Landroid/graphics/Path;)V

    .line 136
    :cond_5
    iget-object v2, p0, Le/c/a/l2;->f:Le/c/a/h2;

    iget-boolean v2, v2, Le/c/a/h2;->d:Z

    if-eqz v2, :cond_6

    .line 137
    invoke-virtual {p0, v0}, Le/c/a/l2;->b(Landroid/graphics/Path;)V

    .line 138
    :cond_6
    invoke-virtual {p0, p1}, Le/c/a/l2;->a(Le/c/a/x;)V

    if-eqz v1, :cond_7

    .line 139
    invoke-virtual {p0, p1}, Le/c/a/l2;->c(Le/c/a/e1;)V

    :cond_7
    return-void
.end method

.method public final a(Le/c/a/h0;Landroid/graphics/Path;Landroid/graphics/Matrix;)V
    .locals 2

    .line 809
    iget-object v0, p0, Le/c/a/l2;->f:Le/c/a/h2;

    invoke-virtual {p0, v0, p1}, Le/c/a/l2;->a(Le/c/a/h2;Le/c/a/f1;)V

    .line 810
    invoke-virtual {p0}, Le/c/a/l2;->c()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 811
    :cond_0
    invoke-virtual {p0}, Le/c/a/l2;->t()Z

    move-result v0

    if-nez v0, :cond_1

    return-void

    .line 812
    :cond_1
    iget-object v0, p1, Le/c/a/x;->n:Landroid/graphics/Matrix;

    if-eqz v0, :cond_2

    .line 813
    invoke-virtual {p3, v0}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    .line 814
    :cond_2
    new-instance v0, Le/c/a/d2;

    iget-object v1, p1, Le/c/a/h0;->o:Le/c/a/i0;

    invoke-direct {v0, p0, v1}, Le/c/a/d2;-><init>(Le/c/a/l2;Le/c/a/i0;)V

    invoke-virtual {v0}, Le/c/a/d2;->a()Landroid/graphics/Path;

    move-result-object v0

    .line 815
    iget-object v1, p1, Le/c/a/e1;->h:Le/c/a/n;

    if-nez v1, :cond_3

    .line 816
    invoke-virtual {p0, v0}, Le/c/a/l2;->a(Landroid/graphics/Path;)Le/c/a/n;

    move-result-object v1

    iput-object v1, p1, Le/c/a/e1;->h:Le/c/a/n;

    .line 817
    :cond_3
    invoke-virtual {p0, p1}, Le/c/a/l2;->a(Le/c/a/e1;)V

    .line 818
    invoke-virtual {p0}, Le/c/a/l2;->f()Landroid/graphics/Path$FillType;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/graphics/Path;->setFillType(Landroid/graphics/Path$FillType;)V

    .line 819
    invoke-virtual {p2, v0, p3}, Landroid/graphics/Path;->addPath(Landroid/graphics/Path;Landroid/graphics/Matrix;)V

    return-void
.end method

.method public final a(Le/c/a/h1;)V
    .locals 1

    .line 28
    instance-of v0, p1, Le/c/a/f1;

    if-nez v0, :cond_0

    return-void

    .line 29
    :cond_0
    check-cast p1, Le/c/a/f1;

    .line 30
    iget-object p1, p1, Le/c/a/f1;->d:Ljava/lang/Boolean;

    if-eqz p1, :cond_1

    .line 31
    iget-object v0, p0, Le/c/a/l2;->f:Le/c/a/h2;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iput-boolean p1, v0, Le/c/a/h2;->i:Z

    :cond_1
    return-void
.end method

.method public final a(Le/c/a/h1;Le/c/a/j2;)V
    .locals 7

    .line 218
    move-object v0, p1

    check-cast v0, Le/c/a/s1;

    invoke-virtual {p2, v0}, Le/c/a/j2;->a(Le/c/a/s1;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 219
    :cond_0
    instance-of v0, p1, Le/c/a/t1;

    if-eqz v0, :cond_1

    .line 220
    invoke-virtual {p0}, Le/c/a/l2;->r()V

    .line 221
    check-cast p1, Le/c/a/t1;

    invoke-virtual {p0, p1}, Le/c/a/l2;->a(Le/c/a/t1;)V

    .line 222
    invoke-virtual {p0}, Le/c/a/l2;->q()V

    goto/16 :goto_9

    .line 223
    :cond_1
    instance-of v0, p1, Le/c/a/p1;

    const/4 v1, 0x0

    if-eqz v0, :cond_d

    new-array v0, v1, [Ljava/lang/Object;

    const-string v2, "TSpan render"

    .line 224
    invoke-static {v2, v0}, Le/c/a/l2;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 225
    invoke-virtual {p0}, Le/c/a/l2;->r()V

    .line 226
    check-cast p1, Le/c/a/p1;

    .line 227
    iget-object v0, p0, Le/c/a/l2;->f:Le/c/a/h2;

    invoke-virtual {p0, v0, p1}, Le/c/a/l2;->a(Le/c/a/h2;Le/c/a/f1;)V

    .line 228
    invoke-virtual {p0}, Le/c/a/l2;->c()Z

    move-result v0

    if-eqz v0, :cond_c

    .line 229
    instance-of v0, p2, Le/c/a/f2;

    const/4 v2, 0x0

    if-eqz v0, :cond_a

    .line 230
    iget-object v3, p1, Le/c/a/u1;->n:Ljava/util/List;

    if-eqz v3, :cond_3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-nez v3, :cond_2

    goto :goto_0

    :cond_2
    iget-object v3, p1, Le/c/a/u1;->n:Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Le/c/a/b0;

    invoke-virtual {v3, p0}, Le/c/a/b0;->b(Le/c/a/l2;)F

    move-result v3

    goto :goto_1

    :cond_3
    :goto_0
    move-object v3, p2

    check-cast v3, Le/c/a/f2;

    iget v3, v3, Le/c/a/f2;->a:F

    .line 231
    :goto_1
    iget-object v4, p1, Le/c/a/u1;->o:Ljava/util/List;

    if-eqz v4, :cond_5

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-nez v4, :cond_4

    goto :goto_2

    :cond_4
    iget-object v4, p1, Le/c/a/u1;->o:Ljava/util/List;

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Le/c/a/b0;

    invoke-virtual {v4, p0}, Le/c/a/b0;->c(Le/c/a/l2;)F

    move-result v4

    goto :goto_3

    :cond_5
    :goto_2
    move-object v4, p2

    check-cast v4, Le/c/a/f2;

    iget v4, v4, Le/c/a/f2;->b:F

    .line 232
    :goto_3
    iget-object v5, p1, Le/c/a/u1;->p:Ljava/util/List;

    if-eqz v5, :cond_7

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    if-nez v5, :cond_6

    goto :goto_4

    :cond_6
    iget-object v5, p1, Le/c/a/u1;->p:Ljava/util/List;

    invoke-interface {v5, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Le/c/a/b0;

    invoke-virtual {v5, p0}, Le/c/a/b0;->b(Le/c/a/l2;)F

    move-result v5

    goto :goto_5

    :cond_7
    :goto_4
    const/4 v5, 0x0

    .line 233
    :goto_5
    iget-object v6, p1, Le/c/a/u1;->q:Ljava/util/List;

    if-eqz v6, :cond_9

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    if-nez v6, :cond_8

    goto :goto_6

    :cond_8
    iget-object v2, p1, Le/c/a/u1;->q:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le/c/a/b0;

    invoke-virtual {v1, p0}, Le/c/a/b0;->c(Le/c/a/l2;)F

    move-result v1

    move v2, v1

    :cond_9
    :goto_6
    move v1, v2

    move v2, v3

    goto :goto_7

    :cond_a
    const/4 v1, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    .line 234
    :goto_7
    invoke-virtual {p1}, Le/c/a/p1;->d()Le/c/a/v1;

    move-result-object v3

    check-cast v3, Le/c/a/e1;

    invoke-virtual {p0, v3}, Le/c/a/l2;->b(Le/c/a/e1;)V

    if-eqz v0, :cond_b

    .line 235
    move-object v0, p2

    check-cast v0, Le/c/a/f2;

    add-float/2addr v2, v5

    iput v2, v0, Le/c/a/f2;->a:F

    add-float/2addr v4, v1

    .line 236
    iput v4, v0, Le/c/a/f2;->b:F

    .line 237
    :cond_b
    invoke-virtual {p0}, Le/c/a/l2;->n()Z

    move-result v0

    .line 238
    invoke-virtual {p0, p1, p2}, Le/c/a/l2;->a(Le/c/a/s1;Le/c/a/j2;)V

    if-eqz v0, :cond_c

    .line 239
    invoke-virtual {p0, p1}, Le/c/a/l2;->c(Le/c/a/e1;)V

    .line 240
    :cond_c
    invoke-virtual {p0}, Le/c/a/l2;->q()V

    goto :goto_9

    .line 241
    :cond_d
    instance-of v0, p1, Le/c/a/o1;

    if-eqz v0, :cond_10

    .line 242
    invoke-virtual {p0}, Le/c/a/l2;->r()V

    .line 243
    move-object v0, p1

    check-cast v0, Le/c/a/o1;

    .line 244
    iget-object v2, p0, Le/c/a/l2;->f:Le/c/a/h2;

    invoke-virtual {p0, v2, v0}, Le/c/a/l2;->a(Le/c/a/h2;Le/c/a/f1;)V

    .line 245
    invoke-virtual {p0}, Le/c/a/l2;->c()Z

    move-result v2

    if-eqz v2, :cond_f

    .line 246
    invoke-virtual {v0}, Le/c/a/o1;->d()Le/c/a/v1;

    move-result-object v2

    check-cast v2, Le/c/a/e1;

    invoke-virtual {p0, v2}, Le/c/a/l2;->b(Le/c/a/e1;)V

    .line 247
    iget-object p1, p1, Le/c/a/h1;->a:Le/c/a/a2;

    iget-object v2, v0, Le/c/a/o1;->n:Ljava/lang/String;

    invoke-virtual {p1, v2}, Le/c/a/a2;->b(Ljava/lang/String;)Le/c/a/h1;

    move-result-object p1

    if-eqz p1, :cond_e

    .line 248
    instance-of v2, p1, Le/c/a/s1;

    if-eqz v2, :cond_e

    .line 249
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 250
    check-cast p1, Le/c/a/s1;

    invoke-virtual {p0, p1, v0}, Le/c/a/l2;->a(Le/c/a/s1;Ljava/lang/StringBuilder;)V

    .line 251
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result p1

    if-lez p1, :cond_f

    .line 252
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Le/c/a/j2;->a(Ljava/lang/String;)V

    goto :goto_8

    :cond_e
    const/4 p1, 0x1

    new-array p1, p1, [Ljava/lang/Object;

    .line 253
    iget-object p2, v0, Le/c/a/o1;->n:Ljava/lang/String;

    aput-object p2, p1, v1

    const-string p2, "Tref reference \'%s\' not found"

    invoke-static {p2, p1}, Le/c/a/l2;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 254
    :cond_f
    :goto_8
    invoke-virtual {p0}, Le/c/a/l2;->q()V

    :cond_10
    :goto_9
    return-void
.end method

.method public final a(Le/c/a/h1;ZLandroid/graphics/Path;Landroid/graphics/Matrix;)V
    .locals 2

    .line 794
    invoke-virtual {p0}, Le/c/a/l2;->c()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 795
    :cond_0
    invoke-virtual {p0}, Le/c/a/l2;->b()V

    .line 796
    instance-of v0, p1, Le/c/a/y1;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    if-eqz p2, :cond_1

    .line 797
    check-cast p1, Le/c/a/y1;

    invoke-virtual {p0, p1, p3, p4}, Le/c/a/l2;->a(Le/c/a/y1;Landroid/graphics/Path;Landroid/graphics/Matrix;)V

    goto :goto_0

    :cond_1
    new-array p1, v1, [Ljava/lang/Object;

    const-string p2, "<use> elements inside a <clipPath> cannot reference another <use>"

    .line 798
    invoke-static {p2, p1}, Le/c/a/l2;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 799
    :cond_2
    instance-of p2, p1, Le/c/a/h0;

    if-eqz p2, :cond_3

    .line 800
    check-cast p1, Le/c/a/h0;

    invoke-virtual {p0, p1, p3, p4}, Le/c/a/l2;->a(Le/c/a/h0;Landroid/graphics/Path;Landroid/graphics/Matrix;)V

    goto :goto_0

    .line 801
    :cond_3
    instance-of p2, p1, Le/c/a/q1;

    if-eqz p2, :cond_4

    .line 802
    check-cast p1, Le/c/a/q1;

    invoke-virtual {p0, p1, p3, p4}, Le/c/a/l2;->a(Le/c/a/q1;Landroid/graphics/Path;Landroid/graphics/Matrix;)V

    goto :goto_0

    .line 803
    :cond_4
    instance-of p2, p1, Le/c/a/x;

    if-eqz p2, :cond_5

    .line 804
    check-cast p1, Le/c/a/x;

    invoke-virtual {p0, p1, p3, p4}, Le/c/a/l2;->a(Le/c/a/x;Landroid/graphics/Path;Landroid/graphics/Matrix;)V

    goto :goto_0

    :cond_5
    const/4 p2, 0x1

    new-array p2, p2, [Ljava/lang/Object;

    .line 805
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    aput-object p1, p2, v1

    const-string p1, "Invalid %s element found in clipPath definition"

    invoke-static {p1, p2}, Le/c/a/l2;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 806
    :goto_0
    invoke-virtual {p0}, Le/c/a/l2;->a()V

    return-void
.end method

.method public final a(Le/c/a/h2;Le/c/a/f1;)V
    .locals 3

    .line 18
    iget-object v0, p2, Le/c/a/h1;->b:Le/c/a/d1;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 19
    :goto_0
    iget-object v1, p1, Le/c/a/h2;->b:Le/c/a/y0;

    invoke-virtual {v1, v0}, Le/c/a/y0;->a(Z)V

    .line 20
    iget-object v0, p2, Le/c/a/f1;->e:Le/c/a/y0;

    if-eqz v0, :cond_1

    .line 21
    invoke-virtual {p0, p1, v0}, Le/c/a/l2;->a(Le/c/a/h2;Le/c/a/y0;)V

    .line 22
    :cond_1
    iget-object v0, p0, Le/c/a/l2;->e:Le/c/a/a2;

    invoke-virtual {v0}, Le/c/a/a2;->g()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 23
    iget-object v0, p0, Le/c/a/l2;->e:Le/c/a/a2;

    invoke-virtual {v0}, Le/c/a/a2;->a()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_2

    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le/c/a/f;

    .line 24
    iget-object v2, v1, Le/c/a/f;->a:Le/c/a/h;

    invoke-static {v2, p2}, Le/c/a/j;->a(Le/c/a/h;Le/c/a/f1;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 25
    iget-object v1, v1, Le/c/a/f;->b:Le/c/a/y0;

    invoke-virtual {p0, p1, v1}, Le/c/a/l2;->a(Le/c/a/h2;Le/c/a/y0;)V

    goto :goto_1

    .line 26
    :cond_4
    :goto_2
    iget-object p2, p2, Le/c/a/f1;->f:Le/c/a/y0;

    if-eqz p2, :cond_5

    .line 27
    invoke-virtual {p0, p1, p2}, Le/c/a/l2;->a(Le/c/a/h2;Le/c/a/y0;)V

    :cond_5
    return-void
.end method

.method public final a(Le/c/a/h2;Le/c/a/y0;)V
    .locals 11

    const-wide/16 v0, 0x1000

    .line 369
    invoke-virtual {p0, p2, v0, v1}, Le/c/a/l2;->a(Le/c/a/y0;J)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 370
    iget-object v0, p1, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v1, p2, Le/c/a/y0;->o:Le/c/a/r;

    iput-object v1, v0, Le/c/a/y0;->o:Le/c/a/r;

    :cond_0
    const-wide/16 v0, 0x800

    .line 371
    invoke-virtual {p0, p2, v0, v1}, Le/c/a/l2;->a(Le/c/a/y0;J)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 372
    iget-object v0, p1, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v1, p2, Le/c/a/y0;->n:Ljava/lang/Float;

    iput-object v1, v0, Le/c/a/y0;->n:Ljava/lang/Float;

    :cond_1
    const-wide/16 v0, 0x1

    .line 373
    invoke-virtual {p0, p2, v0, v1}, Le/c/a/l2;->a(Le/c/a/y0;J)Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_3

    .line 374
    iget-object v0, p1, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v3, p2, Le/c/a/y0;->c:Le/c/a/i1;

    iput-object v3, v0, Le/c/a/y0;->c:Le/c/a/i1;

    .line 375
    iget-object v0, p2, Le/c/a/y0;->c:Le/c/a/i1;

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p1, Le/c/a/h2;->c:Z

    :cond_3
    const-wide/16 v3, 0x4

    .line 376
    invoke-virtual {p0, p2, v3, v4}, Le/c/a/l2;->a(Le/c/a/y0;J)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 377
    iget-object v0, p1, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v3, p2, Le/c/a/y0;->e:Ljava/lang/Float;

    iput-object v3, v0, Le/c/a/y0;->e:Ljava/lang/Float;

    :cond_4
    const-wide/16 v3, 0x1805

    .line 378
    invoke-virtual {p0, p2, v3, v4}, Le/c/a/l2;->a(Le/c/a/y0;J)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 379
    iget-object v0, p1, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v0, v0, Le/c/a/y0;->c:Le/c/a/i1;

    invoke-virtual {p0, p1, v2, v0}, Le/c/a/l2;->a(Le/c/a/h2;ZLe/c/a/i1;)V

    :cond_5
    const-wide/16 v3, 0x2

    .line 380
    invoke-virtual {p0, p2, v3, v4}, Le/c/a/l2;->a(Le/c/a/y0;J)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 381
    iget-object v0, p1, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v3, p2, Le/c/a/y0;->d:Le/c/a/q0;

    iput-object v3, v0, Le/c/a/y0;->d:Le/c/a/q0;

    :cond_6
    const-wide/16 v3, 0x8

    .line 382
    invoke-virtual {p0, p2, v3, v4}, Le/c/a/l2;->a(Le/c/a/y0;J)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 383
    iget-object v0, p1, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v3, p2, Le/c/a/y0;->f:Le/c/a/i1;

    iput-object v3, v0, Le/c/a/y0;->f:Le/c/a/i1;

    .line 384
    iget-object v0, p2, Le/c/a/y0;->f:Le/c/a/i1;

    if-eqz v0, :cond_7

    const/4 v0, 0x1

    goto :goto_1

    :cond_7
    const/4 v0, 0x0

    :goto_1
    iput-boolean v0, p1, Le/c/a/h2;->d:Z

    :cond_8
    const-wide/16 v3, 0x10

    .line 385
    invoke-virtual {p0, p2, v3, v4}, Le/c/a/l2;->a(Le/c/a/y0;J)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 386
    iget-object v0, p1, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v3, p2, Le/c/a/y0;->g:Ljava/lang/Float;

    iput-object v3, v0, Le/c/a/y0;->g:Ljava/lang/Float;

    :cond_9
    const-wide/16 v3, 0x1818

    .line 387
    invoke-virtual {p0, p2, v3, v4}, Le/c/a/l2;->a(Le/c/a/y0;J)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 388
    iget-object v0, p1, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v0, v0, Le/c/a/y0;->f:Le/c/a/i1;

    invoke-virtual {p0, p1, v1, v0}, Le/c/a/l2;->a(Le/c/a/h2;ZLe/c/a/i1;)V

    :cond_a
    const-wide v3, 0x800000000L

    .line 389
    invoke-virtual {p0, p2, v3, v4}, Le/c/a/l2;->a(Le/c/a/y0;J)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 390
    iget-object v0, p1, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v3, p2, Le/c/a/y0;->M:Le/c/a/x0;

    iput-object v3, v0, Le/c/a/y0;->M:Le/c/a/x0;

    :cond_b
    const-wide/16 v3, 0x20

    .line 391
    invoke-virtual {p0, p2, v3, v4}, Le/c/a/l2;->a(Le/c/a/y0;J)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 392
    iget-object v0, p1, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v3, p2, Le/c/a/y0;->h:Le/c/a/b0;

    iput-object v3, v0, Le/c/a/y0;->h:Le/c/a/b0;

    .line 393
    iget-object v0, p1, Le/c/a/h2;->f:Landroid/graphics/Paint;

    invoke-virtual {v3, p0}, Le/c/a/b0;->a(Le/c/a/l2;)F

    move-result v3

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    :cond_c
    const-wide/16 v3, 0x40

    .line 394
    invoke-virtual {p0, p2, v3, v4}, Le/c/a/l2;->a(Le/c/a/y0;J)Z

    move-result v0

    const/4 v3, 0x3

    const/4 v4, 0x2

    if-eqz v0, :cond_10

    .line 395
    iget-object v0, p1, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v5, p2, Le/c/a/y0;->i:Le/c/a/s0;

    iput-object v5, v0, Le/c/a/y0;->i:Le/c/a/s0;

    .line 396
    invoke-static {}, Le/c/a/l2;->w()[I

    move-result-object v0

    iget-object v5, p2, Le/c/a/y0;->i:Le/c/a/s0;

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aget v0, v0, v5

    if-eq v0, v2, :cond_f

    if-eq v0, v4, :cond_e

    if-eq v0, v3, :cond_d

    goto :goto_2

    .line 397
    :cond_d
    iget-object v0, p1, Le/c/a/h2;->f:Landroid/graphics/Paint;

    sget-object v5, Landroid/graphics/Paint$Cap;->SQUARE:Landroid/graphics/Paint$Cap;

    invoke-virtual {v0, v5}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    goto :goto_2

    .line 398
    :cond_e
    iget-object v0, p1, Le/c/a/h2;->f:Landroid/graphics/Paint;

    sget-object v5, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-virtual {v0, v5}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    goto :goto_2

    .line 399
    :cond_f
    iget-object v0, p1, Le/c/a/h2;->f:Landroid/graphics/Paint;

    sget-object v5, Landroid/graphics/Paint$Cap;->BUTT:Landroid/graphics/Paint$Cap;

    invoke-virtual {v0, v5}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    :cond_10
    :goto_2
    const-wide/16 v5, 0x80

    .line 400
    invoke-virtual {p0, p2, v5, v6}, Le/c/a/l2;->a(Le/c/a/y0;J)Z

    move-result v0

    if-eqz v0, :cond_14

    .line 401
    iget-object v0, p1, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v5, p2, Le/c/a/y0;->j:Le/c/a/t0;

    iput-object v5, v0, Le/c/a/y0;->j:Le/c/a/t0;

    .line 402
    invoke-static {}, Le/c/a/l2;->x()[I

    move-result-object v0

    iget-object v5, p2, Le/c/a/y0;->j:Le/c/a/t0;

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aget v0, v0, v5

    if-eq v0, v2, :cond_13

    if-eq v0, v4, :cond_12

    if-eq v0, v3, :cond_11

    goto :goto_3

    .line 403
    :cond_11
    iget-object v0, p1, Le/c/a/h2;->f:Landroid/graphics/Paint;

    sget-object v3, Landroid/graphics/Paint$Join;->BEVEL:Landroid/graphics/Paint$Join;

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    goto :goto_3

    .line 404
    :cond_12
    iget-object v0, p1, Le/c/a/h2;->f:Landroid/graphics/Paint;

    sget-object v3, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    goto :goto_3

    .line 405
    :cond_13
    iget-object v0, p1, Le/c/a/h2;->f:Landroid/graphics/Paint;

    sget-object v3, Landroid/graphics/Paint$Join;->MITER:Landroid/graphics/Paint$Join;

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    :cond_14
    :goto_3
    const-wide/16 v3, 0x100

    .line 406
    invoke-virtual {p0, p2, v3, v4}, Le/c/a/l2;->a(Le/c/a/y0;J)Z

    move-result v0

    if-eqz v0, :cond_15

    .line 407
    iget-object v0, p1, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v3, p2, Le/c/a/y0;->k:Ljava/lang/Float;

    iput-object v3, v0, Le/c/a/y0;->k:Ljava/lang/Float;

    .line 408
    iget-object v0, p1, Le/c/a/h2;->f:Landroid/graphics/Paint;

    iget-object v3, p2, Le/c/a/y0;->k:Ljava/lang/Float;

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v3

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStrokeMiter(F)V

    :cond_15
    const-wide/16 v3, 0x200

    .line 409
    invoke-virtual {p0, p2, v3, v4}, Le/c/a/l2;->a(Le/c/a/y0;J)Z

    move-result v0

    if-eqz v0, :cond_16

    .line 410
    iget-object v0, p1, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v3, p2, Le/c/a/y0;->l:[Le/c/a/b0;

    iput-object v3, v0, Le/c/a/y0;->l:[Le/c/a/b0;

    :cond_16
    const-wide/16 v3, 0x400

    .line 411
    invoke-virtual {p0, p2, v3, v4}, Le/c/a/l2;->a(Le/c/a/y0;J)Z

    move-result v0

    if-eqz v0, :cond_17

    .line 412
    iget-object v0, p1, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v3, p2, Le/c/a/y0;->m:Le/c/a/b0;

    iput-object v3, v0, Le/c/a/y0;->m:Le/c/a/b0;

    :cond_17
    const-wide/16 v3, 0x600

    .line 413
    invoke-virtual {p0, p2, v3, v4}, Le/c/a/l2;->a(Le/c/a/y0;J)Z

    move-result v0

    const/4 v3, 0x0

    if-eqz v0, :cond_1d

    .line 414
    iget-object v0, p1, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v0, v0, Le/c/a/y0;->l:[Le/c/a/b0;

    if-nez v0, :cond_18

    .line 415
    iget-object v0, p1, Le/c/a/h2;->f:Landroid/graphics/Paint;

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    goto :goto_6

    .line 416
    :cond_18
    array-length v0, v0

    .line 417
    rem-int/lit8 v4, v0, 0x2

    if-nez v4, :cond_19

    move v4, v0

    goto :goto_4

    :cond_19
    mul-int/lit8 v4, v0, 0x2

    .line 418
    :goto_4
    new-array v5, v4, [F

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    :goto_5
    if-lt v7, v4, :cond_1c

    cmpl-float v0, v8, v6

    if-nez v0, :cond_1a

    .line 419
    iget-object v0, p1, Le/c/a/h2;->f:Landroid/graphics/Paint;

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    goto :goto_6

    .line 420
    :cond_1a
    iget-object v0, p1, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v0, v0, Le/c/a/y0;->m:Le/c/a/b0;

    invoke-virtual {v0, p0}, Le/c/a/b0;->a(Le/c/a/l2;)F

    move-result v0

    cmpg-float v4, v0, v6

    if-gez v4, :cond_1b

    rem-float/2addr v0, v8

    add-float/2addr v0, v8

    .line 421
    :cond_1b
    iget-object v4, p1, Le/c/a/h2;->f:Landroid/graphics/Paint;

    new-instance v6, Landroid/graphics/DashPathEffect;

    invoke-direct {v6, v5, v0}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    invoke-virtual {v4, v6}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    goto :goto_6

    .line 422
    :cond_1c
    iget-object v9, p1, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v9, v9, Le/c/a/y0;->l:[Le/c/a/b0;

    rem-int v10, v7, v0

    aget-object v9, v9, v10

    invoke-virtual {v9, p0}, Le/c/a/b0;->a(Le/c/a/l2;)F

    move-result v9

    aput v9, v5, v7

    .line 423
    aget v9, v5, v7

    add-float/2addr v8, v9

    add-int/lit8 v7, v7, 0x1

    goto :goto_5

    :cond_1d
    :goto_6
    const-wide/16 v4, 0x4000

    .line 424
    invoke-virtual {p0, p2, v4, v5}, Le/c/a/l2;->a(Le/c/a/y0;J)Z

    move-result v0

    if-eqz v0, :cond_1e

    .line 425
    invoke-virtual {p0}, Le/c/a/l2;->g()F

    move-result v0

    .line 426
    iget-object v4, p1, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v5, p2, Le/c/a/y0;->q:Le/c/a/b0;

    iput-object v5, v4, Le/c/a/y0;->q:Le/c/a/b0;

    .line 427
    iget-object v4, p1, Le/c/a/h2;->e:Landroid/graphics/Paint;

    iget-object v5, p2, Le/c/a/y0;->q:Le/c/a/b0;

    invoke-virtual {v5, p0, v0}, Le/c/a/b0;->a(Le/c/a/l2;F)F

    move-result v5

    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 428
    iget-object v4, p1, Le/c/a/h2;->f:Landroid/graphics/Paint;

    iget-object v5, p2, Le/c/a/y0;->q:Le/c/a/b0;

    invoke-virtual {v5, p0, v0}, Le/c/a/b0;->a(Le/c/a/l2;F)F

    move-result v0

    invoke-virtual {v4, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    :cond_1e
    const-wide/16 v4, 0x2000

    .line 429
    invoke-virtual {p0, p2, v4, v5}, Le/c/a/l2;->a(Le/c/a/y0;J)Z

    move-result v0

    if-eqz v0, :cond_1f

    .line 430
    iget-object v0, p1, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v4, p2, Le/c/a/y0;->p:Ljava/util/List;

    iput-object v4, v0, Le/c/a/y0;->p:Ljava/util/List;

    :cond_1f
    const-wide/32 v4, 0x8000

    .line 431
    invoke-virtual {p0, p2, v4, v5}, Le/c/a/l2;->a(Le/c/a/y0;J)Z

    move-result v0

    if-eqz v0, :cond_22

    .line 432
    iget-object v0, p2, Le/c/a/y0;->r:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v4, -0x1

    const/16 v5, 0x64

    if-ne v0, v4, :cond_20

    iget-object v0, p1, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v0, v0, Le/c/a/y0;->r:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-le v0, v5, :cond_20

    .line 433
    iget-object v0, p1, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v4, v0, Le/c/a/y0;->r:Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    sub-int/2addr v4, v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iput-object v4, v0, Le/c/a/y0;->r:Ljava/lang/Integer;

    goto :goto_7

    .line 434
    :cond_20
    iget-object v0, p2, Le/c/a/y0;->r:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ne v0, v2, :cond_21

    iget-object v0, p1, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v0, v0, Le/c/a/y0;->r:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v4, 0x384

    if-ge v0, v4, :cond_21

    .line 435
    iget-object v0, p1, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v4, v0, Le/c/a/y0;->r:Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    add-int/2addr v4, v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iput-object v4, v0, Le/c/a/y0;->r:Ljava/lang/Integer;

    goto :goto_7

    .line 436
    :cond_21
    iget-object v0, p1, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v4, p2, Le/c/a/y0;->r:Ljava/lang/Integer;

    iput-object v4, v0, Le/c/a/y0;->r:Ljava/lang/Integer;

    :cond_22
    :goto_7
    const-wide/32 v4, 0x10000

    .line 437
    invoke-virtual {p0, p2, v4, v5}, Le/c/a/l2;->a(Le/c/a/y0;J)Z

    move-result v0

    if-eqz v0, :cond_23

    .line 438
    iget-object v0, p1, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v4, p2, Le/c/a/y0;->s:Le/c/a/r0;

    iput-object v4, v0, Le/c/a/y0;->s:Le/c/a/r0;

    :cond_23
    const-wide/32 v4, 0x1a000

    .line 439
    invoke-virtual {p0, p2, v4, v5}, Le/c/a/l2;->a(Le/c/a/y0;J)Z

    move-result v0

    if-eqz v0, :cond_29

    .line 440
    iget-object v0, p1, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v0, v0, Le/c/a/y0;->p:Ljava/util/List;

    if-eqz v0, :cond_27

    iget-object v0, p0, Le/c/a/l2;->e:Le/c/a/a2;

    if-eqz v0, :cond_27

    .line 441
    invoke-virtual {v0}, Le/c/a/a2;->e()Le/c/a/m2;

    move-result-object v0

    .line 442
    iget-object v4, p1, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v4, v4, Le/c/a/y0;->p:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_24
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-nez v5, :cond_25

    goto :goto_9

    :cond_25
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 443
    iget-object v5, p1, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v6, v5, Le/c/a/y0;->r:Ljava/lang/Integer;

    iget-object v5, v5, Le/c/a/y0;->s:Le/c/a/r0;

    invoke-virtual {p0, v3, v6, v5}, Le/c/a/l2;->a(Ljava/lang/String;Ljava/lang/Integer;Le/c/a/r0;)Landroid/graphics/Typeface;

    move-result-object v5

    if-nez v5, :cond_26

    if-eqz v0, :cond_26

    .line 444
    iget-object v5, p1, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v5, v5, Le/c/a/y0;->r:Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget-object v6, p1, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v6, v6, Le/c/a/y0;->s:Le/c/a/r0;

    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v3, v5, v6}, Le/c/a/m2;->a(Ljava/lang/String;ILjava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v3

    goto :goto_8

    :cond_26
    move-object v3, v5

    :goto_8
    if-eqz v3, :cond_24

    :cond_27
    :goto_9
    if-nez v3, :cond_28

    .line 445
    iget-object v0, p1, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v3, v0, Le/c/a/y0;->r:Ljava/lang/Integer;

    iget-object v0, v0, Le/c/a/y0;->s:Le/c/a/r0;

    const-string v4, "sans-serif"

    invoke-virtual {p0, v4, v3, v0}, Le/c/a/l2;->a(Ljava/lang/String;Ljava/lang/Integer;Le/c/a/r0;)Landroid/graphics/Typeface;

    move-result-object v3

    .line 446
    :cond_28
    iget-object v0, p1, Le/c/a/h2;->e:Landroid/graphics/Paint;

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 447
    iget-object v0, p1, Le/c/a/h2;->f:Landroid/graphics/Paint;

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    :cond_29
    const-wide/32 v3, 0x20000

    .line 448
    invoke-virtual {p0, p2, v3, v4}, Le/c/a/l2;->a(Le/c/a/y0;J)Z

    move-result v0

    if-eqz v0, :cond_2e

    .line 449
    iget-object v0, p1, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v3, p2, Le/c/a/y0;->t:Le/c/a/v0;

    iput-object v3, v0, Le/c/a/y0;->t:Le/c/a/v0;

    .line 450
    iget-object v0, p1, Le/c/a/h2;->e:Landroid/graphics/Paint;

    iget-object v3, p2, Le/c/a/y0;->t:Le/c/a/v0;

    sget-object v4, Le/c/a/v0;->e:Le/c/a/v0;

    if-ne v3, v4, :cond_2a

    const/4 v3, 0x1

    goto :goto_a

    :cond_2a
    const/4 v3, 0x0

    :goto_a
    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStrikeThruText(Z)V

    .line 451
    iget-object v0, p1, Le/c/a/h2;->e:Landroid/graphics/Paint;

    iget-object v3, p2, Le/c/a/y0;->t:Le/c/a/v0;

    sget-object v4, Le/c/a/v0;->c:Le/c/a/v0;

    if-ne v3, v4, :cond_2b

    const/4 v3, 0x1

    goto :goto_b

    :cond_2b
    const/4 v3, 0x0

    :goto_b
    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setUnderlineText(Z)V

    .line 452
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x11

    if-lt v0, v3, :cond_2e

    .line 453
    iget-object v0, p1, Le/c/a/h2;->f:Landroid/graphics/Paint;

    iget-object v3, p2, Le/c/a/y0;->t:Le/c/a/v0;

    sget-object v4, Le/c/a/v0;->e:Le/c/a/v0;

    if-ne v3, v4, :cond_2c

    const/4 v3, 0x1

    goto :goto_c

    :cond_2c
    const/4 v3, 0x0

    :goto_c
    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStrikeThruText(Z)V

    .line 454
    iget-object v0, p1, Le/c/a/h2;->f:Landroid/graphics/Paint;

    iget-object v3, p2, Le/c/a/y0;->t:Le/c/a/v0;

    sget-object v4, Le/c/a/v0;->c:Le/c/a/v0;

    if-ne v3, v4, :cond_2d

    const/4 v1, 0x1

    :cond_2d
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setUnderlineText(Z)V

    :cond_2e
    const-wide v0, 0x1000000000L

    .line 455
    invoke-virtual {p0, p2, v0, v1}, Le/c/a/l2;->a(Le/c/a/y0;J)Z

    move-result v0

    if-eqz v0, :cond_2f

    .line 456
    iget-object v0, p1, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v1, p2, Le/c/a/y0;->u:Le/c/a/w0;

    iput-object v1, v0, Le/c/a/y0;->u:Le/c/a/w0;

    :cond_2f
    const-wide/32 v0, 0x40000

    .line 457
    invoke-virtual {p0, p2, v0, v1}, Le/c/a/l2;->a(Le/c/a/y0;J)Z

    move-result v0

    if-eqz v0, :cond_30

    .line 458
    iget-object v0, p1, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v1, p2, Le/c/a/y0;->v:Le/c/a/u0;

    iput-object v1, v0, Le/c/a/y0;->v:Le/c/a/u0;

    :cond_30
    const-wide/32 v0, 0x80000

    .line 459
    invoke-virtual {p0, p2, v0, v1}, Le/c/a/l2;->a(Le/c/a/y0;J)Z

    move-result v0

    if-eqz v0, :cond_31

    .line 460
    iget-object v0, p1, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v1, p2, Le/c/a/y0;->w:Ljava/lang/Boolean;

    iput-object v1, v0, Le/c/a/y0;->w:Ljava/lang/Boolean;

    :cond_31
    const-wide/32 v0, 0x200000

    .line 461
    invoke-virtual {p0, p2, v0, v1}, Le/c/a/l2;->a(Le/c/a/y0;J)Z

    move-result v0

    if-eqz v0, :cond_32

    .line 462
    iget-object v0, p1, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v1, p2, Le/c/a/y0;->y:Ljava/lang/String;

    iput-object v1, v0, Le/c/a/y0;->y:Ljava/lang/String;

    :cond_32
    const-wide/32 v0, 0x400000

    .line 463
    invoke-virtual {p0, p2, v0, v1}, Le/c/a/l2;->a(Le/c/a/y0;J)Z

    move-result v0

    if-eqz v0, :cond_33

    .line 464
    iget-object v0, p1, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v1, p2, Le/c/a/y0;->z:Ljava/lang/String;

    iput-object v1, v0, Le/c/a/y0;->z:Ljava/lang/String;

    :cond_33
    const-wide/32 v0, 0x800000

    .line 465
    invoke-virtual {p0, p2, v0, v1}, Le/c/a/l2;->a(Le/c/a/y0;J)Z

    move-result v0

    if-eqz v0, :cond_34

    .line 466
    iget-object v0, p1, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v1, p2, Le/c/a/y0;->A:Ljava/lang/String;

    iput-object v1, v0, Le/c/a/y0;->A:Ljava/lang/String;

    :cond_34
    const-wide/32 v0, 0x1000000

    .line 467
    invoke-virtual {p0, p2, v0, v1}, Le/c/a/l2;->a(Le/c/a/y0;J)Z

    move-result v0

    if-eqz v0, :cond_35

    .line 468
    iget-object v0, p1, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v1, p2, Le/c/a/y0;->B:Ljava/lang/Boolean;

    iput-object v1, v0, Le/c/a/y0;->B:Ljava/lang/Boolean;

    :cond_35
    const-wide/32 v0, 0x2000000

    .line 469
    invoke-virtual {p0, p2, v0, v1}, Le/c/a/l2;->a(Le/c/a/y0;J)Z

    move-result v0

    if-eqz v0, :cond_36

    .line 470
    iget-object v0, p1, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v1, p2, Le/c/a/y0;->C:Ljava/lang/Boolean;

    iput-object v1, v0, Le/c/a/y0;->C:Ljava/lang/Boolean;

    :cond_36
    const-wide/32 v0, 0x100000

    .line 471
    invoke-virtual {p0, p2, v0, v1}, Le/c/a/l2;->a(Le/c/a/y0;J)Z

    move-result v0

    if-eqz v0, :cond_37

    .line 472
    iget-object v0, p1, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v1, p2, Le/c/a/y0;->x:Le/c/a/o;

    iput-object v1, v0, Le/c/a/y0;->x:Le/c/a/o;

    :cond_37
    const-wide/32 v0, 0x10000000

    .line 473
    invoke-virtual {p0, p2, v0, v1}, Le/c/a/l2;->a(Le/c/a/y0;J)Z

    move-result v0

    if-eqz v0, :cond_38

    .line 474
    iget-object v0, p1, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v1, p2, Le/c/a/y0;->F:Ljava/lang/String;

    iput-object v1, v0, Le/c/a/y0;->F:Ljava/lang/String;

    :cond_38
    const-wide/32 v0, 0x20000000

    .line 475
    invoke-virtual {p0, p2, v0, v1}, Le/c/a/l2;->a(Le/c/a/y0;J)Z

    move-result v0

    if-eqz v0, :cond_39

    .line 476
    iget-object v0, p1, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v1, p2, Le/c/a/y0;->G:Le/c/a/q0;

    iput-object v1, v0, Le/c/a/y0;->G:Le/c/a/q0;

    :cond_39
    const-wide/32 v0, 0x40000000

    .line 477
    invoke-virtual {p0, p2, v0, v1}, Le/c/a/l2;->a(Le/c/a/y0;J)Z

    move-result v0

    if-eqz v0, :cond_3a

    .line 478
    iget-object v0, p1, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v1, p2, Le/c/a/y0;->H:Ljava/lang/String;

    iput-object v1, v0, Le/c/a/y0;->H:Ljava/lang/String;

    :cond_3a
    const-wide/32 v0, 0x4000000

    .line 479
    invoke-virtual {p0, p2, v0, v1}, Le/c/a/l2;->a(Le/c/a/y0;J)Z

    move-result v0

    if-eqz v0, :cond_3b

    .line 480
    iget-object v0, p1, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v1, p2, Le/c/a/y0;->D:Le/c/a/i1;

    iput-object v1, v0, Le/c/a/y0;->D:Le/c/a/i1;

    :cond_3b
    const-wide/32 v0, 0x8000000

    .line 481
    invoke-virtual {p0, p2, v0, v1}, Le/c/a/l2;->a(Le/c/a/y0;J)Z

    move-result v0

    if-eqz v0, :cond_3c

    .line 482
    iget-object v0, p1, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v1, p2, Le/c/a/y0;->E:Ljava/lang/Float;

    iput-object v1, v0, Le/c/a/y0;->E:Ljava/lang/Float;

    :cond_3c
    const-wide v0, 0x200000000L

    .line 483
    invoke-virtual {p0, p2, v0, v1}, Le/c/a/l2;->a(Le/c/a/y0;J)Z

    move-result v0

    if-eqz v0, :cond_3d

    .line 484
    iget-object v0, p1, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v1, p2, Le/c/a/y0;->K:Le/c/a/i1;

    iput-object v1, v0, Le/c/a/y0;->K:Le/c/a/i1;

    :cond_3d
    const-wide v0, 0x400000000L

    .line 485
    invoke-virtual {p0, p2, v0, v1}, Le/c/a/l2;->a(Le/c/a/y0;J)Z

    move-result v0

    if-eqz v0, :cond_3e

    .line 486
    iget-object p1, p1, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object p2, p2, Le/c/a/y0;->L:Ljava/lang/Float;

    iput-object p2, p1, Le/c/a/y0;->L:Ljava/lang/Float;

    :cond_3e
    return-void
.end method

.method public final a(Le/c/a/h2;ZLe/c/a/i1;)V
    .locals 2

    .line 487
    iget-object v0, p1, Le/c/a/h2;->b:Le/c/a/y0;

    if-eqz p2, :cond_0

    iget-object v0, v0, Le/c/a/y0;->e:Ljava/lang/Float;

    goto :goto_0

    :cond_0
    iget-object v0, v0, Le/c/a/y0;->g:Ljava/lang/Float;

    :goto_0
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    .line 488
    instance-of v1, p3, Le/c/a/r;

    if-eqz v1, :cond_1

    .line 489
    check-cast p3, Le/c/a/r;

    iget p3, p3, Le/c/a/r;->b:I

    goto :goto_1

    .line 490
    :cond_1
    instance-of p3, p3, Le/c/a/s;

    if-eqz p3, :cond_3

    .line 491
    iget-object p3, p1, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object p3, p3, Le/c/a/y0;->o:Le/c/a/r;

    iget p3, p3, Le/c/a/r;->b:I

    .line 492
    :goto_1
    invoke-virtual {p0, v0}, Le/c/a/l2;->a(F)I

    move-result v0

    shl-int/lit8 v0, v0, 0x18

    or-int/2addr p3, v0

    if-eqz p2, :cond_2

    .line 493
    iget-object p1, p1, Le/c/a/h2;->e:Landroid/graphics/Paint;

    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setColor(I)V

    goto :goto_2

    .line 494
    :cond_2
    iget-object p1, p1, Le/c/a/h2;->f:Landroid/graphics/Paint;

    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setColor(I)V

    :cond_3
    :goto_2
    return-void
.end method

.method public final a(Le/c/a/k0;Ljava/lang/String;)V
    .locals 4

    .line 979
    iget-object v0, p1, Le/c/a/h1;->a:Le/c/a/a2;

    invoke-virtual {v0, p2}, Le/c/a/a2;->b(Ljava/lang/String;)Le/c/a/h1;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_0

    new-array p1, v1, [Ljava/lang/Object;

    aput-object p2, p1, v2

    const-string p2, "Pattern reference \'%s\' not found"

    .line 980
    invoke-static {p2, p1}, Le/c/a/l2;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 981
    :cond_0
    instance-of v3, v0, Le/c/a/k0;

    if-nez v3, :cond_1

    new-array p1, v2, [Ljava/lang/Object;

    const-string p2, "Pattern href attributes must point to other pattern elements"

    .line 982
    invoke-static {p2, p1}, Le/c/a/l2;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_1
    if-ne v0, p1, :cond_2

    new-array p1, v1, [Ljava/lang/Object;

    aput-object p2, p1, v2

    const-string p2, "Circular reference in pattern href attribute \'%s\'"

    .line 983
    invoke-static {p2, p1}, Le/c/a/l2;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 984
    :cond_2
    check-cast v0, Le/c/a/k0;

    .line 985
    iget-object p2, p1, Le/c/a/k0;->p:Ljava/lang/Boolean;

    if-nez p2, :cond_3

    .line 986
    iget-object p2, v0, Le/c/a/k0;->p:Ljava/lang/Boolean;

    iput-object p2, p1, Le/c/a/k0;->p:Ljava/lang/Boolean;

    .line 987
    :cond_3
    iget-object p2, p1, Le/c/a/k0;->q:Ljava/lang/Boolean;

    if-nez p2, :cond_4

    .line 988
    iget-object p2, v0, Le/c/a/k0;->q:Ljava/lang/Boolean;

    iput-object p2, p1, Le/c/a/k0;->q:Ljava/lang/Boolean;

    .line 989
    :cond_4
    iget-object p2, p1, Le/c/a/k0;->r:Landroid/graphics/Matrix;

    if-nez p2, :cond_5

    .line 990
    iget-object p2, v0, Le/c/a/k0;->r:Landroid/graphics/Matrix;

    iput-object p2, p1, Le/c/a/k0;->r:Landroid/graphics/Matrix;

    .line 991
    :cond_5
    iget-object p2, p1, Le/c/a/k0;->s:Le/c/a/b0;

    if-nez p2, :cond_6

    .line 992
    iget-object p2, v0, Le/c/a/k0;->s:Le/c/a/b0;

    iput-object p2, p1, Le/c/a/k0;->s:Le/c/a/b0;

    .line 993
    :cond_6
    iget-object p2, p1, Le/c/a/k0;->t:Le/c/a/b0;

    if-nez p2, :cond_7

    .line 994
    iget-object p2, v0, Le/c/a/k0;->t:Le/c/a/b0;

    iput-object p2, p1, Le/c/a/k0;->t:Le/c/a/b0;

    .line 995
    :cond_7
    iget-object p2, p1, Le/c/a/k0;->u:Le/c/a/b0;

    if-nez p2, :cond_8

    .line 996
    iget-object p2, v0, Le/c/a/k0;->u:Le/c/a/b0;

    iput-object p2, p1, Le/c/a/k0;->u:Le/c/a/b0;

    .line 997
    :cond_8
    iget-object p2, p1, Le/c/a/k0;->v:Le/c/a/b0;

    if-nez p2, :cond_9

    .line 998
    iget-object p2, v0, Le/c/a/k0;->v:Le/c/a/b0;

    iput-object p2, p1, Le/c/a/k0;->v:Le/c/a/b0;

    .line 999
    :cond_9
    iget-object p2, p1, Le/c/a/b1;->i:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_a

    .line 1000
    iget-object p2, v0, Le/c/a/b1;->i:Ljava/util/List;

    iput-object p2, p1, Le/c/a/b1;->i:Ljava/util/List;

    .line 1001
    :cond_a
    iget-object p2, p1, Le/c/a/l1;->o:Le/c/a/n;

    if-nez p2, :cond_b

    .line 1002
    iget-object p2, v0, Le/c/a/l1;->o:Le/c/a/n;

    iput-object p2, p1, Le/c/a/l1;->o:Le/c/a/n;

    .line 1003
    :cond_b
    iget-object p2, p1, Le/c/a/j1;->n:Le/c/a/m;

    if-nez p2, :cond_c

    .line 1004
    iget-object p2, v0, Le/c/a/j1;->n:Le/c/a/m;

    iput-object p2, p1, Le/c/a/j1;->n:Le/c/a/m;

    .line 1005
    :cond_c
    iget-object p2, v0, Le/c/a/k0;->w:Ljava/lang/String;

    if-eqz p2, :cond_d

    .line 1006
    invoke-virtual {p0, p1, p2}, Le/c/a/l2;->a(Le/c/a/k0;Ljava/lang/String;)V

    :cond_d
    return-void
.end method

.method public final a(Le/c/a/k1;Le/c/a/k1;)V
    .locals 1

    .line 745
    iget-object v0, p1, Le/c/a/k1;->m:Le/c/a/b0;

    if-nez v0, :cond_0

    .line 746
    iget-object v0, p2, Le/c/a/k1;->m:Le/c/a/b0;

    iput-object v0, p1, Le/c/a/k1;->m:Le/c/a/b0;

    .line 747
    :cond_0
    iget-object v0, p1, Le/c/a/k1;->n:Le/c/a/b0;

    if-nez v0, :cond_1

    .line 748
    iget-object v0, p2, Le/c/a/k1;->n:Le/c/a/b0;

    iput-object v0, p1, Le/c/a/k1;->n:Le/c/a/b0;

    .line 749
    :cond_1
    iget-object v0, p1, Le/c/a/k1;->o:Le/c/a/b0;

    if-nez v0, :cond_2

    .line 750
    iget-object v0, p2, Le/c/a/k1;->o:Le/c/a/b0;

    iput-object v0, p1, Le/c/a/k1;->o:Le/c/a/b0;

    .line 751
    :cond_2
    iget-object v0, p1, Le/c/a/k1;->p:Le/c/a/b0;

    if-nez v0, :cond_3

    .line 752
    iget-object v0, p2, Le/c/a/k1;->p:Le/c/a/b0;

    iput-object v0, p1, Le/c/a/k1;->p:Le/c/a/b0;

    .line 753
    :cond_3
    iget-object v0, p1, Le/c/a/k1;->q:Le/c/a/b0;

    if-nez v0, :cond_4

    .line 754
    iget-object p2, p2, Le/c/a/k1;->q:Le/c/a/b0;

    iput-object p2, p1, Le/c/a/k1;->q:Le/c/a/b0;

    :cond_4
    return-void
.end method

.method public final a(Le/c/a/m0;)V
    .locals 3

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "Polygon render"

    .line 169
    invoke-static {v1, v0}, Le/c/a/l2;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 170
    iget-object v0, p0, Le/c/a/l2;->f:Le/c/a/h2;

    invoke-virtual {p0, v0, p1}, Le/c/a/l2;->a(Le/c/a/h2;Le/c/a/f1;)V

    .line 171
    invoke-virtual {p0}, Le/c/a/l2;->c()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 172
    :cond_0
    invoke-virtual {p0}, Le/c/a/l2;->t()Z

    move-result v0

    if-nez v0, :cond_1

    return-void

    .line 173
    :cond_1
    iget-object v0, p0, Le/c/a/l2;->f:Le/c/a/h2;

    iget-boolean v1, v0, Le/c/a/h2;->d:Z

    if-nez v1, :cond_2

    iget-boolean v0, v0, Le/c/a/h2;->c:Z

    if-nez v0, :cond_2

    return-void

    .line 174
    :cond_2
    iget-object v0, p1, Le/c/a/x;->n:Landroid/graphics/Matrix;

    if-eqz v0, :cond_3

    .line 175
    iget-object v1, p0, Le/c/a/l2;->a:Landroid/graphics/Canvas;

    invoke-virtual {v1, v0}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 176
    :cond_3
    iget-object v0, p1, Le/c/a/l0;->o:[F

    array-length v0, v0

    const/4 v1, 0x2

    if-ge v0, v1, :cond_4

    return-void

    .line 177
    :cond_4
    invoke-virtual {p0, p1}, Le/c/a/l2;->b(Le/c/a/l0;)Landroid/graphics/Path;

    move-result-object v0

    .line 178
    invoke-virtual {p0, p1}, Le/c/a/l2;->d(Le/c/a/e1;)V

    .line 179
    invoke-virtual {p0, p1}, Le/c/a/l2;->b(Le/c/a/e1;)V

    .line 180
    invoke-virtual {p0, p1}, Le/c/a/l2;->a(Le/c/a/e1;)V

    .line 181
    invoke-virtual {p0}, Le/c/a/l2;->n()Z

    move-result v1

    .line 182
    iget-object v2, p0, Le/c/a/l2;->f:Le/c/a/h2;

    iget-boolean v2, v2, Le/c/a/h2;->c:Z

    if-eqz v2, :cond_5

    .line 183
    invoke-virtual {p0, p1, v0}, Le/c/a/l2;->a(Le/c/a/e1;Landroid/graphics/Path;)V

    .line 184
    :cond_5
    iget-object v2, p0, Le/c/a/l2;->f:Le/c/a/h2;

    iget-boolean v2, v2, Le/c/a/h2;->d:Z

    if-eqz v2, :cond_6

    .line 185
    invoke-virtual {p0, v0}, Le/c/a/l2;->b(Landroid/graphics/Path;)V

    .line 186
    :cond_6
    invoke-virtual {p0, p1}, Le/c/a/l2;->a(Le/c/a/x;)V

    if-eqz v1, :cond_7

    .line 187
    invoke-virtual {p0, p1}, Le/c/a/l2;->c(Le/c/a/e1;)V

    :cond_7
    return-void
.end method

.method public final a(Le/c/a/m1;)V
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "Switch render"

    .line 75
    invoke-static {v1, v0}, Le/c/a/l2;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 76
    iget-object v0, p0, Le/c/a/l2;->f:Le/c/a/h2;

    invoke-virtual {p0, v0, p1}, Le/c/a/l2;->a(Le/c/a/h2;Le/c/a/f1;)V

    .line 77
    invoke-virtual {p0}, Le/c/a/l2;->c()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 78
    :cond_0
    iget-object v0, p1, Le/c/a/y;->n:Landroid/graphics/Matrix;

    if-eqz v0, :cond_1

    .line 79
    iget-object v1, p0, Le/c/a/l2;->a:Landroid/graphics/Canvas;

    invoke-virtual {v1, v0}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 80
    :cond_1
    invoke-virtual {p0, p1}, Le/c/a/l2;->a(Le/c/a/e1;)V

    .line 81
    invoke-virtual {p0}, Le/c/a/l2;->n()Z

    move-result v0

    .line 82
    invoke-virtual {p0, p1}, Le/c/a/l2;->b(Le/c/a/m1;)V

    if-eqz v0, :cond_2

    .line 83
    invoke-virtual {p0, p1}, Le/c/a/l2;->c(Le/c/a/e1;)V

    .line 84
    :cond_2
    invoke-virtual {p0, p1}, Le/c/a/l2;->d(Le/c/a/e1;)V

    return-void
.end method

.method public final a(Le/c/a/n1;Le/c/a/b0;Le/c/a/b0;)V
    .locals 4

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "Symbol render"

    .line 292
    invoke-static {v1, v0}, Le/c/a/l2;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    if-eqz p2, :cond_0

    .line 293
    invoke-virtual {p2}, Le/c/a/b0;->d()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    if-eqz p3, :cond_2

    .line 294
    invoke-virtual {p3}, Le/c/a/b0;->d()Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    return-void

    .line 295
    :cond_2
    iget-object v0, p1, Le/c/a/j1;->n:Le/c/a/m;

    if-eqz v0, :cond_3

    goto :goto_0

    :cond_3
    sget-object v0, Le/c/a/m;->d:Le/c/a/m;

    .line 296
    :goto_0
    iget-object v1, p0, Le/c/a/l2;->f:Le/c/a/h2;

    invoke-virtual {p0, v1, p1}, Le/c/a/l2;->a(Le/c/a/h2;Le/c/a/f1;)V

    if-eqz p2, :cond_4

    .line 297
    invoke-virtual {p2, p0}, Le/c/a/b0;->b(Le/c/a/l2;)F

    move-result p2

    goto :goto_1

    :cond_4
    iget-object p2, p0, Le/c/a/l2;->f:Le/c/a/h2;

    iget-object p2, p2, Le/c/a/h2;->g:Le/c/a/n;

    iget p2, p2, Le/c/a/n;->d:F

    :goto_1
    if-eqz p3, :cond_5

    .line 298
    invoke-virtual {p3, p0}, Le/c/a/b0;->b(Le/c/a/l2;)F

    move-result p3

    goto :goto_2

    :cond_5
    iget-object p3, p0, Le/c/a/l2;->f:Le/c/a/h2;

    iget-object p3, p3, Le/c/a/h2;->g:Le/c/a/n;

    iget p3, p3, Le/c/a/n;->e:F

    .line 299
    :goto_2
    iget-object v1, p0, Le/c/a/l2;->f:Le/c/a/h2;

    new-instance v2, Le/c/a/n;

    const/4 v3, 0x0

    invoke-direct {v2, v3, v3, p2, p3}, Le/c/a/n;-><init>(FFFF)V

    iput-object v2, v1, Le/c/a/h2;->g:Le/c/a/n;

    .line 300
    iget-object p2, p0, Le/c/a/l2;->f:Le/c/a/h2;

    iget-object p2, p2, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object p2, p2, Le/c/a/y0;->w:Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-nez p2, :cond_6

    .line 301
    iget-object p2, p0, Le/c/a/l2;->f:Le/c/a/h2;

    iget-object p2, p2, Le/c/a/h2;->g:Le/c/a/n;

    iget p3, p2, Le/c/a/n;->b:F

    iget v1, p2, Le/c/a/n;->c:F

    iget v2, p2, Le/c/a/n;->d:F

    iget p2, p2, Le/c/a/n;->e:F

    invoke-virtual {p0, p3, v1, v2, p2}, Le/c/a/l2;->a(FFFF)V

    .line 302
    :cond_6
    iget-object p2, p1, Le/c/a/l1;->o:Le/c/a/n;

    if-eqz p2, :cond_7

    .line 303
    iget-object p3, p0, Le/c/a/l2;->a:Landroid/graphics/Canvas;

    iget-object v1, p0, Le/c/a/l2;->f:Le/c/a/h2;

    iget-object v1, v1, Le/c/a/h2;->g:Le/c/a/n;

    invoke-virtual {p0, v1, p2, v0}, Le/c/a/l2;->a(Le/c/a/n;Le/c/a/n;Le/c/a/m;)Landroid/graphics/Matrix;

    move-result-object p2

    invoke-virtual {p3, p2}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 304
    iget-object p2, p0, Le/c/a/l2;->f:Le/c/a/h2;

    iget-object p3, p1, Le/c/a/l1;->o:Le/c/a/n;

    iput-object p3, p2, Le/c/a/h2;->h:Le/c/a/n;

    .line 305
    :cond_7
    invoke-virtual {p0}, Le/c/a/l2;->n()Z

    move-result p2

    const/4 p3, 0x1

    .line 306
    invoke-virtual {p0, p1, p3}, Le/c/a/l2;->a(Le/c/a/d1;Z)V

    if-eqz p2, :cond_8

    .line 307
    invoke-virtual {p0, p1}, Le/c/a/l2;->c(Le/c/a/e1;)V

    .line 308
    :cond_8
    invoke-virtual {p0, p1}, Le/c/a/l2;->d(Le/c/a/e1;)V

    return-void
.end method

.method public final a(Le/c/a/q1;)V
    .locals 9

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/lang/Object;

    const-string v2, "Text render"

    .line 188
    invoke-static {v2, v1}, Le/c/a/l2;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 189
    iget-object v1, p0, Le/c/a/l2;->f:Le/c/a/h2;

    invoke-virtual {p0, v1, p1}, Le/c/a/l2;->a(Le/c/a/h2;Le/c/a/f1;)V

    .line 190
    invoke-virtual {p0}, Le/c/a/l2;->c()Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    .line 191
    :cond_0
    iget-object v1, p1, Le/c/a/q1;->r:Landroid/graphics/Matrix;

    if-eqz v1, :cond_1

    .line 192
    iget-object v2, p0, Le/c/a/l2;->a:Landroid/graphics/Canvas;

    invoke-virtual {v2, v1}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 193
    :cond_1
    iget-object v1, p1, Le/c/a/u1;->n:Ljava/util/List;

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-nez v1, :cond_2

    goto :goto_0

    :cond_2
    iget-object v1, p1, Le/c/a/u1;->n:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le/c/a/b0;

    invoke-virtual {v1, p0}, Le/c/a/b0;->b(Le/c/a/l2;)F

    move-result v1

    goto :goto_1

    :cond_3
    :goto_0
    const/4 v1, 0x0

    .line 194
    :goto_1
    iget-object v3, p1, Le/c/a/u1;->o:Ljava/util/List;

    if-eqz v3, :cond_5

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-nez v3, :cond_4

    goto :goto_2

    :cond_4
    iget-object v3, p1, Le/c/a/u1;->o:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Le/c/a/b0;

    invoke-virtual {v3, p0}, Le/c/a/b0;->c(Le/c/a/l2;)F

    move-result v3

    goto :goto_3

    :cond_5
    :goto_2
    const/4 v3, 0x0

    .line 195
    :goto_3
    iget-object v4, p1, Le/c/a/u1;->p:Ljava/util/List;

    if-eqz v4, :cond_7

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-nez v4, :cond_6

    goto :goto_4

    :cond_6
    iget-object v4, p1, Le/c/a/u1;->p:Ljava/util/List;

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Le/c/a/b0;

    invoke-virtual {v4, p0}, Le/c/a/b0;->b(Le/c/a/l2;)F

    move-result v4

    goto :goto_5

    :cond_7
    :goto_4
    const/4 v4, 0x0

    .line 196
    :goto_5
    iget-object v5, p1, Le/c/a/u1;->q:Ljava/util/List;

    if-eqz v5, :cond_9

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    if-nez v5, :cond_8

    goto :goto_6

    :cond_8
    iget-object v2, p1, Le/c/a/u1;->q:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/c/a/b0;

    invoke-virtual {v0, p0}, Le/c/a/b0;->c(Le/c/a/l2;)F

    move-result v2

    .line 197
    :cond_9
    :goto_6
    invoke-virtual {p0}, Le/c/a/l2;->e()Le/c/a/u0;

    move-result-object v0

    .line 198
    sget-object v5, Le/c/a/u0;->b:Le/c/a/u0;

    if-eq v0, v5, :cond_b

    .line 199
    invoke-virtual {p0, p1}, Le/c/a/l2;->a(Le/c/a/s1;)F

    move-result v5

    .line 200
    sget-object v6, Le/c/a/u0;->c:Le/c/a/u0;

    if-ne v0, v6, :cond_a

    const/high16 v0, 0x40000000    # 2.0f

    div-float/2addr v5, v0

    :cond_a
    sub-float/2addr v1, v5

    .line 201
    :cond_b
    iget-object v0, p1, Le/c/a/e1;->h:Le/c/a/n;

    if-nez v0, :cond_c

    .line 202
    new-instance v0, Le/c/a/i2;

    invoke-direct {v0, p0, v1, v3}, Le/c/a/i2;-><init>(Le/c/a/l2;FF)V

    .line 203
    invoke-virtual {p0, p1, v0}, Le/c/a/l2;->a(Le/c/a/s1;Le/c/a/j2;)V

    .line 204
    new-instance v5, Le/c/a/n;

    iget-object v6, v0, Le/c/a/i2;->c:Landroid/graphics/RectF;

    iget v7, v6, Landroid/graphics/RectF;->left:F

    iget v8, v6, Landroid/graphics/RectF;->top:F

    invoke-virtual {v6}, Landroid/graphics/RectF;->width()F

    move-result v6

    iget-object v0, v0, Le/c/a/i2;->c:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    move-result v0

    invoke-direct {v5, v7, v8, v6, v0}, Le/c/a/n;-><init>(FFFF)V

    iput-object v5, p1, Le/c/a/e1;->h:Le/c/a/n;

    .line 205
    :cond_c
    invoke-virtual {p0, p1}, Le/c/a/l2;->d(Le/c/a/e1;)V

    .line 206
    invoke-virtual {p0, p1}, Le/c/a/l2;->b(Le/c/a/e1;)V

    .line 207
    invoke-virtual {p0, p1}, Le/c/a/l2;->a(Le/c/a/e1;)V

    .line 208
    invoke-virtual {p0}, Le/c/a/l2;->n()Z

    move-result v0

    .line 209
    new-instance v5, Le/c/a/f2;

    add-float/2addr v1, v4

    add-float/2addr v3, v2

    invoke-direct {v5, p0, v1, v3}, Le/c/a/f2;-><init>(Le/c/a/l2;FF)V

    invoke-virtual {p0, p1, v5}, Le/c/a/l2;->a(Le/c/a/s1;Le/c/a/j2;)V

    if-eqz v0, :cond_d

    .line 210
    invoke-virtual {p0, p1}, Le/c/a/l2;->c(Le/c/a/e1;)V

    :cond_d
    return-void
.end method

.method public final a(Le/c/a/q1;Landroid/graphics/Path;Landroid/graphics/Matrix;)V
    .locals 9

    .line 845
    iget-object v0, p0, Le/c/a/l2;->f:Le/c/a/h2;

    invoke-virtual {p0, v0, p1}, Le/c/a/l2;->a(Le/c/a/h2;Le/c/a/f1;)V

    .line 846
    invoke-virtual {p0}, Le/c/a/l2;->c()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 847
    :cond_0
    iget-object v0, p1, Le/c/a/q1;->r:Landroid/graphics/Matrix;

    if-eqz v0, :cond_1

    .line 848
    invoke-virtual {p3, v0}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    .line 849
    :cond_1
    iget-object v0, p1, Le/c/a/u1;->n:Ljava/util/List;

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz v0, :cond_3

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    iget-object v0, p1, Le/c/a/u1;->n:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/c/a/b0;

    invoke-virtual {v0, p0}, Le/c/a/b0;->b(Le/c/a/l2;)F

    move-result v0

    goto :goto_1

    :cond_3
    :goto_0
    const/4 v0, 0x0

    .line 850
    :goto_1
    iget-object v3, p1, Le/c/a/u1;->o:Ljava/util/List;

    if-eqz v3, :cond_5

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-nez v3, :cond_4

    goto :goto_2

    :cond_4
    iget-object v3, p1, Le/c/a/u1;->o:Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Le/c/a/b0;

    invoke-virtual {v3, p0}, Le/c/a/b0;->c(Le/c/a/l2;)F

    move-result v3

    goto :goto_3

    :cond_5
    :goto_2
    const/4 v3, 0x0

    .line 851
    :goto_3
    iget-object v4, p1, Le/c/a/u1;->p:Ljava/util/List;

    if-eqz v4, :cond_7

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-nez v4, :cond_6

    goto :goto_4

    :cond_6
    iget-object v4, p1, Le/c/a/u1;->p:Ljava/util/List;

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Le/c/a/b0;

    invoke-virtual {v4, p0}, Le/c/a/b0;->b(Le/c/a/l2;)F

    move-result v4

    goto :goto_5

    :cond_7
    :goto_4
    const/4 v4, 0x0

    .line 852
    :goto_5
    iget-object v5, p1, Le/c/a/u1;->q:Ljava/util/List;

    if-eqz v5, :cond_9

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    if-nez v5, :cond_8

    goto :goto_6

    :cond_8
    iget-object v2, p1, Le/c/a/u1;->q:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le/c/a/b0;

    invoke-virtual {v1, p0}, Le/c/a/b0;->c(Le/c/a/l2;)F

    move-result v2

    .line 853
    :cond_9
    :goto_6
    iget-object v1, p0, Le/c/a/l2;->f:Le/c/a/h2;

    iget-object v1, v1, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v1, v1, Le/c/a/y0;->v:Le/c/a/u0;

    sget-object v5, Le/c/a/u0;->b:Le/c/a/u0;

    if-eq v1, v5, :cond_b

    .line 854
    invoke-virtual {p0, p1}, Le/c/a/l2;->a(Le/c/a/s1;)F

    move-result v1

    .line 855
    iget-object v5, p0, Le/c/a/l2;->f:Le/c/a/h2;

    iget-object v5, v5, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v5, v5, Le/c/a/y0;->v:Le/c/a/u0;

    sget-object v6, Le/c/a/u0;->c:Le/c/a/u0;

    if-ne v5, v6, :cond_a

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v1, v5

    :cond_a
    sub-float/2addr v0, v1

    .line 856
    :cond_b
    iget-object v1, p1, Le/c/a/e1;->h:Le/c/a/n;

    if-nez v1, :cond_c

    .line 857
    new-instance v1, Le/c/a/i2;

    invoke-direct {v1, p0, v0, v3}, Le/c/a/i2;-><init>(Le/c/a/l2;FF)V

    .line 858
    invoke-virtual {p0, p1, v1}, Le/c/a/l2;->a(Le/c/a/s1;Le/c/a/j2;)V

    .line 859
    new-instance v5, Le/c/a/n;

    iget-object v6, v1, Le/c/a/i2;->c:Landroid/graphics/RectF;

    iget v7, v6, Landroid/graphics/RectF;->left:F

    iget v8, v6, Landroid/graphics/RectF;->top:F

    invoke-virtual {v6}, Landroid/graphics/RectF;->width()F

    move-result v6

    iget-object v1, v1, Le/c/a/i2;->c:Landroid/graphics/RectF;

    invoke-virtual {v1}, Landroid/graphics/RectF;->height()F

    move-result v1

    invoke-direct {v5, v7, v8, v6, v1}, Le/c/a/n;-><init>(FFFF)V

    iput-object v5, p1, Le/c/a/e1;->h:Le/c/a/n;

    .line 860
    :cond_c
    invoke-virtual {p0, p1}, Le/c/a/l2;->a(Le/c/a/e1;)V

    .line 861
    new-instance v1, Landroid/graphics/Path;

    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    .line 862
    new-instance v5, Le/c/a/g2;

    add-float/2addr v0, v4

    add-float/2addr v3, v2

    invoke-direct {v5, p0, v0, v3, v1}, Le/c/a/g2;-><init>(Le/c/a/l2;FFLandroid/graphics/Path;)V

    invoke-virtual {p0, p1, v5}, Le/c/a/l2;->a(Le/c/a/s1;Le/c/a/j2;)V

    .line 863
    invoke-virtual {p0}, Le/c/a/l2;->f()Landroid/graphics/Path$FillType;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/graphics/Path;->setFillType(Landroid/graphics/Path$FillType;)V

    .line 864
    invoke-virtual {p2, v1, p3}, Landroid/graphics/Path;->addPath(Landroid/graphics/Path;Landroid/graphics/Matrix;)V

    return-void
.end method

.method public final a(Le/c/a/s1;Le/c/a/j2;)V
    .locals 4

    .line 211
    invoke-virtual {p0}, Le/c/a/l2;->c()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 212
    :cond_0
    iget-object p1, p1, Le/c/a/b1;->i:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x1

    const/4 v1, 0x1

    .line 213
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_1

    return-void

    .line 214
    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le/c/a/h1;

    .line 215
    instance-of v3, v2, Le/c/a/w1;

    if-eqz v3, :cond_2

    .line 216
    check-cast v2, Le/c/a/w1;

    iget-object v2, v2, Le/c/a/w1;->c:Ljava/lang/String;

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    xor-int/2addr v3, v0

    invoke-virtual {p0, v2, v1, v3}, Le/c/a/l2;->a(Ljava/lang/String;ZZ)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Le/c/a/j2;->a(Ljava/lang/String;)V

    goto :goto_1

    .line 217
    :cond_2
    invoke-virtual {p0, v2, p2}, Le/c/a/l2;->a(Le/c/a/h1;Le/c/a/j2;)V

    :goto_1
    const/4 v1, 0x0

    goto :goto_0
.end method

.method public final a(Le/c/a/s1;Ljava/lang/StringBuilder;)V
    .locals 4

    .line 278
    iget-object p1, p1, Le/c/a/b1;->i:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x1

    const/4 v1, 0x1

    .line 279
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_0

    return-void

    .line 280
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le/c/a/h1;

    .line 281
    instance-of v3, v2, Le/c/a/s1;

    if-eqz v3, :cond_1

    .line 282
    check-cast v2, Le/c/a/s1;

    invoke-virtual {p0, v2, p2}, Le/c/a/l2;->a(Le/c/a/s1;Ljava/lang/StringBuilder;)V

    goto :goto_1

    .line 283
    :cond_1
    instance-of v3, v2, Le/c/a/w1;

    if-eqz v3, :cond_2

    .line 284
    check-cast v2, Le/c/a/w1;

    iget-object v2, v2, Le/c/a/w1;->c:Ljava/lang/String;

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    xor-int/2addr v3, v0

    invoke-virtual {p0, v2, v1, v3}, Le/c/a/l2;->a(Ljava/lang/String;ZZ)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    :goto_1
    const/4 v1, 0x0

    goto :goto_0
.end method

.method public final a(Le/c/a/t1;)V
    .locals 6

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/lang/Object;

    const-string v2, "TextPath render"

    .line 255
    invoke-static {v2, v1}, Le/c/a/l2;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 256
    iget-object v1, p0, Le/c/a/l2;->f:Le/c/a/h2;

    invoke-virtual {p0, v1, p1}, Le/c/a/l2;->a(Le/c/a/h2;Le/c/a/f1;)V

    .line 257
    invoke-virtual {p0}, Le/c/a/l2;->c()Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    .line 258
    :cond_0
    invoke-virtual {p0}, Le/c/a/l2;->t()Z

    move-result v1

    if-nez v1, :cond_1

    return-void

    .line 259
    :cond_1
    iget-object v1, p1, Le/c/a/h1;->a:Le/c/a/a2;

    iget-object v2, p1, Le/c/a/t1;->n:Ljava/lang/String;

    invoke-virtual {v1, v2}, Le/c/a/a2;->b(Ljava/lang/String;)Le/c/a/h1;

    move-result-object v1

    if-nez v1, :cond_2

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    .line 260
    iget-object p1, p1, Le/c/a/t1;->n:Ljava/lang/String;

    aput-object p1, v1, v0

    const-string p1, "TextPath reference \'%s\' not found"

    invoke-static {p1, v1}, Le/c/a/l2;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 261
    :cond_2
    check-cast v1, Le/c/a/h0;

    .line 262
    new-instance v2, Le/c/a/d2;

    iget-object v3, v1, Le/c/a/h0;->o:Le/c/a/i0;

    invoke-direct {v2, p0, v3}, Le/c/a/d2;-><init>(Le/c/a/l2;Le/c/a/i0;)V

    invoke-virtual {v2}, Le/c/a/d2;->a()Landroid/graphics/Path;

    move-result-object v2

    .line 263
    iget-object v1, v1, Le/c/a/x;->n:Landroid/graphics/Matrix;

    if-eqz v1, :cond_3

    .line 264
    invoke-virtual {v2, v1}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    .line 265
    :cond_3
    new-instance v1, Landroid/graphics/PathMeasure;

    invoke-direct {v1, v2, v0}, Landroid/graphics/PathMeasure;-><init>(Landroid/graphics/Path;Z)V

    .line 266
    iget-object v0, p1, Le/c/a/t1;->o:Le/c/a/b0;

    const/4 v3, 0x0

    if-eqz v0, :cond_4

    invoke-virtual {v1}, Landroid/graphics/PathMeasure;->getLength()F

    move-result v1

    invoke-virtual {v0, p0, v1}, Le/c/a/b0;->a(Le/c/a/l2;F)F

    move-result v0

    goto :goto_0

    :cond_4
    const/4 v0, 0x0

    .line 267
    :goto_0
    invoke-virtual {p0}, Le/c/a/l2;->e()Le/c/a/u0;

    move-result-object v1

    .line 268
    sget-object v4, Le/c/a/u0;->b:Le/c/a/u0;

    if-eq v1, v4, :cond_6

    .line 269
    invoke-virtual {p0, p1}, Le/c/a/l2;->a(Le/c/a/s1;)F

    move-result v4

    .line 270
    sget-object v5, Le/c/a/u0;->c:Le/c/a/u0;

    if-ne v1, v5, :cond_5

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v4, v1

    :cond_5
    sub-float/2addr v0, v4

    .line 271
    :cond_6
    invoke-virtual {p1}, Le/c/a/t1;->d()Le/c/a/v1;

    move-result-object v1

    check-cast v1, Le/c/a/e1;

    invoke-virtual {p0, v1}, Le/c/a/l2;->b(Le/c/a/e1;)V

    .line 272
    invoke-virtual {p0}, Le/c/a/l2;->n()Z

    move-result v1

    .line 273
    new-instance v4, Le/c/a/e2;

    invoke-direct {v4, p0, v2, v0, v3}, Le/c/a/e2;-><init>(Le/c/a/l2;Landroid/graphics/Path;FF)V

    invoke-virtual {p0, p1, v4}, Le/c/a/l2;->a(Le/c/a/s1;Le/c/a/j2;)V

    if-eqz v1, :cond_7

    .line 274
    invoke-virtual {p0, p1}, Le/c/a/l2;->c(Le/c/a/e1;)V

    :cond_7
    return-void
.end method

.method public final a(Le/c/a/v;Ljava/lang/String;)V
    .locals 4

    .line 718
    iget-object v0, p1, Le/c/a/h1;->a:Le/c/a/a2;

    invoke-virtual {v0, p2}, Le/c/a/a2;->b(Ljava/lang/String;)Le/c/a/h1;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_0

    new-array p1, v1, [Ljava/lang/Object;

    aput-object p2, p1, v2

    const-string p2, "Gradient reference \'%s\' not found"

    .line 719
    invoke-static {p2, p1}, Le/c/a/l2;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 720
    :cond_0
    instance-of v3, v0, Le/c/a/v;

    if-nez v3, :cond_1

    new-array p1, v2, [Ljava/lang/Object;

    const-string p2, "Gradient href attributes must point to other gradient elements"

    .line 721
    invoke-static {p2, p1}, Le/c/a/l2;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_1
    if-ne v0, p1, :cond_2

    new-array p1, v1, [Ljava/lang/Object;

    aput-object p2, p1, v2

    const-string p2, "Circular reference in gradient href attribute \'%s\'"

    .line 722
    invoke-static {p2, p1}, Le/c/a/l2;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 723
    :cond_2
    move-object p2, v0

    check-cast p2, Le/c/a/v;

    .line 724
    iget-object v1, p1, Le/c/a/v;->i:Ljava/lang/Boolean;

    if-nez v1, :cond_3

    .line 725
    iget-object v1, p2, Le/c/a/v;->i:Ljava/lang/Boolean;

    iput-object v1, p1, Le/c/a/v;->i:Ljava/lang/Boolean;

    .line 726
    :cond_3
    iget-object v1, p1, Le/c/a/v;->j:Landroid/graphics/Matrix;

    if-nez v1, :cond_4

    .line 727
    iget-object v1, p2, Le/c/a/v;->j:Landroid/graphics/Matrix;

    iput-object v1, p1, Le/c/a/v;->j:Landroid/graphics/Matrix;

    .line 728
    :cond_4
    iget-object v1, p1, Le/c/a/v;->k:Le/c/a/w;

    if-nez v1, :cond_5

    .line 729
    iget-object v1, p2, Le/c/a/v;->k:Le/c/a/w;

    iput-object v1, p1, Le/c/a/v;->k:Le/c/a/w;

    .line 730
    :cond_5
    iget-object v1, p1, Le/c/a/v;->h:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_6

    .line 731
    iget-object v1, p2, Le/c/a/v;->h:Ljava/util/List;

    iput-object v1, p1, Le/c/a/v;->h:Ljava/util/List;

    .line 732
    :cond_6
    :try_start_0
    instance-of v1, p1, Le/c/a/g1;

    if-eqz v1, :cond_7

    .line 733
    move-object v1, p1

    check-cast v1, Le/c/a/g1;

    check-cast v0, Le/c/a/g1;

    invoke-virtual {p0, v1, v0}, Le/c/a/l2;->a(Le/c/a/g1;Le/c/a/g1;)V

    goto :goto_0

    .line 734
    :cond_7
    move-object v1, p1

    check-cast v1, Le/c/a/k1;

    check-cast v0, Le/c/a/k1;

    invoke-virtual {p0, v1, v0}, Le/c/a/l2;->a(Le/c/a/k1;Le/c/a/k1;)V
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    nop

    .line 735
    :goto_0
    iget-object p2, p2, Le/c/a/v;->l:Ljava/lang/String;

    if-eqz p2, :cond_8

    .line 736
    invoke-virtual {p0, p1, p2}, Le/c/a/l2;->a(Le/c/a/v;Ljava/lang/String;)V

    :cond_8
    return-void
.end method

.method public final a(Le/c/a/x;)V
    .locals 8

    .line 529
    iget-object v0, p0, Le/c/a/l2;->f:Le/c/a/h2;

    iget-object v0, v0, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v1, v0, Le/c/a/y0;->y:Ljava/lang/String;

    if-nez v1, :cond_0

    iget-object v1, v0, Le/c/a/y0;->z:Ljava/lang/String;

    if-nez v1, :cond_0

    iget-object v0, v0, Le/c/a/y0;->A:Ljava/lang/String;

    if-nez v0, :cond_0

    return-void

    .line 530
    :cond_0
    iget-object v0, p0, Le/c/a/l2;->f:Le/c/a/h2;

    iget-object v0, v0, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v0, v0, Le/c/a/y0;->y:Ljava/lang/String;

    const-string v1, "Marker reference \'%s\' not found"

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v0, :cond_2

    .line 531
    iget-object v5, p1, Le/c/a/h1;->a:Le/c/a/a2;

    invoke-virtual {v5, v0}, Le/c/a/a2;->b(Ljava/lang/String;)Le/c/a/h1;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 532
    check-cast v0, Le/c/a/d0;

    goto :goto_0

    :cond_1
    new-array v0, v4, [Ljava/lang/Object;

    .line 533
    iget-object v5, p0, Le/c/a/l2;->f:Le/c/a/h2;

    iget-object v5, v5, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v5, v5, Le/c/a/y0;->y:Ljava/lang/String;

    aput-object v5, v0, v2

    invoke-static {v1, v0}, Le/c/a/l2;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_2
    move-object v0, v3

    .line 534
    :goto_0
    iget-object v5, p0, Le/c/a/l2;->f:Le/c/a/h2;

    iget-object v5, v5, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v5, v5, Le/c/a/y0;->z:Ljava/lang/String;

    if-eqz v5, :cond_4

    .line 535
    iget-object v6, p1, Le/c/a/h1;->a:Le/c/a/a2;

    invoke-virtual {v6, v5}, Le/c/a/a2;->b(Ljava/lang/String;)Le/c/a/h1;

    move-result-object v5

    if-eqz v5, :cond_3

    .line 536
    check-cast v5, Le/c/a/d0;

    goto :goto_1

    :cond_3
    new-array v5, v4, [Ljava/lang/Object;

    .line 537
    iget-object v6, p0, Le/c/a/l2;->f:Le/c/a/h2;

    iget-object v6, v6, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v6, v6, Le/c/a/y0;->z:Ljava/lang/String;

    aput-object v6, v5, v2

    invoke-static {v1, v5}, Le/c/a/l2;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_4
    move-object v5, v3

    .line 538
    :goto_1
    iget-object v6, p0, Le/c/a/l2;->f:Le/c/a/h2;

    iget-object v6, v6, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v6, v6, Le/c/a/y0;->A:Ljava/lang/String;

    if-eqz v6, :cond_6

    .line 539
    iget-object v7, p1, Le/c/a/h1;->a:Le/c/a/a2;

    invoke-virtual {v7, v6}, Le/c/a/a2;->b(Ljava/lang/String;)Le/c/a/h1;

    move-result-object v6

    if-eqz v6, :cond_5

    .line 540
    check-cast v6, Le/c/a/d0;

    goto :goto_2

    :cond_5
    new-array v6, v4, [Ljava/lang/Object;

    .line 541
    iget-object v7, p0, Le/c/a/l2;->f:Le/c/a/h2;

    iget-object v7, v7, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v7, v7, Le/c/a/y0;->A:Ljava/lang/String;

    aput-object v7, v6, v2

    invoke-static {v1, v6}, Le/c/a/l2;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_6
    move-object v6, v3

    .line 542
    :goto_2
    instance-of v1, p1, Le/c/a/h0;

    if-eqz v1, :cond_7

    .line 543
    new-instance v1, Le/c/a/b2;

    check-cast p1, Le/c/a/h0;

    iget-object p1, p1, Le/c/a/h0;->o:Le/c/a/i0;

    invoke-direct {v1, p0, p1}, Le/c/a/b2;-><init>(Le/c/a/l2;Le/c/a/i0;)V

    invoke-virtual {v1}, Le/c/a/b2;->a()Ljava/util/List;

    move-result-object p1

    goto :goto_3

    .line 544
    :cond_7
    instance-of v1, p1, Le/c/a/c0;

    if-eqz v1, :cond_8

    .line 545
    check-cast p1, Le/c/a/c0;

    invoke-virtual {p0, p1}, Le/c/a/l2;->a(Le/c/a/c0;)Ljava/util/List;

    move-result-object p1

    goto :goto_3

    .line 546
    :cond_8
    check-cast p1, Le/c/a/l0;

    invoke-virtual {p0, p1}, Le/c/a/l2;->a(Le/c/a/l0;)Ljava/util/List;

    move-result-object p1

    :goto_3
    if-nez p1, :cond_9

    return-void

    .line 547
    :cond_9
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    if-nez v1, :cond_a

    return-void

    .line 548
    :cond_a
    iget-object v7, p0, Le/c/a/l2;->f:Le/c/a/h2;

    iget-object v7, v7, Le/c/a/h2;->b:Le/c/a/y0;

    iput-object v3, v7, Le/c/a/y0;->A:Ljava/lang/String;

    iput-object v3, v7, Le/c/a/y0;->z:Ljava/lang/String;

    iput-object v3, v7, Le/c/a/y0;->y:Ljava/lang/String;

    if-eqz v0, :cond_b

    .line 549
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le/c/a/c2;

    invoke-virtual {p0, v0, v2}, Le/c/a/l2;->a(Le/c/a/d0;Le/c/a/c2;)V

    :cond_b
    if-eqz v5, :cond_d

    const/4 v0, 0x1

    :goto_4
    add-int/lit8 v2, v1, -0x1

    if-lt v0, v2, :cond_c

    goto :goto_5

    .line 550
    :cond_c
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le/c/a/c2;

    invoke-virtual {p0, v5, v2}, Le/c/a/l2;->a(Le/c/a/d0;Le/c/a/c2;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    :cond_d
    :goto_5
    if-eqz v6, :cond_e

    sub-int/2addr v1, v4

    .line 551
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Le/c/a/c2;

    invoke-virtual {p0, v6, p1}, Le/c/a/l2;->a(Le/c/a/d0;Le/c/a/c2;)V

    :cond_e
    return-void
.end method

.method public final a(Le/c/a/x;Landroid/graphics/Path;Landroid/graphics/Matrix;)V
    .locals 1

    .line 820
    iget-object v0, p0, Le/c/a/l2;->f:Le/c/a/h2;

    invoke-virtual {p0, v0, p1}, Le/c/a/l2;->a(Le/c/a/h2;Le/c/a/f1;)V

    .line 821
    invoke-virtual {p0}, Le/c/a/l2;->c()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 822
    :cond_0
    invoke-virtual {p0}, Le/c/a/l2;->t()Z

    move-result v0

    if-nez v0, :cond_1

    return-void

    .line 823
    :cond_1
    iget-object v0, p1, Le/c/a/x;->n:Landroid/graphics/Matrix;

    if-eqz v0, :cond_2

    .line 824
    invoke-virtual {p3, v0}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    .line 825
    :cond_2
    instance-of v0, p1, Le/c/a/n0;

    if-eqz v0, :cond_3

    .line 826
    move-object v0, p1

    check-cast v0, Le/c/a/n0;

    invoke-virtual {p0, v0}, Le/c/a/l2;->a(Le/c/a/n0;)Landroid/graphics/Path;

    move-result-object v0

    goto :goto_0

    .line 827
    :cond_3
    instance-of v0, p1, Le/c/a/p;

    if-eqz v0, :cond_4

    .line 828
    move-object v0, p1

    check-cast v0, Le/c/a/p;

    invoke-virtual {p0, v0}, Le/c/a/l2;->a(Le/c/a/p;)Landroid/graphics/Path;

    move-result-object v0

    goto :goto_0

    .line 829
    :cond_4
    instance-of v0, p1, Le/c/a/u;

    if-eqz v0, :cond_5

    .line 830
    move-object v0, p1

    check-cast v0, Le/c/a/u;

    invoke-virtual {p0, v0}, Le/c/a/l2;->a(Le/c/a/u;)Landroid/graphics/Path;

    move-result-object v0

    goto :goto_0

    .line 831
    :cond_5
    instance-of v0, p1, Le/c/a/l0;

    if-eqz v0, :cond_6

    .line 832
    move-object v0, p1

    check-cast v0, Le/c/a/l0;

    invoke-virtual {p0, v0}, Le/c/a/l2;->b(Le/c/a/l0;)Landroid/graphics/Path;

    move-result-object v0

    .line 833
    :goto_0
    invoke-virtual {p0, p1}, Le/c/a/l2;->a(Le/c/a/e1;)V

    .line 834
    invoke-virtual {v0}, Landroid/graphics/Path;->getFillType()Landroid/graphics/Path$FillType;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/graphics/Path;->setFillType(Landroid/graphics/Path$FillType;)V

    .line 835
    invoke-virtual {p2, v0, p3}, Landroid/graphics/Path;->addPath(Landroid/graphics/Path;Landroid/graphics/Matrix;)V

    :cond_6
    return-void
.end method

.method public final a(Le/c/a/y1;)V
    .locals 6

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/lang/Object;

    const-string v2, "Use render"

    .line 85
    invoke-static {v2, v1}, Le/c/a/l2;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 86
    iget-object v1, p1, Le/c/a/y1;->r:Le/c/a/b0;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Le/c/a/b0;->d()Z

    move-result v1

    if-nez v1, :cond_1

    .line 87
    :cond_0
    iget-object v1, p1, Le/c/a/y1;->s:Le/c/a/b0;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Le/c/a/b0;->d()Z

    move-result v1

    if-eqz v1, :cond_2

    :cond_1
    return-void

    .line 88
    :cond_2
    iget-object v1, p0, Le/c/a/l2;->f:Le/c/a/h2;

    invoke-virtual {p0, v1, p1}, Le/c/a/l2;->a(Le/c/a/h2;Le/c/a/f1;)V

    .line 89
    invoke-virtual {p0}, Le/c/a/l2;->c()Z

    move-result v1

    if-nez v1, :cond_3

    return-void

    .line 90
    :cond_3
    iget-object v1, p1, Le/c/a/h1;->a:Le/c/a/a2;

    iget-object v2, p1, Le/c/a/y1;->o:Ljava/lang/String;

    invoke-virtual {v1, v2}, Le/c/a/a2;->b(Ljava/lang/String;)Le/c/a/h1;

    move-result-object v1

    if-nez v1, :cond_4

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    .line 91
    iget-object p1, p1, Le/c/a/y1;->o:Ljava/lang/String;

    aput-object p1, v1, v0

    const-string p1, "Use reference \'%s\' not found"

    invoke-static {p1, v1}, Le/c/a/l2;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 92
    :cond_4
    iget-object v0, p1, Le/c/a/y;->n:Landroid/graphics/Matrix;

    if-eqz v0, :cond_5

    .line 93
    iget-object v2, p0, Le/c/a/l2;->a:Landroid/graphics/Canvas;

    invoke-virtual {v2, v0}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 94
    :cond_5
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 95
    iget-object v2, p1, Le/c/a/y1;->p:Le/c/a/b0;

    const/4 v3, 0x0

    if-eqz v2, :cond_6

    invoke-virtual {v2, p0}, Le/c/a/b0;->b(Le/c/a/l2;)F

    move-result v2

    goto :goto_0

    :cond_6
    const/4 v2, 0x0

    .line 96
    :goto_0
    iget-object v4, p1, Le/c/a/y1;->q:Le/c/a/b0;

    if-eqz v4, :cond_7

    invoke-virtual {v4, p0}, Le/c/a/b0;->c(Le/c/a/l2;)F

    move-result v3

    .line 97
    :cond_7
    invoke-virtual {v0, v2, v3}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    .line 98
    iget-object v2, p0, Le/c/a/l2;->a:Landroid/graphics/Canvas;

    invoke-virtual {v2, v0}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 99
    invoke-virtual {p0, p1}, Le/c/a/l2;->a(Le/c/a/e1;)V

    .line 100
    invoke-virtual {p0}, Le/c/a/l2;->n()Z

    move-result v0

    .line 101
    invoke-virtual {p0, p1}, Le/c/a/l2;->a(Le/c/a/d1;)V

    .line 102
    instance-of v2, v1, Le/c/a/z0;

    if-eqz v2, :cond_a

    .line 103
    invoke-virtual {p0}, Le/c/a/l2;->r()V

    .line 104
    check-cast v1, Le/c/a/z0;

    .line 105
    iget-object v2, p1, Le/c/a/y1;->r:Le/c/a/b0;

    if-eqz v2, :cond_8

    goto :goto_1

    :cond_8
    iget-object v2, v1, Le/c/a/z0;->r:Le/c/a/b0;

    .line 106
    :goto_1
    iget-object v3, p1, Le/c/a/y1;->s:Le/c/a/b0;

    if-eqz v3, :cond_9

    goto :goto_2

    :cond_9
    iget-object v3, v1, Le/c/a/z0;->s:Le/c/a/b0;

    .line 107
    :goto_2
    invoke-virtual {p0, v1, v2, v3}, Le/c/a/l2;->a(Le/c/a/z0;Le/c/a/b0;Le/c/a/b0;)V

    .line 108
    invoke-virtual {p0}, Le/c/a/l2;->q()V

    goto :goto_5

    .line 109
    :cond_a
    instance-of v2, v1, Le/c/a/n1;

    if-eqz v2, :cond_d

    .line 110
    iget-object v2, p1, Le/c/a/y1;->r:Le/c/a/b0;

    const/high16 v3, 0x42c80000    # 100.0f

    if-eqz v2, :cond_b

    goto :goto_3

    :cond_b
    new-instance v2, Le/c/a/b0;

    sget-object v4, Le/c/a/x1;->j:Le/c/a/x1;

    invoke-direct {v2, v3, v4}, Le/c/a/b0;-><init>(FLe/c/a/x1;)V

    .line 111
    :goto_3
    iget-object v4, p1, Le/c/a/y1;->s:Le/c/a/b0;

    if-eqz v4, :cond_c

    goto :goto_4

    :cond_c
    new-instance v4, Le/c/a/b0;

    sget-object v5, Le/c/a/x1;->j:Le/c/a/x1;

    invoke-direct {v4, v3, v5}, Le/c/a/b0;-><init>(FLe/c/a/x1;)V

    .line 112
    :goto_4
    invoke-virtual {p0}, Le/c/a/l2;->r()V

    .line 113
    check-cast v1, Le/c/a/n1;

    invoke-virtual {p0, v1, v2, v4}, Le/c/a/l2;->a(Le/c/a/n1;Le/c/a/b0;Le/c/a/b0;)V

    .line 114
    invoke-virtual {p0}, Le/c/a/l2;->q()V

    goto :goto_5

    .line 115
    :cond_d
    invoke-virtual {p0, v1}, Le/c/a/l2;->c(Le/c/a/h1;)V

    .line 116
    :goto_5
    invoke-virtual {p0}, Le/c/a/l2;->l()V

    if-eqz v0, :cond_e

    .line 117
    invoke-virtual {p0, p1}, Le/c/a/l2;->c(Le/c/a/e1;)V

    .line 118
    :cond_e
    invoke-virtual {p0, p1}, Le/c/a/l2;->d(Le/c/a/e1;)V

    return-void
.end method

.method public final a(Le/c/a/y1;Landroid/graphics/Path;Landroid/graphics/Matrix;)V
    .locals 2

    .line 836
    iget-object v0, p0, Le/c/a/l2;->f:Le/c/a/h2;

    invoke-virtual {p0, v0, p1}, Le/c/a/l2;->a(Le/c/a/h2;Le/c/a/f1;)V

    .line 837
    invoke-virtual {p0}, Le/c/a/l2;->c()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 838
    :cond_0
    invoke-virtual {p0}, Le/c/a/l2;->t()Z

    move-result v0

    if-nez v0, :cond_1

    return-void

    .line 839
    :cond_1
    iget-object v0, p1, Le/c/a/y;->n:Landroid/graphics/Matrix;

    if-eqz v0, :cond_2

    .line 840
    invoke-virtual {p3, v0}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    .line 841
    :cond_2
    iget-object v0, p1, Le/c/a/h1;->a:Le/c/a/a2;

    iget-object v1, p1, Le/c/a/y1;->o:Ljava/lang/String;

    invoke-virtual {v0, v1}, Le/c/a/a2;->b(Ljava/lang/String;)Le/c/a/h1;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_3

    const/4 p2, 0x1

    new-array p2, p2, [Ljava/lang/Object;

    .line 842
    iget-object p1, p1, Le/c/a/y1;->o:Ljava/lang/String;

    aput-object p1, p2, v1

    const-string p1, "Use reference \'%s\' not found"

    invoke-static {p1, p2}, Le/c/a/l2;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 843
    :cond_3
    invoke-virtual {p0, p1}, Le/c/a/l2;->a(Le/c/a/e1;)V

    .line 844
    invoke-virtual {p0, v0, v1, p2, p3}, Le/c/a/l2;->a(Le/c/a/h1;ZLandroid/graphics/Path;Landroid/graphics/Matrix;)V

    return-void
.end method

.method public final a(Le/c/a/y;)V
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "Group render"

    .line 65
    invoke-static {v1, v0}, Le/c/a/l2;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 66
    iget-object v0, p0, Le/c/a/l2;->f:Le/c/a/h2;

    invoke-virtual {p0, v0, p1}, Le/c/a/l2;->a(Le/c/a/h2;Le/c/a/f1;)V

    .line 67
    invoke-virtual {p0}, Le/c/a/l2;->c()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 68
    :cond_0
    iget-object v0, p1, Le/c/a/y;->n:Landroid/graphics/Matrix;

    if-eqz v0, :cond_1

    .line 69
    iget-object v1, p0, Le/c/a/l2;->a:Landroid/graphics/Canvas;

    invoke-virtual {v1, v0}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 70
    :cond_1
    invoke-virtual {p0, p1}, Le/c/a/l2;->a(Le/c/a/e1;)V

    .line 71
    invoke-virtual {p0}, Le/c/a/l2;->n()Z

    move-result v0

    const/4 v1, 0x1

    .line 72
    invoke-virtual {p0, p1, v1}, Le/c/a/l2;->a(Le/c/a/d1;Z)V

    if-eqz v0, :cond_2

    .line 73
    invoke-virtual {p0, p1}, Le/c/a/l2;->c(Le/c/a/e1;)V

    .line 74
    :cond_2
    invoke-virtual {p0, p1}, Le/c/a/l2;->d(Le/c/a/e1;)V

    return-void
.end method

.method public final a(Le/c/a/z0;)V
    .locals 2

    .line 39
    iget-object v0, p1, Le/c/a/z0;->r:Le/c/a/b0;

    iget-object v1, p1, Le/c/a/z0;->s:Le/c/a/b0;

    invoke-virtual {p0, p1, v0, v1}, Le/c/a/l2;->a(Le/c/a/z0;Le/c/a/b0;Le/c/a/b0;)V

    return-void
.end method

.method public final a(Le/c/a/z0;Le/c/a/b0;Le/c/a/b0;)V
    .locals 6

    .line 40
    iget-object v4, p1, Le/c/a/l1;->o:Le/c/a/n;

    iget-object v5, p1, Le/c/a/j1;->n:Le/c/a/m;

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    invoke-virtual/range {v0 .. v5}, Le/c/a/l2;->a(Le/c/a/z0;Le/c/a/b0;Le/c/a/b0;Le/c/a/n;Le/c/a/m;)V

    return-void
.end method

.method public final a(Le/c/a/z0;Le/c/a/b0;Le/c/a/b0;Le/c/a/n;Le/c/a/m;)V
    .locals 5

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "Svg render"

    .line 41
    invoke-static {v1, v0}, Le/c/a/l2;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    if-eqz p2, :cond_0

    .line 42
    invoke-virtual {p2}, Le/c/a/b0;->d()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    if-eqz p3, :cond_2

    .line 43
    invoke-virtual {p3}, Le/c/a/b0;->d()Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    return-void

    :cond_2
    if-nez p5, :cond_4

    .line 44
    iget-object p5, p1, Le/c/a/j1;->n:Le/c/a/m;

    if-eqz p5, :cond_3

    goto :goto_0

    :cond_3
    sget-object p5, Le/c/a/m;->d:Le/c/a/m;

    .line 45
    :cond_4
    :goto_0
    iget-object v0, p0, Le/c/a/l2;->f:Le/c/a/h2;

    invoke-virtual {p0, v0, p1}, Le/c/a/l2;->a(Le/c/a/h2;Le/c/a/f1;)V

    .line 46
    invoke-virtual {p0}, Le/c/a/l2;->c()Z

    move-result v0

    if-nez v0, :cond_5

    return-void

    .line 47
    :cond_5
    iget-object v0, p1, Le/c/a/h1;->b:Le/c/a/d1;

    const/4 v1, 0x0

    if-eqz v0, :cond_8

    .line 48
    iget-object v0, p1, Le/c/a/z0;->p:Le/c/a/b0;

    if-eqz v0, :cond_6

    invoke-virtual {v0, p0}, Le/c/a/b0;->b(Le/c/a/l2;)F

    move-result v0

    goto :goto_1

    :cond_6
    const/4 v0, 0x0

    .line 49
    :goto_1
    iget-object v2, p1, Le/c/a/z0;->q:Le/c/a/b0;

    if-eqz v2, :cond_7

    invoke-virtual {v2, p0}, Le/c/a/b0;->c(Le/c/a/l2;)F

    move-result v1

    :cond_7
    move v4, v1

    move v1, v0

    move v0, v4

    goto :goto_2

    :cond_8
    const/4 v0, 0x0

    .line 50
    :goto_2
    invoke-virtual {p0}, Le/c/a/l2;->i()Le/c/a/n;

    move-result-object v2

    if-eqz p2, :cond_9

    .line 51
    invoke-virtual {p2, p0}, Le/c/a/b0;->b(Le/c/a/l2;)F

    move-result p2

    goto :goto_3

    :cond_9
    iget p2, v2, Le/c/a/n;->d:F

    :goto_3
    if-eqz p3, :cond_a

    .line 52
    invoke-virtual {p3, p0}, Le/c/a/b0;->c(Le/c/a/l2;)F

    move-result p3

    goto :goto_4

    :cond_a
    iget p3, v2, Le/c/a/n;->e:F

    .line 53
    :goto_4
    iget-object v2, p0, Le/c/a/l2;->f:Le/c/a/h2;

    new-instance v3, Le/c/a/n;

    invoke-direct {v3, v1, v0, p2, p3}, Le/c/a/n;-><init>(FFFF)V

    iput-object v3, v2, Le/c/a/h2;->g:Le/c/a/n;

    .line 54
    iget-object p2, p0, Le/c/a/l2;->f:Le/c/a/h2;

    iget-object p2, p2, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object p2, p2, Le/c/a/y0;->w:Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-nez p2, :cond_b

    .line 55
    iget-object p2, p0, Le/c/a/l2;->f:Le/c/a/h2;

    iget-object p2, p2, Le/c/a/h2;->g:Le/c/a/n;

    iget p3, p2, Le/c/a/n;->b:F

    iget v2, p2, Le/c/a/n;->c:F

    iget v3, p2, Le/c/a/n;->d:F

    iget p2, p2, Le/c/a/n;->e:F

    invoke-virtual {p0, p3, v2, v3, p2}, Le/c/a/l2;->a(FFFF)V

    .line 56
    :cond_b
    iget-object p2, p0, Le/c/a/l2;->f:Le/c/a/h2;

    iget-object p2, p2, Le/c/a/h2;->g:Le/c/a/n;

    invoke-virtual {p0, p1, p2}, Le/c/a/l2;->a(Le/c/a/e1;Le/c/a/n;)V

    if-eqz p4, :cond_c

    .line 57
    iget-object p2, p0, Le/c/a/l2;->a:Landroid/graphics/Canvas;

    iget-object p3, p0, Le/c/a/l2;->f:Le/c/a/h2;

    iget-object p3, p3, Le/c/a/h2;->g:Le/c/a/n;

    invoke-virtual {p0, p3, p4, p5}, Le/c/a/l2;->a(Le/c/a/n;Le/c/a/n;Le/c/a/m;)Landroid/graphics/Matrix;

    move-result-object p3

    invoke-virtual {p2, p3}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 58
    iget-object p2, p0, Le/c/a/l2;->f:Le/c/a/h2;

    iget-object p3, p1, Le/c/a/l1;->o:Le/c/a/n;

    iput-object p3, p2, Le/c/a/h2;->h:Le/c/a/n;

    goto :goto_5

    .line 59
    :cond_c
    iget-object p2, p0, Le/c/a/l2;->a:Landroid/graphics/Canvas;

    invoke-virtual {p2, v1, v0}, Landroid/graphics/Canvas;->translate(FF)V

    .line 60
    :goto_5
    invoke-virtual {p0}, Le/c/a/l2;->n()Z

    move-result p2

    .line 61
    invoke-virtual {p0}, Le/c/a/l2;->s()V

    const/4 p3, 0x1

    .line 62
    invoke-virtual {p0, p1, p3}, Le/c/a/l2;->a(Le/c/a/d1;Z)V

    if-eqz p2, :cond_d

    .line 63
    invoke-virtual {p0, p1}, Le/c/a/l2;->c(Le/c/a/e1;)V

    .line 64
    :cond_d
    invoke-virtual {p0, p1}, Le/c/a/l2;->d(Le/c/a/e1;)V

    return-void
.end method

.method public final a(ZLe/c/a/n;Le/c/a/g0;)V
    .locals 3

    .line 606
    iget-object v0, p0, Le/c/a/l2;->e:Le/c/a/a2;

    iget-object v1, p3, Le/c/a/g0;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Le/c/a/a2;->b(Ljava/lang/String;)Le/c/a/h1;

    move-result-object v0

    if-nez v0, :cond_3

    const/4 p2, 0x2

    new-array p2, p2, [Ljava/lang/Object;

    if-eqz p1, :cond_0

    const-string v0, "Fill"

    goto :goto_0

    :cond_0
    const-string v0, "Stroke"

    :goto_0
    const/4 v1, 0x0

    aput-object v0, p2, v1

    const/4 v0, 0x1

    .line 607
    iget-object v2, p3, Le/c/a/g0;->b:Ljava/lang/String;

    aput-object v2, p2, v0

    const-string v0, "%s reference \'%s\' not found"

    invoke-static {v0, p2}, Le/c/a/l2;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 608
    iget-object p2, p3, Le/c/a/g0;->c:Le/c/a/i1;

    if-eqz p2, :cond_1

    .line 609
    iget-object p3, p0, Le/c/a/l2;->f:Le/c/a/h2;

    invoke-virtual {p0, p3, p1, p2}, Le/c/a/l2;->a(Le/c/a/h2;ZLe/c/a/i1;)V

    goto :goto_1

    :cond_1
    if-eqz p1, :cond_2

    .line 610
    iget-object p1, p0, Le/c/a/l2;->f:Le/c/a/h2;

    iput-boolean v1, p1, Le/c/a/h2;->c:Z

    goto :goto_1

    .line 611
    :cond_2
    iget-object p1, p0, Le/c/a/l2;->f:Le/c/a/h2;

    iput-boolean v1, p1, Le/c/a/h2;->d:Z

    :goto_1
    return-void

    .line 612
    :cond_3
    instance-of p3, v0, Le/c/a/g1;

    if-eqz p3, :cond_4

    .line 613
    move-object p3, v0

    check-cast p3, Le/c/a/g1;

    invoke-virtual {p0, p1, p2, p3}, Le/c/a/l2;->a(ZLe/c/a/n;Le/c/a/g1;)V

    .line 614
    :cond_4
    instance-of p3, v0, Le/c/a/k1;

    if-eqz p3, :cond_5

    .line 615
    move-object p3, v0

    check-cast p3, Le/c/a/k1;

    invoke-virtual {p0, p1, p2, p3}, Le/c/a/l2;->a(ZLe/c/a/n;Le/c/a/k1;)V

    .line 616
    :cond_5
    instance-of p2, v0, Le/c/a/o0;

    if-eqz p2, :cond_6

    .line 617
    check-cast v0, Le/c/a/o0;

    invoke-virtual {p0, p1, v0}, Le/c/a/l2;->a(ZLe/c/a/o0;)V

    :cond_6
    return-void
.end method

.method public final a(ZLe/c/a/n;Le/c/a/g1;)V
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    .line 618
    iget-object v3, v2, Le/c/a/v;->l:Ljava/lang/String;

    if-eqz v3, :cond_0

    .line 619
    invoke-virtual {v0, v2, v3}, Le/c/a/l2;->a(Le/c/a/v;Ljava/lang/String;)V

    .line 620
    :cond_0
    iget-object v3, v2, Le/c/a/v;->i:Ljava/lang/Boolean;

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    .line 621
    :goto_0
    iget-object v6, v0, Le/c/a/l2;->f:Le/c/a/h2;

    if-eqz p1, :cond_2

    iget-object v6, v6, Le/c/a/h2;->e:Landroid/graphics/Paint;

    goto :goto_1

    :cond_2
    iget-object v6, v6, Le/c/a/h2;->f:Landroid/graphics/Paint;

    :goto_1
    const/4 v7, 0x0

    if-eqz v3, :cond_7

    .line 622
    invoke-virtual/range {p0 .. p0}, Le/c/a/l2;->i()Le/c/a/n;

    move-result-object v8

    .line 623
    iget-object v9, v2, Le/c/a/g1;->m:Le/c/a/b0;

    if-eqz v9, :cond_3

    invoke-virtual {v9, v0}, Le/c/a/b0;->b(Le/c/a/l2;)F

    move-result v9

    goto :goto_2

    :cond_3
    const/4 v9, 0x0

    .line 624
    :goto_2
    iget-object v10, v2, Le/c/a/g1;->n:Le/c/a/b0;

    if-eqz v10, :cond_4

    invoke-virtual {v10, v0}, Le/c/a/b0;->c(Le/c/a/l2;)F

    move-result v10

    goto :goto_3

    :cond_4
    const/4 v10, 0x0

    .line 625
    :goto_3
    iget-object v11, v2, Le/c/a/g1;->o:Le/c/a/b0;

    if-eqz v11, :cond_5

    invoke-virtual {v11, v0}, Le/c/a/b0;->b(Le/c/a/l2;)F

    move-result v8

    goto :goto_4

    :cond_5
    iget v8, v8, Le/c/a/n;->d:F

    .line 626
    :goto_4
    iget-object v11, v2, Le/c/a/g1;->p:Le/c/a/b0;

    if-eqz v11, :cond_6

    invoke-virtual {v11, v0}, Le/c/a/b0;->c(Le/c/a/l2;)F

    move-result v7

    :cond_6
    move/from16 v16, v7

    move v15, v8

    move v13, v9

    move v14, v10

    goto :goto_8

    .line 627
    :cond_7
    iget-object v8, v2, Le/c/a/g1;->m:Le/c/a/b0;

    const/high16 v9, 0x3f800000    # 1.0f

    if-eqz v8, :cond_8

    invoke-virtual {v8, v0, v9}, Le/c/a/b0;->a(Le/c/a/l2;F)F

    move-result v8

    goto :goto_5

    :cond_8
    const/4 v8, 0x0

    .line 628
    :goto_5
    iget-object v10, v2, Le/c/a/g1;->n:Le/c/a/b0;

    if-eqz v10, :cond_9

    invoke-virtual {v10, v0, v9}, Le/c/a/b0;->a(Le/c/a/l2;F)F

    move-result v10

    goto :goto_6

    :cond_9
    const/4 v10, 0x0

    .line 629
    :goto_6
    iget-object v11, v2, Le/c/a/g1;->o:Le/c/a/b0;

    if-eqz v11, :cond_a

    invoke-virtual {v11, v0, v9}, Le/c/a/b0;->a(Le/c/a/l2;F)F

    move-result v11

    goto :goto_7

    :cond_a
    const/high16 v11, 0x3f800000    # 1.0f

    .line 630
    :goto_7
    iget-object v12, v2, Le/c/a/g1;->p:Le/c/a/b0;

    if-eqz v12, :cond_b

    invoke-virtual {v12, v0, v9}, Le/c/a/b0;->a(Le/c/a/l2;F)F

    move-result v7

    :cond_b
    move/from16 v16, v7

    move v13, v8

    move v14, v10

    move v15, v11

    .line 631
    :goto_8
    invoke-virtual/range {p0 .. p0}, Le/c/a/l2;->r()V

    .line 632
    invoke-virtual {v0, v2}, Le/c/a/l2;->b(Le/c/a/h1;)Le/c/a/h2;

    move-result-object v7

    iput-object v7, v0, Le/c/a/l2;->f:Le/c/a/h2;

    .line 633
    new-instance v7, Landroid/graphics/Matrix;

    invoke-direct {v7}, Landroid/graphics/Matrix;-><init>()V

    if-nez v3, :cond_c

    .line 634
    iget v3, v1, Le/c/a/n;->b:F

    iget v8, v1, Le/c/a/n;->c:F

    invoke-virtual {v7, v3, v8}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    .line 635
    iget v3, v1, Le/c/a/n;->d:F

    iget v1, v1, Le/c/a/n;->e:F

    invoke-virtual {v7, v3, v1}, Landroid/graphics/Matrix;->preScale(FF)Z

    .line 636
    :cond_c
    iget-object v1, v2, Le/c/a/v;->j:Landroid/graphics/Matrix;

    if-eqz v1, :cond_d

    .line 637
    invoke-virtual {v7, v1}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    .line 638
    :cond_d
    iget-object v1, v2, Le/c/a/v;->h:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-nez v1, :cond_f

    .line 639
    invoke-virtual/range {p0 .. p0}, Le/c/a/l2;->q()V

    if-eqz p1, :cond_e

    .line 640
    iget-object v1, v0, Le/c/a/l2;->f:Le/c/a/h2;

    iput-boolean v5, v1, Le/c/a/h2;->c:Z

    goto :goto_9

    .line 641
    :cond_e
    iget-object v1, v0, Le/c/a/l2;->f:Le/c/a/h2;

    iput-boolean v5, v1, Le/c/a/h2;->d:Z

    :goto_9
    return-void

    .line 642
    :cond_f
    new-array v3, v1, [I

    .line 643
    new-array v8, v1, [F

    const/high16 v9, -0x40800000    # -1.0f

    .line 644
    iget-object v10, v2, Le/c/a/v;->h:Ljava/util/List;

    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_a
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-nez v11, :cond_15

    cmpl-float v5, v13, v15

    if-nez v5, :cond_10

    cmpl-float v5, v14, v16

    if-eqz v5, :cond_11

    :cond_10
    if-ne v1, v4, :cond_12

    .line 645
    :cond_11
    invoke-virtual/range {p0 .. p0}, Le/c/a/l2;->q()V

    sub-int/2addr v1, v4

    .line 646
    aget v1, v3, v1

    invoke-virtual {v6, v1}, Landroid/graphics/Paint;->setColor(I)V

    return-void

    .line 647
    :cond_12
    sget-object v1, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    .line 648
    iget-object v2, v2, Le/c/a/v;->k:Le/c/a/w;

    if-eqz v2, :cond_14

    .line 649
    sget-object v4, Le/c/a/w;->c:Le/c/a/w;

    if-ne v2, v4, :cond_13

    .line 650
    sget-object v1, Landroid/graphics/Shader$TileMode;->MIRROR:Landroid/graphics/Shader$TileMode;

    goto :goto_b

    .line 651
    :cond_13
    sget-object v4, Le/c/a/w;->d:Le/c/a/w;

    if-ne v2, v4, :cond_14

    .line 652
    sget-object v1, Landroid/graphics/Shader$TileMode;->REPEAT:Landroid/graphics/Shader$TileMode;

    :cond_14
    :goto_b
    move-object/from16 v19, v1

    .line 653
    invoke-virtual/range {p0 .. p0}, Le/c/a/l2;->q()V

    .line 654
    new-instance v1, Landroid/graphics/LinearGradient;

    move-object v12, v1

    move-object/from16 v17, v3

    move-object/from16 v18, v8

    invoke-direct/range {v12 .. v19}, Landroid/graphics/LinearGradient;-><init>(FFFF[I[FLandroid/graphics/Shader$TileMode;)V

    .line 655
    invoke-virtual {v1, v7}, Landroid/graphics/LinearGradient;->setLocalMatrix(Landroid/graphics/Matrix;)V

    .line 656
    invoke-virtual {v6, v1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    return-void

    .line 657
    :cond_15
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Le/c/a/h1;

    .line 658
    check-cast v11, Le/c/a/p0;

    if-eqz v5, :cond_17

    .line 659
    iget-object v12, v11, Le/c/a/p0;->h:Ljava/lang/Float;

    invoke-virtual {v12}, Ljava/lang/Float;->floatValue()F

    move-result v12

    cmpl-float v12, v12, v9

    if-ltz v12, :cond_16

    goto :goto_c

    .line 660
    :cond_16
    aput v9, v8, v5

    goto :goto_d

    .line 661
    :cond_17
    :goto_c
    iget-object v9, v11, Le/c/a/p0;->h:Ljava/lang/Float;

    invoke-virtual {v9}, Ljava/lang/Float;->floatValue()F

    move-result v9

    aput v9, v8, v5

    .line 662
    iget-object v9, v11, Le/c/a/p0;->h:Ljava/lang/Float;

    invoke-virtual {v9}, Ljava/lang/Float;->floatValue()F

    move-result v9

    .line 663
    :goto_d
    invoke-virtual/range {p0 .. p0}, Le/c/a/l2;->r()V

    .line 664
    iget-object v12, v0, Le/c/a/l2;->f:Le/c/a/h2;

    invoke-virtual {v0, v12, v11}, Le/c/a/l2;->a(Le/c/a/h2;Le/c/a/f1;)V

    .line 665
    iget-object v11, v0, Le/c/a/l2;->f:Le/c/a/h2;

    iget-object v11, v11, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v11, v11, Le/c/a/y0;->D:Le/c/a/i1;

    check-cast v11, Le/c/a/r;

    if-nez v11, :cond_18

    .line 666
    sget-object v11, Le/c/a/r;->c:Le/c/a/r;

    .line 667
    :cond_18
    iget-object v12, v0, Le/c/a/l2;->f:Le/c/a/h2;

    iget-object v12, v12, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v12, v12, Le/c/a/y0;->E:Ljava/lang/Float;

    invoke-virtual {v12}, Ljava/lang/Float;->floatValue()F

    move-result v12

    invoke-virtual {v0, v12}, Le/c/a/l2;->a(F)I

    move-result v12

    shl-int/lit8 v12, v12, 0x18

    iget v11, v11, Le/c/a/r;->b:I

    or-int/2addr v11, v12

    aput v11, v3, v5

    add-int/lit8 v5, v5, 0x1

    .line 668
    invoke-virtual/range {p0 .. p0}, Le/c/a/l2;->q()V

    goto/16 :goto_a
.end method

.method public final a(ZLe/c/a/n;Le/c/a/k1;)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    .line 669
    iget-object v3, v2, Le/c/a/v;->l:Ljava/lang/String;

    if-eqz v3, :cond_0

    .line 670
    invoke-virtual {v0, v2, v3}, Le/c/a/l2;->a(Le/c/a/v;Ljava/lang/String;)V

    .line 671
    :cond_0
    iget-object v3, v2, Le/c/a/v;->i:Ljava/lang/Boolean;

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    .line 672
    :goto_0
    iget-object v6, v0, Le/c/a/l2;->f:Le/c/a/h2;

    if-eqz p1, :cond_2

    iget-object v6, v6, Le/c/a/h2;->e:Landroid/graphics/Paint;

    goto :goto_1

    :cond_2
    iget-object v6, v6, Le/c/a/h2;->f:Landroid/graphics/Paint;

    :goto_1
    if-eqz v3, :cond_6

    .line 673
    new-instance v7, Le/c/a/b0;

    const/high16 v8, 0x42480000    # 50.0f

    sget-object v9, Le/c/a/x1;->j:Le/c/a/x1;

    invoke-direct {v7, v8, v9}, Le/c/a/b0;-><init>(FLe/c/a/x1;)V

    .line 674
    iget-object v8, v2, Le/c/a/k1;->m:Le/c/a/b0;

    if-eqz v8, :cond_3

    invoke-virtual {v8, v0}, Le/c/a/b0;->b(Le/c/a/l2;)F

    move-result v8

    goto :goto_2

    :cond_3
    invoke-virtual {v7, v0}, Le/c/a/b0;->b(Le/c/a/l2;)F

    move-result v8

    .line 675
    :goto_2
    iget-object v9, v2, Le/c/a/k1;->n:Le/c/a/b0;

    if-eqz v9, :cond_4

    invoke-virtual {v9, v0}, Le/c/a/b0;->c(Le/c/a/l2;)F

    move-result v9

    goto :goto_3

    :cond_4
    invoke-virtual {v7, v0}, Le/c/a/b0;->c(Le/c/a/l2;)F

    move-result v9

    .line 676
    :goto_3
    iget-object v10, v2, Le/c/a/k1;->o:Le/c/a/b0;

    if-eqz v10, :cond_5

    invoke-virtual {v10, v0}, Le/c/a/b0;->a(Le/c/a/l2;)F

    move-result v7

    goto :goto_4

    :cond_5
    invoke-virtual {v7, v0}, Le/c/a/b0;->a(Le/c/a/l2;)F

    move-result v7

    :goto_4
    move v14, v7

    move v12, v8

    move v13, v9

    goto :goto_8

    .line 677
    :cond_6
    iget-object v7, v2, Le/c/a/k1;->m:Le/c/a/b0;

    const/high16 v8, 0x3f800000    # 1.0f

    const/high16 v9, 0x3f000000    # 0.5f

    if-eqz v7, :cond_7

    invoke-virtual {v7, v0, v8}, Le/c/a/b0;->a(Le/c/a/l2;F)F

    move-result v7

    goto :goto_5

    :cond_7
    const/high16 v7, 0x3f000000    # 0.5f

    .line 678
    :goto_5
    iget-object v10, v2, Le/c/a/k1;->n:Le/c/a/b0;

    if-eqz v10, :cond_8

    invoke-virtual {v10, v0, v8}, Le/c/a/b0;->a(Le/c/a/l2;F)F

    move-result v10

    goto :goto_6

    :cond_8
    const/high16 v10, 0x3f000000    # 0.5f

    .line 679
    :goto_6
    iget-object v11, v2, Le/c/a/k1;->o:Le/c/a/b0;

    if-eqz v11, :cond_9

    invoke-virtual {v11, v0, v8}, Le/c/a/b0;->a(Le/c/a/l2;F)F

    move-result v8

    goto :goto_7

    :cond_9
    const/high16 v8, 0x3f000000    # 0.5f

    :goto_7
    move v12, v7

    move v14, v8

    move v13, v10

    .line 680
    :goto_8
    invoke-virtual/range {p0 .. p0}, Le/c/a/l2;->r()V

    .line 681
    invoke-virtual {v0, v2}, Le/c/a/l2;->b(Le/c/a/h1;)Le/c/a/h2;

    move-result-object v7

    iput-object v7, v0, Le/c/a/l2;->f:Le/c/a/h2;

    .line 682
    new-instance v7, Landroid/graphics/Matrix;

    invoke-direct {v7}, Landroid/graphics/Matrix;-><init>()V

    if-nez v3, :cond_a

    .line 683
    iget v3, v1, Le/c/a/n;->b:F

    iget v8, v1, Le/c/a/n;->c:F

    invoke-virtual {v7, v3, v8}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    .line 684
    iget v3, v1, Le/c/a/n;->d:F

    iget v1, v1, Le/c/a/n;->e:F

    invoke-virtual {v7, v3, v1}, Landroid/graphics/Matrix;->preScale(FF)Z

    .line 685
    :cond_a
    iget-object v1, v2, Le/c/a/v;->j:Landroid/graphics/Matrix;

    if-eqz v1, :cond_b

    .line 686
    invoke-virtual {v7, v1}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    .line 687
    :cond_b
    iget-object v1, v2, Le/c/a/v;->h:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-nez v1, :cond_d

    .line 688
    invoke-virtual/range {p0 .. p0}, Le/c/a/l2;->q()V

    if-eqz p1, :cond_c

    .line 689
    iget-object v1, v0, Le/c/a/l2;->f:Le/c/a/h2;

    iput-boolean v5, v1, Le/c/a/h2;->c:Z

    goto :goto_9

    .line 690
    :cond_c
    iget-object v1, v0, Le/c/a/l2;->f:Le/c/a/h2;

    iput-boolean v5, v1, Le/c/a/h2;->d:Z

    :goto_9
    return-void

    .line 691
    :cond_d
    new-array v15, v1, [I

    .line 692
    new-array v3, v1, [F

    const/high16 v8, -0x40800000    # -1.0f

    .line 693
    iget-object v9, v2, Le/c/a/v;->h:Ljava/util/List;

    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_a
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-nez v10, :cond_12

    const/4 v5, 0x0

    cmpl-float v5, v14, v5

    if-eqz v5, :cond_11

    if-ne v1, v4, :cond_e

    goto :goto_c

    .line 694
    :cond_e
    sget-object v1, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    .line 695
    iget-object v2, v2, Le/c/a/v;->k:Le/c/a/w;

    if-eqz v2, :cond_10

    .line 696
    sget-object v4, Le/c/a/w;->c:Le/c/a/w;

    if-ne v2, v4, :cond_f

    .line 697
    sget-object v1, Landroid/graphics/Shader$TileMode;->MIRROR:Landroid/graphics/Shader$TileMode;

    goto :goto_b

    .line 698
    :cond_f
    sget-object v4, Le/c/a/w;->d:Le/c/a/w;

    if-ne v2, v4, :cond_10

    .line 699
    sget-object v1, Landroid/graphics/Shader$TileMode;->REPEAT:Landroid/graphics/Shader$TileMode;

    :cond_10
    :goto_b
    move-object/from16 v17, v1

    .line 700
    invoke-virtual/range {p0 .. p0}, Le/c/a/l2;->q()V

    .line 701
    new-instance v1, Landroid/graphics/RadialGradient;

    move-object v11, v1

    move-object/from16 v16, v3

    invoke-direct/range {v11 .. v17}, Landroid/graphics/RadialGradient;-><init>(FFF[I[FLandroid/graphics/Shader$TileMode;)V

    .line 702
    invoke-virtual {v1, v7}, Landroid/graphics/RadialGradient;->setLocalMatrix(Landroid/graphics/Matrix;)V

    .line 703
    invoke-virtual {v6, v1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    return-void

    .line 704
    :cond_11
    :goto_c
    invoke-virtual/range {p0 .. p0}, Le/c/a/l2;->q()V

    sub-int/2addr v1, v4

    .line 705
    aget v1, v15, v1

    invoke-virtual {v6, v1}, Landroid/graphics/Paint;->setColor(I)V

    return-void

    .line 706
    :cond_12
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Le/c/a/h1;

    .line 707
    check-cast v10, Le/c/a/p0;

    if-eqz v5, :cond_14

    .line 708
    iget-object v11, v10, Le/c/a/p0;->h:Ljava/lang/Float;

    invoke-virtual {v11}, Ljava/lang/Float;->floatValue()F

    move-result v11

    cmpl-float v11, v11, v8

    if-ltz v11, :cond_13

    goto :goto_d

    .line 709
    :cond_13
    aput v8, v3, v5

    goto :goto_e

    .line 710
    :cond_14
    :goto_d
    iget-object v8, v10, Le/c/a/p0;->h:Ljava/lang/Float;

    invoke-virtual {v8}, Ljava/lang/Float;->floatValue()F

    move-result v8

    aput v8, v3, v5

    .line 711
    iget-object v8, v10, Le/c/a/p0;->h:Ljava/lang/Float;

    invoke-virtual {v8}, Ljava/lang/Float;->floatValue()F

    move-result v8

    .line 712
    :goto_e
    invoke-virtual/range {p0 .. p0}, Le/c/a/l2;->r()V

    .line 713
    iget-object v11, v0, Le/c/a/l2;->f:Le/c/a/h2;

    invoke-virtual {v0, v11, v10}, Le/c/a/l2;->a(Le/c/a/h2;Le/c/a/f1;)V

    .line 714
    iget-object v10, v0, Le/c/a/l2;->f:Le/c/a/h2;

    iget-object v10, v10, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v10, v10, Le/c/a/y0;->D:Le/c/a/i1;

    check-cast v10, Le/c/a/r;

    if-nez v10, :cond_15

    .line 715
    sget-object v10, Le/c/a/r;->c:Le/c/a/r;

    .line 716
    :cond_15
    iget-object v11, v0, Le/c/a/l2;->f:Le/c/a/h2;

    iget-object v11, v11, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v11, v11, Le/c/a/y0;->E:Ljava/lang/Float;

    invoke-virtual {v11}, Ljava/lang/Float;->floatValue()F

    move-result v11

    invoke-virtual {v0, v11}, Le/c/a/l2;->a(F)I

    move-result v11

    shl-int/lit8 v11, v11, 0x18

    iget v10, v10, Le/c/a/r;->b:I

    or-int/2addr v10, v11

    aput v10, v15, v5

    add-int/lit8 v5, v5, 0x1

    .line 717
    invoke-virtual/range {p0 .. p0}, Le/c/a/l2;->q()V

    goto/16 :goto_a
.end method

.method public final a(ZLe/c/a/o0;)V
    .locals 9

    const/4 v0, 0x1

    const/4 v1, 0x0

    const-wide v2, 0x180000000L

    const-wide v4, 0x100000000L

    const-wide v6, 0x80000000L

    if-eqz p1, :cond_3

    .line 755
    iget-object v8, p2, Le/c/a/f1;->e:Le/c/a/y0;

    invoke-virtual {p0, v8, v6, v7}, Le/c/a/l2;->a(Le/c/a/y0;J)Z

    move-result v6

    if-eqz v6, :cond_1

    .line 756
    iget-object v6, p0, Le/c/a/l2;->f:Le/c/a/h2;

    iget-object v7, v6, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v8, p2, Le/c/a/f1;->e:Le/c/a/y0;

    iget-object v8, v8, Le/c/a/y0;->I:Le/c/a/i1;

    iput-object v8, v7, Le/c/a/y0;->c:Le/c/a/i1;

    if-eqz v8, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 757
    :goto_0
    iput-boolean v0, v6, Le/c/a/h2;->c:Z

    .line 758
    :cond_1
    iget-object v0, p2, Le/c/a/f1;->e:Le/c/a/y0;

    invoke-virtual {p0, v0, v4, v5}, Le/c/a/l2;->a(Le/c/a/y0;J)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 759
    iget-object v0, p0, Le/c/a/l2;->f:Le/c/a/h2;

    iget-object v0, v0, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v1, p2, Le/c/a/f1;->e:Le/c/a/y0;

    iget-object v1, v1, Le/c/a/y0;->J:Ljava/lang/Float;

    iput-object v1, v0, Le/c/a/y0;->e:Ljava/lang/Float;

    .line 760
    :cond_2
    iget-object p2, p2, Le/c/a/f1;->e:Le/c/a/y0;

    invoke-virtual {p0, p2, v2, v3}, Le/c/a/l2;->a(Le/c/a/y0;J)Z

    move-result p2

    if-eqz p2, :cond_7

    .line 761
    iget-object p2, p0, Le/c/a/l2;->f:Le/c/a/h2;

    iget-object v0, p2, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v0, v0, Le/c/a/y0;->c:Le/c/a/i1;

    invoke-virtual {p0, p2, p1, v0}, Le/c/a/l2;->a(Le/c/a/h2;ZLe/c/a/i1;)V

    goto :goto_2

    .line 762
    :cond_3
    iget-object v8, p2, Le/c/a/f1;->e:Le/c/a/y0;

    invoke-virtual {p0, v8, v6, v7}, Le/c/a/l2;->a(Le/c/a/y0;J)Z

    move-result v6

    if-eqz v6, :cond_5

    .line 763
    iget-object v6, p0, Le/c/a/l2;->f:Le/c/a/h2;

    iget-object v7, v6, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v8, p2, Le/c/a/f1;->e:Le/c/a/y0;

    iget-object v8, v8, Le/c/a/y0;->I:Le/c/a/i1;

    iput-object v8, v7, Le/c/a/y0;->f:Le/c/a/i1;

    if-eqz v8, :cond_4

    goto :goto_1

    :cond_4
    const/4 v0, 0x0

    .line 764
    :goto_1
    iput-boolean v0, v6, Le/c/a/h2;->d:Z

    .line 765
    :cond_5
    iget-object v0, p2, Le/c/a/f1;->e:Le/c/a/y0;

    invoke-virtual {p0, v0, v4, v5}, Le/c/a/l2;->a(Le/c/a/y0;J)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 766
    iget-object v0, p0, Le/c/a/l2;->f:Le/c/a/h2;

    iget-object v0, v0, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v1, p2, Le/c/a/f1;->e:Le/c/a/y0;

    iget-object v1, v1, Le/c/a/y0;->J:Ljava/lang/Float;

    iput-object v1, v0, Le/c/a/y0;->g:Ljava/lang/Float;

    .line 767
    :cond_6
    iget-object p2, p2, Le/c/a/f1;->e:Le/c/a/y0;

    invoke-virtual {p0, p2, v2, v3}, Le/c/a/l2;->a(Le/c/a/y0;J)Z

    move-result p2

    if-eqz p2, :cond_7

    .line 768
    iget-object p2, p0, Le/c/a/l2;->f:Le/c/a/h2;

    iget-object v0, p2, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v0, v0, Le/c/a/y0;->f:Le/c/a/i1;

    invoke-virtual {p0, p2, p1, v0}, Le/c/a/l2;->a(Le/c/a/h2;ZLe/c/a/i1;)V

    :cond_7
    :goto_2
    return-void
.end method

.method public final a(Le/c/a/y0;J)Z
    .locals 2

    .line 368
    iget-wide v0, p1, Le/c/a/y0;->b:J

    and-long p1, v0, p2

    const-wide/16 v0, 0x0

    cmp-long p3, p1, v0

    if-eqz p3, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final b(Le/c/a/c0;)Landroid/graphics/Path;
    .locals 9

    .line 121
    iget-object v0, p1, Le/c/a/c0;->o:Le/c/a/b0;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p0}, Le/c/a/b0;->b(Le/c/a/l2;)F

    move-result v0

    .line 122
    :goto_0
    iget-object v2, p1, Le/c/a/c0;->p:Le/c/a/b0;

    if-nez v2, :cond_1

    const/4 v2, 0x0

    goto :goto_1

    :cond_1
    invoke-virtual {v2, p0}, Le/c/a/b0;->c(Le/c/a/l2;)F

    move-result v2

    .line 123
    :goto_1
    iget-object v3, p1, Le/c/a/c0;->q:Le/c/a/b0;

    if-nez v3, :cond_2

    const/4 v3, 0x0

    goto :goto_2

    :cond_2
    invoke-virtual {v3, p0}, Le/c/a/b0;->b(Le/c/a/l2;)F

    move-result v3

    .line 124
    :goto_2
    iget-object v4, p1, Le/c/a/c0;->r:Le/c/a/b0;

    if-nez v4, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v4, p0}, Le/c/a/b0;->c(Le/c/a/l2;)F

    move-result v1

    .line 125
    :goto_3
    iget-object v4, p1, Le/c/a/e1;->h:Le/c/a/n;

    if-nez v4, :cond_4

    .line 126
    new-instance v4, Le/c/a/n;

    invoke-static {v0, v2}, Ljava/lang/Math;->min(FF)F

    move-result v5

    invoke-static {v2, v1}, Ljava/lang/Math;->min(FF)F

    move-result v6

    sub-float v7, v3, v0

    invoke-static {v7}, Ljava/lang/Math;->abs(F)F

    move-result v7

    sub-float v8, v1, v2

    invoke-static {v8}, Ljava/lang/Math;->abs(F)F

    move-result v8

    invoke-direct {v4, v5, v6, v7, v8}, Le/c/a/n;-><init>(FFFF)V

    iput-object v4, p1, Le/c/a/e1;->h:Le/c/a/n;

    .line 127
    :cond_4
    new-instance p1, Landroid/graphics/Path;

    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    .line 128
    invoke-virtual {p1, v0, v2}, Landroid/graphics/Path;->moveTo(FF)V

    .line 129
    invoke-virtual {p1, v3, v1}, Landroid/graphics/Path;->lineTo(FF)V

    return-object p1
.end method

.method public final b(Le/c/a/l0;)Landroid/graphics/Path;
    .locals 5

    .line 130
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 131
    iget-object v1, p1, Le/c/a/l0;->o:[F

    const/4 v2, 0x0

    aget v2, v1, v2

    const/4 v3, 0x1

    aget v1, v1, v3

    invoke-virtual {v0, v2, v1}, Landroid/graphics/Path;->moveTo(FF)V

    const/4 v1, 0x2

    .line 132
    :goto_0
    iget-object v2, p1, Le/c/a/l0;->o:[F

    array-length v3, v2

    if-lt v1, v3, :cond_2

    .line 133
    instance-of v1, p1, Le/c/a/m0;

    if-eqz v1, :cond_0

    .line 134
    invoke-virtual {v0}, Landroid/graphics/Path;->close()V

    .line 135
    :cond_0
    iget-object v1, p1, Le/c/a/e1;->h:Le/c/a/n;

    if-nez v1, :cond_1

    .line 136
    invoke-virtual {p0, v0}, Le/c/a/l2;->a(Landroid/graphics/Path;)Le/c/a/n;

    move-result-object v1

    iput-object v1, p1, Le/c/a/e1;->h:Le/c/a/n;

    .line 137
    :cond_1
    invoke-virtual {p0}, Le/c/a/l2;->f()Landroid/graphics/Path$FillType;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/graphics/Path;->setFillType(Landroid/graphics/Path$FillType;)V

    return-object v0

    .line 138
    :cond_2
    aget v3, v2, v1

    add-int/lit8 v4, v1, 0x1

    aget v2, v2, v4

    invoke-virtual {v0, v3, v2}, Landroid/graphics/Path;->lineTo(FF)V

    add-int/lit8 v1, v1, 0x2

    goto :goto_0
.end method

.method public final b(Le/c/a/h1;)Le/c/a/h2;
    .locals 2

    .line 111
    new-instance v0, Le/c/a/h2;

    invoke-direct {v0, p0}, Le/c/a/h2;-><init>(Le/c/a/l2;)V

    .line 112
    invoke-static {}, Le/c/a/y0;->a()Le/c/a/y0;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Le/c/a/l2;->a(Le/c/a/h2;Le/c/a/y0;)V

    .line 113
    invoke-virtual {p0, p1, v0}, Le/c/a/l2;->a(Le/c/a/h1;Le/c/a/h2;)Le/c/a/h2;

    return-object v0
.end method

.method public final b()V
    .locals 2

    .line 118
    iget-object v0, p0, Le/c/a/l2;->a:Landroid/graphics/Canvas;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Canvas;->save(I)I

    .line 119
    iget-object v0, p0, Le/c/a/l2;->g:Ljava/util/Stack;

    iget-object v1, p0, Le/c/a/l2;->f:Le/c/a/h2;

    invoke-virtual {v0, v1}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    iget-object v0, p0, Le/c/a/l2;->f:Le/c/a/h2;

    invoke-virtual {v0}, Le/c/a/h2;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/c/a/h2;

    iput-object v0, p0, Le/c/a/l2;->f:Le/c/a/h2;

    return-void
.end method

.method public final b(Landroid/graphics/Path;)V
    .locals 5

    .line 2
    iget-object v0, p0, Le/c/a/l2;->f:Le/c/a/h2;

    iget-object v1, v0, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v1, v1, Le/c/a/y0;->M:Le/c/a/x0;

    sget-object v2, Le/c/a/x0;->c:Le/c/a/x0;

    if-ne v1, v2, :cond_1

    .line 3
    iget-object v0, p0, Le/c/a/l2;->a:Landroid/graphics/Canvas;

    invoke-virtual {v0}, Landroid/graphics/Canvas;->getMatrix()Landroid/graphics/Matrix;

    move-result-object v0

    .line 4
    new-instance v1, Landroid/graphics/Path;

    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    .line 5
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;Landroid/graphics/Path;)V

    .line 6
    iget-object p1, p0, Le/c/a/l2;->a:Landroid/graphics/Canvas;

    new-instance v2, Landroid/graphics/Matrix;

    invoke-direct {v2}, Landroid/graphics/Matrix;-><init>()V

    invoke-virtual {p1, v2}, Landroid/graphics/Canvas;->setMatrix(Landroid/graphics/Matrix;)V

    .line 7
    iget-object p1, p0, Le/c/a/l2;->f:Le/c/a/h2;

    iget-object p1, p1, Le/c/a/h2;->f:Landroid/graphics/Paint;

    invoke-virtual {p1}, Landroid/graphics/Paint;->getShader()Landroid/graphics/Shader;

    move-result-object p1

    .line 8
    new-instance v2, Landroid/graphics/Matrix;

    invoke-direct {v2}, Landroid/graphics/Matrix;-><init>()V

    if-eqz p1, :cond_0

    .line 9
    invoke-virtual {p1, v2}, Landroid/graphics/Shader;->getLocalMatrix(Landroid/graphics/Matrix;)Z

    .line 10
    new-instance v3, Landroid/graphics/Matrix;

    invoke-direct {v3, v2}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    .line 11
    invoke-virtual {v3, v0}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 12
    invoke-virtual {p1, v3}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    .line 13
    :cond_0
    iget-object v3, p0, Le/c/a/l2;->a:Landroid/graphics/Canvas;

    iget-object v4, p0, Le/c/a/l2;->f:Le/c/a/h2;

    iget-object v4, v4, Le/c/a/h2;->f:Landroid/graphics/Paint;

    invoke-virtual {v3, v1, v4}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 14
    iget-object v1, p0, Le/c/a/l2;->a:Landroid/graphics/Canvas;

    invoke-virtual {v1, v0}, Landroid/graphics/Canvas;->setMatrix(Landroid/graphics/Matrix;)V

    if-eqz p1, :cond_2

    .line 15
    invoke-virtual {p1, v2}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    goto :goto_0

    .line 16
    :cond_1
    iget-object v1, p0, Le/c/a/l2;->a:Landroid/graphics/Canvas;

    iget-object v0, v0, Le/c/a/h2;->f:Landroid/graphics/Paint;

    invoke-virtual {v1, p1, v0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public final b(Le/c/a/e1;)V
    .locals 3

    .line 114
    iget-object v0, p0, Le/c/a/l2;->f:Le/c/a/h2;

    iget-object v0, v0, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v0, v0, Le/c/a/y0;->c:Le/c/a/i1;

    instance-of v1, v0, Le/c/a/g0;

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    .line 115
    iget-object v2, p1, Le/c/a/e1;->h:Le/c/a/n;

    check-cast v0, Le/c/a/g0;

    invoke-virtual {p0, v1, v2, v0}, Le/c/a/l2;->a(ZLe/c/a/n;Le/c/a/g0;)V

    .line 116
    :cond_0
    iget-object v0, p0, Le/c/a/l2;->f:Le/c/a/h2;

    iget-object v0, v0, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v0, v0, Le/c/a/y0;->f:Le/c/a/i1;

    instance-of v1, v0, Le/c/a/g0;

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    .line 117
    iget-object p1, p1, Le/c/a/e1;->h:Le/c/a/n;

    check-cast v0, Le/c/a/g0;

    invoke-virtual {p0, v1, p1, v0}, Le/c/a/l2;->a(ZLe/c/a/n;Le/c/a/g0;)V

    :cond_1
    return-void
.end method

.method public final b(Le/c/a/m1;)V
    .locals 7

    .line 18
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v0

    .line 19
    iget-object v1, p0, Le/c/a/l2;->e:Le/c/a/a2;

    invoke-virtual {v1}, Le/c/a/a2;->e()Le/c/a/m2;

    move-result-object v1

    .line 20
    invoke-virtual {p1}, Le/c/a/b1;->e()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_1

    goto/16 :goto_3

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le/c/a/h1;

    .line 21
    instance-of v3, v2, Le/c/a/a1;

    if-nez v3, :cond_2

    goto :goto_0

    .line 22
    :cond_2
    move-object v3, v2

    check-cast v3, Le/c/a/a1;

    .line 23
    invoke-interface {v3}, Le/c/a/a1;->b()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_3

    goto :goto_0

    .line 24
    :cond_3
    invoke-interface {v3}, Le/c/a/a1;->a()Ljava/util/Set;

    move-result-object v4

    if-eqz v4, :cond_4

    .line 25
    invoke-interface {v4}, Ljava/util/Set;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_0

    invoke-interface {v4, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4

    goto :goto_0

    .line 26
    :cond_4
    invoke-interface {v3}, Le/c/a/a1;->c()Ljava/util/Set;

    move-result-object v4

    if-eqz v4, :cond_5

    .line 27
    invoke-interface {v4}, Ljava/util/Set;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_0

    sget-object v5, Le/c/a/p2;->o:Ljava/util/HashSet;

    invoke-virtual {v5, v4}, Ljava/util/HashSet;->containsAll(Ljava/util/Collection;)Z

    move-result v4

    if-nez v4, :cond_5

    goto :goto_0

    .line 28
    :cond_5
    invoke-interface {v3}, Le/c/a/a1;->f()Ljava/util/Set;

    move-result-object v4

    if-eqz v4, :cond_9

    .line 29
    invoke-interface {v4}, Ljava/util/Set;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_0

    if-nez v1, :cond_6

    goto :goto_0

    .line 30
    :cond_6
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_7
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-nez v5, :cond_8

    goto :goto_1

    :cond_8
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    .line 31
    invoke-virtual {v1, v5}, Le/c/a/m2;->a(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_7

    goto :goto_0

    .line 32
    :cond_9
    :goto_1
    invoke-interface {v3}, Le/c/a/a1;->g()Ljava/util/Set;

    move-result-object v3

    if-eqz v3, :cond_d

    .line 33
    invoke-interface {v3}, Ljava/util/Set;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_0

    if-nez v1, :cond_a

    goto :goto_0

    .line 34
    :cond_a
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_b
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_c

    goto :goto_2

    :cond_c
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 35
    iget-object v5, p0, Le/c/a/l2;->f:Le/c/a/h2;

    iget-object v5, v5, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v5, v5, Le/c/a/y0;->r:Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget-object v6, p0, Le/c/a/l2;->f:Le/c/a/h2;

    iget-object v6, v6, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v6, v6, Le/c/a/y0;->s:Le/c/a/r0;

    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v4, v5, v6}, Le/c/a/m2;->a(Ljava/lang/String;ILjava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v4

    if-nez v4, :cond_b

    goto/16 :goto_0

    .line 36
    :cond_d
    :goto_2
    invoke-virtual {p0, v2}, Le/c/a/l2;->c(Le/c/a/h1;)V

    :goto_3
    return-void
.end method

.method public final b(Le/c/a/n0;)V
    .locals 3

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "Rect render"

    .line 37
    invoke-static {v1, v0}, Le/c/a/l2;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 38
    iget-object v0, p1, Le/c/a/n0;->q:Le/c/a/b0;

    if-eqz v0, :cond_6

    iget-object v1, p1, Le/c/a/n0;->r:Le/c/a/b0;

    if-eqz v1, :cond_6

    invoke-virtual {v0}, Le/c/a/b0;->d()Z

    move-result v0

    if-nez v0, :cond_6

    iget-object v0, p1, Le/c/a/n0;->r:Le/c/a/b0;

    invoke-virtual {v0}, Le/c/a/b0;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 39
    :cond_0
    iget-object v0, p0, Le/c/a/l2;->f:Le/c/a/h2;

    invoke-virtual {p0, v0, p1}, Le/c/a/l2;->a(Le/c/a/h2;Le/c/a/f1;)V

    .line 40
    invoke-virtual {p0}, Le/c/a/l2;->c()Z

    move-result v0

    if-nez v0, :cond_1

    return-void

    .line 41
    :cond_1
    invoke-virtual {p0}, Le/c/a/l2;->t()Z

    move-result v0

    if-nez v0, :cond_2

    return-void

    .line 42
    :cond_2
    iget-object v0, p1, Le/c/a/x;->n:Landroid/graphics/Matrix;

    if-eqz v0, :cond_3

    .line 43
    iget-object v1, p0, Le/c/a/l2;->a:Landroid/graphics/Canvas;

    invoke-virtual {v1, v0}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 44
    :cond_3
    invoke-virtual {p0, p1}, Le/c/a/l2;->a(Le/c/a/n0;)Landroid/graphics/Path;

    move-result-object v0

    .line 45
    invoke-virtual {p0, p1}, Le/c/a/l2;->d(Le/c/a/e1;)V

    .line 46
    invoke-virtual {p0, p1}, Le/c/a/l2;->b(Le/c/a/e1;)V

    .line 47
    invoke-virtual {p0, p1}, Le/c/a/l2;->a(Le/c/a/e1;)V

    .line 48
    invoke-virtual {p0}, Le/c/a/l2;->n()Z

    move-result v1

    .line 49
    iget-object v2, p0, Le/c/a/l2;->f:Le/c/a/h2;

    iget-boolean v2, v2, Le/c/a/h2;->c:Z

    if-eqz v2, :cond_4

    .line 50
    invoke-virtual {p0, p1, v0}, Le/c/a/l2;->a(Le/c/a/e1;Landroid/graphics/Path;)V

    .line 51
    :cond_4
    iget-object v2, p0, Le/c/a/l2;->f:Le/c/a/h2;

    iget-boolean v2, v2, Le/c/a/h2;->d:Z

    if-eqz v2, :cond_5

    .line 52
    invoke-virtual {p0, v0}, Le/c/a/l2;->b(Landroid/graphics/Path;)V

    :cond_5
    if-eqz v1, :cond_6

    .line 53
    invoke-virtual {p0, p1}, Le/c/a/l2;->c(Le/c/a/e1;)V

    :cond_6
    :goto_0
    return-void
.end method

.method public final b(Le/c/a/p;)V
    .locals 3

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "Circle render"

    .line 54
    invoke-static {v1, v0}, Le/c/a/l2;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 55
    iget-object v0, p1, Le/c/a/p;->q:Le/c/a/b0;

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Le/c/a/b0;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 56
    :cond_0
    iget-object v0, p0, Le/c/a/l2;->f:Le/c/a/h2;

    invoke-virtual {p0, v0, p1}, Le/c/a/l2;->a(Le/c/a/h2;Le/c/a/f1;)V

    .line 57
    invoke-virtual {p0}, Le/c/a/l2;->c()Z

    move-result v0

    if-nez v0, :cond_1

    return-void

    .line 58
    :cond_1
    invoke-virtual {p0}, Le/c/a/l2;->t()Z

    move-result v0

    if-nez v0, :cond_2

    return-void

    .line 59
    :cond_2
    iget-object v0, p1, Le/c/a/x;->n:Landroid/graphics/Matrix;

    if-eqz v0, :cond_3

    .line 60
    iget-object v1, p0, Le/c/a/l2;->a:Landroid/graphics/Canvas;

    invoke-virtual {v1, v0}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 61
    :cond_3
    invoke-virtual {p0, p1}, Le/c/a/l2;->a(Le/c/a/p;)Landroid/graphics/Path;

    move-result-object v0

    .line 62
    invoke-virtual {p0, p1}, Le/c/a/l2;->d(Le/c/a/e1;)V

    .line 63
    invoke-virtual {p0, p1}, Le/c/a/l2;->b(Le/c/a/e1;)V

    .line 64
    invoke-virtual {p0, p1}, Le/c/a/l2;->a(Le/c/a/e1;)V

    .line 65
    invoke-virtual {p0}, Le/c/a/l2;->n()Z

    move-result v1

    .line 66
    iget-object v2, p0, Le/c/a/l2;->f:Le/c/a/h2;

    iget-boolean v2, v2, Le/c/a/h2;->c:Z

    if-eqz v2, :cond_4

    .line 67
    invoke-virtual {p0, p1, v0}, Le/c/a/l2;->a(Le/c/a/e1;Landroid/graphics/Path;)V

    .line 68
    :cond_4
    iget-object v2, p0, Le/c/a/l2;->f:Le/c/a/h2;

    iget-boolean v2, v2, Le/c/a/h2;->d:Z

    if-eqz v2, :cond_5

    .line 69
    invoke-virtual {p0, v0}, Le/c/a/l2;->b(Landroid/graphics/Path;)V

    :cond_5
    if-eqz v1, :cond_6

    .line 70
    invoke-virtual {p0, p1}, Le/c/a/l2;->c(Le/c/a/e1;)V

    :cond_6
    :goto_0
    return-void
.end method

.method public final b(Le/c/a/u;)V
    .locals 3

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "Ellipse render"

    .line 71
    invoke-static {v1, v0}, Le/c/a/l2;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 72
    iget-object v0, p1, Le/c/a/u;->q:Le/c/a/b0;

    if-eqz v0, :cond_6

    iget-object v1, p1, Le/c/a/u;->r:Le/c/a/b0;

    if-eqz v1, :cond_6

    invoke-virtual {v0}, Le/c/a/b0;->d()Z

    move-result v0

    if-nez v0, :cond_6

    iget-object v0, p1, Le/c/a/u;->r:Le/c/a/b0;

    invoke-virtual {v0}, Le/c/a/b0;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 73
    :cond_0
    iget-object v0, p0, Le/c/a/l2;->f:Le/c/a/h2;

    invoke-virtual {p0, v0, p1}, Le/c/a/l2;->a(Le/c/a/h2;Le/c/a/f1;)V

    .line 74
    invoke-virtual {p0}, Le/c/a/l2;->c()Z

    move-result v0

    if-nez v0, :cond_1

    return-void

    .line 75
    :cond_1
    invoke-virtual {p0}, Le/c/a/l2;->t()Z

    move-result v0

    if-nez v0, :cond_2

    return-void

    .line 76
    :cond_2
    iget-object v0, p1, Le/c/a/x;->n:Landroid/graphics/Matrix;

    if-eqz v0, :cond_3

    .line 77
    iget-object v1, p0, Le/c/a/l2;->a:Landroid/graphics/Canvas;

    invoke-virtual {v1, v0}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 78
    :cond_3
    invoke-virtual {p0, p1}, Le/c/a/l2;->a(Le/c/a/u;)Landroid/graphics/Path;

    move-result-object v0

    .line 79
    invoke-virtual {p0, p1}, Le/c/a/l2;->d(Le/c/a/e1;)V

    .line 80
    invoke-virtual {p0, p1}, Le/c/a/l2;->b(Le/c/a/e1;)V

    .line 81
    invoke-virtual {p0, p1}, Le/c/a/l2;->a(Le/c/a/e1;)V

    .line 82
    invoke-virtual {p0}, Le/c/a/l2;->n()Z

    move-result v1

    .line 83
    iget-object v2, p0, Le/c/a/l2;->f:Le/c/a/h2;

    iget-boolean v2, v2, Le/c/a/h2;->c:Z

    if-eqz v2, :cond_4

    .line 84
    invoke-virtual {p0, p1, v0}, Le/c/a/l2;->a(Le/c/a/e1;Landroid/graphics/Path;)V

    .line 85
    :cond_4
    iget-object v2, p0, Le/c/a/l2;->f:Le/c/a/h2;

    iget-boolean v2, v2, Le/c/a/h2;->d:Z

    if-eqz v2, :cond_5

    .line 86
    invoke-virtual {p0, v0}, Le/c/a/l2;->b(Landroid/graphics/Path;)V

    :cond_5
    if-eqz v1, :cond_6

    .line 87
    invoke-virtual {p0, p1}, Le/c/a/l2;->c(Le/c/a/e1;)V

    :cond_6
    :goto_0
    return-void
.end method

.method public final c(Le/c/a/c0;)V
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "Line render"

    .line 45
    invoke-static {v1, v0}, Le/c/a/l2;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 46
    iget-object v0, p0, Le/c/a/l2;->f:Le/c/a/h2;

    invoke-virtual {p0, v0, p1}, Le/c/a/l2;->a(Le/c/a/h2;Le/c/a/f1;)V

    .line 47
    invoke-virtual {p0}, Le/c/a/l2;->c()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 48
    :cond_0
    invoke-virtual {p0}, Le/c/a/l2;->t()Z

    move-result v0

    if-nez v0, :cond_1

    return-void

    .line 49
    :cond_1
    iget-object v0, p0, Le/c/a/l2;->f:Le/c/a/h2;

    iget-boolean v0, v0, Le/c/a/h2;->d:Z

    if-nez v0, :cond_2

    return-void

    .line 50
    :cond_2
    iget-object v0, p1, Le/c/a/x;->n:Landroid/graphics/Matrix;

    if-eqz v0, :cond_3

    .line 51
    iget-object v1, p0, Le/c/a/l2;->a:Landroid/graphics/Canvas;

    invoke-virtual {v1, v0}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 52
    :cond_3
    invoke-virtual {p0, p1}, Le/c/a/l2;->b(Le/c/a/c0;)Landroid/graphics/Path;

    move-result-object v0

    .line 53
    invoke-virtual {p0, p1}, Le/c/a/l2;->d(Le/c/a/e1;)V

    .line 54
    invoke-virtual {p0, p1}, Le/c/a/l2;->b(Le/c/a/e1;)V

    .line 55
    invoke-virtual {p0, p1}, Le/c/a/l2;->a(Le/c/a/e1;)V

    .line 56
    invoke-virtual {p0}, Le/c/a/l2;->n()Z

    move-result v1

    .line 57
    invoke-virtual {p0, v0}, Le/c/a/l2;->b(Landroid/graphics/Path;)V

    .line 58
    invoke-virtual {p0, p1}, Le/c/a/l2;->a(Le/c/a/x;)V

    if-eqz v1, :cond_4

    .line 59
    invoke-virtual {p0, p1}, Le/c/a/l2;->c(Le/c/a/e1;)V

    :cond_4
    return-void
.end method

.method public final c(Le/c/a/e1;)V
    .locals 3

    .line 33
    iget-object v0, p0, Le/c/a/l2;->f:Le/c/a/h2;

    iget-object v1, v0, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v1, v1, Le/c/a/y0;->H:Ljava/lang/String;

    if-eqz v1, :cond_0

    iget-boolean v0, v0, Le/c/a/h2;->j:Z

    if-eqz v0, :cond_0

    .line 34
    iget-object v0, p0, Le/c/a/l2;->e:Le/c/a/a2;

    invoke-virtual {v0, v1}, Le/c/a/a2;->b(Ljava/lang/String;)Le/c/a/h1;

    move-result-object v0

    .line 35
    invoke-virtual {p0}, Le/c/a/l2;->d()V

    .line 36
    check-cast v0, Le/c/a/e0;

    invoke-virtual {p0, v0, p1}, Le/c/a/l2;->a(Le/c/a/e0;Le/c/a/e1;)V

    .line 37
    invoke-virtual {p0}, Le/c/a/l2;->m()Landroid/graphics/Bitmap;

    move-result-object p1

    .line 38
    iget-object v0, p0, Le/c/a/l2;->j:Ljava/util/Stack;

    invoke-virtual {v0}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Canvas;

    iput-object v0, p0, Le/c/a/l2;->a:Landroid/graphics/Canvas;

    .line 39
    invoke-virtual {v0}, Landroid/graphics/Canvas;->save()I

    .line 40
    iget-object v0, p0, Le/c/a/l2;->a:Landroid/graphics/Canvas;

    new-instance v1, Landroid/graphics/Matrix;

    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    invoke-virtual {v0, v1}, Landroid/graphics/Canvas;->setMatrix(Landroid/graphics/Matrix;)V

    .line 41
    iget-object v0, p0, Le/c/a/l2;->a:Landroid/graphics/Canvas;

    iget-object v1, p0, Le/c/a/l2;->f:Le/c/a/h2;

    iget-object v1, v1, Le/c/a/h2;->e:Landroid/graphics/Paint;

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v2, v2, v1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 42
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->recycle()V

    .line 43
    iget-object p1, p0, Le/c/a/l2;->a:Landroid/graphics/Canvas;

    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 44
    :cond_0
    invoke-virtual {p0}, Le/c/a/l2;->q()V

    return-void
.end method

.method public final c(Le/c/a/h1;)V
    .locals 1

    .line 2
    instance-of v0, p1, Le/c/a/f0;

    if-eqz v0, :cond_0

    return-void

    .line 3
    :cond_0
    invoke-virtual {p0}, Le/c/a/l2;->r()V

    .line 4
    invoke-virtual {p0, p1}, Le/c/a/l2;->a(Le/c/a/h1;)V

    .line 5
    instance-of v0, p1, Le/c/a/z0;

    if-eqz v0, :cond_1

    .line 6
    check-cast p1, Le/c/a/z0;

    invoke-virtual {p0, p1}, Le/c/a/l2;->a(Le/c/a/z0;)V

    goto/16 :goto_0

    .line 7
    :cond_1
    instance-of v0, p1, Le/c/a/y1;

    if-eqz v0, :cond_2

    .line 8
    check-cast p1, Le/c/a/y1;

    invoke-virtual {p0, p1}, Le/c/a/l2;->a(Le/c/a/y1;)V

    goto/16 :goto_0

    .line 9
    :cond_2
    instance-of v0, p1, Le/c/a/m1;

    if-eqz v0, :cond_3

    .line 10
    check-cast p1, Le/c/a/m1;

    invoke-virtual {p0, p1}, Le/c/a/l2;->a(Le/c/a/m1;)V

    goto/16 :goto_0

    .line 11
    :cond_3
    instance-of v0, p1, Le/c/a/y;

    if-eqz v0, :cond_4

    .line 12
    check-cast p1, Le/c/a/y;

    invoke-virtual {p0, p1}, Le/c/a/l2;->a(Le/c/a/y;)V

    goto :goto_0

    .line 13
    :cond_4
    instance-of v0, p1, Le/c/a/a0;

    if-eqz v0, :cond_5

    .line 14
    check-cast p1, Le/c/a/a0;

    invoke-virtual {p0, p1}, Le/c/a/l2;->a(Le/c/a/a0;)V

    goto :goto_0

    .line 15
    :cond_5
    instance-of v0, p1, Le/c/a/h0;

    if-eqz v0, :cond_6

    .line 16
    check-cast p1, Le/c/a/h0;

    invoke-virtual {p0, p1}, Le/c/a/l2;->a(Le/c/a/h0;)V

    goto :goto_0

    .line 17
    :cond_6
    instance-of v0, p1, Le/c/a/n0;

    if-eqz v0, :cond_7

    .line 18
    check-cast p1, Le/c/a/n0;

    invoke-virtual {p0, p1}, Le/c/a/l2;->b(Le/c/a/n0;)V

    goto :goto_0

    .line 19
    :cond_7
    instance-of v0, p1, Le/c/a/p;

    if-eqz v0, :cond_8

    .line 20
    check-cast p1, Le/c/a/p;

    invoke-virtual {p0, p1}, Le/c/a/l2;->b(Le/c/a/p;)V

    goto :goto_0

    .line 21
    :cond_8
    instance-of v0, p1, Le/c/a/u;

    if-eqz v0, :cond_9

    .line 22
    check-cast p1, Le/c/a/u;

    invoke-virtual {p0, p1}, Le/c/a/l2;->b(Le/c/a/u;)V

    goto :goto_0

    .line 23
    :cond_9
    instance-of v0, p1, Le/c/a/c0;

    if-eqz v0, :cond_a

    .line 24
    check-cast p1, Le/c/a/c0;

    invoke-virtual {p0, p1}, Le/c/a/l2;->c(Le/c/a/c0;)V

    goto :goto_0

    .line 25
    :cond_a
    instance-of v0, p1, Le/c/a/m0;

    if-eqz v0, :cond_b

    .line 26
    check-cast p1, Le/c/a/m0;

    invoke-virtual {p0, p1}, Le/c/a/l2;->a(Le/c/a/m0;)V

    goto :goto_0

    .line 27
    :cond_b
    instance-of v0, p1, Le/c/a/l0;

    if-eqz v0, :cond_c

    .line 28
    check-cast p1, Le/c/a/l0;

    invoke-virtual {p0, p1}, Le/c/a/l2;->c(Le/c/a/l0;)V

    goto :goto_0

    .line 29
    :cond_c
    instance-of v0, p1, Le/c/a/q1;

    if-eqz v0, :cond_d

    .line 30
    check-cast p1, Le/c/a/q1;

    invoke-virtual {p0, p1}, Le/c/a/l2;->a(Le/c/a/q1;)V

    .line 31
    :cond_d
    :goto_0
    invoke-virtual {p0}, Le/c/a/l2;->q()V

    return-void
.end method

.method public final c(Le/c/a/l0;)V
    .locals 3

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "PolyLine render"

    .line 60
    invoke-static {v1, v0}, Le/c/a/l2;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 61
    iget-object v0, p0, Le/c/a/l2;->f:Le/c/a/h2;

    invoke-virtual {p0, v0, p1}, Le/c/a/l2;->a(Le/c/a/h2;Le/c/a/f1;)V

    .line 62
    invoke-virtual {p0}, Le/c/a/l2;->c()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 63
    :cond_0
    invoke-virtual {p0}, Le/c/a/l2;->t()Z

    move-result v0

    if-nez v0, :cond_1

    return-void

    .line 64
    :cond_1
    iget-object v0, p0, Le/c/a/l2;->f:Le/c/a/h2;

    iget-boolean v1, v0, Le/c/a/h2;->d:Z

    if-nez v1, :cond_2

    iget-boolean v0, v0, Le/c/a/h2;->c:Z

    if-nez v0, :cond_2

    return-void

    .line 65
    :cond_2
    iget-object v0, p1, Le/c/a/x;->n:Landroid/graphics/Matrix;

    if-eqz v0, :cond_3

    .line 66
    iget-object v1, p0, Le/c/a/l2;->a:Landroid/graphics/Canvas;

    invoke-virtual {v1, v0}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 67
    :cond_3
    iget-object v0, p1, Le/c/a/l0;->o:[F

    array-length v0, v0

    const/4 v1, 0x2

    if-ge v0, v1, :cond_4

    return-void

    .line 68
    :cond_4
    invoke-virtual {p0, p1}, Le/c/a/l2;->b(Le/c/a/l0;)Landroid/graphics/Path;

    move-result-object v0

    .line 69
    invoke-virtual {p0, p1}, Le/c/a/l2;->d(Le/c/a/e1;)V

    .line 70
    invoke-virtual {p0, p1}, Le/c/a/l2;->b(Le/c/a/e1;)V

    .line 71
    invoke-virtual {p0, p1}, Le/c/a/l2;->a(Le/c/a/e1;)V

    .line 72
    invoke-virtual {p0}, Le/c/a/l2;->n()Z

    move-result v1

    .line 73
    iget-object v2, p0, Le/c/a/l2;->f:Le/c/a/h2;

    iget-boolean v2, v2, Le/c/a/h2;->c:Z

    if-eqz v2, :cond_5

    .line 74
    invoke-virtual {p0, p1, v0}, Le/c/a/l2;->a(Le/c/a/e1;Landroid/graphics/Path;)V

    .line 75
    :cond_5
    iget-object v2, p0, Le/c/a/l2;->f:Le/c/a/h2;

    iget-boolean v2, v2, Le/c/a/h2;->d:Z

    if-eqz v2, :cond_6

    .line 76
    invoke-virtual {p0, v0}, Le/c/a/l2;->b(Landroid/graphics/Path;)V

    .line 77
    :cond_6
    invoke-virtual {p0, p1}, Le/c/a/l2;->a(Le/c/a/x;)V

    if-eqz v1, :cond_7

    .line 78
    invoke-virtual {p0, p1}, Le/c/a/l2;->c(Le/c/a/e1;)V

    :cond_7
    return-void
.end method

.method public final c()Z
    .locals 1

    .line 79
    iget-object v0, p0, Le/c/a/l2;->f:Le/c/a/h2;

    iget-object v0, v0, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v0, v0, Le/c/a/y0;->B:Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    .line 80
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public final d()V
    .locals 3

    .line 20
    :try_start_0
    iget-object v0, p0, Le/c/a/l2;->a:Landroid/graphics/Canvas;

    invoke-virtual {v0}, Landroid/graphics/Canvas;->getWidth()I

    move-result v0

    iget-object v1, p0, Le/c/a/l2;->a:Landroid/graphics/Canvas;

    invoke-virtual {v1}, Landroid/graphics/Canvas;->getHeight()I

    move-result v1

    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 21
    iget-object v1, p0, Le/c/a/l2;->k:Ljava/util/Stack;

    invoke-virtual {v1, v0}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    new-instance v1, Landroid/graphics/Canvas;

    invoke-direct {v1, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 23
    iget-object v0, p0, Le/c/a/l2;->a:Landroid/graphics/Canvas;

    invoke-virtual {v0}, Landroid/graphics/Canvas;->getMatrix()Landroid/graphics/Matrix;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/graphics/Canvas;->setMatrix(Landroid/graphics/Matrix;)V

    .line 24
    iput-object v1, p0, Le/c/a/l2;->a:Landroid/graphics/Canvas;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Not enough memory to create temporary bitmaps for mask processing"

    .line 25
    invoke-static {v2, v1}, Le/c/a/l2;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 26
    throw v0
.end method

.method public final d(Le/c/a/e1;)V
    .locals 8

    .line 1
    iget-object v0, p1, Le/c/a/h1;->b:Le/c/a/d1;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p1, Le/c/a/e1;->h:Le/c/a/n;

    if-nez v0, :cond_1

    return-void

    .line 3
    :cond_1
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 4
    iget-object v1, p0, Le/c/a/l2;->i:Ljava/util/Stack;

    invoke-virtual {v1}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Matrix;

    invoke-virtual {v1, v0}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    move-result v1

    if-eqz v1, :cond_8

    const/16 v1, 0x8

    new-array v1, v1, [F

    .line 5
    iget-object v2, p1, Le/c/a/e1;->h:Le/c/a/n;

    iget v3, v2, Le/c/a/n;->b:F

    const/4 v4, 0x0

    aput v3, v1, v4

    iget v3, v2, Le/c/a/n;->c:F

    const/4 v5, 0x1

    aput v3, v1, v5

    .line 6
    invoke-virtual {v2}, Le/c/a/n;->a()F

    move-result v2

    const/4 v3, 0x2

    aput v2, v1, v3

    const/4 v2, 0x3

    iget-object v6, p1, Le/c/a/e1;->h:Le/c/a/n;

    iget v7, v6, Le/c/a/n;->c:F

    aput v7, v1, v2

    const/4 v2, 0x4

    .line 7
    invoke-virtual {v6}, Le/c/a/n;->a()F

    move-result v6

    aput v6, v1, v2

    const/4 v2, 0x5

    iget-object v6, p1, Le/c/a/e1;->h:Le/c/a/n;

    invoke-virtual {v6}, Le/c/a/n;->b()F

    move-result v6

    aput v6, v1, v2

    .line 8
    iget-object p1, p1, Le/c/a/e1;->h:Le/c/a/n;

    iget v2, p1, Le/c/a/n;->b:F

    const/4 v6, 0x6

    aput v2, v1, v6

    const/4 v2, 0x7

    invoke-virtual {p1}, Le/c/a/n;->b()F

    move-result p1

    aput p1, v1, v2

    .line 9
    iget-object p1, p0, Le/c/a/l2;->a:Landroid/graphics/Canvas;

    invoke-virtual {p1}, Landroid/graphics/Canvas;->getMatrix()Landroid/graphics/Matrix;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    .line 10
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 11
    new-instance p1, Landroid/graphics/RectF;

    aget v0, v1, v4

    aget v2, v1, v5

    aget v4, v1, v4

    aget v5, v1, v5

    invoke-direct {p1, v0, v2, v4, v5}, Landroid/graphics/RectF;-><init>(FFFF)V

    :goto_0
    if-le v3, v6, :cond_3

    .line 12
    iget-object v0, p0, Le/c/a/l2;->h:Ljava/util/Stack;

    invoke-virtual {v0}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/c/a/e1;

    .line 13
    iget-object v1, v0, Le/c/a/e1;->h:Le/c/a/n;

    if-nez v1, :cond_2

    .line 14
    iget v1, p1, Landroid/graphics/RectF;->left:F

    iget v2, p1, Landroid/graphics/RectF;->top:F

    iget v3, p1, Landroid/graphics/RectF;->right:F

    iget p1, p1, Landroid/graphics/RectF;->bottom:F

    invoke-static {v1, v2, v3, p1}, Le/c/a/n;->a(FFFF)Le/c/a/n;

    move-result-object p1

    iput-object p1, v0, Le/c/a/e1;->h:Le/c/a/n;

    goto :goto_1

    .line 15
    :cond_2
    iget v0, p1, Landroid/graphics/RectF;->left:F

    iget v2, p1, Landroid/graphics/RectF;->top:F

    iget v3, p1, Landroid/graphics/RectF;->right:F

    iget p1, p1, Landroid/graphics/RectF;->bottom:F

    invoke-static {v0, v2, v3, p1}, Le/c/a/n;->a(FFFF)Le/c/a/n;

    move-result-object p1

    invoke-virtual {v1, p1}, Le/c/a/n;->a(Le/c/a/n;)V

    goto :goto_1

    .line 16
    :cond_3
    aget v0, v1, v3

    iget v2, p1, Landroid/graphics/RectF;->left:F

    cmpg-float v0, v0, v2

    if-gez v0, :cond_4

    aget v0, v1, v3

    iput v0, p1, Landroid/graphics/RectF;->left:F

    .line 17
    :cond_4
    aget v0, v1, v3

    iget v2, p1, Landroid/graphics/RectF;->right:F

    cmpl-float v0, v0, v2

    if-lez v0, :cond_5

    aget v0, v1, v3

    iput v0, p1, Landroid/graphics/RectF;->right:F

    :cond_5
    add-int/lit8 v0, v3, 0x1

    .line 18
    aget v2, v1, v0

    iget v4, p1, Landroid/graphics/RectF;->top:F

    cmpg-float v2, v2, v4

    if-gez v2, :cond_6

    aget v2, v1, v0

    iput v2, p1, Landroid/graphics/RectF;->top:F

    .line 19
    :cond_6
    aget v2, v1, v0

    iget v4, p1, Landroid/graphics/RectF;->bottom:F

    cmpl-float v2, v2, v4

    if-lez v2, :cond_7

    aget v0, v1, v0

    iput v0, p1, Landroid/graphics/RectF;->bottom:F

    :cond_7
    add-int/lit8 v3, v3, 0x2

    goto :goto_0

    :cond_8
    :goto_1
    return-void
.end method

.method public final e()Le/c/a/u0;
    .locals 3

    .line 2
    iget-object v0, p0, Le/c/a/l2;->f:Le/c/a/h2;

    iget-object v0, v0, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v1, v0, Le/c/a/y0;->u:Le/c/a/w0;

    sget-object v2, Le/c/a/w0;->b:Le/c/a/w0;

    if-eq v1, v2, :cond_2

    iget-object v0, v0, Le/c/a/y0;->v:Le/c/a/u0;

    sget-object v1, Le/c/a/u0;->c:Le/c/a/u0;

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    sget-object v1, Le/c/a/u0;->b:Le/c/a/u0;

    if-ne v0, v1, :cond_1

    sget-object v1, Le/c/a/u0;->d:Le/c/a/u0;

    :cond_1
    return-object v1

    .line 4
    :cond_2
    :goto_0
    iget-object v0, p0, Le/c/a/l2;->f:Le/c/a/h2;

    iget-object v0, v0, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v0, v0, Le/c/a/y0;->v:Le/c/a/u0;

    return-object v0
.end method

.method public final f()Landroid/graphics/Path$FillType;
    .locals 2

    .line 2
    iget-object v0, p0, Le/c/a/l2;->f:Le/c/a/h2;

    iget-object v0, v0, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v0, v0, Le/c/a/y0;->G:Le/c/a/q0;

    if-nez v0, :cond_0

    .line 3
    sget-object v0, Landroid/graphics/Path$FillType;->WINDING:Landroid/graphics/Path$FillType;

    return-object v0

    .line 4
    :cond_0
    invoke-static {}, Le/c/a/l2;->v()[I

    move-result-object v0

    iget-object v1, p0, Le/c/a/l2;->f:Le/c/a/h2;

    iget-object v1, v1, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v1, v1, Le/c/a/y0;->G:Le/c/a/q0;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    .line 5
    sget-object v0, Landroid/graphics/Path$FillType;->WINDING:Landroid/graphics/Path$FillType;

    return-object v0

    .line 6
    :cond_1
    sget-object v0, Landroid/graphics/Path$FillType;->EVEN_ODD:Landroid/graphics/Path$FillType;

    return-object v0
.end method

.method public g()F
    .locals 1

    .line 1
    iget-object v0, p0, Le/c/a/l2;->f:Le/c/a/h2;

    iget-object v0, v0, Le/c/a/h2;->e:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getTextSize()F

    move-result v0

    return v0
.end method

.method public h()F
    .locals 2

    .line 1
    iget-object v0, p0, Le/c/a/l2;->f:Le/c/a/h2;

    iget-object v0, v0, Le/c/a/h2;->e:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getTextSize()F

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    return v0
.end method

.method public i()Le/c/a/n;
    .locals 2

    .line 1
    iget-object v0, p0, Le/c/a/l2;->f:Le/c/a/h2;

    iget-object v1, v0, Le/c/a/h2;->h:Le/c/a/n;

    if-eqz v1, :cond_0

    return-object v1

    .line 2
    :cond_0
    iget-object v0, v0, Le/c/a/h2;->g:Le/c/a/n;

    return-object v0
.end method

.method public j()F
    .locals 1

    .line 1
    iget v0, p0, Le/c/a/l2;->c:F

    return v0
.end method

.method public final k()Landroid/graphics/Path$FillType;
    .locals 2

    .line 1
    iget-object v0, p0, Le/c/a/l2;->f:Le/c/a/h2;

    iget-object v0, v0, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v0, v0, Le/c/a/y0;->d:Le/c/a/q0;

    if-nez v0, :cond_0

    .line 2
    sget-object v0, Landroid/graphics/Path$FillType;->WINDING:Landroid/graphics/Path$FillType;

    return-object v0

    .line 3
    :cond_0
    invoke-static {}, Le/c/a/l2;->v()[I

    move-result-object v0

    iget-object v1, p0, Le/c/a/l2;->f:Le/c/a/h2;

    iget-object v1, v1, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v1, v1, Le/c/a/y0;->d:Le/c/a/q0;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    .line 4
    sget-object v0, Landroid/graphics/Path$FillType;->WINDING:Landroid/graphics/Path$FillType;

    return-object v0

    .line 5
    :cond_1
    sget-object v0, Landroid/graphics/Path$FillType;->EVEN_ODD:Landroid/graphics/Path$FillType;

    return-object v0
.end method

.method public final l()V
    .locals 1

    .line 1
    iget-object v0, p0, Le/c/a/l2;->h:Ljava/util/Stack;

    invoke-virtual {v0}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    .line 2
    iget-object v0, p0, Le/c/a/l2;->i:Ljava/util/Stack;

    invoke-virtual {v0}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    return-void
.end method

.method public final m()Landroid/graphics/Bitmap;
    .locals 18

    move-object/from16 v0, p0

    .line 1
    iget-object v1, v0, Le/c/a/l2;->k:Ljava/util/Stack;

    invoke-virtual {v1}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Bitmap;

    .line 2
    iget-object v2, v0, Le/c/a/l2;->k:Ljava/util/Stack;

    invoke-virtual {v2}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    move-result-object v2

    move-object v11, v2

    check-cast v11, Landroid/graphics/Bitmap;

    .line 3
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v12

    .line 4
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v13

    .line 5
    new-array v14, v12, [I

    .line 6
    new-array v15, v12, [I

    const/16 v16, 0x0

    const/4 v10, 0x0

    :goto_0
    if-lt v10, v13, :cond_0

    .line 7
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    return-object v11

    :cond_0
    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v9, 0x1

    move-object v2, v1

    move-object v3, v14

    move v5, v12

    move v7, v10

    move v8, v12

    .line 8
    invoke-virtual/range {v2 .. v9}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v2, 0x1

    move-object v3, v11

    move-object v4, v15

    move v6, v12

    move v8, v10

    move v9, v12

    move/from16 v17, v10

    move v10, v2

    .line 9
    invoke-virtual/range {v3 .. v10}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    const/4 v2, 0x0

    :goto_1
    if-lt v2, v12, :cond_1

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v10, 0x1

    move-object v3, v11

    move-object v4, v15

    move v6, v12

    move/from16 v8, v17

    move v9, v12

    .line 10
    invoke-virtual/range {v3 .. v10}, Landroid/graphics/Bitmap;->setPixels([IIIIIII)V

    add-int/lit8 v10, v17, 0x1

    goto :goto_0

    .line 11
    :cond_1
    aget v3, v14, v2

    and-int/lit16 v4, v3, 0xff

    shr-int/lit8 v5, v3, 0x8

    and-int/lit16 v5, v5, 0xff

    shr-int/lit8 v6, v3, 0x10

    and-int/lit16 v6, v6, 0xff

    shr-int/lit8 v3, v3, 0x18

    and-int/lit16 v3, v3, 0xff

    if-nez v3, :cond_2

    .line 12
    aput v16, v15, v2

    goto :goto_2

    :cond_2
    mul-int/lit16 v6, v6, 0x1b33

    mul-int/lit16 v5, v5, 0x5b92

    add-int/2addr v6, v5

    mul-int/lit16 v4, v4, 0x93a

    add-int/2addr v6, v4

    mul-int v6, v6, v3

    const v3, 0x7f8000

    .line 13
    div-int/2addr v6, v3

    .line 14
    aget v3, v15, v2

    shr-int/lit8 v4, v3, 0x18

    and-int/lit16 v4, v4, 0xff

    mul-int v4, v4, v6

    .line 15
    div-int/lit16 v4, v4, 0xff

    const v5, 0xffffff

    and-int/2addr v3, v5

    shl-int/lit8 v4, v4, 0x18

    or-int/2addr v3, v4

    .line 16
    aput v3, v15, v2

    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1
.end method

.method public final n()Z
    .locals 5

    .line 1
    invoke-virtual {p0}, Le/c/a/l2;->o()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 2
    :cond_0
    iget-object v0, p0, Le/c/a/l2;->a:Landroid/graphics/Canvas;

    iget-object v2, p0, Le/c/a/l2;->f:Le/c/a/h2;

    iget-object v2, v2, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v2, v2, Le/c/a/y0;->n:Ljava/lang/Float;

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    invoke-virtual {p0, v2}, Le/c/a/l2;->a(F)I

    move-result v2

    const/4 v3, 0x4

    const/4 v4, 0x0

    invoke-virtual {v0, v4, v2, v3}, Landroid/graphics/Canvas;->saveLayerAlpha(Landroid/graphics/RectF;II)I

    .line 3
    iget-object v0, p0, Le/c/a/l2;->g:Ljava/util/Stack;

    iget-object v2, p0, Le/c/a/l2;->f:Le/c/a/h2;

    invoke-virtual {v0, v2}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    iget-object v0, p0, Le/c/a/l2;->f:Le/c/a/h2;

    invoke-virtual {v0}, Le/c/a/h2;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/c/a/h2;

    iput-object v0, p0, Le/c/a/l2;->f:Le/c/a/h2;

    .line 5
    iget-object v2, v0, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v2, v2, Le/c/a/y0;->H:Ljava/lang/String;

    const/4 v3, 0x1

    if-eqz v2, :cond_3

    iget-boolean v0, v0, Le/c/a/h2;->j:Z

    if-eqz v0, :cond_3

    .line 6
    iget-object v0, p0, Le/c/a/l2;->e:Le/c/a/a2;

    invoke-virtual {v0, v2}, Le/c/a/a2;->b(Ljava/lang/String;)Le/c/a/h1;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 7
    instance-of v0, v0, Le/c/a/e0;

    if-nez v0, :cond_1

    goto :goto_0

    .line 8
    :cond_1
    iget-object v0, p0, Le/c/a/l2;->j:Ljava/util/Stack;

    iget-object v1, p0, Le/c/a/l2;->a:Landroid/graphics/Canvas;

    invoke-virtual {v0, v1}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    invoke-virtual {p0}, Le/c/a/l2;->d()V

    goto :goto_1

    :cond_2
    :goto_0
    new-array v0, v3, [Ljava/lang/Object;

    .line 10
    iget-object v2, p0, Le/c/a/l2;->f:Le/c/a/h2;

    iget-object v2, v2, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v2, v2, Le/c/a/y0;->H:Ljava/lang/String;

    aput-object v2, v0, v1

    const-string v1, "Mask reference \'%s\' not found"

    invoke-static {v1, v0}, Le/c/a/l2;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 11
    iget-object v0, p0, Le/c/a/l2;->f:Le/c/a/h2;

    iget-object v0, v0, Le/c/a/h2;->b:Le/c/a/y0;

    iput-object v4, v0, Le/c/a/y0;->H:Ljava/lang/String;

    :cond_3
    :goto_1
    return v3
.end method

.method public final o()Z
    .locals 3

    .line 1
    iget-object v0, p0, Le/c/a/l2;->f:Le/c/a/h2;

    iget-object v1, v0, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v1, v1, Le/c/a/y0;->H:Ljava/lang/String;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    iget-boolean v0, v0, Le/c/a/h2;->j:Z

    if-nez v0, :cond_0

    new-array v0, v2, [Ljava/lang/Object;

    const-string v1, "Masks are not supported when using getPicture()"

    .line 2
    invoke-static {v1, v0}, Le/c/a/l2;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3
    :cond_0
    iget-object v0, p0, Le/c/a/l2;->f:Le/c/a/h2;

    iget-object v0, v0, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v0, v0, Le/c/a/y0;->n:Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    const/high16 v1, 0x3f800000    # 1.0f

    cmpg-float v0, v0, v1

    if-ltz v0, :cond_2

    .line 4
    iget-object v0, p0, Le/c/a/l2;->f:Le/c/a/h2;

    iget-object v1, v0, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v1, v1, Le/c/a/y0;->H:Ljava/lang/String;

    if-eqz v1, :cond_1

    iget-boolean v0, v0, Le/c/a/h2;->j:Z

    if-nez v0, :cond_2

    :cond_1
    return v2

    :cond_2
    const/4 v0, 0x1

    return v0
.end method

.method public final p()V
    .locals 2

    .line 1
    new-instance v0, Le/c/a/h2;

    invoke-direct {v0, p0}, Le/c/a/h2;-><init>(Le/c/a/l2;)V

    iput-object v0, p0, Le/c/a/l2;->f:Le/c/a/h2;

    .line 2
    new-instance v0, Ljava/util/Stack;

    invoke-direct {v0}, Ljava/util/Stack;-><init>()V

    iput-object v0, p0, Le/c/a/l2;->g:Ljava/util/Stack;

    .line 3
    iget-object v0, p0, Le/c/a/l2;->f:Le/c/a/h2;

    invoke-static {}, Le/c/a/y0;->a()Le/c/a/y0;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Le/c/a/l2;->a(Le/c/a/h2;Le/c/a/y0;)V

    .line 4
    iget-object v0, p0, Le/c/a/l2;->f:Le/c/a/h2;

    iget-object v1, p0, Le/c/a/l2;->b:Le/c/a/n;

    iput-object v1, v0, Le/c/a/h2;->g:Le/c/a/n;

    const/4 v1, 0x0

    .line 5
    iput-boolean v1, v0, Le/c/a/h2;->i:Z

    .line 6
    iget-boolean v1, p0, Le/c/a/l2;->d:Z

    iput-boolean v1, v0, Le/c/a/h2;->j:Z

    .line 7
    iget-object v1, p0, Le/c/a/l2;->g:Ljava/util/Stack;

    invoke-virtual {v0}, Le/c/a/h2;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/c/a/h2;

    invoke-virtual {v1, v0}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    new-instance v0, Ljava/util/Stack;

    invoke-direct {v0}, Ljava/util/Stack;-><init>()V

    iput-object v0, p0, Le/c/a/l2;->j:Ljava/util/Stack;

    .line 9
    new-instance v0, Ljava/util/Stack;

    invoke-direct {v0}, Ljava/util/Stack;-><init>()V

    iput-object v0, p0, Le/c/a/l2;->k:Ljava/util/Stack;

    .line 10
    new-instance v0, Ljava/util/Stack;

    invoke-direct {v0}, Ljava/util/Stack;-><init>()V

    iput-object v0, p0, Le/c/a/l2;->i:Ljava/util/Stack;

    .line 11
    new-instance v0, Ljava/util/Stack;

    invoke-direct {v0}, Ljava/util/Stack;-><init>()V

    iput-object v0, p0, Le/c/a/l2;->h:Ljava/util/Stack;

    return-void
.end method

.method public final q()V
    .locals 1

    .line 1
    iget-object v0, p0, Le/c/a/l2;->a:Landroid/graphics/Canvas;

    invoke-virtual {v0}, Landroid/graphics/Canvas;->restore()V

    .line 2
    iget-object v0, p0, Le/c/a/l2;->g:Ljava/util/Stack;

    invoke-virtual {v0}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/c/a/h2;

    iput-object v0, p0, Le/c/a/l2;->f:Le/c/a/h2;

    return-void
.end method

.method public final r()V
    .locals 2

    .line 1
    iget-object v0, p0, Le/c/a/l2;->a:Landroid/graphics/Canvas;

    invoke-virtual {v0}, Landroid/graphics/Canvas;->save()I

    .line 2
    iget-object v0, p0, Le/c/a/l2;->g:Ljava/util/Stack;

    iget-object v1, p0, Le/c/a/l2;->f:Le/c/a/h2;

    invoke-virtual {v0, v1}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    iget-object v0, p0, Le/c/a/l2;->f:Le/c/a/h2;

    invoke-virtual {v0}, Le/c/a/h2;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/c/a/h2;

    iput-object v0, p0, Le/c/a/l2;->f:Le/c/a/h2;

    return-void
.end method

.method public final s()V
    .locals 3

    .line 1
    iget-object v0, p0, Le/c/a/l2;->f:Le/c/a/h2;

    iget-object v0, v0, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v1, v0, Le/c/a/y0;->K:Le/c/a/i1;

    instance-of v2, v1, Le/c/a/r;

    if-eqz v2, :cond_0

    .line 2
    check-cast v1, Le/c/a/r;

    iget v0, v1, Le/c/a/r;->b:I

    goto :goto_0

    .line 3
    :cond_0
    instance-of v1, v1, Le/c/a/s;

    if-eqz v1, :cond_2

    .line 4
    iget-object v0, v0, Le/c/a/y0;->o:Le/c/a/r;

    iget v0, v0, Le/c/a/r;->b:I

    .line 5
    :goto_0
    iget-object v1, p0, Le/c/a/l2;->f:Le/c/a/h2;

    iget-object v1, v1, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v1, v1, Le/c/a/y0;->L:Ljava/lang/Float;

    if-eqz v1, :cond_1

    .line 6
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    invoke-virtual {p0, v1}, Le/c/a/l2;->a(F)I

    move-result v1

    shl-int/lit8 v1, v1, 0x18

    or-int/2addr v0, v1

    .line 7
    :cond_1
    iget-object v1, p0, Le/c/a/l2;->a:Landroid/graphics/Canvas;

    invoke-virtual {v1, v0}, Landroid/graphics/Canvas;->drawColor(I)V

    :cond_2
    return-void
.end method

.method public final t()Z
    .locals 1

    .line 1
    iget-object v0, p0, Le/c/a/l2;->f:Le/c/a/h2;

    iget-object v0, v0, Le/c/a/h2;->b:Le/c/a/y0;

    iget-object v0, v0, Le/c/a/y0;->C:Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x1

    return v0
.end method
