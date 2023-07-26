public class c.l.d.j0 extends android.animation.AnimatorListenerAdapter {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final android.view.ViewGroup a; //synthetic
	 public final android.view.View b; //synthetic
	 public final androidx.fragment.app.Fragment c; //synthetic
	 public final c.l.d.l2 d; //synthetic
	 public final c.h.j.c e; //synthetic
	 /* # direct methods */
	 public c.l.d.j0 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.a = p1;
		 this.b = p2;
		 this.c = p3;
		 this.d = p4;
		 this.e = p5;
		 /* invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onAnimationEnd ( android.animation.Animator p0 ) {
		 /* .locals 2 */
		 /* .line 1 */
		 p1 = this.a;
		 v0 = this.b;
		 (( android.view.ViewGroup ) p1 ).endViewTransition ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->endViewTransition(Landroid/view/View;)V
		 /* .line 2 */
		 p1 = this.c;
		 (( androidx.fragment.app.Fragment ) p1 ).k ( ); // invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->k()Landroid/animation/Animator;
		 /* .line 3 */
		 v0 = this.c;
		 int v1 = 0; // const/4 v1, 0x0
		 (( androidx.fragment.app.Fragment ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->a(Landroid/animation/Animator;)V
		 if ( p1 != null) { // if-eqz p1, :cond_0
			 /* .line 4 */
			 p1 = this.a;
			 v0 = this.b;
			 p1 = 			 (( android.view.ViewGroup ) p1 ).indexOfChild ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I
			 /* if-gez p1, :cond_0 */
			 /* .line 5 */
			 p1 = this.d;
			 v0 = this.c;
			 v1 = this.e;
		 } // :cond_0
		 return;
	 } // .end method
