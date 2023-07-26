public class org.apache.log4j.lf5.util.LogFileParser implements java.lang.Runnable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # static fields */
	 public static final java.lang.String ATTRIBUTE_DELIMITER;
	 public static final java.lang.String CATEGORY_DELIMITER;
	 public static final java.lang.String DATE_DELIMITER;
	 public static final java.lang.String LOCATION_DELIMITER;
	 public static final java.lang.String MESSAGE_DELIMITER;
	 public static final java.lang.String NDC_DELIMITER;
	 public static final java.lang.String PRIORITY_DELIMITER;
	 public static final java.lang.String RECORD_DELIMITER;
	 public static final java.lang.String THREAD_DELIMITER;
	 public static java.text.SimpleDateFormat e;
	 /* # instance fields */
	 public org.apache.log4j.lf5.viewer.LogBrokerMonitor b;
	 public org.apache.log4j.lf5.viewer.LogFactor5LoadingDialog c;
	 public java.io.InputStream d;
	 /* # direct methods */
	 public static org.apache.log4j.lf5.util.LogFileParser ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* new-instance v0, Ljava/text/SimpleDateFormat; */
		 final String v1 = "dd MMM yyyy HH:mm:ss,S"; // const-string v1, "dd MMM yyyy HH:mm:ss,S"
		 /* invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V */
		 return;
	 } // .end method
	 public org.apache.log4j.lf5.util.LogFileParser ( ) {
		 /* .locals 1 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Ljava/io/IOException;, */
		 /* Ljava/io/FileNotFoundException; */
		 /* } */
	 } // .end annotation
	 /* .line 1 */
	 /* new-instance v0, Ljava/io/FileInputStream; */
	 /* invoke-direct {v0, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V */
	 /* invoke-direct {p0, v0}, Lorg/apache/log4j/lf5/util/LogFileParser;-><init>(Ljava/io/InputStream;)V */
	 return;
} // .end method
public org.apache.log4j.lf5.util.LogFileParser ( ) {
	 /* .locals 1 */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Ljava/io/IOException; */
	 /* } */
} // .end annotation
/* .line 2 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
int v0 = 0; // const/4 v0, 0x0
/* .line 3 */
this.d = v0;
/* .line 4 */
this.d = p1;
return;
} // .end method
public static void a ( org.apache.log4j.lf5.util.LogFileParser p0 ) { //synthethic
/* .locals 0 */
/* .line 1 */
(( org.apache.log4j.lf5.util.LogFileParser ) p0 ).a ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/util/LogFileParser;->a()V
return;
} // .end method
/* # virtual methods */
public final java.lang.String a ( Integer p0, java.lang.String p1 ) {
/* .locals 2 */
/* add-int/lit8 v0, p1, -0x1 */
final String v1 = "[slf5s."; // const-string v1, "[slf5s."
/* .line 24 */
v0 = (( java.lang.String ) p2 ).lastIndexOf ( v1, v0 ); // invoke-virtual {p2, v1, v0}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;I)I
int v1 = -1; // const/4 v1, -0x1
/* if-ne v0, v1, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
/* .line 25 */
(( java.lang.String ) p2 ).substring ( v0, p1 ); // invoke-virtual {p2, v0, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;
} // :cond_0
final String v1 = "]"; // const-string v1, "]"
/* .line 26 */
v0 = (( java.lang.String ) p2 ).indexOf ( v1, v0 ); // invoke-virtual {p2, v1, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I
/* add-int/lit8 v0, v0, 0x1 */
/* .line 27 */
(( java.lang.String ) p2 ).substring ( v0, p1 ); // invoke-virtual {p2, v0, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;
(( java.lang.String ) p1 ).trim ( ); // invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;
} // .end method
public final java.lang.String a ( java.io.InputStream p0 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 4 */
/* new-instance v0, Ljava/io/BufferedInputStream; */
/* invoke-direct {v0, p1}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V */
/* .line 5 */
p1 = (( java.io.BufferedInputStream ) v0 ).available ( ); // invoke-virtual {v0}, Ljava/io/BufferedInputStream;->available()I
/* if-lez p1, :cond_0 */
/* .line 6 */
/* new-instance v1, Ljava/lang/StringBuffer; */
/* invoke-direct {v1, p1}, Ljava/lang/StringBuffer;-><init>(I)V */
/* .line 7 */
} // :cond_0
/* new-instance v1, Ljava/lang/StringBuffer; */
/* const/16 p1, 0x400 */
/* invoke-direct {v1, p1}, Ljava/lang/StringBuffer;-><init>(I)V */
/* .line 8 */
} // :goto_0
p1 = (( java.io.BufferedInputStream ) v0 ).read ( ); // invoke-virtual {v0}, Ljava/io/BufferedInputStream;->read()I
int v2 = -1; // const/4 v2, -0x1
/* if-eq p1, v2, :cond_1 */
/* int-to-char p1, p1 */
/* .line 9 */
(( java.lang.StringBuffer ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
/* .line 10 */
} // :cond_1
(( java.io.BufferedInputStream ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/io/BufferedInputStream;->close()V
/* .line 11 */
(( java.lang.StringBuffer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
} // .end method
public final java.lang.String a ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 1 */
/* .line 12 */
p1 = (( java.lang.String ) p2 ).indexOf ( p1 ); // invoke-virtual {p2, p1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
int v0 = -1; // const/4 v0, -0x1
/* if-ne p1, v0, :cond_0 */
int p1 = 0; // const/4 p1, 0x0
/* .line 13 */
} // :cond_0
(( org.apache.log4j.lf5.util.LogFileParser ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lorg/apache/log4j/lf5/util/LogFileParser;->a(ILjava/lang/String;)Ljava/lang/String;
} // .end method
public final org.apache.log4j.lf5.LogRecord a ( java.lang.String p0 ) {
/* .locals 3 */
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 14 */
(( java.lang.String ) p1 ).trim ( ); // invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;
v0 = (( java.lang.String ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/String;->length()I
/* if-nez v0, :cond_0 */
/* .line 15 */
} // :cond_0
/* new-instance v0, Lorg/apache/log4j/lf5/Log4JLogRecord; */
/* invoke-direct {v0}, Lorg/apache/log4j/lf5/Log4JLogRecord;-><init>()V */
/* .line 16 */
(( org.apache.log4j.lf5.util.LogFileParser ) p0 ).d ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/log4j/lf5/util/LogFileParser;->d(Ljava/lang/String;)J
/* move-result-wide v1 */
(( org.apache.log4j.lf5.LogRecord ) v0 ).setMillis ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lorg/apache/log4j/lf5/LogRecord;->setMillis(J)V
/* .line 17 */
(( org.apache.log4j.lf5.util.LogFileParser ) p0 ).h ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/log4j/lf5/util/LogFileParser;->h(Ljava/lang/String;)Lorg/apache/log4j/lf5/LogLevel;
(( org.apache.log4j.lf5.LogRecord ) v0 ).setLevel ( v1 ); // invoke-virtual {v0, v1}, Lorg/apache/log4j/lf5/LogRecord;->setLevel(Lorg/apache/log4j/lf5/LogLevel;)V
/* .line 18 */
(( org.apache.log4j.lf5.util.LogFileParser ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/log4j/lf5/util/LogFileParser;->c(Ljava/lang/String;)Ljava/lang/String;
(( org.apache.log4j.lf5.LogRecord ) v0 ).setCategory ( v1 ); // invoke-virtual {v0, v1}, Lorg/apache/log4j/lf5/LogRecord;->setCategory(Ljava/lang/String;)V
/* .line 19 */
(( org.apache.log4j.lf5.util.LogFileParser ) p0 ).e ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/log4j/lf5/util/LogFileParser;->e(Ljava/lang/String;)Ljava/lang/String;
(( org.apache.log4j.lf5.LogRecord ) v0 ).setLocation ( v1 ); // invoke-virtual {v0, v1}, Lorg/apache/log4j/lf5/LogRecord;->setLocation(Ljava/lang/String;)V
/* .line 20 */
(( org.apache.log4j.lf5.util.LogFileParser ) p0 ).i ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/log4j/lf5/util/LogFileParser;->i(Ljava/lang/String;)Ljava/lang/String;
(( org.apache.log4j.lf5.LogRecord ) v0 ).setThreadDescription ( v1 ); // invoke-virtual {v0, v1}, Lorg/apache/log4j/lf5/LogRecord;->setThreadDescription(Ljava/lang/String;)V
/* .line 21 */
(( org.apache.log4j.lf5.util.LogFileParser ) p0 ).g ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/log4j/lf5/util/LogFileParser;->g(Ljava/lang/String;)Ljava/lang/String;
(( org.apache.log4j.lf5.LogRecord ) v0 ).setNDC ( v1 ); // invoke-virtual {v0, v1}, Lorg/apache/log4j/lf5/LogRecord;->setNDC(Ljava/lang/String;)V
/* .line 22 */
(( org.apache.log4j.lf5.util.LogFileParser ) p0 ).f ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/log4j/lf5/util/LogFileParser;->f(Ljava/lang/String;)Ljava/lang/String;
(( org.apache.log4j.lf5.LogRecord ) v0 ).setMessage ( v1 ); // invoke-virtual {v0, v1}, Lorg/apache/log4j/lf5/LogRecord;->setMessage(Ljava/lang/String;)V
/* .line 23 */
(( org.apache.log4j.lf5.util.LogFileParser ) p0 ).j ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/log4j/lf5/util/LogFileParser;->j(Ljava/lang/String;)Ljava/lang/String;
(( org.apache.log4j.lf5.LogRecord ) v0 ).setThrownStackTrace ( p1 ); // invoke-virtual {v0, p1}, Lorg/apache/log4j/lf5/LogRecord;->setThrownStackTrace(Ljava/lang/String;)V
} // :cond_1
} // :goto_0
int p1 = 0; // const/4 p1, 0x0
} // .end method
public final void a ( ) {
/* .locals 1 */
/* .line 2 */
v0 = this.c;
(( org.apache.log4j.lf5.viewer.LogFactor5LoadingDialog ) v0 ).hide ( ); // invoke-virtual {v0}, Lorg/apache/log4j/lf5/viewer/LogFactor5LoadingDialog;->hide()V
/* .line 3 */
v0 = this.c;
(( org.apache.log4j.lf5.viewer.LogFactor5LoadingDialog ) v0 ).dispose ( ); // invoke-virtual {v0}, Lorg/apache/log4j/lf5/viewer/LogFactor5LoadingDialog;->dispose()V
return;
} // .end method
public void b ( java.lang.String p0 ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Lorg/apache/log4j/lf5/viewer/LogFactor5ErrorDialog; */
v1 = this.b;
(( org.apache.log4j.lf5.viewer.LogBrokerMonitor ) v1 ).getBaseFrame ( ); // invoke-virtual {v1}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->getBaseFrame()Ljavax/swing/JFrame;
/* invoke-direct {v0, v1, p1}, Lorg/apache/log4j/lf5/viewer/LogFactor5ErrorDialog;-><init>(Ljavax/swing/JFrame;Ljava/lang/String;)V */
return;
} // .end method
public final java.lang.String c ( java.lang.String p0 ) {
/* .locals 1 */
final String v0 = "[slf5s.CATEGORY]"; // const-string v0, "[slf5s.CATEGORY]"
/* .line 1 */
(( org.apache.log4j.lf5.util.LogFileParser ) p0 ).a ( v0, p1 ); // invoke-virtual {p0, v0, p1}, Lorg/apache/log4j/lf5/util/LogFileParser;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
} // .end method
public final Long d ( java.lang.String p0 ) {
/* .locals 3 */
/* const-wide/16 v0, 0x0 */
try { // :try_start_0
final String v2 = "[slf5s.DATE]"; // const-string v2, "[slf5s.DATE]"
/* .line 1 */
(( org.apache.log4j.lf5.util.LogFileParser ) p0 ).a ( v2, p1 ); // invoke-virtual {p0, v2, p1}, Lorg/apache/log4j/lf5/util/LogFileParser;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/* if-nez p1, :cond_0 */
/* return-wide v0 */
/* .line 2 */
} // :cond_0
v2 = org.apache.log4j.lf5.util.LogFileParser.e;
(( java.text.SimpleDateFormat ) v2 ).parse ( p1 ); // invoke-virtual {v2, p1}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;
/* .line 3 */
(( java.util.Date ) p1 ).getTime ( ); // invoke-virtual {p1}, Ljava/util/Date;->getTime()J
/* move-result-wide v0 */
/* :try_end_0 */
/* .catch Ljava/text/ParseException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* return-wide v0 */
} // .end method
public final java.lang.String e ( java.lang.String p0 ) {
/* .locals 1 */
final String v0 = "[slf5s.LOCATION]"; // const-string v0, "[slf5s.LOCATION]"
/* .line 1 */
(( org.apache.log4j.lf5.util.LogFileParser ) p0 ).a ( v0, p1 ); // invoke-virtual {p0, v0, p1}, Lorg/apache/log4j/lf5/util/LogFileParser;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
} // .end method
public final java.lang.String f ( java.lang.String p0 ) {
/* .locals 1 */
final String v0 = "[slf5s.MESSAGE]"; // const-string v0, "[slf5s.MESSAGE]"
/* .line 1 */
(( org.apache.log4j.lf5.util.LogFileParser ) p0 ).a ( v0, p1 ); // invoke-virtual {p0, v0, p1}, Lorg/apache/log4j/lf5/util/LogFileParser;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
} // .end method
public final java.lang.String g ( java.lang.String p0 ) {
/* .locals 1 */
final String v0 = "[slf5s.NDC]"; // const-string v0, "[slf5s.NDC]"
/* .line 1 */
(( org.apache.log4j.lf5.util.LogFileParser ) p0 ).a ( v0, p1 ); // invoke-virtual {p0, v0, p1}, Lorg/apache/log4j/lf5/util/LogFileParser;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
} // .end method
public final org.apache.log4j.lf5.LogLevel h ( java.lang.String p0 ) {
/* .locals 1 */
final String v0 = "[slf5s.PRIORITY]"; // const-string v0, "[slf5s.PRIORITY]"
/* .line 1 */
(( org.apache.log4j.lf5.util.LogFileParser ) p0 ).a ( v0, p1 ); // invoke-virtual {p0, v0, p1}, Lorg/apache/log4j/lf5/util/LogFileParser;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 2 */
try { // :try_start_0
org.apache.log4j.lf5.LogLevel .valueOf ( p1 );
/* :try_end_0 */
/* .catch Lorg/apache/log4j/lf5/LogLevelFormatException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 3 */
/* :catch_0 */
p1 = org.apache.log4j.lf5.LogLevel.DEBUG;
/* .line 4 */
} // :cond_0
p1 = org.apache.log4j.lf5.LogLevel.DEBUG;
} // .end method
public final java.lang.String i ( java.lang.String p0 ) {
/* .locals 1 */
final String v0 = "[slf5s.THREAD]"; // const-string v0, "[slf5s.THREAD]"
/* .line 1 */
(( org.apache.log4j.lf5.util.LogFileParser ) p0 ).a ( v0, p1 ); // invoke-virtual {p0, v0, p1}, Lorg/apache/log4j/lf5/util/LogFileParser;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
} // .end method
public final java.lang.String j ( java.lang.String p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
(( org.apache.log4j.lf5.util.LogFileParser ) p0 ).a ( v0, p1 ); // invoke-virtual {p0, v0, p1}, Lorg/apache/log4j/lf5/util/LogFileParser;->a(ILjava/lang/String;)Ljava/lang/String;
} // .end method
public void parse ( org.apache.log4j.lf5.viewer.LogBrokerMonitor p0 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/RuntimeException; */
/* } */
} // .end annotation
/* .line 1 */
this.b = p1;
/* .line 2 */
/* new-instance p1, Ljava/lang/Thread; */
/* invoke-direct {p1, p0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V */
/* .line 3 */
(( java.lang.Thread ) p1 ).start ( ); // invoke-virtual {p1}, Ljava/lang/Thread;->start()V
return;
} // .end method
public void run ( ) {
/* .locals 5 */
/* .line 1 */
/* new-instance v0, Lorg/apache/log4j/lf5/viewer/LogFactor5LoadingDialog; */
v1 = this.b;
(( org.apache.log4j.lf5.viewer.LogBrokerMonitor ) v1 ).getBaseFrame ( ); // invoke-virtual {v1}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->getBaseFrame()Ljavax/swing/JFrame;
final String v2 = "Loading file..."; // const-string v2, "Loading file..."
/* invoke-direct {v0, v1, v2}, Lorg/apache/log4j/lf5/viewer/LogFactor5LoadingDialog;-><init>(Ljavax/swing/JFrame;Ljava/lang/String;)V */
this.c = v0;
/* .line 2 */
try { // :try_start_0
v0 = this.d;
(( org.apache.log4j.lf5.util.LogFileParser ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/log4j/lf5/util/LogFileParser;->a(Ljava/io/InputStream;)Ljava/lang/String;
int v1 = 0; // const/4 v1, 0x0
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
final String v3 = "[slf5s.start]"; // const-string v3, "[slf5s.start]"
/* .line 3 */
v3 = (( java.lang.String ) v0 ).indexOf ( v3, v1 ); // invoke-virtual {v0, v3, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I
int v4 = -1; // const/4 v4, -0x1
/* if-eq v3, v4, :cond_1 */
/* .line 4 */
(( java.lang.String ) v0 ).substring ( v1, v3 ); // invoke-virtual {v0, v1, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;
(( org.apache.log4j.lf5.util.LogFileParser ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Lorg/apache/log4j/lf5/util/LogFileParser;->a(Ljava/lang/String;)Lorg/apache/log4j/lf5/LogRecord;
int v2 = 1; // const/4 v2, 0x1
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 5 */
v4 = this.b;
(( org.apache.log4j.lf5.viewer.LogBrokerMonitor ) v4 ).addMessage ( v1 ); // invoke-virtual {v4, v1}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->addMessage(Lorg/apache/log4j/lf5/LogRecord;)V
} // :cond_0
/* add-int/lit8 v1, v3, 0xd */
/* .line 6 */
} // :cond_1
v3 = (( java.lang.String ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/String;->length()I
/* if-ge v1, v3, :cond_2 */
if ( v2 != null) { // if-eqz v2, :cond_2
/* .line 7 */
(( java.lang.String ) v0 ).substring ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;
(( org.apache.log4j.lf5.util.LogFileParser ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/log4j/lf5/util/LogFileParser;->a(Ljava/lang/String;)Lorg/apache/log4j/lf5/LogRecord;
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 8 */
v1 = this.b;
(( org.apache.log4j.lf5.viewer.LogBrokerMonitor ) v1 ).addMessage ( v0 ); // invoke-virtual {v1, v0}, Lorg/apache/log4j/lf5/viewer/LogBrokerMonitor;->addMessage(Lorg/apache/log4j/lf5/LogRecord;)V
} // :cond_2
if ( v2 != null) { // if-eqz v2, :cond_3
/* .line 9 */
/* new-instance v0, Lm/a/b/j/a/a; */
/* invoke-direct {v0, p0}, Lm/a/b/j/a/a;-><init>(Lorg/apache/log4j/lf5/util/LogFileParser;)V */
javax.swing.SwingUtilities .invokeLater ( v0 );
/* .line 10 */
} // :cond_3
/* new-instance v0, Ljava/lang/RuntimeException; */
final String v1 = "Invalid log file format"; // const-string v1, "Invalid log file format"
/* invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* :try_end_0 */
/* .catch Ljava/lang/RuntimeException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 11 */
/* :catch_0 */
(( org.apache.log4j.lf5.util.LogFileParser ) p0 ).a ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/util/LogFileParser;->a()V
final String v0 = "Error - Unable to load log file!"; // const-string v0, "Error - Unable to load log file!"
/* .line 12 */
(( org.apache.log4j.lf5.util.LogFileParser ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/log4j/lf5/util/LogFileParser;->b(Ljava/lang/String;)V
/* .line 13 */
/* :catch_1 */
(( org.apache.log4j.lf5.util.LogFileParser ) p0 ).a ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/util/LogFileParser;->a()V
final String v0 = "Error - Invalid log file format.\nPlease see documentation on how to load log files."; // const-string v0, "Error - Invalid log file format.\nPlease see documentation on how to load log files."
/* .line 14 */
(( org.apache.log4j.lf5.util.LogFileParser ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/log4j/lf5/util/LogFileParser;->b(Ljava/lang/String;)V
} // :goto_1
int v0 = 0; // const/4 v0, 0x0
/* .line 15 */
this.d = v0;
return;
} // .end method
