public class androidx.swiperefreshlayout.widget.SwipeRefreshLayout$a implements android.view.animation.Animation$AnimationListener {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x1 */
/* name = null */
} // .end annotation
/* # instance fields */
public final androidx.swiperefreshlayout.widget.SwipeRefreshLayout a; //synthetic
/* # direct methods */
public androidx.swiperefreshlayout.widget.SwipeRefreshLayout$a ( ) {
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
/* iget-boolean v0, p1, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->d:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
	 /* .line 2 */
	 p1 = this.C;
	 /* const/16 v0, 0xff */
	 (( c.t.a.f ) p1 ).setAlpha ( v0 ); // invoke-virtual {p1, v0}, Lc/t/a/f;->setAlpha(I)V
	 /* .line 3 */
	 p1 = this.a;
	 p1 = this.C;
	 (( c.t.a.f ) p1 ).start ( ); // invoke-virtual {p1}, Lc/t/a/f;->start()V
	 /* .line 4 */
	 p1 = this.a;
	 /* iget-boolean v0, p1, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->I:Z */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 5 */
		 p1 = this.c;
		 if ( p1 != null) { // if-eqz p1, :cond_0
			 /* .line 6 */
			 /* .line 7 */
		 } // :cond_0
		 p1 = this.a;
		 v0 = this.v;
		 v0 = 		 (( android.widget.ImageView ) v0 ).getTop ( ); // invoke-virtual {v0}, Landroid/widget/ImageView;->getTop()I
		 /* iput v0, p1, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->n:I */
		 /* .line 8 */
	 } // :cond_1
	 (( androidx.swiperefreshlayout.widget.SwipeRefreshLayout ) p1 ).d ( ); // invoke-virtual {p1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->d()V
} // :goto_0
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
