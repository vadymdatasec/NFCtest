public class c.l.d.d1 extends android.animation.AnimatorListenerAdapter {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final android.view.ViewGroup a; //synthetic
	 public final android.view.View b; //synthetic
	 public final androidx.fragment.app.Fragment c; //synthetic
	 /* # direct methods */
	 public c.l.d.d1 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.a = p2;
		 this.b = p3;
		 this.c = p4;
		 /* invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onAnimationEnd ( android.animation.Animator p0 ) {
		 /* .locals 2 */
		 /* .line 1 */
		 v0 = this.a;
		 v1 = this.b;
		 (( android.view.ViewGroup ) v0 ).endViewTransition ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->endViewTransition(Landroid/view/View;)V
		 /* .line 2 */
		 (( android.animation.Animator ) p1 ).removeListener ( p0 ); // invoke-virtual {p1, p0}, Landroid/animation/Animator;->removeListener(Landroid/animation/Animator$AnimatorListener;)V
		 /* .line 3 */
		 p1 = this.c;
		 v0 = this.I;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* iget-boolean p1, p1, Landroidx/fragment/app/Fragment;->A:Z */
			 if ( p1 != null) { // if-eqz p1, :cond_0
				 /* const/16 p1, 0x8 */
				 /* .line 4 */
				 (( android.view.View ) v0 ).setVisibility ( p1 ); // invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V
			 } // :cond_0
			 return;
		 } // .end method
