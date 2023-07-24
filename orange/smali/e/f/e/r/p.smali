.class public abstract Le/f/e/r/p;
.super Le/f/e/r/k;
.source "SourceFile"


# static fields
.field public static final d:[I

.field public static final e:[I

.field public static final f:[[I

.field public static final g:[[I


# instance fields
.field public final a:Ljava/lang/StringBuilder;

.field public final b:Le/f/e/r/o;

.field public final c:Le/f/e/r/g;


# direct methods
.method public static constructor <clinit>()V
    .locals 9

    const/4 v0, 0x3

    new-array v1, v0, [I

    .line 1
    fill-array-data v1, :array_0

    sput-object v1, Le/f/e/r/p;->d:[I

    const/4 v1, 0x5

    new-array v2, v1, [I

    .line 2
    fill-array-data v2, :array_1

    sput-object v2, Le/f/e/r/p;->e:[I

    const/16 v2, 0xa

    new-array v3, v2, [[I

    const/4 v4, 0x4

    new-array v5, v4, [I

    .line 3
    fill-array-data v5, :array_2

    const/4 v6, 0x0

    aput-object v5, v3, v6

    new-array v5, v4, [I

    fill-array-data v5, :array_3

    const/4 v7, 0x1

    aput-object v5, v3, v7

    new-array v5, v4, [I

    fill-array-data v5, :array_4

    const/4 v8, 0x2

    aput-object v5, v3, v8

    new-array v5, v4, [I

    fill-array-data v5, :array_5

    aput-object v5, v3, v0

    new-array v0, v4, [I

    fill-array-data v0, :array_6

    aput-object v0, v3, v4

    new-array v0, v4, [I

    fill-array-data v0, :array_7

    aput-object v0, v3, v1

    new-array v0, v4, [I

    fill-array-data v0, :array_8

    const/4 v1, 0x6

    aput-object v0, v3, v1

    new-array v0, v4, [I

    fill-array-data v0, :array_9

    const/4 v1, 0x7

    aput-object v0, v3, v1

    new-array v0, v4, [I

    fill-array-data v0, :array_a

    const/16 v1, 0x8

    aput-object v0, v3, v1

    new-array v0, v4, [I

    fill-array-data v0, :array_b

    const/16 v1, 0x9

    aput-object v0, v3, v1

    sput-object v3, Le/f/e/r/p;->f:[[I

    const/16 v0, 0x14

    new-array v1, v0, [[I

    .line 4
    sput-object v1, Le/f/e/r/p;->g:[[I

    .line 5
    invoke-static {v3, v6, v1, v6, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :goto_0
    if-ge v2, v0, :cond_1

    .line 6
    sget-object v1, Le/f/e/r/p;->f:[[I

    add-int/lit8 v3, v2, -0xa

    aget-object v1, v1, v3

    .line 7
    array-length v3, v1

    new-array v3, v3, [I

    const/4 v4, 0x0

    .line 8
    :goto_1
    array-length v5, v1

    if-ge v4, v5, :cond_0

    .line 9
    array-length v5, v1

    sub-int/2addr v5, v4

    sub-int/2addr v5, v7

    aget v5, v1, v5

    aput v5, v3, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 10
    :cond_0
    sget-object v1, Le/f/e/r/p;->g:[[I

    aput-object v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void

    :array_0
    .array-data 4
        0x1
        0x1
        0x1
    .end array-data

    :array_1
    .array-data 4
        0x1
        0x1
        0x1
        0x1
        0x1
    .end array-data

    :array_2
    .array-data 4
        0x3
        0x2
        0x1
        0x1
    .end array-data

    :array_3
    .array-data 4
        0x2
        0x2
        0x2
        0x1
    .end array-data

    :array_4
    .array-data 4
        0x2
        0x1
        0x2
        0x2
    .end array-data

    :array_5
    .array-data 4
        0x1
        0x4
        0x1
        0x1
    .end array-data

    :array_6
    .array-data 4
        0x1
        0x1
        0x3
        0x2
    .end array-data

    :array_7
    .array-data 4
        0x1
        0x2
        0x3
        0x1
    .end array-data

    :array_8
    .array-data 4
        0x1
        0x1
        0x1
        0x4
    .end array-data

    :array_9
    .array-data 4
        0x1
        0x3
        0x1
        0x2
    .end array-data

    :array_a
    .array-data 4
        0x1
        0x2
        0x1
        0x3
    .end array-data

    :array_b
    .array-data 4
        0x3
        0x1
        0x1
        0x2
    .end array-data
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Le/f/e/r/k;-><init>()V

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    iput-object v0, p0, Le/f/e/r/p;->a:Ljava/lang/StringBuilder;

    .line 3
    new-instance v0, Le/f/e/r/o;

    invoke-direct {v0}, Le/f/e/r/o;-><init>()V

    iput-object v0, p0, Le/f/e/r/p;->b:Le/f/e/r/o;

    .line 4
    new-instance v0, Le/f/e/r/g;

    invoke-direct {v0}, Le/f/e/r/g;-><init>()V

    iput-object v0, p0, Le/f/e/r/p;->c:Le/f/e/r/g;

    return-void
.end method

.method public static a(Le/f/e/o/a;[II[[I)I
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/NotFoundException;
        }
    .end annotation

    .line 63
    invoke-static {p0, p2, p1}, Le/f/e/r/k;->a(Le/f/e/o/a;I[I)V

    .line 64
    array-length p0, p3

    const p2, 0x3ef5c28f    # 0.48f

    const/4 v0, -0x1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p0, :cond_1

    .line 65
    aget-object v2, p3, v1

    const v3, 0x3f333333    # 0.7f

    .line 66
    invoke-static {p1, v2, v3}, Le/f/e/r/k;->a([I[IF)F

    move-result v2

    cmpg-float v3, v2, p2

    if-gez v3, :cond_0

    move v0, v1

    move p2, v2

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    if-ltz v0, :cond_2

    return v0

    .line 67
    :cond_2
    invoke-static {}, Lcom/google/zxing/NotFoundException;->a()Lcom/google/zxing/NotFoundException;

    move-result-object p0

    throw p0
.end method

.method public static a(Ljava/lang/CharSequence;)Z
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/FormatException;
        }
    .end annotation

    .line 43
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    add-int/lit8 v2, v0, -0x2

    const/4 v3, 0x0

    :goto_0
    const/16 v4, 0x9

    if-ltz v2, :cond_2

    .line 44
    invoke-interface {p0, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    add-int/lit8 v5, v5, -0x30

    if-ltz v5, :cond_1

    if-gt v5, v4, :cond_1

    add-int/2addr v3, v5

    add-int/lit8 v2, v2, -0x2

    goto :goto_0

    .line 45
    :cond_1
    invoke-static {}, Lcom/google/zxing/FormatException;->a()Lcom/google/zxing/FormatException;

    move-result-object p0

    throw p0

    :cond_2
    mul-int/lit8 v3, v3, 0x3

    const/4 v2, 0x1

    sub-int/2addr v0, v2

    :goto_1
    if-ltz v0, :cond_4

    .line 46
    invoke-interface {p0, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    add-int/lit8 v5, v5, -0x30

    if-ltz v5, :cond_3

    if-gt v5, v4, :cond_3

    add-int/2addr v3, v5

    add-int/lit8 v0, v0, -0x2

    goto :goto_1

    .line 47
    :cond_3
    invoke-static {}, Lcom/google/zxing/FormatException;->a()Lcom/google/zxing/FormatException;

    move-result-object p0

    throw p0

    .line 48
    :cond_4
    rem-int/lit8 v3, v3, 0xa

    if-nez v3, :cond_5

    return v2

    :cond_5
    return v1
.end method

.method public static a(Le/f/e/o/a;)[I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/NotFoundException;
        }
    .end annotation

    .line 1
    sget-object v0, Le/f/e/r/p;->d:[I

    array-length v0, v0

    new-array v0, v0, [I

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-nez v3, :cond_1

    .line 2
    sget-object v2, Le/f/e/r/p;->d:[I

    array-length v2, v2

    invoke-static {v0, v1, v2, v1}, Ljava/util/Arrays;->fill([IIII)V

    .line 3
    sget-object v2, Le/f/e/r/p;->d:[I

    invoke-static {p0, v4, v1, v2, v0}, Le/f/e/r/p;->a(Le/f/e/o/a;IZ[I[I)[I

    move-result-object v2

    .line 4
    aget v4, v2, v1

    const/4 v5, 0x1

    .line 5
    aget v5, v2, v5

    sub-int v6, v5, v4

    sub-int v6, v4, v6

    if-ltz v6, :cond_0

    .line 6
    invoke-virtual {p0, v6, v4, v1}, Le/f/e/o/a;->a(IIZ)Z

    move-result v3

    :cond_0
    move v4, v5

    goto :goto_0

    :cond_1
    return-object v2
.end method

.method public static a(Le/f/e/o/a;IZ[I)[I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/NotFoundException;
        }
    .end annotation

    .line 50
    array-length v0, p3

    new-array v0, v0, [I

    invoke-static {p0, p1, p2, p3, v0}, Le/f/e/r/p;->a(Le/f/e/o/a;IZ[I[I)[I

    move-result-object p0

    return-object p0
.end method

.method public static a(Le/f/e/o/a;IZ[I[I)[I
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/NotFoundException;
        }
    .end annotation

    .line 51
    invoke-virtual {p0}, Le/f/e/o/a;->d()I

    move-result v0

    if-eqz p2, :cond_0

    .line 52
    invoke-virtual {p0, p1}, Le/f/e/o/a;->c(I)I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Le/f/e/o/a;->b(I)I

    move-result p1

    .line 53
    :goto_0
    array-length v1, p3

    const/4 v2, 0x0

    move v3, p2

    const/4 v4, 0x0

    move p2, p1

    :goto_1
    if-ge p1, v0, :cond_4

    .line 54
    invoke-virtual {p0, p1}, Le/f/e/o/a;->a(I)Z

    move-result v5

    xor-int/2addr v5, v3

    const/4 v6, 0x1

    if-eqz v5, :cond_1

    .line 55
    aget v5, p4, v4

    add-int/2addr v5, v6

    aput v5, p4, v4

    goto :goto_3

    :cond_1
    add-int/lit8 v5, v1, -0x1

    if-ne v4, v5, :cond_3

    const v7, 0x3f333333    # 0.7f

    .line 56
    invoke-static {p4, p3, v7}, Le/f/e/r/k;->a([I[IF)F

    move-result v7

    const v8, 0x3ef5c28f    # 0.48f

    const/4 v9, 0x2

    cmpg-float v7, v7, v8

    if-gez v7, :cond_2

    new-array p0, v9, [I

    aput p2, p0, v2

    aput p1, p0, v6

    return-object p0

    .line 57
    :cond_2
    aget v7, p4, v2

    aget v8, p4, v6

    add-int/2addr v7, v8

    add-int/2addr p2, v7

    add-int/lit8 v7, v1, -0x2

    .line 58
    invoke-static {p4, v9, p4, v2, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 59
    aput v2, p4, v7

    .line 60
    aput v2, p4, v5

    add-int/lit8 v4, v4, -0x1

    goto :goto_2

    :cond_3
    add-int/lit8 v4, v4, 0x1

    .line 61
    :goto_2
    aput v6, p4, v4

    xor-int/lit8 v3, v3, 0x1

    :goto_3
    add-int/lit8 p1, p1, 0x1

    goto :goto_1

    .line 62
    :cond_4
    invoke-static {}, Lcom/google/zxing/NotFoundException;->a()Lcom/google/zxing/NotFoundException;

    move-result-object p0

    throw p0
.end method


# virtual methods
.method public abstract a(Le/f/e/o/a;[ILjava/lang/StringBuilder;)I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/NotFoundException;
        }
    .end annotation
.end method

.method public a(ILe/f/e/o/a;Ljava/util/Map;)Le/f/e/j;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Le/f/e/o/a;",
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

    .line 7
    invoke-static {p2}, Le/f/e/r/p;->a(Le/f/e/o/a;)[I

    move-result-object v0

    invoke-virtual {p0, p1, p2, v0, p3}, Le/f/e/r/p;->a(ILe/f/e/o/a;[ILjava/util/Map;)Le/f/e/j;

    move-result-object p1

    return-object p1
.end method

.method public a(ILe/f/e/o/a;[ILjava/util/Map;)Le/f/e/j;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Le/f/e/o/a;",
            "[I",
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

    const/4 v0, 0x0

    if-nez p4, :cond_0

    move-object v1, v0

    goto :goto_0

    .line 8
    :cond_0
    sget-object v1, Le/f/e/d;->k:Le/f/e/d;

    .line 9
    invoke-interface {p4, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le/f/e/m;

    :goto_0
    const/high16 v2, 0x40000000    # 2.0f

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_1

    .line 10
    new-instance v5, Le/f/e/l;

    aget v6, p3, v4

    aget v7, p3, v3

    add-int/2addr v6, v7

    int-to-float v6, v6

    div-float/2addr v6, v2

    int-to-float v7, p1

    invoke-direct {v5, v6, v7}, Le/f/e/l;-><init>(FF)V

    invoke-interface {v1, v5}, Le/f/e/m;->a(Le/f/e/l;)V

    .line 11
    :cond_1
    iget-object v5, p0, Le/f/e/r/p;->a:Ljava/lang/StringBuilder;

    .line 12
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 13
    invoke-virtual {p0, p2, p3, v5}, Le/f/e/r/p;->a(Le/f/e/o/a;[ILjava/lang/StringBuilder;)I

    move-result v6

    if-eqz v1, :cond_2

    .line 14
    new-instance v7, Le/f/e/l;

    int-to-float v8, v6

    int-to-float v9, p1

    invoke-direct {v7, v8, v9}, Le/f/e/l;-><init>(FF)V

    invoke-interface {v1, v7}, Le/f/e/m;->a(Le/f/e/l;)V

    .line 15
    :cond_2
    invoke-virtual {p0, p2, v6}, Le/f/e/r/p;->a(Le/f/e/o/a;I)[I

    move-result-object v6

    if-eqz v1, :cond_3

    .line 16
    new-instance v7, Le/f/e/l;

    aget v8, v6, v4

    aget v9, v6, v3

    add-int/2addr v8, v9

    int-to-float v8, v8

    div-float/2addr v8, v2

    int-to-float v9, p1

    invoke-direct {v7, v8, v9}, Le/f/e/l;-><init>(FF)V

    invoke-interface {v1, v7}, Le/f/e/m;->a(Le/f/e/l;)V

    .line 17
    :cond_3
    aget v1, v6, v3

    .line 18
    aget v7, v6, v4

    sub-int v7, v1, v7

    add-int/2addr v7, v1

    .line 19
    invoke-virtual {p2}, Le/f/e/o/a;->d()I

    move-result v8

    if-ge v7, v8, :cond_d

    invoke-virtual {p2, v1, v7, v4}, Le/f/e/o/a;->a(IIZ)Z

    move-result v1

    if-eqz v1, :cond_d

    .line 20
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 21
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v5

    const/16 v7, 0x8

    if-lt v5, v7, :cond_c

    .line 22
    invoke-virtual {p0, v1}, Le/f/e/r/p;->a(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_b

    .line 23
    aget v5, p3, v3

    aget p3, p3, v4

    add-int/2addr v5, p3

    int-to-float p3, v5

    div-float/2addr p3, v2

    .line 24
    aget v5, v6, v3

    aget v7, v6, v4

    add-int/2addr v5, v7

    int-to-float v5, v5

    div-float/2addr v5, v2

    .line 25
    invoke-virtual {p0}, Le/f/e/r/p;->b()Le/f/e/a;

    move-result-object v2

    .line 26
    new-instance v7, Le/f/e/j;

    const/4 v8, 0x2

    new-array v8, v8, [Le/f/e/l;

    new-instance v9, Le/f/e/l;

    int-to-float v10, p1

    invoke-direct {v9, p3, v10}, Le/f/e/l;-><init>(FF)V

    aput-object v9, v8, v4

    new-instance p3, Le/f/e/l;

    invoke-direct {p3, v5, v10}, Le/f/e/l;-><init>(FF)V

    aput-object p3, v8, v3

    invoke-direct {v7, v1, v0, v8, v2}, Le/f/e/j;-><init>(Ljava/lang/String;[B[Le/f/e/l;Le/f/e/a;)V

    .line 27
    :try_start_0
    iget-object p3, p0, Le/f/e/r/p;->b:Le/f/e/r/o;

    aget v5, v6, v3

    invoke-virtual {p3, p1, p2, v5}, Le/f/e/r/o;->a(ILe/f/e/o/a;I)Le/f/e/j;

    move-result-object p1

    .line 28
    sget-object p2, Le/f/e/k;->i:Le/f/e/k;

    invoke-virtual {p1}, Le/f/e/j;->e()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v7, p2, p3}, Le/f/e/j;->a(Le/f/e/k;Ljava/lang/Object;)V

    .line 29
    invoke-virtual {p1}, Le/f/e/j;->c()Ljava/util/Map;

    move-result-object p2

    invoke-virtual {v7, p2}, Le/f/e/j;->a(Ljava/util/Map;)V

    .line 30
    invoke-virtual {p1}, Le/f/e/j;->d()[Le/f/e/l;

    move-result-object p2

    invoke-virtual {v7, p2}, Le/f/e/j;->a([Le/f/e/l;)V

    .line 31
    invoke-virtual {p1}, Le/f/e/j;->e()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1
    :try_end_0
    .catch Lcom/google/zxing/ReaderException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    const/4 p1, 0x0

    :goto_1
    if-nez p4, :cond_4

    goto :goto_2

    .line 32
    :cond_4
    sget-object p2, Le/f/e/d;->l:Le/f/e/d;

    .line 33
    invoke-interface {p4, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    move-object v0, p2

    check-cast v0, [I

    :goto_2
    if-eqz v0, :cond_8

    .line 34
    array-length p2, v0

    const/4 p3, 0x0

    :goto_3
    if-ge p3, p2, :cond_6

    aget p4, v0, p3

    if-ne p1, p4, :cond_5

    goto :goto_4

    :cond_5
    add-int/lit8 p3, p3, 0x1

    goto :goto_3

    :cond_6
    const/4 v3, 0x0

    :goto_4
    if-eqz v3, :cond_7

    goto :goto_5

    .line 35
    :cond_7
    invoke-static {}, Lcom/google/zxing/NotFoundException;->a()Lcom/google/zxing/NotFoundException;

    move-result-object p1

    throw p1

    .line 36
    :cond_8
    :goto_5
    sget-object p1, Le/f/e/a;->i:Le/f/e/a;

    if-eq v2, p1, :cond_9

    sget-object p1, Le/f/e/a;->p:Le/f/e/a;

    if-ne v2, p1, :cond_a

    .line 37
    :cond_9
    iget-object p1, p0, Le/f/e/r/p;->c:Le/f/e/r/g;

    invoke-virtual {p1, v1}, Le/f/e/r/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_a

    .line 38
    sget-object p2, Le/f/e/k;->h:Le/f/e/k;

    invoke-virtual {v7, p2, p1}, Le/f/e/j;->a(Le/f/e/k;Ljava/lang/Object;)V

    :cond_a
    return-object v7

    .line 39
    :cond_b
    invoke-static {}, Lcom/google/zxing/ChecksumException;->a()Lcom/google/zxing/ChecksumException;

    move-result-object p1

    throw p1

    .line 40
    :cond_c
    invoke-static {}, Lcom/google/zxing/FormatException;->a()Lcom/google/zxing/FormatException;

    move-result-object p1

    throw p1

    .line 41
    :cond_d
    invoke-static {}, Lcom/google/zxing/NotFoundException;->a()Lcom/google/zxing/NotFoundException;

    move-result-object p1

    throw p1
.end method

.method public a(Ljava/lang/String;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/FormatException;
        }
    .end annotation

    .line 42
    invoke-static {p1}, Le/f/e/r/p;->a(Ljava/lang/CharSequence;)Z

    move-result p1

    return p1
.end method

.method public a(Le/f/e/o/a;I)[I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/NotFoundException;
        }
    .end annotation

    .line 49
    sget-object v0, Le/f/e/r/p;->d:[I

    const/4 v1, 0x0

    invoke-static {p1, p2, v1, v0}, Le/f/e/r/p;->a(Le/f/e/o/a;IZ[I)[I

    move-result-object p1

    return-object p1
.end method

.method public abstract b()Le/f/e/a;
.end method
