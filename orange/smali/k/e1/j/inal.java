public class inal implements k.e1.i.d {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final k.o0 a;
	 public final k.e1.h.h b;
	 public final l.h c;
	 public final l.g d;
	 public Integer e;
	 public Long f;
	 /* # direct methods */
	 public inal ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 2 */
		 /* iput v0, p0, Lk/e1/j/h;->e:I */
		 /* const-wide/32 v0, 0x40000 */
		 /* .line 3 */
		 /* iput-wide v0, p0, Lk/e1/j/h;->f:J */
		 /* .line 4 */
		 this.a = p1;
		 /* .line 5 */
		 this.b = p2;
		 /* .line 6 */
		 this.c = p3;
		 /* .line 7 */
		 this.d = p4;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public k.b1 a ( k.z0 p0 ) {
		 /* .locals 6 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Ljava/io/IOException; */
		 /* } */
	 } // .end annotation
	 /* .line 9 */
	 v0 = this.b;
	 v1 = this.f;
	 v0 = this.e;
	 (( k.a0 ) v1 ).e ( v0 ); // invoke-virtual {v1, v0}, Lk/a0;->e(Lk/g;)V
	 final String v0 = "Content-Type"; // const-string v0, "Content-Type"
	 /* .line 10 */
	 (( k.z0 ) p1 ).b ( v0 ); // invoke-virtual {p1, v0}, Lk/z0;->b(Ljava/lang/String;)Ljava/lang/String;
	 /* .line 11 */
	 v1 = 	 k.e1.i.g .b ( p1 );
	 /* if-nez v1, :cond_0 */
	 /* const-wide/16 v1, 0x0 */
	 /* .line 12 */
	 (( k.e1.j.h ) p0 ).b ( v1, v2 ); // invoke-virtual {p0, v1, v2}, Lk/e1/j/h;->b(J)Ll/y;
	 /* .line 13 */
	 /* new-instance v3, Lk/e1/i/j; */
	 l.r .a ( p1 );
	 /* invoke-direct {v3, v0, v1, v2, p1}, Lk/e1/i/j;-><init>(Ljava/lang/String;JLl/h;)V */
} // :cond_0
final String v1 = "Transfer-Encoding"; // const-string v1, "Transfer-Encoding"
/* .line 14 */
(( k.z0 ) p1 ).b ( v1 ); // invoke-virtual {p1, v1}, Lk/z0;->b(Ljava/lang/String;)Ljava/lang/String;
final String v2 = "chunked"; // const-string v2, "chunked"
v1 = (( java.lang.String ) v2 ).equalsIgnoreCase ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
/* const-wide/16 v2, -0x1 */
if ( v1 != null) { // if-eqz v1, :cond_1
	 /* .line 15 */
	 (( k.z0 ) p1 ).s ( ); // invoke-virtual {p1}, Lk/z0;->s()Lk/u0;
	 (( k.u0 ) p1 ).g ( ); // invoke-virtual {p1}, Lk/u0;->g()Lk/f0;
	 (( k.e1.j.h ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lk/e1/j/h;->a(Lk/f0;)Ll/y;
	 /* .line 16 */
	 /* new-instance v1, Lk/e1/i/j; */
	 l.r .a ( p1 );
	 /* invoke-direct {v1, v0, v2, v3, p1}, Lk/e1/i/j;-><init>(Ljava/lang/String;JLl/h;)V */
	 /* .line 17 */
} // :cond_1
k.e1.i.g .a ( p1 );
/* move-result-wide v4 */
/* cmp-long p1, v4, v2 */
if ( p1 != null) { // if-eqz p1, :cond_2
	 /* .line 18 */
	 (( k.e1.j.h ) p0 ).b ( v4, v5 ); // invoke-virtual {p0, v4, v5}, Lk/e1/j/h;->b(J)Ll/y;
	 /* .line 19 */
	 /* new-instance v1, Lk/e1/i/j; */
	 l.r .a ( p1 );
	 /* invoke-direct {v1, v0, v4, v5, p1}, Lk/e1/i/j;-><init>(Ljava/lang/String;JLl/h;)V */
	 /* .line 20 */
} // :cond_2
/* new-instance p1, Lk/e1/i/j; */
(( k.e1.j.h ) p0 ).d ( ); // invoke-virtual {p0}, Lk/e1/j/h;->d()Ll/y;
l.r .a ( v1 );
/* invoke-direct {p1, v0, v2, v3, v1}, Lk/e1/i/j;-><init>(Ljava/lang/String;JLl/h;)V */
} // .end method
public k.y0 a ( Boolean p0 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 32 */
/* iget v0, p0, Lk/e1/j/h;->e:I */
int v1 = 3; // const/4 v1, 0x3
int v2 = 1; // const/4 v2, 0x1
/* if-eq v0, v2, :cond_1 */
/* if-ne v0, v1, :cond_0 */
/* .line 33 */
} // :cond_0
/* new-instance p1, Ljava/lang/IllegalStateException; */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "state: "; // const-string v1, "state: "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v1, p0, Lk/e1/j/h;->e:I */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
/* .line 34 */
} // :cond_1
} // :goto_0
try { // :try_start_0
(( k.e1.j.h ) p0 ).e ( ); // invoke-virtual {p0}, Lk/e1/j/h;->e()Ljava/lang/String;
k.e1.i.m .a ( v0 );
/* .line 35 */
/* new-instance v2, Lk/y0; */
/* invoke-direct {v2}, Lk/y0;-><init>()V */
v3 = this.a;
/* .line 36 */
(( k.y0 ) v2 ).a ( v3 ); // invoke-virtual {v2, v3}, Lk/y0;->a(Lk/p0;)Lk/y0;
/* iget v3, v0, Lk/e1/i/m;->b:I */
/* .line 37 */
(( k.y0 ) v2 ).a ( v3 ); // invoke-virtual {v2, v3}, Lk/y0;->a(I)Lk/y0;
v3 = this.c;
/* .line 38 */
(( k.y0 ) v2 ).a ( v3 ); // invoke-virtual {v2, v3}, Lk/y0;->a(Ljava/lang/String;)Lk/y0;
/* .line 39 */
(( k.e1.j.h ) p0 ).f ( ); // invoke-virtual {p0}, Lk/e1/j/h;->f()Lk/d0;
(( k.y0 ) v2 ).a ( v3 ); // invoke-virtual {v2, v3}, Lk/y0;->a(Lk/d0;)Lk/y0;
/* const/16 v3, 0x64 */
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 40 */
/* iget p1, v0, Lk/e1/i/m;->b:I */
/* if-ne p1, v3, :cond_2 */
int p1 = 0; // const/4 p1, 0x0
/* .line 41 */
} // :cond_2
/* iget p1, v0, Lk/e1/i/m;->b:I */
/* if-ne p1, v3, :cond_3 */
/* .line 42 */
/* iput v1, p0, Lk/e1/j/h;->e:I */
} // :cond_3
int p1 = 4; // const/4 p1, 0x4
/* .line 43 */
/* iput p1, p0, Lk/e1/j/h;->e:I */
/* :try_end_0 */
/* .catch Ljava/io/EOFException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p1 */
/* .line 44 */
/* new-instance v0, Ljava/io/IOException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "unexpected end of stream on "; // const-string v2, "unexpected end of stream on "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.b;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V */
/* .line 45 */
(( java.io.IOException ) v0 ).initCause ( p1 ); // invoke-virtual {v0, p1}, Ljava/io/IOException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;
/* .line 46 */
/* throw v0 */
} // .end method
public l.x a ( Long p0 ) {
/* .locals 2 */
/* .line 47 */
/* iget v0, p0, Lk/e1/j/h;->e:I */
int v1 = 1; // const/4 v1, 0x1
/* if-ne v0, v1, :cond_0 */
int v0 = 2; // const/4 v0, 0x2
/* .line 48 */
/* iput v0, p0, Lk/e1/j/h;->e:I */
/* .line 49 */
/* new-instance v0, Lk/e1/j/e; */
/* invoke-direct {v0, p0, p1, p2}, Lk/e1/j/e;-><init>(Lk/e1/j/h;J)V */
/* .line 50 */
} // :cond_0
/* new-instance p1, Ljava/lang/IllegalStateException; */
/* new-instance p2, Ljava/lang/StringBuilder; */
/* invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V */
final String v0 = "state: "; // const-string v0, "state: "
(( java.lang.StringBuilder ) p2 ).append ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v0, p0, Lk/e1/j/h;->e:I */
(( java.lang.StringBuilder ) p2 ).append ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public l.x a ( k.u0 p0, Long p1 ) {
/* .locals 2 */
final String v0 = "Transfer-Encoding"; // const-string v0, "Transfer-Encoding"
/* .line 1 */
(( k.u0 ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Lk/u0;->a(Ljava/lang/String;)Ljava/lang/String;
final String v0 = "chunked"; // const-string v0, "chunked"
p1 = (( java.lang.String ) v0 ).equalsIgnoreCase ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 2 */
(( k.e1.j.h ) p0 ).c ( ); // invoke-virtual {p0}, Lk/e1/j/h;->c()Ll/x;
} // :cond_0
/* const-wide/16 v0, -0x1 */
/* cmp-long p1, p2, v0 */
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 3 */
(( k.e1.j.h ) p0 ).a ( p2, p3 ); // invoke-virtual {p0, p2, p3}, Lk/e1/j/h;->a(J)Ll/x;
/* .line 4 */
} // :cond_1
/* new-instance p1, Ljava/lang/IllegalStateException; */
final String p2 = "Cannot stream a request body without chunked encoding or a known content length!"; // const-string p2, "Cannot stream a request body without chunked encoding or a known content length!"
/* invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public l.y a ( k.f0 p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 51 */
/* iget v0, p0, Lk/e1/j/h;->e:I */
int v1 = 4; // const/4 v1, 0x4
/* if-ne v0, v1, :cond_0 */
int v0 = 5; // const/4 v0, 0x5
/* .line 52 */
/* iput v0, p0, Lk/e1/j/h;->e:I */
/* .line 53 */
/* new-instance v0, Lk/e1/j/d; */
/* invoke-direct {v0, p0, p1}, Lk/e1/j/d;-><init>(Lk/e1/j/h;Lk/f0;)V */
/* .line 54 */
} // :cond_0
/* new-instance p1, Ljava/lang/IllegalStateException; */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "state: "; // const-string v1, "state: "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v1, p0, Lk/e1/j/h;->e:I */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public void a ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 21 */
v0 = this.d;
return;
} // .end method
public void a ( k.d0 p0, java.lang.String p1 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 22 */
/* iget v0, p0, Lk/e1/j/h;->e:I */
/* if-nez v0, :cond_1 */
/* .line 23 */
v0 = this.d;
final String v0 = "\r\n"; // const-string v0, "\r\n"
int p2 = 0; // const/4 p2, 0x0
/* .line 24 */
v1 = (( k.d0 ) p1 ).b ( ); // invoke-virtual {p1}, Lk/d0;->b()I
} // :goto_0
/* if-ge p2, v1, :cond_0 */
/* .line 25 */
v2 = this.d;
(( k.d0 ) p1 ).a ( p2 ); // invoke-virtual {p1, p2}, Lk/d0;->a(I)Ljava/lang/String;
final String v3 = ": "; // const-string v3, ": "
/* .line 26 */
/* .line 27 */
(( k.d0 ) p1 ).b ( p2 ); // invoke-virtual {p1, p2}, Lk/d0;->b(I)Ljava/lang/String;
/* .line 28 */
/* add-int/lit8 p2, p2, 0x1 */
/* .line 29 */
} // :cond_0
p1 = this.d;
int p1 = 1; // const/4 p1, 0x1
/* .line 30 */
/* iput p1, p0, Lk/e1/j/h;->e:I */
return;
/* .line 31 */
} // :cond_1
/* new-instance p1, Ljava/lang/IllegalStateException; */
/* new-instance p2, Ljava/lang/StringBuilder; */
/* invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V */
final String v0 = "state: "; // const-string v0, "state: "
(( java.lang.StringBuilder ) p2 ).append ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v0, p0, Lk/e1/j/h;->e:I */
(( java.lang.StringBuilder ) p2 ).append ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public void a ( k.u0 p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 5 */
v0 = this.b;
/* .line 6 */
(( k.e1.h.h ) v0 ).c ( ); // invoke-virtual {v0}, Lk/e1/h/h;->c()Lk/e1/h/c;
(( k.e1.h.c ) v0 ).e ( ); // invoke-virtual {v0}, Lk/e1/h/c;->e()Lk/c1;
(( k.c1 ) v0 ).b ( ); // invoke-virtual {v0}, Lk/c1;->b()Ljava/net/Proxy;
(( java.net.Proxy ) v0 ).type ( ); // invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;
/* .line 7 */
k.e1.i.k .a ( p1,v0 );
/* .line 8 */
(( k.u0 ) p1 ).c ( ); // invoke-virtual {p1}, Lk/u0;->c()Lk/d0;
(( k.e1.j.h ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lk/e1/j/h;->a(Lk/d0;Ljava/lang/String;)V
return;
} // .end method
public void a ( Object p0 ) {
/* .locals 2 */
/* .line 55 */
(( l.l ) p1 ).g ( ); // invoke-virtual {p1}, Ll/l;->g()Ll/a0;
/* .line 56 */
v1 = l.a0.d;
(( l.l ) p1 ).a ( v1 ); // invoke-virtual {p1, v1}, Ll/l;->a(Ll/a0;)Ll/l;
/* .line 57 */
(( l.a0 ) v0 ).a ( ); // invoke-virtual {v0}, Ll/a0;->a()Ll/a0;
/* .line 58 */
(( l.a0 ) v0 ).b ( ); // invoke-virtual {v0}, Ll/a0;->b()Ll/a0;
return;
} // .end method
public l.y b ( Long p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 2 */
/* iget v0, p0, Lk/e1/j/h;->e:I */
int v1 = 4; // const/4 v1, 0x4
/* if-ne v0, v1, :cond_0 */
int v0 = 5; // const/4 v0, 0x5
/* .line 3 */
/* iput v0, p0, Lk/e1/j/h;->e:I */
/* .line 4 */
/* new-instance v0, Lk/e1/j/f; */
/* invoke-direct {v0, p0, p1, p2}, Lk/e1/j/f;-><init>(Lk/e1/j/h;J)V */
/* .line 5 */
} // :cond_0
/* new-instance p1, Ljava/lang/IllegalStateException; */
/* new-instance p2, Ljava/lang/StringBuilder; */
/* invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V */
final String v0 = "state: "; // const-string v0, "state: "
(( java.lang.StringBuilder ) p2 ).append ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v0, p0, Lk/e1/j/h;->e:I */
(( java.lang.StringBuilder ) p2 ).append ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public void b ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.d;
return;
} // .end method
public l.x c ( ) {
/* .locals 3 */
/* .line 1 */
/* iget v0, p0, Lk/e1/j/h;->e:I */
int v1 = 1; // const/4 v1, 0x1
/* if-ne v0, v1, :cond_0 */
int v0 = 2; // const/4 v0, 0x2
/* .line 2 */
/* iput v0, p0, Lk/e1/j/h;->e:I */
/* .line 3 */
/* new-instance v0, Lk/e1/j/c; */
/* invoke-direct {v0, p0}, Lk/e1/j/c;-><init>(Lk/e1/j/h;)V */
/* .line 4 */
} // :cond_0
/* new-instance v0, Ljava/lang/IllegalStateException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "state: "; // const-string v2, "state: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v2, p0, Lk/e1/j/h;->e:I */
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public void cancel ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
(( k.e1.h.h ) v0 ).c ( ); // invoke-virtual {v0}, Lk/e1/h/h;->c()Lk/e1/h/c;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( k.e1.h.c ) v0 ).a ( ); // invoke-virtual {v0}, Lk/e1/h/c;->a()V
} // :cond_0
return;
} // .end method
public l.y d ( ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
/* iget v0, p0, Lk/e1/j/h;->e:I */
int v1 = 4; // const/4 v1, 0x4
/* if-ne v0, v1, :cond_1 */
/* .line 2 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
int v1 = 5; // const/4 v1, 0x5
/* .line 3 */
/* iput v1, p0, Lk/e1/j/h;->e:I */
/* .line 4 */
(( k.e1.h.h ) v0 ).e ( ); // invoke-virtual {v0}, Lk/e1/h/h;->e()V
/* .line 5 */
/* new-instance v0, Lk/e1/j/g; */
/* invoke-direct {v0, p0}, Lk/e1/j/g;-><init>(Lk/e1/j/h;)V */
/* .line 6 */
} // :cond_0
/* new-instance v0, Ljava/lang/IllegalStateException; */
final String v1 = "streamAllocation == null"; // const-string v1, "streamAllocation == null"
/* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* .line 7 */
} // :cond_1
/* new-instance v0, Ljava/lang/IllegalStateException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "state: "; // const-string v2, "state: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v2, p0, Lk/e1/j/h;->e:I */
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public final java.lang.String e ( ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.c;
/* iget-wide v1, p0, Lk/e1/j/h;->f:J */
/* .line 2 */
/* iget-wide v1, p0, Lk/e1/j/h;->f:J */
v3 = (( java.lang.String ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/String;->length()I
/* int-to-long v3, v3 */
/* sub-long/2addr v1, v3 */
/* iput-wide v1, p0, Lk/e1/j/h;->f:J */
} // .end method
public k.d0 f ( ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
/* new-instance v0, Lk/c0; */
/* invoke-direct {v0}, Lk/c0;-><init>()V */
/* .line 2 */
} // :goto_0
(( k.e1.j.h ) p0 ).e ( ); // invoke-virtual {p0}, Lk/e1/j/h;->e()Ljava/lang/String;
v2 = (( java.lang.String ) v1 ).length ( ); // invoke-virtual {v1}, Ljava/lang/String;->length()I
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 3 */
v2 = k.e1.a.a;
(( k.e1.a ) v2 ).a ( v0, v1 ); // invoke-virtual {v2, v0, v1}, Lk/e1/a;->a(Lk/c0;Ljava/lang/String;)V
/* .line 4 */
} // :cond_0
(( k.c0 ) v0 ).a ( ); // invoke-virtual {v0}, Lk/c0;->a()Lk/d0;
} // .end method
