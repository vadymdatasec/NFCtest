public class e.h.d.a.a.s.k0.i extends e.h.d.a.a.s.k0.d {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final fr.mbs.binary.Octets a;
	 /* # direct methods */
	 public e.h.d.a.a.s.k0.i ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Le/h/d/a/a/s/k0/d;-><init>()V */
		 /* .line 2 */
		 this.a = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.Object a ( android.database.sqlite.SQLiteDatabase p0 ) {
		 /* .locals 2 */
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
	 /* new-instance v0, Le/h/d/a/a/s/k0/u; */
	 v1 = this.a;
	 /* invoke-direct {v0, v1}, Le/h/d/a/a/s/k0/u;-><init>(Lfr/mbs/binary/Octets;)V */
	 (( e.h.d.a.a.s.k0.u ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Le/h/d/a/a/s/k0/u;->a(Landroid/database/sqlite/SQLiteDatabase;)Lcom/orange/oab/contactless/packid/hce/user/User;
	 /* .line 2 */
	 /* new-instance v1, Le/h/d/a/a/s/k0/j; */
	 (( com.orange.oab.contactless.packid.hce.user.User ) v0 ).getId ( ); // invoke-virtual {v0}, Lcom/orange/oab/contactless/packid/hce/user/User;->getId()Ljava/lang/String;
	 /* invoke-direct {v1, v0}, Le/h/d/a/a/s/k0/j;-><init>(Ljava/lang/String;)V */
	 (( e.h.d.a.a.s.k0.j ) v1 ).a ( p1 ); // invoke-virtual {v1, p1}, Le/h/d/a/a/s/k0/j;->a(Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Object;
} // .end method
