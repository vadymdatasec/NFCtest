public abstract class org.apache.log4j.helpers.PatternParser$h extends org.apache.log4j.helpers.PatternConverter {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lorg/apache/log4j/helpers/PatternParser; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x409 */
/* name = "h" */
} // .end annotation
/* # instance fields */
public Integer e;
/* # direct methods */
public org.apache.log4j.helpers.PatternParser$h ( ) {
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0, p1}, Lorg/apache/log4j/helpers/PatternConverter;-><init>(Lorg/apache/log4j/helpers/FormattingInfo;)V */
/* .line 2 */
/* iput p2, p0, Lorg/apache/log4j/helpers/PatternParser$h;->e:I */
return;
} // .end method
/* # virtual methods */
public java.lang.String a ( org.apache.log4j.spi.LoggingEvent p0 ) {
/* .locals 4 */
/* .line 1 */
(( org.apache.log4j.helpers.PatternParser$h ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/log4j/helpers/PatternParser$h;->b(Lorg/apache/log4j/spi/LoggingEvent;)Ljava/lang/String;
/* .line 2 */
/* iget v0, p0, Lorg/apache/log4j/helpers/PatternParser$h;->e:I */
/* if-gtz v0, :cond_0 */
/* .line 3 */
} // :cond_0
v0 = (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
/* add-int/lit8 v1, v0, -0x1 */
/* .line 4 */
/* iget v2, p0, Lorg/apache/log4j/helpers/PatternParser$h;->e:I */
} // :goto_0
/* if-lez v2, :cond_2 */
/* const/16 v3, 0x2e */
/* add-int/lit8 v1, v1, -0x1 */
/* .line 5 */
v1 = (( java.lang.String ) p1 ).lastIndexOf ( v3, v1 ); // invoke-virtual {p1, v3, v1}, Ljava/lang/String;->lastIndexOf(II)I
int v3 = -1; // const/4 v3, -0x1
/* if-ne v1, v3, :cond_1 */
} // :cond_1
/* add-int/lit8 v2, v2, -0x1 */
} // :cond_2
/* add-int/lit8 v1, v1, 0x1 */
/* .line 6 */
(( java.lang.String ) p1 ).substring ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;
} // .end method
public abstract java.lang.String b ( org.apache.log4j.spi.LoggingEvent p0 ) {
} // .end method
