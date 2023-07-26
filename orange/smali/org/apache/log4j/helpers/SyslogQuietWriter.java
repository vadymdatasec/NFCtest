public class org.apache.log4j.helpers.SyslogQuietWriter extends org.apache.log4j.helpers.QuietWriter {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public Integer c;
	 public Integer d;
	 /* # direct methods */
	 public org.apache.log4j.helpers.SyslogQuietWriter ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0, p1, p3}, Lorg/apache/log4j/helpers/QuietWriter;-><init>(Ljava/io/Writer;Lorg/apache/log4j/spi/ErrorHandler;)V */
		 /* .line 2 */
		 /* iput p2, p0, Lorg/apache/log4j/helpers/SyslogQuietWriter;->c:I */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void setLevel ( Integer p0 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* iput p1, p0, Lorg/apache/log4j/helpers/SyslogQuietWriter;->d:I */
		 return;
	 } // .end method
	 public void setSyslogFacility ( Integer p0 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* iput p1, p0, Lorg/apache/log4j/helpers/SyslogQuietWriter;->c:I */
		 return;
	 } // .end method
	 public void write ( java.lang.String p0 ) {
		 /* .locals 3 */
		 /* .line 1 */
		 /* new-instance v0, Ljava/lang/StringBuffer; */
		 /* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
		 final String v1 = "<"; // const-string v1, "<"
		 (( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 /* iget v1, p0, Lorg/apache/log4j/helpers/SyslogQuietWriter;->c:I */
		 /* iget v2, p0, Lorg/apache/log4j/helpers/SyslogQuietWriter;->d:I */
		 /* or-int/2addr v1, v2 */
		 (( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;
		 final String v1 = ">"; // const-string v1, ">"
		 (( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 (( java.lang.StringBuffer ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 (( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
		 /* invoke-super {p0, p1}, Lorg/apache/log4j/helpers/QuietWriter;->write(Ljava/lang/String;)V */
		 return;
	 } // .end method
