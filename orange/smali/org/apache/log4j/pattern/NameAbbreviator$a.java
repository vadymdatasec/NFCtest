public class org.apache.log4j.pattern.NameAbbreviator$a extends org.apache.log4j.pattern.NameAbbreviator {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lorg/apache/log4j/pattern/NameAbbreviator; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x9 */
/* name = "a" */
} // .end annotation
/* # instance fields */
public final Integer b;
/* # direct methods */
public org.apache.log4j.pattern.NameAbbreviator$a ( ) {
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0}, Lorg/apache/log4j/pattern/NameAbbreviator;-><init>()V */
/* .line 2 */
/* iput p1, p0, Lorg/apache/log4j/pattern/NameAbbreviator$a;->b:I */
return;
} // .end method
/* # virtual methods */
public void abbreviate ( Integer p0, java.lang.StringBuffer p1 ) {
/* .locals 4 */
/* .line 1 */
/* iget v0, p0, Lorg/apache/log4j/pattern/NameAbbreviator$a;->b:I */
final String v1 = "."; // const-string v1, "."
/* .line 2 */
v2 = (( java.lang.StringBuffer ) p2 ).indexOf ( v1, p1 ); // invoke-virtual {p2, v1, p1}, Ljava/lang/StringBuffer;->indexOf(Ljava/lang/String;I)I
} // :goto_0
int v3 = -1; // const/4 v3, -0x1
/* if-eq v2, v3, :cond_1 */
/* add-int/2addr v0, v3 */
/* if-nez v0, :cond_0 */
/* add-int/lit8 v2, v2, 0x1 */
/* .line 3 */
(( java.lang.StringBuffer ) p2 ).delete ( p1, v2 ); // invoke-virtual {p2, p1, v2}, Ljava/lang/StringBuffer;->delete(II)Ljava/lang/StringBuffer;
} // :cond_0
/* add-int/lit8 v2, v2, 0x1 */
/* .line 4 */
v2 = (( java.lang.StringBuffer ) p2 ).indexOf ( v1, v2 ); // invoke-virtual {p2, v1, v2}, Ljava/lang/StringBuffer;->indexOf(Ljava/lang/String;I)I
} // :cond_1
} // :goto_1
return;
} // .end method
