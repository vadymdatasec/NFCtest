public class e.h.d.a.a.g.k extends android.bluetooth.BluetoothGattCallback {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation build Landroid/annotation/SuppressLint; */
	 /* value = { */
	 /* "MissingPermission" */
	 /* } */
} // .end annotation
/* # instance fields */
public android.bluetooth.BluetoothGatt a;
public java.util.Date b;
public final e.h.d.a.a.g.v c;
public final java.util.concurrent.ScheduledExecutorService d;
public final com.orange.oab.contactless.packid.service.PackIdService e;
public Integer f;
public Integer g;
/* # direct methods */
public e.h.d.a.a.g.k ( ) {
	 /* .locals 0 */
	 /* .line 1 */
	 /* invoke-direct {p0}, Landroid/bluetooth/BluetoothGattCallback;-><init>()V */
	 /* .line 2 */
	 this.e = p1;
	 /* .line 3 */
	 this.c = p2;
	 /* .line 4 */
	 (( e.h.d.a.a.g.v ) p2 ).a ( p0 ); // invoke-virtual {p2, p0}, Le/h/d/a/a/g/v;->a(Le/h/d/a/a/g/k;)V
	 /* .line 5 */
	 java.util.concurrent.Executors .newSingleThreadScheduledExecutor ( );
	 this.d = p1;
	 return;
} // .end method
public static java.util.Date a ( Object p0 ) { //synthethic
	 /* .locals 0 */
	 /* .line 1 */
	 p0 = this.b;
} // .end method
public static java.util.Date a ( Object p0, java.util.Date p1 ) { //synthethic
	 /* .locals 0 */
	 /* .line 2 */
	 this.b = p1;
} // .end method
public static void a ( Object p0, android.bluetooth.BluetoothDevice p1 ) { //synthethic
	 /* .locals 0 */
	 /* invoke-direct {p0, p1}, Le/h/d/a/a/g/k;->c(Landroid/bluetooth/BluetoothDevice;)V */
	 return;
} // .end method
public static android.bluetooth.BluetoothGatt b ( Object p0 ) { //synthethic
	 /* .locals 0 */
	 /* .line 1 */
	 p0 = this.a;
} // .end method
private void c ( android.bluetooth.BluetoothDevice p0 ) { //synthethic
	 /* .locals 9 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 5 */
	 try { // :try_start_0
		 (( java.lang.Object ) p1 ).getClass ( ); // invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
		 /* :try_end_0 */
		 /* .catch Ljava/lang/IllegalAccessException; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* .catch Ljava/lang/NoSuchMethodException; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 ..:try_end_0} :catch_0 */
		 final String v2 = "connectGatt"; // const-string v2, "connectGatt"
		 int v3 = 4; // const/4 v3, 0x4
		 try { // :try_start_1
			 /* new-array v4, v3, [Ljava/lang/Class; */
			 /* const-class v5, Landroid/content/Context; */
			 /* aput-object v5, v4, v0 */
			 v5 = java.lang.Boolean.TYPE;
			 int v6 = 1; // const/4 v6, 0x1
			 /* aput-object v5, v4, v6 */
			 /* const-class v5, Landroid/bluetooth/BluetoothGattCallback; */
			 int v7 = 2; // const/4 v7, 0x2
			 /* aput-object v5, v4, v7 */
			 v5 = java.lang.Integer.TYPE;
			 int v8 = 3; // const/4 v8, 0x3
			 /* aput-object v5, v4, v8 */
			 (( java.lang.Class ) v1 ).getMethod ( v2, v4 ); // invoke-virtual {v1, v2, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
			 /* new-array v2, v3, [Ljava/lang/Object; */
			 /* .line 6 */
			 v3 = this.e;
			 /* aput-object v3, v2, v0 */
			 java.lang.Boolean .valueOf ( v0 );
			 /* aput-object v3, v2, v6 */
			 /* aput-object p0, v2, v7 */
			 java.lang.Integer .valueOf ( v7 );
			 /* aput-object v3, v2, v8 */
			 (( java.lang.reflect.Method ) v1 ).invoke ( p1, v2 ); // invoke-virtual {v1, p1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
			 /* check-cast v1, Landroid/bluetooth/BluetoothGatt; */
			 /* :try_end_1 */
			 /* .catch Ljava/lang/IllegalAccessException; {:try_start_1 ..:try_end_1} :catch_0 */
			 /* .catch Ljava/lang/NoSuchMethodException; {:try_start_1 ..:try_end_1} :catch_0 */
			 /* .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 ..:try_end_1} :catch_0 */
			 /* .line 7 */
			 /* :catch_0 */
			 v1 = this.e;
			 (( android.bluetooth.BluetoothDevice ) p1 ).connectGatt ( v1, v0, p0 ); // invoke-virtual {p1, v1, v0, p0}, Landroid/bluetooth/BluetoothDevice;->connectGatt(Landroid/content/Context;ZLandroid/bluetooth/BluetoothGattCallback;)Landroid/bluetooth/BluetoothGatt;
			 /* .line 8 */
		 } // :goto_0
		 (( e.h.d.a.a.g.k ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Le/h/d/a/a/g/k;->a(Landroid/bluetooth/BluetoothGatt;)V
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( android.bluetooth.BluetoothDevice p0 ) {
		 /* .locals 4 */
		 /* .line 3 */
		 /* new-instance v0, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v1 = "Connecting to "; // const-string v1, "Connecting to "
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( android.bluetooth.BluetoothDevice ) p1 ).getName ( ); // invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;
		 /* if-nez v1, :cond_0 */
		 final String v1 = "unknown"; // const-string v1, "unknown"
	 } // :cond_0
	 (( android.bluetooth.BluetoothDevice ) p1 ).getName ( ); // invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;
} // :goto_0
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
int v1 = 1; // const/4 v1, 0x1
final String v2 = "packid.ble.GattCallback"; // const-string v2, "packid.ble.GattCallback"
/* .line 4 */
com.orange.oab.contactless.packid.debug.DebugConsole .log ( v2,v0,v1 );
/* .line 5 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Connecting to gatt server with address "; // const-string v3, "Connecting to gatt server with address "
(( java.lang.StringBuilder ) v0 ).append ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( android.bluetooth.BluetoothDevice ) p1 ).getAddress ( ); // invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .i ( v2,v0 );
/* .line 6 */
/* iput v1, p0, Le/h/d/a/a/g/k;->f:I */
/* .line 7 */
(( e.h.d.a.a.g.k ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/g/k;->b(Landroid/bluetooth/BluetoothDevice;)V
return;
} // .end method
public void a ( android.bluetooth.BluetoothGatt p0 ) {
/* .locals 4 */
final String v0 = "packid.ble.GattCallback"; // const-string v0, "packid.ble.GattCallback"
final String v1 = "Scheduling timeout for GATT Connection"; // const-string v1, "Scheduling timeout for GATT Connection"
/* .line 10 */
android.util.Log .i ( v0,v1 );
/* .line 11 */
this.a = p1;
/* .line 12 */
p1 = this.b;
/* if-nez p1, :cond_0 */
/* .line 13 */
p1 = this.d;
/* new-instance v0, Le/h/d/a/a/g/j; */
int v1 = 0; // const/4 v1, 0x0
/* invoke-direct {v0, p0, v1}, Le/h/d/a/a/g/j;-><init>(Le/h/d/a/a/g/k;Le/h/d/a/a/g/i;)V */
v1 = this.c;
v1 = (( e.h.d.a.a.g.v ) v1 ).b ( ); // invoke-virtual {v1}, Le/h/d/a/a/g/v;->b()I
/* int-to-long v1, v1 */
v3 = java.util.concurrent.TimeUnit.MILLISECONDS;
} // :cond_0
return;
} // .end method
public final void a ( android.bluetooth.BluetoothGatt p0, Integer p1 ) {
/* .locals 3 */
/* .line 14 */
e.h.d.a.a.n.t .b ( );
this.b = v0;
/* .line 15 */
v0 = this.e;
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Gatt connect abort: "; // const-string v2, "Gatt connect abort: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = e.h.d.a.a.g.m.c;
(( e.h.d.a.a.g.m ) v2 ).a ( p2 ); // invoke-virtual {v2, p2}, Le/h/d/a/a/g/m;->a(I)Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
int v1 = 1; // const/4 v1, 0x1
com.orange.oab.contactless.packid.service.LogManager .e ( v0,p2,v1 );
/* .line 16 */
(( android.bluetooth.BluetoothGatt ) p1 ).close ( ); // invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->close()V
/* .line 17 */
p1 = this.c;
(( e.h.d.a.a.g.v ) p1 ).a ( ); // invoke-virtual {p1}, Le/h/d/a/a/g/v;->a()V
return;
} // .end method
public final void a ( android.bluetooth.BluetoothGatt p0, Integer p1, java.lang.String p2, java.lang.String p3, java.util.UUID p4 ) {
/* .locals 1 */
/* .line 8 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v0 ).append ( p3 ); // invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p3 = " with gatt="; // const-string p3, " with gatt="
(( java.lang.StringBuilder ) v0 ).append ( p3 ); // invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String p1 = " "; // const-string p1, " "
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p4 ); // invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p1 = "="; // const-string p1, "="
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p5 ); // invoke-virtual {v0, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String p1 = " status="; // const-string p1, " status="
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
p1 = e.h.d.a.a.g.m.c;
(( e.h.d.a.a.g.m ) p1 ).a ( p2 ); // invoke-virtual {p1, p2}, Le/h/d/a/a/g/m;->a(I)Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String p2 = "packid.ble.GattCallback"; // const-string p2, "packid.ble.GattCallback"
android.util.Log .v ( p2,p1 );
return;
} // .end method
public void a ( android.bluetooth.BluetoothGatt p0, java.lang.String p1 ) {
/* .locals 3 */
/* .line 18 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "Done "; // const-string v1, "Done "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v2 = "packid.ble.GattCallback"; // const-string v2, "packid.ble.GattCallback"
android.util.Log .i ( v2,v0 );
/* .line 19 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* const/high16 v0, -0x1000000 */
int v1 = 2; // const/4 v1, 0x2
com.orange.oab.contactless.packid.debug.DebugConsole .log ( v2,v0,p2,v1 );
/* .line 20 */
(( e.h.d.a.a.g.k ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/g/k;->b(Landroid/bluetooth/BluetoothGatt;)V
return;
} // .end method
public void a ( android.bluetooth.BluetoothGatt p0, java.lang.String p1, Integer p2, com.orange.business.packid.android.lib.TransactionErrorType p3 ) {
/* .locals 1 */
final String p4 = "packid.ble.GattCallback"; // const-string p4, "packid.ble.GattCallback"
/* .line 21 */
android.util.Log .w ( p4,p2 );
/* const/high16 v0, -0x10000 */
/* .line 22 */
com.orange.oab.contactless.packid.debug.DebugConsole .log ( p4,v0,p2,p3 );
/* .line 23 */
p2 = this.c;
(( e.h.d.a.a.g.v ) p2 ).a ( ); // invoke-virtual {p2}, Le/h/d/a/a/g/v;->a()V
/* .line 24 */
(( e.h.d.a.a.g.k ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/g/k;->b(Landroid/bluetooth/BluetoothGatt;)V
return;
} // .end method
public Boolean a ( ) {
/* .locals 2 */
/* .line 9 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* const/16 v1, 0x7d0 */
e.h.d.a.a.n.t .a ( v1 );
v0 = (( java.util.Date ) v0 ).before ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/Date;->before(Ljava/util/Date;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
	 int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public void b ( ) {
/* .locals 2 */
/* .line 9 */
v0 = this.e;
v1 = this.c;
v1 = this.c;
(( com.orange.oab.contactless.packid.service.PackIdService ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/service/PackIdService;->a(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)V
return;
} // .end method
public final void b ( android.bluetooth.BluetoothDevice p0 ) {
/* .locals 2 */
/* .line 2 */
/* new-instance v0, Landroid/os/Handler; */
v1 = this.e;
(( android.app.Service ) v1 ).getMainLooper ( ); // invoke-virtual {v1}, Landroid/app/Service;->getMainLooper()Landroid/os/Looper;
/* invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V */
/* .line 3 */
/* new-instance v1, Le/h/d/a/a/g/c; */
/* invoke-direct {v1, p0, p1}, Le/h/d/a/a/g/c;-><init>(Le/h/d/a/a/g/k;Landroid/bluetooth/BluetoothDevice;)V */
(( android.os.Handler ) v0 ).post ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
return;
} // .end method
public final void b ( android.bluetooth.BluetoothGatt p0 ) {
/* .locals 4 */
final String v0 = "packid.ble.GattCallback"; // const-string v0, "packid.ble.GattCallback"
/* .line 4 */
(( e.h.d.a.a.g.k ) p0 ).c ( ); // invoke-virtual {p0}, Le/h/d/a/a/g/k;->c()V
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 5 */
try { // :try_start_0
	 /* new-instance v1, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
	 final String v2 = "Closing GATT "; // const-string v2, "Closing GATT "
	 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 android.util.Log .i ( v0,v1 );
	 /* .line 6 */
	 (( android.bluetooth.BluetoothGatt ) p1 ).disconnect ( ); // invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->disconnect()V
	 /* :try_end_0 */
	 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* :catch_0 */
	 /* move-exception p1 */
	 /* .line 7 */
	 v1 = this.e;
	 int v2 = 1; // const/4 v2, 0x1
	 final String v3 = "GATT server disconnect error"; // const-string v3, "GATT server disconnect error"
	 com.orange.oab.contactless.packid.service.LogManager .e ( v1,v3,v2 );
	 final String v1 = "Error while closing connection"; // const-string v1, "Error while closing connection"
	 /* .line 8 */
	 android.util.Log .w ( v0,v1,p1 );
} // :cond_0
} // :goto_0
return;
} // .end method
public final void c ( ) {
/* .locals 5 */
final String v0 = "packid.ble.GattCallback"; // const-string v0, "packid.ble.GattCallback"
/* .line 9 */
v1 = this.d;
/* .line 10 */
try { // :try_start_0
v1 = this.d;
/* const-wide/16 v2, 0xa */
v1 = v4 = java.util.concurrent.TimeUnit.SECONDS;
/* if-nez v1, :cond_0 */
final String v1 = "Could not stop gattConnectionTimeoutScheduler: timed out"; // const-string v1, "Could not stop gattConnectionTimeoutScheduler: timed out"
/* .line 11 */
android.util.Log .e ( v0,v1 );
/* :try_end_0 */
/* .catch Ljava/lang/InterruptedException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v1 */
final String v2 = "Could not stop gattConnectionTimeoutScheduler:"; // const-string v2, "Could not stop gattConnectionTimeoutScheduler:"
/* .line 12 */
android.util.Log .e ( v0,v2,v1 );
/* .line 13 */
java.lang.Thread .currentThread ( );
(( java.lang.Thread ) v0 ).interrupt ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V
} // :cond_0
} // :goto_0
return;
} // .end method
public final void c ( android.bluetooth.BluetoothGatt p0 ) {
/* .locals 5 */
/* .line 1 */
v0 = this.c;
v0 = (( e.h.d.a.a.g.v ) v0 ).b ( ); // invoke-virtual {v0}, Le/h/d/a/a/g/v;->b()I
/* div-int/lit16 v0, v0, 0x3e8 */
/* .line 2 */
/* iget v1, p0, Le/h/d/a/a/g/k;->g:I */
int v2 = 1; // const/4 v2, 0x1
/* add-int/2addr v1, v2 */
/* iput v1, p0, Le/h/d/a/a/g/k;->g:I */
/* if-lt v1, v0, :cond_0 */
/* .line 3 */
v1 = this.e;
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "Waiting service to answer "; // const-string v4, "Waiting service to answer "
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v4, p0, Le/h/d/a/a/g/k;->g:I */
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v4 = "/"; // const-string v4, "/"
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.orange.oab.contactless.packid.service.LogManager .w ( v1,v0,v2 );
/* .line 4 */
v0 = this.d;
java.util.Objects .requireNonNull ( p1 );
/* new-instance v1, Le/h/d/a/a/g/b; */
/* invoke-direct {v1, p1}, Le/h/d/a/a/g/b;-><init>(Landroid/bluetooth/BluetoothGatt;)V */
p1 = java.util.concurrent.TimeUnit.MILLISECONDS;
/* const-wide/16 v2, 0x3e8 */
} // :cond_0
return;
} // .end method
public void onCharacteristicChanged ( android.bluetooth.BluetoothGatt p0, android.bluetooth.BluetoothGattCharacteristic p1 ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "onCharacteristicChanged with gatt="; // const-string v1, "onCharacteristicChanged with gatt="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v1 = " characteristic="; // const-string v1, " characteristic="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( android.bluetooth.BluetoothGattCharacteristic ) p2 ).getUuid ( ); // invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v1 = "packid.ble.GattCallback"; // const-string v1, "packid.ble.GattCallback"
android.util.Log .v ( v1,v0 );
/* .line 2 */
v0 = this.c;
(( e.h.d.a.a.g.v ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Le/h/d/a/a/g/v;->a(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V
return;
} // .end method
public void onCharacteristicRead ( android.bluetooth.BluetoothGatt p0, android.bluetooth.BluetoothGattCharacteristic p1, Integer p2 ) {
/* .locals 6 */
/* .line 1 */
(( android.bluetooth.BluetoothGattCharacteristic ) p2 ).getUuid ( ); // invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;
final String v3 = "onCharacteristicRead"; // const-string v3, "onCharacteristicRead"
final String v4 = "characteristic"; // const-string v4, "characteristic"
/* move-object v0, p0 */
/* move-object v1, p1 */
/* move v2, p3 */
/* invoke-virtual/range {v0 ..v5}, Le/h/d/a/a/g/k;->a(Landroid/bluetooth/BluetoothGatt;ILjava/lang/String;Ljava/lang/String;Ljava/util/UUID;)V */
/* if-nez p3, :cond_0 */
/* .line 2 */
p3 = this.c;
(( e.h.d.a.a.g.v ) p3 ).b ( p1, p2 ); // invoke-virtual {p3, p1, p2}, Le/h/d/a/a/g/v;->b(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V
/* .line 3 */
} // :cond_0
/* new-instance p2, Ljava/lang/StringBuilder; */
/* invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V */
final String v0 = "Read characteristic error: "; // const-string v0, "Read characteristic error: "
(( java.lang.StringBuilder ) p2 ).append ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v0 = e.h.d.a.a.g.m.c;
(( e.h.d.a.a.g.m ) v0 ).a ( p3 ); // invoke-virtual {v0, p3}, Le/h/d/a/a/g/m;->a(I)Ljava/lang/String;
(( java.lang.StringBuilder ) p2 ).append ( p3 ); // invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
p3 = com.orange.business.packid.android.lib.TransactionErrorType.READ_CHARACTERISTIC;
int v0 = 2; // const/4 v0, 0x2
(( e.h.d.a.a.g.k ) p0 ).a ( p1, p2, v0, p3 ); // invoke-virtual {p0, p1, p2, v0, p3}, Le/h/d/a/a/g/k;->a(Landroid/bluetooth/BluetoothGatt;Ljava/lang/String;ILcom/orange/business/packid/android/lib/TransactionErrorType;)V
} // :goto_0
return;
} // .end method
public void onCharacteristicWrite ( android.bluetooth.BluetoothGatt p0, android.bluetooth.BluetoothGattCharacteristic p1, Integer p2 ) {
/* .locals 6 */
/* .line 1 */
(( android.bluetooth.BluetoothGattCharacteristic ) p2 ).getUuid ( ); // invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;
final String v3 = "onCharacteristicWrite"; // const-string v3, "onCharacteristicWrite"
final String v4 = "characteristic"; // const-string v4, "characteristic"
/* move-object v0, p0 */
/* move-object v1, p1 */
/* move v2, p3 */
/* invoke-virtual/range {v0 ..v5}, Le/h/d/a/a/g/k;->a(Landroid/bluetooth/BluetoothGatt;ILjava/lang/String;Ljava/lang/String;Ljava/util/UUID;)V */
/* if-nez p3, :cond_0 */
/* .line 2 */
p3 = this.c;
(( e.h.d.a.a.g.v ) p3 ).c ( p1, p2 ); // invoke-virtual {p3, p1, p2}, Le/h/d/a/a/g/v;->c(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V
/* .line 3 */
} // :cond_0
/* new-instance p2, Ljava/lang/StringBuilder; */
/* invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V */
final String v0 = "Write characteristic error: "; // const-string v0, "Write characteristic error: "
(( java.lang.StringBuilder ) p2 ).append ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v0 = e.h.d.a.a.g.m.c;
(( e.h.d.a.a.g.m ) v0 ).a ( p3 ); // invoke-virtual {v0, p3}, Le/h/d/a/a/g/m;->a(I)Ljava/lang/String;
(( java.lang.StringBuilder ) p2 ).append ( p3 ); // invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
p3 = com.orange.business.packid.android.lib.TransactionErrorType.WRITE_DESCRIPTOR;
int v0 = 2; // const/4 v0, 0x2
(( e.h.d.a.a.g.k ) p0 ).a ( p1, p2, v0, p3 ); // invoke-virtual {p0, p1, p2, v0, p3}, Le/h/d/a/a/g/k;->a(Landroid/bluetooth/BluetoothGatt;Ljava/lang/String;ILcom/orange/business/packid/android/lib/TransactionErrorType;)V
} // :goto_0
return;
} // .end method
public void onConnectionStateChange ( android.bluetooth.BluetoothGatt p0, Integer p1, Integer p2 ) {
/* .locals 6 */
/* .line 1 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "onConnectionStateChange("; // const-string v1, "onConnectionStateChange("
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v1 = ", "; // const-string v1, ", "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = e.h.d.a.a.g.m.c;
(( e.h.d.a.a.g.m ) v2 ).a ( p2 ); // invoke-virtual {v2, p2}, Le/h/d/a/a/g/m;->a(I)Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = e.h.d.a.a.g.m.d;
(( e.h.d.a.a.g.m ) v1 ).a ( p3 ); // invoke-virtual {v1, p3}, Le/h/d/a/a/g/m;->a(I)Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = ")"; // const-string v1, ")"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v2 = "packid.ble.GattCallback"; // const-string v2, "packid.ble.GattCallback"
android.util.Log .d ( v2,v0 );
int v0 = 6; // const/4 v0, 0x6
final String v3 = "Gatt "; // const-string v3, "Gatt "
int v4 = 1; // const/4 v4, 0x1
int v5 = 2; // const/4 v5, 0x2
/* if-ne p3, v5, :cond_0 */
/* if-nez p2, :cond_0 */
/* .line 2 */
/* new-instance p2, Ljava/lang/StringBuilder; */
/* invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) p2 ).append ( v3 ); // invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = e.h.d.a.a.g.m.d;
(( e.h.d.a.a.g.m ) v1 ).a ( p3 ); // invoke-virtual {v1, p3}, Le/h/d/a/a/g/m;->a(I)Ljava/lang/String;
(( java.lang.String ) p3 ).substring ( v0 ); // invoke-virtual {p3, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;
(( java.lang.StringBuilder ) p2 ).append ( p3 ); // invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.orange.oab.contactless.packid.debug.DebugConsole .log ( v2,p2,v4 );
/* .line 3 */
(( android.bluetooth.BluetoothGatt ) p1 ).discoverServices ( ); // invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->discoverServices()Z
} // :cond_0
/* if-nez p3, :cond_1 */
/* if-nez p2, :cond_1 */
/* .line 4 */
/* new-instance p2, Ljava/lang/StringBuilder; */
/* invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) p2 ).append ( v3 ); // invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = e.h.d.a.a.g.m.d;
(( e.h.d.a.a.g.m ) v1 ).a ( p3 ); // invoke-virtual {v1, p3}, Le/h/d/a/a/g/m;->a(I)Ljava/lang/String;
(( java.lang.String ) p3 ).substring ( v0 ); // invoke-virtual {p3, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;
(( java.lang.StringBuilder ) p2 ).append ( p3 ); // invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.orange.oab.contactless.packid.debug.DebugConsole .log ( v2,p2,v4 );
/* .line 5 */
e.h.d.a.a.n.t .b ( );
this.b = p2;
/* .line 6 */
(( android.bluetooth.BluetoothGatt ) p1 ).close ( ); // invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->close()V
/* .line 7 */
} // :cond_1
/* iget p3, p0, Le/h/d/a/a/g/k;->f:I */
int v0 = 3; // const/4 v0, 0x3
/* if-gt p3, v0, :cond_2 */
/* .line 8 */
p2 = this.e;
/* new-instance p3, Ljava/lang/StringBuilder; */
/* invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Gatt not ready: try again ("; // const-string v2, "Gatt not ready: try again ("
(( java.lang.StringBuilder ) p3 ).append ( v2 ); // invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v2, p0, Le/h/d/a/a/g/k;->f:I */
(( java.lang.StringBuilder ) p3 ).append ( v2 ); // invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v2 = "/"; // const-string v2, "/"
(( java.lang.StringBuilder ) p3 ).append ( v2 ); // invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p3 ).append ( v0 ); // invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p3 ).append ( v1 ); // invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p3 ).toString ( ); // invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.orange.oab.contactless.packid.service.LogManager .w ( p2,p3,v4 );
/* .line 9 */
/* iget p2, p0, Le/h/d/a/a/g/k;->f:I */
/* add-int/2addr p2, v4 */
/* iput p2, p0, Le/h/d/a/a/g/k;->f:I */
/* .line 10 */
(( android.bluetooth.BluetoothGatt ) p1 ).connect ( ); // invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->connect()Z
/* .line 11 */
} // :cond_2
(( e.h.d.a.a.g.k ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/h/d/a/a/g/k;->a(Landroid/bluetooth/BluetoothGatt;I)V
} // :goto_0
return;
} // .end method
public void onDescriptorWrite ( android.bluetooth.BluetoothGatt p0, android.bluetooth.BluetoothGattDescriptor p1, Integer p2 ) {
/* .locals 6 */
/* .line 1 */
(( android.bluetooth.BluetoothGattDescriptor ) p2 ).getUuid ( ); // invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattDescriptor;->getUuid()Ljava/util/UUID;
final String v3 = "onDescriptorWrite"; // const-string v3, "onDescriptorWrite"
final String v4 = "descriptor"; // const-string v4, "descriptor"
/* move-object v0, p0 */
/* move-object v1, p1 */
/* move v2, p3 */
/* invoke-virtual/range {v0 ..v5}, Le/h/d/a/a/g/k;->a(Landroid/bluetooth/BluetoothGatt;ILjava/lang/String;Ljava/lang/String;Ljava/util/UUID;)V */
/* if-nez p3, :cond_0 */
/* .line 2 */
p3 = this.c;
(( e.h.d.a.a.g.v ) p3 ).a ( p1, p2 ); // invoke-virtual {p3, p1, p2}, Le/h/d/a/a/g/v;->a(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;)V
/* .line 3 */
} // :cond_0
/* new-instance p2, Ljava/lang/StringBuilder; */
/* invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V */
final String v0 = "Write descriptor error: "; // const-string v0, "Write descriptor error: "
(( java.lang.StringBuilder ) p2 ).append ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v0 = e.h.d.a.a.g.m.c;
(( e.h.d.a.a.g.m ) v0 ).a ( p3 ); // invoke-virtual {v0, p3}, Le/h/d/a/a/g/m;->a(I)Ljava/lang/String;
(( java.lang.StringBuilder ) p2 ).append ( p3 ); // invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
p3 = com.orange.business.packid.android.lib.TransactionErrorType.WRITE_DESCRIPTOR;
int v0 = 2; // const/4 v0, 0x2
(( e.h.d.a.a.g.k ) p0 ).a ( p1, p2, v0, p3 ); // invoke-virtual {p0, p1, p2, v0, p3}, Le/h/d/a/a/g/k;->a(Landroid/bluetooth/BluetoothGatt;Ljava/lang/String;ILcom/orange/business/packid/android/lib/TransactionErrorType;)V
} // :goto_0
return;
} // .end method
public void onServicesDiscovered ( android.bluetooth.BluetoothGatt p0, Integer p1 ) {
/* .locals 0 */
/* .line 1 */
p2 = this.c;
(( e.h.d.a.a.g.v ) p2 ).a ( p1 ); // invoke-virtual {p2, p1}, Le/h/d/a/a/g/v;->a(Landroid/bluetooth/BluetoothGatt;)Landroid/bluetooth/BluetoothGattService;
if ( p2 != null) { // if-eqz p2, :cond_0
/* .line 2 */
p2 = this.c;
(( e.h.d.a.a.g.v ) p2 ).b ( p1 ); // invoke-virtual {p2, p1}, Le/h/d/a/a/g/v;->b(Landroid/bluetooth/BluetoothGatt;)V
int p1 = 0; // const/4 p1, 0x0
/* .line 3 */
/* iput p1, p0, Le/h/d/a/a/g/k;->g:I */
/* .line 4 */
} // :cond_0
(( e.h.d.a.a.g.k ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/g/k;->c(Landroid/bluetooth/BluetoothGatt;)V
} // :goto_0
return;
} // .end method
