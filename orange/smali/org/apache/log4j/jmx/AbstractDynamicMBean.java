public abstract class org.apache.log4j.jmx.AbstractDynamicMBean implements javax.management.DynamicMBean implements javax.management.MBeanRegistration {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public java.lang.String a;
	 public javax.management.MBeanServer b;
	 public final java.util.Vector c;
	 /* # direct methods */
	 public org.apache.log4j.jmx.AbstractDynamicMBean ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 /* new-instance v0, Ljava/util/Vector; */
		 /* invoke-direct {v0}, Ljava/util/Vector;-><init>()V */
		 this.c = v0;
		 return;
	 } // .end method
	 public static java.lang.String a ( org.apache.log4j.Appender p0 ) {
		 /* .locals 2 */
		 /* .line 1 */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 2 */
			 (( java.lang.String ) v0 ).trim ( ); // invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
			 v1 = 			 (( java.lang.String ) v1 ).length ( ); // invoke-virtual {v1}, Ljava/lang/String;->length()I
			 /* if-nez v1, :cond_1 */
			 /* .line 3 */
		 } // :cond_0
		 (( java.lang.Object ) p0 ).toString ( ); // invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;
	 } // :cond_1
} // .end method
/* # virtual methods */
public abstract org.apache.log4j.Logger a ( ) {
} // .end method
public void a ( java.lang.Object p0, javax.management.ObjectName p1 ) {
	 /* .locals 1 */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Ljavax/management/InstanceAlreadyExistsException;, */
	 /* Ljavax/management/MBeanRegistrationException;, */
	 /* Ljavax/management/NotCompliantMBeanException; */
	 /* } */
} // .end annotation
/* .line 4 */
v0 = this.b;
/* .line 5 */
p1 = this.c;
(( java.util.Vector ) p1 ).add ( p2 ); // invoke-virtual {p1, p2}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z
return;
} // .end method
public javax.management.AttributeList getAttributes ( java.lang.String[] p0 ) {
/* .locals 5 */
if ( p1 != null) { // if-eqz p1, :cond_2
	 /* .line 1 */
	 /* new-instance v0, Ljavax/management/AttributeList; */
	 /* invoke-direct {v0}, Ljavax/management/AttributeList;-><init>()V */
	 /* .line 2 */
	 /* array-length v1, p1 */
	 /* if-nez v1, :cond_0 */
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
/* .line 3 */
} // :goto_0
/* array-length v2, p1 */
/* if-ge v1, v2, :cond_1 */
/* .line 4 */
try { // :try_start_0
/* aget-object v2, p1, v1 */
(( org.apache.log4j.jmx.AbstractDynamicMBean ) p0 ).getAttribute ( v2 ); // invoke-virtual {p0, v2}, Lorg/apache/log4j/jmx/AbstractDynamicMBean;->getAttribute(Ljava/lang/String;)Ljava/lang/Object;
/* .line 5 */
/* new-instance v3, Ljavax/management/Attribute; */
/* aget-object v4, p1, v1 */
/* invoke-direct {v3, v4, v2}, Ljavax/management/Attribute;-><init>(Ljava/lang/String;Ljava/lang/Object;)V */
(( javax.management.AttributeList ) v0 ).add ( v3 ); // invoke-virtual {v0, v3}, Ljavax/management/AttributeList;->add(Ljavax/management/Attribute;)V
/* :try_end_0 */
/* .catch Ljavax/management/JMException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Ljava/lang/RuntimeException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v2 */
/* .line 6 */
(( java.lang.RuntimeException ) v2 ).printStackTrace ( ); // invoke-virtual {v2}, Ljava/lang/RuntimeException;->printStackTrace()V
/* :catch_1 */
/* move-exception v2 */
/* .line 7 */
(( javax.management.JMException ) v2 ).printStackTrace ( ); // invoke-virtual {v2}, Ljavax/management/JMException;->printStackTrace()V
} // :goto_1
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_1
/* .line 8 */
} // :cond_2
/* new-instance p1, Ljavax/management/RuntimeOperationsException; */
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
final String v1 = "attributeNames[] cannot be null"; // const-string v1, "attributeNames[] cannot be null"
/* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* new-instance v1, Ljava/lang/StringBuffer; */
/* invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V */
final String v2 = "Cannot invoke a getter of "; // const-string v2, "Cannot invoke a getter of "
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
v2 = this.a;
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
/* invoke-direct {p1, v0, v1}, Ljavax/management/RuntimeOperationsException;-><init>(Ljava/lang/RuntimeException;Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public void postDeregister ( ) {
/* .locals 2 */
/* .line 1 */
(( org.apache.log4j.jmx.AbstractDynamicMBean ) p0 ).a ( ); // invoke-virtual {p0}, Lorg/apache/log4j/jmx/AbstractDynamicMBean;->a()Lorg/apache/log4j/Logger;
final String v1 = "postDeregister is called."; // const-string v1, "postDeregister is called."
(( org.apache.log4j.Category ) v0 ).debug ( v1 ); // invoke-virtual {v0, v1}, Lorg/apache/log4j/Category;->debug(Ljava/lang/Object;)V
return;
} // .end method
public void postRegister ( java.lang.Boolean p0 ) {
/* .locals 0 */
return;
} // .end method
public void preDeregister ( ) {
/* .locals 5 */
/* .line 1 */
(( org.apache.log4j.jmx.AbstractDynamicMBean ) p0 ).a ( ); // invoke-virtual {p0}, Lorg/apache/log4j/jmx/AbstractDynamicMBean;->a()Lorg/apache/log4j/Logger;
final String v1 = "preDeregister called."; // const-string v1, "preDeregister called."
(( org.apache.log4j.Category ) v0 ).debug ( v1 ); // invoke-virtual {v0, v1}, Lorg/apache/log4j/Category;->debug(Ljava/lang/Object;)V
/* .line 2 */
v0 = this.c;
(( java.util.Vector ) v0 ).elements ( ); // invoke-virtual {v0}, Ljava/util/Vector;->elements()Ljava/util/Enumeration;
/* .line 3 */
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 4 */
/* check-cast v1, Ljavax/management/ObjectName; */
/* .line 5 */
try { // :try_start_0
v2 = this.b;
/* :try_end_0 */
/* .catch Ljavax/management/InstanceNotFoundException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Ljavax/management/MBeanRegistrationException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 6 */
/* :catch_0 */
(( org.apache.log4j.jmx.AbstractDynamicMBean ) p0 ).a ( ); // invoke-virtual {p0}, Lorg/apache/log4j/jmx/AbstractDynamicMBean;->a()Lorg/apache/log4j/Logger;
/* new-instance v3, Ljava/lang/StringBuffer; */
/* invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V */
final String v4 = "Failed unregistering "; // const-string v4, "Failed unregistering "
(( java.lang.StringBuffer ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( javax.management.ObjectName ) v1 ).getCanonicalName ( ); // invoke-virtual {v1}, Ljavax/management/ObjectName;->getCanonicalName()Ljava/lang/String;
(( java.lang.StringBuffer ) v3 ).append ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
(( org.apache.log4j.Category ) v2 ).warn ( v1 ); // invoke-virtual {v2, v1}, Lorg/apache/log4j/Category;->warn(Ljava/lang/Object;)V
/* .line 7 */
/* :catch_1 */
(( org.apache.log4j.jmx.AbstractDynamicMBean ) p0 ).a ( ); // invoke-virtual {p0}, Lorg/apache/log4j/jmx/AbstractDynamicMBean;->a()Lorg/apache/log4j/Logger;
/* new-instance v3, Ljava/lang/StringBuffer; */
/* invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V */
final String v4 = "Missing MBean "; // const-string v4, "Missing MBean "
(( java.lang.StringBuffer ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( javax.management.ObjectName ) v1 ).getCanonicalName ( ); // invoke-virtual {v1}, Ljavax/management/ObjectName;->getCanonicalName()Ljava/lang/String;
(( java.lang.StringBuffer ) v3 ).append ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
(( org.apache.log4j.Category ) v2 ).warn ( v1 ); // invoke-virtual {v2, v1}, Lorg/apache/log4j/Category;->warn(Ljava/lang/Object;)V
} // :cond_0
return;
} // .end method
public javax.management.ObjectName preRegister ( javax.management.MBeanServer p0, javax.management.ObjectName p1 ) {
/* .locals 3 */
/* .line 1 */
(( org.apache.log4j.jmx.AbstractDynamicMBean ) p0 ).a ( ); // invoke-virtual {p0}, Lorg/apache/log4j/jmx/AbstractDynamicMBean;->a()Lorg/apache/log4j/Logger;
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
} // .end method
public javax.management.AttributeList setAttributes ( javax.management.AttributeList p0 ) {
/* .locals 4 */
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 1 */
/* new-instance v0, Ljavax/management/AttributeList; */
/* invoke-direct {v0}, Ljavax/management/AttributeList;-><init>()V */
/* .line 2 */
v1 = (( javax.management.AttributeList ) p1 ).isEmpty ( ); // invoke-virtual {p1}, Ljavax/management/AttributeList;->isEmpty()Z
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 3 */
} // :cond_0
(( javax.management.AttributeList ) p1 ).iterator ( ); // invoke-virtual {p1}, Ljavax/management/AttributeList;->iterator()Ljava/util/Iterator;
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 4 */
/* check-cast v1, Ljavax/management/Attribute; */
/* .line 5 */
try { // :try_start_0
(( org.apache.log4j.jmx.AbstractDynamicMBean ) p0 ).setAttribute ( v1 ); // invoke-virtual {p0, v1}, Lorg/apache/log4j/jmx/AbstractDynamicMBean;->setAttribute(Ljavax/management/Attribute;)V
/* .line 6 */
(( javax.management.Attribute ) v1 ).getName ( ); // invoke-virtual {v1}, Ljavax/management/Attribute;->getName()Ljava/lang/String;
/* .line 7 */
(( org.apache.log4j.jmx.AbstractDynamicMBean ) p0 ).getAttribute ( v1 ); // invoke-virtual {p0, v1}, Lorg/apache/log4j/jmx/AbstractDynamicMBean;->getAttribute(Ljava/lang/String;)Ljava/lang/Object;
/* .line 8 */
/* new-instance v3, Ljavax/management/Attribute; */
/* invoke-direct {v3, v1, v2}, Ljavax/management/Attribute;-><init>(Ljava/lang/String;Ljava/lang/Object;)V */
(( javax.management.AttributeList ) v0 ).add ( v3 ); // invoke-virtual {v0, v3}, Ljavax/management/AttributeList;->add(Ljavax/management/Attribute;)V
/* :try_end_0 */
/* .catch Ljavax/management/JMException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Ljava/lang/RuntimeException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v1 */
/* .line 9 */
(( java.lang.RuntimeException ) v1 ).printStackTrace ( ); // invoke-virtual {v1}, Ljava/lang/RuntimeException;->printStackTrace()V
/* :catch_1 */
/* move-exception v1 */
/* .line 10 */
(( javax.management.JMException ) v1 ).printStackTrace ( ); // invoke-virtual {v1}, Ljavax/management/JMException;->printStackTrace()V
} // :cond_1
/* .line 11 */
} // :cond_2
/* new-instance p1, Ljavax/management/RuntimeOperationsException; */
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
final String v1 = "AttributeList attributes cannot be null"; // const-string v1, "AttributeList attributes cannot be null"
/* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* new-instance v1, Ljava/lang/StringBuffer; */
/* invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V */
final String v2 = "Cannot invoke a setter of "; // const-string v2, "Cannot invoke a setter of "
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
v2 = this.a;
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
/* invoke-direct {p1, v0, v1}, Ljavax/management/RuntimeOperationsException;-><init>(Ljava/lang/RuntimeException;Ljava/lang/String;)V */
/* throw p1 */
} // .end method
