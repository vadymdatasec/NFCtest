public class org.apache.log4j.AsyncAppender extends org.apache.log4j.AppenderSkeleton implements org.apache.log4j.spi.AppenderAttachable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lorg/apache/log4j/AsyncAppender$b;, */
	 /* Lorg/apache/log4j/AsyncAppender$a; */
	 /* } */
} // .end annotation
/* # static fields */
public static final Integer DEFAULT_BUFFER_SIZE;
/* # instance fields */
public final java.util.List h;
public final java.util.Map i;
public Integer j;
public final org.apache.log4j.helpers.AppenderAttachableImpl k;
public final java.lang.Thread l;
public Boolean m;
public Boolean n;
/* # direct methods */
public org.apache.log4j.AsyncAppender ( ) {
	 /* .locals 6 */
	 /* .line 1 */
	 /* invoke-direct {p0}, Lorg/apache/log4j/AppenderSkeleton;-><init>()V */
	 /* .line 2 */
	 /* new-instance v0, Ljava/util/ArrayList; */
	 /* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
	 this.h = v0;
	 /* .line 3 */
	 /* new-instance v0, Ljava/util/HashMap; */
	 /* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
	 this.i = v0;
	 /* const/16 v0, 0x80 */
	 /* .line 4 */
	 /* iput v0, p0, Lorg/apache/log4j/AsyncAppender;->j:I */
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 5 */
	 /* iput-boolean v0, p0, Lorg/apache/log4j/AsyncAppender;->m:Z */
	 int v0 = 1; // const/4 v0, 0x1
	 /* .line 6 */
	 /* iput-boolean v0, p0, Lorg/apache/log4j/AsyncAppender;->n:Z */
	 /* .line 7 */
	 /* new-instance v1, Lorg/apache/log4j/helpers/AppenderAttachableImpl; */
	 /* invoke-direct {v1}, Lorg/apache/log4j/helpers/AppenderAttachableImpl;-><init>()V */
	 this.k = v1;
	 /* .line 8 */
	 /* new-instance v1, Ljava/lang/Thread; */
	 /* new-instance v2, Lorg/apache/log4j/AsyncAppender$b; */
	 v3 = this.h;
	 v4 = this.i;
	 v5 = this.k;
	 /* invoke-direct {v2, p0, v3, v4, v5}, Lorg/apache/log4j/AsyncAppender$b;-><init>(Lorg/apache/log4j/AsyncAppender;Ljava/util/List;Ljava/util/Map;Lorg/apache/log4j/helpers/AppenderAttachableImpl;)V */
	 /* invoke-direct {v1, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V */
	 this.l = v1;
	 /* .line 9 */
	 (( java.lang.Thread ) v1 ).setDaemon ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/Thread;->setDaemon(Z)V
	 /* .line 10 */
	 v0 = this.l;
	 /* new-instance v1, Ljava/lang/StringBuffer; */
	 /* invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V */
	 final String v2 = "AsyncAppender-Dispatcher-"; // const-string v2, "AsyncAppender-Dispatcher-"
	 (( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 v2 = this.l;
	 (( java.lang.Thread ) v2 ).getName ( ); // invoke-virtual {v2}, Ljava/lang/Thread;->getName()Ljava/lang/String;
	 (( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 (( java.lang.StringBuffer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
	 (( java.lang.Thread ) v0 ).setName ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V
	 /* .line 11 */
	 v0 = this.l;
	 (( java.lang.Thread ) v0 ).start ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->start()V
	 return;
} // .end method
/* # virtual methods */
public void addAppender ( org.apache.log4j.Appender p0 ) {
	 /* .locals 2 */
	 /* .line 1 */
	 v0 = this.k;
	 /* monitor-enter v0 */
	 /* .line 2 */
	 try { // :try_start_0
		 v1 = this.k;
		 (( org.apache.log4j.helpers.AppenderAttachableImpl ) v1 ).addAppender ( p1 ); // invoke-virtual {v1, p1}, Lorg/apache/log4j/helpers/AppenderAttachableImpl;->addAppender(Lorg/apache/log4j/Appender;)V
		 /* .line 3 */
		 /* monitor-exit v0 */
		 return;
		 /* :catchall_0 */
		 /* move-exception p1 */
		 /* monitor-exit v0 */
		 /* :try_end_0 */
		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
		 /* throw p1 */
	 } // .end method
	 public void append ( org.apache.log4j.spi.LoggingEvent p0 ) {
		 /* .locals 4 */
		 /* .line 1 */
		 v0 = this.l;
		 if ( v0 != null) { // if-eqz v0, :cond_7
			 v0 = 			 (( java.lang.Thread ) v0 ).isAlive ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->isAlive()Z
			 if ( v0 != null) { // if-eqz v0, :cond_7
				 /* iget v0, p0, Lorg/apache/log4j/AsyncAppender;->j:I */
				 /* if-gtz v0, :cond_0 */
				 /* goto/16 :goto_2 */
				 /* .line 2 */
			 } // :cond_0
			 (( org.apache.log4j.spi.LoggingEvent ) p1 ).getNDC ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getNDC()Ljava/lang/String;
			 /* .line 3 */
			 (( org.apache.log4j.spi.LoggingEvent ) p1 ).getThreadName ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getThreadName()Ljava/lang/String;
			 /* .line 4 */
			 (( org.apache.log4j.spi.LoggingEvent ) p1 ).getMDCCopy ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getMDCCopy()V
			 /* .line 5 */
			 /* iget-boolean v0, p0, Lorg/apache/log4j/AsyncAppender;->m:Z */
			 if ( v0 != null) { // if-eqz v0, :cond_1
				 /* .line 6 */
				 (( org.apache.log4j.spi.LoggingEvent ) p1 ).getLocationInformation ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getLocationInformation()Lorg/apache/log4j/spi/LocationInfo;
				 /* .line 7 */
			 } // :cond_1
			 (( org.apache.log4j.spi.LoggingEvent ) p1 ).getRenderedMessage ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getRenderedMessage()Ljava/lang/String;
			 /* .line 8 */
			 (( org.apache.log4j.spi.LoggingEvent ) p1 ).getThrowableStrRep ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getThrowableStrRep()[Ljava/lang/String;
			 /* .line 9 */
			 v0 = this.h;
			 /* monitor-enter v0 */
			 /* .line 10 */
		 } // :cond_2
		 try { // :try_start_0
			 v1 = 			 v1 = this.h;
			 /* .line 11 */
			 /* iget v2, p0, Lorg/apache/log4j/AsyncAppender;->j:I */
			 /* if-ge v1, v2, :cond_3 */
			 /* .line 12 */
			 v2 = this.h;
			 /* if-nez v1, :cond_6 */
			 /* .line 13 */
			 p1 = this.h;
			 (( java.lang.Object ) p1 ).notifyAll ( ); // invoke-virtual {p1}, Ljava/lang/Object;->notifyAll()V
		 } // :cond_3
		 int v1 = 1; // const/4 v1, 0x1
		 /* .line 14 */
		 /* iget-boolean v2, p0, Lorg/apache/log4j/AsyncAppender;->n:Z */
		 if ( v2 != null) { // if-eqz v2, :cond_4
			 v2 = 			 java.lang.Thread .interrupted ( );
			 /* if-nez v2, :cond_4 */
			 java.lang.Thread .currentThread ( );
			 v3 = this.l;
			 /* :try_end_0 */
			 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
			 /* if-eq v2, v3, :cond_4 */
			 /* .line 15 */
			 try { // :try_start_1
				 v2 = this.h;
				 (( java.lang.Object ) v2 ).wait ( ); // invoke-virtual {v2}, Ljava/lang/Object;->wait()V
				 /* :try_end_1 */
				 /* .catch Ljava/lang/InterruptedException; {:try_start_1 ..:try_end_1} :catch_0 */
				 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
				 int v1 = 0; // const/4 v1, 0x0
				 /* .line 16 */
				 /* :catch_0 */
				 try { // :try_start_2
					 java.lang.Thread .currentThread ( );
					 (( java.lang.Thread ) v2 ).interrupt ( ); // invoke-virtual {v2}, Ljava/lang/Thread;->interrupt()V
				 } // :cond_4
			 } // :goto_0
			 if ( v1 != null) { // if-eqz v1, :cond_2
				 /* .line 17 */
				 (( org.apache.log4j.spi.LoggingEvent ) p1 ).getLoggerName ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getLoggerName()Ljava/lang/String;
				 /* .line 18 */
				 v2 = this.i;
				 /* check-cast v2, Lorg/apache/log4j/AsyncAppender$a; */
				 /* if-nez v2, :cond_5 */
				 /* .line 19 */
				 /* new-instance v2, Lorg/apache/log4j/AsyncAppender$a; */
				 /* invoke-direct {v2, p1}, Lorg/apache/log4j/AsyncAppender$a;-><init>(Lorg/apache/log4j/spi/LoggingEvent;)V */
				 /* .line 20 */
				 p1 = this.i;
				 /* .line 21 */
			 } // :cond_5
			 (( org.apache.log4j.AsyncAppender$a ) v2 ).a ( p1 ); // invoke-virtual {v2, p1}, Lorg/apache/log4j/AsyncAppender$a;->a(Lorg/apache/log4j/spi/LoggingEvent;)V
			 /* .line 22 */
		 } // :cond_6
	 } // :goto_1
	 /* monitor-exit v0 */
	 return;
	 /* :catchall_0 */
	 /* move-exception p1 */
	 /* monitor-exit v0 */
	 /* :try_end_2 */
	 /* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
	 /* throw p1 */
	 /* .line 23 */
} // :cond_7
} // :goto_2
v0 = this.k;
/* monitor-enter v0 */
/* .line 24 */
try { // :try_start_3
v1 = this.k;
(( org.apache.log4j.helpers.AppenderAttachableImpl ) v1 ).appendLoopOnAppenders ( p1 ); // invoke-virtual {v1, p1}, Lorg/apache/log4j/helpers/AppenderAttachableImpl;->appendLoopOnAppenders(Lorg/apache/log4j/spi/LoggingEvent;)I
/* .line 25 */
/* monitor-exit v0 */
return;
/* :catchall_1 */
/* move-exception p1 */
/* monitor-exit v0 */
/* :try_end_3 */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_1 */
/* throw p1 */
} // .end method
public void close ( ) {
/* .locals 4 */
/* .line 1 */
v0 = this.h;
/* monitor-enter v0 */
int v1 = 1; // const/4 v1, 0x1
/* .line 2 */
try { // :try_start_0
	 /* iput-boolean v1, p0, Lorg/apache/log4j/AppenderSkeleton;->g:Z */
	 /* .line 3 */
	 v1 = this.h;
	 (( java.lang.Object ) v1 ).notifyAll ( ); // invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V
	 /* .line 4 */
	 /* monitor-exit v0 */
	 /* :try_end_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_1 */
	 /* .line 5 */
	 try { // :try_start_1
		 v0 = this.l;
		 (( java.lang.Thread ) v0 ).join ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->join()V
		 /* :try_end_1 */
		 /* .catch Ljava/lang/InterruptedException; {:try_start_1 ..:try_end_1} :catch_0 */
		 /* :catch_0 */
		 /* move-exception v0 */
		 /* .line 6 */
		 java.lang.Thread .currentThread ( );
		 (( java.lang.Thread ) v1 ).interrupt ( ); // invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V
		 final String v1 = "Got an InterruptedException while waiting for the dispatcher to finish."; // const-string v1, "Got an InterruptedException while waiting for the dispatcher to finish."
		 /* .line 7 */
		 org.apache.log4j.helpers.LogLog .error ( v1,v0 );
		 /* .line 8 */
	 } // :goto_0
	 v1 = this.k;
	 /* monitor-enter v1 */
	 /* .line 9 */
	 try { // :try_start_2
		 v0 = this.k;
		 (( org.apache.log4j.helpers.AppenderAttachableImpl ) v0 ).getAllAppenders ( ); // invoke-virtual {v0}, Lorg/apache/log4j/helpers/AppenderAttachableImpl;->getAllAppenders()Ljava/util/Enumeration;
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 /* .line 10 */
		 } // :cond_0
	 v2 = 	 } // :goto_1
	 if ( v2 != null) { // if-eqz v2, :cond_1
		 /* .line 11 */
		 /* .line 12 */
		 /* instance-of v3, v2, Lorg/apache/log4j/Appender; */
		 if ( v3 != null) { // if-eqz v3, :cond_0
			 /* .line 13 */
			 /* check-cast v2, Lorg/apache/log4j/Appender; */
			 /* .line 14 */
		 } // :cond_1
		 /* monitor-exit v1 */
		 return;
		 /* :catchall_0 */
		 /* move-exception v0 */
		 /* monitor-exit v1 */
		 /* :try_end_2 */
		 /* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
		 /* throw v0 */
		 /* :catchall_1 */
		 /* move-exception v1 */
		 /* .line 15 */
		 try { // :try_start_3
			 /* monitor-exit v0 */
			 /* :try_end_3 */
			 /* .catchall {:try_start_3 ..:try_end_3} :catchall_1 */
			 /* throw v1 */
		 } // .end method
		 public java.util.Enumeration getAllAppenders ( ) {
			 /* .locals 2 */
			 /* .line 1 */
			 v0 = this.k;
			 /* monitor-enter v0 */
			 /* .line 2 */
			 try { // :try_start_0
				 v1 = this.k;
				 (( org.apache.log4j.helpers.AppenderAttachableImpl ) v1 ).getAllAppenders ( ); // invoke-virtual {v1}, Lorg/apache/log4j/helpers/AppenderAttachableImpl;->getAllAppenders()Ljava/util/Enumeration;
				 /* monitor-exit v0 */
				 /* :catchall_0 */
				 /* move-exception v1 */
				 /* .line 3 */
				 /* monitor-exit v0 */
				 /* :try_end_0 */
				 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
				 /* throw v1 */
			 } // .end method
			 public org.apache.log4j.Appender getAppender ( java.lang.String p0 ) {
				 /* .locals 2 */
				 /* .line 1 */
				 v0 = this.k;
				 /* monitor-enter v0 */
				 /* .line 2 */
				 try { // :try_start_0
					 v1 = this.k;
					 (( org.apache.log4j.helpers.AppenderAttachableImpl ) v1 ).getAppender ( p1 ); // invoke-virtual {v1, p1}, Lorg/apache/log4j/helpers/AppenderAttachableImpl;->getAppender(Ljava/lang/String;)Lorg/apache/log4j/Appender;
					 /* monitor-exit v0 */
					 /* :catchall_0 */
					 /* move-exception p1 */
					 /* .line 3 */
					 /* monitor-exit v0 */
					 /* :try_end_0 */
					 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
					 /* throw p1 */
				 } // .end method
				 public Boolean getBlocking ( ) {
					 /* .locals 1 */
					 /* .line 1 */
					 /* iget-boolean v0, p0, Lorg/apache/log4j/AsyncAppender;->n:Z */
				 } // .end method
				 public Integer getBufferSize ( ) {
					 /* .locals 1 */
					 /* .line 1 */
					 /* iget v0, p0, Lorg/apache/log4j/AsyncAppender;->j:I */
				 } // .end method
				 public Boolean getLocationInfo ( ) {
					 /* .locals 1 */
					 /* .line 1 */
					 /* iget-boolean v0, p0, Lorg/apache/log4j/AsyncAppender;->m:Z */
				 } // .end method
				 public Boolean isAttached ( org.apache.log4j.Appender p0 ) {
					 /* .locals 2 */
					 /* .line 1 */
					 v0 = this.k;
					 /* monitor-enter v0 */
					 /* .line 2 */
					 try { // :try_start_0
						 v1 = this.k;
						 p1 = 						 (( org.apache.log4j.helpers.AppenderAttachableImpl ) v1 ).isAttached ( p1 ); // invoke-virtual {v1, p1}, Lorg/apache/log4j/helpers/AppenderAttachableImpl;->isAttached(Lorg/apache/log4j/Appender;)Z
						 /* monitor-exit v0 */
						 /* :catchall_0 */
						 /* move-exception p1 */
						 /* .line 3 */
						 /* monitor-exit v0 */
						 /* :try_end_0 */
						 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
						 /* throw p1 */
					 } // .end method
					 public void removeAllAppenders ( ) {
						 /* .locals 2 */
						 /* .line 1 */
						 v0 = this.k;
						 /* monitor-enter v0 */
						 /* .line 2 */
						 try { // :try_start_0
							 v1 = this.k;
							 (( org.apache.log4j.helpers.AppenderAttachableImpl ) v1 ).removeAllAppenders ( ); // invoke-virtual {v1}, Lorg/apache/log4j/helpers/AppenderAttachableImpl;->removeAllAppenders()V
							 /* .line 3 */
							 /* monitor-exit v0 */
							 return;
							 /* :catchall_0 */
							 /* move-exception v1 */
							 /* monitor-exit v0 */
							 /* :try_end_0 */
							 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
							 /* throw v1 */
						 } // .end method
						 public void removeAppender ( java.lang.String p0 ) {
							 /* .locals 2 */
							 /* .line 4 */
							 v0 = this.k;
							 /* monitor-enter v0 */
							 /* .line 5 */
							 try { // :try_start_0
								 v1 = this.k;
								 (( org.apache.log4j.helpers.AppenderAttachableImpl ) v1 ).removeAppender ( p1 ); // invoke-virtual {v1, p1}, Lorg/apache/log4j/helpers/AppenderAttachableImpl;->removeAppender(Ljava/lang/String;)V
								 /* .line 6 */
								 /* monitor-exit v0 */
								 return;
								 /* :catchall_0 */
								 /* move-exception p1 */
								 /* monitor-exit v0 */
								 /* :try_end_0 */
								 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
								 /* throw p1 */
							 } // .end method
							 public void removeAppender ( org.apache.log4j.Appender p0 ) {
								 /* .locals 2 */
								 /* .line 1 */
								 v0 = this.k;
								 /* monitor-enter v0 */
								 /* .line 2 */
								 try { // :try_start_0
									 v1 = this.k;
									 (( org.apache.log4j.helpers.AppenderAttachableImpl ) v1 ).removeAppender ( p1 ); // invoke-virtual {v1, p1}, Lorg/apache/log4j/helpers/AppenderAttachableImpl;->removeAppender(Lorg/apache/log4j/Appender;)V
									 /* .line 3 */
									 /* monitor-exit v0 */
									 return;
									 /* :catchall_0 */
									 /* move-exception p1 */
									 /* monitor-exit v0 */
									 /* :try_end_0 */
									 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
									 /* throw p1 */
								 } // .end method
								 public Boolean requiresLayout ( ) {
									 /* .locals 1 */
									 int v0 = 0; // const/4 v0, 0x0
								 } // .end method
								 public void setBlocking ( Boolean p0 ) {
									 /* .locals 1 */
									 /* .line 1 */
									 v0 = this.h;
									 /* monitor-enter v0 */
									 /* .line 2 */
									 try { // :try_start_0
										 /* iput-boolean p1, p0, Lorg/apache/log4j/AsyncAppender;->n:Z */
										 /* .line 3 */
										 p1 = this.h;
										 (( java.lang.Object ) p1 ).notifyAll ( ); // invoke-virtual {p1}, Ljava/lang/Object;->notifyAll()V
										 /* .line 4 */
										 /* monitor-exit v0 */
										 return;
										 /* :catchall_0 */
										 /* move-exception p1 */
										 /* monitor-exit v0 */
										 /* :try_end_0 */
										 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
										 /* throw p1 */
									 } // .end method
									 public void setBufferSize ( Integer p0 ) {
										 /* .locals 2 */
										 /* if-ltz p1, :cond_1 */
										 /* .line 1 */
										 v0 = this.h;
										 /* monitor-enter v0 */
										 int v1 = 1; // const/4 v1, 0x1
										 /* if-ge p1, v1, :cond_0 */
										 int p1 = 1; // const/4 p1, 0x1
										 /* .line 2 */
									 } // :cond_0
									 try { // :try_start_0
										 /* iput p1, p0, Lorg/apache/log4j/AsyncAppender;->j:I */
										 /* .line 3 */
										 p1 = this.h;
										 (( java.lang.Object ) p1 ).notifyAll ( ); // invoke-virtual {p1}, Ljava/lang/Object;->notifyAll()V
										 /* .line 4 */
										 /* monitor-exit v0 */
										 return;
										 /* :catchall_0 */
										 /* move-exception p1 */
										 /* monitor-exit v0 */
										 /* :try_end_0 */
										 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
										 /* throw p1 */
										 /* .line 5 */
									 } // :cond_1
									 /* new-instance p1, Ljava/lang/NegativeArraySizeException; */
									 final String v0 = "size"; // const-string v0, "size"
									 /* invoke-direct {p1, v0}, Ljava/lang/NegativeArraySizeException;-><init>(Ljava/lang/String;)V */
									 /* throw p1 */
								 } // .end method
								 public void setLocationInfo ( Boolean p0 ) {
									 /* .locals 0 */
									 /* .line 1 */
									 /* iput-boolean p1, p0, Lorg/apache/log4j/AsyncAppender;->m:Z */
									 return;
								 } // .end method
