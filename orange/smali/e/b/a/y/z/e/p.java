public class e.b.a.y.z.e.p extends e.b.a.y.z.e.u {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public e.b.a.y.z.e.p ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Le/b/a/y/z/e/u;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public e.b.a.y.z.e.t a ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
		 /* .locals 2 */
		 /* .line 1 */
		 v0 = 		 (( e.b.a.y.z.e.p ) p0 ).b ( p1, p2, p3, p4 ); // invoke-virtual {p0, p1, p2, p3, p4}, Le/b/a/y/z/e/p;->b(IIII)F
		 /* const/high16 v1, 0x3f800000 # 1.0f */
		 /* cmpl-float v0, v0, v1 */
		 /* if-nez v0, :cond_0 */
		 /* .line 2 */
		 p1 = e.b.a.y.z.e.t.c;
		 /* .line 3 */
	 } // :cond_0
	 v0 = e.b.a.y.z.e.u.a;
	 (( e.b.a.y.z.e.u ) v0 ).a ( p1, p2, p3, p4 ); // invoke-virtual {v0, p1, p2, p3, p4}, Le/b/a/y/z/e/u;->a(IIII)Le/b/a/y/z/e/t;
} // :goto_0
} // .end method
public Float b ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 1 */
/* .line 1 */
v0 = e.b.a.y.z.e.u.a;
/* .line 2 */
p1 = (( e.b.a.y.z.e.u ) v0 ).b ( p1, p2, p3, p4 ); // invoke-virtual {v0, p1, p2, p3, p4}, Le/b/a/y/z/e/u;->b(IIII)F
/* const/high16 p2, 0x3f800000 # 1.0f */
/* .line 3 */
p1 = java.lang.Math .min ( p2,p1 );
} // .end method
