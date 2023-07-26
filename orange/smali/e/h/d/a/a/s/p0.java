public class e.h.d.a.a.s.p0 extends e.h.d.a.a.s.k0.o {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Le/h/d/a/a/s/k0/o<", */
	 /* "Lcom/orange/oab/contactless/packid/hce/user/User;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* # direct methods */
public e.h.d.a.a.s.p0 ( ) {
	 /* .locals 6 */
	 final String v1 = "user"; // const-string v1, "user"
	 int v2 = 0; // const/4 v2, 0x0
	 int v3 = 0; // const/4 v3, 0x0
	 int v4 = 0; // const/4 v4, 0x0
	 int v5 = 0; // const/4 v5, 0x0
	 /* move-object v0, p0 */
	 /* .line 1 */
	 /* invoke-direct/range {v0 ..v5}, Le/h/d/a/a/s/k0/o;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)V */
	 return;
} // .end method
/* # virtual methods */
public com.orange.oab.contactless.packid.hce.user.User a ( android.database.Cursor p0 ) {
	 /* .locals 4 */
	 /* .line 2 */
	 /* new-instance v0, Lcom/orange/oab/contactless/packid/hce/user/User; */
	 /* invoke-direct {v0}, Lcom/orange/oab/contactless/packid/hce/user/User;-><init>()V */
	 final String v1 = "email"; // const-string v1, "email"
	 /* .line 3 */
	 v1 = 	 e.h.d.a.a.m .a ( v1,p1 );
	 (( com.orange.oab.contactless.packid.hce.user.User ) v0 ).setEmail ( v1 ); // invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->setEmail(Ljava/lang/String;)V
	 final String v1 = "firstname"; // const-string v1, "firstname"
	 /* .line 4 */
	 v1 = 	 e.h.d.a.a.m .a ( v1,p1 );
	 (( com.orange.oab.contactless.packid.hce.user.User ) v0 ).setFirstname ( v1 ); // invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->setFirstname(Ljava/lang/String;)V
	 final String v1 = "lastname"; // const-string v1, "lastname"
	 /* .line 5 */
	 v1 = 	 e.h.d.a.a.m .a ( v1,p1 );
	 (( com.orange.oab.contactless.packid.hce.user.User ) v0 ).setLastname ( v1 ); // invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->setLastname(Ljava/lang/String;)V
	 /* .line 6 */
	 /* new-instance v1, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet; */
	 final String v2 = "walletId"; // const-string v2, "walletId"
	 v2 = 	 e.h.d.a.a.m .a ( v2,p1 );
	 fr.mbs.binary.Octets .createOctets ( v2 );
	 /* invoke-direct {v1, v2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;-><init>(Lfr/mbs/binary/Octets;)V */
	 (( com.orange.oab.contactless.packid.hce.user.User ) v0 ).setWallet ( v1 ); // invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->setWallet(Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;)V
	 final String v1 = "contactlessId"; // const-string v1, "contactlessId"
	 /* .line 7 */
	 v1 = 	 e.h.d.a.a.m .a ( v1,p1 );
	 /* .line 8 */
	 v2 = 	 e.f.b.a.q .a ( v1 );
	 int v3 = 0; // const/4 v3, 0x0
	 if ( v2 != null) { // if-eqz v2, :cond_0
		 /* move-object v1, v3 */
	 } // :cond_0
	 fr.mbs.binary.Octets .createOctets ( v1 );
} // :goto_0
(( com.orange.oab.contactless.packid.hce.user.User ) v0 ).setContactlessId ( v1 ); // invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->setContactlessId(Lfr/mbs/binary/Octets;)V
final String v1 = "cipheredUri"; // const-string v1, "cipheredUri"
/* .line 9 */
v1 = e.h.d.a.a.m .a ( v1,p1 );
/* .line 10 */
v1 = e.f.b.a.q .a ( p1 );
if ( v1 != null) { // if-eqz v1, :cond_1
} // :cond_1
fr.mbs.binary.Octets .createOctets ( p1 );
} // :goto_1
(( com.orange.oab.contactless.packid.hce.user.User ) v0 ).setCipheredUri ( v3 ); // invoke-virtual {v0, v3}, Lcom/orange/oab/contactless/packid/hce/user/User;->setCipheredUri(Lfr/mbs/binary/Octets;)V
} // .end method
public java.lang.Object a ( android.database.Cursor p0 ) { //bridge//synthethic
/* .locals 0 */
/* .line 1 */
(( e.h.d.a.a.s.p0 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/s/p0;->a(Landroid/database/Cursor;)Lcom/orange/oab/contactless/packid/hce/user/User;
} // .end method
