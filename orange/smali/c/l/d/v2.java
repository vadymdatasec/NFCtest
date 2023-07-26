public class c.l.d.v2 implements java.lang.Runnable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final java.util.ArrayList b; //synthetic
	 public final java.util.Map c; //synthetic
	 /* # direct methods */
	 public c.l.d.v2 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.b = p2;
		 this.c = p3;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void run ( ) {
		 /* .locals 5 */
		 /* .line 1 */
		 v0 = this.b;
		 v0 = 		 (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
		 int v1 = 0; // const/4 v1, 0x0
	 } // :goto_0
	 /* if-ge v1, v0, :cond_1 */
	 /* .line 2 */
	 v2 = this.b;
	 (( java.util.ArrayList ) v2 ).get ( v1 ); // invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
	 /* check-cast v2, Landroid/view/View; */
	 /* .line 3 */
	 c.h.n.v0 .v ( v2 );
	 if ( v3 != null) { // if-eqz v3, :cond_0
		 /* .line 4 */
		 v4 = this.c;
		 c.l.d.x2 .a ( v4,v3 );
		 /* .line 5 */
		 c.h.n.v0 .a ( v2,v3 );
	 } // :cond_0
	 /* add-int/lit8 v1, v1, 0x1 */
} // :cond_1
return;
} // .end method
