public class c.l.d.g0 implements c.h.j.b {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final androidx.fragment.app.Fragment a; //synthetic
	 /* # direct methods */
	 public c.l.d.g0 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.a = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( ) {
		 /* .locals 3 */
		 /* .line 1 */
		 v0 = this.a;
		 (( androidx.fragment.app.Fragment ) v0 ).j ( ); // invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->j()Landroid/view/View;
		 int v1 = 0; // const/4 v1, 0x0
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 2 */
			 v0 = this.a;
			 (( androidx.fragment.app.Fragment ) v0 ).j ( ); // invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->j()Landroid/view/View;
			 /* .line 3 */
			 v2 = this.a;
			 (( androidx.fragment.app.Fragment ) v2 ).a ( v1 ); // invoke-virtual {v2, v1}, Landroidx/fragment/app/Fragment;->a(Landroid/view/View;)V
			 /* .line 4 */
			 (( android.view.View ) v0 ).clearAnimation ( ); // invoke-virtual {v0}, Landroid/view/View;->clearAnimation()V
			 /* .line 5 */
		 } // :cond_0
		 v0 = this.a;
		 (( androidx.fragment.app.Fragment ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->a(Landroid/animation/Animator;)V
		 return;
	 } // .end method
