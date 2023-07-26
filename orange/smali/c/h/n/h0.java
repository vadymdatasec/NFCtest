public abstract class c.h.n.h0 {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static android.view.accessibility.AccessibilityNodeProvider a ( android.view.View p0 ) {
		 /* .locals 0 */
		 /* .line 6 */
		 (( android.view.View ) p0 ).getAccessibilityNodeProvider ( ); // invoke-virtual {p0}, Landroid/view/View;->getAccessibilityNodeProvider()Landroid/view/accessibility/AccessibilityNodeProvider;
	 } // .end method
	 public static void a ( android.view.View p0, Integer p1 ) {
		 /* .locals 0 */
		 /* .line 5 */
		 (( android.view.View ) p0 ).setImportantForAccessibility ( p1 ); // invoke-virtual {p0, p1}, Landroid/view/View;->setImportantForAccessibility(I)V
		 return;
	 } // .end method
	 public static void a ( android.view.View p0, Integer p1, Integer p2, Integer p3, Integer p4 ) {
		 /* .locals 0 */
		 /* .line 2 */
		 (( android.view.View ) p0 ).postInvalidateOnAnimation ( p1, p2, p3, p4 ); // invoke-virtual {p0, p1, p2, p3, p4}, Landroid/view/View;->postInvalidateOnAnimation(IIII)V
		 return;
	 } // .end method
	 public static void a ( android.view.View p0, android.graphics.drawable.Drawable p1 ) {
		 /* .locals 0 */
		 /* .line 8 */
		 (( android.view.View ) p0 ).setBackground ( p1 ); // invoke-virtual {p0, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V
		 return;
	 } // .end method
	 public static void a ( android.view.View p0, java.lang.Runnable p1 ) {
		 /* .locals 0 */
		 /* .line 3 */
		 (( android.view.View ) p0 ).postOnAnimation ( p1 ); // invoke-virtual {p0, p1}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V
		 return;
	 } // .end method
	 public static void a ( android.view.View p0, java.lang.Runnable p1, Long p2 ) {
		 /* .locals 0 */
		 /* .line 4 */
		 (( android.view.View ) p0 ).postOnAnimationDelayed ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Landroid/view/View;->postOnAnimationDelayed(Ljava/lang/Runnable;J)V
		 return;
	 } // .end method
	 public static void a ( android.view.View p0, Boolean p1 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 (( android.view.View ) p0 ).setHasTransientState ( p1 ); // invoke-virtual {p0, p1}, Landroid/view/View;->setHasTransientState(Z)V
		 return;
	 } // .end method
	 public static void a ( android.view.ViewTreeObserver p0, android.view.ViewTreeObserver$OnGlobalLayoutListener p1 ) {
		 /* .locals 0 */
		 /* .line 9 */
		 (( android.view.ViewTreeObserver ) p0 ).removeOnGlobalLayoutListener ( p1 ); // invoke-virtual {p0, p1}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V
		 return;
	 } // .end method
	 public static Boolean a ( android.view.View p0, Integer p1, android.os.Bundle p2 ) {
		 /* .locals 0 */
		 /* .line 7 */
		 p0 = 		 (( android.view.View ) p0 ).performAccessibilityAction ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Landroid/view/View;->performAccessibilityAction(ILandroid/os/Bundle;)Z
	 } // .end method
	 public static Boolean b ( android.view.View p0 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 p0 = 		 (( android.view.View ) p0 ).getFitsSystemWindows ( ); // invoke-virtual {p0}, Landroid/view/View;->getFitsSystemWindows()Z
	 } // .end method
	 public static Integer c ( android.view.View p0 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 p0 = 		 (( android.view.View ) p0 ).getImportantForAccessibility ( ); // invoke-virtual {p0}, Landroid/view/View;->getImportantForAccessibility()I
	 } // .end method
	 public static Integer d ( android.view.View p0 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 p0 = 		 (( android.view.View ) p0 ).getMinimumHeight ( ); // invoke-virtual {p0}, Landroid/view/View;->getMinimumHeight()I
	 } // .end method
	 public static Integer e ( android.view.View p0 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 p0 = 		 (( android.view.View ) p0 ).getMinimumWidth ( ); // invoke-virtual {p0}, Landroid/view/View;->getMinimumWidth()I
	 } // .end method
	 public static android.view.ViewParent f ( android.view.View p0 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 (( android.view.View ) p0 ).getParentForAccessibility ( ); // invoke-virtual {p0}, Landroid/view/View;->getParentForAccessibility()Landroid/view/ViewParent;
	 } // .end method
	 public static Integer g ( android.view.View p0 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 p0 = 		 (( android.view.View ) p0 ).getWindowSystemUiVisibility ( ); // invoke-virtual {p0}, Landroid/view/View;->getWindowSystemUiVisibility()I
	 } // .end method
	 public static Boolean h ( android.view.View p0 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 p0 = 		 (( android.view.View ) p0 ).hasOverlappingRendering ( ); // invoke-virtual {p0}, Landroid/view/View;->hasOverlappingRendering()Z
	 } // .end method
	 public static Boolean i ( android.view.View p0 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 p0 = 		 (( android.view.View ) p0 ).hasTransientState ( ); // invoke-virtual {p0}, Landroid/view/View;->hasTransientState()Z
	 } // .end method
	 public static void j ( android.view.View p0 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 (( android.view.View ) p0 ).postInvalidateOnAnimation ( ); // invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V
		 return;
	 } // .end method
	 public static void k ( android.view.View p0 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 (( android.view.View ) p0 ).requestFitSystemWindows ( ); // invoke-virtual {p0}, Landroid/view/View;->requestFitSystemWindows()V
		 return;
	 } // .end method
