.class public Le/f/b/b/q;
.super Ljava/util/AbstractMap;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/ConcurrentMap;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le/f/b/b/q$b;,
        Le/f/b/b/q$g;,
        Le/f/b/b/q$e;,
        Le/f/b/b/q$a;,
        Le/f/b/b/q$h;,
        Le/f/b/b/q$f;,
        Le/f/b/b/q$d;,
        Le/f/b/b/q$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        "E::",
        "Le/f/b/b/r<",
        "TK;TV;TE;>;S:",
        "Le/f/b/b/u<",
        "TK;TV;TE;TS;>;>",
        "Ljava/util/AbstractMap<",
        "TK;TV;>;",
        "Ljava/util/concurrent/ConcurrentMap<",
        "TK;TV;>;",
        "Ljava/io/Serializable;"
    }
.end annotation


# static fields
.field public static final k:Le/f/b/b/m0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/b/b/m0<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            "Le/f/b/b/p;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final transient b:I

.field public final transient c:I

.field public final transient d:[Le/f/b/b/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Le/f/b/b/u<",
            "TK;TV;TE;TS;>;"
        }
    .end annotation
.end field

.field public final e:I

.field public final f:Le/f/b/a/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/b/a/d<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public final transient g:Le/f/b/b/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/f/b/b/s<",
            "TK;TV;TE;TS;>;"
        }
    .end annotation
.end field

.field public transient h:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "TK;>;"
        }
    .end annotation
.end field

.field public transient i:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<",
            "TV;>;"
        }
    .end annotation
.end field

.field public transient j:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Le/f/b/b/m;

    invoke-direct {v0}, Le/f/b/b/m;-><init>()V

    sput-object v0, Le/f/b/b/q;->k:Le/f/b/b/m0;

    return-void
.end method

