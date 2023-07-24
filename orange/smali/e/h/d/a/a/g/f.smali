.class public Le/h/d/a/a/g/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final d:Le/h/d/a/a/g/f;


# instance fields
.field public a:Le/h/d/a/a/g/e;

.field public b:Ljava/util/concurrent/ScheduledExecutorService;

.field public final c:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Le/h/d/a/a/g/f;

    invoke-direct {v0}, Le/h/d/a/a/g/f;-><init>()V

    sput-object v0, Le/h/d/a/a/g/f;->d:Le/h/d/a/a/g/f;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Le/h/d/a/a/g/f;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method

.method public static synthetic a(Le/h/d/a/a/g/f;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1}, Le/h/d/a/a/g/f;->p(Landroid/content/Context;)V

    return-void
.end method

.method private synthetic p(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Le/h/d/a/a/g/f;->j(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public final a(I)Ljava/lang/String;
    .locals 1

    if-eqz p1, :cond_2

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    const-string p1, "Unknown"

    return-object p1

    :cond_0
    const-string p1, "High"

    return-object p1

    :cond_1
    const-string p1, "Midle"

    return-object p1

    :cond_2
    const-string p1, "Low"

    return-object p1
.end method

.method public a()V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Le/h/d/a/a/g/f;->a(Le/h/d/a/a/g/e;)V

    return-void
.end method

.method public final a(Landroid/content/Context;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/ble/d;
        }
    .end annotation

    if-eqz p2, :cond_0

    .line 3
    invoke-virtual {p0, p1}, Le/h/d/a/a/g/f;->k(Landroid/content/Context;)Ljava/util/ArrayList;

    move-result-object p2

    .line 4
    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 5
    invoke-virtual {p0, p1}, Le/h/d/a/a/g/f;->h(Landroid/content/Context;)Landroid/bluetooth/le/BluetoothLeScanner;

    move-result-object p1

    invoke-virtual {p0}, Le/h/d/a/a/g/f;->c()Landroid/bluetooth/le/ScanSettings;

    move-result-object v0

    iget-object v1, p0, Le/h/d/a/a/g/f;->a:Le/h/d/a/a/g/e;

    invoke-virtual {p1, p2, v0, v1}, Landroid/bluetooth/le/BluetoothLeScanner;->startScan(Ljava/util/List;Landroid/bluetooth/le/ScanSettings;Landroid/bluetooth/le/ScanCallback;)V

    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {p0, p1}, Le/h/d/a/a/g/f;->h(Landroid/content/Context;)Landroid/bluetooth/le/BluetoothLeScanner;

    move-result-object p1

    iget-object p2, p0, Le/h/d/a/a/g/f;->a:Le/h/d/a/a/g/e;

    invoke-virtual {p1, p2}, Landroid/bluetooth/le/BluetoothLeScanner;->stopScan(Landroid/bluetooth/le/ScanCallback;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public a(Le/h/d/a/a/g/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le/h/d/a/a/g/f;->a:Le/h/d/a/a/g/e;

    return-void
.end method

.method public a(Landroid/content/Context;)Z
    .locals 0
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    .line 7
    invoke-static {p1}, Lcom/orange/business/packid/android/lib/PackIdUtility;->isBluetoothEnabled(Landroid/content/Context;)Z

    move-result p1

    return p1
.end method

.method public final b()Ljava/lang/String;
    .locals 2

    .line 5
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_0

    const-string v0, "Unable to start scan BLE PERMISSIONS ARE OBLIGATORY : Manifest.permission.BLUETOOTH_SCAN & Manifest.permission.BLUETOOTH_CONNECT"

    return-object v0

    :cond_0
    const/16 v1, 0x1d

    if-lt v0, v1, :cond_1

    const-string v0, "Unable to start scan BLE PERMISSIONS ARE OBLIGATORY : Manifest.permission.ACCESS_FINE_LOCATION & Manifest.permission.ACCESS_BACKGROUND_LOCATION"

    return-object v0

    :cond_1
    const-string v0, "Unable to start scan BLE PERMISSIONS ARE OBLIGATORY : Manifest.permission.ACCESS_COARSE_LOCATION"

    return-object v0
.end method

.method public b(Landroid/content/Context;)V
    .locals 3

    .line 1
    iget-object v0, p0, Le/h/d/a/a/g/f;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    const-string v1, "packid.ble.Scanner"

    if-eqz v0, :cond_0

    const-string v0, "Starting BLE scanner"

    .line 2
    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p0, p1}, Le/h/d/a/a/g/f;->l(Landroid/content/Context;)V

    goto :goto_0

    :cond_0
    const-string p1, "BLE scanner already started (or starting), ignoring call to start"

    .line 4
    invoke-static {v1, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-void
.end method

.method public final c()Landroid/bluetooth/le/ScanSettings;
    .locals 4

    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x2

    invoke-virtual {p0, v1}, Le/h/d/a/a/g/f;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " scan rate during "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-wide/16 v2, 0x6

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, " s"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "packid.ble.Scanner"

    invoke-static {v2, v0}, Lcom/orange/oab/contactless/packid/debug/DebugConsole;->log(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    new-instance v0, Landroid/bluetooth/le/ScanSettings$Builder;

    invoke-direct {v0}, Landroid/bluetooth/le/ScanSettings$Builder;-><init>()V

    .line 7
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x17

    if-lt v2, v3, :cond_0

    const/4 v2, 0x1

    .line 8
    invoke-virtual {v0, v2}, Landroid/bluetooth/le/ScanSettings$Builder;->setCallbackType(I)Landroid/bluetooth/le/ScanSettings$Builder;

    .line 9
    invoke-virtual {v0, v2}, Landroid/bluetooth/le/ScanSettings$Builder;->setMatchMode(I)Landroid/bluetooth/le/ScanSettings$Builder;

    .line 10
    invoke-virtual {v0, v2}, Landroid/bluetooth/le/ScanSettings$Builder;->setNumOfMatches(I)Landroid/bluetooth/le/ScanSettings$Builder;

    const-wide/16 v2, 0x0

    .line 11
    invoke-virtual {v0, v2, v3}, Landroid/bluetooth/le/ScanSettings$Builder;->setReportDelay(J)Landroid/bluetooth/le/ScanSettings$Builder;

    .line 12
    invoke-virtual {v0, v1}, Landroid/bluetooth/le/ScanSettings$Builder;->setScanMode(I)Landroid/bluetooth/le/ScanSettings$Builder;

    .line 13
    :cond_0
    invoke-virtual {v0}, Landroid/bluetooth/le/ScanSettings$Builder;->build()Landroid/bluetooth/le/ScanSettings;

    move-result-object v0

    return-object v0
.end method

.method public c(Landroid/content/Context;)V
    .locals 3

    .line 1
    iget-object v0, p0, Le/h/d/a/a/g/f;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    const-string v1, "packid.ble.Scanner"

    if-eqz v0, :cond_0

    const-string v0, "Stopping BLE scanner"

    .line 2
    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p0, p1}, Le/h/d/a/a/g/f;->o(Landroid/content/Context;)V

    goto :goto_0

    :cond_0
    const-string p1, "BLE scanner already stopped (or stopping), ignoring call to stop"

    .line 4
    invoke-static {v1, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-void
.end method

.method public final d(Landroid/content/Context;)Landroid/bluetooth/BluetoothAdapter;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/ble/d;
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Le/h/d/a/a/g/f;->e(Landroid/content/Context;)Landroid/bluetooth/BluetoothManager;

    move-result-object p1

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothManager;->getAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object p1

    if-eqz p1, :cond_0

    return-object p1

    .line 2
    :cond_0
    new-instance p1, Lcom/orange/oab/contactless/packid/ble/d;

    const-string v0, "Unable to obtain a BluetoothAdapter"

    invoke-direct {p1, v0}, Lcom/orange/oab/contactless/packid/ble/d;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final e(Landroid/content/Context;)Landroid/bluetooth/BluetoothManager;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/ble/d;
        }
    .end annotation

    const-string v0, "bluetooth"

    .line 1
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/bluetooth/BluetoothManager;

    if-eqz p1, :cond_0

    return-object p1

    .line 2
    :cond_0
    new-instance p1, Lcom/orange/oab/contactless/packid/ble/d;

    const-string v0, "Unable to initialize BluetoothManager"

    invoke-direct {p1, v0}, Lcom/orange/oab/contactless/packid/ble/d;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final f(Landroid/content/Context;)V
    .locals 7

    .line 1
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    iput-object v0, p0, Le/h/d/a/a/g/f;->b:Ljava/util/concurrent/ScheduledExecutorService;

    .line 2
    new-instance v1, Le/h/d/a/a/g/a;

    invoke-direct {v1, p0, p1}, Le/h/d/a/a/g/a;-><init>(Le/h/d/a/a/g/f;Landroid/content/Context;)V

    sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x6

    invoke-interface/range {v0 .. v6}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleWithFixedDelay(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    return-void
.end method

.method public final g(Landroid/content/Context;)V
    .locals 5

    const-string v0, "packid.ble.Scanner"

    .line 1
    iget-object v1, p0, Le/h/d/a/a/g/f;->b:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {v1}, Ljava/util/concurrent/ScheduledExecutorService;->shutdown()V

    .line 2
    :try_start_0
    iget-object v1, p0, Le/h/d/a/a/g/f;->b:Ljava/util/concurrent/ScheduledExecutorService;

    const-wide/16 v2, 0x14

    sget-object v4, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v1, v2, v3, v4}, Ljava/util/concurrent/ScheduledExecutorService;->awaitTermination(JLjava/util/concurrent/TimeUnit;)Z
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    const-string v2, "Could not stop BLE scanner!"

    .line 3
    invoke-static {v0, v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 4
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    .line 5
    :goto_0
    :try_start_1
    invoke-virtual {p0, p1}, Le/h/d/a/a/g/f;->n(Landroid/content/Context;)V
    :try_end_1
    .catch Lcom/orange/oab/contactless/packid/ble/d; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception p1

    const-string v1, "Can\'t stop scan: "

    .line 6
    invoke-static {v0, v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_1
    return-void
.end method

.method public final h(Landroid/content/Context;)Landroid/bluetooth/le/BluetoothLeScanner;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/ble/d;
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Le/h/d/a/a/g/f;->d(Landroid/content/Context;)Landroid/bluetooth/BluetoothAdapter;

    move-result-object p1

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothAdapter;->getBluetoothLeScanner()Landroid/bluetooth/le/BluetoothLeScanner;

    move-result-object p1

    if-eqz p1, :cond_0

    return-object p1

    .line 2
    :cond_0
    new-instance p1, Lcom/orange/oab/contactless/packid/ble/d;

    const-string v0, "Unable to obtain a BluetoothLeScanner"

    invoke-direct {p1, v0}, Lcom/orange/oab/contactless/packid/ble/d;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final i(Landroid/content/Context;)Z
    .locals 4

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/16 v3, 0x1f

    if-lt v0, v3, :cond_1

    const-string v0, "android.permission.BLUETOOTH_SCAN"

    .line 2
    invoke-static {p1, v0}, Lc/h/f/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "android.permission.BLUETOOTH_CONNECT"

    .line 3
    invoke-static {p1, v0}, Lc/h/f/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1

    :cond_1
    const/16 v3, 0x1d

    if-lt v0, v3, :cond_4

    const-string v0, "android.permission.ACCESS_FINE_LOCATION"

    .line 4
    invoke-static {p1, v0}, Lc/h/f/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "android.permission.ACCESS_BACKGROUND_LOCATION"

    .line 5
    invoke-static {p1, v0}, Lc/h/f/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result p1

    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    :cond_3
    :goto_1
    return v1

    :cond_4
    const-string v0, "android.permission.ACCESS_COARSE_LOCATION"

    .line 6
    invoke-static {p1, v0}, Lc/h/f/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result p1

    if-nez p1, :cond_5

    goto :goto_2

    :cond_5
    const/4 v1, 0x0

    :goto_2
    return v1
.end method

.method public final j(Landroid/content/Context;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p0, p1}, Le/h/d/a/a/g/f;->n(Landroid/content/Context;)V

    .line 2
    invoke-virtual {p0, p1}, Le/h/d/a/a/g/f;->m(Landroid/content/Context;)V
    :try_end_0
    .catch Lcom/orange/oab/contactless/packid/ble/d; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v0, "packid.ble.Scanner"

    const-string v1, "Can\'t restart scan: "

    .line 3
    invoke-static {v0, v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    return-void
.end method

.method public final k(Landroid/content/Context;)Ljava/util/ArrayList;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Ljava/util/ArrayList<",
            "Landroid/bluetooth/le/ScanFilter;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2
    invoke-static {p1}, Le/h/d/a/a/s/m;->c(Landroid/content/Context;)Le/h/d/a/a/s/g0;

    move-result-object v1

    invoke-virtual {v1}, Le/h/d/a/a/s/g0;->a()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/orange/oab/contactless/packid/hce/user/User;

    .line 3
    invoke-virtual {v2}, Lcom/orange/oab/contactless/packid/hce/user/User;->isSimCentric()Z

    move-result v3

    if-nez v3, :cond_0

    .line 4
    invoke-virtual {v2}, Lcom/orange/oab/contactless/packid/hce/user/User;->getWallet()Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;

    move-result-object v3

    invoke-virtual {v3}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;->getBadges()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    .line 5
    invoke-static {p1, v4}, Le/h/d/a/a/i;->a(Landroid/content/Context;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-static {}, Le/h/d/a/a/h;->c()Le/h/d/a/a/h;

    move-result-object v5

    invoke-virtual {v5, v4}, Le/h/d/a/a/h;->b(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 6
    new-instance v5, Landroid/bluetooth/le/ScanFilter$Builder;

    invoke-direct {v5}, Landroid/bluetooth/le/ScanFilter$Builder;-><init>()V

    .line 7
    invoke-static {}, Lfr/mbs/binary/Octets;->empty()Lfr/mbs/binary/Octets;

    move-result-object v6

    invoke-virtual {v2}, Lcom/orange/oab/contactless/packid/hce/user/User;->getContactlessId()Lfr/mbs/binary/Octets;

    move-result-object v7

    invoke-virtual {v6, v7}, Lfr/mbs/binary/Octets;->put(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object v6

    invoke-virtual {v4}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getZoneId()Lfr/mbs/binary/Octets;

    move-result-object v4

    invoke-virtual {v6, v4}, Lfr/mbs/binary/Octets;->put(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;

    move-result-object v4

    invoke-virtual {v4}, Lfr/mbs/binary/Octets;->toBytes()[B

    move-result-object v4

    const/16 v6, 0x543

    .line 8
    invoke-virtual {v5, v6, v4}, Landroid/bluetooth/le/ScanFilter$Builder;->setManufacturerData(I[B)Landroid/bluetooth/le/ScanFilter$Builder;

    move-result-object v4

    .line 9
    invoke-virtual {v4}, Landroid/bluetooth/le/ScanFilter$Builder;->build()Landroid/bluetooth/le/ScanFilter;

    move-result-object v4

    .line 10
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public final declared-synchronized l(Landroid/content/Context;)V
    .locals 2

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Le/h/d/a/a/g/f;->b:Ljava/util/concurrent/ScheduledExecutorService;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/concurrent/ScheduledExecutorService;->isTerminated()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const-string p1, "packid.ble.Scanner"

    const-string v0, "Unexpected scanner state: scan restart schedule was asked but current executor is not terminated!"

    .line 2
    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    :cond_1
    :goto_0
    const-string v0, "packid.ble.Scanner"

    const-string v1, "Scheduling scan restart every 6 seconds"

    .line 3
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 4
    invoke-virtual {p0, p1}, Le/h/d/a/a/g/f;->f(Landroid/content/Context;)V

    const-string p1, "packid.ble.Scanner"

    const-string v0, "Scan restart scheduled"

    .line 5
    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_1
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final m(Landroid/content/Context;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/ble/d;
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Le/h/d/a/a/g/f;->i(Landroid/content/Context;)Z

    move-result v0

    const-string v1, "packid.ble.Scanner"

    if-eqz v0, :cond_0

    const-string v0, "Starting scan"

    .line 2
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x1

    .line 3
    invoke-virtual {p0, p1, v0}, Le/h/d/a/a/g/f;->a(Landroid/content/Context;Z)V

    const-string p1, "Scan started"

    .line 4
    invoke-static {v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 5
    :cond_0
    invoke-virtual {p0}, Le/h/d/a/a/g/f;->b()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-void
.end method

.method public final n(Landroid/content/Context;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/orange/oab/contactless/packid/ble/d;
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Le/h/d/a/a/g/f;->i(Landroid/content/Context;)Z

    move-result v0

    const-string v1, "packid.ble.Scanner"

    if-eqz v0, :cond_0

    const-string v0, "Starting scan"

    .line 2
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    .line 3
    invoke-virtual {p0, p1, v0}, Le/h/d/a/a/g/f;->a(Landroid/content/Context;Z)V

    const-string p1, "Scan started"

    .line 4
    invoke-static {v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 5
    :cond_0
    invoke-virtual {p0}, Le/h/d/a/a/g/f;->b()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-void
.end method

.method public final declared-synchronized o(Landroid/content/Context;)V
    .locals 2

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Le/h/d/a/a/g/f;->b:Ljava/util/concurrent/ScheduledExecutorService;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/concurrent/ScheduledExecutorService;->isTerminated()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "packid.ble.Scanner"

    const-string v1, "Stopping scan restart scheduler"

    .line 2
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    invoke-virtual {p0, p1}, Le/h/d/a/a/g/f;->g(Landroid/content/Context;)V

    const-string p1, "packid.ble.Scanner"

    const-string v0, "Scan restart schedule stopped"

    .line 4
    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    :cond_1
    :goto_0
    const-string p1, "packid.ble.Scanner"

    const-string v0, "Unexpected scanner state: scan restart schedule stop was asked but current executor is already null or terminated!"

    .line 5
    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_1
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
