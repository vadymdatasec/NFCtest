public class e.b.a.y.z.e.o extends e.b.a.y.z.e.u {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public e.b.a.y.z.e.o ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Le/b/a/y/z/e/u;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public e.b.a.y.z.e.t a ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 p1 = e.b.a.y.z.e.t.b;
	 } // .end method
	 public Float b ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
		 /* .locals 0 */
		 /* int-to-float p2, p2 */
		 /* int-to-float p4, p4 */
		 /* div-float/2addr p2, p4 */
		 /* int-to-float p1, p1 */
		 /* int-to-float p3, p3 */
		 /* div-float/2addr p1, p3 */
		 /* .line 1 */
		 p1 = 		 java.lang.Math .max ( p2,p1 );
		 /* float-to-double p1, p1 */
		 /* .line 2 */
		 java.lang.Math .ceil ( p1,p2 );
		 /* move-result-wide p1 */
		 /* double-to-int p1, p1 */
		 /* .line 3 */
		 p2 = 		 java.lang.Integer .highestOneBit ( p1 );
		 int p3 = 1; // const/4 p3, 0x1
		 p2 = 		 java.lang.Math .max ( p3,p2 );
		 /* if-ge p2, p1, :cond_0 */
	 } // :cond_0
	 int p3 = 0; // const/4 p3, 0x0
} // :goto_0
/* shl-int p1, p2, p3 */
/* const/high16 p2, 0x3f800000 # 1.0f */
/* int-to-float p1, p1 */
/* div-float/2addr p2, p1 */
} // .end method
