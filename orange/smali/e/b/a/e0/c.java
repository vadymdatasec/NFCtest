public abstract class e.b.a.e0.c {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final java.util.concurrent.atomic.AtomicReference a;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/concurrent/atomic/AtomicReference<", */
	 /* "[B>;" */
	 /* } */
} // .end annotation
} // .end field
/* # direct methods */
public static e.b.a.e0.c ( ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Ljava/util/concurrent/atomic/AtomicReference; */
/* invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V */
return;
} // .end method
public static e.b.a.e0.b a ( java.nio.ByteBuffer p0 ) {
/* .locals 3 */
/* .line 31 */
v0 = (( java.nio.ByteBuffer ) p0 ).isReadOnly ( ); // invoke-virtual {p0}, Ljava/nio/ByteBuffer;->isReadOnly()Z
/* if-nez v0, :cond_0 */
v0 = (( java.nio.ByteBuffer ) p0 ).hasArray ( ); // invoke-virtual {p0}, Ljava/nio/ByteBuffer;->hasArray()Z
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 32 */
	 /* new-instance v0, Le/b/a/e0/b; */
	 (( java.nio.ByteBuffer ) p0 ).array ( ); // invoke-virtual {p0}, Ljava/nio/ByteBuffer;->array()[B
	 v2 = 	 (( java.nio.ByteBuffer ) p0 ).arrayOffset ( ); // invoke-virtual {p0}, Ljava/nio/ByteBuffer;->arrayOffset()I
	 p0 = 	 (( java.nio.ByteBuffer ) p0 ).limit ( ); // invoke-virtual {p0}, Ljava/nio/ByteBuffer;->limit()I
	 /* invoke-direct {v0, v1, v2, p0}, Le/b/a/e0/b;-><init>([BII)V */
} // :cond_0
int p0 = 0; // const/4 p0, 0x0
} // .end method
public static java.nio.ByteBuffer a ( java.io.File p0 ) {
/* .locals 8 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
try { // :try_start_0
(( java.io.File ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/io/File;->length()J
/* move-result-wide v5 */
/* const-wide/32 v1, 0x7fffffff */
/* cmp-long v3, v5, v1 */
/* if-gtz v3, :cond_2 */
/* const-wide/16 v1, 0x0 */
/* cmp-long v3, v5, v1 */
if ( v3 != null) { // if-eqz v3, :cond_1
	 /* .line 2 */
	 /* new-instance v7, Ljava/io/RandomAccessFile; */
	 final String v1 = "r"; // const-string v1, "r"
	 /* invoke-direct {v7, p0, v1}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V */
	 /* :try_end_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_1 */
	 /* .line 3 */
	 try { // :try_start_1
		 (( java.io.RandomAccessFile ) v7 ).getChannel ( ); // invoke-virtual {v7}, Ljava/io/RandomAccessFile;->getChannel()Ljava/nio/channels/FileChannel;
		 /* .line 4 */
		 v2 = java.nio.channels.FileChannel$MapMode.READ_ONLY;
		 /* const-wide/16 v3, 0x0 */
		 /* move-object v1, v0 */
		 /* invoke-virtual/range {v1 ..v6}, Ljava/nio/channels/FileChannel;->map(Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer; */
		 (( java.nio.MappedByteBuffer ) p0 ).load ( ); // invoke-virtual {p0}, Ljava/nio/MappedByteBuffer;->load()Ljava/nio/MappedByteBuffer;
		 /* :try_end_1 */
		 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 5 */
			 try { // :try_start_2
				 (( java.nio.channels.FileChannel ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/nio/channels/FileChannel;->close()V
				 /* :try_end_2 */
				 /* .catch Ljava/io/IOException; {:try_start_2 ..:try_end_2} :catch_0 */
				 /* .line 6 */
				 /* :catch_0 */
			 } // :cond_0
			 try { // :try_start_3
				 (( java.io.RandomAccessFile ) v7 ).close ( ); // invoke-virtual {v7}, Ljava/io/RandomAccessFile;->close()V
				 /* :try_end_3 */
				 /* .catch Ljava/io/IOException; {:try_start_3 ..:try_end_3} :catch_1 */
				 /* :catch_1 */
				 /* :catchall_0 */
				 /* move-exception p0 */
				 /* .line 7 */
			 } // :cond_1
			 try { // :try_start_4
				 /* new-instance p0, Ljava/io/IOException; */
				 final String v1 = "File unsuitable for memory mapping"; // const-string v1, "File unsuitable for memory mapping"
				 /* invoke-direct {p0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V */
				 /* throw p0 */
				 /* .line 8 */
			 } // :cond_2
			 /* new-instance p0, Ljava/io/IOException; */
			 final String v1 = "File too large to map into memory"; // const-string v1, "File too large to map into memory"
			 /* invoke-direct {p0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V */
			 /* throw p0 */
			 /* :try_end_4 */
			 /* .catchall {:try_start_4 ..:try_end_4} :catchall_1 */
			 /* :catchall_1 */
			 /* move-exception p0 */
			 /* move-object v7, v0 */
		 } // :goto_0
		 if ( v0 != null) { // if-eqz v0, :cond_3
			 /* .line 9 */
			 try { // :try_start_5
				 (( java.nio.channels.FileChannel ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/nio/channels/FileChannel;->close()V
				 /* :try_end_5 */
				 /* .catch Ljava/io/IOException; {:try_start_5 ..:try_end_5} :catch_2 */
				 /* :catch_2 */
				 /* nop */
			 } // :cond_3
		 } // :goto_1
		 if ( v7 != null) { // if-eqz v7, :cond_4
			 /* .line 10 */
			 try { // :try_start_6
				 (( java.io.RandomAccessFile ) v7 ).close ( ); // invoke-virtual {v7}, Ljava/io/RandomAccessFile;->close()V
				 /* :try_end_6 */
				 /* .catch Ljava/io/IOException; {:try_start_6 ..:try_end_6} :catch_3 */
				 /* .line 11 */
				 /* :catch_3 */
			 } // :cond_4
			 /* throw p0 */
		 } // .end method
		 public static java.nio.ByteBuffer a ( java.io.InputStream p0 ) {
			 /* .locals 4 */
			 /* .annotation system Ldalvik/annotation/Throws; */
			 /* value = { */
			 /* Ljava/io/IOException; */
			 /* } */
		 } // .end annotation
		 /* .line 24 */
		 /* new-instance v0, Ljava/io/ByteArrayOutputStream; */
		 /* const/16 v1, 0x4000 */
		 /* invoke-direct {v0, v1}, Ljava/io/ByteArrayOutputStream;-><init>(I)V */
		 /* .line 25 */
		 v2 = e.b.a.e0.c.a;
		 int v3 = 0; // const/4 v3, 0x0
		 (( java.util.concurrent.atomic.AtomicReference ) v2 ).getAndSet ( v3 ); // invoke-virtual {v2, v3}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;
		 /* check-cast v2, [B */
		 /* if-nez v2, :cond_0 */
		 /* new-array v2, v1, [B */
		 /* .line 26 */
	 } // :cond_0
} // :goto_0
v1 = (( java.io.InputStream ) p0 ).read ( v2 ); // invoke-virtual {p0, v2}, Ljava/io/InputStream;->read([B)I
/* if-ltz v1, :cond_1 */
int v3 = 0; // const/4 v3, 0x0
/* .line 27 */
(( java.io.ByteArrayOutputStream ) v0 ).write ( v2, v3, v1 ); // invoke-virtual {v0, v2, v3, v1}, Ljava/io/ByteArrayOutputStream;->write([BII)V
/* .line 28 */
} // :cond_1
p0 = e.b.a.e0.c.a;
(( java.util.concurrent.atomic.AtomicReference ) p0 ).set ( v2 ); // invoke-virtual {p0, v2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
/* .line 29 */
(( java.io.ByteArrayOutputStream ) v0 ).toByteArray ( ); // invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
/* .line 30 */
/* array-length v0, p0 */
java.nio.ByteBuffer .allocateDirect ( v0 );
(( java.nio.ByteBuffer ) v0 ).put ( p0 ); // invoke-virtual {v0, p0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;
e.b.a.e0.c .b ( p0 );
} // .end method
public static void a ( java.nio.ByteBuffer p0, java.io.File p1 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 12 */
e.b.a.e0.c .b ( p0 );
int v0 = 0; // const/4 v0, 0x0
/* .line 13 */
try { // :try_start_0
/* new-instance v1, Ljava/io/RandomAccessFile; */
final String v2 = "rw"; // const-string v2, "rw"
/* invoke-direct {v1, p1, v2}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_1 */
/* .line 14 */
try { // :try_start_1
(( java.io.RandomAccessFile ) v1 ).getChannel ( ); // invoke-virtual {v1}, Ljava/io/RandomAccessFile;->getChannel()Ljava/nio/channels/FileChannel;
/* .line 15 */
(( java.nio.channels.FileChannel ) v0 ).write ( p0 ); // invoke-virtual {v0, p0}, Ljava/nio/channels/FileChannel;->write(Ljava/nio/ByteBuffer;)I
int p0 = 0; // const/4 p0, 0x0
/* .line 16 */
(( java.nio.channels.FileChannel ) v0 ).force ( p0 ); // invoke-virtual {v0, p0}, Ljava/nio/channels/FileChannel;->force(Z)V
/* .line 17 */
(( java.nio.channels.FileChannel ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/nio/channels/FileChannel;->close()V
/* .line 18 */
(( java.io.RandomAccessFile ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/io/RandomAccessFile;->close()V
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 19 */
	 try { // :try_start_2
		 (( java.nio.channels.FileChannel ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/nio/channels/FileChannel;->close()V
		 /* :try_end_2 */
		 /* .catch Ljava/io/IOException; {:try_start_2 ..:try_end_2} :catch_0 */
		 /* .line 20 */
		 /* :catch_0 */
	 } // :cond_0
	 try { // :try_start_3
		 (( java.io.RandomAccessFile ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/io/RandomAccessFile;->close()V
		 /* :try_end_3 */
		 /* .catch Ljava/io/IOException; {:try_start_3 ..:try_end_3} :catch_1 */
		 /* :catch_1 */
		 return;
		 /* :catchall_0 */
		 /* move-exception p0 */
		 /* :catchall_1 */
		 /* move-exception p0 */
		 /* move-object v1, v0 */
	 } // :goto_0
	 if ( v0 != null) { // if-eqz v0, :cond_1
		 /* .line 21 */
		 try { // :try_start_4
			 (( java.nio.channels.FileChannel ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/nio/channels/FileChannel;->close()V
			 /* :try_end_4 */
			 /* .catch Ljava/io/IOException; {:try_start_4 ..:try_end_4} :catch_2 */
			 /* :catch_2 */
			 /* nop */
		 } // :cond_1
	 } // :goto_1
	 if ( v1 != null) { // if-eqz v1, :cond_2
		 /* .line 22 */
		 try { // :try_start_5
			 (( java.io.RandomAccessFile ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/io/RandomAccessFile;->close()V
			 /* :try_end_5 */
			 /* .catch Ljava/io/IOException; {:try_start_5 ..:try_end_5} :catch_3 */
			 /* .line 23 */
			 /* :catch_3 */
		 } // :cond_2
		 /* throw p0 */
	 } // .end method
	 public static java.nio.ByteBuffer b ( java.nio.ByteBuffer p0 ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 1 */
		 (( java.nio.ByteBuffer ) p0 ).position ( v0 ); // invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;
		 /* check-cast p0, Ljava/nio/ByteBuffer; */
	 } // .end method
	 public static c ( java.nio.ByteBuffer p0 ) {
		 /* .locals 2 */
		 /* .line 1 */
		 e.b.a.e0.c .a ( p0 );
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 2 */
			 /* iget v1, v0, Le/b/a/e0/b;->a:I */
			 /* if-nez v1, :cond_0 */
			 /* iget v1, v0, Le/b/a/e0/b;->b:I */
			 v0 = this.c;
			 /* array-length v0, v0 */
			 /* if-ne v1, v0, :cond_0 */
			 /* .line 3 */
			 (( java.nio.ByteBuffer ) p0 ).array ( ); // invoke-virtual {p0}, Ljava/nio/ByteBuffer;->array()[B
			 /* .line 4 */
		 } // :cond_0
		 (( java.nio.ByteBuffer ) p0 ).asReadOnlyBuffer ( ); // invoke-virtual {p0}, Ljava/nio/ByteBuffer;->asReadOnlyBuffer()Ljava/nio/ByteBuffer;
		 /* .line 5 */
		 v0 = 		 (( java.nio.ByteBuffer ) p0 ).limit ( ); // invoke-virtual {p0}, Ljava/nio/ByteBuffer;->limit()I
		 /* new-array v0, v0, [B */
		 /* .line 6 */
		 e.b.a.e0.c .b ( p0 );
		 /* .line 7 */
		 (( java.nio.ByteBuffer ) p0 ).get ( v0 ); // invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;
		 /* move-object p0, v0 */
	 } // :goto_0
} // .end method
public static java.io.InputStream d ( java.nio.ByteBuffer p0 ) {
	 /* .locals 1 */
	 /* .line 1 */
	 /* new-instance v0, Le/b/a/e0/a; */
	 /* invoke-direct {v0, p0}, Le/b/a/e0/a;-><init>(Ljava/nio/ByteBuffer;)V */
} // .end method
