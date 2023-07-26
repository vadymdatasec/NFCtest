public class e.b.a.y.z.i.i implements e.b.a.y.v {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/Object;", */
	 /* "Le/b/a/y/v<", */
	 /* "Le/b/a/y/z/i/f;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* # instance fields */
public final e.b.a.y.v b;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Le/b/a/y/v<", */
/* "Landroid/graphics/Bitmap;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public e.b.a.y.z.i.i ( ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/b/a/y/v<", */
/* "Landroid/graphics/Bitmap;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
e.b.a.e0.r .a ( p1 );
/* check-cast p1, Le/b/a/y/v; */
this.b = p1;
return;
} // .end method
/* # virtual methods */
public e.b.a.y.x.y0 a ( android.content.Context p0, e.b.a.y.x.y0 p1, Integer p2, Integer p3 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroid/content/Context;", */
/* "Le/b/a/y/x/y0<", */
/* "Le/b/a/y/z/i/f;", */
/* ">;II)", */
/* "Le/b/a/y/x/y0<", */
/* "Le/b/a/y/z/i/f;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 1 */
/* check-cast v0, Le/b/a/y/z/i/f; */
/* .line 2 */
e.b.a.d .a ( p1 );
(( e.b.a.d ) v1 ).c ( ); // invoke-virtual {v1}, Le/b/a/d;->c()Le/b/a/y/x/f1/g;
/* .line 3 */
(( e.b.a.y.z.i.f ) v0 ).e ( ); // invoke-virtual {v0}, Le/b/a/y/z/i/f;->e()Landroid/graphics/Bitmap;
/* .line 4 */
/* new-instance v3, Le/b/a/y/z/e/e; */
/* invoke-direct {v3, v2, v1}, Le/b/a/y/z/e/e;-><init>(Landroid/graphics/Bitmap;Le/b/a/y/x/f1/g;)V */
/* .line 5 */
v1 = this.b;
/* .line 6 */
p3 = (( java.lang.Object ) v3 ).equals ( p1 ); // invoke-virtual {v3, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
/* if-nez p3, :cond_0 */
/* .line 7 */
/* .line 8 */
} // :cond_0
/* check-cast p1, Landroid/graphics/Bitmap; */
/* .line 9 */
p3 = this.b;
(( e.b.a.y.z.i.f ) v0 ).a ( p3, p1 ); // invoke-virtual {v0, p3, p1}, Le/b/a/y/z/i/f;->a(Le/b/a/y/v;Landroid/graphics/Bitmap;)V
} // .end method
public void a ( java.security.MessageDigest p0 ) {
/* .locals 1 */
/* .line 10 */
v0 = this.b;
return;
} // .end method
public Boolean equals ( java.lang.Object p0 ) {
/* .locals 1 */
/* .line 1 */
/* instance-of v0, p1, Le/b/a/y/z/i/i; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
/* check-cast p1, Le/b/a/y/z/i/i; */
/* .line 3 */
v0 = this.b;
p1 = this.b;
p1 = (( java.lang.Object ) v0 ).equals ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // .end method
public Integer hashCode ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
v0 = (( java.lang.Object ) v0 ).hashCode ( ); // invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I
} // .end method
