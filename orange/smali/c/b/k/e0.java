public class c.b.k.e0 implements c.b.p.b {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public c.b.p.b a;
	 public final c.b.k.n0 b; //synthetic
	 /* # direct methods */
	 public c.b.k.e0 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.b = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.a = p2;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( Object p0 ) {
		 /* .locals 2 */
		 /* .line 3 */
		 v0 = this.a;
		 /* .line 4 */
		 p1 = this.b;
		 v0 = this.r;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 5 */
			 p1 = this.g;
			 (( android.view.Window ) p1 ).getDecorView ( ); // invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;
			 v0 = this.b;
			 v0 = this.s;
			 (( android.view.View ) p1 ).removeCallbacks ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z
			 /* .line 6 */
		 } // :cond_0
		 p1 = this.b;
		 v0 = this.q;
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 /* .line 7 */
			 (( c.b.k.n0 ) p1 ).q ( ); // invoke-virtual {p1}, Lc/b/k/n0;->q()V
			 /* .line 8 */
			 p1 = this.b;
			 v0 = this.q;
			 c.h.n.v0 .a ( v0 );
			 int v1 = 0; // const/4 v1, 0x0
			 (( c.h.n.c1 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lc/h/n/c1;->a(F)Lc/h/n/c1;
			 this.t = v0;
			 /* .line 9 */
			 p1 = this.b;
			 p1 = this.t;
			 /* new-instance v0, Lc/b/k/d0; */
			 /* invoke-direct {v0, p0}, Lc/b/k/d0;-><init>(Lc/b/k/e0;)V */
			 (( c.h.n.c1 ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Lc/h/n/c1;->a(Lc/h/n/d1;)Lc/h/n/c1;
			 /* .line 10 */
		 } // :cond_1
		 p1 = this.b;
		 v0 = this.i;
		 if ( v0 != null) { // if-eqz v0, :cond_2
			 /* .line 11 */
			 p1 = this.p;
			 /* .line 12 */
		 } // :cond_2
		 p1 = this.b;
		 int v0 = 0; // const/4 v0, 0x0
		 this.p = v0;
		 return;
	 } // .end method
	 public Boolean a ( Object p0, android.view.Menu p1 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 p1 = 		 v0 = this.a;
	 } // .end method
	 public Boolean a ( Object p0, android.view.MenuItem p1 ) {
		 /* .locals 1 */
		 /* .line 2 */
		 p1 = 		 v0 = this.a;
	 } // .end method
	 public Boolean b ( Object p0, android.view.Menu p1 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 p1 = 		 v0 = this.a;
	 } // .end method
