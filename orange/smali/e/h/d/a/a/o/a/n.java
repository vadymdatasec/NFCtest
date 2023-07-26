public class e.h.d.a.a.o.a.n implements e.h.d.a.a.o.a.b {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final com.orange.oab.contactless.packid.hce.user.wallet.Wallet i;
	 public final e.h.d.a.a.n.w.c j;
	 public final fr.mbs.binary.Octets k;
	 /* # direct methods */
	 public e.h.d.a.a.o.a.n ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.i = p1;
		 /* .line 3 */
		 this.j = p2;
		 /* .line 4 */
		 this.k = p3;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final com.orange.oab.contactless.packid.hce.user.wallet.Badge a ( fr.mbs.binary.Octets p0 ) {
		 /* .locals 4 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Lcom/orange/oab/contactless/packid/h/a/a; */
		 /* } */
	 } // .end annotation
	 /* .line 13 */
	 try { // :try_start_0
		 v0 = this.i;
		 (( com.orange.oab.contactless.packid.hce.user.wallet.Wallet ) v0 ).findBadgeByZone ( p1 ); // invoke-virtual {v0, p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;->findBadgeByZone(Lfr/mbs/binary/Octets;)Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;
		 /* :try_end_0 */
		 /* .catch Lcom/orange/oab/contactless/packid/hce/user/wallet/UnknownZoneIdException; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* :catch_0 */
		 /* move-exception v0 */
		 /* .line 14 */
		 /* new-instance v1, Lcom/orange/oab/contactless/packid/h/a/a; */
		 /* new-instance v2, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v3 = "No badge to read for zone "; // const-string v3, "No badge to read for zone "
		 (( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 v2 = e.h.d.a.a.o.a.b.h;
		 /* invoke-direct {v1, p1, v2, v0}, Lcom/orange/oab/contactless/packid/h/a/a;-><init>(Ljava/lang/String;Lfr/mbs/binary/Octets;Ljava/lang/Throwable;)V */
		 /* throw v1 */
	 } // .end method
	 public e.h.d.a.a.o.a.l a ( android.content.Context p0, Object p1 ) {
		 /* .locals 0 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Lcom/orange/oab/contactless/packid/h/a/a;, */
		 /* Lcom/orange/oab/contactless/packid/g/u/e; */
		 /* } */
	 } // .end annotation
	 /* .line 2 */
	 (( e.h.d.a.a.o.a.n ) p0 ).b ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/h/d/a/a/o/a/n;->b(Landroid/content/Context;Le/h/c/a/a;)V
	 /* .line 3 */
	 (( e.h.d.a.a.o.a.n ) p0 ).e ( p2 ); // invoke-virtual {p0, p2}, Le/h/d/a/a/o/a/n;->e(Le/h/c/a/a;)Le/h/d/a/a/o/a/l;
} // .end method
public e.h.d.a.a.o.a.m a ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = e.h.d.a.a.o.a.m.g;
} // .end method
public final fr.mbs.binary.Octets a ( Object p0 ) {
	 /* .locals 2 */
	 /* .line 12 */
	 (( e.h.c.a.a ) p1 ).b ( ); // invoke-virtual {p1}, Le/h/c/a/a;->b()Lfr/mbs/binary/Octets;
	 int v0 = 0; // const/4 v0, 0x0
	 int v1 = 6; // const/4 v1, 0x6
	 (( fr.mbs.binary.Octets ) p1 ).get ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Lfr/mbs/binary/Octets;->get(II)Lfr/mbs/binary/Octets;
} // .end method
public final fr.mbs.binary.Octets a ( Object p0, fr.mbs.binary.Octets p1, com.orange.oab.contactless.packid.hce.user.wallet.Badge p2 ) {
	 /* .locals 5 */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Lcom/orange/oab/contactless/packid/h/a/a;, */
	 /* Lcom/orange/oab/contactless/packid/g/u/e; */
	 /* } */
} // .end annotation
/* .line 16 */
(( e.h.c.a.a ) p1 ).b ( ); // invoke-virtual {p1}, Le/h/c/a/a;->b()Lfr/mbs/binary/Octets;
/* const/16 v1, 0x10 */
int v2 = 6; // const/4 v2, 0x6
(( fr.mbs.binary.Octets ) v0 ).get ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Lfr/mbs/binary/Octets;->get(II)Lfr/mbs/binary/Octets;
/* .line 17 */
/* new-instance v2, Le/h/d/a/a/o/b/a; */
/* invoke-direct {v2}, Le/h/d/a/a/o/b/a;-><init>()V */
/* .line 18 */
v3 = this.j;
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p3 ).getCipheredWalletKey ( ); // invoke-virtual {p3}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getCipheredWalletKey()Lfr/mbs/binary/Octets;
(( e.h.d.a.a.n.w.c ) v3 ).b ( v4 ); // invoke-virtual {v3, v4}, Le/h/d/a/a/n/w/c;->b(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
/* .line 19 */
v4 = this.k;
(( e.h.d.a.a.o.b.a ) v2 ).a ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Le/h/d/a/a/o/b/a;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
v0 = (( fr.mbs.binary.Octets ) v4 ).equals ( v0 ); // invoke-virtual {v4, v0}, Lfr/mbs/binary/Octets;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 20 */
	 (( e.h.c.a.a ) p1 ).b ( ); // invoke-virtual {p1}, Le/h/c/a/a;->b()Lfr/mbs/binary/Octets;
	 (( fr.mbs.binary.Octets ) p1 ).getLast ( v1 ); // invoke-virtual {p1, v1}, Lfr/mbs/binary/Octets;->getLast(I)Lfr/mbs/binary/Octets;
	 /* .line 21 */
	 fr.mbs.binary.Octets .createOctets ( p2 );
	 v0 = this.j;
	 (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p3 ).getCipheredId ( ); // invoke-virtual {p3}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getCipheredId()Lfr/mbs/binary/Octets;
	 (( e.h.d.a.a.n.w.c ) v0 ).b ( p3 ); // invoke-virtual {v0, p3}, Le/h/d/a/a/n/w/c;->b(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
	 (( fr.mbs.binary.Octets ) p2 ).put ( p3 ); // invoke-virtual {p2, p3}, Lfr/mbs/binary/Octets;->put(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
	 (( fr.mbs.binary.Octets ) p2 ).put ( p1 ); // invoke-virtual {p2, p1}, Lfr/mbs/binary/Octets;->put(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
	 /* .line 22 */
	 (( e.h.d.a.a.o.b.a ) v2 ).a ( v3, p1 ); // invoke-virtual {v2, v3, p1}, Le/h/d/a/a/o/b/a;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
	 p2 = e.h.d.a.a.o.a.b.a;
	 (( fr.mbs.binary.Octets ) p1 ).put ( p2 ); // invoke-virtual {p1, p2}, Lfr/mbs/binary/Octets;->put(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
	 /* .line 23 */
} // :cond_0
/* new-instance p1, Lcom/orange/oab/contactless/packid/h/a/a; */
int p2 = 1; // const/4 p2, 0x1
/* new-array p2, p2, [Ljava/lang/Object; */
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p3 ).getZoneId ( ); // invoke-virtual {p3}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getZoneId()Lfr/mbs/binary/Octets;
int v0 = 0; // const/4 v0, 0x0
/* aput-object p3, p2, v0 */
final String p3 = "Authentication failed for zone %s, master key is probably wrong!!"; // const-string p3, "Authentication failed for zone %s, master key is probably wrong!!"
java.lang.String .format ( p3,p2 );
p3 = e.h.d.a.a.o.a.b.e;
/* invoke-direct {p1, p2, p3}, Lcom/orange/oab/contactless/packid/h/a/a;-><init>(Ljava/lang/String;Lfr/mbs/binary/Octets;)V */
/* throw p1 */
} // .end method
public final fr.mbs.binary.Octets a ( fr.mbs.binary.Octets p0, com.orange.oab.contactless.packid.hce.user.wallet.Badge p1 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/orange/oab/contactless/packid/g/u/e; */
/* } */
} // .end annotation
/* .line 15 */
fr.mbs.binary.Octets .createOctets ( p1 );
v0 = this.j;
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p2 ).getCipheredId ( ); // invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getCipheredId()Lfr/mbs/binary/Octets;
(( e.h.d.a.a.n.w.c ) v0 ).b ( p2 ); // invoke-virtual {v0, p2}, Le/h/d/a/a/n/w/c;->b(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
(( fr.mbs.binary.Octets ) p1 ).put ( p2 ); // invoke-virtual {p1, p2}, Lfr/mbs/binary/Octets;->put(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
p2 = e.h.d.a.a.o.a.b.a;
(( fr.mbs.binary.Octets ) p1 ).put ( p2 ); // invoke-virtual {p1, p2}, Lfr/mbs/binary/Octets;->put(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
} // .end method
public final void a ( com.orange.oab.contactless.packid.hce.user.wallet.Badge p0 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/orange/oab/contactless/packid/h/a/o; */
/* } */
} // .end annotation
/* .line 9 */
e.h.d.a.a.h .c ( );
v0 = (( e.h.d.a.a.h ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Le/h/d/a/a/h;->a(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)Z
/* if-nez v0, :cond_0 */
return;
/* .line 10 */
} // :cond_0
/* const-class v0, Le/h/d/a/a/o/a/n; */
(( java.lang.Class ) v0 ).getName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Can not reply for locked badge : "; // const-string v2, "Can not reply for locked badge : "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p1 ).getDescription ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getDescription()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .w ( v0,v1 );
/* .line 11 */
/* new-instance v0, Lcom/orange/oab/contactless/packid/h/a/o; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p1 ).getDescription ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getDescription()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
v1 = e.h.d.a.a.o.a.b.e;
int v2 = 1; // const/4 v2, 0x1
/* invoke-direct {v0, p1, v1, v2}, Lcom/orange/oab/contactless/packid/h/a/o;-><init>(Ljava/lang/String;Lfr/mbs/binary/Octets;Z)V */
/* throw v0 */
} // .end method
public final void a ( Object p0, Boolean p1 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/orange/oab/contactless/packid/h/a/a; */
/* } */
} // .end annotation
/* .line 4 */
v0 = (( e.h.d.a.a.o.a.n ) p0 ).d ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/o/a/n;->d(Le/h/c/a/a;)Z
/* if-nez v0, :cond_1 */
if ( p2 != null) { // if-eqz p2, :cond_0
/* .line 5 */
} // :cond_0
/* new-instance p2, Lcom/orange/oab/contactless/packid/h/a/a; */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "Invalid LC value for APDU "; // const-string v1, "Invalid LC value for APDU "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
v0 = e.h.d.a.a.o.a.b.f;
fr.mbs.binary.Octets .createOctets ( v0 );
/* invoke-direct {p2, p1, v0}, Lcom/orange/oab/contactless/packid/h/a/a;-><init>(Ljava/lang/String;Lfr/mbs/binary/Octets;)V */
/* throw p2 */
} // :cond_1
} // :goto_0
return;
} // .end method
public final void a ( Boolean p0, com.orange.oab.contactless.packid.hce.user.wallet.Badge p1 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/orange/oab/contactless/packid/h/a/a; */
/* } */
} // .end annotation
/* .line 6 */
v0 = (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p2 ).isSecured ( ); // invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->isSecured()Z
/* if-eq p1, v0, :cond_2 */
/* .line 7 */
/* new-instance v0, Lcom/orange/oab/contactless/packid/h/a/a; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Conditions of use not satisfied on read badge for zone "; // const-string v2, "Conditions of use not satisfied on read badge for zone "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p2 ).getZoneId ( ); // invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getZoneId()Lfr/mbs/binary/Octets;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v2 = "! The badge is "; // const-string v2, "! The badge is "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 8 */
p2 = (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p2 ).isSecured ( ); // invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->isSecured()Z
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
if ( p1 != null) { // if-eqz p1, :cond_1
} // :cond_1
/* move-object v2, v3 */
} // :goto_1
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p1 = "! Warning: configuration inconsistency between card reader and user wallet!"; // const-string p1, "! Warning: configuration inconsistency between card reader and user wallet!"
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
p2 = e.h.d.a.a.o.a.b.d;
/* invoke-direct {v0, p1, p2}, Lcom/orange/oab/contactless/packid/h/a/a;-><init>(Ljava/lang/String;Lfr/mbs/binary/Octets;)V */
/* throw v0 */
} // :cond_2
return;
} // .end method
public final Boolean a ( Object p0, Integer p1 ) {
/* .locals 0 */
/* .line 24 */
(( e.h.c.a.a ) p1 ).c ( ); // invoke-virtual {p1}, Le/h/c/a/a;->c()Lfr/mbs/binary/Octets;
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 25 */
p1 = (( fr.mbs.binary.Octets ) p1 ).toInt ( ); // invoke-virtual {p1}, Lfr/mbs/binary/Octets;->toInt()I
/* if-ne p1, p2, :cond_0 */
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
public final com.orange.oab.contactless.packid.hce.user.wallet.Badge b ( Object p0 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/orange/oab/contactless/packid/h/a/a; */
/* } */
} // .end annotation
/* .line 11 */
(( e.h.d.a.a.o.a.n ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/o/a/n;->a(Le/h/c/a/a;)Lfr/mbs/binary/Octets;
/* .line 12 */
(( e.h.d.a.a.o.a.n ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/o/a/n;->a(Lfr/mbs/binary/Octets;)Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;
} // .end method
public final void b ( android.content.Context p0, Object p1 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/orange/oab/contactless/packid/h/a/a; */
/* } */
} // .end annotation
/* .line 1 */
v0 = (( e.h.d.a.a.o.a.n ) p0 ).c ( p2 ); // invoke-virtual {p0, p2}, Le/h/d/a/a/o/a/n;->c(Le/h/c/a/a;)Z
/* .line 2 */
(( e.h.d.a.a.o.a.n ) p0 ).a ( p2, v0 ); // invoke-virtual {p0, p2, v0}, Le/h/d/a/a/o/a/n;->a(Le/h/c/a/a;Z)V
/* .line 3 */
(( e.h.d.a.a.o.a.n ) p0 ).b ( p2 ); // invoke-virtual {p0, p2}, Le/h/d/a/a/o/a/n;->b(Le/h/c/a/a;)Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;
/* .line 4 */
(( e.h.d.a.a.o.a.n ) p0 ).a ( v0, p2 ); // invoke-virtual {p0, v0, p2}, Le/h/d/a/a/o/a/n;->a(ZLcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)V
/* .line 5 */
(( e.h.d.a.a.o.a.n ) p0 ).b ( p2 ); // invoke-virtual {p0, p2}, Le/h/d/a/a/o/a/n;->b(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)V
/* .line 6 */
(( e.h.d.a.a.o.a.n ) p0 ).a ( p2 ); // invoke-virtual {p0, p2}, Le/h/d/a/a/o/a/n;->a(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)V
/* .line 7 */
e.h.d.a.a.o.a.a .a ( p1,p2 );
return;
} // .end method
public final void b ( com.orange.oab.contactless.packid.hce.user.wallet.Badge p0 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/orange/oab/contactless/packid/h/a/a; */
/* } */
} // .end annotation
/* .line 8 */
v0 = e.h.d.a.a.i .f ( p1 );
if ( v0 != null) { // if-eqz v0, :cond_0
return;
/* .line 9 */
} // :cond_0
/* new-instance v0, Lcom/orange/oab/contactless/packid/h/a/a; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Conditions of use not satisfied on read badge for zone "; // const-string v2, "Conditions of use not satisfied on read badge for zone "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 10 */
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p1 ).getZoneId ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getZoneId()Lfr/mbs/binary/Octets;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String p1 = "! Cannot perform nfc operation on BLE only badge!"; // const-string p1, "! Cannot perform nfc operation on BLE only badge!"
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
v1 = e.h.d.a.a.o.a.b.d;
int v2 = 1; // const/4 v2, 0x1
/* invoke-direct {v0, p1, v1, v2}, Lcom/orange/oab/contactless/packid/h/a/a;-><init>(Ljava/lang/String;Lfr/mbs/binary/Octets;Z)V */
/* throw v0 */
} // .end method
public final Boolean c ( Object p0 ) {
/* .locals 1 */
/* const/16 v0, 0x26 */
/* .line 1 */
p1 = (( e.h.d.a.a.o.a.n ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Le/h/d/a/a/o/a/n;->a(Le/h/c/a/a;I)Z
} // .end method
public final Boolean d ( Object p0 ) {
/* .locals 1 */
int v0 = 6; // const/4 v0, 0x6
/* .line 1 */
p1 = (( e.h.d.a.a.o.a.n ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Le/h/d/a/a/o/a/n;->a(Le/h/c/a/a;I)Z
} // .end method
public final e.h.d.a.a.o.a.l e ( Object p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/orange/oab/contactless/packid/h/a/a;, */
/* Lcom/orange/oab/contactless/packid/g/u/e; */
/* } */
} // .end annotation
/* .line 1 */
(( e.h.d.a.a.o.a.n ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/o/a/n;->b(Le/h/c/a/a;)Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;
/* .line 2 */
v1 = (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v0 ).isSecured ( ); // invoke-virtual {v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->isSecured()Z
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 3 */
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v0 ).getZoneId ( ); // invoke-virtual {v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getZoneId()Lfr/mbs/binary/Octets;
(( e.h.d.a.a.o.a.n ) p0 ).a ( p1, v1, v0 ); // invoke-virtual {p0, p1, v1, v0}, Le/h/d/a/a/o/a/n;->a(Le/h/c/a/a;Lfr/mbs/binary/Octets;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)Lfr/mbs/binary/Octets;
/* .line 4 */
} // :cond_0
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v0 ).getZoneId ( ); // invoke-virtual {v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getZoneId()Lfr/mbs/binary/Octets;
(( e.h.d.a.a.o.a.n ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Le/h/d/a/a/o/a/n;->a(Lfr/mbs/binary/Octets;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)Lfr/mbs/binary/Octets;
/* .line 5 */
} // :goto_0
/* new-instance v1, Le/h/d/a/a/o/a/l; */
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v0 ).getZoneId ( ); // invoke-virtual {v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getZoneId()Lfr/mbs/binary/Octets;
/* invoke-direct {v1, p1, v0}, Le/h/d/a/a/o/a/l;-><init>(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)V */
} // .end method
