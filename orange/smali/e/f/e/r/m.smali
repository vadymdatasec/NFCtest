.class public final Le/f/e/r/m;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:[I

.field public final b:Ljava/lang/StringBuilder;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x4

    new-array v0, v0, [I

    .line 2
    iput-object v0, p0, Le/f/e/r/m;->a:[I

    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v0, p0, Le/f/e/r/m;->b:Ljava/lang/StringBuilder;

    return-void
.end method

.method public static a(Ljava/lang/String;)Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Map<",
            "Le/f/e/k;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 24
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 25
    :cond_0
    new-instance v0, Ljava/util/EnumMap;

    const-class v1, Le/f/e/k;

    invoke-direct {v0, v1}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    .line 26
    sget-object v1, Le/f/e/k;->f:Le/f/e/k;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p0

    invoke-interface {v0, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method


# virtual methods
.method public final a(Le/f/e/o/a;[ILjava/lang/StringBuilder;)I
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/NotFoundException;
        }
    .end annotation

    .line 8
    iget-object v0, p0, Le/f/e/r/m;->a:[I

    const/4 v1, 0x0

    .line 9
    aput v1, v0, v1

    const/4 v2, 0x1

    .line 10
    aput v1, v0, v2

    const/4 v3, 0x2

    .line 11
    aput v1, v0, v3

    const/4 v4, 0x3

    .line 12
    aput v1, v0, v4

    .line 13
    invoke-virtual {p1}, Le/f/e/o/a;->d()I

    move-result v4

    .line 14
    aget p2, p2, v2

    const/4 v5, 0x0

    const/4 v6, 0x0

    :goto_0
    if-ge v5, v3, :cond_3

    if-ge p2, v4, :cond_3

    .line 15
    sget-object v7, Le/f/e/r/p;->g:[[I

    invoke-static {p1, v0, p2, v7}, Le/f/e/r/p;->a(Le/f/e/o/a;[II[[I)I

    move-result v7

    .line 16
    rem-int/lit8 v8, v7, 0xa

    add-int/lit8 v8, v8, 0x30

    int-to-char v8, v8

    invoke-virtual {p3, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 17
    array-length v8, v0

    const/4 v9, 0x0

    :goto_1
    if-ge v9, v8, :cond_0

    aget v10, v0, v9

    add-int/2addr p2, v10

    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    :cond_0
    const/16 v8, 0xa

    if-lt v7, v8, :cond_1

    rsub-int/lit8 v7, v5, 0x1

    shl-int v7, v2, v7

    or-int/2addr v6, v7

    :cond_1
    if-eq v5, v2, :cond_2

    .line 18
    invoke-virtual {p1, p2}, Le/f/e/o/a;->b(I)I

    move-result p2

    .line 19
    invoke-virtual {p1, p2}, Le/f/e/o/a;->c(I)I

    move-result p2

    :cond_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 20
    :cond_3
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->length()I

    move-result p1

    if-ne p1, v3, :cond_5

    .line 21
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    rem-int/lit8 p1, p1, 0x4

    if-ne p1, v6, :cond_4

    return p2

    .line 22
    :cond_4
    invoke-static {}, Lcom/google/zxing/NotFoundException;->a()Lcom/google/zxing/NotFoundException;

    move-result-object p1

    throw p1

    .line 23
    :cond_5
    invoke-static {}, Lcom/google/zxing/NotFoundException;->a()Lcom/google/zxing/NotFoundException;

    move-result-object p1

    throw p1
.end method

.method public a(ILe/f/e/o/a;[I)Le/f/e/j;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/NotFoundException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/f/e/r/m;->b:Ljava/lang/StringBuilder;

    const/4 v1, 0x0

    .line 2
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 3
    invoke-virtual {p0, p2, p3, v0}, Le/f/e/r/m;->a(Le/f/e/o/a;[ILjava/lang/StringBuilder;)I

    move-result p2

    .line 4
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 5
    invoke-static {v0}, Le/f/e/r/m;->a(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v2

    .line 6
    new-instance v3, Le/f/e/j;

    const/4 v4, 0x2

    new-array v4, v4, [Le/f/e/l;

    new-instance v5, Le/f/e/l;

    aget v6, p3, v1

    const/4 v7, 0x1

    aget p3, p3, v7

    add-int/2addr v6, p3

    int-to-float p3, v6

    const/high16 v6, 0x40000000    # 2.0f

    div-float/2addr p3, v6

    int-to-float p1, p1

    invoke-direct {v5, p3, p1}, Le/f/e/l;-><init>(FF)V

    aput-object v5, v4, v1

    new-instance p3, Le/f/e/l;

    int-to-float p2, p2

    invoke-direct {p3, p2, p1}, Le/f/e/l;-><init>(FF)V

    aput-object p3, v4, v7

    sget-object p1, Le/f/e/a;->r:Le/f/e/a;

    const/4 p2, 0x0

    invoke-direct {v3, v0, p2, v4, p1}, Le/f/e/j;-><init>(Ljava/lang/String;[B[Le/f/e/l;Le/f/e/a;)V

    if-eqz v2, :cond_0

    .line 7
    invoke-virtual {v3, v2}, Le/f/e/j;->a(Ljava/util/Map;)V

    :cond_0
    return-object v3
.end method
