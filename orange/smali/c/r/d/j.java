public class c.r.d.j extends android.animation.AnimatorListenerAdapter {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final c.r.d.l a; //synthetic
	 public final android.view.ViewPropertyAnimator b; //synthetic
	 public final android.view.View c; //synthetic
	 public final c.r.d.n d; //synthetic
	 /* # direct methods */
	 public c.r.d.j ( ) {
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
	 public void onAnimationEnd ( android.animation.Animator p0 ) {
		 /* .locals 2 */
		 /* .line 1 */
		 p1 = this.b;
		 int v0 = 0; // const/4 v0, 0x0
		 (( android.view.ViewPropertyAnimator ) p1 ).setListener ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;
		 /* .line 2 */
		 p1 = this.c;
		 /* const/high16 v0, 0x3f800000 # 1.0f */
		 (( android.view.View ) p1 ).setAlpha ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V
		 /* .line 3 */
		 p1 = this.c;
		 int v0 = 0; // const/4 v0, 0x0
		 (( android.view.View ) p1 ).setTranslationX ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationX(F)V
		 /* .line 4 */
		 p1 = this.c;
		 (( android.view.View ) p1 ).setTranslationY ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationY(F)V
		 /* .line 5 */
		 p1 = this.d;
		 v0 = this.a;
		 v0 = this.a;
		 int v1 = 1; // const/4 v1, 0x1
		 (( c.r.d.l0 ) p1 ).a ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Lc/r/d/l0;->a(Landroidx/recyclerview/widget/RecyclerView$d0;Z)V
		 /* .line 6 */
		 p1 = this.d;
		 p1 = this.r;
		 v0 = this.a;
		 v0 = this.a;
		 (( java.util.ArrayList ) p1 ).remove ( v0 ); // invoke-virtual {p1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
		 /* .line 7 */
		 p1 = this.d;
		 (( c.r.d.n ) p1 ).j ( ); // invoke-virtual {p1}, Lc/r/d/n;->j()V
		 return;
	 } // .end method
	 public void onAnimationStart ( android.animation.Animator p0 ) {
		 /* .locals 2 */
		 /* .line 1 */
		 p1 = this.d;
		 v0 = this.a;
		 v0 = this.a;
		 int v1 = 1; // const/4 v1, 0x1
		 (( c.r.d.l0 ) p1 ).b ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Lc/r/d/l0;->b(Landroidx/recyclerview/widget/RecyclerView$d0;Z)V
		 return;
	 } // .end method
