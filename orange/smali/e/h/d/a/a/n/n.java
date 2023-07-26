public class e.h.d.a.a.n.n extends e.h.d.a.a.n.m {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final com.orange.oab.contactless.packid.hce.user.wallet.Badge b;
	 public fr.mbs.binary.Octets c;
	 public final e.h.d.a.a.n.w.c d;
	 /* # direct methods */
	 public e.h.d.a.a.n.n ( ) {
		 /* .locals 0 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Lcom/orange/oab/contactless/packid/g/u/e; */
		 /* } */
	 } // .end annotation
	 /* .line 1 */
	 /* invoke-direct {p0, p1}, Le/h/d/a/a/n/m;-><init>(Landroid/content/Context;)V */
	 /* .line 2 */
	 (( e.h.d.a.a.n.n ) p0 ).a ( p2 ); // invoke-virtual {p0, p2}, Le/h/d/a/a/n/n;->a(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;
	 this.b = p2;
	 /* .line 3 */
	 e.h.d.a.a.n.w.c .b ( p1 );
	 this.d = p1;
	 return;
} // .end method
/* # virtual methods */
public final com.orange.oab.contactless.packid.hce.user.wallet.Badge a ( com.orange.oab.contactless.packid.hce.user.wallet.Badge p0 ) {
	 /* .locals 2 */
	 /* .line 1 */
	 v0 = this.a;
	 e.h.d.a.a.s.m .c ( v0 );
	 (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p1 ).getUserId ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getUserId()Ljava/lang/String;
	 (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p1 ).getZoneId ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getZoneId()Lfr/mbs/binary/Octets;
	 (( e.h.d.a.a.s.g0 ) v0 ).a ( v1, p1 ); // invoke-virtual {v0, v1, p1}, Le/h/d/a/a/s/g0;->a(Ljava/lang/String;Lfr/mbs/binary/Octets;)Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;
} // .end method
public void a ( ) {
	 /* .locals 4 */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Lcom/orange/oab/contactless/packid/g/u/e; */
	 /* } */
} // .end annotation
/* .line 2 */
v0 = this.a;
e.h.d.a.a.s.m .c ( v0 );
v1 = this.b;
(( e.h.d.a.a.s.g0 ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Le/h/d/a/a/s/g0;->b(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)V
/* .line 3 */
v0 = this.b;
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v0 ).getCipheredTokenDataSignature ( ); // invoke-virtual {v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getCipheredTokenDataSignature()Lfr/mbs/binary/Octets;
this.c = v0;
/* .line 4 */
/* new-instance v0, Ljava/lang/String; */
v1 = this.d;
v2 = this.b;
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v2 ).getCipheredUrl ( ); // invoke-virtual {v2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getCipheredUrl()Lfr/mbs/binary/Octets;
(( e.h.d.a.a.n.w.c ) v1 ).b ( v2 ); // invoke-virtual {v1, v2}, Le/h/d/a/a/n/w/c;->b(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
(( fr.mbs.binary.Octets ) v1 ).toBytes ( ); // invoke-virtual {v1}, Lfr/mbs/binary/Octets;->toBytes()[B
v2 = java.nio.charset.StandardCharsets.UTF_8;
/* invoke-direct {v0, v1, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V */
/* .line 5 */
android.net.Uri .parse ( v0 );
/* .line 6 */
/* new-instance v1, Ljava/util/HashMap; */
/* invoke-direct {v1}, Ljava/util/HashMap;-><init>()V */
/* .line 7 */
v2 = this.b;
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v2 ).getTokenData ( ); // invoke-virtual {v2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getTokenData()Lcom/orange/oab/contactless/packid/hce/user/TokenData;
(( com.orange.oab.contactless.packid.hce.user.TokenData ) v2 ).toOctets ( ); // invoke-virtual {v2}, Lcom/orange/oab/contactless/packid/hce/user/TokenData;->toOctets()Lfr/mbs/binary/Octets;
(( fr.mbs.binary.Octets ) v2 ).toBase64 ( ); // invoke-virtual {v2}, Lfr/mbs/binary/Octets;->toBase64()Ljava/lang/String;
final String v3 = "data"; // const-string v3, "data"
/* .line 8 */
v2 = this.d;
v3 = this.c;
(( e.h.d.a.a.n.w.c ) v2 ).b ( v3 ); // invoke-virtual {v2, v3}, Le/h/d/a/a/n/w/c;->b(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
(( fr.mbs.binary.Octets ) v2 ).toBase64 ( ); // invoke-virtual {v2}, Lfr/mbs/binary/Octets;->toBase64()Ljava/lang/String;
final String v3 = "signature"; // const-string v3, "signature"
/* .line 9 */
(( e.h.d.a.a.n.m ) p0 ).b ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Le/h/d/a/a/n/m;->b(Landroid/net/Uri;Ljava/util/Map;)V
final String v0 = "packid.TokenUpdater"; // const-string v0, "packid.TokenUpdater"
final String v1 = "Updating token on server ..."; // const-string v1, "Updating token on server ..."
/* .line 10 */
android.util.Log .i ( v0,v1 );
return;
} // .end method
public void a ( android.net.Uri p0, java.lang.String p1 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/json/JSONException;, */
/* Lcom/orange/oab/contactless/packid/g/u/e; */
/* } */
} // .end annotation
/* .line 11 */
/* new-instance p1, Le/h/d/a/a/n/v; */
v0 = this.d;
/* invoke-direct {p1, v0}, Le/h/d/a/a/n/v;-><init>(Le/h/d/a/a/n/w/c;)V */
/* new-instance v0, Lorg/json/JSONObject; */
/* invoke-direct {v0, p2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V */
(( e.h.d.a.a.n.v ) p1 ).b ( v0 ); // invoke-virtual {p1, v0}, Le/h/d/a/a/n/v;->b(Lorg/json/JSONObject;)Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge$a;
/* .line 12 */
p2 = this.b;
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p2 ).updateToken ( p1 ); // invoke-virtual {p2, p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->updateToken(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge$a;)V
/* .line 13 */
p1 = this.a;
e.h.d.a.a.s.m .c ( p1 );
p2 = this.b;
v0 = this.c;
p1 = (( e.h.d.a.a.s.g0 ) p1 ).a ( p2, v0 ); // invoke-virtual {p1, p2, v0}, Le/h/d/a/a/s/g0;->a(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Lfr/mbs/binary/Octets;)Z
final String p2 = "packid.TokenUpdater"; // const-string p2, "packid.TokenUpdater"
if ( p1 != null) { // if-eqz p1, :cond_0
final String p1 = "Token synchronised with server"; // const-string p1, "Token synchronised with server"
/* .line 14 */
android.util.Log .i ( p2,p1 );
final String p1 = "Token synchronised"; // const-string p1, "Token synchronised"
/* .line 15 */
com.orange.oab.contactless.packid.debug.DebugConsole .log ( p2,p1 );
/* .line 16 */
/* new-instance p1, Le/h/d/a/a/r/a; */
p2 = this.a;
/* invoke-direct {p1, p2}, Le/h/d/a/a/r/a;-><init>(Landroid/content/Context;)V */
(( e.h.d.a.a.r.a ) p1 ).c ( ); // invoke-virtual {p1}, Le/h/d/a/a/r/a;->c()V
} // :cond_0
final String p1 = "Token synchronisation with server canceled, token was probably modified locally during remote update"; // const-string p1, "Token synchronisation with server canceled, token was probably modified locally during remote update"
/* .line 17 */
android.util.Log .i ( p2,p1 );
final String p1 = "Token synchro canceled"; // const-string p1, "Token synchro canceled"
/* .line 18 */
com.orange.oab.contactless.packid.debug.DebugConsole .log ( p2,p1 );
} // :goto_0
return;
} // .end method
public void a ( java.lang.Throwable p0 ) {
/* .locals 5 */
/* .line 19 */
v0 = this.a;
int v2 = 1; // const/4 v2, 0x1
/* new-array v2, v2, [Ljava/lang/Object; */
v3 = this.b;
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v3 ).getDescription ( ); // invoke-virtual {v3}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getDescription()Ljava/lang/String;
int v4 = 0; // const/4 v4, 0x0
/* aput-object v3, v2, v4 */
(( android.content.Context ) v0 ).getString ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;
com.orange.oab.contactless.packid.report.ReportSender .send ( v0,p1 );
return;
} // .end method
