.class public final Le/f/d/d0/x;
.super Ljava/util/AbstractMap;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le/f/d/d0/x$a;,
        Le/f/d/d0/x$d;,
        Le/f/d/d0/x$b;,
        Le/f/d/d0/x$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/util/AbstractMap<",
        "Ljava/lang/String;",
        "TV;>;"
    }
.end annotation


# static fields
.field public static final i:[Ljava/util/Map$Entry;

.field public static final j:I


# instance fields
.field public b:Le/f/d/d0/z;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/d/d0/z<",
            "TV;>;"
        }
    .end annotation
.end field

.field public c:[Le/f/d/d0/z;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Le/f/d/d0/z<",
            "TV;>;"
        }
    .end annotation
.end field

.field public d:I

.field public e:I

.field public f:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public g:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/util/Map$Entry<",
            "Ljava/lang/String;",
            "TV;>;>;"
        }
    .end annotation
.end field

.field public h:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<",
            "TV;>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x2

    new-array v0, v0, [Le/f/d/d0/z;

    .line 1
    sput-object v0, Le/f/d/d0/x;->i:[Ljava/util/Map$Entry;

    .line 2
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    invoke-virtual {v0}, Ljava/util/Random;->nextInt()I

    move-result v0

    sput v0, Le/f/d/d0/x;->j:I

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/util/AbstractMap;-><init>()V

    .line 2
    sget-object v0, Le/f/d/d0/x;->i:[Ljava/util/Map$Entry;

    check-cast v0, [Le/f/d/d0/z;

    iput-object v0, p0, Le/f/d/d0/x;->c:[Le/f/d/d0/z;

    const/4 v0, -0x1

    .line 3
    iput v0, p0, Le/f/d/d0/x;->e:I

    .line 4
    new-instance v0, Le/f/d/d0/z;

    invoke-direct {v0}, Le/f/d/d0/z;-><init>()V

    iput-object v0, p0, Le/f/d/d0/x;->b:Le/f/d/d0/z;

    return-void
.end method

.method public static synthetic a(Le/f/d/d0/x;)Le/f/d/d0/z;
    .locals 0

    .line 1
    iget-object p0, p0, Le/f/d/d0/x;->b:Le/f/d/d0/z;

    return-object p0
.end method

.method public static synthetic a(Le/f/d/d0/x;Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Le/f/d/d0/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static synthetic b(Le/f/d/d0/x;)I
    .locals 0

    .line 1
    iget p0, p0, Le/f/d/d0/x;->d:I

    return p0
.end method

.method public static b(Ljava/lang/String;)I
    .locals 3

    .line 2
    sget v0, Le/f/d/d0/x;->j:I

    const/4 v1, 0x0

    .line 3
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v1, v2, :cond_0

    .line 4
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    add-int/2addr v0, v2

    add-int/2addr v0, v0

    shl-int/lit8 v0, v0, 0xa

    ushr-int/lit8 v2, v0, 0x6

    xor-int/2addr v0, v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    ushr-int/lit8 p0, v0, 0x14

    ushr-int/lit8 v1, v0, 0xc

    xor-int/2addr p0, v1

    xor-int/2addr p0, v0

    ushr-int/lit8 v0, p0, 0x7

    xor-int/2addr v0, p0

    ushr-int/lit8 p0, p0, 0x4

    xor-int/2addr p0, v0

    return p0
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Le/f/d/d0/z;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Le/f/d/d0/z<",
            "TV;>;"
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 3
    :cond_0
    invoke-static {p1}, Le/f/d/d0/x;->b(Ljava/lang/String;)I

    move-result v1

    .line 4
    iget-object v2, p0, Le/f/d/d0/x;->c:[Le/f/d/d0/z;

    .line 5
    array-length v3, v2

    add-int/lit8 v3, v3, -0x1

    and-int/2addr v3, v1

    aget-object v2, v2, v3

    :goto_0
    if-eqz v2, :cond_3

    .line 6
    iget-object v3, v2, Le/f/d/d0/z;->b:Ljava/lang/String;

    if-eq v3, p1, :cond_2

    .line 7
    iget v4, v2, Le/f/d/d0/z;->d:I

    if-ne v4, v1, :cond_1

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_1

    .line 8
    :cond_1
    iget-object v2, v2, Le/f/d/d0/z;->e:Le/f/d/d0/z;

    goto :goto_0

    :cond_2
    :goto_1
    return-object v2

    :cond_3
    return-object v0
.end method

.method public a(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "TV;)TV;"
        }
    .end annotation

    if-eqz p1, :cond_3

    .line 9
    invoke-static {p1}, Le/f/d/d0/x;->b(Ljava/lang/String;)I

    move-result v0

    .line 10
    iget-object v1, p0, Le/f/d/d0/x;->c:[Le/f/d/d0/z;

    .line 11
    array-length v2, v1

    add-int/lit8 v2, v2, -0x1

    and-int/2addr v2, v0

    .line 12
    aget-object v1, v1, v2

    :goto_0
    if-eqz v1, :cond_1

    .line 13
    iget v3, v1, Le/f/d/d0/z;->d:I

    if-ne v3, v0, :cond_0

    iget-object v3, v1, Le/f/d/d0/z;->b:Ljava/lang/String;

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 14
    iget-object p1, v1, Le/f/d/d0/z;->c:Ljava/lang/Object;

    .line 15
    iput-object p2, v1, Le/f/d/d0/z;->c:Ljava/lang/Object;

    return-object p1

    .line 16
    :cond_0
    iget-object v1, v1, Le/f/d/d0/z;->e:Le/f/d/d0/z;

    goto :goto_0

    .line 17
    :cond_1
    iget v1, p0, Le/f/d/d0/x;->d:I

    add-int/lit8 v3, v1, 0x1

    iput v3, p0, Le/f/d/d0/x;->d:I

    iget v3, p0, Le/f/d/d0/x;->e:I

    if-le v1, v3, :cond_2

    .line 18
    invoke-virtual {p0}, Le/f/d/d0/x;->a()[Le/f/d/d0/z;

    move-result-object v1

    .line 19
    array-length v1, v1

    add-int/lit8 v1, v1, -0x1

    and-int v2, v0, v1

    .line 20
    :cond_2
    invoke-virtual {p0, p1, p2, v0, v2}, Le/f/d/d0/x;->a(Ljava/lang/String;Ljava/lang/Object;II)V

    const/4 p1, 0x0

    return-object p1

    .line 21
    :cond_3
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "key == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final a(Le/f/d/d0/z;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/d/d0/z<",
            "TV;>;)V"
        }
    .end annotation

    .line 42
    iget-object v0, p1, Le/f/d/d0/z;->g:Le/f/d/d0/z;

    iget-object v1, p1, Le/f/d/d0/z;->f:Le/f/d/d0/z;

    iput-object v1, v0, Le/f/d/d0/z;->f:Le/f/d/d0/z;

    .line 43
    iget-object v1, p1, Le/f/d/d0/z;->f:Le/f/d/d0/z;

    iput-object v0, v1, Le/f/d/d0/z;->g:Le/f/d/d0/z;

    const/4 v0, 0x0

    .line 44
    iput-object v0, p1, Le/f/d/d0/z;->g:Le/f/d/d0/z;

    iput-object v0, p1, Le/f/d/d0/z;->f:Le/f/d/d0/z;

    return-void
.end method

.method public final a(Ljava/lang/String;Ljava/lang/Object;II)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "TV;II)V"
        }
    .end annotation

    .line 22
    iget-object v7, p0, Le/f/d/d0/x;->b:Le/f/d/d0/z;

    .line 23
    iget-object v8, v7, Le/f/d/d0/z;->g:Le/f/d/d0/z;

    .line 24
    new-instance v9, Le/f/d/d0/z;

    iget-object v0, p0, Le/f/d/d0/x;->c:[Le/f/d/d0/z;

    aget-object v4, v0, p4

    move-object v0, v9

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-object v5, v7

    move-object v6, v8

    invoke-direct/range {v0 .. v6}, Le/f/d/d0/z;-><init>(Ljava/lang/String;Ljava/lang/Object;ILe/f/d/d0/z;Le/f/d/d0/z;Le/f/d/d0/z;)V

    .line 25
    iget-object p1, p0, Le/f/d/d0/x;->c:[Le/f/d/d0/z;

    iput-object v9, v7, Le/f/d/d0/z;->g:Le/f/d/d0/z;

    iput-object v9, v8, Le/f/d/d0/z;->f:Le/f/d/d0/z;

    aput-object v9, p1, p4

    return-void
.end method

.method public final a(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 9

    const/4 v0, 0x0

    if-eqz p1, :cond_5

    .line 45
    instance-of v1, p1, Ljava/lang/String;

    if-nez v1, :cond_0

    goto :goto_3

    .line 46
    :cond_0
    move-object v1, p1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Le/f/d/d0/x;->b(Ljava/lang/String;)I

    move-result v1

    .line 47
    iget-object v2, p0, Le/f/d/d0/x;->c:[Le/f/d/d0/z;

    .line 48
    array-length v3, v2

    const/4 v4, 0x1

    sub-int/2addr v3, v4

    and-int/2addr v3, v1

    .line 49
    aget-object v5, v2, v3

    const/4 v6, 0x0

    :goto_0
    if-eqz v5, :cond_5

    .line 50
    iget v7, v5, Le/f/d/d0/z;->d:I

    if-ne v7, v1, :cond_4

    iget-object v7, v5, Le/f/d/d0/z;->b:Ljava/lang/String;

    invoke-virtual {p1, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    .line 51
    iget-object p1, v5, Le/f/d/d0/z;->c:Ljava/lang/Object;

    if-nez p2, :cond_1

    if-eqz p1, :cond_2

    goto :goto_1

    :cond_1
    invoke-virtual {p2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    :goto_1
    return v0

    :cond_2
    if-nez v6, :cond_3

    .line 52
    iget-object p1, v5, Le/f/d/d0/z;->e:Le/f/d/d0/z;

    aput-object p1, v2, v3

    goto :goto_2

    .line 53
    :cond_3
    iget-object p1, v5, Le/f/d/d0/z;->e:Le/f/d/d0/z;

    iput-object p1, v6, Le/f/d/d0/z;->e:Le/f/d/d0/z;

    .line 54
    :goto_2
    iget p1, p0, Le/f/d/d0/x;->d:I

    sub-int/2addr p1, v4

    iput p1, p0, Le/f/d/d0/x;->d:I

    .line 55
    invoke-virtual {p0, v5}, Le/f/d/d0/x;->a(Le/f/d/d0/z;)V

    return v4

    .line 56
    :cond_4
    iget-object v6, v5, Le/f/d/d0/z;->e:Le/f/d/d0/z;

    move-object v8, v6

    move-object v6, v5

    move-object v5, v8

    goto :goto_0

    :cond_5
    :goto_3
    return v0
.end method

.method public final a()[Le/f/d/d0/z;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Le/f/d/d0/z<",
            "TV;>;"
        }
    .end annotation

    .line 29
    iget-object v0, p0, Le/f/d/d0/x;->c:[Le/f/d/d0/z;

    .line 30
    array-length v1, v0

    const/high16 v2, 0x40000000    # 2.0f

    if-ne v1, v2, :cond_0

    return-object v0

    :cond_0
    mul-int/lit8 v2, v1, 0x2

    .line 31
    invoke-virtual {p0, v2}, Le/f/d/d0/x;->a(I)[Le/f/d/d0/z;

    move-result-object v2

    .line 32
    iget v3, p0, Le/f/d/d0/x;->d:I

    if-nez v3, :cond_1

    return-object v2

    :cond_1
    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_7

    .line 33
    aget-object v4, v0, v3

    if-nez v4, :cond_2

    goto :goto_3

    .line 34
    :cond_2
    iget v5, v4, Le/f/d/d0/z;->d:I

    and-int/2addr v5, v1

    or-int v6, v3, v5

    .line 35
    aput-object v4, v2, v6

    .line 36
    iget-object v6, v4, Le/f/d/d0/z;->e:Le/f/d/d0/z;

    const/4 v7, 0x0

    move-object v8, v7

    move v10, v5

    move-object v5, v4

    move-object v4, v6

    move v6, v10

    :goto_1
    if-eqz v4, :cond_5

    .line 37
    iget v9, v4, Le/f/d/d0/z;->d:I

    and-int/2addr v9, v1

    if-eq v9, v6, :cond_4

    if-nez v8, :cond_3

    or-int v6, v3, v9

    .line 38
    aput-object v4, v2, v6

    goto :goto_2

    .line 39
    :cond_3
    iput-object v4, v8, Le/f/d/d0/z;->e:Le/f/d/d0/z;

    :goto_2
    move-object v8, v5

    move v6, v9

    .line 40
    :cond_4
    iget-object v5, v4, Le/f/d/d0/z;->e:Le/f/d/d0/z;

    move-object v10, v5

    move-object v5, v4

    move-object v4, v10

    goto :goto_1

    :cond_5
    if-eqz v8, :cond_6

    .line 41
    iput-object v7, v8, Le/f/d/d0/z;->e:Le/f/d/d0/z;

    :cond_6
    :goto_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_7
    return-object v2
.end method

.method public final a(I)[Le/f/d/d0/z;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)[",
            "Le/f/d/d0/z<",
            "TV;>;"
        }
    .end annotation

    .line 26
    new-array v0, p1, [Le/f/d/d0/z;

    .line 27
    iput-object v0, p0, Le/f/d/d0/x;->c:[Le/f/d/d0/z;

    shr-int/lit8 v1, p1, 0x1

    shr-int/lit8 p1, p1, 0x2

    add-int/2addr v1, p1

    .line 28
    iput v1, p0, Le/f/d/d0/x;->e:I

    return-object v0
.end method

.method public clear()V
    .locals 4

    .line 1
    iget v0, p0, Le/f/d/d0/x;->d:I

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Le/f/d/d0/x;->c:[Le/f/d/d0/z;

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v0, 0x0

    .line 3
    iput v0, p0, Le/f/d/d0/x;->d:I

    .line 4
    :cond_0
    iget-object v0, p0, Le/f/d/d0/x;->b:Le/f/d/d0/z;

    .line 5
    iget-object v2, v0, Le/f/d/d0/z;->f:Le/f/d/d0/z;

    :goto_0
    if-eq v2, v0, :cond_1

    .line 6
    iget-object v3, v2, Le/f/d/d0/z;->f:Le/f/d/d0/z;

    .line 7
    iput-object v1, v2, Le/f/d/d0/z;->g:Le/f/d/d0/z;

    iput-object v1, v2, Le/f/d/d0/z;->f:Le/f/d/d0/z;

    move-object v2, v3

    goto :goto_0

    .line 8
    :cond_1
    iput-object v0, v0, Le/f/d/d0/z;->g:Le/f/d/d0/z;

    iput-object v0, v0, Le/f/d/d0/z;->f:Le/f/d/d0/z;

    return-void
.end method

.method public containsKey(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Le/f/d/d0/x;->a(Ljava/lang/String;)Le/f/d/d0/z;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public entrySet()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/util/Map$Entry<",
            "Ljava/lang/String;",
            "TV;>;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/f/d/d0/x;->g:Ljava/util/Set;

    if-eqz v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    new-instance v0, Le/f/d/d0/x$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Le/f/d/d0/x$a;-><init>(Le/f/d/d0/x;Le/f/d/d0/v;)V

    iput-object v0, p0, Le/f/d/d0/x;->g:Ljava/util/Set;

    :goto_0
    return-object v0
.end method

.method public get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")TV;"
        }
    .end annotation

    .line 1
    instance-of v0, p1, Ljava/lang/String;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 2
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Le/f/d/d0/x;->a(Ljava/lang/String;)Le/f/d/d0/z;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 3
    iget-object v1, p1, Le/f/d/d0/z;->c:Ljava/lang/Object;

    :cond_0
    return-object v1
.end method

.method public keySet()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/f/d/d0/x;->f:Ljava/util/Set;

    if-eqz v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    new-instance v0, Le/f/d/d0/x$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Le/f/d/d0/x$b;-><init>(Le/f/d/d0/x;Le/f/d/d0/v;)V

    iput-object v0, p0, Le/f/d/d0/x;->f:Ljava/util/Set;

    :goto_0
    return-object v0
.end method

.method public bridge synthetic put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Le/f/d/d0/x;->a(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")TV;"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p1, :cond_3

    .line 1
    instance-of v1, p1, Ljava/lang/String;

    if-nez v1, :cond_0

    goto :goto_2

    .line 2
    :cond_0
    move-object v1, p1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Le/f/d/d0/x;->b(Ljava/lang/String;)I

    move-result v1

    .line 3
    iget-object v2, p0, Le/f/d/d0/x;->c:[Le/f/d/d0/z;

    .line 4
    array-length v3, v2

    add-int/lit8 v3, v3, -0x1

    and-int/2addr v3, v1

    .line 5
    aget-object v4, v2, v3

    move-object v5, v0

    :goto_0
    if-eqz v4, :cond_3

    .line 6
    iget v6, v4, Le/f/d/d0/z;->d:I

    if-ne v6, v1, :cond_2

    iget-object v6, v4, Le/f/d/d0/z;->b:Ljava/lang/String;

    invoke-virtual {p1, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    if-nez v5, :cond_1

    .line 7
    iget-object p1, v4, Le/f/d/d0/z;->e:Le/f/d/d0/z;

    aput-object p1, v2, v3

    goto :goto_1

    .line 8
    :cond_1
    iget-object p1, v4, Le/f/d/d0/z;->e:Le/f/d/d0/z;

    iput-object p1, v5, Le/f/d/d0/z;->e:Le/f/d/d0/z;

    .line 9
    :goto_1
    iget p1, p0, Le/f/d/d0/x;->d:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Le/f/d/d0/x;->d:I

    .line 10
    invoke-virtual {p0, v4}, Le/f/d/d0/x;->a(Le/f/d/d0/z;)V

    .line 11
    iget-object p1, v4, Le/f/d/d0/z;->c:Ljava/lang/Object;

    return-object p1

    .line 12
    :cond_2
    iget-object v5, v4, Le/f/d/d0/z;->e:Le/f/d/d0/z;

    move-object v7, v5

    move-object v5, v4

    move-object v4, v7

    goto :goto_0

    :cond_3
    :goto_2
    return-object v0
.end method

.method public size()I
    .locals 1

    .line 1
    iget v0, p0, Le/f/d/d0/x;->d:I

    return v0
.end method

.method public values()Ljava/util/Collection;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "TV;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/f/d/d0/x;->h:Ljava/util/Collection;

    if-eqz v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    new-instance v0, Le/f/d/d0/x$d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Le/f/d/d0/x$d;-><init>(Le/f/d/d0/x;Le/f/d/d0/v;)V

    iput-object v0, p0, Le/f/d/d0/x;->h:Ljava/util/Collection;

    :goto_0
    return-object v0
.end method
