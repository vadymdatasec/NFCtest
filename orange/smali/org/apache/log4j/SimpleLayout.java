public class org.apache.log4j.SimpleLayout extends org.apache.log4j.Layout {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public java.lang.StringBuffer a;
	 /* # direct methods */
	 public org.apache.log4j.SimpleLayout ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Lorg/apache/log4j/Layout;-><init>()V */
		 /* .line 2 */
		 /* new-instance v0, Ljava/lang/StringBuffer; */
		 /* const/16 v1, 0x80 */
		 /* invoke-direct {v0, v1}, Ljava/lang/StringBuffer;-><init>(I)V */
		 this.a = v0;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void activateOptions ( ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 public java.lang.String format ( org.apache.log4j.spi.LoggingEvent p0 ) {
		 /* .locals 2 */
		 /* .line 1 */
		 v0 = this.a;
		 int v1 = 0; // const/4 v1, 0x0
		 (( java.lang.StringBuffer ) v0 ).setLength ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->setLength(I)V
		 /* .line 2 */
		 v0 = this.a;
		 (( org.apache.log4j.spi.LoggingEvent ) p1 ).getLevel ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getLevel()Lorg/apache/log4j/Level;
		 (( org.apache.log4j.Priority ) v1 ).toString ( ); // invoke-virtual {v1}, Lorg/apache/log4j/Priority;->toString()Ljava/lang/String;
		 (( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 /* .line 3 */
		 v0 = this.a;
		 final String v1 = " - "; // const-string v1, " - "
		 (( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 /* .line 4 */
		 v0 = this.a;
		 (( org.apache.log4j.spi.LoggingEvent ) p1 ).getRenderedMessage ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getRenderedMessage()Ljava/lang/String;
		 (( java.lang.StringBuffer ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 /* .line 5 */
		 p1 = this.a;
		 v0 = org.apache.log4j.Layout.LINE_SEP;
		 (( java.lang.StringBuffer ) p1 ).append ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 /* .line 6 */
		 p1 = this.a;
		 (( java.lang.StringBuffer ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
	 } // .end method
	 public Boolean ignoresThrowable ( ) {
		 /* .locals 1 */
		 int v0 = 1; // const/4 v0, 0x1
	 } // .end method
