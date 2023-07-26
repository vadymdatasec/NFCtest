public class org.apache.log4j.xml.SAXErrorHandler implements org.xml.sax.ErrorHandler {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # direct methods */
	 public org.apache.log4j.xml.SAXErrorHandler ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static void a ( java.lang.String p0, org.xml.sax.SAXParseException p1 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* new-instance v0, Ljava/lang/StringBuffer; */
		 /* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
		 (( java.lang.StringBuffer ) v0 ).append ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 p0 = 		 (( org.xml.sax.SAXParseException ) p1 ).getLineNumber ( ); // invoke-virtual {p1}, Lorg/xml/sax/SAXParseException;->getLineNumber()I
		 (( java.lang.StringBuffer ) v0 ).append ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;
		 final String p0 = " and column "; // const-string p0, " and column "
		 (( java.lang.StringBuffer ) v0 ).append ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 p0 = 		 (( org.xml.sax.SAXParseException ) p1 ).getColumnNumber ( ); // invoke-virtual {p1}, Lorg/xml/sax/SAXParseException;->getColumnNumber()I
		 (( java.lang.StringBuffer ) v0 ).append ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;
		 (( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
		 org.apache.log4j.helpers.LogLog .warn ( p0 );
		 /* .line 2 */
		 (( org.xml.sax.SAXParseException ) p1 ).getMessage ( ); // invoke-virtual {p1}, Lorg/xml/sax/SAXParseException;->getMessage()Ljava/lang/String;
		 (( org.xml.sax.SAXParseException ) p1 ).getException ( ); // invoke-virtual {p1}, Lorg/xml/sax/SAXParseException;->getException()Ljava/lang/Exception;
		 org.apache.log4j.helpers.LogLog .warn ( p0,p1 );
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void error ( org.xml.sax.SAXParseException p0 ) {
		 /* .locals 1 */
		 final String v0 = "Continuable parsing error "; // const-string v0, "Continuable parsing error "
		 /* .line 1 */
		 org.apache.log4j.xml.SAXErrorHandler .a ( v0,p1 );
		 return;
	 } // .end method
	 public void fatalError ( org.xml.sax.SAXParseException p0 ) {
		 /* .locals 1 */
		 final String v0 = "Fatal parsing error "; // const-string v0, "Fatal parsing error "
		 /* .line 1 */
		 org.apache.log4j.xml.SAXErrorHandler .a ( v0,p1 );
		 return;
	 } // .end method
	 public void warning ( org.xml.sax.SAXParseException p0 ) {
		 /* .locals 1 */
		 final String v0 = "Parsing warning "; // const-string v0, "Parsing warning "
		 /* .line 1 */
		 org.apache.log4j.xml.SAXErrorHandler .a ( v0,p1 );
		 return;
	 } // .end method
