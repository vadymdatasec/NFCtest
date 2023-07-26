public class c.l.d.k implements java.lang.Runnable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final c.l.d.h3 b; //synthetic
	 public final c.l.d.h3 c; //synthetic
	 public final Boolean d; //synthetic
	 public final c.e.b e; //synthetic
	 /* # direct methods */
	 public c.l.d.k ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.b = p2;
		 this.c = p3;
		 /* iput-boolean p4, p0, Lc/l/d/k;->d:Z */
		 this.e = p5;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void run ( ) {
		 /* .locals 5 */
		 /* .line 1 */
		 v0 = this.b;
		 /* .line 2 */
		 (( c.l.d.h3 ) v0 ).d ( ); // invoke-virtual {v0}, Lc/l/d/h3;->d()Landroidx/fragment/app/Fragment;
		 v1 = this.c;
		 (( c.l.d.h3 ) v1 ).d ( ); // invoke-virtual {v1}, Lc/l/d/h3;->d()Landroidx/fragment/app/Fragment;
		 /* iget-boolean v2, p0, Lc/l/d/k;->d:Z */
		 v3 = this.e;
		 int v4 = 0; // const/4 v4, 0x0
		 /* .line 3 */
		 c.l.d.n2 .a ( v0,v1,v2,v3,v4 );
		 return;
	 } // .end method
