public class org.apache.log4j.NDC {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lorg/apache/log4j/NDC$a; */
	 /* } */
} // .end annotation
/* # static fields */
public static java.util.Hashtable a;
public static Integer b;
/* # direct methods */
public static org.apache.log4j.NDC ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 /* new-instance v0, Ljava/util/Hashtable; */
	 /* invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V */
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 2 */
	 return;
} // .end method
public static java.util.Stack a ( ) {
	 /* .locals 2 */
	 /* .line 1 */
	 v0 = org.apache.log4j.NDC.a;
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 2 */
		 java.lang.Thread .currentThread ( );
		 (( java.util.Hashtable ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;
		 /* check-cast v0, Ljava/util/Stack; */
	 } // :cond_0
	 int v0 = 0; // const/4 v0, 0x0
} // .end method
public static void b ( ) {
	 /* .locals 7 */
	 /* .line 1 */
	 v0 = org.apache.log4j.NDC.a;
	 /* if-nez v0, :cond_0 */
	 return;
	 /* .line 2 */
} // :cond_0
/* monitor-enter v0 */
/* .line 3 */
try { // :try_start_0
	 /* add-int/lit8 v1, v1, 0x1 */
	 int v2 = 5; // const/4 v2, 0x5
	 /* if-gt v1, v2, :cond_1 */
	 /* .line 4 */
	 /* monitor-exit v0 */
	 return;
} // :cond_1
int v1 = 0; // const/4 v1, 0x0
/* .line 5 */
/* .line 6 */
/* new-instance v2, Ljava/util/Vector; */
/* invoke-direct {v2}, Ljava/util/Vector;-><init>()V */
/* .line 7 */
v3 = org.apache.log4j.NDC.a;
(( java.util.Hashtable ) v3 ).keys ( ); // invoke-virtual {v3}, Ljava/util/Hashtable;->keys()Ljava/util/Enumeration;
} // :goto_0
int v4 = 0; // const/4 v4, 0x0
/* .line 8 */
v5 = } // :goto_1
if ( v5 != null) { // if-eqz v5, :cond_3
int v5 = 4; // const/4 v5, 0x4
/* if-gt v4, v5, :cond_3 */
/* .line 9 */
/* check-cast v5, Ljava/lang/Thread; */
/* .line 10 */
v6 = (( java.lang.Thread ) v5 ).isAlive ( ); // invoke-virtual {v5}, Ljava/lang/Thread;->isAlive()Z
if ( v6 != null) { // if-eqz v6, :cond_2
/* add-int/lit8 v4, v4, 0x1 */
/* .line 11 */
} // :cond_2
(( java.util.Vector ) v2 ).addElement ( v5 ); // invoke-virtual {v2, v5}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V
/* .line 12 */
} // :cond_3
/* monitor-exit v0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 13 */
v0 = (( java.util.Vector ) v2 ).size ( ); // invoke-virtual {v2}, Ljava/util/Vector;->size()I
} // :goto_2
/* if-ge v1, v0, :cond_4 */
/* .line 14 */
(( java.util.Vector ) v2 ).elementAt ( v1 ); // invoke-virtual {v2, v1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;
/* check-cast v3, Ljava/lang/Thread; */
/* .line 15 */
/* new-instance v4, Ljava/lang/StringBuffer; */
/* invoke-direct {v4}, Ljava/lang/StringBuffer;-><init>()V */
final String v5 = "Lazy NDC removal for thread ["; // const-string v5, "Lazy NDC removal for thread ["
(( java.lang.StringBuffer ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.Thread ) v3 ).getName ( ); // invoke-virtual {v3}, Ljava/lang/Thread;->getName()Ljava/lang/String;
(( java.lang.StringBuffer ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v5 = "] ("; // const-string v5, "] ("
(( java.lang.StringBuffer ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
v5 = org.apache.log4j.NDC.a;
v5 = (( java.util.Hashtable ) v5 ).size ( ); // invoke-virtual {v5}, Ljava/util/Hashtable;->size()I
(( java.lang.StringBuffer ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;
final String v5 = ")."; // const-string v5, ")."
(( java.lang.StringBuffer ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .debug ( v4 );
/* .line 16 */
v4 = org.apache.log4j.NDC.a;
(( java.util.Hashtable ) v4 ).remove ( v3 ); // invoke-virtual {v4, v3}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_4
return;
/* :catchall_0 */
/* move-exception v1 */
/* .line 17 */
try { // :try_start_1
/* monitor-exit v0 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* throw v1 */
} // .end method
public static void clear ( ) {
/* .locals 2 */
/* .line 1 */
org.apache.log4j.NDC .a ( );
if ( v0 != null) { // if-eqz v0, :cond_0
int v1 = 0; // const/4 v1, 0x0
/* .line 2 */
(( java.util.Stack ) v0 ).setSize ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/Stack;->setSize(I)V
} // :cond_0
return;
} // .end method
public static java.util.Stack cloneStack ( ) {
/* .locals 1 */
/* .line 1 */
org.apache.log4j.NDC .a ( );
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
} // :cond_0
(( java.util.Stack ) v0 ).clone ( ); // invoke-virtual {v0}, Ljava/util/Stack;->clone()Ljava/lang/Object;
/* check-cast v0, Ljava/util/Stack; */
} // .end method
public static java.lang.String get ( ) {
/* .locals 2 */
/* .line 1 */
org.apache.log4j.NDC .a ( );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
v1 = (( java.util.Stack ) v0 ).isEmpty ( ); // invoke-virtual {v0}, Ljava/util/Stack;->isEmpty()Z
/* if-nez v1, :cond_0 */
/* .line 3 */
(( java.util.Stack ) v0 ).peek ( ); // invoke-virtual {v0}, Ljava/util/Stack;->peek()Ljava/lang/Object;
/* check-cast v0, Lorg/apache/log4j/NDC$a; */
v0 = this.a;
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public static Integer getDepth ( ) {
/* .locals 1 */
/* .line 1 */
org.apache.log4j.NDC .a ( );
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
} // :cond_0
v0 = (( java.util.Stack ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/Stack;->size()I
} // .end method
public static void inherit ( java.util.Stack p0 ) {
/* .locals 2 */
if ( p0 != null) { // if-eqz p0, :cond_0
/* .line 1 */
v0 = org.apache.log4j.NDC.a;
java.lang.Thread .currentThread ( );
(( java.util.Hashtable ) v0 ).put ( v1, p0 ); // invoke-virtual {v0, v1, p0}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
} // :cond_0
return;
} // .end method
public static java.lang.String peek ( ) {
/* .locals 2 */
/* .line 1 */
org.apache.log4j.NDC .a ( );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
v1 = (( java.util.Stack ) v0 ).isEmpty ( ); // invoke-virtual {v0}, Ljava/util/Stack;->isEmpty()Z
/* if-nez v1, :cond_0 */
/* .line 3 */
(( java.util.Stack ) v0 ).peek ( ); // invoke-virtual {v0}, Ljava/util/Stack;->peek()Ljava/lang/Object;
/* check-cast v0, Lorg/apache/log4j/NDC$a; */
v0 = this.b;
} // :cond_0
final String v0 = ""; // const-string v0, ""
} // .end method
public static java.lang.String pop ( ) {
/* .locals 2 */
/* .line 1 */
org.apache.log4j.NDC .a ( );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
v1 = (( java.util.Stack ) v0 ).isEmpty ( ); // invoke-virtual {v0}, Ljava/util/Stack;->isEmpty()Z
/* if-nez v1, :cond_0 */
/* .line 3 */
(( java.util.Stack ) v0 ).pop ( ); // invoke-virtual {v0}, Ljava/util/Stack;->pop()Ljava/lang/Object;
/* check-cast v0, Lorg/apache/log4j/NDC$a; */
v0 = this.b;
} // :cond_0
final String v0 = ""; // const-string v0, ""
} // .end method
public static void push ( java.lang.String p0 ) {
/* .locals 3 */
/* .line 1 */
org.apache.log4j.NDC .a ( );
int v1 = 0; // const/4 v1, 0x0
/* if-nez v0, :cond_0 */
/* .line 2 */
/* new-instance v0, Lorg/apache/log4j/NDC$a; */
/* invoke-direct {v0, p0, v1}, Lorg/apache/log4j/NDC$a;-><init>(Ljava/lang/String;Lorg/apache/log4j/NDC$a;)V */
/* .line 3 */
/* new-instance p0, Ljava/util/Stack; */
/* invoke-direct {p0}, Ljava/util/Stack;-><init>()V */
/* .line 4 */
java.lang.Thread .currentThread ( );
/* .line 5 */
v2 = org.apache.log4j.NDC.a;
(( java.util.Hashtable ) v2 ).put ( v1, p0 ); // invoke-virtual {v2, v1, p0}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 6 */
(( java.util.Stack ) p0 ).push ( v0 ); // invoke-virtual {p0, v0}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;
/* .line 7 */
} // :cond_0
v2 = (( java.util.Stack ) v0 ).isEmpty ( ); // invoke-virtual {v0}, Ljava/util/Stack;->isEmpty()Z
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 8 */
/* new-instance v2, Lorg/apache/log4j/NDC$a; */
/* invoke-direct {v2, p0, v1}, Lorg/apache/log4j/NDC$a;-><init>(Ljava/lang/String;Lorg/apache/log4j/NDC$a;)V */
/* .line 9 */
(( java.util.Stack ) v0 ).push ( v2 ); // invoke-virtual {v0, v2}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;
/* .line 10 */
} // :cond_1
(( java.util.Stack ) v0 ).peek ( ); // invoke-virtual {v0}, Ljava/util/Stack;->peek()Ljava/lang/Object;
/* check-cast v1, Lorg/apache/log4j/NDC$a; */
/* .line 11 */
/* new-instance v2, Lorg/apache/log4j/NDC$a; */
/* invoke-direct {v2, p0, v1}, Lorg/apache/log4j/NDC$a;-><init>(Ljava/lang/String;Lorg/apache/log4j/NDC$a;)V */
(( java.util.Stack ) v0 ).push ( v2 ); // invoke-virtual {v0, v2}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;
} // :goto_0
return;
} // .end method
public static void remove ( ) {
/* .locals 2 */
/* .line 1 */
v0 = org.apache.log4j.NDC.a;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
java.lang.Thread .currentThread ( );
(( java.util.Hashtable ) v0 ).remove ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;
/* .line 3 */
org.apache.log4j.NDC .b ( );
} // :cond_0
return;
} // .end method
public static void setMaxDepth ( Integer p0 ) {
/* .locals 2 */
/* .line 1 */
org.apache.log4j.NDC .a ( );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
v1 = (( java.util.Stack ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/Stack;->size()I
/* if-ge p0, v1, :cond_0 */
/* .line 3 */
(( java.util.Stack ) v0 ).setSize ( p0 ); // invoke-virtual {v0, p0}, Ljava/util/Stack;->setSize(I)V
} // :cond_0
return;
} // .end method
