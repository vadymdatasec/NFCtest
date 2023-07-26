public class e.a.a.c0.g extends java.io.FilterInputStream {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final Long b;
	 public Long c;
	 /* # direct methods */
	 public e.a.a.c0.g ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0, p1}, Ljava/io/FilterInputStream;-><init>(Ljava/io/InputStream;)V */
		 /* .line 2 */
		 /* iput-wide p2, p0, Le/a/a/c0/g;->b:J */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Long c ( ) {
		 /* .locals 4 */
		 /* .line 1 */
		 /* iget-wide v0, p0, Le/a/a/c0/g;->b:J */
		 /* iget-wide v2, p0, Le/a/a/c0/g;->c:J */
		 /* sub-long/2addr v0, v2 */
		 /* return-wide v0 */
	 } // .end method
	 public Integer read ( ) {
		 /* .locals 5 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Ljava/io/IOException; */
		 /* } */
	 } // .end annotation
	 /* .line 1 */
	 v0 = 	 /* invoke-super {p0}, Ljava/io/FilterInputStream;->read()I */
	 int v1 = -1; // const/4 v1, -0x1
	 /* if-eq v0, v1, :cond_0 */
	 /* .line 2 */
	 /* iget-wide v1, p0, Le/a/a/c0/g;->c:J */
	 /* const-wide/16 v3, 0x1 */
	 /* add-long/2addr v1, v3 */
	 /* iput-wide v1, p0, Le/a/a/c0/g;->c:J */
} // :cond_0
} // .end method
public Integer read ( Object[] p0, Integer p1, Integer p2 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 3 */
p1 = /* invoke-super {p0, p1, p2, p3}, Ljava/io/FilterInputStream;->read([BII)I */
int p2 = -1; // const/4 p2, -0x1
/* if-eq p1, p2, :cond_0 */
/* .line 4 */
/* iget-wide p2, p0, Le/a/a/c0/g;->c:J */
/* int-to-long v0, p1 */
/* add-long/2addr p2, v0 */
/* iput-wide p2, p0, Le/a/a/c0/g;->c:J */
} // :cond_0
} // .end method
