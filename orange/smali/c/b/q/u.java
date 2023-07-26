public abstract class c.b.q.u {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static android.view.inputmethod.InputConnection a ( android.view.inputmethod.InputConnection p0, android.view.inputmethod.EditorInfo p1, android.view.View p2 ) {
		 /* .locals 0 */
		 if ( p0 != null) { // if-eqz p0, :cond_0
			 /* .line 1 */
			 p1 = this.hintText;
			 /* if-nez p1, :cond_0 */
			 /* .line 2 */
			 (( android.view.View ) p2 ).getParent ( ); // invoke-virtual {p2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
			 /* .line 3 */
		 } // :goto_0
		 /* instance-of p2, p1, Landroid/view/View; */
		 if ( p2 != null) { // if-eqz p2, :cond_0
			 /* .line 4 */
		 } // :cond_0
	 } // .end method
