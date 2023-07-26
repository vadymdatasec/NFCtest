public class c.b.k.b0 extends c.h.n.e1 {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final c.b.k.n0 a; //synthetic
	 /* # direct methods */
	 public c.b.k.b0 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.a = p1;
		 /* invoke-direct {p0}, Lc/h/n/e1;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( android.view.View p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 p1 = this.a;
		 p1 = this.q;
		 /* const/high16 v0, 0x3f800000 # 1.0f */
		 (( android.view.ViewGroup ) p1 ).setAlpha ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setAlpha(F)V
		 /* .line 2 */
		 p1 = this.a;
		 p1 = this.t;
		 int v0 = 0; // const/4 v0, 0x0
		 (( c.h.n.c1 ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Lc/h/n/c1;->a(Lc/h/n/d1;)Lc/h/n/c1;
		 /* .line 3 */
		 p1 = this.a;
		 this.t = v0;
		 return;
	 } // .end method
	 public void b ( android.view.View p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 p1 = this.a;
		 p1 = this.q;
		 int v0 = 0; // const/4 v0, 0x0
		 (( androidx.appcompat.widget.ActionBarContextView ) p1 ).setVisibility ( v0 ); // invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContextView;->setVisibility(I)V
		 /* .line 2 */
		 p1 = this.a;
		 p1 = this.q;
		 /* const/16 v0, 0x20 */
		 (( android.view.ViewGroup ) p1 ).sendAccessibilityEvent ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->sendAccessibilityEvent(I)V
		 /* .line 3 */
		 p1 = this.a;
		 p1 = this.q;
		 (( android.view.ViewGroup ) p1 ).getParent ( ); // invoke-virtual {p1}, Landroid/view/ViewGroup;->getParent()Landroid/view/ViewParent;
		 /* instance-of p1, p1, Landroid/view/View; */
		 if ( p1 != null) { // if-eqz p1, :cond_0
			 /* .line 4 */
			 p1 = this.a;
			 p1 = this.q;
			 (( android.view.ViewGroup ) p1 ).getParent ( ); // invoke-virtual {p1}, Landroid/view/ViewGroup;->getParent()Landroid/view/ViewParent;
			 /* check-cast p1, Landroid/view/View; */
			 c.h.n.v0 .I ( p1 );
		 } // :cond_0
		 return;
	 } // .end method
