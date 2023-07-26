public class org.apache.log4j.net.SimpleSocketServer {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static org.apache.log4j.Logger a;
	 public static Integer b;
	 public static java.lang.Class c; //synthetic
	 /* # direct methods */
	 public static org.apache.log4j.net.SimpleSocketServer ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = org.apache.log4j.net.SimpleSocketServer.c;
		 /* if-nez v0, :cond_0 */
		 final String v0 = "org.apache.log4j.net.SimpleSocketServer"; // const-string v0, "org.apache.log4j.net.SimpleSocketServer"
		 org.apache.log4j.net.SimpleSocketServer .a ( v0 );
	 } // :cond_0
	 org.apache.log4j.Logger .getLogger ( v0 );
	 return;
} // .end method
public org.apache.log4j.net.SimpleSocketServer ( ) {
	 /* .locals 0 */
	 /* .line 1 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 return;
} // .end method
public static java.lang.Class a ( java.lang.String p0 ) { //synthethic
	 /* .locals 1 */
	 /* .line 1 */
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
	 public static void a ( java.lang.String p0, java.lang.String p1 ) {
		 /* .locals 2 */
		 /* .line 2 */
		 try { // :try_start_0
			 v0 = 			 java.lang.Integer .parseInt ( p0 );
			 /* :try_end_0 */
			 /* .catch Ljava/lang/NumberFormatException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* :catch_0 */
			 /* move-exception v0 */
			 /* .line 3 */
			 (( java.lang.NumberFormatException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/NumberFormatException;->printStackTrace()V
			 /* .line 4 */
			 /* new-instance v0, Ljava/lang/StringBuffer; */
			 /* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
			 final String v1 = "Could not interpret port number ["; // const-string v1, "Could not interpret port number ["
			 (( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
			 (( java.lang.StringBuffer ) v0 ).append ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
			 final String p0 = "]."; // const-string p0, "]."
			 (( java.lang.StringBuffer ) v0 ).append ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
			 (( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
			 org.apache.log4j.net.SimpleSocketServer .b ( p0 );
		 } // :goto_0
		 final String p0 = ".xml"; // const-string p0, ".xml"
		 /* .line 5 */
		 p0 = 		 (( java.lang.String ) p1 ).endsWith ( p0 ); // invoke-virtual {p1, p0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
		 if ( p0 != null) { // if-eqz p0, :cond_0
			 /* .line 6 */
			 org.apache.log4j.xml.DOMConfigurator .configure ( p1 );
			 /* .line 7 */
		 } // :cond_0
		 org.apache.log4j.PropertyConfigurator .configure ( p1 );
	 } // :goto_1
	 return;
} // .end method
public static void b ( java.lang.String p0 ) {
	 /* .locals 2 */
	 /* .line 1 */
	 v0 = java.lang.System.err;
	 (( java.io.PrintStream ) v0 ).println ( p0 ); // invoke-virtual {v0, p0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
	 /* .line 2 */
	 p0 = java.lang.System.err;
	 /* new-instance v0, Ljava/lang/StringBuffer; */
	 /* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
	 final String v1 = "Usage: java "; // const-string v1, "Usage: java "
	 (( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 v1 = org.apache.log4j.net.SimpleSocketServer.c;
	 /* if-nez v1, :cond_0 */
	 final String v1 = "org.apache.log4j.net.SimpleSocketServer"; // const-string v1, "org.apache.log4j.net.SimpleSocketServer"
	 org.apache.log4j.net.SimpleSocketServer .a ( v1 );
} // :cond_0
(( java.lang.Class ) v1 ).getName ( ); // invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v1 = " port configFile"; // const-string v1, " port configFile"
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
(( java.io.PrintStream ) p0 ).println ( v0 ); // invoke-virtual {p0, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
int p0 = 1; // const/4 p0, 0x1
/* .line 3 */
java.lang.System .exit ( p0 );
return;
} // .end method
public static void main ( java.lang.String[] p0 ) {
/* .locals 4 */
/* .line 1 */
/* array-length v0, p0 */
int v1 = 2; // const/4 v1, 0x2
/* if-ne v0, v1, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
/* aget-object v0, p0, v0 */
int v1 = 1; // const/4 v1, 0x1
/* aget-object p0, p0, v1 */
org.apache.log4j.net.SimpleSocketServer .a ( v0,p0 );
} // :cond_0
final String p0 = "Wrong number of arguments."; // const-string p0, "Wrong number of arguments."
/* .line 3 */
org.apache.log4j.net.SimpleSocketServer .b ( p0 );
/* .line 4 */
} // :goto_0
try { // :try_start_0
p0 = org.apache.log4j.net.SimpleSocketServer.a;
/* new-instance v0, Ljava/lang/StringBuffer; */
/* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
final String v1 = "Listening on port "; // const-string v1, "Listening on port "
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
(( org.apache.log4j.Category ) p0 ).info ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/log4j/Category;->info(Ljava/lang/Object;)V
/* .line 5 */
/* new-instance p0, Ljava/net/ServerSocket; */
/* invoke-direct {p0, v0}, Ljava/net/ServerSocket;-><init>(I)V */
/* .line 6 */
} // :goto_1
v0 = org.apache.log4j.net.SimpleSocketServer.a;
final String v1 = "Waiting to accept a new client."; // const-string v1, "Waiting to accept a new client."
(( org.apache.log4j.Category ) v0 ).info ( v1 ); // invoke-virtual {v0, v1}, Lorg/apache/log4j/Category;->info(Ljava/lang/Object;)V
/* .line 7 */
(( java.net.ServerSocket ) p0 ).accept ( ); // invoke-virtual {p0}, Ljava/net/ServerSocket;->accept()Ljava/net/Socket;
/* .line 8 */
v1 = org.apache.log4j.net.SimpleSocketServer.a;
/* new-instance v2, Ljava/lang/StringBuffer; */
/* invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V */
final String v3 = "Connected to client at "; // const-string v3, "Connected to client at "
(( java.lang.StringBuffer ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.net.Socket ) v0 ).getInetAddress ( ); // invoke-virtual {v0}, Ljava/net/Socket;->getInetAddress()Ljava/net/InetAddress;
(( java.lang.StringBuffer ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
(( org.apache.log4j.Category ) v1 ).info ( v2 ); // invoke-virtual {v1, v2}, Lorg/apache/log4j/Category;->info(Ljava/lang/Object;)V
/* .line 9 */
v1 = org.apache.log4j.net.SimpleSocketServer.a;
final String v2 = "Starting new socket node."; // const-string v2, "Starting new socket node."
(( org.apache.log4j.Category ) v1 ).info ( v2 ); // invoke-virtual {v1, v2}, Lorg/apache/log4j/Category;->info(Ljava/lang/Object;)V
/* .line 10 */
/* new-instance v1, Ljava/lang/Thread; */
/* new-instance v2, Lorg/apache/log4j/net/SocketNode; */
org.apache.log4j.LogManager .getLoggerRepository ( );
/* invoke-direct {v2, v0, v3}, Lorg/apache/log4j/net/SocketNode;-><init>(Ljava/net/Socket;Lorg/apache/log4j/spi/LoggerRepository;)V */
/* new-instance v0, Ljava/lang/StringBuffer; */
/* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
final String v3 = "SimpleSocketServer-"; // const-string v3, "SimpleSocketServer-"
(( java.lang.StringBuffer ) v0 ).append ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v0 ).append ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
/* invoke-direct {v1, v2, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V */
(( java.lang.Thread ) v1 ).start ( ); // invoke-virtual {v1}, Ljava/lang/Thread;->start()V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p0 */
/* .line 11 */
(( java.lang.Exception ) p0 ).printStackTrace ( ); // invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V
return;
} // .end method
