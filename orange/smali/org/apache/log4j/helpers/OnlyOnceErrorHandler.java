public class org.apache.log4j.helpers.OnlyOnceErrorHandler implements org.apache.log4j.spi.ErrorHandler {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public Boolean a;
	 /* # direct methods */
	 public org.apache.log4j.helpers.OnlyOnceErrorHandler ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 int v0 = 1; // const/4 v0, 0x1
		 /* .line 2 */
		 /* iput-boolean v0, p0, Lorg/apache/log4j/helpers/OnlyOnceErrorHandler;->a:Z */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void activateOptions ( ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 public void error ( java.lang.String p0 ) {
		 /* .locals 1 */
		 /* .line 7 */
		 /* iget-boolean v0, p0, Lorg/apache/log4j/helpers/OnlyOnceErrorHandler;->a:Z */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 8 */
			 org.apache.log4j.helpers.LogLog .error ( p1 );
			 int p1 = 0; // const/4 p1, 0x0
			 /* .line 9 */
			 /* iput-boolean p1, p0, Lorg/apache/log4j/helpers/OnlyOnceErrorHandler;->a:Z */
		 } // :cond_0
		 return;
	 } // .end method
	 public void error ( java.lang.String p0, java.lang.Exception p1, Integer p2 ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 1 */
		 (( org.apache.log4j.helpers.OnlyOnceErrorHandler ) p0 ).error ( p1, p2, p3, v0 ); // invoke-virtual {p0, p1, p2, p3, v0}, Lorg/apache/log4j/helpers/OnlyOnceErrorHandler;->error(Ljava/lang/String;Ljava/lang/Exception;ILorg/apache/log4j/spi/LoggingEvent;)V
		 return;
	 } // .end method
	 public void error ( java.lang.String p0, java.lang.Exception p1, Integer p2, org.apache.log4j.spi.LoggingEvent p3 ) {
		 /* .locals 0 */
		 /* .line 2 */
		 /* instance-of p3, p2, Ljava/io/InterruptedIOException; */
		 /* if-nez p3, :cond_0 */
		 /* instance-of p3, p2, Ljava/lang/InterruptedException; */
		 if ( p3 != null) { // if-eqz p3, :cond_1
			 /* .line 3 */
		 } // :cond_0
		 java.lang.Thread .currentThread ( );
		 (( java.lang.Thread ) p3 ).interrupt ( ); // invoke-virtual {p3}, Ljava/lang/Thread;->interrupt()V
		 /* .line 4 */
	 } // :cond_1
	 /* iget-boolean p3, p0, Lorg/apache/log4j/helpers/OnlyOnceErrorHandler;->a:Z */
	 if ( p3 != null) { // if-eqz p3, :cond_2
		 /* .line 5 */
		 org.apache.log4j.helpers.LogLog .error ( p1,p2 );
		 int p1 = 0; // const/4 p1, 0x0
		 /* .line 6 */
		 /* iput-boolean p1, p0, Lorg/apache/log4j/helpers/OnlyOnceErrorHandler;->a:Z */
	 } // :cond_2
	 return;
} // .end method
public void setAppender ( org.apache.log4j.Appender p0 ) {
	 /* .locals 0 */
	 return;
} // .end method
public void setBackupAppender ( org.apache.log4j.Appender p0 ) {
	 /* .locals 0 */
	 return;
} // .end method
public void setLogger ( org.apache.log4j.Logger p0 ) {
	 /* .locals 0 */
	 return;
} // .end method
