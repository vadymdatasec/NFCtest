public class c.b.q.j0 implements android.widget.AdapterView$OnItemClickListener {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final c.b.q.m0 b; //synthetic
	 /* # direct methods */
	 public c.b.q.j0 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.b = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onItemClick ( android.widget.AdapterView p0, android.view.View p1, Integer p2, Long p3 ) {
		 /* .locals 2 */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "(", */
		 /* "Landroid/widget/AdapterView<", */
		 /* "*>;", */
		 /* "Landroid/view/View;", */
		 /* "IJ)V" */
		 /* } */
	 } // .end annotation
	 /* .line 1 */
	 p1 = this.b;
	 p1 = this.N;
	 (( android.widget.Spinner ) p1 ).setSelection ( p3 ); // invoke-virtual {p1, p3}, Landroid/widget/Spinner;->setSelection(I)V
	 /* .line 2 */
	 p1 = this.b;
	 p1 = this.N;
	 (( android.widget.Spinner ) p1 ).getOnItemClickListener ( ); // invoke-virtual {p1}, Landroid/widget/Spinner;->getOnItemClickListener()Landroid/widget/AdapterView$OnItemClickListener;
	 if ( p1 != null) { // if-eqz p1, :cond_0
		 /* .line 3 */
		 p1 = this.b;
		 p4 = this.N;
		 p1 = this.K;
		 /* .line 4 */
		 /* move-result-wide v0 */
		 (( android.widget.Spinner ) p4 ).performItemClick ( p2, p3, v0, v1 ); // invoke-virtual {p4, p2, p3, v0, v1}, Landroid/widget/Spinner;->performItemClick(Landroid/view/View;IJ)Z
		 /* .line 5 */
	 } // :cond_0
	 p1 = this.b;
	 (( c.b.q.p1 ) p1 ).dismiss ( ); // invoke-virtual {p1}, Lc/b/q/p1;->dismiss()V
	 return;
} // .end method
