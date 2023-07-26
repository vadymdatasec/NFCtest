public class e.h.d.a.a.n.p extends e.h.d.a.a.n.m {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static java.util.concurrent.atomic.AtomicBoolean f;
	 /* # instance fields */
	 public Boolean b;
	 public java.lang.String c;
	 public fr.mbs.binary.Octets d;
	 public Boolean e;
	 /* # direct methods */
	 public static e.h.d.a.a.n.p ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean; */
		 int v1 = 0; // const/4 v1, 0x0
		 /* invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V */
		 return;
	 } // .end method
	 public e.h.d.a.a.n.p ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0, p1}, Le/h/d/a/a/n/m;-><init>(Landroid/content/Context;)V */
		 return;
	 } // .end method
	 public static Boolean a ( java.lang.String p0 ) { //synthethic
		 /* .locals 3 */
		 /* .line 76 */
		 try { // :try_start_0
			 /* new-instance v0, Lorg/json/JSONObject; */
			 /* invoke-direct {v0, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V */
			 final String v1 = "error"; // const-string v1, "error"
			 (( org.json.JSONObject ) v0 ).getString ( v1 ); // invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
			 final String v1 = "invalid.host"; // const-string v1, "invalid.host"
			 p0 = 			 (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
			 /* :try_end_0 */
			 /* .catch Lorg/json/JSONException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* :catch_0 */
			 /* move-exception v0 */
			 /* .line 77 */
			 /* new-instance v1, Ljava/lang/StringBuilder; */
			 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
			 final String v2 = "Unexpected 403 response content: "; // const-string v2, "Unexpected 403 response content: "
			 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
			 final String v1 = "packid.userLoader"; // const-string v1, "packid.userLoader"
			 android.util.Log .e ( v1,p0,v0 );
			 int p0 = 0; // const/4 p0, 0x0
		 } // .end method
		 public static Boolean b ( java.lang.String p0 ) { //synthethic
			 /* .locals 1 */
			 final String v0 = "Pack ID server has not found this user"; // const-string v0, "Pack ID server has not found this user"
			 /* .line 22 */
			 p0 = 			 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
		 } // .end method
		 /* # virtual methods */
		 public final java.lang.String a ( ) {
			 /* .locals 2 */
			 /* .line 19 */
			 v0 = this.a;
			 final String v1 = "nfc"; // const-string v1, "nfc"
			 (( android.content.Context ) v0 ).getSystemService ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
			 /* check-cast v0, Landroid/nfc/NfcManager; */
			 /* .line 20 */
			 (( android.nfc.NfcManager ) v0 ).getDefaultAdapter ( ); // invoke-virtual {v0}, Landroid/nfc/NfcManager;->getDefaultAdapter()Landroid/nfc/NfcAdapter;
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 final String v0 = "compatible"; // const-string v0, "compatible"
			 } // :cond_0
			 final String v0 = "incompatible"; // const-string v0, "incompatible"
		 } // .end method
		 public final java.lang.String a ( com.android.volley.VolleyError p0 ) {
			 /* .locals 2 */
			 /* .line 81 */
			 /* new-instance v0, Ljava/lang/String; */
			 p1 = this.b;
			 p1 = this.b;
			 v1 = java.nio.charset.StandardCharsets.UTF_8;
			 /* invoke-direct {v0, p1, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V */
		 } // .end method
		 public void a ( android.net.Uri p0 ) {
			 /* .locals 3 */
			 /* .line 9 */
			 /* new-instance v0, Ljava/util/HashMap; */
			 /* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
			 /* .line 10 */
			 v1 = android.os.Build.MODEL;
			 final String v2 = "deviceModel"; // const-string v2, "deviceModel"
			 (( java.util.HashMap ) v0 ).put ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
			 /* .line 11 */
			 v1 = android.os.Build.MANUFACTURER;
			 final String v2 = "deviceManufacturer"; // const-string v2, "deviceManufacturer"
			 (( java.util.HashMap ) v0 ).put ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
			 final String v1 = "libraryVersion"; // const-string v1, "libraryVersion"
			 final String v2 = "267"; // const-string v2, "267"
			 /* .line 12 */
			 (( java.util.HashMap ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
			 /* .line 13 */
			 v1 = android.os.Build$VERSION.RELEASE;
			 final String v2 = "osVersion"; // const-string v2, "osVersion"
			 (( java.util.HashMap ) v0 ).put ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
			 /* .line 14 */
			 (( e.h.d.a.a.n.p ) p0 ).b ( ); // invoke-virtual {p0}, Le/h/d/a/a/n/p;->b()Ljava/lang/String;
			 final String v2 = "applicationVersion"; // const-string v2, "applicationVersion"
			 (( java.util.HashMap ) v0 ).put ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
			 /* .line 15 */
			 (( e.h.d.a.a.n.p ) p0 ).a ( ); // invoke-virtual {p0}, Le/h/d/a/a/n/p;->a()Ljava/lang/String;
			 final String v2 = "nfc"; // const-string v2, "nfc"
			 (( java.util.HashMap ) v0 ).put ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
			 /* .line 16 */
			 v1 = this.c;
			 final String v2 = "firebaseToken"; // const-string v2, "firebaseToken"
			 (( java.util.HashMap ) v0 ).put ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
			 /* .line 17 */
			 (( java.util.HashMap ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/util/HashMap;->toString()Ljava/lang/String;
			 final String v2 = "packid.userLoader"; // const-string v2, "packid.userLoader"
			 android.util.Log .i ( v2,v1 );
			 /* .line 18 */
			 /* invoke-super {p0, p1, v0}, Le/h/d/a/a/n/m;->a(Landroid/net/Uri;Ljava/util/Map;)V */
			 return;
		 } // .end method
		 public void a ( android.net.Uri p0, java.lang.String p1 ) {
			 /* .locals 4 */
			 /* .annotation system Ldalvik/annotation/Throws; */
			 /* value = { */
			 /* Lcom/orange/oab/contactless/packid/g/u/e;, */
			 /* Lorg/json/JSONException;, */
			 /* Le/h/d/a/a/n/e; */
			 /* } */
		 } // .end annotation
		 /* .line 21 */
		 v0 = this.a;
		 e.h.d.a.a.n.w.c .b ( v0 );
		 /* .line 22 */
		 /* new-instance v1, Le/h/d/a/a/n/v; */
		 /* invoke-direct {v1, v0}, Le/h/d/a/a/n/v;-><init>(Le/h/d/a/a/n/w/c;)V */
		 /* new-instance v0, Lorg/json/JSONObject; */
		 /* invoke-direct {v0, p2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V */
		 (( e.h.d.a.a.n.v ) v1 ).a ( v0 ); // invoke-virtual {v1, v0}, Le/h/d/a/a/n/v;->a(Lorg/json/JSONObject;)Lcom/orange/oab/contactless/packid/hce/user/User;
		 /* .line 23 */
		 (( com.orange.oab.contactless.packid.hce.user.User ) p2 ).getApplicationIds ( ); // invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/User;->getApplicationIds()Ljava/util/Set;
		 (( e.h.d.a.a.n.p ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/h/d/a/a/n/p;->a(Ljava/util/Set;)V
		 /* .line 24 */
		 v0 = this.d;
		 int v1 = 0; // const/4 v1, 0x0
		 /* if-nez v0, :cond_0 */
		 /* .line 25 */
		 (( e.h.d.a.a.n.p ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/n/p;->b(Landroid/net/Uri;)Landroid/net/Uri;
		 v0 = this.a;
		 (( com.orange.oab.contactless.packid.hce.user.User ) p2 ).setUri ( p1, v0 ); // invoke-virtual {p2, p1, v0}, Lcom/orange/oab/contactless/packid/hce/user/User;->setUri(Landroid/net/Uri;Landroid/content/Context;)V
		 int p1 = 1; // const/4 p1, 0x1
		 /* .line 26 */
		 (( com.orange.oab.contactless.packid.hce.user.User ) p2 ).setSendEnrolmentNotification ( p1 ); // invoke-virtual {p2, p1}, Lcom/orange/oab/contactless/packid/hce/user/User;->setSendEnrolmentNotification(Z)V
		 /* .line 27 */
	 } // :cond_0
	 (( com.orange.oab.contactless.packid.hce.user.User ) p2 ).setCipheredUri ( v0 ); // invoke-virtual {p2, v0}, Lcom/orange/oab/contactless/packid/hce/user/User;->setCipheredUri(Lfr/mbs/binary/Octets;)V
	 /* .line 28 */
	 (( com.orange.oab.contactless.packid.hce.user.User ) p2 ).setSendEnrolmentNotification ( v1 ); // invoke-virtual {p2, v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->setSendEnrolmentNotification(Z)V
	 /* .line 29 */
} // :goto_0
(( com.orange.oab.contactless.packid.hce.user.User ) p2 ).getWallet ( ); // invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/User;->getWallet()Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;
p1 = (( com.orange.oab.contactless.packid.hce.user.wallet.Wallet ) p1 ).getBadges ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;->getBadges()Ljava/util/List;
/* if-nez p1, :cond_1 */
/* .line 30 */
p1 = this.a;
final String v0 = "========="; // const-string v0, "========="
com.orange.oab.contactless.packid.service.LogManager .writeToPersistentLog ( p1,v0,v1 );
/* .line 31 */
p1 = this.a;
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "ALL BADGES WERE DELETED ON UPDATE tenant : "; // const-string v3, "ALL BADGES WERE DELETED ON UPDATE tenant : "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( com.orange.oab.contactless.packid.hce.user.User ) p2 ).getTenant ( ); // invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/User;->getTenant()Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;
(( com.orange.oab.contactless.packid.hce.user.wallet.Tenant ) v3 ).getName ( ); // invoke-virtual {v3}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;->getName()Ljava/lang/String;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.orange.oab.contactless.packid.service.LogManager .writeToPersistentLog ( p1,v2 );
/* .line 32 */
p1 = this.a;
com.orange.oab.contactless.packid.service.LogManager .writeToPersistentLog ( p1,v0,v1 );
/* .line 33 */
} // :cond_1
p1 = this.a;
e.h.d.a.a.s.m .c ( p1 );
(( e.h.d.a.a.s.g0 ) p1 ).a ( p2 ); // invoke-virtual {p1, p2}, Le/h/d/a/a/s/g0;->a(Lcom/orange/oab/contactless/packid/hce/user/User;)Le/h/d/a/a/p/a/a/a;
/* .line 34 */
(( e.h.d.a.a.n.p ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/n/p;->a(Le/h/d/a/a/p/a/a/a;)V
/* .line 35 */
(( com.orange.oab.contactless.packid.hce.user.User ) p2 ).getTenant ( ); // invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/User;->getTenant()Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;
p1 = (( com.orange.oab.contactless.packid.hce.user.wallet.Tenant ) p1 ).shouldSendEnrollmentNotification ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;->shouldSendEnrollmentNotification()Z
if ( p1 != null) { // if-eqz p1, :cond_2
p1 = (( com.orange.oab.contactless.packid.hce.user.User ) p2 ).isSendEnrolmentNotification ( ); // invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/User;->isSendEnrolmentNotification()Z
if ( p1 != null) { // if-eqz p1, :cond_2
	 /* .line 36 */
	 (( e.h.d.a.a.n.p ) p0 ).a ( p2, v1 ); // invoke-virtual {p0, p2, v1}, Le/h/d/a/a/n/p;->a(Lcom/orange/oab/contactless/packid/hce/user/User;Z)V
} // :cond_2
return;
} // .end method
public void a ( com.orange.oab.contactless.packid.hce.user.User p0, Boolean p1 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/orange/oab/contactless/packid/g/u/e; */
/* } */
} // .end annotation
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
(( e.h.d.a.a.n.p ) p0 ).a ( p1, p2, v0 ); // invoke-virtual {p0, p1, p2, v0}, Le/h/d/a/a/n/p;->a(Lcom/orange/oab/contactless/packid/hce/user/User;ZLjava/lang/String;)V
return;
} // .end method
public void a ( com.orange.oab.contactless.packid.hce.user.User p0, Boolean p1, java.lang.String p2 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/orange/oab/contactless/packid/g/u/e; */
/* } */
} // .end annotation
/* .line 2 */
/* iput-boolean p2, p0, Le/h/d/a/a/n/p;->b:Z */
/* .line 3 */
this.c = p3;
/* .line 4 */
(( com.orange.oab.contactless.packid.hce.user.User ) p1 ).getCipheredUri ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/User;->getCipheredUri()Lfr/mbs/binary/Octets;
this.d = p2;
/* .line 5 */
p2 = this.a;
(( com.orange.oab.contactless.packid.hce.user.User ) p1 ).getUri ( p2 ); // invoke-virtual {p1, p2}, Lcom/orange/oab/contactless/packid/hce/user/User;->getUri(Landroid/content/Context;)Landroid/net/Uri;
(( android.net.Uri ) p2 ).toString ( ); // invoke-virtual {p2}, Landroid/net/Uri;->toString()Ljava/lang/String;
android.net.Uri .parse ( p2 );
(( android.net.Uri ) p2 ).buildUpon ( ); // invoke-virtual {p2}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;
/* .line 6 */
p3 = (( com.orange.oab.contactless.packid.hce.user.User ) p1 ).isSendEnrolmentNotification ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/User;->isSendEnrolmentNotification()Z
if ( p3 != null) { // if-eqz p3, :cond_0
p3 = e.h.d.a.a.n.p.f;
int v0 = 0; // const/4 v0, 0x0
int v1 = 1; // const/4 v1, 0x1
p3 = (( java.util.concurrent.atomic.AtomicBoolean ) p3 ).compareAndSet ( v0, v1 ); // invoke-virtual {p3, v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z
/* if-nez p3, :cond_0 */
/* .line 7 */
p1 = (( com.orange.oab.contactless.packid.hce.user.User ) p1 ).isSendEnrolmentNotification ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/User;->isSendEnrolmentNotification()Z
java.lang.String .valueOf ( p1 );
final String p3 = "sendEnrolmentNotification"; // const-string p3, "sendEnrolmentNotification"
(( android.net.Uri$Builder ) p2 ).appendQueryParameter ( p3, p1 ); // invoke-virtual {p2, p3, p1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
/* .line 8 */
} // :cond_0
(( android.net.Uri$Builder ) p2 ).build ( ); // invoke-virtual {p2}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;
(( e.h.d.a.a.n.p ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/n/p;->a(Landroid/net/Uri;)V
return;
} // .end method
public void a ( Object p0 ) {
/* .locals 2 */
/* .line 40 */
v0 = this.a;
com.orange.oab.contactless.packid.service.Aid .register ( v0 );
/* .line 41 */
/* iget-boolean v0, p0, Le/h/d/a/a/n/p;->e:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 42 */
/* new-instance v0, Le/h/d/a/a/r/a; */
v1 = this.a;
/* invoke-direct {v0, v1}, Le/h/d/a/a/r/a;-><init>(Landroid/content/Context;)V */
(( e.h.d.a.a.r.a ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Le/h/d/a/a/r/a;->a(Le/h/d/a/a/p/a/a/a;)V
} // :cond_0
return;
} // .end method
public final void a ( fr.mbs.binary.Octets p0 ) {
/* .locals 1 */
/* .line 74 */
v0 = this.a;
e.h.d.a.a.s.m .c ( v0 );
(( e.h.d.a.a.s.g0 ) v0 ).b ( p1 ); // invoke-virtual {v0, p1}, Le/h/d/a/a/s/g0;->b(Lfr/mbs/binary/Octets;)Lcom/orange/oab/contactless/packid/hce/user/User;
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 75 */
v0 = this.a;
e.h.d.a.a.s.m .c ( v0 );
(( com.orange.oab.contactless.packid.hce.user.User ) p1 ).getId ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/User;->getId()Ljava/lang/String;
(( e.h.d.a.a.s.g0 ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Le/h/d/a/a/s/g0;->a(Ljava/lang/String;)V
} // :cond_0
return;
} // .end method
public final void a ( fr.mbs.binary.Octets p0, Integer p1 ) {
/* .locals 2 */
/* .line 70 */
(( e.h.d.a.a.n.p ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/n/p;->a(Lfr/mbs/binary/Octets;)V
/* .line 71 */
p1 = this.a;
int v0 = 0; // const/4 v0, 0x0
final String v1 = "========="; // const-string v1, "========="
com.orange.oab.contactless.packid.service.LogManager .writeToPersistentLog ( p1,v1,v0 );
/* .line 72 */
p1 = this.a;
(( android.content.Context ) p1 ).getString ( p2 ); // invoke-virtual {p1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;
com.orange.oab.contactless.packid.service.LogManager .writeToPersistentLog ( p1,p2 );
/* .line 73 */
p1 = this.a;
com.orange.oab.contactless.packid.service.LogManager .writeToPersistentLog ( p1,v1,v0 );
return;
} // .end method
public void a ( java.lang.Throwable p0 ) {
/* .locals 1 */
/* .line 37 */
v0 = this.d;
(( e.h.d.a.a.n.p ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Le/h/d/a/a/n/p;->a(Ljava/lang/Throwable;Lfr/mbs/binary/Octets;)V
/* .line 38 */
/* iget-boolean p1, p0, Le/h/d/a/a/n/p;->e:Z */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 39 */
/* new-instance p1, Le/h/d/a/a/r/a; */
v0 = this.a;
/* invoke-direct {p1, v0}, Le/h/d/a/a/r/a;-><init>(Landroid/content/Context;)V */
(( e.h.d.a.a.r.a ) p1 ).c ( ); // invoke-virtual {p1}, Le/h/d/a/a/r/a;->c()V
} // :cond_0
return;
} // .end method
public void a ( java.lang.Throwable p0, fr.mbs.binary.Octets p1 ) {
/* .locals 2 */
/* .line 43 */
/* new-instance v0, Le/h/d/a/a/r/a; */
v1 = this.a;
/* invoke-direct {v0, v1}, Le/h/d/a/a/r/a;-><init>(Landroid/content/Context;)V */
/* .line 44 */
/* instance-of v1, p1, Lcom/android/volley/NoConnectionError; */
/* if-nez v1, :cond_8 */
/* instance-of v1, p1, Ljava/net/UnknownHostException; */
if ( v1 != null) { // if-eqz v1, :cond_0
/* goto/16 :goto_0 */
/* .line 45 */
} // :cond_0
/* instance-of v1, p1, Le/h/d/a/a/n/e; */
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 46 */
(( e.h.d.a.a.n.p ) p0 ).a ( p2, p1 ); // invoke-virtual {p0, p2, p1}, Le/h/d/a/a/n/p;->a(Lfr/mbs/binary/Octets;I)V
/* .line 47 */
(( e.h.d.a.a.r.a ) v0 ).b ( p1 ); // invoke-virtual {v0, p1}, Le/h/d/a/a/r/a;->b(I)V
return;
} // :cond_1
/* if-nez p2, :cond_2 */
/* .line 48 */
(( e.h.d.a.a.r.a ) v0 ).b ( p1 ); // invoke-virtual {v0, p1}, Le/h/d/a/a/r/a;->b(I)V
return;
/* .line 49 */
} // :cond_2
v1 = (( e.h.d.a.a.n.p ) p0 ).f ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/n/p;->f(Ljava/lang/Throwable;)Z
if ( v1 != null) { // if-eqz v1, :cond_4
/* .line 50 */
p2 = (( e.h.d.a.a.n.p ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/n/p;->b(Ljava/lang/Throwable;)I
/* .line 51 */
/* iget-boolean v1, p0, Le/h/d/a/a/n/p;->b:Z */
if ( v1 != null) { // if-eqz v1, :cond_3
(( e.h.d.a.a.r.a ) v0 ).a ( p2 ); // invoke-virtual {v0, p2}, Le/h/d/a/a/r/a;->a(I)V
/* .line 52 */
} // :cond_3
v0 = this.a;
(( android.content.Context ) v0 ).getString ( p2 ); // invoke-virtual {v0, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;
com.orange.oab.contactless.packid.report.ReportSender .send ( p2,p1 );
return;
/* .line 53 */
} // :cond_4
v1 = (( e.h.d.a.a.n.p ) p0 ).e ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/n/p;->e(Ljava/lang/Throwable;)Z
if ( v1 != null) { // if-eqz v1, :cond_5
/* .line 54 */
(( e.h.d.a.a.n.p ) p0 ).a ( p2, p1 ); // invoke-virtual {p0, p2, p1}, Le/h/d/a/a/n/p;->a(Lfr/mbs/binary/Octets;I)V
/* .line 55 */
(( e.h.d.a.a.r.a ) v0 ).b ( p1 ); // invoke-virtual {v0, p1}, Le/h/d/a/a/r/a;->b(I)V
return;
/* .line 56 */
} // :cond_5
v1 = (( e.h.d.a.a.n.p ) p0 ).g ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/n/p;->g(Ljava/lang/Throwable;)Z
if ( v1 != null) { // if-eqz v1, :cond_6
/* .line 57 */
(( e.h.d.a.a.n.p ) p0 ).a ( p2, p1 ); // invoke-virtual {p0, p2, p1}, Le/h/d/a/a/n/p;->a(Lfr/mbs/binary/Octets;I)V
/* .line 58 */
(( e.h.d.a.a.r.a ) v0 ).c ( ); // invoke-virtual {v0}, Le/h/d/a/a/r/a;->c()V
/* .line 59 */
(( e.h.d.a.a.r.a ) v0 ).b ( p1 ); // invoke-virtual {v0, p1}, Le/h/d/a/a/r/a;->b(I)V
return;
/* .line 60 */
} // :cond_6
v1 = (( e.h.d.a.a.n.p ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/n/p;->c(Ljava/lang/Throwable;)Z
if ( v1 != null) { // if-eqz v1, :cond_7
/* .line 61 */
(( e.h.d.a.a.n.p ) p0 ).a ( p2, p1 ); // invoke-virtual {p0, p2, p1}, Le/h/d/a/a/n/p;->a(Lfr/mbs/binary/Octets;I)V
/* .line 62 */
(( e.h.d.a.a.r.a ) v0 ).c ( ); // invoke-virtual {v0}, Le/h/d/a/a/r/a;->c()V
/* .line 63 */
(( e.h.d.a.a.r.a ) v0 ).b ( p1 ); // invoke-virtual {v0, p1}, Le/h/d/a/a/r/a;->b(I)V
return;
} // :cond_7
final String p2 = "packid.userLoader"; // const-string p2, "packid.userLoader"
final String v1 = "error occured"; // const-string v1, "error occured"
/* .line 64 */
android.util.Log .d ( p2,v1,p1 );
/* .line 65 */
p2 = this.a;
(( android.content.Context ) p2 ).getString ( v1 ); // invoke-virtual {p2, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;
com.orange.oab.contactless.packid.report.ReportSender .send ( p2,p1 );
/* .line 66 */
(( e.h.d.a.a.r.a ) v0 ).b ( p1 ); // invoke-virtual {v0, p1}, Le/h/d/a/a/r/a;->b(I)V
return;
/* .line 67 */
} // :cond_8
} // :goto_0
/* iget-boolean p2, p0, Le/h/d/a/a/n/p;->b:Z */
if ( p2 != null) { // if-eqz p2, :cond_9
p1 = (( e.h.d.a.a.n.p ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/n/p;->b(Ljava/lang/Throwable;)I
(( e.h.d.a.a.r.a ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Le/h/d/a/a/r/a;->a(I)V
} // :cond_9
return;
} // .end method
public final void a ( java.util.Set p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/Set<", */
/* "Ljava/lang/String;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Le/h/d/a/a/n/e; */
/* } */
} // .end annotation
if ( p1 != null) { // if-eqz p1, :cond_1
v0 = /* .line 68 */
/* if-nez v0, :cond_1 */
v0 = this.a;
p1 = (( android.content.Context ) v0 ).getPackageName ( ); // invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 69 */
} // :cond_0
/* new-instance p1, Le/h/d/a/a/n/e; */
/* invoke-direct {p1}, Le/h/d/a/a/n/e;-><init>()V */
/* throw p1 */
} // :cond_1
} // :goto_0
return;
} // .end method
public final Boolean a ( java.lang.Throwable p0, Integer p1 ) {
/* .locals 1 */
/* .line 78 */
/* instance-of v0, p1, Lcom/android/volley/VolleyError; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* check-cast p1, Lcom/android/volley/VolleyError; */
p1 = this.b;
if ( p1 != null) { // if-eqz p1, :cond_0
/* iget p1, p1, Le/a/a/l;->a:I */
/* if-ne p1, p2, :cond_0 */
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
public final Boolean a ( java.lang.Throwable p0, Object p1 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/Throwable;", */
/* "Le/h/d/a/a/n/o<", */
/* "Ljava/lang/String;", */
/* ">;)Z" */
/* } */
} // .end annotation
/* .line 79 */
/* instance-of v0, p1, Lcom/android/volley/VolleyError; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* check-cast p1, Lcom/android/volley/VolleyError; */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 80 */
p1 = (( e.h.d.a.a.n.p ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/n/p;->a(Lcom/android/volley/VolleyError;)Ljava/lang/String;
if ( p1 != null) { // if-eqz p1, :cond_0
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
public final Integer b ( java.lang.Throwable p0 ) {
/* .locals 2 */
/* .line 15 */
v0 = this.a;
v0 = e.h.d.a.a.w.h .a ( v0 );
/* if-nez v0, :cond_0 */
/* .line 16 */
/* .line 17 */
} // :cond_0
(( java.lang.Throwable ) p1 ).getCause ( ); // invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;
/* instance-of v0, v0, Ljavax/net/ssl/SSLException; */
final String v1 = "packid.userLoader"; // const-string v1, "packid.userLoader"
if ( v0 != null) { // if-eqz v0, :cond_1
final String v0 = "SSL error while trying to get user"; // const-string v0, "SSL error while trying to get user"
/* .line 18 */
android.util.Log .e ( v1,v0,p1 );
/* .line 19 */
} // :cond_1
final String v0 = "Error while trying to get user"; // const-string v0, "Error while trying to get user"
/* .line 20 */
android.util.Log .e ( v1,v0,p1 );
/* .line 21 */
} // .end method
public final android.net.Uri b ( android.net.Uri p0 ) {
/* .locals 11 */
/* .line 5 */
(( android.net.Uri ) p1 ).toString ( ); // invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;
android.net.Uri .parse ( v0 );
(( android.net.Uri ) v0 ).buildUpon ( ); // invoke-virtual {v0}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;
(( android.net.Uri$Builder ) v0 ).clearQuery ( ); // invoke-virtual {v0}, Landroid/net/Uri$Builder;->clearQuery()Landroid/net/Uri$Builder;
/* .line 6 */
(( android.net.Uri ) p1 ).getQueryParameterNames ( ); // invoke-virtual {p1}, Landroid/net/Uri;->getQueryParameterNames()Ljava/util/Set;
v2 = } // :cond_0
if ( v2 != null) { // if-eqz v2, :cond_1
/* check-cast v2, Ljava/lang/String; */
final String v3 = "deviceModel"; // const-string v3, "deviceModel"
final String v4 = "deviceManufacturer"; // const-string v4, "deviceManufacturer"
final String v5 = "libraryVersion"; // const-string v5, "libraryVersion"
final String v6 = "osVersion"; // const-string v6, "osVersion"
final String v7 = "applicationVersion"; // const-string v7, "applicationVersion"
final String v8 = "nfc"; // const-string v8, "nfc"
final String v9 = "firebaseToken"; // const-string v9, "firebaseToken"
final String v10 = "sendEnrolmentNotification"; // const-string v10, "sendEnrolmentNotification"
/* .line 7 */
/* filled-new-array/range {v3 ..v10}, [Ljava/lang/String; */
java.util.Arrays .asList ( v3 );
v3 = /* .line 8 */
/* if-nez v3, :cond_0 */
/* .line 9 */
(( android.net.Uri ) p1 ).getQueryParameters ( v2 ); // invoke-virtual {p1, v2}, Landroid/net/Uri;->getQueryParameters(Ljava/lang/String;)Ljava/util/List;
v4 = } // :goto_0
if ( v4 != null) { // if-eqz v4, :cond_0
/* check-cast v4, Ljava/lang/String; */
/* .line 10 */
(( android.net.Uri$Builder ) v0 ).appendQueryParameter ( v2, v4 ); // invoke-virtual {v0, v2, v4}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
/* .line 11 */
} // :cond_1
(( android.net.Uri$Builder ) v0 ).build ( ); // invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;
} // .end method
public final java.lang.String b ( ) {
/* .locals 3 */
/* .line 12 */
try { // :try_start_0
v0 = this.a;
(( android.content.Context ) v0 ).getPackageManager ( ); // invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
v1 = this.a;
(( android.content.Context ) v1 ).getPackageName ( ); // invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
int v2 = 0; // const/4 v2, 0x0
(( android.content.pm.PackageManager ) v0 ).getPackageInfo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
/* .line 13 */
v0 = this.versionName;
/* :try_end_0 */
/* .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
final String v1 = "packid.userLoader"; // const-string v1, "packid.userLoader"
final String v2 = "Cannot get package name"; // const-string v2, "Cannot get package name"
/* .line 14 */
android.util.Log .e ( v1,v2,v0 );
final String v0 = ""; // const-string v0, ""
} // .end method
public void b ( android.net.Uri p0, java.lang.String p1 ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
/* .line 1 */
/* iput-boolean v0, p0, Le/h/d/a/a/n/p;->b:Z */
/* .line 2 */
/* iput-boolean v0, p0, Le/h/d/a/a/n/p;->e:Z */
/* .line 3 */
this.c = p2;
/* .line 4 */
(( e.h.d.a.a.n.p ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/n/p;->a(Landroid/net/Uri;)V
return;
} // .end method
public final Boolean c ( java.lang.Throwable p0 ) {
/* .locals 1 */
/* const/16 v0, 0x193 */
/* .line 1 */
v0 = (( e.h.d.a.a.n.p ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Le/h/d/a/a/n/p;->a(Ljava/lang/Throwable;I)Z
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = e.h.d.a.a.n.a.a;
/* .line 2 */
p1 = (( e.h.d.a.a.n.p ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Le/h/d/a/a/n/p;->a(Ljava/lang/Throwable;Le/h/d/a/a/n/o;)Z
if ( p1 != null) { // if-eqz p1, :cond_0
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
public final Boolean d ( java.lang.Throwable p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = e.h.d.a.a.n.b.a;
p1 = (( e.h.d.a.a.n.p ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Le/h/d/a/a/n/p;->a(Ljava/lang/Throwable;Le/h/d/a/a/n/o;)Z
} // .end method
public final Boolean e ( java.lang.Throwable p0 ) {
/* .locals 1 */
/* const/16 v0, 0x19a */
/* .line 1 */
p1 = (( e.h.d.a.a.n.p ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Le/h/d/a/a/n/p;->a(Ljava/lang/Throwable;I)Z
} // .end method
public final Boolean f ( java.lang.Throwable p0 ) {
/* .locals 1 */
/* const/16 v0, 0x194 */
/* .line 1 */
v0 = (( e.h.d.a.a.n.p ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Le/h/d/a/a/n/p;->a(Ljava/lang/Throwable;I)Z
if ( v0 != null) { // if-eqz v0, :cond_0
p1 = (( e.h.d.a.a.n.p ) p0 ).d ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/n/p;->d(Ljava/lang/Throwable;)Z
/* if-nez p1, :cond_0 */
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
public final Boolean g ( java.lang.Throwable p0 ) {
/* .locals 1 */
/* const/16 v0, 0x194 */
/* .line 1 */
v0 = (( e.h.d.a.a.n.p ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Le/h/d/a/a/n/p;->a(Ljava/lang/Throwable;I)Z
if ( v0 != null) { // if-eqz v0, :cond_0
p1 = (( e.h.d.a.a.n.p ) p0 ).d ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/n/p;->d(Ljava/lang/Throwable;)Z
if ( p1 != null) { // if-eqz p1, :cond_0
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
