public class e.b.a.y.z.e.n extends e.b.a.y.z.e.u {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public e.b.a.y.z.e.n ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Le/b/a/y/z/e/u;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public e.b.a.y.z.e.t a ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 p1 = e.b.a.y.z.e.t.c;
	 } // .end method
	 public Float b ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* div-int/2addr p2, p4 */
		 /* div-int/2addr p1, p3 */
		 p1 = 		 java.lang.Math .min ( p2,p1 );
		 /* const/high16 p2, 0x3f800000 # 1.0f */
		 /* if-nez p1, :cond_0 */
		 /* .line 2 */
	 } // :cond_0
	 p1 = 	 java.lang.Integer .highestOneBit ( p1 );
	 /* int-to-float p1, p1 */
	 /* div-float/2addr p2, p1 */
} // :goto_0
} // .end method
