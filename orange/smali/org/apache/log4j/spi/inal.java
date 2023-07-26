public class inal extends org.apache.log4j.Logger {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public inal ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0, p2}, Lorg/apache/log4j/Logger;-><init>(Ljava/lang/String;)V */
		 /* .line 2 */
		 this.e = p1;
		 /* .line 3 */
		 p1 = org.apache.log4j.Level.OFF;
		 this.b = p1;
		 /* .line 4 */
		 this.c = p0;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 public void addAppender ( org.apache.log4j.Appender p0 ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 public void assertLog ( Boolean p0, java.lang.String p1 ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 public void callAppenders ( org.apache.log4j.spi.LoggingEvent p0 ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 public void debug ( java.lang.Object p0 ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 public void debug ( java.lang.Object p0, java.lang.Throwable p1 ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 public void error ( java.lang.Object p0 ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 public void error ( java.lang.Object p0, java.lang.Throwable p1 ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 public void fatal ( java.lang.Object p0 ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 public void fatal ( java.lang.Object p0, java.lang.Throwable p1 ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 public java.util.Enumeration getAllAppenders ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* new-instance v0, Ljava/util/Vector; */
		 /* invoke-direct {v0}, Ljava/util/Vector;-><init>()V */
		 (( java.util.Vector ) v0 ).elements ( ); // invoke-virtual {v0}, Ljava/util/Vector;->elements()Ljava/util/Enumeration;
	 } // .end method
	 public org.apache.log4j.Appender getAppender ( java.lang.String p0 ) {
		 /* .locals 0 */
		 int p1 = 0; // const/4 p1, 0x0
	 } // .end method
	 public org.apache.log4j.Priority getChainedPriority ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 (( org.apache.log4j.spi.NOPLogger ) p0 ).getEffectiveLevel ( ); // invoke-virtual {p0}, Lorg/apache/log4j/spi/NOPLogger;->getEffectiveLevel()Lorg/apache/log4j/Level;
	 } // .end method
	 public org.apache.log4j.Level getEffectiveLevel ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = org.apache.log4j.Level.OFF;
	 } // .end method
	 public java.util.ResourceBundle getResourceBundle ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // .end method
	 public void info ( java.lang.Object p0 ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 public void info ( java.lang.Object p0, java.lang.Throwable p1 ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 public Boolean isAttached ( org.apache.log4j.Appender p0 ) {
		 /* .locals 0 */
		 int p1 = 0; // const/4 p1, 0x0
	 } // .end method
	 public Boolean isDebugEnabled ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // .end method
	 public Boolean isEnabledFor ( org.apache.log4j.Priority p0 ) {
		 /* .locals 0 */
		 int p1 = 0; // const/4 p1, 0x0
	 } // .end method
	 public Boolean isInfoEnabled ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // .end method
	 public Boolean isTraceEnabled ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // .end method
	 public void l7dlog ( org.apache.log4j.Priority p0, java.lang.String p1, java.lang.Throwable p2 ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 public void l7dlog ( org.apache.log4j.Priority p0, java.lang.String p1, java.lang.Object[] p2, java.lang.Throwable p3 ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 public void log ( java.lang.String p0, org.apache.log4j.Priority p1, java.lang.Object p2, java.lang.Throwable p3 ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 public void log ( org.apache.log4j.Priority p0, java.lang.Object p1 ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 public void log ( org.apache.log4j.Priority p0, java.lang.Object p1, java.lang.Throwable p2 ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 public void removeAllAppenders ( ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 public void removeAppender ( java.lang.String p0 ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 public void removeAppender ( org.apache.log4j.Appender p0 ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 public void setLevel ( org.apache.log4j.Level p0 ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 public void setPriority ( org.apache.log4j.Priority p0 ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 public void setResourceBundle ( java.util.ResourceBundle p0 ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 public void trace ( java.lang.Object p0 ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 public void trace ( java.lang.Object p0, java.lang.Throwable p1 ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 public void warn ( java.lang.Object p0 ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 public void warn ( java.lang.Object p0, java.lang.Throwable p1 ) {
		 /* .locals 0 */
		 return;
	 } // .end method
