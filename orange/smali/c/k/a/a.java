public class c.k.a.a extends android.media.MediaDataSource {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public Long b;
	 public final c.k.a.f c; //synthetic
	 /* # direct methods */
	 public c.k.a.a ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.c = p2;
		 /* invoke-direct {p0}, Landroid/media/MediaDataSource;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void close ( ) {
		 /* .locals 0 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Ljava/io/IOException; */
		 /* } */
	 } // .end annotation
	 return;
} // .end method
public Long getSize ( ) {
	 /* .locals 2 */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Ljava/io/IOException; */
	 /* } */
} // .end annotation
/* const-wide/16 v0, -0x1 */
/* return-wide v0 */
} // .end method
public Integer readAt ( Long p0, Object[] p1, Integer p2, Integer p3 ) {
/* .locals 6 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* if-nez p5, :cond_0 */
int p1 = 0; // const/4 p1, 0x0
} // :cond_0
/* const-wide/16 v0, 0x0 */
int v2 = -1; // const/4 v2, -0x1
/* cmp-long v3, p1, v0 */
/* if-gez v3, :cond_1 */
/* .line 1 */
} // :cond_1
try { // :try_start_0
/* iget-wide v3, p0, Lc/k/a/a;->b:J */
/* cmp-long v5, v3, p1 */
if ( v5 != null) { // if-eqz v5, :cond_3
/* .line 2 */
/* iget-wide v3, p0, Lc/k/a/a;->b:J */
/* cmp-long v5, v3, v0 */
/* if-ltz v5, :cond_2 */
/* iget-wide v0, p0, Lc/k/a/a;->b:J */
v3 = this.c;
v3 = (( c.k.a.b ) v3 ).available ( ); // invoke-virtual {v3}, Lc/k/a/b;->available()I
/* int-to-long v3, v3 */
/* add-long/2addr v0, v3 */
/* cmp-long v3, p1, v0 */
/* if-ltz v3, :cond_2 */
/* .line 3 */
} // :cond_2
v0 = this.c;
(( c.k.a.f ) v0 ).g ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lc/k/a/f;->g(J)V
/* .line 4 */
/* iput-wide p1, p0, Lc/k/a/a;->b:J */
/* .line 5 */
} // :cond_3
p1 = this.c;
p1 = (( c.k.a.b ) p1 ).available ( ); // invoke-virtual {p1}, Lc/k/a/b;->available()I
/* if-le p5, p1, :cond_4 */
/* .line 6 */
p1 = this.c;
p5 = (( c.k.a.b ) p1 ).available ( ); // invoke-virtual {p1}, Lc/k/a/b;->available()I
/* .line 7 */
} // :cond_4
p1 = this.c;
p1 = (( c.k.a.b ) p1 ).read ( p3, p4, p5 ); // invoke-virtual {p1, p3, p4, p5}, Lc/k/a/b;->read([BII)I
/* if-ltz p1, :cond_5 */
/* .line 8 */
/* iget-wide p2, p0, Lc/k/a/a;->b:J */
/* int-to-long p4, p1 */
/* add-long/2addr p2, p4 */
/* iput-wide p2, p0, Lc/k/a/a;->b:J */
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
} // :cond_5
/* const-wide/16 p1, -0x1 */
/* .line 9 */
/* iput-wide p1, p0, Lc/k/a/a;->b:J */
} // .end method
