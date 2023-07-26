public class c.t.a.d implements android.animation.Animator$AnimatorListener {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final c.t.a.e a; //synthetic
	 public final c.t.a.f b; //synthetic
	 /* # direct methods */
	 public c.t.a.d ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.b = p1;
		 this.a = p2;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onAnimationCancel ( android.animation.Animator p0 ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 public void onAnimationEnd ( android.animation.Animator p0 ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 public void onAnimationRepeat ( android.animation.Animator p0 ) {
		 /* .locals 4 */
		 /* .line 1 */
		 v0 = this.b;
		 v1 = this.a;
		 /* const/high16 v2, 0x3f800000 # 1.0f */
		 int v3 = 1; // const/4 v3, 0x1
		 (( c.t.a.f ) v0 ).a ( v2, v1, v3 ); // invoke-virtual {v0, v2, v1, v3}, Lc/t/a/f;->a(FLc/t/a/e;Z)V
		 /* .line 2 */
		 v0 = this.a;
		 (( c.t.a.e ) v0 ).l ( ); // invoke-virtual {v0}, Lc/t/a/e;->l()V
		 /* .line 3 */
		 v0 = this.a;
		 (( c.t.a.e ) v0 ).j ( ); // invoke-virtual {v0}, Lc/t/a/e;->j()V
		 /* .line 4 */
		 v0 = this.b;
		 /* iget-boolean v1, v0, Lc/t/a/f;->g:Z */
		 if ( v1 != null) { // if-eqz v1, :cond_0
			 int v1 = 0; // const/4 v1, 0x0
			 /* .line 5 */
			 /* iput-boolean v1, v0, Lc/t/a/f;->g:Z */
			 /* .line 6 */
			 (( android.animation.Animator ) p1 ).cancel ( ); // invoke-virtual {p1}, Landroid/animation/Animator;->cancel()V
			 /* const-wide/16 v2, 0x534 */
			 /* .line 7 */
			 (( android.animation.Animator ) p1 ).setDuration ( v2, v3 ); // invoke-virtual {p1, v2, v3}, Landroid/animation/Animator;->setDuration(J)Landroid/animation/Animator;
			 /* .line 8 */
			 (( android.animation.Animator ) p1 ).start ( ); // invoke-virtual {p1}, Landroid/animation/Animator;->start()V
			 /* .line 9 */
			 p1 = this.a;
			 (( c.t.a.e ) p1 ).a ( v1 ); // invoke-virtual {p1, v1}, Lc/t/a/e;->a(Z)V
			 /* .line 10 */
		 } // :cond_0
		 /* iget p1, v0, Lc/t/a/f;->f:F */
		 /* add-float/2addr p1, v2 */
		 /* iput p1, v0, Lc/t/a/f;->f:F */
	 } // :goto_0
	 return;
} // .end method
public void onAnimationStart ( android.animation.Animator p0 ) {
	 /* .locals 1 */
	 /* .line 1 */
	 p1 = this.b;
	 int v0 = 0; // const/4 v0, 0x0
	 /* iput v0, p1, Lc/t/a/f;->f:F */
	 return;
} // .end method
