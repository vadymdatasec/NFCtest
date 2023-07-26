public class org.apache.log4j.xml.DOMConfigurator implements org.apache.log4j.spi.Configurator {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lorg/apache/log4j/xml/DOMConfigurator$a; */
	 /* } */
} // .end annotation
/* # static fields */
public static final java.lang.Class e;
public static java.lang.Class f; //synthetic
public static java.lang.Class g; //synthetic
public static java.lang.Class h; //synthetic
public static java.lang.Class i; //synthetic
/* # instance fields */
public java.util.Hashtable a;
public java.util.Properties b;
public org.apache.log4j.spi.LoggerRepository c;
public org.apache.log4j.spi.LoggerFactory d;
/* # direct methods */
public static org.apache.log4j.xml.DOMConfigurator ( ) {
	 /* .locals 3 */
	 int v0 = 1; // const/4 v0, 0x1
	 /* new-array v0, v0, [Ljava/lang/Class; */
	 /* .line 1 */
	 v1 = org.apache.log4j.xml.DOMConfigurator.f;
	 /* if-nez v1, :cond_0 */
	 final String v1 = "java.lang.String"; // const-string v1, "java.lang.String"
	 org.apache.log4j.xml.DOMConfigurator .b ( v1 );
} // :cond_0
int v2 = 0; // const/4 v2, 0x0
/* aput-object v1, v0, v2 */
return;
} // .end method
public org.apache.log4j.xml.DOMConfigurator ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
this.d = v0;
/* .line 3 */
/* new-instance v0, Ljava/util/Hashtable; */
/* invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V */
this.a = v0;
return;
} // .end method
public static void a ( java.lang.Object p0, org.w3c.dom.Element p1, java.util.Properties p2 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/Exception; */
/* } */
} // .end annotation
/* .line 15 */
/* instance-of v0, p0, Lorg/apache/log4j/xml/UnrecognizedElementHandler; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 16 */
p0 = /* check-cast p0, Lorg/apache/log4j/xml/UnrecognizedElementHandler; */
} // :cond_0
int p0 = 0; // const/4 p0, 0x0
} // :goto_0
/* if-nez p0, :cond_1 */
/* .line 17 */
/* new-instance p0, Ljava/lang/StringBuffer; */
/* invoke-direct {p0}, Ljava/lang/StringBuffer;-><init>()V */
final String p2 = "Unrecognized element "; // const-string p2, "Unrecognized element "
(( java.lang.StringBuffer ) p0 ).append ( p2 ); // invoke-virtual {p0, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) p0 ).append ( p1 ); // invoke-virtual {p0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) p0 ).toString ( ); // invoke-virtual {p0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .warn ( p0 );
} // :cond_1
return;
} // .end method
public static java.lang.Class b ( java.lang.String p0 ) { //synthethic
/* .locals 1 */
/* .line 1 */
try { // :try_start_0
java.lang.Class .forName ( p0 );
/* :try_end_0 */
/* .catch Ljava/lang/ClassNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p0 */
/* new-instance v0, Ljava/lang/NoClassDefFoundError; */
/* invoke-direct {v0}, Ljava/lang/NoClassDefFoundError;-><init>()V */
(( java.lang.NoClassDefFoundError ) v0 ).initCause ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/NoClassDefFoundError;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;
/* throw p0 */
} // .end method
public static void b ( java.lang.Object p0, org.w3c.dom.Element p1, java.util.Properties p2 ) {
/* .locals 0 */
/* .line 2 */
try { // :try_start_0
org.apache.log4j.xml.DOMConfigurator .a ( p0,p1,p2 );
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p0 */
/* .line 3 */
/* instance-of p1, p0, Ljava/lang/InterruptedException; */
/* if-nez p1, :cond_0 */
/* instance-of p1, p0, Ljava/io/InterruptedIOException; */
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 4 */
} // :cond_0
java.lang.Thread .currentThread ( );
(( java.lang.Thread ) p1 ).interrupt ( ); // invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V
} // :cond_1
final String p1 = "Error in extension content: "; // const-string p1, "Error in extension content: "
/* .line 5 */
org.apache.log4j.helpers.LogLog .error ( p1,p0 );
} // :goto_0
return;
} // .end method
public static void configure ( java.lang.String p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljavax/xml/parsers/FactoryConfigurationError; */
/* } */
} // .end annotation
/* .line 3 */
/* new-instance v0, Lorg/apache/log4j/xml/DOMConfigurator; */
/* invoke-direct {v0}, Lorg/apache/log4j/xml/DOMConfigurator;-><init>()V */
org.apache.log4j.LogManager .getLoggerRepository ( );
(( org.apache.log4j.xml.DOMConfigurator ) v0 ).doConfigure ( p0, v1 ); // invoke-virtual {v0, p0, v1}, Lorg/apache/log4j/xml/DOMConfigurator;->doConfigure(Ljava/lang/String;Lorg/apache/log4j/spi/LoggerRepository;)V
return;
} // .end method
public static void configure ( java.net.URL p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljavax/xml/parsers/FactoryConfigurationError; */
/* } */
} // .end annotation
/* .line 4 */
/* new-instance v0, Lorg/apache/log4j/xml/DOMConfigurator; */
/* invoke-direct {v0}, Lorg/apache/log4j/xml/DOMConfigurator;-><init>()V */
org.apache.log4j.LogManager .getLoggerRepository ( );
(( org.apache.log4j.xml.DOMConfigurator ) v0 ).doConfigure ( p0, v1 ); // invoke-virtual {v0, p0, v1}, Lorg/apache/log4j/xml/DOMConfigurator;->doConfigure(Ljava/net/URL;Lorg/apache/log4j/spi/LoggerRepository;)V
return;
} // .end method
public static void configure ( org.w3c.dom.Element p0 ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Lorg/apache/log4j/xml/DOMConfigurator; */
/* invoke-direct {v0}, Lorg/apache/log4j/xml/DOMConfigurator;-><init>()V */
/* .line 2 */
org.apache.log4j.LogManager .getLoggerRepository ( );
(( org.apache.log4j.xml.DOMConfigurator ) v0 ).doConfigure ( p0, v1 ); // invoke-virtual {v0, p0, v1}, Lorg/apache/log4j/xml/DOMConfigurator;->doConfigure(Lorg/w3c/dom/Element;Lorg/apache/log4j/spi/LoggerRepository;)V
return;
} // .end method
public static void configureAndWatch ( java.lang.String p0 ) {
/* .locals 2 */
/* const-wide/32 v0, 0xea60 */
/* .line 1 */
org.apache.log4j.xml.DOMConfigurator .configureAndWatch ( p0,v0,v1 );
return;
} // .end method
public static void configureAndWatch ( java.lang.String p0, Long p1 ) {
/* .locals 1 */
/* .line 2 */
/* new-instance v0, Lm/a/b/n/e; */
/* invoke-direct {v0, p0}, Lm/a/b/n/e;-><init>(Ljava/lang/String;)V */
/* .line 3 */
(( org.apache.log4j.helpers.FileWatchdog ) v0 ).setDelay ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lorg/apache/log4j/helpers/FileWatchdog;->setDelay(J)V
/* .line 4 */
(( java.lang.Thread ) v0 ).start ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->start()V
return;
} // .end method
public static java.lang.Object parseElement ( org.w3c.dom.Element p0, java.util.Properties p1, java.lang.Class p2 ) {
/* .locals 6 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/Exception; */
/* } */
} // .end annotation
final String v0 = "class"; // const-string v0, "class"
/* .line 1 */
org.apache.log4j.xml.DOMConfigurator .subst ( v0,p1 );
int v1 = 0; // const/4 v1, 0x0
/* .line 2 */
org.apache.log4j.helpers.OptionConverter .instantiateByClassName ( v0,p2,v1 );
if ( p2 != null) { // if-eqz p2, :cond_3
/* .line 3 */
/* new-instance v0, Lorg/apache/log4j/config/PropertySetter; */
/* invoke-direct {v0, p2}, Lorg/apache/log4j/config/PropertySetter;-><init>(Ljava/lang/Object;)V */
/* .line 4 */
v1 = /* .line 5 */
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v2, v1, :cond_2 */
/* .line 6 */
v4 = /* .line 7 */
int v5 = 1; // const/4 v5, 0x1
/* if-ne v4, v5, :cond_1 */
/* .line 8 */
/* check-cast v3, Lorg/w3c/dom/Element; */
/* .line 9 */
final String v5 = "param"; // const-string v5, "param"
/* .line 10 */
v4 = (( java.lang.String ) v4 ).equals ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v4 != null) { // if-eqz v4, :cond_0
/* .line 11 */
org.apache.log4j.xml.DOMConfigurator .setParameter ( v3,v0,p1 );
/* .line 12 */
} // :cond_0
org.apache.log4j.xml.DOMConfigurator .a ( p2,v3,p1 );
} // :cond_1
} // :goto_1
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_2
} // :cond_3
} // .end method
public static void setParameter ( org.w3c.dom.Element p0, org.apache.log4j.config.PropertySetter p1, java.util.Properties p2 ) {
/* .locals 2 */
final String v0 = "name"; // const-string v0, "name"
/* .line 1 */
org.apache.log4j.xml.DOMConfigurator .subst ( v0,p2 );
final String v1 = "value"; // const-string v1, "value"
/* .line 2 */
/* .line 3 */
org.apache.log4j.helpers.OptionConverter .convertSpecialChars ( p0 );
org.apache.log4j.xml.DOMConfigurator .subst ( p0,p2 );
/* .line 4 */
(( org.apache.log4j.config.PropertySetter ) p1 ).setProperty ( v0, p0 ); // invoke-virtual {p1, v0, p0}, Lorg/apache/log4j/config/PropertySetter;->setProperty(Ljava/lang/String;Ljava/lang/String;)V
return;
} // .end method
public static java.lang.String subst ( java.lang.String p0, java.util.Properties p1 ) {
/* .locals 1 */
/* .line 1 */
try { // :try_start_0
org.apache.log4j.helpers.OptionConverter .substVars ( p0,p1 );
/* :try_end_0 */
/* .catch Ljava/lang/IllegalArgumentException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p1 */
final String v0 = "Could not perform variable substitution."; // const-string v0, "Could not perform variable substitution."
/* .line 2 */
org.apache.log4j.helpers.LogLog .warn ( v0,p1 );
} // .end method
/* # virtual methods */
public java.lang.String a ( java.lang.String p0 ) {
/* .locals 1 */
/* .line 84 */
v0 = this.b;
org.apache.log4j.xml.DOMConfigurator .subst ( p1,v0 );
} // .end method
public org.apache.log4j.Appender a ( org.w3c.dom.Document p0, java.lang.String p1 ) {
/* .locals 5 */
/* .line 1 */
v0 = this.a;
(( java.util.Hashtable ) v0 ).get ( p2 ); // invoke-virtual {v0, p2}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Lorg/apache/log4j/Appender; */
if ( v0 != null) { // if-eqz v0, :cond_0
} // :cond_0
final String v0 = "appender"; // const-string v0, "appender"
/* .line 2 */
int v0 = 0; // const/4 v0, 0x0
/* .line 3 */
v1 = } // :goto_0
int v2 = 0; // const/4 v2, 0x0
/* if-ge v0, v1, :cond_2 */
/* .line 4 */
/* .line 5 */
final String v4 = "name"; // const-string v4, "name"
/* .line 6 */
/* .line 7 */
v3 = (( java.lang.String ) p2 ).equals ( v3 ); // invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v3 != null) { // if-eqz v3, :cond_1
/* .line 8 */
/* check-cast v1, Lorg/w3c/dom/Element; */
} // :cond_1
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_2
/* move-object v1, v2 */
} // :goto_1
/* if-nez v1, :cond_3 */
/* .line 9 */
/* new-instance p1, Ljava/lang/StringBuffer; */
/* invoke-direct {p1}, Ljava/lang/StringBuffer;-><init>()V */
final String v0 = "No appender named ["; // const-string v0, "No appender named ["
(( java.lang.StringBuffer ) p1 ).append ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) p1 ).append ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String p2 = "] could be found."; // const-string p2, "] could be found."
(( java.lang.StringBuffer ) p1 ).append ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .error ( p1 );
/* .line 10 */
} // :cond_3
(( org.apache.log4j.xml.DOMConfigurator ) p0 ).c ( v1 ); // invoke-virtual {p0, v1}, Lorg/apache/log4j/xml/DOMConfigurator;->c(Lorg/w3c/dom/Element;)Lorg/apache/log4j/Appender;
if ( p1 != null) { // if-eqz p1, :cond_4
/* .line 11 */
v0 = this.a;
(( java.util.Hashtable ) v0 ).put ( p2, p1 ); // invoke-virtual {v0, p2, p1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
} // :cond_4
} // .end method
public org.apache.log4j.Appender a ( org.w3c.dom.Element p0 ) {
/* .locals 1 */
final String v0 = "ref"; // const-string v0, "ref"
/* .line 12 */
(( org.apache.log4j.xml.DOMConfigurator ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/log4j/xml/DOMConfigurator;->a(Ljava/lang/String;)Ljava/lang/String;
/* .line 13 */
/* .line 14 */
(( org.apache.log4j.xml.DOMConfigurator ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lorg/apache/log4j/xml/DOMConfigurator;->a(Lorg/w3c/dom/Document;Ljava/lang/String;)Lorg/apache/log4j/Appender;
} // .end method
public final void a ( org.apache.log4j.xml.DOMConfigurator$a p0, org.apache.log4j.spi.LoggerRepository p1 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljavax/xml/parsers/FactoryConfigurationError; */
/* } */
} // .end annotation
/* .line 67 */
this.c = p2;
/* .line 68 */
try { // :try_start_0
/* new-instance p2, Ljava/lang/StringBuffer; */
/* invoke-direct {p2}, Ljava/lang/StringBuffer;-><init>()V */
final String v0 = "System property is :"; // const-string v0, "System property is :"
(( java.lang.StringBuffer ) p2 ).append ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v0 = "javax.xml.parsers.DocumentBuilderFactory"; // const-string v0, "javax.xml.parsers.DocumentBuilderFactory"
int v1 = 0; // const/4 v1, 0x0
org.apache.log4j.helpers.OptionConverter .getSystemProperty ( v0,v1 );
(( java.lang.StringBuffer ) p2 ).append ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .debug ( p2 );
/* .line 69 */
javax.xml.parsers.DocumentBuilderFactory .newInstance ( );
final String v0 = "Standard DocumentBuilderFactory search succeded."; // const-string v0, "Standard DocumentBuilderFactory search succeded."
/* .line 70 */
org.apache.log4j.helpers.LogLog .debug ( v0 );
/* .line 71 */
/* new-instance v0, Ljava/lang/StringBuffer; */
/* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
final String v1 = "DocumentBuilderFactory is: "; // const-string v1, "DocumentBuilderFactory is: "
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.Object ) p2 ).getClass ( ); // invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( java.lang.Class ) v1 ).getName ( ); // invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .debug ( v0 );
/* :try_end_0 */
/* .catch Ljavax/xml/parsers/FactoryConfigurationError; {:try_start_0 ..:try_end_0} :catch_1 */
int v0 = 1; // const/4 v0, 0x1
/* .line 72 */
try { // :try_start_1
(( javax.xml.parsers.DocumentBuilderFactory ) p2 ).setValidating ( v0 ); // invoke-virtual {p2, v0}, Ljavax/xml/parsers/DocumentBuilderFactory;->setValidating(Z)V
/* .line 73 */
(( javax.xml.parsers.DocumentBuilderFactory ) p2 ).newDocumentBuilder ( ); // invoke-virtual {p2}, Ljavax/xml/parsers/DocumentBuilderFactory;->newDocumentBuilder()Ljavax/xml/parsers/DocumentBuilder;
/* .line 74 */
/* new-instance v0, Lorg/apache/log4j/xml/SAXErrorHandler; */
/* invoke-direct {v0}, Lorg/apache/log4j/xml/SAXErrorHandler;-><init>()V */
(( javax.xml.parsers.DocumentBuilder ) p2 ).setErrorHandler ( v0 ); // invoke-virtual {p2, v0}, Ljavax/xml/parsers/DocumentBuilder;->setErrorHandler(Lorg/xml/sax/ErrorHandler;)V
/* .line 75 */
/* new-instance v0, Lorg/apache/log4j/xml/Log4jEntityResolver; */
/* invoke-direct {v0}, Lorg/apache/log4j/xml/Log4jEntityResolver;-><init>()V */
(( javax.xml.parsers.DocumentBuilder ) p2 ).setEntityResolver ( v0 ); // invoke-virtual {p2, v0}, Ljavax/xml/parsers/DocumentBuilder;->setEntityResolver(Lorg/xml/sax/EntityResolver;)V
/* .line 76 */
/* .line 77 */
(( org.apache.log4j.xml.DOMConfigurator ) p0 ).b ( p2 ); // invoke-virtual {p0, p2}, Lorg/apache/log4j/xml/DOMConfigurator;->b(Lorg/w3c/dom/Element;)V
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
/* :catch_0 */
/* move-exception p2 */
/* .line 78 */
/* instance-of v0, p2, Ljava/lang/InterruptedException; */
/* if-nez v0, :cond_0 */
/* instance-of v0, p2, Ljava/io/InterruptedIOException; */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 79 */
} // :cond_0
java.lang.Thread .currentThread ( );
(( java.lang.Thread ) v0 ).interrupt ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V
/* .line 80 */
} // :cond_1
/* new-instance v0, Ljava/lang/StringBuffer; */
/* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
final String v1 = "Could not parse "; // const-string v1, "Could not parse "
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.Object ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;
(( java.lang.StringBuffer ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String p1 = "."; // const-string p1, "."
(( java.lang.StringBuffer ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .error ( p1,p2 );
} // :goto_0
return;
/* :catch_1 */
/* move-exception p1 */
/* .line 81 */
(( javax.xml.parsers.FactoryConfigurationError ) p1 ).getException ( ); // invoke-virtual {p1}, Ljavax/xml/parsers/FactoryConfigurationError;->getException()Ljava/lang/Exception;
final String v0 = "Could not instantiate a DocumentBuilderFactory."; // const-string v0, "Could not instantiate a DocumentBuilderFactory."
/* .line 82 */
org.apache.log4j.helpers.LogLog .debug ( v0,p2 );
/* .line 83 */
/* throw p1 */
} // .end method
public void a ( org.w3c.dom.Element p0, org.apache.log4j.Appender p1 ) {
/* .locals 7 */
final String v0 = "class"; // const-string v0, "class"
/* .line 18 */
(( org.apache.log4j.xml.DOMConfigurator ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/log4j/xml/DOMConfigurator;->a(Ljava/lang/String;)Ljava/lang/String;
v1 = org.apache.log4j.xml.DOMConfigurator.g;
/* if-nez v1, :cond_0 */
final String v1 = "org.apache.log4j.spi.ErrorHandler"; // const-string v1, "org.apache.log4j.spi.ErrorHandler"
org.apache.log4j.xml.DOMConfigurator .b ( v1 );
} // :cond_0
int v2 = 0; // const/4 v2, 0x0
org.apache.log4j.helpers.OptionConverter .instantiateByClassName ( v0,v1,v2 );
/* check-cast v0, Lorg/apache/log4j/spi/ErrorHandler; */
if ( v0 != null) { // if-eqz v0, :cond_8
/* .line 19 */
/* .line 20 */
/* new-instance v1, Lorg/apache/log4j/config/PropertySetter; */
/* invoke-direct {v1, v0}, Lorg/apache/log4j/config/PropertySetter;-><init>(Ljava/lang/Object;)V */
/* .line 21 */
v2 = /* .line 22 */
int v3 = 0; // const/4 v3, 0x0
} // :goto_0
/* if-ge v3, v2, :cond_7 */
/* .line 23 */
v5 = /* .line 24 */
int v6 = 1; // const/4 v6, 0x1
/* if-ne v5, v6, :cond_6 */
/* .line 25 */
/* check-cast v4, Lorg/w3c/dom/Element; */
/* .line 26 */
final String v6 = "param"; // const-string v6, "param"
/* .line 27 */
v6 = (( java.lang.String ) v5 ).equals ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v6 != null) { // if-eqz v6, :cond_1
/* .line 28 */
(( org.apache.log4j.xml.DOMConfigurator ) p0 ).a ( v4, v1 ); // invoke-virtual {p0, v4, v1}, Lorg/apache/log4j/xml/DOMConfigurator;->a(Lorg/w3c/dom/Element;Lorg/apache/log4j/config/PropertySetter;)V
} // :cond_1
final String v6 = "appender-ref"; // const-string v6, "appender-ref"
/* .line 29 */
v6 = (( java.lang.String ) v5 ).equals ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v6 != null) { // if-eqz v6, :cond_2
/* .line 30 */
(( org.apache.log4j.xml.DOMConfigurator ) p0 ).a ( v4 ); // invoke-virtual {p0, v4}, Lorg/apache/log4j/xml/DOMConfigurator;->a(Lorg/w3c/dom/Element;)Lorg/apache/log4j/Appender;
} // :cond_2
final String v6 = "logger-ref"; // const-string v6, "logger-ref"
/* .line 31 */
v6 = (( java.lang.String ) v5 ).equals ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v6 != null) { // if-eqz v6, :cond_4
final String v5 = "ref"; // const-string v5, "ref"
/* .line 32 */
/* .line 33 */
v5 = this.d;
/* if-nez v5, :cond_3 */
v5 = this.c;
} // :cond_3
v6 = this.c;
/* .line 34 */
} // :goto_1
} // :cond_4
final String v6 = "root-ref"; // const-string v6, "root-ref"
/* .line 35 */
v5 = (( java.lang.String ) v5 ).equals ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v5 != null) { // if-eqz v5, :cond_5
/* .line 36 */
v4 = this.c;
/* .line 37 */
/* .line 38 */
} // :cond_5
v5 = this.b;
org.apache.log4j.xml.DOMConfigurator .b ( v0,v4,v5 );
} // :cond_6
} // :goto_2
/* add-int/lit8 v3, v3, 0x1 */
/* .line 39 */
} // :cond_7
(( org.apache.log4j.config.PropertySetter ) v1 ).activate ( ); // invoke-virtual {v1}, Lorg/apache/log4j/config/PropertySetter;->activate()V
/* .line 40 */
} // :cond_8
return;
} // .end method
public void a ( org.w3c.dom.Element p0, org.apache.log4j.Logger p1, Boolean p2 ) {
/* .locals 7 */
/* .line 41 */
/* new-instance v0, Lorg/apache/log4j/config/PropertySetter; */
/* invoke-direct {v0, p2}, Lorg/apache/log4j/config/PropertySetter;-><init>(Ljava/lang/Object;)V */
/* .line 42 */
(( org.apache.log4j.Category ) p2 ).removeAllAppenders ( ); // invoke-virtual {p2}, Lorg/apache/log4j/Category;->removeAllAppenders()V
/* .line 43 */
v1 = /* .line 44 */
int v2 = 0; // const/4 v2, 0x0
} // :goto_0
/* if-ge v2, v1, :cond_6 */
/* .line 45 */
v4 = /* .line 46 */
int v5 = 1; // const/4 v5, 0x1
/* if-ne v4, v5, :cond_5 */
/* .line 47 */
/* check-cast v3, Lorg/w3c/dom/Element; */
/* .line 48 */
final String v5 = "appender-ref"; // const-string v5, "appender-ref"
/* .line 49 */
v5 = (( java.lang.String ) v4 ).equals ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v5 != null) { // if-eqz v5, :cond_1
/* .line 50 */
(( org.apache.log4j.xml.DOMConfigurator ) p0 ).a ( v3 ); // invoke-virtual {p0, v3}, Lorg/apache/log4j/xml/DOMConfigurator;->a(Lorg/w3c/dom/Element;)Lorg/apache/log4j/Appender;
final String v5 = "ref"; // const-string v5, "ref"
/* .line 51 */
(( org.apache.log4j.xml.DOMConfigurator ) p0 ).a ( v3 ); // invoke-virtual {p0, v3}, Lorg/apache/log4j/xml/DOMConfigurator;->a(Ljava/lang/String;)Ljava/lang/String;
if ( v4 != null) { // if-eqz v4, :cond_0
/* .line 52 */
/* new-instance v5, Ljava/lang/StringBuffer; */
/* invoke-direct {v5}, Ljava/lang/StringBuffer;-><init>()V */
final String v6 = "Adding appender named ["; // const-string v6, "Adding appender named ["
(( java.lang.StringBuffer ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v5 ).append ( v3 ); // invoke-virtual {v5, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v3 = "] to category ["; // const-string v3, "] to category ["
(( java.lang.StringBuffer ) v5 ).append ( v3 ); // invoke-virtual {v5, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( org.apache.log4j.Category ) p2 ).getName ( ); // invoke-virtual {p2}, Lorg/apache/log4j/Category;->getName()Ljava/lang/String;
(( java.lang.StringBuffer ) v5 ).append ( v3 ); // invoke-virtual {v5, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v3 = "]."; // const-string v3, "]."
(( java.lang.StringBuffer ) v5 ).append ( v3 ); // invoke-virtual {v5, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .debug ( v3 );
/* .line 53 */
} // :cond_0
/* new-instance v5, Ljava/lang/StringBuffer; */
/* invoke-direct {v5}, Ljava/lang/StringBuffer;-><init>()V */
final String v6 = "Appender named ["; // const-string v6, "Appender named ["
(( java.lang.StringBuffer ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v5 ).append ( v3 ); // invoke-virtual {v5, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v3 = "] not found."; // const-string v3, "] not found."
(( java.lang.StringBuffer ) v5 ).append ( v3 ); // invoke-virtual {v5, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .debug ( v3 );
/* .line 54 */
} // :goto_1
(( org.apache.log4j.Category ) p2 ).addAppender ( v4 ); // invoke-virtual {p2, v4}, Lorg/apache/log4j/Category;->addAppender(Lorg/apache/log4j/Appender;)V
} // :cond_1
final String v5 = "level"; // const-string v5, "level"
/* .line 55 */
v5 = (( java.lang.String ) v4 ).equals ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v5 != null) { // if-eqz v5, :cond_2
/* .line 56 */
(( org.apache.log4j.xml.DOMConfigurator ) p0 ).b ( v3, p2, p3 ); // invoke-virtual {p0, v3, p2, p3}, Lorg/apache/log4j/xml/DOMConfigurator;->b(Lorg/w3c/dom/Element;Lorg/apache/log4j/Logger;Z)V
} // :cond_2
final String v5 = "priority"; // const-string v5, "priority"
/* .line 57 */
v5 = (( java.lang.String ) v4 ).equals ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v5 != null) { // if-eqz v5, :cond_3
/* .line 58 */
(( org.apache.log4j.xml.DOMConfigurator ) p0 ).b ( v3, p2, p3 ); // invoke-virtual {p0, v3, p2, p3}, Lorg/apache/log4j/xml/DOMConfigurator;->b(Lorg/w3c/dom/Element;Lorg/apache/log4j/Logger;Z)V
} // :cond_3
final String v5 = "param"; // const-string v5, "param"
/* .line 59 */
v4 = (( java.lang.String ) v4 ).equals ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v4 != null) { // if-eqz v4, :cond_4
/* .line 60 */
(( org.apache.log4j.xml.DOMConfigurator ) p0 ).a ( v3, v0 ); // invoke-virtual {p0, v3, v0}, Lorg/apache/log4j/xml/DOMConfigurator;->a(Lorg/w3c/dom/Element;Lorg/apache/log4j/config/PropertySetter;)V
/* .line 61 */
} // :cond_4
v4 = this.b;
org.apache.log4j.xml.DOMConfigurator .b ( p2,v3,v4 );
} // :cond_5
} // :goto_2
/* add-int/lit8 v2, v2, 0x1 */
/* goto/16 :goto_0 */
/* .line 62 */
} // :cond_6
(( org.apache.log4j.config.PropertySetter ) v0 ).activate ( ); // invoke-virtual {v0}, Lorg/apache/log4j/config/PropertySetter;->activate()V
return;
} // .end method
public void a ( org.w3c.dom.Element p0, org.apache.log4j.config.PropertySetter p1 ) {
/* .locals 2 */
final String v0 = "name"; // const-string v0, "name"
/* .line 63 */
(( org.apache.log4j.xml.DOMConfigurator ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/log4j/xml/DOMConfigurator;->a(Ljava/lang/String;)Ljava/lang/String;
final String v1 = "value"; // const-string v1, "value"
/* .line 64 */
/* .line 65 */
org.apache.log4j.helpers.OptionConverter .convertSpecialChars ( p1 );
(( org.apache.log4j.xml.DOMConfigurator ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/log4j/xml/DOMConfigurator;->a(Ljava/lang/String;)Ljava/lang/String;
/* .line 66 */
(( org.apache.log4j.config.PropertySetter ) p2 ).setProperty ( v0, p1 ); // invoke-virtual {p2, v0, p1}, Lorg/apache/log4j/config/PropertySetter;->setProperty(Ljava/lang/String;Ljava/lang/String;)V
return;
} // .end method
public void b ( org.w3c.dom.Element p0 ) {
/* .locals 8 */
/* .line 39 */
final String v1 = "log4j:configuration"; // const-string v1, "log4j:configuration"
/* .line 40 */
v1 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v1, :cond_1 */
final String v1 = "configuration"; // const-string v1, "configuration"
/* .line 41 */
v0 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
final String v0 = "The <configuration> element has been deprecated."; // const-string v0, "The <configuration> element has been deprecated."
/* .line 42 */
org.apache.log4j.helpers.LogLog .warn ( v0 );
final String v0 = "Use the <log4j:configuration> element instead."; // const-string v0, "Use the <log4j:configuration> element instead."
/* .line 43 */
org.apache.log4j.helpers.LogLog .warn ( v0 );
} // :cond_0
final String p1 = "DOM element is - not a <log4j:configuration> element."; // const-string p1, "DOM element is - not a <log4j:configuration> element."
/* .line 44 */
org.apache.log4j.helpers.LogLog .error ( p1 );
return;
} // :cond_1
} // :goto_0
final String v0 = "debug"; // const-string v0, "debug"
/* .line 45 */
(( org.apache.log4j.xml.DOMConfigurator ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/log4j/xml/DOMConfigurator;->a(Ljava/lang/String;)Ljava/lang/String;
/* .line 46 */
/* new-instance v1, Ljava/lang/StringBuffer; */
/* invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V */
final String v2 = "debug attribute= \""; // const-string v2, "debug attribute= \""
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v2 = "\"."; // const-string v2, "\"."
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .debug ( v1 );
final String v1 = ""; // const-string v1, ""
/* .line 47 */
v3 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
final String v4 = "null"; // const-string v4, "null"
int v5 = 1; // const/4 v5, 0x1
/* if-nez v3, :cond_2 */
v3 = (( java.lang.String ) v0 ).equals ( v4 ); // invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v3, :cond_2 */
/* .line 48 */
v0 = org.apache.log4j.helpers.OptionConverter .toBoolean ( v0,v5 );
org.apache.log4j.helpers.LogLog .setInternalDebugging ( v0 );
} // :cond_2
final String v0 = "Ignoring debug attribute."; // const-string v0, "Ignoring debug attribute."
/* .line 49 */
org.apache.log4j.helpers.LogLog .debug ( v0 );
} // :goto_1
final String v0 = "reset"; // const-string v0, "reset"
/* .line 50 */
(( org.apache.log4j.xml.DOMConfigurator ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/log4j/xml/DOMConfigurator;->a(Ljava/lang/String;)Ljava/lang/String;
/* .line 51 */
/* new-instance v3, Ljava/lang/StringBuffer; */
/* invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V */
final String v6 = "reset attribute= \""; // const-string v6, "reset attribute= \""
(( java.lang.StringBuffer ) v3 ).append ( v6 ); // invoke-virtual {v3, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v3 ).append ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .debug ( v3 );
/* .line 52 */
v3 = (( java.lang.String ) v1 ).equals ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
int v6 = 0; // const/4 v6, 0x0
/* if-nez v3, :cond_3 */
/* .line 53 */
v0 = org.apache.log4j.helpers.OptionConverter .toBoolean ( v0,v6 );
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 54 */
v0 = this.c;
} // :cond_3
final String v0 = "configDebug"; // const-string v0, "configDebug"
/* .line 55 */
(( org.apache.log4j.xml.DOMConfigurator ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/log4j/xml/DOMConfigurator;->a(Ljava/lang/String;)Ljava/lang/String;
/* .line 56 */
v3 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v3, :cond_4 */
v3 = (( java.lang.String ) v0 ).equals ( v4 ); // invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v3, :cond_4 */
final String v3 = "The \"configDebug\" attribute is deprecated."; // const-string v3, "The \"configDebug\" attribute is deprecated."
/* .line 57 */
org.apache.log4j.helpers.LogLog .warn ( v3 );
final String v3 = "Use the \"debug\" attribute instead."; // const-string v3, "Use the \"debug\" attribute instead."
/* .line 58 */
org.apache.log4j.helpers.LogLog .warn ( v3 );
/* .line 59 */
v0 = org.apache.log4j.helpers.OptionConverter .toBoolean ( v0,v5 );
org.apache.log4j.helpers.LogLog .setInternalDebugging ( v0 );
} // :cond_4
final String v0 = "threshold"; // const-string v0, "threshold"
/* .line 60 */
(( org.apache.log4j.xml.DOMConfigurator ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/log4j/xml/DOMConfigurator;->a(Ljava/lang/String;)Ljava/lang/String;
/* .line 61 */
/* new-instance v3, Ljava/lang/StringBuffer; */
/* invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V */
final String v7 = "Threshold =\""; // const-string v7, "Threshold =\""
(( java.lang.StringBuffer ) v3 ).append ( v7 ); // invoke-virtual {v3, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v3 ).append ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .debug ( v2 );
/* .line 62 */
v1 = (( java.lang.String ) v1 ).equals ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v1, :cond_5 */
v1 = (( java.lang.String ) v4 ).equals ( v0 ); // invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v1, :cond_5 */
/* .line 63 */
v1 = this.c;
/* .line 64 */
} // :cond_5
v0 = /* .line 65 */
int v1 = 0; // const/4 v1, 0x0
} // :goto_2
final String v2 = "loggerFactory"; // const-string v2, "loggerFactory"
final String v3 = "categoryFactory"; // const-string v3, "categoryFactory"
/* if-ge v1, v0, :cond_8 */
/* .line 66 */
v7 = /* .line 67 */
/* if-ne v7, v5, :cond_7 */
/* .line 68 */
/* check-cast v4, Lorg/w3c/dom/Element; */
/* .line 69 */
/* .line 70 */
v3 = (( java.lang.String ) v7 ).equals ( v3 ); // invoke-virtual {v7, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v3, :cond_6 */
v2 = (( java.lang.String ) v7 ).equals ( v2 ); // invoke-virtual {v7, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v2 != null) { // if-eqz v2, :cond_7
/* .line 71 */
} // :cond_6
(( org.apache.log4j.xml.DOMConfigurator ) p0 ).e ( v4 ); // invoke-virtual {p0, v4}, Lorg/apache/log4j/xml/DOMConfigurator;->e(Lorg/w3c/dom/Element;)V
} // :cond_7
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_8
} // :goto_3
/* if-ge v6, v0, :cond_f */
/* .line 72 */
v4 = /* .line 73 */
/* if-ne v4, v5, :cond_e */
/* .line 74 */
/* check-cast v1, Lorg/w3c/dom/Element; */
/* .line 75 */
final String v7 = "category"; // const-string v7, "category"
/* .line 76 */
v7 = (( java.lang.String ) v4 ).equals ( v7 ); // invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v7, :cond_d */
final String v7 = "logger"; // const-string v7, "logger"
v7 = (( java.lang.String ) v4 ).equals ( v7 ); // invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v7 != null) { // if-eqz v7, :cond_9
} // :cond_9
final String v7 = "root"; // const-string v7, "root"
/* .line 77 */
v7 = (( java.lang.String ) v4 ).equals ( v7 ); // invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v7 != null) { // if-eqz v7, :cond_a
/* .line 78 */
(( org.apache.log4j.xml.DOMConfigurator ) p0 ).h ( v1 ); // invoke-virtual {p0, v1}, Lorg/apache/log4j/xml/DOMConfigurator;->h(Lorg/w3c/dom/Element;)V
} // :cond_a
final String v7 = "renderer"; // const-string v7, "renderer"
/* .line 79 */
v7 = (( java.lang.String ) v4 ).equals ( v7 ); // invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v7 != null) { // if-eqz v7, :cond_b
/* .line 80 */
(( org.apache.log4j.xml.DOMConfigurator ) p0 ).g ( v1 ); // invoke-virtual {p0, v1}, Lorg/apache/log4j/xml/DOMConfigurator;->g(Lorg/w3c/dom/Element;)V
} // :cond_b
final String v7 = "throwableRenderer"; // const-string v7, "throwableRenderer"
/* .line 81 */
v7 = (( java.lang.String ) v4 ).equals ( v7 ); // invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v7 != null) { // if-eqz v7, :cond_c
/* .line 82 */
v4 = this.c;
/* instance-of v4, v4, Lorg/apache/log4j/spi/ThrowableRendererSupport; */
if ( v4 != null) { // if-eqz v4, :cond_e
/* .line 83 */
(( org.apache.log4j.xml.DOMConfigurator ) p0 ).i ( v1 ); // invoke-virtual {p0, v1}, Lorg/apache/log4j/xml/DOMConfigurator;->i(Lorg/w3c/dom/Element;)Lorg/apache/log4j/spi/ThrowableRenderer;
if ( v1 != null) { // if-eqz v1, :cond_e
/* .line 84 */
v4 = this.c;
/* check-cast v4, Lorg/apache/log4j/spi/ThrowableRendererSupport; */
} // :cond_c
final String v7 = "appender"; // const-string v7, "appender"
/* .line 85 */
v7 = (( java.lang.String ) v4 ).equals ( v7 ); // invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v7, :cond_e */
v7 = (( java.lang.String ) v4 ).equals ( v3 ); // invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v7, :cond_e */
v4 = (( java.lang.String ) v4 ).equals ( v2 ); // invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v4, :cond_e */
/* .line 86 */
v4 = this.c;
v7 = this.b;
org.apache.log4j.xml.DOMConfigurator .b ( v4,v1,v7 );
/* .line 87 */
} // :cond_d
} // :goto_4
(( org.apache.log4j.xml.DOMConfigurator ) p0 ).d ( v1 ); // invoke-virtual {p0, v1}, Lorg/apache/log4j/xml/DOMConfigurator;->d(Lorg/w3c/dom/Element;)V
} // :cond_e
} // :goto_5
/* add-int/lit8 v6, v6, 0x1 */
} // :cond_f
return;
} // .end method
public void b ( org.w3c.dom.Element p0, org.apache.log4j.Appender p1 ) {
/* .locals 7 */
final String v0 = "class"; // const-string v0, "class"
/* .line 6 */
(( org.apache.log4j.xml.DOMConfigurator ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/log4j/xml/DOMConfigurator;->a(Ljava/lang/String;)Ljava/lang/String;
/* .line 7 */
v1 = org.apache.log4j.xml.DOMConfigurator.h;
/* if-nez v1, :cond_0 */
final String v1 = "org.apache.log4j.spi.Filter"; // const-string v1, "org.apache.log4j.spi.Filter"
org.apache.log4j.xml.DOMConfigurator .b ( v1 );
} // :cond_0
int v2 = 0; // const/4 v2, 0x0
org.apache.log4j.helpers.OptionConverter .instantiateByClassName ( v0,v1,v2 );
/* check-cast v0, Lorg/apache/log4j/spi/Filter; */
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 8 */
/* new-instance v1, Lorg/apache/log4j/config/PropertySetter; */
/* invoke-direct {v1, v0}, Lorg/apache/log4j/config/PropertySetter;-><init>(Ljava/lang/Object;)V */
/* .line 9 */
v2 = /* .line 10 */
int v3 = 0; // const/4 v3, 0x0
} // :goto_0
/* if-ge v3, v2, :cond_3 */
/* .line 11 */
v5 = /* .line 12 */
int v6 = 1; // const/4 v6, 0x1
/* if-ne v5, v6, :cond_2 */
/* .line 13 */
/* check-cast v4, Lorg/w3c/dom/Element; */
/* .line 14 */
final String v6 = "param"; // const-string v6, "param"
/* .line 15 */
v5 = (( java.lang.String ) v5 ).equals ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v5 != null) { // if-eqz v5, :cond_1
/* .line 16 */
(( org.apache.log4j.xml.DOMConfigurator ) p0 ).a ( v4, v1 ); // invoke-virtual {p0, v4, v1}, Lorg/apache/log4j/xml/DOMConfigurator;->a(Lorg/w3c/dom/Element;Lorg/apache/log4j/config/PropertySetter;)V
/* .line 17 */
} // :cond_1
v5 = this.b;
org.apache.log4j.xml.DOMConfigurator .b ( v0,v4,v5 );
} // :cond_2
} // :goto_1
/* add-int/lit8 v3, v3, 0x1 */
/* .line 18 */
} // :cond_3
(( org.apache.log4j.config.PropertySetter ) v1 ).activate ( ); // invoke-virtual {v1}, Lorg/apache/log4j/config/PropertySetter;->activate()V
/* .line 19 */
/* new-instance p1, Ljava/lang/StringBuffer; */
/* invoke-direct {p1}, Ljava/lang/StringBuffer;-><init>()V */
final String v1 = "Adding filter of type ["; // const-string v1, "Adding filter of type ["
(( java.lang.StringBuffer ) p1 ).append ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.Object ) v0 ).getClass ( ); // invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( java.lang.StringBuffer ) p1 ).append ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;
final String v1 = "] to appender named ["; // const-string v1, "] to appender named ["
(( java.lang.StringBuffer ) p1 ).append ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) p1 ).append ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v1 = "]."; // const-string v1, "]."
(( java.lang.StringBuffer ) p1 ).append ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .debug ( p1 );
/* .line 20 */
} // :cond_4
return;
} // .end method
public void b ( org.w3c.dom.Element p0, org.apache.log4j.Logger p1, Boolean p2 ) {
/* .locals 4 */
/* .line 21 */
(( org.apache.log4j.Category ) p2 ).getName ( ); // invoke-virtual {p2}, Lorg/apache/log4j/Category;->getName()Ljava/lang/String;
if ( p3 != null) { // if-eqz p3, :cond_0
final String v0 = "root"; // const-string v0, "root"
} // :cond_0
final String v1 = "value"; // const-string v1, "value"
/* .line 22 */
(( org.apache.log4j.xml.DOMConfigurator ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Lorg/apache/log4j/xml/DOMConfigurator;->a(Ljava/lang/String;)Ljava/lang/String;
/* .line 23 */
/* new-instance v2, Ljava/lang/StringBuffer; */
/* invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V */
final String v3 = "Level value for "; // const-string v3, "Level value for "
(( java.lang.StringBuffer ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v3 = " is ["; // const-string v3, " is ["
(( java.lang.StringBuffer ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v3 = "]."; // const-string v3, "]."
(( java.lang.StringBuffer ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .debug ( v2 );
final String v2 = "inherited"; // const-string v2, "inherited"
/* .line 24 */
v2 = (( java.lang.String ) v2 ).equalsIgnoreCase ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
int v3 = 0; // const/4 v3, 0x0
/* if-nez v2, :cond_5 */
final String v2 = "null"; // const-string v2, "null"
v2 = (( java.lang.String ) v2 ).equalsIgnoreCase ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v2 != null) { // if-eqz v2, :cond_1
/* goto/16 :goto_0 */
} // :cond_1
final String p3 = "class"; // const-string p3, "class"
/* .line 25 */
(( org.apache.log4j.xml.DOMConfigurator ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/log4j/xml/DOMConfigurator;->a(Ljava/lang/String;)Ljava/lang/String;
final String p3 = ""; // const-string p3, ""
/* .line 26 */
p3 = (( java.lang.String ) p3 ).equals ( p1 ); // invoke-virtual {p3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( p3 != null) { // if-eqz p3, :cond_2
/* .line 27 */
p1 = org.apache.log4j.Level.DEBUG;
org.apache.log4j.helpers.OptionConverter .toLevel ( v1,p1 );
(( org.apache.log4j.Category ) p2 ).setLevel ( p1 ); // invoke-virtual {p2, p1}, Lorg/apache/log4j/Category;->setLevel(Lorg/apache/log4j/Level;)V
/* .line 28 */
} // :cond_2
/* new-instance p3, Ljava/lang/StringBuffer; */
/* invoke-direct {p3}, Ljava/lang/StringBuffer;-><init>()V */
final String v2 = "Desired Level sub-class: ["; // const-string v2, "Desired Level sub-class: ["
(( java.lang.StringBuffer ) p3 ).append ( v2 ); // invoke-virtual {p3, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) p3 ).append ( p1 ); // invoke-virtual {p3, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* const/16 v2, 0x5d */
(( java.lang.StringBuffer ) p3 ).append ( v2 ); // invoke-virtual {p3, v2}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) p3 ).toString ( ); // invoke-virtual {p3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .debug ( p3 );
/* .line 29 */
try { // :try_start_0
org.apache.log4j.helpers.Loader .loadClass ( p1 );
final String p3 = "toLevel"; // const-string p3, "toLevel"
/* .line 30 */
v2 = org.apache.log4j.xml.DOMConfigurator.e;
(( java.lang.Class ) p1 ).getMethod ( p3, v2 ); // invoke-virtual {p1, p3, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
int p3 = 1; // const/4 p3, 0x1
/* new-array p3, p3, [Ljava/lang/Object; */
int v2 = 0; // const/4 v2, 0x0
/* aput-object v1, p3, v2 */
/* .line 31 */
(( java.lang.reflect.Method ) p1 ).invoke ( v3, p3 ); // invoke-virtual {p1, v3, p3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast p1, Lorg/apache/log4j/Level; */
/* .line 32 */
(( org.apache.log4j.Category ) p2 ).setLevel ( p1 ); // invoke-virtual {p2, p1}, Lorg/apache/log4j/Category;->setLevel(Lorg/apache/log4j/Level;)V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p1 */
/* .line 33 */
/* instance-of p2, p1, Ljava/lang/InterruptedException; */
/* if-nez p2, :cond_3 */
/* instance-of p2, p1, Ljava/io/InterruptedIOException; */
if ( p2 != null) { // if-eqz p2, :cond_4
/* .line 34 */
} // :cond_3
java.lang.Thread .currentThread ( );
(( java.lang.Thread ) p2 ).interrupt ( ); // invoke-virtual {p2}, Ljava/lang/Thread;->interrupt()V
/* .line 35 */
} // :cond_4
/* new-instance p2, Ljava/lang/StringBuffer; */
/* invoke-direct {p2}, Ljava/lang/StringBuffer;-><init>()V */
final String p3 = "Could not create level ["; // const-string p3, "Could not create level ["
(( java.lang.StringBuffer ) p2 ).append ( p3 ); // invoke-virtual {p2, p3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) p2 ).append ( v1 ); // invoke-virtual {p2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String p3 = "].Reported error follows."; // const-string p3, "].Reported error follows."
(( java.lang.StringBuffer ) p2 ).append ( p3 ); // invoke-virtual {p2, p3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .error ( p2,p1 );
return;
} // :cond_5
} // :goto_0
if ( p3 != null) { // if-eqz p3, :cond_6
final String p1 = "Root level cannot be inherited.Ignoring directive."; // const-string p1, "Root level cannot be inherited.Ignoring directive."
/* .line 36 */
org.apache.log4j.helpers.LogLog .error ( p1 );
/* .line 37 */
} // :cond_6
(( org.apache.log4j.Category ) p2 ).setLevel ( v3 ); // invoke-virtual {p2, v3}, Lorg/apache/log4j/Category;->setLevel(Lorg/apache/log4j/Level;)V
/* .line 38 */
} // :goto_1
/* new-instance p1, Ljava/lang/StringBuffer; */
/* invoke-direct {p1}, Ljava/lang/StringBuffer;-><init>()V */
(( java.lang.StringBuffer ) p1 ).append ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String p3 = " level set to "; // const-string p3, " level set to "
(( java.lang.StringBuffer ) p1 ).append ( p3 ); // invoke-virtual {p1, p3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( org.apache.log4j.Category ) p2 ).getLevel ( ); // invoke-virtual {p2}, Lorg/apache/log4j/Category;->getLevel()Lorg/apache/log4j/Level;
(( java.lang.StringBuffer ) p1 ).append ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .debug ( p1 );
return;
} // .end method
public org.apache.log4j.Appender c ( org.w3c.dom.Element p0 ) {
/* .locals 11 */
final String v0 = "class"; // const-string v0, "class"
/* .line 1 */
(( org.apache.log4j.xml.DOMConfigurator ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/log4j/xml/DOMConfigurator;->a(Ljava/lang/String;)Ljava/lang/String;
/* .line 2 */
/* new-instance v1, Ljava/lang/StringBuffer; */
/* invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V */
final String v2 = "Class name: ["; // const-string v2, "Class name: ["
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* const/16 v2, 0x5d */
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .debug ( v1 );
/* .line 3 */
try { // :try_start_0
org.apache.log4j.helpers.Loader .loadClass ( v0 );
(( java.lang.Class ) v0 ).newInstance ( ); // invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;
/* .line 4 */
/* move-object v1, v0 */
/* check-cast v1, Lorg/apache/log4j/Appender; */
/* .line 5 */
/* new-instance v2, Lorg/apache/log4j/config/PropertySetter; */
/* invoke-direct {v2, v1}, Lorg/apache/log4j/config/PropertySetter;-><init>(Ljava/lang/Object;)V */
final String v3 = "name"; // const-string v3, "name"
/* .line 6 */
(( org.apache.log4j.xml.DOMConfigurator ) p0 ).a ( v3 ); // invoke-virtual {p0, v3}, Lorg/apache/log4j/xml/DOMConfigurator;->a(Ljava/lang/String;)Ljava/lang/String;
/* .line 7 */
v3 = /* .line 8 */
int v4 = 0; // const/4 v4, 0x0
} // :goto_0
/* if-ge v4, v3, :cond_7 */
/* .line 9 */
v6 = /* .line 10 */
int v7 = 1; // const/4 v7, 0x1
/* if-ne v6, v7, :cond_6 */
/* .line 11 */
/* check-cast v5, Lorg/w3c/dom/Element; */
/* .line 12 */
final String v7 = "param"; // const-string v7, "param"
v6 = (( java.lang.String ) v6 ).equals ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v6 != null) { // if-eqz v6, :cond_0
/* .line 13 */
(( org.apache.log4j.xml.DOMConfigurator ) p0 ).a ( v5, v2 ); // invoke-virtual {p0, v5, v2}, Lorg/apache/log4j/xml/DOMConfigurator;->a(Lorg/w3c/dom/Element;Lorg/apache/log4j/config/PropertySetter;)V
/* goto/16 :goto_1 */
/* .line 14 */
} // :cond_0
final String v7 = "layout"; // const-string v7, "layout"
v6 = (( java.lang.String ) v6 ).equals ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v6 != null) { // if-eqz v6, :cond_1
/* .line 15 */
(( org.apache.log4j.xml.DOMConfigurator ) p0 ).f ( v5 ); // invoke-virtual {p0, v5}, Lorg/apache/log4j/xml/DOMConfigurator;->f(Lorg/w3c/dom/Element;)Lorg/apache/log4j/Layout;
/* goto/16 :goto_1 */
/* .line 16 */
} // :cond_1
final String v7 = "filter"; // const-string v7, "filter"
v6 = (( java.lang.String ) v6 ).equals ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v6 != null) { // if-eqz v6, :cond_2
/* .line 17 */
(( org.apache.log4j.xml.DOMConfigurator ) p0 ).b ( v5, v1 ); // invoke-virtual {p0, v5, v1}, Lorg/apache/log4j/xml/DOMConfigurator;->b(Lorg/w3c/dom/Element;Lorg/apache/log4j/Appender;)V
/* goto/16 :goto_1 */
/* .line 18 */
} // :cond_2
final String v7 = "errorHandler"; // const-string v7, "errorHandler"
v6 = (( java.lang.String ) v6 ).equals ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v6 != null) { // if-eqz v6, :cond_3
/* .line 19 */
(( org.apache.log4j.xml.DOMConfigurator ) p0 ).a ( v5, v1 ); // invoke-virtual {p0, v5, v1}, Lorg/apache/log4j/xml/DOMConfigurator;->a(Lorg/w3c/dom/Element;Lorg/apache/log4j/Appender;)V
/* .line 20 */
} // :cond_3
final String v7 = "appender-ref"; // const-string v7, "appender-ref"
v6 = (( java.lang.String ) v6 ).equals ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v6 != null) { // if-eqz v6, :cond_5
final String v6 = "ref"; // const-string v6, "ref"
/* .line 21 */
(( org.apache.log4j.xml.DOMConfigurator ) p0 ).a ( v6 ); // invoke-virtual {p0, v6}, Lorg/apache/log4j/xml/DOMConfigurator;->a(Ljava/lang/String;)Ljava/lang/String;
/* .line 22 */
/* instance-of v7, v1, Lorg/apache/log4j/spi/AppenderAttachable; */
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
final String v8 = "] to appender named ["; // const-string v8, "] to appender named ["
if ( v7 != null) { // if-eqz v7, :cond_4
/* .line 23 */
try { // :try_start_1
/* move-object v7, v1 */
/* check-cast v7, Lorg/apache/log4j/spi/AppenderAttachable; */
/* .line 24 */
/* new-instance v9, Ljava/lang/StringBuffer; */
/* invoke-direct {v9}, Ljava/lang/StringBuffer;-><init>()V */
final String v10 = "Attaching appender named ["; // const-string v10, "Attaching appender named ["
(( java.lang.StringBuffer ) v9 ).append ( v10 ); // invoke-virtual {v9, v10}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v9 ).append ( v6 ); // invoke-virtual {v9, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v9 ).append ( v8 ); // invoke-virtual {v9, v8}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v9 ).append ( v6 ); // invoke-virtual {v9, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v6 = "]."; // const-string v6, "]."
(( java.lang.StringBuffer ) v9 ).append ( v6 ); // invoke-virtual {v9, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v9 ).toString ( ); // invoke-virtual {v9}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .debug ( v6 );
/* .line 25 */
(( org.apache.log4j.xml.DOMConfigurator ) p0 ).a ( v5 ); // invoke-virtual {p0, v5}, Lorg/apache/log4j/xml/DOMConfigurator;->a(Lorg/w3c/dom/Element;)Lorg/apache/log4j/Appender;
/* .line 26 */
} // :cond_4
/* new-instance v5, Ljava/lang/StringBuffer; */
/* invoke-direct {v5}, Ljava/lang/StringBuffer;-><init>()V */
final String v7 = "Requesting attachment of appender named ["; // const-string v7, "Requesting attachment of appender named ["
(( java.lang.StringBuffer ) v5 ).append ( v7 ); // invoke-virtual {v5, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v5 ).append ( v8 ); // invoke-virtual {v5, v8}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v6 = "] which does not implement org.apache.log4j.spi.AppenderAttachable."; // const-string v6, "] which does not implement org.apache.log4j.spi.AppenderAttachable."
(( java.lang.StringBuffer ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .error ( v5 );
/* .line 27 */
} // :cond_5
v6 = this.b;
org.apache.log4j.xml.DOMConfigurator .a ( v0,v5,v6 );
} // :cond_6
} // :goto_1
/* add-int/lit8 v4, v4, 0x1 */
/* goto/16 :goto_0 */
/* .line 28 */
} // :cond_7
(( org.apache.log4j.config.PropertySetter ) v2 ).activate ( ); // invoke-virtual {v2}, Lorg/apache/log4j/config/PropertySetter;->activate()V
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
/* :catch_0 */
/* move-exception p1 */
/* .line 29 */
/* instance-of v0, p1, Ljava/lang/InterruptedException; */
/* if-nez v0, :cond_8 */
/* instance-of v0, p1, Ljava/io/InterruptedIOException; */
if ( v0 != null) { // if-eqz v0, :cond_9
/* .line 30 */
} // :cond_8
java.lang.Thread .currentThread ( );
(( java.lang.Thread ) v0 ).interrupt ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V
} // :cond_9
final String v0 = "Could not create an Appender.Reported error follows."; // const-string v0, "Could not create an Appender.Reported error follows."
/* .line 31 */
org.apache.log4j.helpers.LogLog .error ( v0,p1 );
int p1 = 0; // const/4 p1, 0x0
} // .end method
public void d ( org.w3c.dom.Element p0 ) {
/* .locals 6 */
final String v0 = "name"; // const-string v0, "name"
/* .line 1 */
(( org.apache.log4j.xml.DOMConfigurator ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/log4j/xml/DOMConfigurator;->a(Ljava/lang/String;)Ljava/lang/String;
final String v1 = "class"; // const-string v1, "class"
/* .line 2 */
(( org.apache.log4j.xml.DOMConfigurator ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Lorg/apache/log4j/xml/DOMConfigurator;->a(Ljava/lang/String;)Ljava/lang/String;
final String v2 = ""; // const-string v2, ""
/* .line 3 */
v2 = (( java.lang.String ) v2 ).equals ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
int v3 = 0; // const/4 v3, 0x0
int v4 = 1; // const/4 v4, 0x1
if ( v2 != null) { // if-eqz v2, :cond_1
final String v1 = "Retreiving an instance of org.apache.log4j.Logger."; // const-string v1, "Retreiving an instance of org.apache.log4j.Logger."
/* .line 4 */
org.apache.log4j.helpers.LogLog .debug ( v1 );
/* .line 5 */
v1 = this.d;
/* if-nez v1, :cond_0 */
v1 = this.c;
} // :cond_0
v2 = this.c;
} // :goto_0
/* move-object v1, v0 */
/* .line 6 */
} // :cond_1
/* new-instance v2, Ljava/lang/StringBuffer; */
/* invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V */
final String v5 = "Desired logger sub-class: ["; // const-string v5, "Desired logger sub-class: ["
(( java.lang.StringBuffer ) v2 ).append ( v5 ); // invoke-virtual {v2, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* const/16 v5, 0x5d */
(( java.lang.StringBuffer ) v2 ).append ( v5 ); // invoke-virtual {v2, v5}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .debug ( v2 );
/* .line 7 */
try { // :try_start_0
org.apache.log4j.helpers.Loader .loadClass ( v1 );
final String v2 = "getLogger"; // const-string v2, "getLogger"
/* .line 8 */
v5 = org.apache.log4j.xml.DOMConfigurator.e;
(( java.lang.Class ) v1 ).getMethod ( v2, v5 ); // invoke-virtual {v1, v2, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
int v2 = 0; // const/4 v2, 0x0
/* new-array v5, v4, [Ljava/lang/Object; */
/* aput-object v0, v5, v3 */
/* .line 9 */
(( java.lang.reflect.Method ) v1 ).invoke ( v2, v5 ); // invoke-virtual {v1, v2, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v1, Lorg/apache/log4j/Logger; */
/* :try_end_0 */
/* .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 10 */
} // :goto_1
/* monitor-enter v1 */
try { // :try_start_1
final String v0 = "additivity"; // const-string v0, "additivity"
/* .line 11 */
(( org.apache.log4j.xml.DOMConfigurator ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/log4j/xml/DOMConfigurator;->a(Ljava/lang/String;)Ljava/lang/String;
v0 = org.apache.log4j.helpers.OptionConverter .toBoolean ( v0,v4 );
/* .line 12 */
/* new-instance v2, Ljava/lang/StringBuffer; */
/* invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V */
final String v4 = "Setting ["; // const-string v4, "Setting ["
(( java.lang.StringBuffer ) v2 ).append ( v4 ); // invoke-virtual {v2, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( org.apache.log4j.Category ) v1 ).getName ( ); // invoke-virtual {v1}, Lorg/apache/log4j/Category;->getName()Ljava/lang/String;
(( java.lang.StringBuffer ) v2 ).append ( v4 ); // invoke-virtual {v2, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v4 = "] additivity to ["; // const-string v4, "] additivity to ["
(( java.lang.StringBuffer ) v2 ).append ( v4 ); // invoke-virtual {v2, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Z)Ljava/lang/StringBuffer;
final String v4 = "]."; // const-string v4, "]."
(( java.lang.StringBuffer ) v2 ).append ( v4 ); // invoke-virtual {v2, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .debug ( v2 );
/* .line 13 */
(( org.apache.log4j.Category ) v1 ).setAdditivity ( v0 ); // invoke-virtual {v1, v0}, Lorg/apache/log4j/Category;->setAdditivity(Z)V
/* .line 14 */
(( org.apache.log4j.xml.DOMConfigurator ) p0 ).a ( p1, v1, v3 ); // invoke-virtual {p0, p1, v1, v3}, Lorg/apache/log4j/xml/DOMConfigurator;->a(Lorg/w3c/dom/Element;Lorg/apache/log4j/Logger;Z)V
/* .line 15 */
/* monitor-exit v1 */
return;
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit v1 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* throw p1 */
/* :catch_0 */
/* move-exception p1 */
/* .line 16 */
/* new-instance v1, Ljava/lang/StringBuffer; */
/* invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V */
final String v2 = "Could not retrieve category ["; // const-string v2, "Could not retrieve category ["
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v0 = "].Reported error follows."; // const-string v0, "].Reported error follows."
(( java.lang.StringBuffer ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .error ( v0,p1 );
return;
/* :catch_1 */
/* move-exception p1 */
/* .line 17 */
(( java.lang.reflect.InvocationTargetException ) p1 ).getTargetException ( ); // invoke-virtual {p1}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;
/* instance-of v1, v1, Ljava/lang/InterruptedException; */
/* if-nez v1, :cond_2 */
(( java.lang.reflect.InvocationTargetException ) p1 ).getTargetException ( ); // invoke-virtual {p1}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;
/* instance-of v1, v1, Ljava/io/InterruptedIOException; */
if ( v1 != null) { // if-eqz v1, :cond_3
/* .line 18 */
} // :cond_2
java.lang.Thread .currentThread ( );
(( java.lang.Thread ) v1 ).interrupt ( ); // invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V
/* .line 19 */
} // :cond_3
/* new-instance v1, Ljava/lang/StringBuffer; */
/* invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V */
final String v2 = "Could not retrieve category ["; // const-string v2, "Could not retrieve category ["
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v0 = "].Reported error follows."; // const-string v0, "].Reported error follows."
(( java.lang.StringBuffer ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .error ( v0,p1 );
return;
} // .end method
public void doConfigure ( java.io.InputStream p0, org.apache.log4j.spi.LoggerRepository p1 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljavax/xml/parsers/FactoryConfigurationError; */
/* } */
} // .end annotation
/* .line 5 */
/* new-instance v0, Lm/a/b/n/c; */
/* invoke-direct {v0, p0, p1}, Lm/a/b/n/c;-><init>(Lorg/apache/log4j/xml/DOMConfigurator;Ljava/io/InputStream;)V */
/* .line 6 */
(( org.apache.log4j.xml.DOMConfigurator ) p0 ).a ( v0, p2 ); // invoke-virtual {p0, v0, p2}, Lorg/apache/log4j/xml/DOMConfigurator;->a(Lorg/apache/log4j/xml/DOMConfigurator$a;Lorg/apache/log4j/spi/LoggerRepository;)V
return;
} // .end method
public void doConfigure ( java.io.Reader p0, org.apache.log4j.spi.LoggerRepository p1 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljavax/xml/parsers/FactoryConfigurationError; */
/* } */
} // .end annotation
/* .line 7 */
/* new-instance v0, Lm/a/b/n/d; */
/* invoke-direct {v0, p0, p1}, Lm/a/b/n/d;-><init>(Lorg/apache/log4j/xml/DOMConfigurator;Ljava/io/Reader;)V */
/* .line 8 */
(( org.apache.log4j.xml.DOMConfigurator ) p0 ).a ( v0, p2 ); // invoke-virtual {p0, v0, p2}, Lorg/apache/log4j/xml/DOMConfigurator;->a(Lorg/apache/log4j/xml/DOMConfigurator$a;Lorg/apache/log4j/spi/LoggerRepository;)V
return;
} // .end method
public void doConfigure ( java.lang.String p0, org.apache.log4j.spi.LoggerRepository p1 ) {
/* .locals 1 */
/* .line 1 */
/* new-instance v0, Lm/a/b/n/a; */
/* invoke-direct {v0, p0, p1}, Lm/a/b/n/a;-><init>(Lorg/apache/log4j/xml/DOMConfigurator;Ljava/lang/String;)V */
/* .line 2 */
(( org.apache.log4j.xml.DOMConfigurator ) p0 ).a ( v0, p2 ); // invoke-virtual {p0, v0, p2}, Lorg/apache/log4j/xml/DOMConfigurator;->a(Lorg/apache/log4j/xml/DOMConfigurator$a;Lorg/apache/log4j/spi/LoggerRepository;)V
return;
} // .end method
public void doConfigure ( java.net.URL p0, org.apache.log4j.spi.LoggerRepository p1 ) {
/* .locals 1 */
/* .line 3 */
/* new-instance v0, Lm/a/b/n/b; */
/* invoke-direct {v0, p0, p1}, Lm/a/b/n/b;-><init>(Lorg/apache/log4j/xml/DOMConfigurator;Ljava/net/URL;)V */
/* .line 4 */
(( org.apache.log4j.xml.DOMConfigurator ) p0 ).a ( v0, p2 ); // invoke-virtual {p0, v0, p2}, Lorg/apache/log4j/xml/DOMConfigurator;->a(Lorg/apache/log4j/xml/DOMConfigurator$a;Lorg/apache/log4j/spi/LoggerRepository;)V
return;
} // .end method
public void doConfigure ( org.w3c.dom.Element p0, org.apache.log4j.spi.LoggerRepository p1 ) {
/* .locals 0 */
/* .line 9 */
this.c = p2;
/* .line 10 */
(( org.apache.log4j.xml.DOMConfigurator ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/log4j/xml/DOMConfigurator;->b(Lorg/w3c/dom/Element;)V
return;
} // .end method
public void e ( org.w3c.dom.Element p0 ) {
/* .locals 7 */
final String v0 = "class"; // const-string v0, "class"
/* .line 1 */
(( org.apache.log4j.xml.DOMConfigurator ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/log4j/xml/DOMConfigurator;->a(Ljava/lang/String;)Ljava/lang/String;
final String v1 = ""; // const-string v1, ""
/* .line 2 */
v1 = (( java.lang.String ) v1 ).equals ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
final String p1 = "Category Factory tag class attribute not found."; // const-string p1, "Category Factory tag class attribute not found."
/* .line 3 */
org.apache.log4j.helpers.LogLog .error ( p1 );
final String p1 = "No Category Factory configured."; // const-string p1, "No Category Factory configured."
/* .line 4 */
org.apache.log4j.helpers.LogLog .debug ( p1 );
/* goto/16 :goto_3 */
/* .line 5 */
} // :cond_0
/* new-instance v1, Ljava/lang/StringBuffer; */
/* invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V */
final String v2 = "Desired category factory: ["; // const-string v2, "Desired category factory: ["
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* const/16 v2, 0x5d */
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .debug ( v1 );
/* .line 6 */
v1 = org.apache.log4j.xml.DOMConfigurator.i;
/* if-nez v1, :cond_1 */
final String v1 = "org.apache.log4j.spi.LoggerFactory"; // const-string v1, "org.apache.log4j.spi.LoggerFactory"
org.apache.log4j.xml.DOMConfigurator .b ( v1 );
} // :cond_1
int v2 = 0; // const/4 v2, 0x0
org.apache.log4j.helpers.OptionConverter .instantiateByClassName ( v0,v1,v2 );
/* .line 7 */
/* instance-of v2, v1, Lorg/apache/log4j/spi/LoggerFactory; */
if ( v2 != null) { // if-eqz v2, :cond_2
/* .line 8 */
/* move-object v0, v1 */
/* check-cast v0, Lorg/apache/log4j/spi/LoggerFactory; */
this.d = v0;
/* .line 9 */
} // :cond_2
/* new-instance v2, Ljava/lang/StringBuffer; */
/* invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V */
final String v3 = "Category Factory class "; // const-string v3, "Category Factory class "
(( java.lang.StringBuffer ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v0 = " does not implement org.apache.log4j.LoggerFactory"; // const-string v0, " does not implement org.apache.log4j.LoggerFactory"
(( java.lang.StringBuffer ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .error ( v0 );
/* .line 10 */
} // :goto_0
/* new-instance v0, Lorg/apache/log4j/config/PropertySetter; */
/* invoke-direct {v0, v1}, Lorg/apache/log4j/config/PropertySetter;-><init>(Ljava/lang/Object;)V */
/* .line 11 */
v2 = /* .line 12 */
int v3 = 0; // const/4 v3, 0x0
} // :goto_1
/* if-ge v3, v2, :cond_5 */
/* .line 13 */
v5 = /* .line 14 */
int v6 = 1; // const/4 v6, 0x1
/* if-ne v5, v6, :cond_4 */
/* .line 15 */
/* check-cast v4, Lorg/w3c/dom/Element; */
/* .line 16 */
final String v6 = "param"; // const-string v6, "param"
v5 = (( java.lang.String ) v5 ).equals ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v5 != null) { // if-eqz v5, :cond_3
/* .line 17 */
(( org.apache.log4j.xml.DOMConfigurator ) p0 ).a ( v4, v0 ); // invoke-virtual {p0, v4, v0}, Lorg/apache/log4j/xml/DOMConfigurator;->a(Lorg/w3c/dom/Element;Lorg/apache/log4j/config/PropertySetter;)V
/* .line 18 */
} // :cond_3
v5 = this.b;
org.apache.log4j.xml.DOMConfigurator .b ( v1,v4,v5 );
} // :cond_4
} // :goto_2
/* add-int/lit8 v3, v3, 0x1 */
} // :cond_5
} // :goto_3
return;
} // .end method
public org.apache.log4j.Layout f ( org.w3c.dom.Element p0 ) {
/* .locals 8 */
final String v0 = "class"; // const-string v0, "class"
/* .line 1 */
(( org.apache.log4j.xml.DOMConfigurator ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/log4j/xml/DOMConfigurator;->a(Ljava/lang/String;)Ljava/lang/String;
/* .line 2 */
/* new-instance v1, Ljava/lang/StringBuffer; */
/* invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V */
final String v2 = "Parsing layout of class: \""; // const-string v2, "Parsing layout of class: \""
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v2 = "\""; // const-string v2, "\""
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .debug ( v1 );
/* .line 3 */
try { // :try_start_0
org.apache.log4j.helpers.Loader .loadClass ( v0 );
(( java.lang.Class ) v0 ).newInstance ( ); // invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;
/* .line 4 */
/* move-object v1, v0 */
/* check-cast v1, Lorg/apache/log4j/Layout; */
/* .line 5 */
/* new-instance v2, Lorg/apache/log4j/config/PropertySetter; */
/* invoke-direct {v2, v1}, Lorg/apache/log4j/config/PropertySetter;-><init>(Ljava/lang/Object;)V */
/* .line 6 */
v3 = /* .line 7 */
int v4 = 0; // const/4 v4, 0x0
} // :goto_0
/* if-ge v4, v3, :cond_2 */
/* .line 8 */
v6 = /* .line 9 */
int v7 = 1; // const/4 v7, 0x1
/* if-ne v6, v7, :cond_1 */
/* .line 10 */
/* check-cast v5, Lorg/w3c/dom/Element; */
/* .line 11 */
final String v7 = "param"; // const-string v7, "param"
/* .line 12 */
v6 = (( java.lang.String ) v6 ).equals ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v6 != null) { // if-eqz v6, :cond_0
/* .line 13 */
(( org.apache.log4j.xml.DOMConfigurator ) p0 ).a ( v5, v2 ); // invoke-virtual {p0, v5, v2}, Lorg/apache/log4j/xml/DOMConfigurator;->a(Lorg/w3c/dom/Element;Lorg/apache/log4j/config/PropertySetter;)V
/* .line 14 */
} // :cond_0
v6 = this.b;
org.apache.log4j.xml.DOMConfigurator .a ( v0,v5,v6 );
} // :cond_1
} // :goto_1
/* add-int/lit8 v4, v4, 0x1 */
/* .line 15 */
} // :cond_2
(( org.apache.log4j.config.PropertySetter ) v2 ).activate ( ); // invoke-virtual {v2}, Lorg/apache/log4j/config/PropertySetter;->activate()V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p1 */
/* .line 16 */
/* instance-of v0, p1, Ljava/lang/InterruptedException; */
/* if-nez v0, :cond_3 */
/* instance-of v0, p1, Ljava/io/InterruptedIOException; */
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 17 */
} // :cond_3
java.lang.Thread .currentThread ( );
(( java.lang.Thread ) v0 ).interrupt ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V
} // :cond_4
final String v0 = "Could not create the Layout.Reported error follows."; // const-string v0, "Could not create the Layout.Reported error follows."
/* .line 18 */
org.apache.log4j.helpers.LogLog .error ( v0,p1 );
int p1 = 0; // const/4 p1, 0x0
} // .end method
public void g ( org.w3c.dom.Element p0 ) {
/* .locals 3 */
final String v0 = "renderingClass"; // const-string v0, "renderingClass"
/* .line 1 */
(( org.apache.log4j.xml.DOMConfigurator ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/log4j/xml/DOMConfigurator;->a(Ljava/lang/String;)Ljava/lang/String;
final String v1 = "renderedClass"; // const-string v1, "renderedClass"
/* .line 2 */
(( org.apache.log4j.xml.DOMConfigurator ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/log4j/xml/DOMConfigurator;->a(Ljava/lang/String;)Ljava/lang/String;
/* .line 3 */
v1 = this.c;
/* instance-of v2, v1, Lorg/apache/log4j/spi/RendererSupport; */
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 4 */
/* check-cast v1, Lorg/apache/log4j/spi/RendererSupport; */
org.apache.log4j.or.RendererMap .addRenderer ( v1,p1,v0 );
} // :cond_0
return;
} // .end method
public void h ( org.w3c.dom.Element p0 ) {
/* .locals 2 */
/* .line 1 */
v0 = this.c;
/* .line 2 */
/* monitor-enter v0 */
int v1 = 1; // const/4 v1, 0x1
/* .line 3 */
try { // :try_start_0
(( org.apache.log4j.xml.DOMConfigurator ) p0 ).a ( p1, v0, v1 ); // invoke-virtual {p0, p1, v0, v1}, Lorg/apache/log4j/xml/DOMConfigurator;->a(Lorg/w3c/dom/Element;Lorg/apache/log4j/Logger;Z)V
/* .line 4 */
/* monitor-exit v0 */
return;
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit v0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw p1 */
} // .end method
public org.apache.log4j.spi.ThrowableRenderer i ( org.w3c.dom.Element p0 ) {
/* .locals 8 */
final String v0 = "class"; // const-string v0, "class"
/* .line 1 */
(( org.apache.log4j.xml.DOMConfigurator ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/log4j/xml/DOMConfigurator;->a(Ljava/lang/String;)Ljava/lang/String;
/* .line 2 */
/* new-instance v1, Ljava/lang/StringBuffer; */
/* invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V */
final String v2 = "Parsing throwableRenderer of class: \""; // const-string v2, "Parsing throwableRenderer of class: \""
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v2 = "\""; // const-string v2, "\""
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .debug ( v1 );
/* .line 3 */
try { // :try_start_0
org.apache.log4j.helpers.Loader .loadClass ( v0 );
(( java.lang.Class ) v0 ).newInstance ( ); // invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;
/* .line 4 */
/* move-object v1, v0 */
/* check-cast v1, Lorg/apache/log4j/spi/ThrowableRenderer; */
/* .line 5 */
/* new-instance v2, Lorg/apache/log4j/config/PropertySetter; */
/* invoke-direct {v2, v1}, Lorg/apache/log4j/config/PropertySetter;-><init>(Ljava/lang/Object;)V */
/* .line 6 */
v3 = /* .line 7 */
int v4 = 0; // const/4 v4, 0x0
} // :goto_0
/* if-ge v4, v3, :cond_2 */
/* .line 8 */
v6 = /* .line 9 */
int v7 = 1; // const/4 v7, 0x1
/* if-ne v6, v7, :cond_1 */
/* .line 10 */
/* check-cast v5, Lorg/w3c/dom/Element; */
/* .line 11 */
final String v7 = "param"; // const-string v7, "param"
/* .line 12 */
v6 = (( java.lang.String ) v6 ).equals ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v6 != null) { // if-eqz v6, :cond_0
/* .line 13 */
(( org.apache.log4j.xml.DOMConfigurator ) p0 ).a ( v5, v2 ); // invoke-virtual {p0, v5, v2}, Lorg/apache/log4j/xml/DOMConfigurator;->a(Lorg/w3c/dom/Element;Lorg/apache/log4j/config/PropertySetter;)V
/* .line 14 */
} // :cond_0
v6 = this.b;
org.apache.log4j.xml.DOMConfigurator .a ( v0,v5,v6 );
} // :cond_1
} // :goto_1
/* add-int/lit8 v4, v4, 0x1 */
/* .line 15 */
} // :cond_2
(( org.apache.log4j.config.PropertySetter ) v2 ).activate ( ); // invoke-virtual {v2}, Lorg/apache/log4j/config/PropertySetter;->activate()V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p1 */
/* .line 16 */
/* instance-of v0, p1, Ljava/lang/InterruptedException; */
/* if-nez v0, :cond_3 */
/* instance-of v0, p1, Ljava/io/InterruptedIOException; */
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 17 */
} // :cond_3
java.lang.Thread .currentThread ( );
(( java.lang.Thread ) v0 ).interrupt ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V
} // :cond_4
final String v0 = "Could not create the ThrowableRenderer.Reported error follows."; // const-string v0, "Could not create the ThrowableRenderer.Reported error follows."
/* .line 18 */
org.apache.log4j.helpers.LogLog .error ( v0,p1 );
int p1 = 0; // const/4 p1, 0x0
} // .end method
