public abstract class e.b.a.w.i {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final java.nio.charset.Charset a;
	 /* # direct methods */
	 public static e.b.a.w.i ( ) {
		 /* .locals 1 */
		 final String v0 = "US-ASCII"; // const-string v0, "US-ASCII"
		 /* .line 1 */
		 java.nio.charset.Charset .forName ( v0 );
		 final String v0 = "UTF-8"; // const-string v0, "UTF-8"
		 /* .line 2 */
		 java.nio.charset.Charset .forName ( v0 );
		 return;
	 } // .end method
	 public static void a ( java.io.Closeable p0 ) {
		 /* .locals 0 */
		 if ( p0 != null) { // if-eqz p0, :cond_0
			 /* .line 8 */
			 try { // :try_start_0
				 /* :try_end_0 */
				 /* .catch Ljava/lang/RuntimeException; {:try_start_0 ..:try_end_0} :catch_0 */
				 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_1 */
				 /* :catch_0 */
				 /* move-exception p0 */
				 /* .line 9 */
				 /* throw p0 */
				 /* :catch_1 */
			 } // :cond_0
		 } // :goto_0
		 return;
	 } // .end method
	 public static void a ( java.io.File p0 ) {
		 /* .locals 4 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Ljava/io/IOException; */
		 /* } */
	 } // .end annotation
	 /* .line 1 */
	 (( java.io.File ) p0 ).listFiles ( ); // invoke-virtual {p0}, Ljava/io/File;->listFiles()[Ljava/io/File;
	 if ( v0 != null) { // if-eqz v0, :cond_3
		 /* .line 2 */
		 /* array-length p0, v0 */
		 int v1 = 0; // const/4 v1, 0x0
	 } // :goto_0
	 /* if-ge v1, p0, :cond_2 */
	 /* aget-object v2, v0, v1 */
	 /* .line 3 */
	 v3 = 	 (( java.io.File ) v2 ).isDirectory ( ); // invoke-virtual {v2}, Ljava/io/File;->isDirectory()Z
	 if ( v3 != null) { // if-eqz v3, :cond_0
		 /* .line 4 */
		 e.b.a.w.i .a ( v2 );
		 /* .line 5 */
	 } // :cond_0
	 v3 = 	 (( java.io.File ) v2 ).delete ( ); // invoke-virtual {v2}, Ljava/io/File;->delete()Z
	 if ( v3 != null) { // if-eqz v3, :cond_1
		 /* add-int/lit8 v1, v1, 0x1 */
		 /* .line 6 */
	 } // :cond_1
	 /* new-instance p0, Ljava/io/IOException; */
	 /* new-instance v0, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
	 final String v1 = "failed to delete file: "; // const-string v1, "failed to delete file: "
	 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 /* invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V */
	 /* throw p0 */
} // :cond_2
return;
/* .line 7 */
} // :cond_3
/* new-instance v0, Ljava/io/IOException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "not a readable directory: "; // const-string v2, "not a readable directory: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
