.class public final Le/f/e/n/d/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final g:[I


# instance fields
.field public final a:Le/f/e/o/b;

.field public b:Z

.field public c:I

.field public d:I

.field public e:I

.field public f:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x4

    new-array v0, v0, [I

    .line 1
    fill-array-data v0, :array_0

    sput-object v0, Le/f/e/n/d/b;->g:[I

    return-void

    nop

    :array_0
    .array-data 4
        0xee0
        0x1dc
        0x83b
        0x707
    .end array-data
.end method

.method public constructor <init>(Le/f/e/o/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/f/e/n/d/b;->a:Le/f/e/o/b;

    return-void
.end method

.method public static a(Le/f/e/l;Le/f/e/l;)F
    .locals 2

    .line 106
    invoke-virtual {p0}, Le/f/e/l;->a()F

    move-result v0

    invoke-virtual {p0}, Le/f/e/l;->b()F

    move-result p0

    invoke-virtual {p1}, Le/f/e/l;->a()F

    move-result v1

    invoke-virtual {p1}, Le/f/e/l;->b()F

    move-result p1

    invoke-static {v0, p0, v1, p1}, Le/f/e/o/m/a;->a(FFFF)F

    move-result p0

    return p0
.end method

.method public static a(JZ)I
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/NotFoundException;
        }
    .end annotation

    const/4 v0, 0x4

    if-eqz p2, :cond_0

    const/4 p2, 0x7

    const/4 v1, 0x2

    goto :goto_0

    :cond_0
    const/16 p2, 0xa

    const/4 v1, 0x4

    :goto_0
    sub-int v2, p2, v1

    .line 31
    new-array v3, p2, [I

    add-int/lit8 p2, p2, -0x1

    :goto_1
    if-ltz p2, :cond_1

    long-to-int v4, p0

    and-int/lit8 v4, v4, 0xf

    .line 32
    aput v4, v3, p2

    shr-long/2addr p0, v0

    add-int/lit8 p2, p2, -0x1

    goto :goto_1

    .line 33
    :cond_1
    :try_start_0
    new-instance p0, Le/f/e/o/n/c;

    sget-object p1, Le/f/e/o/n/a;->k:Le/f/e/o/n/a;

    invoke-direct {p0, p1}, Le/f/e/o/n/c;-><init>(Le/f/e/o/n/a;)V

    .line 34
    invoke-virtual {p0, v3, v2}, Le/f/e/o/n/c;->a([II)V
    :try_end_0
    .catch Lcom/google/zxing/common/reedsolomon/ReedSolomonException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p0, 0x0

    const/4 p1, 0x0

    :goto_2
    if-ge p0, v1, :cond_2

    shl-int/lit8 p1, p1, 0x4

    .line 35
    aget p2, v3, p0

    add-int/2addr p1, p2

    add-int/lit8 p0, p0, 0x1

    goto :goto_2

    :cond_2
    return p1

    .line 36
    :catch_0
    invoke-static {}, Lcom/google/zxing/NotFoundException;->a()Lcom/google/zxing/NotFoundException;

    move-result-object p0

    throw p0
.end method

.method public static a([II)I
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/NotFoundException;
        }
    .end annotation

    .line 28
    array-length v0, p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    const/4 v4, 0x2

    if-ge v2, v0, :cond_0

    aget v5, p0, v2

    add-int/lit8 v4, p1, -0x2

    shr-int v4, v5, v4

    shl-int/lit8 v4, v4, 0x1

    and-int/lit8 v5, v5, 0x1

    add-int/2addr v4, v5

    shl-int/lit8 v3, v3, 0x3

    add-int/2addr v3, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    and-int/lit8 p0, v3, 0x1

    shl-int/lit8 p0, p0, 0xb

    shr-int/lit8 p1, v3, 0x1

    add-int/2addr p0, p1

    :goto_1
    const/4 p1, 0x4

    if-ge v1, p1, :cond_2

    .line 29
    sget-object p1, Le/f/e/n/d/b;->g:[I

    aget p1, p1, v1

    xor-int/2addr p1, p0

    invoke-static {p1}, Ljava/lang/Integer;->bitCount(I)I

    move-result p1

    if-gt p1, v4, :cond_1

    return v1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 30
    :cond_2
    invoke-static {}, Lcom/google/zxing/NotFoundException;->a()Lcom/google/zxing/NotFoundException;

    move-result-object p0

    throw p0
.end method

.method public static a([Le/f/e/l;FF)[Le/f/e/l;
    .locals 10

    const/high16 v0, 0x40000000    # 2.0f

    mul-float p1, p1, v0

    div-float/2addr p2, p1

    const/4 p1, 0x0

    .line 90
    aget-object v1, p0, p1

    invoke-virtual {v1}, Le/f/e/l;->a()F

    move-result v1

    const/4 v2, 0x2

    aget-object v3, p0, v2

    invoke-virtual {v3}, Le/f/e/l;->a()F

    move-result v3

    sub-float/2addr v1, v3

    .line 91
    aget-object v3, p0, p1

    invoke-virtual {v3}, Le/f/e/l;->b()F

    move-result v3

    aget-object v4, p0, v2

    invoke-virtual {v4}, Le/f/e/l;->b()F

    move-result v4

    sub-float/2addr v3, v4

    .line 92
    aget-object v4, p0, p1

    invoke-virtual {v4}, Le/f/e/l;->a()F

    move-result v4

    aget-object v5, p0, v2

    invoke-virtual {v5}, Le/f/e/l;->a()F

    move-result v5

    add-float/2addr v4, v5

    div-float/2addr v4, v0

    .line 93
    aget-object v5, p0, p1

    invoke-virtual {v5}, Le/f/e/l;->b()F

    move-result v5

    aget-object v6, p0, v2

    invoke-virtual {v6}, Le/f/e/l;->b()F

    move-result v6

    add-float/2addr v5, v6

    div-float/2addr v5, v0

    .line 94
    new-instance v6, Le/f/e/l;

    mul-float v1, v1, p2

    add-float v7, v4, v1

    mul-float v3, v3, p2

    add-float v8, v5, v3

    invoke-direct {v6, v7, v8}, Le/f/e/l;-><init>(FF)V

    .line 95
    new-instance v7, Le/f/e/l;

    sub-float/2addr v4, v1

    sub-float/2addr v5, v3

    invoke-direct {v7, v4, v5}, Le/f/e/l;-><init>(FF)V

    const/4 v1, 0x1

    .line 96
    aget-object v3, p0, v1

    invoke-virtual {v3}, Le/f/e/l;->a()F

    move-result v3

    const/4 v4, 0x3

    aget-object v5, p0, v4

    invoke-virtual {v5}, Le/f/e/l;->a()F

    move-result v5

    sub-float/2addr v3, v5

    .line 97
    aget-object v5, p0, v1

    invoke-virtual {v5}, Le/f/e/l;->b()F

    move-result v5

    aget-object v8, p0, v4

    invoke-virtual {v8}, Le/f/e/l;->b()F

    move-result v8

    sub-float/2addr v5, v8

    .line 98
    aget-object v8, p0, v1

    invoke-virtual {v8}, Le/f/e/l;->a()F

    move-result v8

    aget-object v9, p0, v4

    invoke-virtual {v9}, Le/f/e/l;->a()F

    move-result v9

    add-float/2addr v8, v9

    div-float/2addr v8, v0

    .line 99
    aget-object v9, p0, v1

    invoke-virtual {v9}, Le/f/e/l;->b()F

    move-result v9

    aget-object p0, p0, v4

    invoke-virtual {p0}, Le/f/e/l;->b()F

    move-result p0

    add-float/2addr v9, p0

    div-float/2addr v9, v0

    .line 100
    new-instance p0, Le/f/e/l;

    mul-float v3, v3, p2

    add-float v0, v8, v3

    mul-float p2, p2, v5

    add-float v5, v9, p2

    invoke-direct {p0, v0, v5}, Le/f/e/l;-><init>(FF)V

    .line 101
    new-instance v0, Le/f/e/l;

    sub-float/2addr v8, v3

    sub-float/2addr v9, p2

    invoke-direct {v0, v8, v9}, Le/f/e/l;-><init>(FF)V

    const/4 p2, 0x4

    new-array p2, p2, [Le/f/e/l;

    aput-object v6, p2, p1

    aput-object p0, p2, v1

    aput-object v7, p2, v2

    aput-object v0, p2, v4

    return-object p2
.end method

.method public static b(Le/f/e/n/d/a;Le/f/e/n/d/a;)F
    .locals 2

    .line 27
    invoke-virtual {p0}, Le/f/e/n/d/a;->a()I

    move-result v0

    invoke-virtual {p0}, Le/f/e/n/d/a;->b()I

    move-result p0

    invoke-virtual {p1}, Le/f/e/n/d/a;->a()I

    move-result v1

    invoke-virtual {p1}, Le/f/e/n/d/a;->b()I

    move-result p1

    invoke-static {v0, p0, v1, p1}, Le/f/e/o/m/a;->a(IIII)F

    move-result p0

    return p0
.end method


# virtual methods
.method public final a()I
    .locals 3

    .line 107
    iget-boolean v0, p0, Le/f/e/n/d/b;->b:Z

    const/4 v1, 0x4

    if-eqz v0, :cond_0

    .line 108
    iget v0, p0, Le/f/e/n/d/b;->c:I

    mul-int/lit8 v0, v0, 0x4

    add-int/lit8 v0, v0, 0xb

    return v0

    .line 109
    :cond_0
    iget v0, p0, Le/f/e/n/d/b;->c:I

    if-gt v0, v1, :cond_1

    mul-int/lit8 v0, v0, 0x4

    add-int/lit8 v0, v0, 0xf

    return v0

    :cond_1
    mul-int/lit8 v2, v0, 0x4

    sub-int/2addr v0, v1

    .line 110
    div-int/lit8 v0, v0, 0x8

    add-int/lit8 v0, v0, 0x1

    mul-int/lit8 v0, v0, 0x2

    add-int/2addr v2, v0

    add-int/lit8 v2, v2, 0xf

    return v2
.end method

.method public final a(Le/f/e/l;Le/f/e/l;I)I
    .locals 7

    .line 62
    invoke-static {p1, p2}, Le/f/e/n/d/b;->a(Le/f/e/l;Le/f/e/l;)F

    move-result v0

    int-to-float v1, p3

    div-float v1, v0, v1

    .line 63
    invoke-virtual {p1}, Le/f/e/l;->a()F

    move-result v2

    .line 64
    invoke-virtual {p1}, Le/f/e/l;->b()F

    move-result v3

    .line 65
    invoke-virtual {p2}, Le/f/e/l;->a()F

    move-result v4

    invoke-virtual {p1}, Le/f/e/l;->a()F

    move-result v5

    sub-float/2addr v4, v5

    mul-float v4, v4, v1

    div-float/2addr v4, v0

    .line 66
    invoke-virtual {p2}, Le/f/e/l;->b()F

    move-result p2

    invoke-virtual {p1}, Le/f/e/l;->b()F

    move-result p1

    sub-float/2addr p2, p1

    mul-float v1, v1, p2

    div-float/2addr v1, v0

    const/4 p1, 0x0

    const/4 p2, 0x0

    :goto_0
    if-ge p1, p3, :cond_1

    .line 67
    iget-object v0, p0, Le/f/e/n/d/b;->a:Le/f/e/o/b;

    int-to-float v5, p1

    mul-float v6, v5, v4

    add-float/2addr v6, v2

    invoke-static {v6}, Le/f/e/o/m/a;->a(F)I

    move-result v6

    mul-float v5, v5, v1

    add-float/2addr v5, v3

    invoke-static {v5}, Le/f/e/o/m/a;->a(F)I

    move-result v5

    invoke-virtual {v0, v6, v5}, Le/f/e/o/b;->b(II)Z

    move-result v0

    if-eqz v0, :cond_0

    sub-int v0, p3, p1

    const/4 v5, 0x1

    sub-int/2addr v0, v5

    shl-int v0, v5, v0

    or-int/2addr p2, v0

    :cond_0
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_1
    return p2
.end method

.method public final a(Le/f/e/n/d/a;Le/f/e/n/d/a;)I
    .locals 11

    .line 76
    invoke-static {p1, p2}, Le/f/e/n/d/b;->b(Le/f/e/n/d/a;Le/f/e/n/d/a;)F

    move-result v0

    .line 77
    invoke-virtual {p2}, Le/f/e/n/d/a;->a()I

    move-result v1

    invoke-virtual {p1}, Le/f/e/n/d/a;->a()I

    move-result v2

    sub-int/2addr v1, v2

    int-to-float v1, v1

    div-float/2addr v1, v0

    .line 78
    invoke-virtual {p2}, Le/f/e/n/d/a;->b()I

    move-result p2

    invoke-virtual {p1}, Le/f/e/n/d/a;->b()I

    move-result v2

    sub-int/2addr p2, v2

    int-to-float p2, p2

    div-float/2addr p2, v0

    .line 79
    invoke-virtual {p1}, Le/f/e/n/d/a;->a()I

    move-result v2

    int-to-float v2, v2

    .line 80
    invoke-virtual {p1}, Le/f/e/n/d/a;->b()I

    move-result v3

    int-to-float v3, v3

    .line 81
    iget-object v4, p0, Le/f/e/n/d/b;->a:Le/f/e/o/b;

    invoke-virtual {p1}, Le/f/e/n/d/a;->a()I

    move-result v5

    invoke-virtual {p1}, Le/f/e/n/d/a;->b()I

    move-result p1

    invoke-virtual {v4, v5, p1}, Le/f/e/o/b;->b(II)Z

    move-result p1

    float-to-double v4, v0

    .line 82
    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v4

    double-to-int v4, v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    :goto_0
    if-ge v6, v4, :cond_1

    add-float/2addr v2, v1

    add-float/2addr v3, p2

    .line 83
    iget-object v8, p0, Le/f/e/n/d/b;->a:Le/f/e/o/b;

    invoke-static {v2}, Le/f/e/o/m/a;->a(F)I

    move-result v9

    invoke-static {v3}, Le/f/e/o/m/a;->a(F)I

    move-result v10

    invoke-virtual {v8, v9, v10}, Le/f/e/o/b;->b(II)Z

    move-result v8

    if-eq v8, p1, :cond_0

    add-int/lit8 v7, v7, 0x1

    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_1
    int-to-float p2, v7

    div-float/2addr p2, v0

    const v0, 0x3dcccccd    # 0.1f

    cmpl-float v1, p2, v0

    if-lez v1, :cond_2

    const v1, 0x3f666666    # 0.9f

    cmpg-float v1, p2, v1

    if-gez v1, :cond_2

    return v5

    :cond_2
    const/4 v1, 0x1

    cmpg-float p2, p2, v0

    if-gtz p2, :cond_3

    const/4 v5, 0x1

    :cond_3
    if-ne v5, p1, :cond_4

    return v1

    :cond_4
    const/4 p1, -0x1

    return p1
.end method

.method public a(Z)Le/f/e/n/a;
    .locals 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/NotFoundException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Le/f/e/n/d/b;->b()Le/f/e/n/d/a;

    move-result-object v0

    .line 2
    invoke-virtual {p0, v0}, Le/f/e/n/d/b;->a(Le/f/e/n/d/a;)[Le/f/e/l;

    move-result-object v6

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    .line 3
    aget-object v1, v6, v0

    const/4 v2, 0x2

    .line 4
    aget-object v3, v6, v2

    aput-object v3, v6, v0

    .line 5
    aput-object v1, v6, v2

    .line 6
    :cond_0
    invoke-virtual {p0, v6}, Le/f/e/n/d/b;->a([Le/f/e/l;)V

    .line 7
    iget-object v1, p0, Le/f/e/n/d/b;->a:Le/f/e/o/b;

    iget v0, p0, Le/f/e/n/d/b;->f:I

    rem-int/lit8 v2, v0, 0x4

    aget-object v2, v6, v2

    add-int/lit8 v3, v0, 0x1

    rem-int/lit8 v3, v3, 0x4

    aget-object v3, v6, v3

    add-int/lit8 v4, v0, 0x2

    rem-int/lit8 v4, v4, 0x4

    aget-object v4, v6, v4

    add-int/lit8 v0, v0, 0x3

    rem-int/lit8 v0, v0, 0x4

    aget-object v5, v6, v0

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Le/f/e/n/d/b;->a(Le/f/e/o/b;Le/f/e/l;Le/f/e/l;Le/f/e/l;Le/f/e/l;)Le/f/e/o/b;

    move-result-object v8

    .line 8
    invoke-virtual {p0, v6}, Le/f/e/n/d/b;->b([Le/f/e/l;)[Le/f/e/l;

    move-result-object v9

    .line 9
    new-instance v0, Le/f/e/n/a;

    iget-boolean v10, p0, Le/f/e/n/d/b;->b:Z

    iget v11, p0, Le/f/e/n/d/b;->d:I

    iget v12, p0, Le/f/e/n/d/b;->c:I

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Le/f/e/n/a;-><init>(Le/f/e/o/b;[Le/f/e/l;ZII)V

    return-object v0
.end method

.method public final a(Le/f/e/n/d/a;ZII)Le/f/e/n/d/a;
    .locals 2

    .line 84
    invoke-virtual {p1}, Le/f/e/n/d/a;->a()I

    move-result v0

    add-int/2addr v0, p3

    .line 85
    invoke-virtual {p1}, Le/f/e/n/d/a;->b()I

    move-result p1

    :goto_0
    add-int/2addr p1, p4

    .line 86
    invoke-virtual {p0, v0, p1}, Le/f/e/n/d/b;->a(II)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Le/f/e/n/d/b;->a:Le/f/e/o/b;

    invoke-virtual {v1, v0, p1}, Le/f/e/o/b;->b(II)Z

    move-result v1

    if-ne v1, p2, :cond_0

    add-int/2addr v0, p3

    goto :goto_0

    :cond_0
    sub-int/2addr v0, p3

    sub-int/2addr p1, p4

    .line 87
    :goto_1
    invoke-virtual {p0, v0, p1}, Le/f/e/n/d/b;->a(II)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Le/f/e/n/d/b;->a:Le/f/e/o/b;

    invoke-virtual {v1, v0, p1}, Le/f/e/o/b;->b(II)Z

    move-result v1

    if-ne v1, p2, :cond_1

    add-int/2addr v0, p3

    goto :goto_1

    :cond_1
    sub-int/2addr v0, p3

    .line 88
    :goto_2
    invoke-virtual {p0, v0, p1}, Le/f/e/n/d/b;->a(II)Z

    move-result p3

    if-eqz p3, :cond_2

    iget-object p3, p0, Le/f/e/n/d/b;->a:Le/f/e/o/b;

    invoke-virtual {p3, v0, p1}, Le/f/e/o/b;->b(II)Z

    move-result p3

    if-ne p3, p2, :cond_2

    add-int/2addr p1, p4

    goto :goto_2

    :cond_2
    sub-int/2addr p1, p4

    .line 89
    new-instance p2, Le/f/e/n/d/a;

    invoke-direct {p2, v0, p1}, Le/f/e/n/d/a;-><init>(II)V

    return-object p2
.end method

.method public final a(Le/f/e/o/b;Le/f/e/l;Le/f/e/l;Le/f/e/l;Le/f/e/l;)Le/f/e/o/b;
    .locals 20
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/NotFoundException;
        }
    .end annotation

    move-object/from16 v1, p1

    .line 54
    invoke-static {}, Le/f/e/o/i;->a()Le/f/e/o/i;

    move-result-object v0

    .line 55
    invoke-virtual/range {p0 .. p0}, Le/f/e/n/d/b;->a()I

    move-result v4

    move v3, v4

    move v2, v4

    int-to-float v4, v4

    const/high16 v5, 0x40000000    # 2.0f

    div-float v6, v4, v5

    move-object/from16 v15, p0

    .line 56
    iget v8, v15, Le/f/e/n/d/b;->e:I

    int-to-float v4, v8

    sub-float v5, v6, v4

    move v7, v5

    move v4, v5

    move v10, v5

    int-to-float v8, v8

    add-float/2addr v6, v8

    move v8, v6

    move v9, v6

    move v11, v6

    .line 57
    invoke-virtual/range {p2 .. p2}, Le/f/e/l;->a()F

    move-result v12

    invoke-virtual/range {p2 .. p2}, Le/f/e/l;->b()F

    move-result v13

    .line 58
    invoke-virtual/range {p3 .. p3}, Le/f/e/l;->a()F

    move-result v14

    invoke-virtual/range {p3 .. p3}, Le/f/e/l;->b()F

    move-result v16

    move/from16 v15, v16

    .line 59
    invoke-virtual/range {p4 .. p4}, Le/f/e/l;->a()F

    move-result v16

    invoke-virtual/range {p4 .. p4}, Le/f/e/l;->b()F

    move-result v17

    .line 60
    invoke-virtual/range {p5 .. p5}, Le/f/e/l;->a()F

    move-result v18

    invoke-virtual/range {p5 .. p5}, Le/f/e/l;->b()F

    move-result v19

    .line 61
    invoke-virtual/range {v0 .. v19}, Le/f/e/o/i;->a(Le/f/e/o/b;IIFFFFFFFFFFFFFFFF)Le/f/e/o/b;

    move-result-object v0

    return-object v0
.end method

.method public final a([Le/f/e/l;)V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/NotFoundException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 10
    aget-object v1, p1, v0

    invoke-virtual {p0, v1}, Le/f/e/n/d/b;->a(Le/f/e/l;)Z

    move-result v1

    if-eqz v1, :cond_3

    const/4 v1, 0x1

    aget-object v2, p1, v1

    invoke-virtual {p0, v2}, Le/f/e/n/d/b;->a(Le/f/e/l;)Z

    move-result v2

    if-eqz v2, :cond_3

    const/4 v2, 0x2

    aget-object v3, p1, v2

    .line 11
    invoke-virtual {p0, v3}, Le/f/e/n/d/b;->a(Le/f/e/l;)Z

    move-result v3

    if-eqz v3, :cond_3

    const/4 v3, 0x3

    aget-object v4, p1, v3

    invoke-virtual {p0, v4}, Le/f/e/n/d/b;->a(Le/f/e/l;)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 12
    iget v4, p0, Le/f/e/n/d/b;->e:I

    mul-int/lit8 v4, v4, 0x2

    const/4 v5, 0x4

    new-array v6, v5, [I

    .line 13
    aget-object v7, p1, v0

    aget-object v8, p1, v1

    .line 14
    invoke-virtual {p0, v7, v8, v4}, Le/f/e/n/d/b;->a(Le/f/e/l;Le/f/e/l;I)I

    move-result v7

    aput v7, v6, v0

    aget-object v7, p1, v1

    aget-object v8, p1, v2

    .line 15
    invoke-virtual {p0, v7, v8, v4}, Le/f/e/n/d/b;->a(Le/f/e/l;Le/f/e/l;I)I

    move-result v7

    aput v7, v6, v1

    aget-object v7, p1, v2

    aget-object v8, p1, v3

    .line 16
    invoke-virtual {p0, v7, v8, v4}, Le/f/e/n/d/b;->a(Le/f/e/l;Le/f/e/l;I)I

    move-result v7

    aput v7, v6, v2

    aget-object v2, p1, v3

    aget-object p1, p1, v0

    .line 17
    invoke-virtual {p0, v2, p1, v4}, Le/f/e/n/d/b;->a(Le/f/e/l;Le/f/e/l;I)I

    move-result p1

    aput p1, v6, v3

    .line 18
    invoke-static {v6, v4}, Le/f/e/n/d/b;->a([II)I

    move-result p1

    iput p1, p0, Le/f/e/n/d/b;->f:I

    const-wide/16 v2, 0x0

    :goto_0
    if-ge v0, v5, :cond_1

    .line 19
    iget p1, p0, Le/f/e/n/d/b;->f:I

    add-int/2addr p1, v0

    rem-int/2addr p1, v5

    aget p1, v6, p1

    .line 20
    iget-boolean v4, p0, Le/f/e/n/d/b;->b:Z

    if-eqz v4, :cond_0

    const/4 v4, 0x7

    shl-long/2addr v2, v4

    shr-int/lit8 p1, p1, 0x1

    and-int/lit8 p1, p1, 0x7f

    int-to-long v7, p1

    goto :goto_1

    :cond_0
    const/16 v4, 0xa

    shl-long/2addr v2, v4

    shr-int/lit8 v4, p1, 0x2

    and-int/lit16 v4, v4, 0x3e0

    shr-int/lit8 p1, p1, 0x1

    and-int/lit8 p1, p1, 0x1f

    add-int/2addr v4, p1

    int-to-long v7, v4

    :goto_1
    add-long/2addr v2, v7

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 21
    :cond_1
    iget-boolean p1, p0, Le/f/e/n/d/b;->b:Z

    invoke-static {v2, v3, p1}, Le/f/e/n/d/b;->a(JZ)I

    move-result p1

    .line 22
    iget-boolean v0, p0, Le/f/e/n/d/b;->b:Z

    if-eqz v0, :cond_2

    shr-int/lit8 v0, p1, 0x6

    add-int/2addr v0, v1

    .line 23
    iput v0, p0, Le/f/e/n/d/b;->c:I

    and-int/lit8 p1, p1, 0x3f

    add-int/2addr p1, v1

    .line 24
    iput p1, p0, Le/f/e/n/d/b;->d:I

    return-void

    :cond_2
    shr-int/lit8 v0, p1, 0xb

    add-int/2addr v0, v1

    .line 25
    iput v0, p0, Le/f/e/n/d/b;->c:I

    and-int/lit16 p1, p1, 0x7ff

    add-int/2addr p1, v1

    .line 26
    iput p1, p0, Le/f/e/n/d/b;->d:I

    return-void

    .line 27
    :cond_3
    invoke-static {}, Lcom/google/zxing/NotFoundException;->a()Lcom/google/zxing/NotFoundException;

    move-result-object p1

    throw p1
.end method

.method public final a(II)Z
    .locals 1

    if-ltz p1, :cond_0

    .line 102
    iget-object v0, p0, Le/f/e/n/d/b;->a:Le/f/e/o/b;

    invoke-virtual {v0}, Le/f/e/o/b;->f()I

    move-result v0

    if-ge p1, v0, :cond_0

    if-lez p2, :cond_0

    iget-object p1, p0, Le/f/e/n/d/b;->a:Le/f/e/o/b;

    invoke-virtual {p1}, Le/f/e/o/b;->d()I

    move-result p1

    if-ge p2, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final a(Le/f/e/l;)Z
    .locals 1

    .line 103
    invoke-virtual {p1}, Le/f/e/l;->a()F

    move-result v0

    invoke-static {v0}, Le/f/e/o/m/a;->a(F)I

    move-result v0

    .line 104
    invoke-virtual {p1}, Le/f/e/l;->b()F

    move-result p1

    invoke-static {p1}, Le/f/e/o/m/a;->a(F)I

    move-result p1

    .line 105
    invoke-virtual {p0, v0, p1}, Le/f/e/n/d/b;->a(II)Z

    move-result p1

    return p1
.end method

.method public final a(Le/f/e/n/d/a;Le/f/e/n/d/a;Le/f/e/n/d/a;Le/f/e/n/d/a;)Z
    .locals 2

    .line 68
    new-instance v0, Le/f/e/n/d/a;

    invoke-virtual {p1}, Le/f/e/n/d/a;->a()I

    move-result v1

    add-int/lit8 v1, v1, -0x3

    invoke-virtual {p1}, Le/f/e/n/d/a;->b()I

    move-result p1

    add-int/lit8 p1, p1, 0x3

    invoke-direct {v0, v1, p1}, Le/f/e/n/d/a;-><init>(II)V

    .line 69
    new-instance p1, Le/f/e/n/d/a;

    invoke-virtual {p2}, Le/f/e/n/d/a;->a()I

    move-result v1

    add-int/lit8 v1, v1, -0x3

    invoke-virtual {p2}, Le/f/e/n/d/a;->b()I

    move-result p2

    add-int/lit8 p2, p2, -0x3

    invoke-direct {p1, v1, p2}, Le/f/e/n/d/a;-><init>(II)V

    .line 70
    new-instance p2, Le/f/e/n/d/a;

    invoke-virtual {p3}, Le/f/e/n/d/a;->a()I

    move-result v1

    add-int/lit8 v1, v1, 0x3

    invoke-virtual {p3}, Le/f/e/n/d/a;->b()I

    move-result p3

    add-int/lit8 p3, p3, -0x3

    invoke-direct {p2, v1, p3}, Le/f/e/n/d/a;-><init>(II)V

    .line 71
    new-instance p3, Le/f/e/n/d/a;

    invoke-virtual {p4}, Le/f/e/n/d/a;->a()I

    move-result v1

    add-int/lit8 v1, v1, 0x3

    invoke-virtual {p4}, Le/f/e/n/d/a;->b()I

    move-result p4

    add-int/lit8 p4, p4, 0x3

    invoke-direct {p3, v1, p4}, Le/f/e/n/d/a;-><init>(II)V

    .line 72
    invoke-virtual {p0, p3, v0}, Le/f/e/n/d/b;->a(Le/f/e/n/d/a;Le/f/e/n/d/a;)I

    move-result p4

    const/4 v1, 0x0

    if-nez p4, :cond_0

    return v1

    .line 73
    :cond_0
    invoke-virtual {p0, v0, p1}, Le/f/e/n/d/b;->a(Le/f/e/n/d/a;Le/f/e/n/d/a;)I

    move-result v0

    if-eq v0, p4, :cond_1

    return v1

    .line 74
    :cond_1
    invoke-virtual {p0, p1, p2}, Le/f/e/n/d/b;->a(Le/f/e/n/d/a;Le/f/e/n/d/a;)I

    move-result p1

    if-eq p1, p4, :cond_2

    return v1

    .line 75
    :cond_2
    invoke-virtual {p0, p2, p3}, Le/f/e/n/d/b;->a(Le/f/e/n/d/a;Le/f/e/n/d/a;)I

    move-result p1

    if-ne p1, p4, :cond_3

    const/4 p1, 0x1

    return p1

    :cond_3
    return v1
.end method

.method public final a(Le/f/e/n/d/a;)[Le/f/e/l;
    .locals 17
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/NotFoundException;
        }
    .end annotation

    move-object/from16 v0, p0

    const/4 v1, 0x1

    .line 37
    iput v1, v0, Le/f/e/n/d/b;->e:I

    move-object/from16 v2, p1

    move-object v3, v2

    move-object v4, v3

    move-object v5, v4

    const/4 v6, 0x1

    :goto_0
    iget v7, v0, Le/f/e/n/d/b;->e:I

    const/16 v8, 0x9

    const/4 v9, 0x2

    if-ge v7, v8, :cond_1

    const/4 v7, -0x1

    .line 38
    invoke-virtual {v0, v2, v6, v1, v7}, Le/f/e/n/d/b;->a(Le/f/e/n/d/a;ZII)Le/f/e/n/d/a;

    move-result-object v8

    .line 39
    invoke-virtual {v0, v3, v6, v1, v1}, Le/f/e/n/d/b;->a(Le/f/e/n/d/a;ZII)Le/f/e/n/d/a;

    move-result-object v10

    .line 40
    invoke-virtual {v0, v4, v6, v7, v1}, Le/f/e/n/d/b;->a(Le/f/e/n/d/a;ZII)Le/f/e/n/d/a;

    move-result-object v11

    .line 41
    invoke-virtual {v0, v5, v6, v7, v7}, Le/f/e/n/d/b;->a(Le/f/e/n/d/a;ZII)Le/f/e/n/d/a;

    move-result-object v7

    .line 42
    iget v12, v0, Le/f/e/n/d/b;->e:I

    if-le v12, v9, :cond_0

    .line 43
    invoke-static {v7, v8}, Le/f/e/n/d/b;->b(Le/f/e/n/d/a;Le/f/e/n/d/a;)F

    move-result v12

    iget v13, v0, Le/f/e/n/d/b;->e:I

    int-to-float v13, v13

    mul-float v12, v12, v13

    invoke-static {v5, v2}, Le/f/e/n/d/b;->b(Le/f/e/n/d/a;Le/f/e/n/d/a;)F

    move-result v13

    iget v14, v0, Le/f/e/n/d/b;->e:I

    add-int/2addr v14, v9

    int-to-float v14, v14

    mul-float v13, v13, v14

    div-float/2addr v12, v13

    float-to-double v12, v12

    const-wide/high16 v14, 0x3fe8000000000000L    # 0.75

    cmpg-double v16, v12, v14

    if-ltz v16, :cond_1

    const-wide/high16 v14, 0x3ff4000000000000L    # 1.25

    cmpl-double v16, v12, v14

    if-gtz v16, :cond_1

    .line 44
    invoke-virtual {v0, v8, v10, v11, v7}, Le/f/e/n/d/b;->a(Le/f/e/n/d/a;Le/f/e/n/d/a;Le/f/e/n/d/a;Le/f/e/n/d/a;)Z

    move-result v12

    if-eqz v12, :cond_1

    :cond_0
    xor-int/lit8 v6, v6, 0x1

    .line 45
    iget v2, v0, Le/f/e/n/d/b;->e:I

    add-int/2addr v2, v1

    iput v2, v0, Le/f/e/n/d/b;->e:I

    move-object v5, v7

    move-object v2, v8

    move-object v3, v10

    move-object v4, v11

    goto :goto_0

    .line 46
    :cond_1
    iget v6, v0, Le/f/e/n/d/b;->e:I

    const/4 v7, 0x5

    if-eq v6, v7, :cond_3

    const/4 v8, 0x7

    if-ne v6, v8, :cond_2

    goto :goto_1

    .line 47
    :cond_2
    invoke-static {}, Lcom/google/zxing/NotFoundException;->a()Lcom/google/zxing/NotFoundException;

    move-result-object v1

    throw v1

    .line 48
    :cond_3
    :goto_1
    iget v6, v0, Le/f/e/n/d/b;->e:I

    const/4 v8, 0x0

    if-ne v6, v7, :cond_4

    const/4 v6, 0x1

    goto :goto_2

    :cond_4
    const/4 v6, 0x0

    :goto_2
    iput-boolean v6, v0, Le/f/e/n/d/b;->b:Z

    .line 49
    new-instance v6, Le/f/e/l;

    invoke-virtual {v2}, Le/f/e/n/d/a;->a()I

    move-result v7

    int-to-float v7, v7

    const/high16 v10, 0x3f000000    # 0.5f

    add-float/2addr v7, v10

    invoke-virtual {v2}, Le/f/e/n/d/a;->b()I

    move-result v2

    int-to-float v2, v2

    sub-float/2addr v2, v10

    invoke-direct {v6, v7, v2}, Le/f/e/l;-><init>(FF)V

    .line 50
    new-instance v2, Le/f/e/l;

    invoke-virtual {v3}, Le/f/e/n/d/a;->a()I

    move-result v7

    int-to-float v7, v7

    add-float/2addr v7, v10

    invoke-virtual {v3}, Le/f/e/n/d/a;->b()I

    move-result v3

    int-to-float v3, v3

    add-float/2addr v3, v10

    invoke-direct {v2, v7, v3}, Le/f/e/l;-><init>(FF)V

    .line 51
    new-instance v3, Le/f/e/l;

    invoke-virtual {v4}, Le/f/e/n/d/a;->a()I

    move-result v7

    int-to-float v7, v7

    sub-float/2addr v7, v10

    invoke-virtual {v4}, Le/f/e/n/d/a;->b()I

    move-result v4

    int-to-float v4, v4

    add-float/2addr v4, v10

    invoke-direct {v3, v7, v4}, Le/f/e/l;-><init>(FF)V

    .line 52
    new-instance v4, Le/f/e/l;

    invoke-virtual {v5}, Le/f/e/n/d/a;->a()I

    move-result v7

    int-to-float v7, v7

    sub-float/2addr v7, v10

    invoke-virtual {v5}, Le/f/e/n/d/a;->b()I

    move-result v5

    int-to-float v5, v5

    sub-float/2addr v5, v10

    invoke-direct {v4, v7, v5}, Le/f/e/l;-><init>(FF)V

    const/4 v5, 0x4

    new-array v5, v5, [Le/f/e/l;

    aput-object v6, v5, v8

    aput-object v2, v5, v1

    aput-object v3, v5, v9

    const/4 v1, 0x3

    aput-object v4, v5, v1

    .line 53
    iget v2, v0, Le/f/e/n/d/b;->e:I

    mul-int/lit8 v3, v2, 0x2

    sub-int/2addr v3, v1

    int-to-float v1, v3

    mul-int/lit8 v2, v2, 0x2

    int-to-float v2, v2

    invoke-static {v5, v1, v2}, Le/f/e/n/d/b;->a([Le/f/e/l;FF)[Le/f/e/l;

    move-result-object v1

    return-object v1
.end method

.method public final b()Le/f/e/n/d/a;
    .locals 12

    const/4 v0, 0x3

    const/4 v1, 0x2

    const/4 v2, -0x1

    const/4 v3, 0x1

    const/4 v4, 0x0

    .line 1
    :try_start_0
    new-instance v5, Le/f/e/o/m/b;

    iget-object v6, p0, Le/f/e/n/d/b;->a:Le/f/e/o/b;

    invoke-direct {v5, v6}, Le/f/e/o/m/b;-><init>(Le/f/e/o/b;)V

    invoke-virtual {v5}, Le/f/e/o/m/b;->a()[Le/f/e/l;

    move-result-object v5

    .line 2
    aget-object v6, v5, v4

    .line 3
    aget-object v7, v5, v3

    .line 4
    aget-object v8, v5, v1

    .line 5
    aget-object v5, v5, v0
    :try_end_0
    .catch Lcom/google/zxing/NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 6
    :catch_0
    iget-object v5, p0, Le/f/e/n/d/b;->a:Le/f/e/o/b;

    invoke-virtual {v5}, Le/f/e/o/b;->f()I

    move-result v5

    div-int/2addr v5, v1

    .line 7
    iget-object v6, p0, Le/f/e/n/d/b;->a:Le/f/e/o/b;

    invoke-virtual {v6}, Le/f/e/o/b;->d()I

    move-result v6

    div-int/2addr v6, v1

    .line 8
    new-instance v7, Le/f/e/n/d/a;

    add-int/lit8 v8, v5, 0x7

    add-int/lit8 v9, v6, -0x7

    invoke-direct {v7, v8, v9}, Le/f/e/n/d/a;-><init>(II)V

    invoke-virtual {p0, v7, v4, v3, v2}, Le/f/e/n/d/b;->a(Le/f/e/n/d/a;ZII)Le/f/e/n/d/a;

    move-result-object v7

    invoke-virtual {v7}, Le/f/e/n/d/a;->c()Le/f/e/l;

    move-result-object v7

    .line 9
    new-instance v10, Le/f/e/n/d/a;

    add-int/lit8 v6, v6, 0x7

    invoke-direct {v10, v8, v6}, Le/f/e/n/d/a;-><init>(II)V

    invoke-virtual {p0, v10, v4, v3, v3}, Le/f/e/n/d/b;->a(Le/f/e/n/d/a;ZII)Le/f/e/n/d/a;

    move-result-object v8

    invoke-virtual {v8}, Le/f/e/n/d/a;->c()Le/f/e/l;

    move-result-object v8

    .line 10
    new-instance v10, Le/f/e/n/d/a;

    add-int/lit8 v5, v5, -0x7

    invoke-direct {v10, v5, v6}, Le/f/e/n/d/a;-><init>(II)V

    invoke-virtual {p0, v10, v4, v2, v3}, Le/f/e/n/d/b;->a(Le/f/e/n/d/a;ZII)Le/f/e/n/d/a;

    move-result-object v6

    invoke-virtual {v6}, Le/f/e/n/d/a;->c()Le/f/e/l;

    move-result-object v6

    .line 11
    new-instance v10, Le/f/e/n/d/a;

    invoke-direct {v10, v5, v9}, Le/f/e/n/d/a;-><init>(II)V

    invoke-virtual {p0, v10, v4, v2, v2}, Le/f/e/n/d/b;->a(Le/f/e/n/d/a;ZII)Le/f/e/n/d/a;

    move-result-object v5

    invoke-virtual {v5}, Le/f/e/n/d/a;->c()Le/f/e/l;

    move-result-object v5

    move-object v11, v8

    move-object v8, v6

    move-object v6, v7

    move-object v7, v11

    .line 12
    :goto_0
    invoke-virtual {v6}, Le/f/e/l;->a()F

    move-result v9

    invoke-virtual {v5}, Le/f/e/l;->a()F

    move-result v10

    add-float/2addr v9, v10

    invoke-virtual {v7}, Le/f/e/l;->a()F

    move-result v10

    add-float/2addr v9, v10

    invoke-virtual {v8}, Le/f/e/l;->a()F

    move-result v10

    add-float/2addr v9, v10

    const/high16 v10, 0x40800000    # 4.0f

    div-float/2addr v9, v10

    invoke-static {v9}, Le/f/e/o/m/a;->a(F)I

    move-result v9

    .line 13
    invoke-virtual {v6}, Le/f/e/l;->b()F

    move-result v6

    invoke-virtual {v5}, Le/f/e/l;->b()F

    move-result v5

    add-float/2addr v6, v5

    invoke-virtual {v7}, Le/f/e/l;->b()F

    move-result v5

    add-float/2addr v6, v5

    invoke-virtual {v8}, Le/f/e/l;->b()F

    move-result v5

    add-float/2addr v6, v5

    div-float/2addr v6, v10

    invoke-static {v6}, Le/f/e/o/m/a;->a(F)I

    move-result v5

    .line 14
    :try_start_1
    new-instance v6, Le/f/e/o/m/b;

    iget-object v7, p0, Le/f/e/n/d/b;->a:Le/f/e/o/b;

    const/16 v8, 0xf

    invoke-direct {v6, v7, v8, v9, v5}, Le/f/e/o/m/b;-><init>(Le/f/e/o/b;III)V

    invoke-virtual {v6}, Le/f/e/o/m/b;->a()[Le/f/e/l;

    move-result-object v6

    .line 15
    aget-object v7, v6, v4

    .line 16
    aget-object v8, v6, v3

    .line 17
    aget-object v1, v6, v1

    .line 18
    aget-object v0, v6, v0
    :try_end_1
    .catch Lcom/google/zxing/NotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    .line 19
    :catch_1
    new-instance v0, Le/f/e/n/d/a;

    add-int/lit8 v1, v9, 0x7

    add-int/lit8 v6, v5, -0x7

    invoke-direct {v0, v1, v6}, Le/f/e/n/d/a;-><init>(II)V

    invoke-virtual {p0, v0, v4, v3, v2}, Le/f/e/n/d/b;->a(Le/f/e/n/d/a;ZII)Le/f/e/n/d/a;

    move-result-object v0

    invoke-virtual {v0}, Le/f/e/n/d/a;->c()Le/f/e/l;

    move-result-object v7

    .line 20
    new-instance v0, Le/f/e/n/d/a;

    add-int/lit8 v5, v5, 0x7

    invoke-direct {v0, v1, v5}, Le/f/e/n/d/a;-><init>(II)V

    invoke-virtual {p0, v0, v4, v3, v3}, Le/f/e/n/d/b;->a(Le/f/e/n/d/a;ZII)Le/f/e/n/d/a;

    move-result-object v0

    invoke-virtual {v0}, Le/f/e/n/d/a;->c()Le/f/e/l;

    move-result-object v8

    .line 21
    new-instance v0, Le/f/e/n/d/a;

    add-int/lit8 v9, v9, -0x7

    invoke-direct {v0, v9, v5}, Le/f/e/n/d/a;-><init>(II)V

    invoke-virtual {p0, v0, v4, v2, v3}, Le/f/e/n/d/b;->a(Le/f/e/n/d/a;ZII)Le/f/e/n/d/a;

    move-result-object v0

    invoke-virtual {v0}, Le/f/e/n/d/a;->c()Le/f/e/l;

    move-result-object v1

    .line 22
    new-instance v0, Le/f/e/n/d/a;

    invoke-direct {v0, v9, v6}, Le/f/e/n/d/a;-><init>(II)V

    invoke-virtual {p0, v0, v4, v2, v2}, Le/f/e/n/d/b;->a(Le/f/e/n/d/a;ZII)Le/f/e/n/d/a;

    move-result-object v0

    invoke-virtual {v0}, Le/f/e/n/d/a;->c()Le/f/e/l;

    move-result-object v0

    .line 23
    :goto_1
    invoke-virtual {v7}, Le/f/e/l;->a()F

    move-result v2

    invoke-virtual {v0}, Le/f/e/l;->a()F

    move-result v3

    add-float/2addr v2, v3

    invoke-virtual {v8}, Le/f/e/l;->a()F

    move-result v3

    add-float/2addr v2, v3

    invoke-virtual {v1}, Le/f/e/l;->a()F

    move-result v3

    add-float/2addr v2, v3

    div-float/2addr v2, v10

    invoke-static {v2}, Le/f/e/o/m/a;->a(F)I

    move-result v2

    .line 24
    invoke-virtual {v7}, Le/f/e/l;->b()F

    move-result v3

    invoke-virtual {v0}, Le/f/e/l;->b()F

    move-result v0

    add-float/2addr v3, v0

    invoke-virtual {v8}, Le/f/e/l;->b()F

    move-result v0

    add-float/2addr v3, v0

    invoke-virtual {v1}, Le/f/e/l;->b()F

    move-result v0

    add-float/2addr v3, v0

    div-float/2addr v3, v10

    invoke-static {v3}, Le/f/e/o/m/a;->a(F)I

    move-result v0

    .line 25
    new-instance v1, Le/f/e/n/d/a;

    invoke-direct {v1, v2, v0}, Le/f/e/n/d/a;-><init>(II)V

    return-object v1
.end method

.method public final b([Le/f/e/l;)[Le/f/e/l;
    .locals 2

    .line 26
    iget v0, p0, Le/f/e/n/d/b;->e:I

    mul-int/lit8 v0, v0, 0x2

    int-to-float v0, v0

    invoke-virtual {p0}, Le/f/e/n/d/b;->a()I

    move-result v1

    int-to-float v1, v1

    invoke-static {p1, v0, v1}, Le/f/e/n/d/b;->a([Le/f/e/l;FF)[Le/f/e/l;

    move-result-object p1

    return-object p1
.end method
