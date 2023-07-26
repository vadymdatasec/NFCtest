public abstract class org.apache.log4j.helpers.FileWatchdog extends java.lang.Thread {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final Long DEFAULT_DELAY;
	 /* # instance fields */
	 public java.lang.String b;
	 public Long c;
	 public java.io.File d;
	 public Long e;
	 public Boolean f;
	 public Boolean g;
	 /* # direct methods */
	 public org.apache.log4j.helpers.FileWatchdog ( ) {
		 /* .locals 2 */
		 final String v0 = "FileWatchdog"; // const-string v0, "FileWatchdog"
		 /* .line 1 */
		 /* invoke-direct {p0, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/String;)V */
		 /* const-wide/32 v0, 0xea60 */
		 /* .line 2 */
		 /* iput-wide v0, p0, Lorg/apache/log4j/helpers/FileWatchdog;->c:J */
		 /* const-wide/16 v0, 0x0 */
		 /* .line 3 */
		 /* iput-wide v0, p0, Lorg/apache/log4j/helpers/FileWatchdog;->e:J */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 4 */
		 /* iput-boolean v0, p0, Lorg/apache/log4j/helpers/FileWatchdog;->f:Z */
		 /* .line 5 */
		 /* iput-boolean v0, p0, Lorg/apache/log4j/helpers/FileWatchdog;->g:Z */
		 /* .line 6 */
		 this.b = p1;
		 /* .line 7 */
		 /* new-instance v0, Ljava/io/File; */
		 /* invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
		 this.d = v0;
		 int p1 = 1; // const/4 p1, 0x1
		 /* .line 8 */
		 (( java.lang.Thread ) p0 ).setDaemon ( p1 ); // invoke-virtual {p0, p1}, Ljava/lang/Thread;->setDaemon(Z)V
		 /* .line 9 */
		 (( org.apache.log4j.helpers.FileWatchdog ) p0 ).a ( ); // invoke-virtual {p0}, Lorg/apache/log4j/helpers/FileWatchdog;->a()V
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( ) {
		 /* .locals 5 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* .line 1 */
		 try { // :try_start_0
			 v1 = this.d;
			 v1 = 			 (( java.io.File ) v1 ).exists ( ); // invoke-virtual {v1}, Ljava/io/File;->exists()Z
			 /* :try_end_0 */
			 /* .catch Ljava/lang/SecurityException; {:try_start_0 ..:try_end_0} :catch_0 */
			 if ( v1 != null) { // if-eqz v1, :cond_0
				 /* .line 2 */
				 v0 = this.d;
				 (( java.io.File ) v0 ).lastModified ( ); // invoke-virtual {v0}, Ljava/io/File;->lastModified()J
				 /* move-result-wide v0 */
				 /* .line 3 */
				 /* iget-wide v2, p0, Lorg/apache/log4j/helpers/FileWatchdog;->e:J */
				 /* cmp-long v4, v0, v2 */
				 /* if-lez v4, :cond_1 */
				 /* .line 4 */
				 /* iput-wide v0, p0, Lorg/apache/log4j/helpers/FileWatchdog;->e:J */
				 /* .line 5 */
				 (( org.apache.log4j.helpers.FileWatchdog ) p0 ).b ( ); // invoke-virtual {p0}, Lorg/apache/log4j/helpers/FileWatchdog;->b()V
				 int v0 = 0; // const/4 v0, 0x0
				 /* .line 6 */
				 /* iput-boolean v0, p0, Lorg/apache/log4j/helpers/FileWatchdog;->f:Z */
				 /* .line 7 */
			 } // :cond_0
			 /* iget-boolean v1, p0, Lorg/apache/log4j/helpers/FileWatchdog;->f:Z */
			 /* if-nez v1, :cond_1 */
			 /* .line 8 */
			 /* new-instance v1, Ljava/lang/StringBuffer; */
			 /* invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V */
			 final String v2 = "["; // const-string v2, "["
			 (( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
			 v2 = this.b;
			 (( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
			 final String v2 = "] does not exist."; // const-string v2, "] does not exist."
			 (( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
			 (( java.lang.StringBuffer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
			 org.apache.log4j.helpers.LogLog .debug ( v1 );
			 /* .line 9 */
			 /* iput-boolean v0, p0, Lorg/apache/log4j/helpers/FileWatchdog;->f:Z */
		 } // :cond_1
	 } // :goto_0
	 return;
	 /* .line 10 */
	 /* :catch_0 */
	 /* new-instance v1, Ljava/lang/StringBuffer; */
	 /* invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V */
	 final String v2 = "Was not allowed to read check file existance, file:["; // const-string v2, "Was not allowed to read check file existance, file:["
	 (( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 v2 = this.b;
	 (( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 final String v2 = "]."; // const-string v2, "]."
	 (( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 (( java.lang.StringBuffer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
	 org.apache.log4j.helpers.LogLog .warn ( v1 );
	 /* .line 11 */
	 /* iput-boolean v0, p0, Lorg/apache/log4j/helpers/FileWatchdog;->g:Z */
	 return;
} // .end method
public abstract void b ( ) {
} // .end method
public void run ( ) {
	 /* .locals 2 */
	 /* .line 1 */
} // :goto_0
/* iget-boolean v0, p0, Lorg/apache/log4j/helpers/FileWatchdog;->g:Z */
/* if-nez v0, :cond_0 */
/* .line 2 */
try { // :try_start_0
	 /* iget-wide v0, p0, Lorg/apache/log4j/helpers/FileWatchdog;->c:J */
	 java.lang.Thread .sleep ( v0,v1 );
	 /* :try_end_0 */
	 /* .catch Ljava/lang/InterruptedException; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* .line 3 */
	 /* :catch_0 */
	 (( org.apache.log4j.helpers.FileWatchdog ) p0 ).a ( ); // invoke-virtual {p0}, Lorg/apache/log4j/helpers/FileWatchdog;->a()V
} // :cond_0
return;
} // .end method
public void setDelay ( Long p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput-wide p1, p0, Lorg/apache/log4j/helpers/FileWatchdog;->c:J */
return;
} // .end method
