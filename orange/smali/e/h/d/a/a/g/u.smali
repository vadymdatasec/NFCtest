.class public Le/h/d/a/a/g/u;
.super Le/h/d/a/a/g/w;
.source "SourceFile"


# instance fields
.field public m:Lfr/mbs/binary/Octets;

.field public n:I

.field public o:I

.field public p:Lfr/mbs/binary/Octets;

.field public q:Lfr/mbs/binary/Octets;

.field public r:Lfr/mbs/binary/Octets;


# direct methods
.method public constructor <init>(Landroid/content/Context;Le/h/d/a/a/n/w/c;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Lcom/orange/oab/contactless/packid/hce/user/User;)V
    .locals 7

    .line 1
    sget-object v0, Le/h/d/a/a/g/o;->d:Le/h/d/a/a/g/o;

    invoke-virtual {v0}, Le/h/d/a/a/g/o;->b()Ljava/util/UUID;

    move-result-object v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v1 .. v6}, Le/h/d/a/a/g/w;-><init>(Landroid/content/Context;Le/h/d/a/a/n/w/c;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Lcom/orange/oab/contactless/packid/hce/user/User;Ljava/util/UUID;)V

    .line 2
    invoke-static {}, Lfr/mbs/binary/Octets;->empty()Lfr/mbs/binary/Octets;

    move-result-object p1

    iput-object p1, p0, Le/h/d/a/a/g/u;->p:Lfr/mbs/binary/Octets;

    return-void
.end method

.method private e(Landroid/bluetooth/BluetoothGatt;)V
    .locals 2

    .line 8
    iget-object v0, p0, Le/h/d/a/a/g/u;->r:Lfr/mbs/binary/Octets;

    invoke-virtual {v0}, Lfr/mbs/binary/Octets;->size()I

    move-result v0

    const/16 v1, 0x14

    if-ge v0, v1, :cond_0

    .line 9
    invoke-virtual {p0}, Le/h/d/a/a/g/u;->g()Lfr/mbs/binary/Octets;

    .line 10
    invoke-virtual {p0, p1}, Le/h/d/a/a/g/v;->c(Landroid/bluetooth/BluetoothGatt;)V

    goto :goto_0

    .line 11
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "7- updated token part n\u00b0"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Le/h/d/a/a/g/u;->o:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " read successfully, reading next updated token part"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "packid.ble.Token.Secure"

    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 12
    sget-object v0, Le/h/d/a/a/g/o;->i:Le/h/d/a/a/g/o;

    invoke-virtual {p0, p1, v0}, Le/h/d/a/a/g/v;->c(Landroid/bluetooth/BluetoothGatt;Le/h/d/a/a/g/o;)V

    :goto_0
    return-void
.end method

.method private f(Landroid/bluetooth/BluetoothGatt;)V
    .locals 5

    const-string v0, "packid.ble.Token.Secure"

    .line 13
    :try_start_0
    invoke-virtual {p0}, Le/h/d/a/a/g/u;->e()Le/h/d/a/a/g/o;

    move-result-object v1

    .line 14
    invoke-virtual {p0}, Le/h/d/a/a/g/u;->f()Lfr/mbs/binary/Octets;

    move-result-object v2

    .line 15
    sget-object v3, Le/h/d/a/a/g/o;->i:Le/h/d/a/a/g/o;

    invoke-virtual {v1, v3}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 16
    iput-object v2, p0, Le/h/d/a/a/g/u;->q:Lfr/mbs/binary/Octets;

    .line 17
    :cond_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "6- sending "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Le/h/d/a/a/g/o;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " n\u00b0"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v4, p0, Le/h/d/a/a/g/u;->n:I

    add-int/lit8 v4, v4, 0x1

    iput v4, p0, Le/h/d/a/a/g/u;->n:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, "/"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v2}, Le/h/d/a/a/g/u;->c(Lfr/mbs/binary/Octets;)I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 18
    invoke-virtual {p0, p1, v1, v2}, Le/h/d/a/a/g/v;->a(Landroid/bluetooth/BluetoothGatt;Le/h/d/a/a/g/o;Lfr/mbs/binary/Octets;)Z
    :try_end_0
    .catch Lcom/orange/oab/contactless/packid/g/u/e; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string p1, "could not cipher identifier"

    .line 19
    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-void
