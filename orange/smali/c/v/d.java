public class c.v.d extends android.animation.AnimatorListenerAdapter {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final android.view.ViewGroup a; //synthetic
	 public final android.graphics.drawable.BitmapDrawable b; //synthetic
	 public final android.view.View c; //synthetic
	 public final Float d; //synthetic
	 /* # direct methods */
	 public c.v.d ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.a = p2;
		 this.b = p3;
		 this.c = p4;
		 /* iput p5, p0, Lc/v/d;->d:F */
		 /* invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onAnimationEnd ( android.animation.Animator p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 p1 = this.a;
		 c.v.j1 .b ( p1 );
		 v0 = this.b;
		 /* .line 2 */
		 p1 = this.c;
		 /* iget v0, p0, Lc/v/d;->d:F */
		 c.v.j1 .a ( p1,v0 );
		 return;
	 } // .end method
