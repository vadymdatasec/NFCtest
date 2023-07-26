public class e.h.d.a.a.s.k0.v extends e.h.d.a.a.s.k0.d {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final java.lang.String a;
	 /* # direct methods */
	 public e.h.d.a.a.s.k0.v ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Le/h/d/a/a/s/k0/d;-><init>()V */
		 /* .line 2 */
		 this.a = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public com.orange.oab.contactless.packid.hce.user.User a ( android.database.sqlite.SQLiteDatabase p0 ) {
		 /* .locals 3 */
		 /* .line 2 */
		 /* new-instance v0, Le/h/d/a/a/s/k0/w; */
		 v1 = this.a;
		 final String v2 = "id"; // const-string v2, "id"
		 (( e.h.d.a.a.s.k0.d ) p0 ).b ( v2, v1 ); // invoke-virtual {p0, v2, v1}, Le/h/d/a/a/s/k0/d;->b(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
		 v2 = this.a;
		 (( e.h.d.a.a.s.k0.d ) p0 ).a ( v2 ); // invoke-virtual {p0, v2}, Le/h/d/a/a/s/k0/d;->a(Ljava/lang/String;)[Ljava/lang/String;
		 /* invoke-direct {v0, v1, v2}, Le/h/d/a/a/s/k0/w;-><init>(Ljava/lang/String;[Ljava/lang/String;)V */
		 (( e.h.d.a.a.s.k0.w ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Le/h/d/a/a/s/k0/w;->a(Landroid/database/sqlite/SQLiteDatabase;)Ljava/util/List;
		 v0 = 		 /* .line 3 */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 int p1 = 0; // const/4 p1, 0x0
		 } // :cond_0
		 int v0 = 0; // const/4 v0, 0x0
		 /* check-cast p1, Lcom/orange/oab/contactless/packid/hce/user/User; */
	 } // :goto_0
} // .end method
public java.lang.Object a ( android.database.sqlite.SQLiteDatabase p0 ) { //bridge//synthethic
	 /* .locals 0 */
	 /* .line 1 */
	 (( e.h.d.a.a.s.k0.v ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/s/k0/v;->a(Landroid/database/sqlite/SQLiteDatabase;)Lcom/orange/oab/contactless/packid/hce/user/User;
} // .end method
