public class c.r.d.e0 implements c.r.d.p0 {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final androidx.recyclerview.widget.RecyclerView$o a; //synthetic
	 /* # direct methods */
	 public c.r.d.e0 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.a = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Integer a ( ) {
		 /* .locals 2 */
		 /* .line 2 */
		 v0 = this.a;
		 v0 = 		 (( androidx.recyclerview.widget.RecyclerView$o ) v0 ).q ( ); // invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$o;->q()I
		 v1 = this.a;
		 v1 = 		 (( androidx.recyclerview.widget.RecyclerView$o ) v1 ).o ( ); // invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$o;->o()I
		 /* sub-int/2addr v0, v1 */
	 } // .end method
	 public Integer a ( android.view.View p0 ) {
		 /* .locals 2 */
		 /* .line 3 */
		 (( android.view.View ) p1 ).getLayoutParams ( ); // invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
		 /* check-cast v0, Landroidx/recyclerview/widget/RecyclerView$p; */
		 /* .line 4 */
		 v1 = this.a;
		 p1 = 		 (( androidx.recyclerview.widget.RecyclerView$o ) v1 ).i ( p1 ); // invoke-virtual {v1, p1}, Landroidx/recyclerview/widget/RecyclerView$o;->i(Landroid/view/View;)I
		 /* iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I */
		 /* add-int/2addr p1, v0 */
	 } // .end method
	 public android.view.View a ( Integer p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.a;
		 (( androidx.recyclerview.widget.RecyclerView$o ) v0 ).c ( p1 ); // invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView$o;->c(I)Landroid/view/View;
	 } // .end method
	 public Integer b ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.a;
		 v0 = 		 (( androidx.recyclerview.widget.RecyclerView$o ) v0 ).n ( ); // invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$o;->n()I
	 } // .end method
	 public Integer b ( android.view.View p0 ) {
		 /* .locals 2 */
		 /* .line 2 */
		 (( android.view.View ) p1 ).getLayoutParams ( ); // invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
		 /* check-cast v0, Landroidx/recyclerview/widget/RecyclerView$p; */
		 /* .line 3 */
		 v1 = this.a;
		 p1 = 		 (( androidx.recyclerview.widget.RecyclerView$o ) v1 ).f ( p1 ); // invoke-virtual {v1, p1}, Landroidx/recyclerview/widget/RecyclerView$o;->f(Landroid/view/View;)I
		 /* iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I */
		 /* sub-int/2addr p1, v0 */
	 } // .end method
