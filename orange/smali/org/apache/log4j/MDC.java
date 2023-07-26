public class org.apache.log4j.MDC {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final org.apache.log4j.MDC d;
	 public static java.lang.Class e; //synthetic
	 /* # instance fields */
	 public Boolean a;
	 public java.lang.Object b;
	 public java.lang.reflect.Method c;
	 /* # direct methods */
	 public static org.apache.log4j.MDC ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* new-instance v0, Lorg/apache/log4j/MDC; */
		 /* invoke-direct {v0}, Lorg/apache/log4j/MDC;-><init>()V */
		 return;
	 } // .end method
	 public org.apache.log4j.MDC ( ) {
		 /* .locals 3 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 v0 = 		 org.apache.log4j.helpers.Loader .isJava1 ( );
		 /* iput-boolean v0, p0, Lorg/apache/log4j/MDC;->a:Z */
		 /* if-nez v0, :cond_0 */
		 /* .line 3 */
		 /* new-instance v0, Lorg/apache/log4j/helpers/ThreadLocalMap; */
		 /* invoke-direct {v0}, Lorg/apache/log4j/helpers/ThreadLocalMap;-><init>()V */
		 this.b = v0;
		 /* .line 4 */
	 } // :cond_0
	 try { // :try_start_0
		 v0 = org.apache.log4j.MDC.e;
		 /* if-nez v0, :cond_1 */
		 final String v0 = "java.lang.ThreadLocal"; // const-string v0, "java.lang.ThreadLocal"
		 org.apache.log4j.MDC .c ( v0 );
	 } // :cond_1
	 v0 = org.apache.log4j.MDC.e;
} // :goto_0
final String v1 = "remove"; // const-string v1, "remove"
int v2 = 0; // const/4 v2, 0x0
(( java.lang.Class ) v0 ).getMethod ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
this.c = v0;
/* :try_end_0 */
/* .catch Ljava/lang/NoSuchMethodException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
return;
} // .end method
public static java.lang.Class c ( java.lang.String p0 ) { //synthethic
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
public static void clear ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = org.apache.log4j.MDC.d;
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 2 */
		 (( org.apache.log4j.MDC ) v0 ).a ( ); // invoke-virtual {v0}, Lorg/apache/log4j/MDC;->a()V
	 } // :cond_0
	 return;
} // .end method
public static java.lang.Object get ( java.lang.String p0 ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = org.apache.log4j.MDC.d;
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 2 */
		 (( org.apache.log4j.MDC ) v0 ).a ( p0 ); // invoke-virtual {v0, p0}, Lorg/apache/log4j/MDC;->a(Ljava/lang/String;)Ljava/lang/Object;
	 } // :cond_0
	 int p0 = 0; // const/4 p0, 0x0
} // .end method
public static java.util.Hashtable getContext ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = org.apache.log4j.MDC.d;
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 2 */
		 (( org.apache.log4j.MDC ) v0 ).b ( ); // invoke-virtual {v0}, Lorg/apache/log4j/MDC;->b()Ljava/util/Hashtable;
	 } // :cond_0
	 int v0 = 0; // const/4 v0, 0x0
} // .end method
public static void put ( java.lang.String p0, java.lang.Object p1 ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = org.apache.log4j.MDC.d;
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 2 */
		 (( org.apache.log4j.MDC ) v0 ).a ( p0, p1 ); // invoke-virtual {v0, p0, p1}, Lorg/apache/log4j/MDC;->a(Ljava/lang/String;Ljava/lang/Object;)V
	 } // :cond_0
	 return;
} // .end method
public static void remove ( java.lang.String p0 ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = org.apache.log4j.MDC.d;
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 2 */
		 (( org.apache.log4j.MDC ) v0 ).b ( p0 ); // invoke-virtual {v0, p0}, Lorg/apache/log4j/MDC;->b(Ljava/lang/String;)V
	 } // :cond_0
	 return;
} // .end method
/* # virtual methods */
public final java.lang.Object a ( java.lang.String p0 ) {
	 /* .locals 2 */
	 /* .line 6 */
	 /* iget-boolean v0, p0, Lorg/apache/log4j/MDC;->a:Z */
	 int v1 = 0; // const/4 v1, 0x0
	 /* if-nez v0, :cond_1 */
	 v0 = this.b;
	 /* if-nez v0, :cond_0 */
	 /* .line 7 */
} // :cond_0
/* check-cast v0, Lorg/apache/log4j/helpers/ThreadLocalMap; */
(( java.lang.InheritableThreadLocal ) v0 ).get ( ); // invoke-virtual {v0}, Ljava/lang/InheritableThreadLocal;->get()Ljava/lang/Object;
/* check-cast v0, Ljava/util/Hashtable; */
if ( v0 != null) { // if-eqz v0, :cond_1
	 if ( p1 != null) { // if-eqz p1, :cond_1
		 /* .line 8 */
		 (( java.util.Hashtable ) v0 ).get ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;
	 } // :cond_1
} // :goto_0
} // .end method
public final void a ( ) {
/* .locals 3 */
/* .line 9 */
/* iget-boolean v0, p0, Lorg/apache/log4j/MDC;->a:Z */
/* if-nez v0, :cond_1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_1
	 /* .line 10 */
	 /* check-cast v0, Lorg/apache/log4j/helpers/ThreadLocalMap; */
	 (( java.lang.InheritableThreadLocal ) v0 ).get ( ); // invoke-virtual {v0}, Ljava/lang/InheritableThreadLocal;->get()Ljava/lang/Object;
	 /* check-cast v0, Ljava/util/Hashtable; */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 11 */
		 (( java.util.Hashtable ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/Hashtable;->clear()V
		 /* .line 12 */
	 } // :cond_0
	 v0 = this.c;
	 if ( v0 != null) { // if-eqz v0, :cond_1
		 /* .line 13 */
		 try { // :try_start_0
			 v1 = this.b;
			 int v2 = 0; // const/4 v2, 0x0
			 (( java.lang.reflect.Method ) v0 ).invoke ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
			 /* :try_end_0 */
			 /* .catch Ljava/lang/IllegalAccessException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* :catch_0 */
		 } // :cond_1
		 return;
	 } // .end method
	 public final void a ( java.lang.String p0, java.lang.Object p1 ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* iget-boolean v0, p0, Lorg/apache/log4j/MDC;->a:Z */
		 /* if-nez v0, :cond_2 */
		 v0 = this.b;
		 /* if-nez v0, :cond_0 */
		 /* .line 2 */
	 } // :cond_0
	 /* check-cast v0, Lorg/apache/log4j/helpers/ThreadLocalMap; */
	 (( java.lang.InheritableThreadLocal ) v0 ).get ( ); // invoke-virtual {v0}, Ljava/lang/InheritableThreadLocal;->get()Ljava/lang/Object;
	 /* check-cast v0, Ljava/util/Hashtable; */
	 /* if-nez v0, :cond_1 */
	 /* .line 3 */
	 /* new-instance v0, Ljava/util/Hashtable; */
	 int v1 = 7; // const/4 v1, 0x7
	 /* invoke-direct {v0, v1}, Ljava/util/Hashtable;-><init>(I)V */
	 /* .line 4 */
	 v1 = this.b;
	 /* check-cast v1, Lorg/apache/log4j/helpers/ThreadLocalMap; */
	 (( java.lang.InheritableThreadLocal ) v1 ).set ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/InheritableThreadLocal;->set(Ljava/lang/Object;)V
	 /* .line 5 */
} // :cond_1
(( java.util.Hashtable ) v0 ).put ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
} // :cond_2
} // :goto_0
return;
} // .end method
public final java.util.Hashtable b ( ) {
/* .locals 1 */
/* .line 6 */
/* iget-boolean v0, p0, Lorg/apache/log4j/MDC;->a:Z */
/* if-nez v0, :cond_1 */
v0 = this.b;
/* if-nez v0, :cond_0 */
/* .line 7 */
} // :cond_0
/* check-cast v0, Lorg/apache/log4j/helpers/ThreadLocalMap; */
(( java.lang.InheritableThreadLocal ) v0 ).get ( ); // invoke-virtual {v0}, Ljava/lang/InheritableThreadLocal;->get()Ljava/lang/Object;
/* check-cast v0, Ljava/util/Hashtable; */
} // :cond_1
} // :goto_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public final void b ( java.lang.String p0 ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Lorg/apache/log4j/MDC;->a:Z */
/* if-nez v0, :cond_0 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
/* check-cast v0, Lorg/apache/log4j/helpers/ThreadLocalMap; */
(( java.lang.InheritableThreadLocal ) v0 ).get ( ); // invoke-virtual {v0}, Ljava/lang/InheritableThreadLocal;->get()Ljava/lang/Object;
/* check-cast v0, Ljava/util/Hashtable; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
(( java.util.Hashtable ) v0 ).remove ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;
/* .line 4 */
p1 = (( java.util.Hashtable ) v0 ).isEmpty ( ); // invoke-virtual {v0}, Ljava/util/Hashtable;->isEmpty()Z
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 5 */
(( org.apache.log4j.MDC ) p0 ).a ( ); // invoke-virtual {p0}, Lorg/apache/log4j/MDC;->a()V
} // :cond_0
return;
} // .end method
