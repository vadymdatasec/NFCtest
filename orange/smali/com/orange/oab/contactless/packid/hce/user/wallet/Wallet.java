public class com.orange.oab.contactless.packid.hce.user.wallet.Wallet {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final fr.mbs.binary.Octets DEFAULT_WALLET_ID;
	 /* # instance fields */
	 public fr.mbs.binary.Octets a;
	 public java.util.List b;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/List<", */
	 /* "Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
/* # direct methods */
public static com.orange.oab.contactless.packid.hce.user.wallet.Wallet ( ) {
/* .locals 1 */
final String v0 = "F1F1F1F1F1F1F1F1F1F1F1F1F1F1F1F1"; // const-string v0, "F1F1F1F1F1F1F1F1F1F1F1F1F1F1F1F1"
/* .line 1 */
fr.mbs.binary.Octets .createOctets ( v0 );
return;
} // .end method
public com.orange.oab.contactless.packid.hce.user.wallet.Wallet ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
e.f.b.b.k .a ( );
this.b = v0;
int v0 = 0; // const/4 v0, 0x0
/* .line 3 */
this.a = v0;
return;
} // .end method
public com.orange.oab.contactless.packid.hce.user.wallet.Wallet ( ) {
/* .locals 1 */
/* .line 4 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 5 */
e.f.b.b.k .a ( );
this.b = v0;
/* .line 6 */
this.a = p1;
return;
} // .end method
public static com.orange.oab.contactless.packid.hce.user.wallet.Wallet defaultWallet ( android.content.Context p0, Object p1 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/orange/oab/contactless/packid/g/u/e; */
/* } */
} // .end annotation
/* .line 1 */
/* new-instance v0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet; */
v1 = com.orange.oab.contactless.packid.hce.user.wallet.Wallet.DEFAULT_WALLET_ID;
/* invoke-direct {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;-><init>(Lfr/mbs/binary/Octets;)V */
/* .line 2 */
v1 = this.b;
com.orange.oab.contactless.packid.hce.user.wallet.Badge .defaultSecuredBadge ( p0,p1 );
} // .end method
/* # virtual methods */
public Boolean equals ( java.lang.Object p0 ) {
/* .locals 1 */
/* if-ne p0, p1, :cond_0 */
int p1 = 1; // const/4 p1, 0x1
/* .line 1 */
} // :cond_0
/* instance-of v0, p1, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet; */
/* if-nez v0, :cond_1 */
int p1 = 0; // const/4 p1, 0x0
/* .line 2 */
} // :cond_1
/* check-cast p1, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet; */
/* .line 3 */
v0 = this.a;
p1 = this.a;
p1 = (( fr.mbs.binary.Octets ) v0 ).equals ( p1 ); // invoke-virtual {v0, p1}, Lfr/mbs/binary/Octets;->equals(Ljava/lang/Object;)Z
} // .end method
public com.orange.oab.contactless.packid.hce.user.wallet.Badge findBadgeByZone ( fr.mbs.binary.Octets p0 ) {
/* .locals 3 */
/* .line 1 */
(( com.orange.oab.contactless.packid.hce.user.wallet.Wallet ) p0 ).getBadges ( ); // invoke-virtual {p0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;->getBadges()Ljava/util/List;
v1 = } // :cond_0
if ( v1 != null) { // if-eqz v1, :cond_1
/* check-cast v1, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge; */
/* .line 2 */
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v1 ).getZoneId ( ); // invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getZoneId()Lfr/mbs/binary/Octets;
v2 = (( fr.mbs.binary.Octets ) v2 ).equals ( p1 ); // invoke-virtual {v2, p1}, Lfr/mbs/binary/Octets;->equals(Ljava/lang/Object;)Z
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 3 */
} // :cond_1
/* new-instance v0, Lcom/orange/oab/contactless/packid/hce/user/wallet/UnknownZoneIdException; */
/* invoke-direct {v0, p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/UnknownZoneIdException;-><init>(Lfr/mbs/binary/Octets;)V */
/* throw v0 */
} // .end method
public com.orange.oab.contactless.packid.hce.user.wallet.Badge findTokenByZone ( fr.mbs.binary.Octets p0 ) {
/* .locals 3 */
/* .line 1 */
(( com.orange.oab.contactless.packid.hce.user.wallet.Wallet ) p0 ).getBadges ( ); // invoke-virtual {p0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;->getBadges()Ljava/util/List;
v1 = } // :cond_0
if ( v1 != null) { // if-eqz v1, :cond_1
/* check-cast v1, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge; */
/* .line 2 */
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v1 ).getZoneId ( ); // invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getZoneId()Lfr/mbs/binary/Octets;
v2 = (( fr.mbs.binary.Octets ) v2 ).equals ( p1 ); // invoke-virtual {v2, p1}, Lfr/mbs/binary/Octets;->equals(Ljava/lang/Object;)Z
if ( v2 != null) { // if-eqz v2, :cond_0
v2 = (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v1 ).isToken ( ); // invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->isToken()Z
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 3 */
} // :cond_1
/* new-instance v0, Lcom/orange/oab/contactless/packid/hce/user/wallet/UnknownZoneIdException; */
/* invoke-direct {v0, p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/UnknownZoneIdException;-><init>(Lfr/mbs/binary/Octets;)V */
/* throw v0 */
} // .end method
public java.util.List getBadges ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/List<", */
/* "Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.b;
} // .end method
public fr.mbs.binary.Octets getId ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
} // :cond_0
/* new-instance v0, Lcom/orange/oab/contactless/packid/hce/user/wallet/a; */
/* invoke-direct {v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/a;-><init>()V */
/* throw v0 */
} // .end method
public java.util.List getZones ( ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/List<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 1 */
e.f.b.b.k .a ( );
/* .line 2 */
v1 = this.b;
v2 = } // :goto_0
if ( v2 != null) { // if-eqz v2, :cond_0
/* check-cast v2, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge; */
/* .line 3 */
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v2 ).getDescription ( ); // invoke-virtual {v2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getDescription()Ljava/lang/String;
} // :cond_0
} // .end method
public Integer hashCode ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.a;
v0 = (( fr.mbs.binary.Octets ) v0 ).hashCode ( ); // invoke-virtual {v0}, Lfr/mbs/binary/Octets;->hashCode()I
/* mul-int/lit8 v0, v0, 0x1f */
/* .line 2 */
v1 = v1 = this.b;
/* add-int/2addr v0, v1 */
} // .end method
