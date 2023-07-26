public class org.apache.log4j.nt.NTEventLogAppender extends org.apache.log4j.AppenderSkeleton {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public Integer h;
	 public java.lang.String i;
	 public java.lang.String j;
	 /* # direct methods */
	 public static org.apache.log4j.nt.NTEventLogAppender ( ) {
		 /* .locals 6 */
		 int v0 = 0; // const/4 v0, 0x0
		 int v1 = 1; // const/4 v1, 0x1
		 try { // :try_start_0
			 /* new-array v2, v1, [Ljava/lang/String; */
			 final String v3 = "os.arch"; // const-string v3, "os.arch"
			 /* .line 1 */
			 java.lang.System .getProperty ( v3 );
			 /* aput-object v3, v2, v0 */
			 /* :try_end_0 */
			 /* .catch Ljava/lang/SecurityException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* :catch_0 */
			 final String v2 = "amd64"; // const-string v2, "amd64"
			 final String v3 = "ia64"; // const-string v3, "ia64"
			 final String v4 = "x86"; // const-string v4, "x86"
			 /* .line 2 */
			 /* filled-new-array {v2, v3, v4}, [Ljava/lang/String; */
		 } // :goto_0
		 int v3 = 0; // const/4 v3, 0x0
		 /* .line 3 */
	 } // :goto_1
	 /* array-length v4, v2 */
	 /* if-ge v3, v4, :cond_0 */
	 /* .line 4 */
	 try { // :try_start_1
		 /* new-instance v4, Ljava/lang/StringBuffer; */
		 /* invoke-direct {v4}, Ljava/lang/StringBuffer;-><init>()V */
		 final String v5 = "NTEventLogAppender."; // const-string v5, "NTEventLogAppender."
		 (( java.lang.StringBuffer ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 /* aget-object v5, v2, v3 */
		 (( java.lang.StringBuffer ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 (( java.lang.StringBuffer ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
		 java.lang.System .loadLibrary ( v4 );
		 /* :try_end_1 */
		 /* .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_1 ..:try_end_1} :catch_1 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* :catch_1 */
		 /* add-int/lit8 v3, v3, 0x1 */
	 } // :cond_0
} // :goto_2
/* if-nez v0, :cond_1 */
final String v0 = "NTEventLogAppender"; // const-string v0, "NTEventLogAppender"
/* .line 5 */
java.lang.System .loadLibrary ( v0 );
} // :cond_1
return;
} // .end method
public org.apache.log4j.nt.NTEventLogAppender ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
/* invoke-direct {p0, v0, v0, v0}, Lorg/apache/log4j/nt/NTEventLogAppender;-><init>(Ljava/lang/String;Ljava/lang/String;Lorg/apache/log4j/Layout;)V */
return;
} // .end method
public org.apache.log4j.nt.NTEventLogAppender ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
/* invoke-direct {p0, v0, p1, v0}, Lorg/apache/log4j/nt/NTEventLogAppender;-><init>(Ljava/lang/String;Ljava/lang/String;Lorg/apache/log4j/Layout;)V */
return;
} // .end method
public org.apache.log4j.nt.NTEventLogAppender ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 3 */
/* invoke-direct {p0, p1, p2, v0}, Lorg/apache/log4j/nt/NTEventLogAppender;-><init>(Ljava/lang/String;Ljava/lang/String;Lorg/apache/log4j/Layout;)V */
return;
} // .end method
public org.apache.log4j.nt.NTEventLogAppender ( ) {
/* .locals 2 */
/* .line 6 */
/* invoke-direct {p0}, Lorg/apache/log4j/AppenderSkeleton;-><init>()V */
int v0 = 0; // const/4 v0, 0x0
/* .line 7 */
/* iput v0, p0, Lorg/apache/log4j/nt/NTEventLogAppender;->h:I */
int v1 = 0; // const/4 v1, 0x0
/* .line 8 */
this.i = v1;
/* .line 9 */
this.j = v1;
/* if-nez p2, :cond_0 */
final String p2 = "Log4j"; // const-string p2, "Log4j"
} // :cond_0
/* if-nez p3, :cond_1 */
/* .line 10 */
/* new-instance p3, Lorg/apache/log4j/TTCCLayout; */
/* invoke-direct {p3}, Lorg/apache/log4j/TTCCLayout;-><init>()V */
this.a = p3;
/* .line 11 */
} // :cond_1
this.a = p3;
/* .line 12 */
} // :goto_0
try { // :try_start_0
p1 = (( org.apache.log4j.nt.NTEventLogAppender ) p0 ).registerEventSource ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lorg/apache/log4j/nt/NTEventLogAppender;->registerEventSource(Ljava/lang/String;Ljava/lang/String;)I
/* iput p1, p0, Lorg/apache/log4j/nt/NTEventLogAppender;->h:I */
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p1 */
/* .line 13 */
(( java.lang.Exception ) p1 ).printStackTrace ( ); // invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V
/* .line 14 */
/* iput v0, p0, Lorg/apache/log4j/nt/NTEventLogAppender;->h:I */
} // :goto_1
return;
} // .end method
public org.apache.log4j.nt.NTEventLogAppender ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 5 */
/* invoke-direct {p0, v0, p1, p2}, Lorg/apache/log4j/nt/NTEventLogAppender;-><init>(Ljava/lang/String;Ljava/lang/String;Lorg/apache/log4j/Layout;)V */
return;
} // .end method
public org.apache.log4j.nt.NTEventLogAppender ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 4 */
/* invoke-direct {p0, v0, v0, p1}, Lorg/apache/log4j/nt/NTEventLogAppender;-><init>(Ljava/lang/String;Ljava/lang/String;Lorg/apache/log4j/Layout;)V */
return;
} // .end method
/* # virtual methods */
public void activateOptions ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.i;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
try { // :try_start_0
v1 = this.j;
v0 = (( org.apache.log4j.nt.NTEventLogAppender ) p0 ).registerEventSource ( v1, v0 ); // invoke-virtual {p0, v1, v0}, Lorg/apache/log4j/nt/NTEventLogAppender;->registerEventSource(Ljava/lang/String;Ljava/lang/String;)I
/* iput v0, p0, Lorg/apache/log4j/nt/NTEventLogAppender;->h:I */
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
final String v1 = "Could not register event source."; // const-string v1, "Could not register event source."
/* .line 3 */
org.apache.log4j.helpers.LogLog .error ( v1,v0 );
int v0 = 0; // const/4 v0, 0x0
/* .line 4 */
/* iput v0, p0, Lorg/apache/log4j/nt/NTEventLogAppender;->h:I */
} // :cond_0
} // :goto_0
return;
} // .end method
public void append ( org.apache.log4j.spi.LoggingEvent p0 ) {
/* .locals 5 */
/* .line 1 */
/* new-instance v0, Ljava/lang/StringBuffer; */
/* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
/* .line 2 */
v1 = this.a;
(( org.apache.log4j.Layout ) v1 ).format ( p1 ); // invoke-virtual {v1, p1}, Lorg/apache/log4j/Layout;->format(Lorg/apache/log4j/spi/LoggingEvent;)Ljava/lang/String;
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 3 */
v1 = this.a;
v1 = (( org.apache.log4j.Layout ) v1 ).ignoresThrowable ( ); // invoke-virtual {v1}, Lorg/apache/log4j/Layout;->ignoresThrowable()Z
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 4 */
(( org.apache.log4j.spi.LoggingEvent ) p1 ).getThrowableStrRep ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getThrowableStrRep()[Ljava/lang/String;
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 5 */
/* array-length v2, v1 */
int v3 = 0; // const/4 v3, 0x0
} // :goto_0
/* if-ge v3, v2, :cond_0 */
/* .line 6 */
/* aget-object v4, v1, v3 */
(( java.lang.StringBuffer ) v0 ).append ( v4 ); // invoke-virtual {v0, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* add-int/lit8 v3, v3, 0x1 */
/* .line 7 */
} // :cond_0
(( org.apache.log4j.spi.LoggingEvent ) p1 ).getLevel ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getLevel()Lorg/apache/log4j/Level;
p1 = (( org.apache.log4j.Priority ) p1 ).toInt ( ); // invoke-virtual {p1}, Lorg/apache/log4j/Priority;->toInt()I
/* .line 8 */
/* iget v1, p0, Lorg/apache/log4j/nt/NTEventLogAppender;->h:I */
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
(( org.apache.log4j.nt.NTEventLogAppender ) p0 ).reportEvent ( v1, v0, p1 ); // invoke-virtual {p0, v1, v0, p1}, Lorg/apache/log4j/nt/NTEventLogAppender;->reportEvent(ILjava/lang/String;I)V
return;
} // .end method
public void close ( ) {
/* .locals 0 */
return;
} // .end method
public native final void deregisterEventSource ( Integer p0 ) {
} // .end method
public void finalize ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Lorg/apache/log4j/nt/NTEventLogAppender;->h:I */
(( org.apache.log4j.nt.NTEventLogAppender ) p0 ).deregisterEventSource ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/log4j/nt/NTEventLogAppender;->deregisterEventSource(I)V
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
/* iput v0, p0, Lorg/apache/log4j/nt/NTEventLogAppender;->h:I */
return;
} // .end method
public java.lang.String getSource ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.i;
} // .end method
public native final Integer registerEventSource ( java.lang.String p0, java.lang.String p1 ) {
} // .end method
public native final void reportEvent ( Integer p0, java.lang.String p1, Integer p2 ) {
} // .end method
public Boolean requiresLayout ( ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
} // .end method
public void setSource ( java.lang.String p0 ) {
/* .locals 0 */
/* .line 1 */
(( java.lang.String ) p1 ).trim ( ); // invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;
this.i = p1;
return;
} // .end method
