public class e.f.c.l.e.w.b implements e.f.c.l.e.w.d {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final Integer a;
	 /* # direct methods */
	 public e.f.c.l.e.w.b ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 /* iput p1, p0, Le/f/c/l/e/w/b;->a:I */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.StackTraceElement a ( java.lang.StackTraceElement[] p0 ) {
		 /* .locals 4 */
		 /* .line 1 */
		 /* array-length v0, p1 */
		 /* iget v1, p0, Le/f/c/l/e/w/b;->a:I */
		 /* if-gt v0, v1, :cond_0 */
		 /* .line 2 */
	 } // :cond_0
	 /* div-int/lit8 v0, v1, 0x2 */
	 /* sub-int v2, v1, v0 */
	 /* .line 3 */
	 /* new-array v1, v1, [Ljava/lang/StackTraceElement; */
	 int v3 = 0; // const/4 v3, 0x0
	 /* .line 4 */
	 java.lang.System .arraycopy ( p1,v3,v1,v3,v2 );
	 /* .line 5 */
	 /* array-length v3, p1 */
	 /* sub-int/2addr v3, v0 */
	 java.lang.System .arraycopy ( p1,v3,v1,v2,v0 );
} // .end method
