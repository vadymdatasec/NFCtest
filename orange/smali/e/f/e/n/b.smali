.class public final Le/f/e/n/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/e/i;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Le/f/e/c;Ljava/util/Map;)Le/f/e/j;
    .locals 10
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
            Lcom/google/zxing/FormatException;
        }
    .end annotation

    .line 1
    new-instance v0, Le/f/e/n/d/b;

    invoke-virtual {p1}, Le/f/e/c;->a()Le/f/e/o/b;

    move-result-object p1

    invoke-direct {v0, p1}, Le/f/e/n/d/b;-><init>(Le/f/e/o/b;)V

    const/4 p1, 0x0

    const/4 v1, 0x0

    .line 2
    :try_start_0
    invoke-virtual {v0, p1}, Le/f/e/n/d/b;->a(Z)Le/f/e/n/a;

    move-result-object v2

    .line 3
    invoke-virtual {v2}, Le/f/e/o/g;->b()[Le/f/e/l;

    move-result-object v3
    :try_end_0
    .catch Lcom/google/zxing/NotFoundException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Lcom/google/zxing/FormatException; {:try_start_0 .. :try_end_0} :catch_2

    .line 4
    :try_start_1
    new-instance v4, Le/f/e/n/c/c;

    invoke-direct {v4}, Le/f/e/n/c/c;-><init>()V

    invoke-virtual {v4, v2}, Le/f/e/n/c/c;->a(Le/f/e/n/a;)Le/f/e/o/e;

    move-result-object v2
    :try_end_1
    .catch Lcom/google/zxing/NotFoundException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Lcom/google/zxing/FormatException; {:try_start_1 .. :try_end_1} :catch_0

    move-object v4, v3

    move-object v3, v1

    move-object v1, v2

    move-object v2, v3

    goto :goto_2

    :catch_0
    move-exception v2

    goto :goto_0

    :catch_1
    move-exception v2

    goto :goto_1

    :catch_2
    move-exception v2

    move-object v3, v1

    :goto_0
    move-object v4, v3

    move-object v3, v2

    move-object v2, v1

    goto :goto_2

    :catch_3
    move-exception v2

    move-object v3, v1

    :goto_1
    move-object v4, v3

    move-object v3, v1

    :goto_2
    if-nez v1, :cond_2

    const/4 v1, 0x1

    .line 5
    :try_start_2
    invoke-virtual {v0, v1}, Le/f/e/n/d/b;->a(Z)Le/f/e/n/a;

    move-result-object v0

    .line 6
    invoke-virtual {v0}, Le/f/e/o/g;->b()[Le/f/e/l;

    move-result-object v4

    .line 7
    new-instance v1, Le/f/e/n/c/c;

    invoke-direct {v1}, Le/f/e/n/c/c;-><init>()V

    invoke-virtual {v1, v0}, Le/f/e/n/c/c;->a(Le/f/e/n/a;)Le/f/e/o/e;

    move-result-object v1
    :try_end_2
    .catch Lcom/google/zxing/NotFoundException; {:try_start_2 .. :try_end_2} :catch_5
    .catch Lcom/google/zxing/FormatException; {:try_start_2 .. :try_end_2} :catch_4

    goto :goto_4

    :catch_4
    move-exception p1

    goto :goto_3

    :catch_5
    move-exception p1

    :goto_3
    if-nez v2, :cond_1

    if-eqz v3, :cond_0

    .line 8
    throw v3

    .line 9
    :cond_0
    throw p1

    .line 10
    :cond_1
    throw v2

    :cond_2
    :goto_4
    move-object v6, v4

    if-eqz p2, :cond_3

    .line 11
    sget-object v0, Le/f/e/d;->k:Le/f/e/d;

    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Le/f/e/m;

    if-eqz p2, :cond_3

    .line 12
    array-length v0, v6

    :goto_5
    if-ge p1, v0, :cond_3

    aget-object v2, v6, p1

    .line 13
    invoke-interface {p2, v2}, Le/f/e/m;->a(Le/f/e/l;)V

    add-int/lit8 p1, p1, 0x1

    goto :goto_5

    .line 14
    :cond_3
    new-instance p1, Le/f/e/j;

    invoke-virtual {v1}, Le/f/e/o/e;->h()Ljava/lang/String;

    move-result-object v3

    .line 15
    invoke-virtual {v1}, Le/f/e/o/e;->e()[B

    move-result-object v4

    .line 16
    invoke-virtual {v1}, Le/f/e/o/e;->c()I

    move-result v5

    sget-object v7, Le/f/e/a;->b:Le/f/e/a;

    .line 17
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    move-object v2, p1

    invoke-direct/range {v2 .. v9}, Le/f/e/j;-><init>(Ljava/lang/String;[BI[Le/f/e/l;Le/f/e/a;J)V

    .line 18
    invoke-virtual {v1}, Le/f/e/o/e;->a()Ljava/util/List;

    move-result-object p2

    if-eqz p2, :cond_4

    .line 19
    sget-object v0, Le/f/e/k;->d:Le/f/e/k;

    invoke-virtual {p1, v0, p2}, Le/f/e/j;->a(Le/f/e/k;Ljava/lang/Object;)V

    .line 20
    :cond_4
    invoke-virtual {v1}, Le/f/e/o/e;->b()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_5

    .line 21
    sget-object v0, Le/f/e/k;->e:Le/f/e/k;

    invoke-virtual {p1, v0, p2}, Le/f/e/j;->a(Le/f/e/k;Ljava/lang/Object;)V

    :cond_5
    return-object p1
.end method

.method public a()V
    .locals 0

    return-void
.end method