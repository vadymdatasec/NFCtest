public class androidx.swiperefreshlayout.widget.SwipeRefreshLayout$h extends android.view.animation.Animation {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->c(ILandroid/view/animation/Animation$AnimationListener;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x1 */
/* name = null */
} // .end annotation
/* # instance fields */
public final androidx.swiperefreshlayout.widget.SwipeRefreshLayout b; //synthetic
/* # direct methods */
public androidx.swiperefreshlayout.widget.SwipeRefreshLayout$h ( ) {
/* .locals 0 */
/* .line 1 */
this.b = p1;
/* invoke-direct {p0}, Landroid/view/animation/Animation;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void applyTransformation ( Float p0, android.view.animation.Transformation p1 ) {
/* .locals 2 */
/* .line 1 */
p2 = this.b;
/* iget v0, p2, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->y:F */
/* neg-float v1, v0 */
/* mul-float v1, v1, p1 */
/* add-float/2addr v0, v1 */
/* .line 2 */
(( androidx.swiperefreshlayout.widget.SwipeRefreshLayout ) p2 ).setAnimationProgress ( v0 ); // invoke-virtual {p2, v0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setAnimationProgress(F)V
/* .line 3 */
p2 = this.b;
(( androidx.swiperefreshlayout.widget.SwipeRefreshLayout ) p2 ).c ( p1 ); // invoke-virtual {p2, p1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->c(F)V
return;
} // .end method
