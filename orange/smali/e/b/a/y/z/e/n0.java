public class e.b.a.y.z.e.n0 implements e.b.a.y.t {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/Object;", */
	 /* "Le/b/a/y/t<", */
	 /* "Landroid/net/Uri;", */
	 /* "Landroid/graphics/Bitmap;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* # instance fields */
public final e.b.a.y.z.g.h a;
public final e.b.a.y.x.f1.g b;
/* # direct methods */
public e.b.a.y.z.e.n0 ( ) {
	 /* .locals 0 */
	 /* .line 1 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* .line 2 */
	 this.a = p1;
	 /* .line 3 */
	 this.b = p2;
	 return;
} // .end method
/* # virtual methods */
public e.b.a.y.x.y0 a ( android.net.Uri p0, Integer p1, Integer p2, Object p3 ) {
	 /* .locals 1 */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "(", */
	 /* "Landroid/net/Uri;", */
	 /* "II", */
	 /* "Le/b/a/y/r;", */
	 /* ")", */
	 /* "Le/b/a/y/x/y0<", */
	 /* "Landroid/graphics/Bitmap;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* .line 4 */
v0 = this.a;
(( e.b.a.y.z.g.h ) v0 ).a ( p1, p2, p3, p4 ); // invoke-virtual {v0, p1, p2, p3, p4}, Le/b/a/y/z/g/h;->a(Landroid/net/Uri;IILe/b/a/y/r;)Le/b/a/y/x/y0;
/* if-nez p1, :cond_0 */
int p1 = 0; // const/4 p1, 0x0
/* .line 5 */
} // :cond_0
/* check-cast p1, Landroid/graphics/drawable/Drawable; */
/* .line 6 */
p4 = this.b;
e.b.a.y.z.e.z .a ( p4,p1,p2,p3 );
} // .end method
public e.b.a.y.x.y0 a ( java.lang.Object p0, Integer p1, Integer p2, Object p3 ) { //bridge//synthethic
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
/* check-cast p1, Landroid/net/Uri; */
(( e.b.a.y.z.e.n0 ) p0 ).a ( p1, p2, p3, p4 ); // invoke-virtual {p0, p1, p2, p3, p4}, Le/b/a/y/z/e/n0;->a(Landroid/net/Uri;IILe/b/a/y/r;)Le/b/a/y/x/y0;
} // .end method
public Boolean a ( android.net.Uri p0, Object p1 ) {
/* .locals 0 */
/* .line 3 */
(( android.net.Uri ) p1 ).getScheme ( ); // invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;
final String p2 = "android.resource"; // const-string p2, "android.resource"
p1 = (( java.lang.String ) p2 ).equals ( p1 ); // invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
} // .end method
public Boolean a ( java.lang.Object p0, Object p1 ) { //bridge//synthethic
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 2 */
/* check-cast p1, Landroid/net/Uri; */
p1 = (( e.b.a.y.z.e.n0 ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/b/a/y/z/e/n0;->a(Landroid/net/Uri;Le/b/a/y/r;)Z
} // .end method
