public class androidx.activity.OnBackPressedDispatcher$LifecycleOnBackPressedCancellable implements c.n.h implements c.a.a {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Landroidx/activity/OnBackPressedDispatcher; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x1 */
/* name = "LifecycleOnBackPressedCancellable" */
} // .end annotation
/* # instance fields */
public final c.n.g a;
public final c.a.g b;
public c.a.a c;
public final androidx.activity.OnBackPressedDispatcher d; //synthetic
/* # direct methods */
public androidx.activity.OnBackPressedDispatcher$LifecycleOnBackPressedCancellable ( ) {
/* .locals 0 */
/* .line 1 */
this.d = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
this.a = p2;
/* .line 3 */
this.b = p3;
/* .line 4 */
(( c.n.g ) p2 ).a ( p0 ); // invoke-virtual {p2, p0}, Lc/n/g;->a(Lc/n/i;)V
return;
} // .end method
/* # virtual methods */
public void a ( Object p0, c.n.g$a p1 ) {
/* .locals 0 */
/* .line 1 */
p1 = c.n.g$a.ON_START;
/* if-ne p2, p1, :cond_0 */
/* .line 2 */
p1 = this.d;
p2 = this.b;
(( androidx.activity.OnBackPressedDispatcher ) p1 ).a ( p2 ); // invoke-virtual {p1, p2}, Landroidx/activity/OnBackPressedDispatcher;->a(Lc/a/g;)Lc/a/a;
this.c = p1;
/* .line 3 */
} // :cond_0
p1 = c.n.g$a.ON_STOP;
/* if-ne p2, p1, :cond_1 */
/* .line 4 */
p1 = this.c;
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 5 */
/* .line 6 */
} // :cond_1
p1 = c.n.g$a.ON_DESTROY;
/* if-ne p2, p1, :cond_2 */
/* .line 7 */
(( androidx.activity.OnBackPressedDispatcher$LifecycleOnBackPressedCancellable ) p0 ).cancel ( ); // invoke-virtual {p0}, Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;->cancel()V
} // :cond_2
} // :goto_0
return;
} // .end method
public void cancel ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
(( c.n.g ) v0 ).b ( p0 ); // invoke-virtual {v0, p0}, Lc/n/g;->b(Lc/n/i;)V
/* .line 2 */
v0 = this.b;
(( c.a.g ) v0 ).b ( p0 ); // invoke-virtual {v0, p0}, Lc/a/g;->b(Lc/a/a;)V
/* .line 3 */
v0 = this.c;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 4 */
int v0 = 0; // const/4 v0, 0x0
/* .line 5 */
this.c = v0;
} // :cond_0
return;
} // .end method
