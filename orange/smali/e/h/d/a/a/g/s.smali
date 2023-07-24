.class public Le/h/d/a/a/g/s;
.super Le/h/d/a/a/g/w;
.source "SourceFile"


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

    return-void
.end method

.method private e(Landroid/bluetooth/BluetoothGatt;)V
    .locals 4

    const-string v0, "packid.ble.Id.Secured"

    const-string v1, "5- write UUID IDENTIFIER"

    .line 1
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    :try_start_0
    sget-object v0, Le/h/d/a/a/g/o;->g:Le/h/d/a/a/g/o;

    invoke-virtual {p0}, Le/h/d/a/a/g/s;->e()Lfr/mbs/binary/Octets;

    move-result-object v1

    invoke-virtual {p0, p1, v0, v1}, Le/h/d/a/a/g/v;->a(Landroid/bluetooth/BluetoothGatt;Le/h/d/a/a/g/o;Lfr/mbs/binary/Octets;)Z
    :try_end_0
    .catch Lcom/orange/oab/contactless/packid/g/u/e; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 3
    :catch_0
    iget-object v0, p0, Le/h/d/a/a/g/v;->f:Le/h/d/a/a/g/k;

    sget-object v1, Lcom/orange/business/packid/android/lib/TransactionErrorType;->CIPHER:Lcom/orange/business/packid/android/lib/TransactionErrorType;

    const/4 v2, 0x2

    const-string v3, "Can\'t cipher identifier"

    invoke-virtual {v0, p1, v3, v2, v1}, Le/h/d/a/a/g/k;->a(Landroid/bluetooth/BluetoothGatt;Ljava/lang/String;ILcom/orange/business/packid/android/lib/TransactionErrorType;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public b(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public d(Landroid/bluetooth/BluetoothGatt;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Le/h/d/a/a/g/s;->e(Landroid/bluetooth/BluetoothGatt;)V

    return-void
.end method

.method public final e()Lfr/mbs/binary/Octets;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/g/u/e;
        }
    .end annotation

    .line 4
    iget-object v0, p0, Le/h/d/a/a/g/v;->b:Le/h/d/a/a/n/w/c;

    iget-object v1, p0, Le/h/d/a/a/g/v;->c:Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getCipheredId()Lfr/mbs/binary/Octets;

    move-result-object v1

    invoke-virtual {v0, v1}, Le/h/d/a/a/n/w/c;->b(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Le/h/d/a/a/g/w;->a(Lfr/mbs/binary/Octets;Z)Lfr/mbs/binary/Octets;

    move-result-object v0

    return-object v0
.end method
