public class org.apache.log4j.BasicConfigurator {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static void configure ( ) {
		 /* .locals 4 */
		 /* .line 1 */
		 org.apache.log4j.Logger .getRootLogger ( );
		 /* .line 2 */
		 /* new-instance v1, Lorg/apache/log4j/ConsoleAppender; */
		 /* new-instance v2, Lorg/apache/log4j/PatternLayout; */
		 final String v3 = "%r [%t] %p %c %x - %m%n"; // const-string v3, "%r [%t] %p %c %x - %m%n"
		 /* invoke-direct {v2, v3}, Lorg/apache/log4j/PatternLayout;-><init>(Ljava/lang/String;)V */
		 /* invoke-direct {v1, v2}, Lorg/apache/log4j/ConsoleAppender;-><init>(Lorg/apache/log4j/Layout;)V */
		 (( org.apache.log4j.Category ) v0 ).addAppender ( v1 ); // invoke-virtual {v0, v1}, Lorg/apache/log4j/Category;->addAppender(Lorg/apache/log4j/Appender;)V
		 return;
	 } // .end method
	 public static void configure ( org.apache.log4j.Appender p0 ) {
		 /* .locals 1 */
		 /* .line 3 */
		 org.apache.log4j.Logger .getRootLogger ( );
		 /* .line 4 */
		 (( org.apache.log4j.Category ) v0 ).addAppender ( p0 ); // invoke-virtual {v0, p0}, Lorg/apache/log4j/Category;->addAppender(Lorg/apache/log4j/Appender;)V
		 return;
	 } // .end method
	 public static void resetConfiguration ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 org.apache.log4j.LogManager .resetConfiguration ( );
		 return;
	 } // .end method
