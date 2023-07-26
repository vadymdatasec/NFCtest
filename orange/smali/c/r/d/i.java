public class c.r.d.i extends android.animation.AnimatorListenerAdapter {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final androidx.recyclerview.widget.RecyclerView$d0 a; //synthetic
	 public final Integer b; //synthetic
	 public final android.view.View c; //synthetic
	 public final Integer d; //synthetic
	 public final android.view.ViewPropertyAnimator e; //synthetic
	 public final c.r.d.n f; //synthetic
	 /* # direct methods */
	 public c.r.d.i ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.f = p1;
		 this.a = p2;
		 /* iput p3, p0, Lc/r/d/i;->b:I */
		 this.c = p4;
		 /* iput p5, p0, Lc/r/d/i;->d:I */
		 this.e = p6;
		 /* invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onAnimationCancel ( android.animation.Animator p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* iget p1, p0, Lc/r/d/i;->b:I */
		 int v0 = 0; // const/4 v0, 0x0
		 if ( p1 != null) { // if-eqz p1, :cond_0
			 /* .line 2 */
			 p1 = this.c;
			 (( android.view.View ) p1 ).setTranslationX ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationX(F)V
			 /* .line 3 */
		 } // :cond_0
		 /* iget p1, p0, Lc/r/d/i;->d:I */
		 if ( p1 != null) { // if-eqz p1, :cond_1
			 /* .line 4 */
			 p1 = this.c;
			 (( android.view.View ) p1 ).setTranslationY ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationY(F)V
		 } // :cond_1
		 return;
	 } // .end method
	 public void onAnimationEnd ( android.animation.Animator p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 p1 = this.e;
		 int v0 = 0; // const/4 v0, 0x0
		 (( android.view.ViewPropertyAnimator ) p1 ).setListener ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;
		 /* .line 2 */
		 p1 = this.f;
		 v0 = this.a;
		 (( c.r.d.l0 ) p1 ).j ( v0 ); // invoke-virtual {p1, v0}, Lc/r/d/l0;->j(Landroidx/recyclerview/widget/RecyclerView$d0;)V
		 /* .line 3 */
		 p1 = this.f;
		 p1 = this.p;
		 v0 = this.a;
		 (( java.util.ArrayList ) p1 ).remove ( v0 ); // invoke-virtual {p1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
		 /* .line 4 */
		 p1 = this.f;
		 (( c.r.d.n ) p1 ).j ( ); // invoke-virtual {p1}, Lc/r/d/n;->j()V
		 return;
	 } // .end method
	 public void onAnimationStart ( android.animation.Animator p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 p1 = this.f;
		 v0 = this.a;
		 (( c.r.d.l0 ) p1 ).k ( v0 ); // invoke-virtual {p1, v0}, Lc/r/d/l0;->k(Landroidx/recyclerview/widget/RecyclerView$d0;)V
		 return;
	 } // .end method
