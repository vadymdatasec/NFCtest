public abstract class e.f.a.b.h.n {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static e.f.a.b.h.g a ( java.lang.Exception p0 ) {
		 /* .locals 1 */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "<TResult:", */
		 /* "Ljava/lang/Object;", */
		 /* ">(", */
		 /* "Ljava/lang/Exception;", */
		 /* ")", */
		 /* "Le/f/a/b/h/g<", */
		 /* "TTResult;>;" */
		 /* } */
	 } // .end annotation
	 /* .line 3 */
	 /* new-instance v0, Le/f/a/b/h/f0; */
	 /* invoke-direct {v0}, Le/f/a/b/h/f0;-><init>()V */
	 /* .line 4 */
	 (( e.f.a.b.h.f0 ) v0 ).a ( p0 ); // invoke-virtual {v0, p0}, Le/f/a/b/h/f0;->a(Ljava/lang/Exception;)V
} // .end method
public static e.f.a.b.h.g a ( java.lang.Object p0 ) {
	 /* .locals 1 */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "<TResult:", */
	 /* "Ljava/lang/Object;", */
	 /* ">(TTResult;)", */
	 /* "Le/f/a/b/h/g<", */
	 /* "TTResult;>;" */
	 /* } */
} // .end annotation
/* .line 1 */
/* new-instance v0, Le/f/a/b/h/f0; */
/* invoke-direct {v0}, Le/f/a/b/h/f0;-><init>()V */
/* .line 2 */
(( e.f.a.b.h.f0 ) v0 ).a ( p0 ); // invoke-virtual {v0, p0}, Le/f/a/b/h/f0;->a(Ljava/lang/Object;)V
} // .end method
public static e.f.a.b.h.g a ( java.util.Collection p0 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/Collection<", */
/* "+", */
/* "Le/f/a/b/h/g<", */
/* "*>;>;)", */
/* "Le/f/a/b/h/g<", */
/* "Ljava/lang/Void;", */
/* ">;" */
/* } */
} // .end annotation
v0 = /* .line 27 */
if ( v0 != null) { // if-eqz v0, :cond_0
int p0 = 0; // const/4 p0, 0x0
/* .line 28 */
e.f.a.b.h.n .a ( p0 );
/* .line 29 */
} // :cond_0
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_2
/* check-cast v1, Le/f/a/b/h/g; */
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 30 */
} // :cond_1
/* new-instance p0, Ljava/lang/NullPointerException; */
final String v0 = "null tasks are not accepted"; // const-string v0, "null tasks are not accepted"
/* invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
/* .line 31 */
} // :cond_2
/* new-instance v0, Le/f/a/b/h/f0; */
/* invoke-direct {v0}, Le/f/a/b/h/f0;-><init>()V */
/* .line 32 */
v2 = /* new-instance v1, Le/f/a/b/h/m; */
/* invoke-direct {v1, v2, v0}, Le/f/a/b/h/m;-><init>(ILe/f/a/b/h/f0;)V */
/* .line 33 */
v2 = } // :goto_1
if ( v2 != null) { // if-eqz v2, :cond_3
/* check-cast v2, Le/f/a/b/h/g; */
/* .line 34 */
e.f.a.b.h.n .a ( v2,v1 );
} // :cond_3
} // .end method
public static e.f.a.b.h.g a ( java.util.concurrent.Executor p0, java.util.concurrent.Callable p1 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<TResult:", */
/* "Ljava/lang/Object;", */
/* ">(", */
/* "Ljava/util/concurrent/Executor;", */
/* "Ljava/util/concurrent/Callable<", */
/* "TTResult;>;)", */
/* "Le/f/a/b/h/g<", */
/* "TTResult;>;" */
/* } */
} // .end annotation
final String v0 = "Executor must not be null"; // const-string v0, "Executor must not be null"
/* .line 5 */
e.f.a.b.c.m.h .a ( p0,v0 );
final String v0 = "Callback must not be null"; // const-string v0, "Callback must not be null"
/* .line 6 */
e.f.a.b.c.m.h .a ( p1,v0 );
/* .line 7 */
/* new-instance v0, Le/f/a/b/h/f0; */
/* invoke-direct {v0}, Le/f/a/b/h/f0;-><init>()V */
/* .line 8 */
/* new-instance v1, Le/f/a/b/h/g0; */
/* invoke-direct {v1, v0, p1}, Le/f/a/b/h/g0;-><init>(Le/f/a/b/h/f0;Ljava/util/concurrent/Callable;)V */
} // .end method
public static e.f.a.b.h.g a ( Object...p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "([", */
/* "Le/f/a/b/h/g<", */
/* "*>;)", */
/* "Le/f/a/b/h/g<", */
/* "Ljava/lang/Void;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 35 */
/* array-length v0, p0 */
/* if-nez v0, :cond_0 */
int p0 = 0; // const/4 p0, 0x0
/* .line 36 */
e.f.a.b.h.n .a ( p0 );
/* .line 37 */
} // :cond_0
java.util.Arrays .asList ( p0 );
e.f.a.b.h.n .a ( p0 );
} // .end method
public static java.lang.Object a ( Object p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<TResult:", */
/* "Ljava/lang/Object;", */
/* ">(", */
/* "Le/f/a/b/h/g<", */
/* "TTResult;>;)TTResult;" */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/util/concurrent/ExecutionException;, */
/* Ljava/lang/InterruptedException; */
/* } */
} // .end annotation
/* .line 9 */
e.f.a.b.c.m.h .a ( );
final String v0 = "Task must not be null"; // const-string v0, "Task must not be null"
/* .line 10 */
e.f.a.b.c.m.h .a ( p0,v0 );
/* .line 11 */
v0 = (( e.f.a.b.h.g ) p0 ).d ( ); // invoke-virtual {p0}, Le/f/a/b/h/g;->d()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 12 */
e.f.a.b.h.n .b ( p0 );
/* .line 13 */
} // :cond_0
/* new-instance v0, Le/f/a/b/h/k; */
int v1 = 0; // const/4 v1, 0x0
/* invoke-direct {v0, v1}, Le/f/a/b/h/k;-><init>(Le/f/a/b/h/g0;)V */
/* .line 14 */
e.f.a.b.h.n .a ( p0,v0 );
/* .line 15 */
(( e.f.a.b.h.k ) v0 ).b ( ); // invoke-virtual {v0}, Le/f/a/b/h/k;->b()V
/* .line 16 */
e.f.a.b.h.n .b ( p0 );
} // .end method
public static java.lang.Object a ( Object p0, Long p1, java.util.concurrent.TimeUnit p2 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<TResult:", */
/* "Ljava/lang/Object;", */
/* ">(", */
/* "Le/f/a/b/h/g<", */
/* "TTResult;>;J", */
/* "Ljava/util/concurrent/TimeUnit;", */
/* ")TTResult;" */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/util/concurrent/ExecutionException;, */
/* Ljava/lang/InterruptedException;, */
/* Ljava/util/concurrent/TimeoutException; */
/* } */
} // .end annotation
/* .line 17 */
e.f.a.b.c.m.h .a ( );
final String v0 = "Task must not be null"; // const-string v0, "Task must not be null"
/* .line 18 */
e.f.a.b.c.m.h .a ( p0,v0 );
final String v0 = "TimeUnit must not be null"; // const-string v0, "TimeUnit must not be null"
/* .line 19 */
e.f.a.b.c.m.h .a ( p3,v0 );
/* .line 20 */
v0 = (( e.f.a.b.h.g ) p0 ).d ( ); // invoke-virtual {p0}, Le/f/a/b/h/g;->d()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 21 */
e.f.a.b.h.n .b ( p0 );
/* .line 22 */
} // :cond_0
/* new-instance v0, Le/f/a/b/h/k; */
int v1 = 0; // const/4 v1, 0x0
/* invoke-direct {v0, v1}, Le/f/a/b/h/k;-><init>(Le/f/a/b/h/g0;)V */
/* .line 23 */
e.f.a.b.h.n .a ( p0,v0 );
/* .line 24 */
p1 = (( e.f.a.b.h.k ) v0 ).a ( p1, p2, p3 ); // invoke-virtual {v0, p1, p2, p3}, Le/f/a/b/h/k;->a(JLjava/util/concurrent/TimeUnit;)Z
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 25 */
e.f.a.b.h.n .b ( p0 );
/* .line 26 */
} // :cond_1
/* new-instance p0, Ljava/util/concurrent/TimeoutException; */
final String p1 = "Timed out waiting for Task"; // const-string p1, "Timed out waiting for Task"
/* invoke-direct {p0, p1}, Ljava/util/concurrent/TimeoutException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
} // .end method
public static void a ( Object p0, Object p1 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/f/a/b/h/g<", */
/* "*>;", */
/* "Le/f/a/b/h/l;", */
/* ")V" */
/* } */
} // .end annotation
/* .line 38 */
v0 = e.f.a.b.h.j.b;
(( e.f.a.b.h.g ) p0 ).a ( v0, p1 ); // invoke-virtual {p0, v0, p1}, Le/f/a/b/h/g;->a(Ljava/util/concurrent/Executor;Le/f/a/b/h/e;)Le/f/a/b/h/g;
/* .line 39 */
v0 = e.f.a.b.h.j.b;
(( e.f.a.b.h.g ) p0 ).a ( v0, p1 ); // invoke-virtual {p0, v0, p1}, Le/f/a/b/h/g;->a(Ljava/util/concurrent/Executor;Le/f/a/b/h/d;)Le/f/a/b/h/g;
/* .line 40 */
v0 = e.f.a.b.h.j.b;
(( e.f.a.b.h.g ) p0 ).a ( v0, p1 ); // invoke-virtual {p0, v0, p1}, Le/f/a/b/h/g;->a(Ljava/util/concurrent/Executor;Le/f/a/b/h/b;)Le/f/a/b/h/g;
return;
} // .end method
public static java.lang.Object b ( Object p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<TResult:", */
/* "Ljava/lang/Object;", */
/* ">(", */
/* "Le/f/a/b/h/g<", */
/* "TTResult;>;)TTResult;" */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/util/concurrent/ExecutionException; */
/* } */
} // .end annotation
/* .line 1 */
v0 = (( e.f.a.b.h.g ) p0 ).e ( ); // invoke-virtual {p0}, Le/f/a/b/h/g;->e()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
(( e.f.a.b.h.g ) p0 ).b ( ); // invoke-virtual {p0}, Le/f/a/b/h/g;->b()Ljava/lang/Object;
/* .line 3 */
} // :cond_0
v0 = (( e.f.a.b.h.g ) p0 ).c ( ); // invoke-virtual {p0}, Le/f/a/b/h/g;->c()Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 4 */
/* new-instance p0, Ljava/util/concurrent/CancellationException; */
final String v0 = "Task is already canceled"; // const-string v0, "Task is already canceled"
/* invoke-direct {p0, v0}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
/* .line 5 */
} // :cond_1
/* new-instance v0, Ljava/util/concurrent/ExecutionException; */
(( e.f.a.b.h.g ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/a/b/h/g;->a()Ljava/lang/Exception;
/* invoke-direct {v0, p0}, Ljava/util/concurrent/ExecutionException;-><init>(Ljava/lang/Throwable;)V */
/* throw v0 */
} // .end method
