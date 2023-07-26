public abstract class e.b.a.y.x.h1.m {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static Integer a ( ) {
		 /* .locals 3 */
		 /* .line 1 */
		 java.lang.Runtime .getRuntime ( );
		 v0 = 		 (( java.lang.Runtime ) v0 ).availableProcessors ( ); // invoke-virtual {v0}, Ljava/lang/Runtime;->availableProcessors()I
		 /* .line 2 */
		 /* const/16 v2, 0x11 */
		 /* if-ge v1, v2, :cond_0 */
		 /* .line 3 */
		 v1 = 		 e.b.a.y.x.h1.m .b ( );
		 v0 = 		 java.lang.Math .max ( v1,v0 );
	 } // :cond_0
} // .end method
public static Integer b ( ) {
	 /* .locals 5 */
	 final String v0 = "GlideRuntimeCompat"; // const-string v0, "GlideRuntimeCompat"
	 /* .line 1 */
	 android.os.StrictMode .allowThreadDiskReads ( );
	 /* .line 2 */
	 try { // :try_start_0
		 /* new-instance v2, Ljava/io/File; */
		 final String v3 = "/sys/devices/system/cpu/"; // const-string v3, "/sys/devices/system/cpu/"
		 /* invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
		 final String v3 = "cpu[0-9]+"; // const-string v3, "cpu[0-9]+"
		 /* .line 3 */
		 java.util.regex.Pattern .compile ( v3 );
		 /* .line 4 */
		 /* new-instance v4, Le/b/a/y/x/h1/l; */
		 /* invoke-direct {v4, v3}, Le/b/a/y/x/h1/l;-><init>(Ljava/util/regex/Pattern;)V */
		 /* .line 5 */
		 (( java.io.File ) v2 ).listFiles ( v4 ); // invoke-virtual {v2, v4}, Ljava/io/File;->listFiles(Ljava/io/FilenameFilter;)[Ljava/io/File;
		 /* :try_end_0 */
		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
		 /* .line 6 */
		 android.os.StrictMode .setThreadPolicy ( v1 );
		 /* :catchall_0 */
		 /* move-exception v2 */
		 int v3 = 6; // const/4 v3, 0x6
		 /* .line 7 */
		 try { // :try_start_1
			 v3 = 			 android.util.Log .isLoggable ( v0,v3 );
			 if ( v3 != null) { // if-eqz v3, :cond_0
				 final String v3 = "Failed to calculate accurate cpu count"; // const-string v3, "Failed to calculate accurate cpu count"
				 /* .line 8 */
				 android.util.Log .e ( v0,v3,v2 );
				 /* :try_end_1 */
				 /* .catchall {:try_start_1 ..:try_end_1} :catchall_1 */
				 /* .line 9 */
			 } // :cond_0
			 android.os.StrictMode .setThreadPolicy ( v1 );
			 int v0 = 0; // const/4 v0, 0x0
		 } // :goto_0
		 int v1 = 1; // const/4 v1, 0x1
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 /* .line 10 */
			 /* array-length v0, v0 */
		 } // :cond_1
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_1
	 v0 = 	 java.lang.Math .max ( v1,v0 );
	 /* :catchall_1 */
	 /* move-exception v0 */
	 /* .line 11 */
	 android.os.StrictMode .setThreadPolicy ( v1 );
	 /* .line 12 */
	 /* throw v0 */
} // .end method
