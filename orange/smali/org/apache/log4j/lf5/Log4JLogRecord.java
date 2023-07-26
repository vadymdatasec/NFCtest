public class org.apache.log4j.lf5.Log4JLogRecord extends org.apache.log4j.lf5.LogRecord {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public org.apache.log4j.lf5.Log4JLogRecord ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Lorg/apache/log4j/lf5/LogRecord;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Boolean isSevereLevel ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 v0 = org.apache.log4j.lf5.LogLevel.ERROR;
		 (( org.apache.log4j.lf5.LogRecord ) p0 ).getLevel ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/LogRecord;->getLevel()Lorg/apache/log4j/lf5/LogLevel;
		 v0 = 		 (( org.apache.log4j.lf5.LogLevel ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Lorg/apache/log4j/lf5/LogLevel;->equals(Ljava/lang/Object;)Z
		 /* if-nez v0, :cond_1 */
		 v0 = org.apache.log4j.lf5.LogLevel.FATAL;
		 (( org.apache.log4j.lf5.LogRecord ) p0 ).getLevel ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/LogRecord;->getLevel()Lorg/apache/log4j/lf5/LogLevel;
		 v0 = 		 (( org.apache.log4j.lf5.LogLevel ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Lorg/apache/log4j/lf5/LogLevel;->equals(Ljava/lang/Object;)Z
		 if ( v0 != null) { // if-eqz v0, :cond_0
		 } // :cond_0
		 int v0 = 0; // const/4 v0, 0x0
	 } // :cond_1
} // :goto_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_1
} // .end method
public void setThrownStackTrace ( org.apache.log4j.spi.ThrowableInformation p0 ) {
/* .locals 4 */
/* .line 1 */
(( org.apache.log4j.spi.ThrowableInformation ) p1 ).getThrowableStrRep ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/ThrowableInformation;->getThrowableStrRep()[Ljava/lang/String;
/* .line 2 */
/* new-instance v0, Ljava/lang/StringBuffer; */
/* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
int v1 = 0; // const/4 v1, 0x0
/* .line 3 */
} // :goto_0
/* array-length v2, p1 */
/* if-ge v1, v2, :cond_0 */
/* .line 4 */
/* new-instance v2, Ljava/lang/StringBuffer; */
/* invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V */
/* aget-object v3, p1, v1 */
(( java.lang.StringBuffer ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v3 = "\n"; // const-string v3, "\n"
(( java.lang.StringBuffer ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
/* .line 5 */
(( java.lang.StringBuffer ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* add-int/lit8 v1, v1, 0x1 */
/* .line 6 */
} // :cond_0
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
this.h = p1;
return;
} // .end method
