public class c.b.p.o.d implements android.view.ViewTreeObserver$OnGlobalLayoutListener {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final c.b.p.o.i b; //synthetic
	 /* # direct methods */
	 public c.b.p.o.d ( ) {
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
		 v0 = 		 (( c.b.p.o.i ) v0 ).b ( ); // invoke-virtual {v0}, Lc/b/p/o/i;->b()Z
		 if ( v0 != null) { // if-eqz v0, :cond_2
			 v0 = this.b;
			 v0 = 			 v0 = this.j;
			 /* if-lez v0, :cond_2 */
			 v0 = this.b;
			 v0 = this.j;
			 int v1 = 0; // const/4 v1, 0x0
			 /* .line 2 */
			 /* check-cast v0, Lc/b/p/o/h; */
			 v0 = this.a;
			 v0 = 			 (( c.b.q.p1 ) v0 ).m ( ); // invoke-virtual {v0}, Lc/b/q/p1;->m()Z
			 /* if-nez v0, :cond_2 */
			 /* .line 3 */
			 v0 = this.b;
			 v0 = this.q;
			 if ( v0 != null) { // if-eqz v0, :cond_1
				 /* .line 4 */
				 v0 = 				 (( android.view.View ) v0 ).isShown ( ); // invoke-virtual {v0}, Landroid/view/View;->isShown()Z
				 /* if-nez v0, :cond_0 */
				 /* .line 5 */
			 } // :cond_0
			 v0 = this.b;
			 v0 = this.j;
		 v1 = 		 } // :goto_0
		 if ( v1 != null) { // if-eqz v1, :cond_2
			 /* check-cast v1, Lc/b/p/o/h; */
			 /* .line 6 */
			 v1 = this.a;
			 (( c.b.q.p1 ) v1 ).a ( ); // invoke-virtual {v1}, Lc/b/q/p1;->a()V
			 /* .line 7 */
		 } // :cond_1
	 } // :goto_1
	 v0 = this.b;
	 (( c.b.p.o.i ) v0 ).dismiss ( ); // invoke-virtual {v0}, Lc/b/p/o/i;->dismiss()V
} // :cond_2
return;
} // .end method
