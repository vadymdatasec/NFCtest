public class inal {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public java.lang.ref.WeakReference a;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/ref/WeakReference<", */
	 /* "Landroid/view/View;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
public java.lang.Runnable b;
public java.lang.Runnable c;
public Integer d;
/* # direct methods */
public inal ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
this.b = v0;
/* .line 3 */
this.c = v0;
int v0 = -1; // const/4 v0, -0x1
/* .line 4 */
/* iput v0, p0, Lc/h/n/c1;->d:I */
/* .line 5 */
/* new-instance v0, Ljava/lang/ref/WeakReference; */
/* invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V */
this.a = v0;
return;
} // .end method
/* # virtual methods */
public c.h.n.c1 a ( Float p0 ) {
/* .locals 1 */
/* .line 3 */
v0 = this.a;
(( java.lang.ref.WeakReference ) v0 ).get ( ); // invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
/* check-cast v0, Landroid/view/View; */
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 4 */
	 (( android.view.View ) v0 ).animate ( ); // invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;
	 (( android.view.ViewPropertyAnimator ) v0 ).alpha ( p1 ); // invoke-virtual {v0, p1}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;
} // :cond_0
} // .end method
public c.h.n.c1 a ( Long p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
(( java.lang.ref.WeakReference ) v0 ).get ( ); // invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
/* check-cast v0, Landroid/view/View; */
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 2 */
	 (( android.view.View ) v0 ).animate ( ); // invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;
	 (( android.view.ViewPropertyAnimator ) v0 ).setDuration ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;
} // :cond_0
} // .end method
public c.h.n.c1 a ( android.view.animation.Interpolator p0 ) {
/* .locals 1 */
/* .line 5 */
v0 = this.a;
(( java.lang.ref.WeakReference ) v0 ).get ( ); // invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
/* check-cast v0, Landroid/view/View; */
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 6 */
	 (( android.view.View ) v0 ).animate ( ); // invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;
	 (( android.view.ViewPropertyAnimator ) v0 ).setInterpolator ( p1 ); // invoke-virtual {v0, p1}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;
} // :cond_0
} // .end method
public c.h.n.c1 a ( c.h.n.d1 p0 ) {
/* .locals 3 */
/* .line 9 */
v0 = this.a;
(( java.lang.ref.WeakReference ) v0 ).get ( ); // invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
/* check-cast v0, Landroid/view/View; */
if ( v0 != null) { // if-eqz v0, :cond_1
	 /* .line 10 */
	 /* const/16 v2, 0x10 */
	 /* if-lt v1, v2, :cond_0 */
	 /* .line 11 */
	 (( c.h.n.c1 ) p0 ).a ( v0, p1 ); // invoke-virtual {p0, v0, p1}, Lc/h/n/c1;->a(Landroid/view/View;Lc/h/n/d1;)V
} // :cond_0
/* const/high16 v1, 0x7e000000 */
/* .line 12 */
(( android.view.View ) v0 ).setTag ( v1, p1 ); // invoke-virtual {v0, v1, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V
/* .line 13 */
/* new-instance p1, Lc/h/n/b1; */
/* invoke-direct {p1, p0}, Lc/h/n/b1;-><init>(Lc/h/n/c1;)V */
(( c.h.n.c1 ) p0 ).a ( v0, p1 ); // invoke-virtual {p0, v0, p1}, Lc/h/n/c1;->a(Landroid/view/View;Lc/h/n/d1;)V
} // :cond_1
} // :goto_0
} // .end method
public c.h.n.c1 a ( c.h.n.f1 p0 ) {
/* .locals 3 */
/* .line 16 */
v0 = this.a;
(( java.lang.ref.WeakReference ) v0 ).get ( ); // invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
/* check-cast v0, Landroid/view/View; */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 17 */
/* const/16 v2, 0x13 */
/* if-lt v1, v2, :cond_1 */
int v1 = 0; // const/4 v1, 0x0
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 18 */
/* new-instance v1, Lc/h/n/a1; */
/* invoke-direct {v1, p0, p1, v0}, Lc/h/n/a1;-><init>(Lc/h/n/c1;Lc/h/n/f1;Landroid/view/View;)V */
/* .line 19 */
} // :cond_0
(( android.view.View ) v0 ).animate ( ); // invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;
(( android.view.ViewPropertyAnimator ) p1 ).setUpdateListener ( v1 ); // invoke-virtual {p1, v1}, Landroid/view/ViewPropertyAnimator;->setUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)Landroid/view/ViewPropertyAnimator;
} // :cond_1
} // .end method
public void a ( ) {
/* .locals 1 */
/* .line 7 */
v0 = this.a;
(( java.lang.ref.WeakReference ) v0 ).get ( ); // invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
/* check-cast v0, Landroid/view/View; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 8 */
(( android.view.View ) v0 ).animate ( ); // invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;
(( android.view.ViewPropertyAnimator ) v0 ).cancel ( ); // invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->cancel()V
} // :cond_0
return;
} // .end method
public final void a ( android.view.View p0, c.h.n.d1 p1 ) {
/* .locals 2 */
if ( p2 != null) { // if-eqz p2, :cond_0
/* .line 14 */
(( android.view.View ) p1 ).animate ( ); // invoke-virtual {p1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;
/* new-instance v1, Lc/h/n/z0; */
/* invoke-direct {v1, p0, p2, p1}, Lc/h/n/z0;-><init>(Lc/h/n/c1;Lc/h/n/d1;Landroid/view/View;)V */
(( android.view.ViewPropertyAnimator ) v0 ).setListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;
/* .line 15 */
} // :cond_0
(( android.view.View ) p1 ).animate ( ); // invoke-virtual {p1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;
int p2 = 0; // const/4 p2, 0x0
(( android.view.ViewPropertyAnimator ) p1 ).setListener ( p2 ); // invoke-virtual {p1, p2}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;
} // :goto_0
return;
} // .end method
public Long b ( ) {
/* .locals 2 */
/* .line 3 */
v0 = this.a;
(( java.lang.ref.WeakReference ) v0 ).get ( ); // invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
/* check-cast v0, Landroid/view/View; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 4 */
(( android.view.View ) v0 ).animate ( ); // invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;
(( android.view.ViewPropertyAnimator ) v0 ).getDuration ( ); // invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->getDuration()J
/* move-result-wide v0 */
/* return-wide v0 */
} // :cond_0
/* const-wide/16 v0, 0x0 */
/* return-wide v0 */
} // .end method
public c.h.n.c1 b ( Float p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
(( java.lang.ref.WeakReference ) v0 ).get ( ); // invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
/* check-cast v0, Landroid/view/View; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( android.view.View ) v0 ).animate ( ); // invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;
(( android.view.ViewPropertyAnimator ) v0 ).translationY ( p1 ); // invoke-virtual {v0, p1}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;
} // :cond_0
} // .end method
public c.h.n.c1 b ( Long p0 ) {
/* .locals 1 */
/* .line 5 */
v0 = this.a;
(( java.lang.ref.WeakReference ) v0 ).get ( ); // invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
/* check-cast v0, Landroid/view/View; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 6 */
(( android.view.View ) v0 ).animate ( ); // invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;
(( android.view.ViewPropertyAnimator ) v0 ).setStartDelay ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Landroid/view/ViewPropertyAnimator;->setStartDelay(J)Landroid/view/ViewPropertyAnimator;
} // :cond_0
} // .end method
public void c ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
(( java.lang.ref.WeakReference ) v0 ).get ( ); // invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
/* check-cast v0, Landroid/view/View; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( android.view.View ) v0 ).animate ( ); // invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;
(( android.view.ViewPropertyAnimator ) v0 ).start ( ); // invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V
} // :cond_0
return;
} // .end method
