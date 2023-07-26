public abstract class org.apache.log4j.AppenderSkeleton implements org.apache.log4j.Appender implements org.apache.log4j.spi.OptionHandler {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public org.apache.log4j.Layout a;
	 public java.lang.String b;
	 public org.apache.log4j.Priority c;
	 public org.apache.log4j.spi.ErrorHandler d;
	 public org.apache.log4j.spi.Filter e;
	 public org.apache.log4j.spi.Filter f;
	 public Boolean g;
	 /* # direct methods */
	 public org.apache.log4j.AppenderSkeleton ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 /* new-instance v0, Lorg/apache/log4j/helpers/OnlyOnceErrorHandler; */
		 /* invoke-direct {v0}, Lorg/apache/log4j/helpers/OnlyOnceErrorHandler;-><init>()V */
		 this.d = v0;
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 3 */
		 /* iput-boolean v0, p0, Lorg/apache/log4j/AppenderSkeleton;->g:Z */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void activateOptions ( ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 public void addFilter ( org.apache.log4j.spi.Filter p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.e;
		 /* if-nez v0, :cond_0 */
		 /* .line 2 */
		 this.f = p1;
		 this.e = p1;
		 /* .line 3 */
	 } // :cond_0
	 v0 = this.f;
	 (( org.apache.log4j.spi.Filter ) v0 ).setNext ( p1 ); // invoke-virtual {v0, p1}, Lorg/apache/log4j/spi/Filter;->setNext(Lorg/apache/log4j/spi/Filter;)V
	 /* .line 4 */
	 this.f = p1;
} // :goto_0
return;
} // .end method
public abstract void append ( org.apache.log4j.spi.LoggingEvent p0 ) {
} // .end method
public void clearFilters ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
this.f = v0;
this.e = v0;
return;
} // .end method
public synchronized void doAppend ( org.apache.log4j.spi.LoggingEvent p0 ) {
/* .locals 3 */
/* monitor-enter p0 */
/* .line 1 */
try { // :try_start_0
	 /* iget-boolean v0, p0, Lorg/apache/log4j/AppenderSkeleton;->g:Z */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 2 */
		 /* new-instance p1, Ljava/lang/StringBuffer; */
		 /* invoke-direct {p1}, Ljava/lang/StringBuffer;-><init>()V */
		 final String v0 = "Attempted to append to closed appender named ["; // const-string v0, "Attempted to append to closed appender named ["
		 (( java.lang.StringBuffer ) p1 ).append ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 v0 = this.b;
		 (( java.lang.StringBuffer ) p1 ).append ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 final String v0 = "]."; // const-string v0, "]."
		 (( java.lang.StringBuffer ) p1 ).append ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 (( java.lang.StringBuffer ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
		 org.apache.log4j.helpers.LogLog .error ( p1 );
		 /* :try_end_0 */
		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
		 /* .line 3 */
		 /* monitor-exit p0 */
		 return;
		 /* .line 4 */
	 } // :cond_0
	 try { // :try_start_1
		 (( org.apache.log4j.spi.LoggingEvent ) p1 ).getLevel ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getLevel()Lorg/apache/log4j/Level;
		 v0 = 		 (( org.apache.log4j.AppenderSkeleton ) p0 ).isAsSevereAsThreshold ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/log4j/AppenderSkeleton;->isAsSevereAsThreshold(Lorg/apache/log4j/Priority;)Z
		 /* :try_end_1 */
		 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
		 /* if-nez v0, :cond_1 */
		 /* .line 5 */
		 /* monitor-exit p0 */
		 return;
		 /* .line 6 */
	 } // :cond_1
	 try { // :try_start_2
		 v0 = this.e;
	 } // :goto_0
	 if ( v0 != null) { // if-eqz v0, :cond_4
		 /* .line 7 */
		 v1 = 		 (( org.apache.log4j.spi.Filter ) v0 ).decide ( p1 ); // invoke-virtual {v0, p1}, Lorg/apache/log4j/spi/Filter;->decide(Lorg/apache/log4j/spi/LoggingEvent;)I
		 int v2 = -1; // const/4 v2, -0x1
		 /* if-eq v1, v2, :cond_3 */
		 if ( v1 != null) { // if-eqz v1, :cond_2
			 int v2 = 1; // const/4 v2, 0x1
			 /* if-eq v1, v2, :cond_4 */
			 /* .line 8 */
		 } // :cond_2
		 (( org.apache.log4j.spi.Filter ) v0 ).getNext ( ); // invoke-virtual {v0}, Lorg/apache/log4j/spi/Filter;->getNext()Lorg/apache/log4j/spi/Filter;
		 /* :try_end_2 */
		 /* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
		 /* .line 9 */
	 } // :cond_3
	 /* monitor-exit p0 */
	 return;
	 /* .line 10 */
} // :cond_4
try { // :try_start_3
	 (( org.apache.log4j.AppenderSkeleton ) p0 ).append ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/log4j/AppenderSkeleton;->append(Lorg/apache/log4j/spi/LoggingEvent;)V
	 /* :try_end_3 */
	 /* .catchall {:try_start_3 ..:try_end_3} :catchall_0 */
	 /* .line 11 */
	 /* monitor-exit p0 */
	 return;
	 /* :catchall_0 */
	 /* move-exception p1 */
	 /* monitor-exit p0 */
	 /* throw p1 */
} // .end method
public void finalize ( ) {
	 /* .locals 2 */
	 /* .line 1 */
	 /* iget-boolean v0, p0, Lorg/apache/log4j/AppenderSkeleton;->g:Z */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 return;
		 /* .line 2 */
	 } // :cond_0
	 /* new-instance v0, Ljava/lang/StringBuffer; */
	 /* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
	 final String v1 = "Finalizing appender named ["; // const-string v1, "Finalizing appender named ["
	 (( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 v1 = this.b;
	 (( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 final String v1 = "]."; // const-string v1, "]."
	 (( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 (( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
	 org.apache.log4j.helpers.LogLog .debug ( v0 );
	 /* .line 3 */
	 return;
} // .end method
public org.apache.log4j.spi.ErrorHandler getErrorHandler ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = this.d;
} // .end method
public org.apache.log4j.spi.Filter getFilter ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = this.e;
} // .end method
public final org.apache.log4j.spi.Filter getFirstFilter ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = this.e;
} // .end method
public org.apache.log4j.Layout getLayout ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = this.a;
} // .end method
public final java.lang.String getName ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = this.b;
} // .end method
public org.apache.log4j.Priority getThreshold ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = this.c;
} // .end method
public Boolean isAsSevereAsThreshold ( org.apache.log4j.Priority p0 ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = this.c;
	 if ( v0 != null) { // if-eqz v0, :cond_1
		 p1 = 		 (( org.apache.log4j.Priority ) p1 ).isGreaterOrEqual ( v0 ); // invoke-virtual {p1, v0}, Lorg/apache/log4j/Priority;->isGreaterOrEqual(Lorg/apache/log4j/Priority;)Z
		 if ( p1 != null) { // if-eqz p1, :cond_0
		 } // :cond_0
		 int p1 = 0; // const/4 p1, 0x0
	 } // :cond_1
} // :goto_0
int p1 = 1; // const/4 p1, 0x1
} // :goto_1
} // .end method
public synchronized void setErrorHandler ( org.apache.log4j.spi.ErrorHandler p0 ) {
/* .locals 0 */
/* monitor-enter p0 */
/* if-nez p1, :cond_0 */
try { // :try_start_0
final String p1 = "You have tried to set a null error-handler."; // const-string p1, "You have tried to set a null error-handler."
/* .line 1 */
org.apache.log4j.helpers.LogLog .warn ( p1 );
/* .line 2 */
} // :cond_0
this.d = p1;
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 3 */
} // :goto_0
/* monitor-exit p0 */
return;
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit p0 */
/* throw p1 */
} // .end method
public void setLayout ( org.apache.log4j.Layout p0 ) {
/* .locals 0 */
/* .line 1 */
this.a = p1;
return;
} // .end method
public void setName ( java.lang.String p0 ) {
/* .locals 0 */
/* .line 1 */
this.b = p1;
return;
} // .end method
public void setThreshold ( org.apache.log4j.Priority p0 ) {
/* .locals 0 */
/* .line 1 */
this.c = p1;
return;
} // .end method
