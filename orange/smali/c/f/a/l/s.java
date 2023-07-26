public abstract class c.f.a.l.s {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public java.util.HashSet a;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/HashSet<", */
	 /* "Lc/f/a/l/s;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
public Integer b;
/* # direct methods */
public c.f.a.l.s ( ) {
/* .locals 2 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
/* new-instance v0, Ljava/util/HashSet; */
int v1 = 2; // const/4 v1, 0x2
/* invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(I)V */
this.a = v0;
int v0 = 0; // const/4 v0, 0x0
/* .line 3 */
/* iput v0, p0, Lc/f/a/l/s;->b:I */
return;
} // .end method
/* # virtual methods */
public void a ( ) {
/* .locals 2 */
int v0 = 1; // const/4 v0, 0x1
/* .line 2 */
/* iput v0, p0, Lc/f/a/l/s;->b:I */
/* .line 3 */
v0 = this.a;
(( java.util.HashSet ) v0 ).iterator ( ); // invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_0
/* check-cast v1, Lc/f/a/l/s; */
/* .line 4 */
(( c.f.a.l.s ) v1 ).e ( ); // invoke-virtual {v1}, Lc/f/a/l/s;->e()V
} // :cond_0
return;
} // .end method
public void a ( Object p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
(( java.util.HashSet ) v0 ).add ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
return;
} // .end method
public void b ( ) {
/* .locals 2 */
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
/* iput v0, p0, Lc/f/a/l/s;->b:I */
/* .line 2 */
v0 = this.a;
(( java.util.HashSet ) v0 ).iterator ( ); // invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_0
/* check-cast v1, Lc/f/a/l/s; */
/* .line 3 */
(( c.f.a.l.s ) v1 ).b ( ); // invoke-virtual {v1}, Lc/f/a/l/s;->b()V
} // :cond_0
return;
} // .end method
public Boolean c ( ) {
/* .locals 2 */
/* .line 1 */
/* iget v0, p0, Lc/f/a/l/s;->b:I */
int v1 = 1; // const/4 v1, 0x1
/* if-ne v0, v1, :cond_0 */
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
} // .end method
public void d ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 1 */
/* iput v0, p0, Lc/f/a/l/s;->b:I */
/* .line 2 */
v0 = this.a;
(( java.util.HashSet ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/HashSet;->clear()V
return;
} // .end method
public void e ( ) {
/* .locals 0 */
return;
} // .end method
