public class c.b.q.g0 implements android.view.ViewTreeObserver$OnGlobalLayoutListener {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final c.b.q.q0 b; //synthetic
	 /* # direct methods */
	 public c.b.q.g0 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 this.b = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onGlobalLayout ( ) {
		 /* .locals 3 */
		 /* .line 1 */
		 v0 = this.b;
		 v0 = 		 (( c.b.q.q0 ) v0 ).getInternalPopup ( ); // invoke-virtual {v0}, Lc/b/q/q0;->getInternalPopup()Lc/b/q/p0;
		 /* if-nez v0, :cond_0 */
		 /* .line 2 */
		 v0 = this.b;
		 (( c.b.q.q0 ) v0 ).a ( ); // invoke-virtual {v0}, Lc/b/q/q0;->a()V
		 /* .line 3 */
	 } // :cond_0
	 v0 = this.b;
	 (( android.widget.Spinner ) v0 ).getViewTreeObserver ( ); // invoke-virtual {v0}, Landroid/widget/Spinner;->getViewTreeObserver()Landroid/view/ViewTreeObserver;
	 if ( v0 != null) { // if-eqz v0, :cond_2
		 /* .line 4 */
		 /* const/16 v2, 0x10 */
		 /* if-lt v1, v2, :cond_1 */
		 /* .line 5 */
		 (( android.view.ViewTreeObserver ) v0 ).removeOnGlobalLayoutListener ( p0 ); // invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V
		 /* .line 6 */
	 } // :cond_1
	 (( android.view.ViewTreeObserver ) v0 ).removeGlobalOnLayoutListener ( p0 ); // invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V
} // :cond_2
} // :goto_0
return;
} // .end method
