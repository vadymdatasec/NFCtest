public class org.apache.log4j.helpers.PatternParser$a extends org.apache.log4j.helpers.PatternConverter {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lorg/apache/log4j/helpers/PatternParser; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x9 */
/* name = "a" */
} // .end annotation
/* # instance fields */
public Integer e;
/* # direct methods */
public org.apache.log4j.helpers.PatternParser$a ( ) {
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0, p1}, Lorg/apache/log4j/helpers/PatternConverter;-><init>(Lorg/apache/log4j/helpers/FormattingInfo;)V */
/* .line 2 */
/* iput p2, p0, Lorg/apache/log4j/helpers/PatternParser$a;->e:I */
return;
} // .end method
/* # virtual methods */
public java.lang.String a ( org.apache.log4j.spi.LoggingEvent p0 ) {
/* .locals 4 */
/* .line 1 */
/* iget v0, p0, Lorg/apache/log4j/helpers/PatternParser$a;->e:I */
/* packed-switch v0, :pswitch_data_0 */
int p1 = 0; // const/4 p1, 0x0
/* .line 2 */
/* :pswitch_0 */
(( org.apache.log4j.spi.LoggingEvent ) p1 ).getRenderedMessage ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getRenderedMessage()Ljava/lang/String;
/* .line 3 */
/* :pswitch_1 */
(( org.apache.log4j.spi.LoggingEvent ) p1 ).getNDC ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getNDC()Ljava/lang/String;
/* .line 4 */
/* :pswitch_2 */
(( org.apache.log4j.spi.LoggingEvent ) p1 ).getLevel ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getLevel()Lorg/apache/log4j/Level;
(( org.apache.log4j.Priority ) p1 ).toString ( ); // invoke-virtual {p1}, Lorg/apache/log4j/Priority;->toString()Ljava/lang/String;
/* .line 5 */
/* :pswitch_3 */
(( org.apache.log4j.spi.LoggingEvent ) p1 ).getThreadName ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getThreadName()Ljava/lang/String;
/* .line 6 */
/* :pswitch_4 */
/* iget-wide v0, p1, Lorg/apache/log4j/spi/LoggingEvent;->timeStamp:J */
org.apache.log4j.spi.LoggingEvent .getStartTime ( );
/* move-result-wide v2 */
/* sub-long/2addr v0, v2 */
java.lang.Long .toString ( v0,v1 );
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x7d0 */
/* :pswitch_4 */
/* :pswitch_3 */
/* :pswitch_2 */
/* :pswitch_1 */
/* :pswitch_0 */
} // .end packed-switch
} // .end method
