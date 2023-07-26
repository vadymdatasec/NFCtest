public class org.apache.log4j.WriterAppender extends org.apache.log4j.AppenderSkeleton {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public Boolean h;
	 public java.lang.String i;
	 public org.apache.log4j.helpers.QuietWriter j;
	 /* # direct methods */
	 public org.apache.log4j.WriterAppender ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Lorg/apache/log4j/AppenderSkeleton;-><init>()V */
		 int v0 = 1; // const/4 v0, 0x1
		 /* .line 2 */
		 /* iput-boolean v0, p0, Lorg/apache/log4j/WriterAppender;->h:Z */
		 return;
	 } // .end method
	 public org.apache.log4j.WriterAppender ( ) {
		 /* .locals 1 */
		 /* .line 3 */
		 /* new-instance v0, Ljava/io/OutputStreamWriter; */
		 /* invoke-direct {v0, p2}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;)V */
		 /* invoke-direct {p0, p1, v0}, Lorg/apache/log4j/WriterAppender;-><init>(Lorg/apache/log4j/Layout;Ljava/io/Writer;)V */
		 return;
	 } // .end method
	 public org.apache.log4j.WriterAppender ( ) {
		 /* .locals 1 */
		 /* .line 4 */
		 /* invoke-direct {p0}, Lorg/apache/log4j/AppenderSkeleton;-><init>()V */
		 int v0 = 1; // const/4 v0, 0x1
		 /* .line 5 */
		 /* iput-boolean v0, p0, Lorg/apache/log4j/WriterAppender;->h:Z */
		 /* .line 6 */
		 this.a = p1;
		 /* .line 7 */
		 (( org.apache.log4j.WriterAppender ) p0 ).setWriter ( p2 ); // invoke-virtual {p0, p2}, Lorg/apache/log4j/WriterAppender;->setWriter(Ljava/io/Writer;)V
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.io.OutputStreamWriter a ( java.io.OutputStream p0 ) {
		 /* .locals 2 */
		 /* .line 7 */
		 (( org.apache.log4j.WriterAppender ) p0 ).getEncoding ( ); // invoke-virtual {p0}, Lorg/apache/log4j/WriterAppender;->getEncoding()Ljava/lang/String;
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 /* .line 8 */
			 try { // :try_start_0
				 /* new-instance v1, Ljava/io/OutputStreamWriter; */
				 /* invoke-direct {v1, p1, v0}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/lang/String;)V */
				 /* :try_end_0 */
				 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
				 /* :catch_0 */
				 /* move-exception v0 */
				 /* .line 9 */
				 /* instance-of v0, v0, Ljava/io/InterruptedIOException; */
				 if ( v0 != null) { // if-eqz v0, :cond_0
					 /* .line 10 */
					 java.lang.Thread .currentThread ( );
					 (( java.lang.Thread ) v0 ).interrupt ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V
				 } // :cond_0
				 final String v0 = "Error initializing output writer."; // const-string v0, "Error initializing output writer."
				 /* .line 11 */
				 org.apache.log4j.helpers.LogLog .warn ( v0 );
				 final String v0 = "Unsupported encoding?"; // const-string v0, "Unsupported encoding?"
				 /* .line 12 */
				 org.apache.log4j.helpers.LogLog .warn ( v0 );
			 } // :cond_1
			 int v1 = 0; // const/4 v1, 0x0
		 } // :goto_0
		 /* if-nez v1, :cond_2 */
		 /* .line 13 */
		 /* new-instance v1, Ljava/io/OutputStreamWriter; */
		 /* invoke-direct {v1, p1}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;)V */
	 } // :cond_2
} // .end method
public Boolean a ( ) {
	 /* .locals 5 */
	 /* .line 1 */
	 /* iget-boolean v0, p0, Lorg/apache/log4j/AppenderSkeleton;->g:Z */
	 int v1 = 0; // const/4 v1, 0x0
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 final String v0 = "Not allowed to write to a closed appender."; // const-string v0, "Not allowed to write to a closed appender."
		 /* .line 2 */
		 org.apache.log4j.helpers.LogLog .warn ( v0 );
		 /* .line 3 */
	 } // :cond_0
	 v0 = this.j;
	 final String v2 = "]."; // const-string v2, "]."
	 /* if-nez v0, :cond_1 */
	 /* .line 4 */
	 v0 = this.d;
	 /* new-instance v3, Ljava/lang/StringBuffer; */
	 /* invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V */
	 final String v4 = "No output stream or file set for the appender named ["; // const-string v4, "No output stream or file set for the appender named ["
	 (( java.lang.StringBuffer ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 v4 = this.b;
	 (( java.lang.StringBuffer ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 (( java.lang.StringBuffer ) v3 ).append ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 (( java.lang.StringBuffer ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
	 /* .line 5 */
} // :cond_1
v0 = this.a;
/* if-nez v0, :cond_2 */
/* .line 6 */
v0 = this.d;
/* new-instance v3, Ljava/lang/StringBuffer; */
/* invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V */
final String v4 = "No layout set for the appender named ["; // const-string v4, "No layout set for the appender named ["
(( java.lang.StringBuffer ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
v4 = this.b;
(( java.lang.StringBuffer ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v3 ).append ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
} // :cond_2
int v0 = 1; // const/4 v0, 0x1
} // .end method
public Boolean a ( org.apache.log4j.spi.LoggingEvent p0 ) {
/* .locals 0 */
/* .line 14 */
/* iget-boolean p1, p0, Lorg/apache/log4j/WriterAppender;->h:Z */
} // .end method
public void activateOptions ( ) {
/* .locals 0 */
return;
} // .end method
public void append ( org.apache.log4j.spi.LoggingEvent p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = (( org.apache.log4j.WriterAppender ) p0 ).a ( ); // invoke-virtual {p0}, Lorg/apache/log4j/WriterAppender;->a()Z
/* if-nez v0, :cond_0 */
return;
/* .line 2 */
} // :cond_0
(( org.apache.log4j.WriterAppender ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/log4j/WriterAppender;->b(Lorg/apache/log4j/spi/LoggingEvent;)V
return;
} // .end method
public void b ( ) {
/* .locals 3 */
/* .line 1 */
v0 = this.j;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 2 */
try { // :try_start_0
(( java.io.FilterWriter ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/io/FilterWriter;->close()V
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
/* .line 3 */
/* instance-of v1, v0, Ljava/io/InterruptedIOException; */
if ( v1 != null) { // if-eqz v1, :cond_0
	 /* .line 4 */
	 java.lang.Thread .currentThread ( );
	 (( java.lang.Thread ) v1 ).interrupt ( ); // invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V
	 /* .line 5 */
} // :cond_0
/* new-instance v1, Ljava/lang/StringBuffer; */
/* invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V */
final String v2 = "Could not close "; // const-string v2, "Could not close "
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
v2 = this.j;
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .error ( v1,v0 );
} // :cond_1
} // :goto_0
return;
} // .end method
public void b ( org.apache.log4j.spi.LoggingEvent p0 ) {
/* .locals 5 */
/* .line 6 */
v0 = this.j;
v1 = this.a;
(( org.apache.log4j.Layout ) v1 ).format ( p1 ); // invoke-virtual {v1, p1}, Lorg/apache/log4j/Layout;->format(Lorg/apache/log4j/spi/LoggingEvent;)Ljava/lang/String;
(( org.apache.log4j.helpers.QuietWriter ) v0 ).write ( v1 ); // invoke-virtual {v0, v1}, Lorg/apache/log4j/helpers/QuietWriter;->write(Ljava/lang/String;)V
/* .line 7 */
v0 = this.a;
v0 = (( org.apache.log4j.Layout ) v0 ).ignoresThrowable ( ); // invoke-virtual {v0}, Lorg/apache/log4j/Layout;->ignoresThrowable()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 8 */
(( org.apache.log4j.spi.LoggingEvent ) p1 ).getThrowableStrRep ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getThrowableStrRep()[Ljava/lang/String;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 9 */
/* array-length v1, v0 */
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v2, v1, :cond_0 */
/* .line 10 */
v3 = this.j;
/* aget-object v4, v0, v2 */
(( org.apache.log4j.helpers.QuietWriter ) v3 ).write ( v4 ); // invoke-virtual {v3, v4}, Lorg/apache/log4j/helpers/QuietWriter;->write(Ljava/lang/String;)V
/* .line 11 */
v3 = this.j;
v4 = org.apache.log4j.Layout.LINE_SEP;
(( org.apache.log4j.helpers.QuietWriter ) v3 ).write ( v4 ); // invoke-virtual {v3, v4}, Lorg/apache/log4j/helpers/QuietWriter;->write(Ljava/lang/String;)V
/* add-int/lit8 v2, v2, 0x1 */
/* .line 12 */
} // :cond_0
p1 = (( org.apache.log4j.WriterAppender ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/log4j/WriterAppender;->a(Lorg/apache/log4j/spi/LoggingEvent;)Z
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 13 */
p1 = this.j;
(( org.apache.log4j.helpers.QuietWriter ) p1 ).flush ( ); // invoke-virtual {p1}, Lorg/apache/log4j/helpers/QuietWriter;->flush()V
} // :cond_1
return;
} // .end method
public void c ( ) {
/* .locals 1 */
/* .line 1 */
(( org.apache.log4j.WriterAppender ) p0 ).b ( ); // invoke-virtual {p0}, Lorg/apache/log4j/WriterAppender;->b()V
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
this.j = v0;
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
(( org.apache.log4j.WriterAppender ) p0 ).d ( ); // invoke-virtual {p0}, Lorg/apache/log4j/WriterAppender;->d()V
/* .line 5 */
(( org.apache.log4j.WriterAppender ) p0 ).c ( ); // invoke-virtual {p0}, Lorg/apache/log4j/WriterAppender;->c()V
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 6 */
/* monitor-exit p0 */
return;
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
public void d ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 2 */
	 (( org.apache.log4j.Layout ) v0 ).getFooter ( ); // invoke-virtual {v0}, Lorg/apache/log4j/Layout;->getFooter()Ljava/lang/String;
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 3 */
		 v1 = this.j;
		 if ( v1 != null) { // if-eqz v1, :cond_0
			 /* .line 4 */
			 (( org.apache.log4j.helpers.QuietWriter ) v1 ).write ( v0 ); // invoke-virtual {v1, v0}, Lorg/apache/log4j/helpers/QuietWriter;->write(Ljava/lang/String;)V
			 /* .line 5 */
			 v0 = this.j;
			 (( org.apache.log4j.helpers.QuietWriter ) v0 ).flush ( ); // invoke-virtual {v0}, Lorg/apache/log4j/helpers/QuietWriter;->flush()V
		 } // :cond_0
		 return;
	 } // .end method
	 public void e ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 v0 = this.a;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 2 */
			 (( org.apache.log4j.Layout ) v0 ).getHeader ( ); // invoke-virtual {v0}, Lorg/apache/log4j/Layout;->getHeader()Ljava/lang/String;
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 /* .line 3 */
				 v1 = this.j;
				 if ( v1 != null) { // if-eqz v1, :cond_0
					 /* .line 4 */
					 (( org.apache.log4j.helpers.QuietWriter ) v1 ).write ( v0 ); // invoke-virtual {v1, v0}, Lorg/apache/log4j/helpers/QuietWriter;->write(Ljava/lang/String;)V
				 } // :cond_0
				 return;
			 } // .end method
			 public java.lang.String getEncoding ( ) {
				 /* .locals 1 */
				 /* .line 1 */
				 v0 = this.i;
			 } // .end method
			 public Boolean getImmediateFlush ( ) {
				 /* .locals 1 */
				 /* .line 1 */
				 /* iget-boolean v0, p0, Lorg/apache/log4j/WriterAppender;->h:Z */
			 } // .end method
			 public Boolean requiresLayout ( ) {
				 /* .locals 1 */
				 int v0 = 1; // const/4 v0, 0x1
			 } // .end method
			 public void setEncoding ( java.lang.String p0 ) {
				 /* .locals 0 */
				 /* .line 1 */
				 this.i = p1;
				 return;
			 } // .end method
			 public synchronized void setErrorHandler ( org.apache.log4j.spi.ErrorHandler p0 ) {
				 /* .locals 1 */
				 /* monitor-enter p0 */
				 /* if-nez p1, :cond_0 */
				 try { // :try_start_0
					 final String p1 = "You have tried to set a null error-handler."; // const-string p1, "You have tried to set a null error-handler."
					 /* .line 1 */
					 org.apache.log4j.helpers.LogLog .warn ( p1 );
					 /* .line 2 */
				 } // :cond_0
				 this.d = p1;
				 /* .line 3 */
				 v0 = this.j;
				 if ( v0 != null) { // if-eqz v0, :cond_1
					 /* .line 4 */
					 v0 = this.j;
					 (( org.apache.log4j.helpers.QuietWriter ) v0 ).setErrorHandler ( p1 ); // invoke-virtual {v0, p1}, Lorg/apache/log4j/helpers/QuietWriter;->setErrorHandler(Lorg/apache/log4j/spi/ErrorHandler;)V
					 /* :try_end_0 */
					 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
					 /* .line 5 */
				 } // :cond_1
			 } // :goto_0
			 /* monitor-exit p0 */
			 return;
			 /* :catchall_0 */
			 /* move-exception p1 */
			 /* monitor-exit p0 */
			 /* throw p1 */
		 } // .end method
		 public void setImmediateFlush ( Boolean p0 ) {
			 /* .locals 0 */
			 /* .line 1 */
			 /* iput-boolean p1, p0, Lorg/apache/log4j/WriterAppender;->h:Z */
			 return;
		 } // .end method
		 public synchronized void setWriter ( java.io.Writer p0 ) {
			 /* .locals 2 */
			 /* monitor-enter p0 */
			 /* .line 1 */
			 try { // :try_start_0
				 (( org.apache.log4j.WriterAppender ) p0 ).c ( ); // invoke-virtual {p0}, Lorg/apache/log4j/WriterAppender;->c()V
				 /* .line 2 */
				 /* new-instance v0, Lorg/apache/log4j/helpers/QuietWriter; */
				 v1 = this.d;
				 /* invoke-direct {v0, p1, v1}, Lorg/apache/log4j/helpers/QuietWriter;-><init>(Ljava/io/Writer;Lorg/apache/log4j/spi/ErrorHandler;)V */
				 this.j = v0;
				 /* .line 3 */
				 (( org.apache.log4j.WriterAppender ) p0 ).e ( ); // invoke-virtual {p0}, Lorg/apache/log4j/WriterAppender;->e()V
				 /* :try_end_0 */
				 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
				 /* .line 4 */
				 /* monitor-exit p0 */
				 return;
				 /* :catchall_0 */
				 /* move-exception p1 */
				 /* monitor-exit p0 */
				 /* throw p1 */
			 } // .end method
