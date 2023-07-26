public class k.e1.j.d extends k.e1.j.b {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final k.f0 f;
	 public Long g;
	 public Boolean h;
	 public final k.e1.j.h i; //synthetic
	 /* # direct methods */
	 public k.e1.j.d ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 this.i = p1;
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0, p1, v0}, Lk/e1/j/b;-><init>(Lk/e1/j/h;Lk/e1/j/a;)V */
		 /* const-wide/16 v0, -0x1 */
		 /* .line 2 */
		 /* iput-wide v0, p0, Lk/e1/j/d;->g:J */
		 int p1 = 1; // const/4 p1, 0x1
		 /* .line 3 */
		 /* iput-boolean p1, p0, Lk/e1/j/d;->h:Z */
		 /* .line 4 */
		 this.f = p2;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Long b ( Object p0, Long p1 ) {
		 /* .locals 7 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Ljava/io/IOException; */
		 /* } */
	 } // .end annotation
	 /* const-wide/16 v0, 0x0 */
	 /* cmp-long v2, p2, v0 */
	 /* if-ltz v2, :cond_5 */
	 /* .line 1 */
	 /* iget-boolean v2, p0, Lk/e1/j/b;->c:Z */
	 /* if-nez v2, :cond_4 */
	 /* .line 2 */
	 /* iget-boolean v2, p0, Lk/e1/j/d;->h:Z */
	 /* const-wide/16 v3, -0x1 */
	 /* if-nez v2, :cond_0 */
	 /* return-wide v3 */
	 /* .line 3 */
} // :cond_0
/* iget-wide v5, p0, Lk/e1/j/d;->g:J */
/* cmp-long v2, v5, v0 */
if ( v2 != null) { // if-eqz v2, :cond_1
	 /* cmp-long v0, v5, v3 */
	 /* if-nez v0, :cond_2 */
	 /* .line 4 */
} // :cond_1
(( k.e1.j.d ) p0 ).c ( ); // invoke-virtual {p0}, Lk/e1/j/d;->c()V
/* .line 5 */
/* iget-boolean v0, p0, Lk/e1/j/d;->h:Z */
/* if-nez v0, :cond_2 */
/* return-wide v3 */
/* .line 6 */
} // :cond_2
/* iget-wide v0, p0, Lk/e1/j/d;->g:J */
java.lang.Math .min ( p2,p3,v0,v1 );
/* move-result-wide p2 */
/* invoke-super {p0, p1, p2, p3}, Lk/e1/j/b;->b(Ll/f;J)J */
/* move-result-wide p1 */
/* cmp-long p3, p1, v3 */
if ( p3 != null) { // if-eqz p3, :cond_3
/* .line 7 */
/* iget-wide v0, p0, Lk/e1/j/d;->g:J */
/* sub-long/2addr v0, p1 */
/* iput-wide v0, p0, Lk/e1/j/d;->g:J */
/* return-wide p1 */
/* .line 8 */
} // :cond_3
/* new-instance p1, Ljava/net/ProtocolException; */
final String p2 = "unexpected end of stream"; // const-string p2, "unexpected end of stream"
/* invoke-direct {p1, p2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V */
int p2 = 0; // const/4 p2, 0x0
/* .line 9 */
(( k.e1.j.b ) p0 ).a ( p2, p1 ); // invoke-virtual {p0, p2, p1}, Lk/e1/j/b;->a(ZLjava/io/IOException;)V
/* .line 10 */
/* throw p1 */
/* .line 11 */
} // :cond_4
/* new-instance p1, Ljava/lang/IllegalStateException; */
final String p2 = "closed"; // const-string p2, "closed"
/* invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
/* .line 12 */
} // :cond_5
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
public final void c ( ) {
/* .locals 6 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
/* iget-wide v0, p0, Lk/e1/j/d;->g:J */
/* const-wide/16 v2, -0x1 */
/* cmp-long v4, v0, v2 */
if ( v4 != null) { // if-eqz v4, :cond_0
/* .line 2 */
v0 = this.i;
v0 = this.c;
/* .line 3 */
} // :cond_0
try { // :try_start_0
v0 = this.i;
v0 = this.c;
/* move-result-wide v0 */
/* iput-wide v0, p0, Lk/e1/j/d;->g:J */
/* .line 4 */
v0 = this.i;
v0 = this.c;
(( java.lang.String ) v0 ).trim ( ); // invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
/* .line 5 */
/* iget-wide v1, p0, Lk/e1/j/d;->g:J */
/* const-wide/16 v3, 0x0 */
/* cmp-long v5, v1, v3 */
/* if-ltz v5, :cond_3 */
v1 = (( java.lang.String ) v0 ).isEmpty ( ); // invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z
/* if-nez v1, :cond_1 */
final String v1 = ";"; // const-string v1, ";"
v1 = (( java.lang.String ) v0 ).startsWith ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
/* :try_end_0 */
/* .catch Ljava/lang/NumberFormatException; {:try_start_0 ..:try_end_0} :catch_0 */
if ( v1 != null) { // if-eqz v1, :cond_3
/* .line 6 */
} // :cond_1
/* iget-wide v0, p0, Lk/e1/j/d;->g:J */
/* cmp-long v2, v0, v3 */
/* if-nez v2, :cond_2 */
int v0 = 0; // const/4 v0, 0x0
/* .line 7 */
/* iput-boolean v0, p0, Lk/e1/j/d;->h:Z */
/* .line 8 */
v0 = this.i;
v0 = this.a;
(( k.o0 ) v0 ).h ( ); // invoke-virtual {v0}, Lk/o0;->h()Lk/t;
v1 = this.f;
v2 = this.i;
(( k.e1.j.h ) v2 ).f ( ); // invoke-virtual {v2}, Lk/e1/j/h;->f()Lk/d0;
k.e1.i.g .a ( v0,v1,v2 );
int v0 = 1; // const/4 v0, 0x1
int v1 = 0; // const/4 v1, 0x0
/* .line 9 */
(( k.e1.j.b ) p0 ).a ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lk/e1/j/b;->a(ZLjava/io/IOException;)V
} // :cond_2
return;
/* .line 10 */
} // :cond_3
try { // :try_start_1
/* new-instance v1, Ljava/net/ProtocolException; */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "expected chunk size and optional extensions but was \""; // const-string v3, "expected chunk size and optional extensions but was \""
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget-wide v3, p0, Lk/e1/j/d;->g:J */
(( java.lang.StringBuilder ) v2 ).append ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v0 = "\""; // const-string v0, "\""
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v1, v0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V */
/* throw v1 */
/* :try_end_1 */
/* .catch Ljava/lang/NumberFormatException; {:try_start_1 ..:try_end_1} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
/* .line 11 */
/* new-instance v1, Ljava/net/ProtocolException; */
(( java.lang.NumberFormatException ) v0 ).getMessage ( ); // invoke-virtual {v0}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;
/* invoke-direct {v1, v0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V */
/* throw v1 */
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
/* iget-boolean v0, p0, Lk/e1/j/d;->h:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
/* const/16 v0, 0x64 */
v1 = java.util.concurrent.TimeUnit.MILLISECONDS;
v0 = k.e1.e .a ( p0,v0,v1 );
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
