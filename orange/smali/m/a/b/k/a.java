public class m.a.b.k.a implements org.apache.log4j.spi.TriggeringEventEvaluator {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # direct methods */
	 public m.a.b.k.a ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Boolean isTriggeringEvent ( org.apache.log4j.spi.LoggingEvent p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 (( org.apache.log4j.spi.LoggingEvent ) p1 ).getLevel ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getLevel()Lorg/apache/log4j/Level;
		 v0 = org.apache.log4j.Level.ERROR;
		 p1 = 		 (( org.apache.log4j.Priority ) p1 ).isGreaterOrEqual ( v0 ); // invoke-virtual {p1, v0}, Lorg/apache/log4j/Priority;->isGreaterOrEqual(Lorg/apache/log4j/Priority;)Z
	 } // .end method
