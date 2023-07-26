public class c.b.q.s0 implements java.lang.Runnable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final java.lang.ref.WeakReference b;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/ref/WeakReference<", */
	 /* "Lc/b/q/u0;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
public final android.graphics.Typeface c;
/* # direct methods */
public c.b.q.s0 ( ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/ref/WeakReference<", */
/* "Lc/b/q/u0;", */
/* ">;", */
/* "Landroid/graphics/Typeface;", */
/* ")V" */
/* } */
} // .end annotation
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
this.b = p2;
/* .line 3 */
this.c = p3;
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.b;
(( java.lang.ref.WeakReference ) v0 ).get ( ); // invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
/* check-cast v0, Lc/b/q/u0; */
/* if-nez v0, :cond_0 */
return;
/* .line 2 */
} // :cond_0
v1 = this.c;
(( c.b.q.u0 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lc/b/q/u0;->a(Landroid/graphics/Typeface;)V
return;
} // .end method
