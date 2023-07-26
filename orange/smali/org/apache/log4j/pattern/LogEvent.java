public class org.apache.log4j.pattern.LogEvent implements java.io.Serializable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # static fields */
	 public static Long l;
	 /* # instance fields */
	 public transient org.apache.log4j.Category b;
	 public java.lang.String c;
	 public final java.lang.String categoryName;
	 public java.util.Hashtable d;
	 public Boolean e;
	 public Boolean f;
	 public final transient java.lang.String fqnOfCategoryClass;
	 public transient java.lang.Object g;
	 public java.lang.String h;
	 public java.lang.String i;
	 public org.apache.log4j.spi.ThrowableInformation j;
	 public org.apache.log4j.spi.LocationInfo k;
	 public transient org.apache.log4j.Priority level;
	 public final Long timeStamp;
	 /* # direct methods */
	 public static org.apache.log4j.pattern.LogEvent ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 java.lang.System .currentTimeMillis ( );
		 /* move-result-wide v0 */
		 /* sput-wide v0, Lorg/apache/log4j/pattern/LogEvent;->l:J */
		 /* .line 2 */
		 v0 = java.lang.Integer.TYPE;
		 /* .line 3 */
		 /* new-instance v0, Ljava/util/Hashtable; */
		 int v1 = 3; // const/4 v1, 0x3
		 /* invoke-direct {v0, v1}, Ljava/util/Hashtable;-><init>(I)V */
		 return;
	 } // .end method
	 public org.apache.log4j.pattern.LogEvent ( ) {
		 /* .locals 1 */
		 /* .line 11 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 int v0 = 1; // const/4 v0, 0x1
		 /* .line 12 */
		 /* iput-boolean v0, p0, Lorg/apache/log4j/pattern/LogEvent;->e:Z */
		 /* .line 13 */
		 /* iput-boolean v0, p0, Lorg/apache/log4j/pattern/LogEvent;->f:Z */
		 /* .line 14 */
		 this.fqnOfCategoryClass = p1;
		 /* .line 15 */
		 this.b = p2;
		 /* .line 16 */
		 (( org.apache.log4j.Category ) p2 ).getName ( ); // invoke-virtual {p2}, Lorg/apache/log4j/Category;->getName()Ljava/lang/String;
		 this.categoryName = p1;
		 /* .line 17 */
		 this.level = p5;
		 /* .line 18 */
		 this.g = p6;
		 if ( p7 != null) { // if-eqz p7, :cond_0
			 /* .line 19 */
			 /* new-instance p1, Lorg/apache/log4j/spi/ThrowableInformation; */
			 /* invoke-direct {p1, p7}, Lorg/apache/log4j/spi/ThrowableInformation;-><init>(Ljava/lang/Throwable;)V */
			 this.j = p1;
			 /* .line 20 */
		 } // :cond_0
		 /* iput-wide p3, p0, Lorg/apache/log4j/pattern/LogEvent;->timeStamp:J */
		 return;
	 } // .end method
	 public org.apache.log4j.pattern.LogEvent ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 int v0 = 1; // const/4 v0, 0x1
		 /* .line 2 */
		 /* iput-boolean v0, p0, Lorg/apache/log4j/pattern/LogEvent;->e:Z */
		 /* .line 3 */
		 /* iput-boolean v0, p0, Lorg/apache/log4j/pattern/LogEvent;->f:Z */
		 /* .line 4 */
		 this.fqnOfCategoryClass = p1;
		 /* .line 5 */
		 this.b = p2;
		 /* .line 6 */
		 (( org.apache.log4j.Category ) p2 ).getName ( ); // invoke-virtual {p2}, Lorg/apache/log4j/Category;->getName()Ljava/lang/String;
		 this.categoryName = p1;
		 /* .line 7 */
		 this.level = p3;
		 /* .line 8 */
		 this.g = p4;
		 if ( p5 != null) { // if-eqz p5, :cond_0
			 /* .line 9 */
			 /* new-instance p1, Lorg/apache/log4j/spi/ThrowableInformation; */
			 /* invoke-direct {p1, p5}, Lorg/apache/log4j/spi/ThrowableInformation;-><init>(Ljava/lang/Throwable;)V */
			 this.j = p1;
			 /* .line 10 */
		 } // :cond_0
		 java.lang.System .currentTimeMillis ( );
		 /* move-result-wide p1 */
		 /* iput-wide p1, p0, Lorg/apache/log4j/pattern/LogEvent;->timeStamp:J */
		 return;
	 } // .end method
	 public org.apache.log4j.pattern.LogEvent ( ) {
		 /* .locals 1 */
		 /* .line 21 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 int v0 = 1; // const/4 v0, 0x1
		 /* .line 22 */
		 /* iput-boolean v0, p0, Lorg/apache/log4j/pattern/LogEvent;->e:Z */
		 /* .line 23 */
		 /* iput-boolean v0, p0, Lorg/apache/log4j/pattern/LogEvent;->f:Z */
		 /* .line 24 */
		 this.fqnOfCategoryClass = p1;
		 /* .line 25 */
		 this.b = p2;
		 if ( p2 != null) { // if-eqz p2, :cond_0
			 /* .line 26 */
			 (( org.apache.log4j.Category ) p2 ).getName ( ); // invoke-virtual {p2}, Lorg/apache/log4j/Category;->getName()Ljava/lang/String;
			 this.categoryName = p1;
		 } // :cond_0
		 int p1 = 0; // const/4 p1, 0x0
		 /* .line 27 */
		 this.categoryName = p1;
		 /* .line 28 */
	 } // :goto_0
	 this.level = p5;
	 /* .line 29 */
	 this.g = p6;
	 if ( p8 != null) { // if-eqz p8, :cond_1
		 /* .line 30 */
		 this.j = p8;
		 /* .line 31 */
	 } // :cond_1
	 /* iput-wide p3, p0, Lorg/apache/log4j/pattern/LogEvent;->timeStamp:J */
	 /* .line 32 */
	 this.i = p7;
	 int p1 = 0; // const/4 p1, 0x0
	 /* .line 33 */
	 /* iput-boolean p1, p0, Lorg/apache/log4j/pattern/LogEvent;->e:Z */
	 /* .line 34 */
	 this.c = p9;
	 /* .line 35 */
	 this.k = p10;
	 /* .line 36 */
	 /* iput-boolean p1, p0, Lorg/apache/log4j/pattern/LogEvent;->f:Z */
	 if ( p11 != null) { // if-eqz p11, :cond_2
		 /* .line 37 */
		 /* new-instance p1, Ljava/util/Hashtable; */
		 /* invoke-direct {p1, p11}, Ljava/util/Hashtable;-><init>(Ljava/util/Map;)V */
		 this.d = p1;
	 } // :cond_2
	 return;
} // .end method
public static Long getStartTime ( ) {
	 /* .locals 2 */
	 /* .line 1 */
	 /* sget-wide v0, Lorg/apache/log4j/pattern/LogEvent;->l:J */
	 /* return-wide v0 */
} // .end method
/* # virtual methods */
public java.lang.String getFQNOfLoggerClass ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = this.fqnOfCategoryClass;
} // .end method
public org.apache.log4j.Level getLevel ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = this.level;
	 /* check-cast v0, Lorg/apache/log4j/Level; */
} // .end method
public org.apache.log4j.spi.LocationInfo getLocationInformation ( ) {
	 /* .locals 3 */
	 /* .line 1 */
	 v0 = this.k;
	 /* if-nez v0, :cond_0 */
	 /* .line 2 */
	 /* new-instance v0, Lorg/apache/log4j/spi/LocationInfo; */
	 /* new-instance v1, Ljava/lang/Throwable; */
	 /* invoke-direct {v1}, Ljava/lang/Throwable;-><init>()V */
	 v2 = this.fqnOfCategoryClass;
	 /* invoke-direct {v0, v1, v2}, Lorg/apache/log4j/spi/LocationInfo;-><init>(Ljava/lang/Throwable;Ljava/lang/String;)V */
	 this.k = v0;
	 /* .line 3 */
} // :cond_0
v0 = this.k;
} // .end method
public java.lang.String getLoggerName ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.categoryName;
} // .end method
public java.lang.Object getMDC ( java.lang.String p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.d;
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 2 */
	 (( java.util.Hashtable ) v0 ).get ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 3 */
	 } // :cond_0
	 org.apache.log4j.MDC .get ( p1 );
} // .end method
public void getMDCCopy ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 /* iget-boolean v0, p0, Lorg/apache/log4j/pattern/LogEvent;->f:Z */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 2 */
		 /* iput-boolean v0, p0, Lorg/apache/log4j/pattern/LogEvent;->f:Z */
		 /* .line 3 */
		 org.apache.log4j.MDC .getContext ( );
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 4 */
			 (( java.util.Hashtable ) v0 ).clone ( ); // invoke-virtual {v0}, Ljava/util/Hashtable;->clone()Ljava/lang/Object;
			 /* check-cast v0, Ljava/util/Hashtable; */
			 this.d = v0;
		 } // :cond_0
		 return;
	 } // .end method
	 public java.lang.Object getMessage ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.g;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 2 */
		 } // :cond_0
		 (( org.apache.log4j.pattern.LogEvent ) p0 ).getRenderedMessage ( ); // invoke-virtual {p0}, Lorg/apache/log4j/pattern/LogEvent;->getRenderedMessage()Ljava/lang/String;
	 } // .end method
	 public java.lang.String getNDC ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* iget-boolean v0, p0, Lorg/apache/log4j/pattern/LogEvent;->e:Z */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 int v0 = 0; // const/4 v0, 0x0
			 /* .line 2 */
			 /* iput-boolean v0, p0, Lorg/apache/log4j/pattern/LogEvent;->e:Z */
			 /* .line 3 */
			 org.apache.log4j.NDC .get ( );
			 this.c = v0;
			 /* .line 4 */
		 } // :cond_0
		 v0 = this.c;
	 } // .end method
	 public java.util.Map getProperties ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 (( org.apache.log4j.pattern.LogEvent ) p0 ).getMDCCopy ( ); // invoke-virtual {p0}, Lorg/apache/log4j/pattern/LogEvent;->getMDCCopy()V
		 /* .line 2 */
		 v0 = this.d;
		 /* if-nez v0, :cond_0 */
		 /* .line 3 */
		 /* new-instance v0, Ljava/util/HashMap; */
		 /* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
		 /* .line 4 */
	 } // :cond_0
	 java.util.Collections .unmodifiableMap ( v0 );
} // .end method
public final java.lang.String getProperty ( java.lang.String p0 ) {
	 /* .locals 0 */
	 /* .line 1 */
	 (( org.apache.log4j.pattern.LogEvent ) p0 ).getMDC ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/log4j/pattern/LogEvent;->getMDC(Ljava/lang/String;)Ljava/lang/Object;
	 if ( p1 != null) { // if-eqz p1, :cond_0
		 /* .line 2 */
		 (( java.lang.Object ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;
	 } // :cond_0
	 int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
public java.util.Set getPropertyKeySet ( ) {
/* .locals 1 */
/* .line 1 */
(( org.apache.log4j.pattern.LogEvent ) p0 ).getProperties ( ); // invoke-virtual {p0}, Lorg/apache/log4j/pattern/LogEvent;->getProperties()Ljava/util/Map;
} // .end method
public java.lang.String getRenderedMessage ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.h;
/* if-nez v0, :cond_2 */
v0 = this.g;
if ( v0 != null) { // if-eqz v0, :cond_2
	 /* .line 2 */
	 /* instance-of v1, v0, Ljava/lang/String; */
	 if ( v1 != null) { // if-eqz v1, :cond_0
		 /* .line 3 */
		 /* check-cast v0, Ljava/lang/String; */
		 this.h = v0;
		 /* .line 4 */
	 } // :cond_0
	 v0 = this.b;
	 (( org.apache.log4j.Category ) v0 ).getLoggerRepository ( ); // invoke-virtual {v0}, Lorg/apache/log4j/Category;->getLoggerRepository()Lorg/apache/log4j/spi/LoggerRepository;
	 /* .line 5 */
	 /* instance-of v1, v0, Lorg/apache/log4j/spi/RendererSupport; */
	 if ( v1 != null) { // if-eqz v1, :cond_1
		 /* .line 6 */
		 /* check-cast v0, Lorg/apache/log4j/spi/RendererSupport; */
		 /* .line 7 */
		 v1 = this.g;
		 (( org.apache.log4j.or.RendererMap ) v0 ).findAndRender ( v1 ); // invoke-virtual {v0, v1}, Lorg/apache/log4j/or/RendererMap;->findAndRender(Ljava/lang/Object;)Ljava/lang/String;
		 this.h = v0;
		 /* .line 8 */
	 } // :cond_1
	 v0 = this.g;
	 (( java.lang.Object ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;
	 this.h = v0;
	 /* .line 9 */
} // :cond_2
} // :goto_0
v0 = this.h;
} // .end method
public java.lang.String getThreadName ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.i;
/* if-nez v0, :cond_0 */
/* .line 2 */
java.lang.Thread .currentThread ( );
(( java.lang.Thread ) v0 ).getName ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->getName()Ljava/lang/String;
this.i = v0;
/* .line 3 */
} // :cond_0
v0 = this.i;
} // .end method
public org.apache.log4j.spi.ThrowableInformation getThrowableInformation ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.j;
} // .end method
public java.lang.String getThrowableStrRep ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.j;
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
} // :cond_0
(( org.apache.log4j.spi.ThrowableInformation ) v0 ).getThrowableStrRep ( ); // invoke-virtual {v0}, Lorg/apache/log4j/spi/ThrowableInformation;->getThrowableStrRep()[Ljava/lang/String;
} // .end method
public final Long getTimeStamp ( ) {
/* .locals 2 */
/* .line 1 */
/* iget-wide v0, p0, Lorg/apache/log4j/pattern/LogEvent;->timeStamp:J */
/* return-wide v0 */
} // .end method
public final Boolean locationInformationExists ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.k;
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public final void setProperty ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.d;
/* if-nez v0, :cond_0 */
/* .line 2 */
(( org.apache.log4j.pattern.LogEvent ) p0 ).getMDCCopy ( ); // invoke-virtual {p0}, Lorg/apache/log4j/pattern/LogEvent;->getMDCCopy()V
/* .line 3 */
} // :cond_0
v0 = this.d;
/* if-nez v0, :cond_1 */
/* .line 4 */
/* new-instance v0, Ljava/util/Hashtable; */
/* invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V */
this.d = v0;
/* .line 5 */
} // :cond_1
v0 = this.d;
(( java.util.Hashtable ) v0 ).put ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
return;
} // .end method
