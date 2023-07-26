public class e.f.c.l.e.q.b {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final k.o0 f;
	 /* # instance fields */
	 public final e.f.c.l.e.q.a a;
	 public final java.lang.String b;
	 public final java.util.Map c;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/Map<", */
	 /* "Ljava/lang/String;", */
	 /* "Ljava/lang/String;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
public final java.util.Map d;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Map<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public k.j0 e;
/* # direct methods */
public static e.f.c.l.e.q.b ( ) {
/* .locals 4 */
/* .line 1 */
/* new-instance v0, Lk/o0; */
/* invoke-direct {v0}, Lk/o0;-><init>()V */
/* .line 2 */
(( k.o0 ) v0 ).r ( ); // invoke-virtual {v0}, Lk/o0;->r()Lk/n0;
v1 = java.util.concurrent.TimeUnit.MILLISECONDS;
/* const-wide/16 v2, 0x2710 */
/* .line 3 */
(( k.n0 ) v0 ).a ( v2, v3, v1 ); // invoke-virtual {v0, v2, v3, v1}, Lk/n0;->a(JLjava/util/concurrent/TimeUnit;)Lk/n0;
/* .line 4 */
(( k.n0 ) v0 ).a ( ); // invoke-virtual {v0}, Lk/n0;->a()Lk/o0;
return;
} // .end method
public e.f.c.l.e.q.b ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/f/c/l/e/q/a;", */
/* "Ljava/lang/String;", */
/* "Ljava/util/Map<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
this.e = v0;
/* .line 3 */
this.a = p1;
/* .line 4 */
this.b = p2;
/* .line 5 */
this.c = p3;
/* .line 6 */
/* new-instance p1, Ljava/util/HashMap; */
/* invoke-direct {p1}, Ljava/util/HashMap;-><init>()V */
this.d = p1;
return;
} // .end method
/* # virtual methods */
public e.f.c.l.e.q.b a ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.d;
} // .end method
public e.f.c.l.e.q.b a ( java.lang.String p0, java.lang.String p1, java.lang.String p2, java.io.File p3 ) {
/* .locals 0 */
/* .line 3 */
k.i0 .b ( p3 );
/* .line 4 */
k.x0 .a ( p3,p4 );
/* .line 5 */
(( e.f.c.l.e.q.b ) p0 ).c ( ); // invoke-virtual {p0}, Le/f/c/l/e/q/b;->c()Lk/j0;
(( k.j0 ) p4 ).a ( p1, p2, p3 ); // invoke-virtual {p4, p1, p2, p3}, Lk/j0;->a(Ljava/lang/String;Ljava/lang/String;Lk/x0;)Lk/j0;
this.e = p4;
} // .end method
public e.f.c.l.e.q.b a ( java.util.Map$Entry p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/Map$Entry<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;)", */
/* "Le/f/c/l/e/q/b;" */
/* } */
} // .end annotation
/* .line 2 */
/* check-cast v0, Ljava/lang/String; */
/* check-cast p1, Ljava/lang/String; */
(( e.f.c.l.e.q.b ) p0 ).a ( v0, p1 ); // invoke-virtual {p0, v0, p1}, Le/f/c/l/e/q/b;->a(Ljava/lang/String;Ljava/lang/String;)Le/f/c/l/e/q/b;
} // .end method
public final k.u0 a ( ) {
/* .locals 5 */
/* .line 6 */
/* new-instance v0, Lk/t0; */
/* invoke-direct {v0}, Lk/t0;-><init>()V */
/* new-instance v1, Lk/e; */
/* invoke-direct {v1}, Lk/e;-><init>()V */
/* .line 7 */
(( k.e ) v1 ).b ( ); // invoke-virtual {v1}, Lk/e;->b()Lk/e;
(( k.e ) v1 ).a ( ); // invoke-virtual {v1}, Lk/e;->a()Lk/f;
(( k.t0 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lk/t0;->a(Lk/f;)Lk/t0;
/* .line 8 */
v1 = this.b;
k.f0 .e ( v1 );
(( k.f0 ) v1 ).i ( ); // invoke-virtual {v1}, Lk/f0;->i()Lk/e0;
/* .line 9 */
v2 = this.c;
v3 = } // :goto_0
if ( v3 != null) { // if-eqz v3, :cond_0
/* check-cast v3, Ljava/util/Map$Entry; */
/* .line 10 */
/* check-cast v4, Ljava/lang/String; */
/* check-cast v3, Ljava/lang/String; */
(( k.e0 ) v1 ).a ( v4, v3 ); // invoke-virtual {v1, v4, v3}, Lk/e0;->a(Ljava/lang/String;Ljava/lang/String;)Lk/e0;
/* .line 11 */
} // :cond_0
(( k.e0 ) v1 ).a ( ); // invoke-virtual {v1}, Lk/e0;->a()Lk/f0;
(( k.t0 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lk/t0;->a(Lk/f0;)Lk/t0;
/* .line 12 */
v1 = this.d;
v2 = } // :goto_1
if ( v2 != null) { // if-eqz v2, :cond_1
/* check-cast v2, Ljava/util/Map$Entry; */
/* .line 13 */
/* check-cast v3, Ljava/lang/String; */
/* check-cast v2, Ljava/lang/String; */
(( k.t0 ) v0 ).a ( v3, v2 ); // invoke-virtual {v0, v3, v2}, Lk/t0;->a(Ljava/lang/String;Ljava/lang/String;)Lk/t0;
/* .line 14 */
} // :cond_1
v1 = this.e;
/* if-nez v1, :cond_2 */
int v1 = 0; // const/4 v1, 0x0
} // :cond_2
(( k.j0 ) v1 ).a ( ); // invoke-virtual {v1}, Lk/j0;->a()Lk/l0;
/* .line 15 */
} // :goto_2
v2 = this.a;
(( java.lang.Enum ) v2 ).name ( ); // invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;
(( k.t0 ) v0 ).a ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Lk/t0;->a(Ljava/lang/String;Lk/x0;)Lk/t0;
/* .line 16 */
(( k.t0 ) v0 ).a ( ); // invoke-virtual {v0}, Lk/t0;->a()Lk/u0;
} // .end method
public e.f.c.l.e.q.b b ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 1 */
/* .line 1 */
(( e.f.c.l.e.q.b ) p0 ).c ( ); // invoke-virtual {p0}, Le/f/c/l/e/q/b;->c()Lk/j0;
(( k.j0 ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lk/j0;->a(Ljava/lang/String;Ljava/lang/String;)Lk/j0;
this.e = v0;
} // .end method
public e.f.c.l.e.q.d b ( ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 2 */
(( e.f.c.l.e.q.b ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/c/l/e/q/b;->a()Lk/u0;
/* .line 3 */
v1 = e.f.c.l.e.q.b.f;
(( k.o0 ) v1 ).a ( v0 ); // invoke-virtual {v1, v0}, Lk/o0;->a(Lk/u0;)Lk/g;
/* .line 4 */
e.f.c.l.e.q.d .a ( v0 );
} // .end method
public final k.j0 c ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.e;
/* if-nez v0, :cond_0 */
/* .line 2 */
/* new-instance v0, Lk/j0; */
/* invoke-direct {v0}, Lk/j0;-><init>()V */
v1 = k.l0.f;
(( k.j0 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lk/j0;->a(Lk/i0;)Lk/j0;
this.e = v0;
/* .line 3 */
} // :cond_0
v0 = this.e;
} // .end method
public java.lang.String d ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
(( java.lang.Enum ) v0 ).name ( ); // invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;
} // .end method
