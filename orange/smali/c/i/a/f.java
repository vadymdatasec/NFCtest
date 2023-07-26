public abstract class c.i.a.f extends c.i.a.c {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public Integer j;
	 public Integer k;
	 public android.view.LayoutInflater l;
	 /* # direct methods */
	 public c.i.a.f ( ) {
		 /* .locals 0 */
		 /* .annotation runtime Ljava/lang/Deprecated; */
	 } // .end annotation
	 /* .line 1 */
	 /* invoke-direct {p0, p1, p3, p4}, Lc/i/a/c;-><init>(Landroid/content/Context;Landroid/database/Cursor;Z)V */
	 /* .line 2 */
	 /* iput p2, p0, Lc/i/a/f;->k:I */
	 /* iput p2, p0, Lc/i/a/f;->j:I */
	 final String p2 = "layout_inflater"; // const-string p2, "layout_inflater"
	 /* .line 3 */
	 (( android.content.Context ) p1 ).getSystemService ( p2 ); // invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
	 /* check-cast p1, Landroid/view/LayoutInflater; */
	 this.l = p1;
	 return;
} // .end method
/* # virtual methods */
public android.view.View a ( android.content.Context p0, android.database.Cursor p1, android.view.ViewGroup p2 ) {
	 /* .locals 1 */
	 /* .line 1 */
	 p1 = this.l;
	 /* iget p2, p0, Lc/i/a/f;->k:I */
	 int v0 = 0; // const/4 v0, 0x0
	 (( android.view.LayoutInflater ) p1 ).inflate ( p2, p3, v0 ); // invoke-virtual {p1, p2, p3, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;
} // .end method
public android.view.View b ( android.content.Context p0, android.database.Cursor p1, android.view.ViewGroup p2 ) {
	 /* .locals 1 */
	 /* .line 1 */
	 p1 = this.l;
	 /* iget p2, p0, Lc/i/a/f;->j:I */
	 int v0 = 0; // const/4 v0, 0x0
	 (( android.view.LayoutInflater ) p1 ).inflate ( p2, p3, v0 ); // invoke-virtual {p1, p2, p3, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;
} // .end method
