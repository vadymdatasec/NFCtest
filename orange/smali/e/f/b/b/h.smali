.class public abstract Le/f/b/b/h;
.super Le/f/b/b/e;
.source "SourceFile"

# interfaces
.implements Ljava/util/Set;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Le/f/b/b/e<",
        "TE;>;",
        "Ljava/util/Set<",
        "TE;>;"
    }
.end annotation


# instance fields
.field public transient c:Le/f/b/b/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/b/b/g<",
            "TE;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Le/f/b/b/e;-><init>()V

    return-void
.end method

.method public static a(I)I
    .locals 6

    const/4 v0, 0x2

    .line 20
    invoke-static {p0, v0}, Ljava/lang/Math;->max(II)I

    move-result p0

    const/4 v0, 0x1

    const v1, 0x2ccccccc

    if-ge p0, v1, :cond_1

    add-int/lit8 v1, p0, -0x1

    .line 21
    invoke-static {v1}, Ljava/lang/Integer;->highestOneBit(I)I

    move-result v1

    shl-int/lit8 v0, v1, 0x1

    :goto_0
    int-to-double v1, v0

    const-wide v3, 0x3fe6666666666666L    # 0.7

    mul-double v1, v1, v3

    int-to-double v3, p0

    cmpg-double v5, v1, v3

    if-gez v5, :cond_0

    shl-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return v0

    :cond_1
    const/high16 v1, 0x40000000    # 2.0f

    if-ge p0, v1, :cond_2

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    const-string p0, "collection too large"

    .line 22
    invoke-static {v0, p0}, Le/f/b/a/p;->a(ZLjava/lang/Object;)V

    return v1
.end method

