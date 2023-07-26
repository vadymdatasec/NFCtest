public class org.apache.log4j.jmx.HierarchyDynamicMBean extends org.apache.log4j.jmx.AbstractDynamicMBean implements org.apache.log4j.spi.HierarchyEventListener implements javax.management.NotificationBroadcaster {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # static fields */
	 public static org.apache.log4j.Logger k;
	 public static java.lang.Class l; //synthetic
	 /* # instance fields */
	 public javax.management.MBeanConstructorInfo d;
	 public javax.management.MBeanOperationInfo e;
	 public java.util.Vector f;
	 public java.lang.String g;
	 public java.lang.String h;
	 public javax.management.NotificationBroadcasterSupport i;
	 public org.apache.log4j.spi.LoggerRepository j;
	 /* # direct methods */
	 public static org.apache.log4j.jmx.HierarchyDynamicMBean ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = org.apache.log4j.jmx.HierarchyDynamicMBean.l;
		 /* if-nez v0, :cond_0 */
		 final String v0 = "org.apache.log4j.jmx.HierarchyDynamicMBean"; // const-string v0, "org.apache.log4j.jmx.HierarchyDynamicMBean"
		 org.apache.log4j.jmx.HierarchyDynamicMBean .a ( v0 );
	 } // :cond_0
	 org.apache.log4j.Logger .getLogger ( v0 );
	 return;
} // .end method
public org.apache.log4j.jmx.HierarchyDynamicMBean ( ) {
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
	 /* const-class v0, Lorg/apache/log4j/jmx/HierarchyDynamicMBean; */
	 (( java.lang.Class ) v0 ).getName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;
	 this.g = v0;
	 final String v0 = "This MBean acts as a management facade for org.apache.log4j.Hierarchy."; // const-string v0, "This MBean acts as a management facade for org.apache.log4j.Hierarchy."
	 /* .line 6 */
	 this.h = v0;
	 /* .line 7 */
	 /* new-instance v0, Ljavax/management/NotificationBroadcasterSupport; */
	 /* invoke-direct {v0}, Ljavax/management/NotificationBroadcasterSupport;-><init>()V */
	 this.i = v0;
	 /* .line 8 */
	 org.apache.log4j.LogManager .getLoggerRepository ( );
	 this.j = v0;
	 /* .line 9 */
	 (( org.apache.log4j.jmx.HierarchyDynamicMBean ) p0 ).b ( ); // invoke-virtual {p0}, Lorg/apache/log4j/jmx/HierarchyDynamicMBean;->b()V
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
	 public javax.management.ObjectName a ( org.apache.log4j.Logger p0 ) {
		 /* .locals 13 */
		 final String v0 = "]."; // const-string v0, "]."
		 final String v1 = "Could not add loggerMBean for ["; // const-string v1, "Could not add loggerMBean for ["
		 /* .line 2 */
		 (( org.apache.log4j.Category ) p1 ).getName ( ); // invoke-virtual {p1}, Lorg/apache/log4j/Category;->getName()Ljava/lang/String;
		 int v3 = 0; // const/4 v3, 0x0
		 /* .line 3 */
		 try { // :try_start_0
			 /* new-instance v4, Lorg/apache/log4j/jmx/LoggerDynamicMBean; */
			 /* invoke-direct {v4, p1}, Lorg/apache/log4j/jmx/LoggerDynamicMBean;-><init>(Lorg/apache/log4j/Logger;)V */
			 /* .line 4 */
			 /* new-instance v5, Ljavax/management/ObjectName; */
			 final String v6 = "log4j"; // const-string v6, "log4j"
			 final String v7 = "logger"; // const-string v7, "logger"
			 /* invoke-direct {v5, v6, v7, v2}, Ljavax/management/ObjectName;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V */
			 /* :try_end_0 */
			 /* .catch Ljavax/management/JMException; {:try_start_0 ..:try_end_0} :catch_3 */
			 /* .catch Ljava/lang/RuntimeException; {:try_start_0 ..:try_end_0} :catch_2 */
			 /* .line 5 */
			 try { // :try_start_1
				 v6 = 				 v6 = this.b;
				 /* if-nez v6, :cond_0 */
				 /* .line 6 */
				 (( org.apache.log4j.jmx.AbstractDynamicMBean ) p0 ).a ( v4, v5 ); // invoke-virtual {p0, v4, v5}, Lorg/apache/log4j/jmx/AbstractDynamicMBean;->a(Ljava/lang/Object;Ljavax/management/ObjectName;)V
				 /* .line 7 */
				 /* new-instance v6, Ljavax/management/NotificationFilterSupport; */
				 /* invoke-direct {v6}, Ljavax/management/NotificationFilterSupport;-><init>()V */
				 /* .line 8 */
				 /* new-instance v7, Ljava/lang/StringBuffer; */
				 /* invoke-direct {v7}, Ljava/lang/StringBuffer;-><init>()V */
				 final String v8 = "addAppender."; // const-string v8, "addAppender."
				 (( java.lang.StringBuffer ) v7 ).append ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
				 (( org.apache.log4j.Category ) p1 ).getName ( ); // invoke-virtual {p1}, Lorg/apache/log4j/Category;->getName()Ljava/lang/String;
				 (( java.lang.StringBuffer ) v7 ).append ( p1 ); // invoke-virtual {v7, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
				 (( java.lang.StringBuffer ) v7 ).toString ( ); // invoke-virtual {v7}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
				 (( javax.management.NotificationFilterSupport ) v6 ).enableType ( p1 ); // invoke-virtual {v6, p1}, Ljavax/management/NotificationFilterSupport;->enableType(Ljava/lang/String;)V
				 /* .line 9 */
				 p1 = org.apache.log4j.jmx.HierarchyDynamicMBean.k;
				 /* new-instance v7, Ljava/lang/StringBuffer; */
				 /* invoke-direct {v7}, Ljava/lang/StringBuffer;-><init>()V */
				 final String v8 = "---Adding logger ["; // const-string v8, "---Adding logger ["
				 (( java.lang.StringBuffer ) v7 ).append ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
				 (( java.lang.StringBuffer ) v7 ).append ( v2 ); // invoke-virtual {v7, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
				 final String v8 = "] as listener."; // const-string v8, "] as listener."
				 (( java.lang.StringBuffer ) v7 ).append ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
				 (( java.lang.StringBuffer ) v7 ).toString ( ); // invoke-virtual {v7}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
				 (( org.apache.log4j.Category ) p1 ).debug ( v7 ); // invoke-virtual {p1, v7}, Lorg/apache/log4j/Category;->debug(Ljava/lang/Object;)V
				 /* .line 10 */
				 p1 = this.i;
				 (( javax.management.NotificationBroadcasterSupport ) p1 ).addNotificationListener ( v4, v6, v3 ); // invoke-virtual {p1, v4, v6, v3}, Ljavax/management/NotificationBroadcasterSupport;->addNotificationListener(Ljavax/management/NotificationListener;Ljavax/management/NotificationFilter;Ljava/lang/Object;)V
				 /* .line 11 */
				 p1 = this.f;
				 /* new-instance v3, Ljavax/management/MBeanAttributeInfo; */
				 /* new-instance v4, Ljava/lang/StringBuffer; */
				 /* invoke-direct {v4}, Ljava/lang/StringBuffer;-><init>()V */
				 final String v6 = "logger="; // const-string v6, "logger="
				 (( java.lang.StringBuffer ) v4 ).append ( v6 ); // invoke-virtual {v4, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
				 (( java.lang.StringBuffer ) v4 ).append ( v2 ); // invoke-virtual {v4, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
				 (( java.lang.StringBuffer ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
				 final String v8 = "javax.management.ObjectName"; // const-string v8, "javax.management.ObjectName"
				 /* new-instance v4, Ljava/lang/StringBuffer; */
				 /* invoke-direct {v4}, Ljava/lang/StringBuffer;-><init>()V */
				 final String v6 = "The "; // const-string v6, "The "
				 (( java.lang.StringBuffer ) v4 ).append ( v6 ); // invoke-virtual {v4, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
				 (( java.lang.StringBuffer ) v4 ).append ( v2 ); // invoke-virtual {v4, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
				 final String v6 = " logger."; // const-string v6, " logger."
				 (( java.lang.StringBuffer ) v4 ).append ( v6 ); // invoke-virtual {v4, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
				 (( java.lang.StringBuffer ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
				 int v10 = 1; // const/4 v10, 0x1
				 int v11 = 1; // const/4 v11, 0x1
				 int v12 = 0; // const/4 v12, 0x0
				 /* move-object v6, v3 */
				 /* invoke-direct/range {v6 ..v12}, Ljavax/management/MBeanAttributeInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)V */
				 (( java.util.Vector ) p1 ).add ( v3 ); // invoke-virtual {p1, v3}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z
				 /* :try_end_1 */
				 /* .catch Ljavax/management/JMException; {:try_start_1 ..:try_end_1} :catch_1 */
				 /* .catch Ljava/lang/RuntimeException; {:try_start_1 ..:try_end_1} :catch_0 */
				 /* :catch_0 */
				 /* move-exception p1 */
				 /* move-object v3, v5 */
				 /* :catch_1 */
				 /* move-exception p1 */
				 /* move-object v3, v5 */
				 /* :catch_2 */
				 /* move-exception p1 */
				 /* .line 12 */
			 } // :goto_0
			 v4 = org.apache.log4j.jmx.HierarchyDynamicMBean.k;
			 /* new-instance v5, Ljava/lang/StringBuffer; */
			 /* invoke-direct {v5}, Ljava/lang/StringBuffer;-><init>()V */
			 (( java.lang.StringBuffer ) v5 ).append ( v1 ); // invoke-virtual {v5, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
			 (( java.lang.StringBuffer ) v5 ).append ( v2 ); // invoke-virtual {v5, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
			 (( java.lang.StringBuffer ) v5 ).append ( v0 ); // invoke-virtual {v5, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
			 (( java.lang.StringBuffer ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
			 (( org.apache.log4j.Category ) v4 ).error ( v0, p1 ); // invoke-virtual {v4, v0, p1}, Lorg/apache/log4j/Category;->error(Ljava/lang/Object;Ljava/lang/Throwable;)V
			 /* :catch_3 */
			 /* move-exception p1 */
			 /* .line 13 */
		 } // :goto_1
		 v4 = org.apache.log4j.jmx.HierarchyDynamicMBean.k;
		 /* new-instance v5, Ljava/lang/StringBuffer; */
		 /* invoke-direct {v5}, Ljava/lang/StringBuffer;-><init>()V */
		 (( java.lang.StringBuffer ) v5 ).append ( v1 ); // invoke-virtual {v5, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 (( java.lang.StringBuffer ) v5 ).append ( v2 ); // invoke-virtual {v5, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 (( java.lang.StringBuffer ) v5 ).append ( v0 ); // invoke-virtual {v5, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 (( java.lang.StringBuffer ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
		 (( org.apache.log4j.Category ) v4 ).error ( v0, p1 ); // invoke-virtual {v4, v0, p1}, Lorg/apache/log4j/Category;->error(Ljava/lang/Object;Ljava/lang/Throwable;)V
	 } // :goto_2
	 /* move-object v5, v3 */
} // :cond_0
} // :goto_3
} // .end method
public org.apache.log4j.Logger a ( ) {
/* .locals 1 */
/* .line 14 */
v0 = org.apache.log4j.jmx.HierarchyDynamicMBean.k;
} // .end method
public void addAppenderEvent ( org.apache.log4j.Category p0, org.apache.log4j.Appender p1 ) {
/* .locals 3 */
/* .line 1 */
v0 = org.apache.log4j.jmx.HierarchyDynamicMBean.k;
/* new-instance v1, Ljava/lang/StringBuffer; */
/* invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V */
final String v2 = "addAppenderEvent called: logger="; // const-string v2, "addAppenderEvent called: logger="
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( org.apache.log4j.Category ) p1 ).getName ( ); // invoke-virtual {p1}, Lorg/apache/log4j/Category;->getName()Ljava/lang/String;
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v2 = ", appender="; // const-string v2, ", appender="
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
(( org.apache.log4j.Category ) v0 ).debug ( v1 ); // invoke-virtual {v0, v1}, Lorg/apache/log4j/Category;->debug(Ljava/lang/Object;)V
/* .line 2 */
/* new-instance v0, Ljavax/management/Notification; */
/* new-instance v1, Ljava/lang/StringBuffer; */
/* invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V */
final String v2 = "addAppender."; // const-string v2, "addAppender."
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( org.apache.log4j.Category ) p1 ).getName ( ); // invoke-virtual {p1}, Lorg/apache/log4j/Category;->getName()Ljava/lang/String;
(( java.lang.StringBuffer ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
/* const-wide/16 v1, 0x0 */
/* invoke-direct {v0, p1, p0, v1, v2}, Ljavax/management/Notification;-><init>(Ljava/lang/String;Ljava/lang/Object;J)V */
/* .line 3 */
(( javax.management.Notification ) v0 ).setUserData ( p2 ); // invoke-virtual {v0, p2}, Ljavax/management/Notification;->setUserData(Ljava/lang/Object;)V
/* .line 4 */
p1 = org.apache.log4j.jmx.HierarchyDynamicMBean.k;
final String p2 = "sending notification."; // const-string p2, "sending notification."
(( org.apache.log4j.Category ) p1 ).debug ( p2 ); // invoke-virtual {p1, p2}, Lorg/apache/log4j/Category;->debug(Ljava/lang/Object;)V
/* .line 5 */
p1 = this.i;
(( javax.management.NotificationBroadcasterSupport ) p1 ).sendNotification ( v0 ); // invoke-virtual {p1, v0}, Ljavax/management/NotificationBroadcasterSupport;->sendNotification(Ljavax/management/Notification;)V
return;
} // .end method
public javax.management.ObjectName addLoggerMBean ( java.lang.String p0 ) {
/* .locals 0 */
/* .line 1 */
org.apache.log4j.LogManager .exists ( p1 );
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 2 */
(( org.apache.log4j.jmx.HierarchyDynamicMBean ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/log4j/jmx/HierarchyDynamicMBean;->a(Lorg/apache/log4j/Logger;)Ljavax/management/ObjectName;
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // .end method
public void addNotificationListener ( javax.management.NotificationListener p0, javax.management.NotificationFilter p1, java.lang.Object p2 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.i;
(( javax.management.NotificationBroadcasterSupport ) v0 ).addNotificationListener ( p1, p2, p3 ); // invoke-virtual {v0, p1, p2, p3}, Ljavax/management/NotificationBroadcasterSupport;->addNotificationListener(Ljavax/management/NotificationListener;Ljavax/management/NotificationFilter;Ljava/lang/Object;)V
return;
} // .end method
public final void b ( ) {
/* .locals 11 */
/* .line 1 */
/* const-class v0, Lorg/apache/log4j/jmx/HierarchyDynamicMBean; */
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
final String v5 = "threshold"; // const-string v5, "threshold"
final String v6 = "java.lang.String"; // const-string v6, "java.lang.String"
final String v7 = "The \"threshold\" state of the hiearchy."; // const-string v7, "The \"threshold\" state of the hiearchy."
int v8 = 1; // const/4 v8, 0x1
int v9 = 1; // const/4 v9, 0x1
int v10 = 0; // const/4 v10, 0x0
/* move-object v4, v1 */
/* invoke-direct/range {v4 ..v10}, Ljavax/management/MBeanAttributeInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZ)V */
(( java.util.Vector ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z
int v0 = 1; // const/4 v0, 0x1
/* new-array v7, v0, [Ljavax/management/MBeanParameterInfo; */
/* .line 4 */
/* new-instance v0, Ljavax/management/MBeanParameterInfo; */
final String v1 = "name"; // const-string v1, "name"
final String v2 = "java.lang.String"; // const-string v2, "java.lang.String"
final String v4 = "Create a logger MBean"; // const-string v4, "Create a logger MBean"
/* invoke-direct {v0, v1, v2, v4}, Ljavax/management/MBeanParameterInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V */
/* aput-object v0, v7, v3 */
/* .line 5 */
v0 = this.e;
/* new-instance v1, Ljavax/management/MBeanOperationInfo; */
final String v5 = "addLoggerMBean"; // const-string v5, "addLoggerMBean"
final String v6 = "addLoggerMBean(): add a loggerMBean"; // const-string v6, "addLoggerMBean(): add a loggerMBean"
final String v8 = "javax.management.ObjectName"; // const-string v8, "javax.management.ObjectName"
/* move-object v4, v1 */
/* invoke-direct/range {v4 ..v9}, Ljavax/management/MBeanOperationInfo;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljavax/management/MBeanParameterInfo;Ljava/lang/String;I)V */
/* aput-object v1, v0, v3 */
return;
} // .end method
public java.lang.Object getAttribute ( java.lang.String p0 ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljavax/management/AttributeNotFoundException;, */
/* Ljavax/management/MBeanException;, */
/* Ljavax/management/ReflectionException; */
/* } */
} // .end annotation
final String v0 = "Could not create ObjectName"; // const-string v0, "Could not create ObjectName"
if ( p1 != null) { // if-eqz p1, :cond_3
/* .line 1 */
v1 = org.apache.log4j.jmx.HierarchyDynamicMBean.k;
/* new-instance v2, Ljava/lang/StringBuffer; */
/* invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V */
final String v3 = "Called getAttribute with ["; // const-string v3, "Called getAttribute with ["
(( java.lang.StringBuffer ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v3 = "]."; // const-string v3, "]."
(( java.lang.StringBuffer ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
(( org.apache.log4j.Category ) v1 ).debug ( v2 ); // invoke-virtual {v1, v2}, Lorg/apache/log4j/Category;->debug(Ljava/lang/Object;)V
final String v1 = "threshold"; // const-string v1, "threshold"
/* .line 2 */
v1 = (( java.lang.String ) p1 ).equals ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 3 */
p1 = this.j;
} // :cond_0
final String v1 = "logger"; // const-string v1, "logger"
/* .line 4 */
v1 = (( java.lang.String ) p1 ).startsWith ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
if ( v1 != null) { // if-eqz v1, :cond_2
final String v1 = "%3D"; // const-string v1, "%3D"
/* .line 5 */
v1 = (( java.lang.String ) p1 ).indexOf ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
/* if-lez v1, :cond_1 */
/* .line 6 */
/* new-instance v2, Ljava/lang/StringBuffer; */
/* invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V */
int v3 = 0; // const/4 v3, 0x0
(( java.lang.String ) p1 ).substring ( v3, v1 ); // invoke-virtual {p1, v3, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;
(( java.lang.StringBuffer ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* const/16 v3, 0x3d */
(( java.lang.StringBuffer ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
/* add-int/lit8 v1, v1, 0x3 */
(( java.lang.String ) p1 ).substring ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;
(( java.lang.StringBuffer ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
} // :cond_1
/* move-object v1, p1 */
/* .line 7 */
} // :goto_0
try { // :try_start_0
/* new-instance v2, Ljavax/management/ObjectName; */
/* new-instance v3, Ljava/lang/StringBuffer; */
/* invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V */
final String v4 = "log4j:"; // const-string v4, "log4j:"
(( java.lang.StringBuffer ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v3 ).append ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
/* invoke-direct {v2, v3}, Ljavax/management/ObjectName;-><init>(Ljava/lang/String;)V */
/* :try_end_0 */
/* .catch Ljavax/management/JMException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Ljava/lang/RuntimeException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 8 */
/* :catch_0 */
v2 = org.apache.log4j.jmx.HierarchyDynamicMBean.k;
/* new-instance v3, Ljava/lang/StringBuffer; */
/* invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V */
(( java.lang.StringBuffer ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v3 ).append ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
(( org.apache.log4j.Category ) v2 ).error ( v0 ); // invoke-virtual {v2, v0}, Lorg/apache/log4j/Category;->error(Ljava/lang/Object;)V
/* .line 9 */
/* :catch_1 */
v2 = org.apache.log4j.jmx.HierarchyDynamicMBean.k;
/* new-instance v3, Ljava/lang/StringBuffer; */
/* invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V */
(( java.lang.StringBuffer ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v3 ).append ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
(( org.apache.log4j.Category ) v2 ).error ( v0 ); // invoke-virtual {v2, v0}, Lorg/apache/log4j/Category;->error(Ljava/lang/Object;)V
/* .line 10 */
} // :cond_2
} // :goto_1
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
} // :cond_3
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
public javax.management.MBeanNotificationInfo getNotificationInfo ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.i;
(( javax.management.NotificationBroadcasterSupport ) v0 ).getNotificationInfo ( ); // invoke-virtual {v0}, Ljavax/management/NotificationBroadcasterSupport;->getNotificationInfo()[Ljavax/management/MBeanNotificationInfo;
} // .end method
public java.lang.Object invoke ( java.lang.String p0, java.lang.Object[] p1, java.lang.String[] p2 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljavax/management/MBeanException;, */
/* Ljavax/management/ReflectionException; */
/* } */
} // .end annotation
if ( p1 != null) { // if-eqz p1, :cond_1
final String p3 = "addLoggerMBean"; // const-string p3, "addLoggerMBean"
/* .line 1 */
p3 = (( java.lang.String ) p1 ).equals ( p3 ); // invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( p3 != null) { // if-eqz p3, :cond_0
int p1 = 0; // const/4 p1, 0x0
/* .line 2 */
/* aget-object p1, p2, p1 */
/* check-cast p1, Ljava/lang/String; */
(( org.apache.log4j.jmx.HierarchyDynamicMBean ) p0 ).addLoggerMBean ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/log4j/jmx/HierarchyDynamicMBean;->addLoggerMBean(Ljava/lang/String;)Ljavax/management/ObjectName;
/* .line 3 */
} // :cond_0
/* new-instance p2, Ljavax/management/ReflectionException; */
/* new-instance p3, Ljava/lang/NoSuchMethodException; */
/* invoke-direct {p3, p1}, Ljava/lang/NoSuchMethodException;-><init>(Ljava/lang/String;)V */
/* new-instance v0, Ljava/lang/StringBuffer; */
/* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
final String v1 = "Cannot find the operation "; // const-string v1, "Cannot find the operation "
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String p1 = " in "; // const-string p1, " in "
(( java.lang.StringBuffer ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
p1 = this.g;
(( java.lang.StringBuffer ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
/* invoke-direct {p2, p3, p1}, Ljavax/management/ReflectionException;-><init>(Ljava/lang/Exception;Ljava/lang/String;)V */
/* throw p2 */
/* .line 4 */
} // :cond_1
/* new-instance p1, Ljavax/management/RuntimeOperationsException; */
/* new-instance p2, Ljava/lang/IllegalArgumentException; */
final String p3 = "Operation name cannot be null"; // const-string p3, "Operation name cannot be null"
/* invoke-direct {p2, p3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* new-instance p3, Ljava/lang/StringBuffer; */
/* invoke-direct {p3}, Ljava/lang/StringBuffer;-><init>()V */
final String v0 = "Cannot invoke a null operation in "; // const-string v0, "Cannot invoke a null operation in "
(( java.lang.StringBuffer ) p3 ).append ( v0 ); // invoke-virtual {p3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
v0 = this.g;
(( java.lang.StringBuffer ) p3 ).append ( v0 ); // invoke-virtual {p3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) p3 ).toString ( ); // invoke-virtual {p3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
/* invoke-direct {p1, p2, p3}, Ljavax/management/RuntimeOperationsException;-><init>(Ljava/lang/RuntimeException;Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public void postRegister ( java.lang.Boolean p0 ) {
/* .locals 1 */
/* .line 1 */
p1 = org.apache.log4j.jmx.HierarchyDynamicMBean.k;
final String v0 = "postRegister is called."; // const-string v0, "postRegister is called."
(( org.apache.log4j.Category ) p1 ).debug ( v0 ); // invoke-virtual {p1, v0}, Lorg/apache/log4j/Category;->debug(Ljava/lang/Object;)V
/* .line 2 */
p1 = this.j;
/* .line 3 */
p1 = this.j;
/* .line 4 */
(( org.apache.log4j.jmx.HierarchyDynamicMBean ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/log4j/jmx/HierarchyDynamicMBean;->a(Lorg/apache/log4j/Logger;)Ljavax/management/ObjectName;
return;
} // .end method
public void removeAppenderEvent ( org.apache.log4j.Category p0, org.apache.log4j.Appender p1 ) {
/* .locals 3 */
/* .line 1 */
v0 = org.apache.log4j.jmx.HierarchyDynamicMBean.k;
/* new-instance v1, Ljava/lang/StringBuffer; */
/* invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V */
final String v2 = "removeAppenderCalled: logger="; // const-string v2, "removeAppenderCalled: logger="
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( org.apache.log4j.Category ) p1 ).getName ( ); // invoke-virtual {p1}, Lorg/apache/log4j/Category;->getName()Ljava/lang/String;
(( java.lang.StringBuffer ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String p1 = ", appender="; // const-string p1, ", appender="
(( java.lang.StringBuffer ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
(( org.apache.log4j.Category ) v0 ).debug ( p1 ); // invoke-virtual {v0, p1}, Lorg/apache/log4j/Category;->debug(Ljava/lang/Object;)V
return;
} // .end method
public void removeNotificationListener ( javax.management.NotificationListener p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljavax/management/ListenerNotFoundException; */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.i;
(( javax.management.NotificationBroadcasterSupport ) v0 ).removeNotificationListener ( p1 ); // invoke-virtual {v0, p1}, Ljavax/management/NotificationBroadcasterSupport;->removeNotificationListener(Ljavax/management/NotificationListener;)V
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
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 1 */
(( javax.management.Attribute ) p1 ).getName ( ); // invoke-virtual {p1}, Ljavax/management/Attribute;->getName()Ljava/lang/String;
/* .line 2 */
(( javax.management.Attribute ) p1 ).getValue ( ); // invoke-virtual {p1}, Ljavax/management/Attribute;->getValue()Ljava/lang/Object;
if ( v0 != null) { // if-eqz v0, :cond_1
final String v1 = "threshold"; // const-string v1, "threshold"
/* .line 3 */
v0 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 4 */
/* check-cast p1, Ljava/lang/String; */
v0 = this.j;
org.apache.log4j.helpers.OptionConverter .toLevel ( p1,v0 );
/* .line 5 */
v0 = this.j;
} // :cond_0
return;
/* .line 6 */
} // :cond_1
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
/* .line 7 */
} // :cond_2
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
