public class c.b.k.j implements android.widget.AdapterView$OnItemClickListener {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final androidx.appcompat.app.AlertController b; //synthetic
	 public final c.b.k.m c; //synthetic
	 /* # direct methods */
	 public c.b.k.j ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.c = p1;
		 this.b = p2;
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
	 p1 = this.c;
	 p1 = this.x;
	 p2 = this.b;
	 p2 = this.b;
	 /* .line 2 */
	 p1 = this.c;
	 /* iget-boolean p1, p1, Lc/b/k/m;->H:Z */
	 /* if-nez p1, :cond_0 */
	 /* .line 3 */
	 p1 = this.b;
	 p1 = this.b;
	 (( android.app.Dialog ) p1 ).dismiss ( ); // invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V
} // :cond_0
return;
} // .end method
