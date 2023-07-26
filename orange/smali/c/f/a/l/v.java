public abstract class c.f.a.l.v extends c.f.a.l.i {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public java.util.ArrayList k0;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/ArrayList<", */
	 /* "Lc/f/a/l/i;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
/* # direct methods */
public c.f.a.l.v ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Lc/f/a/l/i;-><init>()V */
/* .line 2 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.k0 = v0;
return;
} // .end method
/* # virtual methods */
public void E ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.k0;
(( java.util.ArrayList ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
/* .line 2 */
/* invoke-super {p0}, Lc/f/a/l/i;->E()V */
return;
} // .end method
public void I ( ) {
/* .locals 5 */
/* .line 1 */
/* invoke-super {p0}, Lc/f/a/l/i;->I()V */
/* .line 2 */
v0 = this.k0;
/* if-nez v0, :cond_0 */
return;
/* .line 3 */
} // :cond_0
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-ge v1, v0, :cond_2 */
/* .line 4 */
v2 = this.k0;
(( java.util.ArrayList ) v2 ).get ( v1 ); // invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Lc/f/a/l/i; */
/* .line 5 */
v3 = (( c.f.a.l.i ) p0 ).h ( ); // invoke-virtual {p0}, Lc/f/a/l/i;->h()I
v4 = (( c.f.a.l.i ) p0 ).i ( ); // invoke-virtual {p0}, Lc/f/a/l/i;->i()I
(( c.f.a.l.i ) v2 ).b ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Lc/f/a/l/i;->b(II)V
/* .line 6 */
/* instance-of v3, v2, Lc/f/a/l/j; */
/* if-nez v3, :cond_1 */
/* .line 7 */
(( c.f.a.l.i ) v2 ).I ( ); // invoke-virtual {v2}, Lc/f/a/l/i;->I()V
} // :cond_1
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_2
return;
} // .end method
public c.f.a.l.j K ( ) {
/* .locals 4 */
/* .line 1 */
(( c.f.a.l.i ) p0 ).l ( ); // invoke-virtual {p0}, Lc/f/a/l/i;->l()Lc/f/a/l/i;
/* .line 2 */
/* instance-of v1, p0, Lc/f/a/l/j; */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 3 */
/* move-object v1, p0 */
/* check-cast v1, Lc/f/a/l/j; */
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 4 */
(( c.f.a.l.i ) v0 ).l ( ); // invoke-virtual {v0}, Lc/f/a/l/i;->l()Lc/f/a/l/i;
/* .line 5 */
/* instance-of v3, v0, Lc/f/a/l/j; */
if ( v3 != null) { // if-eqz v3, :cond_1
/* .line 6 */
/* move-object v1, v0 */
/* check-cast v1, Lc/f/a/l/j; */
} // :cond_1
/* move-object v0, v2 */
} // :cond_2
} // .end method
public abstract void L ( ) {
} // .end method
public void M ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.k0;
(( java.util.ArrayList ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
return;
} // .end method
public void a ( Object p0 ) {
/* .locals 3 */
/* .line 1 */
/* invoke-super {p0, p1}, Lc/f/a/l/i;->a(Lc/f/a/c;)V */
/* .line 2 */
v0 = this.k0;
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-ge v1, v0, :cond_0 */
/* .line 3 */
v2 = this.k0;
(( java.util.ArrayList ) v2 ).get ( v1 ); // invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Lc/f/a/l/i; */
/* .line 4 */
(( c.f.a.l.i ) v2 ).a ( p1 ); // invoke-virtual {v2, p1}, Lc/f/a/l/i;->a(Lc/f/a/c;)V
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_0
return;
} // .end method
public void b ( Integer p0, Integer p1 ) {
/* .locals 3 */
/* .line 6 */
/* invoke-super {p0, p1, p2}, Lc/f/a/l/i;->b(II)V */
/* .line 7 */
p1 = this.k0;
p1 = (( java.util.ArrayList ) p1 ).size ( ); // invoke-virtual {p1}, Ljava/util/ArrayList;->size()I
int p2 = 0; // const/4 p2, 0x0
} // :goto_0
/* if-ge p2, p1, :cond_0 */
/* .line 8 */
v0 = this.k0;
(( java.util.ArrayList ) v0 ).get ( p2 ); // invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Lc/f/a/l/i; */
/* .line 9 */
v1 = (( c.f.a.l.i ) p0 ).p ( ); // invoke-virtual {p0}, Lc/f/a/l/i;->p()I
v2 = (( c.f.a.l.i ) p0 ).q ( ); // invoke-virtual {p0}, Lc/f/a/l/i;->q()I
(( c.f.a.l.i ) v0 ).b ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lc/f/a/l/i;->b(II)V
/* add-int/lit8 p2, p2, 0x1 */
} // :cond_0
return;
} // .end method
public void b ( Object p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.k0;
(( java.util.ArrayList ) v0 ).add ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 2 */
(( c.f.a.l.i ) p1 ).l ( ); // invoke-virtual {p1}, Lc/f/a/l/i;->l()Lc/f/a/l/i;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 3 */
(( c.f.a.l.i ) p1 ).l ( ); // invoke-virtual {p1}, Lc/f/a/l/i;->l()Lc/f/a/l/i;
/* check-cast v0, Lc/f/a/l/v; */
/* .line 4 */
(( c.f.a.l.v ) v0 ).c ( p1 ); // invoke-virtual {v0, p1}, Lc/f/a/l/v;->c(Lc/f/a/l/i;)V
/* .line 5 */
} // :cond_0
(( c.f.a.l.i ) p1 ).a ( p0 ); // invoke-virtual {p1, p0}, Lc/f/a/l/i;->a(Lc/f/a/l/i;)V
return;
} // .end method
public void c ( Object p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.k0;
(( java.util.ArrayList ) v0 ).remove ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
(( c.f.a.l.i ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Lc/f/a/l/i;->a(Lc/f/a/l/i;)V
return;
} // .end method
