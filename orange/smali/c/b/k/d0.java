public class c.b.k.d0 extends c.h.n.e1 {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final c.b.k.e0 a; //synthetic
	 /* # direct methods */
	 public c.b.k.d0 ( ) {
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
		 p1 = this.b;
		 p1 = this.q;
		 /* const/16 v0, 0x8 */
		 (( androidx.appcompat.widget.ActionBarContextView ) p1 ).setVisibility ( v0 ); // invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContextView;->setVisibility(I)V
		 /* .line 2 */
		 p1 = this.a;
		 p1 = this.b;
		 v0 = this.r;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 3 */
			 (( android.widget.PopupWindow ) v0 ).dismiss ( ); // invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V
			 /* .line 4 */
		 } // :cond_0
		 p1 = this.q;
		 (( android.view.ViewGroup ) p1 ).getParent ( ); // invoke-virtual {p1}, Landroid/view/ViewGroup;->getParent()Landroid/view/ViewParent;
		 /* instance-of p1, p1, Landroid/view/View; */
		 if ( p1 != null) { // if-eqz p1, :cond_1
			 /* .line 5 */
			 p1 = this.a;
			 p1 = this.b;
			 p1 = this.q;
			 (( android.view.ViewGroup ) p1 ).getParent ( ); // invoke-virtual {p1}, Landroid/view/ViewGroup;->getParent()Landroid/view/ViewParent;
			 /* check-cast p1, Landroid/view/View; */
			 c.h.n.v0 .I ( p1 );
			 /* .line 6 */
		 } // :cond_1
	 } // :goto_0
	 p1 = this.a;
	 p1 = this.b;
	 p1 = this.q;
	 (( android.view.ViewGroup ) p1 ).removeAllViews ( ); // invoke-virtual {p1}, Landroid/view/ViewGroup;->removeAllViews()V
	 /* .line 7 */
	 p1 = this.a;
	 p1 = this.b;
	 p1 = this.t;
	 int v0 = 0; // const/4 v0, 0x0
	 (( c.h.n.c1 ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Lc/h/n/c1;->a(Lc/h/n/d1;)Lc/h/n/c1;
	 /* .line 8 */
	 p1 = this.a;
	 p1 = this.b;
	 this.t = v0;
	 return;
} // .end method
