public abstract class org.apache.log4j.pattern.LoggingEventPatternConverter extends org.apache.log4j.pattern.PatternConverter {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public org.apache.log4j.pattern.LoggingEventPatternConverter ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0, p1, p2}, Lorg/apache/log4j/pattern/PatternConverter;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void format ( java.lang.Object p0, java.lang.StringBuffer p1 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* instance-of v0, p1, Lorg/apache/log4j/spi/LoggingEvent; */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 2 */
			 /* check-cast p1, Lorg/apache/log4j/spi/LoggingEvent; */
			 (( org.apache.log4j.pattern.LoggingEventPatternConverter ) p0 ).format ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lorg/apache/log4j/pattern/LoggingEventPatternConverter;->format(Lorg/apache/log4j/spi/LoggingEvent;Ljava/lang/StringBuffer;)V
		 } // :cond_0
		 return;
	 } // .end method
	 public abstract void format ( org.apache.log4j.spi.LoggingEvent p0, java.lang.StringBuffer p1 ) {
	 } // .end method
	 public Boolean handlesThrowable ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // .end method
