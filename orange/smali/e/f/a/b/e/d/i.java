public abstract class e.f.a.b.e.d.i {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final java.util.logging.Logger a;
	 /* # direct methods */
	 public static e.f.a.b.e.d.i ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* const-class v0, Le/f/a/b/e/d/i; */
		 (( java.lang.Class ) v0 ).getName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;
		 java.util.logging.Logger .getLogger ( v0 );
		 return;
	 } // .end method
	 public static void a ( java.io.InputStream p0 ) {
		 /* .locals 6 */
		 /* .param p0 # Ljava/io/InputStream; */
		 /* .annotation runtime Lorg/checkerframework/checker/nullness/compatqual/NullableDecl; */
	 } // .end annotation
} // .end param
if ( p0 != null) { // if-eqz p0, :cond_0
	 /* .line 1 */
	 try { // :try_start_0
		 /* :try_end_0 */
		 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
		 return;
		 /* :catch_0 */
		 /* move-exception v5 */
		 /* .line 2 */
		 try { // :try_start_1
			 v0 = e.f.a.b.e.d.i.a;
			 v1 = java.util.logging.Level.WARNING;
			 final String v2 = "com.google.common.io.Closeables"; // const-string v2, "com.google.common.io.Closeables"
			 final String v3 = "close"; // const-string v3, "close"
			 final String v4 = "IOException thrown while closing Closeable."; // const-string v4, "IOException thrown while closing Closeable."
			 /* invoke-virtual/range {v0 ..v5}, Ljava/util/logging/Logger;->logp(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V */
			 /* :try_end_1 */
			 /* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_1 */
			 /* :catch_1 */
			 /* move-exception p0 */
			 /* .line 3 */
			 /* new-instance v0, Ljava/lang/AssertionError; */
			 /* invoke-direct {v0, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V */
			 /* throw v0 */
		 } // :cond_0
	 } // :goto_0
	 return;
} // .end method
