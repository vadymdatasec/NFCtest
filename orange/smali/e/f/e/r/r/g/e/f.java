public abstract class e.f.e.r.r.g.e.f extends e.f.e.r.r.g.e.i {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public e.f.e.r.r.g.e.f ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0, p1}, Le/f/e/r/r/g/e/i;-><init>(Le/f/e/o/a;)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.String c ( ) {
		 /* .locals 3 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Lcom/google/zxing/NotFoundException; */
		 /* } */
	 } // .end annotation
	 /* .line 1 */
	 (( e.f.e.r.r.g.e.j ) p0 ).b ( ); // invoke-virtual {p0}, Le/f/e/r/r/g/e/j;->b()Le/f/e/o/a;
	 v0 = 	 (( e.f.e.o.a ) v0 ).d ( ); // invoke-virtual {v0}, Le/f/e/o/a;->d()I
	 /* const/16 v1, 0x3c */
	 /* if-ne v0, v1, :cond_0 */
	 /* .line 2 */
	 /* new-instance v0, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
	 int v1 = 5; // const/4 v1, 0x5
	 /* .line 3 */
	 (( e.f.e.r.r.g.e.h ) p0 ).a ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Le/f/e/r/r/g/e/h;->a(Ljava/lang/StringBuilder;I)V
	 /* const/16 v1, 0x2d */
	 /* const/16 v2, 0xf */
	 /* .line 4 */
	 (( e.f.e.r.r.g.e.i ) p0 ).b ( v0, v1, v2 ); // invoke-virtual {p0, v0, v1, v2}, Le/f/e/r/r/g/e/i;->b(Ljava/lang/StringBuilder;II)V
	 /* .line 5 */
	 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 /* .line 6 */
} // :cond_0
com.google.zxing.NotFoundException .a ( );
/* throw v0 */
} // .end method
