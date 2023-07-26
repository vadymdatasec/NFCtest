public abstract class c.h.n.i0 {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static Integer a ( ) {
		 /* .locals 1 */
		 /* .line 2 */
		 v0 = 		 android.view.View .generateViewId ( );
	 } // .end method
	 public static android.view.Display a ( android.view.View p0 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 (( android.view.View ) p0 ).getDisplay ( ); // invoke-virtual {p0}, Landroid/view/View;->getDisplay()Landroid/view/Display;
	 } // .end method
	 public static void a ( android.view.View p0, Integer p1 ) {
		 /* .locals 0 */
		 /* .line 3 */
		 (( android.view.View ) p0 ).setLabelFor ( p1 ); // invoke-virtual {p0, p1}, Landroid/view/View;->setLabelFor(I)V
		 return;
	 } // .end method
	 public static void a ( android.view.View p0, Integer p1, Integer p2, Integer p3, Integer p4 ) {
		 /* .locals 0 */
		 /* .line 5 */
		 (( android.view.View ) p0 ).setPaddingRelative ( p1, p2, p3, p4 ); // invoke-virtual {p0, p1, p2, p3, p4}, Landroid/view/View;->setPaddingRelative(IIII)V
		 return;
	 } // .end method
	 public static void a ( android.view.View p0, android.graphics.Paint p1 ) {
		 /* .locals 0 */
		 /* .line 4 */
		 (( android.view.View ) p0 ).setLayerPaint ( p1 ); // invoke-virtual {p0, p1}, Landroid/view/View;->setLayerPaint(Landroid/graphics/Paint;)V
		 return;
	 } // .end method
	 public static Integer b ( android.view.View p0 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 p0 = 		 (( android.view.View ) p0 ).getLabelFor ( ); // invoke-virtual {p0}, Landroid/view/View;->getLabelFor()I
	 } // .end method
	 public static void b ( android.view.View p0, Integer p1 ) {
		 /* .locals 0 */
		 /* .line 2 */
		 (( android.view.View ) p0 ).setLayoutDirection ( p1 ); // invoke-virtual {p0, p1}, Landroid/view/View;->setLayoutDirection(I)V
		 return;
	 } // .end method
	 public static Integer c ( android.view.View p0 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 p0 = 		 (( android.view.View ) p0 ).getLayoutDirection ( ); // invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I
	 } // .end method
	 public static Integer d ( android.view.View p0 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 p0 = 		 (( android.view.View ) p0 ).getPaddingEnd ( ); // invoke-virtual {p0}, Landroid/view/View;->getPaddingEnd()I
	 } // .end method
	 public static Integer e ( android.view.View p0 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 p0 = 		 (( android.view.View ) p0 ).getPaddingStart ( ); // invoke-virtual {p0}, Landroid/view/View;->getPaddingStart()I
	 } // .end method
	 public static Boolean f ( android.view.View p0 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 p0 = 		 (( android.view.View ) p0 ).isPaddingRelative ( ); // invoke-virtual {p0}, Landroid/view/View;->isPaddingRelative()Z
	 } // .end method
