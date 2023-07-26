public class m.a.b.d extends org.apache.log4j.helpers.FileWatchdog {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public m.a.b.d ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0, p1}, Lorg/apache/log4j/helpers/FileWatchdog;-><init>(Ljava/lang/String;)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void b ( ) {
		 /* .locals 3 */
		 /* .line 1 */
		 /* new-instance v0, Lorg/apache/log4j/PropertyConfigurator; */
		 /* invoke-direct {v0}, Lorg/apache/log4j/PropertyConfigurator;-><init>()V */
		 v1 = this.b;
		 org.apache.log4j.LogManager .getLoggerRepository ( );
		 (( org.apache.log4j.PropertyConfigurator ) v0 ).doConfigure ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lorg/apache/log4j/PropertyConfigurator;->doConfigure(Ljava/lang/String;Lorg/apache/log4j/spi/LoggerRepository;)V
		 return;
	 } // .end method
