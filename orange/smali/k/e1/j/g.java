public class k.e1.j.g extends k.e1.j.b {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public Boolean f;
	 /* # direct methods */
	 public k.e1.j.g ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 1 */
		 /* invoke-direct {p0, p1, v0}, Lk/e1/j/b;-><init>(Lk/e1/j/h;Lk/e1/j/a;)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Long b ( Object p0, Long p1 ) {
		 /* .locals 3 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Ljava/io/IOException; */
		 /* } */
	 } // .end annotation
	 /* const-wide/16 v0, 0x0 */
	 /* cmp-long v2, p2, v0 */
	 /* if-ltz v2, :cond_3 */
	 /* .line 1 */
	 /* iget-boolean v0, p0, Lk/e1/j/b;->c:Z */
	 /* if-nez v0, :cond_2 */
	 /* .line 2 */
	 /* iget-boolean v0, p0, Lk/e1/j/g;->f:Z */
	 /* const-wide/16 v1, -0x1 */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* return-wide v1 */
		 /* .line 3 */
	 } // :cond_0
	 /* invoke-super {p0, p1, p2, p3}, Lk/e1/j/b;->b(Ll/f;J)J */
	 /* move-result-wide p1 */
	 /* cmp-long p3, p1, v1 */
	 /* if-nez p3, :cond_1 */
	 int p1 = 1; // const/4 p1, 0x1
	 /* .line 4 */
	 /* iput-boolean p1, p0, Lk/e1/j/g;->f:Z */
	 int p2 = 0; // const/4 p2, 0x0
	 /* .line 5 */
	 (( k.e1.j.b ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lk/e1/j/b;->a(ZLjava/io/IOException;)V
	 /* return-wide v1 */
} // :cond_1
/* return-wide p1 */
/* .line 6 */
} // :cond_2
/* new-instance p1, Ljava/lang/IllegalStateException; */
final String p2 = "closed"; // const-string p2, "closed"
/* invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
/* .line 7 */
} // :cond_3
/* new-instance p1, Ljava/lang/IllegalArgumentException; */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "byteCount < 0: "; // const-string v1, "byteCount < 0: "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p2, p3 ); // invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
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
/* iget-boolean v0, p0, Lk/e1/j/b;->c:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
return;
/* .line 2 */
} // :cond_0
/* iget-boolean v0, p0, Lk/e1/j/g;->f:Z */
/* if-nez v0, :cond_1 */
int v0 = 0; // const/4 v0, 0x0
int v1 = 0; // const/4 v1, 0x0
/* .line 3 */
(( k.e1.j.b ) p0 ).a ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lk/e1/j/b;->a(ZLjava/io/IOException;)V
} // :cond_1
int v0 = 1; // const/4 v0, 0x1
/* .line 4 */
/* iput-boolean v0, p0, Lk/e1/j/b;->c:Z */
return;
} // .end method
