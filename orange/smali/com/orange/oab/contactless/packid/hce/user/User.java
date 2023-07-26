public class com.orange.oab.contactless.packid.hce.user.User {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final Integer CONTACTLESS_ID_LENGTH;
	 public static final java.lang.String DEFAULT_CONTACTLESS_ID;
	 public static final java.lang.String DEFAULT_USER_EMAIL;
	 public static final java.lang.String DEFAULT_USER_FIRSTNAME;
	 public static final java.lang.String DEFAULT_USER_LASTNAME;
	 /* # instance fields */
	 public java.lang.String a;
	 public java.lang.String b;
	 public java.lang.String c;
	 public com.orange.oab.contactless.packid.hce.user.wallet.Wallet d;
	 public java.util.Set e;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/Set<", */
	 /* "Ljava/lang/String;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
public fr.mbs.binary.Octets f;
public fr.mbs.binary.Octets g;
public java.lang.String h;
public Boolean i;
public com.orange.oab.contactless.packid.hce.user.wallet.Tenant j;
public Boolean k;
public Boolean l;
public Boolean m;
/* # direct methods */
public com.orange.oab.contactless.packid.hce.user.User ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
/* new-instance v0, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet; */
/* invoke-direct {v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;-><init>()V */
this.d = v0;
return;
} // .end method
public static com.orange.oab.contactless.packid.hce.user.User defaultUser ( android.content.Context p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/orange/oab/contactless/packid/g/u/e; */
/* } */
} // .end annotation
/* .line 1 */
/* new-instance v0, Lcom/orange/oab/contactless/packid/hce/user/User; */
/* invoke-direct {v0}, Lcom/orange/oab/contactless/packid/hce/user/User;-><init>()V */
/* .line 2 */
e.h.d.a.a.n.w.c .c ( p0 );
/* .line 3 */
com.orange.oab.contactless.packid.hce.user.wallet.Wallet .defaultWallet ( p0,v1 );
this.d = v1;
final String v1 = "User"; // const-string v1, "User"
/* .line 4 */
this.a = v1;
final String v1 = "Default"; // const-string v1, "Default"
/* .line 5 */
this.b = v1;
final String v1 = "user@default.fr"; // const-string v1, "user@default.fr"
/* .line 6 */
this.c = v1;
final String v1 = "00000001"; // const-string v1, "00000001"
/* .line 7 */
fr.mbs.binary.Octets .createOctets ( v1 );
this.f = v1;
/* .line 8 */
com.orange.oab.contactless.packid.hce.user.wallet.Tenant .defaultTenant ( p0 );
this.j = p0;
int p0 = 1; // const/4 p0, 0x1
/* .line 9 */
/* iput-boolean p0, v0, Lcom/orange/oab/contactless/packid/hce/user/User;->k:Z */
int p0 = 0; // const/4 p0, 0x0
/* .line 10 */
/* iput-boolean p0, v0, Lcom/orange/oab/contactless/packid/hce/user/User;->l:Z */
} // .end method
/* # virtual methods */
public final android.net.Uri a ( android.content.Context p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/orange/oab/contactless/packid/g/u/e; */
/* } */
} // .end annotation
/* .line 1 */
/* new-instance v0, Ljava/lang/String; */
e.h.d.a.a.n.w.c .b ( p1 );
(( com.orange.oab.contactless.packid.hce.user.User ) p0 ).getCipheredUri ( ); // invoke-virtual {p0}, Lcom/orange/oab/contactless/packid/hce/user/User;->getCipheredUri()Lfr/mbs/binary/Octets;
(( fr.mbs.binary.Octets ) v1 ).toBytes ( ); // invoke-virtual {v1}, Lfr/mbs/binary/Octets;->toBytes()[B
(( e.h.d.a.a.n.w.c ) p1 ).b ( v1 ); // invoke-virtual {p1, v1}, Le/h/d/a/a/n/w/c;->b([B)[B
v1 = java.nio.charset.StandardCharsets.UTF_8;
/* invoke-direct {v0, p1, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V */
android.net.Uri .parse ( v0 );
} // .end method
public Boolean equals ( java.lang.Object p0 ) {
/* .locals 4 */
int v0 = 1; // const/4 v0, 0x1
/* if-ne p0, p1, :cond_0 */
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
if ( p1 != null) { // if-eqz p1, :cond_4
/* .line 1 */
(( java.lang.Object ) p1 ).getClass ( ); // invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
/* const-class v3, Lcom/orange/oab/contactless/packid/hce/user/User; */
/* if-eq v3, v2, :cond_1 */
/* .line 2 */
} // :cond_1
/* check-cast p1, Lcom/orange/oab/contactless/packid/hce/user/User; */
/* .line 3 */
v2 = this.g;
p1 = this.g;
if ( v2 != null) { // if-eqz v2, :cond_2
v0 = (( fr.mbs.binary.Octets ) v2 ).equals ( p1 ); // invoke-virtual {v2, p1}, Lfr/mbs/binary/Octets;->equals(Ljava/lang/Object;)Z
} // :cond_2
/* if-nez p1, :cond_3 */
} // :cond_3
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // :cond_4
} // :goto_1
} // .end method
public java.util.Set getApplicationIds ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/Set<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.e;
} // .end method
public fr.mbs.binary.Octets getCipheredUri ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.g;
} // .end method
public fr.mbs.binary.Octets getContactlessId ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.f;
} // .end method
public java.lang.String getEmail ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.c;
} // .end method
public java.lang.String getFirstname ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
} // .end method
public java.lang.String getId ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.h;
} // .end method
public java.lang.String getLastname ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
} // .end method
public com.orange.oab.contactless.packid.hce.user.wallet.Tenant getTenant ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.j;
} // .end method
public android.net.Uri getUri ( android.content.Context p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/orange/oab/contactless/packid/g/u/e; */
/* } */
} // .end annotation
/* .line 1 */
(( com.orange.oab.contactless.packid.hce.user.User ) p0 ).getCipheredUri ( ); // invoke-virtual {p0}, Lcom/orange/oab/contactless/packid/hce/user/User;->getCipheredUri()Lfr/mbs/binary/Octets;
/* if-nez v0, :cond_0 */
int p1 = 0; // const/4 p1, 0x0
} // :cond_0
(( com.orange.oab.contactless.packid.hce.user.User ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lcom/orange/oab/contactless/packid/hce/user/User;->a(Landroid/content/Context;)Landroid/net/Uri;
} // :goto_0
} // .end method
public com.orange.oab.contactless.packid.hce.user.wallet.Wallet getWallet ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.d;
} // .end method
public Integer hashCode ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.g;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = (( fr.mbs.binary.Octets ) v0 ).hashCode ( ); // invoke-virtual {v0}, Lfr/mbs/binary/Octets;->hashCode()I
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public Boolean isDefault ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.g;
/* if-nez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public Boolean isFirebaseEnable ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Lcom/orange/oab/contactless/packid/hce/user/User;->k:Z */
} // .end method
public Boolean isPremium ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Lcom/orange/oab/contactless/packid/hce/user/User;->l:Z */
} // .end method
public Boolean isSendEnrolmentNotification ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Lcom/orange/oab/contactless/packid/hce/user/User;->m:Z */
} // .end method
public Boolean isSimCentric ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Lcom/orange/oab/contactless/packid/hce/user/User;->i:Z */
} // .end method
public void setApplicationIds ( java.util.Set p0 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/Set<", */
/* "Ljava/lang/String;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .line 1 */
this.e = p1;
return;
} // .end method
public void setCipheredUri ( fr.mbs.binary.Octets p0 ) {
/* .locals 0 */
/* .line 1 */
this.g = p1;
return;
} // .end method
public void setContactlessId ( fr.mbs.binary.Octets p0 ) {
/* .locals 0 */
/* .line 1 */
this.f = p1;
return;
} // .end method
public void setEmail ( java.lang.String p0 ) {
/* .locals 0 */
/* .line 1 */
this.c = p1;
return;
} // .end method
public void setFirebaseEnable ( Boolean p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput-boolean p1, p0, Lcom/orange/oab/contactless/packid/hce/user/User;->k:Z */
return;
} // .end method
public void setFirstname ( java.lang.String p0 ) {
/* .locals 0 */
/* .line 1 */
this.a = p1;
return;
} // .end method
public void setId ( java.lang.String p0 ) {
/* .locals 0 */
/* .line 1 */
this.h = p1;
return;
} // .end method
public void setLastname ( java.lang.String p0 ) {
/* .locals 0 */
/* .line 1 */
this.b = p1;
return;
} // .end method
public void setPremium ( Boolean p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput-boolean p1, p0, Lcom/orange/oab/contactless/packid/hce/user/User;->l:Z */
return;
} // .end method
public void setSendEnrolmentNotification ( Boolean p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput-boolean p1, p0, Lcom/orange/oab/contactless/packid/hce/user/User;->m:Z */
return;
} // .end method
public void setSimCentric ( Boolean p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput-boolean p1, p0, Lcom/orange/oab/contactless/packid/hce/user/User;->i:Z */
return;
} // .end method
public void setTenant ( com.orange.oab.contactless.packid.hce.user.wallet.Tenant p0 ) {
/* .locals 0 */
/* .line 1 */
this.j = p1;
return;
} // .end method
public void setUri ( android.net.Uri p0, android.content.Context p1 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/orange/oab/contactless/packid/g/u/e; */
/* } */
} // .end annotation
/* .line 1 */
e.h.d.a.a.n.w.c .b ( p2 );
(( android.net.Uri ) p1 ).toString ( ); // invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;
v0 = java.nio.charset.StandardCharsets.UTF_8;
(( java.lang.String ) p1 ).getBytes ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B
(( e.h.d.a.a.n.w.c ) p2 ).a ( p1 ); // invoke-virtual {p2, p1}, Le/h/d/a/a/n/w/c;->a([B)[B
fr.mbs.binary.Octets .createOctets ( p1 );
(( com.orange.oab.contactless.packid.hce.user.User ) p0 ).setCipheredUri ( p1 ); // invoke-virtual {p0, p1}, Lcom/orange/oab/contactless/packid/hce/user/User;->setCipheredUri(Lfr/mbs/binary/Octets;)V
return;
} // .end method
public void setWallet ( com.orange.oab.contactless.packid.hce.user.wallet.Wallet p0 ) {
/* .locals 0 */
/* .line 1 */
this.d = p1;
return;
} // .end method
