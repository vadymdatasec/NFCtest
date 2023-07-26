public abstract class e.f.a.b.c.m.g {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static Integer a ( java.lang.Object...p0 ) {
		 /* .locals 0 */
		 /* .line 2 */
		 p0 = 		 java.util.Arrays .hashCode ( p0 );
	 } // .end method
	 public static e.f.a.b.c.m.f a ( java.lang.Object p0 ) {
		 /* .locals 2 */
		 /* .line 3 */
		 /* new-instance v0, Le/f/a/b/c/m/f; */
		 int v1 = 0; // const/4 v1, 0x0
		 /* invoke-direct {v0, p0, v1}, Le/f/a/b/c/m/f;-><init>(Ljava/lang/Object;Le/f/a/b/c/m/p;)V */
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
} // .end method
