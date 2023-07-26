public class com.orange.oab.contactless.packid.hce.user.wallet.Badge implements java.io.Serializable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge$a; */
	 /* } */
} // .end annotation
/* # static fields */
public static final fr.mbs.binary.Octets B;
public static final fr.mbs.binary.Octets DEFAULT_SECURED_ZONE_ID;
/* # instance fields */
public e.h.d.a.a.l A;
public fr.mbs.binary.Octets b;
public java.lang.String c;
public fr.mbs.binary.Octets d;
public fr.mbs.binary.Octets e;
public com.orange.oab.contactless.packid.hce.user.TokenData f;
public java.lang.String g;
public fr.mbs.binary.Octets h;
public fr.mbs.binary.Octets i;
public java.lang.String j;
public Object k;
public Object l;
public java.util.Date m;
public Boolean n;
public java.lang.String o;
public java.lang.Integer p;
public java.lang.Integer q;
public com.orange.oab.contactless.packid.ContactlessType r;
public Boolean s;
public fr.mbs.binary.Octets t;
public java.lang.Integer u;
public java.lang.Integer v;
public Boolean w;
public com.orange.oab.contactless.packid.hce.user.wallet.BadgeStatus x;
public com.orange.oab.contactless.packid.domain.ConditionToBeginTransaction y;
public Boolean z;
/* # direct methods */
public static com.orange.oab.contactless.packid.hce.user.wallet.Badge ( ) {
	 /* .locals 1 */
	 final String v0 = "0F0F0F0F0F0F"; // const-string v0, "0F0F0F0F0F0F"
	 /* .line 1 */
	 fr.mbs.binary.Octets .createOctets ( v0 );
	 final String v0 = "11223344556677889900AABBCCDDEEFF"; // const-string v0, "11223344556677889900AABBCCDDEEFF"
	 /* .line 2 */
	 fr.mbs.binary.Octets .createOctets ( v0 );
	 return;
} // .end method
public com.orange.oab.contactless.packid.hce.user.wallet.Badge ( ) {
	 /* .locals 1 */
	 /* .line 17 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* .line 18 */
	 v0 = com.orange.oab.contactless.packid.ContactlessType.NFC;
	 this.r = v0;
	 /* .line 19 */
	 v0 = com.orange.oab.contactless.packid.hce.user.wallet.BadgeStatus.INSTALLED;
	 this.x = v0;
	 /* .line 20 */
	 v0 = com.orange.oab.contactless.packid.domain.ConditionToBeginTransaction.none;
	 this.y = v0;
	 /* .line 21 */
	 v0 = this.e;
	 this.e = v0;
	 /* .line 22 */
	 v0 = this.b;
	 this.b = v0;
	 /* .line 23 */
	 v0 = this.g;
	 this.g = v0;
	 /* .line 24 */
	 v0 = this.i;
	 this.i = v0;
	 /* .line 25 */
	 v0 = this.f;
	 this.f = v0;
	 /* .line 26 */
	 v0 = this.h;
	 this.h = v0;
	 /* .line 27 */
	 v0 = this.c;
	 this.c = v0;
	 /* .line 28 */
	 p1 = this.o;
	 this.o = p1;
	 return;
} // .end method
public com.orange.oab.contactless.packid.hce.user.wallet.Badge ( ) {
	 /* .locals 1 */
	 /* .line 10 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* .line 11 */
	 v0 = com.orange.oab.contactless.packid.ContactlessType.NFC;
	 this.r = v0;
	 /* .line 12 */
	 v0 = com.orange.oab.contactless.packid.hce.user.wallet.BadgeStatus.INSTALLED;
	 this.x = v0;
	 /* .line 13 */
	 v0 = com.orange.oab.contactless.packid.domain.ConditionToBeginTransaction.none;
	 this.y = v0;
	 /* .line 14 */
	 this.e = p1;
	 /* .line 15 */
	 this.b = p2;
	 /* .line 16 */
	 this.g = p3;
	 return;
} // .end method
public com.orange.oab.contactless.packid.hce.user.wallet.Badge ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* .line 2 */
	 v0 = com.orange.oab.contactless.packid.ContactlessType.NFC;
	 this.r = v0;
	 /* .line 3 */
	 v0 = com.orange.oab.contactless.packid.hce.user.wallet.BadgeStatus.INSTALLED;
	 this.x = v0;
	 /* .line 4 */
	 v0 = com.orange.oab.contactless.packid.domain.ConditionToBeginTransaction.none;
	 this.y = v0;
	 /* .line 5 */
	 this.e = p1;
	 /* .line 6 */
	 this.b = p2;
	 /* .line 7 */
	 this.c = p3;
	 /* .line 8 */
	 this.d = p4;
	 /* .line 9 */
	 this.g = p5;
	 return;
} // .end method
public com.orange.oab.contactless.packid.hce.user.wallet.Badge ( ) {
	 /* .locals 1 */
	 /* .line 29 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* .line 30 */
	 v0 = com.orange.oab.contactless.packid.ContactlessType.NFC;
	 this.r = v0;
	 /* .line 31 */
	 v0 = com.orange.oab.contactless.packid.hce.user.wallet.BadgeStatus.INSTALLED;
	 this.x = v0;
	 /* .line 32 */
	 v0 = com.orange.oab.contactless.packid.domain.ConditionToBeginTransaction.none;
	 this.y = v0;
	 /* .line 33 */
	 this.e = p1;
	 /* .line 34 */
	 this.c = p2;
	 /* .line 35 */
	 this.g = p3;
	 return;
} // .end method
public static fr.mbs.binary.Octets a ( android.content.Context p0 ) {
	 /* .locals 1 */
	 /* .line 1 */
	 (( android.content.Context ) p0 ).getContentResolver ( ); // invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;
	 final String v0 = "android_id"; // const-string v0, "android_id"
	 android.provider.Settings$Secure .getString ( p0,v0 );
	 /* .line 2 */
	 com.orange.oab.contactless.packid.hce.user.wallet.Badge .d ( p0 );
	 com.orange.oab.contactless.packid.hce.user.wallet.Badge .b ( p0 );
	 com.orange.oab.contactless.packid.hce.user.wallet.Badge .c ( p0 );
	 com.orange.oab.contactless.packid.hce.user.wallet.Badge .a ( p0 );
} // .end method
public static fr.mbs.binary.Octets a ( Object p0 ) {
	 /* .locals 3 */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Lcom/orange/oab/contactless/packid/g/u/e; */
	 /* } */
} // .end annotation
/* .line 4 */
/* new-instance v0, Le/h/d/a/a/o/b/a; */
/* invoke-direct {v0}, Le/h/d/a/a/o/b/a;-><init>()V */
v1 = com.orange.oab.contactless.packid.hce.user.wallet.Badge.B;
v2 = com.orange.oab.contactless.packid.hce.user.wallet.Wallet.DEFAULT_WALLET_ID;
(( e.h.d.a.a.o.b.a ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Le/h/d/a/a/o/b/a;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
/* .line 5 */
(( e.h.d.a.a.n.w.c ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/h/d/a/a/n/w/c;->a(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
} // .end method
public static fr.mbs.binary.Octets a ( fr.mbs.binary.Octets p0, Object p1 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/orange/oab/contactless/packid/g/u/e; */
/* } */
} // .end annotation
/* .line 6 */
fr.mbs.binary.Octets .createOctets ( p0 );
(( e.h.d.a.a.n.w.c ) p1 ).a ( p0 ); // invoke-virtual {p1, p0}, Le/h/d/a/a/n/w/c;->a(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
} // .end method
public static fr.mbs.binary.Octets a ( java.lang.String p0 ) {
/* .locals 2 */
/* .line 3 */
v0 = (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
/* const/16 v1, 0x14 */
/* if-le v0, v1, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
(( java.lang.String ) p0 ).substring ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;
} // :cond_0
fr.mbs.binary.Octets .createOctets ( p0 );
/* const/16 v0, 0xa */
(( fr.mbs.binary.Octets ) p0 ).cycleTosize ( v0 ); // invoke-virtual {p0, v0}, Lfr/mbs/binary/Octets;->cycleTosize(I)Lfr/mbs/binary/Octets;
} // .end method
public static java.util.Date a ( ) {
/* .locals 3 */
/* .line 7 */
java.util.Calendar .getInstance ( );
/* .line 8 */
/* new-instance v1, Ljava/util/Date; */
/* invoke-direct {v1}, Ljava/util/Date;-><init>()V */
(( java.util.Calendar ) v0 ).setTime ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V
int v1 = 1; // const/4 v1, 0x1
/* const/16 v2, 0xa */
/* .line 9 */
(( java.util.Calendar ) v0 ).add ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/util/Calendar;->add(II)V
/* .line 10 */
(( java.util.Calendar ) v0 ).getTime ( ); // invoke-virtual {v0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;
} // .end method
public static java.lang.String b ( java.lang.String p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
/* if-lez v0, :cond_0 */
} // :cond_0
/* const/16 p0, 0xa */
fr.mbs.binary.Octets .random ( p0 );
(( fr.mbs.binary.Octets ) p0 ).toHexa ( ); // invoke-virtual {p0}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;
} // :goto_0
} // .end method
public static java.lang.String c ( java.lang.String p0 ) {
/* .locals 2 */
/* .line 1 */
v0 = (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
/* rem-int/lit8 v0, v0, 0x2 */
/* if-nez v0, :cond_0 */
} // :cond_0
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v0 ).append ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
int v1 = 0; // const/4 v1, 0x0
p0 = (( java.lang.String ) p0 ).charAt ( v1 ); // invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C
(( java.lang.StringBuilder ) v0 ).append ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // :goto_0
} // .end method
public static java.lang.String d ( java.lang.String p0 ) {
/* .locals 2 */
final String v0 = "[^0123456789abcdefABCDEF]"; // const-string v0, "[^0123456789abcdefABCDEF]"
final String v1 = ""; // const-string v1, ""
/* .line 1 */
(( java.lang.String ) p0 ).replaceAll ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
} // .end method
public static com.orange.oab.contactless.packid.hce.user.wallet.Badge defaultSecuredBadge ( android.content.Context p0, Object p1 ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/orange/oab/contactless/packid/g/u/e; */
/* } */
} // .end annotation
/* .line 1 */
com.orange.oab.contactless.packid.hce.user.wallet.Badge .a ( p0 );
/* .line 2 */
/* new-instance v1, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge; */
v2 = com.orange.oab.contactless.packid.hce.user.wallet.Badge.DEFAULT_SECURED_ZONE_ID;
com.orange.oab.contactless.packid.hce.user.wallet.Badge .a ( v0,p1 );
(( android.content.Context ) p0 ).getString ( v4 ); // invoke-virtual {p0, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;
/* invoke-direct {v1, v2, v3, p0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;-><init>(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;)V */
/* .line 3 */
com.orange.oab.contactless.packid.hce.user.wallet.Badge .a ( );
this.m = p0;
/* .line 4 */
(( fr.mbs.binary.Octets ) v0 ).toHexa ( ); // invoke-virtual {v0}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;
this.c = p0;
/* .line 5 */
com.orange.oab.contactless.packid.hce.user.wallet.Badge .a ( p1 );
this.d = p0;
/* const/16 p0, -0x2d */
/* .line 6 */
/* iput-byte p0, v1, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->k:B */
int p0 = 2; // const/4 p0, 0x2
/* .line 7 */
java.lang.Integer .valueOf ( p0 );
this.q = p0;
/* const/16 p0, 0xa */
/* .line 8 */
java.lang.Integer .valueOf ( p0 );
this.p = p0;
/* const/16 p0, -0x14 */
/* .line 9 */
/* iput-byte p0, v1, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->l:B */
int p0 = 1; // const/4 p0, 0x1
/* .line 10 */
/* iput-boolean p0, v1, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->z:Z */
/* .line 11 */
p0 = com.orange.oab.contactless.packid.ContactlessType.NFC_AND_BLE;
this.r = p0;
} // .end method
public static java.lang.String mask ( fr.mbs.binary.Octets p0 ) {
/* .locals 3 */
/* .line 1 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
int v1 = 2; // const/4 v1, 0x2
int v2 = 0; // const/4 v2, 0x0
(( fr.mbs.binary.Octets ) p0 ).get ( v2, v1 ); // invoke-virtual {p0, v2, v1}, Lfr/mbs/binary/Octets;->get(II)Lfr/mbs/binary/Octets;
(( fr.mbs.binary.Octets ) v2 ).toHexa ( ); // invoke-virtual {v2}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = "XXXXXXXXXXXX"; // const-string v2, "XXXXXXXXXXXX"
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = (( fr.mbs.binary.Octets ) p0 ).size ( ); // invoke-virtual {p0}, Lfr/mbs/binary/Octets;->size()I
/* sub-int/2addr v2, v1 */
(( fr.mbs.binary.Octets ) p0 ).get ( v2, v1 ); // invoke-virtual {p0, v2, v1}, Lfr/mbs/binary/Octets;->get(II)Lfr/mbs/binary/Octets;
(( fr.mbs.binary.Octets ) p0 ).toHexa ( ); // invoke-virtual {p0}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
/* # virtual methods */
public Boolean equals ( java.lang.Object p0 ) {
/* .locals 4 */
int v0 = 1; // const/4 v0, 0x1
/* if-ne p0, p1, :cond_0 */
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
if ( p1 != null) { // if-eqz p1, :cond_b
/* .line 1 */
(( java.lang.Object ) p1 ).getClass ( ); // invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
/* const-class v3, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge; */
/* if-eq v3, v2, :cond_1 */
/* .line 2 */
} // :cond_1
/* check-cast p1, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge; */
/* .line 3 */
v2 = this.b;
if ( v2 != null) { // if-eqz v2, :cond_2
v3 = this.b;
v2 = (( fr.mbs.binary.Octets ) v2 ).equals ( v3 ); // invoke-virtual {v2, v3}, Lfr/mbs/binary/Octets;->equals(Ljava/lang/Object;)Z
/* if-nez v2, :cond_3 */
} // :cond_2
v2 = this.b;
if ( v2 != null) { // if-eqz v2, :cond_3
} // :goto_0
/* .line 4 */
} // :cond_3
v2 = this.g;
if ( v2 != null) { // if-eqz v2, :cond_4
v3 = this.g;
v2 = (( java.lang.String ) v2 ).equals ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v2, :cond_5 */
} // :cond_4
v2 = this.g;
if ( v2 != null) { // if-eqz v2, :cond_5
} // :goto_1
/* .line 5 */
} // :cond_5
v2 = this.d;
if ( v2 != null) { // if-eqz v2, :cond_6
v3 = this.d;
v2 = (( fr.mbs.binary.Octets ) v2 ).equals ( v3 ); // invoke-virtual {v2, v3}, Lfr/mbs/binary/Octets;->equals(Ljava/lang/Object;)Z
/* if-nez v2, :cond_7 */
} // :cond_6
v2 = this.d;
if ( v2 != null) { // if-eqz v2, :cond_7
} // :goto_2
/* .line 6 */
} // :cond_7
/* iget-boolean v2, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->s:Z */
/* iget-boolean v3, p1, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->s:Z */
/* if-eq v2, v3, :cond_8 */
/* .line 7 */
} // :cond_8
v2 = this.e;
p1 = this.e;
if ( v2 != null) { // if-eqz v2, :cond_9
v0 = (( fr.mbs.binary.Octets ) v2 ).equals ( p1 ); // invoke-virtual {v2, p1}, Lfr/mbs/binary/Octets;->equals(Ljava/lang/Object;)Z
} // :cond_9
/* if-nez p1, :cond_a */
} // :cond_a
int v0 = 0; // const/4 v0, 0x0
} // :goto_3
} // :cond_b
} // :goto_4
} // .end method
public java.lang.Integer getBleSessionTimeout ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.p;
} // .end method
public fr.mbs.binary.Octets getCipheredId ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
} // .end method
public fr.mbs.binary.Octets getCipheredTokenDataSignature ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.h;
} // .end method
public fr.mbs.binary.Octets getCipheredUrl ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.i;
} // .end method
public fr.mbs.binary.Octets getCipheredWalletKey ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.d;
} // .end method
public com.orange.oab.contactless.packid.domain.ConditionToBeginTransaction getConditionToBeginTransaction ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.y;
} // .end method
public com.orange.oab.contactless.packid.ContactlessType getContactLessType ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.r;
} // .end method
public e.h.d.a.a.l getContactlessTypeInformation ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.A;
} // .end method
public com.orange.oab.contactless.packid.ContactlessType getContactlessTypePersonalisedDown ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.A;
if ( v0 != null) { // if-eqz v0, :cond_0
(( e.h.d.a.a.l ) v0 ).a ( ); // invoke-virtual {v0}, Le/h/d/a/a/l;->a()Lcom/orange/oab/contactless/packid/ContactlessType;
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public com.orange.oab.contactless.packid.ContactlessType getContactlessTypePersonalisedUp ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.A;
if ( v0 != null) { // if-eqz v0, :cond_0
(( e.h.d.a.a.l ) v0 ).b ( ); // invoke-virtual {v0}, Le/h/d/a/a/l;->b()Lcom/orange/oab/contactless/packid/ContactlessType;
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public java.lang.Integer getContactlessTypePersonalisedVersion ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.A;
if ( v0 != null) { // if-eqz v0, :cond_0
(( e.h.d.a.a.l ) v0 ).c ( ); // invoke-virtual {v0}, Le/h/d/a/a/l;->c()Ljava/lang/Integer;
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public java.lang.Integer getDelayAfterBadgeOk ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.q;
} // .end method
public java.lang.Integer getDelayAfterBadgeOkMs ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.q;
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
} // :cond_0
v0 = (( java.lang.Integer ) v0 ).intValue ( ); // invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
/* mul-int/lit16 v0, v0, 0x3e8 */
} // :goto_0
java.lang.Integer .valueOf ( v0 );
} // .end method
public java.lang.String getDescription ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.g;
} // .end method
public Integer getGattConnectionTimeoutMs ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.p;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
v0 = (( java.lang.Integer ) v0 ).intValue ( ); // invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
/* mul-int/lit16 v0, v0, 0x3e8 */
/* .line 3 */
} // :cond_0
v0 = (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p0 ).isToken ( ); // invoke-virtual {p0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->isToken()Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* const/16 v0, 0x1e */
} // :cond_1
/* const/16 v0, 0xa */
} // :goto_0
/* mul-int/lit16 v0, v0, 0x3e8 */
} // .end method
public java.lang.String getLogoFile ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.j;
} // .end method
public java.lang.String getMaskedId ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.c;
} // .end method
public java.util.Date getRegenerationDate ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.m;
} // .end method
public Object getRssi ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-byte v0, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->k:B */
} // .end method
public Object getRssiButtonInterval ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-byte v0, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->l:B */
} // .end method
public java.lang.Integer getRssiDurationForButtonComputation ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.v;
} // .end method
public com.orange.oab.contactless.packid.hce.user.wallet.BadgeStatus getStatus ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.x;
} // .end method
public com.orange.oab.contactless.packid.hce.user.TokenData getTokenData ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.f;
} // .end method
public fr.mbs.binary.Octets getUnlockableByZoneID ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.t;
} // .end method
public java.lang.Integer getUnlockedDuration ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.u;
} // .end method
public java.lang.String getUserId ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.o;
} // .end method
public fr.mbs.binary.Octets getZoneId ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.e;
} // .end method
public Integer hashCode ( ) {
/* .locals 3 */
/* .line 1 */
v0 = this.b;
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = (( fr.mbs.binary.Octets ) v0 ).hashCode ( ); // invoke-virtual {v0}, Lfr/mbs/binary/Octets;->hashCode()I
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
/* mul-int/lit8 v0, v0, 0x1f */
/* .line 2 */
v2 = this.d;
if ( v2 != null) { // if-eqz v2, :cond_1
v2 = (( fr.mbs.binary.Octets ) v2 ).hashCode ( ); // invoke-virtual {v2}, Lfr/mbs/binary/Octets;->hashCode()I
} // :cond_1
int v2 = 0; // const/4 v2, 0x0
} // :goto_1
/* add-int/2addr v0, v2 */
/* mul-int/lit8 v0, v0, 0x1f */
/* .line 3 */
v2 = this.e;
if ( v2 != null) { // if-eqz v2, :cond_2
v2 = (( fr.mbs.binary.Octets ) v2 ).hashCode ( ); // invoke-virtual {v2}, Lfr/mbs/binary/Octets;->hashCode()I
} // :cond_2
int v2 = 0; // const/4 v2, 0x0
} // :goto_2
/* add-int/2addr v0, v2 */
/* mul-int/lit8 v0, v0, 0x1f */
/* .line 4 */
v2 = this.g;
if ( v2 != null) { // if-eqz v2, :cond_3
v1 = (( java.lang.String ) v2 ).hashCode ( ); // invoke-virtual {v2}, Ljava/lang/String;->hashCode()I
} // :cond_3
/* add-int/2addr v0, v1 */
} // .end method
public Boolean isActive ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.f;
if ( v0 != null) { // if-eqz v0, :cond_1
(( com.orange.oab.contactless.packid.hce.user.TokenData ) v0 ).getExpirationDate ( ); // invoke-virtual {v0}, Lcom/orange/oab/contactless/packid/hce/user/TokenData;->getExpirationDate()Ljava/util/Date;
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.f;
(( com.orange.oab.contactless.packid.hce.user.TokenData ) v0 ).getExpirationDate ( ); // invoke-virtual {v0}, Lcom/orange/oab/contactless/packid/hce/user/TokenData;->getExpirationDate()Ljava/util/Date;
/* new-instance v1, Ljava/util/Date; */
/* invoke-direct {v1}, Ljava/util/Date;-><init>()V */
v0 = (( java.util.Date ) v0 ).after ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/Date;->after(Ljava/util/Date;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.f;
v0 = (( com.orange.oab.contactless.packid.hce.user.TokenData ) v0 ).getSequenceNumber ( ); // invoke-virtual {v0}, Lcom/orange/oab/contactless/packid/hce/user/TokenData;->getSequenceNumber()I
/* if-lez v0, :cond_0 */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :cond_1
} // :goto_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_1
} // .end method
public Boolean isBle ( ) {
/* .locals 1 */
/* .line 1 */
v0 = (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p0 ).isNfcOnly ( ); // invoke-virtual {p0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->isNfcOnly()Z
/* xor-int/lit8 v0, v0, 0x1 */
} // .end method
public Boolean isConditionToBeginTransactionReached ( android.content.Context p0 ) {
/* .locals 2 */
/* .line 1 */
v0 = com.orange.oab.contactless.packid.domain.ConditionToBeginTransaction.unlockPhoneRequired;
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p0 ).getConditionToBeginTransaction ( ); // invoke-virtual {p0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getConditionToBeginTransaction()Lcom/orange/oab/contactless/packid/domain/ConditionToBeginTransaction;
v0 = (( java.lang.Enum ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
p1 = e.h.d.a.a.n.s .c ( p1 );
/* if-nez p1, :cond_1 */
} // :cond_0
p1 = com.orange.oab.contactless.packid.domain.ConditionToBeginTransaction.none;
/* .line 2 */
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p0 ).getConditionToBeginTransaction ( ); // invoke-virtual {p0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getConditionToBeginTransaction()Lcom/orange/oab/contactless/packid/domain/ConditionToBeginTransaction;
p1 = (( java.lang.Enum ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z
if ( p1 != null) { // if-eqz p1, :cond_2
} // :cond_1
int p1 = 1; // const/4 p1, 0x1
} // :cond_2
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
public Boolean isDefault ( android.content.Context p0 ) {
/* .locals 2 */
/* .line 1 */
v0 = com.orange.oab.contactless.packid.hce.user.wallet.Badge.DEFAULT_SECURED_ZONE_ID;
v1 = this.e;
v0 = (( fr.mbs.binary.Octets ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Lfr/mbs/binary/Octets;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
e.h.d.a.a.s.m .c ( p1 );
v0 = this.o;
(( e.h.d.a.a.s.g0 ) p1 ).b ( v0 ); // invoke-virtual {p1, v0}, Le/h/d/a/a/s/g0;->b(Ljava/lang/String;)Lcom/orange/oab/contactless/packid/hce/user/User;
p1 = (( com.orange.oab.contactless.packid.hce.user.User ) p1 ).isDefault ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/User;->isDefault()Z
if ( p1 != null) { // if-eqz p1, :cond_0
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
public Boolean isLockable ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->s:Z */
} // .end method
public Boolean isLocked ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->w:Z */
} // .end method
public Boolean isManualConnectionAllowed ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->z:Z */
} // .end method
public Boolean isNfcOnly ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.r;
v1 = com.orange.oab.contactless.packid.ContactlessType.NFC;
/* if-ne v0, v1, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public Boolean isSecured ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.d;
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public Boolean isToken ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.i;
/* if-nez v0, :cond_1 */
v0 = this.f;
if ( v0 != null) { // if-eqz v0, :cond_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :cond_1
} // :goto_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_1
} // .end method
public Boolean isTransactionAllowed ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->n:Z */
} // .end method
public void setBleSessionTimeout ( java.lang.Integer p0 ) {
/* .locals 0 */
/* .line 1 */
this.p = p1;
return;
} // .end method
public void setCipheredTokenDataSignature ( fr.mbs.binary.Octets p0 ) {
/* .locals 0 */
/* .line 1 */
this.h = p1;
return;
} // .end method
public void setCipheredUrl ( fr.mbs.binary.Octets p0 ) {
/* .locals 0 */
/* .line 1 */
this.i = p1;
return;
} // .end method
public void setConditionToBeginTransaction ( com.orange.oab.contactless.packid.domain.ConditionToBeginTransaction p0 ) {
/* .locals 0 */
/* .line 1 */
this.y = p1;
return;
} // .end method
public void setContactlessType ( com.orange.oab.contactless.packid.ContactlessType p0 ) {
/* .locals 0 */
/* .line 1 */
this.r = p1;
return;
} // .end method
public void setContactlessTypeInformation ( Object p0 ) {
/* .locals 0 */
/* .line 1 */
this.A = p1;
return;
} // .end method
public void setDelayAfterBadgeOk ( java.lang.Integer p0 ) {
/* .locals 0 */
/* .line 1 */
this.q = p1;
return;
} // .end method
public void setDescription ( java.lang.String p0 ) {
/* .locals 0 */
/* .line 1 */
this.g = p1;
return;
} // .end method
public void setLockable ( Boolean p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput-boolean p1, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->s:Z */
return;
} // .end method
public void setLocked ( Boolean p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput-boolean p1, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->w:Z */
return;
} // .end method
public void setLogoFile ( java.lang.String p0 ) {
/* .locals 0 */
/* .line 1 */
this.j = p1;
return;
} // .end method
public void setManualConnectionAllowed ( Boolean p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput-boolean p1, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->z:Z */
return;
} // .end method
public void setRegenerationDate ( java.util.Date p0 ) {
/* .locals 0 */
/* .line 1 */
this.m = p1;
return;
} // .end method
public void setRssi ( Object p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput-byte p1, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->k:B */
return;
} // .end method
public void setRssiButtonInterval ( Object p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput-byte p1, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->l:B */
return;
} // .end method
public void setRssiDurationForButtonComputation ( java.lang.Integer p0 ) {
/* .locals 0 */
/* .line 1 */
this.v = p1;
return;
} // .end method
public void setStatus ( com.orange.oab.contactless.packid.hce.user.wallet.BadgeStatus p0 ) {
/* .locals 0 */
/* .line 1 */
this.x = p1;
return;
} // .end method
public void setTokenData ( com.orange.oab.contactless.packid.hce.user.TokenData p0 ) {
/* .locals 0 */
/* .line 1 */
this.f = p1;
return;
} // .end method
public void setTransactionAllowed ( Boolean p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput-boolean p1, p0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->n:Z */
return;
} // .end method
public void setUnlockableByZoneID ( fr.mbs.binary.Octets p0 ) {
/* .locals 0 */
/* .line 1 */
this.t = p1;
return;
} // .end method
public void setUnlockedDuration ( java.lang.Integer p0 ) {
/* .locals 0 */
/* .line 1 */
this.u = p1;
return;
} // .end method
public void setUserId ( java.lang.String p0 ) {
/* .locals 0 */
/* .line 1 */
this.o = p1;
return;
} // .end method
public java.lang.String toString ( ) {
/* .locals 3 */
/* .line 1 */
e.f.b.a.j .a ( p0 );
v1 = this.e;
final String v2 = "accessId"; // const-string v2, "accessId"
/* .line 2 */
(( e.f.b.a.j$a ) v0 ).a ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Le/f/b/a/j$a;->a(Ljava/lang/String;Ljava/lang/Object;)Le/f/b/a/j$a;
v1 = this.b;
final String v2 = "cipheredId"; // const-string v2, "cipheredId"
/* .line 3 */
(( e.f.b.a.j$a ) v0 ).a ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Le/f/b/a/j$a;->a(Ljava/lang/String;Ljava/lang/Object;)Le/f/b/a/j$a;
/* .line 4 */
v1 = (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p0 ).isSecured ( ); // invoke-virtual {p0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->isSecured()Z
final String v2 = "isSecured"; // const-string v2, "isSecured"
(( e.f.b.a.j$a ) v0 ).a ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Le/f/b/a/j$a;->a(Ljava/lang/String;Z)Le/f/b/a/j$a;
v1 = this.f;
final String v2 = "tokenData"; // const-string v2, "tokenData"
/* .line 5 */
(( e.f.b.a.j$a ) v0 ).a ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Le/f/b/a/j$a;->a(Ljava/lang/String;Ljava/lang/Object;)Le/f/b/a/j$a;
v1 = this.g;
final String v2 = "description"; // const-string v2, "description"
/* .line 6 */
(( e.f.b.a.j$a ) v0 ).a ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Le/f/b/a/j$a;->a(Ljava/lang/String;Ljava/lang/Object;)Le/f/b/a/j$a;
v1 = this.m;
final String v2 = "regenerationDate"; // const-string v2, "regenerationDate"
/* .line 7 */
(( e.f.b.a.j$a ) v0 ).a ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Le/f/b/a/j$a;->a(Ljava/lang/String;Ljava/lang/Object;)Le/f/b/a/j$a;
/* .line 8 */
(( e.f.b.a.j$a ) v0 ).toString ( ); // invoke-virtual {v0}, Le/f/b/a/j$a;->toString()Ljava/lang/String;
} // .end method
public void updateToken ( com.orange.oab.contactless.packid.hce.user.wallet.Badge$a p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p0 ).setTokenData ( v0 ); // invoke-virtual {p0, v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setTokenData(Lcom/orange/oab/contactless/packid/hce/user/TokenData;)V
/* .line 2 */
v0 = this.b;
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p0 ).setCipheredTokenDataSignature ( v0 ); // invoke-virtual {p0, v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setCipheredTokenDataSignature(Lfr/mbs/binary/Octets;)V
/* .line 3 */
v0 = this.d;
if ( v0 != null) { // if-eqz v0, :cond_0
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p0 ).setRegenerationDate ( v0 ); // invoke-virtual {p0, v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setRegenerationDate(Ljava/util/Date;)V
/* .line 4 */
} // :cond_0
p1 = this.c;
if ( p1 != null) { // if-eqz p1, :cond_1
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p0 ).setCipheredUrl ( p1 ); // invoke-virtual {p0, p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setCipheredUrl(Lfr/mbs/binary/Octets;)V
} // :cond_1
return;
} // .end method
