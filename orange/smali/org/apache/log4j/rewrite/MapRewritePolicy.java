public class org.apache.log4j.rewrite.MapRewritePolicy implements org.apache.log4j.rewrite.RewritePolicy {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # direct methods */
	 public org.apache.log4j.rewrite.MapRewritePolicy ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public org.apache.log4j.spi.LoggingEvent rewrite ( org.apache.log4j.spi.LoggingEvent p0 ) {
		 /* .locals 14 */
		 /* .line 1 */
		 (( org.apache.log4j.spi.LoggingEvent ) p1 ).getMessage ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getMessage()Ljava/lang/Object;
		 /* .line 2 */
		 /* instance-of v1, v0, Ljava/util/Map; */
		 if ( v1 != null) { // if-eqz v1, :cond_4
			 /* .line 3 */
			 /* new-instance v13, Ljava/util/HashMap; */
			 (( org.apache.log4j.spi.LoggingEvent ) p1 ).getProperties ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getProperties()Ljava/util/Map;
			 /* invoke-direct {v13, v1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V */
			 /* .line 4 */
			 /* move-object v1, v0 */
			 /* check-cast v1, Ljava/util/Map; */
			 final String v2 = "message"; // const-string v2, "message"
			 /* .line 5 */
			 /* if-nez v3, :cond_0 */
			 /* move-object v8, v0 */
		 } // :cond_0
		 /* move-object v8, v3 */
		 /* .line 6 */
	 } // :goto_0
	 /* .line 7 */
} // :cond_1
v1 = } // :goto_1
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 8 */
/* check-cast v1, Ljava/util/Map$Entry; */
/* .line 9 */
v3 = (( java.lang.String ) v2 ).equals ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v3, :cond_1 */
/* .line 10 */
/* .line 11 */
} // :cond_2
/* new-instance v0, Lorg/apache/log4j/spi/LoggingEvent; */
(( org.apache.log4j.spi.LoggingEvent ) p1 ).getFQNOfLoggerClass ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getFQNOfLoggerClass()Ljava/lang/String;
(( org.apache.log4j.spi.LoggingEvent ) p1 ).getLogger ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getLogger()Lorg/apache/log4j/Category;
if ( v1 != null) { // if-eqz v1, :cond_3
(( org.apache.log4j.spi.LoggingEvent ) p1 ).getLogger ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getLogger()Lorg/apache/log4j/Category;
} // :cond_3
(( org.apache.log4j.spi.LoggingEvent ) p1 ).getLoggerName ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getLoggerName()Ljava/lang/String;
org.apache.log4j.Logger .getLogger ( v1 );
} // :goto_2
/* move-object v4, v1 */
(( org.apache.log4j.spi.LoggingEvent ) p1 ).getTimeStamp ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getTimeStamp()J
/* move-result-wide v5 */
(( org.apache.log4j.spi.LoggingEvent ) p1 ).getLevel ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getLevel()Lorg/apache/log4j/Level;
(( org.apache.log4j.spi.LoggingEvent ) p1 ).getThreadName ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getThreadName()Ljava/lang/String;
(( org.apache.log4j.spi.LoggingEvent ) p1 ).getThrowableInformation ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getThrowableInformation()Lorg/apache/log4j/spi/ThrowableInformation;
(( org.apache.log4j.spi.LoggingEvent ) p1 ).getNDC ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getNDC()Ljava/lang/String;
(( org.apache.log4j.spi.LoggingEvent ) p1 ).getLocationInformation ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getLocationInformation()Lorg/apache/log4j/spi/LocationInfo;
/* move-object v2, v0 */
/* invoke-direct/range {v2 ..v13}, Lorg/apache/log4j/spi/LoggingEvent;-><init>(Ljava/lang/String;Lorg/apache/log4j/Category;JLorg/apache/log4j/Level;Ljava/lang/Object;Ljava/lang/String;Lorg/apache/log4j/spi/ThrowableInformation;Ljava/lang/String;Lorg/apache/log4j/spi/LocationInfo;Ljava/util/Map;)V */
} // :cond_4
} // .end method
