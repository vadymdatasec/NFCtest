public class e.h.d.a.a.s.k0.k extends e.h.d.a.a.s.k0.d {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final fr.mbs.binary.Octets a;
	 public final fr.mbs.binary.Octets b;
	 /* # direct methods */
	 public e.h.d.a.a.s.k0.k ( ) {
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
	 /* new-instance v0, Le/h/d/a/a/s/k0/t; */
	 v1 = this.a;
	 v2 = this.b;
	 /* invoke-direct {v0, v1, v2}, Le/h/d/a/a/s/k0/t;-><init>(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)V */
	 (( e.h.d.a.a.s.k0.t ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Le/h/d/a/a/s/k0/t;->a(Landroid/database/sqlite/SQLiteDatabase;)Ljava/util/List;
	 /* .line 2 */
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_0
	 /* check-cast v1, Lcom/orange/oab/contactless/packid/hce/user/User; */
	 /* .line 3 */
	 /* new-instance v2, Le/h/d/a/a/s/k0/j; */
	 (( com.orange.oab.contactless.packid.hce.user.User ) v1 ).getId ( ); // invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->getId()Ljava/lang/String;
	 /* invoke-direct {v2, v1}, Le/h/d/a/a/s/k0/j;-><init>(Ljava/lang/String;)V */
	 (( e.h.d.a.a.s.k0.j ) v2 ).a ( p1 ); // invoke-virtual {v2, p1}, Le/h/d/a/a/s/k0/j;->a(Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Object;
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // .end method
