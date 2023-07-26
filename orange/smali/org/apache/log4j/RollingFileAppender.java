public class org.apache.log4j.RollingFileAppender extends org.apache.log4j.FileAppender {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public Long o;
	 public Integer p;
	 public Long q;
	 /* # direct methods */
	 public org.apache.log4j.RollingFileAppender ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Lorg/apache/log4j/FileAppender;-><init>()V */
		 /* const-wide/32 v0, 0xa00000 */
		 /* .line 2 */
		 /* iput-wide v0, p0, Lorg/apache/log4j/RollingFileAppender;->o:J */
		 int v0 = 1; // const/4 v0, 0x1
		 /* .line 3 */
		 /* iput v0, p0, Lorg/apache/log4j/RollingFileAppender;->p:I */
		 /* const-wide/16 v0, 0x0 */
		 /* .line 4 */
		 /* iput-wide v0, p0, Lorg/apache/log4j/RollingFileAppender;->q:J */
		 return;
	 } // .end method
	 public org.apache.log4j.RollingFileAppender ( ) {
		 /* .locals 0 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Ljava/io/IOException; */
		 /* } */
	 } // .end annotation
	 /* .line 9 */
	 /* invoke-direct {p0, p1, p2}, Lorg/apache/log4j/FileAppender;-><init>(Lorg/apache/log4j/Layout;Ljava/lang/String;)V */
	 /* const-wide/32 p1, 0xa00000 */
	 /* .line 10 */
	 /* iput-wide p1, p0, Lorg/apache/log4j/RollingFileAppender;->o:J */
	 int p1 = 1; // const/4 p1, 0x1
	 /* .line 11 */
	 /* iput p1, p0, Lorg/apache/log4j/RollingFileAppender;->p:I */
	 /* const-wide/16 p1, 0x0 */
	 /* .line 12 */
	 /* iput-wide p1, p0, Lorg/apache/log4j/RollingFileAppender;->q:J */
	 return;
} // .end method
public org.apache.log4j.RollingFileAppender ( ) {
	 /* .locals 0 */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Ljava/io/IOException; */
	 /* } */
} // .end annotation
/* .line 5 */
/* invoke-direct {p0, p1, p2, p3}, Lorg/apache/log4j/FileAppender;-><init>(Lorg/apache/log4j/Layout;Ljava/lang/String;Z)V */
/* const-wide/32 p1, 0xa00000 */
/* .line 6 */
/* iput-wide p1, p0, Lorg/apache/log4j/RollingFileAppender;->o:J */
int p1 = 1; // const/4 p1, 0x1
/* .line 7 */
/* iput p1, p0, Lorg/apache/log4j/RollingFileAppender;->p:I */
/* const-wide/16 p1, 0x0 */
/* .line 8 */
/* iput-wide p1, p0, Lorg/apache/log4j/RollingFileAppender;->q:J */
return;
} // .end method
/* # virtual methods */
public void a ( java.io.Writer p0 ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Lorg/apache/log4j/helpers/CountingQuietWriter; */
v1 = this.d;
/* invoke-direct {v0, p1, v1}, Lorg/apache/log4j/helpers/CountingQuietWriter;-><init>(Ljava/io/Writer;Lorg/apache/log4j/spi/ErrorHandler;)V */
this.j = v0;
return;
} // .end method
public void b ( org.apache.log4j.spi.LoggingEvent p0 ) {
/* .locals 4 */
/* .line 1 */
/* invoke-super {p0, p1}, Lorg/apache/log4j/WriterAppender;->b(Lorg/apache/log4j/spi/LoggingEvent;)V */
/* .line 2 */
p1 = this.l;
if ( p1 != null) { // if-eqz p1, :cond_0
	 p1 = this.j;
	 if ( p1 != null) { // if-eqz p1, :cond_0
		 /* .line 3 */
		 /* check-cast p1, Lorg/apache/log4j/helpers/CountingQuietWriter; */
		 (( org.apache.log4j.helpers.CountingQuietWriter ) p1 ).getCount ( ); // invoke-virtual {p1}, Lorg/apache/log4j/helpers/CountingQuietWriter;->getCount()J
		 /* move-result-wide v0 */
		 /* .line 4 */
		 /* iget-wide v2, p0, Lorg/apache/log4j/RollingFileAppender;->o:J */
		 /* cmp-long p1, v0, v2 */
		 /* if-ltz p1, :cond_0 */
		 /* iget-wide v2, p0, Lorg/apache/log4j/RollingFileAppender;->q:J */
		 /* cmp-long p1, v0, v2 */
		 /* if-ltz p1, :cond_0 */
		 /* .line 5 */
		 (( org.apache.log4j.RollingFileAppender ) p0 ).rollOver ( ); // invoke-virtual {p0}, Lorg/apache/log4j/RollingFileAppender;->rollOver()V
	 } // :cond_0
	 return;
} // .end method
public Integer getMaxBackupIndex ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 /* iget v0, p0, Lorg/apache/log4j/RollingFileAppender;->p:I */
} // .end method
public Long getMaximumFileSize ( ) {
	 /* .locals 2 */
	 /* .line 1 */
	 /* iget-wide v0, p0, Lorg/apache/log4j/RollingFileAppender;->o:J */
	 /* return-wide v0 */
} // .end method
public void rollOver ( ) {
	 /* .locals 11 */
	 /* .line 1 */
	 v0 = this.j;
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 2 */
		 /* check-cast v0, Lorg/apache/log4j/helpers/CountingQuietWriter; */
		 (( org.apache.log4j.helpers.CountingQuietWriter ) v0 ).getCount ( ); // invoke-virtual {v0}, Lorg/apache/log4j/helpers/CountingQuietWriter;->getCount()J
		 /* move-result-wide v0 */
		 /* .line 3 */
		 /* new-instance v2, Ljava/lang/StringBuffer; */
		 /* invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V */
		 final String v3 = "rolling over count="; // const-string v3, "rolling over count="
		 (( java.lang.StringBuffer ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 (( java.lang.StringBuffer ) v2 ).append ( v0, v1 ); // invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;
		 (( java.lang.StringBuffer ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
		 org.apache.log4j.helpers.LogLog .debug ( v2 );
		 /* .line 4 */
		 /* iget-wide v2, p0, Lorg/apache/log4j/RollingFileAppender;->o:J */
		 /* add-long/2addr v0, v2 */
		 /* iput-wide v0, p0, Lorg/apache/log4j/RollingFileAppender;->q:J */
		 /* .line 5 */
	 } // :cond_0
	 /* new-instance v0, Ljava/lang/StringBuffer; */
	 /* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
	 final String v1 = "maxBackupIndex="; // const-string v1, "maxBackupIndex="
	 (( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 /* iget v1, p0, Lorg/apache/log4j/RollingFileAppender;->p:I */
	 (( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;
	 (( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
	 org.apache.log4j.helpers.LogLog .debug ( v0 );
	 /* .line 6 */
	 /* iget v0, p0, Lorg/apache/log4j/RollingFileAppender;->p:I */
	 final String v1 = "setFile("; // const-string v1, "setFile("
	 int v2 = 1; // const/4 v2, 0x1
	 /* if-lez v0, :cond_6 */
	 /* .line 7 */
	 /* new-instance v0, Ljava/io/File; */
	 /* new-instance v3, Ljava/lang/StringBuffer; */
	 /* invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V */
	 v4 = this.l;
	 (( java.lang.StringBuffer ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 /* const/16 v4, 0x2e */
	 (( java.lang.StringBuffer ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
	 /* iget v5, p0, Lorg/apache/log4j/RollingFileAppender;->p:I */
	 (( java.lang.StringBuffer ) v3 ).append ( v5 ); // invoke-virtual {v3, v5}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;
	 (( java.lang.StringBuffer ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
	 /* invoke-direct {v0, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
	 /* .line 8 */
	 v3 = 	 (( java.io.File ) v0 ).exists ( ); // invoke-virtual {v0}, Ljava/io/File;->exists()Z
	 if ( v3 != null) { // if-eqz v3, :cond_1
		 /* .line 9 */
		 v0 = 		 (( java.io.File ) v0 ).delete ( ); // invoke-virtual {v0}, Ljava/io/File;->delete()Z
	 } // :cond_1
	 int v0 = 1; // const/4 v0, 0x1
	 /* .line 10 */
} // :goto_0
/* iget v3, p0, Lorg/apache/log4j/RollingFileAppender;->p:I */
/* sub-int/2addr v3, v2 */
} // :goto_1
final String v5 = " to "; // const-string v5, " to "
final String v6 = "Renaming file "; // const-string v6, "Renaming file "
final String v7 = "."; // const-string v7, "."
/* if-lt v3, v2, :cond_3 */
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 11 */
/* new-instance v8, Ljava/io/File; */
/* new-instance v9, Ljava/lang/StringBuffer; */
/* invoke-direct {v9}, Ljava/lang/StringBuffer;-><init>()V */
v10 = this.l;
(( java.lang.StringBuffer ) v9 ).append ( v10 ); // invoke-virtual {v9, v10}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v9 ).append ( v7 ); // invoke-virtual {v9, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v9 ).append ( v3 ); // invoke-virtual {v9, v3}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v9 ).toString ( ); // invoke-virtual {v9}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
/* invoke-direct {v8, v7}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
/* .line 12 */
v7 = (( java.io.File ) v8 ).exists ( ); // invoke-virtual {v8}, Ljava/io/File;->exists()Z
if ( v7 != null) { // if-eqz v7, :cond_2
	 /* .line 13 */
	 /* new-instance v0, Ljava/io/File; */
	 /* new-instance v7, Ljava/lang/StringBuffer; */
	 /* invoke-direct {v7}, Ljava/lang/StringBuffer;-><init>()V */
	 v9 = this.l;
	 (( java.lang.StringBuffer ) v7 ).append ( v9 ); // invoke-virtual {v7, v9}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 (( java.lang.StringBuffer ) v7 ).append ( v4 ); // invoke-virtual {v7, v4}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
	 /* add-int/lit8 v9, v3, 0x1 */
	 (( java.lang.StringBuffer ) v7 ).append ( v9 ); // invoke-virtual {v7, v9}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;
	 (( java.lang.StringBuffer ) v7 ).toString ( ); // invoke-virtual {v7}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
	 /* invoke-direct {v0, v7}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
	 /* .line 14 */
	 /* new-instance v7, Ljava/lang/StringBuffer; */
	 /* invoke-direct {v7}, Ljava/lang/StringBuffer;-><init>()V */
	 (( java.lang.StringBuffer ) v7 ).append ( v6 ); // invoke-virtual {v7, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 (( java.lang.StringBuffer ) v7 ).append ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;
	 (( java.lang.StringBuffer ) v7 ).append ( v5 ); // invoke-virtual {v7, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 (( java.lang.StringBuffer ) v7 ).append ( v0 ); // invoke-virtual {v7, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;
	 (( java.lang.StringBuffer ) v7 ).toString ( ); // invoke-virtual {v7}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
	 org.apache.log4j.helpers.LogLog .debug ( v5 );
	 /* .line 15 */
	 v0 = 	 (( java.io.File ) v8 ).renameTo ( v0 ); // invoke-virtual {v8, v0}, Ljava/io/File;->renameTo(Ljava/io/File;)Z
} // :cond_2
/* add-int/lit8 v3, v3, -0x1 */
} // :cond_3
if ( v0 != null) { // if-eqz v0, :cond_5
/* .line 16 */
/* new-instance v0, Ljava/io/File; */
/* new-instance v3, Ljava/lang/StringBuffer; */
/* invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V */
v4 = this.l;
(( java.lang.StringBuffer ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v3 ).append ( v7 ); // invoke-virtual {v3, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v3 ).append ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
/* invoke-direct {v0, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
/* .line 17 */
(( org.apache.log4j.FileAppender ) p0 ).f ( ); // invoke-virtual {p0}, Lorg/apache/log4j/FileAppender;->f()V
/* .line 18 */
/* new-instance v3, Ljava/io/File; */
v4 = this.l;
/* invoke-direct {v3, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
/* .line 19 */
/* new-instance v4, Ljava/lang/StringBuffer; */
/* invoke-direct {v4}, Ljava/lang/StringBuffer;-><init>()V */
(( java.lang.StringBuffer ) v4 ).append ( v6 ); // invoke-virtual {v4, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v4 ).append ( v3 ); // invoke-virtual {v4, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v4 ).append ( v0 ); // invoke-virtual {v4, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .debug ( v4 );
/* .line 20 */
v0 = (( java.io.File ) v3 ).renameTo ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/File;->renameTo(Ljava/io/File;)Z
/* if-nez v0, :cond_5 */
/* .line 21 */
try { // :try_start_0
	 v3 = this.l;
	 /* iget-boolean v4, p0, Lorg/apache/log4j/FileAppender;->m:Z */
	 /* iget v5, p0, Lorg/apache/log4j/FileAppender;->n:I */
	 (( org.apache.log4j.RollingFileAppender ) p0 ).setFile ( v3, v2, v4, v5 ); // invoke-virtual {p0, v3, v2, v4, v5}, Lorg/apache/log4j/RollingFileAppender;->setFile(Ljava/lang/String;ZZI)V
	 /* :try_end_0 */
	 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* :catch_0 */
	 /* move-exception v2 */
	 /* .line 22 */
	 /* instance-of v3, v2, Ljava/io/InterruptedIOException; */
	 if ( v3 != null) { // if-eqz v3, :cond_4
		 /* .line 23 */
		 java.lang.Thread .currentThread ( );
		 (( java.lang.Thread ) v3 ).interrupt ( ); // invoke-virtual {v3}, Ljava/lang/Thread;->interrupt()V
		 /* .line 24 */
	 } // :cond_4
	 /* new-instance v3, Ljava/lang/StringBuffer; */
	 /* invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V */
	 (( java.lang.StringBuffer ) v3 ).append ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 v4 = this.l;
	 (( java.lang.StringBuffer ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 final String v4 = ", true) call failed."; // const-string v4, ", true) call failed."
	 (( java.lang.StringBuffer ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 (( java.lang.StringBuffer ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
	 org.apache.log4j.helpers.LogLog .error ( v3,v2 );
} // :cond_5
} // :goto_2
/* move v2, v0 */
} // :cond_6
if ( v2 != null) { // if-eqz v2, :cond_8
/* .line 25 */
try { // :try_start_1
v0 = this.l;
int v2 = 0; // const/4 v2, 0x0
/* iget-boolean v3, p0, Lorg/apache/log4j/FileAppender;->m:Z */
/* iget v4, p0, Lorg/apache/log4j/FileAppender;->n:I */
(( org.apache.log4j.RollingFileAppender ) p0 ).setFile ( v0, v2, v3, v4 ); // invoke-virtual {p0, v0, v2, v3, v4}, Lorg/apache/log4j/RollingFileAppender;->setFile(Ljava/lang/String;ZZI)V
/* const-wide/16 v2, 0x0 */
/* .line 26 */
/* iput-wide v2, p0, Lorg/apache/log4j/RollingFileAppender;->q:J */
/* :try_end_1 */
/* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_1 */
/* :catch_1 */
/* move-exception v0 */
/* .line 27 */
/* instance-of v2, v0, Ljava/io/InterruptedIOException; */
if ( v2 != null) { // if-eqz v2, :cond_7
	 /* .line 28 */
	 java.lang.Thread .currentThread ( );
	 (( java.lang.Thread ) v2 ).interrupt ( ); // invoke-virtual {v2}, Ljava/lang/Thread;->interrupt()V
	 /* .line 29 */
} // :cond_7
/* new-instance v2, Ljava/lang/StringBuffer; */
/* invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V */
(( java.lang.StringBuffer ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
v1 = this.l;
(( java.lang.StringBuffer ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v1 = ", false) call failed."; // const-string v1, ", false) call failed."
(( java.lang.StringBuffer ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .error ( v1,v0 );
} // :cond_8
} // :goto_3
return;
} // .end method
public synchronized void setFile ( java.lang.String p0, Boolean p1, Boolean p2, Integer p3 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* monitor-enter p0 */
/* .line 1 */
try { // :try_start_0
/* iget-boolean p3, p0, Lorg/apache/log4j/FileAppender;->m:Z */
/* iget p4, p0, Lorg/apache/log4j/FileAppender;->n:I */
/* invoke-super {p0, p1, p2, p3, p4}, Lorg/apache/log4j/FileAppender;->setFile(Ljava/lang/String;ZZI)V */
if ( p2 != null) { // if-eqz p2, :cond_0
/* .line 2 */
/* new-instance p2, Ljava/io/File; */
/* invoke-direct {p2, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
/* .line 3 */
p1 = this.j;
/* check-cast p1, Lorg/apache/log4j/helpers/CountingQuietWriter; */
(( java.io.File ) p2 ).length ( ); // invoke-virtual {p2}, Ljava/io/File;->length()J
/* move-result-wide p2 */
(( org.apache.log4j.helpers.CountingQuietWriter ) p1 ).setCount ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Lorg/apache/log4j/helpers/CountingQuietWriter;->setCount(J)V
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 4 */
} // :cond_0
/* monitor-exit p0 */
return;
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit p0 */
/* throw p1 */
} // .end method
public void setMaxBackupIndex ( Integer p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput p1, p0, Lorg/apache/log4j/RollingFileAppender;->p:I */
return;
} // .end method
public void setMaxFileSize ( java.lang.String p0 ) {
/* .locals 4 */
/* .line 1 */
/* iget-wide v0, p0, Lorg/apache/log4j/RollingFileAppender;->o:J */
/* const-wide/16 v2, 0x1 */
/* add-long/2addr v0, v2 */
org.apache.log4j.helpers.OptionConverter .toFileSize ( p1,v0,v1 );
/* move-result-wide v0 */
/* iput-wide v0, p0, Lorg/apache/log4j/RollingFileAppender;->o:J */
return;
} // .end method
public void setMaximumFileSize ( Long p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput-wide p1, p0, Lorg/apache/log4j/RollingFileAppender;->o:J */
return;
} // .end method
