public class c.k.a.f extends c.k.a.b {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public c.k.a.f ( ) {
		 /* .locals 1 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Ljava/io/IOException; */
		 /* } */
	 } // .end annotation
	 /* .line 3 */
	 /* invoke-direct {p0, p1}, Lc/k/a/b;-><init>(Ljava/io/InputStream;)V */
	 /* .line 4 */
	 p1 = 	 (( java.io.InputStream ) p1 ).markSupported ( ); // invoke-virtual {p1}, Ljava/io/InputStream;->markSupported()Z
	 if ( p1 != null) { // if-eqz p1, :cond_0
		 /* .line 5 */
		 p1 = this.b;
		 /* const v0, 0x7fffffff */
		 (( java.io.DataInputStream ) p1 ).mark ( v0 ); // invoke-virtual {p1, v0}, Ljava/io/DataInputStream;->mark(I)V
		 return;
		 /* .line 6 */
	 } // :cond_0
	 /* new-instance p1, Ljava/lang/IllegalArgumentException; */
	 final String v0 = "Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset"; // const-string v0, "Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset"
	 /* invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
	 /* throw p1 */
} // .end method
public c.k.a.f ( ) {
	 /* .locals 1 */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Ljava/io/IOException; */
	 /* } */
} // .end annotation
/* .line 1 */
/* invoke-direct {p0, p1}, Lc/k/a/b;-><init>([B)V */
/* .line 2 */
p1 = this.b;
/* const v0, 0x7fffffff */
(( java.io.DataInputStream ) p1 ).mark ( v0 ); // invoke-virtual {p1, v0}, Ljava/io/DataInputStream;->mark(I)V
return;
} // .end method
/* # virtual methods */
public void g ( Long p0 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
/* iget v0, p0, Lc/k/a/b;->d:I */
/* int-to-long v1, v0 */
/* cmp-long v3, v1, p1 */
/* if-lez v3, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
/* iput v0, p0, Lc/k/a/b;->d:I */
/* .line 3 */
v0 = this.b;
(( java.io.DataInputStream ) v0 ).reset ( ); // invoke-virtual {v0}, Ljava/io/DataInputStream;->reset()V
} // :cond_0
/* int-to-long v0, v0 */
/* sub-long/2addr p1, v0 */
} // :goto_0
/* long-to-int p2, p1 */
/* .line 4 */
(( c.k.a.b ) p0 ).a ( p2 ); // invoke-virtual {p0, p2}, Lc/k/a/b;->a(I)V
return;
} // .end method
