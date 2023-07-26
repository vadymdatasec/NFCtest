public class c.b.q.u2 extends android.content.res.Resources {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static Boolean b;
	 /* # instance fields */
	 public final java.lang.ref.WeakReference a;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/ref/WeakReference<", */
	 /* "Landroid/content/Context;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
/* # direct methods */
public static c.b.q.u2 ( ) {
/* .locals 0 */
return;
} // .end method
public c.b.q.u2 ( ) {
/* .locals 2 */
/* .line 1 */
(( android.content.res.Resources ) p2 ).getAssets ( ); // invoke-virtual {p2}, Landroid/content/res/Resources;->getAssets()Landroid/content/res/AssetManager;
(( android.content.res.Resources ) p2 ).getDisplayMetrics ( ); // invoke-virtual {p2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
(( android.content.res.Resources ) p2 ).getConfiguration ( ); // invoke-virtual {p2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;
/* invoke-direct {p0, v0, v1, p2}, Landroid/content/res/Resources;-><init>(Landroid/content/res/AssetManager;Landroid/util/DisplayMetrics;Landroid/content/res/Configuration;)V */
/* .line 2 */
/* new-instance p2, Ljava/lang/ref/WeakReference; */
/* invoke-direct {p2, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V */
this.a = p2;
return;
} // .end method
public static Boolean a ( ) {
/* .locals 1 */
/* .line 2 */
/* sget-boolean v0, Lc/b/q/u2;->b:Z */
} // .end method
public static Boolean b ( ) {
/* .locals 2 */
/* .line 1 */
v0 = c.b.q.u2 .a ( );
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* const/16 v1, 0x14 */
	 /* if-gt v0, v1, :cond_0 */
	 int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
/* # virtual methods */
public final android.graphics.drawable.Drawable a ( Integer p0 ) {
/* .locals 0 */
/* .line 1 */
/* invoke-super {p0, p1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable; */
} // .end method
public android.graphics.drawable.Drawable getDrawable ( Integer p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Landroid/content/res/Resources$NotFoundException; */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.a;
(( java.lang.ref.WeakReference ) v0 ).get ( ); // invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
/* check-cast v0, Landroid/content/Context; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
c.b.q.z1 .a ( );
(( c.b.q.z1 ) v1 ).a ( v0, p0, p1 ); // invoke-virtual {v1, v0, p0, p1}, Lc/b/q/z1;->a(Landroid/content/Context;Lc/b/q/u2;I)Landroid/graphics/drawable/Drawable;
/* .line 3 */
} // :cond_0
/* invoke-super {p0, p1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable; */
} // .end method
