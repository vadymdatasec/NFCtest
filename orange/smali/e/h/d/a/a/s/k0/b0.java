public class e.h.d.a.a.s.k0.b0 extends e.h.d.a.a.s.k0.z {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Le/h/d/a/a/s/k0/z<", */
	 /* "Lcom/orange/oab/contactless/packid/hce/user/User;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* # direct methods */
public e.h.d.a.a.s.k0.b0 ( ) {
	 /* .locals 1 */
	 final String v0 = "user"; // const-string v0, "user"
	 /* .line 1 */
	 /* invoke-direct {p0, p1, v0}, Le/h/d/a/a/s/k0/z;-><init>(Ljava/lang/Object;Ljava/lang/String;)V */
	 return;
} // .end method
public static android.content.ContentValues b ( com.orange.oab.contactless.packid.hce.user.User p0 ) {
	 /* .locals 4 */
	 /* .line 1 */
	 /* new-instance v0, Landroid/content/ContentValues; */
	 /* invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V */
	 /* .line 2 */
	 (( com.orange.oab.contactless.packid.hce.user.User ) p0 ).getEmail ( ); // invoke-virtual {p0}, Lcom/orange/oab/contactless/packid/hce/user/User;->getEmail()Ljava/lang/String;
	 final String v2 = "email"; // const-string v2, "email"
	 (( android.content.ContentValues ) v0 ).put ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
	 /* .line 3 */
	 (( com.orange.oab.contactless.packid.hce.user.User ) p0 ).getFirstname ( ); // invoke-virtual {p0}, Lcom/orange/oab/contactless/packid/hce/user/User;->getFirstname()Ljava/lang/String;
	 final String v2 = "firstname"; // const-string v2, "firstname"
	 (( android.content.ContentValues ) v0 ).put ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
	 /* .line 4 */
	 (( com.orange.oab.contactless.packid.hce.user.User ) p0 ).getLastname ( ); // invoke-virtual {p0}, Lcom/orange/oab/contactless/packid/hce/user/User;->getLastname()Ljava/lang/String;
	 final String v2 = "lastname"; // const-string v2, "lastname"
	 (( android.content.ContentValues ) v0 ).put ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
	 /* .line 5 */
	 (( com.orange.oab.contactless.packid.hce.user.User ) p0 ).getContactlessId ( ); // invoke-virtual {p0}, Lcom/orange/oab/contactless/packid/hce/user/User;->getContactlessId()Lfr/mbs/binary/Octets;
	 int v2 = 0; // const/4 v2, 0x0
	 /* if-nez v1, :cond_0 */
	 /* move-object v1, v2 */
} // :cond_0
(( com.orange.oab.contactless.packid.hce.user.User ) p0 ).getContactlessId ( ); // invoke-virtual {p0}, Lcom/orange/oab/contactless/packid/hce/user/User;->getContactlessId()Lfr/mbs/binary/Octets;
(( fr.mbs.binary.Octets ) v1 ).toHexa ( ); // invoke-virtual {v1}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;
} // :goto_0
final String v3 = "contactlessId"; // const-string v3, "contactlessId"
(( android.content.ContentValues ) v0 ).put ( v3, v1 ); // invoke-virtual {v0, v3, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
/* .line 6 */
(( com.orange.oab.contactless.packid.hce.user.User ) p0 ).getWallet ( ); // invoke-virtual {p0}, Lcom/orange/oab/contactless/packid/hce/user/User;->getWallet()Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;
(( com.orange.oab.contactless.packid.hce.user.wallet.Wallet ) v1 ).getId ( ); // invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;->getId()Lfr/mbs/binary/Octets;
(( fr.mbs.binary.Octets ) v1 ).toHexa ( ); // invoke-virtual {v1}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;
final String v3 = "walletId"; // const-string v3, "walletId"
(( android.content.ContentValues ) v0 ).put ( v3, v1 ); // invoke-virtual {v0, v3, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
/* .line 7 */
(( com.orange.oab.contactless.packid.hce.user.User ) p0 ).getTenant ( ); // invoke-virtual {p0}, Lcom/orange/oab/contactless/packid/hce/user/User;->getTenant()Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;
/* if-nez v1, :cond_1 */
/* move-object v1, v2 */
} // :cond_1
(( com.orange.oab.contactless.packid.hce.user.User ) p0 ).getTenant ( ); // invoke-virtual {p0}, Lcom/orange/oab/contactless/packid/hce/user/User;->getTenant()Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;
(( com.orange.oab.contactless.packid.hce.user.wallet.Tenant ) v1 ).getName ( ); // invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;->getName()Ljava/lang/String;
} // :goto_1
final String v3 = "tenantName"; // const-string v3, "tenantName"
(( android.content.ContentValues ) v0 ).put ( v3, v1 ); // invoke-virtual {v0, v3, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
/* .line 8 */
(( com.orange.oab.contactless.packid.hce.user.User ) p0 ).getCipheredUri ( ); // invoke-virtual {p0}, Lcom/orange/oab/contactless/packid/hce/user/User;->getCipheredUri()Lfr/mbs/binary/Octets;
/* if-nez v1, :cond_2 */
} // :cond_2
(( com.orange.oab.contactless.packid.hce.user.User ) p0 ).getCipheredUri ( ); // invoke-virtual {p0}, Lcom/orange/oab/contactless/packid/hce/user/User;->getCipheredUri()Lfr/mbs/binary/Octets;
(( fr.mbs.binary.Octets ) v1 ).toHexa ( ); // invoke-virtual {v1}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;
} // :goto_2
final String v1 = "cipheredUri"; // const-string v1, "cipheredUri"
(( android.content.ContentValues ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
/* .line 9 */
(( com.orange.oab.contactless.packid.hce.user.User ) p0 ).getId ( ); // invoke-virtual {p0}, Lcom/orange/oab/contactless/packid/hce/user/User;->getId()Ljava/lang/String;
final String v2 = "id"; // const-string v2, "id"
(( android.content.ContentValues ) v0 ).put ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
/* .line 10 */
v1 = (( com.orange.oab.contactless.packid.hce.user.User ) p0 ).isSimCentric ( ); // invoke-virtual {p0}, Lcom/orange/oab/contactless/packid/hce/user/User;->isSimCentric()Z
java.lang.Boolean .valueOf ( v1 );
final String v2 = "simCentric"; // const-string v2, "simCentric"
(( android.content.ContentValues ) v0 ).put ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V
/* .line 11 */
v1 = (( com.orange.oab.contactless.packid.hce.user.User ) p0 ).isFirebaseEnable ( ); // invoke-virtual {p0}, Lcom/orange/oab/contactless/packid/hce/user/User;->isFirebaseEnable()Z
java.lang.Boolean .valueOf ( v1 );
final String v2 = "firebaseEnable"; // const-string v2, "firebaseEnable"
(( android.content.ContentValues ) v0 ).put ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V
/* .line 12 */
v1 = (( com.orange.oab.contactless.packid.hce.user.User ) p0 ).isPremium ( ); // invoke-virtual {p0}, Lcom/orange/oab/contactless/packid/hce/user/User;->isPremium()Z
java.lang.Boolean .valueOf ( v1 );
final String v2 = "premium"; // const-string v2, "premium"
(( android.content.ContentValues ) v0 ).put ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V
/* .line 13 */
p0 = (( com.orange.oab.contactless.packid.hce.user.User ) p0 ).isSendEnrolmentNotification ( ); // invoke-virtual {p0}, Lcom/orange/oab/contactless/packid/hce/user/User;->isSendEnrolmentNotification()Z
java.lang.Boolean .valueOf ( p0 );
final String v1 = "sendEnrolmentNotification"; // const-string v1, "sendEnrolmentNotification"
(( android.content.ContentValues ) v0 ).put ( v1, p0 ); // invoke-virtual {v0, v1, p0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V
} // .end method
/* # virtual methods */
public android.content.ContentValues a ( com.orange.oab.contactless.packid.hce.user.User p0 ) {
/* .locals 0 */
/* .line 2 */
e.h.d.a.a.s.k0.b0 .b ( p1 );
} // .end method
public android.content.ContentValues a ( java.lang.Object p0 ) { //bridge//synthethic
/* .locals 0 */
/* .line 1 */
/* check-cast p1, Lcom/orange/oab/contactless/packid/hce/user/User; */
(( e.h.d.a.a.s.k0.b0 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/s/k0/b0;->a(Lcom/orange/oab/contactless/packid/hce/user/User;)Landroid/content/ContentValues;
} // .end method
