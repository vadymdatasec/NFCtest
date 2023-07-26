public abstract class m.b.j.j3 {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public m.b.j.a a;
	 public m.b.j.s0 b;
	 public m.b.i.i c;
	 public java.util.ArrayList d;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/ArrayList<", */
	 /* "Lm/b/i/l;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
public java.lang.String e;
public m.b.j.q0 f;
public m.b.j.d0 g;
public m.b.j.e0 h;
public m.b.j.n0 i;
public m.b.j.m0 j;
/* # direct methods */
public m.b.j.j3 ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
/* new-instance v0, Lm/b/j/n0; */
/* invoke-direct {v0}, Lm/b/j/n0;-><init>()V */
this.i = v0;
/* .line 3 */
/* new-instance v0, Lm/b/j/m0; */
/* invoke-direct {v0}, Lm/b/j/m0;-><init>()V */
this.j = v0;
return;
} // .end method
/* # virtual methods */
public m.b.i.l a ( ) {
/* .locals 2 */
/* .line 18 */
v0 = this.d;
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
/* if-lez v0, :cond_0 */
/* .line 19 */
v1 = this.d;
/* add-int/lit8 v0, v0, -0x1 */
(( java.util.ArrayList ) v1 ).get ( v0 ); // invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Lm/b/i/l; */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public void a ( java.lang.String p0, java.lang.String p1, m.b.j.d0 p2, m.b.j.e0 p3 ) {
/* .locals 1 */
final String v0 = "String input must not be null"; // const-string v0, "String input must not be null"
/* .line 1 */
m.b.h.j .a ( p1,v0 );
final String v0 = "BaseURI must not be null"; // const-string v0, "BaseURI must not be null"
/* .line 2 */
m.b.h.j .a ( p2,v0 );
/* .line 3 */
/* new-instance v0, Lm/b/i/i; */
/* invoke-direct {v0, p2}, Lm/b/i/i;-><init>(Ljava/lang/String;)V */
this.c = v0;
/* .line 4 */
this.h = p4;
/* .line 5 */
/* new-instance p4, Lm/b/j/a; */
/* invoke-direct {p4, p1}, Lm/b/j/a;-><init>(Ljava/lang/String;)V */
this.a = p4;
/* .line 6 */
this.g = p3;
/* .line 7 */
/* new-instance p1, Lm/b/j/s0; */
p4 = this.a;
/* invoke-direct {p1, p4, p3}, Lm/b/j/s0;-><init>(Lm/b/j/a;Lm/b/j/d0;)V */
this.b = p1;
/* .line 8 */
/* new-instance p1, Ljava/util/ArrayList; */
/* const/16 p3, 0x20 */
/* invoke-direct {p1, p3}, Ljava/util/ArrayList;-><init>(I)V */
this.d = p1;
/* .line 9 */
this.e = p2;
return;
} // .end method
public Boolean a ( java.lang.String p0 ) {
/* .locals 2 */
/* .line 15 */
v0 = this.f;
v1 = this.j;
/* if-ne v0, v1, :cond_0 */
/* .line 16 */
/* new-instance v0, Lm/b/j/m0; */
/* invoke-direct {v0}, Lm/b/j/m0;-><init>()V */
(( m.b.j.o0 ) v0 ).d ( p1 ); // invoke-virtual {v0, p1}, Lm/b/j/o0;->d(Ljava/lang/String;)Lm/b/j/o0;
p1 = (( m.b.j.j3 ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lm/b/j/j3;->a(Lm/b/j/q0;)Z
/* .line 17 */
} // :cond_0
(( m.b.j.o0 ) v1 ).l ( ); // invoke-virtual {v1}, Lm/b/j/o0;->l()Lm/b/j/o0;
(( m.b.j.o0 ) v1 ).d ( p1 ); // invoke-virtual {v1, p1}, Lm/b/j/o0;->d(Ljava/lang/String;)Lm/b/j/o0;
p1 = (( m.b.j.j3 ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Lm/b/j/j3;->a(Lm/b/j/q0;)Z
} // .end method
public Boolean a ( java.lang.String p0, Object p1 ) {
/* .locals 2 */
/* .line 10 */
v0 = this.f;
v1 = this.i;
/* if-ne v0, v1, :cond_0 */
/* .line 11 */
/* new-instance v0, Lm/b/j/n0; */
/* invoke-direct {v0}, Lm/b/j/n0;-><init>()V */
(( m.b.j.n0 ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lm/b/j/n0;->a(Ljava/lang/String;Lm/b/i/b;)Lm/b/j/n0;
p1 = (( m.b.j.j3 ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lm/b/j/j3;->a(Lm/b/j/q0;)Z
/* .line 12 */
} // :cond_0
(( m.b.j.n0 ) v1 ).l ( ); // invoke-virtual {v1}, Lm/b/j/n0;->l()Lm/b/j/o0;
/* .line 13 */
v0 = this.i;
(( m.b.j.n0 ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lm/b/j/n0;->a(Ljava/lang/String;Lm/b/i/b;)Lm/b/j/n0;
/* .line 14 */
p1 = this.i;
p1 = (( m.b.j.j3 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lm/b/j/j3;->a(Lm/b/j/q0;)Z
} // .end method
public abstract Boolean a ( m.b.j.q0 p0 ) {
} // .end method
public m.b.i.i b ( java.lang.String p0, java.lang.String p1, m.b.j.d0 p2, m.b.j.e0 p3 ) {
/* .locals 0 */
/* .line 1 */
(( m.b.j.j3 ) p0 ).a ( p1, p2, p3, p4 ); // invoke-virtual {p0, p1, p2, p3, p4}, Lm/b/j/j3;->a(Ljava/lang/String;Ljava/lang/String;Lm/b/j/d0;Lm/b/j/e0;)V
/* .line 2 */
(( m.b.j.j3 ) p0 ).c ( ); // invoke-virtual {p0}, Lm/b/j/j3;->c()V
/* .line 3 */
p1 = this.c;
} // .end method
public abstract m.b.j.e0 b ( ) {
} // .end method
public Boolean b ( java.lang.String p0 ) {
/* .locals 2 */
/* .line 4 */
v0 = this.f;
v1 = this.i;
/* if-ne v0, v1, :cond_0 */
/* .line 5 */
/* new-instance v0, Lm/b/j/n0; */
/* invoke-direct {v0}, Lm/b/j/n0;-><init>()V */
(( m.b.j.o0 ) v0 ).d ( p1 ); // invoke-virtual {v0, p1}, Lm/b/j/o0;->d(Ljava/lang/String;)Lm/b/j/o0;
p1 = (( m.b.j.j3 ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lm/b/j/j3;->a(Lm/b/j/q0;)Z
/* .line 6 */
} // :cond_0
(( m.b.j.n0 ) v1 ).l ( ); // invoke-virtual {v1}, Lm/b/j/n0;->l()Lm/b/j/o0;
(( m.b.j.o0 ) v1 ).d ( p1 ); // invoke-virtual {v1, p1}, Lm/b/j/o0;->d(Ljava/lang/String;)Lm/b/j/o0;
p1 = (( m.b.j.j3 ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Lm/b/j/j3;->a(Lm/b/j/q0;)Z
} // .end method
public void c ( ) {
/* .locals 2 */
/* .line 1 */
} // :cond_0
v0 = this.b;
(( m.b.j.s0 ) v0 ).j ( ); // invoke-virtual {v0}, Lm/b/j/s0;->j()Lm/b/j/q0;
/* .line 2 */
(( m.b.j.j3 ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lm/b/j/j3;->a(Lm/b/j/q0;)Z
/* .line 3 */
(( m.b.j.q0 ) v0 ).l ( ); // invoke-virtual {v0}, Lm/b/j/q0;->l()Lm/b/j/q0;
/* .line 4 */
v0 = this.a;
v1 = m.b.j.p0.g;
/* if-ne v0, v1, :cond_0 */
return;
} // .end method
