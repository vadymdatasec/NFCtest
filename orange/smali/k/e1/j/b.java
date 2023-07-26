public abstract class k.e1.j.b implements l.y {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final l.l b;
	 public Boolean c;
	 public Long d;
	 public final k.e1.j.h e; //synthetic
	 /* # direct methods */
	 public k.e1.j.b ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 this.e = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 /* new-instance p1, Ll/l; */
		 v0 = this.e;
		 v0 = this.c;
		 /* invoke-direct {p1, v0}, Ll/l;-><init>(Ll/a0;)V */
		 this.b = p1;
		 /* const-wide/16 v0, 0x0 */
		 /* .line 3 */
		 /* iput-wide v0, p0, Lk/e1/j/b;->d:J */
		 return;
	 } // .end method
	 public k.e1.j.b ( ) { //synthethic
		 /* .locals 0 */
		 /* .line 4 */
		 /* invoke-direct {p0, p1}, Lk/e1/j/b;-><init>(Lk/e1/j/h;)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public l.a0 a ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.b;
	 } // .end method
	 public final void a ( Boolean p0, java.io.IOException p1 ) {
		 /* .locals 9 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Ljava/io/IOException; */
		 /* } */
	 } // .end annotation
	 /* .line 2 */
	 v0 = this.e;
	 /* iget v1, v0, Lk/e1/j/h;->e:I */
	 int v2 = 6; // const/4 v2, 0x6
	 /* if-ne v1, v2, :cond_0 */
	 return;
} // :cond_0
int v3 = 5; // const/4 v3, 0x5
/* if-ne v1, v3, :cond_2 */
/* .line 3 */
v1 = this.b;
(( k.e1.j.h ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lk/e1/j/h;->a(Ll/l;)V
/* .line 4 */
v5 = this.e;
/* iput v2, v5, Lk/e1/j/h;->e:I */
/* .line 5 */
v3 = this.b;
if ( v3 != null) { // if-eqz v3, :cond_1
	 /* xor-int/lit8 v4, p1, 0x1 */
	 /* .line 6 */
	 /* iget-wide v6, p0, Lk/e1/j/b;->d:J */
	 /* move-object v8, p2 */
	 /* invoke-virtual/range {v3 ..v8}, Lk/e1/h/h;->a(ZLk/e1/i/d;JLjava/io/IOException;)V */
} // :cond_1
return;
/* .line 7 */
} // :cond_2
/* new-instance p1, Ljava/lang/IllegalStateException; */
/* new-instance p2, Ljava/lang/StringBuilder; */
/* invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V */
final String v0 = "state: "; // const-string v0, "state: "
(( java.lang.StringBuilder ) p2 ).append ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v0 = this.e;
/* iget v0, v0, Lk/e1/j/h;->e:I */
(( java.lang.StringBuilder ) p2 ).append ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
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
v0 = this.e;
v0 = this.c;
/* move-result-wide p1 */
/* const-wide/16 v0, 0x0 */
/* cmp-long p3, p1, v0 */
/* if-lez p3, :cond_0 */
/* .line 2 */
/* iget-wide v0, p0, Lk/e1/j/b;->d:J */
/* add-long/2addr v0, p1 */
/* iput-wide v0, p0, Lk/e1/j/b;->d:J */
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
} // :cond_0
/* return-wide p1 */
/* :catch_0 */
/* move-exception p1 */
int p2 = 0; // const/4 p2, 0x0
/* .line 3 */
(( k.e1.j.b ) p0 ).a ( p2, p1 ); // invoke-virtual {p0, p2, p1}, Lk/e1/j/b;->a(ZLjava/io/IOException;)V
/* .line 4 */
/* throw p1 */
} // .end method
