public class androidx.swiperefreshlayout.widget.SwipeRefreshLayout$d extends android.view.animation.Animation {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->a(II)Landroid/view/animation/Animation; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x1 */
/* name = null */
} // .end annotation
/* # instance fields */
public final Integer b; //synthetic
public final Integer c; //synthetic
public final androidx.swiperefreshlayout.widget.SwipeRefreshLayout d; //synthetic
/* # direct methods */
public androidx.swiperefreshlayout.widget.SwipeRefreshLayout$d ( ) {
/* .locals 0 */
/* .line 1 */
this.d = p1;
/* iput p2, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$d;->b:I */
/* iput p3, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$d;->c:I */
/* invoke-direct {p0}, Landroid/view/animation/Animation;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void applyTransformation ( Float p0, android.view.animation.Transformation p1 ) {
/* .locals 3 */
/* .line 1 */
p2 = this.d;
p2 = this.C;
/* iget v0, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$d;->b:I */
/* int-to-float v1, v0 */
/* iget v2, p0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$d;->c:I */
/* sub-int/2addr v2, v0 */
/* int-to-float v0, v2 */
/* mul-float v0, v0, p1 */
/* add-float/2addr v1, v0 */
/* float-to-int p1, v1 */
(( c.t.a.f ) p2 ).setAlpha ( p1 ); // invoke-virtual {p2, p1}, Lc/t/a/f;->setAlpha(I)V
return;
} // .end method
