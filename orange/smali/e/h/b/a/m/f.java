public class e.h.b.a.m.f extends androidx.recyclerview.widget.RecyclerView$d0 {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final android.widget.ImageView t;
	 public final android.widget.TextView u;
	 /* # direct methods */
	 public e.h.b.a.m.f ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$d0;-><init>(Landroid/view/View;)V */
		 /* const v0, 0x7f080159 */
		 /* .line 2 */
		 (( android.view.View ) p1 ).findViewById ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
		 /* check-cast v0, Landroid/widget/ImageView; */
		 this.t = v0;
		 /* const v0, 0x7f08015a */
		 /* .line 3 */
		 (( android.view.View ) p1 ).findViewById ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;
		 /* check-cast p1, Landroid/widget/TextView; */
		 this.u = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public android.widget.ImageView C ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.t;
	 } // .end method
	 public android.widget.TextView D ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.u;
	 } // .end method
