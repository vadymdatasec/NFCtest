public class org.apache.log4j.config.PropertySetter {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static java.lang.Class c; //synthetic
	 public static java.lang.Class d; //synthetic
	 public static java.lang.Class e; //synthetic
	 public static java.lang.Class f; //synthetic
	 /* # instance fields */
	 public java.lang.Object a;
	 public java.beans.PropertyDescriptor b;
	 /* # direct methods */
	 public org.apache.log4j.config.PropertySetter ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.a = p1;
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
		 public static void setProperties ( java.lang.Object p0, java.util.Properties p1, java.lang.String p2 ) {
			 /* .locals 1 */
			 /* .line 1 */
			 /* new-instance v0, Lorg/apache/log4j/config/PropertySetter; */
			 /* invoke-direct {v0, p0}, Lorg/apache/log4j/config/PropertySetter;-><init>(Ljava/lang/Object;)V */
			 (( org.apache.log4j.config.PropertySetter ) v0 ).setProperties ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lorg/apache/log4j/config/PropertySetter;->setProperties(Ljava/util/Properties;Ljava/lang/String;)V
			 return;
		 } // .end method
		 /* # virtual methods */
		 public java.beans.PropertyDescriptor a ( java.lang.String p0 ) {
			 /* .locals 3 */
			 /* .line 20 */
			 v0 = this.b;
			 /* if-nez v0, :cond_0 */
			 (( org.apache.log4j.config.PropertySetter ) p0 ).a ( ); // invoke-virtual {p0}, Lorg/apache/log4j/config/PropertySetter;->a()V
		 } // :cond_0
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 21 */
	 } // :goto_0
	 v1 = this.b;
	 /* array-length v2, v1 */
	 /* if-ge v0, v2, :cond_2 */
	 /* .line 22 */
	 /* aget-object v1, v1, v0 */
	 (( java.beans.PropertyDescriptor ) v1 ).getName ( ); // invoke-virtual {v1}, Ljava/beans/PropertyDescriptor;->getName()Ljava/lang/String;
	 v1 = 	 (( java.lang.String ) p1 ).equals ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
	 if ( v1 != null) { // if-eqz v1, :cond_1
		 /* .line 23 */
		 p1 = this.b;
		 /* aget-object p1, p1, v0 */
	 } // :cond_1
	 /* add-int/lit8 v0, v0, 0x1 */
} // :cond_2
int p1 = 0; // const/4 p1, 0x0
} // .end method
public java.lang.Object a ( java.lang.String p0, java.lang.Class p1 ) {
/* .locals 3 */
int v0 = 0; // const/4 v0, 0x0
/* if-nez p1, :cond_0 */
/* .line 5 */
} // :cond_0
(( java.lang.String ) p1 ).trim ( ); // invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;
/* .line 6 */
v2 = org.apache.log4j.config.PropertySetter.d;
/* if-nez v2, :cond_1 */
final String v2 = "java.lang.String"; // const-string v2, "java.lang.String"
org.apache.log4j.config.PropertySetter .b ( v2 );
} // :cond_1
v2 = (( java.lang.Class ) v2 ).isAssignableFrom ( p2 ); // invoke-virtual {v2, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
if ( v2 != null) { // if-eqz v2, :cond_2
/* .line 7 */
} // :cond_2
p1 = java.lang.Integer.TYPE;
p1 = (( java.lang.Class ) p1 ).isAssignableFrom ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
if ( p1 != null) { // if-eqz p1, :cond_3
/* .line 8 */
/* new-instance p1, Ljava/lang/Integer; */
/* invoke-direct {p1, v1}, Ljava/lang/Integer;-><init>(Ljava/lang/String;)V */
/* .line 9 */
} // :cond_3
p1 = java.lang.Long.TYPE;
p1 = (( java.lang.Class ) p1 ).isAssignableFrom ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
if ( p1 != null) { // if-eqz p1, :cond_4
/* .line 10 */
/* new-instance p1, Ljava/lang/Long; */
/* invoke-direct {p1, v1}, Ljava/lang/Long;-><init>(Ljava/lang/String;)V */
/* .line 11 */
} // :cond_4
p1 = java.lang.Boolean.TYPE;
p1 = (( java.lang.Class ) p1 ).isAssignableFrom ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
if ( p1 != null) { // if-eqz p1, :cond_6
final String p1 = "true"; // const-string p1, "true"
/* .line 12 */
p1 = (( java.lang.String ) p1 ).equalsIgnoreCase ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( p1 != null) { // if-eqz p1, :cond_5
/* .line 13 */
p1 = java.lang.Boolean.TRUE;
} // :cond_5
final String p1 = "false"; // const-string p1, "false"
/* .line 14 */
p1 = (( java.lang.String ) p1 ).equalsIgnoreCase ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( p1 != null) { // if-eqz p1, :cond_b
/* .line 15 */
p1 = java.lang.Boolean.FALSE;
/* .line 16 */
} // :cond_6
p1 = org.apache.log4j.config.PropertySetter.e;
/* if-nez p1, :cond_7 */
final String p1 = "org.apache.log4j.Priority"; // const-string p1, "org.apache.log4j.Priority"
org.apache.log4j.config.PropertySetter .b ( p1 );
} // :cond_7
p1 = (( java.lang.Class ) p1 ).isAssignableFrom ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
if ( p1 != null) { // if-eqz p1, :cond_8
/* .line 17 */
p1 = org.apache.log4j.Level.DEBUG;
org.apache.log4j.helpers.OptionConverter .toLevel ( v1,p1 );
/* .line 18 */
} // :cond_8
p1 = org.apache.log4j.config.PropertySetter.f;
final String v2 = "org.apache.log4j.spi.ErrorHandler"; // const-string v2, "org.apache.log4j.spi.ErrorHandler"
/* if-nez p1, :cond_9 */
org.apache.log4j.config.PropertySetter .b ( v2 );
} // :cond_9
p1 = (( java.lang.Class ) p1 ).isAssignableFrom ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
if ( p1 != null) { // if-eqz p1, :cond_b
/* .line 19 */
p1 = org.apache.log4j.config.PropertySetter.f;
/* if-nez p1, :cond_a */
org.apache.log4j.config.PropertySetter .b ( v2 );
} // :cond_a
org.apache.log4j.helpers.OptionConverter .instantiateByClassName ( v1,p1,v0 );
} // :cond_b
} // .end method
public void a ( ) {
/* .locals 3 */
/* .line 1 */
try { // :try_start_0
v0 = this.a;
(( java.lang.Object ) v0 ).getClass ( ); // invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
java.beans.Introspector .getBeanInfo ( v0 );
/* .line 2 */
this.b = v0;
/* :try_end_0 */
/* .catch Ljava/beans/IntrospectionException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
/* .line 3 */
/* new-instance v1, Ljava/lang/StringBuffer; */
/* invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V */
final String v2 = "Failed to introspect "; // const-string v2, "Failed to introspect "
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
v2 = this.a;
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;
final String v2 = ": "; // const-string v2, ": "
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.beans.IntrospectionException ) v0 ).getMessage ( ); // invoke-virtual {v0}, Ljava/beans/IntrospectionException;->getMessage()Ljava/lang/String;
(( java.lang.StringBuffer ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .error ( v0 );
int v0 = 0; // const/4 v0, 0x0
/* new-array v0, v0, [Ljava/beans/PropertyDescriptor; */
/* .line 4 */
this.b = v0;
} // :goto_0
return;
} // .end method
public void activate ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.a;
/* instance-of v1, v0, Lorg/apache/log4j/spi/OptionHandler; */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 2 */
/* check-cast v0, Lorg/apache/log4j/spi/OptionHandler; */
} // :cond_0
return;
} // .end method
public void setProperties ( java.util.Properties p0, java.lang.String p1 ) {
/* .locals 12 */
final String v0 = "\"."; // const-string v0, "\"."
final String v1 = "] to value \""; // const-string v1, "] to value \""
final String v2 = "Failed to set property ["; // const-string v2, "Failed to set property ["
/* .line 2 */
v3 = (( java.lang.String ) p2 ).length ( ); // invoke-virtual {p2}, Ljava/lang/String;->length()I
/* .line 3 */
(( java.util.Properties ) p1 ).propertyNames ( ); // invoke-virtual {p1}, Ljava/util/Properties;->propertyNames()Ljava/util/Enumeration;
} // :cond_0
v5 = } // :goto_0
if ( v5 != null) { // if-eqz v5, :cond_8
/* .line 4 */
/* check-cast v5, Ljava/lang/String; */
/* .line 5 */
v6 = (( java.lang.String ) v5 ).startsWith ( p2 ); // invoke-virtual {v5, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
if ( v6 != null) { // if-eqz v6, :cond_0
/* const/16 v6, 0x2e */
/* add-int/lit8 v7, v3, 0x1 */
/* .line 6 */
v6 = (( java.lang.String ) v5 ).indexOf ( v6, v7 ); // invoke-virtual {v5, v6, v7}, Ljava/lang/String;->indexOf(II)I
/* if-lez v6, :cond_1 */
/* .line 7 */
} // :cond_1
org.apache.log4j.helpers.OptionConverter .findAndSubst ( v5,p1 );
/* .line 8 */
(( java.lang.String ) v5 ).substring ( v3 ); // invoke-virtual {v5, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;
final String v7 = "layout"; // const-string v7, "layout"
/* .line 9 */
v7 = (( java.lang.String ) v7 ).equals ( v5 ); // invoke-virtual {v7, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v7, :cond_2 */
final String v7 = "errorhandler"; // const-string v7, "errorhandler"
v7 = (( java.lang.String ) v7 ).equals ( v5 ); // invoke-virtual {v7, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v7 != null) { // if-eqz v7, :cond_3
} // :cond_2
v7 = this.a;
/* instance-of v7, v7, Lorg/apache/log4j/Appender; */
if ( v7 != null) { // if-eqz v7, :cond_3
/* .line 10 */
} // :cond_3
java.beans.Introspector .decapitalize ( v5 );
(( org.apache.log4j.config.PropertySetter ) p0 ).a ( v7 ); // invoke-virtual {p0, v7}, Lorg/apache/log4j/config/PropertySetter;->a(Ljava/lang/String;)Ljava/beans/PropertyDescriptor;
if ( v7 != null) { // if-eqz v7, :cond_7
/* .line 11 */
v8 = org.apache.log4j.config.PropertySetter.c;
/* if-nez v8, :cond_4 */
final String v8 = "org.apache.log4j.spi.OptionHandler"; // const-string v8, "org.apache.log4j.spi.OptionHandler"
org.apache.log4j.config.PropertySetter .b ( v8 );
} // :cond_4
(( java.beans.PropertyDescriptor ) v7 ).getPropertyType ( ); // invoke-virtual {v7}, Ljava/beans/PropertyDescriptor;->getPropertyType()Ljava/lang/Class;
v8 = (( java.lang.Class ) v8 ).isAssignableFrom ( v9 ); // invoke-virtual {v8, v9}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
if ( v8 != null) { // if-eqz v8, :cond_7
(( java.beans.PropertyDescriptor ) v7 ).getWriteMethod ( ); // invoke-virtual {v7}, Ljava/beans/PropertyDescriptor;->getWriteMethod()Ljava/lang/reflect/Method;
if ( v8 != null) { // if-eqz v8, :cond_7
/* .line 12 */
/* new-instance v8, Ljava/lang/StringBuffer; */
/* invoke-direct {v8}, Ljava/lang/StringBuffer;-><init>()V */
(( java.lang.StringBuffer ) v8 ).append ( p2 ); // invoke-virtual {v8, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v8 ).append ( v5 ); // invoke-virtual {v8, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v8 ).toString ( ); // invoke-virtual {v8}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
(( java.beans.PropertyDescriptor ) v7 ).getPropertyType ( ); // invoke-virtual {v7}, Ljava/beans/PropertyDescriptor;->getPropertyType()Ljava/lang/Class;
int v10 = 0; // const/4 v10, 0x0
org.apache.log4j.helpers.OptionConverter .instantiateByKey ( p1,v8,v9,v10 );
/* check-cast v8, Lorg/apache/log4j/spi/OptionHandler; */
/* .line 13 */
/* new-instance v9, Lorg/apache/log4j/config/PropertySetter; */
/* invoke-direct {v9, v8}, Lorg/apache/log4j/config/PropertySetter;-><init>(Ljava/lang/Object;)V */
/* .line 14 */
/* new-instance v10, Ljava/lang/StringBuffer; */
/* invoke-direct {v10}, Ljava/lang/StringBuffer;-><init>()V */
(( java.lang.StringBuffer ) v10 ).append ( p2 ); // invoke-virtual {v10, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v10 ).append ( v5 ); // invoke-virtual {v10, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v11 = "."; // const-string v11, "."
(( java.lang.StringBuffer ) v10 ).append ( v11 ); // invoke-virtual {v10, v11}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v10 ).toString ( ); // invoke-virtual {v10}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
(( org.apache.log4j.config.PropertySetter ) v9 ).setProperties ( p1, v10 ); // invoke-virtual {v9, p1, v10}, Lorg/apache/log4j/config/PropertySetter;->setProperties(Ljava/util/Properties;Ljava/lang/String;)V
/* .line 15 */
try { // :try_start_0
(( java.beans.PropertyDescriptor ) v7 ).getWriteMethod ( ); // invoke-virtual {v7}, Ljava/beans/PropertyDescriptor;->getWriteMethod()Ljava/lang/reflect/Method;
v9 = this.a;
int v10 = 1; // const/4 v10, 0x1
/* new-array v10, v10, [Ljava/lang/Object; */
int v11 = 0; // const/4 v11, 0x0
/* aput-object v8, v10, v11 */
(( java.lang.reflect.Method ) v7 ).invoke ( v9, v10 ); // invoke-virtual {v7, v9, v10}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/* :try_end_0 */
/* .catch Ljava/lang/IllegalAccessException; {:try_start_0 ..:try_end_0} :catch_2 */
/* .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Ljava/lang/RuntimeException; {:try_start_0 ..:try_end_0} :catch_0 */
/* goto/16 :goto_0 */
/* :catch_0 */
/* move-exception v7 */
/* .line 16 */
/* new-instance v8, Ljava/lang/StringBuffer; */
/* invoke-direct {v8}, Ljava/lang/StringBuffer;-><init>()V */
(( java.lang.StringBuffer ) v8 ).append ( v2 ); // invoke-virtual {v8, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v8 ).append ( v5 ); // invoke-virtual {v8, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v8 ).append ( v1 ); // invoke-virtual {v8, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v8 ).append ( v6 ); // invoke-virtual {v8, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v8 ).append ( v0 ); // invoke-virtual {v8, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v8 ).toString ( ); // invoke-virtual {v8}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .warn ( v5,v7 );
/* goto/16 :goto_0 */
/* :catch_1 */
/* move-exception v7 */
/* .line 17 */
(( java.lang.reflect.InvocationTargetException ) v7 ).getTargetException ( ); // invoke-virtual {v7}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;
/* instance-of v8, v8, Ljava/lang/InterruptedException; */
/* if-nez v8, :cond_5 */
(( java.lang.reflect.InvocationTargetException ) v7 ).getTargetException ( ); // invoke-virtual {v7}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;
/* instance-of v8, v8, Ljava/io/InterruptedIOException; */
if ( v8 != null) { // if-eqz v8, :cond_6
/* .line 18 */
} // :cond_5
java.lang.Thread .currentThread ( );
(( java.lang.Thread ) v8 ).interrupt ( ); // invoke-virtual {v8}, Ljava/lang/Thread;->interrupt()V
/* .line 19 */
} // :cond_6
/* new-instance v8, Ljava/lang/StringBuffer; */
/* invoke-direct {v8}, Ljava/lang/StringBuffer;-><init>()V */
(( java.lang.StringBuffer ) v8 ).append ( v2 ); // invoke-virtual {v8, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v8 ).append ( v5 ); // invoke-virtual {v8, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v8 ).append ( v1 ); // invoke-virtual {v8, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v8 ).append ( v6 ); // invoke-virtual {v8, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v8 ).append ( v0 ); // invoke-virtual {v8, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v8 ).toString ( ); // invoke-virtual {v8}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .warn ( v5,v7 );
/* goto/16 :goto_0 */
/* :catch_2 */
/* move-exception v7 */
/* .line 20 */
/* new-instance v8, Ljava/lang/StringBuffer; */
/* invoke-direct {v8}, Ljava/lang/StringBuffer;-><init>()V */
(( java.lang.StringBuffer ) v8 ).append ( v2 ); // invoke-virtual {v8, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v8 ).append ( v5 ); // invoke-virtual {v8, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v8 ).append ( v1 ); // invoke-virtual {v8, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v8 ).append ( v6 ); // invoke-virtual {v8, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v8 ).append ( v0 ); // invoke-virtual {v8, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v8 ).toString ( ); // invoke-virtual {v8}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .warn ( v5,v7 );
/* goto/16 :goto_0 */
/* .line 21 */
} // :cond_7
(( org.apache.log4j.config.PropertySetter ) p0 ).setProperty ( v5, v6 ); // invoke-virtual {p0, v5, v6}, Lorg/apache/log4j/config/PropertySetter;->setProperty(Ljava/lang/String;Ljava/lang/String;)V
/* goto/16 :goto_0 */
/* .line 22 */
} // :cond_8
(( org.apache.log4j.config.PropertySetter ) p0 ).activate ( ); // invoke-virtual {p0}, Lorg/apache/log4j/config/PropertySetter;->activate()V
return;
} // .end method
public void setProperty ( java.beans.PropertyDescriptor p0, java.lang.String p1, java.lang.String p2 ) {
/* .locals 6 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/apache/log4j/config/PropertySetterException; */
/* } */
} // .end annotation
final String v0 = "Conversion to type ["; // const-string v0, "Conversion to type ["
/* .line 6 */
(( java.beans.PropertyDescriptor ) p1 ).getWriteMethod ( ); // invoke-virtual {p1}, Ljava/beans/PropertyDescriptor;->getWriteMethod()Ljava/lang/reflect/Method;
final String v1 = "]."; // const-string v1, "]."
if ( p1 != null) { // if-eqz p1, :cond_4
/* .line 7 */
(( java.lang.reflect.Method ) p1 ).getParameterTypes ( ); // invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;
/* .line 8 */
/* array-length v3, v2 */
int v4 = 1; // const/4 v4, 0x1
/* if-ne v3, v4, :cond_3 */
int v3 = 0; // const/4 v3, 0x0
/* .line 9 */
try { // :try_start_0
/* aget-object v5, v2, v3 */
(( org.apache.log4j.config.PropertySetter ) p0 ).a ( p3, v5 ); // invoke-virtual {p0, p3, v5}, Lorg/apache/log4j/config/PropertySetter;->a(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
if ( p3 != null) { // if-eqz p3, :cond_2
/* .line 10 */
/* new-instance v0, Ljava/lang/StringBuffer; */
/* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
final String v2 = "Setting property ["; // const-string v2, "Setting property ["
(( java.lang.StringBuffer ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String p2 = "] to ["; // const-string p2, "] to ["
(( java.lang.StringBuffer ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v0 ).append ( p3 ); // invoke-virtual {v0, p3}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .debug ( p2 );
/* .line 11 */
try { // :try_start_1
p2 = this.a;
/* new-array v0, v4, [Ljava/lang/Object; */
/* aput-object p3, v0, v3 */
(( java.lang.reflect.Method ) p1 ).invoke ( p2, v0 ); // invoke-virtual {p1, p2, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/* :try_end_1 */
/* .catch Ljava/lang/IllegalAccessException; {:try_start_1 ..:try_end_1} :catch_2 */
/* .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 ..:try_end_1} :catch_1 */
/* .catch Ljava/lang/RuntimeException; {:try_start_1 ..:try_end_1} :catch_0 */
return;
/* :catch_0 */
/* move-exception p1 */
/* .line 12 */
/* new-instance p2, Lorg/apache/log4j/config/PropertySetterException; */
/* invoke-direct {p2, p1}, Lorg/apache/log4j/config/PropertySetterException;-><init>(Ljava/lang/Throwable;)V */
/* throw p2 */
/* :catch_1 */
/* move-exception p1 */
/* .line 13 */
(( java.lang.reflect.InvocationTargetException ) p1 ).getTargetException ( ); // invoke-virtual {p1}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;
/* instance-of p2, p2, Ljava/lang/InterruptedException; */
/* if-nez p2, :cond_0 */
(( java.lang.reflect.InvocationTargetException ) p1 ).getTargetException ( ); // invoke-virtual {p1}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;
/* instance-of p2, p2, Ljava/io/InterruptedIOException; */
if ( p2 != null) { // if-eqz p2, :cond_1
/* .line 14 */
} // :cond_0
java.lang.Thread .currentThread ( );
(( java.lang.Thread ) p2 ).interrupt ( ); // invoke-virtual {p2}, Ljava/lang/Thread;->interrupt()V
/* .line 15 */
} // :cond_1
/* new-instance p2, Lorg/apache/log4j/config/PropertySetterException; */
/* invoke-direct {p2, p1}, Lorg/apache/log4j/config/PropertySetterException;-><init>(Ljava/lang/Throwable;)V */
/* throw p2 */
/* :catch_2 */
/* move-exception p1 */
/* .line 16 */
/* new-instance p2, Lorg/apache/log4j/config/PropertySetterException; */
/* invoke-direct {p2, p1}, Lorg/apache/log4j/config/PropertySetterException;-><init>(Ljava/lang/Throwable;)V */
/* throw p2 */
/* .line 17 */
} // :cond_2
/* new-instance p1, Lorg/apache/log4j/config/PropertySetterException; */
/* new-instance p2, Ljava/lang/StringBuffer; */
/* invoke-direct {p2}, Ljava/lang/StringBuffer;-><init>()V */
(( java.lang.StringBuffer ) p2 ).append ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* aget-object p3, v2, v3 */
(( java.lang.StringBuffer ) p2 ).append ( p3 ); // invoke-virtual {p2, p3}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;
final String p3 = "] failed."; // const-string p3, "] failed."
(( java.lang.StringBuffer ) p2 ).append ( p3 ); // invoke-virtual {p2, p3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
/* invoke-direct {p1, p2}, Lorg/apache/log4j/config/PropertySetterException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
/* :catchall_0 */
/* move-exception p1 */
/* .line 18 */
/* new-instance p2, Lorg/apache/log4j/config/PropertySetterException; */
/* new-instance p3, Ljava/lang/StringBuffer; */
/* invoke-direct {p3}, Ljava/lang/StringBuffer;-><init>()V */
(( java.lang.StringBuffer ) p3 ).append ( v0 ); // invoke-virtual {p3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* aget-object v0, v2, v3 */
(( java.lang.StringBuffer ) p3 ).append ( v0 ); // invoke-virtual {p3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;
final String v0 = "] failed.Reason: "; // const-string v0, "] failed.Reason: "
(( java.lang.StringBuffer ) p3 ).append ( v0 ); // invoke-virtual {p3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) p3 ).append ( p1 ); // invoke-virtual {p3, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) p3 ).toString ( ); // invoke-virtual {p3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
/* invoke-direct {p2, p1}, Lorg/apache/log4j/config/PropertySetterException;-><init>(Ljava/lang/String;)V */
/* throw p2 */
/* .line 19 */
} // :cond_3
/* new-instance p1, Lorg/apache/log4j/config/PropertySetterException; */
final String p2 = "#params for setter != 1"; // const-string p2, "#params for setter != 1"
/* invoke-direct {p1, p2}, Lorg/apache/log4j/config/PropertySetterException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
/* .line 20 */
} // :cond_4
/* new-instance p1, Lorg/apache/log4j/config/PropertySetterException; */
/* new-instance p3, Ljava/lang/StringBuffer; */
/* invoke-direct {p3}, Ljava/lang/StringBuffer;-><init>()V */
final String v0 = "No setter for property ["; // const-string v0, "No setter for property ["
(( java.lang.StringBuffer ) p3 ).append ( v0 ); // invoke-virtual {p3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) p3 ).append ( p2 ); // invoke-virtual {p3, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) p3 ).append ( v1 ); // invoke-virtual {p3, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) p3 ).toString ( ); // invoke-virtual {p3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
/* invoke-direct {p1, p2}, Lorg/apache/log4j/config/PropertySetterException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public void setProperty ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 3 */
/* if-nez p2, :cond_0 */
return;
/* .line 1 */
} // :cond_0
java.beans.Introspector .decapitalize ( p1 );
/* .line 2 */
(( org.apache.log4j.config.PropertySetter ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/log4j/config/PropertySetter;->a(Ljava/lang/String;)Ljava/beans/PropertyDescriptor;
/* if-nez v0, :cond_1 */
/* .line 3 */
/* new-instance p2, Ljava/lang/StringBuffer; */
/* invoke-direct {p2}, Ljava/lang/StringBuffer;-><init>()V */
final String v0 = "No such property ["; // const-string v0, "No such property ["
(( java.lang.StringBuffer ) p2 ).append ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) p2 ).append ( p1 ); // invoke-virtual {p2, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String p1 = "] in "; // const-string p1, "] in "
(( java.lang.StringBuffer ) p2 ).append ( p1 ); // invoke-virtual {p2, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
p1 = this.a;
(( java.lang.Object ) p1 ).getClass ( ); // invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( java.lang.Class ) p1 ).getName ( ); // invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;
(( java.lang.StringBuffer ) p2 ).append ( p1 ); // invoke-virtual {p2, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String p1 = "."; // const-string p1, "."
(( java.lang.StringBuffer ) p2 ).append ( p1 ); // invoke-virtual {p2, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .warn ( p1 );
/* .line 4 */
} // :cond_1
try { // :try_start_0
(( org.apache.log4j.config.PropertySetter ) p0 ).setProperty ( v0, p1, p2 ); // invoke-virtual {p0, v0, p1, p2}, Lorg/apache/log4j/config/PropertySetter;->setProperty(Ljava/beans/PropertyDescriptor;Ljava/lang/String;Ljava/lang/String;)V
/* :try_end_0 */
/* .catch Lorg/apache/log4j/config/PropertySetterException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
/* .line 5 */
/* new-instance v1, Ljava/lang/StringBuffer; */
/* invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V */
final String v2 = "Failed to set property ["; // const-string v2, "Failed to set property ["
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String p1 = "] to value \""; // const-string p1, "] to value \""
(( java.lang.StringBuffer ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String p1 = "\"."; // const-string p1, "\"."
(( java.lang.StringBuffer ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
p2 = this.b;
org.apache.log4j.helpers.LogLog .warn ( p1,p2 );
} // :goto_0
return;
} // .end method
