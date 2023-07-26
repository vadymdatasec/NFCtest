public class org.apache.log4j.jmx.LoggerDynamicMBean extends org.apache.log4j.jmx.AbstractDynamicMBean implements javax.management.NotificationListener {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # static fields */
	 public static org.apache.log4j.Logger j;
	 public static java.lang.Class k; //synthetic
	 public static java.lang.Class l; //synthetic
	 /* # instance fields */
	 public javax.management.MBeanConstructorInfo d;
	 public javax.management.MBeanOperationInfo e;
	 public java.util.Vector f;
	 public java.lang.String g;
	 public java.lang.String h;
	 public org.apache.log4j.Logger i;
	 /* # direct methods */
	 public static org.apache.log4j.jmx.LoggerDynamicMBean ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = org.apache.log4j.jmx.LoggerDynamicMBean.k;
		 /* if-nez v0, :cond_0 */
		 final String v0 = "org.apache.log4j.jmx.LoggerDynamicMBean"; // const-string v0, "org.apache.log4j.jmx.LoggerDynamicMBean"
		 org.apache.log4j.jmx.LoggerDynamicMBean .a ( v0 );
	 } // :cond_0
	 org.apache.log4j.Logger .getLogger ( v0 );
	 return;
} // .end method
public org.apache.log4j.jmx.LoggerDynamicMBean ( ) {
	 /* .locals 2 */
	 /* .line 1 */
	 /* invoke-direct {p0}, Lorg/apache/log4j/jmx/AbstractDynamicMBean;-><init>()V */
	 int v0 = 1; // const/4 v0, 0x1
	 /* new-array v1, v0, [Ljavax/management/MBeanConstructorInfo; */
	 /* .line 2 */
	 this.d = v1;
	 /* new-array v0, v0, [Ljavax/management/MBeanOperationInfo; */
	 /* .line 3 */
	 this.e = v0;
	 /* .line 4 */
	 /* new-instance v0, Ljava/util/Vector; */
	 /* invoke-direct {v0}, Ljava/util/Vector;-><init>()V */
	 this.f = v0;
	 /* .line 5 */
	 /* const-class v0, Lorg/apache/log4j/jmx/LoggerDynamicMBean; */
	 (( java.lang.Class ) v0 ).getName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;
	 this.g = v0;
	 final String v0 = "This MBean acts as a management facade for a org.apache.log4j.Logger instance."; // const-string v0, "This MBean acts as a management facade for a org.apache.log4j.Logger instance."
	 /* .line 6 */
	 this.h = v0;
	 /* .line 7 */
	 this.i = p1;
	 /* .line 8 */
	 (( org.apache.log4j.jmx.LoggerDynamicMBean ) p0 ).c ( ); // invoke-virtual {p0}, Lorg/apache/log4j/jmx/LoggerDynamicMBean;->c()V
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
		 /* .line 2 */
		 v0 = this.i;
	 } // .end method
	 public void a ( java.lang.String p0, java.lang.String p1 ) {
		 /* .locals 3 */
		 /* .line 3 */
		 v0 = org.apache.log4j.jmx.LoggerDynamicMBean.j;
		 /* new-instance v1, Ljava/lang/StringBuffer; */
		 /* invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V */
		 final String v2 = "addAppender called with "; // const-string v2, "addAppender called with "
		 (( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 (( java.lang.StringBuffer ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 final String v2 = ", "; // const-string v2, ", "
		 (( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 (( java.lang.StringBuffer ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 (( java.lang.StringBuffer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
		 (( org.apache.log4j.Category ) v0 ).debug ( v1 ); // invoke-virtual {v0, v1}, Lorg/apache/log4j/Category;->debug(Ljava/lang/Object;)V
		 /* .line 4 */
		 v0 = org.apache.log4j.jmx.LoggerDynamicMBean.l;
		 /* if-nez v0, :cond_0 */
		 final String v0 = "org.apache.log4j.Appender"; // const-string v0, "org.apache.log4j.Appender"
		 org.apache.log4j.jmx.LoggerDynamicMBean .a ( v0 );
	 } // :cond_0
	 int v1 = 0; // const/4 v1, 0x0
	 org.apache.log4j.helpers.OptionConverter .instantiateByClassName ( p1,v0,v1 );
	 /* check-cast p1, Lorg/apache/log4j/Appender; */
	 /* .line 5 */
	 /* .line 6 */
	 p2 = this.i;
	 (( org.apache.log4j.Category ) p2 ).addAppender ( p1 ); // invoke-virtual {p2, p1}, Lorg/apache/log4j/Category;->addAppender(Lorg/apache/log4j/Appender;)V
	 return;
} // .end method
public void b ( ) {
	 /* .locals 2 */
	 /* .line 1 */
	 v0 = this.i;
	 (( org.apache.log4j.Category ) v0 ).getAllAppenders ( ); // invoke-virtual {v0}, Lorg/apache/log4j/Category;->getAllAppenders()Ljava/util/Enumeration;
	 /* .line 2 */
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_0
	 /* .line 3 */
	 /* check-cast v1, Lorg/apache/log4j/Appender; */
	 /* .line 4 */
	 (( org.apache.log4j.jmx.LoggerDynamicMBean ) p0 ).b ( v1 ); // invoke-virtual {p0, v1}, Lorg/apache/log4j/jmx/LoggerDynamicMBean;->b(Lorg/apache/log4j/Appender;)V
} // :cond_0
return;
} // .end method
public void b ( org.apache.log4j.Appender p0 ) {
/* .locals 11 */
final String v0 = "]."; // const-string v0, "]."
final String v1 = "Could not add appenderMBean for ["; // const-string v1, "Could not add appenderMBean for ["
/* .line 5 */
org.apache.log4j.jmx.AbstractDynamicMBean .a ( p1 );
/* .line 6 */
v3 = org.apache.log4j.jmx.LoggerDynamicMBean.j;
/* new-instance v4, Ljava/lang/StringBuffer; */
/* invoke-direct {v4}, Ljava/lang/StringBuffer;-><init>()V */
final String v5 = "Adding AppenderMBean for appender named "; // const-string v5, "Adding AppenderMBean for appender named "
(( java.lang.StringBuffer ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v4 ).append ( v2 ); // invoke-virtual {v4, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
(( org.apache.log4j.Category ) v3 ).debug ( v4 ); // invoke-virtual {v3, v4}, Lorg/apache/log4j/Category;->debug(Ljava/lang/Object;)V
/* .line 7 */
try { // :try_start_0
	 /* new-instance v3, Lorg/apache/log4j/jmx/AppenderDynamicMBean; */
	 /* invoke-direct {v3, p1}, Lorg/apache/log4j/jmx/AppenderDynamicMBean;-><init>(Lorg/apache/log4j/Appender;)V */
	 /* .line 8 */
	 /* new-instance p1, Ljavax/management/ObjectName; */
	 final String v4 = "log4j"; // const-string v4, "log4j"
	 final String v5 = "appender"; // const-string v5, "appender"
	 /* invoke-direct {p1, v4, v5, v2}, Ljavax/management/ObjectName;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V */
	 /* .line 9 */
	 v4 = 	 v4 = this.b;
	 /* if-nez v4, :cond_0 */
	 /* .line 10 */
	 (( org.apache.log4j.jmx.AbstractDynamicMBean ) p0 ).a ( v3, p1 ); // invoke-virtual {p0, v3, p1}, Lorg/apache/log4j/jmx/AbstractDynamicMBean;->a(Ljava/lang/Object;Ljavax/management/ObjectName;)V
	 /* .line 11 */
	 p1 = this.f;
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
	 final String v6 = " appender."; // const-string v6, " appender."
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
	 v3 = org.apache.log4j.jmx.LoggerDynamicMBean.j;
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
	 v3 = org.apache.log4j.jmx.LoggerDynamicMBean.j;
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
	 v3 = org.apache.log4j.jmx.LoggerDynamicMBean.j;
	 /* new-instance v4, Ljava/lang/StringBuffer; */
	 /* invoke-direct {v4}, Ljava/lang/StringBuffer;-><init>()V */
	 (( java.lang.StringBuffer ) v4 ).append ( v1 ); // invoke-virtual {v4, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 (( java.lang.StringBuffer ) v4 ).append ( v2 ); // invoke-virtual {v4, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 (( java.lang.StringBuffer ) v4 ).append ( v0 ); // invoke-virtual {v4, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 (( java.lang.StringBuffer ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
	 (( org.apache.log4j.Category ) v3 ).error ( v0, p1 ); // invoke-virtual {v3, v0, p1}, Lorg/apache/log4j/Category;->error(Ljava/lang/Object;Ljava/lang/Throwable;)V
} // :cond_0
} // :goto_0
return;
} // .end method
public final void c ( ) {
/* .locals 11 */
/* .line 1 */
/* const-class v0, Lorg/apache/log4j/jmx/LoggerDynamicMBean; */
(( java.lang.Class ) v0 ).getConstructors ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getConstructors()[Ljava/lang/reflect/Constructor;
/* .line 2 */
v1 = this.d;
/* new-instance v2, Ljavax/management/MBeanConstructorInfo; */
int v3 = 0; // const/4 v3, 0x0
/* aget-object v0, v0, v3 */
final String v4 = "HierarchyDynamicMBean(): Constructs a HierarchyDynamicMBean instance"; // const-string v4, "HierarchyDynamicMBean(): Constructs a HierarchyDynamicMBean instance"
/* invoke-direct {v2, v4, v0}, Ljavax/management/MBeanConstructorInfo;-><init>(Ljava/lang/String;Ljava/lang/reflect/Constructor;)V */
/* aput-object v2, v1, v3 */
/* .line 3 */
v0 = this.f;
/* new-instance v1, Ljavax/management/MBeanAttributeInfo; */
final String v5 = "name"; // const-string v5, "name"
final String v6 = "java.lang.String"; // const-string v6, "java.lang.String"
final String v7 = "The name of this Logger."; // const-string v7, "The name of this Logger."
int v8 = 1; // const/4 v8, 0x1
int v9 = 0; // const/4 v9, 0x0
int v10 = 0; // const/4 v10, 0x0
/* move-object v4, v1 */
/* invoke-direct/range {v4 ..v10}, Ljavax/management/MBeanAttributeInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)V */
(( java.util.Vector ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z
/* .line 4 */
v0 = this.f;
/* new-instance v1, Ljavax/management/MBeanAttributeInfo; */
final String v5 = "priority"; // const-string v5, "priority"
final String v6 = "java.lang.String"; // const-string v6, "java.lang.String"
final String v7 = "The priority of this logger."; // const-string v7, "The priority of this logger."
int v9 = 1; // const/4 v9, 0x1
/* move-object v4, v1 */
/* invoke-direct/range {v4 ..v10}, Ljavax/management/MBeanAttributeInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)V */
(( java.util.Vector ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z
int v0 = 2; // const/4 v0, 0x2
/* new-array v7, v0, [Ljavax/management/MBeanParameterInfo; */
/* .line 5 */
/* new-instance v0, Ljavax/management/MBeanParameterInfo; */
final String v1 = "java.lang.String"; // const-string v1, "java.lang.String"
final String v2 = "class name"; // const-string v2, "class name"
final String v4 = "add an appender to this logger"; // const-string v4, "add an appender to this logger"
/* invoke-direct {v0, v2, v1, v4}, Ljavax/management/MBeanParameterInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V */
/* aput-object v0, v7, v3 */
/* .line 6 */
/* new-instance v0, Ljavax/management/MBeanParameterInfo; */
final String v2 = "appender name"; // const-string v2, "appender name"
final String v4 = "name of the appender"; // const-string v4, "name of the appender"
/* invoke-direct {v0, v2, v1, v4}, Ljavax/management/MBeanParameterInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V */
int v1 = 1; // const/4 v1, 0x1
/* aput-object v0, v7, v1 */
/* .line 7 */
v0 = this.e;
/* new-instance v1, Ljavax/management/MBeanOperationInfo; */
final String v5 = "addAppender"; // const-string v5, "addAppender"
final String v6 = "addAppender(): add an appender"; // const-string v6, "addAppender(): add an appender"
final String v8 = "void"; // const-string v8, "void"
/* move-object v4, v1 */
/* invoke-direct/range {v4 ..v9}, Ljavax/management/MBeanOperationInfo;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljavax/management/MBeanParameterInfo;Ljava/lang/String;I)V */
/* aput-object v1, v0, v3 */
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
final String v0 = "Could not create ObjectName"; // const-string v0, "Could not create ObjectName"
if ( p1 != null) { // if-eqz p1, :cond_4
final String v1 = "name"; // const-string v1, "name"
/* .line 1 */
v1 = (( java.lang.String ) p1 ).equals ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 2 */
p1 = this.i;
(( org.apache.log4j.Category ) p1 ).getName ( ); // invoke-virtual {p1}, Lorg/apache/log4j/Category;->getName()Ljava/lang/String;
} // :cond_0
final String v1 = "priority"; // const-string v1, "priority"
/* .line 3 */
v1 = (( java.lang.String ) p1 ).equals ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 4 */
p1 = this.i;
(( org.apache.log4j.Category ) p1 ).getLevel ( ); // invoke-virtual {p1}, Lorg/apache/log4j/Category;->getLevel()Lorg/apache/log4j/Level;
/* if-nez p1, :cond_1 */
int p1 = 0; // const/4 p1, 0x0
/* .line 5 */
} // :cond_1
(( org.apache.log4j.Priority ) p1 ).toString ( ); // invoke-virtual {p1}, Lorg/apache/log4j/Priority;->toString()Ljava/lang/String;
} // :cond_2
final String v1 = "appender="; // const-string v1, "appender="
/* .line 6 */
v1 = (( java.lang.String ) p1 ).startsWith ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
if ( v1 != null) { // if-eqz v1, :cond_3
/* .line 7 */
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
/* .line 8 */
/* :catch_0 */
v1 = org.apache.log4j.jmx.LoggerDynamicMBean.j;
/* new-instance v2, Ljava/lang/StringBuffer; */
/* invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V */
(( java.lang.StringBuffer ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
(( org.apache.log4j.Category ) v1 ).error ( v0 ); // invoke-virtual {v1, v0}, Lorg/apache/log4j/Category;->error(Ljava/lang/Object;)V
/* .line 9 */
/* :catch_1 */
v1 = org.apache.log4j.jmx.LoggerDynamicMBean.j;
/* new-instance v2, Ljava/lang/StringBuffer; */
/* invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V */
(( java.lang.StringBuffer ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
(( org.apache.log4j.Category ) v1 ).error ( v0 ); // invoke-virtual {v1, v0}, Lorg/apache/log4j/Category;->error(Ljava/lang/Object;)V
/* .line 10 */
} // :cond_3
} // :goto_0
/* new-instance v0, Ljavax/management/AttributeNotFoundException; */
/* new-instance v1, Ljava/lang/StringBuffer; */
/* invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V */
final String v2 = "Cannot find "; // const-string v2, "Cannot find "
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String p1 = " attribute in "; // const-string p1, " attribute in "
(( java.lang.StringBuffer ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
p1 = this.g;
(( java.lang.StringBuffer ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
/* invoke-direct {v0, p1}, Ljavax/management/AttributeNotFoundException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* .line 11 */
} // :cond_4
/* new-instance p1, Ljavax/management/RuntimeOperationsException; */
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
final String v1 = "Attribute name cannot be null"; // const-string v1, "Attribute name cannot be null"
/* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* new-instance v1, Ljava/lang/StringBuffer; */
/* invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V */
final String v2 = "Cannot invoke a getter of "; // const-string v2, "Cannot invoke a getter of "
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
v2 = this.g;
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
v0 = this.f;
v0 = (( java.util.Vector ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/Vector;->size()I
/* new-array v4, v0, [Ljavax/management/MBeanAttributeInfo; */
/* .line 2 */
v0 = this.f;
(( java.util.Vector ) v0 ).toArray ( v4 ); // invoke-virtual {v0, v4}, Ljava/util/Vector;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;
/* .line 3 */
/* new-instance v0, Ljavax/management/MBeanInfo; */
v2 = this.g;
v3 = this.h;
v5 = this.d;
v6 = this.e;
int v1 = 0; // const/4 v1, 0x0
/* new-array v7, v1, [Ljavax/management/MBeanNotificationInfo; */
/* move-object v1, v0 */
/* invoke-direct/range {v1 ..v7}, Ljavax/management/MBeanInfo;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljavax/management/MBeanAttributeInfo;[Ljavax/management/MBeanConstructorInfo;[Ljavax/management/MBeanOperationInfo;[Ljavax/management/MBeanNotificationInfo;)V */
} // .end method
public void handleNotification ( javax.management.Notification p0, java.lang.Object p1 ) {
/* .locals 2 */
/* .line 1 */
p2 = org.apache.log4j.jmx.LoggerDynamicMBean.j;
/* new-instance v0, Ljava/lang/StringBuffer; */
/* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
final String v1 = "Received notification: "; // const-string v1, "Received notification: "
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( javax.management.Notification ) p1 ).getType ( ); // invoke-virtual {p1}, Ljavax/management/Notification;->getType()Ljava/lang/String;
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
(( org.apache.log4j.Category ) p2 ).debug ( v0 ); // invoke-virtual {p2, v0}, Lorg/apache/log4j/Category;->debug(Ljava/lang/Object;)V
/* .line 2 */
(( javax.management.Notification ) p1 ).getUserData ( ); // invoke-virtual {p1}, Ljavax/management/Notification;->getUserData()Ljava/lang/Object;
/* check-cast p1, Lorg/apache/log4j/Appender; */
(( org.apache.log4j.jmx.LoggerDynamicMBean ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/log4j/jmx/LoggerDynamicMBean;->b(Lorg/apache/log4j/Appender;)V
return;
} // .end method
public java.lang.Object invoke ( java.lang.String p0, java.lang.Object[] p1, java.lang.String[] p2 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljavax/management/MBeanException;, */
/* Ljavax/management/ReflectionException; */
/* } */
} // .end annotation
final String p3 = "addAppender"; // const-string p3, "addAppender"
/* .line 1 */
p1 = (( java.lang.String ) p1 ).equals ( p3 ); // invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( p1 != null) { // if-eqz p1, :cond_0
int p1 = 0; // const/4 p1, 0x0
/* .line 2 */
/* aget-object p1, p2, p1 */
/* check-cast p1, Ljava/lang/String; */
int p3 = 1; // const/4 p3, 0x1
/* aget-object p2, p2, p3 */
/* check-cast p2, Ljava/lang/String; */
(( org.apache.log4j.jmx.LoggerDynamicMBean ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lorg/apache/log4j/jmx/LoggerDynamicMBean;->a(Ljava/lang/String;Ljava/lang/String;)V
final String p1 = "Hello world."; // const-string p1, "Hello world."
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // .end method
public void postRegister ( java.lang.Boolean p0 ) {
/* .locals 0 */
/* .line 1 */
(( org.apache.log4j.jmx.LoggerDynamicMBean ) p0 ).b ( ); // invoke-virtual {p0}, Lorg/apache/log4j/jmx/LoggerDynamicMBean;->b()V
return;
} // .end method
public void setAttribute ( javax.management.Attribute p0 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljavax/management/AttributeNotFoundException;, */
/* Ljavax/management/InvalidAttributeValueException;, */
/* Ljavax/management/MBeanException;, */
/* Ljavax/management/ReflectionException; */
/* } */
} // .end annotation
if ( p1 != null) { // if-eqz p1, :cond_4
/* .line 1 */
(( javax.management.Attribute ) p1 ).getName ( ); // invoke-virtual {p1}, Ljavax/management/Attribute;->getName()Ljava/lang/String;
/* .line 2 */
(( javax.management.Attribute ) p1 ).getValue ( ); // invoke-virtual {p1}, Ljavax/management/Attribute;->getValue()Ljava/lang/Object;
if ( v0 != null) { // if-eqz v0, :cond_3
final String v1 = "priority"; // const-string v1, "priority"
/* .line 3 */
v1 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 4 */
/* instance-of v0, p1, Ljava/lang/String; */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 5 */
/* check-cast p1, Ljava/lang/String; */
/* .line 6 */
v0 = this.i;
(( org.apache.log4j.Category ) v0 ).getLevel ( ); // invoke-virtual {v0}, Lorg/apache/log4j/Category;->getLevel()Lorg/apache/log4j/Level;
final String v1 = "NULL"; // const-string v1, "NULL"
/* .line 7 */
v1 = (( java.lang.String ) p1 ).equalsIgnoreCase ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
int p1 = 0; // const/4 p1, 0x0
/* .line 8 */
} // :cond_0
org.apache.log4j.helpers.OptionConverter .toLevel ( p1,v0 );
/* .line 9 */
} // :goto_0
v0 = this.i;
(( org.apache.log4j.Category ) v0 ).setLevel ( p1 ); // invoke-virtual {v0, p1}, Lorg/apache/log4j/Category;->setLevel(Lorg/apache/log4j/Level;)V
} // :cond_1
return;
/* .line 10 */
} // :cond_2
/* new-instance p1, Ljavax/management/AttributeNotFoundException; */
/* new-instance v1, Ljava/lang/StringBuffer; */
/* invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V */
final String v2 = "Attribute "; // const-string v2, "Attribute "
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v0 = " not found in "; // const-string v0, " not found in "
(( java.lang.StringBuffer ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* const-class v0, Lorg/apache/log4j/jmx/LoggerDynamicMBean; */
(( java.lang.Class ) v0 ).getName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;
(( java.lang.StringBuffer ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
/* invoke-direct {p1, v0}, Ljavax/management/AttributeNotFoundException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
/* .line 11 */
} // :cond_3
/* new-instance p1, Ljavax/management/RuntimeOperationsException; */
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
final String v1 = "Attribute name cannot be null"; // const-string v1, "Attribute name cannot be null"
/* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* new-instance v1, Ljava/lang/StringBuffer; */
/* invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V */
final String v2 = "Cannot invoke the setter of "; // const-string v2, "Cannot invoke the setter of "
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
v2 = this.g;
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v2 = " with null attribute name"; // const-string v2, " with null attribute name"
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
/* invoke-direct {p1, v0, v1}, Ljavax/management/RuntimeOperationsException;-><init>(Ljava/lang/RuntimeException;Ljava/lang/String;)V */
/* throw p1 */
/* .line 12 */
} // :cond_4
/* new-instance p1, Ljavax/management/RuntimeOperationsException; */
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
final String v1 = "Attribute cannot be null"; // const-string v1, "Attribute cannot be null"
/* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* new-instance v1, Ljava/lang/StringBuffer; */
/* invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V */
final String v2 = "Cannot invoke a setter of "; // const-string v2, "Cannot invoke a setter of "
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
v2 = this.g;
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v2 = " with null attribute"; // const-string v2, " with null attribute"
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
/* invoke-direct {p1, v0, v1}, Ljavax/management/RuntimeOperationsException;-><init>(Ljava/lang/RuntimeException;Ljava/lang/String;)V */
/* throw p1 */
} // .end method
