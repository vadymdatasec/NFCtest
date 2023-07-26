public class c.b.k.v implements java.lang.Runnable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final c.b.k.n0 b; //synthetic
	 /* # direct methods */
	 public c.b.k.v ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.b = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void run ( ) {
		 /* .locals 3 */
		 /* .line 1 */
		 v0 = this.b;
		 /* iget v1, v0, Lc/b/k/n0;->V:I */
		 /* and-int/lit8 v1, v1, 0x1 */
		 int v2 = 0; // const/4 v2, 0x0
		 if ( v1 != null) { // if-eqz v1, :cond_0
			 /* .line 2 */
			 (( c.b.k.n0 ) v0 ).f ( v2 ); // invoke-virtual {v0, v2}, Lc/b/k/n0;->f(I)V
			 /* .line 3 */
		 } // :cond_0
		 v0 = this.b;
		 /* iget v1, v0, Lc/b/k/n0;->V:I */
		 /* and-int/lit16 v1, v1, 0x1000 */
		 if ( v1 != null) { // if-eqz v1, :cond_1
			 /* const/16 v1, 0x6c */
			 /* .line 4 */
			 (( c.b.k.n0 ) v0 ).f ( v1 ); // invoke-virtual {v0, v1}, Lc/b/k/n0;->f(I)V
			 /* .line 5 */
		 } // :cond_1
		 v0 = this.b;
		 /* iput-boolean v2, v0, Lc/b/k/n0;->U:Z */
		 /* .line 6 */
		 /* iput v2, v0, Lc/b/k/n0;->V:I */
		 return;
	 } // .end method
