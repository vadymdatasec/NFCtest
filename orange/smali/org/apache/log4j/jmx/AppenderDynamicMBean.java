public class org.apache.log4j.jmx.AppenderDynamicMBean extends org.apache.log4j.jmx.AbstractDynamicMBean {
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
	 public org.apache.log4j.Appender j;
	 /* # direct methods */
	 public static org.apache.log4j.jmx.AppenderDynamicMBean ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = org.apache.log4j.jmx.AppenderDynamicMBean.l;
		 /* if-nez v0, :cond_0 */
		 final String v0 = "org.apache.log4j.jmx.AppenderDynamicMBean"; // const-string v0, "org.apache.log4j.jmx.AppenderDynamicMBean"
		 org.apache.log4j.jmx.AppenderDynamicMBean .a ( v0 );
	 } // :cond_0
	 org.apache.log4j.Logger .getLogger ( v0 );
	 return;
} // .end method
public org.apache.log4j.jmx.AppenderDynamicMBean ( ) {
	 /* .locals 2 */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Ljava/beans/IntrospectionException; */
	 /* } */
} // .end annotation
/* .line 1 */
/* invoke-direct {p0}, Lorg/apache/log4j/jmx/AbstractDynamicMBean;-><init>()V */
int v0 = 1; // const/4 v0, 0x1
/* new-array v0, v0, [Ljavax/management/MBeanConstructorInfo; */
/* .line 2 */
this.d = v0;
/* .line 3 */
/* new-instance v0, Ljava/util/Vector; */
/* invoke-direct {v0}, Ljava/util/Vector;-><init>()V */
this.e = v0;
/* .line 4 */
/* const-class v0, Lorg/apache/log4j/jmx/AppenderDynamicMBean; */
(( java.lang.Class ) v0 ).getName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;
this.f = v0;
/* .line 5 */
/* new-instance v0, Ljava/util/Hashtable; */
int v1 = 5; // const/4 v1, 0x5
/* invoke-direct {v0, v1}, Ljava/util/Hashtable;-><init>(I)V */
this.g = v0;
int v0 = 2; // const/4 v0, 0x2
/* new-array v0, v0, [Ljavax/management/MBeanOperationInfo; */
/* .line 6 */
this.h = v0;
final String v0 = "This MBean acts as a management facade for log4j appenders."; // const-string v0, "This MBean acts as a management facade for log4j appenders."
/* .line 7 */
this.i = v0;
/* .line 8 */
this.j = p1;
/* .line 9 */
(( org.apache.log4j.jmx.AppenderDynamicMBean ) p0 ).b ( ); // invoke-virtual {p0}, Lorg/apache/log4j/jmx/AppenderDynamicMBean;->b()V
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
	 /* .line 15 */
	 v0 = org.apache.log4j.jmx.AppenderDynamicMBean.k;
} // .end method
public void a ( org.apache.log4j.Layout p0 ) {
	 /* .locals 11 */
	 final String v0 = "]."; // const-string v0, "]."
	 final String v1 = "Could not add DynamicLayoutMBean for ["; // const-string v1, "Could not add DynamicLayoutMBean for ["
	 /* if-nez p1, :cond_0 */
	 return;
	 /* .line 5 */
} // :cond_0
/* new-instance v2, Ljava/lang/StringBuffer; */
/* invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V */
v3 = this.j;
org.apache.log4j.jmx.AbstractDynamicMBean .a ( v3 );
(( java.lang.StringBuffer ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v3 = ",layout="; // const-string v3, ",layout="
(( java.lang.StringBuffer ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.Object ) p1 ).getClass ( ); // invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( java.lang.Class ) v3 ).getName ( ); // invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;
(( java.lang.StringBuffer ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
/* .line 6 */
v3 = org.apache.log4j.jmx.AppenderDynamicMBean.k;
/* new-instance v4, Ljava/lang/StringBuffer; */
/* invoke-direct {v4}, Ljava/lang/StringBuffer;-><init>()V */
final String v5 = "Adding LayoutMBean:"; // const-string v5, "Adding LayoutMBean:"
(( java.lang.StringBuffer ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v4 ).append ( v2 ); // invoke-virtual {v4, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
(( org.apache.log4j.Category ) v3 ).debug ( v4 ); // invoke-virtual {v3, v4}, Lorg/apache/log4j/Category;->debug(Ljava/lang/Object;)V
/* .line 7 */
try { // :try_start_0
	 /* new-instance v3, Lorg/apache/log4j/jmx/LayoutDynamicMBean; */
	 /* invoke-direct {v3, p1}, Lorg/apache/log4j/jmx/LayoutDynamicMBean;-><init>(Lorg/apache/log4j/Layout;)V */
	 /* .line 8 */
	 /* new-instance p1, Ljavax/management/ObjectName; */
	 /* new-instance v4, Ljava/lang/StringBuffer; */
	 /* invoke-direct {v4}, Ljava/lang/StringBuffer;-><init>()V */
	 final String v5 = "log4j:appender="; // const-string v5, "log4j:appender="
	 (( java.lang.StringBuffer ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 (( java.lang.StringBuffer ) v4 ).append ( v2 ); // invoke-virtual {v4, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 (( java.lang.StringBuffer ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
	 /* invoke-direct {p1, v4}, Ljavax/management/ObjectName;-><init>(Ljava/lang/String;)V */
	 /* .line 9 */
	 v4 = 	 v4 = this.b;
	 /* if-nez v4, :cond_1 */
	 /* .line 10 */
	 (( org.apache.log4j.jmx.AbstractDynamicMBean ) p0 ).a ( v3, p1 ); // invoke-virtual {p0, v3, p1}, Lorg/apache/log4j/jmx/AbstractDynamicMBean;->a(Ljava/lang/Object;Ljavax/management/ObjectName;)V
	 /* .line 11 */
	 p1 = this.e;
	 /* new-instance v10, Ljavax/management/MBeanAttributeInfo; */
	 /* new-instance v3, Ljava/lang/StringBuffer; */
	 /* invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V */
	 final String v4 = "appender="; // const-string v4, "appender="
	 (( java.lang.StringBuffer ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 (( java.lang.StringBuffer ) v3 ).append ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 (( java.lang.StringBuffer ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
	 final String v5 = "javax.management.ObjectName"; // const-string v5, "javax.management.ObjectName"
	 /* new-instance v3, Ljava/lang/StringBuffer; */
	 /* invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V */
	 final String v6 = "The "; // const-string v6, "The "
	 (( java.lang.StringBuffer ) v3 ).append ( v6 ); // invoke-virtual {v3, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 (( java.lang.StringBuffer ) v3 ).append ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 final String v6 = " layout."; // const-string v6, " layout."
	 (( java.lang.StringBuffer ) v3 ).append ( v6 ); // invoke-virtual {v3, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 (( java.lang.StringBuffer ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
	 int v7 = 1; // const/4 v7, 0x1
	 int v8 = 1; // const/4 v8, 0x1
	 int v9 = 0; // const/4 v9, 0x0
	 /* move-object v3, v10 */
	 /* invoke-direct/range {v3 ..v9}, Ljavax/management/MBeanAttributeInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)V */
	 (( java.util.Vector ) p1 ).add ( v10 ); // invoke-virtual {p1, v10}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z
	 /* :try_end_0 */
	 /* .catch Ljavax/management/JMException; {:try_start_0 ..:try_end_0} :catch_2 */
	 /* .catch Ljava/beans/IntrospectionException; {:try_start_0 ..:try_end_0} :catch_1 */
	 /* .catch Ljava/lang/RuntimeException; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* :catch_0 */
	 /* move-exception p1 */
	 /* .line 12 */
	 v3 = org.apache.log4j.jmx.AppenderDynamicMBean.k;
	 /* new-instance v4, Ljava/lang/StringBuffer; */
	 /* invoke-direct {v4}, Ljava/lang/StringBuffer;-><init>()V */
	 (( java.lang.StringBuffer ) v4 ).append ( v1 ); // invoke-virtual {v4, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 (( java.lang.StringBuffer ) v4 ).append ( v2 ); // invoke-virtual {v4, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 (( java.lang.StringBuffer ) v4 ).append ( v0 ); // invoke-virtual {v4, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 (( java.lang.StringBuffer ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
	 (( org.apache.log4j.Category ) v3 ).error ( v0, p1 ); // invoke-virtual {v3, v0, p1}, Lorg/apache/log4j/Category;->error(Ljava/lang/Object;Ljava/lang/Throwable;)V
	 /* :catch_1 */
	 /* move-exception p1 */
	 /* .line 13 */
	 v3 = org.apache.log4j.jmx.AppenderDynamicMBean.k;
	 /* new-instance v4, Ljava/lang/StringBuffer; */
	 /* invoke-direct {v4}, Ljava/lang/StringBuffer;-><init>()V */
	 (( java.lang.StringBuffer ) v4 ).append ( v1 ); // invoke-virtual {v4, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 (( java.lang.StringBuffer ) v4 ).append ( v2 ); // invoke-virtual {v4, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 (( java.lang.StringBuffer ) v4 ).append ( v0 ); // invoke-virtual {v4, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 (( java.lang.StringBuffer ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
	 (( org.apache.log4j.Category ) v3 ).error ( v0, p1 ); // invoke-virtual {v3, v0, p1}, Lorg/apache/log4j/Category;->error(Ljava/lang/Object;Ljava/lang/Throwable;)V
	 /* :catch_2 */
	 /* move-exception p1 */
	 /* .line 14 */
	 v3 = org.apache.log4j.jmx.AppenderDynamicMBean.k;
	 /* new-instance v4, Ljava/lang/StringBuffer; */
	 /* invoke-direct {v4}, Ljava/lang/StringBuffer;-><init>()V */
	 (( java.lang.StringBuffer ) v4 ).append ( v1 ); // invoke-virtual {v4, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 (( java.lang.StringBuffer ) v4 ).append ( v2 ); // invoke-virtual {v4, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 (( java.lang.StringBuffer ) v4 ).append ( v0 ); // invoke-virtual {v4, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 (( java.lang.StringBuffer ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
	 (( org.apache.log4j.Category ) v3 ).error ( v0, p1 ); // invoke-virtual {v3, v0, p1}, Lorg/apache/log4j/Category;->error(Ljava/lang/Object;Ljava/lang/Throwable;)V
} // :cond_1
} // :goto_0
return;
} // .end method
public final Boolean a ( java.lang.Class p0 ) {
/* .locals 2 */
/* .line 2 */
v0 = (( java.lang.Class ) p1 ).isPrimitive ( ); // invoke-virtual {p1}, Ljava/lang/Class;->isPrimitive()Z
int v1 = 1; // const/4 v1, 0x1
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
} // :cond_0
v0 = org.apache.log4j.jmx.AppenderDynamicMBean.n;
/* if-nez v0, :cond_1 */
final String v0 = "java.lang.String"; // const-string v0, "java.lang.String"
org.apache.log4j.jmx.AppenderDynamicMBean .a ( v0 );
} // :cond_1
/* if-ne p1, v0, :cond_2 */
/* .line 4 */
} // :cond_2
v0 = org.apache.log4j.jmx.AppenderDynamicMBean.m;
/* if-nez v0, :cond_3 */
final String v0 = "org.apache.log4j.Priority"; // const-string v0, "org.apache.log4j.Priority"
org.apache.log4j.jmx.AppenderDynamicMBean .a ( v0 );
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
/* const-class v1, Lorg/apache/log4j/jmx/AppenderDynamicMBean; */
(( java.lang.Class ) v1 ).getConstructors ( ); // invoke-virtual {v1}, Ljava/lang/Class;->getConstructors()[Ljava/lang/reflect/Constructor;
/* .line 2 */
v2 = this.d;
/* new-instance v3, Ljavax/management/MBeanConstructorInfo; */
int v4 = 0; // const/4 v4, 0x0
/* aget-object v1, v1, v4 */
final String v5 = "AppenderDynamicMBean(): Constructs a AppenderDynamicMBean instance"; // const-string v5, "AppenderDynamicMBean(): Constructs a AppenderDynamicMBean instance"
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
final String v5 = "java.lang.String"; // const-string v5, "java.lang.String"
int v6 = 1; // const/4 v6, 0x1
/* if-ge v3, v2, :cond_4 */
/* .line 6 */
/* aget-object v7, v1, v3 */
(( java.beans.PropertyDescriptor ) v7 ).getName ( ); // invoke-virtual {v7}, Ljava/beans/PropertyDescriptor;->getName()Ljava/lang/String;
/* .line 7 */
/* aget-object v8, v1, v3 */
(( java.beans.PropertyDescriptor ) v8 ).getReadMethod ( ); // invoke-virtual {v8}, Ljava/beans/PropertyDescriptor;->getReadMethod()Ljava/lang/reflect/Method;
/* .line 8 */
/* aget-object v8, v1, v3 */
(( java.beans.PropertyDescriptor ) v8 ).getWriteMethod ( ); // invoke-virtual {v8}, Ljava/beans/PropertyDescriptor;->getWriteMethod()Ljava/lang/reflect/Method;
if ( v15 != null) { // if-eqz v15, :cond_3
/* .line 9 */
(( java.lang.reflect.Method ) v15 ).getReturnType ( ); // invoke-virtual {v15}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;
/* .line 10 */
v9 = (( org.apache.log4j.jmx.AppenderDynamicMBean ) v0 ).a ( v8 ); // invoke-virtual {v0, v8}, Lorg/apache/log4j/jmx/AppenderDynamicMBean;->a(Ljava/lang/Class;)Z
if ( v9 != null) { // if-eqz v9, :cond_3
/* .line 11 */
v9 = org.apache.log4j.jmx.AppenderDynamicMBean.m;
/* if-nez v9, :cond_0 */
final String v9 = "org.apache.log4j.Priority"; // const-string v9, "org.apache.log4j.Priority"
org.apache.log4j.jmx.AppenderDynamicMBean .a ( v9 );
} // :cond_0
v9 = (( java.lang.Class ) v8 ).isAssignableFrom ( v9 ); // invoke-virtual {v8, v9}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
if ( v9 != null) { // if-eqz v9, :cond_1
/* .line 12 */
} // :cond_1
(( java.lang.Class ) v8 ).getName ( ); // invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;
} // :goto_1
/* move-object v10, v5 */
/* .line 13 */
v5 = this.e;
/* new-instance v13, Ljavax/management/MBeanAttributeInfo; */
int v12 = 1; // const/4 v12, 0x1
if ( v14 != null) { // if-eqz v14, :cond_2
} // :cond_2
int v6 = 0; // const/4 v6, 0x0
} // :goto_2
/* const/16 v16, 0x0 */
final String v11 = "Dynamic"; // const-string v11, "Dynamic"
/* move-object v8, v13 */
/* move-object v9, v7 */
/* move-object v4, v13 */
/* move v13, v6 */
/* move-object v6, v14 */
/* move/from16 v14, v16 */
/* invoke-direct/range {v8 ..v14}, Ljavax/management/MBeanAttributeInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)V */
(( java.util.Vector ) v5 ).add ( v4 ); // invoke-virtual {v5, v4}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z
/* .line 14 */
v4 = this.g;
/* new-instance v5, Lm/a/b/i/a; */
/* invoke-direct {v5, v15, v6}, Lm/a/b/i/a;-><init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V */
(( java.util.Hashtable ) v4 ).put ( v7, v5 ); // invoke-virtual {v4, v7, v5}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
} // :cond_3
/* add-int/lit8 v3, v3, 0x1 */
int v4 = 0; // const/4 v4, 0x0
} // :cond_4
int v3 = 0; // const/4 v3, 0x0
/* new-array v10, v3, [Ljavax/management/MBeanParameterInfo; */
/* .line 15 */
v1 = this.h;
/* new-instance v2, Ljavax/management/MBeanOperationInfo; */
int v12 = 1; // const/4 v12, 0x1
final String v8 = "activateOptions"; // const-string v8, "activateOptions"
final String v9 = "activateOptions(): add an appender"; // const-string v9, "activateOptions(): add an appender"
final String v11 = "void"; // const-string v11, "void"
/* move-object v7, v2 */
/* invoke-direct/range {v7 ..v12}, Ljavax/management/MBeanOperationInfo;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljavax/management/MBeanParameterInfo;Ljava/lang/String;I)V */
int v3 = 0; // const/4 v3, 0x0
/* aput-object v2, v1, v3 */
/* new-array v10, v6, [Ljavax/management/MBeanParameterInfo; */
/* .line 16 */
/* new-instance v1, Ljavax/management/MBeanParameterInfo; */
final String v2 = "layout class"; // const-string v2, "layout class"
/* invoke-direct {v1, v2, v5, v2}, Ljavax/management/MBeanParameterInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V */
/* aput-object v1, v10, v3 */
/* .line 17 */
v1 = this.h;
/* new-instance v2, Ljavax/management/MBeanOperationInfo; */
final String v8 = "setLayout"; // const-string v8, "setLayout"
final String v9 = "setLayout(): add a layout"; // const-string v9, "setLayout(): add a layout"
final String v11 = "void"; // const-string v11, "void"
/* move-object v7, v2 */
/* invoke-direct/range {v7 ..v12}, Ljavax/management/MBeanOperationInfo;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljavax/management/MBeanParameterInfo;Ljava/lang/String;I)V */
/* aput-object v2, v1, v6 */
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
final String v0 = "attributeName"; // const-string v0, "attributeName"
if ( p1 != null) { // if-eqz p1, :cond_4
/* .line 1 */
v1 = org.apache.log4j.jmx.AppenderDynamicMBean.k;
/* new-instance v2, Ljava/lang/StringBuffer; */
/* invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V */
final String v3 = "getAttribute called with ["; // const-string v3, "getAttribute called with ["
(( java.lang.StringBuffer ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v3 = "]."; // const-string v3, "]."
(( java.lang.StringBuffer ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
(( org.apache.log4j.Category ) v1 ).debug ( v2 ); // invoke-virtual {v1, v2}, Lorg/apache/log4j/Category;->debug(Ljava/lang/Object;)V
/* .line 2 */
/* new-instance v1, Ljava/lang/StringBuffer; */
/* invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V */
final String v2 = "appender="; // const-string v2, "appender="
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
v2 = this.j;
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v2 = ",layout"; // const-string v2, ",layout"
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
v1 = (( java.lang.String ) p1 ).startsWith ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 3 */
try { // :try_start_0
/* new-instance v1, Ljavax/management/ObjectName; */
/* new-instance v2, Ljava/lang/StringBuffer; */
/* invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V */
final String v3 = "log4j:"; // const-string v3, "log4j:"
(( java.lang.StringBuffer ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
/* invoke-direct {v1, v2}, Ljavax/management/ObjectName;-><init>(Ljava/lang/String;)V */
/* :try_end_0 */
/* .catch Ljavax/management/MalformedObjectNameException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Ljava/lang/RuntimeException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v1 */
/* .line 4 */
v2 = org.apache.log4j.jmx.AppenderDynamicMBean.k;
(( org.apache.log4j.Category ) v2 ).error ( v0, v1 ); // invoke-virtual {v2, v0, v1}, Lorg/apache/log4j/Category;->error(Ljava/lang/Object;Ljava/lang/Throwable;)V
/* :catch_1 */
/* move-exception v1 */
/* .line 5 */
v2 = org.apache.log4j.jmx.AppenderDynamicMBean.k;
(( org.apache.log4j.Category ) v2 ).error ( v0, v1 ); // invoke-virtual {v2, v0, v1}, Lorg/apache/log4j/Category;->error(Ljava/lang/Object;Ljava/lang/Throwable;)V
/* .line 6 */
} // :cond_0
} // :goto_0
v0 = this.g;
(( java.util.Hashtable ) v0 ).get ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Lm/a/b/i/a; */
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 7 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_3
int p1 = 0; // const/4 p1, 0x0
/* .line 8 */
try { // :try_start_1
v1 = this.j;
(( java.lang.reflect.Method ) v0 ).invoke ( v1, p1 ); // invoke-virtual {v0, v1, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/* :try_end_1 */
/* .catch Ljava/lang/IllegalAccessException; {:try_start_1 ..:try_end_1} :catch_4 */
/* .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 ..:try_end_1} :catch_3 */
/* .catch Ljava/lang/RuntimeException; {:try_start_1 ..:try_end_1} :catch_2 */
/* :catch_2 */
/* :catch_3 */
/* move-exception v0 */
/* .line 9 */
(( java.lang.reflect.InvocationTargetException ) v0 ).getTargetException ( ); // invoke-virtual {v0}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;
/* instance-of v1, v1, Ljava/lang/InterruptedException; */
/* if-nez v1, :cond_1 */
(( java.lang.reflect.InvocationTargetException ) v0 ).getTargetException ( ); // invoke-virtual {v0}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;
/* instance-of v0, v0, Ljava/io/InterruptedIOException; */
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 10 */
} // :cond_1
java.lang.Thread .currentThread ( );
(( java.lang.Thread ) v0 ).interrupt ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V
/* :catch_4 */
} // :cond_2
/* .line 11 */
} // :cond_3
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
/* .line 12 */
} // :cond_4
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
v0 = org.apache.log4j.jmx.AppenderDynamicMBean.k;
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
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljavax/management/MBeanException;, */
/* Ljavax/management/ReflectionException; */
/* } */
} // .end annotation
final String p3 = "activateOptions"; // const-string p3, "activateOptions"
/* .line 1 */
p3 = (( java.lang.String ) p1 ).equals ( p3 ); // invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( p3 != null) { // if-eqz p3, :cond_0
p3 = this.j;
/* instance-of v0, p3, Lorg/apache/log4j/spi/OptionHandler; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
/* check-cast p3, Lorg/apache/log4j/spi/OptionHandler; */
/* .line 3 */
final String p1 = "Options activated."; // const-string p1, "Options activated."
} // :cond_0
final String p3 = "setLayout"; // const-string p3, "setLayout"
/* .line 4 */
p1 = (( java.lang.String ) p1 ).equals ( p3 ); // invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
int p3 = 0; // const/4 p3, 0x0
if ( p1 != null) { // if-eqz p1, :cond_2
int p1 = 0; // const/4 p1, 0x0
/* .line 5 */
/* aget-object p1, p2, p1 */
/* check-cast p1, Ljava/lang/String; */
p2 = org.apache.log4j.jmx.AppenderDynamicMBean.o;
/* if-nez p2, :cond_1 */
final String p2 = "org.apache.log4j.Layout"; // const-string p2, "org.apache.log4j.Layout"
org.apache.log4j.jmx.AppenderDynamicMBean .a ( p2 );
} // :cond_1
org.apache.log4j.helpers.OptionConverter .instantiateByClassName ( p1,p2,p3 );
/* check-cast p1, Lorg/apache/log4j/Layout; */
/* .line 6 */
p2 = this.j;
/* .line 7 */
(( org.apache.log4j.jmx.AppenderDynamicMBean ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/log4j/jmx/AppenderDynamicMBean;->a(Lorg/apache/log4j/Layout;)V
} // :cond_2
} // .end method
public javax.management.ObjectName preRegister ( javax.management.MBeanServer p0, javax.management.ObjectName p1 ) {
/* .locals 3 */
/* .line 1 */
v0 = org.apache.log4j.jmx.AppenderDynamicMBean.k;
/* new-instance v1, Ljava/lang/StringBuffer; */
/* invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V */
final String v2 = "preRegister called.Server="; // const-string v2, "preRegister called.Server="
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;
final String v2 = ", name="; // const-string v2, ", name="
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
(( org.apache.log4j.Category ) v0 ).debug ( v1 ); // invoke-virtual {v0, v1}, Lorg/apache/log4j/Category;->debug(Ljava/lang/Object;)V
/* .line 2 */
this.b = p1;
/* .line 3 */
p1 = this.j;
(( org.apache.log4j.jmx.AppenderDynamicMBean ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/log4j/jmx/AppenderDynamicMBean;->a(Lorg/apache/log4j/Layout;)V
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
if ( p1 != null) { // if-eqz p1, :cond_7
/* .line 1 */
(( javax.management.Attribute ) p1 ).getName ( ); // invoke-virtual {p1}, Ljavax/management/Attribute;->getName()Ljava/lang/String;
/* .line 2 */
(( javax.management.Attribute ) p1 ).getValue ( ); // invoke-virtual {p1}, Ljavax/management/Attribute;->getValue()Ljava/lang/Object;
if ( v1 != null) { // if-eqz v1, :cond_6
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
v6 = org.apache.log4j.jmx.AppenderDynamicMBean.m;
/* if-nez v6, :cond_0 */
final String v6 = "org.apache.log4j.Priority"; // const-string v6, "org.apache.log4j.Priority"
org.apache.log4j.jmx.AppenderDynamicMBean .a ( v6 );
} // :cond_0
/* if-ne v3, v6, :cond_1 */
/* .line 7 */
/* check-cast p1, Ljava/lang/String; */
(( org.apache.log4j.jmx.AppenderDynamicMBean ) p0 ).getAttribute ( v1 ); // invoke-virtual {p0, v1}, Lorg/apache/log4j/jmx/AppenderDynamicMBean;->getAttribute(Ljava/lang/String;)Ljava/lang/Object;
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
v1 = org.apache.log4j.jmx.AppenderDynamicMBean.k;
(( org.apache.log4j.Category ) v1 ).error ( v0, p1 ); // invoke-virtual {v1, v0, p1}, Lorg/apache/log4j/Category;->error(Ljava/lang/Object;Ljava/lang/Throwable;)V
/* :catch_1 */
/* move-exception p1 */
/* .line 10 */
v1 = org.apache.log4j.jmx.AppenderDynamicMBean.k;
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
v1 = org.apache.log4j.jmx.AppenderDynamicMBean.k;
(( org.apache.log4j.Category ) v1 ).error ( v0, p1 ); // invoke-virtual {v1, v0, p1}, Lorg/apache/log4j/Category;->error(Ljava/lang/Object;Ljava/lang/Throwable;)V
} // :cond_4
final String p1 = ".layout"; // const-string p1, ".layout"
/* .line 14 */
p1 = (( java.lang.String ) v1 ).endsWith ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
if ( p1 != null) { // if-eqz p1, :cond_5
} // :goto_0
return;
/* .line 15 */
} // :cond_5
/* new-instance p1, Ljavax/management/AttributeNotFoundException; */
/* new-instance v0, Ljava/lang/StringBuffer; */
/* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
final String v2 = "Attribute "; // const-string v2, "Attribute "
(( java.lang.StringBuffer ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v1 = " not found in "; // const-string v1, " not found in "
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* const-class v1, Lorg/apache/log4j/jmx/AppenderDynamicMBean; */
(( java.lang.Class ) v1 ).getName ( ); // invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
/* invoke-direct {p1, v0}, Ljavax/management/AttributeNotFoundException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
/* .line 16 */
} // :cond_6
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
/* .line 17 */
} // :cond_7
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
