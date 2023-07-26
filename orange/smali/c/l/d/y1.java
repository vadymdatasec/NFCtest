public class c.l.d.y1 implements android.view.View$OnAttachStateChangeListener {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final android.view.View b; //synthetic
	 /* # direct methods */
	 public c.l.d.y1 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.b = p2;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onViewAttachedToWindow ( android.view.View p0 ) {
		 /* .locals 0 */
		 /* .line 1 */
		 p1 = this.b;
		 (( android.view.View ) p1 ).removeOnAttachStateChangeListener ( p0 ); // invoke-virtual {p1, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V
		 /* .line 2 */
		 p1 = this.b;
		 c.h.n.v0 .I ( p1 );
		 return;
	 } // .end method
	 public void onViewDetachedFromWindow ( android.view.View p0 ) {
		 /* .locals 0 */
		 return;
	 } // .end method
