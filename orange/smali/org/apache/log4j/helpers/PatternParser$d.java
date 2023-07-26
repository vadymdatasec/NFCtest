public class org.apache.log4j.helpers.PatternParser$d extends org.apache.log4j.helpers.PatternConverter {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lorg/apache/log4j/helpers/PatternParser; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x9 */
/* name = "d" */
} // .end annotation
/* # instance fields */
public java.text.DateFormat e;
public java.util.Date f;
/* # direct methods */
public org.apache.log4j.helpers.PatternParser$d ( ) {
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0, p1}, Lorg/apache/log4j/helpers/PatternConverter;-><init>(Lorg/apache/log4j/helpers/FormattingInfo;)V */
/* .line 2 */
/* new-instance p1, Ljava/util/Date; */
/* invoke-direct {p1}, Ljava/util/Date;-><init>()V */
this.f = p1;
/* .line 3 */
this.e = p2;
return;
} // .end method
/* # virtual methods */
public java.lang.String a ( org.apache.log4j.spi.LoggingEvent p0 ) {
/* .locals 3 */
/* .line 1 */
v0 = this.f;
/* iget-wide v1, p1, Lorg/apache/log4j/spi/LoggingEvent;->timeStamp:J */
(( java.util.Date ) v0 ).setTime ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/util/Date;->setTime(J)V
/* .line 2 */
try { // :try_start_0
	 p1 = this.e;
	 v0 = this.f;
	 (( java.text.DateFormat ) p1 ).format ( v0 ); // invoke-virtual {p1, v0}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;
	 /* :try_end_0 */
	 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* :catch_0 */
	 /* move-exception p1 */
	 final String v0 = "Error occured while converting date."; // const-string v0, "Error occured while converting date."
	 /* .line 3 */
	 org.apache.log4j.helpers.LogLog .error ( v0,p1 );
	 int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
