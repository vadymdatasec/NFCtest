public class k.e1.l.i {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "<T:", */
	 /* "Ljava/lang/Object;", */
	 /* ">", */
	 /* "Ljava/lang/Object;" */
	 /* } */
} // .end annotation
/* # instance fields */
public final java.lang.Class a;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/lang/Class<", */
/* "*>;" */
/* } */
} // .end annotation
} // .end field
public final java.lang.String b;
public final java.lang.Class c;
/* # direct methods */
public k.e1.l.i ( ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/Class<", */
/* "*>;", */
/* "Ljava/lang/String;", */
/* "[", */
/* "Ljava/lang/Class;", */
/* ")V" */
/* } */
} // .end annotation
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
this.a = p1;
/* .line 3 */
this.b = p2;
/* .line 4 */
this.c = p3;
return;
} // .end method
public static java.lang.reflect.Method a ( java.lang.Class p0, java.lang.String p1, java.lang.Class[] p2 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/Class<", */
/* "*>;", */
/* "Ljava/lang/String;", */
/* "[", */
/* "Ljava/lang/Class;", */
/* ")", */
/* "Ljava/lang/reflect/Method;" */
/* } */
} // .end annotation
int v0 = 0; // const/4 v0, 0x0
/* .line 12 */
try { // :try_start_0
(( java.lang.Class ) p0 ).getMethod ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
/* :try_end_0 */
/* .catch Ljava/lang/NoSuchMethodException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .line 13 */
try { // :try_start_1
p1 = (( java.lang.reflect.Method ) p0 ).getModifiers ( ); // invoke-virtual {p0}, Ljava/lang/reflect/Method;->getModifiers()I
/* :try_end_1 */
/* .catch Ljava/lang/NoSuchMethodException; {:try_start_1 ..:try_end_1} :catch_0 */
/* and-int/lit8 p1, p1, 0x1 */
/* if-nez p1, :cond_0 */
/* :catch_0 */
} // :cond_0
/* move-object v0, p0 */
/* :catch_1 */
} // :goto_0
} // .end method
/* # virtual methods */
public java.lang.Object a ( java.lang.Object p0, java.lang.Object...p1 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TT;[", */
/* "Ljava/lang/Object;", */
/* ")", */
/* "Ljava/lang/Object;" */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/reflect/InvocationTargetException; */
/* } */
} // .end annotation
/* .line 2 */
(( java.lang.Object ) p1 ).getClass ( ); // invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( k.e1.l.i ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lk/e1/l/i;->a(Ljava/lang/Class;)Ljava/lang/reflect/Method;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
try { // :try_start_0
(( java.lang.reflect.Method ) v0 ).invoke ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/* :try_end_0 */
/* .catch Ljava/lang/IllegalAccessException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p1 */
/* .line 4 */
/* new-instance p2, Ljava/lang/AssertionError; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Unexpectedly could not call: "; // const-string v2, "Unexpectedly could not call: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p2, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V */
/* .line 5 */
(( java.lang.AssertionError ) p2 ).initCause ( p1 ); // invoke-virtual {p2, p1}, Ljava/lang/AssertionError;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;
/* .line 6 */
/* throw p2 */
/* .line 7 */
} // :cond_0
/* new-instance p2, Ljava/lang/AssertionError; */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "Method "; // const-string v1, "Method "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.b;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = " not supported for object "; // const-string v1, " not supported for object "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p2, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V */
/* throw p2 */
} // .end method
public final java.lang.reflect.Method a ( java.lang.Class p0 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/Class<", */
/* "*>;)", */
/* "Ljava/lang/reflect/Method;" */
/* } */
} // .end annotation
/* .line 8 */
v0 = this.b;
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 9 */
v2 = this.c;
k.e1.l.i .a ( p1,v0,v2 );
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 10 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 11 */
(( java.lang.reflect.Method ) p1 ).getReturnType ( ); // invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;
v0 = (( java.lang.Class ) v0 ).isAssignableFrom ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
/* if-nez v0, :cond_0 */
} // :cond_0
/* move-object v1, p1 */
} // :cond_1
} // :goto_0
} // .end method
public Boolean a ( java.lang.Object p0 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TT;)Z" */
/* } */
} // .end annotation
/* .line 1 */
(( java.lang.Object ) p1 ).getClass ( ); // invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( k.e1.l.i ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lk/e1/l/i;->a(Ljava/lang/Class;)Ljava/lang/reflect/Method;
if ( p1 != null) { // if-eqz p1, :cond_0
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
public java.lang.Object b ( java.lang.Object p0, java.lang.Object...p1 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TT;[", */
/* "Ljava/lang/Object;", */
/* ")", */
/* "Ljava/lang/Object;" */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/reflect/InvocationTargetException; */
/* } */
} // .end annotation
/* .line 1 */
(( java.lang.Object ) p1 ).getClass ( ); // invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( k.e1.l.i ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lk/e1/l/i;->a(Ljava/lang/Class;)Ljava/lang/reflect/Method;
int v1 = 0; // const/4 v1, 0x0
/* if-nez v0, :cond_0 */
/* .line 2 */
} // :cond_0
try { // :try_start_0
(( java.lang.reflect.Method ) v0 ).invoke ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/* :try_end_0 */
/* .catch Ljava/lang/IllegalAccessException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
} // .end method
public java.lang.Object c ( java.lang.Object p0, java.lang.Object...p1 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TT;[", */
/* "Ljava/lang/Object;", */
/* ")", */
/* "Ljava/lang/Object;" */
/* } */
} // .end annotation
/* .line 1 */
try { // :try_start_0
(( k.e1.l.i ) p0 ).b ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lk/e1/l/i;->b(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/* :try_end_0 */
/* .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p1 */
/* .line 2 */
(( java.lang.reflect.InvocationTargetException ) p1 ).getTargetException ( ); // invoke-virtual {p1}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;
/* .line 3 */
/* instance-of p2, p1, Ljava/lang/RuntimeException; */
if ( p2 != null) { // if-eqz p2, :cond_0
/* .line 4 */
/* check-cast p1, Ljava/lang/RuntimeException; */
/* throw p1 */
/* .line 5 */
} // :cond_0
/* new-instance p2, Ljava/lang/AssertionError; */
final String v0 = "Unexpected exception"; // const-string v0, "Unexpected exception"
/* invoke-direct {p2, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V */
/* .line 6 */
(( java.lang.AssertionError ) p2 ).initCause ( p1 ); // invoke-virtual {p2, p1}, Ljava/lang/AssertionError;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;
/* .line 7 */
/* throw p2 */
} // .end method
public java.lang.Object d ( java.lang.Object p0, java.lang.Object...p1 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TT;[", */
/* "Ljava/lang/Object;", */
/* ")", */
/* "Ljava/lang/Object;" */
/* } */
} // .end annotation
/* .line 1 */
try { // :try_start_0
(( k.e1.l.i ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lk/e1/l/i;->a(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/* :try_end_0 */
/* .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p1 */
/* .line 2 */
(( java.lang.reflect.InvocationTargetException ) p1 ).getTargetException ( ); // invoke-virtual {p1}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;
/* .line 3 */
/* instance-of p2, p1, Ljava/lang/RuntimeException; */
if ( p2 != null) { // if-eqz p2, :cond_0
/* .line 4 */
/* check-cast p1, Ljava/lang/RuntimeException; */
/* throw p1 */
/* .line 5 */
} // :cond_0
/* new-instance p2, Ljava/lang/AssertionError; */
final String v0 = "Unexpected exception"; // const-string v0, "Unexpected exception"
/* invoke-direct {p2, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V */
/* .line 6 */
(( java.lang.AssertionError ) p2 ).initCause ( p1 ); // invoke-virtual {p2, p1}, Ljava/lang/AssertionError;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;
/* .line 7 */
/* throw p2 */
} // .end method
