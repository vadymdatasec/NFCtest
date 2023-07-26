public class e.b.a.y.z.e.m0 extends java.io.FilterInputStream {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public volatile b;
	 public Integer c;
	 public Integer d;
	 public Integer e;
	 public Integer f;
	 public final e.b.a.y.x.f1.b g;
	 /* # direct methods */
	 public e.b.a.y.z.e.m0 ( ) {
		 /* .locals 1 */
		 /* const/high16 v0, 0x10000 */
		 /* .line 1 */
		 /* invoke-direct {p0, p1, p2, v0}, Le/b/a/y/z/e/m0;-><init>(Ljava/io/InputStream;Le/b/a/y/x/f1/b;I)V */
		 return;
	 } // .end method
	 public e.b.a.y.z.e.m0 ( ) {
		 /* .locals 0 */
		 /* .line 2 */
		 /* invoke-direct {p0, p1}, Ljava/io/FilterInputStream;-><init>(Ljava/io/InputStream;)V */
		 int p1 = -1; // const/4 p1, -0x1
		 /* .line 3 */
		 /* iput p1, p0, Le/b/a/y/z/e/m0;->e:I */
		 /* .line 4 */
		 this.g = p2;
		 /* .line 5 */
		 /* const-class p1, [B */
		 /* check-cast p1, [B */
		 this.b = p1;
		 return;
	 } // .end method
	 public static java.io.IOException m ( ) {
		 /* .locals 2 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Ljava/io/IOException; */
		 /* } */
	 } // .end annotation
	 /* .line 1 */
	 /* new-instance v0, Ljava/io/IOException; */
	 final String v1 = "BufferedInputStream is closed"; // const-string v1, "BufferedInputStream is closed"
	 /* invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V */
	 /* throw v0 */
} // .end method
/* # virtual methods */
public final Integer a ( java.io.InputStream p0, Object[] p1 ) {
	 /* .locals 5 */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Ljava/io/IOException; */
	 /* } */
} // .end annotation
/* .line 1 */
/* iget v0, p0, Le/b/a/y/z/e/m0;->e:I */
int v1 = -1; // const/4 v1, -0x1
int v2 = 0; // const/4 v2, 0x0
/* if-eq v0, v1, :cond_5 */
/* iget v3, p0, Le/b/a/y/z/e/m0;->f:I */
/* sub-int/2addr v3, v0 */
/* iget v4, p0, Le/b/a/y/z/e/m0;->d:I */
/* if-lt v3, v4, :cond_0 */
} // :cond_0
/* if-nez v0, :cond_2 */
/* .line 2 */
/* array-length v0, p2 */
/* if-le v4, v0, :cond_2 */
/* iget v0, p0, Le/b/a/y/z/e/m0;->c:I */
/* array-length v1, p2 */
/* if-ne v0, v1, :cond_2 */
/* .line 3 */
/* array-length v0, p2 */
/* mul-int/lit8 v0, v0, 0x2 */
/* if-le v0, v4, :cond_1 */
} // :cond_1
/* move v4, v0 */
/* .line 4 */
} // :goto_0
v0 = this.g;
/* const-class v1, [B */
/* check-cast v0, [B */
/* .line 5 */
/* array-length v1, p2 */
java.lang.System .arraycopy ( p2,v2,v0,v2,v1 );
/* .line 6 */
this.b = v0;
/* .line 7 */
v1 = this.g;
/* move-object p2, v0 */
/* .line 8 */
} // :cond_2
/* iget v0, p0, Le/b/a/y/z/e/m0;->e:I */
/* if-lez v0, :cond_3 */
/* .line 9 */
/* array-length v1, p2 */
/* sub-int/2addr v1, v0 */
java.lang.System .arraycopy ( p2,v0,p2,v2,v1 );
/* .line 10 */
} // :cond_3
} // :goto_1
/* iget v0, p0, Le/b/a/y/z/e/m0;->f:I */
/* iget v1, p0, Le/b/a/y/z/e/m0;->e:I */
/* sub-int/2addr v0, v1 */
/* iput v0, p0, Le/b/a/y/z/e/m0;->f:I */
/* .line 11 */
/* iput v2, p0, Le/b/a/y/z/e/m0;->e:I */
/* iput v2, p0, Le/b/a/y/z/e/m0;->c:I */
/* .line 12 */
/* array-length v1, p2 */
/* sub-int/2addr v1, v0 */
p1 = (( java.io.InputStream ) p1 ).read ( p2, v0, v1 ); // invoke-virtual {p1, p2, v0, v1}, Ljava/io/InputStream;->read([BII)I
/* .line 13 */
/* iget p2, p0, Le/b/a/y/z/e/m0;->f:I */
/* if-gtz p1, :cond_4 */
} // :cond_4
/* add-int/2addr p2, p1 */
} // :goto_2
/* iput p2, p0, Le/b/a/y/z/e/m0;->c:I */
/* .line 14 */
} // :cond_5
} // :goto_3
p1 = (( java.io.InputStream ) p1 ).read ( p2 ); // invoke-virtual {p1, p2}, Ljava/io/InputStream;->read([B)I
/* if-lez p1, :cond_6 */
/* .line 15 */
/* iput v1, p0, Le/b/a/y/z/e/m0;->e:I */
/* .line 16 */
/* iput v2, p0, Le/b/a/y/z/e/m0;->f:I */
/* .line 17 */
/* iput p1, p0, Le/b/a/y/z/e/m0;->c:I */
} // :cond_6
} // .end method
public synchronized Integer available ( ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* monitor-enter p0 */
/* .line 1 */
try { // :try_start_0
v0 = this.in;
/* .line 2 */
v1 = this.b;
if ( v1 != null) { // if-eqz v1, :cond_0
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
/* iget v1, p0, Le/b/a/y/z/e/m0;->c:I */
/* iget v2, p0, Le/b/a/y/z/e/m0;->f:I */
/* sub-int/2addr v1, v2 */
v0 = (( java.io.InputStream ) v0 ).available ( ); // invoke-virtual {v0}, Ljava/io/InputStream;->available()I
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* add-int/2addr v1, v0 */
/* monitor-exit p0 */
/* .line 4 */
} // :cond_0
try { // :try_start_1
e.b.a.y.z.e.m0 .m ( );
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
int v0 = 0; // const/4 v0, 0x0
/* throw v0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
public synchronized void c ( ) {
/* .locals 1 */
/* monitor-enter p0 */
/* .line 1 */
try { // :try_start_0
v0 = this.b;
/* array-length v0, v0 */
/* iput v0, p0, Le/b/a/y/z/e/m0;->d:I */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 2 */
/* monitor-exit p0 */
return;
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
public void close ( ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.b;
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
v0 = this.g;
v2 = this.b;
/* .line 3 */
this.b = v1;
/* .line 4 */
} // :cond_0
v0 = this.in;
/* .line 5 */
this.in = v1;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 6 */
(( java.io.InputStream ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/io/InputStream;->close()V
} // :cond_1
return;
} // .end method
public synchronized void l ( ) {
/* .locals 2 */
/* monitor-enter p0 */
/* .line 1 */
try { // :try_start_0
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
v0 = this.g;
v1 = this.b;
int v0 = 0; // const/4 v0, 0x0
/* .line 3 */
this.b = v0;
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 4 */
} // :cond_0
/* monitor-exit p0 */
return;
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
public synchronized void mark ( Integer p0 ) {
/* .locals 1 */
/* monitor-enter p0 */
/* .line 1 */
try { // :try_start_0
/* iget v0, p0, Le/b/a/y/z/e/m0;->d:I */
p1 = java.lang.Math .max ( v0,p1 );
/* iput p1, p0, Le/b/a/y/z/e/m0;->d:I */
/* .line 2 */
/* iget p1, p0, Le/b/a/y/z/e/m0;->f:I */
/* iput p1, p0, Le/b/a/y/z/e/m0;->e:I */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 3 */
/* monitor-exit p0 */
return;
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit p0 */
/* throw p1 */
} // .end method
public Boolean markSupported ( ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
} // .end method
public synchronized Integer read ( ) {
/* .locals 6 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* monitor-enter p0 */
/* .line 1 */
try { // :try_start_0
v0 = this.b;
/* .line 2 */
v1 = this.in;
int v2 = 0; // const/4 v2, 0x0
if ( v0 != null) { // if-eqz v0, :cond_4
if ( v1 != null) { // if-eqz v1, :cond_4
/* .line 3 */
/* iget v3, p0, Le/b/a/y/z/e/m0;->f:I */
/* iget v4, p0, Le/b/a/y/z/e/m0;->c:I */
int v5 = -1; // const/4 v5, -0x1
/* if-lt v3, v4, :cond_0 */
v1 = (( e.b.a.y.z.e.m0 ) p0 ).a ( v1, v0 ); // invoke-virtual {p0, v1, v0}, Le/b/a/y/z/e/m0;->a(Ljava/io/InputStream;[B)I
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* if-ne v1, v5, :cond_0 */
/* .line 4 */
/* monitor-exit p0 */
/* .line 5 */
} // :cond_0
try { // :try_start_1
v1 = this.b;
/* if-eq v0, v1, :cond_2 */
/* .line 6 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 7 */
} // :cond_1
e.b.a.y.z.e.m0 .m ( );
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* throw v2 */
/* .line 8 */
} // :cond_2
} // :goto_0
try { // :try_start_2
/* iget v1, p0, Le/b/a/y/z/e/m0;->c:I */
/* iget v2, p0, Le/b/a/y/z/e/m0;->f:I */
/* sub-int/2addr v1, v2 */
/* if-lez v1, :cond_3 */
/* .line 9 */
/* iget v1, p0, Le/b/a/y/z/e/m0;->f:I */
/* add-int/lit8 v2, v1, 0x1 */
/* iput v2, p0, Le/b/a/y/z/e/m0;->f:I */
/* aget-byte v0, v0, v1 */
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
/* and-int/lit16 v0, v0, 0xff */
/* monitor-exit p0 */
/* .line 10 */
} // :cond_3
/* monitor-exit p0 */
/* .line 11 */
} // :cond_4
try { // :try_start_3
e.b.a.y.z.e.m0 .m ( );
/* :try_end_3 */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_0 */
/* throw v2 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
public synchronized Integer read ( Object[] p0, Integer p1, Integer p2 ) {
/* .locals 6 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* monitor-enter p0 */
/* .line 12 */
try { // :try_start_0
v0 = this.b;
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_10
/* if-nez p3, :cond_0 */
int p1 = 0; // const/4 p1, 0x0
/* .line 13 */
/* monitor-exit p0 */
/* .line 14 */
} // :cond_0
try { // :try_start_1
v2 = this.in;
if ( v2 != null) { // if-eqz v2, :cond_f
/* .line 15 */
/* iget v3, p0, Le/b/a/y/z/e/m0;->f:I */
/* iget v4, p0, Le/b/a/y/z/e/m0;->c:I */
/* if-ge v3, v4, :cond_4 */
/* .line 16 */
/* iget v3, p0, Le/b/a/y/z/e/m0;->c:I */
/* iget v4, p0, Le/b/a/y/z/e/m0;->f:I */
/* sub-int/2addr v3, v4 */
/* if-lt v3, p3, :cond_1 */
/* move v3, p3 */
} // :cond_1
/* iget v3, p0, Le/b/a/y/z/e/m0;->c:I */
/* iget v4, p0, Le/b/a/y/z/e/m0;->f:I */
/* sub-int/2addr v3, v4 */
/* .line 17 */
} // :goto_0
/* iget v4, p0, Le/b/a/y/z/e/m0;->f:I */
java.lang.System .arraycopy ( v0,v4,p1,p2,v3 );
/* .line 18 */
/* iget v4, p0, Le/b/a/y/z/e/m0;->f:I */
/* add-int/2addr v4, v3 */
/* iput v4, p0, Le/b/a/y/z/e/m0;->f:I */
/* if-eq v3, p3, :cond_3 */
/* .line 19 */
v4 = (( java.io.InputStream ) v2 ).available ( ); // invoke-virtual {v2}, Ljava/io/InputStream;->available()I
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* if-nez v4, :cond_2 */
} // :cond_2
/* add-int/2addr p2, v3 */
/* sub-int v3, p3, v3 */
/* .line 20 */
} // :cond_3
} // :goto_1
/* monitor-exit p0 */
} // :cond_4
/* move v3, p3 */
/* .line 21 */
} // :goto_2
try { // :try_start_2
/* iget v4, p0, Le/b/a/y/z/e/m0;->e:I */
int v5 = -1; // const/4 v5, -0x1
/* if-ne v4, v5, :cond_6 */
/* array-length v4, v0 */
/* if-lt v3, v4, :cond_6 */
/* .line 22 */
v4 = (( java.io.InputStream ) v2 ).read ( p1, p2, v3 ); // invoke-virtual {v2, p1, p2, v3}, Ljava/io/InputStream;->read([BII)I
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
/* if-ne v4, v5, :cond_c */
/* if-ne v3, p3, :cond_5 */
} // :cond_5
/* sub-int v5, p3, v3 */
/* .line 23 */
} // :goto_3
/* monitor-exit p0 */
/* .line 24 */
} // :cond_6
try { // :try_start_3
v4 = (( e.b.a.y.z.e.m0 ) p0 ).a ( v2, v0 ); // invoke-virtual {p0, v2, v0}, Le/b/a/y/z/e/m0;->a(Ljava/io/InputStream;[B)I
/* :try_end_3 */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_0 */
/* if-ne v4, v5, :cond_8 */
/* if-ne v3, p3, :cond_7 */
} // :cond_7
/* sub-int v5, p3, v3 */
/* .line 25 */
} // :goto_4
/* monitor-exit p0 */
/* .line 26 */
} // :cond_8
try { // :try_start_4
v4 = this.b;
/* if-eq v0, v4, :cond_a */
/* .line 27 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_9
/* .line 28 */
} // :cond_9
e.b.a.y.z.e.m0 .m ( );
/* :try_end_4 */
/* .catchall {:try_start_4 ..:try_end_4} :catchall_0 */
/* throw v1 */
/* .line 29 */
} // :cond_a
} // :goto_5
try { // :try_start_5
/* iget v4, p0, Le/b/a/y/z/e/m0;->c:I */
/* iget v5, p0, Le/b/a/y/z/e/m0;->f:I */
/* sub-int/2addr v4, v5 */
/* if-lt v4, v3, :cond_b */
/* move v4, v3 */
} // :cond_b
/* iget v4, p0, Le/b/a/y/z/e/m0;->c:I */
/* iget v5, p0, Le/b/a/y/z/e/m0;->f:I */
/* sub-int/2addr v4, v5 */
/* .line 30 */
} // :goto_6
/* iget v5, p0, Le/b/a/y/z/e/m0;->f:I */
java.lang.System .arraycopy ( v0,v5,p1,p2,v4 );
/* .line 31 */
/* iget v5, p0, Le/b/a/y/z/e/m0;->f:I */
/* add-int/2addr v5, v4 */
/* iput v5, p0, Le/b/a/y/z/e/m0;->f:I */
/* :try_end_5 */
/* .catchall {:try_start_5 ..:try_end_5} :catchall_0 */
} // :cond_c
/* sub-int/2addr v3, v4 */
/* if-nez v3, :cond_d */
/* .line 32 */
/* monitor-exit p0 */
/* .line 33 */
} // :cond_d
try { // :try_start_6
v5 = (( java.io.InputStream ) v2 ).available ( ); // invoke-virtual {v2}, Ljava/io/InputStream;->available()I
/* :try_end_6 */
/* .catchall {:try_start_6 ..:try_end_6} :catchall_0 */
/* if-nez v5, :cond_e */
/* sub-int/2addr p3, v3 */
/* .line 34 */
/* monitor-exit p0 */
} // :cond_e
/* add-int/2addr p2, v4 */
/* .line 35 */
} // :cond_f
try { // :try_start_7
e.b.a.y.z.e.m0 .m ( );
/* :try_end_7 */
/* .catchall {:try_start_7 ..:try_end_7} :catchall_0 */
/* throw v1 */
/* .line 36 */
} // :cond_10
try { // :try_start_8
e.b.a.y.z.e.m0 .m ( );
/* :try_end_8 */
/* .catchall {:try_start_8 ..:try_end_8} :catchall_0 */
/* throw v1 */
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit p0 */
/* throw p1 */
} // .end method
public synchronized void reset ( ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* monitor-enter p0 */
/* .line 1 */
try { // :try_start_0
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_1
int v0 = -1; // const/4 v0, -0x1
/* .line 2 */
/* iget v1, p0, Le/b/a/y/z/e/m0;->e:I */
/* if-eq v0, v1, :cond_0 */
/* .line 3 */
/* iget v0, p0, Le/b/a/y/z/e/m0;->e:I */
/* iput v0, p0, Le/b/a/y/z/e/m0;->f:I */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 4 */
/* monitor-exit p0 */
return;
/* .line 5 */
} // :cond_0
try { // :try_start_1
/* new-instance v0, Le/b/a/y/z/e/l0; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Mark has been invalidated, pos: "; // const-string v2, "Mark has been invalidated, pos: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v2, p0, Le/b/a/y/z/e/m0;->f:I */
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v2 = " markLimit: "; // const-string v2, " markLimit: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v2, p0, Le/b/a/y/z/e/m0;->d:I */
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Le/b/a/y/z/e/l0;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* .line 6 */
} // :cond_1
/* new-instance v0, Ljava/io/IOException; */
final String v1 = "Stream is closed"; // const-string v1, "Stream is closed"
/* invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
public synchronized Long skip ( Long p0 ) {
/* .locals 10 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* monitor-enter p0 */
/* const-wide/16 v0, 0x1 */
/* const-wide/16 v2, 0x0 */
/* cmp-long v4, p1, v0 */
/* if-gez v4, :cond_0 */
/* .line 1 */
/* monitor-exit p0 */
/* return-wide v2 */
/* .line 2 */
} // :cond_0
try { // :try_start_0
v0 = this.b;
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_7
/* .line 3 */
v4 = this.in;
if ( v4 != null) { // if-eqz v4, :cond_6
/* .line 4 */
/* iget v1, p0, Le/b/a/y/z/e/m0;->c:I */
/* iget v5, p0, Le/b/a/y/z/e/m0;->f:I */
/* sub-int/2addr v1, v5 */
/* int-to-long v5, v1 */
/* cmp-long v1, v5, p1 */
/* if-ltz v1, :cond_1 */
/* .line 5 */
/* iget v0, p0, Le/b/a/y/z/e/m0;->f:I */
/* int-to-long v0, v0 */
/* add-long/2addr v0, p1 */
/* long-to-int v1, v0 */
/* iput v1, p0, Le/b/a/y/z/e/m0;->f:I */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 6 */
/* monitor-exit p0 */
/* return-wide p1 */
/* .line 7 */
} // :cond_1
try { // :try_start_1
/* iget v1, p0, Le/b/a/y/z/e/m0;->c:I */
/* int-to-long v5, v1 */
/* iget v1, p0, Le/b/a/y/z/e/m0;->f:I */
/* int-to-long v7, v1 */
/* sub-long/2addr v5, v7 */
/* .line 8 */
/* iget v1, p0, Le/b/a/y/z/e/m0;->c:I */
/* iput v1, p0, Le/b/a/y/z/e/m0;->f:I */
/* .line 9 */
/* iget v1, p0, Le/b/a/y/z/e/m0;->e:I */
int v7 = -1; // const/4 v7, -0x1
/* if-eq v1, v7, :cond_4 */
/* iget v1, p0, Le/b/a/y/z/e/m0;->d:I */
/* int-to-long v8, v1 */
/* cmp-long v1, p1, v8 */
/* if-gtz v1, :cond_4 */
/* .line 10 */
v0 = (( e.b.a.y.z.e.m0 ) p0 ).a ( v4, v0 ); // invoke-virtual {p0, v4, v0}, Le/b/a/y/z/e/m0;->a(Ljava/io/InputStream;[B)I
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* if-ne v0, v7, :cond_2 */
/* .line 11 */
/* monitor-exit p0 */
/* return-wide v5 */
/* .line 12 */
} // :cond_2
try { // :try_start_2
/* iget v0, p0, Le/b/a/y/z/e/m0;->c:I */
/* iget v1, p0, Le/b/a/y/z/e/m0;->f:I */
/* sub-int/2addr v0, v1 */
/* int-to-long v0, v0 */
/* sub-long v2, p1, v5 */
/* cmp-long v4, v0, v2 */
/* if-ltz v4, :cond_3 */
/* .line 13 */
/* iget v0, p0, Le/b/a/y/z/e/m0;->f:I */
/* int-to-long v0, v0 */
/* add-long/2addr v0, p1 */
/* sub-long/2addr v0, v5 */
/* long-to-int v1, v0 */
/* iput v1, p0, Le/b/a/y/z/e/m0;->f:I */
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
/* .line 14 */
/* monitor-exit p0 */
/* return-wide p1 */
/* .line 15 */
} // :cond_3
try { // :try_start_3
/* iget p1, p0, Le/b/a/y/z/e/m0;->c:I */
/* int-to-long p1, p1 */
/* add-long/2addr v5, p1 */
/* iget p1, p0, Le/b/a/y/z/e/m0;->f:I */
/* int-to-long p1, p1 */
/* sub-long/2addr v5, p1 */
/* .line 16 */
/* iget p1, p0, Le/b/a/y/z/e/m0;->c:I */
/* iput p1, p0, Le/b/a/y/z/e/m0;->f:I */
/* :try_end_3 */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_0 */
/* .line 17 */
/* monitor-exit p0 */
/* return-wide v5 */
} // :cond_4
/* sub-long/2addr p1, v5 */
/* .line 18 */
try { // :try_start_4
(( java.io.InputStream ) v4 ).skip ( p1, p2 ); // invoke-virtual {v4, p1, p2}, Ljava/io/InputStream;->skip(J)J
/* move-result-wide p1 */
/* cmp-long v0, p1, v2 */
/* if-lez v0, :cond_5 */
/* .line 19 */
/* iput v7, p0, Le/b/a/y/z/e/m0;->e:I */
/* :try_end_4 */
/* .catchall {:try_start_4 ..:try_end_4} :catchall_0 */
} // :cond_5
/* add-long/2addr v5, p1 */
/* .line 20 */
/* monitor-exit p0 */
/* return-wide v5 */
/* .line 21 */
} // :cond_6
try { // :try_start_5
e.b.a.y.z.e.m0 .m ( );
/* :try_end_5 */
/* .catchall {:try_start_5 ..:try_end_5} :catchall_0 */
/* throw v1 */
/* .line 22 */
} // :cond_7
try { // :try_start_6
e.b.a.y.z.e.m0 .m ( );
/* :try_end_6 */
/* .catchall {:try_start_6 ..:try_end_6} :catchall_0 */
/* throw v1 */
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit p0 */
/* throw p1 */
} // .end method
