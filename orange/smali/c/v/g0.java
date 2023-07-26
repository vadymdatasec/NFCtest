public class c.v.g0 extends android.animation.AnimatorListenerAdapter {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final c.v.k0 a; //synthetic
	 /* # direct methods */
	 public c.v.g0 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.a = p1;
		 /* invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onAnimationEnd ( android.animation.Animator p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.a;
		 (( c.v.k0 ) v0 ).a ( ); // invoke-virtual {v0}, Lc/v/k0;->a()V
		 /* .line 2 */
		 (( android.animation.Animator ) p1 ).removeListener ( p0 ); // invoke-virtual {p1, p0}, Landroid/animation/Animator;->removeListener(Landroid/animation/Animator$AnimatorListener;)V
		 return;
	 } // .end method
