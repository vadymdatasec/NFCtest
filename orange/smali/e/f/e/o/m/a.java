public abstract class e.f.e.o.m.a {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static Float a ( Float p0, Float p1, Float p2, Float p3 ) {
		 /* .locals 0 */
		 /* sub-float/2addr p0, p2 */
		 /* sub-float/2addr p1, p3 */
		 /* mul-float p0, p0, p0 */
		 /* mul-float p1, p1, p1 */
		 /* add-float/2addr p0, p1 */
		 /* float-to-double p0, p0 */
		 /* .line 1 */
		 java.lang.Math .sqrt ( p0,p1 );
		 /* move-result-wide p0 */
		 /* double-to-float p0, p0 */
	 } // .end method
	 public static Float a ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
		 /* .locals 0 */
		 /* sub-int/2addr p0, p2 */
		 /* sub-int/2addr p1, p3 */
		 /* mul-int p0, p0, p0 */
		 /* mul-int p1, p1, p1 */
		 /* add-int/2addr p0, p1 */
		 /* int-to-double p0, p0 */
		 /* .line 2 */
		 java.lang.Math .sqrt ( p0,p1 );
		 /* move-result-wide p0 */
		 /* double-to-float p0, p0 */
	 } // .end method
	 public static Integer a ( Float p0 ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* cmpg-float v0, p0, v0 */
		 /* if-gez v0, :cond_0 */
		 /* const/high16 v0, -0x41000000 # -0.5f */
	 } // :cond_0
	 /* const/high16 v0, 0x3f000000 # 0.5f */
} // :goto_0
/* add-float/2addr p0, v0 */
/* float-to-int p0, p0 */
} // .end method
public static Integer a ( Integer[] p0 ) {
/* .locals 4 */
/* .line 3 */
/* array-length v0, p0 */
int v1 = 0; // const/4 v1, 0x0
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v1, v0, :cond_0 */
/* aget v3, p0, v1 */
/* add-int/2addr v2, v3 */
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_0
} // .end method
