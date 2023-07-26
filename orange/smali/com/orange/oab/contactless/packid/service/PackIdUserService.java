public class com.orange.oab.contactless.packid.service.PackIdUserService extends android.app.Service {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/orange/oab/contactless/packid/service/PackIdUserService$Binder; */
	 /* } */
} // .end annotation
/* # instance fields */
public final com.orange.oab.contactless.packid.service.PackIdUserService$Binder b;
/* # direct methods */
public com.orange.oab.contactless.packid.service.PackIdUserService ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 /* invoke-direct {p0}, Landroid/app/Service;-><init>()V */
	 /* .line 2 */
	 /* new-instance v0, Lcom/orange/oab/contactless/packid/service/PackIdUserService$Binder; */
	 /* invoke-direct {v0, p0}, Lcom/orange/oab/contactless/packid/service/PackIdUserService$Binder;-><init>(Lcom/orange/oab/contactless/packid/service/PackIdUserService;)V */
	 this.b = v0;
	 return;
} // .end method
/* # virtual methods */
public com.orange.oab.contactless.packid.hce.user.User createDefaultUser ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 /* new-instance v0, Lcom/orange/business/packid/android/lib/PackId; */
	 /* invoke-direct {v0, p0}, Lcom/orange/business/packid/android/lib/PackId;-><init>(Landroid/content/Context;)V */
	 (( com.orange.business.packid.android.lib.PackId ) v0 ).createDefaultUser ( ); // invoke-virtual {v0}, Lcom/orange/business/packid/android/lib/PackId;->createDefaultUser()Lcom/orange/oab/contactless/packid/hce/user/User;
} // .end method
public void delete ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 /* new-instance v0, Lcom/orange/business/packid/android/lib/PackId; */
	 /* invoke-direct {v0, p0}, Lcom/orange/business/packid/android/lib/PackId;-><init>(Landroid/content/Context;)V */
	 (( com.orange.business.packid.android.lib.PackId ) v0 ).clear ( ); // invoke-virtual {v0}, Lcom/orange/business/packid/android/lib/PackId;->clear()V
	 return;
} // .end method
public com.orange.oab.contactless.packid.hce.user.User get ( ) {
	 /* .locals 3 */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Lcom/orange/oab/contactless/packid/service/NoUserException;, */
	 /* Lcom/orange/oab/contactless/packid/service/MultiUsersException; */
	 /* } */
} // .end annotation
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
/* .line 1 */
(( com.orange.oab.contactless.packid.service.PackIdUserService ) p0 ).getAll ( ); // invoke-virtual {p0}, Lcom/orange/oab/contactless/packid/service/PackIdUserService;->getAll()Ljava/util/List;
v1 = /* .line 2 */
int v2 = 1; // const/4 v2, 0x1
/* if-gt v1, v2, :cond_0 */
int v1 = 0; // const/4 v1, 0x0
/* .line 3 */
/* check-cast v0, Lcom/orange/oab/contactless/packid/hce/user/User; */
/* .line 4 */
} // :cond_0
/* new-instance v0, Lcom/orange/oab/contactless/packid/service/MultiUsersException; */
/* invoke-direct {v0}, Lcom/orange/oab/contactless/packid/service/MultiUsersException;-><init>()V */
/* throw v0 */
} // .end method
public com.orange.oab.contactless.packid.hce.user.User get ( com.orange.oab.contactless.packid.hce.user.wallet.Badge p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/orange/oab/contactless/packid/service/NoUserException; */
/* } */
} // .end annotation
/* .line 5 */
e.h.d.a.a.s.m .c ( p0 );
(( e.h.d.a.a.s.g0 ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Le/h/d/a/a/s/g0;->a(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)Lcom/orange/oab/contactless/packid/hce/user/User;
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 6 */
} // :cond_0
/* new-instance p1, Lcom/orange/oab/contactless/packid/service/NoUserException; */
/* invoke-direct {p1}, Lcom/orange/oab/contactless/packid/service/NoUserException;-><init>()V */
/* throw p1 */
} // .end method
public java.util.List getAll ( ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/List<", */
/* "Lcom/orange/oab/contactless/packid/hce/user/User;", */
/* ">;" */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/orange/oab/contactless/packid/service/NoUserException; */
/* } */
} // .end annotation
/* .line 1 */
/* new-instance v0, Lcom/orange/business/packid/android/lib/PackId; */
/* invoke-direct {v0, p0}, Lcom/orange/business/packid/android/lib/PackId;-><init>(Landroid/content/Context;)V */
(( com.orange.business.packid.android.lib.PackId ) v0 ).getUsers ( ); // invoke-virtual {v0}, Lcom/orange/business/packid/android/lib/PackId;->getUsers()Ljava/util/List;
if ( v0 != null) { // if-eqz v0, :cond_0
v1 = /* .line 2 */
/* if-nez v1, :cond_0 */
/* .line 3 */
} // :cond_0
/* new-instance v0, Lcom/orange/oab/contactless/packid/service/NoUserException; */
/* invoke-direct {v0}, Lcom/orange/oab/contactless/packid/service/NoUserException;-><init>()V */
/* throw v0 */
} // .end method
public Boolean isHceFeatureSupported ( ) {
/* .locals 2 */
/* .line 1 */
(( android.app.Service ) p0 ).getPackageManager ( ); // invoke-virtual {p0}, Landroid/app/Service;->getPackageManager()Landroid/content/pm/PackageManager;
final String v1 = "android.hardware.nfc.hce"; // const-string v1, "android.hardware.nfc.hce"
v0 = (( android.content.pm.PackageManager ) v0 ).hasSystemFeature ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z
} // .end method
public Boolean isNfcEnabled ( ) {
/* .locals 1 */
final String v0 = "nfc"; // const-string v0, "nfc"
/* .line 1 */
(( android.app.Service ) p0 ).getSystemService ( v0 ); // invoke-virtual {p0, v0}, Landroid/app/Service;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v0, Landroid/nfc/NfcManager; */
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
} // :cond_0
(( android.nfc.NfcManager ) v0 ).getDefaultAdapter ( ); // invoke-virtual {v0}, Landroid/nfc/NfcManager;->getDefaultAdapter()Landroid/nfc/NfcAdapter;
} // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 3 */
v0 = (( android.nfc.NfcAdapter ) v0 ).isEnabled ( ); // invoke-virtual {v0}, Landroid/nfc/NfcAdapter;->isEnabled()Z
if ( v0 != null) { // if-eqz v0, :cond_1
int v0 = 1; // const/4 v0, 0x1
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // :goto_1
} // .end method
public android.os.IBinder onBind ( android.content.Intent p0 ) {
/* .locals 1 */
final String p1 = "packid.UserService"; // const-string p1, "packid.UserService"
final String v0 = "onBind called"; // const-string v0, "onBind called"
/* .line 1 */
android.util.Log .d ( p1,v0 );
/* .line 2 */
p1 = this.b;
} // .end method
public void register ( android.net.Uri p0 ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Lcom/orange/business/packid/android/lib/PackId; */
/* invoke-direct {v0, p0}, Lcom/orange/business/packid/android/lib/PackId;-><init>(Landroid/content/Context;)V */
(( com.orange.business.packid.android.lib.PackId ) v0 ).register ( p1 ); // invoke-virtual {v0, p1}, Lcom/orange/business/packid/android/lib/PackId;->register(Landroid/net/Uri;)V
return;
} // .end method
public void update ( ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Lcom/orange/business/packid/android/lib/PackId; */
/* invoke-direct {v0, p0}, Lcom/orange/business/packid/android/lib/PackId;-><init>(Landroid/content/Context;)V */
int v1 = 1; // const/4 v1, 0x1
(( com.orange.business.packid.android.lib.PackId ) v0 ).update ( v1 ); // invoke-virtual {v0, v1}, Lcom/orange/business/packid/android/lib/PackId;->update(Z)V
return;
} // .end method
public void update ( Boolean p0 ) {
/* .locals 1 */
/* .line 2 */
/* new-instance v0, Lcom/orange/business/packid/android/lib/PackId; */
/* invoke-direct {v0, p0}, Lcom/orange/business/packid/android/lib/PackId;-><init>(Landroid/content/Context;)V */
(( com.orange.business.packid.android.lib.PackId ) v0 ).update ( p1 ); // invoke-virtual {v0, p1}, Lcom/orange/business/packid/android/lib/PackId;->update(Z)V
return;
} // .end method
