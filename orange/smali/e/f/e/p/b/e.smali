.class public abstract Le/f/e/p/b/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:[C

.field public static final b:[C

.field public static final c:[C

.field public static final d:[C

.field public static final e:[C


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x28

    new-array v1, v0, [C

    .line 1
    fill-array-data v1, :array_0

    sput-object v1, Le/f/e/p/b/e;->a:[C

    const/16 v1, 0x1b

    new-array v1, v1, [C

    .line 2
    fill-array-data v1, :array_1

    sput-object v1, Le/f/e/p/b/e;->b:[C

    new-array v0, v0, [C

    .line 3
    fill-array-data v0, :array_2

    sput-object v0, Le/f/e/p/b/e;->c:[C

    .line 4
    sput-object v1, Le/f/e/p/b/e;->d:[C

    const/16 v0, 0x20

    new-array v0, v0, [C

    .line 5
    fill-array-data v0, :array_3

    sput-object v0, Le/f/e/p/b/e;->e:[C

    return-void

    nop

    :array_0
    .array-data 2
        0x2as
        0x2as
        0x2as
        0x20s
        0x30s
        0x31s
        0x32s
        0x33s
        0x34s
        0x35s
        0x36s
        0x37s
        0x38s
        0x39s
        0x41s
        0x42s
        0x43s
        0x44s
        0x45s
        0x46s
        0x47s
        0x48s
        0x49s
        0x4as
        0x4bs
        0x4cs
        0x4ds
        0x4es
        0x4fs
        0x50s
        0x51s
        0x52s
        0x53s
        0x54s
        0x55s
        0x56s
        0x57s
        0x58s
        0x59s
        0x5as
    .end array-data

    :array_1
    .array-data 2
        0x21s
        0x22s
        0x23s
        0x24s
        0x25s
        0x26s
        0x27s
        0x28s
        0x29s
        0x2as
        0x2bs
        0x2cs
        0x2ds
        0x2es
        0x2fs
        0x3as
        0x3bs
        0x3cs
        0x3ds
        0x3es
        0x3fs
        0x40s
        0x5bs
        0x5cs
        0x5ds
        0x5es
        0x5fs
    .end array-data

    nop

    :array_2
    .array-data 2
        0x2as
        0x2as
        0x2as
        0x20s
        0x30s
        0x31s
        0x32s
        0x33s
        0x34s
        0x35s
        0x36s
        0x37s
        0x38s
        0x39s
        0x61s
        0x62s
        0x63s
        0x64s
        0x65s
        0x66s
        0x67s
        0x68s
        0x69s
        0x6as
        0x6bs
        0x6cs
        0x6ds
        0x6es
        0x6fs
        0x70s
        0x71s
        0x72s
        0x73s
        0x74s
        0x75s
        0x76s
        0x77s
        0x78s
        0x79s
        0x7as
    .end array-data

    :array_3
    .array-data 2
        0x60s
        0x41s
        0x42s
        0x43s
        0x44s
        0x45s
        0x46s
        0x47s
        0x48s
        0x49s
        0x4as
        0x4bs
        0x4cs
        0x4ds
        0x4es
        0x4fs
        0x50s
        0x51s
        0x52s
        0x53s
        0x54s
        0x55s
        0x56s
        0x57s
        0x58s
        0x59s
        0x5as
        0x7bs
        0x7cs
        0x7ds
        0x7es
        0x7fs
    .end array-data
.end method

.method public static a(II)I
    .locals 0

    mul-int/lit16 p1, p1, 0x95

    .line 70
    rem-int/lit16 p1, p1, 0xff

    add-int/lit8 p1, p1, 0x1

    sub-int/2addr p0, p1

    if-ltz p0, :cond_0

    return p0

    :cond_0
    add-int/lit16 p0, p0, 0x100

    return p0
.end method

.method public static a([B)Le/f/e/o/e;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/FormatException;
        }
    .end annotation

    .line 1
    new-instance v0, Le/f/e/o/c;

    invoke-direct {v0, p0}, Le/f/e/o/c;-><init>([B)V

    .line 2
    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v2, 0x64

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 3
    new-instance v2, Ljava/lang/StringBuilder;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 4
    new-instance v3, Ljava/util/ArrayList;

    const/4 v4, 0x1

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 5
    sget-object v5, Le/f/e/p/b/d;->c:Le/f/e/p/b/d;

    .line 6
    :cond_0
    sget-object v6, Le/f/e/p/b/d;->c:Le/f/e/p/b/d;

    if-ne v5, v6, :cond_1

    .line 7
    invoke-static {v0, v1, v2}, Le/f/e/p/b/e;->a(Le/f/e/o/c;Ljava/lang/StringBuilder;Ljava/lang/StringBuilder;)Le/f/e/p/b/d;

    move-result-object v5

    goto :goto_1

    .line 8
    :cond_1
    sget-object v6, Le/f/e/p/b/c;->a:[I

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aget v5, v6, v5

    if-eq v5, v4, :cond_6

    const/4 v6, 0x2

    if-eq v5, v6, :cond_5

    const/4 v6, 0x3

    if-eq v5, v6, :cond_4

    const/4 v6, 0x4

    if-eq v5, v6, :cond_3

    const/4 v6, 0x5

    if-ne v5, v6, :cond_2

    .line 9
    invoke-static {v0, v1, v3}, Le/f/e/p/b/e;->a(Le/f/e/o/c;Ljava/lang/StringBuilder;Ljava/util/Collection;)V

    goto :goto_0

    .line 10
    :cond_2
    invoke-static {}, Lcom/google/zxing/FormatException;->a()Lcom/google/zxing/FormatException;

    move-result-object p0

    throw p0

    .line 11
    :cond_3
    invoke-static {v0, v1}, Le/f/e/p/b/e;->c(Le/f/e/o/c;Ljava/lang/StringBuilder;)V

    goto :goto_0

    .line 12
    :cond_4
    invoke-static {v0, v1}, Le/f/e/p/b/e;->a(Le/f/e/o/c;Ljava/lang/StringBuilder;)V

    goto :goto_0

    .line 13
    :cond_5
    invoke-static {v0, v1}, Le/f/e/p/b/e;->d(Le/f/e/o/c;Ljava/lang/StringBuilder;)V

    goto :goto_0

    .line 14
    :cond_6
    invoke-static {v0, v1}, Le/f/e/p/b/e;->b(Le/f/e/o/c;Ljava/lang/StringBuilder;)V

    .line 15
    :goto_0
    sget-object v5, Le/f/e/p/b/d;->c:Le/f/e/p/b/d;

    .line 16
    :goto_1
    sget-object v6, Le/f/e/p/b/d;->b:Le/f/e/p/b/d;

    if-eq v5, v6, :cond_7

    invoke-virtual {v0}, Le/f/e/o/c;->a()I

    move-result v6

    if-gtz v6, :cond_0

    .line 17
    :cond_7
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    if-lez v0, :cond_8

    .line 18
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 19
    :cond_8
    new-instance v0, Le/f/e/o/e;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v2

    const/4 v4, 0x0

    if-eqz v2, :cond_9

    move-object v3, v4

    :cond_9
    invoke-direct {v0, p0, v1, v3, v4}, Le/f/e/o/e;-><init>([BLjava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    return-object v0
.end method

.method public static a(Le/f/e/o/c;Ljava/lang/StringBuilder;Ljava/lang/StringBuilder;)Le/f/e/p/b/d;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/FormatException;
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x0

    :cond_0
    const/16 v2, 0x8

    .line 20
    invoke-virtual {p0, v2}, Le/f/e/o/c;->a(I)I

    move-result v2

    if-eqz v2, :cond_11

    const/4 v3, 0x1

    const/16 v4, 0x80

    if-gt v2, v4, :cond_2

    if-eqz v1, :cond_1

    add-int/lit16 v2, v2, 0x80

    :cond_1
    sub-int/2addr v2, v3

    int-to-char p0, v2

    .line 21
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 22
    sget-object p0, Le/f/e/p/b/d;->c:Le/f/e/p/b/d;

    return-object p0

    :cond_2
    const/16 v4, 0x81

    if-ne v2, v4, :cond_3

    .line 23
    sget-object p0, Le/f/e/p/b/d;->b:Le/f/e/p/b/d;

    return-object p0

    :cond_3
    const/16 v4, 0xe5

    if-gt v2, v4, :cond_5

    add-int/lit16 v2, v2, -0x82

    const/16 v3, 0xa

    if-ge v2, v3, :cond_4

    const/16 v3, 0x30

    .line 24
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 25
    :cond_4
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    goto/16 :goto_0

    :cond_5
    const/16 v4, 0xe6

    if-ne v2, v4, :cond_6

    .line 26
    sget-object p0, Le/f/e/p/b/d;->d:Le/f/e/p/b/d;

    return-object p0

    :cond_6
    const/16 v4, 0xe7

    if-ne v2, v4, :cond_7

    .line 27
    sget-object p0, Le/f/e/p/b/d;->h:Le/f/e/p/b/d;

    return-object p0

    :cond_7
    const/16 v4, 0xe8

    if-ne v2, v4, :cond_8

    const/16 v2, 0x1d

    .line 28
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_8
    const/16 v4, 0xe9

    if-eq v2, v4, :cond_10

    const/16 v4, 0xea

    if-eq v2, v4, :cond_10

    const/16 v4, 0xeb

    if-ne v2, v4, :cond_9

    const/4 v1, 0x1

    goto :goto_0

    :cond_9
    const/16 v3, 0xec

    const-string v4, "\u001e\u0004"

    if-ne v2, v3, :cond_a

    const-string v2, "[)>\u001e05\u001d"

    .line 29
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    invoke-virtual {p2, v0, v4}, Ljava/lang/StringBuilder;->insert(ILjava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_a
    const/16 v3, 0xed

    if-ne v2, v3, :cond_b

    const-string v2, "[)>\u001e06\u001d"

    .line 31
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    invoke-virtual {p2, v0, v4}, Ljava/lang/StringBuilder;->insert(ILjava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_b
    const/16 v3, 0xee

    if-ne v2, v3, :cond_c

    .line 33
    sget-object p0, Le/f/e/p/b/d;->f:Le/f/e/p/b/d;

    return-object p0

    :cond_c
    const/16 v3, 0xef

    if-ne v2, v3, :cond_d

    .line 34
    sget-object p0, Le/f/e/p/b/d;->e:Le/f/e/p/b/d;

    return-object p0

    :cond_d
    const/16 v3, 0xf0

    if-ne v2, v3, :cond_e

    .line 35
    sget-object p0, Le/f/e/p/b/d;->g:Le/f/e/p/b/d;

    return-object p0

    :cond_e
    const/16 v3, 0xf1

    if-eq v2, v3, :cond_10

    const/16 v3, 0xf2

    if-lt v2, v3, :cond_10

    const/16 v3, 0xfe

    if-ne v2, v3, :cond_f

    .line 36
    invoke-virtual {p0}, Le/f/e/o/c;->a()I

    move-result v2

    if-nez v2, :cond_f

    goto :goto_0

    .line 37
    :cond_f
    invoke-static {}, Lcom/google/zxing/FormatException;->a()Lcom/google/zxing/FormatException;

    move-result-object p0

    throw p0

    .line 38
    :cond_10
    :goto_0
    invoke-virtual {p0}, Le/f/e/o/c;->a()I

    move-result v2

    if-gtz v2, :cond_0

    .line 39
    sget-object p0, Le/f/e/p/b/d;->c:Le/f/e/p/b/d;

    return-object p0

    .line 40
    :cond_11
    invoke-static {}, Lcom/google/zxing/FormatException;->a()Lcom/google/zxing/FormatException;

    move-result-object p0

    throw p0
.end method

.method public static a(II[I)V
    .locals 2

    shl-int/lit8 p0, p0, 0x8

    add-int/2addr p0, p1

    const/4 p1, 0x1

    sub-int/2addr p0, p1

    .line 53
    div-int/lit16 v0, p0, 0x640

    const/4 v1, 0x0

    .line 54
    aput v0, p2, v1

    mul-int/lit16 v0, v0, 0x640

    sub-int/2addr p0, v0

    .line 55
    div-int/lit8 v0, p0, 0x28

    .line 56
    aput v0, p2, p1

    mul-int/lit8 v0, v0, 0x28

    sub-int/2addr p0, v0

    const/4 p1, 0x2

    .line 57
    aput p0, p2, p1

    return-void
.end method

.method public static a(Le/f/e/o/c;Ljava/lang/StringBuilder;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/FormatException;
        }
    .end annotation

    const/4 v0, 0x3

    new-array v1, v0, [I

    .line 41
    :cond_0
    invoke-virtual {p0}, Le/f/e/o/c;->a()I

    move-result v2

    const/16 v3, 0x8

    if-ne v2, v3, :cond_1

    return-void

    .line 42
    :cond_1
    invoke-virtual {p0, v3}, Le/f/e/o/c;->a(I)I

    move-result v2

    const/16 v4, 0xfe

    if-ne v2, v4, :cond_2

    return-void

    .line 43
    :cond_2
    invoke-virtual {p0, v3}, Le/f/e/o/c;->a(I)I

    move-result v3

    invoke-static {v2, v3, v1}, Le/f/e/p/b/e;->a(II[I)V

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_9

    .line 44
    aget v3, v1, v2

    if-nez v3, :cond_3

    const/16 v3, 0xd

    .line 45
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_3
    const/4 v4, 0x1

    if-ne v3, v4, :cond_4

    const/16 v3, 0x2a

    .line 46
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_4
    const/4 v4, 0x2

    if-ne v3, v4, :cond_5

    const/16 v3, 0x3e

    .line 47
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_5
    if-ne v3, v0, :cond_6

    const/16 v3, 0x20

    .line 48
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_6
    const/16 v4, 0xe

    if-ge v3, v4, :cond_7

    add-int/lit8 v3, v3, 0x2c

    int-to-char v3, v3

    .line 49
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_7
    const/16 v4, 0x28

    if-ge v3, v4, :cond_8

    add-int/lit8 v3, v3, 0x33

    int-to-char v3, v3

    .line 50
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 51
    :cond_8
    invoke-static {}, Lcom/google/zxing/FormatException;->a()Lcom/google/zxing/FormatException;

    move-result-object p0

    throw p0

    .line 52
    :cond_9
    invoke-virtual {p0}, Le/f/e/o/c;->a()I

    move-result v2

    if-gtz v2, :cond_0

    return-void
.end method

.method public static a(Le/f/e/o/c;Ljava/lang/StringBuilder;Ljava/util/Collection;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/e/o/c;",
            "Ljava/lang/StringBuilder;",
            "Ljava/util/Collection<",
            "[B>;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/FormatException;
        }
    .end annotation

    .line 58
    invoke-virtual {p0}, Le/f/e/o/c;->c()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    const/16 v1, 0x8

    .line 59
    invoke-virtual {p0, v1}, Le/f/e/o/c;->a(I)I

    move-result v2

    add-int/lit8 v3, v0, 0x1

    invoke-static {v2, v0}, Le/f/e/p/b/e;->a(II)I

    move-result v0

    if-nez v0, :cond_0

    .line 60
    invoke-virtual {p0}, Le/f/e/o/c;->a()I

    move-result v0

    div-int/2addr v0, v1

    goto :goto_0

    :cond_0
    const/16 v2, 0xfa

    if-ge v0, v2, :cond_1

    goto :goto_0

    :cond_1
    add-int/lit16 v0, v0, -0xf9

    mul-int/lit16 v0, v0, 0xfa

    .line 61
    invoke-virtual {p0, v1}, Le/f/e/o/c;->a(I)I

    move-result v2

    add-int/lit8 v4, v3, 0x1

    invoke-static {v2, v3}, Le/f/e/p/b/e;->a(II)I

    move-result v2

    add-int/2addr v0, v2

    move v3, v4

    :goto_0
    if-ltz v0, :cond_4

    .line 62
    new-array v2, v0, [B

    const/4 v4, 0x0

    :goto_1
    if-ge v4, v0, :cond_3

    .line 63
    invoke-virtual {p0}, Le/f/e/o/c;->a()I

    move-result v5

    if-lt v5, v1, :cond_2

    .line 64
    invoke-virtual {p0, v1}, Le/f/e/o/c;->a(I)I

    move-result v5

    add-int/lit8 v6, v3, 0x1

    invoke-static {v5, v3}, Le/f/e/p/b/e;->a(II)I

    move-result v3

    int-to-byte v3, v3

    aput-byte v3, v2, v4

    add-int/lit8 v4, v4, 0x1

    move v3, v6

    goto :goto_1

    .line 65
    :cond_2
    invoke-static {}, Lcom/google/zxing/FormatException;->a()Lcom/google/zxing/FormatException;

    move-result-object p0

    throw p0

    .line 66
    :cond_3
    invoke-interface {p2, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 67
    :try_start_0
    new-instance p0, Ljava/lang/String;

    const-string p2, "ISO8859_1"

    invoke-direct {p0, v2, p2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    .line 68
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Platform does not support required encoding: "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 69
    :cond_4
    invoke-static {}, Lcom/google/zxing/FormatException;->a()Lcom/google/zxing/FormatException;

    move-result-object p0

    throw p0
.end method

.method public static b(Le/f/e/o/c;Ljava/lang/StringBuilder;)V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/FormatException;
        }
    .end annotation

    const/4 v0, 0x3

    new-array v1, v0, [I

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 1
    :cond_0
    invoke-virtual {p0}, Le/f/e/o/c;->a()I

    move-result v5

    const/16 v6, 0x8

    if-ne v5, v6, :cond_1

    return-void

    .line 2
    :cond_1
    invoke-virtual {p0, v6}, Le/f/e/o/c;->a(I)I

    move-result v5

    const/16 v7, 0xfe

    if-ne v5, v7, :cond_2

    return-void

    .line 3
    :cond_2
    invoke-virtual {p0, v6}, Le/f/e/o/c;->a(I)I

    move-result v6

    invoke-static {v5, v6, v1}, Le/f/e/p/b/e;->a(II[I)V

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v0, :cond_10

    .line 4
    aget v6, v1, v5

    if-eqz v4, :cond_c

    const/4 v7, 0x1

    if-eq v4, v7, :cond_a

    const/4 v8, 0x2

    if-eq v4, v8, :cond_5

    if-ne v4, v0, :cond_4

    if-eqz v3, :cond_3

    add-int/lit16 v6, v6, 0xe0

    int-to-char v3, v6

    .line 5
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_3
    add-int/lit8 v6, v6, 0x60

    int-to-char v4, v6

    .line 6
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 7
    :cond_4
    invoke-static {}, Lcom/google/zxing/FormatException;->a()Lcom/google/zxing/FormatException;

    move-result-object p0

    throw p0

    .line 8
    :cond_5
    sget-object v4, Le/f/e/p/b/e;->b:[C

    array-length v8, v4

    if-ge v6, v8, :cond_7

    .line 9
    aget-char v4, v4, v6

    if-eqz v3, :cond_6

    add-int/lit16 v4, v4, 0x80

    int-to-char v3, v4

    .line 10
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 11
    :cond_6
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_7
    const/16 v4, 0x1b

    if-ne v6, v4, :cond_8

    const/16 v4, 0x1d

    .line 12
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_8
    const/16 v3, 0x1e

    if-ne v6, v3, :cond_9

    const/4 v3, 0x1

    goto :goto_2

    .line 13
    :cond_9
    invoke-static {}, Lcom/google/zxing/FormatException;->a()Lcom/google/zxing/FormatException;

    move-result-object p0

    throw p0

    :cond_a
    if-eqz v3, :cond_b

    add-int/lit16 v6, v6, 0x80

    int-to-char v3, v6

    .line 14
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_1
    const/4 v3, 0x0

    goto :goto_2

    :cond_b
    int-to-char v4, v6

    .line 15
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_2
    const/4 v4, 0x0

    goto :goto_3

    :cond_c
    if-ge v6, v0, :cond_d

    add-int/lit8 v6, v6, 0x1

    move v4, v6

    goto :goto_3

    .line 16
    :cond_d
    sget-object v7, Le/f/e/p/b/e;->a:[C

    array-length v8, v7

    if-ge v6, v8, :cond_f

    .line 17
    aget-char v6, v7, v6

    if-eqz v3, :cond_e

    add-int/lit16 v6, v6, 0x80

    int-to-char v3, v6

    .line 18
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/4 v3, 0x0

    goto :goto_3

    .line 19
    :cond_e
    invoke-virtual {p1, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 20
    :cond_f
    invoke-static {}, Lcom/google/zxing/FormatException;->a()Lcom/google/zxing/FormatException;

    move-result-object p0

    throw p0

    .line 21
    :cond_10
    invoke-virtual {p0}, Le/f/e/o/c;->a()I

    move-result v5

    if-gtz v5, :cond_0

    return-void
.end method

.method public static c(Le/f/e/o/c;Ljava/lang/StringBuilder;)V
    .locals 3

    .line 1
    :cond_0
    invoke-virtual {p0}, Le/f/e/o/c;->a()I

    move-result v0

    const/16 v1, 0x10

    if-gt v0, v1, :cond_1

    return-void

    :cond_1
    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x4

    if-ge v0, v1, :cond_5

    const/4 v1, 0x6

    .line 2
    invoke-virtual {p0, v1}, Le/f/e/o/c;->a(I)I

    move-result v1

    const/16 v2, 0x1f

    if-ne v1, v2, :cond_3

    .line 3
    invoke-virtual {p0}, Le/f/e/o/c;->b()I

    move-result p1

    const/16 v0, 0x8

    rsub-int/lit8 p1, p1, 0x8

    if-eq p1, v0, :cond_2

    .line 4
    invoke-virtual {p0, p1}, Le/f/e/o/c;->a(I)I

    :cond_2
    return-void

    :cond_3
    and-int/lit8 v2, v1, 0x20

    if-nez v2, :cond_4

    or-int/lit8 v1, v1, 0x40

    :cond_4
    int-to-char v1, v1

    .line 5
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 6
    :cond_5
    invoke-virtual {p0}, Le/f/e/o/c;->a()I

    move-result v0

    if-gtz v0, :cond_0

    return-void
.end method

.method public static d(Le/f/e/o/c;Ljava/lang/StringBuilder;)V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/FormatException;
        }
    .end annotation

    const/4 v0, 0x3

    new-array v1, v0, [I

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 1
    :cond_0
    invoke-virtual {p0}, Le/f/e/o/c;->a()I

    move-result v5

    const/16 v6, 0x8

    if-ne v5, v6, :cond_1

    return-void

    .line 2
    :cond_1
    invoke-virtual {p0, v6}, Le/f/e/o/c;->a(I)I

    move-result v5

    const/16 v7, 0xfe

    if-ne v5, v7, :cond_2

    return-void

    .line 3
    :cond_2
    invoke-virtual {p0, v6}, Le/f/e/o/c;->a(I)I

    move-result v6

    invoke-static {v5, v6, v1}, Le/f/e/p/b/e;->a(II[I)V

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v0, :cond_11

    .line 4
    aget v6, v1, v5

    if-eqz v4, :cond_d

    const/4 v7, 0x1

    if-eq v4, v7, :cond_b

    const/4 v8, 0x2

    if-eq v4, v8, :cond_6

    if-ne v4, v0, :cond_5

    .line 5
    sget-object v4, Le/f/e/p/b/e;->e:[C

    array-length v7, v4

    if-ge v6, v7, :cond_4

    .line 6
    aget-char v4, v4, v6

    if-eqz v3, :cond_3

    add-int/lit16 v4, v4, 0x80

    int-to-char v3, v4

    .line 7
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 8
    :cond_3
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 9
    :cond_4
    invoke-static {}, Lcom/google/zxing/FormatException;->a()Lcom/google/zxing/FormatException;

    move-result-object p0

    throw p0

    .line 10
    :cond_5
    invoke-static {}, Lcom/google/zxing/FormatException;->a()Lcom/google/zxing/FormatException;

    move-result-object p0

    throw p0

    .line 11
    :cond_6
    sget-object v4, Le/f/e/p/b/e;->d:[C

    array-length v8, v4

    if-ge v6, v8, :cond_8

    .line 12
    aget-char v4, v4, v6

    if-eqz v3, :cond_7

    add-int/lit16 v4, v4, 0x80

    int-to-char v3, v4

    .line 13
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 14
    :cond_7
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_8
    const/16 v4, 0x1b

    if-ne v6, v4, :cond_9

    const/16 v4, 0x1d

    .line 15
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_9
    const/16 v3, 0x1e

    if-ne v6, v3, :cond_a

    const/4 v3, 0x1

    goto :goto_2

    .line 16
    :cond_a
    invoke-static {}, Lcom/google/zxing/FormatException;->a()Lcom/google/zxing/FormatException;

    move-result-object p0

    throw p0

    :cond_b
    if-eqz v3, :cond_c

    add-int/lit16 v6, v6, 0x80

    int-to-char v3, v6

    .line 17
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_1
    const/4 v3, 0x0

    goto :goto_2

    :cond_c
    int-to-char v4, v6

    .line 18
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_2
    const/4 v4, 0x0

    goto :goto_3

    :cond_d
    if-ge v6, v0, :cond_e

    add-int/lit8 v6, v6, 0x1

    move v4, v6

    goto :goto_3

    .line 19
    :cond_e
    sget-object v7, Le/f/e/p/b/e;->c:[C

    array-length v8, v7

    if-ge v6, v8, :cond_10

    .line 20
    aget-char v6, v7, v6

    if-eqz v3, :cond_f

    add-int/lit16 v6, v6, 0x80

    int-to-char v3, v6

    .line 21
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/4 v3, 0x0

    goto :goto_3

    .line 22
    :cond_f
    invoke-virtual {p1, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_3
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_0

    .line 23
    :cond_10
    invoke-static {}, Lcom/google/zxing/FormatException;->a()Lcom/google/zxing/FormatException;

    move-result-object p0

    throw p0

    .line 24
    :cond_11
    invoke-virtual {p0}, Le/f/e/o/c;->a()I

    move-result v5

    if-gtz v5, :cond_0

    return-void
.end method
