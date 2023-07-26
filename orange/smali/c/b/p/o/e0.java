public class c.b.p.o.e0 implements android.view.View$OnAttachStateChangeListener {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final c.b.p.o.f0 b; //synthetic
	 /* # direct methods */
	 public c.b.p.o.e0 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.b = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onViewAttachedToWindow ( android.view.View p0 ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 public void onViewDetachedFromWindow ( android.view.View p0 ) {
		 /* .locals 2 */
		 /* .line 1 */
		 v0 = this.b;
		 v0 = this.q;
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 /* .line 2 */
			 v0 = 			 (( android.view.ViewTreeObserver ) v0 ).isAlive ( ); // invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->isAlive()Z
			 /* if-nez v0, :cond_0 */
			 v0 = this.b;
			 (( android.view.View ) p1 ).getViewTreeObserver ( ); // invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;
			 this.q = v1;
			 /* .line 3 */
		 } // :cond_0
		 v0 = this.b;
		 v1 = this.q;
		 v0 = this.k;
		 (( android.view.ViewTreeObserver ) v1 ).removeGlobalOnLayoutListener ( v0 ); // invoke-virtual {v1, v0}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V
		 /* .line 4 */
	 } // :cond_1
	 (( android.view.View ) p1 ).removeOnAttachStateChangeListener ( p0 ); // invoke-virtual {p1, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V
	 return;
} // .end method
