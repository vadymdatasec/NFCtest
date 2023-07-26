public class c.b.q.k0 implements android.view.ViewTreeObserver$OnGlobalLayoutListener {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final c.b.q.m0 b; //synthetic
	 /* # direct methods */
	 public c.b.q.k0 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.b = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onGlobalLayout ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 v0 = this.b;
		 v1 = this.N;
		 v0 = 		 (( c.b.q.m0 ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lc/b/q/m0;->b(Landroid/view/View;)Z
		 /* if-nez v0, :cond_0 */
		 /* .line 2 */
		 v0 = this.b;
		 (( c.b.q.p1 ) v0 ).dismiss ( ); // invoke-virtual {v0}, Lc/b/q/p1;->dismiss()V
		 /* .line 3 */
	 } // :cond_0
	 v0 = this.b;
	 (( c.b.q.m0 ) v0 ).o ( ); // invoke-virtual {v0}, Lc/b/q/m0;->o()V
	 /* .line 4 */
	 v0 = this.b;
	 c.b.q.m0 .a ( v0 );
} // :goto_0
return;
} // .end method
