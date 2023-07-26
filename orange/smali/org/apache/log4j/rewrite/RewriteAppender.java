public class org.apache.log4j.rewrite.RewriteAppender extends org.apache.log4j.AppenderSkeleton implements org.apache.log4j.spi.AppenderAttachable implements org.apache.log4j.xml.UnrecognizedElementHandler {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # static fields */
	 public static java.lang.Class j; //synthetic
	 /* # instance fields */
	 public org.apache.log4j.rewrite.RewritePolicy h;
	 public final org.apache.log4j.helpers.AppenderAttachableImpl i;
	 /* # direct methods */
	 public org.apache.log4j.rewrite.RewriteAppender ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Lorg/apache/log4j/AppenderSkeleton;-><init>()V */
		 /* .line 2 */
		 /* new-instance v0, Lorg/apache/log4j/helpers/AppenderAttachableImpl; */
		 /* invoke-direct {v0}, Lorg/apache/log4j/helpers/AppenderAttachableImpl;-><init>()V */
		 this.i = v0;
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
		 /* # virtual methods */
		 public void addAppender ( org.apache.log4j.Appender p0 ) {
			 /* .locals 2 */
			 /* .line 1 */
			 v0 = this.i;
			 /* monitor-enter v0 */
			 /* .line 2 */
			 try { // :try_start_0
				 v1 = this.i;
				 (( org.apache.log4j.helpers.AppenderAttachableImpl ) v1 ).addAppender ( p1 ); // invoke-virtual {v1, p1}, Lorg/apache/log4j/helpers/AppenderAttachableImpl;->addAppender(Lorg/apache/log4j/Appender;)V
				 /* .line 3 */
				 /* monitor-exit v0 */
				 return;
				 /* :catchall_0 */
				 /* move-exception p1 */
				 /* monitor-exit v0 */
				 /* :try_end_0 */
				 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
				 /* throw p1 */
			 } // .end method
			 public void append ( org.apache.log4j.spi.LoggingEvent p0 ) {
				 /* .locals 2 */
				 /* .line 1 */
				 v0 = this.h;
				 if ( v0 != null) { // if-eqz v0, :cond_0
					 /* .line 2 */
				 } // :cond_0
				 if ( p1 != null) { // if-eqz p1, :cond_1
					 /* .line 3 */
					 v0 = this.i;
					 /* monitor-enter v0 */
					 /* .line 4 */
					 try { // :try_start_0
						 v1 = this.i;
						 (( org.apache.log4j.helpers.AppenderAttachableImpl ) v1 ).appendLoopOnAppenders ( p1 ); // invoke-virtual {v1, p1}, Lorg/apache/log4j/helpers/AppenderAttachableImpl;->appendLoopOnAppenders(Lorg/apache/log4j/spi/LoggingEvent;)I
						 /* .line 5 */
						 /* monitor-exit v0 */
						 /* :catchall_0 */
						 /* move-exception p1 */
						 /* monitor-exit v0 */
						 /* :try_end_0 */
						 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
						 /* throw p1 */
					 } // :cond_1
				 } // :goto_0
				 return;
			 } // .end method
			 public void close ( ) {
				 /* .locals 4 */
				 int v0 = 1; // const/4 v0, 0x1
				 /* .line 1 */
				 /* iput-boolean v0, p0, Lorg/apache/log4j/AppenderSkeleton;->g:Z */
				 /* .line 2 */
				 v0 = this.i;
				 /* monitor-enter v0 */
				 /* .line 3 */
				 try { // :try_start_0
					 v1 = this.i;
					 (( org.apache.log4j.helpers.AppenderAttachableImpl ) v1 ).getAllAppenders ( ); // invoke-virtual {v1}, Lorg/apache/log4j/helpers/AppenderAttachableImpl;->getAllAppenders()Ljava/util/Enumeration;
					 if ( v1 != null) { // if-eqz v1, :cond_1
						 /* .line 4 */
					 } // :cond_0
				 v2 = 				 } // :goto_0
				 if ( v2 != null) { // if-eqz v2, :cond_1
					 /* .line 5 */
					 /* .line 6 */
					 /* instance-of v3, v2, Lorg/apache/log4j/Appender; */
					 if ( v3 != null) { // if-eqz v3, :cond_0
						 /* .line 7 */
						 /* check-cast v2, Lorg/apache/log4j/Appender; */
						 /* .line 8 */
					 } // :cond_1
					 /* monitor-exit v0 */
					 return;
					 /* :catchall_0 */
					 /* move-exception v1 */
					 /* monitor-exit v0 */
					 /* :try_end_0 */
					 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
					 /* throw v1 */
				 } // .end method
				 public java.util.Enumeration getAllAppenders ( ) {
					 /* .locals 2 */
					 /* .line 1 */
					 v0 = this.i;
					 /* monitor-enter v0 */
					 /* .line 2 */
					 try { // :try_start_0
						 v1 = this.i;
						 (( org.apache.log4j.helpers.AppenderAttachableImpl ) v1 ).getAllAppenders ( ); // invoke-virtual {v1}, Lorg/apache/log4j/helpers/AppenderAttachableImpl;->getAllAppenders()Ljava/util/Enumeration;
						 /* monitor-exit v0 */
						 /* :catchall_0 */
						 /* move-exception v1 */
						 /* .line 3 */
						 /* monitor-exit v0 */
						 /* :try_end_0 */
						 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
						 /* throw v1 */
					 } // .end method
					 public org.apache.log4j.Appender getAppender ( java.lang.String p0 ) {
						 /* .locals 2 */
						 /* .line 1 */
						 v0 = this.i;
						 /* monitor-enter v0 */
						 /* .line 2 */
						 try { // :try_start_0
							 v1 = this.i;
							 (( org.apache.log4j.helpers.AppenderAttachableImpl ) v1 ).getAppender ( p1 ); // invoke-virtual {v1, p1}, Lorg/apache/log4j/helpers/AppenderAttachableImpl;->getAppender(Ljava/lang/String;)Lorg/apache/log4j/Appender;
							 /* monitor-exit v0 */
							 /* :catchall_0 */
							 /* move-exception p1 */
							 /* .line 3 */
							 /* monitor-exit v0 */
							 /* :try_end_0 */
							 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
							 /* throw p1 */
						 } // .end method
						 public Boolean isAttached ( org.apache.log4j.Appender p0 ) {
							 /* .locals 2 */
							 /* .line 1 */
							 v0 = this.i;
							 /* monitor-enter v0 */
							 /* .line 2 */
							 try { // :try_start_0
								 v1 = this.i;
								 p1 = 								 (( org.apache.log4j.helpers.AppenderAttachableImpl ) v1 ).isAttached ( p1 ); // invoke-virtual {v1, p1}, Lorg/apache/log4j/helpers/AppenderAttachableImpl;->isAttached(Lorg/apache/log4j/Appender;)Z
								 /* monitor-exit v0 */
								 /* :catchall_0 */
								 /* move-exception p1 */
								 /* .line 3 */
								 /* monitor-exit v0 */
								 /* :try_end_0 */
								 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
								 /* throw p1 */
							 } // .end method
							 public Boolean parseUnrecognizedElement ( org.w3c.dom.Element p0, java.util.Properties p1 ) {
								 /* .locals 2 */
								 /* .annotation system Ldalvik/annotation/Throws; */
								 /* value = { */
								 /* Ljava/lang/Exception; */
								 /* } */
							 } // .end annotation
							 /* .line 1 */
							 final String v1 = "rewritePolicy"; // const-string v1, "rewritePolicy"
							 /* .line 2 */
							 v0 = 							 (( java.lang.String ) v1 ).equals ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
							 if ( v0 != null) { // if-eqz v0, :cond_3
								 /* .line 3 */
								 v0 = org.apache.log4j.rewrite.RewriteAppender.j;
								 /* if-nez v0, :cond_0 */
								 final String v0 = "org.apache.log4j.rewrite.RewritePolicy"; // const-string v0, "org.apache.log4j.rewrite.RewritePolicy"
								 org.apache.log4j.rewrite.RewriteAppender .a ( v0 );
							 } // :cond_0
							 org.apache.log4j.xml.DOMConfigurator .parseElement ( p1,p2,v0 );
							 if ( p1 != null) { // if-eqz p1, :cond_2
								 /* .line 4 */
								 /* instance-of p2, p1, Lorg/apache/log4j/spi/OptionHandler; */
								 if ( p2 != null) { // if-eqz p2, :cond_1
									 /* .line 5 */
									 /* move-object p2, p1 */
									 /* check-cast p2, Lorg/apache/log4j/spi/OptionHandler; */
									 /* .line 6 */
								 } // :cond_1
								 /* check-cast p1, Lorg/apache/log4j/rewrite/RewritePolicy; */
								 (( org.apache.log4j.rewrite.RewriteAppender ) p0 ).setRewritePolicy ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/log4j/rewrite/RewriteAppender;->setRewritePolicy(Lorg/apache/log4j/rewrite/RewritePolicy;)V
							 } // :cond_2
							 int p1 = 1; // const/4 p1, 0x1
						 } // :cond_3
						 int p1 = 0; // const/4 p1, 0x0
					 } // .end method
					 public void removeAllAppenders ( ) {
						 /* .locals 2 */
						 /* .line 1 */
						 v0 = this.i;
						 /* monitor-enter v0 */
						 /* .line 2 */
						 try { // :try_start_0
							 v1 = this.i;
							 (( org.apache.log4j.helpers.AppenderAttachableImpl ) v1 ).removeAllAppenders ( ); // invoke-virtual {v1}, Lorg/apache/log4j/helpers/AppenderAttachableImpl;->removeAllAppenders()V
							 /* .line 3 */
							 /* monitor-exit v0 */
							 return;
							 /* :catchall_0 */
							 /* move-exception v1 */
							 /* monitor-exit v0 */
							 /* :try_end_0 */
							 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
							 /* throw v1 */
						 } // .end method
						 public void removeAppender ( java.lang.String p0 ) {
							 /* .locals 2 */
							 /* .line 4 */
							 v0 = this.i;
							 /* monitor-enter v0 */
							 /* .line 5 */
							 try { // :try_start_0
								 v1 = this.i;
								 (( org.apache.log4j.helpers.AppenderAttachableImpl ) v1 ).removeAppender ( p1 ); // invoke-virtual {v1, p1}, Lorg/apache/log4j/helpers/AppenderAttachableImpl;->removeAppender(Ljava/lang/String;)V
								 /* .line 6 */
								 /* monitor-exit v0 */
								 return;
								 /* :catchall_0 */
								 /* move-exception p1 */
								 /* monitor-exit v0 */
								 /* :try_end_0 */
								 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
								 /* throw p1 */
							 } // .end method
							 public void removeAppender ( org.apache.log4j.Appender p0 ) {
								 /* .locals 2 */
								 /* .line 1 */
								 v0 = this.i;
								 /* monitor-enter v0 */
								 /* .line 2 */
								 try { // :try_start_0
									 v1 = this.i;
									 (( org.apache.log4j.helpers.AppenderAttachableImpl ) v1 ).removeAppender ( p1 ); // invoke-virtual {v1, p1}, Lorg/apache/log4j/helpers/AppenderAttachableImpl;->removeAppender(Lorg/apache/log4j/Appender;)V
									 /* .line 3 */
									 /* monitor-exit v0 */
									 return;
									 /* :catchall_0 */
									 /* move-exception p1 */
									 /* monitor-exit v0 */
									 /* :try_end_0 */
									 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
									 /* throw p1 */
								 } // .end method
								 public Boolean requiresLayout ( ) {
									 /* .locals 1 */
									 int v0 = 0; // const/4 v0, 0x0
								 } // .end method
								 public void setRewritePolicy ( org.apache.log4j.rewrite.RewritePolicy p0 ) {
									 /* .locals 0 */
									 /* .line 1 */
									 this.h = p1;
									 return;
								 } // .end method