.method public constructor <init>(Le/f/b/b/l;Le/f/b/b/s;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/b/b/l;",
            "Le/f/b/b/s<",
            "TK;TV;TE;TS;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/util/AbstractMap;-><init>()V

    .line 2
    invoke-virtual {p1}, Le/f/b/b/l;->a()I

    move-result v0

    const/high16 v1, 0x10000

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    iput v0, p0, Le/f/b/b/q;->e:I

    .line 3
    invoke-virtual {p1}, Le/f/b/b/l;->c()Le/f/b/a/d;

    move-result-object v0

    iput-object v0, p0, Le/f/b/b/q;->f:Le/f/b/a/d;

    .line 4
    iput-object p2, p0, Le/f/b/b/q;->g:Le/f/b/b/s;

    .line 5
    invoke-virtual {p1}, Le/f/b/b/l;->b()I

    move-result p1

    const/high16 p2, 0x40000000    # 2.0f

    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result p1

    const/4 p2, 0x0

    const/4 v0, 0x1

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 6
    :goto_0
    iget v3, p0, Le/f/b/b/q;->e:I

    if-ge v1, v3, :cond_0

    add-int/lit8 v2, v2, 0x1

    shl-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    rsub-int/lit8 v2, v2, 0x20

    .line 7
    iput v2, p0, Le/f/b/b/q;->c:I

    add-int/lit8 v2, v1, -0x1

    .line 8
    iput v2, p0, Le/f/b/b/q;->b:I

    .line 9
    invoke-virtual {p0, v1}, Le/f/b/b/q;->a(I)[Le/f/b/b/u;

    move-result-object v2

    iput-object v2, p0, Le/f/b/b/q;->d:[Le/f/b/b/u;

    .line 10
    div-int v2, p1, v1

    mul-int v1, v1, v2

    if-ge v1, p1, :cond_1

    add-int/lit8 v2, v2, 0x1

    :cond_1
    :goto_1
    if-ge v0, v2, :cond_2

    shl-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 11
    :cond_2
    :goto_2
    iget-object p1, p0, Le/f/b/b/q;->d:[Le/f/b/b/u;

    array-length v1, p1

    if-ge p2, v1, :cond_3

    const/4 v1, -0x1

    .line 12
    invoke-virtual {p0, v0, v1}, Le/f/b/b/q;->a(II)Le/f/b/b/u;

    move-result-object v1

    aput-object v1, p1, p2

    add-int/lit8 p2, p2, 0x1

    goto :goto_2

    :cond_3
    return-void
.end method

.method public static a(Le/f/b/b/l;)Le/f/b/b/q;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Le/f/b/b/l;",
            ")",
            "Le/f/b/b/q<",
            "TK;TV;+",
            "Le/f/b/b/r<",
            "TK;TV;*>;*>;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0}, Le/f/b/b/l;->d()Le/f/b/b/x;

    move-result-object v0

    sget-object v1, Le/f/b/b/x;->b:Le/f/b/b/x;

    if-ne v0, v1, :cond_0

    .line 3
    invoke-virtual {p0}, Le/f/b/b/l;->e()Le/f/b/b/x;

    move-result-object v0

    sget-object v1, Le/f/b/b/x;->b:Le/f/b/b/x;

    if-ne v0, v1, :cond_0

    .line 4
    new-instance v0, Le/f/b/b/q;

    invoke-static {}, Le/f/b/b/y;->b()Le/f/b/b/y;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Le/f/b/b/q;-><init>(Le/f/b/b/l;Le/f/b/b/s;)V

    return-object v0

    .line 5
    :cond_0
    invoke-virtual {p0}, Le/f/b/b/l;->d()Le/f/b/b/x;

    move-result-object v0

    sget-object v1, Le/f/b/b/x;->b:Le/f/b/b/x;

    if-ne v0, v1, :cond_1

    .line 6
    invoke-virtual {p0}, Le/f/b/b/l;->e()Le/f/b/b/x;

    move-result-object v0

    sget-object v1, Le/f/b/b/x;->c:Le/f/b/b/x;

    if-ne v0, v1, :cond_1

    .line 7
    new-instance v0, Le/f/b/b/q;

    invoke-static {}, Le/f/b/b/b0;->b()Le/f/b/b/b0;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Le/f/b/b/q;-><init>(Le/f/b/b/l;Le/f/b/b/s;)V

    return-object v0

    .line 8
    :cond_1
    invoke-virtual {p0}, Le/f/b/b/l;->d()Le/f/b/b/x;

    move-result-object v0

    sget-object v1, Le/f/b/b/x;->c:Le/f/b/b/x;

    if-ne v0, v1, :cond_2

    .line 9
    invoke-virtual {p0}, Le/f/b/b/l;->e()Le/f/b/b/x;

    move-result-object v0

    sget-object v1, Le/f/b/b/x;->b:Le/f/b/b/x;

    if-ne v0, v1, :cond_2

    .line 10
    new-instance v0, Le/f/b/b/q;

    invoke-static {}, Le/f/b/b/f0;->b()Le/f/b/b/f0;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Le/f/b/b/q;-><init>(Le/f/b/b/l;Le/f/b/b/s;)V

    return-object v0

    .line 11
    :cond_2
    invoke-virtual {p0}, Le/f/b/b/l;->d()Le/f/b/b/x;

    move-result-object v0

    sget-object v1, Le/f/b/b/x;->c:Le/f/b/b/x;

    if-ne v0, v1, :cond_3

    invoke-virtual {p0}, Le/f/b/b/l;->e()Le/f/b/b/x;

    move-result-object v0

    sget-object v1, Le/f/b/b/x;->c:Le/f/b/b/x;

    if-ne v0, v1, :cond_3

    .line 12
    new-instance v0, Le/f/b/b/q;

    invoke-static {}, Le/f/b/b/i0;->b()Le/f/b/b/i0;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Le/f/b/b/q;-><init>(Le/f/b/b/l;Le/f/b/b/s;)V

    return-object v0

    .line 13
    :cond_3
    new-instance p0, Ljava/lang/AssertionError;

    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    throw p0
.end method

.method public static synthetic a(Ljava/util/Collection;)Ljava/util/ArrayList;
    .locals 0

    .line 1
    invoke-static {p0}, Le/f/b/b/q;->b(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object p0

    return-object p0
.end method

.method public static b()Le/f/b/b/m0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            "E::",
            "Le/f/b/b/r<",
            "TK;TV;TE;>;>()",
            "Le/f/b/b/m0<",
            "TK;TV;TE;>;"
        }
    .end annotation

    .line 1
    sget-object v0, Le/f/b/b/q;->k:Le/f/b/b/m0;

    return-object v0
.end method

.method public static b(Ljava/util/Collection;)Ljava/util/ArrayList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Collection<",
            "TE;>;)",
            "Ljava/util/ArrayList<",
            "TE;>;"
        }
    .end annotation

    .line 5
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 6
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    invoke-static {v0, p0}, Le/f/b/b/j;->a(Ljava/util/Collection;Ljava/util/Iterator;)Z

    return-object v0
.end method

.method public static c(I)I
    .locals 2

    shl-int/lit8 v0, p0, 0xf

    xor-int/lit16 v0, v0, -0x3283

    add-int/2addr p0, v0

    ushr-int/lit8 v0, p0, 0xa

    xor-int/2addr p0, v0

    shl-int/lit8 v0, p0, 0x3

    add-int/2addr p0, v0

    ushr-int/lit8 v0, p0, 0x6

    xor-int/2addr p0, v0

    shl-int/lit8 v0, p0, 0x2

    shl-int/lit8 v1, p0, 0xe

    add-int/2addr v0, v1

    add-int/2addr p0, v0

    ushr-int/lit8 v0, p0, 0x10

    xor-int/2addr p0, v0

    return p0
.end method


# virtual methods
.method public a(Ljava/lang/Object;)I
    .locals 1

    .line 14
    iget-object v0, p0, Le/f/b/b/q;->f:Le/f/b/a/d;

    invoke-virtual {v0, p1}, Le/f/b/a/d;->b(Ljava/lang/Object;)I

    move-result p1

    .line 15
    invoke-static {p1}, Le/f/b/b/q;->c(I)I

    move-result p1

    return p1
.end method

.method public a()Le/f/b/a/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Le/f/b/a/d<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 23
    iget-object v0, p0, Le/f/b/b/q;->g:Le/f/b/b/s;

    invoke-interface {v0}, Le/f/b/b/s;->a()Le/f/b/b/x;

    move-result-object v0

    invoke-virtual {v0}, Le/f/b/b/x;->a()Le/f/b/a/d;

    move-result-object v0

    return-object v0
.end method

.method public a(II)Le/f/b/b/u;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Le/f/b/b/u<",
            "TK;TV;TE;TS;>;"
        }
    .end annotation

    .line 19
    iget-object v0, p0, Le/f/b/b/q;->g:Le/f/b/b/s;

    invoke-interface {v0, p0, p1, p2}, Le/f/b/b/s;->a(Le/f/b/b/q;II)Le/f/b/b/u;

    move-result-object p1

    return-object p1
.end method

.method public a(Le/f/b/b/r;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)TV;"
        }
    .end annotation

    .line 20
    invoke-interface {p1}, Le/f/b/b/r;->getKey()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 21
    :cond_0
    invoke-interface {p1}, Le/f/b/b/r;->getValue()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public a(Le/f/b/b/m0;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le/f/b/b/m0<",
            "TK;TV;TE;>;)V"
        }
    .end annotation

    .line 16
    invoke-interface {p1}, Le/f/b/b/m0;->a()Le/f/b/b/r;

    move-result-object v0

    .line 17
    invoke-interface {v0}, Le/f/b/b/r;->c()I

    move-result v1

    .line 18
    invoke-virtual {p0, v1}, Le/f/b/b/q;->b(I)Le/f/b/b/u;

    move-result-object v2

    invoke-interface {v0}, Le/f/b/b/r;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v2, v0, v1, p1}, Le/f/b/b/u;->a(Ljava/lang/Object;ILe/f/b/b/m0;)Z

    return-void
