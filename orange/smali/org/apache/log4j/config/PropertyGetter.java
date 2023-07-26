public class org.apache.log4j.config.PropertyGetter {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lorg/apache/log4j/config/PropertyGetter$PropertyCallback; */
	 /* } */
} // .end annotation
/* # static fields */
public static final java.lang.Object c;
public static java.lang.Class d; //synthetic
public static java.lang.Class e; //synthetic
/* # instance fields */
public java.lang.Object a;
public java.beans.PropertyDescriptor b;
/* # direct methods */
public static org.apache.log4j.config.PropertyGetter ( ) {
	 /* .locals 1 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* new-array v0, v0, [Ljava/lang/Object; */
	 /* .line 1 */
	 return;
} // .end method
public org.apache.log4j.config.PropertyGetter ( ) {
	 /* .locals 1 */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Ljava/beans/IntrospectionException; */
	 /* } */
} // .end annotation
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
(( java.lang.Object ) p1 ).getClass ( ); // invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
java.beans.Introspector .getBeanInfo ( v0 );
/* .line 3 */
this.b = v0;
/* .line 4 */
this.a = p1;
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
public static void getProperties ( java.lang.Object p0, org.apache.log4j.config.PropertyGetter$PropertyCallback p1, java.lang.String p2 ) {
	 /* .locals 1 */
	 /* .line 1 */
	 try { // :try_start_0
		 /* new-instance v0, Lorg/apache/log4j/config/PropertyGetter; */
		 /* invoke-direct {v0, p0}, Lorg/apache/log4j/config/PropertyGetter;-><init>(Ljava/lang/Object;)V */
		 (( org.apache.log4j.config.PropertyGetter ) v0 ).getProperties ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lorg/apache/log4j/config/PropertyGetter;->getProperties(Lorg/apache/log4j/config/PropertyGetter$PropertyCallback;Ljava/lang/String;)V
		 /* :try_end_0 */
		 /* .catch Ljava/beans/IntrospectionException; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* :catch_0 */
		 /* move-exception p1 */
		 /* .line 2 */
		 /* new-instance p2, Ljava/lang/StringBuffer; */
		 /* invoke-direct {p2}, Ljava/lang/StringBuffer;-><init>()V */
		 final String v0 = "Failed to introspect object "; // const-string v0, "Failed to introspect object "
		 (( java.lang.StringBuffer ) p2 ).append ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 (( java.lang.StringBuffer ) p2 ).append ( p0 ); // invoke-virtual {p2, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;
		 (( java.lang.StringBuffer ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
		 org.apache.log4j.helpers.LogLog .error ( p0,p1 );
	 } // :goto_0
	 return;
} // .end method
/* # virtual methods */
public Boolean a ( java.lang.Class p0 ) {
	 /* .locals 1 */
	 /* .line 2 */
	 v0 = org.apache.log4j.config.PropertyGetter.d;
	 /* if-nez v0, :cond_0 */
	 final String v0 = "java.lang.String"; // const-string v0, "java.lang.String"
	 org.apache.log4j.config.PropertyGetter .a ( v0 );
} // :cond_0
v0 = (( java.lang.Class ) v0 ).isAssignableFrom ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
/* if-nez v0, :cond_3 */
v0 = java.lang.Integer.TYPE;
v0 = (( java.lang.Class ) v0 ).isAssignableFrom ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
/* if-nez v0, :cond_3 */
v0 = java.lang.Long.TYPE;
v0 = (( java.lang.Class ) v0 ).isAssignableFrom ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
/* if-nez v0, :cond_3 */
v0 = java.lang.Boolean.TYPE;
v0 = (( java.lang.Class ) v0 ).isAssignableFrom ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
/* if-nez v0, :cond_3 */
v0 = org.apache.log4j.config.PropertyGetter.e;
/* if-nez v0, :cond_1 */
final String v0 = "org.apache.log4j.Priority"; // const-string v0, "org.apache.log4j.Priority"
org.apache.log4j.config.PropertyGetter .a ( v0 );
} // :cond_1
p1 = (( java.lang.Class ) v0 ).isAssignableFrom ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
if ( p1 != null) { // if-eqz p1, :cond_2
} // :cond_2
int p1 = 0; // const/4 p1, 0x0
} // :cond_3
} // :goto_0
int p1 = 1; // const/4 p1, 0x1
} // :goto_1
} // .end method
public void getProperties ( org.apache.log4j.config.PropertyGetter$PropertyCallback p0, java.lang.String p1 ) {
/* .locals 6 */
final String v0 = "Failed to get value of property "; // const-string v0, "Failed to get value of property "
int v1 = 0; // const/4 v1, 0x0
/* .line 3 */
} // :goto_0
v2 = this.b;
/* array-length v3, v2 */
/* if-ge v1, v3, :cond_5 */
/* .line 4 */
/* aget-object v2, v2, v1 */
(( java.beans.PropertyDescriptor ) v2 ).getReadMethod ( ); // invoke-virtual {v2}, Ljava/beans/PropertyDescriptor;->getReadMethod()Ljava/lang/reflect/Method;
/* if-nez v2, :cond_0 */
/* goto/16 :goto_1 */
/* .line 5 */
} // :cond_0
(( java.lang.reflect.Method ) v2 ).getReturnType ( ); // invoke-virtual {v2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;
v3 = (( org.apache.log4j.config.PropertyGetter ) p0 ).a ( v3 ); // invoke-virtual {p0, v3}, Lorg/apache/log4j/config/PropertyGetter;->a(Ljava/lang/Class;)Z
/* if-nez v3, :cond_1 */
/* .line 6 */
} // :cond_1
v3 = this.b;
/* aget-object v3, v3, v1 */
(( java.beans.PropertyDescriptor ) v3 ).getName ( ); // invoke-virtual {v3}, Ljava/beans/PropertyDescriptor;->getName()Ljava/lang/String;
/* .line 7 */
try { // :try_start_0
v4 = this.a;
v5 = org.apache.log4j.config.PropertyGetter.c;
(( java.lang.reflect.Method ) v2 ).invoke ( v4, v5 ); // invoke-virtual {v2, v4, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
if ( v2 != null) { // if-eqz v2, :cond_4
/* .line 8 */
v4 = this.a;
/* :try_end_0 */
/* .catch Ljava/lang/IllegalAccessException; {:try_start_0 ..:try_end_0} :catch_2 */
/* .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Ljava/lang/RuntimeException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 9 */
/* :catch_0 */
/* new-instance v2, Ljava/lang/StringBuffer; */
/* invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V */
(( java.lang.StringBuffer ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .warn ( v2 );
/* :catch_1 */
/* move-exception v2 */
/* .line 10 */
(( java.lang.reflect.InvocationTargetException ) v2 ).getTargetException ( ); // invoke-virtual {v2}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;
/* instance-of v4, v4, Ljava/lang/InterruptedException; */
/* if-nez v4, :cond_2 */
(( java.lang.reflect.InvocationTargetException ) v2 ).getTargetException ( ); // invoke-virtual {v2}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;
/* instance-of v2, v2, Ljava/io/InterruptedIOException; */
if ( v2 != null) { // if-eqz v2, :cond_3
/* .line 11 */
} // :cond_2
java.lang.Thread .currentThread ( );
(( java.lang.Thread ) v2 ).interrupt ( ); // invoke-virtual {v2}, Ljava/lang/Thread;->interrupt()V
/* .line 12 */
} // :cond_3
/* new-instance v2, Ljava/lang/StringBuffer; */
/* invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V */
(( java.lang.StringBuffer ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .warn ( v2 );
/* .line 13 */
/* :catch_2 */
/* new-instance v2, Ljava/lang/StringBuffer; */
/* invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V */
(( java.lang.StringBuffer ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .warn ( v2 );
} // :cond_4
} // :goto_1
/* add-int/lit8 v1, v1, 0x1 */
/* goto/16 :goto_0 */
} // :cond_5
return;
} // .end method