.end method

.method private g(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getValue()[B

    move-result-object p2

    invoke-static {p2}, Lfr/mbs/binary/Octets;->createOctets([B)Lfr/mbs/binary/Octets;

    move-result-object p2

    .line 2
    invoke-virtual {p0, p2}, Le/h/d/a/a/g/u;->d(Lfr/mbs/binary/Octets;)V

    .line 3
    invoke-virtual {p2}, Lfr/mbs/binary/Octets;->size()I

    move-result p2

    const/16 v0, 0x14

    if-ge p2, v0, :cond_0

    .line 4
    invoke-virtual {p0}, Le/h/d/a/a/g/u;->g()Lfr/mbs/binary/Octets;

    move-result-object p2

    .line 5
    sget-object v0, Le/h/d/a/a/g/o;->l:Le/h/d/a/a/g/o;

    invoke-virtual {p0, p1, v0, p2}, Le/h/d/a/a/g/v;->a(Landroid/bluetooth/BluetoothGatt;Le/h/d/a/a/g/o;Lfr/mbs/binary/Octets;)Z

    :cond_0
    return-void
.end method


# virtual methods
.method public final a(Lfr/mbs/binary/Octets;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)Lfr/mbs/binary/Octets;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/g/u/e;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/h/d/a/a/g/v;->b:Le/h/d/a/a/n/w/c;

    invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getCipheredTokenDataSignature()Lfr/mbs/binary/Octets;

    move-result-object v1

    invoke-virtual {v0, v1}, Le/h/d/a/a/n/w/c;->b(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object v0

    invoke-virtual {v0}, Lfr/mbs/binary/Octets;->size()I

    move-result v0

    .line 2
    invoke-virtual {p1}, Lfr/mbs/binary/Octets;->size()I

    move-result v1

    const/4 v2, 0x6

    sub-int/2addr v1, v2

    sub-int/2addr v1, v0

    .line 3
    invoke-virtual {p1, v2, v1}, Lfr/mbs/binary/Octets;->get(II)Lfr/mbs/binary/Octets;

    move-result-object v1

    .line 4
    invoke-virtual {p1, v0}, Lfr/mbs/binary/Octets;->getLast(I)Lfr/mbs/binary/Octets;

    move-result-object p1

    .line 5
    iget-object v0, p0, Le/h/d/a/a/g/v;->b:Le/h/d/a/a/n/w/c;

    invoke-virtual {v0, p1}, Le/h/d/a/a/n/w/c;->a(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setCipheredTokenDataSignature(Lfr/mbs/binary/Octets;)V

    .line 6
    invoke-static {v1}, Lcom/orange/oab/contactless/packid/hce/user/TokenData;->parse(Lfr/mbs/binary/Octets;)Lcom/orange/oab/contactless/packid/hce/user/TokenData;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setTokenData(Lcom/orange/oab/contactless/packid/hce/user/TokenData;)V

    return-object p1
.end method

.method public b(Ljava/lang/String;)V
    .locals 5

    .line 1
    iget-object v0, p0, Le/h/d/a/a/g/v;->c:Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    invoke-virtual {v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getTokenData()Lcom/orange/oab/contactless/packid/hce/user/TokenData;

    move-result-object v0

    invoke-virtual {v0}, Lcom/orange/oab/contactless/packid/hce/user/TokenData;->getId()Lfr/mbs/binary/Octets;

    move-result-object v0

    .line 2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "token id is : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "packid.ble.Token.Secure"

    invoke-static {v2, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz p1, :cond_2

    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Start unlocking \u00ab"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "\u00bb"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 4
    invoke-virtual {p0, p1}, Le/h/d/a/a/g/u;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 5
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "unlocked token id \u00ab"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    invoke-virtual {v0}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    .line 7
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "zone id = "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Le/h/d/a/a/g/v;->c:Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    invoke-virtual {v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getZoneId()Lfr/mbs/binary/Octets;

    move-result-object v0

    invoke-virtual {v0}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 8
    iget-object p1, p0, Le/h/d/a/a/g/v;->a:Landroid/content/Context;

    invoke-static {p1}, Le/h/d/a/a/s/m;->a(Landroid/content/Context;)Le/h/d/a/a/s/r;

    move-result-object p1

    iget-object v0, p0, Le/h/d/a/a/g/v;->c:Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    invoke-virtual {v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getZoneId()Lfr/mbs/binary/Octets;

    move-result-object v0

    invoke-virtual {v0}, Lfr/mbs/binary/Octets;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Le/h/d/a/a/g/v;->c:Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getUserId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Le/h/d/a/a/s/r;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    .line 9
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Badge to unlock size "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 10
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    .line 11
    invoke-static {}, Le/h/d/a/a/h;->c()Le/h/d/a/a/h;

    move-result-object v1

    iget-object v2, p0, Le/h/d/a/a/g/v;->c:Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    invoke-virtual {v1, v2, v0}, Le/h/d/a/a/h;->a(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 12
    invoke-static {}, Le/h/d/a/a/h;->c()Le/h/d/a/a/h;

    move-result-object v1

    iget-object v2, p0, Le/h/d/a/a/g/v;->a:Landroid/content/Context;

    iget-object v3, p0, Le/h/d/a/a/g/v;->d:Lcom/orange/oab/contactless/packid/hce/user/User;

    invoke-virtual {v1, v2, v3, v0}, Le/h/d/a/a/h;->b(Landroid/content/Context;Lcom/orange/oab/contactless/packid/hce/user/User;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final b(Lfr/mbs/binary/Octets;)Z
    .locals 1

    .line 13
    invoke-virtual {p0}, Le/h/d/a/a/g/w;->d()Lfr/mbs/binary/Octets;

    move-result-object v0

    invoke-virtual {p1, v0}, Lfr/mbs/binary/Octets;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final c(Lfr/mbs/binary/Octets;)I
    .locals 6

    .line 3
    iget v0, p0, Le/h/d/a/a/g/u;->n:I

    int-to-double v0, v0

    invoke-virtual {p1}, Lfr/mbs/binary/Octets;->size()I

    move-result p1

    int-to-double v2, p1

    const-wide/high16 v4, 0x4034000000000000L    # 20.0

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v4

    div-double/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    add-double/2addr v0, v2

    double-to-int p1, v0

    return p1
.end method

.method public final c(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    :try_start_0
    new-instance v0, Le/h/d/a/a/o/b/a;

    invoke-direct {v0}, Le/h/d/a/a/o/b/a;-><init>()V

    invoke-virtual {p0}, Le/h/d/a/a/g/w;->c()Lfr/mbs/binary/Octets;

    move-result-object v1

    invoke-static {p1}, Lfr/mbs/binary/Octets;->createOctets(Ljava/lang/String;)Lfr/mbs/binary/Octets;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Le/h/d/a/a/o/b/a;->d(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object v0

    invoke-virtual {v0}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Lcom/orange/oab/contactless/packid/g/u/e; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception v0

    .line 2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Error when unciphering \u00ab"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\u00bb"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "packid.ble.Token.Secure"

    invoke-static {v1, p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const/4 p1, 0x0

    return-object p1
.end method

.method public d(Landroid/bluetooth/BluetoothGatt;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Le/h/d/a/a/g/u;->f(Landroid/bluetooth/BluetoothGatt;)V

    const/4 p1, 0x0

    .line 2
    iput p1, p0, Le/h/d/a/a/g/u;->n:I

    return-void
.end method

.method public d(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V
    .locals 2

    .line 3
    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object v0

    sget-object v1, Le/h/d/a/a/g/o;->i:Le/h/d/a/a/g/o;

    invoke-virtual {v1}, Le/h/d/a/a/g/o;->b()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    invoke-direct {p0, p1, p2}, Le/h/d/a/a/g/u;->g(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V

    goto :goto_0

    .line 5
    :cond_0
    invoke-super {p0, p1, p2}, Le/h/d/a/a/g/w;->d(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V

    :goto_0
    return-void
.end method

.method public final d(Lfr/mbs/binary/Octets;)V
    .locals 1

    .line 6
    iget-object v0, p0, Le/h/d/a/a/g/u;->p:Lfr/mbs/binary/Octets;

    invoke-virtual {v0, p1}, Lfr/mbs/binary/Octets;->put(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    .line 7
    iget p1, p0, Le/h/d/a/a/g/u;->o:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Le/h/d/a/a/g/u;->o:I

    return-void
.end method

.method public final e()Le/h/d/a/a/g/o;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/g/u/e;
        }
    .end annotation

    .line 4
    iget-object v0, p0, Le/h/d/a/a/g/u;->m:Lfr/mbs/binary/Octets;

    if-nez v0, :cond_0

    .line 5
    iget-object v0, p0, Le/h/d/a/a/g/v;->b:Le/h/d/a/a/n/w/c;

    iget-object v1, p0, Le/h/d/a/a/g/v;->c:Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getCipheredTokenDataSignature()Lfr/mbs/binary/Octets;

    move-result-object v1

    invoke-virtual {v0, v1}, Le/h/d/a/a/n/w/c;->b(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object v0

    .line 6
    iget-object v1, p0, Le/h/d/a/a/g/v;->c:Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getTokenData()Lcom/orange/oab/contactless/packid/hce/user/TokenData;

    move-result-object v1

    invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/TokenData;->toOctets()Lfr/mbs/binary/Octets;

    move-result-object v1

    invoke-virtual {v1, v0}, Lfr/mbs/binary/Octets;->put(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Le/h/d/a/a/g/w;->a(Lfr/mbs/binary/Octets;Z)Lfr/mbs/binary/Octets;

    move-result-object v0

    iput-object v0, p0, Le/h/d/a/a/g/u;->m:Lfr/mbs/binary/Octets;

    .line 7
    :cond_0
    iget-object v0, p0, Le/h/d/a/a/g/u;->m:Lfr/mbs/binary/Octets;

    invoke-virtual {v0}, Lfr/mbs/binary/Octets;->size()I

    move-result v0

    const/16 v1, 0x14

    if-le v0, v1, :cond_1

    sget-object v0, Le/h/d/a/a/g/o;->i:Le/h/d/a/a/g/o;

    goto :goto_0

    :cond_1
    sget-object v0, Le/h/d/a/a/g/o;->j:Le/h/d/a/a/g/o;

    :goto_0
    return-object v0
.end method

.method public e(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object v0

    sget-object v1, Le/h/d/a/a/g/o;->i:Le/h/d/a/a/g/o;

    invoke-virtual {v1}, Le/h/d/a/a/g/o;->b()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0, p1, p2}, Le/h/d/a/a/g/u;->h(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V

    goto :goto_0

    .line 3
    :cond_0
    invoke-super {p0, p1, p2}, Le/h/d/a/a/g/w;->e(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V

    :goto_0
    return-void
.end method

.method public final e(Lfr/mbs/binary/Octets;)Z
    .locals 1

    .line 13
    iget-object v0, p0, Le/h/d/a/a/g/u;->q:Lfr/mbs/binary/Octets;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lfr/mbs/binary/Octets;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final f()Lfr/mbs/binary/Octets;
    .locals 2

    .line 21
    iget-object v0, p0, Le/h/d/a/a/g/u;->m:Lfr/mbs/binary/Octets;

    invoke-virtual {v0}, Lfr/mbs/binary/Octets;->size()I

    move-result v0

    const/16 v1, 0x14

    if-le v0, v1, :cond_0

    .line 22
    iget-object v0, p0, Le/h/d/a/a/g/u;->m:Lfr/mbs/binary/Octets;

    invoke-virtual {v0, v1}, Lfr/mbs/binary/Octets;->pop(I)Lfr/mbs/binary/Octets;

    move-result-object v0

    return-object v0

    .line 23
    :cond_0
    iget-object v0, p0, Le/h/d/a/a/g/u;->m:Lfr/mbs/binary/Octets;

    invoke-static {v0}, Lfr/mbs/binary/Octets;->createOctets(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object v0

    return-object v0
.end method

.method public f(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object v0

    sget-object v1, Le/h/d/a/a/g/o;->i:Le/h/d/a/a/g/o;

    invoke-virtual {v1}, Le/h/d/a/a/g/o;->b()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-direct {p0, p1}, Le/h/d/a/a/g/u;->f(Landroid/bluetooth/BluetoothGatt;)V

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object v0

    sget-object v1, Le/h/d/a/a/g/o;->j:Le/h/d/a/a/g/o;

    invoke-virtual {v1}, Le/h/d/a/a/g/o;->b()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string p2, "packid.ble.Token.Secure"

    const-string v0, "6- token written successfully, reading updated token"

    .line 4
    invoke-static {p2, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 5
    sget-object p2, Le/h/d/a/a/g/o;->i:Le/h/d/a/a/g/o;

    invoke-virtual {p0, p1, p2}, Le/h/d/a/a/g/v;->b(Landroid/bluetooth/BluetoothGatt;Le/h/d/a/a/g/o;)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 6
    sget-object p2, Le/h/d/a/a/g/o;->i:Le/h/d/a/a/g/o;

    invoke-virtual {p0, p1, p2}, Le/h/d/a/a/g/v;->a(Landroid/bluetooth/BluetoothGatt;Le/h/d/a/a/g/o;)V

    goto :goto_0

    .line 7
    :cond_1
    sget-object p2, Le/h/d/a/a/g/o;->i:Le/h/d/a/a/g/o;

    invoke-virtual {p0, p1, p2}, Le/h/d/a/a/g/v;->c(Landroid/bluetooth/BluetoothGatt;Le/h/d/a/a/g/o;)V

    goto :goto_0

    .line 8
    :cond_2
    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object v0

    sget-object v1, Le/h/d/a/a/g/o;->k:Le/h/d/a/a/g/o;

    invoke-virtual {v1}, Le/h/d/a/a/g/o;->b()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 9
    invoke-direct {p0, p1}, Le/h/d/a/a/g/u;->e(Landroid/bluetooth/BluetoothGatt;)V

    goto :goto_0

    .line 10
    :cond_3
    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object v0

    sget-object v1, Le/h/d/a/a/g/o;->l:Le/h/d/a/a/g/o;

    invoke-virtual {v1}, Le/h/d/a/a/g/o;->b()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 11
    invoke-virtual {p0, p1}, Le/h/d/a/a/g/v;->c(Landroid/bluetooth/BluetoothGatt;)V

    goto :goto_0

    .line 12
    :cond_4
    invoke-super {p0, p1, p2}, Le/h/d/a/a/g/w;->f(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V

    :goto_0
    return-void
.end method

.method public final f(Lfr/mbs/binary/Octets;)Z
    .locals 1

    .line 20
    iget-object v0, p0, Le/h/d/a/a/g/u;->r:Lfr/mbs/binary/Octets;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lfr/mbs/binary/Octets;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final g()Lfr/mbs/binary/Octets;
    .locals 5

    .line 12
    iget-object v0, p0, Le/h/d/a/a/g/u;->p:Lfr/mbs/binary/Octets;

    invoke-virtual {v0}, Lfr/mbs/binary/Octets;->isEmpty()Z

    move-result v0

    const-string v1, "packid.ble.Token.Secure"

    if-eqz v0, :cond_0

    const-string v0, "7- Empty token received from GATT server, reading reader result"

    .line 13
    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 14
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "7- Updated token last part n\u00b0"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Le/h/d/a/a/g/u;->o:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " read successfully, reading reader result"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 15
    :try_start_0
    new-instance v0, Le/h/d/a/a/o/b/a;

    invoke-direct {v0}, Le/h/d/a/a/o/b/a;-><init>()V

    invoke-virtual {p0}, Le/h/d/a/a/g/w;->c()Lfr/mbs/binary/Octets;

    move-result-object v2

    iget-object v3, p0, Le/h/d/a/a/g/u;->p:Lfr/mbs/binary/Octets;

    invoke-virtual {v0, v2, v3}, Le/h/d/a/a/o/b/a;->d(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object v0

    .line 16
    invoke-virtual {p0, v0}, Le/h/d/a/a/g/w;->a(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object v2

    invoke-virtual {p0, v2}, Le/h/d/a/a/g/u;->b(Lfr/mbs/binary/Octets;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 17
    iget-object v2, p0, Le/h/d/a/a/g/v;->c:Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    invoke-virtual {p0, v0, v2}, Le/h/d/a/a/g/u;->a(Lfr/mbs/binary/Octets;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)Lfr/mbs/binary/Octets;

    move-result-object v0

    .line 18
    iget-object v2, p0, Le/h/d/a/a/g/v;->a:Landroid/content/Context;

    invoke-static {v2}, Le/h/d/a/a/s/m;->c(Landroid/content/Context;)Le/h/d/a/a/s/g0;

    move-result-object v2

    iget-object v3, p0, Le/h/d/a/a/g/v;->c:Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    invoke-virtual {v2, v3}, Le/h/d/a/a/s/g0;->c(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)V

    .line 19
    new-instance v2, Le/h/d/a/a/n/n;

    iget-object v3, p0, Le/h/d/a/a/g/v;->a:Landroid/content/Context;

    iget-object v4, p0, Le/h/d/a/a/g/v;->c:Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    invoke-direct {v2, v3, v4}, Le/h/d/a/a/n/n;-><init>(Landroid/content/Context;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)V

    invoke-virtual {v2}, Le/h/d/a/a/n/n;->a()V

    return-object v0

    :cond_1
    const-string v0, "Received truncated nonce2 is not valid, token could not be written"

    .line 20
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Lcom/orange/oab/contactless/packid/g/u/e; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v2, "could not cipher identifier"

    .line 21
    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final g(Lfr/mbs/binary/Octets;)Z
    .locals 4

    .line 6
    invoke-virtual {p0, p1}, Le/h/d/a/a/g/u;->f(Lfr/mbs/binary/Octets;)Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x2

    const-string v3, "packid.ble.Token.Secure"

    if-eqz v0, :cond_0

    const-string p1, "Read token part is the same as previous part, retrying read"

    .line 7
    invoke-static {v3, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    const-string p1, "Part did not change"

    .line 8
    invoke-static {v3, p1, v2}, Lcom/orange/oab/contactless/packid/debug/DebugConsole;->log(Ljava/lang/String;Ljava/lang/String;I)V

    return v1

    .line 9
    :cond_0
    invoke-virtual {p0, p1}, Le/h/d/a/a/g/u;->e(Lfr/mbs/binary/Octets;)Z

    move-result p1

    if-eqz p1, :cond_1

    const-string p1, "Read token part is the same as written part, retrying read"

    .line 10
    invoke-static {v3, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    const-string p1, "Part is still written value"

    .line 11
    invoke-static {v3, p1, v2}, Lcom/orange/oab/contactless/packid/debug/DebugConsole;->log(Ljava/lang/String;Ljava/lang/String;I)V

    return v1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final h(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getValue()[B

    move-result-object p2

    invoke-static {p2}, Lfr/mbs/binary/Octets;->createOctets([B)Lfr/mbs/binary/Octets;

    move-result-object p2

    .line 2
    invoke-virtual {p0, p2}, Le/h/d/a/a/g/u;->g(Lfr/mbs/binary/Octets;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    sget-object p2, Le/h/d/a/a/g/o;->i:Le/h/d/a/a/g/o;

    invoke-virtual {p0, p1, p2}, Le/h/d/a/a/g/v;->c(Landroid/bluetooth/BluetoothGatt;Le/h/d/a/a/g/o;)V

    return-void

    .line 4
    :cond_0
    invoke-virtual {p0, p2}, Le/h/d/a/a/g/u;->d(Lfr/mbs/binary/Octets;)V

    .line 5
    iput-object p2, p0, Le/h/d/a/a/g/u;->r:Lfr/mbs/binary/Octets;

    .line 6
    sget-object v0, Le/h/d/a/a/g/o;->k:Le/h/d/a/a/g/o;

    invoke-virtual {p0, p1, v0, p2}, Le/h/d/a/a/g/v;->a(Landroid/bluetooth/BluetoothGatt;Le/h/d/a/a/g/o;Lfr/mbs/binary/Octets;)Z

    return-void
.end method
