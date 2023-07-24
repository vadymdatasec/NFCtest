.class public Lcom/orange/oab/contactless/packid/service/PackIdService;
.super Landroid/app/Service;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "MissingPermission"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/orange/oab/contactless/packid/service/PackIdService$f;
    }
.end annotation


# instance fields
.field public final b:Ljava/text/SimpleDateFormat;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SimpleDateFormat"
        }
    .end annotation
.end field

.field public final c:Lcom/orange/oab/contactless/packid/service/PackIdService$f;

.field public final d:Landroid/content/BroadcastReceiver;

.field public final e:Landroid/content/BroadcastReceiver;

.field public final f:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lfr/mbs/binary/Octets;",
            "Ljava/util/Date;",
            ">;"
        }
    .end annotation
.end field

.field public final g:Le/h/d/a/a/w/u;

.field public final h:Le/h/d/a/a/g/y;

.field public i:Le/h/d/a/a/g/k;

.field public j:Le/h/d/a/a/n/w/c;

.field public k:Ljava/util/Timer;

.field public l:Landroid/content/BroadcastReceiver;

.field public m:Landroid/content/BroadcastReceiver;

.field public n:J

.field public o:Lcom/orange/oab/contactless/packid/service/ZoneDetectionNotification;

.field public p:Landroid/content/BroadcastReceiver;

.field public final q:Landroid/content/BroadcastReceiver;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 2
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "HH:mm:ss.SSS"

    invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/orange/oab/contactless/packid/service/PackIdService;->b:Ljava/text/SimpleDateFormat;

    .line 3
    new-instance v0, Lcom/orange/oab/contactless/packid/service/PackIdService$f;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/orange/oab/contactless/packid/service/PackIdService$f;-><init>(Lcom/orange/oab/contactless/packid/service/PackIdService;Lcom/orange/oab/contactless/packid/service/PackIdService$a;)V

    iput-object v0, p0, Lcom/orange/oab/contactless/packid/service/PackIdService;->c:Lcom/orange/oab/contactless/packid/service/PackIdService$f;

    .line 4
    new-instance v0, Le/h/d/a/a/g/h;

    invoke-direct {v0}, Le/h/d/a/a/g/h;-><init>()V

    iput-object v0, p0, Lcom/orange/oab/contactless/packid/service/PackIdService;->d:Landroid/content/BroadcastReceiver;

    .line 5
    new-instance v0, Le/h/d/a/a/g/q;

    invoke-direct {v0}, Le/h/d/a/a/g/q;-><init>()V

    iput-object v0, p0, Lcom/orange/oab/contactless/packid/service/PackIdService;->e:Landroid/content/BroadcastReceiver;

    .line 6
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/orange/oab/contactless/packid/service/PackIdService;->f:Ljava/util/Map;

    .line 7
    new-instance v0, Le/h/d/a/a/w/u;

    invoke-direct {v0, p0}, Le/h/d/a/a/w/u;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/orange/oab/contactless/packid/service/PackIdService;->g:Le/h/d/a/a/w/u;

    .line 8
    new-instance v0, Le/h/d/a/a/g/y;

    invoke-direct {v0}, Le/h/d/a/a/g/y;-><init>()V

    iput-object v0, p0, Lcom/orange/oab/contactless/packid/service/PackIdService;->h:Le/h/d/a/a/g/y;

    .line 9
    iput-object v1, p0, Lcom/orange/oab/contactless/packid/service/PackIdService;->k:Ljava/util/Timer;

    .line 10
    invoke-static {}, Le/h/d/a/a/g/r;->a()Le/h/d/a/a/g/r;

    .line 11
    new-instance v0, Lcom/orange/oab/contactless/packid/service/PackIdService$a;

    invoke-direct {v0, p0}, Lcom/orange/oab/contactless/packid/service/PackIdService$a;-><init>(Lcom/orange/oab/contactless/packid/service/PackIdService;)V

    iput-object v0, p0, Lcom/orange/oab/contactless/packid/service/PackIdService;->l:Landroid/content/BroadcastReceiver;

    .line 12
    new-instance v0, Lcom/orange/oab/contactless/packid/service/PackIdService$b;

    invoke-direct {v0, p0}, Lcom/orange/oab/contactless/packid/service/PackIdService$b;-><init>(Lcom/orange/oab/contactless/packid/service/PackIdService;)V

    iput-object v0, p0, Lcom/orange/oab/contactless/packid/service/PackIdService;->m:Landroid/content/BroadcastReceiver;

    .line 13
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/orange/oab/contactless/packid/service/PackIdService;->n:J

    .line 14
    new-instance v0, Lcom/orange/oab/contactless/packid/service/ZoneDetectionNotification;

    invoke-direct {v0, p0}, Lcom/orange/oab/contactless/packid/service/ZoneDetectionNotification;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/orange/oab/contactless/packid/service/PackIdService;->o:Lcom/orange/oab/contactless/packid/service/ZoneDetectionNotification;

    .line 15
    new-instance v0, Lcom/orange/oab/contactless/packid/service/PackIdService$c;

    invoke-direct {v0, p0}, Lcom/orange/oab/contactless/packid/service/PackIdService$c;-><init>(Lcom/orange/oab/contactless/packid/service/PackIdService;)V

    iput-object v0, p0, Lcom/orange/oab/contactless/packid/service/PackIdService;->p:Landroid/content/BroadcastReceiver;

    .line 16
    new-instance v0, Lcom/orange/oab/contactless/packid/service/PackIdService$d;

    invoke-direct {v0, p0}, Lcom/orange/oab/contactless/packid/service/PackIdService$d;-><init>(Lcom/orange/oab/contactless/packid/service/PackIdService;)V

    iput-object v0, p0, Lcom/orange/oab/contactless/packid/service/PackIdService;->q:Landroid/content/BroadcastReceiver;

    return-void
