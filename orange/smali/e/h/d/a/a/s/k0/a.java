public class e.h.d.a.a.s.k0.a extends e.h.d.a.a.s.k0.d {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final com.orange.oab.contactless.packid.hce.user.wallet.Badge a;
	 public final java.util.Date b;
	 /* # direct methods */
	 public e.h.d.a.a.s.k0.a ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Le/h/d/a/a/s/k0/d;-><init>()V */
		 /* .line 2 */
		 this.a = p1;
		 /* .line 3 */
		 this.b = p2;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.Object a ( android.database.sqlite.SQLiteDatabase p0 ) { //bridge//synthethic
		 /* .locals 0 */
		 /* .line 1 */
		 (( e.h.d.a.a.s.k0.a ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/s/k0/a;->a(Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Void;
	 } // .end method
	 public java.lang.Void a ( android.database.sqlite.SQLiteDatabase p0 ) {
		 /* .locals 4 */
		 /* .line 2 */
		 /* new-instance v0, Landroid/content/ContentValues; */
		 /* invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V */
		 /* .line 3 */
		 v1 = this.b;
		 (( java.util.Date ) v1 ).getTime ( ); // invoke-virtual {v1}, Ljava/util/Date;->getTime()J
		 /* move-result-wide v1 */
		 java.lang.Long .valueOf ( v1,v2 );
		 final String v2 = "regenerationDate"; // const-string v2, "regenerationDate"
		 (( android.content.ContentValues ) v0 ).put ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V
		 int v1 = 2; // const/4 v1, 0x2
		 /* new-array v1, v1, [Ljava/lang/String; */
		 /* .line 4 */
		 v2 = this.a;
		 (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v2 ).getCipheredId ( ); // invoke-virtual {v2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getCipheredId()Lfr/mbs/binary/Octets;
		 (( fr.mbs.binary.Octets ) v2 ).toHexa ( ); // invoke-virtual {v2}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;
		 int v3 = 0; // const/4 v3, 0x0
		 /* aput-object v2, v1, v3 */
		 v2 = this.a;
		 (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v2 ).getZoneId ( ); // invoke-virtual {v2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getZoneId()Lfr/mbs/binary/Octets;
		 (( fr.mbs.binary.Octets ) v2 ).toHexa ( ); // invoke-virtual {v2}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;
		 int v3 = 1; // const/4 v3, 0x1
		 /* aput-object v2, v1, v3 */
		 final String v2 = "badge"; // const-string v2, "badge"
		 final String v3 = "cipheredId = ? AND zoneId = ?"; // const-string v3, "cipheredId = ? AND zoneId = ?"
		 /* .line 5 */
		 (( android.database.sqlite.SQLiteDatabase ) p1 ).update ( v2, v0, v3, v1 ); // invoke-virtual {p1, v2, v0, v3, v1}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
		 int p1 = 0; // const/4 p1, 0x0
	 } // .end method
