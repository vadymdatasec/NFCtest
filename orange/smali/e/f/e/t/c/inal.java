public class inal extends e.f.e.l {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final Float c;
	 /* # direct methods */
	 public inal ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0, p1, p2}, Le/f/e/l;-><init>(FF)V */
		 /* .line 2 */
		 /* iput p3, p0, Le/f/e/t/c/a;->c:F */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Boolean a ( Float p0, Float p1, Float p2 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = 		 (( e.f.e.l ) p0 ).b ( ); // invoke-virtual {p0}, Le/f/e/l;->b()F
		 /* sub-float/2addr p2, v0 */
		 p2 = 		 java.lang.Math .abs ( p2 );
		 int v0 = 0; // const/4 v0, 0x0
		 /* cmpg-float p2, p2, p1 */
		 /* if-gtz p2, :cond_2 */
		 p2 = 		 (( e.f.e.l ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/e/l;->a()F
		 /* sub-float/2addr p3, p2 */
		 p2 = 		 java.lang.Math .abs ( p3 );
		 /* cmpg-float p2, p2, p1 */
		 /* if-gtz p2, :cond_2 */
		 /* .line 2 */
		 /* iget p2, p0, Le/f/e/t/c/a;->c:F */
		 /* sub-float/2addr p1, p2 */
		 p1 = 		 java.lang.Math .abs ( p1 );
		 /* const/high16 p2, 0x3f800000 # 1.0f */
		 /* cmpg-float p2, p1, p2 */
		 /* if-lez p2, :cond_1 */
		 /* .line 3 */
		 /* iget p2, p0, Le/f/e/t/c/a;->c:F */
		 /* cmpg-float p1, p1, p2 */
		 /* if-gtz p1, :cond_0 */
	 } // :cond_0
} // :cond_1
} // :goto_0
int p1 = 1; // const/4 p1, 0x1
} // :cond_2
} // .end method
public e.f.e.t.c.a b ( Float p0, Float p1, Float p2 ) {
/* .locals 2 */
/* .line 1 */
v0 = (( e.f.e.l ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/e/l;->a()F
/* add-float/2addr v0, p2 */
/* const/high16 p2, 0x40000000 # 2.0f */
/* div-float/2addr v0, p2 */
/* .line 2 */
v1 = (( e.f.e.l ) p0 ).b ( ); // invoke-virtual {p0}, Le/f/e/l;->b()F
/* add-float/2addr v1, p1 */
/* div-float/2addr v1, p2 */
/* .line 3 */
/* iget p1, p0, Le/f/e/t/c/a;->c:F */
/* add-float/2addr p1, p3 */
/* div-float/2addr p1, p2 */
/* .line 4 */
/* new-instance p2, Le/f/e/t/c/a; */
/* invoke-direct {p2, v0, v1, p1}, Le/f/e/t/c/a;-><init>(FFF)V */
} // .end method
