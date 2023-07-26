public class c.r.d.h extends android.animation.AnimatorListenerAdapter {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final androidx.recyclerview.widget.RecyclerView$d0 a; //synthetic
	 public final android.view.View b; //synthetic
	 public final android.view.ViewPropertyAnimator c; //synthetic
	 public final c.r.d.n d; //synthetic
	 /* # direct methods */
	 public c.r.d.h ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.d = p1;
		 this.a = p2;
		 this.b = p3;
		 this.c = p4;
		 /* invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onAnimationCancel ( android.animation.Animator p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 p1 = this.b;
		 /* const/high16 v0, 0x3f800000 # 1.0f */
		 (( android.view.View ) p1 ).setAlpha ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V
		 return;
	 } // .end method
	 public void onAnimationEnd ( android.animation.Animator p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 p1 = this.c;
		 int v0 = 0; // const/4 v0, 0x0
		 (( android.view.ViewPropertyAnimator ) p1 ).setListener ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;
		 /* .line 2 */
		 p1 = this.d;
		 v0 = this.a;
		 (( c.r.d.l0 ) p1 ).h ( v0 ); // invoke-virtual {p1, v0}, Lc/r/d/l0;->h(Landroidx/recyclerview/widget/RecyclerView$d0;)V
		 /* .line 3 */
		 p1 = this.d;
		 p1 = this.o;
		 v0 = this.a;
		 (( java.util.ArrayList ) p1 ).remove ( v0 ); // invoke-virtual {p1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
		 /* .line 4 */
		 p1 = this.d;
		 (( c.r.d.n ) p1 ).j ( ); // invoke-virtual {p1}, Lc/r/d/n;->j()V
		 return;
	 } // .end method
	 public void onAnimationStart ( android.animation.Animator p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 p1 = this.d;
		 v0 = this.a;
		 (( c.r.d.l0 ) p1 ).i ( v0 ); // invoke-virtual {p1, v0}, Lc/r/d/l0;->i(Landroidx/recyclerview/widget/RecyclerView$d0;)V
		 return;
	 } // .end method
