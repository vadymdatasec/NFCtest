.class public final Le/f/b/b/q$b;
.super Le/f/b/b/t;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le/f/b/b/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Le/f/b/b/t<",
        "Ljava/util/Map$Entry<",
        "TK;TV;>;>;"
    }
.end annotation


# instance fields
.field public final synthetic b:Le/f/b/b/q;


# direct methods
.method public constructor <init>(Le/f/b/b/q;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le/f/b/b/q$b;->b:Le/f/b/b/q;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Le/f/b/b/t;-><init>(Le/f/b/b/m;)V

    return-void
.end method


# virtual methods
.method public clear()V
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/b/b/q$b;->b:Le/f/b/b/q;

    invoke-virtual {v0}, Le/f/b/b/q;->clear()V

    return-void
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    instance-of v0, p1, Ljava/util/Map$Entry;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 2
    :cond_0
    check-cast p1, Ljava/util/Map$Entry;

    .line 3
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    return v1

    .line 4
    :cond_1
    iget-object v2, p0, Le/f/b/b/q$b;->b:Le/f/b/b/q;

    invoke-virtual {v2, v0}, Le/f/b/b/q;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 5
    iget-object v2, p0, Le/f/b/b/q$b;->b:Le/f/b/b/q;

    invoke-virtual {v2}, Le/f/b/b/q;->a()Le/f/b/a/d;

    move-result-object v2

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v2, p1, v0}, Le/f/b/a/d;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 v1, 0x1

    :cond_2
    return v1
.end method

.method public isEmpty()Z
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/b/b/q$b;->b:Le/f/b/b/q;

    invoke-virtual {v0}, Le/f/b/b/q;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Le/f/b/b/q$a;

    iget-object v1, p0, Le/f/b/b/q$b;->b:Le/f/b/b/q;

    invoke-direct {v0, v1}, Le/f/b/b/q$a;-><init>(Le/f/b/b/q;)V

    return-object v0
.end method

.method public remove(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    instance-of v0, p1, Ljava/util/Map$Entry;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 2
    :cond_0
    check-cast p1, Ljava/util/Map$Entry;

    .line 3
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 4
    iget-object v2, p0, Le/f/b/b/q$b;->b:Le/f/b/b/q;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v2, v0, p1}, Le/f/b/b/q;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public size()I
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/b/b/q$b;->b:Le/f/b/b/q;

    invoke-virtual {v0}, Le/f/b/b/q;->size()I

    move-result v0

    return v0
.end method
