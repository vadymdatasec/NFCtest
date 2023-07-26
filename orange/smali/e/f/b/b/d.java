public abstract class e.f.b.b.d {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static Integer a ( Integer p0 ) {
		 /* .locals 4 */
		 /* int-to-long v0, p0 */
		 /* const-wide/32 v2, -0x3361d2af */
		 /* mul-long v0, v0, v2 */
		 /* long-to-int p0, v0 */
		 /* const/16 v0, 0xf */
		 /* .line 1 */
		 p0 = 		 java.lang.Integer .rotateLeft ( p0,v0 );
		 /* int-to-long v0, p0 */
		 /* const-wide/32 v2, 0x1b873593 */
		 /* mul-long v0, v0, v2 */
		 /* long-to-int p0, v0 */
	 } // .end method
	 public static Integer a ( java.lang.Object p0 ) {
		 /* .locals 0 */
		 /* if-nez p0, :cond_0 */
		 int p0 = 0; // const/4 p0, 0x0
		 /* .line 2 */
	 } // :cond_0
	 p0 = 	 (( java.lang.Object ) p0 ).hashCode ( ); // invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I
} // :goto_0
p0 = e.f.b.b.d .a ( p0 );
} // .end method
