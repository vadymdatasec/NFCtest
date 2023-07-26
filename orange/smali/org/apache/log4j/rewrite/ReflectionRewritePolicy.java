public class org.apache.log4j.rewrite.ReflectionRewritePolicy implements org.apache.log4j.rewrite.RewritePolicy {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # static fields */
	 public static java.lang.Class a; //synthetic
	 /* # direct methods */
	 public org.apache.log4j.rewrite.ReflectionRewritePolicy ( ) {
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
		 /* # virtual methods */
		 public org.apache.log4j.spi.LoggingEvent rewrite ( org.apache.log4j.spi.LoggingEvent p0 ) {
			 /* .locals 14 */
			 /* .line 1 */
			 (( org.apache.log4j.spi.LoggingEvent ) p1 ).getMessage ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getMessage()Ljava/lang/Object;
			 /* .line 2 */
			 /* instance-of v1, v0, Ljava/lang/String; */
			 /* if-nez v1, :cond_4 */
			 /* .line 3 */
			 /* new-instance v13, Ljava/util/HashMap; */
			 (( org.apache.log4j.spi.LoggingEvent ) p1 ).getProperties ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getProperties()Ljava/util/Map;
			 /* invoke-direct {v13, v1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V */
			 /* .line 4 */
			 try { // :try_start_0
				 (( java.lang.Object ) v0 ).getClass ( ); // invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
				 v2 = org.apache.log4j.rewrite.ReflectionRewritePolicy.a;
				 /* if-nez v2, :cond_0 */
				 final String v2 = "java.lang.Object"; // const-string v2, "java.lang.Object"
				 org.apache.log4j.rewrite.ReflectionRewritePolicy .a ( v2 );
			 } // :cond_0
			 v2 = org.apache.log4j.rewrite.ReflectionRewritePolicy.a;
		 } // :goto_0
		 java.beans.Introspector .getBeanInfo ( v1,v2 );
		 /* .line 5 */
		 /* array-length v2, v1 */
		 /* if-lez v2, :cond_4 */
		 int v2 = 0; // const/4 v2, 0x0
		 /* move-object v8, v0 */
		 /* .line 6 */
	 } // :goto_1
	 /* array-length v3, v1 */
	 /* :try_end_0 */
	 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_1 */
	 /* if-ge v2, v3, :cond_2 */
	 /* .line 7 */
	 try { // :try_start_1
		 /* aget-object v3, v1, v2 */
		 (( java.beans.PropertyDescriptor ) v3 ).getReadMethod ( ); // invoke-virtual {v3}, Ljava/beans/PropertyDescriptor;->getReadMethod()Ljava/lang/reflect/Method;
		 int v4 = 0; // const/4 v4, 0x0
		 (( java.lang.reflect.Method ) v3 ).invoke ( v0, v4 ); // invoke-virtual {v3, v0, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
		 final String v4 = "message"; // const-string v4, "message"
		 /* .line 8 */
		 /* aget-object v5, v1, v2 */
		 (( java.beans.PropertyDescriptor ) v5 ).getName ( ); // invoke-virtual {v5}, Ljava/beans/PropertyDescriptor;->getName()Ljava/lang/String;
		 v4 = 		 (( java.lang.String ) v4 ).equalsIgnoreCase ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
		 if ( v4 != null) { // if-eqz v4, :cond_1
			 /* move-object v8, v3 */
			 /* .line 9 */
		 } // :cond_1
		 /* aget-object v4, v1, v2 */
		 (( java.beans.PropertyDescriptor ) v4 ).getName ( ); // invoke-virtual {v4}, Ljava/beans/PropertyDescriptor;->getName()Ljava/lang/String;
		 /* :try_end_1 */
		 /* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
		 /* :catch_0 */
		 /* move-exception v3 */
		 /* .line 10 */
		 try { // :try_start_2
			 /* new-instance v4, Ljava/lang/StringBuffer; */
			 /* invoke-direct {v4}, Ljava/lang/StringBuffer;-><init>()V */
			 final String v5 = "Unable to evaluate property "; // const-string v5, "Unable to evaluate property "
			 (( java.lang.StringBuffer ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
			 /* aget-object v5, v1, v2 */
			 (( java.beans.PropertyDescriptor ) v5 ).getName ( ); // invoke-virtual {v5}, Ljava/beans/PropertyDescriptor;->getName()Ljava/lang/String;
			 (( java.lang.StringBuffer ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
			 (( java.lang.StringBuffer ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
			 org.apache.log4j.helpers.LogLog .warn ( v4,v3 );
		 } // :goto_2
		 /* add-int/lit8 v2, v2, 0x1 */
		 /* .line 11 */
	 } // :cond_2
	 /* new-instance v0, Lorg/apache/log4j/spi/LoggingEvent; */
	 (( org.apache.log4j.spi.LoggingEvent ) p1 ).getFQNOfLoggerClass ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getFQNOfLoggerClass()Ljava/lang/String;
	 (( org.apache.log4j.spi.LoggingEvent ) p1 ).getLogger ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getLogger()Lorg/apache/log4j/Category;
	 if ( v1 != null) { // if-eqz v1, :cond_3
		 (( org.apache.log4j.spi.LoggingEvent ) p1 ).getLogger ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getLogger()Lorg/apache/log4j/Category;
	 } // :cond_3
	 (( org.apache.log4j.spi.LoggingEvent ) p1 ).getLoggerName ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getLoggerName()Ljava/lang/String;
	 org.apache.log4j.Logger .getLogger ( v1 );
} // :goto_3
/* move-object v4, v1 */
(( org.apache.log4j.spi.LoggingEvent ) p1 ).getTimeStamp ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getTimeStamp()J
/* move-result-wide v5 */
(( org.apache.log4j.spi.LoggingEvent ) p1 ).getLevel ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getLevel()Lorg/apache/log4j/Level;
(( org.apache.log4j.spi.LoggingEvent ) p1 ).getThreadName ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getThreadName()Ljava/lang/String;
(( org.apache.log4j.spi.LoggingEvent ) p1 ).getThrowableInformation ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getThrowableInformation()Lorg/apache/log4j/spi/ThrowableInformation;
(( org.apache.log4j.spi.LoggingEvent ) p1 ).getNDC ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getNDC()Ljava/lang/String;
(( org.apache.log4j.spi.LoggingEvent ) p1 ).getLocationInformation ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getLocationInformation()Lorg/apache/log4j/spi/LocationInfo;
/* move-object v2, v0 */
/* invoke-direct/range {v2 ..v13}, Lorg/apache/log4j/spi/LoggingEvent;-><init>(Ljava/lang/String;Lorg/apache/log4j/Category;JLorg/apache/log4j/Level;Ljava/lang/Object;Ljava/lang/String;Lorg/apache/log4j/spi/ThrowableInformation;Ljava/lang/String;Lorg/apache/log4j/spi/LocationInfo;Ljava/util/Map;)V */
/* :try_end_2 */
/* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_1 */
/* :catch_1 */
/* move-exception v0 */
final String v1 = "Unable to get property descriptors"; // const-string v1, "Unable to get property descriptors"
/* .line 12 */
org.apache.log4j.helpers.LogLog .warn ( v1,v0 );
} // :cond_4
} // .end method
