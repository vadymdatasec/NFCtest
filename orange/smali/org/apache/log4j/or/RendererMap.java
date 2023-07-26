public class org.apache.log4j.or.RendererMap {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static org.apache.log4j.or.ObjectRenderer b;
	 public static java.lang.Class c; //synthetic
	 /* # instance fields */
	 public java.util.Hashtable a;
	 /* # direct methods */
	 public static org.apache.log4j.or.RendererMap ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* new-instance v0, Lm/a/b/l/a; */
		 /* invoke-direct {v0}, Lm/a/b/l/a;-><init>()V */
		 return;
	 } // .end method
	 public org.apache.log4j.or.RendererMap ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 /* new-instance v0, Ljava/util/Hashtable; */
		 /* invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V */
		 this.a = v0;
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
		 public static void addRenderer ( org.apache.log4j.spi.RendererSupport p0, java.lang.String p1, java.lang.String p2 ) {
			 /* .locals 3 */
			 /* .line 1 */
			 /* new-instance v0, Ljava/lang/StringBuffer; */
			 /* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
			 final String v1 = "Rendering class: ["; // const-string v1, "Rendering class: ["
			 (( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
			 (( java.lang.StringBuffer ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
			 final String v1 = "], Rendered class: ["; // const-string v1, "], Rendered class: ["
			 (( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
			 (( java.lang.StringBuffer ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
			 final String v1 = "]."; // const-string v1, "]."
			 (( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
			 (( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
			 org.apache.log4j.helpers.LogLog .debug ( v0 );
			 /* .line 2 */
			 v0 = org.apache.log4j.or.RendererMap.c;
			 /* if-nez v0, :cond_0 */
			 final String v0 = "org.apache.log4j.or.ObjectRenderer"; // const-string v0, "org.apache.log4j.or.ObjectRenderer"
			 org.apache.log4j.or.RendererMap .a ( v0 );
		 } // :cond_0
		 int v2 = 0; // const/4 v2, 0x0
		 org.apache.log4j.helpers.OptionConverter .instantiateByClassName ( p2,v0,v2 );
		 /* check-cast v0, Lorg/apache/log4j/or/ObjectRenderer; */
		 /* if-nez v0, :cond_1 */
		 /* .line 3 */
		 /* new-instance p0, Ljava/lang/StringBuffer; */
		 /* invoke-direct {p0}, Ljava/lang/StringBuffer;-><init>()V */
		 final String p1 = "Could not instantiate renderer ["; // const-string p1, "Could not instantiate renderer ["
		 (( java.lang.StringBuffer ) p0 ).append ( p1 ); // invoke-virtual {p0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 (( java.lang.StringBuffer ) p0 ).append ( p2 ); // invoke-virtual {p0, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 (( java.lang.StringBuffer ) p0 ).append ( v1 ); // invoke-virtual {p0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 (( java.lang.StringBuffer ) p0 ).toString ( ); // invoke-virtual {p0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
		 org.apache.log4j.helpers.LogLog .error ( p0 );
		 return;
		 /* .line 4 */
	 } // :cond_1
	 try { // :try_start_0
		 org.apache.log4j.helpers.Loader .loadClass ( p1 );
		 /* .line 5 */
		 /* :try_end_0 */
		 /* .catch Ljava/lang/ClassNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* :catch_0 */
		 /* move-exception p0 */
		 /* .line 6 */
		 /* new-instance p2, Ljava/lang/StringBuffer; */
		 /* invoke-direct {p2}, Ljava/lang/StringBuffer;-><init>()V */
		 final String v0 = "Could not find class ["; // const-string v0, "Could not find class ["
		 (( java.lang.StringBuffer ) p2 ).append ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 (( java.lang.StringBuffer ) p2 ).append ( p1 ); // invoke-virtual {p2, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 (( java.lang.StringBuffer ) p2 ).append ( v1 ); // invoke-virtual {p2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 (( java.lang.StringBuffer ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
		 org.apache.log4j.helpers.LogLog .error ( p1,p0 );
	 } // :goto_0
	 return;
} // .end method
/* # virtual methods */
public org.apache.log4j.or.ObjectRenderer a ( java.lang.Class p0 ) {
	 /* .locals 2 */
	 /* .line 2 */
	 v0 = this.a;
	 (( java.util.Hashtable ) v0 ).get ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;
	 /* check-cast v0, Lorg/apache/log4j/or/ObjectRenderer; */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 3 */
	 } // :cond_0
	 (( java.lang.Class ) p1 ).getInterfaces ( ); // invoke-virtual {p1}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 4 */
} // :goto_0
/* array-length v1, p1 */
/* if-ge v0, v1, :cond_2 */
/* .line 5 */
/* aget-object v1, p1, v0 */
(( org.apache.log4j.or.RendererMap ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Lorg/apache/log4j/or/RendererMap;->a(Ljava/lang/Class;)Lorg/apache/log4j/or/ObjectRenderer;
if ( v1 != null) { // if-eqz v1, :cond_1
} // :cond_1
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_2
int p1 = 0; // const/4 p1, 0x0
} // .end method
public void clear ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
(( java.util.Hashtable ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/Hashtable;->clear()V
return;
} // .end method
public java.lang.String findAndRender ( java.lang.Object p0 ) {
/* .locals 1 */
/* if-nez p1, :cond_0 */
int p1 = 0; // const/4 p1, 0x0
/* .line 1 */
} // :cond_0
(( java.lang.Object ) p1 ).getClass ( ); // invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( org.apache.log4j.or.RendererMap ) p0 ).get ( v0 ); // invoke-virtual {p0, v0}, Lorg/apache/log4j/or/RendererMap;->get(Ljava/lang/Class;)Lorg/apache/log4j/or/ObjectRenderer;
} // .end method
public org.apache.log4j.or.ObjectRenderer get ( java.lang.Class p0 ) {
/* .locals 1 */
} // :goto_0
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 2 */
v0 = this.a;
(( java.util.Hashtable ) v0 ).get ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Lorg/apache/log4j/or/ObjectRenderer; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
} // :cond_0
(( org.apache.log4j.or.RendererMap ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/log4j/or/RendererMap;->a(Ljava/lang/Class;)Lorg/apache/log4j/or/ObjectRenderer;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 4 */
} // :cond_1
(( java.lang.Class ) p1 ).getSuperclass ( ); // invoke-virtual {p1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;
/* .line 5 */
} // :cond_2
p1 = org.apache.log4j.or.RendererMap.b;
} // .end method
public org.apache.log4j.or.ObjectRenderer get ( java.lang.Object p0 ) {
/* .locals 0 */
/* if-nez p1, :cond_0 */
int p1 = 0; // const/4 p1, 0x0
/* .line 1 */
} // :cond_0
(( java.lang.Object ) p1 ).getClass ( ); // invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( org.apache.log4j.or.RendererMap ) p0 ).get ( p1 ); // invoke-virtual {p0, p1}, Lorg/apache/log4j/or/RendererMap;->get(Ljava/lang/Class;)Lorg/apache/log4j/or/ObjectRenderer;
} // .end method
public org.apache.log4j.or.ObjectRenderer getDefaultRenderer ( ) {
/* .locals 1 */
/* .line 1 */
v0 = org.apache.log4j.or.RendererMap.b;
} // .end method
public void put ( java.lang.Class p0, org.apache.log4j.or.ObjectRenderer p1 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
(( java.util.Hashtable ) v0 ).put ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
return;
} // .end method
