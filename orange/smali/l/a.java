public class l.a implements l.x {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final l.x b; //synthetic
	 public final l.d c; //synthetic
	 /* # direct methods */
	 public l.a ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.c = p1;
		 this.b = p2;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public l.a0 a ( ) {
		 /* .locals 1 */
		 /* .line 10 */
		 v0 = this.c;
	 } // .end method
	 public void a ( Object p0, Long p1 ) {
		 /* .locals 6 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Ljava/io/IOException; */
		 /* } */
	 } // .end annotation
	 /* .line 1 */
	 /* iget-wide v0, p1, Ll/f;->c:J */
	 /* const-wide/16 v2, 0x0 */
	 /* move-wide v4, p2 */
	 /* invoke-static/range {v0 ..v5}, Ll/b0;->a(JJJ)V */
} // :goto_0
/* const-wide/16 v0, 0x0 */
/* cmp-long v2, p2, v0 */
/* if-lez v2, :cond_2 */
/* .line 2 */
v2 = this.b;
} // :goto_1
/* const-wide/32 v3, 0x10000 */
/* cmp-long v5, v0, v3 */
/* if-gez v5, :cond_1 */
/* .line 3 */
/* iget v3, v2, Ll/u;->c:I */
/* iget v4, v2, Ll/u;->b:I */
/* sub-int/2addr v3, v4 */
/* int-to-long v3, v3 */
/* add-long/2addr v0, v3 */
/* cmp-long v3, v0, p2 */
/* if-ltz v3, :cond_0 */
/* move-wide v0, p2 */
/* .line 4 */
} // :cond_0
v2 = this.f;
} // :cond_1
} // :goto_2
int v2 = 0; // const/4 v2, 0x0
/* .line 5 */
v3 = this.c;
(( l.d ) v3 ).g ( ); // invoke-virtual {v3}, Ll/d;->g()V
/* .line 6 */
try { // :try_start_0
v3 = this.b;
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* sub-long/2addr p2, v0 */
int v0 = 1; // const/4 v0, 0x1
/* .line 7 */
v1 = this.c;
(( l.d ) v1 ).a ( v0 ); // invoke-virtual {v1, v0}, Ll/d;->a(Z)V
/* :catchall_0 */
/* move-exception p1 */
/* :catch_0 */
/* move-exception p1 */
/* .line 8 */
try { // :try_start_1
p2 = this.c;
(( l.d ) p2 ).a ( p1 ); // invoke-virtual {p2, p1}, Ll/d;->a(Ljava/io/IOException;)Ljava/io/IOException;
/* throw p1 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 9 */
} // :goto_3
p2 = this.c;
(( l.d ) p2 ).a ( v2 ); // invoke-virtual {p2, v2}, Ll/d;->a(Z)V
/* throw p1 */
} // :cond_2
return;
} // .end method
public void close ( ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.c;
(( l.d ) v0 ).g ( ); // invoke-virtual {v0}, Ll/d;->g()V
/* .line 2 */
try { // :try_start_0
v0 = this.b;
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
int v0 = 1; // const/4 v0, 0x1
/* .line 3 */
v1 = this.c;
(( l.d ) v1 ).a ( v0 ); // invoke-virtual {v1, v0}, Ll/d;->a(Z)V
return;
/* :catchall_0 */
/* move-exception v0 */
/* :catch_0 */
/* move-exception v0 */
/* .line 4 */
try { // :try_start_1
v1 = this.c;
(( l.d ) v1 ).a ( v0 ); // invoke-virtual {v1, v0}, Ll/d;->a(Ljava/io/IOException;)Ljava/io/IOException;
/* throw v0 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 5 */
} // :goto_0
v1 = this.c;
int v2 = 0; // const/4 v2, 0x0
(( l.d ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Ll/d;->a(Z)V
/* throw v0 */
} // .end method
public void flush ( ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.c;
(( l.d ) v0 ).g ( ); // invoke-virtual {v0}, Ll/d;->g()V
/* .line 2 */
try { // :try_start_0
v0 = this.b;
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
int v0 = 1; // const/4 v0, 0x1
/* .line 3 */
v1 = this.c;
(( l.d ) v1 ).a ( v0 ); // invoke-virtual {v1, v0}, Ll/d;->a(Z)V
return;
/* :catchall_0 */
/* move-exception v0 */
/* :catch_0 */
/* move-exception v0 */
/* .line 4 */
try { // :try_start_1
v1 = this.c;
(( l.d ) v1 ).a ( v0 ); // invoke-virtual {v1, v0}, Ll/d;->a(Ljava/io/IOException;)Ljava/io/IOException;
/* throw v0 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 5 */
} // :goto_0
v1 = this.c;
int v2 = 0; // const/4 v2, 0x0
(( l.d ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Ll/d;->a(Z)V
/* throw v0 */
} // .end method
public java.lang.String toString ( ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "AsyncTimeout.sink("; // const-string v1, "AsyncTimeout.sink("
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.b;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v1 = ")"; // const-string v1, ")"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
