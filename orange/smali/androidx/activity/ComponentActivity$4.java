public class androidx.activity.ComponentActivity$4 implements c.n.h {
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
public androidx.activity.ComponentActivity$4 ( ) {
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
p1 = c.n.g$a.ON_DESTROY;
/* if-ne p2, p1, :cond_0 */
/* .line 2 */
p1 = this.a;
p1 = this.c;
(( c.a.j.a ) p1 ).a ( ); // invoke-virtual {p1}, Lc/a/j/a;->a()V
/* .line 3 */
p1 = this.a;
p1 = (( android.app.Activity ) p1 ).isChangingConfigurations ( ); // invoke-virtual {p1}, Landroid/app/Activity;->isChangingConfigurations()Z
/* if-nez p1, :cond_0 */
/* .line 4 */
p1 = this.a;
(( androidx.activity.ComponentActivity ) p1 ).f ( ); // invoke-virtual {p1}, Landroidx/activity/ComponentActivity;->f()Lc/n/x;
(( c.n.x ) p1 ).a ( ); // invoke-virtual {p1}, Lc/n/x;->a()V
} // :cond_0
return;
} // .end method
