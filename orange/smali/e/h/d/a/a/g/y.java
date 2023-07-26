public class e.h.d.a.a.g.y {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public java.util.Map a;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/Map<", */
	 /* "Ljava/lang/String;", */
	 /* "Ljava/util/Map<", */
	 /* "Ljava/lang/String;", */
	 /* "Ljava/util/concurrent/ConcurrentLinkedDeque<", */
	 /* "Ljava/lang/Integer;", */
	 /* ">;>;>;" */
	 /* } */
} // .end annotation
} // .end field
public java.util.Map b;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Map<", */
/* "Ljava/lang/String;", */
/* "Ljava/util/Date;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public java.util.Map c;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Map<", */
/* "Ljava/lang/String;", */
/* "Ljava/util/Date;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public java.util.concurrent.atomic.AtomicBoolean d;
/* # direct methods */
public e.h.d.a.a.g.y ( ) {
/* .locals 2 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
/* new-instance v0, Ljava/util/concurrent/ConcurrentHashMap; */
/* invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V */
this.a = v0;
/* .line 3 */
/* new-instance v0, Ljava/util/concurrent/ConcurrentHashMap; */
/* invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V */
this.b = v0;
/* .line 4 */
/* new-instance v0, Ljava/util/concurrent/ConcurrentHashMap; */
/* invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V */
this.c = v0;
/* .line 5 */
/* new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean; */
int v1 = 0; // const/4 v1, 0x0
/* invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V */
this.d = v0;
return;
} // .end method
/* # virtual methods */
public final Double a ( java.util.Map$Entry p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/Map$Entry<", */
/* "Ljava/lang/String;", */
/* "Ljava/util/concurrent/ConcurrentLinkedDeque<", */
/* "Ljava/lang/Integer;", */
/* ">;>;)D" */
/* } */
} // .end annotation
/* .line 43 */
/* check-cast p1, Ljava/lang/Iterable; */
e.f.b.d.d .a ( p1 );
/* move-result-wide v0 */
/* return-wide v0 */
} // .end method
public final java.lang.Boolean a ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 8 */
/* .line 8 */
v0 = this.c;
/* check-cast v0, Ljava/util/Date; */
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 9 */
/* new-instance v1, Ljava/util/Date; */
(( java.util.Date ) v0 ).getTime ( ); // invoke-virtual {v0}, Ljava/util/Date;->getTime()J
/* move-result-wide v2 */
/* const-wide/16 v4, 0x2710 */
/* add-long/2addr v2, v4 */
/* invoke-direct {v1, v2, v3}, Ljava/util/Date;-><init>(J)V */
e.h.d.a.a.n.t .b ( );
v0 = (( java.util.Date ) v1 ).before ( v0 ); // invoke-virtual {v1, v0}, Ljava/util/Date;->before(Ljava/util/Date;)Z
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 10 */
p1 = this.c;
/* .line 11 */
java.lang.Boolean .valueOf ( v1 );
/* .line 12 */
} // :cond_0
v0 = e.h.d.a.a.w.r.a;
(( e.h.d.a.a.w.q ) v0 ).a ( ); // invoke-virtual {v0}, Le/h/d/a/a/w/q;->a()Le/h/d/a/a/w/r;
(( e.h.d.a.a.w.r ) v0 ).a ( p2 ); // invoke-virtual {v0, p2}, Le/h/d/a/a/w/r;->a(Ljava/lang/String;)Ljava/lang/String;
/* .line 13 */
(( e.h.d.a.a.g.y ) p0 ).b ( p2 ); // invoke-virtual {p0, p2}, Le/h/d/a/a/g/y;->b(Ljava/lang/String;)Ljava/lang/String;
final String v3 = "Packid.RssiHistory"; // const-string v3, "Packid.RssiHistory"
int v4 = 2; // const/4 v4, 0x2
int v5 = 3; // const/4 v5, 0x3
int v6 = 1; // const/4 v6, 0x1
if ( v0 != null) { // if-eqz v0, :cond_1
/* new-array v2, v5, [Ljava/lang/Object; */
/* aput-object p2, v2, v1 */
/* aput-object v0, v2, v6 */
/* aput-object p1, v2, v4 */
final String v4 = "ZoneKey : %s,Device With Best Average : %s, currentDevice : %s"; // const-string v4, "ZoneKey : %s,Device With Best Average : %s, currentDevice : %s"
/* .line 14 */
java.lang.String .format ( v4,v2 );
android.util.Log .d ( v3,v2 );
/* .line 15 */
v2 = this.d;
p1 = (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
(( java.util.concurrent.atomic.AtomicBoolean ) v2 ).set ( p1 ); // invoke-virtual {v2, p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
/* .line 16 */
} // :cond_1
v0 = this.d;
v7 = (( java.lang.String ) p1 ).equals ( v2 ); // invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
(( java.util.concurrent.atomic.AtomicBoolean ) v0 ).set ( v7 ); // invoke-virtual {v0, v7}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
/* new-array v0, v5, [Ljava/lang/Object; */
/* aput-object p2, v0, v1 */
/* aput-object v2, v0, v6 */
/* aput-object p1, v0, v4 */
final String p1 = "ZoneKey : %s, Nearest Device : %s, currentDevice : %s"; // const-string p1, "ZoneKey : %s, Nearest Device : %s, currentDevice : %s"
/* .line 17 */
java.lang.String .format ( p1,v0 );
android.util.Log .d ( v3,p1 );
/* .line 18 */
} // :goto_0
p1 = this.d;
p1 = (( java.util.concurrent.atomic.AtomicBoolean ) p1 ).get ( ); // invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 19 */
p1 = this.c;
/* .line 20 */
java.lang.Boolean .valueOf ( v6 );
/* .line 21 */
} // :cond_2
java.lang.Boolean .valueOf ( v1 );
} // :cond_3
int p1 = 0; // const/4 p1, 0x0
} // .end method
public final java.util.concurrent.ConcurrentLinkedDeque a ( Integer p0, fr.mbs.binary.Octets p1, fr.mbs.binary.Octets p2, java.lang.String p3 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(I", */
/* "Lfr/mbs/binary/Octets;", */
/* "Lfr/mbs/binary/Octets;", */
/* "Ljava/lang/String;", */
/* ")", */
/* "Ljava/util/concurrent/ConcurrentLinkedDeque<", */
/* "Ljava/lang/Integer;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 28 */
(( e.h.d.a.a.g.y ) p0 ).a ( p2, p3, p4 ); // invoke-virtual {p0, p2, p3, p4}, Le/h/d/a/a/g/y;->a(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;)Ljava/util/concurrent/ConcurrentLinkedDeque;
/* .line 29 */
(( e.h.d.a.a.g.y ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/h/d/a/a/g/y;->a(ILjava/util/concurrent/ConcurrentLinkedDeque;)Ljava/util/concurrent/ConcurrentLinkedDeque;
} // .end method
public final java.util.concurrent.ConcurrentLinkedDeque a ( Integer p0, java.util.concurrent.ConcurrentLinkedDeque p1 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(I", */
/* "Ljava/util/concurrent/ConcurrentLinkedDeque<", */
/* "Ljava/lang/Integer;", */
/* ">;)", */
/* "Ljava/util/concurrent/ConcurrentLinkedDeque<", */
/* "Ljava/lang/Integer;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 30 */
} // :goto_0
v0 = (( java.util.concurrent.ConcurrentLinkedDeque ) p2 ).size ( ); // invoke-virtual {p2}, Ljava/util/concurrent/ConcurrentLinkedDeque;->size()I
int v1 = 1; // const/4 v1, 0x1
/* if-lt v0, v1, :cond_0 */
/* .line 31 */
(( java.util.concurrent.ConcurrentLinkedDeque ) p2 ).removeFirst ( ); // invoke-virtual {p2}, Ljava/util/concurrent/ConcurrentLinkedDeque;->removeFirst()Ljava/lang/Object;
/* .line 32 */
} // :cond_0
java.lang.Integer .valueOf ( p1 );
(( java.util.concurrent.ConcurrentLinkedDeque ) p2 ).add ( p1 ); // invoke-virtual {p2, p1}, Ljava/util/concurrent/ConcurrentLinkedDeque;->add(Ljava/lang/Object;)Z
} // .end method
public final java.util.concurrent.ConcurrentLinkedDeque a ( fr.mbs.binary.Octets p0, fr.mbs.binary.Octets p1, java.lang.String p2 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Lfr/mbs/binary/Octets;", */
/* "Lfr/mbs/binary/Octets;", */
/* "Ljava/lang/String;", */
/* ")", */
/* "Ljava/util/concurrent/ConcurrentLinkedDeque<", */
/* "Ljava/lang/Integer;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 33 */
(( e.h.d.a.a.g.y ) p0 ).b ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/h/d/a/a/g/y;->b(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)Ljava/lang/String;
/* .line 34 */
p2 = this.a;
/* check-cast p2, Ljava/util/Map; */
/* if-nez p2, :cond_0 */
/* .line 35 */
/* new-instance p2, Ljava/util/concurrent/ConcurrentHashMap; */
/* invoke-direct {p2}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V */
/* .line 36 */
v0 = this.a;
/* .line 37 */
} // :cond_0
/* check-cast p1, Ljava/util/concurrent/ConcurrentLinkedDeque; */
/* if-nez p1, :cond_1 */
/* .line 38 */
/* new-instance p1, Ljava/util/concurrent/ConcurrentLinkedDeque; */
/* invoke-direct {p1}, Ljava/util/concurrent/ConcurrentLinkedDeque;-><init>()V */
/* .line 39 */
} // :cond_1
} // .end method
public void a ( fr.mbs.binary.Octets p0, fr.mbs.binary.Octets p1 ) {
/* .locals 1 */
/* .line 42 */
v0 = this.c;
(( e.h.d.a.a.g.y ) p0 ).b ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/h/d/a/a/g/y;->b(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)Ljava/lang/String;
e.h.d.a.a.n.t .b ( );
return;
} // .end method
public final void a ( java.lang.String p0 ) {
/* .locals 5 */
/* .line 22 */
v0 = this.b;
e.h.d.a.a.n.t .b ( );
/* const/16 p1, 0x8 */
/* .line 23 */
e.h.d.a.a.n.t .b ( p1 );
/* .line 24 */
v0 = this.b;
v1 = } // :cond_0
if ( v1 != null) { // if-eqz v1, :cond_1
/* check-cast v1, Ljava/util/Map$Entry; */
/* .line 25 */
/* check-cast v2, Ljava/util/Date; */
v2 = (( java.util.Date ) v2 ).before ( p1 ); // invoke-virtual {v2, p1}, Ljava/util/Date;->before(Ljava/util/Date;)Z
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 26 */
v2 = this.a;
v3 = } // :goto_0
if ( v3 != null) { // if-eqz v3, :cond_0
/* check-cast v3, Ljava/util/Map; */
/* .line 27 */
} // :cond_1
return;
} // .end method
public Boolean a ( Integer p0, com.orange.oab.contactless.packid.hce.user.wallet.Badge p1, fr.mbs.binary.Octets p2, java.lang.String p3 ) {
/* .locals 7 */
/* .line 1 */
v0 = (( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p2 ).getRssi ( ); // invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getRssi()B
java.lang.Integer .valueOf ( v0 );
(( com.orange.oab.contactless.packid.hce.user.wallet.Badge ) p2 ).getZoneId ( ); // invoke-virtual {p2}, Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;->getZoneId()Lfr/mbs/binary/Octets;
/* move-object v1, p0 */
/* move v2, p1 */
/* move-object v5, p3 */
/* move-object v6, p4 */
p1 = /* invoke-virtual/range {v1 ..v6}, Le/h/d/a/a/g/y;->a(ILjava/lang/Integer;Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;)Z */
} // .end method
public Boolean a ( Integer p0, java.lang.Integer p1, fr.mbs.binary.Octets p2, fr.mbs.binary.Octets p3, java.lang.String p4 ) {
/* .locals 0 */
/* .line 2 */
(( e.h.d.a.a.g.y ) p0 ).a ( p5 ); // invoke-virtual {p0, p5}, Le/h/d/a/a/g/y;->a(Ljava/lang/String;)V
/* .line 3 */
(( e.h.d.a.a.g.y ) p0 ).a ( p1, p4, p3, p5 ); // invoke-virtual {p0, p1, p4, p3, p5}, Le/h/d/a/a/g/y;->a(ILfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Ljava/lang/String;)Ljava/util/concurrent/ConcurrentLinkedDeque;
/* .line 4 */
(( e.h.d.a.a.g.y ) p0 ).b ( p4, p3 ); // invoke-virtual {p0, p4, p3}, Le/h/d/a/a/g/y;->b(Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)Ljava/lang/String;
(( e.h.d.a.a.g.y ) p0 ).a ( p5, p3 ); // invoke-virtual {p0, p5, p3}, Le/h/d/a/a/g/y;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Boolean;
if ( p3 != null) { // if-eqz p3, :cond_0
/* .line 5 */
p1 = (( java.lang.Boolean ) p3 ).booleanValue ( ); // invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z
/* .line 6 */
} // :cond_0
p2 = (( e.h.d.a.a.g.y ) p0 ).a ( p2, p1 ); // invoke-virtual {p0, p2, p1}, Le/h/d/a/a/g/y;->a(Ljava/lang/Integer;Ljava/util/concurrent/ConcurrentLinkedDeque;)Z
if ( p2 != null) { // if-eqz p2, :cond_1
/* .line 7 */
(( java.util.concurrent.ConcurrentLinkedDeque ) p1 ).clear ( ); // invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentLinkedDeque;->clear()V
int p1 = 1; // const/4 p1, 0x1
} // :cond_1
int p1 = 0; // const/4 p1, 0x0
} // .end method
public final Boolean a ( java.lang.Integer p0, java.util.concurrent.ConcurrentLinkedDeque p1 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/Integer;", */
/* "Ljava/util/concurrent/ConcurrentLinkedDeque<", */
/* "Ljava/lang/Integer;", */
/* ">;)Z" */
/* } */
} // .end annotation
/* .line 40 */
(( java.util.concurrent.ConcurrentLinkedDeque ) p2 ).iterator ( ); // invoke-virtual {p2}, Ljava/util/concurrent/ConcurrentLinkedDeque;->iterator()Ljava/util/Iterator;
v0 = } // :cond_0
if ( v0 != null) { // if-eqz v0, :cond_1
/* check-cast v0, Ljava/lang/Integer; */
/* .line 41 */
v0 = (( java.lang.Integer ) v0 ).intValue ( ); // invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
v1 = (( java.lang.Integer ) p1 ).intValue ( ); // invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I
/* if-lt v0, v1, :cond_0 */
int p1 = 1; // const/4 p1, 0x1
} // :cond_1
int p1 = 0; // const/4 p1, 0x0
} // .end method
public final java.lang.String b ( fr.mbs.binary.Octets p0, fr.mbs.binary.Octets p1 ) {
/* .locals 1 */
/* .line 8 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
(( fr.mbs.binary.Octets ) p1 ).toHexa ( ); // invoke-virtual {p1}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( fr.mbs.binary.Octets ) p2 ).toHexa ( ); // invoke-virtual {p2}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
public final java.lang.String b ( java.lang.String p0 ) {
/* .locals 7 */
/* .line 1 */
v0 = this.a;
/* check-cast p1, Ljava/util/Map; */
int v0 = 0; // const/4 v0, 0x0
if ( p1 != null) { // if-eqz p1, :cond_2
v1 = /* .line 2 */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 3 */
} // :cond_0
/* const-wide/high16 v1, -0x3e20000000000000L # -2.147483648E9 */
/* .line 4 */
} // :cond_1
v3 = } // :goto_0
if ( v3 != null) { // if-eqz v3, :cond_2
/* .line 5 */
/* check-cast v3, Ljava/util/Map$Entry; */
/* .line 6 */
(( e.h.d.a.a.g.y ) p0 ).a ( v3 ); // invoke-virtual {p0, v3}, Le/h/d/a/a/g/y;->a(Ljava/util/Map$Entry;)D
/* move-result-wide v4 */
/* cmpl-double v6, v4, v1 */
/* if-lez v6, :cond_1 */
/* .line 7 */
/* check-cast v0, Ljava/lang/String; */
/* move-wide v1, v4 */
} // :cond_2
} // :goto_1
} // .end method
