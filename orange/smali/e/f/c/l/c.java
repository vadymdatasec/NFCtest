public class e.f.c.l.c implements java.util.concurrent.Callable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/Object;", */
	 /* "Ljava/util/concurrent/Callable<", */
	 /* "Ljava/lang/Void;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* # instance fields */
public final e.f.c.l.e.j a; //synthetic
public final java.util.concurrent.ExecutorService b; //synthetic
public final e.f.c.l.e.v.e c; //synthetic
public final Boolean d; //synthetic
public final e.f.c.l.e.m.b1 e; //synthetic
/* # direct methods */
public e.f.c.l.c ( ) {
	 /* .locals 0 */
	 /* .line 1 */
	 this.a = p1;
	 this.b = p2;
	 this.c = p3;
	 /* iput-boolean p4, p0, Le/f/c/l/c;->d:Z */
	 this.e = p5;
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 return;
} // .end method
/* # virtual methods */
public java.lang.Object call ( ) { //bridge//synthethic
	 /* .locals 1 */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Ljava/lang/Exception; */
	 /* } */
} // .end annotation
/* .line 1 */
(( e.f.c.l.c ) p0 ).call ( ); // invoke-virtual {p0}, Le/f/c/l/c;->call()Ljava/lang/Void;
} // .end method
public java.lang.Void call ( ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/Exception; */
/* } */
} // .end annotation
/* .line 2 */
v0 = this.a;
v1 = this.b;
v2 = this.c;
(( e.f.c.l.e.j ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Le/f/c/l/e/j;->a(Ljava/util/concurrent/Executor;Le/f/c/l/e/v/e;)V
/* .line 3 */
/* iget-boolean v0, p0, Le/f/c/l/c;->d:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 4 */
v0 = this.e;
v1 = this.c;
(( e.f.c.l.e.m.b1 ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/m/b1;->b(Le/f/c/l/e/v/f;)Le/f/a/b/h/g;
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
