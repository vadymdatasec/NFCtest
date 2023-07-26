public class org.apache.log4j.DailyRollingFileAppender extends org.apache.log4j.FileAppender {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final java.util.TimeZone u;
	 /* # instance fields */
	 public java.lang.String o;
	 public java.lang.String p;
	 public Long q;
	 public java.util.Date r;
	 public java.text.SimpleDateFormat s;
	 public m.a.b.f t;
	 /* # direct methods */
	 public static org.apache.log4j.DailyRollingFileAppender ( ) {
		 /* .locals 1 */
		 final String v0 = "GMT"; // const-string v0, "GMT"
		 /* .line 1 */
		 java.util.TimeZone .getTimeZone ( v0 );
		 return;
	 } // .end method
	 public org.apache.log4j.DailyRollingFileAppender ( ) {
		 /* .locals 4 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Lorg/apache/log4j/FileAppender;-><init>()V */
		 final String v0 = "\'.\'yyyy-MM-dd"; // const-string v0, "\'.\'yyyy-MM-dd"
		 /* .line 2 */
		 this.o = v0;
		 /* .line 3 */
		 java.lang.System .currentTimeMillis ( );
		 /* move-result-wide v0 */
		 /* const-wide/16 v2, 0x1 */
		 /* sub-long/2addr v0, v2 */
		 /* iput-wide v0, p0, Lorg/apache/log4j/DailyRollingFileAppender;->q:J */
		 /* .line 4 */
		 /* new-instance v0, Ljava/util/Date; */
		 /* invoke-direct {v0}, Ljava/util/Date;-><init>()V */
		 this.r = v0;
		 /* .line 5 */
		 /* new-instance v0, Lm/a/b/f; */
		 /* invoke-direct {v0}, Lm/a/b/f;-><init>()V */
		 this.t = v0;
		 return;
	 } // .end method
	 public org.apache.log4j.DailyRollingFileAppender ( ) {
		 /* .locals 2 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Ljava/io/IOException; */
		 /* } */
	 } // .end annotation
	 int v0 = 1; // const/4 v0, 0x1
	 /* .line 6 */
	 /* invoke-direct {p0, p1, p2, v0}, Lorg/apache/log4j/FileAppender;-><init>(Lorg/apache/log4j/Layout;Ljava/lang/String;Z)V */
	 final String p1 = "\'.\'yyyy-MM-dd"; // const-string p1, "\'.\'yyyy-MM-dd"
	 /* .line 7 */
	 this.o = p1;
	 /* .line 8 */
	 java.lang.System .currentTimeMillis ( );
	 /* move-result-wide p1 */
	 /* const-wide/16 v0, 0x1 */
	 /* sub-long/2addr p1, v0 */
	 /* iput-wide p1, p0, Lorg/apache/log4j/DailyRollingFileAppender;->q:J */
	 /* .line 9 */
	 /* new-instance p1, Ljava/util/Date; */
	 /* invoke-direct {p1}, Ljava/util/Date;-><init>()V */
	 this.r = p1;
	 /* .line 10 */
	 /* new-instance p1, Lm/a/b/f; */
	 /* invoke-direct {p1}, Lm/a/b/f;-><init>()V */
	 this.t = p1;
	 /* .line 11 */
	 this.o = p3;
	 /* .line 12 */
	 (( org.apache.log4j.DailyRollingFileAppender ) p0 ).activateOptions ( ); // invoke-virtual {p0}, Lorg/apache/log4j/DailyRollingFileAppender;->activateOptions()V
	 return;
} // .end method
/* # virtual methods */
public void a ( Integer p0 ) {
	 /* .locals 2 */
	 final String v0 = "Appender ["; // const-string v0, "Appender ["
	 if ( p1 != null) { // if-eqz p1, :cond_5
		 int v1 = 1; // const/4 v1, 0x1
		 /* if-eq p1, v1, :cond_4 */
		 int v1 = 2; // const/4 v1, 0x2
		 /* if-eq p1, v1, :cond_3 */
		 int v1 = 3; // const/4 v1, 0x3
		 /* if-eq p1, v1, :cond_2 */
		 int v1 = 4; // const/4 v1, 0x4
		 /* if-eq p1, v1, :cond_1 */
		 int v1 = 5; // const/4 v1, 0x5
		 /* if-eq p1, v1, :cond_0 */
		 /* .line 1 */
		 /* new-instance p1, Ljava/lang/StringBuffer; */
		 /* invoke-direct {p1}, Ljava/lang/StringBuffer;-><init>()V */
		 final String v0 = "Unknown periodicity for appender ["; // const-string v0, "Unknown periodicity for appender ["
		 (( java.lang.StringBuffer ) p1 ).append ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 v0 = this.b;
		 (( java.lang.StringBuffer ) p1 ).append ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 final String v0 = "]."; // const-string v0, "]."
		 (( java.lang.StringBuffer ) p1 ).append ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 (( java.lang.StringBuffer ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
		 org.apache.log4j.helpers.LogLog .warn ( p1 );
		 /* goto/16 :goto_0 */
		 /* .line 2 */
	 } // :cond_0
	 /* new-instance p1, Ljava/lang/StringBuffer; */
	 /* invoke-direct {p1}, Ljava/lang/StringBuffer;-><init>()V */
	 (( java.lang.StringBuffer ) p1 ).append ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 v0 = this.b;
	 (( java.lang.StringBuffer ) p1 ).append ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 final String v0 = "] to be rolled at start of every month."; // const-string v0, "] to be rolled at start of every month."
	 (( java.lang.StringBuffer ) p1 ).append ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 (( java.lang.StringBuffer ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
	 org.apache.log4j.helpers.LogLog .debug ( p1 );
	 /* goto/16 :goto_0 */
	 /* .line 3 */
} // :cond_1
/* new-instance p1, Ljava/lang/StringBuffer; */
/* invoke-direct {p1}, Ljava/lang/StringBuffer;-><init>()V */
(( java.lang.StringBuffer ) p1 ).append ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
v0 = this.b;
(( java.lang.StringBuffer ) p1 ).append ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v0 = "] to be rolled at start of week."; // const-string v0, "] to be rolled at start of week."
(( java.lang.StringBuffer ) p1 ).append ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .debug ( p1 );
/* .line 4 */
} // :cond_2
/* new-instance p1, Ljava/lang/StringBuffer; */
/* invoke-direct {p1}, Ljava/lang/StringBuffer;-><init>()V */
(( java.lang.StringBuffer ) p1 ).append ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
v0 = this.b;
(( java.lang.StringBuffer ) p1 ).append ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v0 = "] to be rolled at midnight."; // const-string v0, "] to be rolled at midnight."
(( java.lang.StringBuffer ) p1 ).append ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .debug ( p1 );
/* .line 5 */
} // :cond_3
/* new-instance p1, Ljava/lang/StringBuffer; */
/* invoke-direct {p1}, Ljava/lang/StringBuffer;-><init>()V */
(( java.lang.StringBuffer ) p1 ).append ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
v0 = this.b;
(( java.lang.StringBuffer ) p1 ).append ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v0 = "] to be rolled at midday and midnight."; // const-string v0, "] to be rolled at midday and midnight."
(( java.lang.StringBuffer ) p1 ).append ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .debug ( p1 );
/* .line 6 */
} // :cond_4
/* new-instance p1, Ljava/lang/StringBuffer; */
/* invoke-direct {p1}, Ljava/lang/StringBuffer;-><init>()V */
(( java.lang.StringBuffer ) p1 ).append ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
v0 = this.b;
(( java.lang.StringBuffer ) p1 ).append ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v0 = "] to be rolled on top of every hour."; // const-string v0, "] to be rolled on top of every hour."
(( java.lang.StringBuffer ) p1 ).append ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .debug ( p1 );
/* .line 7 */
} // :cond_5
/* new-instance p1, Ljava/lang/StringBuffer; */
/* invoke-direct {p1}, Ljava/lang/StringBuffer;-><init>()V */
(( java.lang.StringBuffer ) p1 ).append ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
v0 = this.b;
(( java.lang.StringBuffer ) p1 ).append ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v0 = "] to be rolled every minute."; // const-string v0, "] to be rolled every minute."
(( java.lang.StringBuffer ) p1 ).append ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .debug ( p1 );
} // :goto_0
return;
} // .end method
public void activateOptions ( ) {
/* .locals 6 */
/* .line 1 */
/* invoke-super {p0}, Lorg/apache/log4j/FileAppender;->activateOptions()V */
/* .line 2 */
v0 = this.o;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.l;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
v0 = this.r;
java.lang.System .currentTimeMillis ( );
/* move-result-wide v1 */
(( java.util.Date ) v0 ).setTime ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/util/Date;->setTime(J)V
/* .line 4 */
/* new-instance v0, Ljava/text/SimpleDateFormat; */
v1 = this.o;
/* invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V */
this.s = v0;
/* .line 5 */
v0 = (( org.apache.log4j.DailyRollingFileAppender ) p0 ).g ( ); // invoke-virtual {p0}, Lorg/apache/log4j/DailyRollingFileAppender;->g()I
/* .line 6 */
(( org.apache.log4j.DailyRollingFileAppender ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/log4j/DailyRollingFileAppender;->a(I)V
/* .line 7 */
v1 = this.t;
(( m.a.b.f ) v1 ).a ( v0 ); // invoke-virtual {v1, v0}, Lm/a/b/f;->a(I)V
/* .line 8 */
/* new-instance v0, Ljava/io/File; */
v1 = this.l;
/* invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
/* .line 9 */
/* new-instance v1, Ljava/lang/StringBuffer; */
/* invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V */
v2 = this.l;
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
v2 = this.s;
/* new-instance v3, Ljava/util/Date; */
(( java.io.File ) v0 ).lastModified ( ); // invoke-virtual {v0}, Ljava/io/File;->lastModified()J
/* move-result-wide v4 */
/* invoke-direct {v3, v4, v5}, Ljava/util/Date;-><init>(J)V */
(( java.text.SimpleDateFormat ) v2 ).format ( v3 ); // invoke-virtual {v2, v3}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;
(( java.lang.StringBuffer ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
this.p = v0;
/* .line 10 */
} // :cond_0
/* new-instance v0, Ljava/lang/StringBuffer; */
/* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
final String v1 = "Either File or DatePattern options are not set for appender ["; // const-string v1, "Either File or DatePattern options are not set for appender ["
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
v1 = this.b;
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v1 = "]."; // const-string v1, "]."
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .error ( v0 );
} // :goto_0
return;
} // .end method
public void b ( org.apache.log4j.spi.LoggingEvent p0 ) {
/* .locals 5 */
/* .line 1 */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v0 */
/* .line 2 */
/* iget-wide v2, p0, Lorg/apache/log4j/DailyRollingFileAppender;->q:J */
/* cmp-long v4, v0, v2 */
/* if-ltz v4, :cond_1 */
/* .line 3 */
v2 = this.r;
(( java.util.Date ) v2 ).setTime ( v0, v1 ); // invoke-virtual {v2, v0, v1}, Ljava/util/Date;->setTime(J)V
/* .line 4 */
v0 = this.t;
v1 = this.r;
(( m.a.b.f ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lm/a/b/f;->b(Ljava/util/Date;)J
/* move-result-wide v0 */
/* iput-wide v0, p0, Lorg/apache/log4j/DailyRollingFileAppender;->q:J */
/* .line 5 */
try { // :try_start_0
(( org.apache.log4j.DailyRollingFileAppender ) p0 ).rollOver ( ); // invoke-virtual {p0}, Lorg/apache/log4j/DailyRollingFileAppender;->rollOver()V
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
/* .line 6 */
/* instance-of v1, v0, Ljava/io/InterruptedIOException; */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 7 */
java.lang.Thread .currentThread ( );
(( java.lang.Thread ) v1 ).interrupt ( ); // invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V
} // :cond_0
final String v1 = "rollOver() failed."; // const-string v1, "rollOver() failed."
/* .line 8 */
org.apache.log4j.helpers.LogLog .error ( v1,v0 );
/* .line 9 */
} // :cond_1
} // :goto_0
/* invoke-super {p0, p1}, Lorg/apache/log4j/WriterAppender;->b(Lorg/apache/log4j/spi/LoggingEvent;)V */
return;
} // .end method
public Integer g ( ) {
/* .locals 8 */
/* .line 1 */
/* new-instance v0, Lm/a/b/f; */
v1 = org.apache.log4j.DailyRollingFileAppender.u;
java.util.Locale .getDefault ( );
/* invoke-direct {v0, v1, v2}, Lm/a/b/f;-><init>(Ljava/util/TimeZone;Ljava/util/Locale;)V */
/* .line 2 */
/* new-instance v1, Ljava/util/Date; */
/* const-wide/16 v2, 0x0 */
/* invoke-direct {v1, v2, v3}, Ljava/util/Date;-><init>(J)V */
/* .line 3 */
v2 = this.o;
if ( v2 != null) { // if-eqz v2, :cond_1
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
int v3 = 5; // const/4 v3, 0x5
/* if-gt v2, v3, :cond_1 */
/* .line 4 */
/* new-instance v3, Ljava/text/SimpleDateFormat; */
v4 = this.o;
/* invoke-direct {v3, v4}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V */
/* .line 5 */
v4 = org.apache.log4j.DailyRollingFileAppender.u;
(( java.text.SimpleDateFormat ) v3 ).setTimeZone ( v4 ); // invoke-virtual {v3, v4}, Ljava/text/SimpleDateFormat;->setTimeZone(Ljava/util/TimeZone;)V
/* .line 6 */
(( java.text.SimpleDateFormat ) v3 ).format ( v1 ); // invoke-virtual {v3, v1}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;
/* .line 7 */
(( m.a.b.f ) v0 ).a ( v2 ); // invoke-virtual {v0, v2}, Lm/a/b/f;->a(I)V
/* .line 8 */
/* new-instance v5, Ljava/util/Date; */
(( m.a.b.f ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lm/a/b/f;->b(Ljava/util/Date;)J
/* move-result-wide v6 */
/* invoke-direct {v5, v6, v7}, Ljava/util/Date;-><init>(J)V */
/* .line 9 */
(( java.text.SimpleDateFormat ) v3 ).format ( v5 ); // invoke-virtual {v3, v5}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;
if ( v4 != null) { // if-eqz v4, :cond_0
if ( v3 != null) { // if-eqz v3, :cond_0
/* .line 10 */
v3 = (( java.lang.String ) v4 ).equals ( v3 ); // invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v3, :cond_0 */
} // :cond_0
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_1
int v0 = -1; // const/4 v0, -0x1
} // .end method
public java.lang.String getDatePattern ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.o;
} // .end method
public void rollOver ( ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.o;
/* if-nez v0, :cond_0 */
/* .line 2 */
v0 = this.d;
final String v1 = "Missing DatePattern option in rollOver()."; // const-string v1, "Missing DatePattern option in rollOver()."
return;
/* .line 3 */
} // :cond_0
/* new-instance v0, Ljava/lang/StringBuffer; */
/* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
v1 = this.l;
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
v1 = this.s;
v2 = this.r;
(( java.text.SimpleDateFormat ) v1 ).format ( v2 ); // invoke-virtual {v1, v2}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
/* .line 4 */
v1 = this.p;
v1 = (( java.lang.String ) v1 ).equals ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_1
return;
/* .line 5 */
} // :cond_1
(( org.apache.log4j.FileAppender ) p0 ).f ( ); // invoke-virtual {p0}, Lorg/apache/log4j/FileAppender;->f()V
/* .line 6 */
/* new-instance v1, Ljava/io/File; */
v2 = this.p;
/* invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
/* .line 7 */
v2 = (( java.io.File ) v1 ).exists ( ); // invoke-virtual {v1}, Ljava/io/File;->exists()Z
if ( v2 != null) { // if-eqz v2, :cond_2
/* .line 8 */
(( java.io.File ) v1 ).delete ( ); // invoke-virtual {v1}, Ljava/io/File;->delete()Z
/* .line 9 */
} // :cond_2
/* new-instance v2, Ljava/io/File; */
v3 = this.l;
/* invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
/* .line 10 */
v1 = (( java.io.File ) v2 ).renameTo ( v1 ); // invoke-virtual {v2, v1}, Ljava/io/File;->renameTo(Ljava/io/File;)Z
if ( v1 != null) { // if-eqz v1, :cond_3
/* .line 11 */
/* new-instance v1, Ljava/lang/StringBuffer; */
/* invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V */
v2 = this.l;
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v2 = " -> "; // const-string v2, " -> "
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
v2 = this.p;
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .debug ( v1 );
/* .line 12 */
} // :cond_3
/* new-instance v1, Ljava/lang/StringBuffer; */
/* invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V */
final String v2 = "Failed to rename ["; // const-string v2, "Failed to rename ["
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
v2 = this.l;
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v2 = "] to ["; // const-string v2, "] to ["
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
v2 = this.p;
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v2 = "]."; // const-string v2, "]."
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .error ( v1 );
/* .line 13 */
} // :goto_0
try { // :try_start_0
v1 = this.l;
int v2 = 1; // const/4 v2, 0x1
/* iget-boolean v3, p0, Lorg/apache/log4j/FileAppender;->m:Z */
/* iget v4, p0, Lorg/apache/log4j/FileAppender;->n:I */
(( org.apache.log4j.FileAppender ) p0 ).setFile ( v1, v2, v3, v4 ); // invoke-virtual {p0, v1, v2, v3, v4}, Lorg/apache/log4j/FileAppender;->setFile(Ljava/lang/String;ZZI)V
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 14 */
/* :catch_0 */
v1 = this.d;
/* new-instance v2, Ljava/lang/StringBuffer; */
/* invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V */
final String v3 = "setFile("; // const-string v3, "setFile("
(( java.lang.StringBuffer ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
v3 = this.l;
(( java.lang.StringBuffer ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v3 = ", true) call failed."; // const-string v3, ", true) call failed."
(( java.lang.StringBuffer ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
/* .line 15 */
} // :goto_1
this.p = v0;
return;
} // .end method
public void setDatePattern ( java.lang.String p0 ) {
/* .locals 0 */
/* .line 1 */
this.o = p1;
return;
} // .end method
