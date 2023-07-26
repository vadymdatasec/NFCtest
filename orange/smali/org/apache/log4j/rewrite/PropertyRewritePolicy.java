public class org.apache.log4j.rewrite.PropertyRewritePolicy implements org.apache.log4j.rewrite.RewritePolicy {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public java.util.Map a;
	 /* # direct methods */
	 public org.apache.log4j.rewrite.PropertyRewritePolicy ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 v0 = java.util.Collections.EMPTY_MAP;
		 this.a = v0;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public org.apache.log4j.spi.LoggingEvent rewrite ( org.apache.log4j.spi.LoggingEvent p0 ) {
		 /* .locals 13 */
		 /* .line 1 */
		 v0 = 		 v0 = this.a;
		 /* if-nez v0, :cond_3 */
		 /* .line 2 */
		 /* new-instance v12, Ljava/util/HashMap; */
		 (( org.apache.log4j.spi.LoggingEvent ) p1 ).getProperties ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getProperties()Ljava/util/Map;
		 /* invoke-direct {v12, v0}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V */
		 /* .line 3 */
		 v0 = this.a;
		 /* .line 4 */
	 } // :cond_0
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_1
	 /* .line 5 */
	 /* check-cast v1, Ljava/util/Map$Entry; */
	 v2 = 	 /* .line 6 */
	 /* if-nez v2, :cond_0 */
	 /* .line 7 */
	 /* .line 8 */
} // :cond_1
/* new-instance v0, Lorg/apache/log4j/spi/LoggingEvent; */
(( org.apache.log4j.spi.LoggingEvent ) p1 ).getFQNOfLoggerClass ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getFQNOfLoggerClass()Ljava/lang/String;
(( org.apache.log4j.spi.LoggingEvent ) p1 ).getLogger ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getLogger()Lorg/apache/log4j/Category;
if ( v1 != null) { // if-eqz v1, :cond_2
	 (( org.apache.log4j.spi.LoggingEvent ) p1 ).getLogger ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getLogger()Lorg/apache/log4j/Category;
} // :cond_2
(( org.apache.log4j.spi.LoggingEvent ) p1 ).getLoggerName ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getLoggerName()Ljava/lang/String;
org.apache.log4j.Logger .getLogger ( v1 );
} // :goto_1
/* move-object v3, v1 */
(( org.apache.log4j.spi.LoggingEvent ) p1 ).getTimeStamp ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getTimeStamp()J
/* move-result-wide v4 */
(( org.apache.log4j.spi.LoggingEvent ) p1 ).getLevel ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getLevel()Lorg/apache/log4j/Level;
(( org.apache.log4j.spi.LoggingEvent ) p1 ).getMessage ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getMessage()Ljava/lang/Object;
(( org.apache.log4j.spi.LoggingEvent ) p1 ).getThreadName ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getThreadName()Ljava/lang/String;
(( org.apache.log4j.spi.LoggingEvent ) p1 ).getThrowableInformation ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getThrowableInformation()Lorg/apache/log4j/spi/ThrowableInformation;
(( org.apache.log4j.spi.LoggingEvent ) p1 ).getNDC ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getNDC()Ljava/lang/String;
(( org.apache.log4j.spi.LoggingEvent ) p1 ).getLocationInformation ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getLocationInformation()Lorg/apache/log4j/spi/LocationInfo;
/* move-object v1, v0 */
/* invoke-direct/range {v1 ..v12}, Lorg/apache/log4j/spi/LoggingEvent;-><init>(Ljava/lang/String;Lorg/apache/log4j/Category;JLorg/apache/log4j/Level;Ljava/lang/Object;Ljava/lang/String;Lorg/apache/log4j/spi/ThrowableInformation;Ljava/lang/String;Lorg/apache/log4j/spi/LocationInfo;Ljava/util/Map;)V */
} // :cond_3
} // .end method
public void setProperties ( java.lang.String p0 ) {
/* .locals 4 */
/* .line 1 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
/* .line 2 */
/* new-instance v1, Ljava/util/StringTokenizer; */
final String v2 = ","; // const-string v2, ","
/* invoke-direct {v1, p1, v2}, Ljava/util/StringTokenizer;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
/* .line 3 */
} // :goto_0
p1 = (( java.util.StringTokenizer ) v1 ).hasMoreTokens ( ); // invoke-virtual {v1}, Ljava/util/StringTokenizer;->hasMoreTokens()Z
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 4 */
/* new-instance p1, Ljava/util/StringTokenizer; */
(( java.util.StringTokenizer ) v1 ).nextToken ( ); // invoke-virtual {v1}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;
final String v3 = "="; // const-string v3, "="
/* invoke-direct {p1, v2, v3}, Ljava/util/StringTokenizer;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
/* .line 5 */
(( java.util.StringTokenizer ) p1 ).nextElement ( ); // invoke-virtual {p1}, Ljava/util/StringTokenizer;->nextElement()Ljava/lang/Object;
(( java.lang.Object ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;
(( java.lang.String ) v2 ).trim ( ); // invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;
(( java.util.StringTokenizer ) p1 ).nextElement ( ); // invoke-virtual {p1}, Ljava/util/StringTokenizer;->nextElement()Ljava/lang/Object;
(( java.lang.Object ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;
(( java.lang.String ) p1 ).trim ( ); // invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;
/* .line 6 */
} // :cond_0
/* monitor-enter p0 */
/* .line 7 */
try { // :try_start_0
this.a = v0;
/* .line 8 */
/* monitor-exit p0 */
return;
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit p0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw p1 */
} // .end method
