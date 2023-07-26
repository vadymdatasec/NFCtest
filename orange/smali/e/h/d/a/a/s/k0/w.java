public class e.h.d.a.a.s.k0.w extends e.h.d.a.a.s.k0.o {
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
public e.h.d.a.a.s.k0.w ( ) {
	 /* .locals 1 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 2 */
	 /* invoke-direct {p0, v0, v0}, Le/h/d/a/a/s/k0/w;-><init>(Ljava/lang/String;[Ljava/lang/String;)V */
	 return;
} // .end method
public e.h.d.a.a.s.k0.w ( ) {
	 /* .locals 6 */
	 final String v1 = "user"; // const-string v1, "user"
	 int v2 = 0; // const/4 v2, 0x0
	 int v5 = 0; // const/4 v5, 0x0
	 /* move-object v0, p0 */
	 /* move-object v3, p1 */
	 /* move-object v4, p2 */
	 /* .line 1 */
	 /* invoke-direct/range {v0 ..v5}, Le/h/d/a/a/s/k0/o;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)V */
	 return;
} // .end method
/* # virtual methods */
public com.orange.oab.contactless.packid.hce.user.User a ( android.database.Cursor p0 ) {
	 /* .locals 3 */
	 /* .line 10 */
	 /* new-instance v0, Lcom/orange/oab/contactless/packid/hce/user/User; */
	 /* invoke-direct {v0}, Lcom/orange/oab/contactless/packid/hce/user/User;-><init>()V */
	 final String v1 = "email"; // const-string v1, "email"
	 /* .line 11 */
	 (( e.h.d.a.a.s.k0.w ) p0 ).c ( p1, v1 ); // invoke-virtual {p0, p1, v1}, Le/h/d/a/a/s/k0/w;->c(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;
	 (( com.orange.oab.contactless.packid.hce.user.User ) v0 ).setEmail ( v1 ); // invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->setEmail(Ljava/lang/String;)V
	 final String v1 = "firstname"; // const-string v1, "firstname"
	 /* .line 12 */
	 (( e.h.d.a.a.s.k0.w ) p0 ).c ( p1, v1 ); // invoke-virtual {p0, p1, v1}, Le/h/d/a/a/s/k0/w;->c(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;
	 (( com.orange.oab.contactless.packid.hce.user.User ) v0 ).setFirstname ( v1 ); // invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->setFirstname(Ljava/lang/String;)V
	 final String v1 = "lastname"; // const-string v1, "lastname"
	 /* .line 13 */
	 (( e.h.d.a.a.s.k0.w ) p0 ).c ( p1, v1 ); // invoke-virtual {p0, p1, v1}, Le/h/d/a/a/s/k0/w;->c(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;
	 (( com.orange.oab.contactless.packid.hce.user.User ) v0 ).setLastname ( v1 ); // invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->setLastname(Ljava/lang/String;)V
	 /* .line 14 */
	 /* new-instance v1, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet; */
	 final String v2 = "walletId"; // const-string v2, "walletId"
	 (( e.h.d.a.a.s.k0.w ) p0 ).b ( p1, v2 ); // invoke-virtual {p0, p1, v2}, Le/h/d/a/a/s/k0/w;->b(Landroid/database/Cursor;Ljava/lang/String;)Lfr/mbs/binary/Octets;
	 /* invoke-direct {v1, v2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;-><init>(Lfr/mbs/binary/Octets;)V */
	 (( com.orange.oab.contactless.packid.hce.user.User ) v0 ).setWallet ( v1 ); // invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->setWallet(Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;)V
	 final String v1 = "contactlessId"; // const-string v1, "contactlessId"
	 /* .line 15 */
	 (( e.h.d.a.a.s.k0.w ) p0 ).b ( p1, v1 ); // invoke-virtual {p0, p1, v1}, Le/h/d/a/a/s/k0/w;->b(Landroid/database/Cursor;Ljava/lang/String;)Lfr/mbs/binary/Octets;
	 (( com.orange.oab.contactless.packid.hce.user.User ) v0 ).setContactlessId ( v1 ); // invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->setContactlessId(Lfr/mbs/binary/Octets;)V
	 final String v1 = "cipheredUri"; // const-string v1, "cipheredUri"
	 /* .line 16 */
	 (( e.h.d.a.a.s.k0.w ) p0 ).b ( p1, v1 ); // invoke-virtual {p0, p1, v1}, Le/h/d/a/a/s/k0/w;->b(Landroid/database/Cursor;Ljava/lang/String;)Lfr/mbs/binary/Octets;
	 (( com.orange.oab.contactless.packid.hce.user.User ) v0 ).setCipheredUri ( v1 ); // invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->setCipheredUri(Lfr/mbs/binary/Octets;)V
	 final String v1 = "id"; // const-string v1, "id"
	 /* .line 17 */
	 (( e.h.d.a.a.s.k0.w ) p0 ).c ( p1, v1 ); // invoke-virtual {p0, p1, v1}, Le/h/d/a/a/s/k0/w;->c(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;
	 (( com.orange.oab.contactless.packid.hce.user.User ) v0 ).setId ( v1 ); // invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->setId(Ljava/lang/String;)V
	 final String v1 = "simCentric"; // const-string v1, "simCentric"
	 /* .line 18 */
	 v1 = 	 (( e.h.d.a.a.s.k0.w ) p0 ).a ( p1, v1 ); // invoke-virtual {p0, p1, v1}, Le/h/d/a/a/s/k0/w;->a(Landroid/database/Cursor;Ljava/lang/String;)Z
	 (( com.orange.oab.contactless.packid.hce.user.User ) v0 ).setSimCentric ( v1 ); // invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->setSimCentric(Z)V
	 final String v1 = "firebaseEnable"; // const-string v1, "firebaseEnable"
	 /* .line 19 */
	 v1 = 	 (( e.h.d.a.a.s.k0.w ) p0 ).a ( p1, v1 ); // invoke-virtual {p0, p1, v1}, Le/h/d/a/a/s/k0/w;->a(Landroid/database/Cursor;Ljava/lang/String;)Z
	 (( com.orange.oab.contactless.packid.hce.user.User ) v0 ).setFirebaseEnable ( v1 ); // invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->setFirebaseEnable(Z)V
	 final String v1 = "premium"; // const-string v1, "premium"
	 /* .line 20 */
	 v1 = 	 (( e.h.d.a.a.s.k0.w ) p0 ).a ( p1, v1 ); // invoke-virtual {p0, p1, v1}, Le/h/d/a/a/s/k0/w;->a(Landroid/database/Cursor;Ljava/lang/String;)Z
	 (( com.orange.oab.contactless.packid.hce.user.User ) v0 ).setPremium ( v1 ); // invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->setPremium(Z)V
	 final String v1 = "sendEnrolmentNotification"; // const-string v1, "sendEnrolmentNotification"
	 /* .line 21 */
	 v1 = 	 (( e.h.d.a.a.s.k0.w ) p0 ).a ( p1, v1 ); // invoke-virtual {p0, p1, v1}, Le/h/d/a/a/s/k0/w;->a(Landroid/database/Cursor;Ljava/lang/String;)Z
	 (( com.orange.oab.contactless.packid.hce.user.User ) v0 ).setSendEnrolmentNotification ( v1 ); // invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->setSendEnrolmentNotification(Z)V
	 final String v1 = "tenantName"; // const-string v1, "tenantName"
	 /* .line 22 */
	 (( e.h.d.a.a.s.k0.w ) p0 ).c ( p1, v1 ); // invoke-virtual {p0, p1, v1}, Le/h/d/a/a/s/k0/w;->c(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;
	 if ( p1 != null) { // if-eqz p1, :cond_0
		 /* .line 23 */
		 /* new-instance v1, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant; */
		 /* invoke-direct {v1, p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;-><init>(Ljava/lang/String;)V */
		 (( com.orange.oab.contactless.packid.hce.user.User ) v0 ).setTenant ( v1 ); // invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->setTenant(Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;)V
	 } // :cond_0
} // .end method
public java.lang.Object a ( android.database.Cursor p0 ) { //bridge//synthethic
	 /* .locals 0 */
	 /* .line 1 */
	 (( e.h.d.a.a.s.k0.w ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/s/k0/w;->a(Landroid/database/Cursor;)Lcom/orange/oab/contactless/packid/hce/user/User;
} // .end method
public java.lang.Object a ( android.database.sqlite.SQLiteDatabase p0 ) { //bridge//synthethic
	 /* .locals 0 */
	 /* .line 2 */
	 (( e.h.d.a.a.s.k0.w ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/s/k0/w;->a(Landroid/database/sqlite/SQLiteDatabase;)Ljava/util/List;
} // .end method
public java.util.List a ( android.database.sqlite.SQLiteDatabase p0 ) {
	 /* .locals 5 */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "(", */
	 /* "Landroid/database/sqlite/SQLiteDatabase;", */
	 /* ")", */
	 /* "Ljava/util/List<", */
	 /* "Lcom/orange/oab/contactless/packid/hce/user/User;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* .line 3 */
/* invoke-super {p0, p1}, Le/h/d/a/a/s/k0/o;->a(Landroid/database/sqlite/SQLiteDatabase;)Ljava/util/List; */
/* .line 4 */
} // :cond_0
v2 = } // :goto_0
if ( v2 != null) { // if-eqz v2, :cond_1
/* check-cast v2, Lcom/orange/oab/contactless/packid/hce/user/User; */
/* .line 5 */
/* new-instance v3, Le/h/d/a/a/s/k0/l; */
(( com.orange.oab.contactless.packid.hce.user.User ) v2 ).getId ( ); // invoke-virtual {v2}, Lcom/orange/oab/contactless/packid/hce/user/User;->getId()Ljava/lang/String;
/* invoke-direct {v3, v4}, Le/h/d/a/a/s/k0/l;-><init>(Ljava/lang/String;)V */
(( e.h.d.a.a.s.k0.l ) v3 ).a ( p1 ); // invoke-virtual {v3, p1}, Le/h/d/a/a/s/k0/l;->a(Landroid/database/sqlite/SQLiteDatabase;)Ljava/util/List;
/* .line 6 */
(( com.orange.oab.contactless.packid.hce.user.User ) v2 ).getWallet ( ); // invoke-virtual {v2}, Lcom/orange/oab/contactless/packid/hce/user/User;->getWallet()Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;
(( com.orange.oab.contactless.packid.hce.user.wallet.Wallet ) v4 ).getBadges ( ); // invoke-virtual {v4}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;->getBadges()Ljava/util/List;
/* .line 7 */
(( com.orange.oab.contactless.packid.hce.user.User ) v2 ).getTenant ( ); // invoke-virtual {v2}, Lcom/orange/oab/contactless/packid/hce/user/User;->getTenant()Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;
if ( v3 != null) { // if-eqz v3, :cond_0
(( com.orange.oab.contactless.packid.hce.user.User ) v2 ).getTenant ( ); // invoke-virtual {v2}, Lcom/orange/oab/contactless/packid/hce/user/User;->getTenant()Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;
v3 = (( com.orange.oab.contactless.packid.hce.user.wallet.Tenant ) v3 ).isDefault ( ); // invoke-virtual {v3}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;->isDefault()Z
/* if-nez v3, :cond_0 */
/* .line 8 */
/* new-instance v3, Le/h/d/a/a/s/k0/p; */
(( com.orange.oab.contactless.packid.hce.user.User ) v2 ).getTenant ( ); // invoke-virtual {v2}, Lcom/orange/oab/contactless/packid/hce/user/User;->getTenant()Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;
(( com.orange.oab.contactless.packid.hce.user.wallet.Tenant ) v4 ).getName ( ); // invoke-virtual {v4}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;->getName()Ljava/lang/String;
/* invoke-direct {v3, v4}, Le/h/d/a/a/s/k0/p;-><init>(Ljava/lang/String;)V */
(( e.h.d.a.a.s.k0.p ) v3 ).b ( p1 ); // invoke-virtual {v3, p1}, Le/h/d/a/a/s/k0/p;->b(Landroid/database/sqlite/SQLiteDatabase;)Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;
/* .line 9 */
(( com.orange.oab.contactless.packid.hce.user.User ) v2 ).setTenant ( v3 ); // invoke-virtual {v2, v3}, Lcom/orange/oab/contactless/packid/hce/user/User;->setTenant(Lcom/orange/oab/contactless/packid/hce/user/wallet/Tenant;)V
} // :cond_1
} // .end method
public final Boolean a ( android.database.Cursor p0, java.lang.String p1 ) {
/* .locals 2 */
p2 = /* .line 24 */
int v0 = 0; // const/4 v0, 0x0
int v1 = -1; // const/4 v1, -0x1
/* if-eq p2, v1, :cond_0 */
p1 = /* .line 25 */
/* if-lez p1, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
} // .end method
public final fr.mbs.binary.Octets b ( android.database.Cursor p0, java.lang.String p1 ) {
/* .locals 0 */
/* .line 1 */
(( e.h.d.a.a.s.k0.w ) p0 ).c ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/h/d/a/a/s/k0/w;->c(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 2 */
p2 = (( java.lang.String ) p1 ).isEmpty ( ); // invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z
/* if-nez p2, :cond_0 */
/* .line 3 */
fr.mbs.binary.Octets .createOctets ( p1 );
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // .end method
public final java.lang.String c ( android.database.Cursor p0, java.lang.String p1 ) {
/* .locals 1 */
p2 = /* .line 1 */
int v0 = -1; // const/4 v0, -0x1
/* if-eq p2, v0, :cond_0 */
/* .line 2 */
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // .end method
