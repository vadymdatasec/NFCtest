.class public final Le/f/e/r/j;
.super Le/f/e/r/k;
.source "SourceFile"


# instance fields
.field public final a:[Le/f/e/r/p;


# direct methods
.method public constructor <init>(Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Le/f/e/d;",
            "*>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Le/f/e/r/k;-><init>()V

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 2
    :cond_0
    sget-object v0, Le/f/e/d;->d:Le/f/e/d;

    .line 3
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    .line 4
    :goto_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    if-eqz p1, :cond_4

    .line 5
    sget-object v1, Le/f/e/a;->i:Le/f/e/a;

    invoke-interface {p1, v1}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 6
    new-instance v1, Le/f/e/r/e;

    invoke-direct {v1}, Le/f/e/r/e;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 7
    :cond_1
    sget-object v1, Le/f/e/a;->p:Le/f/e/a;

    invoke-interface {p1, v1}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 8
    new-instance v1, Le/f/e/r/l;

    invoke-direct {v1}, Le/f/e/r/l;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 9
    :cond_2
    :goto_1
    sget-object v1, Le/f/e/a;->h:Le/f/e/a;

    invoke-interface {p1, v1}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 10
    new-instance v1, Le/f/e/r/f;

    invoke-direct {v1}, Le/f/e/r/f;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 11
    :cond_3
    sget-object v1, Le/f/e/a;->q:Le/f/e/a;

    invoke-interface {p1, v1}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 12
    new-instance p1, Le/f/e/r/q;

    invoke-direct {p1}, Le/f/e/r/q;-><init>()V

    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 13
    :cond_4
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_5

    .line 14
    new-instance p1, Le/f/e/r/e;

    invoke-direct {p1}, Le/f/e/r/e;-><init>()V

    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 15
    new-instance p1, Le/f/e/r/f;

    invoke-direct {p1}, Le/f/e/r/f;-><init>()V

    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 16
    new-instance p1, Le/f/e/r/q;

    invoke-direct {p1}, Le/f/e/r/q;-><init>()V

    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 17
    :cond_5
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result p1

    new-array p1, p1, [Le/f/e/r/p;

    invoke-interface {v0, p1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Le/f/e/r/p;

    iput-object p1, p0, Le/f/e/r/j;->a:[Le/f/e/r/p;

    return-void
.end method


# virtual methods
.method public a(ILe/f/e/o/a;Ljava/util/Map;)Le/f/e/j;
    .locals 6
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
            Lcom/google/zxing/NotFoundException;
        }
    .end annotation

    .line 1
    invoke-static {p2}, Le/f/e/r/p;->a(Le/f/e/o/a;)[I

    move-result-object v0

    .line 2
    iget-object v1, p0, Le/f/e/r/j;->a:[Le/f/e/r/p;

    array-length v2, v1

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_5

    aget-object v5, v1, v4

    .line 3
    :try_start_0
    invoke-virtual {v5, p1, p2, v0, p3}, Le/f/e/r/p;->a(ILe/f/e/o/a;[ILjava/util/Map;)Le/f/e/j;

    move-result-object p1
    :try_end_0
    .catch Lcom/google/zxing/ReaderException; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    invoke-virtual {p1}, Le/f/e/j;->a()Le/f/e/a;

    move-result-object p2

    sget-object v0, Le/f/e/a;->i:Le/f/e/a;

    const/4 v1, 0x1

    if-ne p2, v0, :cond_0

    .line 5
    invoke-virtual {p1}, Le/f/e/j;->e()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2, v3}, Ljava/lang/String;->charAt(I)C

    move-result p2

    const/16 v0, 0x30

    if-ne p2, v0, :cond_0

    const/4 p2, 0x1

    goto :goto_1

    :cond_0
    const/4 p2, 0x0

    :goto_1
    if-nez p3, :cond_1

    const/4 p3, 0x0

    goto :goto_2

    .line 6
    :cond_1
    sget-object v0, Le/f/e/d;->d:Le/f/e/d;

    .line 7
    invoke-interface {p3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/Collection;

    :goto_2
    if-eqz p3, :cond_2

    .line 8
    sget-object v0, Le/f/e/a;->p:Le/f/e/a;

    invoke-interface {p3, v0}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_3

    :cond_2
    const/4 v3, 0x1

    :cond_3
    if-eqz p2, :cond_4

    if-eqz v3, :cond_4

    .line 9
    new-instance p2, Le/f/e/j;

    invoke-virtual {p1}, Le/f/e/j;->e()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p3

    .line 10
    invoke-virtual {p1}, Le/f/e/j;->b()[B

    move-result-object v0

    .line 11
    invoke-virtual {p1}, Le/f/e/j;->d()[Le/f/e/l;

    move-result-object v1

    sget-object v2, Le/f/e/a;->p:Le/f/e/a;

    invoke-direct {p2, p3, v0, v1, v2}, Le/f/e/j;-><init>(Ljava/lang/String;[B[Le/f/e/l;Le/f/e/a;)V

    .line 12
    invoke-virtual {p1}, Le/f/e/j;->c()Ljava/util/Map;

    move-result-object p1

    invoke-virtual {p2, p1}, Le/f/e/j;->a(Ljava/util/Map;)V

    return-object p2

    :cond_4
    return-object p1

    :catch_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 13
    :cond_5
    invoke-static {}, Lcom/google/zxing/NotFoundException;->a()Lcom/google/zxing/NotFoundException;

    move-result-object p1

    throw p1
.end method

.method public a()V
    .locals 4

    .line 14
    iget-object v0, p0, Le/f/e/r/j;->a:[Le/f/e/r/p;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    .line 15
    invoke-interface {v3}, Le/f/e/i;->a()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
