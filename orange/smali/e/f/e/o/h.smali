.class public abstract Le/f/e/o/h;
.super Le/f/e/b;
.source "SourceFile"


# static fields
.field public static final d:[B


# instance fields
.field public b:[B

.field public final c:[I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [B

    .line 1
    sput-object v0, Le/f/e/o/h;->d:[B

    return-void
.end method

.method public constructor <init>(Le/f/e/f;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Le/f/e/b;-><init>(Le/f/e/f;)V

    .line 2
    sget-object p1, Le/f/e/o/h;->d:[B

    iput-object p1, p0, Le/f/e/o/h;->b:[B

    const/16 p1, 0x20

    new-array p1, p1, [I

    .line 3
    iput-object p1, p0, Le/f/e/o/h;->c:[I

    return-void
.end method

.method public static a([I)I
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/NotFoundException;
        }
    .end annotation

    .line 37
    array-length v0, p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    if-ge v2, v0, :cond_2

    .line 38
    aget v6, p0, v2

    if-le v6, v3, :cond_0

    .line 39
    aget v3, p0, v2

    move v5, v2

    .line 40
    :cond_0
    aget v6, p0, v2

    if-le v6, v4, :cond_1

    .line 41
    aget v4, p0, v2

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_1
    if-ge v1, v0, :cond_4

    sub-int v6, v1, v5

    .line 42
    aget v7, p0, v1

    mul-int v7, v7, v6

    mul-int v7, v7, v6

    if-le v7, v3, :cond_3

    move v2, v1

    move v3, v7

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_4
    if-le v5, v2, :cond_5

    goto :goto_2

    :cond_5
    move v8, v5

    move v5, v2

    move v2, v8

    :goto_2
    sub-int v1, v5, v2

    .line 43
    div-int/lit8 v0, v0, 0x10

    if-le v1, v0, :cond_8

    add-int/lit8 v0, v5, -0x1

    const/4 v1, -0x1

    move v1, v0

    const/4 v3, -0x1

    :goto_3
    if-le v0, v2, :cond_7

    sub-int v6, v0, v2

    mul-int v6, v6, v6

    sub-int v7, v5, v0

    mul-int v6, v6, v7

    .line 44
    aget v7, p0, v0

    sub-int v7, v4, v7

    mul-int v6, v6, v7

    if-le v6, v3, :cond_6

    move v1, v0

    move v3, v6

    :cond_6
    add-int/lit8 v0, v0, -0x1

    goto :goto_3

    :cond_7
    shl-int/lit8 p0, v1, 0x3

    return p0

    .line 45
    :cond_8
    invoke-static {}, Lcom/google/zxing/NotFoundException;->a()Lcom/google/zxing/NotFoundException;

    move-result-object p0

    throw p0
.end method


# virtual methods
.method public a(ILe/f/e/o/a;)Le/f/e/o/a;
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/NotFoundException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Le/f/e/b;->c()Le/f/e/f;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Le/f/e/f;->c()I

    move-result v1

    if-eqz p2, :cond_1

    .line 3
    invoke-virtual {p2}, Le/f/e/o/a;->d()I

    move-result v2

    if-ge v2, v1, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p2}, Le/f/e/o/a;->a()V

    goto :goto_1

    .line 5
    :cond_1
    :goto_0
    new-instance p2, Le/f/e/o/a;

    invoke-direct {p2, v1}, Le/f/e/o/a;-><init>(I)V

    .line 6
    :goto_1
    invoke-virtual {p0, v1}, Le/f/e/o/h;->a(I)V

    .line 7
    iget-object v2, p0, Le/f/e/o/h;->b:[B

    invoke-virtual {v0, p1, v2}, Le/f/e/f;->a(I[B)[B

    move-result-object p1

    .line 8
    iget-object v0, p0, Le/f/e/o/h;->c:[I

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_2
    const/4 v4, 0x3

    const/4 v5, 0x1

    if-ge v3, v1, :cond_2

    .line 9
    aget-byte v6, p1, v3

    and-int/lit16 v6, v6, 0xff

    shr-int/lit8 v4, v6, 0x3

    aget v6, v0, v4

    add-int/2addr v6, v5

    aput v6, v0, v4

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 10
    :cond_2
    invoke-static {v0}, Le/f/e/o/h;->a([I)I

    move-result v0

    if-ge v1, v4, :cond_4

    :goto_3
    if-ge v2, v1, :cond_6

    .line 11
    aget-byte v3, p1, v2

    and-int/lit16 v3, v3, 0xff

    if-ge v3, v0, :cond_3

    .line 12
    invoke-virtual {p2, v2}, Le/f/e/o/a;->d(I)V

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    .line 13
    :cond_4
    aget-byte v2, p1, v2

    and-int/lit16 v2, v2, 0xff

    .line 14
    aget-byte v3, p1, v5

    and-int/lit16 v3, v3, 0xff

    const/4 v4, 0x1

    move v9, v3

    move v3, v2

    move v2, v9

    :goto_4
    add-int/lit8 v6, v1, -0x1

    if-ge v4, v6, :cond_6

    add-int/lit8 v6, v4, 0x1

    .line 15
    aget-byte v7, p1, v6

    and-int/lit16 v7, v7, 0xff

    shl-int/lit8 v8, v2, 0x2

    sub-int/2addr v8, v3

    sub-int/2addr v8, v7

    .line 16
    div-int/lit8 v8, v8, 0x2

    if-ge v8, v0, :cond_5

    .line 17
    invoke-virtual {p2, v4}, Le/f/e/o/a;->d(I)V

    :cond_5
    move v3, v2

    move v4, v6

    move v2, v7

    goto :goto_4

    :cond_6
    return-object p2
.end method

.method public a()Le/f/e/o/b;
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/NotFoundException;
        }
    .end annotation

    .line 18
    invoke-virtual {p0}, Le/f/e/b;->c()Le/f/e/f;

    move-result-object v0

    .line 19
    invoke-virtual {v0}, Le/f/e/f;->c()I

    move-result v1

    .line 20
    invoke-virtual {v0}, Le/f/e/f;->a()I

    move-result v2

    .line 21
    new-instance v3, Le/f/e/o/b;

    invoke-direct {v3, v1, v2}, Le/f/e/o/b;-><init>(II)V

    .line 22
    invoke-virtual {p0, v1}, Le/f/e/o/h;->a(I)V

    .line 23
    iget-object v4, p0, Le/f/e/o/h;->c:[I

    const/4 v5, 0x1

    const/4 v6, 0x1

    :goto_0
    const/4 v7, 0x5

    if-ge v6, v7, :cond_1

    mul-int v8, v2, v6

    .line 24
    div-int/2addr v8, v7

    .line 25
    iget-object v9, p0, Le/f/e/o/h;->b:[B

    invoke-virtual {v0, v8, v9}, Le/f/e/f;->a(I[B)[B

    move-result-object v8

    shl-int/lit8 v9, v1, 0x2

    .line 26
    div-int/2addr v9, v7

    .line 27
    div-int/lit8 v7, v1, 0x5

    :goto_1
    if-ge v7, v9, :cond_0

    .line 28
    aget-byte v10, v8, v7

    and-int/lit16 v10, v10, 0xff

    shr-int/lit8 v10, v10, 0x3

    .line 29
    aget v11, v4, v10

    add-int/2addr v11, v5

    aput v11, v4, v10

    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 30
    :cond_1
    invoke-static {v4}, Le/f/e/o/h;->a([I)I

    move-result v4

    .line 31
    invoke-virtual {v0}, Le/f/e/f;->b()[B

    move-result-object v0

    const/4 v5, 0x0

    const/4 v6, 0x0

    :goto_2
    if-ge v6, v2, :cond_4

    mul-int v7, v6, v1

    const/4 v8, 0x0

    :goto_3
    if-ge v8, v1, :cond_3

    add-int v9, v7, v8

    .line 32
    aget-byte v9, v0, v9

    and-int/lit16 v9, v9, 0xff

    if-ge v9, v4, :cond_2

    .line 33
    invoke-virtual {v3, v8, v6}, Le/f/e/o/b;->c(II)V

    :cond_2
    add-int/lit8 v8, v8, 0x1

    goto :goto_3

    :cond_3
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_4
    return-object v3
.end method

.method public final a(I)V
    .locals 2

    .line 34
    iget-object v0, p0, Le/f/e/o/h;->b:[B

    array-length v0, v0

    if-ge v0, p1, :cond_0

    .line 35
    new-array p1, p1, [B

    iput-object p1, p0, Le/f/e/o/h;->b:[B

    :cond_0
    const/4 p1, 0x0

    const/4 v0, 0x0

    :goto_0
    const/16 v1, 0x20

    if-ge v0, v1, :cond_1

    .line 36
    iget-object v1, p0, Le/f/e/o/h;->c:[I

    aput p1, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method
