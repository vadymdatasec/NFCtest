public abstract class m.a.a.c.f.c {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static m.a.a.c.f.c ( ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 public static java.lang.String a ( java.lang.Throwable p0 ) {
		 /* .locals 3 */
		 /* .line 1 */
		 /* new-instance v0, Ljava/io/StringWriter; */
		 /* invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V */
		 /* .line 2 */
		 /* new-instance v1, Ljava/io/PrintWriter; */
		 int v2 = 1; // const/4 v2, 0x1
		 /* invoke-direct {v1, v0, v2}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;Z)V */
		 /* .line 3 */
		 (( java.lang.Throwable ) p0 ).printStackTrace ( v1 ); // invoke-virtual {p0, v1}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintWriter;)V
		 /* .line 4 */
		 (( java.io.StringWriter ) v0 ).getBuffer ( ); // invoke-virtual {v0}, Ljava/io/StringWriter;->getBuffer()Ljava/lang/StringBuffer;
		 (( java.lang.StringBuffer ) p0 ).toString ( ); // invoke-virtual {p0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
	 } // .end method
