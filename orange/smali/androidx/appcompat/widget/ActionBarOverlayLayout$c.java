public class androidx.appcompat.widget.ActionBarOverlayLayout$c implements java.lang.Runnable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Landroidx/appcompat/widget/ActionBarOverlayLayout; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x1 */
/* name = null */
} // .end annotation
/* # instance fields */
public final androidx.appcompat.widget.ActionBarOverlayLayout b; //synthetic
/* # direct methods */
public androidx.appcompat.widget.ActionBarOverlayLayout$c ( ) {
/* .locals 0 */
/* .line 1 */
this.b = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 3 */
/* .line 1 */
v0 = this.b;
(( androidx.appcompat.widget.ActionBarOverlayLayout ) v0 ).i ( ); // invoke-virtual {v0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->i()V
/* .line 2 */
v0 = this.b;
v1 = this.e;
(( android.widget.FrameLayout ) v1 ).animate ( ); // invoke-virtual {v1}, Landroid/widget/FrameLayout;->animate()Landroid/view/ViewPropertyAnimator;
v2 = this.b;
v2 = this.e;
/* .line 3 */
v2 = (( android.widget.FrameLayout ) v2 ).getHeight ( ); // invoke-virtual {v2}, Landroid/widget/FrameLayout;->getHeight()I
/* neg-int v2, v2 */
/* int-to-float v2, v2 */
(( android.view.ViewPropertyAnimator ) v1 ).translationY ( v2 ); // invoke-virtual {v1, v2}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;
v2 = this.b;
v2 = this.y;
/* .line 4 */
(( android.view.ViewPropertyAnimator ) v1 ).setListener ( v2 ); // invoke-virtual {v1, v2}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;
this.x = v1;
return;
} // .end method
