public class inal implements e.b.a.z.m implements c.n.i {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final java.util.Set a;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/Set<", */
	 /* "Le/b/a/z/n;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
public final c.n.g b;
/* # direct methods */
public inal ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
/* new-instance v0, Ljava/util/HashSet; */
/* invoke-direct {v0}, Ljava/util/HashSet;-><init>()V */
this.a = v0;
/* .line 3 */
this.b = p1;
/* .line 4 */
(( c.n.g ) p1 ).a ( p0 ); // invoke-virtual {p1, p0}, Lc/n/g;->a(Lc/n/i;)V
return;
} // .end method
/* # virtual methods */
public void a ( Object p0 ) {
/* .locals 2 */
/* .line 1 */
v0 = this.a;
/* .line 2 */
v0 = this.b;
(( c.n.g ) v0 ).a ( ); // invoke-virtual {v0}, Lc/n/g;->a()Lc/n/g$b;
v1 = c.n.g$b.b;
/* if-ne v0, v1, :cond_0 */
/* .line 3 */
/* .line 4 */
} // :cond_0
v0 = this.b;
(( c.n.g ) v0 ).a ( ); // invoke-virtual {v0}, Lc/n/g;->a()Lc/n/g$b;
v1 = c.n.g$b.e;
v0 = (( c.n.g$b ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lc/n/g$b;->a(Lc/n/g$b;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 5 */
/* .line 6 */
} // :cond_1
} // :goto_0
return;
} // .end method
public void b ( Object p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
return;
} // .end method
public void onDestroy ( Object p0 ) {
/* .locals 2 */
/* .annotation runtime Lc/n/r; */
/* value = .enum Lc/n/g$a;->ON_DESTROY:Lc/n/g$a; */
} // .end annotation
/* .line 1 */
v0 = this.a;
e.b.a.e0.t .a ( v0 );
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_0
/* check-cast v1, Le/b/a/z/n; */
/* .line 2 */
/* .line 3 */
} // :cond_0
(( c.n.g ) p1 ).b ( p0 ); // invoke-virtual {p1, p0}, Lc/n/g;->b(Lc/n/i;)V
return;
} // .end method
public void onStart ( Object p0 ) {
/* .locals 1 */
/* .annotation runtime Lc/n/r; */
/* value = .enum Lc/n/g$a;->ON_START:Lc/n/g$a; */
} // .end annotation
/* .line 1 */
p1 = this.a;
e.b.a.e0.t .a ( p1 );
v0 = } // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_0
/* check-cast v0, Le/b/a/z/n; */
/* .line 2 */
} // :cond_0
return;
} // .end method
public void onStop ( Object p0 ) {
/* .locals 1 */
/* .annotation runtime Lc/n/r; */
/* value = .enum Lc/n/g$a;->ON_STOP:Lc/n/g$a; */
} // .end annotation
/* .line 1 */
p1 = this.a;
e.b.a.e0.t .a ( p1 );
v0 = } // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_0
/* check-cast v0, Le/b/a/z/n; */
/* .line 2 */
} // :cond_0
return;
} // .end method
