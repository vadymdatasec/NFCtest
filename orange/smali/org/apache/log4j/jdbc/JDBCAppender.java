public class org.apache.log4j.jdbc.JDBCAppender extends org.apache.log4j.AppenderSkeleton implements org.apache.log4j.Appender {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public java.lang.String h;
	 public java.lang.String i;
	 public java.lang.String j;
	 public java.sql.Connection k;
	 public java.lang.String l;
	 public Integer m;
	 public java.util.ArrayList n;
	 public java.util.ArrayList o;
	 public Boolean p;
	 /* # direct methods */
	 public org.apache.log4j.jdbc.JDBCAppender ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Lorg/apache/log4j/AppenderSkeleton;-><init>()V */
		 final String v0 = "jdbc:odbc:myDB"; // const-string v0, "jdbc:odbc:myDB"
		 /* .line 2 */
		 this.h = v0;
		 final String v0 = "me"; // const-string v0, "me"
		 /* .line 3 */
		 this.i = v0;
		 final String v0 = "mypassword"; // const-string v0, "mypassword"
		 /* .line 4 */
		 this.j = v0;
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 5 */
		 this.k = v0;
		 final String v0 = ""; // const-string v0, ""
		 /* .line 6 */
		 this.l = v0;
		 int v0 = 1; // const/4 v0, 0x1
		 /* .line 7 */
		 /* iput v0, p0, Lorg/apache/log4j/jdbc/JDBCAppender;->m:I */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 8 */
		 /* iput-boolean v0, p0, Lorg/apache/log4j/jdbc/JDBCAppender;->p:Z */
		 /* .line 9 */
		 /* new-instance v0, Ljava/util/ArrayList; */
		 /* iget v1, p0, Lorg/apache/log4j/jdbc/JDBCAppender;->m:I */
		 /* invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V */
		 this.n = v0;
		 /* .line 10 */
		 /* new-instance v0, Ljava/util/ArrayList; */
		 /* iget v1, p0, Lorg/apache/log4j/jdbc/JDBCAppender;->m:I */
		 /* invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V */
		 this.o = v0;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.String a ( org.apache.log4j.spi.LoggingEvent p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 (( org.apache.log4j.AppenderSkeleton ) p0 ).getLayout ( ); // invoke-virtual {p0}, Lorg/apache/log4j/AppenderSkeleton;->getLayout()Lorg/apache/log4j/Layout;
		 (( org.apache.log4j.Layout ) v0 ).format ( p1 ); // invoke-virtual {v0, p1}, Lorg/apache/log4j/Layout;->format(Lorg/apache/log4j/spi/LoggingEvent;)Ljava/lang/String;
	 } // .end method
	 public java.sql.Connection a ( ) {
		 /* .locals 3 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Ljava/sql/SQLException; */
		 /* } */
	 } // .end annotation
	 /* .line 9 */
	 v0 = 	 java.sql.DriverManager .getDrivers ( );
	 /* if-nez v0, :cond_0 */
	 final String v0 = "sun.jdbc.odbc.JdbcOdbcDriver"; // const-string v0, "sun.jdbc.odbc.JdbcOdbcDriver"
	 /* .line 10 */
	 (( org.apache.log4j.jdbc.JDBCAppender ) p0 ).setDriver ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/log4j/jdbc/JDBCAppender;->setDriver(Ljava/lang/String;)V
	 /* .line 11 */
} // :cond_0
v0 = this.k;
/* if-nez v0, :cond_1 */
/* .line 12 */
v0 = this.h;
v1 = this.i;
v2 = this.j;
java.sql.DriverManager .getConnection ( v0,v1,v2 );
this.k = v0;
/* .line 13 */
} // :cond_1
v0 = this.k;
} // .end method
public void a ( java.lang.String p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/sql/SQLException; */
/* } */
} // .end annotation
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
try { // :try_start_0
(( org.apache.log4j.jdbc.JDBCAppender ) p0 ).a ( ); // invoke-virtual {p0}, Lorg/apache/log4j/jdbc/JDBCAppender;->a()Ljava/sql/Connection;
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_1 */
/* .line 3 */
try { // :try_start_1
/* .line 4 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 5 */
	 /* .line 6 */
} // :cond_0
(( org.apache.log4j.jdbc.JDBCAppender ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Lorg/apache/log4j/jdbc/JDBCAppender;->a(Ljava/sql/Connection;)V
return;
/* :catchall_0 */
/* move-exception p1 */
/* :catchall_1 */
/* move-exception p1 */
/* move-object v1, v0 */
} // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 7 */
/* .line 8 */
} // :cond_1
(( org.apache.log4j.jdbc.JDBCAppender ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Lorg/apache/log4j/jdbc/JDBCAppender;->a(Ljava/sql/Connection;)V
/* throw p1 */
} // .end method
public void a ( java.sql.Connection p0 ) {
/* .locals 0 */
return;
} // .end method
public void append ( org.apache.log4j.spi.LoggingEvent p0 ) {
/* .locals 1 */
/* .line 1 */
(( org.apache.log4j.spi.LoggingEvent ) p1 ).getNDC ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getNDC()Ljava/lang/String;
/* .line 2 */
(( org.apache.log4j.spi.LoggingEvent ) p1 ).getThreadName ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getThreadName()Ljava/lang/String;
/* .line 3 */
(( org.apache.log4j.spi.LoggingEvent ) p1 ).getMDCCopy ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getMDCCopy()V
/* .line 4 */
/* iget-boolean v0, p0, Lorg/apache/log4j/jdbc/JDBCAppender;->p:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 5 */
(( org.apache.log4j.spi.LoggingEvent ) p1 ).getLocationInformation ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getLocationInformation()Lorg/apache/log4j/spi/LocationInfo;
/* .line 6 */
} // :cond_0
(( org.apache.log4j.spi.LoggingEvent ) p1 ).getRenderedMessage ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getRenderedMessage()Ljava/lang/String;
/* .line 7 */
(( org.apache.log4j.spi.LoggingEvent ) p1 ).getThrowableStrRep ( ); // invoke-virtual {p1}, Lorg/apache/log4j/spi/LoggingEvent;->getThrowableStrRep()[Ljava/lang/String;
/* .line 8 */
v0 = this.n;
(( java.util.ArrayList ) v0 ).add ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 9 */
p1 = this.n;
p1 = (( java.util.ArrayList ) p1 ).size ( ); // invoke-virtual {p1}, Ljava/util/ArrayList;->size()I
/* iget v0, p0, Lorg/apache/log4j/jdbc/JDBCAppender;->m:I */
/* if-lt p1, v0, :cond_1 */
/* .line 10 */
(( org.apache.log4j.jdbc.JDBCAppender ) p0 ).flushBuffer ( ); // invoke-virtual {p0}, Lorg/apache/log4j/jdbc/JDBCAppender;->flushBuffer()V
} // :cond_1
return;
} // .end method
public void close ( ) {
/* .locals 4 */
/* .line 1 */
(( org.apache.log4j.jdbc.JDBCAppender ) p0 ).flushBuffer ( ); // invoke-virtual {p0}, Lorg/apache/log4j/jdbc/JDBCAppender;->flushBuffer()V
/* .line 2 */
try { // :try_start_0
v0 = this.k;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = v0 = this.k;
/* if-nez v0, :cond_0 */
/* .line 3 */
v0 = this.k;
/* :try_end_0 */
/* .catch Ljava/sql/SQLException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
/* .line 4 */
v1 = this.d;
int v2 = 0; // const/4 v2, 0x0
final String v3 = "Error closing connection"; // const-string v3, "Error closing connection"
} // :cond_0
} // :goto_0
int v0 = 1; // const/4 v0, 0x1
/* .line 5 */
/* iput-boolean v0, p0, Lorg/apache/log4j/AppenderSkeleton;->g:Z */
return;
} // .end method
public void finalize ( ) {
/* .locals 0 */
/* .line 1 */
(( org.apache.log4j.jdbc.JDBCAppender ) p0 ).close ( ); // invoke-virtual {p0}, Lorg/apache/log4j/jdbc/JDBCAppender;->close()V
return;
} // .end method
public void flushBuffer ( ) {
/* .locals 6 */
/* .line 1 */
v0 = this.o;
v1 = this.n;
v1 = (( java.util.ArrayList ) v1 ).size ( ); // invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
(( java.util.ArrayList ) v0 ).ensureCapacity ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->ensureCapacity(I)V
/* .line 2 */
v0 = this.n;
(( java.util.ArrayList ) v0 ).iterator ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 3 */
/* check-cast v1, Lorg/apache/log4j/spi/LoggingEvent; */
/* .line 4 */
try { // :try_start_0
(( org.apache.log4j.jdbc.JDBCAppender ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Lorg/apache/log4j/jdbc/JDBCAppender;->a(Lorg/apache/log4j/spi/LoggingEvent;)Ljava/lang/String;
/* .line 5 */
(( org.apache.log4j.jdbc.JDBCAppender ) p0 ).a ( v2 ); // invoke-virtual {p0, v2}, Lorg/apache/log4j/jdbc/JDBCAppender;->a(Ljava/lang/String;)V
/* :try_end_0 */
/* .catch Ljava/sql/SQLException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 6 */
} // :goto_1
v2 = this.o;
(( java.util.ArrayList ) v2 ).add ( v1 ); // invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* :catchall_0 */
/* move-exception v0 */
/* :catch_0 */
/* move-exception v2 */
/* .line 7 */
try { // :try_start_1
v3 = this.d;
final String v4 = "Failed to excute sql"; // const-string v4, "Failed to excute sql"
int v5 = 2; // const/4 v5, 0x2
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 8 */
} // :goto_2
v2 = this.o;
(( java.util.ArrayList ) v2 ).add ( v1 ); // invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* throw v0 */
/* .line 9 */
} // :cond_0
v0 = this.n;
v1 = this.o;
(( java.util.ArrayList ) v0 ).removeAll ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z
/* .line 10 */
v0 = this.o;
(( java.util.ArrayList ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
return;
} // .end method
public Integer getBufferSize ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Lorg/apache/log4j/jdbc/JDBCAppender;->m:I */
} // .end method
public Boolean getLocationInfo ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Lorg/apache/log4j/jdbc/JDBCAppender;->p:Z */
} // .end method
public java.lang.String getPassword ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.j;
} // .end method
public java.lang.String getSql ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.l;
} // .end method
public java.lang.String getURL ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.h;
} // .end method
public java.lang.String getUser ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.i;
} // .end method
public Boolean requiresLayout ( ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
} // .end method
public void setBufferSize ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
/* iput p1, p0, Lorg/apache/log4j/jdbc/JDBCAppender;->m:I */
/* .line 2 */
v0 = this.n;
(( java.util.ArrayList ) v0 ).ensureCapacity ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/ArrayList;->ensureCapacity(I)V
/* .line 3 */
p1 = this.o;
/* iget v0, p0, Lorg/apache/log4j/jdbc/JDBCAppender;->m:I */
(( java.util.ArrayList ) p1 ).ensureCapacity ( v0 ); // invoke-virtual {p1, v0}, Ljava/util/ArrayList;->ensureCapacity(I)V
return;
} // .end method
public void setDriver ( java.lang.String p0 ) {
/* .locals 3 */
/* .line 1 */
try { // :try_start_0
java.lang.Class .forName ( p1 );
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p1 */
/* .line 2 */
v0 = this.d;
int v1 = 0; // const/4 v1, 0x0
final String v2 = "Failed to load driver"; // const-string v2, "Failed to load driver"
} // :goto_0
return;
} // .end method
public void setLocationInfo ( Boolean p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput-boolean p1, p0, Lorg/apache/log4j/jdbc/JDBCAppender;->p:Z */
return;
} // .end method
public void setPassword ( java.lang.String p0 ) {
/* .locals 0 */
/* .line 1 */
this.j = p1;
return;
} // .end method
public void setSql ( java.lang.String p0 ) {
/* .locals 1 */
/* .line 1 */
this.l = p1;
/* .line 2 */
(( org.apache.log4j.AppenderSkeleton ) p0 ).getLayout ( ); // invoke-virtual {p0}, Lorg/apache/log4j/AppenderSkeleton;->getLayout()Lorg/apache/log4j/Layout;
/* if-nez v0, :cond_0 */
/* .line 3 */
/* new-instance v0, Lorg/apache/log4j/PatternLayout; */
/* invoke-direct {v0, p1}, Lorg/apache/log4j/PatternLayout;-><init>(Ljava/lang/String;)V */
(( org.apache.log4j.AppenderSkeleton ) p0 ).setLayout ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/log4j/AppenderSkeleton;->setLayout(Lorg/apache/log4j/Layout;)V
/* .line 4 */
} // :cond_0
(( org.apache.log4j.AppenderSkeleton ) p0 ).getLayout ( ); // invoke-virtual {p0}, Lorg/apache/log4j/AppenderSkeleton;->getLayout()Lorg/apache/log4j/Layout;
/* check-cast v0, Lorg/apache/log4j/PatternLayout; */
(( org.apache.log4j.PatternLayout ) v0 ).setConversionPattern ( p1 ); // invoke-virtual {v0, p1}, Lorg/apache/log4j/PatternLayout;->setConversionPattern(Ljava/lang/String;)V
} // :goto_0
return;
} // .end method
public void setURL ( java.lang.String p0 ) {
/* .locals 0 */
/* .line 1 */
this.h = p1;
return;
} // .end method
public void setUser ( java.lang.String p0 ) {
/* .locals 0 */
/* .line 1 */
this.i = p1;
return;
} // .end method
