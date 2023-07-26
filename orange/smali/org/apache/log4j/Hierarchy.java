public class org.apache.log4j.Hierarchy implements org.apache.log4j.spi.LoggerRepository implements org.apache.log4j.spi.RendererSupport implements org.apache.log4j.spi.ThrowableRendererSupport {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public org.apache.log4j.spi.LoggerFactory a;
	 public java.util.Vector b;
	 public java.util.Hashtable c;
	 public org.apache.log4j.Logger d;
	 public org.apache.log4j.or.RendererMap e;
	 public Integer f;
	 public org.apache.log4j.Level g;
	 public Boolean h;
	 public org.apache.log4j.spi.ThrowableRenderer i;
	 /* # direct methods */
	 public org.apache.log4j.Hierarchy ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 2 */
		 /* iput-boolean v0, p0, Lorg/apache/log4j/Hierarchy;->h:Z */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 3 */
		 this.i = v0;
		 /* .line 4 */
		 /* new-instance v0, Ljava/util/Hashtable; */
		 /* invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V */
		 this.c = v0;
		 /* .line 5 */
		 /* new-instance v0, Ljava/util/Vector; */
		 int v1 = 1; // const/4 v1, 0x1
		 /* invoke-direct {v0, v1}, Ljava/util/Vector;-><init>(I)V */
		 this.b = v0;
		 /* .line 6 */
		 this.d = p1;
		 /* .line 7 */
		 p1 = org.apache.log4j.Level.ALL;
		 (( org.apache.log4j.Hierarchy ) p0 ).setThreshold ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/log4j/Hierarchy;->setThreshold(Lorg/apache/log4j/Level;)V
		 /* .line 8 */
		 p1 = this.d;
		 (( org.apache.log4j.Category ) p1 ).a ( p0 ); // invoke-virtual {p1, p0}, Lorg/apache/log4j/Category;->a(Lorg/apache/log4j/spi/LoggerRepository;)V
		 /* .line 9 */
		 /* new-instance p1, Lorg/apache/log4j/or/RendererMap; */
		 /* invoke-direct {p1}, Lorg/apache/log4j/or/RendererMap;-><init>()V */
		 this.e = p1;
		 /* .line 10 */
		 /* new-instance p1, Lm/a/b/b; */
		 /* invoke-direct {p1}, Lm/a/b/b;-><init>()V */
		 this.a = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final void a ( Object p0, org.apache.log4j.Logger p1 ) {
		 /* .locals 5 */
		 /* .line 21 */
		 v0 = 		 (( java.util.Vector ) p1 ).size ( ); // invoke-virtual {p1}, Ljava/util/Vector;->size()I
		 int v1 = 0; // const/4 v1, 0x0
	 } // :goto_0
	 /* if-ge v1, v0, :cond_1 */
	 /* .line 22 */
	 (( java.util.Vector ) p1 ).elementAt ( v1 ); // invoke-virtual {p1, v1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;
	 /* check-cast v2, Lorg/apache/log4j/Logger; */
	 /* .line 23 */
	 v3 = this.c;
	 v3 = this.a;
	 v4 = this.a;
	 v3 = 	 (( java.lang.String ) v3 ).startsWith ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
	 /* if-nez v3, :cond_0 */
	 /* .line 24 */
	 v3 = this.c;
	 this.c = v3;
	 /* .line 25 */
	 this.c = p2;
} // :cond_0
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_1
return;
} // .end method
public void a ( org.apache.log4j.Category p0, org.apache.log4j.Appender p1 ) {
/* .locals 3 */
/* .line 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
v0 = (( java.util.Vector ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/Vector;->size()I
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-ge v1, v0, :cond_0 */
/* .line 3 */
v2 = this.b;
(( java.util.Vector ) v2 ).elementAt ( v1 ); // invoke-virtual {v2, v1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;
/* check-cast v2, Lorg/apache/log4j/spi/HierarchyEventListener; */
/* .line 4 */
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_0
return;
} // .end method
public final void a ( org.apache.log4j.Logger p0 ) {
/* .locals 8 */
/* .line 5 */
v0 = this.a;
/* .line 6 */
v1 = (( java.lang.String ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/String;->length()I
int v2 = 1; // const/4 v2, 0x1
/* sub-int/2addr v1, v2 */
/* const/16 v3, 0x2e */
/* .line 7 */
v1 = (( java.lang.String ) v0 ).lastIndexOf ( v3, v1 ); // invoke-virtual {v0, v3, v1}, Ljava/lang/String;->lastIndexOf(II)I
} // :goto_0
int v4 = 0; // const/4 v4, 0x0
/* if-ltz v1, :cond_3 */
/* .line 8 */
(( java.lang.String ) v0 ).substring ( v4, v1 ); // invoke-virtual {v0, v4, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;
/* .line 9 */
/* new-instance v5, Lm/a/b/a; */
/* invoke-direct {v5, v4}, Lm/a/b/a;-><init>(Ljava/lang/String;)V */
/* .line 10 */
v4 = this.c;
(( java.util.Hashtable ) v4 ).get ( v5 ); // invoke-virtual {v4, v5}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* if-nez v4, :cond_0 */
/* .line 11 */
/* new-instance v4, Lm/a/b/e; */
/* invoke-direct {v4, p1}, Lm/a/b/e;-><init>(Lorg/apache/log4j/Logger;)V */
/* .line 12 */
v6 = this.c;
(( java.util.Hashtable ) v6 ).put ( v5, v4 ); // invoke-virtual {v6, v5, v4}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 13 */
} // :cond_0
/* instance-of v5, v4, Lorg/apache/log4j/Category; */
if ( v5 != null) { // if-eqz v5, :cond_1
/* .line 14 */
/* check-cast v4, Lorg/apache/log4j/Category; */
this.c = v4;
/* .line 15 */
} // :cond_1
/* instance-of v5, v4, Lm/a/b/e; */
if ( v5 != null) { // if-eqz v5, :cond_2
/* .line 16 */
/* check-cast v4, Lm/a/b/e; */
(( java.util.Vector ) v4 ).addElement ( p1 ); // invoke-virtual {v4, p1}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V
/* .line 17 */
} // :cond_2
/* new-instance v5, Ljava/lang/IllegalStateException; */
/* new-instance v6, Ljava/lang/StringBuffer; */
/* invoke-direct {v6}, Ljava/lang/StringBuffer;-><init>()V */
final String v7 = "unexpected object type "; // const-string v7, "unexpected object type "
(( java.lang.StringBuffer ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.Object ) v4 ).getClass ( ); // invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( java.lang.StringBuffer ) v6 ).append ( v4 ); // invoke-virtual {v6, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;
final String v4 = " in ht."; // const-string v4, " in ht."
(( java.lang.StringBuffer ) v6 ).append ( v4 ); // invoke-virtual {v6, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
/* invoke-direct {v5, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* .line 18 */
(( java.lang.Exception ) v5 ).printStackTrace ( ); // invoke-virtual {v5}, Ljava/lang/Exception;->printStackTrace()V
} // :goto_1
/* add-int/lit8 v1, v1, -0x1 */
/* .line 19 */
v1 = (( java.lang.String ) v0 ).lastIndexOf ( v3, v1 ); // invoke-virtual {v0, v3, v1}, Ljava/lang/String;->lastIndexOf(II)I
} // :cond_3
int v2 = 0; // const/4 v2, 0x0
} // :goto_2
/* if-nez v2, :cond_4 */
/* .line 20 */
v0 = this.d;
this.c = v0;
} // :cond_4
return;
} // .end method
public void addHierarchyEventListener ( org.apache.log4j.spi.HierarchyEventListener p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
v0 = (( java.util.Vector ) v0 ).contains ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/Vector;->contains(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
final String p1 = "Ignoring attempt to add an existent listener."; // const-string p1, "Ignoring attempt to add an existent listener."
/* .line 2 */
org.apache.log4j.helpers.LogLog .warn ( p1 );
/* .line 3 */
} // :cond_0
v0 = this.b;
(( java.util.Vector ) v0 ).addElement ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V
} // :goto_0
return;
} // .end method
public void addRenderer ( java.lang.Class p0, org.apache.log4j.or.ObjectRenderer p1 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.e;
(( org.apache.log4j.or.RendererMap ) v0 ).put ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lorg/apache/log4j/or/RendererMap;->put(Ljava/lang/Class;Lorg/apache/log4j/or/ObjectRenderer;)V
return;
} // .end method
public void clear ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.c;
(( java.util.Hashtable ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/Hashtable;->clear()V
return;
} // .end method
public void emitNoAppenderWarning ( org.apache.log4j.Category p0 ) {
/* .locals 2 */
/* .line 1 */
/* iget-boolean v0, p0, Lorg/apache/log4j/Hierarchy;->h:Z */
/* if-nez v0, :cond_0 */
/* .line 2 */
/* new-instance v0, Ljava/lang/StringBuffer; */
/* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
final String v1 = "No appenders could be found for logger ("; // const-string v1, "No appenders could be found for logger ("
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( org.apache.log4j.Category ) p1 ).getName ( ); // invoke-virtual {p1}, Lorg/apache/log4j/Category;->getName()Ljava/lang/String;
(( java.lang.StringBuffer ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String p1 = ")."; // const-string p1, ")."
(( java.lang.StringBuffer ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .warn ( p1 );
final String p1 = "Please initialize the log4j system properly."; // const-string p1, "Please initialize the log4j system properly."
/* .line 3 */
org.apache.log4j.helpers.LogLog .warn ( p1 );
final String p1 = "See http://logging.apache.org/log4j/1.2/faq.html#noconfig for more info."; // const-string p1, "See http://logging.apache.org/log4j/1.2/faq.html#noconfig for more info."
/* .line 4 */
org.apache.log4j.helpers.LogLog .warn ( p1 );
int p1 = 1; // const/4 p1, 0x1
/* .line 5 */
/* iput-boolean p1, p0, Lorg/apache/log4j/Hierarchy;->h:Z */
} // :cond_0
return;
} // .end method
public org.apache.log4j.Logger exists ( java.lang.String p0 ) {
/* .locals 2 */
/* .line 1 */
v0 = this.c;
/* new-instance v1, Lm/a/b/a; */
/* invoke-direct {v1, p1}, Lm/a/b/a;-><init>(Ljava/lang/String;)V */
(( java.util.Hashtable ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* .line 2 */
/* instance-of v0, p1, Lorg/apache/log4j/Logger; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
/* check-cast p1, Lorg/apache/log4j/Logger; */
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // .end method
public void fireAddAppenderEvent ( org.apache.log4j.Category p0, org.apache.log4j.Appender p1 ) {
/* .locals 3 */
/* .line 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
v0 = (( java.util.Vector ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/Vector;->size()I
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-ge v1, v0, :cond_0 */
/* .line 3 */
v2 = this.b;
(( java.util.Vector ) v2 ).elementAt ( v1 ); // invoke-virtual {v2, v1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;
/* check-cast v2, Lorg/apache/log4j/spi/HierarchyEventListener; */
/* .line 4 */
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_0
return;
} // .end method
public java.util.Enumeration getCurrentCategories ( ) {
/* .locals 1 */
/* .line 1 */
(( org.apache.log4j.Hierarchy ) p0 ).getCurrentLoggers ( ); // invoke-virtual {p0}, Lorg/apache/log4j/Hierarchy;->getCurrentLoggers()Ljava/util/Enumeration;
} // .end method
public java.util.Enumeration getCurrentLoggers ( ) {
/* .locals 4 */
/* .line 1 */
/* new-instance v0, Ljava/util/Vector; */
v1 = this.c;
v1 = (( java.util.Hashtable ) v1 ).size ( ); // invoke-virtual {v1}, Ljava/util/Hashtable;->size()I
/* invoke-direct {v0, v1}, Ljava/util/Vector;-><init>(I)V */
/* .line 2 */
v1 = this.c;
(( java.util.Hashtable ) v1 ).elements ( ); // invoke-virtual {v1}, Ljava/util/Hashtable;->elements()Ljava/util/Enumeration;
/* .line 3 */
} // :cond_0
v2 = } // :goto_0
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 4 */
/* .line 5 */
/* instance-of v3, v2, Lorg/apache/log4j/Logger; */
if ( v3 != null) { // if-eqz v3, :cond_0
/* .line 6 */
(( java.util.Vector ) v0 ).addElement ( v2 ); // invoke-virtual {v0, v2}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V
/* .line 7 */
} // :cond_1
(( java.util.Vector ) v0 ).elements ( ); // invoke-virtual {v0}, Ljava/util/Vector;->elements()Ljava/util/Enumeration;
} // .end method
public org.apache.log4j.Logger getLogger ( java.lang.String p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
(( org.apache.log4j.Hierarchy ) p0 ).getLogger ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lorg/apache/log4j/Hierarchy;->getLogger(Ljava/lang/String;Lorg/apache/log4j/spi/LoggerFactory;)Lorg/apache/log4j/Logger;
} // .end method
public org.apache.log4j.Logger getLogger ( java.lang.String p0, org.apache.log4j.spi.LoggerFactory p1 ) {
/* .locals 4 */
/* .line 2 */
/* new-instance v0, Lm/a/b/a; */
/* invoke-direct {v0, p1}, Lm/a/b/a;-><init>(Ljava/lang/String;)V */
/* .line 3 */
v1 = this.c;
/* monitor-enter v1 */
/* .line 4 */
try { // :try_start_0
v2 = this.c;
(( java.util.Hashtable ) v2 ).get ( v0 ); // invoke-virtual {v2, v0}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* if-nez v2, :cond_0 */
/* .line 5 */
/* .line 6 */
(( org.apache.log4j.Category ) p1 ).a ( p0 ); // invoke-virtual {p1, p0}, Lorg/apache/log4j/Category;->a(Lorg/apache/log4j/spi/LoggerRepository;)V
/* .line 7 */
p2 = this.c;
(( java.util.Hashtable ) p2 ).put ( v0, p1 ); // invoke-virtual {p2, v0, p1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 8 */
(( org.apache.log4j.Hierarchy ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/log4j/Hierarchy;->a(Lorg/apache/log4j/Logger;)V
/* .line 9 */
/* monitor-exit v1 */
/* .line 10 */
} // :cond_0
/* instance-of v3, v2, Lorg/apache/log4j/Logger; */
if ( v3 != null) { // if-eqz v3, :cond_1
/* .line 11 */
/* check-cast v2, Lorg/apache/log4j/Logger; */
/* monitor-exit v1 */
/* .line 12 */
} // :cond_1
/* instance-of v3, v2, Lm/a/b/e; */
if ( v3 != null) { // if-eqz v3, :cond_2
/* .line 13 */
/* .line 14 */
(( org.apache.log4j.Category ) p1 ).a ( p0 ); // invoke-virtual {p1, p0}, Lorg/apache/log4j/Category;->a(Lorg/apache/log4j/spi/LoggerRepository;)V
/* .line 15 */
p2 = this.c;
(( java.util.Hashtable ) p2 ).put ( v0, p1 ); // invoke-virtual {p2, v0, p1}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 16 */
/* check-cast v2, Lm/a/b/e; */
(( org.apache.log4j.Hierarchy ) p0 ).a ( v2, p1 ); // invoke-virtual {p0, v2, p1}, Lorg/apache/log4j/Hierarchy;->a(Lm/a/b/e;Lorg/apache/log4j/Logger;)V
/* .line 17 */
(( org.apache.log4j.Hierarchy ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/log4j/Hierarchy;->a(Lorg/apache/log4j/Logger;)V
/* .line 18 */
/* monitor-exit v1 */
} // :cond_2
int p1 = 0; // const/4 p1, 0x0
/* .line 19 */
/* monitor-exit v1 */
/* :catchall_0 */
/* move-exception p1 */
/* .line 20 */
/* monitor-exit v1 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw p1 */
} // .end method
public org.apache.log4j.or.RendererMap getRendererMap ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.e;
} // .end method
public org.apache.log4j.Logger getRootLogger ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.d;
} // .end method
public org.apache.log4j.Level getThreshold ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.g;
} // .end method
public org.apache.log4j.spi.ThrowableRenderer getThrowableRenderer ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.i;
} // .end method
public Boolean isDisabled ( Integer p0 ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Lorg/apache/log4j/Hierarchy;->f:I */
/* if-le v0, p1, :cond_0 */
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
public void overrideAsNeeded ( java.lang.String p0 ) {
/* .locals 0 */
final String p1 = "The Hiearchy.overrideAsNeeded method has been deprecated."; // const-string p1, "The Hiearchy.overrideAsNeeded method has been deprecated."
/* .line 1 */
org.apache.log4j.helpers.LogLog .warn ( p1 );
return;
} // .end method
public void resetConfiguration ( ) {
/* .locals 5 */
/* .line 1 */
(( org.apache.log4j.Hierarchy ) p0 ).getRootLogger ( ); // invoke-virtual {p0}, Lorg/apache/log4j/Hierarchy;->getRootLogger()Lorg/apache/log4j/Logger;
v1 = org.apache.log4j.Level.DEBUG;
(( org.apache.log4j.Category ) v0 ).setLevel ( v1 ); // invoke-virtual {v0, v1}, Lorg/apache/log4j/Category;->setLevel(Lorg/apache/log4j/Level;)V
/* .line 2 */
v0 = this.d;
int v1 = 0; // const/4 v1, 0x0
(( org.apache.log4j.Category ) v0 ).setResourceBundle ( v1 ); // invoke-virtual {v0, v1}, Lorg/apache/log4j/Category;->setResourceBundle(Ljava/util/ResourceBundle;)V
/* .line 3 */
v0 = org.apache.log4j.Level.ALL;
(( org.apache.log4j.Hierarchy ) p0 ).setThreshold ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/log4j/Hierarchy;->setThreshold(Lorg/apache/log4j/Level;)V
/* .line 4 */
v0 = this.c;
/* monitor-enter v0 */
/* .line 5 */
try { // :try_start_0
(( org.apache.log4j.Hierarchy ) p0 ).shutdown ( ); // invoke-virtual {p0}, Lorg/apache/log4j/Hierarchy;->shutdown()V
/* .line 6 */
(( org.apache.log4j.Hierarchy ) p0 ).getCurrentLoggers ( ); // invoke-virtual {p0}, Lorg/apache/log4j/Hierarchy;->getCurrentLoggers()Ljava/util/Enumeration;
/* .line 7 */
v3 = } // :goto_0
if ( v3 != null) { // if-eqz v3, :cond_0
/* .line 8 */
/* check-cast v3, Lorg/apache/log4j/Logger; */
/* .line 9 */
(( org.apache.log4j.Category ) v3 ).setLevel ( v1 ); // invoke-virtual {v3, v1}, Lorg/apache/log4j/Category;->setLevel(Lorg/apache/log4j/Level;)V
int v4 = 1; // const/4 v4, 0x1
/* .line 10 */
(( org.apache.log4j.Category ) v3 ).setAdditivity ( v4 ); // invoke-virtual {v3, v4}, Lorg/apache/log4j/Category;->setAdditivity(Z)V
/* .line 11 */
(( org.apache.log4j.Category ) v3 ).setResourceBundle ( v1 ); // invoke-virtual {v3, v1}, Lorg/apache/log4j/Category;->setResourceBundle(Ljava/util/ResourceBundle;)V
/* .line 12 */
} // :cond_0
/* monitor-exit v0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 13 */
v0 = this.e;
(( org.apache.log4j.or.RendererMap ) v0 ).clear ( ); // invoke-virtual {v0}, Lorg/apache/log4j/or/RendererMap;->clear()V
/* .line 14 */
this.i = v1;
return;
/* :catchall_0 */
/* move-exception v1 */
/* .line 15 */
try { // :try_start_1
/* monitor-exit v0 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* throw v1 */
} // .end method
public void setDisableOverride ( java.lang.String p0 ) {
/* .locals 0 */
final String p1 = "The Hiearchy.setDisableOverride method has been deprecated."; // const-string p1, "The Hiearchy.setDisableOverride method has been deprecated."
/* .line 1 */
org.apache.log4j.helpers.LogLog .warn ( p1 );
return;
} // .end method
public void setRenderer ( java.lang.Class p0, org.apache.log4j.or.ObjectRenderer p1 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.e;
(( org.apache.log4j.or.RendererMap ) v0 ).put ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lorg/apache/log4j/or/RendererMap;->put(Ljava/lang/Class;Lorg/apache/log4j/or/ObjectRenderer;)V
return;
} // .end method
public void setThreshold ( java.lang.String p0 ) {
/* .locals 2 */
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
org.apache.log4j.Level .toLevel ( p1,v0 );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( org.apache.log4j.Hierarchy ) p0 ).setThreshold ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/log4j/Hierarchy;->setThreshold(Lorg/apache/log4j/Level;)V
/* .line 3 */
} // :cond_0
/* new-instance v0, Ljava/lang/StringBuffer; */
/* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
final String v1 = "Could not convert ["; // const-string v1, "Could not convert ["
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String p1 = "] to Level."; // const-string p1, "] to Level."
(( java.lang.StringBuffer ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
org.apache.log4j.helpers.LogLog .warn ( p1 );
} // :goto_0
return;
} // .end method
public void setThreshold ( org.apache.log4j.Level p0 ) {
/* .locals 1 */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 4 */
/* iget v0, p1, Lorg/apache/log4j/Priority;->b:I */
/* iput v0, p0, Lorg/apache/log4j/Hierarchy;->f:I */
/* .line 5 */
this.g = p1;
} // :cond_0
return;
} // .end method
public void setThrowableRenderer ( org.apache.log4j.spi.ThrowableRenderer p0 ) {
/* .locals 0 */
/* .line 1 */
this.i = p1;
return;
} // .end method
public void shutdown ( ) {
/* .locals 4 */
/* .line 1 */
(( org.apache.log4j.Hierarchy ) p0 ).getRootLogger ( ); // invoke-virtual {p0}, Lorg/apache/log4j/Hierarchy;->getRootLogger()Lorg/apache/log4j/Logger;
/* .line 2 */
(( org.apache.log4j.Category ) v0 ).a ( ); // invoke-virtual {v0}, Lorg/apache/log4j/Category;->a()V
/* .line 3 */
v1 = this.c;
/* monitor-enter v1 */
/* .line 4 */
try { // :try_start_0
(( org.apache.log4j.Hierarchy ) p0 ).getCurrentLoggers ( ); // invoke-virtual {p0}, Lorg/apache/log4j/Hierarchy;->getCurrentLoggers()Ljava/util/Enumeration;
/* .line 5 */
v3 = } // :goto_0
if ( v3 != null) { // if-eqz v3, :cond_0
/* .line 6 */
/* check-cast v3, Lorg/apache/log4j/Logger; */
/* .line 7 */
(( org.apache.log4j.Category ) v3 ).a ( ); // invoke-virtual {v3}, Lorg/apache/log4j/Category;->a()V
/* .line 8 */
} // :cond_0
(( org.apache.log4j.Category ) v0 ).removeAllAppenders ( ); // invoke-virtual {v0}, Lorg/apache/log4j/Category;->removeAllAppenders()V
/* .line 9 */
(( org.apache.log4j.Hierarchy ) p0 ).getCurrentLoggers ( ); // invoke-virtual {p0}, Lorg/apache/log4j/Hierarchy;->getCurrentLoggers()Ljava/util/Enumeration;
/* .line 10 */
v2 = } // :goto_1
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 11 */
/* check-cast v2, Lorg/apache/log4j/Logger; */
/* .line 12 */
(( org.apache.log4j.Category ) v2 ).removeAllAppenders ( ); // invoke-virtual {v2}, Lorg/apache/log4j/Category;->removeAllAppenders()V
/* .line 13 */
} // :cond_1
/* monitor-exit v1 */
return;
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit v1 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v0 */
} // .end method
