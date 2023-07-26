public abstract class org.apache.log4j.lf5.LogRecord implements java.io.Serializable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # static fields */
	 public static Long l;
	 /* # instance fields */
	 public org.apache.log4j.lf5.LogLevel b;
	 public java.lang.String c;
	 public Long d;
	 public Long e;
	 public java.lang.String f;
	 public java.lang.String g;
	 public java.lang.String h;
	 public java.lang.Throwable i;
	 public java.lang.String j;
	 public java.lang.String k;
	 /* # direct methods */
	 public static org.apache.log4j.lf5.LogRecord ( ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 public org.apache.log4j.lf5.LogRecord ( ) {
		 /* .locals 3 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 java.lang.System .currentTimeMillis ( );
		 /* move-result-wide v0 */
		 /* iput-wide v0, p0, Lorg/apache/log4j/lf5/LogRecord;->e:J */
		 final String v0 = "Debug"; // const-string v0, "Debug"
		 /* .line 3 */
		 this.f = v0;
		 final String v0 = ""; // const-string v0, ""
		 /* .line 4 */
		 this.c = v0;
		 /* .line 5 */
		 v1 = org.apache.log4j.lf5.LogLevel.INFO;
		 this.b = v1;
		 /* .line 6 */
		 org.apache.log4j.lf5.LogRecord .a ( );
		 /* move-result-wide v1 */
		 /* iput-wide v1, p0, Lorg/apache/log4j/lf5/LogRecord;->d:J */
		 /* .line 7 */
		 java.lang.Thread .currentThread ( );
		 (( java.lang.Thread ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/Thread;->toString()Ljava/lang/String;
		 this.g = v1;
		 /* .line 8 */
		 this.j = v0;
		 /* .line 9 */
		 this.k = v0;
		 return;
	 } // .end method
	 public static synchronized Long a ( ) {
		 /* .locals 5 */
		 /* const-class v0, Lorg/apache/log4j/lf5/LogRecord; */
		 /* monitor-enter v0 */
		 /* .line 1 */
		 try { // :try_start_0
			 /* sget-wide v1, Lorg/apache/log4j/lf5/LogRecord;->l:J */
			 /* const-wide/16 v3, 0x1 */
			 /* add-long/2addr v1, v3 */
			 /* sput-wide v1, Lorg/apache/log4j/lf5/LogRecord;->l:J */
			 /* :try_end_0 */
			 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
			 /* .line 2 */
			 /* monitor-exit v0 */
			 /* return-wide v1 */
			 /* :catchall_0 */
			 /* move-exception v1 */
			 /* monitor-exit v0 */
			 /* throw v1 */
		 } // .end method
		 public static synchronized void resetSequenceNumber ( ) {
			 /* .locals 3 */
			 /* const-class v0, Lorg/apache/log4j/lf5/LogRecord; */
			 /* monitor-enter v0 */
			 /* const-wide/16 v1, 0x0 */
			 /* .line 1 */
			 try { // :try_start_0
				 /* sput-wide v1, Lorg/apache/log4j/lf5/LogRecord;->l:J */
				 /* :try_end_0 */
				 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
				 /* .line 2 */
				 /* monitor-exit v0 */
				 return;
				 /* :catchall_0 */
				 /* move-exception v1 */
				 /* monitor-exit v0 */
				 /* throw v1 */
			 } // .end method
			 /* # virtual methods */
			 public java.lang.String getCategory ( ) {
				 /* .locals 1 */
				 /* .line 1 */
				 v0 = this.f;
			 } // .end method
			 public org.apache.log4j.lf5.LogLevel getLevel ( ) {
				 /* .locals 1 */
				 /* .line 1 */
				 v0 = this.b;
			 } // .end method
			 public java.lang.String getLocation ( ) {
				 /* .locals 1 */
				 /* .line 1 */
				 v0 = this.k;
			 } // .end method
			 public java.lang.String getMessage ( ) {
				 /* .locals 1 */
				 /* .line 1 */
				 v0 = this.c;
			 } // .end method
			 public Long getMillis ( ) {
				 /* .locals 2 */
				 /* .line 1 */
				 /* iget-wide v0, p0, Lorg/apache/log4j/lf5/LogRecord;->e:J */
				 /* return-wide v0 */
			 } // .end method
			 public java.lang.String getNDC ( ) {
				 /* .locals 1 */
				 /* .line 1 */
				 v0 = this.j;
			 } // .end method
			 public Long getSequenceNumber ( ) {
				 /* .locals 2 */
				 /* .line 1 */
				 /* iget-wide v0, p0, Lorg/apache/log4j/lf5/LogRecord;->d:J */
				 /* return-wide v0 */
			 } // .end method
			 public java.lang.String getThreadDescription ( ) {
				 /* .locals 1 */
				 /* .line 1 */
				 v0 = this.g;
			 } // .end method
			 public java.lang.Throwable getThrown ( ) {
				 /* .locals 1 */
				 /* .line 1 */
				 v0 = this.i;
			 } // .end method
			 public java.lang.String getThrownStackTrace ( ) {
				 /* .locals 1 */
				 /* .line 1 */
				 v0 = this.h;
			 } // .end method
			 public Boolean hasThrown ( ) {
				 /* .locals 2 */
				 /* .line 1 */
				 (( org.apache.log4j.lf5.LogRecord ) p0 ).getThrown ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/LogRecord;->getThrown()Ljava/lang/Throwable;
				 int v1 = 0; // const/4 v1, 0x0
				 /* if-nez v0, :cond_0 */
				 /* .line 2 */
			 } // :cond_0
			 (( java.lang.Throwable ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;
			 if ( v0 != null) { // if-eqz v0, :cond_1
				 /* .line 3 */
				 (( java.lang.String ) v0 ).trim ( ); // invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
				 v0 = 				 (( java.lang.String ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/String;->length()I
				 if ( v0 != null) { // if-eqz v0, :cond_1
					 int v1 = 1; // const/4 v1, 0x1
				 } // :cond_1
			 } // .end method
			 public Boolean isFatal ( ) {
				 /* .locals 1 */
				 /* .line 1 */
				 v0 = 				 (( org.apache.log4j.lf5.LogRecord ) p0 ).isSevereLevel ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/LogRecord;->isSevereLevel()Z
				 /* if-nez v0, :cond_1 */
				 v0 = 				 (( org.apache.log4j.lf5.LogRecord ) p0 ).hasThrown ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/LogRecord;->hasThrown()Z
				 if ( v0 != null) { // if-eqz v0, :cond_0
				 } // :cond_0
				 int v0 = 0; // const/4 v0, 0x0
			 } // :cond_1
		 } // :goto_0
		 int v0 = 1; // const/4 v0, 0x1
	 } // :goto_1
} // .end method
public abstract Boolean isSevereLevel ( ) {
} // .end method
public void setCategory ( java.lang.String p0 ) {
	 /* .locals 0 */
	 /* .line 1 */
	 this.f = p1;
	 return;
} // .end method
public void setLevel ( org.apache.log4j.lf5.LogLevel p0 ) {
	 /* .locals 0 */
	 /* .line 1 */
	 this.b = p1;
	 return;
} // .end method
public void setLocation ( java.lang.String p0 ) {
	 /* .locals 0 */
	 /* .line 1 */
	 this.k = p1;
	 return;
} // .end method
public void setMessage ( java.lang.String p0 ) {
	 /* .locals 0 */
	 /* .line 1 */
	 this.c = p1;
	 return;
} // .end method
public void setMillis ( Long p0 ) {
	 /* .locals 0 */
	 /* .line 1 */
	 /* iput-wide p1, p0, Lorg/apache/log4j/lf5/LogRecord;->e:J */
	 return;
} // .end method
public void setNDC ( java.lang.String p0 ) {
	 /* .locals 0 */
	 /* .line 1 */
	 this.j = p1;
	 return;
} // .end method
public void setSequenceNumber ( Long p0 ) {
	 /* .locals 0 */
	 /* .line 1 */
	 /* iput-wide p1, p0, Lorg/apache/log4j/lf5/LogRecord;->d:J */
	 return;
} // .end method
public void setThreadDescription ( java.lang.String p0 ) {
	 /* .locals 0 */
	 /* .line 1 */
	 this.g = p1;
	 return;
} // .end method
public void setThrown ( java.lang.Throwable p0 ) {
	 /* .locals 2 */
	 /* if-nez p1, :cond_0 */
	 return;
	 /* .line 1 */
} // :cond_0
this.i = p1;
/* .line 2 */
/* new-instance v0, Ljava/io/StringWriter; */
/* invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V */
/* .line 3 */
/* new-instance v1, Ljava/io/PrintWriter; */
/* invoke-direct {v1, v0}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V */
/* .line 4 */
(( java.lang.Throwable ) p1 ).printStackTrace ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintWriter;)V
/* .line 5 */
(( java.io.PrintWriter ) v1 ).flush ( ); // invoke-virtual {v1}, Ljava/io/PrintWriter;->flush()V
/* .line 6 */
(( java.io.StringWriter ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;
this.h = p1;
/* .line 7 */
try { // :try_start_0
	 (( java.io.PrintWriter ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/io/PrintWriter;->close()V
	 /* .line 8 */
	 (( java.io.StringWriter ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/io/StringWriter;->close()V
	 /* :try_end_0 */
	 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* :catch_0 */
	 return;
} // .end method
public void setThrownStackTrace ( java.lang.String p0 ) {
	 /* .locals 0 */
	 /* .line 1 */
	 this.h = p1;
	 return;
} // .end method
public java.lang.String toString ( ) {
	 /* .locals 3 */
	 /* .line 1 */
	 /* new-instance v0, Ljava/lang/StringBuffer; */
	 /* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
	 /* .line 2 */
	 /* new-instance v1, Ljava/lang/StringBuffer; */
	 /* invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V */
	 final String v2 = "LogRecord: ["; // const-string v2, "LogRecord: ["
	 (( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 v2 = this.b;
	 (( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;
	 final String v2 = ", "; // const-string v2, ", "
	 (( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 v2 = this.c;
	 (( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 final String v2 = "]"; // const-string v2, "]"
	 (( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 (( java.lang.StringBuffer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
	 (( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 /* .line 3 */
	 (( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
} // .end method
