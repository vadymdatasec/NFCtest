.class public final Le/f/e/t/b/m;
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

    sget-object v1, Le/f/e/o/n/a;->l:Le/f/e/o/n/a;

    invoke-direct {v0, v1}, Le/f/e/o/n/c;-><init>(Le/f/e/o/n/a;)V

    iput-object v0, p0, Le/f/e/t/b/m;->a:Le/f/e/o/n/c;

    return-void
.end method


# virtual methods
.method public a(Le/f/e/o/b;Ljava/util/Map;)Le/f/e/o/e;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/e/o/b;",
            "Ljava/util/Map<",
            "Le/f/e/d;",
            "*>;)",
            "Le/f/e/o/e;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/FormatException;,
            Lcom/google/zxing/ChecksumException;
        }
    .end annotation

    .line 1
    new-instance v0, Le/f/e/t/b/a;

    invoke-direct {v0, p1}, Le/f/e/t/b/a;-><init>(Le/f/e/o/b;)V

    const/4 p1, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p0, v0, p2}, Le/f/e/t/b/m;->a(Le/f/e/t/b/a;Ljava/util/Map;)Le/f/e/o/e;

    move-result-object p1
    :try_end_0
    .catch Lcom/google/zxing/FormatException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lcom/google/zxing/ChecksumException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception v1

    goto :goto_0

    :catch_1
    move-exception v1

    move-object v3, v1

    move-object v1, p1

    move-object p1, v3

    .line 3
    :goto_0
    :try_start_1
    invoke-virtual {v0}, Le/f/e/t/b/a;->e()V

    const/4 v2, 0x1

    .line 4
    invoke-virtual {v0, v2}, Le/f/e/t/b/a;->a(Z)V

    .line 5
    invoke-virtual {v0}, Le/f/e/t/b/a;->d()Le/f/e/t/b/t;

    .line 6
    invoke-virtual {v0}, Le/f/e/t/b/a;->c()Le/f/e/t/b/o;

    .line 7
    invoke-virtual {v0}, Le/f/e/t/b/a;->a()V

    .line 8
    invoke-virtual {p0, v0, p2}, Le/f/e/t/b/m;->a(Le/f/e/t/b/a;Ljava/util/Map;)Le/f/e/o/e;

    move-result-object p2

    .line 9
    new-instance v0, Le/f/e/t/b/q;

    invoke-direct {v0, v2}, Le/f/e/t/b/q;-><init>(Z)V

    invoke-virtual {p2, v0}, Le/f/e/o/e;->a(Ljava/lang/Object;)V
    :try_end_1
    .catch Lcom/google/zxing/FormatException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Lcom/google/zxing/ChecksumException; {:try_start_1 .. :try_end_1} :catch_2

    return-object p2

    :catch_2
    move-exception p2

    goto :goto_1

    :catch_3
    move-exception p2

    :goto_1
    if-nez p1, :cond_1

    if-eqz v1, :cond_0

    .line 10
    throw v1

    .line 11
    :cond_0
    throw p2

    .line 12
    :cond_1
    throw p1
.end method

.method public final a(Le/f/e/t/b/a;Ljava/util/Map;)Le/f/e/o/e;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/e/t/b/a;",
            "Ljava/util/Map<",
            "Le/f/e/d;",
            "*>;)",
            "Le/f/e/o/e;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/FormatException;,
            Lcom/google/zxing/ChecksumException;
        }
    .end annotation

    .line 13
    invoke-virtual {p1}, Le/f/e/t/b/a;->d()Le/f/e/t/b/t;

    move-result-object v0

    .line 14
    invoke-virtual {p1}, Le/f/e/t/b/a;->c()Le/f/e/t/b/o;

    move-result-object v1

    invoke-virtual {v1}, Le/f/e/t/b/o;->b()Le/f/e/t/b/n;

    move-result-object v1

    .line 15
    invoke-virtual {p1}, Le/f/e/t/b/a;->b()[B

    move-result-object p1

    .line 16
    invoke-static {p1, v0, v1}, Le/f/e/t/b/b;->a([BLe/f/e/t/b/t;Le/f/e/t/b/n;)[Le/f/e/t/b/b;

    move-result-object p1

    .line 17
    array-length v2, p1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    if-ge v4, v2, :cond_0

    aget-object v6, p1, v4

    .line 18
    invoke-virtual {v6}, Le/f/e/t/b/b;->b()I

    move-result v6

    add-int/2addr v5, v6

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 19
    :cond_0
    new-array v2, v5, [B

    .line 20
    array-length v4, p1

    const/4 v5, 0x0

    const/4 v6, 0x0

    :goto_1
    if-ge v5, v4, :cond_2

    aget-object v7, p1, v5

    .line 21
    invoke-virtual {v7}, Le/f/e/t/b/b;->a()[B

    move-result-object v8

    .line 22
    invoke-virtual {v7}, Le/f/e/t/b/b;->b()I

    move-result v7

    .line 23
    invoke-virtual {p0, v8, v7}, Le/f/e/t/b/m;->a([BI)V

    const/4 v9, 0x0

    :goto_2
    if-ge v9, v7, :cond_1

    add-int/lit8 v10, v6, 0x1

    .line 24
    aget-byte v11, v8, v9

    aput-byte v11, v2, v6

    add-int/lit8 v9, v9, 0x1

    move v6, v10

    goto :goto_2

    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 25
    :cond_2
    invoke-static {v2, v0, v1, p2}, Le/f/e/t/b/l;->a([BLe/f/e/t/b/t;Le/f/e/t/b/n;Ljava/util/Map;)Le/f/e/o/e;

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

    .line 26
    array-length v0, p1

    .line 27
    new-array v1, v0, [I

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_0

    .line 28
    aget-byte v4, p1, v3

    and-int/lit16 v4, v4, 0xff

    aput v4, v1, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 29
    :cond_0
    :try_start_0
    iget-object v0, p0, Le/f/e/t/b/m;->a:Le/f/e/o/n/c;

    array-length v3, p1

    sub-int/2addr v3, p2

    invoke-virtual {v0, v1, v3}, Le/f/e/o/n/c;->a([II)V
    :try_end_0
    .catch Lcom/google/zxing/common/reedsolomon/ReedSolomonException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    if-ge v2, p2, :cond_1

    .line 30
    aget v0, v1, v2

    int-to-byte v0, v0

    aput-byte v0, p1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    return-void

    .line 31
    :catch_0
    invoke-static {}, Lcom/google/zxing/ChecksumException;->a()Lcom/google/zxing/ChecksumException;

    move-result-object p1

    throw p1
.end method
