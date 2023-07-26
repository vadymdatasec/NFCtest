public class e.f.c.l.e.m.c1 {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final java.lang.String a;
	 public final e.f.c.l.e.r.h b;
	 /* # direct methods */
	 public e.f.c.l.e.m.c1 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.a = p1;
		 /* .line 3 */
		 this.b = p2;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Boolean a ( ) {
		 /* .locals 4 */
		 /* .line 1 */
		 try { // :try_start_0
			 (( e.f.c.l.e.m.c1 ) p0 ).b ( ); // invoke-virtual {p0}, Le/f/c/l/e/m/c1;->b()Ljava/io/File;
			 v0 = 			 (( java.io.File ) v0 ).createNewFile ( ); // invoke-virtual {v0}, Ljava/io/File;->createNewFile()Z
			 /* :try_end_0 */
			 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* :catch_0 */
			 /* move-exception v0 */
			 /* .line 2 */
			 e.f.c.l.e.b .a ( );
			 /* new-instance v2, Ljava/lang/StringBuilder; */
			 /* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
			 final String v3 = "Error creating marker: "; // const-string v3, "Error creating marker: "
			 (( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 v3 = this.a;
			 (( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
			 (( e.f.c.l.e.b ) v1 ).b ( v2, v0 ); // invoke-virtual {v1, v2, v0}, Le/f/c/l/e/b;->b(Ljava/lang/String;Ljava/lang/Throwable;)V
			 int v0 = 0; // const/4 v0, 0x0
		 } // :goto_0
	 } // .end method
	 public final java.io.File b ( ) {
		 /* .locals 3 */
		 /* .line 1 */
		 /* new-instance v0, Ljava/io/File; */
		 v1 = this.b;
		 v2 = this.a;
		 /* invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V */
	 } // .end method
	 public Boolean c ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 (( e.f.c.l.e.m.c1 ) p0 ).b ( ); // invoke-virtual {p0}, Le/f/c/l/e/m/c1;->b()Ljava/io/File;
		 v0 = 		 (( java.io.File ) v0 ).exists ( ); // invoke-virtual {v0}, Ljava/io/File;->exists()Z
	 } // .end method
	 public Boolean d ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 (( e.f.c.l.e.m.c1 ) p0 ).b ( ); // invoke-virtual {p0}, Le/f/c/l/e/m/c1;->b()Ljava/io/File;
		 v0 = 		 (( java.io.File ) v0 ).delete ( ); // invoke-virtual {v0}, Ljava/io/File;->delete()Z
	 } // .end method
