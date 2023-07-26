public abstract class org.apache.log4j.pattern.NamePatternConverter extends org.apache.log4j.pattern.LoggingEventPatternConverter {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final org.apache.log4j.pattern.NameAbbreviator c;
	 /* # direct methods */
	 public org.apache.log4j.pattern.NamePatternConverter ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0, p1, p2}, Lorg/apache/log4j/pattern/LoggingEventPatternConverter;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
		 if ( p3 != null) { // if-eqz p3, :cond_0
			 /* .line 2 */
			 /* array-length p1, p3 */
			 /* if-lez p1, :cond_0 */
			 int p1 = 0; // const/4 p1, 0x0
			 /* .line 3 */
			 /* aget-object p1, p3, p1 */
			 org.apache.log4j.pattern.NameAbbreviator .getAbbreviator ( p1 );
			 this.c = p1;
			 /* .line 4 */
		 } // :cond_0
		 org.apache.log4j.pattern.NameAbbreviator .getDefaultAbbreviator ( );
		 this.c = p1;
	 } // :goto_0
	 return;
} // .end method
/* # virtual methods */
public final void a ( Integer p0, java.lang.StringBuffer p1 ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = this.c;
	 (( org.apache.log4j.pattern.NameAbbreviator ) v0 ).abbreviate ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lorg/apache/log4j/pattern/NameAbbreviator;->abbreviate(ILjava/lang/StringBuffer;)V
	 return;
} // .end method
