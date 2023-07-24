.class public Le/h/d/a/a/g/y;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/concurrent/ConcurrentLinkedDeque<",
            "Ljava/lang/Integer;",
            ">;>;>;"
        }
    .end annotation
.end field

.field public b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/Date;",
            ">;"
        }
    .end annotation
.end field

.field public c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/Date;",
            ">;"
        }
    .end annotation
.end field

.field public d:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Le/h/d/a/a/g/y;->a:Ljava/util/Map;

    .line 3
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Le/h/d/a/a/g/y;->b:Ljava/util/Map;

    .line 4
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Le/h/d/a/a/g/y;->c:Ljava/util/Map;

    .line 5
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Le/h/d/a/a/g/y;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/Map$Entry;)D
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map$Entry<",
            "Ljava/lang/String;",
            "Ljava/util/concurrent/ConcurrentLinkedDeque<",
            "Ljava/lang/Integer;",
            ">;>;)D"
        }
    .end annotation

    .line 43
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Le/f/b/d/d;->a(Ljava/lang/Iterable;)D

    move-result-wide v0

    return-wide v0
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Boolean;
    .locals 8

    .line 8
    iget-object v0, p0, Le/h/d/a/a/g/y;->c:Ljava/util/Map;

    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Date;

    if-eqz v0, :cond_3

    .line 9
    new-instance v1, Ljava/util/Date;

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    const-wide/16 v4, 0x2710

    add-long/2addr v2, v4

    invoke-direct {v1, v2, v3}, Ljava/util/Date;-><init>(J)V

    invoke-static {}, Le/h/d/a/a/n/t;->b()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/Date;->before(Ljava/util/Date;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 10
    iget-object p1, p0, Le/h/d/a/a/g/y;->c:Ljava/util/Map;

    invoke-interface {p1, p2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    .line 12
    :cond_0
    sget-object v0, Le/h/d/a/a/w/r;->a:Le/h/d/a/a/w/q;

    invoke-virtual {v0}, Le/h/d/a/a/w/q;->a()Le/h/d/a/a/w/r;

    move-result-object v0

    invoke-virtual {v0, p2}, Le/h/d/a/a/w/r;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 13
    invoke-virtual {p0, p2}, Le/h/d/a/a/g/y;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "Packid.RssiHistory"

    const/4 v4, 0x2

    const/4 v5, 0x3

    const/4 v6, 0x1

    if-eqz v0, :cond_1

    new-array v2, v5, [Ljava/lang/Object;

    aput-object p2, v2, v1

    aput-object v0, v2, v6

    aput-object p1, v2, v4

    const-string v4, "ZoneKey : %s,Device With Best Average : %s, currentDevice : %s"

    .line 14
    invoke-static {v4, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 15
    iget-object v2, p0, Le/h/d/a/a/g/y;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v2, p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    goto :goto_0

    .line 16
    :cond_1
    iget-object v0, p0, Le/h/d/a/a/g/y;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    invoke-virtual {v0, v7}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    new-array v0, v5, [Ljava/lang/Object;

    aput-object p2, v0, v1

    aput-object v2, v0, v6

    aput-object p1, v0, v4

    const-string p1, "ZoneKey : %s, Nearest Device : %s, currentDevice : %s"

    .line 17
    invoke-static {p1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 18
    :goto_0
    iget-object p1, p0, Le/h/d/a/a/g/y;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 19
    iget-object p1, p0, Le/h/d/a/a/g/y;->c:Ljava/util/Map;

    invoke-interface {p1, p2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    .line 21
    :cond_2
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :cond_3
    const/4 p1, 0x0

    return-object p1
.end method

.method public final a(ILfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;)Ljava/util/concurrent/ConcurrentLinkedDeque;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lfr/mbs/binary/Octets;",
            "Lfr/mbs/binary/Octets;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/concurrent/ConcurrentLinkedDeque<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 28
    invoke-virtual {p0, p2, p3, p4}, Le/h/d/a/a/g/y;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;)Ljava/util/concurrent/ConcurrentLinkedDeque;

    move-result-object p2

    .line 29
    invoke-virtual {p0, p1, p2}, Le/h/d/a/a/g/y;->a(ILjava/util/concurrent/ConcurrentLinkedDeque;)Ljava/util/concurrent/ConcurrentLinkedDeque;

    return-object p2
.end method

.method public final a(ILjava/util/concurrent/ConcurrentLinkedDeque;)Ljava/util/concurrent/ConcurrentLinkedDeque;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/concurrent/ConcurrentLinkedDeque<",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/util/concurrent/ConcurrentLinkedDeque<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 30
    :goto_0
    invoke-virtual {p2}, Ljava/util/concurrent/ConcurrentLinkedDeque;->size()I

    move-result v0

    const/4 v1, 0x1

    if-lt v0, v1, :cond_0

    .line 31
    invoke-virtual {p2}, Ljava/util/concurrent/ConcurrentLinkedDeque;->removeFirst()Ljava/lang/Object;

    goto :goto_0

    .line 32
    :cond_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/util/concurrent/ConcurrentLinkedDeque;->add(Ljava/lang/Object;)Z

    return-object p2
.end method

.method public final a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;)Ljava/util/concurrent/ConcurrentLinkedDeque;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfr/mbs/binary/Octets;",
            "Lfr/mbs/binary/Octets;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/concurrent/ConcurrentLinkedDeque<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 33
    invoke-virtual {p0, p1, p2}, Le/h/d/a/a/g/y;->b(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)Ljava/lang/String;

    move-result-object p1

    .line 34
    iget-object p2, p0, Le/h/d/a/a/g/y;->a:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/Map;

    if-nez p2, :cond_0

    .line 35
    new-instance p2, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p2}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 36
    iget-object v0, p0, Le/h/d/a/a/g/y;->a:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    :cond_0
    invoke-interface {p2, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/concurrent/ConcurrentLinkedDeque;

    if-nez p1, :cond_1

    .line 38
    new-instance p1, Ljava/util/concurrent/ConcurrentLinkedDeque;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentLinkedDeque;-><init>()V

    .line 39
    invoke-interface {p2, p3, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object p1
.end method

.method public a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)V
    .locals 1

    .line 42
    iget-object v0, p0, Le/h/d/a/a/g/y;->c:Ljava/util/Map;

    invoke-virtual {p0, p1, p2}, Le/h/d/a/a/g/y;->b(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)Ljava/lang/String;

    move-result-object p1

    invoke-static {}, Le/h/d/a/a/n/t;->b()Ljava/util/Date;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 5

    .line 22
    iget-object v0, p0, Le/h/d/a/a/g/y;->b:Ljava/util/Map;

    invoke-static {}, Le/h/d/a/a/n/t;->b()Ljava/util/Date;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 p1, 0x8

    .line 23
    invoke-static {p1}, Le/h/d/a/a/n/t;->b(I)Ljava/util/Date;

    move-result-object p1

    .line 24
    iget-object v0, p0, Le/h/d/a/a/g/y;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 25
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Date;

    invoke-virtual {v2, p1}, Ljava/util/Date;->before(Ljava/util/Date;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 26
    iget-object v2, p0, Le/h/d/a/a/g/y;->a:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map;

    .line 27
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    return-void
.end method

.method public a(ILcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Lfr/mbs/binary/Octets;Ljava/lang/String;)Z
    .locals 7

    .line 1
    invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getRssi()B

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getZoneId()Lfr/mbs/binary/Octets;

    move-result-object v4

    move-object v1, p0

    move v2, p1

    move-object v5, p3

    move-object v6, p4

    invoke-virtual/range {v1 .. v6}, Le/h/d/a/a/g/y;->a(ILjava/lang/Integer;Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public a(ILjava/lang/Integer;Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;)Z
    .locals 0

    .line 2
    invoke-virtual {p0, p5}, Le/h/d/a/a/g/y;->a(Ljava/lang/String;)V

    .line 3
    invoke-virtual {p0, p1, p4, p3, p5}, Le/h/d/a/a/g/y;->a(ILfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;)Ljava/util/concurrent/ConcurrentLinkedDeque;

    move-result-object p1

    .line 4
    invoke-virtual {p0, p4, p3}, Le/h/d/a/a/g/y;->b(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p0, p5, p3}, Le/h/d/a/a/g/y;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object p3

    if-eqz p3, :cond_0

    .line 5
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1

    .line 6
    :cond_0
    invoke-virtual {p0, p2, p1}, Le/h/d/a/a/g/y;->a(Ljava/lang/Integer;Ljava/util/concurrent/ConcurrentLinkedDeque;)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 7
    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentLinkedDeque;->clear()V

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final a(Ljava/lang/Integer;Ljava/util/concurrent/ConcurrentLinkedDeque;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Integer;",
            "Ljava/util/concurrent/ConcurrentLinkedDeque<",
            "Ljava/lang/Integer;",
            ">;)Z"
        }
    .end annotation

    .line 40
    invoke-virtual {p2}, Ljava/util/concurrent/ConcurrentLinkedDeque;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    .line 41
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-lt v0, v1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final b(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)Ljava/lang/String;
    .locals 1

    .line 8
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 1
    iget-object v0, p0, Le/h/d/a/a/g/y;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    .line 2
    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    .line 3
    :cond_0
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const-wide/high16 v1, -0x3e20000000000000L    # -2.147483648E9

    .line 4
    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 5
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    .line 6
    invoke-virtual {p0, v3}, Le/h/d/a/a/g/y;->a(Ljava/util/Map$Entry;)D

    move-result-wide v4

    cmpl-double v6, v4, v1

    if-lez v6, :cond_1

    .line 7
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    move-wide v1, v4

    goto :goto_0

    :cond_2
    :goto_1
    return-object v0
.end method
