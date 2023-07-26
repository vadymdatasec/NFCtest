public class e.f.a.c.s.d implements c.h.n.x {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # direct methods */
	 public e.f.a.c.s.d ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public c.h.n.u1 a ( android.view.View p0, c.h.n.u1 p1 ) {
		 /* .locals 4 */
		 /* .line 1 */
		 v0 = 		 (( android.view.View ) p1 ).getPaddingLeft ( ); // invoke-virtual {p1}, Landroid/view/View;->getPaddingLeft()I
		 /* .line 2 */
		 v1 = 		 (( android.view.View ) p1 ).getPaddingTop ( ); // invoke-virtual {p1}, Landroid/view/View;->getPaddingTop()I
		 /* .line 3 */
		 v2 = 		 (( android.view.View ) p1 ).getPaddingRight ( ); // invoke-virtual {p1}, Landroid/view/View;->getPaddingRight()I
		 /* .line 4 */
		 v3 = 		 (( c.h.n.u1 ) p2 ).f ( ); // invoke-virtual {p2}, Lc/h/n/u1;->f()I
		 /* .line 5 */
		 (( android.view.View ) p1 ).setPadding ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/view/View;->setPadding(IIII)V
	 } // .end method
