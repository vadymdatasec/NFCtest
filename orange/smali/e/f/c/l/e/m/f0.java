public class e.f.c.l.e.m.f0 implements e.f.a.b.h.f {
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
public final java.util.concurrent.Executor a; //synthetic
public final e.f.c.l.e.m.g0 b; //synthetic
/* # direct methods */
public e.f.c.l.e.m.f0 ( ) {
	 /* .locals 0 */
	 /* .line 1 */
	 this.b = p1;
	 this.a = p2;
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 return;
} // .end method
/* # virtual methods */
public e.f.a.b.h.g a ( Object p0 ) {
	 /* .locals 4 */
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
/* if-nez p1, :cond_0 */
/* .line 2 */
e.f.c.l.e.b .a ( );
final String v0 = "Received null app settings, cannot send reports at crash time."; // const-string v0, "Received null app settings, cannot send reports at crash time."
/* .line 3 */
(( e.f.c.l.e.b ) p1 ).d ( v0 ); // invoke-virtual {p1, v0}, Le/f/c/l/e/b;->d(Ljava/lang/String;)V
int p1 = 0; // const/4 p1, 0x0
/* .line 4 */
e.f.a.b.h.n .a ( p1 );
/* .line 5 */
} // :cond_0
v0 = this.b;
v0 = this.e;
int v1 = 1; // const/4 v1, 0x1
e.f.c.l.e.m.v0 .a ( v0,p1,v1 );
int v0 = 2; // const/4 v0, 0x2
/* new-array v0, v0, [Le/f/a/b/h/g; */
int v2 = 0; // const/4 v2, 0x0
/* .line 6 */
v3 = this.b;
v3 = this.e;
/* .line 7 */
e.f.c.l.e.m.v0 .d ( v3 );
/* aput-object v3, v0, v2 */
v2 = this.b;
v2 = this.e;
/* .line 8 */
e.f.c.l.e.m.v0 .m ( v2 );
v3 = this.a;
/* .line 9 */
e.f.c.l.e.m.j1 .a ( p1 );
/* .line 10 */
(( e.f.c.l.e.m.z1 ) v2 ).a ( v3, p1 ); // invoke-virtual {v2, v3, p1}, Le/f/c/l/e/m/z1;->a(Ljava/util/concurrent/Executor;Le/f/c/l/e/m/j1;)Le/f/a/b/h/g;
/* aput-object p1, v0, v1 */
/* .line 11 */
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
(( e.f.c.l.e.m.f0 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/f/c/l/e/m/f0;->a(Le/f/c/l/e/v/j/b;)Le/f/a/b/h/g;
} // .end method
