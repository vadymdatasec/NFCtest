public abstract class e.h.d.a.a.g.w extends e.h.d.a.a.g.v {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public e.h.d.a.a.n.i h;
	 public fr.mbs.binary.Octets i;
	 public fr.mbs.binary.Octets j;
	 public android.bluetooth.BluetoothGattCharacteristic k;
	 public Boolean l;
	 /* # direct methods */
	 public e.h.d.a.a.g.w ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct/range {p0 ..p5}, Le/h/d/a/a/g/v;-><init>(Landroid/content/Context;Le/h/d/a/a/n/w/c;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Lcom/orange/oab/contactless/packid/hce/user/User;Ljava/util/UUID;)V */
		 /* .line 2 */
		 /* new-instance p1, Le/h/d/a/a/n/i; */
		 /* const/16 p2, 0xa */
		 /* const/16 p3, 0xbb8 */
		 int p4 = 3; // const/4 p4, 0x3
		 /* const/16 p5, 0x12c */
		 /* invoke-direct {p1, p2, p3, p4, p5}, Le/h/d/a/a/n/i;-><init>(IIII)V */
		 this.h = p1;
		 int p1 = 0; // const/4 p1, 0x0
		 /* .line 3 */
		 this.k = p1;
		 int p1 = 0; // const/4 p1, 0x0
		 /* .line 4 */
		 /* iput-boolean p1, p0, Le/h/d/a/a/g/w;->l:Z */
		 return;
	 } // .end method
	 private void g ( android.bluetooth.BluetoothGatt p0, android.bluetooth.BluetoothGattCharacteristic p1 ) {
		 /* .locals 6 */
		 final String v0 = "packid.ble.SecureWriter"; // const-string v0, "packid.ble.SecureWriter"
		 final String v1 = "4- READER AUTHENTICATION, checking nonces and writing ciphered identifier"; // const-string v1, "4- READER AUTHENTICATION, checking nonces and writing ciphered identifier"
		 /* .line 1 */
		 android.util.Log .i ( v0,v1 );
		 /* .line 2 */
		 /* iget-boolean v1, p0, Le/h/d/a/a/g/w;->l:Z */
		 /* if-nez v1, :cond_0 */
		 final String p1 = "=> Receive READER AUTHENTICATION, but waiting INIT AUTHENTICATION, waiting it before process it"; // const-string p1, "=> Receive READER AUTHENTICATION, but waiting INIT AUTHENTICATION, waiting it before process it"
		 /* .line 3 */
		 android.util.Log .w ( v0,p1 );
		 /* .line 4 */
		 this.k = p2;
		 return;
		 /* .line 5 */
	 } // :cond_0
	 (( android.bluetooth.BluetoothGattCharacteristic ) p2 ).getValue ( ); // invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getValue()[B
	 p2 = 	 (( e.h.d.a.a.g.w ) p0 ).a ( p2 ); // invoke-virtual {p0, p2}, Le/h/d/a/a/g/w;->a([B)Z
	 if ( p2 != null) { // if-eqz p2, :cond_1
		 /* .line 6 */
		 (( e.h.d.a.a.g.w ) p0 ).d ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/g/w;->d(Landroid/bluetooth/BluetoothGatt;)V
		 /* .line 7 */
	 } // :cond_1
	 p2 = this.h;
	 p2 = 	 (( e.h.d.a.a.n.i ) p2 ).c ( ); // invoke-virtual {p2}, Le/h/d/a/a/n/i;->c()Z
	 int v1 = 2; // const/4 v1, 0x2
	 if ( p2 != null) { // if-eqz p2, :cond_2
		 /* .line 8 */
		 p2 = this.f;
		 int v0 = 1; // const/4 v0, 0x1
		 /* new-array v0, v0, [Ljava/lang/Object; */
		 v2 = this.c;
		 (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v2 ).getZoneId ( ); // invoke-virtual {v2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getZoneId()Lfr/mbs/binary/Octets;
		 int v3 = 0; // const/4 v3, 0x0
		 /* aput-object v2, v0, v3 */
		 final String v2 = "Authentication failed for zone %s, master key is probably wrong!!"; // const-string v2, "Authentication failed for zone %s, master key is probably wrong!!"
		 java.lang.String .format ( v2,v0 );
		 v2 = com.orange.business.packid.android.lib.TransactionErrorType.AUTHENTICATION;
		 (( e.h.d.a.a.g.k ) p2 ).a ( p1, v0, v1, v2 ); // invoke-virtual {p2, p1, v0, v1, v2}, Le/h/d/a/a/g/k;->a(Landroid/bluetooth/BluetoothGatt;Ljava/lang/String;ILcom/orange/business/packid/android/lib/TransactionErrorType;)V
		 /* .line 9 */
	 } // :cond_2
	 p2 = this.h;
	 (( e.h.d.a.a.n.i ) p2 ).d ( ); // invoke-virtual {p2}, Le/h/d/a/a/n/i;->d()J
	 /* move-result-wide v2 */
	 /* .line 10 */
	 /* new-instance p2, Ljava/lang/StringBuilder; */
	 /* invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V */
	 final String v4 = "invalid nonce trying again in "; // const-string v4, "invalid nonce trying again in "
	 (( java.lang.StringBuilder ) p2 ).append ( v4 ); // invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) p2 ).append ( v2, v3 ); // invoke-virtual {p2, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
	 final String v4 = " ms ("; // const-string v4, " ms ("
	 (( java.lang.StringBuilder ) p2 ).append ( v4 ); // invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 v4 = this.h;
	 (( e.h.d.a.a.n.i ) v4 ).b ( ); // invoke-virtual {v4}, Le/h/d/a/a/n/i;->b()J
	 /* move-result-wide v4 */
	 (( java.lang.StringBuilder ) p2 ).append ( v4, v5 ); // invoke-virtual {p2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
	 final String v4 = " ms left)"; // const-string v4, " ms left)"
	 (( java.lang.StringBuilder ) p2 ).append ( v4 ); // invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 /* .line 11 */
	 v4 = this.a;
	 com.orange.oab.contactless.packid.service.LogManager .w ( v4,p2,v1 );
	 /* .line 12 */
	 /* new-instance v1, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
	 final String v4 = "READER AUTHENTICATION failure: "; // const-string v4, "READER AUTHENTICATION failure: "
	 (( java.lang.StringBuilder ) v1 ).append ( v4 ); // invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 android.util.Log .w ( v0,p2 );
	 /* .line 13 */
	 (( e.h.d.a.a.g.w ) p0 ).a ( v2, v3 ); // invoke-virtual {p0, v2, v3}, Le/h/d/a/a/g/w;->a(J)V
	 /* .line 14 */
	 (( e.h.d.a.a.g.w ) p0 ).f ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/g/w;->f(Landroid/bluetooth/BluetoothGatt;)V
} // :goto_0
return;
} // .end method
/* # virtual methods */
public fr.mbs.binary.Octets a ( fr.mbs.binary.Octets p0 ) {
/* .locals 2 */
int v0 = 0; // const/4 v0, 0x0
int v1 = 6; // const/4 v1, 0x6
/* .line 24 */
(( fr.mbs.binary.Octets ) p1 ).get ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Lfr/mbs/binary/Octets;->get(II)Lfr/mbs/binary/Octets;
} // .end method
public fr.mbs.binary.Octets a ( fr.mbs.binary.Octets p0, Boolean p1 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/orange/oab/contactless/packid/g/u/e; */
/* } */
} // .end annotation
/* .line 10 */
v0 = this.j;
(( e.h.d.a.a.g.w ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/h/d/a/a/g/w;->a(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
(( fr.mbs.binary.Octets ) v0 ).put ( p1 ); // invoke-virtual {v0, p1}, Lfr/mbs/binary/Octets;->put(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
if ( p2 != null) { // if-eqz p2, :cond_0
/* .line 11 */
/* new-instance p2, Le/h/d/a/a/o/b/a; */
/* invoke-direct {p2}, Le/h/d/a/a/o/b/a;-><init>()V */
(( e.h.d.a.a.g.w ) p0 ).c ( ); // invoke-virtual {p0}, Le/h/d/a/a/g/w;->c()Lfr/mbs/binary/Octets;
(( e.h.d.a.a.o.b.a ) p2 ).b ( v0, p1 ); // invoke-virtual {p2, v0, p1}, Le/h/d/a/a/o/b/a;->b(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
/* .line 12 */
} // :cond_0
/* new-instance p2, Le/h/d/a/a/o/b/a; */
/* invoke-direct {p2}, Le/h/d/a/a/o/b/a;-><init>()V */
(( e.h.d.a.a.g.w ) p0 ).c ( ); // invoke-virtual {p0}, Le/h/d/a/a/g/w;->c()Lfr/mbs/binary/Octets;
(( e.h.d.a.a.o.b.a ) p2 ).a ( v0, p1 ); // invoke-virtual {p2, v0, p1}, Le/h/d/a/a/o/b/a;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
} // .end method
public final void a ( Long p0 ) {
/* .locals 1 */
/* .line 13 */
try { // :try_start_0
java.lang.Thread .sleep ( p1,p2 );
/* :try_end_0 */
/* .catch Ljava/lang/InterruptedException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p1 */
final String p2 = "packid.ble.SecureWriter"; // const-string p2, "packid.ble.SecureWriter"
final String v0 = "Could not sleep between reader auth"; // const-string v0, "Could not sleep between reader auth"
/* .line 14 */
android.util.Log .w ( p2,v0,p1 );
/* .line 15 */
java.lang.Thread .currentThread ( );
(( java.lang.Thread ) p1 ).interrupt ( ); // invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V
} // :goto_0
return;
} // .end method
public void a ( android.bluetooth.BluetoothGatt p0, android.bluetooth.BluetoothGattDescriptor p1 ) {
/* .locals 1 */
/* .line 7 */
/* invoke-super {p0, p1, p2}, Le/h/d/a/a/g/v;->a(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;)V */
/* .line 8 */
(( android.bluetooth.BluetoothGattDescriptor ) p2 ).getCharacteristic ( ); // invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattDescriptor;->getCharacteristic()Landroid/bluetooth/BluetoothGattCharacteristic;
(( android.bluetooth.BluetoothGattCharacteristic ) p2 ).getUuid ( ); // invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;
v0 = e.h.d.a.a.g.o.f;
(( e.h.d.a.a.g.o ) v0 ).b ( ); // invoke-virtual {v0}, Le/h/d/a/a/g/o;->b()Ljava/util/UUID;
p2 = (( java.util.UUID ) p2 ).equals ( v0 ); // invoke-virtual {p2, v0}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z
if ( p2 != null) { // if-eqz p2, :cond_0
/* .line 9 */
(( e.h.d.a.a.g.w ) p0 ).e ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/g/w;->e(Landroid/bluetooth/BluetoothGatt;)V
} // :cond_0
return;
} // .end method
public void a ( android.bluetooth.BluetoothGatt p0, android.bluetooth.BluetoothGattService p1 ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "0- service "; // const-string v1, "0- service "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( android.bluetooth.BluetoothGattService ) p2 ).getUuid ( ); // invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattService;->getUuid()Ljava/util/UUID;
(( java.lang.StringBuilder ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String p2 = " discovered"; // const-string p2, " discovered"
(( java.lang.StringBuilder ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v0 = "packid.ble.SecureWriter"; // const-string v0, "packid.ble.SecureWriter"
android.util.Log .i ( v0,p2 );
/* .line 2 */
p2 = this.h;
(( e.h.d.a.a.n.i ) p2 ).e ( ); // invoke-virtual {p2}, Le/h/d/a/a/n/i;->e()V
/* .line 3 */
p2 = e.h.d.a.a.g.o.f;
p2 = (( e.h.d.a.a.g.v ) p0 ).b ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/h/d/a/a/g/v;->b(Landroid/bluetooth/BluetoothGatt;Le/h/d/a/a/g/o;)Z
if ( p2 != null) { // if-eqz p2, :cond_0
final String p2 = "has property notify"; // const-string p2, "has property notify"
/* .line 4 */
android.util.Log .i ( v0,p2 );
/* .line 5 */
p2 = e.h.d.a.a.g.o.f;
(( e.h.d.a.a.g.v ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/h/d/a/a/g/v;->a(Landroid/bluetooth/BluetoothGatt;Le/h/d/a/a/g/o;)V
/* .line 6 */
} // :cond_0
(( e.h.d.a.a.g.w ) p0 ).e ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/g/w;->e(Landroid/bluetooth/BluetoothGatt;)V
} // :goto_0
return;
} // .end method
public final Boolean a ( Object[] p0 ) {
/* .locals 4 */
int v0 = 0; // const/4 v0, 0x0
final String v1 = "packid.ble.SecureWriter"; // const-string v1, "packid.ble.SecureWriter"
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 16 */
/* array-length v2, p1 */
/* if-nez v2, :cond_0 */
/* .line 17 */
} // :cond_0
try { // :try_start_0
v2 = this.b;
v3 = this.c;
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v3 ).getCipheredWalletKey ( ); // invoke-virtual {v3}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getCipheredWalletKey()Lfr/mbs/binary/Octets;
(( e.h.d.a.a.n.w.c ) v2 ).b ( v3 ); // invoke-virtual {v2, v3}, Le/h/d/a/a/n/w/c;->b(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
/* .line 18 */
/* new-instance v3, Le/h/d/a/a/o/b/a; */
/* invoke-direct {v3}, Le/h/d/a/a/o/b/a;-><init>()V */
fr.mbs.binary.Octets .createOctets ( p1 );
(( e.h.d.a.a.o.b.a ) v3 ).c ( v2, p1 ); // invoke-virtual {v3, v2, p1}, Le/h/d/a/a/o/b/a;->c(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
int v2 = 4; // const/4 v2, 0x4
/* .line 19 */
(( fr.mbs.binary.Octets ) p1 ).pop ( v2 ); // invoke-virtual {p1, v2}, Lfr/mbs/binary/Octets;->pop(I)Lfr/mbs/binary/Octets;
/* const/16 v3, 0xc */
/* .line 20 */
(( fr.mbs.binary.Octets ) p1 ).pop ( v3 ); // invoke-virtual {p1, v3}, Lfr/mbs/binary/Octets;->pop(I)Lfr/mbs/binary/Octets;
this.j = p1;
/* .line 21 */
p1 = this.i;
p1 = (( fr.mbs.binary.Octets ) v2 ).equals ( p1 ); // invoke-virtual {v2, p1}, Lfr/mbs/binary/Octets;->equals(Ljava/lang/Object;)Z
/* :try_end_0 */
/* .catch Lcom/orange/oab/contactless/packid/g/u/e; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p1 */
final String v2 = "READER AUTHENTICATION failure: could not decrypt nonces"; // const-string v2, "READER AUTHENTICATION failure: could not decrypt nonces"
/* .line 22 */
android.util.Log .e ( v1,v2,p1 );
} // :cond_1
} // :goto_0
final String p1 = "received empty encrypted nonces"; // const-string p1, "received empty encrypted nonces"
/* .line 23 */
android.util.Log .i ( v1,p1 );
} // .end method
public fr.mbs.binary.Octets c ( ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/orange/oab/contactless/packid/g/u/e; */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.b;
v1 = this.c;
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v1 ).getCipheredWalletKey ( ); // invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getCipheredWalletKey()Lfr/mbs/binary/Octets;
(( e.h.d.a.a.n.w.c ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Le/h/d/a/a/n/w/c;->b(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
/* .line 2 */
/* new-instance v1, Le/h/d/a/a/o/b/a; */
/* invoke-direct {v1}, Le/h/d/a/a/o/b/a;-><init>()V */
v2 = this.j;
fr.mbs.binary.Octets .createOctets ( v2 );
v3 = this.i;
(( fr.mbs.binary.Octets ) v2 ).put ( v3 ); // invoke-virtual {v2, v3}, Lfr/mbs/binary/Octets;->put(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
(( e.h.d.a.a.o.b.a ) v1 ).a ( v0, v2 ); // invoke-virtual {v1, v0, v2}, Le/h/d/a/a/o/b/a;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
} // .end method
public fr.mbs.binary.Octets d ( ) {
/* .locals 1 */
/* .line 4 */
v0 = this.j;
(( e.h.d.a.a.g.w ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/h/d/a/a/g/w;->a(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
} // .end method
public abstract void d ( android.bluetooth.BluetoothGatt p0 ) {
} // .end method
public void d ( android.bluetooth.BluetoothGatt p0, android.bluetooth.BluetoothGattCharacteristic p1 ) {
/* .locals 2 */
/* .line 1 */
(( android.bluetooth.BluetoothGattCharacteristic ) p2 ).getUuid ( ); // invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;
v1 = e.h.d.a.a.g.o.f;
(( e.h.d.a.a.g.o ) v1 ).b ( ); // invoke-virtual {v1}, Le/h/d/a/a/g/o;->b()Ljava/util/UUID;
v0 = (( java.util.UUID ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
/* invoke-direct {p0, p1, p2}, Le/h/d/a/a/g/w;->g(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V */
/* .line 3 */
} // :cond_0
/* invoke-super {p0, p1, p2}, Le/h/d/a/a/g/v;->d(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V */
} // :goto_0
return;
} // .end method
public final void e ( android.bluetooth.BluetoothGatt p0 ) {
/* .locals 3 */
final String v0 = "packid.ble.SecureWriter"; // const-string v0, "packid.ble.SecureWriter"
final String v1 = "1- write INIT AUTHENTICATION"; // const-string v1, "1- write INIT AUTHENTICATION"
/* .line 4 */
android.util.Log .i ( v0,v1 );
int v0 = 4; // const/4 v0, 0x4
/* .line 5 */
fr.mbs.binary.Octets .random ( v0 );
this.i = v0;
/* .line 6 */
v1 = e.h.d.a.a.g.o.e;
fr.mbs.binary.Octets .createOctets ( v0 );
v2 = this.d;
(( com.orange.oab.contactless.packid.hce.user.User ) v2 ).getWallet ( ); // invoke-virtual {v2}, Lcom/orange/oab/contactless/packid/hce/user/User;->getWallet()Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;
(( com.orange.oab.contactless.packid.hce.user.wallet.Wallet ) v2 ).getId ( ); // invoke-virtual {v2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;->getId()Lfr/mbs/binary/Octets;
(( fr.mbs.binary.Octets ) v0 ).put ( v2 ); // invoke-virtual {v0, v2}, Lfr/mbs/binary/Octets;->put(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
(( e.h.d.a.a.g.v ) p0 ).a ( p1, v1, v0 ); // invoke-virtual {p0, p1, v1, v0}, Le/h/d/a/a/g/v;->a(Landroid/bluetooth/BluetoothGatt;Le/h/d/a/a/g/o;Lfr/mbs/binary/Octets;)Z
return;
} // .end method
public void e ( android.bluetooth.BluetoothGatt p0, android.bluetooth.BluetoothGattCharacteristic p1 ) {
/* .locals 2 */
/* .line 1 */
(( android.bluetooth.BluetoothGattCharacteristic ) p2 ).getUuid ( ); // invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;
v1 = e.h.d.a.a.g.o.f;
(( e.h.d.a.a.g.o ) v1 ).b ( ); // invoke-virtual {v1}, Le/h/d/a/a/g/o;->b()Ljava/util/UUID;
v0 = (( java.util.UUID ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
/* invoke-direct {p0, p1, p2}, Le/h/d/a/a/g/w;->g(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V */
/* .line 3 */
} // :cond_0
/* invoke-super {p0, p1, p2}, Le/h/d/a/a/g/v;->e(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V */
} // :goto_0
return;
} // .end method
public final void f ( android.bluetooth.BluetoothGatt p0 ) {
/* .locals 2 */
/* .line 15 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "3- read READER AUTHENTICATION (try "; // const-string v1, "3- read READER AUTHENTICATION (try "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.h;
v1 = (( e.h.d.a.a.n.i ) v1 ).a ( ); // invoke-virtual {v1}, Le/h/d/a/a/n/i;->a()I
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = ")"; // const-string v1, ")"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v1 = "packid.ble.SecureWriter"; // const-string v1, "packid.ble.SecureWriter"
android.util.Log .i ( v1,v0 );
/* .line 16 */
v0 = e.h.d.a.a.g.o.f;
(( e.h.d.a.a.g.v ) p0 ).c ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Le/h/d/a/a/g/v;->c(Landroid/bluetooth/BluetoothGatt;Le/h/d/a/a/g/o;)V
return;
} // .end method
public void f ( android.bluetooth.BluetoothGatt p0, android.bluetooth.BluetoothGattCharacteristic p1 ) {
/* .locals 3 */
/* .line 1 */
(( android.bluetooth.BluetoothGattCharacteristic ) p2 ).getUuid ( ); // invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;
v1 = e.h.d.a.a.g.o.e;
(( e.h.d.a.a.g.o ) v1 ).b ( ); // invoke-virtual {v1}, Le/h/d/a/a/g/o;->b()Ljava/util/UUID;
v0 = (( java.util.UUID ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z
final String v1 = "packid.ble.SecureWriter"; // const-string v1, "packid.ble.SecureWriter"
if ( v0 != null) { // if-eqz v0, :cond_1
final String p2 = "2- INIT AUTHENTICATION written successfully"; // const-string p2, "2- INIT AUTHENTICATION written successfully"
/* .line 2 */
android.util.Log .i ( v1,p2 );
int p2 = 1; // const/4 p2, 0x1
/* .line 3 */
/* iput-boolean p2, p0, Le/h/d/a/a/g/w;->l:Z */
/* .line 4 */
p2 = e.h.d.a.a.g.o.f;
p2 = (( e.h.d.a.a.g.v ) p0 ).b ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/h/d/a/a/g/v;->b(Landroid/bluetooth/BluetoothGatt;Le/h/d/a/a/g/o;)Z
if ( p2 != null) { // if-eqz p2, :cond_0
final String p2 = "Reader auth characteristic has notify property, waiting for notification"; // const-string p2, "Reader auth characteristic has notify property, waiting for notification"
/* .line 5 */
android.util.Log .i ( v1,p2 );
/* .line 6 */
p2 = this.k;
if ( p2 != null) { // if-eqz p2, :cond_3
final String p2 = "=> READER AUTH already received before INIT AUTHENTICATION, dealing it now"; // const-string p2, "=> READER AUTH already received before INIT AUTHENTICATION, dealing it now"
/* .line 7 */
android.util.Log .w ( v1,p2 );
/* .line 8 */
p2 = this.k;
/* invoke-direct {p0, p1, p2}, Le/h/d/a/a/g/w;->g(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V */
} // :cond_0
final String p2 = "Reader auth characteristic does not have notify property, reading characteristic"; // const-string p2, "Reader auth characteristic does not have notify property, reading characteristic"
/* .line 9 */
android.util.Log .i ( v1,p2 );
/* .line 10 */
(( e.h.d.a.a.g.w ) p0 ).f ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/g/w;->f(Landroid/bluetooth/BluetoothGatt;)V
/* .line 11 */
} // :cond_1
(( android.bluetooth.BluetoothGattCharacteristic ) p2 ).getUuid ( ); // invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;
v2 = e.h.d.a.a.g.o.g;
(( e.h.d.a.a.g.o ) v2 ).b ( ); // invoke-virtual {v2}, Le/h/d/a/a/g/o;->b()Ljava/util/UUID;
v0 = (( java.util.UUID ) v0 ).equals ( v2 ); // invoke-virtual {v0, v2}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_2
final String p2 = "6- identifier written successfully, reading reader result"; // const-string p2, "6- identifier written successfully, reading reader result"
/* .line 12 */
android.util.Log .i ( v1,p2 );
/* .line 13 */
(( e.h.d.a.a.g.v ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/g/v;->c(Landroid/bluetooth/BluetoothGatt;)V
/* .line 14 */
} // :cond_2
/* invoke-super {p0, p1, p2}, Le/h/d/a/a/g/v;->f(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V */
} // :cond_3
} // :goto_0
return;
} // .end method
