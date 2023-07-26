public class c.r.d.j0 extends c.h.n.d {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final androidx.recyclerview.widget.RecyclerView d;
	 public final c.r.d.i0 e;
	 /* # direct methods */
	 public c.r.d.j0 ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Lc/h/n/d;-><init>()V */
		 /* .line 2 */
		 this.d = p1;
		 /* .line 3 */
		 (( c.r.d.j0 ) p0 ).b ( ); // invoke-virtual {p0}, Lc/r/d/j0;->b()Lc/h/n/d;
		 if ( p1 != null) { // if-eqz p1, :cond_0
			 /* .line 4 */
			 /* instance-of v0, p1, Lc/r/d/i0; */
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 /* .line 5 */
				 /* check-cast p1, Lc/r/d/i0; */
				 this.e = p1;
				 /* .line 6 */
			 } // :cond_0
			 /* new-instance p1, Lc/r/d/i0; */
			 /* invoke-direct {p1, p0}, Lc/r/d/i0;-><init>(Lc/r/d/j0;)V */
			 this.e = p1;
		 } // :goto_0
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( android.view.View p0, Object p1 ) {
		 /* .locals 0 */
		 /* .line 4 */
		 /* invoke-super {p0, p1, p2}, Lc/h/n/d;->a(Landroid/view/View;Lc/h/n/v1/h;)V */
		 /* .line 5 */
		 p1 = 		 (( c.r.d.j0 ) p0 ).c ( ); // invoke-virtual {p0}, Lc/r/d/j0;->c()Z
		 /* if-nez p1, :cond_0 */
		 p1 = this.d;
		 (( androidx.recyclerview.widget.RecyclerView ) p1 ).getLayoutManager ( ); // invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$o;
		 if ( p1 != null) { // if-eqz p1, :cond_0
			 /* .line 6 */
			 p1 = this.d;
			 (( androidx.recyclerview.widget.RecyclerView ) p1 ).getLayoutManager ( ); // invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$o;
			 (( androidx.recyclerview.widget.RecyclerView$o ) p1 ).a ( p2 ); // invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView$o;->a(Lc/h/n/v1/h;)V
		 } // :cond_0
		 return;
	 } // .end method
	 public Boolean a ( android.view.View p0, Integer p1, android.os.Bundle p2 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 p1 = 		 /* invoke-super {p0, p1, p2, p3}, Lc/h/n/d;->a(Landroid/view/View;ILandroid/os/Bundle;)Z */
		 if ( p1 != null) { // if-eqz p1, :cond_0
			 int p1 = 1; // const/4 p1, 0x1
			 /* .line 2 */
		 } // :cond_0
		 p1 = 		 (( c.r.d.j0 ) p0 ).c ( ); // invoke-virtual {p0}, Lc/r/d/j0;->c()Z
		 /* if-nez p1, :cond_1 */
		 p1 = this.d;
		 (( androidx.recyclerview.widget.RecyclerView ) p1 ).getLayoutManager ( ); // invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$o;
		 if ( p1 != null) { // if-eqz p1, :cond_1
			 /* .line 3 */
			 p1 = this.d;
			 (( androidx.recyclerview.widget.RecyclerView ) p1 ).getLayoutManager ( ); // invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$o;
			 p1 = 			 (( androidx.recyclerview.widget.RecyclerView$o ) p1 ).a ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView$o;->a(ILandroid/os/Bundle;)Z
		 } // :cond_1
		 int p1 = 0; // const/4 p1, 0x0
	 } // .end method
	 public c.h.n.d b ( ) {
		 /* .locals 1 */
		 /* .line 6 */
		 v0 = this.e;
	 } // .end method
	 public void b ( android.view.View p0, android.view.accessibility.AccessibilityEvent p1 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-super {p0, p1, p2}, Lc/h/n/d;->b(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V */
		 /* .line 2 */
		 /* instance-of v0, p1, Landroidx/recyclerview/widget/RecyclerView; */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 v0 = 			 (( c.r.d.j0 ) p0 ).c ( ); // invoke-virtual {p0}, Lc/r/d/j0;->c()Z
			 /* if-nez v0, :cond_0 */
			 /* .line 3 */
			 /* check-cast p1, Landroidx/recyclerview/widget/RecyclerView; */
			 /* .line 4 */
			 (( androidx.recyclerview.widget.RecyclerView ) p1 ).getLayoutManager ( ); // invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$o;
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 /* .line 5 */
				 (( androidx.recyclerview.widget.RecyclerView ) p1 ).getLayoutManager ( ); // invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$o;
				 (( androidx.recyclerview.widget.RecyclerView$o ) p1 ).a ( p2 ); // invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView$o;->a(Landroid/view/accessibility/AccessibilityEvent;)V
			 } // :cond_0
			 return;
		 } // .end method
		 public Boolean c ( ) {
			 /* .locals 1 */
			 /* .line 1 */
			 v0 = this.d;
			 v0 = 			 (( androidx.recyclerview.widget.RecyclerView ) v0 ).p ( ); // invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->p()Z
		 } // .end method
