public class c.l.d.i0 implements android.view.animation.Animation$AnimationListener {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final android.view.ViewGroup a; //synthetic
	 public final androidx.fragment.app.Fragment b; //synthetic
	 public final c.l.d.l2 c; //synthetic
	 public final c.h.j.c d; //synthetic
	 /* # direct methods */
	 public c.l.d.i0 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.a = p1;
		 this.b = p2;
		 this.c = p3;
		 this.d = p4;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onAnimationEnd ( android.view.animation.Animation p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 p1 = this.a;
		 /* new-instance v0, Lc/l/d/h0; */
		 /* invoke-direct {v0, p0}, Lc/l/d/h0;-><init>(Lc/l/d/i0;)V */
		 (( android.view.ViewGroup ) p1 ).post ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->post(Ljava/lang/Runnable;)Z
		 return;
	 } // .end method
	 public void onAnimationRepeat ( android.view.animation.Animation p0 ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 public void onAnimationStart ( android.view.animation.Animation p0 ) {
		 /* .locals 0 */
		 return;
	 } // .end method
