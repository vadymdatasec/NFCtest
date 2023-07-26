public class e.h.d.a.a.s.k0.a0 extends e.h.d.a.a.s.k0.z {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Le/h/d/a/a/s/k0/z<", */
	 /* "Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* # instance fields */
public com.orange.oab.contactless.packid.hce.user.wallet.Tenant c;
/* # direct methods */
public e.h.d.a.a.s.k0.a0 ( ) {
	 /* .locals 1 */
	 final String v0 = "tenant"; // const-string v0, "tenant"
	 /* .line 1 */
	 /* invoke-direct {p0, p1, v0}, Le/h/d/a/a/s/k0/z;-><init>(Ljava/lang/Object;Ljava/lang/String;)V */
	 /* .line 2 */
	 this.c = p1;
	 return;
} // .end method
/* # virtual methods */
public android.content.ContentValues a ( com.orange.oab.contactless.packid.hce.user.wallet.Tenant p0 ) {
	 /* .locals 3 */
	 /* .line 3 */
	 /* new-instance v0, Landroid/content/ContentValues; */
	 /* invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V */
	 /* .line 4 */
	 (( com.orange.oab.contactless.packid.hce.user.wallet.Tenant ) p1 ).getName ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;->getName()Ljava/lang/String;
	 final String v2 = "name"; // const-string v2, "name"
	 (( android.content.ContentValues ) v0 ).put ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
	 /* .line 5 */
	 (( com.orange.oab.contactless.packid.hce.user.wallet.Tenant ) p1 ).getLogoUrl ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;->getLogoUrl()Ljava/lang/String;
	 final String v2 = "logoUrl"; // const-string v2, "logoUrl"
	 (( android.content.ContentValues ) v0 ).put ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
	 /* .line 6 */
	 p1 = 	 (( com.orange.oab.contactless.packid.hce.user.wallet.Tenant ) p1 ).shouldSendEnrollmentNotification ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;->shouldSendEnrollmentNotification()Z
	 java.lang.Boolean .valueOf ( p1 );
	 final String v1 = "shouldSendEnrollmentNotification"; // const-string v1, "shouldSendEnrollmentNotification"
	 (( android.content.ContentValues ) v0 ).put ( v1, p1 ); // invoke-virtual {v0, v1, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V
} // .end method
public android.content.ContentValues a ( java.lang.Object p0 ) { //bridge//synthethic
	 /* .locals 0 */
	 /* .line 1 */
	 /* check-cast p1, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant; */
	 (( e.h.d.a.a.s.k0.a0 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/s/k0/a0;->a(Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;)Landroid/content/ContentValues;
} // .end method
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
/* .line 2 */
v0 = this.c;
(( e.h.d.a.a.s.k0.a0 ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/h/d/a/a/s/k0/a0;->a(Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;)Landroid/content/ContentValues;
int v1 = 0; // const/4 v1, 0x0
final String v2 = "tenant"; // const-string v2, "tenant"
(( android.database.sqlite.SQLiteDatabase ) p1 ).replace ( v2, v1, v0 ); // invoke-virtual {p1, v2, v1, v0}, Landroid/database/sqlite/SQLiteDatabase;->replace(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
} // .end method
