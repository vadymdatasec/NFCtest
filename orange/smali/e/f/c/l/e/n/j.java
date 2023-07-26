public class e.f.c.l.e.n.j implements java.io.Closeable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # static fields */
	 public static final java.util.logging.Logger h;
	 /* # instance fields */
	 public final java.io.RandomAccessFile b;
	 public Integer c;
	 public Integer d;
	 public e.f.c.l.e.n.g e;
	 public e.f.c.l.e.n.g f;
	 public final g;
	 /* # direct methods */
	 public static e.f.c.l.e.n.j ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* const-class v0, Le/f/c/l/e/n/j; */
		 (( java.lang.Class ) v0 ).getName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;
		 java.util.logging.Logger .getLogger ( v0 );
		 return;
	 } // .end method
	 public e.f.c.l.e.n.j ( ) {
		 /* .locals 1 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Ljava/io/IOException; */
		 /* } */
	 } // .end annotation
	 /* .line 1 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* const/16 v0, 0x10 */
	 /* new-array v0, v0, [B */
	 /* .line 2 */
	 this.g = v0;
	 /* .line 3 */
	 v0 = 	 (( java.io.File ) p1 ).exists ( ); // invoke-virtual {p1}, Ljava/io/File;->exists()Z
	 /* if-nez v0, :cond_0 */
	 /* .line 4 */
	 e.f.c.l.e.n.j .a ( p1 );
	 /* .line 5 */
} // :cond_0
e.f.c.l.e.n.j .b ( p1 );
this.b = p1;
/* .line 6 */
(( e.f.c.l.e.n.j ) p0 ).c ( ); // invoke-virtual {p0}, Le/f/c/l/e/n/j;->c()V
return;
} // .end method
public static Integer a ( Object p0, Integer p1 ) { //synthethic
/* .locals 0 */
/* .line 1 */
p0 = (( e.f.c.l.e.n.j ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Le/f/c/l/e/n/j;->b(I)I
} // .end method
public static Integer a ( Object[] p0, Integer p1 ) {
/* .locals 2 */
/* .line 11 */
/* aget-byte v0, p0, p1 */
/* and-int/lit16 v0, v0, 0xff */
/* shl-int/lit8 v0, v0, 0x18 */
/* add-int/lit8 v1, p1, 0x1 */
/* aget-byte v1, p0, v1 */
/* and-int/lit16 v1, v1, 0xff */
/* shl-int/lit8 v1, v1, 0x10 */
/* add-int/2addr v0, v1 */
/* add-int/lit8 v1, p1, 0x2 */
/* aget-byte v1, p0, v1 */
/* and-int/lit16 v1, v1, 0xff */
/* shl-int/lit8 v1, v1, 0x8 */
/* add-int/2addr v0, v1 */
/* add-int/lit8 p1, p1, 0x3 */
/* aget-byte p0, p0, p1 */
/* and-int/lit16 p0, p0, 0xff */
/* add-int/2addr v0, p0 */
} // .end method
public static java.io.RandomAccessFile a ( Object p0 ) { //synthethic
/* .locals 0 */
/* .line 4 */
p0 = this.b;
} // .end method
public static java.lang.Object a ( java.lang.Object p0, java.lang.String p1 ) { //synthethic
/* .locals 0 */
/* .line 2 */
e.f.c.l.e.n.j .b ( p0,p1 );
} // .end method
public static void a ( Object p0, Integer p1, Object[] p2, Integer p3, Integer p4 ) { //synthethic
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 3 */
(( e.f.c.l.e.n.j ) p0 ).a ( p1, p2, p3, p4 ); // invoke-virtual {p0, p1, p2, p3, p4}, Le/f/c/l/e/n/j;->a(I[BII)V
return;
} // .end method
public static void a ( java.io.File p0 ) {
/* .locals 6 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 15 */
/* new-instance v0, Ljava/io/File; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
(( java.io.File ) p0 ).getPath ( ); // invoke-virtual {p0}, Ljava/io/File;->getPath()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = ".tmp"; // const-string v2, ".tmp"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
/* .line 16 */
e.f.c.l.e.n.j .b ( v0 );
/* const-wide/16 v2, 0x1000 */
/* .line 17 */
try { // :try_start_0
(( java.io.RandomAccessFile ) v1 ).setLength ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/io/RandomAccessFile;->setLength(J)V
/* const-wide/16 v2, 0x0 */
/* .line 18 */
(( java.io.RandomAccessFile ) v1 ).seek ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/io/RandomAccessFile;->seek(J)V
/* const/16 v2, 0x10 */
/* new-array v2, v2, [B */
int v3 = 4; // const/4 v3, 0x4
/* new-array v3, v3, [I */
/* const/16 v4, 0x1000 */
int v5 = 0; // const/4 v5, 0x0
/* aput v4, v3, v5 */
int v4 = 1; // const/4 v4, 0x1
/* aput v5, v3, v4 */
int v4 = 2; // const/4 v4, 0x2
/* aput v5, v3, v4 */
int v4 = 3; // const/4 v4, 0x3
/* aput v5, v3, v4 */
/* .line 19 */
e.f.c.l.e.n.j .a ( v2,v3 );
/* .line 20 */
(( java.io.RandomAccessFile ) v1 ).write ( v2 ); // invoke-virtual {v1, v2}, Ljava/io/RandomAccessFile;->write([B)V
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 21 */
(( java.io.RandomAccessFile ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/io/RandomAccessFile;->close()V
/* .line 22 */
p0 = (( java.io.File ) v0 ).renameTo ( p0 ); // invoke-virtual {v0, p0}, Ljava/io/File;->renameTo(Ljava/io/File;)Z
if ( p0 != null) { // if-eqz p0, :cond_0
return;
/* .line 23 */
} // :cond_0
/* new-instance p0, Ljava/io/IOException; */
final String v0 = "Rename failed!"; // const-string v0, "Rename failed!"
/* invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
/* :catchall_0 */
/* move-exception p0 */
/* .line 24 */
(( java.io.RandomAccessFile ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/io/RandomAccessFile;->close()V
/* .line 25 */
/* throw p0 */
} // .end method
public static void a ( Object[] p0, Integer p1, Integer p2 ) {
/* .locals 2 */
/* shr-int/lit8 v0, p2, 0x18 */
/* int-to-byte v0, v0 */
/* .line 5 */
/* aput-byte v0, p0, p1 */
/* add-int/lit8 v0, p1, 0x1 */
/* shr-int/lit8 v1, p2, 0x10 */
/* int-to-byte v1, v1 */
/* .line 6 */
/* aput-byte v1, p0, v0 */
/* add-int/lit8 v0, p1, 0x2 */
/* shr-int/lit8 v1, p2, 0x8 */
/* int-to-byte v1, v1 */
/* .line 7 */
/* aput-byte v1, p0, v0 */
/* add-int/lit8 p1, p1, 0x3 */
/* int-to-byte p2, p2 */
/* .line 8 */
/* aput-byte p2, p0, p1 */
return;
} // .end method
public static void a ( Object[] p0, Integer...p1 ) {
/* .locals 4 */
/* .line 9 */
/* array-length v0, p1 */
int v1 = 0; // const/4 v1, 0x0
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v1, v0, :cond_0 */
/* aget v3, p1, v1 */
/* .line 10 */
e.f.c.l.e.n.j .a ( p0,v2,v3 );
/* add-int/lit8 v2, v2, 0x4 */
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_0
return;
} // .end method
public static java.io.RandomAccessFile b ( java.io.File p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/FileNotFoundException; */
/* } */
} // .end annotation
/* .line 1 */
/* new-instance v0, Ljava/io/RandomAccessFile; */
final String v1 = "rwd"; // const-string v1, "rwd"
/* invoke-direct {v0, p0, v1}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V */
} // .end method
public static java.lang.Object b ( java.lang.Object p0, java.lang.String p1 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<T:", */
/* "Ljava/lang/Object;", */
/* ">(TT;", */
/* "Ljava/lang/String;", */
/* ")TT;" */
/* } */
} // .end annotation
if ( p0 != null) { // if-eqz p0, :cond_0
/* .line 3 */
} // :cond_0
/* new-instance p0, Ljava/lang/NullPointerException; */
/* invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
} // .end method
/* # virtual methods */
public final e.f.c.l.e.n.g a ( Integer p0 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* if-nez p1, :cond_0 */
/* .line 12 */
p1 = e.f.c.l.e.n.g.c;
/* .line 13 */
} // :cond_0
v0 = this.b;
/* int-to-long v1, p1 */
(( java.io.RandomAccessFile ) v0 ).seek ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/io/RandomAccessFile;->seek(J)V
/* .line 14 */
/* new-instance v0, Le/f/c/l/e/n/g; */
v1 = this.b;
v1 = (( java.io.RandomAccessFile ) v1 ).readInt ( ); // invoke-virtual {v1}, Ljava/io/RandomAccessFile;->readInt()I
/* invoke-direct {v0, p1, v1}, Le/f/c/l/e/n/g;-><init>(II)V */
} // .end method
public final void a ( Integer p0, Object[] p1, Integer p2, Integer p3 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 26 */
p1 = (( e.f.c.l.e.n.j ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Le/f/c/l/e/n/j;->b(I)I
/* add-int v0, p1, p4 */
/* .line 27 */
/* iget v1, p0, Le/f/c/l/e/n/j;->c:I */
/* if-gt v0, v1, :cond_0 */
/* .line 28 */
v0 = this.b;
/* int-to-long v1, p1 */
(( java.io.RandomAccessFile ) v0 ).seek ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/io/RandomAccessFile;->seek(J)V
/* .line 29 */
p1 = this.b;
(( java.io.RandomAccessFile ) p1 ).readFully ( p2, p3, p4 ); // invoke-virtual {p1, p2, p3, p4}, Ljava/io/RandomAccessFile;->readFully([BII)V
} // :cond_0
/* sub-int/2addr v1, p1 */
/* .line 30 */
v0 = this.b;
/* int-to-long v2, p1 */
(( java.io.RandomAccessFile ) v0 ).seek ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Ljava/io/RandomAccessFile;->seek(J)V
/* .line 31 */
p1 = this.b;
(( java.io.RandomAccessFile ) p1 ).readFully ( p2, p3, v1 ); // invoke-virtual {p1, p2, p3, v1}, Ljava/io/RandomAccessFile;->readFully([BII)V
/* .line 32 */
p1 = this.b;
/* const-wide/16 v2, 0x10 */
(( java.io.RandomAccessFile ) p1 ).seek ( v2, v3 ); // invoke-virtual {p1, v2, v3}, Ljava/io/RandomAccessFile;->seek(J)V
/* .line 33 */
p1 = this.b;
/* add-int/2addr p3, v1 */
/* sub-int/2addr p4, v1 */
(( java.io.RandomAccessFile ) p1 ).readFully ( p2, p3, p4 ); // invoke-virtual {p1, p2, p3, p4}, Ljava/io/RandomAccessFile;->readFully([BII)V
} // :goto_0
return;
} // .end method
public synchronized void a ( Object p0 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* monitor-enter p0 */
/* .line 34 */
try { // :try_start_0
v0 = this.e;
/* iget v0, v0, Le/f/c/l/e/n/g;->a:I */
int v1 = 0; // const/4 v1, 0x0
/* .line 35 */
} // :goto_0
/* iget v2, p0, Le/f/c/l/e/n/j;->d:I */
/* if-ge v1, v2, :cond_0 */
/* .line 36 */
(( e.f.c.l.e.n.j ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/f/c/l/e/n/j;->a(I)Le/f/c/l/e/n/g;
/* .line 37 */
/* new-instance v2, Le/f/c/l/e/n/h; */
int v3 = 0; // const/4 v3, 0x0
/* invoke-direct {v2, p0, v0, v3}, Le/f/c/l/e/n/h;-><init>(Le/f/c/l/e/n/j;Le/f/c/l/e/n/g;Le/f/c/l/e/n/f;)V */
/* iget v3, v0, Le/f/c/l/e/n/g;->b:I */
/* .line 38 */
/* iget v2, v0, Le/f/c/l/e/n/g;->a:I */
/* add-int/lit8 v2, v2, 0x4 */
/* iget v0, v0, Le/f/c/l/e/n/g;->b:I */
/* add-int/2addr v2, v0 */
v0 = (( e.f.c.l.e.n.j ) p0 ).b ( v2 ); // invoke-virtual {p0, v2}, Le/f/c/l/e/n/j;->b(I)I
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* add-int/lit8 v1, v1, 0x1 */
/* .line 39 */
} // :cond_0
/* monitor-exit p0 */
return;
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit p0 */
/* throw p1 */
} // .end method
public final Integer b ( Integer p0 ) {
/* .locals 1 */
/* .line 2 */
/* iget v0, p0, Le/f/c/l/e/n/j;->c:I */
/* if-ge p1, v0, :cond_0 */
} // :cond_0
/* add-int/lit8 p1, p1, 0x10 */
/* sub-int/2addr p1, v0 */
} // :goto_0
} // .end method
public final void c ( ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.b;
/* const-wide/16 v1, 0x0 */
(( java.io.RandomAccessFile ) v0 ).seek ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/io/RandomAccessFile;->seek(J)V
/* .line 2 */
v0 = this.b;
v1 = this.g;
(( java.io.RandomAccessFile ) v0 ).readFully ( v1 ); // invoke-virtual {v0, v1}, Ljava/io/RandomAccessFile;->readFully([B)V
/* .line 3 */
v0 = this.g;
int v1 = 0; // const/4 v1, 0x0
v0 = e.f.c.l.e.n.j .a ( v0,v1 );
/* iput v0, p0, Le/f/c/l/e/n/j;->c:I */
/* int-to-long v0, v0 */
/* .line 4 */
v2 = this.b;
(( java.io.RandomAccessFile ) v2 ).length ( ); // invoke-virtual {v2}, Ljava/io/RandomAccessFile;->length()J
/* move-result-wide v2 */
/* cmp-long v4, v0, v2 */
/* if-gtz v4, :cond_0 */
/* .line 5 */
v0 = this.g;
int v1 = 4; // const/4 v1, 0x4
v0 = e.f.c.l.e.n.j .a ( v0,v1 );
/* iput v0, p0, Le/f/c/l/e/n/j;->d:I */
/* .line 6 */
v0 = this.g;
/* const/16 v1, 0x8 */
v0 = e.f.c.l.e.n.j .a ( v0,v1 );
/* .line 7 */
v1 = this.g;
/* const/16 v2, 0xc */
v1 = e.f.c.l.e.n.j .a ( v1,v2 );
/* .line 8 */
(( e.f.c.l.e.n.j ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/f/c/l/e/n/j;->a(I)Le/f/c/l/e/n/g;
this.e = v0;
/* .line 9 */
(( e.f.c.l.e.n.j ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Le/f/c/l/e/n/j;->a(I)Le/f/c/l/e/n/g;
this.f = v0;
return;
/* .line 10 */
} // :cond_0
/* new-instance v0, Ljava/io/IOException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "File is truncated.Expected length: "; // const-string v2, "File is truncated.Expected length: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v2, p0, Le/f/c/l/e/n/j;->c:I */
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v2 = ", Actual length: "; // const-string v2, ", Actual length: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.b;
/* .line 11 */
(( java.io.RandomAccessFile ) v2 ).length ( ); // invoke-virtual {v2}, Ljava/io/RandomAccessFile;->length()J
/* move-result-wide v2 */
(( java.lang.StringBuilder ) v1 ).append ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public synchronized void close ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* monitor-enter p0 */
/* .line 1 */
try { // :try_start_0
v0 = this.b;
(( java.io.RandomAccessFile ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/io/RandomAccessFile;->close()V
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
public Integer l ( ) {
/* .locals 4 */
/* .line 1 */
/* iget v0, p0, Le/f/c/l/e/n/j;->d:I */
/* const/16 v1, 0x10 */
/* if-nez v0, :cond_0 */
/* .line 2 */
} // :cond_0
v0 = this.f;
/* iget v2, v0, Le/f/c/l/e/n/g;->a:I */
v3 = this.e;
/* iget v3, v3, Le/f/c/l/e/n/g;->a:I */
/* if-lt v2, v3, :cond_1 */
/* sub-int/2addr v2, v3 */
/* add-int/lit8 v2, v2, 0x4 */
/* .line 3 */
/* iget v0, v0, Le/f/c/l/e/n/g;->b:I */
/* add-int/2addr v2, v0 */
/* add-int/2addr v2, v1 */
} // :cond_1
/* add-int/lit8 v2, v2, 0x4 */
/* .line 4 */
/* iget v0, v0, Le/f/c/l/e/n/g;->b:I */
/* add-int/2addr v2, v0 */
/* iget v0, p0, Le/f/c/l/e/n/j;->c:I */
/* add-int/2addr v2, v0 */
/* sub-int/2addr v2, v3 */
} // .end method
public java.lang.String toString ( ) {
/* .locals 5 */
/* .line 1 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
/* .line 2 */
/* const-class v1, Le/f/c/l/e/n/j; */
(( java.lang.Class ) v1 ).getSimpleName ( ); // invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* const/16 v1, 0x5b */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
final String v1 = "fileLength="; // const-string v1, "fileLength="
/* .line 3 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v1, p0, Le/f/c/l/e/n/j;->c:I */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = ", size="; // const-string v1, ", size="
/* .line 4 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v1, p0, Le/f/c/l/e/n/j;->d:I */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = ", first="; // const-string v1, ", first="
/* .line 5 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.e;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v1 = ", last="; // const-string v1, ", last="
/* .line 6 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.f;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v1 = ", element lengths=["; // const-string v1, ", element lengths=["
/* .line 7 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 8 */
try { // :try_start_0
/* new-instance v1, Le/f/c/l/e/n/f; */
/* invoke-direct {v1, p0, v0}, Le/f/c/l/e/n/f;-><init>(Le/f/c/l/e/n/j;Ljava/lang/StringBuilder;)V */
(( e.f.c.l.e.n.j ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Le/f/c/l/e/n/j;->a(Le/f/c/l/e/n/i;)V
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v1 */
/* .line 9 */
v2 = e.f.c.l.e.n.j.h;
v3 = java.util.logging.Level.WARNING;
final String v4 = "read error"; // const-string v4, "read error"
(( java.util.logging.Logger ) v2 ).log ( v3, v4, v1 ); // invoke-virtual {v2, v3, v4, v1}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
} // :goto_0
final String v1 = "]]"; // const-string v1, "]]"
/* .line 10 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 11 */
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
