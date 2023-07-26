public class e.f.a.c.s.a extends android.animation.AnimatorListenerAdapter {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final Integer a; //synthetic
	 public final com.google.android.material.snackbar.BaseTransientBottomBar b; //synthetic
	 /* # direct methods */
	 public e.f.a.c.s.a ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.b = p1;
		 /* iput p2, p0, Le/f/a/c/s/a;->a:I */
		 /* invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onAnimationEnd ( android.animation.Animator p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 p1 = this.b;
		 /* iget v0, p0, Le/f/a/c/s/a;->a:I */
		 (( com.google.android.material.snackbar.BaseTransientBottomBar ) p1 ).d ( v0 ); // invoke-virtual {p1, v0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->d(I)V
		 return;
	 } // .end method
	 public void onAnimationStart ( android.animation.Animator p0 ) {
		 /* .locals 2 */
		 /* .line 1 */
		 p1 = this.b;
		 com.google.android.material.snackbar.BaseTransientBottomBar .a ( p1 );
		 int v0 = 0; // const/4 v0, 0x0
		 /* const/16 v1, 0xb4 */
		 return;
	 } // .end method
