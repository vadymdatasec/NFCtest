public class c.t.a.c implements android.animation.ValueAnimator$AnimatorUpdateListener {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final c.t.a.e a; //synthetic
	 public final c.t.a.f b; //synthetic
	 /* # direct methods */
	 public c.t.a.c ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.b = p1;
		 this.a = p2;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onAnimationUpdate ( android.animation.ValueAnimator p0 ) {
		 /* .locals 3 */
		 /* .line 1 */
		 (( android.animation.ValueAnimator ) p1 ).getAnimatedValue ( ); // invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;
		 /* check-cast p1, Ljava/lang/Float; */
		 p1 = 		 (( java.lang.Float ) p1 ).floatValue ( ); // invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F
		 /* .line 2 */
		 v0 = this.b;
		 v1 = this.a;
		 (( c.t.a.f ) v0 ).b ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Lc/t/a/f;->b(FLc/t/a/e;)V
		 /* .line 3 */
		 v0 = this.b;
		 v1 = this.a;
		 int v2 = 0; // const/4 v2, 0x0
		 (( c.t.a.f ) v0 ).a ( p1, v1, v2 ); // invoke-virtual {v0, p1, v1, v2}, Lc/t/a/f;->a(FLc/t/a/e;Z)V
		 /* .line 4 */
		 p1 = this.b;
		 (( android.graphics.drawable.Drawable ) p1 ).invalidateSelf ( ); // invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V
		 return;
	 } // .end method
