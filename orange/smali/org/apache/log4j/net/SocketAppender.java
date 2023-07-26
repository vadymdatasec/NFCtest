public class org.apache.log4j.net.SocketAppender extends org.apache.log4j.AppenderSkeleton {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lorg/apache/log4j/net/SocketAppender$a; */
	 /* } */
} // .end annotation
/* # static fields */
public static final Integer DEFAULT_PORT;
public static final java.lang.String ZONE;
/* # instance fields */
public java.lang.String h;
public java.net.InetAddress i;
public Integer j;
public java.io.ObjectOutputStream k;
public Integer l;
public Boolean m;
public java.lang.String n;
public org.apache.log4j.net.SocketAppender$a o;
public Integer p;
public Boolean q;
public org.apache.log4j.net.ZeroConfSupport r;
/* # direct methods */
public org.apache.log4j.net.SocketAppender ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 /* invoke-direct {p0}, Lorg/apache/log4j/AppenderSkeleton;-><init>()V */
	 /* const/16 v0, 0x11d0 */
	 /* .line 2 */
	 /* iput v0, p0, Lorg/apache/log4j/net/SocketAppender;->j:I */
	 /* const/16 v0, 0x7530 */
	 /* .line 3 */
	 /* iput v0, p0, Lorg/apache/log4j/net/SocketAppender;->l:I */
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 4 */
	 /* iput-boolean v0, p0, Lorg/apache/log4j/net/SocketAppender;->m:Z */
	 /* .line 5 */
	 /* iput v0, p0, Lorg/apache/log4j/net/SocketAppender;->p:I */
	 return;
} // .end method
public org.apache.log4j.net.SocketAppender ( ) {
	 /* .locals 1 */
	 /* .line 15 */
	 /* invoke-direct {p0}, Lorg/apache/log4j/AppenderSkeleton;-><init>()V */
	 /* const/16 v0, 0x11d0 */
	 /* .line 16 */
	 /* iput v0, p0, Lorg/apache/log4j/net/SocketAppender;->j:I */
	 /* const/16 v0, 0x7530 */
	 /* .line 17 */
	 /* iput v0, p0, Lorg/apache/log4j/net/SocketAppender;->l:I */
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 18 */
	 /* iput-boolean v0, p0, Lorg/apache/log4j/net/SocketAppender;->m:Z */
	 /* .line 19 */
	 /* iput v0, p0, Lorg/apache/log4j/net/SocketAppender;->p:I */
	 /* .line 20 */
	 /* iput p2, p0, Lorg/apache/log4j/net/SocketAppender;->j:I */
	 /* .line 21 */
	 org.apache.log4j.net.SocketAppender .a ( p1 );
	 this.i = v0;
	 /* .line 22 */
	 this.h = p1;
	 /* .line 23 */
	 (( org.apache.log4j.net.SocketAppender ) p0 ).a ( v0, p2 ); // invoke-virtual {p0, v0, p2}, Lorg/apache/log4j/net/SocketAppender;->a(Ljava/net/InetAddress;I)V
	 return;
} // .end method
public org.apache.log4j.net.SocketAppender ( ) {
	 /* .locals 1 */
	 /* .line 6 */
	 /* invoke-direct {p0}, Lorg/apache/log4j/AppenderSkeleton;-><init>()V */
	 /* const/16 v0, 0x11d0 */
	 /* .line 7 */
	 /* iput v0, p0, Lorg/apache/log4j/net/SocketAppender;->j:I */
	 /* const/16 v0, 0x7530 */
	 /* .line 8 */
	 /* iput v0, p0, Lorg/apache/log4j/net/SocketAppender;->l:I */
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 9 */
	 /* iput-boolean v0, p0, Lorg/apache/log4j/net/SocketAppender;->m:Z */
	 /* .line 10 */
	 /* iput v0, p0, Lorg/apache/log4j/net/SocketAppender;->p:I */
	 /* .line 11 */
	 this.i = p1;
	 /* .line 12 */
	 (( java.net.InetAddress ) p1 ).getHostName ( ); // invoke-virtual {p1}, Ljava/net/InetAddress;->getHostName()Ljava/lang/String;
	 this.h = v0;
	 /* .line 13 */
	 /* iput p2, p0, Lorg/apache/log4j/net/SocketAppender;->j:I */
	 /* .line 14 */
	 (( org.apache.log4j.net.SocketAppender ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lorg/apache/log4j/net/SocketAppender;->a(Ljava/net/InetAddress;I)V
	 return;
} // .end method
public static java.net.InetAddress a ( java.lang.String p0 ) {
	 /* .locals 3 */
	 /* .line 20 */
	 try { // :try_start_0
		 java.net.InetAddress .getByName ( p0 );
		 /* :try_end_0 */
		 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* :catch_0 */
		 /* move-exception v0 */
		 /* .line 21 */
		 /* instance-of v1, v0, Ljava/io/InterruptedIOException; */
		 /* if-nez v1, :cond_0 */
		 /* instance-of v1, v0, Ljava/lang/InterruptedException; */
		 if ( v1 != null) { // if-eqz v1, :cond_1
			 /* .line 22 */
		 } // :cond_0
		 java.lang.Thread .currentThread ( );
		 (( java.lang.Thread ) v1 ).interrupt ( ); // invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V
		 /* .line 23 */
	 } // :cond_1
	 /* new-instance v1, Ljava/lang/StringBuffer; */
	 /* invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V */
	 final String v2 = "Could not find address of ["; // const-string v2, "Could not find address of ["
	 (( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 (( java.lang.StringBuffer ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 final String p0 = "]."; // const-string p0, "]."
	 (( java.lang.StringBuffer ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 (( java.lang.StringBuffer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
	 org.apache.log4j.helpers.LogLog .error ( p0,v0 );
	 int p0 = 0; // const/4 p0, 0x0
} // .end method
public static org.apache.log4j.net.SocketAppender$a a ( org.apache.log4j.net.SocketAppender p0, org.apache.log4j.net.SocketAppender$a p1 ) { //synthethic
	 /* .locals 0 */
	 /* .line 1 */
	 this.o = p1;
} // .end method
/* # virtual methods */
public void a ( ) {
	 /* .locals 2 */
	 /* .line 14 */
	 v0 = this.o;
	 /* if-nez v0, :cond_0 */
	 final String v0 = "Starting a new connector thread."; // const-string v0, "Starting a new connector thread."
	 /* .line 15 */
	 org.apache.log4j.helpers.LogLog .debug ( v0 );
	 /* .line 16 */
	 /* new-instance v0, Lorg/apache/log4j/net/SocketAppender$a; */
	 /* invoke-direct {v0, p0}, Lorg/apache/log4j/net/SocketAppender$a;-><init>(Lorg/apache/log4j/net/SocketAppender;)V */
	 this.o = v0;
	 int v1 = 1; // const/4 v1, 0x1
	 /* .line 17 */
	 (( java.lang.Thread ) v0 ).setDaemon ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/Thread;->setDaemon(Z)V
	 /* .line 18 */
	 v0 = this.o;
	 (( java.lang.Thread ) v0 ).setPriority ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/Thread;->setPriority(I)V
	 /* .line 19 */
	 v0 = this.o;
	 (( java.lang.Thread ) v0 ).start ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->start()V
} // :cond_0
return;
} // .end method
public void a ( java.net.InetAddress p0, Integer p1 ) {
/* .locals 2 */
/* .line 2 */
v0 = this.i;
/* if-nez v0, :cond_0 */
return;
/* .line 3 */
} // :cond_0
try { // :try_start_0
(( org.apache.log4j.net.SocketAppender ) p0 ).cleanUp ( ); // invoke-virtual {p0}, Lorg/apache/log4j/net/SocketAppender;->cleanUp()V
/* .line 4 */
/* new-instance v0, Ljava/io/ObjectOutputStream; */
/* new-instance v1, Ljava/net/Socket; */
/* invoke-direct {v1, p1, p2}, Ljava/net/Socket;-><init>(Ljava/net/InetAddress;I)V */
(( java.net.Socket ) v1 ).getOutputStream ( ); // invoke-virtual {v1}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;
/* invoke-direct {v0, p2}, Ljava/io/ObjectOutputStream;-><init>(Ljava/io/OutputStream;)V */
this.k = v0;
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p2 */
/* .line 5 */
/* instance-of v0, p2, Ljava/io/InterruptedIOException; */
if ( v0 != null) { // if-eqz v0, :cond_1
	 /* .line 6 */
	 java.lang.Thread .currentThread ( );
	 (( java.lang.Thread ) v0 ).interrupt ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V
	 /* .line 7 */
} // :cond_1
/* new-instance v0, Ljava/lang/StringBuffer; */
/* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
final String v1 = "Could not connect to remote log4j server at ["; // const-string v1, "Could not connect to remote log4j server at ["
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.net.InetAddress ) p1 ).getHostName ( ); // invoke-virtual {p1}, Ljava/net/InetAddress;->getHostName()Ljava/lang/String;
(( java.lang.StringBuffer ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String p1 = "]."; // const-string p1, "]."
(( java.lang.StringBuffer ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
/* .line 8 */
/* iget v0, p0, Lorg/apache/log4j/net/SocketAppender;->l:I */
/* if-lez v0, :cond_2 */
/* .line 9 */
/* new-instance p2, Ljava/lang/StringBuffer; */
/* invoke-direct {p2}, Ljava/lang/StringBuffer;-><init>()V */
(( java.lang.StringBuffer ) p2 ).append ( p1 ); // invoke-virtual {p2, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String p1 = " We will try again later."; // const-string p1, " We will try again later."
(( java.lang.StringBuffer ) p2 ).append ( p1 ); // invoke-virtual {p2, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
/* .line 10 */
(( org.apache.log4j.net.SocketAppender ) p0 ).a ( ); // invoke-virtual {p0}, Lorg/apache/log4j/net/SocketAppender;->a()V
/* .line 11 */
} // :cond_2
/* new-instance v0, Ljava/lang/StringBuffer; */
/* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
(( java.lang.StringBuffer ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String p1 = " We are not retrying."; // const-string p1, " We are not retrying."
(( java.lang.StringBuffer ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
/* .line 12 */
v0 = this.d;
int v1 = 0; // const/4 v1, 0x0
/* .line 13 */
} // :goto_0
org.apache.log4j.helpers.LogLog .error ( p1 );
} // :goto_1
return;
} // .end method
public void activateOptions ( ) {
/* .locals 4 */
/* .line 1 */
/* iget-boolean v0, p0, Lorg/apache/log4j/net/SocketAppender;->q:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
/* new-instance v0, Lorg/apache/log4j/net/ZeroConfSupport; */
/* iget v1, p0, Lorg/apache/log4j/net/SocketAppender;->j:I */
(( org.apache.log4j.AppenderSkeleton ) p0 ).getName ( ); // invoke-virtual {p0}, Lorg/apache/log4j/AppenderSkeleton;->getName()Ljava/lang/String;
final String v3 = "_log4j_obj_tcpconnect_appender.local."; // const-string v3, "_log4j_obj_tcpconnect_appender.local."
/* invoke-direct {v0, v3, v1, v2}, Lorg/apache/log4j/net/ZeroConfSupport;-><init>(Ljava/lang/String;ILjava/lang/String;)V */
this.r = v0;
/* .line 3 */
(( org.apache.log4j.net.ZeroConfSupport ) v0 ).advertise ( ); // invoke-virtual {v0}, Lorg/apache/log4j/net/ZeroConfSupport;->advertise()V
/* .line 4 */
} // :cond_0
v0 = this.i;
/* iget v1, p0, Lorg/apache/log4j/net/SocketAppender;->j:I */
(( org.apache.log4j.net.SocketAppender ) p0 ).a ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lorg/apache/log4j/net/SocketAppender;->a(Ljava/net/InetAddress;I)V
return;
} // .end method
public void append ( org.apache.log4j.spi.LoggingEvent p0 ) {
/* .locals 3 */
/* if-nez p1, :cond_0 */
return;
/* .line 1 */
} // :cond_0
v0 = this.i;
/* if-nez v0, :cond_1 */
/* .line 2 */
p1 = this.d;
/* new-instance v0, Ljava/lang/StringBuffer; */
/* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
final String v1 = "No remote host is set for SocketAppender named \""; // const-string v1, "No remote host is set for SocketAppender named \""
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
v1 = this.b;
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v1 = "\"."; // const-string v1, "\"."
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
return;
/* .line 3 */
} // :cond_1
v0 = this.k;
if ( v0 != null) { // if-eqz v0, :cond_6
int v0 = 0; // const/4 v0, 0x0
/* .line 4 */
try { // :try_start_0
/* iget-boolean v1, p0, Lorg/apache/log4j/net/SocketAppender;->m:Z */
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 5 */
(( org.apache.log4j.spi.LoggingEvent ) p1 ).getLocationInformation ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getLocationInformation()Lorg/apache/log4j/spi/LocationInfo;
/* .line 6 */
} // :cond_2
v1 = this.n;
if ( v1 != null) { // if-eqz v1, :cond_3
final String v1 = "application"; // const-string v1, "application"
/* .line 7 */
v2 = this.n;
(( org.apache.log4j.spi.LoggingEvent ) p1 ).setProperty ( v1, v2 ); // invoke-virtual {p1, v1, v2}, Lorg/apache/log4j/spi/LoggingEvent;->setProperty(Ljava/lang/String;Ljava/lang/String;)V
/* .line 8 */
} // :cond_3
(( org.apache.log4j.spi.LoggingEvent ) p1 ).getNDC ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getNDC()Ljava/lang/String;
/* .line 9 */
(( org.apache.log4j.spi.LoggingEvent ) p1 ).getThreadName ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getThreadName()Ljava/lang/String;
/* .line 10 */
(( org.apache.log4j.spi.LoggingEvent ) p1 ).getMDCCopy ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getMDCCopy()V
/* .line 11 */
(( org.apache.log4j.spi.LoggingEvent ) p1 ).getRenderedMessage ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getRenderedMessage()Ljava/lang/String;
/* .line 12 */
(( org.apache.log4j.spi.LoggingEvent ) p1 ).getThrowableStrRep ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getThrowableStrRep()[Ljava/lang/String;
/* .line 13 */
v1 = this.k;
(( java.io.ObjectOutputStream ) v1 ).writeObject ( p1 ); // invoke-virtual {v1, p1}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V
/* .line 14 */
p1 = this.k;
(( java.io.ObjectOutputStream ) p1 ).flush ( ); // invoke-virtual {p1}, Ljava/io/ObjectOutputStream;->flush()V
/* .line 15 */
/* iget p1, p0, Lorg/apache/log4j/net/SocketAppender;->p:I */
int v1 = 1; // const/4 v1, 0x1
/* add-int/2addr p1, v1 */
/* iput p1, p0, Lorg/apache/log4j/net/SocketAppender;->p:I */
/* if-lt p1, v1, :cond_6 */
/* .line 16 */
/* iput v0, p0, Lorg/apache/log4j/net/SocketAppender;->p:I */
/* .line 17 */
p1 = this.k;
(( java.io.ObjectOutputStream ) p1 ).reset ( ); // invoke-virtual {p1}, Ljava/io/ObjectOutputStream;->reset()V
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p1 */
/* .line 18 */
/* instance-of v1, p1, Ljava/io/InterruptedIOException; */
if ( v1 != null) { // if-eqz v1, :cond_4
/* .line 19 */
java.lang.Thread .currentThread ( );
(( java.lang.Thread ) v1 ).interrupt ( ); // invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V
} // :cond_4
int v1 = 0; // const/4 v1, 0x0
/* .line 20 */
this.k = v1;
/* .line 21 */
/* new-instance v1, Ljava/lang/StringBuffer; */
/* invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V */
final String v2 = "Detected problem with connection: "; // const-string v2, "Detected problem with connection: "
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .warn ( v1 );
/* .line 22 */
/* iget v1, p0, Lorg/apache/log4j/net/SocketAppender;->l:I */
/* if-lez v1, :cond_5 */
/* .line 23 */
(( org.apache.log4j.net.SocketAppender ) p0 ).a ( ); // invoke-virtual {p0}, Lorg/apache/log4j/net/SocketAppender;->a()V
/* .line 24 */
} // :cond_5
v1 = this.d;
final String v2 = "Detected problem with connection, not reconnecting."; // const-string v2, "Detected problem with connection, not reconnecting."
} // :cond_6
} // :goto_0
return;
} // .end method
public void cleanUp ( ) {
/* .locals 3 */
/* .line 1 */
v0 = this.k;
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 2 */
try { // :try_start_0
(( java.io.ObjectOutputStream ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/io/ObjectOutputStream;->close()V
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
/* .line 3 */
/* instance-of v2, v0, Ljava/io/InterruptedIOException; */
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 4 */
java.lang.Thread .currentThread ( );
(( java.lang.Thread ) v2 ).interrupt ( ); // invoke-virtual {v2}, Ljava/lang/Thread;->interrupt()V
} // :cond_0
final String v2 = "Could not close oos."; // const-string v2, "Could not close oos."
/* .line 5 */
org.apache.log4j.helpers.LogLog .error ( v2,v0 );
/* .line 6 */
} // :goto_0
this.k = v1;
/* .line 7 */
} // :cond_1
v0 = this.o;
if ( v0 != null) { // if-eqz v0, :cond_2
int v2 = 1; // const/4 v2, 0x1
/* .line 8 */
/* iput-boolean v2, v0, Lorg/apache/log4j/net/SocketAppender$a;->b:Z */
/* .line 9 */
this.o = v1;
} // :cond_2
return;
} // .end method
public synchronized void close ( ) {
/* .locals 1 */
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
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
/* .line 3 */
try { // :try_start_1
/* iput-boolean v0, p0, Lorg/apache/log4j/AppenderSkeleton;->g:Z */
/* .line 4 */
/* iget-boolean v0, p0, Lorg/apache/log4j/net/SocketAppender;->q:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 5 */
v0 = this.r;
(( org.apache.log4j.net.ZeroConfSupport ) v0 ).unadvertise ( ); // invoke-virtual {v0}, Lorg/apache/log4j/net/ZeroConfSupport;->unadvertise()V
/* .line 6 */
} // :cond_1
(( org.apache.log4j.net.SocketAppender ) p0 ).cleanUp ( ); // invoke-virtual {p0}, Lorg/apache/log4j/net/SocketAppender;->cleanUp()V
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 7 */
/* monitor-exit p0 */
return;
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
public java.lang.String getApplication ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.n;
} // .end method
public Boolean getLocationInfo ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Lorg/apache/log4j/net/SocketAppender;->m:Z */
} // .end method
public Integer getPort ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Lorg/apache/log4j/net/SocketAppender;->j:I */
} // .end method
public Integer getReconnectionDelay ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Lorg/apache/log4j/net/SocketAppender;->l:I */
} // .end method
public java.lang.String getRemoteHost ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.h;
} // .end method
public Boolean isAdvertiseViaMulticastDNS ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Lorg/apache/log4j/net/SocketAppender;->q:Z */
} // .end method
public Boolean requiresLayout ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public void setAdvertiseViaMulticastDNS ( Boolean p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput-boolean p1, p0, Lorg/apache/log4j/net/SocketAppender;->q:Z */
return;
} // .end method
public void setApplication ( java.lang.String p0 ) {
/* .locals 0 */
/* .line 1 */
this.n = p1;
return;
} // .end method
public void setLocationInfo ( Boolean p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput-boolean p1, p0, Lorg/apache/log4j/net/SocketAppender;->m:Z */
return;
} // .end method
public void setPort ( Integer p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput p1, p0, Lorg/apache/log4j/net/SocketAppender;->j:I */
return;
} // .end method
public void setReconnectionDelay ( Integer p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput p1, p0, Lorg/apache/log4j/net/SocketAppender;->l:I */
return;
} // .end method
public void setRemoteHost ( java.lang.String p0 ) {
/* .locals 1 */
/* .line 1 */
org.apache.log4j.net.SocketAppender .a ( p1 );
this.i = v0;
/* .line 2 */
this.h = p1;
return;
} // .end method
