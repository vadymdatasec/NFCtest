public class org.apache.log4j.helpers.PatternParser$c extends org.apache.log4j.helpers.PatternParser$h {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lorg/apache/log4j/helpers/PatternParser; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x1 */
/* name = "c" */
} // .end annotation
/* # direct methods */
public org.apache.log4j.helpers.PatternParser$c ( ) {
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0, p2, p3}, Lorg/apache/log4j/helpers/PatternParser$h;-><init>(Lorg/apache/log4j/helpers/FormattingInfo;I)V */
return;
} // .end method
/* # virtual methods */
public java.lang.String b ( org.apache.log4j.spi.LoggingEvent p0 ) {
/* .locals 0 */
/* .line 1 */
(( org.apache.log4j.spi.LoggingEvent ) p1 ).getLocationInformation ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getLocationInformation()Lorg/apache/log4j/spi/LocationInfo;
(( org.apache.log4j.spi.LocationInfo ) p1 ).getClassName ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LocationInfo;->getClassName()Ljava/lang/String;
} // .end method
