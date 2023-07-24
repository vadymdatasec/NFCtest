.class public abstract Le/h/d/a/a/g/w;
.super Le/h/d/a/a/g/v;
.source "SourceFile"


# instance fields
.field public h:Le/h/d/a/a/n/i;

.field public i:Lfr/mbs/binary/Octets;

.field public j:Lfr/mbs/binary/Octets;

.field public k:Landroid/bluetooth/BluetoothGattCharacteristic;

.field public l:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Le/h/d/a/a/n/w/c;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Lcom/orange/oab/contactless/packid/hce/user/User;Ljava/util/UUID;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Le/h/d/a/a/g/v;-><init>(Landroid/content/Context;Le/h/d/a/a/n/w/c;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Lcom/orange/oab/contactless/packid/hce/user/User;Ljava/util/UUID;)V

    .line 2
    new-instance p1, Le/h/d/a/a/n/i;

    const/16 p2, 0xa

    const/16 p3, 0xbb8

    const/4 p4, 0x3

    const/16 p5, 0x12c

    invoke-direct {p1, p2, p3, p4, p5}, Le/h/d/a/a/n/i;-><init>(IIII)V

    iput-object p1, p0, Le/h/d/a/a/g/w;->h:Le/h/d/a/a/n/i;

    const/4 p1, 0x0

    .line 3
    iput-object p1, p0, Le/h/d/a/a/g/w;->k:Landroid/bluetooth/BluetoothGattCharacteristic;

    const/4 p1, 0x0

    .line 4
    iput-boolean p1, p0, Le/h/d/a/a/g/w;->l:Z

    return-void
.end method

