.class public Le/f/e/t/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/e/i;


# static fields
.field public static final b:[Le/f/e/l;


# instance fields
.field public final a:Le/f/e/t/b/m;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [Le/f/e/l;

    .line 1
    sput-object v0, Le/f/e/t/a;->b:[Le/f/e/l;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Le/f/e/t/b/m;

    invoke-direct {v0}, Le/f/e/t/b/m;-><init>()V

    iput-object v0, p0, Le/f/e/t/a;->a:Le/f/e/t/b/m;

    return-void
.end method

.method public static a([ILe/f/e/o/b;)F
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/NotFoundException;
        }
    .end annotation

    .line 42
    invoke-virtual {p1}, Le/f/e/o/b;->d()I

    move-result v0

    .line 43
    invoke-virtual {p1}, Le/f/e/o/b;->f()I

    move-result v1

    const/4 v2, 0x0

    .line 44
    aget v3, p0, v2

    const/4 v4, 0x1

    .line 45
    aget v5, p0, v4

    const/4 v6, 0x0

    :goto_0
    if-ge v3, v1, :cond_1

    if-ge v5, v0, :cond_1

    .line 46
    invoke-virtual {p1, v3, v5}, Le/f/e/o/b;->b(II)Z

    move-result v7

    if-eq v4, v7, :cond_0

    add-int/lit8 v6, v6, 0x1

    const/4 v7, 0x5

    if-eq v6, v7, :cond_1

    xor-int/lit8 v4, v4, 0x1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    if-eq v3, v1, :cond_2

    if-eq v5, v0, :cond_2

    .line 47
    aget p0, p0, v2

    sub-int/2addr v3, p0

    int-to-float p0, v3

    const/high16 p1, 0x40e00000    # 7.0f

    div-float/2addr p0, p1

    return p0

    .line 48
    :cond_2
    invoke-static {}, Lcom/google/zxing/NotFoundException;->a()Lcom/google/zxing/NotFoundException;

    move-result-object p0

    throw p0
.end method

.method public static a(Le/f/e/o/b;)Le/f/e/o/b;
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/NotFoundException;
        }
    .end annotation

    .line 22
    invoke-virtual {p0}, Le/f/e/o/b;->e()[I

    move-result-object v0

    .line 23
    invoke-virtual {p0}, Le/f/e/o/b;->a()[I

    move-result-object v1

    if-eqz v0, :cond_c

    if-eqz v1, :cond_c

    .line 24
    invoke-static {v0, p0}, Le/f/e/t/a;->a([ILe/f/e/o/b;)F

    move-result v2

    const/4 v3, 0x1

    .line 25
    aget v4, v0, v3

    .line 26
    aget v5, v1, v3

    const/4 v6, 0x0

    .line 27
    aget v0, v0, v6

    .line 28
    aget v1, v1, v6

    if-ge v0, v1, :cond_b

    if-ge v4, v5, :cond_b

    sub-int v7, v5, v4

    sub-int v8, v1, v0

    if-eq v7, v8, :cond_1

    add-int v1, v0, v7

    .line 29
    invoke-virtual {p0}, Le/f/e/o/b;->f()I

    move-result v8

    if-ge v1, v8, :cond_0

    goto :goto_0

    .line 30
    :cond_0
    invoke-static {}, Lcom/google/zxing/NotFoundException;->a()Lcom/google/zxing/NotFoundException;

    move-result-object p0

    throw p0

    :cond_1
    :goto_0
    sub-int v8, v1, v0

    add-int/2addr v8, v3

    int-to-float v8, v8

    div-float/2addr v8, v2

    .line 31
    invoke-static {v8}, Ljava/lang/Math;->round(F)I

    move-result v8

    add-int/2addr v7, v3

    int-to-float v3, v7

    div-float/2addr v3, v2

    .line 32
    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    if-lez v8, :cond_a

    if-lez v3, :cond_a

    if-ne v3, v8, :cond_9

    const/high16 v7, 0x40000000    # 2.0f

    div-float v7, v2, v7

    float-to-int v7, v7

    add-int/2addr v4, v7

    add-int/2addr v0, v7

    add-int/lit8 v9, v8, -0x1

    int-to-float v9, v9

    mul-float v9, v9, v2

    float-to-int v9, v9

    add-int/2addr v9, v0

    sub-int/2addr v9, v1

    if-lez v9, :cond_3

    if-gt v9, v7, :cond_2

    sub-int/2addr v0, v9

    goto :goto_1

    .line 33
    :cond_2
    invoke-static {}, Lcom/google/zxing/NotFoundException;->a()Lcom/google/zxing/NotFoundException;

    move-result-object p0

    throw p0

    :cond_3
    :goto_1
    add-int/lit8 v1, v3, -0x1

    int-to-float v1, v1

    mul-float v1, v1, v2

    float-to-int v1, v1

    add-int/2addr v1, v4

    sub-int/2addr v1, v5

    if-lez v1, :cond_5

    if-gt v1, v7, :cond_4

    sub-int/2addr v4, v1

    goto :goto_2

    .line 34
    :cond_4
    invoke-static {}, Lcom/google/zxing/NotFoundException;->a()Lcom/google/zxing/NotFoundException;

    move-result-object p0

    throw p0

    .line 35
    :cond_5
    :goto_2
    new-instance v1, Le/f/e/o/b;

    invoke-direct {v1, v8, v3}, Le/f/e/o/b;-><init>(II)V

    const/4 v5, 0x0

    :goto_3
    if-ge v5, v3, :cond_8

    int-to-float v7, v5

    mul-float v7, v7, v2

    float-to-int v7, v7

    add-int/2addr v7, v4

    const/4 v9, 0x0

    :goto_4
    if-ge v9, v8, :cond_7

    int-to-float v10, v9

    mul-float v10, v10, v2

    float-to-int v10, v10

    add-int/2addr v10, v0

    .line 36
    invoke-virtual {p0, v10, v7}, Le/f/e/o/b;->b(II)Z

    move-result v10

    if-eqz v10, :cond_6

    .line 37
    invoke-virtual {v1, v9, v5}, Le/f/e/o/b;->c(II)V

    :cond_6
    add-int/lit8 v9, v9, 0x1

    goto :goto_4

    :cond_7
    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    :cond_8
    return-object v1

    .line 38
    :cond_9
    invoke-static {}, Lcom/google/zxing/NotFoundException;->a()Lcom/google/zxing/NotFoundException;

    move-result-object p0

    throw p0

    .line 39
    :cond_a
    invoke-static {}, Lcom/google/zxing/NotFoundException;->a()Lcom/google/zxing/NotFoundException;

    move-result-object p0

    throw p0

    .line 40
    :cond_b
    invoke-static {}, Lcom/google/zxing/NotFoundException;->a()Lcom/google/zxing/NotFoundException;

    move-result-object p0

    throw p0

    .line 41
    :cond_c
    invoke-static {}, Lcom/google/zxing/NotFoundException;->a()Lcom/google/zxing/NotFoundException;

    move-result-object p0

    throw p0
.end method


# virtual methods
.method public final a(Le/f/e/c;Ljava/util/Map;)Le/f/e/j;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/e/c;",
            "Ljava/util/Map<",
            "Le/f/e/d;",
            "*>;)",
            "Le/f/e/j;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/NotFoundException;,
            Lcom/google/zxing/ChecksumException;,
            Lcom/google/zxing/FormatException;
        }
    .end annotation

    if-eqz p2, :cond_0

    .line 1
    sget-object v0, Le/f/e/d;->c:Le/f/e/d;

    invoke-interface {p2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p1}, Le/f/e/c;->a()Le/f/e/o/b;

    move-result-object p1

    invoke-static {p1}, Le/f/e/t/a;->a(Le/f/e/o/b;)Le/f/e/o/b;

    move-result-object p1

    .line 3
    iget-object v0, p0, Le/f/e/t/a;->a:Le/f/e/t/b/m;

    invoke-virtual {v0, p1, p2}, Le/f/e/t/b/m;->a(Le/f/e/o/b;Ljava/util/Map;)Le/f/e/o/e;

    move-result-object p1

    .line 4
    sget-object p2, Le/f/e/t/a;->b:[Le/f/e/l;

    goto :goto_0

    .line 5
    :cond_0
    new-instance v0, Le/f/e/t/c/c;

    invoke-virtual {p1}, Le/f/e/c;->a()Le/f/e/o/b;

    move-result-object p1

    invoke-direct {v0, p1}, Le/f/e/t/c/c;-><init>(Le/f/e/o/b;)V

    invoke-virtual {v0, p2}, Le/f/e/t/c/c;->a(Ljava/util/Map;)Le/f/e/o/g;

    move-result-object p1

    .line 6
    iget-object v0, p0, Le/f/e/t/a;->a:Le/f/e/t/b/m;

    invoke-virtual {p1}, Le/f/e/o/g;->a()Le/f/e/o/b;

    move-result-object v1

    invoke-virtual {v0, v1, p2}, Le/f/e/t/b/m;->a(Le/f/e/o/b;Ljava/util/Map;)Le/f/e/o/e;

    move-result-object p2

    .line 7
    invoke-virtual {p1}, Le/f/e/o/g;->b()[Le/f/e/l;

    move-result-object p1

    move-object v4, p2

    move-object p2, p1

    move-object p1, v4

    .line 8
    :goto_0
    invoke-virtual {p1}, Le/f/e/o/e;->d()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Le/f/e/t/b/q;

    if-eqz v0, :cond_1

    .line 9
    invoke-virtual {p1}, Le/f/e/o/e;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/f/e/t/b/q;

    invoke-virtual {v0, p2}, Le/f/e/t/b/q;->a([Le/f/e/l;)V

    .line 10
    :cond_1
    new-instance v0, Le/f/e/j;

    invoke-virtual {p1}, Le/f/e/o/e;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Le/f/e/o/e;->e()[B

    move-result-object v2

    sget-object v3, Le/f/e/a;->m:Le/f/e/a;

    invoke-direct {v0, v1, v2, p2, v3}, Le/f/e/j;-><init>(Ljava/lang/String;[B[Le/f/e/l;Le/f/e/a;)V

    .line 11
    invoke-virtual {p1}, Le/f/e/o/e;->a()Ljava/util/List;

    move-result-object p2

    if-eqz p2, :cond_2

    .line 12
    sget-object v1, Le/f/e/k;->d:Le/f/e/k;

    invoke-virtual {v0, v1, p2}, Le/f/e/j;->a(Le/f/e/k;Ljava/lang/Object;)V

    .line 13
    :cond_2
    invoke-virtual {p1}, Le/f/e/o/e;->b()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_3

    .line 14
    sget-object v1, Le/f/e/k;->e:Le/f/e/k;

    invoke-virtual {v0, v1, p2}, Le/f/e/j;->a(Le/f/e/k;Ljava/lang/Object;)V

    .line 15
    :cond_3
    invoke-virtual {p1}, Le/f/e/o/e;->i()Z

    move-result p2

    if-eqz p2, :cond_4

    .line 16
    sget-object p2, Le/f/e/k;->k:Le/f/e/k;

    .line 17
    invoke-virtual {p1}, Le/f/e/o/e;->g()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 18
    invoke-virtual {v0, p2, v1}, Le/f/e/j;->a(Le/f/e/k;Ljava/lang/Object;)V

    .line 19
    sget-object p2, Le/f/e/k;->l:Le/f/e/k;

    .line 20
    invoke-virtual {p1}, Le/f/e/o/e;->f()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    .line 21
    invoke-virtual {v0, p2, p1}, Le/f/e/j;->a(Le/f/e/k;Ljava/lang/Object;)V

    :cond_4
    return-object v0
.end method

.method public a()V
    .locals 0

    return-void
.end method
