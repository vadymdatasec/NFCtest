public abstract class c.h.n.j0 {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static android.graphics.Rect a ( android.view.View p0 ) {
		 /* .locals 0 */
		 /* .line 2 */
		 (( android.view.View ) p0 ).getClipBounds ( ); // invoke-virtual {p0}, Landroid/view/View;->getClipBounds()Landroid/graphics/Rect;
	 } // .end method
	 public static void a ( android.view.View p0, android.graphics.Rect p1 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 (( android.view.View ) p0 ).setClipBounds ( p1 ); // invoke-virtual {p0, p1}, Landroid/view/View;->setClipBounds(Landroid/graphics/Rect;)V
		 return;
	 } // .end method
	 public static Boolean b ( android.view.View p0 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 p0 = 		 (( android.view.View ) p0 ).isInLayout ( ); // invoke-virtual {p0}, Landroid/view/View;->isInLayout()Z
	 } // .end method
