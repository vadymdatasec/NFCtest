public class c.r.d.q extends android.animation.AnimatorListenerAdapter {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public Boolean a;
	 public final c.r.d.s b; //synthetic
	 /* # direct methods */
	 public c.r.d.q ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.b = p1;
		 /* invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V */
		 int p1 = 0; // const/4 p1, 0x0
		 /* .line 2 */
		 /* iput-boolean p1, p0, Lc/r/d/q;->a:Z */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onAnimationCancel ( android.animation.Animator p0 ) {
		 /* .locals 0 */
		 int p1 = 1; // const/4 p1, 0x1
		 /* .line 1 */
		 /* iput-boolean p1, p0, Lc/r/d/q;->a:Z */
		 return;
	 } // .end method
	 public void onAnimationEnd ( android.animation.Animator p0 ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* iget-boolean p1, p0, Lc/r/d/q;->a:Z */
		 int v0 = 0; // const/4 v0, 0x0
		 if ( p1 != null) { // if-eqz p1, :cond_0
			 /* .line 2 */
			 /* iput-boolean v0, p0, Lc/r/d/q;->a:Z */
			 return;
			 /* .line 3 */
		 } // :cond_0
		 p1 = this.b;
		 p1 = this.z;
		 (( android.animation.ValueAnimator ) p1 ).getAnimatedValue ( ); // invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;
		 /* check-cast p1, Ljava/lang/Float; */
		 p1 = 		 (( java.lang.Float ) p1 ).floatValue ( ); // invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F
		 int v1 = 0; // const/4 v1, 0x0
		 /* cmpl-float p1, p1, v1 */
		 /* if-nez p1, :cond_1 */
		 /* .line 4 */
		 p1 = this.b;
		 /* iput v0, p1, Lc/r/d/s;->A:I */
		 /* .line 5 */
		 (( c.r.d.s ) p1 ).c ( v0 ); // invoke-virtual {p1, v0}, Lc/r/d/s;->c(I)V
		 /* .line 6 */
	 } // :cond_1
	 p1 = this.b;
	 int v0 = 2; // const/4 v0, 0x2
	 /* iput v0, p1, Lc/r/d/s;->A:I */
	 /* .line 7 */
	 (( c.r.d.s ) p1 ).f ( ); // invoke-virtual {p1}, Lc/r/d/s;->f()V
} // :goto_0
return;
} // .end method
