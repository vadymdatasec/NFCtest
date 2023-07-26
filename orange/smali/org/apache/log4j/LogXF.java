public abstract class org.apache.log4j.LogXF {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final org.apache.log4j.Level a;
	 public static final java.lang.String b;
	 public static java.lang.Class c; //synthetic
	 /* # direct methods */
	 public static org.apache.log4j.LogXF ( ) {
		 /* .locals 4 */
		 /* .line 1 */
		 /* new-instance v0, Lorg/apache/log4j/Level; */
		 /* const/16 v1, 0x1388 */
		 final String v2 = "TRACE"; // const-string v2, "TRACE"
		 int v3 = 7; // const/4 v3, 0x7
		 /* invoke-direct {v0, v1, v2, v3}, Lorg/apache/log4j/Level;-><init>(ILjava/lang/String;I)V */
		 /* .line 2 */
		 v0 = org.apache.log4j.LogXF.c;
		 /* if-nez v0, :cond_0 */
		 final String v0 = "org.apache.log4j.LogXF"; // const-string v0, "org.apache.log4j.LogXF"
		 org.apache.log4j.LogXF .a ( v0 );
	 } // :cond_0
	 (( java.lang.Class ) v0 ).getName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;
	 return;
} // .end method
public static java.lang.Boolean a ( Boolean p0 ) {
	 /* .locals 0 */
	 if ( p0 != null) { // if-eqz p0, :cond_0
		 /* .line 2 */
		 p0 = java.lang.Boolean.TRUE;
		 /* .line 3 */
	 } // :cond_0
	 p0 = java.lang.Boolean.FALSE;
} // .end method
public static java.lang.Byte a ( Object p0 ) {
	 /* .locals 1 */
	 /* .line 5 */
	 /* new-instance v0, Ljava/lang/Byte; */
	 /* invoke-direct {v0, p0}, Ljava/lang/Byte;-><init>(B)V */
} // .end method
public static java.lang.Character a ( Object p0 ) {
	 /* .locals 1 */
	 /* .line 4 */
	 /* new-instance v0, Ljava/lang/Character; */
	 /* invoke-direct {v0, p0}, Ljava/lang/Character;-><init>(C)V */
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
	 public static java.lang.Double a ( Double p0 ) {
		 /* .locals 1 */
		 /* .line 10 */
		 /* new-instance v0, Ljava/lang/Double; */
		 /* invoke-direct {v0, p0, p1}, Ljava/lang/Double;-><init>(D)V */
	 } // .end method
	 public static java.lang.Float a ( Float p0 ) {
		 /* .locals 1 */
		 /* .line 9 */
		 /* new-instance v0, Ljava/lang/Float; */
		 /* invoke-direct {v0, p0}, Ljava/lang/Float;-><init>(F)V */
	 } // .end method
	 public static java.lang.Integer a ( Integer p0 ) {
		 /* .locals 1 */
		 /* .line 7 */
		 /* new-instance v0, Ljava/lang/Integer; */
		 /* invoke-direct {v0, p0}, Ljava/lang/Integer;-><init>(I)V */
	 } // .end method
	 public static java.lang.Long a ( Long p0 ) {
		 /* .locals 1 */
		 /* .line 8 */
		 /* new-instance v0, Ljava/lang/Long; */
		 /* invoke-direct {v0, p0, p1}, Ljava/lang/Long;-><init>(J)V */
	 } // .end method
	 public static java.lang.Short a ( Object p0 ) {
		 /* .locals 1 */
		 /* .line 6 */
		 /* new-instance v0, Ljava/lang/Short; */
		 /* invoke-direct {v0, p0}, Ljava/lang/Short;-><init>(S)V */
	 } // .end method
	 public static java.lang.Object a ( java.lang.Object p0 ) {
		 /* .locals 2 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* new-array v0, v0, [Ljava/lang/Object; */
		 int v1 = 0; // const/4 v1, 0x0
		 /* aput-object p0, v0, v1 */
	 } // .end method
	 public static java.lang.Object a ( java.lang.Object p0, java.lang.Object p1 ) {
		 /* .locals 2 */
		 int v0 = 2; // const/4 v0, 0x2
		 /* new-array v0, v0, [Ljava/lang/Object; */
		 int v1 = 0; // const/4 v1, 0x0
		 /* aput-object p0, v0, v1 */
		 int p0 = 1; // const/4 p0, 0x1
		 /* aput-object p1, v0, p0 */
	 } // .end method
	 public static java.lang.Object a ( java.lang.Object p0, java.lang.Object p1, java.lang.Object p2 ) {
		 /* .locals 2 */
		 int v0 = 3; // const/4 v0, 0x3
		 /* new-array v0, v0, [Ljava/lang/Object; */
		 int v1 = 0; // const/4 v1, 0x0
		 /* aput-object p0, v0, v1 */
		 int p0 = 1; // const/4 p0, 0x1
		 /* aput-object p1, v0, p0 */
		 int p0 = 2; // const/4 p0, 0x2
		 /* aput-object p2, v0, p0 */
	 } // .end method
	 public static java.lang.Object a ( java.lang.Object p0, java.lang.Object p1, java.lang.Object p2, java.lang.Object p3 ) {
		 /* .locals 2 */
		 int v0 = 4; // const/4 v0, 0x4
		 /* new-array v0, v0, [Ljava/lang/Object; */
		 int v1 = 0; // const/4 v1, 0x0
		 /* aput-object p0, v0, v1 */
		 int p0 = 1; // const/4 p0, 0x1
		 /* aput-object p1, v0, p0 */
		 int p0 = 2; // const/4 p0, 0x2
		 /* aput-object p2, v0, p0 */
		 int p0 = 3; // const/4 p0, 0x3
		 /* aput-object p3, v0, p0 */
	 } // .end method
	 public static void entering ( org.apache.log4j.Logger p0, java.lang.String p1, java.lang.String p2 ) {
		 /* .locals 7 */
		 /* .line 1 */
		 v0 = 		 (( org.apache.log4j.Category ) p0 ).isDebugEnabled ( ); // invoke-virtual {p0}, Lorg/apache/log4j/Category;->isDebugEnabled()Z
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 2 */
			 /* new-instance v0, Lorg/apache/log4j/spi/LoggingEvent; */
			 v2 = org.apache.log4j.LogXF.b;
			 v4 = org.apache.log4j.Level.DEBUG;
			 /* new-instance v1, Ljava/lang/StringBuffer; */
			 /* invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V */
			 (( java.lang.StringBuffer ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
			 final String p1 = "."; // const-string p1, "."
			 (( java.lang.StringBuffer ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
			 (( java.lang.StringBuffer ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
			 final String p1 = " ENTRY"; // const-string p1, " ENTRY"
			 (( java.lang.StringBuffer ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
			 (( java.lang.StringBuffer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
			 int v6 = 0; // const/4 v6, 0x0
			 /* move-object v1, v0 */
			 /* move-object v3, p0 */
			 /* invoke-direct/range {v1 ..v6}, Lorg/apache/log4j/spi/LoggingEvent;-><init>(Ljava/lang/String;Lorg/apache/log4j/Category;Lorg/apache/log4j/Priority;Ljava/lang/Object;Ljava/lang/Throwable;)V */
			 (( org.apache.log4j.Category ) p0 ).callAppenders ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/log4j/Category;->callAppenders(Lorg/apache/log4j/spi/LoggingEvent;)V
		 } // :cond_0
		 return;
	 } // .end method
	 public static void entering ( org.apache.log4j.Logger p0, java.lang.String p1, java.lang.String p2, java.lang.Object p3 ) {
		 /* .locals 6 */
		 /* .line 6 */
		 v0 = 		 (( org.apache.log4j.Category ) p0 ).isDebugEnabled ( ); // invoke-virtual {p0}, Lorg/apache/log4j/Category;->isDebugEnabled()Z
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 /* .line 7 */
			 /* new-instance v0, Ljava/lang/StringBuffer; */
			 /* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
			 (( java.lang.StringBuffer ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
			 final String p1 = "."; // const-string p1, "."
			 (( java.lang.StringBuffer ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
			 (( java.lang.StringBuffer ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
			 final String p1 = " ENTRY "; // const-string p1, " ENTRY "
			 (( java.lang.StringBuffer ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
			 (( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
			 /* if-nez p3, :cond_0 */
			 /* .line 8 */
			 /* new-instance p2, Ljava/lang/StringBuffer; */
			 /* invoke-direct {p2}, Ljava/lang/StringBuffer;-><init>()V */
			 (( java.lang.StringBuffer ) p2 ).append ( p1 ); // invoke-virtual {p2, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
			 final String p1 = "null"; // const-string p1, "null"
			 (( java.lang.StringBuffer ) p2 ).append ( p1 ); // invoke-virtual {p2, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
			 (( java.lang.StringBuffer ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
		 } // :goto_0
		 /* move-object v4, p1 */
		 /* .line 9 */
	 } // :cond_0
	 try { // :try_start_0
		 /* new-instance p2, Ljava/lang/StringBuffer; */
		 /* invoke-direct {p2}, Ljava/lang/StringBuffer;-><init>()V */
		 (( java.lang.StringBuffer ) p2 ).append ( p1 ); // invoke-virtual {p2, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 (( java.lang.StringBuffer ) p2 ).append ( p3 ); // invoke-virtual {p2, p3}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;
		 (( java.lang.StringBuffer ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
		 /* :try_end_0 */
		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
		 /* .line 10 */
		 /* :catchall_0 */
		 /* new-instance p2, Ljava/lang/StringBuffer; */
		 /* invoke-direct {p2}, Ljava/lang/StringBuffer;-><init>()V */
		 (( java.lang.StringBuffer ) p2 ).append ( p1 ); // invoke-virtual {p2, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 final String p1 = "?"; // const-string p1, "?"
		 (( java.lang.StringBuffer ) p2 ).append ( p1 ); // invoke-virtual {p2, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 (( java.lang.StringBuffer ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
		 /* .line 11 */
	 } // :goto_1
	 /* new-instance p1, Lorg/apache/log4j/spi/LoggingEvent; */
	 v1 = org.apache.log4j.LogXF.b;
	 v3 = org.apache.log4j.Level.DEBUG;
	 int v5 = 0; // const/4 v5, 0x0
	 /* move-object v0, p1 */
	 /* move-object v2, p0 */
	 /* invoke-direct/range {v0 ..v5}, Lorg/apache/log4j/spi/LoggingEvent;-><init>(Ljava/lang/String;Lorg/apache/log4j/Category;Lorg/apache/log4j/Priority;Ljava/lang/Object;Ljava/lang/Throwable;)V */
	 (( org.apache.log4j.Category ) p0 ).callAppenders ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/log4j/Category;->callAppenders(Lorg/apache/log4j/spi/LoggingEvent;)V
} // :cond_1
return;
} // .end method
public static void entering ( org.apache.log4j.Logger p0, java.lang.String p1, java.lang.String p2, java.lang.String p3 ) {
/* .locals 7 */
/* .line 3 */
v0 = (( org.apache.log4j.Category ) p0 ).isDebugEnabled ( ); // invoke-virtual {p0}, Lorg/apache/log4j/Category;->isDebugEnabled()Z
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 4 */
	 /* new-instance v0, Ljava/lang/StringBuffer; */
	 /* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
	 (( java.lang.StringBuffer ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 final String p1 = "."; // const-string p1, "."
	 (( java.lang.StringBuffer ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 (( java.lang.StringBuffer ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 final String p1 = " ENTRY "; // const-string p1, " ENTRY "
	 (( java.lang.StringBuffer ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 (( java.lang.StringBuffer ) v0 ).append ( p3 ); // invoke-virtual {v0, p3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 (( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
	 /* .line 5 */
	 /* new-instance p1, Lorg/apache/log4j/spi/LoggingEvent; */
	 v2 = org.apache.log4j.LogXF.b;
	 v4 = org.apache.log4j.Level.DEBUG;
	 int v6 = 0; // const/4 v6, 0x0
	 /* move-object v1, p1 */
	 /* move-object v3, p0 */
	 /* invoke-direct/range {v1 ..v6}, Lorg/apache/log4j/spi/LoggingEvent;-><init>(Ljava/lang/String;Lorg/apache/log4j/Category;Lorg/apache/log4j/Priority;Ljava/lang/Object;Ljava/lang/Throwable;)V */
	 (( org.apache.log4j.Category ) p0 ).callAppenders ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/log4j/Category;->callAppenders(Lorg/apache/log4j/spi/LoggingEvent;)V
} // :cond_0
return;
} // .end method
public static void entering ( org.apache.log4j.Logger p0, java.lang.String p1, java.lang.String p2, java.lang.Object[] p3 ) {
/* .locals 6 */
/* .line 12 */
v0 = (( org.apache.log4j.Category ) p0 ).isDebugEnabled ( ); // invoke-virtual {p0}, Lorg/apache/log4j/Category;->isDebugEnabled()Z
if ( v0 != null) { // if-eqz v0, :cond_2
	 /* .line 13 */
	 /* new-instance v0, Ljava/lang/StringBuffer; */
	 /* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
	 (( java.lang.StringBuffer ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 final String p1 = "."; // const-string p1, "."
	 (( java.lang.StringBuffer ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 (( java.lang.StringBuffer ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 final String p1 = " ENTRY "; // const-string p1, " ENTRY "
	 (( java.lang.StringBuffer ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
	 (( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
	 if ( p3 != null) { // if-eqz p3, :cond_1
		 /* .line 14 */
		 /* array-length p2, p3 */
		 /* if-lez p2, :cond_1 */
		 int p2 = 0; // const/4 p2, 0x0
		 final String v0 = "{"; // const-string v0, "{"
		 /* .line 15 */
	 } // :goto_0
	 /* array-length v1, p3 */
	 /* if-ge p2, v1, :cond_0 */
	 /* .line 16 */
	 try { // :try_start_0
		 /* new-instance v1, Ljava/lang/StringBuffer; */
		 /* invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V */
		 (( java.lang.StringBuffer ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 (( java.lang.StringBuffer ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 /* aget-object v2, p3, p2 */
		 (( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;
		 (( java.lang.StringBuffer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
		 /* :try_end_0 */
		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
		 /* .line 17 */
		 /* :catchall_0 */
		 /* new-instance v1, Ljava/lang/StringBuffer; */
		 /* invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V */
		 (( java.lang.StringBuffer ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 (( java.lang.StringBuffer ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 final String p1 = "?"; // const-string p1, "?"
		 (( java.lang.StringBuffer ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 (( java.lang.StringBuffer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
	 } // :goto_1
	 /* add-int/lit8 p2, p2, 0x1 */
	 final String v0 = ","; // const-string v0, ","
	 /* .line 18 */
} // :cond_0
/* new-instance p2, Ljava/lang/StringBuffer; */
/* invoke-direct {p2}, Ljava/lang/StringBuffer;-><init>()V */
(( java.lang.StringBuffer ) p2 ).append ( p1 ); // invoke-virtual {p2, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String p1 = "}"; // const-string p1, "}"
(( java.lang.StringBuffer ) p2 ).append ( p1 ); // invoke-virtual {p2, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
/* .line 19 */
} // :cond_1
/* new-instance p2, Ljava/lang/StringBuffer; */
/* invoke-direct {p2}, Ljava/lang/StringBuffer;-><init>()V */
(( java.lang.StringBuffer ) p2 ).append ( p1 ); // invoke-virtual {p2, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String p1 = "{}"; // const-string p1, "{}"
(( java.lang.StringBuffer ) p2 ).append ( p1 ); // invoke-virtual {p2, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
} // :goto_2
/* move-object v4, p1 */
/* .line 20 */
/* new-instance p1, Lorg/apache/log4j/spi/LoggingEvent; */
v1 = org.apache.log4j.LogXF.b;
v3 = org.apache.log4j.Level.DEBUG;
int v5 = 0; // const/4 v5, 0x0
/* move-object v0, p1 */
/* move-object v2, p0 */
/* invoke-direct/range {v0 ..v5}, Lorg/apache/log4j/spi/LoggingEvent;-><init>(Ljava/lang/String;Lorg/apache/log4j/Category;Lorg/apache/log4j/Priority;Ljava/lang/Object;Ljava/lang/Throwable;)V */
(( org.apache.log4j.Category ) p0 ).callAppenders ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/log4j/Category;->callAppenders(Lorg/apache/log4j/spi/LoggingEvent;)V
} // :cond_2
return;
} // .end method
public static void exiting ( org.apache.log4j.Logger p0, java.lang.String p1, java.lang.String p2 ) {
/* .locals 7 */
/* .line 1 */
v0 = (( org.apache.log4j.Category ) p0 ).isDebugEnabled ( ); // invoke-virtual {p0}, Lorg/apache/log4j/Category;->isDebugEnabled()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
/* new-instance v0, Lorg/apache/log4j/spi/LoggingEvent; */
v2 = org.apache.log4j.LogXF.b;
v4 = org.apache.log4j.Level.DEBUG;
/* new-instance v1, Ljava/lang/StringBuffer; */
/* invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V */
(( java.lang.StringBuffer ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String p1 = "."; // const-string p1, "."
(( java.lang.StringBuffer ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String p1 = " RETURN"; // const-string p1, " RETURN"
(( java.lang.StringBuffer ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
int v6 = 0; // const/4 v6, 0x0
/* move-object v1, v0 */
/* move-object v3, p0 */
/* invoke-direct/range {v1 ..v6}, Lorg/apache/log4j/spi/LoggingEvent;-><init>(Ljava/lang/String;Lorg/apache/log4j/Category;Lorg/apache/log4j/Priority;Ljava/lang/Object;Ljava/lang/Throwable;)V */
(( org.apache.log4j.Category ) p0 ).callAppenders ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/log4j/Category;->callAppenders(Lorg/apache/log4j/spi/LoggingEvent;)V
} // :cond_0
return;
} // .end method
public static void exiting ( org.apache.log4j.Logger p0, java.lang.String p1, java.lang.String p2, java.lang.Object p3 ) {
/* .locals 6 */
/* .line 5 */
v0 = (( org.apache.log4j.Category ) p0 ).isDebugEnabled ( ); // invoke-virtual {p0}, Lorg/apache/log4j/Category;->isDebugEnabled()Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 6 */
/* new-instance v0, Ljava/lang/StringBuffer; */
/* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
(( java.lang.StringBuffer ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String p1 = "."; // const-string p1, "."
(( java.lang.StringBuffer ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String p1 = " RETURN "; // const-string p1, " RETURN "
(( java.lang.StringBuffer ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
/* if-nez p3, :cond_0 */
/* .line 7 */
/* new-instance p2, Ljava/lang/StringBuffer; */
/* invoke-direct {p2}, Ljava/lang/StringBuffer;-><init>()V */
(( java.lang.StringBuffer ) p2 ).append ( p1 ); // invoke-virtual {p2, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String p1 = "null"; // const-string p1, "null"
(( java.lang.StringBuffer ) p2 ).append ( p1 ); // invoke-virtual {p2, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
} // :goto_0
/* move-object v4, p1 */
/* .line 8 */
} // :cond_0
try { // :try_start_0
/* new-instance p2, Ljava/lang/StringBuffer; */
/* invoke-direct {p2}, Ljava/lang/StringBuffer;-><init>()V */
(( java.lang.StringBuffer ) p2 ).append ( p1 ); // invoke-virtual {p2, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) p2 ).append ( p3 ); // invoke-virtual {p2, p3}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 9 */
/* :catchall_0 */
/* new-instance p2, Ljava/lang/StringBuffer; */
/* invoke-direct {p2}, Ljava/lang/StringBuffer;-><init>()V */
(( java.lang.StringBuffer ) p2 ).append ( p1 ); // invoke-virtual {p2, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String p1 = "?"; // const-string p1, "?"
(( java.lang.StringBuffer ) p2 ).append ( p1 ); // invoke-virtual {p2, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
/* .line 10 */
} // :goto_1
/* new-instance p1, Lorg/apache/log4j/spi/LoggingEvent; */
v1 = org.apache.log4j.LogXF.b;
v3 = org.apache.log4j.Level.DEBUG;
int v5 = 0; // const/4 v5, 0x0
/* move-object v0, p1 */
/* move-object v2, p0 */
/* invoke-direct/range {v0 ..v5}, Lorg/apache/log4j/spi/LoggingEvent;-><init>(Ljava/lang/String;Lorg/apache/log4j/Category;Lorg/apache/log4j/Priority;Ljava/lang/Object;Ljava/lang/Throwable;)V */
(( org.apache.log4j.Category ) p0 ).callAppenders ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/log4j/Category;->callAppenders(Lorg/apache/log4j/spi/LoggingEvent;)V
} // :cond_1
return;
} // .end method
public static void exiting ( org.apache.log4j.Logger p0, java.lang.String p1, java.lang.String p2, java.lang.String p3 ) {
/* .locals 7 */
/* .line 3 */
v0 = (( org.apache.log4j.Category ) p0 ).isDebugEnabled ( ); // invoke-virtual {p0}, Lorg/apache/log4j/Category;->isDebugEnabled()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 4 */
/* new-instance v0, Lorg/apache/log4j/spi/LoggingEvent; */
v2 = org.apache.log4j.LogXF.b;
v4 = org.apache.log4j.Level.DEBUG;
/* new-instance v1, Ljava/lang/StringBuffer; */
/* invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V */
(( java.lang.StringBuffer ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String p1 = "."; // const-string p1, "."
(( java.lang.StringBuffer ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String p1 = " RETURN "; // const-string p1, " RETURN "
(( java.lang.StringBuffer ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).append ( p3 ); // invoke-virtual {v1, p3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
int v6 = 0; // const/4 v6, 0x0
/* move-object v1, v0 */
/* move-object v3, p0 */
/* invoke-direct/range {v1 ..v6}, Lorg/apache/log4j/spi/LoggingEvent;-><init>(Ljava/lang/String;Lorg/apache/log4j/Category;Lorg/apache/log4j/Priority;Ljava/lang/Object;Ljava/lang/Throwable;)V */
(( org.apache.log4j.Category ) p0 ).callAppenders ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/log4j/Category;->callAppenders(Lorg/apache/log4j/spi/LoggingEvent;)V
} // :cond_0
return;
} // .end method
public static void throwing ( org.apache.log4j.Logger p0, java.lang.String p1, java.lang.String p2, java.lang.Throwable p3 ) {
/* .locals 7 */
/* .line 1 */
v0 = (( org.apache.log4j.Category ) p0 ).isDebugEnabled ( ); // invoke-virtual {p0}, Lorg/apache/log4j/Category;->isDebugEnabled()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
/* new-instance v0, Lorg/apache/log4j/spi/LoggingEvent; */
v2 = org.apache.log4j.LogXF.b;
v4 = org.apache.log4j.Level.DEBUG;
/* new-instance v1, Ljava/lang/StringBuffer; */
/* invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V */
(( java.lang.StringBuffer ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String p1 = "."; // const-string p1, "."
(( java.lang.StringBuffer ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String p1 = " THROW"; // const-string p1, " THROW"
(( java.lang.StringBuffer ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
/* move-object v1, v0 */
/* move-object v3, p0 */
/* move-object v6, p3 */
/* invoke-direct/range {v1 ..v6}, Lorg/apache/log4j/spi/LoggingEvent;-><init>(Ljava/lang/String;Lorg/apache/log4j/Category;Lorg/apache/log4j/Priority;Ljava/lang/Object;Ljava/lang/Throwable;)V */
(( org.apache.log4j.Category ) p0 ).callAppenders ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/log4j/Category;->callAppenders(Lorg/apache/log4j/spi/LoggingEvent;)V
} // :cond_0
return;
} // .end method
