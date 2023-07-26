public class l.b implements l.y {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final l.y b; //synthetic
	 public final l.d c; //synthetic
	 /* # direct methods */
	 public l.b ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.c = p1;
		 this.b = p2;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public l.a0 a ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.c;
	 } // .end method
	 public Long b ( Object p0, Long p1 ) {
		 /* .locals 1 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Ljava/io/IOException; */
		 /* } */
	 } // .end annotation
	 /* .line 1 */
	 v0 = this.c;
	 (( l.d ) v0 ).g ( ); // invoke-virtual {v0}, Ll/d;->g()V
	 /* .line 2 */
	 try { // :try_start_0
		 v0 = this.b;
		 /* move-result-wide p1 */
		 /* :try_end_0 */
		 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
		 int p3 = 1; // const/4 p3, 0x1
		 /* .line 3 */
		 v0 = this.c;
		 (( l.d ) v0 ).a ( p3 ); // invoke-virtual {v0, p3}, Ll/d;->a(Z)V
		 /* return-wide p1 */
		 /* :catchall_0 */
		 /* move-exception p1 */
		 /* :catch_0 */
		 /* move-exception p1 */
		 /* .line 4 */
		 try { // :try_start_1
			 p2 = this.c;
			 (( l.d ) p2 ).a ( p1 ); // invoke-virtual {p2, p1}, Ll/d;->a(Ljava/io/IOException;)Ljava/io/IOException;
			 /* throw p1 */
			 /* :try_end_1 */
			 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
			 /* .line 5 */
		 } // :goto_0
		 p2 = this.c;
		 int p3 = 0; // const/4 p3, 0x0
		 (( l.d ) p2 ).a ( p3 ); // invoke-virtual {p2, p3}, Ll/d;->a(Z)V
		 /* throw p1 */
	 } // .end method
	 public void close ( ) {
		 /* .locals 3 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Ljava/io/IOException; */
		 /* } */
	 } // .end annotation
	 /* .line 1 */
	 try { // :try_start_0
		 v0 = this.b;
		 /* :try_end_0 */
		 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* .line 2 */
		 v1 = this.c;
		 (( l.d ) v1 ).a ( v0 ); // invoke-virtual {v1, v0}, Ll/d;->a(Z)V
		 return;
		 /* :catchall_0 */
		 /* move-exception v0 */
		 /* :catch_0 */
		 /* move-exception v0 */
		 /* .line 3 */
		 try { // :try_start_1
			 v1 = this.c;
			 (( l.d ) v1 ).a ( v0 ); // invoke-virtual {v1, v0}, Ll/d;->a(Ljava/io/IOException;)Ljava/io/IOException;
			 /* throw v0 */
			 /* :try_end_1 */
			 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
			 /* .line 4 */
		 } // :goto_0
		 v1 = this.c;
		 int v2 = 0; // const/4 v2, 0x0
		 (( l.d ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Ll/d;->a(Z)V
		 /* throw v0 */
	 } // .end method
	 public java.lang.String toString ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* new-instance v0, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v1 = "AsyncTimeout.source("; // const-string v1, "AsyncTimeout.source("
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 v1 = this.b;
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
		 final String v1 = ")"; // const-string v1, ")"
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 } // .end method
