public class k.e1.k.j extends k.e1.b {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final Integer c; //synthetic
	 public final k.e1.k.a d; //synthetic
	 public final k.e1.k.x e; //synthetic
	 /* # direct methods */
	 public k.e1.k.j ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.e = p1;
		 /* iput p4, p0, Lk/e1/k/j;->c:I */
		 this.d = p5;
		 /* invoke-direct {p0, p2, p3}, Lk/e1/b;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void b ( ) {
		 /* .locals 3 */
		 /* .line 1 */
		 try { // :try_start_0
			 v0 = this.e;
			 /* iget v1, p0, Lk/e1/k/j;->c:I */
			 v2 = this.d;
			 (( k.e1.k.x ) v0 ).b ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lk/e1/k/x;->b(ILk/e1/k/a;)V
			 /* :try_end_0 */
			 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* .line 2 */
			 /* :catch_0 */
			 v0 = this.e;
			 k.e1.k.x .a ( v0 );
		 } // :goto_0
		 return;
	 } // .end method
