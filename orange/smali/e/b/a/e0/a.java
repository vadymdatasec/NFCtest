public class e.b.a.e0.a extends java.io.InputStream {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final java.nio.ByteBuffer b;
	 public Integer c;
	 /* # direct methods */
	 public e.b.a.e0.a ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/io/InputStream;-><init>()V */
		 int v0 = -1; // const/4 v0, -0x1
		 /* .line 2 */
		 /* iput v0, p0, Le/b/a/e0/a;->c:I */
		 /* .line 3 */
		 this.b = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Integer available ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.b;
		 v0 = 		 (( java.nio.ByteBuffer ) v0 ).remaining ( ); // invoke-virtual {v0}, Ljava/nio/ByteBuffer;->remaining()I
	 } // .end method
	 public synchronized void mark ( Integer p0 ) {
		 /* .locals 0 */
		 /* monitor-enter p0 */
		 /* .line 1 */
		 try { // :try_start_0
			 p1 = this.b;
			 p1 = 			 (( java.nio.ByteBuffer ) p1 ).position ( ); // invoke-virtual {p1}, Ljava/nio/ByteBuffer;->position()I
			 /* iput p1, p0, Le/b/a/e0/a;->c:I */
			 /* :try_end_0 */
			 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
			 /* .line 2 */
			 /* monitor-exit p0 */
			 return;
			 /* :catchall_0 */
			 /* move-exception p1 */
			 /* monitor-exit p0 */
			 /* throw p1 */
		 } // .end method
		 public Boolean markSupported ( ) {
			 /* .locals 1 */
			 int v0 = 1; // const/4 v0, 0x1
		 } // .end method
		 public Integer read ( ) {
			 /* .locals 1 */
			 /* .line 1 */
			 v0 = this.b;
			 v0 = 			 (( java.nio.ByteBuffer ) v0 ).hasRemaining ( ); // invoke-virtual {v0}, Ljava/nio/ByteBuffer;->hasRemaining()Z
			 /* if-nez v0, :cond_0 */
			 int v0 = -1; // const/4 v0, -0x1
			 /* .line 2 */
		 } // :cond_0
		 v0 = this.b;
		 v0 = 		 (( java.nio.ByteBuffer ) v0 ).get ( ); // invoke-virtual {v0}, Ljava/nio/ByteBuffer;->get()B
		 /* and-int/lit16 v0, v0, 0xff */
	 } // .end method
	 public Integer read ( Object[] p0, Integer p1, Integer p2 ) {
		 /* .locals 1 */
		 /* .line 3 */
		 v0 = this.b;
		 v0 = 		 (( java.nio.ByteBuffer ) v0 ).hasRemaining ( ); // invoke-virtual {v0}, Ljava/nio/ByteBuffer;->hasRemaining()Z
		 /* if-nez v0, :cond_0 */
		 int p1 = -1; // const/4 p1, -0x1
		 /* .line 4 */
	 } // :cond_0
	 v0 = 	 (( e.b.a.e0.a ) p0 ).available ( ); // invoke-virtual {p0}, Le/b/a/e0/a;->available()I
	 p3 = 	 java.lang.Math .min ( p3,v0 );
	 /* .line 5 */
	 v0 = this.b;
	 (( java.nio.ByteBuffer ) v0 ).get ( p1, p2, p3 ); // invoke-virtual {v0, p1, p2, p3}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;
} // .end method
public synchronized void reset ( ) {
	 /* .locals 2 */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Ljava/io/IOException; */
	 /* } */
} // .end annotation
/* monitor-enter p0 */
/* .line 1 */
try { // :try_start_0
	 /* iget v0, p0, Le/b/a/e0/a;->c:I */
	 int v1 = -1; // const/4 v1, -0x1
	 /* if-eq v0, v1, :cond_0 */
	 /* .line 2 */
	 v0 = this.b;
	 /* iget v1, p0, Le/b/a/e0/a;->c:I */
	 (( java.nio.ByteBuffer ) v0 ).position ( v1 ); // invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;
	 /* :try_end_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 /* .line 3 */
	 /* monitor-exit p0 */
	 return;
	 /* .line 4 */
} // :cond_0
try { // :try_start_1
	 /* new-instance v0, Ljava/io/IOException; */
	 final String v1 = "Cannot reset to unset mark position"; // const-string v1, "Cannot reset to unset mark position"
	 /* invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V */
	 /* throw v0 */
	 /* :try_end_1 */
	 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
	 /* :catchall_0 */
	 /* move-exception v0 */
	 /* monitor-exit p0 */
	 /* throw v0 */
} // .end method
public Long skip ( Long p0 ) {
	 /* .locals 3 */
	 /* .line 1 */
	 v0 = this.b;
	 v0 = 	 (( java.nio.ByteBuffer ) v0 ).hasRemaining ( ); // invoke-virtual {v0}, Ljava/nio/ByteBuffer;->hasRemaining()Z
	 /* if-nez v0, :cond_0 */
	 /* const-wide/16 p1, -0x1 */
	 /* return-wide p1 */
	 /* .line 2 */
} // :cond_0
v0 = (( e.b.a.e0.a ) p0 ).available ( ); // invoke-virtual {p0}, Le/b/a/e0/a;->available()I
/* int-to-long v0, v0 */
java.lang.Math .min ( p1,p2,v0,v1 );
/* move-result-wide p1 */
/* .line 3 */
v0 = this.b;
v1 = (( java.nio.ByteBuffer ) v0 ).position ( ); // invoke-virtual {v0}, Ljava/nio/ByteBuffer;->position()I
/* int-to-long v1, v1 */
/* add-long/2addr v1, p1 */
/* long-to-int v2, v1 */
(( java.nio.ByteBuffer ) v0 ).position ( v2 ); // invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;
/* return-wide p1 */
} // .end method
