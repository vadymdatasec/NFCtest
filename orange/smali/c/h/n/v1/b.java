public abstract class c.h.n.v1.b {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static Integer a ( android.view.accessibility.AccessibilityEvent p0 ) {
		 /* .locals 2 */
		 /* .line 3 */
		 /* const/16 v1, 0x13 */
		 /* if-lt v0, v1, :cond_0 */
		 /* .line 4 */
		 p0 = 		 (( android.view.accessibility.AccessibilityEvent ) p0 ).getContentChangeTypes ( ); // invoke-virtual {p0}, Landroid/view/accessibility/AccessibilityEvent;->getContentChangeTypes()I
	 } // :cond_0
	 int p0 = 0; // const/4 p0, 0x0
} // .end method
public static void a ( android.view.accessibility.AccessibilityEvent p0, Integer p1 ) {
	 /* .locals 2 */
	 /* .line 1 */
	 /* const/16 v1, 0x13 */
	 /* if-lt v0, v1, :cond_0 */
	 /* .line 2 */
	 (( android.view.accessibility.AccessibilityEvent ) p0 ).setContentChangeTypes ( p1 ); // invoke-virtual {p0, p1}, Landroid/view/accessibility/AccessibilityEvent;->setContentChangeTypes(I)V
} // :cond_0
return;
} // .end method
