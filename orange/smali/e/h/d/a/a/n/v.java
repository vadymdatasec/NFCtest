public class e.h.d.a.a.n.v {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final e.h.d.a.a.n.w.c a;
	 /* # direct methods */
	 public e.h.d.a.a.n.v ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.a = p1;
		 return;
	 } // .end method
	 public static fr.mbs.binary.Octets a ( org.json.JSONObject p0, java.lang.String p1 ) {
		 /* .locals 1 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Lorg/json/JSONException; */
		 /* } */
	 } // .end annotation
	 if ( p0 != null) { // if-eqz p0, :cond_0
		 /* .line 26 */
		 v0 = 		 (( org.json.JSONObject ) p0 ).has ( p1 ); // invoke-virtual {p0, p1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 (( org.json.JSONObject ) p0 ).getString ( p1 ); // invoke-virtual {p0, p1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
			 fr.mbs.binary.Octets .createOctets ( p0 );
		 } // :cond_0
		 int p0 = 0; // const/4 p0, 0x0
	 } // :goto_0
} // .end method
public static com.orange.oab.contactless.packid.hce.user.wallet.BadgeStatus f ( org.json.JSONObject p0 ) {
	 /* .locals 2 */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Lorg/json/JSONException; */
	 /* } */
} // .end annotation
if ( p0 != null) { // if-eqz p0, :cond_0
	 final String v0 = "status"; // const-string v0, "status"
	 /* .line 1 */
	 v1 = 	 (( org.json.JSONObject ) p0 ).has ( v0 ); // invoke-virtual {p0, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
	 if ( v1 != null) { // if-eqz v1, :cond_0
		 (( org.json.JSONObject ) p0 ).getString ( v0 ); // invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
		 com.orange.oab.contactless.packid.hce.user.wallet.BadgeStatus .valueOf ( p0 );
	 } // :cond_0
	 p0 = com.orange.oab.contactless.packid.hce.user.wallet.BadgeStatus.INSTALLED;
} // :goto_0
} // .end method
/* # virtual methods */
public final com.orange.oab.contactless.packid.ContactlessType a ( org.json.JSONObject p0, java.lang.String p1, com.orange.oab.contactless.packid.ContactlessType p2 ) {
/* .locals 0 */
/* .line 17 */
(( java.lang.Enum ) p3 ).toString ( ); // invoke-virtual {p3}, Ljava/lang/Enum;->toString()Ljava/lang/String;
(( org.json.JSONObject ) p1 ).optString ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
com.orange.oab.contactless.packid.ContactlessType .valueOf ( p1 );
} // .end method
public com.orange.oab.contactless.packid.hce.user.User a ( org.json.JSONObject p0 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/json/JSONException;, */
/* Lcom/orange/oab/contactless/packid/g/u/e; */
/* } */
} // .end annotation
final String v0 = "UserParser"; // const-string v0, "UserParser"
final String v1 = "PrivateRef: fetch json from server to create an User"; // const-string v1, "PrivateRef: fetch json from server to create an User"
/* .line 1 */
android.util.Log .i ( v0,v1 );
/* .line 2 */
/* new-instance v0, Lcom/orange/oab/contactless/packid/hce/user/User; */
/* invoke-direct {v0}, Lcom/orange/oab/contactless/packid/hce/user/User;-><init>()V */
final String v1 = "contactlessId"; // const-string v1, "contactlessId"
final String v2 = "00000001"; // const-string v2, "00000001"
/* .line 3 */
(( org.json.JSONObject ) p1 ).optString ( v1, v2 ); // invoke-virtual {p1, v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
fr.mbs.binary.Octets .createOctets ( v1 );
(( com.orange.oab.contactless.packid.hce.user.User ) v0 ).setContactlessId ( v1 ); // invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->setContactlessId(Lfr/mbs/binary/Octets;)V
int v1 = 0; // const/4 v1, 0x0
final String v2 = "firstname"; // const-string v2, "firstname"
/* .line 4 */
(( org.json.JSONObject ) p1 ).optString ( v2, v1 ); // invoke-virtual {p1, v2, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
(( com.orange.oab.contactless.packid.hce.user.User ) v0 ).setFirstname ( v2 ); // invoke-virtual {v0, v2}, Lcom/orange/oab/contactless/packid/hce/user/User;->setFirstname(Ljava/lang/String;)V
final String v2 = "lastname"; // const-string v2, "lastname"
/* .line 5 */
(( org.json.JSONObject ) p1 ).optString ( v2, v1 ); // invoke-virtual {p1, v2, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
(( com.orange.oab.contactless.packid.hce.user.User ) v0 ).setLastname ( v2 ); // invoke-virtual {v0, v2}, Lcom/orange/oab/contactless/packid/hce/user/User;->setLastname(Ljava/lang/String;)V
final String v2 = "email"; // const-string v2, "email"
/* .line 6 */
(( org.json.JSONObject ) p1 ).optString ( v2, v1 ); // invoke-virtual {p1, v2, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
(( com.orange.oab.contactless.packid.hce.user.User ) v0 ).setEmail ( v1 ); // invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->setEmail(Ljava/lang/String;)V
final String v1 = "applicationIds"; // const-string v1, "applicationIds"
/* .line 7 */
(( org.json.JSONObject ) p1 ).optJSONArray ( v1 ); // invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;
(( e.h.d.a.a.n.v ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Le/h/d/a/a/n/v;->a(Lorg/json/JSONArray;)Ljava/util/Set;
(( com.orange.oab.contactless.packid.hce.user.User ) v0 ).setApplicationIds ( v1 ); // invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->setApplicationIds(Ljava/util/Set;)V
final String v1 = "wallet"; // const-string v1, "wallet"
/* .line 8 */
(( org.json.JSONObject ) p1 ).optJSONObject ( v1 ); // invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;
(( e.h.d.a.a.n.v ) p0 ).e ( v1 ); // invoke-virtual {p0, v1}, Le/h/d/a/a/n/v;->e(Lorg/json/JSONObject;)Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;
(( com.orange.oab.contactless.packid.hce.user.User ) v0 ).setWallet ( v1 ); // invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->setWallet(Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;)V
int v1 = 0; // const/4 v1, 0x0
final String v2 = "simCentric"; // const-string v2, "simCentric"
/* .line 9 */
v2 = (( org.json.JSONObject ) p1 ).optBoolean ( v2, v1 ); // invoke-virtual {p1, v2, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z
(( com.orange.oab.contactless.packid.hce.user.User ) v0 ).setSimCentric ( v2 ); // invoke-virtual {v0, v2}, Lcom/orange/oab/contactless/packid/hce/user/User;->setSimCentric(Z)V
final String v2 = "tenant"; // const-string v2, "tenant"
/* .line 10 */
(( org.json.JSONObject ) p1 ).optJSONObject ( v2 ); // invoke-virtual {p1, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;
(( e.h.d.a.a.n.v ) p0 ).d ( v2 ); // invoke-virtual {p0, v2}, Le/h/d/a/a/n/v;->d(Lorg/json/JSONObject;)Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;
(( com.orange.oab.contactless.packid.hce.user.User ) v0 ).setTenant ( v2 ); // invoke-virtual {v0, v2}, Lcom/orange/oab/contactless/packid/hce/user/User;->setTenant(Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;)V
final String v2 = "firebaseEnable"; // const-string v2, "firebaseEnable"
/* .line 11 */
v2 = (( org.json.JSONObject ) p1 ).optBoolean ( v2, v1 ); // invoke-virtual {p1, v2, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z
(( com.orange.oab.contactless.packid.hce.user.User ) v0 ).setFirebaseEnable ( v2 ); // invoke-virtual {v0, v2}, Lcom/orange/oab/contactless/packid/hce/user/User;->setFirebaseEnable(Z)V
final String v2 = "premium"; // const-string v2, "premium"
/* .line 12 */
p1 = (( org.json.JSONObject ) p1 ).optBoolean ( v2, v1 ); // invoke-virtual {p1, v2, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z
(( com.orange.oab.contactless.packid.hce.user.User ) v0 ).setPremium ( p1 ); // invoke-virtual {v0, p1}, Lcom/orange/oab/contactless/packid/hce/user/User;->setPremium(Z)V
} // .end method
public final java.util.Set a ( org.json.JSONArray p0 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Lorg/json/JSONArray;", */
/* ")", */
/* "Ljava/util/Set<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/json/JSONException; */
/* } */
} // .end annotation
/* .line 13 */
/* new-instance v0, Ljava/util/HashSet; */
/* invoke-direct {v0}, Ljava/util/HashSet;-><init>()V */
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 14 */
v1 = (( org.json.JSONArray ) p1 ).length ( ); // invoke-virtual {p1}, Lorg/json/JSONArray;->length()I
/* if-nez v1, :cond_0 */
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
/* .line 15 */
} // :goto_0
v2 = (( org.json.JSONArray ) p1 ).length ( ); // invoke-virtual {p1}, Lorg/json/JSONArray;->length()I
/* if-ge v1, v2, :cond_1 */
/* .line 16 */
(( org.json.JSONArray ) p1 ).getString ( v1 ); // invoke-virtual {p1, v1}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;
(( java.util.HashSet ) v0 ).add ( v2 ); // invoke-virtual {v0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_1
} // :goto_1
} // .end method
public final void a ( com.orange.oab.contactless.packid.hce.user.wallet.Badge p0, org.json.JSONObject p1 ) {
/* .locals 5 */
/* .line 18 */
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p1 ).getContactLessType ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getContactLessType()Lcom/orange/oab/contactless/packid/ContactlessType;
v1 = com.orange.oab.contactless.packid.ContactlessType.PERSONALISED;
/* if-ne v0, v1, :cond_1 */
final String v0 = "androidPersonalisedContactlessInformation"; // const-string v0, "androidPersonalisedContactlessInformation"
/* .line 19 */
(( org.json.JSONObject ) p2 ).optJSONObject ( v0 ); // invoke-virtual {p2, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;
/* const/16 v0, 0xc */
/* if-nez p2, :cond_0 */
/* .line 20 */
/* new-instance p2, Le/h/d/a/a/l; */
v1 = com.orange.oab.contactless.packid.ContactlessType.BLE;
java.lang.Integer .valueOf ( v0 );
v2 = com.orange.oab.contactless.packid.ContactlessType.BLE;
/* invoke-direct {p2, v1, v0, v2}, Le/h/d/a/a/l;-><init>(Lcom/orange/oab/contactless/packid/ContactlessType;Ljava/lang/Integer;Lcom/orange/oab/contactless/packid/ContactlessType;)V */
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p1 ).setContactlessTypeInformation ( p2 ); // invoke-virtual {p1, p2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setContactlessTypeInformation(Le/h/d/a/a/l;)V
/* .line 21 */
} // :cond_0
/* new-instance v1, Le/h/d/a/a/l; */
v2 = com.orange.oab.contactless.packid.ContactlessType.BLE;
final String v3 = "contactlessDown"; // const-string v3, "contactlessDown"
/* .line 22 */
(( e.h.d.a.a.n.v ) p0 ).a ( p2, v3, v2 ); // invoke-virtual {p0, p2, v3, v2}, Le/h/d/a/a/n/v;->a(Lorg/json/JSONObject;Ljava/lang/String;Lcom/orange/oab/contactless/packid/ContactlessType;)Lcom/orange/oab/contactless/packid/ContactlessType;
final String v3 = "contactlessVersionThreshold"; // const-string v3, "contactlessVersionThreshold"
/* .line 23 */
v0 = (( org.json.JSONObject ) p2 ).optInt ( v3, v0 ); // invoke-virtual {p2, v3, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I
java.lang.Integer .valueOf ( v0 );
v3 = com.orange.oab.contactless.packid.ContactlessType.BLE;
final String v4 = "contactlessUp"; // const-string v4, "contactlessUp"
/* .line 24 */
(( e.h.d.a.a.n.v ) p0 ).a ( p2, v4, v3 ); // invoke-virtual {p0, p2, v4, v3}, Le/h/d/a/a/n/v;->a(Lorg/json/JSONObject;Ljava/lang/String;Lcom/orange/oab/contactless/packid/ContactlessType;)Lcom/orange/oab/contactless/packid/ContactlessType;
/* invoke-direct {v1, v2, v0, p2}, Le/h/d/a/a/l;-><init>(Lcom/orange/oab/contactless/packid/ContactlessType;Ljava/lang/Integer;Lcom/orange/oab/contactless/packid/ContactlessType;)V */
/* .line 25 */
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p1 ).setContactlessTypeInformation ( v1 ); // invoke-virtual {p1, v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setContactlessTypeInformation(Le/h/d/a/a/l;)V
} // :cond_1
} // :goto_0
return;
} // .end method
public com.orange.oab.contactless.packid.hce.user.wallet.Badge$a b ( org.json.JSONObject p0 ) {
/* .locals 8 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/json/JSONException;, */
/* Lcom/orange/oab/contactless/packid/g/u/e; */
/* } */
} // .end annotation
/* .line 1 */
/* new-instance v0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge$a; */
/* invoke-direct {v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge$a;-><init>()V */
final String v1 = "data"; // const-string v1, "data"
/* .line 2 */
(( org.json.JSONObject ) p1 ).getString ( v1 ); // invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
fr.mbs.binary.Octets .createFromBase64 ( v1 );
com.orange.oab.contactless.packid.hce.user.TokenData .parse ( v1 );
this.a = v1;
/* .line 3 */
v1 = this.a;
final String v2 = "signature"; // const-string v2, "signature"
(( org.json.JSONObject ) p1 ).getString ( v2 ); // invoke-virtual {p1, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
fr.mbs.binary.Octets .createFromBase64 ( v2 );
(( e.h.d.a.a.n.w.c ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Le/h/d/a/a/n/w/c;->a(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
this.b = v1;
final String v1 = "url"; // const-string v1, "url"
/* .line 4 */
v2 = (( org.json.JSONObject ) p1 ).has ( v1 ); // invoke-virtual {p1, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
if ( v2 != null) { // if-eqz v2, :cond_0
v2 = this.a;
(( org.json.JSONObject ) p1 ).getString ( v1 ); // invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
fr.mbs.binary.Octets .createWithUtf8String ( v1 );
(( e.h.d.a.a.n.w.c ) v2 ).a ( v1 ); // invoke-virtual {v2, v1}, Le/h/d/a/a/n/w/c;->a(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
this.c = v1;
/* .line 5 */
/* new-instance v1, Ljava/util/Date; */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v2 */
final String v4 = "maxCacheAge"; // const-string v4, "maxCacheAge"
(( org.json.JSONObject ) p1 ).getLong ( v4 ); // invoke-virtual {p1, v4}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J
/* move-result-wide v4 */
/* const-wide/16 v6, 0x3c */
/* mul-long v4, v4, v6 */
/* const-wide/16 v6, 0x3e8 */
/* mul-long v4, v4, v6 */
/* add-long/2addr v2, v4 */
/* invoke-direct {v1, v2, v3}, Ljava/util/Date;-><init>(J)V */
this.d = v1;
} // .end method
public final com.orange.oab.contactless.packid.hce.user.wallet.Badge c ( org.json.JSONObject p0 ) {
/* .locals 9 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/json/JSONException;, */
/* Lcom/orange/oab/contactless/packid/g/u/e; */
/* } */
} // .end annotation
final String v0 = "zoneid"; // const-string v0, "zoneid"
/* .line 1 */
e.h.d.a.a.n.v .a ( p1,v0 );
final String v0 = "badgeid"; // const-string v0, "badgeid"
/* .line 2 */
e.h.d.a.a.n.v .a ( p1,v0 );
final String v1 = "walletkey"; // const-string v1, "walletkey"
/* .line 3 */
e.h.d.a.a.n.v .a ( p1,v1 );
int v7 = 0; // const/4 v7, 0x0
/* if-nez v1, :cond_0 */
/* move-object v5, v7 */
/* .line 4 */
} // :cond_0
v3 = this.a;
(( e.h.d.a.a.n.w.c ) v3 ).a ( v1 ); // invoke-virtual {v3, v1}, Le/h/d/a/a/n/w/c;->a(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
/* move-object v5, v1 */
} // :goto_0
final String v1 = "description"; // const-string v1, "description"
/* .line 5 */
(( org.json.JSONObject ) p1 ).optString ( v1, v7 ); // invoke-virtual {p1, v1, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/* .line 6 */
com.orange.oab.contactless.packid.hce.user.wallet.Badge .mask ( v0 );
/* .line 7 */
/* new-instance v8, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge; */
v1 = this.a;
(( e.h.d.a.a.n.w.c ) v1 ).a ( v0 ); // invoke-virtual {v1, v0}, Le/h/d/a/a/n/w/c;->a(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
/* move-object v1, v8 */
/* invoke-direct/range {v1 ..v6}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;-><init>(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;Lfr/mbs/binary/Octets;Ljava/lang/String;)V */
final String v0 = "logoFile"; // const-string v0, "logoFile"
/* .line 8 */
(( org.json.JSONObject ) p1 ).optString ( v0, v7 ); // invoke-virtual {p1, v0, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v8 ).setLogoFile ( v0 ); // invoke-virtual {v8, v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setLogoFile(Ljava/lang/String;)V
/* const/16 v0, -0x32 */
final String v1 = "rssi"; // const-string v1, "rssi"
/* .line 9 */
v0 = (( org.json.JSONObject ) p1 ).optInt ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I
/* int-to-byte v0, v0 */
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v8 ).setRssi ( v0 ); // invoke-virtual {v8, v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setRssi(B)V
/* const/16 v0, -0x7f */
final String v1 = "rssiButtonInterval"; // const-string v1, "rssiButtonInterval"
/* .line 10 */
v0 = (( org.json.JSONObject ) p1 ).optInt ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I
/* int-to-byte v0, v0 */
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v8 ).setRssiButtonInterval ( v0 ); // invoke-virtual {v8, v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setRssiButtonInterval(B)V
/* .line 11 */
v0 = com.orange.oab.contactless.packid.ContactlessType.NFC;
final String v1 = "contactlessType"; // const-string v1, "contactlessType"
(( e.h.d.a.a.n.v ) p0 ).a ( p1, v1, v0 ); // invoke-virtual {p0, p1, v1, v0}, Le/h/d/a/a/n/v;->a(Lorg/json/JSONObject;Ljava/lang/String;Lcom/orange/oab/contactless/packid/ContactlessType;)Lcom/orange/oab/contactless/packid/ContactlessType;
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v8 ).setContactlessType ( v0 ); // invoke-virtual {v8, v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setContactlessType(Lcom/orange/oab/contactless/packid/ContactlessType;)V
/* .line 12 */
(( e.h.d.a.a.n.v ) p0 ).a ( v8, p1 ); // invoke-virtual {p0, v8, p1}, Le/h/d/a/a/n/v;->a(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Lorg/json/JSONObject;)V
final String v0 = "lockable"; // const-string v0, "lockable"
/* .line 13 */
v0 = (( org.json.JSONObject ) p1 ).optBoolean ( v0 ); // invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v8 ).setLockable ( v0 ); // invoke-virtual {v8, v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setLockable(Z)V
final String v0 = "unlockedDuration"; // const-string v0, "unlockedDuration"
/* .line 14 */
v0 = (( org.json.JSONObject ) p1 ).optInt ( v0 ); // invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I
java.lang.Integer .valueOf ( v0 );
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v8 ).setUnlockedDuration ( v0 ); // invoke-virtual {v8, v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setUnlockedDuration(Ljava/lang/Integer;)V
final String v0 = "unlockableByZoneID"; // const-string v0, "unlockableByZoneID"
/* .line 15 */
e.h.d.a.a.n.v .a ( p1,v0 );
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v8 ).setUnlockableByZoneID ( v0 ); // invoke-virtual {v8, v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setUnlockableByZoneID(Lfr/mbs/binary/Octets;)V
/* .line 16 */
e.h.d.a.a.n.v .f ( p1 );
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v8 ).setStatus ( v0 ); // invoke-virtual {v8, v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setStatus(Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;)V
final String v0 = "bleSessionTimeout"; // const-string v0, "bleSessionTimeout"
/* .line 17 */
v1 = (( org.json.JSONObject ) p1 ).has ( v0 ); // invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
if ( v1 != null) { // if-eqz v1, :cond_1
v0 = (( org.json.JSONObject ) p1 ).getInt ( v0 ); // invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
java.lang.Integer .valueOf ( v0 );
} // :cond_1
/* move-object v0, v7 */
} // :goto_1
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v8 ).setBleSessionTimeout ( v0 ); // invoke-virtual {v8, v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setBleSessionTimeout(Ljava/lang/Integer;)V
final String v0 = "delayAfterBadgeOk"; // const-string v0, "delayAfterBadgeOk"
/* .line 18 */
v1 = (( org.json.JSONObject ) p1 ).has ( v0 ); // invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
if ( v1 != null) { // if-eqz v1, :cond_2
v0 = (( org.json.JSONObject ) p1 ).getInt ( v0 ); // invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
java.lang.Integer .valueOf ( v0 );
} // :cond_2
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v8 ).setDelayAfterBadgeOk ( v7 ); // invoke-virtual {v8, v7}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setDelayAfterBadgeOk(Ljava/lang/Integer;)V
final String v0 = "minimumConditionToBeginTransaction"; // const-string v0, "minimumConditionToBeginTransaction"
/* .line 19 */
v1 = (( org.json.JSONObject ) p1 ).has ( v0 ); // invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
if ( v1 != null) { // if-eqz v1, :cond_3
(( org.json.JSONObject ) p1 ).getString ( v0 ); // invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
com.orange.oab.contactless.packid.domain.ConditionToBeginTransaction .valueOf ( v0 );
} // :cond_3
v0 = com.orange.oab.contactless.packid.domain.ConditionToBeginTransaction.none;
} // :goto_2
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v8 ).setConditionToBeginTransaction ( v0 ); // invoke-virtual {v8, v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setConditionToBeginTransaction(Lcom/orange/oab/contactless/packid/domain/ConditionToBeginTransaction;)V
int v0 = 0; // const/4 v0, 0x0
final String v1 = "manualConnectionAllowed"; // const-string v1, "manualConnectionAllowed"
/* .line 20 */
v0 = (( org.json.JSONObject ) p1 ).optBoolean ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v8 ).setManualConnectionAllowed ( v0 ); // invoke-virtual {v8, v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setManualConnectionAllowed(Z)V
final String v0 = "token"; // const-string v0, "token"
/* .line 21 */
v1 = (( org.json.JSONObject ) p1 ).has ( v0 ); // invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
if ( v1 != null) { // if-eqz v1, :cond_4
/* .line 22 */
(( org.json.JSONObject ) p1 ).getJSONObject ( v0 ); // invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;
/* .line 23 */
(( e.h.d.a.a.n.v ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Le/h/d/a/a/n/v;->b(Lorg/json/JSONObject;)Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge$a;
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v8 ).updateToken ( v0 ); // invoke-virtual {v8, v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->updateToken(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge$a;)V
} // :cond_4
final String v0 = "url"; // const-string v0, "url"
/* .line 24 */
v1 = (( org.json.JSONObject ) p1 ).has ( v0 ); // invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
if ( v1 != null) { // if-eqz v1, :cond_5
/* .line 25 */
v1 = this.a;
(( org.json.JSONObject ) p1 ).getString ( v0 ); // invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
fr.mbs.binary.Octets .createWithUtf8String ( p1 );
(( e.h.d.a.a.n.w.c ) v1 ).a ( p1 ); // invoke-virtual {v1, p1}, Le/h/d/a/a/n/w/c;->a(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v8 ).setCipheredUrl ( p1 ); // invoke-virtual {v8, p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setCipheredUrl(Lfr/mbs/binary/Octets;)V
} // :cond_5
} // .end method
public final com.orange.oab.contactless.packid.hce.user.wallet.Tenant d ( org.json.JSONObject p0 ) {
/* .locals 2 */
/* if-nez p1, :cond_0 */
int p1 = 0; // const/4 p1, 0x0
/* .line 1 */
} // :cond_0
/* new-instance v0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant; */
/* invoke-direct {v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;-><init>()V */
final String v1 = "name"; // const-string v1, "name"
/* .line 2 */
(( org.json.JSONObject ) p1 ).optString ( v1 ); // invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
(( com.orange.oab.contactless.packid.hce.user.wallet.Tenant ) v0 ).setName ( v1 ); // invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;->setName(Ljava/lang/String;)V
final String v1 = "logoURL"; // const-string v1, "logoURL"
/* .line 3 */
(( org.json.JSONObject ) p1 ).optString ( v1 ); // invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
(( com.orange.oab.contactless.packid.hce.user.wallet.Tenant ) v0 ).setLogoUrl ( v1 ); // invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;->setLogoUrl(Ljava/lang/String;)V
final String v1 = "shouldSendEnrollmentNotification"; // const-string v1, "shouldSendEnrollmentNotification"
/* .line 4 */
p1 = (( org.json.JSONObject ) p1 ).optBoolean ( v1 ); // invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z
(( com.orange.oab.contactless.packid.hce.user.wallet.Tenant ) v0 ).setShouldSendEnrollmentNotification ( p1 ); // invoke-virtual {v0, p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;->setShouldSendEnrollmentNotification(Z)V
} // .end method
public final com.orange.oab.contactless.packid.hce.user.wallet.Wallet e ( org.json.JSONObject p0 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/json/JSONException;, */
/* Lcom/orange/oab/contactless/packid/g/u/e; */
/* } */
} // .end annotation
/* .line 1 */
/* new-instance v0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet; */
final String v1 = "walletid"; // const-string v1, "walletid"
e.h.d.a.a.n.v .a ( p1,v1 );
/* invoke-direct {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;-><init>(Lfr/mbs/binary/Octets;)V */
if ( p1 != null) { // if-eqz p1, :cond_0
final String v1 = "badges"; // const-string v1, "badges"
/* .line 2 */
(( org.json.JSONObject ) p1 ).optJSONArray ( v1 ); // invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;
if ( p1 != null) { // if-eqz p1, :cond_0
int v1 = 0; // const/4 v1, 0x0
/* .line 3 */
} // :goto_0
v2 = (( org.json.JSONArray ) p1 ).length ( ); // invoke-virtual {p1}, Lorg/json/JSONArray;->length()I
/* if-ge v1, v2, :cond_0 */
/* .line 4 */
(( org.json.JSONArray ) p1 ).getJSONObject ( v1 ); // invoke-virtual {p1, v1}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;
/* .line 5 */
(( com.orange.oab.contactless.packid.hce.user.wallet.Wallet ) v0 ).getBadges ( ); // invoke-virtual {v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;->getBadges()Ljava/util/List;
(( e.h.d.a.a.n.v ) p0 ).c ( v2 ); // invoke-virtual {p0, v2}, Le/h/d/a/a/n/v;->c(Lorg/json/JSONObject;)Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_0
} // .end method
