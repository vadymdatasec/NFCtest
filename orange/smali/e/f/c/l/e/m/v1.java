public abstract class e.f.c.l.e.m.v1 {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static void a ( java.io.File p0, java.util.List p1 ) {
		 /* .locals 3 */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "(", */
		 /* "Ljava/io/File;", */
		 /* "Ljava/util/List<", */
		 /* "Le/f/c/l/e/m/u1;", */
		 /* ">;)V" */
		 /* } */
	 } // .end annotation
	 /* .line 1 */
v0 = } // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_1
	 /* check-cast v0, Le/f/c/l/e/m/u1; */
	 int v1 = 0; // const/4 v1, 0x0
	 /* .line 2 */
	 try { // :try_start_0
		 /* :try_end_0 */
		 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
		 /* if-nez v1, :cond_0 */
		 /* .line 3 */
		 /* :catch_0 */
	 } // :goto_1
	 e.f.c.l.e.m.j .a ( v1 );
	 /* .line 4 */
} // :cond_0
try { // :try_start_1
	 /* new-instance v2, Ljava/io/File; */
	 /* .line 5 */
	 /* invoke-direct {v2, p0, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V */
	 /* .line 6 */
	 e.f.c.l.e.m.v1 .a ( v1,v2 );
	 /* :try_end_1 */
	 /* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_0 */
	 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
	 /* :catchall_0 */
	 /* move-exception p0 */
	 /* .line 7 */
	 e.f.c.l.e.m.j .a ( v1 );
	 /* .line 8 */
	 /* throw p0 */
} // :cond_1
return;
} // .end method
public static void a ( java.io.InputStream p0, java.io.File p1 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* if-nez p0, :cond_0 */
return;
} // :cond_0
/* const/16 v0, 0x2000 */
/* new-array v0, v0, [B */
int v1 = 0; // const/4 v1, 0x0
/* .line 9 */
try { // :try_start_0
/* new-instance v2, Ljava/util/zip/GZIPOutputStream; */
/* new-instance v3, Ljava/io/FileOutputStream; */
/* invoke-direct {v3, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V */
/* invoke-direct {v2, v3}, Ljava/util/zip/GZIPOutputStream;-><init>(Ljava/io/OutputStream;)V */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_1 */
/* .line 10 */
} // :goto_0
try { // :try_start_1
p1 = (( java.io.InputStream ) p0 ).read ( v0 ); // invoke-virtual {p0, v0}, Ljava/io/InputStream;->read([B)I
/* if-lez p1, :cond_1 */
int v1 = 0; // const/4 v1, 0x0
/* .line 11 */
(( java.util.zip.GZIPOutputStream ) v2 ).write ( v0, v1, p1 ); // invoke-virtual {v2, v0, v1, p1}, Ljava/util/zip/GZIPOutputStream;->write([BII)V
/* .line 12 */
} // :cond_1
(( java.util.zip.GZIPOutputStream ) v2 ).finish ( ); // invoke-virtual {v2}, Ljava/util/zip/GZIPOutputStream;->finish()V
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 13 */
e.f.c.l.e.m.j .a ( v2 );
return;
/* :catchall_0 */
/* move-exception p0 */
/* move-object v1, v2 */
/* :catchall_1 */
/* move-exception p0 */
} // :goto_1
e.f.c.l.e.m.j .a ( v1 );
/* .line 14 */
/* throw p0 */
} // .end method
