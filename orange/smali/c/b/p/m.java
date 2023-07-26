public class c.b.p.m {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final java.util.ArrayList a;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/ArrayList<", */
	 /* "Lc/h/n/c1;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
public Long b;
public android.view.animation.Interpolator c;
public c.h.n.d1 d;
public Boolean e;
public final c.h.n.e1 f;
/* # direct methods */
public c.b.p.m ( ) {
/* .locals 2 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* const-wide/16 v0, -0x1 */
/* .line 2 */
/* iput-wide v0, p0, Lc/b/p/m;->b:J */
/* .line 3 */
/* new-instance v0, Lc/b/p/l; */
/* invoke-direct {v0, p0}, Lc/b/p/l;-><init>(Lc/b/p/m;)V */
this.f = v0;
/* .line 4 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.a = v0;
return;
} // .end method
/* # virtual methods */
public c.b.p.m a ( Long p0 ) {
/* .locals 1 */
/* .line 10 */
/* iget-boolean v0, p0, Lc/b/p/m;->e:Z */
/* if-nez v0, :cond_0 */
/* .line 11 */
/* iput-wide p1, p0, Lc/b/p/m;->b:J */
} // :cond_0
} // .end method
public c.b.p.m a ( android.view.animation.Interpolator p0 ) {
/* .locals 1 */
/* .line 12 */
/* iget-boolean v0, p0, Lc/b/p/m;->e:Z */
/* if-nez v0, :cond_0 */
/* .line 13 */
this.c = p1;
} // :cond_0
} // .end method
public c.b.p.m a ( c.h.n.c1 p0 ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Lc/b/p/m;->e:Z */
/* if-nez v0, :cond_0 */
/* .line 2 */
v0 = this.a;
(( java.util.ArrayList ) v0 ).add ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
} // :cond_0
} // .end method
public c.b.p.m a ( c.h.n.c1 p0, c.h.n.c1 p1 ) {
/* .locals 2 */
/* .line 3 */
v0 = this.a;
(( java.util.ArrayList ) v0 ).add ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 4 */
(( c.h.n.c1 ) p1 ).b ( ); // invoke-virtual {p1}, Lc/h/n/c1;->b()J
/* move-result-wide v0 */
(( c.h.n.c1 ) p2 ).b ( v0, v1 ); // invoke-virtual {p2, v0, v1}, Lc/h/n/c1;->b(J)Lc/h/n/c1;
/* .line 5 */
p1 = this.a;
(( java.util.ArrayList ) p1 ).add ( p2 ); // invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
} // .end method
public c.b.p.m a ( c.h.n.d1 p0 ) {
/* .locals 1 */
/* .line 14 */
/* iget-boolean v0, p0, Lc/b/p/m;->e:Z */
/* if-nez v0, :cond_0 */
/* .line 15 */
this.d = p1;
} // :cond_0
} // .end method
public void a ( ) {
/* .locals 2 */
/* .line 6 */
/* iget-boolean v0, p0, Lc/b/p/m;->e:Z */
/* if-nez v0, :cond_0 */
return;
/* .line 7 */
} // :cond_0
v0 = this.a;
(( java.util.ArrayList ) v0 ).iterator ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_1
/* check-cast v1, Lc/h/n/c1; */
/* .line 8 */
(( c.h.n.c1 ) v1 ).a ( ); // invoke-virtual {v1}, Lc/h/n/c1;->a()V
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
/* .line 9 */
/* iput-boolean v0, p0, Lc/b/p/m;->e:Z */
return;
} // .end method
public void b ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
/* iput-boolean v0, p0, Lc/b/p/m;->e:Z */
return;
} // .end method
public void c ( ) {
/* .locals 7 */
/* .line 1 */
/* iget-boolean v0, p0, Lc/b/p/m;->e:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
return;
/* .line 2 */
} // :cond_0
v0 = this.a;
(( java.util.ArrayList ) v0 ).iterator ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_4
/* check-cast v1, Lc/h/n/c1; */
/* .line 3 */
/* iget-wide v2, p0, Lc/b/p/m;->b:J */
/* const-wide/16 v4, 0x0 */
/* cmp-long v6, v2, v4 */
/* if-ltz v6, :cond_1 */
/* .line 4 */
(( c.h.n.c1 ) v1 ).a ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lc/h/n/c1;->a(J)Lc/h/n/c1;
/* .line 5 */
} // :cond_1
v2 = this.c;
if ( v2 != null) { // if-eqz v2, :cond_2
/* .line 6 */
(( c.h.n.c1 ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Lc/h/n/c1;->a(Landroid/view/animation/Interpolator;)Lc/h/n/c1;
/* .line 7 */
} // :cond_2
v2 = this.d;
if ( v2 != null) { // if-eqz v2, :cond_3
/* .line 8 */
v2 = this.f;
(( c.h.n.c1 ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Lc/h/n/c1;->a(Lc/h/n/d1;)Lc/h/n/c1;
/* .line 9 */
} // :cond_3
(( c.h.n.c1 ) v1 ).c ( ); // invoke-virtual {v1}, Lc/h/n/c1;->c()V
} // :cond_4
int v0 = 1; // const/4 v0, 0x1
/* .line 10 */
/* iput-boolean v0, p0, Lc/b/p/m;->e:Z */
return;
} // .end method
