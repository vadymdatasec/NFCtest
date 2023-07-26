public abstract class e.f.b.b.c {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static Integer a ( Integer p0, java.lang.String p1 ) {
		 /* .locals 3 */
		 /* if-ltz p0, :cond_0 */
		 /* .line 1 */
	 } // :cond_0
	 /* new-instance v0, Ljava/lang/IllegalArgumentException; */
	 java.lang.String .valueOf ( p1 );
	 v1 = 	 (( java.lang.String ) v1 ).length ( ); // invoke-virtual {v1}, Ljava/lang/String;->length()I
	 /* add-int/lit8 v1, v1, 0x28 */
	 /* new-instance v2, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V */
	 (( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 final String p1 = " cannot be negative but was: "; // const-string p1, " cannot be negative but was: "
	 (( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v2 ).append ( p0 ); // invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 /* invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
	 /* throw v0 */
} // .end method
public static void a ( Boolean p0 ) {
	 /* .locals 1 */
	 final String v0 = "no calls to next() since the last call to remove()"; // const-string v0, "no calls to next() since the last call to remove()"
	 /* .line 2 */
	 e.f.b.a.p .b ( p0,v0 );
	 return;
} // .end method
