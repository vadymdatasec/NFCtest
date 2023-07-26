public class e.a.a.c0.r extends java.io.ByteArrayOutputStream {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final e.a.a.c0.d b;
	 /* # direct methods */
	 public e.a.a.c0.r ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/io/ByteArrayOutputStream;-><init>()V */
		 /* .line 2 */
		 this.b = p1;
		 /* const/16 v0, 0x100 */
		 /* .line 3 */
		 p2 = 		 java.lang.Math .max ( p2,v0 );
		 (( e.a.a.c0.d ) p1 ).a ( p2 ); // invoke-virtual {p1, p2}, Le/a/a/c0/d;->a(I)[B
		 this.buf = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final void a ( Integer p0 ) {
		 /* .locals 3 */
		 /* .line 1 */
		 /* iget v0, p0, Ljava/io/ByteArrayOutputStream;->count:I */
		 /* add-int v1, v0, p1 */
		 v2 = this.buf;
		 /* array-length v2, v2 */
		 /* if-gt v1, v2, :cond_0 */
		 return;
		 /* .line 2 */
	 } // :cond_0
	 v1 = this.b;
	 /* add-int/2addr v0, p1 */
	 /* mul-int/lit8 v0, v0, 0x2 */
	 (( e.a.a.c0.d ) v1 ).a ( v0 ); // invoke-virtual {v1, v0}, Le/a/a/c0/d;->a(I)[B
	 /* .line 3 */
	 v0 = this.buf;
	 /* iget v1, p0, Ljava/io/ByteArrayOutputStream;->count:I */
	 int v2 = 0; // const/4 v2, 0x0
	 java.lang.System .arraycopy ( v0,v2,p1,v2,v1 );
	 /* .line 4 */
	 v0 = this.b;
	 v1 = this.buf;
	 (( e.a.a.c0.d ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/a/a/c0/d;->a([B)V
	 /* .line 5 */
	 this.buf = p1;
	 return;
} // .end method
public void close ( ) {
	 /* .locals 2 */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Ljava/io/IOException; */
	 /* } */
} // .end annotation
/* .line 1 */
v0 = this.b;
v1 = this.buf;
(( e.a.a.c0.d ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/a/a/c0/d;->a([B)V
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
this.buf = v0;
/* .line 3 */
/* invoke-super {p0}, Ljava/io/ByteArrayOutputStream;->close()V */
return;
} // .end method
public void finalize ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.b;
v1 = this.buf;
(( e.a.a.c0.d ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/a/a/c0/d;->a([B)V
return;
} // .end method
public synchronized void write ( Integer p0 ) {
/* .locals 1 */
/* monitor-enter p0 */
int v0 = 1; // const/4 v0, 0x1
/* .line 4 */
try { // :try_start_0
	 (( e.a.a.c0.r ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/a/a/c0/r;->a(I)V
	 /* .line 5 */
	 /* invoke-super {p0, p1}, Ljava/io/ByteArrayOutputStream;->write(I)V */
	 /* :try_end_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 /* .line 6 */
	 /* monitor-exit p0 */
	 return;
	 /* :catchall_0 */
	 /* move-exception p1 */
	 /* monitor-exit p0 */
	 /* throw p1 */
} // .end method
public synchronized void write ( Object[] p0, Integer p1, Integer p2 ) {
	 /* .locals 0 */
	 /* monitor-enter p0 */
	 /* .line 1 */
	 try { // :try_start_0
		 (( e.a.a.c0.r ) p0 ).a ( p3 ); // invoke-virtual {p0, p3}, Le/a/a/c0/r;->a(I)V
		 /* .line 2 */
		 /* invoke-super {p0, p1, p2, p3}, Ljava/io/ByteArrayOutputStream;->write([BII)V */
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
