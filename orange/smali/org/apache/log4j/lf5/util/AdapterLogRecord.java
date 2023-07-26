public class org.apache.log4j.lf5.util.AdapterLogRecord extends org.apache.log4j.lf5.LogRecord {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static org.apache.log4j.lf5.LogLevel m;
	 public static java.io.StringWriter n;
	 public static java.io.PrintWriter o;
	 /* # direct methods */
	 public static org.apache.log4j.lf5.util.AdapterLogRecord ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* new-instance v0, Ljava/io/StringWriter; */
		 /* invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V */
		 /* .line 2 */
		 /* new-instance v0, Ljava/io/PrintWriter; */
		 v1 = org.apache.log4j.lf5.util.AdapterLogRecord.n;
		 /* invoke-direct {v0, v1}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V */
		 return;
	 } // .end method
	 public org.apache.log4j.lf5.util.AdapterLogRecord ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Lorg/apache/log4j/lf5/LogRecord;-><init>()V */
		 return;
	 } // .end method
	 public static org.apache.log4j.lf5.LogLevel getSevereLevel ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = org.apache.log4j.lf5.util.AdapterLogRecord.m;
	 } // .end method
	 public static void setSevereLevel ( org.apache.log4j.lf5.LogLevel p0 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.String a ( java.lang.String p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* new-instance v0, Ljava/lang/Throwable; */
		 /* invoke-direct {v0}, Ljava/lang/Throwable;-><init>()V */
		 (( org.apache.log4j.lf5.util.AdapterLogRecord ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/log4j/lf5/util/AdapterLogRecord;->a(Ljava/lang/Throwable;)Ljava/lang/String;
		 /* .line 2 */
		 (( org.apache.log4j.lf5.util.AdapterLogRecord ) p0 ).a ( v0, p1 ); // invoke-virtual {p0, v0, p1}, Lorg/apache/log4j/lf5/util/AdapterLogRecord;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
	 } // .end method
	 public java.lang.String a ( java.lang.String p0, java.lang.String p1 ) {
		 /* .locals 1 */
		 /* .line 8 */
		 p2 = 		 (( java.lang.String ) p1 ).indexOf ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
		 int v0 = -1; // const/4 v0, -0x1
		 /* if-ne p2, v0, :cond_0 */
		 int p1 = 0; // const/4 p1, 0x0
		 /* .line 9 */
	 } // :cond_0
	 (( java.lang.String ) p1 ).substring ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/String;->substring(I)Ljava/lang/String;
	 int p2 = 0; // const/4 p2, 0x0
	 final String v0 = ")"; // const-string v0, ")"
	 /* .line 10 */
	 v0 = 	 (( java.lang.String ) p1 ).indexOf ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
	 /* add-int/lit8 v0, v0, 0x1 */
	 (( java.lang.String ) p1 ).substring ( p2, v0 ); // invoke-virtual {p1, p2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;
} // .end method
public java.lang.String a ( java.lang.Throwable p0 ) {
	 /* .locals 3 */
	 /* .line 3 */
	 v0 = org.apache.log4j.lf5.util.AdapterLogRecord.n;
	 /* monitor-enter v0 */
	 /* .line 4 */
	 try { // :try_start_0
		 v1 = org.apache.log4j.lf5.util.AdapterLogRecord.o;
		 (( java.lang.Throwable ) p1 ).printStackTrace ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintWriter;)V
		 /* .line 5 */
		 p1 = org.apache.log4j.lf5.util.AdapterLogRecord.n;
		 (( java.io.StringWriter ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/io/StringWriter;->toString()Ljava/lang/String;
		 /* .line 6 */
		 v1 = org.apache.log4j.lf5.util.AdapterLogRecord.n;
		 (( java.io.StringWriter ) v1 ).getBuffer ( ); // invoke-virtual {v1}, Ljava/io/StringWriter;->getBuffer()Ljava/lang/StringBuffer;
		 int v2 = 0; // const/4 v2, 0x0
		 (( java.lang.StringBuffer ) v1 ).setLength ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->setLength(I)V
		 /* .line 7 */
		 /* monitor-exit v0 */
		 /* :catchall_0 */
		 /* move-exception p1 */
		 /* monitor-exit v0 */
		 /* :try_end_0 */
		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
		 /* throw p1 */
	 } // .end method
	 public Boolean isSevereLevel ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 v0 = org.apache.log4j.lf5.util.AdapterLogRecord.m;
		 /* if-nez v0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 2 */
	 } // :cond_0
	 (( org.apache.log4j.lf5.LogRecord ) p0 ).getLevel ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/LogRecord;->getLevel()Lorg/apache/log4j/lf5/LogLevel;
	 v0 = 	 (( org.apache.log4j.lf5.LogLevel ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Lorg/apache/log4j/lf5/LogLevel;->equals(Ljava/lang/Object;)Z
} // .end method
public void setCategory ( java.lang.String p0 ) {
	 /* .locals 0 */
	 /* .line 1 */
	 /* invoke-super {p0, p1}, Lorg/apache/log4j/lf5/LogRecord;->setCategory(Ljava/lang/String;)V */
	 /* .line 2 */
	 (( org.apache.log4j.lf5.util.AdapterLogRecord ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/log4j/lf5/util/AdapterLogRecord;->a(Ljava/lang/String;)Ljava/lang/String;
	 /* invoke-super {p0, p1}, Lorg/apache/log4j/lf5/LogRecord;->setLocation(Ljava/lang/String;)V */
	 return;
} // .end method
