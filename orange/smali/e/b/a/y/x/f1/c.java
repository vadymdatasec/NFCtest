public class e.b.a.y.x.f1.c implements e.b.a.y.x.f1.t {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final e.b.a.y.x.f1.d a;
	 public Integer b;
	 public Integer c;
	 public android.graphics.Bitmap$Config d;
	 /* # direct methods */
	 public e.b.a.y.x.f1.c ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.a = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( ) {
		 /* .locals 1 */
		 /* .line 4 */
		 v0 = this.a;
		 (( e.b.a.y.x.f1.f ) v0 ).a ( p0 ); // invoke-virtual {v0, p0}, Le/b/a/y/x/f1/f;->a(Le/b/a/y/x/f1/t;)V
		 return;
	 } // .end method
	 public void a ( Integer p0, Integer p1, android.graphics.Bitmap$Config p2 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* iput p1, p0, Le/b/a/y/x/f1/c;->b:I */
		 /* .line 2 */
		 /* iput p2, p0, Le/b/a/y/x/f1/c;->c:I */
		 /* .line 3 */
		 this.d = p3;
		 return;
	 } // .end method
	 public Boolean equals ( java.lang.Object p0 ) {
		 /* .locals 3 */
		 /* .line 1 */
		 /* instance-of v0, p1, Le/b/a/y/x/f1/c; */
		 int v1 = 0; // const/4 v1, 0x0
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 2 */
			 /* check-cast p1, Le/b/a/y/x/f1/c; */
			 /* .line 3 */
			 /* iget v0, p0, Le/b/a/y/x/f1/c;->b:I */
			 /* iget v2, p1, Le/b/a/y/x/f1/c;->b:I */
			 /* if-ne v0, v2, :cond_0 */
			 /* iget v0, p0, Le/b/a/y/x/f1/c;->c:I */
			 /* iget v2, p1, Le/b/a/y/x/f1/c;->c:I */
			 /* if-ne v0, v2, :cond_0 */
			 v0 = this.d;
			 p1 = this.d;
			 /* if-ne v0, p1, :cond_0 */
			 int v1 = 1; // const/4 v1, 0x1
		 } // :cond_0
	 } // .end method
	 public Integer hashCode ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* iget v0, p0, Le/b/a/y/x/f1/c;->b:I */
		 /* mul-int/lit8 v0, v0, 0x1f */
		 /* .line 2 */
		 /* iget v1, p0, Le/b/a/y/x/f1/c;->c:I */
		 /* add-int/2addr v0, v1 */
		 /* mul-int/lit8 v0, v0, 0x1f */
		 /* .line 3 */
		 v1 = this.d;
		 if ( v1 != null) { // if-eqz v1, :cond_0
			 v1 = 			 (( android.graphics.Bitmap$Config ) v1 ).hashCode ( ); // invoke-virtual {v1}, Landroid/graphics/Bitmap$Config;->hashCode()I
		 } // :cond_0
		 int v1 = 0; // const/4 v1, 0x0
	 } // :goto_0
	 /* add-int/2addr v0, v1 */
} // .end method
public java.lang.String toString ( ) {
	 /* .locals 3 */
	 /* .line 1 */
	 /* iget v0, p0, Le/b/a/y/x/f1/c;->b:I */
	 /* iget v1, p0, Le/b/a/y/x/f1/c;->c:I */
	 v2 = this.d;
	 e.b.a.y.x.f1.e .c ( v0,v1,v2 );
} // .end method
