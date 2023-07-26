public class c.l.d.i implements android.view.animation.Animation$AnimationListener {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final android.view.ViewGroup a; //synthetic
	 public final android.view.View b; //synthetic
	 public final c.l.d.o c; //synthetic
	 /* # direct methods */
	 public c.l.d.i ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.a = p2;
		 this.b = p3;
		 this.c = p4;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onAnimationEnd ( android.view.animation.Animation p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 p1 = this.a;
		 /* new-instance v0, Lc/l/d/h; */
		 /* invoke-direct {v0, p0}, Lc/l/d/h;-><init>(Lc/l/d/i;)V */
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
