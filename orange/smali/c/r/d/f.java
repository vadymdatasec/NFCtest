public class c.r.d.f implements java.lang.Runnable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final java.util.ArrayList b; //synthetic
	 public final c.r.d.n c; //synthetic
	 /* # direct methods */
	 public c.r.d.f ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.c = p1;
		 this.b = p2;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void run ( ) {
		 /* .locals 3 */
		 /* .line 1 */
		 v0 = this.b;
		 (( java.util.ArrayList ) v0 ).iterator ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
	 v1 = 	 } // :goto_0
	 if ( v1 != null) { // if-eqz v1, :cond_0
		 /* check-cast v1, Landroidx/recyclerview/widget/RecyclerView$d0; */
		 /* .line 2 */
		 v2 = this.c;
		 (( c.r.d.n ) v2 ).t ( v1 ); // invoke-virtual {v2, v1}, Lc/r/d/n;->t(Landroidx/recyclerview/widget/RecyclerView$d0;)V
		 /* .line 3 */
	 } // :cond_0
	 v0 = this.b;
	 (( java.util.ArrayList ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
	 /* .line 4 */
	 v0 = this.c;
	 v0 = this.l;
	 v1 = this.b;
	 (( java.util.ArrayList ) v0 ).remove ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
	 return;
} // .end method
