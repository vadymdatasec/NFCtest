public class androidx.lifecycle.SavedStateHandleController$1 implements c.n.h {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Landroidx/lifecycle/SavedStateHandleController;->b(Landroidx/savedstate/SavedStateRegistry;Lc/n/g;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x1 */
/* name = null */
} // .end annotation
/* # instance fields */
public final c.n.g a; //synthetic
public final androidx.savedstate.SavedStateRegistry b; //synthetic
/* # direct methods */
public androidx.lifecycle.SavedStateHandleController$1 ( ) {
/* .locals 0 */
/* .line 1 */
this.a = p1;
this.b = p2;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void a ( Object p0, c.n.g$a p1 ) {
/* .locals 0 */
/* .line 1 */
p1 = c.n.g$a.ON_START;
/* if-ne p2, p1, :cond_0 */
/* .line 2 */
p1 = this.a;
(( c.n.g ) p1 ).b ( p0 ); // invoke-virtual {p1, p0}, Lc/n/g;->b(Lc/n/i;)V
/* .line 3 */
p1 = this.b;
/* const-class p2, Landroidx/lifecycle/SavedStateHandleController$a; */
(( androidx.savedstate.SavedStateRegistry ) p1 ).a ( p2 ); // invoke-virtual {p1, p2}, Landroidx/savedstate/SavedStateRegistry;->a(Ljava/lang/Class;)V
} // :cond_0
return;
} // .end method
