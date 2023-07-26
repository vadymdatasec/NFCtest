public class c.v.n {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public Integer a;
	 public Integer b;
	 public Integer c;
	 public Integer d;
	 public android.view.View e;
	 public Integer f;
	 public Integer g;
	 /* # direct methods */
	 public c.v.n ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.e = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final void a ( ) {
		 /* .locals 5 */
		 /* .line 6 */
		 v0 = this.e;
		 /* iget v1, p0, Lc/v/n;->a:I */
		 /* iget v2, p0, Lc/v/n;->b:I */
		 /* iget v3, p0, Lc/v/n;->c:I */
		 /* iget v4, p0, Lc/v/n;->d:I */
		 c.v.j1 .a ( v0,v1,v2,v3,v4 );
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 7 */
		 /* iput v0, p0, Lc/v/n;->f:I */
		 /* .line 8 */
		 /* iput v0, p0, Lc/v/n;->g:I */
		 return;
	 } // .end method
	 public void a ( android.graphics.PointF p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* iget v0, p1, Landroid/graphics/PointF;->x:F */
		 v0 = 		 java.lang.Math .round ( v0 );
		 /* iput v0, p0, Lc/v/n;->c:I */
		 /* .line 2 */
		 /* iget p1, p1, Landroid/graphics/PointF;->y:F */
		 p1 = 		 java.lang.Math .round ( p1 );
		 /* iput p1, p0, Lc/v/n;->d:I */
		 /* .line 3 */
		 /* iget p1, p0, Lc/v/n;->g:I */
		 /* add-int/lit8 p1, p1, 0x1 */
		 /* iput p1, p0, Lc/v/n;->g:I */
		 /* .line 4 */
		 /* iget v0, p0, Lc/v/n;->f:I */
		 /* if-ne v0, p1, :cond_0 */
		 /* .line 5 */
		 (( c.v.n ) p0 ).a ( ); // invoke-virtual {p0}, Lc/v/n;->a()V
	 } // :cond_0
	 return;
} // .end method
public void b ( android.graphics.PointF p0 ) {
	 /* .locals 1 */
	 /* .line 1 */
	 /* iget v0, p1, Landroid/graphics/PointF;->x:F */
	 v0 = 	 java.lang.Math .round ( v0 );
	 /* iput v0, p0, Lc/v/n;->a:I */
	 /* .line 2 */
	 /* iget p1, p1, Landroid/graphics/PointF;->y:F */
	 p1 = 	 java.lang.Math .round ( p1 );
	 /* iput p1, p0, Lc/v/n;->b:I */
	 /* .line 3 */
	 /* iget p1, p0, Lc/v/n;->f:I */
	 /* add-int/lit8 p1, p1, 0x1 */
	 /* iput p1, p0, Lc/v/n;->f:I */
	 /* .line 4 */
	 /* iget v0, p0, Lc/v/n;->g:I */
	 /* if-ne p1, v0, :cond_0 */
	 /* .line 5 */
	 (( c.v.n ) p0 ).a ( ); // invoke-virtual {p0}, Lc/v/n;->a()V
} // :cond_0
return;
} // .end method
