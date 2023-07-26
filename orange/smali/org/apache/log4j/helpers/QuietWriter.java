public class org.apache.log4j.helpers.QuietWriter extends java.io.FilterWriter {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public org.apache.log4j.spi.ErrorHandler b;
	 /* # direct methods */
	 public org.apache.log4j.helpers.QuietWriter ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0, p1}, Ljava/io/FilterWriter;-><init>(Ljava/io/Writer;)V */
		 /* .line 2 */
		 (( org.apache.log4j.helpers.QuietWriter ) p0 ).setErrorHandler ( p2 ); // invoke-virtual {p0, p2}, Lorg/apache/log4j/helpers/QuietWriter;->setErrorHandler(Lorg/apache/log4j/spi/ErrorHandler;)V
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void flush ( ) {
		 /* .locals 4 */
		 /* .line 1 */
		 try { // :try_start_0
			 v0 = this.out;
			 (( java.io.Writer ) v0 ).flush ( ); // invoke-virtual {v0}, Ljava/io/Writer;->flush()V
			 /* :try_end_0 */
			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* :catch_0 */
			 /* move-exception v0 */
			 /* .line 2 */
			 v1 = this.b;
			 int v2 = 2; // const/4 v2, 0x2
			 final String v3 = "Failed to flush writer,"; // const-string v3, "Failed to flush writer,"
		 } // :goto_0
		 return;
	 } // .end method
	 public void setErrorHandler ( org.apache.log4j.spi.ErrorHandler p0 ) {
		 /* .locals 1 */
		 if ( p1 != null) { // if-eqz p1, :cond_0
			 /* .line 1 */
			 this.b = p1;
			 return;
			 /* .line 2 */
		 } // :cond_0
		 /* new-instance p1, Ljava/lang/IllegalArgumentException; */
		 final String v0 = "Attempted to set null ErrorHandler."; // const-string v0, "Attempted to set null ErrorHandler."
		 /* invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
		 /* throw p1 */
	 } // .end method
	 public void write ( java.lang.String p0 ) {
		 /* .locals 4 */
		 if ( p1 != null) { // if-eqz p1, :cond_0
			 /* .line 1 */
			 try { // :try_start_0
				 v0 = this.out;
				 (( java.io.Writer ) v0 ).write ( p1 ); // invoke-virtual {v0, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V
				 /* :try_end_0 */
				 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
				 /* :catch_0 */
				 /* move-exception v0 */
				 /* .line 2 */
				 v1 = this.b;
				 /* new-instance v2, Ljava/lang/StringBuffer; */
				 /* invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V */
				 final String v3 = "Failed to write ["; // const-string v3, "Failed to write ["
				 (( java.lang.StringBuffer ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
				 (( java.lang.StringBuffer ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
				 final String p1 = "]."; // const-string p1, "]."
				 (( java.lang.StringBuffer ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
				 (( java.lang.StringBuffer ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
				 int v2 = 1; // const/4 v2, 0x1
			 } // :cond_0
		 } // :goto_0
		 return;
	 } // .end method
