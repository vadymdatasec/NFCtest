public class e.b.a.y.z.e.r extends e.b.a.y.z.e.u {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public e.b.a.y.z.e.r ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Le/b/a/y/z/e/u;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public e.b.a.y.z.e.t a ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* sget-boolean p1, Le/b/a/y/z/e/u;->g:Z */
		 if ( p1 != null) { // if-eqz p1, :cond_0
			 /* .line 2 */
			 p1 = e.b.a.y.z.e.t.c;
			 /* .line 3 */
		 } // :cond_0
		 p1 = e.b.a.y.z.e.t.b;
	 } // .end method
	 public Float b ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* sget-boolean v0, Le/b/a/y/z/e/u;->g:Z */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* int-to-float p3, p3 */
			 /* int-to-float p1, p1 */
			 /* div-float/2addr p3, p1 */
			 /* int-to-float p1, p4 */
			 /* int-to-float p2, p2 */
			 /* div-float/2addr p1, p2 */
			 /* .line 2 */
			 p1 = 			 java.lang.Math .min ( p3,p1 );
			 /* .line 3 */
		 } // :cond_0
		 /* div-int/2addr p2, p4 */
		 /* div-int/2addr p1, p3 */
		 /* .line 4 */
		 p1 = 		 java.lang.Math .max ( p2,p1 );
		 /* const/high16 p2, 0x3f800000 # 1.0f */
		 /* if-nez p1, :cond_1 */
		 /* .line 5 */
	 } // :cond_1
	 p1 = 	 java.lang.Integer .highestOneBit ( p1 );
	 /* int-to-float p1, p1 */
	 /* div-float/2addr p2, p1 */
} // :goto_0
} // .end method
