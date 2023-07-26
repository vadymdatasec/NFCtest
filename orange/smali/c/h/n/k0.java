public abstract class c.h.n.k0 {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static Integer a ( android.view.View p0 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 p0 = 		 (( android.view.View ) p0 ).getAccessibilityLiveRegion ( ); // invoke-virtual {p0}, Landroid/view/View;->getAccessibilityLiveRegion()I
	 } // .end method
	 public static void a ( android.view.View p0, Integer p1 ) {
		 /* .locals 0 */
		 /* .line 2 */
		 (( android.view.View ) p0 ).setAccessibilityLiveRegion ( p1 ); // invoke-virtual {p0, p1}, Landroid/view/View;->setAccessibilityLiveRegion(I)V
		 return;
	 } // .end method
	 public static void a ( android.view.ViewParent p0, android.view.View p1, android.view.View p2, Integer p3 ) {
		 /* .locals 0 */
		 /* .line 4 */
		 return;
	 } // .end method
	 public static void a ( android.view.accessibility.AccessibilityEvent p0, Integer p1 ) {
		 /* .locals 0 */
		 /* .line 3 */
		 (( android.view.accessibility.AccessibilityEvent ) p0 ).setContentChangeTypes ( p1 ); // invoke-virtual {p0, p1}, Landroid/view/accessibility/AccessibilityEvent;->setContentChangeTypes(I)V
		 return;
	 } // .end method
	 public static Boolean b ( android.view.View p0 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 p0 = 		 (( android.view.View ) p0 ).isAttachedToWindow ( ); // invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z
	 } // .end method
	 public static Boolean c ( android.view.View p0 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 p0 = 		 (( android.view.View ) p0 ).isLaidOut ( ); // invoke-virtual {p0}, Landroid/view/View;->isLaidOut()Z
	 } // .end method
	 public static Boolean d ( android.view.View p0 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 p0 = 		 (( android.view.View ) p0 ).isLayoutDirectionResolved ( ); // invoke-virtual {p0}, Landroid/view/View;->isLayoutDirectionResolved()Z
	 } // .end method
