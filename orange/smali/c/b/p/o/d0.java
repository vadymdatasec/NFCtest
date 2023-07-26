public class c.b.p.o.d0 implements android.view.ViewTreeObserver$OnGlobalLayoutListener {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final c.b.p.o.f0 b; //synthetic
	 /* # direct methods */
	 public c.b.p.o.d0 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.b = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onGlobalLayout ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.b;
		 v0 = 		 (( c.b.p.o.f0 ) v0 ).b ( ); // invoke-virtual {v0}, Lc/b/p/o/f0;->b()Z
		 if ( v0 != null) { // if-eqz v0, :cond_2
			 v0 = this.b;
			 v0 = this.j;
			 v0 = 			 (( c.b.q.p1 ) v0 ).m ( ); // invoke-virtual {v0}, Lc/b/q/p1;->m()Z
			 /* if-nez v0, :cond_2 */
			 /* .line 2 */
			 v0 = this.b;
			 v0 = this.o;
			 if ( v0 != null) { // if-eqz v0, :cond_1
				 /* .line 3 */
				 v0 = 				 (( android.view.View ) v0 ).isShown ( ); // invoke-virtual {v0}, Landroid/view/View;->isShown()Z
				 /* if-nez v0, :cond_0 */
				 /* .line 4 */
			 } // :cond_0
			 v0 = this.b;
			 v0 = this.j;
			 (( c.b.q.p1 ) v0 ).a ( ); // invoke-virtual {v0}, Lc/b/q/p1;->a()V
			 /* .line 5 */
		 } // :cond_1
	 } // :goto_0
	 v0 = this.b;
	 (( c.b.p.o.f0 ) v0 ).dismiss ( ); // invoke-virtual {v0}, Lc/b/p/o/f0;->dismiss()V
} // :cond_2
} // :goto_1
return;
} // .end method
