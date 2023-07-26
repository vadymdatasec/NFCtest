public class c.i.a.b extends android.database.DataSetObserver {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final c.i.a.c a; //synthetic
	 /* # direct methods */
	 public c.i.a.b ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.a = p1;
		 /* invoke-direct {p0}, Landroid/database/DataSetObserver;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onChanged ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 v0 = this.a;
		 int v1 = 1; // const/4 v1, 0x1
		 /* iput-boolean v1, v0, Lc/i/a/c;->b:Z */
		 /* .line 2 */
		 (( android.widget.BaseAdapter ) v0 ).notifyDataSetChanged ( ); // invoke-virtual {v0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V
		 return;
	 } // .end method
	 public void onInvalidated ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 v0 = this.a;
		 int v1 = 0; // const/4 v1, 0x0
		 /* iput-boolean v1, v0, Lc/i/a/c;->b:Z */
		 /* .line 2 */
		 (( android.widget.BaseAdapter ) v0 ).notifyDataSetInvalidated ( ); // invoke-virtual {v0}, Landroid/widget/BaseAdapter;->notifyDataSetInvalidated()V
		 return;
	 } // .end method
