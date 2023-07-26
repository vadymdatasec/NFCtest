public class org.apache.log4j.net.JMSSink implements javax.jms.MessageListener {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # static fields */
	 public static org.apache.log4j.Logger a;
	 public static java.lang.Class b; //synthetic
	 /* # direct methods */
	 public static org.apache.log4j.net.JMSSink ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = org.apache.log4j.net.JMSSink.b;
		 /* if-nez v0, :cond_0 */
		 final String v0 = "org.apache.log4j.net.JMSSink"; // const-string v0, "org.apache.log4j.net.JMSSink"
		 org.apache.log4j.net.JMSSink .a ( v0 );
	 } // :cond_0
	 org.apache.log4j.Logger .getLogger ( v0 );
	 return;
} // .end method
public org.apache.log4j.net.JMSSink ( ) {
	 /* .locals 2 */
	 final String v0 = "Could not read JMS message."; // const-string v0, "Could not read JMS message."
	 /* .line 1 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* .line 2 */
	 try { // :try_start_0
		 /* new-instance v1, Ljavax/naming/InitialContext; */
		 /* invoke-direct {v1}, Ljavax/naming/InitialContext;-><init>()V */
		 /* .line 3 */
		 org.apache.log4j.net.JMSSink .a ( v1,p1 );
		 /* check-cast p1, Ljavax/jms/TopicConnectionFactory; */
		 /* .line 4 */
		 /* .line 5 */
		 int p3 = 0; // const/4 p3, 0x0
		 int p4 = 1; // const/4 p4, 0x1
		 /* .line 6 */
		 /* .line 7 */
		 /* check-cast p2, Ljavax/jms/Topic; */
		 /* .line 8 */
		 /* .line 9 */
		 /* :try_end_0 */
		 /* .catch Ljavax/jms/JMSException; {:try_start_0 ..:try_end_0} :catch_2 */
		 /* .catch Ljavax/naming/NamingException; {:try_start_0 ..:try_end_0} :catch_1 */
		 /* .catch Ljava/lang/RuntimeException; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* :catch_0 */
		 /* move-exception p1 */
		 /* .line 10 */
		 p2 = org.apache.log4j.net.JMSSink.a;
		 (( org.apache.log4j.Category ) p2 ).error ( v0, p1 ); // invoke-virtual {p2, v0, p1}, Lorg/apache/log4j/Category;->error(Ljava/lang/Object;Ljava/lang/Throwable;)V
		 /* :catch_1 */
		 /* move-exception p1 */
		 /* .line 11 */
		 p2 = org.apache.log4j.net.JMSSink.a;
		 (( org.apache.log4j.Category ) p2 ).error ( v0, p1 ); // invoke-virtual {p2, v0, p1}, Lorg/apache/log4j/Category;->error(Ljava/lang/Object;Ljava/lang/Throwable;)V
		 /* :catch_2 */
		 /* move-exception p1 */
		 /* .line 12 */
		 p2 = org.apache.log4j.net.JMSSink.a;
		 (( org.apache.log4j.Category ) p2 ).error ( v0, p1 ); // invoke-virtual {p2, v0, p1}, Lorg/apache/log4j/Category;->error(Ljava/lang/Object;Ljava/lang/Throwable;)V
	 } // :goto_0
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
	 public static java.lang.Object a ( javax.naming.Context p0, java.lang.String p1 ) {
		 /* .locals 3 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Ljavax/naming/NamingException; */
		 /* } */
	 } // .end annotation
	 /* .line 2 */
	 try { // :try_start_0
		 /* :try_end_0 */
		 /* .catch Ljavax/naming/NameNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* :catch_0 */
		 /* move-exception p0 */
		 /* .line 3 */
		 v0 = org.apache.log4j.net.JMSSink.a;
		 /* new-instance v1, Ljava/lang/StringBuffer; */
		 /* invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V */
		 final String v2 = "Could not find name ["; // const-string v2, "Could not find name ["
		 (( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 (( java.lang.StringBuffer ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 final String p1 = "]."; // const-string p1, "]."
		 (( java.lang.StringBuffer ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 (( java.lang.StringBuffer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
		 (( org.apache.log4j.Category ) v0 ).error ( p1 ); // invoke-virtual {v0, p1}, Lorg/apache/log4j/Category;->error(Ljava/lang/Object;)V
		 /* .line 4 */
		 /* throw p0 */
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
		 v1 = org.apache.log4j.net.JMSSink.b;
		 /* if-nez v1, :cond_0 */
		 final String v1 = "org.apache.log4j.net.JMSSink"; // const-string v1, "org.apache.log4j.net.JMSSink"
		 org.apache.log4j.net.JMSSink .a ( v1 );
	 } // :cond_0
	 (( java.lang.Class ) v1 ).getName ( ); // invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;
	 (( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 final String v1 = " TopicConnectionFactoryBindingName TopicBindingName username password configFile"; // const-string v1, " TopicConnectionFactoryBindingName TopicBindingName username password configFile"
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
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Ljava/lang/Exception; */
	 /* } */
} // .end annotation
/* .line 1 */
/* array-length v0, p0 */
int v1 = 5; // const/4 v1, 0x5
/* if-eq v0, v1, :cond_0 */
final String v0 = "Wrong number of arguments."; // const-string v0, "Wrong number of arguments."
/* .line 2 */
org.apache.log4j.net.JMSSink .b ( v0 );
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 3 */
/* aget-object v0, p0, v0 */
int v1 = 1; // const/4 v1, 0x1
/* .line 4 */
/* aget-object v1, p0, v1 */
int v2 = 2; // const/4 v2, 0x2
/* .line 5 */
/* aget-object v2, p0, v2 */
int v3 = 3; // const/4 v3, 0x3
/* .line 6 */
/* aget-object v3, p0, v3 */
int v4 = 4; // const/4 v4, 0x4
/* .line 7 */
/* aget-object p0, p0, v4 */
final String v4 = ".xml"; // const-string v4, ".xml"
/* .line 8 */
v4 = (( java.lang.String ) p0 ).endsWith ( v4 ); // invoke-virtual {p0, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
if ( v4 != null) { // if-eqz v4, :cond_1
/* .line 9 */
org.apache.log4j.xml.DOMConfigurator .configure ( p0 );
/* .line 10 */
} // :cond_1
org.apache.log4j.PropertyConfigurator .configure ( p0 );
/* .line 11 */
} // :goto_0
/* new-instance p0, Lorg/apache/log4j/net/JMSSink; */
/* invoke-direct {p0, v0, v1, v2, v3}, Lorg/apache/log4j/net/JMSSink;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V */
/* .line 12 */
/* new-instance p0, Ljava/io/BufferedReader; */
/* new-instance v0, Ljava/io/InputStreamReader; */
v1 = java.lang.System.in;
/* invoke-direct {v0, v1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V */
/* invoke-direct {p0, v0}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V */
/* .line 13 */
v0 = java.lang.System.out;
final String v1 = "Type \"exit\" to quit JMSSink."; // const-string v1, "Type \"exit\" to quit JMSSink."
(( java.io.PrintStream ) v0 ).println ( v1 ); // invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* .line 14 */
} // :cond_2
(( java.io.BufferedReader ) p0 ).readLine ( ); // invoke-virtual {p0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;
final String v1 = "exit"; // const-string v1, "exit"
/* .line 15 */
v0 = (( java.lang.String ) v0 ).equalsIgnoreCase ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 16 */
p0 = java.lang.System.out;
final String v0 = "Exiting.Kill the application if it does not exit due to daemon threads."; // const-string v0, "Exiting.Kill the application if it does not exit due to daemon threads."
(( java.io.PrintStream ) p0 ).println ( v0 ); // invoke-virtual {p0, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
return;
} // .end method
/* # virtual methods */
public void onMessage ( javax.jms.Message p0 ) {
/* .locals 3 */
/* .line 1 */
try { // :try_start_0
/* instance-of v0, p1, Ljavax/jms/ObjectMessage; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
/* check-cast p1, Ljavax/jms/ObjectMessage; */
/* .line 3 */
/* check-cast p1, Lorg/apache/log4j/spi/LoggingEvent; */
/* .line 4 */
(( org.apache.log4j.spi.LoggingEvent ) p1 ).getLoggerName ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getLoggerName()Ljava/lang/String;
org.apache.log4j.Logger .getLogger ( v0 );
/* .line 5 */
(( org.apache.log4j.Category ) v0 ).callAppenders ( p1 ); // invoke-virtual {v0, p1}, Lorg/apache/log4j/Category;->callAppenders(Lorg/apache/log4j/spi/LoggingEvent;)V
/* .line 6 */
} // :cond_0
v0 = org.apache.log4j.net.JMSSink.a;
/* new-instance v1, Ljava/lang/StringBuffer; */
/* invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V */
final String v2 = "Received message is of type "; // const-string v2, "Received message is of type "
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String p1 = ", was expecting ObjectMessage."; // const-string p1, ", was expecting ObjectMessage."
(( java.lang.StringBuffer ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
(( org.apache.log4j.Category ) v0 ).warn ( p1 ); // invoke-virtual {v0, p1}, Lorg/apache/log4j/Category;->warn(Ljava/lang/Object;)V
/* :try_end_0 */
/* .catch Ljavax/jms/JMSException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p1 */
/* .line 7 */
v0 = org.apache.log4j.net.JMSSink.a;
final String v1 = "Exception thrown while processing incoming message."; // const-string v1, "Exception thrown while processing incoming message."
(( org.apache.log4j.Category ) v0 ).error ( v1, p1 ); // invoke-virtual {v0, v1, p1}, Lorg/apache/log4j/Category;->error(Ljava/lang/Object;Ljava/lang/Throwable;)V
} // :goto_0
return;
} // .end method
