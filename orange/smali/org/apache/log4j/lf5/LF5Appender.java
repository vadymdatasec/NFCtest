public class org.apache.log4j.lf5.LF5Appender extends org.apache.log4j.AppenderSkeleton {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static org.apache.log4j.lf5.viewer.LogBrokerMonitor i;
	 public static org.apache.log4j.lf5.AppenderFinalizer j;
	 /* # instance fields */
	 public org.apache.log4j.lf5.viewer.LogBrokerMonitor h;
	 /* # direct methods */
	 public org.apache.log4j.lf5.LF5Appender ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 org.apache.log4j.lf5.LF5Appender .a ( );
		 /* invoke-direct {p0, v0}, Lorg/apache/log4j/lf5/LF5Appender;-><init>(Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;)V */
		 return;
	 } // .end method
	 public org.apache.log4j.lf5.LF5Appender ( ) {
		 /* .locals 0 */
		 /* .line 2 */
		 /* invoke-direct {p0}, Lorg/apache/log4j/AppenderSkeleton;-><init>()V */
		 if ( p1 != null) { // if-eqz p1, :cond_0
			 /* .line 3 */
			 this.h = p1;
		 } // :cond_0
		 return;
	 } // .end method
	 public static synchronized org.apache.log4j.lf5.viewer.LogBrokerMonitor a ( ) {
		 /* .locals 4 */
		 /* const-class v0, Lorg/apache/log4j/lf5/LF5Appender; */
		 /* monitor-enter v0 */
		 /* .line 1 */
		 try { // :try_start_0
			 v1 = org.apache.log4j.lf5.LF5Appender.i;
			 /* :try_end_0 */
			 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
			 /* if-nez v1, :cond_0 */
			 /* .line 2 */
			 try { // :try_start_1
				 /* new-instance v1, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor; */
				 org.apache.log4j.lf5.LogLevel .getLog4JLevels ( );
				 /* invoke-direct {v1, v2}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;-><init>(Ljava/util/List;)V */
				 /* .line 3 */
				 /* new-instance v2, Lorg/apache/log4j/lf5/AppenderFinalizer; */
				 /* invoke-direct {v2, v1}, Lorg/apache/log4j/lf5/AppenderFinalizer;-><init>(Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;)V */
				 /* .line 4 */
				 v1 = org.apache.log4j.lf5.LF5Appender.i;
				 v2 = 				 org.apache.log4j.lf5.LF5Appender .c ( );
				 v3 = 				 org.apache.log4j.lf5.LF5Appender .b ( );
				 (( org.apache.log4j.lf5.viewer.LogBrokerMonitor ) v1 ).setFrameSize ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->setFrameSize(II)V
				 /* .line 5 */
				 v1 = org.apache.log4j.lf5.LF5Appender.i;
				 /* const/16 v2, 0xc */
				 (( org.apache.log4j.lf5.viewer.LogBrokerMonitor ) v1 ).setFontSize ( v2 ); // invoke-virtual {v1, v2}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->setFontSize(I)V
				 /* .line 6 */
				 v1 = org.apache.log4j.lf5.LF5Appender.i;
				 (( org.apache.log4j.lf5.viewer.LogBrokerMonitor ) v1 ).show ( ); // invoke-virtual {v1}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->show()V
				 /* :try_end_1 */
				 /* .catch Ljava/lang/SecurityException; {:try_start_1 ..:try_end_1} :catch_0 */
				 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
				 /* :catch_0 */
				 int v1 = 0; // const/4 v1, 0x0
				 /* .line 7 */
				 try { // :try_start_2
					 /* .line 8 */
				 } // :cond_0
			 } // :goto_0
			 v1 = org.apache.log4j.lf5.LF5Appender.i;
			 /* :try_end_2 */
			 /* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
			 /* monitor-exit v0 */
			 /* :catchall_0 */
			 /* move-exception v1 */
			 /* monitor-exit v0 */
			 /* throw v1 */
		 } // .end method
		 public static Integer b ( ) {
			 /* .locals 1 */
			 /* .line 1 */
			 v0 = 			 org.apache.log4j.lf5.LF5Appender .d ( );
			 /* mul-int/lit8 v0, v0, 0x3 */
			 /* div-int/lit8 v0, v0, 0x4 */
		 } // .end method
		 public static Integer c ( ) {
			 /* .locals 1 */
			 /* .line 1 */
			 v0 = 			 org.apache.log4j.lf5.LF5Appender .e ( );
			 /* mul-int/lit8 v0, v0, 0x3 */
			 /* div-int/lit8 v0, v0, 0x4 */
		 } // .end method
		 public static Integer d ( ) {
			 /* .locals 1 */
			 /* .line 1 */
			 try { // :try_start_0
				 java.awt.Toolkit .getDefaultToolkit ( );
				 (( java.awt.Toolkit ) v0 ).getScreenSize ( ); // invoke-virtual {v0}, Ljava/awt/Toolkit;->getScreenSize()Ljava/awt/Dimension;
				 /* iget v0, v0, Ljava/awt/Dimension;->height:I */
				 /* :try_end_0 */
				 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
				 /* :catchall_0 */
				 /* const/16 v0, 0x258 */
			 } // .end method
			 public static Integer e ( ) {
				 /* .locals 1 */
				 /* .line 1 */
				 try { // :try_start_0
					 java.awt.Toolkit .getDefaultToolkit ( );
					 (( java.awt.Toolkit ) v0 ).getScreenSize ( ); // invoke-virtual {v0}, Ljava/awt/Toolkit;->getScreenSize()Ljava/awt/Dimension;
					 /* iget v0, v0, Ljava/awt/Dimension;->width:I */
					 /* :try_end_0 */
					 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
					 /* :catchall_0 */
					 /* const/16 v0, 0x320 */
				 } // .end method
				 public static void main ( java.lang.String[] p0 ) {
					 /* .locals 0 */
					 /* .line 1 */
					 /* new-instance p0, Lorg/apache/log4j/lf5/LF5Appender; */
					 /* invoke-direct {p0}, Lorg/apache/log4j/lf5/LF5Appender;-><init>()V */
					 return;
				 } // .end method
				 /* # virtual methods */
				 public void append ( org.apache.log4j.spi.LoggingEvent p0 ) {
					 /* .locals 9 */
					 /* .line 1 */
					 (( org.apache.log4j.spi.LoggingEvent ) p1 ).getLoggerName ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getLoggerName()Ljava/lang/String;
					 /* .line 2 */
					 (( org.apache.log4j.spi.LoggingEvent ) p1 ).getRenderedMessage ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getRenderedMessage()Ljava/lang/String;
					 /* .line 3 */
					 (( org.apache.log4j.spi.LoggingEvent ) p1 ).getNDC ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getNDC()Ljava/lang/String;
					 /* .line 4 */
					 (( org.apache.log4j.spi.LoggingEvent ) p1 ).getThreadName ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getThreadName()Ljava/lang/String;
					 /* .line 5 */
					 (( org.apache.log4j.spi.LoggingEvent ) p1 ).getLevel ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getLevel()Lorg/apache/log4j/Level;
					 (( org.apache.log4j.Priority ) v4 ).toString ( ); // invoke-virtual {v4}, Lorg/apache/log4j/Priority;->toString()Ljava/lang/String;
					 /* .line 6 */
					 /* iget-wide v5, p1, Lorg/apache/log4j/spi/LoggingEvent;->timeStamp:J */
					 /* .line 7 */
					 (( org.apache.log4j.spi.LoggingEvent ) p1 ).getLocationInformation ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getLocationInformation()Lorg/apache/log4j/spi/LocationInfo;
					 /* .line 8 */
					 /* new-instance v8, Lorg/apache/log4j/lf5/Log4JLogRecord; */
					 /* invoke-direct {v8}, Lorg/apache/log4j/lf5/Log4JLogRecord;-><init>()V */
					 /* .line 9 */
					 (( org.apache.log4j.lf5.LogRecord ) v8 ).setCategory ( v0 ); // invoke-virtual {v8, v0}, Lorg/apache/log4j/lf5/LogRecord;->setCategory(Ljava/lang/String;)V
					 /* .line 10 */
					 (( org.apache.log4j.lf5.LogRecord ) v8 ).setMessage ( v1 ); // invoke-virtual {v8, v1}, Lorg/apache/log4j/lf5/LogRecord;->setMessage(Ljava/lang/String;)V
					 /* .line 11 */
					 v0 = this.fullInfo;
					 (( org.apache.log4j.lf5.LogRecord ) v8 ).setLocation ( v0 ); // invoke-virtual {v8, v0}, Lorg/apache/log4j/lf5/LogRecord;->setLocation(Ljava/lang/String;)V
					 /* .line 12 */
					 (( org.apache.log4j.lf5.LogRecord ) v8 ).setMillis ( v5, v6 ); // invoke-virtual {v8, v5, v6}, Lorg/apache/log4j/lf5/LogRecord;->setMillis(J)V
					 /* .line 13 */
					 (( org.apache.log4j.lf5.LogRecord ) v8 ).setThreadDescription ( v3 ); // invoke-virtual {v8, v3}, Lorg/apache/log4j/lf5/LogRecord;->setThreadDescription(Ljava/lang/String;)V
					 if ( v2 != null) { // if-eqz v2, :cond_0
						 /* .line 14 */
						 (( org.apache.log4j.lf5.LogRecord ) v8 ).setNDC ( v2 ); // invoke-virtual {v8, v2}, Lorg/apache/log4j/lf5/LogRecord;->setNDC(Ljava/lang/String;)V
					 } // :cond_0
					 final String v0 = ""; // const-string v0, ""
					 /* .line 15 */
					 (( org.apache.log4j.lf5.LogRecord ) v8 ).setNDC ( v0 ); // invoke-virtual {v8, v0}, Lorg/apache/log4j/lf5/LogRecord;->setNDC(Ljava/lang/String;)V
					 /* .line 16 */
				 } // :goto_0
				 (( org.apache.log4j.spi.LoggingEvent ) p1 ).getThrowableInformation ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getThrowableInformation()Lorg/apache/log4j/spi/ThrowableInformation;
				 if ( v0 != null) { // if-eqz v0, :cond_1
					 /* .line 17 */
					 (( org.apache.log4j.spi.LoggingEvent ) p1 ).getThrowableInformation ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getThrowableInformation()Lorg/apache/log4j/spi/ThrowableInformation;
					 (( org.apache.log4j.lf5.Log4JLogRecord ) v8 ).setThrownStackTrace ( p1 ); // invoke-virtual {v8, p1}, Lorg/apache/log4j/lf5/Log4JLogRecord;->setThrownStackTrace(Lorg/apache/log4j/spi/ThrowableInformation;)V
					 /* .line 18 */
				 } // :cond_1
				 try { // :try_start_0
					 org.apache.log4j.lf5.LogLevel .valueOf ( v4 );
					 (( org.apache.log4j.lf5.LogRecord ) v8 ).setLevel ( p1 ); // invoke-virtual {v8, p1}, Lorg/apache/log4j/lf5/LogRecord;->setLevel(Lorg/apache/log4j/lf5/LogLevel;)V
					 /* :try_end_0 */
					 /* .catch Lorg/apache/log4j/lf5/LogLevelFormatException; {:try_start_0 ..:try_end_0} :catch_0 */
					 /* .line 19 */
					 /* :catch_0 */
					 p1 = org.apache.log4j.lf5.LogLevel.WARN;
					 (( org.apache.log4j.lf5.LogRecord ) v8 ).setLevel ( p1 ); // invoke-virtual {v8, p1}, Lorg/apache/log4j/lf5/LogRecord;->setLevel(Lorg/apache/log4j/lf5/LogLevel;)V
					 /* .line 20 */
				 } // :goto_1
				 p1 = this.h;
				 if ( p1 != null) { // if-eqz p1, :cond_2
					 /* .line 21 */
					 (( org.apache.log4j.lf5.viewer.LogBrokerMonitor ) p1 ).addMessage ( v8 ); // invoke-virtual {p1, v8}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->addMessage(Lorg/apache/log4j/lf5/LogRecord;)V
				 } // :cond_2
				 return;
			 } // .end method
			 public void close ( ) {
				 /* .locals 0 */
				 return;
			 } // .end method
			 public Boolean equals ( org.apache.log4j.lf5.LF5Appender p0 ) {
				 /* .locals 1 */
				 /* .line 1 */
				 v0 = this.h;
				 (( org.apache.log4j.lf5.LF5Appender ) p1 ).getLogBrokerMonitor ( ); // invoke-virtual {p1}, Lorg/apache/log4j/lf5/LF5Appender;->getLogBrokerMonitor()Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;
				 /* if-ne v0, p1, :cond_0 */
				 int p1 = 1; // const/4 p1, 0x1
			 } // :cond_0
			 int p1 = 0; // const/4 p1, 0x0
		 } // :goto_0
	 } // .end method
	 public org.apache.log4j.lf5.viewer.LogBrokerMonitor getLogBrokerMonitor ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.h;
	 } // .end method
	 public Boolean requiresLayout ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // .end method
	 public void setCallSystemExitOnClose ( Boolean p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.h;
		 (( org.apache.log4j.lf5.viewer.LogBrokerMonitor ) v0 ).setCallSystemExitOnClose ( p1 ); // invoke-virtual {v0, p1}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->setCallSystemExitOnClose(Z)V
		 return;
	 } // .end method
	 public void setMaxNumberOfRecords ( Integer p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = org.apache.log4j.lf5.LF5Appender.i;
		 (( org.apache.log4j.lf5.viewer.LogBrokerMonitor ) v0 ).setMaxNumberOfLogRecords ( p1 ); // invoke-virtual {v0, p1}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->setMaxNumberOfLogRecords(I)V
		 return;
	 } // .end method
