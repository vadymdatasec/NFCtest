public class e.b.a.y.z.j.a implements e.b.a.y.z.j.e {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/Object;", */
	 /* "Le/b/a/y/z/j/e<", */
	 /* "Landroid/graphics/Bitmap;", */
	 /* "[B>;" */
	 /* } */
} // .end annotation
/* # instance fields */
public final android.graphics.Bitmap$CompressFormat a;
public final Integer b;
/* # direct methods */
public e.b.a.y.z.j.a ( ) {
	 /* .locals 2 */
	 /* .line 1 */
	 v0 = android.graphics.Bitmap$CompressFormat.JPEG;
	 /* const/16 v1, 0x64 */
	 /* invoke-direct {p0, v0, v1}, Le/b/a/y/z/j/a;-><init>(Landroid/graphics/Bitmap$CompressFormat;I)V */
	 return;
} // .end method
public e.b.a.y.z.j.a ( ) {
	 /* .locals 0 */
	 /* .line 2 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* .line 3 */
	 this.a = p1;
	 /* .line 4 */
	 /* iput p2, p0, Le/b/a/y/z/j/a;->b:I */
	 return;
} // .end method
/* # virtual methods */
public e.b.a.y.x.y0 a ( e.b.a.y.x.y0 p0, Object p1 ) {
	 /* .locals 3 */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "(", */
	 /* "Le/b/a/y/x/y0<", */
	 /* "Landroid/graphics/Bitmap;", */
	 /* ">;", */
	 /* "Le/b/a/y/r;", */
	 /* ")", */
	 /* "Le/b/a/y/x/y0<", */
	 /* "[B>;" */
	 /* } */
} // .end annotation
/* .line 1 */
/* new-instance p2, Ljava/io/ByteArrayOutputStream; */
/* invoke-direct {p2}, Ljava/io/ByteArrayOutputStream;-><init>()V */
/* .line 2 */
/* check-cast v0, Landroid/graphics/Bitmap; */
v1 = this.a;
/* iget v2, p0, Le/b/a/y/z/j/a;->b:I */
(( android.graphics.Bitmap ) v0 ).compress ( v1, v2, p2 ); // invoke-virtual {v0, v1, v2, p2}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
/* .line 3 */
/* .line 4 */
/* new-instance p1, Le/b/a/y/z/f/c; */
(( java.io.ByteArrayOutputStream ) p2 ).toByteArray ( ); // invoke-virtual {p2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
/* invoke-direct {p1, p2}, Le/b/a/y/z/f/c;-><init>([B)V */
} // .end method
