.class public final Le/f/e/r/a;
.super Le/f/e/r/k;
.source "SourceFile"


# static fields
.field public static final d:[C

.field public static final e:[I

.field public static final f:[C


# instance fields
.field public final a:Ljava/lang/StringBuilder;

.field public b:[I

.field public c:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "0123456789-$:/.+ABCD"

    .line 1
    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    sput-object v0, Le/f/e/r/a;->d:[C

    const/16 v0, 0x14

    new-array v0, v0, [I

    .line 2
    fill-array-data v0, :array_0

    sput-object v0, Le/f/e/r/a;->e:[I

    const/4 v0, 0x4

    new-array v0, v0, [C

    .line 3
    fill-array-data v0, :array_1

    sput-object v0, Le/f/e/r/a;->f:[C

    return-void

    :array_0
    .array-data 4
        0x3
        0x6
        0x9
        0x60
        0x12
        0x42
        0x21
        0x24
        0x30
        0x48
        0xc
        0x18
        0x45
        0x51
        0x54
        0x15
        0x1a
        0x29
        0xb
        0xe
    .end array-data

    :array_1
    .array-data 2
        0x41s
        0x42s
        0x43s
        0x44s
    .end array-data
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Le/f/e/r/k;-><init>()V

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    iput-object v0, p0, Le/f/e/r/a;->a:Ljava/lang/StringBuilder;

    const/16 v0, 0x50

    new-array v0, v0, [I

    .line 3
    iput-object v0, p0, Le/f/e/r/a;->b:[I

    const/4 v0, 0x0

    .line 4
    iput v0, p0, Le/f/e/r/a;->c:I

    return-void
.end method

.method public static a([CC)Z
    .locals 4

    const/4 v0, 0x0

    if-eqz p0, :cond_1

    .line 46
    array-length v1, p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-char v3, p0, v2

    if-ne v3, p1, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return v0
.end method


# virtual methods
.method public a(ILe/f/e/o/a;Ljava/util/Map;)Le/f/e/j;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Le/f/e/o/a;",
            "Ljava/util/Map<",
            "Le/f/e/d;",
            "*>;)",
            "Le/f/e/j;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/NotFoundException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/f/e/r/a;->b:[I

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([II)V

    .line 2
    invoke-virtual {p0, p2}, Le/f/e/r/a;->a(Le/f/e/o/a;)V

    .line 3
    invoke-virtual {p0}, Le/f/e/r/a;->b()I

    move-result p2

    .line 4
    iget-object v0, p0, Le/f/e/r/a;->a:Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->setLength(I)V

    move v0, p2

    .line 5
    :cond_0
    invoke-virtual {p0, v0}, Le/f/e/r/a;->b(I)I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_e

    .line 6
    iget-object v4, p0, Le/f/e/r/a;->a:Ljava/lang/StringBuilder;

    int-to-char v5, v2

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v0, v0, 0x8

    .line 7
    iget-object v4, p0, Le/f/e/r/a;->a:Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->length()I

    move-result v4

    const/4 v5, 0x1

    if-le v4, v5, :cond_1

    sget-object v4, Le/f/e/r/a;->f:[C

    sget-object v6, Le/f/e/r/a;->d:[C

    aget-char v2, v6, v2

    .line 8
    invoke-static {v4, v2}, Le/f/e/r/a;->a([CC)Z

    move-result v2

    if-nez v2, :cond_2

    .line 9
    :cond_1
    iget v2, p0, Le/f/e/r/a;->c:I

    if-lt v0, v2, :cond_0

    .line 10
    :cond_2
    iget-object v2, p0, Le/f/e/r/a;->b:[I

    add-int/lit8 v4, v0, -0x1

    aget v2, v2, v4

    const/4 v6, -0x8

    const/4 v7, 0x0

    :goto_0
    if-ge v6, v3, :cond_3

    .line 11
    iget-object v8, p0, Le/f/e/r/a;->b:[I

    add-int v9, v0, v6

    aget v8, v8, v9

    add-int/2addr v7, v8

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 12
    :cond_3
    iget v3, p0, Le/f/e/r/a;->c:I

    const/4 v6, 0x2

    if-ge v0, v3, :cond_5

    div-int/2addr v7, v6

    if-lt v2, v7, :cond_4

    goto :goto_1

    .line 13
    :cond_4
    invoke-static {}, Lcom/google/zxing/NotFoundException;->a()Lcom/google/zxing/NotFoundException;

    move-result-object p1

    throw p1

    .line 14
    :cond_5
    :goto_1
    invoke-virtual {p0, p2}, Le/f/e/r/a;->c(I)V

    const/4 v0, 0x0

    .line 15
    :goto_2
    iget-object v2, p0, Le/f/e/r/a;->a:Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I

    move-result v2

    if-ge v0, v2, :cond_6

    .line 16
    iget-object v2, p0, Le/f/e/r/a;->a:Ljava/lang/StringBuilder;

    sget-object v3, Le/f/e/r/a;->d:[C

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->charAt(I)C

    move-result v7

    aget-char v3, v3, v7

    invoke-virtual {v2, v0, v3}, Ljava/lang/StringBuilder;->setCharAt(IC)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 17
    :cond_6
    iget-object v0, p0, Le/f/e/r/a;->a:Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->charAt(I)C

    move-result v0

    .line 18
    sget-object v2, Le/f/e/r/a;->f:[C

    invoke-static {v2, v0}, Le/f/e/r/a;->a([CC)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 19
    iget-object v0, p0, Le/f/e/r/a;->a:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v2

    sub-int/2addr v2, v5

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->charAt(I)C

    move-result v0

    .line 20
    sget-object v2, Le/f/e/r/a;->f:[C

    invoke-static {v2, v0}, Le/f/e/r/a;->a([CC)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 21
    iget-object v0, p0, Le/f/e/r/a;->a:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    const/4 v2, 0x3

    if-le v0, v2, :cond_b

    if-eqz p3, :cond_7

    .line 22
    sget-object v0, Le/f/e/d;->j:Le/f/e/d;

    invoke-interface {p3, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_8

    .line 23
    :cond_7
    iget-object p3, p0, Le/f/e/r/a;->a:Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    sub-int/2addr v0, v5

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->deleteCharAt(I)Ljava/lang/StringBuilder;

    .line 24
    iget-object p3, p0, Le/f/e/r/a;->a:Ljava/lang/StringBuilder;

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->deleteCharAt(I)Ljava/lang/StringBuilder;

    :cond_8
    const/4 p3, 0x0

    const/4 v0, 0x0

    :goto_3
    if-ge p3, p2, :cond_9

    .line 25
    iget-object v2, p0, Le/f/e/r/a;->b:[I

    aget v2, v2, p3

    add-int/2addr v0, v2

    add-int/lit8 p3, p3, 0x1

    goto :goto_3

    :cond_9
    int-to-float p3, v0

    :goto_4
    if-ge p2, v4, :cond_a

    .line 26
    iget-object v2, p0, Le/f/e/r/a;->b:[I

    aget v2, v2, p2

    add-int/2addr v0, v2

    add-int/lit8 p2, p2, 0x1

    goto :goto_4

    :cond_a
    int-to-float p2, v0

    .line 27
    new-instance v0, Le/f/e/j;

    iget-object v2, p0, Le/f/e/r/a;->a:Ljava/lang/StringBuilder;

    .line 28
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    new-array v4, v6, [Le/f/e/l;

    new-instance v6, Le/f/e/l;

    int-to-float p1, p1

    invoke-direct {v6, p3, p1}, Le/f/e/l;-><init>(FF)V

    aput-object v6, v4, v1

    new-instance p3, Le/f/e/l;

    invoke-direct {p3, p2, p1}, Le/f/e/l;-><init>(FF)V

    aput-object p3, v4, v5

    sget-object p1, Le/f/e/a;->c:Le/f/e/a;

    invoke-direct {v0, v2, v3, v4, p1}, Le/f/e/j;-><init>(Ljava/lang/String;[B[Le/f/e/l;Le/f/e/a;)V

    return-object v0

    .line 29
    :cond_b
    invoke-static {}, Lcom/google/zxing/NotFoundException;->a()Lcom/google/zxing/NotFoundException;

    move-result-object p1

    throw p1

    .line 30
    :cond_c
    invoke-static {}, Lcom/google/zxing/NotFoundException;->a()Lcom/google/zxing/NotFoundException;

    move-result-object p1

    throw p1

    .line 31
    :cond_d
    invoke-static {}, Lcom/google/zxing/NotFoundException;->a()Lcom/google/zxing/NotFoundException;

    move-result-object p1

    throw p1

    .line 32
    :cond_e
    invoke-static {}, Lcom/google/zxing/NotFoundException;->a()Lcom/google/zxing/NotFoundException;

    move-result-object p1

    throw p1
.end method

.method public final a(I)V
    .locals 3

    .line 40
    iget-object v0, p0, Le/f/e/r/a;->b:[I

    iget v1, p0, Le/f/e/r/a;->c:I

    aput p1, v0, v1

    add-int/lit8 v1, v1, 0x1

    .line 41
    iput v1, p0, Le/f/e/r/a;->c:I

    .line 42
    array-length p1, v0

    if-lt v1, p1, :cond_0

    shl-int/lit8 p1, v1, 0x1

    .line 43
    new-array p1, p1, [I

    const/4 v2, 0x0

    .line 44
    invoke-static {v0, v2, p1, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 45
    iput-object p1, p0, Le/f/e/r/a;->b:[I

    :cond_0
    return-void
.end method

.method public final a(Le/f/e/o/a;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/NotFoundException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 33
    iput v0, p0, Le/f/e/r/a;->c:I

    .line 34
    invoke-virtual {p1, v0}, Le/f/e/o/a;->c(I)I

    move-result v1

    .line 35
    invoke-virtual {p1}, Le/f/e/o/a;->d()I

    move-result v2

    if-ge v1, v2, :cond_2

    const/4 v3, 0x1

    const/4 v4, 0x1

    :goto_0
    if-ge v1, v2, :cond_1

    .line 36
    invoke-virtual {p1, v1}, Le/f/e/o/a;->a(I)Z

    move-result v5

    xor-int/2addr v5, v4

    if-eqz v5, :cond_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 37
    :cond_0
    invoke-virtual {p0, v0}, Le/f/e/r/a;->a(I)V

    xor-int/lit8 v4, v4, 0x1

    const/4 v0, 0x1

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 38
    :cond_1
    invoke-virtual {p0, v0}, Le/f/e/r/a;->a(I)V

    return-void

    .line 39
    :cond_2
    invoke-static {}, Lcom/google/zxing/NotFoundException;->a()Lcom/google/zxing/NotFoundException;

    move-result-object p1

    throw p1
.end method

.method public final b()I
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/NotFoundException;
        }
    .end annotation

    const/4 v0, 0x1

    const/4 v1, 0x1

    .line 1
    :goto_0
    iget v2, p0, Le/f/e/r/a;->c:I

    if-ge v1, v2, :cond_3

    .line 2
    invoke-virtual {p0, v1}, Le/f/e/r/a;->b(I)I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_2

    .line 3
    sget-object v3, Le/f/e/r/a;->f:[C

    sget-object v4, Le/f/e/r/a;->d:[C

    aget-char v2, v4, v2

    invoke-static {v3, v2}, Le/f/e/r/a;->a([CC)Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, 0x0

    move v3, v1

    :goto_1
    add-int/lit8 v4, v1, 0x7

    if-ge v3, v4, :cond_0

    .line 4
    iget-object v4, p0, Le/f/e/r/a;->b:[I

    aget v4, v4, v3

    add-int/2addr v2, v4

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_0
    if-eq v1, v0, :cond_1

    .line 5
    iget-object v3, p0, Le/f/e/r/a;->b:[I

    add-int/lit8 v4, v1, -0x1

    aget v3, v3, v4

    div-int/lit8 v2, v2, 0x2

    if-lt v3, v2, :cond_2

    :cond_1
    return v1

    :cond_2
    add-int/lit8 v1, v1, 0x2

    goto :goto_0

    .line 6
    :cond_3
    invoke-static {}, Lcom/google/zxing/NotFoundException;->a()Lcom/google/zxing/NotFoundException;

    move-result-object v0

    throw v0
.end method

.method public final b(I)I
    .locals 10

    add-int/lit8 v0, p1, 0x7

    .line 7
    iget v1, p0, Le/f/e/r/a;->c:I

    const/4 v2, -0x1

    if-lt v0, v1, :cond_0

    return v2

    .line 8
    :cond_0
    iget-object v1, p0, Le/f/e/r/a;->b:[I

    const v3, 0x7fffffff

    const/4 v4, 0x0

    move v5, p1

    const v6, 0x7fffffff

    const/4 v7, 0x0

    :goto_0
    if-ge v5, v0, :cond_3

    .line 9
    aget v8, v1, v5

    if-ge v8, v6, :cond_1

    move v6, v8

    :cond_1
    if-le v8, v7, :cond_2

    move v7, v8

    :cond_2
    add-int/lit8 v5, v5, 0x2

    goto :goto_0

    :cond_3
    add-int/2addr v6, v7

    .line 10
    div-int/lit8 v6, v6, 0x2

    add-int/lit8 v5, p1, 0x1

    const/4 v7, 0x0

    :goto_1
    if-ge v5, v0, :cond_6

    .line 11
    aget v8, v1, v5

    if-ge v8, v3, :cond_4

    move v3, v8

    :cond_4
    if-le v8, v7, :cond_5

    move v7, v8

    :cond_5
    add-int/lit8 v5, v5, 0x2

    goto :goto_1

    :cond_6
    add-int/2addr v3, v7

    .line 12
    div-int/lit8 v3, v3, 0x2

    const/16 v0, 0x80

    const/4 v5, 0x0

    const/4 v7, 0x0

    :goto_2
    const/4 v8, 0x7

    if-ge v5, v8, :cond_9

    and-int/lit8 v8, v5, 0x1

    if-nez v8, :cond_7

    move v8, v6

    goto :goto_3

    :cond_7
    move v8, v3

    :goto_3
    shr-int/lit8 v0, v0, 0x1

    add-int v9, p1, v5

    .line 13
    aget v9, v1, v9

    if-le v9, v8, :cond_8

    or-int/2addr v7, v0

    :cond_8
    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    .line 14
    :cond_9
    :goto_4
    sget-object p1, Le/f/e/r/a;->e:[I

    array-length v0, p1

    if-ge v4, v0, :cond_b

    .line 15
    aget p1, p1, v4

    if-ne p1, v7, :cond_a

    return v4

    :cond_a
    add-int/lit8 v4, v4, 0x1

    goto :goto_4

    :cond_b
    return v2
.end method

.method public final c(I)V
    .locals 14
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/NotFoundException;
        }
    .end annotation

    const/4 v0, 0x4

    new-array v1, v0, [I

    .line 1
    fill-array-data v1, :array_0

    new-array v2, v0, [I

    .line 2
    fill-array-data v2, :array_1

    .line 3
    iget-object v3, p0, Le/f/e/r/a;->a:Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->length()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    const/4 v4, 0x0

    move v6, p1

    const/4 v5, 0x0

    .line 4
    :goto_0
    sget-object v7, Le/f/e/r/a;->e:[I

    iget-object v8, p0, Le/f/e/r/a;->a:Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->charAt(I)C

    move-result v8

    aget v7, v7, v8

    const/4 v8, 0x6

    const/4 v9, 0x6

    :goto_1
    if-ltz v9, :cond_0

    and-int/lit8 v10, v9, 0x1

    and-int/lit8 v11, v7, 0x1

    shl-int/lit8 v11, v11, 0x1

    add-int/2addr v10, v11

    .line 5
    aget v11, v1, v10

    iget-object v12, p0, Le/f/e/r/a;->b:[I

    add-int v13, v6, v9

    aget v12, v12, v13

    add-int/2addr v11, v12

    aput v11, v1, v10

    .line 6
    aget v11, v2, v10

    add-int/lit8 v11, v11, 0x1

    aput v11, v2, v10

    shr-int/lit8 v7, v7, 0x1

    add-int/lit8 v9, v9, -0x1

    goto :goto_1

    :cond_0
    if-ge v5, v3, :cond_1

    add-int/lit8 v6, v6, 0x8

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    new-array v5, v0, [F

    new-array v0, v0, [F

    const/4 v6, 0x0

    :goto_2
    const/4 v7, 0x2

    if-ge v6, v7, :cond_2

    const/4 v7, 0x0

    .line 7
    aput v7, v0, v6

    add-int/lit8 v7, v6, 0x2

    .line 8
    aget v9, v1, v6

    int-to-float v9, v9

    aget v10, v2, v6

    int-to-float v10, v10

    div-float/2addr v9, v10

    aget v10, v1, v7

    int-to-float v10, v10

    aget v11, v2, v7

    int-to-float v11, v11

    div-float/2addr v10, v11

    add-float/2addr v9, v10

    const/high16 v10, 0x40000000    # 2.0f

    div-float/2addr v9, v10

    aput v9, v0, v7

    .line 9
    aget v9, v0, v7

    aput v9, v5, v6

    .line 10
    aget v9, v1, v7

    int-to-float v9, v9

    mul-float v9, v9, v10

    const/high16 v10, 0x3fc00000    # 1.5f

    add-float/2addr v9, v10

    aget v10, v2, v7

    int-to-float v10, v10

    div-float/2addr v9, v10

    aput v9, v5, v7

    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    .line 11
    :cond_2
    :goto_3
    sget-object v1, Le/f/e/r/a;->e:[I

    iget-object v2, p0, Le/f/e/r/a;->a:Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->charAt(I)C

    move-result v2

    aget v1, v1, v2

    const/4 v2, 0x6

    :goto_4
    if-ltz v2, :cond_4

    and-int/lit8 v6, v2, 0x1

    and-int/lit8 v7, v1, 0x1

    shl-int/lit8 v7, v7, 0x1

    add-int/2addr v6, v7

    .line 12
    iget-object v7, p0, Le/f/e/r/a;->b:[I

    add-int v9, p1, v2

    aget v7, v7, v9

    int-to-float v7, v7

    .line 13
    aget v9, v0, v6

    cmpg-float v9, v7, v9

    if-ltz v9, :cond_3

    aget v6, v5, v6

    cmpl-float v6, v7, v6

    if-gtz v6, :cond_3

    shr-int/lit8 v1, v1, 0x1

    add-int/lit8 v2, v2, -0x1

    goto :goto_4

    .line 14
    :cond_3
    invoke-static {}, Lcom/google/zxing/NotFoundException;->a()Lcom/google/zxing/NotFoundException;

    move-result-object p1

    throw p1

    :cond_4
    if-ge v4, v3, :cond_5

    add-int/lit8 p1, p1, 0x8

    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    :cond_5
    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x0
        0x0
        0x0
    .end array-data

    :array_1
    .array-data 4
        0x0
        0x0
        0x0
        0x0
    .end array-data
.end method