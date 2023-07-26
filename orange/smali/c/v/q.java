public class c.v.q extends android.animation.AnimatorListenerAdapter {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final android.view.View a;
	 public Boolean b;
	 /* # direct methods */
	 public c.v.q ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 2 */
		 /* iput-boolean v0, p0, Lc/v/q;->b:Z */
		 /* .line 3 */
		 this.a = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onAnimationEnd ( android.animation.Animator p0 ) {
		 /* .locals 2 */
		 /* .line 1 */
		 p1 = this.a;
		 /* const/high16 v0, 0x3f800000 # 1.0f */
		 c.v.j1 .a ( p1,v0 );
		 /* .line 2 */
		 /* iget-boolean p1, p0, Lc/v/q;->b:Z */
		 if ( p1 != null) { // if-eqz p1, :cond_0
			 /* .line 3 */
			 p1 = this.a;
			 int v0 = 0; // const/4 v0, 0x0
			 int v1 = 0; // const/4 v1, 0x0
			 (( android.view.View ) p1 ).setLayerType ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V
		 } // :cond_0
		 return;
	 } // .end method
	 public void onAnimationStart ( android.animation.Animator p0 ) {
		 /* .locals 2 */
		 /* .line 1 */
		 p1 = this.a;
		 p1 = 		 c.h.n.v0 .z ( p1 );
		 if ( p1 != null) { // if-eqz p1, :cond_0
			 p1 = this.a;
			 /* .line 2 */
			 p1 = 			 (( android.view.View ) p1 ).getLayerType ( ); // invoke-virtual {p1}, Landroid/view/View;->getLayerType()I
			 /* if-nez p1, :cond_0 */
			 int p1 = 1; // const/4 p1, 0x1
			 /* .line 3 */
			 /* iput-boolean p1, p0, Lc/v/q;->b:Z */
			 /* .line 4 */
			 p1 = this.a;
			 int v0 = 2; // const/4 v0, 0x2
			 int v1 = 0; // const/4 v1, 0x0
			 (( android.view.View ) p1 ).setLayerType ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V
		 } // :cond_0
		 return;
	 } // .end method
