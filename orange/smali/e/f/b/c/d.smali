.class public Le/f/b/c/d;
.super Lcom/google/common/io/BaseEncoding;
.source "SourceFile"


# instance fields
.field public final c:Le/f/b/c/a;

.field public final d:Ljava/lang/Character;


# direct methods
.method public constructor <init>(Le/f/b/c/a;Ljava/lang/Character;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Lcom/google/common/io/BaseEncoding;-><init>()V

    .line 3
    invoke-static {p1}, Le/f/b/a/p;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-object v0, p1

    check-cast v0, Le/f/b/c/a;

    iput-object v0, p0, Le/f/b/c/d;->c:Le/f/b/c/a;

    if-eqz p2, :cond_1

    .line 4
    invoke-virtual {p2}, Ljava/lang/Character;->charValue()C

    move-result v0

    invoke-virtual {p1, v0}, Le/f/b/c/a;->b(C)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    const-string v0, "Padding character %s was already in alphabet"

    .line 5
    invoke-static {p1, v0, p2}, Le/f/b/a/p;->a(ZLjava/lang/String;Ljava/lang/Object;)V

    .line 6
    iput-object p2, p0, Le/f/b/c/d;->d:Ljava/lang/Character;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Character;)V
    .locals 1

    .line 1
    new-instance v0, Le/f/b/c/a;

    invoke-virtual {p2}, Ljava/lang/String;->toCharArray()[C

    move-result-object p2

    invoke-direct {v0, p1, p2}, Le/f/b/c/a;-><init>(Ljava/lang/String;[C)V

    invoke-direct {p0, v0, p3}, Le/f/b/c/d;-><init>(Le/f/b/c/a;Ljava/lang/Character;)V

    return-void
.end method


# virtual methods
.method public a(I)I
    .locals 4

    .line 5
    iget-object v0, p0, Le/f/b/c/d;->c:Le/f/b/c/a;

    iget v0, v0, Le/f/b/c/a;->d:I

    int-to-long v0, v0

    int-to-long v2, p1

    mul-long v0, v0, v2

    const-wide/16 v2, 0x7

    add-long/2addr v0, v2

    const-wide/16 v2, 0x8

    div-long/2addr v0, v2

    long-to-int p1, v0

    return p1
.end method

.method public a([BLjava/lang/CharSequence;)I
    .locals 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/common/io/BaseEncoding$DecodingException;
        }
    .end annotation

    .line 6
    invoke-static {p1}, Le/f/b/a/p;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    invoke-virtual {p0, p2}, Le/f/b/c/d;->c(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p2

    .line 8
    iget-object v0, p0, Le/f/b/c/d;->c:Le/f/b/c/a;

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v1

    invoke-virtual {v0, v1}, Le/f/b/c/a;->b(I)Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 9
    :goto_0
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-ge v1, v3, :cond_3

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    .line 10
    :goto_1
    iget-object v7, p0, Le/f/b/c/d;->c:Le/f/b/c/a;

    iget v8, v7, Le/f/b/c/a;->e:I

    if-ge v5, v8, :cond_1

    .line 11
    iget v7, v7, Le/f/b/c/a;->d:I

    shl-long/2addr v3, v7

    add-int v7, v1, v5

    .line 12
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v8

    if-ge v7, v8, :cond_0

    .line 13
    iget-object v7, p0, Le/f/b/c/d;->c:Le/f/b/c/a;

    add-int/lit8 v8, v6, 0x1

    add-int/2addr v6, v1

    invoke-interface {p2, v6}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v6

    invoke-virtual {v7, v6}, Le/f/b/c/a;->a(C)I

    move-result v6

    int-to-long v6, v6

    or-long/2addr v3, v6

    move v6, v8

    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 14
    :cond_1
    iget v5, v7, Le/f/b/c/a;->f:I

    mul-int/lit8 v8, v5, 0x8

    iget v7, v7, Le/f/b/c/a;->d:I

    mul-int v6, v6, v7

    sub-int/2addr v8, v6

    add-int/lit8 v5, v5, -0x1

    mul-int/lit8 v5, v5, 0x8

    :goto_2
    if-lt v5, v8, :cond_2

    add-int/lit8 v6, v2, 0x1

    ushr-long v9, v3, v5

    const-wide/16 v11, 0xff

    and-long/2addr v9, v11

    long-to-int v7, v9

    int-to-byte v7, v7

    .line 15
    aput-byte v7, p1, v2

    add-int/lit8 v5, v5, -0x8

    move v2, v6

    goto :goto_2

    .line 16
    :cond_2
    iget-object v3, p0, Le/f/b/c/d;->c:Le/f/b/c/a;

    iget v3, v3, Le/f/b/c/a;->e:I

    add-int/2addr v1, v3

    goto :goto_0

    :cond_3
    return v2

    .line 17
    :cond_4
    new-instance p1, Lcom/google/common/io/BaseEncoding$DecodingException;

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result p2

    const/16 v0, 0x20

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v0, "Invalid input length "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/google/common/io/BaseEncoding$DecodingException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public a()Lcom/google/common/io/BaseEncoding;
    .locals 2

    .line 18
    iget-object v0, p0, Le/f/b/c/d;->d:Ljava/lang/Character;

    if-nez v0, :cond_0

    move-object v0, p0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Le/f/b/c/d;->c:Le/f/b/c/a;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Le/f/b/c/d;->a(Le/f/b/c/a;Ljava/lang/Character;)Lcom/google/common/io/BaseEncoding;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public a(Le/f/b/c/a;Ljava/lang/Character;)Lcom/google/common/io/BaseEncoding;
    .locals 1

    .line 19
    new-instance v0, Le/f/b/c/d;

    invoke-direct {v0, p1, p2}, Le/f/b/c/d;-><init>(Le/f/b/c/a;Ljava/lang/Character;)V

    return-object v0
.end method

.method public a(Ljava/lang/Appendable;[BII)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-static {p1}, Le/f/b/a/p;->a(Ljava/lang/Object;)Ljava/lang/Object;

    add-int v0, p3, p4

    .line 2
    array-length v1, p2

    invoke-static {p3, v0, v1}, Le/f/b/a/p;->b(III)V

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p4, :cond_0

    add-int v1, p3, v0

    .line 3
    iget-object v2, p0, Le/f/b/c/d;->c:Le/f/b/c/a;

    iget v2, v2, Le/f/b/c/a;->f:I

    sub-int v3, p4, v0

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v2

    invoke-virtual {p0, p1, p2, v1, v2}, Le/f/b/c/d;->b(Ljava/lang/Appendable;[BII)V

    .line 4
    iget-object v1, p0, Le/f/b/c/d;->c:Le/f/b/c/a;

    iget v1, v1, Le/f/b/c/a;->f:I

    add-int/2addr v0, v1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public b(I)I
    .locals 3

    .line 1
    iget-object v0, p0, Le/f/b/c/d;->c:Le/f/b/c/a;

    iget v1, v0, Le/f/b/c/a;->e:I

    iget v0, v0, Le/f/b/c/a;->f:I

    sget-object v2, Ljava/math/RoundingMode;->CEILING:Ljava/math/RoundingMode;

    invoke-static {p1, v0, v2}, Le/f/b/d/b;->a(IILjava/math/RoundingMode;)I

    move-result p1

    mul-int v1, v1, p1

    return v1
.end method

.method public b(Ljava/lang/Appendable;[BII)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2
    invoke-static {p1}, Le/f/b/a/p;->a(Ljava/lang/Object;)Ljava/lang/Object;

    add-int v0, p3, p4

    .line 3
    array-length v1, p2

    invoke-static {p3, v0, v1}, Le/f/b/a/p;->b(III)V

    .line 4
    iget-object v0, p0, Le/f/b/c/d;->c:Le/f/b/c/a;

    iget v0, v0, Le/f/b/c/a;->f:I

    const/4 v1, 0x0

    if-gt p4, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Le/f/b/a/p;->a(Z)V

    const-wide/16 v2, 0x0

    const/4 v0, 0x0

    :goto_1
    const/16 v4, 0x8

    if-ge v0, p4, :cond_1

    add-int v5, p3, v0

    .line 5
    aget-byte v5, p2, v5

    and-int/lit16 v5, v5, 0xff

    int-to-long v5, v5

    or-long/2addr v2, v5

    shl-long/2addr v2, v4

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    add-int/lit8 p2, p4, 0x1

    mul-int/lit8 p2, p2, 0x8

    .line 6
    iget-object p3, p0, Le/f/b/c/d;->c:Le/f/b/c/a;

    iget p3, p3, Le/f/b/c/a;->d:I

    sub-int/2addr p2, p3

    :goto_2
    mul-int/lit8 p3, p4, 0x8

    if-ge v1, p3, :cond_2

    sub-int p3, p2, v1

    ushr-long v5, v2, p3

    long-to-int p3, v5

    .line 7
    iget-object v0, p0, Le/f/b/c/d;->c:Le/f/b/c/a;

    iget v5, v0, Le/f/b/c/a;->c:I

    and-int/2addr p3, v5

    .line 8
    invoke-virtual {v0, p3}, Le/f/b/c/a;->a(I)C

    move-result p3

    invoke-interface {p1, p3}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    .line 9
    iget-object p3, p0, Le/f/b/c/d;->c:Le/f/b/c/a;

    iget p3, p3, Le/f/b/c/a;->d:I

    add-int/2addr v1, p3

    goto :goto_2

    .line 10
    :cond_2
    iget-object p2, p0, Le/f/b/c/d;->d:Ljava/lang/Character;

    if-eqz p2, :cond_3

    .line 11
    :goto_3
    iget-object p2, p0, Le/f/b/c/d;->c:Le/f/b/c/a;

    iget p2, p2, Le/f/b/c/a;->f:I

    mul-int/lit8 p2, p2, 0x8

    if-ge v1, p2, :cond_3

    .line 12
    iget-object p2, p0, Le/f/b/c/d;->d:Ljava/lang/Character;

    invoke-virtual {p2}, Ljava/lang/Character;->charValue()C

    move-result p2

    invoke-interface {p1, p2}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    .line 13
    iget-object p2, p0, Le/f/b/c/d;->c:Le/f/b/c/a;

    iget p2, p2, Le/f/b/c/a;->d:I

    add-int/2addr v1, p2

    goto :goto_3

    :cond_3
    return-void
.end method

.method public c(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    .locals 3

    .line 1
    invoke-static {p1}, Le/f/b/a/p;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    iget-object v0, p0, Le/f/b/c/d;->d:Ljava/lang/Character;

    if-nez v0, :cond_0

    return-object p1

    .line 3
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Character;->charValue()C

    move-result v0

    .line 4
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    :goto_0
    if-ltz v1, :cond_2

    .line 5
    invoke-interface {p1, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    if-eq v2, v0, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_2
    :goto_1
    const/4 v0, 0x0

    add-int/lit8 v1, v1, 0x1

    .line 6
    invoke-interface {p1, v0, v1}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    instance-of v0, p1, Le/f/b/c/d;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 2
    check-cast p1, Le/f/b/c/d;

    .line 3
    iget-object v0, p0, Le/f/b/c/d;->c:Le/f/b/c/a;

    iget-object v2, p1, Le/f/b/c/d;->c:Le/f/b/c/a;

    invoke-virtual {v0, v2}, Le/f/b/c/a;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Le/f/b/c/d;->d:Ljava/lang/Character;

    iget-object p1, p1, Le/f/b/c/d;->d:Ljava/lang/Character;

    .line 4
    invoke-static {v0, p1}, Le/f/b/a/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, Le/f/b/c/d;->c:Le/f/b/c/a;

    invoke-virtual {v0}, Le/f/b/c/a;->hashCode()I

    move-result v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Le/f/b/c/d;->d:Ljava/lang/Character;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v1}, Le/f/b/a/k;->a([Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "BaseEncoding."

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2
    iget-object v1, p0, Le/f/b/c/d;->c:Le/f/b/c/a;

    invoke-virtual {v1}, Le/f/b/c/a;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3
    iget-object v1, p0, Le/f/b/c/d;->c:Le/f/b/c/a;

    iget v1, v1, Le/f/b/c/a;->d:I

    const/16 v2, 0x8

    rem-int/2addr v2, v1

    if-eqz v2, :cond_1

    .line 4
    iget-object v1, p0, Le/f/b/c/d;->d:Ljava/lang/Character;

    if-nez v1, :cond_0

    const-string v1, ".omitPadding()"

    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    const-string v1, ".withPadChar(\'"

    .line 6
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/f/b/c/d;->d:Ljava/lang/Character;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "\')"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 7
    :cond_1
    :goto_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method