public class e.f.c.s.d {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final java.nio.channels.FileChannel a;
	 public final java.nio.channels.FileLock b;
	 /* # direct methods */
	 public e.f.c.s.d ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.a = p1;
		 /* .line 3 */
		 this.b = p2;
		 return;
	 } // .end method
	 public static e.f.c.s.d a ( android.content.Context p0, java.lang.String p1 ) {
		 /* .locals 4 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 1 */
		 try { // :try_start_0
			 /* new-instance v1, Ljava/io/File; */
			 (( android.content.Context ) p0 ).getFilesDir ( ); // invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;
			 /* invoke-direct {v1, p0, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V */
			 /* .line 2 */
			 /* new-instance p0, Ljava/io/RandomAccessFile; */
			 final String p1 = "rw"; // const-string p1, "rw"
			 /* invoke-direct {p0, v1, p1}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V */
			 (( java.io.RandomAccessFile ) p0 ).getChannel ( ); // invoke-virtual {p0}, Ljava/io/RandomAccessFile;->getChannel()Ljava/nio/channels/FileChannel;
			 /* :try_end_0 */
			 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_5 */
			 /* .catch Ljava/lang/Error; {:try_start_0 ..:try_end_0} :catch_4 */
			 /* .line 3 */
			 try { // :try_start_1
				 (( java.nio.channels.FileChannel ) p0 ).lock ( ); // invoke-virtual {p0}, Ljava/nio/channels/FileChannel;->lock()Ljava/nio/channels/FileLock;
				 /* :try_end_1 */
				 /* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_3 */
				 /* .catch Ljava/lang/Error; {:try_start_1 ..:try_end_1} :catch_2 */
				 /* .line 4 */
				 try { // :try_start_2
					 /* new-instance v1, Le/f/c/s/d; */
					 /* invoke-direct {v1, p0, p1}, Le/f/c/s/d;-><init>(Ljava/nio/channels/FileChannel;Ljava/nio/channels/FileLock;)V */
					 /* :try_end_2 */
					 /* .catch Ljava/io/IOException; {:try_start_2 ..:try_end_2} :catch_1 */
					 /* .catch Ljava/lang/Error; {:try_start_2 ..:try_end_2} :catch_0 */
					 /* :catch_0 */
					 /* move-exception v1 */
					 /* :catch_1 */
					 /* move-exception v1 */
					 /* :catch_2 */
					 /* move-exception v1 */
					 /* :catch_3 */
					 /* move-exception v1 */
				 } // :goto_0
				 /* move-object p1, v0 */
				 /* :catch_4 */
				 /* move-exception v1 */
				 /* :catch_5 */
				 /* move-exception v1 */
			 } // :goto_1
			 /* move-object p0, v0 */
			 /* move-object p1, p0 */
		 } // :goto_2
		 final String v2 = "CrossProcessLock"; // const-string v2, "CrossProcessLock"
		 final String v3 = "encountered error while creating and acquiring the lock, ignoring"; // const-string v3, "encountered error while creating and acquiring the lock, ignoring"
		 /* .line 5 */
		 android.util.Log .e ( v2,v3,v1 );
		 if ( p1 != null) { // if-eqz p1, :cond_0
			 /* .line 6 */
			 try { // :try_start_3
				 (( java.nio.channels.FileLock ) p1 ).release ( ); // invoke-virtual {p1}, Ljava/nio/channels/FileLock;->release()V
				 /* :try_end_3 */
				 /* .catch Ljava/io/IOException; {:try_start_3 ..:try_end_3} :catch_6 */
				 /* :catch_6 */
				 /* nop */
			 } // :cond_0
		 } // :goto_3
		 if ( p0 != null) { // if-eqz p0, :cond_1
			 /* .line 7 */
			 try { // :try_start_4
				 (( java.nio.channels.FileChannel ) p0 ).close ( ); // invoke-virtual {p0}, Ljava/nio/channels/FileChannel;->close()V
				 /* :try_end_4 */
				 /* .catch Ljava/io/IOException; {:try_start_4 ..:try_end_4} :catch_7 */
				 /* :catch_7 */
			 } // :cond_1
		 } // .end method
		 /* # virtual methods */
		 public void a ( ) {
			 /* .locals 3 */
			 /* .line 8 */
			 try { // :try_start_0
				 v0 = this.b;
				 (( java.nio.channels.FileLock ) v0 ).release ( ); // invoke-virtual {v0}, Ljava/nio/channels/FileLock;->release()V
				 /* .line 9 */
				 v0 = this.a;
				 (( java.nio.channels.FileChannel ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/nio/channels/FileChannel;->close()V
				 /* :try_end_0 */
				 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
				 /* :catch_0 */
				 /* move-exception v0 */
				 final String v1 = "CrossProcessLock"; // const-string v1, "CrossProcessLock"
				 final String v2 = "encountered error while releasing, ignoring"; // const-string v2, "encountered error while releasing, ignoring"
				 /* .line 10 */
				 android.util.Log .e ( v1,v2,v0 );
			 } // :goto_0
			 return;
		 } // .end method
