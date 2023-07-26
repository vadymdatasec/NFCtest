public class e.f.d.d0.g0.n extends e.f.d.d0.g0.p {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final e.f.d.a0 d;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Le/f/d/a0<", */
	 /* "*>;" */
	 /* } */
} // .end annotation
} // .end field
public final e.f.d.q e; //synthetic
public final e.f.d.e0.a f; //synthetic
public final java.lang.reflect.Field g; //synthetic
public final Boolean h; //synthetic
/* # direct methods */
public e.f.d.d0.g0.n ( ) {
/* .locals 0 */
/* .line 1 */
this.e = p5;
this.f = p6;
this.g = p7;
/* iput-boolean p8, p0, Le/f/d/d0/g0/n;->h:Z */
/* invoke-direct {p0, p2, p3, p4}, Le/f/d/d0/g0/p;-><init>(Ljava/lang/String;ZZ)V */
/* .line 2 */
p1 = this.e;
p2 = this.f;
(( e.f.d.q ) p1 ).a ( p2 ); // invoke-virtual {p1, p2}, Le/f/d/q;->a(Le/f/d/e0/a;)Le/f/d/a0;
this.d = p1;
return;
} // .end method
/* # virtual methods */
public void a ( Object p0, java.lang.Object p1 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Ljava/lang/IllegalAccessException; */
/* } */
} // .end annotation
/* .line 4 */
v0 = this.d;
(( e.f.d.a0 ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Le/f/d/a0;->a(Le/f/d/f0/c;)Ljava/lang/Object;
/* if-nez p1, :cond_0 */
/* .line 5 */
/* iget-boolean v0, p0, Le/f/d/d0/g0/n;->h:Z */
/* if-nez v0, :cond_1 */
/* .line 6 */
} // :cond_0
v0 = this.g;
(( java.lang.reflect.Field ) v0 ).set ( p2, p1 ); // invoke-virtual {v0, p2, p1}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
} // :cond_1
return;
} // .end method
public void a ( Object p0, java.lang.Object p1 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Ljava/lang/IllegalAccessException; */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.g;
(( java.lang.reflect.Field ) v0 ).get ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* .line 2 */
/* new-instance v0, Le/f/d/d0/g0/v; */
v1 = this.e;
v2 = this.d;
v3 = this.f;
(( e.f.d.e0.a ) v3 ).b ( ); // invoke-virtual {v3}, Le/f/d/e0/a;->b()Ljava/lang/reflect/Type;
/* invoke-direct {v0, v1, v2, v3}, Le/f/d/d0/g0/v;-><init>(Le/f/d/q;Le/f/d/a0;Ljava/lang/reflect/Type;)V */
/* .line 3 */
(( e.f.d.d0.g0.v ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Le/f/d/d0/g0/v;->a(Le/f/d/f0/g;Ljava/lang/Object;)V
return;
} // .end method
