public abstract class e.f.c.l.e.p.c {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static a ( java.io.File p0, android.content.Context p1 ) {
		 /* .locals 3 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Ljava/io/IOException; */
		 /* } */
	 } // .end annotation
	 if ( p0 != null) { // if-eqz p0, :cond_1
		 /* .line 1 */
		 v0 = 		 (( java.io.File ) p0 ).exists ( ); // invoke-virtual {p0}, Ljava/io/File;->exists()Z
		 /* if-nez v0, :cond_0 */
	 } // :cond_0
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 2 */
	 try { // :try_start_0
		 /* new-instance v1, Ljava/io/BufferedReader; */
		 /* new-instance v2, Ljava/io/FileReader; */
		 /* invoke-direct {v2, p0}, Ljava/io/FileReader;-><init>(Ljava/io/File;)V */
		 /* invoke-direct {v1, v2}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V */
		 /* :try_end_0 */
		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_1 */
		 /* .line 3 */
		 try { // :try_start_1
			 /* new-instance p0, Le/f/c/l/e/p/b; */
			 /* new-instance v0, Le/f/c/l/e/p/f; */
			 /* invoke-direct {v0}, Le/f/c/l/e/p/f;-><init>()V */
			 /* invoke-direct {p0, p1, v0}, Le/f/c/l/e/p/b;-><init>(Landroid/content/Context;Le/f/c/l/e/p/a;)V */
			 (( e.f.c.l.e.p.b ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Le/f/c/l/e/p/b;->a(Ljava/io/BufferedReader;)[B
			 /* :try_end_1 */
			 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
			 /* .line 4 */
			 e.f.c.l.e.m.j .a ( v1 );
			 /* :catchall_0 */
			 /* move-exception p0 */
			 /* move-object v0, v1 */
			 /* :catchall_1 */
			 /* move-exception p0 */
		 } // :goto_0
		 e.f.c.l.e.m.j .a ( v0 );
		 /* .line 5 */
		 /* throw p0 */
	 } // :cond_1
} // :goto_1
int p0 = 0; // const/4 p0, 0x0
/* new-array p0, p0, [B */
} // .end method
