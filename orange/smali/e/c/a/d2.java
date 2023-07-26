public class e.c.a.d2 implements e.c.a.j0 {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public android.graphics.Path a;
	 public Float b;
	 public Float c;
	 /* # direct methods */
	 public e.c.a.d2 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 /* new-instance p1, Landroid/graphics/Path; */
		 /* invoke-direct {p1}, Landroid/graphics/Path;-><init>()V */
		 this.a = p1;
		 /* .line 3 */
		 (( e.c.a.i0 ) p2 ).a ( p0 ); // invoke-virtual {p2, p0}, Le/c/a/i0;->a(Le/c/a/j0;)V
		 return;
	 } // .end method
	 /* # virtual methods */
	 public android.graphics.Path a ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.a;
	 } // .end method
	 public void a ( Float p0, Float p1 ) {
		 /* .locals 1 */
		 /* .line 2 */
		 v0 = this.a;
		 (( android.graphics.Path ) v0 ).moveTo ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Landroid/graphics/Path;->moveTo(FF)V
		 /* .line 3 */
		 /* iput p1, p0, Le/c/a/d2;->b:F */
		 /* .line 4 */
		 /* iput p2, p0, Le/c/a/d2;->c:F */
		 return;
	 } // .end method
	 public void a ( Float p0, Float p1, Float p2, Float p3 ) {
		 /* .locals 1 */
		 /* .line 8 */
		 v0 = this.a;
		 (( android.graphics.Path ) v0 ).quadTo ( p1, p2, p3, p4 ); // invoke-virtual {v0, p1, p2, p3, p4}, Landroid/graphics/Path;->quadTo(FFFF)V
		 /* .line 9 */
		 /* iput p3, p0, Le/c/a/d2;->b:F */
		 /* .line 10 */
		 /* iput p4, p0, Le/c/a/d2;->c:F */
		 return;
	 } // .end method
	 public void a ( Float p0, Float p1, Float p2, Float p3, Float p4, Float p5 ) {
		 /* .locals 7 */
		 /* .line 5 */
		 v0 = this.a;
		 /* move v1, p1 */
		 /* move v2, p2 */
		 /* move v3, p3 */
		 /* move v4, p4 */
		 /* move v5, p5 */
		 /* move v6, p6 */
		 /* invoke-virtual/range {v0 ..v6}, Landroid/graphics/Path;->cubicTo(FFFFFF)V */
		 /* .line 6 */
		 /* iput p5, p0, Le/c/a/d2;->b:F */
		 /* .line 7 */
		 /* iput p6, p0, Le/c/a/d2;->c:F */
		 return;
	 } // .end method
	 public void a ( Float p0, Float p1, Float p2, Boolean p3, Boolean p4, Float p5, Float p6 ) {
		 /* .locals 11 */
		 /* move-object v10, p0 */
		 /* .line 11 */
		 /* iget v0, v10, Le/c/a/d2;->b:F */
		 /* iget v1, v10, Le/c/a/d2;->c:F */
		 /* move v2, p1 */
		 /* move v3, p2 */
		 /* move v4, p3 */
		 /* move v5, p4 */
		 /* move/from16 v6, p5 */
		 /* move/from16 v7, p6 */
		 /* move/from16 v8, p7 */
		 /* move-object v9, p0 */
		 /* invoke-static/range {v0 ..v9}, Le/c/a/l2;->a(FFFFFZZFFLe/c/a/j0;)V */
		 /* move/from16 v0, p6 */
		 /* .line 12 */
		 /* iput v0, v10, Le/c/a/d2;->b:F */
		 /* move/from16 v0, p7 */
		 /* .line 13 */
		 /* iput v0, v10, Le/c/a/d2;->c:F */
		 return;
	 } // .end method
	 public void b ( Float p0, Float p1 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.a;
		 (( android.graphics.Path ) v0 ).lineTo ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Landroid/graphics/Path;->lineTo(FF)V
		 /* .line 2 */
		 /* iput p1, p0, Le/c/a/d2;->b:F */
		 /* .line 3 */
		 /* iput p2, p0, Le/c/a/d2;->c:F */
		 return;
	 } // .end method
	 public void close ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.a;
		 (( android.graphics.Path ) v0 ).close ( ); // invoke-virtual {v0}, Landroid/graphics/Path;->close()V
		 return;
	 } // .end method
