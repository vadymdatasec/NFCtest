public class e.b.a.y.e implements e.b.a.y.l {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final java.io.InputStream a; //synthetic
	 /* # direct methods */
	 public e.b.a.y.e ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.a = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public com.bumptech.glide.load.ImageHeaderParser$ImageType a ( com.bumptech.glide.load.ImageHeaderParser p0 ) {
		 /* .locals 1 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Ljava/io/IOException; */
		 /* } */
	 } // .end annotation
	 /* .line 1 */
	 try { // :try_start_0
		 v0 = this.a;
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
