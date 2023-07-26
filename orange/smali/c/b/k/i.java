public class c.b.k.i extends android.widget.CursorAdapter {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final Integer b;
	 public final Integer c;
	 public final androidx.appcompat.app.AlertController$RecycleListView d; //synthetic
	 public final androidx.appcompat.app.AlertController e; //synthetic
	 public final c.b.k.m f; //synthetic
	 /* # direct methods */
	 public c.b.k.i ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.f = p1;
		 this.d = p5;
		 this.e = p6;
		 /* invoke-direct {p0, p2, p3, p4}, Landroid/widget/CursorAdapter;-><init>(Landroid/content/Context;Landroid/database/Cursor;Z)V */
		 /* .line 2 */
		 (( android.widget.CursorAdapter ) p0 ).getCursor ( ); // invoke-virtual {p0}, Landroid/widget/CursorAdapter;->getCursor()Landroid/database/Cursor;
		 /* .line 3 */
		 p2 = this.f;
		 p2 = 		 p2 = this.L;
		 /* iput p2, p0, Lc/b/k/i;->b:I */
		 /* .line 4 */
		 p2 = this.f;
		 p1 = 		 p2 = this.M;
		 /* iput p1, p0, Lc/b/k/i;->c:I */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void bindView ( android.view.View p0, android.content.Context p1, android.database.Cursor p2 ) {
		 /* .locals 1 */
		 /* const p2, 0x1020014 */
		 /* .line 1 */
		 (( android.view.View ) p1 ).findViewById ( p2 ); // invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;
		 /* check-cast p1, Landroid/widget/CheckedTextView; */
		 /* .line 2 */
		 /* iget p2, p0, Lc/b/k/i;->b:I */
		 (( android.widget.CheckedTextView ) p1 ).setText ( p2 ); // invoke-virtual {p1, p2}, Landroid/widget/CheckedTextView;->setText(Ljava/lang/CharSequence;)V
		 /* .line 3 */
		 p2 = 		 p1 = this.d;
		 /* iget v0, p0, Lc/b/k/i;->c:I */
		 p3 = 		 /* .line 4 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* if-ne p3, v0, :cond_0 */
	 } // :cond_0
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 5 */
} // :goto_0
(( android.widget.ListView ) p1 ).setItemChecked ( p2, v0 ); // invoke-virtual {p1, p2, v0}, Landroid/widget/ListView;->setItemChecked(IZ)V
return;
} // .end method
public android.view.View newView ( android.content.Context p0, android.database.Cursor p1, android.view.ViewGroup p2 ) {
/* .locals 1 */
/* .line 1 */
p1 = this.f;
p1 = this.b;
p2 = this.e;
/* iget p2, p2, Landroidx/appcompat/app/AlertController;->M:I */
int v0 = 0; // const/4 v0, 0x0
(( android.view.LayoutInflater ) p1 ).inflate ( p2, p3, v0 ); // invoke-virtual {p1, p2, p3, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;
} // .end method
