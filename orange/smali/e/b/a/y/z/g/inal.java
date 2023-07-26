public class inal {
	 /* .source "SourceFile" */
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
public final e.b.a.y.x.f1.b b;
/* # direct methods */
public inal ( ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/List<", */
/* "Lcom/bumptech/glide/load/ImageHeaderParser;", */
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
return;
} // .end method
public static e.b.a.y.t a ( java.util.List p0, Object p1 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/List<", */
/* "Lcom/bumptech/glide/load/ImageHeaderParser;", */
/* ">;", */
/* "Le/b/a/y/x/f1/b;", */
/* ")", */
/* "Le/b/a/y/t<", */
/* "Ljava/nio/ByteBuffer;", */
/* "Landroid/graphics/drawable/Drawable;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 1 */
/* new-instance v0, Le/b/a/y/z/g/b; */
/* new-instance v1, Le/b/a/y/z/g/d; */
/* invoke-direct {v1, p0, p1}, Le/b/a/y/z/g/d;-><init>(Ljava/util/List;Le/b/a/y/x/f1/b;)V */
/* invoke-direct {v0, v1}, Le/b/a/y/z/g/b;-><init>(Le/b/a/y/z/g/d;)V */
} // .end method
public static e.b.a.y.t b ( java.util.List p0, Object p1 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/List<", */
/* "Lcom/bumptech/glide/load/ImageHeaderParser;", */
/* ">;", */
/* "Le/b/a/y/x/f1/b;", */
/* ")", */
/* "Le/b/a/y/t<", */
/* "Ljava/io/InputStream;", */
/* "Landroid/graphics/drawable/Drawable;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 1 */
/* new-instance v0, Le/b/a/y/z/g/c; */
/* new-instance v1, Le/b/a/y/z/g/d; */
/* invoke-direct {v1, p0, p1}, Le/b/a/y/z/g/d;-><init>(Ljava/util/List;Le/b/a/y/x/f1/b;)V */
/* invoke-direct {v0, v1}, Le/b/a/y/z/g/c;-><init>(Le/b/a/y/z/g/d;)V */
} // .end method
/* # virtual methods */
public e.b.a.y.x.y0 a ( android.graphics.ImageDecoder$Source p0, Integer p1, Integer p2, Object p3 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroid/graphics/ImageDecoder$Source;", */
/* "II", */
/* "Le/b/a/y/r;", */
/* ")", */
/* "Le/b/a/y/x/y0<", */
/* "Landroid/graphics/drawable/Drawable;", */
/* ">;" */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 5 */
/* new-instance v0, Le/b/a/y/z/b; */
/* invoke-direct {v0, p2, p3, p4}, Le/b/a/y/z/b;-><init>(IILe/b/a/y/r;)V */
/* .line 6 */
android.graphics.ImageDecoder .decodeDrawable ( p1,v0 );
/* .line 7 */
/* instance-of p2, p1, Landroid/graphics/drawable/AnimatedImageDrawable; */
if ( p2 != null) { // if-eqz p2, :cond_0
/* .line 8 */
/* new-instance p2, Le/b/a/y/z/g/a; */
/* check-cast p1, Landroid/graphics/drawable/AnimatedImageDrawable; */
/* invoke-direct {p2, p1}, Le/b/a/y/z/g/a;-><init>(Landroid/graphics/drawable/AnimatedImageDrawable;)V */
/* .line 9 */
} // :cond_0
/* new-instance p2, Ljava/io/IOException; */
/* new-instance p3, Ljava/lang/StringBuilder; */
/* invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V */
final String p4 = "Received unexpected drawable type for animated image, failing: "; // const-string p4, "Received unexpected drawable type for animated image, failing: "
(( java.lang.StringBuilder ) p3 ).append ( p4 ); // invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p3 ).append ( p1 ); // invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p3 ).toString ( ); // invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V */
/* throw p2 */
} // .end method
public final Boolean a ( com.bumptech.glide.load.ImageHeaderParser$ImageType p0 ) {
/* .locals 2 */
/* .line 4 */
v0 = com.bumptech.glide.load.ImageHeaderParser$ImageType.ANIMATED_WEBP;
/* if-eq p1, v0, :cond_1 */
/* const/16 v1, 0x1f */
/* if-lt v0, v1, :cond_0 */
v0 = com.bumptech.glide.load.ImageHeaderParser$ImageType.ANIMATED_AVIF;
/* if-ne p1, v0, :cond_0 */
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :cond_1
} // :goto_0
int p1 = 1; // const/4 p1, 0x1
} // :goto_1
} // .end method
public Boolean a ( java.io.InputStream p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 3 */
v0 = this.a;
v1 = this.b;
e.b.a.y.m .b ( v0,p1,v1 );
p1 = (( e.b.a.y.z.g.d ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/b/a/y/z/g/d;->a(Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;)Z
} // .end method
public Boolean a ( java.nio.ByteBuffer p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 2 */
v0 = this.a;
e.b.a.y.m .a ( v0,p1 );
p1 = (( e.b.a.y.z.g.d ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/b/a/y/z/g/d;->a(Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;)Z
} // .end method
