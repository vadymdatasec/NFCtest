.class public final Le/f/e/o/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;


# instance fields
.field public b:[I

.field public c:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Le/f/e/o/a;->c:I

    .line 3
    invoke-static {p1}, Le/f/e/o/a;->e(I)[I

    move-result-object p1

    iput-object p1, p0, Le/f/e/o/a;->b:[I

    return-void
.end method

.method public constructor <init>([II)V
    .locals 0

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Le/f/e/o/a;->b:[I

    .line 6
    iput p2, p0, Le/f/e/o/a;->c:I

    return-void
.end method

.method public static e(I)[I
    .locals 0

    add-int/lit8 p0, p0, 0x1f

    .line 11
    div-int/lit8 p0, p0, 0x20

    new-array p0, p0, [I

    return-object p0
.end method


# virtual methods
.method public a()V
    .locals 4

    .line 3
    iget-object v0, p0, Le/f/e/o/a;->b:[I

    array-length v0, v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    .line 4
    iget-object v3, p0, Le/f/e/o/a;->b:[I

    aput v1, v3, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public a(II)V
    .locals 1

    .line 2
    iget-object v0, p0, Le/f/e/o/a;->b:[I

    div-int/lit8 p1, p1, 0x20

    aput p2, v0, p1

    return-void
.end method

.method public a(I)Z
    .locals 2

    .line 1
    iget-object v0, p0, Le/f/e/o/a;->b:[I

    div-int/lit8 v1, p1, 0x20

    aget v0, v0, v1

    and-int/lit8 p1, p1, 0x1f

    const/4 v1, 0x1

    shl-int p1, v1, p1

    and-int/2addr p1, v0

    if-eqz p1, :cond_0

    return v1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public a(IIZ)Z
    .locals 8

    if-lt p2, p1, :cond_6

    if-ltz p1, :cond_6

    .line 5
    iget v0, p0, Le/f/e/o/a;->c:I

    if-gt p2, v0, :cond_6

    const/4 v0, 0x1

    if-ne p2, p1, :cond_0

    return v0

    :cond_0
    add-int/lit8 p2, p2, -0x1

    .line 6
    div-int/lit8 v1, p1, 0x20

    .line 7
    div-int/lit8 v2, p2, 0x20

    move v3, v1

    :goto_0
    if-gt v3, v2, :cond_5

    const/4 v4, 0x0

    const/16 v5, 0x1f

    if-le v3, v1, :cond_1

    const/4 v6, 0x0

    goto :goto_1

    :cond_1
    and-int/lit8 v6, p1, 0x1f

    :goto_1
    if-ge v3, v2, :cond_2

    goto :goto_2

    :cond_2
    and-int/2addr v5, p2

    :goto_2
    const/4 v7, 0x2

    shl-int v5, v7, v5

    shl-int v6, v0, v6

    sub-int/2addr v5, v6

    .line 8
    iget-object v6, p0, Le/f/e/o/a;->b:[I

    aget v6, v6, v3

    and-int/2addr v6, v5

    if-eqz p3, :cond_3

    goto :goto_3

    :cond_3
    const/4 v5, 0x0

    :goto_3
    if-eq v6, v5, :cond_4

    return v4

    :cond_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_5
    return v0

    .line 9
    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method

.method public b(I)I
    .locals 3

    .line 1
    iget v0, p0, Le/f/e/o/a;->c:I

    if-lt p1, v0, :cond_0

    return v0

    .line 2
    :cond_0
    div-int/lit8 v0, p1, 0x20

    .line 3
    iget-object v1, p0, Le/f/e/o/a;->b:[I

    aget v1, v1, v0

    and-int/lit8 p1, p1, 0x1f

    const/4 v2, 0x1

    shl-int p1, v2, p1

    sub-int/2addr p1, v2

    not-int p1, p1

    and-int/2addr p1, v1

    :goto_0
    if-nez p1, :cond_2

    add-int/lit8 v0, v0, 0x1

    .line 4
    iget-object p1, p0, Le/f/e/o/a;->b:[I

    array-length v1, p1

    if-ne v0, v1, :cond_1

    .line 5
    iget p1, p0, Le/f/e/o/a;->c:I

    return p1

    .line 6
    :cond_1
    aget p1, p1, v0

    goto :goto_0

    :cond_2
    shl-int/lit8 v0, v0, 0x5

    .line 7
    invoke-static {p1}, Ljava/lang/Integer;->numberOfTrailingZeros(I)I

    move-result p1

    add-int/2addr v0, p1

    .line 8
    iget p1, p0, Le/f/e/o/a;->c:I

    if-le v0, p1, :cond_3

    return p1

    :cond_3
    return v0
.end method

.method public b()[I
    .locals 1

    .line 9
    iget-object v0, p0, Le/f/e/o/a;->b:[I

    return-object v0
.end method

.method public c(I)I
    .locals 3

    .line 1
    iget v0, p0, Le/f/e/o/a;->c:I

    if-lt p1, v0, :cond_0

    return v0

    .line 2
    :cond_0
    div-int/lit8 v0, p1, 0x20

    .line 3
    iget-object v1, p0, Le/f/e/o/a;->b:[I

    aget v1, v1, v0

    not-int v1, v1

    and-int/lit8 p1, p1, 0x1f

    const/4 v2, 0x1

    shl-int p1, v2, p1

    sub-int/2addr p1, v2

    not-int p1, p1

    and-int/2addr p1, v1

    :goto_0
    if-nez p1, :cond_2

    add-int/lit8 v0, v0, 0x1

    .line 4
    iget-object p1, p0, Le/f/e/o/a;->b:[I

    array-length v1, p1

    if-ne v0, v1, :cond_1

    .line 5
    iget p1, p0, Le/f/e/o/a;->c:I

    return p1

    .line 6
    :cond_1
    aget p1, p1, v0

    not-int p1, p1

    goto :goto_0

    :cond_2
    shl-int/lit8 v0, v0, 0x5

    .line 7
    invoke-static {p1}, Ljava/lang/Integer;->numberOfTrailingZeros(I)I

    move-result p1

    add-int/2addr v0, p1

    .line 8
    iget p1, p0, Le/f/e/o/a;->c:I

    if-le v0, p1, :cond_3

    return p1

    :cond_3
    return v0
.end method

.method public clone()Le/f/e/o/a;
    .locals 3

    .line 2
    new-instance v0, Le/f/e/o/a;

    iget-object v1, p0, Le/f/e/o/a;->b:[I

    invoke-virtual {v1}, [I->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [I

    iget v2, p0, Le/f/e/o/a;->c:I

    invoke-direct {v0, v1, v2}, Le/f/e/o/a;-><init>([II)V

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Le/f/e/o/a;->clone()Le/f/e/o/a;

    move-result-object v0

    return-object v0
.end method

.method public d()I
    .locals 1

    .line 1
    iget v0, p0, Le/f/e/o/a;->c:I

    return v0
.end method

.method public d(I)V
    .locals 4

    .line 2
    iget-object v0, p0, Le/f/e/o/a;->b:[I

    div-int/lit8 v1, p1, 0x20

    aget v2, v0, v1

    and-int/lit8 p1, p1, 0x1f

    const/4 v3, 0x1

    shl-int p1, v3, p1

    or-int/2addr p1, v2

    aput p1, v0, v1

    return-void
.end method

.method public e()V
    .locals 13

    .line 1
    iget-object v0, p0, Le/f/e/o/a;->b:[I

    array-length v0, v0

    new-array v0, v0, [I

    .line 2
    iget v1, p0, Le/f/e/o/a;->c:I

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    div-int/lit8 v1, v1, 0x20

    add-int/lit8 v3, v1, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v3, :cond_0

    .line 3
    iget-object v6, p0, Le/f/e/o/a;->b:[I

    aget v6, v6, v5

    int-to-long v6, v6

    shr-long v8, v6, v2

    const-wide/32 v10, 0x55555555

    and-long/2addr v8, v10

    and-long/2addr v6, v10

    shl-long/2addr v6, v2

    or-long/2addr v6, v8

    const/4 v8, 0x2

    shr-long v9, v6, v8

    const-wide/32 v11, 0x33333333

    and-long/2addr v9, v11

    and-long/2addr v6, v11

    shl-long/2addr v6, v8

    or-long/2addr v6, v9

    const/4 v8, 0x4

    shr-long v9, v6, v8

    const-wide/32 v11, 0xf0f0f0f

    and-long/2addr v9, v11

    and-long/2addr v6, v11

    shl-long/2addr v6, v8

    or-long/2addr v6, v9

    const/16 v8, 0x8

    shr-long v9, v6, v8

    const-wide/32 v11, 0xff00ff

    and-long/2addr v9, v11

    and-long/2addr v6, v11

    shl-long/2addr v6, v8

    or-long/2addr v6, v9

    const/16 v8, 0x10

    shr-long v9, v6, v8

    const-wide/32 v11, 0xffff

    and-long/2addr v9, v11

    and-long/2addr v6, v11

    shl-long/2addr v6, v8

    or-long/2addr v6, v9

    sub-int v8, v1, v5

    long-to-int v7, v6

    .line 4
    aput v7, v0, v8

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 5
    :cond_0
    iget v1, p0, Le/f/e/o/a;->c:I

    shl-int/lit8 v5, v3, 0x5

    if-eq v1, v5, :cond_2

    sub-int/2addr v5, v1

    .line 6
    aget v1, v0, v4

    ushr-int/2addr v1, v5

    const/4 v4, 0x1

    :goto_1
    if-ge v4, v3, :cond_1

    .line 7
    aget v6, v0, v4

    rsub-int/lit8 v7, v5, 0x20

    shl-int v7, v6, v7

    or-int/2addr v1, v7

    add-int/lit8 v7, v4, -0x1

    .line 8
    aput v1, v0, v7

    ushr-int v1, v6, v5

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_1
    sub-int/2addr v3, v2

    .line 9
    aput v1, v0, v3

    .line 10
    :cond_2
    iput-object v0, p0, Le/f/e/o/a;->b:[I

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    instance-of v0, p1, Le/f/e/o/a;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 2
    :cond_0
    check-cast p1, Le/f/e/o/a;

    .line 3
    iget v0, p0, Le/f/e/o/a;->c:I

    iget v2, p1, Le/f/e/o/a;->c:I

    if-ne v0, v2, :cond_1

    iget-object v0, p0, Le/f/e/o/a;->b:[I

    iget-object p1, p1, Le/f/e/o/a;->b:[I

    invoke-static {v0, p1}, Ljava/util/Arrays;->equals([I[I)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public hashCode()I
    .locals 2

    .line 1
    iget v0, p0, Le/f/e/o/a;->c:I

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Le/f/e/o/a;->b:[I

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    iget v1, p0, Le/f/e/o/a;->c:I

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v1, 0x0

    .line 2
    :goto_0
    iget v2, p0, Le/f/e/o/a;->c:I

    if-ge v1, v2, :cond_2

    and-int/lit8 v2, v1, 0x7

    if-nez v2, :cond_0

    const/16 v2, 0x20

    .line 3
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 4
    :cond_0
    invoke-virtual {p0, v1}, Le/f/e/o/a;->a(I)Z

    move-result v2

    if-eqz v2, :cond_1

    const/16 v2, 0x58

    goto :goto_1

    :cond_1
    const/16 v2, 0x2e

    :goto_1
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 5
    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
