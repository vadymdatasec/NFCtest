public abstract class c.h.n.o0 {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static c.h.n.u1 a ( android.view.View p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 (( android.view.View ) p0 ).getRootWindowInsets ( ); // invoke-virtual {p0}, Landroid/view/View;->getRootWindowInsets()Landroid/view/WindowInsets;
		 /* if-nez v0, :cond_0 */
		 int p0 = 0; // const/4 p0, 0x0
		 /* .line 2 */
	 } // :cond_0
	 c.h.n.u1 .a ( v0 );
	 /* .line 3 */
	 (( c.h.n.u1 ) v0 ).a ( v0 ); // invoke-virtual {v0, v0}, Lc/h/n/u1;->a(Lc/h/n/u1;)V
	 /* .line 4 */
	 (( android.view.View ) p0 ).getRootView ( ); // invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;
	 (( c.h.n.u1 ) v0 ).a ( p0 ); // invoke-virtual {v0, p0}, Lc/h/n/u1;->a(Landroid/view/View;)V
} // .end method
public static void a ( android.view.View p0, Integer p1 ) {
	 /* .locals 0 */
	 /* .line 5 */
	 (( android.view.View ) p0 ).setScrollIndicators ( p1 ); // invoke-virtual {p0, p1}, Landroid/view/View;->setScrollIndicators(I)V
	 return;
} // .end method
public static void a ( android.view.View p0, Integer p1, Integer p2 ) {
	 /* .locals 0 */
	 /* .line 6 */
	 (( android.view.View ) p0 ).setScrollIndicators ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Landroid/view/View;->setScrollIndicators(II)V
	 return;
} // .end method
public static Integer b ( android.view.View p0 ) {
	 /* .locals 0 */
	 /* .line 1 */
	 p0 = 	 (( android.view.View ) p0 ).getScrollIndicators ( ); // invoke-virtual {p0}, Landroid/view/View;->getScrollIndicators()I
} // .end method
