public class inal extends java.lang.Enum {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/Enum<", */
	 /* "Le/h/b/a/p/i;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* # static fields */
public static final e.h.b.a.p.i e;
public static final e.h.b.a.p.i f; //synthetic
/* # instance fields */
public final java.lang.String b;
public final java.lang.String c;
public final Integer d;
/* # direct methods */
public static inal ( ) {
	 /* .locals 8 */
	 /* .line 1 */
	 /* new-instance v7, Le/h/b/a/p/i; */
	 final String v1 = "RFIDEAS"; // const-string v1, "RFIDEAS"
	 int v2 = 0; // const/4 v2, 0x0
	 final String v3 = "RFID"; // const-string v3, "RFID"
	 final String v4 = "rf IDEAS"; // const-string v4, "rf IDEAS"
	 final String v5 = "Acc\u00e8s de test"; // const-string v5, "Acc\u00e8s de test"
	 /* const v6, 0x7f0700d3 */
	 /* move-object v0, v7 */
	 /* invoke-direct/range {v0 ..v6}, Le/h/b/a/p/i;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V */
	 int v0 = 1; // const/4 v0, 0x1
	 /* new-array v0, v0, [Le/h/b/a/p/i; */
	 int v1 = 0; // const/4 v1, 0x0
	 /* aput-object v7, v0, v1 */
	 /* .line 2 */
	 return;
} // .end method
public inal ( ) {
	 /* .locals 0 */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "(", */
	 /* "Ljava/lang/String;", */
	 /* "Ljava/lang/String;", */
	 /* "Ljava/lang/String;", */
	 /* "I)V" */
	 /* } */
} // .end annotation
/* .line 1 */
/* invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V */
/* .line 2 */
this.b = p3;
/* .line 3 */
this.c = p4;
/* .line 4 */
/* iput p6, p0, Le/h/b/a/p/i;->d:I */
return;
} // .end method
public static e.h.b.a.p.i a ( java.lang.String p0 ) {
/* .locals 5 */
/* .line 1 */
e.h.b.a.p.i .values ( );
/* array-length v1, v0 */
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v2, v1, :cond_1 */
/* aget-object v3, v0, v2 */
/* .line 2 */
(( e.h.b.a.p.i ) v3 ).b ( ); // invoke-virtual {v3}, Le/h/b/a/p/i;->b()Ljava/lang/String;
v4 = (( java.lang.String ) v4 ).equals ( p0 ); // invoke-virtual {v4, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v4 != null) { // if-eqz v4, :cond_0
} // :cond_0
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_1
int p0 = 0; // const/4 p0, 0x0
} // .end method
public static Boolean b ( java.lang.String p0 ) {
/* .locals 0 */
if ( p0 != null) { // if-eqz p0, :cond_0
/* .line 1 */
e.h.b.a.p.i .a ( p0 );
if ( p0 != null) { // if-eqz p0, :cond_0
int p0 = 1; // const/4 p0, 0x1
} // :cond_0
int p0 = 0; // const/4 p0, 0x0
} // :goto_0
} // .end method
public static e.h.b.a.p.i c ( java.lang.String p0 ) {
/* .locals 0 */
/* .line 1 */
e.h.b.a.p.i .a ( p0 );
} // .end method
public static e.h.b.a.p.i valueOf ( java.lang.String p0 ) {
/* .locals 1 */
/* .line 1 */
/* const-class v0, Le/h/b/a/p/i; */
java.lang.Enum .valueOf ( v0,p0 );
/* check-cast p0, Le/h/b/a/p/i; */
} // .end method
public static e.h.b.a.p.i values ( ) {
/* .locals 1 */
/* .line 1 */
v0 = e.h.b.a.p.i.f;
(( e.h.b.a.p.i ) v0 ).clone ( ); // invoke-virtual {v0}, [Le/h/b/a/p/i;->clone()Ljava/lang/Object;
/* check-cast v0, [Le/h/b/a/p/i; */
} // .end method
/* # virtual methods */
public Integer a ( ) {
/* .locals 1 */
/* .line 3 */
/* iget v0, p0, Le/h/b/a/p/i;->d:I */
} // .end method
public java.lang.String b ( ) {
/* .locals 1 */
/* .line 2 */
v0 = this.b;
} // .end method
public java.lang.String c ( ) {
/* .locals 1 */
/* .line 2 */
v0 = this.c;
} // .end method
