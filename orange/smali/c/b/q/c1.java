public class c.b.q.c1 implements java.lang.Runnable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final c.b.q.d1 b; //synthetic
	 /* # direct methods */
	 public c.b.q.c1 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.b = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 v0 = this.b;
		 int v1 = 0; // const/4 v1, 0x0
		 this.o = v1;
		 /* .line 2 */
		 (( android.widget.ListView ) v0 ).removeCallbacks ( p0 ); // invoke-virtual {v0, p0}, Landroid/widget/ListView;->removeCallbacks(Ljava/lang/Runnable;)Z
		 return;
	 } // .end method
	 public void b ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.b;
		 (( android.widget.ListView ) v0 ).post ( p0 ); // invoke-virtual {v0, p0}, Landroid/widget/ListView;->post(Ljava/lang/Runnable;)Z
		 return;
	 } // .end method
	 public void run ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 v0 = this.b;
		 int v1 = 0; // const/4 v1, 0x0
		 this.o = v1;
		 /* .line 2 */
		 (( c.b.q.d1 ) v0 ).drawableStateChanged ( ); // invoke-virtual {v0}, Lc/b/q/d1;->drawableStateChanged()V
		 return;
	 } // .end method
