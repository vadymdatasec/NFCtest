public class org.apache.log4j.xml.Log4jEntityResolver implements org.xml.sax.EntityResolver {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # direct methods */
	 public org.apache.log4j.xml.Log4jEntityResolver ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public org.xml.sax.InputSource resolveEntity ( java.lang.String p0, java.lang.String p1 ) {
		 /* .locals 1 */
		 final String v0 = "log4j.dtd"; // const-string v0, "log4j.dtd"
		 /* .line 1 */
		 p2 = 		 (( java.lang.String ) p2 ).endsWith ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
		 /* if-nez p2, :cond_1 */
		 final String p2 = "-//APACHE//DTD LOG4J 1.2//EN"; // const-string p2, "-//APACHE//DTD LOG4J 1.2//EN"
		 p1 = 		 (( java.lang.String ) p2 ).equals ( p1 ); // invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
		 if ( p1 != null) { // if-eqz p1, :cond_0
		 } // :cond_0
		 int p1 = 0; // const/4 p1, 0x0
		 /* .line 2 */
	 } // :cond_1
} // :goto_0
/* const-class p1, Lorg/apache/log4j/xml/Log4jEntityResolver; */
final String p2 = "/org/apache/log4j/xml/log4j.dtd"; // const-string p2, "/org/apache/log4j/xml/log4j.dtd"
/* .line 3 */
(( java.lang.Class ) p1 ).getResourceAsStream ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/Class;->getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;
/* if-nez p2, :cond_2 */
/* .line 4 */
/* new-instance p2, Ljava/lang/StringBuffer; */
/* invoke-direct {p2}, Ljava/lang/StringBuffer;-><init>()V */
final String v0 = "Could not find [log4j.dtd] using ["; // const-string v0, "Could not find [log4j.dtd] using ["
(( java.lang.StringBuffer ) p2 ).append ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.Class ) p1 ).getClassLoader ( ); // invoke-virtual {p1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;
(( java.lang.StringBuffer ) p2 ).append ( p1 ); // invoke-virtual {p2, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;
final String p1 = "] class loader, parsed without DTD."; // const-string p1, "] class loader, parsed without DTD."
(( java.lang.StringBuffer ) p2 ).append ( p1 ); // invoke-virtual {p2, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .warn ( p1 );
/* .line 5 */
/* new-instance p2, Ljava/io/ByteArrayInputStream; */
int p1 = 0; // const/4 p1, 0x0
/* new-array p1, p1, [B */
/* invoke-direct {p2, p1}, Ljava/io/ByteArrayInputStream;-><init>([B)V */
/* .line 6 */
} // :cond_2
/* new-instance p1, Lorg/xml/sax/InputSource; */
/* invoke-direct {p1, p2}, Lorg/xml/sax/InputSource;-><init>(Ljava/io/InputStream;)V */
} // .end method
