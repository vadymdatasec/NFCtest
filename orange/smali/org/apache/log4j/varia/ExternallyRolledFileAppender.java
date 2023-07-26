public class org.apache.log4j.varia.ExternallyRolledFileAppender extends org.apache.log4j.RollingFileAppender {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final java.lang.String OK;
	 public static final java.lang.String ROLL_OVER;
	 /* # instance fields */
	 public Integer r;
	 public m.a.b.m.a s;
	 /* # direct methods */
	 public org.apache.log4j.varia.ExternallyRolledFileAppender ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Lorg/apache/log4j/RollingFileAppender;-><init>()V */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 2 */
		 /* iput v0, p0, Lorg/apache/log4j/varia/ExternallyRolledFileAppender;->r:I */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void activateOptions ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* invoke-super {p0}, Lorg/apache/log4j/FileAppender;->activateOptions()V */
		 /* .line 2 */
		 /* iget v0, p0, Lorg/apache/log4j/varia/ExternallyRolledFileAppender;->r:I */
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 /* .line 3 */
			 v0 = this.s;
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 /* .line 4 */
				 (( java.lang.Thread ) v0 ).interrupt ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V
				 /* .line 5 */
			 } // :cond_0
			 /* new-instance v0, Lm/a/b/m/a; */
			 /* iget v1, p0, Lorg/apache/log4j/varia/ExternallyRolledFileAppender;->r:I */
			 /* invoke-direct {v0, p0, v1}, Lm/a/b/m/a;-><init>(Lorg/apache/log4j/varia/ExternallyRolledFileAppender;I)V */
			 this.s = v0;
			 int v1 = 1; // const/4 v1, 0x1
			 /* .line 6 */
			 (( java.lang.Thread ) v0 ).setDaemon ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/Thread;->setDaemon(Z)V
			 /* .line 7 */
			 v0 = this.s;
			 (( java.lang.Thread ) v0 ).start ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->start()V
		 } // :cond_1
		 return;
	 } // .end method
	 public Integer getPort ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* iget v0, p0, Lorg/apache/log4j/varia/ExternallyRolledFileAppender;->r:I */
	 } // .end method
	 public void setPort ( Integer p0 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* iput p1, p0, Lorg/apache/log4j/varia/ExternallyRolledFileAppender;->r:I */
		 return;
	 } // .end method
