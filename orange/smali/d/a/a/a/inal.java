public class inal implements e.b.a.y.z.j.e {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/Object;", */
	 /* "Le/b/a/y/z/j/e<", */
	 /* "Le/c/a/a2;", */
	 /* "Landroid/graphics/drawable/Drawable;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* # instance fields */
public final d.a.a.a.a a;
public final android.content.Context b;
/* # direct methods */
public inal ( ) {
	 /* .locals 1 */
	 final String v0 = "context"; // const-string v0, "context"
	 i.h.c.k .d ( p1,v0 );
	 /* .line 1 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 this.b = p1;
	 /* .line 2 */
	 /* new-instance p1, Ld/a/a/a/a; */
	 /* invoke-direct {p1}, Ld/a/a/a/a;-><init>()V */
	 this.a = p1;
	 return;
} // .end method
/* # virtual methods */
public e.b.a.y.x.y0 a ( e.b.a.y.x.y0 p0, Object p1 ) {
	 /* .locals 2 */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "(", */
	 /* "Le/b/a/y/x/y0<", */
	 /* "Le/c/a/a2;", */
	 /* ">;", */
	 /* "Le/b/a/y/r;", */
	 /* ")", */
	 /* "Le/b/a/y/x/y0<", */
	 /* "Landroid/graphics/drawable/Drawable;", */
	 /* ">;" */
	 /* } */
} // .end annotation
final String v0 = "toTranscode"; // const-string v0, "toTranscode"
i.h.c.k .d ( p1,v0 );
final String v0 = "options"; // const-string v0, "options"
i.h.c.k .d ( p2,v0 );
/* .line 1 */
v0 = this.a;
(( d.a.a.a.a ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Ld/a/a/a/a;->a(Le/b/a/y/x/y0;Le/b/a/y/r;)Le/b/a/y/x/y0;
/* check-cast p1, Landroid/graphics/Bitmap; */
/* .line 2 */
/* new-instance p2, Le/b/a/y/z/c; */
/* new-instance v0, Landroid/graphics/drawable/BitmapDrawable; */
v1 = this.b;
(( android.content.Context ) v1 ).getResources ( ); // invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
/* invoke-direct {v0, v1, p1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V */
/* invoke-direct {p2, v0}, Le/b/a/y/z/c;-><init>(Ljava/lang/Object;)V */
} // .end method
