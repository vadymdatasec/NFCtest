public class e.c.a.i2 extends e.c.a.j2 {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public Float a;
	 public Float b;
	 public android.graphics.RectF c;
	 public final e.c.a.l2 d; //synthetic
	 /* # direct methods */
	 public e.c.a.i2 ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 this.d = p1;
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 2 */
		 /* invoke-direct {p0, p1, v0}, Le/c/a/j2;-><init>(Le/c/a/l2;Le/c/a/j2;)V */
		 /* .line 3 */
		 /* new-instance p1, Landroid/graphics/RectF; */
		 /* invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V */
		 this.c = p1;
		 /* .line 4 */
		 /* iput p2, p0, Le/c/a/i2;->a:F */
		 /* .line 5 */
		 /* iput p3, p0, Le/c/a/i2;->b:F */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( java.lang.String p0 ) {
		 /* .locals 4 */
		 /* .line 12 */
		 v0 = this.d;
		 v0 = 		 e.c.a.l2 .a ( v0 );
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 13 */
			 /* new-instance v0, Landroid/graphics/Rect; */
			 /* invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V */
			 /* .line 14 */
			 v1 = this.d;
			 e.c.a.l2 .b ( v1 );
			 v1 = this.e;
			 int v2 = 0; // const/4 v2, 0x0
			 v3 = 			 (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
			 (( android.graphics.Paint ) v1 ).getTextBounds ( p1, v2, v3, v0 ); // invoke-virtual {v1, p1, v2, v3, v0}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V
			 /* .line 15 */
			 /* new-instance v1, Landroid/graphics/RectF; */
			 /* invoke-direct {v1, v0}, Landroid/graphics/RectF;-><init>(Landroid/graphics/Rect;)V */
			 /* .line 16 */
			 /* iget v0, p0, Le/c/a/i2;->a:F */
			 /* iget v2, p0, Le/c/a/i2;->b:F */
			 (( android.graphics.RectF ) v1 ).offset ( v0, v2 ); // invoke-virtual {v1, v0, v2}, Landroid/graphics/RectF;->offset(FF)V
			 /* .line 17 */
			 v0 = this.c;
			 (( android.graphics.RectF ) v0 ).union ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/RectF;->union(Landroid/graphics/RectF;)V
			 /* .line 18 */
		 } // :cond_0
		 /* iget v0, p0, Le/c/a/i2;->a:F */
		 v1 = this.d;
		 e.c.a.l2 .b ( v1 );
		 v1 = this.e;
		 p1 = 		 (( android.graphics.Paint ) v1 ).measureText ( p1 ); // invoke-virtual {v1, p1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F
		 /* add-float/2addr v0, p1 */
		 /* iput v0, p0, Le/c/a/i2;->a:F */
		 return;
	 } // .end method
	 public Boolean a ( e.c.a.s1 p0 ) {
		 /* .locals 5 */
		 /* .line 1 */
		 /* instance-of v0, p1, Le/c/a/t1; */
		 int v1 = 1; // const/4 v1, 0x1
		 if ( v0 != null) { // if-eqz v0, :cond_2
			 /* .line 2 */
			 /* move-object v0, p1 */
			 /* check-cast v0, Le/c/a/t1; */
			 /* .line 3 */
			 p1 = this.a;
			 v2 = this.n;
			 (( e.c.a.a2 ) p1 ).b ( v2 ); // invoke-virtual {p1, v2}, Le/c/a/a2;->b(Ljava/lang/String;)Le/c/a/h1;
			 int v2 = 0; // const/4 v2, 0x0
			 /* if-nez p1, :cond_0 */
			 /* new-array p1, v1, [Ljava/lang/Object; */
			 /* .line 4 */
			 v0 = this.n;
			 /* aput-object v0, p1, v2 */
			 final String v0 = "TextPath path reference \'%s\' not found"; // const-string v0, "TextPath path reference \'%s\' not found"
			 e.c.a.l2 .b ( v0,p1 );
			 /* .line 5 */
		 } // :cond_0
		 /* check-cast p1, Le/c/a/h0; */
		 /* .line 6 */
		 /* new-instance v0, Le/c/a/d2; */
		 v3 = this.d;
		 v4 = this.o;
		 /* invoke-direct {v0, v3, v4}, Le/c/a/d2;-><init>(Le/c/a/l2;Le/c/a/i0;)V */
		 (( e.c.a.d2 ) v0 ).a ( ); // invoke-virtual {v0}, Le/c/a/d2;->a()Landroid/graphics/Path;
		 /* .line 7 */
		 p1 = this.n;
		 if ( p1 != null) { // if-eqz p1, :cond_1
			 /* .line 8 */
			 (( android.graphics.Path ) v0 ).transform ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V
			 /* .line 9 */
		 } // :cond_1
		 /* new-instance p1, Landroid/graphics/RectF; */
		 /* invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V */
		 /* .line 10 */
		 (( android.graphics.Path ) v0 ).computeBounds ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V
		 /* .line 11 */
		 v0 = this.c;
		 (( android.graphics.RectF ) v0 ).union ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/RectF;->union(Landroid/graphics/RectF;)V
	 } // :cond_2
} // .end method
