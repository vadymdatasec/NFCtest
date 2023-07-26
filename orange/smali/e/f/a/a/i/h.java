public abstract class e.f.a.a.i.h {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static java.lang.String a ( java.lang.String p0, java.lang.String p1 ) {
		 /* .locals 3 */
		 /* .line 1 */
		 v0 = 		 (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
		 v1 = 		 (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
		 /* sub-int/2addr v0, v1 */
		 /* if-ltz v0, :cond_2 */
		 int v1 = 1; // const/4 v1, 0x1
		 /* if-gt v0, v1, :cond_2 */
		 /* .line 2 */
		 /* new-instance v0, Ljava/lang/StringBuilder; */
		 v1 = 		 (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
		 v2 = 		 (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
		 /* add-int/2addr v2, v1 */
		 /* invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(I)V */
		 int v1 = 0; // const/4 v1, 0x0
		 /* .line 3 */
	 } // :goto_0
	 v2 = 	 (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
	 /* if-ge v1, v2, :cond_1 */
	 /* .line 4 */
	 v2 = 	 (( java.lang.String ) p0 ).charAt ( v1 ); // invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C
	 (( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
	 /* .line 5 */
	 v2 = 	 (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
	 /* if-le v2, v1, :cond_0 */
	 /* .line 6 */
	 v2 = 	 (( java.lang.String ) p1 ).charAt ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C
	 (( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
} // :cond_0
/* add-int/lit8 v1, v1, 0x1 */
/* .line 7 */
} // :cond_1
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 8 */
} // :cond_2
/* new-instance p0, Ljava/lang/IllegalArgumentException; */
final String p1 = "Invalid input received"; // const-string p1, "Invalid input received"
/* invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
} // .end method
