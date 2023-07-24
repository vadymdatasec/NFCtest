.class public Le/h/d/a/a/g/k;
.super Landroid/bluetooth/BluetoothGattCallback;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "MissingPermission"
    }
.end annotation


# instance fields
.field public a:Landroid/bluetooth/BluetoothGatt;

.field public b:Ljava/util/Date;

.field public final c:Le/h/d/a/a/g/v;

.field public final d:Ljava/util/concurrent/ScheduledExecutorService;

.field public final e:Lcom/orange/oab/contactless/packid/service/PackIdService;

.field public f:I

.field public g:I


# direct methods
.method public constructor <init>(Lcom/orange/oab/contactless/packid/service/PackIdService;Le/h/d/a/a/g/v;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/bluetooth/BluetoothGattCallback;-><init>()V

    .line 2
    iput-object p1, p0, Le/h/d/a/a/g/k;->e:Lcom/orange/oab/contactless/packid/service/PackIdService;

    .line 3
    iput-object p2, p0, Le/h/d/a/a/g/k;->c:Le/h/d/a/a/g/v;

    .line 4
    invoke-virtual {p2, p0}, Le/h/d/a/a/g/v;->a(Le/h/d/a/a/g/k;)V

    .line 5
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object p1

    iput-object p1, p0, Le/h/d/a/a/g/k;->d:Ljava/util/concurrent/ScheduledExecutorService;

    return-void
.end method

.method public static synthetic a(Le/h/d/a/a/g/k;)Ljava/util/Date;
    .locals 0

    .line 1
    iget-object p0, p0, Le/h/d/a/a/g/k;->b:Ljava/util/Date;

    return-object p0
.end method

.method public static synthetic a(Le/h/d/a/a/g/k;Ljava/util/Date;)Ljava/util/Date;
    .locals 0

    .line 2
    iput-object p1, p0, Le/h/d/a/a/g/k;->b:Ljava/util/Date;

    return-object p1
.end method

.method public static synthetic a(Le/h/d/a/a/g/k;Landroid/bluetooth/BluetoothDevice;)V
    .locals 0

    invoke-direct {p0, p1}, Le/h/d/a/a/g/k;->c(Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method public static synthetic b(Le/h/d/a/a/g/k;)Landroid/bluetooth/BluetoothGatt;
    .locals 0

    .line 1
    iget-object p0, p0, Le/h/d/a/a/g/k;->a:Landroid/bluetooth/BluetoothGatt;

    return-object p0
.end method

.method private synthetic c(Landroid/bluetooth/BluetoothDevice;)V
    .locals 9

    const/4 v0, 0x0

    .line 5
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    const-string v2, "connectGatt"

    const/4 v3, 0x4

    :try_start_1
    new-array v4, v3, [Ljava/lang/Class;

    const-class v5, Landroid/content/Context;

    aput-object v5, v4, v0

    sget-object v5, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    const/4 v6, 0x1

    aput-object v5, v4, v6

    const-class v5, Landroid/bluetooth/BluetoothGattCallback;

    const/4 v7, 0x2

    aput-object v5, v4, v7

    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const/4 v8, 0x3

    aput-object v5, v4, v8

    invoke-virtual {v1, v2, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    new-array v2, v3, [Ljava/lang/Object;

    .line 6
    iget-object v3, p0, Le/h/d/a/a/g/k;->e:Lcom/orange/oab/contactless/packid/service/PackIdService;

    aput-object v3, v2, v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    aput-object v3, v2, v6

    aput-object p0, v2, v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v8

    invoke-virtual {v1, p1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/bluetooth/BluetoothGatt;
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    .line 7
    :catch_0
    iget-object v1, p0, Le/h/d/a/a/g/k;->e:Lcom/orange/oab/contactless/packid/service/PackIdService;

    invoke-virtual {p1, v1, v0, p0}, Landroid/bluetooth/BluetoothDevice;->connectGatt(Landroid/content/Context;ZLandroid/bluetooth/BluetoothGattCallback;)Landroid/bluetooth/BluetoothGatt;

    move-result-object v1

    .line 8
    :goto_0
    invoke-virtual {p0, v1}, Le/h/d/a/a/g/k;->a(Landroid/bluetooth/BluetoothGatt;)V

    return-void
.end method


# virtual methods
.method public a(Landroid/bluetooth/BluetoothDevice;)V
    .locals 4

    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Connecting to "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    const-string v1, "unknown"

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;

    move-result-object v1

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    const-string v2, "packid.ble.GattCallback"

    .line 4
    invoke-static {v2, v0, v1}, Lcom/orange/oab/contactless/packid/debug/DebugConsole;->log(Ljava/lang/String;Ljava/lang/String;I)V

    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Connecting to gatt server with address "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    iput v1, p0, Le/h/d/a/a/g/k;->f:I

    .line 7
    invoke-virtual {p0, p1}, Le/h/d/a/a/g/k;->b(Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method public a(Landroid/bluetooth/BluetoothGatt;)V
    .locals 4

    const-string v0, "packid.ble.GattCallback"

    const-string v1, "Scheduling timeout for GATT Connection"

    .line 10
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 11
    iput-object p1, p0, Le/h/d/a/a/g/k;->a:Landroid/bluetooth/BluetoothGatt;

    .line 12
    iget-object p1, p0, Le/h/d/a/a/g/k;->b:Ljava/util/Date;

    if-nez p1, :cond_0

    .line 13
    iget-object p1, p0, Le/h/d/a/a/g/k;->d:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v0, Le/h/d/a/a/g/j;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Le/h/d/a/a/g/j;-><init>(Le/h/d/a/a/g/k;Le/h/d/a/a/g/i;)V

    iget-object v1, p0, Le/h/d/a/a/g/k;->c:Le/h/d/a/a/g/v;

    invoke-virtual {v1}, Le/h/d/a/a/g/v;->b()I

    move-result v1

    int-to-long v1, v1

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {p1, v0, v1, v2, v3}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    :cond_0
    return-void
.end method

.method public final a(Landroid/bluetooth/BluetoothGatt;I)V
    .locals 3

    .line 14
    invoke-static {}, Le/h/d/a/a/n/t;->b()Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Le/h/d/a/a/g/k;->b:Ljava/util/Date;

    .line 15
    iget-object v0, p0, Le/h/d/a/a/g/k;->e:Lcom/orange/oab/contactless/packid/service/PackIdService;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Gatt connect abort: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Le/h/d/a/a/g/m;->c:Le/h/d/a/a/g/m;

    invoke-virtual {v2, p2}, Le/h/d/a/a/g/m;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const/4 v1, 0x1

    invoke-static {v0, p2, v1}, Lcom/orange/oab/contactless/packid/service/LogManager;->e(Landroid/content/Context;Ljava/lang/String;I)V

    .line 16
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->close()V

    .line 17
    iget-object p1, p0, Le/h/d/a/a/g/k;->c:Le/h/d/a/a/g/v;

    invoke-virtual {p1}, Le/h/d/a/a/g/v;->a()V

    return-void
.end method

.method public final a(Landroid/bluetooth/BluetoothGatt;ILjava/lang/String;Ljava/lang/String;Ljava/util/UUID;)V
    .locals 1

    .line 8
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, " with gatt="

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "="

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " status="

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object p1, Le/h/d/a/a/g/m;->c:Le/h/d/a/a/g/m;

    invoke-virtual {p1, p2}, Le/h/d/a/a/g/m;->a(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "packid.ble.GattCallback"

    invoke-static {p2, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public a(Landroid/bluetooth/BluetoothGatt;Ljava/lang/String;)V
    .locals 3

    .line 18
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Done "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "packid.ble.GattCallback"

    invoke-static {v2, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 19
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const/high16 v0, -0x1000000

    const/4 v1, 0x2

    invoke-static {v2, v0, p2, v1}, Lcom/orange/oab/contactless/packid/debug/DebugConsole;->log(Ljava/lang/String;ILjava/lang/String;I)V

    .line 20
    invoke-virtual {p0, p1}, Le/h/d/a/a/g/k;->b(Landroid/bluetooth/BluetoothGatt;)V

    return-void
.end method

.method public a(Landroid/bluetooth/BluetoothGatt;Ljava/lang/String;ILcom/orange/business/packid/android/lib/TransactionErrorType;)V
    .locals 1

    const-string p4, "packid.ble.GattCallback"

    .line 21
    invoke-static {p4, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    const/high16 v0, -0x10000

    .line 22
    invoke-static {p4, v0, p2, p3}, Lcom/orange/oab/contactless/packid/debug/DebugConsole;->log(Ljava/lang/String;ILjava/lang/String;I)V

    .line 23
    iget-object p2, p0, Le/h/d/a/a/g/k;->c:Le/h/d/a/a/g/v;

    invoke-virtual {p2}, Le/h/d/a/a/g/v;->a()V

    .line 24
    invoke-virtual {p0, p1}, Le/h/d/a/a/g/k;->b(Landroid/bluetooth/BluetoothGatt;)V

    return-void
.end method

.method public a()Z
    .locals 2

    .line 9
    iget-object v0, p0, Le/h/d/a/a/g/k;->b:Ljava/util/Date;

    if-eqz v0, :cond_0

    const/16 v1, 0x7d0

    invoke-static {v1}, Le/h/d/a/a/n/t;->a(I)Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/Date;->before(Ljava/util/Date;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public b()V
    .locals 2

    .line 9
    iget-object v0, p0, Le/h/d/a/a/g/k;->e:Lcom/orange/oab/contactless/packid/service/PackIdService;

    iget-object v1, p0, Le/h/d/a/a/g/k;->c:Le/h/d/a/a/g/v;

    iget-object v1, v1, Le/h/d/a/a/g/v;->c:Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;

    invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/service/PackIdService;->a(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)V

    return-void
.end method

.method public final b(Landroid/bluetooth/BluetoothDevice;)V
    .locals 2

    .line 2
    new-instance v0, Landroid/os/Handler;

    iget-object v1, p0, Le/h/d/a/a/g/k;->e:Lcom/orange/oab/contactless/packid/service/PackIdService;

    invoke-virtual {v1}, Landroid/app/Service;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 3
    new-instance v1, Le/h/d/a/a/g/c;

    invoke-direct {v1, p0, p1}, Le/h/d/a/a/g/c;-><init>(Le/h/d/a/a/g/k;Landroid/bluetooth/BluetoothDevice;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final b(Landroid/bluetooth/BluetoothGatt;)V
    .locals 4

    const-string v0, "packid.ble.GattCallback"

    .line 4
    invoke-virtual {p0}, Le/h/d/a/a/g/k;->c()V

    if-eqz p1, :cond_0

    .line 5
    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Closing GATT "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->disconnect()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 7
    iget-object v1, p0, Le/h/d/a/a/g/k;->e:Lcom/orange/oab/contactless/packid/service/PackIdService;

    const/4 v2, 0x1

    const-string v3, "GATT server disconnect error"

    invoke-static {v1, v3, v2}, Lcom/orange/oab/contactless/packid/service/LogManager;->e(Landroid/content/Context;Ljava/lang/String;I)V

    const-string v1, "Error while closing connection"

    .line 8
    invoke-static {v0, v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    :goto_0
    return-void
.end method

.method public final c()V
    .locals 5

    const-string v0, "packid.ble.GattCallback"

    .line 9
    iget-object v1, p0, Le/h/d/a/a/g/k;->d:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {v1}, Ljava/util/concurrent/ScheduledExecutorService;->shutdownNow()Ljava/util/List;

    .line 10
    :try_start_0
    iget-object v1, p0, Le/h/d/a/a/g/k;->d:Ljava/util/concurrent/ScheduledExecutorService;

    const-wide/16 v2, 0xa

    sget-object v4, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v1, v2, v3, v4}, Ljava/util/concurrent/ScheduledExecutorService;->awaitTermination(JLjava/util/concurrent/TimeUnit;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "Could not stop gattConnectionTimeoutScheduler: timed out"

    .line 11
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    const-string v2, "Could not stop gattConnectionTimeoutScheduler:"

    .line 12
    invoke-static {v0, v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 13
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    :cond_0
    :goto_0
    return-void
.end method

.method public final c(Landroid/bluetooth/BluetoothGatt;)V
    .locals 5

    .line 1
    iget-object v0, p0, Le/h/d/a/a/g/k;->c:Le/h/d/a/a/g/v;

    invoke-virtual {v0}, Le/h/d/a/a/g/v;->b()I

    move-result v0

    div-int/lit16 v0, v0, 0x3e8

    .line 2
    iget v1, p0, Le/h/d/a/a/g/k;->g:I

    const/4 v2, 0x1

    add-int/2addr v1, v2

    iput v1, p0, Le/h/d/a/a/g/k;->g:I

    if-lt v1, v0, :cond_0

    .line 3
    iget-object v1, p0, Le/h/d/a/a/g/k;->e:Lcom/orange/oab/contactless/packid/service/PackIdService;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Waiting service to answer "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v4, p0, Le/h/d/a/a/g/k;->g:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, "/"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0, v2}, Lcom/orange/oab/contactless/packid/service/LogManager;->w(Landroid/content/Context;Ljava/lang/String;I)V

    .line 4
    iget-object v0, p0, Le/h/d/a/a/g/k;->d:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Le/h/d/a/a/g/b;

    invoke-direct {v1, p1}, Le/h/d/a/a/g/b;-><init>(Landroid/bluetooth/BluetoothGatt;)V

    sget-object p1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x3e8

    invoke-interface {v0, v1, v2, v3, p1}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    :cond_0
    return-void
.end method

.method public onCharacteristicChanged(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onCharacteristicChanged with gatt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " characteristic="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "packid.ble.GattCallback"

    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-object v0, p0, Le/h/d/a/a/g/k;->c:Le/h/d/a/a/g/v;

    invoke-virtual {v0, p1, p2}, Le/h/d/a/a/g/v;->a(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V

    return-void
.end method

.method public onCharacteristicRead(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;I)V
    .locals 6

    .line 1
    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object v5

    const-string v3, "onCharacteristicRead"

    const-string v4, "characteristic"

    move-object v0, p0

    move-object v1, p1

    move v2, p3

    invoke-virtual/range {v0 .. v5}, Le/h/d/a/a/g/k;->a(Landroid/bluetooth/BluetoothGatt;ILjava/lang/String;Ljava/lang/String;Ljava/util/UUID;)V

    if-nez p3, :cond_0

    .line 2
    iget-object p3, p0, Le/h/d/a/a/g/k;->c:Le/h/d/a/a/g/v;

    invoke-virtual {p3, p1, p2}, Le/h/d/a/a/g/v;->b(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V

    goto :goto_0

    .line 3
    :cond_0
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Read characteristic error: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v0, Le/h/d/a/a/g/m;->c:Le/h/d/a/a/g/m;

    invoke-virtual {v0, p3}, Le/h/d/a/a/g/m;->a(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    sget-object p3, Lcom/orange/business/packid/android/lib/TransactionErrorType;->READ_CHARACTERISTIC:Lcom/orange/business/packid/android/lib/TransactionErrorType;

    const/4 v0, 0x2

    invoke-virtual {p0, p1, p2, v0, p3}, Le/h/d/a/a/g/k;->a(Landroid/bluetooth/BluetoothGatt;Ljava/lang/String;ILcom/orange/business/packid/android/lib/TransactionErrorType;)V

    :goto_0
    return-void
.end method

.method public onCharacteristicWrite(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;I)V
    .locals 6

    .line 1
    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object v5

    const-string v3, "onCharacteristicWrite"

    const-string v4, "characteristic"

    move-object v0, p0

    move-object v1, p1

    move v2, p3

    invoke-virtual/range {v0 .. v5}, Le/h/d/a/a/g/k;->a(Landroid/bluetooth/BluetoothGatt;ILjava/lang/String;Ljava/lang/String;Ljava/util/UUID;)V

    if-nez p3, :cond_0

    .line 2
    iget-object p3, p0, Le/h/d/a/a/g/k;->c:Le/h/d/a/a/g/v;

    invoke-virtual {p3, p1, p2}, Le/h/d/a/a/g/v;->c(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V

    goto :goto_0

    .line 3
    :cond_0
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Write characteristic error: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v0, Le/h/d/a/a/g/m;->c:Le/h/d/a/a/g/m;

    invoke-virtual {v0, p3}, Le/h/d/a/a/g/m;->a(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    sget-object p3, Lcom/orange/business/packid/android/lib/TransactionErrorType;->WRITE_DESCRIPTOR:Lcom/orange/business/packid/android/lib/TransactionErrorType;

    const/4 v0, 0x2

    invoke-virtual {p0, p1, p2, v0, p3}, Le/h/d/a/a/g/k;->a(Landroid/bluetooth/BluetoothGatt;Ljava/lang/String;ILcom/orange/business/packid/android/lib/TransactionErrorType;)V

    :goto_0
    return-void
.end method

.method public onConnectionStateChange(Landroid/bluetooth/BluetoothGatt;II)V
    .locals 6

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onConnectionStateChange("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Le/h/d/a/a/g/m;->c:Le/h/d/a/a/g/m;

    invoke-virtual {v2, p2}, Le/h/d/a/a/g/m;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, Le/h/d/a/a/g/m;->d:Le/h/d/a/a/g/m;

    invoke-virtual {v1, p3}, Le/h/d/a/a/g/m;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "packid.ble.GattCallback"

    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x6

    const-string v3, "Gatt "

    const/4 v4, 0x1

    const/4 v5, 0x2

    if-ne p3, v5, :cond_0

    if-nez p2, :cond_0

    .line 2
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, Le/h/d/a/a/g/m;->d:Le/h/d/a/a/g/m;

    invoke-virtual {v1, p3}, Le/h/d/a/a/g/m;->a(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v2, p2, v4}, Lcom/orange/oab/contactless/packid/debug/DebugConsole;->log(Ljava/lang/String;Ljava/lang/String;I)V

    .line 3
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->discoverServices()Z

    goto :goto_0

    :cond_0
    if-nez p3, :cond_1

    if-nez p2, :cond_1

    .line 4
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, Le/h/d/a/a/g/m;->d:Le/h/d/a/a/g/m;

    invoke-virtual {v1, p3}, Le/h/d/a/a/g/m;->a(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v2, p2, v4}, Lcom/orange/oab/contactless/packid/debug/DebugConsole;->log(Ljava/lang/String;Ljava/lang/String;I)V

    .line 5
    invoke-static {}, Le/h/d/a/a/n/t;->b()Ljava/util/Date;

    move-result-object p2

    iput-object p2, p0, Le/h/d/a/a/g/k;->b:Ljava/util/Date;

    .line 6
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->close()V

    goto :goto_0

    .line 7
    :cond_1
    iget p3, p0, Le/h/d/a/a/g/k;->f:I

    const/4 v0, 0x3

    if-gt p3, v0, :cond_2

    .line 8
    iget-object p2, p0, Le/h/d/a/a/g/k;->e:Lcom/orange/oab/contactless/packid/service/PackIdService;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Gatt not ready: try again ("

    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Le/h/d/a/a/g/k;->f:I

    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "/"

    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-static {p2, p3, v4}, Lcom/orange/oab/contactless/packid/service/LogManager;->w(Landroid/content/Context;Ljava/lang/String;I)V

    .line 9
    iget p2, p0, Le/h/d/a/a/g/k;->f:I

    add-int/2addr p2, v4

    iput p2, p0, Le/h/d/a/a/g/k;->f:I

    .line 10
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->connect()Z

    goto :goto_0

    .line 11
    :cond_2
    invoke-virtual {p0, p1, p2}, Le/h/d/a/a/g/k;->a(Landroid/bluetooth/BluetoothGatt;I)V

    :goto_0
    return-void
.end method

.method public onDescriptorWrite(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;I)V
    .locals 6

    .line 1
    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattDescriptor;->getUuid()Ljava/util/UUID;

    move-result-object v5

    const-string v3, "onDescriptorWrite"

    const-string v4, "descriptor"

    move-object v0, p0

    move-object v1, p1

    move v2, p3

    invoke-virtual/range {v0 .. v5}, Le/h/d/a/a/g/k;->a(Landroid/bluetooth/BluetoothGatt;ILjava/lang/String;Ljava/lang/String;Ljava/util/UUID;)V

    if-nez p3, :cond_0

    .line 2
    iget-object p3, p0, Le/h/d/a/a/g/k;->c:Le/h/d/a/a/g/v;

    invoke-virtual {p3, p1, p2}, Le/h/d/a/a/g/v;->a(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;)V

    goto :goto_0

    .line 3
    :cond_0
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Write descriptor error: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v0, Le/h/d/a/a/g/m;->c:Le/h/d/a/a/g/m;

    invoke-virtual {v0, p3}, Le/h/d/a/a/g/m;->a(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    sget-object p3, Lcom/orange/business/packid/android/lib/TransactionErrorType;->WRITE_DESCRIPTOR:Lcom/orange/business/packid/android/lib/TransactionErrorType;

    const/4 v0, 0x2

    invoke-virtual {p0, p1, p2, v0, p3}, Le/h/d/a/a/g/k;->a(Landroid/bluetooth/BluetoothGatt;Ljava/lang/String;ILcom/orange/business/packid/android/lib/TransactionErrorType;)V

    :goto_0
    return-void
.end method

.method public onServicesDiscovered(Landroid/bluetooth/BluetoothGatt;I)V
    .locals 0

    .line 1
    iget-object p2, p0, Le/h/d/a/a/g/k;->c:Le/h/d/a/a/g/v;

    invoke-virtual {p2, p1}, Le/h/d/a/a/g/v;->a(Landroid/bluetooth/BluetoothGatt;)Landroid/bluetooth/BluetoothGattService;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 2
    iget-object p2, p0, Le/h/d/a/a/g/k;->c:Le/h/d/a/a/g/v;

    invoke-virtual {p2, p1}, Le/h/d/a/a/g/v;->b(Landroid/bluetooth/BluetoothGatt;)V

    const/4 p1, 0x0

    .line 3
    iput p1, p0, Le/h/d/a/a/g/k;->g:I

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p0, p1}, Le/h/d/a/a/g/k;->c(Landroid/bluetooth/BluetoothGatt;)V

    :goto_0
    return-void
.end method
