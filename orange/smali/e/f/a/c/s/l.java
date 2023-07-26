public class e.f.a.c.s.l implements android.animation.ValueAnimator$AnimatorUpdateListener {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public Integer a;
	 public final Integer b; //synthetic
	 public final com.google.android.material.snackbar.BaseTransientBottomBar c; //synthetic
	 /* # direct methods */
	 public e.f.a.c.s.l ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.c = p1;
		 /* iput p2, p0, Le/f/a/c/s/l;->b:I */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 /* iget p1, p0, Le/f/a/c/s/l;->b:I */
		 /* iput p1, p0, Le/f/a/c/s/l;->a:I */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onAnimationUpdate ( android.animation.ValueAnimator p0 ) {
		 /* .locals 2 */
		 /* .line 1 */
		 (( android.animation.ValueAnimator ) p1 ).getAnimatedValue ( ); // invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;
		 /* check-cast p1, Ljava/lang/Integer; */
		 p1 = 		 (( java.lang.Integer ) p1 ).intValue ( ); // invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I
		 /* .line 2 */
		 v0 = 		 com.google.android.material.snackbar.BaseTransientBottomBar .n ( );
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 3 */
			 v0 = this.c;
			 v0 = this.c;
			 /* iget v1, p0, Le/f/a/c/s/l;->a:I */
			 /* sub-int v1, p1, v1 */
			 c.h.n.v0 .e ( v0,v1 );
			 /* .line 4 */
		 } // :cond_0
		 v0 = this.c;
		 v0 = this.c;
		 /* int-to-float v1, p1 */
		 (( android.widget.FrameLayout ) v0 ).setTranslationY ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setTranslationY(F)V
		 /* .line 5 */
	 } // :goto_0
	 /* iput p1, p0, Le/f/a/c/s/l;->a:I */
	 return;
} // .end method
