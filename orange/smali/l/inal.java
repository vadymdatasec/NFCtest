public class inal implements l.h {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final l.f b;
	 public final l.y c;
	 public Boolean d;
	 /* # direct methods */
	 public inal ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 /* new-instance v0, Ll/f; */
		 /* invoke-direct {v0}, Ll/f;-><init>()V */
		 this.b = v0;
		 if ( p1 != null) { // if-eqz p1, :cond_0
			 /* .line 3 */
			 this.c = p1;
			 return;
			 /* .line 4 */
		 } // :cond_0
		 /* new-instance p1, Ljava/lang/NullPointerException; */
		 final String v0 = "source == null"; // const-string v0, "source == null"
		 /* invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V */
		 /* throw p1 */
	 } // .end method
	 /* # virtual methods */
	 public Long a ( Object p0 ) {
		 /* .locals 6 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Ljava/io/IOException; */
		 /* } */
	 } // .end annotation
	 /* const-wide/16 v2, 0x0 */
	 /* const-wide v4, 0x7fffffffffffffffL */
	 /* move-object v0, p0 */
	 /* move v1, p1 */
	 /* .line 4 */
	 /* invoke-virtual/range {v0 ..v5}, Ll/t;->a(BJJ)J */
	 /* move-result-wide v0 */
	 /* return-wide v0 */
} // .end method
public Long a ( Object p0, Long p1, Long p2 ) {
	 /* .locals 9 */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Ljava/io/IOException; */
	 /* } */
} // .end annotation
/* .line 5 */
/* iget-boolean v0, p0, Ll/t;->d:Z */
/* if-nez v0, :cond_4 */
/* const-wide/16 v0, 0x0 */
/* cmp-long v2, p2, v0 */
/* if-ltz v2, :cond_3 */
/* cmp-long v0, p4, p2 */
/* if-ltz v0, :cond_3 */
} // :goto_0
/* const-wide/16 v7, -0x1 */
/* cmp-long v0, p2, p4 */
/* if-gez v0, :cond_2 */
/* .line 6 */
v1 = this.b;
/* move v2, p1 */
/* move-wide v3, p2 */
/* move-wide v5, p4 */
/* invoke-virtual/range {v1 ..v6}, Ll/f;->a(BJJ)J */
/* move-result-wide v0 */
/* cmp-long v2, v0, v7 */
if ( v2 != null) { // if-eqz v2, :cond_0
/* return-wide v0 */
/* .line 7 */
} // :cond_0
v0 = this.b;
/* iget-wide v1, v0, Ll/f;->c:J */
/* cmp-long v3, v1, p4 */
/* if-gez v3, :cond_2 */
/* .line 8 */
v3 = this.c;
/* const-wide/16 v4, 0x2000 */
/* move-result-wide v3 */
/* cmp-long v0, v3, v7 */
/* if-nez v0, :cond_1 */
/* .line 9 */
} // :cond_1
java.lang.Math .max ( p2,p3,v1,v2 );
/* move-result-wide p2 */
} // :cond_2
} // :goto_1
/* return-wide v7 */
/* .line 10 */
} // :cond_3
/* new-instance p1, Ljava/lang/IllegalArgumentException; */
int v0 = 2; // const/4 v0, 0x2
/* new-array v0, v0, [Ljava/lang/Object; */
int v1 = 0; // const/4 v1, 0x0
/* .line 11 */
java.lang.Long .valueOf ( p2,p3 );
/* aput-object p2, v0, v1 */
int p2 = 1; // const/4 p2, 0x1
java.lang.Long .valueOf ( p4,p5 );
/* aput-object p3, v0, p2 */
final String p2 = "fromIndex=%s toIndex=%s"; // const-string p2, "fromIndex=%s toIndex=%s"
java.lang.String .format ( p2,v0 );
/* invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
/* .line 12 */
} // :cond_4
/* new-instance p1, Ljava/lang/IllegalStateException; */
final String p2 = "closed"; // const-string p2, "closed"
/* invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public java.lang.String a ( java.nio.charset.Charset p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 1 */
v0 = this.b;
v1 = this.c;
(( l.f ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Ll/f;->a(Ll/y;)J
/* .line 2 */
v0 = this.b;
(( l.f ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Ll/f;->a(Ljava/nio/charset/Charset;)Ljava/lang/String;
/* .line 3 */
} // :cond_0
/* new-instance p1, Ljava/lang/IllegalArgumentException; */
final String v0 = "charset == null"; // const-string v0, "charset == null"
/* invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public l.a0 a ( ) {
/* .locals 1 */
/* .line 19 */
v0 = this.c;
} // .end method
public Boolean a ( Long p0, Object p1 ) {
/* .locals 6 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 13 */
v5 = (( l.i ) p3 ).e ( ); // invoke-virtual {p3}, Ll/i;->e()I
int v4 = 0; // const/4 v4, 0x0
/* move-object v0, p0 */
/* move-wide v1, p1 */
/* move-object v3, p3 */
p1 = /* invoke-virtual/range {v0 ..v5}, Ll/t;->a(JLl/i;II)Z */
} // .end method
public Boolean a ( Long p0, Object p1, Integer p2, Integer p3 ) {
/* .locals 7 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 14 */
/* iget-boolean v0, p0, Ll/t;->d:Z */
/* if-nez v0, :cond_5 */
/* const-wide/16 v0, 0x0 */
int v2 = 0; // const/4 v2, 0x0
/* cmp-long v3, p1, v0 */
/* if-ltz v3, :cond_4 */
/* if-ltz p4, :cond_4 */
/* if-ltz p5, :cond_4 */
/* .line 15 */
v0 = (( l.i ) p3 ).e ( ); // invoke-virtual {p3}, Ll/i;->e()I
/* sub-int/2addr v0, p4 */
/* if-ge v0, p5, :cond_0 */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
/* if-ge v0, p5, :cond_3 */
/* int-to-long v3, v0 */
/* add-long/2addr v3, p1 */
/* const-wide/16 v5, 0x1 */
/* add-long/2addr v5, v3 */
/* .line 16 */
v1 = (( l.t ) p0 ).g ( v5, v6 ); // invoke-virtual {p0, v5, v6}, Ll/t;->g(J)Z
/* if-nez v1, :cond_1 */
/* .line 17 */
} // :cond_1
v1 = this.b;
v1 = (( l.f ) v1 ).g ( v3, v4 ); // invoke-virtual {v1, v3, v4}, Ll/f;->g(J)B
/* add-int v3, p4, v0 */
v3 = (( l.i ) p3 ).a ( v3 ); // invoke-virtual {p3, v3}, Ll/i;->a(I)B
/* if-eq v1, v3, :cond_2 */
} // :cond_2
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_3
int p1 = 1; // const/4 p1, 0x1
} // :cond_4
} // :goto_1
/* .line 18 */
} // :cond_5
/* new-instance p1, Ljava/lang/IllegalStateException; */
final String p2 = "closed"; // const-string p2, "closed"
/* invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public Long b ( Object p0, Long p1 ) {
/* .locals 6 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
if ( p1 != null) { // if-eqz p1, :cond_3
/* const-wide/16 v0, 0x0 */
/* cmp-long v2, p2, v0 */
/* if-ltz v2, :cond_2 */
/* .line 2 */
/* iget-boolean v2, p0, Ll/t;->d:Z */
/* if-nez v2, :cond_1 */
/* .line 3 */
v2 = this.b;
/* iget-wide v3, v2, Ll/f;->c:J */
/* cmp-long v5, v3, v0 */
/* if-nez v5, :cond_0 */
/* .line 4 */
v0 = this.c;
/* const-wide/16 v3, 0x2000 */
/* move-result-wide v0 */
/* const-wide/16 v2, -0x1 */
/* cmp-long v4, v0, v2 */
/* if-nez v4, :cond_0 */
/* return-wide v2 */
/* .line 5 */
} // :cond_0
v0 = this.b;
/* iget-wide v0, v0, Ll/f;->c:J */
java.lang.Math .min ( p2,p3,v0,v1 );
/* move-result-wide p2 */
/* .line 6 */
v0 = this.b;
(( l.f ) v0 ).b ( p1, p2, p3 ); // invoke-virtual {v0, p1, p2, p3}, Ll/f;->b(Ll/f;J)J
/* move-result-wide p1 */
/* return-wide p1 */
/* .line 7 */
} // :cond_1
/* new-instance p1, Ljava/lang/IllegalStateException; */
final String p2 = "closed"; // const-string p2, "closed"
/* invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
/* .line 8 */
} // :cond_2
/* new-instance p1, Ljava/lang/IllegalArgumentException; */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "byteCount < 0: "; // const-string v1, "byteCount < 0: "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p2, p3 ); // invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
/* .line 9 */
} // :cond_3
/* new-instance p1, Ljava/lang/IllegalArgumentException; */
final String p2 = "sink == null"; // const-string p2, "sink == null"
/* invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public l.f b ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
} // .end method
public l.i b ( Long p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 10 */
(( l.t ) p0 ).d ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Ll/t;->d(J)V
/* .line 11 */
v0 = this.b;
(( l.f ) v0 ).b ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Ll/f;->b(J)Ll/i;
} // .end method
public java.lang.String c ( Long p0 ) {
/* .locals 12 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* const-wide/16 v0, 0x0 */
/* cmp-long v2, p1, v0 */
/* if-ltz v2, :cond_3 */
/* const-wide/16 v0, 0x1 */
/* const-wide v2, 0x7fffffffffffffffL */
/* cmp-long v4, p1, v2 */
/* if-nez v4, :cond_0 */
/* move-wide v4, v2 */
} // :cond_0
/* add-long v4, p1, v0 */
} // :goto_0
/* const/16 v7, 0xa */
/* const-wide/16 v8, 0x0 */
/* move-object v6, p0 */
/* move-wide v10, v4 */
/* .line 1 */
/* invoke-virtual/range {v6 ..v11}, Ll/t;->a(BJJ)J */
/* move-result-wide v6 */
/* const-wide/16 v8, -0x1 */
/* cmp-long v10, v6, v8 */
if ( v10 != null) { // if-eqz v10, :cond_1
/* .line 2 */
p1 = this.b;
(( l.f ) p1 ).i ( v6, v7 ); // invoke-virtual {p1, v6, v7}, Ll/f;->i(J)Ljava/lang/String;
} // :cond_1
/* cmp-long v6, v4, v2 */
/* if-gez v6, :cond_2 */
/* .line 3 */
v2 = (( l.t ) p0 ).g ( v4, v5 ); // invoke-virtual {p0, v4, v5}, Ll/t;->g(J)Z
if ( v2 != null) { // if-eqz v2, :cond_2
v2 = this.b;
/* sub-long v6, v4, v0 */
v2 = (( l.f ) v2 ).g ( v6, v7 ); // invoke-virtual {v2, v6, v7}, Ll/f;->g(J)B
/* const/16 v3, 0xd */
/* if-ne v2, v3, :cond_2 */
/* add-long/2addr v0, v4 */
/* .line 4 */
v0 = (( l.t ) p0 ).g ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Ll/t;->g(J)Z
if ( v0 != null) { // if-eqz v0, :cond_2
v0 = this.b;
v0 = (( l.f ) v0 ).g ( v4, v5 ); // invoke-virtual {v0, v4, v5}, Ll/f;->g(J)B
/* const/16 v1, 0xa */
/* if-ne v0, v1, :cond_2 */
/* .line 5 */
p1 = this.b;
(( l.f ) p1 ).i ( v4, v5 ); // invoke-virtual {p1, v4, v5}, Ll/f;->i(J)Ljava/lang/String;
/* .line 6 */
} // :cond_2
/* new-instance v6, Ll/f; */
/* invoke-direct {v6}, Ll/f;-><init>()V */
/* .line 7 */
v0 = this.b;
/* const-wide/16 v2, 0x0 */
/* const-wide/16 v4, 0x20 */
(( l.f ) v0 ).q ( ); // invoke-virtual {v0}, Ll/f;->q()J
/* move-result-wide v7 */
java.lang.Math .min ( v4,v5,v7,v8 );
/* move-result-wide v4 */
/* move-object v1, v6 */
/* invoke-virtual/range {v0 ..v5}, Ll/f;->a(Ll/f;JJ)Ll/f; */
/* .line 8 */
/* new-instance v0, Ljava/io/EOFException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "\\n not found: limit="; // const-string v2, "\\n not found: limit="
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.b;
(( l.f ) v2 ).q ( ); // invoke-virtual {v2}, Ll/f;->q()J
/* move-result-wide v2 */
java.lang.Math .min ( v2,v3,p1,p2 );
/* move-result-wide p1 */
(( java.lang.StringBuilder ) v1 ).append ( p1, p2 ); // invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
final String p1 = " content="; // const-string p1, " content="
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 9 */
(( l.f ) v6 ).o ( ); // invoke-virtual {v6}, Ll/f;->o()Ll/i;
(( l.i ) p1 ).b ( ); // invoke-virtual {p1}, Ll/i;->b()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* const/16 p1, 0x2026 */
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, p1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* .line 10 */
} // :cond_3
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "limit < 0: "; // const-string v2, "limit < 0: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1, p2 ); // invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public void close ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
/* iget-boolean v0, p0, Ll/t;->d:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
return;
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
/* .line 2 */
/* iput-boolean v0, p0, Ll/t;->d:Z */
/* .line 3 */
v0 = this.c;
/* .line 4 */
v0 = this.b;
(( l.f ) v0 ).l ( ); // invoke-virtual {v0}, Ll/f;->l()V
return;
} // .end method
public void d ( Long p0 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
p1 = (( l.t ) p0 ).g ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Ll/t;->g(J)Z
if ( p1 != null) { // if-eqz p1, :cond_0
return;
} // :cond_0
/* new-instance p1, Ljava/io/EOFException; */
/* invoke-direct {p1}, Ljava/io/EOFException;-><init>()V */
/* throw p1 */
} // .end method
public Object e ( ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* const-wide/16 v0, 0x2 */
/* .line 1 */
(( l.t ) p0 ).d ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Ll/t;->d(J)V
/* .line 2 */
v0 = this.b;
v0 = (( l.f ) v0 ).e ( ); // invoke-virtual {v0}, Ll/f;->e()S
} // .end method
public f ( Long p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
(( l.t ) p0 ).d ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Ll/t;->d(J)V
/* .line 2 */
v0 = this.b;
(( l.f ) v0 ).f ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Ll/f;->f(J)[B
} // .end method
public java.lang.String g ( ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* const-wide v0, 0x7fffffffffffffffL */
/* .line 6 */
(( l.t ) p0 ).c ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Ll/t;->c(J)Ljava/lang/String;
} // .end method
public Boolean g ( Long p0 ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* const-wide/16 v0, 0x0 */
/* cmp-long v2, p1, v0 */
/* if-ltz v2, :cond_3 */
/* .line 1 */
/* iget-boolean v0, p0, Ll/t;->d:Z */
/* if-nez v0, :cond_2 */
/* .line 2 */
} // :cond_0
v0 = this.b;
/* iget-wide v1, v0, Ll/f;->c:J */
/* cmp-long v3, v1, p1 */
/* if-gez v3, :cond_1 */
/* .line 3 */
v1 = this.c;
/* const-wide/16 v2, 0x2000 */
/* move-result-wide v0 */
/* const-wide/16 v2, -0x1 */
/* cmp-long v4, v0, v2 */
/* if-nez v4, :cond_0 */
int p1 = 0; // const/4 p1, 0x0
} // :cond_1
int p1 = 1; // const/4 p1, 0x1
/* .line 4 */
} // :cond_2
/* new-instance p1, Ljava/lang/IllegalStateException; */
final String p2 = "closed"; // const-string p2, "closed"
/* invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
/* .line 5 */
} // :cond_3
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "byteCount < 0: "; // const-string v2, "byteCount < 0: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1, p2 ); // invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public Integer h ( ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* const-wide/16 v0, 0x4 */
/* .line 1 */
(( l.t ) p0 ).d ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Ll/t;->d(J)V
/* .line 2 */
v0 = this.b;
v0 = (( l.f ) v0 ).h ( ); // invoke-virtual {v0}, Ll/f;->h()I
} // .end method
public Boolean i ( ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
/* iget-boolean v0, p0, Ll/t;->d:Z */
/* if-nez v0, :cond_1 */
/* .line 2 */
v0 = this.b;
v0 = (( l.f ) v0 ).i ( ); // invoke-virtual {v0}, Ll/f;->i()Z
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.c;
v1 = this.b;
/* const-wide/16 v2, 0x2000 */
/* move-result-wide v0 */
/* const-wide/16 v2, -0x1 */
/* cmp-long v4, v0, v2 */
/* if-nez v4, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
/* .line 3 */
} // :cond_1
/* new-instance v0, Ljava/lang/IllegalStateException; */
final String v1 = "closed"; // const-string v1, "closed"
/* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public Boolean isOpen ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Ll/t;->d:Z */
/* xor-int/lit8 v0, v0, 0x1 */
} // .end method
public Long j ( ) {
/* .locals 6 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* const-wide/16 v0, 0x1 */
/* .line 1 */
(( l.t ) p0 ).d ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Ll/t;->d(J)V
int v0 = 0; // const/4 v0, 0x0
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* add-int/lit8 v2, v1, 0x1 */
/* int-to-long v3, v2 */
/* .line 2 */
v3 = (( l.t ) p0 ).g ( v3, v4 ); // invoke-virtual {p0, v3, v4}, Ll/t;->g(J)Z
if ( v3 != null) { // if-eqz v3, :cond_5
/* .line 3 */
v3 = this.b;
/* int-to-long v4, v1 */
v3 = (( l.f ) v3 ).g ( v4, v5 ); // invoke-virtual {v3, v4, v5}, Ll/f;->g(J)B
/* const/16 v4, 0x30 */
/* if-lt v3, v4, :cond_0 */
/* const/16 v4, 0x39 */
/* if-le v3, v4, :cond_2 */
} // :cond_0
/* const/16 v4, 0x61 */
/* if-lt v3, v4, :cond_1 */
/* const/16 v4, 0x66 */
/* if-le v3, v4, :cond_2 */
} // :cond_1
/* const/16 v4, 0x41 */
/* if-lt v3, v4, :cond_3 */
/* const/16 v4, 0x46 */
/* if-le v3, v4, :cond_2 */
} // :cond_2
/* move v1, v2 */
} // :cond_3
} // :goto_1
if ( v1 != null) { // if-eqz v1, :cond_4
/* .line 4 */
} // :cond_4
/* new-instance v1, Ljava/lang/NumberFormatException; */
int v2 = 1; // const/4 v2, 0x1
/* new-array v2, v2, [Ljava/lang/Object; */
/* .line 5 */
java.lang.Byte .valueOf ( v3 );
/* aput-object v3, v2, v0 */
final String v0 = "Expected leading [0-9a-fA-F] character but was %#x"; // const-string v0, "Expected leading [0-9a-fA-F] character but was %#x"
/* .line 6 */
java.lang.String .format ( v0,v2 );
/* invoke-direct {v1, v0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V */
/* throw v1 */
/* .line 7 */
} // :cond_5
} // :goto_2
v0 = this.b;
(( l.f ) v0 ).j ( ); // invoke-virtual {v0}, Ll/f;->j()J
/* move-result-wide v0 */
/* return-wide v0 */
} // .end method
public Integer read ( java.nio.ByteBuffer p0 ) {
/* .locals 6 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.b;
/* iget-wide v1, v0, Ll/f;->c:J */
/* const-wide/16 v3, 0x0 */
/* cmp-long v5, v1, v3 */
/* if-nez v5, :cond_0 */
/* .line 2 */
v1 = this.c;
/* const-wide/16 v2, 0x2000 */
/* move-result-wide v0 */
/* const-wide/16 v2, -0x1 */
/* cmp-long v4, v0, v2 */
/* if-nez v4, :cond_0 */
int p1 = -1; // const/4 p1, -0x1
/* .line 3 */
} // :cond_0
v0 = this.b;
p1 = (( l.f ) v0 ).read ( p1 ); // invoke-virtual {v0, p1}, Ll/f;->read(Ljava/nio/ByteBuffer;)I
} // .end method
public Object readByte ( ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* const-wide/16 v0, 0x1 */
/* .line 1 */
(( l.t ) p0 ).d ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Ll/t;->d(J)V
/* .line 2 */
v0 = this.b;
v0 = (( l.f ) v0 ).readByte ( ); // invoke-virtual {v0}, Ll/f;->readByte()B
} // .end method
public void readFully ( Object[] p0 ) {
/* .locals 8 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
try { // :try_start_0
/* array-length v0, p1 */
/* int-to-long v0, v0 */
(( l.t ) p0 ).d ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Ll/t;->d(J)V
/* :try_end_0 */
/* .catch Ljava/io/EOFException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 2 */
v0 = this.b;
(( l.f ) v0 ).readFully ( p1 ); // invoke-virtual {v0, p1}, Ll/f;->readFully([B)V
return;
/* :catch_0 */
/* move-exception v0 */
int v1 = 0; // const/4 v1, 0x0
/* .line 3 */
} // :goto_0
v2 = this.b;
/* iget-wide v3, v2, Ll/f;->c:J */
/* const-wide/16 v5, 0x0 */
/* cmp-long v7, v3, v5 */
/* if-lez v7, :cond_1 */
/* long-to-int v4, v3 */
/* .line 4 */
v2 = (( l.f ) v2 ).a ( p1, v1, v4 ); // invoke-virtual {v2, p1, v1, v4}, Ll/f;->a([BII)I
int v3 = -1; // const/4 v3, -0x1
/* if-eq v2, v3, :cond_0 */
/* add-int/2addr v1, v2 */
/* .line 5 */
} // :cond_0
/* new-instance p1, Ljava/lang/AssertionError; */
/* invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V */
/* throw p1 */
/* .line 6 */
} // :cond_1
/* throw v0 */
} // .end method
public Integer readInt ( ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* const-wide/16 v0, 0x4 */
/* .line 1 */
(( l.t ) p0 ).d ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Ll/t;->d(J)V
/* .line 2 */
v0 = this.b;
v0 = (( l.f ) v0 ).readInt ( ); // invoke-virtual {v0}, Ll/f;->readInt()I
} // .end method
public Object readShort ( ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* const-wide/16 v0, 0x2 */
/* .line 1 */
(( l.t ) p0 ).d ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Ll/t;->d(J)V
/* .line 2 */
v0 = this.b;
v0 = (( l.f ) v0 ).readShort ( ); // invoke-virtual {v0}, Ll/f;->readShort()S
} // .end method
public void skip ( Long p0 ) {
/* .locals 6 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
/* iget-boolean v0, p0, Ll/t;->d:Z */
/* if-nez v0, :cond_3 */
} // :goto_0
/* const-wide/16 v0, 0x0 */
/* cmp-long v2, p1, v0 */
/* if-lez v2, :cond_2 */
/* .line 2 */
v2 = this.b;
/* iget-wide v3, v2, Ll/f;->c:J */
/* cmp-long v5, v3, v0 */
/* if-nez v5, :cond_1 */
v0 = this.c;
/* const-wide/16 v3, 0x2000 */
/* move-result-wide v0 */
/* const-wide/16 v2, -0x1 */
/* cmp-long v4, v0, v2 */
if ( v4 != null) { // if-eqz v4, :cond_0
/* .line 3 */
} // :cond_0
/* new-instance p1, Ljava/io/EOFException; */
/* invoke-direct {p1}, Ljava/io/EOFException;-><init>()V */
/* throw p1 */
/* .line 4 */
} // :cond_1
} // :goto_1
v0 = this.b;
(( l.f ) v0 ).q ( ); // invoke-virtual {v0}, Ll/f;->q()J
/* move-result-wide v0 */
java.lang.Math .min ( p1,p2,v0,v1 );
/* move-result-wide v0 */
/* .line 5 */
v2 = this.b;
(( l.f ) v2 ).skip ( v0, v1 ); // invoke-virtual {v2, v0, v1}, Ll/f;->skip(J)V
/* sub-long/2addr p1, v0 */
} // :cond_2
return;
/* .line 6 */
} // :cond_3
/* new-instance p1, Ljava/lang/IllegalStateException; */
final String p2 = "closed"; // const-string p2, "closed"
/* invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public java.lang.String toString ( ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "buffer("; // const-string v1, "buffer("
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.c;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v1 = ")"; // const-string v1, ")"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
