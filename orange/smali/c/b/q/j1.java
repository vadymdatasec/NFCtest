public class c.b.q.j1 implements android.widget.AdapterView$OnItemSelectedListener {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final c.b.q.p1 b; //synthetic
	 /* # direct methods */
	 public c.b.q.j1 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.b = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onItemSelected ( android.widget.AdapterView p0, android.view.View p1, Integer p2, Long p3 ) {
		 /* .locals 0 */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "(", */
		 /* "Landroid/widget/AdapterView<", */
		 /* "*>;", */
		 /* "Landroid/view/View;", */
		 /* "IJ)V" */
		 /* } */
	 } // .end annotation
	 int p1 = -1; // const/4 p1, -0x1
	 /* if-eq p3, p1, :cond_0 */
	 /* .line 1 */
	 p1 = this.b;
	 p1 = this.d;
	 if ( p1 != null) { // if-eqz p1, :cond_0
		 int p2 = 0; // const/4 p2, 0x0
		 /* .line 2 */
		 (( c.b.q.d1 ) p1 ).setListSelectionHidden ( p2 ); // invoke-virtual {p1, p2}, Lc/b/q/d1;->setListSelectionHidden(Z)V
	 } // :cond_0
	 return;
} // .end method
public void onNothingSelected ( android.widget.AdapterView p0 ) {
	 /* .locals 0 */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "(", */
	 /* "Landroid/widget/AdapterView<", */
	 /* "*>;)V" */
	 /* } */
} // .end annotation
return;
} // .end method
