public class e.h.d.a.a.g.s extends e.h.d.a.a.g.w {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public e.h.d.a.a.g.s ( ) {
		 /* .locals 7 */
		 /* .line 1 */
		 v0 = e.h.d.a.a.g.o.d;
		 (( e.h.d.a.a.g.o ) v0 ).b ( ); // invoke-virtual {v0}, Le/h/d/a/a/g/o;->b()Ljava/util/UUID;
		 /* move-object v1, p0 */
		 /* move-object v2, p1 */
		 /* move-object v3, p2 */
		 /* move-object v4, p3 */
		 /* move-object v5, p4 */
		 /* invoke-direct/range {v1 ..v6}, Le/h/d/a/a/g/w;-><init>(Landroid/content/Context;Le/h/d/a/a/n/w/c;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Lcom/orange/oab/contactless/packid/hce/user/User;Ljava/util/UUID;)V */
		 return;
	 } // .end method
	 private void e ( android.bluetooth.BluetoothGatt p0 ) {
		 /* .locals 4 */
		 final String v0 = "packid.ble.Id.Secured"; // const-string v0, "packid.ble.Id.Secured"
		 final String v1 = "5- write UUID IDENTIFIER"; // const-string v1, "5- write UUID IDENTIFIER"
		 /* .line 1 */
		 android.util.Log .i ( v0,v1 );
		 /* .line 2 */
		 try { // :try_start_0
			 v0 = e.h.d.a.a.g.o.g;
			 (( e.h.d.a.a.g.s ) p0 ).e ( ); // invoke-virtual {p0}, Le/h/d/a/a/g/s;->e()Lfr/mbs/binary/Octets;
			 (( e.h.d.a.a.g.v ) p0 ).a ( p1, v0, v1 ); // invoke-virtual {p0, p1, v0, v1}, Le/h/d/a/a/g/v;->a(Landroid/bluetooth/BluetoothGatt;Le/h/d/a/a/g/o;Lfr/mbs/binary/Octets;)Z
			 /* :try_end_0 */
			 /* .catch Lcom/orange/oab/contactless/packid/g/u/e; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* .line 3 */
			 /* :catch_0 */
			 v0 = this.f;
			 v1 = com.orange.business.packid.android.lib.TransactionErrorType.CIPHER;
			 int v2 = 2; // const/4 v2, 0x2
			 final String v3 = "Can\'t cipher identifier"; // const-string v3, "Can\'t cipher identifier"
			 (( e.h.d.a.a.g.k ) v0 ).a ( p1, v3, v2, v1 ); // invoke-virtual {v0, p1, v3, v2, v1}, Le/h/d/a/a/g/k;->a(Landroid/bluetooth/BluetoothGatt;Ljava/lang/String;ILcom/orange/business/packid/android/lib/TransactionErrorType;)V
		 } // :goto_0
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void b ( java.lang.String p0 ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 public void d ( android.bluetooth.BluetoothGatt p0 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0, p1}, Le/h/d/a/a/g/s;->e(Landroid/bluetooth/BluetoothGatt;)V */
		 return;
	 } // .end method
	 public final fr.mbs.binary.Octets e ( ) {
		 /* .locals 2 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Lcom/orange/oab/contactless/packid/g/u/e; */
		 /* } */
	 } // .end annotation
	 /* .line 4 */
	 v0 = this.b;
	 v1 = this.c;
	 (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v1 ).getCipheredId ( ); // invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getCipheredId()Lfr/mbs/binary/Octets;
	 (( e.h.d.a.a.n.w.c ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Le/h/d/a/a/n/w/c;->b(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
	 int v1 = 0; // const/4 v1, 0x0
	 (( e.h.d.a.a.g.w ) p0 ).a ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Le/h/d/a/a/g/w;->a(Lfr/mbs/binary/Octets;Z)Lfr/mbs/binary/Octets;
} // .end method
