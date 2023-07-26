public class m.a.b.m.a extends java.lang.Thread {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public Integer b;
	 public org.apache.log4j.varia.ExternallyRolledFileAppender c;
	 /* # direct methods */
	 public m.a.b.m.a ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Thread;-><init>()V */
		 /* .line 2 */
		 this.c = p1;
		 /* .line 3 */
		 /* iput p2, p0, Lm/a/b/m/a;->b:I */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void run ( ) {
		 /* .locals 5 */
		 /* .line 1 */
	 } // :goto_0
	 v0 = 	 (( java.lang.Thread ) p0 ).isInterrupted ( ); // invoke-virtual {p0}, Ljava/lang/Thread;->isInterrupted()Z
	 /* if-nez v0, :cond_0 */
	 /* .line 2 */
	 try { // :try_start_0
		 /* new-instance v0, Ljava/net/ServerSocket; */
		 /* iget v1, p0, Lm/a/b/m/a;->b:I */
		 /* invoke-direct {v0, v1}, Ljava/net/ServerSocket;-><init>(I)V */
		 /* .line 3 */
	 } // :goto_1
	 (( java.net.ServerSocket ) v0 ).accept ( ); // invoke-virtual {v0}, Ljava/net/ServerSocket;->accept()Ljava/net/Socket;
	 /* .line 4 */
	 /* new-instance v2, Ljava/lang/StringBuffer; */
	 /* invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V */
	 final String v3 = "Connected to client at "; // const-string v3, "Connected to client at "
	 (( java.lang.StringBuffer ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 (( java.net.Socket ) v1 ).getInetAddress ( ); // invoke-virtual {v1}, Ljava/net/Socket;->getInetAddress()Ljava/net/InetAddress;
	 (( java.lang.StringBuffer ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;
	 (( java.lang.StringBuffer ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
	 org.apache.log4j.helpers.LogLog .debug ( v2 );
	 /* .line 5 */
	 /* new-instance v2, Ljava/lang/Thread; */
	 /* new-instance v3, Lm/a/b/m/b; */
	 v4 = this.c;
	 /* invoke-direct {v3, v1, v4}, Lm/a/b/m/b;-><init>(Ljava/net/Socket;Lorg/apache/log4j/varia/ExternallyRolledFileAppender;)V */
	 final String v1 = "ExternallyRolledFileAppender-HUP"; // const-string v1, "ExternallyRolledFileAppender-HUP"
	 /* invoke-direct {v2, v3, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V */
	 (( java.lang.Thread ) v2 ).start ( ); // invoke-virtual {v2}, Ljava/lang/Thread;->start()V
	 /* :try_end_0 */
	 /* .catch Ljava/io/InterruptedIOException; {:try_start_0 ..:try_end_0} :catch_2 */
	 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_1 */
	 /* .catch Ljava/lang/RuntimeException; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* :catch_0 */
	 /* move-exception v0 */
	 /* .line 6 */
	 (( java.lang.RuntimeException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/RuntimeException;->printStackTrace()V
	 /* :catch_1 */
	 /* move-exception v0 */
	 /* .line 7 */
	 (( java.io.IOException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
	 /* :catch_2 */
	 /* move-exception v0 */
	 /* .line 8 */
	 java.lang.Thread .currentThread ( );
	 (( java.lang.Thread ) v1 ).interrupt ( ); // invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V
	 /* .line 9 */
	 (( java.io.InterruptedIOException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/io/InterruptedIOException;->printStackTrace()V
} // :cond_0
return;
} // .end method
