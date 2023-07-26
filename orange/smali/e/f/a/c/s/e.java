public class e.f.a.c.s.e extends c.h.n.d {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final com.google.android.material.snackbar.BaseTransientBottomBar d; //synthetic
	 /* # direct methods */
	 public e.f.a.c.s.e ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.d = p1;
		 /* invoke-direct {p0}, Lc/h/n/d;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( android.view.View p0, Object p1 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-super {p0, p1, p2}, Lc/h/n/d;->a(Landroid/view/View;Lc/h/n/v1/h;)V */
		 /* const/high16 p1, 0x100000 */
		 /* .line 2 */
		 (( c.h.n.v1.h ) p2 ).a ( p1 ); // invoke-virtual {p2, p1}, Lc/h/n/v1/h;->a(I)V
		 int p1 = 1; // const/4 p1, 0x1
		 /* .line 3 */
		 (( c.h.n.v1.h ) p2 ).c ( p1 ); // invoke-virtual {p2, p1}, Lc/h/n/v1/h;->c(Z)V
		 return;
	 } // .end method
	 public Boolean a ( android.view.View p0, Integer p1, android.os.Bundle p2 ) {
		 /* .locals 1 */
		 /* const/high16 v0, 0x100000 */
		 /* if-ne p2, v0, :cond_0 */
		 /* .line 4 */
		 p1 = this.d;
		 (( com.google.android.material.snackbar.BaseTransientBottomBar ) p1 ).b ( ); // invoke-virtual {p1}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->b()V
		 int p1 = 1; // const/4 p1, 0x1
		 /* .line 5 */
	 } // :cond_0
	 p1 = 	 /* invoke-super {p0, p1, p2, p3}, Lc/h/n/d;->a(Landroid/view/View;ILandroid/os/Bundle;)Z */
} // .end method
