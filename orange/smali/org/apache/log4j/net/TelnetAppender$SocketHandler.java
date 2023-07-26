public class org.apache.log4j.net.TelnetAppender$SocketHandler extends java.lang.Thread {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lorg/apache/log4j/net/TelnetAppender; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x1 */
/* name = "SocketHandler" */
} // .end annotation
/* # instance fields */
public java.util.Vector b;
public java.util.Vector c;
public java.net.ServerSocket d;
public Integer e;
public final org.apache.log4j.net.TelnetAppender f; //synthetic
/* # direct methods */
public org.apache.log4j.net.TelnetAppender$SocketHandler ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
this.f = p1;
/* invoke-direct {p0}, Ljava/lang/Thread;-><init>()V */
/* .line 2 */
/* new-instance p1, Ljava/util/Vector; */
/* invoke-direct {p1}, Ljava/util/Vector;-><init>()V */
this.b = p1;
/* .line 3 */
/* new-instance p1, Ljava/util/Vector; */
/* invoke-direct {p1}, Ljava/util/Vector;-><init>()V */
this.c = p1;
/* const/16 p1, 0x14 */
/* .line 4 */
/* iput p1, p0, Lorg/apache/log4j/net/TelnetAppender$SocketHandler;->e:I */
/* .line 5 */
/* new-instance p1, Ljava/net/ServerSocket; */
/* invoke-direct {p1, p2}, Ljava/net/ServerSocket;-><init>(I)V */
this.d = p1;
/* .line 6 */
/* new-instance p1, Ljava/lang/StringBuffer; */
/* invoke-direct {p1}, Ljava/lang/StringBuffer;-><init>()V */
final String v0 = "TelnetAppender-"; // const-string v0, "TelnetAppender-"
(( java.lang.StringBuffer ) p1 ).append ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.Thread ) p0 ).getName ( ); // invoke-virtual {p0}, Ljava/lang/Thread;->getName()Ljava/lang/String;
(( java.lang.StringBuffer ) p1 ).append ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v0 = "-"; // const-string v0, "-"
(( java.lang.StringBuffer ) p1 ).append ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) p1 ).append ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
(( java.lang.Thread ) p0 ).setName ( p1 ); // invoke-virtual {p0, p1}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V
return;
} // .end method
/* # virtual methods */
public void close ( ) {
/* .locals 2 */
/* .line 1 */
/* monitor-enter p0 */
/* .line 2 */
try { // :try_start_0
v0 = this.c;
(( java.util.Vector ) v0 ).elements ( ); // invoke-virtual {v0}, Ljava/util/Vector;->elements()Ljava/util/Enumeration;
/* :catch_0 */
v1 = } // :goto_0
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 3 */
try { // :try_start_1
	 /* check-cast v1, Ljava/net/Socket; */
	 (( java.net.Socket ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/net/Socket;->close()V
	 /* :try_end_1 */
	 /* .catch Ljava/io/InterruptedIOException; {:try_start_1 ..:try_end_1} :catch_1 */
	 /* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_0 */
	 /* .catch Ljava/lang/RuntimeException; {:try_start_1 ..:try_end_1} :catch_0 */
	 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
	 /* .line 4 */
	 /* :catch_1 */
	 try { // :try_start_2
		 java.lang.Thread .currentThread ( );
		 (( java.lang.Thread ) v1 ).interrupt ( ); // invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V
		 /* .line 5 */
	 } // :cond_0
	 /* monitor-exit p0 */
	 /* :try_end_2 */
	 /* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
	 /* .line 6 */
	 try { // :try_start_3
		 v0 = this.d;
		 (( java.net.ServerSocket ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/net/ServerSocket;->close()V
		 /* :try_end_3 */
		 /* .catch Ljava/io/InterruptedIOException; {:try_start_3 ..:try_end_3} :catch_2 */
		 /* .catch Ljava/io/IOException; {:try_start_3 ..:try_end_3} :catch_3 */
		 /* .catch Ljava/lang/RuntimeException; {:try_start_3 ..:try_end_3} :catch_3 */
		 /* .line 7 */
		 /* :catch_2 */
		 java.lang.Thread .currentThread ( );
		 (( java.lang.Thread ) v0 ).interrupt ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V
		 /* :catch_3 */
	 } // :goto_1
	 return;
	 /* :catchall_0 */
	 /* move-exception v0 */
	 /* .line 8 */
	 try { // :try_start_4
		 /* monitor-exit p0 */
		 /* :try_end_4 */
		 /* .catchall {:try_start_4 ..:try_end_4} :catchall_0 */
		 /* throw v0 */
	 } // .end method
	 public void finalize ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 (( org.apache.log4j.net.TelnetAppender$SocketHandler ) p0 ).close ( ); // invoke-virtual {p0}, Lorg/apache/log4j/net/TelnetAppender$SocketHandler;->close()V
		 return;
	 } // .end method
	 public void run ( ) {
		 /* .locals 4 */
		 /* .line 1 */
	 } // :goto_0
	 v0 = this.d;
	 v0 = 	 (( java.net.ServerSocket ) v0 ).isClosed ( ); // invoke-virtual {v0}, Ljava/net/ServerSocket;->isClosed()Z
	 /* if-nez v0, :cond_3 */
	 /* .line 2 */
	 try { // :try_start_0
		 v0 = this.d;
		 (( java.net.ServerSocket ) v0 ).accept ( ); // invoke-virtual {v0}, Ljava/net/ServerSocket;->accept()Ljava/net/Socket;
		 /* .line 3 */
		 /* new-instance v1, Ljava/io/PrintWriter; */
		 (( java.net.Socket ) v0 ).getOutputStream ( ); // invoke-virtual {v0}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;
		 /* invoke-direct {v1, v2}, Ljava/io/PrintWriter;-><init>(Ljava/io/OutputStream;)V */
		 /* .line 4 */
		 v2 = this.c;
		 v2 = 		 (( java.util.Vector ) v2 ).size ( ); // invoke-virtual {v2}, Ljava/util/Vector;->size()I
		 /* iget v3, p0, Lorg/apache/log4j/net/TelnetAppender$SocketHandler;->e:I */
		 /* if-ge v2, v3, :cond_0 */
		 /* .line 5 */
		 /* monitor-enter p0 */
		 /* :try_end_0 */
		 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* .line 6 */
		 try { // :try_start_1
			 v2 = this.c;
			 (( java.util.Vector ) v2 ).addElement ( v0 ); // invoke-virtual {v2, v0}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V
			 /* .line 7 */
			 v0 = this.b;
			 (( java.util.Vector ) v0 ).addElement ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V
			 /* .line 8 */
			 /* new-instance v0, Ljava/lang/StringBuffer; */
			 /* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
			 final String v2 = "TelnetAppender v1.0 ("; // const-string v2, "TelnetAppender v1.0 ("
			 (( java.lang.StringBuffer ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
			 v2 = this.c;
			 v2 = 			 (( java.util.Vector ) v2 ).size ( ); // invoke-virtual {v2}, Ljava/util/Vector;->size()I
			 (( java.lang.StringBuffer ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;
			 final String v2 = " active connections)\r\n\r\n"; // const-string v2, " active connections)\r\n\r\n"
			 (( java.lang.StringBuffer ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
			 (( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
			 (( java.io.PrintWriter ) v1 ).print ( v0 ); // invoke-virtual {v1, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
			 /* .line 9 */
			 (( java.io.PrintWriter ) v1 ).flush ( ); // invoke-virtual {v1}, Ljava/io/PrintWriter;->flush()V
			 /* .line 10 */
			 /* monitor-exit p0 */
			 /* :catchall_0 */
			 /* move-exception v0 */
			 /* monitor-exit p0 */
			 /* :try_end_1 */
			 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
			 try { // :try_start_2
				 /* throw v0 */
			 } // :cond_0
			 final String v2 = "Too many connections.\r\n"; // const-string v2, "Too many connections.\r\n"
			 /* .line 11 */
			 (( java.io.PrintWriter ) v1 ).print ( v2 ); // invoke-virtual {v1, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
			 /* .line 12 */
			 (( java.io.PrintWriter ) v1 ).flush ( ); // invoke-virtual {v1}, Ljava/io/PrintWriter;->flush()V
			 /* .line 13 */
			 (( java.net.Socket ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/net/Socket;->close()V
			 /* :try_end_2 */
			 /* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_0 */
			 /* :catch_0 */
			 /* move-exception v0 */
			 /* .line 14 */
			 /* instance-of v1, v0, Ljava/io/InterruptedIOException; */
			 /* if-nez v1, :cond_1 */
			 /* instance-of v1, v0, Ljava/lang/InterruptedException; */
			 if ( v1 != null) { // if-eqz v1, :cond_2
				 /* .line 15 */
			 } // :cond_1
			 java.lang.Thread .currentThread ( );
			 (( java.lang.Thread ) v1 ).interrupt ( ); // invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V
			 /* .line 16 */
		 } // :cond_2
		 v1 = this.d;
		 v1 = 		 (( java.net.ServerSocket ) v1 ).isClosed ( ); // invoke-virtual {v1}, Ljava/net/ServerSocket;->isClosed()Z
		 /* if-nez v1, :cond_3 */
		 final String v1 = "Encountered error while in SocketHandler loop."; // const-string v1, "Encountered error while in SocketHandler loop."
		 /* .line 17 */
		 org.apache.log4j.helpers.LogLog .error ( v1,v0 );
		 /* .line 18 */
	 } // :cond_3
	 try { // :try_start_3
		 v0 = this.d;
		 (( java.net.ServerSocket ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/net/ServerSocket;->close()V
		 /* :try_end_3 */
		 /* .catch Ljava/io/InterruptedIOException; {:try_start_3 ..:try_end_3} :catch_1 */
		 /* .catch Ljava/io/IOException; {:try_start_3 ..:try_end_3} :catch_2 */
		 /* .line 19 */
		 /* :catch_1 */
		 java.lang.Thread .currentThread ( );
		 (( java.lang.Thread ) v0 ).interrupt ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V
		 /* :catch_2 */
	 } // :goto_1
	 return;
} // .end method
public synchronized void send ( java.lang.String p0 ) {
	 /* .locals 3 */
	 /* monitor-enter p0 */
	 /* .line 1 */
	 try { // :try_start_0
		 v0 = this.c;
		 (( java.util.Vector ) v0 ).iterator ( ); // invoke-virtual {v0}, Ljava/util/Vector;->iterator()Ljava/util/Iterator;
		 /* .line 2 */
		 v1 = this.b;
		 (( java.util.Vector ) v1 ).iterator ( ); // invoke-virtual {v1}, Ljava/util/Vector;->iterator()Ljava/util/Iterator;
	 } // :cond_0
v2 = } // :goto_0
if ( v2 != null) { // if-eqz v2, :cond_1
	 /* .line 3 */
	 /* .line 4 */
	 /* check-cast v2, Ljava/io/PrintWriter; */
	 /* .line 5 */
	 (( java.io.PrintWriter ) v2 ).print ( p1 ); // invoke-virtual {v2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
	 /* .line 6 */
	 v2 = 	 (( java.io.PrintWriter ) v2 ).checkError ( ); // invoke-virtual {v2}, Ljava/io/PrintWriter;->checkError()Z
	 if ( v2 != null) { // if-eqz v2, :cond_0
		 /* .line 7 */
		 /* .line 8 */
		 /* :try_end_0 */
		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
		 /* .line 9 */
	 } // :cond_1
	 /* monitor-exit p0 */
	 return;
	 /* :catchall_0 */
	 /* move-exception p1 */
	 /* monitor-exit p0 */
	 /* throw p1 */
} // .end method
