public class c.i.a.e extends android.widget.Filter {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public c.i.a.d a;
	 /* # direct methods */
	 public c.i.a.e ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Landroid/widget/Filter;-><init>()V */
		 /* .line 2 */
		 this.a = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.CharSequence convertResultToString ( java.lang.Object p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.a;
		 /* check-cast p1, Landroid/database/Cursor; */
	 } // .end method
	 public android.widget.Filter$FilterResults performFiltering ( java.lang.CharSequence p0 ) {
		 /* .locals 2 */
		 /* .line 1 */
		 v0 = this.a;
		 /* .line 2 */
		 /* new-instance v0, Landroid/widget/Filter$FilterResults; */
		 /* invoke-direct {v0}, Landroid/widget/Filter$FilterResults;-><init>()V */
		 if ( p1 != null) { // if-eqz p1, :cond_0
			 v1 = 			 /* .line 3 */
			 /* iput v1, v0, Landroid/widget/Filter$FilterResults;->count:I */
			 /* .line 4 */
			 this.values = p1;
		 } // :cond_0
		 int p1 = 0; // const/4 p1, 0x0
		 /* .line 5 */
		 /* iput p1, v0, Landroid/widget/Filter$FilterResults;->count:I */
		 int p1 = 0; // const/4 p1, 0x0
		 /* .line 6 */
		 this.values = p1;
	 } // :goto_0
} // .end method
public void publishResults ( java.lang.CharSequence p0, android.widget.Filter$FilterResults p1 ) {
	 /* .locals 0 */
	 /* .line 1 */
	 p1 = this.a;
	 /* .line 2 */
	 p2 = this.values;
	 if ( p2 != null) { // if-eqz p2, :cond_0
		 /* if-eq p2, p1, :cond_0 */
		 /* .line 3 */
		 p1 = this.a;
		 /* check-cast p2, Landroid/database/Cursor; */
	 } // :cond_0
	 return;
} // .end method
