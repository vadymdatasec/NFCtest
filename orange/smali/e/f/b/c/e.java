public abstract class e.f.b.c.e {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public e.f.b.c.e ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public abstract java.io.OutputStream a ( ) {
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Ljava/io/IOException; */
		 /* } */
	 } // .end annotation
} // .end method
public void a ( Object[] p0 ) {
	 /* .locals 2 */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Ljava/io/IOException; */
	 /* } */
} // .end annotation
/* .line 1 */
e.f.b.a.p .a ( p1 );
/* .line 2 */
e.f.b.c.m .c ( );
/* .line 3 */
try { // :try_start_0
	 (( e.f.b.c.e ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/b/c/e;->a()Ljava/io/OutputStream;
	 (( e.f.b.c.m ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/b/c/m;->a(Ljava/io/Closeable;)Ljava/io/Closeable;
	 /* check-cast v1, Ljava/io/OutputStream; */
	 /* .line 4 */
	 (( java.io.OutputStream ) v1 ).write ( p1 ); // invoke-virtual {v1, p1}, Ljava/io/OutputStream;->write([B)V
	 /* .line 5 */
	 (( java.io.OutputStream ) v1 ).flush ( ); // invoke-virtual {v1}, Ljava/io/OutputStream;->flush()V
	 /* :try_end_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 /* .line 6 */
	 (( e.f.b.c.m ) v0 ).close ( ); // invoke-virtual {v0}, Le/f/b/c/m;->close()V
	 return;
	 /* :catchall_0 */
	 /* move-exception p1 */
	 /* .line 7 */
	 try { // :try_start_1
		 (( e.f.b.c.m ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Le/f/b/c/m;->a(Ljava/lang/Throwable;)Ljava/lang/RuntimeException;
		 /* :try_end_1 */
		 /* .catchall {:try_start_1 ..:try_end_1} :catchall_1 */
		 int p1 = 0; // const/4 p1, 0x0
		 /* throw p1 */
		 /* :catchall_1 */
		 /* move-exception p1 */
		 /* .line 8 */
		 (( e.f.b.c.m ) v0 ).close ( ); // invoke-virtual {v0}, Le/f/b/c/m;->close()V
		 /* .line 9 */
		 /* throw p1 */
	 } // .end method
