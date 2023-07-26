public class e.f.c.l.e.m.i0 implements e.f.a.b.h.f {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/Object;", */
	 /* "Le/f/a/b/h/f<", */
	 /* "Le/f/c/l/e/v/j/b;", */
	 /* "Ljava/lang/Void;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* # instance fields */
public final java.util.List a; //synthetic
public final Boolean b; //synthetic
public final java.util.concurrent.Executor c; //synthetic
public final e.f.c.l.e.m.j0 d; //synthetic
/* # direct methods */
public e.f.c.l.e.m.i0 ( ) {
	 /* .locals 0 */
	 /* .line 1 */
	 this.d = p1;
	 this.a = p2;
	 /* iput-boolean p3, p0, Le/f/c/l/e/m/i0;->b:Z */
	 this.c = p4;
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 return;
} // .end method
/* # virtual methods */
public e.f.a.b.h.g a ( Object p0 ) {
	 /* .locals 5 */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "(", */
	 /* "Le/f/c/l/e/v/j/b;", */
	 /* ")", */
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
int v0 = 0; // const/4 v0, 0x0
/* if-nez p1, :cond_0 */
/* .line 2 */
e.f.c.l.e.b .a ( );
final String v1 = "Received null app settings, cannot send reports during app startup."; // const-string v1, "Received null app settings, cannot send reports during app startup."
/* .line 3 */
(( e.f.c.l.e.b ) p1 ).d ( v1 ); // invoke-virtual {p1, v1}, Le/f/c/l/e/b;->d(Ljava/lang/String;)V
/* .line 4 */
e.f.a.b.h.n .a ( v0 );
/* .line 5 */
} // :cond_0
v1 = this.a;
} // :cond_1
v2 = } // :goto_0
if ( v2 != null) { // if-eqz v2, :cond_2
/* check-cast v2, Le/f/c/l/e/t/g/d; */
/* .line 6 */
v4 = e.f.c.l.e.t.g.c.b;
/* if-ne v3, v4, :cond_1 */
/* .line 7 */
v3 = this.e;
/* .line 8 */
/* .line 9 */
e.f.c.l.e.m.v0 .a ( v3,v2 );
/* .line 10 */
} // :cond_2
v1 = this.d;
v1 = this.b;
v1 = this.c;
e.f.c.l.e.m.v0 .d ( v1 );
/* .line 11 */
v1 = this.d;
v1 = this.b;
v1 = this.c;
/* .line 12 */
e.f.c.l.e.m.v0 .f ( v1 );
/* .line 13 */
v2 = this.a;
/* iget-boolean v3, p0, Le/f/c/l/e/m/i0;->b:Z */
v4 = this.d;
v4 = this.b;
/* iget v4, v4, Le/f/c/l/e/m/k0;->b:F */
(( e.f.c.l.e.t.f ) v1 ).a ( v2, v3, v4 ); // invoke-virtual {v1, v2, v3, v4}, Le/f/c/l/e/t/f;->a(Ljava/util/List;ZF)V
/* .line 14 */
v1 = this.d;
v1 = this.b;
v1 = this.c;
e.f.c.l.e.m.v0 .m ( v1 );
v2 = this.c;
/* .line 15 */
e.f.c.l.e.m.j1 .a ( p1 );
/* .line 16 */
(( e.f.c.l.e.m.z1 ) v1 ).a ( v2, p1 ); // invoke-virtual {v1, v2, p1}, Le/f/c/l/e/m/z1;->a(Ljava/util/concurrent/Executor;Le/f/c/l/e/m/j1;)Le/f/a/b/h/g;
/* .line 17 */
p1 = this.d;
p1 = this.b;
p1 = this.c;
p1 = this.w;
(( e.f.a.b.h.h ) p1 ).b ( v0 ); // invoke-virtual {p1, v0}, Le/f/a/b/h/h;->b(Ljava/lang/Object;)Z
/* .line 18 */
e.f.a.b.h.n .a ( v0 );
} // .end method
public e.f.a.b.h.g a ( java.lang.Object p0 ) { //bridge//synthethic
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/Exception; */
/* } */
} // .end annotation
/* .line 1 */
/* check-cast p1, Le/f/c/l/e/v/j/b; */
(( e.f.c.l.e.m.i0 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/f/c/l/e/m/i0;->a(Le/f/c/l/e/v/j/b;)Le/f/a/b/h/g;
} // .end method
