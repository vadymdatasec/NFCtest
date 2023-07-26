public class c.k.a.b extends java.io.InputStream implements java.io.DataInput {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # static fields */
	 public static final java.nio.ByteOrder f;
	 public static final java.nio.ByteOrder g;
	 /* # instance fields */
	 public final java.io.DataInputStream b;
	 public java.nio.ByteOrder c;
	 public Integer d;
	 public e;
	 /* # direct methods */
	 public static c.k.a.b ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = java.nio.ByteOrder.LITTLE_ENDIAN;
		 /* .line 2 */
		 v0 = java.nio.ByteOrder.BIG_ENDIAN;
		 return;
	 } // .end method
	 public c.k.a.b ( ) {
		 /* .locals 1 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Ljava/io/IOException; */
		 /* } */
	 } // .end annotation
	 /* .line 2 */
	 v0 = java.nio.ByteOrder.BIG_ENDIAN;
	 /* invoke-direct {p0, p1, v0}, Lc/k/a/b;-><init>(Ljava/io/InputStream;Ljava/nio/ByteOrder;)V */
	 return;
} // .end method
public c.k.a.b ( ) {
	 /* .locals 1 */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Ljava/io/IOException; */
	 /* } */
} // .end annotation
/* .line 3 */
/* invoke-direct {p0}, Ljava/io/InputStream;-><init>()V */
/* .line 4 */
v0 = java.nio.ByteOrder.BIG_ENDIAN;
this.c = v0;
/* .line 5 */
/* new-instance v0, Ljava/io/DataInputStream; */
/* invoke-direct {v0, p1}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V */
this.b = v0;
int p1 = 0; // const/4 p1, 0x0
/* .line 6 */
(( java.io.DataInputStream ) v0 ).mark ( p1 ); // invoke-virtual {v0, p1}, Ljava/io/DataInputStream;->mark(I)V
/* .line 7 */
/* iput p1, p0, Lc/k/a/b;->d:I */
/* .line 8 */
this.c = p2;
return;
} // .end method
public c.k.a.b ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
/* new-instance v0, Ljava/io/ByteArrayInputStream; */
/* invoke-direct {v0, p1}, Ljava/io/ByteArrayInputStream;-><init>([B)V */
p1 = java.nio.ByteOrder.BIG_ENDIAN;
/* invoke-direct {p0, v0, p1}, Lc/k/a/b;-><init>(Ljava/io/InputStream;Ljava/nio/ByteOrder;)V */
return;
} // .end method
/* # virtual methods */
public void a ( Integer p0 ) {
/* .locals 6 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
int v0 = 0; // const/4 v0, 0x0
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-ge v1, p1, :cond_3 */
/* .line 2 */
v2 = this.b;
/* sub-int v3, p1, v1 */
/* int-to-long v4, v3 */
(( java.io.DataInputStream ) v2 ).skip ( v4, v5 ); // invoke-virtual {v2, v4, v5}, Ljava/io/DataInputStream;->skip(J)J
/* move-result-wide v4 */
/* long-to-int v2, v4 */
/* if-gtz v2, :cond_2 */
/* .line 3 */
v2 = this.e;
/* const/16 v4, 0x2000 */
/* if-nez v2, :cond_0 */
/* new-array v2, v4, [B */
/* .line 4 */
this.e = v2;
/* .line 5 */
} // :cond_0
v2 = java.lang.Math .min ( v4,v3 );
/* .line 6 */
v3 = this.b;
v4 = this.e;
v2 = (( java.io.DataInputStream ) v3 ).read ( v4, v0, v2 ); // invoke-virtual {v3, v4, v0, v2}, Ljava/io/DataInputStream;->read([BII)I
int v3 = -1; // const/4 v3, -0x1
/* if-eq v2, v3, :cond_1 */
/* .line 7 */
} // :cond_1
/* new-instance v0, Ljava/io/EOFException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Reached EOF while skipping "; // const-string v2, "Reached EOF while skipping "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String p1 = " bytes."; // const-string p1, " bytes."
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, p1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_2
} // :goto_1
/* add-int/2addr v1, v2 */
/* .line 8 */
} // :cond_3
/* iget p1, p0, Lc/k/a/b;->d:I */
/* add-int/2addr p1, v1 */
/* iput p1, p0, Lc/k/a/b;->d:I */
return;
} // .end method
public void a ( java.nio.ByteOrder p0 ) {
/* .locals 0 */
/* .line 1 */
this.c = p1;
return;
} // .end method
public Integer available ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.b;
v0 = (( java.io.DataInputStream ) v0 ).available ( ); // invoke-virtual {v0}, Ljava/io/DataInputStream;->available()I
} // .end method
public Integer c ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Lc/k/a/b;->d:I */
} // .end method
public Long l ( ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
v0 = (( c.k.a.b ) p0 ).readInt ( ); // invoke-virtual {p0}, Lc/k/a/b;->readInt()I
/* int-to-long v0, v0 */
/* const-wide v2, 0xffffffffL */
/* and-long/2addr v0, v2 */
/* return-wide v0 */
} // .end method
public void mark ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
/* new-instance p1, Ljava/lang/UnsupportedOperationException; */
final String v0 = "Mark is currently unsupported"; // const-string v0, "Mark is currently unsupported"
/* invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public Integer read ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
/* iget v0, p0, Lc/k/a/b;->d:I */
/* add-int/lit8 v0, v0, 0x1 */
/* iput v0, p0, Lc/k/a/b;->d:I */
/* .line 2 */
v0 = this.b;
v0 = (( java.io.DataInputStream ) v0 ).read ( ); // invoke-virtual {v0}, Ljava/io/DataInputStream;->read()I
} // .end method
public Integer read ( Object[] p0, Integer p1, Integer p2 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 3 */
v0 = this.b;
p1 = (( java.io.DataInputStream ) v0 ).read ( p1, p2, p3 ); // invoke-virtual {v0, p1, p2, p3}, Ljava/io/DataInputStream;->read([BII)I
/* .line 4 */
/* iget p2, p0, Lc/k/a/b;->d:I */
/* add-int/2addr p2, p1 */
/* iput p2, p0, Lc/k/a/b;->d:I */
} // .end method
public Boolean readBoolean ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
/* iget v0, p0, Lc/k/a/b;->d:I */
/* add-int/lit8 v0, v0, 0x1 */
/* iput v0, p0, Lc/k/a/b;->d:I */
/* .line 2 */
v0 = this.b;
v0 = (( java.io.DataInputStream ) v0 ).readBoolean ( ); // invoke-virtual {v0}, Ljava/io/DataInputStream;->readBoolean()Z
} // .end method
public Object readByte ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
/* iget v0, p0, Lc/k/a/b;->d:I */
/* add-int/lit8 v0, v0, 0x1 */
/* iput v0, p0, Lc/k/a/b;->d:I */
/* .line 2 */
v0 = this.b;
v0 = (( java.io.DataInputStream ) v0 ).read ( ); // invoke-virtual {v0}, Ljava/io/DataInputStream;->read()I
/* if-ltz v0, :cond_0 */
/* int-to-byte v0, v0 */
/* .line 3 */
} // :cond_0
/* new-instance v0, Ljava/io/EOFException; */
/* invoke-direct {v0}, Ljava/io/EOFException;-><init>()V */
/* throw v0 */
} // .end method
public Object readChar ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
/* iget v0, p0, Lc/k/a/b;->d:I */
/* add-int/lit8 v0, v0, 0x2 */
/* iput v0, p0, Lc/k/a/b;->d:I */
/* .line 2 */
v0 = this.b;
v0 = (( java.io.DataInputStream ) v0 ).readChar ( ); // invoke-virtual {v0}, Ljava/io/DataInputStream;->readChar()C
} // .end method
public Double readDouble ( ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
(( c.k.a.b ) p0 ).readLong ( ); // invoke-virtual {p0}, Lc/k/a/b;->readLong()J
/* move-result-wide v0 */
java.lang.Double .longBitsToDouble ( v0,v1 );
/* move-result-wide v0 */
/* return-wide v0 */
} // .end method
public Float readFloat ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
v0 = (( c.k.a.b ) p0 ).readInt ( ); // invoke-virtual {p0}, Lc/k/a/b;->readInt()I
v0 = java.lang.Float .intBitsToFloat ( v0 );
} // .end method
public void readFully ( Object[] p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 3 */
/* iget v0, p0, Lc/k/a/b;->d:I */
/* array-length v1, p1 */
/* add-int/2addr v0, v1 */
/* iput v0, p0, Lc/k/a/b;->d:I */
/* .line 4 */
v0 = this.b;
(( java.io.DataInputStream ) v0 ).readFully ( p1 ); // invoke-virtual {v0, p1}, Ljava/io/DataInputStream;->readFully([B)V
return;
} // .end method
public void readFully ( Object[] p0, Integer p1, Integer p2 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
/* iget v0, p0, Lc/k/a/b;->d:I */
/* add-int/2addr v0, p3 */
/* iput v0, p0, Lc/k/a/b;->d:I */
/* .line 2 */
v0 = this.b;
(( java.io.DataInputStream ) v0 ).readFully ( p1, p2, p3 ); // invoke-virtual {v0, p1, p2, p3}, Ljava/io/DataInputStream;->readFully([BII)V
return;
} // .end method
public Integer readInt ( ) {
/* .locals 6 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
/* iget v0, p0, Lc/k/a/b;->d:I */
/* add-int/lit8 v0, v0, 0x4 */
/* iput v0, p0, Lc/k/a/b;->d:I */
/* .line 2 */
v0 = this.b;
v0 = (( java.io.DataInputStream ) v0 ).read ( ); // invoke-virtual {v0}, Ljava/io/DataInputStream;->read()I
/* .line 3 */
v1 = this.b;
v1 = (( java.io.DataInputStream ) v1 ).read ( ); // invoke-virtual {v1}, Ljava/io/DataInputStream;->read()I
/* .line 4 */
v2 = this.b;
v2 = (( java.io.DataInputStream ) v2 ).read ( ); // invoke-virtual {v2}, Ljava/io/DataInputStream;->read()I
/* .line 5 */
v3 = this.b;
v3 = (( java.io.DataInputStream ) v3 ).read ( ); // invoke-virtual {v3}, Ljava/io/DataInputStream;->read()I
/* or-int v4, v0, v1 */
/* or-int/2addr v4, v2 */
/* or-int/2addr v4, v3 */
/* if-ltz v4, :cond_2 */
/* .line 6 */
v4 = this.c;
v5 = c.k.a.b.f;
/* if-ne v4, v5, :cond_0 */
/* shl-int/lit8 v3, v3, 0x18 */
/* shl-int/lit8 v2, v2, 0x10 */
/* add-int/2addr v3, v2 */
/* shl-int/lit8 v1, v1, 0x8 */
/* add-int/2addr v3, v1 */
/* add-int/2addr v3, v0 */
/* .line 7 */
} // :cond_0
v5 = c.k.a.b.g;
/* if-ne v4, v5, :cond_1 */
/* shl-int/lit8 v0, v0, 0x18 */
/* shl-int/lit8 v1, v1, 0x10 */
/* add-int/2addr v0, v1 */
/* shl-int/lit8 v1, v2, 0x8 */
/* add-int/2addr v0, v1 */
/* add-int/2addr v0, v3 */
/* .line 8 */
} // :cond_1
/* new-instance v0, Ljava/io/IOException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Invalid byte order: "; // const-string v2, "Invalid byte order: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.c;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* .line 9 */
} // :cond_2
/* new-instance v0, Ljava/io/EOFException; */
/* invoke-direct {v0}, Ljava/io/EOFException;-><init>()V */
/* throw v0 */
} // .end method
public java.lang.String readLine ( ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
final String v0 = "ExifInterface"; // const-string v0, "ExifInterface"
final String v1 = "Currently unsupported"; // const-string v1, "Currently unsupported"
/* .line 1 */
android.util.Log .d ( v0,v1 );
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Long readLong ( ) {
/* .locals 19 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* move-object/from16 v0, p0 */
/* .line 1 */
/* iget v1, v0, Lc/k/a/b;->d:I */
/* const/16 v2, 0x8 */
/* add-int/2addr v1, v2 */
/* iput v1, v0, Lc/k/a/b;->d:I */
/* .line 2 */
v1 = this.b;
v1 = (( java.io.DataInputStream ) v1 ).read ( ); // invoke-virtual {v1}, Ljava/io/DataInputStream;->read()I
/* .line 3 */
v3 = this.b;
v3 = (( java.io.DataInputStream ) v3 ).read ( ); // invoke-virtual {v3}, Ljava/io/DataInputStream;->read()I
/* .line 4 */
v4 = this.b;
v4 = (( java.io.DataInputStream ) v4 ).read ( ); // invoke-virtual {v4}, Ljava/io/DataInputStream;->read()I
/* .line 5 */
v5 = this.b;
v5 = (( java.io.DataInputStream ) v5 ).read ( ); // invoke-virtual {v5}, Ljava/io/DataInputStream;->read()I
/* .line 6 */
v6 = this.b;
v6 = (( java.io.DataInputStream ) v6 ).read ( ); // invoke-virtual {v6}, Ljava/io/DataInputStream;->read()I
/* .line 7 */
v7 = this.b;
v7 = (( java.io.DataInputStream ) v7 ).read ( ); // invoke-virtual {v7}, Ljava/io/DataInputStream;->read()I
/* .line 8 */
v8 = this.b;
v8 = (( java.io.DataInputStream ) v8 ).read ( ); // invoke-virtual {v8}, Ljava/io/DataInputStream;->read()I
/* .line 9 */
v9 = this.b;
v9 = (( java.io.DataInputStream ) v9 ).read ( ); // invoke-virtual {v9}, Ljava/io/DataInputStream;->read()I
/* or-int v10, v1, v3 */
/* or-int/2addr v10, v4 */
/* or-int/2addr v10, v5 */
/* or-int/2addr v10, v6 */
/* or-int/2addr v10, v7 */
/* or-int/2addr v10, v8 */
/* or-int/2addr v10, v9 */
/* if-ltz v10, :cond_2 */
/* .line 10 */
v10 = this.c;
v11 = c.k.a.b.f;
/* const/16 v12, 0x10 */
/* const/16 v13, 0x18 */
/* const/16 v14, 0x20 */
/* const/16 v15, 0x28 */
/* const/16 v16, 0x30 */
/* const/16 v17, 0x38 */
/* if-ne v10, v11, :cond_0 */
/* int-to-long v9, v9 */
/* shl-long v9, v9, v17 */
/* move/from16 v18, v3 */
/* int-to-long v2, v8 */
/* shl-long v2, v2, v16 */
/* add-long/2addr v9, v2 */
/* int-to-long v2, v7 */
/* shl-long/2addr v2, v15 */
/* add-long/2addr v9, v2 */
/* int-to-long v2, v6 */
/* shl-long/2addr v2, v14 */
/* add-long/2addr v9, v2 */
/* int-to-long v2, v5 */
/* shl-long/2addr v2, v13 */
/* add-long/2addr v9, v2 */
/* int-to-long v2, v4 */
/* shl-long/2addr v2, v12 */
/* add-long/2addr v9, v2 */
/* move/from16 v2, v18 */
/* int-to-long v2, v2 */
/* const/16 v4, 0x8 */
/* shl-long/2addr v2, v4 */
/* add-long/2addr v9, v2 */
/* int-to-long v1, v1 */
/* add-long/2addr v9, v1 */
/* return-wide v9 */
} // :cond_0
/* move v2, v3 */
/* .line 11 */
v3 = c.k.a.b.g;
/* if-ne v10, v3, :cond_1 */
/* int-to-long v11, v1 */
/* shl-long v11, v11, v17 */
/* int-to-long v1, v2 */
/* shl-long v1, v1, v16 */
/* add-long/2addr v11, v1 */
/* int-to-long v1, v4 */
/* shl-long/2addr v1, v15 */
/* add-long/2addr v11, v1 */
/* int-to-long v1, v5 */
/* shl-long/2addr v1, v14 */
/* add-long/2addr v11, v1 */
/* int-to-long v1, v6 */
/* shl-long/2addr v1, v13 */
/* add-long/2addr v11, v1 */
/* int-to-long v1, v7 */
/* const/16 v4, 0x10 */
/* shl-long/2addr v1, v4 */
/* add-long/2addr v11, v1 */
/* int-to-long v1, v8 */
/* const/16 v3, 0x8 */
/* shl-long/2addr v1, v3 */
/* add-long/2addr v11, v1 */
/* int-to-long v1, v9 */
/* add-long/2addr v11, v1 */
/* return-wide v11 */
/* .line 12 */
} // :cond_1
/* new-instance v1, Ljava/io/IOException; */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Invalid byte order: "; // const-string v3, "Invalid byte order: "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v3 = this.c;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V */
/* throw v1 */
/* .line 13 */
} // :cond_2
/* new-instance v1, Ljava/io/EOFException; */
/* invoke-direct {v1}, Ljava/io/EOFException;-><init>()V */
/* throw v1 */
} // .end method
public Object readShort ( ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
/* iget v0, p0, Lc/k/a/b;->d:I */
/* add-int/lit8 v0, v0, 0x2 */
/* iput v0, p0, Lc/k/a/b;->d:I */
/* .line 2 */
v0 = this.b;
v0 = (( java.io.DataInputStream ) v0 ).read ( ); // invoke-virtual {v0}, Ljava/io/DataInputStream;->read()I
/* .line 3 */
v1 = this.b;
v1 = (( java.io.DataInputStream ) v1 ).read ( ); // invoke-virtual {v1}, Ljava/io/DataInputStream;->read()I
/* or-int v2, v0, v1 */
/* if-ltz v2, :cond_2 */
/* .line 4 */
v2 = this.c;
v3 = c.k.a.b.f;
/* if-ne v2, v3, :cond_0 */
/* shl-int/lit8 v1, v1, 0x8 */
/* add-int/2addr v1, v0 */
/* int-to-short v0, v1 */
/* .line 5 */
} // :cond_0
v3 = c.k.a.b.g;
/* if-ne v2, v3, :cond_1 */
/* shl-int/lit8 v0, v0, 0x8 */
/* add-int/2addr v0, v1 */
/* int-to-short v0, v0 */
/* .line 6 */
} // :cond_1
/* new-instance v0, Ljava/io/IOException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Invalid byte order: "; // const-string v2, "Invalid byte order: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.c;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* .line 7 */
} // :cond_2
/* new-instance v0, Ljava/io/EOFException; */
/* invoke-direct {v0}, Ljava/io/EOFException;-><init>()V */
/* throw v0 */
} // .end method
public java.lang.String readUTF ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
/* iget v0, p0, Lc/k/a/b;->d:I */
/* add-int/lit8 v0, v0, 0x2 */
/* iput v0, p0, Lc/k/a/b;->d:I */
/* .line 2 */
v0 = this.b;
(( java.io.DataInputStream ) v0 ).readUTF ( ); // invoke-virtual {v0}, Ljava/io/DataInputStream;->readUTF()Ljava/lang/String;
} // .end method
public Integer readUnsignedByte ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
/* iget v0, p0, Lc/k/a/b;->d:I */
/* add-int/lit8 v0, v0, 0x1 */
/* iput v0, p0, Lc/k/a/b;->d:I */
/* .line 2 */
v0 = this.b;
v0 = (( java.io.DataInputStream ) v0 ).readUnsignedByte ( ); // invoke-virtual {v0}, Ljava/io/DataInputStream;->readUnsignedByte()I
} // .end method
public Integer readUnsignedShort ( ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
/* iget v0, p0, Lc/k/a/b;->d:I */
/* add-int/lit8 v0, v0, 0x2 */
/* iput v0, p0, Lc/k/a/b;->d:I */
/* .line 2 */
v0 = this.b;
v0 = (( java.io.DataInputStream ) v0 ).read ( ); // invoke-virtual {v0}, Ljava/io/DataInputStream;->read()I
/* .line 3 */
v1 = this.b;
v1 = (( java.io.DataInputStream ) v1 ).read ( ); // invoke-virtual {v1}, Ljava/io/DataInputStream;->read()I
/* or-int v2, v0, v1 */
/* if-ltz v2, :cond_2 */
/* .line 4 */
v2 = this.c;
v3 = c.k.a.b.f;
/* if-ne v2, v3, :cond_0 */
/* shl-int/lit8 v1, v1, 0x8 */
/* add-int/2addr v1, v0 */
/* .line 5 */
} // :cond_0
v3 = c.k.a.b.g;
/* if-ne v2, v3, :cond_1 */
/* shl-int/lit8 v0, v0, 0x8 */
/* add-int/2addr v0, v1 */
/* .line 6 */
} // :cond_1
/* new-instance v0, Ljava/io/IOException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Invalid byte order: "; // const-string v2, "Invalid byte order: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.c;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* .line 7 */
} // :cond_2
/* new-instance v0, Ljava/io/EOFException; */
/* invoke-direct {v0}, Ljava/io/EOFException;-><init>()V */
/* throw v0 */
} // .end method
public void reset ( ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Ljava/lang/UnsupportedOperationException; */
final String v1 = "Reset is currently unsupported"; // const-string v1, "Reset is currently unsupported"
/* invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public Integer skipBytes ( Integer p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
/* new-instance p1, Ljava/lang/UnsupportedOperationException; */
final String v0 = "skipBytes is currently unsupported"; // const-string v0, "skipBytes is currently unsupported"
/* invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
