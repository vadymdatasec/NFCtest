public class e.f.c.l.e.p.f implements e.f.c.l.e.p.a {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # direct methods */
	 public e.f.c.l.e.p.f ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static java.lang.String a ( java.lang.String p0 ) {
		 /* .locals 3 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Ljava/io/IOException; */
		 /* } */
	 } // .end annotation
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 2 */
	 try { // :try_start_0
		 /* new-instance v1, Ljava/io/BufferedInputStream; */
		 /* new-instance v2, Ljava/io/FileInputStream; */
		 /* invoke-direct {v2, p0}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V */
		 /* invoke-direct {v1, v2}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V */
		 /* :try_end_0 */
		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_1 */
		 /* .line 3 */
		 try { // :try_start_1
			 e.f.c.l.e.m.j .a ( v1 );
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
	 } // .end method
	 /* # virtual methods */
	 public java.lang.String a ( java.io.File p0 ) {
		 /* .locals 0 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Ljava/io/IOException; */
		 /* } */
	 } // .end annotation
	 /* .line 1 */
	 (( java.io.File ) p1 ).getPath ( ); // invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;
	 e.f.c.l.e.p.f .a ( p1 );
} // .end method
