public class org.apache.log4j.spi.LocationInfo implements java.io.Serializable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # static fields */
	 public static final java.lang.String NA;
	 public static final org.apache.log4j.spi.LocationInfo NA_LOCATION_INFO;
	 public static java.io.StringWriter f;
	 public static java.io.PrintWriter g;
	 public static java.lang.reflect.Method h;
	 public static java.lang.reflect.Method i;
	 public static java.lang.reflect.Method j;
	 public static java.lang.reflect.Method k;
	 public static java.lang.reflect.Method l;
	 public static Boolean m;
	 public static java.lang.Class n; //synthetic
	 /* # instance fields */
	 public transient java.lang.String b;
	 public transient java.lang.String c;
	 public transient java.lang.String d;
	 public transient java.lang.String e;
	 public java.lang.String fullInfo;
	 /* # direct methods */
	 public static org.apache.log4j.spi.LocationInfo ( ) {
		 /* .locals 4 */
		 final String v0 = "LocationInfo will use pre-JDK 1.4 methods to determine location."; // const-string v0, "LocationInfo will use pre-JDK 1.4 methods to determine location."
		 /* .line 1 */
		 /* new-instance v1, Ljava/io/StringWriter; */
		 /* invoke-direct {v1}, Ljava/io/StringWriter;-><init>()V */
		 /* .line 2 */
		 /* new-instance v1, Ljava/io/PrintWriter; */
		 v2 = org.apache.log4j.spi.LocationInfo.f;
		 /* invoke-direct {v1, v2}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V */
		 /* .line 3 */
		 /* new-instance v1, Lorg/apache/log4j/spi/LocationInfo; */
		 final String v2 = "?"; // const-string v2, "?"
		 /* invoke-direct {v1, v2, v2, v2, v2}, Lorg/apache/log4j/spi/LocationInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V */
		 int v1 = 0; // const/4 v1, 0x0
		 /* .line 4 */
		 org.apache.log4j.spi.LocationInfo.m = (v1!= 0);
		 try { // :try_start_0
			 final String v2 = "com.ibm.uvm.tools.DebugSupport"; // const-string v2, "com.ibm.uvm.tools.DebugSupport"
			 /* .line 5 */
			 java.lang.Class .forName ( v2 );
			 if ( v2 != null) { // if-eqz v2, :cond_0
				 int v1 = 1; // const/4 v1, 0x1
			 } // :cond_0
			 org.apache.log4j.spi.LocationInfo.m = (v1!= 0);
			 final String v1 = "Detected IBM VisualAge environment."; // const-string v1, "Detected IBM VisualAge environment."
			 /* .line 6 */
			 org.apache.log4j.helpers.LogLog .debug ( v1 );
			 /* :try_end_0 */
			 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
			 /* :catchall_0 */
			 int v1 = 0; // const/4 v1, 0x0
			 /* .line 7 */
			 try { // :try_start_1
				 v2 = org.apache.log4j.spi.LocationInfo.n;
				 /* if-nez v2, :cond_1 */
				 final String v2 = "java.lang.Throwable"; // const-string v2, "java.lang.Throwable"
				 org.apache.log4j.spi.LocationInfo .a ( v2 );
			 } // :cond_1
			 v2 = org.apache.log4j.spi.LocationInfo.n;
		 } // :goto_0
		 final String v3 = "getStackTrace"; // const-string v3, "getStackTrace"
		 (( java.lang.Class ) v2 ).getMethod ( v3, v1 ); // invoke-virtual {v2, v3, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
		 final String v2 = "java.lang.StackTraceElement"; // const-string v2, "java.lang.StackTraceElement"
		 /* .line 8 */
		 java.lang.Class .forName ( v2 );
		 final String v3 = "getClassName"; // const-string v3, "getClassName"
		 /* .line 9 */
		 (( java.lang.Class ) v2 ).getMethod ( v3, v1 ); // invoke-virtual {v2, v3, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
		 final String v3 = "getMethodName"; // const-string v3, "getMethodName"
		 /* .line 10 */
		 (( java.lang.Class ) v2 ).getMethod ( v3, v1 ); // invoke-virtual {v2, v3, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
		 final String v3 = "getFileName"; // const-string v3, "getFileName"
		 /* .line 11 */
		 (( java.lang.Class ) v2 ).getMethod ( v3, v1 ); // invoke-virtual {v2, v3, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
		 final String v3 = "getLineNumber"; // const-string v3, "getLineNumber"
		 /* .line 12 */
		 (( java.lang.Class ) v2 ).getMethod ( v3, v1 ); // invoke-virtual {v2, v3, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
		 /* :try_end_1 */
		 /* .catch Ljava/lang/ClassNotFoundException; {:try_start_1 ..:try_end_1} :catch_1 */
		 /* .catch Ljava/lang/NoSuchMethodException; {:try_start_1 ..:try_end_1} :catch_0 */
		 /* .line 13 */
		 /* :catch_0 */
		 org.apache.log4j.helpers.LogLog .debug ( v0 );
		 /* .line 14 */
		 /* :catch_1 */
		 org.apache.log4j.helpers.LogLog .debug ( v0 );
	 } // :goto_1
	 return;
} // .end method
public org.apache.log4j.spi.LocationInfo ( ) {
	 /* .locals 1 */
	 /* .line 45 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* .line 46 */
	 this.c = p1;
	 /* .line 47 */
	 this.d = p2;
	 /* .line 48 */
	 this.e = p3;
	 /* .line 49 */
	 this.b = p4;
	 /* .line 50 */
	 /* new-instance v0, Ljava/lang/StringBuffer; */
	 /* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
	 /* .line 51 */
	 org.apache.log4j.spi.LocationInfo .a ( v0,p2 );
	 final String p2 = "."; // const-string p2, "."
	 /* .line 52 */
	 (( java.lang.StringBuffer ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 /* .line 53 */
	 org.apache.log4j.spi.LocationInfo .a ( v0,p3 );
	 final String p2 = "("; // const-string p2, "("
	 /* .line 54 */
	 (( java.lang.StringBuffer ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 /* .line 55 */
	 org.apache.log4j.spi.LocationInfo .a ( v0,p1 );
	 final String p1 = ":"; // const-string p1, ":"
	 /* .line 56 */
	 (( java.lang.StringBuffer ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 /* .line 57 */
	 org.apache.log4j.spi.LocationInfo .a ( v0,p4 );
	 final String p1 = ")"; // const-string p1, ")"
	 /* .line 58 */
	 (( java.lang.StringBuffer ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 /* .line 59 */
	 (( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
	 this.fullInfo = p1;
	 return;
} // .end method
public org.apache.log4j.spi.LocationInfo ( ) {
	 /* .locals 6 */
	 /* .line 1 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 if ( p1 != null) { // if-eqz p1, :cond_f
		 /* if-nez p2, :cond_0 */
		 /* goto/16 :goto_3 */
		 /* .line 2 */
	 } // :cond_0
	 v0 = org.apache.log4j.spi.LocationInfo.l;
	 if ( v0 != null) { // if-eqz v0, :cond_8
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 3 */
		 try { // :try_start_0
			 v1 = org.apache.log4j.spi.LocationInfo.h;
			 (( java.lang.reflect.Method ) v1 ).invoke ( p1, v0 ); // invoke-virtual {v1, p1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
			 /* check-cast v1, [Ljava/lang/Object; */
			 final String v2 = "?"; // const-string v2, "?"
			 /* .line 4 */
			 /* array-length v3, v1 */
			 /* add-int/lit8 v3, v3, -0x1 */
		 } // :goto_0
		 /* if-ltz v3, :cond_5 */
		 /* .line 5 */
		 v4 = org.apache.log4j.spi.LocationInfo.i;
		 /* aget-object v5, v1, v3 */
		 (( java.lang.reflect.Method ) v4 ).invoke ( v5, v0 ); // invoke-virtual {v4, v5, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
		 /* check-cast v4, Ljava/lang/String; */
		 /* .line 6 */
		 v5 = 		 (( java.lang.String ) p2 ).equals ( v4 ); // invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
		 if ( v5 != null) { // if-eqz v5, :cond_4
			 /* add-int/lit8 v3, v3, 0x1 */
			 /* .line 7 */
			 /* array-length v4, v1 */
			 /* if-ge v3, v4, :cond_3 */
			 /* .line 8 */
			 this.d = v2;
			 /* .line 9 */
			 v2 = org.apache.log4j.spi.LocationInfo.j;
			 /* aget-object v4, v1, v3 */
			 (( java.lang.reflect.Method ) v2 ).invoke ( v4, v0 ); // invoke-virtual {v2, v4, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
			 /* check-cast v2, Ljava/lang/String; */
			 this.e = v2;
			 /* .line 10 */
			 v2 = org.apache.log4j.spi.LocationInfo.k;
			 /* aget-object v4, v1, v3 */
			 (( java.lang.reflect.Method ) v2 ).invoke ( v4, v0 ); // invoke-virtual {v2, v4, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
			 /* check-cast v2, Ljava/lang/String; */
			 this.c = v2;
			 /* if-nez v2, :cond_1 */
			 final String v2 = "?"; // const-string v2, "?"
			 /* .line 11 */
			 this.c = v2;
			 /* .line 12 */
		 } // :cond_1
		 v2 = org.apache.log4j.spi.LocationInfo.l;
		 /* aget-object v1, v1, v3 */
		 (( java.lang.reflect.Method ) v2 ).invoke ( v1, v0 ); // invoke-virtual {v2, v1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
		 /* check-cast v0, Ljava/lang/Integer; */
		 v0 = 		 (( java.lang.Integer ) v0 ).intValue ( ); // invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
		 /* if-gez v0, :cond_2 */
		 final String v0 = "?"; // const-string v0, "?"
		 /* .line 13 */
		 this.b = v0;
		 /* .line 14 */
	 } // :cond_2
	 java.lang.String .valueOf ( v0 );
	 this.b = v0;
	 /* .line 15 */
} // :goto_1
/* new-instance v0, Ljava/lang/StringBuffer; */
/* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
/* .line 16 */
v1 = this.d;
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v1 = "."; // const-string v1, "."
/* .line 17 */
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 18 */
v1 = this.e;
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v1 = "("; // const-string v1, "("
/* .line 19 */
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 20 */
v1 = this.c;
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v1 = ":"; // const-string v1, ":"
/* .line 21 */
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 22 */
v1 = this.b;
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v1 = ")"; // const-string v1, ")"
/* .line 23 */
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 24 */
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
this.fullInfo = v0;
/* :try_end_0 */
/* .catch Ljava/lang/IllegalAccessException; {:try_start_0 ..:try_end_0} :catch_2 */
/* .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Ljava/lang/RuntimeException; {:try_start_0 ..:try_end_0} :catch_0 */
} // :cond_3
return;
} // :cond_4
/* add-int/lit8 v3, v3, -0x1 */
/* move-object v2, v4 */
/* goto/16 :goto_0 */
} // :cond_5
return;
/* :catch_0 */
/* move-exception v0 */
final String v1 = "LocationInfo failed using JDK 1.4 methods"; // const-string v1, "LocationInfo failed using JDK 1.4 methods"
/* .line 25 */
org.apache.log4j.helpers.LogLog .debug ( v1,v0 );
/* :catch_1 */
/* move-exception v0 */
/* .line 26 */
(( java.lang.reflect.InvocationTargetException ) v0 ).getTargetException ( ); // invoke-virtual {v0}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;
/* instance-of v1, v1, Ljava/lang/InterruptedException; */
/* if-nez v1, :cond_6 */
(( java.lang.reflect.InvocationTargetException ) v0 ).getTargetException ( ); // invoke-virtual {v0}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;
/* instance-of v1, v1, Ljava/io/InterruptedIOException; */
if ( v1 != null) { // if-eqz v1, :cond_7
/* .line 27 */
} // :cond_6
java.lang.Thread .currentThread ( );
(( java.lang.Thread ) v1 ).interrupt ( ); // invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V
} // :cond_7
final String v1 = "LocationInfo failed using JDK 1.4 methods"; // const-string v1, "LocationInfo failed using JDK 1.4 methods"
/* .line 28 */
org.apache.log4j.helpers.LogLog .debug ( v1,v0 );
/* :catch_2 */
/* move-exception v0 */
final String v1 = "LocationInfo failed using JDK 1.4 methods"; // const-string v1, "LocationInfo failed using JDK 1.4 methods"
/* .line 29 */
org.apache.log4j.helpers.LogLog .debug ( v1,v0 );
/* .line 30 */
} // :cond_8
} // :goto_2
v0 = org.apache.log4j.spi.LocationInfo.f;
/* monitor-enter v0 */
/* .line 31 */
try { // :try_start_1
v1 = org.apache.log4j.spi.LocationInfo.g;
(( java.lang.Throwable ) p1 ).printStackTrace ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintWriter;)V
/* .line 32 */
p1 = org.apache.log4j.spi.LocationInfo.f;
(( java.io.StringWriter ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/io/StringWriter;->toString()Ljava/lang/String;
/* .line 33 */
v1 = org.apache.log4j.spi.LocationInfo.f;
(( java.io.StringWriter ) v1 ).getBuffer ( ); // invoke-virtual {v1}, Ljava/io/StringWriter;->getBuffer()Ljava/lang/StringBuffer;
int v2 = 0; // const/4 v2, 0x0
(( java.lang.StringBuffer ) v1 ).setLength ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->setLength(I)V
/* .line 34 */
/* monitor-exit v0 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 35 */
v0 = (( java.lang.String ) p1 ).lastIndexOf ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I
int v1 = -1; // const/4 v1, -0x1
/* if-ne v0, v1, :cond_9 */
return;
/* .line 36 */
} // :cond_9
v2 = (( java.lang.String ) p2 ).length ( ); // invoke-virtual {p2}, Ljava/lang/String;->length()I
/* add-int/2addr v2, v0 */
v3 = (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
/* if-ge v2, v3, :cond_a */
v2 = (( java.lang.String ) p2 ).length ( ); // invoke-virtual {p2}, Ljava/lang/String;->length()I
/* add-int/2addr v2, v0 */
v2 = (( java.lang.String ) p1 ).charAt ( v2 ); // invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C
/* const/16 v3, 0x2e */
/* if-eq v2, v3, :cond_a */
/* .line 37 */
/* new-instance v2, Ljava/lang/StringBuffer; */
/* invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V */
(( java.lang.StringBuffer ) v2 ).append ( p2 ); // invoke-virtual {v2, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String p2 = "."; // const-string p2, "."
(( java.lang.StringBuffer ) v2 ).append ( p2 ); // invoke-virtual {v2, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
p2 = (( java.lang.String ) p1 ).lastIndexOf ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I
/* if-eq p2, v1, :cond_a */
/* move v0, p2 */
/* .line 38 */
} // :cond_a
p2 = org.apache.log4j.Layout.LINE_SEP;
p2 = (( java.lang.String ) p1 ).indexOf ( p2, v0 ); // invoke-virtual {p1, p2, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I
/* if-ne p2, v1, :cond_b */
return;
/* .line 39 */
} // :cond_b
/* add-int/2addr p2, v0 */
/* .line 40 */
v0 = org.apache.log4j.Layout.LINE_SEP;
v0 = (( java.lang.String ) p1 ).indexOf ( v0, p2 ); // invoke-virtual {p1, v0, p2}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I
/* if-ne v0, v1, :cond_c */
return;
/* .line 41 */
} // :cond_c
/* sget-boolean v2, Lorg/apache/log4j/spi/LocationInfo;->m:Z */
/* if-nez v2, :cond_e */
final String p2 = "at "; // const-string p2, "at "
/* .line 42 */
p2 = (( java.lang.String ) p1 ).lastIndexOf ( p2, v0 ); // invoke-virtual {p1, p2, v0}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;I)I
/* if-ne p2, v1, :cond_d */
return;
} // :cond_d
/* add-int/lit8 p2, p2, 0x3 */
/* .line 43 */
} // :cond_e
(( java.lang.String ) p1 ).substring ( p2, v0 ); // invoke-virtual {p1, p2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;
this.fullInfo = p1;
return;
/* :catchall_0 */
/* move-exception p1 */
/* .line 44 */
try { // :try_start_2
/* monitor-exit v0 */
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
/* throw p1 */
} // :cond_f
} // :goto_3
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
public static final void a ( java.lang.StringBuffer p0, java.lang.String p1 ) {
/* .locals 0 */
/* if-nez p1, :cond_0 */
final String p1 = "?"; // const-string p1, "?"
/* .line 2 */
(( java.lang.StringBuffer ) p0 ).append ( p1 ); // invoke-virtual {p0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 3 */
} // :cond_0
(( java.lang.StringBuffer ) p0 ).append ( p1 ); // invoke-virtual {p0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
} // :goto_0
return;
} // .end method
/* # virtual methods */
public java.lang.String getClassName ( ) {
/* .locals 5 */
/* .line 1 */
v0 = this.fullInfo;
final String v1 = "?"; // const-string v1, "?"
/* if-nez v0, :cond_0 */
/* .line 2 */
} // :cond_0
v2 = this.d;
/* if-nez v2, :cond_4 */
/* const/16 v2, 0x28 */
/* .line 3 */
v0 = (( java.lang.String ) v0 ).lastIndexOf ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/String;->lastIndexOf(I)I
int v2 = -1; // const/4 v2, -0x1
/* if-ne v0, v2, :cond_1 */
/* .line 4 */
this.d = v1;
/* .line 5 */
} // :cond_1
v3 = this.fullInfo;
/* const/16 v4, 0x2e */
v0 = (( java.lang.String ) v3 ).lastIndexOf ( v4, v0 ); // invoke-virtual {v3, v4, v0}, Ljava/lang/String;->lastIndexOf(II)I
int v3 = 0; // const/4 v3, 0x0
/* .line 6 */
/* sget-boolean v4, Lorg/apache/log4j/spi/LocationInfo;->m:Z */
if ( v4 != null) { // if-eqz v4, :cond_2
/* .line 7 */
v3 = this.fullInfo;
/* const/16 v4, 0x20 */
v3 = (( java.lang.String ) v3 ).lastIndexOf ( v4, v0 ); // invoke-virtual {v3, v4, v0}, Ljava/lang/String;->lastIndexOf(II)I
/* add-int/lit8 v3, v3, 0x1 */
} // :cond_2
/* if-ne v0, v2, :cond_3 */
/* .line 8 */
this.d = v1;
/* .line 9 */
} // :cond_3
v1 = this.fullInfo;
(( java.lang.String ) v1 ).substring ( v3, v0 ); // invoke-virtual {v1, v3, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;
this.d = v0;
/* .line 10 */
} // :cond_4
} // :goto_0
v0 = this.d;
} // .end method
public java.lang.String getFileName ( ) {
/* .locals 4 */
/* .line 1 */
v0 = this.fullInfo;
final String v1 = "?"; // const-string v1, "?"
/* if-nez v0, :cond_0 */
/* .line 2 */
} // :cond_0
v2 = this.c;
/* if-nez v2, :cond_2 */
/* const/16 v2, 0x3a */
/* .line 3 */
v0 = (( java.lang.String ) v0 ).lastIndexOf ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/String;->lastIndexOf(I)I
int v2 = -1; // const/4 v2, -0x1
/* if-ne v0, v2, :cond_1 */
/* .line 4 */
this.c = v1;
/* .line 5 */
} // :cond_1
v1 = this.fullInfo;
/* const/16 v2, 0x28 */
/* add-int/lit8 v3, v0, -0x1 */
v1 = (( java.lang.String ) v1 ).lastIndexOf ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/lang/String;->lastIndexOf(II)I
/* .line 6 */
v2 = this.fullInfo;
/* add-int/lit8 v1, v1, 0x1 */
(( java.lang.String ) v2 ).substring ( v1, v0 ); // invoke-virtual {v2, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;
this.c = v0;
/* .line 7 */
} // :cond_2
} // :goto_0
v0 = this.c;
} // .end method
public java.lang.String getLineNumber ( ) {
/* .locals 5 */
/* .line 1 */
v0 = this.fullInfo;
final String v1 = "?"; // const-string v1, "?"
/* if-nez v0, :cond_0 */
/* .line 2 */
} // :cond_0
v2 = this.b;
/* if-nez v2, :cond_2 */
/* const/16 v2, 0x29 */
/* .line 3 */
v0 = (( java.lang.String ) v0 ).lastIndexOf ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/String;->lastIndexOf(I)I
/* .line 4 */
v2 = this.fullInfo;
/* const/16 v3, 0x3a */
/* add-int/lit8 v4, v0, -0x1 */
v2 = (( java.lang.String ) v2 ).lastIndexOf ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Ljava/lang/String;->lastIndexOf(II)I
int v3 = -1; // const/4 v3, -0x1
/* if-ne v2, v3, :cond_1 */
/* .line 5 */
this.b = v1;
/* .line 6 */
} // :cond_1
v1 = this.fullInfo;
/* add-int/lit8 v2, v2, 0x1 */
(( java.lang.String ) v1 ).substring ( v2, v0 ); // invoke-virtual {v1, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;
this.b = v0;
/* .line 7 */
} // :cond_2
} // :goto_0
v0 = this.b;
} // .end method
public java.lang.String getMethodName ( ) {
/* .locals 4 */
/* .line 1 */
v0 = this.fullInfo;
final String v1 = "?"; // const-string v1, "?"
/* if-nez v0, :cond_0 */
/* .line 2 */
} // :cond_0
v2 = this.e;
/* if-nez v2, :cond_2 */
/* const/16 v2, 0x28 */
/* .line 3 */
v0 = (( java.lang.String ) v0 ).lastIndexOf ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/String;->lastIndexOf(I)I
/* .line 4 */
v2 = this.fullInfo;
/* const/16 v3, 0x2e */
v2 = (( java.lang.String ) v2 ).lastIndexOf ( v3, v0 ); // invoke-virtual {v2, v3, v0}, Ljava/lang/String;->lastIndexOf(II)I
int v3 = -1; // const/4 v3, -0x1
/* if-ne v2, v3, :cond_1 */
/* .line 5 */
this.e = v1;
/* .line 6 */
} // :cond_1
v1 = this.fullInfo;
/* add-int/lit8 v2, v2, 0x1 */
(( java.lang.String ) v1 ).substring ( v2, v0 ); // invoke-virtual {v1, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;
this.e = v0;
/* .line 7 */
} // :cond_2
} // :goto_0
v0 = this.e;
} // .end method
