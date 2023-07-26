public class org.apache.log4j.EnhancedPatternLayout extends org.apache.log4j.Layout {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final java.lang.String DEFAULT_CONVERSION_PATTERN;
	 public static final java.lang.String PATTERN_RULE_REGISTRY;
	 public static final java.lang.String TTCC_CONVERSION_PATTERN;
	 /* # instance fields */
	 public org.apache.log4j.helpers.PatternConverter a;
	 public java.lang.String b;
	 public Boolean c;
	 /* # direct methods */
	 public org.apache.log4j.EnhancedPatternLayout ( ) {
		 /* .locals 1 */
		 final String v0 = "%m%n"; // const-string v0, "%m%n"
		 /* .line 1 */
		 /* invoke-direct {p0, v0}, Lorg/apache/log4j/EnhancedPatternLayout;-><init>(Ljava/lang/String;)V */
		 return;
	 } // .end method
	 public org.apache.log4j.EnhancedPatternLayout ( ) {
		 /* .locals 1 */
		 /* .line 2 */
		 /* invoke-direct {p0}, Lorg/apache/log4j/Layout;-><init>()V */
		 /* .line 3 */
		 this.b = p1;
		 /* if-nez p1, :cond_0 */
		 final String p1 = "%m%n"; // const-string p1, "%m%n"
		 /* .line 4 */
	 } // :cond_0
	 (( org.apache.log4j.EnhancedPatternLayout ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/log4j/EnhancedPatternLayout;->a(Ljava/lang/String;)Lorg/apache/log4j/helpers/PatternParser;
	 (( org.apache.log4j.helpers.PatternParser ) p1 ).parse ( ); // invoke-virtual {p1}, Lorg/apache/log4j/helpers/PatternParser;->parse()Lorg/apache/log4j/helpers/PatternConverter;
	 this.a = p1;
	 /* .line 5 */
	 /* instance-of v0, p1, Lorg/apache/log4j/pattern/BridgePatternConverter; */
	 if ( v0 != null) { // if-eqz v0, :cond_1
		 /* .line 6 */
		 /* check-cast p1, Lorg/apache/log4j/pattern/BridgePatternConverter; */
		 p1 = 		 (( org.apache.log4j.pattern.BridgePatternConverter ) p1 ).ignoresThrowable ( ); // invoke-virtual {p1}, Lorg/apache/log4j/pattern/BridgePatternConverter;->ignoresThrowable()Z
		 /* xor-int/lit8 p1, p1, 0x1 */
		 /* iput-boolean p1, p0, Lorg/apache/log4j/EnhancedPatternLayout;->c:Z */
	 } // :cond_1
	 int p1 = 0; // const/4 p1, 0x0
	 /* .line 7 */
	 /* iput-boolean p1, p0, Lorg/apache/log4j/EnhancedPatternLayout;->c:Z */
} // :goto_0
return;
} // .end method
/* # virtual methods */
public org.apache.log4j.helpers.PatternParser a ( java.lang.String p0 ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Lorg/apache/log4j/pattern/BridgePatternParser; */
/* invoke-direct {v0, p1}, Lorg/apache/log4j/pattern/BridgePatternParser;-><init>(Ljava/lang/String;)V */
} // .end method
public void activateOptions ( ) {
/* .locals 0 */
return;
} // .end method
public java.lang.String format ( org.apache.log4j.spi.LoggingEvent p0 ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Ljava/lang/StringBuffer; */
/* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
/* .line 2 */
v1 = this.a;
} // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 3 */
(( org.apache.log4j.helpers.PatternConverter ) v1 ).format ( v0, p1 ); // invoke-virtual {v1, v0, p1}, Lorg/apache/log4j/helpers/PatternConverter;->format(Ljava/lang/StringBuffer;Lorg/apache/log4j/spi/LoggingEvent;)V
/* .line 4 */
v1 = this.next;
/* .line 5 */
} // :cond_0
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
} // .end method
public java.lang.String getConversionPattern ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
} // .end method
public Boolean ignoresThrowable ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Lorg/apache/log4j/EnhancedPatternLayout;->c:Z */
/* xor-int/lit8 v0, v0, 0x1 */
} // .end method
public void setConversionPattern ( java.lang.String p0 ) {
/* .locals 1 */
/* .line 1 */
org.apache.log4j.helpers.OptionConverter .convertSpecialChars ( p1 );
this.b = p1;
/* .line 2 */
(( org.apache.log4j.EnhancedPatternLayout ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/log4j/EnhancedPatternLayout;->a(Ljava/lang/String;)Lorg/apache/log4j/helpers/PatternParser;
(( org.apache.log4j.helpers.PatternParser ) p1 ).parse ( ); // invoke-virtual {p1}, Lorg/apache/log4j/helpers/PatternParser;->parse()Lorg/apache/log4j/helpers/PatternConverter;
this.a = p1;
/* .line 3 */
/* instance-of v0, p1, Lorg/apache/log4j/pattern/BridgePatternConverter; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 4 */
/* check-cast p1, Lorg/apache/log4j/pattern/BridgePatternConverter; */
p1 = (( org.apache.log4j.pattern.BridgePatternConverter ) p1 ).ignoresThrowable ( ); // invoke-virtual {p1}, Lorg/apache/log4j/pattern/BridgePatternConverter;->ignoresThrowable()Z
/* xor-int/lit8 p1, p1, 0x1 */
/* iput-boolean p1, p0, Lorg/apache/log4j/EnhancedPatternLayout;->c:Z */
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
/* .line 5 */
/* iput-boolean p1, p0, Lorg/apache/log4j/EnhancedPatternLayout;->c:Z */
} // :goto_0
return;
} // .end method
