public class e.b.a.y.z.e.c implements e.b.a.y.u {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/Object;", */
	 /* "Le/b/a/y/u<", */
	 /* "Landroid/graphics/Bitmap;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* # static fields */
public static final e.b.a.y.q b;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Le/b/a/y/q<", */
/* "Ljava/lang/Integer;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public static final e.b.a.y.q c;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Le/b/a/y/q<", */
/* "Landroid/graphics/Bitmap$CompressFormat;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # instance fields */
public final e.b.a.y.x.f1.b a;
/* # direct methods */
public static e.b.a.y.z.e.c ( ) {
/* .locals 2 */
/* const/16 v0, 0x5a */
/* .line 1 */
java.lang.Integer .valueOf ( v0 );
final String v1 = "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality"; // const-string v1, "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality"
e.b.a.y.q .a ( v1,v0 );
final String v0 = "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat"; // const-string v0, "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat"
/* .line 2 */
e.b.a.y.q .a ( v0 );
return;
} // .end method
public e.b.a.y.z.e.c ( ) {
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
this.a = p1;
return;
} // .end method
/* # virtual methods */
public final android.graphics.Bitmap$CompressFormat a ( android.graphics.Bitmap p0, Object p1 ) {
/* .locals 1 */
/* .line 28 */
v0 = e.b.a.y.z.e.c.c;
(( e.b.a.y.r ) p2 ).a ( v0 ); // invoke-virtual {p2, v0}, Le/b/a/y/r;->a(Le/b/a/y/q;)Ljava/lang/Object;
/* check-cast p2, Landroid/graphics/Bitmap$CompressFormat; */
if ( p2 != null) { // if-eqz p2, :cond_0
/* .line 29 */
} // :cond_0
p1 = (( android.graphics.Bitmap ) p1 ).hasAlpha ( ); // invoke-virtual {p1}, Landroid/graphics/Bitmap;->hasAlpha()Z
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 30 */
p1 = android.graphics.Bitmap$CompressFormat.PNG;
/* .line 31 */
} // :cond_1
p1 = android.graphics.Bitmap$CompressFormat.JPEG;
} // .end method
public e.b.a.y.c a ( Object p0 ) {
/* .locals 0 */
/* .line 32 */
p1 = e.b.a.y.c.c;
} // .end method
public Boolean a ( e.b.a.y.x.y0 p0, java.io.File p1, Object p2 ) {
/* .locals 8 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/b/a/y/x/y0<", */
/* "Landroid/graphics/Bitmap;", */
/* ">;", */
/* "Ljava/io/File;", */
/* "Le/b/a/y/r;", */
/* ")Z" */
/* } */
} // .end annotation
final String v0 = "BitmapEncoder"; // const-string v0, "BitmapEncoder"
/* .line 2 */
/* check-cast p1, Landroid/graphics/Bitmap; */
/* .line 3 */
(( e.b.a.y.z.e.c ) p0 ).a ( p1, p3 ); // invoke-virtual {p0, p1, p3}, Le/b/a/y/z/e/c;->a(Landroid/graphics/Bitmap;Le/b/a/y/r;)Landroid/graphics/Bitmap$CompressFormat;
/* .line 4 */
v2 = (( android.graphics.Bitmap ) p1 ).getWidth ( ); // invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I
java.lang.Integer .valueOf ( v2 );
v3 = (( android.graphics.Bitmap ) p1 ).getHeight ( ); // invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I
java.lang.Integer .valueOf ( v3 );
final String v4 = "encode: [%dx%d] %s"; // const-string v4, "encode: [%dx%d] %s"
/* .line 5 */
e.b.a.e0.u.i .a ( v4,v2,v3,v1 );
/* .line 6 */
try { // :try_start_0
e.b.a.e0.m .a ( );
/* move-result-wide v2 */
/* .line 7 */
v4 = e.b.a.y.z.e.c.b;
(( e.b.a.y.r ) p3 ).a ( v4 ); // invoke-virtual {p3, v4}, Le/b/a/y/r;->a(Le/b/a/y/q;)Ljava/lang/Object;
/* check-cast v4, Ljava/lang/Integer; */
v4 = (( java.lang.Integer ) v4 ).intValue ( ); // invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_2 */
int v5 = 0; // const/4 v5, 0x0
int v6 = 0; // const/4 v6, 0x0
/* .line 8 */
try { // :try_start_1
/* new-instance v7, Ljava/io/FileOutputStream; */
/* invoke-direct {v7, p2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V */
/* :try_end_1 */
/* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_1 */
/* .line 9 */
try { // :try_start_2
p2 = this.a;
if ( p2 != null) { // if-eqz p2, :cond_0
/* .line 10 */
/* new-instance p2, Le/b/a/y/w/c; */
v6 = this.a;
/* invoke-direct {p2, v7, v6}, Le/b/a/y/w/c;-><init>(Ljava/io/OutputStream;Le/b/a/y/x/f1/b;)V */
/* :try_end_2 */
/* .catch Ljava/io/IOException; {:try_start_2 ..:try_end_2} :catch_0 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
/* move-object v6, p2 */
} // :cond_0
/* move-object v6, v7 */
/* .line 11 */
} // :goto_0
try { // :try_start_3
(( android.graphics.Bitmap ) p1 ).compress ( v1, v4, v6 ); // invoke-virtual {p1, v1, v4, v6}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
/* .line 12 */
(( java.io.OutputStream ) v6 ).close ( ); // invoke-virtual {v6}, Ljava/io/OutputStream;->close()V
/* :try_end_3 */
/* .catch Ljava/io/IOException; {:try_start_3 ..:try_end_3} :catch_1 */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_1 */
int v5 = 1; // const/4 v5, 0x1
/* .line 13 */
} // :goto_1
try { // :try_start_4
(( java.io.OutputStream ) v6 ).close ( ); // invoke-virtual {v6}, Ljava/io/OutputStream;->close()V
/* :try_end_4 */
/* .catch Ljava/io/IOException; {:try_start_4 ..:try_end_4} :catch_2 */
/* .catchall {:try_start_4 ..:try_end_4} :catchall_2 */
/* :catchall_0 */
/* move-exception p1 */
/* move-object v6, v7 */
/* :catch_0 */
/* move-exception p2 */
/* move-object v6, v7 */
/* :catchall_1 */
/* move-exception p1 */
/* :catch_1 */
/* move-exception p2 */
} // :goto_2
int v4 = 3; // const/4 v4, 0x3
/* .line 14 */
try { // :try_start_5
v4 = android.util.Log .isLoggable ( v0,v4 );
if ( v4 != null) { // if-eqz v4, :cond_1
final String v4 = "Failed to encode Bitmap"; // const-string v4, "Failed to encode Bitmap"
/* .line 15 */
android.util.Log .d ( v0,v4,p2 );
/* :try_end_5 */
/* .catchall {:try_start_5 ..:try_end_5} :catchall_1 */
} // :cond_1
if ( v6 != null) { // if-eqz v6, :cond_2
/* :catch_2 */
} // :cond_2
} // :goto_3
int p2 = 2; // const/4 p2, 0x2
/* .line 16 */
try { // :try_start_6
p2 = android.util.Log .isLoggable ( v0,p2 );
if ( p2 != null) { // if-eqz p2, :cond_3
/* .line 17 */
/* new-instance p2, Ljava/lang/StringBuilder; */
/* invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "Compressed with type: "; // const-string v4, "Compressed with type: "
(( java.lang.StringBuilder ) p2 ).append ( v4 ); // invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).append ( v1 ); // invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v1 = " of size "; // const-string v1, " of size "
(( java.lang.StringBuilder ) p2 ).append ( v1 ); // invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 18 */
v1 = e.b.a.e0.t .a ( p1 );
(( java.lang.StringBuilder ) p2 ).append ( v1 ); // invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = " in "; // const-string v1, " in "
(( java.lang.StringBuilder ) p2 ).append ( v1 ); // invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 19 */
e.b.a.e0.m .a ( v2,v3 );
/* move-result-wide v1 */
(( java.lang.StringBuilder ) p2 ).append ( v1, v2 ); // invoke-virtual {p2, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;
final String v1 = ", options format: "; // const-string v1, ", options format: "
(( java.lang.StringBuilder ) p2 ).append ( v1 ); // invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = e.b.a.y.z.e.c.c;
/* .line 20 */
(( e.b.a.y.r ) p3 ).a ( v1 ); // invoke-virtual {p3, v1}, Le/b/a/y/r;->a(Le/b/a/y/q;)Ljava/lang/Object;
(( java.lang.StringBuilder ) p2 ).append ( p3 ); // invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String p3 = ", hasAlpha: "; // const-string p3, ", hasAlpha: "
(( java.lang.StringBuilder ) p2 ).append ( p3 ); // invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 21 */
p1 = (( android.graphics.Bitmap ) p1 ).hasAlpha ( ); // invoke-virtual {p1}, Landroid/graphics/Bitmap;->hasAlpha()Z
(( java.lang.StringBuilder ) p2 ).append ( p1 ); // invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 22 */
android.util.Log .v ( v0,p1 );
/* :try_end_6 */
/* .catchall {:try_start_6 ..:try_end_6} :catchall_2 */
/* .line 23 */
} // :cond_3
e.b.a.e0.u.i .a ( );
} // :goto_4
if ( v6 != null) { // if-eqz v6, :cond_4
/* .line 24 */
try { // :try_start_7
(( java.io.OutputStream ) v6 ).close ( ); // invoke-virtual {v6}, Ljava/io/OutputStream;->close()V
/* :try_end_7 */
/* .catch Ljava/io/IOException; {:try_start_7 ..:try_end_7} :catch_3 */
/* .catchall {:try_start_7 ..:try_end_7} :catchall_2 */
/* .line 25 */
/* :catch_3 */
} // :cond_4
try { // :try_start_8
/* throw p1 */
/* :try_end_8 */
/* .catchall {:try_start_8 ..:try_end_8} :catchall_2 */
/* :catchall_2 */
/* move-exception p1 */
/* .line 26 */
e.b.a.e0.u.i .a ( );
/* .line 27 */
/* throw p1 */
} // .end method
public Boolean a ( java.lang.Object p0, java.io.File p1, Object p2 ) { //bridge//synthethic
/* .locals 0 */
/* .line 1 */
/* check-cast p1, Le/b/a/y/x/y0; */
p1 = (( e.b.a.y.z.e.c ) p0 ).a ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Le/b/a/y/z/e/c;->a(Le/b/a/y/x/y0;Ljava/io/File;Le/b/a/y/r;)Z
} // .end method
