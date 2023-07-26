public abstract class c.a.g {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public Boolean a;
	 public java.util.concurrent.CopyOnWriteArrayList b;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/concurrent/CopyOnWriteArrayList<", */
	 /* "Lc/a/a;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
/* # direct methods */
public c.a.g ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
/* new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList; */
/* invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V */
this.b = v0;
/* .line 3 */
/* iput-boolean p1, p0, Lc/a/g;->a:Z */
return;
} // .end method
/* # virtual methods */
public abstract void a ( ) {
} // .end method
public void a ( Object p0 ) {
/* .locals 1 */
/* .line 2 */
v0 = this.b;
(( java.util.concurrent.CopyOnWriteArrayList ) v0 ).add ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z
return;
} // .end method
public final void a ( Boolean p0 ) {
/* .locals 0 */
/* .line 1 */
/* iput-boolean p1, p0, Lc/a/g;->a:Z */
return;
} // .end method
public void b ( Object p0 ) {
/* .locals 1 */
/* .line 2 */
v0 = this.b;
(( java.util.concurrent.CopyOnWriteArrayList ) v0 ).remove ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z
return;
} // .end method
public final Boolean b ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Lc/a/g;->a:Z */
} // .end method
public final void c ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.b;
(( java.util.concurrent.CopyOnWriteArrayList ) v0 ).iterator ( ); // invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_0
/* check-cast v1, Lc/a/a; */
/* .line 2 */
} // :cond_0
return;
} // .end method
