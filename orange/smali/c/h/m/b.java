public abstract class c.h.m.b {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static void a ( java.lang.Object p0, java.lang.StringBuilder p1 ) {
		 /* .locals 2 */
		 /* if-nez p0, :cond_0 */
		 final String p0 = "null"; // const-string p0, "null"
		 /* .line 1 */
		 (( java.lang.StringBuilder ) p1 ).append ( p0 ); // invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* .line 2 */
	 } // :cond_0
	 (( java.lang.Object ) p0 ).getClass ( ); // invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
	 (( java.lang.Class ) v0 ).getSimpleName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
	 if ( v0 != null) { // if-eqz v0, :cond_1
		 /* .line 3 */
		 v1 = 		 (( java.lang.String ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/String;->length()I
		 /* if-gtz v1, :cond_2 */
		 /* .line 4 */
	 } // :cond_1
	 (( java.lang.Object ) p0 ).getClass ( ); // invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
	 (( java.lang.Class ) v0 ).getName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;
	 /* const/16 v1, 0x2e */
	 /* .line 5 */
	 v1 = 	 (( java.lang.String ) v0 ).lastIndexOf ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->lastIndexOf(I)I
	 /* if-lez v1, :cond_2 */
	 /* add-int/lit8 v1, v1, 0x1 */
	 /* .line 6 */
	 (( java.lang.String ) v0 ).substring ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;
	 /* .line 7 */
} // :cond_2
(( java.lang.StringBuilder ) p1 ).append ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* const/16 v0, 0x7b */
/* .line 8 */
(( java.lang.StringBuilder ) p1 ).append ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* .line 9 */
p0 = java.lang.System .identityHashCode ( p0 );
java.lang.Integer .toHexString ( p0 );
(( java.lang.StringBuilder ) p1 ).append ( p0 ); // invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
} // :goto_0
return;
} // .end method
