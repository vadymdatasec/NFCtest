public class c.b.q.i1 implements java.lang.Runnable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final c.b.q.p1 b; //synthetic
	 /* # direct methods */
	 public c.b.q.i1 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.b = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void run ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.b;
		 (( c.b.q.p1 ) v0 ).j ( ); // invoke-virtual {v0}, Lc/b/q/p1;->j()Landroid/view/View;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 2 */
			 (( android.view.View ) v0 ).getWindowToken ( ); // invoke-virtual {v0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 /* .line 3 */
				 v0 = this.b;
				 (( c.b.q.p1 ) v0 ).a ( ); // invoke-virtual {v0}, Lc/b/q/p1;->a()V
			 } // :cond_0
			 return;
		 } // .end method
