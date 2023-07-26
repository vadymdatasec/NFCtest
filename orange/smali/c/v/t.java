public class c.v.t implements c.v.j0 {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final android.view.View a; //synthetic
	 public final java.util.ArrayList b; //synthetic
	 /* # direct methods */
	 public c.v.t ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.a = p2;
		 this.b = p3;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( c.v.k0 p0 ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 public void b ( c.v.k0 p0 ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 public void c ( c.v.k0 p0 ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 public void d ( c.v.k0 p0 ) {
		 /* .locals 3 */
		 /* .line 1 */
		 (( c.v.k0 ) p1 ).b ( p0 ); // invoke-virtual {p1, p0}, Lc/v/k0;->b(Lc/v/j0;)Lc/v/k0;
		 /* .line 2 */
		 p1 = this.a;
		 /* const/16 v0, 0x8 */
		 (( android.view.View ) p1 ).setVisibility ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V
		 /* .line 3 */
		 p1 = this.b;
		 p1 = 		 (( java.util.ArrayList ) p1 ).size ( ); // invoke-virtual {p1}, Ljava/util/ArrayList;->size()I
		 int v0 = 0; // const/4 v0, 0x0
		 int v1 = 0; // const/4 v1, 0x0
	 } // :goto_0
	 /* if-ge v1, p1, :cond_0 */
	 /* .line 4 */
	 v2 = this.b;
	 (( java.util.ArrayList ) v2 ).get ( v1 ); // invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
	 /* check-cast v2, Landroid/view/View; */
	 (( android.view.View ) v2 ).setVisibility ( v0 ); // invoke-virtual {v2, v0}, Landroid/view/View;->setVisibility(I)V
	 /* add-int/lit8 v1, v1, 0x1 */
} // :cond_0
return;
} // .end method
