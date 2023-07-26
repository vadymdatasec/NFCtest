public class c.c.a.b.a extends c.c.a.b.e {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "<K:", */
	 /* "Ljava/lang/Object;", */
	 /* "V:", */
	 /* "Ljava/lang/Object;", */
	 /* ">", */
	 /* "Lc/c/a/b/e<", */
	 /* "TK;TV;>;" */
	 /* } */
} // .end annotation
/* # instance fields */
public java.util.HashMap f;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/HashMap<", */
/* "TK;", */
/* "Lc/c/a/b/d<", */
/* "TK;TV;>;>;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public c.c.a.b.a ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Lc/c/a/b/e;-><init>()V */
/* .line 2 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
this.f = v0;
return;
} // .end method
/* # virtual methods */
public c.c.a.b.d a ( java.lang.Object p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TK;)", */
/* "Lc/c/a/b/d<", */
/* "TK;TV;>;" */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.f;
(( java.util.HashMap ) v0 ).get ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast p1, Lc/c/a/b/d; */
} // .end method
public java.lang.Object b ( java.lang.Object p0, java.lang.Object p1 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TK;TV;)TV;" */
/* } */
} // .end annotation
/* .line 1 */
(( c.c.a.b.a ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/c/a/b/a;->a(Ljava/lang/Object;)Lc/c/a/b/d;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
p1 = this.c;
/* .line 3 */
} // :cond_0
v0 = this.f;
(( c.c.a.b.e ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lc/c/a/b/e;->a(Ljava/lang/Object;Ljava/lang/Object;)Lc/c/a/b/d;
(( java.util.HashMap ) v0 ).put ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
int p1 = 0; // const/4 p1, 0x0
} // .end method
public java.util.Map$Entry b ( java.lang.Object p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TK;)", */
/* "Ljava/util/Map$Entry<", */
/* "TK;TV;>;" */
/* } */
} // .end annotation
/* .line 4 */
v0 = (( c.c.a.b.a ) p0 ).contains ( p1 ); // invoke-virtual {p0, p1}, Lc/c/a/b/a;->contains(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 5 */
v0 = this.f;
(( java.util.HashMap ) v0 ).get ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast p1, Lc/c/a/b/d; */
p1 = this.e;
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // .end method
public Boolean contains ( java.lang.Object p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TK;)Z" */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.f;
p1 = (( java.util.HashMap ) v0 ).containsKey ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z
} // .end method
public java.lang.Object remove ( java.lang.Object p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TK;)TV;" */
/* } */
} // .end annotation
/* .line 1 */
/* invoke-super {p0, p1}, Lc/c/a/b/e;->remove(Ljava/lang/Object;)Ljava/lang/Object; */
/* .line 2 */
v1 = this.f;
(( java.util.HashMap ) v1 ).remove ( p1 ); // invoke-virtual {v1, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
} // .end method
