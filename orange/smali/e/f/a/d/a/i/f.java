public abstract class e.f.a.d.a.i.f {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static e.f.a.d.a.i.d a ( java.lang.Exception p0 ) {
		 /* .locals 1 */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "<ResultT:", */
		 /* "Ljava/lang/Object;", */
		 /* ">(", */
		 /* "Ljava/lang/Exception;", */
		 /* ")", */
		 /* "Le/f/a/d/a/i/d<", */
		 /* "TResultT;>;" */
		 /* } */
	 } // .end annotation
	 /* new-instance v0, Le/f/a/d/a/i/r; */
	 /* invoke-direct {v0}, Le/f/a/d/a/i/r;-><init>()V */
	 (( e.f.a.d.a.i.r ) v0 ).a ( p0 ); // invoke-virtual {v0, p0}, Le/f/a/d/a/i/r;->a(Ljava/lang/Exception;)V
} // .end method
public static e.f.a.d.a.i.d a ( java.lang.Object p0 ) {
	 /* .locals 1 */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "<ResultT:", */
	 /* "Ljava/lang/Object;", */
	 /* ">(TResultT;)", */
	 /* "Le/f/a/d/a/i/d<", */
	 /* "TResultT;>;" */
	 /* } */
} // .end annotation
/* new-instance v0, Le/f/a/d/a/i/r; */
/* invoke-direct {v0}, Le/f/a/d/a/i/r;-><init>()V */
(( e.f.a.d.a.i.r ) v0 ).a ( p0 ); // invoke-virtual {v0, p0}, Le/f/a/d/a/i/r;->a(Ljava/lang/Object;)V
} // .end method
public static java.lang.Object a ( Object p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<ResultT:", */
/* "Ljava/lang/Object;", */
/* ">(", */
/* "Le/f/a/d/a/i/d<", */
/* "TResultT;>;)TResultT;" */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/util/concurrent/ExecutionException;, */
/* Ljava/lang/InterruptedException; */
/* } */
} // .end annotation
final String v0 = "Task must not be null"; // const-string v0, "Task must not be null"
e.f.a.d.a.e.l .a ( p0,v0 );
v0 = (( e.f.a.d.a.i.d ) p0 ).c ( ); // invoke-virtual {p0}, Le/f/a/d/a/i/d;->c()Z
if ( v0 != null) { // if-eqz v0, :cond_0
e.f.a.d.a.i.f .b ( p0 );
} // :cond_0
/* new-instance v0, Le/f/a/d/a/i/s; */
int v1 = 0; // const/4 v1, 0x0
/* invoke-direct {v0, v1}, Le/f/a/d/a/i/s;-><init>([B)V */
e.f.a.d.a.i.f .a ( p0,v0 );
(( e.f.a.d.a.i.s ) v0 ).a ( ); // invoke-virtual {v0}, Le/f/a/d/a/i/s;->a()V
e.f.a.d.a.i.f .b ( p0 );
} // .end method
public static void a ( Object p0, Object p1 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/f/a/d/a/i/d<", */
/* "*>;", */
/* "Le/f/a/d/a/i/s;", */
/* ")V" */
/* } */
} // .end annotation
v0 = e.f.a.d.a.i.e.b;
(( e.f.a.d.a.i.d ) p0 ).a ( v0, p1 ); // invoke-virtual {p0, v0, p1}, Le/f/a/d/a/i/d;->a(Ljava/util/concurrent/Executor;Le/f/a/d/a/i/c;)Le/f/a/d/a/i/d;
v0 = e.f.a.d.a.i.e.b;
(( e.f.a.d.a.i.d ) p0 ).a ( v0, p1 ); // invoke-virtual {p0, v0, p1}, Le/f/a/d/a/i/d;->a(Ljava/util/concurrent/Executor;Le/f/a/d/a/i/b;)Le/f/a/d/a/i/d;
return;
} // .end method
public static java.lang.Object b ( Object p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<ResultT:", */
/* "Ljava/lang/Object;", */
/* ">(", */
/* "Le/f/a/d/a/i/d<", */
/* "TResultT;>;)TResultT;" */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/util/concurrent/ExecutionException; */
/* } */
} // .end annotation
v0 = (( e.f.a.d.a.i.d ) p0 ).d ( ); // invoke-virtual {p0}, Le/f/a/d/a/i/d;->d()Z
if ( v0 != null) { // if-eqz v0, :cond_0
(( e.f.a.d.a.i.d ) p0 ).b ( ); // invoke-virtual {p0}, Le/f/a/d/a/i/d;->b()Ljava/lang/Object;
} // :cond_0
/* new-instance v0, Ljava/util/concurrent/ExecutionException; */
(( e.f.a.d.a.i.d ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/a/d/a/i/d;->a()Ljava/lang/Exception;
/* invoke-direct {v0, p0}, Ljava/util/concurrent/ExecutionException;-><init>(Ljava/lang/Throwable;)V */
/* throw v0 */
} // .end method
