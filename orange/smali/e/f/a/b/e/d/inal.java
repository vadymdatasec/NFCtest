public class inal extends java.io.FilterInputStream {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public Long b;
	 public Long c;
	 /* # direct methods */
	 public inal ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0, p1}, Ljava/io/FilterInputStream;-><init>(Ljava/io/InputStream;)V */
		 /* const-wide/16 p2, -0x1 */
		 /* .line 2 */
		 /* iput-wide p2, p0, Le/f/a/b/e/d/j;->c:J */
		 /* .line 3 */
		 e.f.a.b.e.d.e .a ( p1 );
		 /* const-wide/32 p1, 0x100001 */
		 /* .line 4 */
		 /* iput-wide p1, p0, Le/f/a/b/e/d/j;->b:J */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final Integer available ( ) {
		 /* .locals 4 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Ljava/io/IOException; */
		 /* } */
	 } // .end annotation
	 /* .line 1 */
	 v0 = this.in;
	 v0 = 	 (( java.io.InputStream ) v0 ).available ( ); // invoke-virtual {v0}, Ljava/io/InputStream;->available()I
	 /* int-to-long v0, v0 */
	 /* iget-wide v2, p0, Le/f/a/b/e/d/j;->b:J */
	 java.lang.Math .min ( v0,v1,v2,v3 );
	 /* move-result-wide v0 */
	 /* long-to-int v1, v0 */
} // .end method
public synchronized final void mark ( Integer p0 ) {
	 /* .locals 2 */
	 /* monitor-enter p0 */
	 /* .line 1 */
	 try { // :try_start_0
		 v0 = this.in;
		 (( java.io.InputStream ) v0 ).mark ( p1 ); // invoke-virtual {v0, p1}, Ljava/io/InputStream;->mark(I)V
		 /* .line 2 */
		 /* iget-wide v0, p0, Le/f/a/b/e/d/j;->b:J */
		 /* iput-wide v0, p0, Le/f/a/b/e/d/j;->c:J */
		 /* :try_end_0 */
		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
		 /* .line 3 */
		 /* monitor-exit p0 */
		 return;
		 /* :catchall_0 */
		 /* move-exception p1 */
		 /* monitor-exit p0 */
		 /* throw p1 */
	 } // .end method
	 public final Integer read ( ) {
		 /* .locals 6 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Ljava/io/IOException; */
		 /* } */
	 } // .end annotation
	 /* .line 1 */
	 /* iget-wide v0, p0, Le/f/a/b/e/d/j;->b:J */
	 int v2 = -1; // const/4 v2, -0x1
	 /* const-wide/16 v3, 0x0 */
	 /* cmp-long v5, v0, v3 */
	 /* if-nez v5, :cond_0 */
	 /* .line 2 */
} // :cond_0
v0 = this.in;
v0 = (( java.io.InputStream ) v0 ).read ( ); // invoke-virtual {v0}, Ljava/io/InputStream;->read()I
/* if-eq v0, v2, :cond_1 */
/* .line 3 */
/* iget-wide v1, p0, Le/f/a/b/e/d/j;->b:J */
/* const-wide/16 v3, 0x1 */
/* sub-long/2addr v1, v3 */
/* iput-wide v1, p0, Le/f/a/b/e/d/j;->b:J */
} // :cond_1
} // .end method
public final Integer read ( Object[] p0, Integer p1, Integer p2 ) {
/* .locals 6 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 4 */
/* iget-wide v0, p0, Le/f/a/b/e/d/j;->b:J */
int v2 = -1; // const/4 v2, -0x1
/* const-wide/16 v3, 0x0 */
/* cmp-long v5, v0, v3 */
/* if-nez v5, :cond_0 */
} // :cond_0
/* int-to-long v3, p3 */
/* .line 5 */
java.lang.Math .min ( v3,v4,v0,v1 );
/* move-result-wide v0 */
/* long-to-int p3, v0 */
/* .line 6 */
v0 = this.in;
p1 = (( java.io.InputStream ) v0 ).read ( p1, p2, p3 ); // invoke-virtual {v0, p1, p2, p3}, Ljava/io/InputStream;->read([BII)I
/* if-eq p1, v2, :cond_1 */
/* .line 7 */
/* iget-wide p2, p0, Le/f/a/b/e/d/j;->b:J */
/* int-to-long v0, p1 */
/* sub-long/2addr p2, v0 */
/* iput-wide p2, p0, Le/f/a/b/e/d/j;->b:J */
} // :cond_1
} // .end method
public synchronized final void reset ( ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* monitor-enter p0 */
/* .line 1 */
try { // :try_start_0
v0 = this.in;
v0 = (( java.io.InputStream ) v0 ).markSupported ( ); // invoke-virtual {v0}, Ljava/io/InputStream;->markSupported()Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 2 */
/* iget-wide v0, p0, Le/f/a/b/e/d/j;->c:J */
/* const-wide/16 v2, -0x1 */
/* cmp-long v4, v0, v2 */
if ( v4 != null) { // if-eqz v4, :cond_0
/* .line 3 */
v0 = this.in;
(( java.io.InputStream ) v0 ).reset ( ); // invoke-virtual {v0}, Ljava/io/InputStream;->reset()V
/* .line 4 */
/* iget-wide v0, p0, Le/f/a/b/e/d/j;->c:J */
/* iput-wide v0, p0, Le/f/a/b/e/d/j;->b:J */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 5 */
/* monitor-exit p0 */
return;
/* .line 6 */
} // :cond_0
try { // :try_start_1
/* new-instance v0, Ljava/io/IOException; */
final String v1 = "Mark not set"; // const-string v1, "Mark not set"
/* invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* .line 7 */
} // :cond_1
/* new-instance v0, Ljava/io/IOException; */
final String v1 = "Mark not supported"; // const-string v1, "Mark not supported"
/* invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
public final Long skip ( Long p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
/* iget-wide v0, p0, Le/f/a/b/e/d/j;->b:J */
java.lang.Math .min ( p1,p2,v0,v1 );
/* move-result-wide p1 */
/* .line 2 */
v0 = this.in;
(( java.io.InputStream ) v0 ).skip ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Ljava/io/InputStream;->skip(J)J
/* move-result-wide p1 */
/* .line 3 */
/* iget-wide v0, p0, Le/f/a/b/e/d/j;->b:J */
/* sub-long/2addr v0, p1 */
/* iput-wide v0, p0, Le/f/a/b/e/d/j;->b:J */
/* return-wide p1 */
} // .end method
