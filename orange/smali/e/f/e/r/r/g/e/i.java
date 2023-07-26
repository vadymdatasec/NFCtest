public abstract class e.f.e.r.r.g.e.i extends e.f.e.r.r.g.e.h {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public e.f.e.r.r.g.e.i ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0, p1}, Le/f/e/r/r/g/e/h;-><init>(Le/f/e/o/a;)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public abstract Integer a ( Integer p0 ) {
	 } // .end method
	 public final void b ( java.lang.StringBuilder p0, Integer p1, Integer p2 ) {
		 /* .locals 2 */
		 /* .line 1 */
		 (( e.f.e.r.r.g.e.j ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/e/r/r/g/e/j;->a()Le/f/e/r/r/g/e/t;
		 p2 = 		 (( e.f.e.r.r.g.e.t ) v0 ).a ( p2, p3 ); // invoke-virtual {v0, p2, p3}, Le/f/e/r/r/g/e/t;->a(II)I
		 /* .line 2 */
		 (( e.f.e.r.r.g.e.i ) p0 ).c ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/f/e/r/r/g/e/i;->c(Ljava/lang/StringBuilder;I)V
		 /* .line 3 */
		 p2 = 		 (( e.f.e.r.r.g.e.i ) p0 ).a ( p2 ); // invoke-virtual {p0, p2}, Le/f/e/r/r/g/e/i;->a(I)I
		 /* const p3, 0x186a0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
	 int v1 = 5; // const/4 v1, 0x5
	 /* if-ge v0, v1, :cond_1 */
	 /* .line 4 */
	 /* div-int v1, p2, p3 */
	 /* if-nez v1, :cond_0 */
	 /* const/16 v1, 0x30 */
	 /* .line 5 */
	 (( java.lang.StringBuilder ) p1 ).append ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
	 /* .line 6 */
} // :cond_0
/* div-int/lit8 p3, p3, 0xa */
/* add-int/lit8 v0, v0, 0x1 */
/* .line 7 */
} // :cond_1
(( java.lang.StringBuilder ) p1 ).append ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
return;
} // .end method
public abstract void c ( java.lang.StringBuilder p0, Integer p1 ) {
} // .end method
