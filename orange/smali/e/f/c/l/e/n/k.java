public class e.f.c.l.e.n.k implements e.f.c.l.e.n.i {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final a; //synthetic
	 public final b; //synthetic
	 /* # direct methods */
	 public e.f.c.l.e.n.k ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.a = p2;
		 this.b = p3;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( java.io.InputStream p0, Integer p1 ) {
		 /* .locals 3 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Ljava/io/IOException; */
		 /* } */
	 } // .end annotation
	 /* .line 1 */
	 try { // :try_start_0
		 v0 = this.a;
		 v1 = this.b;
		 int v2 = 0; // const/4 v2, 0x0
		 /* aget v1, v1, v2 */
		 (( java.io.InputStream ) p1 ).read ( v0, v1, p2 ); // invoke-virtual {p1, v0, v1, p2}, Ljava/io/InputStream;->read([BII)I
		 /* .line 2 */
		 v0 = this.b;
		 /* aget v1, v0, v2 */
		 /* add-int/2addr v1, p2 */
		 /* aput v1, v0, v2 */
		 /* :try_end_0 */
		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
		 /* .line 3 */
		 (( java.io.InputStream ) p1 ).close ( ); // invoke-virtual {p1}, Ljava/io/InputStream;->close()V
		 return;
		 /* :catchall_0 */
		 /* move-exception p2 */
		 (( java.io.InputStream ) p1 ).close ( ); // invoke-virtual {p1}, Ljava/io/InputStream;->close()V
		 /* .line 4 */
		 /* throw p2 */
	 } // .end method