.end method

.method public static synthetic a(Lcom/orange/oab/contactless/packid/service/PackIdService;)Le/h/d/a/a/w/u;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/orange/oab/contactless/packid/service/PackIdService;->g:Le/h/d/a/a/w/u;

    return-object p0
.end method

.method public static synthetic b(Lcom/orange/oab/contactless/packid/service/PackIdService;)Lcom/orange/oab/contactless/packid/service/ZoneDetectionNotification;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/orange/oab/contactless/packid/service/PackIdService;->o:Lcom/orange/oab/contactless/packid/service/ZoneDetectionNotification;

    return-object p0
.end method

.method public static synthetic c(Lcom/orange/oab/contactless/packid/service/PackIdService;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/orange/oab/contactless/packid/service/PackIdService;->b()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/orange/oab/contactless/packid/hce/user/User;Lfr/mbs/binary/Octets;)Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;
    .locals 4

    const-string v0, "packid.Service"

    const/4 v1, 0x0

    .line 4
    :try_start_0
    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/User;->getWallet()Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;->findBadgeByZone(Lfr/mbs/binary/Octets;)Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->isBle()Z

    move-result v2

    if-nez v2, :cond_0

    .line 6
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Found device for badge "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getDescription()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " but badge is not compatible with BLE"

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Lcom/orange/oab/contactless/packid/hce/user/wallet/UnknownZoneIdException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :cond_0
    return-object p1

    .line 7
    :catch_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown zone id "

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-object v1
.end method

.method public final a(Z)Le/h/d/a/a/n/w/c;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/g/u/e;
        }
    .end annotation

    .line 36
    iget-object v0, p0, Lcom/orange/oab/contactless/packid/service/PackIdService;->j:Le/h/d/a/a/n/w/c;

    if-nez v0, :cond_0

    .line 37
    invoke-virtual {p0, p1}, Lcom/orange/oab/contactless/packid/service/PackIdService;->b(Z)V

    .line 38
    :cond_0
    iget-object p1, p0, Lcom/orange/oab/contactless/packid/service/PackIdService;->j:Le/h/d/a/a/n/w/c;

    return-object p1
.end method

