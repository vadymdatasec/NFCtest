public class e.b.a.y.z.e.o0 implements e.b.a.y.z.e.w {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final e.b.a.y.z.e.m0 a;
	 public final e.b.a.e0.f b;
	 /* # direct methods */
	 public e.b.a.y.z.e.o0 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.a = p1;
		 /* .line 3 */
		 this.b = p2;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.a;
		 (( e.b.a.y.z.e.m0 ) v0 ).c ( ); // invoke-virtual {v0}, Le/b/a/y/z/e/m0;->c()V
		 return;
	 } // .end method
	 public void a ( Object p0, android.graphics.Bitmap p1 ) {
		 /* .locals 1 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Ljava/io/IOException; */
		 /* } */
	 } // .end annotation
	 /* .line 2 */
	 v0 = this.b;
	 (( e.b.a.e0.f ) v0 ).c ( ); // invoke-virtual {v0}, Le/b/a/e0/f;->c()Ljava/io/IOException;
	 if ( v0 != null) { // if-eqz v0, :cond_1
		 if ( p2 != null) { // if-eqz p2, :cond_0
			 /* .line 3 */
			 /* .line 4 */
		 } // :cond_0
		 /* throw v0 */
	 } // :cond_1
	 return;
} // .end method
