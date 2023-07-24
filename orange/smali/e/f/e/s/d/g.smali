.class public abstract Le/f/e/s/d/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:[C

.field public static final b:[C

.field public static final c:Ljava/nio/charset/Charset;

.field public static final d:[Ljava/math/BigInteger;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    const-string v0, ";<>@[\\]_`~!\r\t,:\n-.$/\"|*()?{}\'"

    .line 1
    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    sput-object v0, Le/f/e/s/d/g;->a:[C

    const-string v0, "0123456789&\r\t,:#-.$/+%*=^"

    .line 2
    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    sput-object v0, Le/f/e/s/d/g;->b:[C

    const-string v0, "ISO-8859-1"

    .line 3
    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    sput-object v0, Le/f/e/s/d/g;->c:Ljava/nio/charset/Charset;

    const/16 v0, 0x10

    new-array v0, v0, [Ljava/math/BigInteger;

    .line 4
    sput-object v0, Le/f/e/s/d/g;->d:[Ljava/math/BigInteger;

    sget-object v1, Ljava/math/BigInteger;->ONE:Ljava/math/BigInteger;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-wide/16 v0, 0x384

    .line 5
    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    .line 6
    sget-object v1, Le/f/e/s/d/g;->d:[Ljava/math/BigInteger;

    const/4 v2, 0x1

    aput-object v0, v1, v2

    const/4 v1, 0x2

    .line 7
    :goto_0
    sget-object v2, Le/f/e/s/d/g;->d:[Ljava/math/BigInteger;

    array-length v3, v2

    if-ge v1, v3, :cond_0

    add-int/lit8 v3, v1, -0x1

    .line 8
    aget-object v3, v2, v3

    invoke-virtual {v3, v0}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v3

    aput-object v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static a(I[ILjava/nio/charset/Charset;ILjava/lang/StringBuilder;)I
    .locals 20

    move/from16 v0, p0

    .line 70
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    const/16 v2, 0x39a

    const/16 v3, 0x39b

    const/16 v4, 0x3a0

    const/16 v5, 0x386

    const-wide/16 v6, 0x384

    const/4 v8, 0x6

    const/16 v9, 0x39c

    const/16 v10, 0x385

    const/16 v11, 0x384

    const/4 v15, 0x0

    if-ne v0, v10, :cond_6

    new-array v0, v8, [I

    add-int/lit8 v16, p3, 0x1

    .line 71
    aget v17, p1, p3

    move/from16 v12, v16

    move/from16 v13, v17

    const/16 v16, 0x0

    :goto_0
    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    .line 72
    :goto_1
    aget v14, p1, v15

    if-ge v12, v14, :cond_4

    if-nez v16, :cond_4

    add-int/lit8 v14, v17, 0x1

    .line 73
    aput v13, v0, v17

    mul-long v18, v18, v6

    int-to-long v6, v13

    add-long v18, v18, v6

    add-int/lit8 v6, v12, 0x1

    .line 74
    aget v13, p1, v12

    if-eq v13, v11, :cond_3

    if-eq v13, v10, :cond_3

    if-eq v13, v5, :cond_3

    if-eq v13, v9, :cond_3

    if-eq v13, v4, :cond_3

    if-eq v13, v3, :cond_3

    if-ne v13, v2, :cond_0

    goto :goto_3

    .line 75
    :cond_0
    rem-int/lit8 v7, v14, 0x5

    if-nez v7, :cond_2

    if-lez v14, :cond_2

    const/4 v7, 0x0

    :goto_2
    if-ge v7, v8, :cond_1

    rsub-int/lit8 v12, v7, 0x5

    mul-int/lit8 v12, v12, 0x8

    shr-long v2, v18, v12

    long-to-int v3, v2

    int-to-byte v2, v3

    .line 76
    invoke-virtual {v1, v2}, Ljava/io/ByteArrayOutputStream;->write(I)V

    add-int/lit8 v7, v7, 0x1

    const/16 v2, 0x39a

    const/16 v3, 0x39b

    goto :goto_2

    :cond_1
    move v12, v6

    const-wide/16 v6, 0x384

    goto :goto_0

    :cond_2
    move v12, v6

    move/from16 v17, v14

    const/16 v2, 0x39a

    const/16 v3, 0x39b

    const-wide/16 v6, 0x384

    goto :goto_1

    :cond_3
    :goto_3
    add-int/lit8 v12, v6, -0x1

    move/from16 v17, v14

    const/16 v2, 0x39a

    const/16 v3, 0x39b

    const-wide/16 v6, 0x384

    const/16 v16, 0x1

    goto :goto_1

    .line 77
    :cond_4
    aget v2, p1, v15

    if-ne v12, v2, :cond_5

    if-ge v13, v11, :cond_5

    add-int/lit8 v2, v17, 0x1

    .line 78
    aput v13, v0, v17

    goto :goto_4

    :cond_5
    move/from16 v2, v17

    :goto_4
    if-ge v15, v2, :cond_f

    .line 79
    aget v3, v0, v15

    int-to-byte v3, v3

    invoke-virtual {v1, v3}, Ljava/io/ByteArrayOutputStream;->write(I)V

    add-int/lit8 v15, v15, 0x1

    goto :goto_4

    :cond_6
    if-ne v0, v9, :cond_e

    move/from16 v0, p3

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-wide/16 v6, 0x0

    .line 80
    :goto_5
    aget v12, p1, v15

    if-ge v0, v12, :cond_d

    if-nez v2, :cond_d

    add-int/lit8 v12, v0, 0x1

    .line 81
    aget v0, p1, v0

    if-ge v0, v11, :cond_7

    add-int/lit8 v3, v3, 0x1

    const-wide/16 v13, 0x384

    mul-long v6, v6, v13

    int-to-long v13, v0

    add-long/2addr v6, v13

    move v0, v12

    const/16 v13, 0x39b

    const/16 v14, 0x39a

    goto :goto_7

    :cond_7
    if-eq v0, v11, :cond_9

    if-eq v0, v10, :cond_9

    if-eq v0, v5, :cond_9

    if-eq v0, v9, :cond_9

    if-eq v0, v4, :cond_9

    const/16 v13, 0x39b

    const/16 v14, 0x39a

    if-eq v0, v13, :cond_a

    if-ne v0, v14, :cond_8

    goto :goto_6

    :cond_8
    move v0, v12

    goto :goto_7

    :cond_9
    const/16 v13, 0x39b

    const/16 v14, 0x39a

    :cond_a
    :goto_6
    add-int/lit8 v12, v12, -0x1

    move v0, v12

    const/4 v2, 0x1

    .line 82
    :goto_7
    rem-int/lit8 v12, v3, 0x5

    if-nez v12, :cond_c

    if-lez v3, :cond_c

    const/4 v3, 0x0

    :goto_8
    if-ge v3, v8, :cond_b

    rsub-int/lit8 v12, v3, 0x5

    mul-int/lit8 v12, v12, 0x8

    shr-long v4, v6, v12

    long-to-int v5, v4

    int-to-byte v4, v5

    .line 83
    invoke-virtual {v1, v4}, Ljava/io/ByteArrayOutputStream;->write(I)V

    add-int/lit8 v3, v3, 0x1

    const/16 v4, 0x3a0

    const/16 v5, 0x386

    goto :goto_8

    :cond_b
    const/4 v3, 0x0

    const-wide/16 v6, 0x0

    :cond_c
    const/16 v4, 0x3a0

    const/16 v5, 0x386

    goto :goto_5

    :cond_d
    move v12, v0

    goto :goto_9

    :cond_e
    move/from16 v12, p3

    .line 84
    :cond_f
    :goto_9
    new-instance v0, Ljava/lang/String;

    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v1

    move-object/from16 v2, p2

    invoke-direct {v0, v1, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    move-object/from16 v1, p4

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return v12
.end method

.method public static a([IILe/f/e/s/c;)I
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/FormatException;
        }
    .end annotation

    add-int/lit8 v0, p1, 0x2

    const/4 v1, 0x0

    .line 23
    aget v2, p0, v1

    if-gt v0, v2, :cond_6

    const/4 v0, 0x2

    new-array v2, v0, [I

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_0

    .line 24
    aget v4, p0, p1

    aput v4, v2, v3

    add-int/lit8 v3, v3, 0x1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    .line 25
    :cond_0
    invoke-static {v2, v0}, Le/f/e/s/d/g;->a([II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p2, v0}, Le/f/e/s/c;->a(I)V

    .line 26
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 27
    invoke-static {p0, p1, v0}, Le/f/e/s/d/g;->b([IILjava/lang/StringBuilder;)I

    move-result p1

    .line 28
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Le/f/e/s/c;->a(Ljava/lang/String;)V

    .line 29
    aget v0, p0, p1

    const/16 v2, 0x39b

    const/16 v3, 0x39a

    const/4 v4, 0x1

    if-ne v0, v2, :cond_4

    add-int/lit8 p1, p1, 0x1

    .line 30
    aget v0, p0, v1

    sub-int/2addr v0, p1

    new-array v0, v0, [I

    const/4 v2, 0x0

    const/4 v5, 0x0

    .line 31
    :goto_1
    aget v6, p0, v1

    if-ge p1, v6, :cond_3

    if-nez v2, :cond_3

    add-int/lit8 v6, p1, 0x1

    .line 32
    aget p1, p0, p1

    const/16 v7, 0x384

    if-ge p1, v7, :cond_1

    add-int/lit8 v7, v5, 0x1

    .line 33
    aput p1, v0, v5

    move p1, v6

    move v5, v7

    goto :goto_1

    :cond_1
    if-ne p1, v3, :cond_2

    .line 34
    invoke-virtual {p2, v4}, Le/f/e/s/c;->a(Z)V

    add-int/lit8 p1, v6, 0x1

    const/4 v2, 0x1

    goto :goto_1

    .line 35
    :cond_2
    invoke-static {}, Lcom/google/zxing/FormatException;->a()Lcom/google/zxing/FormatException;

    move-result-object p0

    throw p0

    .line 36
    :cond_3
    invoke-static {v0, v5}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object p0

    invoke-virtual {p2, p0}, Le/f/e/s/c;->a([I)V

    goto :goto_2

    .line 37
    :cond_4
    aget p0, p0, p1

    if-ne p0, v3, :cond_5

    .line 38
    invoke-virtual {p2, v4}, Le/f/e/s/c;->a(Z)V

    add-int/lit8 p1, p1, 0x1

    :cond_5
    :goto_2
    return p1

    .line 39
    :cond_6
    invoke-static {}, Lcom/google/zxing/FormatException;->a()Lcom/google/zxing/FormatException;

    move-result-object p0

    throw p0
.end method

.method public static a([IILjava/lang/StringBuilder;)I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/FormatException;
        }
    .end annotation

    const/16 v0, 0xf

    new-array v0, v0, [I

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 85
    :goto_0
    aget v4, p0, v1

    if-ge p1, v4, :cond_6

    if-nez v2, :cond_6

    add-int/lit8 v4, p1, 0x1

    .line 86
    aget p1, p0, p1

    .line 87
    aget v5, p0, v1

    const/4 v6, 0x1

    if-ne v4, v5, :cond_0

    const/4 v2, 0x1

    :cond_0
    const/16 v5, 0x384

    if-ge p1, v5, :cond_1

    .line 88
    aput p1, v0, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    if-eq p1, v5, :cond_2

    const/16 v5, 0x385

    if-eq p1, v5, :cond_2

    const/16 v5, 0x39c

    if-eq p1, v5, :cond_2

    const/16 v5, 0x3a0

    if-eq p1, v5, :cond_2

    const/16 v5, 0x39b

    if-eq p1, v5, :cond_2

    const/16 v5, 0x39a

    if-ne p1, v5, :cond_3

    :cond_2
    add-int/lit8 v4, v4, -0x1

    const/4 v2, 0x1

    .line 89
    :cond_3
    :goto_1
    rem-int/lit8 v5, v3, 0xf

    if-eqz v5, :cond_4

    const/16 v5, 0x386

    if-eq p1, v5, :cond_4

    if-eqz v2, :cond_5

    :cond_4
    if-lez v3, :cond_5

    .line 90
    invoke-static {v0, v3}, Le/f/e/s/d/g;->a([II)Ljava/lang/String;

    move-result-object p1

    .line 91
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v3, 0x0

    :cond_5
    move p1, v4

    goto :goto_0

    :cond_6
    return p1
.end method

.method public static a([ILjava/lang/String;)Le/f/e/o/e;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/FormatException;
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    array-length v1, p0

    const/4 v2, 0x1

    shl-int/2addr v1, v2

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 2
    sget-object v1, Le/f/e/s/d/g;->c:Ljava/nio/charset/Charset;

    .line 3
    aget v2, p0, v2

    .line 4
    new-instance v3, Le/f/e/s/c;

    invoke-direct {v3}, Le/f/e/s/c;-><init>()V

    const/4 v4, 0x2

    :goto_0
    const/4 v5, 0x0

    .line 5
    aget v5, p0, v5

    if-ge v4, v5, :cond_2

    const/16 v5, 0x391

    if-eq v2, v5, :cond_0

    packed-switch v2, :pswitch_data_0

    packed-switch v2, :pswitch_data_1

    add-int/lit8 v4, v4, -0x1

    .line 6
    invoke-static {p0, v4, v0}, Le/f/e/s/d/g;->b([IILjava/lang/StringBuilder;)I

    move-result v2

    goto :goto_1

    .line 7
    :pswitch_0
    invoke-static {p0, v4, v3}, Le/f/e/s/d/g;->a([IILe/f/e/s/c;)I

    move-result v2

    goto :goto_1

    :pswitch_1
    add-int/lit8 v2, v4, 0x1

    .line 8
    aget v1, p0, v4

    .line 9
    invoke-static {v1}, Le/f/e/o/d;->a(I)Le/f/e/o/d;

    move-result-object v1

    .line 10
    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v1

    goto :goto_1

    :pswitch_2
    add-int/lit8 v2, v4, 0x2

    goto :goto_1

    :pswitch_3
    add-int/lit8 v2, v4, 0x1

    goto :goto_1

    .line 11
    :pswitch_4
    invoke-static {}, Lcom/google/zxing/FormatException;->a()Lcom/google/zxing/FormatException;

    move-result-object p0

    throw p0

    .line 12
    :pswitch_5
    invoke-static {p0, v4, v0}, Le/f/e/s/d/g;->a([IILjava/lang/StringBuilder;)I

    move-result v2

    goto :goto_1

    .line 13
    :pswitch_6
    invoke-static {v2, p0, v1, v4, v0}, Le/f/e/s/d/g;->a(I[ILjava/nio/charset/Charset;ILjava/lang/StringBuilder;)I

    move-result v2

    goto :goto_1

    .line 14
    :pswitch_7
    invoke-static {p0, v4, v0}, Le/f/e/s/d/g;->b([IILjava/lang/StringBuilder;)I

    move-result v2

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v4, 0x1

    .line 15
    aget v4, p0, v4

    int-to-char v4, v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 16
    :goto_1
    array-length v4, p0

    if-ge v2, v4, :cond_1

    add-int/lit8 v4, v2, 0x1

    .line 17
    aget v2, p0, v2

    goto :goto_0

    .line 18
    :cond_1
    invoke-static {}, Lcom/google/zxing/FormatException;->a()Lcom/google/zxing/FormatException;

    move-result-object p0

    throw p0

    .line 19
    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result p0

    if-eqz p0, :cond_3

    .line 20
    new-instance p0, Le/f/e/o/e;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p0, v1, v0, v1, p1}, Le/f/e/o/e;-><init>([BLjava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    .line 21
    invoke-virtual {p0, v3}, Le/f/e/o/e;->a(Ljava/lang/Object;)V

    return-object p0

    .line 22
    :cond_3
    invoke-static {}, Lcom/google/zxing/FormatException;->a()Lcom/google/zxing/FormatException;

    move-result-object p0

    throw p0

    :pswitch_data_0
    .packed-switch 0x384
        :pswitch_7
        :pswitch_6
        :pswitch_5
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x39a
        :pswitch_4
        :pswitch_4
        :pswitch_6
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static a([II)Ljava/lang/String;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/FormatException;
        }
    .end annotation

    .line 92
    sget-object v0, Ljava/math/BigInteger;->ZERO:Ljava/math/BigInteger;

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    const/4 v3, 0x1

    if-ge v2, p1, :cond_0

    .line 93
    sget-object v4, Le/f/e/s/d/g;->d:[Ljava/math/BigInteger;

    sub-int v5, p1, v2

    sub-int/2addr v5, v3

    aget-object v3, v4, v5

    aget v4, p0, v2

    int-to-long v4, v4

    invoke-static {v4, v5}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 94
    :cond_0
    invoke-virtual {v0}, Ljava/math/BigInteger;->toString()Ljava/lang/String;

    move-result-object p0

    .line 95
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result p1

    const/16 v0, 0x31

    if-ne p1, v0, :cond_1

    .line 96
    invoke-virtual {p0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 97
    :cond_1
    invoke-static {}, Lcom/google/zxing/FormatException;->a()Lcom/google/zxing/FormatException;

    move-result-object p0

    throw p0
.end method

.method public static a([I[IILjava/lang/StringBuilder;)V
    .locals 16

    move-object/from16 v0, p3

    .line 40
    sget-object v1, Le/f/e/s/d/f;->b:Le/f/e/s/d/f;

    const/4 v2, 0x0

    move/from16 v4, p2

    move-object v3, v1

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_1e

    .line 41
    aget v6, p0, v5

    .line 42
    sget-object v7, Le/f/e/s/d/e;->a:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v8

    aget v7, v7, v8

    const/16 v8, 0x1c

    const/16 v9, 0x1b

    const/16 v10, 0x20

    const/16 v11, 0x391

    const/16 v12, 0x384

    const/16 v13, 0x1d

    const/16 v14, 0x1a

    packed-switch v7, :pswitch_data_0

    goto/16 :goto_5

    :pswitch_0
    if-ge v6, v13, :cond_0

    .line 43
    sget-object v1, Le/f/e/s/d/g;->a:[C

    aget-char v10, v1, v6

    goto :goto_1

    :cond_0
    if-ne v6, v13, :cond_1

    .line 44
    sget-object v1, Le/f/e/s/d/f;->b:Le/f/e/s/d/f;

    goto/16 :goto_5

    :cond_1
    if-ne v6, v11, :cond_2

    .line 45
    aget v1, p1, v5

    int-to-char v1, v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_2
    if-ne v6, v12, :cond_5

    .line 46
    sget-object v1, Le/f/e/s/d/f;->b:Le/f/e/s/d/f;

    goto/16 :goto_5

    :pswitch_1
    if-ge v6, v14, :cond_3

    add-int/lit8 v6, v6, 0x41

    int-to-char v10, v6

    :goto_1
    move-object v1, v3

    goto/16 :goto_6

    :cond_3
    if-ne v6, v14, :cond_4

    goto :goto_1

    :cond_4
    if-ne v6, v12, :cond_5

    .line 47
    sget-object v1, Le/f/e/s/d/f;->b:Le/f/e/s/d/f;

    goto/16 :goto_5

    :cond_5
    :goto_2
    move-object v1, v3

    goto/16 :goto_5

    :pswitch_2
    if-ge v6, v13, :cond_6

    .line 48
    sget-object v7, Le/f/e/s/d/g;->a:[C

    aget-char v10, v7, v6

    goto/16 :goto_6

    :cond_6
    if-ne v6, v13, :cond_7

    .line 49
    sget-object v1, Le/f/e/s/d/f;->b:Le/f/e/s/d/f;

    goto/16 :goto_5

    :cond_7
    if-ne v6, v11, :cond_8

    .line 50
    aget v6, p1, v5

    int-to-char v6, v6

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto/16 :goto_5

    :cond_8
    if-ne v6, v12, :cond_1c

    .line 51
    sget-object v1, Le/f/e/s/d/f;->b:Le/f/e/s/d/f;

    goto/16 :goto_5

    :pswitch_3
    const/16 v7, 0x19

    if-ge v6, v7, :cond_9

    .line 52
    sget-object v7, Le/f/e/s/d/g;->b:[C

    aget-char v10, v7, v6

    goto/16 :goto_6

    :cond_9
    if-ne v6, v7, :cond_a

    .line 53
    sget-object v1, Le/f/e/s/d/f;->e:Le/f/e/s/d/f;

    goto/16 :goto_5

    :cond_a
    if-ne v6, v14, :cond_b

    goto/16 :goto_6

    :cond_b
    if-ne v6, v9, :cond_c

    .line 54
    sget-object v1, Le/f/e/s/d/f;->c:Le/f/e/s/d/f;

    goto/16 :goto_5

    :cond_c
    if-ne v6, v8, :cond_d

    .line 55
    sget-object v1, Le/f/e/s/d/f;->b:Le/f/e/s/d/f;

    goto/16 :goto_5

    :cond_d
    if-ne v6, v13, :cond_e

    .line 56
    sget-object v3, Le/f/e/s/d/f;->g:Le/f/e/s/d/f;

    goto :goto_3

    :cond_e
    if-ne v6, v11, :cond_f

    .line 57
    aget v6, p1, v5

    int-to-char v6, v6

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto/16 :goto_5

    :cond_f
    if-ne v6, v12, :cond_1c

    .line 58
    sget-object v1, Le/f/e/s/d/f;->b:Le/f/e/s/d/f;

    goto :goto_5

    :pswitch_4
    if-ge v6, v14, :cond_10

    add-int/lit8 v6, v6, 0x61

    goto :goto_4

    :cond_10
    if-ne v6, v14, :cond_11

    goto :goto_6

    :cond_11
    if-ne v6, v9, :cond_12

    .line 59
    sget-object v3, Le/f/e/s/d/f;->f:Le/f/e/s/d/f;

    :goto_3
    const/4 v10, 0x0

    move-object v15, v3

    move-object v3, v1

    move-object v1, v15

    goto :goto_6

    :cond_12
    if-ne v6, v8, :cond_13

    .line 60
    sget-object v1, Le/f/e/s/d/f;->d:Le/f/e/s/d/f;

    goto :goto_5

    :cond_13
    if-ne v6, v13, :cond_14

    .line 61
    sget-object v3, Le/f/e/s/d/f;->g:Le/f/e/s/d/f;

    goto :goto_3

    :cond_14
    if-ne v6, v11, :cond_15

    .line 62
    aget v6, p1, v5

    int-to-char v6, v6

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_5

    :cond_15
    if-ne v6, v12, :cond_1c

    .line 63
    sget-object v1, Le/f/e/s/d/f;->b:Le/f/e/s/d/f;

    goto :goto_5

    :pswitch_5
    if-ge v6, v14, :cond_16

    add-int/lit8 v6, v6, 0x41

    :goto_4
    int-to-char v10, v6

    goto :goto_6

    :cond_16
    if-ne v6, v14, :cond_17

    goto :goto_6

    :cond_17
    if-ne v6, v9, :cond_18

    .line 64
    sget-object v1, Le/f/e/s/d/f;->c:Le/f/e/s/d/f;

    goto :goto_5

    :cond_18
    if-ne v6, v8, :cond_19

    .line 65
    sget-object v1, Le/f/e/s/d/f;->d:Le/f/e/s/d/f;

    goto :goto_5

    :cond_19
    if-ne v6, v13, :cond_1a

    .line 66
    sget-object v3, Le/f/e/s/d/f;->g:Le/f/e/s/d/f;

    goto :goto_3

    :cond_1a
    if-ne v6, v11, :cond_1b

    .line 67
    aget v6, p1, v5

    int-to-char v6, v6

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_5

    :cond_1b
    if-ne v6, v12, :cond_1c

    .line 68
    sget-object v1, Le/f/e/s/d/f;->b:Le/f/e/s/d/f;

    :cond_1c
    :goto_5
    const/4 v10, 0x0

    :goto_6
    if-eqz v10, :cond_1d

    .line 69
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_1d
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_0

    :cond_1e
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static b([IILjava/lang/StringBuilder;)I
    .locals 9

    const/4 v0, 0x0

    .line 1
    aget v1, p0, v0

    sub-int/2addr v1, p1

    const/4 v2, 0x1

    shl-int/2addr v1, v2

    new-array v1, v1, [I

    .line 2
    aget v3, p0, v0

    sub-int/2addr v3, p1

    shl-int/2addr v3, v2

    new-array v3, v3, [I

    const/4 v4, 0x0

    const/4 v5, 0x0

    .line 3
    :goto_0
    aget v6, p0, v0

    if-ge p1, v6, :cond_3

    if-nez v4, :cond_3

    add-int/lit8 v6, p1, 0x1

    .line 4
    aget p1, p0, p1

    const/16 v7, 0x384

    if-ge p1, v7, :cond_0

    .line 5
    div-int/lit8 v7, p1, 0x1e

    aput v7, v1, v5

    add-int/lit8 v7, v5, 0x1

    .line 6
    rem-int/lit8 p1, p1, 0x1e

    aput p1, v1, v7

    add-int/lit8 v5, v5, 0x2

    :goto_1
    move p1, v6

    goto :goto_0

    :cond_0
    const/16 v8, 0x391

    if-eq p1, v8, :cond_2

    const/16 v8, 0x3a0

    if-eq p1, v8, :cond_1

    packed-switch p1, :pswitch_data_0

    packed-switch p1, :pswitch_data_1

    goto :goto_1

    :pswitch_0
    add-int/lit8 p1, v5, 0x1

    .line 7
    aput v7, v1, v5

    move v5, p1

    goto :goto_1

    :cond_1
    :pswitch_1
    add-int/lit8 p1, v6, -0x1

    const/4 v4, 0x1

    goto :goto_0

    .line 8
    :cond_2
    aput v8, v1, v5

    add-int/lit8 p1, v6, 0x1

    .line 9
    aget v6, p0, v6

    .line 10
    aput v6, v3, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 11
    :cond_3
    invoke-static {v1, v3, v5, p2}, Le/f/e/s/d/g;->a([I[IILjava/lang/StringBuilder;)V

    return p1

    :pswitch_data_0
    .packed-switch 0x384
        :pswitch_0
        :pswitch_1
        :pswitch_1
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x39a
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method
