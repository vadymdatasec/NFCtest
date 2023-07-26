public class c.b.k.f implements android.widget.AbsListView$OnScrollListener {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final android.view.View a; //synthetic
	 public final android.view.View b; //synthetic
	 /* # direct methods */
	 public c.b.k.f ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.a = p2;
		 this.b = p3;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onScroll ( android.widget.AbsListView p0, Integer p1, Integer p2, Integer p3 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 p2 = this.a;
		 p3 = this.b;
		 androidx.appcompat.app.AlertController .a ( p1,p2,p3 );
		 return;
	 } // .end method
	 public void onScrollStateChanged ( android.widget.AbsListView p0, Integer p1 ) {
		 /* .locals 0 */
		 return;
	 } // .end method
