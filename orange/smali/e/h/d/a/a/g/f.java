public class e.h.d.a.a.g.f {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final e.h.d.a.a.g.f d;
	 /* # instance fields */
	 public e.h.d.a.a.g.e a;
	 public java.util.concurrent.ScheduledExecutorService b;
	 public final java.util.concurrent.atomic.AtomicBoolean c;
	 /* # direct methods */
	 public static e.h.d.a.a.g.f ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* new-instance v0, Le/h/d/a/a/g/f; */
		 /* invoke-direct {v0}, Le/h/d/a/a/g/f;-><init>()V */
		 return;
	 } // .end method
	 public e.h.d.a.a.g.f ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 /* new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean; */
		 int v1 = 0; // const/4 v1, 0x0
		 /* invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V */
		 this.c = v0;
		 return;
	 } // .end method
	 public static void a ( Object p0, android.content.Context p1 ) { //synthethic
		 /* .locals 0 */
		 /* invoke-direct {p0, p1}, Le/h/d/a/a/g/f;->p(Landroid/content/Context;)V */
		 return;
	 } // .end method
	 private void p ( android.content.Context p0 ) { //synthethic
		 /* .locals 0 */
		 /* .line 1 */
		 (( e.h.d.a.a.g.f ) p0 ).j ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/g/f;->j(Landroid/content/Context;)V
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final java.lang.String a ( Integer p0 ) {
		 /* .locals 1 */
		 if ( p1 != null) { // if-eqz p1, :cond_2
			 int v0 = 1; // const/4 v0, 0x1
			 /* if-eq p1, v0, :cond_1 */
			 int v0 = 2; // const/4 v0, 0x2
			 /* if-eq p1, v0, :cond_0 */
			 final String p1 = "Unknown"; // const-string p1, "Unknown"
		 } // :cond_0
		 final String p1 = "High"; // const-string p1, "High"
	 } // :cond_1
	 final String p1 = "Midle"; // const-string p1, "Midle"
} // :cond_2
final String p1 = "Low"; // const-string p1, "Low"
} // .end method
public void a ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
(( e.h.d.a.a.g.f ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/h/d/a/a/g/f;->a(Le/h/d/a/a/g/e;)V
return;
} // .end method
public final void a ( android.content.Context p0, Boolean p1 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/orange/oab/contactless/packid/ble/d; */
/* } */
} // .end annotation
if ( p2 != null) { // if-eqz p2, :cond_0
/* .line 3 */
(( e.h.d.a.a.g.f ) p0 ).k ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/g/f;->k(Landroid/content/Context;)Ljava/util/ArrayList;
/* .line 4 */
v0 = (( java.util.ArrayList ) p2 ).isEmpty ( ); // invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z
/* if-nez v0, :cond_1 */
/* .line 5 */
(( e.h.d.a.a.g.f ) p0 ).h ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/g/f;->h(Landroid/content/Context;)Landroid/bluetooth/le/BluetoothLeScanner;
(( e.h.d.a.a.g.f ) p0 ).c ( ); // invoke-virtual {p0}, Le/h/d/a/a/g/f;->c()Landroid/bluetooth/le/ScanSettings;
v1 = this.a;
(( android.bluetooth.le.BluetoothLeScanner ) p1 ).startScan ( p2, v0, v1 ); // invoke-virtual {p1, p2, v0, v1}, Landroid/bluetooth/le/BluetoothLeScanner;->startScan(Ljava/util/List;Landroid/bluetooth/le/ScanSettings;Landroid/bluetooth/le/ScanCallback;)V
/* .line 6 */
} // :cond_0
(( e.h.d.a.a.g.f ) p0 ).h ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/g/f;->h(Landroid/content/Context;)Landroid/bluetooth/le/BluetoothLeScanner;
p2 = this.a;
(( android.bluetooth.le.BluetoothLeScanner ) p1 ).stopScan ( p2 ); // invoke-virtual {p1, p2}, Landroid/bluetooth/le/BluetoothLeScanner;->stopScan(Landroid/bluetooth/le/ScanCallback;)V
} // :cond_1
} // :goto_0
return;
} // .end method
public void a ( Object p0 ) {
/* .locals 0 */
/* .line 1 */
this.a = p1;
return;
} // .end method
public Boolean a ( android.content.Context p0 ) {
/* .locals 0 */
/* .annotation build Landroid/annotation/SuppressLint; */
/* value = { */
/* "MissingPermission" */
/* } */
} // .end annotation
/* .line 7 */
p1 = com.orange.business.packid.android.lib.PackIdUtility .isBluetoothEnabled ( p1 );
} // .end method
public final java.lang.String b ( ) {
/* .locals 2 */
/* .line 5 */
/* const/16 v1, 0x1f */
/* if-lt v0, v1, :cond_0 */
final String v0 = "Unable to start scan BLE PERMISSIONS ARE OBLIGATORY : Manifest.permission.BLUETOOTH_SCAN & Manifest.permission.BLUETOOTH_CONNECT"; // const-string v0, "Unable to start scan BLE PERMISSIONS ARE OBLIGATORY : Manifest.permission.BLUETOOTH_SCAN & Manifest.permission.BLUETOOTH_CONNECT"
} // :cond_0
/* const/16 v1, 0x1d */
/* if-lt v0, v1, :cond_1 */
final String v0 = "Unable to start scan BLE PERMISSIONS ARE OBLIGATORY : Manifest.permission.ACCESS_FINE_LOCATION & Manifest.permission.ACCESS_BACKGROUND_LOCATION"; // const-string v0, "Unable to start scan BLE PERMISSIONS ARE OBLIGATORY : Manifest.permission.ACCESS_FINE_LOCATION & Manifest.permission.ACCESS_BACKGROUND_LOCATION"
} // :cond_1
final String v0 = "Unable to start scan BLE PERMISSIONS ARE OBLIGATORY : Manifest.permission.ACCESS_COARSE_LOCATION"; // const-string v0, "Unable to start scan BLE PERMISSIONS ARE OBLIGATORY : Manifest.permission.ACCESS_COARSE_LOCATION"
} // .end method
public void b ( android.content.Context p0 ) {
/* .locals 3 */
/* .line 1 */
v0 = this.c;
int v1 = 0; // const/4 v1, 0x0
int v2 = 1; // const/4 v2, 0x1
v0 = (( java.util.concurrent.atomic.AtomicBoolean ) v0 ).compareAndSet ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z
final String v1 = "packid.ble.Scanner"; // const-string v1, "packid.ble.Scanner"
if ( v0 != null) { // if-eqz v0, :cond_0
final String v0 = "Starting BLE scanner"; // const-string v0, "Starting BLE scanner"
/* .line 2 */
android.util.Log .i ( v1,v0 );
/* .line 3 */
(( android.content.Context ) p1 ).getApplicationContext ( ); // invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
(( e.h.d.a.a.g.f ) p0 ).l ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/g/f;->l(Landroid/content/Context;)V
} // :cond_0
final String p1 = "BLE scanner already started (or starting), ignoring call to start"; // const-string p1, "BLE scanner already started (or starting), ignoring call to start"
/* .line 4 */
android.util.Log .i ( v1,p1 );
} // :goto_0
return;
} // .end method
public final android.bluetooth.le.ScanSettings c ( ) {
/* .locals 4 */
/* .line 5 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
int v1 = 2; // const/4 v1, 0x2
(( e.h.d.a.a.g.f ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Le/h/d/a/a/g/f;->a(I)Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = " scan rate during "; // const-string v2, " scan rate during "
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* const-wide/16 v2, 0x6 */
(( java.lang.StringBuilder ) v0 ).append ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
final String v2 = " s"; // const-string v2, " s"
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v2 = "packid.ble.Scanner"; // const-string v2, "packid.ble.Scanner"
com.orange.oab.contactless.packid.debug.DebugConsole .log ( v2,v0 );
/* .line 6 */
/* new-instance v0, Landroid/bluetooth/le/ScanSettings$Builder; */
/* invoke-direct {v0}, Landroid/bluetooth/le/ScanSettings$Builder;-><init>()V */
/* .line 7 */
/* const/16 v3, 0x17 */
/* if-lt v2, v3, :cond_0 */
int v2 = 1; // const/4 v2, 0x1
/* .line 8 */
(( android.bluetooth.le.ScanSettings$Builder ) v0 ).setCallbackType ( v2 ); // invoke-virtual {v0, v2}, Landroid/bluetooth/le/ScanSettings$Builder;->setCallbackType(I)Landroid/bluetooth/le/ScanSettings$Builder;
/* .line 9 */
(( android.bluetooth.le.ScanSettings$Builder ) v0 ).setMatchMode ( v2 ); // invoke-virtual {v0, v2}, Landroid/bluetooth/le/ScanSettings$Builder;->setMatchMode(I)Landroid/bluetooth/le/ScanSettings$Builder;
/* .line 10 */
(( android.bluetooth.le.ScanSettings$Builder ) v0 ).setNumOfMatches ( v2 ); // invoke-virtual {v0, v2}, Landroid/bluetooth/le/ScanSettings$Builder;->setNumOfMatches(I)Landroid/bluetooth/le/ScanSettings$Builder;
/* const-wide/16 v2, 0x0 */
/* .line 11 */
(( android.bluetooth.le.ScanSettings$Builder ) v0 ).setReportDelay ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Landroid/bluetooth/le/ScanSettings$Builder;->setReportDelay(J)Landroid/bluetooth/le/ScanSettings$Builder;
/* .line 12 */
(( android.bluetooth.le.ScanSettings$Builder ) v0 ).setScanMode ( v1 ); // invoke-virtual {v0, v1}, Landroid/bluetooth/le/ScanSettings$Builder;->setScanMode(I)Landroid/bluetooth/le/ScanSettings$Builder;
/* .line 13 */
} // :cond_0
(( android.bluetooth.le.ScanSettings$Builder ) v0 ).build ( ); // invoke-virtual {v0}, Landroid/bluetooth/le/ScanSettings$Builder;->build()Landroid/bluetooth/le/ScanSettings;
} // .end method
public void c ( android.content.Context p0 ) {
/* .locals 3 */
/* .line 1 */
v0 = this.c;
int v1 = 1; // const/4 v1, 0x1
int v2 = 0; // const/4 v2, 0x0
v0 = (( java.util.concurrent.atomic.AtomicBoolean ) v0 ).compareAndSet ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z
final String v1 = "packid.ble.Scanner"; // const-string v1, "packid.ble.Scanner"
if ( v0 != null) { // if-eqz v0, :cond_0
final String v0 = "Stopping BLE scanner"; // const-string v0, "Stopping BLE scanner"
/* .line 2 */
android.util.Log .i ( v1,v0 );
/* .line 3 */
(( android.content.Context ) p1 ).getApplicationContext ( ); // invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
(( e.h.d.a.a.g.f ) p0 ).o ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/g/f;->o(Landroid/content/Context;)V
} // :cond_0
final String p1 = "BLE scanner already stopped (or stopping), ignoring call to stop"; // const-string p1, "BLE scanner already stopped (or stopping), ignoring call to stop"
/* .line 4 */
android.util.Log .i ( v1,p1 );
} // :goto_0
return;
} // .end method
public final android.bluetooth.BluetoothAdapter d ( android.content.Context p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/orange/oab/contactless/packid/ble/d; */
/* } */
} // .end annotation
/* .line 1 */
(( e.h.d.a.a.g.f ) p0 ).e ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/g/f;->e(Landroid/content/Context;)Landroid/bluetooth/BluetoothManager;
(( android.bluetooth.BluetoothManager ) p1 ).getAdapter ( ); // invoke-virtual {p1}, Landroid/bluetooth/BluetoothManager;->getAdapter()Landroid/bluetooth/BluetoothAdapter;
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 2 */
} // :cond_0
/* new-instance p1, Lcom/orange/oab/contactless/packid/ble/d; */
final String v0 = "Unable to obtain a BluetoothAdapter"; // const-string v0, "Unable to obtain a BluetoothAdapter"
/* invoke-direct {p1, v0}, Lcom/orange/oab/contactless/packid/ble/d;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public final android.bluetooth.BluetoothManager e ( android.content.Context p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/orange/oab/contactless/packid/ble/d; */
/* } */
} // .end annotation
final String v0 = "bluetooth"; // const-string v0, "bluetooth"
/* .line 1 */
(( android.content.Context ) p1 ).getSystemService ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast p1, Landroid/bluetooth/BluetoothManager; */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 2 */
} // :cond_0
/* new-instance p1, Lcom/orange/oab/contactless/packid/ble/d; */
final String v0 = "Unable to initialize BluetoothManager"; // const-string v0, "Unable to initialize BluetoothManager"
/* invoke-direct {p1, v0}, Lcom/orange/oab/contactless/packid/ble/d;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public final void f ( android.content.Context p0 ) {
/* .locals 7 */
/* .line 1 */
java.util.concurrent.Executors .newSingleThreadScheduledExecutor ( );
this.b = v0;
/* .line 2 */
/* new-instance v1, Le/h/d/a/a/g/a; */
/* invoke-direct {v1, p0, p1}, Le/h/d/a/a/g/a;-><init>(Le/h/d/a/a/g/f;Landroid/content/Context;)V */
v6 = java.util.concurrent.TimeUnit.SECONDS;
/* const-wide/16 v2, 0x0 */
/* const-wide/16 v4, 0x6 */
/* invoke-interface/range {v0 ..v6}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleWithFixedDelay(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture; */
return;
} // .end method
public final void g ( android.content.Context p0 ) {
/* .locals 5 */
final String v0 = "packid.ble.Scanner"; // const-string v0, "packid.ble.Scanner"
/* .line 1 */
v1 = this.b;
/* .line 2 */
try { // :try_start_0
v1 = this.b;
/* const-wide/16 v2, 0x14 */
v4 = java.util.concurrent.TimeUnit.SECONDS;
/* :try_end_0 */
/* .catch Ljava/lang/InterruptedException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v1 */
final String v2 = "Could not stop BLE scanner!"; // const-string v2, "Could not stop BLE scanner!"
/* .line 3 */
android.util.Log .e ( v0,v2,v1 );
/* .line 4 */
java.lang.Thread .currentThread ( );
(( java.lang.Thread ) v1 ).interrupt ( ); // invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V
/* .line 5 */
} // :goto_0
try { // :try_start_1
(( e.h.d.a.a.g.f ) p0 ).n ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/g/f;->n(Landroid/content/Context;)V
/* :try_end_1 */
/* .catch Lcom/orange/oab/contactless/packid/ble/d; {:try_start_1 ..:try_end_1} :catch_1 */
/* :catch_1 */
/* move-exception p1 */
final String v1 = "Can\'t stop scan: "; // const-string v1, "Can\'t stop scan: "
/* .line 6 */
android.util.Log .w ( v0,v1,p1 );
} // :goto_1
return;
} // .end method
public final android.bluetooth.le.BluetoothLeScanner h ( android.content.Context p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/orange/oab/contactless/packid/ble/d; */
/* } */
} // .end annotation
/* .line 1 */
(( e.h.d.a.a.g.f ) p0 ).d ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/g/f;->d(Landroid/content/Context;)Landroid/bluetooth/BluetoothAdapter;
(( android.bluetooth.BluetoothAdapter ) p1 ).getBluetoothLeScanner ( ); // invoke-virtual {p1}, Landroid/bluetooth/BluetoothAdapter;->getBluetoothLeScanner()Landroid/bluetooth/le/BluetoothLeScanner;
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 2 */
} // :cond_0
/* new-instance p1, Lcom/orange/oab/contactless/packid/ble/d; */
final String v0 = "Unable to obtain a BluetoothLeScanner"; // const-string v0, "Unable to obtain a BluetoothLeScanner"
/* invoke-direct {p1, v0}, Lcom/orange/oab/contactless/packid/ble/d;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public final Boolean i ( android.content.Context p0 ) {
/* .locals 4 */
/* .line 1 */
int v1 = 1; // const/4 v1, 0x1
int v2 = 0; // const/4 v2, 0x0
/* const/16 v3, 0x1f */
/* if-lt v0, v3, :cond_1 */
final String v0 = "android.permission.BLUETOOTH_SCAN"; // const-string v0, "android.permission.BLUETOOTH_SCAN"
/* .line 2 */
v0 = c.h.f.f .a ( p1,v0 );
/* if-nez v0, :cond_0 */
final String v0 = "android.permission.BLUETOOTH_CONNECT"; // const-string v0, "android.permission.BLUETOOTH_CONNECT"
/* .line 3 */
p1 = c.h.f.f .a ( p1,v0 );
/* if-nez p1, :cond_0 */
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
} // :cond_1
/* const/16 v3, 0x1d */
/* if-lt v0, v3, :cond_4 */
final String v0 = "android.permission.ACCESS_FINE_LOCATION"; // const-string v0, "android.permission.ACCESS_FINE_LOCATION"
/* .line 4 */
v0 = c.h.f.f .a ( p1,v0 );
if ( v0 != null) { // if-eqz v0, :cond_3
final String v0 = "android.permission.ACCESS_BACKGROUND_LOCATION"; // const-string v0, "android.permission.ACCESS_BACKGROUND_LOCATION"
/* .line 5 */
p1 = c.h.f.f .a ( p1,v0 );
/* if-nez p1, :cond_2 */
} // :cond_2
int v1 = 0; // const/4 v1, 0x0
} // :cond_3
} // :goto_1
} // :cond_4
final String v0 = "android.permission.ACCESS_COARSE_LOCATION"; // const-string v0, "android.permission.ACCESS_COARSE_LOCATION"
/* .line 6 */
p1 = c.h.f.f .a ( p1,v0 );
/* if-nez p1, :cond_5 */
} // :cond_5
int v1 = 0; // const/4 v1, 0x0
} // :goto_2
} // .end method
public final void j ( android.content.Context p0 ) {
/* .locals 2 */
/* .line 1 */
try { // :try_start_0
(( e.h.d.a.a.g.f ) p0 ).n ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/g/f;->n(Landroid/content/Context;)V
/* .line 2 */
(( e.h.d.a.a.g.f ) p0 ).m ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/g/f;->m(Landroid/content/Context;)V
/* :try_end_0 */
/* .catch Lcom/orange/oab/contactless/packid/ble/d; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p1 */
final String v0 = "packid.ble.Scanner"; // const-string v0, "packid.ble.Scanner"
final String v1 = "Can\'t restart scan: "; // const-string v1, "Can\'t restart scan: "
/* .line 3 */
android.util.Log .w ( v0,v1,p1 );
} // :goto_0
return;
} // .end method
public final java.util.ArrayList k ( android.content.Context p0 ) {
/* .locals 8 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroid/content/Context;", */
/* ")", */
/* "Ljava/util/ArrayList<", */
/* "Landroid/bluetooth/le/ScanFilter;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 1 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
/* .line 2 */
e.h.d.a.a.s.m .c ( p1 );
(( e.h.d.a.a.s.g0 ) v1 ).a ( ); // invoke-virtual {v1}, Le/h/d/a/a/s/g0;->a()Ljava/util/List;
v2 = } // :cond_0
if ( v2 != null) { // if-eqz v2, :cond_2
/* check-cast v2, Lcom/orange/oab/contactless/packid/hce/user/User; */
/* .line 3 */
v3 = (( com.orange.oab.contactless.packid.hce.user.User ) v2 ).isSimCentric ( ); // invoke-virtual {v2}, Lcom/orange/oab/contactless/packid/hce/user/User;->isSimCentric()Z
/* if-nez v3, :cond_0 */
/* .line 4 */
(( com.orange.oab.contactless.packid.hce.user.User ) v2 ).getWallet ( ); // invoke-virtual {v2}, Lcom/orange/oab/contactless/packid/hce/user/User;->getWallet()Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;
(( com.orange.oab.contactless.packid.hce.user.wallet.Wallet ) v3 ).getBadges ( ); // invoke-virtual {v3}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;->getBadges()Ljava/util/List;
} // :cond_1
v4 = } // :goto_0
if ( v4 != null) { // if-eqz v4, :cond_0
/* check-cast v4, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge; */
/* .line 5 */
v5 = e.h.d.a.a.i .a ( p1,v4 );
if ( v5 != null) { // if-eqz v5, :cond_1
e.h.d.a.a.h .c ( );
v5 = (( e.h.d.a.a.h ) v5 ).b ( v4 ); // invoke-virtual {v5, v4}, Le/h/d/a/a/h;->b(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)Z
if ( v5 != null) { // if-eqz v5, :cond_1
/* .line 6 */
/* new-instance v5, Landroid/bluetooth/le/ScanFilter$Builder; */
/* invoke-direct {v5}, Landroid/bluetooth/le/ScanFilter$Builder;-><init>()V */
/* .line 7 */
fr.mbs.binary.Octets .empty ( );
(( com.orange.oab.contactless.packid.hce.user.User ) v2 ).getContactlessId ( ); // invoke-virtual {v2}, Lcom/orange/oab/contactless/packid/hce/user/User;->getContactlessId()Lfr/mbs/binary/Octets;
(( fr.mbs.binary.Octets ) v6 ).put ( v7 ); // invoke-virtual {v6, v7}, Lfr/mbs/binary/Octets;->put(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v4 ).getZoneId ( ); // invoke-virtual {v4}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getZoneId()Lfr/mbs/binary/Octets;
(( fr.mbs.binary.Octets ) v6 ).put ( v4 ); // invoke-virtual {v6, v4}, Lfr/mbs/binary/Octets;->put(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
(( fr.mbs.binary.Octets ) v4 ).toBytes ( ); // invoke-virtual {v4}, Lfr/mbs/binary/Octets;->toBytes()[B
/* const/16 v6, 0x543 */
/* .line 8 */
(( android.bluetooth.le.ScanFilter$Builder ) v5 ).setManufacturerData ( v6, v4 ); // invoke-virtual {v5, v6, v4}, Landroid/bluetooth/le/ScanFilter$Builder;->setManufacturerData(I[B)Landroid/bluetooth/le/ScanFilter$Builder;
/* .line 9 */
(( android.bluetooth.le.ScanFilter$Builder ) v4 ).build ( ); // invoke-virtual {v4}, Landroid/bluetooth/le/ScanFilter$Builder;->build()Landroid/bluetooth/le/ScanFilter;
/* .line 10 */
(( java.util.ArrayList ) v0 ).add ( v4 ); // invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
} // :cond_2
} // .end method
public synchronized final void l ( android.content.Context p0 ) {
/* .locals 2 */
/* monitor-enter p0 */
/* .line 1 */
try { // :try_start_0
v0 = this.b;
v0 = if ( v0 != null) { // if-eqz v0, :cond_1
if ( v0 != null) { // if-eqz v0, :cond_0
} // :cond_0
final String p1 = "packid.ble.Scanner"; // const-string p1, "packid.ble.Scanner"
final String v0 = "Unexpected scanner state: scan restart schedule was asked but current executor is not terminated!"; // const-string v0, "Unexpected scanner state: scan restart schedule was asked but current executor is not terminated!"
/* .line 2 */
android.util.Log .e ( p1,v0 );
} // :cond_1
} // :goto_0
final String v0 = "packid.ble.Scanner"; // const-string v0, "packid.ble.Scanner"
final String v1 = "Scheduling scan restart every 6 seconds"; // const-string v1, "Scheduling scan restart every 6 seconds"
/* .line 3 */
android.util.Log .i ( v0,v1 );
/* .line 4 */
(( e.h.d.a.a.g.f ) p0 ).f ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/g/f;->f(Landroid/content/Context;)V
final String p1 = "packid.ble.Scanner"; // const-string p1, "packid.ble.Scanner"
final String v0 = "Scan restart scheduled"; // const-string v0, "Scan restart scheduled"
/* .line 5 */
android.util.Log .d ( p1,v0 );
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
} // :goto_1
/* monitor-exit p0 */
return;
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit p0 */
/* throw p1 */
} // .end method
public final void m ( android.content.Context p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/orange/oab/contactless/packid/ble/d; */
/* } */
} // .end annotation
/* .line 1 */
v0 = (( e.h.d.a.a.g.f ) p0 ).i ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/g/f;->i(Landroid/content/Context;)Z
final String v1 = "packid.ble.Scanner"; // const-string v1, "packid.ble.Scanner"
if ( v0 != null) { // if-eqz v0, :cond_0
final String v0 = "Starting scan"; // const-string v0, "Starting scan"
/* .line 2 */
android.util.Log .d ( v1,v0 );
int v0 = 1; // const/4 v0, 0x1
/* .line 3 */
(( e.h.d.a.a.g.f ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Le/h/d/a/a/g/f;->a(Landroid/content/Context;Z)V
final String p1 = "Scan started"; // const-string p1, "Scan started"
/* .line 4 */
android.util.Log .d ( v1,p1 );
/* .line 5 */
} // :cond_0
(( e.h.d.a.a.g.f ) p0 ).b ( ); // invoke-virtual {p0}, Le/h/d/a/a/g/f;->b()Ljava/lang/String;
android.util.Log .d ( v1,p1 );
} // :goto_0
return;
} // .end method
public final void n ( android.content.Context p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/orange/oab/contactless/packid/ble/d; */
/* } */
} // .end annotation
/* .line 1 */
v0 = (( e.h.d.a.a.g.f ) p0 ).i ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/g/f;->i(Landroid/content/Context;)Z
final String v1 = "packid.ble.Scanner"; // const-string v1, "packid.ble.Scanner"
if ( v0 != null) { // if-eqz v0, :cond_0
final String v0 = "Starting scan"; // const-string v0, "Starting scan"
/* .line 2 */
android.util.Log .d ( v1,v0 );
int v0 = 0; // const/4 v0, 0x0
/* .line 3 */
(( e.h.d.a.a.g.f ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Le/h/d/a/a/g/f;->a(Landroid/content/Context;Z)V
final String p1 = "Scan started"; // const-string p1, "Scan started"
/* .line 4 */
android.util.Log .d ( v1,p1 );
/* .line 5 */
} // :cond_0
(( e.h.d.a.a.g.f ) p0 ).b ( ); // invoke-virtual {p0}, Le/h/d/a/a/g/f;->b()Ljava/lang/String;
android.util.Log .d ( v1,p1 );
} // :goto_0
return;
} // .end method
public synchronized final void o ( android.content.Context p0 ) {
/* .locals 2 */
/* monitor-enter p0 */
/* .line 1 */
try { // :try_start_0
v0 = this.b;
v0 = if ( v0 != null) { // if-eqz v0, :cond_1
if ( v0 != null) { // if-eqz v0, :cond_0
} // :cond_0
final String v0 = "packid.ble.Scanner"; // const-string v0, "packid.ble.Scanner"
final String v1 = "Stopping scan restart scheduler"; // const-string v1, "Stopping scan restart scheduler"
/* .line 2 */
android.util.Log .i ( v0,v1 );
/* .line 3 */
(( e.h.d.a.a.g.f ) p0 ).g ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/g/f;->g(Landroid/content/Context;)V
final String p1 = "packid.ble.Scanner"; // const-string p1, "packid.ble.Scanner"
final String v0 = "Scan restart schedule stopped"; // const-string v0, "Scan restart schedule stopped"
/* .line 4 */
android.util.Log .d ( p1,v0 );
} // :cond_1
} // :goto_0
final String p1 = "packid.ble.Scanner"; // const-string p1, "packid.ble.Scanner"
final String v0 = "Unexpected scanner state: scan restart schedule stop was asked but current executor is already null or terminated!"; // const-string v0, "Unexpected scanner state: scan restart schedule stop was asked but current executor is already null or terminated!"
/* .line 5 */
android.util.Log .e ( p1,v0 );
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
} // :goto_1
/* monitor-exit p0 */
return;
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit p0 */
/* throw p1 */
} // .end method
