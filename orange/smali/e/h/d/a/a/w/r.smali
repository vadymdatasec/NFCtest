.class public final Le/h/d/a/a/w/r;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Le/h/d/a/a/w/q;

.field public static b:Le/h/d/a/a/w/r;

.field public static c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Landroid/bluetooth/BluetoothDevice;",
            "Le/h/d/a/a/w/p;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Le/h/d/a/a/w/q;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Le/h/d/a/a/w/q;-><init>(Li/h/c/g;)V

    sput-object v0, Le/h/d/a/a/w/r;->a:Le/h/d/a/a/w/q;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Li/h/c/g;)V
    .locals 0

    invoke-direct {p0}, Le/h/d/a/a/w/r;-><init>()V

    return-void
.end method

.method public static final synthetic a(Le/h/d/a/a/w/r;)V
    .locals 0

    .line 1
    sput-object p0, Le/h/d/a/a/w/r;->b:Le/h/d/a/a/w/r;

    return-void
.end method

.method public static final synthetic a(Ljava/util/Map;)V
    .locals 0

    .line 2
    sput-object p0, Le/h/d/a/a/w/r;->c:Ljava/util/Map;

    return-void
.end method

.method public static final synthetic b()Le/h/d/a/a/w/r;
    .locals 1

    .line 1
    sget-object v0, Le/h/d/a/a/w/r;->b:Le/h/d/a/a/w/r;

    return-object v0
.end method


# virtual methods
.method public final a(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Lcom/orange/oab/contactless/packid/hce/user/User;)Ljava/lang/String;
    .locals 0

    .line 16
    invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/User;->getContactlessId()Lfr/mbs/binary/Octets;

    move-result-object p2

    invoke-virtual {p2}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getZoneId()Lfr/mbs/binary/Octets;

    move-result-object p1

    invoke-virtual {p1}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Li/h/c/k;->a(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final declared-synchronized a(Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    monitor-enter p0

    :try_start_0
    const-string v0, "zoneKey"

    invoke-static {p1, v0}, Li/h/c/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    sget-object v0, Le/h/d/a/a/w/r;->c:Ljava/util/Map;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move-object p1, v1

    goto :goto_0

    :cond_0
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    :goto_0
    if-eqz p1, :cond_7

    .line 18
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_1

    move-object v0, v1

    goto :goto_1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_1

    :cond_2
    move-object v2, v0

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le/h/d/a/a/w/p;

    invoke-virtual {v2}, Le/h/d/a/a/w/p;->a()D

    move-result-wide v2

    :cond_3
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Ljava/util/Map$Entry;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Le/h/d/a/a/w/p;

    invoke-virtual {v5}, Le/h/d/a/a/w/p;->a()D

    move-result-wide v5

    invoke-static {v2, v3, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v7

    if-gez v7, :cond_4

    move-object v0, v4

    move-wide v2, v5

    :cond_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_3

    :goto_1
    check-cast v0, Ljava/util/Map$Entry;

    if-nez v0, :cond_5

    goto :goto_2

    :cond_5
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/bluetooth/BluetoothDevice;

    if-nez p1, :cond_6

    goto :goto_2

    :cond_6
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_2
    monitor-exit p0

    return-object v1

    :cond_7
    monitor-exit p0

    return-object v1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized a()V
    .locals 7

    monitor-enter p0

    .line 19
    :try_start_0
    sget-object v0, Le/h/d/a/a/w/r;->c:Ljava/util/Map;

    if-nez v0, :cond_0

    goto :goto_1

    .line 20
    :cond_0
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    .line 21
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/bluetooth/BluetoothDevice;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Le/h/d/a/a/w/p;

    const/4 v5, 0x1

    const/4 v6, 0x0

    .line 22
    invoke-static {v3, v6, v5, v6}, Le/h/d/a/a/w/p;->a(Le/h/d/a/a/w/p;Ljava/lang/Integer;ILjava/lang/Object;)V

    .line 23
    invoke-virtual {p0, v3, v2, v4}, Le/h/d/a/a/w/r;->a(Le/h/d/a/a/w/p;Ljava/lang/String;Landroid/bluetooth/BluetoothDevice;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_2
    :goto_1
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized a(ILcom/orange/oab/contactless/packid/hce/user/User;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Landroid/bluetooth/BluetoothDevice;)V
    .locals 3

    monitor-enter p0

    :try_start_0
    const-string v0, "user"

    invoke-static {p2, v0}, Li/h/c/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "badge"

    invoke-static {p3, v0}, Li/h/c/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "peripheral"

    invoke-static {p4, v0}, Li/h/c/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-virtual {p0}, Le/h/d/a/a/w/r;->a()V

    .line 4
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    .line 5
    invoke-virtual {p0, p3, p2}, Le/h/d/a/a/w/r;->a(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Lcom/orange/oab/contactless/packid/hce/user/User;)Ljava/lang/String;

    move-result-object p2

    .line 6
    sget-object v1, Le/h/d/a/a/w/r;->c:Ljava/util/Map;

    if-nez v1, :cond_0

    goto :goto_0

    .line 7
    :cond_0
    invoke-interface {v1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_1

    .line 8
    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 9
    invoke-interface {v1, p2, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    :cond_1
    check-cast v2, Ljava/util/Map;

    .line 11
    invoke-interface {v2, p4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-nez p2, :cond_2

    .line 12
    new-instance p2, Le/h/d/a/a/w/p;

    invoke-direct {p2}, Le/h/d/a/a/w/p;-><init>()V

    invoke-virtual {p3}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getRssiDurationForButtonComputation()Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {p2, p3}, Le/h/d/a/a/w/p;->b(Ljava/lang/Integer;)V

    .line 13
    invoke-interface {v2, p4, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    :cond_2
    check-cast p2, Le/h/d/a/a/w/p;

    .line 15
    new-instance p3, Le/h/d/a/a/w/o;

    invoke-direct {p3, p1, v0}, Le/h/d/a/a/w/o;-><init>(ILjava/util/Date;)V

    invoke-virtual {p2, p3}, Le/h/d/a/a/w/p;->a(Le/h/d/a/a/w/o;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized a(Le/h/d/a/a/w/p;Ljava/lang/String;Landroid/bluetooth/BluetoothDevice;)V
    .locals 2

    monitor-enter p0

    .line 24
    :try_start_0
    sget-object v0, Le/h/d/a/a/w/r;->c:Ljava/util/Map;

    if-nez v0, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    .line 25
    :cond_0
    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_1

    .line 26
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 27
    invoke-interface {v0, p2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    :cond_1
    move-object p2, v1

    check-cast p2, Ljava/util/Map;

    .line 29
    :goto_0
    invoke-static {p2}, Li/h/c/k;->a(Ljava/lang/Object;)V

    invoke-interface {p2, p3, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
