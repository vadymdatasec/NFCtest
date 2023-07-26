public class org.apache.log4j.helpers.CountingQuietWriter extends org.apache.log4j.helpers.QuietWriter {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public Long c;
	 /* # direct methods */
	 public org.apache.log4j.helpers.CountingQuietWriter ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0, p1, p2}, Lorg/apache/log4j/helpers/QuietWriter;-><init>(Ljava/io/Writer;Lorg/apache/log4j/spi/ErrorHandler;)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Long getCount ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* iget-wide v0, p0, Lorg/apache/log4j/helpers/CountingQuietWriter;->c:J */
		 /* return-wide v0 */
	 } // .end method
	 public void setCount ( Long p0 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* iput-wide p1, p0, Lorg/apache/log4j/helpers/CountingQuietWriter;->c:J */
		 return;
	 } // .end method
	 public void write ( java.lang.String p0 ) {
		 /* .locals 4 */
		 /* .line 1 */
		 try { // :try_start_0
			 v0 = this.out;
			 (( java.io.Writer ) v0 ).write ( p1 ); // invoke-virtual {v0, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V
			 /* .line 2 */
			 /* iget-wide v0, p0, Lorg/apache/log4j/helpers/CountingQuietWriter;->c:J */
			 p1 = 			 (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
			 /* int-to-long v2, p1 */
			 /* add-long/2addr v0, v2 */
			 /* iput-wide v0, p0, Lorg/apache/log4j/helpers/CountingQuietWriter;->c:J */
			 /* :try_end_0 */
			 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* :catch_0 */
			 /* move-exception p1 */
			 /* .line 3 */
			 v0 = this.b;
			 int v1 = 1; // const/4 v1, 0x1
			 final String v2 = "Write failure."; // const-string v2, "Write failure."
		 } // :goto_0
		 return;
	 } // .end method
