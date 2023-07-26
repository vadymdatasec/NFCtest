public abstract class c.h.g.q {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static java.io.File a ( android.content.Context p0 ) {
		 /* .locals 5 */
		 /* .line 1 */
		 (( android.content.Context ) p0 ).getCacheDir ( ); // invoke-virtual {p0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;
		 int v0 = 0; // const/4 v0, 0x0
		 /* if-nez p0, :cond_0 */
		 /* .line 2 */
	 } // :cond_0
	 /* new-instance v1, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
	 final String v2 = ".font"; // const-string v2, ".font"
	 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 v2 = 	 android.os.Process .myPid ( );
	 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
	 final String v2 = "-"; // const-string v2, "-"
	 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 v3 = 	 android.os.Process .myTid ( );
	 (( java.lang.StringBuilder ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* const/16 v3, 0x64 */
/* if-ge v2, v3, :cond_2 */
/* .line 3 */
/* new-instance v3, Ljava/io/File; */
/* new-instance v4, Ljava/lang/StringBuilder; */
/* invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v4 ).append ( v1 ); // invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).append ( v2 ); // invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v3, p0, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V */
/* .line 4 */
try { // :try_start_0
	 v4 = 	 (( java.io.File ) v3 ).createNewFile ( ); // invoke-virtual {v3}, Ljava/io/File;->createNewFile()Z
	 /* :try_end_0 */
	 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
	 if ( v4 != null) { // if-eqz v4, :cond_1
		 /* :catch_0 */
	 } // :cond_1
	 /* add-int/lit8 v2, v2, 0x1 */
} // :cond_2
} // .end method
public static java.nio.ByteBuffer a ( android.content.Context p0, android.content.res.Resources p1, Integer p2 ) {
/* .locals 1 */
/* .line 22 */
c.h.g.q .a ( p0 );
int v0 = 0; // const/4 v0, 0x0
/* if-nez p0, :cond_0 */
/* .line 23 */
} // :cond_0
try { // :try_start_0
p1 = c.h.g.q .a ( p0,p1,p2 );
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* if-nez p1, :cond_1 */
/* .line 24 */
(( java.io.File ) p0 ).delete ( ); // invoke-virtual {p0}, Ljava/io/File;->delete()Z
/* .line 25 */
} // :cond_1
try { // :try_start_1
c.h.g.q .a ( p0 );
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 26 */
(( java.io.File ) p0 ).delete ( ); // invoke-virtual {p0}, Ljava/io/File;->delete()Z
/* :catchall_0 */
/* move-exception p1 */
(( java.io.File ) p0 ).delete ( ); // invoke-virtual {p0}, Ljava/io/File;->delete()Z
/* .line 27 */
/* throw p1 */
} // .end method
public static java.nio.ByteBuffer a ( android.content.Context p0, android.os.CancellationSignal p1, android.net.Uri p2 ) {
/* .locals 7 */
/* .line 11 */
(( android.content.Context ) p0 ).getContentResolver ( ); // invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;
int v0 = 0; // const/4 v0, 0x0
try { // :try_start_0
	 final String v1 = "r"; // const-string v1, "r"
	 /* .line 12 */
	 (( android.content.ContentResolver ) p0 ).openFileDescriptor ( p2, v1, p1 ); // invoke-virtual {p0, p2, v1, p1}, Landroid/content/ContentResolver;->openFileDescriptor(Landroid/net/Uri;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/os/ParcelFileDescriptor;
	 /* if-nez p0, :cond_1 */
	 if ( p0 != null) { // if-eqz p0, :cond_0
		 /* .line 13 */
		 (( android.os.ParcelFileDescriptor ) p0 ).close ( ); // invoke-virtual {p0}, Landroid/os/ParcelFileDescriptor;->close()V
		 /* :try_end_0 */
		 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
	 } // :cond_0
	 /* .line 14 */
} // :cond_1
try { // :try_start_1
	 /* new-instance p1, Ljava/io/FileInputStream; */
	 (( android.os.ParcelFileDescriptor ) p0 ).getFileDescriptor ( ); // invoke-virtual {p0}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;
	 /* invoke-direct {p1, p2}, Ljava/io/FileInputStream;-><init>(Ljava/io/FileDescriptor;)V */
	 /* :try_end_1 */
	 /* .catchall {:try_start_1 ..:try_end_1} :catchall_2 */
	 /* .line 15 */
	 try { // :try_start_2
		 (( java.io.FileInputStream ) p1 ).getChannel ( ); // invoke-virtual {p1}, Ljava/io/FileInputStream;->getChannel()Ljava/nio/channels/FileChannel;
		 /* .line 16 */
		 (( java.nio.channels.FileChannel ) v1 ).size ( ); // invoke-virtual {v1}, Ljava/nio/channels/FileChannel;->size()J
		 /* move-result-wide v5 */
		 /* .line 17 */
		 v2 = java.nio.channels.FileChannel$MapMode.READ_ONLY;
		 /* const-wide/16 v3, 0x0 */
		 /* invoke-virtual/range {v1 ..v6}, Ljava/nio/channels/FileChannel;->map(Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer; */
		 /* :try_end_2 */
		 /* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
		 /* .line 18 */
		 try { // :try_start_3
			 (( java.io.FileInputStream ) p1 ).close ( ); // invoke-virtual {p1}, Ljava/io/FileInputStream;->close()V
			 /* :try_end_3 */
			 /* .catchall {:try_start_3 ..:try_end_3} :catchall_2 */
			 if ( p0 != null) { // if-eqz p0, :cond_2
				 /* .line 19 */
				 try { // :try_start_4
					 (( android.os.ParcelFileDescriptor ) p0 ).close ( ); // invoke-virtual {p0}, Landroid/os/ParcelFileDescriptor;->close()V
					 /* :try_end_4 */
					 /* .catch Ljava/io/IOException; {:try_start_4 ..:try_end_4} :catch_0 */
				 } // :cond_2
				 /* :catchall_0 */
				 /* move-exception p2 */
				 /* .line 20 */
				 try { // :try_start_5
					 (( java.io.FileInputStream ) p1 ).close ( ); // invoke-virtual {p1}, Ljava/io/FileInputStream;->close()V
					 /* :try_end_5 */
					 /* .catchall {:try_start_5 ..:try_end_5} :catchall_1 */
					 /* :catchall_1 */
					 /* move-exception p1 */
					 try { // :try_start_6
						 (( java.lang.Throwable ) p2 ).addSuppressed ( p1 ); // invoke-virtual {p2, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V
					 } // :goto_0
					 /* throw p2 */
					 /* :try_end_6 */
					 /* .catchall {:try_start_6 ..:try_end_6} :catchall_2 */
					 /* :catchall_2 */
					 /* move-exception p1 */
					 if ( p0 != null) { // if-eqz p0, :cond_3
						 /* .line 21 */
						 try { // :try_start_7
							 (( android.os.ParcelFileDescriptor ) p0 ).close ( ); // invoke-virtual {p0}, Landroid/os/ParcelFileDescriptor;->close()V
							 /* :try_end_7 */
							 /* .catchall {:try_start_7 ..:try_end_7} :catchall_3 */
							 /* :catchall_3 */
							 /* move-exception p0 */
							 try { // :try_start_8
								 (( java.lang.Throwable ) p1 ).addSuppressed ( p0 ); // invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V
							 } // :cond_3
						 } // :goto_1
						 /* throw p1 */
						 /* :try_end_8 */
						 /* .catch Ljava/io/IOException; {:try_start_8 ..:try_end_8} :catch_0 */
						 /* :catch_0 */
					 } // .end method
					 public static java.nio.ByteBuffer a ( java.io.File p0 ) {
						 /* .locals 7 */
						 /* .line 5 */
						 try { // :try_start_0
							 /* new-instance v0, Ljava/io/FileInputStream; */
							 /* invoke-direct {v0, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V */
							 /* :try_end_0 */
							 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
							 /* .line 6 */
							 try { // :try_start_1
								 (( java.io.FileInputStream ) v0 ).getChannel ( ); // invoke-virtual {v0}, Ljava/io/FileInputStream;->getChannel()Ljava/nio/channels/FileChannel;
								 /* .line 7 */
								 (( java.nio.channels.FileChannel ) v1 ).size ( ); // invoke-virtual {v1}, Ljava/nio/channels/FileChannel;->size()J
								 /* move-result-wide v5 */
								 /* .line 8 */
								 v2 = java.nio.channels.FileChannel$MapMode.READ_ONLY;
								 /* const-wide/16 v3, 0x0 */
								 /* invoke-virtual/range {v1 ..v6}, Ljava/nio/channels/FileChannel;->map(Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer; */
								 /* :try_end_1 */
								 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
								 /* .line 9 */
								 try { // :try_start_2
									 (( java.io.FileInputStream ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/io/FileInputStream;->close()V
									 /* :try_end_2 */
									 /* .catch Ljava/io/IOException; {:try_start_2 ..:try_end_2} :catch_0 */
									 /* :catchall_0 */
									 /* move-exception p0 */
									 /* .line 10 */
									 try { // :try_start_3
										 (( java.io.FileInputStream ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/io/FileInputStream;->close()V
										 /* :try_end_3 */
										 /* .catchall {:try_start_3 ..:try_end_3} :catchall_1 */
										 /* :catchall_1 */
										 /* move-exception v0 */
										 try { // :try_start_4
											 (( java.lang.Throwable ) p0 ).addSuppressed ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V
										 } // :goto_0
										 /* throw p0 */
										 /* :try_end_4 */
										 /* .catch Ljava/io/IOException; {:try_start_4 ..:try_end_4} :catch_0 */
										 /* :catch_0 */
										 int p0 = 0; // const/4 p0, 0x0
									 } // .end method
									 public static java.util.Map a ( android.content.Context p0, Object[] p1, android.os.CancellationSignal p2 ) {
										 /* .locals 5 */
										 /* .annotation system Ldalvik/annotation/Signature; */
										 /* value = { */
										 /* "(", */
										 /* "Landroid/content/Context;", */
										 /* "[", */
										 /* "Lc/h/k/o;", */
										 /* "Landroid/os/CancellationSignal;", */
										 /* ")", */
										 /* "Ljava/util/Map<", */
										 /* "Landroid/net/Uri;", */
										 /* "Ljava/nio/ByteBuffer;", */
										 /* ">;" */
										 /* } */
									 } // .end annotation
									 /* .line 45 */
									 /* new-instance v0, Ljava/util/HashMap; */
									 /* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
									 /* .line 46 */
									 /* array-length v1, p1 */
									 int v2 = 0; // const/4 v2, 0x0
								 } // :goto_0
								 /* if-ge v2, v1, :cond_2 */
								 /* aget-object v3, p1, v2 */
								 /* .line 47 */
								 v4 = 								 (( c.h.k.o ) v3 ).a ( ); // invoke-virtual {v3}, Lc/h/k/o;->a()I
								 if ( v4 != null) { // if-eqz v4, :cond_0
									 /* .line 48 */
								 } // :cond_0
								 (( c.h.k.o ) v3 ).c ( ); // invoke-virtual {v3}, Lc/h/k/o;->c()Landroid/net/Uri;
								 /* .line 49 */
								 v4 = 								 (( java.util.HashMap ) v0 ).containsKey ( v3 ); // invoke-virtual {v0, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z
								 if ( v4 != null) { // if-eqz v4, :cond_1
									 /* .line 50 */
								 } // :cond_1
								 c.h.g.q .a ( p0,p2,v3 );
								 /* .line 51 */
								 (( java.util.HashMap ) v0 ).put ( v3, v4 ); // invoke-virtual {v0, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
							 } // :goto_1
							 /* add-int/lit8 v2, v2, 0x1 */
							 /* .line 52 */
						 } // :cond_2
						 java.util.Collections .unmodifiableMap ( v0 );
					 } // .end method
					 public static void a ( java.io.Closeable p0 ) {
						 /* .locals 0 */
						 if ( p0 != null) { // if-eqz p0, :cond_0
							 /* .line 44 */
							 try { // :try_start_0
								 /* :try_end_0 */
								 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
								 /* :catch_0 */
							 } // :cond_0
							 return;
						 } // .end method
						 public static Boolean a ( java.io.File p0, android.content.res.Resources p1, Integer p2 ) {
							 /* .locals 0 */
							 /* .line 40 */
							 try { // :try_start_0
								 (( android.content.res.Resources ) p1 ).openRawResource ( p2 ); // invoke-virtual {p1, p2}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;
								 /* :try_end_0 */
								 /* .catchall {:try_start_0 ..:try_end_0} :catchall_1 */
								 /* .line 41 */
								 try { // :try_start_1
									 p0 = 									 c.h.g.q .a ( p0,p1 );
									 /* :try_end_1 */
									 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
									 /* .line 42 */
									 c.h.g.q .a ( p1 );
									 /* :catchall_0 */
									 /* move-exception p0 */
									 /* :catchall_1 */
									 /* move-exception p0 */
									 int p1 = 0; // const/4 p1, 0x0
								 } // :goto_0
								 c.h.g.q .a ( p1 );
								 /* .line 43 */
								 /* throw p0 */
							 } // .end method
							 public static Boolean a ( java.io.File p0, java.io.InputStream p1 ) {
								 /* .locals 5 */
								 /* .line 28 */
								 android.os.StrictMode .allowThreadDiskWrites ( );
								 int v1 = 0; // const/4 v1, 0x0
								 int v2 = 0; // const/4 v2, 0x0
								 /* .line 29 */
								 try { // :try_start_0
									 /* new-instance v3, Ljava/io/FileOutputStream; */
									 /* invoke-direct {v3, p0, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V */
									 /* :try_end_0 */
									 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_1 */
									 /* .catchall {:try_start_0 ..:try_end_0} :catchall_1 */
									 /* const/16 p0, 0x400 */
									 try { // :try_start_1
										 /* new-array p0, p0, [B */
										 /* .line 30 */
									 } // :goto_0
									 v2 = 									 (( java.io.InputStream ) p1 ).read ( p0 ); // invoke-virtual {p1, p0}, Ljava/io/InputStream;->read([B)I
									 int v4 = -1; // const/4 v4, -0x1
									 /* if-eq v2, v4, :cond_0 */
									 /* .line 31 */
									 (( java.io.FileOutputStream ) v3 ).write ( p0, v1, v2 ); // invoke-virtual {v3, p0, v1, v2}, Ljava/io/FileOutputStream;->write([BII)V
									 /* :try_end_1 */
									 /* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_0 */
									 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
								 } // :cond_0
								 int p0 = 1; // const/4 p0, 0x1
								 /* .line 32 */
								 c.h.g.q .a ( v3 );
								 /* .line 33 */
								 android.os.StrictMode .setThreadPolicy ( v0 );
								 /* :catchall_0 */
								 /* move-exception p0 */
								 /* move-object v2, v3 */
								 /* :catch_0 */
								 /* move-exception p0 */
								 /* move-object v2, v3 */
								 /* :catchall_1 */
								 /* move-exception p0 */
								 /* :catch_1 */
								 /* move-exception p0 */
							 } // :goto_1
							 try { // :try_start_2
								 final String p1 = "TypefaceCompatUtil"; // const-string p1, "TypefaceCompatUtil"
								 /* .line 34 */
								 /* new-instance v3, Ljava/lang/StringBuilder; */
								 /* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
								 final String v4 = "Error copying resource contents to temp file: "; // const-string v4, "Error copying resource contents to temp file: "
								 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
								 (( java.io.IOException ) p0 ).getMessage ( ); // invoke-virtual {p0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;
								 (( java.lang.StringBuilder ) v3 ).append ( p0 ); // invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
								 (( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
								 android.util.Log .e ( p1,p0 );
								 /* :try_end_2 */
								 /* .catchall {:try_start_2 ..:try_end_2} :catchall_1 */
								 /* .line 35 */
								 c.h.g.q .a ( v2 );
								 /* .line 36 */
								 android.os.StrictMode .setThreadPolicy ( v0 );
								 /* .line 37 */
							 } // :goto_2
							 c.h.g.q .a ( v2 );
							 /* .line 38 */
							 android.os.StrictMode .setThreadPolicy ( v0 );
							 /* .line 39 */
							 /* throw p0 */
						 } // .end method
