public class inal implements java.io.Flushable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final b;
	 public final Integer c;
	 public Integer d;
	 public final java.io.OutputStream e;
	 /* # direct methods */
	 public inal ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.e = p1;
		 /* .line 3 */
		 this.b = p2;
		 int p1 = 0; // const/4 p1, 0x0
		 /* .line 4 */
		 /* iput p1, p0, Le/f/c/l/e/s/e;->d:I */
		 /* .line 5 */
		 /* array-length p1, p2 */
		 /* iput p1, p0, Le/f/c/l/e/s/e;->c:I */
		 return;
	 } // .end method
	 public static e.f.c.l.e.s.e a ( java.io.OutputStream p0 ) {
		 /* .locals 1 */
		 /* const/16 v0, 0x1000 */
		 /* .line 1 */
		 e.f.c.l.e.s.e .a ( p0,v0 );
	 } // .end method
	 public static e.f.c.l.e.s.e a ( java.io.OutputStream p0, Integer p1 ) {
		 /* .locals 1 */
		 /* .line 2 */
		 /* new-instance v0, Le/f/c/l/e/s/e; */
		 /* new-array p1, p1, [B */
		 /* invoke-direct {v0, p0, p1}, Le/f/c/l/e/s/e;-><init>(Ljava/io/OutputStream;[B)V */
	 } // .end method
	 public static Integer b ( Float p0 ) {
		 /* .locals 0 */
		 int p0 = 4; // const/4 p0, 0x4
	 } // .end method
	 public static Integer b ( Integer p0, Float p1 ) {
		 /* .locals 0 */
		 /* .line 5 */
		 p0 = 		 e.f.c.l.e.s.e .l ( p0 );
		 p1 = 		 e.f.c.l.e.s.e .b ( p1 );
		 /* add-int/2addr p0, p1 */
	 } // .end method
	 public static Integer b ( Integer p0, Long p1 ) {
		 /* .locals 0 */
		 /* .line 6 */
		 p0 = 		 e.f.c.l.e.s.e .l ( p0 );
		 p1 = 		 e.f.c.l.e.s.e .f ( p1,p2 );
		 /* add-int/2addr p0, p1 */
	 } // .end method
	 public static Integer b ( Integer p0, Object p1 ) {
		 /* .locals 0 */
		 /* .line 8 */
		 p0 = 		 e.f.c.l.e.s.e .l ( p0 );
		 p1 = 		 e.f.c.l.e.s.e .c ( p1 );
		 /* add-int/2addr p0, p1 */
	 } // .end method
	 public static Integer b ( Integer p0, Boolean p1 ) {
		 /* .locals 0 */
		 /* .line 7 */
		 p0 = 		 e.f.c.l.e.s.e .l ( p0 );
		 p1 = 		 e.f.c.l.e.s.e .b ( p1 );
		 /* add-int/2addr p0, p1 */
	 } // .end method
	 public static Integer b ( Boolean p0 ) {
		 /* .locals 0 */
		 int p0 = 1; // const/4 p0, 0x1
	 } // .end method
	 public static Integer c ( Object p0 ) {
		 /* .locals 1 */
		 /* .line 2 */
		 v0 = 		 (( e.f.c.l.e.s.a ) p0 ).b ( ); // invoke-virtual {p0}, Le/f/c/l/e/s/a;->b()I
		 v0 = 		 e.f.c.l.e.s.e .j ( v0 );
		 p0 = 		 (( e.f.c.l.e.s.a ) p0 ).b ( ); // invoke-virtual {p0}, Le/f/c/l/e/s/a;->b()I
		 /* add-int/2addr v0, p0 */
	 } // .end method
	 public static Integer d ( Long p0 ) {
		 /* .locals 5 */
		 /* const-wide/16 v0, -0x80 */
		 /* and-long/2addr v0, p0 */
		 /* const-wide/16 v2, 0x0 */
		 /* cmp-long v4, v0, v2 */
		 /* if-nez v4, :cond_0 */
		 int p0 = 1; // const/4 p0, 0x1
	 } // :cond_0
	 /* const-wide/16 v0, -0x4000 */
	 /* and-long/2addr v0, p0 */
	 /* cmp-long v4, v0, v2 */
	 /* if-nez v4, :cond_1 */
	 int p0 = 2; // const/4 p0, 0x2
} // :cond_1
/* const-wide/32 v0, -0x200000 */
/* and-long/2addr v0, p0 */
/* cmp-long v4, v0, v2 */
/* if-nez v4, :cond_2 */
int p0 = 3; // const/4 p0, 0x3
} // :cond_2
/* const-wide/32 v0, -0x10000000 */
/* and-long/2addr v0, p0 */
/* cmp-long v4, v0, v2 */
/* if-nez v4, :cond_3 */
int p0 = 4; // const/4 p0, 0x4
} // :cond_3
/* const-wide v0, -0x800000000L */
/* and-long/2addr v0, p0 */
/* cmp-long v4, v0, v2 */
/* if-nez v4, :cond_4 */
int p0 = 5; // const/4 p0, 0x5
} // :cond_4
/* const-wide v0, -0x40000000000L */
/* and-long/2addr v0, p0 */
/* cmp-long v4, v0, v2 */
/* if-nez v4, :cond_5 */
int p0 = 6; // const/4 p0, 0x6
} // :cond_5
/* const-wide/high16 v0, -0x2000000000000L */
/* and-long/2addr v0, p0 */
/* cmp-long v4, v0, v2 */
/* if-nez v4, :cond_6 */
int p0 = 7; // const/4 p0, 0x7
} // :cond_6
/* const-wide/high16 v0, -0x100000000000000L */
/* and-long/2addr v0, p0 */
/* cmp-long v4, v0, v2 */
/* if-nez v4, :cond_7 */
/* const/16 p0, 0x8 */
} // :cond_7
/* const-wide/high16 v0, -0x8000000000000000L */
/* and-long/2addr p0, v0 */
/* cmp-long v0, p0, v2 */
/* if-nez v0, :cond_8 */
/* const/16 p0, 0x9 */
} // :cond_8
/* const/16 p0, 0xa */
} // .end method
public static Integer e ( Integer p0, Integer p1 ) {
/* .locals 0 */
/* .line 1 */
p0 = e.f.c.l.e.s.e .l ( p0 );
p1 = e.f.c.l.e.s.e .h ( p1 );
/* add-int/2addr p0, p1 */
} // .end method
public static Integer f ( Integer p0, Integer p1 ) {
/* .locals 0 */
/* .line 2 */
p0 = e.f.c.l.e.s.e .l ( p0 );
p1 = e.f.c.l.e.s.e .k ( p1 );
/* add-int/2addr p0, p1 */
} // .end method
public static Integer f ( Long p0 ) {
/* .locals 0 */
/* .line 3 */
p0 = e.f.c.l.e.s.e .d ( p0,p1 );
} // .end method
public static Integer g ( Integer p0, Integer p1 ) {
/* .locals 0 */
/* .line 2 */
p0 = e.f.c.l.e.s.e .l ( p0 );
p1 = e.f.c.l.e.s.e .m ( p1 );
/* add-int/2addr p0, p1 */
} // .end method
public static Integer h ( Integer p0 ) {
/* .locals 0 */
/* .line 1 */
p0 = e.f.c.l.e.s.e .i ( p0 );
} // .end method
public static Integer i ( Integer p0 ) {
/* .locals 0 */
/* if-ltz p0, :cond_0 */
/* .line 1 */
p0 = e.f.c.l.e.s.e .j ( p0 );
} // :cond_0
/* const/16 p0, 0xa */
} // .end method
public static Integer j ( Integer p0 ) {
/* .locals 1 */
/* and-int/lit8 v0, p0, -0x80 */
/* if-nez v0, :cond_0 */
int p0 = 1; // const/4 p0, 0x1
} // :cond_0
/* and-int/lit16 v0, p0, -0x4000 */
/* if-nez v0, :cond_1 */
int p0 = 2; // const/4 p0, 0x2
} // :cond_1
/* const/high16 v0, -0x200000 */
/* and-int/2addr v0, p0 */
/* if-nez v0, :cond_2 */
int p0 = 3; // const/4 p0, 0x3
} // :cond_2
/* const/high16 v0, -0x10000000 */
/* and-int/2addr p0, v0 */
/* if-nez p0, :cond_3 */
int p0 = 4; // const/4 p0, 0x4
} // :cond_3
int p0 = 5; // const/4 p0, 0x5
} // .end method
public static Integer k ( Integer p0 ) {
/* .locals 0 */
/* .line 1 */
p0 = e.f.c.l.e.s.e .n ( p0 );
p0 = e.f.c.l.e.s.e .j ( p0 );
} // .end method
public static Integer l ( Integer p0 ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
p0 = e.f.c.l.e.s.g .a ( p0,v0 );
p0 = e.f.c.l.e.s.e .j ( p0 );
} // .end method
public static Integer m ( Integer p0 ) {
/* .locals 0 */
/* .line 1 */
p0 = e.f.c.l.e.s.e .j ( p0 );
} // .end method
public static Integer n ( Integer p0 ) {
/* .locals 1 */
/* shl-int/lit8 v0, p0, 0x1 */
/* shr-int/lit8 p0, p0, 0x1f */
/* xor-int/2addr p0, v0 */
} // .end method
/* # virtual methods */
public void a ( Object p0 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 18 */
/* iget v0, p0, Le/f/c/l/e/s/e;->d:I */
/* iget v1, p0, Le/f/c/l/e/s/e;->c:I */
/* if-ne v0, v1, :cond_0 */
/* .line 19 */
(( e.f.c.l.e.s.e ) p0 ).c ( ); // invoke-virtual {p0}, Le/f/c/l/e/s/e;->c()V
/* .line 20 */
} // :cond_0
v0 = this.b;
/* iget v1, p0, Le/f/c/l/e/s/e;->d:I */
/* add-int/lit8 v2, v1, 0x1 */
/* iput v2, p0, Le/f/c/l/e/s/e;->d:I */
/* aput-byte p1, v0, v1 */
return;
} // .end method
public void a ( Float p0 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 13 */
p1 = java.lang.Float .floatToRawIntBits ( p1 );
(( e.f.c.l.e.s.e ) p0 ).d ( p1 ); // invoke-virtual {p0, p1}, Le/f/c/l/e/s/e;->d(I)V
return;
} // .end method
public void a ( Integer p0 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 17 */
(( e.f.c.l.e.s.e ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Le/f/c/l/e/s/e;->b(I)V
return;
} // .end method
public void a ( Integer p0, Float p1 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
int v0 = 5; // const/4 v0, 0x5
/* .line 3 */
(( e.f.c.l.e.s.e ) p0 ).c ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Le/f/c/l/e/s/e;->c(II)V
/* .line 4 */
(( e.f.c.l.e.s.e ) p0 ).a ( p2 ); // invoke-virtual {p0, p2}, Le/f/c/l/e/s/e;->a(F)V
return;
} // .end method
public void a ( Integer p0, Integer p1 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
int v0 = 0; // const/4 v0, 0x0
/* .line 11 */
(( e.f.c.l.e.s.e ) p0 ).c ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Le/f/c/l/e/s/e;->c(II)V
/* .line 12 */
(( e.f.c.l.e.s.e ) p0 ).a ( p2 ); // invoke-virtual {p0, p2}, Le/f/c/l/e/s/e;->a(I)V
return;
} // .end method
public void a ( Integer p0, Long p1 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
int v0 = 0; // const/4 v0, 0x0
/* .line 5 */
(( e.f.c.l.e.s.e ) p0 ).c ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Le/f/c/l/e/s/e;->c(II)V
/* .line 6 */
(( e.f.c.l.e.s.e ) p0 ).c ( p2, p3 ); // invoke-virtual {p0, p2, p3}, Le/f/c/l/e/s/e;->c(J)V
return;
} // .end method
public void a ( Integer p0, Object p1 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
int v0 = 2; // const/4 v0, 0x2
/* .line 9 */
(( e.f.c.l.e.s.e ) p0 ).c ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Le/f/c/l/e/s/e;->c(II)V
/* .line 10 */
(( e.f.c.l.e.s.e ) p0 ).a ( p2 ); // invoke-virtual {p0, p2}, Le/f/c/l/e/s/e;->a(Le/f/c/l/e/s/a;)V
return;
} // .end method
public void a ( Integer p0, Boolean p1 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
int v0 = 0; // const/4 v0, 0x0
/* .line 7 */
(( e.f.c.l.e.s.e ) p0 ).c ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Le/f/c/l/e/s/e;->c(II)V
/* .line 8 */
(( e.f.c.l.e.s.e ) p0 ).a ( p2 ); // invoke-virtual {p0, p2}, Le/f/c/l/e/s/e;->a(Z)V
return;
} // .end method
public void a ( Object p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 15 */
v0 = (( e.f.c.l.e.s.a ) p1 ).b ( ); // invoke-virtual {p1}, Le/f/c/l/e/s/a;->b()I
(( e.f.c.l.e.s.e ) p0 ).e ( v0 ); // invoke-virtual {p0, v0}, Le/f/c/l/e/s/e;->e(I)V
/* .line 16 */
(( e.f.c.l.e.s.e ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Le/f/c/l/e/s/e;->b(Le/f/c/l/e/s/a;)V
return;
} // .end method
public void a ( Object p0, Integer p1, Integer p2 ) {
/* .locals 6 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 32 */
/* iget v0, p0, Le/f/c/l/e/s/e;->c:I */
/* iget v1, p0, Le/f/c/l/e/s/e;->d:I */
/* sub-int v2, v0, v1 */
/* if-lt v2, p3, :cond_0 */
/* .line 33 */
v0 = this.b;
(( e.f.c.l.e.s.a ) p1 ).a ( v0, p2, v1, p3 ); // invoke-virtual {p1, v0, p2, v1, p3}, Le/f/c/l/e/s/a;->a([BIII)V
/* .line 34 */
/* iget p1, p0, Le/f/c/l/e/s/e;->d:I */
/* add-int/2addr p1, p3 */
/* iput p1, p0, Le/f/c/l/e/s/e;->d:I */
} // :cond_0
/* sub-int/2addr v0, v1 */
/* .line 35 */
v2 = this.b;
(( e.f.c.l.e.s.a ) p1 ).a ( v2, p2, v1, v0 ); // invoke-virtual {p1, v2, p2, v1, v0}, Le/f/c/l/e/s/a;->a([BIII)V
/* add-int/2addr p2, v0 */
/* sub-int/2addr p3, v0 */
/* .line 36 */
/* iget v0, p0, Le/f/c/l/e/s/e;->c:I */
/* iput v0, p0, Le/f/c/l/e/s/e;->d:I */
/* .line 37 */
(( e.f.c.l.e.s.e ) p0 ).c ( ); // invoke-virtual {p0}, Le/f/c/l/e/s/e;->c()V
/* .line 38 */
/* iget v0, p0, Le/f/c/l/e/s/e;->c:I */
int v1 = 0; // const/4 v1, 0x0
/* if-gt p3, v0, :cond_1 */
/* .line 39 */
v0 = this.b;
(( e.f.c.l.e.s.a ) p1 ).a ( v0, p2, v1, p3 ); // invoke-virtual {p1, v0, p2, v1, p3}, Le/f/c/l/e/s/a;->a([BIII)V
/* .line 40 */
/* iput p3, p0, Le/f/c/l/e/s/e;->d:I */
/* .line 41 */
} // :cond_1
(( e.f.c.l.e.s.a ) p1 ).a ( ); // invoke-virtual {p1}, Le/f/c/l/e/s/a;->a()Ljava/io/InputStream;
/* int-to-long v2, p2 */
/* .line 42 */
(( java.io.InputStream ) p1 ).skip ( v2, v3 ); // invoke-virtual {p1, v2, v3}, Ljava/io/InputStream;->skip(J)J
/* move-result-wide v4 */
/* cmp-long p2, v2, v4 */
/* if-nez p2, :cond_4 */
} // :goto_0
/* if-lez p3, :cond_3 */
/* .line 43 */
/* iget p2, p0, Le/f/c/l/e/s/e;->c:I */
p2 = java.lang.Math .min ( p3,p2 );
/* .line 44 */
v0 = this.b;
v0 = (( java.io.InputStream ) p1 ).read ( v0, v1, p2 ); // invoke-virtual {p1, v0, v1, p2}, Ljava/io/InputStream;->read([BII)I
/* if-ne v0, p2, :cond_2 */
/* .line 45 */
p2 = this.e;
v2 = this.b;
(( java.io.OutputStream ) p2 ).write ( v2, v1, v0 ); // invoke-virtual {p2, v2, v1, v0}, Ljava/io/OutputStream;->write([BII)V
/* sub-int/2addr p3, v0 */
/* .line 46 */
} // :cond_2
/* new-instance p1, Ljava/lang/IllegalStateException; */
final String p2 = "Read failed."; // const-string p2, "Read failed."
/* invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // :cond_3
} // :goto_1
return;
/* .line 47 */
} // :cond_4
/* new-instance p1, Ljava/lang/IllegalStateException; */
final String p2 = "Skip failed."; // const-string p2, "Skip failed."
/* invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public void a ( Boolean p0 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 14 */
(( e.f.c.l.e.s.e ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Le/f/c/l/e/s/e;->c(I)V
return;
} // .end method
public void a ( Object[] p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 21 */
/* array-length v0, p1 */
int v1 = 0; // const/4 v1, 0x0
(( e.f.c.l.e.s.e ) p0 ).a ( p1, v1, v0 ); // invoke-virtual {p0, p1, v1, v0}, Le/f/c/l/e/s/e;->a([BII)V
return;
} // .end method
public void a ( Object[] p0, Integer p1, Integer p2 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 22 */
/* iget v0, p0, Le/f/c/l/e/s/e;->c:I */
/* iget v1, p0, Le/f/c/l/e/s/e;->d:I */
/* sub-int v2, v0, v1 */
/* if-lt v2, p3, :cond_0 */
/* .line 23 */
v0 = this.b;
java.lang.System .arraycopy ( p1,p2,v0,v1,p3 );
/* .line 24 */
/* iget p1, p0, Le/f/c/l/e/s/e;->d:I */
/* add-int/2addr p1, p3 */
/* iput p1, p0, Le/f/c/l/e/s/e;->d:I */
} // :cond_0
/* sub-int/2addr v0, v1 */
/* .line 25 */
v2 = this.b;
java.lang.System .arraycopy ( p1,p2,v2,v1,v0 );
/* add-int/2addr p2, v0 */
/* sub-int/2addr p3, v0 */
/* .line 26 */
/* iget v0, p0, Le/f/c/l/e/s/e;->c:I */
/* iput v0, p0, Le/f/c/l/e/s/e;->d:I */
/* .line 27 */
(( e.f.c.l.e.s.e ) p0 ).c ( ); // invoke-virtual {p0}, Le/f/c/l/e/s/e;->c()V
/* .line 28 */
/* iget v0, p0, Le/f/c/l/e/s/e;->c:I */
/* if-gt p3, v0, :cond_1 */
/* .line 29 */
v0 = this.b;
int v1 = 0; // const/4 v1, 0x0
java.lang.System .arraycopy ( p1,p2,v0,v1,p3 );
/* .line 30 */
/* iput p3, p0, Le/f/c/l/e/s/e;->d:I */
/* .line 31 */
} // :cond_1
v0 = this.e;
(( java.io.OutputStream ) v0 ).write ( p1, p2, p3 ); // invoke-virtual {v0, p1, p2, p3}, Ljava/io/OutputStream;->write([BII)V
} // :goto_0
return;
} // .end method
public void b ( Integer p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* if-ltz p1, :cond_0 */
/* .line 3 */
(( e.f.c.l.e.s.e ) p0 ).e ( p1 ); // invoke-virtual {p0, p1}, Le/f/c/l/e/s/e;->e(I)V
} // :cond_0
/* int-to-long v0, p1 */
/* .line 4 */
(( e.f.c.l.e.s.e ) p0 ).b ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Le/f/c/l/e/s/e;->b(J)V
} // :goto_0
return;
} // .end method
public void b ( Integer p0, Integer p1 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
(( e.f.c.l.e.s.e ) p0 ).c ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Le/f/c/l/e/s/e;->c(II)V
/* .line 2 */
(( e.f.c.l.e.s.e ) p0 ).f ( p2 ); // invoke-virtual {p0, p2}, Le/f/c/l/e/s/e;->f(I)V
return;
} // .end method
public void b ( Long p0 ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
} // :goto_0
/* const-wide/16 v0, -0x80 */
/* and-long/2addr v0, p1 */
/* const-wide/16 v2, 0x0 */
/* cmp-long v4, v0, v2 */
/* if-nez v4, :cond_0 */
/* long-to-int p2, p1 */
/* .line 10 */
(( e.f.c.l.e.s.e ) p0 ).c ( p2 ); // invoke-virtual {p0, p2}, Le/f/c/l/e/s/e;->c(I)V
return;
} // :cond_0
/* long-to-int v0, p1 */
/* and-int/lit8 v0, v0, 0x7f */
/* or-int/lit16 v0, v0, 0x80 */
/* .line 11 */
(( e.f.c.l.e.s.e ) p0 ).c ( v0 ); // invoke-virtual {p0, v0}, Le/f/c/l/e/s/e;->c(I)V
int v0 = 7; // const/4 v0, 0x7
/* ushr-long/2addr p1, v0 */
} // .end method
public void b ( Object p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 9 */
v0 = (( e.f.c.l.e.s.a ) p1 ).b ( ); // invoke-virtual {p1}, Le/f/c/l/e/s/a;->b()I
int v1 = 0; // const/4 v1, 0x0
(( e.f.c.l.e.s.e ) p0 ).a ( p1, v1, v0 ); // invoke-virtual {p0, p1, v1, v0}, Le/f/c/l/e/s/e;->a(Le/f/c/l/e/s/a;II)V
return;
} // .end method
public final void c ( ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 3 */
v0 = this.e;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 4 */
v1 = this.b;
/* iget v2, p0, Le/f/c/l/e/s/e;->d:I */
int v3 = 0; // const/4 v3, 0x0
(( java.io.OutputStream ) v0 ).write ( v1, v3, v2 ); // invoke-virtual {v0, v1, v3, v2}, Ljava/io/OutputStream;->write([BII)V
/* .line 5 */
/* iput v3, p0, Le/f/c/l/e/s/e;->d:I */
return;
/* .line 6 */
} // :cond_0
/* new-instance v0, Le/f/c/l/e/s/d; */
/* invoke-direct {v0}, Le/f/c/l/e/s/d;-><init>()V */
/* throw v0 */
} // .end method
public void c ( Integer p0 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* int-to-byte p1, p1 */
/* .line 7 */
(( e.f.c.l.e.s.e ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/f/c/l/e/s/e;->a(B)V
return;
} // .end method
public void c ( Integer p0, Integer p1 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 8 */
p1 = e.f.c.l.e.s.g .a ( p1,p2 );
(( e.f.c.l.e.s.e ) p0 ).e ( p1 ); // invoke-virtual {p0, p1}, Le/f/c/l/e/s/e;->e(I)V
return;
} // .end method
public void c ( Long p0 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
(( e.f.c.l.e.s.e ) p0 ).b ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/f/c/l/e/s/e;->b(J)V
return;
} // .end method
public void d ( Integer p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* and-int/lit16 v0, p1, 0xff */
/* .line 3 */
(( e.f.c.l.e.s.e ) p0 ).c ( v0 ); // invoke-virtual {p0, v0}, Le/f/c/l/e/s/e;->c(I)V
/* shr-int/lit8 v0, p1, 0x8 */
/* and-int/lit16 v0, v0, 0xff */
/* .line 4 */
(( e.f.c.l.e.s.e ) p0 ).c ( v0 ); // invoke-virtual {p0, v0}, Le/f/c/l/e/s/e;->c(I)V
/* shr-int/lit8 v0, p1, 0x10 */
/* and-int/lit16 v0, v0, 0xff */
/* .line 5 */
(( e.f.c.l.e.s.e ) p0 ).c ( v0 ); // invoke-virtual {p0, v0}, Le/f/c/l/e/s/e;->c(I)V
/* shr-int/lit8 p1, p1, 0x18 */
/* and-int/lit16 p1, p1, 0xff */
/* .line 6 */
(( e.f.c.l.e.s.e ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Le/f/c/l/e/s/e;->c(I)V
return;
} // .end method
public void d ( Integer p0, Integer p1 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
(( e.f.c.l.e.s.e ) p0 ).c ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Le/f/c/l/e/s/e;->c(II)V
/* .line 2 */
(( e.f.c.l.e.s.e ) p0 ).g ( p2 ); // invoke-virtual {p0, p2}, Le/f/c/l/e/s/e;->g(I)V
return;
} // .end method
public void e ( Integer p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
} // :goto_0
/* and-int/lit8 v0, p1, -0x80 */
/* if-nez v0, :cond_0 */
/* .line 2 */
(( e.f.c.l.e.s.e ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Le/f/c/l/e/s/e;->c(I)V
return;
} // :cond_0
/* and-int/lit8 v0, p1, 0x7f */
/* or-int/lit16 v0, v0, 0x80 */
/* .line 3 */
(( e.f.c.l.e.s.e ) p0 ).c ( v0 ); // invoke-virtual {p0, v0}, Le/f/c/l/e/s/e;->c(I)V
/* ushr-int/lit8 p1, p1, 0x7 */
} // .end method
public void f ( Integer p0 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
p1 = e.f.c.l.e.s.e .n ( p1 );
(( e.f.c.l.e.s.e ) p0 ).e ( p1 ); // invoke-virtual {p0, p1}, Le/f/c/l/e/s/e;->e(I)V
return;
} // .end method
public void flush ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.e;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( e.f.c.l.e.s.e ) p0 ).c ( ); // invoke-virtual {p0}, Le/f/c/l/e/s/e;->c()V
} // :cond_0
return;
} // .end method
public void g ( Integer p0 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
(( e.f.c.l.e.s.e ) p0 ).e ( p1 ); // invoke-virtual {p0, p1}, Le/f/c/l/e/s/e;->e(I)V
return;
} // .end method
