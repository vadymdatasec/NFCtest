public class m.a.b.n.d implements org.apache.log4j.xml.DOMConfigurator$a {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final java.io.Reader a; //synthetic
	 /* # direct methods */
	 public m.a.b.n.d ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.a = p2;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public org.w3c.dom.Document a ( javax.xml.parsers.DocumentBuilder p0 ) {
		 /* .locals 2 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Lorg/xml/sax/SAXException;, */
		 /* Ljava/io/IOException; */
		 /* } */
	 } // .end annotation
	 /* .line 1 */
	 /* new-instance v0, Lorg/xml/sax/InputSource; */
	 v1 = this.a;
	 /* invoke-direct {v0, v1}, Lorg/xml/sax/InputSource;-><init>(Ljava/io/Reader;)V */
	 final String v1 = "dummy://log4j.dtd"; // const-string v1, "dummy://log4j.dtd"
	 /* .line 2 */
	 (( org.xml.sax.InputSource ) v0 ).setSystemId ( v1 ); // invoke-virtual {v0, v1}, Lorg/xml/sax/InputSource;->setSystemId(Ljava/lang/String;)V
	 /* .line 3 */
	 (( javax.xml.parsers.DocumentBuilder ) p1 ).parse ( v0 ); // invoke-virtual {p1, v0}, Ljavax/xml/parsers/DocumentBuilder;->parse(Lorg/xml/sax/InputSource;)Lorg/w3c/dom/Document;
} // .end method
public java.lang.String toString ( ) {
	 /* .locals 2 */
	 /* .line 1 */
	 /* new-instance v0, Ljava/lang/StringBuffer; */
	 /* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
	 final String v1 = "reader ["; // const-string v1, "reader ["
	 (( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 v1 = this.a;
	 (( java.lang.Object ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;
	 (( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 final String v1 = "]"; // const-string v1, "]"
	 (( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 (( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
} // .end method
