public class e.h.d.a.a.s.k0.r extends e.h.d.a.a.s.k0.d {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final com.orange.oab.contactless.packid.hce.user.wallet.Badge a;
	 /* # direct methods */
	 public e.h.d.a.a.s.k0.r ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Le/h/d/a/a/s/k0/d;-><init>()V */
		 /* .line 2 */
		 this.a = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public com.orange.oab.contactless.packid.hce.user.User a ( android.database.sqlite.SQLiteDatabase p0 ) {
		 /* .locals 2 */
		 /* .line 2 */
		 v0 = this.a;
		 /* if-nez v0, :cond_0 */
		 int p1 = 0; // const/4 p1, 0x0
	 } // :cond_0
	 /* new-instance v1, Le/h/d/a/a/s/k0/v; */
	 (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v0 ).getUserId ( ); // invoke-virtual {v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getUserId()Ljava/lang/String;
	 /* invoke-direct {v1, v0}, Le/h/d/a/a/s/k0/v;-><init>(Ljava/lang/String;)V */
	 (( e.h.d.a.a.s.k0.v ) v1 ).a ( p1 ); // invoke-virtual {v1, p1}, Le/h/d/a/a/s/k0/v;->a(Landroid/database/sqlite/SQLiteDatabase;)Lcom/orange/oab/contactless/packid/hce/user/User;
} // :goto_0
} // .end method
public java.lang.Object a ( android.database.sqlite.SQLiteDatabase p0 ) { //bridge//synthethic
/* .locals 0 */
/* .line 1 */
(( e.h.d.a.a.s.k0.r ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/s/k0/r;->a(Landroid/database/sqlite/SQLiteDatabase;)Lcom/orange/oab/contactless/packid/hce/user/User;
} // .end method
