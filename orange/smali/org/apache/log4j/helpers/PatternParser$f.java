public class org.apache.log4j.helpers.PatternParser$f extends org.apache.log4j.helpers.PatternConverter {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lorg/apache/log4j/helpers/PatternParser; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x1 */
/* name = "f" */
} // .end annotation
/* # instance fields */
public Integer e;
/* # direct methods */
public org.apache.log4j.helpers.PatternParser$f ( ) {
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0, p2}, Lorg/apache/log4j/helpers/PatternConverter;-><init>(Lorg/apache/log4j/helpers/FormattingInfo;)V */
/* .line 2 */
/* iput p3, p0, Lorg/apache/log4j/helpers/PatternParser$f;->e:I */
return;
} // .end method
/* # virtual methods */
public java.lang.String a ( org.apache.log4j.spi.LoggingEvent p0 ) {
/* .locals 1 */
/* .line 1 */
(( org.apache.log4j.spi.LoggingEvent ) p1 ).getLocationInformation ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getLocationInformation()Lorg/apache/log4j/spi/LocationInfo;
/* .line 2 */
/* iget v0, p0, Lorg/apache/log4j/helpers/PatternParser$f;->e:I */
/* packed-switch v0, :pswitch_data_0 */
/* :pswitch_0 */
int p1 = 0; // const/4 p1, 0x0
/* .line 3 */
/* :pswitch_1 */
(( org.apache.log4j.spi.LocationInfo ) p1 ).getFileName ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LocationInfo;->getFileName()Ljava/lang/String;
/* .line 4 */
/* :pswitch_2 */
(( org.apache.log4j.spi.LocationInfo ) p1 ).getLineNumber ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LocationInfo;->getLineNumber()Ljava/lang/String;
/* .line 5 */
/* :pswitch_3 */
(( org.apache.log4j.spi.LocationInfo ) p1 ).getMethodName ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LocationInfo;->getMethodName()Ljava/lang/String;
/* .line 6 */
/* :pswitch_4 */
p1 = this.fullInfo;
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x3e8 */
/* :pswitch_4 */
/* :pswitch_3 */
/* :pswitch_0 */
/* :pswitch_2 */
/* :pswitch_1 */
} // .end packed-switch
} // .end method
