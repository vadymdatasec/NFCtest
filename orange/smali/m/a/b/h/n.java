public class m.a.b.h.n extends java.lang.Thread {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final org.apache.log4j.Logger d;
	 public static java.lang.Class e; //synthetic
	 /* # instance fields */
	 public m.a.b.h.r b;
	 public java.net.ServerSocket c;
	 /* # direct methods */
	 public static m.a.b.h.n ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = m.a.b.h.n.e;
		 /* if-nez v0, :cond_0 */
		 final String v0 = "org.apache.log4j.chainsaw.LoggingReceiver"; // const-string v0, "org.apache.log4j.chainsaw.LoggingReceiver"
		 m.a.b.h.n .a ( v0 );
	 } // :cond_0
	 org.apache.log4j.Logger .getLogger ( v0 );
	 return;
} // .end method
public m.a.b.h.n ( ) {
	 /* .locals 1 */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Ljava/io/IOException; */
	 /* } */
} // .end annotation
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Thread;-><init>()V */
int v0 = 1; // const/4 v0, 0x1
/* .line 2 */
(( java.lang.Thread ) p0 ).setDaemon ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/Thread;->setDaemon(Z)V
/* .line 3 */
this.b = p1;
/* .line 4 */
/* new-instance p1, Ljava/net/ServerSocket; */
/* invoke-direct {p1, p2}, Ljava/net/ServerSocket;-><init>(I)V */
this.c = p1;
return;
} // .end method
public static java.lang.Class a ( java.lang.String p0 ) { //synthethic
/* .locals 1 */
/* .line 3 */
try { // :try_start_0
	 java.lang.Class .forName ( p0 );
	 /* :try_end_0 */
	 /* .catch Ljava/lang/ClassNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* :catch_0 */
	 /* move-exception p0 */
	 /* new-instance v0, Ljava/lang/NoClassDefFoundError; */
	 /* invoke-direct {v0}, Ljava/lang/NoClassDefFoundError;-><init>()V */
	 (( java.lang.NoClassDefFoundError ) v0 ).initCause ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/NoClassDefFoundError;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;
	 /* throw p0 */
} // .end method
public static m.a.b.h.r a ( Object p0 ) { //synthethic
	 /* .locals 0 */
	 /* .line 2 */
	 p0 = this.b;
} // .end method
public static org.apache.log4j.Logger a ( ) { //synthethic
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = m.a.b.h.n.d;
} // .end method
/* # virtual methods */
public void run ( ) {
	 /* .locals 4 */
	 /* .line 1 */
	 v0 = m.a.b.h.n.d;
	 final String v1 = "Thread started"; // const-string v1, "Thread started"
	 (( org.apache.log4j.Category ) v0 ).info ( v1 ); // invoke-virtual {v0, v1}, Lorg/apache/log4j/Category;->info(Ljava/lang/Object;)V
	 /* .line 2 */
} // :goto_0
try { // :try_start_0
	 v0 = m.a.b.h.n.d;
	 final String v1 = "Waiting for a connection"; // const-string v1, "Waiting for a connection"
	 (( org.apache.log4j.Category ) v0 ).debug ( v1 ); // invoke-virtual {v0, v1}, Lorg/apache/log4j/Category;->debug(Ljava/lang/Object;)V
	 /* .line 3 */
	 v0 = this.c;
	 (( java.net.ServerSocket ) v0 ).accept ( ); // invoke-virtual {v0}, Ljava/net/ServerSocket;->accept()Ljava/net/Socket;
	 /* .line 4 */
	 v1 = m.a.b.h.n.d;
	 /* new-instance v2, Ljava/lang/StringBuffer; */
	 /* invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V */
	 final String v3 = "Got a connection from "; // const-string v3, "Got a connection from "
	 (( java.lang.StringBuffer ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 (( java.net.Socket ) v0 ).getInetAddress ( ); // invoke-virtual {v0}, Ljava/net/Socket;->getInetAddress()Ljava/net/InetAddress;
	 (( java.net.InetAddress ) v3 ).getHostName ( ); // invoke-virtual {v3}, Ljava/net/InetAddress;->getHostName()Ljava/lang/String;
	 (( java.lang.StringBuffer ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 (( java.lang.StringBuffer ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
	 (( org.apache.log4j.Category ) v1 ).debug ( v2 ); // invoke-virtual {v1, v2}, Lorg/apache/log4j/Category;->debug(Ljava/lang/Object;)V
	 /* .line 5 */
	 /* new-instance v1, Ljava/lang/Thread; */
	 /* new-instance v2, Lm/a/b/h/m; */
	 /* invoke-direct {v2, p0, v0}, Lm/a/b/h/m;-><init>(Lm/a/b/h/n;Ljava/net/Socket;)V */
	 /* invoke-direct {v1, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V */
	 int v0 = 1; // const/4 v0, 0x1
	 /* .line 6 */
	 (( java.lang.Thread ) v1 ).setDaemon ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/Thread;->setDaemon(Z)V
	 /* .line 7 */
	 (( java.lang.Thread ) v1 ).start ( ); // invoke-virtual {v1}, Ljava/lang/Thread;->start()V
	 /* :try_end_0 */
	 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* :catch_0 */
	 /* move-exception v0 */
	 /* .line 8 */
	 v1 = m.a.b.h.n.d;
	 final String v2 = "Error in accepting connections, stopping."; // const-string v2, "Error in accepting connections, stopping."
	 (( org.apache.log4j.Category ) v1 ).error ( v2, v0 ); // invoke-virtual {v1, v2, v0}, Lorg/apache/log4j/Category;->error(Ljava/lang/Object;Ljava/lang/Throwable;)V
	 return;
} // .end method
