public class e.b.a.y.z.e.b implements e.b.a.y.u {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/Object;", */
	 /* "Le/b/a/y/u<", */
	 /* "Landroid/graphics/drawable/BitmapDrawable;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* # instance fields */
public final e.b.a.y.x.f1.g a;
public final e.b.a.y.u b;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Le/b/a/y/u<", */
/* "Landroid/graphics/Bitmap;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public e.b.a.y.z.e.b ( ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/b/a/y/x/f1/g;", */
/* "Le/b/a/y/u<", */
/* "Landroid/graphics/Bitmap;", */
/* ">;)V" */
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
/* # virtual methods */
public e.b.a.y.c a ( Object p0 ) {
/* .locals 1 */
/* .line 3 */
v0 = this.b;
} // .end method
public Boolean a ( e.b.a.y.x.y0 p0, java.io.File p1, Object p2 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/b/a/y/x/y0<", */
/* "Landroid/graphics/drawable/BitmapDrawable;", */
/* ">;", */
/* "Ljava/io/File;", */
/* "Le/b/a/y/r;", */
/* ")Z" */
/* } */
} // .end annotation
/* .line 2 */
v0 = this.b;
/* new-instance v1, Le/b/a/y/z/e/e; */
/* check-cast p1, Landroid/graphics/drawable/BitmapDrawable; */
(( android.graphics.drawable.BitmapDrawable ) p1 ).getBitmap ( ); // invoke-virtual {p1}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;
v2 = this.a;
p1 = /* invoke-direct {v1, p1, v2}, Le/b/a/y/z/e/e;-><init>(Landroid/graphics/Bitmap;Le/b/a/y/x/f1/g;)V */
} // .end method
public Boolean a ( java.lang.Object p0, java.io.File p1, Object p2 ) { //bridge//synthethic
/* .locals 0 */
/* .line 1 */
/* check-cast p1, Le/b/a/y/x/y0; */
p1 = (( e.b.a.y.z.e.b ) p0 ).a ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Le/b/a/y/z/e/b;->a(Le/b/a/y/x/y0;Ljava/io/File;Le/b/a/y/r;)Z
} // .end method