.method public static varargs a(I[Ljava/lang/Object;)Le/f/b/b/h;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(I[",
            "Ljava/lang/Object;",
            ")",
            "Le/f/b/b/h<",
            "TE;>;"
        }
    .end annotation

    if-eqz p0, :cond_7

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eq p0, v1, :cond_6

    .line 1
    invoke-static {p0}, Le/f/b/b/h;->a(I)I

    move-result v2

    .line 2
    new-array v6, v2, [Ljava/lang/Object;

    add-int/lit8 v7, v2, -0x1

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v8, 0x0

    :goto_0
    if-ge v3, p0, :cond_2

    .line 3
    aget-object v4, p1, v3

    invoke-static {v4, v3}, Le/f/b/b/o0;->a(Ljava/lang/Object;I)Ljava/lang/Object;

    .line 4
    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    move-result v9

    .line 5
    invoke-static {v9}, Le/f/b/b/d;->a(I)I

    move-result v10

    :goto_1
    and-int v11, v10, v7

    .line 6
    aget-object v12, v6, v11

    if-nez v12, :cond_0

    add-int/lit8 v10, v8, 0x1

    .line 7
    aput-object v4, p1, v8

    .line 8
    aput-object v4, v6, v11

    add-int/2addr v5, v9

    move v8, v10

    goto :goto_2

    .line 9
    :cond_0
    invoke-virtual {v12, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_1

    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    :cond_2
    const/4 v3, 0x0

    .line 10
    invoke-static {p1, v8, p0, v3}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    if-ne v8, v1, :cond_3

    .line 11
    aget-object p0, p1, v0

    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    .line 12
    new-instance p1, Le/f/b/b/t0;

    invoke-direct {p1, p0}, Le/f/b/b/t0;-><init>(Ljava/lang/Object;)V

    return-object p1

    .line 13
    :cond_3
    invoke-static {v8}, Le/f/b/b/h;->a(I)I

    move-result p0

    div-int/lit8 v2, v2, 0x2

    if-ge p0, v2, :cond_4

    .line 14
    invoke-static {v8, p1}, Le/f/b/b/h;->a(I[Ljava/lang/Object;)Le/f/b/b/h;

    move-result-object p0

    return-object p0

    .line 15
    :cond_4
    array-length p0, p1

    invoke-static {v8, p0}, Le/f/b/b/h;->a(II)Z

    move-result p0

    if-eqz p0, :cond_5

    invoke-static {p1, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    :cond_5
    move-object v4, p1

    .line 16
    new-instance p0, Le/f/b/b/r0;

    move-object v3, p0

    invoke-direct/range {v3 .. v8}, Le/f/b/b/r0;-><init>([Ljava/lang/Object;I[Ljava/lang/Object;II)V

    return-object p0

    .line 17
    :cond_6
    aget-object p0, p1, v0

    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    .line 18
    invoke-static {p0}, Le/f/b/b/h;->of(Ljava/lang/Object;)Le/f/b/b/h;

    move-result-object p0

    return-object p0

    .line 19
    :cond_7
    invoke-static {}, Le/f/b/b/h;->of()Le/f/b/b/h;

    move-result-object p0

    return-object p0
.end method

.method public static a([Ljava/lang/Object;)Le/f/b/b/h;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">([TE;)",
            "Le/f/b/b/h<",
            "TE;>;"
        }
    .end annotation

    .line 23
    array-length v0, p0

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    .line 24
    array-length v0, p0

    invoke-virtual {p0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Ljava/lang/Object;

    invoke-static {v0, p0}, Le/f/b/b/h;->a(I[Ljava/lang/Object;)Le/f/b/b/h;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 v0, 0x0

    .line 25
    aget-object p0, p0, v0

    invoke-static {p0}, Le/f/b/b/h;->of(Ljava/lang/Object;)Le/f/b/b/h;

    move-result-object p0

    return-object p0

    .line 26
    :cond_1
    invoke-static {}, Le/f/b/b/h;->of()Le/f/b/b/h;

    move-result-object p0

    return-object p0
.end method

.method public static a(II)Z
    .locals 1

    shr-int/lit8 v0, p1, 0x1

    shr-int/lit8 p1, p1, 0x2

    add-int/2addr v0, p1

    if-ge p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static of()Le/f/b/b/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">()",
            "Le/f/b/b/h<",
            "TE;>;"
        }
    .end annotation

    .line 1
    sget-object v0, Le/f/b/b/r0;->j:Le/f/b/b/r0;

    return-object v0
.end method

.method public static of(Ljava/lang/Object;)Le/f/b/b/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(TE;)",
            "Le/f/b/b/h<",
            "TE;>;"
        }
    .end annotation

    .line 2
    new-instance v0, Le/f/b/b/t0;

    invoke-direct {v0, p0}, Le/f/b/b/t0;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public static of(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Le/f/b/b/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(TE;TE;TE;)",
            "Le/f/b/b/h<",
            "TE;>;"
        }
    .end annotation

    const/4 v0, 0x3

    new-array v1, v0, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    const/4 p0, 0x1

    aput-object p1, v1, p0

    const/4 p0, 0x2

    aput-object p2, v1, p0

    .line 3
    invoke-static {v0, v1}, Le/f/b/b/h;->a(I[Ljava/lang/Object;)Le/f/b/b/h;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public d()Le/f/b/b/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Le/f/b/b/g<",
            "TE;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/f/b/b/h;->c:Le/f/b/b/g;

    if-nez v0, :cond_0

    .line 2
    invoke-virtual {p0}, Le/f/b/b/h;->e()Le/f/b/b/g;

    move-result-object v0

    iput-object v0, p0, Le/f/b/b/h;->c:Le/f/b/b/g;

    :cond_0
    return-object v0
.end method

.method public e()Le/f/b/b/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Le/f/b/b/g<",
            "TE;>;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Le/f/b/b/e;->toArray()[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Le/f/b/b/g;->a([Ljava/lang/Object;)Le/f/b/b/g;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p1, p0, :cond_0

    const/4 p1, 0x1

    return p1

    .line 1
    :cond_0
    instance-of v0, p1, Le/f/b/b/h;

    if-eqz v0, :cond_1

    .line 2
    invoke-virtual {p0}, Le/f/b/b/h;->f()Z

    move-result v0

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Le/f/b/b/h;

    .line 3
    invoke-virtual {v0}, Le/f/b/b/h;->f()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {p0}, Le/f/b/b/h;->hashCode()I

    move-result v0

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    if-eq v0, v1, :cond_1

    const/4 p1, 0x0

    return p1

    .line 5
    :cond_1
    invoke-static {p0, p1}, Le/f/b/b/s0;->a(Ljava/util/Set;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public f()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public abstract hashCode()I
.end method
