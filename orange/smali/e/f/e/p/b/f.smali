.class public final Le/f/e/p/b/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Le/f/e/o/n/c;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Le/f/e/o/n/c;

    sget-object v1, Le/f/e/o/n/a;->m:Le/f/e/o/n/a;

    invoke-direct {v0, v1}, Le/f/e/o/n/c;-><init>(Le/f/e/o/n/a;)V

    iput-object v0, p0, Le/f/e/p/b/f;->a:Le/f/e/o/n/c;

    return-void
.end method


# virtual methods
.method public a(Le/f/e/o/b;)Le/f/e/o/e;
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/FormatException;,
            Lcom/google/zxing/ChecksumException;
        }
    .end annotation

    .line 1
    new-instance v0, Le/f/e/p/b/a;

    invoke-direct {v0, p1}, Le/f/e/p/b/a;-><init>(Le/f/e/o/b;)V

    .line 2
    invoke-virtual {v0}, Le/f/e/p/b/a;->a()Le/f/e/p/b/j;

    move-result-object p1

    .line 3
    invoke-virtual {v0}, Le/f/e/p/b/a;->b()[B

    move-result-object v0

    .line 4
    invoke-static {v0, p1}, Le/f/e/p/b/b;->a([BLe/f/e/p/b/j;)[Le/f/e/p/b/b;

    move-result-object p1

    .line 5
    array-length v0, p1

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    aget-object v4, p1, v2

    .line 6
    invoke-virtual {v4}, Le/f/e/p/b/b;->b()I

    move-result v4

    add-int/2addr v3, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 7
    :cond_0
    new-array v0, v3, [B

    .line 8
    array-length v2, p1

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v2, :cond_2

    .line 9
    aget-object v4, p1, v3

    .line 10
    invoke-virtual {v4}, Le/f/e/p/b/b;->a()[B

    move-result-object v5

    .line 11
    invoke-virtual {v4}, Le/f/e/p/b/b;->b()I

    move-result v4

    .line 12
    invoke-virtual {p0, v5, v4}, Le/f/e/p/b/f;->a([BI)V

    const/4 v6, 0x0

    :goto_2
    if-ge v6, v4, :cond_1

    mul-int v7, v6, v2

    add-int/2addr v7, v3

    .line 13
    aget-byte v8, v5, v6

    aput-byte v8, v0, v7

    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 14
    :cond_2
    invoke-static {v0}, Le/f/e/p/b/e;->a([B)Le/f/e/o/e;

    move-result-object p1

    return-object p1
.end method

.method public final a([BI)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/ChecksumException;
        }
    .end annotation

    .line 15
    array-length v0, p1

    .line 16
    new-array v1, v0, [I

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_0

    .line 17
    aget-byte v4, p1, v3

    and-int/lit16 v4, v4, 0xff

    aput v4, v1, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 18
    :cond_0
    :try_start_0
    iget-object v0, p0, Le/f/e/p/b/f;->a:Le/f/e/o/n/c;

    array-length v3, p1

    sub-int/2addr v3, p2

    invoke-virtual {v0, v1, v3}, Le/f/e/o/n/c;->a([II)V
    :try_end_0
    .catch Lcom/google/zxing/common/reedsolomon/ReedSolomonException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    if-ge v2, p2, :cond_1

    .line 19
    aget v0, v1, v2

    int-to-byte v0, v0

    aput-byte v0, p1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    return-void

    .line 20
    :catch_0
    invoke-static {}, Lcom/google/zxing/ChecksumException;->a()Lcom/google/zxing/ChecksumException;

    move-result-object p1

    throw p1
.end method
