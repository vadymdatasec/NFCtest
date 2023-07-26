public abstract class e.f.b.d.c {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static Integer a ( java.lang.String p0, Integer p1 ) {
		 /* .locals 3 */
		 /* if-lez p1, :cond_0 */
		 /* .line 1 */
	 } // :cond_0
	 /* new-instance v0, Ljava/lang/IllegalArgumentException; */
	 java.lang.String .valueOf ( p0 );
	 v1 = 	 (( java.lang.String ) v1 ).length ( ); // invoke-virtual {v1}, Ljava/lang/String;->length()I
	 /* add-int/lit8 v1, v1, 0x1a */
	 /* new-instance v2, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V */
	 (( java.lang.StringBuilder ) v2 ).append ( p0 ); // invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 final String p0 = " ("; // const-string p0, " ("
	 (( java.lang.StringBuilder ) v2 ).append ( p0 ); // invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
	 final String p0 = ") must be > 0"; // const-string p0, ") must be > 0"
	 (( java.lang.StringBuilder ) v2 ).append ( p0 ); // invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 /* invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
	 /* throw v0 */
} // .end method
public static void a ( Boolean p0 ) {
	 /* .locals 1 */
	 if ( p0 != null) { // if-eqz p0, :cond_0
		 return;
		 /* .line 2 */
	 } // :cond_0
	 /* new-instance p0, Ljava/lang/ArithmeticException; */
	 final String v0 = "mode was UNNECESSARY, but rounding was necessary"; // const-string v0, "mode was UNNECESSARY, but rounding was necessary"
	 /* invoke-direct {p0, v0}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V */
	 /* throw p0 */
} // .end method
