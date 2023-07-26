public class c.b.q.i0 implements android.widget.ListAdapter implements android.widget.SpinnerAdapter {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public android.widget.SpinnerAdapter b;
	 public android.widget.ListAdapter c;
	 /* # direct methods */
	 public c.b.q.i0 ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.b = p1;
		 /* .line 3 */
		 /* instance-of v0, p1, Landroid/widget/ListAdapter; */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 4 */
			 /* move-object v0, p1 */
			 /* check-cast v0, Landroid/widget/ListAdapter; */
			 this.c = v0;
		 } // :cond_0
		 if ( p2 != null) { // if-eqz p2, :cond_1
			 /* .line 5 */
			 /* const/16 v1, 0x17 */
			 /* if-lt v0, v1, :cond_1 */
			 /* instance-of v0, p1, Landroid/widget/ThemedSpinnerAdapter; */
			 if ( v0 != null) { // if-eqz v0, :cond_1
				 /* .line 6 */
				 /* check-cast p1, Landroid/widget/ThemedSpinnerAdapter; */
				 /* .line 7 */
				 /* if-eq v0, p2, :cond_1 */
				 /* .line 8 */
			 } // :cond_1
			 return;
		 } // .end method
		 /* # virtual methods */
		 public Boolean areAllItemsEnabled ( ) {
			 /* .locals 1 */
			 /* .line 1 */
			 v0 = this.c;
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 v0 = 				 /* .line 2 */
			 } // :cond_0
			 int v0 = 1; // const/4 v0, 0x1
		 } // .end method
		 public Integer getCount ( ) {
			 /* .locals 1 */
			 /* .line 1 */
			 v0 = this.b;
			 /* if-nez v0, :cond_0 */
			 int v0 = 0; // const/4 v0, 0x0
		 v0 = 		 } // :cond_0
	 } // :goto_0
} // .end method
public android.view.View getDropDownView ( Integer p0, android.view.View p1, android.view.ViewGroup p2 ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = this.b;
	 /* if-nez v0, :cond_0 */
	 int p1 = 0; // const/4 p1, 0x0
	 /* .line 2 */
} // :cond_0
} // :goto_0
} // .end method
public java.lang.Object getItem ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
/* if-nez v0, :cond_0 */
int p1 = 0; // const/4 p1, 0x0
} // :cond_0
} // :goto_0
} // .end method
public Long getItemId ( Integer p0 ) {
/* .locals 2 */
/* .line 1 */
v0 = this.b;
/* if-nez v0, :cond_0 */
/* const-wide/16 v0, -0x1 */
} // :cond_0
/* move-result-wide v0 */
} // :goto_0
/* return-wide v0 */
} // .end method
public Integer getItemViewType ( Integer p0 ) {
/* .locals 0 */
int p1 = 0; // const/4 p1, 0x0
} // .end method
public android.view.View getView ( Integer p0, android.view.View p1, android.view.ViewGroup p2 ) {
/* .locals 0 */
/* .line 1 */
(( c.b.q.i0 ) p0 ).getDropDownView ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Lc/b/q/i0;->getDropDownView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
} // .end method
public Integer getViewTypeCount ( ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
} // .end method
public Boolean hasStableIds ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
v0 = if ( v0 != null) { // if-eqz v0, :cond_0
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public Boolean isEmpty ( ) {
/* .locals 1 */
/* .line 1 */
v0 = (( c.b.q.i0 ) p0 ).getCount ( ); // invoke-virtual {p0}, Lc/b/q/i0;->getCount()I
/* if-nez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public Boolean isEnabled ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.c;
if ( v0 != null) { // if-eqz v0, :cond_0
p1 = /* .line 2 */
} // :cond_0
int p1 = 1; // const/4 p1, 0x1
} // .end method
public void registerDataSetObserver ( android.database.DataSetObserver p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
} // :cond_0
return;
} // .end method
public void unregisterDataSetObserver ( android.database.DataSetObserver p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
} // :cond_0
return;
} // .end method
