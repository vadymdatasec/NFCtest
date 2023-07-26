public abstract class e.f.a.d.a.e.b0 {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static java.lang.String a ( java.lang.String p0, java.lang.String p1 ) {
		 /* .locals 3 */
		 v0 = 		 (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
		 java.lang.String .valueOf ( p1 );
		 v1 = 		 (( java.lang.String ) v1 ).length ( ); // invoke-virtual {v1}, Ljava/lang/String;->length()I
		 /* new-instance v2, Ljava/lang/StringBuilder; */
		 /* add-int/lit8 v0, v0, 0x1 */
		 /* add-int/2addr v0, v1 */
		 /* invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(I)V */
		 (( java.lang.StringBuilder ) v2 ).append ( p0 ); // invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 final String p0 = ":"; // const-string p0, ":"
		 (( java.lang.StringBuilder ) v2 ).append ( p0 ); // invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 } // .end method
	 public static java.lang.String a ( java.lang.String p0, java.lang.String p1, java.lang.String p2 ) {
		 /* .locals 4 */
		 v0 = 		 (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
		 java.lang.String .valueOf ( p1 );
		 v1 = 		 (( java.lang.String ) v1 ).length ( ); // invoke-virtual {v1}, Ljava/lang/String;->length()I
		 java.lang.String .valueOf ( p2 );
		 v2 = 		 (( java.lang.String ) v2 ).length ( ); // invoke-virtual {v2}, Ljava/lang/String;->length()I
		 /* new-instance v3, Ljava/lang/StringBuilder; */
		 /* add-int/lit8 v0, v0, 0x2 */
		 /* add-int/2addr v0, v1 */
		 /* add-int/2addr v0, v2 */
		 /* invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(I)V */
		 (( java.lang.StringBuilder ) v3 ).append ( p0 ); // invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 final String p0 = ":"; // const-string p0, ":"
		 (( java.lang.StringBuilder ) v3 ).append ( p0 ); // invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v3 ).append ( p1 ); // invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v3 ).append ( p0 ); // invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v3 ).append ( p2 ); // invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 } // .end method
