.class public final Le/f/e/r/h;
.super Le/f/e/r/k;
.source "SourceFile"


# static fields
.field public static final b:[I

.field public static final c:[I

.field public static final d:[I

.field public static final e:[[I


# instance fields
.field public a:I


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    const/4 v0, 0x5

    new-array v1, v0, [I

    .line 1
    fill-array-data v1, :array_0

    sput-object v1, Le/f/e/r/h;->b:[I

    const/4 v1, 0x4

    new-array v2, v1, [I

    .line 2
    fill-array-data v2, :array_1

    sput-object v2, Le/f/e/r/h;->c:[I

    const/4 v2, 0x3

    new-array v3, v2, [I

    .line 3
    fill-array-data v3, :array_2

    sput-object v3, Le/f/e/r/h;->d:[I

    const/16 v3, 0xa

    new-array v3, v3, [[I

    new-array v4, v0, [I

    .line 4
    fill-array-data v4, :array_3

    const/4 v5, 0x0

    aput-object v4, v3, v5

    new-array v4, v0, [I

    fill-array-data v4, :array_4

    const/4 v5, 0x1

    aput-object v4, v3, v5

    new-array v4, v0, [I

    fill-array-data v4, :array_5

    const/4 v5, 0x2

    aput-object v4, v3, v5

    new-array v4, v0, [I

    fill-array-data v4, :array_6

    aput-object v4, v3, v2

    new-array v2, v0, [I

    fill-array-data v2, :array_7

    aput-object v2, v3, v1

    new-array v1, v0, [I

    fill-array-data v1, :array_8

    aput-object v1, v3, v0

    new-array v1, v0, [I

    fill-array-data v1, :array_9

    const/4 v2, 0x6

    aput-object v1, v3, v2

    new-array v1, v0, [I

    fill-array-data v1, :array_a

    const/4 v2, 0x7

    aput-object v1, v3, v2

    new-array v1, v0, [I

    fill-array-data v1, :array_b

    const/16 v2, 0x8

    aput-object v1, v3, v2

    new-array v0, v0, [I

    fill-array-data v0, :array_c

    const/16 v1, 0x9

    aput-object v0, v3, v1

    sput-object v3, Le/f/e/r/h;->e:[[I

    return-void

    :array_0
    .array-data 4
        0x6
        0x8
        0xa
        0xc
        0xe
    .end array-data

    :array_1
    .array-data 4
        0x1
        0x1
        0x1
        0x1
    .end array-data

    :array_2
    .array-data 4
        0x1
        0x1
        0x3
    .end array-data

    :array_3
    .array-data 4
        0x1
        0x1
        0x3
        0x3
        0x1
    .end array-data

    :array_4
    .array-data 4
        0x3
        0x1
        0x1
        0x1
        0x3
    .end array-data

    :array_5
    .array-data 4
        0x1
        0x3
        0x1
        0x1
        0x3
    .end array-data

    :array_6
    .array-data 4
        0x3
        0x3
        0x1
        0x1
        0x1
    .end array-data

    :array_7
    .array-data 4
        0x1
        0x1
        0x3
        0x1
        0x3
    .end array-data

    :array_8
    .array-data 4
        0x3
        0x1
        0x3
        0x1
        0x1
    .end array-data

    :array_9
    .array-data 4
        0x1
        0x3
        0x3
        0x1
        0x1
    .end array-data

    :array_a
    .array-data 4
        0x1
        0x1
        0x1
        0x3
        0x3
    .end array-data

    :array_b
    .array-data 4
        0x3
        0x1
        0x1
        0x3
        0x1
    .end array-data

    :array_c
    .array-data 4
        0x1
        0x3
        0x1
        0x3
        0x1
    .end array-data
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Le/f/e/r/k;-><init>()V

    const/4 v0, -0x1

    .line 2
    iput v0, p0, Le/f/e/r/h;->a:I

    return-void
.end method

.method public static a([I)I
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/NotFoundException;
        }
    .end annotation

    .line 31
    sget-object v0, Le/f/e/r/h;->e:[[I

    array-length v0, v0

    const v1, 0x3ec28f5c    # 0.38f

    const/4 v2, -0x1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_1

    .line 32
    sget-object v4, Le/f/e/r/h;->e:[[I

    aget-object v4, v4, v3

    const v5, 0x3f47ae14    # 0.78f

    .line 33
    invoke-static {p0, v4, v5}, Le/f/e/r/k;->a([I[IF)F

    move-result v4

    cmpg-float v5, v4, v1

    if-gez v5, :cond_0

    move v2, v3

    move v1, v4

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    if-ltz v2, :cond_2

    return v2

    .line 34
    :cond_2
    invoke-static {}, Lcom/google/zxing/NotFoundException;->a()Lcom/google/zxing/NotFoundException;

    move-result-object p0

    throw p0
.end method

.method public static a(Le/f/e/o/a;IILjava/lang/StringBuilder;)V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/NotFoundException;
        }
    .end annotation

    const/16 v0, 0xa

    new-array v1, v0, [I

    const/4 v2, 0x5

    new-array v3, v2, [I

    new-array v4, v2, [I

    :cond_0
    if-ge p1, p2, :cond_2

    .line 12
    invoke-static {p0, p1, v1}, Le/f/e/r/k;->a(Le/f/e/o/a;I[I)V

    const/4 v5, 0x0

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v2, :cond_1

    mul-int/lit8 v7, v6, 0x2

    .line 13
    aget v8, v1, v7

    aput v8, v3, v6

    add-int/lit8 v7, v7, 0x1

    .line 14
    aget v7, v1, v7

    aput v7, v4, v6

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 15
    :cond_1
    invoke-static {v3}, Le/f/e/r/h;->a([I)I

    move-result v6

    add-int/lit8 v6, v6, 0x30

    int-to-char v6, v6

    .line 16
    invoke-virtual {p3, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 17
    invoke-static {v4}, Le/f/e/r/h;->a([I)I

    move-result v6

    add-int/lit8 v6, v6, 0x30

    int-to-char v6, v6

    .line 18
    invoke-virtual {p3, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_1
    if-ge v5, v0, :cond_0

    .line 19
    aget v6, v1, v5

    add-int/2addr p1, v6

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_2
    return-void
.end method

.method public static c(Le/f/e/o/a;)I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/NotFoundException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Le/f/e/o/a;->d()I

    move-result v0

    const/4 v1, 0x0

    .line 2
    invoke-virtual {p0, v1}, Le/f/e/o/a;->b(I)I

    move-result p0

    if-eq p0, v0, :cond_0

    return p0

    .line 3
    :cond_0
    invoke-static {}, Lcom/google/zxing/NotFoundException;->a()Lcom/google/zxing/NotFoundException;

    move-result-object p0

    throw p0
.end method

.method public static c(Le/f/e/o/a;I[I)[I
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/NotFoundException;
        }
    .end annotation

    .line 4
    array-length v0, p2

    .line 5
    new-array v1, v0, [I

    .line 6
    invoke-virtual {p0}, Le/f/e/o/a;->d()I

    move-result v2

    const/4 v3, 0x0

    move v4, p1

    const/4 v5, 0x0

    const/4 v6, 0x0

    :goto_0
    if-ge p1, v2, :cond_3

    .line 7
    invoke-virtual {p0, p1}, Le/f/e/o/a;->a(I)Z

    move-result v7

    xor-int/2addr v7, v5

    const/4 v8, 0x1

    if-eqz v7, :cond_0

    .line 8
    aget v7, v1, v6

    add-int/2addr v7, v8

    aput v7, v1, v6

    goto :goto_2

    :cond_0
    add-int/lit8 v7, v0, -0x1

    if-ne v6, v7, :cond_2

    const v9, 0x3f47ae14    # 0.78f

    .line 9
    invoke-static {v1, p2, v9}, Le/f/e/r/k;->a([I[IF)F

    move-result v9

    const v10, 0x3ec28f5c    # 0.38f

    const/4 v11, 0x2

    cmpg-float v9, v9, v10

    if-gez v9, :cond_1

    new-array p0, v11, [I

    aput v4, p0, v3

    aput p1, p0, v8

    return-object p0

    .line 10
    :cond_1
    aget v9, v1, v3

    aget v10, v1, v8

    add-int/2addr v9, v10

    add-int/2addr v4, v9

    add-int/lit8 v9, v0, -0x2

    .line 11
    invoke-static {v1, v11, v1, v3, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 12
    aput v3, v1, v9

    .line 13
    aput v3, v1, v7

    add-int/lit8 v6, v6, -0x1

    goto :goto_1

    :cond_2
    add-int/lit8 v6, v6, 0x1

    .line 14
    :goto_1
    aput v8, v1, v6

    xor-int/lit8 v5, v5, 0x1

    :goto_2
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    .line 15
    :cond_3
    invoke-static {}, Lcom/google/zxing/NotFoundException;->a()Lcom/google/zxing/NotFoundException;

    move-result-object p0

    throw p0
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
            Lcom/google/zxing/FormatException;,
            Lcom/google/zxing/NotFoundException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p2}, Le/f/e/r/h;->b(Le/f/e/o/a;)[I

    move-result-object v0

    .line 2
    invoke-virtual {p0, p2}, Le/f/e/r/h;->a(Le/f/e/o/a;)[I

    move-result-object v1

    .line 3
    new-instance v2, Ljava/lang/StringBuilder;

    const/16 v3, 0x14

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v3, 0x1

    .line 4
    aget v4, v0, v3

    const/4 v5, 0x0

    aget v6, v1, v5

    invoke-static {p2, v4, v6, v2}, Le/f/e/r/h;->a(Le/f/e/o/a;IILjava/lang/StringBuilder;)V

    .line 5
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const/4 v2, 0x0

    if-eqz p3, :cond_0

    .line 6
    sget-object v4, Le/f/e/d;->g:Le/f/e/d;

    invoke-interface {p3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, [I

    goto :goto_0

    :cond_0
    move-object p3, v2

    :goto_0
    if-nez p3, :cond_1

    .line 7
    sget-object p3, Le/f/e/r/h;->b:[I

    .line 8
    :cond_1
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v4

    .line 9
    array-length v6, p3

    const/4 v7, 0x0

    const/4 v8, 0x0

    :goto_1
    if-ge v7, v6, :cond_4

    aget v9, p3, v7

    if-ne v4, v9, :cond_2

    const/4 p3, 0x1

    goto :goto_2

    :cond_2
    if-le v9, v8, :cond_3

    move v8, v9

    :cond_3
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_4
    const/4 p3, 0x0

    :goto_2
    if-nez p3, :cond_5

    if-le v4, v8, :cond_5

    const/4 p3, 0x1

    :cond_5
    if-eqz p3, :cond_6

    .line 10
    new-instance p3, Le/f/e/j;

    const/4 v4, 0x2

    new-array v4, v4, [Le/f/e/l;

    new-instance v6, Le/f/e/l;

    aget v0, v0, v3

    int-to-float v0, v0

    int-to-float p1, p1

    invoke-direct {v6, v0, p1}, Le/f/e/l;-><init>(FF)V

    aput-object v6, v4, v5

    new-instance v0, Le/f/e/l;

    aget v1, v1, v5

    int-to-float v1, v1

    invoke-direct {v0, v1, p1}, Le/f/e/l;-><init>(FF)V

    aput-object v0, v4, v3

    sget-object p1, Le/f/e/a;->j:Le/f/e/a;

    invoke-direct {p3, p2, v2, v4, p1}, Le/f/e/j;-><init>(Ljava/lang/String;[B[Le/f/e/l;Le/f/e/a;)V

    return-object p3

    .line 11
    :cond_6
    invoke-static {}, Lcom/google/zxing/FormatException;->a()Lcom/google/zxing/FormatException;

    move-result-object p1

    throw p1
.end method

.method public final a(Le/f/e/o/a;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/NotFoundException;
        }
    .end annotation

    .line 20
    iget v0, p0, Le/f/e/r/h;->a:I

    mul-int/lit8 v0, v0, 0xa

    if-ge v0, p2, :cond_0

    goto :goto_0

    :cond_0
    move v0, p2

    :goto_0
    add-int/lit8 p2, p2, -0x1

    :goto_1
    if-lez v0, :cond_1

    if-ltz p2, :cond_1

    .line 21
    invoke-virtual {p1, p2}, Le/f/e/o/a;->a(I)Z

    move-result v1

    if-nez v1, :cond_1

    add-int/lit8 v0, v0, -0x1

    add-int/lit8 p2, p2, -0x1

    goto :goto_1

    :cond_1
    if-nez v0, :cond_2

    return-void

    .line 22
    :cond_2
    invoke-static {}, Lcom/google/zxing/NotFoundException;->a()Lcom/google/zxing/NotFoundException;

    move-result-object p1

    throw p1
.end method

.method public final a(Le/f/e/o/a;)[I
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/NotFoundException;
        }
    .end annotation

    .line 23
    invoke-virtual {p1}, Le/f/e/o/a;->e()V

    .line 24
    :try_start_0
    invoke-static {p1}, Le/f/e/r/h;->c(Le/f/e/o/a;)I

    move-result v0

    .line 25
    sget-object v1, Le/f/e/r/h;->d:[I

    invoke-static {p1, v0, v1}, Le/f/e/r/h;->c(Le/f/e/o/a;I[I)[I

    move-result-object v0

    const/4 v1, 0x0

    .line 26
    aget v2, v0, v1

    invoke-virtual {p0, p1, v2}, Le/f/e/r/h;->a(Le/f/e/o/a;I)V

    .line 27
    aget v2, v0, v1

    .line 28
    invoke-virtual {p1}, Le/f/e/o/a;->d()I

    move-result v3

    const/4 v4, 0x1

    aget v5, v0, v4

    sub-int/2addr v3, v5

    aput v3, v0, v1

    .line 29
    invoke-virtual {p1}, Le/f/e/o/a;->d()I

    move-result v1

    sub-int/2addr v1, v2

    aput v1, v0, v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    invoke-virtual {p1}, Le/f/e/o/a;->e()V

    return-object v0

    :catchall_0
    move-exception v0

    invoke-virtual {p1}, Le/f/e/o/a;->e()V

    throw v0
.end method

.method public final b(Le/f/e/o/a;)[I
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/NotFoundException;
        }
    .end annotation

    .line 1
    invoke-static {p1}, Le/f/e/r/h;->c(Le/f/e/o/a;)I

    move-result v0

    .line 2
    sget-object v1, Le/f/e/r/h;->c:[I

    invoke-static {p1, v0, v1}, Le/f/e/r/h;->c(Le/f/e/o/a;I[I)[I

    move-result-object v0

    const/4 v1, 0x1

    .line 3
    aget v1, v0, v1

    const/4 v2, 0x0

    aget v3, v0, v2

    sub-int/2addr v1, v3

    div-int/lit8 v1, v1, 0x4

    iput v1, p0, Le/f/e/r/h;->a:I

    .line 4
    aget v1, v0, v2

    invoke-virtual {p0, p1, v1}, Le/f/e/r/h;->a(Le/f/e/o/a;I)V

    return-object v0
.end method
