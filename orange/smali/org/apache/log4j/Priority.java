public class org.apache.log4j.Priority {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final Integer ALL_INT;
	 public static final org.apache.log4j.Priority DEBUG;
	 public static final Integer DEBUG_INT;
	 public static final org.apache.log4j.Priority ERROR;
	 public static final Integer ERROR_INT;
	 public static final org.apache.log4j.Priority FATAL;
	 public static final Integer FATAL_INT;
	 public static final org.apache.log4j.Priority INFO;
	 public static final Integer INFO_INT;
	 public static final Integer OFF_INT;
	 public static final org.apache.log4j.Priority WARN;
	 public static final Integer WARN_INT;
	 /* # instance fields */
	 public transient Integer b;
	 public transient java.lang.String c;
	 public transient Integer d;
	 /* # direct methods */
	 public static org.apache.log4j.Priority ( ) {
		 /* .locals 4 */
		 /* .line 1 */
		 /* new-instance v0, Lorg/apache/log4j/Level; */
		 /* const v1, 0xc350 */
		 final String v2 = "FATAL"; // const-string v2, "FATAL"
		 int v3 = 0; // const/4 v3, 0x0
		 /* invoke-direct {v0, v1, v2, v3}, Lorg/apache/log4j/Level;-><init>(ILjava/lang/String;I)V */
		 /* .line 2 */
		 /* new-instance v0, Lorg/apache/log4j/Level; */
		 /* const v1, 0x9c40 */
		 final String v2 = "ERROR"; // const-string v2, "ERROR"
		 int v3 = 3; // const/4 v3, 0x3
		 /* invoke-direct {v0, v1, v2, v3}, Lorg/apache/log4j/Level;-><init>(ILjava/lang/String;I)V */
		 /* .line 3 */
		 /* new-instance v0, Lorg/apache/log4j/Level; */
		 /* const/16 v1, 0x7530 */
		 final String v2 = "WARN"; // const-string v2, "WARN"
		 int v3 = 4; // const/4 v3, 0x4
		 /* invoke-direct {v0, v1, v2, v3}, Lorg/apache/log4j/Level;-><init>(ILjava/lang/String;I)V */
		 /* .line 4 */
		 /* new-instance v0, Lorg/apache/log4j/Level; */
		 /* const/16 v1, 0x4e20 */
		 final String v2 = "INFO"; // const-string v2, "INFO"
		 int v3 = 6; // const/4 v3, 0x6
		 /* invoke-direct {v0, v1, v2, v3}, Lorg/apache/log4j/Level;-><init>(ILjava/lang/String;I)V */
		 /* .line 5 */
		 /* new-instance v0, Lorg/apache/log4j/Level; */
		 /* const/16 v1, 0x2710 */
		 final String v2 = "DEBUG"; // const-string v2, "DEBUG"
		 int v3 = 7; // const/4 v3, 0x7
		 /* invoke-direct {v0, v1, v2, v3}, Lorg/apache/log4j/Level;-><init>(ILjava/lang/String;I)V */
		 return;
	 } // .end method
	 public org.apache.log4j.Priority ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* const/16 v0, 0x2710 */
		 /* .line 2 */
		 /* iput v0, p0, Lorg/apache/log4j/Priority;->b:I */
		 final String v0 = "DEBUG"; // const-string v0, "DEBUG"
		 /* .line 3 */
		 this.c = v0;
		 int v0 = 7; // const/4 v0, 0x7
		 /* .line 4 */
		 /* iput v0, p0, Lorg/apache/log4j/Priority;->d:I */
		 return;
	 } // .end method
	 public org.apache.log4j.Priority ( ) {
		 /* .locals 0 */
		 /* .line 5 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 6 */
		 /* iput p1, p0, Lorg/apache/log4j/Priority;->b:I */
		 /* .line 7 */
		 this.c = p2;
		 /* .line 8 */
		 /* iput p3, p0, Lorg/apache/log4j/Priority;->d:I */
		 return;
	 } // .end method
	 public static org.apache.log4j.Priority getAllPossiblePriorities ( ) {
		 /* .locals 3 */
		 int v0 = 5; // const/4 v0, 0x5
		 /* new-array v0, v0, [Lorg/apache/log4j/Priority; */
		 /* .line 1 */
		 v1 = org.apache.log4j.Priority.FATAL;
		 int v2 = 0; // const/4 v2, 0x0
		 /* aput-object v1, v0, v2 */
		 v1 = org.apache.log4j.Priority.ERROR;
		 int v2 = 1; // const/4 v2, 0x1
		 /* aput-object v1, v0, v2 */
		 v1 = org.apache.log4j.Level.WARN;
		 int v2 = 2; // const/4 v2, 0x2
		 /* aput-object v1, v0, v2 */
		 v1 = org.apache.log4j.Priority.INFO;
		 int v2 = 3; // const/4 v2, 0x3
		 /* aput-object v1, v0, v2 */
		 v1 = org.apache.log4j.Priority.DEBUG;
		 int v2 = 4; // const/4 v2, 0x4
		 /* aput-object v1, v0, v2 */
	 } // .end method
	 public static org.apache.log4j.Priority toPriority ( Integer p0 ) {
		 /* .locals 1 */
		 /* .line 2 */
		 v0 = org.apache.log4j.Priority.DEBUG;
		 org.apache.log4j.Priority .toPriority ( p0,v0 );
	 } // .end method
	 public static org.apache.log4j.Priority toPriority ( Integer p0, org.apache.log4j.Priority p1 ) {
		 /* .locals 0 */
		 /* .line 3 */
		 /* check-cast p1, Lorg/apache/log4j/Level; */
		 org.apache.log4j.Level .toLevel ( p0,p1 );
	 } // .end method
	 public static org.apache.log4j.Priority toPriority ( java.lang.String p0 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 org.apache.log4j.Level .toLevel ( p0 );
	 } // .end method
	 public static org.apache.log4j.Priority toPriority ( java.lang.String p0, org.apache.log4j.Priority p1 ) {
		 /* .locals 0 */
		 /* .line 4 */
		 /* check-cast p1, Lorg/apache/log4j/Level; */
		 org.apache.log4j.Level .toLevel ( p0,p1 );
	 } // .end method
	 /* # virtual methods */
	 public Boolean equals ( java.lang.Object p0 ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* instance-of v0, p1, Lorg/apache/log4j/Priority; */
		 int v1 = 0; // const/4 v1, 0x0
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 2 */
			 /* check-cast p1, Lorg/apache/log4j/Priority; */
			 /* .line 3 */
			 /* iget v0, p0, Lorg/apache/log4j/Priority;->b:I */
			 /* iget p1, p1, Lorg/apache/log4j/Priority;->b:I */
			 /* if-ne v0, p1, :cond_0 */
			 int v1 = 1; // const/4 v1, 0x1
		 } // :cond_0
	 } // .end method
	 public final Integer getSyslogEquivalent ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* iget v0, p0, Lorg/apache/log4j/Priority;->d:I */
	 } // .end method
	 public Boolean isGreaterOrEqual ( org.apache.log4j.Priority p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* iget v0, p0, Lorg/apache/log4j/Priority;->b:I */
		 /* iget p1, p1, Lorg/apache/log4j/Priority;->b:I */
		 /* if-lt v0, p1, :cond_0 */
		 int p1 = 1; // const/4 p1, 0x1
	 } // :cond_0
	 int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
public final Integer toInt ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Lorg/apache/log4j/Priority;->b:I */
} // .end method
public final java.lang.String toString ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.c;
} // .end method
