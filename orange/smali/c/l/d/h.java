public class c.l.d.h implements java.lang.Runnable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final c.l.d.i b; //synthetic
	 /* # direct methods */
	 public c.l.d.h ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.b = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void run ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 v0 = this.b;
		 v1 = this.a;
		 v0 = this.b;
		 (( android.view.ViewGroup ) v1 ).endViewTransition ( v0 ); // invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->endViewTransition(Landroid/view/View;)V
		 /* .line 2 */
		 v0 = this.b;
		 v0 = this.c;
		 (( c.l.d.p ) v0 ).a ( ); // invoke-virtual {v0}, Lc/l/d/p;->a()V
		 return;
	 } // .end method
