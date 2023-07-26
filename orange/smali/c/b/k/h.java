public class c.b.k.h extends android.widget.ArrayAdapter {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Landroid/widget/ArrayAdapter<", */
	 /* "Ljava/lang/CharSequence;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* # instance fields */
public final androidx.appcompat.app.AlertController$RecycleListView b; //synthetic
public final c.b.k.m c; //synthetic
/* # direct methods */
public c.b.k.h ( ) {
	 /* .locals 0 */
	 /* .line 1 */
	 this.c = p1;
	 this.b = p6;
	 /* invoke-direct {p0, p2, p3, p4, p5}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;II[Ljava/lang/Object;)V */
	 return;
} // .end method
/* # virtual methods */
public android.view.View getView ( Integer p0, android.view.View p1, android.view.ViewGroup p2 ) {
	 /* .locals 1 */
	 /* .line 1 */
	 /* invoke-super {p0, p1, p2, p3}, Landroid/widget/ArrayAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View; */
	 /* .line 2 */
	 p3 = this.c;
	 p3 = this.F;
	 if ( p3 != null) { // if-eqz p3, :cond_0
		 /* .line 3 */
		 /* aget-boolean p3, p3, p1 */
		 if ( p3 != null) { // if-eqz p3, :cond_0
			 /* .line 4 */
			 p3 = this.b;
			 int v0 = 1; // const/4 v0, 0x1
			 (( android.widget.ListView ) p3 ).setItemChecked ( p1, v0 ); // invoke-virtual {p3, p1, v0}, Landroid/widget/ListView;->setItemChecked(IZ)V
		 } // :cond_0
	 } // .end method
