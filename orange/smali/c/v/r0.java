public class c.v.r0 extends c.v.l0 {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public c.v.s0 a;
	 /* # direct methods */
	 public c.v.r0 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Lc/v/l0;-><init>()V */
		 /* .line 2 */
		 this.a = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void c ( c.v.k0 p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 p1 = this.a;
		 /* iget-boolean v0, p1, Lc/v/s0;->N:Z */
		 /* if-nez v0, :cond_0 */
		 /* .line 2 */
		 (( c.v.k0 ) p1 ).p ( ); // invoke-virtual {p1}, Lc/v/k0;->p()V
		 /* .line 3 */
		 p1 = this.a;
		 int v0 = 1; // const/4 v0, 0x1
		 /* iput-boolean v0, p1, Lc/v/s0;->N:Z */
	 } // :cond_0
	 return;
} // .end method
public void d ( c.v.k0 p0 ) {
	 /* .locals 2 */
	 /* .line 1 */
	 v0 = this.a;
	 /* iget v1, v0, Lc/v/s0;->M:I */
	 /* add-int/lit8 v1, v1, -0x1 */
	 /* iput v1, v0, Lc/v/s0;->M:I */
	 /* if-nez v1, :cond_0 */
	 int v1 = 0; // const/4 v1, 0x0
	 /* .line 2 */
	 /* iput-boolean v1, v0, Lc/v/s0;->N:Z */
	 /* .line 3 */
	 (( c.v.k0 ) v0 ).a ( ); // invoke-virtual {v0}, Lc/v/k0;->a()V
	 /* .line 4 */
} // :cond_0
(( c.v.k0 ) p1 ).b ( p0 ); // invoke-virtual {p1, p0}, Lc/v/k0;->b(Lc/v/j0;)Lc/v/k0;
return;
} // .end method
