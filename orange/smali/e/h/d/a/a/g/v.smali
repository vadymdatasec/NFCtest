.class public abstract Le/h/d/a/a/g/v;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final g:Ljava/util/UUID;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Le/h/d/a/a/n/w/c;

.field public final c:Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

.field public final d:Lcom/orange/oab/contactless/packid/hce/user/User;

.field public final e:Ljava/util/UUID;

.field public f:Le/h/d/a/a/g/k;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "00002902-0000-1000-8000-00805f9b34fb"

    .line 1
    invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v0

    sput-object v0, Le/h/d/a/a/g/v;->g:Ljava/util/UUID;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Le/h/d/a/a/n/w/c;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Lcom/orange/oab/contactless/packid/hce/user/User;Ljava/util/UUID;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/h/d/a/a/g/v;->a:Landroid/content/Context;

    .line 3
    iput-object p2, p0, Le/h/d/a/a/g/v;->b:Le/h/d/a/a/n/w/c;

    .line 4
    iput-object p3, p0, Le/h/d/a/a/g/v;->c:Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    .line 5
    iput-object p4, p0, Le/h/d/a/a/g/v;->d:Lcom/orange/oab/contactless/packid/hce/user/User;

    .line 6
    iput-object p5, p0, Le/h/d/a/a/g/v;->e:Ljava/util/UUID;

    return-void
.end method

.method public static a(Le/h/d/a/a/n/w/c;Lcom/orange/oab/contactless/packid/hce/user/User;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Landroid/content/Context;)Le/h/d/a/a/g/v;
    .locals 1

    .line 1
    invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->isToken()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2
    invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->isSecured()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    new-instance v0, Le/h/d/a/a/g/u;

    invoke-direct {v0, p3, p0, p2, p1}, Le/h/d/a/a/g/u;-><init>(Landroid/content/Context;Le/h/d/a/a/n/w/c;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Lcom/orange/oab/contactless/packid/hce/user/User;)V

    return-object v0

    .line 4
    :cond_0
    new-instance v0, Le/h/d/a/a/g/t;

    invoke-direct {v0, p3, p0, p2, p1}, Le/h/d/a/a/g/t;-><init>(Landroid/content/Context;Le/h/d/a/a/n/w/c;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Lcom/orange/oab/contactless/packid/hce/user/User;)V

    return-object v0

    .line 5
    :cond_1
    invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->isSecured()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 6
    new-instance v0, Le/h/d/a/a/g/s;

    invoke-direct {v0, p3, p0, p2, p1}, Le/h/d/a/a/g/s;-><init>(Landroid/content/Context;Le/h/d/a/a/n/w/c;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Lcom/orange/oab/contactless/packid/hce/user/User;)V

    return-object v0

    .line 7
    :cond_2
    new-instance v0, Le/h/d/a/a/g/t;

    invoke-direct {v0, p3, p0, p2, p1}, Le/h/d/a/a/g/t;-><init>(Landroid/content/Context;Le/h/d/a/a/n/w/c;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Lcom/orange/oab/contactless/packid/hce/user/User;)V

    return-object v0
.end method