.method public final a()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/ble/d;
        }
    .end annotation

    .line 2
    invoke-virtual {p0}, Landroid/app/Service;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const-string v1, "android.hardware.bluetooth_le"

    invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 3
    :cond_0
    new-instance v0, Lcom/orange/oab/contactless/packid/ble/d;

    const-string v1, "BLE not supported"

    invoke-direct {v0, v1}, Lcom/orange/oab/contactless/packid/ble/d;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final a(Landroid/bluetooth/BluetoothDevice;Lcom/orange/oab/contactless/packid/hce/user/User;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)V
    .locals 3

    .line 14
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Found device in RSSI range for badge "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getDescription()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "packid.Service"

    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 15
    invoke-virtual {p0}, Landroid/app/Service;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p3, v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->isConditionToBeginTransactionReached(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 16
    :try_start_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/orange/oab/contactless/packid/service/PackIdService;->b(Landroid/bluetooth/BluetoothDevice;Lcom/orange/oab/contactless/packid/hce/user/User;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)V
    :try_end_0
    .catch Lcom/orange/oab/contactless/packid/g/u/e; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 17
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Encryptor not available: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 18
    new-instance p1, Le/h/d/a/a/r/a;

    invoke-direct {p1, p0}, Le/h/d/a/a/r/a;-><init>(Landroid/content/Context;)V

    invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/User;->getContactlessId()Lfr/mbs/binary/Octets;

    move-result-object p2

    invoke-virtual {p3}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getZoneId()Lfr/mbs/binary/Octets;

    move-result-object p3

    sget v0, Le/h/d/a/a/c;->no_encryptor:I

    invoke-virtual {p0, v0}, Landroid/app/Service;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, p2, p3, v0}, Le/h/d/a/a/r/a;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;)V

    goto :goto_0

    .line 19
    :cond_0
    invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/User;->getContactlessId()Lfr/mbs/binary/Octets;

    move-result-object p1

    invoke-virtual {p0, p3, p1}, Lcom/orange/oab/contactless/packid/service/PackIdService;->a(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Lfr/mbs/binary/Octets;)V

    :goto_0
    return-void
.end method

.method public final a(Landroid/bluetooth/BluetoothDevice;Lcom/orange/oab/contactless/packid/hce/user/User;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;I)V
    .locals 6

    .line 20
    new-instance v0, Le/h/d/a/a/r/a;

    invoke-direct {v0, p0}, Le/h/d/a/a/r/a;-><init>(Landroid/content/Context;)V

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p3}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getZoneId()Lfr/mbs/binary/Octets;

    move-result-object v3

    invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/User;->getContactlessId()Lfr/mbs/binary/Octets;

    move-result-object v4

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v5

    move v1, p4

    invoke-virtual/range {v0 .. v5}, Le/h/d/a/a/r/a;->a(ILjava/lang/String;Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;)V

    return-void
.end method

.method public final a(Landroid/bluetooth/BluetoothDevice;Lcom/orange/oab/contactless/packid/hce/user/User;Lfr/mbs/binary/Octets;I)V
    .locals 0

    .line 12
    invoke-virtual {p0, p2, p3}, Lcom/orange/oab/contactless/packid/service/PackIdService;->a(Lcom/orange/oab/contactless/packid/hce/user/User;Lfr/mbs/binary/Octets;)Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    move-result-object p3

    if-eqz p3, :cond_0

    .line 13
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/orange/oab/contactless/packid/service/PackIdService;->b(Landroid/bluetooth/BluetoothDevice;Lcom/orange/oab/contactless/packid/hce/user/User;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;I)V

    :cond_0
    return-void
.end method

