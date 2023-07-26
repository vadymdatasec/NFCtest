public class org.apache.log4j.pattern.RelativeTimePatternConverter extends org.apache.log4j.pattern.LoggingEventPatternConverter {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lorg/apache/log4j/pattern/RelativeTimePatternConverter$a; */
	 /* } */
} // .end annotation
/* # instance fields */
public org.apache.log4j.pattern.RelativeTimePatternConverter$a c;
/* # direct methods */
public org.apache.log4j.pattern.RelativeTimePatternConverter ( ) {
	 /* .locals 4 */
	 final String v0 = "Time"; // const-string v0, "Time"
	 final String v1 = "time"; // const-string v1, "time"
	 /* .line 1 */
	 /* invoke-direct {p0, v0, v1}, Lorg/apache/log4j/pattern/LoggingEventPatternConverter;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
	 /* .line 2 */
	 /* new-instance v0, Lorg/apache/log4j/pattern/RelativeTimePatternConverter$a; */
	 /* const-wide/16 v1, 0x0 */
	 final String v3 = ""; // const-string v3, ""
	 /* invoke-direct {v0, v1, v2, v3}, Lorg/apache/log4j/pattern/RelativeTimePatternConverter$a;-><init>(JLjava/lang/String;)V */
	 this.c = v0;
	 return;
} // .end method
public static org.apache.log4j.pattern.RelativeTimePatternConverter newInstance ( java.lang.String[] p0 ) {
	 /* .locals 0 */
	 /* .line 1 */
	 /* new-instance p0, Lorg/apache/log4j/pattern/RelativeTimePatternConverter; */
	 /* invoke-direct {p0}, Lorg/apache/log4j/pattern/RelativeTimePatternConverter;-><init>()V */
} // .end method
/* # virtual methods */
public void format ( org.apache.log4j.spi.LoggingEvent p0, java.lang.StringBuffer p1 ) {
	 /* .locals 4 */
	 /* .line 1 */
	 /* iget-wide v0, p1, Lorg/apache/log4j/spi/LoggingEvent;->timeStamp:J */
	 /* .line 2 */
	 p1 = this.c;
	 p1 = 	 (( org.apache.log4j.pattern.RelativeTimePatternConverter$a ) p1 ).a ( v0, v1, p2 ); // invoke-virtual {p1, v0, v1, p2}, Lorg/apache/log4j/pattern/RelativeTimePatternConverter$a;->a(JLjava/lang/StringBuffer;)Z
	 /* if-nez p1, :cond_0 */
	 /* .line 3 */
	 org.apache.log4j.spi.LoggingEvent .getStartTime ( );
	 /* move-result-wide v2 */
	 /* sub-long v2, v0, v2 */
	 java.lang.Long .toString ( v2,v3 );
	 /* .line 4 */
	 (( java.lang.StringBuffer ) p2 ).append ( p1 ); // invoke-virtual {p2, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 /* .line 5 */
	 /* new-instance p2, Lorg/apache/log4j/pattern/RelativeTimePatternConverter$a; */
	 /* invoke-direct {p2, v0, v1, p1}, Lorg/apache/log4j/pattern/RelativeTimePatternConverter$a;-><init>(JLjava/lang/String;)V */
	 this.c = p2;
} // :cond_0
return;
} // .end method
