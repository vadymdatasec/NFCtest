public abstract class m.b.h.c implements m.b.a {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "<T::", */
	 /* "Lm/b/a;", */
	 /* ">", */
	 /* "Ljava/lang/Object;", */
	 /* "Lm/b/a<", */
	 /* "TT;>;" */
	 /* } */
} // .end annotation
/* # instance fields */
public java.net.URL a;
public m.b.c b;
public java.util.Map c;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Map<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public java.util.Map d;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Map<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public m.b.h.c ( ) {
/* .locals 1 */
/* .line 2 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 3 */
/* new-instance v0, Ljava/util/LinkedHashMap; */
/* invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V */
this.c = v0;
/* .line 4 */
/* new-instance v0, Ljava/util/LinkedHashMap; */
/* invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V */
this.d = v0;
return;
} // .end method
public m.b.h.c ( ) { //synthethic
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0}, Lm/b/h/c;-><init>()V */
return;
} // .end method
public static Boolean a ( Object[] p0 ) {
/* .locals 8 */
/* .line 5 */
/* array-length v0, p0 */
int v1 = 3; // const/4 v1, 0x3
int v2 = 0; // const/4 v2, 0x0
int v3 = 1; // const/4 v3, 0x1
/* if-lt v0, v1, :cond_2 */
/* aget-byte v0, p0, v2 */
/* and-int/lit16 v0, v0, 0xff */
/* const/16 v4, 0xef */
/* if-ne v0, v4, :cond_2 */
/* aget-byte v0, p0, v3 */
/* and-int/lit16 v0, v0, 0xff */
/* const/16 v4, 0xbb */
/* if-ne v0, v4, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
int v4 = 2; // const/4 v4, 0x2
/* aget-byte v4, p0, v4 */
/* and-int/lit16 v4, v4, 0xff */
/* const/16 v5, 0xbf */
/* if-ne v4, v5, :cond_1 */
int v4 = 1; // const/4 v4, 0x1
} // :cond_1
int v4 = 0; // const/4 v4, 0x0
} // :goto_1
/* and-int/2addr v0, v4 */
if ( v0 != null) { // if-eqz v0, :cond_2
} // :cond_2
int v1 = 0; // const/4 v1, 0x0
/* .line 6 */
} // :goto_2
/* array-length v0, p0 */
} // :goto_3
/* if-ge v1, v0, :cond_9 */
/* .line 7 */
/* aget-byte v4, p0, v1 */
/* and-int/lit16 v5, v4, 0x80 */
/* if-nez v5, :cond_3 */
} // :cond_3
/* and-int/lit16 v5, v4, 0xe0 */
/* const/16 v6, 0xc0 */
/* if-ne v5, v6, :cond_4 */
/* add-int/lit8 v4, v1, 0x1 */
} // :cond_4
/* and-int/lit16 v5, v4, 0xf0 */
/* const/16 v7, 0xe0 */
/* if-ne v5, v7, :cond_5 */
/* add-int/lit8 v4, v1, 0x2 */
} // :cond_5
/* and-int/lit16 v4, v4, 0xf8 */
/* const/16 v5, 0xf0 */
/* if-ne v4, v5, :cond_8 */
/* add-int/lit8 v4, v1, 0x3 */
} // :cond_6
} // :goto_4
/* if-ge v1, v4, :cond_7 */
/* add-int/lit8 v1, v1, 0x1 */
/* .line 8 */
/* aget-byte v5, p0, v1 */
/* and-int/2addr v5, v6 */
/* const/16 v7, 0x80 */
/* if-eq v5, v7, :cond_6 */
} // :cond_7
} // :goto_5
/* add-int/2addr v1, v3 */
} // :cond_8
} // :cond_9
} // .end method
public static java.lang.String g ( java.lang.String p0 ) {
/* .locals 3 */
try { // :try_start_0
final String v0 = "ISO-8859-1"; // const-string v0, "ISO-8859-1"
/* .line 1 */
(( java.lang.String ) p0 ).getBytes ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
/* .line 2 */
v1 = m.b.h.c .a ( v0 );
/* if-nez v1, :cond_0 */
/* .line 3 */
} // :cond_0
/* new-instance v1, Ljava/lang/String; */
final String v2 = "UTF-8"; // const-string v2, "UTF-8"
/* invoke-direct {v1, v0, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V */
/* :try_end_0 */
/* .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
} // .end method
/* # virtual methods */
public m.b.a a ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ")TT;" */
/* } */
} // .end annotation
final String v0 = "Cookie name must not be empty"; // const-string v0, "Cookie name must not be empty"
/* .line 11 */
m.b.h.j .a ( p1,v0 );
final String v0 = "Cookie value must not be null"; // const-string v0, "Cookie value must not be null"
/* .line 12 */
m.b.h.j .a ( p2,v0 );
/* .line 13 */
v0 = this.d;
} // .end method
public m.b.a a ( java.net.URL p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/net/URL;", */
/* ")TT;" */
/* } */
} // .end annotation
final String v0 = "URL must not be null"; // const-string v0, "URL must not be null"
/* .line 1 */
m.b.h.j .a ( p1,v0 );
/* .line 2 */
this.a = p1;
} // .end method
public m.b.a a ( Object p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Lm/b/c;", */
/* ")TT;" */
/* } */
} // .end annotation
final String v0 = "Method must not be null"; // const-string v0, "Method must not be null"
/* .line 3 */
m.b.h.j .a ( p1,v0 );
/* .line 4 */
this.b = p1;
} // .end method
public Boolean a ( java.lang.String p0 ) {
/* .locals 1 */
final String v0 = "Header name must not be empty"; // const-string v0, "Header name must not be empty"
/* .line 9 */
m.b.h.j .a ( p1,v0 );
/* .line 10 */
(( m.b.h.c ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Lm/b/h/c;->b(Ljava/lang/String;)Ljava/lang/String;
if ( p1 != null) { // if-eqz p1, :cond_0
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
public final java.lang.String b ( java.lang.String p0 ) {
/* .locals 2 */
final String v0 = "Header name must not be null"; // const-string v0, "Header name must not be null"
/* .line 5 */
m.b.h.j .a ( p1,v0 );
/* .line 6 */
v0 = this.c;
/* check-cast v0, Ljava/lang/String; */
/* if-nez v0, :cond_0 */
/* .line 7 */
v0 = this.c;
(( java.lang.String ) p1 ).toLowerCase ( ); // invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
/* check-cast v0, Ljava/lang/String; */
} // :cond_0
/* if-nez v0, :cond_1 */
/* .line 8 */
(( m.b.h.c ) p0 ).f ( p1 ); // invoke-virtual {p0, p1}, Lm/b/h/c;->f(Ljava/lang/String;)Ljava/util/Map$Entry;
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 9 */
/* move-object v0, p1 */
/* check-cast v0, Ljava/lang/String; */
} // :cond_1
} // .end method
public java.util.Map b ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/Map<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 10 */
v0 = this.d;
} // .end method
public m.b.a b ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ")TT;" */
/* } */
} // .end annotation
final String v0 = "Header name must not be empty"; // const-string v0, "Header name must not be empty"
/* .line 1 */
m.b.h.j .a ( p1,v0 );
final String v0 = "Header value must not be null"; // const-string v0, "Header value must not be null"
/* .line 2 */
m.b.h.j .a ( p2,v0 );
/* .line 3 */
(( m.b.h.c ) p0 ).e ( p1 ); // invoke-virtual {p0, p1}, Lm/b/h/c;->e(Ljava/lang/String;)Lm/b/a;
/* .line 4 */
v0 = this.c;
} // .end method
public Boolean c ( java.lang.String p0 ) {
/* .locals 1 */
final String v0 = "Cookie name must not be empty"; // const-string v0, "Cookie name must not be empty"
/* .line 2 */
m.b.h.j .a ( p1,v0 );
/* .line 3 */
p1 = v0 = this.d;
} // .end method
public Boolean c ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 1 */
/* .line 1 */
v0 = (( m.b.h.c ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lm/b/h/c;->a(Ljava/lang/String;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
(( m.b.h.c ) p0 ).d ( p1 ); // invoke-virtual {p0, p1}, Lm/b/h/c;->d(Ljava/lang/String;)Ljava/lang/String;
p1 = (( java.lang.String ) p1 ).equalsIgnoreCase ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( p1 != null) { // if-eqz p1, :cond_0
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
public java.lang.String d ( java.lang.String p0 ) {
/* .locals 1 */
final String v0 = "Header name must not be null"; // const-string v0, "Header name must not be null"
/* .line 2 */
m.b.h.j .a ( p1,v0 );
/* .line 3 */
(( m.b.h.c ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Lm/b/h/c;->b(Ljava/lang/String;)Ljava/lang/String;
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 4 */
m.b.h.c .g ( p1 );
} // :cond_0
} // .end method
public java.net.URL d ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
} // .end method
public m.b.a e ( java.lang.String p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/String;", */
/* ")TT;" */
/* } */
} // .end annotation
final String v0 = "Header name must not be empty"; // const-string v0, "Header name must not be empty"
/* .line 2 */
m.b.h.j .a ( p1,v0 );
/* .line 3 */
(( m.b.h.c ) p0 ).f ( p1 ); // invoke-virtual {p0, p1}, Lm/b/h/c;->f(Ljava/lang/String;)Ljava/util/Map$Entry;
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 4 */
v0 = this.c;
} // :cond_0
} // .end method
public m.b.c e ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
} // .end method
public final java.util.Map$Entry f ( java.lang.String p0 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/String;", */
/* ")", */
/* "Ljava/util/Map$Entry<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 1 */
(( java.lang.String ) p1 ).toLowerCase ( ); // invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
/* .line 2 */
v0 = this.c;
v1 = } // :cond_0
if ( v1 != null) { // if-eqz v1, :cond_1
/* check-cast v1, Ljava/util/Map$Entry; */
/* .line 3 */
/* check-cast v2, Ljava/lang/String; */
(( java.lang.String ) v2 ).toLowerCase ( ); // invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
v2 = (( java.lang.String ) v2 ).equals ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v2 != null) { // if-eqz v2, :cond_0
} // :cond_1
int p1 = 0; // const/4 p1, 0x0
} // .end method
public java.util.Map g ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/Map<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 4 */
v0 = this.c;
} // .end method
