public class k.e1.g.a implements l.y {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public Boolean b;
	 public final l.h c; //synthetic
	 public final k.e1.g.c d; //synthetic
	 public final l.g e; //synthetic
	 /* # direct methods */
	 public k.e1.g.a ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.c = p2;
		 this.d = p3;
		 this.e = p4;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public l.a0 a ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.c;
	 } // .end method
	 public Long b ( Object p0, Long p1 ) {
		 /* .locals 8 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Ljava/io/IOException; */
		 /* } */
	 } // .end annotation
	 int v0 = 1; // const/4 v0, 0x1
	 /* .line 1 */
	 try { // :try_start_0
		 v1 = this.c;
		 /* move-result-wide p2 */
		 /* :try_end_0 */
		 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* const-wide/16 v1, -0x1 */
		 /* cmp-long v3, p2, v1 */
		 /* if-nez v3, :cond_1 */
		 /* .line 2 */
		 /* iget-boolean p1, p0, Lk/e1/g/a;->b:Z */
		 /* if-nez p1, :cond_0 */
		 /* .line 3 */
		 /* iput-boolean v0, p0, Lk/e1/g/a;->b:Z */
		 /* .line 4 */
		 p1 = this.e;
	 } // :cond_0
	 /* return-wide v1 */
	 /* .line 5 */
} // :cond_1
v0 = this.e;
(( l.f ) p1 ).q ( ); // invoke-virtual {p1}, Ll/f;->q()J
/* move-result-wide v0 */
/* sub-long v4, v0, p2 */
/* move-object v2, p1 */
/* move-wide v6, p2 */
/* invoke-virtual/range {v2 ..v7}, Ll/f;->a(Ll/f;JJ)Ll/f; */
/* .line 6 */
p1 = this.e;
/* return-wide p2 */
/* :catch_0 */
/* move-exception p1 */
/* .line 7 */
/* iget-boolean p2, p0, Lk/e1/g/a;->b:Z */
/* if-nez p2, :cond_2 */
/* .line 8 */
/* iput-boolean v0, p0, Lk/e1/g/a;->b:Z */
/* .line 9 */
p2 = this.d;
/* .line 10 */
} // :cond_2
/* throw p1 */
} // .end method
public void close ( ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
/* iget-boolean v0, p0, Lk/e1/g/a;->b:Z */
/* if-nez v0, :cond_0 */
/* const/16 v0, 0x64 */
v1 = java.util.concurrent.TimeUnit.MILLISECONDS;
/* .line 2 */
v0 = k.e1.e .a ( p0,v0,v1 );
/* if-nez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
/* .line 3 */
/* iput-boolean v0, p0, Lk/e1/g/a;->b:Z */
/* .line 4 */
v0 = this.d;
/* .line 5 */
} // :cond_0
v0 = this.c;
return;
} // .end method
