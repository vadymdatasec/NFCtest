public abstract class c.h.n.l0 {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static android.view.WindowInsets a ( android.view.View p0, android.view.WindowInsets p1 ) {
		 /* .locals 0 */
		 /* .line 2 */
		 (( android.view.View ) p0 ).dispatchApplyWindowInsets ( p1 ); // invoke-virtual {p0, p1}, Landroid/view/View;->dispatchApplyWindowInsets(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
	 } // .end method
	 public static void a ( android.view.View p0 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 (( android.view.View ) p0 ).requestApplyInsets ( ); // invoke-virtual {p0}, Landroid/view/View;->requestApplyInsets()V
		 return;
	 } // .end method
	 public static android.view.WindowInsets b ( android.view.View p0, android.view.WindowInsets p1 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 (( android.view.View ) p0 ).onApplyWindowInsets ( p1 ); // invoke-virtual {p0, p1}, Landroid/view/View;->onApplyWindowInsets(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
	 } // .end method
