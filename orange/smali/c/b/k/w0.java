public class c.b.k.w0 extends c.b.p.n {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final c.b.k.x0 c; //synthetic
	 /* # direct methods */
	 public c.b.k.w0 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.c = p1;
		 /* .line 2 */
		 /* invoke-direct {p0, p2}, Lc/b/p/n;-><init>(Landroid/view/Window$Callback;)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public android.view.View onCreatePanelView ( Integer p0 ) {
		 /* .locals 1 */
		 /* if-nez p1, :cond_0 */
		 /* .line 1 */
		 /* new-instance p1, Landroid/view/View; */
		 v0 = this.c;
		 v0 = this.a;
		 /* invoke-direct {p1, v0}, Landroid/view/View;-><init>(Landroid/content/Context;)V */
		 /* .line 2 */
	 } // :cond_0
	 /* invoke-super {p0, p1}, Lc/b/p/n;->onCreatePanelView(I)Landroid/view/View; */
} // .end method
public Boolean onPreparePanel ( Integer p0, android.view.View p1, android.view.Menu p2 ) {
	 /* .locals 0 */
	 /* .line 1 */
	 p1 = 	 /* invoke-super {p0, p1, p2, p3}, Lc/b/p/n;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z */
	 if ( p1 != null) { // if-eqz p1, :cond_0
		 /* .line 2 */
		 p2 = this.c;
		 /* iget-boolean p3, p2, Lc/b/k/x0;->b:Z */
		 /* if-nez p3, :cond_0 */
		 /* .line 3 */
		 p2 = this.a;
		 /* .line 4 */
		 p2 = this.c;
		 int p3 = 1; // const/4 p3, 0x1
		 /* iput-boolean p3, p2, Lc/b/k/x0;->b:Z */
	 } // :cond_0
} // .end method
