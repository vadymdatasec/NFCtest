public class org.apache.log4j.FileAppender extends org.apache.log4j.WriterAppender {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public Boolean k;
	 public java.lang.String l;
	 public Boolean m;
	 public Integer n;
	 /* # direct methods */
	 public org.apache.log4j.FileAppender ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Lorg/apache/log4j/WriterAppender;-><init>()V */
		 int v0 = 1; // const/4 v0, 0x1
		 /* .line 2 */
		 /* iput-boolean v0, p0, Lorg/apache/log4j/FileAppender;->k:Z */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 3 */
		 this.l = v0;
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 4 */
		 /* iput-boolean v0, p0, Lorg/apache/log4j/FileAppender;->m:Z */
		 /* const/16 v0, 0x2000 */
		 /* .line 5 */
		 /* iput v0, p0, Lorg/apache/log4j/FileAppender;->n:I */
		 return;
	 } // .end method
	 public org.apache.log4j.FileAppender ( ) {
		 /* .locals 1 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Ljava/io/IOException; */
		 /* } */
	 } // .end annotation
	 int v0 = 1; // const/4 v0, 0x1
	 /* .line 20 */
	 /* invoke-direct {p0, p1, p2, v0}, Lorg/apache/log4j/FileAppender;-><init>(Lorg/apache/log4j/Layout;Ljava/lang/String;Z)V */
	 return;
} // .end method
public org.apache.log4j.FileAppender ( ) {
	 /* .locals 2 */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Ljava/io/IOException; */
	 /* } */
} // .end annotation
/* .line 13 */
/* invoke-direct {p0}, Lorg/apache/log4j/WriterAppender;-><init>()V */
int v0 = 1; // const/4 v0, 0x1
/* .line 14 */
/* iput-boolean v0, p0, Lorg/apache/log4j/FileAppender;->k:Z */
int v0 = 0; // const/4 v0, 0x0
/* .line 15 */
this.l = v0;
int v0 = 0; // const/4 v0, 0x0
/* .line 16 */
/* iput-boolean v0, p0, Lorg/apache/log4j/FileAppender;->m:Z */
/* const/16 v1, 0x2000 */
/* .line 17 */
/* iput v1, p0, Lorg/apache/log4j/FileAppender;->n:I */
/* .line 18 */
this.a = p1;
/* .line 19 */
(( org.apache.log4j.FileAppender ) p0 ).setFile ( p2, p3, v0, v1 ); // invoke-virtual {p0, p2, p3, v0, v1}, Lorg/apache/log4j/FileAppender;->setFile(Ljava/lang/String;ZZI)V
return;
} // .end method
public org.apache.log4j.FileAppender ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 6 */
/* invoke-direct {p0}, Lorg/apache/log4j/WriterAppender;-><init>()V */
int v0 = 1; // const/4 v0, 0x1
/* .line 7 */
/* iput-boolean v0, p0, Lorg/apache/log4j/FileAppender;->k:Z */
int v0 = 0; // const/4 v0, 0x0
/* .line 8 */
this.l = v0;
int v0 = 0; // const/4 v0, 0x0
/* .line 9 */
/* iput-boolean v0, p0, Lorg/apache/log4j/FileAppender;->m:Z */
/* const/16 v0, 0x2000 */
/* .line 10 */
/* iput v0, p0, Lorg/apache/log4j/FileAppender;->n:I */
/* .line 11 */
this.a = p1;
/* .line 12 */
(( org.apache.log4j.FileAppender ) p0 ).setFile ( p2, p3, p4, p5 ); // invoke-virtual {p0, p2, p3, p4, p5}, Lorg/apache/log4j/FileAppender;->setFile(Ljava/lang/String;ZZI)V
return;
} // .end method
/* # virtual methods */
public void a ( java.io.Writer p0 ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Lorg/apache/log4j/helpers/QuietWriter; */
v1 = this.d;
/* invoke-direct {v0, p1, v1}, Lorg/apache/log4j/helpers/QuietWriter;-><init>(Ljava/io/Writer;Lorg/apache/log4j/spi/ErrorHandler;)V */
this.j = v0;
return;
} // .end method
public void activateOptions ( ) {
/* .locals 4 */
/* .line 1 */
v0 = this.l;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
try { // :try_start_0
	 /* iget-boolean v1, p0, Lorg/apache/log4j/FileAppender;->k:Z */
	 /* iget-boolean v2, p0, Lorg/apache/log4j/FileAppender;->m:Z */
	 /* iget v3, p0, Lorg/apache/log4j/FileAppender;->n:I */
	 (( org.apache.log4j.FileAppender ) p0 ).setFile ( v0, v1, v2, v3 ); // invoke-virtual {p0, v0, v1, v2, v3}, Lorg/apache/log4j/FileAppender;->setFile(Ljava/lang/String;ZZI)V
	 /* :try_end_0 */
	 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* :catch_0 */
	 /* move-exception v0 */
	 /* .line 3 */
	 v1 = this.d;
	 /* new-instance v2, Ljava/lang/StringBuffer; */
	 /* invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V */
	 final String v3 = "setFile("; // const-string v3, "setFile("
	 (( java.lang.StringBuffer ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 v3 = this.l;
	 (( java.lang.StringBuffer ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 final String v3 = ","; // const-string v3, ","
	 (( java.lang.StringBuffer ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 /* iget-boolean v3, p0, Lorg/apache/log4j/FileAppender;->k:Z */
	 (( java.lang.StringBuffer ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Z)Ljava/lang/StringBuffer;
	 final String v3 = ") call failed."; // const-string v3, ") call failed."
	 (( java.lang.StringBuffer ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 (( java.lang.StringBuffer ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
	 int v3 = 4; // const/4 v3, 0x4
	 /* .line 4 */
} // :cond_0
/* new-instance v0, Ljava/lang/StringBuffer; */
/* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
final String v1 = "File option not set for appender ["; // const-string v1, "File option not set for appender ["
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
v1 = this.b;
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v1 = "]."; // const-string v1, "]."
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .warn ( v0 );
final String v0 = "Are you using FileAppender instead of ConsoleAppender?"; // const-string v0, "Are you using FileAppender instead of ConsoleAppender?"
/* .line 5 */
org.apache.log4j.helpers.LogLog .warn ( v0 );
} // :goto_0
return;
} // .end method
public void c ( ) {
/* .locals 1 */
/* .line 1 */
(( org.apache.log4j.FileAppender ) p0 ).f ( ); // invoke-virtual {p0}, Lorg/apache/log4j/FileAppender;->f()V
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
this.l = v0;
/* .line 3 */
/* invoke-super {p0}, Lorg/apache/log4j/WriterAppender;->c()V */
return;
} // .end method
public void f ( ) {
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
public Boolean getAppend ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Lorg/apache/log4j/FileAppender;->k:Z */
} // .end method
public Integer getBufferSize ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Lorg/apache/log4j/FileAppender;->n:I */
} // .end method
public Boolean getBufferedIO ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Lorg/apache/log4j/FileAppender;->m:Z */
} // .end method
public java.lang.String getFile ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.l;
} // .end method
public void setAppend ( Boolean p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput-boolean p1, p0, Lorg/apache/log4j/FileAppender;->k:Z */
return;
} // .end method
public void setBufferSize ( Integer p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput p1, p0, Lorg/apache/log4j/FileAppender;->n:I */
return;
} // .end method
public void setBufferedIO ( Boolean p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput-boolean p1, p0, Lorg/apache/log4j/FileAppender;->m:Z */
if ( p1 != null) { // if-eqz p1, :cond_0
int p1 = 0; // const/4 p1, 0x0
/* .line 2 */
/* iput-boolean p1, p0, Lorg/apache/log4j/WriterAppender;->h:Z */
} // :cond_0
return;
} // .end method
public void setFile ( java.lang.String p0 ) {
/* .locals 0 */
/* .line 1 */
(( java.lang.String ) p1 ).trim ( ); // invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;
/* .line 2 */
this.l = p1;
return;
} // .end method
public synchronized void setFile ( java.lang.String p0, Boolean p1, Boolean p2, Integer p3 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* monitor-enter p0 */
/* .line 3 */
try { // :try_start_0
/* new-instance v0, Ljava/lang/StringBuffer; */
/* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
final String v1 = "setFile called: "; // const-string v1, "setFile called: "
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v1 = ", "; // const-string v1, ", "
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuffer;->append(Z)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .debug ( v0 );
if ( p3 != null) { // if-eqz p3, :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 4 */
(( org.apache.log4j.WriterAppender ) p0 ).setImmediateFlush ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/log4j/WriterAppender;->setImmediateFlush(Z)V
/* .line 5 */
} // :cond_0
(( org.apache.log4j.FileAppender ) p0 ).c ( ); // invoke-virtual {p0}, Lorg/apache/log4j/FileAppender;->c()V
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 6 */
try { // :try_start_1
/* new-instance v0, Ljava/io/FileOutputStream; */
/* invoke-direct {v0, p1, p2}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;Z)V */
/* :try_end_1 */
/* .catch Ljava/io/FileNotFoundException; {:try_start_1 ..:try_end_1} :catch_0 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* :catch_0 */
/* move-exception v0 */
/* .line 7 */
try { // :try_start_2
	 /* new-instance v1, Ljava/io/File; */
	 /* invoke-direct {v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
	 (( java.io.File ) v1 ).getParent ( ); // invoke-virtual {v1}, Ljava/io/File;->getParent()Ljava/lang/String;
	 if ( v1 != null) { // if-eqz v1, :cond_3
		 /* .line 8 */
		 /* new-instance v2, Ljava/io/File; */
		 /* invoke-direct {v2, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
		 /* .line 9 */
		 v1 = 		 (( java.io.File ) v2 ).exists ( ); // invoke-virtual {v2}, Ljava/io/File;->exists()Z
		 /* if-nez v1, :cond_2 */
		 v1 = 		 (( java.io.File ) v2 ).mkdirs ( ); // invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z
		 if ( v1 != null) { // if-eqz v1, :cond_2
			 /* .line 10 */
			 /* new-instance v0, Ljava/io/FileOutputStream; */
			 /* invoke-direct {v0, p1, p2}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;Z)V */
			 /* .line 11 */
		 } // :goto_0
		 (( org.apache.log4j.WriterAppender ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/log4j/WriterAppender;->a(Ljava/io/OutputStream;)Ljava/io/OutputStreamWriter;
		 if ( p3 != null) { // if-eqz p3, :cond_1
			 /* .line 12 */
			 /* new-instance v1, Ljava/io/BufferedWriter; */
			 /* invoke-direct {v1, v0, p4}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;I)V */
			 /* move-object v0, v1 */
			 /* .line 13 */
		 } // :cond_1
		 (( org.apache.log4j.FileAppender ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/log4j/FileAppender;->a(Ljava/io/Writer;)V
		 /* .line 14 */
		 this.l = p1;
		 /* .line 15 */
		 /* iput-boolean p2, p0, Lorg/apache/log4j/FileAppender;->k:Z */
		 /* .line 16 */
		 /* iput-boolean p3, p0, Lorg/apache/log4j/FileAppender;->m:Z */
		 /* .line 17 */
		 /* iput p4, p0, Lorg/apache/log4j/FileAppender;->n:I */
		 /* .line 18 */
		 (( org.apache.log4j.WriterAppender ) p0 ).e ( ); // invoke-virtual {p0}, Lorg/apache/log4j/WriterAppender;->e()V
		 final String p1 = "setFile ended"; // const-string p1, "setFile ended"
		 /* .line 19 */
		 org.apache.log4j.helpers.LogLog .debug ( p1 );
		 /* :try_end_2 */
		 /* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
		 /* .line 20 */
		 /* monitor-exit p0 */
		 return;
		 /* .line 21 */
	 } // :cond_2
	 try { // :try_start_3
		 /* throw v0 */
		 /* .line 22 */
	 } // :cond_3
	 /* throw v0 */
	 /* :try_end_3 */
	 /* .catchall {:try_start_3 ..:try_end_3} :catchall_0 */
	 /* :catchall_0 */
	 /* move-exception p1 */
	 /* monitor-exit p0 */
	 /* throw p1 */
} // .end method
