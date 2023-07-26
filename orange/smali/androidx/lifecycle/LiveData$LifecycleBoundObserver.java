public class androidx.lifecycle.LiveData$LifecycleBoundObserver extends androidx.lifecycle.LiveData$b implements c.n.h {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Landroidx/lifecycle/LiveData; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x1 */
/* name = "LifecycleBoundObserver" */
} // .end annotation
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Landroidx/lifecycle/LiveData<", */
/* "TT;>.b;", */
/* "Lc/n/h;" */
/* } */
} // .end annotation
/* # instance fields */
public final c.n.j e;
public final androidx.lifecycle.LiveData f; //synthetic
/* # virtual methods */
public void a ( ) {
/* .locals 1 */
/* .line 6 */
v0 = this.e;
(( c.n.g ) v0 ).b ( p0 ); // invoke-virtual {v0, p0}, Lc/n/g;->b(Lc/n/i;)V
return;
} // .end method
public void a ( Object p0, c.n.g$a p1 ) {
/* .locals 1 */
/* .line 1 */
p1 = this.e;
(( c.n.g ) p1 ).a ( ); // invoke-virtual {p1}, Lc/n/g;->a()Lc/n/g$b;
/* .line 2 */
p2 = c.n.g$b.b;
/* if-ne p1, p2, :cond_0 */
/* .line 3 */
p1 = this.f;
p2 = this.a;
(( androidx.lifecycle.LiveData ) p1 ).b ( p2 ); // invoke-virtual {p1, p2}, Landroidx/lifecycle/LiveData;->b(Lc/n/q;)V
return;
} // :cond_0
int p2 = 0; // const/4 p2, 0x0
} // :goto_0
/* if-eq p2, p1, :cond_1 */
/* .line 4 */
p2 = (( androidx.lifecycle.LiveData$LifecycleBoundObserver ) p0 ).b ( ); // invoke-virtual {p0}, Landroidx/lifecycle/LiveData$LifecycleBoundObserver;->b()Z
(( androidx.lifecycle.LiveData$b ) p0 ).a ( p2 ); // invoke-virtual {p0, p2}, Landroidx/lifecycle/LiveData$b;->a(Z)V
/* .line 5 */
p2 = this.e;
(( c.n.g ) p2 ).a ( ); // invoke-virtual {p2}, Lc/n/g;->a()Lc/n/g$b;
/* move-object v0, p2 */
/* move-object p2, p1 */
/* move-object p1, v0 */
} // :cond_1
return;
} // .end method
public Boolean b ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.e;
(( c.n.g ) v0 ).a ( ); // invoke-virtual {v0}, Lc/n/g;->a()Lc/n/g$b;
v1 = c.n.g$b.e;
v0 = (( c.n.g$b ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lc/n/g$b;->a(Lc/n/g$b;)Z
} // .end method
