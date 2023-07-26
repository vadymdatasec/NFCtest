public class org.apache.log4j.lf5.StartLogFactor5 {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public org.apache.log4j.lf5.StartLogFactor5 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static final void main ( java.lang.String[] p0 ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* new-instance p0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor; */
		 org.apache.log4j.lf5.LogLevel .getLog4JLevels ( );
		 /* invoke-direct {p0, v0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;-><init>(Ljava/util/List;)V */
		 /* .line 2 */
		 v0 = 		 org.apache.log4j.lf5.LF5Appender .c ( );
		 v1 = 		 org.apache.log4j.lf5.LF5Appender .b ( );
		 (( org.apache.log4j.lf5.viewer.LogBrokerMonitor ) p0 ).setFrameSize ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->setFrameSize(II)V
		 /* const/16 v0, 0xc */
		 /* .line 3 */
		 (( org.apache.log4j.lf5.viewer.LogBrokerMonitor ) p0 ).setFontSize ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->setFontSize(I)V
		 /* .line 4 */
		 (( org.apache.log4j.lf5.viewer.LogBrokerMonitor ) p0 ).show ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->show()V
		 return;
	 } // .end method
