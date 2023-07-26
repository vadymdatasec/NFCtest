public class c.b.q.i extends c.b.p.o.y {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final c.b.q.k m; //synthetic
	 /* # direct methods */
	 public c.b.q.i ( ) {
		 /* .locals 6 */
		 /* .line 1 */
		 this.m = p1;
		 /* .line 2 */
		 /* move-object v0, p0 */
		 /* move-object v1, p2 */
		 /* move-object v2, p3 */
		 /* move-object v3, p4 */
		 /* move v4, p5 */
		 /* invoke-direct/range {v0 ..v5}, Lc/b/p/o/y;-><init>(Landroid/content/Context;Lc/b/p/o/m;Landroid/view/View;ZI)V */
		 /* const p2, 0x800005 */
		 /* .line 3 */
		 (( c.b.p.o.y ) p0 ).a ( p2 ); // invoke-virtual {p0, p2}, Lc/b/p/o/y;->a(I)V
		 /* .line 4 */
		 p1 = this.B;
		 (( c.b.p.o.y ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lc/b/p/o/y;->a(Lc/b/p/o/z$a;)V
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void e ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 v0 = this.m;
		 c.b.q.k .a ( v0 );
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 2 */
			 v0 = this.m;
			 c.b.q.k .b ( v0 );
			 (( c.b.p.o.m ) v0 ).close ( ); // invoke-virtual {v0}, Lc/b/p/o/m;->close()V
			 /* .line 3 */
		 } // :cond_0
		 v0 = this.m;
		 int v1 = 0; // const/4 v1, 0x0
		 this.x = v1;
		 /* .line 4 */
		 /* invoke-super {p0}, Lc/b/p/o/y;->e()V */
		 return;
	 } // .end method
