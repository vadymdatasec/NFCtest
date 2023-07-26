public class org.apache.log4j.helpers.PatternParser$e extends org.apache.log4j.helpers.PatternConverter {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lorg/apache/log4j/helpers/PatternParser; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x9 */
/* name = "e" */
} // .end annotation
/* # instance fields */
public java.lang.String e;
/* # direct methods */
public org.apache.log4j.helpers.PatternParser$e ( ) {
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0}, Lorg/apache/log4j/helpers/PatternConverter;-><init>()V */
/* .line 2 */
this.e = p1;
return;
} // .end method
/* # virtual methods */
public java.lang.String a ( org.apache.log4j.spi.LoggingEvent p0 ) {
/* .locals 0 */
/* .line 1 */
p1 = this.e;
} // .end method
public final void format ( java.lang.StringBuffer p0, org.apache.log4j.spi.LoggingEvent p1 ) {
/* .locals 0 */
/* .line 1 */
p2 = this.e;
(( java.lang.StringBuffer ) p1 ).append ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
return;
} // .end method
