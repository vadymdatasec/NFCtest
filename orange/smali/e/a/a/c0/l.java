public class e.a.a.c0.l extends java.io.FilterInputStream {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final java.net.HttpURLConnection b;
	 /* # direct methods */
	 public e.a.a.c0.l ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 e.a.a.c0.n .a ( p1 );
		 /* invoke-direct {p0, v0}, Ljava/io/FilterInputStream;-><init>(Ljava/io/InputStream;)V */
		 /* .line 2 */
		 this.b = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void close ( ) {
		 /* .locals 1 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Ljava/io/IOException; */
		 /* } */
	 } // .end annotation
	 /* .line 1 */
	 /* invoke-super {p0}, Ljava/io/FilterInputStream;->close()V */
	 /* .line 2 */
	 v0 = this.b;
	 (( java.net.HttpURLConnection ) v0 ).disconnect ( ); // invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V
	 return;
} // .end method
