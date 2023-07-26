public class c.b.q.j2 extends c.b.q.a2 {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final java.lang.ref.WeakReference b;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/ref/WeakReference<", */
	 /* "Landroid/content/Context;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
/* # direct methods */
public c.b.q.j2 ( ) {
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0, p2}, Lc/b/q/a2;-><init>(Landroid/content/res/Resources;)V */
/* .line 2 */
/* new-instance p2, Ljava/lang/ref/WeakReference; */
/* invoke-direct {p2, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V */
this.b = p2;
return;
} // .end method
/* # virtual methods */
public android.graphics.drawable.Drawable getDrawable ( Integer p0 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Landroid/content/res/Resources$NotFoundException; */
/* } */
} // .end annotation
/* .line 1 */
/* invoke-super {p0, p1}, Lc/b/q/a2;->getDrawable(I)Landroid/graphics/drawable/Drawable; */
/* .line 2 */
v1 = this.b;
(( java.lang.ref.WeakReference ) v1 ).get ( ); // invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
/* check-cast v1, Landroid/content/Context; */
if ( v0 != null) { // if-eqz v0, :cond_0
if ( v1 != null) { // if-eqz v1, :cond_0
	 /* .line 3 */
	 c.b.q.z1 .a ( );
	 (( c.b.q.z1 ) v2 ).a ( v1, p1, v0 ); // invoke-virtual {v2, v1, p1, v0}, Lc/b/q/z1;->a(Landroid/content/Context;ILandroid/graphics/drawable/Drawable;)Z
} // :cond_0
} // .end method
