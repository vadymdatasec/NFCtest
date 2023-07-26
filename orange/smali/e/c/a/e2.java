public class e.c.a.e2 extends e.c.a.f2 {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public android.graphics.Path d;
	 public final e.c.a.l2 e; //synthetic
	 /* # direct methods */
	 public e.c.a.e2 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.e = p1;
		 /* .line 2 */
		 /* invoke-direct {p0, p1, p3, p4}, Le/c/a/f2;-><init>(Le/c/a/l2;FF)V */
		 /* .line 3 */
		 this.d = p2;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( java.lang.String p0 ) {
		 /* .locals 7 */
		 /* .line 1 */
		 v0 = this.e;
		 v0 = 		 e.c.a.l2 .a ( v0 );
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 /* .line 2 */
			 v0 = this.e;
			 e.c.a.l2 .b ( v0 );
			 /* iget-boolean v0, v0, Le/c/a/h2;->c:Z */
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 /* .line 3 */
				 v0 = this.e;
				 e.c.a.l2 .c ( v0 );
				 v3 = this.d;
				 /* iget v4, p0, Le/c/a/f2;->a:F */
				 /* iget v5, p0, Le/c/a/f2;->b:F */
				 v0 = this.e;
				 e.c.a.l2 .b ( v0 );
				 v6 = this.e;
				 /* move-object v2, p1 */
				 /* invoke-virtual/range {v1 ..v6}, Landroid/graphics/Canvas;->drawTextOnPath(Ljava/lang/String;Landroid/graphics/Path;FFLandroid/graphics/Paint;)V */
				 /* .line 4 */
			 } // :cond_0
			 v0 = this.e;
			 e.c.a.l2 .b ( v0 );
			 /* iget-boolean v0, v0, Le/c/a/h2;->d:Z */
			 if ( v0 != null) { // if-eqz v0, :cond_1
				 /* .line 5 */
				 v0 = this.e;
				 e.c.a.l2 .c ( v0 );
				 v3 = this.d;
				 /* iget v4, p0, Le/c/a/f2;->a:F */
				 /* iget v5, p0, Le/c/a/f2;->b:F */
				 v0 = this.e;
				 e.c.a.l2 .b ( v0 );
				 v6 = this.f;
				 /* move-object v2, p1 */
				 /* invoke-virtual/range {v1 ..v6}, Landroid/graphics/Canvas;->drawTextOnPath(Ljava/lang/String;Landroid/graphics/Path;FFLandroid/graphics/Paint;)V */
				 /* .line 6 */
			 } // :cond_1
			 /* iget v0, p0, Le/c/a/f2;->a:F */
			 v1 = this.e;
			 e.c.a.l2 .b ( v1 );
			 v1 = this.e;
			 p1 = 			 (( android.graphics.Paint ) v1 ).measureText ( p1 ); // invoke-virtual {v1, p1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F
			 /* add-float/2addr v0, p1 */
			 /* iput v0, p0, Le/c/a/f2;->a:F */
			 return;
		 } // .end method
