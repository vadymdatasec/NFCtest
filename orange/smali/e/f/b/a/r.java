public abstract class e.f.b.a.r {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final java.lang.Object a;
	 /* # direct methods */
	 public static e.f.b.a.r ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 e.f.b.a.r .b ( );
		 /* if-nez v0, :cond_0 */
		 /* .line 2 */
	 } // :cond_0
	 e.f.b.a.r .a ( );
	 /* .line 3 */
} // :goto_0
v0 = e.f.b.a.r.a;
/* if-nez v0, :cond_1 */
} // :cond_1
e.f.b.a.r .a ( v0 );
} // :goto_1
return;
} // .end method
public static java.lang.reflect.Method a ( ) {
/* .locals 3 */
int v0 = 2; // const/4 v0, 0x2
/* new-array v0, v0, [Ljava/lang/Class; */
int v1 = 0; // const/4 v1, 0x0
/* .line 3 */
/* const-class v2, Ljava/lang/Throwable; */
/* aput-object v2, v0, v1 */
v1 = java.lang.Integer.TYPE;
int v2 = 1; // const/4 v2, 0x1
/* aput-object v1, v0, v2 */
final String v1 = "getStackTraceElement"; // const-string v1, "getStackTraceElement"
e.f.b.a.r .a ( v1,v0 );
} // .end method
public static java.lang.reflect.Method a ( java.lang.Object p0 ) {
/* .locals 6 */
int v0 = 0; // const/4 v0, 0x0
try { // :try_start_0
final String v1 = "getStackTraceDepth"; // const-string v1, "getStackTraceDepth"
int v2 = 1; // const/4 v2, 0x1
/* new-array v3, v2, [Ljava/lang/Class; */
/* .line 4 */
/* const-class v4, Ljava/lang/Throwable; */
int v5 = 0; // const/4 v5, 0x0
/* aput-object v4, v3, v5 */
e.f.b.a.r .a ( v1,v3 );
/* if-nez v1, :cond_0 */
} // :cond_0
/* new-array v2, v2, [Ljava/lang/Object; */
/* .line 5 */
/* new-instance v3, Ljava/lang/Throwable; */
/* invoke-direct {v3}, Ljava/lang/Throwable;-><init>()V */
/* aput-object v3, v2, v5 */
(( java.lang.reflect.Method ) v1 ).invoke ( p0, v2 ); // invoke-virtual {v1, p0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/* :try_end_0 */
/* .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catch Ljava/lang/IllegalAccessException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
} // .end method
public static java.lang.reflect.Method a ( java.lang.String p0, java.lang.Class...p1 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/String;", */
/* "[", */
/* "Ljava/lang/Class<", */
/* "*>;)", */
/* "Ljava/lang/reflect/Method;" */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/ThreadDeath; */
/* } */
} // .end annotation
int v0 = 0; // const/4 v0, 0x0
try { // :try_start_0
final String v1 = "sun.misc.JavaLangAccess"; // const-string v1, "sun.misc.JavaLangAccess"
int v2 = 0; // const/4 v2, 0x0
/* .line 6 */
java.lang.Class .forName ( v1,v2,v0 );
(( java.lang.Class ) v1 ).getMethod ( p0, p1 ); // invoke-virtual {v1, p0, p1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
/* :try_end_0 */
/* .catch Ljava/lang/ThreadDeath; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* :catchall_0 */
/* :catch_0 */
/* move-exception p0 */
/* .line 7 */
/* throw p0 */
} // .end method
public static void a ( java.lang.Throwable p0 ) {
/* .locals 0 */
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
if ( p0 != null) { // if-eqz p0, :cond_0
/* .line 2 */
e.f.b.a.r .b ( p0 );
} // :cond_0
return;
} // .end method
public static void a ( java.lang.Throwable p0, java.lang.Class p1 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<X:", */
/* "Ljava/lang/Throwable;", */
/* ">(", */
/* "Ljava/lang/Throwable;", */
/* "Ljava/lang/Class<", */
/* "TX;>;)V^TX;" */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/Throwable; */
/* } */
} // .end annotation
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
if ( p0 != null) { // if-eqz p0, :cond_0
/* .line 1 */
e.f.b.a.r .c ( p0,p1 );
} // :cond_0
return;
} // .end method
public static java.lang.Object b ( ) {
/* .locals 5 */
int v0 = 0; // const/4 v0, 0x0
try { // :try_start_0
final String v1 = "sun.misc.SharedSecrets"; // const-string v1, "sun.misc.SharedSecrets"
int v2 = 0; // const/4 v2, 0x0
/* .line 8 */
java.lang.Class .forName ( v1,v2,v0 );
final String v3 = "getJavaLangAccess"; // const-string v3, "getJavaLangAccess"
/* new-array v4, v2, [Ljava/lang/Class; */
/* .line 9 */
(( java.lang.Class ) v1 ).getMethod ( v3, v4 ); // invoke-virtual {v1, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
/* new-array v2, v2, [Ljava/lang/Object; */
/* .line 10 */
(( java.lang.reflect.Method ) v1 ).invoke ( v0, v2 ); // invoke-virtual {v1, v0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/* :try_end_0 */
/* .catch Ljava/lang/ThreadDeath; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* :catchall_0 */
/* :catch_0 */
/* move-exception v0 */
/* .line 11 */
/* throw v0 */
} // .end method
public static void b ( java.lang.Throwable p0 ) {
/* .locals 1 */
/* .line 1 */
e.f.b.a.p .a ( p0 );
/* .line 2 */
/* instance-of v0, p0, Ljava/lang/RuntimeException; */
/* if-nez v0, :cond_1 */
/* .line 3 */
/* instance-of v0, p0, Ljava/lang/Error; */
/* if-nez v0, :cond_0 */
return;
/* .line 4 */
} // :cond_0
/* check-cast p0, Ljava/lang/Error; */
/* throw p0 */
/* .line 5 */
} // :cond_1
/* check-cast p0, Ljava/lang/RuntimeException; */
/* throw p0 */
} // .end method
public static void b ( java.lang.Throwable p0, java.lang.Class p1 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<X:", */
/* "Ljava/lang/Throwable;", */
/* ">(", */
/* "Ljava/lang/Throwable;", */
/* "Ljava/lang/Class<", */
/* "TX;>;)V^TX;" */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/Throwable; */
/* } */
} // .end annotation
/* .line 6 */
e.f.b.a.r .a ( p0,p1 );
/* .line 7 */
e.f.b.a.r .a ( p0 );
return;
} // .end method
public static void c ( java.lang.Throwable p0, java.lang.Class p1 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<X:", */
/* "Ljava/lang/Throwable;", */
/* ">(", */
/* "Ljava/lang/Throwable;", */
/* "Ljava/lang/Class<", */
/* "TX;>;)V^TX;" */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/Throwable; */
/* } */
} // .end annotation
/* .line 1 */
e.f.b.a.p .a ( p0 );
/* .line 2 */
v0 = (( java.lang.Class ) p1 ).isInstance ( p0 ); // invoke-virtual {p1, p0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z
/* if-nez v0, :cond_0 */
return;
/* .line 3 */
} // :cond_0
(( java.lang.Class ) p1 ).cast ( p0 ); // invoke-virtual {p1, p0}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast p0, Ljava/lang/Throwable; */
/* throw p0 */
} // .end method
