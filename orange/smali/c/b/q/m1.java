public class c.b.q.m1 implements android.widget.AbsListView$OnScrollListener {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final c.b.q.p1 a; //synthetic
	 /* # direct methods */
	 public c.b.q.m1 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.a = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onScroll ( android.widget.AbsListView p0, Integer p1, Integer p2, Integer p3 ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 public void onScrollStateChanged ( android.widget.AbsListView p0, Integer p1 ) {
		 /* .locals 0 */
		 int p1 = 1; // const/4 p1, 0x1
		 /* if-ne p2, p1, :cond_0 */
		 /* .line 1 */
		 p1 = this.a;
		 /* .line 2 */
		 p1 = 		 (( c.b.q.p1 ) p1 ).l ( ); // invoke-virtual {p1}, Lc/b/q/p1;->l()Z
		 /* if-nez p1, :cond_0 */
		 p1 = this.a;
		 p1 = this.F;
		 (( android.widget.PopupWindow ) p1 ).getContentView ( ); // invoke-virtual {p1}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;
		 if ( p1 != null) { // if-eqz p1, :cond_0
			 /* .line 3 */
			 p1 = this.a;
			 p2 = this.B;
			 p1 = this.x;
			 (( android.os.Handler ) p2 ).removeCallbacks ( p1 ); // invoke-virtual {p2, p1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V
			 /* .line 4 */
			 p1 = this.a;
			 p1 = this.x;
			 (( c.b.q.o1 ) p1 ).run ( ); // invoke-virtual {p1}, Lc/b/q/o1;->run()V
		 } // :cond_0
		 return;
	 } // .end method
