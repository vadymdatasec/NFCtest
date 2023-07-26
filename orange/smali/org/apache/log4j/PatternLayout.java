public class org.apache.log4j.PatternLayout extends org.apache.log4j.Layout {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final java.lang.String DEFAULT_CONVERSION_PATTERN;
	 public static final java.lang.String TTCC_CONVERSION_PATTERN;
	 /* # instance fields */
	 public java.lang.StringBuffer a;
	 public java.lang.String b;
	 public org.apache.log4j.helpers.PatternConverter c;
	 /* # direct methods */
	 public org.apache.log4j.PatternLayout ( ) {
		 /* .locals 1 */
		 final String v0 = "%m%n"; // const-string v0, "%m%n"
		 /* .line 1 */
		 /* invoke-direct {p0, v0}, Lorg/apache/log4j/PatternLayout;-><init>(Ljava/lang/String;)V */
		 return;
	 } // .end method
	 public org.apache.log4j.PatternLayout ( ) {
		 /* .locals 2 */
		 /* .line 2 */
		 /* invoke-direct {p0}, Lorg/apache/log4j/Layout;-><init>()V */
		 /* .line 3 */
		 /* new-instance v0, Ljava/lang/StringBuffer; */
		 /* const/16 v1, 0x100 */
		 /* invoke-direct {v0, v1}, Ljava/lang/StringBuffer;-><init>(I)V */
		 this.a = v0;
		 /* .line 4 */
		 this.b = p1;
		 /* if-nez p1, :cond_0 */
		 final String p1 = "%m%n"; // const-string p1, "%m%n"
		 /* .line 5 */
	 } // :cond_0
	 (( org.apache.log4j.PatternLayout ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/log4j/PatternLayout;->a(Ljava/lang/String;)Lorg/apache/log4j/helpers/PatternParser;
	 (( org.apache.log4j.helpers.PatternParser ) p1 ).parse ( ); // invoke-virtual {p1}, Lorg/apache/log4j/helpers/PatternParser;->parse()Lorg/apache/log4j/helpers/PatternConverter;
	 this.c = p1;
	 return;
} // .end method
/* # virtual methods */
public org.apache.log4j.helpers.PatternParser a ( java.lang.String p0 ) {
	 /* .locals 1 */
	 /* .line 1 */
	 /* new-instance v0, Lorg/apache/log4j/helpers/PatternParser; */
	 /* invoke-direct {v0, p1}, Lorg/apache/log4j/helpers/PatternParser;-><init>(Ljava/lang/String;)V */
} // .end method
public void activateOptions ( ) {
	 /* .locals 0 */
	 return;
} // .end method
public java.lang.String format ( org.apache.log4j.spi.LoggingEvent p0 ) {
	 /* .locals 2 */
	 /* .line 1 */
	 v0 = this.a;
	 v0 = 	 (( java.lang.StringBuffer ) v0 ).capacity ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->capacity()I
	 /* const/16 v1, 0x400 */
	 /* if-le v0, v1, :cond_0 */
	 /* .line 2 */
	 /* new-instance v0, Ljava/lang/StringBuffer; */
	 /* const/16 v1, 0x100 */
	 /* invoke-direct {v0, v1}, Ljava/lang/StringBuffer;-><init>(I)V */
	 this.a = v0;
	 /* .line 3 */
} // :cond_0
v0 = this.a;
int v1 = 0; // const/4 v1, 0x0
(( java.lang.StringBuffer ) v0 ).setLength ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->setLength(I)V
/* .line 4 */
} // :goto_0
v0 = this.c;
} // :goto_1
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 5 */
v1 = this.a;
(( org.apache.log4j.helpers.PatternConverter ) v0 ).format ( v1, p1 ); // invoke-virtual {v0, v1, p1}, Lorg/apache/log4j/helpers/PatternConverter;->format(Ljava/lang/StringBuffer;Lorg/apache/log4j/spi/LoggingEvent;)V
/* .line 6 */
v0 = this.next;
/* .line 7 */
} // :cond_1
p1 = this.a;
(( java.lang.StringBuffer ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
} // .end method
public java.lang.String getConversionPattern ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
} // .end method
public Boolean ignoresThrowable ( ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
} // .end method
public void setConversionPattern ( java.lang.String p0 ) {
/* .locals 0 */
/* .line 1 */
this.b = p1;
/* .line 2 */
(( org.apache.log4j.PatternLayout ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/log4j/PatternLayout;->a(Ljava/lang/String;)Lorg/apache/log4j/helpers/PatternParser;
(( org.apache.log4j.helpers.PatternParser ) p1 ).parse ( ); // invoke-virtual {p1}, Lorg/apache/log4j/helpers/PatternParser;->parse()Lorg/apache/log4j/helpers/PatternConverter;
this.c = p1;
return;
} // .end method
