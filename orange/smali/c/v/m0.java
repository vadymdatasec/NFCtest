public class c.v.m0 extends c.v.l0 {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final c.e.b a; //synthetic
	 public final c.v.n0 b; //synthetic
	 /* # direct methods */
	 public c.v.m0 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.b = p1;
		 this.a = p2;
		 /* invoke-direct {p0}, Lc/v/l0;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void d ( c.v.k0 p0 ) {
		 /* .locals 2 */
		 /* .line 1 */
		 v0 = this.a;
		 v1 = this.b;
		 v1 = this.c;
		 (( c.e.i ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Lc/e/i;->get(Ljava/lang/Object;)Ljava/lang/Object;
		 /* check-cast v0, Ljava/util/ArrayList; */
		 /* .line 2 */
		 (( java.util.ArrayList ) v0 ).remove ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
		 return;
	 } // .end method
