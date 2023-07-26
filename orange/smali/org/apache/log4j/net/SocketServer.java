public class org.apache.log4j.net.SocketServer {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static java.lang.String d;
	 public static java.lang.String e;
	 public static org.apache.log4j.Logger f;
	 public static org.apache.log4j.net.SocketServer g;
	 public static Integer h;
	 public static java.lang.Class i; //synthetic
	 /* # instance fields */
	 public java.util.Hashtable a;
	 public org.apache.log4j.spi.LoggerRepository b;
	 public java.io.File c;
	 /* # direct methods */
	 public static org.apache.log4j.net.SocketServer ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = org.apache.log4j.net.SocketServer.i;
		 /* if-nez v0, :cond_0 */
		 final String v0 = "org.apache.log4j.net.SocketServer"; // const-string v0, "org.apache.log4j.net.SocketServer"
		 org.apache.log4j.net.SocketServer .a ( v0 );
	 } // :cond_0
	 org.apache.log4j.Logger .getLogger ( v0 );
	 return;
} // .end method
public org.apache.log4j.net.SocketServer ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* .line 2 */
	 this.c = p1;
	 /* .line 3 */
	 /* new-instance p1, Ljava/util/Hashtable; */
	 /* const/16 v0, 0xb */
	 /* invoke-direct {p1, v0}, Ljava/util/Hashtable;-><init>(I)V */
	 this.a = p1;
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
	 public static void a ( java.lang.String p0, java.lang.String p1, java.lang.String p2 ) {
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
			 org.apache.log4j.net.SocketServer .b ( p0 );
			 /* .line 5 */
		 } // :goto_0
		 org.apache.log4j.PropertyConfigurator .configure ( p1 );
		 /* .line 6 */
		 /* new-instance p0, Ljava/io/File; */
		 /* invoke-direct {p0, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
		 /* .line 7 */
		 p1 = 		 (( java.io.File ) p0 ).isDirectory ( ); // invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z
		 /* if-nez p1, :cond_0 */
		 /* .line 8 */
		 /* new-instance p1, Ljava/lang/StringBuffer; */
		 /* invoke-direct {p1}, Ljava/lang/StringBuffer;-><init>()V */
		 final String v0 = "["; // const-string v0, "["
		 (( java.lang.StringBuffer ) p1 ).append ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 (( java.lang.StringBuffer ) p1 ).append ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 final String p2 = "] is not a directory."; // const-string p2, "] is not a directory."
		 (( java.lang.StringBuffer ) p1 ).append ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 (( java.lang.StringBuffer ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
		 org.apache.log4j.net.SocketServer .b ( p1 );
		 /* .line 9 */
	 } // :cond_0
	 /* new-instance p1, Lorg/apache/log4j/net/SocketServer; */
	 /* invoke-direct {p1, p0}, Lorg/apache/log4j/net/SocketServer;-><init>(Ljava/io/File;)V */
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
	 v1 = org.apache.log4j.net.SocketServer.i;
	 /* if-nez v1, :cond_0 */
	 final String v1 = "org.apache.log4j.net.SocketServer"; // const-string v1, "org.apache.log4j.net.SocketServer"
	 org.apache.log4j.net.SocketServer .a ( v1 );
} // :cond_0
(( java.lang.Class ) v1 ).getName ( ); // invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v1 = " port configFile directory"; // const-string v1, " port configFile directory"
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
(( java.io.PrintStream ) p0 ).println ( v0 ); // invoke-virtual {p0, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
int p0 = 1; // const/4 p0, 0x1
/* .line 3 */
java.lang.System .exit ( p0 );
return;
} // .end method
public static void main ( java.lang.String[] p0 ) {
/* .locals 5 */
/* .line 1 */
/* array-length v0, p0 */
int v1 = 3; // const/4 v1, 0x3
/* if-ne v0, v1, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
/* aget-object v0, p0, v0 */
int v1 = 1; // const/4 v1, 0x1
/* aget-object v1, p0, v1 */
int v2 = 2; // const/4 v2, 0x2
/* aget-object p0, p0, v2 */
org.apache.log4j.net.SocketServer .a ( v0,v1,p0 );
} // :cond_0
final String p0 = "Wrong number of arguments."; // const-string p0, "Wrong number of arguments."
/* .line 3 */
org.apache.log4j.net.SocketServer .b ( p0 );
/* .line 4 */
} // :goto_0
try { // :try_start_0
p0 = org.apache.log4j.net.SocketServer.f;
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
v0 = org.apache.log4j.net.SocketServer.f;
final String v1 = "Waiting to accept a new client."; // const-string v1, "Waiting to accept a new client."
(( org.apache.log4j.Category ) v0 ).info ( v1 ); // invoke-virtual {v0, v1}, Lorg/apache/log4j/Category;->info(Ljava/lang/Object;)V
/* .line 7 */
(( java.net.ServerSocket ) p0 ).accept ( ); // invoke-virtual {p0}, Ljava/net/ServerSocket;->accept()Ljava/net/Socket;
/* .line 8 */
(( java.net.Socket ) v0 ).getInetAddress ( ); // invoke-virtual {v0}, Ljava/net/Socket;->getInetAddress()Ljava/net/InetAddress;
/* .line 9 */
v2 = org.apache.log4j.net.SocketServer.f;
/* new-instance v3, Ljava/lang/StringBuffer; */
/* invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V */
final String v4 = "Connected to client at "; // const-string v4, "Connected to client at "
(( java.lang.StringBuffer ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v3 ).append ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
(( org.apache.log4j.Category ) v2 ).info ( v3 ); // invoke-virtual {v2, v3}, Lorg/apache/log4j/Category;->info(Ljava/lang/Object;)V
/* .line 10 */
v2 = org.apache.log4j.net.SocketServer.g;
v2 = this.a;
(( java.util.Hashtable ) v2 ).get ( v1 ); // invoke-virtual {v2, v1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v2, Lorg/apache/log4j/spi/LoggerRepository; */
/* if-nez v2, :cond_1 */
/* .line 11 */
v2 = org.apache.log4j.net.SocketServer.g;
(( org.apache.log4j.net.SocketServer ) v2 ).a ( v1 ); // invoke-virtual {v2, v1}, Lorg/apache/log4j/net/SocketServer;->a(Ljava/net/InetAddress;)Lorg/apache/log4j/spi/LoggerRepository;
/* .line 12 */
} // :cond_1
v1 = org.apache.log4j.net.SocketServer.f;
final String v3 = "Starting new socket node."; // const-string v3, "Starting new socket node."
(( org.apache.log4j.Category ) v1 ).info ( v3 ); // invoke-virtual {v1, v3}, Lorg/apache/log4j/Category;->info(Ljava/lang/Object;)V
/* .line 13 */
/* new-instance v1, Ljava/lang/Thread; */
/* new-instance v3, Lorg/apache/log4j/net/SocketNode; */
/* invoke-direct {v3, v0, v2}, Lorg/apache/log4j/net/SocketNode;-><init>(Ljava/net/Socket;Lorg/apache/log4j/spi/LoggerRepository;)V */
/* invoke-direct {v1, v3}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V */
(( java.lang.Thread ) v1 ).start ( ); // invoke-virtual {v1}, Ljava/lang/Thread;->start()V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p0 */
/* .line 14 */
(( java.lang.Exception ) p0 ).printStackTrace ( ); // invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V
return;
} // .end method
/* # virtual methods */
public org.apache.log4j.spi.LoggerRepository a ( ) {
/* .locals 4 */
/* .line 23 */
v0 = this.b;
/* if-nez v0, :cond_1 */
/* .line 24 */
/* new-instance v0, Ljava/io/File; */
v1 = this.c;
/* new-instance v2, Ljava/lang/StringBuffer; */
/* invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V */
v3 = org.apache.log4j.net.SocketServer.d;
(( java.lang.StringBuffer ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
v3 = org.apache.log4j.net.SocketServer.e;
(( java.lang.StringBuffer ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V */
/* .line 25 */
v1 = (( java.io.File ) v0 ).exists ( ); // invoke-virtual {v0}, Ljava/io/File;->exists()Z
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 26 */
/* new-instance v1, Lorg/apache/log4j/Hierarchy; */
/* new-instance v2, Lorg/apache/log4j/spi/RootLogger; */
v3 = org.apache.log4j.Level.DEBUG;
/* invoke-direct {v2, v3}, Lorg/apache/log4j/spi/RootLogger;-><init>(Lorg/apache/log4j/Level;)V */
/* invoke-direct {v1, v2}, Lorg/apache/log4j/Hierarchy;-><init>(Lorg/apache/log4j/Logger;)V */
this.b = v1;
/* .line 27 */
/* new-instance v1, Lorg/apache/log4j/PropertyConfigurator; */
/* invoke-direct {v1}, Lorg/apache/log4j/PropertyConfigurator;-><init>()V */
(( java.io.File ) v0 ).getAbsolutePath ( ); // invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
v2 = this.b;
(( org.apache.log4j.PropertyConfigurator ) v1 ).doConfigure ( v0, v2 ); // invoke-virtual {v1, v0, v2}, Lorg/apache/log4j/PropertyConfigurator;->doConfigure(Ljava/lang/String;Lorg/apache/log4j/spi/LoggerRepository;)V
/* .line 28 */
} // :cond_0
v1 = org.apache.log4j.net.SocketServer.f;
/* new-instance v2, Ljava/lang/StringBuffer; */
/* invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V */
final String v3 = "Could not find config file ["; // const-string v3, "Could not find config file ["
(( java.lang.StringBuffer ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;
final String v0 = "].Will use the default hierarchy."; // const-string v0, "].Will use the default hierarchy."
(( java.lang.StringBuffer ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
(( org.apache.log4j.Category ) v1 ).warn ( v0 ); // invoke-virtual {v1, v0}, Lorg/apache/log4j/Category;->warn(Ljava/lang/Object;)V
/* .line 29 */
org.apache.log4j.LogManager .getLoggerRepository ( );
this.b = v0;
/* .line 30 */
} // :cond_1
} // :goto_0
v0 = this.b;
} // .end method
public org.apache.log4j.spi.LoggerRepository a ( java.net.InetAddress p0 ) {
/* .locals 4 */
/* .line 10 */
v0 = org.apache.log4j.net.SocketServer.f;
/* new-instance v1, Ljava/lang/StringBuffer; */
/* invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V */
final String v2 = "Locating configuration file for "; // const-string v2, "Locating configuration file for "
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
(( org.apache.log4j.Category ) v0 ).info ( v1 ); // invoke-virtual {v0, v1}, Lorg/apache/log4j/Category;->info(Ljava/lang/Object;)V
/* .line 11 */
(( java.net.InetAddress ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/net/InetAddress;->toString()Ljava/lang/String;
final String v1 = "/"; // const-string v1, "/"
/* .line 12 */
v1 = (( java.lang.String ) v0 ).indexOf ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
int v2 = -1; // const/4 v2, -0x1
/* if-ne v1, v2, :cond_0 */
/* .line 13 */
v0 = org.apache.log4j.net.SocketServer.f;
/* new-instance v1, Ljava/lang/StringBuffer; */
/* invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V */
final String v2 = "Could not parse the inetAddress ["; // const-string v2, "Could not parse the inetAddress ["
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;
final String p1 = "].Using default hierarchy."; // const-string p1, "].Using default hierarchy."
(( java.lang.StringBuffer ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
(( org.apache.log4j.Category ) v0 ).warn ( p1 ); // invoke-virtual {v0, p1}, Lorg/apache/log4j/Category;->warn(Ljava/lang/Object;)V
/* .line 14 */
(( org.apache.log4j.net.SocketServer ) p0 ).a ( ); // invoke-virtual {p0}, Lorg/apache/log4j/net/SocketServer;->a()Lorg/apache/log4j/spi/LoggerRepository;
} // :cond_0
int v2 = 0; // const/4 v2, 0x0
/* .line 15 */
(( java.lang.String ) v0 ).substring ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;
/* .line 16 */
/* new-instance v1, Ljava/io/File; */
v2 = this.c;
/* new-instance v3, Ljava/lang/StringBuffer; */
/* invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V */
(( java.lang.StringBuffer ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
v0 = org.apache.log4j.net.SocketServer.e;
(( java.lang.StringBuffer ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
/* invoke-direct {v1, v2, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V */
/* .line 17 */
v0 = (( java.io.File ) v1 ).exists ( ); // invoke-virtual {v1}, Ljava/io/File;->exists()Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 18 */
/* new-instance v0, Lorg/apache/log4j/Hierarchy; */
/* new-instance v2, Lorg/apache/log4j/spi/RootLogger; */
v3 = org.apache.log4j.Level.DEBUG;
/* invoke-direct {v2, v3}, Lorg/apache/log4j/spi/RootLogger;-><init>(Lorg/apache/log4j/Level;)V */
/* invoke-direct {v0, v2}, Lorg/apache/log4j/Hierarchy;-><init>(Lorg/apache/log4j/Logger;)V */
/* .line 19 */
v2 = this.a;
(( java.util.Hashtable ) v2 ).put ( p1, v0 ); // invoke-virtual {v2, p1, v0}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 20 */
/* new-instance p1, Lorg/apache/log4j/PropertyConfigurator; */
/* invoke-direct {p1}, Lorg/apache/log4j/PropertyConfigurator;-><init>()V */
(( java.io.File ) v1 ).getAbsolutePath ( ); // invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
(( org.apache.log4j.PropertyConfigurator ) p1 ).doConfigure ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Lorg/apache/log4j/PropertyConfigurator;->doConfigure(Ljava/lang/String;Lorg/apache/log4j/spi/LoggerRepository;)V
/* .line 21 */
} // :cond_1
p1 = org.apache.log4j.net.SocketServer.f;
/* new-instance v0, Ljava/lang/StringBuffer; */
/* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
final String v2 = "Could not find config file ["; // const-string v2, "Could not find config file ["
(( java.lang.StringBuffer ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;
final String v1 = "]."; // const-string v1, "]."
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
(( org.apache.log4j.Category ) p1 ).warn ( v0 ); // invoke-virtual {p1, v0}, Lorg/apache/log4j/Category;->warn(Ljava/lang/Object;)V
/* .line 22 */
(( org.apache.log4j.net.SocketServer ) p0 ).a ( ); // invoke-virtual {p0}, Lorg/apache/log4j/net/SocketServer;->a()Lorg/apache/log4j/spi/LoggerRepository;
} // .end method
