public abstract class i.f.d extends i.f.c {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static final Object a ( Object[] p0 ) {
		 /* .locals 2 */
		 final String v0 = "$this$single"; // const-string v0, "$this$single"
		 i.h.c.k .c ( p0,v0 );
		 /* .line 1 */
		 /* array-length v0, p0 */
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 int v1 = 1; // const/4 v1, 0x1
			 /* if-ne v0, v1, :cond_0 */
			 int v0 = 0; // const/4 v0, 0x0
			 /* .line 2 */
			 /* aget-char p0, p0, v0 */
			 /* .line 3 */
		 } // :cond_0
		 /* new-instance p0, Ljava/lang/IllegalArgumentException; */
		 final String v0 = "Array has more than one element."; // const-string v0, "Array has more than one element."
		 /* invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
		 /* throw p0 */
		 /* .line 4 */
	 } // :cond_1
	 /* new-instance p0, Ljava/util/NoSuchElementException; */
	 final String v0 = "Array is empty."; // const-string v0, "Array is empty."
	 /* invoke-direct {p0, v0}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V */
	 /* throw p0 */
} // .end method
