public class c.b.q.t0 extends c.h.f.i.r {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final java.lang.ref.WeakReference a;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/ref/WeakReference<", */
	 /* "Lc/b/q/u0;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
public final Integer b;
public final Integer c;
/* # direct methods */
public c.b.q.t0 ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Lc/h/f/i/r;-><init>()V */
/* .line 2 */
/* new-instance v0, Ljava/lang/ref/WeakReference; */
/* invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V */
this.a = v0;
/* .line 3 */
/* iput p2, p0, Lc/b/q/t0;->b:I */
/* .line 4 */
/* iput p3, p0, Lc/b/q/t0;->c:I */
return;
} // .end method
/* # virtual methods */
public void a ( Integer p0 ) {
/* .locals 0 */
return;
} // .end method
public void a ( android.graphics.Typeface p0 ) {
/* .locals 3 */
/* .line 1 */
v0 = this.a;
(( java.lang.ref.WeakReference ) v0 ).get ( ); // invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
/* check-cast v0, Lc/b/q/u0; */
/* if-nez v0, :cond_0 */
return;
/* .line 2 */
} // :cond_0
/* const/16 v2, 0x1c */
/* if-lt v1, v2, :cond_2 */
/* .line 3 */
/* iget v1, p0, Lc/b/q/t0;->b:I */
int v2 = -1; // const/4 v2, -0x1
/* if-eq v1, v2, :cond_2 */
/* .line 4 */
/* iget v2, p0, Lc/b/q/t0;->c:I */
/* and-int/lit8 v2, v2, 0x2 */
if ( v2 != null) { // if-eqz v2, :cond_1
int v2 = 1; // const/4 v2, 0x1
} // :cond_1
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
android.graphics.Typeface .create ( p1,v1,v2 );
/* .line 5 */
} // :cond_2
/* new-instance v1, Lc/b/q/s0; */
v2 = this.a;
/* invoke-direct {v1, p0, v2, p1}, Lc/b/q/s0;-><init>(Lc/b/q/t0;Ljava/lang/ref/WeakReference;Landroid/graphics/Typeface;)V */
(( c.b.q.u0 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lc/b/q/u0;->a(Ljava/lang/Runnable;)V
return;
} // .end method
