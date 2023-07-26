public class e.b.a.y.z.e.a0 implements e.b.a.y.v {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/Object;", */
	 /* "Le/b/a/y/v<", */
	 /* "Landroid/graphics/drawable/Drawable;", */
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
public final Boolean c;
/* # direct methods */
public e.b.a.y.z.e.a0 ( ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/b/a/y/v<", */
/* "Landroid/graphics/Bitmap;", */
/* ">;Z)V" */
/* } */
} // .end annotation
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
this.b = p1;
/* .line 3 */
/* iput-boolean p2, p0, Le/b/a/y/z/e/a0;->c:Z */
return;
} // .end method
/* # virtual methods */
public e.b.a.y.v a ( ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Le/b/a/y/v<", */
/* "Landroid/graphics/drawable/BitmapDrawable;", */
/* ">;" */
/* } */
} // .end annotation
} // .end method
public final e.b.a.y.x.y0 a ( android.content.Context p0, e.b.a.y.x.y0 p1 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroid/content/Context;", */
/* "Le/b/a/y/x/y0<", */
/* "Landroid/graphics/Bitmap;", */
/* ">;)", */
/* "Le/b/a/y/x/y0<", */
/* "Landroid/graphics/drawable/Drawable;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 11 */
(( android.content.Context ) p1 ).getResources ( ); // invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
e.b.a.y.z.e.j0 .a ( p1,p2 );
} // .end method
public e.b.a.y.x.y0 a ( android.content.Context p0, e.b.a.y.x.y0 p1, Integer p2, Integer p3 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroid/content/Context;", */
/* "Le/b/a/y/x/y0<", */
/* "Landroid/graphics/drawable/Drawable;", */
/* ">;II)", */
/* "Le/b/a/y/x/y0<", */
/* "Landroid/graphics/drawable/Drawable;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 1 */
e.b.a.d .a ( p1 );
(( e.b.a.d ) v0 ).c ( ); // invoke-virtual {v0}, Le/b/a/d;->c()Le/b/a/y/x/f1/g;
/* .line 2 */
/* check-cast v1, Landroid/graphics/drawable/Drawable; */
/* .line 3 */
e.b.a.y.z.e.z .a ( v0,v1,p3,p4 );
/* if-nez v0, :cond_1 */
/* .line 4 */
/* iget-boolean p1, p0, Le/b/a/y/z/e/a0;->c:Z */
/* if-nez p1, :cond_0 */
/* .line 5 */
} // :cond_0
/* new-instance p1, Ljava/lang/IllegalArgumentException; */
/* new-instance p2, Ljava/lang/StringBuilder; */
/* invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V */
final String p3 = "Unable to convert "; // const-string p3, "Unable to convert "
(( java.lang.StringBuilder ) p2 ).append ( p3 ); // invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).append ( v1 ); // invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String p3 = " to a Bitmap"; // const-string p3, " to a Bitmap"
(( java.lang.StringBuilder ) p2 ).append ( p3 ); // invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
/* .line 6 */
} // :cond_1
v1 = this.b;
/* .line 7 */
/* .line 8 */
p4 = (( java.lang.Object ) p3 ).equals ( v0 ); // invoke-virtual {p3, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
if ( p4 != null) { // if-eqz p4, :cond_2
/* .line 9 */
/* .line 10 */
} // :cond_2
(( e.b.a.y.z.e.a0 ) p0 ).a ( p1, p3 ); // invoke-virtual {p0, p1, p3}, Le/b/a/y/z/e/a0;->a(Landroid/content/Context;Le/b/a/y/x/y0;)Le/b/a/y/x/y0;
} // .end method
public void a ( java.security.MessageDigest p0 ) {
/* .locals 1 */
/* .line 12 */
v0 = this.b;
return;
} // .end method
public Boolean equals ( java.lang.Object p0 ) {
/* .locals 1 */
/* .line 1 */
/* instance-of v0, p1, Le/b/a/y/z/e/a0; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
/* check-cast p1, Le/b/a/y/z/e/a0; */
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
