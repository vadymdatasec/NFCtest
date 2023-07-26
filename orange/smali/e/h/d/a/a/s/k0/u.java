public class e.h.d.a.a.s.k0.u extends e.h.d.a.a.s.k0.d {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final fr.mbs.binary.Octets a;
	 /* # direct methods */
	 public e.h.d.a.a.s.k0.u ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Le/h/d/a/a/s/k0/d;-><init>()V */
		 /* .line 2 */
		 this.a = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public com.orange.oab.contactless.packid.hce.user.User a ( android.database.sqlite.SQLiteDatabase p0 ) {
		 /* .locals 5 */
		 /* .line 2 */
		 v0 = this.a;
		 int v1 = 0; // const/4 v1, 0x0
		 /* if-nez v0, :cond_0 */
		 /* .line 3 */
	 } // :cond_0
	 /* new-instance v2, Le/h/d/a/a/s/k0/w; */
	 int v3 = 1; // const/4 v3, 0x1
	 /* new-array v3, v3, [Ljava/lang/String; */
	 (( fr.mbs.binary.Octets ) v0 ).toHexa ( ); // invoke-virtual {v0}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;
	 int v4 = 0; // const/4 v4, 0x0
	 /* aput-object v0, v3, v4 */
	 final String v0 = "contactlessId = ?"; // const-string v0, "contactlessId = ?"
	 /* invoke-direct {v2, v0, v3}, Le/h/d/a/a/s/k0/w;-><init>(Ljava/lang/String;[Ljava/lang/String;)V */
	 (( e.h.d.a.a.s.k0.w ) v2 ).a ( p1 ); // invoke-virtual {v2, p1}, Le/h/d/a/a/s/k0/w;->a(Landroid/database/sqlite/SQLiteDatabase;)Ljava/util/List;
	 v0 = 	 /* .line 4 */
	 if ( v0 != null) { // if-eqz v0, :cond_1
	 } // :cond_1
	 /* move-object v1, p1 */
	 /* check-cast v1, Lcom/orange/oab/contactless/packid/hce/user/User; */
} // :goto_0
} // .end method
public java.lang.Object a ( android.database.sqlite.SQLiteDatabase p0 ) { //bridge//synthethic
/* .locals 0 */
/* .line 1 */
(( e.h.d.a.a.s.k0.u ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/s/k0/u;->a(Landroid/database/sqlite/SQLiteDatabase;)Lcom/orange/oab/contactless/packid/hce/user/User;
} // .end method
