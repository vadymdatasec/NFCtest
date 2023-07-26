public class androidx.activity.ComponentActivity$3 implements c.n.h {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Landroidx/activity/ComponentActivity;-><init>()V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x1 */
/* name = null */
} // .end annotation
/* # instance fields */
public final androidx.activity.ComponentActivity a; //synthetic
/* # direct methods */
public androidx.activity.ComponentActivity$3 ( ) {
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
/* if-ne p2, p1, :cond_1 */
/* .line 2 */
p1 = this.a;
(( android.app.Activity ) p1 ).getWindow ( ); // invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;
if ( p1 != null) { // if-eqz p1, :cond_0
	 /* .line 3 */
	 (( android.view.Window ) p1 ).peekDecorView ( ); // invoke-virtual {p1}, Landroid/view/Window;->peekDecorView()Landroid/view/View;
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 4 */
(( android.view.View ) p1 ).cancelPendingInputEvents ( ); // invoke-virtual {p1}, Landroid/view/View;->cancelPendingInputEvents()V
} // :cond_1
return;
} // .end method