# virtual methods
.method public a(Landroid/bluetooth/BluetoothGatt;)Landroid/bluetooth/BluetoothGattService;
    .locals 1

    .line 15
    iget-object v0, p0, Le/h/d/a/a/g/v;->e:Ljava/util/UUID;

    invoke-virtual {p1, v0}, Landroid/bluetooth/BluetoothGatt;->getService(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattService;

    move-result-object p1

    return-object p1
.end method

.method public a(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    if-eqz p1, :cond_2

    .line 40
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 41
    :cond_0
    invoke-virtual {p0, p1}, Le/h/d/a/a/g/v;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 42
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    move-object p1, v0

    :goto_0
    return-object p1

    :cond_2
    :goto_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public final a(Ljava/util/List;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    const-string v0, " "

    .line 43
    invoke-static {p1, v0}, Lm/a/a/c/e;->a(Ljava/lang/Iterable;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, ",$"

    const-string v1, ""

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public a()V
    .locals 3

    .line 45
    new-instance v0, Le/h/d/a/a/r/a;

    iget-object v1, p0, Le/h/d/a/a/g/v;->a:Landroid/content/Context;

    invoke-direct {v0, v1}, Le/h/d/a/a/r/a;-><init>(Landroid/content/Context;)V

    iget-object v1, p0, Le/h/d/a/a/g/v;->d:Lcom/orange/oab/contactless/packid/hce/user/User;

    invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->getContactlessId()Lfr/mbs/binary/Octets;

    move-result-object v1

    iget-object v2, p0, Le/h/d/a/a/g/v;->c:Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    invoke-virtual {v2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getZoneId()Lfr/mbs/binary/Octets;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Le/h/d/a/a/r/a;->b(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)V

    return-void
.end method

.method public a(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V
    .locals 2

    .line 13
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "recv NOTIF "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p2}, Le/h/d/a/a/g/o;->b(Landroid/bluetooth/BluetoothGattCharacteristic;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "packid.ble.Writer"

    invoke-static {v1, v0}, Lcom/orange/oab/contactless/packid/debug/DebugConsole;->log(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    invoke-virtual {p0, p1, p2}, Le/h/d/a/a/g/v;->d(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V

    return-void
.end method

.method public a(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;)V
    .locals 2

    .line 16
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "recv DESC WRITE "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattDescriptor;->getCharacteristic()Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v1

    invoke-static {v1}, Le/h/d/a/a/g/o;->b(Landroid/bluetooth/BluetoothGattCharacteristic;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "packid.ble.Writer"

    invoke-static {v1, v0}, Lcom/orange/oab/contactless/packid/debug/DebugConsole;->log(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattDescriptor;->getCharacteristic()Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object p2

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object p2

    sget-object v0, Le/h/d/a/a/g/o;->h:Le/h/d/a/a/g/o;

    invoke-virtual {v0}, Le/h/d/a/a/g/o;->b()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 18
    invoke-virtual {p0, p1}, Le/h/d/a/a/g/v;->a(Landroid/bluetooth/BluetoothGatt;)Landroid/bluetooth/BluetoothGattService;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Le/h/d/a/a/g/v;->a(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattService;)V

    :cond_0
    return-void
.end method

.method public abstract a(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattService;)V
.end method

.method public a(Landroid/bluetooth/BluetoothGatt;Le/h/d/a/a/g/o;)V
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    .line 19
    invoke-virtual {p0, p1, p2}, Le/h/d/a/a/g/v;->d(Landroid/bluetooth/BluetoothGatt;Le/h/d/a/a/g/o;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x1

    .line 20
    invoke-virtual {p1, v0, v1}, Landroid/bluetooth/BluetoothGatt;->setCharacteristicNotification(Landroid/bluetooth/BluetoothGattCharacteristic;Z)Z

    .line 21
    sget-object v1, Le/h/d/a/a/g/v;->g:Ljava/util/UUID;

    invoke-virtual {v0, v1}, Landroid/bluetooth/BluetoothGattCharacteristic;->getDescriptor(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattDescriptor;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 22
    sget-object v1, Landroid/bluetooth/BluetoothGattDescriptor;->ENABLE_NOTIFICATION_VALUE:[B

    invoke-virtual {v0, v1}, Landroid/bluetooth/BluetoothGattDescriptor;->setValue([B)Z

    .line 23
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "send WRITE DESC "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Le/h/d/a/a/g/o;->a()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v1, "packid.ble.Writer"

    invoke-static {v1, p2}, Lcom/orange/oab/contactless/packid/debug/DebugConsole;->log(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    invoke-virtual {p1, v0}, Landroid/bluetooth/BluetoothGatt;->writeDescriptor(Landroid/bluetooth/BluetoothGattDescriptor;)Z

    :cond_1
    return-void
.end method

.method public final a(Landroid/bluetooth/BluetoothGatt;Ljava/lang/String;)V
    .locals 3

    .line 8
    iget-object v0, p0, Le/h/d/a/a/g/v;->f:Le/h/d/a/a/g/k;

    sget-object v1, Lcom/orange/business/packid/android/lib/TransactionErrorType;->ABORT:Lcom/orange/business/packid/android/lib/TransactionErrorType;

    const/4 v2, 0x1

    invoke-virtual {v0, p1, p2, v2, v1}, Le/h/d/a/a/g/k;->a(Landroid/bluetooth/BluetoothGatt;Ljava/lang/String;ILcom/orange/business/packid/android/lib/TransactionErrorType;)V

    return-void
.end method

.method public final a(Landroid/bluetooth/BluetoothGattCharacteristic;Landroid/bluetooth/BluetoothDevice;)V
    .locals 3

    .line 25
    new-instance v0, Ljava/lang/String;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGattCharacteristic;->getValue()[B

    move-result-object v1

    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v0, v1, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 26
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGattCharacteristic;->getValue()[B

    move-result-object p1

    invoke-virtual {p0, p1}, Le/h/d/a/a/g/v;->a([B)V

    .line 27
    invoke-virtual {p0, v0}, Le/h/d/a/a/g/v;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 28
    invoke-virtual {p0, p1}, Le/h/d/a/a/g/v;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Le/h/d/a/a/g/v;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 29
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "message received: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "packid.ble.Writer"

    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 30
    iget-object v0, p0, Le/h/d/a/a/g/v;->f:Le/h/d/a/a/g/k;

    invoke-virtual {v0}, Le/h/d/a/a/g/k;->b()V

    .line 31
    new-instance v0, Le/h/d/a/a/r/a;

    iget-object v1, p0, Le/h/d/a/a/g/v;->a:Landroid/content/Context;

    invoke-direct {v0, v1}, Le/h/d/a/a/r/a;-><init>(Landroid/content/Context;)V

    iget-object v1, p0, Le/h/d/a/a/g/v;->d:Lcom/orange/oab/contactless/packid/hce/user/User;

    iget-object v2, p0, Le/h/d/a/a/g/v;->c:Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    invoke-virtual {v0, v1, v2, p2, p1}, Le/h/d/a/a/r/a;->a(Lcom/orange/oab/contactless/packid/hce/user/User;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;)V

    return-void
.end method

.method public a(Le/h/d/a/a/g/k;)V
    .locals 0

    .line 44
    iput-object p1, p0, Le/h/d/a/a/g/v;->f:Le/h/d/a/a/g/k;

    return-void
.end method

.method public final a([B)V
    .locals 3

    .line 32
    array-length v0, p1

    const/4 v1, 0x3

    if-ge v0, v1, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 33
    invoke-static {p1}, Lfr/mbs/binary/Octets;->createOctets([B)Lfr/mbs/binary/Octets;

    move-result-object p1

    .line 34
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    const-string v2, "#UL"

    invoke-virtual {v2, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v1

    invoke-static {v1}, Lfr/mbs/binary/Octets;->createOctets([B)Lfr/mbs/binary/Octets;

    move-result-object v1

    .line 35
    invoke-virtual {v1}, Lfr/mbs/binary/Octets;->size()I

    move-result v2

    invoke-virtual {p1, v2}, Lfr/mbs/binary/Octets;->pop(I)Lfr/mbs/binary/Octets;

    move-result-object v2

    .line 36
    invoke-virtual {v1}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 37
    invoke-virtual {p1}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;

    move-result-object v0

    .line 38
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "#unlock id to unlock : "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "packid.ble.Writer"

    invoke-static {v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 39
    :cond_1
    invoke-virtual {p0, v0}, Le/h/d/a/a/g/v;->b(Ljava/lang/String;)V

    return-void
.end method

.method public a(Landroid/bluetooth/BluetoothGatt;Le/h/d/a/a/g/o;Lfr/mbs/binary/Octets;)Z
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    .line 9
    invoke-virtual {p0, p1, p2}, Le/h/d/a/a/g/v;->d(Landroid/bluetooth/BluetoothGatt;Le/h/d/a/a/g/o;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 10
    invoke-virtual {p3}, Lfr/mbs/binary/Octets;->toBytes()[B

    move-result-object p3

    invoke-virtual {v0, p3}, Landroid/bluetooth/BluetoothGattCharacteristic;->setValue([B)Z

    .line 11
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "send WRITE "

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Le/h/d/a/a/g/o;->a()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string p3, "packid.ble.Writer"

    invoke-static {p3, p2}, Lcom/orange/oab/contactless/packid/debug/DebugConsole;->log(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    invoke-virtual {p1, v0}, Landroid/bluetooth/BluetoothGatt;->writeCharacteristic(Landroid/bluetooth/BluetoothGattCharacteristic;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public b()I
    .locals 1

    .line 13
    iget-object v0, p0, Le/h/d/a/a/g/v;->c:Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    invoke-virtual {v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getGattConnectionTimeoutMs()I

    move-result v0

    return v0
.end method

.method public b(Landroid/bluetooth/BluetoothGatt;)V
    .locals 4

    .line 5
    iget-object v0, p0, Le/h/d/a/a/g/v;->e:Ljava/util/UUID;

    invoke-virtual {p1, v0}, Landroid/bluetooth/BluetoothGatt;->getService(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattService;

    move-result-object v0

    const-string v1, "Service "

    if-nez v0, :cond_0

    .line 6
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/h/d/a/a/g/v;->e:Ljava/util/UUID;

    invoke-static {v1}, Le/h/d/a/a/g/o;->b(Ljava/util/UUID;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " not found"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Le/h/d/a/a/g/v;->a(Landroid/bluetooth/BluetoothGatt;Ljava/lang/String;)V

    goto :goto_0

    .line 7
    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/h/d/a/a/g/v;->e:Ljava/util/UUID;

    invoke-static {v1}, Le/h/d/a/a/g/o;->b(Ljava/util/UUID;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " OK"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    const-string v3, "packid.ble.Writer"

    invoke-static {v3, v1, v2}, Lcom/orange/oab/contactless/packid/debug/DebugConsole;->log(Ljava/lang/String;Ljava/lang/String;I)V

    .line 8
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Send "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Le/h/d/a/a/g/v;->c:Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    invoke-virtual {v2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getDescription()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    invoke-static {v3, v1, v2}, Lcom/orange/oab/contactless/packid/debug/DebugConsole;->log(Ljava/lang/String;Ljava/lang/String;I)V

    .line 9
    sget-object v1, Le/h/d/a/a/g/o;->h:Le/h/d/a/a/g/o;

    invoke-virtual {p0, p1, v1}, Le/h/d/a/a/g/v;->b(Landroid/bluetooth/BluetoothGatt;Le/h/d/a/a/g/o;)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v0, "has CHARACTERISTIC_UUID_READER_RESULT property notify"

    .line 10
    invoke-static {v3, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 11
    sget-object v0, Le/h/d/a/a/g/o;->h:Le/h/d/a/a/g/o;

    invoke-virtual {p0, p1, v0}, Le/h/d/a/a/g/v;->a(Landroid/bluetooth/BluetoothGatt;Le/h/d/a/a/g/o;)V

    goto :goto_0

    .line 12
    :cond_1
    invoke-virtual {p0, p1, v0}, Le/h/d/a/a/g/v;->a(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattService;)V

    :goto_0
    return-void
.end method

.method public b(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V
    .locals 2

    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "recv READ "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p2}, Le/h/d/a/a/g/o;->b(Landroid/bluetooth/BluetoothGattCharacteristic;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "packid.ble.Writer"

    invoke-static {v1, v0}, Lcom/orange/oab/contactless/packid/debug/DebugConsole;->log(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    invoke-virtual {p0, p1, p2}, Le/h/d/a/a/g/v;->e(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V

    return-void
.end method

.method public abstract b(Ljava/lang/String;)V
.end method

.method public b(Landroid/bluetooth/BluetoothGatt;Le/h/d/a/a/g/o;)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Le/h/d/a/a/g/v;->d(Landroid/bluetooth/BluetoothGatt;Le/h/d/a/a/g/o;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGattCharacteristic;->getProperties()I

    move-result p1

    and-int/lit8 p1, p1, 0x10

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final c(Ljava/lang/String;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 10
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const-string v1, "(?=#)"

    .line 11
    invoke-virtual {p1, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-object v3, p1, v2

    .line 12
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_1

    const-string v4, "#"

    .line 13
    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {p0, v3}, Le/h/d/a/a/g/v;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    :cond_0
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public c(Landroid/bluetooth/BluetoothGatt;)V
    .locals 2

    .line 6
    sget-object v0, Le/h/d/a/a/g/o;->h:Le/h/d/a/a/g/o;

    invoke-virtual {p0, p1, v0}, Le/h/d/a/a/g/v;->b(Landroid/bluetooth/BluetoothGatt;Le/h/d/a/a/g/o;)Z

    move-result v0

    const-string v1, "packid.ble.Writer"

    if-eqz v0, :cond_0

    const-string p1, "Reader result characteristic has notify property, waiting for notification"

    .line 7
    invoke-static {v1, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_0
    const-string v0, "Reader result characteristic does not have notify property, reading characteristic"

    .line 8
    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 9
    sget-object v0, Le/h/d/a/a/g/o;->h:Le/h/d/a/a/g/o;

    invoke-virtual {p0, p1, v0}, Le/h/d/a/a/g/v;->c(Landroid/bluetooth/BluetoothGatt;Le/h/d/a/a/g/o;)V

    :goto_0
    return-void
.end method

.method public c(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V
    .locals 2

    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "recv WRITE "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p2}, Le/h/d/a/a/g/o;->b(Landroid/bluetooth/BluetoothGattCharacteristic;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "packid.ble.Writer"

    invoke-static {v1, v0}, Lcom/orange/oab/contactless/packid/debug/DebugConsole;->log(Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    invoke-virtual {p0, p1, p2}, Le/h/d/a/a/g/v;->f(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V

    return-void
.end method

.method public c(Landroid/bluetooth/BluetoothGatt;Le/h/d/a/a/g/o;)V
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Le/h/d/a/a/g/v;->d(Landroid/bluetooth/BluetoothGatt;Le/h/d/a/a/g/o;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "send READ "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Le/h/d/a/a/g/o;->a()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v1, "packid.ble.Writer"

    invoke-static {v1, p2}, Lcom/orange/oab/contactless/packid/debug/DebugConsole;->log(Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    invoke-virtual {p1, v0}, Landroid/bluetooth/BluetoothGatt;->readCharacteristic(Landroid/bluetooth/BluetoothGattCharacteristic;)Z

    :cond_0
    return-void
.end method

.method public final d(Landroid/bluetooth/BluetoothGatt;Le/h/d/a/a/g/o;)Landroid/bluetooth/BluetoothGattCharacteristic;
    .locals 4

    .line 3
    iget-object v0, p0, Le/h/d/a/a/g/v;->e:Ljava/util/UUID;

    invoke-virtual {p1, v0}, Landroid/bluetooth/BluetoothGatt;->getService(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattService;

    move-result-object v0

    const-string v1, " not found"

    if-nez v0, :cond_0

    .line 4
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Service "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Le/h/d/a/a/g/v;->e:Ljava/util/UUID;

    invoke-static {v0}, Le/h/d/a/a/g/o;->b(Ljava/util/UUID;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Le/h/d/a/a/g/v;->a(Landroid/bluetooth/BluetoothGatt;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1

    .line 5
    :cond_0
    invoke-virtual {p2}, Le/h/d/a/a/g/o;->b()Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/bluetooth/BluetoothGattService;->getCharacteristic(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v0

    if-nez v0, :cond_1

    .line 6
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Characteristic "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Le/h/d/a/a/g/o;->a()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Le/h/d/a/a/g/v;->a(Landroid/bluetooth/BluetoothGatt;Ljava/lang/String;)V

    :cond_1
    return-object v0
.end method

.method public final d(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, "\\p{C}"

    const-string v1, " "

    .line 7
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public d(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object v0

    sget-object v1, Le/h/d/a/a/g/o;->h:Le/h/d/a/a/g/o;

    invoke-virtual {v1}, Le/h/d/a/a/g/o;->b()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0, p1, p2}, Le/h/d/a/a/g/v;->e(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V

    :cond_0
    return-void
.end method

.method public final e(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    const-string v0, "#UL"

    .line 5
    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 6
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "#"

    .line 7
    invoke-virtual {p1, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    .line 8
    array-length v2, p1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, p1, v3

    .line 9
    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_0

    const-string v5, "UL"

    invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_0

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 11
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :cond_2
    return-object p1
.end method

.method public e(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V
    .locals 7

    .line 1
    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object v0

    sget-object v1, Le/h/d/a/a/g/o;->h:Le/h/d/a/a/g/o;

    invoke-virtual {v1}, Le/h/d/a/a/g/o;->b()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0, p1, p2}, Le/h/d/a/a/g/v;->g(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V

    goto :goto_0

    .line 3
    :cond_0
    new-instance v1, Le/h/d/a/a/w/g;

    invoke-direct {v1}, Le/h/d/a/a/w/g;-><init>()V

    iget-object v2, p0, Le/h/d/a/a/g/v;->a:Landroid/content/Context;

    iget-object v3, p0, Le/h/d/a/a/g/v;->d:Lcom/orange/oab/contactless/packid/hce/user/User;

    iget-object v4, p0, Le/h/d/a/a/g/v;->c:Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    const-string v5, "KO"

    const-string v6, "BLE"

    invoke-virtual/range {v1 .. v6}, Le/h/d/a/a/w/g;->a(Landroid/content/Context;Lcom/orange/oab/contactless/packid/hce/user/User;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unexpected read: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p2}, Le/h/d/a/a/g/o;->b(Landroid/bluetooth/BluetoothGattCharacteristic;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Le/h/d/a/a/g/v;->a(Landroid/bluetooth/BluetoothGatt;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public final f(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    const-string v0, "#"

    const-string v1, ""

    .line 2
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "reader_result_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 4
    iget-object v1, p0, Le/h/d/a/a/g/v;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    iget-object v2, p0, Le/h/d/a/a/g/v;->a:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "string"

    invoke-virtual {v1, v0, v3, v2}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_0

    .line 5
    iget-object p1, p0, Le/h/d/a/a/g/v;->a:Landroid/content/Context;

    invoke-static {p1}, Le/h/a/a/a/a/a;->a(Landroid/content/Context;)Le/h/a/a/a/a/a;

    move-result-object p1

    .line 6
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v0}, Le/h/a/a/a/a/a;->a(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ","

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :cond_0
    return-object p1
.end method

.method public f(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unexpected write: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p2}, Le/h/d/a/a/g/o;->b(Landroid/bluetooth/BluetoothGattCharacteristic;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Le/h/d/a/a/g/v;->a(Landroid/bluetooth/BluetoothGatt;Ljava/lang/String;)V

    return-void
.end method

.method public final g(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 7
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const-string v1, " "

    .line 8
    invoke-virtual {p1, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, p1, v2

    .line 9
    invoke-virtual {p0, v3}, Le/h/d/a/a/g/v;->c(Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {p0, v0}, Le/h/d/a/a/g/v;->a(Ljava/util/List;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final g(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    const-string v1, "packid.ble.Writer"

    const-string v2, "7- reader result read successfully, notifying with message and disconnecting"

    .line 2
    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    iget-object v1, p0, Le/h/d/a/a/g/v;->a:Landroid/content/Context;

    invoke-static {v1}, Le/h/d/a/a/s/m;->b(Landroid/content/Context;)Le/h/d/a/a/s/c0;

    move-result-object v1

    new-instance v2, Lcom/orange/oab/contactless/packid/domain/Transaction;

    iget-object v3, p0, Le/h/d/a/a/g/v;->c:Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    invoke-virtual {v3}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getZoneId()Lfr/mbs/binary/Octets;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/orange/oab/contactless/packid/domain/Transaction;-><init>(Lfr/mbs/binary/Octets;)V

    invoke-virtual {v1, v2}, Le/h/d/a/a/s/c0;->a(Lcom/orange/oab/contactless/packid/domain/Transaction;)V

    .line 4
    invoke-virtual {p0, p2, v0}, Le/h/d/a/a/g/v;->a(Landroid/bluetooth/BluetoothGattCharacteristic;Landroid/bluetooth/BluetoothDevice;)V

    .line 5
    iget-object p2, p0, Le/h/d/a/a/g/v;->f:Le/h/d/a/a/g/k;

    iget-object v0, p0, Le/h/d/a/a/g/v;->c:Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    invoke-virtual {v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getDescription()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, p1, v0}, Le/h/d/a/a/g/k;->a(Landroid/bluetooth/BluetoothGatt;Ljava/lang/String;)V

    .line 6
    new-instance v1, Le/h/d/a/a/w/g;

    invoke-direct {v1}, Le/h/d/a/a/w/g;-><init>()V

    iget-object v2, p0, Le/h/d/a/a/g/v;->a:Landroid/content/Context;

    iget-object v3, p0, Le/h/d/a/a/g/v;->d:Lcom/orange/oab/contactless/packid/hce/user/User;

    iget-object v4, p0, Le/h/d/a/a/g/v;->c:Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    const-string v5, "OK"

    const-string v6, "BLE"

    invoke-virtual/range {v1 .. v6}, Le/h/d/a/a/w/g;->a(Landroid/content/Context;Lcom/orange/oab/contactless/packid/hce/user/User;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
