public class c.v.x0 implements c.v.y0 {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final android.view.ViewGroupOverlay a;
	 /* # direct methods */
	 public c.v.x0 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 (( android.view.ViewGroup ) p1 ).getOverlay ( ); // invoke-virtual {p1}, Landroid/view/ViewGroup;->getOverlay()Landroid/view/ViewGroupOverlay;
		 this.a = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( android.graphics.drawable.Drawable p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.a;
		 (( android.view.ViewGroupOverlay ) v0 ).add ( p1 ); // invoke-virtual {v0, p1}, Landroid/view/ViewGroupOverlay;->add(Landroid/graphics/drawable/Drawable;)V
		 return;
	 } // .end method
	 public void a ( android.view.View p0 ) {
		 /* .locals 1 */
		 /* .line 2 */
		 v0 = this.a;
		 (( android.view.ViewGroupOverlay ) v0 ).add ( p1 ); // invoke-virtual {v0, p1}, Landroid/view/ViewGroupOverlay;->add(Landroid/view/View;)V
		 return;
	 } // .end method
	 public void b ( android.graphics.drawable.Drawable p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.a;
		 (( android.view.ViewGroupOverlay ) v0 ).remove ( p1 ); // invoke-virtual {v0, p1}, Landroid/view/ViewGroupOverlay;->remove(Landroid/graphics/drawable/Drawable;)V
		 return;
	 } // .end method
	 public void b ( android.view.View p0 ) {
		 /* .locals 1 */
		 /* .line 2 */
		 v0 = this.a;
		 (( android.view.ViewGroupOverlay ) v0 ).remove ( p1 ); // invoke-virtual {v0, p1}, Landroid/view/ViewGroupOverlay;->remove(Landroid/view/View;)V
		 return;
	 } // .end method
