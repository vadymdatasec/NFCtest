.class public Le/h/d/a/a/g/t;
.super Le/h/d/a/a/g/v;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;Le/h/d/a/a/n/w/c;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Lcom/orange/oab/contactless/packid/hce/user/User;)V
    .locals 7

    .line 1
    sget-object v0, Le/h/d/a/a/g/o;->c:Le/h/d/a/a/g/o;

    invoke-virtual {v0}, Le/h/d/a/a/g/o;->b()Ljava/util/UUID;

    move-result-object v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v1 .. v6}, Le/h/d/a/a/g/v;-><init>(Landroid/content/Context;Le/h/d/a/a/n/w/c;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Lcom/orange/oab/contactless/packid/hce/user/User;Ljava/util/UUID;)V

    return-void
.end method


# virtual methods
.method public a(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattService;)V
    .locals 3

    const-string p2, "packid.ble.Id.Unsecured"

    const-string v0, "services discovered, writing identifier"

    .line 1
    invoke-static {p2, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    :try_start_0
    sget-object v0, Le/h/d/a/a/g/o;->g:Le/h/d/a/a/g/o;

    iget-object v1, p0, Le/h/d/a/a/g/v;->b:Le/h/d/a/a/n/w/c;

    iget-object v2, p0, Le/h/d/a/a/g/v;->c:Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    invoke-virtual {v2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getCipheredId()Lfr/mbs/binary/Octets;

    move-result-object v2

    invoke-virtual {v1, v2}, Le/h/d/a/a/n/w/c;->b(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object v1

    invoke-virtual {p0, p1, v0, v1}, Le/h/d/a/a/g/v;->a(Landroid/bluetooth/BluetoothGatt;Le/h/d/a/a/g/o;Lfr/mbs/binary/Octets;)Z
    :try_end_0
    .catch Lcom/orange/oab/contactless/packid/g/u/e; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v0, "Send PackId Identifier: Could not decrypt badge:"

    .line 3
    invoke-static {p2, v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public f(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object v0

    sget-object v1, Le/h/d/a/a/g/o;->g:Le/h/d/a/a/g/o;

    invoke-virtual {v1}, Le/h/d/a/a/g/o;->b()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p2, "packid.ble.Id.Unsecured"

    const-string v0, "identifer written successfully, reading reader result"

    .line 2
    invoke-static {p2, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    invoke-virtual {p0, p1}, Le/h/d/a/a/g/v;->c(Landroid/bluetooth/BluetoothGatt;)V

    goto :goto_0

    .line 4
    :cond_0
    invoke-super {p0, p1, p2}, Le/h/d/a/a/g/v;->f(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V

    :goto_0
    return-void
.end method
