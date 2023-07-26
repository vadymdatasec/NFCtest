public class androidx.fragment.app.Fragment$5 implements c.n.h {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Landroidx/fragment/app/Fragment;->h(Landroid/os/Bundle;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x1 */
/* name = null */
} // .end annotation
/* # instance fields */
public final androidx.fragment.app.Fragment a; //synthetic
/* # direct methods */
public androidx.fragment.app.Fragment$5 ( ) {
/* .locals 0 */
/* .line 1 */
this.a = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void a ( Object p0, c.n.g$a p1 ) {
/* .locals 0 */
/* .line 1 */
p1 = c.n.g$a.ON_STOP;
/* if-ne p2, p1, :cond_0 */
/* .line 2 */
p1 = this.a;
p1 = this.I;
if ( p1 != null) { // if-eqz p1, :cond_0
	 /* .line 3 */
	 (( android.view.View ) p1 ).cancelPendingInputEvents ( ); // invoke-virtual {p1}, Landroid/view/View;->cancelPendingInputEvents()V
} // :cond_0
return;
} // .end method
