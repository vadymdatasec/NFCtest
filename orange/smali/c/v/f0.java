public class c.v.f0 extends android.animation.AnimatorListenerAdapter {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final c.e.b a; //synthetic
	 public final c.v.k0 b; //synthetic
	 /* # direct methods */
	 public c.v.f0 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.b = p1;
		 this.a = p2;
		 /* invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onAnimationEnd ( android.animation.Animator p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.a;
		 (( c.e.i ) v0 ).remove ( p1 ); // invoke-virtual {v0, p1}, Lc/e/i;->remove(Ljava/lang/Object;)Ljava/lang/Object;
		 /* .line 2 */
		 v0 = this.b;
		 v0 = this.x;
		 (( java.util.ArrayList ) v0 ).remove ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
		 return;
	 } // .end method
	 public void onAnimationStart ( android.animation.Animator p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.b;
		 v0 = this.x;
		 (( java.util.ArrayList ) v0 ).add ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
		 return;
	 } // .end method
