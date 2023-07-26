public class c.b.q.n2 extends c.h.n.e1 {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public Boolean a;
	 public final Integer b; //synthetic
	 public final c.b.q.o2 c; //synthetic
	 /* # direct methods */
	 public c.b.q.n2 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.c = p1;
		 /* iput p2, p0, Lc/b/q/n2;->b:I */
		 /* invoke-direct {p0}, Lc/h/n/e1;-><init>()V */
		 int p1 = 0; // const/4 p1, 0x0
		 /* .line 2 */
		 /* iput-boolean p1, p0, Lc/b/q/n2;->a:Z */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( android.view.View p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* iget-boolean p1, p0, Lc/b/q/n2;->a:Z */
		 /* if-nez p1, :cond_0 */
		 /* .line 2 */
		 p1 = this.c;
		 p1 = this.a;
		 /* iget v0, p0, Lc/b/q/n2;->b:I */
		 (( android.view.ViewGroup ) p1 ).setVisibility ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setVisibility(I)V
	 } // :cond_0
	 return;
} // .end method
public void b ( android.view.View p0 ) {
	 /* .locals 1 */
	 /* .line 1 */
	 p1 = this.c;
	 p1 = this.a;
	 int v0 = 0; // const/4 v0, 0x0
	 (( android.view.ViewGroup ) p1 ).setVisibility ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setVisibility(I)V
	 return;
} // .end method
public void c ( android.view.View p0 ) {
	 /* .locals 0 */
	 int p1 = 1; // const/4 p1, 0x1
	 /* .line 1 */
	 /* iput-boolean p1, p0, Lc/b/q/n2;->a:Z */
	 return;
} // .end method
