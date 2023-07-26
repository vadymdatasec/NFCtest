public class org.apache.log4j.lf5.LogLevel implements java.io.Serializable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # static fields */
	 public static final org.apache.log4j.lf5.LogLevel CONFIG;
	 public static final org.apache.log4j.lf5.LogLevel DEBUG;
	 public static final org.apache.log4j.lf5.LogLevel ERROR;
	 public static final org.apache.log4j.lf5.LogLevel FATAL;
	 public static final org.apache.log4j.lf5.LogLevel FINE;
	 public static final org.apache.log4j.lf5.LogLevel FINER;
	 public static final org.apache.log4j.lf5.LogLevel FINEST;
	 public static final org.apache.log4j.lf5.LogLevel INFO;
	 public static final org.apache.log4j.lf5.LogLevel SEVERE;
	 public static final org.apache.log4j.lf5.LogLevel WARN;
	 public static final org.apache.log4j.lf5.LogLevel WARNING;
	 public static org.apache.log4j.lf5.LogLevel d;
	 public static org.apache.log4j.lf5.LogLevel e;
	 public static org.apache.log4j.lf5.LogLevel f;
	 public static java.util.Map g;
	 public static java.util.Map h;
	 public static java.util.Map i;
	 /* # instance fields */
	 public java.lang.String b;
	 public Integer c;
	 /* # direct methods */
	 public static org.apache.log4j.lf5.LogLevel ( ) {
		 /* .locals 20 */
		 /* .line 1 */
		 /* new-instance v0, Lorg/apache/log4j/lf5/LogLevel; */
		 int v1 = 0; // const/4 v1, 0x0
		 final String v2 = "FATAL"; // const-string v2, "FATAL"
		 /* invoke-direct {v0, v2, v1}, Lorg/apache/log4j/lf5/LogLevel;-><init>(Ljava/lang/String;I)V */
		 /* .line 2 */
		 /* new-instance v0, Lorg/apache/log4j/lf5/LogLevel; */
		 int v2 = 1; // const/4 v2, 0x1
		 final String v3 = "ERROR"; // const-string v3, "ERROR"
		 /* invoke-direct {v0, v3, v2}, Lorg/apache/log4j/lf5/LogLevel;-><init>(Ljava/lang/String;I)V */
		 /* .line 3 */
		 /* new-instance v0, Lorg/apache/log4j/lf5/LogLevel; */
		 int v3 = 2; // const/4 v3, 0x2
		 final String v4 = "WARN"; // const-string v4, "WARN"
		 /* invoke-direct {v0, v4, v3}, Lorg/apache/log4j/lf5/LogLevel;-><init>(Ljava/lang/String;I)V */
		 /* .line 4 */
		 /* new-instance v0, Lorg/apache/log4j/lf5/LogLevel; */
		 int v4 = 3; // const/4 v4, 0x3
		 final String v5 = "INFO"; // const-string v5, "INFO"
		 /* invoke-direct {v0, v5, v4}, Lorg/apache/log4j/lf5/LogLevel;-><init>(Ljava/lang/String;I)V */
		 /* .line 5 */
		 /* new-instance v0, Lorg/apache/log4j/lf5/LogLevel; */
		 int v5 = 4; // const/4 v5, 0x4
		 final String v6 = "DEBUG"; // const-string v6, "DEBUG"
		 /* invoke-direct {v0, v6, v5}, Lorg/apache/log4j/lf5/LogLevel;-><init>(Ljava/lang/String;I)V */
		 /* .line 6 */
		 /* new-instance v0, Lorg/apache/log4j/lf5/LogLevel; */
		 final String v6 = "SEVERE"; // const-string v6, "SEVERE"
		 /* invoke-direct {v0, v6, v2}, Lorg/apache/log4j/lf5/LogLevel;-><init>(Ljava/lang/String;I)V */
		 /* .line 7 */
		 /* new-instance v0, Lorg/apache/log4j/lf5/LogLevel; */
		 final String v6 = "WARNING"; // const-string v6, "WARNING"
		 /* invoke-direct {v0, v6, v3}, Lorg/apache/log4j/lf5/LogLevel;-><init>(Ljava/lang/String;I)V */
		 /* .line 8 */
		 /* new-instance v0, Lorg/apache/log4j/lf5/LogLevel; */
		 final String v6 = "CONFIG"; // const-string v6, "CONFIG"
		 /* invoke-direct {v0, v6, v5}, Lorg/apache/log4j/lf5/LogLevel;-><init>(Ljava/lang/String;I)V */
		 /* .line 9 */
		 /* new-instance v0, Lorg/apache/log4j/lf5/LogLevel; */
		 int v6 = 5; // const/4 v6, 0x5
		 final String v7 = "FINE"; // const-string v7, "FINE"
		 /* invoke-direct {v0, v7, v6}, Lorg/apache/log4j/lf5/LogLevel;-><init>(Ljava/lang/String;I)V */
		 /* .line 10 */
		 /* new-instance v0, Lorg/apache/log4j/lf5/LogLevel; */
		 int v7 = 6; // const/4 v7, 0x6
		 final String v8 = "FINER"; // const-string v8, "FINER"
		 /* invoke-direct {v0, v8, v7}, Lorg/apache/log4j/lf5/LogLevel;-><init>(Ljava/lang/String;I)V */
		 /* .line 11 */
		 /* new-instance v0, Lorg/apache/log4j/lf5/LogLevel; */
		 int v8 = 7; // const/4 v8, 0x7
		 final String v9 = "FINEST"; // const-string v9, "FINEST"
		 /* invoke-direct {v0, v9, v8}, Lorg/apache/log4j/lf5/LogLevel;-><init>(Ljava/lang/String;I)V */
		 /* .line 12 */
		 /* new-instance v0, Ljava/util/HashMap; */
		 /* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
		 /* new-array v0, v6, [Lorg/apache/log4j/lf5/LogLevel; */
		 /* .line 13 */
		 v9 = org.apache.log4j.lf5.LogLevel.FATAL;
		 /* aput-object v9, v0, v1 */
		 v10 = org.apache.log4j.lf5.LogLevel.ERROR;
		 /* aput-object v10, v0, v2 */
		 v11 = org.apache.log4j.lf5.LogLevel.WARN;
		 /* aput-object v11, v0, v3 */
		 v12 = org.apache.log4j.lf5.LogLevel.INFO;
		 /* aput-object v12, v0, v4 */
		 v13 = org.apache.log4j.lf5.LogLevel.DEBUG;
		 /* aput-object v13, v0, v5 */
		 /* new-array v0, v8, [Lorg/apache/log4j/lf5/LogLevel; */
		 /* .line 14 */
		 v14 = org.apache.log4j.lf5.LogLevel.SEVERE;
		 /* aput-object v14, v0, v1 */
		 v15 = org.apache.log4j.lf5.LogLevel.WARNING;
		 /* aput-object v15, v0, v2 */
		 /* aput-object v12, v0, v3 */
		 v16 = org.apache.log4j.lf5.LogLevel.CONFIG;
		 /* aput-object v16, v0, v4 */
		 v17 = org.apache.log4j.lf5.LogLevel.FINE;
		 /* aput-object v17, v0, v5 */
		 v18 = org.apache.log4j.lf5.LogLevel.FINER;
		 /* aput-object v18, v0, v6 */
		 v19 = org.apache.log4j.lf5.LogLevel.FINEST;
		 /* aput-object v19, v0, v7 */
		 /* const/16 v0, 0xb */
		 /* new-array v0, v0, [Lorg/apache/log4j/lf5/LogLevel; */
		 /* aput-object v9, v0, v1 */
		 /* aput-object v10, v0, v2 */
		 /* aput-object v11, v0, v3 */
		 /* aput-object v12, v0, v4 */
		 /* aput-object v13, v0, v5 */
		 /* aput-object v14, v0, v6 */
		 /* aput-object v15, v0, v7 */
		 /* aput-object v16, v0, v8 */
		 /* const/16 v2, 0x8 */
		 /* aput-object v17, v0, v2 */
		 /* const/16 v2, 0x9 */
		 /* aput-object v18, v0, v2 */
		 /* const/16 v2, 0xa */
		 /* aput-object v19, v0, v2 */
		 /* .line 15 */
		 /* .line 16 */
		 /* new-instance v0, Ljava/util/HashMap; */
		 /* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 17 */
	 } // :goto_0
	 v2 = org.apache.log4j.lf5.LogLevel.f;
	 /* array-length v3, v2 */
	 /* if-ge v0, v3, :cond_0 */
	 /* .line 18 */
	 v3 = org.apache.log4j.lf5.LogLevel.g;
	 /* aget-object v2, v2, v0 */
	 (( org.apache.log4j.lf5.LogLevel ) v2 ).getLabel ( ); // invoke-virtual {v2}, Lorg/apache/log4j/lf5/LogLevel;->getLabel()Ljava/lang/String;
	 v4 = org.apache.log4j.lf5.LogLevel.f;
	 /* aget-object v4, v4, v0 */
	 /* add-int/lit8 v0, v0, 0x1 */
	 /* .line 19 */
} // :cond_0
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
/* .line 20 */
} // :goto_1
v0 = org.apache.log4j.lf5.LogLevel.f;
/* array-length v2, v0 */
/* if-ge v1, v2, :cond_1 */
/* .line 21 */
v2 = org.apache.log4j.lf5.LogLevel.h;
/* aget-object v0, v0, v1 */
v3 = java.awt.Color.black;
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_1
return;
} // .end method
public org.apache.log4j.lf5.LogLevel ( ) {
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
this.b = p1;
/* .line 3 */
/* iput p2, p0, Lorg/apache/log4j/lf5/LogLevel;->c:I */
return;
} // .end method
public static java.util.List getAllDefaultLevels ( ) {
/* .locals 1 */
/* .line 1 */
v0 = org.apache.log4j.lf5.LogLevel.f;
java.util.Arrays .asList ( v0 );
} // .end method
public static java.util.List getJdk14Levels ( ) {
/* .locals 1 */
/* .line 1 */
v0 = org.apache.log4j.lf5.LogLevel.e;
java.util.Arrays .asList ( v0 );
} // .end method
public static java.util.List getLog4JLevels ( ) {
/* .locals 1 */
/* .line 1 */
v0 = org.apache.log4j.lf5.LogLevel.d;
java.util.Arrays .asList ( v0 );
} // .end method
public static java.util.Map getLogLevelColorMap ( ) {
/* .locals 1 */
/* .line 1 */
v0 = org.apache.log4j.lf5.LogLevel.h;
} // .end method
public static org.apache.log4j.lf5.LogLevel register ( org.apache.log4j.lf5.LogLevel p0 ) {
/* .locals 3 */
int v0 = 0; // const/4 v0, 0x0
/* if-nez p0, :cond_0 */
/* .line 1 */
} // :cond_0
v1 = org.apache.log4j.lf5.LogLevel.g;
(( org.apache.log4j.lf5.LogLevel ) p0 ).getLabel ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/LogLevel;->getLabel()Ljava/lang/String;
/* if-nez v1, :cond_1 */
/* .line 2 */
v0 = org.apache.log4j.lf5.LogLevel.i;
(( org.apache.log4j.lf5.LogLevel ) p0 ).getLabel ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/LogLevel;->getLabel()Ljava/lang/String;
/* check-cast p0, Lorg/apache/log4j/lf5/LogLevel; */
} // :cond_1
} // .end method
public static void register ( java.util.List p0 ) {
/* .locals 1 */
if ( p0 != null) { // if-eqz p0, :cond_0
/* .line 5 */
/* .line 6 */
v0 = } // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 7 */
/* check-cast v0, Lorg/apache/log4j/lf5/LogLevel; */
org.apache.log4j.lf5.LogLevel .register ( v0 );
} // :cond_0
return;
} // .end method
public static void register ( org.apache.log4j.lf5.LogLevel[] p0 ) {
/* .locals 2 */
if ( p0 != null) { // if-eqz p0, :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 3 */
} // :goto_0
/* array-length v1, p0 */
/* if-ge v0, v1, :cond_0 */
/* .line 4 */
/* aget-object v1, p0, v0 */
org.apache.log4j.lf5.LogLevel .register ( v1 );
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_0
return;
} // .end method
public static void resetLogLevelColorMap ( ) {
/* .locals 4 */
/* .line 1 */
v0 = org.apache.log4j.lf5.LogLevel.h;
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
} // :goto_0
v1 = org.apache.log4j.lf5.LogLevel.f;
/* array-length v2, v1 */
/* if-ge v0, v2, :cond_0 */
/* .line 3 */
v2 = org.apache.log4j.lf5.LogLevel.h;
/* aget-object v1, v1, v0 */
v3 = java.awt.Color.black;
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_0
return;
} // .end method
public static org.apache.log4j.lf5.LogLevel valueOf ( java.lang.String p0 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/apache/log4j/lf5/LogLevelFormatException; */
/* } */
} // .end annotation
if ( p0 != null) { // if-eqz p0, :cond_0
/* .line 1 */
(( java.lang.String ) p0 ).trim ( ); // invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;
(( java.lang.String ) p0 ).toUpperCase ( ); // invoke-virtual {p0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;
/* .line 2 */
v0 = org.apache.log4j.lf5.LogLevel.g;
/* check-cast v0, Lorg/apache/log4j/lf5/LogLevel; */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
/* if-nez v0, :cond_1 */
/* .line 3 */
v1 = v1 = org.apache.log4j.lf5.LogLevel.i;
/* if-lez v1, :cond_1 */
/* .line 4 */
v0 = org.apache.log4j.lf5.LogLevel.i;
/* check-cast v0, Lorg/apache/log4j/lf5/LogLevel; */
} // :cond_1
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 5 */
} // :cond_2
/* new-instance v0, Ljava/lang/StringBuffer; */
/* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
/* .line 6 */
/* new-instance v1, Ljava/lang/StringBuffer; */
/* invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V */
final String v2 = "Error while trying to parse ("; // const-string v2, "Error while trying to parse ("
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String p0 = ") into"; // const-string p0, ") into"
(( java.lang.StringBuffer ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
(( java.lang.StringBuffer ) v0 ).append ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String p0 = " a LogLevel."; // const-string p0, " a LogLevel."
/* .line 7 */
(( java.lang.StringBuffer ) v0 ).append ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 8 */
/* new-instance p0, Lorg/apache/log4j/lf5/LogLevelFormatException; */
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
/* invoke-direct {p0, v0}, Lorg/apache/log4j/lf5/LogLevelFormatException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
} // .end method
/* # virtual methods */
public Integer a ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Lorg/apache/log4j/lf5/LogLevel;->c:I */
} // .end method
public Boolean encompasses ( org.apache.log4j.lf5.LogLevel p0 ) {
/* .locals 1 */
/* .line 1 */
p1 = (( org.apache.log4j.lf5.LogLevel ) p1 ).a ( ); // invoke-virtual {p1}, Lorg/apache/log4j/lf5/LogLevel;->a()I
v0 = (( org.apache.log4j.lf5.LogLevel ) p0 ).a ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/LogLevel;->a()I
/* if-gt p1, v0, :cond_0 */
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // .end method
public Boolean equals ( java.lang.Object p0 ) {
/* .locals 1 */
/* .line 1 */
/* instance-of v0, p1, Lorg/apache/log4j/lf5/LogLevel; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
v0 = (( org.apache.log4j.lf5.LogLevel ) p0 ).a ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/LogLevel;->a()I
/* check-cast p1, Lorg/apache/log4j/lf5/LogLevel; */
p1 = (( org.apache.log4j.lf5.LogLevel ) p1 ).a ( ); // invoke-virtual {p1}, Lorg/apache/log4j/lf5/LogLevel;->a()I
/* if-ne v0, p1, :cond_0 */
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
public java.lang.String getLabel ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
} // .end method
public Integer hashCode ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
v0 = (( java.lang.String ) v0 ).hashCode ( ); // invoke-virtual {v0}, Ljava/lang/String;->hashCode()I
} // .end method
public void setLogLevelColorMap ( org.apache.log4j.lf5.LogLevel p0, java.awt.Color p1 ) {
/* .locals 1 */
/* .line 1 */
v0 = org.apache.log4j.lf5.LogLevel.h;
/* if-nez p2, :cond_0 */
/* .line 2 */
p2 = java.awt.Color.black;
/* .line 3 */
} // :cond_0
v0 = org.apache.log4j.lf5.LogLevel.h;
return;
} // .end method
public java.lang.String toString ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
} // .end method
