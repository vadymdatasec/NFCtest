public class e.h.d.a.a.s.k0.q extends e.h.d.a.a.s.k0.d {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final java.lang.String a;
	 public final fr.mbs.binary.Octets b;
	 /* # direct methods */
	 public e.h.d.a.a.s.k0.q ( ) {
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
	 public com.orange.oab.contactless.packid.hce.user.wallet.Badge a ( android.database.sqlite.SQLiteDatabase p0 ) {
		 /* .locals 6 */
		 /* .line 2 */
		 /* new-instance v0, Le/h/d/a/a/s/k0/m; */
		 /* new-instance v1, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
		 v2 = this.a;
		 final String v3 = "id"; // const-string v3, "id"
		 /* .line 3 */
		 (( e.h.d.a.a.s.k0.d ) p0 ).b ( v3, v2 ); // invoke-virtual {p0, v3, v2}, Le/h/d/a/a/s/k0/d;->b(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 final String v2 = " and "; // const-string v2, " and "
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 final String v2 = "zoneId"; // const-string v2, "zoneId"
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 final String v2 = " = ?"; // const-string v2, " = ?"
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 v2 = this.a;
		 /* .line 4 */
		 (( e.h.d.a.a.s.k0.d ) p0 ).a ( v2 ); // invoke-virtual {p0, v2}, Le/h/d/a/a/s/k0/d;->a(Ljava/lang/String;)[Ljava/lang/String;
		 int v3 = 1; // const/4 v3, 0x1
		 /* new-array v3, v3, [Ljava/lang/String; */
		 v4 = this.b;
		 (( fr.mbs.binary.Octets ) v4 ).toHexa ( ); // invoke-virtual {v4}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;
		 int v5 = 0; // const/4 v5, 0x0
		 /* aput-object v4, v3, v5 */
		 m.a.a.c.a .a ( v2,v3 );
		 /* check-cast v2, [Ljava/lang/String; */
		 final String v3 = "badge, user"; // const-string v3, "badge, user"
		 final String v4 = "1"; // const-string v4, "1"
		 /* invoke-direct {v0, v3, v1, v2, v4}, Le/h/d/a/a/s/k0/m;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)V */
		 /* .line 5 */
		 (( e.h.d.a.a.s.k0.o ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Le/h/d/a/a/s/k0/o;->a(Landroid/database/sqlite/SQLiteDatabase;)Ljava/util/List;
		 v0 = 		 /* .line 6 */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 int p1 = 0; // const/4 p1, 0x0
		 } // :cond_0
		 /* check-cast p1, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge; */
	 } // :goto_0
} // .end method
public java.lang.Object a ( android.database.sqlite.SQLiteDatabase p0 ) { //bridge//synthethic
	 /* .locals 0 */
	 /* .line 1 */
	 (( e.h.d.a.a.s.k0.q ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/s/k0/q;->a(Landroid/database/sqlite/SQLiteDatabase;)Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;
} // .end method
