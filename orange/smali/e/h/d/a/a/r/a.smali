.class public Le/h/d/a/a/r/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Le/h/d/a/a/r/a;->a:Landroid/content/Context;

    return-void
.end method

.method public static a(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;
    .locals 3

    .line 57
    new-instance v0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    invoke-virtual {p0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getZoneId()Lfr/mbs/binary/Octets;

    move-result-object v1

    invoke-virtual {p0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getMaskedId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getDescription()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, v1, v2, p0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;-><init>(Lfr/mbs/binary/Octets;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public final a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;Ljava/lang/String;)Landroid/content/Intent;
    .locals 2

    .line 49
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.orange.oab.contactless.packid.action.CONTACTLESS_TRANSACTION"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "eventType"

    .line 50
    invoke-virtual {v0, v1, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    const-string p3, "contactlessId"

    .line 51
    invoke-virtual {v0, p3, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    const-string p1, "zoneId"

    .line 52
    invoke-virtual {v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    if-eqz p4, :cond_0

    const-string p1, "message"

    .line 53
    invoke-virtual {v0, p1, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    :cond_0
    return-object v0
.end method

.method public final a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;Ljava/lang/String;Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;)Landroid/content/Intent;
    .locals 3

    if-nez p3, :cond_0

    .line 40
    iget-object p3, p0, Le/h/d/a/a/r/a;->a:Landroid/content/Context;

    sget v0, Le/h/d/a/a/c;->notification_badge_read_end:I

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p4, v1, v2

    invoke-virtual {p3, v0, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    .line 41
    :cond_0
    invoke-virtual {p0, p1, p2, p5, p3}, Le/h/d/a/a/r/a;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p1

    const-string p2, "badge"

    .line 42
    invoke-virtual {p1, p2, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    return-object p1
.end method

.method public final a(Ljava/lang/String;Ljava/lang/Throwable;)Landroid/content/Intent;
    .locals 2

    .line 10
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.orange.oab.contactless.packid.action.USER_LOADING_ERROR"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "message"

    .line 11
    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    if-eqz p2, :cond_0

    .line 12
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    const-string p2, "exception"

    invoke-virtual {v0, p2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    :cond_0
    return-object v0
.end method

.method public final a(Ljava/util/List;)Ljava/util/ArrayList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;",
            ">;)",
            "Ljava/util/ArrayList<",
            "*>;"
        }
    .end annotation

    .line 54
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 55
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    .line 56
    invoke-static {v1}, Le/h/d/a/a/r/a;->a(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public a()V
    .locals 2

    .line 22
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.orange.oab.contactless.packid.action.ENCRYPTOR_INITIALIZED"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Le/h/d/a/a/r/a;->a(Landroid/content/Intent;)V

    return-void
.end method

.method public a(I)V
    .locals 2

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0}, Le/h/d/a/a/r/a;->b(ILjava/lang/Throwable;)Landroid/content/Intent;

    move-result-object p1

    .line 2
    sget-object v0, Lcom/orange/oab/contactless/packid/intent/Intent$UserLoadingErrorReason;->SERVER_UNREACHABLE:Lcom/orange/oab/contactless/packid/intent/Intent$UserLoadingErrorReason;

    const-string v1, "reason"

    invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 3
    invoke-virtual {p0, p1}, Le/h/d/a/a/r/a;->a(Landroid/content/Intent;)V

    return-void
.end method

.method public a(ILjava/lang/Exception;)V
    .locals 1

    .line 4
    invoke-virtual {p0, p1, p2}, Le/h/d/a/a/r/a;->b(ILjava/lang/Throwable;)Landroid/content/Intent;

    move-result-object p1

    .line 5
    sget-object p2, Lcom/orange/oab/contactless/packid/intent/Intent$UserLoadingErrorReason;->ENCRYPTION_ERROR:Lcom/orange/oab/contactless/packid/intent/Intent$UserLoadingErrorReason;

    const-string v0, "reason"

    invoke-virtual {p1, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 6
    invoke-virtual {p0, p1}, Le/h/d/a/a/r/a;->a(Landroid/content/Intent;)V

    return-void
.end method

.method public a(ILjava/lang/String;Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;)V
    .locals 2

    .line 23
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.orange.oab.contactless.packid.action.RSSI"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "rssi"

    .line 24
    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string p1, "readerName"

    .line 25
    invoke-virtual {v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 26
    invoke-virtual {p3}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;

    move-result-object p1

    const-string p2, "zoneId"

    invoke-virtual {v0, p2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 27
    invoke-virtual {p4}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;

    move-result-object p1

    const-string p2, "contactlessId"

    invoke-virtual {v0, p2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p1, "readerAddress"

    .line 28
    invoke-virtual {v0, p1, p5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 29
    invoke-virtual {p0, v0}, Le/h/d/a/a/r/a;->a(Landroid/content/Intent;)V

    return-void
.end method

.method public a(ILjava/lang/Throwable;)V
    .locals 1

    .line 7
    iget-object v0, p0, Le/h/d/a/a/r/a;->a:Landroid/content/Context;

    invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p2, p1}, Le/h/d/a/a/r/a;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    return-void
.end method

.method public a(Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;Ljava/lang/String;Lcom/orange/oab/contactless/packid/rssi/RssiLevel;)V
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    .line 62
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.orange.oab.contactless.packid.intent.Intent.ACTION_RSSI_LEVEL_CHANGED"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 63
    invoke-virtual {p4}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const-string v2, "rssiLevel"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 64
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "readerName"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "zoneId"

    .line 65
    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "contactlessId"

    .line 66
    invoke-virtual {v0, v1, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 67
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v1

    const-string v2, "readerAddress"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 68
    invoke-virtual {p0, v0}, Le/h/d/a/a/r/a;->a(Landroid/content/Intent;)V

    .line 69
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Broadcast new level  for "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " zone "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " user "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " level "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "packid.AppBroadcaster"

    invoke-static {p2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public final a(Landroid/content/Intent;)V
    .locals 5

    const-string v0, "exception"

    .line 58
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 59
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Broadcasting action "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "reason"

    invoke-virtual {p1, v2}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, " with reason "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    const-string v2, ""

    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    if-eqz v0, :cond_1

    .line 60
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ": "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "packid.AppBroadcaster"

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 61
    :cond_1
    iget-object v0, p0, Le/h/d/a/a/r/a;->a:Landroid/content/Context;

    invoke-static {v0}, Lc/p/a/d;->a(Landroid/content/Context;)Lc/p/a/d;

    move-result-object v0

    invoke-virtual {v0, p1}, Lc/p/a/d;->a(Landroid/content/Intent;)Z

    return-void
.end method

.method public a(Lcom/orange/oab/contactless/packid/hce/user/User;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;)V
    .locals 6

    .line 30
    invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getDescription()Ljava/lang/String;

    move-result-object v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    .line 31
    invoke-virtual/range {v0 .. v5}, Le/h/d/a/a/r/a;->a(Lcom/orange/oab/contactless/packid/hce/user/User;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    sget-object p4, Le/h/d/a/a/v/b;->e:Le/h/d/a/a/v/b$a;

    iget-object v0, p0, Le/h/d/a/a/r/a;->a:Landroid/content/Context;

    invoke-virtual {p4, v0}, Le/h/d/a/a/v/g;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Le/h/d/a/a/v/b;

    invoke-virtual {p4, p1, p2, p3}, Le/h/d/a/a/v/b;->a(Lcom/orange/oab/contactless/packid/hce/user/User;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Landroid/bluetooth/BluetoothDevice;)Lcom/orange/oab/contactless/packid/rssi/RssiLevel;

    .line 33
    sget-object p3, Le/h/d/a/a/v/b;->e:Le/h/d/a/a/v/b$a;

    iget-object p4, p0, Le/h/d/a/a/r/a;->a:Landroid/content/Context;

    invoke-virtual {p3, p4}, Le/h/d/a/a/v/g;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Le/h/d/a/a/v/b;

    invoke-virtual {p3, p1, p2}, Le/h/d/a/a/v/b;->b(Lcom/orange/oab/contactless/packid/hce/user/User;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)Z

    return-void
.end method

.method public final a(Lcom/orange/oab/contactless/packid/hce/user/User;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    .line 34
    sget-object v6, Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;->DONE:Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v6}, Le/h/d/a/a/r/a;->a(Lcom/orange/oab/contactless/packid/hce/user/User;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;Ljava/lang/String;Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;)V

    return-void
.end method

.method public final a(Lcom/orange/oab/contactless/packid/hce/user/User;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;Ljava/lang/String;Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;)V
    .locals 6
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    .line 35
    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/User;->getContactlessId()Lfr/mbs/binary/Octets;

    move-result-object v1

    invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getZoneId()Lfr/mbs/binary/Octets;

    move-result-object v2

    move-object v0, p0

    move-object v3, p4

    move-object v4, p5

    move-object v5, p6

    invoke-virtual/range {v0 .. v5}, Le/h/d/a/a/r/a;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;Ljava/lang/String;Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;)Landroid/content/Intent;

    move-result-object p1

    .line 36
    invoke-virtual {p3}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;

    move-result-object p2

    const-string p3, "deviceName"

    invoke-virtual {p1, p3, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 37
    invoke-virtual {p0, p1}, Le/h/d/a/a/r/a;->a(Landroid/content/Intent;)V

    return-void
.end method

.method public a(Le/h/d/a/a/p/a/a/a;)V
    .locals 3

    .line 13
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.orange.oab.contactless.packid.action.USER_UPDATED"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    if-nez p1, :cond_0

    .line 14
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Le/h/d/a/a/p/a/a/a;->a()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p0, v1}, Le/h/d/a/a/r/a;->a(Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object v1

    :goto_0
    const-string v2, "addedBadges"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    if-nez p1, :cond_1

    .line 15
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Le/h/d/a/a/p/a/a/a;->b()Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Le/h/d/a/a/r/a;->a(Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object p1

    :goto_1
    const-string v1, "removedBadges"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 16
    invoke-virtual {p0, v0}, Le/h/d/a/a/r/a;->a(Landroid/content/Intent;)V

    return-void
.end method

.method public a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)V
    .locals 3

    .line 48
    sget-object v0, Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;->INSUFFICIENT_SECURITY:Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;

    iget-object v1, p0, Le/h/d/a/a/r/a;->a:Landroid/content/Context;

    sget v2, Le/h/d/a/a/c;->transaction_unlock_phone_required:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, p1, p2, v0, v1}, Le/h/d/a/a/r/a;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p0, p1}, Le/h/d/a/a/r/a;->a(Landroid/content/Intent;)V

    return-void
.end method

.method public a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;I)V
    .locals 1

    .line 43
    sget-object v0, Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;->START:Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;

    invoke-virtual {p0, p1, p2, p3, v0}, Le/h/d/a/a/r/a;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;ILcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;)V

    return-void
.end method

.method public final a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;ILcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;)V
    .locals 1

    const/4 v0, 0x0

    .line 44
    invoke-virtual {p0, p1, p2, p4, v0}, Le/h/d/a/a/r/a;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p1

    const-string p2, "timeout"

    .line 45
    invoke-virtual {p1, p2, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 46
    invoke-virtual {p0, p1}, Le/h/d/a/a/r/a;->a(Landroid/content/Intent;)V

    return-void
.end method

.method public a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;)V
    .locals 1

    .line 47
    sget-object v0, Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;->ERROR:Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;

    invoke-virtual {p0, p1, p2, v0, p3}, Le/h/d/a/a/r/a;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p0, p1}, Le/h/d/a/a/r/a;->a(Landroid/content/Intent;)V

    return-void
.end method

.method public a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    .line 38
    sget-object v5, Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;->DONE:Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-virtual/range {v0 .. v5}, Le/h/d/a/a/r/a;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;Ljava/lang/String;Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;)Landroid/content/Intent;

    move-result-object p1

    .line 39
    invoke-virtual {p0, p1}, Le/h/d/a/a/r/a;->a(Landroid/content/Intent;)V

    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 76
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.orange.oab.contactless.packid.intent.Intent.ACTION_BADGE_LOCKED"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "zoneId"

    .line 77
    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p1, "contactlessId"

    .line 78
    invoke-virtual {v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 79
    invoke-virtual {p0, v0}, Le/h/d/a/a/r/a;->a(Landroid/content/Intent;)V

    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V
    .locals 2

    .line 70
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.orange.oab.contactless.packid.intent.Intent.ACTION_RSSI_BUTTON_IN_RANGE"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "zoneId"

    .line 71
    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "contactlessId"

    .line 72
    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "button_status"

    .line 73
    invoke-virtual {v0, v1, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 74
    invoke-virtual {p0, v0}, Le/h/d/a/a/r/a;->a(Landroid/content/Intent;)V

    .line 75
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Manual Button is in range  zone "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " user "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " In Range "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "packid.AppBroadcaster"

    invoke-static {p2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public final a(Ljava/lang/Throwable;Ljava/lang/String;)V
    .locals 0

    .line 8
    invoke-static {p2, p1}, Lcom/orange/oab/contactless/packid/report/ReportSender;->send(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 9
    invoke-virtual {p0, p2, p1}, Le/h/d/a/a/r/a;->a(Ljava/lang/String;Ljava/lang/Throwable;)Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p0, p1}, Le/h/d/a/a/r/a;->a(Landroid/content/Intent;)V

    return-void
.end method

.method public a(ZZLjava/lang/String;)V
    .locals 2

    .line 17
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.orange.oab.contactless.packid.action.UPDATE_USERS"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "alertOnNetworkError"

    .line 18
    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    const-string p1, "sendUsersUpdatedIntent"

    .line 19
    invoke-virtual {v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    const-string p1, "firebaseRegistrationId"

    .line 20
    invoke-virtual {v0, p1, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 21
    invoke-virtual {p0, v0}, Le/h/d/a/a/r/a;->a(Landroid/content/Intent;)V

    return-void
.end method

.method public final b(ILjava/lang/Throwable;)Landroid/content/Intent;
    .locals 1

    .line 3
    iget-object v0, p0, Le/h/d/a/a/r/a;->a:Landroid/content/Context;

    invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Le/h/d/a/a/r/a;->a(Ljava/lang/String;Ljava/lang/Throwable;)Landroid/content/Intent;

    move-result-object p1

    return-object p1
.end method

.method public b()V
    .locals 2

    .line 2
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.orange.oab.contactless.packid.action.ACTION_SCREEN_UNLOCKED_ERROR"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Le/h/d/a/a/r/a;->a(Landroid/content/Intent;)V

    return-void
.end method

.method public b(I)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0}, Le/h/d/a/a/r/a;->a(ILjava/lang/Throwable;)V

    return-void
.end method

.method public b(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)V
    .locals 3

    .line 4
    iget-object v0, p0, Le/h/d/a/a/r/a;->a:Landroid/content/Context;

    invoke-static {v0}, Le/h/a/a/a/a/a;->a(Landroid/content/Context;)Le/h/a/a/a/a/a;

    move-result-object v0

    .line 5
    sget-object v1, Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;->ERROR:Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;

    sget v2, Le/h/d/a/a/c;->notification_transaction_aborted:I

    invoke-virtual {v0, v2}, Le/h/a/a/a/a/a;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, p2, v1, v0}, Le/h/d/a/a/r/a;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p0, p1}, Le/h/d/a/a/r/a;->a(Landroid/content/Intent;)V

    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 6
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.orange.oab.contactless.packid.intent.Intent.ACTION_BADGE_UNLOCKED"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "zoneId"

    .line 7
    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p1, "contactlessId"

    .line 8
    invoke-virtual {v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 9
    invoke-virtual {p0, v0}, Le/h/d/a/a/r/a;->a(Landroid/content/Intent;)V

    return-void
.end method

.method public c()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0}, Le/h/d/a/a/r/a;->a(Le/h/d/a/a/p/a/a/a;)V

    return-void
.end method

.method public c(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)V
    .locals 3

    .line 2
    sget-object v0, Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;->INTERRUPTED:Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;

    iget-object v1, p0, Le/h/d/a/a/r/a;->a:Landroid/content/Context;

    sget v2, Le/h/d/a/a/c;->notification_transaction_interrupted:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, p1, p2, v0, v1}, Le/h/d/a/a/r/a;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Lcom/orange/oab/contactless/packid/ble/ContactlessTransaction$EventType;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p0, p1}, Le/h/d/a/a/r/a;->a(Landroid/content/Intent;)V

    return-void
.end method
