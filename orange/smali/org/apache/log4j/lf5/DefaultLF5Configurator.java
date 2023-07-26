public class org.apache.log4j.lf5.DefaultLF5Configurator implements org.apache.log4j.spi.Configurator {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # static fields */
	 public static java.lang.Class a; //synthetic
	 /* # direct methods */
	 public static java.lang.Class a ( java.lang.String p0 ) { //synthethic
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
		 public static void configure ( ) {
			 /* .locals 4 */
			 /* .annotation system Ldalvik/annotation/Throws; */
			 /* value = { */
			 /* Ljava/io/IOException; */
			 /* } */
		 } // .end annotation
		 /* .line 1 */
		 v0 = org.apache.log4j.lf5.DefaultLF5Configurator.a;
		 /* if-nez v0, :cond_0 */
		 final String v0 = "org.apache.log4j.lf5.DefaultLF5Configurator"; // const-string v0, "org.apache.log4j.lf5.DefaultLF5Configurator"
		 org.apache.log4j.lf5.DefaultLF5Configurator .a ( v0 );
	 } // :cond_0
	 final String v1 = "/org/apache/log4j/lf5/config/defaultconfig.properties"; // const-string v1, "/org/apache/log4j/lf5/config/defaultconfig.properties"
	 (( java.lang.Class ) v0 ).getResource ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/Class;->getResource(Ljava/lang/String;)Ljava/net/URL;
	 if ( v0 != null) { // if-eqz v0, :cond_1
		 /* .line 2 */
		 org.apache.log4j.PropertyConfigurator .configure ( v0 );
		 return;
		 /* .line 3 */
	 } // :cond_1
	 /* new-instance v0, Ljava/io/IOException; */
	 /* new-instance v2, Ljava/lang/StringBuffer; */
	 /* invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V */
	 final String v3 = "Error: Unable to open the resource"; // const-string v3, "Error: Unable to open the resource"
	 (( java.lang.StringBuffer ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 (( java.lang.StringBuffer ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 (( java.lang.StringBuffer ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
	 /* invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V */
	 /* throw v0 */
} // .end method
/* # virtual methods */
public void doConfigure ( java.io.InputStream p0, org.apache.log4j.spi.LoggerRepository p1 ) {
	 /* .locals 0 */
	 /* .line 1 */
	 /* new-instance p1, Ljava/lang/IllegalStateException; */
	 final String p2 = "This class should NOT be instantiated!"; // const-string p2, "This class should NOT be instantiated!"
	 /* invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
	 /* throw p1 */
} // .end method
public void doConfigure ( java.net.URL p0, org.apache.log4j.spi.LoggerRepository p1 ) {
	 /* .locals 0 */
	 /* .line 2 */
	 /* new-instance p1, Ljava/lang/IllegalStateException; */
	 final String p2 = "This class should NOT be instantiated!"; // const-string p2, "This class should NOT be instantiated!"
	 /* invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
	 /* throw p1 */
} // .end method
