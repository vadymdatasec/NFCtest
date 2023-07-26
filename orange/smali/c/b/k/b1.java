public class c.b.k.b1 extends c.h.n.e1 {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final c.b.k.f1 a; //synthetic
	 /* # direct methods */
	 public c.b.k.b1 ( ) {
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
		 /* iget-boolean v0, p1, Lc/b/k/f1;->q:Z */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 p1 = this.g;
			 if ( p1 != null) { // if-eqz p1, :cond_0
				 int v0 = 0; // const/4 v0, 0x0
				 /* .line 2 */
				 (( android.view.View ) p1 ).setTranslationY ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationY(F)V
				 /* .line 3 */
				 p1 = this.a;
				 p1 = this.d;
				 (( android.widget.FrameLayout ) p1 ).setTranslationY ( v0 ); // invoke-virtual {p1, v0}, Landroid/widget/FrameLayout;->setTranslationY(F)V
				 /* .line 4 */
			 } // :cond_0
			 p1 = this.a;
			 p1 = this.d;
			 /* const/16 v0, 0x8 */
			 (( androidx.appcompat.widget.ActionBarContainer ) p1 ).setVisibility ( v0 ); // invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContainer;->setVisibility(I)V
			 /* .line 5 */
			 p1 = this.a;
			 p1 = this.d;
			 int v0 = 0; // const/4 v0, 0x0
			 (( androidx.appcompat.widget.ActionBarContainer ) p1 ).setTransitioning ( v0 ); // invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContainer;->setTransitioning(Z)V
			 /* .line 6 */
			 p1 = this.a;
			 int v0 = 0; // const/4 v0, 0x0
			 this.v = v0;
			 /* .line 7 */
			 (( c.b.k.f1 ) p1 ).l ( ); // invoke-virtual {p1}, Lc/b/k/f1;->l()V
			 /* .line 8 */
			 p1 = this.a;
			 p1 = this.c;
			 if ( p1 != null) { // if-eqz p1, :cond_1
				 /* .line 9 */
				 c.h.n.v0 .I ( p1 );
			 } // :cond_1
			 return;
		 } // .end method
