public class androidx.swiperefreshlayout.widget.SwipeRefreshLayout$f extends android.view.animation.Animation {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x1 */
/* name = null */
} // .end annotation
/* # instance fields */
public final androidx.swiperefreshlayout.widget.SwipeRefreshLayout b; //synthetic
/* # direct methods */
public androidx.swiperefreshlayout.widget.SwipeRefreshLayout$f ( ) {
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
/* iget-boolean v0, p2, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->K:Z */
/* if-nez v0, :cond_0 */
/* .line 2 */
/* iget v0, p2, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->A:I */
/* iget p2, p2, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->z:I */
p2 = java.lang.Math .abs ( p2 );
/* sub-int/2addr v0, p2 */
/* .line 3 */
} // :cond_0
/* iget v0, p2, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->A:I */
/* .line 4 */
} // :goto_0
p2 = this.b;
/* iget v1, p2, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->x:I */
/* sub-int/2addr v0, v1 */
/* int-to-float v0, v0 */
/* mul-float v0, v0, p1 */
/* float-to-int v0, v0 */
/* add-int/2addr v1, v0 */
/* .line 5 */
p2 = this.v;
p2 = (( android.widget.ImageView ) p2 ).getTop ( ); // invoke-virtual {p2}, Landroid/widget/ImageView;->getTop()I
/* sub-int/2addr v1, p2 */
/* .line 6 */
p2 = this.b;
(( androidx.swiperefreshlayout.widget.SwipeRefreshLayout ) p2 ).setTargetOffsetTopAndBottom ( v1 ); // invoke-virtual {p2, v1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setTargetOffsetTopAndBottom(I)V
/* .line 7 */
p2 = this.b;
p2 = this.C;
/* const/high16 v0, 0x3f800000 # 1.0f */
/* sub-float/2addr v0, p1 */
(( c.t.a.f ) p2 ).a ( v0 ); // invoke-virtual {p2, v0}, Lc/t/a/f;->a(F)V
return;
} // .end method
