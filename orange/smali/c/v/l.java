public class c.v.l extends android.animation.AnimatorListenerAdapter {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public Boolean a;
	 public final android.view.View b; //synthetic
	 public final android.graphics.Rect c; //synthetic
	 public final Integer d; //synthetic
	 public final Integer e; //synthetic
	 public final Integer f; //synthetic
	 public final Integer g; //synthetic
	 /* # direct methods */
	 public c.v.l ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.b = p2;
		 this.c = p3;
		 /* iput p4, p0, Lc/v/l;->d:I */
		 /* iput p5, p0, Lc/v/l;->e:I */
		 /* iput p6, p0, Lc/v/l;->f:I */
		 /* iput p7, p0, Lc/v/l;->g:I */
		 /* invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onAnimationCancel ( android.animation.Animator p0 ) {
		 /* .locals 0 */
		 int p1 = 1; // const/4 p1, 0x1
		 /* .line 1 */
		 /* iput-boolean p1, p0, Lc/v/l;->a:Z */
		 return;
	 } // .end method
	 public void onAnimationEnd ( android.animation.Animator p0 ) {
		 /* .locals 4 */
		 /* .line 1 */
		 /* iget-boolean p1, p0, Lc/v/l;->a:Z */
		 /* if-nez p1, :cond_0 */
		 /* .line 2 */
		 p1 = this.b;
		 v0 = this.c;
		 c.h.n.v0 .a ( p1,v0 );
		 /* .line 3 */
		 p1 = this.b;
		 /* iget v0, p0, Lc/v/l;->d:I */
		 /* iget v1, p0, Lc/v/l;->e:I */
		 /* iget v2, p0, Lc/v/l;->f:I */
		 /* iget v3, p0, Lc/v/l;->g:I */
		 c.v.j1 .a ( p1,v0,v1,v2,v3 );
	 } // :cond_0
	 return;
} // .end method
