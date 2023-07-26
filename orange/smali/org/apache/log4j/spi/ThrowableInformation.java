public class org.apache.log4j.spi.ThrowableInformation implements java.io.Serializable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public transient java.lang.Throwable b;
	 public transient org.apache.log4j.Category c;
	 public java.lang.String d;
	 /* # direct methods */
	 public org.apache.log4j.spi.ThrowableInformation ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.b = p1;
		 return;
	 } // .end method
	 public org.apache.log4j.spi.ThrowableInformation ( ) {
		 /* .locals 0 */
		 /* .line 3 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 4 */
		 this.b = p1;
		 /* .line 5 */
		 this.c = p2;
		 return;
	 } // .end method
	 public org.apache.log4j.spi.ThrowableInformation ( ) {
		 /* .locals 0 */
		 /* .line 6 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 if ( p1 != null) { // if-eqz p1, :cond_0
			 /* .line 7 */
			 (( java.lang.Object ) p1 ).clone ( ); // invoke-virtual {p1}, Ljava/lang/Object;->clone()Ljava/lang/Object;
			 /* check-cast p1, [Ljava/lang/String; */
			 this.d = p1;
		 } // :cond_0
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.Throwable getThrowable ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.b;
	 } // .end method
	 public synchronized java.lang.String getThrowableStrRep ( ) {
		 /* .locals 3 */
		 /* monitor-enter p0 */
		 /* .line 1 */
		 try { // :try_start_0
			 v0 = this.d;
			 /* if-nez v0, :cond_2 */
			 int v0 = 0; // const/4 v0, 0x0
			 /* .line 2 */
			 v1 = this.c;
			 if ( v1 != null) { // if-eqz v1, :cond_0
				 /* .line 3 */
				 v1 = this.c;
				 (( org.apache.log4j.Category ) v1 ).getLoggerRepository ( ); // invoke-virtual {v1}, Lorg/apache/log4j/Category;->getLoggerRepository()Lorg/apache/log4j/spi/LoggerRepository;
				 /* .line 4 */
				 /* instance-of v2, v1, Lorg/apache/log4j/spi/ThrowableRendererSupport; */
				 if ( v2 != null) { // if-eqz v2, :cond_0
					 /* .line 5 */
					 /* check-cast v1, Lorg/apache/log4j/spi/ThrowableRendererSupport; */
				 } // :cond_0
				 /* if-nez v0, :cond_1 */
				 /* .line 6 */
				 v0 = this.b;
				 org.apache.log4j.DefaultThrowableRenderer .render ( v0 );
				 this.d = v0;
				 /* .line 7 */
			 } // :cond_1
			 v1 = this.b;
			 this.d = v0;
			 /* .line 8 */
		 } // :cond_2
	 } // :goto_0
	 v0 = this.d;
	 (( java.lang.Object ) v0 ).clone ( ); // invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;
	 /* check-cast v0, [Ljava/lang/String; */
	 /* :try_end_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 /* monitor-exit p0 */
	 /* :catchall_0 */
	 /* move-exception v0 */
	 /* monitor-exit p0 */
	 /* throw v0 */
} // .end method
