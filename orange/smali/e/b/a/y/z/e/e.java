public class e.b.a.y.z.e.e implements e.b.a.y.x.y0 implements e.b.a.y.x.t0 {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/Object;", */
	 /* "Le/b/a/y/x/y0<", */
	 /* "Landroid/graphics/Bitmap;", */
	 /* ">;", */
	 /* "Le/b/a/y/x/t0;" */
	 /* } */
} // .end annotation
/* # instance fields */
public final android.graphics.Bitmap b;
public final e.b.a.y.x.f1.g c;
/* # direct methods */
public e.b.a.y.z.e.e ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 final String v0 = "Bitmap must not be null"; // const-string v0, "Bitmap must not be null"
	 /* .line 2 */
	 e.b.a.e0.r .a ( p1,v0 );
	 /* check-cast p1, Landroid/graphics/Bitmap; */
	 this.b = p1;
	 final String p1 = "BitmapPool must not be null"; // const-string p1, "BitmapPool must not be null"
	 /* .line 3 */
	 e.b.a.e0.r .a ( p2,p1 );
	 /* check-cast p2, Le/b/a/y/x/f1/g; */
	 this.c = p2;
	 return;
} // .end method
public static e.b.a.y.z.e.e a ( android.graphics.Bitmap p0, Object p1 ) {
	 /* .locals 1 */
	 /* if-nez p0, :cond_0 */
	 int p0 = 0; // const/4 p0, 0x0
	 /* .line 1 */
} // :cond_0
/* new-instance v0, Le/b/a/y/z/e/e; */
/* invoke-direct {v0, p0, p1}, Le/b/a/y/z/e/e;-><init>(Landroid/graphics/Bitmap;Le/b/a/y/x/f1/g;)V */
} // .end method
/* # virtual methods */
public void a ( ) {
/* .locals 1 */
/* .line 2 */
v0 = this.b;
(( android.graphics.Bitmap ) v0 ).prepareToDraw ( ); // invoke-virtual {v0}, Landroid/graphics/Bitmap;->prepareToDraw()V
return;
} // .end method
public Integer b ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
v0 = e.b.a.e0.t .a ( v0 );
} // .end method
public java.lang.Class c ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/lang/Class<", */
/* "Landroid/graphics/Bitmap;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 1 */
/* const-class v0, Landroid/graphics/Bitmap; */
} // .end method
public void d ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.c;
v1 = this.b;
return;
} // .end method
public android.graphics.Bitmap get ( ) {
/* .locals 1 */
/* .line 2 */
v0 = this.b;
} // .end method
public java.lang.Object get ( ) { //bridge//synthethic
/* .locals 1 */
/* .line 1 */
(( e.b.a.y.z.e.e ) p0 ).get ( ); // invoke-virtual {p0}, Le/b/a/y/z/e/e;->get()Landroid/graphics/Bitmap;
} // .end method
