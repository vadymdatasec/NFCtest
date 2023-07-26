public class c.f.a.l.r extends c.f.a.l.s {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public Float c;
	 /* # direct methods */
	 public c.f.a.l.r ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Lc/f/a/l/s;-><init>()V */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 2 */
		 /* iput v0, p0, Lc/f/a/l/r;->c:F */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( Integer p0 ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* iget v0, p0, Lc/f/a/l/s;->b:I */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* iget v0, p0, Lc/f/a/l/r;->c:F */
			 /* int-to-float v1, p1 */
			 /* cmpl-float v0, v0, v1 */
			 if ( v0 != null) { // if-eqz v0, :cond_2
			 } // :cond_0
			 /* int-to-float p1, p1 */
			 /* .line 2 */
			 /* iput p1, p0, Lc/f/a/l/r;->c:F */
			 /* .line 3 */
			 /* iget p1, p0, Lc/f/a/l/s;->b:I */
			 int v0 = 1; // const/4 v0, 0x1
			 /* if-ne p1, v0, :cond_1 */
			 /* .line 4 */
			 (( c.f.a.l.s ) p0 ).b ( ); // invoke-virtual {p0}, Lc/f/a/l/s;->b()V
			 /* .line 5 */
		 } // :cond_1
		 (( c.f.a.l.s ) p0 ).a ( ); // invoke-virtual {p0}, Lc/f/a/l/s;->a()V
	 } // :cond_2
	 return;
} // .end method
public void d ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 /* invoke-super {p0}, Lc/f/a/l/s;->d()V */
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 2 */
	 /* iput v0, p0, Lc/f/a/l/r;->c:F */
	 return;
} // .end method
public void f ( ) {
	 /* .locals 1 */
	 int v0 = 2; // const/4 v0, 0x2
	 /* .line 1 */
	 /* iput v0, p0, Lc/f/a/l/s;->b:I */
	 return;
} // .end method
