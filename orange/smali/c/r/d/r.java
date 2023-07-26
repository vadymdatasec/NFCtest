public class c.r.d.r implements android.animation.ValueAnimator$AnimatorUpdateListener {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final c.r.d.s a; //synthetic
	 /* # direct methods */
	 public c.r.d.r ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.a = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onAnimationUpdate ( android.animation.ValueAnimator p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 (( android.animation.ValueAnimator ) p1 ).getAnimatedValue ( ); // invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;
		 /* check-cast p1, Ljava/lang/Float; */
		 p1 = 		 (( java.lang.Float ) p1 ).floatValue ( ); // invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F
		 /* const/high16 v0, 0x437f0000 # 255.0f */
		 /* mul-float p1, p1, v0 */
		 /* float-to-int p1, p1 */
		 /* .line 2 */
		 v0 = this.a;
		 v0 = this.c;
		 (( android.graphics.drawable.StateListDrawable ) v0 ).setAlpha ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/StateListDrawable;->setAlpha(I)V
		 /* .line 3 */
		 v0 = this.a;
		 v0 = this.d;
		 (( android.graphics.drawable.Drawable ) v0 ).setAlpha ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V
		 /* .line 4 */
		 p1 = this.a;
		 (( c.r.d.s ) p1 ).f ( ); // invoke-virtual {p1}, Lc/r/d/s;->f()V
		 return;
	 } // .end method
