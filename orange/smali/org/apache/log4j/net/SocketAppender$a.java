public class org.apache.log4j.net.SocketAppender$a extends java.lang.Thread {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lorg/apache/log4j/net/SocketAppender; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x1 */
/* name = "a" */
} // .end annotation
/* # instance fields */
public Boolean b;
public final org.apache.log4j.net.SocketAppender c; //synthetic
/* # direct methods */
public org.apache.log4j.net.SocketAppender$a ( ) {
/* .locals 0 */
/* .line 1 */
this.c = p1;
/* invoke-direct {p0}, Ljava/lang/Thread;-><init>()V */
int p1 = 0; // const/4 p1, 0x0
/* .line 2 */
/* iput-boolean p1, p0, Lorg/apache/log4j/net/SocketAppender$a;->b:Z */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 3 */
/* .line 1 */
} // :goto_0
/* iget-boolean v0, p0, Lorg/apache/log4j/net/SocketAppender$a;->b:Z */
/* if-nez v0, :cond_1 */
/* .line 2 */
try { // :try_start_0
v0 = this.c;
/* iget v0, v0, Lorg/apache/log4j/net/SocketAppender;->l:I */
/* int-to-long v0, v0 */
java.lang.Thread .sleep ( v0,v1 );
/* .line 3 */
/* new-instance v0, Ljava/lang/StringBuffer; */
/* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
final String v1 = "Attempting connection to "; // const-string v1, "Attempting connection to "
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
v1 = this.c;
v1 = this.i;
(( java.net.InetAddress ) v1 ).getHostName ( ); // invoke-virtual {v1}, Ljava/net/InetAddress;->getHostName()Ljava/lang/String;
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .debug ( v0 );
/* .line 4 */
/* new-instance v0, Ljava/net/Socket; */
v1 = this.c;
v1 = this.i;
v2 = this.c;
/* iget v2, v2, Lorg/apache/log4j/net/SocketAppender;->j:I */
/* invoke-direct {v0, v1, v2}, Ljava/net/Socket;-><init>(Ljava/net/InetAddress;I)V */
/* .line 5 */
/* monitor-enter p0 */
/* :try_end_0 */
/* .catch Ljava/lang/InterruptedException; {:try_start_0 ..:try_end_0} :catch_2 */
/* .catch Ljava/net/ConnectException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 6 */
try { // :try_start_1
	 v1 = this.c;
	 /* new-instance v2, Ljava/io/ObjectOutputStream; */
	 (( java.net.Socket ) v0 ).getOutputStream ( ); // invoke-virtual {v0}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;
	 /* invoke-direct {v2, v0}, Ljava/io/ObjectOutputStream;-><init>(Ljava/io/OutputStream;)V */
	 this.k = v2;
	 /* .line 7 */
	 v0 = this.c;
	 int v1 = 0; // const/4 v1, 0x0
	 org.apache.log4j.net.SocketAppender .a ( v0,v1 );
	 final String v0 = "Connection established.Exiting connector thread."; // const-string v0, "Connection established.Exiting connector thread."
	 /* .line 8 */
	 org.apache.log4j.helpers.LogLog .debug ( v0 );
	 /* .line 9 */
	 /* monitor-exit p0 */
	 /* :catchall_0 */
	 /* move-exception v0 */
	 /* .line 10 */
	 /* monitor-exit p0 */
	 /* :try_end_1 */
	 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
	 try { // :try_start_2
		 /* throw v0 */
		 /* :try_end_2 */
		 /* .catch Ljava/lang/InterruptedException; {:try_start_2 ..:try_end_2} :catch_2 */
		 /* .catch Ljava/net/ConnectException; {:try_start_2 ..:try_end_2} :catch_1 */
		 /* .catch Ljava/io/IOException; {:try_start_2 ..:try_end_2} :catch_0 */
		 /* :catch_0 */
		 /* move-exception v0 */
		 /* .line 11 */
		 /* instance-of v1, v0, Ljava/io/InterruptedIOException; */
		 if ( v1 != null) { // if-eqz v1, :cond_0
			 /* .line 12 */
			 java.lang.Thread .currentThread ( );
			 (( java.lang.Thread ) v1 ).interrupt ( ); // invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V
			 /* .line 13 */
		 } // :cond_0
		 /* new-instance v1, Ljava/lang/StringBuffer; */
		 /* invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V */
		 final String v2 = "Could not connect to "; // const-string v2, "Could not connect to "
		 (( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 v2 = this.c;
		 v2 = this.i;
		 (( java.net.InetAddress ) v2 ).getHostName ( ); // invoke-virtual {v2}, Ljava/net/InetAddress;->getHostName()Ljava/lang/String;
		 (( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 final String v2 = ".Exception is "; // const-string v2, ".Exception is "
		 (( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 (( java.lang.StringBuffer ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;
		 (( java.lang.StringBuffer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
		 org.apache.log4j.helpers.LogLog .debug ( v0 );
		 /* goto/16 :goto_0 */
		 /* .line 14 */
		 /* :catch_1 */
		 /* new-instance v0, Ljava/lang/StringBuffer; */
		 /* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
		 final String v1 = "Remote host "; // const-string v1, "Remote host "
		 (( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 v1 = this.c;
		 v1 = this.i;
		 (( java.net.InetAddress ) v1 ).getHostName ( ); // invoke-virtual {v1}, Ljava/net/InetAddress;->getHostName()Ljava/lang/String;
		 (( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 final String v1 = " refused connection."; // const-string v1, " refused connection."
		 (( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 (( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
		 org.apache.log4j.helpers.LogLog .debug ( v0 );
		 /* goto/16 :goto_0 */
		 /* :catch_2 */
		 final String v0 = "Connector interrupted.Leaving loop."; // const-string v0, "Connector interrupted.Leaving loop."
		 /* .line 15 */
		 org.apache.log4j.helpers.LogLog .debug ( v0 );
	 } // :cond_1
} // :goto_1
return;
} // .end method
