public class c.l.d.s0 implements android.view.View$OnAttachStateChangeListener {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final c.l.d.a2 b; //synthetic
	 public final c.l.d.t0 c; //synthetic
	 /* # direct methods */
	 public c.l.d.s0 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.c = p1;
		 this.b = p2;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onViewAttachedToWindow ( android.view.View p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 p1 = this.b;
		 (( c.l.d.a2 ) p1 ).k ( ); // invoke-virtual {p1}, Lc/l/d/a2;->k()Landroidx/fragment/app/Fragment;
		 /* .line 2 */
		 v0 = this.b;
		 (( c.l.d.a2 ) v0 ).l ( ); // invoke-virtual {v0}, Lc/l/d/a2;->l()V
		 /* .line 3 */
		 p1 = this.I;
		 /* .line 4 */
		 (( android.view.View ) p1 ).getParent ( ); // invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
		 /* check-cast p1, Landroid/view/ViewGroup; */
		 v0 = this.c;
		 v0 = this.b;
		 c.l.d.i3 .a ( p1,v0 );
		 /* .line 5 */
		 (( c.l.d.i3 ) p1 ).b ( ); // invoke-virtual {p1}, Lc/l/d/i3;->b()V
		 return;
	 } // .end method
	 public void onViewDetachedFromWindow ( android.view.View p0 ) {
		 /* .locals 0 */
		 return;
	 } // .end method
