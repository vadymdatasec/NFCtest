public class c.l.d.j2 implements java.lang.Runnable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final androidx.fragment.app.Fragment b; //synthetic
	 public final androidx.fragment.app.Fragment c; //synthetic
	 public final Boolean d; //synthetic
	 public final c.e.b e; //synthetic
	 public final android.view.View f; //synthetic
	 public final c.l.d.x2 g; //synthetic
	 public final android.graphics.Rect h; //synthetic
	 /* # direct methods */
	 public c.l.d.j2 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.b = p1;
		 this.c = p2;
		 /* iput-boolean p3, p0, Lc/l/d/j2;->d:Z */
		 this.e = p4;
		 this.f = p5;
		 this.g = p6;
		 this.h = p7;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void run ( ) {
		 /* .locals 5 */
		 /* .line 1 */
		 v0 = this.b;
		 v1 = this.c;
		 /* iget-boolean v2, p0, Lc/l/d/j2;->d:Z */
		 v3 = this.e;
		 int v4 = 0; // const/4 v4, 0x0
		 c.l.d.n2 .a ( v0,v1,v2,v3,v4 );
		 /* .line 2 */
		 v0 = this.f;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 3 */
			 v1 = this.g;
			 v2 = this.h;
			 (( c.l.d.x2 ) v1 ).a ( v0, v2 ); // invoke-virtual {v1, v0, v2}, Lc/l/d/x2;->a(Landroid/view/View;Landroid/graphics/Rect;)V
		 } // :cond_0
		 return;
	 } // .end method
