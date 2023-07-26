public class org.apache.log4j.net.ZeroConfSupport {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static java.lang.Object b;
	 public static java.lang.Class c;
	 public static java.lang.Class d;
	 public static java.lang.Class e; //synthetic
	 public static java.lang.Class f; //synthetic
	 public static java.lang.Class g; //synthetic
	 /* # instance fields */
	 public java.lang.Object a;
	 /* # direct methods */
	 public static org.apache.log4j.net.ZeroConfSupport ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 org.apache.log4j.net.ZeroConfSupport .c ( );
		 return;
	 } // .end method
	 public org.apache.log4j.net.ZeroConfSupport ( ) {
		 /* .locals 1 */
		 /* .line 7 */
		 /* new-instance v0, Ljava/util/HashMap; */
		 /* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
		 /* invoke-direct {p0, p1, p2, p3, v0}, Lorg/apache/log4j/net/ZeroConfSupport;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/util/Map;)V */
		 return;
	 } // .end method
	 public org.apache.log4j.net.ZeroConfSupport ( ) {
		 /* .locals 3 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 try { // :try_start_0
			 v0 = org.apache.log4j.net.ZeroConfSupport.c;
			 final String v1 = "create"; // const-string v1, "create"
			 int v2 = 0; // const/4 v2, 0x0
			 (( java.lang.Class ) v0 ).getMethod ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
			 /* :try_end_0 */
			 /* .catch Ljava/lang/NoSuchMethodException; {:try_start_0 ..:try_end_0} :catch_0 */
			 int v0 = 1; // const/4 v0, 0x1
			 /* :catch_0 */
			 int v0 = 0; // const/4 v0, 0x0
		 } // :goto_0
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 final String v0 = "using JmDNS version 3 to construct serviceInfo instance"; // const-string v0, "using JmDNS version 3 to construct serviceInfo instance"
			 /* .line 3 */
			 org.apache.log4j.helpers.LogLog .debug ( v0 );
			 /* .line 4 */
			 (( org.apache.log4j.net.ZeroConfSupport ) p0 ).b ( p1, p2, p3, p4 ); // invoke-virtual {p0, p1, p2, p3, p4}, Lorg/apache/log4j/net/ZeroConfSupport;->b(Ljava/lang/String;ILjava/lang/String;Ljava/util/Map;)Ljava/lang/Object;
			 this.a = p1;
		 } // :cond_0
		 final String v0 = "using JmDNS version 1.0 to construct serviceInfo instance"; // const-string v0, "using JmDNS version 1.0 to construct serviceInfo instance"
		 /* .line 5 */
		 org.apache.log4j.helpers.LogLog .debug ( v0 );
		 /* .line 6 */
		 (( org.apache.log4j.net.ZeroConfSupport ) p0 ).a ( p1, p2, p3, p4 ); // invoke-virtual {p0, p1, p2, p3, p4}, Lorg/apache/log4j/net/ZeroConfSupport;->a(Ljava/lang/String;ILjava/lang/String;Ljava/util/Map;)Ljava/lang/Object;
		 this.a = p1;
	 } // :goto_1
	 return;
} // .end method
public static java.lang.Class a ( java.lang.String p0 ) { //synthethic
	 /* .locals 1 */
	 /* .line 21 */
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
	 public static java.lang.Object a ( ) {
		 /* .locals 2 */
		 final String v0 = "Unable to instantiate JMDNS"; // const-string v0, "Unable to instantiate JMDNS"
		 /* .line 1 */
		 try { // :try_start_0
			 v1 = org.apache.log4j.net.ZeroConfSupport.c;
			 (( java.lang.Class ) v1 ).newInstance ( ); // invoke-virtual {v1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;
			 /* :try_end_0 */
			 /* .catch Ljava/lang/InstantiationException; {:try_start_0 ..:try_end_0} :catch_1 */
			 /* .catch Ljava/lang/IllegalAccessException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* :catch_0 */
			 /* move-exception v1 */
			 /* .line 2 */
			 org.apache.log4j.helpers.LogLog .warn ( v0,v1 );
			 /* :catch_1 */
			 /* move-exception v1 */
			 /* .line 3 */
			 org.apache.log4j.helpers.LogLog .warn ( v0,v1 );
		 } // :goto_0
		 int v0 = 0; // const/4 v0, 0x0
	 } // .end method
	 public static java.lang.Object b ( ) {
		 /* .locals 3 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 1 */
		 try { // :try_start_0
			 v1 = org.apache.log4j.net.ZeroConfSupport.c;
			 final String v2 = "create"; // const-string v2, "create"
			 (( java.lang.Class ) v1 ).getMethod ( v2, v0 ); // invoke-virtual {v1, v2, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
			 /* .line 2 */
			 (( java.lang.reflect.Method ) v1 ).invoke ( v0, v0 ); // invoke-virtual {v1, v0, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
			 /* :try_end_0 */
			 /* .catch Ljava/lang/IllegalAccessException; {:try_start_0 ..:try_end_0} :catch_2 */
			 /* .catch Ljava/lang/NoSuchMethodException; {:try_start_0 ..:try_end_0} :catch_1 */
			 /* .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* :catch_0 */
			 /* move-exception v1 */
			 final String v2 = "Unable to call constructor"; // const-string v2, "Unable to call constructor"
			 /* .line 3 */
			 org.apache.log4j.helpers.LogLog .warn ( v2,v1 );
			 /* :catch_1 */
			 /* move-exception v1 */
			 final String v2 = "Unable to access constructor"; // const-string v2, "Unable to access constructor"
			 /* .line 4 */
			 org.apache.log4j.helpers.LogLog .warn ( v2,v1 );
			 /* :catch_2 */
			 /* move-exception v1 */
			 final String v2 = "Unable to instantiate jmdns class"; // const-string v2, "Unable to instantiate jmdns class"
			 /* .line 5 */
			 org.apache.log4j.helpers.LogLog .warn ( v2,v1 );
		 } // :goto_0
	 } // .end method
	 public static java.lang.Object c ( ) {
		 /* .locals 4 */
		 try { // :try_start_0
			 final String v0 = "javax.jmdns.JmDNS"; // const-string v0, "javax.jmdns.JmDNS"
			 /* .line 1 */
			 java.lang.Class .forName ( v0 );
			 final String v0 = "javax.jmdns.ServiceInfo"; // const-string v0, "javax.jmdns.ServiceInfo"
			 /* .line 2 */
			 java.lang.Class .forName ( v0 );
			 /* :try_end_0 */
			 /* .catch Ljava/lang/ClassNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* :catch_0 */
			 /* move-exception v0 */
			 final String v1 = "JmDNS or serviceInfo class not found"; // const-string v1, "JmDNS or serviceInfo class not found"
			 /* .line 3 */
			 org.apache.log4j.helpers.LogLog .warn ( v1,v0 );
		 } // :goto_0
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 4 */
		 try { // :try_start_1
			 v1 = org.apache.log4j.net.ZeroConfSupport.c;
			 final String v2 = "create"; // const-string v2, "create"
			 int v3 = 0; // const/4 v3, 0x0
			 (( java.lang.Class ) v1 ).getMethod ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
			 /* :try_end_1 */
			 /* .catch Ljava/lang/NoSuchMethodException; {:try_start_1 ..:try_end_1} :catch_1 */
			 int v0 = 1; // const/4 v0, 0x1
			 /* :catch_1 */
			 /* nop */
		 } // :goto_1
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 5 */
			 org.apache.log4j.net.ZeroConfSupport .b ( );
			 /* .line 6 */
		 } // :cond_0
		 org.apache.log4j.net.ZeroConfSupport .a ( );
	 } // .end method
	 public static java.lang.Object getJMDNSInstance ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = org.apache.log4j.net.ZeroConfSupport.b;
	 } // .end method
	 /* # virtual methods */
	 public final java.lang.Object a ( java.lang.String p0, Integer p1, java.lang.String p2, java.util.Map p3 ) {
		 /* .locals 10 */
		 final String v0 = "Unable to construct ServiceInfo instance"; // const-string v0, "Unable to construct ServiceInfo instance"
		 /* .line 4 */
		 /* new-instance v1, Ljava/util/Hashtable; */
		 /* invoke-direct {v1, p4}, Ljava/util/Hashtable;-><init>(Ljava/util/Map;)V */
		 int p4 = 6; // const/4 p4, 0x6
		 try { // :try_start_0
			 /* new-array v2, p4, [Ljava/lang/Class; */
			 /* .line 5 */
			 v3 = org.apache.log4j.net.ZeroConfSupport.e;
			 /* :try_end_0 */
			 /* .catch Ljava/lang/IllegalAccessException; {:try_start_0 ..:try_end_0} :catch_3 */
			 /* .catch Ljava/lang/NoSuchMethodException; {:try_start_0 ..:try_end_0} :catch_2 */
			 /* .catch Ljava/lang/InstantiationException; {:try_start_0 ..:try_end_0} :catch_1 */
			 /* .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 ..:try_end_0} :catch_0 */
			 final String v4 = "java.lang.String"; // const-string v4, "java.lang.String"
			 /* if-nez v3, :cond_0 */
			 try { // :try_start_1
				 org.apache.log4j.net.ZeroConfSupport .a ( v4 );
			 } // :cond_0
			 v3 = org.apache.log4j.net.ZeroConfSupport.e;
		 } // :goto_0
		 int v5 = 0; // const/4 v5, 0x0
		 /* aput-object v3, v2, v5 */
		 /* .line 6 */
		 v3 = org.apache.log4j.net.ZeroConfSupport.e;
		 /* if-nez v3, :cond_1 */
		 org.apache.log4j.net.ZeroConfSupport .a ( v4 );
	 } // :cond_1
	 v3 = org.apache.log4j.net.ZeroConfSupport.e;
} // :goto_1
int v4 = 1; // const/4 v4, 0x1
/* aput-object v3, v2, v4 */
/* .line 7 */
v3 = java.lang.Integer.TYPE;
int v6 = 2; // const/4 v6, 0x2
/* aput-object v3, v2, v6 */
/* .line 8 */
v3 = java.lang.Integer.TYPE;
int v7 = 3; // const/4 v7, 0x3
/* aput-object v3, v2, v7 */
/* .line 9 */
v3 = java.lang.Integer.TYPE;
int v8 = 4; // const/4 v8, 0x4
/* aput-object v3, v2, v8 */
/* .line 10 */
v3 = org.apache.log4j.net.ZeroConfSupport.f;
/* if-nez v3, :cond_2 */
final String v3 = "java.util.Hashtable"; // const-string v3, "java.util.Hashtable"
org.apache.log4j.net.ZeroConfSupport .a ( v3 );
} // :cond_2
v3 = org.apache.log4j.net.ZeroConfSupport.f;
} // :goto_2
int v9 = 5; // const/4 v9, 0x5
/* aput-object v3, v2, v9 */
/* .line 11 */
v3 = org.apache.log4j.net.ZeroConfSupport.d;
(( java.lang.Class ) v3 ).getConstructor ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
/* new-array p4, p4, [Ljava/lang/Object; */
/* aput-object p1, p4, v5 */
/* aput-object p3, p4, v4 */
/* .line 12 */
/* new-instance p1, Ljava/lang/Integer; */
/* invoke-direct {p1, p2}, Ljava/lang/Integer;-><init>(I)V */
/* aput-object p1, p4, v6 */
/* .line 13 */
/* new-instance p1, Ljava/lang/Integer; */
/* invoke-direct {p1, v5}, Ljava/lang/Integer;-><init>(I)V */
/* aput-object p1, p4, v7 */
/* .line 14 */
/* new-instance p1, Ljava/lang/Integer; */
/* invoke-direct {p1, v5}, Ljava/lang/Integer;-><init>(I)V */
/* aput-object p1, p4, v8 */
/* aput-object v1, p4, v9 */
/* .line 15 */
(( java.lang.reflect.Constructor ) v2 ).newInstance ( p4 ); // invoke-virtual {v2, p4}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;
/* .line 16 */
/* new-instance p2, Ljava/lang/StringBuffer; */
/* invoke-direct {p2}, Ljava/lang/StringBuffer;-><init>()V */
final String p3 = "created serviceinfo: "; // const-string p3, "created serviceinfo: "
(( java.lang.StringBuffer ) p2 ).append ( p3 ); // invoke-virtual {p2, p3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) p2 ).append ( p1 ); // invoke-virtual {p2, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .debug ( p2 );
/* :try_end_1 */
/* .catch Ljava/lang/IllegalAccessException; {:try_start_1 ..:try_end_1} :catch_3 */
/* .catch Ljava/lang/NoSuchMethodException; {:try_start_1 ..:try_end_1} :catch_2 */
/* .catch Ljava/lang/InstantiationException; {:try_start_1 ..:try_end_1} :catch_1 */
/* .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 ..:try_end_1} :catch_0 */
/* :catch_0 */
/* move-exception p1 */
/* .line 17 */
org.apache.log4j.helpers.LogLog .warn ( v0,p1 );
/* :catch_1 */
/* move-exception p1 */
/* .line 18 */
org.apache.log4j.helpers.LogLog .warn ( v0,p1 );
/* :catch_2 */
/* move-exception p1 */
final String p2 = "Unable to get ServiceInfo constructor"; // const-string p2, "Unable to get ServiceInfo constructor"
/* .line 19 */
org.apache.log4j.helpers.LogLog .warn ( p2,p1 );
/* :catch_3 */
/* move-exception p1 */
/* .line 20 */
org.apache.log4j.helpers.LogLog .warn ( v0,p1 );
} // :goto_3
int p1 = 0; // const/4 p1, 0x0
} // .end method
public void advertise ( ) {
/* .locals 7 */
final String v0 = "Unable to invoke registerService method"; // const-string v0, "Unable to invoke registerService method"
/* .line 1 */
try { // :try_start_0
v1 = org.apache.log4j.net.ZeroConfSupport.c;
final String v2 = "registerService"; // const-string v2, "registerService"
int v3 = 1; // const/4 v3, 0x1
/* new-array v4, v3, [Ljava/lang/Class; */
v5 = org.apache.log4j.net.ZeroConfSupport.d;
int v6 = 0; // const/4 v6, 0x0
/* aput-object v5, v4, v6 */
(( java.lang.Class ) v1 ).getMethod ( v2, v4 ); // invoke-virtual {v1, v2, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
/* .line 2 */
v2 = org.apache.log4j.net.ZeroConfSupport.b;
/* new-array v3, v3, [Ljava/lang/Object; */
v4 = this.a;
/* aput-object v4, v3, v6 */
(( java.lang.reflect.Method ) v1 ).invoke ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/* .line 3 */
/* new-instance v1, Ljava/lang/StringBuffer; */
/* invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V */
final String v2 = "registered serviceInfo: "; // const-string v2, "registered serviceInfo: "
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
v2 = this.a;
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .debug ( v1 );
/* :try_end_0 */
/* .catch Ljava/lang/IllegalAccessException; {:try_start_0 ..:try_end_0} :catch_2 */
/* .catch Ljava/lang/NoSuchMethodException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v1 */
/* .line 4 */
org.apache.log4j.helpers.LogLog .warn ( v0,v1 );
/* :catch_1 */
/* move-exception v0 */
final String v1 = "No registerService method"; // const-string v1, "No registerService method"
/* .line 5 */
org.apache.log4j.helpers.LogLog .warn ( v1,v0 );
/* :catch_2 */
/* move-exception v1 */
/* .line 6 */
org.apache.log4j.helpers.LogLog .warn ( v0,v1 );
} // :goto_0
return;
} // .end method
public final java.lang.Object b ( java.lang.String p0, Integer p1, java.lang.String p2, java.util.Map p3 ) {
/* .locals 12 */
final String v1 = "Unable to invoke create method"; // const-string v1, "Unable to invoke create method"
int v2 = 0; // const/4 v2, 0x0
int v0 = 6; // const/4 v0, 0x6
try { // :try_start_0
/* new-array v3, v0, [Ljava/lang/Class; */
/* .line 6 */
v4 = org.apache.log4j.net.ZeroConfSupport.e;
/* :try_end_0 */
/* .catch Ljava/lang/IllegalAccessException; {:try_start_0 ..:try_end_0} :catch_2 */
/* .catch Ljava/lang/NoSuchMethodException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 ..:try_end_0} :catch_0 */
final String v5 = "java.lang.String"; // const-string v5, "java.lang.String"
/* if-nez v4, :cond_0 */
try { // :try_start_1
org.apache.log4j.net.ZeroConfSupport .a ( v5 );
} // :cond_0
v4 = org.apache.log4j.net.ZeroConfSupport.e;
} // :goto_0
int v6 = 0; // const/4 v6, 0x0
/* aput-object v4, v3, v6 */
/* .line 7 */
v4 = org.apache.log4j.net.ZeroConfSupport.e;
/* if-nez v4, :cond_1 */
org.apache.log4j.net.ZeroConfSupport .a ( v5 );
} // :cond_1
v4 = org.apache.log4j.net.ZeroConfSupport.e;
} // :goto_1
int v5 = 1; // const/4 v5, 0x1
/* aput-object v4, v3, v5 */
/* .line 8 */
v4 = java.lang.Integer.TYPE;
int v7 = 2; // const/4 v7, 0x2
/* aput-object v4, v3, v7 */
/* .line 9 */
v4 = java.lang.Integer.TYPE;
int v8 = 3; // const/4 v8, 0x3
/* aput-object v4, v3, v8 */
/* .line 10 */
v4 = java.lang.Integer.TYPE;
int v9 = 4; // const/4 v9, 0x4
/* aput-object v4, v3, v9 */
/* .line 11 */
v4 = org.apache.log4j.net.ZeroConfSupport.g;
/* if-nez v4, :cond_2 */
final String v4 = "java.util.Map"; // const-string v4, "java.util.Map"
org.apache.log4j.net.ZeroConfSupport .a ( v4 );
} // :cond_2
v4 = org.apache.log4j.net.ZeroConfSupport.g;
} // :goto_2
int v10 = 5; // const/4 v10, 0x5
/* aput-object v4, v3, v10 */
/* .line 12 */
v4 = org.apache.log4j.net.ZeroConfSupport.d;
final String v11 = "create"; // const-string v11, "create"
(( java.lang.Class ) v4 ).getMethod ( v11, v3 ); // invoke-virtual {v4, v11, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
/* new-array v0, v0, [Ljava/lang/Object; */
/* aput-object p1, v0, v6 */
/* aput-object p3, v0, v5 */
/* .line 13 */
/* new-instance v4, Ljava/lang/Integer; */
/* move v5, p2 */
/* invoke-direct {v4, p2}, Ljava/lang/Integer;-><init>(I)V */
/* aput-object v4, v0, v7 */
/* .line 14 */
/* new-instance v4, Ljava/lang/Integer; */
/* invoke-direct {v4, v6}, Ljava/lang/Integer;-><init>(I)V */
/* aput-object v4, v0, v8 */
/* .line 15 */
/* new-instance v4, Ljava/lang/Integer; */
/* invoke-direct {v4, v6}, Ljava/lang/Integer;-><init>(I)V */
/* aput-object v4, v0, v9 */
/* aput-object p4, v0, v10 */
/* .line 16 */
(( java.lang.reflect.Method ) v3 ).invoke ( v2, v0 ); // invoke-virtual {v3, v2, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/* .line 17 */
/* new-instance v3, Ljava/lang/StringBuffer; */
/* invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V */
final String v4 = "created serviceinfo: "; // const-string v4, "created serviceinfo: "
(( java.lang.StringBuffer ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .debug ( v3 );
/* :try_end_1 */
/* .catch Ljava/lang/IllegalAccessException; {:try_start_1 ..:try_end_1} :catch_2 */
/* .catch Ljava/lang/NoSuchMethodException; {:try_start_1 ..:try_end_1} :catch_1 */
/* .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 ..:try_end_1} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
/* .line 18 */
org.apache.log4j.helpers.LogLog .warn ( v1,v0 );
/* :catch_1 */
/* move-exception v0 */
final String v1 = "Unable to find create method"; // const-string v1, "Unable to find create method"
/* .line 19 */
org.apache.log4j.helpers.LogLog .warn ( v1,v0 );
/* :catch_2 */
/* move-exception v0 */
/* .line 20 */
org.apache.log4j.helpers.LogLog .warn ( v1,v0 );
} // :goto_3
} // .end method
public void unadvertise ( ) {
/* .locals 7 */
final String v0 = "Unable to invoke unregisterService method"; // const-string v0, "Unable to invoke unregisterService method"
/* .line 1 */
try { // :try_start_0
v1 = org.apache.log4j.net.ZeroConfSupport.c;
final String v2 = "unregisterService"; // const-string v2, "unregisterService"
int v3 = 1; // const/4 v3, 0x1
/* new-array v4, v3, [Ljava/lang/Class; */
v5 = org.apache.log4j.net.ZeroConfSupport.d;
int v6 = 0; // const/4 v6, 0x0
/* aput-object v5, v4, v6 */
(( java.lang.Class ) v1 ).getMethod ( v2, v4 ); // invoke-virtual {v1, v2, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
/* .line 2 */
v2 = org.apache.log4j.net.ZeroConfSupport.b;
/* new-array v3, v3, [Ljava/lang/Object; */
v4 = this.a;
/* aput-object v4, v3, v6 */
(( java.lang.reflect.Method ) v1 ).invoke ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/* .line 3 */
/* new-instance v1, Ljava/lang/StringBuffer; */
/* invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V */
final String v2 = "unregistered serviceInfo: "; // const-string v2, "unregistered serviceInfo: "
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
v2 = this.a;
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .debug ( v1 );
/* :try_end_0 */
/* .catch Ljava/lang/IllegalAccessException; {:try_start_0 ..:try_end_0} :catch_2 */
/* .catch Ljava/lang/NoSuchMethodException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v1 */
/* .line 4 */
org.apache.log4j.helpers.LogLog .warn ( v0,v1 );
/* :catch_1 */
/* move-exception v0 */
final String v1 = "No unregisterService method"; // const-string v1, "No unregisterService method"
/* .line 5 */
org.apache.log4j.helpers.LogLog .warn ( v1,v0 );
/* :catch_2 */
/* move-exception v1 */
/* .line 6 */
org.apache.log4j.helpers.LogLog .warn ( v0,v1 );
} // :goto_0
return;
} // .end method
