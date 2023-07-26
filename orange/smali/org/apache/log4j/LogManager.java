public class org.apache.log4j.LogManager {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final java.lang.String CONFIGURATOR_CLASS_KEY;
	 public static final java.lang.String DEFAULT_CONFIGURATION_FILE;
	 public static final java.lang.String DEFAULT_CONFIGURATION_KEY;
	 public static final java.lang.String DEFAULT_INIT_OVERRIDE_KEY;
	 public static java.lang.Object a;
	 public static org.apache.log4j.spi.RepositorySelector b;
	 /* # direct methods */
	 public static org.apache.log4j.LogManager ( ) {
		 /* .locals 4 */
		 /* .line 1 */
		 /* new-instance v0, Lorg/apache/log4j/Hierarchy; */
		 /* new-instance v1, Lorg/apache/log4j/spi/RootLogger; */
		 v2 = org.apache.log4j.Level.DEBUG;
		 /* invoke-direct {v1, v2}, Lorg/apache/log4j/spi/RootLogger;-><init>(Lorg/apache/log4j/Level;)V */
		 /* invoke-direct {v0, v1}, Lorg/apache/log4j/Hierarchy;-><init>(Lorg/apache/log4j/Logger;)V */
		 /* .line 2 */
		 /* new-instance v1, Lorg/apache/log4j/spi/DefaultRepositorySelector; */
		 /* invoke-direct {v1, v0}, Lorg/apache/log4j/spi/DefaultRepositorySelector;-><init>(Lorg/apache/log4j/spi/LoggerRepository;)V */
		 int v0 = 0; // const/4 v0, 0x0
		 final String v1 = "log4j.defaultInitOverride"; // const-string v1, "log4j.defaultInitOverride"
		 /* .line 3 */
		 org.apache.log4j.helpers.OptionConverter .getSystemProperty ( v1,v0 );
		 if ( v1 != null) { // if-eqz v1, :cond_1
			 final String v2 = "false"; // const-string v2, "false"
			 /* .line 4 */
			 v1 = 			 (( java.lang.String ) v2 ).equalsIgnoreCase ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
			 if ( v1 != null) { // if-eqz v1, :cond_0
			 } // :cond_0
			 final String v0 = "Default initialization of overridden by log4j.defaultInitOverrideproperty."; // const-string v0, "Default initialization of overridden by log4j.defaultInitOverrideproperty."
			 /* .line 5 */
			 org.apache.log4j.helpers.LogLog .debug ( v0 );
		 } // :cond_1
	 } // :goto_0
	 final String v1 = "log4j.configuration"; // const-string v1, "log4j.configuration"
	 /* .line 6 */
	 org.apache.log4j.helpers.OptionConverter .getSystemProperty ( v1,v0 );
	 final String v2 = "log4j.configuratorClass"; // const-string v2, "log4j.configuratorClass"
	 /* .line 7 */
	 org.apache.log4j.helpers.OptionConverter .getSystemProperty ( v2,v0 );
	 /* if-nez v1, :cond_2 */
	 final String v2 = "log4j.xml"; // const-string v2, "log4j.xml"
	 /* .line 8 */
	 org.apache.log4j.helpers.Loader .getResource ( v2 );
	 /* if-nez v2, :cond_3 */
	 final String v2 = "log4j.properties"; // const-string v2, "log4j.properties"
	 /* .line 9 */
	 org.apache.log4j.helpers.Loader .getResource ( v2 );
	 /* .line 10 */
} // :cond_2
try { // :try_start_0
	 /* new-instance v2, Ljava/net/URL; */
	 /* invoke-direct {v2, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V */
	 /* :try_end_0 */
	 /* .catch Ljava/net/MalformedURLException; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* .line 11 */
	 /* :catch_0 */
	 org.apache.log4j.helpers.Loader .getResource ( v1 );
} // :cond_3
} // :goto_1
if ( v2 != null) { // if-eqz v2, :cond_4
/* .line 12 */
/* new-instance v1, Ljava/lang/StringBuffer; */
/* invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V */
final String v3 = "Using URL ["; // const-string v3, "Using URL ["
(( java.lang.StringBuffer ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;
final String v3 = "] for automatic log4j configuration."; // const-string v3, "] for automatic log4j configuration."
(( java.lang.StringBuffer ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .debug ( v1 );
/* .line 13 */
try { // :try_start_1
	 org.apache.log4j.LogManager .getLoggerRepository ( );
	 org.apache.log4j.helpers.OptionConverter .selectAndConfigure ( v2,v0,v1 );
	 /* :try_end_1 */
	 /* .catch Ljava/lang/NoClassDefFoundError; {:try_start_1 ..:try_end_1} :catch_1 */
	 /* :catch_1 */
	 /* move-exception v0 */
	 final String v1 = "Error during default initialization"; // const-string v1, "Error during default initialization"
	 /* .line 14 */
	 org.apache.log4j.helpers.LogLog .warn ( v1,v0 );
	 /* .line 15 */
} // :cond_4
/* new-instance v0, Ljava/lang/StringBuffer; */
/* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
final String v2 = "Could not find resource: ["; // const-string v2, "Could not find resource: ["
(( java.lang.StringBuffer ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v1 = "]."; // const-string v1, "]."
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .debug ( v0 );
} // :goto_2
return;
} // .end method
public org.apache.log4j.LogManager ( ) {
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
public static Boolean a ( java.lang.Exception p0 ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Ljava/io/StringWriter; */
/* invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V */
/* .line 2 */
/* new-instance v1, Ljava/io/PrintWriter; */
/* invoke-direct {v1, v0}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V */
(( java.lang.Exception ) p0 ).printStackTrace ( v1 ); // invoke-virtual {p0, v1}, Ljava/lang/Exception;->printStackTrace(Ljava/io/PrintWriter;)V
/* .line 3 */
(( java.io.StringWriter ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;
final String v0 = "org.apache.catalina.loader.WebappClassLoader.stop"; // const-string v0, "org.apache.catalina.loader.WebappClassLoader.stop"
/* .line 4 */
p0 = (( java.lang.String ) p0 ).indexOf ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
int v0 = -1; // const/4 v0, -0x1
/* if-eq p0, v0, :cond_0 */
int p0 = 1; // const/4 p0, 0x1
} // :cond_0
int p0 = 0; // const/4 p0, 0x0
} // :goto_0
} // .end method
public static org.apache.log4j.Logger exists ( java.lang.String p0 ) {
/* .locals 1 */
/* .line 1 */
org.apache.log4j.LogManager .getLoggerRepository ( );
} // .end method
public static java.util.Enumeration getCurrentLoggers ( ) {
/* .locals 1 */
/* .line 1 */
org.apache.log4j.LogManager .getLoggerRepository ( );
} // .end method
public static org.apache.log4j.Logger getLogger ( java.lang.Class p0 ) {
/* .locals 1 */
/* .line 2 */
org.apache.log4j.LogManager .getLoggerRepository ( );
(( java.lang.Class ) p0 ).getName ( ); // invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;
} // .end method
public static org.apache.log4j.Logger getLogger ( java.lang.String p0 ) {
/* .locals 1 */
/* .line 1 */
org.apache.log4j.LogManager .getLoggerRepository ( );
} // .end method
public static org.apache.log4j.Logger getLogger ( java.lang.String p0, org.apache.log4j.spi.LoggerFactory p1 ) {
/* .locals 1 */
/* .line 3 */
org.apache.log4j.LogManager .getLoggerRepository ( );
} // .end method
public static org.apache.log4j.spi.LoggerRepository getLoggerRepository ( ) {
/* .locals 3 */
/* .line 1 */
v0 = org.apache.log4j.LogManager.b;
/* if-nez v0, :cond_1 */
/* .line 2 */
/* new-instance v0, Lorg/apache/log4j/spi/DefaultRepositorySelector; */
/* new-instance v1, Lorg/apache/log4j/spi/NOPLoggerRepository; */
/* invoke-direct {v1}, Lorg/apache/log4j/spi/NOPLoggerRepository;-><init>()V */
/* invoke-direct {v0, v1}, Lorg/apache/log4j/spi/DefaultRepositorySelector;-><init>(Lorg/apache/log4j/spi/LoggerRepository;)V */
int v0 = 0; // const/4 v0, 0x0
/* .line 3 */
/* .line 4 */
/* new-instance v0, Ljava/lang/IllegalStateException; */
final String v1 = "Class invariant violation"; // const-string v1, "Class invariant violation"
/* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
final String v1 = "log4j called after unloading, see http://logging.apache.org/log4j/1.2/faq.html#unload."; // const-string v1, "log4j called after unloading, see http://logging.apache.org/log4j/1.2/faq.html#unload."
/* .line 5 */
v2 = org.apache.log4j.LogManager .a ( v0 );
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 6 */
org.apache.log4j.helpers.LogLog .debug ( v1,v0 );
/* .line 7 */
} // :cond_0
org.apache.log4j.helpers.LogLog .error ( v1,v0 );
/* .line 8 */
} // :cond_1
} // :goto_0
v0 = org.apache.log4j.LogManager.b;
} // .end method
public static org.apache.log4j.Logger getRootLogger ( ) {
/* .locals 1 */
/* .line 1 */
org.apache.log4j.LogManager .getLoggerRepository ( );
} // .end method
public static void resetConfiguration ( ) {
/* .locals 1 */
/* .line 1 */
org.apache.log4j.LogManager .getLoggerRepository ( );
return;
} // .end method
public static void setRepositorySelector ( org.apache.log4j.spi.RepositorySelector p0, java.lang.Object p1 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/IllegalArgumentException; */
/* } */
} // .end annotation
/* .line 1 */
v0 = org.apache.log4j.LogManager.a;
if ( v0 != null) { // if-eqz v0, :cond_1
/* if-ne v0, p1, :cond_0 */
/* .line 2 */
} // :cond_0
/* new-instance p0, Ljava/lang/IllegalArgumentException; */
final String p1 = "Attempted to reset the LoggerFactory without possessing the guard."; // const-string p1, "Attempted to reset the LoggerFactory without possessing the guard."
/* invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
} // :cond_1
} // :goto_0
if ( p0 != null) { // if-eqz p0, :cond_2
/* .line 3 */
/* .line 4 */
return;
/* .line 5 */
} // :cond_2
/* new-instance p0, Ljava/lang/IllegalArgumentException; */
final String p1 = "RepositorySelector must be non-null."; // const-string p1, "RepositorySelector must be non-null."
/* invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
} // .end method
public static void shutdown ( ) {
/* .locals 1 */
/* .line 1 */
org.apache.log4j.LogManager .getLoggerRepository ( );
return;
} // .end method
