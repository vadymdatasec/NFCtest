public class c.v.p1 extends android.animation.AnimatorListenerAdapter implements c.v.j0 implements c.v.a {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final android.view.View a;
	 public final Integer b;
	 public final android.view.ViewGroup c;
	 public final Boolean d;
	 public Boolean e;
	 public Boolean f;
	 /* # direct methods */
	 public c.v.p1 ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 2 */
		 /* iput-boolean v0, p0, Lc/v/p1;->f:Z */
		 /* .line 3 */
		 this.a = p1;
		 /* .line 4 */
		 /* iput p2, p0, Lc/v/p1;->b:I */
		 /* .line 5 */
		 (( android.view.View ) p1 ).getParent ( ); // invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
		 /* check-cast p1, Landroid/view/ViewGroup; */
		 this.c = p1;
		 /* .line 6 */
		 /* iput-boolean p3, p0, Lc/v/p1;->d:Z */
		 int p1 = 1; // const/4 p1, 0x1
		 /* .line 7 */
		 (( c.v.p1 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/v/p1;->a(Z)V
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final void a ( ) {
		 /* .locals 2 */
		 /* .line 2 */
		 /* iget-boolean v0, p0, Lc/v/p1;->f:Z */
		 /* if-nez v0, :cond_0 */
		 /* .line 3 */
		 v0 = this.a;
		 /* iget v1, p0, Lc/v/p1;->b:I */
		 c.v.j1 .a ( v0,v1 );
		 /* .line 4 */
		 v0 = this.c;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 5 */
			 (( android.view.ViewGroup ) v0 ).invalidate ( ); // invoke-virtual {v0}, Landroid/view/ViewGroup;->invalidate()V
		 } // :cond_0
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 6 */
		 (( c.v.p1 ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lc/v/p1;->a(Z)V
		 return;
	 } // .end method
	 public void a ( c.v.k0 p0 ) {
		 /* .locals 0 */
		 int p1 = 0; // const/4 p1, 0x0
		 /* .line 1 */
		 (( c.v.p1 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/v/p1;->a(Z)V
		 return;
	 } // .end method
	 public final void a ( Boolean p0 ) {
		 /* .locals 1 */
		 /* .line 7 */
		 /* iget-boolean v0, p0, Lc/v/p1;->d:Z */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* iget-boolean v0, p0, Lc/v/p1;->e:Z */
			 /* if-eq v0, p1, :cond_0 */
			 v0 = this.c;
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 /* .line 8 */
				 /* iput-boolean p1, p0, Lc/v/p1;->e:Z */
				 /* .line 9 */
				 c.v.z0 .a ( v0,p1 );
			 } // :cond_0
			 return;
		 } // .end method
		 public void b ( c.v.k0 p0 ) {
			 /* .locals 0 */
			 int p1 = 1; // const/4 p1, 0x1
			 /* .line 1 */
			 (( c.v.p1 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/v/p1;->a(Z)V
			 return;
		 } // .end method
		 public void c ( c.v.k0 p0 ) {
			 /* .locals 0 */
			 return;
		 } // .end method
		 public void d ( c.v.k0 p0 ) {
			 /* .locals 0 */
			 /* .line 1 */
			 (( c.v.p1 ) p0 ).a ( ); // invoke-virtual {p0}, Lc/v/p1;->a()V
			 /* .line 2 */
			 (( c.v.k0 ) p1 ).b ( p0 ); // invoke-virtual {p1, p0}, Lc/v/k0;->b(Lc/v/j0;)Lc/v/k0;
			 return;
		 } // .end method
		 public void onAnimationCancel ( android.animation.Animator p0 ) {
			 /* .locals 0 */
			 int p1 = 1; // const/4 p1, 0x1
			 /* .line 1 */
			 /* iput-boolean p1, p0, Lc/v/p1;->f:Z */
			 return;
		 } // .end method
		 public void onAnimationEnd ( android.animation.Animator p0 ) {
			 /* .locals 0 */
			 /* .line 1 */
			 (( c.v.p1 ) p0 ).a ( ); // invoke-virtual {p0}, Lc/v/p1;->a()V
			 return;
		 } // .end method
		 public void onAnimationPause ( android.animation.Animator p0 ) {
			 /* .locals 1 */
			 /* .line 1 */
			 /* iget-boolean p1, p0, Lc/v/p1;->f:Z */
			 /* if-nez p1, :cond_0 */
			 /* .line 2 */
			 p1 = this.a;
			 /* iget v0, p0, Lc/v/p1;->b:I */
			 c.v.j1 .a ( p1,v0 );
		 } // :cond_0
		 return;
	 } // .end method
	 public void onAnimationRepeat ( android.animation.Animator p0 ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 public void onAnimationResume ( android.animation.Animator p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* iget-boolean p1, p0, Lc/v/p1;->f:Z */
		 /* if-nez p1, :cond_0 */
		 /* .line 2 */
		 p1 = this.a;
		 int v0 = 0; // const/4 v0, 0x0
		 c.v.j1 .a ( p1,v0 );
	 } // :cond_0
	 return;
} // .end method
public void onAnimationStart ( android.animation.Animator p0 ) {
	 /* .locals 0 */
	 return;
} // .end method
