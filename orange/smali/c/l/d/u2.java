public class c.l.d.u2 implements java.lang.Runnable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final Integer b; //synthetic
	 public final java.util.ArrayList c; //synthetic
	 public final java.util.ArrayList d; //synthetic
	 public final java.util.ArrayList e; //synthetic
	 public final java.util.ArrayList f; //synthetic
	 /* # direct methods */
	 public c.l.d.u2 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* iput p2, p0, Lc/l/d/u2;->b:I */
		 this.c = p3;
		 this.d = p4;
		 this.e = p5;
		 this.f = p6;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void run ( ) {
		 /* .locals 3 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 1 */
	 } // :goto_0
	 /* iget v1, p0, Lc/l/d/u2;->b:I */
	 /* if-ge v0, v1, :cond_0 */
	 /* .line 2 */
	 v1 = this.c;
	 (( java.util.ArrayList ) v1 ).get ( v0 ); // invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
	 /* check-cast v1, Landroid/view/View; */
	 v2 = this.d;
	 (( java.util.ArrayList ) v2 ).get ( v0 ); // invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
	 /* check-cast v2, Ljava/lang/String; */
	 c.h.n.v0 .a ( v1,v2 );
	 /* .line 3 */
	 v1 = this.e;
	 (( java.util.ArrayList ) v1 ).get ( v0 ); // invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
	 /* check-cast v1, Landroid/view/View; */
	 v2 = this.f;
	 (( java.util.ArrayList ) v2 ).get ( v0 ); // invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
	 /* check-cast v2, Ljava/lang/String; */
	 c.h.n.v0 .a ( v1,v2 );
	 /* add-int/lit8 v0, v0, 0x1 */
} // :cond_0
return;
} // .end method
