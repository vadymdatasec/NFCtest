public class e.h.d.a.a.s.k0.s extends e.h.d.a.a.s.k0.d {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final fr.mbs.binary.Octets a;
	 /* # direct methods */
	 public e.h.d.a.a.s.k0.s ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Le/h/d/a/a/s/k0/d;-><init>()V */
		 /* .line 2 */
		 this.a = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public com.orange.oab.contactless.packid.hce.user.User a ( android.database.sqlite.SQLiteDatabase p0 ) {
		 /* .locals 4 */
		 /* .line 2 */
		 /* new-instance v0, Le/h/d/a/a/s/k0/w; */
		 v1 = this.a;
		 final String v2 = "cipheredUri"; // const-string v2, "cipheredUri"
		 /* .line 3 */
		 (( e.h.d.a.a.s.k0.d ) p0 ).b ( v2, v1 ); // invoke-virtual {p0, v2, v1}, Le/h/d/a/a/s/k0/d;->b(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
		 /* .line 4 */
		 v2 = this.a;
		 int v3 = 0; // const/4 v3, 0x0
		 /* if-nez v2, :cond_0 */
		 /* move-object v2, v3 */
	 } // :cond_0
	 (( fr.mbs.binary.Octets ) v2 ).toHexa ( ); // invoke-virtual {v2}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;
} // :goto_0
(( e.h.d.a.a.s.k0.d ) p0 ).a ( v2 ); // invoke-virtual {p0, v2}, Le/h/d/a/a/s/k0/d;->a(Ljava/lang/String;)[Ljava/lang/String;
/* invoke-direct {v0, v1, v2}, Le/h/d/a/a/s/k0/w;-><init>(Ljava/lang/String;[Ljava/lang/String;)V */
(( e.h.d.a.a.s.k0.w ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Le/h/d/a/a/s/k0/w;->a(Landroid/database/sqlite/SQLiteDatabase;)Ljava/util/List;
v0 = /* .line 5 */
if ( v0 != null) { // if-eqz v0, :cond_1
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
/* move-object v3, p1 */
/* check-cast v3, Lcom/orange/oab/contactless/packid/hce/user/User; */
} // :goto_1
} // .end method
public java.lang.Object a ( android.database.sqlite.SQLiteDatabase p0 ) { //bridge//synthethic
/* .locals 0 */
/* .line 1 */
(( e.h.d.a.a.s.k0.s ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/s/k0/s;->a(Landroid/database/sqlite/SQLiteDatabase;)Lcom/orange/oab/contactless/packid/hce/user/User;
} // .end method
