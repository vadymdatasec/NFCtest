public class k.e1.k.h extends l.k {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public Boolean c;
	 public Long d;
	 public final k.e1.k.i e; //synthetic
	 /* # direct methods */
	 public k.e1.k.h ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.e = p1;
		 /* .line 2 */
		 /* invoke-direct {p0, p2}, Ll/k;-><init>(Ll/y;)V */
		 int p1 = 0; // const/4 p1, 0x0
		 /* .line 3 */
		 /* iput-boolean p1, p0, Lk/e1/k/h;->c:Z */
		 /* const-wide/16 p1, 0x0 */
		 /* .line 4 */
		 /* iput-wide p1, p0, Lk/e1/k/h;->d:J */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final void a ( java.io.IOException p0 ) {
		 /* .locals 7 */
		 /* .line 1 */
		 /* iget-boolean v0, p0, Lk/e1/k/h;->c:Z */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 return;
		 } // :cond_0
		 int v0 = 1; // const/4 v0, 0x1
		 /* .line 2 */
		 /* iput-boolean v0, p0, Lk/e1/k/h;->c:Z */
		 /* .line 3 */
		 v3 = this.e;
		 v1 = this.b;
		 int v2 = 0; // const/4 v2, 0x0
		 /* iget-wide v4, p0, Lk/e1/k/h;->d:J */
		 /* move-object v6, p1 */
		 /* invoke-virtual/range {v1 ..v6}, Lk/e1/h/h;->a(ZLk/e1/i/d;JLjava/io/IOException;)V */
		 return;
	 } // .end method
	 public Long b ( Object p0, Long p1 ) {
		 /* .locals 2 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Ljava/io/IOException; */
		 /* } */
	 } // .end annotation
	 /* .line 1 */
	 try { // :try_start_0
		 (( l.k ) p0 ).c ( ); // invoke-virtual {p0}, Ll/k;->c()Ll/y;
		 /* move-result-wide p1 */
		 /* const-wide/16 v0, 0x0 */
		 /* cmp-long p3, p1, v0 */
		 /* if-lez p3, :cond_0 */
		 /* .line 2 */
		 /* iget-wide v0, p0, Lk/e1/k/h;->d:J */
		 /* add-long/2addr v0, p1 */
		 /* iput-wide v0, p0, Lk/e1/k/h;->d:J */
		 /* :try_end_0 */
		 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
	 } // :cond_0
	 /* return-wide p1 */
	 /* :catch_0 */
	 /* move-exception p1 */
	 /* .line 3 */
	 (( k.e1.k.h ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lk/e1/k/h;->a(Ljava/io/IOException;)V
	 /* .line 4 */
	 /* throw p1 */
} // .end method
public void close ( ) {
	 /* .locals 1 */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Ljava/io/IOException; */
	 /* } */
} // .end annotation
/* .line 1 */
/* invoke-super {p0}, Ll/k;->close()V */
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
(( k.e1.k.h ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lk/e1/k/h;->a(Ljava/io/IOException;)V
return;
} // .end method
