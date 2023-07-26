public class org.apache.log4j.pattern.NameAbbreviator$e {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lorg/apache/log4j/pattern/NameAbbreviator; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x9 */
/* name = "e" */
} // .end annotation
/* # instance fields */
public final Integer a;
public final Object b;
/* # direct methods */
public org.apache.log4j.pattern.NameAbbreviator$e ( ) {
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
/* iput p1, p0, Lorg/apache/log4j/pattern/NameAbbreviator$e;->a:I */
/* .line 3 */
/* iput-char p2, p0, Lorg/apache/log4j/pattern/NameAbbreviator$e;->b:C */
return;
} // .end method
/* # virtual methods */
public Integer a ( java.lang.StringBuffer p0, Integer p1 ) {
/* .locals 3 */
/* .line 1 */
(( java.lang.StringBuffer ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
final String v1 = "."; // const-string v1, "."
v0 = (( java.lang.String ) v0 ).indexOf ( v1, p2 ); // invoke-virtual {v0, v1, p2}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I
int v1 = -1; // const/4 v1, -0x1
/* if-eq v0, v1, :cond_1 */
/* sub-int v1, v0, p2 */
/* .line 2 */
/* iget v2, p0, Lorg/apache/log4j/pattern/NameAbbreviator$e;->a:I */
/* if-le v1, v2, :cond_0 */
/* add-int/2addr v2, p2 */
/* .line 3 */
(( java.lang.StringBuffer ) p1 ).delete ( v2, v0 ); // invoke-virtual {p1, v2, v0}, Ljava/lang/StringBuffer;->delete(II)Ljava/lang/StringBuffer;
/* .line 4 */
/* iget v0, p0, Lorg/apache/log4j/pattern/NameAbbreviator$e;->a:I */
/* add-int/2addr v0, p2 */
/* .line 5 */
/* iget-char p2, p0, Lorg/apache/log4j/pattern/NameAbbreviator$e;->b:C */
if ( p2 != null) { // if-eqz p2, :cond_0
	 /* .line 6 */
	 (( java.lang.StringBuffer ) p1 ).insert ( v0, p2 ); // invoke-virtual {p1, v0, p2}, Ljava/lang/StringBuffer;->insert(IC)Ljava/lang/StringBuffer;
	 /* add-int/lit8 v0, v0, 0x1 */
} // :cond_0
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_1
} // .end method
