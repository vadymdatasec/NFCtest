public abstract class c.f.a.l.n extends c.f.a.l.i {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public c.f.a.l.i k0;
	 public Integer l0;
	 /* # direct methods */
	 public c.f.a.l.n ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Lc/f/a/l/i;-><init>()V */
		 int v0 = 4; // const/4 v0, 0x4
		 /* new-array v0, v0, [Lc/f/a/l/i; */
		 /* .line 2 */
		 this.k0 = v0;
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 3 */
		 /* iput v0, p0, Lc/f/a/l/n;->l0:I */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void K ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 1 */
		 /* iput v0, p0, Lc/f/a/l/n;->l0:I */
		 return;
	 } // .end method
	 public void b ( Object p0 ) {
		 /* .locals 3 */
		 /* .line 1 */
		 /* iget v0, p0, Lc/f/a/l/n;->l0:I */
		 /* add-int/lit8 v0, v0, 0x1 */
		 v1 = this.k0;
		 /* array-length v2, v1 */
		 /* if-le v0, v2, :cond_0 */
		 /* .line 2 */
		 /* array-length v0, v1 */
		 /* mul-int/lit8 v0, v0, 0x2 */
		 java.util.Arrays .copyOf ( v1,v0 );
		 /* check-cast v0, [Lc/f/a/l/i; */
		 this.k0 = v0;
		 /* .line 3 */
	 } // :cond_0
	 v0 = this.k0;
	 /* iget v1, p0, Lc/f/a/l/n;->l0:I */
	 /* aput-object p1, v0, v1 */
	 /* add-int/lit8 v1, v1, 0x1 */
	 /* .line 4 */
	 /* iput v1, p0, Lc/f/a/l/n;->l0:I */
	 return;
} // .end method
