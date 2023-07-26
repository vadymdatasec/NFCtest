public class org.apache.log4j.jmx.LayoutDynamicMBean extends org.apache.log4j.jmx.AbstractDynamicMBean {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static org.apache.log4j.Logger k;
	 public static java.lang.Class l; //synthetic
	 public static java.lang.Class m; //synthetic
	 public static java.lang.Class n; //synthetic
	 public static java.lang.Class o; //synthetic
	 /* # instance fields */
	 public javax.management.MBeanConstructorInfo d;
	 public java.util.Vector e;
	 public java.lang.String f;
	 public java.util.Hashtable g;
	 public javax.management.MBeanOperationInfo h;
	 public java.lang.String i;
	 public org.apache.log4j.Layout j;
	 /* # direct methods */
	 public static org.apache.log4j.jmx.LayoutDynamicMBean ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = org.apache.log4j.jmx.LayoutDynamicMBean.l;
		 /* if-nez v0, :cond_0 */
		 final String v0 = "org.apache.log4j.jmx.LayoutDynamicMBean"; // const-string v0, "org.apache.log4j.jmx.LayoutDynamicMBean"
		 org.apache.log4j.jmx.LayoutDynamicMBean .a ( v0 );
	 } // :cond_0
	 org.apache.log4j.Logger .getLogger ( v0 );
	 return;
} // .end method
public org.apache.log4j.jmx.LayoutDynamicMBean ( ) {
	 /* .locals 3 */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Ljava/beans/IntrospectionException; */
	 /* } */
} // .end annotation
/* .line 1 */
/* invoke-direct {p0}, Lorg/apache/log4j/jmx/AbstractDynamicMBean;-><init>()V */
int v0 = 1; // const/4 v0, 0x1
/* new-array v1, v0, [Ljavax/management/MBeanConstructorInfo; */
/* .line 2 */
this.d = v1;
/* .line 3 */
/* new-instance v1, Ljava/util/Vector; */
/* invoke-direct {v1}, Ljava/util/Vector;-><init>()V */
this.e = v1;
/* .line 4 */
/* const-class v1, Lorg/apache/log4j/jmx/LayoutDynamicMBean; */
(( java.lang.Class ) v1 ).getName ( ); // invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;
this.f = v1;
/* .line 5 */
/* new-instance v1, Ljava/util/Hashtable; */
int v2 = 5; // const/4 v2, 0x5
/* invoke-direct {v1, v2}, Ljava/util/Hashtable;-><init>(I)V */
this.g = v1;
/* new-array v0, v0, [Ljavax/management/MBeanOperationInfo; */
/* .line 6 */
this.h = v0;
final String v0 = "This MBean acts as a management facade for log4j layouts."; // const-string v0, "This MBean acts as a management facade for log4j layouts."
/* .line 7 */
this.i = v0;
/* .line 8 */
this.j = p1;
/* .line 9 */
(( org.apache.log4j.jmx.LayoutDynamicMBean ) p0 ).b ( ); // invoke-virtual {p0}, Lorg/apache/log4j/jmx/LayoutDynamicMBean;->b()V
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
public org.apache.log4j.Logger a ( ) {
	 /* .locals 1 */
	 /* .line 5 */
	 v0 = org.apache.log4j.jmx.LayoutDynamicMBean.k;
} // .end method
public final Boolean a ( java.lang.Class p0 ) {
	 /* .locals 2 */
	 /* .line 2 */
	 v0 = 	 (( java.lang.Class ) p1 ).isPrimitive ( ); // invoke-virtual {p1}, Ljava/lang/Class;->isPrimitive()Z
	 int v1 = 1; // const/4 v1, 0x1
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 3 */
	 } // :cond_0
	 v0 = org.apache.log4j.jmx.LayoutDynamicMBean.n;
	 /* if-nez v0, :cond_1 */
	 final String v0 = "java.lang.String"; // const-string v0, "java.lang.String"
	 org.apache.log4j.jmx.LayoutDynamicMBean .a ( v0 );
} // :cond_1
/* if-ne p1, v0, :cond_2 */
/* .line 4 */
} // :cond_2
v0 = org.apache.log4j.jmx.LayoutDynamicMBean.m;
/* if-nez v0, :cond_3 */
final String v0 = "org.apache.log4j.Level"; // const-string v0, "org.apache.log4j.Level"
org.apache.log4j.jmx.LayoutDynamicMBean .a ( v0 );
} // :cond_3
p1 = (( java.lang.Class ) p1 ).isAssignableFrom ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
if ( p1 != null) { // if-eqz p1, :cond_4
} // :cond_4
int p1 = 0; // const/4 p1, 0x0
} // .end method
public final void b ( ) {
/* .locals 17 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/beans/IntrospectionException; */
/* } */
} // .end annotation
/* move-object/from16 v0, p0 */
/* .line 1 */
/* const-class v1, Lorg/apache/log4j/jmx/LayoutDynamicMBean; */
(( java.lang.Class ) v1 ).getConstructors ( ); // invoke-virtual {v1}, Ljava/lang/Class;->getConstructors()[Ljava/lang/reflect/Constructor;
/* .line 2 */
v2 = this.d;
/* new-instance v3, Ljavax/management/MBeanConstructorInfo; */
int v4 = 0; // const/4 v4, 0x0
/* aget-object v1, v1, v4 */
final String v5 = "LayoutDynamicMBean(): Constructs a LayoutDynamicMBean instance"; // const-string v5, "LayoutDynamicMBean(): Constructs a LayoutDynamicMBean instance"
/* invoke-direct {v3, v5, v1}, Ljavax/management/MBeanConstructorInfo;-><init>(Ljava/lang/String;Ljava/lang/reflect/Constructor;)V */
/* aput-object v3, v2, v4 */
/* .line 3 */
v1 = this.j;
(( java.lang.Object ) v1 ).getClass ( ); // invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
java.beans.Introspector .getBeanInfo ( v1 );
/* .line 4 */
/* .line 5 */
/* array-length v2, v1 */
int v3 = 0; // const/4 v3, 0x0
} // :goto_0
/* if-ge v3, v2, :cond_4 */
/* .line 6 */
/* aget-object v5, v1, v3 */
(( java.beans.PropertyDescriptor ) v5 ).getName ( ); // invoke-virtual {v5}, Ljava/beans/PropertyDescriptor;->getName()Ljava/lang/String;
/* .line 7 */
/* aget-object v6, v1, v3 */
(( java.beans.PropertyDescriptor ) v6 ).getReadMethod ( ); // invoke-virtual {v6}, Ljava/beans/PropertyDescriptor;->getReadMethod()Ljava/lang/reflect/Method;
/* .line 8 */
/* aget-object v6, v1, v3 */
(( java.beans.PropertyDescriptor ) v6 ).getWriteMethod ( ); // invoke-virtual {v6}, Ljava/beans/PropertyDescriptor;->getWriteMethod()Ljava/lang/reflect/Method;
if ( v13 != null) { // if-eqz v13, :cond_3
/* .line 9 */
(( java.lang.reflect.Method ) v13 ).getReturnType ( ); // invoke-virtual {v13}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;
/* .line 10 */
v7 = (( org.apache.log4j.jmx.LayoutDynamicMBean ) v0 ).a ( v6 ); // invoke-virtual {v0, v6}, Lorg/apache/log4j/jmx/LayoutDynamicMBean;->a(Ljava/lang/Class;)Z
if ( v7 != null) { // if-eqz v7, :cond_3
/* .line 11 */
v7 = org.apache.log4j.jmx.LayoutDynamicMBean.m;
/* if-nez v7, :cond_0 */
final String v7 = "org.apache.log4j.Level"; // const-string v7, "org.apache.log4j.Level"
org.apache.log4j.jmx.LayoutDynamicMBean .a ( v7 );
} // :cond_0
v7 = (( java.lang.Class ) v6 ).isAssignableFrom ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
if ( v7 != null) { // if-eqz v7, :cond_1
final String v6 = "java.lang.String"; // const-string v6, "java.lang.String"
/* .line 12 */
} // :cond_1
(( java.lang.Class ) v6 ).getName ( ); // invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;
} // :goto_1
/* move-object v8, v6 */
/* .line 13 */
v15 = this.e;
/* new-instance v12, Ljavax/management/MBeanAttributeInfo; */
int v10 = 1; // const/4 v10, 0x1
if ( v14 != null) { // if-eqz v14, :cond_2
int v6 = 1; // const/4 v6, 0x1
int v11 = 1; // const/4 v11, 0x1
} // :cond_2
int v11 = 0; // const/4 v11, 0x0
} // :goto_2
/* const/16 v16, 0x0 */
final String v9 = "Dynamic"; // const-string v9, "Dynamic"
/* move-object v6, v12 */
/* move-object v7, v5 */
/* move-object v4, v12 */
/* move/from16 v12, v16 */
/* invoke-direct/range {v6 ..v12}, Ljavax/management/MBeanAttributeInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)V */
(( java.util.Vector ) v15 ).add ( v4 ); // invoke-virtual {v15, v4}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z
/* .line 14 */
v4 = this.g;
/* new-instance v6, Lm/a/b/i/a; */
/* invoke-direct {v6, v13, v14}, Lm/a/b/i/a;-><init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V */
(( java.util.Hashtable ) v4 ).put ( v5, v6 ); // invoke-virtual {v4, v5, v6}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
} // :cond_3
/* add-int/lit8 v3, v3, 0x1 */
int v4 = 0; // const/4 v4, 0x0
} // :cond_4
int v3 = 0; // const/4 v3, 0x0
/* new-array v7, v3, [Ljavax/management/MBeanParameterInfo; */
/* .line 15 */
v1 = this.h;
/* new-instance v2, Ljavax/management/MBeanOperationInfo; */
int v9 = 1; // const/4 v9, 0x1
final String v5 = "activateOptions"; // const-string v5, "activateOptions"
final String v6 = "activateOptions(): add an layout"; // const-string v6, "activateOptions(): add an layout"
final String v8 = "void"; // const-string v8, "void"
/* move-object v4, v2 */
/* invoke-direct/range {v4 ..v9}, Ljavax/management/MBeanOperationInfo;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljavax/management/MBeanParameterInfo;Ljava/lang/String;I)V */
int v3 = 0; // const/4 v3, 0x0
/* aput-object v2, v1, v3 */
return;
} // .end method
public java.lang.Object getAttribute ( java.lang.String p0 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljavax/management/AttributeNotFoundException;, */
/* Ljavax/management/MBeanException;, */
/* Ljavax/management/ReflectionException; */
/* } */
} // .end annotation
if ( p1 != null) { // if-eqz p1, :cond_3
/* .line 1 */
v0 = this.g;
(( java.util.Hashtable ) v0 ).get ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Lm/a/b/i/a; */
/* .line 2 */
v1 = org.apache.log4j.jmx.LayoutDynamicMBean.k;
/* new-instance v2, Ljava/lang/StringBuffer; */
/* invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V */
final String v3 = "----name="; // const-string v3, "----name="
(( java.lang.StringBuffer ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v3 = ", mu="; // const-string v3, ", mu="
(( java.lang.StringBuffer ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
(( org.apache.log4j.Category ) v1 ).debug ( v2 ); // invoke-virtual {v1, v2}, Lorg/apache/log4j/Category;->debug(Ljava/lang/Object;)V
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 3 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_2
int p1 = 0; // const/4 p1, 0x0
/* .line 4 */
try { // :try_start_0
v1 = this.j;
(( java.lang.reflect.Method ) v0 ).invoke ( v1, p1 ); // invoke-virtual {v0, v1, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/* :try_end_0 */
/* .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Ljava/lang/IllegalAccessException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catch Ljava/lang/RuntimeException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* :catch_1 */
/* move-exception v0 */
/* .line 5 */
(( java.lang.reflect.InvocationTargetException ) v0 ).getTargetException ( ); // invoke-virtual {v0}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;
/* instance-of v1, v1, Ljava/lang/InterruptedException; */
/* if-nez v1, :cond_0 */
(( java.lang.reflect.InvocationTargetException ) v0 ).getTargetException ( ); // invoke-virtual {v0}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;
/* instance-of v0, v0, Ljava/io/InterruptedIOException; */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 6 */
} // :cond_0
java.lang.Thread .currentThread ( );
(( java.lang.Thread ) v0 ).interrupt ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V
} // :cond_1
/* .line 7 */
} // :cond_2
/* new-instance v0, Ljavax/management/AttributeNotFoundException; */
/* new-instance v1, Ljava/lang/StringBuffer; */
/* invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V */
final String v2 = "Cannot find "; // const-string v2, "Cannot find "
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String p1 = " attribute in "; // const-string p1, " attribute in "
(( java.lang.StringBuffer ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
p1 = this.f;
(( java.lang.StringBuffer ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
/* invoke-direct {v0, p1}, Ljavax/management/AttributeNotFoundException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* .line 8 */
} // :cond_3
/* new-instance p1, Ljavax/management/RuntimeOperationsException; */
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
final String v1 = "Attribute name cannot be null"; // const-string v1, "Attribute name cannot be null"
/* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* new-instance v1, Ljava/lang/StringBuffer; */
/* invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V */
final String v2 = "Cannot invoke a getter of "; // const-string v2, "Cannot invoke a getter of "
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
v2 = this.f;
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v2 = " with null attribute name"; // const-string v2, " with null attribute name"
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
/* invoke-direct {p1, v0, v1}, Ljavax/management/RuntimeOperationsException;-><init>(Ljava/lang/RuntimeException;Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public javax.management.MBeanInfo getMBeanInfo ( ) {
/* .locals 8 */
/* .line 1 */
v0 = org.apache.log4j.jmx.LayoutDynamicMBean.k;
final String v1 = "getMBeanInfo called."; // const-string v1, "getMBeanInfo called."
(( org.apache.log4j.Category ) v0 ).debug ( v1 ); // invoke-virtual {v0, v1}, Lorg/apache/log4j/Category;->debug(Ljava/lang/Object;)V
/* .line 2 */
v0 = this.e;
v0 = (( java.util.Vector ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/Vector;->size()I
/* new-array v4, v0, [Ljavax/management/MBeanAttributeInfo; */
/* .line 3 */
v0 = this.e;
(( java.util.Vector ) v0 ).toArray ( v4 ); // invoke-virtual {v0, v4}, Ljava/util/Vector;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;
/* .line 4 */
/* new-instance v0, Ljavax/management/MBeanInfo; */
v2 = this.f;
v3 = this.i;
v5 = this.d;
v6 = this.h;
int v1 = 0; // const/4 v1, 0x0
/* new-array v7, v1, [Ljavax/management/MBeanNotificationInfo; */
/* move-object v1, v0 */
/* invoke-direct/range {v1 ..v7}, Ljavax/management/MBeanInfo;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljavax/management/MBeanAttributeInfo;[Ljavax/management/MBeanConstructorInfo;[Ljavax/management/MBeanOperationInfo;[Ljavax/management/MBeanNotificationInfo;)V */
} // .end method
public java.lang.Object invoke ( java.lang.String p0, java.lang.Object[] p1, java.lang.String[] p2 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljavax/management/MBeanException;, */
/* Ljavax/management/ReflectionException; */
/* } */
} // .end annotation
final String p2 = "activateOptions"; // const-string p2, "activateOptions"
/* .line 1 */
p1 = (( java.lang.String ) p1 ).equals ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( p1 != null) { // if-eqz p1, :cond_0
p1 = this.j;
/* instance-of p2, p1, Lorg/apache/log4j/spi/OptionHandler; */
if ( p2 != null) { // if-eqz p2, :cond_0
/* .line 2 */
final String p1 = "Options activated."; // const-string p1, "Options activated."
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // .end method
public void setAttribute ( javax.management.Attribute p0 ) {
/* .locals 7 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljavax/management/AttributeNotFoundException;, */
/* Ljavax/management/InvalidAttributeValueException;, */
/* Ljavax/management/MBeanException;, */
/* Ljavax/management/ReflectionException; */
/* } */
} // .end annotation
final String v0 = "FIXME"; // const-string v0, "FIXME"
if ( p1 != null) { // if-eqz p1, :cond_6
/* .line 1 */
(( javax.management.Attribute ) p1 ).getName ( ); // invoke-virtual {p1}, Ljavax/management/Attribute;->getName()Ljava/lang/String;
/* .line 2 */
(( javax.management.Attribute ) p1 ).getValue ( ); // invoke-virtual {p1}, Ljavax/management/Attribute;->getValue()Ljava/lang/Object;
if ( v1 != null) { // if-eqz v1, :cond_5
/* .line 3 */
v2 = this.g;
(( java.util.Hashtable ) v2 ).get ( v1 ); // invoke-virtual {v2, v1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v2, Lm/a/b/i/a; */
if ( v2 != null) { // if-eqz v2, :cond_4
/* .line 4 */
v3 = this.b;
if ( v3 != null) { // if-eqz v3, :cond_4
int v4 = 1; // const/4 v4, 0x1
/* new-array v4, v4, [Ljava/lang/Object; */
/* .line 5 */
(( java.lang.reflect.Method ) v3 ).getParameterTypes ( ); // invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;
int v5 = 0; // const/4 v5, 0x0
/* .line 6 */
/* aget-object v3, v3, v5 */
v6 = org.apache.log4j.jmx.LayoutDynamicMBean.o;
/* if-nez v6, :cond_0 */
final String v6 = "org.apache.log4j.Priority"; // const-string v6, "org.apache.log4j.Priority"
org.apache.log4j.jmx.LayoutDynamicMBean .a ( v6 );
} // :cond_0
/* if-ne v3, v6, :cond_1 */
/* .line 7 */
/* check-cast p1, Ljava/lang/String; */
(( org.apache.log4j.jmx.LayoutDynamicMBean ) p0 ).getAttribute ( v1 ); // invoke-virtual {p0, v1}, Lorg/apache/log4j/jmx/LayoutDynamicMBean;->getAttribute(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v1, Lorg/apache/log4j/Level; */
org.apache.log4j.helpers.OptionConverter .toLevel ( p1,v1 );
} // :cond_1
/* aput-object p1, v4, v5 */
/* .line 8 */
try { // :try_start_0
p1 = this.b;
v1 = this.j;
(( java.lang.reflect.Method ) p1 ).invoke ( v1, v4 ); // invoke-virtual {p1, v1, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/* :try_end_0 */
/* .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 ..:try_end_0} :catch_2 */
/* .catch Ljava/lang/IllegalAccessException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Ljava/lang/RuntimeException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p1 */
/* .line 9 */
v1 = org.apache.log4j.jmx.LayoutDynamicMBean.k;
(( org.apache.log4j.Category ) v1 ).error ( v0, p1 ); // invoke-virtual {v1, v0, p1}, Lorg/apache/log4j/Category;->error(Ljava/lang/Object;Ljava/lang/Throwable;)V
/* :catch_1 */
/* move-exception p1 */
/* .line 10 */
v1 = org.apache.log4j.jmx.LayoutDynamicMBean.k;
(( org.apache.log4j.Category ) v1 ).error ( v0, p1 ); // invoke-virtual {v1, v0, p1}, Lorg/apache/log4j/Category;->error(Ljava/lang/Object;Ljava/lang/Throwable;)V
/* :catch_2 */
/* move-exception p1 */
/* .line 11 */
(( java.lang.reflect.InvocationTargetException ) p1 ).getTargetException ( ); // invoke-virtual {p1}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;
/* instance-of v1, v1, Ljava/lang/InterruptedException; */
/* if-nez v1, :cond_2 */
(( java.lang.reflect.InvocationTargetException ) p1 ).getTargetException ( ); // invoke-virtual {p1}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;
/* instance-of v1, v1, Ljava/io/InterruptedIOException; */
if ( v1 != null) { // if-eqz v1, :cond_3
/* .line 12 */
} // :cond_2
java.lang.Thread .currentThread ( );
(( java.lang.Thread ) v1 ).interrupt ( ); // invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V
/* .line 13 */
} // :cond_3
v1 = org.apache.log4j.jmx.LayoutDynamicMBean.k;
(( org.apache.log4j.Category ) v1 ).error ( v0, p1 ); // invoke-virtual {v1, v0, p1}, Lorg/apache/log4j/Category;->error(Ljava/lang/Object;Ljava/lang/Throwable;)V
} // :goto_0
return;
/* .line 14 */
} // :cond_4
/* new-instance p1, Ljavax/management/AttributeNotFoundException; */
/* new-instance v0, Ljava/lang/StringBuffer; */
/* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
final String v2 = "Attribute "; // const-string v2, "Attribute "
(( java.lang.StringBuffer ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v1 = " not found in "; // const-string v1, " not found in "
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* const-class v1, Lorg/apache/log4j/jmx/LayoutDynamicMBean; */
(( java.lang.Class ) v1 ).getName ( ); // invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
/* invoke-direct {p1, v0}, Ljavax/management/AttributeNotFoundException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
/* .line 15 */
} // :cond_5
/* new-instance p1, Ljavax/management/RuntimeOperationsException; */
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
final String v1 = "Attribute name cannot be null"; // const-string v1, "Attribute name cannot be null"
/* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* new-instance v1, Ljava/lang/StringBuffer; */
/* invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V */
final String v2 = "Cannot invoke the setter of "; // const-string v2, "Cannot invoke the setter of "
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
v2 = this.f;
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v2 = " with null attribute name"; // const-string v2, " with null attribute name"
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
/* invoke-direct {p1, v0, v1}, Ljavax/management/RuntimeOperationsException;-><init>(Ljava/lang/RuntimeException;Ljava/lang/String;)V */
/* throw p1 */
/* .line 16 */
} // :cond_6
/* new-instance p1, Ljavax/management/RuntimeOperationsException; */
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
final String v1 = "Attribute cannot be null"; // const-string v1, "Attribute cannot be null"
/* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* new-instance v1, Ljava/lang/StringBuffer; */
/* invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V */
final String v2 = "Cannot invoke a setter of "; // const-string v2, "Cannot invoke a setter of "
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
v2 = this.f;
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v2 = " with null attribute"; // const-string v2, " with null attribute"
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
/* invoke-direct {p1, v0, v1}, Ljavax/management/RuntimeOperationsException;-><init>(Ljava/lang/RuntimeException;Ljava/lang/String;)V */
/* throw p1 */
} // .end method
