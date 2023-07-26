public class e.h.d.a.a.s.k0.m extends e.h.d.a.a.s.k0.o {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Le/h/d/a/a/s/k0/o<", */
	 /* "Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* # direct methods */
public e.h.d.a.a.s.k0.m ( ) {
	 /* .locals 6 */
	 final String v2 = "description"; // const-string v2, "description"
	 /* move-object v0, p0 */
	 /* move-object v1, p1 */
	 /* move-object v3, p2 */
	 /* move-object v4, p3 */
	 /* move-object v5, p4 */
	 /* .line 1 */
	 /* invoke-direct/range {v0 ..v5}, Le/h/d/a/a/s/k0/o;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)V */
	 return;
} // .end method
public e.h.d.a.a.s.k0.m ( ) {
	 /* .locals 1 */
	 final String v0 = "badge"; // const-string v0, "badge"
	 /* .line 2 */
	 /* invoke-direct {p0, v0, p1, p2, p3}, Le/h/d/a/a/s/k0/m;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)V */
	 return;
} // .end method
public static com.orange.oab.contactless.packid.hce.user.wallet.BadgeStatus c ( android.database.Cursor p0, java.lang.String p1 ) {
	 /* .locals 0 */
	 /* .line 1 */
	 e.h.d.a.a.s.k0.m .g ( p0,p1 );
	 com.orange.oab.contactless.packid.hce.user.wallet.BadgeStatus .valueOf ( p0 );
} // .end method
public static java.lang.Integer d ( android.database.Cursor p0, java.lang.String p1 ) {
	 /* .locals 1 */
	 p1 = 	 /* .line 1 */
	 /* if-ltz p1, :cond_1 */
	 v0 = 	 /* .line 2 */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 3 */
	 p0 = 	 } // :cond_0
	 java.lang.Integer .valueOf ( p0 );
} // :cond_1
} // :goto_0
int p0 = 0; // const/4 p0, 0x0
} // .end method
public static fr.mbs.binary.Octets e ( android.database.Cursor p0, java.lang.String p1 ) {
/* .locals 1 */
p1 = /* .line 1 */
v0 = /* .line 2 */
if ( v0 != null) { // if-eqz v0, :cond_0
int p0 = 0; // const/4 p0, 0x0
/* .line 3 */
} // :cond_0
fr.mbs.binary.Octets .createOctets ( p0 );
} // .end method
public static java.lang.String f ( android.database.Cursor p0, java.lang.String p1 ) {
/* .locals 1 */
p1 = /* .line 1 */
/* if-ltz p1, :cond_1 */
v0 = /* .line 2 */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
} // :cond_0
} // :cond_1
} // :goto_0
int p0 = 0; // const/4 p0, 0x0
} // .end method
public static java.lang.String g ( android.database.Cursor p0, java.lang.String p1 ) {
/* .locals 0 */
/* .line 1 */
p1 = e.h.d.a.a.m .a ( p1,p0 );
} // .end method
/* # virtual methods */
public com.orange.oab.contactless.packid.hce.user.wallet.Badge a ( android.database.Cursor p0 ) {
/* .locals 7 */
final String v0 = "cipheredId"; // const-string v0, "cipheredId"
/* .line 2 */
e.h.d.a.a.s.k0.m .g ( p1,v0 );
fr.mbs.binary.Octets .createOctets ( v0 );
final String v0 = "zoneId"; // const-string v0, "zoneId"
/* .line 3 */
e.h.d.a.a.s.k0.m .g ( p1,v0 );
fr.mbs.binary.Octets .createOctets ( v0 );
final String v0 = "cipheredWalletKey"; // const-string v0, "cipheredWalletKey"
/* .line 4 */
e.h.d.a.a.s.k0.m .e ( p1,v0 );
final String v0 = "description"; // const-string v0, "description"
/* .line 5 */
e.h.d.a.a.s.k0.m .g ( p1,v0 );
final String v0 = "maskedId"; // const-string v0, "maskedId"
/* .line 6 */
e.h.d.a.a.s.k0.m .g ( p1,v0 );
/* .line 7 */
/* new-instance v0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge; */
/* move-object v1, v0 */
/* invoke-direct/range {v1 ..v6}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;-><init>(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;Lfr/mbs/binary/Octets;Ljava/lang/String;)V */
final String v1 = "logoFile"; // const-string v1, "logoFile"
/* .line 8 */
e.h.d.a.a.s.k0.m .g ( p1,v1 );
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v0 ).setLogoFile ( v1 ); // invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setLogoFile(Ljava/lang/String;)V
final String v1 = "cipheredTokenDataSignature"; // const-string v1, "cipheredTokenDataSignature"
/* .line 9 */
e.h.d.a.a.s.k0.m .e ( p1,v1 );
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v0 ).setCipheredTokenDataSignature ( v1 ); // invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setCipheredTokenDataSignature(Lfr/mbs/binary/Octets;)V
final String v1 = "tokenData"; // const-string v1, "tokenData"
/* .line 10 */
e.h.d.a.a.s.k0.m .e ( p1,v1 );
/* if-nez v1, :cond_0 */
int v1 = 0; // const/4 v1, 0x0
/* .line 11 */
} // :cond_0
com.orange.oab.contactless.packid.hce.user.TokenData .parse ( v1 );
} // :goto_0
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v0 ).setTokenData ( v1 ); // invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setTokenData(Lcom/orange/oab/contactless/packid/hce/user/TokenData;)V
final String v1 = "cipheredUrl"; // const-string v1, "cipheredUrl"
/* .line 12 */
e.h.d.a.a.s.k0.m .e ( p1,v1 );
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v0 ).setCipheredUrl ( v1 ); // invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setCipheredUrl(Lfr/mbs/binary/Octets;)V
/* .line 13 */
/* new-instance v1, Ljava/util/Date; */
final String v2 = "regenerationDate"; // const-string v2, "regenerationDate"
v2 = e.h.d.a.a.m .a ( v2,p1 );
/* move-result-wide v2 */
/* invoke-direct {v1, v2, v3}, Ljava/util/Date;-><init>(J)V */
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v0 ).setRegenerationDate ( v1 ); // invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setRegenerationDate(Ljava/util/Date;)V
final String v1 = "isTransactionAllowed"; // const-string v1, "isTransactionAllowed"
/* .line 14 */
v1 = v1 = e.h.d.a.a.m .a ( v1,p1 );
int v2 = 1; // const/4 v2, 0x1
/* if-ne v1, v2, :cond_1 */
} // :cond_1
int v2 = 0; // const/4 v2, 0x0
} // :goto_1
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v0 ).setTransactionAllowed ( v2 ); // invoke-virtual {v0, v2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setTransactionAllowed(Z)V
final String v1 = "rssi"; // const-string v1, "rssi"
/* .line 15 */
v1 = v1 = e.h.d.a.a.m .a ( v1,p1 );
/* int-to-byte v1, v1 */
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v0 ).setRssi ( v1 ); // invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setRssi(B)V
final String v1 = "rssiButtonInterval"; // const-string v1, "rssiButtonInterval"
/* .line 16 */
v1 = v1 = e.h.d.a.a.m .a ( v1,p1 );
/* int-to-byte v1, v1 */
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v0 ).setRssiButtonInterval ( v1 ); // invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setRssiButtonInterval(B)V
final String v1 = "userId"; // const-string v1, "userId"
/* .line 17 */
e.h.d.a.a.s.k0.m .g ( p1,v1 );
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v0 ).setUserId ( v1 ); // invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setUserId(Ljava/lang/String;)V
final String v1 = "bleSessionTimeout"; // const-string v1, "bleSessionTimeout"
/* .line 18 */
e.h.d.a.a.s.k0.m .d ( p1,v1 );
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v0 ).setBleSessionTimeout ( v1 ); // invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setBleSessionTimeout(Ljava/lang/Integer;)V
final String v1 = "delayAfterBadgeOk"; // const-string v1, "delayAfterBadgeOk"
/* .line 19 */
e.h.d.a.a.s.k0.m .d ( p1,v1 );
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v0 ).setDelayAfterBadgeOk ( v1 ); // invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setDelayAfterBadgeOk(Ljava/lang/Integer;)V
/* .line 20 */
(( e.h.d.a.a.s.k0.m ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Le/h/d/a/a/s/k0/m;->a(Landroid/database/Cursor;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)V
final String v1 = "lockable"; // const-string v1, "lockable"
/* .line 21 */
v1 = (( e.h.d.a.a.s.k0.m ) p0 ).a ( p1, v1 ); // invoke-virtual {p0, p1, v1}, Le/h/d/a/a/s/k0/m;->a(Landroid/database/Cursor;Ljava/lang/String;)Z
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v0 ).setLockable ( v1 ); // invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setLockable(Z)V
final String v1 = "unlockableByZoneID"; // const-string v1, "unlockableByZoneID"
/* .line 22 */
e.h.d.a.a.s.k0.m .e ( p1,v1 );
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v0 ).setUnlockableByZoneID ( v1 ); // invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setUnlockableByZoneID(Lfr/mbs/binary/Octets;)V
final String v1 = "unlockedDuration"; // const-string v1, "unlockedDuration"
/* .line 23 */
e.h.d.a.a.s.k0.m .d ( p1,v1 );
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v0 ).setUnlockedDuration ( v1 ); // invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setUnlockedDuration(Ljava/lang/Integer;)V
final String v1 = "badgeStatus"; // const-string v1, "badgeStatus"
/* .line 24 */
e.h.d.a.a.s.k0.m .c ( p1,v1 );
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v0 ).setStatus ( v1 ); // invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setStatus(Lcom/orange/oab/contactless/packid/hce/user/wallet/BadgeStatus;)V
final String v1 = "conditionToBeginTransaction"; // const-string v1, "conditionToBeginTransaction"
/* .line 25 */
e.h.d.a.a.s.k0.m .g ( p1,v1 );
com.orange.oab.contactless.packid.domain.ConditionToBeginTransaction .valueOf ( v1 );
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v0 ).setConditionToBeginTransaction ( v1 ); // invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setConditionToBeginTransaction(Lcom/orange/oab/contactless/packid/domain/ConditionToBeginTransaction;)V
final String v1 = "manualConnectionAllowed"; // const-string v1, "manualConnectionAllowed"
/* .line 26 */
v1 = (( e.h.d.a.a.s.k0.m ) p0 ).a ( p1, v1 ); // invoke-virtual {p0, p1, v1}, Le/h/d/a/a/s/k0/m;->a(Landroid/database/Cursor;Ljava/lang/String;)Z
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v0 ).setManualConnectionAllowed ( v1 ); // invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setManualConnectionAllowed(Z)V
/* .line 27 */
e.h.d.a.a.h .c ( );
v1 = (( e.h.d.a.a.h ) v1 ).a ( v0 ); // invoke-virtual {v1, v0}, Le/h/d/a/a/h;->a(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)Z
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v0 ).setLocked ( v1 ); // invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setLocked(Z)V
final String v1 = "rssiDurationForButtonComputation"; // const-string v1, "rssiDurationForButtonComputation"
/* .line 28 */
e.h.d.a.a.s.k0.m .d ( p1,v1 );
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 29 */
p1 = (( java.lang.Integer ) p1 ).intValue ( ); // invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I
} // :cond_2
int p1 = 2; // const/4 p1, 0x2
} // :goto_2
java.lang.Integer .valueOf ( p1 );
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v0 ).setRssiDurationForButtonComputation ( p1 ); // invoke-virtual {v0, p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setRssiDurationForButtonComputation(Ljava/lang/Integer;)V
} // .end method
public java.lang.Object a ( android.database.Cursor p0 ) { //bridge//synthethic
/* .locals 0 */
/* .line 1 */
(( e.h.d.a.a.s.k0.m ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/s/k0/m;->a(Landroid/database/Cursor;)Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;
} // .end method
public final void a ( android.database.Cursor p0, com.orange.oab.contactless.packid.hce.user.wallet.Badge p1 ) {
/* .locals 1 */
/* .line 31 */
v0 = (( e.h.d.a.a.s.k0.m ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/s/k0/m;->b(Landroid/database/Cursor;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 32 */
(( e.h.d.a.a.s.k0.m ) p0 ).a ( p2, p1 ); // invoke-virtual {p0, p2, p1}, Le/h/d/a/a/s/k0/m;->a(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Landroid/database/Cursor;)V
} // :cond_0
return;
} // .end method
public final void a ( com.orange.oab.contactless.packid.hce.user.wallet.Badge p0, android.database.Cursor p1 ) {
/* .locals 2 */
final String v0 = "contactlessType"; // const-string v0, "contactlessType"
/* .line 33 */
(( e.h.d.a.a.s.k0.m ) p0 ).b ( p2, v0 ); // invoke-virtual {p0, p2, v0}, Le/h/d/a/a/s/k0/m;->b(Landroid/database/Cursor;Ljava/lang/String;)Lcom/orange/oab/contactless/packid/ContactlessType;
/* .line 34 */
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p1 ).setContactlessType ( v0 ); // invoke-virtual {p1, v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setContactlessType(Lcom/orange/oab/contactless/packid/ContactlessType;)V
/* .line 35 */
v0 = (( e.h.d.a.a.s.k0.m ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/h/d/a/a/s/k0/m;->a(Lcom/orange/oab/contactless/packid/ContactlessType;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 36 */
/* new-instance v0, Le/h/d/a/a/l; */
/* invoke-direct {v0}, Le/h/d/a/a/l;-><init>()V */
final String v1 = "contactlessTypePersonalisedUp"; // const-string v1, "contactlessTypePersonalisedUp"
/* .line 37 */
(( e.h.d.a.a.s.k0.m ) p0 ).b ( p2, v1 ); // invoke-virtual {p0, p2, v1}, Le/h/d/a/a/s/k0/m;->b(Landroid/database/Cursor;Ljava/lang/String;)Lcom/orange/oab/contactless/packid/ContactlessType;
(( e.h.d.a.a.l ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Le/h/d/a/a/l;->b(Lcom/orange/oab/contactless/packid/ContactlessType;)V
final String v1 = "contactlessTypePersonalisedDown"; // const-string v1, "contactlessTypePersonalisedDown"
/* .line 38 */
(( e.h.d.a.a.s.k0.m ) p0 ).b ( p2, v1 ); // invoke-virtual {p0, p2, v1}, Le/h/d/a/a/s/k0/m;->b(Landroid/database/Cursor;Ljava/lang/String;)Lcom/orange/oab/contactless/packid/ContactlessType;
(( e.h.d.a.a.l ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/h/d/a/a/l;->a(Lcom/orange/oab/contactless/packid/ContactlessType;)V
final String v1 = "contactlessTypePersonalisedVersion"; // const-string v1, "contactlessTypePersonalisedVersion"
/* .line 39 */
e.h.d.a.a.s.k0.m .d ( p2,v1 );
(( e.h.d.a.a.l ) v0 ).a ( p2 ); // invoke-virtual {v0, p2}, Le/h/d/a/a/l;->a(Ljava/lang/Integer;)V
/* .line 40 */
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p1 ).setContactlessTypeInformation ( v0 ); // invoke-virtual {p1, v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setContactlessTypeInformation(Le/h/d/a/a/l;)V
} // :cond_0
return;
} // .end method
public final Boolean a ( android.database.Cursor p0, java.lang.String p1 ) {
/* .locals 0 */
/* .line 30 */
p1 = p2 = e.h.d.a.a.m .a ( p2,p1 );
/* if-lez p1, :cond_0 */
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
public final Boolean a ( com.orange.oab.contactless.packid.ContactlessType p0 ) {
/* .locals 1 */
/* .line 41 */
v0 = com.orange.oab.contactless.packid.ContactlessType.PERSONALISED;
/* if-ne p1, v0, :cond_0 */
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
public final com.orange.oab.contactless.packid.ContactlessType b ( android.database.Cursor p0, java.lang.String p1 ) {
/* .locals 0 */
/* .line 2 */
e.h.d.a.a.s.k0.m .f ( p1,p2 );
com.orange.oab.contactless.packid.ContactlessType .valueOf ( p1 );
} // .end method
public final Boolean b ( android.database.Cursor p0 ) {
/* .locals 1 */
final String v0 = "contactlessType"; // const-string v0, "contactlessType"
/* .line 1 */
e.h.d.a.a.s.k0.m .f ( p1,v0 );
if ( p1 != null) { // if-eqz p1, :cond_0
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
