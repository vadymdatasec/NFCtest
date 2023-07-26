public class org.apache.log4j.Logger extends org.apache.log4j.Category {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final java.lang.String j;
	 public static java.lang.Class k; //synthetic
	 /* # direct methods */
	 public static org.apache.log4j.Logger ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = org.apache.log4j.Logger.k;
		 /* if-nez v0, :cond_0 */
		 final String v0 = "org.apache.log4j.Logger"; // const-string v0, "org.apache.log4j.Logger"
		 org.apache.log4j.Logger .b ( v0 );
	 } // :cond_0
	 (( java.lang.Class ) v0 ).getName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;
	 return;
} // .end method
public org.apache.log4j.Logger ( ) {
	 /* .locals 0 */
	 /* .line 1 */
	 /* invoke-direct {p0, p1}, Lorg/apache/log4j/Category;-><init>(Ljava/lang/String;)V */
	 return;
} // .end method
public static java.lang.Class b ( java.lang.String p0 ) { //synthethic
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
	 public static org.apache.log4j.Logger getLogger ( java.lang.Class p0 ) {
		 /* .locals 0 */
		 /* .line 2 */
		 (( java.lang.Class ) p0 ).getName ( ); // invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;
		 org.apache.log4j.LogManager .getLogger ( p0 );
	 } // .end method
	 public static org.apache.log4j.Logger getLogger ( java.lang.String p0 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 org.apache.log4j.LogManager .getLogger ( p0 );
	 } // .end method
	 public static org.apache.log4j.Logger getLogger ( java.lang.String p0, org.apache.log4j.spi.LoggerFactory p1 ) {
		 /* .locals 0 */
		 /* .line 3 */
		 org.apache.log4j.LogManager .getLogger ( p0,p1 );
	 } // .end method
	 public static org.apache.log4j.Logger getRootLogger ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 org.apache.log4j.LogManager .getRootLogger ( );
	 } // .end method
	 /* # virtual methods */
	 public Boolean isTraceEnabled ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 v0 = this.e;
		 v0 = 		 /* const/16 v1, 0x1388 */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 int v0 = 0; // const/4 v0, 0x0
			 /* .line 2 */
		 } // :cond_0
		 v0 = org.apache.log4j.Level.TRACE;
		 (( org.apache.log4j.Category ) p0 ).getEffectiveLevel ( ); // invoke-virtual {p0}, Lorg/apache/log4j/Category;->getEffectiveLevel()Lorg/apache/log4j/Level;
		 v0 = 		 (( org.apache.log4j.Priority ) v0 ).isGreaterOrEqual ( v1 ); // invoke-virtual {v0, v1}, Lorg/apache/log4j/Priority;->isGreaterOrEqual(Lorg/apache/log4j/Priority;)Z
	 } // .end method
	 public void trace ( java.lang.Object p0 ) {
		 /* .locals 3 */
		 /* .line 1 */
		 v0 = this.e;
		 v0 = 		 /* const/16 v1, 0x1388 */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 return;
			 /* .line 2 */
		 } // :cond_0
		 v0 = org.apache.log4j.Level.TRACE;
		 (( org.apache.log4j.Category ) p0 ).getEffectiveLevel ( ); // invoke-virtual {p0}, Lorg/apache/log4j/Category;->getEffectiveLevel()Lorg/apache/log4j/Level;
		 v0 = 		 (( org.apache.log4j.Priority ) v0 ).isGreaterOrEqual ( v1 ); // invoke-virtual {v0, v1}, Lorg/apache/log4j/Priority;->isGreaterOrEqual(Lorg/apache/log4j/Priority;)Z
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 /* .line 3 */
			 v0 = org.apache.log4j.Logger.j;
			 v1 = org.apache.log4j.Level.TRACE;
			 int v2 = 0; // const/4 v2, 0x0
			 (( org.apache.log4j.Category ) p0 ).a ( v0, v1, p1, v2 ); // invoke-virtual {p0, v0, v1, p1, v2}, Lorg/apache/log4j/Category;->a(Ljava/lang/String;Lorg/apache/log4j/Priority;Ljava/lang/Object;Ljava/lang/Throwable;)V
		 } // :cond_1
		 return;
	 } // .end method
	 public void trace ( java.lang.Object p0, java.lang.Throwable p1 ) {
		 /* .locals 2 */
		 /* .line 4 */
		 v0 = this.e;
		 v0 = 		 /* const/16 v1, 0x1388 */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 return;
			 /* .line 5 */
		 } // :cond_0
		 v0 = org.apache.log4j.Level.TRACE;
		 (( org.apache.log4j.Category ) p0 ).getEffectiveLevel ( ); // invoke-virtual {p0}, Lorg/apache/log4j/Category;->getEffectiveLevel()Lorg/apache/log4j/Level;
		 v0 = 		 (( org.apache.log4j.Priority ) v0 ).isGreaterOrEqual ( v1 ); // invoke-virtual {v0, v1}, Lorg/apache/log4j/Priority;->isGreaterOrEqual(Lorg/apache/log4j/Priority;)Z
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 /* .line 6 */
			 v0 = org.apache.log4j.Logger.j;
			 v1 = org.apache.log4j.Level.TRACE;
			 (( org.apache.log4j.Category ) p0 ).a ( v0, v1, p1, p2 ); // invoke-virtual {p0, v0, v1, p1, p2}, Lorg/apache/log4j/Category;->a(Ljava/lang/String;Lorg/apache/log4j/Priority;Ljava/lang/Object;Ljava/lang/Throwable;)V
		 } // :cond_1
		 return;
	 } // .end method
