public class e.h.d.a.a.s.k0.p extends e.h.d.a.a.s.k0.o {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Le/h/d/a/a/s/k0/o<", */
	 /* "Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* # direct methods */
public e.h.d.a.a.s.k0.p ( ) {
	 /* .locals 7 */
	 int v0 = 1; // const/4 v0, 0x1
	 /* new-array v5, v0, [Ljava/lang/String; */
	 int v0 = 0; // const/4 v0, 0x0
	 /* aput-object p1, v5, v0 */
	 final String v2 = "tenant"; // const-string v2, "tenant"
	 final String v3 = "name"; // const-string v3, "name"
	 final String v4 = "name = ?"; // const-string v4, "name = ?"
	 final String v6 = "1"; // const-string v6, "1"
	 /* move-object v1, p0 */
	 /* .line 1 */
	 /* invoke-direct/range {v1 ..v6}, Le/h/d/a/a/s/k0/o;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)V */
	 return;
} // .end method
/* # virtual methods */
public com.orange.oab.contactless.packid.hce.user.wallet.Tenant a ( android.database.Cursor p0 ) {
	 /* .locals 2 */
	 /* .line 2 */
	 /* new-instance v0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant; */
	 /* invoke-direct {v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;-><init>()V */
	 final String v1 = "name"; // const-string v1, "name"
	 /* .line 3 */
	 v1 = 	 e.h.d.a.a.m .a ( v1,p1 );
	 (( com.orange.oab.contactless.packid.hce.user.wallet.Tenant ) v0 ).setName ( v1 ); // invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;->setName(Ljava/lang/String;)V
	 final String v1 = "logoUrl"; // const-string v1, "logoUrl"
	 /* .line 4 */
	 v1 = 	 e.h.d.a.a.m .a ( v1,p1 );
	 (( com.orange.oab.contactless.packid.hce.user.wallet.Tenant ) v0 ).setLogoUrl ( v1 ); // invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;->setLogoUrl(Ljava/lang/String;)V
	 final String v1 = "shouldSendEnrollmentNotification"; // const-string v1, "shouldSendEnrollmentNotification"
	 /* .line 5 */
	 p1 = 	 v1 = 	 e.h.d.a.a.m .a ( v1,p1 );
	 if ( p1 != null) { // if-eqz p1, :cond_0
		 int p1 = 1; // const/4 p1, 0x1
	 } // :cond_0
	 int p1 = 0; // const/4 p1, 0x0
} // :goto_0
(( com.orange.oab.contactless.packid.hce.user.wallet.Tenant ) v0 ).setShouldSendEnrollmentNotification ( p1 ); // invoke-virtual {v0, p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;->setShouldSendEnrollmentNotification(Z)V
} // .end method
public java.lang.Object a ( android.database.Cursor p0 ) { //bridge//synthethic
/* .locals 0 */
/* .line 1 */
(( e.h.d.a.a.s.k0.p ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/s/k0/p;->a(Landroid/database/Cursor;)Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;
} // .end method
public com.orange.oab.contactless.packid.hce.user.wallet.Tenant b ( android.database.sqlite.SQLiteDatabase p0 ) {
/* .locals 1 */
/* .line 1 */
(( e.h.d.a.a.s.k0.o ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/s/k0/o;->a(Landroid/database/sqlite/SQLiteDatabase;)Ljava/util/List;
v0 = /* .line 2 */
if ( v0 != null) { // if-eqz v0, :cond_0
	 int p1 = 0; // const/4 p1, 0x0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 3 */
/* check-cast p1, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant; */
} // .end method
