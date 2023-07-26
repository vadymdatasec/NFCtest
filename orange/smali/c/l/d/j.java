public class c.l.d.j implements c.h.j.b {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final android.view.View a; //synthetic
	 public final android.view.ViewGroup b; //synthetic
	 public final c.l.d.o c; //synthetic
	 /* # direct methods */
	 public c.l.d.j ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.a = p2;
		 this.b = p3;
		 this.c = p4;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 v0 = this.a;
		 (( android.view.View ) v0 ).clearAnimation ( ); // invoke-virtual {v0}, Landroid/view/View;->clearAnimation()V
		 /* .line 2 */
		 v0 = this.b;
		 v1 = this.a;
		 (( android.view.ViewGroup ) v0 ).endViewTransition ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->endViewTransition(Landroid/view/View;)V
		 /* .line 3 */
		 v0 = this.c;
		 (( c.l.d.p ) v0 ).a ( ); // invoke-virtual {v0}, Lc/l/d/p;->a()V
		 return;
	 } // .end method
