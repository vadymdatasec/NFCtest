public class e.f.c.l.e.m.j0 implements java.util.concurrent.Callable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/Object;", */
	 /* "Ljava/util/concurrent/Callable<", */
	 /* "Le/f/a/b/h/g<", */
	 /* "Ljava/lang/Void;", */
	 /* ">;>;" */
	 /* } */
} // .end annotation
/* # instance fields */
public final java.lang.Boolean a; //synthetic
public final e.f.c.l.e.m.k0 b; //synthetic
/* # direct methods */
public e.f.c.l.e.m.j0 ( ) {
	 /* .locals 0 */
	 /* .line 1 */
	 this.b = p1;
	 this.a = p2;
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 return;
} // .end method
/* # virtual methods */
public e.f.a.b.h.g call ( ) {
	 /* .locals 5 */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "()", */
	 /* "Le/f/a/b/h/g<", */
	 /* "Ljava/lang/Void;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/Exception; */
/* } */
} // .end annotation
/* .line 2 */
v0 = this.b;
v0 = this.c;
e.f.c.l.e.m.v0 .e ( v0 );
(( e.f.c.l.e.t.a ) v0 ).b ( ); // invoke-virtual {v0}, Le/f/c/l/e/t/a;->b()Ljava/util/List;
/* .line 3 */
v1 = this.a;
v1 = (( java.lang.Boolean ) v1 ).booleanValue ( ); // invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z
/* if-nez v1, :cond_0 */
/* .line 4 */
e.f.c.l.e.b .a ( );
final String v2 = "Reports are being deleted."; // const-string v2, "Reports are being deleted."
(( e.f.c.l.e.b ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
/* .line 5 */
v1 = this.b;
v1 = this.c;
(( e.f.c.l.e.m.v0 ) v1 ).l ( ); // invoke-virtual {v1}, Le/f/c/l/e/m/v0;->l()[Ljava/io/File;
e.f.c.l.e.m.v0 .b ( v1 );
/* .line 6 */
v1 = this.b;
v1 = this.c;
e.f.c.l.e.m.v0 .e ( v1 );
(( e.f.c.l.e.t.a ) v1 ).a ( v0 ); // invoke-virtual {v1, v0}, Le/f/c/l/e/t/a;->a(Ljava/util/List;)V
/* .line 7 */
v0 = this.b;
v0 = this.c;
e.f.c.l.e.m.v0 .m ( v0 );
(( e.f.c.l.e.m.z1 ) v0 ).a ( ); // invoke-virtual {v0}, Le/f/c/l/e/m/z1;->a()V
/* .line 8 */
v0 = this.b;
v0 = this.c;
v0 = this.w;
int v1 = 0; // const/4 v1, 0x0
(( e.f.a.b.h.h ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Le/f/a/b/h/h;->b(Ljava/lang/Object;)Z
/* .line 9 */
e.f.a.b.h.n .a ( v1 );
/* .line 10 */
} // :cond_0
e.f.c.l.e.b .a ( );
final String v2 = "Reports are being sent."; // const-string v2, "Reports are being sent."
(( e.f.c.l.e.b ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
/* .line 11 */
v1 = this.a;
v1 = (( java.lang.Boolean ) v1 ).booleanValue ( ); // invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z
/* .line 12 */
v2 = this.b;
v2 = this.c;
e.f.c.l.e.m.v0 .b ( v2 );
(( e.f.c.l.e.m.i1 ) v2 ).a ( v1 ); // invoke-virtual {v2, v1}, Le/f/c/l/e/m/i1;->a(Z)V
/* .line 13 */
v2 = this.b;
v2 = this.c;
e.f.c.l.e.m.v0 .c ( v2 );
(( e.f.c.l.e.m.o ) v2 ).b ( ); // invoke-virtual {v2}, Le/f/c/l/e/m/o;->b()Ljava/util/concurrent/Executor;
/* .line 14 */
v3 = this.b;
v3 = this.a;
/* new-instance v4, Le/f/c/l/e/m/i0; */
/* invoke-direct {v4, p0, v0, v1, v2}, Le/f/c/l/e/m/i0;-><init>(Le/f/c/l/e/m/j0;Ljava/util/List;ZLjava/util/concurrent/Executor;)V */
(( e.f.a.b.h.g ) v3 ).a ( v2, v4 ); // invoke-virtual {v3, v2, v4}, Le/f/a/b/h/g;->a(Ljava/util/concurrent/Executor;Le/f/a/b/h/f;)Le/f/a/b/h/g;
} // .end method
public java.lang.Object call ( ) { //bridge//synthethic
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/Exception; */
/* } */
} // .end annotation
/* .line 1 */
(( e.f.c.l.e.m.j0 ) p0 ).call ( ); // invoke-virtual {p0}, Le/f/c/l/e/m/j0;->call()Le/f/a/b/h/g;
} // .end method
