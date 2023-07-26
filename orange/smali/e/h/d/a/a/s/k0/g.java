public class e.h.d.a.a.s.k0.g extends e.h.d.a.a.s.k0.d {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final java.lang.String a;
	 public final java.lang.String b;
	 /* # direct methods */
	 public e.h.d.a.a.s.k0.g ( ) {
		 /* .locals 3 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Le/h/d/a/a/s/k0/d;-><init>()V */
		 /* .line 2 */
		 /* new-instance v0, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v1 = "zoneId = ? AND cipheredId = ? AND walletId = ? AND "; // const-string v1, "zoneId = ? AND cipheredId = ? AND walletId = ? AND "
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p2 ).getUserId ( ); // invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getUserId()Ljava/lang/String;
		 final String v2 = "userId"; // const-string v2, "userId"
		 (( e.h.d.a.a.s.k0.d ) p0 ).b ( v2, v1 ); // invoke-virtual {p0, v2, v1}, Le/h/d/a/a/s/k0/d;->b(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 this.a = v0;
		 int v0 = 3; // const/4 v0, 0x3
		 /* new-array v0, v0, [Ljava/lang/String; */
		 /* .line 3 */
		 (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p2 ).getZoneId ( ); // invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getZoneId()Lfr/mbs/binary/Octets;
		 (( fr.mbs.binary.Octets ) v1 ).toHexa ( ); // invoke-virtual {v1}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;
		 int v2 = 0; // const/4 v2, 0x0
		 /* aput-object v1, v0, v2 */
		 (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p2 ).getCipheredId ( ); // invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getCipheredId()Lfr/mbs/binary/Octets;
		 (( fr.mbs.binary.Octets ) v1 ).toHexa ( ); // invoke-virtual {v1}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;
		 int v2 = 1; // const/4 v2, 0x1
		 /* aput-object v1, v0, v2 */
		 (( fr.mbs.binary.Octets ) p1 ).toHexa ( ); // invoke-virtual {p1}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;
		 int v1 = 2; // const/4 v1, 0x2
		 /* aput-object p1, v0, v1 */
		 (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p2 ).getUserId ( ); // invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getUserId()Ljava/lang/String;
		 (( e.h.d.a.a.s.k0.d ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/s/k0/d;->a(Ljava/lang/String;)[Ljava/lang/String;
		 m.a.a.c.a .a ( v0,p1 );
		 /* check-cast p1, [Ljava/lang/String; */
		 this.b = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.Object a ( android.database.sqlite.SQLiteDatabase p0 ) {
		 /* .locals 3 */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "<T:", */
		 /* "Ljava/lang/Object;", */
		 /* ">(", */
		 /* "Landroid/database/sqlite/SQLiteDatabase;", */
		 /* ")TT;" */
		 /* } */
	 } // .end annotation
	 /* .line 1 */
	 v0 = this.a;
	 v1 = this.b;
	 final String v2 = "badge"; // const-string v2, "badge"
	 (( android.database.sqlite.SQLiteDatabase ) p1 ).delete ( v2, v0, v1 ); // invoke-virtual {p1, v2, v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
	 int p1 = 0; // const/4 p1, 0x0
} // .end method
