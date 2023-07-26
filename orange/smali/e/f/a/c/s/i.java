public class e.f.a.c.s.i implements e.f.a.c.s.n {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final com.google.android.material.snackbar.BaseTransientBottomBar a; //synthetic
	 /* # direct methods */
	 public e.f.a.c.s.i ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.a = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onViewAttachedToWindow ( android.view.View p0 ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 public void onViewDetachedFromWindow ( android.view.View p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 p1 = this.a;
		 p1 = 		 (( com.google.android.material.snackbar.BaseTransientBottomBar ) p1 ).i ( ); // invoke-virtual {p1}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->i()Z
		 if ( p1 != null) { // if-eqz p1, :cond_0
			 /* .line 2 */
			 p1 = com.google.android.material.snackbar.BaseTransientBottomBar.j;
			 /* new-instance v0, Le/f/a/c/s/h; */
			 /* invoke-direct {v0, p0}, Le/f/a/c/s/h;-><init>(Le/f/a/c/s/i;)V */
			 (( android.os.Handler ) p1 ).post ( v0 ); // invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
		 } // :cond_0
		 return;
	 } // .end method
