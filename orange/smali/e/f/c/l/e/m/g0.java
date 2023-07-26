public class e.f.c.l.e.m.g0 implements java.util.concurrent.Callable {
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
public final java.util.Date a; //synthetic
public final java.lang.Throwable b; //synthetic
public final java.lang.Thread c; //synthetic
public final e.f.c.l.e.v.f d; //synthetic
public final e.f.c.l.e.m.v0 e; //synthetic
/* # direct methods */
public e.f.c.l.e.m.g0 ( ) {
	 /* .locals 0 */
	 /* .line 1 */
	 this.e = p1;
	 this.a = p2;
	 this.b = p3;
	 this.c = p4;
	 this.d = p5;
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 return;
} // .end method
/* # virtual methods */
public e.f.a.b.h.g call ( ) {
	 /* .locals 10 */
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
v0 = this.a;
e.f.c.l.e.m.v0 .a ( v0 );
/* move-result-wide v7 */
/* .line 3 */
v0 = this.e;
e.f.c.l.e.m.v0 .k ( v0 );
int v9 = 0; // const/4 v9, 0x0
/* if-nez v0, :cond_0 */
/* .line 4 */
e.f.c.l.e.b .a ( );
final String v1 = "Tried to write a fatal exception while no session was open."; // const-string v1, "Tried to write a fatal exception while no session was open."
/* .line 5 */
(( e.f.c.l.e.b ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/b;->b(Ljava/lang/String;)V
/* .line 6 */
e.f.a.b.h.n .a ( v9 );
/* .line 7 */
} // :cond_0
v1 = this.e;
e.f.c.l.e.m.v0 .l ( v1 );
(( e.f.c.l.e.m.c1 ) v1 ).a ( ); // invoke-virtual {v1}, Le/f/c/l/e/m/c1;->a()Z
/* .line 8 */
v1 = this.e;
e.f.c.l.e.m.v0 .m ( v1 );
v2 = this.b;
v3 = this.c;
/* .line 9 */
e.f.c.l.e.m.v0 .h ( v0 );
/* move-wide v5, v7 */
/* .line 10 */
/* invoke-virtual/range {v1 ..v6}, Le/f/c/l/e/m/z1;->a(Ljava/lang/Throwable;Ljava/lang/Thread;Ljava/lang/String;J)V */
/* .line 11 */
v1 = this.e;
v2 = this.c;
v3 = this.b;
/* move-object v4, v0 */
/* invoke-static/range {v1 ..v6}, Le/f/c/l/e/m/v0;->a(Le/f/c/l/e/m/v0;Ljava/lang/Thread;Ljava/lang/Throwable;Ljava/lang/String;J)V */
/* .line 12 */
v0 = this.e;
v1 = this.a;
(( java.util.Date ) v1 ).getTime ( ); // invoke-virtual {v1}, Ljava/util/Date;->getTime()J
/* move-result-wide v1 */
e.f.c.l.e.m.v0 .a ( v0,v1,v2 );
/* .line 13 */
v0 = this.d;
/* .line 14 */
/* iget v1, v1, Le/f/c/l/e/v/j/d;->a:I */
/* .line 15 */
/* iget v0, v0, Le/f/c/l/e/v/j/d;->b:I */
/* .line 16 */
v2 = this.e;
(( e.f.c.l.e.m.v0 ) v2 ).a ( v1 ); // invoke-virtual {v2, v1}, Le/f/c/l/e/m/v0;->a(I)V
/* .line 17 */
v1 = this.e;
e.f.c.l.e.m.v0 .a ( v1 );
/* .line 18 */
v1 = this.e;
(( e.f.c.l.e.m.v0 ) v1 ).d ( v0 ); // invoke-virtual {v1, v0}, Le/f/c/l/e/m/v0;->d(I)V
/* .line 19 */
v0 = this.e;
e.f.c.l.e.m.v0 .b ( v0 );
v0 = (( e.f.c.l.e.m.i1 ) v0 ).b ( ); // invoke-virtual {v0}, Le/f/c/l/e/m/i1;->b()Z
/* if-nez v0, :cond_1 */
/* .line 20 */
e.f.a.b.h.n .a ( v9 );
/* .line 21 */
} // :cond_1
v0 = this.e;
e.f.c.l.e.m.v0 .c ( v0 );
(( e.f.c.l.e.m.o ) v0 ).b ( ); // invoke-virtual {v0}, Le/f/c/l/e/m/o;->b()Ljava/util/concurrent/Executor;
/* .line 22 */
v1 = this.d;
/* .line 23 */
/* new-instance v2, Le/f/c/l/e/m/f0; */
/* invoke-direct {v2, p0, v0}, Le/f/c/l/e/m/f0;-><init>(Le/f/c/l/e/m/g0;Ljava/util/concurrent/Executor;)V */
/* .line 24 */
(( e.f.a.b.h.g ) v1 ).a ( v0, v2 ); // invoke-virtual {v1, v0, v2}, Le/f/a/b/h/g;->a(Ljava/util/concurrent/Executor;Le/f/a/b/h/f;)Le/f/a/b/h/g;
} // .end method
public java.lang.Object call ( ) { //bridge//synthethic
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/Exception; */
/* } */
} // .end annotation
/* .line 1 */
(( e.f.c.l.e.m.g0 ) p0 ).call ( ); // invoke-virtual {p0}, Le/f/c/l/e/m/g0;->call()Le/f/a/b/h/g;
} // .end method
