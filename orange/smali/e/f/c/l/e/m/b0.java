public class e.f.c.l.e.m.b0 implements java.io.FilenameFilter {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # direct methods */
	 public e.f.c.l.e.m.b0 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Boolean accept ( java.io.File p0, java.lang.String p1 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 p1 = 		 (( java.lang.String ) p2 ).length ( ); // invoke-virtual {p2}, Ljava/lang/String;->length()I
		 /* const/16 v0, 0x27 */
		 /* if-ne p1, v0, :cond_0 */
		 final String p1 = ".cls"; // const-string p1, ".cls"
		 /* .line 2 */
		 p1 = 		 (( java.lang.String ) p2 ).endsWith ( p1 ); // invoke-virtual {p2, p1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
		 if ( p1 != null) { // if-eqz p1, :cond_0
			 int p1 = 1; // const/4 p1, 0x1
		 } // :cond_0
		 int p1 = 0; // const/4 p1, 0x0
	 } // :goto_0
} // .end method
