public class org.apache.log4j.net.SocketHubAppender$a implements java.lang.Runnable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lorg/apache/log4j/net/SocketHubAppender; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x1 */
/* name = "a" */
} // .end annotation
/* # instance fields */
public Integer b;
public java.util.Vector c;
public Boolean d;
public java.lang.Thread e;
public final org.apache.log4j.net.SocketHubAppender f; //synthetic
/* # direct methods */
public org.apache.log4j.net.SocketHubAppender$a ( ) {
/* .locals 0 */
/* .line 1 */
this.f = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
/* iput p2, p0, Lorg/apache/log4j/net/SocketHubAppender$a;->b:I */
/* .line 3 */
this.c = p3;
int p1 = 1; // const/4 p1, 0x1
/* .line 4 */
/* iput-boolean p1, p0, Lorg/apache/log4j/net/SocketHubAppender$a;->d:Z */
/* .line 5 */
/* new-instance p2, Ljava/lang/Thread; */
/* invoke-direct {p2, p0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V */
this.e = p2;
/* .line 6 */
(( java.lang.Thread ) p2 ).setDaemon ( p1 ); // invoke-virtual {p2, p1}, Ljava/lang/Thread;->setDaemon(Z)V
/* .line 7 */
p1 = this.e;
/* new-instance p2, Ljava/lang/StringBuffer; */
/* invoke-direct {p2}, Ljava/lang/StringBuffer;-><init>()V */
final String p3 = "SocketHubAppender-Monitor-"; // const-string p3, "SocketHubAppender-Monitor-"
(( java.lang.StringBuffer ) p2 ).append ( p3 ); // invoke-virtual {p2, p3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* iget p3, p0, Lorg/apache/log4j/net/SocketHubAppender$a;->b:I */
(( java.lang.StringBuffer ) p2 ).append ( p3 ); // invoke-virtual {p2, p3}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
(( java.lang.Thread ) p1 ).setName ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V
/* .line 8 */
p1 = this.e;
(( java.lang.Thread ) p1 ).start ( ); // invoke-virtual {p1}, Ljava/lang/Thread;->start()V
return;
} // .end method
/* # virtual methods */
public synchronized void a ( ) {
/* .locals 2 */
/* monitor-enter p0 */
/* .line 1 */
try { // :try_start_0
	 /* iget-boolean v0, p0, Lorg/apache/log4j/net/SocketHubAppender$a;->d:Z */
	 if ( v0 != null) { // if-eqz v0, :cond_1
		 final String v0 = "server monitor thread shutting down"; // const-string v0, "server monitor thread shutting down"
		 /* .line 2 */
		 org.apache.log4j.helpers.LogLog .debug ( v0 );
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 3 */
		 /* iput-boolean v0, p0, Lorg/apache/log4j/net/SocketHubAppender$a;->d:Z */
		 /* :try_end_0 */
		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 4 */
		 try { // :try_start_1
			 v1 = this.f;
			 org.apache.log4j.net.SocketHubAppender .a ( v1 );
			 if ( v1 != null) { // if-eqz v1, :cond_0
				 /* .line 5 */
				 v1 = this.f;
				 org.apache.log4j.net.SocketHubAppender .a ( v1 );
				 (( java.net.ServerSocket ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/net/ServerSocket;->close()V
				 /* .line 6 */
				 v1 = this.f;
				 org.apache.log4j.net.SocketHubAppender .a ( v1,v0 );
				 /* :try_end_1 */
				 /* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_0 */
				 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
				 /* .line 7 */
				 /* :catch_0 */
			 } // :cond_0
			 try { // :try_start_2
				 v1 = this.e;
				 (( java.lang.Thread ) v1 ).join ( ); // invoke-virtual {v1}, Ljava/lang/Thread;->join()V
				 /* :try_end_2 */
				 /* .catch Ljava/lang/InterruptedException; {:try_start_2 ..:try_end_2} :catch_1 */
				 /* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
				 /* .line 8 */
				 /* :catch_1 */
				 try { // :try_start_3
					 java.lang.Thread .currentThread ( );
					 (( java.lang.Thread ) v1 ).interrupt ( ); // invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V
					 /* .line 9 */
				 } // :goto_0
				 this.e = v0;
				 final String v0 = "server monitor thread shut down"; // const-string v0, "server monitor thread shut down"
				 /* .line 10 */
				 org.apache.log4j.helpers.LogLog .debug ( v0 );
				 /* :try_end_3 */
				 /* .catchall {:try_start_3 ..:try_end_3} :catchall_0 */
				 /* .line 11 */
			 } // :cond_1
			 /* monitor-exit p0 */
			 return;
			 /* :catchall_0 */
			 /* move-exception v0 */
			 /* monitor-exit p0 */
			 /* throw v0 */
		 } // .end method
		 public final void a ( java.io.ObjectOutputStream p0 ) {
			 /* .locals 2 */
			 /* .annotation system Ldalvik/annotation/Throws; */
			 /* value = { */
			 /* Ljava/io/IOException; */
			 /* } */
		 } // .end annotation
		 /* .line 12 */
		 v0 = this.f;
		 org.apache.log4j.net.SocketHubAppender .b ( v0 );
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 int v0 = 0; // const/4 v0, 0x0
			 /* .line 13 */
		 } // :goto_0
		 v1 = this.f;
		 org.apache.log4j.net.SocketHubAppender .b ( v1 );
		 v1 = 		 (( org.apache.log4j.helpers.CyclicBuffer ) v1 ).length ( ); // invoke-virtual {v1}, Lorg/apache/log4j/helpers/CyclicBuffer;->length()I
		 /* if-ge v0, v1, :cond_0 */
		 /* .line 14 */
		 v1 = this.f;
		 org.apache.log4j.net.SocketHubAppender .b ( v1 );
		 (( org.apache.log4j.helpers.CyclicBuffer ) v1 ).get ( v0 ); // invoke-virtual {v1, v0}, Lorg/apache/log4j/helpers/CyclicBuffer;->get(I)Lorg/apache/log4j/spi/LoggingEvent;
		 (( java.io.ObjectOutputStream ) p1 ).writeObject ( v1 ); // invoke-virtual {p1, v1}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V
		 /* add-int/lit8 v0, v0, 0x1 */
		 /* .line 15 */
	 } // :cond_0
	 (( java.io.ObjectOutputStream ) p1 ).flush ( ); // invoke-virtual {p1}, Ljava/io/ObjectOutputStream;->flush()V
	 /* .line 16 */
	 (( java.io.ObjectOutputStream ) p1 ).reset ( ); // invoke-virtual {p1}, Ljava/io/ObjectOutputStream;->reset()V
} // :cond_1
return;
} // .end method
public void run ( ) {
/* .locals 6 */
final String v0 = "exception setting timeout, shutting down server socket."; // const-string v0, "exception setting timeout, shutting down server socket."
/* .line 1 */
v1 = this.f;
int v2 = 0; // const/4 v2, 0x0
org.apache.log4j.net.SocketHubAppender .a ( v1,v2 );
int v1 = 0; // const/4 v1, 0x0
/* .line 2 */
try { // :try_start_0
	 v3 = this.f;
	 v4 = this.f;
	 /* iget v5, p0, Lorg/apache/log4j/net/SocketHubAppender$a;->b:I */
	 (( org.apache.log4j.net.SocketHubAppender ) v4 ).a ( v5 ); // invoke-virtual {v4, v5}, Lorg/apache/log4j/net/SocketHubAppender;->a(I)Ljava/net/ServerSocket;
	 org.apache.log4j.net.SocketHubAppender .a ( v3,v4 );
	 /* .line 3 */
	 v3 = this.f;
	 org.apache.log4j.net.SocketHubAppender .a ( v3 );
	 /* const/16 v4, 0x3e8 */
	 (( java.net.ServerSocket ) v3 ).setSoTimeout ( v4 ); // invoke-virtual {v3, v4}, Ljava/net/ServerSocket;->setSoTimeout(I)V
	 /* :try_end_0 */
	 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_b */
	 /* .line 4 */
	 try { // :try_start_1
		 v3 = this.f;
		 org.apache.log4j.net.SocketHubAppender .a ( v3 );
		 (( java.net.ServerSocket ) v3 ).setSoTimeout ( v4 ); // invoke-virtual {v3, v4}, Ljava/net/ServerSocket;->setSoTimeout(I)V
		 /* :try_end_1 */
		 /* .catch Ljava/net/SocketException; {:try_start_1 ..:try_end_1} :catch_6 */
		 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
		 /* .line 5 */
	 } // :cond_0
} // :goto_0
try { // :try_start_2
	 /* iget-boolean v0, p0, Lorg/apache/log4j/net/SocketHubAppender$a;->d:Z */
	 /* :try_end_2 */
	 /* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
	 if ( v0 != null) { // if-eqz v0, :cond_3
		 /* .line 6 */
		 try { // :try_start_3
			 v0 = this.f;
			 org.apache.log4j.net.SocketHubAppender .a ( v0 );
			 (( java.net.ServerSocket ) v0 ).accept ( ); // invoke-virtual {v0}, Ljava/net/ServerSocket;->accept()Ljava/net/Socket;
			 /* :try_end_3 */
			 /* .catch Ljava/io/InterruptedIOException; {:try_start_3 ..:try_end_3} :catch_2 */
			 /* .catch Ljava/net/SocketException; {:try_start_3 ..:try_end_3} :catch_1 */
			 /* .catch Ljava/io/IOException; {:try_start_3 ..:try_end_3} :catch_0 */
			 /* .catchall {:try_start_3 ..:try_end_3} :catchall_0 */
			 /* :catch_0 */
			 /* move-exception v0 */
			 try { // :try_start_4
				 final String v3 = "exception accepting socket."; // const-string v3, "exception accepting socket."
				 /* .line 7 */
				 org.apache.log4j.helpers.LogLog .error ( v3,v0 );
				 /* :catch_1 */
				 /* move-exception v0 */
				 final String v3 = "exception accepting socket, shutting down server socket."; // const-string v3, "exception accepting socket, shutting down server socket."
				 /* .line 8 */
				 org.apache.log4j.helpers.LogLog .error ( v3,v0 );
				 /* .line 9 */
				 /* iput-boolean v1, p0, Lorg/apache/log4j/net/SocketHubAppender$a;->d:Z */
				 /* :try_end_4 */
				 /* .catchall {:try_start_4 ..:try_end_4} :catchall_0 */
				 /* :catch_2 */
			 } // :goto_1
			 /* move-object v0, v2 */
		 } // :goto_2
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 10 */
			 try { // :try_start_5
				 (( java.net.Socket ) v0 ).getInetAddress ( ); // invoke-virtual {v0}, Ljava/net/Socket;->getInetAddress()Ljava/net/InetAddress;
				 /* .line 11 */
				 /* new-instance v4, Ljava/lang/StringBuffer; */
				 /* invoke-direct {v4}, Ljava/lang/StringBuffer;-><init>()V */
				 final String v5 = "accepting connection from "; // const-string v5, "accepting connection from "
				 (( java.lang.StringBuffer ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
				 (( java.net.InetAddress ) v3 ).getHostName ( ); // invoke-virtual {v3}, Ljava/net/InetAddress;->getHostName()Ljava/lang/String;
				 (( java.lang.StringBuffer ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
				 final String v5 = " ("; // const-string v5, " ("
				 (( java.lang.StringBuffer ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
				 (( java.net.InetAddress ) v3 ).getHostAddress ( ); // invoke-virtual {v3}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;
				 (( java.lang.StringBuffer ) v4 ).append ( v3 ); // invoke-virtual {v4, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
				 final String v3 = ")"; // const-string v3, ")"
				 (( java.lang.StringBuffer ) v4 ).append ( v3 ); // invoke-virtual {v4, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
				 (( java.lang.StringBuffer ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
				 org.apache.log4j.helpers.LogLog .debug ( v3 );
				 /* .line 12 */
				 /* new-instance v3, Ljava/io/ObjectOutputStream; */
				 (( java.net.Socket ) v0 ).getOutputStream ( ); // invoke-virtual {v0}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;
				 /* invoke-direct {v3, v0}, Ljava/io/ObjectOutputStream;-><init>(Ljava/io/OutputStream;)V */
				 /* .line 13 */
				 v0 = this.f;
				 org.apache.log4j.net.SocketHubAppender .b ( v0 );
				 if ( v0 != null) { // if-eqz v0, :cond_1
					 v0 = this.f;
					 org.apache.log4j.net.SocketHubAppender .b ( v0 );
					 v0 = 					 (( org.apache.log4j.helpers.CyclicBuffer ) v0 ).length ( ); // invoke-virtual {v0}, Lorg/apache/log4j/helpers/CyclicBuffer;->length()I
					 /* if-lez v0, :cond_1 */
					 /* .line 14 */
					 (( org.apache.log4j.net.SocketHubAppender$a ) p0 ).a ( v3 ); // invoke-virtual {p0, v3}, Lorg/apache/log4j/net/SocketHubAppender$a;->a(Ljava/io/ObjectOutputStream;)V
					 /* .line 15 */
				 } // :cond_1
				 v0 = this.c;
				 (( java.util.Vector ) v0 ).addElement ( v3 ); // invoke-virtual {v0, v3}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V
				 /* :try_end_5 */
				 /* .catch Ljava/io/IOException; {:try_start_5 ..:try_end_5} :catch_3 */
				 /* .catchall {:try_start_5 ..:try_end_5} :catchall_0 */
				 /* :catch_3 */
				 /* move-exception v0 */
				 /* .line 16 */
				 try { // :try_start_6
					 /* instance-of v3, v0, Ljava/io/InterruptedIOException; */
					 if ( v3 != null) { // if-eqz v3, :cond_2
						 /* .line 17 */
						 java.lang.Thread .currentThread ( );
						 (( java.lang.Thread ) v3 ).interrupt ( ); // invoke-virtual {v3}, Ljava/lang/Thread;->interrupt()V
					 } // :cond_2
					 final String v3 = "exception creating output stream on socket."; // const-string v3, "exception creating output stream on socket."
					 /* .line 18 */
					 org.apache.log4j.helpers.LogLog .error ( v3,v0 );
					 /* :try_end_6 */
					 /* .catchall {:try_start_6 ..:try_end_6} :catchall_0 */
					 /* goto/16 :goto_0 */
					 /* .line 19 */
				 } // :cond_3
				 try { // :try_start_7
					 v0 = this.f;
					 org.apache.log4j.net.SocketHubAppender .a ( v0 );
					 (( java.net.ServerSocket ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/net/ServerSocket;->close()V
					 /* :try_end_7 */
					 /* .catch Ljava/io/InterruptedIOException; {:try_start_7 ..:try_end_7} :catch_4 */
					 /* .catch Ljava/io/IOException; {:try_start_7 ..:try_end_7} :catch_5 */
					 /* .line 20 */
					 /* :catch_4 */
					 java.lang.Thread .currentThread ( );
					 (( java.lang.Thread ) v0 ).interrupt ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V
					 /* :catch_5 */
				 } // :goto_3
				 return;
				 /* :catchall_0 */
				 /* move-exception v0 */
				 /* :catch_6 */
				 /* move-exception v1 */
				 /* .line 21 */
				 try { // :try_start_8
					 org.apache.log4j.helpers.LogLog .error ( v0,v1 );
					 /* :try_end_8 */
					 /* .catchall {:try_start_8 ..:try_end_8} :catchall_0 */
					 /* .line 22 */
					 try { // :try_start_9
						 v0 = this.f;
						 org.apache.log4j.net.SocketHubAppender .a ( v0 );
						 (( java.net.ServerSocket ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/net/ServerSocket;->close()V
						 /* :try_end_9 */
						 /* .catch Ljava/io/InterruptedIOException; {:try_start_9 ..:try_end_9} :catch_7 */
						 /* .catch Ljava/io/IOException; {:try_start_9 ..:try_end_9} :catch_8 */
						 /* .line 23 */
						 /* :catch_7 */
						 java.lang.Thread .currentThread ( );
						 (( java.lang.Thread ) v0 ).interrupt ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V
						 /* :catch_8 */
					 } // :goto_4
					 return;
					 /* .line 24 */
				 } // :goto_5
				 try { // :try_start_a
					 v1 = this.f;
					 org.apache.log4j.net.SocketHubAppender .a ( v1 );
					 (( java.net.ServerSocket ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/net/ServerSocket;->close()V
					 /* :try_end_a */
					 /* .catch Ljava/io/InterruptedIOException; {:try_start_a ..:try_end_a} :catch_9 */
					 /* .catch Ljava/io/IOException; {:try_start_a ..:try_end_a} :catch_a */
					 /* .line 25 */
					 /* :catch_9 */
					 java.lang.Thread .currentThread ( );
					 (( java.lang.Thread ) v1 ).interrupt ( ); // invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V
					 /* .line 26 */
					 /* :catch_a */
				 } // :goto_6
				 /* throw v0 */
				 /* :catch_b */
				 /* move-exception v2 */
				 /* .line 27 */
				 /* instance-of v3, v2, Ljava/io/InterruptedIOException; */
				 /* if-nez v3, :cond_4 */
				 /* instance-of v3, v2, Ljava/lang/InterruptedException; */
				 if ( v3 != null) { // if-eqz v3, :cond_5
					 /* .line 28 */
				 } // :cond_4
				 java.lang.Thread .currentThread ( );
				 (( java.lang.Thread ) v3 ).interrupt ( ); // invoke-virtual {v3}, Ljava/lang/Thread;->interrupt()V
				 /* .line 29 */
			 } // :cond_5
			 org.apache.log4j.helpers.LogLog .error ( v0,v2 );
			 /* .line 30 */
			 /* iput-boolean v1, p0, Lorg/apache/log4j/net/SocketHubAppender$a;->d:Z */
			 return;
		 } // .end method
