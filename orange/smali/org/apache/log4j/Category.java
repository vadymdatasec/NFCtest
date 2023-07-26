public class org.apache.log4j.Category implements org.apache.log4j.spi.AppenderAttachable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # static fields */
	 public static final java.lang.String h;
	 public static java.lang.Class i; //synthetic
	 /* # instance fields */
	 public java.lang.String a;
	 public volatile org.apache.log4j.Level b;
	 public volatile org.apache.log4j.Category c;
	 public java.util.ResourceBundle d;
	 public org.apache.log4j.spi.LoggerRepository e;
	 public org.apache.log4j.helpers.AppenderAttachableImpl f;
	 public Boolean g;
	 /* # direct methods */
	 public static org.apache.log4j.Category ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = org.apache.log4j.Category.i;
		 /* if-nez v0, :cond_0 */
		 final String v0 = "org.apache.log4j.Category"; // const-string v0, "org.apache.log4j.Category"
		 org.apache.log4j.Category .b ( v0 );
	 } // :cond_0
	 (( java.lang.Class ) v0 ).getName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;
	 return;
} // .end method
public org.apache.log4j.Category ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 int v0 = 1; // const/4 v0, 0x1
	 /* .line 2 */
	 /* iput-boolean v0, p0, Lorg/apache/log4j/Category;->g:Z */
	 /* .line 3 */
	 this.a = p1;
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
	 public static org.apache.log4j.Logger exists ( java.lang.String p0 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 org.apache.log4j.LogManager .exists ( p0 );
	 } // .end method
	 public static java.util.Enumeration getCurrentCategories ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 org.apache.log4j.LogManager .getCurrentLoggers ( );
	 } // .end method
	 public static org.apache.log4j.spi.LoggerRepository getDefaultHierarchy ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 org.apache.log4j.LogManager .getLoggerRepository ( );
	 } // .end method
	 public static org.apache.log4j.Category getInstance ( java.lang.Class p0 ) {
		 /* .locals 0 */
		 /* .line 2 */
		 org.apache.log4j.LogManager .getLogger ( p0 );
	 } // .end method
	 public static org.apache.log4j.Category getInstance ( java.lang.String p0 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 org.apache.log4j.LogManager .getLogger ( p0 );
	 } // .end method
	 public static final org.apache.log4j.Category getRoot ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 org.apache.log4j.LogManager .getRootLogger ( );
	 } // .end method
	 public static void shutdown ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 org.apache.log4j.LogManager .shutdown ( );
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.String a ( java.lang.String p0 ) {
		 /* .locals 3 */
		 /* .line 8 */
		 (( org.apache.log4j.Category ) p0 ).getResourceBundle ( ); // invoke-virtual {p0}, Lorg/apache/log4j/Category;->getResourceBundle()Ljava/util/ResourceBundle;
		 int v1 = 0; // const/4 v1, 0x0
		 /* if-nez v0, :cond_0 */
		 /* .line 9 */
	 } // :cond_0
	 try { // :try_start_0
		 (( java.util.ResourceBundle ) v0 ).getString ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/ResourceBundle;->getString(Ljava/lang/String;)Ljava/lang/String;
		 /* :try_end_0 */
		 /* .catch Ljava/util/MissingResourceException; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* .line 10 */
		 /* :catch_0 */
		 /* new-instance v0, Ljava/lang/StringBuffer; */
		 /* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
		 final String v2 = "No resource is associated with key \""; // const-string v2, "No resource is associated with key \""
		 (( java.lang.StringBuffer ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 (( java.lang.StringBuffer ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 final String p1 = "\"."; // const-string p1, "\"."
		 (( java.lang.StringBuffer ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 (( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
		 (( org.apache.log4j.Category ) p0 ).error ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/log4j/Category;->error(Ljava/lang/Object;)V
	 } // .end method
	 public synchronized void a ( ) {
		 /* .locals 3 */
		 /* monitor-enter p0 */
		 /* .line 1 */
		 try { // :try_start_0
			 (( org.apache.log4j.Category ) p0 ).getAllAppenders ( ); // invoke-virtual {p0}, Lorg/apache/log4j/Category;->getAllAppenders()Ljava/util/Enumeration;
			 if ( v0 != null) { // if-eqz v0, :cond_1
				 /* .line 2 */
			 } // :cond_0
		 v1 = 		 } // :goto_0
		 if ( v1 != null) { // if-eqz v1, :cond_1
			 /* .line 3 */
			 /* check-cast v1, Lorg/apache/log4j/Appender; */
			 /* .line 4 */
			 /* instance-of v2, v1, Lorg/apache/log4j/spi/AppenderAttachable; */
			 if ( v2 != null) { // if-eqz v2, :cond_0
				 /* .line 5 */
				 /* :try_end_0 */
				 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
				 /* .line 6 */
			 } // :cond_1
			 /* monitor-exit p0 */
			 return;
			 /* :catchall_0 */
			 /* move-exception v0 */
			 /* monitor-exit p0 */
			 /* throw v0 */
		 } // .end method
		 public void a ( java.lang.String p0, org.apache.log4j.Priority p1, java.lang.Object p2, java.lang.Throwable p3 ) {
			 /* .locals 7 */
			 /* .line 7 */
			 /* new-instance v6, Lorg/apache/log4j/spi/LoggingEvent; */
			 /* move-object v0, v6 */
			 /* move-object v1, p1 */
			 /* move-object v2, p0 */
			 /* move-object v3, p2 */
			 /* move-object v4, p3 */
			 /* move-object v5, p4 */
			 /* invoke-direct/range {v0 ..v5}, Lorg/apache/log4j/spi/LoggingEvent;-><init>(Ljava/lang/String;Lorg/apache/log4j/Category;Lorg/apache/log4j/Priority;Ljava/lang/Object;Ljava/lang/Throwable;)V */
			 (( org.apache.log4j.Category ) p0 ).callAppenders ( v6 ); // invoke-virtual {p0, v6}, Lorg/apache/log4j/Category;->callAppenders(Lorg/apache/log4j/spi/LoggingEvent;)V
			 return;
		 } // .end method
		 public final void a ( org.apache.log4j.Appender p0 ) {
			 /* .locals 2 */
			 if ( p1 != null) { // if-eqz p1, :cond_1
				 /* .line 11 */
				 v0 = this.e;
				 /* instance-of v1, v0, Lorg/apache/log4j/Hierarchy; */
				 if ( v1 != null) { // if-eqz v1, :cond_0
					 /* .line 12 */
					 /* check-cast v0, Lorg/apache/log4j/Hierarchy; */
					 (( org.apache.log4j.Hierarchy ) v0 ).a ( p0, p1 ); // invoke-virtual {v0, p0, p1}, Lorg/apache/log4j/Hierarchy;->a(Lorg/apache/log4j/Category;Lorg/apache/log4j/Appender;)V
					 /* .line 13 */
				 } // :cond_0
				 /* instance-of v1, v0, Lorg/apache/log4j/spi/HierarchyEventListener; */
				 if ( v1 != null) { // if-eqz v1, :cond_1
					 /* .line 14 */
					 /* check-cast v0, Lorg/apache/log4j/spi/HierarchyEventListener; */
				 } // :cond_1
			 } // :goto_0
			 return;
		 } // .end method
		 public final void a ( org.apache.log4j.spi.LoggerRepository p0 ) {
			 /* .locals 0 */
			 /* .line 15 */
			 this.e = p1;
			 return;
		 } // .end method
		 public synchronized void addAppender ( org.apache.log4j.Appender p0 ) {
			 /* .locals 1 */
			 /* monitor-enter p0 */
			 /* .line 1 */
			 try { // :try_start_0
				 v0 = this.f;
				 /* if-nez v0, :cond_0 */
				 /* .line 2 */
				 /* new-instance v0, Lorg/apache/log4j/helpers/AppenderAttachableImpl; */
				 /* invoke-direct {v0}, Lorg/apache/log4j/helpers/AppenderAttachableImpl;-><init>()V */
				 this.f = v0;
				 /* .line 3 */
			 } // :cond_0
			 v0 = this.f;
			 (( org.apache.log4j.helpers.AppenderAttachableImpl ) v0 ).addAppender ( p1 ); // invoke-virtual {v0, p1}, Lorg/apache/log4j/helpers/AppenderAttachableImpl;->addAppender(Lorg/apache/log4j/Appender;)V
			 /* .line 4 */
			 v0 = this.e;
			 /* :try_end_0 */
			 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
			 /* .line 5 */
			 /* monitor-exit p0 */
			 return;
			 /* :catchall_0 */
			 /* move-exception p1 */
			 /* monitor-exit p0 */
			 /* throw p1 */
		 } // .end method
		 public void assertLog ( Boolean p0, java.lang.String p1 ) {
			 /* .locals 0 */
			 /* if-nez p1, :cond_0 */
			 /* .line 1 */
			 (( org.apache.log4j.Category ) p0 ).error ( p2 ); // invoke-virtual {p0, p2}, Lorg/apache/log4j/Category;->error(Ljava/lang/Object;)V
		 } // :cond_0
		 return;
	 } // .end method
	 public void callAppenders ( org.apache.log4j.spi.LoggingEvent p0 ) {
		 /* .locals 3 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* move-object v1, p0 */
	 } // :goto_0
	 if ( v1 != null) { // if-eqz v1, :cond_2
		 /* .line 1 */
		 /* monitor-enter v1 */
		 /* .line 2 */
		 try { // :try_start_0
			 v2 = this.f;
			 if ( v2 != null) { // if-eqz v2, :cond_0
				 /* .line 3 */
				 v2 = this.f;
				 v2 = 				 (( org.apache.log4j.helpers.AppenderAttachableImpl ) v2 ).appendLoopOnAppenders ( p1 ); // invoke-virtual {v2, p1}, Lorg/apache/log4j/helpers/AppenderAttachableImpl;->appendLoopOnAppenders(Lorg/apache/log4j/spi/LoggingEvent;)I
				 /* add-int/2addr v0, v2 */
				 /* .line 4 */
			 } // :cond_0
			 /* iget-boolean v2, v1, Lorg/apache/log4j/Category;->g:Z */
			 /* if-nez v2, :cond_1 */
			 /* .line 5 */
			 /* monitor-exit v1 */
			 /* .line 6 */
		 } // :cond_1
		 /* monitor-exit v1 */
		 /* :try_end_0 */
		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
		 /* .line 7 */
		 v1 = this.c;
		 /* :catchall_0 */
		 /* move-exception p1 */
		 /* .line 8 */
		 try { // :try_start_1
			 /* monitor-exit v1 */
			 /* :try_end_1 */
			 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
			 /* throw p1 */
		 } // :cond_2
	 } // :goto_1
	 /* if-nez v0, :cond_3 */
	 /* .line 9 */
	 p1 = this.e;
} // :cond_3
return;
} // .end method
public void debug ( java.lang.Object p0 ) {
/* .locals 3 */
/* .line 1 */
v0 = this.e;
v0 = /* const/16 v1, 0x2710 */
if ( v0 != null) { // if-eqz v0, :cond_0
	 return;
	 /* .line 2 */
} // :cond_0
v0 = org.apache.log4j.Level.DEBUG;
(( org.apache.log4j.Category ) p0 ).getEffectiveLevel ( ); // invoke-virtual {p0}, Lorg/apache/log4j/Category;->getEffectiveLevel()Lorg/apache/log4j/Level;
v0 = (( org.apache.log4j.Priority ) v0 ).isGreaterOrEqual ( v1 ); // invoke-virtual {v0, v1}, Lorg/apache/log4j/Priority;->isGreaterOrEqual(Lorg/apache/log4j/Priority;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
	 /* .line 3 */
	 v0 = org.apache.log4j.Category.h;
	 v1 = org.apache.log4j.Level.DEBUG;
	 int v2 = 0; // const/4 v2, 0x0
	 (( org.apache.log4j.Category ) p0 ).a ( v0, v1, p1, v2 ); // invoke-virtual {p0, v0, v1, p1, v2}, Lorg/apache/log4j/Category;->a(Ljava/lang/String;Lorg/apache/log4j/Priority;Ljava/lang/Object;Ljava/lang/Throwable;)V
} // :cond_1
return;
} // .end method
public void debug ( java.lang.Object p0, java.lang.Throwable p1 ) {
/* .locals 2 */
/* .line 4 */
v0 = this.e;
v0 = /* const/16 v1, 0x2710 */
if ( v0 != null) { // if-eqz v0, :cond_0
	 return;
	 /* .line 5 */
} // :cond_0
v0 = org.apache.log4j.Level.DEBUG;
(( org.apache.log4j.Category ) p0 ).getEffectiveLevel ( ); // invoke-virtual {p0}, Lorg/apache/log4j/Category;->getEffectiveLevel()Lorg/apache/log4j/Level;
v0 = (( org.apache.log4j.Priority ) v0 ).isGreaterOrEqual ( v1 ); // invoke-virtual {v0, v1}, Lorg/apache/log4j/Priority;->isGreaterOrEqual(Lorg/apache/log4j/Priority;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
	 /* .line 6 */
	 v0 = org.apache.log4j.Category.h;
	 v1 = org.apache.log4j.Level.DEBUG;
	 (( org.apache.log4j.Category ) p0 ).a ( v0, v1, p1, p2 ); // invoke-virtual {p0, v0, v1, p1, p2}, Lorg/apache/log4j/Category;->a(Ljava/lang/String;Lorg/apache/log4j/Priority;Ljava/lang/Object;Ljava/lang/Throwable;)V
} // :cond_1
return;
} // .end method
public void error ( java.lang.Object p0 ) {
/* .locals 3 */
/* .line 1 */
v0 = this.e;
v0 = /* const v1, 0x9c40 */
if ( v0 != null) { // if-eqz v0, :cond_0
	 return;
	 /* .line 2 */
} // :cond_0
v0 = org.apache.log4j.Level.ERROR;
(( org.apache.log4j.Category ) p0 ).getEffectiveLevel ( ); // invoke-virtual {p0}, Lorg/apache/log4j/Category;->getEffectiveLevel()Lorg/apache/log4j/Level;
v0 = (( org.apache.log4j.Priority ) v0 ).isGreaterOrEqual ( v1 ); // invoke-virtual {v0, v1}, Lorg/apache/log4j/Priority;->isGreaterOrEqual(Lorg/apache/log4j/Priority;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
	 /* .line 3 */
	 v0 = org.apache.log4j.Category.h;
	 v1 = org.apache.log4j.Level.ERROR;
	 int v2 = 0; // const/4 v2, 0x0
	 (( org.apache.log4j.Category ) p0 ).a ( v0, v1, p1, v2 ); // invoke-virtual {p0, v0, v1, p1, v2}, Lorg/apache/log4j/Category;->a(Ljava/lang/String;Lorg/apache/log4j/Priority;Ljava/lang/Object;Ljava/lang/Throwable;)V
} // :cond_1
return;
} // .end method
public void error ( java.lang.Object p0, java.lang.Throwable p1 ) {
/* .locals 2 */
/* .line 4 */
v0 = this.e;
v0 = /* const v1, 0x9c40 */
if ( v0 != null) { // if-eqz v0, :cond_0
	 return;
	 /* .line 5 */
} // :cond_0
v0 = org.apache.log4j.Level.ERROR;
(( org.apache.log4j.Category ) p0 ).getEffectiveLevel ( ); // invoke-virtual {p0}, Lorg/apache/log4j/Category;->getEffectiveLevel()Lorg/apache/log4j/Level;
v0 = (( org.apache.log4j.Priority ) v0 ).isGreaterOrEqual ( v1 ); // invoke-virtual {v0, v1}, Lorg/apache/log4j/Priority;->isGreaterOrEqual(Lorg/apache/log4j/Priority;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
	 /* .line 6 */
	 v0 = org.apache.log4j.Category.h;
	 v1 = org.apache.log4j.Level.ERROR;
	 (( org.apache.log4j.Category ) p0 ).a ( v0, v1, p1, p2 ); // invoke-virtual {p0, v0, v1, p1, p2}, Lorg/apache/log4j/Category;->a(Ljava/lang/String;Lorg/apache/log4j/Priority;Ljava/lang/Object;Ljava/lang/Throwable;)V
} // :cond_1
return;
} // .end method
public void fatal ( java.lang.Object p0 ) {
/* .locals 3 */
/* .line 1 */
v0 = this.e;
v0 = /* const v1, 0xc350 */
if ( v0 != null) { // if-eqz v0, :cond_0
	 return;
	 /* .line 2 */
} // :cond_0
v0 = org.apache.log4j.Level.FATAL;
(( org.apache.log4j.Category ) p0 ).getEffectiveLevel ( ); // invoke-virtual {p0}, Lorg/apache/log4j/Category;->getEffectiveLevel()Lorg/apache/log4j/Level;
v0 = (( org.apache.log4j.Priority ) v0 ).isGreaterOrEqual ( v1 ); // invoke-virtual {v0, v1}, Lorg/apache/log4j/Priority;->isGreaterOrEqual(Lorg/apache/log4j/Priority;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
	 /* .line 3 */
	 v0 = org.apache.log4j.Category.h;
	 v1 = org.apache.log4j.Level.FATAL;
	 int v2 = 0; // const/4 v2, 0x0
	 (( org.apache.log4j.Category ) p0 ).a ( v0, v1, p1, v2 ); // invoke-virtual {p0, v0, v1, p1, v2}, Lorg/apache/log4j/Category;->a(Ljava/lang/String;Lorg/apache/log4j/Priority;Ljava/lang/Object;Ljava/lang/Throwable;)V
} // :cond_1
return;
} // .end method
public void fatal ( java.lang.Object p0, java.lang.Throwable p1 ) {
/* .locals 2 */
/* .line 4 */
v0 = this.e;
v0 = /* const v1, 0xc350 */
if ( v0 != null) { // if-eqz v0, :cond_0
	 return;
	 /* .line 5 */
} // :cond_0
v0 = org.apache.log4j.Level.FATAL;
(( org.apache.log4j.Category ) p0 ).getEffectiveLevel ( ); // invoke-virtual {p0}, Lorg/apache/log4j/Category;->getEffectiveLevel()Lorg/apache/log4j/Level;
v0 = (( org.apache.log4j.Priority ) v0 ).isGreaterOrEqual ( v1 ); // invoke-virtual {v0, v1}, Lorg/apache/log4j/Priority;->isGreaterOrEqual(Lorg/apache/log4j/Priority;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
	 /* .line 6 */
	 v0 = org.apache.log4j.Category.h;
	 v1 = org.apache.log4j.Level.FATAL;
	 (( org.apache.log4j.Category ) p0 ).a ( v0, v1, p1, p2 ); // invoke-virtual {p0, v0, v1, p1, p2}, Lorg/apache/log4j/Category;->a(Ljava/lang/String;Lorg/apache/log4j/Priority;Ljava/lang/Object;Ljava/lang/Throwable;)V
} // :cond_1
return;
} // .end method
public Boolean getAdditivity ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Lorg/apache/log4j/Category;->g:Z */
} // .end method
public synchronized java.util.Enumeration getAllAppenders ( ) {
/* .locals 1 */
/* monitor-enter p0 */
/* .line 1 */
try { // :try_start_0
	 v0 = this.f;
	 /* if-nez v0, :cond_0 */
	 /* .line 2 */
	 org.apache.log4j.helpers.NullEnumeration .getInstance ( );
	 /* :try_end_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 /* monitor-exit p0 */
	 /* .line 3 */
} // :cond_0
try { // :try_start_1
	 v0 = this.f;
	 (( org.apache.log4j.helpers.AppenderAttachableImpl ) v0 ).getAllAppenders ( ); // invoke-virtual {v0}, Lorg/apache/log4j/helpers/AppenderAttachableImpl;->getAllAppenders()Ljava/util/Enumeration;
	 /* :try_end_1 */
	 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
	 /* monitor-exit p0 */
	 /* :catchall_0 */
	 /* move-exception v0 */
	 /* monitor-exit p0 */
	 /* throw v0 */
} // .end method
public synchronized org.apache.log4j.Appender getAppender ( java.lang.String p0 ) {
	 /* .locals 1 */
	 /* monitor-enter p0 */
	 /* .line 1 */
	 try { // :try_start_0
		 v0 = this.f;
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 /* if-nez p1, :cond_0 */
			 /* .line 2 */
		 } // :cond_0
		 v0 = this.f;
		 (( org.apache.log4j.helpers.AppenderAttachableImpl ) v0 ).getAppender ( p1 ); // invoke-virtual {v0, p1}, Lorg/apache/log4j/helpers/AppenderAttachableImpl;->getAppender(Ljava/lang/String;)Lorg/apache/log4j/Appender;
		 /* :try_end_0 */
		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
		 /* monitor-exit p0 */
	 } // :cond_1
} // :goto_0
int p1 = 0; // const/4 p1, 0x0
/* .line 3 */
/* monitor-exit p0 */
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit p0 */
/* throw p1 */
} // .end method
public org.apache.log4j.Priority getChainedPriority ( ) {
/* .locals 2 */
/* move-object v0, p0 */
} // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 1 */
v1 = this.b;
if ( v1 != null) { // if-eqz v1, :cond_0
	 /* .line 2 */
	 v0 = this.b;
	 /* .line 3 */
} // :cond_0
v0 = this.c;
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // .end method
public org.apache.log4j.Level getEffectiveLevel ( ) {
/* .locals 2 */
/* move-object v0, p0 */
} // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 1 */
v1 = this.b;
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 2 */
v0 = this.b;
/* .line 3 */
} // :cond_0
v0 = this.c;
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // .end method
public org.apache.log4j.spi.LoggerRepository getHierarchy ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.e;
} // .end method
public final org.apache.log4j.Level getLevel ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
} // .end method
public org.apache.log4j.spi.LoggerRepository getLoggerRepository ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.e;
} // .end method
public final java.lang.String getName ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
} // .end method
public final org.apache.log4j.Category getParent ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.c;
} // .end method
public final org.apache.log4j.Level getPriority ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
} // .end method
public java.util.ResourceBundle getResourceBundle ( ) {
/* .locals 2 */
/* move-object v0, p0 */
} // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 1 */
v1 = this.d;
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 2 */
} // :cond_0
v0 = this.c;
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // .end method
public void info ( java.lang.Object p0 ) {
/* .locals 3 */
/* .line 1 */
v0 = this.e;
v0 = /* const/16 v1, 0x4e20 */
if ( v0 != null) { // if-eqz v0, :cond_0
return;
/* .line 2 */
} // :cond_0
v0 = org.apache.log4j.Level.INFO;
(( org.apache.log4j.Category ) p0 ).getEffectiveLevel ( ); // invoke-virtual {p0}, Lorg/apache/log4j/Category;->getEffectiveLevel()Lorg/apache/log4j/Level;
v0 = (( org.apache.log4j.Priority ) v0 ).isGreaterOrEqual ( v1 ); // invoke-virtual {v0, v1}, Lorg/apache/log4j/Priority;->isGreaterOrEqual(Lorg/apache/log4j/Priority;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 3 */
v0 = org.apache.log4j.Category.h;
v1 = org.apache.log4j.Level.INFO;
int v2 = 0; // const/4 v2, 0x0
(( org.apache.log4j.Category ) p0 ).a ( v0, v1, p1, v2 ); // invoke-virtual {p0, v0, v1, p1, v2}, Lorg/apache/log4j/Category;->a(Ljava/lang/String;Lorg/apache/log4j/Priority;Ljava/lang/Object;Ljava/lang/Throwable;)V
} // :cond_1
return;
} // .end method
public void info ( java.lang.Object p0, java.lang.Throwable p1 ) {
/* .locals 2 */
/* .line 4 */
v0 = this.e;
v0 = /* const/16 v1, 0x4e20 */
if ( v0 != null) { // if-eqz v0, :cond_0
return;
/* .line 5 */
} // :cond_0
v0 = org.apache.log4j.Level.INFO;
(( org.apache.log4j.Category ) p0 ).getEffectiveLevel ( ); // invoke-virtual {p0}, Lorg/apache/log4j/Category;->getEffectiveLevel()Lorg/apache/log4j/Level;
v0 = (( org.apache.log4j.Priority ) v0 ).isGreaterOrEqual ( v1 ); // invoke-virtual {v0, v1}, Lorg/apache/log4j/Priority;->isGreaterOrEqual(Lorg/apache/log4j/Priority;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 6 */
v0 = org.apache.log4j.Category.h;
v1 = org.apache.log4j.Level.INFO;
(( org.apache.log4j.Category ) p0 ).a ( v0, v1, p1, p2 ); // invoke-virtual {p0, v0, v1, p1, p2}, Lorg/apache/log4j/Category;->a(Ljava/lang/String;Lorg/apache/log4j/Priority;Ljava/lang/Object;Ljava/lang/Throwable;)V
} // :cond_1
return;
} // .end method
public Boolean isAttached ( org.apache.log4j.Appender p0 ) {
/* .locals 1 */
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 1 */
v0 = this.f;
/* if-nez v0, :cond_0 */
/* .line 2 */
} // :cond_0
p1 = (( org.apache.log4j.helpers.AppenderAttachableImpl ) v0 ).isAttached ( p1 ); // invoke-virtual {v0, p1}, Lorg/apache/log4j/helpers/AppenderAttachableImpl;->isAttached(Lorg/apache/log4j/Appender;)Z
} // :cond_1
} // :goto_0
int p1 = 0; // const/4 p1, 0x0
} // .end method
public Boolean isDebugEnabled ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.e;
v0 = /* const/16 v1, 0x2710 */
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
} // :cond_0
v0 = org.apache.log4j.Level.DEBUG;
(( org.apache.log4j.Category ) p0 ).getEffectiveLevel ( ); // invoke-virtual {p0}, Lorg/apache/log4j/Category;->getEffectiveLevel()Lorg/apache/log4j/Level;
v0 = (( org.apache.log4j.Priority ) v0 ).isGreaterOrEqual ( v1 ); // invoke-virtual {v0, v1}, Lorg/apache/log4j/Priority;->isGreaterOrEqual(Lorg/apache/log4j/Priority;)Z
} // .end method
public Boolean isEnabledFor ( org.apache.log4j.Priority p0 ) {
/* .locals 2 */
/* .line 1 */
v0 = this.e;
v0 = /* iget v1, p1, Lorg/apache/log4j/Priority;->b:I */
if ( v0 != null) { // if-eqz v0, :cond_0
int p1 = 0; // const/4 p1, 0x0
/* .line 2 */
} // :cond_0
(( org.apache.log4j.Category ) p0 ).getEffectiveLevel ( ); // invoke-virtual {p0}, Lorg/apache/log4j/Category;->getEffectiveLevel()Lorg/apache/log4j/Level;
p1 = (( org.apache.log4j.Priority ) p1 ).isGreaterOrEqual ( v0 ); // invoke-virtual {p1, v0}, Lorg/apache/log4j/Priority;->isGreaterOrEqual(Lorg/apache/log4j/Priority;)Z
} // .end method
public Boolean isInfoEnabled ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.e;
v0 = /* const/16 v1, 0x4e20 */
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
} // :cond_0
v0 = org.apache.log4j.Level.INFO;
(( org.apache.log4j.Category ) p0 ).getEffectiveLevel ( ); // invoke-virtual {p0}, Lorg/apache/log4j/Category;->getEffectiveLevel()Lorg/apache/log4j/Level;
v0 = (( org.apache.log4j.Priority ) v0 ).isGreaterOrEqual ( v1 ); // invoke-virtual {v0, v1}, Lorg/apache/log4j/Priority;->isGreaterOrEqual(Lorg/apache/log4j/Priority;)Z
} // .end method
public void l7dlog ( org.apache.log4j.Priority p0, java.lang.String p1, java.lang.Throwable p2 ) {
/* .locals 2 */
/* .line 1 */
v0 = this.e;
v0 = /* iget v1, p1, Lorg/apache/log4j/Priority;->b:I */
if ( v0 != null) { // if-eqz v0, :cond_0
return;
/* .line 2 */
} // :cond_0
(( org.apache.log4j.Category ) p0 ).getEffectiveLevel ( ); // invoke-virtual {p0}, Lorg/apache/log4j/Category;->getEffectiveLevel()Lorg/apache/log4j/Level;
v0 = (( org.apache.log4j.Priority ) p1 ).isGreaterOrEqual ( v0 ); // invoke-virtual {p1, v0}, Lorg/apache/log4j/Priority;->isGreaterOrEqual(Lorg/apache/log4j/Priority;)Z
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 3 */
(( org.apache.log4j.Category ) p0 ).a ( p2 ); // invoke-virtual {p0, p2}, Lorg/apache/log4j/Category;->a(Ljava/lang/String;)Ljava/lang/String;
/* if-nez v0, :cond_1 */
} // :cond_1
/* move-object p2, v0 */
/* .line 4 */
} // :goto_0
v0 = org.apache.log4j.Category.h;
(( org.apache.log4j.Category ) p0 ).a ( v0, p1, p2, p3 ); // invoke-virtual {p0, v0, p1, p2, p3}, Lorg/apache/log4j/Category;->a(Ljava/lang/String;Lorg/apache/log4j/Priority;Ljava/lang/Object;Ljava/lang/Throwable;)V
} // :cond_2
return;
} // .end method
public void l7dlog ( org.apache.log4j.Priority p0, java.lang.String p1, java.lang.Object[] p2, java.lang.Throwable p3 ) {
/* .locals 2 */
/* .line 5 */
v0 = this.e;
v0 = /* iget v1, p1, Lorg/apache/log4j/Priority;->b:I */
if ( v0 != null) { // if-eqz v0, :cond_0
return;
/* .line 6 */
} // :cond_0
(( org.apache.log4j.Category ) p0 ).getEffectiveLevel ( ); // invoke-virtual {p0}, Lorg/apache/log4j/Category;->getEffectiveLevel()Lorg/apache/log4j/Level;
v0 = (( org.apache.log4j.Priority ) p1 ).isGreaterOrEqual ( v0 ); // invoke-virtual {p1, v0}, Lorg/apache/log4j/Priority;->isGreaterOrEqual(Lorg/apache/log4j/Priority;)Z
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 7 */
(( org.apache.log4j.Category ) p0 ).a ( p2 ); // invoke-virtual {p0, p2}, Lorg/apache/log4j/Category;->a(Ljava/lang/String;)Ljava/lang/String;
/* if-nez v0, :cond_1 */
/* .line 8 */
} // :cond_1
java.text.MessageFormat .format ( v0,p3 );
/* .line 9 */
} // :goto_0
p3 = org.apache.log4j.Category.h;
(( org.apache.log4j.Category ) p0 ).a ( p3, p1, p2, p4 ); // invoke-virtual {p0, p3, p1, p2, p4}, Lorg/apache/log4j/Category;->a(Ljava/lang/String;Lorg/apache/log4j/Priority;Ljava/lang/Object;Ljava/lang/Throwable;)V
} // :cond_2
return;
} // .end method
public void log ( java.lang.String p0, org.apache.log4j.Priority p1, java.lang.Object p2, java.lang.Throwable p3 ) {
/* .locals 2 */
/* .line 7 */
v0 = this.e;
v0 = /* iget v1, p2, Lorg/apache/log4j/Priority;->b:I */
if ( v0 != null) { // if-eqz v0, :cond_0
return;
/* .line 8 */
} // :cond_0
(( org.apache.log4j.Category ) p0 ).getEffectiveLevel ( ); // invoke-virtual {p0}, Lorg/apache/log4j/Category;->getEffectiveLevel()Lorg/apache/log4j/Level;
v0 = (( org.apache.log4j.Priority ) p2 ).isGreaterOrEqual ( v0 ); // invoke-virtual {p2, v0}, Lorg/apache/log4j/Priority;->isGreaterOrEqual(Lorg/apache/log4j/Priority;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 9 */
(( org.apache.log4j.Category ) p0 ).a ( p1, p2, p3, p4 ); // invoke-virtual {p0, p1, p2, p3, p4}, Lorg/apache/log4j/Category;->a(Ljava/lang/String;Lorg/apache/log4j/Priority;Ljava/lang/Object;Ljava/lang/Throwable;)V
} // :cond_1
return;
} // .end method
public void log ( org.apache.log4j.Priority p0, java.lang.Object p1 ) {
/* .locals 2 */
/* .line 4 */
v0 = this.e;
v0 = /* iget v1, p1, Lorg/apache/log4j/Priority;->b:I */
if ( v0 != null) { // if-eqz v0, :cond_0
return;
/* .line 5 */
} // :cond_0
(( org.apache.log4j.Category ) p0 ).getEffectiveLevel ( ); // invoke-virtual {p0}, Lorg/apache/log4j/Category;->getEffectiveLevel()Lorg/apache/log4j/Level;
v0 = (( org.apache.log4j.Priority ) p1 ).isGreaterOrEqual ( v0 ); // invoke-virtual {p1, v0}, Lorg/apache/log4j/Priority;->isGreaterOrEqual(Lorg/apache/log4j/Priority;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 6 */
v0 = org.apache.log4j.Category.h;
int v1 = 0; // const/4 v1, 0x0
(( org.apache.log4j.Category ) p0 ).a ( v0, p1, p2, v1 ); // invoke-virtual {p0, v0, p1, p2, v1}, Lorg/apache/log4j/Category;->a(Ljava/lang/String;Lorg/apache/log4j/Priority;Ljava/lang/Object;Ljava/lang/Throwable;)V
} // :cond_1
return;
} // .end method
public void log ( org.apache.log4j.Priority p0, java.lang.Object p1, java.lang.Throwable p2 ) {
/* .locals 2 */
/* .line 1 */
v0 = this.e;
v0 = /* iget v1, p1, Lorg/apache/log4j/Priority;->b:I */
if ( v0 != null) { // if-eqz v0, :cond_0
return;
/* .line 2 */
} // :cond_0
(( org.apache.log4j.Category ) p0 ).getEffectiveLevel ( ); // invoke-virtual {p0}, Lorg/apache/log4j/Category;->getEffectiveLevel()Lorg/apache/log4j/Level;
v0 = (( org.apache.log4j.Priority ) p1 ).isGreaterOrEqual ( v0 ); // invoke-virtual {p1, v0}, Lorg/apache/log4j/Priority;->isGreaterOrEqual(Lorg/apache/log4j/Priority;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 3 */
v0 = org.apache.log4j.Category.h;
(( org.apache.log4j.Category ) p0 ).a ( v0, p1, p2, p3 ); // invoke-virtual {p0, v0, p1, p2, p3}, Lorg/apache/log4j/Category;->a(Ljava/lang/String;Lorg/apache/log4j/Priority;Ljava/lang/Object;Ljava/lang/Throwable;)V
} // :cond_1
return;
} // .end method
public synchronized void removeAllAppenders ( ) {
/* .locals 3 */
/* monitor-enter p0 */
/* .line 1 */
try { // :try_start_0
v0 = this.f;
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 2 */
/* new-instance v0, Ljava/util/Vector; */
/* invoke-direct {v0}, Ljava/util/Vector;-><init>()V */
/* .line 3 */
v1 = this.f;
(( org.apache.log4j.helpers.AppenderAttachableImpl ) v1 ).getAllAppenders ( ); // invoke-virtual {v1}, Lorg/apache/log4j/helpers/AppenderAttachableImpl;->getAllAppenders()Ljava/util/Enumeration;
} // :goto_0
v2 = if ( v1 != null) { // if-eqz v1, :cond_0
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 4 */
(( java.util.Vector ) v0 ).add ( v2 ); // invoke-virtual {v0, v2}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z
/* .line 5 */
} // :cond_0
v1 = this.f;
(( org.apache.log4j.helpers.AppenderAttachableImpl ) v1 ).removeAllAppenders ( ); // invoke-virtual {v1}, Lorg/apache/log4j/helpers/AppenderAttachableImpl;->removeAllAppenders()V
/* .line 6 */
(( java.util.Vector ) v0 ).elements ( ); // invoke-virtual {v0}, Ljava/util/Vector;->elements()Ljava/util/Enumeration;
v1 = } // :goto_1
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 7 */
/* check-cast v1, Lorg/apache/log4j/Appender; */
(( org.apache.log4j.Category ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Lorg/apache/log4j/Category;->a(Lorg/apache/log4j/Appender;)V
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
/* .line 8 */
this.f = v0;
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 9 */
} // :cond_2
/* monitor-exit p0 */
return;
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
public synchronized void removeAppender ( java.lang.String p0 ) {
/* .locals 2 */
/* monitor-enter p0 */
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 7 */
try { // :try_start_0
v0 = this.f;
/* if-nez v0, :cond_0 */
/* .line 8 */
} // :cond_0
v0 = this.f;
(( org.apache.log4j.helpers.AppenderAttachableImpl ) v0 ).getAppender ( p1 ); // invoke-virtual {v0, p1}, Lorg/apache/log4j/helpers/AppenderAttachableImpl;->getAppender(Ljava/lang/String;)Lorg/apache/log4j/Appender;
/* .line 9 */
v1 = this.f;
(( org.apache.log4j.helpers.AppenderAttachableImpl ) v1 ).removeAppender ( p1 ); // invoke-virtual {v1, p1}, Lorg/apache/log4j/helpers/AppenderAttachableImpl;->removeAppender(Ljava/lang/String;)V
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 10 */
(( org.apache.log4j.Category ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/log4j/Category;->a(Lorg/apache/log4j/Appender;)V
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 11 */
} // :cond_1
/* monitor-exit p0 */
return;
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit p0 */
/* throw p1 */
/* .line 12 */
} // :cond_2
} // :goto_0
/* monitor-exit p0 */
return;
} // .end method
public synchronized void removeAppender ( org.apache.log4j.Appender p0 ) {
/* .locals 2 */
/* monitor-enter p0 */
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 1 */
try { // :try_start_0
v0 = this.f;
/* if-nez v0, :cond_0 */
/* .line 2 */
} // :cond_0
v0 = this.f;
v0 = (( org.apache.log4j.helpers.AppenderAttachableImpl ) v0 ).isAttached ( p1 ); // invoke-virtual {v0, p1}, Lorg/apache/log4j/helpers/AppenderAttachableImpl;->isAttached(Lorg/apache/log4j/Appender;)Z
/* .line 3 */
v1 = this.f;
(( org.apache.log4j.helpers.AppenderAttachableImpl ) v1 ).removeAppender ( p1 ); // invoke-virtual {v1, p1}, Lorg/apache/log4j/helpers/AppenderAttachableImpl;->removeAppender(Lorg/apache/log4j/Appender;)V
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 4 */
(( org.apache.log4j.Category ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/log4j/Category;->a(Lorg/apache/log4j/Appender;)V
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 5 */
} // :cond_1
/* monitor-exit p0 */
return;
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit p0 */
/* throw p1 */
/* .line 6 */
} // :cond_2
} // :goto_0
/* monitor-exit p0 */
return;
} // .end method
public void setAdditivity ( Boolean p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput-boolean p1, p0, Lorg/apache/log4j/Category;->g:Z */
return;
} // .end method
public void setLevel ( org.apache.log4j.Level p0 ) {
/* .locals 0 */
/* .line 1 */
this.b = p1;
return;
} // .end method
public void setPriority ( org.apache.log4j.Priority p0 ) {
/* .locals 0 */
/* .line 1 */
/* check-cast p1, Lorg/apache/log4j/Level; */
this.b = p1;
return;
} // .end method
public void setResourceBundle ( java.util.ResourceBundle p0 ) {
/* .locals 0 */
/* .line 1 */
this.d = p1;
return;
} // .end method
public void warn ( java.lang.Object p0 ) {
/* .locals 3 */
/* .line 1 */
v0 = this.e;
v0 = /* const/16 v1, 0x7530 */
if ( v0 != null) { // if-eqz v0, :cond_0
return;
/* .line 2 */
} // :cond_0
v0 = org.apache.log4j.Level.WARN;
(( org.apache.log4j.Category ) p0 ).getEffectiveLevel ( ); // invoke-virtual {p0}, Lorg/apache/log4j/Category;->getEffectiveLevel()Lorg/apache/log4j/Level;
v0 = (( org.apache.log4j.Priority ) v0 ).isGreaterOrEqual ( v1 ); // invoke-virtual {v0, v1}, Lorg/apache/log4j/Priority;->isGreaterOrEqual(Lorg/apache/log4j/Priority;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 3 */
v0 = org.apache.log4j.Category.h;
v1 = org.apache.log4j.Level.WARN;
int v2 = 0; // const/4 v2, 0x0
(( org.apache.log4j.Category ) p0 ).a ( v0, v1, p1, v2 ); // invoke-virtual {p0, v0, v1, p1, v2}, Lorg/apache/log4j/Category;->a(Ljava/lang/String;Lorg/apache/log4j/Priority;Ljava/lang/Object;Ljava/lang/Throwable;)V
} // :cond_1
return;
} // .end method
public void warn ( java.lang.Object p0, java.lang.Throwable p1 ) {
/* .locals 2 */
/* .line 4 */
v0 = this.e;
v0 = /* const/16 v1, 0x7530 */
if ( v0 != null) { // if-eqz v0, :cond_0
return;
/* .line 5 */
} // :cond_0
v0 = org.apache.log4j.Level.WARN;
(( org.apache.log4j.Category ) p0 ).getEffectiveLevel ( ); // invoke-virtual {p0}, Lorg/apache/log4j/Category;->getEffectiveLevel()Lorg/apache/log4j/Level;
v0 = (( org.apache.log4j.Priority ) v0 ).isGreaterOrEqual ( v1 ); // invoke-virtual {v0, v1}, Lorg/apache/log4j/Priority;->isGreaterOrEqual(Lorg/apache/log4j/Priority;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 6 */
v0 = org.apache.log4j.Category.h;
v1 = org.apache.log4j.Level.WARN;
(( org.apache.log4j.Category ) p0 ).a ( v0, v1, p1, p2 ); // invoke-virtual {p0, v0, v1, p1, p2}, Lorg/apache/log4j/Category;->a(Ljava/lang/String;Lorg/apache/log4j/Priority;Ljava/lang/Object;Ljava/lang/Throwable;)V
} // :cond_1
return;
} // .end method
