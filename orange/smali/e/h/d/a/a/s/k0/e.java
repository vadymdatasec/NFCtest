public class e.h.d.a.a.s.k0.e extends e.h.d.a.a.s.k0.d {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final com.orange.oab.contactless.packid.hce.user.User a;
	 /* # direct methods */
	 public e.h.d.a.a.s.k0.e ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Le/h/d/a/a/s/k0/d;-><init>()V */
		 /* .line 2 */
		 this.a = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.Object a ( android.database.sqlite.SQLiteDatabase p0 ) { //bridge//synthethic
		 /* .locals 0 */
		 /* .line 1 */
		 (( e.h.d.a.a.s.k0.e ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/s/k0/e;->a(Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Void;
	 } // .end method
	 public java.lang.Void a ( android.database.sqlite.SQLiteDatabase p0 ) {
		 /* .locals 5 */
		 /* .line 2 */
		 /* new-instance v0, Landroid/content/ContentValues; */
		 /* invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V */
		 /* .line 3 */
		 v1 = this.a;
		 (( com.orange.oab.contactless.packid.hce.user.User ) v1 ).getEmail ( ); // invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->getEmail()Ljava/lang/String;
		 final String v2 = "email"; // const-string v2, "email"
		 (( android.content.ContentValues ) v0 ).put ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
		 /* .line 4 */
		 v1 = this.a;
		 (( com.orange.oab.contactless.packid.hce.user.User ) v1 ).getFirstname ( ); // invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->getFirstname()Ljava/lang/String;
		 final String v2 = "firstname"; // const-string v2, "firstname"
		 (( android.content.ContentValues ) v0 ).put ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
		 /* .line 5 */
		 v1 = this.a;
		 (( com.orange.oab.contactless.packid.hce.user.User ) v1 ).getLastname ( ); // invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->getLastname()Ljava/lang/String;
		 final String v2 = "lastname"; // const-string v2, "lastname"
		 (( android.content.ContentValues ) v0 ).put ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
		 /* .line 6 */
		 v1 = this.a;
		 (( com.orange.oab.contactless.packid.hce.user.User ) v1 ).getWallet ( ); // invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->getWallet()Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;
		 (( com.orange.oab.contactless.packid.hce.user.wallet.Wallet ) v1 ).getId ( ); // invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;->getId()Lfr/mbs/binary/Octets;
		 (( fr.mbs.binary.Octets ) v1 ).toHexa ( ); // invoke-virtual {v1}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;
		 final String v2 = "walletId"; // const-string v2, "walletId"
		 (( android.content.ContentValues ) v0 ).put ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
		 /* .line 7 */
		 v1 = this.a;
		 (( com.orange.oab.contactless.packid.hce.user.User ) v1 ).getContactlessId ( ); // invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->getContactlessId()Lfr/mbs/binary/Octets;
		 int v2 = 0; // const/4 v2, 0x0
		 /* if-nez v1, :cond_0 */
		 /* move-object v1, v2 */
	 } // :cond_0
	 v1 = this.a;
	 (( com.orange.oab.contactless.packid.hce.user.User ) v1 ).getContactlessId ( ); // invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->getContactlessId()Lfr/mbs/binary/Octets;
	 (( fr.mbs.binary.Octets ) v1 ).toHexa ( ); // invoke-virtual {v1}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;
} // :goto_0
final String v3 = "contactlessId"; // const-string v3, "contactlessId"
(( android.content.ContentValues ) v0 ).put ( v3, v1 ); // invoke-virtual {v0, v3, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
/* .line 8 */
v1 = this.a;
(( com.orange.oab.contactless.packid.hce.user.User ) v1 ).getTenant ( ); // invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->getTenant()Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;
if ( v1 != null) { // if-eqz v1, :cond_1
	 /* .line 9 */
	 v1 = this.a;
	 (( com.orange.oab.contactless.packid.hce.user.User ) v1 ).getTenant ( ); // invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->getTenant()Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;
	 (( com.orange.oab.contactless.packid.hce.user.wallet.Tenant ) v1 ).getName ( ); // invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;->getName()Ljava/lang/String;
	 final String v3 = "tenantName"; // const-string v3, "tenantName"
	 (( android.content.ContentValues ) v0 ).put ( v3, v1 ); // invoke-virtual {v0, v3, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
	 /* .line 10 */
} // :cond_1
v1 = this.a;
(( com.orange.oab.contactless.packid.hce.user.User ) v1 ).getCipheredUri ( ); // invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->getCipheredUri()Lfr/mbs/binary/Octets;
if ( v1 != null) { // if-eqz v1, :cond_3
	 /* .line 11 */
	 v1 = this.a;
	 (( com.orange.oab.contactless.packid.hce.user.User ) v1 ).getCipheredUri ( ); // invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->getCipheredUri()Lfr/mbs/binary/Octets;
	 /* if-nez v1, :cond_2 */
	 /* move-object v1, v2 */
} // :cond_2
v1 = this.a;
(( com.orange.oab.contactless.packid.hce.user.User ) v1 ).getCipheredUri ( ); // invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->getCipheredUri()Lfr/mbs/binary/Octets;
(( fr.mbs.binary.Octets ) v1 ).toHexa ( ); // invoke-virtual {v1}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;
} // :goto_1
final String v3 = "cipheredUri"; // const-string v3, "cipheredUri"
(( android.content.ContentValues ) v0 ).put ( v3, v1 ); // invoke-virtual {v0, v3, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
/* .line 12 */
} // :cond_3
v1 = this.a;
(( com.orange.oab.contactless.packid.hce.user.User ) v1 ).getId ( ); // invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->getId()Ljava/lang/String;
final String v3 = "id"; // const-string v3, "id"
(( android.content.ContentValues ) v0 ).put ( v3, v1 ); // invoke-virtual {v0, v3, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
/* .line 13 */
v1 = this.a;
v1 = (( com.orange.oab.contactless.packid.hce.user.User ) v1 ).isSimCentric ( ); // invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->isSimCentric()Z
java.lang.Boolean .valueOf ( v1 );
final String v4 = "simCentric"; // const-string v4, "simCentric"
(( android.content.ContentValues ) v0 ).put ( v4, v1 ); // invoke-virtual {v0, v4, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V
/* .line 14 */
v1 = this.a;
v1 = (( com.orange.oab.contactless.packid.hce.user.User ) v1 ).isFirebaseEnable ( ); // invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->isFirebaseEnable()Z
java.lang.Boolean .valueOf ( v1 );
final String v4 = "firebaseEnable"; // const-string v4, "firebaseEnable"
(( android.content.ContentValues ) v0 ).put ( v4, v1 ); // invoke-virtual {v0, v4, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V
/* .line 15 */
v1 = this.a;
v1 = (( com.orange.oab.contactless.packid.hce.user.User ) v1 ).isPremium ( ); // invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->isPremium()Z
java.lang.Boolean .valueOf ( v1 );
final String v4 = "premium"; // const-string v4, "premium"
(( android.content.ContentValues ) v0 ).put ( v4, v1 ); // invoke-virtual {v0, v4, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V
/* .line 16 */
v1 = this.a;
v1 = (( com.orange.oab.contactless.packid.hce.user.User ) v1 ).isSendEnrolmentNotification ( ); // invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->isSendEnrolmentNotification()Z
java.lang.Boolean .valueOf ( v1 );
final String v4 = "sendEnrolmentNotification"; // const-string v4, "sendEnrolmentNotification"
(( android.content.ContentValues ) v0 ).put ( v4, v1 ); // invoke-virtual {v0, v4, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V
/* .line 17 */
v1 = this.a;
(( com.orange.oab.contactless.packid.hce.user.User ) v1 ).getId ( ); // invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->getId()Ljava/lang/String;
(( e.h.d.a.a.s.k0.d ) p0 ).b ( v3, v1 ); // invoke-virtual {p0, v3, v1}, Le/h/d/a/a/s/k0/d;->b(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
v3 = this.a;
(( com.orange.oab.contactless.packid.hce.user.User ) v3 ).getId ( ); // invoke-virtual {v3}, Lcom/orange/oab/contactless/packid/hce/user/User;->getId()Ljava/lang/String;
(( e.h.d.a.a.s.k0.d ) p0 ).a ( v3 ); // invoke-virtual {p0, v3}, Le/h/d/a/a/s/k0/d;->a(Ljava/lang/String;)[Ljava/lang/String;
final String v4 = "user"; // const-string v4, "user"
(( android.database.sqlite.SQLiteDatabase ) p1 ).update ( v4, v0, v1, v3 ); // invoke-virtual {p1, v4, v0, v1, v3}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
} // .end method
