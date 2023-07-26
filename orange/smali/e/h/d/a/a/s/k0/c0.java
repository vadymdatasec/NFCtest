public class e.h.d.a.a.s.k0.c0 extends e.h.d.a.a.s.k0.d {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final fr.mbs.binary.Octets a;
	 public final com.orange.oab.contactless.packid.hce.user.wallet.Badge b;
	 /* # direct methods */
	 public e.h.d.a.a.s.k0.c0 ( ) {
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
		 (( e.h.d.a.a.s.k0.c0 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/s/k0/c0;->a(Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Void;
	 } // .end method
	 public java.lang.Void a ( android.database.sqlite.SQLiteDatabase p0 ) {
		 /* .locals 5 */
		 /* .line 2 */
		 /* new-instance v0, Le/h/d/a/a/s/k0/b; */
		 int v1 = 0; // const/4 v1, 0x0
		 /* invoke-direct {v0, v1}, Le/h/d/a/a/s/k0/b;-><init>(Z)V */
		 v2 = this.b;
		 v3 = this.a;
		 (( e.h.d.a.a.s.k0.b ) v0 ).a ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Le/h/d/a/a/s/k0/b;->a(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Lfr/mbs/binary/Octets;)Landroid/content/ContentValues;
		 /* .line 3 */
		 /* new-instance v2, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v3 = "walletId = ? AND cipheredId = ? AND zoneId = ? AND "; // const-string v3, "walletId = ? AND cipheredId = ? AND zoneId = ? AND "
		 (( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 v3 = this.b;
		 (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v3 ).getUserId ( ); // invoke-virtual {v3}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getUserId()Ljava/lang/String;
		 final String v4 = "userId"; // const-string v4, "userId"
		 (( e.h.d.a.a.s.k0.d ) p0 ).b ( v4, v3 ); // invoke-virtual {p0, v4, v3}, Le/h/d/a/a/s/k0/d;->b(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
		 (( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 int v3 = 3; // const/4 v3, 0x3
		 /* new-array v3, v3, [Ljava/lang/String; */
		 /* .line 4 */
		 v4 = this.a;
		 (( fr.mbs.binary.Octets ) v4 ).toHexa ( ); // invoke-virtual {v4}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;
		 /* aput-object v4, v3, v1 */
		 v1 = this.b;
		 (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v1 ).getCipheredId ( ); // invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getCipheredId()Lfr/mbs/binary/Octets;
		 (( fr.mbs.binary.Octets ) v1 ).toHexa ( ); // invoke-virtual {v1}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;
		 int v4 = 1; // const/4 v4, 0x1
		 /* aput-object v1, v3, v4 */
		 v1 = this.b;
		 (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v1 ).getZoneId ( ); // invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getZoneId()Lfr/mbs/binary/Octets;
		 (( fr.mbs.binary.Octets ) v1 ).toHexa ( ); // invoke-virtual {v1}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;
		 int v4 = 2; // const/4 v4, 0x2
		 /* aput-object v1, v3, v4 */
		 v1 = this.b;
		 (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v1 ).getUserId ( ); // invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getUserId()Ljava/lang/String;
		 (( e.h.d.a.a.s.k0.d ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Le/h/d/a/a/s/k0/d;->a(Ljava/lang/String;)[Ljava/lang/String;
		 m.a.a.c.a .a ( v3,v1 );
		 /* check-cast v1, [Ljava/lang/String; */
		 final String v3 = "badge"; // const-string v3, "badge"
		 /* .line 5 */
		 (( android.database.sqlite.SQLiteDatabase ) p1 ).update ( v3, v0, v2, v1 ); // invoke-virtual {p1, v3, v0, v2, v1}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
		 int p1 = 0; // const/4 p1, 0x0
	 } // .end method
