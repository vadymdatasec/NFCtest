public class inal implements androidx.savedstate.SavedStateRegistry$a {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Landroidx/lifecycle/SavedStateHandleController; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x19 */
/* name = "a" */
} // .end annotation
/* # direct methods */
public inal ( ) {
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void a ( Object p0 ) {
/* .locals 5 */
/* .line 1 */
/* instance-of v0, p1, Lc/n/y; */
if ( v0 != null) { // if-eqz v0, :cond_2
	 /* .line 2 */
	 /* move-object v0, p1 */
	 /* check-cast v0, Lc/n/y; */
	 /* .line 3 */
	 /* .line 4 */
	 (( c.n.x ) v0 ).b ( ); // invoke-virtual {v0}, Lc/n/x;->b()Ljava/util/Set;
v3 = } // :goto_0
if ( v3 != null) { // if-eqz v3, :cond_0
	 /* check-cast v3, Ljava/lang/String; */
	 /* .line 5 */
	 (( c.n.x ) v0 ).a ( v3 ); // invoke-virtual {v0, v3}, Lc/n/x;->a(Ljava/lang/String;)Lc/n/v;
	 /* .line 6 */
	 androidx.lifecycle.SavedStateHandleController .a ( v3,v1,v4 );
	 /* .line 7 */
} // :cond_0
p1 = (( c.n.x ) v0 ).b ( ); // invoke-virtual {v0}, Lc/n/x;->b()Ljava/util/Set;
/* if-nez p1, :cond_1 */
/* .line 8 */
/* const-class p1, Landroidx/lifecycle/SavedStateHandleController$a; */
(( androidx.savedstate.SavedStateRegistry ) v1 ).a ( p1 ); // invoke-virtual {v1, p1}, Landroidx/savedstate/SavedStateRegistry;->a(Ljava/lang/Class;)V
} // :cond_1
return;
/* .line 9 */
} // :cond_2
/* new-instance p1, Ljava/lang/IllegalStateException; */
final String v0 = "Internal error: OnRecreation should be registered only on componentsthat implement ViewModelStoreOwner"; // const-string v0, "Internal error: OnRecreation should be registered only on componentsthat implement ViewModelStoreOwner"
/* invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
stry;)V */
	 (( c.n.g ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Lc/n/g;->a(Lc/n/i;)V
	 /* .line 4 */
} // :cond_1
} // :goto_0
/* const-class p1, Landroidx/lifecycle/SavedStateHandleController$a; */
(( androidx.savedstate.SavedStateRegistry ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Landroidx/savedstate/SavedStateRegistry;->a(Ljava/lang/Class;)V
} // :goto_1
return;
} // .end method
/* # virtual methods */
public void a ( androidx.savedstate.SavedStateRegistry p0, Object p1 ) {
/* .locals 1 */
/* .line 2 */
/* iget-boolean v0, p0, Landroidx/lifecycle/SavedStateHandleController;->b:Z */
/* if-nez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
/* .line 3 */
/* iput-boolean v0, p0, Landroidx/lifecycle/SavedStateHandleController;->b:Z */
/* .line 4 */
(( c.n.g ) p2 ).a ( p0 ); // invoke-virtual {p2, p0}, Lc/n/g;->a(Lc/n/i;)V
/* .line 5 */
p2 = this.a;
v0 = this.c;
(( c.n.u ) v0 ).a ( ); // invoke-virtual {v0}, Lc/n/u;->a()Landroidx/savedstate/SavedStateRegistry$b;
(( androidx.savedstate.SavedStateRegistry ) p1 ).a ( p2, v0 ); // invoke-virtual {p1, p2, v0}, Landroidx/savedstate/SavedStateRegistry;->a(Ljava/lang/String;Landroidx/savedstate/SavedStateRegistry$b;)V
return;
/* .line 6 */
} // :cond_0
/* new-instance p1, Ljava/lang/IllegalStateException; */
final String p2 = "Already attached to lifecycleOwner"; // const-string p2, "Already attached to lifecycleOwner"
/* invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public void a ( Object p0, c.n.g$a p1 ) {
/* .locals 1 */
/* .line 7 */
v0 = c.n.g$a.ON_DESTROY;
/* if-ne p2, v0, :cond_0 */
int p2 = 0; // const/4 p2, 0x0
/* .line 8 */
/* iput-boolean p2, p0, Landroidx/lifecycle/SavedStateHandleController;->b:Z */
/* .line 9 */
(( c.n.g ) p1 ).b ( p0 ); // invoke-virtual {p1, p0}, Lc/n/g;->b(Lc/n/i;)V
} // :cond_0
return;
} // .end method
public Boolean a ( ) {
/* .locals 1 */
/* .line 1 */
/* iget-boolean v0, p0, Landroidx/lifecycle/SavedStateHandleController;->b:Z */
} // .end method
