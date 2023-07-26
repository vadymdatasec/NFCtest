public class e.f.a.c.s.r implements android.view.View$OnClickListener {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final android.view.View$OnClickListener b; //synthetic
	 public final com.google.android.material.snackbar.Snackbar c; //synthetic
	 /* # direct methods */
	 public e.f.a.c.s.r ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.c = p1;
		 this.b = p2;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onClick ( android.view.View p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.b;
		 /* .line 2 */
		 p1 = this.c;
		 int v0 = 1; // const/4 v0, 0x1
		 (( com.google.android.material.snackbar.BaseTransientBottomBar ) p1 ).b ( v0 ); // invoke-virtual {p1, v0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->b(I)V
		 return;
	 } // .end method
