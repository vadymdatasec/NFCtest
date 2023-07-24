.class public Lcom/orange/business/packid/android/lib/PackIdUtility;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    sput v0, Lcom/orange/business/packid/android/lib/PackIdUtility;->a:I

    return-void
.end method

.method public static canUseBleForBadge(Landroid/content/Context;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Le/h/d/a/a/i;->a(Landroid/content/Context;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)Z

    move-result p0

    return p0
.end method

.method public static canUseNfcForBadge(Landroid/content/Context;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Le/h/d/a/a/i;->b(Landroid/content/Context;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)Z

    move-result p0

    return p0
.end method

.method public static getBluetoothAdapter(Landroid/content/Context;)Landroid/bluetooth/BluetoothAdapter;
    .locals 1

    const-string v0, "bluetooth"

    .line 1
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/bluetooth/BluetoothManager;

    .line 2
    invoke-virtual {p0}, Landroid/bluetooth/BluetoothManager;->getAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object p0

    return-object p0
.end method

.method public static getBluetoothState(Landroid/content/Context;)I
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/orange/business/packid/android/lib/PackIdUtility;->getBluetoothAdapter(Landroid/content/Context;)Landroid/bluetooth/BluetoothAdapter;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 2
    invoke-virtual {p0}, Landroid/bluetooth/BluetoothAdapter;->getState()I

    move-result p0

    return p0

    :cond_0
    const/16 p0, 0xa

    return p0
.end method

.method public static isAccessCoarseLocationEnabled(Landroid/content/Context;)Z
    .locals 1

    const-string v0, "android.permission.ACCESS_COARSE_LOCATION"

    .line 1
    invoke-static {p0, v0}, Lc/h/f/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result p0

    const/4 v0, -0x1

    if-eq p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static isBlePermissionsAccepted(Landroid/content/Context;)Z
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/orange/business/packid/android/lib/PackIdUtility;->isBluetoothEnabled(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-static {p0}, Lcom/orange/business/packid/android/lib/PackIdUtility;->isAccessCoarseLocationEnabled(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    invoke-static {p0}, Lcom/orange/business/packid/android/lib/PackIdUtility;->isPowerOptimisationDisabled(Landroid/content/Context;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static isBluetoothEnabled(Landroid/content/Context;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/orange/business/packid/android/lib/PackIdUtility;->getBluetoothAdapter(Landroid/content/Context;)Landroid/bluetooth/BluetoothAdapter;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 2
    invoke-virtual {p0}, Landroid/bluetooth/BluetoothAdapter;->isEnabled()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static isNfcEnabled(Landroid/content/Context;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Landroid/nfc/NfcAdapter;->getDefaultAdapter(Landroid/content/Context;)Landroid/nfc/NfcAdapter;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 2
    invoke-virtual {p0}, Landroid/nfc/NfcAdapter;->isEnabled()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static isPowerOptimisationDisabled(Landroid/content/Context;)Z
    .locals 3

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x1

    const/16 v2, 0x17

    if-lt v0, v2, :cond_1

    const-string v0, "power"

    .line 2
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/PowerManager;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Landroid/os/PowerManager;->isIgnoringBatteryOptimizations(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :cond_1
    :goto_0
    return v1
.end method

.method public static isUWBAvaible(Landroid/content/Context;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p0

    const-string v0, "android.hardware.uwb"

    invoke-virtual {p0, v0}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static startBluetooth(Landroid/content/Context;)V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    .line 1
    sget v0, Lcom/orange/business/packid/android/lib/PackIdUtility;->a:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_0

    const-string v0, "android.permission.BLUETOOTH_CONNECT"

    invoke-static {p0, v0}, Lc/h/f/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_0

    const-string p0, "PackIdUtility"

    const-string v0, "Unable to start BLE : android.permission.BLUETOOTH_CONNECT is obligatory"

    .line 2
    invoke-static {p0, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 3
    :cond_0
    invoke-static {p0}, Lcom/orange/business/packid/android/lib/PackIdUtility;->getBluetoothAdapter(Landroid/content/Context;)Landroid/bluetooth/BluetoothAdapter;

    move-result-object p0

    if-eqz p0, :cond_1

    .line 4
    invoke-virtual {p0}, Landroid/bluetooth/BluetoothAdapter;->enable()Z

    :cond_1
    return-void
.end method
