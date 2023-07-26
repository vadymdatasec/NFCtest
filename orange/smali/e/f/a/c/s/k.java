public class e.f.a.c.s.k extends android.animation.AnimatorListenerAdapter {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final com.google.android.material.snackbar.BaseTransientBottomBar a; //synthetic
	 /* # direct methods */
	 public e.f.a.c.s.k ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.a = p1;
		 /* invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onAnimationEnd ( android.animation.Animator p0 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 p1 = this.a;
		 (( com.google.android.material.snackbar.BaseTransientBottomBar ) p1 ).j ( ); // invoke-virtual {p1}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->j()V
		 return;
	 } // .end method
	 public void onAnimationStart ( android.animation.Animator p0 ) {
		 /* .locals 2 */
		 /* .line 1 */
		 p1 = this.a;
		 com.google.android.material.snackbar.BaseTransientBottomBar .a ( p1 );
		 /* const/16 v0, 0x46 */
		 /* const/16 v1, 0xb4 */
		 return;
	 } // .end method
