public abstract class e.f.a.d.a.e.o implements java.io.Closeable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # direct methods */
	 public e.f.a.d.a.e.o ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public abstract java.io.InputStream a ( Long p0, Long p1 ) {
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Ljava/io/IOException; */
		 /* } */
	 } // .end annotation
} // .end method
public abstract Long c ( ) {
} // .end method
public synchronized final java.io.InputStream l ( ) {
	 /* .locals 4 */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Ljava/io/IOException; */
	 /* } */
} // .end annotation
/* monitor-enter p0 */
/* const-wide/16 v0, 0x0 */
try { // :try_start_0
	 (( e.f.a.d.a.e.o ) p0 ).c ( ); // invoke-virtual {p0}, Le/f/a/d/a/e/o;->c()J
	 /* move-result-wide v2 */
	 (( e.f.a.d.a.e.o ) p0 ).a ( v0, v1, v2, v3 ); // invoke-virtual {p0, v0, v1, v2, v3}, Le/f/a/d/a/e/o;->a(JJ)Ljava/io/InputStream;
	 /* :try_end_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 /* monitor-exit p0 */
	 /* :catchall_0 */
	 /* move-exception v0 */
	 /* monitor-exit p0 */
	 /* throw v0 */
} // .end method
