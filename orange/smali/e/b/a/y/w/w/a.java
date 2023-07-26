public class e.b.a.y.w.w.a {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public e.b.a.y.w.w.a ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.io.File a ( java.lang.String p0 ) {
		 /* .locals 1 */
		 /* .line 2 */
		 /* new-instance v0, Ljava/io/File; */
		 /* invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
	 } // .end method
	 public Boolean a ( java.io.File p0 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 p1 = 		 (( java.io.File ) p1 ).exists ( ); // invoke-virtual {p1}, Ljava/io/File;->exists()Z
	 } // .end method
	 public Long b ( java.io.File p0 ) {
		 /* .locals 2 */
		 /* .line 1 */
		 (( java.io.File ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/io/File;->length()J
		 /* move-result-wide v0 */
		 /* return-wide v0 */
	 } // .end method
