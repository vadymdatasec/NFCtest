public class c.n.x {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final java.util.HashMap a;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/HashMap<", */
	 /* "Ljava/lang/String;", */
	 /* "Lc/n/v;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
/* # direct methods */
public c.n.x ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
this.a = v0;
return;
} // .end method
/* # virtual methods */
public final c.n.v a ( java.lang.String p0 ) {
/* .locals 1 */
/* .line 3 */
v0 = this.a;
(( java.util.HashMap ) v0 ).get ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast p1, Lc/n/v; */
} // .end method
public final void a ( ) {
/* .locals 2 */
/* .line 4 */
v0 = this.a;
(( java.util.HashMap ) v0 ).values ( ); // invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_0
/* check-cast v1, Lc/n/v; */
/* .line 5 */
(( c.n.v ) v1 ).a ( ); // invoke-virtual {v1}, Lc/n/v;->a()V
/* .line 6 */
} // :cond_0
v0 = this.a;
(( java.util.HashMap ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/HashMap;->clear()V
return;
} // .end method
public final void a ( java.lang.String p0, Object p1 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
(( java.util.HashMap ) v0 ).put ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast p1, Lc/n/v; */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 2 */
(( c.n.v ) p1 ).b ( ); // invoke-virtual {p1}, Lc/n/v;->b()V
} // :cond_0
return;
} // .end method
public java.util.Set b ( ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/Set<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 1 */
/* new-instance v0, Ljava/util/HashSet; */
v1 = this.a;
(( java.util.HashMap ) v1 ).keySet ( ); // invoke-virtual {v1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;
/* invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V */
} // .end method
