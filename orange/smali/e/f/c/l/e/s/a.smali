.class public final Le/f/c/l/e/s/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:[B

.field public volatile b:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Le/f/c/l/e/s/a;

    const/4 v1, 0x0

    new-array v1, v1, [B

    invoke-direct {v0, v1}, Le/f/c/l/e/s/a;-><init>([B)V

    return-void
.end method

.method public constructor <init>([B)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Le/f/c/l/e/s/a;->b:I

    .line 3
    iput-object p1, p0, Le/f/c/l/e/s/a;->a:[B

    return-void
.end method

.method public static a(Ljava/lang/String;)Le/f/c/l/e/s/a;
    .locals 2

    .line 5
    :try_start_0
    new-instance v0, Le/f/c/l/e/s/a;

    const-string v1, "UTF-8"

    invoke-virtual {p0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p0

    invoke-direct {v0, p0}, Le/f/c/l/e/s/a;-><init>([B)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p0

    .line 6
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "UTF-8 not supported."

    invoke-direct {v0, v1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static a([B)Le/f/c/l/e/s/a;
    .locals 2

    .line 4
    array-length v0, p0

    const/4 v1, 0x0

    invoke-static {p0, v1, v0}, Le/f/c/l/e/s/a;->a([BII)Le/f/c/l/e/s/a;

    move-result-object p0

    return-object p0
.end method

.method public static a([BII)Le/f/c/l/e/s/a;
    .locals 2

    .line 1
    new-array v0, p2, [B

    const/4 v1, 0x0

    .line 2
    invoke-static {p0, p1, v0, v1, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 3
    new-instance p0, Le/f/c/l/e/s/a;

    invoke-direct {p0, v0}, Le/f/c/l/e/s/a;-><init>([B)V

    return-object p0
.end method


# virtual methods
.method public a()Ljava/io/InputStream;
    .locals 2

    .line 8
    new-instance v0, Ljava/io/ByteArrayInputStream;

    iget-object v1, p0, Le/f/c/l/e/s/a;->a:[B

    invoke-direct {v0, v1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    return-object v0
.end method

.method public a([BIII)V
    .locals 1

    .line 7
    iget-object v0, p0, Le/f/c/l/e/s/a;->a:[B

    invoke-static {v0, p2, p1, p3, p4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void
.end method

.method public b()I
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/c/l/e/s/a;->a:[B

    array-length v0, v0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 1
    :cond_0
    instance-of v1, p1, Le/f/c/l/e/s/a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 2
    :cond_1
    check-cast p1, Le/f/c/l/e/s/a;

    .line 3
    iget-object v1, p0, Le/f/c/l/e/s/a;->a:[B

    array-length v3, v1

    .line 4
    iget-object p1, p1, Le/f/c/l/e/s/a;->a:[B

    array-length v4, p1

    if-eq v3, v4, :cond_2

    return v2

    :cond_2
    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_4

    .line 5
    aget-byte v5, v1, v4

    aget-byte v6, p1, v4

    if-eq v5, v6, :cond_3

    return v2

    :cond_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 5

    .line 1
    iget v0, p0, Le/f/c/l/e/s/a;->b:I

    if-nez v0, :cond_2

    .line 2
    iget-object v0, p0, Le/f/c/l/e/s/a;->a:[B

    .line 3
    array-length v1, v0

    const/4 v2, 0x0

    move v3, v1

    :goto_0
    if-ge v2, v1, :cond_0

    mul-int/lit8 v3, v3, 0x1f

    .line 4
    aget-byte v4, v0, v2

    add-int/2addr v3, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    if-nez v3, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    move v0, v3

    .line 5
    :goto_1
    iput v0, p0, Le/f/c/l/e/s/a;->b:I

    :cond_2
    return v0
.end method