.method public a(Landroid/bluetooth/BluetoothDevice;Le/h/d/a/a/g/d;I)V
    .locals 2

    const/16 v0, 0x543

    .line 8
    invoke-virtual {p2, v0}, Le/h/d/a/a/g/d;->a(I)Lfr/mbs/binary/Octets;

    move-result-object v1

    .line 9
    invoke-virtual {p2, v0}, Le/h/d/a/a/g/d;->c(I)Lfr/mbs/binary/Octets;

    move-result-object p2

    .line 10
    iget-object v0, p0, Lcom/orange/oab/contactless/packid/service/PackIdService;->g:Le/h/d/a/a/w/u;

    invoke-virtual {v0, v1, p2}, Le/h/d/a/a/w/u;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)Lcom/orange/oab/contactless/packid/hce/user/User;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 11
    invoke-virtual {p0, p1, v0, p2, p3}, Lcom/orange/oab/contactless/packid/service/PackIdService;->a(Landroid/bluetooth/BluetoothDevice;Lcom/orange/oab/contactless/packid/hce/user/User;Lfr/mbs/binary/Octets;I)V

    :cond_0
    return-void
.end method

.method public a(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)V
    .locals 3

    .line 33
    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getDelayAfterBadgeOkMs()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Le/h/d/a/a/n/t;->c(I)Ljava/util/Date;

    move-result-object v0

    .line 34
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Session blocked until: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/orange/oab/contactless/packid/service/PackIdService;->b:Ljava/text/SimpleDateFormat;

    invoke-virtual {v2, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "packid.Service"

    invoke-static {v2, v1}, Lcom/orange/oab/contactless/packid/debug/DebugConsole;->log(Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    iget-object v1, p0, Lcom/orange/oab/contactless/packid/service/PackIdService;->f:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getZoneId()Lfr/mbs/binary/Octets;

    move-result-object p1

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final a(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Lfr/mbs/binary/Octets;)V
    .locals 6

    .line 25
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    .line 26
    iget-wide v2, p0, Lcom/orange/oab/contactless/packid/service/PackIdService;->n:J

    const-wide/16 v4, 0xfa0

    add-long/2addr v2, v4

    cmp-long v4, v2, v0

    if-gez v4, :cond_0

    .line 27
    iput-wide v0, p0, Lcom/orange/oab/contactless/packid/service/PackIdService;->n:J

    .line 28
    new-instance v0, Le/h/d/a/a/r/a;

    invoke-virtual {p0}, Landroid/app/Service;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Le/h/d/a/a/r/a;-><init>(Landroid/content/Context;)V

    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getZoneId()Lfr/mbs/binary/Octets;

    move-result-object p1

    invoke-virtual {v0, p2, p1}, Le/h/d/a/a/r/a;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)V

    :cond_0
    return-void
.end method

.method public final a(Lfr/mbs/binary/Octets;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)V
    .locals 1

    .line 21
    invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->isManualConnectionAllowed()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 22
    iget-object v0, p0, Lcom/orange/oab/contactless/packid/service/PackIdService;->o:Lcom/orange/oab/contactless/packid/service/ZoneDetectionNotification;

    invoke-virtual {v0, p1, p2}, Lcom/orange/oab/contactless/packid/service/ZoneDetectionNotification;->a(Lfr/mbs/binary/Octets;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)V

    .line 23
    iget-object p1, p0, Lcom/orange/oab/contactless/packid/service/PackIdService;->o:Lcom/orange/oab/contactless/packid/service/ZoneDetectionNotification;

    invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/service/ZoneDetectionNotification;->b()V

    .line 24
    invoke-virtual {p0}, Lcom/orange/oab/contactless/packid/service/PackIdService;->c()V

    :cond_0
    return-void
.end method

.method public final a(Lfr/mbs/binary/Octets;)Z
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/orange/oab/contactless/packid/service/PackIdService;->f:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Date;

    .line 30
    iget-object v0, p0, Lcom/orange/oab/contactless/packid/service/PackIdService;->i:Le/h/d/a/a/g/k;

    if-eqz v0, :cond_2

    if-eqz p1, :cond_0

    .line 31
    invoke-static {}, Le/h/d/a/a/n/t;->b()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/Date;->before(Ljava/util/Date;)Z

    move-result v0

    if-nez v0, :cond_2

    :cond_0
    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/orange/oab/contactless/packid/service/PackIdService;->i:Le/h/d/a/a/g/k;

    .line 32
    invoke-virtual {p1}, Le/h/d/a/a/g/k;->a()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public final b()V
    .locals 1

    const/4 v0, 0x0

    .line 21
    iput-object v0, p0, Lcom/orange/oab/contactless/packid/service/PackIdService;->j:Le/h/d/a/a/n/w/c;

    return-void
.end method

.method public final declared-synchronized b(Landroid/bluetooth/BluetoothDevice;Lcom/orange/oab/contactless/packid/hce/user/User;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/g/u/e;
        }
    .end annotation

    monitor-enter p0

    .line 10
    :try_start_0
    invoke-virtual {p3}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getZoneId()Lfr/mbs/binary/Octets;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/orange/oab/contactless/packid/service/PackIdService;->a(Lfr/mbs/binary/Octets;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "Found compatible reader"

    .line 11
    invoke-static {p0, v0}, Lcom/orange/oab/contactless/packid/service/LogManager;->start(Landroid/content/Context;Ljava/lang/String;)V

    .line 12
    invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/User;->isDefault()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Lcom/orange/oab/contactless/packid/service/PackIdService;->a(Z)Le/h/d/a/a/n/w/c;

    move-result-object v0

    invoke-static {v0, p2, p3, p0}, Le/h/d/a/a/g/v;->a(Le/h/d/a/a/n/w/c;Lcom/orange/oab/contactless/packid/hce/user/User;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Landroid/content/Context;)Le/h/d/a/a/g/v;

    move-result-object v0

    .line 13
    new-instance v1, Le/h/d/a/a/g/k;

    invoke-direct {v1, p0, v0}, Le/h/d/a/a/g/k;-><init>(Lcom/orange/oab/contactless/packid/service/PackIdService;Le/h/d/a/a/g/v;)V

    iput-object v1, p0, Lcom/orange/oab/contactless/packid/service/PackIdService;->i:Le/h/d/a/a/g/k;

    .line 14
    new-instance v1, Le/h/d/a/a/r/a;

    invoke-direct {v1, p0}, Le/h/d/a/a/r/a;-><init>(Landroid/content/Context;)V

    invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/User;->getContactlessId()Lfr/mbs/binary/Octets;

    move-result-object p2

    invoke-virtual {p3}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getZoneId()Lfr/mbs/binary/Octets;

    move-result-object v2

    invoke-virtual {v0}, Le/h/d/a/a/g/v;->b()I

    move-result v0

    add-int/lit16 v0, v0, 0x3e8

    invoke-virtual {v1, p2, v2, v0}, Le/h/d/a/a/r/a;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;I)V

    .line 15
    iget-object p2, p0, Lcom/orange/oab/contactless/packid/service/PackIdService;->i:Le/h/d/a/a/g/k;

    invoke-virtual {p2, p1}, Le/h/d/a/a/g/k;->a(Landroid/bluetooth/BluetoothDevice;)V

    .line 16
    iget-object p1, p0, Lcom/orange/oab/contactless/packid/service/PackIdService;->f:Ljava/util/Map;

    invoke-virtual {p3}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getZoneId()Lfr/mbs/binary/Octets;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    const-string p1, "packid.Service"

    const-string p2, "Ignoring new BLE session, old session still in progress..."

    .line 17
    invoke-static {p1, p2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
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

.method public final b(Landroid/bluetooth/BluetoothDevice;Lcom/orange/oab/contactless/packid/hce/user/User;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;I)V
    .locals 3

    .line 2
    invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/User;->getContactlessId()Lfr/mbs/binary/Octets;

    move-result-object v0

    invoke-virtual {p0, v0, p3}, Lcom/orange/oab/contactless/packid/service/PackIdService;->a(Lfr/mbs/binary/Octets;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)V

    .line 3
    invoke-virtual {p3}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getZoneId()Lfr/mbs/binary/Octets;

    move-result-object v0

    invoke-static {p1, v0, p4}, Le/h/d/a/a/g/r;->a(Landroid/bluetooth/BluetoothDevice;Lfr/mbs/binary/Octets;I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    sget-object v0, Le/h/d/a/a/v/b;->e:Le/h/d/a/a/v/b$a;

    invoke-virtual {p0}, Landroid/app/Service;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Le/h/d/a/a/v/g;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/h/d/a/a/v/b;

    invoke-virtual {v0, p4, p3, p2, p1}, Le/h/d/a/a/v/b;->a(ILcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Lcom/orange/oab/contactless/packid/hce/user/User;Landroid/bluetooth/BluetoothDevice;)V

    .line 5
    sget-object v0, Lcom/orange/business/packid/android/lib/PackIdPreferences;->INSTANCE:Lcom/orange/business/packid/android/lib/PackIdPreferences;

    invoke-virtual {v0}, Lcom/orange/business/packid/android/lib/PackIdPreferences;->isRssiBroadcastEnabled()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 6
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/orange/oab/contactless/packid/service/PackIdService;->a(Landroid/bluetooth/BluetoothDevice;Lcom/orange/oab/contactless/packid/hce/user/User;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;I)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    .line 7
    invoke-virtual {p3}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getZoneId()Lfr/mbs/binary/Octets;

    move-result-object v1

    invoke-virtual {v1}, Lfr/mbs/binary/Octets;->getSerializedFormat()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "BLE Signal Indicator : Advertising ignored for zoneId %s"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "packid.Service"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 8
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/orange/oab/contactless/packid/service/PackIdService;->h:Le/h/d/a/a/g/y;

    invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/User;->getContactlessId()Lfr/mbs/binary/Octets;

    move-result-object v1

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, p4, p3, v1, v2}, Le/h/d/a/a/g/y;->a(ILcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Lfr/mbs/binary/Octets;Ljava/lang/String;)Z

    move-result p4

    if-eqz p4, :cond_2

    .line 9
    invoke-virtual {p0, p1, p2, p3}, Lcom/orange/oab/contactless/packid/service/PackIdService;->a(Landroid/bluetooth/BluetoothDevice;Lcom/orange/oab/contactless/packid/hce/user/User;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)V

    :cond_2
    return-void
.end method

.method public final declared-synchronized b(Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/g/u/e;
        }
    .end annotation

    monitor-enter p0

    .line 18
    :try_start_0
    iget-object v0, p0, Lcom/orange/oab/contactless/packid/service/PackIdService;->j:Le/h/d/a/a/n/w/c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    const-string v0, "packid.Service"

    const-string v1, "Initializing BLE service encryptor"

    .line 19
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 20
    invoke-static {p0, p1}, Le/h/d/a/a/n/w/c;->a(Landroid/content/Context;Z)Le/h/d/a/a/n/w/c;

    move-result-object p1

    iput-object p1, p0, Lcom/orange/oab/contactless/packid/service/PackIdService;->j:Le/h/d/a/a/n/w/c;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final c()V
    .locals 4

    .line 2
    iget-object v0, p0, Lcom/orange/oab/contactless/packid/service/PackIdService;->k:Ljava/util/Timer;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    .line 4
    :cond_0
    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    .line 5
    new-instance v1, Lcom/orange/oab/contactless/packid/service/PackIdService$e;

    invoke-direct {v1, p0}, Lcom/orange/oab/contactless/packid/service/PackIdService$e;-><init>(Lcom/orange/oab/contactless/packid/service/PackIdService;)V

    const-wide/16 v2, 0x1f40

    invoke-virtual {v0, v1, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    .line 6
    iput-object v0, p0, Lcom/orange/oab/contactless/packid/service/PackIdService;->k:Ljava/util/Timer;

    return-void
.end method

.method public final d()V
    .locals 2

    .line 1
    sget-object v0, Le/h/d/a/a/r/b;->f:Le/h/d/a/a/r/b;

    invoke-virtual {v0, p0}, Le/h/d/a/a/r/b;->b(Landroid/content/Context;)V

    .line 2
    sget-object v0, Le/h/d/a/a/r/b;->f:Le/h/d/a/a/r/b;

    invoke-virtual {v0}, Le/h/d/a/a/r/b;->a()I

    move-result v0

    sget-object v1, Le/h/d/a/a/r/b;->f:Le/h/d/a/a/r/b;

    invoke-virtual {v1, p0}, Le/h/d/a/a/r/b;->a(Landroid/content/Context;)Landroid/app/Notification;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Landroid/app/Service;->startForeground(ILandroid/app/Notification;)V

    return-void
.end method

.method public final e()V
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lcom/orange/oab/contactless/packid/service/PackIdService;->a()V

    .line 2
    sget-object v0, Le/h/d/a/a/g/f;->d:Le/h/d/a/a/g/f;

    invoke-virtual {v0, p0}, Le/h/d/a/a/g/f;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    sget-object v0, Le/h/d/a/a/g/f;->d:Le/h/d/a/a/g/f;

    invoke-virtual {v0, p0}, Le/h/d/a/a/g/f;->b(Landroid/content/Context;)V
    :try_end_0
    .catch Lcom/orange/oab/contactless/packid/ble/d; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 4
    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    const-string v1, "packid.Service"

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    :goto_0
    return-void
.end method

.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public onCreate()V
    .locals 4

    .line 1
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    .line 2
    sget-object v0, Le/h/d/a/a/g/f;->d:Le/h/d/a/a/g/f;

    new-instance v1, Le/h/d/a/a/g/e;

    invoke-direct {v1, p0}, Le/h/d/a/a/g/e;-><init>(Lcom/orange/oab/contactless/packid/service/PackIdService;)V

    invoke-virtual {v0, v1}, Le/h/d/a/a/g/f;->a(Le/h/d/a/a/g/e;)V

    .line 3
    iget-object v0, p0, Lcom/orange/oab/contactless/packid/service/PackIdService;->d:Landroid/content/BroadcastReceiver;

    new-instance v1, Landroid/content/IntentFilter;

    const-string v2, "android.bluetooth.adapter.action.STATE_CHANGED"

    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1}, Landroid/app/Service;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 4
    iget-object v0, p0, Lcom/orange/oab/contactless/packid/service/PackIdService;->e:Landroid/content/BroadcastReceiver;

    new-instance v1, Landroid/content/IntentFilter;

    const-string v3, "android.nfc.action.ADAPTER_STATE_CHANGED"

    invoke-direct {v1, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1}, Landroid/app/Service;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 5
    iget-object v0, p0, Lcom/orange/oab/contactless/packid/service/PackIdService;->q:Landroid/content/BroadcastReceiver;

    new-instance v1, Landroid/content/IntentFilter;

    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1}, Landroid/app/Service;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 6
    invoke-static {p0}, Lc/p/a/d;->a(Landroid/content/Context;)Lc/p/a/d;

    move-result-object v0

    iget-object v1, p0, Lcom/orange/oab/contactless/packid/service/PackIdService;->l:Landroid/content/BroadcastReceiver;

    new-instance v2, Landroid/content/IntentFilter;

    const-string v3, "com.orange.oab.contactless.packid.action.USER_UPDATED"

    invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Lc/p/a/d;->a(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 7
    invoke-static {p0}, Lc/p/a/d;->a(Landroid/content/Context;)Lc/p/a/d;

    move-result-object v0

    iget-object v1, p0, Lcom/orange/oab/contactless/packid/service/PackIdService;->c:Lcom/orange/oab/contactless/packid/service/PackIdService$f;

    new-instance v2, Landroid/content/IntentFilter;

    const-string v3, "com.orange.oab.contactless.packid.action.ENCRYPTOR_INITIALIZED"

    invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Lc/p/a/d;->a(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 8
    iget-object v0, p0, Lcom/orange/oab/contactless/packid/service/PackIdService;->m:Landroid/content/BroadcastReceiver;

    new-instance v1, Landroid/content/IntentFilter;

    const-string v2, "com.orange.oab.contactless.packid.action.START_BADGE_TRANSACTION"

    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1}, Landroid/app/Service;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 9
    iget-object v0, p0, Lcom/orange/oab/contactless/packid/service/PackIdService;->p:Landroid/content/BroadcastReceiver;

    new-instance v1, Landroid/content/IntentFilter;

    const-string v2, "com.orange.oab.contactless.packid.action.DISMISSED_NOTIFICATION"

    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1}, Landroid/app/Service;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 10
    invoke-virtual {p0}, Lcom/orange/oab/contactless/packid/service/PackIdService;->d()V

    return-void
.end method

.method public onDestroy()V
    .locals 2

    const-string v0, "packid.Service"

    const-string v1, "onDestroy"

    .line 1
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-object v0, p0, Lcom/orange/oab/contactless/packid/service/PackIdService;->d:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Landroid/app/Service;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 3
    iget-object v0, p0, Lcom/orange/oab/contactless/packid/service/PackIdService;->e:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Landroid/app/Service;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 4
    iget-object v0, p0, Lcom/orange/oab/contactless/packid/service/PackIdService;->q:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Landroid/app/Service;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 5
    sget-object v0, Le/h/d/a/a/g/f;->d:Le/h/d/a/a/g/f;

    invoke-virtual {v0, p0}, Le/h/d/a/a/g/f;->c(Landroid/content/Context;)V

    .line 6
    sget-object v0, Le/h/d/a/a/g/f;->d:Le/h/d/a/a/g/f;

    invoke-virtual {v0}, Le/h/d/a/a/g/f;->a()V

    .line 7
    invoke-static {p0}, Lc/p/a/d;->a(Landroid/content/Context;)Lc/p/a/d;

    move-result-object v0

    iget-object v1, p0, Lcom/orange/oab/contactless/packid/service/PackIdService;->c:Lcom/orange/oab/contactless/packid/service/PackIdService$f;

    invoke-virtual {v0, v1}, Lc/p/a/d;->a(Landroid/content/BroadcastReceiver;)V

    .line 8
    invoke-static {p0}, Lc/p/a/d;->a(Landroid/content/Context;)Lc/p/a/d;

    move-result-object v0

    iget-object v1, p0, Lcom/orange/oab/contactless/packid/service/PackIdService;->l:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Lc/p/a/d;->a(Landroid/content/BroadcastReceiver;)V

    .line 9
    iget-object v0, p0, Lcom/orange/oab/contactless/packid/service/PackIdService;->m:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Landroid/app/Service;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 10
    iget-object v0, p0, Lcom/orange/oab/contactless/packid/service/PackIdService;->p:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Landroid/app/Service;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 11
    sget-object v0, Le/h/d/a/a/r/b;->g:Le/h/d/a/a/r/b;

    invoke-virtual {v0, p0}, Le/h/d/a/a/r/b;->c(Landroid/content/Context;)V

    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 1

    const-string p2, "packid.Service"

    const-string p3, "Restart PackIdBleService if needed"

    .line 1
    invoke-static {p2, p3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-virtual {p0}, Lcom/orange/oab/contactless/packid/service/PackIdService;->e()V

    if-eqz p1, :cond_0

    const-string p2, "contactlessId"

    .line 3
    invoke-virtual {p1, p2}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result p3

    if-eqz p3, :cond_0

    const-string p3, "zoneId"

    invoke-virtual {p1, p3}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {p1, p2}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object p2

    check-cast p2, Lfr/mbs/binary/Octets;

    .line 5
    invoke-virtual {p1, p3}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object p1

    check-cast p1, Lfr/mbs/binary/Octets;

    .line 6
    iget-object p3, p0, Lcom/orange/oab/contactless/packid/service/PackIdService;->h:Le/h/d/a/a/g/y;

    invoke-virtual {p3, p2, p1}, Le/h/d/a/a/g/y;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)V

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method public onTaskRemoved(Landroid/content/Intent;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/app/Service;->onTaskRemoved(Landroid/content/Intent;)V

    const-string p1, "packid.Service"

    const-string v0, "onTaskRemoved"

    .line 2
    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method
