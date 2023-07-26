public class androidx.swiperefreshlayout.widget.SwipeRefreshLayout$e implements android.view.animation.Animation$AnimationListener {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->a(F)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x1 */
/* name = null */
} // .end annotation
/* # instance fields */
public final androidx.swiperefreshlayout.widget.SwipeRefreshLayout a; //synthetic
/* # direct methods */
public androidx.swiperefreshlayout.widget.SwipeRefreshLayout$e ( ) {
/* .locals 0 */
/* .line 1 */
this.a = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onAnimationEnd ( android.view.animation.Animation p0 ) {
/* .locals 1 */
/* .line 1 */
p1 = this.a;
/* iget-boolean v0, p1, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->s:Z */
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
(( androidx.swiperefreshlayout.widget.SwipeRefreshLayout ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->a(Landroid/view/animation/Animation$AnimationListener;)V
} // :cond_0
return;
} // .end method
public void onAnimationRepeat ( android.view.animation.Animation p0 ) {
/* .locals 0 */
return;
} // .end method
public void onAnimationStart ( android.view.animation.Animation p0 ) {
/* .locals 0 */
return;
} // .end method
