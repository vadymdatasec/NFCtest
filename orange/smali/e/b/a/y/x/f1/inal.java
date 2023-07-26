public class inal implements e.b.a.y.x.f1.t {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final e.b.a.y.x.f1.w a;
	 public Integer b;
	 public android.graphics.Bitmap$Config c;
	 /* # direct methods */
	 public inal ( ) {
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
		 /* .line 3 */
		 v0 = this.a;
		 (( e.b.a.y.x.f1.f ) v0 ).a ( p0 ); // invoke-virtual {v0, p0}, Le/b/a/y/x/f1/f;->a(Le/b/a/y/x/f1/t;)V
		 return;
	 } // .end method
	 public void a ( Integer p0, android.graphics.Bitmap$Config p1 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* iput p1, p0, Le/b/a/y/x/f1/v;->b:I */
		 /* .line 2 */
		 this.c = p2;
		 return;
	 } // .end method
	 public Boolean equals ( java.lang.Object p0 ) {
		 /* .locals 3 */
		 /* .line 1 */
		 /* instance-of v0, p1, Le/b/a/y/x/f1/v; */
		 int v1 = 0; // const/4 v1, 0x0
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 2 */
			 /* check-cast p1, Le/b/a/y/x/f1/v; */
			 /* .line 3 */
			 /* iget v0, p0, Le/b/a/y/x/f1/v;->b:I */
			 /* iget v2, p1, Le/b/a/y/x/f1/v;->b:I */
			 /* if-ne v0, v2, :cond_0 */
			 v0 = this.c;
			 p1 = this.c;
			 p1 = 			 e.b.a.e0.t .b ( v0,p1 );
			 if ( p1 != null) { // if-eqz p1, :cond_0
				 int v1 = 1; // const/4 v1, 0x1
			 } // :cond_0
		 } // .end method
		 public Integer hashCode ( ) {
			 /* .locals 2 */
			 /* .line 1 */
			 /* iget v0, p0, Le/b/a/y/x/f1/v;->b:I */
			 /* mul-int/lit8 v0, v0, 0x1f */
			 /* .line 2 */
			 v1 = this.c;
			 if ( v1 != null) { // if-eqz v1, :cond_0
				 v1 = 				 (( android.graphics.Bitmap$Config ) v1 ).hashCode ( ); // invoke-virtual {v1}, Landroid/graphics/Bitmap$Config;->hashCode()I
			 } // :cond_0
			 int v1 = 0; // const/4 v1, 0x0
		 } // :goto_0
		 /* add-int/2addr v0, v1 */
	 } // .end method
	 public java.lang.String toString ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* iget v0, p0, Le/b/a/y/x/f1/v;->b:I */
		 v1 = this.c;
		 e.b.a.y.x.f1.x .b ( v0,v1 );
	 } // .end method
