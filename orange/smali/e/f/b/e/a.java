public abstract class e.f.b.e.a extends e.f.b.e.b {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static e.f.b.e.a ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 e.f.b.e.a .a ( );
		 return;
	 } // .end method
	 public static java.util.regex.Pattern a ( ) {
		 /* .locals 4 */
		 final String v0 = "(?:\\d+#(?:\\.\\d*#)?|\\.\\d+#)"; // const-string v0, "(?:\\d+#(?:\\.\\d*#)?|\\.\\d+#)"
		 final String v1 = "(?:[eE][+-]?\\d+#)?[fFdD]?"; // const-string v1, "(?:[eE][+-]?\\d+#)?[fFdD]?"
		 /* .line 1 */
		 (( java.lang.String ) v0 ).concat ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;
		 final String v1 = "(?:[0-9a-fA-F]+#(?:\\.[0-9a-fA-F]*#)?|\\.[0-9a-fA-F]+#)"; // const-string v1, "(?:[0-9a-fA-F]+#(?:\\.[0-9a-fA-F]*#)?|\\.[0-9a-fA-F]+#)"
		 /* .line 2 */
		 v2 = 		 (( java.lang.String ) v1 ).length ( ); // invoke-virtual {v1}, Ljava/lang/String;->length()I
		 /* add-int/lit8 v2, v2, 0x19 */
		 /* new-instance v3, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(I)V */
		 final String v2 = "0[xX]"; // const-string v2, "0[xX]"
		 (( java.lang.StringBuilder ) v3 ).append ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v3 ).append ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 final String v1 = "[pP][+-]?\\d+#[fFdD]?"; // const-string v1, "[pP][+-]?\\d+#[fFdD]?"
		 (( java.lang.StringBuilder ) v3 ).append ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 /* .line 3 */
		 java.lang.String .valueOf ( v0 );
		 v2 = 		 (( java.lang.String ) v2 ).length ( ); // invoke-virtual {v2}, Ljava/lang/String;->length()I
		 /* add-int/lit8 v2, v2, 0x17 */
		 java.lang.String .valueOf ( v1 );
		 v3 = 		 (( java.lang.String ) v3 ).length ( ); // invoke-virtual {v3}, Ljava/lang/String;->length()I
		 /* add-int/2addr v2, v3 */
		 /* new-instance v3, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(I)V */
		 final String v2 = "[+-]?(?:NaN|Infinity|"; // const-string v2, "[+-]?(?:NaN|Infinity|"
		 (( java.lang.StringBuilder ) v3 ).append ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 final String v0 = "|"; // const-string v0, "|"
		 (( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v3 ).append ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 final String v0 = ")"; // const-string v0, ")"
		 (( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 final String v1 = "#"; // const-string v1, "#"
		 final String v2 = "+"; // const-string v2, "+"
		 /* .line 4 */
		 (( java.lang.String ) v0 ).replace ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
		 /* .line 5 */
		 java.util.regex.Pattern .compile ( v0 );
	 } // .end method
	 public static Boolean a ( Double p0 ) {
		 /* .locals 3 */
		 /* const-wide/high16 v0, -0x10000000000000L # Double.NEGATIVE_INFINITY */
		 /* cmpg-double v2, v0, p0 */
		 /* if-gez v2, :cond_0 */
		 /* const-wide/high16 v0, 0x7ff0000000000000L # Double.POSITIVE_INFINITY */
		 /* cmpg-double v2, p0, v0 */
		 /* if-gez v2, :cond_0 */
		 int p0 = 1; // const/4 p0, 0x1
	 } // :cond_0
	 int p0 = 0; // const/4 p0, 0x0
} // :goto_0
} // .end method
