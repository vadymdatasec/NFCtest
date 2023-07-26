public class e.h.c.a.a {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final Boolean a;
	 public final g.a.a.a b;
	 public final g.a.a.a c;
	 public final g.a.a.a d;
	 public final g.a.a.a e;
	 public final fr.mbs.binary.Octets f;
	 public final java.lang.Integer g;
	 /* # direct methods */
	 public e.h.c.a.a ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 e.h.c.a.a .a ( p1,p6 );
		 /* .line 3 */
		 /* iput-boolean p1, p0, Le/h/c/a/a;->a:Z */
		 /* .line 4 */
		 this.b = p2;
		 /* .line 5 */
		 this.c = p3;
		 /* .line 6 */
		 this.d = p4;
		 /* .line 7 */
		 this.e = p5;
		 /* .line 8 */
		 this.f = p6;
		 /* .line 9 */
		 this.g = p7;
		 return;
	 } // .end method
	 public static e.h.c.a.a a ( fr.mbs.binary.Octets p0 ) {
		 /* .locals 3 */
		 int v0 = 4; // const/4 v0, 0x4
		 /* .line 3 */
		 (( fr.mbs.binary.Octets ) p0 ).get ( v0 ); // invoke-virtual {p0, v0}, Lfr/mbs/binary/Octets;->get(I)Lg/a/a/a;
		 v1 = 		 (( g.a.a.a ) v1 ).a ( ); // invoke-virtual {v1}, Lg/a/a/a;->a()B
		 /* if-nez v1, :cond_0 */
		 int v1 = 1; // const/4 v1, 0x1
	 } // :cond_0
	 int v1 = 0; // const/4 v1, 0x0
} // :goto_0
int v2 = 5; // const/4 v2, 0x5
if ( v1 != null) { // if-eqz v1, :cond_1
	 int v0 = 2; // const/4 v0, 0x2
	 /* .line 4 */
	 (( fr.mbs.binary.Octets ) p0 ).get ( v2, v0 ); // invoke-virtual {p0, v2, v0}, Lfr/mbs/binary/Octets;->get(II)Lfr/mbs/binary/Octets;
	 v0 = 	 (( fr.mbs.binary.Octets ) v0 ).toInt ( ); // invoke-virtual {v0}, Lfr/mbs/binary/Octets;->toInt()I
	 int v2 = 7; // const/4 v2, 0x7
	 /* .line 5 */
	 (( fr.mbs.binary.Octets ) p0 ).get ( v2, v0 ); // invoke-virtual {p0, v2, v0}, Lfr/mbs/binary/Octets;->get(II)Lfr/mbs/binary/Octets;
	 /* .line 6 */
} // :cond_1
(( fr.mbs.binary.Octets ) p0 ).get ( v0 ); // invoke-virtual {p0, v0}, Lfr/mbs/binary/Octets;->get(I)Lg/a/a/a;
v0 = (( g.a.a.a ) v0 ).b ( ); // invoke-virtual {v0}, Lg/a/a/a;->b()S
/* .line 7 */
(( fr.mbs.binary.Octets ) p0 ).get ( v2, v0 ); // invoke-virtual {p0, v2, v0}, Lfr/mbs/binary/Octets;->get(II)Lfr/mbs/binary/Octets;
/* .line 8 */
} // :goto_1
e.h.c.a.a .a ( v1,p0,v0,v2 );
} // .end method
public static e.h.c.a.a a ( Boolean p0, fr.mbs.binary.Octets p1, Integer p2, fr.mbs.binary.Octets p3 ) {
/* .locals 8 */
int v0 = 1; // const/4 v0, 0x1
if ( p0 != null) { // if-eqz p0, :cond_0
int v1 = 3; // const/4 v1, 0x3
} // :cond_0
int v1 = 1; // const/4 v1, 0x1
} // :goto_0
/* add-int/lit8 v1, v1, 0x4 */
/* add-int/2addr v1, p2 */
/* .line 9 */
p2 = (( fr.mbs.binary.Octets ) p1 ).size ( ); // invoke-virtual {p1}, Lfr/mbs/binary/Octets;->size()I
/* if-eq p2, v1, :cond_1 */
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // :goto_1
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 10 */
e.h.c.a.a .a ( p0,p1,v1,v0 );
} // :cond_2
/* if-nez v0, :cond_3 */
int p2 = 0; // const/4 p2, 0x0
/* .line 11 */
} // :cond_3
(( fr.mbs.binary.Octets ) p1 ).getLastFrom ( v1 ); // invoke-virtual {p1, v1}, Lfr/mbs/binary/Octets;->getLastFrom(I)Lfr/mbs/binary/Octets;
p2 = (( fr.mbs.binary.Octets ) p2 ).toInt ( ); // invoke-virtual {p2}, Lfr/mbs/binary/Octets;->toInt()I
java.lang.Integer .valueOf ( p2 );
} // :goto_2
/* move-object v7, p2 */
/* .line 12 */
/* new-instance p2, Le/h/c/a/a; */
e.h.c.a.a .c ( p1 );
e.h.c.a.a .f ( p1 );
e.h.c.a.a .g ( p1 );
e.h.c.a.a .h ( p1 );
/* move-object v0, p2 */
/* move v1, p0 */
/* move-object v6, p3 */
/* invoke-direct/range {v0 ..v7}, Le/h/c/a/a;-><init>(ZLg/a/a/a;Lg/a/a/a;Lg/a/a/a;Lg/a/a/a;Lfr/mbs/binary/Octets;Ljava/lang/Integer;)V */
} // .end method
public static void a ( Boolean p0, fr.mbs.binary.Octets p1 ) {
/* .locals 1 */
if ( p1 != null) { // if-eqz p1, :cond_2
if ( p0 != null) { // if-eqz p0, :cond_0
/* const p0, 0xffff */
} // :cond_0
/* const/16 p0, 0xff */
/* .line 1 */
} // :goto_0
v0 = (( fr.mbs.binary.Octets ) p1 ).size ( ); // invoke-virtual {p1}, Lfr/mbs/binary/Octets;->size()I
/* if-gt v0, p0, :cond_1 */
/* .line 2 */
} // :cond_1
/* new-instance v0, Lcom/orange/nfc/apdu/TooBigApduDataException; */
p1 = (( fr.mbs.binary.Octets ) p1 ).size ( ); // invoke-virtual {p1}, Lfr/mbs/binary/Octets;->size()I
/* invoke-direct {v0, p0, p1}, Lcom/orange/nfc/apdu/TooBigApduDataException;-><init>(II)V */
/* throw v0 */
} // :cond_2
} // :goto_1
return;
} // .end method
public static void a ( Boolean p0, fr.mbs.binary.Octets p1, Integer p2, Boolean p3 ) {
/* .locals 0 */
if ( p0 != null) { // if-eqz p0, :cond_0
int p0 = 2; // const/4 p0, 0x2
} // :cond_0
int p0 = 1; // const/4 p0, 0x1
/* .line 13 */
} // :goto_0
p3 = (( fr.mbs.binary.Octets ) p1 ).size ( ); // invoke-virtual {p1}, Lfr/mbs/binary/Octets;->size()I
/* add-int/2addr p2, p0 */
/* if-ne p3, p2, :cond_1 */
return;
/* .line 14 */
} // :cond_1
/* new-instance p0, Lcom/orange/nfc/apdu/InvalidApduFormatException; */
(( fr.mbs.binary.Octets ) p1 ).toHexa ( ); // invoke-virtual {p1}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;
/* invoke-direct {p0, p1}, Lcom/orange/nfc/apdu/InvalidApduFormatException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
} // .end method
public static e.h.c.a.a b ( fr.mbs.binary.Octets p0 ) {
/* .locals 9 */
/* .line 1 */
v0 = (( fr.mbs.binary.Octets ) p0 ).size ( ); // invoke-virtual {p0}, Lfr/mbs/binary/Octets;->size()I
int v1 = 7; // const/4 v1, 0x7
/* if-ne v0, v1, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
int v2 = 1; // const/4 v2, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
int v2 = 0; // const/4 v2, 0x0
/* .line 2 */
} // :goto_0
/* new-instance v0, Le/h/c/a/a; */
e.h.c.a.a .c ( p0 );
e.h.c.a.a .f ( p0 );
e.h.c.a.a .g ( p0 );
e.h.c.a.a .h ( p0 );
int v7 = 0; // const/4 v7, 0x0
v1 = (( fr.mbs.binary.Octets ) p0 ).size ( ); // invoke-virtual {p0}, Lfr/mbs/binary/Octets;->size()I
int v8 = 4; // const/4 v8, 0x4
/* if-ne v1, v8, :cond_1 */
int p0 = 0; // const/4 p0, 0x0
} // :cond_1
(( fr.mbs.binary.Octets ) p0 ).getLastFrom ( v8 ); // invoke-virtual {p0, v8}, Lfr/mbs/binary/Octets;->getLastFrom(I)Lfr/mbs/binary/Octets;
p0 = (( fr.mbs.binary.Octets ) p0 ).toInt ( ); // invoke-virtual {p0}, Lfr/mbs/binary/Octets;->toInt()I
java.lang.Integer .valueOf ( p0 );
} // :goto_1
/* move-object v8, p0 */
/* move-object v1, v0 */
/* invoke-direct/range {v1 ..v8}, Le/h/c/a/a;-><init>(ZLg/a/a/a;Lg/a/a/a;Lg/a/a/a;Lg/a/a/a;Lfr/mbs/binary/Octets;Ljava/lang/Integer;)V */
} // .end method
public static g.a.a.a c ( fr.mbs.binary.Octets p0 ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
(( fr.mbs.binary.Octets ) p0 ).get ( v0 ); // invoke-virtual {p0, v0}, Lfr/mbs/binary/Octets;->get(I)Lg/a/a/a;
} // .end method
public static e.h.c.a.a d ( fr.mbs.binary.Octets p0 ) {
/* .locals 2 */
/* .line 1 */
try { // :try_start_0
v0 = e.h.c.a.a .e ( p0 );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
e.h.c.a.a .b ( p0 );
/* .line 3 */
} // :cond_0
e.h.c.a.a .a ( p0 );
/* :try_end_0 */
/* .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 4 */
/* :catch_0 */
/* new-instance v0, Lcom/orange/nfc/apdu/InvalidApduFormatException; */
final String v1 = ""; // const-string v1, ""
(( fr.mbs.binary.Octets ) p0 ).toString ( v1 ); // invoke-virtual {p0, v1}, Lfr/mbs/binary/Octets;->toString(Ljava/lang/String;)Ljava/lang/String;
/* invoke-direct {v0, p0}, Lcom/orange/nfc/apdu/InvalidApduFormatException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public static Boolean e ( fr.mbs.binary.Octets p0 ) {
/* .locals 7 */
/* .line 1 */
v0 = (( fr.mbs.binary.Octets ) p0 ).size ( ); // invoke-virtual {p0}, Lfr/mbs/binary/Octets;->size()I
int v1 = 4; // const/4 v1, 0x4
int v2 = 1; // const/4 v2, 0x1
int v3 = 0; // const/4 v3, 0x0
/* if-ne v0, v1, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
} // :goto_0
v4 = (( fr.mbs.binary.Octets ) p0 ).size ( ); // invoke-virtual {p0}, Lfr/mbs/binary/Octets;->size()I
int v5 = 5; // const/4 v5, 0x5
/* if-ne v4, v5, :cond_1 */
int v4 = 1; // const/4 v4, 0x1
} // :cond_1
int v4 = 0; // const/4 v4, 0x0
/* .line 3 */
} // :goto_1
v5 = (( fr.mbs.binary.Octets ) p0 ).size ( ); // invoke-virtual {p0}, Lfr/mbs/binary/Octets;->size()I
int v6 = 7; // const/4 v6, 0x7
/* if-ne v5, v6, :cond_2 */
(( fr.mbs.binary.Octets ) p0 ).get ( v1 ); // invoke-virtual {p0, v1}, Lfr/mbs/binary/Octets;->get(I)Lg/a/a/a;
p0 = (( g.a.a.a ) p0 ).a ( ); // invoke-virtual {p0}, Lg/a/a/a;->a()B
/* if-nez p0, :cond_2 */
int p0 = 1; // const/4 p0, 0x1
} // :cond_2
int p0 = 0; // const/4 p0, 0x0
} // :goto_2
/* if-nez v4, :cond_4 */
/* if-nez v0, :cond_4 */
if ( p0 != null) { // if-eqz p0, :cond_3
} // :cond_3
int v2 = 0; // const/4 v2, 0x0
} // :cond_4
} // :goto_3
} // .end method
public static g.a.a.a f ( fr.mbs.binary.Octets p0 ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
/* .line 1 */
(( fr.mbs.binary.Octets ) p0 ).get ( v0 ); // invoke-virtual {p0, v0}, Lfr/mbs/binary/Octets;->get(I)Lg/a/a/a;
} // .end method
public static g.a.a.a g ( fr.mbs.binary.Octets p0 ) {
/* .locals 1 */
int v0 = 2; // const/4 v0, 0x2
/* .line 1 */
(( fr.mbs.binary.Octets ) p0 ).get ( v0 ); // invoke-virtual {p0, v0}, Lfr/mbs/binary/Octets;->get(I)Lg/a/a/a;
} // .end method
public static g.a.a.a h ( fr.mbs.binary.Octets p0 ) {
/* .locals 1 */
int v0 = 3; // const/4 v0, 0x3
/* .line 1 */
(( fr.mbs.binary.Octets ) p0 ).get ( v0 ); // invoke-virtual {p0, v0}, Lfr/mbs/binary/Octets;->get(I)Lg/a/a/a;
} // .end method
/* # virtual methods */
public g.a.a.a a ( ) {
/* .locals 1 */
/* .line 15 */
v0 = this.b;
} // .end method
public fr.mbs.binary.Octets b ( ) {
/* .locals 1 */
/* .line 3 */
v0 = this.f;
} // .end method
public fr.mbs.binary.Octets c ( ) {
/* .locals 3 */
/* .line 2 */
(( e.h.c.a.a ) p0 ).b ( ); // invoke-virtual {p0}, Le/h/c/a/a;->b()Lfr/mbs/binary/Octets;
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
/* .line 3 */
} // :cond_0
/* iget-boolean v0, p0, Le/h/c/a/a;->a:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
final String v0 = "00"; // const-string v0, "00"
fr.mbs.binary.Octets .createOctets ( v0 );
int v1 = 2; // const/4 v1, 0x2
(( e.h.c.a.a ) p0 ).b ( ); // invoke-virtual {p0}, Le/h/c/a/a;->b()Lfr/mbs/binary/Octets;
v2 = (( fr.mbs.binary.Octets ) v2 ).size ( ); // invoke-virtual {v2}, Lfr/mbs/binary/Octets;->size()I
java.lang.Integer .valueOf ( v2 );
fr.mbs.binary.Octets .createOctets ( v1,v2 );
(( fr.mbs.binary.Octets ) v0 ).put ( v1 ); // invoke-virtual {v0, v1}, Lfr/mbs/binary/Octets;->put(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
} // :cond_1
int v0 = 1; // const/4 v0, 0x1
/* .line 4 */
(( e.h.c.a.a ) p0 ).b ( ); // invoke-virtual {p0}, Le/h/c/a/a;->b()Lfr/mbs/binary/Octets;
v1 = (( fr.mbs.binary.Octets ) v1 ).size ( ); // invoke-virtual {v1}, Lfr/mbs/binary/Octets;->size()I
java.lang.Integer .valueOf ( v1 );
fr.mbs.binary.Octets .createOctets ( v0,v1 );
} // .end method
public fr.mbs.binary.Octets d ( ) {
/* .locals 3 */
/* .line 5 */
v0 = this.g;
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
/* .line 6 */
} // :cond_0
/* iget-boolean v1, p0, Le/h/c/a/a;->a:Z */
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 7 */
(( e.h.c.a.a ) p0 ).c ( ); // invoke-virtual {p0}, Le/h/c/a/a;->c()Lfr/mbs/binary/Octets;
/* if-nez v0, :cond_1 */
final String v0 = "00"; // const-string v0, "00"
fr.mbs.binary.Octets .createOctets ( v0 );
} // :cond_1
fr.mbs.binary.Octets .empty ( );
} // :goto_0
int v1 = 2; // const/4 v1, 0x2
v2 = this.g;
fr.mbs.binary.Octets .createOctets ( v1,v2 );
(( fr.mbs.binary.Octets ) v0 ).put ( v1 ); // invoke-virtual {v0, v1}, Lfr/mbs/binary/Octets;->put(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
} // :cond_2
int v1 = 1; // const/4 v1, 0x1
/* .line 8 */
fr.mbs.binary.Octets .createOctets ( v1,v0 );
} // .end method
public fr.mbs.binary.Octets e ( ) {
/* .locals 2 */
/* .line 4 */
fr.mbs.binary.Octets .empty ( );
(( e.h.c.a.a ) p0 ).a ( ); // invoke-virtual {p0}, Le/h/c/a/a;->a()Lg/a/a/a;
(( fr.mbs.binary.Octets ) v0 ).put ( v1 ); // invoke-virtual {v0, v1}, Lfr/mbs/binary/Octets;->put(Lg/a/a/a;)Lfr/mbs/binary/Octets;
(( e.h.c.a.a ) p0 ).f ( ); // invoke-virtual {p0}, Le/h/c/a/a;->f()Lg/a/a/a;
(( fr.mbs.binary.Octets ) v0 ).put ( v1 ); // invoke-virtual {v0, v1}, Lfr/mbs/binary/Octets;->put(Lg/a/a/a;)Lfr/mbs/binary/Octets;
(( e.h.c.a.a ) p0 ).h ( ); // invoke-virtual {p0}, Le/h/c/a/a;->h()Lg/a/a/a;
(( fr.mbs.binary.Octets ) v0 ).put ( v1 ); // invoke-virtual {v0, v1}, Lfr/mbs/binary/Octets;->put(Lg/a/a/a;)Lfr/mbs/binary/Octets;
(( e.h.c.a.a ) p0 ).i ( ); // invoke-virtual {p0}, Le/h/c/a/a;->i()Lg/a/a/a;
(( fr.mbs.binary.Octets ) v0 ).put ( v1 ); // invoke-virtual {v0, v1}, Lfr/mbs/binary/Octets;->put(Lg/a/a/a;)Lfr/mbs/binary/Octets;
} // .end method
public Boolean equals ( java.lang.Object p0 ) {
/* .locals 1 */
/* .line 1 */
/* instance-of v0, p1, Le/h/c/a/a; */
if ( v0 != null) { // if-eqz v0, :cond_0
(( e.h.c.a.a ) p0 ).j ( ); // invoke-virtual {p0}, Le/h/c/a/a;->j()Lfr/mbs/binary/Octets;
/* check-cast p1, Le/h/c/a/a; */
(( e.h.c.a.a ) p1 ).j ( ); // invoke-virtual {p1}, Le/h/c/a/a;->j()Lfr/mbs/binary/Octets;
p1 = (( fr.mbs.binary.Octets ) v0 ).equals ( p1 ); // invoke-virtual {v0, p1}, Lfr/mbs/binary/Octets;->equals(Ljava/lang/Object;)Z
if ( p1 != null) { // if-eqz p1, :cond_0
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
public g.a.a.a f ( ) {
/* .locals 1 */
/* .line 2 */
v0 = this.c;
} // .end method
public g.a.a.a g ( ) {
/* .locals 2 */
/* .line 2 */
(( e.h.c.a.a ) p0 ).c ( ); // invoke-virtual {p0}, Le/h/c/a/a;->c()Lfr/mbs/binary/Octets;
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
/* .line 3 */
} // :cond_0
(( e.h.c.a.a ) p0 ).c ( ); // invoke-virtual {p0}, Le/h/c/a/a;->c()Lfr/mbs/binary/Octets;
v0 = (( fr.mbs.binary.Octets ) v0 ).size ( ); // invoke-virtual {v0}, Lfr/mbs/binary/Octets;->size()I
int v1 = 1; // const/4 v1, 0x1
/* if-gt v0, v1, :cond_1 */
/* .line 4 */
(( e.h.c.a.a ) p0 ).c ( ); // invoke-virtual {p0}, Le/h/c/a/a;->c()Lfr/mbs/binary/Octets;
(( fr.mbs.binary.Octets ) v0 ).getFirst ( ); // invoke-virtual {v0}, Lfr/mbs/binary/Octets;->getFirst()Lg/a/a/a;
/* .line 5 */
} // :cond_1
/* new-instance v0, Lcom/orange/nfc/apdu/ExtendedLcException; */
/* invoke-direct {v0}, Lcom/orange/nfc/apdu/ExtendedLcException;-><init>()V */
/* throw v0 */
} // .end method
public g.a.a.a h ( ) {
/* .locals 1 */
/* .line 2 */
v0 = this.d;
} // .end method
public g.a.a.a i ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.e;
} // .end method
public fr.mbs.binary.Octets j ( ) {
/* .locals 2 */
/* .line 1 */
(( e.h.c.a.a ) p0 ).e ( ); // invoke-virtual {p0}, Le/h/c/a/a;->e()Lfr/mbs/binary/Octets;
(( e.h.c.a.a ) p0 ).c ( ); // invoke-virtual {p0}, Le/h/c/a/a;->c()Lfr/mbs/binary/Octets;
(( fr.mbs.binary.Octets ) v0 ).put ( v1 ); // invoke-virtual {v0, v1}, Lfr/mbs/binary/Octets;->put(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
(( e.h.c.a.a ) p0 ).b ( ); // invoke-virtual {p0}, Le/h/c/a/a;->b()Lfr/mbs/binary/Octets;
(( fr.mbs.binary.Octets ) v0 ).put ( v1 ); // invoke-virtual {v0, v1}, Lfr/mbs/binary/Octets;->put(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
(( e.h.c.a.a ) p0 ).d ( ); // invoke-virtual {p0}, Le/h/c/a/a;->d()Lfr/mbs/binary/Octets;
(( fr.mbs.binary.Octets ) v0 ).put ( v1 ); // invoke-virtual {v0, v1}, Lfr/mbs/binary/Octets;->put(Lfr/mbs/binary/Octets;)Lfr/mbs/binary/Octets;
} // .end method
public java.lang.String toString ( ) {
/* .locals 1 */
/* .line 1 */
(( e.h.c.a.a ) p0 ).j ( ); // invoke-virtual {p0}, Le/h/c/a/a;->j()Lfr/mbs/binary/Octets;
(( fr.mbs.binary.Octets ) v0 ).toHexa ( ); // invoke-virtual {v0}, Lfr/mbs/binary/Octets;->toHexa()Ljava/lang/String;
} // .end method
