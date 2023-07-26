public class org.apache.log4j.net.SocketHubAppender extends org.apache.log4j.AppenderSkeleton {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lorg/apache/log4j/net/SocketHubAppender$a; */
	 /* } */
} // .end annotation
/* # static fields */
public static final java.lang.String ZONE;
/* # instance fields */
public Integer h;
public java.util.Vector i;
public org.apache.log4j.net.SocketHubAppender$a j;
public Boolean k;
public org.apache.log4j.helpers.CyclicBuffer l;
public java.lang.String m;
public Boolean n;
public org.apache.log4j.net.ZeroConfSupport o;
public java.net.ServerSocket p;
/* # direct methods */
public org.apache.log4j.net.SocketHubAppender ( ) {
	 /* .locals 2 */
	 /* .line 1 */
	 /* invoke-direct {p0}, Lorg/apache/log4j/AppenderSkeleton;-><init>()V */
	 /* const/16 v0, 0x11d0 */
	 /* .line 2 */
	 /* iput v0, p0, Lorg/apache/log4j/net/SocketHubAppender;->h:I */
	 /* .line 3 */
	 /* new-instance v0, Ljava/util/Vector; */
	 /* invoke-direct {v0}, Ljava/util/Vector;-><init>()V */
	 this.i = v0;
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 4 */
	 this.j = v0;
	 int v1 = 0; // const/4 v1, 0x0
	 /* .line 5 */
	 /* iput-boolean v1, p0, Lorg/apache/log4j/net/SocketHubAppender;->k:Z */
	 /* .line 6 */
	 this.l = v0;
	 return;
} // .end method
public org.apache.log4j.net.SocketHubAppender ( ) {
	 /* .locals 2 */
	 /* .line 7 */
	 /* invoke-direct {p0}, Lorg/apache/log4j/AppenderSkeleton;-><init>()V */
	 /* const/16 v0, 0x11d0 */
	 /* .line 8 */
	 /* iput v0, p0, Lorg/apache/log4j/net/SocketHubAppender;->h:I */
	 /* .line 9 */
	 /* new-instance v0, Ljava/util/Vector; */
	 /* invoke-direct {v0}, Ljava/util/Vector;-><init>()V */
	 this.i = v0;
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 10 */
	 this.j = v0;
	 int v1 = 0; // const/4 v1, 0x0
	 /* .line 11 */
	 /* iput-boolean v1, p0, Lorg/apache/log4j/net/SocketHubAppender;->k:Z */
	 /* .line 12 */
	 this.l = v0;
	 /* .line 13 */
	 /* iput p1, p0, Lorg/apache/log4j/net/SocketHubAppender;->h:I */
	 /* .line 14 */
	 (( org.apache.log4j.net.SocketHubAppender ) p0 ).a ( ); // invoke-virtual {p0}, Lorg/apache/log4j/net/SocketHubAppender;->a()V
	 return;
} // .end method
public static java.net.ServerSocket a ( org.apache.log4j.net.SocketHubAppender p0 ) { //synthethic
	 /* .locals 0 */
	 /* .line 1 */
	 p0 = this.p;
} // .end method
public static java.net.ServerSocket a ( org.apache.log4j.net.SocketHubAppender p0, java.net.ServerSocket p1 ) { //synthethic
	 /* .locals 0 */
	 /* .line 2 */
	 this.p = p1;
} // .end method
public static org.apache.log4j.helpers.CyclicBuffer b ( org.apache.log4j.net.SocketHubAppender p0 ) { //synthethic
	 /* .locals 0 */
	 /* .line 1 */
	 p0 = this.l;
} // .end method
/* # virtual methods */
public java.net.ServerSocket a ( Integer p0 ) {
	 /* .locals 1 */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Ljava/io/IOException; */
	 /* } */
} // .end annotation
/* .line 4 */
/* new-instance v0, Ljava/net/ServerSocket; */
/* invoke-direct {v0, p1}, Ljava/net/ServerSocket;-><init>(I)V */
} // .end method
public final void a ( ) {
/* .locals 3 */
/* .line 3 */
/* new-instance v0, Lorg/apache/log4j/net/SocketHubAppender$a; */
/* iget v1, p0, Lorg/apache/log4j/net/SocketHubAppender;->h:I */
v2 = this.i;
/* invoke-direct {v0, p0, v1, v2}, Lorg/apache/log4j/net/SocketHubAppender$a;-><init>(Lorg/apache/log4j/net/SocketHubAppender;ILjava/util/Vector;)V */
this.j = v0;
return;
} // .end method
public void activateOptions ( ) {
/* .locals 4 */
/* .line 1 */
/* iget-boolean v0, p0, Lorg/apache/log4j/net/SocketHubAppender;->n:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 2 */
	 /* new-instance v0, Lorg/apache/log4j/net/ZeroConfSupport; */
	 /* iget v1, p0, Lorg/apache/log4j/net/SocketHubAppender;->h:I */
	 (( org.apache.log4j.AppenderSkeleton ) p0 ).getName ( ); // invoke-virtual {p0}, Lorg/apache/log4j/AppenderSkeleton;->getName()Ljava/lang/String;
	 final String v3 = "_log4j_obj_tcpaccept_appender.local."; // const-string v3, "_log4j_obj_tcpaccept_appender.local."
	 /* invoke-direct {v0, v3, v1, v2}, Lorg/apache/log4j/net/ZeroConfSupport;-><init>(Ljava/lang/String;ILjava/lang/String;)V */
	 this.o = v0;
	 /* .line 3 */
	 (( org.apache.log4j.net.ZeroConfSupport ) v0 ).advertise ( ); // invoke-virtual {v0}, Lorg/apache/log4j/net/ZeroConfSupport;->advertise()V
	 /* .line 4 */
} // :cond_0
(( org.apache.log4j.net.SocketHubAppender ) p0 ).a ( ); // invoke-virtual {p0}, Lorg/apache/log4j/net/SocketHubAppender;->a()V
return;
} // .end method
public void append ( org.apache.log4j.spi.LoggingEvent p0 ) {
/* .locals 3 */
if ( p1 != null) { // if-eqz p1, :cond_2
	 /* .line 1 */
	 /* iget-boolean v0, p0, Lorg/apache/log4j/net/SocketHubAppender;->k:Z */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 2 */
		 (( org.apache.log4j.spi.LoggingEvent ) p1 ).getLocationInformation ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getLocationInformation()Lorg/apache/log4j/spi/LocationInfo;
		 /* .line 3 */
	 } // :cond_0
	 v0 = this.m;
	 if ( v0 != null) { // if-eqz v0, :cond_1
		 final String v1 = "application"; // const-string v1, "application"
		 /* .line 4 */
		 (( org.apache.log4j.spi.LoggingEvent ) p1 ).setProperty ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Lorg/apache/log4j/spi/LoggingEvent;->setProperty(Ljava/lang/String;Ljava/lang/String;)V
		 /* .line 5 */
	 } // :cond_1
	 (( org.apache.log4j.spi.LoggingEvent ) p1 ).getNDC ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getNDC()Ljava/lang/String;
	 /* .line 6 */
	 (( org.apache.log4j.spi.LoggingEvent ) p1 ).getThreadName ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getThreadName()Ljava/lang/String;
	 /* .line 7 */
	 (( org.apache.log4j.spi.LoggingEvent ) p1 ).getMDCCopy ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getMDCCopy()V
	 /* .line 8 */
	 (( org.apache.log4j.spi.LoggingEvent ) p1 ).getRenderedMessage ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getRenderedMessage()Ljava/lang/String;
	 /* .line 9 */
	 (( org.apache.log4j.spi.LoggingEvent ) p1 ).getThrowableStrRep ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getThrowableStrRep()[Ljava/lang/String;
	 /* .line 10 */
	 v0 = this.l;
	 if ( v0 != null) { // if-eqz v0, :cond_2
		 /* .line 11 */
		 (( org.apache.log4j.helpers.CyclicBuffer ) v0 ).add ( p1 ); // invoke-virtual {v0, p1}, Lorg/apache/log4j/helpers/CyclicBuffer;->add(Lorg/apache/log4j/spi/LoggingEvent;)V
	 } // :cond_2
	 if ( p1 != null) { // if-eqz p1, :cond_6
		 /* .line 12 */
		 v0 = this.i;
		 v0 = 		 (( java.util.Vector ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/Vector;->size()I
		 /* if-nez v0, :cond_3 */
	 } // :cond_3
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 13 */
} // :goto_0
v1 = this.i;
v1 = (( java.util.Vector ) v1 ).size ( ); // invoke-virtual {v1}, Ljava/util/Vector;->size()I
/* if-ge v0, v1, :cond_6 */
int v1 = 0; // const/4 v1, 0x0
/* .line 14 */
try { // :try_start_0
	 v2 = this.i;
	 (( java.util.Vector ) v2 ).elementAt ( v0 ); // invoke-virtual {v2, v0}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;
	 /* check-cast v2, Ljava/io/ObjectOutputStream; */
	 /* :try_end_0 */
	 /* .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* move-object v1, v2 */
	 /* :catch_0 */
	 /* nop */
} // :goto_1
/* if-nez v1, :cond_4 */
/* .line 15 */
} // :cond_4
try { // :try_start_1
(( java.io.ObjectOutputStream ) v1 ).writeObject ( p1 ); // invoke-virtual {v1, p1}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V
/* .line 16 */
(( java.io.ObjectOutputStream ) v1 ).flush ( ); // invoke-virtual {v1}, Ljava/io/ObjectOutputStream;->flush()V
/* .line 17 */
(( java.io.ObjectOutputStream ) v1 ).reset ( ); // invoke-virtual {v1}, Ljava/io/ObjectOutputStream;->reset()V
/* :try_end_1 */
/* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_1 */
/* :catch_1 */
/* move-exception v1 */
/* .line 18 */
/* instance-of v1, v1, Ljava/io/InterruptedIOException; */
if ( v1 != null) { // if-eqz v1, :cond_5
	 /* .line 19 */
	 java.lang.Thread .currentThread ( );
	 (( java.lang.Thread ) v1 ).interrupt ( ); // invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V
	 /* .line 20 */
} // :cond_5
v1 = this.i;
(( java.util.Vector ) v1 ).removeElementAt ( v0 ); // invoke-virtual {v1, v0}, Ljava/util/Vector;->removeElementAt(I)V
final String v1 = "dropped connection"; // const-string v1, "dropped connection"
/* .line 21 */
org.apache.log4j.helpers.LogLog .debug ( v1 );
/* add-int/lit8 v0, v0, -0x1 */
} // :goto_2
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_6
} // :goto_3
return;
} // .end method
public void cleanUp ( ) {
/* .locals 4 */
final String v0 = "could not close oos."; // const-string v0, "could not close oos."
final String v1 = "stopping ServerSocket"; // const-string v1, "stopping ServerSocket"
/* .line 1 */
org.apache.log4j.helpers.LogLog .debug ( v1 );
/* .line 2 */
v1 = this.j;
(( org.apache.log4j.net.SocketHubAppender$a ) v1 ).a ( ); // invoke-virtual {v1}, Lorg/apache/log4j/net/SocketHubAppender$a;->a()V
int v1 = 0; // const/4 v1, 0x0
/* .line 3 */
this.j = v1;
final String v1 = "closing client connections"; // const-string v1, "closing client connections"
/* .line 4 */
org.apache.log4j.helpers.LogLog .debug ( v1 );
/* .line 5 */
} // :cond_0
} // :goto_0
v1 = this.i;
v1 = (( java.util.Vector ) v1 ).size ( ); // invoke-virtual {v1}, Ljava/util/Vector;->size()I
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 6 */
v1 = this.i;
int v2 = 0; // const/4 v2, 0x0
(( java.util.Vector ) v1 ).elementAt ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;
/* check-cast v1, Ljava/io/ObjectOutputStream; */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 7 */
try { // :try_start_0
(( java.io.ObjectOutputStream ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/io/ObjectOutputStream;->close()V
/* :try_end_0 */
/* .catch Ljava/io/InterruptedIOException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v1 */
/* .line 8 */
org.apache.log4j.helpers.LogLog .error ( v0,v1 );
/* :catch_1 */
/* move-exception v1 */
/* .line 9 */
java.lang.Thread .currentThread ( );
(( java.lang.Thread ) v3 ).interrupt ( ); // invoke-virtual {v3}, Ljava/lang/Thread;->interrupt()V
/* .line 10 */
org.apache.log4j.helpers.LogLog .error ( v0,v1 );
/* .line 11 */
} // :goto_1
v1 = this.i;
(( java.util.Vector ) v1 ).removeElementAt ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/Vector;->removeElementAt(I)V
} // :cond_1
return;
} // .end method
public synchronized void close ( ) {
/* .locals 2 */
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
final String v1 = "closing SocketHubAppender "; // const-string v1, "closing SocketHubAppender "
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( org.apache.log4j.AppenderSkeleton ) p0 ).getName ( ); // invoke-virtual {p0}, Lorg/apache/log4j/AppenderSkeleton;->getName()Ljava/lang/String;
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .debug ( v0 );
int v0 = 1; // const/4 v0, 0x1
/* .line 4 */
/* iput-boolean v0, p0, Lorg/apache/log4j/AppenderSkeleton;->g:Z */
/* .line 5 */
/* iget-boolean v0, p0, Lorg/apache/log4j/net/SocketHubAppender;->n:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 6 */
v0 = this.o;
(( org.apache.log4j.net.ZeroConfSupport ) v0 ).unadvertise ( ); // invoke-virtual {v0}, Lorg/apache/log4j/net/ZeroConfSupport;->unadvertise()V
/* .line 7 */
} // :cond_1
(( org.apache.log4j.net.SocketHubAppender ) p0 ).cleanUp ( ); // invoke-virtual {p0}, Lorg/apache/log4j/net/SocketHubAppender;->cleanUp()V
/* .line 8 */
/* new-instance v0, Ljava/lang/StringBuffer; */
/* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
final String v1 = "SocketHubAppender "; // const-string v1, "SocketHubAppender "
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( org.apache.log4j.AppenderSkeleton ) p0 ).getName ( ); // invoke-virtual {p0}, Lorg/apache/log4j/AppenderSkeleton;->getName()Ljava/lang/String;
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v1 = " closed"; // const-string v1, " closed"
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .debug ( v0 );
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 9 */
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
v0 = this.m;
} // .end method
public Integer getBufferSize ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.l;
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
} // :cond_0
v0 = (( org.apache.log4j.helpers.CyclicBuffer ) v0 ).getMaxSize ( ); // invoke-virtual {v0}, Lorg/apache/log4j/helpers/CyclicBuffer;->getMaxSize()I
} // .end method
public Boolean getLocationInfo ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Lorg/apache/log4j/net/SocketHubAppender;->k:Z */
} // .end method
public Integer getPort ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Lorg/apache/log4j/net/SocketHubAppender;->h:I */
} // .end method
public Boolean isAdvertiseViaMulticastDNS ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Lorg/apache/log4j/net/SocketHubAppender;->n:Z */
} // .end method
public Boolean requiresLayout ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public void setAdvertiseViaMulticastDNS ( Boolean p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput-boolean p1, p0, Lorg/apache/log4j/net/SocketHubAppender;->n:Z */
return;
} // .end method
public void setApplication ( java.lang.String p0 ) {
/* .locals 0 */
/* .line 1 */
this.m = p1;
return;
} // .end method
public void setBufferSize ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Lorg/apache/log4j/helpers/CyclicBuffer; */
/* invoke-direct {v0, p1}, Lorg/apache/log4j/helpers/CyclicBuffer;-><init>(I)V */
this.l = v0;
return;
} // .end method
public void setLocationInfo ( Boolean p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput-boolean p1, p0, Lorg/apache/log4j/net/SocketHubAppender;->k:Z */
return;
} // .end method
public void setPort ( Integer p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput p1, p0, Lorg/apache/log4j/net/SocketHubAppender;->h:I */
return;
} // .end method
