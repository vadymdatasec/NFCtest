public class c.b.k.d1 implements c.h.n.f1 {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final c.b.k.f1 a; //synthetic
	 /* # direct methods */
	 public c.b.k.d1 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.a = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( android.view.View p0 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 p1 = this.a;
		 p1 = this.d;
		 (( android.widget.FrameLayout ) p1 ).getParent ( ); // invoke-virtual {p1}, Landroid/widget/FrameLayout;->getParent()Landroid/view/ViewParent;
		 /* .line 2 */
		 /* check-cast p1, Landroid/view/View; */
		 (( android.view.View ) p1 ).invalidate ( ); // invoke-virtual {p1}, Landroid/view/View;->invalidate()V
		 return;
	 } // .end method
