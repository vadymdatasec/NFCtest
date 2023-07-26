public class org.apache.log4j.net.JMSAppender extends org.apache.log4j.AppenderSkeleton {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public java.lang.String h;
	 public java.lang.String i;
	 public java.lang.String j;
	 public java.lang.String k;
	 public java.lang.String l;
	 public java.lang.String m;
	 public java.lang.String n;
	 public java.lang.String o;
	 public java.lang.String p;
	 public Boolean q;
	 public javax.jms.TopicConnection r;
	 public javax.jms.TopicSession s;
	 public javax.jms.TopicPublisher t;
	 /* # direct methods */
	 public org.apache.log4j.net.JMSAppender ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Lorg/apache/log4j/AppenderSkeleton;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.Object a ( javax.naming.Context p0, java.lang.String p1 ) {
		 /* .locals 2 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Ljavax/naming/NamingException; */
		 /* } */
	 } // .end annotation
	 /* .line 1 */
	 try { // :try_start_0
		 /* :try_end_0 */
		 /* .catch Ljavax/naming/NameNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* :catch_0 */
		 /* move-exception p1 */
		 /* .line 2 */
		 /* new-instance v0, Ljava/lang/StringBuffer; */
		 /* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
		 final String v1 = "Could not find name ["; // const-string v1, "Could not find name ["
		 (( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 (( java.lang.StringBuffer ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 final String p2 = "]."; // const-string p2, "]."
		 (( java.lang.StringBuffer ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 (( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
		 org.apache.log4j.helpers.LogLog .error ( p2 );
		 /* .line 3 */
		 /* throw p1 */
	 } // .end method
	 public Boolean a ( ) {
		 /* .locals 3 */
		 /* .line 4 */
		 v0 = this.r;
		 /* if-nez v0, :cond_0 */
		 final String v0 = "No TopicConnection"; // const-string v0, "No TopicConnection"
		 /* .line 5 */
	 } // :cond_0
	 v0 = this.s;
	 /* if-nez v0, :cond_1 */
	 final String v0 = "No TopicSession"; // const-string v0, "No TopicSession"
	 /* .line 6 */
} // :cond_1
v0 = this.t;
/* if-nez v0, :cond_2 */
final String v0 = "No TopicPublisher"; // const-string v0, "No TopicPublisher"
} // :cond_2
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 7 */
v1 = this.d;
/* new-instance v2, Ljava/lang/StringBuffer; */
/* invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V */
(( java.lang.StringBuffer ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v0 = " for JMSAppender named ["; // const-string v0, " for JMSAppender named ["
(( java.lang.StringBuffer ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
v0 = this.b;
(( java.lang.StringBuffer ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v0 = "]."; // const-string v0, "]."
(( java.lang.StringBuffer ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
int v0 = 0; // const/4 v0, 0x0
} // :cond_3
int v0 = 1; // const/4 v0, 0x1
} // .end method
public void activateOptions ( ) {
/* .locals 7 */
final String v0 = "Error while activating options for appender named ["; // const-string v0, "Error while activating options for appender named ["
final String v1 = "]."; // const-string v1, "]."
int v2 = 0; // const/4 v2, 0x0
try { // :try_start_0
final String v3 = "Getting initial context."; // const-string v3, "Getting initial context."
/* .line 1 */
org.apache.log4j.helpers.LogLog .debug ( v3 );
/* .line 2 */
v3 = this.j;
if ( v3 != null) { // if-eqz v3, :cond_4
/* .line 3 */
/* new-instance v3, Ljava/util/Properties; */
/* invoke-direct {v3}, Ljava/util/Properties;-><init>()V */
final String v4 = "java.naming.factory.initial"; // const-string v4, "java.naming.factory.initial"
/* .line 4 */
v5 = this.j;
(( java.util.Properties ) v3 ).put ( v4, v5 ); // invoke-virtual {v3, v4, v5}, Ljava/util/Properties;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 5 */
v4 = this.l;
if ( v4 != null) { // if-eqz v4, :cond_0
	 final String v4 = "java.naming.provider.url"; // const-string v4, "java.naming.provider.url"
	 /* .line 6 */
	 v5 = this.l;
	 (( java.util.Properties ) v3 ).put ( v4, v5 ); // invoke-virtual {v3, v4, v5}, Ljava/util/Properties;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
} // :cond_0
final String v4 = "You have set InitialContextFactoryName option but not the ProviderURL.This is likely to cause problems."; // const-string v4, "You have set InitialContextFactoryName option but not the ProviderURL.This is likely to cause problems."
/* .line 7 */
org.apache.log4j.helpers.LogLog .warn ( v4 );
/* .line 8 */
} // :goto_0
v4 = this.k;
if ( v4 != null) { // if-eqz v4, :cond_1
final String v4 = "java.naming.factory.url.pkgs"; // const-string v4, "java.naming.factory.url.pkgs"
/* .line 9 */
v5 = this.k;
(( java.util.Properties ) v3 ).put ( v4, v5 ); // invoke-virtual {v3, v4, v5}, Ljava/util/Properties;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 10 */
} // :cond_1
v4 = this.h;
if ( v4 != null) { // if-eqz v4, :cond_3
final String v4 = "java.naming.security.principal"; // const-string v4, "java.naming.security.principal"
/* .line 11 */
v5 = this.h;
(( java.util.Properties ) v3 ).put ( v4, v5 ); // invoke-virtual {v3, v4, v5}, Ljava/util/Properties;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 12 */
v4 = this.i;
if ( v4 != null) { // if-eqz v4, :cond_2
	 final String v4 = "java.naming.security.credentials"; // const-string v4, "java.naming.security.credentials"
	 /* .line 13 */
	 v5 = this.i;
	 (( java.util.Properties ) v3 ).put ( v4, v5 ); // invoke-virtual {v3, v4, v5}, Ljava/util/Properties;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
} // :cond_2
final String v4 = "You have set SecurityPrincipalName option but not the SecurityCredentials.This is likely to cause problems."; // const-string v4, "You have set SecurityPrincipalName option but not the SecurityCredentials.This is likely to cause problems."
/* .line 14 */
org.apache.log4j.helpers.LogLog .warn ( v4 );
/* .line 15 */
} // :cond_3
} // :goto_1
/* new-instance v4, Ljavax/naming/InitialContext; */
/* invoke-direct {v4, v3}, Ljavax/naming/InitialContext;-><init>(Ljava/util/Hashtable;)V */
/* .line 16 */
} // :cond_4
/* new-instance v4, Ljavax/naming/InitialContext; */
/* invoke-direct {v4}, Ljavax/naming/InitialContext;-><init>()V */
/* .line 17 */
} // :goto_2
/* new-instance v3, Ljava/lang/StringBuffer; */
/* invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V */
final String v5 = "Looking up ["; // const-string v5, "Looking up ["
(( java.lang.StringBuffer ) v3 ).append ( v5 ); // invoke-virtual {v3, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
v5 = this.n;
(( java.lang.StringBuffer ) v3 ).append ( v5 ); // invoke-virtual {v3, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v5 = "]"; // const-string v5, "]"
(( java.lang.StringBuffer ) v3 ).append ( v5 ); // invoke-virtual {v3, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .debug ( v3 );
/* .line 18 */
v3 = this.n;
(( org.apache.log4j.net.JMSAppender ) p0 ).a ( v4, v3 ); // invoke-virtual {p0, v4, v3}, Lorg/apache/log4j/net/JMSAppender;->a(Ljavax/naming/Context;Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v3, Ljavax/jms/TopicConnectionFactory; */
final String v5 = "About to create TopicConnection."; // const-string v5, "About to create TopicConnection."
/* .line 19 */
org.apache.log4j.helpers.LogLog .debug ( v5 );
/* .line 20 */
v5 = this.o;
if ( v5 != null) { // if-eqz v5, :cond_5
/* .line 21 */
v5 = this.o;
v6 = this.p;
this.r = v3;
/* .line 22 */
} // :cond_5
this.r = v3;
} // :goto_3
final String v3 = "Creating TopicSession, non-transactional, in AUTO_ACKNOWLEDGE mode."; // const-string v3, "Creating TopicSession, non-transactional, in AUTO_ACKNOWLEDGE mode."
/* .line 23 */
org.apache.log4j.helpers.LogLog .debug ( v3 );
/* .line 24 */
v3 = this.r;
int v5 = 1; // const/4 v5, 0x1
this.s = v3;
/* .line 25 */
/* new-instance v3, Ljava/lang/StringBuffer; */
/* invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V */
final String v5 = "Looking up topic name ["; // const-string v5, "Looking up topic name ["
(( java.lang.StringBuffer ) v3 ).append ( v5 ); // invoke-virtual {v3, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
v5 = this.m;
(( java.lang.StringBuffer ) v3 ).append ( v5 ); // invoke-virtual {v3, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v3 ).append ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .debug ( v3 );
/* .line 26 */
v3 = this.m;
(( org.apache.log4j.net.JMSAppender ) p0 ).a ( v4, v3 ); // invoke-virtual {p0, v4, v3}, Lorg/apache/log4j/net/JMSAppender;->a(Ljavax/naming/Context;Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v3, Ljavax/jms/Topic; */
final String v5 = "Creating TopicPublisher."; // const-string v5, "Creating TopicPublisher."
/* .line 27 */
org.apache.log4j.helpers.LogLog .debug ( v5 );
/* .line 28 */
v5 = this.s;
this.t = v3;
final String v3 = "Starting TopicConnection."; // const-string v3, "Starting TopicConnection."
/* .line 29 */
org.apache.log4j.helpers.LogLog .debug ( v3 );
/* .line 30 */
v3 = this.r;
/* .line 31 */
/* :try_end_0 */
/* .catch Ljavax/jms/JMSException; {:try_start_0 ..:try_end_0} :catch_2 */
/* .catch Ljavax/naming/NamingException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Ljava/lang/RuntimeException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v3 */
/* .line 32 */
v4 = this.d;
/* new-instance v5, Ljava/lang/StringBuffer; */
/* invoke-direct {v5}, Ljava/lang/StringBuffer;-><init>()V */
(( java.lang.StringBuffer ) v5 ).append ( v0 ); // invoke-virtual {v5, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
v0 = this.b;
(( java.lang.StringBuffer ) v5 ).append ( v0 ); // invoke-virtual {v5, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v5 ).append ( v1 ); // invoke-virtual {v5, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
/* :catch_1 */
/* move-exception v3 */
/* .line 33 */
v4 = this.d;
/* new-instance v5, Ljava/lang/StringBuffer; */
/* invoke-direct {v5}, Ljava/lang/StringBuffer;-><init>()V */
(( java.lang.StringBuffer ) v5 ).append ( v0 ); // invoke-virtual {v5, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
v0 = this.b;
(( java.lang.StringBuffer ) v5 ).append ( v0 ); // invoke-virtual {v5, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v5 ).append ( v1 ); // invoke-virtual {v5, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
/* :catch_2 */
/* move-exception v3 */
/* .line 34 */
v4 = this.d;
/* new-instance v5, Ljava/lang/StringBuffer; */
/* invoke-direct {v5}, Ljava/lang/StringBuffer;-><init>()V */
(( java.lang.StringBuffer ) v5 ).append ( v0 ); // invoke-virtual {v5, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
v0 = this.b;
(( java.lang.StringBuffer ) v5 ).append ( v0 ); // invoke-virtual {v5, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v5 ).append ( v1 ); // invoke-virtual {v5, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
} // :goto_4
return;
} // .end method
public void append ( org.apache.log4j.spi.LoggingEvent p0 ) {
/* .locals 5 */
final String v0 = "]."; // const-string v0, "]."
final String v1 = "Could not publish message in JMSAppender ["; // const-string v1, "Could not publish message in JMSAppender ["
/* .line 1 */
v2 = (( org.apache.log4j.net.JMSAppender ) p0 ).a ( ); // invoke-virtual {p0}, Lorg/apache/log4j/net/JMSAppender;->a()Z
/* if-nez v2, :cond_0 */
return;
} // :cond_0
int v2 = 0; // const/4 v2, 0x0
/* .line 2 */
try { // :try_start_0
v3 = this.s;
/* .line 3 */
/* iget-boolean v4, p0, Lorg/apache/log4j/net/JMSAppender;->q:Z */
if ( v4 != null) { // if-eqz v4, :cond_1
/* .line 4 */
(( org.apache.log4j.spi.LoggingEvent ) p1 ).getLocationInformation ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getLocationInformation()Lorg/apache/log4j/spi/LocationInfo;
/* .line 5 */
} // :cond_1
/* .line 6 */
p1 = this.t;
/* :try_end_0 */
/* .catch Ljavax/jms/JMSException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Ljava/lang/RuntimeException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p1 */
/* .line 7 */
v3 = this.d;
/* new-instance v4, Ljava/lang/StringBuffer; */
/* invoke-direct {v4}, Ljava/lang/StringBuffer;-><init>()V */
(( java.lang.StringBuffer ) v4 ).append ( v1 ); // invoke-virtual {v4, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
v1 = this.b;
(( java.lang.StringBuffer ) v4 ).append ( v1 ); // invoke-virtual {v4, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v4 ).append ( v0 ); // invoke-virtual {v4, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
/* :catch_1 */
/* move-exception p1 */
/* .line 8 */
v3 = this.d;
/* new-instance v4, Ljava/lang/StringBuffer; */
/* invoke-direct {v4}, Ljava/lang/StringBuffer;-><init>()V */
(( java.lang.StringBuffer ) v4 ).append ( v1 ); // invoke-virtual {v4, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
v1 = this.b;
(( java.lang.StringBuffer ) v4 ).append ( v1 ); // invoke-virtual {v4, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v4 ).append ( v0 ); // invoke-virtual {v4, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
} // :goto_0
return;
} // .end method
public synchronized void close ( ) {
/* .locals 3 */
/* monitor-enter p0 */
/* .line 1 */
try { // :try_start_0
/* iget-boolean v0, p0, Lorg/apache/log4j/AppenderSkeleton;->g:Z */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
/* monitor-exit p0 */
return;
/* .line 3 */
} // :cond_0
try { // :try_start_1
/* new-instance v0, Ljava/lang/StringBuffer; */
/* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
final String v1 = "Closing appender ["; // const-string v1, "Closing appender ["
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
v1 = this.b;
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v1 = "]."; // const-string v1, "]."
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .debug ( v0 );
int v0 = 1; // const/4 v0, 0x1
/* .line 4 */
/* iput-boolean v0, p0, Lorg/apache/log4j/AppenderSkeleton;->g:Z */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 5 */
try { // :try_start_2
v0 = this.s;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 6 */
v0 = this.s;
/* .line 7 */
} // :cond_1
v0 = this.r;
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 8 */
v0 = this.r;
/* :try_end_2 */
/* .catch Ljavax/jms/JMSException; {:try_start_2 ..:try_end_2} :catch_1 */
/* .catch Ljava/lang/RuntimeException; {:try_start_2 ..:try_end_2} :catch_0 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
/* :catch_0 */
/* move-exception v0 */
/* .line 9 */
try { // :try_start_3
/* new-instance v1, Ljava/lang/StringBuffer; */
/* invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V */
final String v2 = "Error while closing JMSAppender ["; // const-string v2, "Error while closing JMSAppender ["
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
v2 = this.b;
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v2 = "]."; // const-string v2, "]."
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .error ( v1,v0 );
/* :catch_1 */
/* move-exception v0 */
/* .line 10 */
/* new-instance v1, Ljava/lang/StringBuffer; */
/* invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V */
final String v2 = "Error while closing JMSAppender ["; // const-string v2, "Error while closing JMSAppender ["
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
v2 = this.b;
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v2 = "]."; // const-string v2, "]."
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .error ( v1,v0 );
} // :cond_2
} // :goto_0
int v0 = 0; // const/4 v0, 0x0
/* .line 11 */
this.t = v0;
/* .line 12 */
this.s = v0;
/* .line 13 */
this.r = v0;
/* :try_end_3 */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_0 */
/* .line 14 */
/* monitor-exit p0 */
return;
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
public java.lang.String getInitialContextFactoryName ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.j;
} // .end method
public Boolean getLocationInfo ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Lorg/apache/log4j/net/JMSAppender;->q:Z */
} // .end method
public java.lang.String getPassword ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.p;
} // .end method
public java.lang.String getProviderURL ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.l;
} // .end method
public java.lang.String getSecurityCredentials ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.i;
} // .end method
public java.lang.String getSecurityPrincipalName ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.h;
} // .end method
public java.lang.String getTopicBindingName ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.m;
} // .end method
public java.lang.String getTopicConnectionFactoryBindingName ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.n;
} // .end method
public java.lang.String getUserName ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.o;
} // .end method
public Boolean requiresLayout ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public void setInitialContextFactoryName ( java.lang.String p0 ) {
/* .locals 0 */
/* .line 1 */
this.j = p1;
return;
} // .end method
public void setLocationInfo ( Boolean p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput-boolean p1, p0, Lorg/apache/log4j/net/JMSAppender;->q:Z */
return;
} // .end method
public void setPassword ( java.lang.String p0 ) {
/* .locals 0 */
/* .line 1 */
this.p = p1;
return;
} // .end method
public void setProviderURL ( java.lang.String p0 ) {
/* .locals 0 */
/* .line 1 */
this.l = p1;
return;
} // .end method
public void setSecurityCredentials ( java.lang.String p0 ) {
/* .locals 0 */
/* .line 1 */
this.i = p1;
return;
} // .end method
public void setSecurityPrincipalName ( java.lang.String p0 ) {
/* .locals 0 */
/* .line 1 */
this.h = p1;
return;
} // .end method
public void setTopicBindingName ( java.lang.String p0 ) {
/* .locals 0 */
/* .line 1 */
this.m = p1;
return;
} // .end method
public void setTopicConnectionFactoryBindingName ( java.lang.String p0 ) {
/* .locals 0 */
/* .line 1 */
this.n = p1;
return;
} // .end method
public void setURLPkgPrefixes ( java.lang.String p0 ) {
/* .locals 0 */
/* .line 1 */
this.k = p1;
return;
} // .end method
public void setUserName ( java.lang.String p0 ) {
/* .locals 0 */
/* .line 1 */
this.o = p1;
return;
} // .end method
