public class m.a.b.n.e extends org.apache.log4j.helpers.FileWatchdog {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public m.a.b.n.e ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0, p1}, Lorg/apache/log4j/helpers/FileWatchdog;-><init>(Ljava/lang/String;)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void b ( ) {
		 /* .locals 3 */
		 /* .line 1 */
		 /* new-instance v0, Lorg/apache/log4j/xml/DOMConfigurator; */
		 /* invoke-direct {v0}, Lorg/apache/log4j/xml/DOMConfigurator;-><init>()V */
		 v1 = this.b;
		 org.apache.log4j.LogManager .getLoggerRepository ( );
		 (( org.apache.log4j.xml.DOMConfigurator ) v0 ).doConfigure ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lorg/apache/log4j/xml/DOMConfigurator;->doConfigure(Ljava/lang/String;Lorg/apache/log4j/spi/LoggerRepository;)V
		 return;
	 } // .end method
