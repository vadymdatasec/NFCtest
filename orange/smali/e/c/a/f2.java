public class e.c.a.f2 extends e.c.a.j2 {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public Float a;
	 public Float b;
	 public final e.c.a.l2 c; //synthetic
	 /* # direct methods */
	 public e.c.a.f2 ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 this.c = p1;
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 2 */
		 /* invoke-direct {p0, p1, v0}, Le/c/a/j2;-><init>(Le/c/a/l2;Le/c/a/j2;)V */
		 /* .line 3 */
		 /* iput p2, p0, Le/c/a/f2;->a:F */
		 /* .line 4 */
		 /* iput p3, p0, Le/c/a/f2;->b:F */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( java.lang.String p0 ) {
		 /* .locals 4 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* new-array v0, v0, [Ljava/lang/Object; */
		 final String v1 = "TextSequence render"; // const-string v1, "TextSequence render"
		 /* .line 1 */
		 e.c.a.l2 .a ( v1,v0 );
		 /* .line 2 */
		 v0 = this.c;
		 v0 = 		 e.c.a.l2 .a ( v0 );
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 /* .line 3 */
			 v0 = this.c;
			 e.c.a.l2 .b ( v0 );
			 /* iget-boolean v0, v0, Le/c/a/h2;->c:Z */
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 /* .line 4 */
				 v0 = this.c;
				 e.c.a.l2 .c ( v0 );
				 /* iget v1, p0, Le/c/a/f2;->a:F */
				 /* iget v2, p0, Le/c/a/f2;->b:F */
				 v3 = this.c;
				 e.c.a.l2 .b ( v3 );
				 v3 = this.e;
				 (( android.graphics.Canvas ) v0 ).drawText ( p1, v1, v2, v3 ); // invoke-virtual {v0, p1, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
				 /* .line 5 */
			 } // :cond_0
			 v0 = this.c;
			 e.c.a.l2 .b ( v0 );
			 /* iget-boolean v0, v0, Le/c/a/h2;->d:Z */
			 if ( v0 != null) { // if-eqz v0, :cond_1
				 /* .line 6 */
				 v0 = this.c;
				 e.c.a.l2 .c ( v0 );
				 /* iget v1, p0, Le/c/a/f2;->a:F */
				 /* iget v2, p0, Le/c/a/f2;->b:F */
				 v3 = this.c;
				 e.c.a.l2 .b ( v3 );
				 v3 = this.f;
				 (( android.graphics.Canvas ) v0 ).drawText ( p1, v1, v2, v3 ); // invoke-virtual {v0, p1, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
				 /* .line 7 */
			 } // :cond_1
			 /* iget v0, p0, Le/c/a/f2;->a:F */
			 v1 = this.c;
			 e.c.a.l2 .b ( v1 );
			 v1 = this.e;
			 p1 = 			 (( android.graphics.Paint ) v1 ).measureText ( p1 ); // invoke-virtual {v1, p1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F
			 /* add-float/2addr v0, p1 */
			 /* iput v0, p0, Le/c/a/f2;->a:F */
			 return;
		 } // .end method
