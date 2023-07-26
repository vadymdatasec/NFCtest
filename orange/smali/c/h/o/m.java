public abstract class c.h.o.m {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static void a ( android.widget.PopupWindow p0, Integer p1 ) {
		 /* .locals 0 */
		 /* .line 3 */
		 (( android.widget.PopupWindow ) p0 ).setWindowLayoutType ( p1 ); // invoke-virtual {p0, p1}, Landroid/widget/PopupWindow;->setWindowLayoutType(I)V
		 return;
	 } // .end method
	 public static void a ( android.widget.PopupWindow p0, Boolean p1 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 (( android.widget.PopupWindow ) p0 ).setOverlapAnchor ( p1 ); // invoke-virtual {p0, p1}, Landroid/widget/PopupWindow;->setOverlapAnchor(Z)V
		 return;
	 } // .end method
	 public static Boolean a ( android.widget.PopupWindow p0 ) {
		 /* .locals 0 */
		 /* .line 2 */
		 p0 = 		 (( android.widget.PopupWindow ) p0 ).getOverlapAnchor ( ); // invoke-virtual {p0}, Landroid/widget/PopupWindow;->getOverlapAnchor()Z
	 } // .end method
	 public static Integer b ( android.widget.PopupWindow p0 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 p0 = 		 (( android.widget.PopupWindow ) p0 ).getWindowLayoutType ( ); // invoke-virtual {p0}, Landroid/widget/PopupWindow;->getWindowLayoutType()I
	 } // .end method
