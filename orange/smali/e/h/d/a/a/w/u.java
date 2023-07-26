public class e.h.d.a.a.w.u {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public android.content.Context a;
	 public java.util.Map b;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/Map<", */
	 /* "Ljava/lang/String;", */
	 /* "Le/h/d/a/a/w/t;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
/* # direct methods */
public e.h.d.a.a.w.u ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
this.b = v0;
/* .line 3 */
this.a = p1;
return;
} // .end method
/* # virtual methods */
public com.orange.oab.contactless.packid.hce.user.User a ( fr.mbs.binary.Octets p0, fr.mbs.binary.Octets p1 ) {
/* .locals 1 */
/* .line 2 */
(( e.h.d.a.a.w.u ) p0 ).b ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/h/d/a/a/w/u;->b(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)Le/h/d/a/a/w/t;
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 3 */
	 p1 = this.a;
	 /* .line 4 */
} // :cond_0
v0 = this.a;
e.h.d.a.a.s.m .c ( v0 );
(( e.h.d.a.a.s.g0 ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Le/h/d/a/a/s/g0;->a(Lfr/mbs/binary/Octets;)Lcom/orange/oab/contactless/packid/hce/user/User;
/* .line 5 */
(( e.h.d.a.a.w.u ) p0 ).a ( p1, p2, v0 ); // invoke-virtual {p0, p1, p2, v0}, Le/h/d/a/a/w/u;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Lcom/orange/oab/contactless/packid/hce/user/User;)V
/* if-nez v0, :cond_1 */
final String p1 = "packid.RssiCache"; // const-string p1, "packid.RssiCache"
final String p2 = "No user matching contactless id"; // const-string p2, "No user matching contactless id"
/* .line 6 */
android.util.Log .v ( p1,p2 );
} // :cond_1
} // .end method
public void a ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
return;
} // .end method
public final void a ( fr.mbs.binary.Octets p0, fr.mbs.binary.Octets p1, com.orange.oab.contactless.packid.hce.user.User p2 ) {
/* .locals 2 */
/* .line 7 */
/* new-instance v0, Le/h/d/a/a/w/t; */
int v1 = 0; // const/4 v1, 0x0
/* invoke-direct {v0, v1}, Le/h/d/a/a/w/t;-><init>(Le/h/d/a/a/w/s;)V */
/* .line 8 */
this.a = p3;
/* .line 9 */
p3 = this.b;
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
(( fr.mbs.binary.Octets ) p1 ).toHexa ( ); // invoke-virtual {p1}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( fr.mbs.binary.Octets ) p2 ).toHexa ( ); // invoke-virtual {p2}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
return;
} // .end method
public final e.h.d.a.a.w.t b ( fr.mbs.binary.Octets p0, fr.mbs.binary.Octets p1 ) {
/* .locals 2 */
/* .line 4 */
v0 = this.b;
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
(( fr.mbs.binary.Octets ) p1 ).toHexa ( ); // invoke-virtual {p1}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( fr.mbs.binary.Octets ) p2 ).toHexa ( ); // invoke-virtual {p2}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* check-cast p1, Le/h/d/a/a/w/t; */
} // .end method
public void b ( ) {
/* .locals 5 */
/* .line 1 */
v0 = this.a;
e.h.d.a.a.s.m .c ( v0 );
(( e.h.d.a.a.s.g0 ) v0 ).a ( ); // invoke-virtual {v0}, Le/h/d/a/a/s/g0;->a()Ljava/util/List;
v1 = } // :cond_0
if ( v1 != null) { // if-eqz v1, :cond_1
/* check-cast v1, Lcom/orange/oab/contactless/packid/hce/user/User; */
/* .line 2 */
(( com.orange.oab.contactless.packid.hce.user.User ) v1 ).getWallet ( ); // invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->getWallet()Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;
(( com.orange.oab.contactless.packid.hce.user.wallet.Wallet ) v2 ).getBadges ( ); // invoke-virtual {v2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;->getBadges()Ljava/util/List;
v3 = } // :goto_0
if ( v3 != null) { // if-eqz v3, :cond_0
/* check-cast v3, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge; */
/* .line 3 */
(( com.orange.oab.contactless.packid.hce.user.User ) v1 ).getContactlessId ( ); // invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->getContactlessId()Lfr/mbs/binary/Octets;
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v3 ).getZoneId ( ); // invoke-virtual {v3}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getZoneId()Lfr/mbs/binary/Octets;
(( e.h.d.a.a.w.u ) p0 ).a ( v4, v3, v1 ); // invoke-virtual {p0, v4, v3, v1}, Le/h/d/a/a/w/u;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Lcom/orange/oab/contactless/packid/hce/user/User;)V
} // :cond_1
return;
} // .end method
