public class org.apache.log4j.lf5.viewer.LogTableColumn implements java.io.Serializable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # static fields */
	 public static final org.apache.log4j.lf5.viewer.LogTableColumn CATEGORY;
	 public static final org.apache.log4j.lf5.viewer.LogTableColumn DATE;
	 public static final org.apache.log4j.lf5.viewer.LogTableColumn LEVEL;
	 public static final org.apache.log4j.lf5.viewer.LogTableColumn LOCATION;
	 public static final org.apache.log4j.lf5.viewer.LogTableColumn MESSAGE;
	 public static final org.apache.log4j.lf5.viewer.LogTableColumn MESSAGE_NUM;
	 public static final org.apache.log4j.lf5.viewer.LogTableColumn NDC;
	 public static final org.apache.log4j.lf5.viewer.LogTableColumn THREAD;
	 public static final org.apache.log4j.lf5.viewer.LogTableColumn THROWN;
	 public static org.apache.log4j.lf5.viewer.LogTableColumn c;
	 public static java.util.Map d;
	 /* # instance fields */
	 public java.lang.String b;
	 /* # direct methods */
	 public static org.apache.log4j.lf5.viewer.LogTableColumn ( ) {
		 /* .locals 5 */
		 /* .line 1 */
		 /* new-instance v0, Lorg/apache/log4j/lf5/viewer/LogTableColumn; */
		 final String v1 = "Date"; // const-string v1, "Date"
		 /* invoke-direct {v0, v1}, Lorg/apache/log4j/lf5/viewer/LogTableColumn;-><init>(Ljava/lang/String;)V */
		 /* .line 2 */
		 /* new-instance v0, Lorg/apache/log4j/lf5/viewer/LogTableColumn; */
		 final String v1 = "Thread"; // const-string v1, "Thread"
		 /* invoke-direct {v0, v1}, Lorg/apache/log4j/lf5/viewer/LogTableColumn;-><init>(Ljava/lang/String;)V */
		 /* .line 3 */
		 /* new-instance v0, Lorg/apache/log4j/lf5/viewer/LogTableColumn; */
		 final String v1 = "Message #"; // const-string v1, "Message #"
		 /* invoke-direct {v0, v1}, Lorg/apache/log4j/lf5/viewer/LogTableColumn;-><init>(Ljava/lang/String;)V */
		 /* .line 4 */
		 /* new-instance v0, Lorg/apache/log4j/lf5/viewer/LogTableColumn; */
		 final String v1 = "Level"; // const-string v1, "Level"
		 /* invoke-direct {v0, v1}, Lorg/apache/log4j/lf5/viewer/LogTableColumn;-><init>(Ljava/lang/String;)V */
		 /* .line 5 */
		 /* new-instance v0, Lorg/apache/log4j/lf5/viewer/LogTableColumn; */
		 final String v1 = "NDC"; // const-string v1, "NDC"
		 /* invoke-direct {v0, v1}, Lorg/apache/log4j/lf5/viewer/LogTableColumn;-><init>(Ljava/lang/String;)V */
		 /* .line 6 */
		 /* new-instance v0, Lorg/apache/log4j/lf5/viewer/LogTableColumn; */
		 final String v1 = "Category"; // const-string v1, "Category"
		 /* invoke-direct {v0, v1}, Lorg/apache/log4j/lf5/viewer/LogTableColumn;-><init>(Ljava/lang/String;)V */
		 /* .line 7 */
		 /* new-instance v0, Lorg/apache/log4j/lf5/viewer/LogTableColumn; */
		 final String v1 = "Message"; // const-string v1, "Message"
		 /* invoke-direct {v0, v1}, Lorg/apache/log4j/lf5/viewer/LogTableColumn;-><init>(Ljava/lang/String;)V */
		 /* .line 8 */
		 /* new-instance v0, Lorg/apache/log4j/lf5/viewer/LogTableColumn; */
		 final String v1 = "Location"; // const-string v1, "Location"
		 /* invoke-direct {v0, v1}, Lorg/apache/log4j/lf5/viewer/LogTableColumn;-><init>(Ljava/lang/String;)V */
		 /* .line 9 */
		 /* new-instance v0, Lorg/apache/log4j/lf5/viewer/LogTableColumn; */
		 final String v1 = "Thrown"; // const-string v1, "Thrown"
		 /* invoke-direct {v0, v1}, Lorg/apache/log4j/lf5/viewer/LogTableColumn;-><init>(Ljava/lang/String;)V */
		 /* const/16 v1, 0x9 */
		 /* new-array v1, v1, [Lorg/apache/log4j/lf5/viewer/LogTableColumn; */
		 /* .line 10 */
		 v2 = org.apache.log4j.lf5.viewer.LogTableColumn.DATE;
		 int v3 = 0; // const/4 v3, 0x0
		 /* aput-object v2, v1, v3 */
		 v2 = org.apache.log4j.lf5.viewer.LogTableColumn.THREAD;
		 int v4 = 1; // const/4 v4, 0x1
		 /* aput-object v2, v1, v4 */
		 v2 = org.apache.log4j.lf5.viewer.LogTableColumn.MESSAGE_NUM;
		 int v4 = 2; // const/4 v4, 0x2
		 /* aput-object v2, v1, v4 */
		 v2 = org.apache.log4j.lf5.viewer.LogTableColumn.LEVEL;
		 int v4 = 3; // const/4 v4, 0x3
		 /* aput-object v2, v1, v4 */
		 v2 = org.apache.log4j.lf5.viewer.LogTableColumn.NDC;
		 int v4 = 4; // const/4 v4, 0x4
		 /* aput-object v2, v1, v4 */
		 v2 = org.apache.log4j.lf5.viewer.LogTableColumn.CATEGORY;
		 int v4 = 5; // const/4 v4, 0x5
		 /* aput-object v2, v1, v4 */
		 v2 = org.apache.log4j.lf5.viewer.LogTableColumn.MESSAGE;
		 int v4 = 6; // const/4 v4, 0x6
		 /* aput-object v2, v1, v4 */
		 v2 = org.apache.log4j.lf5.viewer.LogTableColumn.LOCATION;
		 int v4 = 7; // const/4 v4, 0x7
		 /* aput-object v2, v1, v4 */
		 /* const/16 v2, 0x8 */
		 /* aput-object v0, v1, v2 */
		 /* .line 11 */
		 /* new-instance v0, Ljava/util/HashMap; */
		 /* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
		 /* .line 12 */
	 } // :goto_0
	 v0 = org.apache.log4j.lf5.viewer.LogTableColumn.c;
	 /* array-length v1, v0 */
	 /* if-ge v3, v1, :cond_0 */
	 /* .line 13 */
	 v1 = org.apache.log4j.lf5.viewer.LogTableColumn.d;
	 /* aget-object v0, v0, v3 */
	 (( org.apache.log4j.lf5.viewer.LogTableColumn ) v0 ).getLabel ( ); // invoke-virtual {v0}, Lorg/apache/log4j/lf5/viewer/LogTableColumn;->getLabel()Ljava/lang/String;
	 v2 = org.apache.log4j.lf5.viewer.LogTableColumn.c;
	 /* aget-object v2, v2, v3 */
	 /* add-int/lit8 v3, v3, 0x1 */
} // :cond_0
return;
} // .end method
public org.apache.log4j.lf5.viewer.LogTableColumn ( ) {
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
this.b = p1;
return;
} // .end method
public static org.apache.log4j.lf5.viewer.LogTableColumn getLogTableColumnArray ( ) {
/* .locals 1 */
/* .line 1 */
v0 = org.apache.log4j.lf5.viewer.LogTableColumn.c;
} // .end method
public static java.util.List getLogTableColumns ( ) {
/* .locals 1 */
/* .line 1 */
v0 = org.apache.log4j.lf5.viewer.LogTableColumn.c;
java.util.Arrays .asList ( v0 );
} // .end method
public static org.apache.log4j.lf5.viewer.LogTableColumn valueOf ( java.lang.String p0 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/apache/log4j/lf5/viewer/LogTableColumnFormatException; */
/* } */
} // .end annotation
if ( p0 != null) { // if-eqz p0, :cond_0
/* .line 1 */
(( java.lang.String ) p0 ).trim ( ); // invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;
/* .line 2 */
v0 = org.apache.log4j.lf5.viewer.LogTableColumn.d;
/* check-cast v0, Lorg/apache/log4j/lf5/viewer/LogTableColumn; */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 3 */
} // :cond_1
/* new-instance v0, Ljava/lang/StringBuffer; */
/* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
/* .line 4 */
/* new-instance v1, Ljava/lang/StringBuffer; */
/* invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V */
final String v2 = "Error while trying to parse ("; // const-string v2, "Error while trying to parse ("
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String p0 = ") into"; // const-string p0, ") into"
(( java.lang.StringBuffer ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
(( java.lang.StringBuffer ) v0 ).append ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String p0 = " a LogTableColumn."; // const-string p0, " a LogTableColumn."
/* .line 5 */
(( java.lang.StringBuffer ) v0 ).append ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 6 */
/* new-instance p0, Lorg/apache/log4j/lf5/viewer/LogTableColumnFormatException; */
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
/* invoke-direct {p0, v0}, Lorg/apache/log4j/lf5/viewer/LogTableColumnFormatException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
} // .end method
/* # virtual methods */
public Boolean equals ( java.lang.Object p0 ) {
/* .locals 1 */
/* .line 1 */
/* instance-of v0, p1, Lorg/apache/log4j/lf5/viewer/LogTableColumn; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( org.apache.log4j.lf5.viewer.LogTableColumn ) p0 ).getLabel ( ); // invoke-virtual {p0}, Lorg/apache/log4j/lf5/viewer/LogTableColumn;->getLabel()Ljava/lang/String;
/* check-cast p1, Lorg/apache/log4j/lf5/viewer/LogTableColumn; */
(( org.apache.log4j.lf5.viewer.LogTableColumn ) p1 ).getLabel ( ); // invoke-virtual {p1}, Lorg/apache/log4j/lf5/viewer/LogTableColumn;->getLabel()Ljava/lang/String;
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
public java.lang.String toString ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
} // .end method
