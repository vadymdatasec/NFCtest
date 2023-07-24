.class public final Le/h/d/a/a/v/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le/h/d/a/a/v/b$a;
    }
.end annotation


# static fields
.field public static final e:Le/h/d/a/a/v/b$a;


# instance fields
.field public final a:Ljava/lang/String;

.field public b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Le/h/d/a/a/v/d;",
            ">;"
        }
    .end annotation
.end field

.field public c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Le/h/d/a/a/v/f;",
            ">;"
        }
    .end annotation
.end field

.field public d:Landroid/content/Context;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Le/h/d/a/a/v/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Le/h/d/a/a/v/b$a;-><init>(Li/h/c/g;)V

    sput-object v0, Le/h/d/a/a/v/b;->e:Le/h/d/a/a/v/b$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    const-class v0, Le/h/d/a/a/v/b;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Le/h/d/a/a/v/b;->a:Ljava/lang/String;

    .line 3
    iput-object p1, p0, Le/h/d/a/a/v/b;->d:Landroid/content/Context;

    .line 4
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Le/h/d/a/a/v/b;->b:Ljava/util/ArrayList;

    .line 5
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Le/h/d/a/a/v/b;->c:Ljava/util/ArrayList;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Li/h/c/g;)V
    .locals 0

    invoke-direct {p0, p1}, Le/h/d/a/a/v/b;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public final a(II)Lcom/orange/oab/contactless/packid/rssi/RssiLevel;
    .locals 6

    .line 18
    sget-object v0, Lcom/orange/oab/contactless/packid/rssi/RssiLevel;->ZERO:Lcom/orange/oab/contactless/packid/rssi/RssiLevel;

    .line 19
    invoke-static {}, Lcom/orange/oab/contactless/packid/rssi/RssiLevel;->values()[Lcom/orange/oab/contactless/packid/rssi/RssiLevel;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :cond_0
    :goto_0
    if-ge v3, v2, :cond_2

    aget-object v4, v1, v3

    add-int/lit8 v3, v3, 0x1

    .line 20
    sget-object v5, Lcom/orange/oab/contactless/packid/rssi/RssiLevel;->ZERO:Lcom/orange/oab/contactless/packid/rssi/RssiLevel;

    if-ne v4, v5, :cond_1

    goto :goto_0

    .line 21
    :cond_1
    invoke-virtual {v4, p1, p2}, Lcom/orange/oab/contactless/packid/rssi/RssiLevel;->isInRange(II)Z

    move-result v5

    if-eqz v5, :cond_0

    move-object v0, v4

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public final a(Lcom/orange/oab/contactless/packid/hce/user/User;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)Lcom/orange/oab/contactless/packid/rssi/RssiLevel;
    .locals 9

    .line 39
    iget-object v0, p0, Le/h/d/a/a/v/b;->c:Ljava/util/ArrayList;

    const/4 v1, -0x1

    const/4 v2, 0x0

    if-nez v0, :cond_0

    goto :goto_7

    .line 40
    :cond_0
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .line 41
    check-cast v5, Le/h/d/a/a/v/f;

    .line 42
    invoke-virtual {v5}, Le/h/d/a/a/v/f;->e()Ljava/lang/String;

    move-result-object v6

    if-nez p2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getZoneId()Lfr/mbs/binary/Octets;

    move-result-object v7

    if-nez v7, :cond_2

    :goto_1
    move-object v7, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v7}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;

    move-result-object v7

    :goto_2
    const/4 v8, 0x2

    invoke-static {v6, v7, v3, v8, v2}, Li/l/n;->a(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-virtual {v5}, Le/h/d/a/a/v/f;->a()Ljava/lang/String;

    move-result-object v5

    if-nez p1, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/User;->getContactlessId()Lfr/mbs/binary/Octets;

    move-result-object v6

    if-nez v6, :cond_4

    :goto_3
    move-object v6, v2

    goto :goto_4

    :cond_4
    invoke-virtual {v6}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;

    move-result-object v6

    :goto_4
    invoke-static {v5, v6, v3, v8, v2}, Li/l/n;->a(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    const/4 v5, 0x1

    goto :goto_5

    :cond_5
    const/4 v5, 0x0

    :goto_5
    if-eqz v5, :cond_6

    goto :goto_6

    :cond_6
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_7
    const/4 v4, -0x1

    .line 43
    :goto_6
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    :goto_7
    if-nez v2, :cond_8

    goto :goto_8

    .line 44
    :cond_8
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-eq p1, v1, :cond_9

    .line 45
    :goto_8
    iget-object p1, p0, Le/h/d/a/a/v/b;->c:Ljava/util/ArrayList;

    invoke-static {p1}, Li/h/c/k;->a(Ljava/lang/Object;)V

    invoke-static {v2}, Li/h/c/k;->a(Ljava/lang/Object;)V

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Le/h/d/a/a/v/f;

    iget-object p2, p0, Le/h/d/a/a/v/b;->d:Landroid/content/Context;

    invoke-virtual {p1, p2}, Le/h/d/a/a/v/f;->a(Landroid/content/Context;)V

    .line 46
    iget-object p1, p0, Le/h/d/a/a/v/b;->c:Ljava/util/ArrayList;

    invoke-static {p1}, Li/h/c/k;->a(Ljava/lang/Object;)V

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Le/h/d/a/a/v/f;

    invoke-virtual {p1}, Le/h/d/a/a/v/f;->c()Lcom/orange/oab/contactless/packid/rssi/RssiLevel;

    move-result-object p1

    return-object p1

    .line 47
    :cond_9
    sget-object p1, Lcom/orange/oab/contactless/packid/rssi/RssiLevel;->ZERO:Lcom/orange/oab/contactless/packid/rssi/RssiLevel;

    return-object p1
.end method

.method public final a(Lcom/orange/oab/contactless/packid/hce/user/User;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Landroid/bluetooth/BluetoothDevice;)Lcom/orange/oab/contactless/packid/rssi/RssiLevel;
    .locals 9

    .line 48
    iget-object v0, p0, Le/h/d/a/a/v/b;->c:Ljava/util/ArrayList;

    const/4 v1, -0x1

    const/4 v2, 0x0

    if-nez v0, :cond_0

    goto :goto_7

    .line 49
    :cond_0
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .line 50
    check-cast v5, Le/h/d/a/a/v/f;

    .line 51
    invoke-virtual {v5}, Le/h/d/a/a/v/f;->e()Ljava/lang/String;

    move-result-object v6

    if-nez p2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getZoneId()Lfr/mbs/binary/Octets;

    move-result-object v7

    if-nez v7, :cond_2

    :goto_1
    move-object v7, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v7}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;

    move-result-object v7

    :goto_2
    const/4 v8, 0x2

    invoke-static {v6, v7, v3, v8, v2}, Li/l/n;->a(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-virtual {v5}, Le/h/d/a/a/v/f;->a()Ljava/lang/String;

    move-result-object v5

    if-nez p1, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/User;->getContactlessId()Lfr/mbs/binary/Octets;

    move-result-object v6

    if-nez v6, :cond_4

    :goto_3
    move-object v6, v2

    goto :goto_4

    :cond_4
    invoke-virtual {v6}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;

    move-result-object v6

    :goto_4
    invoke-static {v5, v6, v3, v8, v2}, Li/l/n;->a(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    const/4 v5, 0x1

    goto :goto_5

    :cond_5
    const/4 v5, 0x0

    :goto_5
    if-eqz v5, :cond_6

    goto :goto_6

    :cond_6
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_7
    const/4 v4, -0x1

    .line 52
    :goto_6
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    :goto_7
    if-nez v2, :cond_8

    goto :goto_8

    .line 53
    :cond_8
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-eq p1, v1, :cond_9

    .line 54
    :goto_8
    iget-object p1, p0, Le/h/d/a/a/v/b;->c:Ljava/util/ArrayList;

    invoke-static {p1}, Li/h/c/k;->a(Ljava/lang/Object;)V

    invoke-static {v2}, Li/h/c/k;->a(Ljava/lang/Object;)V

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Le/h/d/a/a/v/f;

    invoke-virtual {p1, p3}, Le/h/d/a/a/v/f;->a(Landroid/bluetooth/BluetoothDevice;)V

    .line 55
    iget-object p1, p0, Le/h/d/a/a/v/b;->c:Ljava/util/ArrayList;

    invoke-static {p1}, Li/h/c/k;->a(Ljava/lang/Object;)V

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Le/h/d/a/a/v/f;

    iget-object p2, p0, Le/h/d/a/a/v/b;->d:Landroid/content/Context;

    invoke-virtual {p1, p2}, Le/h/d/a/a/v/f;->a(Landroid/content/Context;)V

    .line 56
    iget-object p1, p0, Le/h/d/a/a/v/b;->c:Ljava/util/ArrayList;

    invoke-static {p1}, Li/h/c/k;->a(Ljava/lang/Object;)V

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Le/h/d/a/a/v/f;

    invoke-virtual {p1}, Le/h/d/a/a/v/f;->c()Lcom/orange/oab/contactless/packid/rssi/RssiLevel;

    move-result-object p1

    return-object p1

    .line 57
    :cond_9
    sget-object p1, Lcom/orange/oab/contactless/packid/rssi/RssiLevel;->ZERO:Lcom/orange/oab/contactless/packid/rssi/RssiLevel;

    return-object p1
.end method

.method public final declared-synchronized a(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Lcom/orange/oab/contactless/packid/hce/user/User;I)Ljava/lang/Boolean;
    .locals 9

    monitor-enter p0

    .line 22
    :try_start_0
    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->isManualConnectionAllowed()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 23
    iget-object p1, p0, Le/h/d/a/a/v/b;->a:Ljava/lang/String;

    const-string p2, "no manual badging allowed no broadcast is needed"

    invoke-static {p1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v1

    .line 24
    :cond_0
    :try_start_1
    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getRssi()B

    move-result v0

    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getRssiButtonInterval()B

    move-result v2

    invoke-virtual {p0, p3, v0, v2}, Le/h/d/a/a/v/b;->a(III)Z

    move-result p3

    .line 25
    iget-object v0, p0, Le/h/d/a/a/v/b;->b:Ljava/util/ArrayList;

    const/4 v2, -0x1

    if-nez v0, :cond_1

    goto :goto_3

    .line 26
    :cond_1
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .line 27
    check-cast v5, Le/h/d/a/a/v/d;

    .line 28
    invoke-virtual {v5}, Le/h/d/a/a/v/d;->d()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getZoneId()Lfr/mbs/binary/Octets;

    move-result-object v7

    invoke-virtual {v7}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x2

    invoke-static {v6, v7, v3, v8, v1}, Li/l/n;->a(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-virtual {v5}, Le/h/d/a/a/v/d;->a()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/User;->getContactlessId()Lfr/mbs/binary/Octets;

    move-result-object v6

    invoke-virtual {v6}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6, v3, v8, v1}, Li/l/n;->a(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/4 v5, 0x1

    goto :goto_1

    :cond_2
    const/4 v5, 0x0

    :goto_1
    if-eqz v5, :cond_3

    goto :goto_2

    :cond_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_4
    const/4 v4, -0x1

    .line 29
    :goto_2
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    :goto_3
    if-nez v1, :cond_5

    goto :goto_4

    .line 30
    :cond_5
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ne v0, v2, :cond_7

    .line 31
    new-instance v0, Le/h/d/a/a/v/d;

    invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/User;->getContactlessId()Lfr/mbs/binary/Octets;

    move-result-object p2

    invoke-virtual {p2}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getZoneId()Lfr/mbs/binary/Octets;

    move-result-object p1

    invoke-virtual {p1}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;

    move-result-object p1

    iget-object v1, p0, Le/h/d/a/a/v/b;->d:Landroid/content/Context;

    invoke-direct {v0, p2, p1, v1}, Le/h/d/a/a/v/d;-><init>(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)V

    .line 32
    invoke-virtual {v0, p3}, Le/h/d/a/a/v/d;->a(Z)V

    .line 33
    iget-object p1, p0, Le/h/d/a/a/v/b;->b:Ljava/util/ArrayList;

    if-nez p1, :cond_6

    goto :goto_5

    :cond_6
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    .line 34
    :cond_7
    :goto_4
    iget-object p1, p0, Le/h/d/a/a/v/b;->b:Ljava/util/ArrayList;

    invoke-static {p1}, Li/h/c/k;->a(Ljava/lang/Object;)V

    invoke-static {v1}, Li/h/c/k;->a(Ljava/lang/Object;)V

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Le/h/d/a/a/v/d;

    invoke-virtual {p1, p3}, Le/h/d/a/a/v/d;->a(Z)V

    .line 35
    :goto_5
    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final a()V
    .locals 3

    .line 36
    iget-object v0, p0, Le/h/d/a/a/v/b;->c:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    goto :goto_1

    .line 37
    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le/h/d/a/a/v/f;

    .line 38
    iget-object v2, p0, Le/h/d/a/a/v/b;->d:Landroid/content/Context;

    invoke-virtual {v1, v2}, Le/h/d/a/a/v/f;->a(Landroid/content/Context;)V

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public final declared-synchronized a(IILcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Lcom/orange/oab/contactless/packid/hce/user/User;Landroid/bluetooth/BluetoothDevice;)V
    .locals 8

    monitor-enter p0

    .line 5
    :try_start_0
    invoke-virtual {p0, p1, p2}, Le/h/d/a/a/v/b;->a(II)Lcom/orange/oab/contactless/packid/rssi/RssiLevel;

    move-result-object p1

    .line 6
    iget-object p2, p0, Le/h/d/a/a/v/b;->c:Ljava/util/ArrayList;

    const/4 v0, -0x1

    const/4 v1, 0x0

    if-nez p2, :cond_0

    goto :goto_3

    .line 7
    :cond_0
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .line 8
    check-cast v4, Le/h/d/a/a/v/f;

    .line 9
    invoke-virtual {v4}, Le/h/d/a/a/v/f;->a()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p4}, Lcom/orange/oab/contactless/packid/hce/user/User;->getContactlessId()Lfr/mbs/binary/Octets;

    move-result-object v6

    invoke-virtual {v6}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x2

    invoke-static {v5, v6, v2, v7, v1}, Li/l/n;->a(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-virtual {v4}, Le/h/d/a/a/v/f;->e()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p3}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getZoneId()Lfr/mbs/binary/Octets;

    move-result-object v5

    invoke-virtual {v5}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5, v2, v7, v1}, Li/l/n;->a(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x1

    goto :goto_1

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-eqz v4, :cond_2

    goto :goto_2

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    const/4 v3, -0x1

    .line 10
    :goto_2
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    :goto_3
    if-nez v1, :cond_4

    goto :goto_4

    .line 11
    :cond_4
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result p2

    if-ne p2, v0, :cond_6

    .line 12
    new-instance p2, Le/h/d/a/a/v/f;

    invoke-virtual {p4}, Lcom/orange/oab/contactless/packid/hce/user/User;->getContactlessId()Lfr/mbs/binary/Octets;

    move-result-object p4

    invoke-virtual {p4}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getZoneId()Lfr/mbs/binary/Octets;

    move-result-object p3

    invoke-virtual {p3}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;

    move-result-object p3

    iget-object v0, p0, Le/h/d/a/a/v/b;->d:Landroid/content/Context;

    invoke-direct {p2, p4, p3, v0}, Le/h/d/a/a/v/f;-><init>(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)V

    .line 13
    invoke-virtual {p2, p5}, Le/h/d/a/a/v/f;->a(Landroid/bluetooth/BluetoothDevice;)V

    .line 14
    invoke-virtual {p2, p1}, Le/h/d/a/a/v/f;->a(Lcom/orange/oab/contactless/packid/rssi/RssiLevel;)V

    .line 15
    iget-object p1, p0, Le/h/d/a/a/v/b;->c:Ljava/util/ArrayList;

    if-nez p1, :cond_5

    goto :goto_5

    :cond_5
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    .line 16
    :cond_6
    :goto_4
    iget-object p2, p0, Le/h/d/a/a/v/b;->c:Ljava/util/ArrayList;

    invoke-static {p2}, Li/h/c/k;->a(Ljava/lang/Object;)V

    invoke-static {v1}, Li/h/c/k;->a(Ljava/lang/Object;)V

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Le/h/d/a/a/v/f;

    invoke-virtual {p2, p5}, Le/h/d/a/a/v/f;->a(Landroid/bluetooth/BluetoothDevice;)V

    .line 17
    iget-object p2, p0, Le/h/d/a/a/v/b;->c:Ljava/util/ArrayList;

    invoke-static {p2}, Li/h/c/k;->a(Ljava/lang/Object;)V

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Le/h/d/a/a/v/f;

    invoke-virtual {p2, p1}, Le/h/d/a/a/v/f;->a(Lcom/orange/oab/contactless/packid/rssi/RssiLevel;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_5
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized a(ILcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Lcom/orange/oab/contactless/packid/hce/user/User;Landroid/bluetooth/BluetoothDevice;)V
    .locals 7

    monitor-enter p0

    :try_start_0
    const-string v0, "badge"

    invoke-static {p2, v0}, Li/h/c/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "user"

    invoke-static {p3, v0}, Li/h/c/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "peripheral"

    invoke-static {p4, v0}, Li/h/c/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v0, Le/h/d/a/a/w/r;->a:Le/h/d/a/a/w/q;

    invoke-virtual {v0}, Le/h/d/a/a/w/q;->a()Le/h/d/a/a/w/r;

    move-result-object v0

    invoke-virtual {v0, p1, p3, p2, p4}, Le/h/d/a/a/w/r;->a(ILcom/orange/oab/contactless/packid/hce/user/User;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Landroid/bluetooth/BluetoothDevice;)V

    .line 2
    sget-object v0, Lcom/orange/business/packid/android/lib/PackIdPreferences;->INSTANCE:Lcom/orange/business/packid/android/lib/PackIdPreferences;

    invoke-virtual {v0}, Lcom/orange/business/packid/android/lib/PackIdPreferences;->isRssiLevelBroadcastEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getRssi()B

    move-result v3

    move-object v1, p0

    move v2, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-virtual/range {v1 .. v6}, Le/h/d/a/a/v/b;->a(IILcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Lcom/orange/oab/contactless/packid/hce/user/User;Landroid/bluetooth/BluetoothDevice;)V

    .line 4
    :cond_0
    invoke-virtual {p0, p2, p3, p1}, Le/h/d/a/a/v/b;->a(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Lcom/orange/oab/contactless/packid/hce/user/User;I)Ljava/lang/Boolean;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final a(III)Z
    .locals 0

    add-int/2addr p2, p3

    if-gez p2, :cond_0

    if-gt p2, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final b()V
    .locals 3

    .line 1
    iget-object v0, p0, Le/h/d/a/a/v/b;->b:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    goto :goto_1

    .line 2
    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le/h/d/a/a/v/d;

    .line 3
    iget-object v2, p0, Le/h/d/a/a/v/b;->d:Landroid/content/Context;

    invoke-virtual {v1, v2}, Le/h/d/a/a/v/d;->a(Landroid/content/Context;)V

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public final b(Lcom/orange/oab/contactless/packid/hce/user/User;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)Z
    .locals 9

    .line 4
    iget-object v0, p0, Le/h/d/a/a/v/b;->b:Ljava/util/ArrayList;

    const/4 v1, -0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-nez v0, :cond_0

    goto :goto_7

    .line 5
    :cond_0
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v4, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .line 6
    check-cast v5, Le/h/d/a/a/v/d;

    .line 7
    invoke-virtual {v5}, Le/h/d/a/a/v/d;->d()Ljava/lang/String;

    move-result-object v6

    if-nez p2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getZoneId()Lfr/mbs/binary/Octets;

    move-result-object v7

    if-nez v7, :cond_2

    :goto_1
    move-object v7, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v7}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;

    move-result-object v7

    :goto_2
    const/4 v8, 0x2

    invoke-static {v6, v7, v3, v8, v2}, Li/l/n;->a(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-virtual {v5}, Le/h/d/a/a/v/d;->a()Ljava/lang/String;

    move-result-object v5

    if-nez p1, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/User;->getContactlessId()Lfr/mbs/binary/Octets;

    move-result-object v6

    if-nez v6, :cond_4

    :goto_3
    move-object v6, v2

    goto :goto_4

    :cond_4
    invoke-virtual {v6}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;

    move-result-object v6

    :goto_4
    invoke-static {v5, v6, v3, v8, v2}, Li/l/n;->a(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    const/4 v5, 0x1

    goto :goto_5

    :cond_5
    const/4 v5, 0x0

    :goto_5
    if-eqz v5, :cond_6

    goto :goto_6

    :cond_6
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_7
    const/4 v4, -0x1

    .line 8
    :goto_6
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    :goto_7
    if-nez v2, :cond_8

    goto :goto_8

    .line 9
    :cond_8
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-eq p1, v1, :cond_9

    .line 10
    :goto_8
    iget-object p1, p0, Le/h/d/a/a/v/b;->b:Ljava/util/ArrayList;

    invoke-static {p1}, Li/h/c/k;->a(Ljava/lang/Object;)V

    invoke-static {v2}, Li/h/c/k;->a(Ljava/lang/Object;)V

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Le/h/d/a/a/v/d;

    iget-object p2, p0, Le/h/d/a/a/v/b;->d:Landroid/content/Context;

    invoke-virtual {p1, p2}, Le/h/d/a/a/v/d;->a(Landroid/content/Context;)V

    .line 11
    iget-object p1, p0, Le/h/d/a/a/v/b;->b:Ljava/util/ArrayList;

    invoke-static {p1}, Li/h/c/k;->a(Ljava/lang/Object;)V

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Le/h/d/a/a/v/d;

    invoke-virtual {p1}, Le/h/d/a/a/v/d;->c()Z

    move-result p1

    return p1

    :cond_9
    return v3
.end method
