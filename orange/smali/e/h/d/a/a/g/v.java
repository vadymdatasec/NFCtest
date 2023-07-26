public abstract class e.h.d.a.a.g.v {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final java.util.UUID g;
	 /* # instance fields */
	 public final android.content.Context a;
	 public final e.h.d.a.a.n.w.c b;
	 public final com.orange.oab.contactless.packid.hce.user.wallet.Badge c;
	 public final com.orange.oab.contactless.packid.hce.user.User d;
	 public final java.util.UUID e;
	 public e.h.d.a.a.g.k f;
	 /* # direct methods */
	 public static e.h.d.a.a.g.v ( ) {
		 /* .locals 1 */
		 final String v0 = "00002902-0000-1000-8000-00805f9b34fb"; // const-string v0, "00002902-0000-1000-8000-00805f9b34fb"
		 /* .line 1 */
		 java.util.UUID .fromString ( v0 );
		 return;
	 } // .end method
	 public e.h.d.a.a.g.v ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.a = p1;
		 /* .line 3 */
		 this.b = p2;
		 /* .line 4 */
		 this.c = p3;
		 /* .line 5 */
		 this.d = p4;
		 /* .line 6 */
		 this.e = p5;
		 return;
	 } // .end method
	 public static e.h.d.a.a.g.v a ( Object p0, com.orange.oab.contactless.packid.hce.user.User p1, com.orange.oab.contactless.packid.hce.user.wallet.Badge p2, android.content.Context p3 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = 		 (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p2 ).isToken ( ); // invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->isToken()Z
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 /* .line 2 */
			 v0 = 			 (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p2 ).isSecured ( ); // invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->isSecured()Z
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 /* .line 3 */
				 /* new-instance v0, Le/h/d/a/a/g/u; */
				 /* invoke-direct {v0, p3, p0, p2, p1}, Le/h/d/a/a/g/u;-><init>(Landroid/content/Context;Le/h/d/a/a/n/w/c;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Lcom/orange/oab/contactless/packid/hce/user/User;)V */
				 /* .line 4 */
			 } // :cond_0
			 /* new-instance v0, Le/h/d/a/a/g/t; */
			 /* invoke-direct {v0, p3, p0, p2, p1}, Le/h/d/a/a/g/t;-><init>(Landroid/content/Context;Le/h/d/a/a/n/w/c;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Lcom/orange/oab/contactless/packid/hce/user/User;)V */
			 /* .line 5 */
		 } // :cond_1
		 v0 = 		 (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p2 ).isSecured ( ); // invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->isSecured()Z
		 if ( v0 != null) { // if-eqz v0, :cond_2
			 /* .line 6 */
			 /* new-instance v0, Le/h/d/a/a/g/s; */
			 /* invoke-direct {v0, p3, p0, p2, p1}, Le/h/d/a/a/g/s;-><init>(Landroid/content/Context;Le/h/d/a/a/n/w/c;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Lcom/orange/oab/contactless/packid/hce/user/User;)V */
			 /* .line 7 */
		 } // :cond_2
		 /* new-instance v0, Le/h/d/a/a/g/t; */
		 /* invoke-direct {v0, p3, p0, p2, p1}, Le/h/d/a/a/g/t;-><init>(Landroid/content/Context;Le/h/d/a/a/n/w/c;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Lcom/orange/oab/contactless/packid/hce/user/User;)V */
	 } // .end method
	 /* # virtual methods */
	 public android.bluetooth.BluetoothGattService a ( android.bluetooth.BluetoothGatt p0 ) {
		 /* .locals 1 */
		 /* .line 15 */
		 v0 = this.e;
		 (( android.bluetooth.BluetoothGatt ) p1 ).getService ( v0 ); // invoke-virtual {p1, v0}, Landroid/bluetooth/BluetoothGatt;->getService(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattService;
	 } // .end method
	 public java.lang.String a ( java.lang.String p0 ) {
		 /* .locals 2 */
		 if ( p1 != null) { // if-eqz p1, :cond_2
			 /* .line 40 */
			 v0 = 			 (( java.lang.String ) p1 ).isEmpty ( ); // invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 /* .line 41 */
			 } // :cond_0
			 (( e.h.d.a.a.g.v ) p0 ).g ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/g/v;->g(Ljava/lang/String;)Ljava/lang/String;
			 /* .line 42 */
			 v1 = 			 (( java.lang.String ) v0 ).isEmpty ( ); // invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z
			 if ( v1 != null) { // if-eqz v1, :cond_1
			 } // :cond_1
			 /* move-object p1, v0 */
		 } // :goto_0
	 } // :cond_2
} // :goto_1
int p1 = 0; // const/4 p1, 0x0
} // .end method
public final java.lang.String a ( java.util.List p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/List<", */
/* "Ljava/lang/String;", */
/* ">;)", */
/* "Ljava/lang/String;" */
/* } */
} // .end annotation
final String v0 = " "; // const-string v0, " "
/* .line 43 */
m.a.a.c.e .a ( p1,v0 );
final String v0 = ",$"; // const-string v0, ",$"
final String v1 = ""; // const-string v1, ""
(( java.lang.String ) p1 ).replaceAll ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
} // .end method
public void a ( ) {
/* .locals 3 */
/* .line 45 */
/* new-instance v0, Le/h/d/a/a/r/a; */
v1 = this.a;
/* invoke-direct {v0, v1}, Le/h/d/a/a/r/a;-><init>(Landroid/content/Context;)V */
v1 = this.d;
(( com.orange.oab.contactless.packid.hce.user.User ) v1 ).getContactlessId ( ); // invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->getContactlessId()Lfr/mbs/binary/Octets;
v2 = this.c;
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v2 ).getZoneId ( ); // invoke-virtual {v2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getZoneId()Lfr/mbs/binary/Octets;
(( e.h.d.a.a.r.a ) v0 ).b ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Le/h/d/a/a/r/a;->b(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)V
return;
} // .end method
public void a ( android.bluetooth.BluetoothGatt p0, android.bluetooth.BluetoothGattCharacteristic p1 ) {
/* .locals 2 */
/* .line 13 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "recv NOTIF "; // const-string v1, "recv NOTIF "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
e.h.d.a.a.g.o .b ( p2 );
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v1 = "packid.ble.Writer"; // const-string v1, "packid.ble.Writer"
com.orange.oab.contactless.packid.debug.DebugConsole .log ( v1,v0 );
/* .line 14 */
(( e.h.d.a.a.g.v ) p0 ).d ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/h/d/a/a/g/v;->d(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V
return;
} // .end method
public void a ( android.bluetooth.BluetoothGatt p0, android.bluetooth.BluetoothGattDescriptor p1 ) {
/* .locals 2 */
/* .line 16 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "recv DESC WRITE "; // const-string v1, "recv DESC WRITE "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( android.bluetooth.BluetoothGattDescriptor ) p2 ).getCharacteristic ( ); // invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattDescriptor;->getCharacteristic()Landroid/bluetooth/BluetoothGattCharacteristic;
e.h.d.a.a.g.o .b ( v1 );
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v1 = "packid.ble.Writer"; // const-string v1, "packid.ble.Writer"
com.orange.oab.contactless.packid.debug.DebugConsole .log ( v1,v0 );
/* .line 17 */
(( android.bluetooth.BluetoothGattDescriptor ) p2 ).getCharacteristic ( ); // invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattDescriptor;->getCharacteristic()Landroid/bluetooth/BluetoothGattCharacteristic;
(( android.bluetooth.BluetoothGattCharacteristic ) p2 ).getUuid ( ); // invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;
v0 = e.h.d.a.a.g.o.h;
(( e.h.d.a.a.g.o ) v0 ).b ( ); // invoke-virtual {v0}, Le/h/d/a/a/g/o;->b()Ljava/util/UUID;
p2 = (( java.util.UUID ) p2 ).equals ( v0 ); // invoke-virtual {p2, v0}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z
if ( p2 != null) { // if-eqz p2, :cond_0
/* .line 18 */
(( e.h.d.a.a.g.v ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/g/v;->a(Landroid/bluetooth/BluetoothGatt;)Landroid/bluetooth/BluetoothGattService;
(( e.h.d.a.a.g.v ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/h/d/a/a/g/v;->a(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattService;)V
} // :cond_0
return;
} // .end method
public abstract void a ( android.bluetooth.BluetoothGatt p0, android.bluetooth.BluetoothGattService p1 ) {
} // .end method
public void a ( android.bluetooth.BluetoothGatt p0, Object p1 ) {
/* .locals 3 */
/* .annotation build Landroid/annotation/SuppressLint; */
/* value = { */
/* "MissingPermission" */
/* } */
} // .end annotation
/* .line 19 */
(( e.h.d.a.a.g.v ) p0 ).d ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/h/d/a/a/g/v;->d(Landroid/bluetooth/BluetoothGatt;Le/h/d/a/a/g/o;)Landroid/bluetooth/BluetoothGattCharacteristic;
/* if-nez v0, :cond_0 */
return;
} // :cond_0
int v1 = 1; // const/4 v1, 0x1
/* .line 20 */
(( android.bluetooth.BluetoothGatt ) p1 ).setCharacteristicNotification ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroid/bluetooth/BluetoothGatt;->setCharacteristicNotification(Landroid/bluetooth/BluetoothGattCharacteristic;Z)Z
/* .line 21 */
v1 = e.h.d.a.a.g.v.g;
(( android.bluetooth.BluetoothGattCharacteristic ) v0 ).getDescriptor ( v1 ); // invoke-virtual {v0, v1}, Landroid/bluetooth/BluetoothGattCharacteristic;->getDescriptor(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattDescriptor;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 22 */
v1 = android.bluetooth.BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE;
(( android.bluetooth.BluetoothGattDescriptor ) v0 ).setValue ( v1 ); // invoke-virtual {v0, v1}, Landroid/bluetooth/BluetoothGattDescriptor;->setValue([B)Z
/* .line 23 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "send WRITE DESC "; // const-string v2, "send WRITE DESC "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( e.h.d.a.a.g.o ) p2 ).a ( ); // invoke-virtual {p2}, Le/h/d/a/a/g/o;->a()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v1 = "packid.ble.Writer"; // const-string v1, "packid.ble.Writer"
com.orange.oab.contactless.packid.debug.DebugConsole .log ( v1,p2 );
/* .line 24 */
(( android.bluetooth.BluetoothGatt ) p1 ).writeDescriptor ( v0 ); // invoke-virtual {p1, v0}, Landroid/bluetooth/BluetoothGatt;->writeDescriptor(Landroid/bluetooth/BluetoothGattDescriptor;)Z
} // :cond_1
return;
} // .end method
public final void a ( android.bluetooth.BluetoothGatt p0, java.lang.String p1 ) {
/* .locals 3 */
/* .line 8 */
v0 = this.f;
v1 = com.orange.business.packid.android.lib.TransactionErrorType.ABORT;
int v2 = 1; // const/4 v2, 0x1
(( e.h.d.a.a.g.k ) v0 ).a ( p1, p2, v2, v1 ); // invoke-virtual {v0, p1, p2, v2, v1}, Le/h/d/a/a/g/k;->a(Landroid/bluetooth/BluetoothGatt;Ljava/lang/String;ILcom/orange/business/packid/android/lib/TransactionErrorType;)V
return;
} // .end method
public final void a ( android.bluetooth.BluetoothGattCharacteristic p0, android.bluetooth.BluetoothDevice p1 ) {
/* .locals 3 */
/* .line 25 */
/* new-instance v0, Ljava/lang/String; */
(( android.bluetooth.BluetoothGattCharacteristic ) p1 ).getValue ( ); // invoke-virtual {p1}, Landroid/bluetooth/BluetoothGattCharacteristic;->getValue()[B
v2 = java.nio.charset.StandardCharsets.UTF_8;
/* invoke-direct {v0, v1, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V */
/* .line 26 */
(( android.bluetooth.BluetoothGattCharacteristic ) p1 ).getValue ( ); // invoke-virtual {p1}, Landroid/bluetooth/BluetoothGattCharacteristic;->getValue()[B
(( e.h.d.a.a.g.v ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/g/v;->a([B)V
/* .line 27 */
(( e.h.d.a.a.g.v ) p0 ).e ( v0 ); // invoke-virtual {p0, v0}, Le/h/d/a/a/g/v;->e(Ljava/lang/String;)Ljava/lang/String;
/* .line 28 */
(( e.h.d.a.a.g.v ) p0 ).d ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/g/v;->d(Ljava/lang/String;)Ljava/lang/String;
(( e.h.d.a.a.g.v ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/g/v;->a(Ljava/lang/String;)Ljava/lang/String;
/* .line 29 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "message received: "; // const-string v1, "message received: "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v1 = "packid.ble.Writer"; // const-string v1, "packid.ble.Writer"
android.util.Log .i ( v1,v0 );
/* .line 30 */
v0 = this.f;
(( e.h.d.a.a.g.k ) v0 ).b ( ); // invoke-virtual {v0}, Le/h/d/a/a/g/k;->b()V
/* .line 31 */
/* new-instance v0, Le/h/d/a/a/r/a; */
v1 = this.a;
/* invoke-direct {v0, v1}, Le/h/d/a/a/r/a;-><init>(Landroid/content/Context;)V */
v1 = this.d;
v2 = this.c;
(( e.h.d.a.a.r.a ) v0 ).a ( v1, v2, p2, p1 ); // invoke-virtual {v0, v1, v2, p2, p1}, Le/h/d/a/a/r/a;->a(Lcom/orange/oab/contactless/packid/hce/user/User;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;)V
return;
} // .end method
public void a ( Object p0 ) {
/* .locals 0 */
/* .line 44 */
this.f = p1;
return;
} // .end method
public final void a ( Object[] p0 ) {
/* .locals 3 */
/* .line 32 */
/* array-length v0, p1 */
int v1 = 3; // const/4 v1, 0x3
/* if-ge v0, v1, :cond_0 */
return;
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 33 */
fr.mbs.binary.Octets .createOctets ( p1 );
/* .line 34 */
v1 = java.nio.charset.StandardCharsets.UTF_8;
final String v2 = "#UL"; // const-string v2, "#UL"
(( java.lang.String ) v2 ).getBytes ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B
fr.mbs.binary.Octets .createOctets ( v1 );
/* .line 35 */
v2 = (( fr.mbs.binary.Octets ) v1 ).size ( ); // invoke-virtual {v1}, Lfr/mbs/binary/Octets;->size()I
(( fr.mbs.binary.Octets ) p1 ).pop ( v2 ); // invoke-virtual {p1, v2}, Lfr/mbs/binary/Octets;->pop(I)Lfr/mbs/binary/Octets;
/* .line 36 */
(( fr.mbs.binary.Octets ) v1 ).toHexa ( ); // invoke-virtual {v1}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;
(( fr.mbs.binary.Octets ) v2 ).toHexa ( ); // invoke-virtual {v2}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;
v1 = (( java.lang.String ) v1 ).equals ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 37 */
(( fr.mbs.binary.Octets ) p1 ).toHexa ( ); // invoke-virtual {p1}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;
/* .line 38 */
/* new-instance p1, Ljava/lang/StringBuilder; */
/* invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "#unlock id to unlock : "; // const-string v1, "#unlock id to unlock : "
(( java.lang.StringBuilder ) p1 ).append ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p1 ).append ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v1 = "packid.ble.Writer"; // const-string v1, "packid.ble.Writer"
android.util.Log .d ( v1,p1 );
/* .line 39 */
} // :cond_1
(( e.h.d.a.a.g.v ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Le/h/d/a/a/g/v;->b(Ljava/lang/String;)V
return;
} // .end method
public Boolean a ( android.bluetooth.BluetoothGatt p0, Object p1, fr.mbs.binary.Octets p2 ) {
/* .locals 2 */
/* .annotation build Landroid/annotation/SuppressLint; */
/* value = { */
/* "MissingPermission" */
/* } */
} // .end annotation
/* .line 9 */
(( e.h.d.a.a.g.v ) p0 ).d ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/h/d/a/a/g/v;->d(Landroid/bluetooth/BluetoothGatt;Le/h/d/a/a/g/o;)Landroid/bluetooth/BluetoothGattCharacteristic;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 10 */
(( fr.mbs.binary.Octets ) p3 ).toBytes ( ); // invoke-virtual {p3}, Lfr/mbs/binary/Octets;->toBytes()[B
(( android.bluetooth.BluetoothGattCharacteristic ) v0 ).setValue ( p3 ); // invoke-virtual {v0, p3}, Landroid/bluetooth/BluetoothGattCharacteristic;->setValue([B)Z
/* .line 11 */
/* new-instance p3, Ljava/lang/StringBuilder; */
/* invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "send WRITE "; // const-string v1, "send WRITE "
(( java.lang.StringBuilder ) p3 ).append ( v1 ); // invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( e.h.d.a.a.g.o ) p2 ).a ( ); // invoke-virtual {p2}, Le/h/d/a/a/g/o;->a()Ljava/lang/String;
(( java.lang.StringBuilder ) p3 ).append ( p2 ); // invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p3 ).toString ( ); // invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String p3 = "packid.ble.Writer"; // const-string p3, "packid.ble.Writer"
com.orange.oab.contactless.packid.debug.DebugConsole .log ( p3,p2 );
/* .line 12 */
p1 = (( android.bluetooth.BluetoothGatt ) p1 ).writeCharacteristic ( v0 ); // invoke-virtual {p1, v0}, Landroid/bluetooth/BluetoothGatt;->writeCharacteristic(Landroid/bluetooth/BluetoothGattCharacteristic;)Z
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // .end method
public Integer b ( ) {
/* .locals 1 */
/* .line 13 */
v0 = this.c;
v0 = (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v0 ).getGattConnectionTimeoutMs ( ); // invoke-virtual {v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getGattConnectionTimeoutMs()I
} // .end method
public void b ( android.bluetooth.BluetoothGatt p0 ) {
/* .locals 4 */
/* .line 5 */
v0 = this.e;
(( android.bluetooth.BluetoothGatt ) p1 ).getService ( v0 ); // invoke-virtual {p1, v0}, Landroid/bluetooth/BluetoothGatt;->getService(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattService;
final String v1 = "Service "; // const-string v1, "Service "
/* if-nez v0, :cond_0 */
/* .line 6 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.e;
e.h.d.a.a.g.o .b ( v1 );
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = " not found"; // const-string v1, " not found"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( e.h.d.a.a.g.v ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Le/h/d/a/a/g/v;->a(Landroid/bluetooth/BluetoothGatt;Ljava/lang/String;)V
/* .line 7 */
} // :cond_0
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.e;
e.h.d.a.a.g.o .b ( v1 );
(( java.lang.StringBuilder ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = " OK"; // const-string v1, " OK"
(( java.lang.StringBuilder ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
int v2 = 1; // const/4 v2, 0x1
final String v3 = "packid.ble.Writer"; // const-string v3, "packid.ble.Writer"
com.orange.oab.contactless.packid.debug.DebugConsole .log ( v3,v1,v2 );
/* .line 8 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Send "; // const-string v2, "Send "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.c;
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v2 ).getDescription ( ); // invoke-virtual {v2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getDescription()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
int v2 = 2; // const/4 v2, 0x2
com.orange.oab.contactless.packid.debug.DebugConsole .log ( v3,v1,v2 );
/* .line 9 */
v1 = e.h.d.a.a.g.o.h;
v1 = (( e.h.d.a.a.g.v ) p0 ).b ( p1, v1 ); // invoke-virtual {p0, p1, v1}, Le/h/d/a/a/g/v;->b(Landroid/bluetooth/BluetoothGatt;Le/h/d/a/a/g/o;)Z
if ( v1 != null) { // if-eqz v1, :cond_1
final String v0 = "has CHARACTERISTIC_UUID_READER_RESULT property notify"; // const-string v0, "has CHARACTERISTIC_UUID_READER_RESULT property notify"
/* .line 10 */
android.util.Log .i ( v3,v0 );
/* .line 11 */
v0 = e.h.d.a.a.g.o.h;
(( e.h.d.a.a.g.v ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Le/h/d/a/a/g/v;->a(Landroid/bluetooth/BluetoothGatt;Le/h/d/a/a/g/o;)V
/* .line 12 */
} // :cond_1
(( e.h.d.a.a.g.v ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Le/h/d/a/a/g/v;->a(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattService;)V
} // :goto_0
return;
} // .end method
public void b ( android.bluetooth.BluetoothGatt p0, android.bluetooth.BluetoothGattCharacteristic p1 ) {
/* .locals 2 */
/* .line 3 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "recv READ "; // const-string v1, "recv READ "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
e.h.d.a.a.g.o .b ( p2 );
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v1 = "packid.ble.Writer"; // const-string v1, "packid.ble.Writer"
com.orange.oab.contactless.packid.debug.DebugConsole .log ( v1,v0 );
/* .line 4 */
(( e.h.d.a.a.g.v ) p0 ).e ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/h/d/a/a/g/v;->e(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V
return;
} // .end method
public abstract void b ( java.lang.String p0 ) {
} // .end method
public Boolean b ( android.bluetooth.BluetoothGatt p0, Object p1 ) {
/* .locals 0 */
/* .line 1 */
(( e.h.d.a.a.g.v ) p0 ).d ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/h/d/a/a/g/v;->d(Landroid/bluetooth/BluetoothGatt;Le/h/d/a/a/g/o;)Landroid/bluetooth/BluetoothGattCharacteristic;
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 2 */
p1 = (( android.bluetooth.BluetoothGattCharacteristic ) p1 ).getProperties ( ); // invoke-virtual {p1}, Landroid/bluetooth/BluetoothGattCharacteristic;->getProperties()I
/* and-int/lit8 p1, p1, 0x10 */
if ( p1 != null) { // if-eqz p1, :cond_0
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
public final java.util.List c ( java.lang.String p0 ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/String;", */
/* ")", */
/* "Ljava/util/List<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 10 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
final String v1 = "(?=#)"; // const-string v1, "(?=#)"
/* .line 11 */
(( java.lang.String ) p1 ).split ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
/* array-length v1, p1 */
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v2, v1, :cond_2 */
/* aget-object v3, p1, v2 */
/* .line 12 */
v4 = (( java.lang.String ) v3 ).isEmpty ( ); // invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z
/* if-nez v4, :cond_1 */
final String v4 = "#"; // const-string v4, "#"
/* .line 13 */
v4 = (( java.lang.String ) v3 ).startsWith ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
if ( v4 != null) { // if-eqz v4, :cond_0
(( e.h.d.a.a.g.v ) p0 ).f ( v3 ); // invoke-virtual {p0, v3}, Le/h/d/a/a/g/v;->f(Ljava/lang/String;)Ljava/lang/String;
} // :cond_0
} // :cond_1
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_2
} // .end method
public void c ( android.bluetooth.BluetoothGatt p0 ) {
/* .locals 2 */
/* .line 6 */
v0 = e.h.d.a.a.g.o.h;
v0 = (( e.h.d.a.a.g.v ) p0 ).b ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Le/h/d/a/a/g/v;->b(Landroid/bluetooth/BluetoothGatt;Le/h/d/a/a/g/o;)Z
final String v1 = "packid.ble.Writer"; // const-string v1, "packid.ble.Writer"
if ( v0 != null) { // if-eqz v0, :cond_0
final String p1 = "Reader result characteristic has notify property, waiting for notification"; // const-string p1, "Reader result characteristic has notify property, waiting for notification"
/* .line 7 */
android.util.Log .i ( v1,p1 );
} // :cond_0
final String v0 = "Reader result characteristic does not have notify property, reading characteristic"; // const-string v0, "Reader result characteristic does not have notify property, reading characteristic"
/* .line 8 */
android.util.Log .i ( v1,v0 );
/* .line 9 */
v0 = e.h.d.a.a.g.o.h;
(( e.h.d.a.a.g.v ) p0 ).c ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Le/h/d/a/a/g/v;->c(Landroid/bluetooth/BluetoothGatt;Le/h/d/a/a/g/o;)V
} // :goto_0
return;
} // .end method
public void c ( android.bluetooth.BluetoothGatt p0, android.bluetooth.BluetoothGattCharacteristic p1 ) {
/* .locals 2 */
/* .line 4 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "recv WRITE "; // const-string v1, "recv WRITE "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
e.h.d.a.a.g.o .b ( p2 );
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v1 = "packid.ble.Writer"; // const-string v1, "packid.ble.Writer"
com.orange.oab.contactless.packid.debug.DebugConsole .log ( v1,v0 );
/* .line 5 */
(( e.h.d.a.a.g.v ) p0 ).f ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/h/d/a/a/g/v;->f(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V
return;
} // .end method
public void c ( android.bluetooth.BluetoothGatt p0, Object p1 ) {
/* .locals 3 */
/* .annotation build Landroid/annotation/SuppressLint; */
/* value = { */
/* "MissingPermission" */
/* } */
} // .end annotation
/* .line 1 */
(( e.h.d.a.a.g.v ) p0 ).d ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/h/d/a/a/g/v;->d(Landroid/bluetooth/BluetoothGatt;Le/h/d/a/a/g/o;)Landroid/bluetooth/BluetoothGattCharacteristic;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "send READ "; // const-string v2, "send READ "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( e.h.d.a.a.g.o ) p2 ).a ( ); // invoke-virtual {p2}, Le/h/d/a/a/g/o;->a()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v1 = "packid.ble.Writer"; // const-string v1, "packid.ble.Writer"
com.orange.oab.contactless.packid.debug.DebugConsole .log ( v1,p2 );
/* .line 3 */
(( android.bluetooth.BluetoothGatt ) p1 ).readCharacteristic ( v0 ); // invoke-virtual {p1, v0}, Landroid/bluetooth/BluetoothGatt;->readCharacteristic(Landroid/bluetooth/BluetoothGattCharacteristic;)Z
} // :cond_0
return;
} // .end method
public final android.bluetooth.BluetoothGattCharacteristic d ( android.bluetooth.BluetoothGatt p0, Object p1 ) {
/* .locals 4 */
/* .line 3 */
v0 = this.e;
(( android.bluetooth.BluetoothGatt ) p1 ).getService ( v0 ); // invoke-virtual {p1, v0}, Landroid/bluetooth/BluetoothGatt;->getService(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattService;
final String v1 = " not found"; // const-string v1, " not found"
/* if-nez v0, :cond_0 */
/* .line 4 */
/* new-instance p2, Ljava/lang/StringBuilder; */
/* invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V */
final String v0 = "Service "; // const-string v0, "Service "
(( java.lang.StringBuilder ) p2 ).append ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v0 = this.e;
e.h.d.a.a.g.o .b ( v0 );
(( java.lang.StringBuilder ) p2 ).append ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).append ( v1 ); // invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( e.h.d.a.a.g.v ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/h/d/a/a/g/v;->a(Landroid/bluetooth/BluetoothGatt;Ljava/lang/String;)V
int p1 = 0; // const/4 p1, 0x0
/* .line 5 */
} // :cond_0
(( e.h.d.a.a.g.o ) p2 ).b ( ); // invoke-virtual {p2}, Le/h/d/a/a/g/o;->b()Ljava/util/UUID;
(( android.bluetooth.BluetoothGattService ) v0 ).getCharacteristic ( v2 ); // invoke-virtual {v0, v2}, Landroid/bluetooth/BluetoothGattService;->getCharacteristic(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattCharacteristic;
/* if-nez v0, :cond_1 */
/* .line 6 */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Characteristic "; // const-string v3, "Characteristic "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( e.h.d.a.a.g.o ) p2 ).a ( ); // invoke-virtual {p2}, Le/h/d/a/a/g/o;->a()Ljava/lang/String;
(( java.lang.StringBuilder ) v2 ).append ( p2 ); // invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( e.h.d.a.a.g.v ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/h/d/a/a/g/v;->a(Landroid/bluetooth/BluetoothGatt;Ljava/lang/String;)V
} // :cond_1
} // .end method
public final java.lang.String d ( java.lang.String p0 ) {
/* .locals 2 */
final String v0 = "\\p{C}"; // const-string v0, "\\p{C}"
final String v1 = " "; // const-string v1, " "
/* .line 7 */
(( java.lang.String ) p1 ).replaceAll ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
} // .end method
public void d ( android.bluetooth.BluetoothGatt p0, android.bluetooth.BluetoothGattCharacteristic p1 ) {
/* .locals 2 */
/* .line 1 */
(( android.bluetooth.BluetoothGattCharacteristic ) p2 ).getUuid ( ); // invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;
v1 = e.h.d.a.a.g.o.h;
(( e.h.d.a.a.g.o ) v1 ).b ( ); // invoke-virtual {v1}, Le/h/d/a/a/g/o;->b()Ljava/util/UUID;
v0 = (( java.util.UUID ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( e.h.d.a.a.g.v ) p0 ).e ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/h/d/a/a/g/v;->e(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V
} // :cond_0
return;
} // .end method
public final java.lang.String e ( java.lang.String p0 ) {
/* .locals 6 */
final String v0 = "#UL"; // const-string v0, "#UL"
/* .line 5 */
v0 = (( java.lang.String ) p1 ).contains ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 6 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "#"; // const-string v1, "#"
/* .line 7 */
(( java.lang.String ) p1 ).split ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
/* .line 8 */
/* array-length v2, p1 */
int v3 = 0; // const/4 v3, 0x0
} // :goto_0
/* if-ge v3, v2, :cond_1 */
/* aget-object v4, p1, v3 */
/* .line 9 */
v5 = (( java.lang.String ) v4 ).isEmpty ( ); // invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z
/* if-nez v5, :cond_0 */
final String v5 = "UL"; // const-string v5, "UL"
v5 = (( java.lang.String ) v4 ).startsWith ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
/* if-nez v5, :cond_0 */
/* .line 10 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( v4 ); // invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
} // :cond_0
/* add-int/lit8 v3, v3, 0x1 */
/* .line 11 */
} // :cond_1
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // :cond_2
} // .end method
public void e ( android.bluetooth.BluetoothGatt p0, android.bluetooth.BluetoothGattCharacteristic p1 ) {
/* .locals 7 */
/* .line 1 */
(( android.bluetooth.BluetoothGattCharacteristic ) p2 ).getUuid ( ); // invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;
v1 = e.h.d.a.a.g.o.h;
(( e.h.d.a.a.g.o ) v1 ).b ( ); // invoke-virtual {v1}, Le/h/d/a/a/g/o;->b()Ljava/util/UUID;
v0 = (( java.util.UUID ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( e.h.d.a.a.g.v ) p0 ).g ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/h/d/a/a/g/v;->g(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V
/* .line 3 */
} // :cond_0
/* new-instance v1, Le/h/d/a/a/w/g; */
/* invoke-direct {v1}, Le/h/d/a/a/w/g;-><init>()V */
v2 = this.a;
v3 = this.d;
v4 = this.c;
final String v5 = "KO"; // const-string v5, "KO"
final String v6 = "BLE"; // const-string v6, "BLE"
/* invoke-virtual/range {v1 ..v6}, Le/h/d/a/a/w/g;->a(Landroid/content/Context;Lcom/orange/oab/contactless/packid/hce/user/User;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Ljava/lang/String;Ljava/lang/String;)V */
/* .line 4 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "Unexpected read: "; // const-string v1, "Unexpected read: "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
e.h.d.a.a.g.o .b ( p2 );
(( java.lang.StringBuilder ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( e.h.d.a.a.g.v ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/h/d/a/a/g/v;->a(Landroid/bluetooth/BluetoothGatt;Ljava/lang/String;)V
} // :goto_0
return;
} // .end method
public final java.lang.String f ( java.lang.String p0 ) {
/* .locals 4 */
final String v0 = "#"; // const-string v0, "#"
final String v1 = ""; // const-string v1, ""
/* .line 2 */
(( java.lang.String ) p1 ).replace ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
/* .line 3 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "reader_result_"; // const-string v2, "reader_result_"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.String ) v0 ).toLowerCase ( ); // invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 4 */
v1 = this.a;
(( android.content.Context ) v1 ).getResources ( ); // invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
v2 = this.a;
(( android.content.Context ) v2 ).getPackageName ( ); // invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
final String v3 = "string"; // const-string v3, "string"
v0 = (( android.content.res.Resources ) v1 ).getIdentifier ( v0, v3, v2 ); // invoke-virtual {v1, v0, v3, v2}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 5 */
p1 = this.a;
e.h.a.a.a.a.a .a ( p1 );
/* .line 6 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
(( e.h.a.a.a.a.a ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Le/h/a/a/a/a/a;->a(I)Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p1 = ","; // const-string p1, ","
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // :cond_0
} // .end method
public void f ( android.bluetooth.BluetoothGatt p0, android.bluetooth.BluetoothGattCharacteristic p1 ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "Unexpected write: "; // const-string v1, "Unexpected write: "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
e.h.d.a.a.g.o .b ( p2 );
(( java.lang.StringBuilder ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( e.h.d.a.a.g.v ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/h/d/a/a/g/v;->a(Landroid/bluetooth/BluetoothGatt;Ljava/lang/String;)V
return;
} // .end method
public final java.lang.String g ( java.lang.String p0 ) {
/* .locals 4 */
/* .line 7 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
final String v1 = " "; // const-string v1, " "
/* .line 8 */
(( java.lang.String ) p1 ).split ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
/* array-length v1, p1 */
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v2, v1, :cond_0 */
/* aget-object v3, p1, v2 */
/* .line 9 */
(( e.h.d.a.a.g.v ) p0 ).c ( v3 ); // invoke-virtual {p0, v3}, Le/h/d/a/a/g/v;->c(Ljava/lang/String;)Ljava/util/List;
/* add-int/lit8 v2, v2, 0x1 */
/* .line 10 */
} // :cond_0
(( e.h.d.a.a.g.v ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/h/d/a/a/g/v;->a(Ljava/util/List;)Ljava/lang/String;
} // .end method
public final void g ( android.bluetooth.BluetoothGatt p0, android.bluetooth.BluetoothGattCharacteristic p1 ) {
/* .locals 7 */
/* .line 1 */
(( android.bluetooth.BluetoothGatt ) p1 ).getDevice ( ); // invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getDevice()Landroid/bluetooth/BluetoothDevice;
final String v1 = "packid.ble.Writer"; // const-string v1, "packid.ble.Writer"
final String v2 = "7- reader result read successfully, notifying with message and disconnecting"; // const-string v2, "7- reader result read successfully, notifying with message and disconnecting"
/* .line 2 */
android.util.Log .i ( v1,v2 );
/* .line 3 */
v1 = this.a;
e.h.d.a.a.s.m .b ( v1 );
/* new-instance v2, Lcom/orange/oab/contactless/packid/domain/Transaction; */
v3 = this.c;
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v3 ).getZoneId ( ); // invoke-virtual {v3}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getZoneId()Lfr/mbs/binary/Octets;
/* invoke-direct {v2, v3}, Lcom/orange/oab/contactless/packid/domain/Transaction;-><init>(Lfr/mbs/binary/Octets;)V */
(( e.h.d.a.a.s.c0 ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Le/h/d/a/a/s/c0;->a(Lcom/orange/oab/contactless/packid/domain/Transaction;)V
/* .line 4 */
(( e.h.d.a.a.g.v ) p0 ).a ( p2, v0 ); // invoke-virtual {p0, p2, v0}, Le/h/d/a/a/g/v;->a(Landroid/bluetooth/BluetoothGattCharacteristic;Landroid/bluetooth/BluetoothDevice;)V
/* .line 5 */
p2 = this.f;
v0 = this.c;
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v0 ).getDescription ( ); // invoke-virtual {v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getDescription()Ljava/lang/String;
(( e.h.d.a.a.g.k ) p2 ).a ( p1, v0 ); // invoke-virtual {p2, p1, v0}, Le/h/d/a/a/g/k;->a(Landroid/bluetooth/BluetoothGatt;Ljava/lang/String;)V
/* .line 6 */
/* new-instance v1, Le/h/d/a/a/w/g; */
/* invoke-direct {v1}, Le/h/d/a/a/w/g;-><init>()V */
v2 = this.a;
v3 = this.d;
v4 = this.c;
final String v5 = "OK"; // const-string v5, "OK"
final String v6 = "BLE"; // const-string v6, "BLE"
/* invoke-virtual/range {v1 ..v6}, Le/h/d/a/a/w/g;->a(Landroid/content/Context;Lcom/orange/oab/contactless/packid/hce/user/User;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Ljava/lang/String;Ljava/lang/String;)V */
return;
} // .end method
