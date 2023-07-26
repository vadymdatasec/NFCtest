public class e.h.d.a.a.o.a.o implements e.h.d.a.a.o.a.b {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final com.orange.oab.contactless.packid.hce.user.wallet.Wallet i;
	 public final e.h.d.a.a.n.w.c j;
	 public final fr.mbs.binary.Octets k;
	 public final fr.mbs.binary.Octets l;
	 /* # direct methods */
	 public e.h.d.a.a.o.a.o ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.i = p1;
		 /* .line 3 */
		 this.j = p2;
		 /* .line 4 */
		 this.k = p3;
		 /* .line 5 */
		 this.l = p4;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final Integer a ( Object p0 ) {
		 /* .locals 3 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Lcom/orange/oab/contactless/packid/h/a/a; */
		 /* } */
	 } // .end annotation
	 /* .line 30 */
	 (( e.h.c.a.a ) p1 ).g ( ); // invoke-virtual {p1}, Le/h/c/a/a;->g()Lg/a/a/a;
	 v0 = 	 (( fr.mbs.binary.Octets ) v0 ).toInt ( ); // invoke-virtual {v0}, Lfr/mbs/binary/Octets;->toInt()I
	 /* .line 31 */
	 (( e.h.c.a.a ) p1 ).b ( ); // invoke-virtual {p1}, Le/h/c/a/a;->b()Lfr/mbs/binary/Octets;
	 v1 = 	 (( fr.mbs.binary.Octets ) v1 ).size ( ); // invoke-virtual {v1}, Lfr/mbs/binary/Octets;->size()I
	 /* if-ne v0, v1, :cond_1 */
	 /* const/16 v1, 0x26 */
	 /* if-eq v0, v1, :cond_0 */
	 int v1 = 6; // const/4 v1, 0x6
	 /* if-ne v0, v1, :cond_1 */
} // :cond_0
/* .line 32 */
} // :cond_1
/* new-instance v0, Lcom/orange/oab/contactless/packid/h/a/a; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Inconsistent Lc on read token APDU "; // const-string v2, "Inconsistent Lc on read token APDU "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
v1 = e.h.d.a.a.o.a.b.g;
/* invoke-direct {v0, p1, v1}, Lcom/orange/oab/contactless/packid/h/a/a;-><init>(Ljava/lang/String;Lfr/mbs/binary/Octets;)V */
/* throw v0 */
} // .end method
public final com.orange.oab.contactless.packid.hce.user.wallet.Badge a ( Object p0, fr.mbs.binary.Octets p1 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/orange/oab/contactless/packid/h/a/a; */
/* } */
} // .end annotation
/* .line 18 */
(( e.h.d.a.a.o.a.o ) p0 ).b ( p2 ); // invoke-virtual {p0, p2}, Le/h/d/a/a/o/a/o;->b(Lfr/mbs/binary/Octets;)Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;
/* .line 19 */
p1 = (( e.h.d.a.a.o.a.o ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/o/a/o;->b(Le/h/c/a/a;)Z
v1 = (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v0 ).isSecured ( ); // invoke-virtual {v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->isSecured()Z
/* if-eq p1, v1, :cond_2 */
/* .line 20 */
/* new-instance p1, Lcom/orange/oab/contactless/packid/h/a/a; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Conditions of use not satisfied on read badge for zone "; // const-string v2, "Conditions of use not satisfied on read badge for zone "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String p2 = "! The badge is "; // const-string p2, "! The badge is "
(( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 21 */
p2 = (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v0 ).isSecured ( ); // invoke-virtual {v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->isSecured()Z
final String v2 = "secured"; // const-string v2, "secured"
final String v3 = "unsecured"; // const-string v3, "unsecured"
if ( p2 != null) { // if-eqz p2, :cond_0
/* move-object p2, v2 */
} // :cond_0
/* move-object p2, v3 */
} // :goto_0
(( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p2 = " while the read badge transaction is "; // const-string p2, " while the read badge transaction is "
(( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
p2 = (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v0 ).isSecured ( ); // invoke-virtual {v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->isSecured()Z
if ( p2 != null) { // if-eqz p2, :cond_1
} // :cond_1
/* move-object v2, v3 */
} // :goto_1
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p2 = "! Warning: configuration inconsistency between card reader and user wallet!"; // const-string p2, "! Warning: configuration inconsistency between card reader and user wallet!"
(( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
v0 = e.h.d.a.a.o.a.b.d;
/* invoke-direct {p1, p2, v0}, Lcom/orange/oab/contactless/packid/h/a/a;-><init>(Ljava/lang/String;Lfr/mbs/binary/Octets;)V */
/* throw p1 */
} // :cond_2
} // .end method
public e.h.d.a.a.o.a.l a ( android.content.Context p0, Object p1 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/orange/oab/contactless/packid/h/a/a;, */
/* Lcom/orange/oab/contactless/packid/g/u/e; */
/* } */
} // .end annotation
/* .line 2 */
(( e.h.d.a.a.o.a.o ) p0 ).a ( p2 ); // invoke-virtual {p0, p2}, Le/h/d/a/a/o/a/o;->a(Le/h/c/a/a;)I
/* .line 3 */
(( e.h.c.a.a ) p2 ).d ( ); // invoke-virtual {p2}, Le/h/c/a/a;->d()Lfr/mbs/binary/Octets;
(( e.h.d.a.a.o.a.o ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/h/d/a/a/o/a/o;->a(Lfr/mbs/binary/Octets;)V
/* .line 4 */
(( e.h.c.a.a ) p2 ).j ( ); // invoke-virtual {p2}, Le/h/c/a/a;->j()Lfr/mbs/binary/Octets;
(( e.h.d.a.a.o.a.o ) p0 ).c ( v0 ); // invoke-virtual {p0, v0}, Le/h/d/a/a/o/a/o;->c(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
/* .line 5 */
(( e.h.d.a.a.o.a.o ) p0 ).a ( p1, p2, v0 ); // invoke-virtual {p0, p1, p2, v0}, Le/h/d/a/a/o/a/o;->a(Landroid/content/Context;Le/h/c/a/a;Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
/* .line 6 */
/* new-instance p2, Le/h/d/a/a/o/a/l; */
/* invoke-direct {p2, p1, v0}, Le/h/d/a/a/o/a/l;-><init>(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)V */
} // .end method
public e.h.d.a.a.o.a.m a ( ) {
/* .locals 1 */
/* .line 1 */
v0 = e.h.d.a.a.o.a.m.b;
} // .end method
public final fr.mbs.binary.Octets a ( android.content.Context p0, Object p1, fr.mbs.binary.Octets p2 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/orange/oab/contactless/packid/g/u/e;, */
/* Lcom/orange/oab/contactless/packid/h/a/a; */
/* } */
} // .end annotation
/* .line 7 */
(( e.h.d.a.a.o.a.o ) p0 ).a ( p2, p3 ); // invoke-virtual {p0, p2, p3}, Le/h/d/a/a/o/a/o;->a(Le/h/c/a/a;Lfr/mbs/binary/Octets;)Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;
/* .line 8 */
e.h.d.a.a.o.a.a .a ( p1,v0 );
/* .line 9 */
p1 = (( e.h.d.a.a.o.a.o ) p0 ).b ( p2 ); // invoke-virtual {p0, p2}, Le/h/d/a/a/o/a/o;->b(Le/h/c/a/a;)Z
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 10 */
/* new-instance p1, Le/h/d/a/a/o/b/a; */
/* invoke-direct {p1}, Le/h/d/a/a/o/b/a;-><init>()V */
v1 = this.j;
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v0 ).getCipheredWalletKey ( ); // invoke-virtual {v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getCipheredWalletKey()Lfr/mbs/binary/Octets;
(( e.h.d.a.a.n.w.c ) v1 ).b ( v2 ); // invoke-virtual {v1, v2}, Le/h/d/a/a/n/w/c;->b(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
(( e.h.c.a.a ) p2 ).b ( ); // invoke-virtual {p2}, Le/h/c/a/a;->b()Lfr/mbs/binary/Octets;
int v2 = 6; // const/4 v2, 0x6
/* const/16 v3, 0x20 */
(( fr.mbs.binary.Octets ) p2 ).get ( v2, v3 ); // invoke-virtual {p2, v2, v3}, Lfr/mbs/binary/Octets;->get(II)Lfr/mbs/binary/Octets;
(( e.h.d.a.a.o.b.a ) p1 ).c ( v1, p2 ); // invoke-virtual {p1, v1, p2}, Le/h/d/a/a/o/b/a;->c(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
/* .line 11 */
p2 = this.k;
/* const/16 v1, 0x10 */
(( fr.mbs.binary.Octets ) p1 ).pop ( v1 ); // invoke-virtual {p1, v1}, Lfr/mbs/binary/Octets;->pop(I)Lfr/mbs/binary/Octets;
(( e.h.d.a.a.o.a.o ) p0 ).a ( p2, v2, p3 ); // invoke-virtual {p0, p2, v2, p3}, Le/h/d/a/a/o/a/o;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)V
/* .line 12 */
p2 = this.l;
v2 = (( fr.mbs.binary.Octets ) p2 ).size ( ); // invoke-virtual {p2}, Lfr/mbs/binary/Octets;->size()I
(( fr.mbs.binary.Octets ) p2 ).pop ( v2 ); // invoke-virtual {p2, v2}, Lfr/mbs/binary/Octets;->pop(I)Lfr/mbs/binary/Octets;
/* .line 13 */
p2 = this.l;
(( fr.mbs.binary.Octets ) p1 ).pop ( v1 ); // invoke-virtual {p1, v1}, Lfr/mbs/binary/Octets;->pop(I)Lfr/mbs/binary/Octets;
(( fr.mbs.binary.Octets ) p2 ).put ( p1 ); // invoke-virtual {p2, p1}, Lfr/mbs/binary/Octets;->put(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
/* .line 14 */
fr.mbs.binary.Octets .empty ( );
(( fr.mbs.binary.Octets ) p1 ).put ( p3 ); // invoke-virtual {p1, p3}, Lfr/mbs/binary/Octets;->put(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
p2 = this.k;
p3 = this.l;
(( e.h.d.a.a.o.a.o ) p0 ).a ( v0, p2, p3 ); // invoke-virtual {p0, v0, p2, p3}, Le/h/d/a/a/o/a/o;->a(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
(( fr.mbs.binary.Octets ) p1 ).put ( p2 ); // invoke-virtual {p1, p2}, Lfr/mbs/binary/Octets;->put(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
p2 = e.h.d.a.a.o.a.b.a;
(( fr.mbs.binary.Octets ) p1 ).put ( p2 ); // invoke-virtual {p1, p2}, Lfr/mbs/binary/Octets;->put(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
/* .line 15 */
} // :cond_0
fr.mbs.binary.Octets .empty ( );
(( fr.mbs.binary.Octets ) p1 ).put ( p3 ); // invoke-virtual {p1, p3}, Lfr/mbs/binary/Octets;->put(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
(( e.h.d.a.a.o.a.o ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/h/d/a/a/o/a/o;->a(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)Lfr/mbs/binary/Octets;
(( fr.mbs.binary.Octets ) p1 ).put ( p2 ); // invoke-virtual {p1, p2}, Lfr/mbs/binary/Octets;->put(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
p2 = e.h.d.a.a.o.a.b.a;
(( fr.mbs.binary.Octets ) p1 ).put ( p2 ); // invoke-virtual {p1, p2}, Lfr/mbs/binary/Octets;->put(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
} // .end method
public final fr.mbs.binary.Octets a ( com.orange.oab.contactless.packid.hce.user.wallet.Badge p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/orange/oab/contactless/packid/g/u/e; */
/* } */
} // .end annotation
/* .line 26 */
v0 = this.j;
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p1 ).getCipheredTokenDataSignature ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getCipheredTokenDataSignature()Lfr/mbs/binary/Octets;
(( e.h.d.a.a.n.w.c ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Le/h/d/a/a/n/w/c;->b(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
/* .line 27 */
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p1 ).getTokenData ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getTokenData()Lcom/orange/oab/contactless/packid/hce/user/TokenData;
(( com.orange.oab.contactless.packid.hce.user.TokenData ) p1 ).toOctets ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/TokenData;->toOctets()Lfr/mbs/binary/Octets;
(( fr.mbs.binary.Octets ) p1 ).put ( v0 ); // invoke-virtual {p1, v0}, Lfr/mbs/binary/Octets;->put(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
} // .end method
public final fr.mbs.binary.Octets a ( com.orange.oab.contactless.packid.hce.user.wallet.Badge p0, fr.mbs.binary.Octets p1, fr.mbs.binary.Octets p2 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/orange/oab/contactless/packid/g/u/e; */
/* } */
} // .end annotation
/* .line 22 */
v0 = this.j;
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p1 ).getCipheredTokenDataSignature ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getCipheredTokenDataSignature()Lfr/mbs/binary/Octets;
(( e.h.d.a.a.n.w.c ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Le/h/d/a/a/n/w/c;->b(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
/* .line 23 */
/* new-instance v1, Le/h/d/a/a/o/b/a; */
/* invoke-direct {v1}, Le/h/d/a/a/o/b/a;-><init>()V */
/* .line 24 */
v2 = this.j;
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p1 ).getCipheredWalletKey ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getCipheredWalletKey()Lfr/mbs/binary/Octets;
(( e.h.d.a.a.n.w.c ) v2 ).b ( v3 ); // invoke-virtual {v2, v3}, Le/h/d/a/a/n/w/c;->b(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
(( fr.mbs.binary.Octets ) p2 ).xor ( p3 ); // invoke-virtual {p2, p3}, Lfr/mbs/binary/Octets;->xor(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
(( e.h.d.a.a.o.b.a ) v1 ).a ( v2, p2 ); // invoke-virtual {v1, v2, p2}, Le/h/d/a/a/o/b/a;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
/* .line 25 */
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p1 ).getTokenData ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getTokenData()Lcom/orange/oab/contactless/packid/hce/user/TokenData;
(( com.orange.oab.contactless.packid.hce.user.TokenData ) p1 ).toOctets ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/TokenData;->toOctets()Lfr/mbs/binary/Octets;
(( fr.mbs.binary.Octets ) p1 ).put ( v0 ); // invoke-virtual {p1, v0}, Lfr/mbs/binary/Octets;->put(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
(( e.h.d.a.a.o.b.a ) v1 ).b ( p2, p1 ); // invoke-virtual {v1, p2, p1}, Le/h/d/a/a/o/b/a;->b(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
} // .end method
public final void a ( fr.mbs.binary.Octets p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/orange/oab/contactless/packid/h/a/a; */
/* } */
} // .end annotation
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 28 */
p1 = (( fr.mbs.binary.Octets ) p1 ).toInt ( ); // invoke-virtual {p1}, Lfr/mbs/binary/Octets;->toInt()I
/* if-nez p1, :cond_0 */
return;
/* .line 29 */
} // :cond_0
/* new-instance p1, Lcom/orange/oab/contactless/packid/h/a/a; */
v0 = e.h.d.a.a.o.a.b.f;
final String v1 = "Unexpected LE on read token APDU"; // const-string v1, "Unexpected LE on read token APDU"
/* invoke-direct {p1, v1, v0}, Lcom/orange/oab/contactless/packid/h/a/a;-><init>(Ljava/lang/String;Lfr/mbs/binary/Octets;)V */
/* throw p1 */
} // .end method
public final void a ( fr.mbs.binary.Octets p0, fr.mbs.binary.Octets p1, fr.mbs.binary.Octets p2 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/orange/oab/contactless/packid/h/a/a; */
/* } */
} // .end annotation
/* .line 16 */
p1 = (( fr.mbs.binary.Octets ) p1 ).equals ( p2 ); // invoke-virtual {p1, p2}, Lfr/mbs/binary/Octets;->equals(Ljava/lang/Object;)Z
if ( p1 != null) { // if-eqz p1, :cond_0
return;
/* .line 17 */
} // :cond_0
/* new-instance p1, Lcom/orange/oab/contactless/packid/h/a/a; */
/* new-instance p2, Ljava/lang/StringBuilder; */
/* invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V */
final String v0 = "Invalid nonce received on read token secured for zone "; // const-string v0, "Invalid nonce received on read token secured for zone "
(( java.lang.StringBuilder ) p2 ).append ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).append ( p3 ); // invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String p3 = "!"; // const-string p3, "!"
(( java.lang.StringBuilder ) p2 ).append ( p3 ); // invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
p3 = e.h.d.a.a.o.a.b.e;
/* invoke-direct {p1, p2, p3}, Lcom/orange/oab/contactless/packid/h/a/a;-><init>(Ljava/lang/String;Lfr/mbs/binary/Octets;)V */
/* throw p1 */
} // .end method
public final com.orange.oab.contactless.packid.hce.user.wallet.Badge b ( fr.mbs.binary.Octets p0 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/orange/oab/contactless/packid/h/a/a; */
/* } */
} // .end annotation
/* .line 2 */
try { // :try_start_0
v0 = this.i;
(( com.orange.oab.contactless.packid.hce.user.wallet.Wallet ) v0 ).findTokenByZone ( p1 ); // invoke-virtual {v0, p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;->findTokenByZone(Lfr/mbs/binary/Octets;)Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;
/* :try_end_0 */
/* .catch Lcom/orange/oab/contactless/packid/hce/user/wallet/UnknownZoneIdException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
/* .line 3 */
/* new-instance v1, Lcom/orange/oab/contactless/packid/h/a/a; */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "No token to read for zone "; // const-string v3, "No token to read for zone "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
v2 = e.h.d.a.a.o.a.b.h;
/* invoke-direct {v1, p1, v2, v0}, Lcom/orange/oab/contactless/packid/h/a/a;-><init>(Ljava/lang/String;Lfr/mbs/binary/Octets;Ljava/lang/Throwable;)V */
/* throw v1 */
} // .end method
public final Boolean b ( Object p0 ) {
/* .locals 1 */
/* .line 1 */
(( e.h.c.a.a ) p1 ).g ( ); // invoke-virtual {p1}, Le/h/c/a/a;->g()Lg/a/a/a;
p1 = (( fr.mbs.binary.Octets ) p1 ).toInt ( ); // invoke-virtual {p1}, Lfr/mbs/binary/Octets;->toInt()I
/* const/16 v0, 0x26 */
/* if-ne p1, v0, :cond_0 */
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
public final fr.mbs.binary.Octets c ( fr.mbs.binary.Octets p0 ) {
/* .locals 2 */
int v0 = 5; // const/4 v0, 0x5
int v1 = 6; // const/4 v1, 0x6
/* .line 1 */
(( fr.mbs.binary.Octets ) p1 ).get ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Lfr/mbs/binary/Octets;->get(II)Lfr/mbs/binary/Octets;
} // .end method
