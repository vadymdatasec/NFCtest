public class org.apache.log4j.Level extends org.apache.log4j.Priority implements java.io.Serializable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # static fields */
	 public static final org.apache.log4j.Level ALL;
	 public static final org.apache.log4j.Level DEBUG;
	 public static final org.apache.log4j.Level ERROR;
	 public static final org.apache.log4j.Level FATAL;
	 public static final org.apache.log4j.Level INFO;
	 public static final org.apache.log4j.Level OFF;
	 public static final org.apache.log4j.Level TRACE;
	 public static final Integer TRACE_INT;
	 public static final org.apache.log4j.Level WARN;
	 /* # direct methods */
	 public static org.apache.log4j.Level ( ) {
		 /* .locals 4 */
		 /* .line 1 */
		 /* new-instance v0, Lorg/apache/log4j/Level; */
		 int v1 = 0; // const/4 v1, 0x0
		 /* const v2, 0x7fffffff */
		 final String v3 = "OFF"; // const-string v3, "OFF"
		 /* invoke-direct {v0, v2, v3, v1}, Lorg/apache/log4j/Level;-><init>(ILjava/lang/String;I)V */
		 /* .line 2 */
		 /* new-instance v0, Lorg/apache/log4j/Level; */
		 /* const v2, 0xc350 */
		 final String v3 = "FATAL"; // const-string v3, "FATAL"
		 /* invoke-direct {v0, v2, v3, v1}, Lorg/apache/log4j/Level;-><init>(ILjava/lang/String;I)V */
		 /* .line 3 */
		 /* new-instance v0, Lorg/apache/log4j/Level; */
		 /* const v1, 0x9c40 */
		 final String v2 = "ERROR"; // const-string v2, "ERROR"
		 int v3 = 3; // const/4 v3, 0x3
		 /* invoke-direct {v0, v1, v2, v3}, Lorg/apache/log4j/Level;-><init>(ILjava/lang/String;I)V */
		 /* .line 4 */
		 /* new-instance v0, Lorg/apache/log4j/Level; */
		 /* const/16 v1, 0x7530 */
		 final String v2 = "WARN"; // const-string v2, "WARN"
		 int v3 = 4; // const/4 v3, 0x4
		 /* invoke-direct {v0, v1, v2, v3}, Lorg/apache/log4j/Level;-><init>(ILjava/lang/String;I)V */
		 /* .line 5 */
		 /* new-instance v0, Lorg/apache/log4j/Level; */
		 /* const/16 v1, 0x4e20 */
		 final String v2 = "INFO"; // const-string v2, "INFO"
		 int v3 = 6; // const/4 v3, 0x6
		 /* invoke-direct {v0, v1, v2, v3}, Lorg/apache/log4j/Level;-><init>(ILjava/lang/String;I)V */
		 /* .line 6 */
		 /* new-instance v0, Lorg/apache/log4j/Level; */
		 int v1 = 7; // const/4 v1, 0x7
		 /* const/16 v2, 0x2710 */
		 final String v3 = "DEBUG"; // const-string v3, "DEBUG"
		 /* invoke-direct {v0, v2, v3, v1}, Lorg/apache/log4j/Level;-><init>(ILjava/lang/String;I)V */
		 /* .line 7 */
		 /* new-instance v0, Lorg/apache/log4j/Level; */
		 /* const/16 v2, 0x1388 */
		 final String v3 = "TRACE"; // const-string v3, "TRACE"
		 /* invoke-direct {v0, v2, v3, v1}, Lorg/apache/log4j/Level;-><init>(ILjava/lang/String;I)V */
		 /* .line 8 */
		 /* new-instance v0, Lorg/apache/log4j/Level; */
		 /* const/high16 v2, -0x80000000 */
		 final String v3 = "ALL"; // const-string v3, "ALL"
		 /* invoke-direct {v0, v2, v3, v1}, Lorg/apache/log4j/Level;-><init>(ILjava/lang/String;I)V */
		 return;
	 } // .end method
	 public org.apache.log4j.Level ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0, p1, p2, p3}, Lorg/apache/log4j/Priority;-><init>(ILjava/lang/String;I)V */
		 return;
	 } // .end method
	 public static org.apache.log4j.Level toLevel ( Integer p0 ) {
		 /* .locals 1 */
		 /* .line 2 */
		 v0 = org.apache.log4j.Level.DEBUG;
		 org.apache.log4j.Level .toLevel ( p0,v0 );
	 } // .end method
	 public static org.apache.log4j.Level toLevel ( Integer p0, org.apache.log4j.Level p1 ) {
		 /* .locals 1 */
		 /* const/high16 v0, -0x80000000 */
		 /* if-eq p0, v0, :cond_7 */
		 /* const/16 v0, 0x1388 */
		 /* if-eq p0, v0, :cond_6 */
		 /* const/16 v0, 0x2710 */
		 /* if-eq p0, v0, :cond_5 */
		 /* const/16 v0, 0x4e20 */
		 /* if-eq p0, v0, :cond_4 */
		 /* const/16 v0, 0x7530 */
		 /* if-eq p0, v0, :cond_3 */
		 /* const v0, 0x9c40 */
		 /* if-eq p0, v0, :cond_2 */
		 /* const v0, 0xc350 */
		 /* if-eq p0, v0, :cond_1 */
		 /* const v0, 0x7fffffff */
		 /* if-eq p0, v0, :cond_0 */
		 /* .line 3 */
	 } // :cond_0
	 p0 = org.apache.log4j.Level.OFF;
	 /* .line 4 */
} // :cond_1
p0 = org.apache.log4j.Level.FATAL;
/* .line 5 */
} // :cond_2
p0 = org.apache.log4j.Level.ERROR;
/* .line 6 */
} // :cond_3
p0 = org.apache.log4j.Level.WARN;
/* .line 7 */
} // :cond_4
p0 = org.apache.log4j.Level.INFO;
/* .line 8 */
} // :cond_5
p0 = org.apache.log4j.Level.DEBUG;
/* .line 9 */
} // :cond_6
p0 = org.apache.log4j.Level.TRACE;
/* .line 10 */
} // :cond_7
p0 = org.apache.log4j.Level.ALL;
} // .end method
public static org.apache.log4j.Level toLevel ( java.lang.String p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = org.apache.log4j.Level.DEBUG;
org.apache.log4j.Level .toLevel ( p0,v0 );
} // .end method
public static org.apache.log4j.Level toLevel ( java.lang.String p0, org.apache.log4j.Level p1 ) {
/* .locals 1 */
/* if-nez p0, :cond_0 */
/* .line 11 */
} // :cond_0
(( java.lang.String ) p0 ).toUpperCase ( ); // invoke-virtual {p0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;
final String v0 = "ALL"; // const-string v0, "ALL"
/* .line 12 */
v0 = (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
p0 = org.apache.log4j.Level.ALL;
} // :cond_1
final String v0 = "DEBUG"; // const-string v0, "DEBUG"
/* .line 13 */
v0 = (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_2
p0 = org.apache.log4j.Level.DEBUG;
} // :cond_2
final String v0 = "INFO"; // const-string v0, "INFO"
/* .line 14 */
v0 = (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_3
p0 = org.apache.log4j.Level.INFO;
} // :cond_3
final String v0 = "WARN"; // const-string v0, "WARN"
/* .line 15 */
v0 = (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_4
p0 = org.apache.log4j.Level.WARN;
} // :cond_4
final String v0 = "ERROR"; // const-string v0, "ERROR"
/* .line 16 */
v0 = (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_5
p0 = org.apache.log4j.Level.ERROR;
} // :cond_5
final String v0 = "FATAL"; // const-string v0, "FATAL"
/* .line 17 */
v0 = (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_6
p0 = org.apache.log4j.Level.FATAL;
} // :cond_6
final String v0 = "OFF"; // const-string v0, "OFF"
/* .line 18 */
v0 = (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_7
p0 = org.apache.log4j.Level.OFF;
} // :cond_7
final String v0 = "TRACE"; // const-string v0, "TRACE"
/* .line 19 */
v0 = (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_8
p0 = org.apache.log4j.Level.TRACE;
} // :cond_8
final String v0 = "\u0130NFO"; // const-string v0, "\u0130NFO"
/* .line 20 */
p0 = (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( p0 != null) { // if-eqz p0, :cond_9
p0 = org.apache.log4j.Level.INFO;
} // :cond_9
} // .end method
