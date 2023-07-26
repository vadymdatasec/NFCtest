public class e.f.c.l.e.m.o {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final java.util.concurrent.ExecutorService a;
	 public e.f.a.b.h.g b;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Le/f/a/b/h/g<", */
	 /* "Ljava/lang/Void;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
public final java.lang.Object c;
public java.lang.ThreadLocal d;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/lang/ThreadLocal<", */
/* "Ljava/lang/Boolean;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public e.f.c.l.e.m.o ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
e.f.a.b.h.n .a ( v0 );
this.b = v0;
/* .line 3 */
/* new-instance v0, Ljava/lang/Object; */
/* invoke-direct {v0}, Ljava/lang/Object;-><init>()V */
this.c = v0;
/* .line 4 */
/* new-instance v0, Ljava/lang/ThreadLocal; */
/* invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V */
this.d = v0;
/* .line 5 */
this.a = p1;
/* .line 6 */
/* new-instance v0, Le/f/c/l/e/m/k; */
/* invoke-direct {v0, p0}, Le/f/c/l/e/m/k;-><init>(Le/f/c/l/e/m/o;)V */
return;
} // .end method
public static java.lang.ThreadLocal a ( Object p0 ) { //synthethic
/* .locals 0 */
/* .line 1 */
p0 = this.d;
} // .end method
/* # virtual methods */
public final e.f.a.b.h.a a ( java.util.concurrent.Callable p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<T:", */
/* "Ljava/lang/Object;", */
/* ">(", */
/* "Ljava/util/concurrent/Callable<", */
/* "TT;>;)", */
/* "Le/f/a/b/h/a<", */
/* "Ljava/lang/Void;", */
/* "TT;>;" */
/* } */
} // .end annotation
/* .line 5 */
/* new-instance v0, Le/f/c/l/e/m/m; */
/* invoke-direct {v0, p0, p1}, Le/f/c/l/e/m/m;-><init>(Le/f/c/l/e/m/o;Ljava/util/concurrent/Callable;)V */
} // .end method
public final e.f.a.b.h.g a ( Object p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<T:", */
/* "Ljava/lang/Object;", */
/* ">(", */
/* "Le/f/a/b/h/g<", */
/* "TT;>;)", */
/* "Le/f/a/b/h/g<", */
/* "Ljava/lang/Void;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 6 */
v0 = this.a;
/* new-instance v1, Le/f/c/l/e/m/n; */
/* invoke-direct {v1, p0}, Le/f/c/l/e/m/n;-><init>(Le/f/c/l/e/m/o;)V */
(( e.f.a.b.h.g ) p1 ).a ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Le/f/a/b/h/g;->a(Ljava/util/concurrent/Executor;Le/f/a/b/h/a;)Le/f/a/b/h/g;
} // .end method
public e.f.a.b.h.g a ( java.lang.Runnable p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/Runnable;", */
/* ")", */
/* "Le/f/a/b/h/g<", */
/* "Ljava/lang/Void;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 4 */
/* new-instance v0, Le/f/c/l/e/m/l; */
/* invoke-direct {v0, p0, p1}, Le/f/c/l/e/m/l;-><init>(Le/f/c/l/e/m/o;Ljava/lang/Runnable;)V */
(( e.f.c.l.e.m.o ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Le/f/c/l/e/m/o;->b(Ljava/util/concurrent/Callable;)Le/f/a/b/h/g;
} // .end method
public void a ( ) {
/* .locals 2 */
/* .line 2 */
v0 = (( e.f.c.l.e.m.o ) p0 ).c ( ); // invoke-virtual {p0}, Le/f/c/l/e/m/o;->c()Z
if ( v0 != null) { // if-eqz v0, :cond_0
return;
/* .line 3 */
} // :cond_0
/* new-instance v0, Ljava/lang/IllegalStateException; */
final String v1 = "Not running on background worker thread as intended."; // const-string v1, "Not running on background worker thread as intended."
/* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public e.f.a.b.h.g b ( java.util.concurrent.Callable p0 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<T:", */
/* "Ljava/lang/Object;", */
/* ">(", */
/* "Ljava/util/concurrent/Callable<", */
/* "TT;>;)", */
/* "Le/f/a/b/h/g<", */
/* "TT;>;" */
/* } */
} // .end annotation
/* .line 2 */
v0 = this.c;
/* monitor-enter v0 */
/* .line 3 */
try { // :try_start_0
v1 = this.b;
v2 = this.a;
(( e.f.c.l.e.m.o ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/f/c/l/e/m/o;->a(Ljava/util/concurrent/Callable;)Le/f/a/b/h/a;
(( e.f.a.b.h.g ) v1 ).a ( v2, p1 ); // invoke-virtual {v1, v2, p1}, Le/f/a/b/h/g;->a(Ljava/util/concurrent/Executor;Le/f/a/b/h/a;)Le/f/a/b/h/g;
/* .line 4 */
(( e.f.c.l.e.m.o ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/f/c/l/e/m/o;->a(Le/f/a/b/h/g;)Le/f/a/b/h/g;
this.b = v1;
/* .line 5 */
/* monitor-exit v0 */
/* :catchall_0 */
/* move-exception p1 */
/* .line 6 */
/* monitor-exit v0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw p1 */
} // .end method
public java.util.concurrent.Executor b ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
} // .end method
public e.f.a.b.h.g c ( java.util.concurrent.Callable p0 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<T:", */
/* "Ljava/lang/Object;", */
/* ">(", */
/* "Ljava/util/concurrent/Callable<", */
/* "Le/f/a/b/h/g<", */
/* "TT;>;>;)", */
/* "Le/f/a/b/h/g<", */
/* "TT;>;" */
/* } */
} // .end annotation
/* .line 2 */
v0 = this.c;
/* monitor-enter v0 */
/* .line 3 */
try { // :try_start_0
v1 = this.b;
v2 = this.a;
(( e.f.c.l.e.m.o ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/f/c/l/e/m/o;->a(Ljava/util/concurrent/Callable;)Le/f/a/b/h/a;
(( e.f.a.b.h.g ) v1 ).b ( v2, p1 ); // invoke-virtual {v1, v2, p1}, Le/f/a/b/h/g;->b(Ljava/util/concurrent/Executor;Le/f/a/b/h/a;)Le/f/a/b/h/g;
/* .line 4 */
(( e.f.c.l.e.m.o ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/f/c/l/e/m/o;->a(Le/f/a/b/h/g;)Le/f/a/b/h/g;
this.b = v1;
/* .line 5 */
/* monitor-exit v0 */
/* :catchall_0 */
/* move-exception p1 */
/* .line 6 */
/* monitor-exit v0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw p1 */
} // .end method
public final Boolean c ( ) {
/* .locals 2 */
/* .line 1 */
v0 = java.lang.Boolean.TRUE;
v1 = this.d;
(( java.lang.ThreadLocal ) v1 ).get ( ); // invoke-virtual {v1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;
v0 = (( java.lang.Boolean ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z
} // .end method
