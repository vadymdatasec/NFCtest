public abstract class c.l.d.p {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final c.l.d.h3 a;
	 public final c.h.j.c b;
	 /* # direct methods */
	 public c.l.d.p ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.a = p1;
		 /* .line 3 */
		 this.b = p2;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 v0 = this.a;
		 v1 = this.b;
		 (( c.l.d.h3 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lc/l/d/h3;->a(Lc/h/j/c;)V
		 return;
	 } // .end method
	 public c.l.d.h3 b ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.a;
	 } // .end method
	 public c.h.j.c c ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.b;
	 } // .end method
	 public Boolean d ( ) {
		 /* .locals 3 */
		 /* .line 1 */
		 v0 = this.a;
		 /* .line 2 */
		 (( c.l.d.h3 ) v0 ).d ( ); // invoke-virtual {v0}, Lc/l/d/h3;->d()Landroidx/fragment/app/Fragment;
		 v0 = this.I;
		 /* .line 3 */
		 c.l.d.g3 .b ( v0 );
		 /* .line 4 */
		 v1 = this.a;
		 (( c.l.d.h3 ) v1 ).c ( ); // invoke-virtual {v1}, Lc/l/d/h3;->c()Lc/l/d/g3;
		 /* if-eq v0, v1, :cond_1 */
		 /* .line 5 */
		 v2 = c.l.d.g3.c;
		 /* if-eq v0, v2, :cond_0 */
		 /* if-eq v1, v2, :cond_0 */
	 } // :cond_0
	 int v0 = 0; // const/4 v0, 0x0
} // :cond_1
} // :goto_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_1
} // .end method
