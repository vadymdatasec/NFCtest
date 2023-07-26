public abstract class e.f.b.a.k extends e.f.b.a.e {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static Integer a ( java.lang.Object...p0 ) {
		 /* .locals 0 */
		 /* .line 2 */
		 p0 = 		 java.util.Arrays .hashCode ( p0 );
	 } // .end method
	 public static Boolean a ( java.lang.Object p0, java.lang.Object p1 ) {
		 /* .locals 0 */
		 /* if-eq p0, p1, :cond_1 */
		 if ( p0 != null) { // if-eqz p0, :cond_0
			 /* .line 1 */
			 p0 = 			 (( java.lang.Object ) p0 ).equals ( p1 ); // invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
			 if ( p0 != null) { // if-eqz p0, :cond_0
			 } // :cond_0
			 int p0 = 0; // const/4 p0, 0x0
		 } // :cond_1
	 } // :goto_0
	 int p0 = 1; // const/4 p0, 0x1
} // :goto_1
} // .end method
