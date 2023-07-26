public class e.h.d.a.a.o.a.r implements e.h.d.a.a.o.a.b {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final com.orange.oab.contactless.packid.hce.user.wallet.Wallet i;
	 public final e.h.d.a.a.n.w.c j;
	 public final fr.mbs.binary.Octets k;
	 public final fr.mbs.binary.Octets l;
	 /* # direct methods */
	 public e.h.d.a.a.o.a.r ( ) {
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
	 public final com.orange.oab.contactless.packid.hce.user.wallet.Badge a ( fr.mbs.binary.Octets p0 ) {
		 /* .locals 3 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Lcom/orange/oab/contactless/packid/h/a/a; */
		 /* } */
	 } // .end annotation
	 /* .line 13 */
	 try { // :try_start_0
		 v0 = this.i;
		 (( com.orange.oab.contactless.packid.hce.user.wallet.Wallet ) v0 ).findTokenByZone ( p1 ); // invoke-virtual {v0, p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;->findTokenByZone(Lfr/mbs/binary/Octets;)Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;
		 /* :try_end_0 */
		 /* .catch Lcom/orange/oab/contactless/packid/hce/user/wallet/UnknownZoneIdException; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* .line 14 */
		 /* :catch_0 */
		 /* new-instance v0, Lcom/orange/oab/contactless/packid/h/a/a; */
		 /* new-instance v1, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v2 = "No token found for zone with id "; // const-string v2, "No token found for zone with id "
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( fr.mbs.binary.Octets ) p1 ).toHexa ( ); // invoke-virtual {p1}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;
		 (( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 v1 = e.h.d.a.a.o.a.b.h;
		 /* invoke-direct {v0, p1, v1}, Lcom/orange/oab/contactless/packid/h/a/a;-><init>(Ljava/lang/String;Lfr/mbs/binary/Octets;)V */
		 /* throw v0 */
	 } // .end method
	 public e.h.d.a.a.o.a.l a ( android.content.Context p0, Object p1 ) {
		 /* .locals 2 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Lcom/orange/oab/contactless/packid/h/a/a;, */
		 /* Lcom/orange/oab/contactless/packid/g/u/e; */
		 /* } */
	 } // .end annotation
	 /* .line 2 */
	 (( e.h.c.a.a ) p2 ).b ( ); // invoke-virtual {p2}, Le/h/c/a/a;->b()Lfr/mbs/binary/Octets;
	 int v0 = 6; // const/4 v0, 0x6
	 int v1 = 0; // const/4 v1, 0x0
	 (( fr.mbs.binary.Octets ) p1 ).get ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Lfr/mbs/binary/Octets;->get(II)Lfr/mbs/binary/Octets;
	 /* .line 3 */
	 (( e.h.d.a.a.o.a.r ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/o/a/r;->a(Lfr/mbs/binary/Octets;)Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;
	 /* .line 4 */
	 (( e.h.c.a.a ) p2 ).b ( ); // invoke-virtual {p2}, Le/h/c/a/a;->b()Lfr/mbs/binary/Octets;
	 (( fr.mbs.binary.Octets ) p2 ).getLastFrom ( v0 ); // invoke-virtual {p2, v0}, Lfr/mbs/binary/Octets;->getLastFrom(I)Lfr/mbs/binary/Octets;
	 /* .line 5 */
	 v0 = 	 (( e.h.d.a.a.o.a.r ) p0 ).b ( p2 ); // invoke-virtual {p0, p2}, Le/h/d/a/a/o/a/r;->b(Lfr/mbs/binary/Octets;)Z
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 (( e.h.d.a.a.o.a.r ) p0 ).a ( v1, p2 ); // invoke-virtual {p0, v1, p2}, Le/h/d/a/a/o/a/r;->a(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
		 /* .line 6 */
	 } // :cond_0
	 v0 = this.j;
	 (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v1 ).getCipheredTokenDataSignature ( ); // invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getCipheredTokenDataSignature()Lfr/mbs/binary/Octets;
	 (( e.h.d.a.a.n.w.c ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Le/h/d/a/a/n/w/c;->b(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
	 /* .line 7 */
	 p2 = 	 (( fr.mbs.binary.Octets ) v0 ).equals ( p2 ); // invoke-virtual {v0, p2}, Lfr/mbs/binary/Octets;->equals(Ljava/lang/Object;)Z
	 if ( p2 != null) { // if-eqz p2, :cond_1
		 /* .line 8 */
		 /* new-instance p2, Le/h/d/a/a/o/a/l; */
		 v0 = e.h.d.a.a.o.a.b.a;
		 /* invoke-direct {p2, v0, p1}, Le/h/d/a/a/o/a/l;-><init>(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)V */
		 /* .line 9 */
	 } // :cond_1
	 /* new-instance p1, Lcom/orange/oab/contactless/packid/h/a/a; */
	 p2 = e.h.d.a.a.o.a.b.e;
	 final String v0 = "Unexpected token signature"; // const-string v0, "Unexpected token signature"
	 /* invoke-direct {p1, v0, p2}, Lcom/orange/oab/contactless/packid/h/a/a;-><init>(Ljava/lang/String;Lfr/mbs/binary/Octets;)V */
	 /* throw p1 */
} // .end method
public e.h.d.a.a.o.a.m a ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = e.h.d.a.a.o.a.m.e;
} // .end method
public fr.mbs.binary.Octets a ( com.orange.oab.contactless.packid.hce.user.wallet.Badge p0, fr.mbs.binary.Octets p1 ) {
	 /* .locals 3 */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Lcom/orange/oab/contactless/packid/g/u/e; */
	 /* } */
} // .end annotation
/* .line 10 */
/* new-instance v0, Le/h/d/a/a/o/b/a; */
/* invoke-direct {v0}, Le/h/d/a/a/o/b/a;-><init>()V */
/* .line 11 */
v1 = this.j;
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p1 ).getCipheredWalletKey ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getCipheredWalletKey()Lfr/mbs/binary/Octets;
(( e.h.d.a.a.n.w.c ) v1 ).b ( p1 ); // invoke-virtual {v1, p1}, Le/h/d/a/a/n/w/c;->b(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
v1 = this.k;
v2 = this.l;
(( fr.mbs.binary.Octets ) v1 ).xor ( v2 ); // invoke-virtual {v1, v2}, Lfr/mbs/binary/Octets;->xor(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
(( e.h.d.a.a.o.b.a ) v0 ).a ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Le/h/d/a/a/o/b/a;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
/* .line 12 */
(( e.h.d.a.a.o.b.a ) v0 ).d ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Le/h/d/a/a/o/b/a;->d(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
} // .end method
public final Boolean b ( fr.mbs.binary.Octets p0 ) {
/* .locals 1 */
/* .line 1 */
p1 = (( fr.mbs.binary.Octets ) p1 ).size ( ); // invoke-virtual {p1}, Lfr/mbs/binary/Octets;->size()I
/* const/16 v0, 0x10 */
/* if-ne p1, v0, :cond_0 */
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
