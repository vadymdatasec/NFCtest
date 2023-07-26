public class org.apache.log4j.lf5.AppenderFinalizer {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public org.apache.log4j.lf5.viewer.LogBrokerMonitor a;
	 /* # direct methods */
	 public org.apache.log4j.lf5.AppenderFinalizer ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 2 */
		 this.a = v0;
		 /* .line 3 */
		 this.a = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void finalize ( ) {
		 /* .locals 2 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Ljava/lang/Throwable; */
		 /* } */
	 } // .end annotation
	 /* .line 1 */
	 v0 = java.lang.System.out;
	 final String v1 = "Disposing of the default LogBrokerMonitor instance"; // const-string v1, "Disposing of the default LogBrokerMonitor instance"
	 (( java.io.PrintStream ) v0 ).println ( v1 ); // invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
	 /* .line 2 */
	 v0 = this.a;
	 (( org.apache.log4j.lf5.viewer.LogBrokerMonitor ) v0 ).dispose ( ); // invoke-virtual {v0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->dispose()V
	 return;
} // .end method
