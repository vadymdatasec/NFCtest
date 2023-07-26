public class k.e1.k.k extends k.e1.b {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final Integer c; //synthetic
	 public final Long d; //synthetic
	 public final k.e1.k.x e; //synthetic
	 /* # direct methods */
	 public k.e1.k.k ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.e = p1;
		 /* iput p4, p0, Lk/e1/k/k;->c:I */
		 /* iput-wide p5, p0, Lk/e1/k/k;->d:J */
		 /* invoke-direct {p0, p2, p3}, Lk/e1/b;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void b ( ) {
		 /* .locals 4 */
		 /* .line 1 */
		 try { // :try_start_0
			 v0 = this.e;
			 v0 = this.s;
			 /* iget v1, p0, Lk/e1/k/k;->c:I */
			 /* iget-wide v2, p0, Lk/e1/k/k;->d:J */
			 (( k.e1.k.f0 ) v0 ).a ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Lk/e1/k/f0;->a(IJ)V
			 /* :try_end_0 */
			 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* .line 2 */
			 /* :catch_0 */
			 v0 = this.e;
			 k.e1.k.x .a ( v0 );
		 } // :goto_0
		 return;
	 } // .end method
