public class e.h.d.a.a.w.m implements e.h.d.a.a.o.a.c {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public java.util.Date a;
	 public final android.content.Context b;
	 public final e.h.d.a.a.o.a.q c;
	 public e.h.d.a.a.o.a.k d;
	 public fr.mbs.binary.Octets e;
	 public Boolean f;
	 public com.orange.oab.contactless.packid.hce.user.wallet.Badge g;
	 public Boolean h;
	 public android.os.AsyncTask i;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Landroid/os/AsyncTask<", */
	 /* "Ljava/lang/Object;", */
	 /* "Ljava/lang/Void;", */
	 /* "Ljava/lang/Void;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
public Boolean j;
public Boolean k;
public com.orange.oab.contactless.packid.hce.user.User l;
/* # direct methods */
public e.h.d.a.a.w.m ( ) {
/* .locals 3 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
/* iput-boolean v0, p0, Le/h/d/a/a/w/m;->k:Z */
/* .line 3 */
/* new-instance v1, Le/h/d/a/a/o/a/q; */
final String v2 = "process"; // const-string v2, "process"
/* invoke-direct {v1, p0, v2, v0}, Le/h/d/a/a/o/a/q;-><init>(Ljava/lang/Object;Ljava/lang/String;I)V */
final String v0 = "session"; // const-string v0, "session"
(( e.h.d.a.a.o.a.q ) v1 ).a ( v0 ); // invoke-virtual {v1, v0}, Le/h/d/a/a/o/a/q;->a(Ljava/lang/String;)Le/h/d/a/a/o/a/q;
this.c = v1;
/* .line 4 */
this.b = p1;
return;
} // .end method
public static void a ( Object p0, Object p1, fr.mbs.binary.Octets p2 ) { //synthethic
/* .locals 0 */
/* .line 1 */
(( e.h.d.a.a.w.m ) p0 ).b ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/h/d/a/a/w/m;->b(Le/h/d/a/a/o/a/m;Lfr/mbs/binary/Octets;)V
return;
} // .end method
/* # virtual methods */
public final fr.mbs.binary.Octets a ( java.lang.Exception p0, java.lang.String p1, fr.mbs.binary.Octets p2 ) {
/* .locals 4 */
/* .line 12 */
v0 = this.b;
int v2 = 1; // const/4 v2, 0x1
/* new-array v2, v2, [Ljava/lang/Object; */
int v3 = 0; // const/4 v3, 0x0
/* aput-object p2, v2, v3 */
(( android.content.Context ) v0 ).getString ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;
com.orange.oab.contactless.packid.report.ReportSender .send ( v0,p1 );
/* .line 13 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "error ("; // const-string v1, "error ("
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p3 ); // invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v1 = "): "; // const-string v1, "): "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v0 = "packid.nfc.NfcSession"; // const-string v0, "packid.nfc.NfcSession"
com.orange.oab.contactless.packid.debug.DebugConsole .log ( v0,p2 );
/* .line 14 */
/* instance-of p2, p1, Lcom/orange/oab/contactless/packid/h/a/o; */
/* if-nez p2, :cond_0 */
/* .line 15 */
m.a.a.c.f.c .a ( p1 );
com.orange.oab.contactless.packid.debug.DebugConsole .log ( v0,p2 );
/* .line 16 */
} // :cond_0
/* instance-of p2, p1, Lcom/orange/oab/contactless/packid/h/a/a; */
if ( p2 != null) { // if-eqz p2, :cond_1
/* .line 17 */
/* check-cast p1, Lcom/orange/oab/contactless/packid/h/a/a; */
p1 = (( com.orange.oab.contactless.packid.h.a.a ) p1 ).b ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/h/a/a;->b()Z
/* iput-boolean p1, p0, Le/h/d/a/a/w/m;->j:Z */
} // :cond_1
} // .end method
public void a ( ) {
/* .locals 3 */
/* .line 21 */
try { // :try_start_0
(( e.h.d.a.a.w.m ) p0 ).d ( ); // invoke-virtual {p0}, Le/h/d/a/a/w/m;->d()V
/* .line 22 */
/* iget-boolean v0, p0, Le/h/d/a/a/w/m;->f:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 23 */
	 /* new-instance v0, Le/h/d/a/a/r/a; */
	 v1 = this.b;
	 /* invoke-direct {v0, v1}, Le/h/d/a/a/r/a;-><init>(Landroid/content/Context;)V */
	 (( e.h.d.a.a.w.m ) p0 ).c ( ); // invoke-virtual {p0}, Le/h/d/a/a/w/m;->c()Lfr/mbs/binary/Octets;
	 v2 = this.e;
	 (( e.h.d.a.a.r.a ) v0 ).c ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Le/h/d/a/a/r/a;->c(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)V
	 /* .line 24 */
} // :cond_0
/* iget-boolean v0, p0, Le/h/d/a/a/w/m;->j:Z */
/* if-nez v0, :cond_1 */
/* iget-boolean v0, p0, Le/h/d/a/a/w/m;->k:Z */
/* if-nez v0, :cond_1 */
/* .line 25 */
/* new-instance v0, Le/h/d/a/a/r/a; */
v1 = this.b;
/* invoke-direct {v0, v1}, Le/h/d/a/a/r/a;-><init>(Landroid/content/Context;)V */
(( e.h.d.a.a.w.m ) p0 ).c ( ); // invoke-virtual {p0}, Le/h/d/a/a/w/m;->c()Lfr/mbs/binary/Octets;
v2 = this.e;
(( e.h.d.a.a.r.a ) v0 ).b ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Le/h/d/a/a/r/a;->b(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)V
/* .line 26 */
} // :cond_1
v0 = this.g;
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 27 */
/* new-instance v0, Le/h/d/a/a/n/n; */
v1 = this.b;
v2 = this.g;
/* invoke-direct {v0, v1, v2}, Le/h/d/a/a/n/n;-><init>(Landroid/content/Context;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)V */
(( e.h.d.a.a.n.n ) v0 ).a ( ); // invoke-virtual {v0}, Le/h/d/a/a/n/n;->a()V
/* .line 28 */
} // :cond_2
v0 = this.c;
(( e.h.d.a.a.o.a.q ) v0 ).a ( ); // invoke-virtual {v0}, Le/h/d/a/a/o/a/q;->a()V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
/* .line 29 */
v1 = this.b;
(( android.content.Context ) v1 ).getString ( v2 ); // invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;
com.orange.oab.contactless.packid.report.ReportSender .send ( v1,v0 );
} // :goto_0
return;
} // .end method
public final void a ( com.orange.oab.contactless.packid.hce.user.wallet.Badge p0 ) {
/* .locals 6 */
final String v0 = "packid.nfc.NfcSession"; // const-string v0, "packid.nfc.NfcSession"
/* .line 30 */
try { // :try_start_0
/* new-instance v1, Le/h/d/a/a/k/a; */
/* invoke-direct {v1}, Le/h/d/a/a/k/a;-><init>()V */
/* .line 31 */
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p1 ).getTokenData ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getTokenData()Lcom/orange/oab/contactless/packid/hce/user/TokenData;
/* .line 32 */
v3 = this.b;
e.h.d.a.a.s.m .c ( v3 );
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p1 ).getUserId ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getUserId()Ljava/lang/String;
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p1 ).getZoneId ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getZoneId()Lfr/mbs/binary/Octets;
(( e.h.d.a.a.s.g0 ) v3 ).a ( v4, v5 ); // invoke-virtual {v3, v4, v5}, Le/h/d/a/a/s/g0;->a(Ljava/lang/String;Lfr/mbs/binary/Octets;)Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v3 ).getTokenData ( ); // invoke-virtual {v3}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getTokenData()Lcom/orange/oab/contactless/packid/hce/user/TokenData;
/* .line 33 */
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p1 ).getZoneId ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getZoneId()Lfr/mbs/binary/Octets;
(( e.h.d.a.a.k.a ) v1 ).a ( p1, v2, v3 ); // invoke-virtual {v1, p1, v2, v3}, Le/h/d/a/a/k/a;->a(Lfr/mbs/binary/Octets;Lcom/orange/oab/contactless/packid/hce/user/TokenData;Lcom/orange/oab/contactless/packid/hce/user/TokenData;)Lcom/orange/oab/contactless/packid/domain/Transaction;
/* .line 34 */
v1 = this.b;
e.h.d.a.a.s.m .b ( v1 );
(( e.h.d.a.a.s.c0 ) v1 ).a ( p1 ); // invoke-virtual {v1, p1}, Le/h/d/a/a/s/c0;->a(Lcom/orange/oab/contactless/packid/domain/Transaction;)V
/* :try_end_0 */
/* .catch Lcom/orange/oab/contactless/packid/domain/InvalidApplicationDataException; {:try_start_0 ..:try_end_0} :catch_2 */
/* .catch Lcom/orange/oab/contactless/packid/domain/a; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Lcom/orange/oab/contactless/packid/domain/b; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
final String p1 = "Initialization transaction, no need to persist"; // const-string p1, "Initialization transaction, no need to persist"
/* .line 35 */
android.util.Log .d ( v0,p1 );
/* :catch_1 */
final String p1 = "Transaction already commited, no need to persist"; // const-string p1, "Transaction already commited, no need to persist"
/* .line 36 */
android.util.Log .d ( v0,p1 );
/* :catch_2 */
/* move-exception p1 */
/* .line 37 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "unknown application data in token, transaction will not be persisted ("; // const-string v2, "unknown application data in token, transaction will not be persisted ("
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.Exception ) p1 ).getMessage ( ); // invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p1 = ")"; // const-string p1, ")"
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v0,p1 );
} // :goto_0
return;
} // .end method
public void a ( Object p0, fr.mbs.binary.Octets p1 ) {
/* .locals 4 */
/* .line 18 */
/* new-instance v0, Le/h/d/a/a/w/k; */
/* invoke-direct {v0, p0, p1, p2}, Le/h/d/a/a/w/k;-><init>(Le/h/d/a/a/w/m;Le/h/d/a/a/o/a/m;Lfr/mbs/binary/Octets;)V */
this.i = v0;
int p2 = 0; // const/4 p2, 0x0
/* new-array p2, p2, [Ljava/lang/Object; */
/* .line 19 */
(( android.os.AsyncTask ) v0 ).execute ( p2 ); // invoke-virtual {v0, p2}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
/* .line 20 */
/* new-instance p2, Ljava/lang/StringBuilder; */
/* invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.Enum ) p1 ).name ( ); // invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;
(( java.lang.StringBuilder ) p2 ).append ( p1 ); // invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p1 = " "; // const-string p1, " "
(( java.lang.StringBuilder ) p2 ).append ( p1 ); // invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* new-instance p1, Ljava/util/Date; */
/* invoke-direct {p1}, Ljava/util/Date;-><init>()V */
(( java.util.Date ) p1 ).getTime ( ); // invoke-virtual {p1}, Ljava/util/Date;->getTime()J
/* move-result-wide v0 */
p1 = this.a;
(( java.util.Date ) p1 ).getTime ( ); // invoke-virtual {p1}, Ljava/util/Date;->getTime()J
/* move-result-wide v2 */
/* sub-long/2addr v0, v2 */
(( java.lang.StringBuilder ) p2 ).append ( v0, v1 ); // invoke-virtual {p2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
final String p1 = "ms"; // const-string p1, "ms"
(( java.lang.StringBuilder ) p2 ).append ( p1 ); // invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String p2 = "packid.nfc.NfcSession"; // const-string p2, "packid.nfc.NfcSession"
com.orange.oab.contactless.packid.debug.DebugConsole .log ( p2,p1 );
return;
} // .end method
public final void a ( fr.mbs.binary.Octets p0 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/orange/oab/contactless/packid/h/a/a;, */
/* Lcom/orange/oab/contactless/packid/g/u/e; */
/* } */
} // .end annotation
/* .line 6 */
v0 = this.b;
e.h.d.a.a.s.m .c ( v0 );
(( e.h.d.a.a.w.m ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/w/m;->b(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
(( e.h.d.a.a.s.g0 ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Le/h/d/a/a/s/g0;->a(Lfr/mbs/binary/Octets;)Lcom/orange/oab/contactless/packid/hce/user/User;
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 7 */
this.l = p1;
/* .line 8 */
v0 = this.b;
v1 = (( com.orange.oab.contactless.packid.hce.user.User ) p1 ).isDefault ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/User;->isDefault()Z
/* xor-int/lit8 v1, v1, 0x1 */
e.h.d.a.a.n.w.c .a ( v0,v1 );
/* .line 9 */
/* new-instance v1, Le/h/d/a/a/o/a/k; */
(( com.orange.oab.contactless.packid.hce.user.User ) p1 ).getWallet ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/User;->getWallet()Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;
/* invoke-direct {v1, p1, p0, v0}, Le/h/d/a/a/o/a/k;-><init>(Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;Le/h/d/a/a/o/a/c;Le/h/d/a/a/n/w/c;)V */
this.d = v1;
return;
/* .line 10 */
} // :cond_0
/* new-instance p1, Le/h/d/a/a/r/a; */
v0 = this.b;
/* invoke-direct {p1, v0}, Le/h/d/a/a/r/a;-><init>(Landroid/content/Context;)V */
(( e.h.d.a.a.w.m ) p0 ).c ( ); // invoke-virtual {p0}, Le/h/d/a/a/w/m;->c()Lfr/mbs/binary/Octets;
v1 = this.e;
v2 = this.b;
(( android.content.Context ) v2 ).getString ( v3 ); // invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;
(( e.h.d.a.a.r.a ) p1 ).a ( v0, v1, v2 ); // invoke-virtual {p1, v0, v1, v2}, Le/h/d/a/a/r/a;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;)V
/* .line 11 */
/* new-instance p1, Lcom/orange/oab/contactless/packid/h/a/a; */
v0 = e.h.d.a.a.o.a.b.d;
final String v1 = "No user available for NFC transaction"; // const-string v1, "No user available for NFC transaction"
/* invoke-direct {p1, v1, v0}, Lcom/orange/oab/contactless/packid/h/a/a;-><init>(Ljava/lang/String;Lfr/mbs/binary/Octets;)V */
/* throw p1 */
} // .end method
public a ( Object[] p0 ) {
/* .locals 1 */
/* .line 2 */
/* new-instance v0, Ljava/util/Date; */
/* invoke-direct {v0}, Ljava/util/Date;-><init>()V */
this.a = v0;
/* .line 3 */
fr.mbs.binary.Octets .createOctets ( p1 );
/* .line 4 */
(( e.h.d.a.a.w.m ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/w/m;->c(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
/* .line 5 */
(( fr.mbs.binary.Octets ) p1 ).toBytes ( ); // invoke-virtual {p1}, Lfr/mbs/binary/Octets;->toBytes()[B
} // .end method
public final com.orange.oab.contactless.packid.hce.user.wallet.Badge b ( ) {
/* .locals 2 */
/* .line 22 */
v0 = this.e;
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.l;
/* if-nez v0, :cond_0 */
} // :cond_0
(( com.orange.oab.contactless.packid.hce.user.User ) v0 ).getWallet ( ); // invoke-virtual {v0}, Lcom/orange/oab/contactless/packid/hce/user/User;->getWallet()Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;
v1 = this.e;
(( com.orange.oab.contactless.packid.hce.user.wallet.Wallet ) v0 ).findBadgeByZone ( v1 ); // invoke-virtual {v0, v1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Wallet;->findBadgeByZone(Lfr/mbs/binary/Octets;)Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;
} // :cond_1
} // :goto_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_1
} // .end method
public final fr.mbs.binary.Octets b ( fr.mbs.binary.Octets p0 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/orange/oab/contactless/packid/h/a/a; */
/* } */
} // .end annotation
/* .line 1 */
v0 = e.h.d.a.a.o.a.j.d;
v0 = (( e.h.d.a.a.o.a.j ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Le/h/d/a/a/o/a/j;->a(Lfr/mbs/binary/Octets;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
e.h.c.a.a .d ( p1 );
(( e.h.c.a.a ) p1 ).b ( ); // invoke-virtual {p1}, Le/h/c/a/a;->b()Lfr/mbs/binary/Octets;
int v0 = 4; // const/4 v0, 0x4
(( fr.mbs.binary.Octets ) p1 ).getLast ( v0 ); // invoke-virtual {p1, v0}, Lfr/mbs/binary/Octets;->getLast(I)Lfr/mbs/binary/Octets;
/* .line 3 */
} // :cond_0
/* new-instance v0, Lcom/orange/oab/contactless/packid/h/a/a; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Session started with a non select APDU: "; // const-string v2, "Session started with a non select APDU: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
v1 = e.h.d.a.a.o.a.b.d;
/* invoke-direct {v0, p1, v1}, Lcom/orange/oab/contactless/packid/h/a/a;-><init>(Ljava/lang/String;Lfr/mbs/binary/Octets;)V */
/* throw v0 */
} // .end method
public final void b ( com.orange.oab.contactless.packid.hce.user.wallet.Badge p0 ) {
/* .locals 5 */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 19 */
/* new-instance v0, Le/h/d/a/a/r/a; */
v1 = this.b;
/* invoke-direct {v0, v1}, Le/h/d/a/a/r/a;-><init>(Landroid/content/Context;)V */
v1 = this.l;
(( com.orange.oab.contactless.packid.hce.user.User ) v1 ).getContactlessId ( ); // invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->getContactlessId()Lfr/mbs/binary/Octets;
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p1 ).getZoneId ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getZoneId()Lfr/mbs/binary/Octets;
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p1 ).getDescription ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getDescription()Ljava/lang/String;
int v4 = 0; // const/4 v4, 0x0
(( e.h.d.a.a.r.a ) v0 ).a ( v1, v2, v4, v3 ); // invoke-virtual {v0, v1, v2, v4, v3}, Le/h/d/a/a/r/a;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;Ljava/lang/String;)V
} // :cond_0
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 20 */
p1 = (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p1 ).isTransactionAllowed ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->isTransactionAllowed()Z
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 21 */
p1 = this.b;
e.h.d.a.a.s.m .b ( p1 );
/* new-instance v0, Lcom/orange/oab/contactless/packid/domain/Transaction; */
v1 = this.e;
/* invoke-direct {v0, v1}, Lcom/orange/oab/contactless/packid/domain/Transaction;-><init>(Lfr/mbs/binary/Octets;)V */
(( e.h.d.a.a.s.c0 ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Le/h/d/a/a/s/c0;->a(Lcom/orange/oab/contactless/packid/domain/Transaction;)V
} // :cond_1
return;
} // .end method
public final void b ( Object p0, fr.mbs.binary.Octets p1 ) {
/* .locals 8 */
/* .line 4 */
v0 = e.h.d.a.a.o.a.m.c;
v0 = (( java.lang.Enum ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z
int v1 = 1; // const/4 v1, 0x1
/* xor-int/2addr v0, v1 */
/* iput-boolean v0, p0, Le/h/d/a/a/w/m;->k:Z */
if ( p2 != null) { // if-eqz p2, :cond_0
/* .line 5 */
} // :cond_0
p2 = this.e;
} // :goto_0
this.e = p2;
/* .line 6 */
(( e.h.d.a.a.w.m ) p0 ).b ( ); // invoke-virtual {p0}, Le/h/d/a/a/w/m;->b()Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;
/* .line 7 */
/* new-instance p2, Ljava/lang/StringBuilder; */
/* invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V */
final String v0 = "commandType:"; // const-string v0, "commandType:"
(( java.lang.StringBuilder ) p2 ).append ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).append ( p1 ); // invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v0 = "packid.nfc.NfcSession"; // const-string v0, "packid.nfc.NfcSession"
android.util.Log .i ( v0,p2 );
/* if-nez v5, :cond_1 */
/* .line 8 */
/* new-instance p1, Ljava/lang/StringBuilder; */
/* invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V */
final String p2 = "No badge found on NFC session success for zone id "; // const-string p2, "No badge found on NFC session success for zone id "
(( java.lang.StringBuilder ) p1 ).append ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
p2 = this.e;
(( java.lang.StringBuilder ) p1 ).append ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .w ( v0,p1 );
return;
/* .line 9 */
} // :cond_1
p2 = e.h.d.a.a.w.l.a;
v2 = (( java.lang.Enum ) p1 ).ordinal ( ); // invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I
/* aget p2, p2, v2 */
/* if-eq p2, v1, :cond_6 */
int v2 = 2; // const/4 v2, 0x2
/* if-eq p2, v2, :cond_5 */
int v2 = 3; // const/4 v2, 0x3
/* if-eq p2, v2, :cond_4 */
int v1 = 4; // const/4 v1, 0x4
/* if-eq p2, v1, :cond_3 */
int v1 = 5; // const/4 v1, 0x5
/* if-eq p2, v1, :cond_2 */
/* .line 10 */
/* new-instance p2, Ljava/lang/StringBuilder; */
/* invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "Unknown NFC Command : "; // const-string v1, "Unknown NFC Command : "
(( java.lang.StringBuilder ) p2 ).append ( v1 ); // invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).append ( p1 ); // invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .w ( v0,p1 );
/* .line 11 */
} // :cond_2
(( e.h.d.a.a.w.m ) p0 ).c ( v5 ); // invoke-virtual {p0, v5}, Le/h/d/a/a/w/m;->c(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)V
/* .line 12 */
/* new-instance v2, Le/h/d/a/a/w/g; */
/* invoke-direct {v2}, Le/h/d/a/a/w/g;-><init>()V */
v3 = this.b;
v4 = this.l;
final String v6 = "OK"; // const-string v6, "OK"
final String v7 = "NFC"; // const-string v7, "NFC"
/* invoke-virtual/range {v2 ..v7}, Le/h/d/a/a/w/g;->a(Landroid/content/Context;Lcom/orange/oab/contactless/packid/hce/user/User;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Ljava/lang/String;Ljava/lang/String;)V */
/* .line 13 */
} // :cond_3
(( e.h.d.a.a.w.m ) p0 ).e ( v5 ); // invoke-virtual {p0, v5}, Le/h/d/a/a/w/m;->e(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)V
/* .line 14 */
} // :cond_4
/* iput-boolean v1, p0, Le/h/d/a/a/w/m;->h:Z */
/* .line 15 */
/* iput-boolean v1, p0, Le/h/d/a/a/w/m;->f:Z */
/* .line 16 */
} // :cond_5
(( e.h.d.a.a.w.m ) p0 ).b ( v5 ); // invoke-virtual {p0, v5}, Le/h/d/a/a/w/m;->b(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)V
/* .line 17 */
/* new-instance v2, Le/h/d/a/a/w/g; */
/* invoke-direct {v2}, Le/h/d/a/a/w/g;-><init>()V */
v3 = this.b;
v4 = this.l;
final String v6 = "OK"; // const-string v6, "OK"
final String v7 = "NFC"; // const-string v7, "NFC"
/* invoke-virtual/range {v2 ..v7}, Le/h/d/a/a/w/g;->a(Landroid/content/Context;Lcom/orange/oab/contactless/packid/hce/user/User;Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;Ljava/lang/String;Ljava/lang/String;)V */
/* .line 18 */
} // :cond_6
/* new-instance p1, Le/h/d/a/a/r/a; */
p2 = this.b;
/* invoke-direct {p1, p2}, Le/h/d/a/a/r/a;-><init>(Landroid/content/Context;)V */
p2 = this.l;
(( com.orange.oab.contactless.packid.hce.user.User ) p2 ).getContactlessId ( ); // invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/User;->getContactlessId()Lfr/mbs/binary/Octets;
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) v5 ).getZoneId ( ); // invoke-virtual {v5}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getZoneId()Lfr/mbs/binary/Octets;
/* const/16 v1, 0x2710 */
(( e.h.d.a.a.r.a ) p1 ).a ( p2, v0, v1 ); // invoke-virtual {p1, p2, v0, v1}, Le/h/d/a/a/r/a;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;I)V
} // :goto_1
return;
} // .end method
public final fr.mbs.binary.Octets c ( ) {
/* .locals 1 */
/* .line 10 */
v0 = this.l;
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
} // :cond_0
(( com.orange.oab.contactless.packid.hce.user.User ) v0 ).getContactlessId ( ); // invoke-virtual {v0}, Lcom/orange/oab/contactless/packid/hce/user/User;->getContactlessId()Lfr/mbs/binary/Octets;
} // :goto_0
} // .end method
public final fr.mbs.binary.Octets c ( fr.mbs.binary.Octets p0 ) {
/* .locals 5 */
/* .line 1 */
try { // :try_start_0
(( e.h.d.a.a.w.m ) p0 ).d ( ); // invoke-virtual {p0}, Le/h/d/a/a/w/m;->d()V
/* .line 2 */
v0 = this.d;
/* if-nez v0, :cond_0 */
/* .line 3 */
(( e.h.d.a.a.w.m ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/w/m;->a(Lfr/mbs/binary/Octets;)V
/* .line 4 */
} // :cond_0
v0 = this.d;
v1 = this.b;
(( e.h.d.a.a.o.a.k ) v0 ).a ( v1, p1 ); // invoke-virtual {v0, v1, p1}, Le/h/d/a/a/o/a/k;->a(Landroid/content/Context;Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
/* :try_end_0 */
/* .catch Lcom/orange/oab/contactless/packid/g/u/i; {:try_start_0 ..:try_end_0} :catch_3 */
/* .catch Lcom/orange/oab/contactless/packid/g/u/e; {:try_start_0 ..:try_end_0} :catch_2 */
/* .catch Lcom/orange/oab/contactless/packid/h/a/a; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p1 */
/* .line 5 */
(( java.lang.Exception ) p1 ).getMessage ( ); // invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
v1 = e.h.d.a.a.o.a.b.b;
(( e.h.d.a.a.w.m ) p0 ).a ( p1, v0, v1 ); // invoke-virtual {p0, p1, v0, v1}, Le/h/d/a/a/w/m;->a(Ljava/lang/Exception;Ljava/lang/String;Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
/* :catch_1 */
/* move-exception p1 */
/* .line 6 */
(( java.lang.Exception ) p1 ).getMessage ( ); // invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
(( com.orange.oab.contactless.packid.h.a.a ) p1 ).a ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/h/a/a;->a()Lfr/mbs/binary/Octets;
(( e.h.d.a.a.w.m ) p0 ).a ( p1, v0, v1 ); // invoke-virtual {p0, p1, v0, v1}, Le/h/d/a/a/w/m;->a(Ljava/lang/Exception;Ljava/lang/String;Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
/* :catch_2 */
/* move-exception p1 */
/* .line 7 */
v0 = e.h.d.a.a.o.a.b.b;
final String v1 = "Encryptor not available"; // const-string v1, "Encryptor not available"
(( e.h.d.a.a.w.m ) p0 ).a ( p1, v1, v0 ); // invoke-virtual {p0, p1, v1, v0}, Le/h/d/a/a/w/m;->a(Ljava/lang/Exception;Ljava/lang/String;Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
/* :catch_3 */
/* move-exception p1 */
/* .line 8 */
/* new-instance v0, Le/h/d/a/a/r/a; */
v1 = this.b;
/* invoke-direct {v0, v1}, Le/h/d/a/a/r/a;-><init>(Landroid/content/Context;)V */
(( e.h.d.a.a.w.m ) p0 ).c ( ); // invoke-virtual {p0}, Le/h/d/a/a/w/m;->c()Lfr/mbs/binary/Octets;
v2 = this.e;
v3 = this.b;
(( android.content.Context ) v3 ).getString ( v4 ); // invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;
(( e.h.d.a.a.r.a ) v0 ).a ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Le/h/d/a/a/r/a;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;)V
/* .line 9 */
v0 = e.h.d.a.a.o.a.b.b;
final String v1 = "Unexpected encryptor initialisation"; // const-string v1, "Unexpected encryptor initialisation"
(( e.h.d.a.a.w.m ) p0 ).a ( p1, v1, v0 ); // invoke-virtual {p0, p1, v1, v0}, Le/h/d/a/a/w/m;->a(Ljava/lang/Exception;Ljava/lang/String;Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
} // .end method
public final void c ( com.orange.oab.contactless.packid.hce.user.wallet.Badge p0 ) {
/* .locals 4 */
/* .line 11 */
/* iget-boolean v0, p0, Le/h/d/a/a/w/m;->h:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 12 */
(( e.h.d.a.a.w.m ) p0 ).d ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/w/m;->d(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)V
/* .line 13 */
} // :cond_0
com.orange.oab.contactless.packid.ble.ContactlessTransaction .dismissTransactionNotification ( );
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 14 */
/* new-instance v0, Le/h/d/a/a/r/a; */
v1 = this.b;
/* invoke-direct {v0, v1}, Le/h/d/a/a/r/a;-><init>(Landroid/content/Context;)V */
v1 = this.l;
(( com.orange.oab.contactless.packid.hce.user.User ) v1 ).getContactlessId ( ); // invoke-virtual {v1}, Lcom/orange/oab/contactless/packid/hce/user/User;->getContactlessId()Lfr/mbs/binary/Octets;
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p1 ).getZoneId ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getZoneId()Lfr/mbs/binary/Octets;
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p1 ).getDescription ( ); // invoke-virtual {p1}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getDescription()Ljava/lang/String;
int v3 = 0; // const/4 v3, 0x0
(( e.h.d.a.a.r.a ) v0 ).a ( v1, v2, v3, p1 ); // invoke-virtual {v0, v1, v2, v3, p1}, Le/h/d/a/a/r/a;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;Ljava/lang/String;)V
} // :cond_1
int p1 = 0; // const/4 p1, 0x0
/* .line 15 */
/* iput-boolean p1, p0, Le/h/d/a/a/w/m;->f:Z */
/* .line 16 */
/* iput-boolean p1, p0, Le/h/d/a/a/w/m;->h:Z */
return;
} // .end method
public final void d ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/util/concurrent/ExecutionException;, */
/* Ljava/lang/InterruptedException; */
/* } */
} // .end annotation
/* .line 4 */
v0 = this.i;
if ( v0 != null) { // if-eqz v0, :cond_0
(( android.os.AsyncTask ) v0 ).get ( ); // invoke-virtual {v0}, Landroid/os/AsyncTask;->get()Ljava/lang/Object;
} // :cond_0
return;
} // .end method
public final void d ( com.orange.oab.contactless.packid.hce.user.wallet.Badge p0 ) {
/* .locals 1 */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 1 */
(( e.h.d.a.a.w.m ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/w/m;->a(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)V
/* .line 2 */
v0 = this.b;
e.h.d.a.a.s.m .c ( v0 );
(( e.h.d.a.a.s.g0 ) v0 ).c ( p1 ); // invoke-virtual {v0, p1}, Le/h/d/a/a/s/g0;->c(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)V
/* .line 3 */
this.g = p1;
} // :cond_0
return;
} // .end method
public final void e ( com.orange.oab.contactless.packid.hce.user.wallet.Badge p0 ) {
/* .locals 2 */
/* .line 1 */
v0 = this.b;
v1 = this.l;
com.orange.oab.contactless.packid.ble.ContactlessTransaction .setupAbortionTimeout ( v0,v1,p1 );
int v0 = 1; // const/4 v0, 0x1
/* .line 2 */
/* iput-boolean v0, p0, Le/h/d/a/a/w/m;->f:Z */
/* .line 3 */
/* iput-boolean v0, p0, Le/h/d/a/a/w/m;->h:Z */
/* .line 4 */
(( e.h.d.a.a.w.m ) p0 ).d ( p1 ); // invoke-virtual {p0, p1}, Le/h/d/a/a/w/m;->d(Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;)V
return;
} // .end method
