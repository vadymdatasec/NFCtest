public class c.v.f1 implements c.v.g1 {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final android.view.ViewOverlay a;
	 /* # direct methods */
	 public c.v.f1 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 (( android.view.View ) p1 ).getOverlay ( ); // invoke-virtual {p1}, Landroid/view/View;->getOverlay()Landroid/view/ViewOverlay;
		 this.a = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( android.graphics.drawable.Drawable p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.a;
		 (( android.view.ViewOverlay ) v0 ).add ( p1 ); // invoke-virtual {v0, p1}, Landroid/view/ViewOverlay;->add(Landroid/graphics/drawable/Drawable;)V
		 return;
	 } // .end method
	 public void b ( android.graphics.drawable.Drawable p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.a;
		 (( android.view.ViewOverlay ) v0 ).remove ( p1 ); // invoke-virtual {v0, p1}, Landroid/view/ViewOverlay;->remove(Landroid/graphics/drawable/Drawable;)V
		 return;
	 } // .end method
