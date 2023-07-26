public class e.b.a.y.z.i.q implements e.b.a.y.t {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/Object;", */
	 /* "Le/b/a/y/t<", */
	 /* "Ljava/io/InputStream;", */
	 /* "Le/b/a/y/z/i/f;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* # instance fields */
public final java.util.List a;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/List<", */
/* "Lcom/bumptech/glide/load/ImageHeaderParser;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public final e.b.a.y.t b;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Le/b/a/y/t<", */
/* "Ljava/nio/ByteBuffer;", */
/* "Le/b/a/y/z/i/f;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public final e.b.a.y.x.f1.b c;
/* # direct methods */
public e.b.a.y.z.i.q ( ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/List<", */
/* "Lcom/bumptech/glide/load/ImageHeaderParser;", */
/* ">;", */
/* "Le/b/a/y/t<", */
/* "Ljava/nio/ByteBuffer;", */
/* "Le/b/a/y/z/i/f;", */
/* ">;", */
/* "Le/b/a/y/x/f1/b;", */
/* ")V" */
/* } */
} // .end annotation
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
this.a = p1;
/* .line 3 */
this.b = p2;
/* .line 4 */
this.c = p3;
return;
} // .end method
public static a ( java.io.InputStream p0 ) {
/* .locals 4 */
/* .line 8 */
/* new-instance v0, Ljava/io/ByteArrayOutputStream; */
/* const/16 v1, 0x4000 */
/* invoke-direct {v0, v1}, Ljava/io/ByteArrayOutputStream;-><init>(I)V */
try { // :try_start_0
/* new-array v1, v1, [B */
/* .line 9 */
} // :goto_0
v2 = (( java.io.InputStream ) p0 ).read ( v1 ); // invoke-virtual {p0, v1}, Ljava/io/InputStream;->read([B)I
int v3 = -1; // const/4 v3, -0x1
/* if-eq v2, v3, :cond_0 */
int v3 = 0; // const/4 v3, 0x0
/* .line 10 */
(( java.io.ByteArrayOutputStream ) v0 ).write ( v1, v3, v2 ); // invoke-virtual {v0, v1, v3, v2}, Ljava/io/ByteArrayOutputStream;->write([BII)V
/* .line 11 */
} // :cond_0
(( java.io.ByteArrayOutputStream ) v0 ).flush ( ); // invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->flush()V
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 12 */
(( java.io.ByteArrayOutputStream ) v0 ).toByteArray ( ); // invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
/* :catch_0 */
/* move-exception p0 */
int v0 = 5; // const/4 v0, 0x5
final String v1 = "StreamGifDecoder"; // const-string v1, "StreamGifDecoder"
/* .line 13 */
v0 = android.util.Log .isLoggable ( v1,v0 );
if ( v0 != null) { // if-eqz v0, :cond_1
final String v0 = "Error reading data from stream"; // const-string v0, "Error reading data from stream"
/* .line 14 */
android.util.Log .w ( v1,v0,p0 );
} // :cond_1
int p0 = 0; // const/4 p0, 0x0
} // .end method
/* # virtual methods */
public e.b.a.y.x.y0 a ( java.io.InputStream p0, Integer p1, Integer p2, Object p3 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/io/InputStream;", */
/* "II", */
/* "Le/b/a/y/r;", */
/* ")", */
/* "Le/b/a/y/x/y0<", */
/* "Le/b/a/y/z/i/f;", */
/* ">;" */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 5 */
e.b.a.y.z.i.q .a ( p1 );
/* if-nez p1, :cond_0 */
int p1 = 0; // const/4 p1, 0x0
/* .line 6 */
} // :cond_0
java.nio.ByteBuffer .wrap ( p1 );
/* .line 7 */
v0 = this.b;
} // .end method
public e.b.a.y.x.y0 a ( java.lang.Object p0, Integer p1, Integer p2, Object p3 ) { //bridge//synthethic
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
/* check-cast p1, Ljava/io/InputStream; */
(( e.b.a.y.z.i.q ) p0 ).a ( p1, p2, p3, p4 ); // invoke-virtual {p0, p1, p2, p3, p4}, Le/b/a/y/z/i/q;->a(Ljava/io/InputStream;IILe/b/a/y/r;)Le/b/a/y/x/y0;
} // .end method
public Boolean a ( java.io.InputStream p0, Object p1 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 3 */
v0 = e.b.a.y.z.i.p.b;
(( e.b.a.y.r ) p2 ).a ( v0 ); // invoke-virtual {p2, v0}, Le/b/a/y/r;->a(Le/b/a/y/q;)Ljava/lang/Object;
/* check-cast p2, Ljava/lang/Boolean; */
p2 = (( java.lang.Boolean ) p2 ).booleanValue ( ); // invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z
/* if-nez p2, :cond_0 */
p2 = this.a;
v0 = this.c;
/* .line 4 */
e.b.a.y.m .b ( p2,p1,v0 );
p2 = com.bumptech.glide.load.ImageHeaderParser$ImageType.GIF;
/* if-ne p1, p2, :cond_0 */
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
public Boolean a ( java.lang.Object p0, Object p1 ) { //bridge//synthethic
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 2 */
/* check-cast p1, Ljava/io/InputStream; */
p1 = (( e.b.a.y.z.i.q ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/b/a/y/z/i/q;->a(Ljava/io/InputStream;Le/b/a/y/r;)Z
} // .end method
