public class c.l.d.f extends android.animation.AnimatorListenerAdapter {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final android.view.ViewGroup a; //synthetic
	 public final android.view.View b; //synthetic
	 public final Boolean c; //synthetic
	 public final c.l.d.h3 d; //synthetic
	 public final c.l.d.o e; //synthetic
	 /* # direct methods */
	 public c.l.d.f ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.a = p2;
		 this.b = p3;
		 /* iput-boolean p4, p0, Lc/l/d/f;->c:Z */
		 this.d = p5;
		 this.e = p6;
		 /* invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onAnimationEnd ( android.animation.Animator p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 p1 = this.a;
		 v0 = this.b;
		 (( android.view.ViewGroup ) p1 ).endViewTransition ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->endViewTransition(Landroid/view/View;)V
		 /* .line 2 */
		 /* iget-boolean p1, p0, Lc/l/d/f;->c:Z */
		 if ( p1 != null) { // if-eqz p1, :cond_0
			 /* .line 3 */
			 p1 = this.d;
			 (( c.l.d.h3 ) p1 ).c ( ); // invoke-virtual {p1}, Lc/l/d/h3;->c()Lc/l/d/g3;
			 v0 = this.b;
			 (( c.l.d.g3 ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Lc/l/d/g3;->a(Landroid/view/View;)V
			 /* .line 4 */
		 } // :cond_0
		 p1 = this.e;
		 (( c.l.d.p ) p1 ).a ( ); // invoke-virtual {p1}, Lc/l/d/p;->a()V
		 return;
	 } // .end method
