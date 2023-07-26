public class org.apache.log4j.pattern.SequenceNumberPatternConverter extends org.apache.log4j.pattern.LoggingEventPatternConverter {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final org.apache.log4j.pattern.SequenceNumberPatternConverter c;
	 /* # direct methods */
	 public static org.apache.log4j.pattern.SequenceNumberPatternConverter ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* new-instance v0, Lorg/apache/log4j/pattern/SequenceNumberPatternConverter; */
		 /* invoke-direct {v0}, Lorg/apache/log4j/pattern/SequenceNumberPatternConverter;-><init>()V */
		 return;
	 } // .end method
	 public org.apache.log4j.pattern.SequenceNumberPatternConverter ( ) {
		 /* .locals 2 */
		 final String v0 = "Sequence Number"; // const-string v0, "Sequence Number"
		 final String v1 = "sn"; // const-string v1, "sn"
		 /* .line 1 */
		 /* invoke-direct {p0, v0, v1}, Lorg/apache/log4j/pattern/LoggingEventPatternConverter;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
		 return;
	 } // .end method
	 public static org.apache.log4j.pattern.SequenceNumberPatternConverter newInstance ( java.lang.String[] p0 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 p0 = org.apache.log4j.pattern.SequenceNumberPatternConverter.c;
	 } // .end method
	 /* # virtual methods */
	 public void format ( org.apache.log4j.spi.LoggingEvent p0, java.lang.StringBuffer p1 ) {
		 /* .locals 0 */
		 final String p1 = "0"; // const-string p1, "0"
		 /* .line 1 */
		 (( java.lang.StringBuffer ) p2 ).append ( p1 ); // invoke-virtual {p2, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 return;
	 } // .end method
