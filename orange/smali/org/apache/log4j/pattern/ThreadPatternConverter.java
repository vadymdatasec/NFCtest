public class org.apache.log4j.pattern.ThreadPatternConverter extends org.apache.log4j.pattern.LoggingEventPatternConverter {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final org.apache.log4j.pattern.ThreadPatternConverter c;
	 /* # direct methods */
	 public static org.apache.log4j.pattern.ThreadPatternConverter ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* new-instance v0, Lorg/apache/log4j/pattern/ThreadPatternConverter; */
		 /* invoke-direct {v0}, Lorg/apache/log4j/pattern/ThreadPatternConverter;-><init>()V */
		 return;
	 } // .end method
	 public org.apache.log4j.pattern.ThreadPatternConverter ( ) {
		 /* .locals 2 */
		 final String v0 = "Thread"; // const-string v0, "Thread"
		 final String v1 = "thread"; // const-string v1, "thread"
		 /* .line 1 */
		 /* invoke-direct {p0, v0, v1}, Lorg/apache/log4j/pattern/LoggingEventPatternConverter;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
		 return;
	 } // .end method
	 public static org.apache.log4j.pattern.ThreadPatternConverter newInstance ( java.lang.String[] p0 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 p0 = org.apache.log4j.pattern.ThreadPatternConverter.c;
	 } // .end method
	 /* # virtual methods */
	 public void format ( org.apache.log4j.spi.LoggingEvent p0, java.lang.StringBuffer p1 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 (( org.apache.log4j.spi.LoggingEvent ) p1 ).getThreadName ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getThreadName()Ljava/lang/String;
		 (( java.lang.StringBuffer ) p2 ).append ( p1 ); // invoke-virtual {p2, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 return;
	 } // .end method
