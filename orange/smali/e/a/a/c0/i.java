public class e.a.a.c0.i implements e.a.a.b {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final java.util.Map a;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/Map<", */
	 /* "Ljava/lang/String;", */
	 /* "Le/a/a/c0/f;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
public Long b;
public final e.a.a.c0.h c;
public final Integer d;
/* # direct methods */
public e.a.a.c0.i ( ) {
/* .locals 1 */
/* const/high16 v0, 0x500000 */
/* .line 6 */
/* invoke-direct {p0, p1, v0}, Le/a/a/c0/i;-><init>(Ljava/io/File;I)V */
return;
} // .end method
public e.a.a.c0.i ( ) {
/* .locals 4 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
/* new-instance v0, Ljava/util/LinkedHashMap; */
/* const/16 v1, 0x10 */
/* const/high16 v2, 0x3f400000 # 0.75f */
int v3 = 1; // const/4 v3, 0x1
/* invoke-direct {v0, v1, v2, v3}, Ljava/util/LinkedHashMap;-><init>(IFZ)V */
this.a = v0;
/* const-wide/16 v0, 0x0 */
/* .line 3 */
/* iput-wide v0, p0, Le/a/a/c0/i;->b:J */
/* .line 4 */
/* new-instance v0, Le/a/a/c0/e; */
/* invoke-direct {v0, p0, p1}, Le/a/a/c0/e;-><init>(Le/a/a/c0/i;Ljava/io/File;)V */
this.c = v0;
/* .line 5 */
/* iput p2, p0, Le/a/a/c0/i;->d:I */
return;
} // .end method
public static Integer a ( java.io.InputStream p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 70 */
p0 = (( java.io.InputStream ) p0 ).read ( ); // invoke-virtual {p0}, Ljava/io/InputStream;->read()I
int v0 = -1; // const/4 v0, -0x1
/* if-eq p0, v0, :cond_0 */
/* .line 71 */
} // :cond_0
/* new-instance p0, Ljava/io/EOFException; */
/* invoke-direct {p0}, Ljava/io/EOFException;-><init>()V */
/* throw p0 */
} // .end method
public static java.util.List a ( Object p0 ) {
/* .locals 6 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/a/a/c0/g;", */
/* ")", */
/* "Ljava/util/List<", */
/* "Le/a/a/i;", */
/* ">;" */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 92 */
v0 = e.a.a.c0.i .b ( p0 );
/* if-ltz v0, :cond_2 */
/* if-nez v0, :cond_0 */
/* .line 93 */
java.util.Collections .emptyList ( );
} // :cond_0
/* new-instance v1, Ljava/util/ArrayList; */
/* invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V */
} // :goto_0
int v2 = 0; // const/4 v2, 0x0
} // :goto_1
/* if-ge v2, v0, :cond_1 */
/* .line 94 */
e.a.a.c0.i .b ( p0 );
(( java.lang.String ) v3 ).intern ( ); // invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;
/* .line 95 */
e.a.a.c0.i .b ( p0 );
(( java.lang.String ) v4 ).intern ( ); // invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;
/* .line 96 */
/* new-instance v5, Le/a/a/i; */
/* invoke-direct {v5, v3, v4}, Le/a/a/i;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_1
/* .line 97 */
} // :cond_2
/* new-instance p0, Ljava/io/IOException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "readHeaderList size="; // const-string v2, "readHeaderList size="
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
} // .end method
public static void a ( java.io.OutputStream p0, Integer p1 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* shr-int/lit8 v0, p1, 0x0 */
/* and-int/lit16 v0, v0, 0xff */
/* .line 72 */
(( java.io.OutputStream ) p0 ).write ( v0 ); // invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V
/* shr-int/lit8 v0, p1, 0x8 */
/* and-int/lit16 v0, v0, 0xff */
/* .line 73 */
(( java.io.OutputStream ) p0 ).write ( v0 ); // invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V
/* shr-int/lit8 v0, p1, 0x10 */
/* and-int/lit16 v0, v0, 0xff */
/* .line 74 */
(( java.io.OutputStream ) p0 ).write ( v0 ); // invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V
/* shr-int/lit8 p1, p1, 0x18 */
/* and-int/lit16 p1, p1, 0xff */
/* .line 75 */
(( java.io.OutputStream ) p0 ).write ( p1 ); // invoke-virtual {p0, p1}, Ljava/io/OutputStream;->write(I)V
return;
} // .end method
public static void a ( java.io.OutputStream p0, Long p1 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
int v0 = 0; // const/4 v0, 0x0
/* ushr-long v0, p1, v0 */
/* long-to-int v1, v0 */
/* int-to-byte v0, v1 */
/* .line 76 */
(( java.io.OutputStream ) p0 ).write ( v0 ); // invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V
/* const/16 v0, 0x8 */
/* ushr-long v0, p1, v0 */
/* long-to-int v1, v0 */
/* int-to-byte v0, v1 */
/* .line 77 */
(( java.io.OutputStream ) p0 ).write ( v0 ); // invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V
/* const/16 v0, 0x10 */
/* ushr-long v0, p1, v0 */
/* long-to-int v1, v0 */
/* int-to-byte v0, v1 */
/* .line 78 */
(( java.io.OutputStream ) p0 ).write ( v0 ); // invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V
/* const/16 v0, 0x18 */
/* ushr-long v0, p1, v0 */
/* long-to-int v1, v0 */
/* int-to-byte v0, v1 */
/* .line 79 */
(( java.io.OutputStream ) p0 ).write ( v0 ); // invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V
/* const/16 v0, 0x20 */
/* ushr-long v0, p1, v0 */
/* long-to-int v1, v0 */
/* int-to-byte v0, v1 */
/* .line 80 */
(( java.io.OutputStream ) p0 ).write ( v0 ); // invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V
/* const/16 v0, 0x28 */
/* ushr-long v0, p1, v0 */
/* long-to-int v1, v0 */
/* int-to-byte v0, v1 */
/* .line 81 */
(( java.io.OutputStream ) p0 ).write ( v0 ); // invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V
/* const/16 v0, 0x30 */
/* ushr-long v0, p1, v0 */
/* long-to-int v1, v0 */
/* int-to-byte v0, v1 */
/* .line 82 */
(( java.io.OutputStream ) p0 ).write ( v0 ); // invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V
/* const/16 v0, 0x38 */
/* ushr-long/2addr p1, v0 */
/* long-to-int p2, p1 */
/* int-to-byte p1, p2 */
/* .line 83 */
(( java.io.OutputStream ) p0 ).write ( p1 ); // invoke-virtual {p0, p1}, Ljava/io/OutputStream;->write(I)V
return;
} // .end method
public static void a ( java.io.OutputStream p0, java.lang.String p1 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
final String v0 = "UTF-8"; // const-string v0, "UTF-8"
/* .line 84 */
(( java.lang.String ) p1 ).getBytes ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
/* .line 85 */
/* array-length v0, p1 */
/* int-to-long v0, v0 */
e.a.a.c0.i .a ( p0,v0,v1 );
/* .line 86 */
/* array-length v0, p1 */
int v1 = 0; // const/4 v1, 0x0
(( java.io.OutputStream ) p0 ).write ( p1, v1, v0 ); // invoke-virtual {p0, p1, v1, v0}, Ljava/io/OutputStream;->write([BII)V
return;
} // .end method
public static void a ( java.util.List p0, java.io.OutputStream p1 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/List<", */
/* "Le/a/a/i;", */
/* ">;", */
/* "Ljava/io/OutputStream;", */
/* ")V" */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
if ( p0 != null) { // if-eqz p0, :cond_0
v0 = /* .line 87 */
e.a.a.c0.i .a ( p1,v0 );
/* .line 88 */
v0 = } // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_1
/* check-cast v0, Le/a/a/i; */
/* .line 89 */
(( e.a.a.i ) v0 ).a ( ); // invoke-virtual {v0}, Le/a/a/i;->a()Ljava/lang/String;
e.a.a.c0.i .a ( p1,v1 );
/* .line 90 */
(( e.a.a.i ) v0 ).b ( ); // invoke-virtual {v0}, Le/a/a/i;->b()Ljava/lang/String;
e.a.a.c0.i .a ( p1,v0 );
} // :cond_0
int p0 = 0; // const/4 p0, 0x0
/* .line 91 */
e.a.a.c0.i .a ( p1,p0 );
} // :cond_1
return;
} // .end method
public static a ( Object p0, Long p1 ) {
/* .locals 6 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 65 */
(( e.a.a.c0.g ) p0 ).c ( ); // invoke-virtual {p0}, Le/a/a/c0/g;->c()J
/* move-result-wide v0 */
/* const-wide/16 v2, 0x0 */
/* cmp-long v4, p1, v2 */
/* if-ltz v4, :cond_0 */
/* cmp-long v2, p1, v0 */
/* if-gtz v2, :cond_0 */
/* long-to-int v2, p1 */
/* int-to-long v3, v2 */
/* cmp-long v5, v3, p1 */
/* if-nez v5, :cond_0 */
/* .line 66 */
/* new-array p1, v2, [B */
/* .line 67 */
/* new-instance p2, Ljava/io/DataInputStream; */
/* invoke-direct {p2, p0}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V */
(( java.io.DataInputStream ) p2 ).readFully ( p1 ); // invoke-virtual {p2, p1}, Ljava/io/DataInputStream;->readFully([B)V
/* .line 68 */
} // :cond_0
/* new-instance p0, Ljava/io/IOException; */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "streamToBytes length="; // const-string v3, "streamToBytes length="
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( p1, p2 ); // invoke-virtual {v2, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
final String p1 = ", maxLength="; // const-string p1, ", maxLength="
(( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v0, v1 ); // invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
} // .end method
public static Integer b ( java.io.InputStream p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 7 */
v0 = e.a.a.c0.i .a ( p0 );
/* shl-int/lit8 v0, v0, 0x0 */
/* or-int/lit8 v0, v0, 0x0 */
/* .line 8 */
v1 = e.a.a.c0.i .a ( p0 );
/* shl-int/lit8 v1, v1, 0x8 */
/* or-int/2addr v0, v1 */
/* .line 9 */
v1 = e.a.a.c0.i .a ( p0 );
/* shl-int/lit8 v1, v1, 0x10 */
/* or-int/2addr v0, v1 */
/* .line 10 */
p0 = e.a.a.c0.i .a ( p0 );
/* shl-int/lit8 p0, p0, 0x18 */
/* or-int/2addr p0, v0 */
} // .end method
public static java.lang.String b ( Object p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 11 */
e.a.a.c0.i .c ( p0 );
/* move-result-wide v0 */
/* .line 12 */
e.a.a.c0.i .a ( p0,v0,v1 );
/* .line 13 */
/* new-instance v0, Ljava/lang/String; */
final String v1 = "UTF-8"; // const-string v1, "UTF-8"
/* invoke-direct {v0, p0, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V */
} // .end method
public static Long c ( java.io.InputStream p0 ) {
/* .locals 7 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 19 */
v0 = e.a.a.c0.i .a ( p0 );
/* int-to-long v0, v0 */
/* const-wide/16 v2, 0xff */
/* and-long/2addr v0, v2 */
int v4 = 0; // const/4 v4, 0x0
/* shl-long/2addr v0, v4 */
/* const-wide/16 v4, 0x0 */
/* or-long/2addr v0, v4 */
/* .line 20 */
v4 = e.a.a.c0.i .a ( p0 );
/* int-to-long v4, v4 */
/* and-long/2addr v4, v2 */
/* const/16 v6, 0x8 */
/* shl-long/2addr v4, v6 */
/* or-long/2addr v0, v4 */
/* .line 21 */
v4 = e.a.a.c0.i .a ( p0 );
/* int-to-long v4, v4 */
/* and-long/2addr v4, v2 */
/* const/16 v6, 0x10 */
/* shl-long/2addr v4, v6 */
/* or-long/2addr v0, v4 */
/* .line 22 */
v4 = e.a.a.c0.i .a ( p0 );
/* int-to-long v4, v4 */
/* and-long/2addr v4, v2 */
/* const/16 v6, 0x18 */
/* shl-long/2addr v4, v6 */
/* or-long/2addr v0, v4 */
/* .line 23 */
v4 = e.a.a.c0.i .a ( p0 );
/* int-to-long v4, v4 */
/* and-long/2addr v4, v2 */
/* const/16 v6, 0x20 */
/* shl-long/2addr v4, v6 */
/* or-long/2addr v0, v4 */
/* .line 24 */
v4 = e.a.a.c0.i .a ( p0 );
/* int-to-long v4, v4 */
/* and-long/2addr v4, v2 */
/* const/16 v6, 0x28 */
/* shl-long/2addr v4, v6 */
/* or-long/2addr v0, v4 */
/* .line 25 */
v4 = e.a.a.c0.i .a ( p0 );
/* int-to-long v4, v4 */
/* and-long/2addr v4, v2 */
/* const/16 v6, 0x30 */
/* shl-long/2addr v4, v6 */
/* or-long/2addr v0, v4 */
/* .line 26 */
p0 = e.a.a.c0.i .a ( p0 );
/* int-to-long v4, p0 */
/* and-long/2addr v2, v4 */
/* const/16 p0, 0x38 */
/* shl-long/2addr v2, p0 */
/* or-long/2addr v0, v2 */
/* return-wide v0 */
} // .end method
/* # virtual methods */
public synchronized e.a.a.a a ( java.lang.String p0 ) {
/* .locals 7 */
/* monitor-enter p0 */
/* .line 1 */
try { // :try_start_0
v0 = this.a;
/* check-cast v0, Le/a/a/c0/f; */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_1 */
int v1 = 0; // const/4 v1, 0x0
/* if-nez v0, :cond_0 */
/* .line 2 */
/* monitor-exit p0 */
/* .line 3 */
} // :cond_0
try { // :try_start_1
(( e.a.a.c0.i ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Le/a/a/c0/i;->b(Ljava/lang/String;)Ljava/io/File;
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_1 */
/* .line 4 */
try { // :try_start_2
/* new-instance v3, Le/a/a/c0/g; */
/* new-instance v4, Ljava/io/BufferedInputStream; */
/* .line 5 */
(( e.a.a.c0.i ) p0 ).a ( v2 ); // invoke-virtual {p0, v2}, Le/a/a/c0/i;->a(Ljava/io/File;)Ljava/io/InputStream;
/* invoke-direct {v4, v5}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V */
(( java.io.File ) v2 ).length ( ); // invoke-virtual {v2}, Ljava/io/File;->length()J
/* move-result-wide v5 */
/* invoke-direct {v3, v4, v5, v6}, Le/a/a/c0/g;-><init>(Ljava/io/InputStream;J)V */
/* :try_end_2 */
/* .catch Ljava/io/IOException; {:try_start_2 ..:try_end_2} :catch_0 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_1 */
/* .line 6 */
try { // :try_start_3
e.a.a.c0.f .a ( v3 );
/* .line 7 */
v5 = this.b;
v5 = android.text.TextUtils .equals ( p1,v5 );
/* if-nez v5, :cond_1 */
/* .line 8 */
(( java.io.File ) v2 ).getAbsolutePath ( ); // invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
v0 = this.b;
/* .line 9 */
(( e.a.a.c0.i ) p0 ).e ( p1 ); // invoke-virtual {p0, p1}, Le/a/a/c0/i;->e(Ljava/lang/String;)V
/* :try_end_3 */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_0 */
/* .line 10 */
try { // :try_start_4
(( java.io.FilterInputStream ) v3 ).close ( ); // invoke-virtual {v3}, Ljava/io/FilterInputStream;->close()V
/* :try_end_4 */
/* .catch Ljava/io/IOException; {:try_start_4 ..:try_end_4} :catch_0 */
/* .catchall {:try_start_4 ..:try_end_4} :catchall_1 */
/* .line 11 */
/* monitor-exit p0 */
/* .line 12 */
} // :cond_1
try { // :try_start_5
(( e.a.a.c0.g ) v3 ).c ( ); // invoke-virtual {v3}, Le/a/a/c0/g;->c()J
/* move-result-wide v4 */
e.a.a.c0.i .a ( v3,v4,v5 );
/* .line 13 */
(( e.a.a.c0.f ) v0 ).a ( v4 ); // invoke-virtual {v0, v4}, Le/a/a/c0/f;->a([B)Le/a/a/a;
/* :try_end_5 */
/* .catchall {:try_start_5 ..:try_end_5} :catchall_0 */
/* .line 14 */
try { // :try_start_6
(( java.io.FilterInputStream ) v3 ).close ( ); // invoke-virtual {v3}, Ljava/io/FilterInputStream;->close()V
/* :try_end_6 */
/* .catch Ljava/io/IOException; {:try_start_6 ..:try_end_6} :catch_0 */
/* .catchall {:try_start_6 ..:try_end_6} :catchall_1 */
/* .line 15 */
/* monitor-exit p0 */
/* :catchall_0 */
/* move-exception v0 */
/* .line 16 */
try { // :try_start_7
(( java.io.FilterInputStream ) v3 ).close ( ); // invoke-virtual {v3}, Ljava/io/FilterInputStream;->close()V
/* throw v0 */
/* :try_end_7 */
/* .catch Ljava/io/IOException; {:try_start_7 ..:try_end_7} :catch_0 */
/* .catchall {:try_start_7 ..:try_end_7} :catchall_1 */
/* :catch_0 */
/* move-exception v0 */
/* .line 17 */
try { // :try_start_8
(( java.io.File ) v2 ).getAbsolutePath ( ); // invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
(( java.io.IOException ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/io/IOException;->toString()Ljava/lang/String;
/* .line 18 */
(( e.a.a.c0.i ) p0 ).d ( p1 ); // invoke-virtual {p0, p1}, Le/a/a/c0/i;->d(Ljava/lang/String;)V
/* :try_end_8 */
/* .catchall {:try_start_8 ..:try_end_8} :catchall_1 */
/* .line 19 */
/* monitor-exit p0 */
/* :catchall_1 */
/* move-exception p1 */
/* monitor-exit p0 */
/* throw p1 */
} // .end method
public java.io.InputStream a ( java.io.File p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/FileNotFoundException; */
/* } */
} // .end annotation
/* .line 69 */
/* new-instance v0, Ljava/io/FileInputStream; */
/* invoke-direct {v0, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V */
} // .end method
public synchronized void a ( ) {
/* .locals 9 */
/* monitor-enter p0 */
/* .line 20 */
try { // :try_start_0
v0 = this.c;
/* .line 21 */
v1 = (( java.io.File ) v0 ).exists ( ); // invoke-virtual {v0}, Ljava/io/File;->exists()Z
/* if-nez v1, :cond_1 */
/* .line 22 */
v1 = (( java.io.File ) v0 ).mkdirs ( ); // invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z
/* if-nez v1, :cond_0 */
/* .line 23 */
(( java.io.File ) v0 ).getAbsolutePath ( ); // invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_1 */
/* .line 24 */
} // :cond_0
/* monitor-exit p0 */
return;
/* .line 25 */
} // :cond_1
try { // :try_start_1
(( java.io.File ) v0 ).listFiles ( ); // invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_1 */
/* if-nez v0, :cond_2 */
/* .line 26 */
/* monitor-exit p0 */
return;
/* .line 27 */
} // :cond_2
try { // :try_start_2
/* array-length v1, v0 */
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v2, v1, :cond_3 */
/* aget-object v3, v0, v2 */
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_1 */
/* .line 28 */
try { // :try_start_3
(( java.io.File ) v3 ).length ( ); // invoke-virtual {v3}, Ljava/io/File;->length()J
/* move-result-wide v4 */
/* .line 29 */
/* new-instance v6, Le/a/a/c0/g; */
/* new-instance v7, Ljava/io/BufferedInputStream; */
/* .line 30 */
(( e.a.a.c0.i ) p0 ).a ( v3 ); // invoke-virtual {p0, v3}, Le/a/a/c0/i;->a(Ljava/io/File;)Ljava/io/InputStream;
/* invoke-direct {v7, v8}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V */
/* invoke-direct {v6, v7, v4, v5}, Le/a/a/c0/g;-><init>(Ljava/io/InputStream;J)V */
/* :try_end_3 */
/* .catch Ljava/io/IOException; {:try_start_3 ..:try_end_3} :catch_0 */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_1 */
/* .line 31 */
try { // :try_start_4
e.a.a.c0.f .a ( v6 );
/* .line 32 */
/* iput-wide v4, v7, Le/a/a/c0/f;->a:J */
/* .line 33 */
v4 = this.b;
(( e.a.a.c0.i ) p0 ).a ( v4, v7 ); // invoke-virtual {p0, v4, v7}, Le/a/a/c0/i;->a(Ljava/lang/String;Le/a/a/c0/f;)V
/* :try_end_4 */
/* .catchall {:try_start_4 ..:try_end_4} :catchall_0 */
/* .line 34 */
try { // :try_start_5
(( java.io.FilterInputStream ) v6 ).close ( ); // invoke-virtual {v6}, Ljava/io/FilterInputStream;->close()V
/* :catchall_0 */
/* move-exception v4 */
(( java.io.FilterInputStream ) v6 ).close ( ); // invoke-virtual {v6}, Ljava/io/FilterInputStream;->close()V
/* throw v4 */
/* :try_end_5 */
/* .catch Ljava/io/IOException; {:try_start_5 ..:try_end_5} :catch_0 */
/* .catchall {:try_start_5 ..:try_end_5} :catchall_1 */
/* .line 35 */
/* :catch_0 */
try { // :try_start_6
(( java.io.File ) v3 ).delete ( ); // invoke-virtual {v3}, Ljava/io/File;->delete()Z
/* :try_end_6 */
/* .catchall {:try_start_6 ..:try_end_6} :catchall_1 */
} // :goto_1
/* add-int/lit8 v2, v2, 0x1 */
/* .line 36 */
} // :cond_3
/* monitor-exit p0 */
return;
/* :catchall_1 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
public synchronized void a ( java.lang.String p0, Object p1 ) {
/* .locals 5 */
/* monitor-enter p0 */
/* .line 42 */
try { // :try_start_0
/* iget-wide v0, p0, Le/a/a/c0/i;->b:J */
v2 = this.a;
/* array-length v2, v2 */
/* int-to-long v2, v2 */
/* add-long/2addr v0, v2 */
/* iget v2, p0, Le/a/a/c0/i;->d:I */
/* int-to-long v2, v2 */
/* cmp-long v4, v0, v2 */
/* if-lez v4, :cond_0 */
v0 = this.a;
/* array-length v0, v0 */
/* int-to-float v0, v0 */
/* iget v1, p0, Le/a/a/c0/i;->d:I */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* int-to-float v1, v1 */
/* const v2, 0x3f666666 # 0.9f */
/* mul-float v1, v1, v2 */
/* cmpl-float v0, v0, v1 */
/* if-lez v0, :cond_0 */
/* .line 43 */
/* monitor-exit p0 */
return;
/* .line 44 */
} // :cond_0
try { // :try_start_1
(( e.a.a.c0.i ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Le/a/a/c0/i;->b(Ljava/lang/String;)Ljava/io/File;
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 45 */
try { // :try_start_2
/* new-instance v1, Ljava/io/BufferedOutputStream; */
(( e.a.a.c0.i ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Le/a/a/c0/i;->b(Ljava/io/File;)Ljava/io/OutputStream;
/* invoke-direct {v1, v2}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V */
/* .line 46 */
/* new-instance v2, Le/a/a/c0/f; */
/* invoke-direct {v2, p1, p2}, Le/a/a/c0/f;-><init>(Ljava/lang/String;Le/a/a/a;)V */
/* .line 47 */
v3 = (( e.a.a.c0.f ) v2 ).a ( v1 ); // invoke-virtual {v2, v1}, Le/a/a/c0/f;->a(Ljava/io/OutputStream;)Z
if ( v3 != null) { // if-eqz v3, :cond_1
/* .line 48 */
p2 = this.a;
(( java.io.BufferedOutputStream ) v1 ).write ( p2 ); // invoke-virtual {v1, p2}, Ljava/io/BufferedOutputStream;->write([B)V
/* .line 49 */
(( java.io.BufferedOutputStream ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/io/BufferedOutputStream;->close()V
/* .line 50 */
(( java.io.File ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/io/File;->length()J
/* move-result-wide v3 */
/* iput-wide v3, v2, Le/a/a/c0/f;->a:J */
/* .line 51 */
(( e.a.a.c0.i ) p0 ).a ( p1, v2 ); // invoke-virtual {p0, p1, v2}, Le/a/a/c0/i;->a(Ljava/lang/String;Le/a/a/c0/f;)V
/* .line 52 */
(( e.a.a.c0.i ) p0 ).c ( ); // invoke-virtual {p0}, Le/a/a/c0/i;->c()V
/* .line 53 */
} // :cond_1
(( java.io.BufferedOutputStream ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/io/BufferedOutputStream;->close()V
/* .line 54 */
(( java.io.File ) v0 ).getAbsolutePath ( ); // invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
/* .line 55 */
/* new-instance p1, Ljava/io/IOException; */
/* invoke-direct {p1}, Ljava/io/IOException;-><init>()V */
/* throw p1 */
/* :try_end_2 */
/* .catch Ljava/io/IOException; {:try_start_2 ..:try_end_2} :catch_0 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
/* .line 56 */
/* :catch_0 */
try { // :try_start_3
p1 = (( java.io.File ) v0 ).delete ( ); // invoke-virtual {v0}, Ljava/io/File;->delete()Z
/* if-nez p1, :cond_2 */
/* .line 57 */
(( java.io.File ) v0 ).getAbsolutePath ( ); // invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
/* .line 58 */
} // :cond_2
(( e.a.a.c0.i ) p0 ).b ( ); // invoke-virtual {p0}, Le/a/a/c0/i;->b()V
/* :try_end_3 */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_0 */
/* .line 59 */
} // :goto_0
/* monitor-exit p0 */
return;
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit p0 */
/* throw p1 */
} // .end method
public final void a ( java.lang.String p0, Object p1 ) {
/* .locals 7 */
/* .line 60 */
v0 = v0 = this.a;
/* if-nez v0, :cond_0 */
/* .line 61 */
/* iget-wide v0, p0, Le/a/a/c0/i;->b:J */
/* iget-wide v2, p2, Le/a/a/c0/f;->a:J */
/* add-long/2addr v0, v2 */
/* iput-wide v0, p0, Le/a/a/c0/i;->b:J */
/* .line 62 */
} // :cond_0
v0 = this.a;
/* check-cast v0, Le/a/a/c0/f; */
/* .line 63 */
/* iget-wide v1, p0, Le/a/a/c0/i;->b:J */
/* iget-wide v3, p2, Le/a/a/c0/f;->a:J */
/* iget-wide v5, v0, Le/a/a/c0/f;->a:J */
/* sub-long/2addr v3, v5 */
/* add-long/2addr v1, v3 */
/* iput-wide v1, p0, Le/a/a/c0/i;->b:J */
/* .line 64 */
} // :goto_0
v0 = this.a;
return;
} // .end method
public synchronized void a ( java.lang.String p0, Boolean p1 ) {
/* .locals 3 */
/* monitor-enter p0 */
/* .line 37 */
try { // :try_start_0
(( e.a.a.c0.i ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/a/a/c0/i;->a(Ljava/lang/String;)Le/a/a/a;
if ( v0 != null) { // if-eqz v0, :cond_1
/* const-wide/16 v1, 0x0 */
/* .line 38 */
/* iput-wide v1, v0, Le/a/a/a;->f:J */
if ( p2 != null) { // if-eqz p2, :cond_0
/* .line 39 */
/* iput-wide v1, v0, Le/a/a/a;->e:J */
/* .line 40 */
} // :cond_0
(( e.a.a.c0.i ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Le/a/a/c0/i;->a(Ljava/lang/String;Le/a/a/a;)V
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 41 */
} // :cond_1
/* monitor-exit p0 */
return;
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit p0 */
/* throw p1 */
} // .end method
public java.io.File b ( java.lang.String p0 ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Ljava/io/File; */
v1 = this.c;
(( e.a.a.c0.i ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Le/a/a/c0/i;->c(Ljava/lang/String;)Ljava/lang/String;
/* invoke-direct {v0, v1, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V */
} // .end method
public java.io.OutputStream b ( java.io.File p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/FileNotFoundException; */
/* } */
} // .end annotation
/* .line 6 */
/* new-instance v0, Ljava/io/FileOutputStream; */
/* invoke-direct {v0, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V */
} // .end method
public final void b ( ) {
/* .locals 2 */
/* .line 2 */
v0 = this.c;
v0 = (( java.io.File ) v0 ).exists ( ); // invoke-virtual {v0}, Ljava/io/File;->exists()Z
/* if-nez v0, :cond_0 */
/* .line 3 */
v0 = this.a;
/* const-wide/16 v0, 0x0 */
/* .line 4 */
/* iput-wide v0, p0, Le/a/a/c0/i;->b:J */
/* .line 5 */
(( e.a.a.c0.i ) p0 ).a ( ); // invoke-virtual {p0}, Le/a/a/c0/i;->a()V
} // :cond_0
return;
} // .end method
public final java.lang.String c ( java.lang.String p0 ) {
/* .locals 3 */
/* .line 1 */
v0 = (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
/* div-int/lit8 v0, v0, 0x2 */
int v1 = 0; // const/4 v1, 0x0
/* .line 2 */
(( java.lang.String ) p1 ).substring ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;
v1 = (( java.lang.String ) v1 ).hashCode ( ); // invoke-virtual {v1}, Ljava/lang/String;->hashCode()I
java.lang.String .valueOf ( v1 );
/* .line 3 */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.String ) p1 ).substring ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;
p1 = (( java.lang.String ) p1 ).hashCode ( ); // invoke-virtual {p1}, Ljava/lang/String;->hashCode()I
java.lang.String .valueOf ( p1 );
(( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
public final void c ( ) {
/* .locals 6 */
/* .line 4 */
/* iget-wide v0, p0, Le/a/a/c0/i;->b:J */
/* iget v2, p0, Le/a/a/c0/i;->d:I */
/* int-to-long v2, v2 */
/* cmp-long v4, v0, v2 */
/* if-gez v4, :cond_0 */
return;
/* .line 5 */
} // :cond_0
/* sget-boolean v0, Le/a/a/a0;->a:Z */
/* .line 6 */
android.os.SystemClock .elapsedRealtime ( );
/* .line 7 */
v0 = this.a;
/* .line 8 */
v1 = } // :cond_1
if ( v1 != null) { // if-eqz v1, :cond_3
/* .line 9 */
/* check-cast v1, Ljava/util/Map$Entry; */
/* .line 10 */
/* check-cast v1, Le/a/a/c0/f; */
/* .line 11 */
v2 = this.b;
(( e.a.a.c0.i ) p0 ).b ( v2 ); // invoke-virtual {p0, v2}, Le/a/a/c0/i;->b(Ljava/lang/String;)Ljava/io/File;
v2 = (( java.io.File ) v2 ).delete ( ); // invoke-virtual {v2}, Ljava/io/File;->delete()Z
if ( v2 != null) { // if-eqz v2, :cond_2
/* .line 12 */
/* iget-wide v2, p0, Le/a/a/c0/i;->b:J */
/* iget-wide v4, v1, Le/a/a/c0/f;->a:J */
/* sub-long/2addr v2, v4 */
/* iput-wide v2, p0, Le/a/a/c0/i;->b:J */
/* .line 13 */
} // :cond_2
v1 = this.b;
/* .line 14 */
(( e.a.a.c0.i ) p0 ).c ( v1 ); // invoke-virtual {p0, v1}, Le/a/a/c0/i;->c(Ljava/lang/String;)Ljava/lang/String;
/* .line 15 */
} // :goto_0
/* .line 16 */
/* iget-wide v1, p0, Le/a/a/c0/i;->b:J */
/* long-to-float v1, v1 */
/* iget v2, p0, Le/a/a/c0/i;->d:I */
/* int-to-float v2, v2 */
/* const v3, 0x3f666666 # 0.9f */
/* mul-float v2, v2, v3 */
/* cmpg-float v1, v1, v2 */
/* if-gez v1, :cond_1 */
/* .line 17 */
} // :cond_3
/* sget-boolean v0, Le/a/a/a0;->a:Z */
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 18 */
android.os.SystemClock .elapsedRealtime ( );
} // :cond_4
return;
} // .end method
public synchronized void d ( java.lang.String p0 ) {
/* .locals 1 */
/* monitor-enter p0 */
/* .line 1 */
try { // :try_start_0
(( e.a.a.c0.i ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Le/a/a/c0/i;->b(Ljava/lang/String;)Ljava/io/File;
v0 = (( java.io.File ) v0 ).delete ( ); // invoke-virtual {v0}, Ljava/io/File;->delete()Z
/* .line 2 */
(( e.a.a.c0.i ) p0 ).e ( p1 ); // invoke-virtual {p0, p1}, Le/a/a/c0/i;->e(Ljava/lang/String;)V
/* if-nez v0, :cond_0 */
/* .line 3 */
(( e.a.a.c0.i ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Le/a/a/c0/i;->c(Ljava/lang/String;)Ljava/lang/String;
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 4 */
} // :cond_0
/* monitor-exit p0 */
return;
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit p0 */
/* throw p1 */
} // .end method
public final void e ( java.lang.String p0 ) {
/* .locals 4 */
/* .line 1 */
v0 = this.a;
/* check-cast p1, Le/a/a/c0/f; */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 2 */
/* iget-wide v0, p0, Le/a/a/c0/i;->b:J */
/* iget-wide v2, p1, Le/a/a/c0/f;->a:J */
/* sub-long/2addr v0, v2 */
/* iput-wide v0, p0, Le/a/a/c0/i;->b:J */
} // :cond_0
return;
} // .end method
