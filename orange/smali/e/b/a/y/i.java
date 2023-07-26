public class e.b.a.y.i implements e.b.a.y.k {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final java.io.InputStream a; //synthetic
	 public final e.b.a.y.x.f1.b b; //synthetic
	 /* # direct methods */
	 public e.b.a.y.i ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.a = p1;
		 this.b = p2;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Integer a ( com.bumptech.glide.load.ImageHeaderParser p0 ) {
		 /* .locals 2 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Ljava/io/IOException; */
		 /* } */
	 } // .end annotation
	 /* .line 1 */
	 try { // :try_start_0
		 v0 = this.a;
		 p1 = 		 v1 = this.b;
		 /* :try_end_0 */
		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
		 /* .line 2 */
		 v0 = this.a;
		 (( java.io.InputStream ) v0 ).reset ( ); // invoke-virtual {v0}, Ljava/io/InputStream;->reset()V
		 /* :catchall_0 */
		 /* move-exception p1 */
		 v0 = this.a;
		 (( java.io.InputStream ) v0 ).reset ( ); // invoke-virtual {v0}, Ljava/io/InputStream;->reset()V
		 /* .line 3 */
		 /* throw p1 */
	 } // .end method
