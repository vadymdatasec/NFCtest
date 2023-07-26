public class org.apache.log4j.pattern.NameAbbreviator$d extends org.apache.log4j.pattern.NameAbbreviator {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lorg/apache/log4j/pattern/NameAbbreviator; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x9 */
/* name = "d" */
} // .end annotation
/* # instance fields */
public final org.apache.log4j.pattern.NameAbbreviator$e b;
/* # direct methods */
public org.apache.log4j.pattern.NameAbbreviator$d ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Lorg/apache/log4j/pattern/NameAbbreviator;-><init>()V */
v0 = /* .line 2 */
if ( v0 != null) { // if-eqz v0, :cond_0
	 v0 = 	 /* .line 3 */
	 /* new-array v0, v0, [Lorg/apache/log4j/pattern/NameAbbreviator$e; */
	 this.b = v0;
	 /* .line 4 */
	 return;
	 /* .line 5 */
} // :cond_0
/* new-instance p1, Ljava/lang/IllegalArgumentException; */
final String v0 = "fragments must have at least one element"; // const-string v0, "fragments must have at least one element"
/* invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
/* # virtual methods */
public void abbreviate ( Integer p0, java.lang.StringBuffer p1 ) {
/* .locals 2 */
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
} // :goto_0
v1 = this.b;
/* array-length v1, v1 */
/* add-int/lit8 v1, v1, -0x1 */
/* if-ge v0, v1, :cond_0 */
v1 = (( java.lang.StringBuffer ) p2 ).length ( ); // invoke-virtual {p2}, Ljava/lang/StringBuffer;->length()I
/* if-ge p1, v1, :cond_0 */
/* .line 2 */
v1 = this.b;
/* aget-object v1, v1, v0 */
p1 = (( org.apache.log4j.pattern.NameAbbreviator$e ) v1 ).a ( p2, p1 ); // invoke-virtual {v1, p2, p1}, Lorg/apache/log4j/pattern/NameAbbreviator$e;->a(Ljava/lang/StringBuffer;I)I
/* add-int/lit8 v0, v0, 0x1 */
/* .line 3 */
} // :cond_0
v0 = this.b;
/* array-length v1, v0 */
/* add-int/lit8 v1, v1, -0x1 */
/* aget-object v0, v0, v1 */
/* .line 4 */
} // :goto_1
v1 = (( java.lang.StringBuffer ) p2 ).length ( ); // invoke-virtual {p2}, Ljava/lang/StringBuffer;->length()I
/* if-ge p1, v1, :cond_1 */
/* if-ltz p1, :cond_1 */
/* .line 5 */
p1 = (( org.apache.log4j.pattern.NameAbbreviator$e ) v0 ).a ( p2, p1 ); // invoke-virtual {v0, p2, p1}, Lorg/apache/log4j/pattern/NameAbbreviator$e;->a(Ljava/lang/StringBuffer;I)I
} // :cond_1
return;
} // .end method
