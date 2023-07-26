public class c.r.d.p extends androidx.recyclerview.widget.RecyclerView$t {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final c.r.d.s a; //synthetic
	 /* # direct methods */
	 public c.r.d.p ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.a = p1;
		 /* invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$t;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( androidx.recyclerview.widget.RecyclerView p0, Integer p1, Integer p2 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 p2 = this.a;
		 p3 = 		 (( androidx.recyclerview.widget.RecyclerView ) p1 ).computeHorizontalScrollOffset ( ); // invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->computeHorizontalScrollOffset()I
		 /* .line 2 */
		 p1 = 		 (( androidx.recyclerview.widget.RecyclerView ) p1 ).computeVerticalScrollOffset ( ); // invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->computeVerticalScrollOffset()I
		 /* .line 3 */
		 (( c.r.d.s ) p2 ).a ( p3, p1 ); // invoke-virtual {p2, p3, p1}, Lc/r/d/s;->a(II)V
		 return;
	 } // .end method
