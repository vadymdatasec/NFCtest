public class org.apache.log4j.pattern.DatePatternConverter$a extends java.text.DateFormat {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lorg/apache/log4j/pattern/DatePatternConverter; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x9 */
/* name = "a" */
} // .end annotation
/* # instance fields */
public final java.text.DateFormat b;
/* # direct methods */
public org.apache.log4j.pattern.DatePatternConverter$a ( ) {
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/text/DateFormat;-><init>()V */
/* .line 2 */
this.b = p1;
return;
} // .end method
/* # virtual methods */
public java.lang.StringBuffer format ( java.util.Date p0, java.lang.StringBuffer p1, java.text.FieldPosition p2 ) {
/* .locals 2 */
/* .line 1 */
v0 = this.b;
java.util.TimeZone .getDefault ( );
(( java.text.DateFormat ) v0 ).setTimeZone ( v1 ); // invoke-virtual {v0, v1}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V
/* .line 2 */
v0 = this.b;
(( java.text.DateFormat ) v0 ).format ( p1, p2, p3 ); // invoke-virtual {v0, p1, p2, p3}, Ljava/text/DateFormat;->format(Ljava/util/Date;Ljava/lang/StringBuffer;Ljava/text/FieldPosition;)Ljava/lang/StringBuffer;
} // .end method
public java.util.Date parse ( java.lang.String p0, java.text.ParsePosition p1 ) {
/* .locals 2 */
/* .line 1 */
v0 = this.b;
java.util.TimeZone .getDefault ( );
(( java.text.DateFormat ) v0 ).setTimeZone ( v1 ); // invoke-virtual {v0, v1}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V
/* .line 2 */
v0 = this.b;
(( java.text.DateFormat ) v0 ).parse ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Ljava/text/DateFormat;->parse(Ljava/lang/String;Ljava/text/ParsePosition;)Ljava/util/Date;
} // .end method
