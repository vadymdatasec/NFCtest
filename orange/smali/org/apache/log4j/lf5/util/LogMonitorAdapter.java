public class org.apache.log4j.lf5.util.LogMonitorAdapter {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final Integer JDK14_LOG_LEVELS;
	 public static final Integer LOG4J_LOG_LEVELS;
	 /* # instance fields */
	 public org.apache.log4j.lf5.viewer.LogBrokerMonitor a;
	 public org.apache.log4j.lf5.LogLevel b;
	 /* # direct methods */
	 public org.apache.log4j.lf5.util.LogMonitorAdapter ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 2 */
		 this.b = v0;
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 3 */
		 /* check-cast v0, Lorg/apache/log4j/lf5/LogLevel; */
		 this.b = v0;
		 /* .line 4 */
		 /* new-instance v0, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor; */
		 /* invoke-direct {v0, p1}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;-><init>(Ljava/util/List;)V */
		 this.a = v0;
		 /* .line 5 */
		 p1 = 		 org.apache.log4j.lf5.util.LogMonitorAdapter .b ( );
		 v1 = 		 org.apache.log4j.lf5.util.LogMonitorAdapter .a ( );
		 (( org.apache.log4j.lf5.viewer.LogBrokerMonitor ) v0 ).setFrameSize ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->setFrameSize(II)V
		 /* .line 6 */
		 p1 = this.a;
		 /* const/16 v0, 0xc */
		 (( org.apache.log4j.lf5.viewer.LogBrokerMonitor ) p1 ).setFontSize ( v0 ); // invoke-virtual {p1, v0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->setFontSize(I)V
		 /* .line 7 */
		 p1 = this.a;
		 (( org.apache.log4j.lf5.viewer.LogBrokerMonitor ) p1 ).show ( ); // invoke-virtual {p1}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->show()V
		 return;
	 } // .end method
	 public static Integer a ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = 		 org.apache.log4j.lf5.util.LogMonitorAdapter .c ( );
		 /* mul-int/lit8 v0, v0, 0x3 */
		 /* div-int/lit8 v0, v0, 0x4 */
	 } // .end method
	 public static Integer b ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = 		 org.apache.log4j.lf5.util.LogMonitorAdapter .d ( );
		 /* mul-int/lit8 v0, v0, 0x3 */
		 /* div-int/lit8 v0, v0, 0x4 */
	 } // .end method
	 public static Integer c ( ) {
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
		 public static Integer d ( ) {
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
			 public static org.apache.log4j.lf5.util.LogMonitorAdapter newInstance ( Integer p0 ) {
				 /* .locals 1 */
				 int v0 = 1; // const/4 v0, 0x1
				 /* if-ne p0, v0, :cond_0 */
				 /* .line 1 */
				 org.apache.log4j.lf5.LogLevel .getJdk14Levels ( );
				 org.apache.log4j.lf5.util.LogMonitorAdapter .newInstance ( p0 );
				 /* .line 2 */
				 v0 = org.apache.log4j.lf5.LogLevel.FINEST;
				 (( org.apache.log4j.lf5.util.LogMonitorAdapter ) p0 ).setDefaultLevel ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/log4j/lf5/util/LogMonitorAdapter;->setDefaultLevel(Lorg/apache/log4j/lf5/LogLevel;)V
				 /* .line 3 */
				 v0 = org.apache.log4j.lf5.LogLevel.SEVERE;
				 (( org.apache.log4j.lf5.util.LogMonitorAdapter ) p0 ).setSevereLevel ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/log4j/lf5/util/LogMonitorAdapter;->setSevereLevel(Lorg/apache/log4j/lf5/LogLevel;)V
				 /* .line 4 */
			 } // :cond_0
			 org.apache.log4j.lf5.LogLevel .getLog4JLevels ( );
			 org.apache.log4j.lf5.util.LogMonitorAdapter .newInstance ( p0 );
			 /* .line 5 */
			 v0 = org.apache.log4j.lf5.LogLevel.DEBUG;
			 (( org.apache.log4j.lf5.util.LogMonitorAdapter ) p0 ).setDefaultLevel ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/log4j/lf5/util/LogMonitorAdapter;->setDefaultLevel(Lorg/apache/log4j/lf5/LogLevel;)V
			 /* .line 6 */
			 v0 = org.apache.log4j.lf5.LogLevel.FATAL;
			 (( org.apache.log4j.lf5.util.LogMonitorAdapter ) p0 ).setSevereLevel ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/log4j/lf5/util/LogMonitorAdapter;->setSevereLevel(Lorg/apache/log4j/lf5/LogLevel;)V
		 } // :goto_0
	 } // .end method
	 public static org.apache.log4j.lf5.util.LogMonitorAdapter newInstance ( java.util.List p0 ) {
		 /* .locals 1 */
		 /* .line 8 */
		 /* new-instance v0, Lorg/apache/log4j/lf5/util/LogMonitorAdapter; */
		 /* invoke-direct {v0, p0}, Lorg/apache/log4j/lf5/util/LogMonitorAdapter;-><init>(Ljava/util/List;)V */
	 } // .end method
	 public static org.apache.log4j.lf5.util.LogMonitorAdapter newInstance ( org.apache.log4j.lf5.LogLevel[] p0 ) {
		 /* .locals 0 */
		 /* if-nez p0, :cond_0 */
		 int p0 = 0; // const/4 p0, 0x0
		 /* .line 7 */
	 } // :cond_0
	 java.util.Arrays .asList ( p0 );
	 org.apache.log4j.lf5.util.LogMonitorAdapter .newInstance ( p0 );
} // .end method
/* # virtual methods */
public void addMessage ( org.apache.log4j.lf5.LogRecord p0 ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = this.a;
	 (( org.apache.log4j.lf5.viewer.LogBrokerMonitor ) v0 ).addMessage ( p1 ); // invoke-virtual {v0, p1}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->addMessage(Lorg/apache/log4j/lf5/LogRecord;)V
	 return;
} // .end method
public org.apache.log4j.lf5.LogLevel getDefaultLevel ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = this.b;
} // .end method
public org.apache.log4j.lf5.LogLevel getSevereLevel ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 org.apache.log4j.lf5.util.AdapterLogRecord .getSevereLevel ( );
} // .end method
public void log ( java.lang.String p0, java.lang.String p1 ) {
	 /* .locals 1 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 9 */
	 (( org.apache.log4j.lf5.util.LogMonitorAdapter ) p0 ).log ( p1, v0, p2 ); // invoke-virtual {p0, p1, v0, p2}, Lorg/apache/log4j/lf5/util/LogMonitorAdapter;->log(Ljava/lang/String;Lorg/apache/log4j/lf5/LogLevel;Ljava/lang/String;)V
	 return;
} // .end method
public void log ( java.lang.String p0, org.apache.log4j.lf5.LogLevel p1, java.lang.String p2 ) {
	 /* .locals 6 */
	 int v4 = 0; // const/4 v4, 0x0
	 int v5 = 0; // const/4 v5, 0x0
	 /* move-object v0, p0 */
	 /* move-object v1, p1 */
	 /* move-object v2, p2 */
	 /* move-object v3, p3 */
	 /* .line 12 */
	 /* invoke-virtual/range {v0 ..v5}, Lorg/apache/log4j/lf5/util/LogMonitorAdapter;->log(Ljava/lang/String;Lorg/apache/log4j/lf5/LogLevel;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V */
	 return;
} // .end method
public void log ( java.lang.String p0, org.apache.log4j.lf5.LogLevel p1, java.lang.String p2, java.lang.String p3 ) {
	 /* .locals 6 */
	 int v4 = 0; // const/4 v4, 0x0
	 /* move-object v0, p0 */
	 /* move-object v1, p1 */
	 /* move-object v2, p2 */
	 /* move-object v3, p3 */
	 /* move-object v5, p4 */
	 /* .line 10 */
	 /* invoke-virtual/range {v0 ..v5}, Lorg/apache/log4j/lf5/util/LogMonitorAdapter;->log(Ljava/lang/String;Lorg/apache/log4j/lf5/LogLevel;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V */
	 return;
} // .end method
public void log ( java.lang.String p0, org.apache.log4j.lf5.LogLevel p1, java.lang.String p2, java.lang.Throwable p3 ) {
	 /* .locals 6 */
	 int v5 = 0; // const/4 v5, 0x0
	 /* move-object v0, p0 */
	 /* move-object v1, p1 */
	 /* move-object v2, p2 */
	 /* move-object v3, p3 */
	 /* move-object v4, p4 */
	 /* .line 11 */
	 /* invoke-virtual/range {v0 ..v5}, Lorg/apache/log4j/lf5/util/LogMonitorAdapter;->log(Ljava/lang/String;Lorg/apache/log4j/lf5/LogLevel;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V */
	 return;
} // .end method
public void log ( java.lang.String p0, org.apache.log4j.lf5.LogLevel p1, java.lang.String p2, java.lang.Throwable p3, java.lang.String p4 ) {
	 /* .locals 1 */
	 /* .line 1 */
	 /* new-instance v0, Lorg/apache/log4j/lf5/util/AdapterLogRecord; */
	 /* invoke-direct {v0}, Lorg/apache/log4j/lf5/util/AdapterLogRecord;-><init>()V */
	 /* .line 2 */
	 (( org.apache.log4j.lf5.util.AdapterLogRecord ) v0 ).setCategory ( p1 ); // invoke-virtual {v0, p1}, Lorg/apache/log4j/lf5/util/AdapterLogRecord;->setCategory(Ljava/lang/String;)V
	 /* .line 3 */
	 (( org.apache.log4j.lf5.LogRecord ) v0 ).setMessage ( p3 ); // invoke-virtual {v0, p3}, Lorg/apache/log4j/lf5/LogRecord;->setMessage(Ljava/lang/String;)V
	 /* .line 4 */
	 (( org.apache.log4j.lf5.LogRecord ) v0 ).setNDC ( p5 ); // invoke-virtual {v0, p5}, Lorg/apache/log4j/lf5/LogRecord;->setNDC(Ljava/lang/String;)V
	 /* .line 5 */
	 (( org.apache.log4j.lf5.LogRecord ) v0 ).setThrown ( p4 ); // invoke-virtual {v0, p4}, Lorg/apache/log4j/lf5/LogRecord;->setThrown(Ljava/lang/Throwable;)V
	 /* if-nez p2, :cond_0 */
	 /* .line 6 */
	 (( org.apache.log4j.lf5.util.LogMonitorAdapter ) p0 ).getDefaultLevel ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/util/LogMonitorAdapter;->getDefaultLevel()Lorg/apache/log4j/lf5/LogLevel;
	 (( org.apache.log4j.lf5.LogRecord ) v0 ).setLevel ( p1 ); // invoke-virtual {v0, p1}, Lorg/apache/log4j/lf5/LogRecord;->setLevel(Lorg/apache/log4j/lf5/LogLevel;)V
	 /* .line 7 */
} // :cond_0
(( org.apache.log4j.lf5.LogRecord ) v0 ).setLevel ( p2 ); // invoke-virtual {v0, p2}, Lorg/apache/log4j/lf5/LogRecord;->setLevel(Lorg/apache/log4j/lf5/LogLevel;)V
/* .line 8 */
} // :goto_0
(( org.apache.log4j.lf5.util.LogMonitorAdapter ) p0 ).addMessage ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/log4j/lf5/util/LogMonitorAdapter;->addMessage(Lorg/apache/log4j/lf5/LogRecord;)V
return;
} // .end method
public void setDefaultLevel ( org.apache.log4j.lf5.LogLevel p0 ) {
/* .locals 0 */
/* .line 1 */
this.b = p1;
return;
} // .end method
public void setMaxNumberOfRecords ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
(( org.apache.log4j.lf5.viewer.LogBrokerMonitor ) v0 ).setMaxNumberOfLogRecords ( p1 ); // invoke-virtual {v0, p1}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->setMaxNumberOfLogRecords(I)V
return;
} // .end method
public void setSevereLevel ( org.apache.log4j.lf5.LogLevel p0 ) {
/* .locals 0 */
/* .line 1 */
org.apache.log4j.lf5.util.AdapterLogRecord .setSevereLevel ( p1 );
return;
} // .end method
