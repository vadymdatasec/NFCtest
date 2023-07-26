public class c.f.a.l.u {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public Integer a;
	 public Integer b;
	 public Integer c;
	 public Integer d;
	 public java.util.ArrayList e;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/ArrayList<", */
	 /* "Lc/f/a/l/t;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
/* # direct methods */
public c.f.a.l.u ( ) {
/* .locals 5 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.e = v0;
/* .line 3 */
v0 = (( c.f.a.l.i ) p1 ).w ( ); // invoke-virtual {p1}, Lc/f/a/l/i;->w()I
/* iput v0, p0, Lc/f/a/l/u;->a:I */
/* .line 4 */
v0 = (( c.f.a.l.i ) p1 ).x ( ); // invoke-virtual {p1}, Lc/f/a/l/i;->x()I
/* iput v0, p0, Lc/f/a/l/u;->b:I */
/* .line 5 */
v0 = (( c.f.a.l.i ) p1 ).t ( ); // invoke-virtual {p1}, Lc/f/a/l/i;->t()I
/* iput v0, p0, Lc/f/a/l/u;->c:I */
/* .line 6 */
v0 = (( c.f.a.l.i ) p1 ).j ( ); // invoke-virtual {p1}, Lc/f/a/l/i;->j()I
/* iput v0, p0, Lc/f/a/l/u;->d:I */
/* .line 7 */
(( c.f.a.l.i ) p1 ).c ( ); // invoke-virtual {p1}, Lc/f/a/l/i;->c()Ljava/util/ArrayList;
/* .line 8 */
v0 = (( java.util.ArrayList ) p1 ).size ( ); // invoke-virtual {p1}, Ljava/util/ArrayList;->size()I
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-ge v1, v0, :cond_0 */
/* .line 9 */
(( java.util.ArrayList ) p1 ).get ( v1 ); // invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Lc/f/a/l/g; */
/* .line 10 */
v3 = this.e;
/* new-instance v4, Lc/f/a/l/t; */
/* invoke-direct {v4, v2}, Lc/f/a/l/t;-><init>(Lc/f/a/l/g;)V */
(( java.util.ArrayList ) v3 ).add ( v4 ); // invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_0
return;
} // .end method
/* # virtual methods */
public void a ( Object p0 ) {
/* .locals 3 */
/* .line 1 */
/* iget v0, p0, Lc/f/a/l/u;->a:I */
(( c.f.a.l.i ) p1 ).s ( v0 ); // invoke-virtual {p1, v0}, Lc/f/a/l/i;->s(I)V
/* .line 2 */
/* iget v0, p0, Lc/f/a/l/u;->b:I */
(( c.f.a.l.i ) p1 ).t ( v0 ); // invoke-virtual {p1, v0}, Lc/f/a/l/i;->t(I)V
/* .line 3 */
/* iget v0, p0, Lc/f/a/l/u;->c:I */
(( c.f.a.l.i ) p1 ).p ( v0 ); // invoke-virtual {p1, v0}, Lc/f/a/l/i;->p(I)V
/* .line 4 */
/* iget v0, p0, Lc/f/a/l/u;->d:I */
(( c.f.a.l.i ) p1 ).h ( v0 ); // invoke-virtual {p1, v0}, Lc/f/a/l/i;->h(I)V
/* .line 5 */
v0 = this.e;
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-ge v1, v0, :cond_0 */
/* .line 6 */
v2 = this.e;
(( java.util.ArrayList ) v2 ).get ( v1 ); // invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Lc/f/a/l/t; */
/* .line 7 */
(( c.f.a.l.t ) v2 ).a ( p1 ); // invoke-virtual {v2, p1}, Lc/f/a/l/t;->a(Lc/f/a/l/i;)V
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_0
return;
} // .end method
public void b ( Object p0 ) {
/* .locals 3 */
/* .line 1 */
v0 = (( c.f.a.l.i ) p1 ).w ( ); // invoke-virtual {p1}, Lc/f/a/l/i;->w()I
/* iput v0, p0, Lc/f/a/l/u;->a:I */
/* .line 2 */
v0 = (( c.f.a.l.i ) p1 ).x ( ); // invoke-virtual {p1}, Lc/f/a/l/i;->x()I
/* iput v0, p0, Lc/f/a/l/u;->b:I */
/* .line 3 */
v0 = (( c.f.a.l.i ) p1 ).t ( ); // invoke-virtual {p1}, Lc/f/a/l/i;->t()I
/* iput v0, p0, Lc/f/a/l/u;->c:I */
/* .line 4 */
v0 = (( c.f.a.l.i ) p1 ).j ( ); // invoke-virtual {p1}, Lc/f/a/l/i;->j()I
/* iput v0, p0, Lc/f/a/l/u;->d:I */
/* .line 5 */
v0 = this.e;
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-ge v1, v0, :cond_0 */
/* .line 6 */
v2 = this.e;
(( java.util.ArrayList ) v2 ).get ( v1 ); // invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Lc/f/a/l/t; */
/* .line 7 */
(( c.f.a.l.t ) v2 ).b ( p1 ); // invoke-virtual {v2, p1}, Lc/f/a/l/t;->b(Lc/f/a/l/i;)V
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_0
return;
} // .end method
