public class e.h.d.a.a.g.t extends e.h.d.a.a.g.v {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public e.h.d.a.a.g.t ( ) {
		 /* .locals 7 */
		 /* .line 1 */
		 v0 = e.h.d.a.a.g.o.c;
		 (( e.h.d.a.a.g.o ) v0 ).b ( ); // invoke-virtual {v0}, Le/h/d/a/a/g/o;->b()Ljava/util/UUID;
		 /* move-object v1, p0 */
		 /* move-object v2, p1 */
		 /* move-object v3, p2 */
		 /* move-object v4, p3 */
		 /* move-object v5, p4 */
		 /* invoke-direct/range {v1 ..v6}, Le/h/d/a/a/g/v;-><init>(Landroid/content/Context;Le/h/d/a/a/n/w/c;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Lcom/orange/oab/contactless/packid/hce/user/User;Ljava/util/UUID;)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( android.bluetooth.BluetoothGatt p0, android.bluetooth.BluetoothGattService p1 ) {
		 /* .locals 3 */
		 final String p2 = "packid.ble.Id.Unsecured"; // const-string p2, "packid.ble.Id.Unsecured"
		 final String v0 = "services discovered, writing identifier"; // const-string v0, "services discovered, writing identifier"
		 /* .line 1 */
		 android.util.Log .i ( p2,v0 );
		 /* .line 2 */
		 try { // :try_start_0
			 v0 = e.h.d.a.a.g.o.g;
			 v1 = this.b;
			 v2 = this.c;
			 (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v2 ).getCipheredId ( ); // invoke-virtual {v2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getCipheredId()Lfr/mbs/binary/Octets;
			 (( e.h.d.a.a.n.w.c ) v1 ).b ( v2 ); // invoke-virtual {v1, v2}, Le/h/d/a/a/n/w/c;->b(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
			 (( e.h.d.a.a.g.v ) p0 ).a ( p1, v0, v1 ); // invoke-virtual {p0, p1, v0, v1}, Le/h/d/a/a/g/v;->a(Landroid/bluetooth/BluetoothGatt;Le/h/d/a/a/g/o;Lfr/mbs/binary/Octets;)Z
			 /* :try_end_0 */
			 /* .catch Lcom/orange/oab/contactless/packid/g/u/e; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* :catch_0 */
			 /* move-exception p1 */
			 final String v0 = "Send PackId Identifier: Could not decrypt badge:"; // const-string v0, "Send PackId Identifier: Could not decrypt badge:"
			 /* .line 3 */
			 android.util.Log .e ( p2,v0,p1 );
		 } // :goto_0
		 return;
	 } // .end method
	 public void b ( java.lang.String p0 ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 public void f ( android.bluetooth.BluetoothGatt p0, android.bluetooth.BluetoothGattCharacteristic p1 ) {
		 /* .locals 2 */
		 /* .line 1 */
		 (( android.bluetooth.BluetoothGattCharacteristic ) p2 ).getUuid ( ); // invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;
		 v1 = e.h.d.a.a.g.o.g;
		 (( e.h.d.a.a.g.o ) v1 ).b ( ); // invoke-virtual {v1}, Le/h/d/a/a/g/o;->b()Ljava/util/UUID;
		 v0 = 		 (( java.util.UUID ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 final String p2 = "packid.ble.Id.Unsecured"; // const-string p2, "packid.ble.Id.Unsecured"
			 final String v0 = "identifer written successfully, reading reader result"; // const-string v0, "identifer written successfully, reading reader result"
			 /* .line 2 */
			 android.util.Log .i ( p2,v0 );
			 /* .line 3 */
			 (( e.h.d.a.a.g.v ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/g/v;->c(Landroid/bluetooth/BluetoothGatt;)V
			 /* .line 4 */
		 } // :cond_0
		 /* invoke-super {p0, p1, p2}, Le/h/d/a/a/g/v;->f(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V */
	 } // :goto_0
	 return;
} // .end method