.method private g(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V
    .locals 6

    const-string v0, "packid.ble.SecureWriter"

    const-string v1, "4- READER AUTHENTICATION, checking nonces and writing ciphered identifier"

    .line 1
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-boolean v1, p0, Le/h/d/a/a/g/w;->l:Z

    if-nez v1, :cond_0

    const-string p1, "=> Receive READER AUTHENTICATION, but waiting INIT AUTHENTICATION, waiting it before process it"

    .line 3
    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 4
    iput-object p2, p0, Le/h/d/a/a/g/w;->k:Landroid/bluetooth/BluetoothGattCharacteristic;

    return-void

    .line 5
    :cond_0
    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getValue()[B

    move-result-object p2

    invoke-virtual {p0, p2}, Le/h/d/a/a/g/w;->a([B)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 6
    invoke-virtual {p0, p1}, Le/h/d/a/a/g/w;->d(Landroid/bluetooth/BluetoothGatt;)V

    goto :goto_0

    .line 7
    :cond_1
    iget-object p2, p0, Le/h/d/a/a/g/w;->h:Le/h/d/a/a/n/i;

    invoke-virtual {p2}, Le/h/d/a/a/n/i;->c()Z

    move-result p2

    const/4 v1, 0x2

    if-eqz p2, :cond_2

    .line 8
    iget-object p2, p0, Le/h/d/a/a/g/v;->f:Le/h/d/a/a/g/k;

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v2, p0, Le/h/d/a/a/g/v;->c:Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    invoke-virtual {v2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getZoneId()Lfr/mbs/binary/Octets;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v0, v3

    const-string v2, "Authentication failed for zone %s, master key is probably wrong!!"

    invoke-static {v2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    sget-object v2, Lcom/orange/business/packid/android/lib/TransactionErrorType;->AUTHENTICATION:Lcom/orange/business/packid/android/lib/TransactionErrorType;

    invoke-virtual {p2, p1, v0, v1, v2}, Le/h/d/a/a/g/k;->a(Landroid/bluetooth/BluetoothGatt;Ljava/lang/String;ILcom/orange/business/packid/android/lib/TransactionErrorType;)V

    goto :goto_0

    .line 9
    :cond_2
    iget-object p2, p0, Le/h/d/a/a/g/w;->h:Le/h/d/a/a/n/i;

    invoke-virtual {p2}, Le/h/d/a/a/n/i;->d()J

    move-result-wide v2

    .line 10
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "invalid nonce trying again in "

    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v4, " ms ("

    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Le/h/d/a/a/g/w;->h:Le/h/d/a/a/n/i;

    invoke-virtual {v4}, Le/h/d/a/a/n/i;->b()J

    move-result-wide v4

    invoke-virtual {p2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v4, " ms left)"

    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 11
    iget-object v4, p0, Le/h/d/a/a/g/v;->a:Landroid/content/Context;

    invoke-static {v4, p2, v1}, Lcom/orange/oab/contactless/packid/service/LogManager;->w(Landroid/content/Context;Ljava/lang/String;I)V

    .line 12
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "READER AUTHENTICATION failure: "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v0, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 13
    invoke-virtual {p0, v2, v3}, Le/h/d/a/a/g/w;->a(J)V

    .line 14
    invoke-virtual {p0, p1}, Le/h/d/a/a/g/w;->f(Landroid/bluetooth/BluetoothGatt;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public a(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x6

    .line 24
    invoke-virtual {p1, v0, v1}, Lfr/mbs/binary/Octets;->get(II)Lfr/mbs/binary/Octets;

    move-result-object p1

    return-object p1
.end method

.method public a(Lfr/mbs/binary/Octets;Z)Lfr/mbs/binary/Octets;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/g/u/e;
        }
    .end annotation

    .line 10
    iget-object v0, p0, Le/h/d/a/a/g/w;->j:Lfr/mbs/binary/Octets;

    invoke-virtual {p0, v0}, Le/h/d/a/a/g/w;->a(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object v0

    invoke-virtual {v0, p1}, Lfr/mbs/binary/Octets;->put(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object p1

    if-eqz p2, :cond_0

    .line 11
    new-instance p2, Le/h/d/a/a/o/b/a;

    invoke-direct {p2}, Le/h/d/a/a/o/b/a;-><init>()V

    invoke-virtual {p0}, Le/h/d/a/a/g/w;->c()Lfr/mbs/binary/Octets;

    move-result-object v0

    invoke-virtual {p2, v0, p1}, Le/h/d/a/a/o/b/a;->b(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object p1

    return-object p1

    .line 12
    :cond_0
    new-instance p2, Le/h/d/a/a/o/b/a;

    invoke-direct {p2}, Le/h/d/a/a/o/b/a;-><init>()V

    invoke-virtual {p0}, Le/h/d/a/a/g/w;->c()Lfr/mbs/binary/Octets;

    move-result-object v0

    invoke-virtual {p2, v0, p1}, Le/h/d/a/a/o/b/a;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object p1

    return-object p1
.end method

.method public final a(J)V
    .locals 1

    .line 13
    :try_start_0
    invoke-static {p1, p2}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string p2, "packid.ble.SecureWriter"

    const-string v0, "Could not sleep between reader auth"

    .line 14
    invoke-static {p2, v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 15
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    :goto_0
    return-void
.end method

.method public a(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;)V
    .locals 1

    .line 7
    invoke-super {p0, p1, p2}, Le/h/d/a/a/g/v;->a(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;)V

    .line 8
    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattDescriptor;->getCharacteristic()Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object p2

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object p2

    sget-object v0, Le/h/d/a/a/g/o;->f:Le/h/d/a/a/g/o;

    invoke-virtual {v0}, Le/h/d/a/a/g/o;->b()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 9
    invoke-virtual {p0, p1}, Le/h/d/a/a/g/w;->e(Landroid/bluetooth/BluetoothGatt;)V

    :cond_0
    return-void
.end method

.method public a(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattService;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "0- service "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattService;->getUuid()Ljava/util/UUID;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " discovered"

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v0, "packid.ble.SecureWriter"

    invoke-static {v0, p2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-object p2, p0, Le/h/d/a/a/g/w;->h:Le/h/d/a/a/n/i;

    invoke-virtual {p2}, Le/h/d/a/a/n/i;->e()V

    .line 3
    sget-object p2, Le/h/d/a/a/g/o;->f:Le/h/d/a/a/g/o;

    invoke-virtual {p0, p1, p2}, Le/h/d/a/a/g/v;->b(Landroid/bluetooth/BluetoothGatt;Le/h/d/a/a/g/o;)Z

    move-result p2

    if-eqz p2, :cond_0

    const-string p2, "has property notify"

    .line 4
    invoke-static {v0, p2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 5
    sget-object p2, Le/h/d/a/a/g/o;->f:Le/h/d/a/a/g/o;

    invoke-virtual {p0, p1, p2}, Le/h/d/a/a/g/v;->a(Landroid/bluetooth/BluetoothGatt;Le/h/d/a/a/g/o;)V

    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {p0, p1}, Le/h/d/a/a/g/w;->e(Landroid/bluetooth/BluetoothGatt;)V

    :goto_0
    return-void
.end method

.method public final a([B)Z
    .locals 4

    const/4 v0, 0x0

    const-string v1, "packid.ble.SecureWriter"

    if-eqz p1, :cond_1

    .line 16
    array-length v2, p1

    if-nez v2, :cond_0

    goto :goto_0

    .line 17
    :cond_0
    :try_start_0
    iget-object v2, p0, Le/h/d/a/a/g/v;->b:Le/h/d/a/a/n/w/c;

    iget-object v3, p0, Le/h/d/a/a/g/v;->c:Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    invoke-virtual {v3}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getCipheredWalletKey()Lfr/mbs/binary/Octets;

    move-result-object v3

    invoke-virtual {v2, v3}, Le/h/d/a/a/n/w/c;->b(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object v2

    .line 18
    new-instance v3, Le/h/d/a/a/o/b/a;

    invoke-direct {v3}, Le/h/d/a/a/o/b/a;-><init>()V

    invoke-static {p1}, Lfr/mbs/binary/Octets;->createOctets([B)Lfr/mbs/binary/Octets;

    move-result-object p1

    invoke-virtual {v3, v2, p1}, Le/h/d/a/a/o/b/a;->c(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object p1

    const/4 v2, 0x4

    .line 19
    invoke-virtual {p1, v2}, Lfr/mbs/binary/Octets;->pop(I)Lfr/mbs/binary/Octets;

    move-result-object v2

    const/16 v3, 0xc

    .line 20
    invoke-virtual {p1, v3}, Lfr/mbs/binary/Octets;->pop(I)Lfr/mbs/binary/Octets;

    move-result-object p1

    iput-object p1, p0, Le/h/d/a/a/g/w;->j:Lfr/mbs/binary/Octets;

    .line 21
    iget-object p1, p0, Le/h/d/a/a/g/w;->i:Lfr/mbs/binary/Octets;

    invoke-virtual {v2, p1}, Lfr/mbs/binary/Octets;->equals(Ljava/lang/Object;)Z

    move-result p1
    :try_end_0
    .catch Lcom/orange/oab/contactless/packid/g/u/e; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    const-string v2, "READER AUTHENTICATION failure: could not decrypt nonces"

    .line 22
    invoke-static {v1, v2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return v0

    :cond_1
    :goto_0
    const-string p1, "received empty encrypted nonces"

    .line 23
    invoke-static {v1, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return v0
.end method

.method public c()Lfr/mbs/binary/Octets;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/g/u/e;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/h/d/a/a/g/v;->b:Le/h/d/a/a/n/w/c;

    iget-object v1, p0, Le/h/d/a/a/g/v;->c:Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getCipheredWalletKey()Lfr/mbs/binary/Octets;

    move-result-object v1

    invoke-virtual {v0, v1}, Le/h/d/a/a/n/w/c;->b(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object v0

    .line 2
    new-instance v1, Le/h/d/a/a/o/b/a;

    invoke-direct {v1}, Le/h/d/a/a/o/b/a;-><init>()V

    iget-object v2, p0, Le/h/d/a/a/g/w;->j:Lfr/mbs/binary/Octets;

    invoke-static {v2}, Lfr/mbs/binary/Octets;->createOctets(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object v2

    iget-object v3, p0, Le/h/d/a/a/g/w;->i:Lfr/mbs/binary/Octets;

    invoke-virtual {v2, v3}, Lfr/mbs/binary/Octets;->put(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Le/h/d/a/a/o/b/a;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object v0

    return-object v0
.end method

.method public d()Lfr/mbs/binary/Octets;
    .locals 1

    .line 4
    iget-object v0, p0, Le/h/d/a/a/g/w;->j:Lfr/mbs/binary/Octets;

    invoke-virtual {p0, v0}, Le/h/d/a/a/g/w;->a(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object v0

    return-object v0
.end method

.method public abstract d(Landroid/bluetooth/BluetoothGatt;)V
.end method

.method public d(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object v0

    sget-object v1, Le/h/d/a/a/g/o;->f:Le/h/d/a/a/g/o;

    invoke-virtual {v1}, Le/h/d/a/a/g/o;->b()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-direct {p0, p1, p2}, Le/h/d/a/a/g/w;->g(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V

    goto :goto_0

    .line 3
    :cond_0
    invoke-super {p0, p1, p2}, Le/h/d/a/a/g/v;->d(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V

    :goto_0
    return-void
.end method

.method public final e(Landroid/bluetooth/BluetoothGatt;)V
    .locals 3

    const-string v0, "packid.ble.SecureWriter"

    const-string v1, "1- write INIT AUTHENTICATION"

    .line 4
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x4

    .line 5
    invoke-static {v0}, Lfr/mbs/binary/Octets;->random(I)Lfr/mbs/binary/Octets;

    move-result-object v0

    iput-object v0, p0, Le/h/d/a/a/g/w;->i:Lfr/mbs/binary/Octets;

    .line 6
    sget-object v1, Le/h/d/a/a/g/o;->e:Le/h/d/a/a/g/o;

    invoke-static {v0}, Lfr/mbs/binary/Octets;->createOctets(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object v0

    iget-object v2, p0, Le/h/d/a/a/g/v;->d:Lcom/orange/oab/contactless/packid/hce/user/User;

    invoke-virtual {v2}, Lcom/orange/oab/contactless/packid/hce/user/User;->getWallet()Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;

    move-result-object v2

    invoke-virtual {v2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;->getId()Lfr/mbs/binary/Octets;

    move-result-object v2

    invoke-virtual {v0, v2}, Lfr/mbs/binary/Octets;->put(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object v0

    invoke-virtual {p0, p1, v1, v0}, Le/h/d/a/a/g/v;->a(Landroid/bluetooth/BluetoothGatt;Le/h/d/a/a/g/o;Lfr/mbs/binary/Octets;)Z

    return-void
.end method

.method public e(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object v0

    sget-object v1, Le/h/d/a/a/g/o;->f:Le/h/d/a/a/g/o;

    invoke-virtual {v1}, Le/h/d/a/a/g/o;->b()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-direct {p0, p1, p2}, Le/h/d/a/a/g/w;->g(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V

    goto :goto_0

    .line 3
    :cond_0
    invoke-super {p0, p1, p2}, Le/h/d/a/a/g/v;->e(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V

    :goto_0
    return-void
.end method

.method public final f(Landroid/bluetooth/BluetoothGatt;)V
    .locals 2

    .line 15
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "3- read READER AUTHENTICATION (try "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/h/d/a/a/g/w;->h:Le/h/d/a/a/n/i;

    invoke-virtual {v1}, Le/h/d/a/a/n/i;->a()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "packid.ble.SecureWriter"

    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 16
    sget-object v0, Le/h/d/a/a/g/o;->f:Le/h/d/a/a/g/o;

    invoke-virtual {p0, p1, v0}, Le/h/d/a/a/g/v;->c(Landroid/bluetooth/BluetoothGatt;Le/h/d/a/a/g/o;)V

    return-void
.end method

.method public f(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V
    .locals 3

    .line 1
    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object v0

    sget-object v1, Le/h/d/a/a/g/o;->e:Le/h/d/a/a/g/o;

    invoke-virtual {v1}, Le/h/d/a/a/g/o;->b()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v0

    const-string v1, "packid.ble.SecureWriter"

    if-eqz v0, :cond_1

    const-string p2, "2- INIT AUTHENTICATION written successfully"

    .line 2
    invoke-static {v1, p2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p2, 0x1

    .line 3
    iput-boolean p2, p0, Le/h/d/a/a/g/w;->l:Z

    .line 4
    sget-object p2, Le/h/d/a/a/g/o;->f:Le/h/d/a/a/g/o;

    invoke-virtual {p0, p1, p2}, Le/h/d/a/a/g/v;->b(Landroid/bluetooth/BluetoothGatt;Le/h/d/a/a/g/o;)Z

    move-result p2

    if-eqz p2, :cond_0

    const-string p2, "Reader auth characteristic has notify property, waiting for notification"

    .line 5
    invoke-static {v1, p2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    iget-object p2, p0, Le/h/d/a/a/g/w;->k:Landroid/bluetooth/BluetoothGattCharacteristic;

    if-eqz p2, :cond_3

    const-string p2, "=> READER AUTH already received before INIT AUTHENTICATION, dealing it now"

    .line 7
    invoke-static {v1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 8
    iget-object p2, p0, Le/h/d/a/a/g/w;->k:Landroid/bluetooth/BluetoothGattCharacteristic;

    invoke-direct {p0, p1, p2}, Le/h/d/a/a/g/w;->g(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V

    goto :goto_0

    :cond_0
    const-string p2, "Reader auth characteristic does not have notify property, reading characteristic"

    .line 9
    invoke-static {v1, p2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 10
    invoke-virtual {p0, p1}, Le/h/d/a/a/g/w;->f(Landroid/bluetooth/BluetoothGatt;)V

    goto :goto_0

    .line 11
    :cond_1
    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object v0

    sget-object v2, Le/h/d/a/a/g/o;->g:Le/h/d/a/a/g/o;

    invoke-virtual {v2}, Le/h/d/a/a/g/o;->b()Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string p2, "6- identifier written successfully, reading reader result"

    .line 12
    invoke-static {v1, p2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 13
    invoke-virtual {p0, p1}, Le/h/d/a/a/g/v;->c(Landroid/bluetooth/BluetoothGatt;)V

    goto :goto_0

    .line 14
    :cond_2
    invoke-super {p0, p1, p2}, Le/h/d/a/a/g/v;->f(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V

    :cond_3
    :goto_0
    return-void
.end method
