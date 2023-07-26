public class e.f.c.l.e.g implements e.f.a.b.h.f {
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
public final java.lang.String a; //synthetic
public final e.f.c.l.e.v.e b; //synthetic
public final java.util.concurrent.Executor c; //synthetic
public final e.f.c.l.e.j d; //synthetic
/* # direct methods */
public e.f.c.l.e.g ( ) {
	 /* .locals 0 */
	 /* .line 1 */
	 this.d = p1;
	 this.a = p2;
	 this.b = p3;
	 this.c = p4;
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 return;
} // .end method
/* # virtual methods */
public e.f.a.b.h.g a ( Object p0 ) {
	 /* .locals 6 */
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
/* .line 2 */
try { // :try_start_0
v0 = this.d;
v2 = this.a;
v3 = this.b;
v4 = this.c;
int v5 = 1; // const/4 v5, 0x1
/* move-object v1, p1 */
/* invoke-static/range {v0 ..v5}, Le/f/c/l/e/j;->a(Le/f/c/l/e/j;Le/f/c/l/e/v/j/b;Ljava/lang/String;Le/f/c/l/e/v/e;Ljava/util/concurrent/Executor;Z)V */
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
int p1 = 0; // const/4 p1, 0x0
/* :catch_0 */
/* move-exception p1 */
/* .line 3 */
e.f.c.l.e.b .a ( );
final String v1 = "Error performing auto configuration."; // const-string v1, "Error performing auto configuration."
(( e.f.c.l.e.b ) v0 ).b ( v1, p1 ); // invoke-virtual {v0, v1, p1}, Le/f/c/l/e/b;->b(Ljava/lang/String;Ljava/lang/Throwable;)V
/* .line 4 */
/* throw p1 */
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
(( e.f.c.l.e.g ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/f/c/l/e/g;->a(Le/f/c/l/e/v/j/b;)Le/f/a/b/h/g;
} // .end method
