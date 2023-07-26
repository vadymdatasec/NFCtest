public class org.apache.log4j.helpers.OptionConverter {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static java.lang.String a;
	 public static Object b;
	 public static Integer c;
	 public static Integer d;
	 public static java.lang.Class e; //synthetic
	 public static java.lang.Class f; //synthetic
	 public static java.lang.Class g; //synthetic
	 /* # direct methods */
	 public static org.apache.log4j.helpers.OptionConverter ( ) {
		 /* .locals 0 */
		 return;
	 } // .end method
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
		 public static java.lang.String concatanateArrays ( java.lang.String[] p0, java.lang.String[] p1 ) {
			 /* .locals 3 */
			 /* .line 1 */
			 /* array-length v0, p0 */
			 /* array-length v1, p1 */
			 /* add-int/2addr v0, v1 */
			 /* .line 2 */
			 /* new-array v0, v0, [Ljava/lang/String; */
			 /* .line 3 */
			 /* array-length v1, p0 */
			 int v2 = 0; // const/4 v2, 0x0
			 java.lang.System .arraycopy ( p0,v2,v0,v2,v1 );
			 /* .line 4 */
			 /* array-length p0, p0 */
			 /* array-length v1, p1 */
			 java.lang.System .arraycopy ( p1,v2,v0,p0,v1 );
		 } // .end method
		 public static java.lang.String convertSpecialChars ( java.lang.String p0 ) {
			 /* .locals 10 */
			 /* .line 1 */
			 v0 = 			 (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
			 /* .line 2 */
			 /* new-instance v1, Ljava/lang/StringBuffer; */
			 /* invoke-direct {v1, v0}, Ljava/lang/StringBuffer;-><init>(I)V */
			 int v2 = 0; // const/4 v2, 0x0
		 } // :goto_0
		 /* if-ge v2, v0, :cond_9 */
		 /* add-int/lit8 v3, v2, 0x1 */
		 /* .line 3 */
		 v2 = 		 (( java.lang.String ) p0 ).charAt ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C
		 /* const/16 v4, 0x27 */
		 /* const/16 v5, 0x22 */
		 /* const/16 v6, 0x8 */
		 /* const/16 v7, 0x5c */
		 /* if-ne v2, v7, :cond_8 */
		 /* add-int/lit8 v2, v3, 0x1 */
		 /* .line 4 */
		 v3 = 		 (( java.lang.String ) p0 ).charAt ( v3 ); // invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C
		 /* const/16 v8, 0x6e */
		 /* if-ne v3, v8, :cond_0 */
		 /* const/16 v3, 0xa */
		 /* move v3, v2 */
		 /* const/16 v2, 0xa */
	 } // :cond_0
	 /* const/16 v8, 0x72 */
	 /* if-ne v3, v8, :cond_1 */
	 /* const/16 v3, 0xd */
	 /* move v3, v2 */
	 /* const/16 v2, 0xd */
} // :cond_1
/* const/16 v8, 0x74 */
/* if-ne v3, v8, :cond_2 */
/* const/16 v3, 0x9 */
/* move v3, v2 */
/* const/16 v2, 0x9 */
} // :cond_2
/* const/16 v8, 0x66 */
/* if-ne v3, v8, :cond_3 */
/* const/16 v3, 0xc */
/* move v3, v2 */
/* const/16 v2, 0xc */
} // :cond_3
/* if-ne v3, v6, :cond_4 */
/* move v3, v2 */
/* const/16 v2, 0x8 */
} // :cond_4
/* if-ne v3, v5, :cond_5 */
/* move v3, v2 */
/* const/16 v2, 0x22 */
} // :cond_5
/* if-ne v3, v4, :cond_6 */
/* move v3, v2 */
/* const/16 v2, 0x27 */
} // :cond_6
/* if-ne v3, v7, :cond_7 */
/* move v3, v2 */
/* const/16 v2, 0x5c */
} // :cond_7
/* move v9, v3 */
/* move v3, v2 */
/* move v2, v9 */
/* .line 5 */
} // :cond_8
} // :goto_1
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
/* move v2, v3 */
/* .line 6 */
} // :cond_9
(( java.lang.StringBuffer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
} // .end method
public static java.lang.String findAndSubst ( java.lang.String p0, java.util.Properties p1 ) {
/* .locals 2 */
/* .line 1 */
(( java.util.Properties ) p1 ).getProperty ( p0 ); // invoke-virtual {p1, p0}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;
/* if-nez p0, :cond_0 */
int p0 = 0; // const/4 p0, 0x0
/* .line 2 */
} // :cond_0
try { // :try_start_0
org.apache.log4j.helpers.OptionConverter .substVars ( p0,p1 );
/* :try_end_0 */
/* .catch Ljava/lang/IllegalArgumentException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p1 */
/* .line 3 */
/* new-instance v0, Ljava/lang/StringBuffer; */
/* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
final String v1 = "Bad option value ["; // const-string v1, "Bad option value ["
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v0 ).append ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v1 = "]."; // const-string v1, "]."
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .error ( v0,p1 );
} // .end method
public static java.lang.String getSystemProperty ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 2 */
/* .line 1 */
try { // :try_start_0
java.lang.System .getProperty ( p0,p1 );
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 2 */
/* :catchall_0 */
/* new-instance v0, Ljava/lang/StringBuffer; */
/* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
final String v1 = "Was not allowed to read system property \""; // const-string v1, "Was not allowed to read system property \""
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v0 ).append ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String p0 = "\"."; // const-string p0, "\"."
(( java.lang.StringBuffer ) v0 ).append ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .debug ( p0 );
} // .end method
public static java.lang.Object instantiateByClassName ( java.lang.String p0, java.lang.Class p1, java.lang.Object p2 ) {
/* .locals 5 */
final String v0 = "Could not instantiate class ["; // const-string v0, "Could not instantiate class ["
final String v1 = "]."; // const-string v1, "]."
if ( p0 != null) { // if-eqz p0, :cond_1
/* .line 1 */
try { // :try_start_0
org.apache.log4j.helpers.Loader .loadClass ( p0 );
/* .line 2 */
v3 = (( java.lang.Class ) p1 ).isAssignableFrom ( v2 ); // invoke-virtual {p1, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
/* if-nez v3, :cond_0 */
/* .line 3 */
/* new-instance v3, Ljava/lang/StringBuffer; */
/* invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V */
final String v4 = "A \""; // const-string v4, "A \""
(( java.lang.StringBuffer ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v3 ).append ( p0 ); // invoke-virtual {v3, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v4 = "\" object is not assignable to a \""; // const-string v4, "\" object is not assignable to a \""
(( java.lang.StringBuffer ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.Class ) p1 ).getName ( ); // invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;
(( java.lang.StringBuffer ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v4 = "\" variable."; // const-string v4, "\" variable."
(( java.lang.StringBuffer ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .error ( v3 );
/* .line 4 */
/* new-instance v3, Ljava/lang/StringBuffer; */
/* invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V */
final String v4 = "The class \""; // const-string v4, "The class \""
(( java.lang.StringBuffer ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.Class ) p1 ).getName ( ); // invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;
(( java.lang.StringBuffer ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v4 = "\" was loaded by "; // const-string v4, "\" was loaded by "
(( java.lang.StringBuffer ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .error ( v3 );
/* .line 5 */
/* new-instance v3, Ljava/lang/StringBuffer; */
/* invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V */
final String v4 = "["; // const-string v4, "["
(( java.lang.StringBuffer ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.Class ) p1 ).getClassLoader ( ); // invoke-virtual {p1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;
(( java.lang.StringBuffer ) v3 ).append ( p1 ); // invoke-virtual {v3, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;
final String p1 = "] whereas object of type "; // const-string p1, "] whereas object of type "
(( java.lang.StringBuffer ) v3 ).append ( p1 ); // invoke-virtual {v3, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .error ( p1 );
/* .line 6 */
/* new-instance p1, Ljava/lang/StringBuffer; */
/* invoke-direct {p1}, Ljava/lang/StringBuffer;-><init>()V */
final String v3 = "\""; // const-string v3, "\""
(( java.lang.StringBuffer ) p1 ).append ( v3 ); // invoke-virtual {p1, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.Class ) v2 ).getName ( ); // invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;
(( java.lang.StringBuffer ) p1 ).append ( v3 ); // invoke-virtual {p1, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v3 = "\" was loaded by ["; // const-string v3, "\" was loaded by ["
(( java.lang.StringBuffer ) p1 ).append ( v3 ); // invoke-virtual {p1, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.Class ) v2 ).getClassLoader ( ); // invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;
(( java.lang.StringBuffer ) p1 ).append ( v2 ); // invoke-virtual {p1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) p1 ).append ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .error ( p1 );
/* .line 7 */
} // :cond_0
(( java.lang.Class ) v2 ).newInstance ( ); // invoke-virtual {v2}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;
/* :try_end_0 */
/* .catch Ljava/lang/ClassNotFoundException; {:try_start_0 ..:try_end_0} :catch_3 */
/* .catch Ljava/lang/IllegalAccessException; {:try_start_0 ..:try_end_0} :catch_2 */
/* .catch Ljava/lang/InstantiationException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Ljava/lang/RuntimeException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p1 */
/* .line 8 */
/* new-instance v2, Ljava/lang/StringBuffer; */
/* invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V */
(( java.lang.StringBuffer ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v2 ).append ( p0 ); // invoke-virtual {v2, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .error ( p0,p1 );
/* :catch_1 */
/* move-exception p1 */
/* .line 9 */
/* new-instance v2, Ljava/lang/StringBuffer; */
/* invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V */
(( java.lang.StringBuffer ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v2 ).append ( p0 ); // invoke-virtual {v2, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .error ( p0,p1 );
/* :catch_2 */
/* move-exception p1 */
/* .line 10 */
/* new-instance v2, Ljava/lang/StringBuffer; */
/* invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V */
(( java.lang.StringBuffer ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v2 ).append ( p0 ); // invoke-virtual {v2, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .error ( p0,p1 );
/* :catch_3 */
/* move-exception p1 */
/* .line 11 */
/* new-instance v2, Ljava/lang/StringBuffer; */
/* invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V */
(( java.lang.StringBuffer ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v2 ).append ( p0 ); // invoke-virtual {v2, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .error ( p0,p1 );
} // :cond_1
} // :goto_0
} // .end method
public static java.lang.Object instantiateByKey ( java.util.Properties p0, java.lang.String p1, java.lang.Class p2, java.lang.Object p3 ) {
/* .locals 0 */
/* .line 1 */
org.apache.log4j.helpers.OptionConverter .findAndSubst ( p1,p0 );
/* if-nez p0, :cond_0 */
/* .line 2 */
/* new-instance p0, Ljava/lang/StringBuffer; */
/* invoke-direct {p0}, Ljava/lang/StringBuffer;-><init>()V */
final String p2 = "Could not find value for key "; // const-string p2, "Could not find value for key "
(( java.lang.StringBuffer ) p0 ).append ( p2 ); // invoke-virtual {p0, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) p0 ).append ( p1 ); // invoke-virtual {p0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) p0 ).toString ( ); // invoke-virtual {p0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .error ( p0 );
/* .line 3 */
} // :cond_0
(( java.lang.String ) p0 ).trim ( ); // invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;
org.apache.log4j.helpers.OptionConverter .instantiateByClassName ( p0,p2,p3 );
} // .end method
public static void selectAndConfigure ( java.io.InputStream p0, java.lang.String p1, org.apache.log4j.spi.LoggerRepository p2 ) {
/* .locals 2 */
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 1 */
/* new-instance v0, Ljava/lang/StringBuffer; */
/* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
final String v1 = "Preferred configurator class: "; // const-string v1, "Preferred configurator class: "
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .debug ( v0 );
/* .line 2 */
v0 = org.apache.log4j.helpers.OptionConverter.g;
/* if-nez v0, :cond_0 */
final String v0 = "org.apache.log4j.spi.Configurator"; // const-string v0, "org.apache.log4j.spi.Configurator"
org.apache.log4j.helpers.OptionConverter .a ( v0 );
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
org.apache.log4j.helpers.OptionConverter .instantiateByClassName ( p1,v0,v1 );
/* check-cast v0, Lorg/apache/log4j/spi/Configurator; */
/* if-nez v0, :cond_2 */
/* .line 3 */
/* new-instance p0, Ljava/lang/StringBuffer; */
/* invoke-direct {p0}, Ljava/lang/StringBuffer;-><init>()V */
final String p2 = "Could not instantiate configurator ["; // const-string p2, "Could not instantiate configurator ["
(( java.lang.StringBuffer ) p0 ).append ( p2 ); // invoke-virtual {p0, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) p0 ).append ( p1 ); // invoke-virtual {p0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String p1 = "]."; // const-string p1, "]."
(( java.lang.StringBuffer ) p0 ).append ( p1 ); // invoke-virtual {p0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) p0 ).toString ( ); // invoke-virtual {p0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .error ( p0 );
return;
/* .line 4 */
} // :cond_1
/* new-instance v0, Lorg/apache/log4j/PropertyConfigurator; */
/* invoke-direct {v0}, Lorg/apache/log4j/PropertyConfigurator;-><init>()V */
/* .line 5 */
} // :cond_2
return;
} // .end method
public static void selectAndConfigure ( java.net.URL p0, java.lang.String p1, org.apache.log4j.spi.LoggerRepository p2 ) {
/* .locals 2 */
/* .line 6 */
(( java.net.URL ) p0 ).getFile ( ); // invoke-virtual {p0}, Ljava/net/URL;->getFile()Ljava/lang/String;
/* if-nez p1, :cond_0 */
if ( v0 != null) { // if-eqz v0, :cond_0
final String v1 = ".xml"; // const-string v1, ".xml"
/* .line 7 */
v0 = (( java.lang.String ) v0 ).endsWith ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
final String p1 = "org.apache.log4j.xml.DOMConfigurator"; // const-string p1, "org.apache.log4j.xml.DOMConfigurator"
} // :cond_0
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 8 */
/* new-instance v0, Ljava/lang/StringBuffer; */
/* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
final String v1 = "Preferred configurator class: "; // const-string v1, "Preferred configurator class: "
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .debug ( v0 );
/* .line 9 */
v0 = org.apache.log4j.helpers.OptionConverter.g;
/* if-nez v0, :cond_1 */
final String v0 = "org.apache.log4j.spi.Configurator"; // const-string v0, "org.apache.log4j.spi.Configurator"
org.apache.log4j.helpers.OptionConverter .a ( v0 );
} // :cond_1
int v1 = 0; // const/4 v1, 0x0
org.apache.log4j.helpers.OptionConverter .instantiateByClassName ( p1,v0,v1 );
/* check-cast v0, Lorg/apache/log4j/spi/Configurator; */
/* if-nez v0, :cond_3 */
/* .line 10 */
/* new-instance p0, Ljava/lang/StringBuffer; */
/* invoke-direct {p0}, Ljava/lang/StringBuffer;-><init>()V */
final String p2 = "Could not instantiate configurator ["; // const-string p2, "Could not instantiate configurator ["
(( java.lang.StringBuffer ) p0 ).append ( p2 ); // invoke-virtual {p0, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) p0 ).append ( p1 ); // invoke-virtual {p0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String p1 = "]."; // const-string p1, "]."
(( java.lang.StringBuffer ) p0 ).append ( p1 ); // invoke-virtual {p0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) p0 ).toString ( ); // invoke-virtual {p0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .error ( p0 );
return;
/* .line 11 */
} // :cond_2
/* new-instance v0, Lorg/apache/log4j/PropertyConfigurator; */
/* invoke-direct {v0}, Lorg/apache/log4j/PropertyConfigurator;-><init>()V */
/* .line 12 */
} // :cond_3
return;
} // .end method
public static java.lang.String substVars ( java.lang.String p0, java.util.Properties p1 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/IllegalArgumentException; */
/* } */
} // .end annotation
/* .line 1 */
/* new-instance v0, Ljava/lang/StringBuffer; */
/* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
int v1 = 0; // const/4 v1, 0x0
/* .line 2 */
} // :goto_0
v2 = org.apache.log4j.helpers.OptionConverter.a;
v2 = (( java.lang.String ) p0 ).indexOf ( v2, v1 ); // invoke-virtual {p0, v2, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I
int v3 = -1; // const/4 v3, -0x1
/* if-ne v2, v3, :cond_1 */
/* if-nez v1, :cond_0 */
/* .line 3 */
} // :cond_0
p1 = (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
(( java.lang.String ) p0 ).substring ( v1, p1 ); // invoke-virtual {p0, v1, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;
(( java.lang.StringBuffer ) v0 ).append ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 4 */
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
/* .line 5 */
} // :cond_1
(( java.lang.String ) p0 ).substring ( v1, v2 ); // invoke-virtual {p0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 6 */
/* sget-char v1, Lorg/apache/log4j/helpers/OptionConverter;->b:C */
v1 = (( java.lang.String ) p0 ).indexOf ( v1, v2 ); // invoke-virtual {p0, v1, v2}, Ljava/lang/String;->indexOf(II)I
/* if-eq v1, v3, :cond_4 */
/* .line 7 */
/* add-int/2addr v2, v3 */
/* .line 8 */
(( java.lang.String ) p0 ).substring ( v2, v1 ); // invoke-virtual {p0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;
int v3 = 0; // const/4 v3, 0x0
/* .line 9 */
org.apache.log4j.helpers.OptionConverter .getSystemProperty ( v2,v3 );
/* if-nez v3, :cond_2 */
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 10 */
(( java.util.Properties ) p1 ).getProperty ( v2 ); // invoke-virtual {p1, v2}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;
} // :cond_2
if ( v3 != null) { // if-eqz v3, :cond_3
/* .line 11 */
org.apache.log4j.helpers.OptionConverter .substVars ( v3,p1 );
/* .line 12 */
(( java.lang.StringBuffer ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 13 */
} // :cond_3
/* add-int/2addr v1, v2 */
/* .line 14 */
} // :cond_4
/* new-instance p1, Ljava/lang/IllegalArgumentException; */
/* new-instance v0, Ljava/lang/StringBuffer; */
/* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
/* const/16 v1, 0x22 */
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v0 ).append ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String p0 = "\" has no closing brace.Opening brace at position "; // const-string p0, "\" has no closing brace.Opening brace at position "
(( java.lang.StringBuffer ) v0 ).append ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;
/* const/16 p0, 0x2e */
(( java.lang.StringBuffer ) v0 ).append ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
/* invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public static Boolean toBoolean ( java.lang.String p0, Boolean p1 ) {
/* .locals 1 */
/* if-nez p0, :cond_0 */
/* .line 1 */
} // :cond_0
(( java.lang.String ) p0 ).trim ( ); // invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;
final String v0 = "true"; // const-string v0, "true"
/* .line 2 */
v0 = (( java.lang.String ) v0 ).equalsIgnoreCase ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
int p0 = 1; // const/4 p0, 0x1
} // :cond_1
final String v0 = "false"; // const-string v0, "false"
/* .line 3 */
p0 = (( java.lang.String ) v0 ).equalsIgnoreCase ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( p0 != null) { // if-eqz p0, :cond_2
int p0 = 0; // const/4 p0, 0x0
} // :cond_2
} // .end method
public static Long toFileSize ( java.lang.String p0, Long p1 ) {
/* .locals 6 */
/* if-nez p0, :cond_0 */
/* return-wide p1 */
/* .line 1 */
} // :cond_0
(( java.lang.String ) p0 ).trim ( ); // invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;
(( java.lang.String ) v0 ).toUpperCase ( ); // invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;
/* const-wide/16 v1, 0x1 */
final String v3 = "KB"; // const-string v3, "KB"
/* .line 2 */
v3 = (( java.lang.String ) v0 ).indexOf ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
int v4 = 0; // const/4 v4, 0x0
int v5 = -1; // const/4 v5, -0x1
/* if-eq v3, v5, :cond_1 */
/* const-wide/16 v1, 0x400 */
/* .line 3 */
(( java.lang.String ) v0 ).substring ( v4, v3 ); // invoke-virtual {v0, v4, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;
} // :cond_1
final String v3 = "MB"; // const-string v3, "MB"
/* .line 4 */
v3 = (( java.lang.String ) v0 ).indexOf ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
/* if-eq v3, v5, :cond_2 */
/* const-wide/32 v1, 0x100000 */
/* .line 5 */
(( java.lang.String ) v0 ).substring ( v4, v3 ); // invoke-virtual {v0, v4, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;
} // :cond_2
final String v3 = "GB"; // const-string v3, "GB"
/* .line 6 */
v3 = (( java.lang.String ) v0 ).indexOf ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
/* if-eq v3, v5, :cond_3 */
/* const-wide/32 v1, 0x40000000 */
/* .line 7 */
(( java.lang.String ) v0 ).substring ( v4, v3 ); // invoke-virtual {v0, v4, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;
} // :cond_3
} // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 8 */
try { // :try_start_0
java.lang.Long .valueOf ( v0 );
(( java.lang.Long ) v3 ).longValue ( ); // invoke-virtual {v3}, Ljava/lang/Long;->longValue()J
/* move-result-wide p0 */
/* :try_end_0 */
/* .catch Ljava/lang/NumberFormatException; {:try_start_0 ..:try_end_0} :catch_0 */
/* mul-long p0, p0, v1 */
/* return-wide p0 */
/* :catch_0 */
/* move-exception v1 */
/* .line 9 */
/* new-instance v2, Ljava/lang/StringBuffer; */
/* invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V */
final String v3 = "["; // const-string v3, "["
(( java.lang.StringBuffer ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v0 = "] is not in proper int form."; // const-string v0, "] is not in proper int form."
(( java.lang.StringBuffer ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .error ( v0 );
/* .line 10 */
/* new-instance v0, Ljava/lang/StringBuffer; */
/* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
(( java.lang.StringBuffer ) v0 ).append ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v0 ).append ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String p0 = "] not in expected format."; // const-string p0, "] not in expected format."
(( java.lang.StringBuffer ) v0 ).append ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .error ( p0,v1 );
} // :cond_4
/* return-wide p1 */
} // .end method
public static Integer toInt ( java.lang.String p0, Integer p1 ) {
/* .locals 3 */
if ( p0 != null) { // if-eqz p0, :cond_0
/* .line 1 */
(( java.lang.String ) p0 ).trim ( ); // invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;
/* .line 2 */
try { // :try_start_0
java.lang.Integer .valueOf ( p0 );
p0 = (( java.lang.Integer ) v0 ).intValue ( ); // invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
/* :try_end_0 */
/* .catch Ljava/lang/NumberFormatException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
/* .line 3 */
/* new-instance v1, Ljava/lang/StringBuffer; */
/* invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V */
final String v2 = "["; // const-string v2, "["
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String p0 = "] is not in proper int form."; // const-string p0, "] is not in proper int form."
(( java.lang.StringBuffer ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .error ( p0 );
/* .line 4 */
(( java.lang.NumberFormatException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/NumberFormatException;->printStackTrace()V
} // :cond_0
} // .end method
public static org.apache.log4j.Level toLevel ( java.lang.String p0, org.apache.log4j.Level p1 ) {
/* .locals 11 */
final String v0 = "class ["; // const-string v0, "class ["
final String v1 = "custom level class ["; // const-string v1, "custom level class ["
/* if-nez p0, :cond_0 */
/* .line 1 */
} // :cond_0
(( java.lang.String ) p0 ).trim ( ); // invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;
/* const/16 v2, 0x23 */
/* .line 2 */
v2 = (( java.lang.String ) p0 ).indexOf ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/String;->indexOf(I)I
int v3 = -1; // const/4 v3, -0x1
final String v4 = "NULL"; // const-string v4, "NULL"
int v5 = 0; // const/4 v5, 0x0
/* if-ne v2, v3, :cond_2 */
/* .line 3 */
v0 = (( java.lang.String ) v4 ).equalsIgnoreCase ( p0 ); // invoke-virtual {v4, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 4 */
} // :cond_1
org.apache.log4j.Level .toLevel ( p0,p1 );
} // :cond_2
/* add-int/lit8 v3, v2, 0x1 */
/* .line 5 */
(( java.lang.String ) p0 ).substring ( v3 ); // invoke-virtual {p0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;
int v6 = 0; // const/4 v6, 0x0
/* .line 6 */
(( java.lang.String ) p0 ).substring ( v6, v2 ); // invoke-virtual {p0, v6, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;
/* .line 7 */
v2 = (( java.lang.String ) v4 ).equalsIgnoreCase ( p0 ); // invoke-virtual {v4, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v2 != null) { // if-eqz v2, :cond_3
/* .line 8 */
} // :cond_3
/* new-instance v2, Ljava/lang/StringBuffer; */
/* invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V */
final String v4 = "toLevel:class=["; // const-string v4, "toLevel:class=["
(( java.lang.StringBuffer ) v2 ).append ( v4 ); // invoke-virtual {v2, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v4 = "]"; // const-string v4, "]"
(( java.lang.StringBuffer ) v2 ).append ( v4 ); // invoke-virtual {v2, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v7 = ":pri=["; // const-string v7, ":pri=["
(( java.lang.StringBuffer ) v2 ).append ( v7 ); // invoke-virtual {v2, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v2 ).append ( p0 ); // invoke-virtual {v2, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v2 ).append ( v4 ); // invoke-virtual {v2, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .debug ( v2 );
/* .line 9 */
try { // :try_start_0
org.apache.log4j.helpers.Loader .loadClass ( v3 );
int v7 = 2; // const/4 v7, 0x2
/* new-array v8, v7, [Ljava/lang/Class; */
/* .line 10 */
v9 = org.apache.log4j.helpers.OptionConverter.e;
/* if-nez v9, :cond_4 */
final String v9 = "java.lang.String"; // const-string v9, "java.lang.String"
org.apache.log4j.helpers.OptionConverter .a ( v9 );
} // :cond_4
v9 = org.apache.log4j.helpers.OptionConverter.e;
} // :goto_0
/* aput-object v9, v8, v6 */
v9 = org.apache.log4j.helpers.OptionConverter.f;
/* if-nez v9, :cond_5 */
final String v9 = "org.apache.log4j.Level"; // const-string v9, "org.apache.log4j.Level"
org.apache.log4j.helpers.OptionConverter .a ( v9 );
} // :cond_5
v9 = org.apache.log4j.helpers.OptionConverter.f;
} // :goto_1
int v10 = 1; // const/4 v10, 0x1
/* aput-object v9, v8, v10 */
final String v9 = "toLevel"; // const-string v9, "toLevel"
/* .line 11 */
(( java.lang.Class ) v2 ).getMethod ( v9, v8 ); // invoke-virtual {v2, v9, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
/* new-array v7, v7, [Ljava/lang/Object; */
/* aput-object p0, v7, v6 */
/* aput-object p1, v7, v10 */
/* .line 12 */
(( java.lang.reflect.Method ) v2 ).invoke ( v5, v7 ); // invoke-virtual {v2, v5, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/* .line 13 */
/* check-cast v2, Lorg/apache/log4j/Level; */
/* :try_end_0 */
/* .catch Ljava/lang/ClassNotFoundException; {:try_start_0 ..:try_end_0} :catch_5 */
/* .catch Ljava/lang/NoSuchMethodException; {:try_start_0 ..:try_end_0} :catch_4 */
/* .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 ..:try_end_0} :catch_3 */
/* .catch Ljava/lang/ClassCastException; {:try_start_0 ..:try_end_0} :catch_2 */
/* .catch Ljava/lang/IllegalAccessException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Ljava/lang/RuntimeException; {:try_start_0 ..:try_end_0} :catch_0 */
/* move-object p1, v2 */
/* goto/16 :goto_2 */
/* :catch_0 */
/* move-exception v1 */
/* .line 14 */
/* new-instance v2, Ljava/lang/StringBuffer; */
/* invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V */
(( java.lang.StringBuffer ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v0 = "], level ["; // const-string v0, "], level ["
(( java.lang.StringBuffer ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v2 ).append ( p0 ); // invoke-virtual {v2, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String p0 = "] conversion failed."; // const-string p0, "] conversion failed."
(( java.lang.StringBuffer ) v2 ).append ( p0 ); // invoke-virtual {v2, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .warn ( p0,v1 );
/* goto/16 :goto_2 */
/* :catch_1 */
/* move-exception p0 */
/* .line 15 */
/* new-instance v1, Ljava/lang/StringBuffer; */
/* invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V */
(( java.lang.StringBuffer ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v0 = "] cannot be instantiated due to access restrictions"; // const-string v0, "] cannot be instantiated due to access restrictions"
(( java.lang.StringBuffer ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .warn ( v0,p0 );
/* goto/16 :goto_2 */
/* :catch_2 */
/* move-exception p0 */
/* .line 16 */
/* new-instance v1, Ljava/lang/StringBuffer; */
/* invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V */
(( java.lang.StringBuffer ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v0 = "] is not a subclass of org.apache.log4j.Level"; // const-string v0, "] is not a subclass of org.apache.log4j.Level"
(( java.lang.StringBuffer ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .warn ( v0,p0 );
/* :catch_3 */
/* move-exception p0 */
/* .line 17 */
(( java.lang.reflect.InvocationTargetException ) p0 ).getTargetException ( ); // invoke-virtual {p0}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;
/* instance-of v0, v0, Ljava/lang/InterruptedException; */
/* if-nez v0, :cond_6 */
(( java.lang.reflect.InvocationTargetException ) p0 ).getTargetException ( ); // invoke-virtual {p0}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;
/* instance-of v0, v0, Ljava/io/InterruptedIOException; */
if ( v0 != null) { // if-eqz v0, :cond_7
/* .line 18 */
} // :cond_6
java.lang.Thread .currentThread ( );
(( java.lang.Thread ) v0 ).interrupt ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V
/* .line 19 */
} // :cond_7
/* new-instance v0, Ljava/lang/StringBuffer; */
/* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v0 ).append ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v0 ).append ( v4 ); // invoke-virtual {v0, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v1 = " could not be instantiated"; // const-string v1, " could not be instantiated"
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .warn ( v0,p0 );
/* :catch_4 */
/* move-exception p0 */
/* .line 20 */
/* new-instance v0, Ljava/lang/StringBuffer; */
/* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v0 ).append ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v0 ).append ( v4 ); // invoke-virtual {v0, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v1 = " does not have a class function toLevel(String, Level)"; // const-string v1, " does not have a class function toLevel(String, Level)"
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .warn ( v0,p0 );
/* .line 21 */
/* :catch_5 */
/* new-instance p0, Ljava/lang/StringBuffer; */
/* invoke-direct {p0}, Ljava/lang/StringBuffer;-><init>()V */
(( java.lang.StringBuffer ) p0 ).append ( v1 ); // invoke-virtual {p0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) p0 ).append ( v3 ); // invoke-virtual {p0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v0 = "] not found."; // const-string v0, "] not found."
(( java.lang.StringBuffer ) p0 ).append ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) p0 ).toString ( ); // invoke-virtual {p0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .warn ( p0 );
} // :goto_2
} // .end method
