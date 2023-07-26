public class org.apache.log4j.or.sax.AttributesRenderer implements org.apache.log4j.or.ObjectRenderer {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # direct methods */
	 public org.apache.log4j.or.sax.AttributesRenderer ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.String doRender ( java.lang.Object p0 ) {
		 /* .locals 6 */
		 /* .line 1 */
		 /* instance-of v0, p1, Lorg/xml/sax/Attributes; */
		 if ( v0 != null) { // if-eqz v0, :cond_2
			 /* .line 2 */
			 /* new-instance v0, Ljava/lang/StringBuffer; */
			 /* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
			 /* .line 3 */
			 /* check-cast p1, Lorg/xml/sax/Attributes; */
			 v1 = 			 /* .line 4 */
			 int v2 = 0; // const/4 v2, 0x0
			 int v3 = 1; // const/4 v3, 0x1
			 int v4 = 0; // const/4 v4, 0x0
		 } // :goto_0
		 /* if-ge v4, v1, :cond_1 */
		 if ( v3 != null) { // if-eqz v3, :cond_0
			 int v3 = 0; // const/4 v3, 0x0
		 } // :cond_0
		 final String v5 = ", "; // const-string v5, ", "
		 /* .line 5 */
		 (( java.lang.StringBuffer ) v0 ).append ( v5 ); // invoke-virtual {v0, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 /* .line 6 */
	 } // :goto_1
	 (( java.lang.StringBuffer ) v0 ).append ( v5 ); // invoke-virtual {v0, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 /* const/16 v5, 0x3d */
	 /* .line 7 */
	 (( java.lang.StringBuffer ) v0 ).append ( v5 ); // invoke-virtual {v0, v5}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
	 /* .line 8 */
	 (( java.lang.StringBuffer ) v0 ).append ( v5 ); // invoke-virtual {v0, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 /* add-int/lit8 v4, v4, 0x1 */
	 /* .line 9 */
} // :cond_1
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
/* .line 10 */
} // :cond_2
try { // :try_start_0
(( java.lang.Object ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p1 */
/* .line 11 */
(( java.lang.Exception ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;
} // .end method
