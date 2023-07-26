public class c.b.k.a0 implements java.lang.Runnable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final c.b.k.n0 b; //synthetic
	 /* # direct methods */
	 public c.b.k.a0 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.b = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void run ( ) {
		 /* .locals 4 */
		 /* .line 1 */
		 v0 = this.b;
		 v1 = this.r;
		 v0 = this.q;
		 int v2 = 0; // const/4 v2, 0x0
		 /* const/16 v3, 0x37 */
		 (( android.widget.PopupWindow ) v1 ).showAtLocation ( v0, v3, v2, v2 ); // invoke-virtual {v1, v0, v3, v2, v2}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V
		 /* .line 2 */
		 v0 = this.b;
		 (( c.b.k.n0 ) v0 ).q ( ); // invoke-virtual {v0}, Lc/b/k/n0;->q()V
		 /* .line 3 */
		 v0 = this.b;
		 v0 = 		 (( c.b.k.n0 ) v0 ).D ( ); // invoke-virtual {v0}, Lc/b/k/n0;->D()Z
		 /* const/high16 v1, 0x3f800000 # 1.0f */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 4 */
			 v0 = this.b;
			 v0 = this.q;
			 int v2 = 0; // const/4 v2, 0x0
			 (( android.view.ViewGroup ) v0 ).setAlpha ( v2 ); // invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->setAlpha(F)V
			 /* .line 5 */
			 v0 = this.b;
			 v2 = this.q;
			 c.h.n.v0 .a ( v2 );
			 (( c.h.n.c1 ) v2 ).a ( v1 ); // invoke-virtual {v2, v1}, Lc/h/n/c1;->a(F)Lc/h/n/c1;
			 this.t = v2;
			 /* .line 6 */
			 v0 = this.b;
			 v0 = this.t;
			 /* new-instance v1, Lc/b/k/z; */
			 /* invoke-direct {v1, p0}, Lc/b/k/z;-><init>(Lc/b/k/a0;)V */
			 (( c.h.n.c1 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lc/h/n/c1;->a(Lc/h/n/d1;)Lc/h/n/c1;
			 /* .line 7 */
		 } // :cond_0
		 v0 = this.b;
		 v0 = this.q;
		 (( android.view.ViewGroup ) v0 ).setAlpha ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setAlpha(F)V
		 /* .line 8 */
		 v0 = this.b;
		 v0 = this.q;
		 (( androidx.appcompat.widget.ActionBarContextView ) v0 ).setVisibility ( v2 ); // invoke-virtual {v0, v2}, Landroidx/appcompat/widget/ActionBarContextView;->setVisibility(I)V
	 } // :goto_0
	 return;
} // .end method
