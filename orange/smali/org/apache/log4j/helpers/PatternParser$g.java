public class org.apache.log4j.helpers.PatternParser$g extends org.apache.log4j.helpers.PatternConverter {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lorg/apache/log4j/helpers/PatternParser; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x9 */
/* name = "g" */
} // .end annotation
/* # instance fields */
public java.lang.String e;
/* # direct methods */
public org.apache.log4j.helpers.PatternParser$g ( ) {
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0, p1}, Lorg/apache/log4j/helpers/PatternConverter;-><init>(Lorg/apache/log4j/helpers/FormattingInfo;)V */
/* .line 2 */
this.e = p2;
return;
} // .end method
/* # virtual methods */
public java.lang.String a ( org.apache.log4j.spi.LoggingEvent p0 ) {
/* .locals 5 */
/* .line 1 */
v0 = this.e;
/* if-nez v0, :cond_1 */
/* .line 2 */
/* new-instance v0, Ljava/lang/StringBuffer; */
final String v1 = "{"; // const-string v1, "{"
/* invoke-direct {v0, v1}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V */
/* .line 3 */
(( org.apache.log4j.spi.LoggingEvent ) p1 ).getProperties ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getProperties()Ljava/util/Map;
v1 = /* .line 4 */
/* const/16 v2, 0x7d */
/* if-lez v1, :cond_0 */
/* .line 5 */
/* .line 6 */
java.util.Arrays .sort ( v1 );
int v3 = 0; // const/4 v3, 0x0
/* .line 7 */
} // :goto_0
/* array-length v4, v1 */
/* if-ge v3, v4, :cond_0 */
/* const/16 v4, 0x7b */
/* .line 8 */
(( java.lang.StringBuffer ) v0 ).append ( v4 ); // invoke-virtual {v0, v4}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
/* .line 9 */
/* aget-object v4, v1, v3 */
(( java.lang.StringBuffer ) v0 ).append ( v4 ); // invoke-virtual {v0, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;
/* const/16 v4, 0x2c */
/* .line 10 */
(( java.lang.StringBuffer ) v0 ).append ( v4 ); // invoke-virtual {v0, v4}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
/* .line 11 */
/* aget-object v4, v1, v3 */
(( java.lang.StringBuffer ) v0 ).append ( v4 ); // invoke-virtual {v0, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;
/* .line 12 */
(( java.lang.StringBuffer ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
/* add-int/lit8 v3, v3, 0x1 */
/* .line 13 */
} // :cond_0
(( java.lang.StringBuffer ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
/* .line 14 */
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
/* .line 15 */
} // :cond_1
(( org.apache.log4j.spi.LoggingEvent ) p1 ).getMDC ( v0 ); // invoke-virtual {p1, v0}, Lorg/apache/log4j/spi/LoggingEvent;->getMDC(Ljava/lang/String;)Ljava/lang/Object;
/* if-nez p1, :cond_2 */
int p1 = 0; // const/4 p1, 0x0
/* .line 16 */
} // :cond_2
(( java.lang.Object ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;
} // .end method
