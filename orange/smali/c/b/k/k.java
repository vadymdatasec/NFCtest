public class c.b.k.k implements android.widget.AdapterView$OnItemClickListener {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final androidx.appcompat.app.AlertController$RecycleListView b; //synthetic
	 public final androidx.appcompat.app.AlertController c; //synthetic
	 public final c.b.k.m d; //synthetic
	 /* # direct methods */
	 public c.b.k.k ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.d = p1;
		 this.b = p2;
		 this.c = p3;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onItemClick ( android.widget.AdapterView p0, android.view.View p1, Integer p2, Long p3 ) {
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
	 /* .line 1 */
	 p1 = this.d;
	 p1 = this.F;
	 if ( p1 != null) { // if-eqz p1, :cond_0
		 /* .line 2 */
		 p2 = this.b;
		 p2 = 		 (( android.widget.ListView ) p2 ).isItemChecked ( p3 ); // invoke-virtual {p2, p3}, Landroid/widget/ListView;->isItemChecked(I)Z
		 /* aput-boolean p2, p1, p3 */
		 /* .line 3 */
	 } // :cond_0
	 p1 = this.d;
	 p1 = this.J;
	 p2 = this.c;
	 p2 = this.b;
	 p4 = this.b;
	 /* .line 4 */
	 p4 = 	 (( android.widget.ListView ) p4 ).isItemChecked ( p3 ); // invoke-virtual {p4, p3}, Landroid/widget/ListView;->isItemChecked(I)Z
	 /* .line 5 */
	 return;
} // .end method
