public class org.apache.log4j.net.TelnetAppender extends org.apache.log4j.AppenderSkeleton {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lorg/apache/log4j/net/TelnetAppender$SocketHandler; */
	 /* } */
} // .end annotation
/* # instance fields */
public org.apache.log4j.net.TelnetAppender$SocketHandler h;
public Integer i;
/* # direct methods */
public org.apache.log4j.net.TelnetAppender ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 /* invoke-direct {p0}, Lorg/apache/log4j/AppenderSkeleton;-><init>()V */
	 /* const/16 v0, 0x17 */
	 /* .line 2 */
	 /* iput v0, p0, Lorg/apache/log4j/net/TelnetAppender;->i:I */
	 return;
} // .end method
/* # virtual methods */
public void activateOptions ( ) {
	 /* .locals 2 */
	 /* .line 1 */
	 try { // :try_start_0
		 /* new-instance v0, Lorg/apache/log4j/net/TelnetAppender$SocketHandler; */
		 /* iget v1, p0, Lorg/apache/log4j/net/TelnetAppender;->i:I */
		 /* invoke-direct {v0, p0, v1}, Lorg/apache/log4j/net/TelnetAppender$SocketHandler;-><init>(Lorg/apache/log4j/net/TelnetAppender;I)V */
		 this.h = v0;
		 /* .line 2 */
		 (( java.lang.Thread ) v0 ).start ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->start()V
		 /* :try_end_0 */
		 /* .catch Ljava/io/InterruptedIOException; {:try_start_0 ..:try_end_0} :catch_2 */
		 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_1 */
		 /* .catch Ljava/lang/RuntimeException; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* :catch_0 */
		 /* move-exception v0 */
		 /* .line 3 */
		 (( java.lang.RuntimeException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/RuntimeException;->printStackTrace()V
		 /* :catch_1 */
		 /* move-exception v0 */
		 /* .line 4 */
		 (( java.io.IOException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
		 /* :catch_2 */
		 /* move-exception v0 */
		 /* .line 5 */
		 java.lang.Thread .currentThread ( );
		 (( java.lang.Thread ) v1 ).interrupt ( ); // invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V
		 /* .line 6 */
		 (( java.io.InterruptedIOException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/io/InterruptedIOException;->printStackTrace()V
		 /* .line 7 */
	 } // :goto_0
	 /* invoke-super {p0}, Lorg/apache/log4j/AppenderSkeleton;->activateOptions()V */
	 return;
} // .end method
public void append ( org.apache.log4j.spi.LoggingEvent p0 ) {
	 /* .locals 3 */
	 /* .line 1 */
	 v0 = this.h;
	 if ( v0 != null) { // if-eqz v0, :cond_1
		 /* .line 2 */
		 v1 = this.a;
		 (( org.apache.log4j.Layout ) v1 ).format ( p1 ); // invoke-virtual {v1, p1}, Lorg/apache/log4j/Layout;->format(Lorg/apache/log4j/spi/LoggingEvent;)Ljava/lang/String;
		 (( org.apache.log4j.net.TelnetAppender$SocketHandler ) v0 ).send ( v1 ); // invoke-virtual {v0, v1}, Lorg/apache/log4j/net/TelnetAppender$SocketHandler;->send(Ljava/lang/String;)V
		 /* .line 3 */
		 v0 = this.a;
		 v0 = 		 (( org.apache.log4j.Layout ) v0 ).ignoresThrowable ( ); // invoke-virtual {v0}, Lorg/apache/log4j/Layout;->ignoresThrowable()Z
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 /* .line 4 */
			 (( org.apache.log4j.spi.LoggingEvent ) p1 ).getThrowableStrRep ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getThrowableStrRep()[Ljava/lang/String;
			 if ( p1 != null) { // if-eqz p1, :cond_1
				 /* .line 5 */
				 /* new-instance v0, Ljava/lang/StringBuffer; */
				 /* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
				 int v1 = 0; // const/4 v1, 0x0
				 /* .line 6 */
			 } // :goto_0
			 /* array-length v2, p1 */
			 /* if-ge v1, v2, :cond_0 */
			 /* .line 7 */
			 /* aget-object v2, p1, v1 */
			 (( java.lang.StringBuffer ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
			 final String v2 = "\r\n"; // const-string v2, "\r\n"
			 /* .line 8 */
			 (( java.lang.StringBuffer ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
			 /* add-int/lit8 v1, v1, 0x1 */
			 /* .line 9 */
		 } // :cond_0
		 p1 = this.h;
		 (( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
		 (( org.apache.log4j.net.TelnetAppender$SocketHandler ) p1 ).send ( v0 ); // invoke-virtual {p1, v0}, Lorg/apache/log4j/net/TelnetAppender$SocketHandler;->send(Ljava/lang/String;)V
	 } // :cond_1
	 return;
} // .end method
public void close ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = this.h;
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 2 */
		 (( org.apache.log4j.net.TelnetAppender$SocketHandler ) v0 ).close ( ); // invoke-virtual {v0}, Lorg/apache/log4j/net/TelnetAppender$SocketHandler;->close()V
		 /* .line 3 */
		 try { // :try_start_0
			 v0 = this.h;
			 (( java.lang.Thread ) v0 ).join ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->join()V
			 /* :try_end_0 */
			 /* .catch Ljava/lang/InterruptedException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* .line 4 */
			 /* :catch_0 */
			 java.lang.Thread .currentThread ( );
			 (( java.lang.Thread ) v0 ).interrupt ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V
		 } // :cond_0
	 } // :goto_0
	 return;
} // .end method
public Integer getPort ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 /* iget v0, p0, Lorg/apache/log4j/net/TelnetAppender;->i:I */
} // .end method
public Boolean requiresLayout ( ) {
	 /* .locals 1 */
	 int v0 = 1; // const/4 v0, 0x1
} // .end method
public void setPort ( Integer p0 ) {
	 /* .locals 0 */
	 /* .line 1 */
	 /* iput p1, p0, Lorg/apache/log4j/net/TelnetAppender;->i:I */
	 return;
} // .end method
