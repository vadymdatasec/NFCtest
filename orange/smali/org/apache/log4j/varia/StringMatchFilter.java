public class org.apache.log4j.varia.StringMatchFilter extends org.apache.log4j.spi.Filter {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final java.lang.String ACCEPT_ON_MATCH_OPTION;
	 public static final java.lang.String STRING_TO_MATCH_OPTION;
	 /* # instance fields */
	 public Boolean a;
	 public java.lang.String b;
	 /* # direct methods */
	 public org.apache.log4j.varia.StringMatchFilter ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Lorg/apache/log4j/spi/Filter;-><init>()V */
		 int v0 = 1; // const/4 v0, 0x1
		 /* .line 2 */
		 /* iput-boolean v0, p0, Lorg/apache/log4j/varia/StringMatchFilter;->a:Z */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Integer decide ( org.apache.log4j.spi.LoggingEvent p0 ) {
		 /* .locals 2 */
		 /* .line 1 */
		 (( org.apache.log4j.spi.LoggingEvent ) p1 ).getRenderedMessage ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getRenderedMessage()Ljava/lang/String;
		 int v0 = 0; // const/4 v0, 0x0
		 if ( p1 != null) { // if-eqz p1, :cond_3
			 /* .line 2 */
			 v1 = this.b;
			 /* if-nez v1, :cond_0 */
			 /* .line 3 */
		 } // :cond_0
		 p1 = 		 (( java.lang.String ) p1 ).indexOf ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
		 int v1 = -1; // const/4 v1, -0x1
		 /* if-ne p1, v1, :cond_1 */
		 /* .line 4 */
	 } // :cond_1
	 /* iget-boolean p1, p0, Lorg/apache/log4j/varia/StringMatchFilter;->a:Z */
	 if ( p1 != null) { // if-eqz p1, :cond_2
		 int p1 = 1; // const/4 p1, 0x1
	 } // :cond_2
} // :cond_3
} // :goto_0
} // .end method
public Boolean getAcceptOnMatch ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Lorg/apache/log4j/varia/StringMatchFilter;->a:Z */
} // .end method
public java.lang.String getOptionStrings ( ) {
/* .locals 2 */
final String v0 = "StringToMatch"; // const-string v0, "StringToMatch"
final String v1 = "AcceptOnMatch"; // const-string v1, "AcceptOnMatch"
/* .line 1 */
/* filled-new-array {v0, v1}, [Ljava/lang/String; */
} // .end method
public java.lang.String getStringToMatch ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
} // .end method
public void setAcceptOnMatch ( Boolean p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput-boolean p1, p0, Lorg/apache/log4j/varia/StringMatchFilter;->a:Z */
return;
} // .end method
public void setOption ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 1 */
final String v0 = "StringToMatch"; // const-string v0, "StringToMatch"
/* .line 1 */
v0 = (( java.lang.String ) p1 ).equalsIgnoreCase ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
this.b = p2;
} // :cond_0
final String v0 = "AcceptOnMatch"; // const-string v0, "AcceptOnMatch"
/* .line 3 */
p1 = (( java.lang.String ) p1 ).equalsIgnoreCase ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 4 */
/* iget-boolean p1, p0, Lorg/apache/log4j/varia/StringMatchFilter;->a:Z */
p1 = org.apache.log4j.helpers.OptionConverter .toBoolean ( p2,p1 );
/* iput-boolean p1, p0, Lorg/apache/log4j/varia/StringMatchFilter;->a:Z */
} // :cond_1
} // :goto_0
return;
} // .end method
public void setStringToMatch ( java.lang.String p0 ) {
/* .locals 0 */
/* .line 1 */
this.b = p1;
return;
} // .end method