.end method

.method public final a(I)[Le/f/b/b/u;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)[",
            "Le/f/b/b/u<",
            "TK;TV;TE;TS;>;"
        }
    .end annotation

    .line 22
    new-array p1, p1, [Le/f/b/b/u;

    return-object p1
.end method

.method public b(I)Le/f/b/b/u;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Le/f/b/b/u<",
            "TK;TV;TE;TS;>;"
        }
    .end annotation

    .line 4
    iget-object v0, p0, Le/f/b/b/q;->d:[Le/f/b/b/u;

    iget v1, p0, Le/f/b/b/q;->c:I

    ushr-int/2addr p1, v1

    iget v1, p0, Le/f/b/b/q;->b:I

    and-int/2addr p1, v1

    aget-object p1, v0, p1

    return-object p1
.end method

.method public b(Le/f/b/b/r;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)V"
        }
    .end annotation

    .line 2
    invoke-interface {p1}, Le/f/b/b/r;->c()I

    move-result v0

    .line 3
    invoke-virtual {p0, v0}, Le/f/b/b/q;->b(I)Le/f/b/b/u;

    move-result-object v1

    invoke-virtual {v1, p1, v0}, Le/f/b/b/u;->a(Le/f/b/b/r;I)Z

    return-void
.end method

.method public clear()V
    .locals 4

    .line 1
    iget-object v0, p0, Le/f/b/b/q;->d:[Le/f/b/b/u;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    .line 2
    invoke-virtual {v3}, Le/f/b/b/u;->a()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public containsKey(Ljava/lang/Object;)Z
    .locals 2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 1
    :cond_0
    invoke-virtual {p0, p1}, Le/f/b/b/q;->a(Ljava/lang/Object;)I

    move-result v0

    .line 2
    invoke-virtual {p0, v0}, Le/f/b/b/q;->b(I)Le/f/b/b/u;

    move-result-object v1

    invoke-virtual {v1, p1, v0}, Le/f/b/b/u;->a(Ljava/lang/Object;I)Z

    move-result p1

    return p1
.end method

.method public containsValue(Ljava/lang/Object;)Z
    .locals 16

    move-object/from16 v0, p1

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    move-object/from16 v2, p0

    .line 1
    iget-object v3, v2, Le/f/b/b/q;->d:[Le/f/b/b/u;

    const-wide/16 v4, -0x1

    const/4 v6, 0x0

    :goto_0
    const/4 v7, 0x3

    if-ge v6, v7, :cond_6

    const-wide/16 v7, 0x0

    .line 2
    array-length v9, v3

    const/4 v10, 0x0

    :goto_1
    if-ge v10, v9, :cond_4

    aget-object v11, v3, v10

    .line 3
    iget v12, v11, Le/f/b/b/u;->c:I

    .line 4
    iget-object v12, v11, Le/f/b/b/u;->f:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    const/4 v13, 0x0

    .line 5
    :goto_2
    invoke-virtual {v12}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->length()I

    move-result v14

    if-ge v13, v14, :cond_3

    .line 6
    invoke-virtual {v12, v13}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Le/f/b/b/r;

    :goto_3
    if-eqz v14, :cond_2

    .line 7
    invoke-virtual {v11, v14}, Le/f/b/b/u;->a(Le/f/b/b/r;)Ljava/lang/Object;

    move-result-object v15

    if-eqz v15, :cond_1

    .line 8
    invoke-virtual/range {p0 .. p0}, Le/f/b/b/q;->a()Le/f/b/a/d;

    move-result-object v1

    invoke-virtual {v1, v0, v15}, Le/f/b/a/d;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v0, 0x1

    return v0

    .line 9
    :cond_1
    invoke-interface {v14}, Le/f/b/b/r;->b()Le/f/b/b/r;

    move-result-object v14

    const/4 v1, 0x0

    goto :goto_3

    :cond_2
    add-int/lit8 v13, v13, 0x1

    const/4 v1, 0x0

    goto :goto_2

    .line 10
    :cond_3
    iget v1, v11, Le/f/b/b/u;->d:I

    int-to-long v11, v1

    add-long/2addr v7, v11

    add-int/lit8 v10, v10, 0x1

    const/4 v1, 0x0

    goto :goto_1

    :cond_4
    cmp-long v1, v7, v4

    if-nez v1, :cond_5

    goto :goto_4

    :cond_5
    add-int/lit8 v6, v6, 0x1

    move-wide v4, v7

    const/4 v1, 0x0

    goto :goto_0

    :cond_6
    :goto_4
    const/4 v0, 0x0

    return v0
.end method

.method public entrySet()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/f/b/b/q;->j:Ljava/util/Set;

    if-eqz v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    new-instance v0, Le/f/b/b/q$b;

    invoke-direct {v0, p0}, Le/f/b/b/q$b;-><init>(Le/f/b/b/q;)V

    iput-object v0, p0, Le/f/b/b/q;->j:Ljava/util/Set;

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

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 1
    :cond_0
    invoke-virtual {p0, p1}, Le/f/b/b/q;->a(Ljava/lang/Object;)I

    move-result v0

    .line 2
    invoke-virtual {p0, v0}, Le/f/b/b/q;->b(I)Le/f/b/b/u;

    move-result-object v1

    invoke-virtual {v1, p1, v0}, Le/f/b/b/u;->b(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public isEmpty()Z
    .locals 10

    .line 1
    iget-object v0, p0, Le/f/b/b/q;->d:[Le/f/b/b/u;

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    move-wide v5, v1

    const/4 v4, 0x0

    .line 2
    :goto_0
    array-length v7, v0

    if-ge v4, v7, :cond_1

    .line 3
    aget-object v7, v0, v4

    iget v7, v7, Le/f/b/b/u;->c:I

    if-eqz v7, :cond_0

    return v3

    .line 4
    :cond_0
    aget-object v7, v0, v4

    iget v7, v7, Le/f/b/b/u;->d:I

    int-to-long v7, v7

    add-long/2addr v5, v7

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x1

    cmp-long v7, v5, v1

    if-eqz v7, :cond_5

    const/4 v7, 0x0

    .line 5
    :goto_1
    array-length v8, v0

    if-ge v7, v8, :cond_3

    .line 6
    aget-object v8, v0, v7

    iget v8, v8, Le/f/b/b/u;->c:I

    if-eqz v8, :cond_2

    return v3

    .line 7
    :cond_2
    aget-object v8, v0, v7

    iget v8, v8, Le/f/b/b/u;->d:I

    int-to-long v8, v8

    sub-long/2addr v5, v8

    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_3
    cmp-long v0, v5, v1

    if-nez v0, :cond_4

    const/4 v3, 0x1

    :cond_4
    return v3

    :cond_5
    return v4
.end method

.method public keySet()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "TK;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/f/b/b/q;->h:Ljava/util/Set;

    if-eqz v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    new-instance v0, Le/f/b/b/q$e;

    invoke-direct {v0, p0}, Le/f/b/b/q$e;-><init>(Le/f/b/b/q;)V

    iput-object v0, p0, Le/f/b/b/q;->h:Ljava/util/Set;

    :goto_0
    return-object v0
.end method

.method public put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)TV;"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Le/f/b/a/p;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    invoke-static {p2}, Le/f/b/a/p;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    invoke-virtual {p0, p1}, Le/f/b/b/q;->a(Ljava/lang/Object;)I

    move-result v0

    .line 4
    invoke-virtual {p0, v0}, Le/f/b/b/q;->b(I)Le/f/b/b/u;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, p1, v0, p2, v2}, Le/f/b/b/u;->a(Ljava/lang/Object;ILjava/lang/Object;Z)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public putAll(Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "+TK;+TV;>;)V"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 2
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v1, v0}, Le/f/b/b/q;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-void
.end method

.method public putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)TV;"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Le/f/b/a/p;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    invoke-static {p2}, Le/f/b/a/p;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    invoke-virtual {p0, p1}, Le/f/b/b/q;->a(Ljava/lang/Object;)I

    move-result v0

    .line 4
    invoke-virtual {p0, v0}, Le/f/b/b/q;->b(I)Le/f/b/b/u;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, p1, v0, p2, v2}, Le/f/b/b/u;->a(Ljava/lang/Object;ILjava/lang/Object;Z)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")TV;"
        }
    .end annotation

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 1
    :cond_0
    invoke-virtual {p0, p1}, Le/f/b/b/q;->a(Ljava/lang/Object;)I

    move-result v0

    .line 2
    invoke-virtual {p0, v0}, Le/f/b/b/q;->b(I)Le/f/b/b/u;

    move-result-object v1

    invoke-virtual {v1, p1, v0}, Le/f/b/b/u;->e(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public remove(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 2

    if-eqz p1, :cond_1

    if-nez p2, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {p0, p1}, Le/f/b/b/q;->a(Ljava/lang/Object;)I

    move-result v0

    .line 4
    invoke-virtual {p0, v0}, Le/f/b/b/q;->b(I)Le/f/b/b/u;

    move-result-object v1

    invoke-virtual {v1, p1, v0, p2}, Le/f/b/b/u;->a(Ljava/lang/Object;ILjava/lang/Object;)Z

    move-result p1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)TV;"
        }
    .end annotation

    .line 5
    invoke-static {p1}, Le/f/b/a/p;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    invoke-static {p2}, Le/f/b/a/p;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    invoke-virtual {p0, p1}, Le/f/b/b/q;->a(Ljava/lang/Object;)I

    move-result v0

    .line 8
    invoke-virtual {p0, v0}, Le/f/b/b/q;->b(I)Le/f/b/b/u;

    move-result-object v1

    invoke-virtual {v1, p1, v0, p2}, Le/f/b/b/u;->b(Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;TV;)Z"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Le/f/b/a/p;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    invoke-static {p3}, Le/f/b/a/p;->a(Ljava/lang/Object;)Ljava/lang/Object;

    if-nez p2, :cond_0

    const/4 p1, 0x0

    return p1

    .line 3
    :cond_0
    invoke-virtual {p0, p1}, Le/f/b/b/q;->a(Ljava/lang/Object;)I

    move-result v0

    .line 4
    invoke-virtual {p0, v0}, Le/f/b/b/q;->b(I)Le/f/b/b/u;

    move-result-object v1

    invoke-virtual {v1, p1, v0, p2, p3}, Le/f/b/b/u;->a(Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public size()I
    .locals 6

    .line 1
    iget-object v0, p0, Le/f/b/b/q;->d:[Le/f/b/b/u;

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    .line 2
    :goto_0
    array-length v4, v0

    if-ge v3, v4, :cond_0

    .line 3
    aget-object v4, v0, v3

    iget v4, v4, Le/f/b/b/u;->c:I

    int-to-long v4, v4

    add-long/2addr v1, v4

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 4
    :cond_0
    invoke-static {v1, v2}, Le/f/b/e/c;->a(J)I

    move-result v0

    return v0
.end method

.method public values()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "TV;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/f/b/b/q;->i:Ljava/util/Collection;

    if-eqz v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    new-instance v0, Le/f/b/b/q$g;

    invoke-direct {v0, p0}, Le/f/b/b/q$g;-><init>(Le/f/b/b/q;)V

    iput-object v0, p0, Le/f/b/b/q;->i:Ljava/util/Collection;

    :goto_0
    return-object v0
.end method
