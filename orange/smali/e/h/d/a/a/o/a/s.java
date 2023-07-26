public class e.h.d.a.a.o.a.s implements e.h.d.a.a.o.a.b {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final com.orange.oab.contactless.packid.hce.user.wallet.Wallet i;
	 public final e.h.d.a.a.n.w.c j;
	 public final fr.mbs.binary.Octets k;
	 public final fr.mbs.binary.Octets l;
	 public final e.h.d.a.a.o.a.m m;
	 /* # direct methods */
	 public e.h.d.a.a.o.a.s ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.m = p1;
		 /* .line 3 */
		 this.i = p2;
		 /* .line 4 */
		 this.j = p3;
		 /* .line 5 */
		 this.k = p4;
		 /* .line 6 */
		 this.l = p5;
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
	 /* .line 14 */
	 try { // :try_start_0
		 v0 = this.i;
		 (( com.orange.oab.contactless.packid.hce.user.wallet.Wallet ) v0 ).findTokenByZone ( p1 ); // invoke-virtual {v0, p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;->findTokenByZone(Lfr/mbs/binary/Octets;)Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;
		 /* :try_end_0 */
		 /* .catch Lcom/orange/oab/contactless/packid/hce/user/wallet/UnknownZoneIdException; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* :catch_0 */
		 /* move-exception v0 */
		 /* .line 15 */
		 /* new-instance v1, Lcom/orange/oab/contactless/packid/h/a/a; */
		 /* new-instance v2, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v3 = "No token to write for zone "; // const-string v3, "No token to write for zone "
		 (( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 v2 = e.h.d.a.a.o.a.b.h;
		 /* invoke-direct {v1, p1, v2, v0}, Lcom/orange/oab/contactless/packid/h/a/a;-><init>(Ljava/lang/String;Lfr/mbs/binary/Octets;Ljava/lang/Throwable;)V */
		 /* throw v1 */
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
	 try { // :try_start_0
		 (( e.h.d.a.a.o.a.s ) p0 ).a ( p2 ); // invoke-virtual {p0, p2}, Le/h/d/a/a/o/a/s;->a(Le/h/c/a/a;)Le/h/d/a/a/o/a/l;
		 /* :try_end_0 */
		 /* .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* :catch_0 */
		 /* move-exception p1 */
		 /* .line 3 */
		 /* new-instance p2, Lcom/orange/oab/contactless/packid/h/a/a; */
		 v0 = e.h.d.a.a.o.a.b.h;
		 final String v1 = "Unexpected APDU data"; // const-string v1, "Unexpected APDU data"
		 /* invoke-direct {p2, v1, v0, p1}, Lcom/orange/oab/contactless/packid/h/a/a;-><init>(Ljava/lang/String;Lfr/mbs/binary/Octets;Ljava/lang/Throwable;)V */
		 /* throw p2 */
	 } // .end method
	 public final e.h.d.a.a.o.a.l a ( Object p0 ) {
		 /* .locals 4 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Lcom/orange/oab/contactless/packid/h/a/a;, */
		 /* Lcom/orange/oab/contactless/packid/g/u/e; */
		 /* } */
	 } // .end annotation
	 /* .line 4 */
	 (( e.h.c.a.a ) p1 ).b ( ); // invoke-virtual {p1}, Le/h/c/a/a;->b()Lfr/mbs/binary/Octets;
	 int v1 = 6; // const/4 v1, 0x6
	 int v2 = 0; // const/4 v2, 0x0
	 (( fr.mbs.binary.Octets ) v0 ).get ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Lfr/mbs/binary/Octets;->get(II)Lfr/mbs/binary/Octets;
	 /* .line 5 */
	 (( e.h.c.a.a ) p1 ).b ( ); // invoke-virtual {p1}, Le/h/c/a/a;->b()Lfr/mbs/binary/Octets;
	 (( fr.mbs.binary.Octets ) p1 ).getLastFrom ( v1 ); // invoke-virtual {p1, v1}, Lfr/mbs/binary/Octets;->getLastFrom(I)Lfr/mbs/binary/Octets;
	 /* .line 6 */
	 (( e.h.d.a.a.o.a.s ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/h/d/a/a/o/a/s;->a(Lfr/mbs/binary/Octets;)Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;
	 /* .line 7 */
	 v2 = 	 (( e.h.d.a.a.o.a.s ) p0 ).b ( ); // invoke-virtual {p0}, Le/h/d/a/a/o/a/s;->b()Z
	 if ( v2 != null) { // if-eqz v2, :cond_0
		 (( e.h.d.a.a.o.a.s ) p0 ).a ( v1, p1 ); // invoke-virtual {p0, v1, p1}, Le/h/d/a/a/o/a/s;->a(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
		 /* .line 8 */
	 } // :cond_0
	 com.orange.oab.contactless.packid.hce.user.TokenData .parse ( p1 );
	 (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v1 ).getTokenData ( ); // invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getTokenData()Lcom/orange/oab/contactless/packid/hce/user/TokenData;
	 (( e.h.d.a.a.o.a.s ) p0 ).a ( v2, v3 ); // invoke-virtual {p0, v2, v3}, Le/h/d/a/a/o/a/s;->a(Lcom/orange/oab/contactless/packid/hce/user/TokenData;Lcom/orange/oab/contactless/packid/hce/user/TokenData;)V
	 /* .line 9 */
	 (( e.h.d.a.a.o.a.s ) p0 ).a ( p1, v1 ); // invoke-virtual {p0, p1, v1}, Le/h/d/a/a/o/a/s;->a(Lfr/mbs/binary/Octets;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)V
	 /* .line 10 */
	 /* new-instance p1, Le/h/d/a/a/o/a/l; */
	 v1 = e.h.d.a.a.o.a.b.a;
	 /* invoke-direct {p1, v1, v0}, Le/h/d/a/a/o/a/l;-><init>(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)V */
} // .end method
public e.h.d.a.a.o.a.m a ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = this.m;
} // .end method
public fr.mbs.binary.Octets a ( com.orange.oab.contactless.packid.hce.user.wallet.Badge p0, fr.mbs.binary.Octets p1 ) {
	 /* .locals 3 */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Lcom/orange/oab/contactless/packid/g/u/e; */
	 /* } */
} // .end annotation
/* .line 11 */
/* new-instance v0, Le/h/d/a/a/o/b/a; */
/* invoke-direct {v0}, Le/h/d/a/a/o/b/a;-><init>()V */
/* .line 12 */
v1 = this.j;
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p1 ).getCipheredWalletKey ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getCipheredWalletKey()Lfr/mbs/binary/Octets;
(( e.h.d.a.a.n.w.c ) v1 ).b ( p1 ); // invoke-virtual {v1, p1}, Le/h/d/a/a/n/w/c;->b(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
v1 = this.k;
v2 = this.l;
(( fr.mbs.binary.Octets ) v1 ).xor ( v2 ); // invoke-virtual {v1, v2}, Lfr/mbs/binary/Octets;->xor(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
(( e.h.d.a.a.o.b.a ) v0 ).a ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Le/h/d/a/a/o/b/a;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
/* .line 13 */
(( e.h.d.a.a.o.b.a ) v0 ).d ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Le/h/d/a/a/o/b/a;->d(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
} // .end method
public final void a ( com.orange.oab.contactless.packid.hce.user.TokenData p0, com.orange.oab.contactless.packid.hce.user.TokenData p1 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/orange/oab/contactless/packid/h/a/a; */
/* } */
} // .end annotation
/* .line 21 */
v0 = (( e.h.d.a.a.o.a.s ) p0 ).e ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/h/d/a/a/o/a/s;->e(Lcom/orange/oab/contactless/packid/hce/user/TokenData;Lcom/orange/oab/contactless/packid/hce/user/TokenData;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 22 */
v0 = (( e.h.d.a.a.o.a.s ) p0 ).b ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/h/d/a/a/o/a/s;->b(Lcom/orange/oab/contactless/packid/hce/user/TokenData;Lcom/orange/oab/contactless/packid/hce/user/TokenData;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 23 */
	 v0 = 	 (( e.h.d.a.a.o.a.s ) p0 ).d ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/h/d/a/a/o/a/s;->d(Lcom/orange/oab/contactless/packid/hce/user/TokenData;Lcom/orange/oab/contactless/packid/hce/user/TokenData;)Z
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 24 */
		 p1 = 		 (( e.h.d.a.a.o.a.s ) p0 ).c ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/h/d/a/a/o/a/s;->c(Lcom/orange/oab/contactless/packid/hce/user/TokenData;Lcom/orange/oab/contactless/packid/hce/user/TokenData;)Z
		 if ( p1 != null) { // if-eqz p1, :cond_0
			 return;
			 /* .line 25 */
		 } // :cond_0
		 /* new-instance p1, Lcom/orange/oab/contactless/packid/h/a/a; */
		 p2 = e.h.d.a.a.o.a.b.h;
		 final String v0 = "Invalid token header"; // const-string v0, "Invalid token header"
		 /* invoke-direct {p1, v0, p2}, Lcom/orange/oab/contactless/packid/h/a/a;-><init>(Ljava/lang/String;Lfr/mbs/binary/Octets;)V */
		 /* throw p1 */
	 } // .end method
	 public final void a ( fr.mbs.binary.Octets p0, com.orange.oab.contactless.packid.hce.user.wallet.Badge p1 ) {
		 /* .locals 3 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Lcom/orange/oab/contactless/packid/g/u/e; */
		 /* } */
	 } // .end annotation
	 /* .line 16 */
	 v0 = this.j;
	 (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p2 ).getCipheredTokenDataSignature ( ); // invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getCipheredTokenDataSignature()Lfr/mbs/binary/Octets;
	 (( e.h.d.a.a.n.w.c ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Le/h/d/a/a/n/w/c;->b(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
	 v0 = 	 (( fr.mbs.binary.Octets ) v0 ).size ( ); // invoke-virtual {v0}, Lfr/mbs/binary/Octets;->size()I
	 /* .line 17 */
	 v1 = 	 (( fr.mbs.binary.Octets ) p1 ).size ( ); // invoke-virtual {p1}, Lfr/mbs/binary/Octets;->size()I
	 /* sub-int/2addr v1, v0 */
	 /* .line 18 */
	 (( fr.mbs.binary.Octets ) p1 ).getLast ( v0 ); // invoke-virtual {p1, v0}, Lfr/mbs/binary/Octets;->getLast(I)Lfr/mbs/binary/Octets;
	 /* .line 19 */
	 v2 = this.j;
	 (( e.h.d.a.a.n.w.c ) v2 ).a ( v0 ); // invoke-virtual {v2, v0}, Le/h/d/a/a/n/w/c;->a(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
	 (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p2 ).setCipheredTokenDataSignature ( v0 ); // invoke-virtual {p2, v0}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setCipheredTokenDataSignature(Lfr/mbs/binary/Octets;)V
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 20 */
	 (( fr.mbs.binary.Octets ) p1 ).get ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Lfr/mbs/binary/Octets;->get(II)Lfr/mbs/binary/Octets;
	 com.orange.oab.contactless.packid.hce.user.TokenData .parse ( p1 );
	 (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p2 ).setTokenData ( p1 ); // invoke-virtual {p2, p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->setTokenData(Lcom/orange/oab/contactless/packid/hce/user/TokenData;)V
	 return;
} // .end method
public final Boolean b ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = this.k;
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 v0 = 		 (( fr.mbs.binary.Octets ) v0 ).isEmpty ( ); // invoke-virtual {v0}, Lfr/mbs/binary/Octets;->isEmpty()Z
		 /* if-nez v0, :cond_0 */
		 v0 = this.l;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 v0 = 			 (( fr.mbs.binary.Octets ) v0 ).isEmpty ( ); // invoke-virtual {v0}, Lfr/mbs/binary/Octets;->isEmpty()Z
			 /* if-nez v0, :cond_0 */
			 int v0 = 1; // const/4 v0, 0x1
		 } // :cond_0
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // .end method
public final Boolean b ( com.orange.oab.contactless.packid.hce.user.TokenData p0, com.orange.oab.contactless.packid.hce.user.TokenData p1 ) {
	 /* .locals 0 */
	 /* .line 2 */
	 p1 = 	 (( com.orange.oab.contactless.packid.hce.user.TokenData ) p1 ).getApiVersionNumber ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/TokenData;->getApiVersionNumber()I
	 p2 = 	 (( com.orange.oab.contactless.packid.hce.user.TokenData ) p2 ).getApiVersionNumber ( ); // invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/TokenData;->getApiVersionNumber()I
	 /* if-ne p1, p2, :cond_0 */
	 int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
public final Boolean c ( com.orange.oab.contactless.packid.hce.user.TokenData p0, com.orange.oab.contactless.packid.hce.user.TokenData p1 ) {
/* .locals 4 */
/* .line 1 */
(( com.orange.oab.contactless.packid.hce.user.TokenData ) p1 ).getExpirationDate ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/TokenData;->getExpirationDate()Ljava/util/Date;
(( java.util.Date ) p1 ).getTime ( ); // invoke-virtual {p1}, Ljava/util/Date;->getTime()J
/* move-result-wide v0 */
/* const-wide/16 v2, 0x3e8 */
/* div-long/2addr v0, v2 */
(( com.orange.oab.contactless.packid.hce.user.TokenData ) p2 ).getExpirationDate ( ); // invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/TokenData;->getExpirationDate()Ljava/util/Date;
(( java.util.Date ) p1 ).getTime ( ); // invoke-virtual {p1}, Ljava/util/Date;->getTime()J
/* move-result-wide p1 */
/* div-long/2addr p1, v2 */
/* cmp-long v2, v0, p1 */
/* if-nez v2, :cond_0 */
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
public final Boolean d ( com.orange.oab.contactless.packid.hce.user.TokenData p0, com.orange.oab.contactless.packid.hce.user.TokenData p1 ) {
/* .locals 0 */
/* .line 1 */
(( com.orange.oab.contactless.packid.hce.user.TokenData ) p1 ).getId ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/TokenData;->getId()Lfr/mbs/binary/Octets;
(( com.orange.oab.contactless.packid.hce.user.TokenData ) p2 ).getId ( ); // invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/TokenData;->getId()Lfr/mbs/binary/Octets;
p1 = (( fr.mbs.binary.Octets ) p1 ).equals ( p2 ); // invoke-virtual {p1, p2}, Lfr/mbs/binary/Octets;->equals(Ljava/lang/Object;)Z
} // .end method
public final Boolean e ( com.orange.oab.contactless.packid.hce.user.TokenData p0, com.orange.oab.contactless.packid.hce.user.TokenData p1 ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "token to write sequence number = "; // const-string v1, "token to write sequence number = "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = (( com.orange.oab.contactless.packid.hce.user.TokenData ) p1 ).getSequenceNumber ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/TokenData;->getSequenceNumber()I
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = " actual sequence number ="; // const-string v1, " actual sequence number ="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = (( com.orange.oab.contactless.packid.hce.user.TokenData ) p2 ).getSequenceNumber ( ); // invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/TokenData;->getSequenceNumber()I
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = " -1"; // const-string v1, " -1"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v1 = "packid.nfc.Write"; // const-string v1, "packid.nfc.Write"
android.util.Log .d ( v1,v0 );
/* .line 2 */
p1 = (( com.orange.oab.contactless.packid.hce.user.TokenData ) p1 ).getSequenceNumber ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/TokenData;->getSequenceNumber()I
p2 = (( com.orange.oab.contactless.packid.hce.user.TokenData ) p2 ).getSequenceNumber ( ); // invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/TokenData;->getSequenceNumber()I
int v0 = 1; // const/4 v0, 0x1
/* sub-int/2addr p2, v0 */
/* if-ne p1, p2, :cond_0 */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
