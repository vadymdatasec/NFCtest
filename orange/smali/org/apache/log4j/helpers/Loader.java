public class org.apache.log4j.helpers.Loader {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static Boolean a;
	 public static Boolean b;
	 public static java.lang.Class c; //synthetic
	 public static java.lang.Class d; //synthetic
	 /* # direct methods */
	 public static org.apache.log4j.helpers.Loader ( ) {
		 /* .locals 5 */
		 int v0 = 0; // const/4 v0, 0x0
		 final String v1 = "java.version"; // const-string v1, "java.version"
		 /* .line 1 */
		 org.apache.log4j.helpers.OptionConverter .getSystemProperty ( v1,v0 );
		 int v2 = 1; // const/4 v2, 0x1
		 if ( v1 != null) { // if-eqz v1, :cond_0
			 /* const/16 v3, 0x2e */
			 /* .line 2 */
			 v3 = 			 (( java.lang.String ) v1 ).indexOf ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->indexOf(I)I
			 int v4 = -1; // const/4 v4, -0x1
			 /* if-eq v3, v4, :cond_0 */
			 /* add-int/2addr v3, v2 */
			 /* .line 3 */
			 v1 = 			 (( java.lang.String ) v1 ).charAt ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->charAt(I)C
			 /* const/16 v3, 0x31 */
			 /* if-eq v1, v3, :cond_0 */
			 int v1 = 0; // const/4 v1, 0x0
			 /* .line 4 */
			 org.apache.log4j.helpers.Loader.a = (v1!= 0);
		 } // :cond_0
		 final String v1 = "log4j.ignoreTCL"; // const-string v1, "log4j.ignoreTCL"
		 /* .line 5 */
		 org.apache.log4j.helpers.OptionConverter .getSystemProperty ( v1,v0 );
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 /* .line 6 */
			 v0 = 			 org.apache.log4j.helpers.OptionConverter .toBoolean ( v0,v2 );
			 org.apache.log4j.helpers.Loader.b = (v0!= 0);
		 } // :cond_1
		 return;
	 } // .end method
	 public org.apache.log4j.helpers.Loader ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
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
		 public static java.lang.ClassLoader a ( ) {
			 /* .locals 3 */
			 /* .annotation system Ldalvik/annotation/Throws; */
			 /* value = { */
			 /* Ljava/lang/IllegalAccessException;, */
			 /* Ljava/lang/reflect/InvocationTargetException; */
			 /* } */
		 } // .end annotation
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 2 */
		 try { // :try_start_0
			 v1 = org.apache.log4j.helpers.Loader.d;
			 /* if-nez v1, :cond_0 */
			 final String v1 = "java.lang.Thread"; // const-string v1, "java.lang.Thread"
			 org.apache.log4j.helpers.Loader .a ( v1 );
		 } // :cond_0
		 v1 = org.apache.log4j.helpers.Loader.d;
	 } // :goto_0
	 final String v2 = "getContextClassLoader"; // const-string v2, "getContextClassLoader"
	 (( java.lang.Class ) v1 ).getMethod ( v2, v0 ); // invoke-virtual {v1, v2, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
	 /* :try_end_0 */
	 /* .catch Ljava/lang/NoSuchMethodException; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* .line 3 */
	 java.lang.Thread .currentThread ( );
	 (( java.lang.reflect.Method ) v1 ).invoke ( v2, v0 ); // invoke-virtual {v1, v2, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
	 /* check-cast v0, Ljava/lang/ClassLoader; */
	 /* :catch_0 */
} // .end method
public static java.net.URL getResource ( java.lang.String p0 ) {
	 /* .locals 5 */
	 final String v0 = "Trying to find ["; // const-string v0, "Trying to find ["
	 final String v1 = "Caught Exception while in Loader.getResource.This may be innocuous."; // const-string v1, "Caught Exception while in Loader.getResource.This may be innocuous."
	 /* .line 2 */
	 try { // :try_start_0
		 /* sget-boolean v2, Lorg/apache/log4j/helpers/Loader;->a:Z */
		 /* if-nez v2, :cond_0 */
		 /* sget-boolean v2, Lorg/apache/log4j/helpers/Loader;->b:Z */
		 /* if-nez v2, :cond_0 */
		 /* .line 3 */
		 org.apache.log4j.helpers.Loader .a ( );
		 if ( v2 != null) { // if-eqz v2, :cond_0
			 /* .line 4 */
			 /* new-instance v3, Ljava/lang/StringBuffer; */
			 /* invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V */
			 (( java.lang.StringBuffer ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
			 (( java.lang.StringBuffer ) v3 ).append ( p0 ); // invoke-virtual {v3, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
			 final String v4 = "] using context classloader "; // const-string v4, "] using context classloader "
			 (( java.lang.StringBuffer ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
			 (( java.lang.StringBuffer ) v3 ).append ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;
			 final String v4 = "."; // const-string v4, "."
			 (( java.lang.StringBuffer ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
			 (( java.lang.StringBuffer ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
			 org.apache.log4j.helpers.LogLog .debug ( v3 );
			 /* .line 5 */
			 (( java.lang.ClassLoader ) v2 ).getResource ( p0 ); // invoke-virtual {v2, p0}, Ljava/lang/ClassLoader;->getResource(Ljava/lang/String;)Ljava/net/URL;
			 if ( v2 != null) { // if-eqz v2, :cond_0
				 /* .line 6 */
			 } // :cond_0
			 v2 = org.apache.log4j.helpers.Loader.c;
			 /* if-nez v2, :cond_1 */
			 final String v2 = "org.apache.log4j.helpers.Loader"; // const-string v2, "org.apache.log4j.helpers.Loader"
			 org.apache.log4j.helpers.Loader .a ( v2 );
		 } // :cond_1
		 v2 = org.apache.log4j.helpers.Loader.c;
	 } // :goto_0
	 (( java.lang.Class ) v2 ).getClassLoader ( ); // invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;
	 if ( v2 != null) { // if-eqz v2, :cond_4
		 /* .line 7 */
		 /* new-instance v3, Ljava/lang/StringBuffer; */
		 /* invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V */
		 (( java.lang.StringBuffer ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 (( java.lang.StringBuffer ) v3 ).append ( p0 ); // invoke-virtual {v3, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 final String v4 = "] using "; // const-string v4, "] using "
		 (( java.lang.StringBuffer ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 (( java.lang.StringBuffer ) v3 ).append ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;
		 final String v4 = " class loader."; // const-string v4, " class loader."
		 (( java.lang.StringBuffer ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 (( java.lang.StringBuffer ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
		 org.apache.log4j.helpers.LogLog .debug ( v3 );
		 /* .line 8 */
		 (( java.lang.ClassLoader ) v2 ).getResource ( p0 ); // invoke-virtual {v2, p0}, Ljava/lang/ClassLoader;->getResource(Ljava/lang/String;)Ljava/net/URL;
		 /* :try_end_0 */
		 /* .catch Ljava/lang/IllegalAccessException; {:try_start_0 ..:try_end_0} :catch_1 */
		 /* .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
		 if ( v1 != null) { // if-eqz v1, :cond_4
			 /* :catchall_0 */
			 /* move-exception v2 */
			 /* .line 9 */
			 org.apache.log4j.helpers.LogLog .warn ( v1,v2 );
			 /* :catch_0 */
			 /* move-exception v2 */
			 /* .line 10 */
			 (( java.lang.reflect.InvocationTargetException ) v2 ).getTargetException ( ); // invoke-virtual {v2}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;
			 /* instance-of v3, v3, Ljava/lang/InterruptedException; */
			 /* if-nez v3, :cond_2 */
			 (( java.lang.reflect.InvocationTargetException ) v2 ).getTargetException ( ); // invoke-virtual {v2}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;
			 /* instance-of v3, v3, Ljava/io/InterruptedIOException; */
			 if ( v3 != null) { // if-eqz v3, :cond_3
				 /* .line 11 */
			 } // :cond_2
			 java.lang.Thread .currentThread ( );
			 (( java.lang.Thread ) v3 ).interrupt ( ); // invoke-virtual {v3}, Ljava/lang/Thread;->interrupt()V
			 /* .line 12 */
		 } // :cond_3
		 org.apache.log4j.helpers.LogLog .warn ( v1,v2 );
		 /* :catch_1 */
		 /* move-exception v2 */
		 /* .line 13 */
		 org.apache.log4j.helpers.LogLog .warn ( v1,v2 );
		 /* .line 14 */
	 } // :cond_4
} // :goto_1
/* new-instance v1, Ljava/lang/StringBuffer; */
/* invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V */
(( java.lang.StringBuffer ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v0 = "] using ClassLoader.getSystemResource()."; // const-string v0, "] using ClassLoader.getSystemResource()."
(( java.lang.StringBuffer ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .debug ( v0 );
/* .line 15 */
java.lang.ClassLoader .getSystemResource ( p0 );
} // .end method
public static java.net.URL getResource ( java.lang.String p0, java.lang.Class p1 ) {
/* .locals 0 */
/* .line 1 */
org.apache.log4j.helpers.Loader .getResource ( p0 );
} // .end method
public static Boolean isJava1 ( ) {
/* .locals 1 */
/* .line 1 */
/* sget-boolean v0, Lorg/apache/log4j/helpers/Loader;->a:Z */
} // .end method
public static java.lang.Class loadClass ( java.lang.String p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/ClassNotFoundException; */
/* } */
} // .end annotation
/* .line 1 */
/* sget-boolean v0, Lorg/apache/log4j/helpers/Loader;->a:Z */
/* if-nez v0, :cond_3 */
/* sget-boolean v0, Lorg/apache/log4j/helpers/Loader;->b:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
} // :cond_0
try { // :try_start_0
org.apache.log4j.helpers.Loader .a ( );
(( java.lang.ClassLoader ) v0 ).loadClass ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;
/* :try_end_0 */
/* .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* :catch_0 */
/* move-exception v0 */
/* .line 3 */
(( java.lang.reflect.InvocationTargetException ) v0 ).getTargetException ( ); // invoke-virtual {v0}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;
/* instance-of v1, v1, Ljava/lang/InterruptedException; */
/* if-nez v1, :cond_1 */
(( java.lang.reflect.InvocationTargetException ) v0 ).getTargetException ( ); // invoke-virtual {v0}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;
/* instance-of v0, v0, Ljava/io/InterruptedIOException; */
if ( v0 != null) { // if-eqz v0, :cond_2
	 /* .line 4 */
} // :cond_1
java.lang.Thread .currentThread ( );
(( java.lang.Thread ) v0 ).interrupt ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V
/* .line 5 */
/* :catchall_0 */
} // :cond_2
java.lang.Class .forName ( p0 );
/* .line 6 */
} // :cond_3
} // :goto_0
java.lang.Class .forName ( p0 );
} // .end method
