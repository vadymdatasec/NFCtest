public class m.a.b.n.b implements org.apache.log4j.xml.DOMConfigurator$a {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final java.net.URL a; //synthetic
	 /* # direct methods */
	 public m.a.b.n.b ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.a = p2;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public org.w3c.dom.Document a ( javax.xml.parsers.DocumentBuilder p0 ) {
		 /* .locals 3 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Lorg/xml/sax/SAXException;, */
		 /* Ljava/io/IOException; */
		 /* } */
	 } // .end annotation
	 /* .line 1 */
	 v0 = this.a;
	 (( java.net.URL ) v0 ).openConnection ( ); // invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;
	 int v1 = 0; // const/4 v1, 0x0
	 /* .line 2 */
	 (( java.net.URLConnection ) v0 ).setUseCaches ( v1 ); // invoke-virtual {v0, v1}, Ljava/net/URLConnection;->setUseCaches(Z)V
	 /* .line 3 */
	 (( java.net.URLConnection ) v0 ).getInputStream ( ); // invoke-virtual {v0}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;
	 /* .line 4 */
	 try { // :try_start_0
		 /* new-instance v1, Lorg/xml/sax/InputSource; */
		 /* invoke-direct {v1, v0}, Lorg/xml/sax/InputSource;-><init>(Ljava/io/InputStream;)V */
		 /* .line 5 */
		 v2 = this.a;
		 (( java.net.URL ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/net/URL;->toString()Ljava/lang/String;
		 (( org.xml.sax.InputSource ) v1 ).setSystemId ( v2 ); // invoke-virtual {v1, v2}, Lorg/xml/sax/InputSource;->setSystemId(Ljava/lang/String;)V
		 /* .line 6 */
		 (( javax.xml.parsers.DocumentBuilder ) p1 ).parse ( v1 ); // invoke-virtual {p1, v1}, Ljavax/xml/parsers/DocumentBuilder;->parse(Lorg/xml/sax/InputSource;)Lorg/w3c/dom/Document;
		 /* :try_end_0 */
		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
		 /* .line 7 */
		 (( java.io.InputStream ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/io/InputStream;->close()V
		 /* :catchall_0 */
		 /* move-exception p1 */
		 (( java.io.InputStream ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/io/InputStream;->close()V
		 /* throw p1 */
	 } // .end method
	 public java.lang.String toString ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* new-instance v0, Ljava/lang/StringBuffer; */
		 /* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
		 final String v1 = "url ["; // const-string v1, "url ["
		 (( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 v1 = this.a;
		 (( java.net.URL ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/net/URL;->toString()Ljava/lang/String;
		 (( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 final String v1 = "]"; // const-string v1, "]"
		 (( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 (( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
	 } // .end method
