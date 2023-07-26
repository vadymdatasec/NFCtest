public class c.b.p.o.s extends android.widget.FrameLayout implements c.b.p.d {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final android.view.CollapsibleActionView b;
	 /* # direct methods */
	 public c.b.p.o.s ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 (( android.view.View ) p1 ).getContext ( ); // invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;
		 /* invoke-direct {p0, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V */
		 /* .line 2 */
		 /* move-object v0, p1 */
		 /* check-cast v0, Landroid/view/CollapsibleActionView; */
		 this.b = v0;
		 /* .line 3 */
		 (( android.widget.FrameLayout ) p0 ).addView ( p1 ); // invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.b;
		 return;
	 } // .end method
	 public void b ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.b;
		 return;
	 } // .end method
	 public android.view.View c ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.b;
		 /* check-cast v0, Landroid/view/View; */
	 } // .end method
