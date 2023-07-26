public class org.apache.log4j.pattern.NameAbbreviator$b extends org.apache.log4j.pattern.NameAbbreviator {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lorg/apache/log4j/pattern/NameAbbreviator; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x9 */
/* name = "b" */
} // .end annotation
/* # instance fields */
public final Integer b;
/* # direct methods */
public org.apache.log4j.pattern.NameAbbreviator$b ( ) {
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0}, Lorg/apache/log4j/pattern/NameAbbreviator;-><init>()V */
/* .line 2 */
/* iput p1, p0, Lorg/apache/log4j/pattern/NameAbbreviator$b;->b:I */
return;
} // .end method
/* # virtual methods */
public void abbreviate ( Integer p0, java.lang.StringBuffer p1 ) {
/* .locals 4 */
/* .line 1 */
v0 = (( java.lang.StringBuffer ) p2 ).length ( ); // invoke-virtual {p2}, Ljava/lang/StringBuffer;->length()I
/* add-int/lit8 v0, v0, -0x1 */
/* .line 2 */
(( java.lang.StringBuffer ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
/* .line 3 */
/* iget v2, p0, Lorg/apache/log4j/pattern/NameAbbreviator$b;->b:I */
} // :goto_0
/* if-lez v2, :cond_2 */
/* add-int/lit8 v0, v0, -0x1 */
final String v3 = "."; // const-string v3, "."
/* .line 4 */
v0 = (( java.lang.String ) v1 ).lastIndexOf ( v3, v0 ); // invoke-virtual {v1, v3, v0}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;I)I
int v3 = -1; // const/4 v3, -0x1
/* if-eq v0, v3, :cond_1 */
/* if-ge v0, p1, :cond_0 */
} // :cond_0
/* add-int/lit8 v2, v2, -0x1 */
} // :cond_1
} // :goto_1
return;
} // :cond_2
/* add-int/lit8 v0, v0, 0x1 */
/* .line 5 */
(( java.lang.StringBuffer ) p2 ).delete ( p1, v0 ); // invoke-virtual {p2, p1, v0}, Ljava/lang/StringBuffer;->delete(II)Ljava/lang/StringBuffer;
return;
} // .end method
